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

'change' @ [32:27] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [32:34] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out ({Any & K}..K), out ({Any & A}..A)>.key: ({Any & K}..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ({Any & K}..K)
    <V : (Any..Any?)> -> ({Any & A}..A)

'key1' @ [33:31] ==> val key1: K defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'hashCode' @ [33:38] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'if (change.wasRemoved()) {
                val removeIndex = backingList.binarySearch(
                        comparison = { entry -> compareValues(keyHashCode, entry.key!!.hashCode()) }
                )
                if (removeIndex < 0) {
                    throw IllegalStateException("Removed value does not map")
                }
                if (change.wasAdded()) {
                    backingList[removeIndex] = object : Map.Entry<K, A> {
                        override val key: K = change.key
                        override val value: A = change.valueAdded
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
                    override val key: K = change.key
                    override val value: A = change.valueAdded
                })
            }' @ [34:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'change' @ [34:17] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasRemoved' @ [34:24] ==> public abstract fun wasRemoved(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'backingList' @ [35:35] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'binarySearch' @ [35:47] ==> public fun <T> List<(Map.Entry<K, A>..Map.Entry<K, A>?)>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: ((Map.Entry<K, A>..Map.Entry<K, A>?)) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.Map.Entry<K, A>..kotlin.collections.Map.Entry<K, A>?)

'compareValues' @ [36:49] ==> public fun <T : Comparable<*>> compareValues(a: Int?, b: Int?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Int

'keyHashCode' @ [36:63] ==> val keyHashCode: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'entry' @ [36:76] ==> value-parameter entry: (Map.Entry<K, A>..Map.Entry<K, A>?) defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [36:82] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'hashCode' @ [36:88] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'removeIndex' @ [38:21] ==> val removeIndex: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [39:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'if (change.wasAdded()) {
                    backingList[removeIndex] = object : Map.Entry<K, A> {
                        override val key: K = change.key
                        override val value: A = change.valueAdded
                    }
                } else {
                    backingList.removeAt(removeIndex)
                }' @ [41:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'change' @ [41:21] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [41:28] ==> public abstract fun wasAdded(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'backingList' @ [42:21] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'removeIndex' @ [42:33] ==> val removeIndex: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'change' @ [43:47] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [43:54] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out ({Any & K}..K), out ({Any & A}..A)>.key: ({Any & K}..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ({Any & K}..K)
    <V : (Any..Any?)> -> ({Any & A}..A)

'change' @ [44:49] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'valueAdded' @ [44:56] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out ({Any & K}..K), out ({Any & A}..A)>.valueAdded: ({Any & A}..A?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ({Any & K}..K)
    <V : (Any..Any?)> -> ({Any & A}..A)

'backingList' @ [47:21] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'removeAt' @ [47:33] ==> public abstract fun removeAt(index: Int): (Map.Entry<K, A>..Map.Entry<K, A>?) defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'removeIndex' @ [47:42] ==> val removeIndex: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'change' @ [49:24] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [49:31] ==> public abstract fun wasAdded(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'backingList' @ [50:29] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'binarySearch' @ [50:41] ==> public fun <T> List<(Map.Entry<K, A>..Map.Entry<K, A>?)>.binarySearch(fromIndex: Int = ..., toIndex: Int = ..., comparison: ((Map.Entry<K, A>..Map.Entry<K, A>?)) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.Map.Entry<K, A>..kotlin.collections.Map.Entry<K, A>?)

'compareValues' @ [51:49] ==> public fun <T : Comparable<*>> compareValues(a: Int?, b: Int?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> Int

'keyHashCode' @ [51:63] ==> val keyHashCode: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'entry' @ [51:76] ==> value-parameter entry: (Map.Entry<K, A>..Map.Entry<K, A>?) defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [51:82] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'hashCode' @ [51:88] ==> public open fun hashCode(): Int defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'-' @ [53:32] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'index' @ [53:33] ==> val index: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'backingList' @ [54:17] ==> private final val backingList: ObservableList<Map.Entry<K, A>> defined in net.corda.client.jfx.utils.MapValuesList[PropertyDescriptorImpl]

'add' @ [54:29] ==> public abstract fun add(index: Int, element: (Map.Entry<K, A>..Map.Entry<K, A>?)): Unit defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'addIndex' @ [54:33] ==> val addIndex: Int defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[LocalVariableDescriptor]

'change' @ [55:43] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [55:50] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out ({Any & K}..K), out ({Any & A}..A)>.key: ({Any & K}..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ({Any & K}..K)
    <V : (Any..Any?)> -> ({Any & A}..A)

'change' @ [56:45] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.MapValuesList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'valueAdded' @ [56:52] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out ({Any & K}..K), out ({Any & A}..A)>.valueAdded: ({Any & A}..A?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ({Any & K}..K)
    <V : (Any..Any?)> -> ({Any & A}..A)

