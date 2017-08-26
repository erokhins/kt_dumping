'parseMap' @ [23:72] ==> public open fun parseMap(p0: (MutableMap<(String..String?), out (Any..Any?)>..Map<(String..String?), (Any..Any?)>?)): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'mapOf' @ [23:81] ==> public fun <K, V> mapOf(vararg pairs: Pair<(String..String?), Any?>): Map<(String..String?), Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> Any?

'pairs' @ [23:88] ==> value-parameter vararg pairs: Pair<String, Any?> defined in net.corda.node.services.config.configOf[ValueParameterDescriptorImpl]

'parseMap' @ [24:80] ==> public open fun parseMap(p0: (MutableMap<(String..String?), out (Any..Any?)>..Map<(String..String?), (Any..Any?)>?)): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'overrides' @ [24:89] ==> value-parameter overrides: Map<String, Any?> defined in net.corda.node.services.config.plus[ValueParameterDescriptorImpl]

'withFallback' @ [24:100] ==> public abstract fun withFallback(p0: (ConfigMergeable..ConfigMergeable?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'this' @ [24:113] ==> <this> defined in net.corda.node.services.config.plus[ReceiverParameterDescriptorImpl]

'loggerFor' @ [27:23] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ConfigHelper

'baseDirectory' @ [30:39] ==> value-parameter baseDirectory: Path defined in net.corda.node.services.config.ConfigHelper.loadConfig[ValueParameterDescriptorImpl]

'empty' @ [32:60] ==> public open fun empty(): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'defaults' @ [33:47] ==> public open fun defaults(): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'parseResources' @ [34:43] ==> public open fun parseResources(p0: (String..String?), p1: (ConfigParseOptions..ConfigParseOptions?)): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'parseOptions' @ [34:76] ==> val parseOptions: (ConfigParseOptions..ConfigParseOptions?) defined in net.corda.node.services.config.ConfigHelper.loadConfig[LocalVariableDescriptor]

'setAllowMissing' @ [34:89] ==> public open fun setAllowMissing(p0: Boolean): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'parseFile' @ [35:39] ==> public open fun parseFile(p0: (File..File?), p1: (ConfigParseOptions..ConfigParseOptions?)): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'configFile' @ [35:49] ==> value-parameter configFile: Path = ... defined in net.corda.node.services.config.ConfigHelper.loadConfig[ValueParameterDescriptorImpl]

'toFile' @ [35:60] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'parseOptions' @ [35:70] ==> val parseOptions: (ConfigParseOptions..ConfigParseOptions?) defined in net.corda.node.services.config.ConfigHelper.loadConfig[LocalVariableDescriptor]

'setAllowMissing' @ [35:83] ==> public open fun setAllowMissing(p0: Boolean): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'allowMissingConfig' @ [35:99] ==> value-parameter allowMissingConfig: Boolean = ... defined in net.corda.node.services.config.ConfigHelper.loadConfig[ValueParameterDescriptorImpl]

'configOf' @ [36:27] ==> public fun configOf(vararg pairs: Pair<String, Any?>): Config defined in net.corda.node.services.config[SimpleFunctionDescriptorImpl]

'to' @ [38:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'baseDirectory' @ [38:30] ==> value-parameter baseDirectory: Path defined in net.corda.node.services.config.ConfigHelper.loadConfig[ValueParameterDescriptorImpl]

'toString' @ [38:44] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'withFallback' @ [39:18] ==> public abstract fun withFallback(p0: (ConfigMergeable..ConfigMergeable?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'configOverrides' @ [39:31] ==> value-parameter configOverrides: Config = ... defined in net.corda.node.services.config.ConfigHelper.loadConfig[ValueParameterDescriptorImpl]

'withFallback' @ [40:18] ==> public abstract fun withFallback(p0: (ConfigMergeable..ConfigMergeable?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'appConfig' @ [40:31] ==> val appConfig: (Config..Config?) defined in net.corda.node.services.config.ConfigHelper.loadConfig[LocalVariableDescriptor]

'withFallback' @ [41:18] ==> public abstract fun withFallback(p0: (ConfigMergeable..ConfigMergeable?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'defaultConfig' @ [41:31] ==> val defaultConfig: (Config..Config?) defined in net.corda.node.services.config.ConfigHelper.loadConfig[LocalVariableDescriptor]

'resolve' @ [42:18] ==> public abstract fun resolve(): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'log' @ [43:9] ==> private final val log: Logger defined in net.corda.node.services.config.ConfigHelper[PropertyDescriptorImpl]

'info' @ [43:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'finalConfig' @ [43:30] ==> val finalConfig: (Config..Config?) defined in net.corda.node.services.config.ConfigHelper.loadConfig[LocalVariableDescriptor]

'root' @ [43:42] ==> public abstract fun root(): (ConfigObject..ConfigObject?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'render' @ [43:49] ==> public abstract fun render(p0: (ConfigRenderOptions..ConfigRenderOptions?)): (String..String?) defined in com.typesafe.config.ConfigObject[JavaMethodDescriptor]

'defaults' @ [43:76] ==> public open fun defaults(): (ConfigRenderOptions..ConfigRenderOptions?) defined in com.typesafe.config.ConfigRenderOptions[JavaMethodDescriptor]

'finalConfig' @ [44:16] ==> val finalConfig: (Config..Config?) defined in net.corda.node.services.config.ConfigHelper.loadConfig[LocalVariableDescriptor]

'configureDevKeyAndTrustStores' @ [52:58] ==> public fun SSLConfiguration.configureDevKeyAndTrustStores(myLegalName: X500Name): Unit defined in net.corda.node.services.config in file ConfigUtilities.kt[SimpleFunctionDescriptorImpl]

'myLegalName' @ [52:88] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'certificatesDirectory' @ [55:5] ==> public abstract val certificatesDirectory: Path defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'createDirectories' @ [55:27] ==> public fun Path.createDirectories(vararg attrs: FileAttribute<*>): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'!' @ [56:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'trustStoreFile' @ [56:10] ==> public open val trustStoreFile: Path defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'exists' @ [56:25] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'javaClass' @ [57:9] ==> public val <T : Any> SSLConfiguration.javaClass: Class<SSLConfiguration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SSLConfiguration

'classLoader' @ [57:19] ==> public final val <T : (Any..Any?)> Class<SSLConfiguration>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SSLConfiguration

'getResourceAsStream' @ [57:31] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'copyTo' @ [57:111] ==> public fun InputStream.copyTo(target: Path, vararg options: CopyOption): Long defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'trustStoreFile' @ [57:118] ==> public open val trustStoreFile: Path defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'!' @ [59:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sslKeystore' @ [59:10] ==> public open val sslKeystore: Path defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'exists' @ [59:22] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'!' @ [59:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nodeKeystore' @ [59:35] ==> public open val nodeKeystore: Path defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'exists' @ [59:48] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'loadKeyStore' @ [60:26] ==> @Throws public fun loadKeyStore(input: InputStream, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'javaClass' @ [60:39] ==> public val <T : Any> SSLConfiguration.javaClass: Class<SSLConfiguration> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SSLConfiguration

'classLoader' @ [60:49] ==> public final val <T : (Any..Any?)> Class<SSLConfiguration>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SSLConfiguration

'getResourceAsStream' @ [60:61] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'createKeystoreForCordaNode' @ [61:9] ==> public fun createKeystoreForCordaNode(sslKeyStorePath: Path, clientCAKeystorePath: Path, storePassword: String, keyPassword: String, caKeyStore: KeyStore, caKeyPassword: String, legalName: X500Name, signatureScheme: SignatureScheme = ...): Unit defined in net.corda.node.services.config in file ConfigUtilities.kt[SimpleFunctionDescriptorImpl]

'sslKeystore' @ [61:36] ==> public open val sslKeystore: Path defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'nodeKeystore' @ [61:49] ==> public open val nodeKeystore: Path defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'keyStorePassword' @ [61:63] ==> public abstract val keyStorePassword: String defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'keyStorePassword' @ [61:81] ==> public abstract val keyStorePassword: String defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'caKeyStore' @ [61:99] ==> val caKeyStore: KeyStore defined in net.corda.node.services.config.configureDevKeyAndTrustStores[LocalVariableDescriptor]

'myLegalName' @ [61:132] ==> value-parameter myLegalName: X500Name defined in net.corda.node.services.config.configureDevKeyAndTrustStores[ValueParameterDescriptorImpl]

'X509Utilities' @ [83:67] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [83:81] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'caKeyStore' @ [85:22] ==> value-parameter caKeyStore: KeyStore defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'getX509Certificate' @ [85:33] ==> public fun KeyStore.getX509Certificate(alias: String): X509CertificateHolder defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'X509Utilities' @ [85:52] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [85:66] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'component1' @ [86:10] ==> public final operator fun component1(): X509CertificateHolder defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedSimpleFunctionDescriptor]

'component2' @ [86:30] ==> public final operator fun component2(): KeyPair defined in net.corda.core.crypto.CertificateAndKeyPair[DeserializedSimpleFunctionDescriptor]

'caKeyStore' @ [86:55] ==> value-parameter caKeyStore: KeyStore defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'getCertificateAndKeyPair' @ [86:66] ==> public fun KeyStore.getCertificateAndKeyPair(alias: String, keyPassword: String): CertificateAndKeyPair defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'X509Utilities' @ [86:91] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'CORDA_INTERMEDIATE_CA' @ [86:105] ==> public final val CORDA_INTERMEDIATE_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'caKeyPassword' @ [86:128] ==> value-parameter caKeyPassword: String defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'Crypto' @ [88:21] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [88:28] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'signatureScheme' @ [88:44] ==> value-parameter signatureScheme: SignatureScheme = ... defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'NameConstraints' @ [89:27] ==> public constructor NameConstraints(p0: (Array<(GeneralSubtree..GeneralSubtree?)>..Array<out (GeneralSubtree..GeneralSubtree?)>?), p1: (Array<(GeneralSubtree..GeneralSubtree?)>..Array<out (GeneralSubtree..GeneralSubtree?)>?)) defined in org.bouncycastle.asn1.x509.NameConstraints[JavaClassConstructorDescriptor]

'arrayOf' @ [89:43] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: GeneralSubtree): Array<GeneralSubtree> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> GeneralSubtree

'GeneralSubtree' @ [89:51] ==> public constructor GeneralSubtree(p0: (GeneralName..GeneralName?)) defined in org.bouncycastle.asn1.x509.GeneralSubtree[JavaClassConstructorDescriptor]

'GeneralName' @ [89:66] ==> public constructor GeneralName(p0: Int, p1: (ASN1Encodable..ASN1Encodable?)) defined in org.bouncycastle.asn1.x509.GeneralName[JavaClassConstructorDescriptor]

'directoryName' @ [89:90] ==> public const final val directoryName: Int defined in org.bouncycastle.asn1.x509.GeneralName[JavaPropertyDescriptor]

'legalName' @ [89:105] ==> value-parameter legalName: X500Name defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'arrayOf' @ [89:119] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (GeneralSubtree..GeneralSubtree?)): Array<(GeneralSubtree..GeneralSubtree?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (org.bouncycastle.asn1.x509.GeneralSubtree..org.bouncycastle.asn1.x509.GeneralSubtree?)

'X509Utilities' @ [90:24] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'createCertificate' @ [90:38] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'INTERMEDIATE_CA' @ [90:72] ==> enum entry INTERMEDIATE_CA defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'intermediateCACert' @ [90:89] ==> val intermediateCACert: X509CertificateHolder defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'intermediateCAKeyPair' @ [90:109] ==> val intermediateCAKeyPair: KeyPair defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'legalName' @ [90:132] ==> value-parameter legalName: X500Name defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'clientKey' @ [90:143] ==> val clientKey: KeyPair defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'public' @ [90:153] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'nameConstraints' @ [90:179] ==> val nameConstraints: NameConstraints defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'Crypto' @ [92:18] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [92:25] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'signatureScheme' @ [92:41] ==> value-parameter signatureScheme: SignatureScheme = ... defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'X509Utilities' @ [93:25] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'createCertificate' @ [93:39] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'TLS' @ [93:73] ==> enum entry TLS defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'clientCACert' @ [93:78] ==> val clientCACert: X509CertificateHolder defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'clientKey' @ [93:92] ==> val clientKey: KeyPair defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'legalName' @ [93:103] ==> value-parameter legalName: X500Name defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'tlsKey' @ [93:114] ==> val tlsKey: KeyPair defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'public' @ [93:121] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'keyPassword' @ [95:19] ==> value-parameter keyPassword: String defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'toCharArray' @ [95:31] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'loadOrCreateKeyStore' @ [97:28] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'clientCAKeystorePath' @ [97:49] ==> value-parameter clientCAKeystorePath: Path defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'storePassword' @ [97:71] ==> value-parameter storePassword: String defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'clientCAKeystore' @ [98:5] ==> val clientCAKeystore: KeyStore defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'addOrReplaceKey' @ [98:22] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out X509CertificateHolder>): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'X509Utilities' @ [99:13] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'CORDA_CLIENT_CA' @ [99:27] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'clientKey' @ [100:13] ==> val clientKey: KeyPair defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'private' @ [100:23] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'keyPass' @ [101:13] ==> val keyPass: CharArray defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'arrayOf' @ [102:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: X509CertificateHolder): Array<X509CertificateHolder> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> X509CertificateHolder

'clientCACert' @ [102:21] ==> val clientCACert: X509CertificateHolder defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'intermediateCACert' @ [102:35] ==> val intermediateCACert: X509CertificateHolder defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'rootCACert' @ [102:55] ==> val rootCACert: X509CertificateHolder defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'clientCAKeystore' @ [103:5] ==> val clientCAKeystore: KeyStore defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'save' @ [103:22] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'clientCAKeystorePath' @ [103:27] ==> value-parameter clientCAKeystorePath: Path defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'storePassword' @ [103:49] ==> value-parameter storePassword: String defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'loadOrCreateKeyStore' @ [105:23] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'sslKeyStorePath' @ [105:44] ==> value-parameter sslKeyStorePath: Path defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'storePassword' @ [105:61] ==> value-parameter storePassword: String defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'tlsKeystore' @ [106:5] ==> val tlsKeystore: KeyStore defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'addOrReplaceKey' @ [106:17] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out X509CertificateHolder>): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'X509Utilities' @ [107:13] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [107:27] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'tlsKey' @ [108:13] ==> val tlsKey: KeyPair defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'private' @ [108:20] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'keyPass' @ [109:13] ==> val keyPass: CharArray defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'arrayOf' @ [110:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: X509CertificateHolder): Array<X509CertificateHolder> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> X509CertificateHolder

'clientTLSCert' @ [110:21] ==> val clientTLSCert: X509CertificateHolder defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'clientCACert' @ [110:36] ==> val clientCACert: X509CertificateHolder defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'intermediateCACert' @ [110:50] ==> val intermediateCACert: X509CertificateHolder defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'rootCACert' @ [110:70] ==> val rootCACert: X509CertificateHolder defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'tlsKeystore' @ [111:5] ==> val tlsKeystore: KeyStore defined in net.corda.node.services.config.createKeystoreForCordaNode[LocalVariableDescriptor]

'save' @ [111:17] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'sslKeyStorePath' @ [111:22] ==> value-parameter sslKeyStorePath: Path defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

'storePassword' @ [111:39] ==> value-parameter storePassword: String defined in net.corda.node.services.config.createKeystoreForCordaNode[ValueParameterDescriptorImpl]

