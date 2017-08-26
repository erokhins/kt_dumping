'SimpleObjectProperty' @ [23:18] ==> public constructor SimpleObjectProperty<T : (Any..Any?)>(p0: (B..B?)) defined in javafx.beans.property.SimpleObjectProperty[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> B

'initial' @ [23:42] ==> value-parameter initial: B defined in net.corda.client.jfx.utils.foldToObservableValue[ValueParameterDescriptorImpl]

'subscribe' @ [24:5] ==> public final fun subscribe(p0: (((A..A?)) -> Unit..(((A..A?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'runLater' @ [25:18] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'result' @ [26:13] ==> val result: SimpleObjectProperty<B> defined in net.corda.client.jfx.utils.foldToObservableValue[LocalVariableDescriptor]

'set' @ [26:20] ==> public open fun set(p0: (B..B?)): Unit defined in javafx.beans.property.SimpleObjectProperty[JavaMethodDescriptor]

'invoke' @ [26:24] ==> public abstract operator fun invoke(p1: A, p2: B): B defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [26:34] ==> value-parameter it: (A..A?) defined in net.corda.client.jfx.utils.foldToObservableValue.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [26:38] ==> val result: SimpleObjectProperty<B> defined in net.corda.client.jfx.utils.foldToObservableValue[LocalVariableDescriptor]

'get' @ [26:45] ==> public open fun get(): (B..B?) defined in javafx.beans.property.SimpleObjectProperty[JavaMethodDescriptor]

'result' @ [29:12] ==> val result: SimpleObjectProperty<B> defined in net.corda.client.jfx.utils.foldToObservableValue[LocalVariableDescriptor]

'buffer' @ [43:5] ==> public final fun buffer(p0: Long, p1: (TimeUnit..TimeUnit?)): (Observable<(MutableList<(T..T?)>..List<(T..T?)>?)>..Observable<(MutableList<(T..T?)>..List<(T..T?)>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'SECONDS' @ [43:24] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'subscribe' @ [43:33] ==> public final fun subscribe(p0: (((MutableList<(T..T?)>..List<(T..T?)>?)) -> Unit..(((MutableList<(T..T?)>..List<(T..T?)>?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'it' @ [44:13] ==> value-parameter it: (MutableList<(T..T?)>..List<(T..T?)>?) defined in net.corda.client.jfx.utils.fold.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [44:16] ==> @InlineOnly public inline fun <T> Collection<(T..T?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'runLater' @ [45:22] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'it' @ [46:17] ==> value-parameter it: (MutableList<(T..T?)>..List<(T..T?)>?) defined in net.corda.client.jfx.utils.fold.<anonymous>[ValueParameterDescriptorImpl]

'fold' @ [46:20] ==> public inline fun <T, R> Iterable<(T..T?)>.fold(initial: R, operation: (R, (T..T?)) -> R): R defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)
    <R> -> R

'accumulator' @ [46:25] ==> value-parameter accumulator: R defined in net.corda.client.jfx.utils.fold[ValueParameterDescriptorImpl]

'folderFun' @ [47:21] ==> value-parameter folderFun: (R, T) -> Unit defined in net.corda.client.jfx.utils.fold[ValueParameterDescriptorImpl]

'invoke' @ [47:31] ==> public abstract operator fun invoke(p1: R, p2: T): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'list' @ [47:38] ==> value-parameter list: R defined in net.corda.client.jfx.utils.fold.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'item' @ [47:44] ==> value-parameter item: (T..T?) defined in net.corda.client.jfx.utils.fold.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'list' @ [48:21] ==> value-parameter list: R defined in net.corda.client.jfx.utils.fold.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'accumulator' @ [53:12] ==> value-parameter accumulator: R defined in net.corda.client.jfx.utils.fold[ValueParameterDescriptorImpl]

'fold' @ [60:12] ==> public fun <T, R> Observable<A>.fold(accumulator: (ObservableList<A>..ObservableList<A>?), folderFun: ((ObservableList<A>..ObservableList<A>?), A) -> Unit): (ObservableList<A>..ObservableList<A>?) defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> A
    <R> -> (javafx.collections.ObservableList<A>..javafx.collections.ObservableList<A>?)

'observableArrayList' @ [60:31] ==> public open fun <E : (Any..Any?)> observableArrayList(): (ObservableList<(A..A?)>..ObservableList<(A..A?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> A

'list' @ [61:9] ==> value-parameter list: (ObservableList<A>..ObservableList<A>?) defined in net.corda.client.jfx.utils.recordInSequence.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [61:14] ==> public abstract fun add(element: (A..A?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'newElement' @ [61:18] ==> value-parameter newElement: A defined in net.corda.client.jfx.utils.recordInSequence.<anonymous>[ValueParameterDescriptorImpl]

'newValue' @ [70:127] ==> value-parameter newValue: A defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>[ValueParameterDescriptorImpl]

'fold' @ [71:12] ==> public fun <T, R> Observable<A>.fold(accumulator: (ObservableMap<K, A>..ObservableMap<K, A>?), folderFun: ((ObservableMap<K, A>..ObservableMap<K, A>?), A) -> Unit): (ObservableMap<K, A>..ObservableMap<K, A>?) defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> A
    <R> -> (javafx.collections.ObservableMap<K, A>..javafx.collections.ObservableMap<K, A>?)

'observableHashMap' @ [71:31] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> observableHashMap(): (ObservableMap<(K..K?), (A..A?)>..ObservableMap<(K..K?), (A..A?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> A

'invoke' @ [72:19] ==> public abstract operator fun invoke(p1: A): K defined in kotlin.Function1[FunctionInvokeDescriptor]

'item' @ [72:25] ==> value-parameter item: A defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [73:9] ==> value-parameter map: (ObservableMap<K, A>..ObservableMap<K, A>?) defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [73:13] ==> val key: K defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>[LocalVariableDescriptor]

'map' @ [73:20] ==> value-parameter map: (ObservableMap<K, A>..ObservableMap<K, A>?) defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [73:24] ==> val key: K defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>[LocalVariableDescriptor]

'let' @ [73:30] ==> @InlineOnly public inline fun <T, R> A.let(block: (A) -> A): A defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> A
    <R> -> A

'invoke' @ [73:36] ==> public abstract operator fun invoke(p1: K, oldValue: @ParameterName A, newValue: @ParameterName A): A defined in kotlin.Function3[FunctionInvokeDescriptor]

'key' @ [73:42] ==> val key: K defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>[LocalVariableDescriptor]

'it' @ [73:47] ==> value-parameter it: A defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'item' @ [73:51] ==> value-parameter item: A defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>[ValueParameterDescriptorImpl]

'item' @ [73:62] ==> value-parameter item: A defined in net.corda.client.jfx.utils.recordAsAssociation.<anonymous>[ValueParameterDescriptorImpl]

