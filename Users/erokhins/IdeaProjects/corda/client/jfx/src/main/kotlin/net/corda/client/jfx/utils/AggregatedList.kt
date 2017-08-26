'TransformationList<A, E>' @ [43:5] ==> protected/*protected and package*/ constructor TransformationList<E : (Any..Any?), F : (Any..Any?)>(p0: (ObservableList<out (E..E?)>..ObservableList<out (E..E?)>?)) defined in javafx.collections.transformation.TransformationList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A
    <F : (Any..Any?)> -> E

'list' @ [43:30] ==> value-parameter list: ObservableList<out E> defined in net.corda.client.jfx.utils.AggregatedList.<init>[ValueParameterDescriptorImpl]

'mutableListOf' @ [53:35] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<AggregatedList.AggregationGroup<E, A>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AggregationGroup<E, A>

'list' @ [56:9] ==> value-parameter list: ObservableList<out E> defined in net.corda.client.jfx.utils.AggregatedList.<init>[ValueParameterDescriptorImpl]

'forEach' @ [56:14] ==> @HidesMembers public inline fun <T> Iterable<(E..E?)>.forEach(action: ((E..E?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (E..E?)

'addItem' @ [56:24] ==> private final fun addItem(addedItem: E): Int? defined in net.corda.client.jfx.utils.AggregatedList[SimpleFunctionDescriptorImpl]

'it' @ [56:32] ==> value-parameter it: (E..E?) defined in net.corda.client.jfx.utils.AggregatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'aggregationList' @ [59:40] ==> private final val aggregationList: MutableList<AggregatedList.AggregationGroup<E, A>> defined in net.corda.client.jfx.utils.AggregatedList[PropertyDescriptorImpl]

'getOrNull' @ [59:56] ==> public fun <T> List<AggregatedList.AggregationGroup<E, A>>.getOrNull(index: Int): AggregatedList.AggregationGroup<E, A>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AggregationGroup<E, A>

'index' @ [59:66] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.AggregatedList.get[ValueParameterDescriptorImpl]

'value' @ [59:74] ==> public final val value: A defined in net.corda.client.jfx.utils.AggregatedList.AggregationGroup[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [65:15] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'aggregationList' @ [68:36] ==> private final val aggregationList: MutableList<AggregatedList.AggregationGroup<E, A>> defined in net.corda.client.jfx.utils.AggregatedList[PropertyDescriptorImpl]

'size' @ [68:52] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'beginChange' @ [71:9] ==> protected/*protected and package*/ final fun beginChange(): Unit defined in net.corda.client.jfx.utils.AggregatedList[JavaMethodDescriptor]

'c' @ [72:16] ==> value-parameter c: ListChangeListener.Change<out E> defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[ValueParameterDescriptorImpl]

'next' @ [72:18] ==> public abstract operator fun next(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'if (c.wasPermutated()) {
                // Permutation should not change aggregation
            } else if (c.wasUpdated()) {
                // Update should not change aggregation
            } else {
                for (removedSourceItem in c.removed) {
                    val removedPair = removeItem(removedSourceItem)
                    if (removedPair != null) {
                        nextRemove(removedPair.first, removedPair.second.value)
                    }
                }
                for (addedItem in c.addedSubList) {
                    val insertIndex = addItem(addedItem)
                    if (insertIndex != null) {
                        nextAdd(insertIndex, insertIndex + 1)
                    }
                }
            }' @ [73:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'c' @ [73:17] ==> value-parameter c: ListChangeListener.Change<out E> defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[ValueParameterDescriptorImpl]

'wasPermutated' @ [73:19] ==> public open fun wasPermutated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'if (c.wasUpdated()) {
                // Update should not change aggregation
            } else {
                for (removedSourceItem in c.removed) {
                    val removedPair = removeItem(removedSourceItem)
                    if (removedPair != null) {
                        nextRemove(removedPair.first, removedPair.second.value)
                    }
                }
                for (addedItem in c.addedSubList) {
                    val insertIndex = addItem(addedItem)
                    if (insertIndex != null) {
                        nextAdd(insertIndex, insertIndex + 1)
                    }
                }
            }' @ [75:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'c' @ [75:24] ==> value-parameter c: ListChangeListener.Change<out E> defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[ValueParameterDescriptorImpl]

'wasUpdated' @ [75:26] ==> public open fun wasUpdated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'c' @ [78:43] ==> value-parameter c: ListChangeListener.Change<out E> defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[ValueParameterDescriptorImpl]

'removed' @ [78:45] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out E>.removed: (MutableList<out (E..E?)>..List<(E..E?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out E)

'removeItem' @ [79:39] ==> private final fun removeItem(removedItem: E): Pair<Int, AggregatedList.AggregationGroup<E, A>>? defined in net.corda.client.jfx.utils.AggregatedList[SimpleFunctionDescriptorImpl]

'removedSourceItem' @ [79:50] ==> val removedSourceItem: (E..E?) defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[LocalVariableDescriptor]

'removedPair' @ [80:25] ==> val removedPair: Pair<Int, AggregatedList.AggregationGroup<E, A>>? defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[LocalVariableDescriptor]

'nextRemove' @ [81:25] ==> protected/*protected and package*/ final fun nextRemove(p0: Int, p1: (A..A?)): Unit defined in net.corda.client.jfx.utils.AggregatedList[JavaMethodDescriptor]

'removedPair' @ [81:36] ==> val removedPair: Pair<Int, AggregatedList.AggregationGroup<E, A>>? defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[LocalVariableDescriptor]

'first' @ [81:48] ==> public final val first: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'removedPair' @ [81:55] ==> val removedPair: Pair<Int, AggregatedList.AggregationGroup<E, A>>? defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[LocalVariableDescriptor]

'second' @ [81:67] ==> public final val second: AggregatedList.AggregationGroup<E, A> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'value' @ [81:74] ==> public final val value: A defined in net.corda.client.jfx.utils.AggregatedList.AggregationGroup[PropertyDescriptorImpl]

'c' @ [84:35] ==> value-parameter c: ListChangeListener.Change<out E> defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[ValueParameterDescriptorImpl]

'addedSubList' @ [84:37] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out E>.addedSubList: (MutableList<out (E..E?)>..List<(E..E?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out E)

'addItem' @ [85:39] ==> private final fun addItem(addedItem: E): Int? defined in net.corda.client.jfx.utils.AggregatedList[SimpleFunctionDescriptorImpl]

'addedItem' @ [85:47] ==> val addedItem: (E..E?) defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[LocalVariableDescriptor]

'insertIndex' @ [86:25] ==> val insertIndex: Int? defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[LocalVariableDescriptor]

'nextAdd' @ [87:25] ==> protected/*protected and package*/ final fun nextAdd(p0: Int, p1: Int): Unit defined in net.corda.client.jfx.utils.AggregatedList[JavaMethodDescriptor]

'insertIndex' @ [87:33] ==> val insertIndex: Int? defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[LocalVariableDescriptor]

'insertIndex' @ [87:46] ==> val insertIndex: Int? defined in net.corda.client.jfx.utils.AggregatedList.sourceChanged[LocalVariableDescriptor]

'endChange' @ [92:9] ==> protected/*protected and package*/ final fun endChange(): Unit defined in net.corda.client.jfx.utils.AggregatedList[JavaMethodDescriptor]

'invoke' @ [96:19] ==> public abstract operator fun invoke(p1: E): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'removedItem' @ [96:25] ==> value-parameter removedItem: E defined in net.corda.client.jfx.utils.AggregatedList.removeItem[ValueParameterDescriptorImpl]

'key' @ [97:27] ==> val key: K defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'hashCode' @ [97:31] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'aggregationList' @ [99:21] ==> private final val aggregationList: MutableList<AggregatedList.AggregationGroup<E, A>> defined in net.corda.client.jfx.utils.AggregatedList[PropertyDescriptorImpl]

'binarySearch' @ [99:37] ==> public fun <T> List<AggregatedList.AggregationGroup<E, A>>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: (AggregatedList.AggregationGroup<E, A>) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AggregationGroup<E, A>

'compareValues' @ [100:41] ==> public fun <T : Comparable<*>> compareValues(a: Int?, b: Int?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Int

'keyHashCode' @ [100:55] ==> val keyHashCode: Int defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'group' @ [100:68] ==> value-parameter group: AggregatedList.AggregationGroup<E, A> defined in net.corda.client.jfx.utils.AggregatedList.removeItem.<anonymous>[ValueParameterDescriptorImpl]

'keyHashCode' @ [100:74] ==> public final val keyHashCode: Int defined in net.corda.client.jfx.utils.AggregatedList.AggregationGroup[PropertyDescriptorImpl]

'hashCode' @ [100:86] ==> public open fun hashCode(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (index < 0) {
            throw IllegalStateException("Removed element $removedItem does not map to an existing aggregation")
        } else {
            val aggregationGroup = aggregationList[index]
            if (aggregationGroup.elements.size == 1) {
                return Pair(index, aggregationList.removeAt(index))
            }
            val elementHashCode = removedItem.hashCode()
            val removeIndex = aggregationGroup.elements.binarySearch(
                    comparison = { element -> compareValues(elementHashCode, element.hashCode()) }
            )
            if (removeIndex < 0) {
                throw IllegalStateException("Cannot find removed element $removedItem in group")
            } else {
                aggregationGroup.elements.removeAt(removeIndex)
            }
        }' @ [102:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (E..E?), elseBranch: (E..E?)): (E..E?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (E..E?)

'index' @ [102:13] ==> val index: Int defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'IllegalStateException' @ [103:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'removedItem' @ [103:59] ==> value-parameter removedItem: E defined in net.corda.client.jfx.utils.AggregatedList.removeItem[ValueParameterDescriptorImpl]

'aggregationList' @ [105:36] ==> private final val aggregationList: MutableList<AggregatedList.AggregationGroup<E, A>> defined in net.corda.client.jfx.utils.AggregatedList[PropertyDescriptorImpl]

'index' @ [105:52] ==> val index: Int defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'aggregationGroup' @ [106:17] ==> val aggregationGroup: AggregatedList.AggregationGroup<E, A> defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'elements' @ [106:34] ==> public final val elements: ObservableList<E> defined in net.corda.client.jfx.utils.AggregatedList.AggregationGroup[PropertyDescriptorImpl]

'size' @ [106:43] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'Pair' @ [107:24] ==> public constructor Pair<out A, out B>(first: Int, second: AggregatedList.AggregationGroup<E, A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Int
    <out B> -> AggregationGroup<E, A>

'index' @ [107:29] ==> val index: Int defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'aggregationList' @ [107:36] ==> private final val aggregationList: MutableList<AggregatedList.AggregationGroup<E, A>> defined in net.corda.client.jfx.utils.AggregatedList[PropertyDescriptorImpl]

'removeAt' @ [107:52] ==> public abstract fun removeAt(index: Int): AggregatedList.AggregationGroup<E, A> defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [107:61] ==> val index: Int defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'removedItem' @ [109:35] ==> value-parameter removedItem: E defined in net.corda.client.jfx.utils.AggregatedList.removeItem[ValueParameterDescriptorImpl]

'hashCode' @ [109:47] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'aggregationGroup' @ [110:31] ==> val aggregationGroup: AggregatedList.AggregationGroup<E, A> defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'elements' @ [110:48] ==> public final val elements: ObservableList<E> defined in net.corda.client.jfx.utils.AggregatedList.AggregationGroup[PropertyDescriptorImpl]

'binarySearch' @ [110:57] ==> public fun <T> List<(E..E?)>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: ((E..E?)) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (E..E?)

'compareValues' @ [111:47] ==> public fun <T : Comparable<*>> compareValues(a: Int?, b: Int?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Int

'elementHashCode' @ [111:61] ==> val elementHashCode: Int defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'element' @ [111:78] ==> value-parameter element: (E..E?) defined in net.corda.client.jfx.utils.AggregatedList.removeItem.<anonymous>[ValueParameterDescriptorImpl]

'hashCode' @ [111:86] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'if (removeIndex < 0) {
                throw IllegalStateException("Cannot find removed element $removedItem in group")
            } else {
                aggregationGroup.elements.removeAt(removeIndex)
            }' @ [113:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (E..E?), elseBranch: (E..E?)): (E..E?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (E..E?)

'removeIndex' @ [113:17] ==> val removeIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'IllegalStateException' @ [114:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'removedItem' @ [114:75] ==> value-parameter removedItem: E defined in net.corda.client.jfx.utils.AggregatedList.removeItem[ValueParameterDescriptorImpl]

'aggregationGroup' @ [116:17] ==> val aggregationGroup: AggregatedList.AggregationGroup<E, A> defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'elements' @ [116:34] ==> public final val elements: ObservableList<E> defined in net.corda.client.jfx.utils.AggregatedList.AggregationGroup[PropertyDescriptorImpl]

'removeAt' @ [116:43] ==> public abstract fun removeAt(index: Int): (E..E?) defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'removeIndex' @ [116:52] ==> val removeIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.removeItem[LocalVariableDescriptor]

'invoke' @ [123:19] ==> public abstract operator fun invoke(p1: E): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'addedItem' @ [123:25] ==> value-parameter addedItem: E defined in net.corda.client.jfx.utils.AggregatedList.addItem[ValueParameterDescriptorImpl]

'key' @ [124:27] ==> val key: K defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'hashCode' @ [124:31] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'aggregationList' @ [125:32] ==> private final val aggregationList: MutableList<AggregatedList.AggregationGroup<E, A>> defined in net.corda.client.jfx.utils.AggregatedList[PropertyDescriptorImpl]

'binarySearch' @ [125:48] ==> public fun <T> List<AggregatedList.AggregationGroup<E, A>>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: (AggregatedList.AggregationGroup<E, A>) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AggregationGroup<E, A>

'compareValues' @ [126:41] ==> public fun <T : Comparable<*>> compareValues(a: Int?, b: Int?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Int

'keyHashCode' @ [126:55] ==> val keyHashCode: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'group' @ [126:68] ==> value-parameter group: AggregatedList.AggregationGroup<E, A> defined in net.corda.client.jfx.utils.AggregatedList.addItem.<anonymous>[ValueParameterDescriptorImpl]

'keyHashCode' @ [126:74] ==> public final val keyHashCode: Int defined in net.corda.client.jfx.utils.AggregatedList.AggregationGroup[PropertyDescriptorImpl]

'hashCode' @ [126:86] ==> public open fun hashCode(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (aggregationIndex < 0) {
            // New aggregation
            val observableGroupElements = FXCollections.observableArrayList<E>()
            observableGroupElements.add(addedItem)
            val aggregationGroup = AggregationGroup(
                    keyHashCode = keyHashCode,
                    value = assemble(key, observableGroupElements),
                    elements = observableGroupElements
            )
            val insertIndex = -aggregationIndex - 1
            aggregationList.add(insertIndex, aggregationGroup)
            return insertIndex
        } else {
            val elements = aggregationList[aggregationIndex].elements
            val elementHashCode = addedItem.hashCode()
            val elementIndex = elements.binarySearch(
                    comparison = { element -> compareValues(elementHashCode, element.hashCode()) }
            )
            val addIndex = if (elementIndex < 0) {
                -elementIndex - 1
            } else {
                // There is an existing element with the same hash (which is fine)
                elementIndex
            }
            elements.add(addIndex, addedItem)
            return null
        }' @ [128:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'aggregationIndex' @ [128:13] ==> val aggregationIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'observableArrayList' @ [130:57] ==> public open fun <E : (Any..Any?)> observableArrayList(): (ObservableList<(E..E?)>..ObservableList<(E..E?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> E

'observableGroupElements' @ [131:13] ==> val observableGroupElements: (ObservableList<(E..E?)>..ObservableList<(E..E?)>?) defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'add' @ [131:37] ==> public abstract fun add(element: (E..E?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'addedItem' @ [131:41] ==> value-parameter addedItem: E defined in net.corda.client.jfx.utils.AggregatedList.addItem[ValueParameterDescriptorImpl]

'AggregationGroup' @ [132:36] ==> public constructor AggregationGroup<E, out A>(keyHashCode: Int, value: A, elements: ObservableList<(E..E?)>) defined in net.corda.client.jfx.utils.AggregatedList.AggregationGroup[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> (E..E?)
    <out A> -> A

'keyHashCode' @ [133:35] ==> val keyHashCode: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'invoke' @ [134:29] ==> public abstract operator fun invoke(p1: K, p2: ObservableList<E>): A defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [134:38] ==> val key: K defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'observableGroupElements' @ [134:43] ==> val observableGroupElements: (ObservableList<(E..E?)>..ObservableList<(E..E?)>?) defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'observableGroupElements' @ [135:32] ==> val observableGroupElements: (ObservableList<(E..E?)>..ObservableList<(E..E?)>?) defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'-' @ [137:31] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'aggregationIndex' @ [137:32] ==> val aggregationIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'aggregationList' @ [138:13] ==> private final val aggregationList: MutableList<AggregatedList.AggregationGroup<E, A>> defined in net.corda.client.jfx.utils.AggregatedList[PropertyDescriptorImpl]

'add' @ [138:29] ==> public abstract fun add(index: Int, element: AggregatedList.AggregationGroup<E, A>): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'insertIndex' @ [138:33] ==> val insertIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'aggregationGroup' @ [138:46] ==> val aggregationGroup: AggregatedList.AggregationGroup<(E..E?), A> defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'insertIndex' @ [139:20] ==> val insertIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'aggregationList' @ [141:28] ==> private final val aggregationList: MutableList<AggregatedList.AggregationGroup<E, A>> defined in net.corda.client.jfx.utils.AggregatedList[PropertyDescriptorImpl]

'aggregationIndex' @ [141:44] ==> val aggregationIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'elements' @ [141:62] ==> public final val elements: ObservableList<E> defined in net.corda.client.jfx.utils.AggregatedList.AggregationGroup[PropertyDescriptorImpl]

'addedItem' @ [142:35] ==> value-parameter addedItem: E defined in net.corda.client.jfx.utils.AggregatedList.addItem[ValueParameterDescriptorImpl]

'hashCode' @ [142:45] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'elements' @ [143:32] ==> val elements: ObservableList<E> defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'binarySearch' @ [143:41] ==> public fun <T> List<(E..E?)>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: ((E..E?)) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (E..E?)

'compareValues' @ [144:47] ==> public fun <T : Comparable<*>> compareValues(a: Int?, b: Int?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Int

'elementHashCode' @ [144:61] ==> val elementHashCode: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'element' @ [144:78] ==> value-parameter element: (E..E?) defined in net.corda.client.jfx.utils.AggregatedList.addItem.<anonymous>[ValueParameterDescriptorImpl]

'hashCode' @ [144:86] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'if (elementIndex < 0) {
                -elementIndex - 1
            } else {
                // There is an existing element with the same hash (which is fine)
                elementIndex
            }' @ [146:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'elementIndex' @ [146:32] ==> val elementIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'-' @ [147:17] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'elementIndex' @ [147:18] ==> val elementIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'elementIndex' @ [150:17] ==> val elementIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'elements' @ [152:13] ==> val elements: ObservableList<E> defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'add' @ [152:22] ==> public abstract fun add(index: Int, element: (E..E?)): Unit defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'addIndex' @ [152:26] ==> val addIndex: Int defined in net.corda.client.jfx.utils.AggregatedList.addItem[LocalVariableDescriptor]

'addedItem' @ [152:36] ==> value-parameter addedItem: E defined in net.corda.client.jfx.utils.AggregatedList.addItem[ValueParameterDescriptorImpl]

