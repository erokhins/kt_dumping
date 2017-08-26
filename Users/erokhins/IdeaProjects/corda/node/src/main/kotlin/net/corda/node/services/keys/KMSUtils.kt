'issuer' @ [35:29] ==> value-parameter issuer: PartyAndCertificate defined in net.corda.node.services.keys.freshCertificate[ValueParameterDescriptorImpl]

'certificate' @ [35:36] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'X509Utilities' @ [36:18] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'getCertificateValidityWindow' @ [36:32] ==> public final fun getCertificateValidityWindow(before: Duration, after: Duration, parent: X509CertificateHolder? = ...): Pair<Date, Date> defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'ZERO' @ [36:70] ==> public final val ZERO: (Duration..Duration?) defined in java.time.Duration[JavaPropertyDescriptor]

'days' @ [36:81] ==> public val Int.days: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'issuerCertificate' @ [36:87] ==> val issuerCertificate: X509CertificateHolder defined in net.corda.node.services.keys.freshCertificate[LocalVariableDescriptor]

'X509Utilities' @ [37:26] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'createCertificate' @ [37:40] ==> public final fun createCertificate(certificateType: CertificateType, issuer: X500Name, issuerSigner: ContentSigner, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Date, Date>, nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'IDENTITY' @ [37:74] ==> enum entry IDENTITY defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'issuerCertificate' @ [37:84] ==> val issuerCertificate: X509CertificateHolder defined in net.corda.node.services.keys.freshCertificate[LocalVariableDescriptor]

'subject' @ [37:102] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'issuerSigner' @ [38:13] ==> value-parameter issuerSigner: ContentSigner defined in net.corda.node.services.keys.freshCertificate[ValueParameterDescriptorImpl]

'issuer' @ [38:27] ==> value-parameter issuer: PartyAndCertificate defined in net.corda.node.services.keys.freshCertificate[ValueParameterDescriptorImpl]

'name' @ [38:34] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'subjectPublicKey' @ [38:40] ==> value-parameter subjectPublicKey: PublicKey defined in net.corda.node.services.keys.freshCertificate[ValueParameterDescriptorImpl]

'window' @ [38:58] ==> val window: Pair<Date, Date> defined in net.corda.node.services.keys.freshCertificate[LocalVariableDescriptor]

'getInstance' @ [39:42] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'certFactory' @ [40:23] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.node.services.keys.freshCertificate[LocalVariableDescriptor]

'generateCertPath' @ [40:35] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'listOf' @ [40:52] ==> public fun <T> listOf(element: X509Certificate): List<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'ourCertificate' @ [40:59] ==> val ourCertificate: X509CertificateHolder defined in net.corda.node.services.keys.freshCertificate[LocalVariableDescriptor]

'cert' @ [40:74] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'issuer' @ [40:82] ==> value-parameter issuer: PartyAndCertificate defined in net.corda.node.services.keys.freshCertificate[ValueParameterDescriptorImpl]

'certPath' @ [40:89] ==> public final val certPath: CertPath defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'certificates' @ [40:98] ==> public final val CertPath.certificates: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)[MyPropertyDescriptor]

'PartyAndCertificate' @ [41:30] ==> public constructor PartyAndCertificate(certPath: CertPath) defined in net.corda.core.identity.PartyAndCertificate[DeserializedClassConstructorDescriptor]

'ourCertPath' @ [41:50] ==> val ourCertPath: (CertPath..CertPath?) defined in net.corda.node.services.keys.freshCertificate[LocalVariableDescriptor]

'identityService' @ [42:5] ==> value-parameter identityService: IdentityService defined in net.corda.node.services.keys.freshCertificate[ValueParameterDescriptorImpl]

'verifyAndRegisterIdentity' @ [42:21] ==> public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'anonymisedIdentity' @ [42:47] ==> val anonymisedIdentity: PartyAndCertificate defined in net.corda.node.services.keys.freshCertificate[LocalVariableDescriptor]

'anonymisedIdentity' @ [43:12] ==> val anonymisedIdentity: PartyAndCertificate defined in net.corda.node.services.keys.freshCertificate[LocalVariableDescriptor]

'Crypto' @ [47:27] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [47:34] ==> @JvmStatic public final fun findSignatureScheme(key: PrivateKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'issuerKeyPair' @ [47:54] ==> value-parameter issuerKeyPair: KeyPair defined in net.corda.node.services.keys.getSigner[ValueParameterDescriptorImpl]

'private' @ [47:68] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'getProvider' @ [48:29] ==> public open fun getProvider(p0: (String..String?)): (Provider..Provider?) defined in java.security.Security[JavaMethodDescriptor]

'signatureScheme' @ [48:41] ==> val signatureScheme: SignatureScheme defined in net.corda.node.services.keys.getSigner[LocalVariableDescriptor]

'providerName' @ [48:57] ==> public final val providerName: String defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'ContentSignerBuilder' @ [49:12] ==> public object ContentSignerBuilder defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'build' @ [49:33] ==> public final fun build(signatureScheme: SignatureScheme, privateKey: PrivateKey, provider: Provider, random: SecureRandom? = ...): ContentSigner defined in net.corda.core.crypto.ContentSignerBuilder[DeserializedSimpleFunctionDescriptor]

'signatureScheme' @ [49:39] ==> val signatureScheme: SignatureScheme defined in net.corda.node.services.keys.getSigner[LocalVariableDescriptor]

'issuerKeyPair' @ [49:56] ==> value-parameter issuerKeyPair: KeyPair defined in net.corda.node.services.keys.getSigner[ValueParameterDescriptorImpl]

'private' @ [49:70] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'provider' @ [49:79] ==> val provider: (Provider..Provider?) defined in net.corda.node.services.keys.getSigner[LocalVariableDescriptor]

