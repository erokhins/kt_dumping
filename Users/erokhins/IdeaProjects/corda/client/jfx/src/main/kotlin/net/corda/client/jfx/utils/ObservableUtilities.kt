'map' @ [32:90] ==> public final fun <T : (Any..Any?), U : (Any..Any?)> map(p0: (ObservableValue<out ({Any & A}..A?)>..ObservableValue<out ({Any & A}..A?)>?), p1: (((Nothing..Nothing?)) -> (B..B?)..(((Nothing..Nothing?)) -> (B..B?))?)): (MonadicBinding<(B..B?)>..MonadicBinding<(B..B?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ({Any & A}..A)
    <U : (Any..Any?)> -> B

'this' @ [32:94] ==> <this> defined in net.corda.client.jfx.utils.map[ReceiverParameterDescriptorImpl]

'function' @ [32:100] ==> value-parameter function: (A) -> B defined in net.corda.client.jfx.utils.map[ValueParameterDescriptorImpl]

'if (cached) {
        return MappedList(this, function)
    } else {
        return EasyBind.map(this, function)
    }' @ [42:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'cached' @ [42:9] ==> value-parameter cached: Boolean = ... defined in net.corda.client.jfx.utils.map[ValueParameterDescriptorImpl]

'MappedList' @ [43:16] ==> public constructor MappedList<A, B>(list: ObservableList<out ({Any & A}..A)>, function: (Nothing) -> B) defined in net.corda.client.jfx.utils.MappedList[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> ({Any & A}..A)
    <B> -> B

'this' @ [43:27] ==> <this> defined in net.corda.client.jfx.utils.map[ReceiverParameterDescriptorImpl]

'function' @ [43:33] ==> value-parameter function: (A) -> B defined in net.corda.client.jfx.utils.map[ValueParameterDescriptorImpl]

'map' @ [45:25] ==> public final fun <T : (Any..Any?), U : (Any..Any?)> map(p0: (ObservableList<out (A..A?)>..ObservableList<out (A..A?)>?), p1: (((A..A?)) -> (B..B?)..(((A..A?)) -> (B..B?))?)): (ObservableList<(B..B?)>..ObservableList<(B..B?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A
    <U : (Any..Any?)> -> B

'this' @ [45:29] ==> <this> defined in net.corda.client.jfx.utils.map[ReceiverParameterDescriptorImpl]

'function' @ [45:35] ==> value-parameter function: (A) -> B defined in net.corda.client.jfx.utils.map[ValueParameterDescriptorImpl]

'ReadOnlyObjectWrapper' @ [57:40] ==> public constructor ReadOnlyObjectWrapper<T : (Any..Any?)>(p0: (A..A?)) defined in javafx.beans.property.ReadOnlyObjectWrapper[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A

'this' @ [57:62] ==> <this> defined in net.corda.client.jfx.utils.lift[ReceiverParameterDescriptorImpl]

'map' @ [61:34] ==> public final fun <T : (Any..Any?), U : (Any..Any?)> map(p0: (ObservableValue<(A..A?)>..ObservableValue<(A..A?)>?), p1: (((A..A?)) -> (R..R?)..(((A..A?)) -> (R..R?))?)): (MonadicBinding<(R..R?)>..MonadicBinding<(R..R?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A
    <U : (Any..Any?)> -> R

'arg0' @ [61:38] ==> value-parameter arg0: ObservableValue<A> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'this' @ [61:44] ==> <this> defined in net.corda.client.jfx.utils.lift[ReceiverParameterDescriptorImpl]

'combine' @ [66:34] ==> public final fun <A : (Any..Any?), B : (Any..Any?), R : (Any..Any?)> combine(p0: (ObservableValue<(A..A?)>..ObservableValue<(A..A?)>?), p1: (ObservableValue<(B..B?)>..ObservableValue<(B..B?)>?), p2: (((A..A?), (B..B?)) -> (R..R?)..(((A..A?), (B..B?)) -> (R..R?))?)): (MonadicBinding<(R..R?)>..MonadicBinding<(R..R?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B
    <R : (Any..Any?)> -> R

'arg0' @ [66:42] ==> value-parameter arg0: ObservableValue<A> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'arg1' @ [66:48] ==> value-parameter arg1: ObservableValue<B> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'this' @ [66:54] ==> <this> defined in net.corda.client.jfx.utils.lift[ReceiverParameterDescriptorImpl]

'combine' @ [72:34] ==> public final fun <A : (Any..Any?), B : (Any..Any?), C : (Any..Any?), R : (Any..Any?)> combine(p0: (ObservableValue<(A..A?)>..ObservableValue<(A..A?)>?), p1: (ObservableValue<(B..B?)>..ObservableValue<(B..B?)>?), p2: (ObservableValue<(C..C?)>..ObservableValue<(C..C?)>?), p3: (((A..A?), (B..B?), (C..C?)) -> (R..R?)..(((A..A?), (B..B?), (C..C?)) -> (R..R?))?)): (MonadicBinding<(R..R?)>..MonadicBinding<(R..R?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B
    <C : (Any..Any?)> -> C
    <R : (Any..Any?)> -> R

'arg0' @ [72:42] ==> value-parameter arg0: ObservableValue<A> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'arg1' @ [72:48] ==> value-parameter arg1: ObservableValue<B> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'arg2' @ [72:54] ==> value-parameter arg2: ObservableValue<C> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'this' @ [72:60] ==> <this> defined in net.corda.client.jfx.utils.lift[ReceiverParameterDescriptorImpl]

'combine' @ [79:34] ==> public final fun <A : (Any..Any?), B : (Any..Any?), C : (Any..Any?), D : (Any..Any?), R : (Any..Any?)> combine(p0: (ObservableValue<(A..A?)>..ObservableValue<(A..A?)>?), p1: (ObservableValue<(B..B?)>..ObservableValue<(B..B?)>?), p2: (ObservableValue<(C..C?)>..ObservableValue<(C..C?)>?), p3: (ObservableValue<(D..D?)>..ObservableValue<(D..D?)>?), p4: (((A..A?), (B..B?), (C..C?), (D..D?)) -> (R..R?)..(((A..A?), (B..B?), (C..C?), (D..D?)) -> (R..R?))?)): (MonadicBinding<(R..R?)>..MonadicBinding<(R..R?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <A : (Any..Any?)> -> A
    <B : (Any..Any?)> -> B
    <C : (Any..Any?)> -> C
    <D : (Any..Any?)> -> D
    <R : (Any..Any?)> -> R

'arg0' @ [79:42] ==> value-parameter arg0: ObservableValue<A> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'arg1' @ [79:48] ==> value-parameter arg1: ObservableValue<B> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'arg2' @ [79:54] ==> value-parameter arg2: ObservableValue<C> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'arg3' @ [79:60] ==> value-parameter arg3: ObservableValue<D> defined in net.corda.client.jfx.utils.lift[ValueParameterDescriptorImpl]

'this' @ [79:66] ==> <this> defined in net.corda.client.jfx.utils.lift[ReceiverParameterDescriptorImpl]

'monadic' @ [87:18] ==> public open fun <T : (Any..Any?)> monadic(p0: (ObservableValue<out ({Any & A}..A?)>..ObservableValue<out ({Any & A}..A?)>?)): (MonadicObservableValue<out ({Any & A}..A?)>..MonadicObservableValue<out ({Any & A}..A?)>?) defined in org.fxmisc.easybind.EasyBind[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ({Any & A}..A)

'this' @ [87:26] ==> <this> defined in net.corda.client.jfx.utils.bind[ReceiverParameterDescriptorImpl]

'flatMap' @ [87:32] ==> public final fun <U : (Any..Any?)> flatMap(p0: (((Nothing..Nothing?)) -> (ObservableValue<(B..B?)>..ObservableValue<(B..B?)>?)..(((Nothing..Nothing?)) -> (ObservableValue<(B..B?)>..ObservableValue<(B..B?)>?))?)): (MonadicBinding<(B..B?)>..MonadicBinding<(B..B?)>?) defined in org.fxmisc.easybind.monadic.MonadicObservableValue[MyFunctionDescriptor]
Inferred types:
    <U : (Any..Any?)> -> B

'function' @ [87:40] ==> value-parameter function: (A) -> ObservableValue<B> defined in net.corda.client.jfx.utils.bind[ValueParameterDescriptorImpl]

'Suppress' @ [94:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'monadic' @ [95:18] ==> public open fun <T : (Any..Any?)> monadic(p0: (ObservableValue<out ({Any & A}..A?)>..ObservableValue<out ({Any & A}..A?)>?)): (MonadicObservableValue<out ({Any & A}..A?)>..MonadicObservableValue<out ({Any & A}..A?)>?) defined in org.fxmisc.easybind.EasyBind[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ({Any & A}..A)

'this' @ [95:26] ==> <this> defined in net.corda.client.jfx.utils.bindOut[ReceiverParameterDescriptorImpl]

'flatMap' @ [95:32] ==> public final fun <U : (Any..Any?)> flatMap(p0: (((Nothing..Nothing?)) -> (ObservableValue<(B..B?)>..ObservableValue<(B..B?)>?)..(((Nothing..Nothing?)) -> (ObservableValue<(B..B?)>..ObservableValue<(B..B?)>?))?)): (MonadicBinding<(B..B?)>..MonadicBinding<(B..B?)>?) defined in org.fxmisc.easybind.monadic.MonadicObservableValue[MyFunctionDescriptor]
Inferred types:
    <U : (Any..Any?)> -> B

'function' @ [95:40] ==> value-parameter function: (A) -> ObservableValue<out B> defined in net.corda.client.jfx.utils.bindOut[ValueParameterDescriptorImpl]

'Suppress' @ [107:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'FilteredList' @ [108:12] ==> public constructor FilteredList<E : (Any..Any?)>(@NamedArg p0: (ObservableList<(A..A?)>..ObservableList<(A..A?)>?)) defined in javafx.collections.transformation.FilteredList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'this' @ [108:28] ==> <this> defined in net.corda.client.jfx.utils.filter[ReceiverParameterDescriptorImpl]

'apply' @ [108:55] ==> @InlineOnly public inline fun <T> FilteredList<A>.apply(block: FilteredList<A>.() -> Unit): FilteredList<A> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FilteredList<A>

'predicateProperty' @ [109:9] ==> public final fun predicateProperty(): (ObjectProperty<(Predicate<in (A..A?)>..Predicate<in (A..A?)>?)>..ObjectProperty<(Predicate<in (A..A?)>..Predicate<in (A..A?)>?)>?) defined in javafx.collections.transformation.FilteredList[JavaMethodDescriptor]

'bind' @ [109:29] ==> public abstract fun bind(p0: (ObservableValue<out (Predicate<in (A..A?)>..Predicate<in (A..A?)>?)>..ObservableValue<out (Predicate<in (A..A?)>..Predicate<in (A..A?)>?)>?)): Unit defined in javafx.beans.property.ObjectProperty[JavaMethodDescriptor]

'predicate' @ [109:34] ==> value-parameter predicate: ObservableValue<(A) -> Boolean> defined in net.corda.client.jfx.utils.filter[ValueParameterDescriptorImpl]

'map' @ [109:44] ==> public fun <A, B> ObservableValue<out (A) -> Boolean>.map(function: ((A) -> Boolean) -> Predicate<A>): ObservableValue<Predicate<A>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Function1<A, Boolean>
    <B> -> Predicate<A>

'Predicate' @ [110:13] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (A) -> Boolean): Predicate<A> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> A

'invoke' @ [110:28] ==> public abstract operator fun invoke(p1: A): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [110:46] ==> value-parameter it: A defined in net.corda.client.jfx.utils.filter.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [122:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'this' @ [123:13] ==> <this> defined in net.corda.client.jfx.utils.filterNotNull[ReceiverParameterDescriptorImpl]

'filtered' @ [123:41] ==> public open fun filtered(p0: (Predicate<A?>..Predicate<A?>?)): (FilteredList<A?>..FilteredList<A?>?) defined in javafx.collections.ObservableList[JavaMethodDescriptor]

't' @ [125:20] ==> value-parameter t: A? defined in net.corda.client.jfx.utils.filterNotNull.<no name provided>.test[ValueParameterDescriptorImpl]

'createObjectBinding' @ [137:21] ==> public final fun <T : (Any..Any?)> createObjectBinding(p0: (() -> (B..B?)..(() -> (B..B?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (ObjectBinding<(B..B?)>..ObjectBinding<(B..B?)>?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> B

'initial' @ [138:23] ==> value-parameter initial: B defined in net.corda.client.jfx.utils.foldObservable[ValueParameterDescriptorImpl]

'forEach' @ [139:9] ==> @HidesMembers public inline fun <T> Iterable<A>.forEach(action: (A) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A

'current' @ [140:13] ==> var current: B defined in net.corda.client.jfx.utils.foldObservable.<anonymous>[LocalVariableDescriptor]

'invoke' @ [140:23] ==> public abstract operator fun invoke(p1: B, p2: A): B defined in kotlin.Function2[FunctionInvokeDescriptor]

'current' @ [140:38] ==> var current: B defined in net.corda.client.jfx.utils.foldObservable.<anonymous>[LocalVariableDescriptor]

'it' @ [140:47] ==> value-parameter it: A defined in net.corda.client.jfx.utils.foldObservable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'current' @ [142:9] ==> var current: B defined in net.corda.client.jfx.utils.foldObservable.<anonymous>[LocalVariableDescriptor]

'arrayOf' @ [143:8] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ObservableList<out ({Any & A}..A)>): Array<ObservableList<out ({Any & A}..A)>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ObservableList<out ({Any & A}..A)>

'this' @ [143:16] ==> <this> defined in net.corda.client.jfx.utils.foldObservable[ReceiverParameterDescriptorImpl]

'FlattenedList' @ [151:83] ==> public constructor FlattenedList<A>(sourceList: ObservableList<out ObservableValue<out A>>) defined in net.corda.client.jfx.utils.FlattenedList[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> A

'this' @ [151:97] ==> <this> defined in net.corda.client.jfx.utils.flatten[ReceiverParameterDescriptorImpl]

'FlattenedList' @ [158:76] ==> public constructor FlattenedList<A>(sourceList: ObservableList<out ObservableValue<out A>>) defined in net.corda.client.jfx.utils.FlattenedList[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> A

'observableArrayList' @ [158:104] ==> public open fun <E : (Any..Any?)> observableArrayList(p0: (MutableCollection<out (ObservableValue<out A>..ObservableValue<out A>?)>..Collection<(ObservableValue<out A>..ObservableValue<out A>?)>?)): (ObservableList<(ObservableValue<out A>..ObservableValue<out A>?)>..ObservableList<(ObservableValue<out A>..ObservableValue<out A>?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ObservableValue<out A>

'this' @ [158:124] ==> <this> defined in net.corda.client.jfx.utils.sequence[ReceiverParameterDescriptorImpl]

'AssociatedList' @ [166:12] ==> public constructor AssociatedList<K, out A, B>(sourceList: ObservableList<out A>, toKey: (A) -> K, assemble: (K, A) -> B) defined in net.corda.client.jfx.utils.AssociatedList[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <out A> -> A
    <B> -> B

'this' @ [166:27] ==> <this> defined in net.corda.client.jfx.utils.associateBy[ReceiverParameterDescriptorImpl]

'toKey' @ [166:33] ==> value-parameter toKey: (A) -> K defined in net.corda.client.jfx.utils.associateBy[ValueParameterDescriptorImpl]

'assemble' @ [166:40] ==> value-parameter assemble: (K, A) -> B defined in net.corda.client.jfx.utils.associateBy[ValueParameterDescriptorImpl]

'associateBy' @ [174:12] ==> public fun <K, A, B> ObservableList<out A>.associateBy(toKey: (A) -> K, assemble: (K, A) -> A): ObservableMap<K, A> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <A> -> A
    <B> -> A

'toKey' @ [174:24] ==> value-parameter toKey: (A) -> K defined in net.corda.client.jfx.utils.associateBy[ValueParameterDescriptorImpl]

'value' @ [174:45] ==> value-parameter value: A defined in net.corda.client.jfx.utils.associateBy.<anonymous>[ValueParameterDescriptorImpl]

'AssociatedList' @ [182:12] ==> public constructor AssociatedList<K, out A, B>(sourceList: ObservableList<out Pair<K, ObservableList<A>>>, toKey: (Pair<K, ObservableList<A>>) -> K, assemble: (K, Pair<K, ObservableList<A>>) -> ObservableList<B>) defined in net.corda.client.jfx.utils.AssociatedList[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <out A> -> Pair<K, ObservableList<A>>
    <B> -> ObservableList<B>

'AggregatedList' @ [182:27] ==> public constructor AggregatedList<A, E : Any, K : Any>(list: ObservableList<out A>, toKey: (A) -> K, assemble: (K, ObservableList<A>) -> Pair<K, ObservableList<A>>) defined in net.corda.client.jfx.utils.AggregatedList[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> Pair<K, ObservableList<A>>
    <E : Any> -> A
    <K : Any> -> K

'this' @ [182:42] ==> <this> defined in net.corda.client.jfx.utils.associateByAggregation[ReceiverParameterDescriptorImpl]

'toKey' @ [182:48] ==> value-parameter toKey: (A) -> K defined in net.corda.client.jfx.utils.associateByAggregation[ValueParameterDescriptorImpl]

'Pair' @ [182:73] ==> public constructor Pair<out A, out B>(first: K, second: ObservableList<A>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> K
    <out B> -> ObservableList<A>

'key' @ [182:78] ==> value-parameter key: K defined in net.corda.client.jfx.utils.associateByAggregation.<anonymous>[ValueParameterDescriptorImpl]

'members' @ [182:83] ==> value-parameter members: ObservableList<A> defined in net.corda.client.jfx.utils.associateByAggregation.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [182:97] ==> value-parameter it: Pair<K, ObservableList<A>> defined in net.corda.client.jfx.utils.associateByAggregation.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [182:100] ==> public final val first: K defined in kotlin.Pair[DeserializedPropertyDescriptor]

'pair' @ [183:9] ==> value-parameter pair: Pair<K, ObservableList<A>> defined in net.corda.client.jfx.utils.associateByAggregation.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [183:14] ==> public final val second: ObservableList<A> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'map' @ [183:21] ==> public fun <A, B> ObservableList<out A>.map(cached: Boolean = ..., function: (A) -> B): ObservableList<B> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> A
    <B> -> B

'invoke' @ [183:27] ==> public abstract operator fun invoke(p1: K, p2: A): B defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [183:36] ==> value-parameter key: K defined in net.corda.client.jfx.utils.associateByAggregation.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [183:41] ==> value-parameter it: A defined in net.corda.client.jfx.utils.associateByAggregation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'associateByAggregation' @ [192:12] ==> public fun <K : Any, A : Any, B> ObservableList<out A>.associateByAggregation(toKey: (A) -> K, assemble: (K, A) -> A): ObservableMap<K, ObservableList<A>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <K : Any> -> K
    <A : Any> -> A
    <B> -> A

'toKey' @ [192:35] ==> value-parameter toKey: (A) -> K defined in net.corda.client.jfx.utils.associateByAggregation[ValueParameterDescriptorImpl]

'value' @ [192:56] ==> value-parameter value: A defined in net.corda.client.jfx.utils.associateByAggregation.<anonymous>[ValueParameterDescriptorImpl]

'SimpleObjectProperty' @ [200:20] ==> public constructor SimpleObjectProperty<T : (Any..Any?)>(p0: (V..V?)) defined in javafx.beans.property.SimpleObjectProperty[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> V

'get' @ [200:41] ==> public abstract fun get(key: (K..K?)): V? defined in javafx.collections.ObservableMap[DeserializedSimpleFunctionDescriptor]

'key' @ [200:45] ==> value-parameter key: K defined in net.corda.client.jfx.utils.getObservableValue[ValueParameterDescriptorImpl]

'addListener' @ [201:5] ==> public final fun addListener(p0: (((MapChangeListener.Change<out (K..K?), out (V..V?)>..MapChangeListener.Change<out (K..K?), out (V..V?)>?)) -> Unit..(((MapChangeListener.Change<out (K..K?), out (V..V?)>..MapChangeListener.Change<out (K..K?), out (V..V?)>?)) -> Unit)?)): Unit defined in javafx.collections.ObservableMap[MyFunctionDescriptor]

'change' @ [202:13] ==> value-parameter change: MapChangeListener.Change<out K, out V> defined in net.corda.client.jfx.utils.getObservableValue.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [202:20] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out ({Any & K}..K), out ({Any & V}..V)>.key: ({Any & K}..K?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ({Any & K}..K)
    <V : (Any..Any?)> -> ({Any & V}..V)

'key' @ [202:27] ==> value-parameter key: K defined in net.corda.client.jfx.utils.getObservableValue[ValueParameterDescriptorImpl]

'if (change.wasAdded()) {
                property.set(change.valueAdded)
            } else if (change.wasRemoved()) {
                property.set(null)
            }' @ [204:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'change' @ [204:17] ==> value-parameter change: MapChangeListener.Change<out K, out V> defined in net.corda.client.jfx.utils.getObservableValue.<anonymous>[ValueParameterDescriptorImpl]

'wasAdded' @ [204:24] ==> public abstract fun wasAdded(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'property' @ [205:17] ==> val property: SimpleObjectProperty<V> defined in net.corda.client.jfx.utils.getObservableValue[LocalVariableDescriptor]

'set' @ [205:26] ==> public open fun set(p0: (V..V?)): Unit defined in javafx.beans.property.SimpleObjectProperty[JavaMethodDescriptor]

'change' @ [205:30] ==> value-parameter change: MapChangeListener.Change<out K, out V> defined in net.corda.client.jfx.utils.getObservableValue.<anonymous>[ValueParameterDescriptorImpl]

'valueAdded' @ [205:37] ==> public final val <K : (Any..Any?), V : (Any..Any?)> MapChangeListener.Change<out ({Any & K}..K), out ({Any & V}..V)>.valueAdded: ({Any & V}..V?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ({Any & K}..K)
    <V : (Any..Any?)> -> ({Any & V}..V)

'change' @ [206:24] ==> value-parameter change: MapChangeListener.Change<out K, out V> defined in net.corda.client.jfx.utils.getObservableValue.<anonymous>[ValueParameterDescriptorImpl]

'wasRemoved' @ [206:31] ==> public abstract fun wasRemoved(): Boolean defined in javafx.collections.MapChangeListener.Change[JavaMethodDescriptor]

'property' @ [207:17] ==> val property: SimpleObjectProperty<V> defined in net.corda.client.jfx.utils.getObservableValue[LocalVariableDescriptor]

'set' @ [207:26] ==> public open fun set(p0: (V..V?)): Unit defined in javafx.beans.property.SimpleObjectProperty[JavaMethodDescriptor]

'property' @ [211:12] ==> val property: SimpleObjectProperty<V> defined in net.corda.client.jfx.utils.getObservableValue[LocalVariableDescriptor]

'MapValuesList' @ [219:12] ==> public companion object defined in net.corda.client.jfx.utils.MapValuesList[FakeCallableDescriptorForObject]

'create' @ [219:26] ==> public final fun <K, A, C> create(sourceMap: ObservableMap<K, V>, assemble: (Map.Entry<K, V>) -> V): MapValuesList<K, V, V> defined in net.corda.client.jfx.utils.MapValuesList.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <A> -> V
    <C> -> V

'this' @ [219:33] ==> <this> defined in net.corda.client.jfx.utils.getObservableValues[ReceiverParameterDescriptorImpl]

'it' @ [219:41] ==> value-parameter it: Map.Entry<K, V> defined in net.corda.client.jfx.utils.getObservableValues.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [219:44] ==> public abstract val value: V defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'MapValuesList' @ [227:12] ==> public companion object defined in net.corda.client.jfx.utils.MapValuesList[FakeCallableDescriptorForObject]

'create' @ [227:26] ==> public final fun <K, A, C> create(sourceMap: ObservableMap<K, V>, assemble: (Map.Entry<K, V>) -> Map.Entry<K, V>): MapValuesList<K, V, Map.Entry<K, V>> defined in net.corda.client.jfx.utils.MapValuesList.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <A> -> V
    <C> -> Entry<K, V>

'this' @ [227:33] ==> <this> defined in net.corda.client.jfx.utils.getObservableEntries[ReceiverParameterDescriptorImpl]

'it' @ [227:41] ==> value-parameter it: Map.Entry<K, V> defined in net.corda.client.jfx.utils.getObservableEntries.<anonymous>[ValueParameterDescriptorImpl]

'ConcatenatedList' @ [235:12] ==> public constructor ConcatenatedList<A>(sourceList: ObservableList<ObservableList<A>>) defined in net.corda.client.jfx.utils.ConcatenatedList[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> A

'this' @ [235:29] ==> <this> defined in net.corda.client.jfx.utils.concatenate[ReceiverParameterDescriptorImpl]

'leftOuterJoin' @ [250:21] ==> public fun <A : Any, B : Any, K : Any> ObservableList<A>.leftOuterJoin(rightTable: ObservableList<B>, leftToJoinKey: (A) -> K, rightToJoinKey: (B) -> K): ObservableMap<K, Pair<ObservableList<A>, ObservableList<B>>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A : Any> -> A
    <B : Any> -> B
    <K : Any> -> K

'rightTable' @ [250:35] ==> value-parameter rightTable: ObservableList<B> defined in net.corda.client.jfx.utils.leftOuterJoin[ValueParameterDescriptorImpl]

'leftToJoinKey' @ [250:47] ==> value-parameter leftToJoinKey: (A) -> K defined in net.corda.client.jfx.utils.leftOuterJoin[ValueParameterDescriptorImpl]

'rightToJoinKey' @ [250:62] ==> value-parameter rightToJoinKey: (B) -> K defined in net.corda.client.jfx.utils.leftOuterJoin[ValueParameterDescriptorImpl]

'joinedMap' @ [251:12] ==> val joinedMap: ObservableMap<K, Pair<ObservableList<A>, ObservableList<B>>> defined in net.corda.client.jfx.utils.leftOuterJoin[LocalVariableDescriptor]

'getObservableValues' @ [251:22] ==> public fun <K, V> ObservableMap<K, Pair<ObservableList<A>, ObservableList<B>>>.getObservableValues(): ObservableList<Pair<ObservableList<A>, ObservableList<B>>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> Pair<ObservableList<A>, ObservableList<B>>

'map' @ [251:44] ==> public fun <A, B> ObservableList<out Pair<ObservableList<A>, ObservableList<B>>>.map(cached: Boolean = ..., function: (Pair<ObservableList<A>, ObservableList<B>>) -> ObservableList<C>): ObservableList<ObservableList<C>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> Pair<ObservableList<A>, ObservableList<B>>
    <B> -> ObservableList<C>

'pair' @ [252:9] ==> value-parameter pair: Pair<ObservableList<A>, ObservableList<B>> defined in net.corda.client.jfx.utils.leftOuterJoin.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [252:14] ==> public final val first: ObservableList<A> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'map' @ [252:20] ==> public fun <A, B> ObservableList<out A>.map(cached: Boolean = ..., function: (A) -> C): ObservableList<C> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> A
    <B> -> C

'invoke' @ [252:26] ==> public abstract operator fun invoke(p1: A, p2: ObservableList<B>): C defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [252:35] ==> value-parameter it: A defined in net.corda.client.jfx.utils.leftOuterJoin.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'pair' @ [252:39] ==> value-parameter pair: Pair<ObservableList<A>, ObservableList<B>> defined in net.corda.client.jfx.utils.leftOuterJoin.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [252:44] ==> public final val second: ObservableList<B> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'concatenate' @ [253:7] ==> public fun <A> ObservableList<ObservableList<C>>.concatenate(): ObservableList<C> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> C

'associateByAggregation' @ [273:24] ==> public fun <K : Any, A : Any> ObservableList<out A>.associateByAggregation(toKey: (A) -> K): ObservableMap<K, ObservableList<A>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <K : Any> -> K
    <A : Any> -> A

'leftToJoinKey' @ [273:47] ==> value-parameter leftToJoinKey: (A) -> K defined in net.corda.client.jfx.utils.leftOuterJoin[ValueParameterDescriptorImpl]

'rightTable' @ [274:25] ==> value-parameter rightTable: ObservableList<B> defined in net.corda.client.jfx.utils.leftOuterJoin[ValueParameterDescriptorImpl]

'associateByAggregation' @ [274:36] ==> public fun <K : Any, A : Any> ObservableList<out B>.associateByAggregation(toKey: (B) -> K): ObservableMap<K, ObservableList<B>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <K : Any> -> K
    <A : Any> -> B

'rightToJoinKey' @ [274:59] ==> value-parameter rightToJoinKey: (B) -> K defined in net.corda.client.jfx.utils.leftOuterJoin[ValueParameterDescriptorImpl]

'LeftOuterJoinedMap' @ [276:13] ==> public constructor LeftOuterJoinedMap<K : Any, A, B, C>(leftTable: ObservableMap<K, out ObservableList<A>>, rightTable: ObservableMap<K, out ObservableList<B>>, assemble: (K, ObservableList<A>, ObservableValue<ObservableList<B>?>) -> Pair<ObservableList<A>, ObservableList<B>>) defined in net.corda.client.jfx.utils.LeftOuterJoinedMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K : Any> -> K
    <A> -> ObservableList<A>
    <B> -> ObservableList<B>
    <C> -> Pair<ObservableList<A>, ObservableList<B>>

'leftTableMap' @ [276:32] ==> val leftTableMap: ObservableMap<K, ObservableList<A>> defined in net.corda.client.jfx.utils.leftOuterJoin[LocalVariableDescriptor]

'rightTableMap' @ [276:46] ==> val rightTableMap: ObservableMap<K, ObservableList<B>> defined in net.corda.client.jfx.utils.leftOuterJoin[LocalVariableDescriptor]

'Pair' @ [277:17] ==> public constructor Pair<out A, out B>(first: ObservableList<A>, second: ChosenList<B>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ObservableList<A>
    <out B> -> ChosenList<B>

'left' @ [277:22] ==> value-parameter left: ObservableList<A> defined in net.corda.client.jfx.utils.leftOuterJoin.<anonymous>[ValueParameterDescriptorImpl]

'ChosenList' @ [277:28] ==> public constructor ChosenList<E>(chosenListObservable: ObservableValue<out ObservableList<out B>>) defined in net.corda.client.jfx.utils.ChosenList[ClassConstructorDescriptorImpl]
Inferred types:
    <E> -> B

'rightValue' @ [277:39] ==> value-parameter rightValue: ObservableValue<ObservableList<B>?> defined in net.corda.client.jfx.utils.leftOuterJoin.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [277:50] ==> public fun <A, B> ObservableValue<out ObservableList<B>?>.map(function: (ObservableList<B>?) -> (ObservableList<B>..ObservableList<B>?)): ObservableValue<(ObservableList<B>..ObservableList<B>?)> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> ObservableList<B>?
    <B> -> (javafx.collections.ObservableList<B>..javafx.collections.ObservableList<B>?)

'it' @ [277:56] ==> value-parameter it: ObservableList<B>? defined in net.corda.client.jfx.utils.leftOuterJoin.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'emptyObservableList' @ [277:76] ==> public open fun <E : (Any..Any?)> emptyObservableList(): (ObservableList<(B..B?)>..ObservableList<(B..B?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> B

'joinedMap' @ [279:12] ==> val joinedMap: ObservableMap<K, Pair<ObservableList<A>, ObservableList<B>>> defined in net.corda.client.jfx.utils.leftOuterJoin[LocalVariableDescriptor]

'valueAt' @ [283:21] ==> public open fun <E : (Any..Any?)> valueAt(p0: (ObservableList<(A..A?)>..ObservableList<(A..A?)>?), p1: Int): (ObjectBinding<(A..A?)>..ObjectBinding<(A..A?)>?) defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'this' @ [283:29] ==> <this> defined in net.corda.client.jfx.utils.getValueAt[ReceiverParameterDescriptorImpl]

'index' @ [283:35] ==> value-parameter index: Int defined in net.corda.client.jfx.utils.getValueAt[ValueParameterDescriptorImpl]

'getValueAt' @ [287:12] ==> public fun <A> ObservableList<A>.getValueAt(index: Int): ObservableValue<A?> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> A

'createObjectBinding' @ [291:21] ==> public final fun <T : (Any..Any?)> createObjectBinding(p0: (() -> (A..A?)..(() -> (A..A?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (ObjectBinding<(A..A?)>..ObjectBinding<(A..A?)>?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A

'if (size > 0) {
            this[this.size - 1]
        } else {
            null
        }' @ [292:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: A?, elseBranch: A?): A?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> A?

'size' @ [292:13] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'this' @ [293:13] ==> <this> defined in net.corda.client.jfx.utils.last[ReceiverParameterDescriptorImpl]

'this' @ [293:18] ==> <this> defined in net.corda.client.jfx.utils.last[ReceiverParameterDescriptorImpl]

'size' @ [293:23] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'arrayOf' @ [297:8] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ObservableList<A>): Array<ObservableList<A>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ObservableList<A>

'this' @ [297:16] ==> <this> defined in net.corda.client.jfx.utils.last[ReceiverParameterDescriptorImpl]

'AggregatedList' @ [301:12] ==> public constructor AggregatedList<A, E : Any, K : Any>(list: ObservableList<out T>, toKey: (T) -> T, assemble: (T, ObservableList<T>) -> T) defined in net.corda.client.jfx.utils.AggregatedList[ClassConstructorDescriptorImpl]
Inferred types:
    <A> -> T
    <E : Any> -> T
    <K : Any> -> T

'this' @ [301:27] ==> <this> defined in net.corda.client.jfx.utils.unique[ReceiverParameterDescriptorImpl]

'it' @ [301:35] ==> value-parameter it: T defined in net.corda.client.jfx.utils.unique.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [301:53] ==> value-parameter key: T defined in net.corda.client.jfx.utils.unique.<anonymous>[ValueParameterDescriptorImpl]

'createBooleanBinding' @ [305:21] ==> public final fun createBooleanBinding(p0: (() -> (Boolean..Boolean?)..(() -> (Boolean..Boolean?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (BooleanBinding..BooleanBinding?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]

'this' @ [305:44] ==> <this> defined in net.corda.client.jfx.utils.isNotNull[ReceiverParameterDescriptorImpl]

'value' @ [305:49] ==> public final val <T : (Any..Any?)> ObservableValue<out (Any..Any?)>.value: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'arrayOf' @ [305:66] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ObservableValue<out (Any..Any?)>): Array<ObservableValue<out (Any..Any?)>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ObservableValue<out (kotlin.Any..kotlin.Any?)>

'this' @ [305:74] ==> <this> defined in net.corda.client.jfx.utils.isNotNull[ReceiverParameterDescriptorImpl]

'createObjectBinding' @ [313:21] ==> public final fun <T : (Any..Any?)> createObjectBinding(p0: (() -> (A..A?)..(() -> (A..A?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (ObjectBinding<(A..A?)>..ObjectBinding<(A..A?)>?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A

'this' @ [313:43] ==> <this> defined in net.corda.client.jfx.utils.firstOrDefault[ReceiverParameterDescriptorImpl]

'firstOrNull' @ [313:48] ==> public inline fun <T> Iterable<(A..A?)>.firstOrNull(predicate: ((A..A?)) -> Boolean): A? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (A..A?)

'predicate' @ [313:60] ==> value-parameter predicate: (A) -> Boolean defined in net.corda.client.jfx.utils.firstOrDefault[ValueParameterDescriptorImpl]

'default' @ [313:74] ==> value-parameter default: ObservableValue<A?> defined in net.corda.client.jfx.utils.firstOrDefault[ValueParameterDescriptorImpl]

'value' @ [313:82] ==> public final val <T : (Any..Any?)> ObservableValue<A?>.value: A?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A?

'arrayOf' @ [313:91] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Observable): Array<Observable> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Observable

'this' @ [313:99] ==> <this> defined in net.corda.client.jfx.utils.firstOrDefault[ReceiverParameterDescriptorImpl]

'default' @ [313:105] ==> value-parameter default: ObservableValue<A?> defined in net.corda.client.jfx.utils.firstOrDefault[ValueParameterDescriptorImpl]

'createObjectBinding' @ [321:21] ==> public final fun <T : (Any..Any?)> createObjectBinding(p0: (() -> (A..A?)..(() -> (A..A?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (ObjectBinding<(A..A?)>..ObjectBinding<(A..A?)>?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A

'this' @ [321:43] ==> <this> defined in net.corda.client.jfx.utils.firstOrNullObservable[ReceiverParameterDescriptorImpl]

'firstOrNull' @ [321:48] ==> public inline fun <T> Iterable<(A..A?)>.firstOrNull(predicate: ((A..A?)) -> Boolean): A? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (A..A?)

'predicate' @ [321:60] ==> value-parameter predicate: (A) -> Boolean defined in net.corda.client.jfx.utils.firstOrNullObservable[ValueParameterDescriptorImpl]

'arrayOf' @ [321:74] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ObservableList<A>): Array<ObservableList<A>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ObservableList<A>

'this' @ [321:82] ==> <this> defined in net.corda.client.jfx.utils.firstOrNullObservable[ReceiverParameterDescriptorImpl]

'observeOn' @ [330:60] ==> public final fun observeOn(p0: (Scheduler..Scheduler?)): (Observable<(T..T?)>..Observable<(T..T?)>?) defined in rx.Observable[JavaMethodDescriptor]

'from' @ [330:81] ==> public final fun from(p0: (((Runnable..Runnable?)) -> Unit..(((Runnable..Runnable?)) -> Unit)?)): (Scheduler..Scheduler?) defined in rx.schedulers.Schedulers[SamAdapterFunctionDescriptor]

'Platform' @ [330:86] ==> private constructor Platform() defined in javafx.application.Platform[JavaClassConstructorDescriptor]

'observableArrayList' @ [341:30] ==> public open fun <E : (Any..Any?)> observableArrayList(p0: (MutableCollection<out (StateAndRef<T>..StateAndRef<T>?)>..Collection<(StateAndRef<T>..StateAndRef<T>?)>?)): (ObservableList<(StateAndRef<T>..StateAndRef<T>?)>..ObservableList<(StateAndRef<T>..StateAndRef<T>?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> StateAndRef<T>

'snapshot' @ [341:50] ==> public final val snapshot: Vault.Page<T> defined in net.corda.core.messaging.DataFeed[DeserializedPropertyDescriptor]

'states' @ [341:59] ==> public final val states: List<StateAndRef<T>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'updates' @ [342:5] ==> public final val updates: Observable<Vault.Update<T>> defined in net.corda.core.messaging.DataFeed[DeserializedPropertyDescriptor]

'observeOnFXThread' @ [342:13] ==> public fun <T> Observable<Vault.Update<T>>.observeOnFXThread(): Observable<Vault.Update<T>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Update<T>

'subscribe' @ [342:33] ==> public final fun subscribe(p0: (((Vault.Update<T>..Vault.Update<T>?)) -> Unit..(((Vault.Update<T>..Vault.Update<T>?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'component1' @ [342:46] ==> public final operator fun component1(): Set<StateAndRef<T>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'component2' @ [342:56] ==> public final operator fun component2(): Set<StateAndRef<T>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'list' @ [343:9] ==> val list: (ObservableList<(StateAndRef<T>..StateAndRef<T>?)>..ObservableList<(StateAndRef<T>..StateAndRef<T>?)>?) defined in net.corda.client.jfx.utils.toFXListOfStateRefs[LocalVariableDescriptor]

'removeAll' @ [343:14] ==> public abstract fun removeAll(elements: Collection<(StateAndRef<T>..StateAndRef<T>?)>): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'consumed' @ [343:24] ==> val consumed: Set<StateAndRef<T>> defined in net.corda.client.jfx.utils.toFXListOfStateRefs.<anonymous>[LocalVariableDescriptor]

'list' @ [344:9] ==> val list: (ObservableList<(StateAndRef<T>..StateAndRef<T>?)>..ObservableList<(StateAndRef<T>..StateAndRef<T>?)>?) defined in net.corda.client.jfx.utils.toFXListOfStateRefs[LocalVariableDescriptor]

'addAll' @ [344:14] ==> public abstract fun addAll(elements: Collection<(StateAndRef<T>..StateAndRef<T>?)>): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'produced' @ [344:21] ==> val produced: Set<StateAndRef<T>> defined in net.corda.client.jfx.utils.toFXListOfStateRefs.<anonymous>[LocalVariableDescriptor]

'list' @ [346:12] ==> val list: (ObservableList<(StateAndRef<T>..StateAndRef<T>?)>..ObservableList<(StateAndRef<T>..StateAndRef<T>?)>?) defined in net.corda.client.jfx.utils.toFXListOfStateRefs[LocalVariableDescriptor]

'toFXListOfStateRefs' @ [354:12] ==> public fun <T : ContractState> DataFeed<Vault.Page<T>, Vault.Update<T>>.toFXListOfStateRefs(): ObservableList<StateAndRef<T>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'map' @ [354:34] ==> public fun <A, B> ObservableList<out StateAndRef<T>>.map(cached: Boolean = ..., function: (StateAndRef<T>) -> T): ObservableList<T> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> StateAndRef<T>
    <B> -> T

'it' @ [354:40] ==> value-parameter it: StateAndRef<T> defined in net.corda.client.jfx.utils.toFXListOfStates.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [354:43] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [354:49] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

