'Crypto' @ [20:24] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [20:31] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [20:47] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [20:61] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [21:26] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [21:40] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'getX509Name' @ [21:70] ==> @JvmOverloads public fun getX509Name(myLegalName: String, nearestCity: String, email: String, country: String? = ...): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'rootKeys' @ [21:131] ==> val rootKeys: KeyPair defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'Crypto' @ [23:37] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [23:44] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [23:60] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [23:74] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [24:34] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createCertificate' @ [24:48] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'INTERMEDIATE_CA' @ [24:82] ==> enum entry INTERMEDIATE_CA defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'rootCACert' @ [24:99] ==> val rootCACert: X509CertificateHolder defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'rootKeys' @ [24:111] ==> val rootKeys: KeyPair defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'getX509Name' @ [24:121] ==> @JvmOverloads public fun getX509Name(myLegalName: String, nearestCity: String, email: String, country: String? = ...): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'intermediateCAKeyPair' @ [24:190] ==> val intermediateCAKeyPair: KeyPair defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'public' @ [24:212] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'Crypto' @ [26:31] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [26:38] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [26:54] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [26:68] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [27:28] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createCertificate' @ [27:42] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'INTERMEDIATE_CA' @ [27:76] ==> enum entry INTERMEDIATE_CA defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'intermediateCACert' @ [27:93] ==> val intermediateCACert: X509CertificateHolder defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'intermediateCAKeyPair' @ [27:113] ==> val intermediateCAKeyPair: KeyPair defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'getX509Name' @ [27:136] ==> @JvmOverloads public fun getX509Name(myLegalName: String, nearestCity: String, email: String, country: String? = ...): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'clientCAKeyPair' @ [27:199] ==> val clientCAKeyPair: KeyPair defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'public' @ [27:215] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'nameConstraints' @ [27:241] ==> value-parameter nameConstraints: NameConstraints defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[ValueParameterDescriptorImpl]

'getInstance' @ [30:35] ==> public open fun getInstance(p0: (String..String?)): (KeyStore..KeyStore?) defined in java.security.KeyStore[JavaMethodDescriptor]

'KEYSTORE_TYPE' @ [30:47] ==> public val KEYSTORE_TYPE: String defined in net.corda.node.utilities[DeserializedPropertyDescriptor]

