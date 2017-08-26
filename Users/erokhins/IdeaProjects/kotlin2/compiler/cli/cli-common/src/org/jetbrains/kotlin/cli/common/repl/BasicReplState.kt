'this' @ [27:42] ==> public constructor LineId(no: Int, generation: Int, codeHash: Int) defined in org.jetbrains.kotlin.cli.common.repl.LineId[ClassConstructorDescriptorImpl]

'codeLine' @ [27:47] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.LineId.<init>[ValueParameterDescriptorImpl]

'no' @ [27:56] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'codeLine' @ [27:60] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.LineId.<init>[ValueParameterDescriptorImpl]

'generation' @ [27:69] ==> public final val generation: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'codeLine' @ [27:81] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.LineId.<init>[ValueParameterDescriptorImpl]

'code' @ [27:90] ==> public final val code: String defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'hashCode' @ [27:95] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'?:' @ [29:51] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Int?, right: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Int

'other' @ [29:52] ==> value-parameter other: ILineId defined in org.jetbrains.kotlin.cli.common.repl.LineId.compareTo[ValueParameterDescriptorImpl]

'let' @ [29:71] ==> @InlineOnly public inline fun <T, R> LineId.let(block: (LineId) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LineId
    <R> -> Int

'no' @ [30:9] ==> public open val no: Int defined in org.jetbrains.kotlin.cli.common.repl.LineId[PropertyDescriptorImpl]

'compareTo' @ [30:12] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [30:22] ==> value-parameter it: LineId defined in org.jetbrains.kotlin.cli.common.repl.LineId.compareTo.<anonymous>[ValueParameterDescriptorImpl]

'no' @ [30:25] ==> public open val no: Int defined in org.jetbrains.kotlin.cli.common.repl.LineId[PropertyDescriptorImpl]

'takeIf' @ [30:29] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [30:38] ==> value-parameter it: Int defined in org.jetbrains.kotlin.cli.common.repl.LineId.compareTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'generation' @ [31:12] ==> public open val generation: Int defined in org.jetbrains.kotlin.cli.common.repl.LineId[PropertyDescriptorImpl]

'compareTo' @ [31:23] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [31:33] ==> value-parameter it: LineId defined in org.jetbrains.kotlin.cli.common.repl.LineId.compareTo.<anonymous>[ValueParameterDescriptorImpl]

'generation' @ [31:36] ==> public open val generation: Int defined in org.jetbrains.kotlin.cli.common.repl.LineId[PropertyDescriptorImpl]

'takeIf' @ [31:48] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [31:57] ==> value-parameter it: Int defined in org.jetbrains.kotlin.cli.common.repl.LineId.compareTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'codeHash' @ [32:12] ==> private final val codeHash: Int defined in org.jetbrains.kotlin.cli.common.repl.LineId[PropertyDescriptorImpl]

'compareTo' @ [32:21] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [32:31] ==> value-parameter it: LineId defined in org.jetbrains.kotlin.cli.common.repl.LineId.compareTo.<anonymous>[ValueParameterDescriptorImpl]

'codeHash' @ [32:34] ==> private final val codeHash: Int defined in org.jetbrains.kotlin.cli.common.repl.LineId[PropertyDescriptorImpl]

'-' @ [33:10] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ReentrantReadWriteLock' @ [40:81] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'ArrayList<ReplHistoryRecord<T>>' @ [40:131] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ReplHistoryRecord<T>

'AtomicInteger' @ [42:29] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'REPL_CODE_LINE_FIRST_GEN' @ [42:43] ==> public const val REPL_CODE_LINE_FIRST_GEN: Int defined in org.jetbrains.kotlin.cli.common.repl in file ReplApi.kt[PropertyDescriptorImpl]

'lock' @ [45:9] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[PropertyDescriptorImpl]

'write' @ [45:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Boolean): Boolean defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'add' @ [46:13] ==> public open fun add(element: ReplHistoryRecord<T>): Boolean defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[JavaMethodDescriptor]

'ReplHistoryRecord' @ [46:17] ==> public constructor ReplHistoryRecord<out T>(id: ILineId, item: T) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> T

'id' @ [46:35] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.push[ValueParameterDescriptorImpl]

'item' @ [46:39] ==> value-parameter item: T defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.push[ValueParameterDescriptorImpl]

'lock' @ [50:49] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[PropertyDescriptorImpl]

'write' @ [50:54] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> ReplHistoryRecord<T>?): ReplHistoryRecord<T>? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>?

'if (isEmpty()) null else removeAt(lastIndex)' @ [50:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReplHistoryRecord<T>?, elseBranch: ReplHistoryRecord<T>?): ReplHistoryRecord<T>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReplHistoryRecord<T>?

