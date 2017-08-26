'cache' @ [9:26] ==> value-parameter cache: LoadingCache<K, V> defined in net.corda.node.utilities.NonInvalidatingUnboundCache.<init>[ValueParameterDescriptorImpl]

'RemovalListener' @ [11:105] ==> @GwtCompatible public fun <K : (Any..Any?), V : (Any..Any?)> RemovalListener(function: ((RemovalNotification<(K..K?), (V..V?)>..RemovalNotification<(K..K?), (V..V?)>?)) -> Unit): RemovalListener<K, V> defined in com.google.common.cache[SimpleFunctionDescriptorImpl]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'emptyList' @ [12:54] ==> public fun <T> emptyList(): List<K> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K

'this' @ [13:13] ==> private constructor NonInvalidatingUnboundCache<K, V>(cache: LoadingCache<K, V>) defined in net.corda.node.utilities.NonInvalidatingUnboundCache[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'buildCache' @ [13:18] ==> private final fun <K, V> buildCache(concurrencyLevel: Int, loadFunction: (K) -> V, removalListener: RemovalListener<K, V>, keysToPreload: () -> Iterable<K>): LoadingCache<K, V> defined in net.corda.node.utilities.NonInvalidatingUnboundCache.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'concurrencyLevel' @ [13:29] ==> value-parameter concurrencyLevel: Int defined in net.corda.node.utilities.NonInvalidatingUnboundCache.<init>[ValueParameterDescriptorImpl]

'loadFunction' @ [13:47] ==> value-parameter loadFunction: (K) -> V defined in net.corda.node.utilities.NonInvalidatingUnboundCache.<init>[ValueParameterDescriptorImpl]

'removalListener' @ [13:61] ==> value-parameter removalListener: RemovalListener<K, V> = ... defined in net.corda.node.utilities.NonInvalidatingUnboundCache.<init>[ValueParameterDescriptorImpl]

'keysToPreload' @ [13:78] ==> value-parameter keysToPreload: () -> Iterable<K> = ... defined in net.corda.node.utilities.NonInvalidatingUnboundCache.<init>[ValueParameterDescriptorImpl]

'newBuilder' @ [18:40] ==> public open fun newBuilder(): (CacheBuilder<(Any..Any?), (Any..Any?)>..CacheBuilder<(Any..Any?), (Any..Any?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]

'concurrencyLevel' @ [18:53] ==> public open fun concurrencyLevel(p0: Int): (CacheBuilder<(Any..Any?), (Any..Any?)>..CacheBuilder<(Any..Any?), (Any..Any?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]

'concurrencyLevel' @ [18:70] ==> value-parameter concurrencyLevel: Int defined in net.corda.node.utilities.NonInvalidatingUnboundCache.Companion.buildCache[ValueParameterDescriptorImpl]

'removalListener' @ [18:88] ==> @CheckReturnValue public open fun <K1 : (Any..Any?), V1 : (Any..Any?)> removalListener(p0: (RemovalListener<in (K..K?), in (V..V?)>..RemovalListener<in (K..K?), in (V..V?)>?)): (CacheBuilder<(K..K?), (V..V?)>..CacheBuilder<(K..K?), (V..V?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]
Inferred types:
    <K1 : (Any..Any?)> -> K
    <V1 : (Any..Any?)> -> V

'removalListener' @ [18:104] ==> value-parameter removalListener: RemovalListener<K, V> defined in net.corda.node.utilities.NonInvalidatingUnboundCache.Companion.buildCache[ValueParameterDescriptorImpl]

'builder' @ [19:20] ==> val builder: (CacheBuilder<(K..K?), (V..V?)>..CacheBuilder<(K..K?), (V..V?)>?) defined in net.corda.node.utilities.NonInvalidatingUnboundCache.Companion.buildCache[LocalVariableDescriptor]

'build' @ [19:28] ==> public open fun <K1 : (K..K?), V1 : (V..V?)> build(p0: (CacheLoader<in (K..K?), (V..V?)>..CacheLoader<in (K..K?), (V..V?)>?)): (LoadingCache<(K..K?), (V..V?)>..LoadingCache<(K..K?), (V..V?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]
Inferred types:
    <K1 : (K..K?)> -> K
    <V1 : (V..V?)> -> V

'NonInvalidatingCacheLoader' @ [19:34] ==> public constructor NonInvalidatingCacheLoader<K, V>(loadFunction: (K) -> V) defined in net.corda.node.utilities.NonInvalidatingUnboundCache.NonInvalidatingCacheLoader[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'loadFunction' @ [19:61] ==> value-parameter loadFunction: (K) -> V defined in net.corda.node.utilities.NonInvalidatingUnboundCache.Companion.buildCache[ValueParameterDescriptorImpl]

'apply' @ [19:76] ==> @InlineOnly public inline fun <T> (LoadingCache<(K..K?), (V..V?)>..LoadingCache<(K..K?), (V..V?)>?).apply(block: (LoadingCache<(K..K?), (V..V?)>..LoadingCache<(K..K?), (V..V?)>?).() -> Unit): (LoadingCache<(K..K?), (V..V?)>..LoadingCache<(K..K?), (V..V?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.google.common.cache.LoadingCache<(K..K?), (V..V?)>..com.google.common.cache.LoadingCache<(K..K?), (V..V?)>?)

'getAll' @ [20:17] ==> public abstract fun getAll(p0: (MutableIterable<(K..K?)>..Iterable<(K..K?)>?)): (ImmutableMap<(K..K?), (V..V?)>..ImmutableMap<(K..K?), (V..V?)>?) defined in com.google.common.cache.LoadingCache[JavaMethodDescriptor]

'invoke' @ [20:24] ==> public abstract operator fun invoke(): Iterable<K> defined in kotlin.Function0[FunctionInvokeDescriptor]

'CacheLoader<K, V>' @ [26:82] ==> protected/*protected and package*/ constructor CacheLoader<K : (Any..Any?), V : (Any..Any?)>() defined in com.google.common.cache.CacheLoader[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'IllegalStateException' @ [28:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'invoke' @ [30:37] ==> public abstract operator fun invoke(p1: K): V defined in kotlin.Function1[FunctionInvokeDescriptor]

'key' @ [30:50] ==> value-parameter key: K defined in net.corda.node.utilities.NonInvalidatingUnboundCache.NonInvalidatingCacheLoader.load[ValueParameterDescriptorImpl]

'super' @ [32:20] ==> <this> defined in net.corda.node.utilities.NonInvalidatingUnboundCache.NonInvalidatingCacheLoader[LazyClassReceiverParameterDescriptor]

'loadAll' @ [32:26] ==> public open fun loadAll(p0: (MutableIterable<(K..K?)>..Iterable<(K..K?)>?)): (MutableMap<(K..K?), (V..V?)>..Map<(K..K?), (V..V?)>?) defined in com.google.common.cache.CacheLoader[JavaMethodDescriptor]

'keys' @ [32:34] ==> value-parameter keys: Iterable<K> defined in net.corda.node.utilities.NonInvalidatingUnboundCache.NonInvalidatingCacheLoader.loadAll[ValueParameterDescriptorImpl]

