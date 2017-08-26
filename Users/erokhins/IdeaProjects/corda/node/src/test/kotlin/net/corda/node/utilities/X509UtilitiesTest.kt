'Rule' @ [50:5] ==> public constructor Rule() defined in org.junit.Rule[JavaClassConstructorDescriptor]

'JvmField' @ [51:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'TemporaryFolder' @ [52:39] ==> public constructor TemporaryFolder() defined in org.junit.rules.TemporaryFolder[JavaClassConstructorDescriptor]

'Test' @ [54:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'generateKeyPair' @ [56:21] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[FunctionImportedFromObject]

'X509Utilities' @ [56:37] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [56:51] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [57:22] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [57:36] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'getTestX509Name' @ [57:66] ==> public fun getTestX509Name(commonName: String): X500Name defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'caKey' @ [57:96] ==> val caKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'assertTrue' @ [58:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'caCert' @ [58:22] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'subject' @ [58:29] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'commonName' @ [58:37] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'assertEquals' @ [59:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (X500Name..X500Name?), actual: (X500Name..X500Name?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (org.bouncycastle.asn1.x500.X500Name..org.bouncycastle.asn1.x500.X500Name?)

'caCert' @ [59:22] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'issuer' @ [59:29] ==> public final val X509CertificateHolder.issuer: (X500Name..X500Name?)[MyPropertyDescriptor]

'caCert' @ [59:37] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'subject' @ [59:44] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'caCert' @ [60:9] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'isValidOn' @ [60:16] ==> public open fun isValidOn(p0: (Date..Date?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'Date' @ [60:26] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'caCert' @ [61:9] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'isSignatureValid' @ [61:16] ==> public open fun isSignatureValid(p0: (ContentVerifierProvider..ContentVerifierProvider?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'JcaContentVerifierProviderBuilder' @ [61:33] ==> public constructor JcaContentVerifierProviderBuilder() defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaClassConstructorDescriptor]

'build' @ [61:69] ==> public open fun build(p0: (PublicKey..PublicKey?)): (ContentVerifierProvider..ContentVerifierProvider?) defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaMethodDescriptor]

'caKey' @ [61:75] ==> val caKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'public' @ [61:81] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'getInstance' @ [62:49] ==> public open fun getInstance(p0: (Any..Any?)): (BasicConstraints..BasicConstraints?) defined in org.bouncycastle.asn1.x509.BasicConstraints[JavaMethodDescriptor]

'caCert' @ [62:61] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'getExtension' @ [62:68] ==> public open fun getExtension(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?)): (Extension..Extension?) defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'basicConstraints' @ [62:91] ==> public final val basicConstraints: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x509.Extension[JavaPropertyDescriptor]

'parsedValue' @ [62:109] ==> public final val Extension.parsedValue: (ASN1Encodable..ASN1Encodable?)[MyPropertyDescriptor]

'getInstance' @ [63:33] ==> public open fun getInstance(p0: (Any..Any?)): (KeyUsage..KeyUsage?) defined in org.bouncycastle.asn1.x509.KeyUsage[JavaMethodDescriptor]

'caCert' @ [63:45] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'getExtension' @ [63:52] ==> public open fun getExtension(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?)): (Extension..Extension?) defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'keyUsage' @ [63:75] ==> public final val keyUsage: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x509.Extension[JavaPropertyDescriptor]

'parsedValue' @ [63:85] ==> public final val Extension.parsedValue: (ASN1Encodable..ASN1Encodable?)[MyPropertyDescriptor]

'assertFalse' @ [64:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'keyUsage' @ [64:23] ==> val keyUsage: (KeyUsage..KeyUsage?) defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'hasUsages' @ [64:32] ==> public open fun hasUsages(p0: Int): Boolean defined in org.bouncycastle.asn1.x509.KeyUsage[JavaMethodDescriptor]

'assertNull' @ [65:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'basicConstraints' @ [65:20] ==> val basicConstraints: (BasicConstraints..BasicConstraints?) defined in net.corda.node.utilities.X509UtilitiesTest.`create valid self-signed CA certificate`[LocalVariableDescriptor]

'pathLenConstraint' @ [65:37] ==> public final val BasicConstraints.pathLenConstraint: (BigInteger..BigInteger?)[MyPropertyDescriptor]

'Test' @ [68:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'tempFile' @ [70:34] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'generateKeyPair' @ [71:21] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[FunctionImportedFromObject]

'X509Utilities' @ [71:37] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [71:51] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [72:22] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [72:36] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'getTestX509Name' @ [72:66] ==> public fun getTestX509Name(commonName: String): X500Name defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'caKey' @ [72:96] ==> val caKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`load and save a PEM file certificate`[LocalVariableDescriptor]

'X509Utilities' @ [73:9] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'saveCertificateAsPEMFile' @ [73:23] ==> @JvmStatic public final fun saveCertificateAsPEMFile(x509Certificate: X509CertificateHolder, filename: Path): Unit defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'caCert' @ [73:48] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`load and save a PEM file certificate`[LocalVariableDescriptor]

'tmpCertificateFile' @ [73:56] ==> val tmpCertificateFile: Path defined in net.corda.node.utilities.X509UtilitiesTest.`load and save a PEM file certificate`[LocalVariableDescriptor]

'X509Utilities' @ [74:31] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'loadCertificateFromPEMFile' @ [74:45] ==> @JvmStatic public final fun loadCertificateFromPEMFile(filename: Path): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'tmpCertificateFile' @ [74:72] ==> val tmpCertificateFile: Path defined in net.corda.node.utilities.X509UtilitiesTest.`load and save a PEM file certificate`[LocalVariableDescriptor]

'assertEquals' @ [75:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: X509CertificateHolder, actual: X509CertificateHolder, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> X509CertificateHolder

'caCert' @ [75:22] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`load and save a PEM file certificate`[LocalVariableDescriptor]

'readCertificate' @ [75:30] ==> val readCertificate: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`load and save a PEM file certificate`[LocalVariableDescriptor]

'Test' @ [78:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'generateKeyPair' @ [80:21] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[FunctionImportedFromObject]

'X509Utilities' @ [80:37] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [80:51] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [81:22] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [81:36] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'getTestX509Name' @ [81:66] ==> public fun getTestX509Name(commonName: String): X500Name defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'caKey' @ [81:99] ==> val caKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'getTestX509Name' @ [82:23] ==> public fun getTestX509Name(commonName: String): X500Name defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'generateKeyPair' @ [83:23] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[FunctionImportedFromObject]

'X509Utilities' @ [83:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [83:53] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [84:26] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createCertificate' @ [84:40] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'TLS' @ [84:74] ==> enum entry TLS defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'caCert' @ [84:79] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'caKey' @ [84:87] ==> val caKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'subject' @ [84:94] ==> val subject: X500Name defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'keyPair' @ [84:103] ==> val keyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'public' @ [84:111] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertTrue' @ [85:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'serverCert' @ [85:22] ==> val serverCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'subject' @ [85:33] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'toString' @ [85:41] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'contains' @ [85:52] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [86:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (X500Name..X500Name?), actual: (X500Name..X500Name?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (org.bouncycastle.asn1.x500.X500Name..org.bouncycastle.asn1.x500.X500Name?)

'caCert' @ [86:22] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'issuer' @ [86:29] ==> public final val X509CertificateHolder.issuer: (X500Name..X500Name?)[MyPropertyDescriptor]

'serverCert' @ [86:37] ==> val serverCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'issuer' @ [86:48] ==> public final val X509CertificateHolder.issuer: (X500Name..X500Name?)[MyPropertyDescriptor]

'serverCert' @ [87:9] ==> val serverCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'isValidOn' @ [87:20] ==> public open fun isValidOn(p0: (Date..Date?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'Date' @ [87:30] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'serverCert' @ [88:9] ==> val serverCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'isSignatureValid' @ [88:20] ==> public open fun isSignatureValid(p0: (ContentVerifierProvider..ContentVerifierProvider?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'JcaContentVerifierProviderBuilder' @ [88:37] ==> public constructor JcaContentVerifierProviderBuilder() defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaClassConstructorDescriptor]

'build' @ [88:73] ==> public open fun build(p0: (PublicKey..PublicKey?)): (ContentVerifierProvider..ContentVerifierProvider?) defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaMethodDescriptor]

'caKey' @ [88:79] ==> val caKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'public' @ [88:85] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'getInstance' @ [89:49] ==> public open fun getInstance(p0: (Any..Any?)): (BasicConstraints..BasicConstraints?) defined in org.bouncycastle.asn1.x509.BasicConstraints[JavaMethodDescriptor]

'serverCert' @ [89:61] ==> val serverCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'getExtension' @ [89:72] ==> public open fun getExtension(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?)): (Extension..Extension?) defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'basicConstraints' @ [89:95] ==> public final val basicConstraints: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x509.Extension[JavaPropertyDescriptor]

'parsedValue' @ [89:113] ==> public final val Extension.parsedValue: (ASN1Encodable..ASN1Encodable?)[MyPropertyDescriptor]

'getInstance' @ [90:33] ==> public open fun getInstance(p0: (Any..Any?)): (KeyUsage..KeyUsage?) defined in org.bouncycastle.asn1.x509.KeyUsage[JavaMethodDescriptor]

'serverCert' @ [90:45] ==> val serverCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'getExtension' @ [90:56] ==> public open fun getExtension(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?)): (Extension..Extension?) defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'keyUsage' @ [90:79] ==> public final val keyUsage: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x509.Extension[JavaPropertyDescriptor]

'parsedValue' @ [90:89] ==> public final val Extension.parsedValue: (ASN1Encodable..ASN1Encodable?)[MyPropertyDescriptor]

'assertFalse' @ [91:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'keyUsage' @ [91:23] ==> val keyUsage: (KeyUsage..KeyUsage?) defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'hasUsages' @ [91:32] ==> public open fun hasUsages(p0: Int): Boolean defined in org.bouncycastle.asn1.x509.KeyUsage[JavaMethodDescriptor]

'assertNull' @ [92:9] ==> public fun assertNull(actual: Any?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'basicConstraints' @ [92:20] ==> val basicConstraints: (BasicConstraints..BasicConstraints?) defined in net.corda.node.utilities.X509UtilitiesTest.`create valid server certificate chain`[LocalVariableDescriptor]

'pathLenConstraint' @ [92:37] ==> public final val BasicConstraints.pathLenConstraint: (BigInteger..BigInteger?)[MyPropertyDescriptor]

'Test' @ [95:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'tempFile' @ [97:27] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'generateKeyPair' @ [99:23] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[FunctionImportedFromObject]

'EDDSA_ED25519_SHA512' @ [99:39] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[PropertyImportedFromObject]

'X509Utilities' @ [100:28] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [100:42] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'X500Name' @ [100:72] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'keyPair' @ [100:93] ==> val keyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'assertTrue' @ [102:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'equals' @ [102:27] ==> public open fun equals(p0: (ByteArray..ByteArray?), p1: (ByteArray..ByteArray?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'selfSignCert' @ [102:34] ==> val selfSignCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'subjectPublicKeyInfo' @ [102:47] ==> public final val X509CertificateHolder.subjectPublicKeyInfo: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?)[MyPropertyDescriptor]

'encoded' @ [102:68] ==> public final val SubjectPublicKeyInfo.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'keyPair' @ [102:77] ==> val keyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'public' @ [102:85] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'encoded' @ [102:92] ==> public final val PublicKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'loadOrCreateKeyStore' @ [105:24] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpKeyStore' @ [105:45] ==> val tmpKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'keyStore' @ [106:9] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'setKeyEntry' @ [106:18] ==> public final fun setKeyEntry(p0: (String..String?), p1: (Key..Key?), p2: (CharArray..CharArray?), p3: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'keyPair' @ [106:37] ==> val keyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'private' @ [106:45] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'toCharArray' @ [106:65] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'of' @ [107:24] ==> public open fun <T : (Any..Any?)> of(p0: (X509CertificateHolder..X509CertificateHolder?)): (Stream<(X509CertificateHolder..X509CertificateHolder?)>..Stream<(X509CertificateHolder..X509CertificateHolder?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X509CertificateHolder

'selfSignCert' @ [107:27] ==> val selfSignCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'map' @ [107:41] ==> public final fun <R : (Any..Any?)> map(p0: (((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?)..(((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?))?)): (Stream<(X509Certificate..X509Certificate?)>..Stream<(X509Certificate..X509Certificate?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> X509Certificate

'it' @ [107:47] ==> value-parameter it: (X509CertificateHolder..X509CertificateHolder?) defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`.<anonymous>[ValueParameterDescriptorImpl]

'cert' @ [107:50] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'toTypedArray' @ [107:57] ==> public inline fun <reified T> Stream<out (X509Certificate..X509Certificate?)>.toTypedArray(): Array<(X509Certificate..X509Certificate?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.security.cert.X509Certificate..java.security.cert.X509Certificate?)

'keyStore' @ [108:9] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'save' @ [108:18] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpKeyStore' @ [108:23] ==> val tmpKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'loadOrCreateKeyStore' @ [111:25] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpKeyStore' @ [111:46] ==> val tmpKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'keyStore2' @ [112:26] ==> val keyStore2: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'getKey' @ [112:36] ==> public final fun getKey(p0: (String..String?), p1: (CharArray..CharArray?)): (Key..Key?) defined in java.security.KeyStore[JavaMethodDescriptor]

'toCharArray' @ [112:61] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'keyStore2' @ [113:22] ==> val keyStore2: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'getCertificate' @ [113:32] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'publicKey' @ [113:54] ==> public final val Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertNotNull' @ [115:9] ==> public fun <T : Any> assertNotNull(actual: PublicKey?, message: String? = ...): PublicKey defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PublicKey

'pubKey' @ [115:23] ==> val pubKey: (PublicKey..PublicKey?) defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'assertNotNull' @ [116:9] ==> public fun <T : Any> assertNotNull(actual: Key?, message: String? = ...): Key defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Key

'privateKey' @ [116:23] ==> val privateKey: (Key..Key?) defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'assertEquals' @ [117:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (PublicKey..PublicKey?), actual: (PublicKey..PublicKey?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.security.PublicKey..java.security.PublicKey?)

'keyPair' @ [117:22] ==> val keyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'public' @ [117:30] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'pubKey' @ [117:38] ==> val pubKey: (PublicKey..PublicKey?) defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'assertEquals' @ [118:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (Key..Key?), actual: (Key..Key?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.security.Key..java.security.Key?)

'keyPair' @ [118:22] ==> val keyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'private' @ [118:30] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'privateKey' @ [118:39] ==> val privateKey: (Key..Key?) defined in net.corda.node.utilities.X509UtilitiesTest.`storing EdDSA key in java keystore`[LocalVariableDescriptor]

'Test' @ [121:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'tempFile' @ [123:27] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'generateKeyPair' @ [124:24] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[FunctionImportedFromObject]

'Crypto' @ [124:40] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256R1_SHA256' @ [124:47] ==> @field:JvmField public final val ECDSA_SECP256R1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'X509Utilities' @ [125:25] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [125:39] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'X500Name' @ [125:69] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'ecDSAKey' @ [125:90] ==> val ecDSAKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'generateKeyPair' @ [126:28] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[FunctionImportedFromObject]

'EDDSA_ED25519_SHA512' @ [126:44] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[PropertyImportedFromObject]

'X509Utilities' @ [127:25] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createCertificate' @ [127:39] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'TLS' @ [127:73] ==> enum entry TLS defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'ecDSACert' @ [127:78] ==> val ecDSACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'ecDSAKey' @ [127:89] ==> val ecDSAKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'X500Name' @ [127:99] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'edDSAKeypair' @ [127:125] ==> val edDSAKeypair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'public' @ [127:138] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'loadOrCreateKeyStore' @ [130:24] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpKeyStore' @ [130:45] ==> val tmpKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'keyStore' @ [131:9] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'setKeyEntry' @ [131:18] ==> public final fun setKeyEntry(p0: (String..String?), p1: (Key..Key?), p2: (CharArray..CharArray?), p3: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'edDSAKeypair' @ [131:37] ==> val edDSAKeypair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'private' @ [131:50] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'toCharArray' @ [131:70] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'of' @ [132:24] ==> @SafeVarargs public open fun <T : (Any..Any?)> of(vararg p0: (X509CertificateHolder..X509CertificateHolder?)): (Stream<(X509CertificateHolder..X509CertificateHolder?)>..Stream<(X509CertificateHolder..X509CertificateHolder?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X509CertificateHolder

'ecDSACert' @ [132:27] ==> val ecDSACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'edDSACert' @ [132:38] ==> val edDSACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'map' @ [132:49] ==> public final fun <R : (Any..Any?)> map(p0: (((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?)..(((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?))?)): (Stream<(X509Certificate..X509Certificate?)>..Stream<(X509Certificate..X509Certificate?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> X509Certificate

'it' @ [132:55] ==> value-parameter it: (X509CertificateHolder..X509CertificateHolder?) defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`.<anonymous>[ValueParameterDescriptorImpl]

'cert' @ [132:58] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'toTypedArray' @ [132:65] ==> public inline fun <reified T> Stream<out (X509Certificate..X509Certificate?)>.toTypedArray(): Array<(X509Certificate..X509Certificate?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.security.cert.X509Certificate..java.security.cert.X509Certificate?)

'keyStore' @ [133:9] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'save' @ [133:18] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpKeyStore' @ [133:23] ==> val tmpKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'loadOrCreateKeyStore' @ [136:25] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpKeyStore' @ [136:46] ==> val tmpKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'keyStore2' @ [137:26] ==> val keyStore2: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'getKey' @ [137:36] ==> public final fun getKey(p0: (String..String?), p1: (CharArray..CharArray?)): (Key..Key?) defined in java.security.KeyStore[JavaMethodDescriptor]

'toCharArray' @ [137:61] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'keyStore2' @ [138:21] ==> val keyStore2: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'getCertificateChain' @ [138:31] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'certs' @ [140:22] ==> val certs: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'last' @ [140:28] ==> public fun <T> Array<out (Certificate..Certificate?)>.last(): (Certificate..Certificate?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'publicKey' @ [140:35] ==> public final val Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'assertEquals' @ [142:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'certs' @ [142:25] ==> val certs: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'size' @ [142:31] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'assertNotNull' @ [143:9] ==> public fun <T : Any> assertNotNull(actual: PublicKey?, message: String? = ...): PublicKey defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PublicKey

'pubKey' @ [143:23] ==> val pubKey: (PublicKey..PublicKey?) defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'assertNotNull' @ [144:9] ==> public fun <T : Any> assertNotNull(actual: Key?, message: String? = ...): Key defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Key

'privateKey' @ [144:23] ==> val privateKey: (Key..Key?) defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'assertEquals' @ [145:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (PublicKey..PublicKey?), actual: (PublicKey..PublicKey?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.security.PublicKey..java.security.PublicKey?)

'edDSAKeypair' @ [145:22] ==> val edDSAKeypair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'public' @ [145:35] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'pubKey' @ [145:43] ==> val pubKey: (PublicKey..PublicKey?) defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'assertEquals' @ [146:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (Key..Key?), actual: (Key..Key?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.security.Key..java.security.Key?)

'edDSAKeypair' @ [146:22] ==> val edDSAKeypair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'private' @ [146:35] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'privateKey' @ [146:44] ==> val privateKey: (Key..Key?) defined in net.corda.node.utilities.X509UtilitiesTest.`signing EdDSA key with EcDSA certificate`[LocalVariableDescriptor]

'Test' @ [149:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'tempFile' @ [151:27] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tempFile' @ [152:29] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'createCAKeyStoreAndTrustStore' @ [155:9] ==> private final fun createCAKeyStoreAndTrustStore(keyStoreFilePath: Path, storePassword: String, keyPassword: String, trustStoreFilePath: Path, trustStorePassword: String): KeyStore defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tmpKeyStore' @ [155:39] ==> val tmpKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'tmpTrustStore' @ [155:79] ==> val tmpTrustStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'loadKeyStore' @ [158:24] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpKeyStore' @ [158:37] ==> val tmpKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'loadKeyStore' @ [159:26] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpTrustStore' @ [159:39] ==> val tmpTrustStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'keyStore' @ [160:26] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'getCertificate' @ [160:35] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [160:50] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [160:64] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'keyStore' @ [161:32] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'getKey' @ [161:41] ==> public final fun getKey(p0: (String..String?), p1: (CharArray..CharArray?)): (Key..Key?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [161:48] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [161:62] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'toCharArray' @ [161:87] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trustStore' @ [162:36] ==> val trustStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'getCertificate' @ [162:47] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [162:62] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [162:76] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertEquals' @ [163:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: X509Certificate, actual: X509Certificate, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> X509Certificate

'rootCaCert' @ [163:22] ==> val rootCaCert: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'rootCaFromTrustStore' @ [163:34] ==> val rootCaFromTrustStore: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'rootCaCert' @ [164:9] ==> val rootCaCert: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'checkValidity' @ [164:20] ==> public abstract fun checkValidity(p0: (Date..Date?)): Unit defined in java.security.cert.X509Certificate[JavaMethodDescriptor]

'Date' @ [164:34] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'rootCaCert' @ [165:9] ==> val rootCaCert: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'verify' @ [165:20] ==> public abstract fun verify(p0: (PublicKey..PublicKey?)): Unit defined in java.security.cert.X509Certificate[JavaMethodDescriptor]

'rootCaCert' @ [165:27] ==> val rootCaCert: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'publicKey' @ [165:38] ==> public final val X509Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'toByteArray' @ [168:32] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [169:27] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'doSign' @ [169:34] ==> @JvmStatic public final fun doSign(signatureScheme: SignatureScheme, privateKey: PrivateKey, clearData: ByteArray): ByteArray defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [169:41] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [169:55] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'rootCaPrivateKey' @ [169:85] ==> val rootCaPrivateKey: PrivateKey defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'testData' @ [169:103] ==> val testData: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'assertTrue' @ [170:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [170:22] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'isValid' @ [170:29] ==> @JvmStatic public final fun isValid(signatureScheme: SignatureScheme, publicKey: PublicKey, signatureData: ByteArray, clearData: ByteArray): Boolean defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [170:37] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [170:51] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'rootCaCert' @ [170:81] ==> val rootCaCert: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'publicKey' @ [170:92] ==> public final val X509Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'caSignature' @ [170:103] ==> val caSignature: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'testData' @ [170:116] ==> val testData: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'keyStore' @ [173:34] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'getCertificate' @ [173:43] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [173:58] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_INTERMEDIATE_CA' @ [173:72] ==> public final val CORDA_INTERMEDIATE_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'keyStore' @ [174:44] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'getKey' @ [174:53] ==> public final fun getKey(p0: (String..String?), p1: (CharArray..CharArray?)): (Key..Key?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [174:60] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_INTERMEDIATE_CA' @ [174:74] ==> public final val CORDA_INTERMEDIATE_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'toCharArray' @ [174:107] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'intermediateCaCert' @ [175:9] ==> val intermediateCaCert: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'checkValidity' @ [175:28] ==> public abstract fun checkValidity(p0: (Date..Date?)): Unit defined in java.security.cert.X509Certificate[JavaMethodDescriptor]

'Date' @ [175:42] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'intermediateCaCert' @ [176:9] ==> val intermediateCaCert: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'verify' @ [176:28] ==> public abstract fun verify(p0: (PublicKey..PublicKey?)): Unit defined in java.security.cert.X509Certificate[JavaMethodDescriptor]

'rootCaCert' @ [176:35] ==> val rootCaCert: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'publicKey' @ [176:46] ==> public final val X509Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'Crypto' @ [179:37] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'doSign' @ [179:44] ==> @JvmStatic public final fun doSign(signatureScheme: SignatureScheme, privateKey: PrivateKey, clearData: ByteArray): ByteArray defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [179:51] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [179:65] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'intermediateCaCertPrivateKey' @ [179:95] ==> val intermediateCaCertPrivateKey: PrivateKey defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'testData' @ [179:125] ==> val testData: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'assertTrue' @ [180:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [180:22] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'isValid' @ [180:29] ==> @JvmStatic public final fun isValid(signatureScheme: SignatureScheme, publicKey: PublicKey, signatureData: ByteArray, clearData: ByteArray): Boolean defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [180:37] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [180:51] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'intermediateCaCert' @ [180:81] ==> val intermediateCaCert: X509Certificate defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'publicKey' @ [180:100] ==> public final val X509Certificate.publicKey: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'intermediateSignature' @ [180:111] ==> val intermediateSignature: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'testData' @ [180:134] ==> val testData: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`create full CA keystore`[LocalVariableDescriptor]

'Test' @ [183:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'tempFile' @ [185:29] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tempFile' @ [186:29] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tempFile' @ [187:30] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tempFile' @ [188:33] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'createCAKeyStoreAndTrustStore' @ [191:9] ==> private final fun createCAKeyStoreAndTrustStore(keyStoreFilePath: Path, storePassword: String, keyPassword: String, trustStoreFilePath: Path, trustStorePassword: String): KeyStore defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tmpCAKeyStore' @ [191:39] ==> val tmpCAKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'tmpTrustStore' @ [194:17] ==> val tmpTrustStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'loadKeyStore' @ [198:26] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpCAKeyStore' @ [198:39] ==> val tmpCAKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'caKeyStore' @ [199:28] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'getCertificateAndKeyPair' @ [199:39] ==> public fun KeyStore.getCertificateAndKeyPair(alias: String, keyPassword: String): CertificateAndKeyPair defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [199:64] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_INTERMEDIATE_CA' @ [199:78] ==> public final val CORDA_INTERMEDIATE_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'createKeystoreForCordaNode' @ [202:9] ==> public fun createKeystoreForCordaNode(sslKeyStorePath: Path, clientCAKeystorePath: Path, storePassword: String, keyPassword: String, caKeyStore: KeyStore, caKeyPassword: String, legalName: X500Name, signatureScheme: SignatureScheme = ...): Unit defined in net.corda.node.services.config[DeserializedSimpleFunctionDescriptor]

'tmpSSLKeyStore' @ [202:36] ==> val tmpSSLKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'tmpServerKeyStore' @ [202:52] ==> val tmpServerKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'caKeyStore' @ [202:107] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'MEGA_CORP' @ [202:132] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [202:142] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'loadKeyStore' @ [205:30] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpServerKeyStore' @ [205:43] ==> val tmpServerKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'serverKeyStore' @ [206:32] ==> val serverKeyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'getCertificateAndKeyPair' @ [206:47] ==> public fun KeyStore.getCertificateAndKeyPair(alias: String, keyPassword: String): CertificateAndKeyPair defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [206:72] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_CA' @ [206:86] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'serverCertAndKey' @ [208:9] ==> val serverCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'certificate' @ [208:26] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'isValidOn' @ [208:38] ==> public open fun isValidOn(p0: (Date..Date?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'Date' @ [208:48] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'serverCertAndKey' @ [209:9] ==> val serverCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'certificate' @ [209:26] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'isSignatureValid' @ [209:38] ==> public open fun isSignatureValid(p0: (ContentVerifierProvider..ContentVerifierProvider?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'JcaContentVerifierProviderBuilder' @ [209:55] ==> public constructor JcaContentVerifierProviderBuilder() defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaClassConstructorDescriptor]

'build' @ [209:91] ==> public open fun build(p0: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?)): (ContentVerifierProvider..ContentVerifierProvider?) defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaMethodDescriptor]

'caCertAndKey' @ [209:97] ==> val caCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'certificate' @ [209:110] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'subjectPublicKeyInfo' @ [209:122] ==> public final val X509CertificateHolder.subjectPublicKeyInfo: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?)[MyPropertyDescriptor]

'assertTrue' @ [211:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'serverCertAndKey' @ [211:22] ==> val serverCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'certificate' @ [211:39] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'subject' @ [211:51] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'toString' @ [211:59] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'contains' @ [211:70] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [211:79] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [211:89] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'commonName' @ [211:94] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'loadKeyStore' @ [214:27] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpSSLKeyStore' @ [214:40] ==> val tmpSSLKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'sslKeyStore' @ [215:29] ==> val sslKeyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'getCertificateAndKeyPair' @ [215:41] ==> public fun KeyStore.getCertificateAndKeyPair(alias: String, keyPassword: String): CertificateAndKeyPair defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [215:66] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [215:80] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'sslCertAndKey' @ [217:9] ==> val sslCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'certificate' @ [217:23] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'isValidOn' @ [217:35] ==> public open fun isValidOn(p0: (Date..Date?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'Date' @ [217:45] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'sslCertAndKey' @ [218:9] ==> val sslCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'certificate' @ [218:23] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'isSignatureValid' @ [218:35] ==> public open fun isSignatureValid(p0: (ContentVerifierProvider..ContentVerifierProvider?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'JcaContentVerifierProviderBuilder' @ [218:52] ==> public constructor JcaContentVerifierProviderBuilder() defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaClassConstructorDescriptor]

'build' @ [218:88] ==> public open fun build(p0: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?)): (ContentVerifierProvider..ContentVerifierProvider?) defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaMethodDescriptor]

'serverCertAndKey' @ [218:94] ==> val serverCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'certificate' @ [218:111] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'subjectPublicKeyInfo' @ [218:123] ==> public final val X509CertificateHolder.subjectPublicKeyInfo: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?)[MyPropertyDescriptor]

'assertTrue' @ [220:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'sslCertAndKey' @ [220:22] ==> val sslCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'certificate' @ [220:36] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'subject' @ [220:48] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'toString' @ [220:56] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'contains' @ [220:67] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'MEGA_CORP' @ [220:76] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [220:86] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'commonName' @ [220:91] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'toByteArray' @ [222:33] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [223:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'doSign' @ [223:32] ==> @JvmStatic public final fun doSign(signatureScheme: SignatureScheme, privateKey: PrivateKey, clearData: ByteArray): ByteArray defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [223:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [223:53] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'serverCertAndKey' @ [223:83] ==> val serverCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'keyPair' @ [223:100] ==> public final val keyPair: KeyPair defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'private' @ [223:108] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'testData' @ [223:117] ==> val testData: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'Crypto' @ [224:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'toSupportedPublicKey' @ [224:32] ==> @JvmStatic public final fun toSupportedPublicKey(key: SubjectPublicKeyInfo): PublicKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'serverCertAndKey' @ [224:53] ==> val serverCertAndKey: CertificateAndKeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'certificate' @ [224:70] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'subjectPublicKeyInfo' @ [224:82] ==> public final val X509CertificateHolder.subjectPublicKeyInfo: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?)[MyPropertyDescriptor]

'assertTrue' @ [225:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [225:22] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'isValid' @ [225:29] ==> @JvmStatic public final fun isValid(signatureScheme: SignatureScheme, publicKey: PublicKey, signatureData: ByteArray, clearData: ByteArray): Boolean defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [225:37] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [225:51] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'publicKey' @ [225:81] ==> val publicKey: PublicKey defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'signature' @ [225:92] ==> val signature: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'testData' @ [225:103] ==> val testData: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`create server certificate in keystore for SSL`[LocalVariableDescriptor]

'Test' @ [228:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'tempFile' @ [230:29] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tempFile' @ [231:29] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tempFile' @ [232:30] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tempFile' @ [233:33] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'createCAKeyStoreAndTrustStore' @ [236:26] ==> private final fun createCAKeyStoreAndTrustStore(keyStoreFilePath: Path, storePassword: String, keyPassword: String, trustStoreFilePath: Path, trustStorePassword: String): KeyStore defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'tmpCAKeyStore' @ [236:56] ==> val tmpCAKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'tmpTrustStore' @ [239:17] ==> val tmpTrustStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'createKeystoreForCordaNode' @ [243:9] ==> public fun createKeystoreForCordaNode(sslKeyStorePath: Path, clientCAKeystorePath: Path, storePassword: String, keyPassword: String, caKeyStore: KeyStore, caKeyPassword: String, legalName: X500Name, signatureScheme: SignatureScheme = ...): Unit defined in net.corda.node.services.config[DeserializedSimpleFunctionDescriptor]

'tmpSSLKeyStore' @ [243:36] ==> val tmpSSLKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'tmpServerKeyStore' @ [243:52] ==> val tmpServerKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'caKeyStore' @ [243:109] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'MEGA_CORP' @ [243:134] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [243:144] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'loadKeyStore' @ [244:24] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpSSLKeyStore' @ [244:37] ==> val tmpSSLKeyStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'loadKeyStore' @ [245:26] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tmpTrustStore' @ [245:39] ==> val tmpTrustStore: Path defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'getInstance' @ [247:34] ==> public open fun getInstance(p0: (String..String?)): (SSLContext..SSLContext?) defined in javax.net.ssl.SSLContext[JavaMethodDescriptor]

'getInstance' @ [248:51] ==> public final fun getInstance(p0: (String..String?)): (KeyManagerFactory..KeyManagerFactory?) defined in javax.net.ssl.KeyManagerFactory[JavaMethodDescriptor]

'getDefaultAlgorithm' @ [248:81] ==> public final fun getDefaultAlgorithm(): (String..String?) defined in javax.net.ssl.KeyManagerFactory[JavaMethodDescriptor]

'keyManagerFactory' @ [249:9] ==> val keyManagerFactory: (KeyManagerFactory..KeyManagerFactory?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'init' @ [249:27] ==> public final fun init(p0: (KeyStore..KeyStore?), p1: (CharArray..CharArray?)): Unit defined in javax.net.ssl.KeyManagerFactory[JavaMethodDescriptor]

'keyStore' @ [249:32] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'toCharArray' @ [249:60] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'keyManagerFactory' @ [250:27] ==> val keyManagerFactory: (KeyManagerFactory..KeyManagerFactory?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'keyManagers' @ [250:45] ==> public final val KeyManagerFactory.keyManagers: (Array<(KeyManager..KeyManager?)>..Array<out (KeyManager..KeyManager?)>?)[MyPropertyDescriptor]

'getInstance' @ [251:51] ==> public final fun getInstance(p0: (String..String?)): (TrustManagerFactory..TrustManagerFactory?) defined in javax.net.ssl.TrustManagerFactory[JavaMethodDescriptor]

'getDefaultAlgorithm' @ [251:83] ==> public final fun getDefaultAlgorithm(): (String..String?) defined in javax.net.ssl.TrustManagerFactory[JavaMethodDescriptor]

'trustMgrFactory' @ [252:9] ==> val trustMgrFactory: (TrustManagerFactory..TrustManagerFactory?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'init' @ [252:25] ==> public final fun init(p0: (KeyStore..KeyStore?)): Unit defined in javax.net.ssl.TrustManagerFactory[JavaMethodDescriptor]

'trustStore' @ [252:30] ==> val trustStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'trustMgrFactory' @ [253:29] ==> val trustMgrFactory: (TrustManagerFactory..TrustManagerFactory?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'trustManagers' @ [253:45] ==> public final val TrustManagerFactory.trustManagers: (Array<(TrustManager..TrustManager?)>..Array<out (TrustManager..TrustManager?)>?)[MyPropertyDescriptor]

'context' @ [254:9] ==> val context: (SSLContext..SSLContext?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'init' @ [254:17] ==> public final fun init(p0: (Array<(KeyManager..KeyManager?)>..Array<out (KeyManager..KeyManager?)>?), p1: (Array<(TrustManager..TrustManager?)>..Array<out (TrustManager..TrustManager?)>?), p2: (SecureRandom..SecureRandom?)): Unit defined in javax.net.ssl.SSLContext[JavaMethodDescriptor]

'keyManagers' @ [254:22] ==> val keyManagers: (Array<(KeyManager..KeyManager?)>..Array<out (KeyManager..KeyManager?)>?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'trustManagers' @ [254:35] ==> val trustManagers: (Array<(TrustManager..TrustManager?)>..Array<out (TrustManager..TrustManager?)>?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'SecureRandom' @ [254:50] ==> public constructor SecureRandom() defined in java.security.SecureRandom[JavaClassConstructorDescriptor]

'context' @ [256:35] ==> val context: (SSLContext..SSLContext?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'serverSocketFactory' @ [256:43] ==> public final val SSLContext.serverSocketFactory: (SSLServerSocketFactory..SSLServerSocketFactory?)[MyPropertyDescriptor]

'context' @ [257:35] ==> val context: (SSLContext..SSLContext?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'socketFactory' @ [257:43] ==> public final val SSLContext.socketFactory: (SSLSocketFactory..SSLSocketFactory?)[MyPropertyDescriptor]

'serverSocketFactory' @ [259:28] ==> val serverSocketFactory: (SSLServerSocketFactory..SSLServerSocketFactory?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'createServerSocket' @ [259:48] ==> public abstract fun createServerSocket(p0: Int): (ServerSocket..ServerSocket?) defined in javax.net.ssl.SSLServerSocketFactory[JavaMethodDescriptor]

'SSLParameters' @ [260:28] ==> public constructor SSLParameters(p0: (Array<(String..String?)>..Array<out (String..String?)>?), p1: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in javax.net.ssl.SSLParameters[JavaClassConstructorDescriptor]

'arrayOf' @ [260:42] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'arrayOf' @ [266:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'serverParams' @ [267:9] ==> val serverParams: SSLParameters defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'wantClientAuth' @ [267:22] ==> public final var SSLParameters.wantClientAuth: Boolean[MyPropertyDescriptor]

'serverParams' @ [268:9] ==> val serverParams: SSLParameters defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'needClientAuth' @ [268:22] ==> public final var SSLParameters.needClientAuth: Boolean[MyPropertyDescriptor]

'serverParams' @ [269:9] ==> val serverParams: SSLParameters defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'endpointIdentificationAlgorithm' @ [269:22] ==> public final var SSLParameters.endpointIdentificationAlgorithm: (String..String?)[MyPropertyDescriptor]

'serverSocket' @ [270:9] ==> val serverSocket: SSLServerSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'sslParameters' @ [270:22] ==> public final var SSLServerSocket.sslParameters: (SSLParameters..SSLParameters?)[MyPropertyDescriptor]

'serverParams' @ [270:38] ==> val serverParams: SSLParameters defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'serverSocket' @ [271:9] ==> val serverSocket: SSLServerSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'useClientMode' @ [271:22] ==> public final var SSLServerSocket.useClientMode: Boolean[MyPropertyDescriptor]

'clientSocketFactory' @ [273:28] ==> val clientSocketFactory: (SSLSocketFactory..SSLSocketFactory?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'createSocket' @ [273:48] ==> public open fun createSocket(): (Socket..Socket?) defined in javax.net.ssl.SSLSocketFactory[JavaMethodDescriptor]

'SSLParameters' @ [274:28] ==> public constructor SSLParameters(p0: (Array<(String..String?)>..Array<out (String..String?)>?), p1: (Array<(String..String?)>..Array<out (String..String?)>?)) defined in javax.net.ssl.SSLParameters[JavaClassConstructorDescriptor]

'arrayOf' @ [274:42] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'arrayOf' @ [280:17] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'clientParams' @ [281:9] ==> val clientParams: SSLParameters defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'endpointIdentificationAlgorithm' @ [281:22] ==> public final var SSLParameters.endpointIdentificationAlgorithm: (String..String?)[MyPropertyDescriptor]

'clientSocket' @ [282:9] ==> val clientSocket: SSLSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'sslParameters' @ [282:22] ==> public final var SSLSocket.sslParameters: (SSLParameters..SSLParameters?)[MyPropertyDescriptor]

'clientParams' @ [282:38] ==> val clientParams: SSLParameters defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'clientSocket' @ [283:9] ==> val clientSocket: SSLSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'useClientMode' @ [283:22] ==> public final var SSLSocket.useClientMode: Boolean[MyPropertyDescriptor]

'clientSocket' @ [287:9] ==> val clientSocket: SSLSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'bind' @ [287:22] ==> public open fun bind(p0: (SocketAddress..SocketAddress?)): Unit defined in javax.net.ssl.SSLSocket[JavaMethodDescriptor]

'InetSocketAddress' @ [287:27] ==> public constructor InetSocketAddress(p0: (InetAddress..InetAddress?), p1: Int) defined in java.net.InetSocketAddress[JavaClassConstructorDescriptor]

'getLocalHost' @ [287:57] ==> public open fun getLocalHost(): (InetAddress..InetAddress?) defined in java.net.InetAddress[JavaMethodDescriptor]

'Object' @ [289:20] ==> public constructor Object() defined in java.lang.Object[JavaClassConstructorDescriptor]

'thread' @ [293:28] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'serverSocket' @ [295:39] ==> val serverSocket: SSLServerSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'accept' @ [295:52] ==> public open fun accept(): (Socket..Socket?) defined in javax.net.ssl.SSLServerSocket[JavaMethodDescriptor]

'assertTrue' @ [296:17] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'sslServerSocket' @ [296:28] ==> val sslServerSocket: (Socket..Socket?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`.<anonymous>[LocalVariableDescriptor]

'isConnected' @ [296:44] ==> public final val Socket.isConnected: Boolean[MyPropertyDescriptor]

'DataInputStream' @ [297:35] ==> public constructor DataInputStream(p0: (InputStream..InputStream?)) defined in java.io.DataInputStream[JavaClassConstructorDescriptor]

'sslServerSocket' @ [297:51] ==> val sslServerSocket: (Socket..Socket?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`.<anonymous>[LocalVariableDescriptor]

'inputStream' @ [297:67] ==> public final val Socket.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'serverInput' @ [298:38] ==> val serverInput: DataInputStream defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`.<anonymous>[LocalVariableDescriptor]

'readUTF' @ [298:50] ==> public final fun readUTF(): (String..String?) defined in java.io.DataInputStream[JavaMethodDescriptor]

'assertEquals' @ [299:17] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (String..String?), actual: (String..String?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.String..kotlin.String?)

'receivedString' @ [299:45] ==> val receivedString: (String..String?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`.<anonymous>[LocalVariableDescriptor]

'synchronized' @ [300:17] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'lock' @ [300:30] ==> val lock: Object defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'done' @ [301:21] ==> var done: Boolean defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'lock' @ [302:21] ==> val lock: Object defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'notifyAll' @ [302:26] ==> public final fun notifyAll(): Unit defined in java.lang.Object[JavaMethodDescriptor]

'sslServerSocket' @ [304:17] ==> val sslServerSocket: (Socket..Socket?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`.<anonymous>[LocalVariableDescriptor]

'close' @ [304:33] ==> public open fun close(): Unit defined in java.net.Socket[JavaMethodDescriptor]

'serverError' @ [306:17] ==> var serverError: Boolean defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'clientSocket' @ [310:9] ==> val clientSocket: SSLSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'connect' @ [310:22] ==> public open fun connect(p0: (SocketAddress..SocketAddress?)): Unit defined in javax.net.ssl.SSLSocket[JavaMethodDescriptor]

'InetSocketAddress' @ [310:30] ==> public constructor InetSocketAddress(p0: (InetAddress..InetAddress?), p1: Int) defined in java.net.InetSocketAddress[JavaClassConstructorDescriptor]

'getLocalHost' @ [310:60] ==> public open fun getLocalHost(): (InetAddress..InetAddress?) defined in java.net.InetAddress[JavaMethodDescriptor]

'serverSocket' @ [310:76] ==> val serverSocket: SSLServerSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'localPort' @ [310:89] ==> public final val SSLServerSocket.localPort: Int[MyPropertyDescriptor]

'assertTrue' @ [311:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'clientSocket' @ [311:20] ==> val clientSocket: SSLSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'isConnected' @ [311:33] ==> public final val SSLSocket.isConnected: Boolean[MyPropertyDescriptor]

'clientSocket' @ [314:25] ==> val clientSocket: SSLSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'session' @ [314:38] ==> public final val SSLSocket.session: (SSLSession..SSLSession?)[MyPropertyDescriptor]

'peerCertificates' @ [314:46] ==> public final val SSLSession.peerCertificates: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?)[MyPropertyDescriptor]

'peerChain' @ [315:34] ==> val peerChain: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'subjectX500Principal' @ [315:67] ==> public final val X509Certificate.subjectX500Principal: (X500Principal..X500Principal?)[MyPropertyDescriptor]

'X500Name' @ [316:24] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'peerX500Principal' @ [316:33] ==> val peerX500Principal: (X500Principal..X500Principal?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'name' @ [316:51] ==> public final val X500Principal.name: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [317:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: X500Name, actual: X500Name, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> X500Name

'MEGA_CORP' @ [317:22] ==> public val MEGA_CORP: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [317:32] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'x500name' @ [317:38] ==> val x500name: X500Name defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'X509Utilities' @ [318:9] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'validateCertificateChain' @ [318:23] ==> public final fun validateCertificateChain(trustedRoot: X509CertificateHolder, vararg certificates: Certificate): Unit defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'trustStore' @ [318:48] ==> val trustStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'getX509Certificate' @ [318:59] ==> public fun KeyStore.getX509Certificate(alias: String): X509CertificateHolder defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [318:78] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [318:92] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'peerChain' @ [318:109] ==> val peerChain: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'DataOutputStream' @ [319:22] ==> public constructor DataOutputStream(p0: (OutputStream..OutputStream?)) defined in java.io.DataOutputStream[JavaClassConstructorDescriptor]

'clientSocket' @ [319:39] ==> val clientSocket: SSLSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'outputStream' @ [319:52] ==> public final val SSLSocket.outputStream: (OutputStream..OutputStream?)[MyPropertyDescriptor]

'output' @ [320:9] ==> val output: DataOutputStream defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'writeUTF' @ [320:16] ==> public final fun writeUTF(p0: (String..String?)): Unit defined in java.io.DataOutputStream[JavaMethodDescriptor]

'synchronized' @ [322:9] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'lock' @ [322:22] ==> val lock: Object defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'!' @ [323:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'done' @ [323:21] ==> var done: Boolean defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'timeout' @ [324:17] ==> var timeout: Int defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'timeout' @ [325:21] ==> var timeout: Int defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'IOException' @ [325:41] ==> public constructor IOException(p0: (String..String?)) defined in java.io.IOException[JavaClassConstructorDescriptor]

'lock' @ [326:17] ==> val lock: Object defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'wait' @ [326:22] ==> public final fun wait(p0: Long): Unit defined in java.lang.Object[JavaMethodDescriptor]

'clientSocket' @ [330:9] ==> val clientSocket: SSLSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'close' @ [330:22] ==> public open fun close(): Unit defined in javax.net.ssl.SSLSocket[JavaMethodDescriptor]

'serverThread' @ [331:9] ==> val serverThread: Thread defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'join' @ [331:22] ==> public final fun join(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'assertFalse' @ [332:9] ==> public fun assertFalse(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'serverError' @ [332:23] ==> var serverError: Boolean defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'serverSocket' @ [333:9] ==> val serverSocket: SSLServerSocket defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'close' @ [333:22] ==> public open fun close(): Unit defined in javax.net.ssl.SSLServerSocket[JavaMethodDescriptor]

'assertTrue' @ [334:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'done' @ [334:20] ==> var done: Boolean defined in net.corda.node.utilities.X509UtilitiesTest.`create server cert and use in SSL socket`[LocalVariableDescriptor]

'tempFolder' @ [337:48] ==> @Rule @JvmField public final val tempFolder: TemporaryFolder defined in net.corda.node.utilities.X509UtilitiesTest[PropertyDescriptorImpl]

'root' @ [337:59] ==> public final val TemporaryFolder.root: (File..File?)[MyPropertyDescriptor]

'toPath' @ [337:64] ==> public open fun toPath(): (Path..Path?) defined in java.io.File[JavaMethodDescriptor]

'name' @ [337:75] ==> value-parameter name: String defined in net.corda.node.utilities.X509UtilitiesTest.tempFile[ValueParameterDescriptorImpl]

'generateKeyPair' @ [357:25] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[FunctionImportedFromObject]

'X509Utilities' @ [357:41] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [357:55] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [358:26] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [358:40] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'getX509Name' @ [358:70] ==> @JvmOverloads public fun getX509Name(myLegalName: String, nearestCity: String, email: String, country: String? = ...): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'rootCAKey' @ [358:136] ==> val rootCAKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'Crypto' @ [360:37] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [360:44] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [360:60] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [360:74] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [361:34] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createCertificate' @ [361:48] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'INTERMEDIATE_CA' @ [361:82] ==> enum entry INTERMEDIATE_CA defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'rootCACert' @ [361:99] ==> val rootCACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'rootCAKey' @ [361:111] ==> val rootCAKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'getX509Name' @ [361:122] ==> @JvmOverloads public fun getX509Name(myLegalName: String, nearestCity: String, email: String, country: String? = ...): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'intermediateCAKeyPair' @ [361:196] ==> val intermediateCAKeyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'public' @ [361:218] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPassword' @ [363:23] ==> value-parameter keyPassword: String defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[ValueParameterDescriptorImpl]

'toCharArray' @ [363:35] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'loadOrCreateKeyStore' @ [364:24] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'keyStoreFilePath' @ [364:45] ==> value-parameter keyStoreFilePath: Path defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[ValueParameterDescriptorImpl]

'storePassword' @ [364:63] ==> value-parameter storePassword: String defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[ValueParameterDescriptorImpl]

'keyStore' @ [366:9] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'addOrReplaceKey' @ [366:18] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out Certificate>): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [366:34] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [366:48] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'rootCAKey' @ [366:63] ==> val rootCAKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'private' @ [366:73] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'keyPass' @ [366:82] ==> val keyPass: CharArray defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'arrayOf' @ [366:91] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Certificate): Array<Certificate> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Certificate

'rootCACert' @ [366:112] ==> val rootCACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'cert' @ [366:123] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'keyStore' @ [368:9] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'addOrReplaceKey' @ [368:18] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out Certificate>): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [368:34] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_INTERMEDIATE_CA' @ [368:48] ==> public final val CORDA_INTERMEDIATE_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'intermediateCAKeyPair' @ [369:17] ==> val intermediateCAKeyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'private' @ [369:39] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'keyPass' @ [370:17] ==> val keyPass: CharArray defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'of' @ [371:24] ==> @SafeVarargs public open fun <T : (Any..Any?)> of(vararg p0: (X509CertificateHolder..X509CertificateHolder?)): (Stream<(X509CertificateHolder..X509CertificateHolder?)>..Stream<(X509CertificateHolder..X509CertificateHolder?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X509CertificateHolder

'intermediateCACert' @ [371:27] ==> val intermediateCACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'rootCACert' @ [371:47] ==> val rootCACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'map' @ [371:59] ==> public final fun <R : (Any..Any?)> map(p0: (((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?)..(((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?))?)): (Stream<(X509Certificate..X509Certificate?)>..Stream<(X509Certificate..X509Certificate?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> X509Certificate

'it' @ [371:65] ==> value-parameter it: (X509CertificateHolder..X509CertificateHolder?) defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore.<anonymous>[ValueParameterDescriptorImpl]

'cert' @ [371:68] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'toTypedArray' @ [371:75] ==> public inline fun <reified T> Stream<out Certificate>.toTypedArray(): Array<Certificate> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Certificate

'keyStore' @ [373:9] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'save' @ [373:18] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'keyStoreFilePath' @ [373:23] ==> value-parameter keyStoreFilePath: Path defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[ValueParameterDescriptorImpl]

'storePassword' @ [373:41] ==> value-parameter storePassword: String defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[ValueParameterDescriptorImpl]

'loadOrCreateKeyStore' @ [375:26] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'trustStoreFilePath' @ [375:47] ==> value-parameter trustStoreFilePath: Path defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[ValueParameterDescriptorImpl]

'trustStorePassword' @ [375:67] ==> value-parameter trustStorePassword: String defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[ValueParameterDescriptorImpl]

'trustStore' @ [377:9] ==> val trustStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'addOrReplaceCertificate' @ [377:20] ==> public fun KeyStore.addOrReplaceCertificate(alias: String, cert: Certificate): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [377:44] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [377:58] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'rootCACert' @ [377:73] ==> val rootCACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'cert' @ [377:84] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'trustStore' @ [378:9] ==> val trustStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'addOrReplaceCertificate' @ [378:20] ==> public fun KeyStore.addOrReplaceCertificate(alias: String, cert: Certificate): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [378:44] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_INTERMEDIATE_CA' @ [378:58] ==> public final val CORDA_INTERMEDIATE_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'intermediateCACert' @ [378:81] ==> val intermediateCACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'cert' @ [378:100] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'trustStore' @ [380:9] ==> val trustStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'save' @ [380:20] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'trustStoreFilePath' @ [380:25] ==> value-parameter trustStoreFilePath: Path defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[ValueParameterDescriptorImpl]

'trustStorePassword' @ [380:45] ==> value-parameter trustStorePassword: String defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[ValueParameterDescriptorImpl]

'keyStore' @ [382:16] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.createCAKeyStoreAndTrustStore[LocalVariableDescriptor]

'Test' @ [385:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'generateKeyPair' @ [387:23] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[FunctionImportedFromObject]

'Crypto' @ [387:39] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256R1_SHA256' @ [387:46] ==> @field:JvmField public final val ECDSA_SECP256R1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'X509Utilities' @ [388:28] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [388:42] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'X500Name' @ [388:72] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'keyPair' @ [388:93] ==> val keyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`Get correct private key type from Keystore`[LocalVariableDescriptor]

'loadOrCreateKeyStore' @ [389:24] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'tempFile' @ [389:45] ==> private final fun tempFile(name: String): Path defined in net.corda.node.utilities.X509UtilitiesTest[SimpleFunctionDescriptorImpl]

'keyStore' @ [390:9] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`Get correct private key type from Keystore`[LocalVariableDescriptor]

'setKeyEntry' @ [390:18] ==> public final fun setKeyEntry(p0: (String..String?), p1: (Key..Key?), p2: (CharArray..CharArray?), p3: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'keyPair' @ [390:37] ==> val keyPair: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`Get correct private key type from Keystore`[LocalVariableDescriptor]

'private' @ [390:45] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'toCharArray' @ [390:68] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [390:83] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: X509Certificate): Array<X509Certificate> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> X509Certificate

'selfSignCert' @ [390:91] ==> val selfSignCert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`Get correct private key type from Keystore`[LocalVariableDescriptor]

'cert' @ [390:104] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'keyStore' @ [392:31] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`Get correct private key type from Keystore`[LocalVariableDescriptor]

'getKey' @ [392:40] ==> public final fun getKey(p0: (String..String?), p1: (CharArray..CharArray?)): (Key..Key?) defined in java.security.KeyStore[JavaMethodDescriptor]

'toCharArray' @ [392:68] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'keyStore' @ [393:37] ==> val keyStore: KeyStore defined in net.corda.node.utilities.X509UtilitiesTest.`Get correct private key type from Keystore`[LocalVariableDescriptor]

'getSupportedKey' @ [393:46] ==> public fun KeyStore.getSupportedKey(alias: String, keyPassword: String): PrivateKey defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [395:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'keyFromKeystore' @ [395:20] ==> val keyFromKeystore: (Key..Key?) defined in net.corda.node.utilities.X509UtilitiesTest.`Get correct private key type from Keystore`[LocalVariableDescriptor]

'assertTrue' @ [396:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'keyFromKeystoreCasted' @ [396:20] ==> val keyFromKeystoreCasted: PrivateKey defined in net.corda.node.utilities.X509UtilitiesTest.`Get correct private key type from Keystore`[LocalVariableDescriptor]

'Test' @ [399:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'SerializationFactoryImpl' @ [401:23] ==> public constructor SerializationFactoryImpl() defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedClassConstructorDescriptor]

'apply' @ [401:50] ==> @InlineOnly public inline fun <T> SerializationFactoryImpl.apply(block: SerializationFactoryImpl.() -> Unit): SerializationFactoryImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SerializationFactoryImpl

'registerScheme' @ [401:58] ==> public final fun registerScheme(scheme: SerializationScheme): Unit defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedSimpleFunctionDescriptor]

'KryoServerSerializationScheme' @ [401:73] ==> public constructor KryoServerSerializationScheme() defined in net.corda.node.serialization.KryoServerSerializationScheme[DeserializedClassConstructorDescriptor]

'SerializationContextImpl' @ [402:23] ==> public constructor SerializationContextImpl(preferredSerializationVersion: ByteSequence, deserializationClassLoader: ClassLoader, whitelist: ClassWhitelist, properties: Map<Any, Any>, objectReferencesEnabled: Boolean, useCase: SerializationContext.UseCase) defined in net.corda.nodeapi.internal.serialization.SerializationContextImpl[DeserializedClassConstructorDescriptor]

'KryoHeaderV0_1' @ [402:48] ==> public val KryoHeaderV0_1: OpaqueBytes defined in net.corda.nodeapi.internal.serialization[DeserializedPropertyDescriptor]

'javaClass' @ [403:17] ==> public val <T : Any> X509UtilitiesTest.javaClass: Class<X509UtilitiesTest> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> X509UtilitiesTest

'classLoader' @ [403:27] ==> public final val <T : (Any..Any?)> Class<X509UtilitiesTest>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X509UtilitiesTest

'AllWhitelist' @ [404:17] ==> public object AllWhitelist : ClassWhitelist defined in net.corda.nodeapi.internal.serialization[FakeCallableDescriptorForObject]

'emptyMap' @ [405:17] ==> public fun <K, V> emptyMap(): Map<Any, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any
    <V> -> Any

'P2P' @ [407:46] ==> enum entry P2P defined in net.corda.core.serialization.SerializationContext.UseCase[FakeCallableDescriptorForObject]

'X509Utilities' @ [408:47] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [408:61] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'ALICE' @ [408:91] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [408:97] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'Crypto' @ [408:103] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [408:110] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [408:126] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [408:140] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'expected' @ [409:26] ==> val expected: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertififcateHolder`[LocalVariableDescriptor]

'serialize' @ [409:35] ==> public fun <T : Any> X509CertificateHolder.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<X509CertificateHolder> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> X509CertificateHolder

'factory' @ [409:45] ==> val factory: SerializationFactoryImpl defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertififcateHolder`[LocalVariableDescriptor]

'context' @ [409:54] ==> val context: SerializationContextImpl defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertififcateHolder`[LocalVariableDescriptor]

'bytes' @ [409:63] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'serialized' @ [410:45] ==> val serialized: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertififcateHolder`[LocalVariableDescriptor]

'deserialize' @ [410:56] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): X509CertificateHolder defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> X509CertificateHolder

'factory' @ [410:68] ==> val factory: SerializationFactoryImpl defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertififcateHolder`[LocalVariableDescriptor]

'context' @ [410:77] ==> val context: SerializationContextImpl defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertififcateHolder`[LocalVariableDescriptor]

'assertEquals' @ [411:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: X509CertificateHolder, actual: X509CertificateHolder, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> X509CertificateHolder

'expected' @ [411:22] ==> val expected: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertififcateHolder`[LocalVariableDescriptor]

'actual' @ [411:32] ==> val actual: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertififcateHolder`[LocalVariableDescriptor]

'Test' @ [414:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'SerializationFactoryImpl' @ [416:23] ==> public constructor SerializationFactoryImpl() defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedClassConstructorDescriptor]

'apply' @ [416:50] ==> @InlineOnly public inline fun <T> SerializationFactoryImpl.apply(block: SerializationFactoryImpl.() -> Unit): SerializationFactoryImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SerializationFactoryImpl

'registerScheme' @ [416:58] ==> public final fun registerScheme(scheme: SerializationScheme): Unit defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedSimpleFunctionDescriptor]

'KryoServerSerializationScheme' @ [416:73] ==> public constructor KryoServerSerializationScheme() defined in net.corda.node.serialization.KryoServerSerializationScheme[DeserializedClassConstructorDescriptor]

'SerializationContextImpl' @ [417:23] ==> public constructor SerializationContextImpl(preferredSerializationVersion: ByteSequence, deserializationClassLoader: ClassLoader, whitelist: ClassWhitelist, properties: Map<Any, Any>, objectReferencesEnabled: Boolean, useCase: SerializationContext.UseCase) defined in net.corda.nodeapi.internal.serialization.SerializationContextImpl[DeserializedClassConstructorDescriptor]

'KryoHeaderV0_1' @ [417:48] ==> public val KryoHeaderV0_1: OpaqueBytes defined in net.corda.nodeapi.internal.serialization[DeserializedPropertyDescriptor]

'javaClass' @ [418:17] ==> public val <T : Any> X509UtilitiesTest.javaClass: Class<X509UtilitiesTest> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> X509UtilitiesTest

'classLoader' @ [418:27] ==> public final val <T : (Any..Any?)> Class<X509UtilitiesTest>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X509UtilitiesTest

'AllWhitelist' @ [419:17] ==> public object AllWhitelist : ClassWhitelist defined in net.corda.nodeapi.internal.serialization[FakeCallableDescriptorForObject]

'emptyMap' @ [420:17] ==> public fun <K, V> emptyMap(): Map<Any, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any
    <V> -> Any

'P2P' @ [422:46] ==> enum entry P2P defined in net.corda.core.serialization.SerializationContext.UseCase[FakeCallableDescriptorForObject]

'getInstance' @ [423:46] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'Crypto' @ [424:25] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [424:32] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [424:48] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [424:62] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'X509Utilities' @ [425:26] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [425:40] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'ALICE' @ [425:70] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [425:76] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'rootCAKey' @ [425:82] ==> val rootCAKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'X509Utilities' @ [426:27] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createCertificate' @ [426:41] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'TLS' @ [426:75] ==> enum entry TLS defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'rootCACert' @ [426:80] ==> val rootCACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'rootCAKey' @ [426:92] ==> val rootCAKey: KeyPair defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'BOB' @ [426:103] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [426:107] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'BOB_PUBKEY' @ [426:113] ==> public val BOB_PUBKEY: PublicKey defined in net.corda.testing[DeserializedPropertyDescriptor]

'certFactory' @ [427:24] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'generateCertPath' @ [427:36] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'listOf' @ [427:53] ==> public fun <T> listOf(vararg elements: X509Certificate): List<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'certificate' @ [427:60] ==> val certificate: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'cert' @ [427:72] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'rootCACert' @ [427:78] ==> val rootCACert: X509CertificateHolder defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'cert' @ [427:89] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'expected' @ [428:26] ==> val expected: (CertPath..CertPath?) defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'serialize' @ [428:35] ==> public fun <T : Any> (CertPath..CertPath?).serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<(CertPath..CertPath?)> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (java.security.cert.CertPath..java.security.cert.CertPath?)

'factory' @ [428:45] ==> val factory: SerializationFactoryImpl defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'context' @ [428:54] ==> val context: SerializationContextImpl defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'bytes' @ [428:63] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'serialized' @ [429:32] ==> val serialized: ByteArray defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'deserialize' @ [429:43] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): CertPath defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> CertPath

'factory' @ [429:55] ==> val factory: SerializationFactoryImpl defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'context' @ [429:64] ==> val context: SerializationContextImpl defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'assertEquals' @ [430:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (CertPath..CertPath?), actual: (CertPath..CertPath?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (java.security.cert.CertPath..java.security.cert.CertPath?)

'expected' @ [430:22] ==> val expected: (CertPath..CertPath?) defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

'actual' @ [430:32] ==> val actual: CertPath defined in net.corda.node.utilities.X509UtilitiesTest.`serialize - deserialize X509CertPath`[LocalVariableDescriptor]

