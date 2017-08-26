'ThreadSafe' @ [71:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'serverAddress' @ [80:67] ==> value-parameter serverAddress: NetworkHostAndPort defined in net.corda.node.services.messaging.NodeMessagingClient.<init>[ValueParameterDescriptorImpl]

'ArtemisMessagingComponent' @ [81:5] ==> public constructor ArtemisMessagingComponent() defined in net.corda.nodeapi.ArtemisMessagingComponent[DeserializedClassConstructorDescriptor]

'loggerFor' @ [83:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeMessagingClient

'SimpleString' @ [89:37] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'SimpleString' @ [90:41] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'SimpleString' @ [91:43] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'SimpleString' @ [92:46] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'SimpleString' @ [93:47] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'getProperty' @ [94:45] ==> public open fun getProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'toInt' @ [94:87] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'VERIFICATION_RESPONSES_QUEUE_NAME_PREFIX' @ [95:49] ==> public final val VERIFICATION_RESPONSES_QUEUE_NAME_PREFIX: String defined in net.corda.nodeapi.VerifierApi[PropertyImportedFromObject]

'random63BitValue' @ [95:92] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'AppendOnlyPersistentMap' @ [100:20] ==> public constructor AppendOnlyPersistentMap<K, V, E, out EK>(toPersistentEntityKey: (UUID) -> String, fromPersistentEntity: (NodeMessagingClient.ProcessedMessage) -> Pair<UUID, Instant>, toPersistentEntity: (key: UUID, value: Instant) -> NodeMessagingClient.ProcessedMessage, persistentEntityClass: Class<NodeMessagingClient.ProcessedMessage>, cacheBound: Long = ...) defined in net.corda.node.utilities.AppendOnlyPersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> UUID
    <V> -> Instant
    <E> -> ProcessedMessage
    <out EK> -> String

'it' @ [101:47] ==> value-parameter it: UUID defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createProcessedMessage.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [101:50] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'Pair' @ [102:46] ==> public constructor Pair<out A, out B>(first: (UUID..UUID?), second: Instant) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (java.util.UUID..java.util.UUID?)
    <out B> -> Instant

'fromString' @ [102:56] ==> public open fun fromString(p0: (String..String?)): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'it' @ [102:67] ==> value-parameter it: NodeMessagingClient.ProcessedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createProcessedMessage.<anonymous>[ValueParameterDescriptorImpl]

'uuid' @ [102:70] ==> @Id @Column public final var uuid: String defined in net.corda.node.services.messaging.NodeMessagingClient.ProcessedMessage[PropertyDescriptorImpl]

'it' @ [102:77] ==> value-parameter it: NodeMessagingClient.ProcessedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createProcessedMessage.<anonymous>[ValueParameterDescriptorImpl]

'insertionTime' @ [102:80] ==> @Column public final var insertionTime: Instant defined in net.corda.node.services.messaging.NodeMessagingClient.ProcessedMessage[PropertyDescriptorImpl]

'ProcessedMessage' @ [104:25] ==> public constructor ProcessedMessage(uuid: String = ..., insertionTime: Instant = ...) defined in net.corda.node.services.messaging.NodeMessagingClient.ProcessedMessage[ClassConstructorDescriptorImpl]

'apply' @ [104:44] ==> @InlineOnly public inline fun <T> NodeMessagingClient.ProcessedMessage.apply(block: NodeMessagingClient.ProcessedMessage.() -> Unit): NodeMessagingClient.ProcessedMessage defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProcessedMessage

'uuid' @ [105:29] ==> @Id @Column public final var uuid: String defined in net.corda.node.services.messaging.NodeMessagingClient.ProcessedMessage[PropertyDescriptorImpl]

'key' @ [105:36] ==> value-parameter key: UUID defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createProcessedMessage.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [105:40] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'insertionTime' @ [106:29] ==> @Column public final var insertionTime: Instant defined in net.corda.node.services.messaging.NodeMessagingClient.ProcessedMessage[PropertyDescriptorImpl]

'value' @ [106:45] ==> value-parameter value: Instant defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createProcessedMessage.<anonymous>[ValueParameterDescriptorImpl]

'ProcessedMessage' @ [109:45] ==> public constructor ProcessedMessage(uuid: String = ..., insertionTime: Instant = ...) defined in net.corda.node.services.messaging.NodeMessagingClient.ProcessedMessage[ClassConstructorDescriptorImpl]

'java' @ [109:69] ==> public val <T> KClass<NodeMessagingClient.ProcessedMessage>.java: Class<NodeMessagingClient.ProcessedMessage> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ProcessedMessage

'PersistentMap' @ [114:20] ==> public constructor PersistentMap<K, V, E, out EK>(toPersistentEntityKey: (Long) -> Long, fromPersistentEntity: (NodeMessagingClient.RetryMessage) -> Pair<Long, Pair<Message, MessageRecipients>>, toPersistentEntity: (key: Long, value: Pair<Message, MessageRecipients>) -> NodeMessagingClient.RetryMessage, persistentEntityClass: Class<NodeMessagingClient.RetryMessage>) defined in net.corda.node.utilities.PersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> Long
    <V> -> Pair<Message, MessageRecipients>
    <E> -> RetryMessage
    <out EK> -> Long

'it' @ [115:47] ==> value-parameter it: Long defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createMessageToRedeliver.<anonymous>[ValueParameterDescriptorImpl]

'Pair' @ [116:46] ==> public constructor Pair<out A, out B>(first: Long, second: Pair<Message, MessageRecipients>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Long
    <out B> -> Pair<Message, MessageRecipients>

'it' @ [116:51] ==> value-parameter it: NodeMessagingClient.RetryMessage defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createMessageToRedeliver.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [116:54] ==> @Id @Column public final var key: Long defined in net.corda.node.services.messaging.NodeMessagingClient.RetryMessage[PropertyDescriptorImpl]

'Pair' @ [117:29] ==> public constructor Pair<out A, out B>(first: Message, second: MessageRecipients) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Message
    <out B> -> MessageRecipients

'it' @ [117:34] ==> value-parameter it: NodeMessagingClient.RetryMessage defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createMessageToRedeliver.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [117:37] ==> @Lob @Column public final var message: ByteArray defined in net.corda.node.services.messaging.NodeMessagingClient.RetryMessage[PropertyDescriptorImpl]

'deserialize' @ [117:45] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): Message defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Message

'STORAGE_CONTEXT' @ [117:90] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'it' @ [118:37] ==> value-parameter it: NodeMessagingClient.RetryMessage defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createMessageToRedeliver.<anonymous>[ValueParameterDescriptorImpl]

'recipients' @ [118:40] ==> @Lob @Column public final var recipients: ByteArray defined in net.corda.node.services.messaging.NodeMessagingClient.RetryMessage[PropertyDescriptorImpl]

'deserialize' @ [118:51] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): MessageRecipients defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> MessageRecipients

'STORAGE_CONTEXT' @ [118:96] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'component1' @ [120:57] ==> public final operator fun component1(): Message defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [120:76] ==> public final operator fun component2(): MessageRecipients defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'RetryMessage' @ [121:25] ==> public constructor RetryMessage(key: Long = ..., message: ByteArray = ..., recipients: ByteArray = ...) defined in net.corda.node.services.messaging.NodeMessagingClient.RetryMessage[ClassConstructorDescriptorImpl]

'apply' @ [121:40] ==> @InlineOnly public inline fun <T> NodeMessagingClient.RetryMessage.apply(block: NodeMessagingClient.RetryMessage.() -> Unit): NodeMessagingClient.RetryMessage defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RetryMessage

'key' @ [122:29] ==> @Id @Column public final var key: Long defined in net.corda.node.services.messaging.NodeMessagingClient.RetryMessage[PropertyDescriptorImpl]

'_key' @ [122:35] ==> value-parameter _key: Long defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createMessageToRedeliver.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [123:29] ==> @Lob @Column public final var message: ByteArray defined in net.corda.node.services.messaging.NodeMessagingClient.RetryMessage[PropertyDescriptorImpl]

'_message' @ [123:39] ==> val _message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createMessageToRedeliver.<anonymous>[LocalVariableDescriptor]

'serialize' @ [123:48] ==> public fun <T : Any> Message.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<Message> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Message

'STORAGE_CONTEXT' @ [123:90] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'bytes' @ [123:107] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'recipients' @ [124:29] ==> @Lob @Column public final var recipients: ByteArray defined in net.corda.node.services.messaging.NodeMessagingClient.RetryMessage[PropertyDescriptorImpl]

'_recipient' @ [124:42] ==> val _recipient: MessageRecipients defined in net.corda.node.services.messaging.NodeMessagingClient.Companion.createMessageToRedeliver.<anonymous>[LocalVariableDescriptor]

'serialize' @ [124:53] ==> public fun <T : Any> MessageRecipients.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<MessageRecipients> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> MessageRecipients

'STORAGE_CONTEXT' @ [124:95] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'bytes' @ [124:112] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'RetryMessage' @ [127:45] ==> public constructor RetryMessage(key: Long = ..., message: ByteArray = ..., recipients: ByteArray = ...) defined in net.corda.node.services.messaging.NodeMessagingClient.RetryMessage[ClassConstructorDescriptorImpl]

'java' @ [127:65] ==> public val <T> KClass<NodeMessagingClient.RetryMessage>.java: Class<NodeMessagingClient.RetryMessage> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RetryMessage

'database' @ [144:39] ==> public final val database: CordaPersistence defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'transaction' @ [144:48] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> PersistentMap<Long, Pair<Message, MessageRecipients>, NodeMessagingClient.RetryMessage, Long>): PersistentMap<Long, Pair<Message, MessageRecipients>, NodeMessagingClient.RetryMessage, Long> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PersistentMap<Long, Pair<Message, MessageRecipients>, RetryMessage, Long>

