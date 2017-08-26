'SingletonSerializeAsToken' @ [15:58] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'Entity' @ [17:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'Table' @ [18:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [18:22] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'Id' @ [20:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [21:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Lob' @ [24:13] ==> public constructor Lob() defined in javax.persistence.Lob[JavaClassConstructorDescriptor]

'Column' @ [25:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [26:42] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'AppendOnlyPersistentMap' @ [31:20] ==> public constructor AppendOnlyPersistentMap<K, V, E, out EK>(toPersistentEntityKey: (SecureHash) -> String, fromPersistentEntity: (DBTransactionStorage.DBTransaction) -> Pair<SecureHash, SignedTransaction>, toPersistentEntity: (SecureHash, SignedTransaction) -> DBTransactionStorage.DBTransaction, persistentEntityClass: Class<DBTransactionStorage.DBTransaction>, cacheBound: Long = ...) defined in net.corda.node.utilities.AppendOnlyPersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> SecureHash
    <V> -> SignedTransaction
    <E> -> DBTransaction
    <out EK> -> String

'it' @ [32:47] ==> value-parameter it: SecureHash defined in net.corda.node.services.persistence.DBTransactionStorage.Companion.createTransactionsMap.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [32:50] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'Pair' @ [33:46] ==> public constructor Pair<out A, out B>(first: SecureHash.SHA256, second: SignedTransaction) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SHA256
    <out B> -> SignedTransaction

'SecureHash' @ [33:51] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [33:62] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [33:68] ==> value-parameter it: DBTransactionStorage.DBTransaction defined in net.corda.node.services.persistence.DBTransactionStorage.Companion.createTransactionsMap.<anonymous>[ValueParameterDescriptorImpl]

'txId' @ [33:71] ==> @Id @Column public final var txId: String defined in net.corda.node.services.persistence.DBTransactionStorage.DBTransaction[PropertyDescriptorImpl]

'it' @ [34:29] ==> value-parameter it: DBTransactionStorage.DBTransaction defined in net.corda.node.services.persistence.DBTransactionStorage.Companion.createTransactionsMap.<anonymous>[ValueParameterDescriptorImpl]

'transaction' @ [34:32] ==> @Lob @Column public final var transaction: ByteArray defined in net.corda.node.services.persistence.DBTransactionStorage.DBTransaction[PropertyDescriptorImpl]

'deserialize' @ [34:44] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SignedTransaction defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SignedTransaction

'SerializationDefaults' @ [34:86] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [34:108] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'DBTransaction' @ [36:25] ==> public constructor DBTransaction(txId: String = ..., transaction: ByteArray = ...) defined in net.corda.node.services.persistence.DBTransactionStorage.DBTransaction[ClassConstructorDescriptorImpl]

'apply' @ [36:41] ==> @InlineOnly public inline fun <T> DBTransactionStorage.DBTransaction.apply(block: DBTransactionStorage.DBTransaction.() -> Unit): DBTransactionStorage.DBTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DBTransaction

'txId' @ [37:29] ==> @Id @Column public final var txId: String defined in net.corda.node.services.persistence.DBTransactionStorage.DBTransaction[PropertyDescriptorImpl]

'key' @ [37:36] ==> value-parameter key: SecureHash defined in net.corda.node.services.persistence.DBTransactionStorage.Companion.createTransactionsMap.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [37:40] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'transaction' @ [38:29] ==> @Lob @Column public final var transaction: ByteArray defined in net.corda.node.services.persistence.DBTransactionStorage.DBTransaction[PropertyDescriptorImpl]

'value' @ [38:43] ==> value-parameter value: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorage.Companion.createTransactionsMap.<anonymous>[ValueParameterDescriptorImpl]

'serialize' @ [38:49] ==> public fun <T : Any> SignedTransaction.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<SignedTransaction> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'SerializationDefaults' @ [38:69] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [38:91] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'bytes' @ [38:108] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'DBTransaction' @ [41:45] ==> public constructor DBTransaction(txId: String = ..., transaction: ByteArray = ...) defined in net.corda.node.services.persistence.DBTransactionStorage.DBTransaction[ClassConstructorDescriptorImpl]

'java' @ [41:66] ==> public val <T> KClass<DBTransactionStorage.DBTransaction>.java: Class<DBTransactionStorage.DBTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBTransaction

'createTransactionsMap' @ [46:29] ==> public final fun createTransactionsMap(): AppendOnlyPersistentMap<SecureHash, SignedTransaction, DBTransactionStorage.DBTransaction, String> defined in net.corda.node.services.persistence.DBTransactionStorage.Companion[SimpleFunctionDescriptorImpl]

'txStorage' @ [49:9] ==> private final val txStorage: AppendOnlyPersistentMap<SecureHash, SignedTransaction, DBTransactionStorage.DBTransaction, String> defined in net.corda.node.services.persistence.DBTransactionStorage[PropertyDescriptorImpl]

'addWithDuplicatesAllowed' @ [49:19] ==> public final fun addWithDuplicatesAllowed(key: SecureHash, value: SignedTransaction): Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'transaction' @ [49:44] ==> value-parameter transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorage.addTransaction[ValueParameterDescriptorImpl]

'id' @ [49:56] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'transaction' @ [49:60] ==> value-parameter transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorage.addTransaction[ValueParameterDescriptorImpl]

'apply' @ [49:73] ==> @InlineOnly public inline fun <T> Boolean.apply(block: Boolean.() -> Unit): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'updatesPublisher' @ [50:13] ==> private final val updatesPublisher: (SerializedSubject<(SignedTransaction..SignedTransaction?), (SignedTransaction..SignedTransaction?)>..SerializedSubject<(SignedTransaction..SignedTransaction?), (SignedTransaction..SignedTransaction?)>?) defined in net.corda.node.services.persistence.DBTransactionStorage[PropertyDescriptorImpl]

'bufferUntilDatabaseCommit' @ [50:30] ==> public fun <T : Any> Observer<(SignedTransaction..SignedTransaction?)>.bufferUntilDatabaseCommit(): Observer<(SignedTransaction..SignedTransaction?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)

'onNext' @ [50:58] ==> public abstract fun onNext(p0: (SignedTransaction..SignedTransaction?)): Unit defined in rx.Observer[JavaMethodDescriptor]

'transaction' @ [50:65] ==> value-parameter transaction: SignedTransaction defined in net.corda.node.services.persistence.DBTransactionStorage.addTransaction[ValueParameterDescriptorImpl]

'txStorage' @ [53:71] ==> private final val txStorage: AppendOnlyPersistentMap<SecureHash, SignedTransaction, DBTransactionStorage.DBTransaction, String> defined in net.corda.node.services.persistence.DBTransactionStorage[PropertyDescriptorImpl]

'id' @ [53:81] ==> value-parameter id: SecureHash defined in net.corda.node.services.persistence.DBTransactionStorage.getTransaction[ValueParameterDescriptorImpl]

'create' @ [55:51] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(SignedTransaction..SignedTransaction?)>..PublishSubject<(SignedTransaction..SignedTransaction?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction

'toSerialized' @ [55:79] ==> public final fun toSerialized(): (SerializedSubject<(SignedTransaction..SignedTransaction?), (SignedTransaction..SignedTransaction?)>..SerializedSubject<(SignedTransaction..SignedTransaction?), (SignedTransaction..SignedTransaction?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]

'updatesPublisher' @ [56:59] ==> private final val updatesPublisher: (SerializedSubject<(SignedTransaction..SignedTransaction?), (SignedTransaction..SignedTransaction?)>..SerializedSubject<(SignedTransaction..SignedTransaction?), (SignedTransaction..SignedTransaction?)>?) defined in net.corda.node.services.persistence.DBTransactionStorage[PropertyDescriptorImpl]

'wrapWithDatabaseTransaction' @ [56:76] ==> public fun <T : Any> Observable<(SignedTransaction..SignedTransaction?)>.wrapWithDatabaseTransaction(db: CordaPersistence? = ...): Observable<(SignedTransaction..SignedTransaction?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)

'DataFeed' @ [59:13] ==> public constructor DataFeed<out A, B>(snapshot: List<SignedTransaction>, updates: Observable<(SignedTransaction..SignedTransaction?)>) defined in net.corda.core.messaging.DataFeed[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<SignedTransaction>
    <B> -> (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)

'txStorage' @ [59:22] ==> private final val txStorage: AppendOnlyPersistentMap<SecureHash, SignedTransaction, DBTransactionStorage.DBTransaction, String> defined in net.corda.node.services.persistence.DBTransactionStorage[PropertyDescriptorImpl]

'allPersisted' @ [59:32] ==> public final fun allPersisted(): Sequence<Pair<SecureHash, SignedTransaction>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'map' @ [59:47] ==> public fun <T, R> Sequence<Pair<SecureHash, SignedTransaction>>.map(transform: (Pair<SecureHash, SignedTransaction>) -> SignedTransaction): Sequence<SignedTransaction> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SecureHash, SignedTransaction>
    <R> -> SignedTransaction

'it' @ [59:53] ==> value-parameter it: Pair<SecureHash, SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage.track.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [59:56] ==> public final val second: SignedTransaction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toList' @ [59:65] ==> public fun <T> Sequence<SignedTransaction>.toList(): List<SignedTransaction> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'updatesPublisher' @ [59:75] ==> private final val updatesPublisher: (SerializedSubject<(SignedTransaction..SignedTransaction?), (SignedTransaction..SignedTransaction?)>..SerializedSubject<(SignedTransaction..SignedTransaction?), (SignedTransaction..SignedTransaction?)>?) defined in net.corda.node.services.persistence.DBTransactionStorage[PropertyDescriptorImpl]

'bufferUntilSubscribed' @ [59:92] ==> public fun <T> Observable<(SignedTransaction..SignedTransaction?)>.bufferUntilSubscribed(): Observable<(SignedTransaction..SignedTransaction?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)

'wrapWithDatabaseTransaction' @ [59:116] ==> public fun <T : Any> Observable<(SignedTransaction..SignedTransaction?)>.wrapWithDatabaseTransaction(db: CordaPersistence? = ...): Observable<(SignedTransaction..SignedTransaction?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)

'VisibleForTesting' @ [61:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'txStorage' @ [62:59] ==> private final val txStorage: AppendOnlyPersistentMap<SecureHash, SignedTransaction, DBTransactionStorage.DBTransaction, String> defined in net.corda.node.services.persistence.DBTransactionStorage[PropertyDescriptorImpl]

'allPersisted' @ [62:69] ==> public final fun allPersisted(): Sequence<Pair<SecureHash, SignedTransaction>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'map' @ [62:84] ==> public fun <T, R> Sequence<Pair<SecureHash, SignedTransaction>>.map(transform: (Pair<SecureHash, SignedTransaction>) -> SignedTransaction): Sequence<SignedTransaction> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SecureHash, SignedTransaction>
    <R> -> SignedTransaction

'it' @ [62:90] ==> value-parameter it: Pair<SecureHash, SignedTransaction> defined in net.corda.node.services.persistence.DBTransactionStorage.<get-transactions>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [62:93] ==> public final val second: SignedTransaction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toList' @ [62:102] ==> public fun <T> Sequence<SignedTransaction>.toList(): List<SignedTransaction> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

