'Crypto' @ [37:45] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'EDDSA_ED25519_SHA512' @ [37:52] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Crypto' @ [38:40] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'ECDSA_SECP256R1_SHA256' @ [38:47] ==> @field:JvmField public final val ECDSA_SECP256R1_SHA256: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'Pair' @ [46:43] ==> public constructor Pair<out A, out B>(first: Duration, second: Duration) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Duration
    <out B> -> Duration

'millis' @ [46:50] ==> public val Int.millis: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'days' @ [46:63] ==> public val Int.days: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'if (second != null && second.time > first.toEpochMilli())
            second
        else
            Date(first.toEpochMilli())' @ [51:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Date, elseBranch: Date): Date[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Date

'second' @ [51:20] ==> value-parameter second: Date? defined in net.corda.node.utilities.X509Utilities.max[ValueParameterDescriptorImpl]

'second' @ [51:38] ==> value-parameter second: Date? defined in net.corda.node.utilities.X509Utilities.max[ValueParameterDescriptorImpl]

'time' @ [51:45] ==> public final var Date.time: Long[MyPropertyDescriptor]

'first' @ [51:52] ==> value-parameter first: Instant defined in net.corda.node.utilities.X509Utilities.max[ValueParameterDescriptorImpl]

'toEpochMilli' @ [51:58] ==> public open fun toEpochMilli(): Long defined in java.time.Instant[JavaMethodDescriptor]

'second' @ [52:13] ==> value-parameter second: Date? defined in net.corda.node.utilities.X509Utilities.max[ValueParameterDescriptorImpl]

'Date' @ [54:13] ==> public constructor Date(p0: Long) defined in java.util.Date[JavaClassConstructorDescriptor]

'first' @ [54:18] ==> value-parameter first: Instant defined in net.corda.node.utilities.X509Utilities.max[ValueParameterDescriptorImpl]

'toEpochMilli' @ [54:24] ==> public open fun toEpochMilli(): Long defined in java.time.Instant[JavaMethodDescriptor]

'if (second != null && second.time < first.toEpochMilli())
            second
        else
            Date(first.toEpochMilli())' @ [61:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Date, elseBranch: Date): Date[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Date

'second' @ [61:20] ==> value-parameter second: Date? defined in net.corda.node.utilities.X509Utilities.min[ValueParameterDescriptorImpl]

'second' @ [61:38] ==> value-parameter second: Date? defined in net.corda.node.utilities.X509Utilities.min[ValueParameterDescriptorImpl]

'time' @ [61:45] ==> public final var Date.time: Long[MyPropertyDescriptor]

'first' @ [61:52] ==> value-parameter first: Instant defined in net.corda.node.utilities.X509Utilities.min[ValueParameterDescriptorImpl]

'toEpochMilli' @ [61:58] ==> public open fun toEpochMilli(): Long defined in java.time.Instant[JavaMethodDescriptor]

'second' @ [62:13] ==> value-parameter second: Date? defined in net.corda.node.utilities.X509Utilities.min[ValueParameterDescriptorImpl]

'Date' @ [64:13] ==> public constructor Date(p0: Long) defined in java.util.Date[JavaClassConstructorDescriptor]

'first' @ [64:18] ==> value-parameter first: Instant defined in net.corda.node.utilities.X509Utilities.min[ValueParameterDescriptorImpl]

'toEpochMilli' @ [64:24] ==> public open fun toEpochMilli(): Long defined in java.time.Instant[JavaMethodDescriptor]

'now' @ [74:37] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'truncatedTo' @ [74:43] ==> public open fun truncatedTo(p0: (TemporalUnit..TemporalUnit?)): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'DAYS' @ [74:66] ==> enum entry DAYS defined in java.time.temporal.ChronoUnit[FakeCallableDescriptorForObject]

'max' @ [75:25] ==> private final fun max(first: Instant, second: Date?): Date defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'startOfDayUTC' @ [75:29] ==> val startOfDayUTC: (Instant..Instant?) defined in net.corda.node.utilities.X509Utilities.getCertificateValidityWindow[LocalVariableDescriptor]

'before' @ [75:45] ==> value-parameter before: Duration defined in net.corda.node.utilities.X509Utilities.getCertificateValidityWindow[ValueParameterDescriptorImpl]

'parent' @ [75:53] ==> value-parameter parent: X509CertificateHolder? = ... defined in net.corda.node.utilities.X509Utilities.getCertificateValidityWindow[ValueParameterDescriptorImpl]

'notBefore' @ [75:61] ==> public final val X509CertificateHolder.notBefore: (Date..Date?)[MyPropertyDescriptor]

'min' @ [76:24] ==> private final fun min(first: Instant, second: Date?): Date defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'startOfDayUTC' @ [76:28] ==> val startOfDayUTC: (Instant..Instant?) defined in net.corda.node.utilities.X509Utilities.getCertificateValidityWindow[LocalVariableDescriptor]

