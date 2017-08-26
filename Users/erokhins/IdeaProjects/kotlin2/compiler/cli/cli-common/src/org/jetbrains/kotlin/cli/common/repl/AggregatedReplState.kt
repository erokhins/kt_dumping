'ReentrantReadWriteLock' @ [26:53] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'AbstractList<ReplHistoryRecord<Pair<T1, T2>>>' @ [27:38] ==> protected constructor AbstractList<out E>() defined in kotlin.collections.AbstractList[DeserializedClassConstructorDescriptor]
Inferred types:
    <out E> -> ReplHistoryRecord<Pair<T1, T2>>

'minOf' @ [30:17] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Int, b: Int): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]

'history1' @ [30:23] ==> private final val history1: IReplStageHistory<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'size' @ [30:32] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'history2' @ [30:38] ==> private final val history2: IReplStageHistory<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'size' @ [30:47] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'lock' @ [33:9] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'write' @ [33:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertSameSize' @ [34:13] ==> private final fun assertSameSize(): Unit defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[SimpleFunctionDescriptorImpl]

'history1' @ [35:13] ==> private final val history1: IReplStageHistory<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'push' @ [35:22] ==> public abstract fun push(id: ILineId, item: T1): Unit defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'id' @ [35:27] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.push[ValueParameterDescriptorImpl]

'item' @ [35:31] ==> value-parameter item: Pair<T1, T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.push[ValueParameterDescriptorImpl]

'first' @ [35:36] ==> public final val first: T1 defined in kotlin.Pair[DeserializedPropertyDescriptor]

'history2' @ [36:13] ==> private final val history2: IReplStageHistory<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'push' @ [36:22] ==> public abstract fun push(id: ILineId, item: T2): Unit defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'id' @ [36:27] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.push[ValueParameterDescriptorImpl]

'item' @ [36:31] ==> value-parameter item: Pair<T1, T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.push[ValueParameterDescriptorImpl]

'second' @ [36:36] ==> public final val second: T2 defined in kotlin.Pair[DeserializedPropertyDescriptor]

'lock' @ [40:69] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'read' @ [40:74] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> ReplHistoryRecord<Pair<T1, T2>>): ReplHistoryRecord<Pair<T1, T2>> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<Pair<T1, T2>>

'assertSameSize' @ [41:9] ==> private final fun assertSameSize(): Unit defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[SimpleFunctionDescriptorImpl]

'history1' @ [42:18] ==> private final val history1: IReplStageHistory<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'index' @ [42:27] ==> value-parameter index: Int defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.get[ValueParameterDescriptorImpl]

'history2' @ [43:18] ==> private final val history2: IReplStageHistory<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'index' @ [43:27] ==> value-parameter index: Int defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.get[ValueParameterDescriptorImpl]

'assertSameId' @ [44:9] ==> private final fun assertSameId(r1: ReplHistoryRecord<T1>, r2: ReplHistoryRecord<T2>): Unit defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[SimpleFunctionDescriptorImpl]

'r1' @ [44:22] ==> val r1: ReplHistoryRecord<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.get.<anonymous>[LocalVariableDescriptor]

'r2' @ [44:26] ==> val r2: ReplHistoryRecord<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.get.<anonymous>[LocalVariableDescriptor]

'ReplHistoryRecord' @ [45:9] ==> public constructor ReplHistoryRecord<out T>(id: ILineId, item: Pair<T1, T2>) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Pair<T1, T2>

'r1' @ [45:27] ==> val r1: ReplHistoryRecord<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.get.<anonymous>[LocalVariableDescriptor]

'id' @ [45:30] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'r1' @ [45:34] ==> val r1: ReplHistoryRecord<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.get.<anonymous>[LocalVariableDescriptor]

'item' @ [45:37] ==> public final val item: T1 defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'r2' @ [45:45] ==> val r2: ReplHistoryRecord<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.get.<anonymous>[LocalVariableDescriptor]

'item' @ [45:48] ==> public final val item: T2 defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'lock' @ [48:60] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'write' @ [48:65] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> ReplHistoryRecord<Pair<T1, T2>>): ReplHistoryRecord<Pair<T1, T2>> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<Pair<T1, T2>>

