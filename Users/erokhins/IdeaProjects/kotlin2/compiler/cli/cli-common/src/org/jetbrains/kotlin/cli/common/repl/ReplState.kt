'lock' @ [33:41] ==> public abstract val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[PropertyDescriptorImpl]

'read' @ [33:46] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> ReplHistoryRecord<T>?): ReplHistoryRecord<T>? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>?

'lastOrNull' @ [33:53] ==> public fun <T> List<ReplHistoryRecord<T>>.lastOrNull(): ReplHistoryRecord<T>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'lock' @ [39:59] ==> public abstract val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[PropertyDescriptorImpl]

'write' @ [39:64] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> ReplHistoryRecord<T>?): ReplHistoryRecord<T>? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>?

'if (lastOrNull()?.id == id) pop()
        else null' @ [40:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReplHistoryRecord<T>?, elseBranch: ReplHistoryRecord<T>?): ReplHistoryRecord<T>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReplHistoryRecord<T>?

'lastOrNull' @ [40:13] ==> public fun <T> List<ReplHistoryRecord<T>>.lastOrNull(): ReplHistoryRecord<T>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'id' @ [40:27] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'id' @ [40:33] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory.verifiedPop[ValueParameterDescriptorImpl]

'pop' @ [40:37] ==> public abstract fun pop(): ReplHistoryRecord<T>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'history' @ [58:32] ==> public abstract val history: IReplStageHistory<T> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'peek' @ [58:40] ==> public open fun peek(): ReplHistoryRecord<T>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'id' @ [58:48] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'no' @ [58:52] ==> public abstract val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ILineId[PropertyDescriptorImpl]

'let' @ [58:56] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'it' @ [58:62] ==> value-parameter it: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState.getNextLineNo.<anonymous>[ValueParameterDescriptorImpl]

'REPL_CODE_LINE_FIRST_NO' @ [58:74] ==> public const val REPL_CODE_LINE_FIRST_NO: Int defined in org.jetbrains.kotlin.cli.common.repl in file ReplApi.kt[PropertyDescriptorImpl]

'if (target.isAssignableFrom(this::class.java)) this as StateT
            else throw IllegalArgumentException("$this is not an expected instance of IReplStageState")' @ [61:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StateT, elseBranch: StateT): StateT[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StateT

