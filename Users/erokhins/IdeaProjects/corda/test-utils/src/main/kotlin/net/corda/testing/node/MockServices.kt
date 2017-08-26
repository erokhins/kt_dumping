'this' @ [59:21] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[ClassConstructorDescriptorImpl]

'generateKeyPair' @ [59:26] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'keys' @ [61:30] ==> public final val keys: Array<out KeyPair> defined in net.corda.testing.node.MockServices[PropertyDescriptorImpl]

'first' @ [61:35] ==> public fun <T> Array<out KeyPair>.first(): KeyPair defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'txs' @ [64:9] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.testing.node.MockServices.recordTransactions[ValueParameterDescriptorImpl]

'forEach' @ [64:13] ==> @HidesMembers public inline fun <T> Iterable<SignedTransaction>.forEach(action: (SignedTransaction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'stateMachineRecordedTransactionMapping' @ [65:13] ==> public final val stateMachineRecordedTransactionMapping: StateMachineRecordedTransactionMappingStorage defined in net.corda.testing.node.MockServices[PropertyDescriptorImpl]

'addMapping' @ [65:52] ==> public abstract fun addMapping(stateMachineRunId: StateMachineRunId, transactionId: SecureHash): Unit defined in net.corda.node.services.api.StateMachineRecordedTransactionMappingStorage[DeserializedSimpleFunctionDescriptor]

'createRandom' @ [65:81] ==> public final fun createRandom(): StateMachineRunId defined in net.corda.core.flows.StateMachineRunId.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [65:97] ==> value-parameter it: SignedTransaction defined in net.corda.testing.node.MockServices.recordTransactions.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [65:100] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'txs' @ [67:21] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.testing.node.MockServices.recordTransactions[ValueParameterDescriptorImpl]

'validatedTransactions' @ [68:13] ==> public open val validatedTransactions: WritableTransactionStorage defined in net.corda.testing.node.MockServices[PropertyDescriptorImpl]

'addTransaction' @ [68:35] ==> public abstract fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx' @ [68:50] ==> val stx: SignedTransaction defined in net.corda.testing.node.MockServices.recordTransactions[LocalVariableDescriptor]

'MockAttachmentStorage' @ [72:51] ==> public constructor MockAttachmentStorage() defined in net.corda.testing.node.MockAttachmentStorage[ClassConstructorDescriptorImpl]

'MockTransactionStorage' @ [73:70] ==> public constructor MockTransactionStorage() defined in net.corda.testing.node.MockTransactionStorage[ClassConstructorDescriptorImpl]

'MockStateMachineRecordedTransactionMappingStorage' @ [74:97] ==> public constructor MockStateMachineRecordedTransactionMappingStorage(storage: StateMachineRecordedTransactionMappingStorage = ...) defined in net.corda.testing.node.MockStateMachineRecordedTransactionMappingStorage[ClassConstructorDescriptorImpl]

'InMemoryIdentityService' @ [75:59] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'MOCK_IDENTITIES' @ [75:83] ==> public val MOCK_IDENTITIES: List<PartyAndCertificate> defined in net.corda.testing in file CoreTestUtils.kt[PropertyDescriptorImpl]

'DUMMY_CA' @ [75:112] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'certificate' @ [75:121] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'MockKeyManagementService' @ [76:63] ==> public constructor MockKeyManagementService(identityService: IdentityService, vararg initialKeys: KeyPair) defined in net.corda.testing.node.MockKeyManagementService[ClassConstructorDescriptorImpl]

'identityService' @ [76:88] ==> public final val identityService: IdentityService defined in net.corda.testing.node.MockServices[PropertyDescriptorImpl]

'keys' @ [76:106] ==> public final val keys: Array<out KeyPair> defined in net.corda.testing.node.MockServices[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [78:59] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [79:69] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [80:65] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'systemUTC' @ [81:45] ==> public open fun systemUTC(): (Clock..Clock?) defined in java.time.Clock[JavaMethodDescriptor]

'getTestPartyAndCertificate' @ [83:24] ==> public fun getTestPartyAndCertificate(name: X500Name, publicKey: PublicKey, trustRoot: CertificateAndKeyPair = ...): PartyAndCertificate defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'MEGA_CORP' @ [83:51] ==> public val MEGA_CORP: Party defined in net.corda.testing in file CoreTestUtils.kt[PropertyDescriptorImpl]

'name' @ [83:61] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'key' @ [83:67] ==> public final val key: KeyPair defined in net.corda.testing.node.MockServices[PropertyDescriptorImpl]

'public' @ [83:71] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'NodeInfo' @ [84:16] ==> public constructor NodeInfo(addresses: List<NetworkHostAndPort>, legalIdentityAndCert: PartyAndCertificate, legalIdentitiesAndCerts: NonEmptySet<PartyAndCertificate>, platformVersion: Int, advertisedServices: List<ServiceEntry> = ..., worldMapLocation: WorldMapLocation? = ...) defined in net.corda.core.node.NodeInfo[DeserializedClassConstructorDescriptor]

'emptyList' @ [84:25] ==> public fun <T> emptyList(): List<NetworkHostAndPort> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort

'identity' @ [84:38] ==> val identity: PartyAndCertificate defined in net.corda.testing.node.MockServices.<get-myInfo>[LocalVariableDescriptor]

'of' @ [84:60] ==> @JvmStatic public final fun <T> of(element: PartyAndCertificate): NonEmptySet<PartyAndCertificate> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'identity' @ [84:63] ==> val identity: PartyAndCertificate defined in net.corda.testing.node.MockServices.<get-myInfo>[LocalVariableDescriptor]

'InMemoryTransactionVerifierService' @ [86:81] ==> public constructor InMemoryTransactionVerifierService(numberOfWorkers: Int) defined in net.corda.node.services.transactions.InMemoryTransactionVerifierService[DeserializedClassConstructorDescriptor]

'HibernateConfiguration' @ [90:68] ==> public constructor HibernateConfiguration(createSchemaService: () -> SchemaService, databaseProperties: Properties, createIdentityScervice: () -> IdentityService) defined in net.corda.node.services.database.HibernateConfiguration[DeserializedClassConstructorDescriptor]

'NodeSchemaService' @ [90:94] ==> public constructor NodeSchemaService(customSchemas: Set<MappedSchema> = ...) defined in net.corda.node.services.schema.NodeSchemaService[DeserializedClassConstructorDescriptor]

'makeTestDatabaseProperties' @ [90:117] ==> public fun makeTestDatabaseProperties(key: String? = ..., value: String? = ...): Properties defined in net.corda.testing.node in file MockServices.kt[SimpleFunctionDescriptorImpl]

'identityService' @ [90:149] ==> public final val identityService: IdentityService defined in net.corda.testing.node.MockServices[PropertyDescriptorImpl]

'NodeVaultService' @ [91:28] ==> public constructor NodeVaultService(services: ServiceHub) defined in net.corda.node.services.vault.NodeVaultService[DeserializedClassConstructorDescriptor]

'this' @ [91:45] ==> <this> defined in net.corda.testing.node.MockServices[LazyClassReceiverParameterDescriptor]

'hibernatePersister' @ [92:9] ==> public final lateinit var hibernatePersister: HibernateObserver defined in net.corda.testing.node.MockServices[PropertyDescriptorImpl]

'HibernateObserver' @ [92:30] ==> public constructor HibernateObserver(vaultUpdates: Observable<Vault.Update<ContractState>>, config: HibernateConfiguration) defined in net.corda.node.services.schema.HibernateObserver[DeserializedClassConstructorDescriptor]

'vaultService' @ [92:48] ==> val vaultService: NodeVaultService defined in net.corda.testing.node.MockServices.makeVaultService[LocalVariableDescriptor]

'rawUpdates' @ [92:61] ==> public open val rawUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService[DeserializedPropertyDescriptor]

'hibernateConfig' @ [92:73] ==> value-parameter hibernateConfig: HibernateConfiguration = ... defined in net.corda.testing.node.MockServices.makeVaultService[ValueParameterDescriptorImpl]

'vaultService' @ [93:16] ==> val vaultService: NodeVaultService defined in net.corda.testing.node.MockServices.makeVaultService[LocalVariableDescriptor]

'IllegalArgumentException' @ [96:81] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'type' @ [96:109] ==> value-parameter type: Class<T> defined in net.corda.testing.node.MockServices.cordaService[ValueParameterDescriptorImpl]

'name' @ [96:114] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'UnsupportedOperationException' @ [98:52] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'SingletonSerializeAsToken' @ [102:63] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'initialKeys' @ [103:63] ==> value-parameter vararg initialKeys: KeyPair defined in net.corda.testing.node.MockKeyManagementService.<init>[ValueParameterDescriptorImpl]

'associateByTo' @ [103:75] ==> public inline fun <T, K, V, M : MutableMap<in (PublicKey..PublicKey?), in (PrivateKey..PrivateKey?)>> Array<out KeyPair>.associateByTo(destination: HashMap<PublicKey, PrivateKey>, keySelector: (KeyPair) -> (PublicKey..PublicKey?), valueTransform: (KeyPair) -> (PrivateKey..PrivateKey?)): HashMap<PublicKey, PrivateKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair
    <K> -> (java.security.PublicKey..java.security.PublicKey?)
    <V> -> (java.security.PrivateKey..java.security.PrivateKey?)
    <M : MutableMap<in K, in V>> -> HashMap<PublicKey, PrivateKey>

'HashMap' @ [103:89] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PublicKey
    <V : (Any..Any?)> -> PrivateKey

'it' @ [103:102] ==> value-parameter it: KeyPair defined in net.corda.testing.node.MockKeyManagementService.keyStore.<anonymous>[ValueParameterDescriptorImpl]

'public' @ [103:105] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'it' @ [103:117] ==> value-parameter it: KeyPair defined in net.corda.testing.node.MockKeyManagementService.keyStore.<anonymous>[ValueParameterDescriptorImpl]

'private' @ [103:120] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'keyStore' @ [105:47] ==> private final val keyStore: MutableMap<PublicKey, PrivateKey> defined in net.corda.testing.node.MockKeyManagementService[PropertyDescriptorImpl]

'keys' @ [105:56] ==> public abstract val keys: MutableSet<PublicKey> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'LinkedList' @ [107:20] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KeyPair

'nextKeys' @ [110:17] ==> public final val nextKeys: LinkedList<KeyPair> defined in net.corda.testing.node.MockKeyManagementService[PropertyDescriptorImpl]

'poll' @ [110:26] ==> public open fun poll(): (KeyPair..KeyPair?) defined in java.util.LinkedList[JavaMethodDescriptor]

'generateKeyPair' @ [110:36] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'keyStore' @ [111:9] ==> private final val keyStore: MutableMap<PublicKey, PrivateKey> defined in net.corda.testing.node.MockKeyManagementService[PropertyDescriptorImpl]

'k' @ [111:18] ==> val k: KeyPair defined in net.corda.testing.node.MockKeyManagementService.freshKey[LocalVariableDescriptor]

'public' @ [111:20] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'k' @ [111:30] ==> val k: KeyPair defined in net.corda.testing.node.MockKeyManagementService.freshKey[LocalVariableDescriptor]

'private' @ [111:32] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'k' @ [112:16] ==> val k: KeyPair defined in net.corda.testing.node.MockKeyManagementService.freshKey[LocalVariableDescriptor]

'public' @ [112:18] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'candidateKeys' @ [115:90] ==> value-parameter candidateKeys: Iterable<PublicKey> defined in net.corda.testing.node.MockKeyManagementService.filterMyKeys[ValueParameterDescriptorImpl]

'filter' @ [115:104] ==> public inline fun <T> Iterable<PublicKey>.filter(predicate: (PublicKey) -> Boolean): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'it' @ [115:113] ==> value-parameter it: PublicKey defined in net.corda.testing.node.MockKeyManagementService.filterMyKeys.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [115:119] ==> <this> defined in net.corda.testing.node.MockKeyManagementService[LazyClassReceiverParameterDescriptor]

'keys' @ [115:124] ==> public open val keys: Set<PublicKey> defined in net.corda.testing.node.MockKeyManagementService[PropertyDescriptorImpl]

'freshCertificate' @ [118:16] ==> public fun freshCertificate(identityService: IdentityService, subjectPublicKey: PublicKey, issuer: PartyAndCertificate, issuerSigner: ContentSigner, revocationEnabled: Boolean = ...): PartyAndCertificate defined in net.corda.node.services.keys[DeserializedSimpleFunctionDescriptor]

'identityService' @ [118:33] ==> public final val identityService: IdentityService defined in net.corda.testing.node.MockKeyManagementService[PropertyDescriptorImpl]

'freshKey' @ [118:50] ==> public open fun freshKey(): PublicKey defined in net.corda.testing.node.MockKeyManagementService[SimpleFunctionDescriptorImpl]

'identity' @ [118:62] ==> value-parameter identity: PartyAndCertificate defined in net.corda.testing.node.MockKeyManagementService.freshKeyAndCert[ValueParameterDescriptorImpl]

'getSigner' @ [118:72] ==> private final fun getSigner(publicKey: PublicKey): ContentSigner defined in net.corda.testing.node.MockKeyManagementService[SimpleFunctionDescriptorImpl]

'identity' @ [118:82] ==> value-parameter identity: PartyAndCertificate defined in net.corda.testing.node.MockKeyManagementService.freshKeyAndCert[ValueParameterDescriptorImpl]

'owningKey' @ [118:91] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'revocationEnabled' @ [118:103] ==> value-parameter revocationEnabled: Boolean defined in net.corda.testing.node.MockKeyManagementService.freshKeyAndCert[ValueParameterDescriptorImpl]

'getSigner' @ [121:66] ==> public fun getSigner(issuerKeyPair: KeyPair): ContentSigner defined in net.corda.node.services.keys[DeserializedSimpleFunctionDescriptor]

'getSigningKeyPair' @ [121:76] ==> private final fun getSigningKeyPair(publicKey: PublicKey): KeyPair defined in net.corda.testing.node.MockKeyManagementService[SimpleFunctionDescriptorImpl]

'publicKey' @ [121:94] ==> value-parameter publicKey: PublicKey defined in net.corda.testing.node.MockKeyManagementService.getSigner[ValueParameterDescriptorImpl]

'publicKey' @ [124:18] ==> value-parameter publicKey: PublicKey defined in net.corda.testing.node.MockKeyManagementService.getSigningKeyPair[ValueParameterDescriptorImpl]

'keys' @ [124:28] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'first' @ [124:33] ==> public inline fun <T> Iterable<PublicKey>.first(predicate: (PublicKey) -> Boolean): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'keyStore' @ [124:41] ==> private final val keyStore: MutableMap<PublicKey, PrivateKey> defined in net.corda.testing.node.MockKeyManagementService[PropertyDescriptorImpl]

'containsKey' @ [124:50] ==> public abstract fun containsKey(key: PublicKey): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'it' @ [124:62] ==> value-parameter it: PublicKey defined in net.corda.testing.node.MockKeyManagementService.getSigningKeyPair.<anonymous>[ValueParameterDescriptorImpl]

'KeyPair' @ [125:16] ==> public constructor KeyPair(p0: (PublicKey..PublicKey?), p1: (PrivateKey..PrivateKey?)) defined in java.security.KeyPair[JavaClassConstructorDescriptor]

'pk' @ [125:24] ==> val pk: PublicKey defined in net.corda.testing.node.MockKeyManagementService.getSigningKeyPair[LocalVariableDescriptor]

'keyStore' @ [125:28] ==> private final val keyStore: MutableMap<PublicKey, PrivateKey> defined in net.corda.testing.node.MockKeyManagementService[PropertyDescriptorImpl]

'pk' @ [125:37] ==> val pk: PublicKey defined in net.corda.testing.node.MockKeyManagementService.getSigningKeyPair[LocalVariableDescriptor]

'getSigningKeyPair' @ [129:23] ==> private final fun getSigningKeyPair(publicKey: PublicKey): KeyPair defined in net.corda.testing.node.MockKeyManagementService[SimpleFunctionDescriptorImpl]

'publicKey' @ [129:41] ==> value-parameter publicKey: PublicKey defined in net.corda.testing.node.MockKeyManagementService.sign[ValueParameterDescriptorImpl]

'keyPair' @ [130:16] ==> val keyPair: KeyPair defined in net.corda.testing.node.MockKeyManagementService.sign[LocalVariableDescriptor]

'sign' @ [130:24] ==> public fun KeyPair.sign(bytesToSign: ByteArray): DigitalSignature.WithKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'bytes' @ [130:29] ==> value-parameter bytes: ByteArray defined in net.corda.testing.node.MockKeyManagementService.sign[ValueParameterDescriptorImpl]

'getSigningKeyPair' @ [134:23] ==> private final fun getSigningKeyPair(publicKey: PublicKey): KeyPair defined in net.corda.testing.node.MockKeyManagementService[SimpleFunctionDescriptorImpl]

'publicKey' @ [134:41] ==> value-parameter publicKey: PublicKey defined in net.corda.testing.node.MockKeyManagementService.sign[ValueParameterDescriptorImpl]

'keyPair' @ [135:16] ==> val keyPair: KeyPair defined in net.corda.testing.node.MockKeyManagementService.sign[LocalVariableDescriptor]

'sign' @ [135:24] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signableData' @ [135:29] ==> value-parameter signableData: SignableData defined in net.corda.testing.node.MockKeyManagementService.sign[ValueParameterDescriptorImpl]

'SingletonSerializeAsToken' @ [139:50] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'HashMap' @ [140:17] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SecureHash
    <V : (Any..Any?)> -> ByteArray

'files' @ [143:17] ==> public final val files: HashMap<SecureHash, ByteArray> defined in net.corda.testing.node.MockAttachmentStorage[PropertyDescriptorImpl]

'id' @ [143:23] ==> value-parameter id: SecureHash defined in net.corda.testing.node.MockAttachmentStorage.openAttachment[ValueParameterDescriptorImpl]

'ByteArrayInputStream' @ [145:48] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'f' @ [145:69] ==> val f: ByteArray defined in net.corda.testing.node.MockAttachmentStorage.openAttachment[LocalVariableDescriptor]

'id' @ [146:43] ==> value-parameter id: SecureHash defined in net.corda.testing.node.MockAttachmentStorage.openAttachment[ValueParameterDescriptorImpl]

'require' @ [152:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'jar' @ [152:17] ==> value-parameter jar: InputStream defined in net.corda.testing.node.MockAttachmentStorage.importAttachment[ValueParameterDescriptorImpl]

'run' @ [154:21] ==> @InlineOnly public inline fun <T, R> MockAttachmentStorage.run(block: MockAttachmentStorage.() -> (ByteArray..ByteArray?)): (ByteArray..ByteArray?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockAttachmentStorage
    <R> -> (kotlin.ByteArray..kotlin.ByteArray?)

'ByteArrayOutputStream' @ [155:21] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'jar' @ [156:13] ==> value-parameter jar: InputStream defined in net.corda.testing.node.MockAttachmentStorage.importAttachment[ValueParameterDescriptorImpl]

'copyTo' @ [156:17] ==> public fun InputStream.copyTo(out: OutputStream, bufferSize: Int = ...): Long defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

's' @ [156:24] ==> val s: ByteArrayOutputStream defined in net.corda.testing.node.MockAttachmentStorage.importAttachment.<anonymous>[LocalVariableDescriptor]

's' @ [157:13] ==> val s: ByteArrayOutputStream defined in net.corda.testing.node.MockAttachmentStorage.importAttachment.<anonymous>[LocalVariableDescriptor]

'close' @ [157:15] ==> public open fun close(): Unit defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

's' @ [158:13] ==> val s: ByteArrayOutputStream defined in net.corda.testing.node.MockAttachmentStorage.importAttachment.<anonymous>[LocalVariableDescriptor]

'toByteArray' @ [158:15] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'bytes' @ [160:22] ==> val bytes: (ByteArray..ByteArray?) defined in net.corda.testing.node.MockAttachmentStorage.importAttachment[LocalVariableDescriptor]

'sha256' @ [160:28] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'files' @ [161:13] ==> public final val files: HashMap<SecureHash, ByteArray> defined in net.corda.testing.node.MockAttachmentStorage[PropertyDescriptorImpl]

'containsKey' @ [161:19] ==> public open fun containsKey(key: SecureHash): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'sha256' @ [161:31] ==> val sha256: SecureHash.SHA256 defined in net.corda.testing.node.MockAttachmentStorage.importAttachment[LocalVariableDescriptor]

'FileAlreadyExistsException' @ [162:19] ==> public constructor FileAlreadyExistsException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.FileAlreadyExistsException[DeserializedClassConstructorDescriptor]

'File' @ [162:46] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'files' @ [163:9] ==> public final val files: HashMap<SecureHash, ByteArray> defined in net.corda.testing.node.MockAttachmentStorage[PropertyDescriptorImpl]

'sha256' @ [163:15] ==> val sha256: SecureHash.SHA256 defined in net.corda.testing.node.MockAttachmentStorage.importAttachment[LocalVariableDescriptor]

'bytes' @ [163:25] ==> val bytes: (ByteArray..ByteArray?) defined in net.corda.testing.node.MockAttachmentStorage.importAttachment[LocalVariableDescriptor]

'sha256' @ [164:16] ==> val sha256: SecureHash.SHA256 defined in net.corda.testing.node.MockAttachmentStorage.importAttachment[LocalVariableDescriptor]

'InMemoryStateMachineRecordedTransactionMappingStorage' @ [169:70] ==> public constructor InMemoryStateMachineRecordedTransactionMappingStorage() defined in net.corda.node.services.persistence.InMemoryStateMachineRecordedTransactionMappingStorage[DeserializedClassConstructorDescriptor]

'storage' @ [170:54] ==> value-parameter storage: StateMachineRecordedTransactionMappingStorage = ... defined in net.corda.testing.node.MockStateMachineRecordedTransactionMappingStorage.<init>[ValueParameterDescriptorImpl]

'SingletonSerializeAsToken' @ [172:65] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'DataFeed' @ [174:16] ==> public constructor DataFeed<out A, B>(snapshot: List<SignedTransaction>, updates: Observable<(SignedTransaction..SignedTransaction?)>) defined in net.corda.core.messaging.DataFeed[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<SignedTransaction>
    <B> -> (net.corda.core.transactions.SignedTransaction..net.corda.core.transactions.SignedTransaction?)

'txns' @ [174:25] ==> private final val txns: HashMap<SecureHash, SignedTransaction> defined in net.corda.testing.node.MockTransactionStorage[PropertyDescriptorImpl]

'values' @ [174:30] ==> public open val values: MutableCollection<SignedTransaction> defined in java.util.HashMap[JavaPropertyDescriptor]

'toList' @ [174:37] ==> public fun <T> Iterable<SignedTransaction>.toList(): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'_updatesPublisher' @ [174:47] ==> private final val _updatesPublisher: (PublishSubject<(SignedTransaction..SignedTransaction?)>..PublishSubject<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.testing.node.MockTransactionStorage[PropertyDescriptorImpl]

'HashMap' @ [177:24] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SecureHash
    <V : (Any..Any?)> -> SignedTransaction

'create' @ [179:52] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(SignedTransaction..SignedTransaction?)>..PublishSubject<(SignedTransaction..SignedTransaction?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction

'_updatesPublisher' @ [182:17] ==> private final val _updatesPublisher: (PublishSubject<(SignedTransaction..SignedTransaction?)>..PublishSubject<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.testing.node.MockTransactionStorage[PropertyDescriptorImpl]

'_updatesPublisher' @ [184:58] ==> private final val _updatesPublisher: (PublishSubject<(SignedTransaction..SignedTransaction?)>..PublishSubject<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.testing.node.MockTransactionStorage[PropertyDescriptorImpl]

'onNext' @ [184:76] ==> public open fun onNext(p0: (SignedTransaction..SignedTransaction?)): Unit defined in rx.subjects.PublishSubject[JavaMethodDescriptor]

'transaction' @ [184:83] ==> value-parameter transaction: SignedTransaction defined in net.corda.testing.node.MockTransactionStorage.notify[ValueParameterDescriptorImpl]

'txns' @ [187:24] ==> private final val txns: HashMap<SecureHash, SignedTransaction> defined in net.corda.testing.node.MockTransactionStorage[PropertyDescriptorImpl]

'putIfAbsent' @ [187:29] ==> public open fun putIfAbsent(p0: SecureHash, p1: SignedTransaction): SignedTransaction? defined in java.util.HashMap[JavaMethodDescriptor]

'transaction' @ [187:41] ==> value-parameter transaction: SignedTransaction defined in net.corda.testing.node.MockTransactionStorage.addTransaction[ValueParameterDescriptorImpl]

'id' @ [187:53] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'transaction' @ [187:57] ==> value-parameter transaction: SignedTransaction defined in net.corda.testing.node.MockTransactionStorage.addTransaction[ValueParameterDescriptorImpl]

'recorded' @ [188:13] ==> val recorded: Boolean defined in net.corda.testing.node.MockTransactionStorage.addTransaction[LocalVariableDescriptor]

'notify' @ [189:13] ==> private final fun notify(transaction: SignedTransaction): Unit defined in net.corda.testing.node.MockTransactionStorage[SimpleFunctionDescriptorImpl]

'transaction' @ [189:20] ==> value-parameter transaction: SignedTransaction defined in net.corda.testing.node.MockTransactionStorage.addTransaction[ValueParameterDescriptorImpl]

'recorded' @ [191:16] ==> val recorded: Boolean defined in net.corda.testing.node.MockTransactionStorage.addTransaction[LocalVariableDescriptor]

'txns' @ [194:71] ==> private final val txns: HashMap<SecureHash, SignedTransaction> defined in net.corda.testing.node.MockTransactionStorage[PropertyDescriptorImpl]

'id' @ [194:76] ==> value-parameter id: SecureHash defined in net.corda.testing.node.MockTransactionStorage.getTransaction[ValueParameterDescriptorImpl]

'SecureHash' @ [203:53] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [203:64] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'toString' @ [203:79] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedSimpleFunctionDescriptor]

'Properties' @ [204:17] ==> public constructor Properties() defined in java.util.Properties[JavaClassConstructorDescriptor]

'props' @ [205:5] ==> val props: Properties defined in net.corda.testing.node.makeTestDataSourceProperties[LocalVariableDescriptor]

'setProperty' @ [205:11] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Any..Any?) defined in java.util.Properties[JavaMethodDescriptor]

'props' @ [206:5] ==> val props: Properties defined in net.corda.testing.node.makeTestDataSourceProperties[LocalVariableDescriptor]

'setProperty' @ [206:11] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Any..Any?) defined in java.util.Properties[JavaMethodDescriptor]

'nodeName' @ [206:56] ==> value-parameter nodeName: String = ... defined in net.corda.testing.node.makeTestDataSourceProperties[ValueParameterDescriptorImpl]

'props' @ [207:5] ==> val props: Properties defined in net.corda.testing.node.makeTestDataSourceProperties[LocalVariableDescriptor]

'setProperty' @ [207:11] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Any..Any?) defined in java.util.Properties[JavaMethodDescriptor]

'props' @ [208:5] ==> val props: Properties defined in net.corda.testing.node.makeTestDataSourceProperties[LocalVariableDescriptor]

'setProperty' @ [208:11] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Any..Any?) defined in java.util.Properties[JavaMethodDescriptor]

'props' @ [209:12] ==> val props: Properties defined in net.corda.testing.node.makeTestDataSourceProperties[LocalVariableDescriptor]

'Properties' @ [213:17] ==> public constructor Properties() defined in java.util.Properties[JavaClassConstructorDescriptor]

'props' @ [214:5] ==> val props: Properties defined in net.corda.testing.node.makeTestDatabaseProperties[LocalVariableDescriptor]

'setProperty' @ [214:11] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Any..Any?) defined in java.util.Properties[JavaMethodDescriptor]

'key' @ [215:9] ==> value-parameter key: String? = ... defined in net.corda.testing.node.makeTestDatabaseProperties[ValueParameterDescriptorImpl]

'props' @ [215:24] ==> val props: Properties defined in net.corda.testing.node.makeTestDatabaseProperties[LocalVariableDescriptor]

'setProperty' @ [215:30] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (Any..Any?) defined in java.util.Properties[JavaMethodDescriptor]

'key' @ [215:42] ==> value-parameter key: String? = ... defined in net.corda.testing.node.makeTestDatabaseProperties[ValueParameterDescriptorImpl]

'value' @ [215:47] ==> value-parameter value: String? = ... defined in net.corda.testing.node.makeTestDatabaseProperties[ValueParameterDescriptorImpl]

'props' @ [216:12] ==> val props: Properties defined in net.corda.testing.node.makeTestDatabaseProperties[LocalVariableDescriptor]

'InMemoryIdentityService' @ [219:33] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'MOCK_IDENTITIES' @ [219:57] ==> public val MOCK_IDENTITIES: List<PartyAndCertificate> defined in net.corda.testing in file CoreTestUtils.kt[PropertyDescriptorImpl]

'DUMMY_CA' @ [219:86] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'certificate' @ [219:95] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'setOf' @ [221:72] ==> public fun <T> setOf(vararg elements: MappedSchema): Set<MappedSchema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MappedSchema

'CommercialPaperSchemaV1' @ [221:78] ==> @CordaSerializable public object CommercialPaperSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'DummyLinearStateSchemaV1' @ [221:103] ==> public object DummyLinearStateSchemaV1 : MappedSchema defined in net.corda.testing.schemas in file DummyLinearStateSchemaV1.kt[FakeCallableDescriptorForObject]

'CashSchemaV1' @ [221:129] ==> @CordaSerializable public object CashSchemaV1 : MappedSchema defined in net.corda.finance.schemas[FakeCallableDescriptorForObject]

'listOf' @ [222:59] ==> public fun <T> listOf(element: KeyPair): List<KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPair

'MEGA_CORP_KEY' @ [222:66] ==> public val MEGA_CORP_KEY: KeyPair defined in net.corda.testing in file CoreTestUtils.kt[PropertyDescriptorImpl]

'makeTestIdentityService' @ [223:86] ==> public fun makeTestIdentityService(): InMemoryIdentityService defined in net.corda.testing.node in file MockServices.kt[SimpleFunctionDescriptorImpl]

'makeTestDataSourceProperties' @ [224:27] ==> public fun makeTestDataSourceProperties(nodeName: String = ...): Properties defined in net.corda.testing.node in file MockServices.kt[SimpleFunctionDescriptorImpl]

'makeTestDatabaseProperties' @ [225:30] ==> public fun makeTestDatabaseProperties(key: String? = ..., value: String? = ...): Properties defined in net.corda.testing.node in file MockServices.kt[SimpleFunctionDescriptorImpl]

'NodeSchemaService' @ [226:33] ==> public constructor NodeSchemaService(customSchemas: Set<MappedSchema> = ...) defined in net.corda.node.services.schema.NodeSchemaService[DeserializedClassConstructorDescriptor]

'customSchemas' @ [226:51] ==> value-parameter customSchemas: Set<MappedSchema> = ... defined in net.corda.testing.node.makeTestDatabaseAndMockServices[ValueParameterDescriptorImpl]

'configureDatabase' @ [227:20] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'dataSourceProps' @ [227:38] ==> val dataSourceProps: Properties defined in net.corda.testing.node.makeTestDatabaseAndMockServices[LocalVariableDescriptor]

'databaseProperties' @ [227:55] ==> val databaseProperties: Properties defined in net.corda.testing.node.makeTestDatabaseAndMockServices[LocalVariableDescriptor]

'createSchemaService' @ [227:75] ==> val createSchemaService: () -> NodeSchemaService defined in net.corda.testing.node.makeTestDatabaseAndMockServices[LocalVariableDescriptor]

'createIdentityService' @ [227:96] ==> value-parameter createIdentityService: () -> IdentityService = ... defined in net.corda.testing.node.makeTestDatabaseAndMockServices[ValueParameterDescriptorImpl]

'database' @ [228:23] ==> val database: CordaPersistence defined in net.corda.testing.node.makeTestDatabaseAndMockServices[LocalVariableDescriptor]

'transaction' @ [228:32] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> <no name provided>): <no name provided> defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>

'MockServices' @ [229:18] ==> public constructor MockServices(vararg keys: KeyPair) defined in net.corda.testing.node.MockServices[ClassConstructorDescriptorImpl]

'keys' @ [229:33] ==> value-parameter keys: List<KeyPair> = ... defined in net.corda.testing.node.makeTestDatabaseAndMockServices[ValueParameterDescriptorImpl]

'toTypedArray' @ [229:38] ==> public inline fun <reified T> Collection<KeyPair>.toTypedArray(): Array<KeyPair> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KeyPair

'makeVaultService' @ [230:55] ==> public final fun makeVaultService(hibernateConfig: HibernateConfiguration): VaultService defined in net.corda.testing.node.makeTestDatabaseAndMockServices.<anonymous>.<no name provided>[SimpleFunctionDescriptorImpl]

'database' @ [230:72] ==> val database: CordaPersistence defined in net.corda.testing.node.makeTestDatabaseAndMockServices[LocalVariableDescriptor]

'hibernateConfig' @ [230:81] ==> public final val hibernateConfig: HibernateConfiguration defined in net.corda.node.utilities.CordaPersistence[DeserializedPropertyDescriptor]

'txs' @ [233:29] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.testing.node.makeTestDatabaseAndMockServices.<anonymous>.<no name provided>.recordTransactions[ValueParameterDescriptorImpl]

'validatedTransactions' @ [234:21] ==> public open val validatedTransactions: WritableTransactionStorage defined in net.corda.testing.node.makeTestDatabaseAndMockServices.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'addTransaction' @ [234:43] ==> public abstract fun addTransaction(transaction: SignedTransaction): Boolean defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'stx' @ [234:58] ==> val stx: SignedTransaction defined in net.corda.testing.node.makeTestDatabaseAndMockServices.<anonymous>.<no name provided>.recordTransactions[LocalVariableDescriptor]

'vaultService' @ [237:17] ==> public open val vaultService: VaultService defined in net.corda.testing.node.makeTestDatabaseAndMockServices.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'notifyAll' @ [237:30] ==> public abstract fun notifyAll(txns: Iterable<CoreTransaction>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'txs' @ [237:40] ==> value-parameter txs: Iterable<SignedTransaction> defined in net.corda.testing.node.makeTestDatabaseAndMockServices.<anonymous>.<no name provided>.recordTransactions[ValueParameterDescriptorImpl]

'map' @ [237:44] ==> public inline fun <T, R> Iterable<SignedTransaction>.map(transform: (SignedTransaction) -> WireTransaction): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> WireTransaction

'it' @ [237:50] ==> value-parameter it: SignedTransaction defined in net.corda.testing.node.makeTestDatabaseAndMockServices.<anonymous>.<no name provided>.recordTransactions.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [237:53] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'HibernateVaultQueryImpl' @ [240:65] ==> public constructor HibernateVaultQueryImpl(hibernateConfig: HibernateConfiguration, vault: VaultService) defined in net.corda.node.services.vault.HibernateVaultQueryImpl[DeserializedClassConstructorDescriptor]

'database' @ [240:89] ==> val database: CordaPersistence defined in net.corda.testing.node.makeTestDatabaseAndMockServices[LocalVariableDescriptor]

'hibernateConfig' @ [240:98] ==> public final val hibernateConfig: HibernateConfiguration defined in net.corda.node.utilities.CordaPersistence[DeserializedPropertyDescriptor]

'vaultService' @ [240:115] ==> public open val vaultService: VaultService defined in net.corda.testing.node.makeTestDatabaseAndMockServices.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'database' @ [242:54] ==> val database: CordaPersistence defined in net.corda.testing.node.makeTestDatabaseAndMockServices[LocalVariableDescriptor]

'createSession' @ [242:63] ==> public final fun createSession(): Connection defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'Pair' @ [245:12] ==> public constructor Pair<out A, out B>(first: CordaPersistence, second: <no name provided>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> CordaPersistence
    <out B> -> <no name provided>

'database' @ [245:17] ==> val database: CordaPersistence defined in net.corda.testing.node.makeTestDatabaseAndMockServices[LocalVariableDescriptor]

'mockService' @ [245:27] ==> val mockService: <no name provided> defined in net.corda.testing.node.makeTestDatabaseAndMockServices[LocalVariableDescriptor]

'VersionInfo' @ [248:25] ==> public constructor VersionInfo(platformVersion: Int, releaseVersion: String, revision: String, vendor: String) defined in net.corda.node.VersionInfo[DeserializedClassConstructorDescriptor]