'assertSameSize' @ [49:9] ==> private final fun assertSameSize(): Unit defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[SimpleFunctionDescriptorImpl]

'history1' @ [50:18] ==> private final val history1: IReplStageHistory<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'pop' @ [50:27] ==> public abstract fun pop(): ReplHistoryRecord<T1>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'history2' @ [51:18] ==> private final val history2: IReplStageHistory<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'pop' @ [51:27] ==> public abstract fun pop(): ReplHistoryRecord<T2>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'r1' @ [52:13] ==> val r1: ReplHistoryRecord<T1>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'r2' @ [52:27] ==> val r2: ReplHistoryRecord<T2>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'r1' @ [53:13] ==> val r1: ReplHistoryRecord<T1>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'r2' @ [53:27] ==> val r2: ReplHistoryRecord<T2>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [53:45] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'r1' @ [53:98] ==> val r1: ReplHistoryRecord<T1>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'r2' @ [53:105] ==> val r2: ReplHistoryRecord<T2>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'assertSameId' @ [54:9] ==> private final fun assertSameId(r1: ReplHistoryRecord<T1>, r2: ReplHistoryRecord<T2>): Unit defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[SimpleFunctionDescriptorImpl]

'r1' @ [54:22] ==> val r1: ReplHistoryRecord<T1>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'r2' @ [54:26] ==> val r2: ReplHistoryRecord<T2>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'ReplHistoryRecord' @ [55:9] ==> public constructor ReplHistoryRecord<out T>(id: ILineId, item: Pair<T1, T2>) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Pair<T1, T2>

'r1' @ [55:27] ==> val r1: ReplHistoryRecord<T1>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'id' @ [55:30] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'r1' @ [55:34] ==> val r1: ReplHistoryRecord<T1>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'item' @ [55:37] ==> public final val item: T1 defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'r2' @ [55:45] ==> val r2: ReplHistoryRecord<T2>? defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.pop.<anonymous>[LocalVariableDescriptor]

'item' @ [55:48] ==> public final val item: T2 defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'lock' @ [58:47] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'write' @ [58:52] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> List<ILineId>): List<ILineId> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<ILineId>

'assertSameSize' @ [59:9] ==> private final fun assertSameSize(): Unit defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[SimpleFunctionDescriptorImpl]

'history1' @ [60:18] ==> private final val history1: IReplStageHistory<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'reset' @ [60:27] ==> public abstract fun reset(): Iterable<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'toList' @ [60:35] ==> public fun <T> Iterable<ILineId>.toList(): List<ILineId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'history2' @ [61:18] ==> private final val history2: IReplStageHistory<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'reset' @ [61:27] ==> public abstract fun reset(): Iterable<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'toList' @ [61:35] ==> public fun <T> Iterable<ILineId>.toList(): List<ILineId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'i1' @ [62:13] ==> val i1: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.reset.<anonymous>[LocalVariableDescriptor]

'i2' @ [62:19] ==> val i2: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.reset.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [62:29] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'i1' @ [62:94] ==> val i1: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.reset.<anonymous>[LocalVariableDescriptor]

'i2' @ [62:101] ==> val i2: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.reset.<anonymous>[LocalVariableDescriptor]

'i1' @ [63:9] ==> val i1: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.reset.<anonymous>[LocalVariableDescriptor]

'lock' @ [66:60] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'write' @ [66:65] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> List<ILineId>): List<ILineId> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<ILineId>

'assertSameSize' @ [67:9] ==> private final fun assertSameSize(): Unit defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[SimpleFunctionDescriptorImpl]

'history1' @ [68:18] ==> private final val history1: IReplStageHistory<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'resetTo' @ [68:27] ==> public abstract fun resetTo(id: ILineId): Iterable<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'id' @ [68:35] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.resetTo[ValueParameterDescriptorImpl]

'toList' @ [68:39] ==> public fun <T> Iterable<ILineId>.toList(): List<ILineId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'history2' @ [69:18] ==> private final val history2: IReplStageHistory<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'resetTo' @ [69:27] ==> public abstract fun resetTo(id: ILineId): Iterable<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'id' @ [69:35] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.resetTo[ValueParameterDescriptorImpl]

