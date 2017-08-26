'ThreadSafe' @ [29:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'emptySet' @ [30:75] ==> public fun <T> emptySet(): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'emptySet' @ [31:87] ==> public fun <T> emptySet(): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'SingletonSerializeAsToken' @ [33:73] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'emptySet' @ [34:70] ==> public fun <T> emptySet(): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'emptySet' @ [35:73] ==> public fun <T> emptySet(): Set<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'this' @ [36:53] ==> public constructor InMemoryIdentityService(identities: Iterable<PartyAndCertificate> = ..., confidentialIdentities: Iterable<PartyAndCertificate> = ..., trustRoot: X509Certificate, vararg caCertificates: X509Certificate) defined in net.corda.node.services.identity.InMemoryIdentityService[ClassConstructorDescriptorImpl]

'wellKnownIdentities' @ [36:58] ==> value-parameter wellKnownIdentities: Iterable<PartyAndCertificate> = ... defined in net.corda.node.services.identity.InMemoryIdentityService.<init>[ValueParameterDescriptorImpl]

'confidentialIdentities' @ [36:79] ==> value-parameter confidentialIdentities: Iterable<PartyAndCertificate> = ... defined in net.corda.node.services.identity.InMemoryIdentityService.<init>[ValueParameterDescriptorImpl]

'trustRoot' @ [36:103] ==> value-parameter trustRoot: X509CertificateHolder defined in net.corda.node.services.identity.InMemoryIdentityService.<init>[ValueParameterDescriptorImpl]

'cert' @ [36:113] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'loggerFor' @ [38:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> InMemoryIdentityService

'trustRoot' @ [45:36] ==> public open val trustRoot: X509Certificate defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'toX509CertHolder' @ [45:46] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'TrustAnchor' @ [46:45] ==> public constructor TrustAnchor(p0: (X509Certificate..X509Certificate?), p1: (ByteArray..ByteArray?)) defined in java.security.cert.TrustAnchor[JavaClassConstructorDescriptor]

'trustRoot' @ [46:57] ==> public open val trustRoot: X509Certificate defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'ConcurrentHashMap' @ [47:32] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PublicKey
    <V : (Any..Any?)> -> PartyAndCertificate

'ConcurrentHashMap' @ [48:38] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> X500Name
    <V : (Any..Any?)> -> PartyAndCertificate

'caCertificates' @ [51:60] ==> value-parameter vararg caCertificates: X509Certificate defined in net.corda.node.services.identity.InMemoryIdentityService.<init>[ValueParameterDescriptorImpl]

'toSet' @ [51:75] ==> public fun <T> Array<out X509Certificate>.toSet(): Set<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'trustRoot' @ [51:85] ==> public open val trustRoot: X509Certificate defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'caCertStore' @ [52:9] ==> public open val caCertStore: CertStore defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'getInstance' @ [52:33] ==> public open fun getInstance(p0: (String..String?), p1: (CertStoreParameters..CertStoreParameters?)): (CertStore..CertStore?) defined in java.security.cert.CertStore[JavaMethodDescriptor]

'CollectionCertStoreParameters' @ [52:59] ==> public constructor CollectionCertStoreParameters(p0: (MutableCollection<*>..Collection<*>?)) defined in java.security.cert.CollectionCertStoreParameters[JavaClassConstructorDescriptor]

'caCertificatesWithRoot' @ [52:89] ==> val caCertificatesWithRoot: Set<X509Certificate> defined in net.corda.node.services.identity.InMemoryIdentityService.<init>[LocalVariableDescriptor]

'keyToParties' @ [53:9] ==> private final val keyToParties: ConcurrentHashMap<PublicKey, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'putAll' @ [53:22] ==> public open fun putAll(from: Map<out PublicKey, PartyAndCertificate>): Unit defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'identities' @ [53:29] ==> value-parameter identities: Iterable<PartyAndCertificate> = ... defined in net.corda.node.services.identity.InMemoryIdentityService.<init>[ValueParameterDescriptorImpl]

'associateBy' @ [53:40] ==> public inline fun <T, K> Iterable<PartyAndCertificate>.associateBy(keySelector: (PartyAndCertificate) -> PublicKey): Map<PublicKey, PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate
    <K> -> PublicKey

'it' @ [53:54] ==> value-parameter it: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.<init>.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [53:57] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'principalToParties' @ [54:9] ==> private final val principalToParties: ConcurrentHashMap<X500Name, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'putAll' @ [54:28] ==> public open fun putAll(from: Map<out X500Name, PartyAndCertificate>): Unit defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'identities' @ [54:35] ==> value-parameter identities: Iterable<PartyAndCertificate> = ... defined in net.corda.node.services.identity.InMemoryIdentityService.<init>[ValueParameterDescriptorImpl]

'associateBy' @ [54:46] ==> public inline fun <T, K> Iterable<PartyAndCertificate>.associateBy(keySelector: (PartyAndCertificate) -> X500Name): Map<X500Name, PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate
    <K> -> X500Name

'it' @ [54:60] ==> value-parameter it: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.<init>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [54:63] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'confidentialIdentities' @ [55:9] ==> value-parameter confidentialIdentities: Iterable<PartyAndCertificate> = ... defined in net.corda.node.services.identity.InMemoryIdentityService.<init>[ValueParameterDescriptorImpl]

'forEach' @ [55:32] ==> @HidesMembers public inline fun <T> Iterable<PartyAndCertificate>.forEach(action: (PartyAndCertificate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'principalToParties' @ [56:13] ==> private final val principalToParties: ConcurrentHashMap<X500Name, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'computeIfAbsent' @ [56:32] ==> public final fun computeIfAbsent(p0: X500Name, p1: (X500Name) -> PartyAndCertificate): PartyAndCertificate defined in java.util.concurrent.ConcurrentHashMap[MyFunctionDescriptor]

'identity' @ [56:48] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.<init>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [56:57] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'identity' @ [56:65] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.<init>.<anonymous>[ValueParameterDescriptorImpl]

'verifyAndRegisterIdentity' @ [61:9] ==> @Throws public open fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.node.services.identity.InMemoryIdentityService[SimpleFunctionDescriptorImpl]

'party' @ [61:35] ==> value-parameter party: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.registerIdentity[ValueParameterDescriptorImpl]

'Throws' @ [65:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'CertificateExpiredException' @ [65:13] ==> public constructor CertificateExpiredException() defined in java.security.cert.CertificateExpiredException[JavaClassConstructorDescriptor]

'CertificateNotYetValidException' @ [65:49] ==> public constructor CertificateNotYetValidException() defined in java.security.cert.CertificateNotYetValidException[JavaClassConstructorDescriptor]

'InvalidAlgorithmParameterException' @ [65:89] ==> public constructor InvalidAlgorithmParameterException() defined in java.security.InvalidAlgorithmParameterException[JavaClassConstructorDescriptor]

'identity' @ [68:9] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.verifyAndRegisterIdentity[ValueParameterDescriptorImpl]

'verify' @ [68:18] ==> public final fun verify(trustAnchor: TrustAnchor): PKIXCertPathValidatorResult defined in net.corda.core.identity.PartyAndCertificate[DeserializedSimpleFunctionDescriptor]

'trustAnchor' @ [68:25] ==> public open val trustAnchor: TrustAnchor defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'log' @ [70:9] ==> private final val log: Logger defined in net.corda.node.services.identity.InMemoryIdentityService.Companion[PropertyDescriptorImpl]

'trace' @ [70:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'identity' @ [70:44] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.verifyAndRegisterIdentity[ValueParameterDescriptorImpl]

'keyToParties' @ [71:9] ==> private final val keyToParties: ConcurrentHashMap<PublicKey, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'identity' @ [71:22] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.verifyAndRegisterIdentity[ValueParameterDescriptorImpl]

'owningKey' @ [71:31] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'identity' @ [71:44] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.verifyAndRegisterIdentity[ValueParameterDescriptorImpl]

'principalToParties' @ [73:9] ==> private final val principalToParties: ConcurrentHashMap<X500Name, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'computeIfAbsent' @ [73:28] ==> public final fun computeIfAbsent(p0: X500Name, p1: (X500Name) -> PartyAndCertificate): PartyAndCertificate defined in java.util.concurrent.ConcurrentHashMap[MyFunctionDescriptor]

'identity' @ [73:44] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.verifyAndRegisterIdentity[ValueParameterDescriptorImpl]

'name' @ [73:53] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'identity' @ [73:61] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.verifyAndRegisterIdentity[ValueParameterDescriptorImpl]

'keyToParties' @ [74:16] ==> private final val keyToParties: ConcurrentHashMap<PublicKey, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'identity' @ [74:29] ==> value-parameter identity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.verifyAndRegisterIdentity[ValueParameterDescriptorImpl]

'certPath' @ [74:38] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'certificates' @ [74:47] ==> public final val CertPath.certificates: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)[MyPropertyDescriptor]

'publicKey' @ [74:63] ==> public final val Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyToParties' @ [77:83] ==> private final val keyToParties: ConcurrentHashMap<PublicKey, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'owningKey' @ [77:96] ==> value-parameter owningKey: PublicKey defined in net.corda.node.services.identity.InMemoryIdentityService.certificateFromKey[ValueParameterDescriptorImpl]

'principalToParties' @ [78:76] ==> private final val principalToParties: ConcurrentHashMap<X500Name, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'party' @ [78:95] ==> value-parameter party: Party defined in net.corda.node.services.identity.InMemoryIdentityService.certificateFromParty[ValueParameterDescriptorImpl]

'name' @ [78:101] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [78:116] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'party' @ [78:161] ==> value-parameter party: Party defined in net.corda.node.services.identity.InMemoryIdentityService.certificateFromParty[ValueParameterDescriptorImpl]

'name' @ [78:167] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'ArrayList' @ [81:70] ==> public final fun <E> <init>(p0: (MutableCollection<out (PartyAndCertificate..PartyAndCertificate?)>..Collection<(PartyAndCertificate..PartyAndCertificate?)>?)): ArrayList<(PartyAndCertificate..PartyAndCertificate?)> /* = ArrayList<(PartyAndCertificate..PartyAndCertificate?)> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> (net.corda.core.identity.PartyAndCertificate..net.corda.core.identity.PartyAndCertificate?)

'keyToParties' @ [81:80] ==> private final val keyToParties: ConcurrentHashMap<PublicKey, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'values' @ [81:93] ==> public open val values: MutableCollection<PartyAndCertificate> defined in java.util.concurrent.ConcurrentHashMap[JavaPropertyDescriptor]

'keyToParties' @ [83:57] ==> private final val keyToParties: ConcurrentHashMap<PublicKey, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'key' @ [83:70] ==> value-parameter key: PublicKey defined in net.corda.node.services.identity.InMemoryIdentityService.partyFromKey[ValueParameterDescriptorImpl]

'party' @ [83:76] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'principalToParties' @ [84:67] ==> private final val principalToParties: ConcurrentHashMap<X500Name, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'principal' @ [84:86] ==> value-parameter principal: X500Name defined in net.corda.node.services.identity.InMemoryIdentityService.partyFromX500Name[ValueParameterDescriptorImpl]

'party' @ [84:98] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'party' @ [87:25] ==> value-parameter party: AbstractParty defined in net.corda.node.services.identity.InMemoryIdentityService.partyFromAnonymous[ValueParameterDescriptorImpl]

'keyToParties' @ [87:44] ==> private final val keyToParties: ConcurrentHashMap<PublicKey, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'party' @ [87:57] ==> value-parameter party: AbstractParty defined in net.corda.node.services.identity.InMemoryIdentityService.partyFromAnonymous[ValueParameterDescriptorImpl]

'owningKey' @ [87:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'party' @ [87:75] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'if (candidate != null) {
            // If we have a well known identity by that name, use it in preference to the candidate. Otherwise default
            // back to the candidate.
            principalToParties[candidate.name]?.party ?: candidate
        } else {
            null
        }' @ [90:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Party?, elseBranch: Party?): Party?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Party?

'candidate' @ [90:20] ==> val candidate: Party? defined in net.corda.node.services.identity.InMemoryIdentityService.partyFromAnonymous[LocalVariableDescriptor]

'principalToParties' @ [93:13] ==> private final val principalToParties: ConcurrentHashMap<X500Name, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'candidate' @ [93:32] ==> val candidate: Party? defined in net.corda.node.services.identity.InMemoryIdentityService.partyFromAnonymous[LocalVariableDescriptor]

'name' @ [93:42] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'party' @ [93:49] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'candidate' @ [93:58] ==> val candidate: Party? defined in net.corda.node.services.identity.InMemoryIdentityService.partyFromAnonymous[LocalVariableDescriptor]

'partyFromAnonymous' @ [98:68] ==> public open fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.node.services.identity.InMemoryIdentityService[SimpleFunctionDescriptorImpl]

'partyRef' @ [98:87] ==> value-parameter partyRef: PartyAndReference defined in net.corda.node.services.identity.InMemoryIdentityService.partyFromAnonymous[ValueParameterDescriptorImpl]

'party' @ [98:96] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [100:16] ==> public open fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.node.services.identity.InMemoryIdentityService[SimpleFunctionDescriptorImpl]

'party' @ [100:35] ==> value-parameter party: AbstractParty defined in net.corda.node.services.identity.InMemoryIdentityService.requirePartyFromAnonymous[ValueParameterDescriptorImpl]

'IllegalStateException' @ [100:51] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'party' @ [100:104] ==> value-parameter party: AbstractParty defined in net.corda.node.services.identity.InMemoryIdentityService.requirePartyFromAnonymous[ValueParameterDescriptorImpl]

'owningKey' @ [100:110] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toStringShort' @ [100:120] ==> public fun PublicKey.toStringShort(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'LinkedHashSet' @ [104:23] ==> public final fun <E> <init>(): LinkedHashSet<Party> /* = LinkedHashSet<Party> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Party

'component1' @ [105:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<X500Name, PartyAndCertificate>.component1(): X500Name defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> X500Name
    <V> -> PartyAndCertificate

'component2' @ [105:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<X500Name, PartyAndCertificate>.component2(): PartyAndCertificate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> X500Name
    <V> -> PartyAndCertificate

'principalToParties' @ [105:49] ==> private final val principalToParties: ConcurrentHashMap<X500Name, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'partyAndCertificate' @ [106:25] ==> val partyAndCertificate: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'party' @ [106:45] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'x500name' @ [107:25] ==> val x500name: X500Name defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'rdNs' @ [107:34] ==> public final val X500Name.rdNs: (Array<(RDN..RDN?)>..Array<out (RDN..RDN?)>?)[MyPropertyDescriptor]

'rdn' @ [108:33] ==> val rdn: (RDN..RDN?) defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'first' @ [108:37] ==> public final val RDN.first: (AttributeTypeAndValue..AttributeTypeAndValue?)[MyPropertyDescriptor]

'value' @ [108:43] ==> public final val AttributeTypeAndValue.value: (ASN1Encodable..ASN1Encodable?)[MyPropertyDescriptor]

'toString' @ [108:49] ==> public open fun toString(): String defined in org.bouncycastle.asn1.ASN1Encodable[DeserializedSimpleFunctionDescriptor]

'if (exactMatch && component == query) {
                    results += party
                } else if (!exactMatch) {
                    // We can imagine this being a query over a lucene index in future.
                    //
                    // Kostas says: We can easily use the Jaro-Winkler distance metric as it is best suited for short
                    // strings such as entity/company names, and to detect small typos. We can also apply it for city
                    // or any keyword related search in lists of records (not raw text - for raw text we need indexing)
                    // and we can return results in hierarchical order (based on normalised String similarity 0.0-1.0).
                    if (component.contains(query, ignoreCase = true))
                        results += party
                }' @ [109:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'exactMatch' @ [109:21] ==> value-parameter exactMatch: Boolean defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[ValueParameterDescriptorImpl]

'component' @ [109:35] ==> val component: String defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'query' @ [109:48] ==> value-parameter query: String defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[ValueParameterDescriptorImpl]

'results' @ [110:21] ==> val results: LinkedHashSet<Party> /* = LinkedHashSet<Party> */ defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'party' @ [110:32] ==> val party: Party defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'!' @ [111:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exactMatch' @ [111:29] ==> value-parameter exactMatch: Boolean defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[ValueParameterDescriptorImpl]

'component' @ [118:25] ==> val component: String defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'contains' @ [118:35] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'query' @ [118:44] ==> value-parameter query: String defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[ValueParameterDescriptorImpl]

'results' @ [119:25] ==> val results: LinkedHashSet<Party> /* = LinkedHashSet<Party> */ defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'party' @ [119:36] ==> val party: Party defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'results' @ [123:16] ==> val results: LinkedHashSet<Party> /* = LinkedHashSet<Party> */ defined in net.corda.node.services.identity.InMemoryIdentityService.partiesFromName[LocalVariableDescriptor]

'Throws' @ [126:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'UnknownAnonymousPartyException' @ [126:13] ==> public constructor UnknownAnonymousPartyException(msg: String) defined in net.corda.core.node.services.UnknownAnonymousPartyException[DeserializedClassConstructorDescriptor]

'keyToParties' @ [128:33] ==> private final val keyToParties: ConcurrentHashMap<PublicKey, PartyAndCertificate> defined in net.corda.node.services.identity.InMemoryIdentityService[PropertyDescriptorImpl]

'anonymousParty' @ [128:46] ==> value-parameter anonymousParty: AnonymousParty defined in net.corda.node.services.identity.InMemoryIdentityService.assertOwnership[ValueParameterDescriptorImpl]

'owningKey' @ [128:61] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AnonymousParty[DeserializedPropertyDescriptor]

'UnknownAnonymousPartyException' @ [129:23] ==> public constructor UnknownAnonymousPartyException(msg: String) defined in net.corda.core.node.services.UnknownAnonymousPartyException[DeserializedClassConstructorDescriptor]

'anonymousParty' @ [129:64] ==> value-parameter anonymousParty: AnonymousParty defined in net.corda.node.services.identity.InMemoryIdentityService.assertOwnership[ValueParameterDescriptorImpl]

'anonymousIdentity' @ [130:27] ==> val anonymousIdentity: PartyAndCertificate defined in net.corda.node.services.identity.InMemoryIdentityService.assertOwnership[LocalVariableDescriptor]

'certPath' @ [130:45] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'certificates' @ [130:54] ==> public final val CertPath.certificates: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)[MyPropertyDescriptor]

'require' @ [131:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'issuingCert' @ [131:17] ==> val issuingCert: (Certificate..Certificate?) defined in net.corda.node.services.identity.InMemoryIdentityService.assertOwnership[LocalVariableDescriptor]

'publicKey' @ [131:29] ==> public final val Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'party' @ [131:42] ==> value-parameter party: Party defined in net.corda.node.services.identity.InMemoryIdentityService.assertOwnership[ValueParameterDescriptorImpl]

'owningKey' @ [131:48] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'party' @ [132:74] ==> value-parameter party: Party defined in net.corda.node.services.identity.InMemoryIdentityService.assertOwnership[ValueParameterDescriptorImpl]

'owningKey' @ [132:80] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toStringShort' @ [132:90] ==> public fun PublicKey.toStringShort(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

