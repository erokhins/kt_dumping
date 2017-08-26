'TransformationList<B, A>' @ [14:75] ==> protected/*protected and package*/ constructor TransformationList<E : (Any..Any?), F : (Any..Any?)>(p0: (ObservableList<out (A..A?)>..ObservableList<out (A..A?)>?)) defined in javafx.collections.transformation.TransformationList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> B
    <F : (Any..Any?)> -> A

'list' @ [14:100] ==> value-parameter list: ObservableList<A> defined in net.corda.client.jfx.utils.MappedList.<init>[ValueParameterDescriptorImpl]

'ArrayList' @ [15:31] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> B

'list' @ [15:44] ==> value-parameter list: ObservableList<A> defined in net.corda.client.jfx.utils.MappedList.<init>[ValueParameterDescriptorImpl]

'size' @ [15:49] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'list' @ [18:9] ==> value-parameter list: ObservableList<A> defined in net.corda.client.jfx.utils.MappedList.<init>[ValueParameterDescriptorImpl]

'forEach' @ [18:14] ==> @HidesMembers public inline fun <T> Iterable<(A..A?)>.forEach(action: ((A..A?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (A..A?)

'backingList' @ [19:13] ==> private final val backingList: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList[PropertyDescriptorImpl]

'add' @ [19:25] ==> public open fun add(element: B): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'invoke' @ [19:29] ==> public abstract operator fun invoke(p1: A): B defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [19:38] ==> value-parameter it: (A..A?) defined in net.corda.client.jfx.utils.MappedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'beginChange' @ [24:9] ==> protected/*protected and package*/ final fun beginChange(): Unit defined in net.corda.client.jfx.utils.MappedList[JavaMethodDescriptor]

'change' @ [25:16] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'next' @ [25:23] ==> public abstract operator fun next(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'if (change.wasPermutated()) {
                // Note how we don't re-run the mapping function on a permutation. If we supported mapIndexed we would
                // have to.
                val from = change.from
                val to = change.to
                val permutation = IntArray(to) { change.getPermutation(it) }
                val permutedSubList = ArrayList<B?>(to - from)
                permutedSubList.addAll(Collections.nCopies(to - from, null))
                for (i in 0.until(to - from)) {
                    permutedSubList[permutation[from + i]] = backingList[from + i]
                }
                permutedSubList.forEachIndexed { i, element ->
                    backingList[from + i] = element!!
                }
                nextPermutation(from, to, permutation)
            } else if (change.wasUpdated()) {
                backingList[change.from] = function(source[change.from])
                nextUpdate(change.from)
            } else {
                if (change.wasRemoved()) {
                    val removePosition = change.from
                    val removed = ArrayList<B>(change.removedSize)
                    for (i in 0.until(change.removedSize)) {
                        removed.add(backingList.removeAt(removePosition))
                    }
                    nextRemove(change.from, removed)
                }
                if (change.wasAdded()) {
                    val addStart = change.from
                    val addEnd = change.to
                    for (i in addStart.until(addEnd)) {
                        backingList.add(i, function(change.list[i]))
                    }
                    nextAdd(addStart, addEnd)
                }
            }' @ [26:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [26:17] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'wasPermutated' @ [26:24] ==> public open fun wasPermutated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'change' @ [29:28] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [29:35] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'change' @ [30:26] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [30:33] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'IntArray' @ [31:35] ==> public constructor IntArray(size: Int, init: (Int) -> Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'to' @ [31:44] ==> val to: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'change' @ [31:50] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'getPermutation' @ [31:57] ==> public open fun getPermutation(p0: Int): Int defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'it' @ [31:72] ==> value-parameter it: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [32:39] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> B?

'to' @ [32:53] ==> val to: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'from' @ [32:58] ==> val from: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'permutedSubList' @ [33:17] ==> val permutedSubList: ArrayList<B?> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'addAll' @ [33:33] ==> public open fun addAll(elements: Collection<B?>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'nCopies' @ [33:52] ==> public open fun <T : (Any..Any?)> nCopies(p0: Int, p1: (B..B?)): (MutableList<(B..B?)>..List<(B..B?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> B

'to' @ [33:60] ==> val to: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'from' @ [33:65] ==> val from: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'iterator' @ [34:27] ==> public open fun iterator(): IntIterator defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'until' @ [34:29] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'to' @ [34:35] ==> val to: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'from' @ [34:40] ==> val from: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'permutedSubList' @ [35:21] ==> val permutedSubList: ArrayList<B?> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'permutation' @ [35:37] ==> val permutation: IntArray defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'from' @ [35:49] ==> val from: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'i' @ [35:56] ==> val i: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'backingList' @ [35:62] ==> private final val backingList: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList[PropertyDescriptorImpl]

'from' @ [35:74] ==> val from: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'i' @ [35:81] ==> val i: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'permutedSubList' @ [37:17] ==> val permutedSubList: ArrayList<B?> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'forEachIndexed' @ [37:33] ==> public inline fun <T> Iterable<B?>.forEachIndexed(action: (index: Int, B?) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> B?

'backingList' @ [38:21] ==> private final val backingList: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList[PropertyDescriptorImpl]

'from' @ [38:33] ==> val from: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'i' @ [38:40] ==> value-parameter i: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [38:45] ==> value-parameter element: B? defined in net.corda.client.jfx.utils.MappedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'nextPermutation' @ [40:17] ==> protected/*protected and package*/ final fun nextPermutation(p0: Int, p1: Int, p2: (IntArray..IntArray?)): Unit defined in net.corda.client.jfx.utils.MappedList[JavaMethodDescriptor]

'from' @ [40:33] ==> val from: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'to' @ [40:39] ==> val to: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'permutation' @ [40:43] ==> val permutation: IntArray defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'if (change.wasUpdated()) {
                backingList[change.from] = function(source[change.from])
                nextUpdate(change.from)
            } else {
                if (change.wasRemoved()) {
                    val removePosition = change.from
                    val removed = ArrayList<B>(change.removedSize)
                    for (i in 0.until(change.removedSize)) {
                        removed.add(backingList.removeAt(removePosition))
                    }
                    nextRemove(change.from, removed)
                }
                if (change.wasAdded()) {
                    val addStart = change.from
                    val addEnd = change.to
                    for (i in addStart.until(addEnd)) {
                        backingList.add(i, function(change.list[i]))
                    }
                    nextAdd(addStart, addEnd)
                }
            }' @ [41:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [41:24] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'wasUpdated' @ [41:31] ==> public open fun wasUpdated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'backingList' @ [42:17] ==> private final val backingList: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList[PropertyDescriptorImpl]

'change' @ [42:29] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [42:36] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'invoke' @ [42:44] ==> public abstract operator fun invoke(p1: A): B defined in kotlin.Function1[FunctionInvokeDescriptor]

'source' @ [42:53] ==> public final val <A, B> MappedList<A, B>.source: (ObservableList<out (A..A?)>..ObservableList<out (A..A?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A
    <B> -> B

'change' @ [42:60] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [42:67] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'nextUpdate' @ [43:17] ==> protected/*protected and package*/ final fun nextUpdate(p0: Int): Unit defined in net.corda.client.jfx.utils.MappedList[JavaMethodDescriptor]

'change' @ [43:28] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [43:35] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'change' @ [45:21] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'wasRemoved' @ [45:28] ==> public open fun wasRemoved(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'change' @ [46:42] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [46:49] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'ArrayList' @ [47:35] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> B

'change' @ [47:48] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'removedSize' @ [47:55] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.removedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'iterator' @ [48:31] ==> public open fun iterator(): IntIterator defined in kotlin.ranges.IntRange[DeserializedSimpleFunctionDescriptor]

'until' @ [48:33] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'change' @ [48:39] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'removedSize' @ [48:46] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.removedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'removed' @ [49:25] ==> val removed: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'add' @ [49:33] ==> public open fun add(element: B): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'backingList' @ [49:37] ==> private final val backingList: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList[PropertyDescriptorImpl]

'removeAt' @ [49:49] ==> public open fun removeAt(p0: Int): B defined in java.util.ArrayList[JavaMethodDescriptor]

'removePosition' @ [49:58] ==> val removePosition: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'nextRemove' @ [51:21] ==> protected/*protected and package*/ final fun nextRemove(p0: Int, p1: (MutableList<out (B..B?)>..List<(B..B?)>?)): Unit defined in net.corda.client.jfx.utils.MappedList[JavaMethodDescriptor]

'change' @ [51:32] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [51:39] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'removed' @ [51:45] ==> val removed: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'change' @ [53:21] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'wasAdded' @ [53:28] ==> public open fun wasAdded(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'change' @ [54:36] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [54:43] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'change' @ [55:34] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [55:41] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'addStart' @ [56:31] ==> val addStart: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'until' @ [56:40] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'addEnd' @ [56:46] ==> val addEnd: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'backingList' @ [57:25] ==> private final val backingList: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList[PropertyDescriptorImpl]

'add' @ [57:37] ==> public open fun add(index: Int, element: B): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'i' @ [57:41] ==> val i: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'invoke' @ [57:44] ==> public abstract operator fun invoke(p1: A): B defined in kotlin.Function1[FunctionInvokeDescriptor]

'change' @ [57:53] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.MappedList.sourceChanged[ValueParameterDescriptorImpl]

'list' @ [57:60] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.list: (ObservableList<out ({Any & A}..A?)>..ObservableList<out ({Any & A}..A?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'i' @ [57:65] ==> val i: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'nextAdd' @ [59:21] ==> protected/*protected and package*/ final fun nextAdd(p0: Int, p1: Int): Unit defined in net.corda.client.jfx.utils.MappedList[JavaMethodDescriptor]

'addStart' @ [59:29] ==> val addStart: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'addEnd' @ [59:39] ==> val addEnd: Int defined in net.corda.client.jfx.utils.MappedList.sourceChanged[LocalVariableDescriptor]

'endChange' @ [63:9] ==> protected/*protected and package*/ final fun endChange(): Unit defined in net.corda.client.jfx.utils.MappedList[JavaMethodDescriptor]

'backingList' @ [66:36] ==> private final val backingList: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList[PropertyDescriptorImpl]

'index' @ [66:48] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.MappedList.get[ValueParameterDescriptorImpl]

'backingList' @ [67:36] ==> private final val backingList: ArrayList<B> defined in net.corda.client.jfx.utils.MappedList[PropertyDescriptorImpl]

'size' @ [67:48] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'index' @ [68:47] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.MappedList.getSourceIndex[ValueParameterDescriptorImpl]

