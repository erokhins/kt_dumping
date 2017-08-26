'ThreadSafe' @ [19:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'HashMap' @ [22:42] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> StateMachineRunId
    <V : (Any..Any?)> -> HashSet<SecureHash>

'!!' @ [23:23] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PublishSubject<StateMachineTransactionMapping>?): PublishSubject<StateMachineTransactionMapping>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PublishSubject<StateMachineTransactionMapping>

'create' @ [23:38] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>..PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StateMachineTransactionMapping

'ThreadBox' @ [25:25] ==> public constructor ThreadBox<out T>(content: InMemoryStateMachineRecordedTransactionMappingStorage.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [25:35] ==> public constructor InnerState() defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.InnerState[ClassConstructorDescriptorImpl]

'mutex' @ [28:9] ==> private final val mutex: ThreadBox<InMemoryStateMachineRecordedTransactionMappingStorage.InnerState> defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage[PropertyDescriptorImpl]

'locked' @ [28:15] ==> public final inline fun <R> locked(body: InMemoryStateMachineRecordedTransactionMappingStorage.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'stateMachineTransactionMap' @ [29:13] ==> public final val stateMachineTransactionMap: HashMap<StateMachineRunId, HashSet<SecureHash>> defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.InnerState[PropertyDescriptorImpl]

'getOrPut' @ [29:40] ==> public inline fun <K, V> MutableMap<StateMachineRunId, HashSet<SecureHash>>.getOrPut(key: StateMachineRunId, defaultValue: () -> HashSet<SecureHash>): HashSet<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> StateMachineRunId
    <V> -> HashSet<SecureHash>

'stateMachineRunId' @ [29:49] ==> value-parameter stateMachineRunId: StateMachineRunId defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.addMapping[ValueParameterDescriptorImpl]

'HashSet' @ [29:70] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'add' @ [29:82] ==> public open fun add(element: SecureHash): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'transactionId' @ [29:86] ==> value-parameter transactionId: SecureHash defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.addMapping[ValueParameterDescriptorImpl]

'updates' @ [30:13] ==> public final val updates: PublishSubject<StateMachineTransactionMapping> defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.InnerState[PropertyDescriptorImpl]

'onNext' @ [30:21] ==> public open fun onNext(p0: (StateMachineTransactionMapping..StateMachineTransactionMapping?)): Unit defined in rx.subjects.PublishSubject[JavaMethodDescriptor]

'StateMachineTransactionMapping' @ [30:28] ==> public constructor StateMachineTransactionMapping(stateMachineRunId: StateMachineRunId, transactionId: SecureHash) defined in net.corda.core.messaging.StateMachineTransactionMapping[DeserializedClassConstructorDescriptor]

'stateMachineRunId' @ [30:59] ==> value-parameter stateMachineRunId: StateMachineRunId defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.addMapping[ValueParameterDescriptorImpl]

'transactionId' @ [30:78] ==> value-parameter transactionId: SecureHash defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.addMapping[ValueParameterDescriptorImpl]

'mutex' @ [36:9] ==> private final val mutex: ThreadBox<InMemoryStateMachineRecordedTransactionMappingStorage.InnerState> defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage[PropertyDescriptorImpl]

'locked' @ [36:15] ==> public final inline fun <R> locked(body: InMemoryStateMachineRecordedTransactionMappingStorage.InnerState.() -> Nothing): Nothing defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Nothing

'DataFeed' @ [37:20] ==> public constructor DataFeed<out A, B>(snapshot: List<StateMachineTransactionMapping>, updates: Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>) defined in net.corda.core.messaging.DataFeed[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<StateMachineTransactionMapping>
    <B> -> (net.corda.core.messaging.StateMachineTransactionMapping..net.corda.core.messaging.StateMachineTransactionMapping?)

'stateMachineTransactionMap' @ [38:21] ==> public final val stateMachineTransactionMap: HashMap<StateMachineRunId, HashSet<SecureHash>> defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.InnerState[PropertyDescriptorImpl]

'flatMap' @ [38:48] ==> public inline fun <K, V, R> Map<out StateMachineRunId, HashSet<SecureHash>>.flatMap(transform: (Map.Entry<StateMachineRunId, HashSet<SecureHash>>) -> Iterable<StateMachineTransactionMapping>): List<StateMachineTransactionMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> StateMachineRunId
    <V> -> HashSet<SecureHash>
    <R> -> StateMachineTransactionMapping

'entry' @ [39:25] ==> value-parameter entry: Map.Entry<StateMachineRunId, HashSet<SecureHash>> defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.track.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [39:31] ==> public abstract val value: HashSet<SecureHash> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [39:37] ==> public inline fun <T, R> Iterable<SecureHash>.map(transform: (SecureHash) -> StateMachineTransactionMapping): List<StateMachineTransactionMapping> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <R> -> StateMachineTransactionMapping

'StateMachineTransactionMapping' @ [40:29] ==> public constructor StateMachineTransactionMapping(stateMachineRunId: StateMachineRunId, transactionId: SecureHash) defined in net.corda.core.messaging.StateMachineTransactionMapping[DeserializedClassConstructorDescriptor]

'entry' @ [40:60] ==> value-parameter entry: Map.Entry<StateMachineRunId, HashSet<SecureHash>> defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.track.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [40:66] ==> public abstract val key: StateMachineRunId defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [40:71] ==> value-parameter it: SecureHash defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.track.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'updates' @ [43:21] ==> public final val updates: PublishSubject<StateMachineTransactionMapping> defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage.InnerState[PropertyDescriptorImpl]

'bufferUntilSubscribed' @ [43:29] ==> public fun <T> Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>.bufferUntilSubscribed(): Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.messaging.StateMachineTransactionMapping..net.corda.core.messaging.StateMachineTransactionMapping?)

