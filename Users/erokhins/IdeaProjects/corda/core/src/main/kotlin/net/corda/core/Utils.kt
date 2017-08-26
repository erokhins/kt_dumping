'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'create' @ [14:23] ==> public final fun <T : (Any..Any?)> create(p0: (((Subscriber<in (A..A?)>..Subscriber<in (A..A?)>?)) -> Unit..(((Subscriber<in (A..A?)>..Subscriber<in (A..A?)>?)) -> Unit)?)): (Observable<(A..A?)>..Observable<(A..A?)>?) defined in rx.Observable[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> A

'thenMatch' @ [15:9] ==> public fun <V, W, X> CordaFuture<out A>.thenMatch(success: (A) -> Unit, failure: (Throwable) -> Unit): Unit defined in net.corda.core.internal.concurrent[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> A
    <W> -> Unit
    <X> -> Unit

'subscriber' @ [16:13] ==> value-parameter subscriber: (Subscriber<in (A..A?)>..Subscriber<in (A..A?)>?) defined in net.corda.core.toObservable.<anonymous>[ValueParameterDescriptorImpl]

'onNext' @ [16:24] ==> public abstract fun onNext(p0: (Any..Any?)): Unit defined in rx.Subscriber[JavaMethodDescriptor]

'it' @ [16:31] ==> value-parameter it: A defined in net.corda.core.toObservable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'subscriber' @ [17:13] ==> value-parameter subscriber: (Subscriber<in (A..A?)>..Subscriber<in (A..A?)>?) defined in net.corda.core.toObservable.<anonymous>[ValueParameterDescriptorImpl]

'onCompleted' @ [17:24] ==> public abstract fun onCompleted(): Unit defined in rx.Subscriber[JavaMethodDescriptor]

'subscriber' @ [19:13] ==> value-parameter subscriber: (Subscriber<in (A..A?)>..Subscriber<in (A..A?)>?) defined in net.corda.core.toObservable.<anonymous>[ValueParameterDescriptorImpl]

'onError' @ [19:24] ==> public abstract fun onError(p0: (Throwable..Throwable?)): Unit defined in rx.Subscriber[JavaMethodDescriptor]

'it' @ [19:32] ==> value-parameter it: Throwable defined in net.corda.core.toObservable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'openFuture' @ [29:52] ==> public fun <V> openFuture(): OpenFuture<T> defined in net.corda.core.internal.concurrent[SimpleFunctionDescriptorImpl]
Inferred types:
    <V> -> T

'also' @ [29:68] ==> @InlineOnly @SinceKotlin public inline fun <T> OpenFuture<T>.also(block: (OpenFuture<T>) -> Unit): OpenFuture<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OpenFuture<T>

'first' @ [30:24] ==> public final fun first(): (Observable<(T..T?)>..Observable<(T..T?)>?) defined in rx.Observable[JavaMethodDescriptor]

'subscribe' @ [30:32] ==> public final fun subscribe(p0: (Observer<in (T..T?)>..Observer<in (T..T?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'it' @ [32:13] ==> value-parameter it: OpenFuture<T> defined in net.corda.core.toFuture.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [32:16] ==> public abstract fun set(value: T): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[SimpleFunctionDescriptorImpl]

'value' @ [32:20] ==> value-parameter value: T defined in net.corda.core.toFuture.<anonymous>.<no name provided>.onNext[ValueParameterDescriptorImpl]

'it' @ [36:13] ==> value-parameter it: OpenFuture<T> defined in net.corda.core.toFuture.<anonymous>[ValueParameterDescriptorImpl]

'setException' @ [36:16] ==> public abstract fun setException(t: Throwable): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[SimpleFunctionDescriptorImpl]

'e' @ [36:29] ==> value-parameter e: Throwable defined in net.corda.core.toFuture.<anonymous>.<no name provided>.onError[ValueParameterDescriptorImpl]

'it' @ [41:5] ==> value-parameter it: OpenFuture<T> defined in net.corda.core.toFuture.<anonymous>[ValueParameterDescriptorImpl]

'then' @ [41:8] ==> public abstract fun <W> then(callback: (CordaFuture<T>) -> Unit): Unit defined in net.corda.core.internal.concurrent.OpenFuture[SimpleFunctionDescriptorImpl]
Inferred types:
    <W> -> Unit

'it' @ [42:13] ==> value-parameter it: CordaFuture<T> defined in net.corda.core.toFuture.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isCancelled' @ [42:16] ==> public final val <V> CordaFuture<T>.isCancelled: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> T

'subscription' @ [43:13] ==> val subscription: (Subscription..Subscription?) defined in net.corda.core.toFuture.<anonymous>[LocalVariableDescriptor]

'unsubscribe' @ [43:26] ==> public abstract fun unsubscribe(): Unit defined in rx.Subscription[JavaMethodDescriptor]

