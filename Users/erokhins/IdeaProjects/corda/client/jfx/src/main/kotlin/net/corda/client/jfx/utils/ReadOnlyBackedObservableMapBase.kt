'HashMap' @ [20:32] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> Pair<A, B>

'fireValueChangedEvent' @ [24:27] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> fireValueChangedEvent(p0: (MapListenerHelper<(K..K?), (A..A?)>..MapListenerHelper<(K..K?), (A..A?)>?), p1: (MapChangeListener.Change<out (K..K?), out (A..A?)>..MapChangeListener.Change<out (K..K?), out (A..A?)>?)): Unit defined in com.sun.javafx.collections.MapListenerHelper[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (A..A?)

'mapListenerHelper' @ [24:49] ==> private final var mapListenerHelper: MapListenerHelper<K, A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'change' @ [24:68] ==> value-parameter change: MapChangeListener.Change<out K, out A> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.fireChange[ValueParameterDescriptorImpl]

'mapListenerHelper' @ [28:9] ==> private final var mapListenerHelper: MapListenerHelper<K, A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'addListener' @ [28:47] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> addListener(p0: (MapListenerHelper<(K..K?), (A..A?)>..MapListenerHelper<(K..K?), (A..A?)>?), p1: (InvalidationListener..InvalidationListener?)): (MapListenerHelper<(K..K?), (A..A?)>..MapListenerHelper<(K..K?), (A..A?)>?) defined in com.sun.javafx.collections.MapListenerHelper[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (A..A?)

'mapListenerHelper' @ [28:59] ==> private final var mapListenerHelper: MapListenerHelper<K, A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'listener' @ [28:78] ==> value-parameter listener: InvalidationListener defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.addListener[ValueParameterDescriptorImpl]

'mapListenerHelper' @ [32:9] ==> private final var mapListenerHelper: MapListenerHelper<K, A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'addListener' @ [32:47] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> addListener(p0: (MapListenerHelper<(K..K?), (A..A?)>..MapListenerHelper<(K..K?), (A..A?)>?), p1: (MapChangeListener<in (K..K?), in (A..A?)>..MapChangeListener<in (K..K?), in (A..A?)>?)): (MapListenerHelper<(K..K?), (A..A?)>..MapListenerHelper<(K..K?), (A..A?)>?) defined in com.sun.javafx.collections.MapListenerHelper[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (A..A?)

'mapListenerHelper' @ [32:59] ==> private final var mapListenerHelper: MapListenerHelper<K, A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'listener' @ [32:78] ==> value-parameter listener: MapChangeListener<in K, in A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.addListener[ValueParameterDescriptorImpl]

'mapListenerHelper' @ [36:9] ==> private final var mapListenerHelper: MapListenerHelper<K, A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'removeListener' @ [36:47] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> removeListener(p0: (MapListenerHelper<(K..K?), (A..A?)>..MapListenerHelper<(K..K?), (A..A?)>?), p1: (InvalidationListener..InvalidationListener?)): (MapListenerHelper<(K..K?), (A..A?)>..MapListenerHelper<(K..K?), (A..A?)>?) defined in com.sun.javafx.collections.MapListenerHelper[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (A..A?)

'mapListenerHelper' @ [36:62] ==> private final var mapListenerHelper: MapListenerHelper<K, A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'listener' @ [36:81] ==> value-parameter listener: InvalidationListener? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.removeListener[ValueParameterDescriptorImpl]

'mapListenerHelper' @ [40:9] ==> private final var mapListenerHelper: MapListenerHelper<K, A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'removeListener' @ [40:47] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> removeListener(p0: (MapListenerHelper<(K..K?), (A..A?)>..MapListenerHelper<(K..K?), (A..A?)>?), p1: (MapChangeListener<in (K..K?), in (A..A?)>..MapChangeListener<in (K..K?), in (A..A?)>?)): (MapListenerHelper<(K..K?), (A..A?)>..MapListenerHelper<(K..K?), (A..A?)>?) defined in com.sun.javafx.collections.MapListenerHelper[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (K..K?)
    <V : (Any..Any?)> -> (A..A?)

'mapListenerHelper' @ [40:62] ==> private final var mapListenerHelper: MapListenerHelper<K, A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'listener' @ [40:81] ==> value-parameter listener: MapChangeListener<in K, in A>? defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.removeListener[ValueParameterDescriptorImpl]

'backingMap' @ [43:36] ==> protected final val backingMap: HashMap<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'size' @ [43:47] ==> public open val size: Int defined in java.util.HashMap[JavaPropertyDescriptor]

'backingMap' @ [45:40] ==> protected final val backingMap: HashMap<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'containsKey' @ [45:51] ==> public open fun containsKey(key: K): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'key' @ [45:63] ==> value-parameter key: K defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.containsKey[ValueParameterDescriptorImpl]

'backingMap' @ [47:44] ==> protected final val backingMap: HashMap<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'any' @ [47:55] ==> public inline fun <K, V> Map<out K, Pair<A, B>>.any(predicate: (Map.Entry<K, Pair<A, B>>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> Pair<A, B>

'it' @ [47:61] ==> value-parameter it: Map.Entry<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.containsValue.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [47:64] ==> public abstract val value: Pair<A, B> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'first' @ [47:70] ==> public final val first: A defined in kotlin.Pair[DeserializedPropertyDescriptor]

'value' @ [47:79] ==> value-parameter value: A defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.containsValue[ValueParameterDescriptorImpl]

'backingMap' @ [49:32] ==> protected final val backingMap: HashMap<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'get' @ [49:43] ==> public open fun get(key: K): Pair<A, B>? defined in java.util.HashMap[JavaMethodDescriptor]

'key' @ [49:47] ==> value-parameter key: K defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.get[ValueParameterDescriptorImpl]

'first' @ [49:53] ==> public final val first: A defined in kotlin.Pair[DeserializedPropertyDescriptor]

'backingMap' @ [51:30] ==> protected final val backingMap: HashMap<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'isEmpty' @ [51:41] ==> public open fun isEmpty(): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'backingMap' @ [53:77] ==> protected final val backingMap: HashMap<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'entries' @ [53:88] ==> public open val entries: MutableSet<MutableMap.MutableEntry<K, Pair<A, B>>> defined in java.util.HashMap[JavaPropertyDescriptor]

'fold' @ [53:96] ==> public inline fun <T, R> Iterable<MutableMap.MutableEntry<K, Pair<A, B>>>.fold(initial: MutableSet<MutableMap.MutableEntry<K, A>>, operation: (acc: MutableSet<MutableMap.MutableEntry<K, A>>, MutableMap.MutableEntry<K, Pair<A, B>>) -> MutableSet<MutableMap.MutableEntry<K, A>>): MutableSet<MutableMap.MutableEntry<K, A>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<K, Pair<A, B>>
    <R> -> MutableSet<MutableEntry<K, A>>

'mutableSetOf' @ [53:101] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<MutableMap.MutableEntry<K, A>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<K, A>

'set' @ [54:9] ==> value-parameter set: MutableSet<MutableMap.MutableEntry<K, A>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.<get-entries>.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [54:13] ==> public abstract fun add(element: MutableMap.MutableEntry<K, A>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'entry' @ [55:37] ==> value-parameter entry: MutableMap.MutableEntry<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.<get-entries>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [55:43] ==> public abstract val value: Pair<A, B> defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'first' @ [55:49] ==> public final val first: A defined in kotlin.Pair[DeserializedPropertyDescriptor]

'entry' @ [56:32] ==> value-parameter entry: MutableMap.MutableEntry<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.<get-entries>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [56:38] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'value' @ [58:27] ==> public open var value: A defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.<get-entries>.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'value' @ [59:17] ==> public open var value: A defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.<get-entries>.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'newValue' @ [59:25] ==> value-parameter newValue: A defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.<get-entries>.<anonymous>.<no name provided>.setValue[ValueParameterDescriptorImpl]

'old' @ [60:24] ==> val old: A defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.<get-entries>.<anonymous>.<no name provided>.setValue[LocalVariableDescriptor]

'set' @ [63:9] ==> value-parameter set: MutableSet<MutableMap.MutableEntry<K, A>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.<get-entries>.<anonymous>[ValueParameterDescriptorImpl]

'backingMap' @ [65:46] ==> protected final val backingMap: HashMap<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'keys' @ [65:57] ==> public open val keys: MutableSet<K> defined in java.util.HashMap[JavaPropertyDescriptor]

'ArrayList' @ [66:55] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (A..A?)>..Collection<(A..A?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'backingMap' @ [66:65] ==> protected final val backingMap: HashMap<K, Pair<A, B>> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[PropertyDescriptorImpl]

'values' @ [66:76] ==> public open val values: MutableCollection<Pair<A, B>> defined in java.util.HashMap[JavaPropertyDescriptor]

'map' @ [66:83] ==> public inline fun <T, R> Iterable<Pair<A, B>>.map(transform: (Pair<A, B>) -> A): List<A> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<A, B>
    <R> -> A

'it' @ [66:89] ==> value-parameter it: Pair<A, B> defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase.<get-values>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [66:92] ==> public final val first: A defined in kotlin.Pair[DeserializedPropertyDescriptor]

'UnsupportedOperationException' @ [69:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [73:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [77:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [81:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'MapChangeListener.Change<K, A>' @ [87:21] ==> public constructor Change<K : (Any..Any?), V : (Any..Any?)>(p0: (ObservableMap<(K..K?), (A..A?)>..ObservableMap<(K..K?), (A..A?)>?)) defined in javafx.collections.MapChangeListener.Change[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> A

'this' @ [87:52] ==> <this> defined in net.corda.client.jfx.utils.createMapChange[ReceiverParameterDescriptorImpl]

'key' @ [88:33] ==> value-parameter key: K defined in net.corda.client.jfx.utils.createMapChange[ValueParameterDescriptorImpl]

'removedValue' @ [89:37] ==> value-parameter removedValue: A? defined in net.corda.client.jfx.utils.createMapChange[ValueParameterDescriptorImpl]

'addedValue' @ [90:35] ==> value-parameter addedValue: A? defined in net.corda.client.jfx.utils.createMapChange[ValueParameterDescriptorImpl]

'removedValue' @ [91:42] ==> value-parameter removedValue: A? defined in net.corda.client.jfx.utils.createMapChange[ValueParameterDescriptorImpl]

'addedValue' @ [92:40] ==> value-parameter addedValue: A? defined in net.corda.client.jfx.utils.createMapChange[ValueParameterDescriptorImpl]

