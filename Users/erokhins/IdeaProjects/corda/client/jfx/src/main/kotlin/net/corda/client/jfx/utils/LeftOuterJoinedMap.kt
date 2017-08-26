'ReadOnlyBackedObservableMapBase<K, C, SimpleObjectProperty<B?>>' @ [16:5] ==> public constructor ReadOnlyBackedObservableMapBase<K, A, B>() defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <A> -> C
    <B> -> SimpleObjectProperty<B?>

'leftTable' @ [18:9] ==> public final val leftTable: ObservableMap<K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'forEach' @ [18:19] ==> @HidesMembers public inline fun <K, V> Map<out (K..K?), (A..A?)>.forEach(action: (Map.Entry<(K..K?), (A..A?)>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (K..K?)
    <V> -> (A..A?)

'SimpleObjectProperty' @ [19:38] ==> public constructor SimpleObjectProperty<T : (Any..Any?)>(p0: B?) defined in javafx.beans.property.SimpleObjectProperty[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> B?

'rightTable' @ [19:59] ==> public final val rightTable: ObservableMap<K, out B> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'get' @ [19:70] ==> public abstract fun get(key: (K..K?)): B? defined in javafx.collections.ObservableMap[DeserializedSimpleFunctionDescriptor]

'entry' @ [19:74] ==> value-parameter entry: Map.Entry<(K..K?), (A..A?)> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [19:80] ==> public abstract val key: (K..K?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'backingMap' @ [20:13] ==> protected final val backingMap: HashMap<K, Pair<C, SimpleObjectProperty<B?>>> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'set' @ [20:24] ==> @InlineOnly public operator inline fun <K, V> MutableMap<K, Pair<C, SimpleObjectProperty<B?>>>.set(key: K, value: Pair<C, SimpleObjectProperty<B?>>): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> Pair<C, SimpleObjectProperty<B?>>

'entry' @ [20:28] ==> value-parameter entry: Map.Entry<(K..K?), (A..A?)> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [20:34] ==> public abstract val key: (K..K?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'Pair' @ [20:39] ==> public constructor Pair<out A, out B>(first: C, second: SimpleObjectProperty<B?>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> C
    <out B> -> SimpleObjectProperty<B?>

'invoke' @ [20:44] ==> public abstract operator fun invoke(p1: K, p2: A, p3: ObservableValue<B?>): C defined in kotlin.Function3[FunctionInvokeDescriptor]

'entry' @ [20:53] ==> value-parameter entry: Map.Entry<(K..K?), (A..A?)> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [20:59] ==> public abstract val key: (K..K?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'entry' @ [20:64] ==> value-parameter entry: Map.Entry<(K..K?), (A..A?)> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [20:70] ==> public abstract val value: (A..A?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'rightValueProperty' @ [20:77] ==> val rightValueProperty: SimpleObjectProperty<B?> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'rightValueProperty' @ [20:98] ==> val rightValueProperty: SimpleObjectProperty<B?> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'leftTable' @ [23:9] ==> public final val leftTable: ObservableMap<K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'addListener' @ [23:19] ==> public final fun addListener(p0: (((MapChangeListener.Change<out (K..K?), out (A..A?)>..MapChangeListener.Change<out (K..K?), out (A..A?)>?)) -> Unit..(((MapChangeListener.Change<out (K..K?), out (A..A?)>..MapChangeListener.Change<out (K..K?), out (A..A?)>?)) -> Unit)?)): Unit defined in javafx.collections.ObservableMap[MyFunctionDescriptor]

'change' @ [27:17] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasRemoved' @ [27:24] ==> public abstract fun wasRemoved(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'removedValue' @ [28:17] ==> var removedValue: C? defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'backingMap' @ [28:32] ==> protected final val backingMap: HashMap<K, Pair<C, SimpleObjectProperty<B?>>> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'remove' @ [28:43] ==> public open fun remove(key: K): Pair<C, SimpleObjectProperty<B?>>? defined in java.util.HashMap[JavaMethodDescriptor]

'change' @ [28:50] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [28:57] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'first' @ [28:63] ==> public final val first: C defined in kotlin.Pair[DeserializedPropertyDescriptor]

'change' @ [31:17] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [31:24] ==> public abstract fun wasAdded(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'rightTable' @ [32:34] ==> public final val rightTable: ObservableMap<K, out B> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'get' @ [32:45] ==> public abstract fun get(key: (K..K?)): B? defined in javafx.collections.ObservableMap[DeserializedSimpleFunctionDescriptor]

'change' @ [32:49] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [32:56] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'SimpleObjectProperty' @ [33:42] ==> public constructor SimpleObjectProperty<T : (Any..Any?)>(p0: B?) defined in javafx.beans.property.SimpleObjectProperty[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> B?

'rightValue' @ [33:63] ==> val rightValue: B? defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'invoke' @ [34:32] ==> public abstract operator fun invoke(p1: K, p2: A, p3: ObservableValue<B?>): C defined in kotlin.Function3[FunctionInvokeDescriptor]

'change' @ [34:41] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [34:48] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'change' @ [34:53] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'valueAdded' @ [34:60] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.valueAdded: (A..A?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'rightValueProperty' @ [34:72] ==> val rightValueProperty: SimpleObjectProperty<B?> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'backingMap' @ [35:17] ==> protected final val backingMap: HashMap<K, Pair<C, SimpleObjectProperty<B?>>> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'set' @ [35:28] ==> @InlineOnly public operator inline fun <K, V> MutableMap<K, Pair<C, SimpleObjectProperty<B?>>>.set(key: K, value: Pair<C, SimpleObjectProperty<B?>>): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> Pair<C, SimpleObjectProperty<B?>>

'change' @ [35:32] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [35:39] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'Pair' @ [35:44] ==> public constructor Pair<out A, out B>(first: C, second: SimpleObjectProperty<B?>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> C
    <out B> -> SimpleObjectProperty<B?>

'newValue' @ [35:49] ==> val newValue: C defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'rightValueProperty' @ [35:59] ==> val rightValueProperty: SimpleObjectProperty<B?> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'addedValue' @ [36:17] ==> var addedValue: C? defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'newValue' @ [36:30] ==> val newValue: C defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'fireChange' @ [39:13] ==> protected final fun fireChange(change: MapChangeListener.Change<out K, out C>): Unit defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[SimpleFunctionDescriptorImpl]

'createMapChange' @ [39:24] ==> public fun <A, K> ObservableMap<K, C>.createMapChange(key: K, removedValue: C?, addedValue: C?): MapChangeListener.Change<K, C> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> C
    <K> -> K

'change' @ [39:40] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [39:47] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out A>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out A)

'removedValue' @ [39:52] ==> var removedValue: C? defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'addedValue' @ [39:66] ==> var addedValue: C? defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[LocalVariableDescriptor]

'rightTable' @ [41:9] ==> public final val rightTable: ObservableMap<K, out B> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'addListener' @ [41:20] ==> public final fun addListener(p0: (((MapChangeListener.Change<out (K..K?), out (B..B?)>..MapChangeListener.Change<out (K..K?), out (B..B?)>?)) -> Unit..(((MapChangeListener.Change<out (K..K?), out (B..B?)>..MapChangeListener.Change<out (K..K?), out (B..B?)>?)) -> Unit)?)): Unit defined in javafx.collections.ObservableMap[MyFunctionDescriptor]

'change' @ [42:17] ==> value-parameter change: MapChangeListener.Change<out K, out B> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasRemoved' @ [42:24] ==> public abstract fun wasRemoved(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'!' @ [42:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'change' @ [42:41] ==> value-parameter change: MapChangeListener.Change<out K, out B> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [42:48] ==> public abstract fun wasAdded(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'backingMap' @ [43:17] ==> protected final val backingMap: HashMap<K, Pair<C, SimpleObjectProperty<B?>>> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'get' @ [43:28] ==> public open fun get(key: K): Pair<C, SimpleObjectProperty<B?>>? defined in java.util.HashMap[JavaMethodDescriptor]

'change' @ [43:32] ==> value-parameter change: MapChangeListener.Change<out K, out B> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [43:39] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out B>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out B)

'second' @ [43:45] ==> public final val second: SimpleObjectProperty<B?> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'set' @ [43:53] ==> public open fun set(p0: B?): Unit defined in javafx.beans.property.SimpleObjectProperty[JavaMethodDescriptor]

'change' @ [46:17] ==> value-parameter change: MapChangeListener.Change<out K, out B> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [46:24] ==> public abstract fun wasAdded(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'backingMap' @ [47:17] ==> protected final val backingMap: HashMap<K, Pair<C, SimpleObjectProperty<B?>>> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[PropertyDescriptorImpl]

'get' @ [47:28] ==> public open fun get(key: K): Pair<C, SimpleObjectProperty<B?>>? defined in java.util.HashMap[JavaMethodDescriptor]

'change' @ [47:32] ==> value-parameter change: MapChangeListener.Change<out K, out B> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [47:39] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out B>.key: (K..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out B)

'second' @ [47:45] ==> public final val second: SimpleObjectProperty<B?> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'set' @ [47:53] ==> public open fun set(p0: B?): Unit defined in javafx.beans.property.SimpleObjectProperty[JavaMethodDescriptor]

'change' @ [47:57] ==> value-parameter change: MapChangeListener.Change<out K, out B> defined in net.corda.client.jfx.utils.LeftOuterJoinedMap.<init>.<anonymous>[ValueParameterDescriptorImpl]

'valueAdded' @ [47:64] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out K, out B>.valueAdded: (B..B?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Captured(out K)
    <V : (Any..Any?)> -> Captured(out B)

