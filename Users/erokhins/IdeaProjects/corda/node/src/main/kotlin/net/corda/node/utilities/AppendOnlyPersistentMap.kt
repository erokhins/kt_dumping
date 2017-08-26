'loggerFor' @ [21:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> AppendOnlyPersistentMap<*, *, *, *>

'NonInvalidatingCache' @ [24:25] ==> public constructor NonInvalidatingCache<K, V>(bound: Long, concurrencyLevel: Int, loadFunction: (K) -> Optional<V>) defined in net.corda.node.utilities.NonInvalidatingCache[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> K
    <V> -> Optional<V>

'cacheBound' @ [25:21] ==> value-parameter cacheBound: Long = ... defined in net.corda.node.utilities.AppendOnlyPersistentMap.<init>[ValueParameterDescriptorImpl]

'ofNullable' @ [27:46] ==> public open fun <T : (Any..Any?)> ofNullable(p0: V?): Optional<V> defined in java.util.Optional[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> V

'loadValue' @ [27:57] ==> private final fun loadValue(key: K): V? defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [27:67] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.cache.<anonymous>[ValueParameterDescriptorImpl]

'cache' @ [34:16] ==> private final val cache: NonInvalidatingCache<K, Optional<V>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'get' @ [34:22] ==> public open fun get(p0: (K..K?)): (Optional<V>..Optional<V>?) defined in net.corda.node.utilities.NonInvalidatingCache[JavaMethodDescriptor]

'key' @ [34:26] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.get[ValueParameterDescriptorImpl]

'orElse' @ [34:31] ==> public open fun orElse(p0: (V..V?)): (V..V?) defined in java.util.Optional[JavaMethodDescriptor]

'allPersisted' @ [37:22] ==> public final fun allPersisted(): Sequence<Pair<K, V>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'toList' @ [37:37] ==> public fun <T> Sequence<Pair<K, V>>.toList(): List<Pair<K, V>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<K, V>

'size' @ [37:46] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'DatabaseTransactionManager' @ [43:29] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [43:56] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [43:66] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'criteriaBuilder' @ [43:74] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'createQuery' @ [43:90] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(E..E?)>..Class<(E..E?)>?)): (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> E

'persistentEntityClass' @ [43:102] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'criteriaQuery' @ [44:20] ==> val criteriaQuery: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.allPersisted[LocalVariableDescriptor]

'from' @ [44:34] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(E..E?)>..Class<(E..E?)>?)): (Root<(E..E?)>..Root<(E..E?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> E

'persistentEntityClass' @ [44:39] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'criteriaQuery' @ [45:9] ==> val criteriaQuery: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.allPersisted[LocalVariableDescriptor]

'select' @ [45:23] ==> public abstract fun select(p0: (Selection<out (E..E?)>..Selection<out (E..E?)>?)): (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'root' @ [45:30] ==> val root: (Root<(E..E?)>..Root<(E..E?)>?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.allPersisted[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [46:21] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [46:48] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [46:58] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'createQuery' @ [46:66] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?)): (Query<(E..E?)>..Query<(E..E?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> E

'criteriaQuery' @ [46:78] ==> val criteriaQuery: (CriteriaQuery<(E..E?)>..CriteriaQuery<(E..E?)>?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.allPersisted[LocalVariableDescriptor]

'query' @ [47:22] ==> val query: (Query<(E..E?)>..Query<(E..E?)>?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.allPersisted[LocalVariableDescriptor]

'resultList' @ [47:28] ==> public final val <R : (Any..Any?)> Query<(E..E?)>.resultList: (MutableList<(E..E?)>..List<(E..E?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (E..E?)

'result' @ [48:16] ==> val result: (MutableList<(E..E?)>..List<(E..E?)>?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.allPersisted[LocalVariableDescriptor]

'map' @ [48:23] ==> public inline fun <T, R> Iterable<(E..E?)>.map(transform: ((E..E?)) -> Pair<K, V>): List<Pair<K, V>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (E..E?)
    <R> -> Pair<K, V>

'invoke' @ [48:34] ==> public abstract operator fun invoke(p1: E): Pair<K, V> defined in kotlin.Function1[FunctionInvokeDescriptor]

'x' @ [48:55] ==> value-parameter x: (E..E?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.allPersisted.<anonymous>[ValueParameterDescriptorImpl]

'asSequence' @ [48:60] ==> public fun <T> Iterable<Pair<K, V>>.asSequence(): Sequence<Pair<K, V>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<K, V>

'cache' @ [54:31] ==> private final val cache: NonInvalidatingCache<K, Optional<V>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'get' @ [54:37] ==> public final operator fun get(p0: (K..K?), p1: (() -> (Optional<V>..Optional<V>?)..(() -> (Optional<V>..Optional<V>?))?)): (Optional<V>..Optional<V>?) defined in net.corda.node.utilities.NonInvalidatingCache[MyFunctionDescriptor]

'key' @ [54:41] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'insertionAttempt' @ [55:13] ==> var insertionAttempt: Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[LocalVariableDescriptor]

'invoke' @ [58:32] ==> public abstract operator fun invoke(p1: K, p2: V): V? defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [58:38] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'value' @ [58:43] ==> value-parameter value: V defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'if (existingInDb != null) { // Always reuse an existing value from the storage of a duplicated key.
                Optional.of(existingInDb)
            } else {
                Optional.of(value)
            }' @ [59:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Optional<V>..Optional<V>?), elseBranch: (Optional<V>..Optional<V>?)): (Optional<V>..Optional<V>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.util.Optional<V>..java.util.Optional<V>?)

'existingInDb' @ [59:17] ==> val existingInDb: V? defined in net.corda.node.utilities.AppendOnlyPersistentMap.set.<anonymous>[LocalVariableDescriptor]

'of' @ [60:26] ==> public open fun <T : (Any..Any?)> of(p0: V): Optional<V> defined in java.util.Optional[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> V

'existingInDb' @ [60:29] ==> val existingInDb: V? defined in net.corda.node.utilities.AppendOnlyPersistentMap.set.<anonymous>[LocalVariableDescriptor]

'of' @ [62:26] ==> public open fun <T : (Any..Any?)> of(p0: V): Optional<V> defined in java.util.Optional[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> V

'value' @ [62:29] ==> value-parameter value: V defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'!' @ [65:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'insertionAttempt' @ [65:14] ==> var insertionAttempt: Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[LocalVariableDescriptor]

'if (existingInCache.isPresent) {
                // Key already exists in cache, do nothing.
                isUnique = false
            } else {
                // This happens when the key was queried before with no value associated. We invalidate the cached null
                // value and recursively call set again. This is to avoid race conditions where another thread queries after
                // the invalidate but before the set.
                cache.invalidate(key)
                return set(key, value, logWarning, store)
            }' @ [66:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'existingInCache' @ [66:17] ==> val existingInCache: (Optional<V>..Optional<V>?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[LocalVariableDescriptor]

'isPresent' @ [66:33] ==> public final val <T : (Any..Any?)> Optional<V>.isPresent: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> V

'isUnique' @ [68:17] ==> var isUnique: Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[LocalVariableDescriptor]

'cache' @ [73:17] ==> private final val cache: NonInvalidatingCache<K, Optional<V>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'invalidate' @ [73:23] ==> public open fun invalidate(p0: (Any..Any?)): Unit defined in net.corda.node.utilities.NonInvalidatingCache[JavaMethodDescriptor]

'key' @ [73:34] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'set' @ [74:24] ==> private final tailrec fun set(key: K, value: V, logWarning: Boolean = ..., store: (K, V) -> V?): Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [74:28] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'value' @ [74:33] ==> value-parameter value: V defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'logWarning' @ [74:40] ==> value-parameter logWarning: Boolean = ... defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'store' @ [74:52] ==> value-parameter store: (K, V) -> V? defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'logWarning' @ [77:13] ==> value-parameter logWarning: Boolean = ... defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'!' @ [77:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnique' @ [77:28] ==> var isUnique: Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[LocalVariableDescriptor]

'log' @ [78:13] ==> public final val log: Logger defined in net.corda.node.utilities.AppendOnlyPersistentMap.Companion[PropertyDescriptorImpl]

'warn' @ [78:17] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'this' @ [78:42] ==> <this> defined in net.corda.node.utilities.AppendOnlyPersistentMap[LazyClassReceiverParameterDescriptor]

'javaClass' @ [78:47] ==> public val <T : Any> AppendOnlyPersistentMap<K, V, E, EK>.javaClass: Class<AppendOnlyPersistentMap<K, V, E, EK>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> AppendOnlyPersistentMap<K, V, E, EK>

'name' @ [78:57] ==> public final val <T : (Any..Any?)> Class<AppendOnlyPersistentMap<K, V, E, EK>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AppendOnlyPersistentMap<K, V, E, EK>

'persistentEntityClass' @ [78:81] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'key' @ [78:108] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'isUnique' @ [80:16] ==> var isUnique: Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[LocalVariableDescriptor]

'set' @ [88:13] ==> private final tailrec fun set(key: K, value: V, logWarning: Boolean = ..., store: (K, V) -> V?): Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [88:17] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'value' @ [88:22] ==> value-parameter value: V defined in net.corda.node.utilities.AppendOnlyPersistentMap.set[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [89:25] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [89:52] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [89:62] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'save' @ [89:70] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'invoke' @ [89:75] ==> public abstract operator fun invoke(key: @ParameterName K, value: @ParameterName V): E defined in kotlin.Function2[FunctionInvokeDescriptor]

'k' @ [89:94] ==> value-parameter k: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.set.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [89:97] ==> value-parameter v: V defined in net.corda.node.utilities.AppendOnlyPersistentMap.set.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [99:13] ==> private final tailrec fun set(key: K, value: V, logWarning: Boolean = ..., store: (K, V) -> V?): Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [99:17] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.addWithDuplicatesAllowed[ValueParameterDescriptorImpl]

'value' @ [99:22] ==> value-parameter value: V defined in net.corda.node.utilities.AppendOnlyPersistentMap.addWithDuplicatesAllowed[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [101:37] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [101:64] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [101:74] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'find' @ [101:82] ==> public abstract fun <T : (Any..Any?)> find(p0: (Class<(E..E?)>..Class<(E..E?)>?), p1: (Any..Any?)): (E..E?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> E

'persistentEntityClass' @ [101:87] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'invoke' @ [101:110] ==> public abstract operator fun invoke(p1: K): EK defined in kotlin.Function1[FunctionInvokeDescriptor]

'k' @ [101:132] ==> value-parameter k: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.addWithDuplicatesAllowed.<anonymous>[ValueParameterDescriptorImpl]

'if (existingEntry == null) {
                    DatabaseTransactionManager.current().session.save(toPersistentEntity(k, v))
                    null
                } else {
                    fromPersistentEntity(existingEntry).second
                }' @ [102:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: V?, elseBranch: V?): V?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> V?

'existingEntry' @ [102:21] ==> val existingEntry: (E..E?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.addWithDuplicatesAllowed.<anonymous>[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [103:21] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [103:48] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [103:58] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'save' @ [103:66] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'invoke' @ [103:71] ==> public abstract operator fun invoke(key: @ParameterName K, value: @ParameterName V): E defined in kotlin.Function2[FunctionInvokeDescriptor]

'k' @ [103:90] ==> value-parameter k: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.addWithDuplicatesAllowed.<anonymous>[ValueParameterDescriptorImpl]

'v' @ [103:93] ==> value-parameter v: V defined in net.corda.node.utilities.AppendOnlyPersistentMap.addWithDuplicatesAllowed.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [106:21] ==> public abstract operator fun invoke(p1: E): Pair<K, V> defined in kotlin.Function1[FunctionInvokeDescriptor]

'existingEntry' @ [106:42] ==> val existingEntry: (E..E?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.addWithDuplicatesAllowed.<anonymous>[LocalVariableDescriptor]

'second' @ [106:57] ==> public final val second: V defined in kotlin.Pair[DeserializedPropertyDescriptor]

'entries' @ [111:9] ==> value-parameter entries: Map<K, V> defined in net.corda.node.utilities.AppendOnlyPersistentMap.putAll[ValueParameterDescriptorImpl]

'forEach' @ [111:17] ==> @HidesMembers public inline fun <K, V> Map<out K, V>.forEach(action: (Map.Entry<K, V>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> V

'set' @ [112:13] ==> public final operator fun set(key: K, value: V): Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'it' @ [112:17] ==> value-parameter it: Map.Entry<K, V> defined in net.corda.node.utilities.AppendOnlyPersistentMap.putAll.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [112:20] ==> public abstract val key: K defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [112:25] ==> value-parameter it: Map.Entry<K, V> defined in net.corda.node.utilities.AppendOnlyPersistentMap.putAll.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [112:28] ==> public abstract val value: V defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'DatabaseTransactionManager' @ [117:22] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [117:49] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [117:59] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'find' @ [117:67] ==> public abstract fun <T : (Any..Any?)> find(p0: (Class<(E..E?)>..Class<(E..E?)>?), p1: (Any..Any?)): (E..E?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> E

'persistentEntityClass' @ [117:72] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'invoke' @ [117:95] ==> public abstract operator fun invoke(p1: K): EK defined in kotlin.Function1[FunctionInvokeDescriptor]

'key' @ [117:117] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.loadValue[ValueParameterDescriptorImpl]

'result' @ [118:16] ==> val result: (E..E?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.loadValue[LocalVariableDescriptor]

'let' @ [118:24] ==> @InlineOnly public inline fun <T, R> E.let(block: (E) -> Pair<K, V>): Pair<K, V> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> E
    <R> -> Pair<K, V>

'fromPersistentEntity' @ [118:28] ==> public final val fromPersistentEntity: (E) -> Pair<K, V> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'second' @ [118:51] ==> public final val second: V defined in kotlin.Pair[DeserializedPropertyDescriptor]

'get' @ [121:37] ==> public final operator fun get(key: K): V? defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'key' @ [121:41] ==> value-parameter key: K defined in net.corda.node.utilities.AppendOnlyPersistentMap.contains[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [128:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [128:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [128:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [129:27] ==> val session: Session defined in net.corda.node.utilities.AppendOnlyPersistentMap.clear[LocalVariableDescriptor]

'criteriaBuilder' @ [129:35] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'createCriteriaDelete' @ [129:51] ==> public abstract fun <T : (Any..Any?)> createCriteriaDelete(p0: (Class<(E..E?)>..Class<(E..E?)>?)): (CriteriaDelete<(E..E?)>..CriteriaDelete<(E..E?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> E

'persistentEntityClass' @ [129:72] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'deleteQuery' @ [130:9] ==> val deleteQuery: (CriteriaDelete<(E..E?)>..CriteriaDelete<(E..E?)>?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.clear[LocalVariableDescriptor]

'from' @ [130:21] ==> public abstract fun from(p0: (Class<(E..E?)>..Class<(E..E?)>?)): (Root<(E..E?)>..Root<(E..E?)>?) defined in javax.persistence.criteria.CriteriaDelete[JavaMethodDescriptor]

'persistentEntityClass' @ [130:26] ==> public final val persistentEntityClass: Class<E> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'session' @ [131:9] ==> val session: Session defined in net.corda.node.utilities.AppendOnlyPersistentMap.clear[LocalVariableDescriptor]

'createQuery' @ [131:17] ==> public abstract fun createQuery(p0: raw (CriteriaDelete<(Any..Any?)>..CriteriaDelete<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'deleteQuery' @ [131:29] ==> val deleteQuery: (CriteriaDelete<(E..E?)>..CriteriaDelete<(E..E?)>?) defined in net.corda.node.utilities.AppendOnlyPersistentMap.clear[LocalVariableDescriptor]

'executeUpdate' @ [131:42] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

'cache' @ [132:9] ==> private final val cache: NonInvalidatingCache<K, Optional<V>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'invalidateAll' @ [132:15] ==> public open fun invalidateAll(): Unit defined in net.corda.node.utilities.NonInvalidatingCache[JavaMethodDescriptor]

