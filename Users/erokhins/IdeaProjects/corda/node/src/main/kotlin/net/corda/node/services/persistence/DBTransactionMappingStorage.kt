'ThreadSafe' @ [21:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Entity' @ [24:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'javax.persistence.Table' @ [25:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [25:40] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'Id' @ [27:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [28:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [31:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'AppendOnlyPersistentMap' @ [37:20] ==> public constructor AppendOnlyPersistentMap<K, V, E, out EK>(toPersistentEntityKey: (SecureHash) -> String, fromPersistentEntity: (DBTransactionMappingStorage.DBTransactionMapping) -> Pair<SecureHash, StateMachineRunId>, toPersistentEntity: (SecureHash, StateMachineRunId) -> DBTransactionMappingStorage.DBTransactionMapping, persistentEntityClass: Class<DBTransactionMappingStorage.DBTransactionMapping>, cacheBound: Long = ...) defined in net.corda.node.utilities.AppendOnlyPersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> SecureHash
    <V> -> StateMachineRunId
    <E> -> DBTransactionMapping
    <out EK> -> String

'it' @ [38:47] ==> value-parameter it: SecureHash defined in net.corda.node.services.persistence.DBTransactionMappingStorage.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [38:50] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'Pair' @ [39:46] ==> public constructor Pair<out A, out B>(first: SecureHash.SHA256, second: StateMachineRunId) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SHA256
    <out B> -> StateMachineRunId

'SecureHash' @ [39:51] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [39:62] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [39:68] ==> value-parameter it: DBTransactionMappingStorage.DBTransactionMapping defined in net.corda.node.services.persistence.DBTransactionMappingStorage.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'txId' @ [39:71] ==> @Id @Column public final var txId: String defined in net.corda.node.services.persistence.DBTransactionMappingStorage.DBTransactionMapping[PropertyDescriptorImpl]

'StateMachineRunId' @ [39:78] ==> public constructor StateMachineRunId(uuid: UUID) defined in net.corda.core.flows.StateMachineRunId[DeserializedClassConstructorDescriptor]

'fromString' @ [39:101] ==> public open fun fromString(p0: (String..String?)): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'it' @ [39:112] ==> value-parameter it: DBTransactionMappingStorage.DBTransactionMapping defined in net.corda.node.services.persistence.DBTransactionMappingStorage.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'stateMachineRunId' @ [39:115] ==> @Column public final var stateMachineRunId: String defined in net.corda.node.services.persistence.DBTransactionMappingStorage.DBTransactionMapping[PropertyDescriptorImpl]

'DBTransactionMapping' @ [41:25] ==> public constructor DBTransactionMapping(txId: String = ..., stateMachineRunId: String = ...) defined in net.corda.node.services.persistence.DBTransactionMappingStorage.DBTransactionMapping[ClassConstructorDescriptorImpl]

'apply' @ [41:48] ==> @InlineOnly public inline fun <T> DBTransactionMappingStorage.DBTransactionMapping.apply(block: DBTransactionMappingStorage.DBTransactionMapping.() -> Unit): DBTransactionMappingStorage.DBTransactionMapping defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DBTransactionMapping

'txId' @ [42:29] ==> @Id @Column public final var txId: String defined in net.corda.node.services.persistence.DBTransactionMappingStorage.DBTransactionMapping[PropertyDescriptorImpl]

'key' @ [42:36] ==> value-parameter key: SecureHash defined in net.corda.node.services.persistence.DBTransactionMappingStorage.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [42:40] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'stateMachineRunId' @ [43:29] ==> @Column public final var stateMachineRunId: String defined in net.corda.node.services.persistence.DBTransactionMappingStorage.DBTransactionMapping[PropertyDescriptorImpl]

'value' @ [43:49] ==> value-parameter value: StateMachineRunId defined in net.corda.node.services.persistence.DBTransactionMappingStorage.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'uuid' @ [43:55] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[DeserializedPropertyDescriptor]

'toString' @ [43:60] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'DBTransactionMapping' @ [46:45] ==> public constructor DBTransactionMapping(txId: String = ..., stateMachineRunId: String = ...) defined in net.corda.node.services.persistence.DBTransactionMappingStorage.DBTransactionMapping[ClassConstructorDescriptorImpl]

'java' @ [46:73] ==> public val <T> KClass<DBTransactionMappingStorage.DBTransactionMapping>.java: Class<DBTransactionMappingStorage.DBTransactionMapping> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBTransactionMapping

'createMap' @ [51:38] ==> public final fun createMap(): AppendOnlyPersistentMap<SecureHash, StateMachineRunId, DBTransactionMappingStorage.DBTransactionMapping, String> defined in net.corda.node.services.persistence.DBTransactionMappingStorage.Companion[SimpleFunctionDescriptorImpl]

'create' @ [52:82] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>..PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StateMachineTransactionMapping

'stateMachineTransactionMap' @ [55:9] ==> public final val stateMachineTransactionMap: AppendOnlyPersistentMap<SecureHash, StateMachineRunId, DBTransactionMappingStorage.DBTransactionMapping, String> defined in net.corda.node.services.persistence.DBTransactionMappingStorage[PropertyDescriptorImpl]

'transactionId' @ [55:36] ==> value-parameter transactionId: SecureHash defined in net.corda.node.services.persistence.DBTransactionMappingStorage.addMapping[ValueParameterDescriptorImpl]

'stateMachineRunId' @ [55:53] ==> value-parameter stateMachineRunId: StateMachineRunId defined in net.corda.node.services.persistence.DBTransactionMappingStorage.addMapping[ValueParameterDescriptorImpl]

'updates' @ [56:9] ==> public final val updates: PublishSubject<StateMachineTransactionMapping> defined in net.corda.node.services.persistence.DBTransactionMappingStorage[PropertyDescriptorImpl]

'bufferUntilDatabaseCommit' @ [56:17] ==> public fun <T : Any> Observer<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>.bufferUntilDatabaseCommit(): Observer<(StateMachineTransactionMapping..StateMachineTransactionMapping?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.messaging.StateMachineTransactionMapping..net.corda.core.messaging.StateMachineTransactionMapping?)

'onNext' @ [56:45] ==> public abstract fun onNext(p0: (StateMachineTransactionMapping..StateMachineTransactionMapping?)): Unit defined in rx.Observer[JavaMethodDescriptor]

'StateMachineTransactionMapping' @ [56:52] ==> public constructor StateMachineTransactionMapping(stateMachineRunId: StateMachineRunId, transactionId: SecureHash) defined in net.corda.core.messaging.StateMachineTransactionMapping[DeserializedClassConstructorDescriptor]

'stateMachineRunId' @ [56:83] ==> value-parameter stateMachineRunId: StateMachineRunId defined in net.corda.node.services.persistence.DBTransactionMappingStorage.addMapping[ValueParameterDescriptorImpl]

'transactionId' @ [56:102] ==> value-parameter transactionId: SecureHash defined in net.corda.node.services.persistence.DBTransactionMappingStorage.addMapping[ValueParameterDescriptorImpl]

'DataFeed' @ [60:13] ==> public constructor DataFeed<out A, B>(snapshot: List<StateMachineTransactionMapping>, updates: Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>) defined in net.corda.core.messaging.DataFeed[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<StateMachineTransactionMapping>
    <B> -> (net.corda.core.messaging.StateMachineTransactionMapping..net.corda.core.messaging.StateMachineTransactionMapping?)

'stateMachineTransactionMap' @ [60:22] ==> public final val stateMachineTransactionMap: AppendOnlyPersistentMap<SecureHash, StateMachineRunId, DBTransactionMappingStorage.DBTransactionMapping, String> defined in net.corda.node.services.persistence.DBTransactionMappingStorage[PropertyDescriptorImpl]

'allPersisted' @ [60:49] ==> public final fun allPersisted(): Sequence<Pair<SecureHash, StateMachineRunId>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'map' @ [60:64] ==> public fun <T, R> Sequence<Pair<SecureHash, StateMachineRunId>>.map(transform: (Pair<SecureHash, StateMachineRunId>) -> StateMachineTransactionMapping): Sequence<StateMachineTransactionMapping> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SecureHash, StateMachineRunId>
    <R> -> StateMachineTransactionMapping

'StateMachineTransactionMapping' @ [60:70] ==> public constructor StateMachineTransactionMapping(stateMachineRunId: StateMachineRunId, transactionId: SecureHash) defined in net.corda.core.messaging.StateMachineTransactionMapping[DeserializedClassConstructorDescriptor]

'it' @ [60:101] ==> value-parameter it: Pair<SecureHash, StateMachineRunId> defined in net.corda.node.services.persistence.DBTransactionMappingStorage.track.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [60:104] ==> public final val second: StateMachineRunId defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [60:112] ==> value-parameter it: Pair<SecureHash, StateMachineRunId> defined in net.corda.node.services.persistence.DBTransactionMappingStorage.track.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [60:115] ==> public final val first: SecureHash defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toList' @ [60:124] ==> public fun <T> Sequence<StateMachineTransactionMapping>.toList(): List<StateMachineTransactionMapping> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateMachineTransactionMapping

'updates' @ [61:21] ==> public final val updates: PublishSubject<StateMachineTransactionMapping> defined in net.corda.node.services.persistence.DBTransactionMappingStorage[PropertyDescriptorImpl]

'bufferUntilSubscribed' @ [61:29] ==> public fun <T> Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>.bufferUntilSubscribed(): Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.messaging.StateMachineTransactionMapping..net.corda.core.messaging.StateMachineTransactionMapping?)

'wrapWithDatabaseTransaction' @ [61:53] ==> public fun <T : Any> Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>.wrapWithDatabaseTransaction(db: CordaPersistence? = ...): Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.messaging.StateMachineTransactionMapping..net.corda.core.messaging.StateMachineTransactionMapping?)