'after' @ [76:44] ==> value-parameter after: Duration defined in net.corda.node.utilities.X509Utilities.getCertificateValidityWindow[ValueParameterDescriptorImpl]

'parent' @ [76:51] ==> value-parameter parent: X509CertificateHolder? = ... defined in net.corda.node.utilities.X509Utilities.getCertificateValidityWindow[ValueParameterDescriptorImpl]

'notAfter' @ [76:59] ==> public final val X509CertificateHolder.notAfter: (Date..Date?)[MyPropertyDescriptor]

'Pair' @ [77:16] ==> public constructor Pair<out A, out B>(first: Date, second: Date) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Date
    <out B> -> Date

'notBefore' @ [77:21] ==> val notBefore: Date defined in net.corda.node.utilities.X509Utilities.getCertificateValidityWindow[LocalVariableDescriptor]

'notAfter' @ [77:32] ==> val notAfter: Date defined in net.corda.node.utilities.X509Utilities.getCertificateValidityWindow[LocalVariableDescriptor]

'JvmStatic' @ [83:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'DEFAULT_VALIDITY_WINDOW' @ [84:119] ==> private final val DEFAULT_VALIDITY_WINDOW: Pair<Duration, Duration> defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'getCertificateValidityWindow' @ [85:22] ==> public final fun getCertificateValidityWindow(before: Duration, after: Duration, parent: X509CertificateHolder? = ...): Pair<Date, Date> defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'validityWindow' @ [85:51] ==> value-parameter validityWindow: Pair<Duration, Duration> = ... defined in net.corda.node.utilities.X509Utilities.createSelfSignedCACertificate[ValueParameterDescriptorImpl]

'first' @ [85:66] ==> public final val first: Duration defined in kotlin.Pair[DeserializedPropertyDescriptor]

'validityWindow' @ [85:73] ==> value-parameter validityWindow: Pair<Duration, Duration> = ... defined in net.corda.node.utilities.X509Utilities.createSelfSignedCACertificate[ValueParameterDescriptorImpl]

'second' @ [85:88] ==> public final val second: Duration defined in kotlin.Pair[DeserializedPropertyDescriptor]

'createCertificate' @ [86:16] ==> public final fun createCertificate(certificateType: CertificateType, issuer: X500Name, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Date, Date>, nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'ROOT_CA' @ [86:50] ==> enum entry ROOT_CA defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'subject' @ [86:59] ==> value-parameter subject: X500Name defined in net.corda.node.utilities.X509Utilities.createSelfSignedCACertificate[ValueParameterDescriptorImpl]

'keyPair' @ [86:68] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.X509Utilities.createSelfSignedCACertificate[ValueParameterDescriptorImpl]

'subject' @ [86:77] ==> value-parameter subject: X500Name defined in net.corda.node.utilities.X509Utilities.createSelfSignedCACertificate[ValueParameterDescriptorImpl]

'keyPair' @ [86:86] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.X509Utilities.createSelfSignedCACertificate[ValueParameterDescriptorImpl]

'public' @ [86:94] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'window' @ [86:102] ==> val window: Pair<Date, Date> defined in net.corda.node.utilities.X509Utilities.createSelfSignedCACertificate[LocalVariableDescriptor]

'JvmStatic' @ [99:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'DEFAULT_VALIDITY_WINDOW' @ [103:70] ==> private final val DEFAULT_VALIDITY_WINDOW: Pair<Duration, Duration> defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'getCertificateValidityWindow' @ [105:22] ==> public final fun getCertificateValidityWindow(before: Duration, after: Duration, parent: X509CertificateHolder? = ...): Pair<Date, Date> defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'validityWindow' @ [105:51] ==> value-parameter validityWindow: Pair<Duration, Duration> = ... defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'first' @ [105:66] ==> public final val first: Duration defined in kotlin.Pair[DeserializedPropertyDescriptor]

'validityWindow' @ [105:73] ==> value-parameter validityWindow: Pair<Duration, Duration> = ... defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'second' @ [105:88] ==> public final val second: Duration defined in kotlin.Pair[DeserializedPropertyDescriptor]

'issuerCertificate' @ [105:96] ==> value-parameter issuerCertificate: X509CertificateHolder defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'createCertificate' @ [106:16] ==> public final fun createCertificate(certificateType: CertificateType, issuer: X500Name, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Date, Date>, nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'certificateType' @ [106:34] ==> value-parameter certificateType: CertificateType defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'issuerCertificate' @ [106:51] ==> value-parameter issuerCertificate: X509CertificateHolder defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'subject' @ [106:69] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'issuerKeyPair' @ [106:78] ==> value-parameter issuerKeyPair: KeyPair defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'subject' @ [106:93] ==> value-parameter subject: X500Name defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'subjectPublicKey' @ [106:102] ==> value-parameter subjectPublicKey: PublicKey defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'window' @ [106:120] ==> val window: Pair<Date, Date> defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'nameConstraints' @ [106:128] ==> value-parameter nameConstraints: NameConstraints? = ... defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'require' @ [110:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'certificates' @ [110:17] ==> value-parameter vararg certificates: Certificate defined in net.corda.node.utilities.X509Utilities.validateCertificateChain[ValueParameterDescriptorImpl]

'isNotEmpty' @ [110:30] ==> @InlineOnly public inline fun <T> Array<out Certificate>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Certificate

'getInstance' @ [111:46] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'PKIXParameters' @ [112:22] ==> public constructor PKIXParameters(p0: (MutableSet<(TrustAnchor..TrustAnchor?)>..Set<(TrustAnchor..TrustAnchor?)>?)) defined in java.security.cert.PKIXParameters[JavaClassConstructorDescriptor]

'setOf' @ [112:37] ==> public fun <T> setOf(element: TrustAnchor): Set<TrustAnchor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TrustAnchor

'TrustAnchor' @ [112:43] ==> public constructor TrustAnchor(p0: (X509Certificate..X509Certificate?), p1: (ByteArray..ByteArray?)) defined in java.security.cert.TrustAnchor[JavaClassConstructorDescriptor]

'trustedRoot' @ [112:55] ==> value-parameter trustedRoot: X509CertificateHolder defined in net.corda.node.utilities.X509Utilities.validateCertificateChain[ValueParameterDescriptorImpl]

'cert' @ [112:67] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'params' @ [113:9] ==> val params: PKIXParameters defined in net.corda.node.utilities.X509Utilities.validateCertificateChain[LocalVariableDescriptor]

'isRevocationEnabled' @ [113:16] ==> public final var PKIXParameters.isRevocationEnabled: Boolean[MyPropertyDescriptor]

'certFactory' @ [114:24] ==> val certFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.node.utilities.X509Utilities.validateCertificateChain[LocalVariableDescriptor]

'generateCertPath' @ [114:36] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'certificates' @ [114:53] ==> value-parameter vararg certificates: Certificate defined in net.corda.node.utilities.X509Utilities.validateCertificateChain[ValueParameterDescriptorImpl]

'toList' @ [114:66] ==> public fun <T> Array<out Certificate>.toList(): List<Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Certificate

'getInstance' @ [115:47] ==> public open fun getInstance(p0: (String..String?)): (CertPathValidator..CertPathValidator?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'pathValidator' @ [116:9] ==> val pathValidator: (CertPathValidator..CertPathValidator?) defined in net.corda.node.utilities.X509Utilities.validateCertificateChain[LocalVariableDescriptor]

'validate' @ [116:23] ==> public final fun validate(p0: (CertPath..CertPath?), p1: (CertPathParameters..CertPathParameters?)): (CertPathValidatorResult..CertPathValidatorResult?) defined in java.security.cert.CertPathValidator[JavaMethodDescriptor]

'certPath' @ [116:32] ==> val certPath: (CertPath..CertPath?) defined in net.corda.node.utilities.X509Utilities.validateCertificateChain[LocalVariableDescriptor]

'params' @ [116:42] ==> val params: PKIXParameters defined in net.corda.node.utilities.X509Utilities.validateCertificateChain[LocalVariableDescriptor]

'JvmStatic' @ [124:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'FileWriter' @ [126:9] ==> public constructor FileWriter(p0: (File..File?)) defined in java.io.FileWriter[JavaClassConstructorDescriptor]

'filename' @ [126:20] ==> value-parameter filename: Path defined in net.corda.node.utilities.X509Utilities.saveCertificateAsPEMFile[ValueParameterDescriptorImpl]

'toFile' @ [126:29] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'use' @ [126:39] ==> @InlineOnly public inline fun <T : Closeable?, R> FileWriter.use(block: (FileWriter) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> FileWriter
    <R> -> Unit

'JcaPEMWriter' @ [127:13] ==> public constructor JcaPEMWriter(p0: (Writer..Writer?)) defined in org.bouncycastle.openssl.jcajce.JcaPEMWriter[JavaClassConstructorDescriptor]

'it' @ [127:26] ==> value-parameter it: FileWriter defined in net.corda.node.utilities.X509Utilities.saveCertificateAsPEMFile.<anonymous>[ValueParameterDescriptorImpl]

'use' @ [127:30] ==> @InlineOnly public inline fun <T : Closeable?, R> JcaPEMWriter.use(block: (JcaPEMWriter) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JcaPEMWriter
    <R> -> Unit

'it' @ [128:17] ==> value-parameter it: JcaPEMWriter defined in net.corda.node.utilities.X509Utilities.saveCertificateAsPEMFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'writeObject' @ [128:20] ==> public open fun writeObject(p0: (Any..Any?)): Unit defined in org.bouncycastle.openssl.jcajce.JcaPEMWriter[JavaMethodDescriptor]

'x509Certificate' @ [128:32] ==> value-parameter x509Certificate: X509CertificateHolder defined in net.corda.node.utilities.X509Utilities.saveCertificateAsPEMFile[ValueParameterDescriptorImpl]

'JvmStatic' @ [138:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'PemReader' @ [140:22] ==> public constructor PemReader(p0: (Reader..Reader?)) defined in org.bouncycastle.util.io.pem.PemReader[JavaClassConstructorDescriptor]

'FileReader' @ [140:32] ==> public constructor FileReader(p0: (File..File?)) defined in java.io.FileReader[JavaClassConstructorDescriptor]

'filename' @ [140:43] ==> value-parameter filename: Path defined in net.corda.node.utilities.X509Utilities.loadCertificateFromPEMFile[ValueParameterDescriptorImpl]

'toFile' @ [140:52] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'reader' @ [141:25] ==> val reader: PemReader defined in net.corda.node.utilities.X509Utilities.loadCertificateFromPEMFile[LocalVariableDescriptor]

'readPemObject' @ [141:32] ==> public open fun readPemObject(): (PemObject..PemObject?) defined in org.bouncycastle.util.io.pem.PemReader[JavaMethodDescriptor]

'X509CertificateHolder' @ [142:20] ==> public constructor X509CertificateHolder(p0: (ByteArray..ByteArray?)) defined in org.bouncycastle.cert.X509CertificateHolder[JavaClassConstructorDescriptor]

'pemObject' @ [142:42] ==> val pemObject: (PemObject..PemObject?) defined in net.corda.node.utilities.X509Utilities.loadCertificateFromPEMFile[LocalVariableDescriptor]

'content' @ [142:52] ==> public final val PemObject.content: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'cert' @ [143:16] ==> val cert: X509CertificateHolder defined in net.corda.node.utilities.X509Utilities.loadCertificateFromPEMFile[LocalVariableDescriptor]

'apply' @ [143:21] ==> @InlineOnly public inline fun <T> X509CertificateHolder.apply(block: X509CertificateHolder.() -> Unit): X509CertificateHolder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509CertificateHolder

'isValidOn' @ [144:13] ==> public open fun isValidOn(p0: (Date..Date?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'Date' @ [144:23] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'valueOf' @ [162:33] ==> public open fun valueOf(p0: Long): (BigInteger..BigInteger?) defined in java.math.BigInteger[JavaMethodDescriptor]

'random63BitValue' @ [162:41] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'DERSequence' @ [163:27] ==> public constructor DERSequence(p0: (ASN1EncodableVector..ASN1EncodableVector?)) defined in org.bouncycastle.asn1.DERSequence[JavaClassConstructorDescriptor]

'ASN1EncodableVector' @ [163:39] ==> public constructor ASN1EncodableVector() defined in org.bouncycastle.asn1.ASN1EncodableVector[JavaClassConstructorDescriptor]

'apply' @ [163:61] ==> @InlineOnly public inline fun <T> ASN1EncodableVector.apply(block: ASN1EncodableVector.() -> Unit): ASN1EncodableVector defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ASN1EncodableVector

'certificateType' @ [163:69] ==> value-parameter certificateType: CertificateType defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'purposes' @ [163:85] ==> public final val purposes: Array<out KeyPurposeId> defined in net.corda.node.utilities.CertificateType[PropertyDescriptorImpl]

'forEach' @ [163:94] ==> public inline fun <T> Array<out KeyPurposeId>.forEach(action: (KeyPurposeId) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyPurposeId

'add' @ [163:104] ==> public open fun add(p0: (ASN1Encodable..ASN1Encodable?)): Unit defined in org.bouncycastle.asn1.ASN1EncodableVector[JavaMethodDescriptor]

'it' @ [163:108] ==> value-parameter it: KeyPurposeId defined in net.corda.node.utilities.X509Utilities.createCertificate.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getInstance' @ [164:57] ==> public open fun getInstance(p0: (Any..Any?)): (SubjectPublicKeyInfo..SubjectPublicKeyInfo?) defined in org.bouncycastle.asn1.x509.SubjectPublicKeyInfo[JavaMethodDescriptor]

'getInstance' @ [164:82] ==> public open fun getInstance(p0: (Any..Any?)): (ASN1Sequence..ASN1Sequence?) defined in org.bouncycastle.asn1.ASN1Sequence[JavaMethodDescriptor]

'subjectPublicKey' @ [164:94] ==> value-parameter subjectPublicKey: PublicKey defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'encoded' @ [164:111] ==> public final val PublicKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'JcaX509v3CertificateBuilder' @ [166:23] ==> public constructor JcaX509v3CertificateBuilder(p0: (X500Name..X500Name?), p1: (BigInteger..BigInteger?), p2: (Date..Date?), p3: (Date..Date?), p4: (X500Name..X500Name?), p5: (PublicKey..PublicKey?)) defined in org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder[JavaClassConstructorDescriptor]

'issuer' @ [166:51] ==> value-parameter issuer: X500Name defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'serial' @ [166:59] ==> val serial: (BigInteger..BigInteger?) defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'validityWindow' @ [166:67] ==> value-parameter validityWindow: Pair<Date, Date> defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'first' @ [166:82] ==> public final val first: Date defined in kotlin.Pair[DeserializedPropertyDescriptor]

'validityWindow' @ [166:89] ==> value-parameter validityWindow: Pair<Date, Date> defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'second' @ [166:104] ==> public final val second: Date defined in kotlin.Pair[DeserializedPropertyDescriptor]

'subject' @ [166:112] ==> value-parameter subject: X500Name defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'subjectPublicKey' @ [166:121] ==> value-parameter subjectPublicKey: PublicKey defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'addExtension' @ [167:18] ==> public open fun addExtension(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: Boolean, p2: (ASN1Encodable..ASN1Encodable?)): (X509v3CertificateBuilder..X509v3CertificateBuilder?) defined in org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder[JavaMethodDescriptor]

'subjectKeyIdentifier' @ [167:41] ==> public final val subjectKeyIdentifier: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x509.Extension[JavaPropertyDescriptor]

'BcX509ExtensionUtils' @ [167:70] ==> public constructor BcX509ExtensionUtils() defined in org.bouncycastle.cert.bc.BcX509ExtensionUtils[JavaClassConstructorDescriptor]

'createSubjectKeyIdentifier' @ [167:93] ==> public open fun createSubjectKeyIdentifier(p0: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?)): (SubjectKeyIdentifier..SubjectKeyIdentifier?) defined in org.bouncycastle.cert.bc.BcX509ExtensionUtils[JavaMethodDescriptor]

'subjectPublicKeyInfo' @ [167:120] ==> val subjectPublicKeyInfo: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?) defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'addExtension' @ [168:18] ==> public open fun addExtension(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: Boolean, p2: (ASN1Encodable..ASN1Encodable?)): (X509v3CertificateBuilder..X509v3CertificateBuilder?) defined in org.bouncycastle.cert.X509v3CertificateBuilder[JavaMethodDescriptor]

'basicConstraints' @ [168:41] ==> public final val basicConstraints: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x509.Extension[JavaPropertyDescriptor]

'certificateType' @ [168:59] ==> value-parameter certificateType: CertificateType defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'isCA' @ [168:75] ==> public final val isCA: Boolean defined in net.corda.node.utilities.CertificateType[PropertyDescriptorImpl]

'BasicConstraints' @ [168:81] ==> public constructor BasicConstraints(p0: Boolean) defined in org.bouncycastle.asn1.x509.BasicConstraints[JavaClassConstructorDescriptor]

'certificateType' @ [168:98] ==> value-parameter certificateType: CertificateType defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'isCA' @ [168:114] ==> public final val isCA: Boolean defined in net.corda.node.utilities.CertificateType[PropertyDescriptorImpl]

'addExtension' @ [169:18] ==> public open fun addExtension(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: Boolean, p2: (ASN1Encodable..ASN1Encodable?)): (X509v3CertificateBuilder..X509v3CertificateBuilder?) defined in org.bouncycastle.cert.X509v3CertificateBuilder[JavaMethodDescriptor]

'keyUsage' @ [169:41] ==> public final val keyUsage: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x509.Extension[JavaPropertyDescriptor]

'certificateType' @ [169:58] ==> value-parameter certificateType: CertificateType defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'keyUsage' @ [169:74] ==> public final val keyUsage: KeyUsage defined in net.corda.node.utilities.CertificateType[PropertyDescriptorImpl]

'addExtension' @ [170:18] ==> public open fun addExtension(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: Boolean, p2: (ASN1Encodable..ASN1Encodable?)): (X509v3CertificateBuilder..X509v3CertificateBuilder?) defined in org.bouncycastle.cert.X509v3CertificateBuilder[JavaMethodDescriptor]

'extendedKeyUsage' @ [170:41] ==> public final val extendedKeyUsage: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x509.Extension[JavaPropertyDescriptor]

'keyPurposes' @ [170:66] ==> val keyPurposes: DERSequence defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'nameConstraints' @ [172:13] ==> value-parameter nameConstraints: NameConstraints? = ... defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'builder' @ [173:13] ==> val builder: (X509v3CertificateBuilder..X509v3CertificateBuilder?) defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'addExtension' @ [173:21] ==> public open fun addExtension(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: Boolean, p2: (ASN1Encodable..ASN1Encodable?)): (X509v3CertificateBuilder..X509v3CertificateBuilder?) defined in org.bouncycastle.cert.X509v3CertificateBuilder[JavaMethodDescriptor]

'nameConstraints' @ [173:44] ==> public final val nameConstraints: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x509.Extension[JavaPropertyDescriptor]

'nameConstraints' @ [173:67] ==> value-parameter nameConstraints: NameConstraints? = ... defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'builder' @ [175:16] ==> val builder: (X509v3CertificateBuilder..X509v3CertificateBuilder?) defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'createCertificate' @ [192:23] ==> public final fun createCertificate(certificateType: CertificateType, issuer: X500Name, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Date, Date>, nameConstraints: NameConstraints? = ...): X509v3CertificateBuilder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'certificateType' @ [192:41] ==> value-parameter certificateType: CertificateType defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'issuer' @ [192:58] ==> value-parameter issuer: X500Name defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'subject' @ [192:66] ==> value-parameter subject: X500Name defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'subjectPublicKey' @ [192:75] ==> value-parameter subjectPublicKey: PublicKey defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'validityWindow' @ [192:93] ==> value-parameter validityWindow: Pair<Date, Date> defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'nameConstraints' @ [192:109] ==> value-parameter nameConstraints: NameConstraints? = ... defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'builder' @ [193:16] ==> val builder: X509v3CertificateBuilder defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'build' @ [193:24] ==> public open fun build(p0: (ContentSigner..ContentSigner?)): (X509CertificateHolder..X509CertificateHolder?) defined in org.bouncycastle.cert.X509v3CertificateBuilder[JavaMethodDescriptor]

'issuerSigner' @ [193:30] ==> value-parameter issuerSigner: ContentSigner defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'apply' @ [193:44] ==> @InlineOnly public inline fun <T> (X509CertificateHolder..X509CertificateHolder?).apply(block: (X509CertificateHolder..X509CertificateHolder?).() -> Unit): (X509CertificateHolder..X509CertificateHolder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.bouncycastle.cert.X509CertificateHolder..org.bouncycastle.cert.X509CertificateHolder?)

'require' @ [194:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isValidOn' @ [194:21] ==> public open fun isValidOn(p0: (Date..Date?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'Date' @ [194:31] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'Crypto' @ [213:31] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [213:38] ==> @JvmStatic public final fun findSignatureScheme(key: PrivateKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'issuerKeyPair' @ [213:58] ==> value-parameter issuerKeyPair: KeyPair defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'private' @ [213:72] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'Crypto' @ [214:24] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'findProvider' @ [214:31] ==> @JvmStatic public final fun findProvider(name: String): Provider defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'signatureScheme' @ [214:44] ==> val signatureScheme: SignatureScheme defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'providerName' @ [214:60] ==> public final val providerName: String defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'createCertificate' @ [215:23] ==> public final fun createCertificate(certificateType: CertificateType, issuer: X500Name, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Date, Date>, nameConstraints: NameConstraints? = ...): X509v3CertificateBuilder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'certificateType' @ [215:41] ==> value-parameter certificateType: CertificateType defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'issuer' @ [215:58] ==> value-parameter issuer: X500Name defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'subject' @ [215:66] ==> value-parameter subject: X500Name defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'subjectPublicKey' @ [215:75] ==> value-parameter subjectPublicKey: PublicKey defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'validityWindow' @ [215:93] ==> value-parameter validityWindow: Pair<Date, Date> defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'nameConstraints' @ [215:109] ==> value-parameter nameConstraints: NameConstraints? = ... defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'ContentSignerBuilder' @ [217:22] ==> public object ContentSignerBuilder defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'build' @ [217:43] ==> public final fun build(signatureScheme: SignatureScheme, privateKey: PrivateKey, provider: Provider, random: SecureRandom? = ...): ContentSigner defined in net.corda.core.crypto.ContentSignerBuilder[DeserializedSimpleFunctionDescriptor]

'signatureScheme' @ [217:49] ==> val signatureScheme: SignatureScheme defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'issuerKeyPair' @ [217:66] ==> value-parameter issuerKeyPair: KeyPair defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'private' @ [217:80] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'provider' @ [217:89] ==> val provider: Provider defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'builder' @ [218:16] ==> val builder: X509v3CertificateBuilder defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'build' @ [218:24] ==> public open fun build(p0: (ContentSigner..ContentSigner?)): (X509CertificateHolder..X509CertificateHolder?) defined in org.bouncycastle.cert.X509v3CertificateBuilder[JavaMethodDescriptor]

'signer' @ [218:30] ==> val signer: ContentSigner defined in net.corda.node.utilities.X509Utilities.createCertificate[LocalVariableDescriptor]

'apply' @ [218:38] ==> @InlineOnly public inline fun <T> (X509CertificateHolder..X509CertificateHolder?).apply(block: (X509CertificateHolder..X509CertificateHolder?).() -> Unit): (X509CertificateHolder..X509CertificateHolder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.bouncycastle.cert.X509CertificateHolder..org.bouncycastle.cert.X509CertificateHolder?)

'require' @ [219:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isValidOn' @ [219:21] ==> public open fun isValidOn(p0: (Date..Date?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'Date' @ [219:31] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'require' @ [220:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isSignatureValid' @ [220:21] ==> public open fun isSignatureValid(p0: (ContentVerifierProvider..ContentVerifierProvider?)): Boolean defined in org.bouncycastle.cert.X509CertificateHolder[JavaMethodDescriptor]

'JcaContentVerifierProviderBuilder' @ [220:38] ==> public constructor JcaContentVerifierProviderBuilder() defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaClassConstructorDescriptor]

'build' @ [220:74] ==> public open fun build(p0: (PublicKey..PublicKey?)): (ContentVerifierProvider..ContentVerifierProvider?) defined in org.bouncycastle.operator.jcajce.JcaContentVerifierProviderBuilder[JavaMethodDescriptor]

'issuerKeyPair' @ [220:80] ==> value-parameter issuerKeyPair: KeyPair defined in net.corda.node.utilities.X509Utilities.createCertificate[ValueParameterDescriptorImpl]

'public' @ [220:94] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'ContentSignerBuilder' @ [228:22] ==> public object ContentSignerBuilder defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'build' @ [228:43] ==> public final fun build(signatureScheme: SignatureScheme, privateKey: PrivateKey, provider: Provider, random: SecureRandom? = ...): ContentSigner defined in net.corda.core.crypto.ContentSignerBuilder[DeserializedSimpleFunctionDescriptor]

'signatureScheme' @ [228:49] ==> value-parameter signatureScheme: SignatureScheme defined in net.corda.node.utilities.X509Utilities.createCertificateSigningRequest[ValueParameterDescriptorImpl]

'keyPair' @ [228:66] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.X509Utilities.createCertificateSigningRequest[ValueParameterDescriptorImpl]

'private' @ [228:74] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'findProvider' @ [228:90] ==> @JvmStatic public final fun findProvider(name: String): Provider defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'signatureScheme' @ [228:103] ==> value-parameter signatureScheme: SignatureScheme defined in net.corda.node.utilities.X509Utilities.createCertificateSigningRequest[ValueParameterDescriptorImpl]

'providerName' @ [228:119] ==> public final val providerName: String defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'JcaPKCS10CertificationRequestBuilder' @ [229:16] ==> public constructor JcaPKCS10CertificationRequestBuilder(p0: (X500Name..X500Name?), p1: (PublicKey..PublicKey?)) defined in org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder[JavaClassConstructorDescriptor]

'subject' @ [229:53] ==> value-parameter subject: X500Name defined in net.corda.node.utilities.X509Utilities.createCertificateSigningRequest[ValueParameterDescriptorImpl]

'keyPair' @ [229:62] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.X509Utilities.createCertificateSigningRequest[ValueParameterDescriptorImpl]

'public' @ [229:70] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'build' @ [229:78] ==> public open fun build(p0: (ContentSigner..ContentSigner?)): (PKCS10CertificationRequest..PKCS10CertificationRequest?) defined in org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder[JavaMethodDescriptor]

'signer' @ [229:84] ==> val signer: ContentSigner defined in net.corda.node.utilities.X509Utilities.createCertificateSigningRequest[LocalVariableDescriptor]

'createCertificateSigningRequest' @ [232:80] ==> public final fun createCertificateSigningRequest(subject: X500Name, keyPair: KeyPair, signatureScheme: SignatureScheme): PKCS10CertificationRequest defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'subject' @ [232:112] ==> value-parameter subject: X500Name defined in net.corda.node.utilities.X509Utilities.createCertificateSigningRequest[ValueParameterDescriptorImpl]

'keyPair' @ [232:121] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.X509Utilities.createCertificateSigningRequest[ValueParameterDescriptorImpl]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [232:130] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'getInstance' @ [237:57] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'certificateFactory' @ [239:46] ==> private final val certificateFactory: (CertificateFactory..CertificateFactory?) defined in net.corda.node.utilities.CertificateStream[PropertyDescriptorImpl]

'generateCertificate' @ [239:65] ==> public final fun generateCertificate(p0: (InputStream..InputStream?)): (Certificate..Certificate?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'input' @ [239:85] ==> public final val input: InputStream defined in net.corda.node.utilities.CertificateStream[PropertyDescriptorImpl]

'' @ [243:12] ==> private constructor CertificateType(keyUsage: KeyUsage, vararg purposes: KeyPurposeId, isCA: Boolean) defined in net.corda.node.utilities.CertificateType[ClassConstructorDescriptorImpl]

'KeyUsage' @ [243:13] ==> public constructor KeyUsage(p0: Int) defined in org.bouncycastle.asn1.x509.KeyUsage[JavaClassConstructorDescriptor]

'or' @ [243:22] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'digitalSignature' @ [243:31] ==> public const final val digitalSignature: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'keyCertSign' @ [243:60] ==> public const final val keyCertSign: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'cRLSign' @ [243:84] ==> public const final val cRLSign: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'id_kp_serverAuth' @ [243:107] ==> public final val id_kp_serverAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'id_kp_clientAuth' @ [243:138] ==> public final val id_kp_clientAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'anyExtendedKeyUsage' @ [243:169] ==> public final val anyExtendedKeyUsage: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'' @ [244:20] ==> private constructor CertificateType(keyUsage: KeyUsage, vararg purposes: KeyPurposeId, isCA: Boolean) defined in net.corda.node.utilities.CertificateType[ClassConstructorDescriptorImpl]

'KeyUsage' @ [244:21] ==> public constructor KeyUsage(p0: Int) defined in org.bouncycastle.asn1.x509.KeyUsage[JavaClassConstructorDescriptor]

'or' @ [244:30] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'digitalSignature' @ [244:39] ==> public const final val digitalSignature: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'keyCertSign' @ [244:68] ==> public const final val keyCertSign: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'cRLSign' @ [244:92] ==> public const final val cRLSign: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'id_kp_serverAuth' @ [244:115] ==> public final val id_kp_serverAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'id_kp_clientAuth' @ [244:146] ==> public final val id_kp_clientAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'anyExtendedKeyUsage' @ [244:177] ==> public final val anyExtendedKeyUsage: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'' @ [245:14] ==> private constructor CertificateType(keyUsage: KeyUsage, vararg purposes: KeyPurposeId, isCA: Boolean) defined in net.corda.node.utilities.CertificateType[ClassConstructorDescriptorImpl]

'KeyUsage' @ [245:15] ==> public constructor KeyUsage(p0: Int) defined in org.bouncycastle.asn1.x509.KeyUsage[JavaClassConstructorDescriptor]

'or' @ [245:24] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'digitalSignature' @ [245:33] ==> public const final val digitalSignature: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'keyCertSign' @ [245:62] ==> public const final val keyCertSign: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'cRLSign' @ [245:86] ==> public const final val cRLSign: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'id_kp_serverAuth' @ [245:109] ==> public final val id_kp_serverAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'id_kp_clientAuth' @ [245:140] ==> public final val id_kp_clientAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'anyExtendedKeyUsage' @ [245:171] ==> public final val anyExtendedKeyUsage: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'' @ [246:8] ==> private constructor CertificateType(keyUsage: KeyUsage, vararg purposes: KeyPurposeId, isCA: Boolean) defined in net.corda.node.utilities.CertificateType[ClassConstructorDescriptorImpl]

'KeyUsage' @ [246:9] ==> public constructor KeyUsage(p0: Int) defined in org.bouncycastle.asn1.x509.KeyUsage[JavaClassConstructorDescriptor]

'or' @ [246:18] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'digitalSignature' @ [246:27] ==> public const final val digitalSignature: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'keyEncipherment' @ [246:56] ==> public const final val keyEncipherment: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'keyAgreement' @ [246:84] ==> public const final val keyAgreement: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'id_kp_serverAuth' @ [246:112] ==> public final val id_kp_serverAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'id_kp_clientAuth' @ [246:143] ==> public final val id_kp_clientAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'anyExtendedKeyUsage' @ [246:174] ==> public final val anyExtendedKeyUsage: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'' @ [248:13] ==> private constructor CertificateType(keyUsage: KeyUsage, vararg purposes: KeyPurposeId, isCA: Boolean) defined in net.corda.node.utilities.CertificateType[ClassConstructorDescriptorImpl]

'KeyUsage' @ [248:14] ==> public constructor KeyUsage(p0: Int) defined in org.bouncycastle.asn1.x509.KeyUsage[JavaClassConstructorDescriptor]

'or' @ [248:23] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'digitalSignature' @ [248:32] ==> public const final val digitalSignature: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'keyCertSign' @ [248:61] ==> public const final val keyCertSign: Int defined in org.bouncycastle.asn1.x509.KeyUsage[JavaPropertyDescriptor]

'id_kp_serverAuth' @ [248:88] ==> public final val id_kp_serverAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'id_kp_clientAuth' @ [248:119] ==> public final val id_kp_clientAuth: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

'anyExtendedKeyUsage' @ [248:150] ==> public final val anyExtendedKeyUsage: (KeyPurposeId..KeyPurposeId?) defined in org.bouncycastle.asn1.x509.KeyPurposeId[JavaPropertyDescriptor]

