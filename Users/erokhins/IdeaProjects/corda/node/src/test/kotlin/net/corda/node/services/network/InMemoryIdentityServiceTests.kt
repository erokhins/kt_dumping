'Test' @ [26:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'InMemoryIdentityService' @ [28:23] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'DUMMY_CA' @ [28:59] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'certificate' @ [28:68] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'assertNull' @ [30:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'service' @ [30:20] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'getAllIdentities' @ [30:28] ==> public open fun getAllIdentities(): Iterable<PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [30:47] ==> public fun <T> Iterable<PartyAndCertificate>.firstOrNull(): PartyAndCertificate? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'service' @ [32:9] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [32:17] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'ALICE_IDENTITY' @ [32:43] ==> public val ALICE_IDENTITY: PartyAndCertificate defined in net.corda.testing[DeserializedPropertyDescriptor]

'setOf' @ [33:24] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'ALICE' @ [33:30] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'service' @ [34:22] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'getAllIdentities' @ [34:30] ==> public open fun getAllIdentities(): Iterable<PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'map' @ [34:49] ==> public inline fun <T, R> Iterable<PartyAndCertificate>.map(transform: (PartyAndCertificate) -> Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate
    <R> -> Party

'it' @ [34:55] ==> value-parameter it: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [34:58] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'toHashSet' @ [34:66] ==> public fun <T> Iterable<Party>.toHashSet(): HashSet<Party> /* = HashSet<Party> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'assertEquals' @ [35:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<Party>, actual: Set<Party>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<Party>

'expected' @ [35:22] ==> var expected: Set<Party> defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'actual' @ [35:32] ==> var actual: HashSet<Party> /* = HashSet<Party> */ defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'service' @ [38:9] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [38:17] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'BOB_IDENTITY' @ [38:43] ==> public val BOB_IDENTITY: PartyAndCertificate defined in net.corda.testing[DeserializedPropertyDescriptor]

'expected' @ [39:9] ==> var expected: Set<Party> defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'setOf' @ [39:20] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'ALICE' @ [39:26] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'BOB' @ [39:33] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'actual' @ [40:9] ==> var actual: HashSet<Party> /* = HashSet<Party> */ defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'service' @ [40:18] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'getAllIdentities' @ [40:26] ==> public open fun getAllIdentities(): Iterable<PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'map' @ [40:45] ==> public inline fun <T, R> Iterable<PartyAndCertificate>.map(transform: (PartyAndCertificate) -> Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate
    <R> -> Party

'it' @ [40:51] ==> value-parameter it: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [40:54] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'toHashSet' @ [40:62] ==> public fun <T> Iterable<Party>.toHashSet(): HashSet<Party> /* = HashSet<Party> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'assertEquals' @ [41:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<Party>, actual: Set<Party>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<Party>

'expected' @ [41:22] ==> var expected: Set<Party> defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'actual' @ [41:32] ==> var actual: HashSet<Party> /* = HashSet<Party> */ defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get all identities`[LocalVariableDescriptor]

'Test' @ [44:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'InMemoryIdentityService' @ [46:23] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'DUMMY_CA' @ [46:59] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'certificate' @ [46:68] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'assertNull' @ [47:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'service' @ [47:20] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by key`[LocalVariableDescriptor]

'partyFromKey' @ [47:28] ==> public open fun partyFromKey(key: PublicKey): Party? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [47:41] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'service' @ [48:9] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by key`[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [48:17] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'ALICE_IDENTITY' @ [48:43] ==> public val ALICE_IDENTITY: PartyAndCertificate defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertEquals' @ [49:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party?, actual: Party?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party?

'ALICE' @ [49:22] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'service' @ [49:29] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by key`[LocalVariableDescriptor]

'partyFromKey' @ [49:37] ==> public open fun partyFromKey(key: PublicKey): Party? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'ALICE_PUBKEY' @ [49:50] ==> public val ALICE_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'assertNull' @ [50:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'service' @ [50:20] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by key`[LocalVariableDescriptor]

'partyFromKey' @ [50:28] ==> public open fun partyFromKey(key: PublicKey): Party? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'BOB_PUBKEY' @ [50:41] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'Test' @ [53:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'InMemoryIdentityService' @ [55:23] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'DUMMY_CA' @ [55:59] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'certificate' @ [55:68] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'assertNull' @ [56:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'service' @ [56:20] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name with no registered identities`[LocalVariableDescriptor]

'partyFromX500Name' @ [56:28] ==> public open fun partyFromX500Name(principal: X500Name): Party? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'ALICE' @ [56:46] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [56:52] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Test' @ [59:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DUMMY_CA' @ [61:25] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'InMemoryIdentityService' @ [62:23] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'trustRoot' @ [62:59] ==> val trustRoot: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by substring match`[LocalVariableDescriptor]

'certificate' @ [62:69] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'service' @ [63:9] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by substring match`[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [63:17] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'ALICE_IDENTITY' @ [63:43] ==> public val ALICE_IDENTITY: PartyAndCertificate defined in net.corda.testing[DeserializedPropertyDescriptor]

'service' @ [64:9] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by substring match`[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [64:17] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'BOB_IDENTITY' @ [64:43] ==> public val BOB_IDENTITY: PartyAndCertificate defined in net.corda.testing[DeserializedPropertyDescriptor]

'getTestPartyAndCertificate' @ [65:24] ==> public fun getTestPartyAndCertificate(name: X500Name, publicKey: PublicKey, trustRoot: CertificateAndKeyPair = ...): PartyAndCertificate defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'X500Name' @ [65:51] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'generateKeyPair' @ [65:99] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'public' @ [65:117] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'service' @ [66:9] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by substring match`[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [66:17] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'alicente' @ [66:43] ==> val alicente: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by substring match`[LocalVariableDescriptor]

'assertEquals' @ [67:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<Party>, actual: Set<Party>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<Party>

'setOf' @ [67:22] ==> public fun <T> setOf(vararg elements: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'ALICE' @ [67:28] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'alicente' @ [67:35] ==> val alicente: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by substring match`[LocalVariableDescriptor]

'party' @ [67:44] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'service' @ [67:52] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by substring match`[LocalVariableDescriptor]

'partiesFromName' @ [67:60] ==> public open fun partiesFromName(query: String, exactMatch: Boolean): Set<Party> defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [68:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<Party>, actual: Set<Party>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<Party>

'setOf' @ [68:22] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'ALICE' @ [68:28] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'service' @ [68:36] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by substring match`[LocalVariableDescriptor]

'partiesFromName' @ [68:44] ==> public open fun partiesFromName(query: String, exactMatch: Boolean): Set<Party> defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [69:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Set<Party>, actual: Set<Party>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Set<Party>

'setOf' @ [69:22] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'BOB' @ [69:28] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'service' @ [69:34] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by substring match`[LocalVariableDescriptor]

'partiesFromName' @ [69:42] ==> public open fun partiesFromName(query: String, exactMatch: Boolean): Set<Party> defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'Test' @ [72:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'InMemoryIdentityService' @ [74:23] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'DUMMY_CA' @ [74:59] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'certificate' @ [74:68] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'listOf' @ [75:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [76:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> PartyAndCertificate): List<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> PartyAndCertificate

'getTestPartyAndCertificate' @ [76:24] ==> public fun getTestPartyAndCertificate(name: X500Name, publicKey: PublicKey, trustRoot: CertificateAndKeyPair = ...): PartyAndCertificate defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'X500Name' @ [76:51] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'it' @ [76:65] ==> value-parameter it: String defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`.<anonymous>[ValueParameterDescriptorImpl]

'generateKeyPair' @ [76:99] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'public' @ [76:117] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertNull' @ [77:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'service' @ [77:20] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`[LocalVariableDescriptor]

'partyFromX500Name' @ [77:28] ==> public open fun partyFromX500Name(principal: X500Name): Party? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'identities' @ [77:46] ==> val identities: List<PartyAndCertificate> defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`[LocalVariableDescriptor]

'first' @ [77:57] ==> public fun <T> List<PartyAndCertificate>.first(): PartyAndCertificate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'name' @ [77:65] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'identities' @ [78:9] ==> val identities: List<PartyAndCertificate> defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`[LocalVariableDescriptor]

'forEach' @ [78:20] ==> @HidesMembers public inline fun <T> Iterable<PartyAndCertificate>.forEach(action: (PartyAndCertificate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'service' @ [78:30] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [78:38] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'it' @ [78:64] ==> value-parameter it: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`.<anonymous>[ValueParameterDescriptorImpl]

'identities' @ [79:9] ==> val identities: List<PartyAndCertificate> defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`[LocalVariableDescriptor]

'forEach' @ [79:20] ==> @HidesMembers public inline fun <T> Iterable<PartyAndCertificate>.forEach(action: (PartyAndCertificate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'assertEquals' @ [79:30] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party?, actual: Party?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party?

'it' @ [79:43] ==> value-parameter it: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [79:46] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'service' @ [79:53] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`[LocalVariableDescriptor]

'partyFromX500Name' @ [79:61] ==> public open fun partyFromX500Name(principal: X500Name): Party? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'it' @ [79:79] ==> value-parameter it: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get identity by name`.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [79:82] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'Test' @ [85:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTestSerialization' @ [87:9] ==> public inline fun <T> withTestSerialization(block: () -> UnknownAnonymousPartyException): UnknownAnonymousPartyException defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnknownAnonymousPartyException

'Crypto' @ [88:27] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [88:34] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [88:50] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [88:64] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [89:28] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [89:42] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'ALICE' @ [89:72] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [89:78] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'rootKey' @ [89:84] ==> val rootKey: KeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert unknown anonymous key is unrecognised`.<anonymous>[LocalVariableDescriptor]

'Crypto' @ [90:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [90:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [90:48] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [90:62] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'InMemoryIdentityService' @ [91:27] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'DUMMY_CA' @ [91:63] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'certificate' @ [91:72] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'Party' @ [93:28] ==> public constructor Party(certificate: X509CertificateHolder) defined in net.corda.core.identity.Party[DeserializedClassConstructorDescriptor]

'rootCert' @ [93:34] ==> val rootCert: X509CertificateHolder defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert unknown anonymous key is unrecognised`.<anonymous>[LocalVariableDescriptor]

'AnonymousParty' @ [94:30] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'txKey' @ [94:45] ==> val txKey: KeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert unknown anonymous key is unrecognised`.<anonymous>[LocalVariableDescriptor]

'public' @ [94:51] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertFailsWith' @ [96:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): UnknownAnonymousPartyException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> UnknownAnonymousPartyException

'service' @ [97:17] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert unknown anonymous key is unrecognised`.<anonymous>[LocalVariableDescriptor]

'assertOwnership' @ [97:25] ==> public open fun assertOwnership(party: Party, anonymousParty: AnonymousParty): Unit defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'identity' @ [97:41] ==> val identity: Party defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert unknown anonymous key is unrecognised`.<anonymous>[LocalVariableDescriptor]

'txIdentity' @ [97:51] ==> val txIdentity: AnonymousParty defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert unknown anonymous key is unrecognised`.<anonymous>[LocalVariableDescriptor]

'Test' @ [106:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DUMMY_CA' @ [108:25] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'component1' @ [109:14] ==> public final operator fun component1(): PartyAndCertificate defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [109:21] ==> public final operator fun component2(): PartyAndCertificate defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createParty' @ [109:40] ==> private final fun createParty(x500Name: X500Name, ca: CertificateAndKeyPair): Pair<PartyAndCertificate, PartyAndCertificate> defined in net.corda.node.services.network.InMemoryIdentityServiceTests[SimpleFunctionDescriptorImpl]

'ALICE' @ [109:52] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [109:58] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'trustRoot' @ [109:64] ==> val trustRoot: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'component1' @ [110:14] ==> public final operator fun component1(): PartyAndCertificate defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [110:17] ==> public final operator fun component2(): PartyAndCertificate defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createParty' @ [110:34] ==> private final fun createParty(x500Name: X500Name, ca: CertificateAndKeyPair): Pair<PartyAndCertificate, PartyAndCertificate> defined in net.corda.node.services.network.InMemoryIdentityServiceTests[SimpleFunctionDescriptorImpl]

'ALICE' @ [110:46] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [110:52] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'trustRoot' @ [110:58] ==> val trustRoot: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'InMemoryIdentityService' @ [113:23] ==> public constructor InMemoryIdentityService(identities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509Certificate, vararg caCertificates: X509Certificate) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'setOf' @ [113:47] ==> public fun <T> setOf(element: PartyAndCertificate): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'alice' @ [113:53] ==> val alice: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'emptySet' @ [113:61] ==> public fun <T> emptySet(): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'trustRoot' @ [113:73] ==> val trustRoot: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'certificate' @ [113:83] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'cert' @ [113:95] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'service' @ [114:9] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [114:17] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'aliceTxIdentity' @ [114:43] ==> val aliceTxIdentity: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'service' @ [116:22] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'certificateFromKey' @ [116:30] ==> public open fun certificateFromKey(owningKey: PublicKey): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'aliceTxIdentity' @ [116:49] ==> val aliceTxIdentity: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'party' @ [116:65] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'owningKey' @ [116:71] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'assertEquals' @ [117:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PartyAndCertificate, actual: PartyAndCertificate, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PartyAndCertificate

'aliceTxIdentity' @ [117:22] ==> val aliceTxIdentity: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'actual' @ [117:39] ==> var actual: PartyAndCertificate? defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'assertNull' @ [119:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'service' @ [119:20] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'certificateFromKey' @ [119:28] ==> public open fun certificateFromKey(owningKey: PublicKey): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'bobTxIdentity' @ [119:47] ==> val bobTxIdentity: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'party' @ [119:61] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'owningKey' @ [119:67] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'service' @ [120:9] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [120:17] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'bobTxIdentity' @ [120:43] ==> val bobTxIdentity: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'actual' @ [121:9] ==> var actual: PartyAndCertificate? defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'service' @ [121:18] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'certificateFromKey' @ [121:26] ==> public open fun certificateFromKey(owningKey: PublicKey): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'bobTxIdentity' @ [121:45] ==> val bobTxIdentity: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'party' @ [121:59] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'owningKey' @ [121:65] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'assertEquals' @ [122:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: PartyAndCertificate, actual: PartyAndCertificate, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> PartyAndCertificate

'bobTxIdentity' @ [122:22] ==> val bobTxIdentity: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'actual' @ [122:37] ==> var actual: PartyAndCertificate? defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`get anonymous identity by key`[LocalVariableDescriptor]

'Test' @ [129:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'withTestSerialization' @ [131:9] ==> public inline fun <T> withTestSerialization(block: () -> IllegalArgumentException /* = IllegalArgumentException */): IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IllegalArgumentException

'DUMMY_CA' @ [132:29] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'component1' @ [133:18] ==> public final operator fun component1(): PartyAndCertificate defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [133:25] ==> public final operator fun component2(): PartyAndCertificate defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createParty' @ [133:43] ==> private final fun createParty(x500Name: X500Name, ca: CertificateAndKeyPair): Pair<PartyAndCertificate, PartyAndCertificate> defined in net.corda.node.services.network.InMemoryIdentityServiceTests[SimpleFunctionDescriptorImpl]

'ALICE' @ [133:55] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [133:61] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'trustRoot' @ [133:67] ==> val trustRoot: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'component1' @ [134:18] ==> public final operator fun component1(): PartyAndCertificate defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [134:23] ==> public final operator fun component2(): PartyAndCertificate defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'createParty' @ [134:39] ==> private final fun createParty(x500Name: X500Name, ca: CertificateAndKeyPair): Pair<PartyAndCertificate, PartyAndCertificate> defined in net.corda.node.services.network.InMemoryIdentityServiceTests[SimpleFunctionDescriptorImpl]

'BOB' @ [134:51] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [134:55] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'trustRoot' @ [134:61] ==> val trustRoot: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'InMemoryIdentityService' @ [137:27] ==> public constructor InMemoryIdentityService(identities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509Certificate, vararg caCertificates: X509Certificate) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'setOf' @ [137:51] ==> public fun <T> setOf(vararg elements: PartyAndCertificate): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'alice' @ [137:57] ==> val alice: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'bob' @ [137:64] ==> val bob: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'emptySet' @ [137:70] ==> public fun <T> emptySet(): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'trustRoot' @ [137:82] ==> val trustRoot: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'certificate' @ [137:92] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'cert' @ [137:104] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'service' @ [139:13] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [139:21] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'anonymousAlice' @ [139:47] ==> val anonymousAlice: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'service' @ [140:13] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'verifyAndRegisterIdentity' @ [140:21] ==> public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'anonymousBob' @ [140:47] ==> val anonymousBob: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'service' @ [143:13] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'assertOwnership' @ [143:21] ==> public open fun assertOwnership(party: Party, anonymousParty: AnonymousParty): Unit defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'alice' @ [143:37] ==> val alice: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'party' @ [143:43] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'anonymousAlice' @ [143:50] ==> val anonymousAlice: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'party' @ [143:65] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'anonymise' @ [143:71] ==> public final fun anonymise(): AnonymousParty defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'service' @ [144:13] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'assertOwnership' @ [144:21] ==> public open fun assertOwnership(party: Party, anonymousParty: AnonymousParty): Unit defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'bob' @ [144:37] ==> val bob: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'party' @ [144:41] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'anonymousBob' @ [144:48] ==> val anonymousBob: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'party' @ [144:61] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'anonymise' @ [144:67] ==> public final fun anonymise(): AnonymousParty defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [145:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'service' @ [146:17] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'assertOwnership' @ [146:25] ==> public open fun assertOwnership(party: Party, anonymousParty: AnonymousParty): Unit defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'alice' @ [146:41] ==> val alice: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'party' @ [146:47] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'anonymousBob' @ [146:54] ==> val anonymousBob: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'party' @ [146:67] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'anonymise' @ [146:73] ==> public final fun anonymise(): AnonymousParty defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [148:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'service' @ [149:17] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'assertOwnership' @ [149:25] ==> public open fun assertOwnership(party: Party, anonymousParty: AnonymousParty): Unit defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'bob' @ [149:41] ==> val bob: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'party' @ [149:45] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'anonymousAlice' @ [149:52] ==> val anonymousAlice: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'party' @ [149:67] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'anonymise' @ [149:73] ==> public final fun anonymise(): AnonymousParty defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [152:13] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> IllegalArgumentException

'Crypto' @ [153:33] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'decodePublicKey' @ [153:40] ==> @JvmStatic public final fun decodePublicKey(encodedKey: ByteArray): PublicKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'trustRoot' @ [153:56] ==> val trustRoot: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'certificate' @ [153:66] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'subjectPublicKeyInfo' @ [153:78] ==> public final val X509CertificateHolder.subjectPublicKeyInfo: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?)[MyPropertyDescriptor]

'encoded' @ [153:99] ==> public final val SubjectPublicKeyInfo.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'service' @ [154:17] ==> val service: InMemoryIdentityService defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'assertOwnership' @ [154:25] ==> public open fun assertOwnership(party: Party, anonymousParty: AnonymousParty): Unit defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'Party' @ [154:41] ==> public constructor Party(name: X500Name, owningKey: PublicKey) defined in net.corda.core.identity.Party[DeserializedClassConstructorDescriptor]

'trustRoot' @ [154:47] ==> val trustRoot: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'certificate' @ [154:57] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'subject' @ [154:69] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'owningKey' @ [154:78] ==> val owningKey: PublicKey defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>.<anonymous>[LocalVariableDescriptor]

'anonymousAlice' @ [154:90] ==> val anonymousAlice: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`assert ownership`.<anonymous>[LocalVariableDescriptor]

'party' @ [154:105] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'anonymise' @ [154:111] ==> public final fun anonymise(): AnonymousParty defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [160:46] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'generateKeyPair' @ [161:29] ==> public fun generateKeyPair(): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'getTestPartyAndCertificate' @ [162:22] ==> public fun getTestPartyAndCertificate(name: X500Name, publicKey: PublicKey, trustRoot: CertificateAndKeyPair = ...): PartyAndCertificate defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'x500Name' @ [162:49] ==> value-parameter x500Name: X500Name defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[ValueParameterDescriptorImpl]

'issuerKeyPair' @ [162:59] ==> val issuerKeyPair: KeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[LocalVariableDescriptor]

'public' @ [162:73] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'ca' @ [162:81] ==> value-parameter ca: CertificateAndKeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[ValueParameterDescriptorImpl]

'Crypto' @ [163:21] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [163:28] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [164:22] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createCertificate' @ [164:36] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'IDENTITY' @ [164:70] ==> enum entry IDENTITY defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'issuer' @ [164:80] ==> val issuer: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[LocalVariableDescriptor]

'certificate' @ [164:87] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'issuerKeyPair' @ [164:100] ==> val issuerKeyPair: KeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[LocalVariableDescriptor]

'x500Name' @ [164:115] ==> value-parameter x500Name: X500Name defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[ValueParameterDescriptorImpl]

'txKey' @ [164:125] ==> val txKey: KeyPair defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[LocalVariableDescriptor]

'public' @ [164:131] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'certFactory' @ [165:26] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[LocalVariableDescriptor]

'generateCertPath' @ [165:38] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'listOf' @ [165:55] ==> public fun <T> listOf(element: X509Certificate): List<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'txCert' @ [165:62] ==> val txCert: X509CertificateHolder defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[LocalVariableDescriptor]

'cert' @ [165:69] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'issuer' @ [165:77] ==> val issuer: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[LocalVariableDescriptor]

'certPath' @ [165:84] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'certificates' @ [165:93] ==> public final val CertPath.certificates: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)[MyPropertyDescriptor]

'Pair' @ [166:16] ==> public constructor Pair<out A, out B>(first: PartyAndCertificate, second: PartyAndCertificate) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> PartyAndCertificate
    <out B> -> PartyAndCertificate

'issuer' @ [166:21] ==> val issuer: PartyAndCertificate defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[LocalVariableDescriptor]

'PartyAndCertificate' @ [166:29] ==> public constructor PartyAndCertificate(certPath: CertPath) defined in net.corda.core.identity.PartyAndCertificate[DeserializedClassConstructorDescriptor]

'txCertPath' @ [166:49] ==> val txCertPath: (CertPath..CertPath?) defined in net.corda.node.services.network.InMemoryIdentityServiceTests.createParty[LocalVariableDescriptor]

'Test' @ [172:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ALICE' @ [174:24] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'InMemoryIdentityService' @ [175:22] ==> public constructor InMemoryIdentityService(wellKnownIdentities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509CertificateHolder) defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedClassConstructorDescriptor]

'DUMMY_CA' @ [175:58] ==> public val DUMMY_CA: CertificateAndKeyPair defined in net.corda.testing[DeserializedPropertyDescriptor]

'certificate' @ [175:67] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [175:80] ==> public open fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.node.services.identity.InMemoryIdentityService[DeserializedSimpleFunctionDescriptor]

'expected' @ [175:99] ==> val expected: Party defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`deanonymising a well known identity`[LocalVariableDescriptor]

'assertEquals' @ [176:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Party?, actual: Party?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Party?

'expected' @ [176:22] ==> val expected: Party defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`deanonymising a well known identity`[LocalVariableDescriptor]

'actual' @ [176:32] ==> val actual: Party? defined in net.corda.node.services.network.InMemoryIdentityServiceTests.`deanonymising a well known identity`[LocalVariableDescriptor]