'createMessageToRedeliver' @ [145:9] ==> public final fun createMessageToRedeliver(): PersistentMap<Long, Pair<Message, MessageRecipients>, NodeMessagingClient.RetryMessage, Long> defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[SimpleFunctionDescriptorImpl]

'ConcurrentHashMap' @ [148:48] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Long
    <V : (Any..Any?)> -> ScheduledFuture<*>

'when (config.verifierType) {
        VerifierType.InMemory -> InMemoryTransactionVerifierService(numberOfWorkers = 4)
        VerifierType.OutOfProcess -> createOutOfProcessVerifierService()
    }' @ [150:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TransactionVerifierService, entry1: TransactionVerifierService): TransactionVerifierService[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TransactionVerifierService

'config' @ [150:33] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'verifierType' @ [150:40] ==> public abstract val verifierType: VerifierType defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'InMemory' @ [151:22] ==> enum entry InMemory defined in net.corda.node.services.config.VerifierType[FakeCallableDescriptorForObject]

'InMemoryTransactionVerifierService' @ [151:34] ==> public constructor InMemoryTransactionVerifierService(numberOfWorkers: Int) defined in net.corda.node.services.transactions.InMemoryTransactionVerifierService[ClassConstructorDescriptorImpl]

'OutOfProcess' @ [152:22] ==> enum entry OutOfProcess defined in net.corda.node.services.config.VerifierType[FakeCallableDescriptorForObject]

'createOutOfProcessVerifierService' @ [152:38] ==> private final fun createOutOfProcessVerifierService(): TransactionVerifierService defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'SimpleString' @ [159:31] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'versionInfo' @ [159:44] ==> private final val versionInfo: VersionInfo defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'vendor' @ [159:56] ==> public final val vendor: String defined in net.corda.node.VersionInfo[PropertyDescriptorImpl]

'SimpleString' @ [160:34] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'versionInfo' @ [160:47] ==> private final val versionInfo: VersionInfo defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'releaseVersion' @ [160:59] ==> public final val releaseVersion: String defined in net.corda.node.VersionInfo[PropertyDescriptorImpl]

'ServiceAffinityExecutor' @ [162:54] ==> public constructor ServiceAffinityExecutor(threadName: String, numThreads: Int) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[ClassConstructorDescriptorImpl]

'if (myIdentity != null) {
        NodeAddress.asPeer(myIdentity, advertisedAddress)
    } else {
        NetworkMapAddress(advertisedAddress)
    }' @ [167:54] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SingleMessageRecipient, elseBranch: SingleMessageRecipient): SingleMessageRecipient[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SingleMessageRecipient

'myIdentity' @ [167:58] ==> private final val myIdentity: PublicKey? defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'asPeer' @ [168:21] ==> public final fun asPeer(peerIdentity: PublicKey, hostAndPort: NetworkHostAndPort): ArtemisMessagingComponent.NodeAddress defined in net.corda.nodeapi.ArtemisMessagingComponent.NodeAddress.Companion[DeserializedSimpleFunctionDescriptor]

'myIdentity' @ [168:28] ==> private final val myIdentity: PublicKey? defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'advertisedAddress' @ [168:40] ==> value-parameter advertisedAddress: NetworkHostAndPort = ... defined in net.corda.node.services.messaging.NodeMessagingClient.<init>[ValueParameterDescriptorImpl]

'NetworkMapAddress' @ [170:9] ==> public constructor NetworkMapAddress(hostAndPort: NetworkHostAndPort) defined in net.corda.nodeapi.ArtemisMessagingComponent.NetworkMapAddress[DeserializedClassConstructorDescriptor]

'advertisedAddress' @ [170:27] ==> value-parameter advertisedAddress: NetworkHostAndPort = ... defined in net.corda.node.services.messaging.NodeMessagingClient.<init>[ValueParameterDescriptorImpl]

