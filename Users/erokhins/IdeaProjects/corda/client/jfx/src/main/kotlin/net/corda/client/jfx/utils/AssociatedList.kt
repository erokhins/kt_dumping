'ReadOnlyBackedObservableMapBase<K, B, Unit>' @ [20:5] ==> public constructor ReadOnlyBackedObservableMapBase<K, A, B>() defined in net.corda.client.jfx.utils.ReadOnlyBackedObservableMapBase[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <A> -> B
    <B> -> Unit

'sourceList' @ [22:9] ==> public final val sourceList: ObservableList<out A> defined in net.corda.client.jfx.utils.AssociatedList[PropertyDescriptorImpl]

'forEach' @ [22:20] ==> @HidesMembers public inline fun <T> Iterable<(A..A?)>.forEach(action: ((A..A?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (A..A?)

'invoke' @ [23:23] ==> public abstract operator fun invoke(p1: A): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [23:29] ==> value-parameter it: (A..A?) defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'backingMap' @ [24:13] ==> protected final val backingMap: HashMap<K, Pair<B, Unit>> defined in net.corda.client.jfx.utils.AssociatedList[PropertyDescriptorImpl]

'set' @ [24:24] ==> @InlineOnly public operator inline fun <K, V> MutableMap<K, Pair<B, Unit>>.set(key: K, value: Pair<B, Unit>): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> Pair<B, Unit>

'key' @ [24:28] ==> val key: K defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'Pair' @ [24:33] ==> public constructor Pair<out A, out B>(first: B, second: Unit) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> B
    <out B> -> Unit

'invoke' @ [24:38] ==> public abstract operator fun invoke(p1: K, p2: A): B defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [24:47] ==> val key: K defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'it' @ [24:52] ==> value-parameter it: (A..A?) defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'Unit' @ [24:57] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'sourceList' @ [26:9] ==> public final val sourceList: ObservableList<out A> defined in net.corda.client.jfx.utils.AssociatedList[PropertyDescriptorImpl]

'addListener' @ [26:20] ==> public final fun addListener(p0: (((ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?)) -> Unit..(((ListChangeListener.Change<out (A..A?)>..ListChangeListener.Change<out (A..A?)>?)) -> Unit)?)): Unit defined in javafx.collections.ObservableList[MyFunctionDescriptor]

'change' @ [27:20] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [27:27] ==> public abstract operator fun next(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'if (change.wasPermutated()) {
                } else if (change.wasUpdated()) {
                } else {
                    val removedSourceMap = change.removed.associateBy(toKey)
                    val addedSourceMap = change.addedSubList.associateBy(toKey)
                    val removedMap = HashMap<K, B>()
                    val addedMap = HashMap<K, B>()
                    removedSourceMap.forEach {
                        val removed = backingMap.remove(it.key)?.first
                        removed ?: throw IllegalStateException("Removed list does not associate")
                        removedMap.put(it.key, removed)
                    }
                    addedSourceMap.forEach {
                        val oldValue = backingMap.get(it.key)
                        val newValue = if (oldValue == null) {
                            assemble(it.key, it.value)
                        } else {
                            throw IllegalStateException("Several elements associated with same key")
                        }
                        backingMap.put(it.key, Pair(newValue, Unit))
                        addedMap.put(it.key, newValue)
                    }
                    val keys = removedMap.keys + addedMap.keys
                    keys.forEach { key ->
                        fireChange(createMapChange(key, removedMap.get(key), addedMap.get(key)))
                    }
                }' @ [28:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [28:21] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasPermutated' @ [28:28] ==> public open fun wasPermutated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'if (change.wasUpdated()) {
                } else {
                    val removedSourceMap = change.removed.associateBy(toKey)
                    val addedSourceMap = change.addedSubList.associateBy(toKey)
                    val removedMap = HashMap<K, B>()
                    val addedMap = HashMap<K, B>()
                    removedSourceMap.forEach {
                        val removed = backingMap.remove(it.key)?.first
                        removed ?: throw IllegalStateException("Removed list does not associate")
                        removedMap.put(it.key, removed)
                    }
                    addedSourceMap.forEach {
                        val oldValue = backingMap.get(it.key)
                        val newValue = if (oldValue == null) {
                            assemble(it.key, it.value)
                        } else {
                            throw IllegalStateException("Several elements associated with same key")
                        }
                        backingMap.put(it.key, Pair(newValue, Unit))
                        addedMap.put(it.key, newValue)
                    }
                    val keys = removedMap.keys + addedMap.keys
                    keys.forEach { key ->
                        fireChange(createMapChange(key, removedMap.get(key), addedMap.get(key)))
                    }
                }' @ [29:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [29:28] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'wasUpdated' @ [29:35] ==> public open fun wasUpdated(): Boolean defined in javafx.collections.ListChangeListener.Change[JavaMethodDescriptor]

'change' @ [31:44] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'removed' @ [31:51] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out A>.removed: (MutableList<out (A..A?)>..List<(A..A?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out A)

'associateBy' @ [31:59] ==> public inline fun <T, K> Iterable<(A..A?)>.associateBy(keySelector: ((A..A?)) -> K): Map<K, (A..A?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (A..A?)
    <K> -> K

'toKey' @ [31:71] ==> value-parameter toKey: (A) -> K defined in net.corda.client.jfx.utils.AssociatedList.<init>[ValueParameterDescriptorImpl]

'change' @ [32:42] ==> value-parameter change: ListChangeListener.Change<out A> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[ValueParameterDescriptorImpl]

'addedSubList' @ [32:49] ==> public final val <E : (Any..Any?)> ListChangeListener.Change<out A>.addedSubList: (MutableList<out (A..A?)>..List<(A..A?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Captured(out A)

'associateBy' @ [32:62] ==> public inline fun <T, K> Iterable<(A..A?)>.associateBy(keySelector: ((A..A?)) -> K): Map<K, (A..A?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (A..A?)
    <K> -> K

'toKey' @ [32:74] ==> value-parameter toKey: (A) -> K defined in net.corda.client.jfx.utils.AssociatedList.<init>[ValueParameterDescriptorImpl]

'HashMap' @ [33:38] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> B

'HashMap' @ [34:36] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> B

'removedSourceMap' @ [35:21] ==> val removedSourceMap: Map<K, (A..A?)> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [35:38] ==> @HidesMembers public inline fun <K, V> Map<out K, (A..A?)>.forEach(action: (Map.Entry<K, (A..A?)>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> (A..A?)

'backingMap' @ [36:39] ==> protected final val backingMap: HashMap<K, Pair<B, Unit>> defined in net.corda.client.jfx.utils.AssociatedList[PropertyDescriptorImpl]

'remove' @ [36:50] ==> public open fun remove(key: K): Pair<B, Unit>? defined in java.util.HashMap[JavaMethodDescriptor]

'it' @ [36:57] ==> value-parameter it: Map.Entry<K, (A..A?)> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [36:60] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'first' @ [36:66] ==> public final val first: B defined in kotlin.Pair[DeserializedPropertyDescriptor]

'removed' @ [37:25] ==> val removed: B? defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [37:42] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'removedMap' @ [38:25] ==> val removedMap: HashMap<K, B> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'put' @ [38:36] ==> public open fun put(key: K, value: B): B? defined in java.util.HashMap[JavaMethodDescriptor]

'it' @ [38:40] ==> value-parameter it: Map.Entry<K, (A..A?)> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [38:43] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'removed' @ [38:48] ==> val removed: B? defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'addedSourceMap' @ [40:21] ==> val addedSourceMap: Map<K, (A..A?)> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [40:36] ==> @HidesMembers public inline fun <K, V> Map<out K, (A..A?)>.forEach(action: (Map.Entry<K, (A..A?)>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> (A..A?)

'backingMap' @ [41:40] ==> protected final val backingMap: HashMap<K, Pair<B, Unit>> defined in net.corda.client.jfx.utils.AssociatedList[PropertyDescriptorImpl]

'get' @ [41:51] ==> public open fun get(key: K): Pair<B, Unit>? defined in java.util.HashMap[JavaMethodDescriptor]

'it' @ [41:55] ==> value-parameter it: Map.Entry<K, (A..A?)> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [41:58] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'if (oldValue == null) {
                            assemble(it.key, it.value)
                        } else {
                            throw IllegalStateException("Several elements associated with same key")
                        }' @ [42:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: B, elseBranch: B): B[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> B

'oldValue' @ [42:44] ==> val oldValue: Pair<B, Unit>? defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'invoke' @ [43:29] ==> public abstract operator fun invoke(p1: K, p2: A): B defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [43:38] ==> value-parameter it: Map.Entry<K, (A..A?)> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [43:41] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [43:46] ==> value-parameter it: Map.Entry<K, (A..A?)> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [43:49] ==> public abstract val value: (A..A?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'IllegalStateException' @ [45:35] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'backingMap' @ [47:25] ==> protected final val backingMap: HashMap<K, Pair<B, Unit>> defined in net.corda.client.jfx.utils.AssociatedList[PropertyDescriptorImpl]

'put' @ [47:36] ==> public open fun put(key: K, value: Pair<B, Unit>): Pair<B, Unit>? defined in java.util.HashMap[JavaMethodDescriptor]

'it' @ [47:40] ==> value-parameter it: Map.Entry<K, (A..A?)> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [47:43] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'Pair' @ [47:48] ==> public constructor Pair<out A, out B>(first: B, second: Unit) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> B
    <out B> -> Unit

'newValue' @ [47:53] ==> val newValue: B defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Unit' @ [47:63] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'addedMap' @ [48:25] ==> val addedMap: HashMap<K, B> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'put' @ [48:34] ==> public open fun put(key: K, value: B): B? defined in java.util.HashMap[JavaMethodDescriptor]

'it' @ [48:38] ==> value-parameter it: Map.Entry<K, (A..A?)> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [48:41] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'newValue' @ [48:46] ==> val newValue: B defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'removedMap' @ [50:32] ==> val removedMap: HashMap<K, B> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'keys' @ [50:43] ==> public open val keys: MutableSet<K> defined in java.util.HashMap[JavaPropertyDescriptor]

'addedMap' @ [50:50] ==> val addedMap: HashMap<K, B> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'keys' @ [50:59] ==> public open val keys: MutableSet<K> defined in java.util.HashMap[JavaPropertyDescriptor]

'keys' @ [51:21] ==> val keys: Set<K> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [51:26] ==> @HidesMembers public inline fun <T> Iterable<K>.forEach(action: (K) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K

'fireChange' @ [52:25] ==> protected final fun fireChange(change: MapChangeListener.Change<out K, out B>): Unit defined in net.corda.client.jfx.utils.AssociatedList[SimpleFunctionDescriptorImpl]

'createMapChange' @ [52:36] ==> public fun <A, K> ObservableMap<K, B>.createMapChange(key: K, removedValue: B?, addedValue: B?): MapChangeListener.Change<K, B> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> B
    <K> -> K

'key' @ [52:52] ==> value-parameter key: K defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'removedMap' @ [52:57] ==> val removedMap: HashMap<K, B> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'get' @ [52:68] ==> public open fun get(key: K): B? defined in java.util.HashMap[JavaMethodDescriptor]

'key' @ [52:72] ==> value-parameter key: K defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addedMap' @ [52:78] ==> val addedMap: HashMap<K, B> defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>[LocalVariableDescriptor]

'get' @ [52:87] ==> public open fun get(key: K): B? defined in java.util.HashMap[JavaMethodDescriptor]

'key' @ [52:91] ==> value-parameter key: K defined in net.corda.client.jfx.utils.AssociatedList.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