'target' @ [61:17] ==> value-parameter target: Class<out StateT> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState.asState[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [61:24] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'this' @ [61:41] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[LazyClassReceiverParameterDescriptor]

'java' @ [61:53] ==> public val <T> KClass<out IReplStageState<T>>.java: Class<out IReplStageState<T>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IReplStageState<T>

'this' @ [61:60] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[LazyClassReceiverParameterDescriptor]

'IllegalArgumentException' @ [62:24] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'this' @ [62:51] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[LazyClassReceiverParameterDescriptor]

'lock' @ [67:9] ==> public abstract val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[PropertyDescriptorImpl]

'read' @ [67:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Pair<ReplHistoryRecord<T>, ILineId>?): Pair<ReplHistoryRecord<T>, ILineId>? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplHistoryRecord<T>, ILineId>?

'iterator' @ [68:13] ==> public abstract fun iterator(): Iterator<ReplHistoryRecord<T>> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [68:24] ==> public fun <T> Iterator<ReplHistoryRecord<T>>.asSequence(): Sequence<ReplHistoryRecord<T>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'zip' @ [68:37] ==> public infix fun <T, R> Sequence<ReplHistoryRecord<T>>.zip(other: Sequence<ILineId>): Sequence<Pair<ReplHistoryRecord<T>, ILineId>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>
    <R> -> ILineId

'other' @ [68:41] ==> value-parameter other: Sequence<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatch[ValueParameterDescriptorImpl]

'asSequence' @ [68:47] ==> @InlineOnly public inline fun <T> Sequence<ILineId>.asSequence(): Sequence<ILineId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'firstOrNull' @ [68:61] ==> public inline fun <T> Sequence<Pair<ReplHistoryRecord<T>, ILineId>>.firstOrNull(predicate: (Pair<ReplHistoryRecord<T>, ILineId>) -> Boolean): Pair<ReplHistoryRecord<T>, ILineId>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplHistoryRecord<T>, ILineId>

'it' @ [68:75] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatch.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [68:78] ==> public final val first: ReplHistoryRecord<T> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'id' @ [68:84] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'it' @ [68:90] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatch.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [68:93] ==> public final val second: ILineId defined in kotlin.Pair[DeserializedPropertyDescriptor]

'let' @ [68:103] ==> @InlineOnly public inline fun <T, R> Pair<ReplHistoryRecord<T>, ILineId>.let(block: (Pair<ReplHistoryRecord<T>, ILineId>) -> Pair<ReplHistoryRecord<T>, ILineId>): Pair<ReplHistoryRecord<T>, ILineId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplHistoryRecord<T>, ILineId>
    <R> -> Pair<ReplHistoryRecord<T>, ILineId>

'it' @ [68:109] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatch.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [68:112] ==> public final val first: ReplHistoryRecord<T> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [68:121] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatch.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [68:124] ==> public final val second: ILineId defined in kotlin.Pair[DeserializedPropertyDescriptor]

'lock' @ [72:9] ==> public abstract val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[PropertyDescriptorImpl]

'read' @ [72:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Pair<ReplHistoryRecord<T>, ILineId>?): Pair<ReplHistoryRecord<T>, ILineId>? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplHistoryRecord<T>, ILineId>?

'iterator' @ [73:13] ==> public abstract fun iterator(): Iterator<ReplHistoryRecord<T>> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [73:24] ==> public fun <T> Iterator<ReplHistoryRecord<T>>.asSequence(): Sequence<ReplHistoryRecord<T>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'filter' @ [73:37] ==> public fun <T> Sequence<ReplHistoryRecord<T>>.filter(predicate: (ReplHistoryRecord<T>) -> Boolean): Sequence<ReplHistoryRecord<T>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'predicate' @ [73:44] ==> value-parameter predicate: (ReplHistoryRecord<T>) -> Boolean defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchFiltered[ValueParameterDescriptorImpl]

'zip' @ [73:55] ==> public infix fun <T, R> Sequence<ReplHistoryRecord<T>>.zip(other: Sequence<ILineId>): Sequence<Pair<ReplHistoryRecord<T>, ILineId>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>
    <R> -> ILineId

'other' @ [73:59] ==> value-parameter other: Sequence<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchFiltered[ValueParameterDescriptorImpl]

'asSequence' @ [73:65] ==> @InlineOnly public inline fun <T> Sequence<ILineId>.asSequence(): Sequence<ILineId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'firstOrNull' @ [73:79] ==> public inline fun <T> Sequence<Pair<ReplHistoryRecord<T>, ILineId>>.firstOrNull(predicate: (Pair<ReplHistoryRecord<T>, ILineId>) -> Boolean): Pair<ReplHistoryRecord<T>, ILineId>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplHistoryRecord<T>, ILineId>

'it' @ [73:93] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchFiltered.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [73:96] ==> public final val first: ReplHistoryRecord<T> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'id' @ [73:102] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'it' @ [73:108] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchFiltered.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [73:111] ==> public final val second: ILineId defined in kotlin.Pair[DeserializedPropertyDescriptor]

'let' @ [73:121] ==> @InlineOnly public inline fun <T, R> Pair<ReplHistoryRecord<T>, ILineId>.let(block: (Pair<ReplHistoryRecord<T>, ILineId>) -> Pair<ReplHistoryRecord<T>, ILineId>): Pair<ReplHistoryRecord<T>, ILineId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplHistoryRecord<T>, ILineId>
    <R> -> Pair<ReplHistoryRecord<T>, ILineId>

'it' @ [73:127] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchFiltered.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [73:130] ==> public final val first: ReplHistoryRecord<T> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [73:139] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchFiltered.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [73:142] ==> public final val second: ILineId defined in kotlin.Pair[DeserializedPropertyDescriptor]

'lock' @ [77:9] ==> public abstract val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[PropertyDescriptorImpl]

'read' @ [77:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Pair<ReplHistoryRecord<T>, ILineId>?): Pair<ReplHistoryRecord<T>, ILineId>? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplHistoryRecord<T>, ILineId>?

'iterator' @ [78:13] ==> public abstract fun iterator(): Iterator<ReplHistoryRecord<T>> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [78:24] ==> public fun <T> Iterator<ReplHistoryRecord<T>>.asSequence(): Sequence<ReplHistoryRecord<T>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'takeWhile' @ [78:37] ==> public fun <T> Sequence<ReplHistoryRecord<T>>.takeWhile(predicate: (ReplHistoryRecord<T>) -> Boolean): Sequence<ReplHistoryRecord<T>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>

'predicate' @ [78:47] ==> value-parameter predicate: (ReplHistoryRecord<T>) -> Boolean defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchWhile[ValueParameterDescriptorImpl]

'zip' @ [78:58] ==> public infix fun <T, R> Sequence<ReplHistoryRecord<T>>.zip(other: Sequence<ILineId>): Sequence<Pair<ReplHistoryRecord<T>, ILineId>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<T>
    <R> -> ILineId

'other' @ [78:62] ==> value-parameter other: Sequence<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchWhile[ValueParameterDescriptorImpl]

'asSequence' @ [78:68] ==> @InlineOnly public inline fun <T> Sequence<ILineId>.asSequence(): Sequence<ILineId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'firstOrNull' @ [78:82] ==> public inline fun <T> Sequence<Pair<ReplHistoryRecord<T>, ILineId>>.firstOrNull(predicate: (Pair<ReplHistoryRecord<T>, ILineId>) -> Boolean): Pair<ReplHistoryRecord<T>, ILineId>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplHistoryRecord<T>, ILineId>

'it' @ [78:96] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchWhile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [78:99] ==> public final val first: ReplHistoryRecord<T> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'id' @ [78:105] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'it' @ [78:111] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchWhile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [78:114] ==> public final val second: ILineId defined in kotlin.Pair[DeserializedPropertyDescriptor]

'let' @ [78:124] ==> @InlineOnly public inline fun <T, R> Pair<ReplHistoryRecord<T>, ILineId>.let(block: (Pair<ReplHistoryRecord<T>, ILineId>) -> Pair<ReplHistoryRecord<T>, ILineId>): Pair<ReplHistoryRecord<T>, ILineId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplHistoryRecord<T>, ILineId>
    <R> -> Pair<ReplHistoryRecord<T>, ILineId>

'it' @ [78:130] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchWhile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [78:133] ==> public final val first: ReplHistoryRecord<T> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [78:142] ==> value-parameter it: Pair<ReplHistoryRecord<T>, ILineId> defined in org.jetbrains.kotlin.cli.common.repl.firstMismatchWhile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [78:145] ==> public final val second: ILineId defined in kotlin.Pair[DeserializedPropertyDescriptor]

