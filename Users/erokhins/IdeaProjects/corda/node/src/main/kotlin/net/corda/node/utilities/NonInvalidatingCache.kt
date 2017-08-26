'cache' @ [11:26] ==> value-parameter cache: LoadingCache<K, V> defined in net.corda.node.utilities.NonInvalidatingCache.<init>[ValueParameterDescriptorImpl]

'this' @ [14:13] ==> private constructor NonInvalidatingCache<K, V>(cache: LoadingCache<K, V>) defined in net.corda.node.utilities.NonInvalidatingCache[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'buildCache' @ [14:18] ==> private final fun <K, V> buildCache(bound: Long, concurrencyLevel: Int, loadFunction: (K) -> V): LoadingCache<K, V> defined in net.corda.node.utilities.NonInvalidatingCache.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'bound' @ [14:29] ==> value-parameter bound: Long defined in net.corda.node.utilities.NonInvalidatingCache.<init>[ValueParameterDescriptorImpl]

'concurrencyLevel' @ [14:36] ==> value-parameter concurrencyLevel: Int defined in net.corda.node.utilities.NonInvalidatingCache.<init>[ValueParameterDescriptorImpl]

'loadFunction' @ [14:54] ==> value-parameter loadFunction: (K) -> V defined in net.corda.node.utilities.NonInvalidatingCache.<init>[ValueParameterDescriptorImpl]

'newBuilder' @ [18:40] ==> public open fun newBuilder(): (CacheBuilder<(Any..Any?), (Any..Any?)>..CacheBuilder<(Any..Any?), (Any..Any?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]

'maximumSize' @ [18:53] ==> public open fun maximumSize(p0: Long): (CacheBuilder<(Any..Any?), (Any..Any?)>..CacheBuilder<(Any..Any?), (Any..Any?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]

'bound' @ [18:65] ==> value-parameter bound: Long defined in net.corda.node.utilities.NonInvalidatingCache.Companion.buildCache[ValueParameterDescriptorImpl]

'concurrencyLevel' @ [18:72] ==> public open fun concurrencyLevel(p0: Int): (CacheBuilder<(Any..Any?), (Any..Any?)>..CacheBuilder<(Any..Any?), (Any..Any?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]

'concurrencyLevel' @ [18:89] ==> value-parameter concurrencyLevel: Int defined in net.corda.node.utilities.NonInvalidatingCache.Companion.buildCache[ValueParameterDescriptorImpl]

'builder' @ [19:20] ==> val builder: (CacheBuilder<(Any..Any?), (Any..Any?)>..CacheBuilder<(Any..Any?), (Any..Any?)>?) defined in net.corda.node.utilities.NonInvalidatingCache.Companion.buildCache[LocalVariableDescriptor]

'build' @ [19:28] ==> public open fun <K1 : (Any..Any?), V1 : (Any..Any?)> build(p0: (CacheLoader<in (K..K?), (V..V?)>..CacheLoader<in (K..K?), (V..V?)>?)): (LoadingCache<(K..K?), (V..V?)>..LoadingCache<(K..K?), (V..V?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]
Inferred types:
    <K1 : (Any..Any?)> -> K
    <V1 : (Any..Any?)> -> V

'NonInvalidatingCacheLoader' @ [19:34] ==> public constructor NonInvalidatingCacheLoader<K, V>(loadFunction: (K) -> V) defined in net.corda.node.utilities.NonInvalidatingCache.NonInvalidatingCacheLoader[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'loadFunction' @ [19:61] ==> value-parameter loadFunction: (K) -> V defined in net.corda.node.utilities.NonInvalidatingCache.Companion.buildCache[ValueParameterDescriptorImpl]

'CacheLoader<K, V>' @ [24:82] ==> protected/*protected and package*/ constructor CacheLoader<K : (Any..Any?), V : (Any..Any?)>() defined in com.google.common.cache.CacheLoader[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'IllegalStateException' @ [26:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'invoke' @ [28:37] ==> public abstract operator fun invoke(p1: K): V defined in kotlin.Function1[FunctionInvokeDescriptor]

'key' @ [28:50] ==> value-parameter key: K defined in net.corda.node.utilities.NonInvalidatingCache.NonInvalidatingCacheLoader.load[ValueParameterDescriptorImpl]

'super' @ [30:20] ==> <this> defined in net.corda.node.utilities.NonInvalidatingCache.NonInvalidatingCacheLoader[LazyClassReceiverParameterDescriptor]

'loadAll' @ [30:26] ==> public open fun loadAll(p0: (MutableIterable<(K..K?)>..Iterable<(K..K?)>?)): (MutableMap<(K..K?), (V..V?)>..Map<(K..K?), (V..V?)>?) defined in com.google.common.cache.CacheLoader[JavaMethodDescriptor]

'keys' @ [30:34] ==> value-parameter keys: Iterable<K> defined in net.corda.node.utilities.NonInvalidatingCache.NonInvalidatingCacheLoader.loadAll[ValueParameterDescriptorImpl]

