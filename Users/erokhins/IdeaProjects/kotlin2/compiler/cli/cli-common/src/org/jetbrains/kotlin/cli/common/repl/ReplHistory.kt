'emptyList' @ [34:64] ==> public fun <T> emptyList(): List<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<CompiledReplCodeLine, T>

'ArrayDeque' @ [35:54] ==> public constructor ArrayDeque<E : (Any..Any?)>(p0: (MutableCollection<out (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>..Collection<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>?)) defined in java.util.ArrayDeque[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<CompiledReplCodeLine, T>

'startingHistory' @ [35:65] ==> value-parameter startingHistory: CompiledHistoryList<T> /* = List<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ = ... defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.<init>[ValueParameterDescriptorImpl]

'history' @ [37:30] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'isEmpty' @ [37:38] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'history' @ [38:33] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'isNotEmpty' @ [38:41] ==> @InlineOnly public inline fun <T> Collection<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)

'history' @ [41:9] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'add' @ [41:17] ==> public open fun add(element: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)): Boolean defined in java.util.ArrayDeque[JavaMethodDescriptor]

'line' @ [41:21] ==> value-parameter line: CompiledReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.add[ValueParameterDescriptorImpl]

'value' @ [41:29] ==> value-parameter value: T defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.add[ValueParameterDescriptorImpl]

'if (history.peekLast().first == line) {
            history.removeLast()
            true
        }
        else {
            false
        }' @ [46:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'history' @ [46:20] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'peekLast' @ [46:28] ==> public open fun peekLast(): (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'first' @ [46:39] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'line' @ [46:48] ==> value-parameter line: CompiledReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.removeLast[ValueParameterDescriptorImpl]

'history' @ [47:13] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'removeLast' @ [47:21] ==> public open fun removeLast(): (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'history' @ [57:23] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'map' @ [57:31] ==> public inline fun <T, R> Iterable<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>.map(transform: ((CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)) -> Pair<ReplCodeLine, T>): List<Pair<ReplCodeLine, T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)
    <R> -> Pair<ReplCodeLine, T>

'Pair' @ [57:37] ==> public constructor Pair<out A, out B>(first: ReplCodeLine, second: T) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ReplCodeLine
    <out B> -> T

'it' @ [57:42] ==> value-parameter it: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.reset.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [57:45] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'source' @ [57:51] ==> public final val source: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine[PropertyDescriptorImpl]

'it' @ [57:59] ==> value-parameter it: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.reset.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [57:62] ==> public final val second: T defined in kotlin.Pair[DeserializedPropertyDescriptor]

'history' @ [58:9] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'clear' @ [58:17] ==> public open fun clear(): Unit defined in java.util.ArrayDeque[JavaMethodDescriptor]

'removed' @ [59:16] ==> val removed: List<Pair<ReplCodeLine, T>> defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.reset[LocalVariableDescriptor]

'arrayListOf' @ [64:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */> /* = ArrayList<SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplCodeLine, T>

'>' @ [65:16] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'history' @ [65:17] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'peekLast' @ [65:25] ==> public open fun peekLast(): (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'first' @ [65:37] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'source' @ [65:44] ==> public final val source: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine[PropertyDescriptorImpl]

'no' @ [65:52] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'-' @ [65:58] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lineNumber' @ [65:64] ==> value-parameter lineNumber: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.resetToLine[ValueParameterDescriptorImpl]

'removed' @ [66:13] ==> val removed: ArrayList<SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */> /* = ArrayList<SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.resetToLine[LocalVariableDescriptor]

'add' @ [66:21] ==> public open fun add(element: SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'history' @ [66:25] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'removeLast' @ [66:33] ==> public open fun removeLast(): (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'let' @ [66:46] ==> @InlineOnly public inline fun <T, R> (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */).let(block: ((CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)) -> SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */): SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)
    <R> -> Pair<ReplCodeLine, T>

'Pair' @ [66:52] ==> public constructor Pair<out A, out B>(first: ReplCodeLine, second: T) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ReplCodeLine
    <out B> -> T

'it' @ [66:57] ==> value-parameter it: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.resetToLine.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [66:60] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'source' @ [66:66] ==> public final val source: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine[PropertyDescriptorImpl]

'it' @ [66:74] ==> value-parameter it: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.resetToLine.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [66:77] ==> public final val second: T defined in kotlin.Pair[DeserializedPropertyDescriptor]

