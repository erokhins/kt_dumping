'storePassword' @ [31:16] ==> value-parameter storePassword: String defined in net.corda.node.utilities.loadOrCreateKeyStore[ValueParameterDescriptorImpl]

'toCharArray' @ [31:30] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [32:29] ==> public open fun getInstance(p0: (String..String?)): (KeyStore..KeyStore?) defined in java.security.KeyStore[JavaMethodDescriptor]

'KEYSTORE_TYPE' @ [32:41] ==> public val KEYSTORE_TYPE: String defined in net.corda.node.utilities in file KeyStoreUtilities.kt[PropertyDescriptorImpl]

'if (keyStoreFilePath.exists()) {
        keyStoreFilePath.read { keyStore.load(it, pass) }
    } else {
        keyStore.load(null, pass)
        keyStoreFilePath.write { keyStore.store(it, pass) }
    }' @ [33:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'keyStoreFilePath' @ [33:9] ==> value-parameter keyStoreFilePath: Path defined in net.corda.node.utilities.loadOrCreateKeyStore[ValueParameterDescriptorImpl]

'exists' @ [33:26] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'keyStoreFilePath' @ [34:9] ==> value-parameter keyStoreFilePath: Path defined in net.corda.node.utilities.loadOrCreateKeyStore[ValueParameterDescriptorImpl]

'read' @ [34:26] ==> public inline fun <R> Path.read(vararg options: OpenOption, block: (InputStream) -> Unit): Unit defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'keyStore' @ [34:33] ==> val keyStore: (KeyStore..KeyStore?) defined in net.corda.node.utilities.loadOrCreateKeyStore[LocalVariableDescriptor]

