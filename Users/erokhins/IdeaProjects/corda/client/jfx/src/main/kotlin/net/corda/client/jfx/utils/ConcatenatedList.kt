'TransformationList<A, ObservableList<A>>' @ [13:76] ==> protected/*protected and package*/ constructor TransformationList<E : (Any..Any?), F : (Any..Any?)>(p0: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)) defined in javafx.collections.transformation.TransformationList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A
    <F : (Any..Any?)> -> ObservableList<A>

'sourceList' @ [13:117] ==> value-parameter sourceList: ObservableList<ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.<init>[ValueParameterDescriptorImpl]

'VisibleForTesting' @ [15:5] ==> public constructor VisibleForTesting() defined in co.paralleluniverse.common.util.VisibleForTesting[JavaClassConstructorDescriptor]

'VisibleForTesting' @ [39:5] ==> public constructor VisibleForTesting() defined in co.paralleluniverse.common.util.VisibleForTesting[JavaClassConstructorDescriptor]

'HashMap' @ [40:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> WrappedObservableList<out A>
    <V : (Any..Any?)> -> Pair<Int, ListChangeListener<A>>

'VisibleForTesting' @ [41:5] ==> public constructor VisibleForTesting() defined in co.paralleluniverse.common.util.VisibleForTesting[JavaClassConstructorDescriptor]

'ArrayList' @ [42:39] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Int

'sourceList' @ [42:54] ==> value-parameter sourceList: ObservableList<ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.<init>[ValueParameterDescriptorImpl]

'size' @ [42:65] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'sourceList' @ [46:9] ==> value-parameter sourceList: ObservableList<ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.<init>[ValueParameterDescriptorImpl]

'forEachIndexed' @ [46:20] ==> public inline fun <T> Iterable<(ObservableList<A>..ObservableList<A>?)>.forEachIndexed(action: (index: Int, (ObservableList<A>..ObservableList<A>?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javafx.collections.ObservableList<A>..javafx.collections.ObservableList<A>?)

'WrappedObservableList' @ [47:27] ==> public constructor WrappedObservableList<A>(observableList: ObservableList<A>) defined in net.corda.client.jfx.utils.ConcatenatedList.WrappedObservableList[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> A

'observableList' @ [47:49] ==> value-parameter observableList: (ObservableList<A>..ObservableList<A>?) defined in net.corda.client.jfx.utils.ConcatenatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'indexMap' @ [48:13] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'wrapped' @ [48:22] ==> val wrapped: ConcatenatedList.WrappedObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.<init>.<anonymous>[LocalVariableDescriptor]

'Pair' @ [48:33] ==> public constructor Pair<out A, out B>(first: Int, second: ListChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ListChangeListener<A>

'index' @ [48:38] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'createListener' @ [48:45] ==> private final fun createListener(wrapped: ConcatenatedList.WrappedObservableList<A>): ListChangeListener<A> defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'wrapped' @ [48:60] ==> val wrapped: ConcatenatedList.WrappedObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.<init>.<anonymous>[LocalVariableDescriptor]

'offset' @ [49:13] ==> var offset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.<init>[LocalVariableDescriptor]

'observableList' @ [49:23] ==> value-parameter observableList: (ObservableList<A>..ObservableList<A>?) defined in net.corda.client.jfx.utils.ConcatenatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [49:38] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'nestedIndexOffsets' @ [50:13] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'add' @ [50:32] ==> public open fun add(element: Int): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'offset' @ [50:36] ==> var offset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.<init>[LocalVariableDescriptor]

'if (listIndex == 0) {
            return 0
        } else {
            return nestedIndexOffsets[listIndex - 1]
        }' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'listIndex' @ [55:13] ==> value-parameter listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.startingOffsetOf[ValueParameterDescriptorImpl]

'nestedIndexOffsets' @ [58:20] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'listIndex' @ [58:39] ==> value-parameter listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.startingOffsetOf[ValueParameterDescriptorImpl]

'ListChangeListener' @ [65:24] ==> @FunctionalInterface public fun <E : (Any..Any?)> ListChangeListener(function: ((ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?)) -> Unit): ListChangeListener<A> defined in javafx.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : (Any..Any?)> -> A

'beginChange' @ [66:13] ==> protected/*protected and package*/ final fun beginChange(): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'change' @ [67:20] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [67:27] ==> public abstract operator fun next(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'if (change.wasPermutated()) {
                    // If a nested list is permuted we simply offset the permutation by the startingOffsetOf the list.
                    // Note that we don't need to invalidate offsets.
                    val nestedListIndex = indexMap[wrapped]!!.first
                    val permutation = IntArray(change.to)
                    val startingOffset = startingOffsetOf(nestedListIndex)
                    // firstTouched is the result list index of the beginning of the permutation.
                    val firstTouched = startingOffset + change.from
                    // We first set the non-permuted indices.
                    for (i in 0..firstTouched - 1) {
                        permutation[i] = i
                    }
                    // Then the permuted ones.
                    for (i in firstTouched..startingOffset + change.to - 1) {
                        permutation[startingOffset + i] = change.getPermutation(i)
                    }
                    nextPermutation(firstTouched, startingOffset + change.to, permutation)
                } else if (change.wasUpdated()) {
                    // If a nested element is updated we simply propagate the update by offsetting the nested element index
                    // by the startingOffsetOf the nested list.
                    val listIndex = indexMap[wrapped]!!.first
                    val startingOffset = startingOffsetOf(listIndex)
                    for (i in change.from..change.to - 1) {
                        nextUpdate(startingOffset + i)
                    }
                } else {
                    if (change.wasRemoved()) {
                        // If nested elements are removed we again simply offset the change. We also need to invalidate
                        // 'nestedIndexOffsets' unless we removed the same number of elements as we added
                        val listIndex = indexMap[wrapped]!!.first
                        if (!(change.wasAdded() && change.addedSize == change.removedSize)) {
                            invalidateOffsets(listIndex)
                        }
                        val startingOffset = startingOffsetOf(listIndex)
                        nextRemove(startingOffset + change.from, change.removed)
                    }
                    if (change.wasAdded()) {
                        // Similar logic to remove.
                        val listIndex = indexMap[wrapped]!!.first
                        if (!(change.wasRemoved() && change.addedSize == change.removedSize)) {
                            invalidateOffsets(listIndex)
                        }
                        val startingOffset = startingOffsetOf(listIndex)
                        nextAdd(startingOffset + change.from, startingOffset + change.to)
                    }
                }' @ [68:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [68:21] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'wasPermutated' @ [68:28] ==> public open fun wasPermutated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'indexMap' @ [71:43] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'wrapped' @ [71:52] ==> value-parameter wrapped: ConcatenatedList.WrappedObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.createListener[ValueParameterDescriptorImpl]

'first' @ [71:63] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'IntArray' @ [72:39] ==> public constructor IntArray(size: Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'change' @ [72:48] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [72:55] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'startingOffsetOf' @ [73:42] ==> private final fun startingOffsetOf(listIndex: Int): Int defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'nestedListIndex' @ [73:59] ==> val nestedListIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'startingOffset' @ [75:40] ==> val startingOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'change' @ [75:57] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [75:64] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'..' @ [77:31] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'firstTouched' @ [77:34] ==> val firstTouched: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'permutation' @ [78:25] ==> val permutation: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'i' @ [78:37] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'i' @ [78:42] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'firstTouched' @ [81:31] ==> val firstTouched: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'startingOffset' @ [81:45] ==> val startingOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'change' @ [81:62] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [81:69] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'permutation' @ [82:25] ==> val permutation: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'startingOffset' @ [82:37] ==> val startingOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'i' @ [82:54] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'change' @ [82:59] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'getPermutation' @ [82:66] ==> public open fun getPermutation(p0: Int): Int defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'i' @ [82:81] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'nextPermutation' @ [84:21] ==> protected/*protected and package*/ final fun nextPermutation(p0: Int, p1: Int, p2: (IntArray..IntArray?)): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'firstTouched' @ [84:37] ==> val firstTouched: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'startingOffset' @ [84:51] ==> val startingOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'change' @ [84:68] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [84:75] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'permutation' @ [84:79] ==> val permutation: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'if (change.wasUpdated()) {
                    // If a nested element is updated we simply propagate the update by offsetting the nested element index
                    // by the startingOffsetOf the nested list.
                    val listIndex = indexMap[wrapped]!!.first
                    val startingOffset = startingOffsetOf(listIndex)
                    for (i in change.from..change.to - 1) {
                        nextUpdate(startingOffset + i)
                    }
                } else {
                    if (change.wasRemoved()) {
                        // If nested elements are removed we again simply offset the change. We also need to invalidate
                        // 'nestedIndexOffsets' unless we removed the same number of elements as we added
                        val listIndex = indexMap[wrapped]!!.first
                        if (!(change.wasAdded() && change.addedSize == change.removedSize)) {
                            invalidateOffsets(listIndex)
                        }
                        val startingOffset = startingOffsetOf(listIndex)
                        nextRemove(startingOffset + change.from, change.removed)
                    }
                    if (change.wasAdded()) {
                        // Similar logic to remove.
                        val listIndex = indexMap[wrapped]!!.first
                        if (!(change.wasRemoved() && change.addedSize == change.removedSize)) {
                            invalidateOffsets(listIndex)
                        }
                        val startingOffset = startingOffsetOf(listIndex)
                        nextAdd(startingOffset + change.from, startingOffset + change.to)
                    }
                }' @ [85:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [85:28] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'wasUpdated' @ [85:35] ==> public open fun wasUpdated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'indexMap' @ [88:37] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'wrapped' @ [88:46] ==> value-parameter wrapped: ConcatenatedList.WrappedObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.createListener[ValueParameterDescriptorImpl]

'first' @ [88:57] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'startingOffsetOf' @ [89:42] ==> private final fun startingOffsetOf(listIndex: Int): Int defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'listIndex' @ [89:59] ==> val listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'change' @ [90:31] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [90:38] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'change' @ [90:44] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [90:51] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'nextUpdate' @ [91:25] ==> protected/*protected and package*/ final fun nextUpdate(p0: Int): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'startingOffset' @ [91:36] ==> val startingOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'i' @ [91:53] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'change' @ [94:25] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'wasRemoved' @ [94:32] ==> public open fun wasRemoved(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'indexMap' @ [97:41] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'wrapped' @ [97:50] ==> value-parameter wrapped: ConcatenatedList.WrappedObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.createListener[ValueParameterDescriptorImpl]

'first' @ [97:61] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'!' @ [98:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'change' @ [98:31] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [98:38] ==> public open fun wasAdded(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'change' @ [98:52] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'addedSize' @ [98:59] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.addedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'change' @ [98:72] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'removedSize' @ [98:79] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.removedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'invalidateOffsets' @ [99:29] ==> private final fun invalidateOffsets(index: Int): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'listIndex' @ [99:47] ==> val listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'startingOffsetOf' @ [101:46] ==> private final fun startingOffsetOf(listIndex: Int): Int defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'listIndex' @ [101:63] ==> val listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'nextRemove' @ [102:25] ==> protected/*protected and package*/ final fun nextRemove(p0: Int, p1: (MutableList<out (A..A?)>..List<(A..A?)>?)): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'startingOffset' @ [102:36] ==> val startingOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'change' @ [102:53] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [102:60] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'change' @ [102:66] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'removed' @ [102:73] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.removed: (MutableList<out (A..A?)>..List<(A..A?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'change' @ [104:25] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [104:32] ==> public open fun wasAdded(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'indexMap' @ [106:41] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'wrapped' @ [106:50] ==> value-parameter wrapped: ConcatenatedList.WrappedObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.createListener[ValueParameterDescriptorImpl]

'first' @ [106:61] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'!' @ [107:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'change' @ [107:31] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'wasRemoved' @ [107:38] ==> public open fun wasRemoved(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'change' @ [107:54] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'addedSize' @ [107:61] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.addedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'change' @ [107:74] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'removedSize' @ [107:81] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.removedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'invalidateOffsets' @ [108:29] ==> private final fun invalidateOffsets(index: Int): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'listIndex' @ [108:47] ==> val listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'startingOffsetOf' @ [110:46] ==> private final fun startingOffsetOf(listIndex: Int): Int defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'listIndex' @ [110:63] ==> val listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'nextAdd' @ [111:25] ==> protected/*protected and package*/ final fun nextAdd(p0: Int, p1: Int): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'startingOffset' @ [111:33] ==> val startingOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'change' @ [111:50] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'from' @ [111:57] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'startingOffset' @ [111:63] ==> val startingOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[LocalVariableDescriptor]

'change' @ [111:80] ==> value-parameter change: (ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?) defined in net.corda.client.jfx.utils.ConcatenatedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [111:87] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out (A..A?)>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out (A..A?))

'recalculateOffsets' @ [114:17] ==> private final fun recalculateOffsets(): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'endChange' @ [116:13] ==> protected/*protected and package*/ final fun endChange(): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'wrapped' @ [118:9] ==> value-parameter wrapped: ConcatenatedList.WrappedObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.createListener[ValueParameterDescriptorImpl]

'observableList' @ [118:17] ==> public final val observableList: ObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.WrappedObservableList[PropertyDescriptorImpl]

'addListener' @ [118:32] ==> public abstract fun addListener(p0: (ListChangeListener<in (A..A?)>..ListChangeListener<in (A..A?)>?)): Unit defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'listener' @ [118:44] ==> val listener: ListChangeListener<A> defined in net.corda.client.jfx.utils.ConcatenatedList.createListener[LocalVariableDescriptor]

'listener' @ [119:16] ==> val listener: ListChangeListener<A> defined in net.corda.client.jfx.utils.ConcatenatedList.createListener[LocalVariableDescriptor]

'beginChange' @ [124:9] ==> protected/*protected and package*/ final fun beginChange(): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'change' @ [125:16] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'next' @ [125:23] ==> public abstract operator fun next(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'if (change.wasPermutated()) {
                // If the source list was permuted we adjust 'nestedIndexOffsets' and translate the permutation to apply
                // to the nested elements.
                // For example:
                //   original list:          { {"a", "b"}, {"c", "d"}, {} }
                //   original permutation:   { 2, 1, 0 }
                //   permuted list:          { {}, {"c", "d"}, {"a", "b"} }
                //   translated permutation: { 2, 3, 0, 1 }

                // First we apply the permutation to the 'indexMap'
                val iterator = indexMap.iterator()
                for (entry in iterator) {
                    val (index, listener) = entry.value
                    if (index >= change.from && index < change.to) {
                        entry.setValue(Pair(change.getPermutation(index), listener))
                    }
                }
                // We apply the permutation to the relevant part of 'nestedIndexOffsets'.
                val newSubNestedIndexOffsets = IntArray(change.to - change.from)
                val firstTouched = if (change.from == 0) 0 else nestedIndexOffsets[change.from - 1]
                var currentOffset = firstTouched
                for (i in 0..change.to - change.from - 1) {
                    currentOffset += source[change.from + i].size
                    newSubNestedIndexOffsets[i] = currentOffset
                }
                // Now we create the permutation array for the result list.
                val concatenatedPermutation = IntArray(newSubNestedIndexOffsets.last())
                // Set the non-permuted part
                var offset = 0
                for (i in 0..change.from - 1) {
                    val nestedList = source[i]
                    for (j in offset..offset + nestedList.size - 1) {
                        concatenatedPermutation[j] = j
                    }
                    offset += nestedList.size
                }
                // Now the permuted part
                for (i in 0..newSubNestedIndexOffsets.size - 1) {
                    val startingOffset = startingOffsetOf(change.from + i)
                    val permutedListIndex = change.getPermutation(change.from + i)
                    val permutedOffset = (if (permutedListIndex == 0) 0 else newSubNestedIndexOffsets[permutedListIndex - 1])
                    for (j in 0..source[permutedListIndex].size - 1) {
                        concatenatedPermutation[startingOffset + j] = permutedOffset + j
                    }
                }
                // Record permuted offsets
                for (i in 0..newSubNestedIndexOffsets.size - 1) {
                    nestedIndexOffsets[change.from + i] = newSubNestedIndexOffsets[i]
                }
                nextPermutation(firstTouched, newSubNestedIndexOffsets.last(), concatenatedPermutation)
            } else if (change.wasUpdated()) {
                // This would be translated to remove + add, but that requires a backing list for removed elements
                throw UnsupportedOperationException("Updates not supported")
            } else {
                if (change.wasRemoved()) {
                    // If nested lists were removed we iterate over 'indexMap' and adjust the indices accordingly,
                    // remove listeners and remove relevant mappings as well. We also invalidate nested offsets.
                    val iterator = indexMap.iterator()
                    for (entry in iterator) {
                        val (wrapped, pair) = entry
                        val (index, listener) = pair
                        if (index >= change.from) {
                            val removeEnd = change.from + change.removedSize
                            if (index < removeEnd) {
                                wrapped.observableList.removeListener(listener)
                                iterator.remove()
                            } else {
                                entry.setValue(Pair(index - change.removedSize, listener))
                            }
                        }
                    }
                    // Propagate changes
                    invalidateOffsets(change.from)
                    val removeStart = startingOffsetOf(change.from)
                    val removed = change.removed.flatMap { it }
                    nextRemove(removeStart, removed)
                }
                if (change.wasAdded()) {
                    // Update indexMap
                    if (change.from != indexMap.size) {
                        val iterator = indexMap.iterator()
                        for (entry in iterator) {
                            val (index, listener) = entry.value
                            if (index >= change.from) {
                                // Shift indices
                                entry.setValue(Pair(index + change.addedSize, listener))
                            }
                        }
                    }
                    change.addedSubList.forEachIndexed { sublistIndex, observableList ->
                        val wrapped = WrappedObservableList(observableList)
                        indexMap[wrapped] = Pair(change.from + sublistIndex, createListener(wrapped))
                    }
                    invalidateOffsets(change.from)
                    // We recalculate offsets early as we need the range anyway.
                    recalculateOffsets()
                    nextAdd(startingOffsetOf(change.from), nestedIndexOffsets[change.to - 1])
                }
            }' @ [126:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [126:17] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'wasPermutated' @ [126:24] ==> public open fun wasPermutated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'indexMap' @ [136:32] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'iterator' @ [136:41] ==> @JvmName @InlineOnly public operator inline fun <K, V> MutableMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>.iterator(): MutableIterator<MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrappedObservableList<out A>
    <V> -> Pair<Int, ListChangeListener<A>>

'iterator' @ [137:31] ==> val iterator: MutableIterator<MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'component1' @ [138:26] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [138:33] ==> public final operator fun component2(): ListChangeListener<A> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'entry' @ [138:45] ==> val entry: MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'value' @ [138:51] ==> public abstract val value: Pair<Int, ListChangeListener<A>> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'index' @ [139:25] ==> val index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'change' @ [139:34] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [139:41] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'index' @ [139:49] ==> val index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'change' @ [139:57] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [139:64] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'entry' @ [140:25] ==> val entry: MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'setValue' @ [140:31] ==> public abstract fun setValue(newValue: Pair<Int, ListChangeListener<A>>): Pair<Int, ListChangeListener<A>> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedSimpleFunctionDescriptor]

'Pair' @ [140:40] ==> public constructor Pair<out A, out B>(first: Int, second: ListChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ListChangeListener<A>

'change' @ [140:45] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'getPermutation' @ [140:52] ==> public open fun getPermutation(p0: Int): Int defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'index' @ [140:67] ==> val index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'listener' @ [140:75] ==> val listener: ListChangeListener<A> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'IntArray' @ [144:48] ==> public constructor IntArray(size: Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'change' @ [144:57] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [144:64] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'change' @ [144:69] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [144:76] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'if (change.from == 0) 0 else nestedIndexOffsets[change.from - 1]' @ [145:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'change' @ [145:40] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [145:47] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'nestedIndexOffsets' @ [145:65] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'change' @ [145:84] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [145:91] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'firstTouched' @ [146:37] ==> val firstTouched: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'..' @ [147:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'change' @ [147:30] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [147:37] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'change' @ [147:42] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [147:49] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'currentOffset' @ [148:21] ==> var currentOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'source' @ [148:38] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'change' @ [148:45] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [148:52] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'i' @ [148:59] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'size' @ [148:62] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'newSubNestedIndexOffsets' @ [149:21] ==> val newSubNestedIndexOffsets: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'i' @ [149:46] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'currentOffset' @ [149:51] ==> var currentOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'IntArray' @ [152:47] ==> public constructor IntArray(size: Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'newSubNestedIndexOffsets' @ [152:56] ==> val newSubNestedIndexOffsets: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'last' @ [152:81] ==> public fun IntArray.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'..' @ [155:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'change' @ [155:30] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [155:37] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'source' @ [156:38] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'i' @ [156:45] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'offset' @ [157:31] ==> var offset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'offset' @ [157:39] ==> var offset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'nestedList' @ [157:48] ==> val nestedList: (ObservableList<A>..ObservableList<A>?) defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'size' @ [157:59] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'concatenatedPermutation' @ [158:25] ==> val concatenatedPermutation: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'j' @ [158:49] ==> val j: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'j' @ [158:54] ==> val j: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'offset' @ [160:21] ==> var offset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'nestedList' @ [160:31] ==> val nestedList: (ObservableList<A>..ObservableList<A>?) defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'size' @ [160:42] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'..' @ [163:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'newSubNestedIndexOffsets' @ [163:30] ==> val newSubNestedIndexOffsets: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'size' @ [163:55] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'startingOffsetOf' @ [164:42] ==> private final fun startingOffsetOf(listIndex: Int): Int defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'change' @ [164:59] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [164:66] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'i' @ [164:73] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'change' @ [165:45] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'getPermutation' @ [165:52] ==> public open fun getPermutation(p0: Int): Int defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'change' @ [165:67] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [165:74] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'i' @ [165:81] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'if (permutedListIndex == 0) 0 else newSubNestedIndexOffsets[permutedListIndex - 1]' @ [166:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'permutedListIndex' @ [166:47] ==> val permutedListIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'newSubNestedIndexOffsets' @ [166:78] ==> val newSubNestedIndexOffsets: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'permutedListIndex' @ [166:103] ==> val permutedListIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'..' @ [167:31] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'source' @ [167:34] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'permutedListIndex' @ [167:41] ==> val permutedListIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'size' @ [167:60] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'concatenatedPermutation' @ [168:25] ==> val concatenatedPermutation: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'startingOffset' @ [168:49] ==> val startingOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'j' @ [168:66] ==> val j: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'permutedOffset' @ [168:71] ==> val permutedOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'j' @ [168:88] ==> val j: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'..' @ [172:27] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'newSubNestedIndexOffsets' @ [172:30] ==> val newSubNestedIndexOffsets: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'size' @ [172:55] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'nestedIndexOffsets' @ [173:21] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'change' @ [173:40] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [173:47] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'i' @ [173:54] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'newSubNestedIndexOffsets' @ [173:59] ==> val newSubNestedIndexOffsets: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'i' @ [173:84] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'nextPermutation' @ [175:17] ==> protected/*protected and package*/ final fun nextPermutation(p0: Int, p1: Int, p2: (IntArray..IntArray?)): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'firstTouched' @ [175:33] ==> val firstTouched: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'newSubNestedIndexOffsets' @ [175:47] ==> val newSubNestedIndexOffsets: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'last' @ [175:72] ==> public fun IntArray.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'concatenatedPermutation' @ [175:80] ==> val concatenatedPermutation: IntArray defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'if (change.wasUpdated()) {
                // This would be translated to remove + add, but that requires a backing list for removed elements
                throw UnsupportedOperationException("Updates not supported")
            } else {
                if (change.wasRemoved()) {
                    // If nested lists were removed we iterate over 'indexMap' and adjust the indices accordingly,
                    // remove listeners and remove relevant mappings as well. We also invalidate nested offsets.
                    val iterator = indexMap.iterator()
                    for (entry in iterator) {
                        val (wrapped, pair) = entry
                        val (index, listener) = pair
                        if (index >= change.from) {
                            val removeEnd = change.from + change.removedSize
                            if (index < removeEnd) {
                                wrapped.observableList.removeListener(listener)
                                iterator.remove()
                            } else {
                                entry.setValue(Pair(index - change.removedSize, listener))
                            }
                        }
                    }
                    // Propagate changes
                    invalidateOffsets(change.from)
                    val removeStart = startingOffsetOf(change.from)
                    val removed = change.removed.flatMap { it }
                    nextRemove(removeStart, removed)
                }
                if (change.wasAdded()) {
                    // Update indexMap
                    if (change.from != indexMap.size) {
                        val iterator = indexMap.iterator()
                        for (entry in iterator) {
                            val (index, listener) = entry.value
                            if (index >= change.from) {
                                // Shift indices
                                entry.setValue(Pair(index + change.addedSize, listener))
                            }
                        }
                    }
                    change.addedSubList.forEachIndexed { sublistIndex, observableList ->
                        val wrapped = WrappedObservableList(observableList)
                        indexMap[wrapped] = Pair(change.from + sublistIndex, createListener(wrapped))
                    }
                    invalidateOffsets(change.from)
                    // We recalculate offsets early as we need the range anyway.
                    recalculateOffsets()
                    nextAdd(startingOffsetOf(change.from), nestedIndexOffsets[change.to - 1])
                }
            }' @ [176:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [176:24] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'wasUpdated' @ [176:31] ==> public open fun wasUpdated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'UnsupportedOperationException' @ [178:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'change' @ [180:21] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'wasRemoved' @ [180:28] ==> public open fun wasRemoved(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'indexMap' @ [183:36] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'iterator' @ [183:45] ==> @JvmName @InlineOnly public operator inline fun <K, V> MutableMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>.iterator(): MutableIterator<MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrappedObservableList<out A>
    <V> -> Pair<Int, ListChangeListener<A>>

'iterator' @ [184:35] ==> val iterator: MutableIterator<MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'component1' @ [185:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>.component1(): ConcatenatedList.WrappedObservableList<out A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrappedObservableList<out A>
    <V> -> Pair<Int, ListChangeListener<A>>

'component2' @ [185:39] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>.component2(): Pair<Int, ListChangeListener<A>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrappedObservableList<out A>
    <V> -> Pair<Int, ListChangeListener<A>>

'entry' @ [185:47] ==> val entry: MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'component1' @ [186:30] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [186:37] ==> public final operator fun component2(): ListChangeListener<A> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'pair' @ [186:49] ==> val pair: Pair<Int, ListChangeListener<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'index' @ [187:29] ==> val index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'change' @ [187:38] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [187:45] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'change' @ [188:45] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [188:52] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'change' @ [188:59] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'removedSize' @ [188:66] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.removedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'if (index < removeEnd) {
                                wrapped.observableList.removeListener(listener)
                                iterator.remove()
                            } else {
                                entry.setValue(Pair(index - change.removedSize, listener))
                            }' @ [189:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'index' @ [189:33] ==> val index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'removeEnd' @ [189:41] ==> val removeEnd: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'wrapped' @ [190:33] ==> val wrapped: ConcatenatedList.WrappedObservableList<out A> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'observableList' @ [190:41] ==> public final val observableList: ObservableList<out A> defined in net.corda.client.jfx.utils.ConcatenatedList.WrappedObservableList[PropertyDescriptorImpl]

'removeListener' @ [190:56] ==> public abstract fun removeListener(p0: (ListChangeListener<in (A..A?)>..ListChangeListener<in (A..A?)>?)): Unit defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'listener' @ [190:71] ==> val listener: ListChangeListener<A> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'iterator' @ [191:33] ==> val iterator: MutableIterator<MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'remove' @ [191:42] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'entry' @ [193:33] ==> val entry: MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'setValue' @ [193:39] ==> public abstract fun setValue(newValue: Pair<Int, ListChangeListener<A>>): Pair<Int, ListChangeListener<A>> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedSimpleFunctionDescriptor]

'Pair' @ [193:48] ==> public constructor Pair<out A, out B>(first: Int, second: ListChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ListChangeListener<A>

'index' @ [193:53] ==> val index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'change' @ [193:61] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'removedSize' @ [193:68] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.removedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'listener' @ [193:81] ==> val listener: ListChangeListener<A> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'invalidateOffsets' @ [198:21] ==> private final fun invalidateOffsets(index: Int): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'change' @ [198:39] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [198:46] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'startingOffsetOf' @ [199:39] ==> private final fun startingOffsetOf(listIndex: Int): Int defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'change' @ [199:56] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [199:63] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'change' @ [200:35] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'removed' @ [200:42] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.removed: (MutableList<out (ObservableList<A>..ObservableList<A>?)>..List<(ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'flatMap' @ [200:50] ==> public inline fun <T, R> Iterable<(ObservableList<A>..ObservableList<A>?)>.flatMap(transform: ((ObservableList<A>..ObservableList<A>?)) -> Iterable<(A..A?)>): List<(A..A?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javafx.collections.ObservableList<A>..javafx.collections.ObservableList<A>?)
    <R> -> (A..A?)

'it' @ [200:60] ==> value-parameter it: (ObservableList<A>..ObservableList<A>?) defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'nextRemove' @ [201:21] ==> protected/*protected and package*/ final fun nextRemove(p0: Int, p1: (MutableList<out (A..A?)>..List<(A..A?)>?)): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'removeStart' @ [201:32] ==> val removeStart: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'removed' @ [201:45] ==> val removed: List<(A..A?)> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'change' @ [203:21] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'wasAdded' @ [203:28] ==> public open fun wasAdded(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'change' @ [205:25] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [205:32] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'indexMap' @ [205:40] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'size' @ [205:49] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'indexMap' @ [206:40] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'iterator' @ [206:49] ==> @JvmName @InlineOnly public operator inline fun <K, V> MutableMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>.iterator(): MutableIterator<MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrappedObservableList<out A>
    <V> -> Pair<Int, ListChangeListener<A>>

'iterator' @ [207:39] ==> val iterator: MutableIterator<MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'component1' @ [208:34] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [208:41] ==> public final operator fun component2(): ListChangeListener<A> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'entry' @ [208:53] ==> val entry: MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'value' @ [208:59] ==> public abstract val value: Pair<Int, ListChangeListener<A>> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'index' @ [209:33] ==> val index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'change' @ [209:42] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [209:49] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'entry' @ [211:33] ==> val entry: MutableMap.MutableEntry<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'setValue' @ [211:39] ==> public abstract fun setValue(newValue: Pair<Int, ListChangeListener<A>>): Pair<Int, ListChangeListener<A>> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedSimpleFunctionDescriptor]

'Pair' @ [211:48] ==> public constructor Pair<out A, out B>(first: Int, second: ListChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ListChangeListener<A>

'index' @ [211:53] ==> val index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'change' @ [211:61] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'addedSize' @ [211:68] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.addedSize: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'listener' @ [211:79] ==> val listener: ListChangeListener<A> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[LocalVariableDescriptor]

'change' @ [215:21] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'addedSubList' @ [215:28] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.addedSubList: (MutableList<out (ObservableList<A>..ObservableList<A>?)>..List<(ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'forEachIndexed' @ [215:41] ==> public inline fun <T> Iterable<(ObservableList<A>..ObservableList<A>?)>.forEachIndexed(action: (index: Int, (ObservableList<A>..ObservableList<A>?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javafx.collections.ObservableList<A>..javafx.collections.ObservableList<A>?)

'WrappedObservableList' @ [216:39] ==> public constructor WrappedObservableList<A>(observableList: ObservableList<A>) defined in net.corda.client.jfx.utils.ConcatenatedList.WrappedObservableList[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> A

'observableList' @ [216:61] ==> value-parameter observableList: (ObservableList<A>..ObservableList<A>?) defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'indexMap' @ [217:25] ==> @VisibleForTesting internal final val indexMap: HashMap<ConcatenatedList.WrappedObservableList<out A>, Pair<Int, ListChangeListener<A>>> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'wrapped' @ [217:34] ==> val wrapped: ConcatenatedList.WrappedObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged.<anonymous>[LocalVariableDescriptor]

'Pair' @ [217:45] ==> public constructor Pair<out A, out B>(first: Int, second: ListChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ListChangeListener<A>

'change' @ [217:50] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [217:57] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'sublistIndex' @ [217:64] ==> value-parameter sublistIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'createListener' @ [217:78] ==> private final fun createListener(wrapped: ConcatenatedList.WrappedObservableList<A>): ListChangeListener<A> defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'wrapped' @ [217:93] ==> val wrapped: ConcatenatedList.WrappedObservableList<A> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged.<anonymous>[LocalVariableDescriptor]

'invalidateOffsets' @ [219:21] ==> private final fun invalidateOffsets(index: Int): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'change' @ [219:39] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [219:46] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'recalculateOffsets' @ [221:21] ==> private final fun recalculateOffsets(): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'nextAdd' @ [222:21] ==> protected/*protected and package*/ final fun nextAdd(p0: Int, p1: Int): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'startingOffsetOf' @ [222:29] ==> private final fun startingOffsetOf(listIndex: Int): Int defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'change' @ [222:46] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [222:53] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'nestedIndexOffsets' @ [222:60] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'change' @ [222:79] ==> value-parameter change: ListChangeListener.Change<out ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [222:86] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableList<A>>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableList<A>)

'recalculateOffsets' @ [225:13] ==> private final fun recalculateOffsets(): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'endChange' @ [227:9] ==> protected/*protected and package*/ final fun endChange(): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[JavaMethodDescriptor]

'sourceList' @ [231:44] ==> value-parameter sourceList: ObservableList<ObservableList<A>> defined in net.corda.client.jfx.utils.ConcatenatedList.<init>[ValueParameterDescriptorImpl]

'size' @ [231:55] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'firstInvalidatedPosition' @ [234:9] ==> private final var firstInvalidatedPosition: Int defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'min' @ [234:41] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'firstInvalidatedPosition' @ [234:45] ==> private final var firstInvalidatedPosition: Int defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'index' @ [234:71] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.invalidateOffsets[ValueParameterDescriptorImpl]

'firstInvalidatedPosition' @ [238:13] ==> private final var firstInvalidatedPosition: Int defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'source' @ [238:40] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'size' @ [238:47] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'firstInvalidatedPosition' @ [239:32] ==> private final var firstInvalidatedPosition: Int defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'if (firstInvalid == 0) 0 else nestedIndexOffsets[firstInvalid - 1]' @ [240:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'firstInvalid' @ [240:30] ==> val firstInvalid: Int defined in net.corda.client.jfx.utils.ConcatenatedList.recalculateOffsets[LocalVariableDescriptor]

'nestedIndexOffsets' @ [240:56] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'firstInvalid' @ [240:75] ==> val firstInvalid: Int defined in net.corda.client.jfx.utils.ConcatenatedList.recalculateOffsets[LocalVariableDescriptor]

'firstInvalid' @ [241:23] ==> val firstInvalid: Int defined in net.corda.client.jfx.utils.ConcatenatedList.recalculateOffsets[LocalVariableDescriptor]

'source' @ [241:37] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'size' @ [241:44] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'offset' @ [242:17] ==> var offset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.recalculateOffsets[LocalVariableDescriptor]

'source' @ [242:27] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'i' @ [242:34] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.recalculateOffsets[LocalVariableDescriptor]

'size' @ [242:37] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'if (i < nestedIndexOffsets.size) {
                    nestedIndexOffsets[i] = offset
                } else {
                    nestedIndexOffsets.add(offset)
                }' @ [243:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'i' @ [243:21] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.recalculateOffsets[LocalVariableDescriptor]

'nestedIndexOffsets' @ [243:25] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'size' @ [243:44] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'nestedIndexOffsets' @ [244:21] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'i' @ [244:40] ==> val i: Int defined in net.corda.client.jfx.utils.ConcatenatedList.recalculateOffsets[LocalVariableDescriptor]

'offset' @ [244:45] ==> var offset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.recalculateOffsets[LocalVariableDescriptor]

'nestedIndexOffsets' @ [246:21] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'add' @ [246:40] ==> public open fun add(element: Int): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'offset' @ [246:44] ==> var offset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.recalculateOffsets[LocalVariableDescriptor]

'nestedIndexOffsets' @ [249:20] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'size' @ [249:39] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'source' @ [249:46] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'size' @ [249:53] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'nestedIndexOffsets' @ [250:17] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'removeAt' @ [250:36] ==> public open fun removeAt(p0: Int): Int defined in java.util.ArrayList[JavaMethodDescriptor]

'source' @ [250:45] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'size' @ [250:52] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'firstInvalidatedPosition' @ [252:13] ==> private final var firstInvalidatedPosition: Int defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'nestedIndexOffsets' @ [252:40] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'size' @ [252:59] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'recalculateOffsets' @ [257:9] ==> private final fun recalculateOffsets(): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'if (nestedIndexOffsets.size > 0) {
            return nestedIndexOffsets.last()
        } else {
            return 0
        }' @ [258:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'nestedIndexOffsets' @ [258:13] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'size' @ [258:32] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'nestedIndexOffsets' @ [259:20] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'last' @ [259:39] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'UnsupportedOperationException' @ [266:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'recalculateOffsets' @ [270:9] ==> private final fun recalculateOffsets(): Unit defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'nestedIndexOffsets' @ [271:25] ==> @VisibleForTesting internal final val nestedIndexOffsets: ArrayList<Int> defined in net.corda.client.jfx.utils.ConcatenatedList[PropertyDescriptorImpl]

'binarySearch' @ [271:44] ==> public fun <T> List<Int>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: (Int) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'compareValues' @ [272:42] ==> public fun <T : Comparable<*>> compareValues(a: Int?, b: Int?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Int

'offset' @ [272:56] ==> value-parameter offset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [272:64] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[ValueParameterDescriptorImpl]

'if (listIndex >= 0) {
            var nonEmptyListIndex = listIndex + 1
            while (source[nonEmptyListIndex].isEmpty()) {
                nonEmptyListIndex++
            }
            return source[nonEmptyListIndex][0]
        } else {
            // The element is in the range of this list
            val rangeListIndex = -listIndex - 1
            val subListOffset = index - startingOffsetOf(rangeListIndex)
            return source[rangeListIndex][subListOffset]
        }' @ [275:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'listIndex' @ [275:13] ==> val listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[LocalVariableDescriptor]

'listIndex' @ [276:37] ==> val listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[LocalVariableDescriptor]

'source' @ [277:20] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'nonEmptyListIndex' @ [277:27] ==> var nonEmptyListIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[LocalVariableDescriptor]

'isEmpty' @ [277:46] ==> public abstract fun isEmpty(): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'nonEmptyListIndex' @ [278:17] ==> var nonEmptyListIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[LocalVariableDescriptor]

'source' @ [280:20] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'nonEmptyListIndex' @ [280:27] ==> var nonEmptyListIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[LocalVariableDescriptor]

'-' @ [283:34] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listIndex' @ [283:35] ==> val listIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[LocalVariableDescriptor]

'index' @ [284:33] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[ValueParameterDescriptorImpl]

'startingOffsetOf' @ [284:41] ==> private final fun startingOffsetOf(listIndex: Int): Int defined in net.corda.client.jfx.utils.ConcatenatedList[SimpleFunctionDescriptorImpl]

'rangeListIndex' @ [284:58] ==> val rangeListIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[LocalVariableDescriptor]

'source' @ [285:20] ==> public final val <A> ConcatenatedList<A>.source: (ObservableList<out (ObservableList<A>..ObservableList<A>?)>..ObservableList<out (ObservableList<A>..ObservableList<A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <A> -> A

'rangeListIndex' @ [285:27] ==> val rangeListIndex: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[LocalVariableDescriptor]

'subListOffset' @ [285:43] ==> val subListOffset: Int defined in net.corda.client.jfx.utils.ConcatenatedList.get[LocalVariableDescriptor]