'trustStore' @ [31:9] ==> val trustStore: (KeyStore..KeyStore?) defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'load' @ [31:20] ==> public final fun load(p0: (InputStream..InputStream?), p1: (CharArray..CharArray?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'keyPass' @ [31:31] ==> val keyPass: String defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'toCharArray' @ [31:39] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trustStore' @ [32:9] ==> val trustStore: (KeyStore..KeyStore?) defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'addOrReplaceCertificate' @ [32:20] ==> public fun KeyStore.addOrReplaceCertificate(alias: String, cert: Certificate): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [32:44] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [32:58] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'rootCACert' @ [32:73] ==> val rootCACert: X509CertificateHolder defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'cert' @ [32:84] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'Crypto' @ [34:22] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [34:29] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [34:45] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [34:59] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [35:23] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createCertificate' @ [35:37] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'TLS' @ [35:71] ==> enum entry TLS defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'clientCACert' @ [35:76] ==> val clientCACert: X509CertificateHolder defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'clientCAKeyPair' @ [35:90] ==> val clientCAKeyPair: KeyPair defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'subjectName' @ [35:107] ==> value-parameter subjectName: X500Name defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[ValueParameterDescriptorImpl]

'tlsKey' @ [35:120] ==> val tlsKey: KeyPair defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'public' @ [35:127] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'getInstance' @ [37:33] ==> public open fun getInstance(p0: (String..String?)): (KeyStore..KeyStore?) defined in java.security.KeyStore[JavaMethodDescriptor]

'KEYSTORE_TYPE' @ [37:45] ==> public val KEYSTORE_TYPE: String defined in net.corda.node.utilities[DeserializedPropertyDescriptor]

'keyStore' @ [38:9] ==> val keyStore: (KeyStore..KeyStore?) defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'load' @ [38:18] ==> public final fun load(p0: (InputStream..InputStream?), p1: (CharArray..CharArray?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'keyPass' @ [38:29] ==> val keyPass: String defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'toCharArray' @ [38:37] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'keyStore' @ [39:9] ==> val keyStore: (KeyStore..KeyStore?) defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'addOrReplaceKey' @ [39:18] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out Certificate>): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [39:34] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [39:48] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'tlsKey' @ [39:66] ==> val tlsKey: KeyPair defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'private' @ [39:73] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'keyPass' @ [39:82] ==> val keyPass: String defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'toCharArray' @ [39:90] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'of' @ [40:24] ==> @SafeVarargs public open fun <T : (Any..Any?)> of(vararg p0: (X509CertificateHolder..X509CertificateHolder?)): (Stream<(X509CertificateHolder..X509CertificateHolder?)>..Stream<(X509CertificateHolder..X509CertificateHolder?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X509CertificateHolder

'tlsCert' @ [40:27] ==> val tlsCert: X509CertificateHolder defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'clientCACert' @ [40:36] ==> val clientCACert: X509CertificateHolder defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'intermediateCACert' @ [40:50] ==> val intermediateCACert: X509CertificateHolder defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'rootCACert' @ [40:70] ==> val rootCACert: X509CertificateHolder defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'map' @ [40:82] ==> public final fun <R : (Any..Any?)> map(p0: (((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?)..(((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?))?)): (Stream<(X509Certificate..X509Certificate?)>..Stream<(X509Certificate..X509Certificate?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> X509Certificate

'it' @ [40:88] ==> value-parameter it: (X509CertificateHolder..X509CertificateHolder?) defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores.<anonymous>[ValueParameterDescriptorImpl]

'cert' @ [40:91] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'toTypedArray' @ [40:98] ==> public inline fun <reified T> Stream<out Certificate>.toTypedArray(): Array<Certificate> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Certificate

'Pair' @ [41:16] ==> public constructor Pair<out A, out B>(first: (KeyStore..KeyStore?), second: (KeyStore..KeyStore?)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> (java.security.KeyStore..java.security.KeyStore?)
    <out B> -> (java.security.KeyStore..java.security.KeyStore?)

'keyStore' @ [41:21] ==> val keyStore: (KeyStore..KeyStore?) defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'trustStore' @ [41:31] ==> val trustStore: (KeyStore..KeyStore?) defined in net.corda.core.crypto.X509NameConstraintsTest.makeKeyStores[LocalVariableDescriptor]

'Test' @ [44:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [46:31] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [47:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> GeneralSubtree): List<GeneralSubtree> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> GeneralSubtree

'GeneralSubtree' @ [47:24] ==> public constructor GeneralSubtree(p0: (GeneralName..GeneralName?)) defined in org.bouncycastle.asn1.x509.GeneralSubtree[JavaClassConstructorDescriptor]

'GeneralName' @ [47:39] ==> public constructor GeneralName(p0: (X500Name..X500Name?)) defined in org.bouncycastle.asn1.x509.GeneralName[JavaClassConstructorDescriptor]

'X500Name' @ [47:51] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'it' @ [47:60] ==> value-parameter it: String defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [47:68] ==> public inline fun <reified T> Collection<GeneralSubtree>.toTypedArray(): Array<GeneralSubtree> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> GeneralSubtree

'NameConstraints' @ [49:31] ==> public constructor NameConstraints(p0: (Array<(GeneralSubtree..GeneralSubtree?)>..Array<out (GeneralSubtree..GeneralSubtree?)>?), p1: (Array<(GeneralSubtree..GeneralSubtree?)>..Array<out (GeneralSubtree..GeneralSubtree?)>?)) defined in org.bouncycastle.asn1.x509.NameConstraints[JavaClassConstructorDescriptor]

'acceptableNames' @ [49:47] ==> val acceptableNames: Array<GeneralSubtree> defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'arrayOf' @ [49:64] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (GeneralSubtree..GeneralSubtree?)): Array<(GeneralSubtree..GeneralSubtree?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (org.bouncycastle.asn1.x509.GeneralSubtree..org.bouncycastle.asn1.x509.GeneralSubtree?)

'getInstance' @ [50:47] ==> public open fun getInstance(p0: (String..String?)): (CertPathValidator..CertPathValidator?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'getInstance' @ [51:46] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'assertFailsWith' @ [53:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<CertPathValidatorException>, block: () -> Unit): CertPathValidatorException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> CertPathValidatorException

'CertPathValidatorException' @ [53:25] ==> public constructor CertPathValidatorException() defined in java.security.cert.CertPathValidatorException[JavaClassConstructorDescriptor]

'component1' @ [54:18] ==> public final operator fun component1(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [54:28] ==> public final operator fun component2(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'makeKeyStores' @ [54:42] ==> private final fun makeKeyStores(subjectName: X500Name, nameConstraints: NameConstraints): Pair<KeyStore, KeyStore> defined in net.corda.core.crypto.X509NameConstraintsTest[SimpleFunctionDescriptorImpl]

'X500Name' @ [54:56] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'nameConstraints' @ [54:79] ==> val nameConstraints: NameConstraints defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'PKIXParameters' @ [55:26] ==> public constructor PKIXParameters(p0: (KeyStore..KeyStore?)) defined in java.security.cert.PKIXParameters[JavaClassConstructorDescriptor]

'trustStore' @ [55:41] ==> val trustStore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'params' @ [56:13] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'isRevocationEnabled' @ [56:20] ==> public final var PKIXParameters.isRevocationEnabled: Boolean[MyPropertyDescriptor]

'certFactory' @ [57:28] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'generateCertPath' @ [57:40] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'keystore' @ [57:57] ==> val keystore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'getCertificateChain' @ [57:66] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [57:86] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [57:100] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'asList' @ [57:118] ==> public fun <T> Array<out (Certificate..Certificate?)>.asList(): List<(Certificate..Certificate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'pathValidator' @ [58:13] ==> val pathValidator: (CertPathValidator..CertPathValidator?) defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'validate' @ [58:27] ==> public final fun validate(p0: (CertPath..CertPath?), p1: (CertPathParameters..CertPathParameters?)): (CertPathValidatorResult..CertPathValidatorResult?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'certPath' @ [58:36] ==> val certPath: (CertPath..CertPath?) defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'params' @ [58:46] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [61:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'component1' @ [62:18] ==> public final operator fun component1(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [62:28] ==> public final operator fun component2(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'makeKeyStores' @ [62:42] ==> private final fun makeKeyStores(subjectName: X500Name, nameConstraints: NameConstraints): Pair<KeyStore, KeyStore> defined in net.corda.core.crypto.X509NameConstraintsTest[SimpleFunctionDescriptorImpl]

'X500Name' @ [62:56] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'nameConstraints' @ [62:93] ==> val nameConstraints: NameConstraints defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'PKIXParameters' @ [63:26] ==> public constructor PKIXParameters(p0: (KeyStore..KeyStore?)) defined in java.security.cert.PKIXParameters[JavaClassConstructorDescriptor]

'trustStore' @ [63:41] ==> val trustStore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'params' @ [64:13] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'isRevocationEnabled' @ [64:20] ==> public final var PKIXParameters.isRevocationEnabled: Boolean[MyPropertyDescriptor]

'certFactory' @ [65:28] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'generateCertPath' @ [65:40] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'keystore' @ [65:57] ==> val keystore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'getCertificateChain' @ [65:66] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [65:86] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [65:100] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'asList' @ [65:118] ==> public fun <T> Array<out (Certificate..Certificate?)>.asList(): List<(Certificate..Certificate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'pathValidator' @ [66:13] ==> val pathValidator: (CertPathValidator..CertPathValidator?) defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'validate' @ [66:27] ==> public final fun validate(p0: (CertPath..CertPath?), p1: (CertPathParameters..CertPathParameters?)): (CertPathValidatorResult..CertPathValidatorResult?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'certPath' @ [66:36] ==> val certPath: (CertPath..CertPath?) defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'params' @ [66:46] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [70:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'component1' @ [71:18] ==> public final operator fun component1(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [71:28] ==> public final operator fun component2(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'makeKeyStores' @ [71:42] ==> private final fun makeKeyStores(subjectName: X500Name, nameConstraints: NameConstraints): Pair<KeyStore, KeyStore> defined in net.corda.core.crypto.X509NameConstraintsTest[SimpleFunctionDescriptorImpl]

'X500Name' @ [71:56] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'nameConstraints' @ [71:79] ==> val nameConstraints: NameConstraints defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'PKIXParameters' @ [72:26] ==> public constructor PKIXParameters(p0: (KeyStore..KeyStore?)) defined in java.security.cert.PKIXParameters[JavaClassConstructorDescriptor]

'trustStore' @ [72:41] ==> val trustStore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'params' @ [73:13] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'isRevocationEnabled' @ [73:20] ==> public final var PKIXParameters.isRevocationEnabled: Boolean[MyPropertyDescriptor]

'certFactory' @ [74:28] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'generateCertPath' @ [74:40] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'keystore' @ [74:57] ==> val keystore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'getCertificateChain' @ [74:66] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [74:86] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [74:100] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'asList' @ [74:118] ==> public fun <T> Array<out (Certificate..Certificate?)>.asList(): List<(Certificate..Certificate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'pathValidator' @ [75:13] ==> val pathValidator: (CertPathValidator..CertPathValidator?) defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`[LocalVariableDescriptor]

'validate' @ [75:27] ==> public final fun validate(p0: (CertPath..CertPath?), p1: (CertPathParameters..CertPathParameters?)): (CertPathValidatorResult..CertPathValidatorResult?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'certPath' @ [75:36] ==> val certPath: (CertPath..CertPath?) defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'params' @ [75:46] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`illegal common name`.<anonymous>[LocalVariableDescriptor]

'Test' @ [80:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'listOf' @ [82:31] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [83:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> GeneralSubtree): List<GeneralSubtree> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> GeneralSubtree

'GeneralSubtree' @ [83:24] ==> public constructor GeneralSubtree(p0: (GeneralName..GeneralName?)) defined in org.bouncycastle.asn1.x509.GeneralSubtree[JavaClassConstructorDescriptor]

'GeneralName' @ [83:39] ==> public constructor GeneralName(p0: (X500Name..X500Name?)) defined in org.bouncycastle.asn1.x509.GeneralName[JavaClassConstructorDescriptor]

'X500Name' @ [83:51] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'it' @ [83:60] ==> value-parameter it: String defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [83:68] ==> public inline fun <reified T> Collection<GeneralSubtree>.toTypedArray(): Array<GeneralSubtree> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> GeneralSubtree

'NameConstraints' @ [85:31] ==> public constructor NameConstraints(p0: (Array<(GeneralSubtree..GeneralSubtree?)>..Array<out (GeneralSubtree..GeneralSubtree?)>?), p1: (Array<(GeneralSubtree..GeneralSubtree?)>..Array<out (GeneralSubtree..GeneralSubtree?)>?)) defined in org.bouncycastle.asn1.x509.NameConstraints[JavaClassConstructorDescriptor]

'acceptableNames' @ [85:47] ==> val acceptableNames: Array<GeneralSubtree> defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'arrayOf' @ [85:64] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (GeneralSubtree..GeneralSubtree?)): Array<(GeneralSubtree..GeneralSubtree?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (org.bouncycastle.asn1.x509.GeneralSubtree..org.bouncycastle.asn1.x509.GeneralSubtree?)

'getInstance' @ [86:46] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'Crypto' @ [87:9] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256R1_SHA256' @ [87:16] ==> @field:JvmField public final val ECDSA_SECP256R1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'getInstance' @ [88:47] ==> public open fun getInstance(p0: (String..String?), p1: (String..String?)): (CertPathValidator..CertPathValidator?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'PROVIDER_NAME' @ [88:88] ==> public const final val PROVIDER_NAME: String defined in org.bouncycastle.jce.provider.BouncyCastleProvider[JavaPropertyDescriptor]

'assertFailsWith' @ [90:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<CertPathValidatorException>, block: () -> Unit): CertPathValidatorException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> CertPathValidatorException

'CertPathValidatorException' @ [90:25] ==> public constructor CertPathValidatorException() defined in java.security.cert.CertPathValidatorException[JavaClassConstructorDescriptor]

'component1' @ [91:18] ==> public final operator fun component1(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [91:28] ==> public final operator fun component2(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'makeKeyStores' @ [91:42] ==> private final fun makeKeyStores(subjectName: X500Name, nameConstraints: NameConstraints): Pair<KeyStore, KeyStore> defined in net.corda.core.crypto.X509NameConstraintsTest[SimpleFunctionDescriptorImpl]

'X500Name' @ [91:56] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'nameConstraints' @ [91:79] ==> val nameConstraints: NameConstraints defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'PKIXParameters' @ [92:26] ==> public constructor PKIXParameters(p0: (KeyStore..KeyStore?)) defined in java.security.cert.PKIXParameters[JavaClassConstructorDescriptor]

'trustStore' @ [92:41] ==> val trustStore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'params' @ [93:13] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'isRevocationEnabled' @ [93:20] ==> public final var PKIXParameters.isRevocationEnabled: Boolean[MyPropertyDescriptor]

'certFactory' @ [94:28] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'generateCertPath' @ [94:40] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'keystore' @ [94:57] ==> val keystore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'getCertificateChain' @ [94:66] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [94:86] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [94:100] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'asList' @ [94:118] ==> public fun <T> Array<out (Certificate..Certificate?)>.asList(): List<(Certificate..Certificate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'pathValidator' @ [95:13] ==> val pathValidator: (CertPathValidator..CertPathValidator?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'validate' @ [95:27] ==> public final fun validate(p0: (CertPath..CertPath?), p1: (CertPathParameters..CertPathParameters?)): (CertPathValidatorResult..CertPathValidatorResult?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'certPath' @ [95:36] ==> val certPath: (CertPath..CertPath?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'params' @ [95:46] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'assertFailsWith' @ [98:9] ==> public fun <T : Throwable> assertFailsWith(exceptionClass: KClass<CertPathValidatorException>, block: () -> Unit): CertPathValidatorException defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Throwable> -> CertPathValidatorException

'CertPathValidatorException' @ [98:25] ==> public constructor CertPathValidatorException() defined in java.security.cert.CertPathValidatorException[JavaClassConstructorDescriptor]

'component1' @ [99:18] ==> public final operator fun component1(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [99:28] ==> public final operator fun component2(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'makeKeyStores' @ [99:42] ==> private final fun makeKeyStores(subjectName: X500Name, nameConstraints: NameConstraints): Pair<KeyStore, KeyStore> defined in net.corda.core.crypto.X509NameConstraintsTest[SimpleFunctionDescriptorImpl]

'X500Name' @ [99:56] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'nameConstraints' @ [99:90] ==> val nameConstraints: NameConstraints defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'PKIXParameters' @ [100:26] ==> public constructor PKIXParameters(p0: (KeyStore..KeyStore?)) defined in java.security.cert.PKIXParameters[JavaClassConstructorDescriptor]

'trustStore' @ [100:41] ==> val trustStore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'params' @ [101:13] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'isRevocationEnabled' @ [101:20] ==> public final var PKIXParameters.isRevocationEnabled: Boolean[MyPropertyDescriptor]

'certFactory' @ [102:28] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'generateCertPath' @ [102:40] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'keystore' @ [102:57] ==> val keystore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'getCertificateChain' @ [102:66] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [102:86] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [102:100] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'asList' @ [102:118] ==> public fun <T> Array<out (Certificate..Certificate?)>.asList(): List<(Certificate..Certificate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'pathValidator' @ [103:13] ==> val pathValidator: (CertPathValidator..CertPathValidator?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'validate' @ [103:27] ==> public final fun validate(p0: (CertPath..CertPath?), p1: (CertPathParameters..CertPathParameters?)): (CertPathValidatorResult..CertPathValidatorResult?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'certPath' @ [103:36] ==> val certPath: (CertPath..CertPath?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'params' @ [103:46] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [106:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'component1' @ [107:18] ==> public final operator fun component1(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [107:28] ==> public final operator fun component2(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'makeKeyStores' @ [107:42] ==> private final fun makeKeyStores(subjectName: X500Name, nameConstraints: NameConstraints): Pair<KeyStore, KeyStore> defined in net.corda.core.crypto.X509NameConstraintsTest[SimpleFunctionDescriptorImpl]

'X500Name' @ [107:56] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'nameConstraints' @ [107:111] ==> val nameConstraints: NameConstraints defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'PKIXParameters' @ [108:26] ==> public constructor PKIXParameters(p0: (KeyStore..KeyStore?)) defined in java.security.cert.PKIXParameters[JavaClassConstructorDescriptor]

'trustStore' @ [108:41] ==> val trustStore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'params' @ [109:13] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'isRevocationEnabled' @ [109:20] ==> public final var PKIXParameters.isRevocationEnabled: Boolean[MyPropertyDescriptor]

'certFactory' @ [110:28] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'generateCertPath' @ [110:40] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'keystore' @ [110:57] ==> val keystore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'getCertificateChain' @ [110:66] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [110:86] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [110:100] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'asList' @ [110:118] ==> public fun <T> Array<out (Certificate..Certificate?)>.asList(): List<(Certificate..Certificate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'pathValidator' @ [111:13] ==> val pathValidator: (CertPathValidator..CertPathValidator?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'validate' @ [111:27] ==> public final fun validate(p0: (CertPath..CertPath?), p1: (CertPathParameters..CertPathParameters?)): (CertPathValidatorResult..CertPathValidatorResult?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'certPath' @ [111:36] ==> val certPath: (CertPath..CertPath?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'params' @ [111:46] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'assertTrue' @ [115:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'component1' @ [116:18] ==> public final operator fun component1(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [116:28] ==> public final operator fun component2(): KeyStore defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'makeKeyStores' @ [116:42] ==> private final fun makeKeyStores(subjectName: X500Name, nameConstraints: NameConstraints): Pair<KeyStore, KeyStore> defined in net.corda.core.crypto.X509NameConstraintsTest[SimpleFunctionDescriptorImpl]

'X500Name' @ [116:56] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'nameConstraints' @ [116:106] ==> val nameConstraints: NameConstraints defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'PKIXParameters' @ [117:26] ==> public constructor PKIXParameters(p0: (KeyStore..KeyStore?)) defined in java.security.cert.PKIXParameters[JavaClassConstructorDescriptor]

'trustStore' @ [117:41] ==> val trustStore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'params' @ [118:13] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'isRevocationEnabled' @ [118:20] ==> public final var PKIXParameters.isRevocationEnabled: Boolean[MyPropertyDescriptor]

'certFactory' @ [119:28] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'generateCertPath' @ [119:40] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'keystore' @ [119:57] ==> val keystore: KeyStore defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'getCertificateChain' @ [119:66] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [119:86] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [119:100] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'asList' @ [119:118] ==> public fun <T> Array<out (Certificate..Certificate?)>.asList(): List<(Certificate..Certificate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'pathValidator' @ [120:13] ==> val pathValidator: (CertPathValidator..CertPathValidator?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`[LocalVariableDescriptor]

'validate' @ [120:27] ==> public final fun validate(p0: (CertPath..CertPath?), p1: (CertPathParameters..CertPathParameters?)): (CertPathValidatorResult..CertPathValidatorResult?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'certPath' @ [120:36] ==> val certPath: (CertPath..CertPath?) defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

'params' @ [120:46] ==> val params: PKIXParameters defined in net.corda.core.crypto.X509NameConstraintsTest.`x500 name with correct cn and extra attribute`.<anonymous>[LocalVariableDescriptor]