'removed' @ [68:16] ==> val removed: ArrayList<SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */> /* = ArrayList<SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.resetToLine[LocalVariableDescriptor]

'reversed' @ [68:24] ==> public fun <T> Iterable<SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */>.reversed(): List<SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ReplCodeLine, T>

'resetToLine' @ [71:65] ==> public final fun resetToLine(lineNumber: Int): SourceHistoryList<T> /* = List<SourceHistoryItem<T> /* = Pair<ReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[SimpleFunctionDescriptorImpl]

'line' @ [71:77] ==> value-parameter line: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.resetToLine[ValueParameterDescriptorImpl]

'no' @ [71:82] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'arrayListOf' @ [74:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> /* = ArrayList<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<CompiledReplCodeLine, T>

'>' @ [75:16] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'history' @ [75:17] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'peekLast' @ [75:25] ==> public open fun peekLast(): (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'first' @ [75:37] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'source' @ [75:44] ==> public final val source: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine[PropertyDescriptorImpl]

'no' @ [75:52] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'-' @ [75:58] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'line' @ [75:64] ==> value-parameter line: CompiledReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.resetToLine[ValueParameterDescriptorImpl]

'source' @ [75:69] ==> public final val source: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine[PropertyDescriptorImpl]

'no' @ [75:76] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'removed' @ [76:13] ==> val removed: ArrayList<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> /* = ArrayList<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.resetToLine[LocalVariableDescriptor]

'add' @ [76:21] ==> public open fun add(element: CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'history' @ [76:25] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'removeLast' @ [76:33] ==> public open fun removeLast(): (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'removed' @ [78:16] ==> val removed: ArrayList<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> /* = ArrayList<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.resetToLine[LocalVariableDescriptor]

'reversed' @ [78:24] ==> public fun <T> Iterable<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */>.reversed(): List<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<CompiledReplCodeLine, T>

'history' @ [81:49] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'any' @ [81:57] ==> public inline fun <T> Iterable<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>.any(predicate: ((CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)

'it' @ [81:63] ==> value-parameter it: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.contains.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [81:66] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'source' @ [81:72] ==> public final val source: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine[PropertyDescriptorImpl]

'line' @ [81:82] ==> value-parameter line: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.contains[ValueParameterDescriptorImpl]

'history' @ [82:57] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'any' @ [82:65] ==> public inline fun <T> Iterable<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>.any(predicate: ((CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)

'it' @ [82:71] ==> value-parameter it: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.contains.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [82:74] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'line' @ [82:83] ==> value-parameter line: CompiledReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.contains[ValueParameterDescriptorImpl]

'history' @ [84:47] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'peekLast' @ [84:55] ==> public open fun peekLast(): (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in java.util.ArrayDeque[JavaMethodDescriptor]

'lastItem' @ [85:49] ==> public final fun lastItem(): CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[SimpleFunctionDescriptorImpl]

'first' @ [85:61] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'lastItem' @ [86:27] ==> public final fun lastItem(): CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[SimpleFunctionDescriptorImpl]

'second' @ [86:39] ==> public final val second: T defined in kotlin.Pair[DeserializedPropertyDescriptor]

'firstMismatchingHistory' @ [89:16] ==> public final fun firstMismatchingHistory(compareHistory: SourceList? /* = List<ReplCodeLine>? */): Int? defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[SimpleFunctionDescriptorImpl]

'compareHistory' @ [89:40] ==> value-parameter compareHistory: SourceList? /* = List<ReplCodeLine>? */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.checkHistoryIsInSync[ValueParameterDescriptorImpl]

'when {
        compareHistory == null -> null
        compareHistory.size == history.size -> history.zip(compareHistory).firstOrNull { it.first.first.source != it.second }?.second?.no
        compareHistory.size > history.size -> compareHistory[history.size].no
        else -> history.toList()[compareHistory.size].first.source.no
    }' @ [93:70] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int?, entry1: Int?, entry2: Int?, entry3: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int?

'compareHistory' @ [94:9] ==> value-parameter compareHistory: SourceList? /* = List<ReplCodeLine>? */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.firstMismatchingHistory[ValueParameterDescriptorImpl]

'compareHistory' @ [95:9] ==> value-parameter compareHistory: SourceList? /* = List<ReplCodeLine>? */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.firstMismatchingHistory[ValueParameterDescriptorImpl]

'size' @ [95:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'history' @ [95:32] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'size' @ [95:40] ==> public open val size: Int defined in java.util.ArrayDeque[JavaPropertyDescriptor]

'history' @ [95:48] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'zip' @ [95:56] ==> public infix fun <T, R> Iterable<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>.zip(other: Iterable<ReplCodeLine>): List<Pair<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */), ReplCodeLine>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)
    <R> -> ReplCodeLine

'compareHistory' @ [95:60] ==> value-parameter compareHistory: SourceList? /* = List<ReplCodeLine>? */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.firstMismatchingHistory[ValueParameterDescriptorImpl]

'firstOrNull' @ [95:76] ==> public inline fun <T> Iterable<Pair<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */), ReplCodeLine>>.firstOrNull(predicate: (Pair<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */), ReplCodeLine>) -> Boolean): Pair<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */), ReplCodeLine>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */), ReplCodeLine>