'isEmpty' @ [50:66] ==> public open fun isEmpty(): Boolean defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[DeserializedSimpleFunctionDescriptor]

'removeAt' @ [50:87] ==> public open fun removeAt(p0: Int): ReplHistoryRecord<T> defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[JavaMethodDescriptor]

'lastIndex' @ [50:96] ==> public val <T> List<ReplHistoryRecord<T>>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'lock' @ [53:9] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[PropertyDescriptorImpl]

'write' @ [53:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Nothing): Nothing defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing

'map' @ [54:27] ==> public inline fun <T, R> Iterable<ReplHistoryRecord<T>>.map(transform: (ReplHistoryRecord<T>) -> ILineId): List<ILineId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>
    <R> -> ILineId

'it' @ [54:33] ==> value-parameter it: ReplHistoryRecord<T> defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.reset.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [54:36] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'clear' @ [55:13] ==> public open fun clear(): Unit defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[JavaMethodDescriptor]

'removed' @ [56:20] ==> val removed: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.reset.<anonymous>[LocalVariableDescriptor]

'lock' @ [61:9] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[PropertyDescriptorImpl]

'write' @ [61:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Nothing): Nothing defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing

'indexOfFirst' @ [62:23] ==> public inline fun <T> List<ReplHistoryRecord<T>>.indexOfFirst(predicate: (ReplHistoryRecord<T>) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'it' @ [62:38] ==> value-parameter it: ReplHistoryRecord<T> defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.resetTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [62:41] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'id' @ [62:47] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.resetTo[ValueParameterDescriptorImpl]

'idx' @ [63:17] ==> val idx: Int defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'NoSuchElementException' @ [63:42] ==> public constructor NoSuchElementException(p0: (String..String?)) defined in java.util.NoSuchElementException[JavaClassConstructorDescriptor]

'id' @ [63:99] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.resetTo[ValueParameterDescriptorImpl]

'no' @ [63:102] ==> public abstract val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ILineId[PropertyDescriptorImpl]

'if (idx < lastIndex) {
                val removed = asSequence().drop(idx + 1).map { it.id }.toList()
                removeRange(idx + 1, size)
                currentGeneration.incrementAndGet()
                removed
            }
            else emptyList()' @ [64:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Iterable<ILineId>, elseBranch: Iterable<ILineId>): Iterable<ILineId>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Iterable<ILineId>

'idx' @ [64:24] ==> val idx: Int defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'lastIndex' @ [64:30] ==> public val <T> List<ReplHistoryRecord<T>>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'asSequence' @ [65:31] ==> public fun <T> Iterable<ReplHistoryRecord<T>>.asSequence(): Sequence<ReplHistoryRecord<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'drop' @ [65:44] ==> public fun <T> Sequence<ReplHistoryRecord<T>>.drop(n: Int): Sequence<ReplHistoryRecord<T>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'idx' @ [65:49] ==> val idx: Int defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'map' @ [65:58] ==> public fun <T, R> Sequence<ReplHistoryRecord<T>>.map(transform: (ReplHistoryRecord<T>) -> ILineId): Sequence<ILineId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>
    <R> -> ILineId

'it' @ [65:64] ==> value-parameter it: ReplHistoryRecord<T> defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.resetTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [65:67] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'toList' @ [65:72] ==> public fun <T> Sequence<ILineId>.toList(): List<ILineId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'removeRange' @ [66:17] ==> protected/*protected and package*/ open fun removeRange(p0: Int, p1: Int): Unit defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[JavaMethodDescriptor]

'idx' @ [66:29] ==> val idx: Int defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'size' @ [66:38] ==> public open val size: Int defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[DeserializedPropertyDescriptor]

'currentGeneration' @ [67:17] ==> public final val currentGeneration: AtomicInteger defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[PropertyDescriptorImpl]

'incrementAndGet' @ [67:35] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'removed' @ [68:17] ==> val removed: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory.resetTo.<anonymous>[LocalVariableDescriptor]

'emptyList' @ [70:18] ==> public fun <T> emptyList(): List<ILineId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'ReentrantReadWriteLock' @ [75:96] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'history' @ [77:49] ==> public open val history: BasicReplStageHistory<HistoryItemT> defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageState[PropertyDescriptorImpl]

'currentGeneration' @ [77:57] ==> public final val currentGeneration: AtomicInteger defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[PropertyDescriptorImpl]

'get' @ [77:75] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'BasicReplStageHistory' @ [79:65] ==> public constructor BasicReplStageHistory<T>(lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> HistoryItemT

'lock' @ [79:87] ==> public final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageState[PropertyDescriptorImpl]

