'InMemoryNetworkMapCache' @ [21:53] ==> public constructor InMemoryNetworkMapCache(serviceHub: ServiceHub?) defined in net.corda.node.services.network.InMemoryNetworkMapCache[DeserializedClassConstructorDescriptor]

'serviceHub' @ [21:77] ==> value-parameter serviceHub: ServiceHub defined in net.corda.testing.node.MockNetworkMapCache.<init>[ValueParameterDescriptorImpl]

'getTestPartyAndCertificate' @ [23:22] ==> public fun getTestPartyAndCertificate(name: X500Name, publicKey: PublicKey, trustRoot: CertificateAndKeyPair = ...): PartyAndCertificate defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'getTestX509Name' @ [23:49] ==> public fun getTestX509Name(commonName: String): X500Name defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'entropyToKeyPair' @ [23:76] ==> public fun entropyToKeyPair(entropy: BigInteger): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [23:104] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'public' @ [23:119] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'getTestPartyAndCertificate' @ [24:22] ==> public fun getTestPartyAndCertificate(name: X500Name, publicKey: PublicKey, trustRoot: CertificateAndKeyPair = ...): PartyAndCertificate defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'getTestX509Name' @ [24:49] ==> public fun getTestX509Name(commonName: String): X500Name defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'entropyToKeyPair' @ [24:76] ==> public fun entropyToKeyPair(entropy: BigInteger): KeyPair defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [24:104] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'public' @ [24:119] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'NetworkHostAndPort' @ [25:27] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'NetworkHostAndPort' @ [26:27] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'create' @ [29:82] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MapChange

'NodeInfo' @ [32:25] ==> public constructor NodeInfo(addresses: List<NetworkHostAndPort>, legalIdentityAndCert: PartyAndCertificate, legalIdentitiesAndCerts: NonEmptySet<PartyAndCertificate>, platformVersion: Int, advertisedServices: List<ServiceEntry> = ..., worldMapLocation: WorldMapLocation? = ...) defined in net.corda.core.node.NodeInfo[DeserializedClassConstructorDescriptor]

'listOf' @ [32:34] ==> public fun <T> listOf(element: NetworkHostAndPort): List<NetworkHostAndPort> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort

'BANK_C_ADDR' @ [32:41] ==> public final val BANK_C_ADDR: NetworkHostAndPort defined in net.corda.testing.node.MockNetworkMapCache.Companion[PropertyDescriptorImpl]

'BANK_C' @ [32:55] ==> public final val BANK_C: PartyAndCertificate defined in net.corda.testing.node.MockNetworkMapCache.Companion[PropertyDescriptorImpl]

'NonEmptySet' @ [32:63] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [32:75] ==> @JvmStatic public final fun <T> of(element: PartyAndCertificate): NonEmptySet<PartyAndCertificate> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'BANK_C' @ [32:78] ==> public final val BANK_C: PartyAndCertificate defined in net.corda.testing.node.MockNetworkMapCache.Companion[PropertyDescriptorImpl]

'NodeInfo' @ [33:25] ==> public constructor NodeInfo(addresses: List<NetworkHostAndPort>, legalIdentityAndCert: PartyAndCertificate, legalIdentitiesAndCerts: NonEmptySet<PartyAndCertificate>, platformVersion: Int, advertisedServices: List<ServiceEntry> = ..., worldMapLocation: WorldMapLocation? = ...) defined in net.corda.core.node.NodeInfo[DeserializedClassConstructorDescriptor]

'listOf' @ [33:34] ==> public fun <T> listOf(element: NetworkHostAndPort): List<NetworkHostAndPort> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort

'BANK_D_ADDR' @ [33:41] ==> public final val BANK_D_ADDR: NetworkHostAndPort defined in net.corda.testing.node.MockNetworkMapCache.Companion[PropertyDescriptorImpl]

'BANK_D' @ [33:55] ==> public final val BANK_D: PartyAndCertificate defined in net.corda.testing.node.MockNetworkMapCache.Companion[PropertyDescriptorImpl]

'NonEmptySet' @ [33:63] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'of' @ [33:75] ==> @JvmStatic public final fun <T> of(element: PartyAndCertificate): NonEmptySet<PartyAndCertificate> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'BANK_D' @ [33:78] ==> public final val BANK_D: PartyAndCertificate defined in net.corda.testing.node.MockNetworkMapCache.Companion[PropertyDescriptorImpl]

'registeredNodes' @ [34:9] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.testing.node.MockNetworkMapCache[DeserializedPropertyDescriptor]

'mockNodeA' @ [34:25] ==> val mockNodeA: NodeInfo defined in net.corda.testing.node.MockNetworkMapCache.<init>[LocalVariableDescriptor]

'legalIdentity' @ [34:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [34:49] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mockNodeA' @ [34:62] ==> val mockNodeA: NodeInfo defined in net.corda.testing.node.MockNetworkMapCache.<init>[LocalVariableDescriptor]

'registeredNodes' @ [35:9] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.testing.node.MockNetworkMapCache[DeserializedPropertyDescriptor]

'mockNodeB' @ [35:25] ==> val mockNodeB: NodeInfo defined in net.corda.testing.node.MockNetworkMapCache.<init>[LocalVariableDescriptor]

'legalIdentity' @ [35:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [35:49] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'mockNodeB' @ [35:62] ==> val mockNodeB: NodeInfo defined in net.corda.testing.node.MockNetworkMapCache.<init>[LocalVariableDescriptor]

'runWithoutMapService' @ [36:9] ==> public open fun runWithoutMapService(): Unit defined in net.corda.testing.node.MockNetworkMapCache[DeserializedSimpleFunctionDescriptor]

'VisibleForTesting' @ [43:5] ==> public constructor VisibleForTesting() defined in co.paralleluniverse.common.util.VisibleForTesting[JavaClassConstructorDescriptor]

'registeredNodes' @ [45:9] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.testing.node.MockNetworkMapCache[DeserializedPropertyDescriptor]

'node' @ [45:25] ==> value-parameter node: NodeInfo defined in net.corda.testing.node.MockNetworkMapCache.addRegistration[ValueParameterDescriptorImpl]

'legalIdentity' @ [45:30] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [45:44] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'node' @ [45:57] ==> value-parameter node: NodeInfo defined in net.corda.testing.node.MockNetworkMapCache.addRegistration[ValueParameterDescriptorImpl]

'VisibleForTesting' @ [52:5] ==> public constructor VisibleForTesting() defined in co.paralleluniverse.common.util.VisibleForTesting[JavaClassConstructorDescriptor]

'registeredNodes' @ [54:16] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.testing.node.MockNetworkMapCache[DeserializedPropertyDescriptor]

'remove' @ [54:32] ==> public abstract fun remove(key: PublicKey): NodeInfo? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'legalIdentity' @ [54:39] ==> value-parameter legalIdentity: Party defined in net.corda.testing.node.MockNetworkMapCache.deleteRegistration[ValueParameterDescriptorImpl]

'owningKey' @ [54:53] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

