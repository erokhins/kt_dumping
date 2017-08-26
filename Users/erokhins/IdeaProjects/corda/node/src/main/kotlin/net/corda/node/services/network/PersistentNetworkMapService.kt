'AbstractNetworkMapService' @ [27:7] ==> public constructor AbstractNetworkMapService(services: ServiceHubInternal, minimumPlatformVersion: Int) defined in net.corda.node.services.network.AbstractNetworkMapService[ClassConstructorDescriptorImpl]

'services' @ [27:33] ==> value-parameter services: ServiceHubInternal defined in net.corda.node.services.network.PersistentNetworkMapService.<init>[ValueParameterDescriptorImpl]

'minimumPlatformVersion' @ [27:43] ==> value-parameter minimumPlatformVersion: Int defined in net.corda.node.services.network.PersistentNetworkMapService.<init>[ValueParameterDescriptorImpl]

'Entity' @ [30:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'Table' @ [31:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [31:22] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'Id' @ [33:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [33:17] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [36:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'NodeParty' @ [37:40] ==> public constructor NodeParty(name: String = ..., certificate: ByteArray = ..., certPath: ByteArray = ...) defined in net.corda.node.services.network.PersistentNetworkMapService.NodeParty[ClassConstructorDescriptorImpl]

'Lob' @ [39:13] ==> public constructor Lob() defined in javax.persistence.Lob[JavaClassConstructorDescriptor]

'Column' @ [39:18] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [40:47] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'Embeddable' @ [43:5] ==> public constructor Embeddable() defined in javax.persistence.Embeddable[JavaClassConstructorDescriptor]

'Column' @ [45:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [48:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [49:42] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'Column' @ [51:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [52:39] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'getInstance' @ [56:50] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'PersistentMap' @ [59:20] ==> public constructor PersistentMap<K, V, E, out EK>(toPersistentEntityKey: (PartyAndCertificate) -> String, fromPersistentEntity: (PersistentNetworkMapService.NetworkNode) -> Pair<PartyAndCertificate, NodeRegistrationInfo>, toPersistentEntity: (PartyAndCertificate, NodeRegistrationInfo) -> PersistentNetworkMapService.NetworkNode, persistentEntityClass: Class<PersistentNetworkMapService.NetworkNode>) defined in net.corda.node.utilities.PersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> PartyAndCertificate
    <V> -> NodeRegistrationInfo
    <E> -> NetworkNode
    <out EK> -> String

'it' @ [60:47] ==> value-parameter it: PartyAndCertificate defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkNodesMap.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [60:50] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'toBase58String' @ [60:60] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Pair' @ [62:25] ==> public constructor Pair<out A, out B>(first: PartyAndCertificate, second: NodeRegistrationInfo) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> PartyAndCertificate
    <out B> -> NodeRegistrationInfo

'PartyAndCertificate' @ [62:30] ==> public constructor PartyAndCertificate(certPath: CertPath) defined in net.corda.core.identity.PartyAndCertificate[DeserializedClassConstructorDescriptor]

'factory' @ [62:50] ==> private final val factory: (CertificateFactory..CertificateFactory?) defined in net.corda.node.services.network.PersistentNetworkMapService.Companion[PropertyDescriptorImpl]

'generateCertPath' @ [62:58] ==> public final fun generateCertPath(p0: (InputStream..InputStream?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'ByteArrayInputStream' @ [62:75] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'it' @ [62:96] ==> value-parameter it: PersistentNetworkMapService.NetworkNode defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkNodesMap.<anonymous>[ValueParameterDescriptorImpl]

'nodeParty' @ [62:99] ==> @Column public final var nodeParty: PersistentNetworkMapService.NodeParty defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkNode[PropertyDescriptorImpl]

'certPath' @ [62:109] ==> @Column public final var certPath: ByteArray defined in net.corda.node.services.network.PersistentNetworkMapService.NodeParty[PropertyDescriptorImpl]

'it' @ [63:33] ==> value-parameter it: PersistentNetworkMapService.NetworkNode defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkNodesMap.<anonymous>[ValueParameterDescriptorImpl]

'registrationInfo' @ [63:36] ==> @Lob @Column public final var registrationInfo: ByteArray defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkNode[PropertyDescriptorImpl]

'deserialize' @ [63:53] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): NodeRegistrationInfo defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeRegistrationInfo

'SerializationDefaults' @ [63:75] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [63:97] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'NetworkNode' @ [66:25] ==> public constructor NetworkNode(publicKey: String = ..., nodeParty: PersistentNetworkMapService.NodeParty = ..., registrationInfo: ByteArray = ...) defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkNode[ClassConstructorDescriptorImpl]

'key' @ [67:45] ==> value-parameter key: PartyAndCertificate defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkNodesMap.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [67:49] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'toBase58String' @ [67:59] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'NodeParty' @ [68:45] ==> public constructor NodeParty(name: String = ..., certificate: ByteArray = ..., certPath: ByteArray = ...) defined in net.corda.node.services.network.PersistentNetworkMapService.NodeParty[ClassConstructorDescriptorImpl]

'key' @ [69:41] ==> value-parameter key: PartyAndCertificate defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkNodesMap.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [69:45] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'toString' @ [69:50] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'key' @ [70:41] ==> value-parameter key: PartyAndCertificate defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkNodesMap.<anonymous>[ValueParameterDescriptorImpl]

'certificate' @ [70:45] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'encoded' @ [70:57] ==> public final val X509CertificateHolder.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'key' @ [71:41] ==> value-parameter key: PartyAndCertificate defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkNodesMap.<anonymous>[ValueParameterDescriptorImpl]

'certPath' @ [71:45] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'encoded' @ [71:54] ==> public final val CertPath.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'value' @ [73:52] ==> value-parameter value: NodeRegistrationInfo defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkNodesMap.<anonymous>[ValueParameterDescriptorImpl]

'serialize' @ [73:58] ==> public fun <T : Any> NodeRegistrationInfo.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<NodeRegistrationInfo> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> NodeRegistrationInfo

'SerializationDefaults' @ [73:78] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [73:100] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'bytes' @ [73:117] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'NetworkNode' @ [76:45] ==> public constructor NetworkNode(publicKey: String = ..., nodeParty: PersistentNetworkMapService.NodeParty = ..., registrationInfo: ByteArray = ...) defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkNode[ClassConstructorDescriptorImpl]

'java' @ [76:64] ==> public val <T> KClass<PersistentNetworkMapService.NetworkNode>.java: Class<PersistentNetworkMapService.NetworkNode> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NetworkNode

'PersistentMap' @ [81:20] ==> public constructor PersistentMap<K, V, E, out EK>(toPersistentEntityKey: (SingleMessageRecipient) -> String, fromPersistentEntity: (PersistentNetworkMapService.NetworkSubscriber) -> Pair<SingleMessageRecipient, LastAcknowledgeInfo>, toPersistentEntity: (SingleMessageRecipient, LastAcknowledgeInfo) -> PersistentNetworkMapService.NetworkSubscriber, persistentEntityClass: Class<PersistentNetworkMapService.NetworkSubscriber>) defined in net.corda.node.utilities.PersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> SingleMessageRecipient
    <V> -> LastAcknowledgeInfo
    <E> -> NetworkSubscriber
    <out EK> -> String

'it' @ [82:47] ==> value-parameter it: SingleMessageRecipient defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkSubscribersMap.<anonymous>[ValueParameterDescriptorImpl]

'getPrimaryKeyBasedOnSubType' @ [82:50] ==> public final fun SingleMessageRecipient.getPrimaryKeyBasedOnSubType(): String defined in net.corda.node.services.network.PersistentNetworkMapService.Companion[SimpleFunctionDescriptorImpl]

'Pair' @ [84:25] ==> public constructor Pair<out A, out B>(first: SingleMessageRecipient, second: LastAcknowledgeInfo) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SingleMessageRecipient
    <out B> -> LastAcknowledgeInfo

'it' @ [84:30] ==> value-parameter it: PersistentNetworkMapService.NetworkSubscriber defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkSubscribersMap.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [84:33] ==> @Column public final var key: ByteArray defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkSubscriber[PropertyDescriptorImpl]

'deserialize' @ [84:37] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SingleMessageRecipient defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SingleMessageRecipient

'SerializationDefaults' @ [84:59] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [84:81] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'it' @ [85:33] ==> value-parameter it: PersistentNetworkMapService.NetworkSubscriber defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkSubscribersMap.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [85:36] ==> @Column public final var value: ByteArray defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkSubscriber[PropertyDescriptorImpl]

'deserialize' @ [85:42] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): LastAcknowledgeInfo defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LastAcknowledgeInfo

'SerializationDefaults' @ [85:64] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [85:86] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'NetworkSubscriber' @ [88:25] ==> public constructor NetworkSubscriber(id: String = ..., key: ByteArray = ..., value: ByteArray = ...) defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkSubscriber[ClassConstructorDescriptorImpl]

'k' @ [89:38] ==> value-parameter k: SingleMessageRecipient defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkSubscribersMap.<anonymous>[ValueParameterDescriptorImpl]

'getPrimaryKeyBasedOnSubType' @ [89:40] ==> public final fun SingleMessageRecipient.getPrimaryKeyBasedOnSubType(): String defined in net.corda.node.services.network.PersistentNetworkMapService.Companion[SimpleFunctionDescriptorImpl]

'k' @ [90:39] ==> value-parameter k: SingleMessageRecipient defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkSubscribersMap.<anonymous>[ValueParameterDescriptorImpl]

'serialize' @ [90:41] ==> public fun <T : Any> SingleMessageRecipient.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<SingleMessageRecipient> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SingleMessageRecipient

'SerializationDefaults' @ [90:61] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [90:83] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'bytes' @ [90:100] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'v' @ [91:41] ==> value-parameter v: LastAcknowledgeInfo defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.createNetworkSubscribersMap.<anonymous>[ValueParameterDescriptorImpl]

'serialize' @ [91:43] ==> public fun <T : Any> LastAcknowledgeInfo.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<LastAcknowledgeInfo> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LastAcknowledgeInfo

'SerializationDefaults' @ [91:63] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [91:85] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'bytes' @ [91:102] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'NetworkSubscriber' @ [94:45] ==> public constructor NetworkSubscriber(id: String = ..., key: ByteArray = ..., value: ByteArray = ...) defined in net.corda.node.services.network.PersistentNetworkMapService.NetworkSubscriber[ClassConstructorDescriptorImpl]

'java' @ [94:70] ==> public val <T> KClass<PersistentNetworkMapService.NetworkSubscriber>.java: Class<PersistentNetworkMapService.NetworkSubscriber> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NetworkSubscriber

'if (this is ArtemisMessagingComponent.ArtemisPeerAddress) {
                    this.hostAndPort.toString()
                } else {
                    this.toString()
                }' @ [99:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [99:21] ==> <this> defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.getPrimaryKeyBasedOnSubType[ReceiverParameterDescriptorImpl]

'this' @ [100:21] ==> <this> defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.getPrimaryKeyBasedOnSubType[ReceiverParameterDescriptorImpl]

'hostAndPort' @ [100:26] ==> public abstract val hostAndPort: NetworkHostAndPort defined in net.corda.nodeapi.ArtemisMessagingComponent.ArtemisPeerAddress[DeserializedPropertyDescriptor]

'toString' @ [100:38] ==> public open fun toString(): String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedSimpleFunctionDescriptor]

'this' @ [102:21] ==> <this> defined in net.corda.node.services.network.PersistentNetworkMapService.Companion.getPrimaryKeyBasedOnSubType[ReceiverParameterDescriptorImpl]

'toString' @ [102:26] ==> public open fun toString(): String defined in net.corda.core.messaging.SingleMessageRecipient[DeserializedSimpleFunctionDescriptor]

'synchronizedMap' @ [107:25] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> synchronizedMap(p0: (MutableMap<(PartyAndCertificate..PartyAndCertificate?), (NodeRegistrationInfo..NodeRegistrationInfo?)>..Map<(PartyAndCertificate..PartyAndCertificate?), (NodeRegistrationInfo..NodeRegistrationInfo?)>?)): (MutableMap<(PartyAndCertificate..PartyAndCertificate?), (NodeRegistrationInfo..NodeRegistrationInfo?)>..Map<(PartyAndCertificate..PartyAndCertificate?), (NodeRegistrationInfo..NodeRegistrationInfo?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PartyAndCertificate
    <V : (Any..Any?)> -> NodeRegistrationInfo

'createNetworkNodesMap' @ [107:41] ==> public final fun createNetworkNodesMap(): PersistentMap<PartyAndCertificate, NodeRegistrationInfo, PersistentNetworkMapService.NetworkNode, String> defined in net.corda.node.services.network.PersistentNetworkMapService.Companion[SimpleFunctionDescriptorImpl]

'Entity' @ [109:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'Table' @ [110:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [110:22] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'Id' @ [112:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [112:17] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Column' @ [115:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [116:34] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'Column' @ [118:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [119:36] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'ThreadBox' @ [122:32] ==> public constructor ThreadBox<out T>(content: PersistentMap<SingleMessageRecipient, LastAcknowledgeInfo, PersistentNetworkMapService.NetworkSubscriber, String>, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> PersistentMap<SingleMessageRecipient, LastAcknowledgeInfo, NetworkSubscriber, String>

'createNetworkSubscribersMap' @ [122:42] ==> public final fun createNetworkSubscribersMap(): PersistentMap<SingleMessageRecipient, LastAcknowledgeInfo, PersistentNetworkMapService.NetworkSubscriber, String> defined in net.corda.node.services.network.PersistentNetworkMapService.Companion[SimpleFunctionDescriptorImpl]

'_mapVersion' @ [126:9] ==> protected final val _mapVersion: AtomicInteger defined in net.corda.node.services.network.PersistentNetworkMapService[PropertyDescriptorImpl]

'set' @ [126:21] ==> public final fun set(p0: Int): Unit defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'nodeRegistrations' @ [126:25] ==> protected open val nodeRegistrations: MutableMap<PartyAndCertificate, NodeRegistrationInfo> defined in net.corda.node.services.network.PersistentNetworkMapService[PropertyDescriptorImpl]

'values' @ [126:43] ==> public abstract val values: MutableCollection<NodeRegistrationInfo> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'map' @ [126:50] ==> public inline fun <T, R> Iterable<NodeRegistrationInfo>.map(transform: (NodeRegistrationInfo) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeRegistrationInfo
    <R> -> Int

'it' @ [126:56] ==> value-parameter it: NodeRegistrationInfo defined in net.corda.node.services.network.PersistentNetworkMapService.<init>.<anonymous>[ValueParameterDescriptorImpl]

'mapVersion' @ [126:59] ==> public final val mapVersion: Int defined in net.corda.node.services.network.NodeRegistrationInfo[PropertyDescriptorImpl]

'max' @ [126:72] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'setup' @ [127:9] ==> protected final fun setup(): Unit defined in net.corda.node.services.network.PersistentNetworkMapService[SimpleFunctionDescriptorImpl]