'ThreadBox' @ [173:25] ==> public constructor ThreadBox<out T>(content: NodeMessagingClient.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [173:35] ==> public constructor InnerState() defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[ClassConstructorDescriptorImpl]

'CopyOnWriteArrayList' @ [174:28] ==> public constructor CopyOnWriteArrayList<E : (Any..Any?)>() defined in java.util.concurrent.CopyOnWriteArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Handler

'createProcessedMessage' @ [176:37] ==> public final fun createProcessedMessage(): AppendOnlyPersistentMap<UUID, Instant, NodeMessagingClient.ProcessedMessage, String> defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[SimpleFunctionDescriptorImpl]

'Entity' @ [178:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'javax.persistence.Table' @ [179:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [179:40] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'Id' @ [181:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [182:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [185:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'now' @ [186:50] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'Entity' @ [189:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'javax.persistence.Table' @ [190:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [190:40] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'Id' @ [192:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [193:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Lob' @ [196:13] ==> public constructor Lob() defined in javax.persistence.Lob[JavaClassConstructorDescriptor]

'Column' @ [197:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [198:38] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'Lob' @ [200:13] ==> public constructor Lob() defined in javax.persistence.Lob[JavaClassConstructorDescriptor]

'Column' @ [201:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [202:41] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'state' @ [206:9] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [206:15] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'check' @ [207:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [207:19] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'started' @ [207:20] ==> public final var started: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'started' @ [208:13] ==> public final var started: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'log' @ [210:13] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'info' @ [210:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'serverAddress' @ [210:54] ==> private final val serverAddress: NetworkHostAndPort defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'ArtemisTcpTransport' @ [212:32] ==> public companion object defined in net.corda.nodeapi.ArtemisTcpTransport[FakeCallableDescriptorForObject]

'tcpTransport' @ [212:52] ==> public final fun tcpTransport(direction: ConnectionDirection, hostAndPort: NetworkHostAndPort, config: SSLConfiguration?, enableSSL: Boolean = ...): TransportConfiguration defined in net.corda.nodeapi.ArtemisTcpTransport.Companion[DeserializedSimpleFunctionDescriptor]

'Outbound' @ [212:85] ==> public constructor Outbound(expectedCommonName: X500Name? = ..., connectorFactoryClassName: String = ...) defined in net.corda.nodeapi.ConnectionDirection.Outbound[DeserializedClassConstructorDescriptor]

'serverAddress' @ [212:97] ==> private final val serverAddress: NetworkHostAndPort defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'config' @ [212:112] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'createServerLocatorWithoutHA' @ [213:42] ==> public open fun createServerLocatorWithoutHA(vararg p0: (TransportConfiguration..TransportConfiguration?)): (ServerLocator..ServerLocator?) defined in org.apache.activemq.artemis.api.core.client.ActiveMQClient[JavaMethodDescriptor]

'tcpTransport' @ [213:71] ==> val tcpTransport: TransportConfiguration defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'locator' @ [216:13] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'connectionTTL' @ [216:21] ==> public final var ServerLocator.connectionTTL: Long[MyPropertyDescriptor]

'-' @ [216:37] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'locator' @ [217:13] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'clientFailureCheckPeriod' @ [217:21] ==> public final var ServerLocator.clientFailureCheckPeriod: Long[MyPropertyDescriptor]

'-' @ [217:48] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'locator' @ [218:13] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'minLargeMessageSize' @ [218:21] ==> public final var ServerLocator.minLargeMessageSize: Int[MyPropertyDescriptor]

'ArtemisMessagingServer' @ [218:43] ==> public companion object defined in net.corda.node.services.messaging.ArtemisMessagingServer[FakeCallableDescriptorForObject]

'MAX_FILE_SIZE' @ [218:66] ==> @JvmStatic public final val MAX_FILE_SIZE: Int defined in net.corda.node.services.messaging.ArtemisMessagingServer.Companion[PropertyDescriptorImpl]

'sessionFactory' @ [219:13] ==> public final var sessionFactory: ClientSessionFactory? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'locator' @ [219:30] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'createSessionFactory' @ [219:38] ==> public abstract fun createSessionFactory(): (ClientSessionFactory..ClientSessionFactory?) defined in org.apache.activemq.artemis.api.core.client.ServerLocator[JavaMethodDescriptor]

'sessionFactory' @ [225:27] ==> public final var sessionFactory: ClientSessionFactory? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'createSession' @ [225:44] ==> public abstract fun createSession(p0: (String..String?), p1: (String..String?), p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean, p6: Int): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'NODE_USER' @ [225:58] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'NODE_USER' @ [225:69] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'locator' @ [225:99] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'isPreAcknowledge' @ [225:107] ==> public final var ServerLocator.isPreAcknowledge: Boolean[MyPropertyDescriptor]

'DEFAULT_ACK_BATCH_SIZE' @ [225:125] ==> public const final val DEFAULT_ACK_BATCH_SIZE: Int defined in org.apache.activemq.artemis.api.core.client.ActiveMQClient[JavaPropertyDescriptor]

'this' @ [226:13] ==> <this> defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[ReceiverParameterDescriptorImpl]

'session' @ [226:18] ==> public final var session: ClientSession? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'session' @ [226:28] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'session' @ [227:13] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'start' @ [227:21] ==> public abstract fun start(): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'session' @ [230:28] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'createProducer' @ [230:36] ==> public abstract fun createProducer(): (ClientProducer..ClientProducer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'this' @ [231:13] ==> <this> defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[ReceiverParameterDescriptorImpl]

'producer' @ [231:18] ==> public final var producer: ClientProducer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'producer' @ [231:29] ==> val producer: (ClientProducer..ClientProducer?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'p2pConsumer' @ [234:13] ==> public final var p2pConsumer: ClientConsumer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'makeP2PConsumer' @ [234:27] ==> private final fun makeP2PConsumer(session: ClientSession, networkMapOnly: Boolean): ClientConsumer defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'session' @ [234:43] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'networkMapRegistrationFuture' @ [235:13] ==> private final val networkMapRegistrationFuture: CordaFuture<Unit> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'thenMatch' @ [235:42] ==> public fun <V, W, X> CordaFuture<out Unit>.thenMatch(success: (Unit) -> Unit, failure: (Throwable) -> Unit): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit
    <W> -> Unit
    <X> -> Unit

'state' @ [236:17] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [236:23] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'log' @ [237:21] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'info' @ [237:25] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'p2pConsumer' @ [239:25] ==> public final var p2pConsumer: ClientConsumer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'close' @ [239:39] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientConsumer[JavaMethodDescriptor]

'p2pConsumer' @ [243:21] ==> public final var p2pConsumer: ClientConsumer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'makeP2PConsumer' @ [243:35] ==> private final fun makeP2PConsumer(session: ClientSession, networkMapOnly: Boolean): ClientConsumer defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'session' @ [243:51] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'rpcServer' @ [247:13] ==> public final var rpcServer: RPCServer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'RPCServer' @ [247:25] ==> public constructor RPCServer(ops: RPCOps, rpcServerUsername: String, rpcServerPassword: String, serverLocator: ServerLocator, userService: RPCUserService, nodeLegalName: X500Name, rpcConfiguration: RPCServerConfiguration = ...) defined in net.corda.node.services.messaging.RPCServer[ClassConstructorDescriptorImpl]

'rpcOps' @ [247:35] ==> value-parameter rpcOps: RPCOps defined in net.corda.node.services.messaging.NodeMessagingClient.start[ValueParameterDescriptorImpl]

'NODE_USER' @ [247:43] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'NODE_USER' @ [247:54] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'locator' @ [247:65] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'userService' @ [247:74] ==> value-parameter userService: RPCUserService defined in net.corda.node.services.messaging.NodeMessagingClient.start[ValueParameterDescriptorImpl]

'config' @ [247:87] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'myLegalName' @ [247:94] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'session' @ [250:21] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'queueQuery' @ [250:29] ==> public abstract fun queueQuery(p0: (SimpleString..SimpleString?)): (ClientSession.QueueQuery..ClientSession.QueueQuery?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'SimpleString' @ [250:40] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'VERIFICATION_REQUESTS_QUEUE_NAME' @ [250:53] ==> public final val VERIFICATION_REQUESTS_QUEUE_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyImportedFromObject]

'consumerCount' @ [250:88] ==> public final val ClientSession.QueueQuery.consumerCount: Int[MyPropertyDescriptor]

'log' @ [251:21] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'warn' @ [251:25] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'VERIFICATION_REQUESTS_QUEUE_NAME' @ [251:67] ==> public final val VERIFICATION_REQUESTS_QUEUE_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyImportedFromObject]

'config' @ [255:17] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'verifierType' @ [255:24] ==> public abstract val verifierType: VerifierType defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'OutOfProcess' @ [255:53] ==> enum entry OutOfProcess defined in net.corda.node.services.config.VerifierType[FakeCallableDescriptorForObject]

'createQueueIfAbsent' @ [256:17] ==> private final fun createQueueIfAbsent(queueName: String): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'VERIFICATION_REQUESTS_QUEUE_NAME' @ [256:49] ==> public final val VERIFICATION_REQUESTS_QUEUE_NAME: String defined in net.corda.nodeapi.VerifierApi[DeserializedPropertyDescriptor]

'createQueueIfAbsent' @ [257:17] ==> private final fun createQueueIfAbsent(queueName: String): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'verifierResponseAddress' @ [257:37] ==> private final val verifierResponseAddress: String defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'verificationResponseConsumer' @ [258:17] ==> public final var verificationResponseConsumer: ClientConsumer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'session' @ [258:48] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[LocalVariableDescriptor]

'createConsumer' @ [258:56] ==> public abstract fun createConsumer(p0: (String..String?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'verifierResponseAddress' @ [258:71] ==> private final val verifierResponseAddress: String defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'messagingExecutor' @ [259:17] ==> private final val messagingExecutor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'scheduleAtFixedRate' @ [259:35] ==> public final fun scheduleAtFixedRate(p0: (() -> Unit..(() -> Unit)?), p1: Long, p2: Long, p3: (TimeUnit..TimeUnit?)): (ScheduledFuture<*>..ScheduledFuture<*>?) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'checkVerifierCount' @ [259:57] ==> local final fun checkVerifierCount(): Unit defined in net.corda.node.services.messaging.NodeMessagingClient.start.<anonymous>[SimpleFunctionDescriptorImpl]

'SECONDS' @ [259:93] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'resumeMessageRedelivery' @ [263:9] ==> private final fun resumeMessageRedelivery(): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'if (networkMapOnly) {
            // Filter for just the network map messages.
            val messageFilter = "hyphenated_props:$topicProperty like 'platform.network_map.%'"
            session.createConsumer(P2P_QUEUE, messageFilter)
        } else
            session.createConsumer(P2P_QUEUE)' @ [272:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClientConsumer, elseBranch: ClientConsumer): ClientConsumer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClientConsumer

'networkMapOnly' @ [272:20] ==> value-parameter networkMapOnly: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.makeP2PConsumer[ValueParameterDescriptorImpl]

'topicProperty' @ [274:52] ==> private final val topicProperty: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'session' @ [275:13] ==> value-parameter session: ClientSession defined in net.corda.node.services.messaging.NodeMessagingClient.makeP2PConsumer[ValueParameterDescriptorImpl]

'createConsumer' @ [275:21] ==> public abstract fun createConsumer(p0: (String..String?), p1: (String..String?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'P2P_QUEUE' @ [275:36] ==> public const final val P2P_QUEUE: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'messageFilter' @ [275:47] ==> val messageFilter: String defined in net.corda.node.services.messaging.NodeMessagingClient.makeP2PConsumer[LocalVariableDescriptor]

'session' @ [277:13] ==> value-parameter session: ClientSession defined in net.corda.node.services.messaging.NodeMessagingClient.makeP2PConsumer[ValueParameterDescriptorImpl]

'createConsumer' @ [277:21] ==> public abstract fun createConsumer(p0: (String..String?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'P2P_QUEUE' @ [277:36] ==> public const final val P2P_QUEUE: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'messagesToRedeliver' @ [281:9] ==> private final val messagesToRedeliver: PersistentMap<Long, Pair<Message, MessageRecipients>, NodeMessagingClient.RetryMessage, Long> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'forEach' @ [281:29] ==> public final fun forEach(p0: (Long, Pair<Message, MessageRecipients>) -> Unit): Unit defined in net.corda.node.utilities.PersistentMap[MyFunctionDescriptor]

'component1' @ [282:23] ==> public final operator fun component1(): Message defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [282:32] ==> public final operator fun component2(): MessageRecipients defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'send' @ [282:43] ==> public open fun send(message: Message, target: MessageRecipients, retryId: Long?): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'message' @ [282:48] ==> val message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.resumeMessageRedelivery.<anonymous>[LocalVariableDescriptor]

'target' @ [282:57] ==> val target: MessageRecipients defined in net.corda.node.services.messaging.NodeMessagingClient.resumeMessageRedelivery.<anonymous>[LocalVariableDescriptor]

'retryId' @ [282:65] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.resumeMessageRedelivery.<anonymous>[ValueParameterDescriptorImpl]

'CountDownLatch' @ [286:33] ==> public constructor CountDownLatch(p0: Int) defined in java.util.concurrent.CountDownLatch[JavaClassConstructorDescriptor]

'?:' @ [297:45] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClientMessage?, right: ClientMessage): ClientMessage[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClientMessage

'consumer' @ [298:13] ==> value-parameter consumer: ClientConsumer defined in net.corda.node.services.messaging.NodeMessagingClient.processMessage[ValueParameterDescriptorImpl]

'receive' @ [298:22] ==> public abstract fun receive(): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientConsumer[JavaMethodDescriptor]

'artemisToCordaMessage' @ [303:41] ==> private final fun artemisToCordaMessage(message: ClientMessage): ReceivedMessage? defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'artemisMessage' @ [303:63] ==> val artemisMessage: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.processMessage[LocalVariableDescriptor]

'message' @ [304:13] ==> val message: ReceivedMessage? defined in net.corda.node.services.messaging.NodeMessagingClient.processMessage[LocalVariableDescriptor]

'deliver' @ [305:13] ==> private final fun deliver(msg: ReceivedMessage): Boolean defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'message' @ [305:21] ==> val message: ReceivedMessage? defined in net.corda.node.services.messaging.NodeMessagingClient.processMessage[LocalVariableDescriptor]

'state' @ [318:9] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [318:15] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> (ClientMessage..ClientMessage?)): (ClientMessage..ClientMessage?) defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> (org.apache.activemq.artemis.api.core.client.ClientMessage..org.apache.activemq.artemis.api.core.client.ClientMessage?)

'artemisMessage' @ [319:13] ==> val artemisMessage: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.processMessage[LocalVariableDescriptor]

'acknowledge' @ [319:28] ==> public abstract fun acknowledge(): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'state' @ [325:24] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [325:30] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> ClientConsumer): ClientConsumer defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> ClientConsumer

'check' @ [326:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'started' @ [326:19] ==> public final var started: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'check' @ [327:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [327:19] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'running' @ [327:20] ==> public final var running: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'running' @ [328:13] ==> public final var running: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'rpcServer' @ [329:13] ==> public final var rpcServer: RPCServer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'start' @ [329:25] ==> public final fun start(activeMqServerControl: ActiveMQServerControl): Unit defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'serverControl' @ [329:31] ==> value-parameter serverControl: ActiveMQServerControl defined in net.corda.node.services.messaging.NodeMessagingClient.runPreNetworkMap[ValueParameterDescriptorImpl]

'verifierService' @ [330:14] ==> public final val verifierService: TransactionVerifierService defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'start' @ [330:75] ==> public final fun start(responseConsumer: ClientConsumer): Unit defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[SimpleFunctionDescriptorImpl]

'verificationResponseConsumer' @ [330:81] ==> public final var verificationResponseConsumer: ClientConsumer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'p2pConsumer' @ [331:13] ==> public final var p2pConsumer: ClientConsumer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'!' @ [334:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'networkMapRegistrationFuture' @ [334:17] ==> private final val networkMapRegistrationFuture: CordaFuture<Unit> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'isDone' @ [334:46] ==> public final val <V> CordaFuture<Unit>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> Unit

'processMessage' @ [334:56] ==> private final fun processMessage(consumer: ClientConsumer): Boolean defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'consumer' @ [334:71] ==> val consumer: ClientConsumer defined in net.corda.node.services.messaging.NodeMessagingClient.runPreNetworkMap[LocalVariableDescriptor]

'with' @ [336:9] ==> @InlineOnly public inline fun <T, R> with(receiver: CordaFuture<Unit>, block: CordaFuture<Unit>.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<Unit>
    <R> -> Unit

'networkMapRegistrationFuture' @ [336:14] ==> private final val networkMapRegistrationFuture: CordaFuture<Unit> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'if (isDone) getOrThrow() else andForget(log)' @ [337:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDone' @ [337:17] ==> public final val <V> CordaFuture<Unit>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V> -> Unit

'getOrThrow' @ [337:25] ==> public fun <V> Future<Unit>.getOrThrow(timeout: Duration? = ...): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'andForget' @ [337:43] ==> public fun CordaFuture<*>.andForget(log: Logger): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]

'log' @ [337:53] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'state' @ [342:24] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [342:30] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> ClientConsumer): ClientConsumer defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> ClientConsumer

'p2pConsumer' @ [344:13] ==> public final var p2pConsumer: ClientConsumer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'processMessage' @ [347:16] ==> private final fun processMessage(consumer: ClientConsumer): Boolean defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'consumer' @ [347:31] ==> val consumer: ClientConsumer defined in net.corda.node.services.messaging.NodeMessagingClient.runPostNetworkMap[LocalVariableDescriptor]

'runPreNetworkMap' @ [361:13] ==> private final fun runPreNetworkMap(serverControl: ActiveMQServerControl): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'serverControl' @ [361:30] ==> value-parameter serverControl: ActiveMQServerControl defined in net.corda.node.services.messaging.NodeMessagingClient.run[ValueParameterDescriptorImpl]

'runPostNetworkMap' @ [363:13] ==> private final fun runPostNetworkMap(): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'shutdownLatch' @ [365:13] ==> private final val shutdownLatch: CountDownLatch defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'countDown' @ [365:27] ==> public open fun countDown(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'message' @ [371:25] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[ValueParameterDescriptorImpl]

'required' @ [371:33] ==> private final inline fun <T> ClientMessage.required(key: SimpleString, extractor: ClientMessage.(SimpleString) -> (String..String?)): (String..String?) defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'topicProperty' @ [371:42] ==> private final val topicProperty: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'getStringProperty' @ [371:59] ==> public abstract fun getStringProperty(p0: (SimpleString..SimpleString?)): (String..String?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'it' @ [371:77] ==> value-parameter it: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [372:29] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[ValueParameterDescriptorImpl]

'required' @ [372:37] ==> private final inline fun <T> ClientMessage.required(key: SimpleString, extractor: ClientMessage.(SimpleString) -> (Long..Long?)): (Long..Long?) defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Long..kotlin.Long?)

'sessionIdProperty' @ [372:46] ==> private final val sessionIdProperty: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'getLongProperty' @ [372:67] ==> public abstract fun getLongProperty(p0: (SimpleString..SimpleString?)): (Long..Long?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'it' @ [372:83] ==> value-parameter it: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage.<anonymous>[ValueParameterDescriptorImpl]

'requireNotNull' @ [373:24] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: String?, lazyMessage: () -> Any): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'message' @ [373:39] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[ValueParameterDescriptorImpl]

'getStringProperty' @ [373:47] ==> public abstract fun getStringProperty(p0: (SimpleString..SimpleString?)): (String..String?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'HDR_VALIDATED_USER' @ [373:65] ==> public final val HDR_VALIDATED_USER: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.Message[JavaPropertyDescriptor]

'message' @ [374:35] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[ValueParameterDescriptorImpl]

'required' @ [374:43] ==> private final inline fun <T> ClientMessage.required(key: SimpleString, extractor: ClientMessage.(SimpleString) -> (Int..Int?)): (Int..Int?) defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Int..kotlin.Int?)

'platformVersionProperty' @ [374:52] ==> private final val platformVersionProperty: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'getIntProperty' @ [374:79] ==> public abstract fun getIntProperty(p0: (SimpleString..SimpleString?)): (Int..Int?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'it' @ [374:94] ==> value-parameter it: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [376:24] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[ValueParameterDescriptorImpl]

'required' @ [376:32] ==> private final inline fun <T> ClientMessage.required(key: SimpleString, extractor: ClientMessage.(SimpleString) -> (UUID..UUID?)): (UUID..UUID?) defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (java.util.UUID..java.util.UUID?)

'HDR_DUPLICATE_DETECTION_ID' @ [376:41] ==> public final val HDR_DUPLICATE_DETECTION_ID: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.Message[JavaPropertyDescriptor]

'fromString' @ [376:76] ==> public open fun fromString(p0: (String..String?)): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'message' @ [376:87] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[ValueParameterDescriptorImpl]

'getStringProperty' @ [376:95] ==> public abstract fun getStringProperty(p0: (SimpleString..SimpleString?)): (String..String?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'it' @ [376:113] ==> value-parameter it: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [377:13] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'trace' @ [377:17] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'message' @ [377:51] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[ValueParameterDescriptorImpl]

'address' @ [377:59] ==> public final var ClientMessage.address: (String..String?)[MyPropertyDescriptor]

'user' @ [377:75] ==> val user: String defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'topic' @ [377:88] ==> val topic: (String..String?) defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'sessionID' @ [377:106] ==> val sessionID: (Long..Long?) defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'uuid' @ [377:123] ==> val uuid: (UUID..UUID?) defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'ArtemisReceivedMessage' @ [379:20] ==> public constructor ArtemisReceivedMessage(topicSession: TopicSession, peer: X500Name, platformVersion: Int, uniqueMessageId: UUID, message: ClientMessage) defined in net.corda.node.services.messaging.NodeMessagingClient.ArtemisReceivedMessage[ClassConstructorDescriptorImpl]

'TopicSession' @ [379:43] ==> public constructor TopicSession(topic: String, sessionID: Long = ...) defined in net.corda.node.services.messaging.TopicSession[ClassConstructorDescriptorImpl]

'topic' @ [379:56] ==> val topic: (String..String?) defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'sessionID' @ [379:63] ==> val sessionID: (Long..Long?) defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'X500Name' @ [379:75] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'user' @ [379:84] ==> val user: String defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'platformVersion' @ [379:91] ==> val platformVersion: (Int..Int?) defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'uuid' @ [379:108] ==> val uuid: (UUID..UUID?) defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'message' @ [379:114] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[ValueParameterDescriptorImpl]

'log' @ [381:13] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'error' @ [381:17] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'message' @ [381:65] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[ValueParameterDescriptorImpl]

'e' @ [381:75] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.messaging.NodeMessagingClient.artemisToCordaMessage[LocalVariableDescriptor]

'require' @ [387:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'containsProperty' @ [387:17] ==> public abstract fun containsProperty(p0: (SimpleString..SimpleString?)): Boolean defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'key' @ [387:34] ==> value-parameter key: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.required[ValueParameterDescriptorImpl]

'key' @ [387:52] ==> value-parameter key: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.required[ValueParameterDescriptorImpl]

'invoke' @ [388:16] ==> public abstract operator fun ClientMessage.invoke(p2: SimpleString): T defined in kotlin.Function2[FunctionInvokeDescriptor]

'key' @ [388:26] ==> value-parameter key: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.required[ValueParameterDescriptorImpl]

'getValue' @ [396:41] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'ByteArray' @ [396:48] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'message' @ [396:58] ==> private final val message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.ArtemisReceivedMessage[PropertyDescriptorImpl]

'bodySize' @ [396:66] ==> public final val ClientMessage.bodySize: Int[MyPropertyDescriptor]

'apply' @ [396:76] ==> @InlineOnly public inline fun <T> ByteArray.apply(block: ByteArray.() -> Unit): ByteArray defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'message' @ [396:84] ==> private final val message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.ArtemisReceivedMessage[PropertyDescriptorImpl]

'bodyBuffer' @ [396:92] ==> public final val ClientMessage.bodyBuffer: (ActiveMQBuffer..ActiveMQBuffer?)[MyPropertyDescriptor]

'readBytes' @ [396:103] ==> public abstract fun readBytes(p0: (ByteArray..ByteArray?)): Unit defined in org.apache.activemq.artemis.api.core.ActiveMQBuffer[JavaMethodDescriptor]

'this' @ [396:113] ==> <this> defined in net.corda.node.services.messaging.NodeMessagingClient.ArtemisReceivedMessage.data.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ofEpochMilli' @ [397:62] ==> public open fun ofEpochMilli(p0: Long): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'message' @ [397:75] ==> private final val message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.ArtemisReceivedMessage[PropertyDescriptorImpl]

'timestamp' @ [397:83] ==> public final var ClientMessage.timestamp: Long[MyPropertyDescriptor]

'topicSession' @ [398:38] ==> public open val topicSession: TopicSession defined in net.corda.node.services.messaging.NodeMessagingClient.ArtemisReceivedMessage[PropertyDescriptorImpl]

'topic' @ [398:51] ==> public final val topic: String defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'data' @ [398:60] ==> public open val data: ByteArray defined in net.corda.node.services.messaging.NodeMessagingClient.ArtemisReceivedMessage[PropertyDescriptorImpl]

'sequence' @ [398:65] ==> public fun ByteArray.sequence(offset: Int = ..., size: Int = ...): ByteSequence defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'state' @ [402:9] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'checkNotLocked' @ [402:15] ==> public final fun checkNotLocked(): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]

'handlers' @ [405:25] ==> private final val handlers: CopyOnWriteArrayList<NodeMessagingClient.Handler> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'filter' @ [405:34] ==> public inline fun <T> Iterable<(NodeMessagingClient.Handler..NodeMessagingClient.Handler?)>.filter(predicate: ((NodeMessagingClient.Handler..NodeMessagingClient.Handler?)) -> Boolean): List<(NodeMessagingClient.Handler..NodeMessagingClient.Handler?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.messaging.NodeMessagingClient.Handler..net.corda.node.services.messaging.NodeMessagingClient.Handler?)

'it' @ [405:43] ==> value-parameter it: (NodeMessagingClient.Handler..NodeMessagingClient.Handler?) defined in net.corda.node.services.messaging.NodeMessagingClient.deliver.<anonymous>[ValueParameterDescriptorImpl]

'topicSession' @ [405:46] ==> public final val topicSession: TopicSession defined in net.corda.node.services.messaging.NodeMessagingClient.Handler[PropertyDescriptorImpl]

'isBlank' @ [405:59] ==> public final fun isBlank(): Boolean defined in net.corda.node.services.messaging.TopicSession[SimpleFunctionDescriptorImpl]

'it' @ [405:72] ==> value-parameter it: (NodeMessagingClient.Handler..NodeMessagingClient.Handler?) defined in net.corda.node.services.messaging.NodeMessagingClient.deliver.<anonymous>[ValueParameterDescriptorImpl]

'topicSession' @ [405:75] ==> public final val topicSession: TopicSession defined in net.corda.node.services.messaging.NodeMessagingClient.Handler[PropertyDescriptorImpl]

'msg' @ [405:91] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[ValueParameterDescriptorImpl]

'topicSession' @ [405:95] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'nodeExecutor' @ [415:13] ==> private final val nodeExecutor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'fetchFrom' @ [415:26] ==> public open fun <T> fetchFrom(fetcher: () -> Unit): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'database' @ [416:17] ==> public final val database: CordaPersistence defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'transaction' @ [416:26] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'if (msg.uniqueMessageId in processedMessages) {
                        log.trace { "Discard duplicate message ${msg.uniqueMessageId} for ${msg.topicSession}" }
                    } else {
                        if (deliverTo.isEmpty()) {
                            // TODO: Implement dead letter queue, and send it there.
                            log.warn("Received message ${msg.uniqueMessageId} for ${msg.topicSession} that doesn't have any registered handlers yet")
                        } else {
                            callHandlers(msg, deliverTo)
                        }
                        // TODO We will at some point need to decide a trimming policy for the id's
                        processedMessages[msg.uniqueMessageId] = Instant.now()
                    }' @ [417:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'msg' @ [417:25] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[ValueParameterDescriptorImpl]

'uniqueMessageId' @ [417:29] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'processedMessages' @ [417:48] ==> private final val processedMessages: AppendOnlyPersistentMap<UUID, Instant, NodeMessagingClient.ProcessedMessage, String> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'log' @ [418:25] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'trace' @ [418:29] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'msg' @ [418:66] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[ValueParameterDescriptorImpl]

'uniqueMessageId' @ [418:70] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'msg' @ [418:93] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[ValueParameterDescriptorImpl]

'topicSession' @ [418:97] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'if (deliverTo.isEmpty()) {
                            // TODO: Implement dead letter queue, and send it there.
                            log.warn("Received message ${msg.uniqueMessageId} for ${msg.topicSession} that doesn't have any registered handlers yet")
                        } else {
                            callHandlers(msg, deliverTo)
                        }' @ [420:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'deliverTo' @ [420:29] ==> val deliverTo: List<(NodeMessagingClient.Handler..NodeMessagingClient.Handler?)> defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[LocalVariableDescriptor]

'isEmpty' @ [420:39] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [422:29] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'warn' @ [422:33] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'msg' @ [422:58] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[ValueParameterDescriptorImpl]

'uniqueMessageId' @ [422:62] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'msg' @ [422:85] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[ValueParameterDescriptorImpl]

'topicSession' @ [422:89] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'callHandlers' @ [424:29] ==> private final fun callHandlers(msg: ReceivedMessage, deliverTo: List<NodeMessagingClient.Handler>): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'msg' @ [424:42] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[ValueParameterDescriptorImpl]

'deliverTo' @ [424:47] ==> val deliverTo: List<(NodeMessagingClient.Handler..NodeMessagingClient.Handler?)> defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[LocalVariableDescriptor]

'processedMessages' @ [427:25] ==> private final val processedMessages: AppendOnlyPersistentMap<UUID, Instant, NodeMessagingClient.ProcessedMessage, String> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'msg' @ [427:43] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[ValueParameterDescriptorImpl]

'uniqueMessageId' @ [427:47] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'now' @ [427:74] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'log' @ [432:13] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'error' @ [432:17] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'msg' @ [432:80] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[ValueParameterDescriptorImpl]

'topicSession' @ [432:84] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'e' @ [432:100] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.messaging.NodeMessagingClient.deliver[LocalVariableDescriptor]

'deliverTo' @ [438:25] ==> value-parameter deliverTo: List<NodeMessagingClient.Handler> defined in net.corda.node.services.messaging.NodeMessagingClient.callHandlers[ValueParameterDescriptorImpl]

'handler' @ [439:13] ==> val handler: NodeMessagingClient.Handler defined in net.corda.node.services.messaging.NodeMessagingClient.callHandlers[LocalVariableDescriptor]

'invoke' @ [439:21] ==> public abstract operator fun invoke(p1: ReceivedMessage, p2: MessageHandlerRegistration): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'msg' @ [439:30] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.NodeMessagingClient.callHandlers[ValueParameterDescriptorImpl]

'handler' @ [439:35] ==> val handler: NodeMessagingClient.Handler defined in net.corda.node.services.messaging.NodeMessagingClient.callHandlers[LocalVariableDescriptor]

'state' @ [444:23] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [444:29] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> Boolean): Boolean defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'check' @ [446:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'started' @ [446:19] ==> public final var started: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'running' @ [447:31] ==> public final var running: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'running' @ [448:13] ==> public final var running: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'p2pConsumer' @ [449:21] ==> public final var p2pConsumer: ClientConsumer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'IllegalStateException' @ [449:42] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'c' @ [451:17] ==> val c: ClientConsumer defined in net.corda.node.services.messaging.NodeMessagingClient.stop.<anonymous>[LocalVariableDescriptor]

'close' @ [451:19] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientConsumer[JavaMethodDescriptor]

'p2pConsumer' @ [455:13] ==> public final var p2pConsumer: ClientConsumer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'prevRunning' @ [456:13] ==> val prevRunning: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.stop.<anonymous>[LocalVariableDescriptor]

'running' @ [458:13] ==> val running: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.stop[LocalVariableDescriptor]

'!' @ [458:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nodeExecutor' @ [458:25] ==> private final val nodeExecutor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'isOnThread' @ [458:38] ==> public open val isOnThread: Boolean defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[PropertyDescriptorImpl]

'shutdownLatch' @ [460:13] ==> private final val shutdownLatch: CountDownLatch defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'await' @ [460:27] ==> public open fun await(): Unit defined in java.util.concurrent.CountDownLatch[JavaMethodDescriptor]

'running' @ [463:13] ==> val running: Boolean defined in net.corda.node.services.messaging.NodeMessagingClient.stop[LocalVariableDescriptor]

'state' @ [464:13] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [464:19] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'producer' @ [465:17] ==> public final var producer: ClientProducer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'close' @ [465:27] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientProducer[JavaMethodDescriptor]

'producer' @ [466:17] ==> public final var producer: ClientProducer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'session' @ [468:17] ==> public final var session: ClientSession? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'commit' @ [468:27] ==> public abstract fun commit(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'sessionFactory' @ [470:17] ==> public final var sessionFactory: ClientSessionFactory? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'close' @ [470:34] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'sessionFactory' @ [471:17] ==> public final var sessionFactory: ClientSessionFactory? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'messagingExecutor' @ [479:9] ==> private final val messagingExecutor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'fetchFrom' @ [479:27] ==> public open fun <T> fetchFrom(fetcher: () -> Unit?): Unit? defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit?

'state' @ [480:13] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [480:19] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> Unit?): Unit? defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit?

'getMQAddress' @ [481:33] ==> private final fun getMQAddress(target: MessageRecipients): String defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'target' @ [481:46] ==> value-parameter target: MessageRecipients defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'session' @ [482:38] ==> public final var session: ClientSession? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'createMessage' @ [482:48] ==> public abstract fun createMessage(p0: Boolean): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'apply' @ [482:68] ==> @InlineOnly public inline fun <T> (ClientMessage..ClientMessage?).apply(block: (ClientMessage..ClientMessage?).() -> Unit): (ClientMessage..ClientMessage?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.apache.activemq.artemis.api.core.client.ClientMessage..org.apache.activemq.artemis.api.core.client.ClientMessage?)

'putStringProperty' @ [483:21] ==> public abstract fun putStringProperty(p0: (SimpleString..SimpleString?), p1: (SimpleString..SimpleString?)): (Message..Message?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'cordaVendorProperty' @ [483:39] ==> private final val cordaVendorProperty: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'cordaVendor' @ [483:60] ==> private final val cordaVendor: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'putStringProperty' @ [484:21] ==> public abstract fun putStringProperty(p0: (SimpleString..SimpleString?), p1: (SimpleString..SimpleString?)): (Message..Message?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'releaseVersionProperty' @ [484:39] ==> private final val releaseVersionProperty: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'releaseVersion' @ [484:63] ==> private final val releaseVersion: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'putIntProperty' @ [485:21] ==> public abstract fun putIntProperty(p0: (SimpleString..SimpleString?), p1: Int): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'platformVersionProperty' @ [485:36] ==> private final val platformVersionProperty: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'versionInfo' @ [485:61] ==> private final val versionInfo: VersionInfo defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'platformVersion' @ [485:73] ==> public final val platformVersion: Int defined in net.corda.node.VersionInfo[PropertyDescriptorImpl]

'putStringProperty' @ [486:21] ==> public abstract fun putStringProperty(p0: (SimpleString..SimpleString?), p1: (SimpleString..SimpleString?)): (Message..Message?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'topicProperty' @ [486:39] ==> private final val topicProperty: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'SimpleString' @ [486:54] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'message' @ [486:67] ==> value-parameter message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'topicSession' @ [486:75] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[PropertyDescriptorImpl]

'topic' @ [486:88] ==> public final val topic: String defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'putLongProperty' @ [487:21] ==> public abstract fun putLongProperty(p0: (SimpleString..SimpleString?), p1: Long): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'sessionIdProperty' @ [487:37] ==> private final val sessionIdProperty: SimpleString defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'message' @ [487:56] ==> value-parameter message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'topicSession' @ [487:64] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[PropertyDescriptorImpl]

'sessionID' @ [487:77] ==> public final val sessionID: Long defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'writeBodyBufferBytes' @ [488:21] ==> public abstract fun writeBodyBufferBytes(p0: (ByteArray..ByteArray?)): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'message' @ [488:42] ==> value-parameter message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'data' @ [488:50] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.Message[PropertyDescriptorImpl]

'putStringProperty' @ [490:21] ==> public abstract fun putStringProperty(p0: (SimpleString..SimpleString?), p1: (SimpleString..SimpleString?)): (Message..Message?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'HDR_DUPLICATE_DETECTION_ID' @ [490:39] ==> public final val HDR_DUPLICATE_DETECTION_ID: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.Message[JavaPropertyDescriptor]

'SimpleString' @ [490:67] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'message' @ [490:80] ==> value-parameter message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'uniqueMessageId' @ [490:88] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.Message[PropertyDescriptorImpl]

'toString' @ [490:104] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'amqDelayMillis' @ [493:25] ==> private final val amqDelayMillis: Int defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'message' @ [493:47] ==> value-parameter message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'topicSession' @ [493:55] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[PropertyDescriptorImpl]

'topic' @ [493:68] ==> public final val topic: String defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'sessionTopic' @ [493:97] ==> internal final val sessionTopic: TopicSession defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'topic' @ [493:110] ==> public final val topic: String defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'putLongProperty' @ [494:25] ==> public abstract fun putLongProperty(p0: (SimpleString..SimpleString?), p1: Long): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'HDR_SCHEDULED_DELIVERY_TIME' @ [494:41] ==> public final val HDR_SCHEDULED_DELIVERY_TIME: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.Message[JavaPropertyDescriptor]

'+' @ [494:70] ==> public final operator fun plus(other: Int): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'currentTimeMillis' @ [494:77] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'amqDelayMillis' @ [494:99] ==> private final val amqDelayMillis: Int defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'log' @ [497:17] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'trace' @ [497:21] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'+' @ [498:21] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'mqAddress' @ [498:32] ==> val mqAddress: String defined in net.corda.node.services.messaging.NodeMessagingClient.send.<anonymous>.<anonymous>[LocalVariableDescriptor]

'message' @ [498:51] ==> value-parameter message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'topicSession' @ [498:59] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[PropertyDescriptorImpl]

'topic' @ [498:72] ==> public final val topic: String defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'message' @ [499:43] ==> value-parameter message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'topicSession' @ [499:51] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[PropertyDescriptorImpl]

'sessionID' @ [499:64] ==> public final val sessionID: Long defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'message' @ [499:83] ==> value-parameter message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'uniqueMessageId' @ [499:91] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.Message[PropertyDescriptorImpl]

'producer' @ [501:17] ==> public final var producer: ClientProducer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'send' @ [501:28] ==> public abstract fun send(p0: (String..String?), p1: (Message..Message?)): Unit defined in org.apache.activemq.artemis.api.core.client.ClientProducer[JavaMethodDescriptor]

'mqAddress' @ [501:33] ==> val mqAddress: String defined in net.corda.node.services.messaging.NodeMessagingClient.send.<anonymous>.<anonymous>[LocalVariableDescriptor]

'artemisMessage' @ [501:44] ==> val artemisMessage: (ClientMessage..ClientMessage?) defined in net.corda.node.services.messaging.NodeMessagingClient.send.<anonymous>.<anonymous>[LocalVariableDescriptor]

'retryId' @ [503:17] ==> value-parameter retryId: Long? defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'let' @ [503:26] ==> @InlineOnly public inline fun <T, R> Long.let(block: (Long) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Long
    <R> -> Unit

'database' @ [504:21] ==> public final val database: CordaPersistence defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'transaction' @ [504:30] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Pair<Message, MessageRecipients>): Pair<Message, MessageRecipients> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<Message, MessageRecipients>

'messagesToRedeliver' @ [505:25] ==> private final val messagesToRedeliver: PersistentMap<Long, Pair<Message, MessageRecipients>, NodeMessagingClient.RetryMessage, Long> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'computeIfAbsent' @ [505:45] ==> public final fun computeIfAbsent(p0: Long, p1: (Long) -> Pair<Message, MessageRecipients>): Pair<Message, MessageRecipients> defined in net.corda.node.utilities.PersistentMap[MyFunctionDescriptor]

'it' @ [505:61] ==> value-parameter it: Long defined in net.corda.node.services.messaging.NodeMessagingClient.send.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Pair' @ [505:67] ==> public constructor Pair<out A, out B>(first: Message, second: MessageRecipients) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Message
    <out B> -> MessageRecipients

'message' @ [505:72] ==> value-parameter message: Message defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'target' @ [505:81] ==> value-parameter target: MessageRecipients defined in net.corda.node.services.messaging.NodeMessagingClient.send[ValueParameterDescriptorImpl]

'scheduledMessageRedeliveries' @ [507:21] ==> private final val scheduledMessageRedeliveries: ConcurrentHashMap<Long, ScheduledFuture<*>> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'it' @ [507:50] ==> value-parameter it: Long defined in net.corda.node.services.messaging.NodeMessagingClient.send.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'messagingExecutor' @ [507:56] ==> private final val messagingExecutor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'schedule' @ [507:74] ==> public final fun schedule(p0: (() -> Unit..(() -> Unit)?), p1: Long, p2: (TimeUnit..TimeUnit?)): (ScheduledFuture<*>..ScheduledFuture<*>?) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'sendWithRetry' @ [508:25] ==> private final fun sendWithRetry(retryCount: Int, address: String, message: ClientMessage, retryId: Long): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'mqAddress' @ [508:42] ==> val mqAddress: String defined in net.corda.node.services.messaging.NodeMessagingClient.send.<anonymous>.<anonymous>[LocalVariableDescriptor]

'artemisMessage' @ [508:53] ==> val artemisMessage: (ClientMessage..ClientMessage?) defined in net.corda.node.services.messaging.NodeMessagingClient.send.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [508:69] ==> value-parameter it: Long defined in net.corda.node.services.messaging.NodeMessagingClient.send.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'config' @ [509:24] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'messageRedeliveryDelaySeconds' @ [509:31] ==> public abstract val messageRedeliveryDelaySeconds: Int defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'toLong' @ [509:61] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SECONDS' @ [509:80] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'putStringProperty' @ [518:13] ==> public abstract fun putStringProperty(p0: (SimpleString..SimpleString?), p1: (SimpleString..SimpleString?)): (Message..Message?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'HDR_DUPLICATE_DETECTION_ID' @ [518:31] ==> public final val HDR_DUPLICATE_DETECTION_ID: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.Message[JavaPropertyDescriptor]

'SimpleString' @ [518:59] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'randomUUID' @ [518:77] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'toString' @ [518:90] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'log' @ [521:9] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'trace' @ [521:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'retryCount' @ [521:44] ==> value-parameter retryCount: Int defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'retryId' @ [521:77] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'retryCount' @ [522:13] ==> value-parameter retryCount: Int defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'messageMaxRetryCount' @ [522:27] ==> private final val messageMaxRetryCount: Int defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'log' @ [523:13] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'warn' @ [523:17] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'messageMaxRetryCount' @ [523:63] ==> private final val messageMaxRetryCount: Int defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'message' @ [523:98] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'address' @ [523:121] ==> value-parameter address: String defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'scheduledMessageRedeliveries' @ [524:13] ==> private final val scheduledMessageRedeliveries: ConcurrentHashMap<Long, ScheduledFuture<*>> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'remove' @ [524:42] ==> public open fun remove(key: Long): ScheduledFuture<*>? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'retryId' @ [524:49] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'message' @ [528:9] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'randomiseDuplicateId' @ [528:17] ==> local final fun ClientMessage.randomiseDuplicateId(): Unit defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[SimpleFunctionDescriptorImpl]

'state' @ [530:9] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [530:15] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'log' @ [531:13] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'trace' @ [531:17] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'retryCount' @ [531:34] ==> value-parameter retryCount: Int defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'message' @ [531:62] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'address' @ [531:74] ==> value-parameter address: String defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'retryId' @ [531:87] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'producer' @ [532:13] ==> public final var producer: ClientProducer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'send' @ [532:24] ==> public abstract fun send(p0: (String..String?), p1: (Message..Message?)): Unit defined in org.apache.activemq.artemis.api.core.client.ClientProducer[JavaMethodDescriptor]

'address' @ [532:29] ==> value-parameter address: String defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'message' @ [532:38] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'scheduledMessageRedeliveries' @ [535:9] ==> private final val scheduledMessageRedeliveries: ConcurrentHashMap<Long, ScheduledFuture<*>> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'retryId' @ [535:38] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'messagingExecutor' @ [535:49] ==> private final val messagingExecutor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'schedule' @ [535:67] ==> public final fun schedule(p0: (() -> Unit..(() -> Unit)?), p1: Long, p2: (TimeUnit..TimeUnit?)): (ScheduledFuture<*>..ScheduledFuture<*>?) defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[MyFunctionDescriptor]

'sendWithRetry' @ [536:13] ==> private final fun sendWithRetry(retryCount: Int, address: String, message: ClientMessage, retryId: Long): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'retryCount' @ [536:27] ==> value-parameter retryCount: Int defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'address' @ [536:43] ==> value-parameter address: String defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'message' @ [536:52] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'retryId' @ [536:61] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.sendWithRetry[ValueParameterDescriptorImpl]

'config' @ [537:12] ==> public open val config: NodeConfiguration defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'messageRedeliveryDelaySeconds' @ [537:19] ==> public abstract val messageRedeliveryDelaySeconds: Int defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'toLong' @ [537:49] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SECONDS' @ [537:68] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'database' @ [541:9] ==> public final val database: CordaPersistence defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'transaction' @ [541:18] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Pair<Message, MessageRecipients>?): Pair<Message, MessageRecipients>? defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Pair<Message, MessageRecipients>?

'messagesToRedeliver' @ [542:13] ==> private final val messagesToRedeliver: PersistentMap<Long, Pair<Message, MessageRecipients>, NodeMessagingClient.RetryMessage, Long> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'remove' @ [542:33] ==> public open fun remove(key: Long): Pair<Message, MessageRecipients>? defined in net.corda.node.utilities.PersistentMap[SimpleFunctionDescriptorImpl]

'retryId' @ [542:40] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.cancelRedelivery[ValueParameterDescriptorImpl]

'scheduledMessageRedeliveries' @ [544:9] ==> private final val scheduledMessageRedeliveries: ConcurrentHashMap<Long, ScheduledFuture<*>> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'retryId' @ [544:38] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.cancelRedelivery[ValueParameterDescriptorImpl]

'let' @ [544:48] ==> @InlineOnly public inline fun <T, R> ScheduledFuture<*>.let(block: (ScheduledFuture<*>) -> ScheduledFuture<*>?): ScheduledFuture<*>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScheduledFuture<*>
    <R> -> ScheduledFuture<*>?

'log' @ [545:13] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'trace' @ [545:17] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'retryId' @ [545:70] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.cancelRedelivery[ValueParameterDescriptorImpl]

'!' @ [546:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [546:18] ==> value-parameter it: ScheduledFuture<*> defined in net.corda.node.services.messaging.NodeMessagingClient.cancelRedelivery.<anonymous>[ValueParameterDescriptorImpl]

'isDone' @ [546:21] ==> public final val <V : (Any..Any?)> ScheduledFuture<out (Any..Any?)>.isDone: Boolean[MyPropertyDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Captured(*)

'it' @ [546:29] ==> value-parameter it: ScheduledFuture<*> defined in net.corda.node.services.messaging.NodeMessagingClient.cancelRedelivery.<anonymous>[ValueParameterDescriptorImpl]

'cancel' @ [546:32] ==> public abstract fun cancel(p0: Boolean): Boolean defined in java.util.concurrent.ScheduledFuture[JavaMethodDescriptor]

'scheduledMessageRedeliveries' @ [547:13] ==> private final val scheduledMessageRedeliveries: ConcurrentHashMap<Long, ScheduledFuture<*>> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'remove' @ [547:42] ==> public open fun remove(key: Long): ScheduledFuture<*>? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'retryId' @ [547:49] ==> value-parameter retryId: Long defined in net.corda.node.services.messaging.NodeMessagingClient.cancelRedelivery[ValueParameterDescriptorImpl]

'if (target == myAddress) {
            // If we are sending to ourselves then route the message directly to our P2P queue.
            P2P_QUEUE
        } else {
            // Otherwise we send the message to an internal queue for the target residing on our broker. It's then the
            // broker's job to route the message to the target's P2P queue.
            val internalTargetQueue = (target as? ArtemisAddress)?.queueName ?: throw IllegalArgumentException("Not an Artemis address")
            createQueueIfAbsent(internalTargetQueue)
            internalTargetQueue
        }' @ [552:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'target' @ [552:20] ==> value-parameter target: MessageRecipients defined in net.corda.node.services.messaging.NodeMessagingClient.getMQAddress[ValueParameterDescriptorImpl]

'myAddress' @ [552:30] ==> public open val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'P2P_QUEUE' @ [554:13] ==> public const final val P2P_QUEUE: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[DeserializedPropertyDescriptor]

'?:' @ [558:39] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'target' @ [558:40] ==> value-parameter target: MessageRecipients defined in net.corda.node.services.messaging.NodeMessagingClient.getMQAddress[ValueParameterDescriptorImpl]

'queueName' @ [558:68] ==> public abstract val queueName: String defined in net.corda.nodeapi.ArtemisMessagingComponent.ArtemisAddress[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [558:87] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'createQueueIfAbsent' @ [559:13] ==> private final fun createQueueIfAbsent(queueName: String): Unit defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'internalTargetQueue' @ [559:33] ==> val internalTargetQueue: String defined in net.corda.node.services.messaging.NodeMessagingClient.getMQAddress[LocalVariableDescriptor]

'internalTargetQueue' @ [560:13] ==> val internalTargetQueue: String defined in net.corda.node.services.messaging.NodeMessagingClient.getMQAddress[LocalVariableDescriptor]

'state' @ [566:9] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'alreadyLocked' @ [566:15] ==> public final inline fun <R> alreadyLocked(body: NodeMessagingClient.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'session' @ [567:30] ==> public final var session: ClientSession? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'queueQuery' @ [567:40] ==> public abstract fun queueQuery(p0: (SimpleString..SimpleString?)): (ClientSession.QueueQuery..ClientSession.QueueQuery?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'SimpleString' @ [567:51] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'queueName' @ [567:64] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.NodeMessagingClient.createQueueIfAbsent[ValueParameterDescriptorImpl]

'!' @ [568:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'queueQuery' @ [568:18] ==> val queueQuery: (ClientSession.QueueQuery..ClientSession.QueueQuery?) defined in net.corda.node.services.messaging.NodeMessagingClient.createQueueIfAbsent.<anonymous>[LocalVariableDescriptor]

'isExists' @ [568:29] ==> public final val ClientSession.QueueQuery.isExists: Boolean[MyPropertyDescriptor]

'log' @ [569:17] ==> private final val log: Logger defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'info' @ [569:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'queueName' @ [569:47] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.NodeMessagingClient.createQueueIfAbsent[ValueParameterDescriptorImpl]

'session' @ [570:17] ==> public final var session: ClientSession? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'createQueue' @ [570:27] ==> public abstract fun createQueue(p0: (String..String?), p1: (RoutingType..RoutingType?), p2: (String..String?), p3: Boolean): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'queueName' @ [570:39] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.NodeMessagingClient.createQueueIfAbsent[ValueParameterDescriptorImpl]

'MULTICAST' @ [570:62] ==> enum entry MULTICAST defined in org.apache.activemq.artemis.api.core.RoutingType[FakeCallableDescriptorForObject]

'queueName' @ [570:73] ==> value-parameter queueName: String defined in net.corda.node.services.messaging.NodeMessagingClient.createQueueIfAbsent[ValueParameterDescriptorImpl]

'addMessageHandler' @ [578:16] ==> public open fun addMessageHandler(topicSession: TopicSession, callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.NodeMessagingClient[SimpleFunctionDescriptorImpl]

'TopicSession' @ [578:34] ==> public constructor TopicSession(topic: String, sessionID: Long = ...) defined in net.corda.node.services.messaging.TopicSession[ClassConstructorDescriptorImpl]

'topic' @ [578:47] ==> value-parameter topic: String defined in net.corda.node.services.messaging.NodeMessagingClient.addMessageHandler[ValueParameterDescriptorImpl]

'sessionID' @ [578:54] ==> value-parameter sessionID: Long defined in net.corda.node.services.messaging.NodeMessagingClient.addMessageHandler[ValueParameterDescriptorImpl]

'callback' @ [578:66] ==> value-parameter callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit defined in net.corda.node.services.messaging.NodeMessagingClient.addMessageHandler[ValueParameterDescriptorImpl]

'require' @ [583:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [583:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'topicSession' @ [583:18] ==> value-parameter topicSession: TopicSession defined in net.corda.node.services.messaging.NodeMessagingClient.addMessageHandler[ValueParameterDescriptorImpl]

'isBlank' @ [583:31] ==> public final fun isBlank(): Boolean defined in net.corda.node.services.messaging.TopicSession[SimpleFunctionDescriptorImpl]

'Handler' @ [584:23] ==> public constructor Handler(topicSession: TopicSession, callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit) defined in net.corda.node.services.messaging.NodeMessagingClient.Handler[ClassConstructorDescriptorImpl]

'topicSession' @ [584:31] ==> value-parameter topicSession: TopicSession defined in net.corda.node.services.messaging.NodeMessagingClient.addMessageHandler[ValueParameterDescriptorImpl]

'callback' @ [584:45] ==> value-parameter callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit defined in net.corda.node.services.messaging.NodeMessagingClient.addMessageHandler[ValueParameterDescriptorImpl]

'handlers' @ [585:9] ==> private final val handlers: CopyOnWriteArrayList<NodeMessagingClient.Handler> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'add' @ [585:18] ==> public open fun add(element: (NodeMessagingClient.Handler..NodeMessagingClient.Handler?)): Boolean defined in java.util.concurrent.CopyOnWriteArrayList[JavaMethodDescriptor]

'handler' @ [585:22] ==> val handler: NodeMessagingClient.Handler defined in net.corda.node.services.messaging.NodeMessagingClient.addMessageHandler[LocalVariableDescriptor]

'handler' @ [586:16] ==> val handler: NodeMessagingClient.Handler defined in net.corda.node.services.messaging.NodeMessagingClient.addMessageHandler[LocalVariableDescriptor]

'handlers' @ [590:9] ==> private final val handlers: CopyOnWriteArrayList<NodeMessagingClient.Handler> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'remove' @ [590:18] ==> @InlineOnly public inline fun <@OnlyInputTypes T> MutableCollection<out (MessageHandlerRegistration..MessageHandlerRegistration?)>.remove(element: (MessageHandlerRegistration..MessageHandlerRegistration?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (net.corda.node.services.messaging.MessageHandlerRegistration..net.corda.node.services.messaging.MessageHandlerRegistration?)

'registration' @ [590:25] ==> value-parameter registration: MessageHandlerRegistration defined in net.corda.node.services.messaging.NodeMessagingClient.removeMessageHandler[ValueParameterDescriptorImpl]

'topicSession' @ [596:55] ==> value-parameter topicSession: TopicSession defined in net.corda.node.services.messaging.NodeMessagingClient.createMessage[ValueParameterDescriptorImpl]

'data' @ [597:44] ==> value-parameter data: ByteArray defined in net.corda.node.services.messaging.NodeMessagingClient.createMessage[ValueParameterDescriptorImpl]

'now' @ [598:60] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'uuid' @ [599:50] ==> value-parameter uuid: UUID defined in net.corda.node.services.messaging.NodeMessagingClient.createMessage[ValueParameterDescriptorImpl]

'topicSession' @ [600:41] ==> value-parameter topicSession: TopicSession defined in net.corda.node.services.messaging.NodeMessagingClient.createMessage[ValueParameterDescriptorImpl]

'String' @ [600:56] ==> @InlineOnly public inline fun String(bytes: ByteArray): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'data' @ [600:63] ==> value-parameter data: ByteArray defined in net.corda.node.services.messaging.NodeMessagingClient.createMessage[ValueParameterDescriptorImpl]

'OutOfProcessTransactionVerifierService' @ [605:25] ==> public constructor OutOfProcessTransactionVerifierService(monitoringService: MonitoringService) defined in net.corda.node.services.transactions.OutOfProcessTransactionVerifierService[ClassConstructorDescriptorImpl]

'monitoringService' @ [605:64] ==> public final val monitoringService: MonitoringService defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'messagingExecutor' @ [607:17] ==> private final val messagingExecutor: AffinityExecutor.ServiceAffinityExecutor defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'fetchFrom' @ [607:35] ==> public open fun <T> fetchFrom(fetcher: () -> Unit): Unit defined in net.corda.node.utilities.AffinityExecutor.ServiceAffinityExecutor[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'state' @ [608:21] ==> private final val state: ThreadBox<NodeMessagingClient.InnerState> defined in net.corda.node.services.messaging.NodeMessagingClient[PropertyDescriptorImpl]

'locked' @ [608:27] ==> public final inline fun <R> locked(body: NodeMessagingClient.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'session' @ [609:39] ==> public final var session: ClientSession? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'createMessage' @ [609:49] ==> public abstract fun createMessage(p0: Boolean): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'VerifierApi' @ [610:39] ==> public object VerifierApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'VerificationRequest' @ [610:51] ==> public constructor VerificationRequest(verificationId: Long, transaction: LedgerTransaction, responseAddress: SimpleString) defined in net.corda.nodeapi.VerifierApi.VerificationRequest[DeserializedClassConstructorDescriptor]

'nonce' @ [610:71] ==> value-parameter nonce: Long defined in net.corda.node.services.messaging.NodeMessagingClient.createOutOfProcessVerifierService.<no name provided>.sendRequest[ValueParameterDescriptorImpl]

'transaction' @ [610:78] ==> value-parameter transaction: LedgerTransaction defined in net.corda.node.services.messaging.NodeMessagingClient.createOutOfProcessVerifierService.<no name provided>.sendRequest[ValueParameterDescriptorImpl]

'SimpleString' @ [610:91] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'verifierResponseAddress' @ [610:104] ==> private final val verifierResponseAddress: String defined in net.corda.node.services.messaging.NodeMessagingClient.Companion[PropertyDescriptorImpl]

'request' @ [611:25] ==> val request: VerifierApi.VerificationRequest defined in net.corda.node.services.messaging.NodeMessagingClient.createOutOfProcessVerifierService.<no name provided>.sendRequest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'writeToClientMessage' @ [611:33] ==> public final fun writeToClientMessage(message: ClientMessage): Unit defined in net.corda.nodeapi.VerifierApi.VerificationRequest[DeserializedSimpleFunctionDescriptor]

'message' @ [611:54] ==> val message: (ClientMessage..ClientMessage?) defined in net.corda.node.services.messaging.NodeMessagingClient.createOutOfProcessVerifierService.<no name provided>.sendRequest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'producer' @ [612:25] ==> public final var producer: ClientProducer? defined in net.corda.node.services.messaging.NodeMessagingClient.InnerState[PropertyDescriptorImpl]

'send' @ [612:36] ==> public abstract fun send(p0: (String..String?), p1: (Message..Message?)): Unit defined in org.apache.activemq.artemis.api.core.client.ClientProducer[JavaMethodDescriptor]

'VERIFICATION_REQUESTS_QUEUE_NAME' @ [612:41] ==> public final val VERIFICATION_REQUESTS_QUEUE_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyImportedFromObject]

'message' @ [612:75] ==> val message: (ClientMessage..ClientMessage?) defined in net.corda.node.services.messaging.NodeMessagingClient.createOutOfProcessVerifierService.<no name provided>.sendRequest.<anonymous>.<anonymous>[LocalVariableDescriptor]

'when (partyInfo) {
            is PartyInfo.Node -> getArtemisPeerAddress(partyInfo.node)
            is PartyInfo.Service -> ServiceAddress(partyInfo.service.identity.owningKey)
        }' @ [621:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MessageRecipients, entry1: MessageRecipients): MessageRecipients[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MessageRecipients

'partyInfo' @ [621:22] ==> value-parameter partyInfo: PartyInfo defined in net.corda.node.services.messaging.NodeMessagingClient.getAddressOfParty[ValueParameterDescriptorImpl]

'getArtemisPeerAddress' @ [622:34] ==> public final fun getArtemisPeerAddress(nodeInfo: NodeInfo): ArtemisMessagingComponent.ArtemisPeerAddress defined in net.corda.node.services.messaging.NodeMessagingClient[DeserializedSimpleFunctionDescriptor]

'partyInfo' @ [622:56] ==> value-parameter partyInfo: PartyInfo defined in net.corda.node.services.messaging.NodeMessagingClient.getAddressOfParty[ValueParameterDescriptorImpl]

'node' @ [622:66] ==> public final val node: NodeInfo defined in net.corda.core.node.services.PartyInfo.Node[DeserializedPropertyDescriptor]

'ServiceAddress' @ [623:37] ==> public constructor ServiceAddress(identity: PublicKey) defined in net.corda.nodeapi.ArtemisMessagingComponent.ServiceAddress[DeserializedClassConstructorDescriptor]

'partyInfo' @ [623:52] ==> value-parameter partyInfo: PartyInfo defined in net.corda.node.services.messaging.NodeMessagingClient.getAddressOfParty[ValueParameterDescriptorImpl]

'service' @ [623:62] ==> public final val service: ServiceEntry defined in net.corda.core.node.services.PartyInfo.Service[DeserializedPropertyDescriptor]

'identity' @ [623:70] ==> public final val identity: PartyAndCertificate defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'owningKey' @ [623:79] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

