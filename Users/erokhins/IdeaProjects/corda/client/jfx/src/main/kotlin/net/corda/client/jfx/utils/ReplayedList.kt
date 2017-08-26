'TransformationList<A, A>' @ [12:56] ==> protected/*protected and package*/ constructor TransformationList<E : (Any..Any?), F : (Any..Any?)>(p0: (ObservableList<out (A..A?)>..ObservableList<out (A..A?)>?)) defined in javafx.collections.transformation.TransformationList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A
    <F : (Any..Any?)> -> A

'sourceList' @ [12:81] ==> value-parameter sourceList: ObservableList<A> defined in net.corda.client.jfx.utils.ReplayedList.<init>[ValueParameterDescriptorImpl]

'ArrayList' @ [14:24] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (A..A?)>..Collection<(A..A?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'sourceList' @ [14:37] ==> value-parameter sourceList: ObservableList<A> defined in net.corda.client.jfx.utils.ReplayedList.<init>[ValueParameterDescriptorImpl]

'replayedList' @ [16:36] ==> public final val replayedList: ArrayList<A> defined in net.corda.client.jfx.utils.ReplayedList[PropertyDescriptorImpl]

'size' @ [16:49] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'beginChange' @ [20:9] ==> protected/*protected and package*/ final fun beginChange(): Unit defined in net.corda.client.jfx.utils.ReplayedList[JavaMethodDescriptor]

'c' @ [21:16] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'next' @ [21:18] ==> public abstract operator fun next(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'if (c.wasPermutated()) {
                val from = c.from
                val to = c.to
                val permutation = IntArray(to, { c.getPermutation(it) })
                val permutedSubList = ArrayList<A?>(to - from)
                permutedSubList.addAll(Collections.nCopies(to - from, null))
                for (i in 0..(to - from - 1)) {
                    permutedSubList[permutation[from + i]] = replayedList[from + i]
                }
                permutedSubList.forEachIndexed { i, element ->
                    replayedList[from + i] = element!!
                }
                nextPermutation(from, to, permutation)
            } else if (c.wasUpdated()) {
                for (i in c.from..c.to - 1) {
                    replayedList[i] = c.list[i]
                    nextUpdate(i)
                }
            } else {
                if (c.wasRemoved()) {
                    val removePosition = c.from
                    for (i in 0..c.removedSize - 1) {
                        replayedList.removeAt(removePosition)
                    }
                    nextRemove(c.from, c.removed)
                }
                if (c.wasAdded()) {
                    val addStart = c.from
                    val addEnd = c.to
                    for (i in addStart..addEnd - 1) {
                        replayedList.add(i, c.list[i])
                    }
                    nextAdd(addStart, addEnd)
                }
            }' @ [22:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'c' @ [22:17] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'wasPermutated' @ [22:19] ==> public open fun wasPermutated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'c' @ [23:28] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [23:30] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'c' @ [24:26] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [24:28] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'IntArray' @ [25:35] ==> public constructor IntArray(size: Int, init: (Int) -> Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'to' @ [25:44] ==> val to: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'c' @ [25:50] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'getPermutation' @ [25:52] ==> public open fun getPermutation(p0: Int): Int defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'it' @ [25:67] ==> value-parameter it: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [26:39] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A?

'to' @ [26:53] ==> val to: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'from' @ [26:58] ==> val from: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'permutedSubList' @ [27:17] ==> val permutedSubList: ArrayList<A?> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'addAll' @ [27:33] ==> public open fun addAll(elements: Collection<A?>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'nCopies' @ [27:52] ==> public open fun <T : (Any..Any?)> nCopies(p0: Int, p1: (A..A?)): (MutableList<(A..A?)>..List<(A..A?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A

'to' @ [27:60] ==> val to: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'from' @ [27:65] ==> val from: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'..' @ [28:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'to' @ [28:31] ==> val to: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'from' @ [28:36] ==> val from: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'permutedSubList' @ [29:21] ==> val permutedSubList: ArrayList<A?> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'permutation' @ [29:37] ==> val permutation: IntArray defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'from' @ [29:49] ==> val from: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'i' @ [29:56] ==> val i: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'replayedList' @ [29:62] ==> public final val replayedList: ArrayList<A> defined in net.corda.client.jfx.utils.ReplayedList[PropertyDescriptorImpl]

'from' @ [29:75] ==> val from: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'i' @ [29:82] ==> val i: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'permutedSubList' @ [31:17] ==> val permutedSubList: ArrayList<A?> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'forEachIndexed' @ [31:33] ==> public inline fun <T> Iterable<A?>.forEachIndexed(action: (index: Int, A?) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A?

'replayedList' @ [32:21] ==> public final val replayedList: ArrayList<A> defined in net.corda.client.jfx.utils.ReplayedList[PropertyDescriptorImpl]

'from' @ [32:34] ==> val from: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'i' @ [32:41] ==> value-parameter i: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [32:46] ==> value-parameter element: A? defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'nextPermutation' @ [34:17] ==> protected/*protected and package*/ final fun nextPermutation(p0: Int, p1: Int, p2: (IntArray..IntArray?)): Unit defined in net.corda.client.jfx.utils.ReplayedList[JavaMethodDescriptor]

'from' @ [34:33] ==> val from: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'to' @ [34:39] ==> val to: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'permutation' @ [34:43] ==> val permutation: IntArray defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'if (c.wasUpdated()) {
                for (i in c.from..c.to - 1) {
                    replayedList[i] = c.list[i]
                    nextUpdate(i)
                }
            } else {
                if (c.wasRemoved()) {
                    val removePosition = c.from
                    for (i in 0..c.removedSize - 1) {
                        replayedList.removeAt(removePosition)
                    }
                    nextRemove(c.from, c.removed)
                }
                if (c.wasAdded()) {
                    val addStart = c.from
                    val addEnd = c.to
                    for (i in addStart..addEnd - 1) {
                        replayedList.add(i, c.list[i])
                    }
                    nextAdd(addStart, addEnd)
                }
            }' @ [35:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'c' @ [35:24] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'wasUpdated' @ [35:26] ==> public open fun wasUpdated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'c' @ [36:27] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [36:29] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'c' @ [36:35] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [36:37] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'replayedList' @ [37:21] ==> public final val replayedList: ArrayList<A> defined in net.corda.client.jfx.utils.ReplayedList[PropertyDescriptorImpl]

'i' @ [37:34] ==> val i: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'c' @ [37:39] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'list' @ [37:41] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.list: (ObservableList<out ({Any & A}..A?)>..ObservableList<out ({Any & A}..A?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'i' @ [37:46] ==> val i: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'nextUpdate' @ [38:21] ==> protected/*protected and package*/ final fun nextUpdate(p0: Int): Unit defined in net.corda.client.jfx.utils.ReplayedList[JavaMethodDescriptor]

'i' @ [38:32] ==> val i: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'c' @ [41:21] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'wasRemoved' @ [41:23] ==> public open fun wasRemoved(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'c' @ [42:42] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [42:44] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'..' @ [43:31] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'c' @ [43:34] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'removedSize' @ [43:36] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.removedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'replayedList' @ [44:25] ==> public final val replayedList: ArrayList<A> defined in net.corda.client.jfx.utils.ReplayedList[PropertyDescriptorImpl]

'removeAt' @ [44:38] ==> public open fun removeAt(p0: Int): A defined in java.util.ArrayList[JavaMethodDescriptor]

'removePosition' @ [44:47] ==> val removePosition: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'nextRemove' @ [46:21] ==> protected/*protected and package*/ final fun nextRemove(p0: Int, p1: (MutableList<out (A..A?)>..List<(A..A?)>?)): Unit defined in net.corda.client.jfx.utils.ReplayedList[JavaMethodDescriptor]

'c' @ [46:32] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [46:34] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'c' @ [46:40] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'removed' @ [46:42] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.removed: (MutableList<out ({Any & A}..A?)>..List<({Any & A}..A?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'c' @ [48:21] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'wasAdded' @ [48:23] ==> public open fun wasAdded(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'c' @ [49:36] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [49:38] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'c' @ [50:34] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [50:36] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'addStart' @ [51:31] ==> val addStart: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'addEnd' @ [51:41] ==> val addEnd: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'replayedList' @ [52:25] ==> public final val replayedList: ArrayList<A> defined in net.corda.client.jfx.utils.ReplayedList[PropertyDescriptorImpl]

'add' @ [52:38] ==> public open fun add(index: Int, element: A): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'i' @ [52:42] ==> val i: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'c' @ [52:45] ==> value-parameter c: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[ValueParameterDescriptorImpl]

'list' @ [52:47] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ({Any & A}..A)>.list: (ObservableList<out ({Any & A}..A?)>..ObservableList<out ({Any & A}..A?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ({Any & A}..A)

'i' @ [52:52] ==> val i: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'nextAdd' @ [54:21] ==> protected/*protected and package*/ final fun nextAdd(p0: Int, p1: Int): Unit defined in net.corda.client.jfx.utils.ReplayedList[JavaMethodDescriptor]

'addStart' @ [54:29] ==> val addStart: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'addEnd' @ [54:39] ==> val addEnd: Int defined in net.corda.client.jfx.utils.ReplayedList.sourceChanged[LocalVariableDescriptor]

'endChange' @ [58:9] ==> protected/*protected and package*/ final fun endChange(): Unit defined in net.corda.client.jfx.utils.ReplayedList[JavaMethodDescriptor]

'index' @ [61:47] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.ReplayedList.getSourceIndex[ValueParameterDescriptorImpl]

'replayedList' @ [63:36] ==> public final val replayedList: ArrayList<A> defined in net.corda.client.jfx.utils.ReplayedList[PropertyDescriptorImpl]

'index' @ [63:49] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.ReplayedList.get[ValueParameterDescriptorImpl]