'toList' @ [69:39] ==> public fun <T> Iterable<ILineId>.toList(): List<ILineId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'i1' @ [70:13] ==> val i1: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'i2' @ [70:19] ==> val i2: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [70:29] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'i1' @ [70:94] ==> val i1: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'i2' @ [70:101] ==> val i2: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'i1' @ [71:9] ==> val i1: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'history1' @ [75:13] ==> private final val history1: IReplStageHistory<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'size' @ [75:22] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'history2' @ [75:30] ==> private final val history2: IReplStageHistory<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'size' @ [75:39] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'IllegalStateException' @ [75:51] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'history1' @ [75:111] ==> private final val history1: IReplStageHistory<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'size' @ [75:120] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'history2' @ [75:131] ==> private final val history2: IReplStageHistory<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[PropertyDescriptorImpl]

'size' @ [75:140] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'r1' @ [79:13] ==> value-parameter r1: ReplHistoryRecord<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.assertSameId[ValueParameterDescriptorImpl]

'id' @ [79:16] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'r2' @ [79:22] ==> value-parameter r2: ReplHistoryRecord<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.assertSameId[ValueParameterDescriptorImpl]

'id' @ [79:25] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'IllegalStateException' @ [79:35] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'r1' @ [79:89] ==> value-parameter r1: ReplHistoryRecord<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.assertSameId[ValueParameterDescriptorImpl]

'id' @ [79:92] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'r2' @ [79:101] ==> value-parameter r2: ReplHistoryRecord<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory.assertSameId[ValueParameterDescriptorImpl]

'id' @ [79:104] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'ReentrantReadWriteLock' @ [83:161] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'AggregatedReplStateHistory' @ [86:61] ==> public constructor AggregatedReplStateHistory<T1, T2>(history1: IReplStageHistory<T1>, history2: IReplStageHistory<T2>, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStateHistory[ClassConstructorDescriptorImpl]
Inferred types:
    <T1> -> T1
    <T2> -> T2

'state1' @ [86:88] ==> public final val state1: IReplStageState<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [86:95] ==> public abstract val history: IReplStageHistory<T1> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'state2' @ [86:104] ==> public final val state2: IReplStageState<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [86:111] ==> public abstract val history: IReplStageHistory<T2> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'lock' @ [86:120] ==> public final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'when {
                target.isAssignableFrom(state1::class.java) -> state1 as StateT
                target.isAssignableFrom(state2::class.java) -> state2 as StateT
                else -> super.asState(target)
            }' @ [89:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: StateT, entry1: StateT, entry2: StateT): StateT[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> StateT

'target' @ [90:17] ==> value-parameter target: Class<out StateT> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState.asState[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [90:24] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'state1' @ [90:41] ==> public final val state1: IReplStageState<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'java' @ [90:55] ==> public val <T> KClass<out IReplStageState<T1>>.java: Class<out IReplStageState<T1>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out IReplStageState<T1>)

'state1' @ [90:64] ==> public final val state1: IReplStageState<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'target' @ [91:17] ==> value-parameter target: Class<out StateT> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState.asState[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [91:24] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'state2' @ [91:41] ==> public final val state2: IReplStageState<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'java' @ [91:55] ==> public val <T> KClass<out IReplStageState<T2>>.java: Class<out IReplStageState<T2>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out IReplStageState<T2>)

'state2' @ [91:64] ==> public final val state2: IReplStageState<T2> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'super' @ [92:25] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[LazyClassReceiverParameterDescriptor]

'asState' @ [92:31] ==> public open fun <StateT : IReplStageState<*>> asState(target: Class<out StateT>): StateT defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[SimpleFunctionDescriptorImpl]
Inferred types:
    <StateT : IReplStageState<*>> -> StateT

'target' @ [92:39] ==> value-parameter target: Class<out StateT> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState.asState[ValueParameterDescriptorImpl]

'state1' @ [95:36] ==> public final val state1: IReplStageState<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'getNextLineNo' @ [95:43] ==> public open fun getNextLineNo(): Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[SimpleFunctionDescriptorImpl]

'state1' @ [97:49] ==> public final val state1: IReplStageState<T1> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'currentGeneration' @ [97:56] ==> public abstract val currentGeneration: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

