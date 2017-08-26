'exposedList' @ [16:26] ==> value-parameter exposedList: ObservableList<C> defined in net.corda.client.jfx.utils.MapValuesList.<init>[ValueParameterDescriptorImpl]

'observableArrayList' @ [25:45] ==> public open fun <E : (Any..Any?)> observableArrayList(p0: (MutableCollection<out (Map.Entry<K, A>..Map.Entry<K, A>?)>..Collection<(Map.Entry<K, A>..Map.Entry<K, A>?)>?)): (ObservableList<(Map.Entry<K, A>..Map.Entry<K, A>?)>..ObservableList<(Map.Entry<K, A>..Map.Entry<K, A>?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Entry<K, A>

'sourceMap' @ [25:82] ==> value-parameter sourceMap: ObservableMap<K, A> defined in net.corda.client.jfx.utils.MapValuesList.Companion.create[ValueParameterDescriptorImpl]

'entries' @ [25:92] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(K..K?), (A..A?)>> defined in javafx.collections.ObservableMap[DeserializedPropertyDescriptor]

'sortedBy' @ [25:100] ==> public inline fun <T, R : Comparable<Int>> Iterable<MutableMap.MutableEntry<(K..K?), (A..A?)>>.sortedBy(crossinline selector: (MutableMap.MutableEntry<(K..K?), (A..A?)>) -> Int?): List<MutableMap.MutableEntry<(K..K?), (A..A?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<(K..K?), (A..A?)>
    <R : Comparable<R>> -> Int

'it' @ [25:111] ==> value-parameter it: MutableMap.MutableEntry<(K..K?), (A..A?)> defined in net.corda.client.jfx.utils.MapValuesList.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [25:114] ==> public abstract val key: (K..K?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'hashCode' @ [25:120] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'MapValuesList' @ [26:20] ==> private constructor MapValuesList<K, A, C>(sourceMap: ObservableMap<K, A>, backingList: ObservableList<Map.Entry<K, A>>, exposedList: ObservableList<C>) defined in net.corda.client.jfx.utils.MapValuesList[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <A> -> A
    <C> -> C

'sourceMap' @ [26:34] ==> value-parameter sourceMap: ObservableMap<K, A> defined in net.corda.client.jfx.utils.MapValuesList.Companion.create[ValueParameterDescriptorImpl]

'backingList' @ [26:45] ==> val backingList: (ObservableList<(Map.Entry<K, A>..Map.Entry<K, A>?)>..ObservableList<(Map.Entry<K, A>..Map.Entry<K, A>?)>?) defined in net.corda.client.jfx.utils.MapValuesList.Companion.create[LocalVariableDescriptor]

'backingList' @ [26:58] ==> val backingList: (ObservableList<(Map.Entry<K, A>..Map.Entry<K, A>?)>..ObservableList<(Map.Entry<K, A>..Map.Entry<K, A>?)>?) defined in net.corda.client.jfx.utils.MapValuesList.Companion.create[LocalVariableDescriptor]

'map' @ [26:70] ==> public fun <A, B> ObservableList<out (Map.Entry<K, A>..Map.Entry<K, A>?)>.map(cached: Boolean = ..., function: ((Map.Entry<K, A>..Map.Entry<K, A>?)) -> C): ObservableList<C> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> (kotlin.collections.Map.Entry<K, A>..kotlin.collections.Map.Entry<K, A>?)
    <B> -> C

'invoke' @ [26:76] ==> public abstract operator fun invoke(p1: Map.Entry<K, A>): C defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [26:85] ==> value-parameter it: (Map.Entry<K, A>..Map.Entry<K, A>?) defined in net.corda.client.jfx.utils.MapValuesList.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'sourceMap' @ [31:9] ==> public final val sourceMap: ObservableMap<K, A> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'addListener' @ [31:19] ==> public final fun addListener(p0: (((MapChangeListener.Change<out (K..K?), out (A..A?)>..MapChangeListener.Change<out (K..K?), out (A..A?)>?)) -> Unit..(((MapChangeListener.Change<out (K..K?), out (A..A?)>..MapChangeListener.Change<out (K..K?), out (A..A?)>?)) -> Unit)?)): Unit defined in javafx.collections.ObservableMap[MyFunctionDescriptor]

'change' @ [32:31] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [32:38] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'hashCode' @ [32:44] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'if (change.wasRemoved()) {
                val removeIndex = backingList.binarySearch(
                        comparison = { entry -> compareValues(keyHashCode, entry.key!!.hashCode()) }
                )
                if (removeIndex < 0) {
                    throw IllegalStateException("Removed value does not map")
                }
                if (change.wasAdded()) {
                    backingList[removeIndex] = object : Map.Entry<K, A> {
                        override val key = change.key
                        override val value = change.valueAdded
                    }
                } else {
                    backingList.removeAt(removeIndex)
                }
            } else if (change.wasAdded()) {
                val index = backingList.binarySearch(
                        comparison = { entry -> compareValues(keyHashCode, entry.key!!.hashCode()) }
                )
                val addIndex = -index - 1
                backingList.add(addIndex, object : Map.Entry<K, A> {
                    override val key = change.key
                    override val value = change.valueAdded
                })
            }' @ [33:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'change' @ [33:17] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasRemoved' @ [33:24] ==> public abstract fun wasRemoved(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'backingList' @ [34:35] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'binarySearch' @ [34:47] ==> public fun <T> List<(Map.Entry<K, A>..Map.Entry<K, A>?)>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: ((Map.Entry<K, A>..Map.Entry<K, A>?)) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.Map.Entry<K, A>..kotlin.collections.Map.Entry<K, A>?)

'compareValues' @ [35:49] ==> public fun <T : Comparable<*>> compareValues(a: Int?, b: Int?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Int

'keyHashCode' @ [35:63] ==> val keyHashCode: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'entry' @ [35:76] ==> value-parameter entry: (Map.Entry<K, A>..Map.Entry<K, A>?) defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [35:82] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'hashCode' @ [35:88] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'removeIndex' @ [37:21] ==> val removeIndex: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [38:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'if (change.wasAdded()) {
                    backingList[removeIndex] = object : Map.Entry<K, A> {
                        override val key = change.key
                        override val value = change.valueAdded
                    }
                } else {
                    backingList.removeAt(removeIndex)
                }' @ [40:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'change' @ [40:21] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [40:28] ==> public abstract fun wasAdded(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'backingList' @ [41:21] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'removeIndex' @ [41:33] ==> val removeIndex: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'change' @ [42:44] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [42:51] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'change' @ [43:46] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'valueAdded' @ [43:53] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.valueAdded: (A..A?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'backingList' @ [46:21] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'removeAt' @ [46:33] ==> public abstract fun removeAt(index: Int): (Map.Entry<K, A>..Map.Entry<K, A>?) defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'removeIndex' @ [46:42] ==> val removeIndex: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'change' @ [48:24] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [48:31] ==> public abstract fun wasAdded(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'backingList' @ [49:29] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'binarySearch' @ [49:41] ==> public fun <T> List<(Map.Entry<K, A>..Map.Entry<K, A>?)>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: ((Map.Entry<K, A>..Map.Entry<K, A>?)) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.Map.Entry<K, A>..kotlin.collections.Map.Entry<K, A>?)

'compareValues' @ [50:49] ==> public fun <T : Comparable<*>> compareValues(a: Int?, b: Int?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Int

'keyHashCode' @ [50:63] ==> val keyHashCode: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'entry' @ [50:76] ==> value-parameter entry: (Map.Entry<K, A>..Map.Entry<K, A>?) defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [50:82] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'hashCode' @ [50:88] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'-' @ [52:32] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'index' @ [52:33] ==> val index: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'backingList' @ [53:17] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'add' @ [53:29] ==> public abstract fun add(index: Int, element: (Map.Entry<K, A>..Map.Entry<K, A>?)): Unit defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'addIndex' @ [53:33] ==> val addIndex: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'change' @ [54:40] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [54:47] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'change' @ [55:42] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'valueAdded' @ [55:49] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.valueAdded: (A..A?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

