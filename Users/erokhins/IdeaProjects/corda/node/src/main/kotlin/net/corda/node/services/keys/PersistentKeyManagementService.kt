'SingletonSerializeAsToken' @ [30:67] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'Entity' @ [32:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'javax.persistence.Table' @ [33:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [33:40] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'Id' @ [36:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [37:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Lob' @ [40:13] ==> public constructor Lob() defined in javax.persistence.Lob[JavaClassConstructorDescriptor]

'Column' @ [41:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [42:41] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'AppendOnlyPersistentMap' @ [47:20] ==> public constructor AppendOnlyPersistentMap<K, V, E, out EK>(toPersistentEntityKey: (PublicKey) -> String, fromPersistentEntity: (PersistentKeyManagementService.PersistentKey) -> Pair<PublicKey, PrivateKey>, toPersistentEntity: (PublicKey, PrivateKey) -> PersistentKeyManagementService.PersistentKey, persistentEntityClass: Class<PersistentKeyManagementService.PersistentKey>, cacheBound: Long = ...) defined in net.corda.node.utilities.AppendOnlyPersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> PublicKey
    <V> -> PrivateKey
    <E> -> PersistentKey
    <out EK> -> String

'it' @ [48:47] ==> value-parameter it: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.Companion.createKeyMap.<anonymous>[ValueParameterDescriptorImpl]

'toBase58String' @ [48:50] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'Pair' @ [49:46] ==> public constructor Pair<out A, out B>(first: PublicKey, second: PrivateKey) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> PublicKey
    <out B> -> PrivateKey

'parsePublicKeyBase58' @ [49:51] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'it' @ [49:72] ==> value-parameter it: PersistentKeyManagementService.PersistentKey defined in net.corda.node.services.keys.PersistentKeyManagementService.Companion.createKeyMap.<anonymous>[ValueParameterDescriptorImpl]

'publicKey' @ [49:75] ==> @Id @Column public final var publicKey: String defined in net.corda.node.services.keys.PersistentKeyManagementService.PersistentKey[PropertyDescriptorImpl]

'it' @ [50:29] ==> value-parameter it: PersistentKeyManagementService.PersistentKey defined in net.corda.node.services.keys.PersistentKeyManagementService.Companion.createKeyMap.<anonymous>[ValueParameterDescriptorImpl]

'privateKey' @ [50:32] ==> @Lob @Column public final var privateKey: ByteArray defined in net.corda.node.services.keys.PersistentKeyManagementService.PersistentKey[PropertyDescriptorImpl]

'deserialize' @ [50:43] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): PrivateKey defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PrivateKey

'SerializationDefaults' @ [50:77] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [50:99] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'PersistentKey' @ [52:25] ==> public constructor PersistentKey(publicKey: String = ..., privateKey: ByteArray = ...) defined in net.corda.node.services.keys.PersistentKeyManagementService.PersistentKey[ClassConstructorDescriptorImpl]

'apply' @ [52:41] ==> @InlineOnly public inline fun <T> PersistentKeyManagementService.PersistentKey.apply(block: PersistentKeyManagementService.PersistentKey.() -> Unit): PersistentKeyManagementService.PersistentKey defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PersistentKey

'publicKey' @ [53:29] ==> @Id @Column public final var publicKey: String defined in net.corda.node.services.keys.PersistentKeyManagementService.PersistentKey[PropertyDescriptorImpl]

'key' @ [53:41] ==> value-parameter key: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.Companion.createKeyMap.<anonymous>[ValueParameterDescriptorImpl]

'toBase58String' @ [53:45] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'privateKey' @ [54:29] ==> @Lob @Column public final var privateKey: ByteArray defined in net.corda.node.services.keys.PersistentKeyManagementService.PersistentKey[PropertyDescriptorImpl]

'value' @ [54:42] ==> value-parameter value: PrivateKey defined in net.corda.node.services.keys.PersistentKeyManagementService.Companion.createKeyMap.<anonymous>[ValueParameterDescriptorImpl]

'serialize' @ [54:48] ==> public fun <T : Any> PrivateKey.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<PrivateKey> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PrivateKey

'SerializationDefaults' @ [54:68] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [54:90] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'bytes' @ [54:107] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'PersistentKey' @ [57:45] ==> public constructor PersistentKey(publicKey: String = ..., privateKey: ByteArray = ...) defined in net.corda.node.services.keys.PersistentKeyManagementService.PersistentKey[ClassConstructorDescriptorImpl]

'java' @ [57:66] ==> public val <T> KClass<PersistentKeyManagementService.PersistentKey>.java: Class<PersistentKeyManagementService.PersistentKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistentKey

'createKeyMap' @ [62:19] ==> public final fun createKeyMap(): AppendOnlyPersistentMap<PublicKey, PrivateKey, PersistentKeyManagementService.PersistentKey, String> defined in net.corda.node.services.keys.PersistentKeyManagementService.Companion[SimpleFunctionDescriptorImpl]

'initialKeys' @ [65:9] ==> value-parameter initialKeys: Set<KeyPair> defined in net.corda.node.services.keys.PersistentKeyManagementService.<init>[ValueParameterDescriptorImpl]

'forEach' @ [65:21] ==> @HidesMembers public inline fun <T> Iterable<KeyPair>.forEach(action: (KeyPair) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'keysMap' @ [65:37] ==> public final val keysMap: AppendOnlyPersistentMap<PublicKey, PrivateKey, PersistentKeyManagementService.PersistentKey, String> defined in net.corda.node.services.keys.PersistentKeyManagementService[PropertyDescriptorImpl]

'addWithDuplicatesAllowed' @ [65:45] ==> public final fun addWithDuplicatesAllowed(key: PublicKey, value: PrivateKey): Boolean defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'it' @ [65:70] ==> value-parameter it: KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService.<init>.<anonymous>[ValueParameterDescriptorImpl]

'public' @ [65:73] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'it' @ [65:81] ==> value-parameter it: KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService.<init>.<anonymous>[ValueParameterDescriptorImpl]

'private' @ [65:84] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'keysMap' @ [68:47] ==> public final val keysMap: AppendOnlyPersistentMap<PublicKey, PrivateKey, PersistentKeyManagementService.PersistentKey, String> defined in net.corda.node.services.keys.PersistentKeyManagementService[PropertyDescriptorImpl]

'allPersisted' @ [68:55] ==> public final fun allPersisted(): Sequence<Pair<PublicKey, PrivateKey>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'map' @ [68:70] ==> public fun <T, R> Sequence<Pair<PublicKey, PrivateKey>>.map(transform: (Pair<PublicKey, PrivateKey>) -> PublicKey): Sequence<PublicKey> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<PublicKey, PrivateKey>
    <R> -> PublicKey

'it' @ [68:76] ==> value-parameter it: Pair<PublicKey, PrivateKey> defined in net.corda.node.services.keys.PersistentKeyManagementService.<get-keys>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [68:79] ==> public final val first: PublicKey defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toSet' @ [68:87] ==> public fun <T> Sequence<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'candidateKeys' @ [71:13] ==> value-parameter candidateKeys: Iterable<PublicKey> defined in net.corda.node.services.keys.PersistentKeyManagementService.filterMyKeys[ValueParameterDescriptorImpl]

'filter' @ [71:27] ==> public inline fun <T> Iterable<PublicKey>.filter(predicate: (PublicKey) -> Boolean): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'keysMap' @ [71:36] ==> public final val keysMap: AppendOnlyPersistentMap<PublicKey, PrivateKey, PersistentKeyManagementService.PersistentKey, String> defined in net.corda.node.services.keys.PersistentKeyManagementService[PropertyDescriptorImpl]

'it' @ [71:44] ==> value-parameter it: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.filterMyKeys.<anonymous>[ValueParameterDescriptorImpl]

'generateKeyPair' @ [74:23] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'keysMap' @ [75:9] ==> public final val keysMap: AppendOnlyPersistentMap<PublicKey, PrivateKey, PersistentKeyManagementService.PersistentKey, String> defined in net.corda.node.services.keys.PersistentKeyManagementService[PropertyDescriptorImpl]

'keyPair' @ [75:17] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService.freshKey[LocalVariableDescriptor]

'public' @ [75:25] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPair' @ [75:35] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService.freshKey[LocalVariableDescriptor]

'private' @ [75:43] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'keyPair' @ [76:16] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService.freshKey[LocalVariableDescriptor]

'public' @ [76:24] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'freshCertificate' @ [80:13] ==> public fun freshCertificate(identityService: IdentityService, subjectPublicKey: PublicKey, issuer: PartyAndCertificate, issuerSigner: ContentSigner, revocationEnabled: Boolean = ...): PartyAndCertificate defined in net.corda.node.services.keys in file KMSUtils.kt[SimpleFunctionDescriptorImpl]

'identityService' @ [80:30] ==> public final val identityService: IdentityService defined in net.corda.node.services.keys.PersistentKeyManagementService[PropertyDescriptorImpl]

'freshKey' @ [80:47] ==> public open fun freshKey(): PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService[SimpleFunctionDescriptorImpl]

'identity' @ [80:59] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.keys.PersistentKeyManagementService.freshKeyAndCert[ValueParameterDescriptorImpl]

'getSigner' @ [80:69] ==> private final fun getSigner(publicKey: PublicKey): ContentSigner defined in net.corda.node.services.keys.PersistentKeyManagementService[SimpleFunctionDescriptorImpl]

'identity' @ [80:79] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.keys.PersistentKeyManagementService.freshKeyAndCert[ValueParameterDescriptorImpl]

'owningKey' @ [80:88] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'revocationEnabled' @ [80:100] ==> value-parameter revocationEnabled: Boolean defined in net.corda.node.services.keys.PersistentKeyManagementService.freshKeyAndCert[ValueParameterDescriptorImpl]

'getSigner' @ [82:67] ==> public fun getSigner(issuerKeyPair: KeyPair): ContentSigner defined in net.corda.node.services.keys in file KMSUtils.kt[SimpleFunctionDescriptorImpl]

'getSigningKeyPair' @ [82:77] ==> private final fun getSigningKeyPair(publicKey: PublicKey): KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService[SimpleFunctionDescriptorImpl]

'publicKey' @ [82:95] ==> value-parameter publicKey: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.getSigner[ValueParameterDescriptorImpl]

'publicKey' @ [86:18] ==> value-parameter publicKey: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.getSigningKeyPair[ValueParameterDescriptorImpl]

'keys' @ [86:28] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'first' @ [86:33] ==> public inline fun <T> Iterable<PublicKey>.first(predicate: (PublicKey) -> Boolean): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'keysMap' @ [86:41] ==> public final val keysMap: AppendOnlyPersistentMap<PublicKey, PrivateKey, PersistentKeyManagementService.PersistentKey, String> defined in net.corda.node.services.keys.PersistentKeyManagementService[PropertyDescriptorImpl]

'it' @ [86:49] ==> value-parameter it: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.getSigningKeyPair.<anonymous>[ValueParameterDescriptorImpl]

'KeyPair' @ [87:16] ==> public constructor KeyPair(p0: (PublicKey..PublicKey?), p1: (PrivateKey..PrivateKey?)) defined in java.security.KeyPair[JavaClassConstructorDescriptor]

'pk' @ [87:24] ==> val pk: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.getSigningKeyPair[LocalVariableDescriptor]

'keysMap' @ [87:28] ==> public final val keysMap: AppendOnlyPersistentMap<PublicKey, PrivateKey, PersistentKeyManagementService.PersistentKey, String> defined in net.corda.node.services.keys.PersistentKeyManagementService[PropertyDescriptorImpl]

'pk' @ [87:36] ==> val pk: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.getSigningKeyPair[LocalVariableDescriptor]

'getSigningKeyPair' @ [91:23] ==> private final fun getSigningKeyPair(publicKey: PublicKey): KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService[SimpleFunctionDescriptorImpl]

'publicKey' @ [91:41] ==> value-parameter publicKey: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.sign[ValueParameterDescriptorImpl]

'keyPair' @ [92:16] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService.sign[LocalVariableDescriptor]

'sign' @ [92:24] ==> public fun KeyPair.sign(bytesToSign: ByteArray): DigitalSignature.WithKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'bytes' @ [92:29] ==> value-parameter bytes: ByteArray defined in net.corda.node.services.keys.PersistentKeyManagementService.sign[ValueParameterDescriptorImpl]

'getSigningKeyPair' @ [98:23] ==> private final fun getSigningKeyPair(publicKey: PublicKey): KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService[SimpleFunctionDescriptorImpl]

'publicKey' @ [98:41] ==> value-parameter publicKey: PublicKey defined in net.corda.node.services.keys.PersistentKeyManagementService.sign[ValueParameterDescriptorImpl]

'keyPair' @ [99:16] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.PersistentKeyManagementService.sign[LocalVariableDescriptor]

'sign' @ [99:24] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signableData' @ [99:29] ==> value-parameter signableData: SignableData defined in net.corda.node.services.keys.PersistentKeyManagementService.sign[ValueParameterDescriptorImpl]