'it' @ [95:90] ==> value-parameter it: Pair<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */), ReplCodeLine> defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.firstMismatchingHistory.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [95:93] ==> public final val first: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'first' @ [95:99] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'source' @ [95:105] ==> public final val source: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine[PropertyDescriptorImpl]

'it' @ [95:115] ==> value-parameter it: Pair<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */), ReplCodeLine> defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.firstMismatchingHistory.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [95:118] ==> public final val second: ReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'second' @ [95:128] ==> public final val second: ReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'no' @ [95:136] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'compareHistory' @ [96:9] ==> value-parameter compareHistory: SourceList? /* = List<ReplCodeLine>? */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.firstMismatchingHistory[ValueParameterDescriptorImpl]

'size' @ [96:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'history' @ [96:31] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'size' @ [96:39] ==> public open val size: Int defined in java.util.ArrayDeque[JavaPropertyDescriptor]

'compareHistory' @ [96:47] ==> value-parameter compareHistory: SourceList? /* = List<ReplCodeLine>? */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.firstMismatchingHistory[ValueParameterDescriptorImpl]

'history' @ [96:62] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'size' @ [96:70] ==> public open val size: Int defined in java.util.ArrayDeque[JavaPropertyDescriptor]

'no' @ [96:76] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'history' @ [97:17] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'toList' @ [97:25] ==> public fun <T> Iterable<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>.toList(): List<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)

'compareHistory' @ [97:34] ==> value-parameter compareHistory: SourceList? /* = List<ReplCodeLine>? */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.firstMismatchingHistory[ValueParameterDescriptorImpl]

'size' @ [97:49] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'first' @ [97:55] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'source' @ [97:61] ==> public final val source: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine[PropertyDescriptorImpl]

'no' @ [97:68] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'history' @ [100:37] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'map' @ [100:45] ==> public inline fun <T, R> Iterable<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>.map(transform: ((CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)) -> ReplCodeLine): List<ReplCodeLine> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)
    <R> -> ReplCodeLine

'it' @ [100:51] ==> value-parameter it: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.copySources.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [100:54] ==> public final val first: CompiledReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'source' @ [100:60] ==> public final val source: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine[PropertyDescriptorImpl]

'history' @ [101:33] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'map' @ [101:41] ==> public inline fun <T, R> Iterable<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>.map(transform: ((CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)
    <R> -> T

'it' @ [101:47] ==> value-parameter it: (CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */) defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory.copyValues.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [101:50] ==> public final val second: T defined in kotlin.Pair[DeserializedPropertyDescriptor]

'history' @ [102:45] ==> private final val history: CompiledHistoryStorage<T> /* = ArrayDeque<CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */> */ defined in org.jetbrains.kotlin.cli.common.repl.ReplHistory[PropertyDescriptorImpl]

'toList' @ [102:53] ==> public fun <T> Iterable<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)>.toList(): List<(CompiledHistoryItem<T> /* = Pair<CompiledReplCodeLine, T> */..CompiledHistoryItem<T>? /* = Pair<CompiledReplCodeLine, T>? */)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T> /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T> */..org.jetbrains.kotlin.cli.common.repl.CompiledHistoryItem<T>? /* = kotlin.Pair<org.jetbrains.kotlin.cli.common.repl.CompiledReplCodeLine, T>? */)

