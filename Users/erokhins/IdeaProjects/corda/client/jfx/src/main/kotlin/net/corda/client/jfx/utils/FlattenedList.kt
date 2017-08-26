'TransformationList<A, ObservableValue<out A>>' @ [14:86] ==> protected/*protected and package*/ constructor TransformationList<E : (Any..Any?), F : (Any..Any?)>(p0: (ObservableList<out (ObservableValue<out A>..ObservableValue<out A>?)>..ObservableList<out (ObservableValue<out A>..ObservableValue<out A>?)>?)) defined in javafx.collections.transformation.TransformationList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A
    <F : (Any..Any?)> -> ObservableValue<out A>

'sourceList' @ [14:132] ==> value-parameter sourceList: ObservableList<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.<init>[ValueParameterDescriptorImpl]

'HashMap' @ [31:20] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> WrappedObservableValue<out A>
    <V : (Any..Any?)> -> Pair<Int, ChangeListener<A>>

'sourceList' @ [34:9] ==> public final val sourceList: ObservableList<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'forEachIndexed' @ [34:20] ==> public inline fun <T> Iterable<(ObservableValue<out A>..ObservableValue<out A>?)>.forEachIndexed(action: (index: Int, (ObservableValue<out A>..ObservableValue<out A>?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javafx.beans.value.ObservableValue<out A>..javafx.beans.value.ObservableValue<out A>?)

'WrappedObservableValue' @ [35:42] ==> public constructor WrappedObservableValue<A>(observableValue: ObservableValue<out A>) defined in net.corda.client.jfx.utils.FlattenedList.WrappedObservableValue[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> Captured(out A)

'observableValue' @ [35:65] ==> value-parameter observableValue: (ObservableValue<out A>..ObservableValue<out A>?) defined in net.corda.client.jfx.utils.FlattenedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'indexMap' @ [36:13] ==> public final val indexMap: HashMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'wrappedObservableValue' @ [36:22] ==> val wrappedObservableValue: FlattenedList.WrappedObservableValue<out A> defined in net.corda.client.jfx.utils.FlattenedList.<init>.<anonymous>[LocalVariableDescriptor]

'Pair' @ [36:48] ==> public constructor Pair<out A, out B>(first: Int, second: ChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ChangeListener<A>

'index' @ [36:53] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.FlattenedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'createListener' @ [36:60] ==> private final fun createListener(wrapped: FlattenedList.WrappedObservableValue<out A>): ChangeListener<A> defined in net.corda.client.jfx.utils.FlattenedList[SimpleFunctionDescriptorImpl]

'wrappedObservableValue' @ [36:75] ==> val wrappedObservableValue: FlattenedList.WrappedObservableValue<out A> defined in net.corda.client.jfx.utils.FlattenedList.<init>.<anonymous>[LocalVariableDescriptor]

'ChangeListener' @ [41:24] ==> @FunctionalInterface public fun <T : (Any..Any?)> ChangeListener(function: ((ObservableValue<out (A..A?)>..ObservableValue<out (A..A?)>?), (A..A?), (A..A?)) -> Unit): ChangeListener<A> defined in javafx.beans.value[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> A

'indexMap' @ [42:32] ==> public final val indexMap: HashMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'wrapped' @ [42:41] ==> value-parameter wrapped: FlattenedList.WrappedObservableValue<out A> defined in net.corda.client.jfx.utils.FlattenedList.createListener[ValueParameterDescriptorImpl]

'first' @ [42:52] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'beginChange' @ [43:13] ==> protected/*protected and package*/ final fun beginChange(): Unit defined in net.corda.client.jfx.utils.FlattenedList[JavaMethodDescriptor]

'nextReplace' @ [44:13] ==> protected/*protected and package*/ final fun nextReplace(p0: Int, p1: Int, p2: (MutableList<out (A..A?)>..List<(A..A?)>?)): Unit defined in net.corda.client.jfx.utils.FlattenedList[JavaMethodDescriptor]

'currentIndex' @ [44:25] ==> val currentIndex: Int defined in net.corda.client.jfx.utils.FlattenedList.createListener.<anonymous>[LocalVariableDescriptor]

'currentIndex' @ [44:39] ==> val currentIndex: Int defined in net.corda.client.jfx.utils.FlattenedList.createListener.<anonymous>[LocalVariableDescriptor]

'listOf' @ [44:57] ==> public fun <T> listOf(element: (A..A?)): List<(A..A?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (A..A?)

'oldValue' @ [44:64] ==> value-parameter oldValue: (A..A?) defined in net.corda.client.jfx.utils.FlattenedList.createListener.<anonymous>[ValueParameterDescriptorImpl]

'endChange' @ [45:13] ==> protected/*protected and package*/ final fun endChange(): Unit defined in net.corda.client.jfx.utils.FlattenedList[JavaMethodDescriptor]

'wrapped' @ [47:9] ==> value-parameter wrapped: FlattenedList.WrappedObservableValue<out A> defined in net.corda.client.jfx.utils.FlattenedList.createListener[ValueParameterDescriptorImpl]

'observableValue' @ [47:17] ==> public final val observableValue: ObservableValue<out A> defined in net.corda.client.jfx.utils.FlattenedList.WrappedObservableValue[PropertyDescriptorImpl]

'addListener' @ [47:33] ==> public abstract fun addListener(p0: (ChangeListener<in (A..A?)>..ChangeListener<in (A..A?)>?)): Unit defined in javafx.beans.value.ObservableValue[JavaMethodDescriptor]

'listener' @ [47:45] ==> val listener: ChangeListener<A> defined in net.corda.client.jfx.utils.FlattenedList.createListener[LocalVariableDescriptor]

'listener' @ [48:16] ==> val listener: ChangeListener<A> defined in net.corda.client.jfx.utils.FlattenedList.createListener[LocalVariableDescriptor]

'beginChange' @ [52:9] ==> protected/*protected and package*/ final fun beginChange(): Unit defined in net.corda.client.jfx.utils.FlattenedList[JavaMethodDescriptor]

'c' @ [53:16] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'next' @ [53:18] ==> public abstract operator fun next(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'if (c.wasPermutated()) {
                val from = c.from
                val to = c.to
                val permutation = IntArray(to, { c.getPermutation(it) })
                indexMap.replaceAll { _, pair -> Pair(permutation[pair.first], pair.second) }
                nextPermutation(from, to, permutation)
            } else if (c.wasUpdated()) {
                throw UnsupportedOperationException("FlattenedList doesn't support Update changes")
            } else {
                val removed = c.removed
                if (removed.size != 0) {
                    // TODO this assumes that if wasAdded() == true then we are adding elements to the getFrom() position
                    val removeStart = c.from
                    val removeRange = c.removed.size
                    val removeEnd = c.from + removeRange
                    val iterator = indexMap.iterator()
                    for (entry in iterator) {
                        val (wrapped, pair) = entry
                        val (index, listener) = pair
                        if (index >= removeStart) {
                            if (index < removeEnd) {
                                wrapped.observableValue.removeListener(listener)
                                iterator.remove()
                            } else {
                                // Shift indices
                                entry.setValue(Pair(index - removeRange, listener))
                            }
                        }
                    }
                    nextRemove(removeStart, removed.map { it.value })
                }
                if (c.wasAdded()) {
                    val addStart = c.from
                    val addEnd = c.to
                    val addRange = addEnd - addStart
                    // If it was a push to the end we don't need to shift indices
                    if (addStart != indexMap.size) {
                        val iterator = indexMap.iterator()
                        for (entry in iterator) {
                            val (index, listener) = entry.value
                            if (index >= addStart) {
                                // Shift indices
                                entry.setValue(Pair(index + addRange, listener))
                            }
                        }
                    }
                    c.addedSubList.forEachIndexed { sublistIndex, observableValue ->
                        val wrapped = WrappedObservableValue(observableValue)
                        indexMap[wrapped] = Pair(addStart + sublistIndex, createListener(wrapped))
                    }
                    nextAdd(addStart, addEnd)
                }
            }' @ [54:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'c' @ [54:17] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'wasPermutated' @ [54:19] ==> public open fun wasPermutated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'c' @ [55:28] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [55:30] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableValue<out A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableValue<out A>)

'c' @ [56:26] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [56:28] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableValue<out A>>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableValue<out A>)

'IntArray' @ [57:35] ==> public constructor IntArray(size: Int, init: (Int) -> Int) defined in kotlin.IntArray[DeserializedClassConstructorDescriptor]

'to' @ [57:44] ==> val to: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'c' @ [57:50] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'getPermutation' @ [57:52] ==> public open fun getPermutation(p0: Int): Int defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'it' @ [57:67] ==> value-parameter it: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'indexMap' @ [58:17] ==> public final val indexMap: HashMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'replaceAll' @ [58:26] ==> public final fun replaceAll(p0: (FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>) -> Pair<Int, ChangeListener<A>>): Unit defined in java.util.HashMap[MyFunctionDescriptor]

'Pair' @ [58:50] ==> public constructor Pair<out A, out B>(first: Int, second: ChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ChangeListener<A>

'permutation' @ [58:55] ==> val permutation: IntArray defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'pair' @ [58:67] ==> value-parameter pair: Pair<Int, ChangeListener<A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [58:72] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'pair' @ [58:80] ==> value-parameter pair: Pair<Int, ChangeListener<A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [58:85] ==> public final val second: ChangeListener<A> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'nextPermutation' @ [59:17] ==> protected/*protected and package*/ final fun nextPermutation(p0: Int, p1: Int, p2: (IntArray..IntArray?)): Unit defined in net.corda.client.jfx.utils.FlattenedList[JavaMethodDescriptor]

'from' @ [59:33] ==> val from: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'to' @ [59:39] ==> val to: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'permutation' @ [59:43] ==> val permutation: IntArray defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'if (c.wasUpdated()) {
                throw UnsupportedOperationException("FlattenedList doesn't support Update changes")
            } else {
                val removed = c.removed
                if (removed.size != 0) {
                    // TODO this assumes that if wasAdded() == true then we are adding elements to the getFrom() position
                    val removeStart = c.from
                    val removeRange = c.removed.size
                    val removeEnd = c.from + removeRange
                    val iterator = indexMap.iterator()
                    for (entry in iterator) {
                        val (wrapped, pair) = entry
                        val (index, listener) = pair
                        if (index >= removeStart) {
                            if (index < removeEnd) {
                                wrapped.observableValue.removeListener(listener)
                                iterator.remove()
                            } else {
                                // Shift indices
                                entry.setValue(Pair(index - removeRange, listener))
                            }
                        }
                    }
                    nextRemove(removeStart, removed.map { it.value })
                }
                if (c.wasAdded()) {
                    val addStart = c.from
                    val addEnd = c.to
                    val addRange = addEnd - addStart
                    // If it was a push to the end we don't need to shift indices
                    if (addStart != indexMap.size) {
                        val iterator = indexMap.iterator()
                        for (entry in iterator) {
                            val (index, listener) = entry.value
                            if (index >= addStart) {
                                // Shift indices
                                entry.setValue(Pair(index + addRange, listener))
                            }
                        }
                    }
                    c.addedSubList.forEachIndexed { sublistIndex, observableValue ->
                        val wrapped = WrappedObservableValue(observableValue)
                        indexMap[wrapped] = Pair(addStart + sublistIndex, createListener(wrapped))
                    }
                    nextAdd(addStart, addEnd)
                }
            }' @ [60:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'c' @ [60:24] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'wasUpdated' @ [60:26] ==> public open fun wasUpdated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'UnsupportedOperationException' @ [61:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'c' @ [63:31] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'removed' @ [63:33] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableValue<out A>>.removed: (MutableList<out (ObservableValue<out A>..ObservableValue<out A>?)>..List<(ObservableValue<out A>..ObservableValue<out A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableValue<out A>)

'removed' @ [64:21] ==> val removed: (MutableList<out (ObservableValue<out A>..ObservableValue<out A>?)>..List<(ObservableValue<out A>..ObservableValue<out A>?)>?) defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'size' @ [64:29] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'c' @ [66:39] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [66:41] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableValue<out A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableValue<out A>)

'c' @ [67:39] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'removed' @ [67:41] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableValue<out A>>.removed: (MutableList<out (ObservableValue<out A>..ObservableValue<out A>?)>..List<(ObservableValue<out A>..ObservableValue<out A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableValue<out A>)

'size' @ [67:49] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'c' @ [68:37] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [68:39] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableValue<out A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableValue<out A>)

'removeRange' @ [68:46] ==> val removeRange: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'indexMap' @ [69:36] ==> public final val indexMap: HashMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'iterator' @ [69:45] ==> @JvmName @InlineOnly public operator inline fun <K, V> MutableMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>>.iterator(): MutableIterator<MutableMap.MutableEntry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrappedObservableValue<out A>
    <V> -> Pair<Int, ChangeListener<A>>

'iterator' @ [70:35] ==> val iterator: MutableIterator<MutableMap.MutableEntry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'component1' @ [71:30] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>>.component1(): FlattenedList.WrappedObservableValue<out A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrappedObservableValue<out A>
    <V> -> Pair<Int, ChangeListener<A>>

'component2' @ [71:39] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>>.component2(): Pair<Int, ChangeListener<A>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrappedObservableValue<out A>
    <V> -> Pair<Int, ChangeListener<A>>

'entry' @ [71:47] ==> val entry: MutableMap.MutableEntry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'component1' @ [72:30] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [72:37] ==> public final operator fun component2(): ChangeListener<A> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'pair' @ [72:49] ==> val pair: Pair<Int, ChangeListener<A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'index' @ [73:29] ==> val index: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'removeStart' @ [73:38] ==> val removeStart: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'if (index < removeEnd) {
                                wrapped.observableValue.removeListener(listener)
                                iterator.remove()
                            } else {
                                // Shift indices
                                entry.setValue(Pair(index - removeRange, listener))
                            }' @ [74:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'index' @ [74:33] ==> val index: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'removeEnd' @ [74:41] ==> val removeEnd: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'wrapped' @ [75:33] ==> val wrapped: FlattenedList.WrappedObservableValue<out A> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'observableValue' @ [75:41] ==> public final val observableValue: ObservableValue<out A> defined in net.corda.client.jfx.utils.FlattenedList.WrappedObservableValue[PropertyDescriptorImpl]

'removeListener' @ [75:57] ==> public abstract fun removeListener(p0: (ChangeListener<in (A..A?)>..ChangeListener<in (A..A?)>?)): Unit defined in javafx.beans.value.ObservableValue[JavaMethodDescriptor]

'listener' @ [75:72] ==> val listener: ChangeListener<A> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'iterator' @ [76:33] ==> val iterator: MutableIterator<MutableMap.MutableEntry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'remove' @ [76:42] ==> public abstract fun remove(): Unit defined in kotlin.collections.MutableIterator[DeserializedSimpleFunctionDescriptor]

'entry' @ [79:33] ==> val entry: MutableMap.MutableEntry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'setValue' @ [79:39] ==> public abstract fun setValue(newValue: Pair<Int, ChangeListener<A>>): Pair<Int, ChangeListener<A>> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedSimpleFunctionDescriptor]

'Pair' @ [79:48] ==> public constructor Pair<out A, out B>(first: Int, second: ChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ChangeListener<A>

'index' @ [79:53] ==> val index: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'removeRange' @ [79:61] ==> val removeRange: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'listener' @ [79:74] ==> val listener: ChangeListener<A> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'nextRemove' @ [83:21] ==> protected/*protected and package*/ final fun nextRemove(p0: Int, p1: (MutableList<out (A..A?)>..List<(A..A?)>?)): Unit defined in net.corda.client.jfx.utils.FlattenedList[JavaMethodDescriptor]

'removeStart' @ [83:32] ==> val removeStart: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'removed' @ [83:45] ==> val removed: (MutableList<out (ObservableValue<out A>..ObservableValue<out A>?)>..List<(ObservableValue<out A>..ObservableValue<out A>?)>?) defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'map' @ [83:53] ==> public inline fun <T, R> Iterable<(ObservableValue<out A>..ObservableValue<out A>?)>.map(transform: ((ObservableValue<out A>..ObservableValue<out A>?)) -> (A..A?)): List<(A..A?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javafx.beans.value.ObservableValue<out A>..javafx.beans.value.ObservableValue<out A>?)
    <R> -> (A..A?)

'it' @ [83:59] ==> value-parameter it: (ObservableValue<out A>..ObservableValue<out A>?) defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [83:62] ==> public final val <T : (Any..Any?)> ObservableValue<out A>.value: (A..A?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out A)

'c' @ [85:21] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'wasAdded' @ [85:23] ==> public open fun wasAdded(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'c' @ [86:36] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'from' @ [86:38] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableValue<out A>>.from: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableValue<out A>)

'c' @ [87:34] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'to' @ [87:36] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableValue<out A>>.to: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableValue<out A>)

'addEnd' @ [88:36] ==> val addEnd: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'addStart' @ [88:45] ==> val addStart: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'addStart' @ [90:25] ==> val addStart: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'indexMap' @ [90:37] ==> public final val indexMap: HashMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'size' @ [90:46] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'indexMap' @ [91:40] ==> public final val indexMap: HashMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'iterator' @ [91:49] ==> @JvmName @InlineOnly public operator inline fun <K, V> MutableMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>>.iterator(): MutableIterator<MutableMap.MutableEntry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> WrappedObservableValue<out A>
    <V> -> Pair<Int, ChangeListener<A>>

'iterator' @ [92:39] ==> val iterator: MutableIterator<MutableMap.MutableEntry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'component1' @ [93:34] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [93:41] ==> public final operator fun component2(): ChangeListener<A> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'entry' @ [93:53] ==> val entry: MutableMap.MutableEntry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'value' @ [93:59] ==> public abstract val value: Pair<Int, ChangeListener<A>> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'index' @ [94:33] ==> val index: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'addStart' @ [94:42] ==> val addStart: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'entry' @ [96:33] ==> val entry: MutableMap.MutableEntry<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'setValue' @ [96:39] ==> public abstract fun setValue(newValue: Pair<Int, ChangeListener<A>>): Pair<Int, ChangeListener<A>> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedSimpleFunctionDescriptor]

'Pair' @ [96:48] ==> public constructor Pair<out A, out B>(first: Int, second: ChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ChangeListener<A>

'index' @ [96:53] ==> val index: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'addRange' @ [96:61] ==> val addRange: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'listener' @ [96:71] ==> val listener: ChangeListener<A> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'c' @ [100:21] ==> value-parameter c: ListChangeListener.Change<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[ValueParameterDescriptorImpl]

'addedSubList' @ [100:23] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out ObservableValue<out A>>.addedSubList: (MutableList<out (ObservableValue<out A>..ObservableValue<out A>?)>..List<(ObservableValue<out A>..ObservableValue<out A>?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out ObservableValue<out A>)

'forEachIndexed' @ [100:36] ==> public inline fun <T> Iterable<(ObservableValue<out A>..ObservableValue<out A>?)>.forEachIndexed(action: (index: Int, (ObservableValue<out A>..ObservableValue<out A>?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javafx.beans.value.ObservableValue<out A>..javafx.beans.value.ObservableValue<out A>?)

'WrappedObservableValue' @ [101:39] ==> public constructor WrappedObservableValue<A>(observableValue: ObservableValue<out A>) defined in net.corda.client.jfx.utils.FlattenedList.WrappedObservableValue[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> Captured(out A)

'observableValue' @ [101:62] ==> value-parameter observableValue: (ObservableValue<out A>..ObservableValue<out A>?) defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'indexMap' @ [102:25] ==> public final val indexMap: HashMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'wrapped' @ [102:34] ==> val wrapped: FlattenedList.WrappedObservableValue<out A> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged.<anonymous>[LocalVariableDescriptor]

'Pair' @ [102:45] ==> public constructor Pair<out A, out B>(first: Int, second: ChangeListener<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> ChangeListener<A>

'addStart' @ [102:50] ==> val addStart: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'sublistIndex' @ [102:61] ==> value-parameter sublistIndex: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged.<anonymous>[ValueParameterDescriptorImpl]

'createListener' @ [102:75] ==> private final fun createListener(wrapped: FlattenedList.WrappedObservableValue<out A>): ChangeListener<A> defined in net.corda.client.jfx.utils.FlattenedList[SimpleFunctionDescriptorImpl]

'wrapped' @ [102:90] ==> val wrapped: FlattenedList.WrappedObservableValue<out A> defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged.<anonymous>[LocalVariableDescriptor]

'nextAdd' @ [104:21] ==> protected/*protected and package*/ final fun nextAdd(p0: Int, p1: Int): Unit defined in net.corda.client.jfx.utils.FlattenedList[JavaMethodDescriptor]

'addStart' @ [104:29] ==> val addStart: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'addEnd' @ [104:39] ==> val addEnd: Int defined in net.corda.client.jfx.utils.FlattenedList.sourceChanged[LocalVariableDescriptor]

'endChange' @ [108:9] ==> protected/*protected and package*/ final fun endChange(): Unit defined in net.corda.client.jfx.utils.FlattenedList[JavaMethodDescriptor]

'assert' @ [109:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'sourceList' @ [109:16] ==> public final val sourceList: ObservableList<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'size' @ [109:27] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'indexMap' @ [109:35] ==> public final val indexMap: HashMap<FlattenedList.WrappedObservableValue<out A>, Pair<Int, ChangeListener<A>>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'size' @ [109:44] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'sourceList' @ [112:36] ==> public final val sourceList: ObservableList<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'get' @ [112:47] ==> public abstract fun get(index: Int): (ObservableValue<out A>..ObservableValue<out A>?) defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'index' @ [112:51] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.FlattenedList.get[ValueParameterDescriptorImpl]

'value' @ [112:58] ==> public final val <T : (Any..Any?)> ObservableValue<out A>.value: (A..A?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out A)

'index' @ [114:47] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.FlattenedList.getSourceIndex[ValueParameterDescriptorImpl]

'sourceList' @ [116:36] ==> public final val sourceList: ObservableList<out ObservableValue<out A>> defined in net.corda.client.jfx.utils.FlattenedList[PropertyDescriptorImpl]

'size' @ [116:47] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

