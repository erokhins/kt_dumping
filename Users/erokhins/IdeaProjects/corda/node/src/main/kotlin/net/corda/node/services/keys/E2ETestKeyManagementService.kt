'ThreadSafe' @ [27:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [29:64] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'HashMap' @ [31:20] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PublicKey
    <V : (Any..Any?)> -> PrivateKey

'ThreadBox' @ [34:25] ==> public constructor ThreadBox<out T>(content: E2ETestKeyManagementService.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [34:35] ==> public constructor InnerState() defined in net.corda.node.services.keys.E2ETestKeyManagementService.InnerState[ClassConstructorDescriptorImpl]

'mutex' @ [37:9] ==> private final val mutex: ThreadBox<E2ETestKeyManagementService.InnerState> defined in net.corda.node.services.keys.E2ETestKeyManagementService[PropertyDescriptorImpl]

'locked' @ [37:15] ==> public final inline fun <R> locked(body: E2ETestKeyManagementService.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'initialKeys' @ [38:25] ==> value-parameter initialKeys: Set<KeyPair> defined in net.corda.node.services.keys.E2ETestKeyManagementService.<init>[ValueParameterDescriptorImpl]

'keys' @ [39:17] ==> public final val keys: HashMap<PublicKey, PrivateKey> defined in net.corda.node.services.keys.E2ETestKeyManagementService.InnerState[PropertyDescriptorImpl]

'key' @ [39:22] ==> val key: KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService.<init>.<anonymous>[LocalVariableDescriptor]

'public' @ [39:26] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'key' @ [39:36] ==> val key: KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService.<init>.<anonymous>[LocalVariableDescriptor]

'private' @ [39:40] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'mutex' @ [45:47] ==> private final val mutex: ThreadBox<E2ETestKeyManagementService.InnerState> defined in net.corda.node.services.keys.E2ETestKeyManagementService[PropertyDescriptorImpl]

'locked' @ [45:53] ==> public final inline fun <R> locked(body: E2ETestKeyManagementService.InnerState.() -> MutableSet<PublicKey>): MutableSet<PublicKey> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> MutableSet<PublicKey>

'keys' @ [45:62] ==> public final val keys: HashMap<PublicKey, PrivateKey> defined in net.corda.node.services.keys.E2ETestKeyManagementService.InnerState[PropertyDescriptorImpl]

'keys' @ [45:67] ==> public open val keys: MutableSet<PublicKey> defined in java.util.HashMap[JavaPropertyDescriptor]

'generateKeyPair' @ [48:23] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'mutex' @ [49:9] ==> private final val mutex: ThreadBox<E2ETestKeyManagementService.InnerState> defined in net.corda.node.services.keys.E2ETestKeyManagementService[PropertyDescriptorImpl]

'locked' @ [49:15] ==> public final inline fun <R> locked(body: E2ETestKeyManagementService.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'keys' @ [50:13] ==> public final val keys: HashMap<PublicKey, PrivateKey> defined in net.corda.node.services.keys.E2ETestKeyManagementService.InnerState[PropertyDescriptorImpl]

'keyPair' @ [50:18] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService.freshKey[LocalVariableDescriptor]

'public' @ [50:26] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPair' @ [50:36] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService.freshKey[LocalVariableDescriptor]

'private' @ [50:44] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'keyPair' @ [52:16] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService.freshKey[LocalVariableDescriptor]

'public' @ [52:24] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'freshCertificate' @ [56:16] ==> public fun freshCertificate(identityService: IdentityService, subjectPublicKey: PublicKey, issuer: PartyAndCertificate, issuerSigner: ContentSigner, revocationEnabled: Boolean = ...): PartyAndCertificate defined in net.corda.node.services.keys in file KMSUtils.kt[SimpleFunctionDescriptorImpl]

'identityService' @ [56:33] ==> public final val identityService: IdentityService defined in net.corda.node.services.keys.E2ETestKeyManagementService[PropertyDescriptorImpl]

'freshKey' @ [56:50] ==> public open fun freshKey(): PublicKey defined in net.corda.node.services.keys.E2ETestKeyManagementService[SimpleFunctionDescriptorImpl]

'identity' @ [56:62] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.keys.E2ETestKeyManagementService.freshKeyAndCert[ValueParameterDescriptorImpl]

'getSigner' @ [56:72] ==> private final fun getSigner(publicKey: PublicKey): ContentSigner defined in net.corda.node.services.keys.E2ETestKeyManagementService[SimpleFunctionDescriptorImpl]

'identity' @ [56:82] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.keys.E2ETestKeyManagementService.freshKeyAndCert[ValueParameterDescriptorImpl]

'owningKey' @ [56:91] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'revocationEnabled' @ [56:103] ==> value-parameter revocationEnabled: Boolean defined in net.corda.node.services.keys.E2ETestKeyManagementService.freshKeyAndCert[ValueParameterDescriptorImpl]

'getSigner' @ [59:66] ==> public fun getSigner(issuerKeyPair: KeyPair): ContentSigner defined in net.corda.node.services.keys in file KMSUtils.kt[SimpleFunctionDescriptorImpl]

'getSigningKeyPair' @ [59:76] ==> private final fun getSigningKeyPair(publicKey: PublicKey): KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService[SimpleFunctionDescriptorImpl]

'publicKey' @ [59:94] ==> value-parameter publicKey: PublicKey defined in net.corda.node.services.keys.E2ETestKeyManagementService.getSigner[ValueParameterDescriptorImpl]

'mutex' @ [62:16] ==> private final val mutex: ThreadBox<E2ETestKeyManagementService.InnerState> defined in net.corda.node.services.keys.E2ETestKeyManagementService[PropertyDescriptorImpl]

'locked' @ [62:22] ==> public final inline fun <R> locked(body: E2ETestKeyManagementService.InnerState.() -> KeyPair): KeyPair defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> KeyPair

'publicKey' @ [63:22] ==> value-parameter publicKey: PublicKey defined in net.corda.node.services.keys.E2ETestKeyManagementService.getSigningKeyPair[ValueParameterDescriptorImpl]

'keys' @ [63:32] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'first' @ [63:37] ==> public inline fun <T> Iterable<PublicKey>.first(predicate: (PublicKey) -> Boolean): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'keys' @ [63:45] ==> public final val keys: HashMap<PublicKey, PrivateKey> defined in net.corda.node.services.keys.E2ETestKeyManagementService.InnerState[PropertyDescriptorImpl]

'containsKey' @ [63:50] ==> public open fun containsKey(key: PublicKey): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'it' @ [63:62] ==> value-parameter it: PublicKey defined in net.corda.node.services.keys.E2ETestKeyManagementService.getSigningKeyPair.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KeyPair' @ [64:13] ==> public constructor KeyPair(p0: (PublicKey..PublicKey?), p1: (PrivateKey..PrivateKey?)) defined in java.security.KeyPair[JavaClassConstructorDescriptor]

'pk' @ [64:21] ==> val pk: PublicKey defined in net.corda.node.services.keys.E2ETestKeyManagementService.getSigningKeyPair.<anonymous>[LocalVariableDescriptor]

'keys' @ [64:25] ==> public final val keys: HashMap<PublicKey, PrivateKey> defined in net.corda.node.services.keys.E2ETestKeyManagementService.InnerState[PropertyDescriptorImpl]

'pk' @ [64:30] ==> val pk: PublicKey defined in net.corda.node.services.keys.E2ETestKeyManagementService.getSigningKeyPair.<anonymous>[LocalVariableDescriptor]

'mutex' @ [69:16] ==> private final val mutex: ThreadBox<E2ETestKeyManagementService.InnerState> defined in net.corda.node.services.keys.E2ETestKeyManagementService[PropertyDescriptorImpl]

'locked' @ [69:22] ==> public final inline fun <R> locked(body: E2ETestKeyManagementService.InnerState.() -> List<PublicKey>): List<PublicKey> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<PublicKey>

'candidateKeys' @ [69:31] ==> value-parameter candidateKeys: Iterable<PublicKey> defined in net.corda.node.services.keys.E2ETestKeyManagementService.filterMyKeys[ValueParameterDescriptorImpl]

'filter' @ [69:45] ==> public inline fun <T> Iterable<PublicKey>.filter(predicate: (PublicKey) -> Boolean): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'it' @ [69:54] ==> value-parameter it: PublicKey defined in net.corda.node.services.keys.E2ETestKeyManagementService.filterMyKeys.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [69:60] ==> <this> defined in net.corda.node.services.keys.E2ETestKeyManagementService.filterMyKeys.<anonymous>[ReceiverParameterDescriptorImpl]

'keys' @ [69:65] ==> public final val keys: HashMap<PublicKey, PrivateKey> defined in net.corda.node.services.keys.E2ETestKeyManagementService.InnerState[PropertyDescriptorImpl]

'getSigningKeyPair' @ [73:23] ==> private final fun getSigningKeyPair(publicKey: PublicKey): KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService[SimpleFunctionDescriptorImpl]

'publicKey' @ [73:41] ==> value-parameter publicKey: PublicKey defined in net.corda.node.services.keys.E2ETestKeyManagementService.sign[ValueParameterDescriptorImpl]

'keyPair' @ [74:16] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService.sign[LocalVariableDescriptor]

'sign' @ [74:24] ==> public fun KeyPair.sign(bytesToSign: ByteArray): DigitalSignature.WithKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'bytes' @ [74:29] ==> value-parameter bytes: ByteArray defined in net.corda.node.services.keys.E2ETestKeyManagementService.sign[ValueParameterDescriptorImpl]

'getSigningKeyPair' @ [80:23] ==> private final fun getSigningKeyPair(publicKey: PublicKey): KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService[SimpleFunctionDescriptorImpl]

'publicKey' @ [80:41] ==> value-parameter publicKey: PublicKey defined in net.corda.node.services.keys.E2ETestKeyManagementService.sign[ValueParameterDescriptorImpl]

'keyPair' @ [81:16] ==> val keyPair: KeyPair defined in net.corda.node.services.keys.E2ETestKeyManagementService.sign[LocalVariableDescriptor]

'sign' @ [81:24] ==> public fun KeyPair.sign(signableData: SignableData): TransactionSignature defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'signableData' @ [81:29] ==> value-parameter signableData: SignableData defined in net.corda.node.services.keys.E2ETestKeyManagementService.sign[ValueParameterDescriptorImpl]