'load' @ [34:42] ==> public final fun load(p0: (InputStream..InputStream?), p1: (CharArray..CharArray?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'it' @ [34:47] ==> value-parameter it: InputStream defined in net.corda.node.utilities.loadOrCreateKeyStore.<anonymous>[ValueParameterDescriptorImpl]

'pass' @ [34:51] ==> val pass: CharArray defined in net.corda.node.utilities.loadOrCreateKeyStore[LocalVariableDescriptor]

'keyStore' @ [36:9] ==> val keyStore: (KeyStore..KeyStore?) defined in net.corda.node.utilities.loadOrCreateKeyStore[LocalVariableDescriptor]

'load' @ [36:18] ==> public final fun load(p0: (InputStream..InputStream?), p1: (CharArray..CharArray?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'pass' @ [36:29] ==> val pass: CharArray defined in net.corda.node.utilities.loadOrCreateKeyStore[LocalVariableDescriptor]

'keyStoreFilePath' @ [37:9] ==> value-parameter keyStoreFilePath: Path defined in net.corda.node.utilities.loadOrCreateKeyStore[ValueParameterDescriptorImpl]

'write' @ [37:26] ==> public inline fun Path.write(createDirs: Boolean = ..., vararg options: OpenOption = ..., block: (OutputStream) -> Unit): Unit defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'keyStore' @ [37:34] ==> val keyStore: (KeyStore..KeyStore?) defined in net.corda.node.utilities.loadOrCreateKeyStore[LocalVariableDescriptor]

'store' @ [37:43] ==> public final fun store(p0: (OutputStream..OutputStream?), p1: (CharArray..CharArray?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'it' @ [37:49] ==> value-parameter it: OutputStream defined in net.corda.node.utilities.loadOrCreateKeyStore.<anonymous>[ValueParameterDescriptorImpl]

'pass' @ [37:53] ==> val pass: CharArray defined in net.corda.node.utilities.loadOrCreateKeyStore[LocalVariableDescriptor]

'keyStore' @ [39:12] ==> val keyStore: (KeyStore..KeyStore?) defined in net.corda.node.utilities.loadOrCreateKeyStore[LocalVariableDescriptor]

'Throws' @ [51:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'KeyStoreException' @ [51:9] ==> public constructor KeyStoreException() defined in java.security.KeyStoreException[JavaClassConstructorDescriptor]

'IOException' @ [51:35] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'keyStoreFilePath' @ [53:12] ==> value-parameter keyStoreFilePath: Path defined in net.corda.node.utilities.loadKeyStore[ValueParameterDescriptorImpl]

'read' @ [53:29] ==> public inline fun <R> Path.read(vararg options: OpenOption, block: (InputStream) -> KeyStore): KeyStore defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> KeyStore

'loadKeyStore' @ [53:36] ==> @Throws public fun loadKeyStore(input: InputStream, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'it' @ [53:49] ==> value-parameter it: InputStream defined in net.corda.node.utilities.loadKeyStore.<anonymous>[ValueParameterDescriptorImpl]

'storePassword' @ [53:53] ==> value-parameter storePassword: String defined in net.corda.node.utilities.loadKeyStore[ValueParameterDescriptorImpl]

'Throws' @ [65:1] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'KeyStoreException' @ [65:9] ==> public constructor KeyStoreException() defined in java.security.KeyStoreException[JavaClassConstructorDescriptor]

'IOException' @ [65:35] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'storePassword' @ [67:16] ==> value-parameter storePassword: String defined in net.corda.node.utilities.loadKeyStore[ValueParameterDescriptorImpl]

'toCharArray' @ [67:30] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [68:29] ==> public open fun getInstance(p0: (String..String?)): (KeyStore..KeyStore?) defined in java.security.KeyStore[JavaMethodDescriptor]

'KEYSTORE_TYPE' @ [68:41] ==> public val KEYSTORE_TYPE: String defined in net.corda.node.utilities in file KeyStoreUtilities.kt[PropertyDescriptorImpl]

'input' @ [69:5] ==> value-parameter input: InputStream defined in net.corda.node.utilities.loadKeyStore[ValueParameterDescriptorImpl]

'use' @ [69:11] ==> @InlineOnly public inline fun <T : Closeable?, R> InputStream.use(block: (InputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> InputStream
    <R> -> Unit

'keyStore' @ [70:9] ==> val keyStore: (KeyStore..KeyStore?) defined in net.corda.node.utilities.loadKeyStore[LocalVariableDescriptor]

'load' @ [70:18] ==> public final fun load(p0: (InputStream..InputStream?), p1: (CharArray..CharArray?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'input' @ [70:23] ==> value-parameter input: InputStream defined in net.corda.node.utilities.loadKeyStore[ValueParameterDescriptorImpl]

'pass' @ [70:30] ==> val pass: CharArray defined in net.corda.node.utilities.loadKeyStore[LocalVariableDescriptor]

'keyStore' @ [72:12] ==> val keyStore: (KeyStore..KeyStore?) defined in net.corda.node.utilities.loadKeyStore[LocalVariableDescriptor]

'addOrReplaceKey' @ [84:5] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out Certificate>): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'alias' @ [84:21] ==> value-parameter alias: String defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'key' @ [84:28] ==> value-parameter key: Key defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'password' @ [84:33] ==> value-parameter password: CharArray defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'chain' @ [84:43] ==> value-parameter chain: Array<out X509CertificateHolder> defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'map' @ [84:49] ==> public inline fun <T, R> Array<out X509CertificateHolder>.map(transform: (X509CertificateHolder) -> X509Certificate): List<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509CertificateHolder
    <R> -> X509Certificate

'it' @ [84:55] ==> value-parameter it: X509CertificateHolder defined in net.corda.node.utilities.addOrReplaceKey.<anonymous>[ValueParameterDescriptorImpl]

'cert' @ [84:58] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'toTypedArray' @ [84:65] ==> public inline fun <reified T> Collection<Certificate>.toTypedArray(): Array<Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Certificate

'containsAlias' @ [96:9] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [96:23] ==> value-parameter alias: String defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'this' @ [97:9] ==> <this> defined in net.corda.node.utilities.addOrReplaceKey[ReceiverParameterDescriptorImpl]

'deleteEntry' @ [97:14] ==> public final fun deleteEntry(p0: (String..String?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [97:26] ==> value-parameter alias: String defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'this' @ [99:5] ==> <this> defined in net.corda.node.utilities.addOrReplaceKey[ReceiverParameterDescriptorImpl]

'setKeyEntry' @ [99:10] ==> public final fun setKeyEntry(p0: (String..String?), p1: (Key..Key?), p2: (CharArray..CharArray?), p3: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [99:22] ==> value-parameter alias: String defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'key' @ [99:29] ==> value-parameter key: Key defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'password' @ [99:34] ==> value-parameter password: CharArray defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'chain' @ [99:44] ==> value-parameter chain: Array<out Certificate> defined in net.corda.node.utilities.addOrReplaceKey[ValueParameterDescriptorImpl]

'containsAlias' @ [108:9] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [108:23] ==> value-parameter alias: String defined in net.corda.node.utilities.addOrReplaceCertificate[ValueParameterDescriptorImpl]

'this' @ [109:9] ==> <this> defined in net.corda.node.utilities.addOrReplaceCertificate[ReceiverParameterDescriptorImpl]

'deleteEntry' @ [109:14] ==> public final fun deleteEntry(p0: (String..String?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [109:26] ==> value-parameter alias: String defined in net.corda.node.utilities.addOrReplaceCertificate[ValueParameterDescriptorImpl]

'this' @ [111:5] ==> <this> defined in net.corda.node.utilities.addOrReplaceCertificate[ReceiverParameterDescriptorImpl]

'setCertificateEntry' @ [111:10] ==> public final fun setCertificateEntry(p0: (String..String?), p1: (Certificate..Certificate?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [111:30] ==> value-parameter alias: String defined in net.corda.node.utilities.addOrReplaceCertificate[ValueParameterDescriptorImpl]

'cert' @ [111:37] ==> value-parameter cert: Certificate defined in net.corda.node.utilities.addOrReplaceCertificate[ValueParameterDescriptorImpl]

'keyStoreFilePath' @ [120:68] ==> value-parameter keyStoreFilePath: Path defined in net.corda.node.utilities.save[ValueParameterDescriptorImpl]

'write' @ [120:85] ==> public inline fun Path.write(createDirs: Boolean = ..., vararg options: OpenOption = ..., block: (OutputStream) -> Unit): Unit defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'store' @ [120:93] ==> public fun KeyStore.store(out: OutputStream, password: String): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'it' @ [120:99] ==> value-parameter it: OutputStream defined in net.corda.node.utilities.save.<anonymous>[ValueParameterDescriptorImpl]

'storePassword' @ [120:103] ==> value-parameter storePassword: String defined in net.corda.node.utilities.save[ValueParameterDescriptorImpl]

'store' @ [122:59] ==> public final fun store(p0: (OutputStream..OutputStream?), p1: (CharArray..CharArray?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'out' @ [122:65] ==> value-parameter out: OutputStream defined in net.corda.node.utilities.store[ValueParameterDescriptorImpl]

'password' @ [122:70] ==> value-parameter password: String defined in net.corda.node.utilities.store[ValueParameterDescriptorImpl]

'toCharArray' @ [122:79] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getCertificateAndKeyPair' @ [130:72] ==> public fun KeyStore.getCertificateAndKeyPair(alias: String, keyPassword: String): CertificateAndKeyPair defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'alias' @ [130:97] ==> value-parameter alias: String defined in net.corda.node.utilities.getKeyPair[ValueParameterDescriptorImpl]

'keyPassword' @ [130:104] ==> value-parameter keyPassword: String defined in net.corda.node.utilities.getKeyPair[ValueParameterDescriptorImpl]

'keyPair' @ [130:117] ==> public final val keyPair: KeyPair defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'getX509Certificate' @ [140:16] ==> public fun KeyStore.getX509Certificate(alias: String): X509CertificateHolder defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'alias' @ [140:35] ==> value-parameter alias: String defined in net.corda.node.utilities.getCertificateAndKeyPair[ValueParameterDescriptorImpl]

'Crypto' @ [141:21] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'toSupportedPublicKey' @ [141:28] ==> @JvmStatic public final fun toSupportedPublicKey(key: SubjectPublicKeyInfo): PublicKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'cert' @ [141:49] ==> val cert: X509CertificateHolder defined in net.corda.node.utilities.getCertificateAndKeyPair[LocalVariableDescriptor]

'subjectPublicKeyInfo' @ [141:54] ==> public final val X509CertificateHolder.subjectPublicKeyInfo: (SubjectPublicKeyInfo..SubjectPublicKeyInfo?)[MyPropertyDescriptor]

'CertificateAndKeyPair' @ [142:12] ==> public constructor CertificateAndKeyPair(certificate: X509CertificateHolder, keyPair: KeyPair) defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedClassConstructorDescriptor]

'cert' @ [142:34] ==> val cert: X509CertificateHolder defined in net.corda.node.utilities.getCertificateAndKeyPair[LocalVariableDescriptor]

'KeyPair' @ [142:40] ==> public constructor KeyPair(p0: (PublicKey..PublicKey?), p1: (PrivateKey..PrivateKey?)) defined in java.security.KeyPair[JavaClassConstructorDescriptor]

'publicKey' @ [142:48] ==> val publicKey: PublicKey defined in net.corda.node.utilities.getCertificateAndKeyPair[LocalVariableDescriptor]

'getSupportedKey' @ [142:59] ==> public fun KeyStore.getSupportedKey(alias: String, keyPassword: String): PrivateKey defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'alias' @ [142:75] ==> value-parameter alias: String defined in net.corda.node.utilities.getCertificateAndKeyPair[ValueParameterDescriptorImpl]

'keyPassword' @ [142:82] ==> value-parameter keyPassword: String defined in net.corda.node.utilities.getCertificateAndKeyPair[ValueParameterDescriptorImpl]

'getCertificate' @ [151:23] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [151:38] ==> value-parameter alias: String defined in net.corda.node.utilities.getX509Certificate[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [151:54] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'alias' @ [151:110] ==> value-parameter alias: String defined in net.corda.node.utilities.getX509Certificate[ValueParameterDescriptorImpl]

'certificate' @ [152:12] ==> val certificate: Certificate defined in net.corda.node.utilities.getX509Certificate[LocalVariableDescriptor]

'toX509CertHolder' @ [152:24] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'keyPassword' @ [170:19] ==> value-parameter keyPassword: String defined in net.corda.node.utilities.getSupportedKey[ValueParameterDescriptorImpl]

'toCharArray' @ [170:31] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getKey' @ [171:15] ==> public final fun getKey(p0: (String..String?), p1: (CharArray..CharArray?)): (Key..Key?) defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [171:22] ==> value-parameter alias: String defined in net.corda.node.utilities.getSupportedKey[ValueParameterDescriptorImpl]

'keyPass' @ [171:29] ==> val keyPass: CharArray defined in net.corda.node.utilities.getSupportedKey[LocalVariableDescriptor]

'Crypto' @ [172:12] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'toSupportedPrivateKey' @ [172:19] ==> @JvmStatic public final fun toSupportedPrivateKey(key: PrivateKey): PrivateKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'key' @ [172:41] ==> val key: PrivateKey defined in net.corda.node.utilities.getSupportedKey[LocalVariableDescriptor]

'storePath' @ [176:28] ==> private final val storePath: Path defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'read' @ [176:38] ==> public inline fun <R> Path.read(vararg options: OpenOption, block: (InputStream) -> KeyStore): KeyStore defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> KeyStore

'loadKeyStore' @ [176:45] ==> @Throws public fun loadKeyStore(input: InputStream, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'it' @ [176:58] ==> value-parameter it: InputStream defined in net.corda.node.utilities.KeyStoreWrapper.keyStore.<anonymous>[ValueParameterDescriptorImpl]

'storePassword' @ [176:62] ==> private final val storePassword: String defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'keyStore' @ [179:30] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'getCertificateChain' @ [179:39] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [179:59] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'CORDA_CLIENT_CA' @ [179:73] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'certificateAndKeyPair' @ [181:24] ==> public final fun certificateAndKeyPair(alias: String): CertificateAndKeyPair defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'X509Utilities' @ [181:46] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'CORDA_CLIENT_CA' @ [181:60] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'X509Utilities' @ [183:20] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'createCertificate' @ [183:34] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'IDENTITY' @ [183:68] ==> enum entry IDENTITY defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'clientCA' @ [183:78] ==> val clientCA: CertificateAndKeyPair defined in net.corda.node.utilities.KeyStoreWrapper.createCertificate[LocalVariableDescriptor]

'certificate' @ [183:87] ==> public final val certificate: X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'clientCA' @ [183:100] ==> val clientCA: CertificateAndKeyPair defined in net.corda.node.utilities.KeyStoreWrapper.createCertificate[LocalVariableDescriptor]

'keyPair' @ [183:109] ==> public final val keyPair: KeyPair defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedPropertyDescriptor]

'serviceName' @ [183:118] ==> value-parameter serviceName: X500Name defined in net.corda.node.utilities.KeyStoreWrapper.createCertificate[ValueParameterDescriptorImpl]

'pubKey' @ [183:131] ==> value-parameter pubKey: PublicKey defined in net.corda.node.utilities.KeyStoreWrapper.createCertificate[ValueParameterDescriptorImpl]

'getInstance' @ [184:43] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'generateCertPath' @ [184:63] ==> public final fun generateCertPath(p0: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'listOf' @ [184:80] ==> public fun <T> listOf(element: X509Certificate): List<X509Certificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X509Certificate

'cert' @ [184:87] ==> val cert: X509CertificateHolder defined in net.corda.node.utilities.KeyStoreWrapper.createCertificate[LocalVariableDescriptor]

'cert' @ [184:92] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'clientCertPath' @ [184:100] ==> val clientCertPath: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in net.corda.node.utilities.KeyStoreWrapper.createCertificate[LocalVariableDescriptor]

'require' @ [185:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'certPath' @ [185:17] ==> val certPath: (CertPath..CertPath?) defined in net.corda.node.utilities.KeyStoreWrapper.createCertificate[LocalVariableDescriptor]

'certificates' @ [185:26] ==> public final val CertPath.certificates: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)[MyPropertyDescriptor]

'isNotEmpty' @ [185:39] ==> @InlineOnly public inline fun <T> Collection<(Certificate..Certificate?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'certPath' @ [186:16] ==> val certPath: (CertPath..CertPath?) defined in net.corda.node.utilities.KeyStoreWrapper.createCertificate[LocalVariableDescriptor]

'createCertificate' @ [190:24] ==> private final fun createCertificate(serviceName: X500Name, pubKey: PublicKey): CertPath defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'serviceName' @ [190:42] ==> value-parameter serviceName: X500Name defined in net.corda.node.utilities.KeyStoreWrapper.saveNewKeyPair[ValueParameterDescriptorImpl]

'keyPair' @ [190:55] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.KeyStoreWrapper.saveNewKeyPair[ValueParameterDescriptorImpl]

'public' @ [190:63] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyStore' @ [192:9] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'addOrReplaceKey' @ [192:18] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out Certificate>): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'privateKeyAlias' @ [192:34] ==> value-parameter privateKeyAlias: String defined in net.corda.node.utilities.KeyStoreWrapper.saveNewKeyPair[ValueParameterDescriptorImpl]

'keyPair' @ [192:51] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.KeyStoreWrapper.saveNewKeyPair[ValueParameterDescriptorImpl]

'private' @ [192:59] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'storePassword' @ [192:68] ==> private final val storePassword: String defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'toCharArray' @ [192:82] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'certPath' @ [192:97] ==> val certPath: CertPath defined in net.corda.node.utilities.KeyStoreWrapper.saveNewKeyPair[LocalVariableDescriptor]

'certificates' @ [192:106] ==> public final val CertPath.certificates: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)[MyPropertyDescriptor]

'toTypedArray' @ [192:119] ==> public inline fun <reified T> Collection<(Certificate..Certificate?)>.toTypedArray(): Array<(Certificate..Certificate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'keyStore' @ [193:9] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'save' @ [193:18] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'storePath' @ [193:23] ==> private final val storePath: Path defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'storePassword' @ [193:34] ==> private final val storePassword: String defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'createCertificate' @ [197:24] ==> private final fun createCertificate(serviceName: X500Name, pubKey: PublicKey): CertPath defined in net.corda.node.utilities.KeyStoreWrapper[SimpleFunctionDescriptorImpl]

'serviceName' @ [197:42] ==> value-parameter serviceName: X500Name defined in net.corda.node.utilities.KeyStoreWrapper.savePublicKey[ValueParameterDescriptorImpl]

'pubKey' @ [197:55] ==> value-parameter pubKey: PublicKey defined in net.corda.node.utilities.KeyStoreWrapper.savePublicKey[ValueParameterDescriptorImpl]

'keyStore' @ [199:9] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'addOrReplaceCertificate' @ [199:18] ==> public fun KeyStore.addOrReplaceCertificate(alias: String, cert: Certificate): Unit defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'pubKeyAlias' @ [199:42] ==> value-parameter pubKeyAlias: String defined in net.corda.node.utilities.KeyStoreWrapper.savePublicKey[ValueParameterDescriptorImpl]

'certPath' @ [199:55] ==> val certPath: CertPath defined in net.corda.node.utilities.KeyStoreWrapper.savePublicKey[LocalVariableDescriptor]

'certificates' @ [199:64] ==> public final val CertPath.certificates: (MutableList<out (Certificate..Certificate?)>..List<(Certificate..Certificate?)>?)[MyPropertyDescriptor]

'first' @ [199:77] ==> public fun <T> List<(Certificate..Certificate?)>.first(): (Certificate..Certificate?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)

'keyStore' @ [200:9] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'save' @ [200:18] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'storePath' @ [200:23] ==> private final val storePath: Path defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'storePassword' @ [200:34] ==> private final val storePassword: String defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'keyStore' @ [204:40] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'containsAlias' @ [204:49] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [204:63] ==> value-parameter alias: String defined in net.corda.node.utilities.KeyStoreWrapper.containsAlias[ValueParameterDescriptorImpl]

'keyStore' @ [206:45] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'getX509Certificate' @ [206:54] ==> public fun KeyStore.getX509Certificate(alias: String): X509CertificateHolder defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'alias' @ [206:73] ==> value-parameter alias: String defined in net.corda.node.utilities.KeyStoreWrapper.getX509Certificate[ValueParameterDescriptorImpl]

'keyStore' @ [208:70] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'getCertificateChain' @ [208:79] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [208:99] ==> value-parameter alias: String defined in net.corda.node.utilities.KeyStoreWrapper.getCertificateChain[ValueParameterDescriptorImpl]

'keyStore' @ [210:54] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'getCertificate' @ [210:63] ==> public final fun getCertificate(p0: (String..String?)): (Certificate..Certificate?) defined in java.security.KeyStore[JavaMethodDescriptor]

'alias' @ [210:78] ==> value-parameter alias: String defined in net.corda.node.utilities.KeyStoreWrapper.getCertificate[ValueParameterDescriptorImpl]

'keyStore' @ [212:71] ==> private final val keyStore: KeyStore defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

'getCertificateAndKeyPair' @ [212:80] ==> public fun KeyStore.getCertificateAndKeyPair(alias: String, keyPassword: String): CertificateAndKeyPair defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'alias' @ [212:105] ==> value-parameter alias: String defined in net.corda.node.utilities.KeyStoreWrapper.certificateAndKeyPair[ValueParameterDescriptorImpl]

'storePassword' @ [212:112] ==> private final val storePassword: String defined in net.corda.node.utilities.KeyStoreWrapper[PropertyDescriptorImpl]

