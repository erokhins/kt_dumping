'AbstractMap<K, V>' @ [19:23] ==> protected/*protected and package*/ constructor AbstractMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.AbstractMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'loggerFor' @ [22:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PersistentMap<*, *, *, *>

'NonInvalidatingUnboundCache' @ [25:25] ==> public constructor NonInvalidatingUnboundCache<K, V>(concurrencyLevel: Int, loadFunction: (K) -> Optional<V>, removalListener: RemovalListener<K, Optional<V>> = ..., keysToPreload: () -> Iterable<K> = ...) defined in net.corda.node.utilities.NonInvalidatingUnboundCache[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> Optional<V>

'ofNullable' @ [27:46] ==> public open fun <T : (Any..Any?)> ofNullable(p0: V?): Optional<V> defined in java.util.Optional[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> V

'loadValue' @ [27:57] ==> private final fun loadValue(key: K): V? defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [27:67] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.cache.<anonymous>[ValueParameterDescriptorImpl]

'ExplicitRemoval' @ [28:31] ==> public constructor ExplicitRemoval<K, V, E, EK>(toPersistentEntityKey: (K) -> EK, persistentEntityClass: Class<E>) defined in net.corda.node.utilities.PersistentMap.ExplicitRemoval[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> Optional<V>
    <E> -> E
    <EK> -> EK

'toPersistentEntityKey' @ [28:47] ==> public final val toPersistentEntityKey: (K) -> EK defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'persistentEntityClass' @ [28:70] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'apply' @ [29:7] ==> @InlineOnly public inline fun <T> NonInvalidatingUnboundCache<K, Optional<V>>.apply(block: NonInvalidatingUnboundCache<K, Optional<V>>.() -> Unit): NonInvalidatingUnboundCache<K, Optional<V>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NonInvalidatingUnboundCache<K, Optional<V>>

'DatabaseTransactionManager' @ [31:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [31:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [31:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [32:29] ==> val session: Session defined in net.corda.node.utilities.PersistentMap.cache.<anonymous>[LocalVariableDescriptor]

'criteriaBuilder' @ [32:37] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'createQuery' @ [32:53] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(E..E?)>..Class<(E..E?)>?)): (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (E..E?)

'persistentEntityClass' @ [32:65] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'criteriaQuery' @ [33:9] ==> val criteriaQuery: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in net.corda.node.utilities.PersistentMap.cache.<anonymous>[LocalVariableDescriptor]

'select' @ [33:23] ==> public abstract fun select(p0: (Selection<out (E..E?)>..Selection<out (E..E?)>?)): (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaQuery' @ [33:30] ==> val criteriaQuery: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in net.corda.node.utilities.PersistentMap.cache.<anonymous>[LocalVariableDescriptor]

'from' @ [33:44] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(E..E?)>..Class<(E..E?)>?)): (Root<(E..E?)>..Root<(E..E?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (E..E?)

'persistentEntityClass' @ [33:49] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'getAll' @ [34:9] ==> public open fun getAll(p0: (MutableIterable<(K..K?)>..Iterable<(K..K?)>?)): (ImmutableMap<(K..K?), (Optional<V>..Optional<V>?)>..ImmutableMap<(K..K?), (Optional<V>..Optional<V>?)>?) defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'session' @ [34:16] ==> val session: Session defined in net.corda.node.utilities.PersistentMap.cache.<anonymous>[LocalVariableDescriptor]

'createQuery' @ [34:24] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?)): (Query<(E..E?)>..Query<(E..E?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (E..E?)

'criteriaQuery' @ [34:36] ==> val criteriaQuery: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in net.corda.node.utilities.PersistentMap.cache.<anonymous>[LocalVariableDescriptor]

'resultList' @ [34:51] ==> public final val <R : (Any..Any?)> Query<(E..E?)>.resultList: (MutableList<(E..E?)>..List<(E..E?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (E..E?)

'map' @ [34:62] ==> public inline fun <T, R> Iterable<(E..E?)>.map(transform: ((E..E?)) -> K): List<K> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (E..E?)
    <R> -> K

'invoke' @ [34:73] ==> public abstract operator fun invoke(p1: E): Pair<K, V> defined in kotlin.Function1[FunctionInvokeDescriptor]

'e' @ [34:94] ==> value-parameter e: (E..E?) defined in net.corda.node.utilities.PersistentMap.cache.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [34:102] ==> public final val first: K defined in kotlin.Pair[DeserializedPropertyDescriptor]

'asIterable' @ [34:110] ==> @InlineOnly public inline fun <T> Iterable<K>.asIterable(): Iterable<K> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K

'when (notification?.cause) {
                RemovalCause.EXPLICIT -> {
                    val session = DatabaseTransactionManager.current().session
                    val elem = session.find(persistentEntityClass, toPersistentEntityKey(notification.key))
                    if (elem != null) {
                        session.remove(elem)
                    }
                }
                RemovalCause.EXPIRED, RemovalCause.SIZE, RemovalCause.COLLECTED -> {
                    log.error("Entry was removed from cache!!!")
                }
                RemovalCause.REPLACED -> {}
            }' @ [39:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'notification' @ [39:19] ==> value-parameter notification: RemovalNotification<K, V>? defined in net.corda.node.utilities.PersistentMap.ExplicitRemoval.onRemoval[ValueParameterDescriptorImpl]

'cause' @ [39:33] ==> public final val <K : (Any..Any?), V : (Any..Any?)> RemovalNotification<K, V>.cause: (RemovalCause..RemovalCause?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'EXPLICIT' @ [40:30] ==> enum entry EXPLICIT defined in com.google.common.cache.RemovalCause[FakeCallableDescriptorForObject]

'DatabaseTransactionManager' @ [41:35] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [41:62] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [41:72] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [42:32] ==> val session: Session defined in net.corda.node.utilities.PersistentMap.ExplicitRemoval.onRemoval[LocalVariableDescriptor]

'find' @ [42:40] ==> public abstract fun <T : (Any..Any?)> find(p0: (Class<(E..E?)>..Class<(E..E?)>?), p1: (Any..Any?)): (E..E?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (E..E?)

'persistentEntityClass' @ [42:45] ==> private final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap.ExplicitRemoval[PropertyDescriptorImpl]

'invoke' @ [42:68] ==> public abstract operator fun invoke(p1: K): EK defined in kotlin.Function1[FunctionInvokeDescriptor]

'notification' @ [42:90] ==> value-parameter notification: RemovalNotification<K, V>? defined in net.corda.node.utilities.PersistentMap.ExplicitRemoval.onRemoval[ValueParameterDescriptorImpl]

'key' @ [42:103] ==> public open val key: (K..K?) defined in com.google.common.cache.RemovalNotification[JavaPropertyDescriptor]

'elem' @ [43:25] ==> val elem: (E..E?) defined in net.corda.node.utilities.PersistentMap.ExplicitRemoval.onRemoval[LocalVariableDescriptor]

'session' @ [44:25] ==> val session: Session defined in net.corda.node.utilities.PersistentMap.ExplicitRemoval.onRemoval[LocalVariableDescriptor]

'remove' @ [44:33] ==> public abstract fun remove(p0: (Any..Any?)): Unit defined in org.hibernate.Session[JavaMethodDescriptor]

'elem' @ [44:40] ==> val elem: (E..E?) defined in net.corda.node.utilities.PersistentMap.ExplicitRemoval.onRemoval[LocalVariableDescriptor]

'EXPIRED' @ [47:30] ==> enum entry EXPIRED defined in com.google.common.cache.RemovalCause[FakeCallableDescriptorForObject]

'SIZE' @ [47:52] ==> enum entry SIZE defined in com.google.common.cache.RemovalCause[FakeCallableDescriptorForObject]

'COLLECTED' @ [47:71] ==> enum entry COLLECTED defined in com.google.common.cache.RemovalCause[FakeCallableDescriptorForObject]

'log' @ [48:21] ==> public final val log: Logger defined in net.corda.node.utilities.PersistentMap.Companion[PropertyDescriptorImpl]

'error' @ [48:25] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'REPLACED' @ [50:30] ==> enum entry REPLACED defined in com.google.common.cache.RemovalCause[FakeCallableDescriptorForObject]

'cache' @ [56:16] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'get' @ [56:22] ==> public open fun get(p0: (K..K?)): (Optional<V>..Optional<V>?) defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'key' @ [56:26] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.get[ValueParameterDescriptorImpl]

'orElse' @ [56:31] ==> public open fun orElse(p0: (V..V?)): (V..V?) defined in java.util.Optional[JavaMethodDescriptor]

'cache' @ [60:16] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'asMap' @ [60:22] ==> public open fun asMap(): (ConcurrentMap<(K..K?), (Optional<V>..Optional<V>?)>..ConcurrentMap<(K..K?), (Optional<V>..Optional<V>?)>?) defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'asSequence' @ [60:30] ==> public fun <K, V> Map<out (K..K?), (Optional<V>..Optional<V>?)>.asSequence(): Sequence<Map.Entry<(K..K?), (Optional<V>..Optional<V>?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (K..K?)
    <V> -> (java.util.Optional<V>..java.util.Optional<V>?)

'map' @ [60:43] ==> public fun <T, R> Sequence<Map.Entry<(K..K?), (Optional<V>..Optional<V>?)>>.map(transform: (Map.Entry<(K..K?), (Optional<V>..Optional<V>?)>) -> Pair<(K..K?), V>): Sequence<Pair<(K..K?), V>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<(K..K?), (java.util.Optional<V>..java.util.Optional<V>?)>
    <R> -> Pair<(K..K?), V>

'Pair' @ [60:49] ==> public constructor Pair<out A, out B>(first: (K..K?), second: V) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (K..K?)
    <out B> -> V

'it' @ [60:54] ==> value-parameter it: Map.Entry<(K..K?), (Optional<V>..Optional<V>?)> defined in net.corda.node.utilities.PersistentMap.all.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [60:57] ==> public abstract val key: (K..K?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [60:62] ==> value-parameter it: Map.Entry<(K..K?), (Optional<V>..Optional<V>?)> defined in net.corda.node.utilities.PersistentMap.all.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [60:65] ==> public abstract val value: (Optional<V>..Optional<V>?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'get' @ [60:71] ==> public open fun get(): V defined in java.util.Optional[JavaMethodDescriptor]

'cache' @ [63:31] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'size' @ [63:37] ==> public open fun size(): Long defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'toInt' @ [63:44] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'cache' @ [68:31] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'get' @ [68:37] ==> public final operator fun get(p0: (K..K?), p1: (() -> (Optional<V>..Optional<V>?)..(() -> (Optional<V>..Optional<V>?))?)): (Optional<V>..Optional<V>?) defined in net.corda.node.utilities.NonInvalidatingUnboundCache[MyFunctionDescriptor]

'key' @ [68:41] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'insertionAttempt' @ [69:13] ==> var insertionAttempt: Boolean defined in net.corda.node.utilities.PersistentMap.set[LocalVariableDescriptor]

'invoke' @ [72:13] ==> public abstract operator fun invoke(p1: K, p2: V): V? defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [72:19] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'value' @ [72:24] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'of' @ [73:22] ==> public open fun <T : (Any..Any?)> of(p0: V): Optional<V> defined in java.util.Optional[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> V

'value' @ [73:25] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'!' @ [75:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'insertionAttempt' @ [75:14] ==> var insertionAttempt: Boolean defined in net.corda.node.utilities.PersistentMap.set[LocalVariableDescriptor]

'if (existingInCache.isPresent) {
                // Key already exists in cache, store the new value in the DB (depends on tore implementation) and refresh cache.
                isUnique = false
                replace(key, value)
            } else {
                // This happens when the key was queried before with no value associated. We invalidate the cached null
                // value and recursively call set again. This is to avoid race conditions where another thread queries after
                // the invalidate but before the set.
                cache.invalidate(key)
                return set(key, value, logWarning, store, replace)
            }' @ [76:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'existingInCache' @ [76:17] ==> val existingInCache: (Optional<V>..Optional<V>?) defined in net.corda.node.utilities.PersistentMap.set[LocalVariableDescriptor]

'isPresent' @ [76:33] ==> public final val <T : (Any..Any?)> Optional<V>.isPresent: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> V

'isUnique' @ [78:17] ==> var isUnique: Boolean defined in net.corda.node.utilities.PersistentMap.set[LocalVariableDescriptor]

'invoke' @ [79:17] ==> public abstract operator fun invoke(p1: K, p2: V): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [79:25] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'value' @ [79:30] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'cache' @ [84:17] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'invalidate' @ [84:23] ==> public open fun invalidate(p0: (Any..Any?)): Unit defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'key' @ [84:34] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'set' @ [85:24] ==> private final tailrec fun set(key: K, value: V, logWarning: Boolean = ..., store: (K, V) -> V?, replace: (K, V) -> Unit): Boolean defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [85:28] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'value' @ [85:33] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'logWarning' @ [85:40] ==> value-parameter logWarning: Boolean = ... defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'store' @ [85:52] ==> value-parameter store: (K, V) -> V? defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'replace' @ [85:59] ==> value-parameter replace: (K, V) -> Unit defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'logWarning' @ [88:13] ==> value-parameter logWarning: Boolean = ... defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'!' @ [88:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnique' @ [88:28] ==> var isUnique: Boolean defined in net.corda.node.utilities.PersistentMap.set[LocalVariableDescriptor]

'log' @ [89:13] ==> public final val log: Logger defined in net.corda.node.utilities.PersistentMap.Companion[PropertyDescriptorImpl]

'warn' @ [89:17] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'this' @ [89:42] ==> <this> defined in net.corda.node.utilities.PersistentMap[LazyClassReceiverParameterDescriptor]

'javaClass' @ [89:47] ==> public val <T : Any> PersistentMap<K, V, E, EK>.javaClass: Class<PersistentMap<K, V, E, EK>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> PersistentMap<K, V, E, EK>

'name' @ [89:57] ==> public final val <T : (Any..Any?)> Class<PersistentMap<K, V, E, EK>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PersistentMap<K, V, E, EK>

'persistentEntityClass' @ [89:81] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'key' @ [89:108] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'isUnique' @ [91:16] ==> var isUnique: Boolean defined in net.corda.node.utilities.PersistentMap.set[LocalVariableDescriptor]

'set' @ [99:13] ==> private final tailrec fun set(key: K, value: V, logWarning: Boolean = ..., store: (K, V) -> V?, replace: (K, V) -> Unit): Boolean defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [99:17] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'value' @ [99:22] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.set[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [102:25] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [102:52] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [102:62] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'save' @ [102:70] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'invoke' @ [102:75] ==> public abstract operator fun invoke(key: @ParameterName K, value: @ParameterName V): E defined in kotlin.Function2[FunctionInvokeDescriptor]

'k' @ [102:94] ==> value-parameter k: K defined in net.corda.node.utilities.PersistentMap.set.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [102:97] ==> value-parameter v: V defined in net.corda.node.utilities.PersistentMap.set.<anonymous>[ValueParameterDescriptorImpl]

'Unit' @ [105:47] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'set' @ [114:13] ==> private final tailrec fun set(key: K, value: V, logWarning: Boolean = ..., store: (K, V) -> V?, replace: (K, V) -> Unit): Boolean defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [114:17] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesAllowed[ValueParameterDescriptorImpl]

'value' @ [114:22] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesAllowed[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [116:45] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [116:72] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [116:82] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'find' @ [116:90] ==> public abstract fun <T : (Any..Any?)> find(p0: (Class<(E..E?)>..Class<(E..E?)>?), p1: (Any..Any?)): (E..E?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (E..E?)

'persistentEntityClass' @ [116:95] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'invoke' @ [116:118] ==> public abstract operator fun invoke(p1: K): EK defined in kotlin.Function1[FunctionInvokeDescriptor]

'k' @ [116:140] ==> value-parameter k: K defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesAllowed.<anonymous>[ValueParameterDescriptorImpl]

'if (existingEntry == null) {
                            DatabaseTransactionManager.current().session.save(toPersistentEntity(k, v))
                            null
                        } else {
                            fromPersistentEntity(existingEntry).second
                        }' @ [117:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: V?, elseBranch: V?): V?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> V?

'existingEntry' @ [117:29] ==> val existingEntry: (E..E?) defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesAllowed.<anonymous>[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [118:29] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [118:56] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [118:66] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'save' @ [118:74] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'invoke' @ [118:79] ==> public abstract operator fun invoke(key: @ParameterName K, value: @ParameterName V): E defined in kotlin.Function2[FunctionInvokeDescriptor]

'k' @ [118:98] ==> value-parameter k: K defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesAllowed.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [118:101] ==> value-parameter v: V defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesAllowed.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [121:29] ==> public abstract operator fun invoke(p1: E): Pair<K, V> defined in kotlin.Function1[FunctionInvokeDescriptor]

'existingEntry' @ [121:50] ==> val existingEntry: (E..E?) defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesAllowed.<anonymous>[LocalVariableDescriptor]

'second' @ [121:65] ==> public final val second: V defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Unit' @ [124:47] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'set' @ [132:13] ==> private final tailrec fun set(key: K, value: V, logWarning: Boolean = ..., store: (K, V) -> V?, replace: (K, V) -> Unit): Boolean defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [132:17] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesReplaced[ValueParameterDescriptorImpl]

'value' @ [132:22] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesReplaced[ValueParameterDescriptorImpl]

'merge' @ [134:45] ==> private final fun merge(key: K, value: V): V? defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'k' @ [134:51] ==> value-parameter k: K defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesReplaced.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [134:54] ==> value-parameter v: V defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesReplaced.<anonymous>[ValueParameterDescriptorImpl]

'replaceValue' @ [135:47] ==> private final fun replaceValue(key: K, value: V): Unit defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'k' @ [135:60] ==> value-parameter k: K defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesReplaced.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [135:63] ==> value-parameter v: V defined in net.corda.node.utilities.PersistentMap.addWithDuplicatesReplaced.<anonymous>[ValueParameterDescriptorImpl]

'synchronized' @ [139:9] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'this' @ [139:22] ==> <this> defined in net.corda.node.utilities.PersistentMap[LazyClassReceiverParameterDescriptor]

'merge' @ [140:13] ==> private final fun merge(key: K, value: V): V? defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [140:19] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.replaceValue[ValueParameterDescriptorImpl]

'value' @ [140:24] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.replaceValue[ValueParameterDescriptorImpl]

'cache' @ [141:13] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'put' @ [141:19] ==> public open fun put(p0: (K..K?), p1: (Optional<V>..Optional<V>?)): Unit defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'key' @ [141:23] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.replaceValue[ValueParameterDescriptorImpl]

'of' @ [141:37] ==> public open fun <T : (Any..Any?)> of(p0: V): Optional<V> defined in java.util.Optional[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> V

'value' @ [141:40] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.replaceValue[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [146:29] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [146:56] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [146:66] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'find' @ [146:74] ==> public abstract fun <T : (Any..Any?)> find(p0: (Class<(E..E?)>..Class<(E..E?)>?), p1: (Any..Any?)): (E..E?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (E..E?)

'persistentEntityClass' @ [146:79] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'invoke' @ [146:102] ==> public abstract operator fun invoke(p1: K): EK defined in kotlin.Function1[FunctionInvokeDescriptor]

'key' @ [146:124] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.merge[ValueParameterDescriptorImpl]

'if (existingEntry != null) {
            DatabaseTransactionManager.current().session.merge(toPersistentEntity(key,value))
            fromPersistentEntity(existingEntry).second
        } else {
            DatabaseTransactionManager.current().session.save(toPersistentEntity(key,value))
            null
        }' @ [147:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: V?, elseBranch: V?): V?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> V?

'existingEntry' @ [147:20] ==> val existingEntry: (E..E?) defined in net.corda.node.utilities.PersistentMap.merge[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [148:13] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [148:40] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [148:50] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'merge' @ [148:58] ==> public abstract fun merge(p0: (Any..Any?)): (Any..Any?) defined in org.hibernate.Session[JavaMethodDescriptor]

'invoke' @ [148:64] ==> public abstract operator fun invoke(key: @ParameterName K, value: @ParameterName V): E defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [148:83] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.merge[ValueParameterDescriptorImpl]

'value' @ [148:87] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.merge[ValueParameterDescriptorImpl]

'invoke' @ [149:13] ==> public abstract operator fun invoke(p1: E): Pair<K, V> defined in kotlin.Function1[FunctionInvokeDescriptor]

'existingEntry' @ [149:34] ==> val existingEntry: (E..E?) defined in net.corda.node.utilities.PersistentMap.merge[LocalVariableDescriptor]

'second' @ [149:49] ==> public final val second: V defined in kotlin.Pair[DeserializedPropertyDescriptor]

'DatabaseTransactionManager' @ [151:13] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [151:40] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [151:50] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'save' @ [151:58] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'invoke' @ [151:63] ==> public abstract operator fun invoke(key: @ParameterName K, value: @ParameterName V): E defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [151:82] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.merge[ValueParameterDescriptorImpl]

'value' @ [151:86] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.merge[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [157:22] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [157:49] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [157:59] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'find' @ [157:67] ==> public abstract fun <T : (Any..Any?)> find(p0: (Class<(E..E?)>..Class<(E..E?)>?), p1: (Any..Any?)): (E..E?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (E..E?)

'persistentEntityClass' @ [157:72] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'invoke' @ [157:95] ==> public abstract operator fun invoke(p1: K): EK defined in kotlin.Function1[FunctionInvokeDescriptor]

'key' @ [157:117] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.loadValue[ValueParameterDescriptorImpl]

'result' @ [158:16] ==> val result: (E..E?) defined in net.corda.node.utilities.PersistentMap.loadValue[LocalVariableDescriptor]

'let' @ [158:24] ==> @InlineOnly public inline fun <T, R> E.let(block: (E) -> Pair<K, V>): Pair<K, V> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> E
    <R> -> Pair<K, V>

'fromPersistentEntity' @ [158:28] ==> public final val fromPersistentEntity: (E) -> Pair<K, V> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'second' @ [158:51] ==> public final val second: V defined in kotlin.Pair[DeserializedPropertyDescriptor]

'cache' @ [165:22] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'get' @ [165:28] ==> public open fun get(p0: (K..K?)): (Optional<V>..Optional<V>?) defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'key' @ [165:32] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.remove[ValueParameterDescriptorImpl]

'orElse' @ [165:37] ==> public open fun orElse(p0: (V..V?)): (V..V?) defined in java.util.Optional[JavaMethodDescriptor]

'cache' @ [166:9] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'invalidate' @ [166:15] ==> public open fun invalidate(p0: (Any..Any?)): Unit defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'key' @ [166:26] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.remove[ValueParameterDescriptorImpl]

'result' @ [167:16] ==> val result: (V..V?) defined in net.corda.node.utilities.PersistentMap.remove[LocalVariableDescriptor]

'AbstractMap.SimpleImmutableEntry<K, V>' @ [170:67] ==> public constructor SimpleImmutableEntry<K : (Any..Any?), V : (Any..Any?)>(p0: (K..K?), p1: (V..V?)) defined in java.util.AbstractMap.SimpleImmutableEntry[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'key' @ [170:106] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.NotReallyMutableEntry.<init>[ValueParameterDescriptorImpl]

'value' @ [170:111] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.NotReallyMutableEntry.<init>[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [172:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'all' @ [177:32] ==> public final fun all(): Sequence<Pair<K, V>> defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'map' @ [177:38] ==> public fun <T, R> Sequence<Pair<K, V>>.map(transform: (Pair<K, V>) -> PersistentMap.NotReallyMutableEntry<K, V>): Sequence<PersistentMap.NotReallyMutableEntry<K, V>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<K, V>
    <R> -> NotReallyMutableEntry<K, V>

'NotReallyMutableEntry' @ [177:44] ==> public constructor NotReallyMutableEntry<K, V>(key: K, value: V) defined in net.corda.node.utilities.PersistentMap.NotReallyMutableEntry[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> V

'it' @ [177:66] ==> value-parameter it: Pair<K, V> defined in net.corda.node.utilities.PersistentMap.EntryIterator.iterator.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [177:69] ==> public final val first: K defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [177:76] ==> value-parameter it: Pair<K, V> defined in net.corda.node.utilities.PersistentMap.EntryIterator.iterator.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [177:79] ==> public final val second: V defined in kotlin.Pair[DeserializedPropertyDescriptor]

'iterator' @ [177:89] ==> public abstract operator fun iterator(): Iterator<PersistentMap.NotReallyMutableEntry<K, V>> defined in kotlin.sequences.Sequence[DeserializedSimpleFunctionDescriptor]

'iterator' @ [181:43] ==> private final val iterator: Iterator<PersistentMap.NotReallyMutableEntry<K, V>> defined in net.corda.node.utilities.PersistentMap.EntryIterator[PropertyDescriptorImpl]

'hasNext' @ [181:52] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'iterator' @ [184:33] ==> private final val iterator: Iterator<PersistentMap.NotReallyMutableEntry<K, V>> defined in net.corda.node.utilities.PersistentMap.EntryIterator[PropertyDescriptorImpl]

'next' @ [184:42] ==> public abstract operator fun next(): PersistentMap.NotReallyMutableEntry<K, V> defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'current' @ [185:13] ==> private final var current: MutableMap.MutableEntry<K, V>? defined in net.corda.node.utilities.PersistentMap.EntryIterator[PropertyDescriptorImpl]

'extractedNext' @ [185:23] ==> val extractedNext: PersistentMap.NotReallyMutableEntry<K, V> defined in net.corda.node.utilities.PersistentMap.EntryIterator.next[LocalVariableDescriptor]

'extractedNext' @ [186:20] ==> val extractedNext: PersistentMap.NotReallyMutableEntry<K, V> defined in net.corda.node.utilities.PersistentMap.EntryIterator.next[LocalVariableDescriptor]

'current' @ [190:32] ==> private final var current: MutableMap.MutableEntry<K, V>? defined in net.corda.node.utilities.PersistentMap.EntryIterator[PropertyDescriptorImpl]

'IllegalStateException' @ [190:49] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'current' @ [191:13] ==> private final var current: MutableMap.MutableEntry<K, V>? defined in net.corda.node.utilities.PersistentMap.EntryIterator[PropertyDescriptorImpl]

'remove' @ [192:13] ==> public open fun remove(key: K): V? defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'savedCurrent' @ [192:20] ==> val savedCurrent: MutableMap.MutableEntry<K, V> defined in net.corda.node.utilities.PersistentMap.EntryIterator.remove[LocalVariableDescriptor]

'key' @ [192:33] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'AbstractSet<K>' @ [197:25] ==> protected/*protected and package*/ constructor AbstractSet<E : (Any..Any?)>() defined in java.util.AbstractSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> K

'this@PersistentMap' @ [198:44] ==> <this> defined in net.corda.node.utilities.PersistentMap[LazyClassReceiverParameterDescriptor]

'size' @ [198:63] ==> public open val size: Int defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'EntryIterator' @ [201:49] ==> public constructor EntryIterator() defined in net.corda.node.utilities.PersistentMap.EntryIterator[ClassConstructorDescriptorImpl]

'entryIterator' @ [203:55] ==> private final val entryIterator: PersistentMap<K, V, E, EK>.EntryIterator defined in net.corda.node.utilities.PersistentMap.<get-keys>.<no name provided>.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [203:69] ==> public open fun hasNext(): Boolean defined in net.corda.node.utilities.PersistentMap.EntryIterator[SimpleFunctionDescriptorImpl]

'entryIterator' @ [204:46] ==> private final val entryIterator: PersistentMap<K, V, E, EK>.EntryIterator defined in net.corda.node.utilities.PersistentMap.<get-keys>.<no name provided>.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [204:60] ==> public open fun next(): MutableMap.MutableEntry<K, V> defined in net.corda.node.utilities.PersistentMap.EntryIterator[SimpleFunctionDescriptorImpl]

'key' @ [204:67] ==> public abstract val key: K defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'entryIterator' @ [206:25] ==> private final val entryIterator: PersistentMap<K, V, E, EK>.EntryIterator defined in net.corda.node.utilities.PersistentMap.<get-keys>.<no name provided>.iterator.<no name provided>[PropertyDescriptorImpl]

'remove' @ [206:39] ==> public open fun remove(): Unit defined in net.corda.node.utilities.PersistentMap.EntryIterator[SimpleFunctionDescriptorImpl]

'AbstractCollection<V>' @ [214:25] ==> protected/*protected and package*/ constructor AbstractCollection<E : (Any..Any?)>() defined in java.util.AbstractCollection[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> V

'this@PersistentMap' @ [215:44] ==> <this> defined in net.corda.node.utilities.PersistentMap[LazyClassReceiverParameterDescriptor]

'size' @ [215:63] ==> public open val size: Int defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'EntryIterator' @ [218:49] ==> public constructor EntryIterator() defined in net.corda.node.utilities.PersistentMap.EntryIterator[ClassConstructorDescriptorImpl]

'entryIterator' @ [220:55] ==> private final val entryIterator: PersistentMap<K, V, E, EK>.EntryIterator defined in net.corda.node.utilities.PersistentMap.<get-values>.<no name provided>.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [220:69] ==> public open fun hasNext(): Boolean defined in net.corda.node.utilities.PersistentMap.EntryIterator[SimpleFunctionDescriptorImpl]

'entryIterator' @ [221:46] ==> private final val entryIterator: PersistentMap<K, V, E, EK>.EntryIterator defined in net.corda.node.utilities.PersistentMap.<get-values>.<no name provided>.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [221:60] ==> public open fun next(): MutableMap.MutableEntry<K, V> defined in net.corda.node.utilities.PersistentMap.EntryIterator[SimpleFunctionDescriptorImpl]

'value' @ [221:67] ==> public abstract val value: V defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'entryIterator' @ [223:25] ==> private final val entryIterator: PersistentMap<K, V, E, EK>.EntryIterator defined in net.corda.node.utilities.PersistentMap.<get-values>.<no name provided>.iterator.<no name provided>[PropertyDescriptorImpl]

'remove' @ [223:39] ==> public open fun remove(): Unit defined in net.corda.node.utilities.PersistentMap.EntryIterator[SimpleFunctionDescriptorImpl]

'AbstractSet<MutableMap.MutableEntry<K, V>>' @ [231:25] ==> protected/*protected and package*/ constructor AbstractSet<E : (Any..Any?)>() defined in java.util.AbstractSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MutableEntry<K, V>

'this@PersistentMap' @ [232:44] ==> <this> defined in net.corda.node.utilities.PersistentMap[LazyClassReceiverParameterDescriptor]

'size' @ [232:63] ==> public open val size: Int defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'EntryIterator' @ [235:49] ==> public constructor EntryIterator() defined in net.corda.node.utilities.PersistentMap.EntryIterator[ClassConstructorDescriptorImpl]

'entryIterator' @ [237:55] ==> private final val entryIterator: PersistentMap<K, V, E, EK>.EntryIterator defined in net.corda.node.utilities.PersistentMap.<get-entries>.<no name provided>.iterator.<no name provided>[PropertyDescriptorImpl]

'hasNext' @ [237:69] ==> public open fun hasNext(): Boolean defined in net.corda.node.utilities.PersistentMap.EntryIterator[SimpleFunctionDescriptorImpl]

'entryIterator' @ [238:74] ==> private final val entryIterator: PersistentMap<K, V, E, EK>.EntryIterator defined in net.corda.node.utilities.PersistentMap.<get-entries>.<no name provided>.iterator.<no name provided>[PropertyDescriptorImpl]

'next' @ [238:88] ==> public open fun next(): MutableMap.MutableEntry<K, V> defined in net.corda.node.utilities.PersistentMap.EntryIterator[SimpleFunctionDescriptorImpl]

'entryIterator' @ [240:25] ==> private final val entryIterator: PersistentMap<K, V, E, EK>.EntryIterator defined in net.corda.node.utilities.PersistentMap.<get-entries>.<no name provided>.iterator.<no name provided>[PropertyDescriptorImpl]

'remove' @ [240:39] ==> public open fun remove(): Unit defined in net.corda.node.utilities.PersistentMap.EntryIterator[SimpleFunctionDescriptorImpl]

'cache' @ [248:19] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'get' @ [248:25] ==> public open fun get(p0: (K..K?)): (Optional<V>..Optional<V>?) defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'key' @ [248:29] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.put[ValueParameterDescriptorImpl]

'addWithDuplicatesReplaced' @ [249:9] ==> private final fun addWithDuplicatesReplaced(key: K, value: V): Boolean defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [249:35] ==> value-parameter key: K defined in net.corda.node.utilities.PersistentMap.put[ValueParameterDescriptorImpl]

'value' @ [249:40] ==> value-parameter value: V defined in net.corda.node.utilities.PersistentMap.put[ValueParameterDescriptorImpl]

'old' @ [250:16] ==> val old: (Optional<V>..Optional<V>?) defined in net.corda.node.utilities.PersistentMap.put[LocalVariableDescriptor]

'orElse' @ [250:20] ==> public open fun orElse(p0: (V..V?)): (V..V?) defined in java.util.Optional[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [254:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [254:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [254:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [255:29] ==> val session: Session defined in net.corda.node.utilities.PersistentMap.load[LocalVariableDescriptor]

'criteriaBuilder' @ [255:37] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'createQuery' @ [255:53] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(E..E?)>..Class<(E..E?)>?)): (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (E..E?)

'persistentEntityClass' @ [255:65] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'criteriaQuery' @ [256:9] ==> val criteriaQuery: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in net.corda.node.utilities.PersistentMap.load[LocalVariableDescriptor]

'select' @ [256:23] ==> public abstract fun select(p0: (Selection<out (E..E?)>..Selection<out (E..E?)>?)): (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'criteriaQuery' @ [256:30] ==> val criteriaQuery: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in net.corda.node.utilities.PersistentMap.load[LocalVariableDescriptor]

'from' @ [256:44] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(E..E?)>..Class<(E..E?)>?)): (Root<(E..E?)>..Root<(E..E?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (E..E?)

'persistentEntityClass' @ [256:49] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'cache' @ [257:9] ==> private final val cache: NonInvalidatingUnboundCache<K, Optional<V>> defined in net.corda.node.utilities.PersistentMap[PropertyDescriptorImpl]

'getAll' @ [257:15] ==> public open fun getAll(p0: (MutableIterable<(K..K?)>..Iterable<(K..K?)>?)): (ImmutableMap<(K..K?), (Optional<V>..Optional<V>?)>..ImmutableMap<(K..K?), (Optional<V>..Optional<V>?)>?) defined in net.corda.node.utilities.NonInvalidatingUnboundCache[JavaMethodDescriptor]

'session' @ [257:22] ==> val session: Session defined in net.corda.node.utilities.PersistentMap.load[LocalVariableDescriptor]

'createQuery' @ [257:30] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?)): (Query<(E..E?)>..Query<(E..E?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (E..E?)

'criteriaQuery' @ [257:42] ==> val criteriaQuery: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in net.corda.node.utilities.PersistentMap.load[LocalVariableDescriptor]

'resultList' @ [257:57] ==> public final val <R : (Any..Any?)> Query<(E..E?)>.resultList: (MutableList<(E..E?)>..List<(E..E?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (E..E?)

'map' @ [257:68] ==> public inline fun <T, R> Iterable<(E..E?)>.map(transform: ((E..E?)) -> K): List<K> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (E..E?)
    <R> -> K

'invoke' @ [257:79] ==> public abstract operator fun invoke(p1: E): Pair<K, V> defined in kotlin.Function1[FunctionInvokeDescriptor]

'e' @ [257:100] ==> value-parameter e: (E..E?) defined in net.corda.node.utilities.PersistentMap.load.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [257:108] ==> public final val first: K defined in kotlin.Pair[DeserializedPropertyDescriptor]

'asIterable' @ [257:116] ==> @InlineOnly public inline fun <T> Iterable<K>.asIterable(): Iterable<K> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K

