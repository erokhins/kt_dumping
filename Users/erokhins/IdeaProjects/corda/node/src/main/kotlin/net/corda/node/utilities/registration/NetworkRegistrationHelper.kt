'seconds' @ [30:31] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'config' @ [34:34] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'certificatesDirectory' @ [34:41] ==> public open val certificatesDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [35:36] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'keyStorePassword' @ [35:43] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [37:38] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'keyStorePassword' @ [37:45] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'validateX500Name' @ [40:9] ==> public fun validateX500Name(x500Name: X500Name): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'config' @ [40:26] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'myLegalName' @ [40:33] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'config' @ [41:9] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'certificatesDirectory' @ [41:16] ==> public open val certificatesDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'createDirectories' @ [41:38] ==> public fun Path.createDirectories(vararg attrs: FileAttribute<*>): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'loadOrCreateKeyStore' @ [42:26] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'config' @ [42:47] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'nodeKeystore' @ [42:54] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'keystorePassword' @ [42:68] ==> private final val keystorePassword: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'if (!caKeyStore.containsAlias(CORDA_CLIENT_CA)) {
            // Create or load self signed keypair from the key store.
            // We use the self sign certificate to store the key temporarily in the keystore while waiting for the request approval.
            if (!caKeyStore.containsAlias(SELF_SIGNED_PRIVATE_KEY)) {
                val keyPair = Crypto.generateKeyPair(X509Utilities.DEFAULT_TLS_SIGNATURE_SCHEME)
                val selfSignCert = X509Utilities.createSelfSignedCACertificate(config.myLegalName, keyPair)
                // Save to the key store.
                caKeyStore.addOrReplaceKey(SELF_SIGNED_PRIVATE_KEY, keyPair.private, privateKeyPassword.toCharArray(),
                        arrayOf(selfSignCert))
                caKeyStore.save(config.nodeKeystore, keystorePassword)
            }
            val keyPair = caKeyStore.getKeyPair(SELF_SIGNED_PRIVATE_KEY, privateKeyPassword)
            val requestId = submitOrResumeCertificateSigningRequest(keyPair)

            val certificates = try {
                pollServerForCertificates(requestId)
            } catch (e: CertificateRequestException) {
                System.err.println(e.message)
                println("Please make sure the details in configuration file are correct and try again.")
                println("Corda node will now terminate.")
                requestIdStore.deleteIfExists()
                exitProcess(1)
            }

            println("Certificate signing request approved, storing private key with the certificate chain.")
            // Save private key and certificate chain to the key store.
            caKeyStore.addOrReplaceKey(CORDA_CLIENT_CA, keyPair.private, privateKeyPassword.toCharArray(), certificates)
            caKeyStore.deleteEntry(SELF_SIGNED_PRIVATE_KEY)
            caKeyStore.save(config.nodeKeystore, keystorePassword)
            // Save root certificates to trust store.
            val trustStore = loadOrCreateKeyStore(config.trustStoreFile, config.trustStorePassword)
            // Assumes certificate chain always starts with client certificate and end with root certificate.
            trustStore.addOrReplaceCertificate(CORDA_ROOT_CA, certificates.last())
            trustStore.save(config.trustStoreFile, config.trustStorePassword)
            println("Node private key and certificate stored in ${config.nodeKeystore}.")

            println("Generating SSL certificate for node messaging service.")
            val sslKey = Crypto.generateKeyPair(X509Utilities.DEFAULT_TLS_SIGNATURE_SCHEME)
            val caCert = caKeyStore.getX509Certificate(CORDA_CLIENT_CA)
            val sslCert = X509Utilities.createCertificate(CertificateType.TLS, caCert, keyPair, caCert.subject, sslKey.public)
            val sslKeyStore = loadOrCreateKeyStore(config.sslKeystore, keystorePassword)
            sslKeyStore.addOrReplaceKey(CORDA_CLIENT_TLS, sslKey.private, privateKeyPassword.toCharArray(),
                    arrayOf(sslCert.cert, *certificates))
            sslKeyStore.save(config.sslKeystore, config.keyStorePassword)
            println("SSL private key and certificate stored in ${config.sslKeystore}.")
            // All done, clean up temp files.
            requestIdStore.deleteIfExists()
        } else {
            println("Certificate already exists, Corda node will now terminate...")
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [43:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'caKeyStore' @ [43:14] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'containsAlias' @ [43:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'CORDA_CLIENT_CA' @ [43:39] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyImportedFromObject]

'!' @ [46:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'caKeyStore' @ [46:18] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'containsAlias' @ [46:29] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'SELF_SIGNED_PRIVATE_KEY' @ [46:43] ==> public final val SELF_SIGNED_PRIVATE_KEY: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.Companion[PropertyDescriptorImpl]

'Crypto' @ [47:31] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [47:38] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [47:54] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [47:68] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'X509Utilities' @ [48:36] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [48:50] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'config' @ [48:80] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'myLegalName' @ [48:87] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'keyPair' @ [48:100] ==> val keyPair: KeyPair defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'caKeyStore' @ [50:17] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'addOrReplaceKey' @ [50:28] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out X509CertificateHolder>): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'SELF_SIGNED_PRIVATE_KEY' @ [50:44] ==> public final val SELF_SIGNED_PRIVATE_KEY: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.Companion[PropertyDescriptorImpl]

'keyPair' @ [50:69] ==> val keyPair: KeyPair defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'private' @ [50:77] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'privateKeyPassword' @ [50:86] ==> private final val privateKeyPassword: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'toCharArray' @ [50:105] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [51:25] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: X509CertificateHolder): Array<X509CertificateHolder> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> X509CertificateHolder

'selfSignCert' @ [51:33] ==> val selfSignCert: X509CertificateHolder defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'caKeyStore' @ [52:17] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'save' @ [52:28] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'config' @ [52:33] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'nodeKeystore' @ [52:40] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'keystorePassword' @ [52:54] ==> private final val keystorePassword: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'caKeyStore' @ [54:27] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'getKeyPair' @ [54:38] ==> public fun KeyStore.getKeyPair(alias: String, keyPassword: String): KeyPair defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'SELF_SIGNED_PRIVATE_KEY' @ [54:49] ==> public final val SELF_SIGNED_PRIVATE_KEY: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.Companion[PropertyDescriptorImpl]

'privateKeyPassword' @ [54:74] ==> private final val privateKeyPassword: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'submitOrResumeCertificateSigningRequest' @ [55:29] ==> private final fun submitOrResumeCertificateSigningRequest(keyPair: KeyPair): String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[SimpleFunctionDescriptorImpl]

'keyPair' @ [55:69] ==> val keyPair: KeyPair defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'pollServerForCertificates' @ [58:17] ==> private final fun pollServerForCertificates(requestId: String): Array<Certificate> defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[SimpleFunctionDescriptorImpl]

'requestId' @ [58:43] ==> val requestId: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'err' @ [60:24] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [60:28] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'e' @ [60:36] ==> val e: CertificateRequestException defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'message' @ [60:38] ==> public open val message: String? defined in net.corda.node.utilities.registration.CertificateRequestException[DeserializedPropertyDescriptor]

'println' @ [61:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [62:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'requestIdStore' @ [63:17] ==> private final val requestIdStore: Path defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'deleteIfExists' @ [63:32] ==> public fun Path.deleteIfExists(): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'exitProcess' @ [64:17] ==> @InlineOnly public inline fun exitProcess(status: Int): Nothing defined in kotlin.system[DeserializedSimpleFunctionDescriptor]

'println' @ [67:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'caKeyStore' @ [69:13] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'addOrReplaceKey' @ [69:24] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out Certificate>): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'CORDA_CLIENT_CA' @ [69:40] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyImportedFromObject]

'keyPair' @ [69:57] ==> val keyPair: KeyPair defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'private' @ [69:65] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'privateKeyPassword' @ [69:74] ==> private final val privateKeyPassword: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'toCharArray' @ [69:93] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'certificates' @ [69:108] ==> val certificates: Array<Certificate> defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'caKeyStore' @ [70:13] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'deleteEntry' @ [70:24] ==> public final fun deleteEntry(p0: (String..String?)): Unit defined in java.security.KeyStore[JavaMethodDescriptor]

'SELF_SIGNED_PRIVATE_KEY' @ [70:36] ==> public final val SELF_SIGNED_PRIVATE_KEY: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.Companion[PropertyDescriptorImpl]

'caKeyStore' @ [71:13] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'save' @ [71:24] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'config' @ [71:29] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'nodeKeystore' @ [71:36] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'keystorePassword' @ [71:50] ==> private final val keystorePassword: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'loadOrCreateKeyStore' @ [73:30] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'config' @ [73:51] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'trustStoreFile' @ [73:58] ==> public open val trustStoreFile: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [73:74] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'trustStorePassword' @ [73:81] ==> public abstract val trustStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'trustStore' @ [75:13] ==> val trustStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'addOrReplaceCertificate' @ [75:24] ==> public fun KeyStore.addOrReplaceCertificate(alias: String, cert: Certificate): Unit defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'CORDA_ROOT_CA' @ [75:48] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyImportedFromObject]

'certificates' @ [75:63] ==> val certificates: Array<Certificate> defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'last' @ [75:76] ==> public fun <T> Array<out Certificate>.last(): Certificate defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Certificate

'trustStore' @ [76:13] ==> val trustStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'save' @ [76:24] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'config' @ [76:29] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'trustStoreFile' @ [76:36] ==> public open val trustStoreFile: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [76:52] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'trustStorePassword' @ [76:59] ==> public abstract val trustStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'println' @ [77:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'config' @ [77:67] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'nodeKeystore' @ [77:74] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'println' @ [79:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Crypto' @ [80:26] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [80:33] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [80:49] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [80:63] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[PropertyDescriptorImpl]

'caKeyStore' @ [81:26] ==> val caKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'getX509Certificate' @ [81:37] ==> public fun KeyStore.getX509Certificate(alias: String): X509CertificateHolder defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'CORDA_CLIENT_CA' @ [81:56] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[PropertyImportedFromObject]

'X509Utilities' @ [82:27] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'createCertificate' @ [82:41] ==> @JvmStatic public final fun createCertificate(certificateType: CertificateType, issuerCertificate: X509CertificateHolder, issuerKeyPair: KeyPair, subject: X500Name, subjectPublicKey: PublicKey, validityWindow: Pair<Duration, Duration> = ..., nameConstraints: NameConstraints? = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'TLS' @ [82:75] ==> enum entry TLS defined in net.corda.node.utilities.CertificateType[FakeCallableDescriptorForObject]

'caCert' @ [82:80] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'keyPair' @ [82:88] ==> val keyPair: KeyPair defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'caCert' @ [82:97] ==> val caCert: X509CertificateHolder defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'subject' @ [82:104] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'sslKey' @ [82:113] ==> val sslKey: KeyPair defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'public' @ [82:120] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'loadOrCreateKeyStore' @ [83:31] ==> public fun loadOrCreateKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities in file KeyStoreUtilities.kt[SimpleFunctionDescriptorImpl]

'config' @ [83:52] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'sslKeystore' @ [83:59] ==> public open val sslKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'keystorePassword' @ [83:72] ==> private final val keystorePassword: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'sslKeyStore' @ [84:13] ==> val sslKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'addOrReplaceKey' @ [84:25] ==> public fun KeyStore.addOrReplaceKey(alias: String, key: Key, password: CharArray, chain: Array<out Certificate>): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'CORDA_CLIENT_TLS' @ [84:41] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[PropertyImportedFromObject]

'sslKey' @ [84:59] ==> val sslKey: KeyPair defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'private' @ [84:66] ==> public final val KeyPair.private: (PrivateKey..PrivateKey?)[MyPropertyDescriptor]

'privateKeyPassword' @ [84:75] ==> private final val privateKeyPassword: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'toCharArray' @ [84:94] ==> @InlineOnly public inline fun String.toCharArray(): CharArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [85:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Certificate): Array<Certificate> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Certificate

'sslCert' @ [85:29] ==> val sslCert: X509CertificateHolder defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'cert' @ [85:37] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'certificates' @ [85:44] ==> val certificates: Array<Certificate> defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'sslKeyStore' @ [86:13] ==> val sslKeyStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.buildKeystore[LocalVariableDescriptor]

'save' @ [86:25] ==> public fun KeyStore.save(keyStoreFilePath: Path, storePassword: String): Unit defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]

'config' @ [86:30] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'sslKeystore' @ [86:37] ==> public open val sslKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [86:50] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'keyStorePassword' @ [86:57] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'println' @ [87:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'config' @ [87:66] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'sslKeystore' @ [87:73] ==> public open val sslKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'requestIdStore' @ [89:13] ==> private final val requestIdStore: Path defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'deleteIfExists' @ [89:28] ==> public fun Path.deleteIfExists(): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'println' @ [91:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [103:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'certService' @ [105:28] ==> public final val certService: NetworkRegistrationService defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'retrieveCertificates' @ [105:40] ==> @Throws public abstract fun retrieveCertificates(requestId: String): Array<Certificate>? defined in net.corda.node.utilities.registration.NetworkRegistrationService[SimpleFunctionDescriptorImpl]

'requestId' @ [105:61] ==> value-parameter requestId: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.pollServerForCertificates[ValueParameterDescriptorImpl]

'certificates' @ [106:16] ==> var certificates: Array<Certificate>? defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.pollServerForCertificates[LocalVariableDescriptor]

'sleep' @ [107:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'pollInterval' @ [107:26] ==> public final val pollInterval: Duration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.Companion[PropertyDescriptorImpl]

'toMillis' @ [107:39] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'certificates' @ [108:13] ==> var certificates: Array<Certificate>? defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.pollServerForCertificates[LocalVariableDescriptor]

'certService' @ [108:28] ==> public final val certService: NetworkRegistrationService defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'retrieveCertificates' @ [108:40] ==> @Throws public abstract fun retrieveCertificates(requestId: String): Array<Certificate>? defined in net.corda.node.utilities.registration.NetworkRegistrationService[SimpleFunctionDescriptorImpl]

'requestId' @ [108:61] ==> value-parameter requestId: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.pollServerForCertificates[ValueParameterDescriptorImpl]

'certificates' @ [110:16] ==> var certificates: Array<Certificate>? defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.pollServerForCertificates[LocalVariableDescriptor]

'if (!requestIdStore.exists()) {
            val request = X509Utilities.createCertificateSigningRequest(config.myLegalName, keyPair)
            val writer = StringWriter()
            JcaPEMWriter(writer).use {
                it.writeObject(PemObject("CERTIFICATE REQUEST", request.encoded))
            }
            println("Certificate signing request with the following information will be submitted to the Corda certificate signing server.")
            println()
            println("Legal Name: ${config.myLegalName}")
            println("Email: ${config.emailAddress}")
            println()
            println("Public Key: ${keyPair.public}")
            println()
            println("$writer")
            // Post request to signing server via http.
            println("Submitting certificate signing request to Corda certificate signing server.")
            val requestId = certService.submitRequest(request)
            // Persists request ID to file in case of node shutdown.
            requestIdStore.writeLines(listOf(requestId))
            println("Successfully submitted request to Corda certificate signing server, request ID: $requestId.")
            requestId
        } else {
            val requestId = requestIdStore.readLines { it.findFirst().get() }
            println("Resuming from previous certificate signing request, request ID: $requestId.")
            requestId
        }' @ [121:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [121:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'requestIdStore' @ [121:21] ==> private final val requestIdStore: Path defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'exists' @ [121:36] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [122:27] ==> public object X509Utilities defined in net.corda.node.utilities in file X509Utilities.kt[FakeCallableDescriptorForObject]

'createCertificateSigningRequest' @ [122:41] ==> public final fun createCertificateSigningRequest(subject: X500Name, keyPair: KeyPair): PKCS10CertificationRequest defined in net.corda.node.utilities.X509Utilities[SimpleFunctionDescriptorImpl]

'config' @ [122:73] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'myLegalName' @ [122:80] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'keyPair' @ [122:93] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[ValueParameterDescriptorImpl]

'StringWriter' @ [123:26] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'JcaPEMWriter' @ [124:13] ==> public constructor JcaPEMWriter(p0: (Writer..Writer?)) defined in org.bouncycastle.openssl.jcajce.JcaPEMWriter[JavaClassConstructorDescriptor]

'writer' @ [124:26] ==> val writer: StringWriter defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[LocalVariableDescriptor]

'use' @ [124:34] ==> @InlineOnly public inline fun <T : Closeable?, R> JcaPEMWriter.use(block: (JcaPEMWriter) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> JcaPEMWriter
    <R> -> Unit

'it' @ [125:17] ==> value-parameter it: JcaPEMWriter defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest.<anonymous>[ValueParameterDescriptorImpl]

'writeObject' @ [125:20] ==> public open fun writeObject(p0: (PemObjectGenerator..PemObjectGenerator?)): Unit defined in org.bouncycastle.openssl.jcajce.JcaPEMWriter[JavaMethodDescriptor]

'PemObject' @ [125:32] ==> public constructor PemObject(p0: (String..String?), p1: (ByteArray..ByteArray?)) defined in org.bouncycastle.util.io.pem.PemObject[JavaClassConstructorDescriptor]

'request' @ [125:65] ==> val request: PKCS10CertificationRequest defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[LocalVariableDescriptor]

'encoded' @ [125:73] ==> public final val PKCS10CertificationRequest.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'println' @ [127:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [128:13] ==> @InlineOnly public inline fun println(): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [129:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'config' @ [129:36] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'myLegalName' @ [129:43] ==> public abstract val myLegalName: X500Name defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'println' @ [130:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'config' @ [130:31] ==> public final val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'emailAddress' @ [130:38] ==> public abstract val emailAddress: String defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'println' @ [131:13] ==> @InlineOnly public inline fun println(): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [132:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'keyPair' @ [132:36] ==> value-parameter keyPair: KeyPair defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[ValueParameterDescriptorImpl]

'public' @ [132:44] ==> public final val KeyPair.public: (PublicKey..PublicKey?)[MyPropertyDescriptor]

'println' @ [133:13] ==> @InlineOnly public inline fun println(): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [134:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'writer' @ [134:23] ==> val writer: StringWriter defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[LocalVariableDescriptor]

'println' @ [136:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'certService' @ [137:29] ==> public final val certService: NetworkRegistrationService defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'submitRequest' @ [137:41] ==> public abstract fun submitRequest(request: PKCS10CertificationRequest): String defined in net.corda.node.utilities.registration.NetworkRegistrationService[SimpleFunctionDescriptorImpl]

'request' @ [137:55] ==> val request: PKCS10CertificationRequest defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[LocalVariableDescriptor]

'requestIdStore' @ [139:13] ==> private final val requestIdStore: Path defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'writeLines' @ [139:28] ==> public fun Path.writeLines(lines: Iterable<CharSequence>, charset: Charset = ..., vararg options: OpenOption): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'listOf' @ [139:39] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'requestId' @ [139:46] ==> val requestId: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[LocalVariableDescriptor]

'println' @ [140:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'requestId' @ [140:103] ==> val requestId: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[LocalVariableDescriptor]

'requestId' @ [141:13] ==> val requestId: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[LocalVariableDescriptor]

'requestIdStore' @ [143:29] ==> private final val requestIdStore: Path defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[PropertyDescriptorImpl]

'readLines' @ [143:44] ==> public inline fun <R> Path.readLines(charset: Charset = ..., block: (Stream<String>) -> String): String defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> String

'it' @ [143:56] ==> value-parameter it: Stream<String> defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest.<anonymous>[ValueParameterDescriptorImpl]

'findFirst' @ [143:59] ==> public abstract fun findFirst(): (Optional<(String..String?)>..Optional<(String..String?)>?) defined in java.util.stream.Stream[JavaMethodDescriptor]

'get' @ [143:71] ==> public open fun get(): String defined in java.util.Optional[JavaMethodDescriptor]

'println' @ [144:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'requestId' @ [144:87] ==> val requestId: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[LocalVariableDescriptor]

'requestId' @ [145:13] ==> val requestId: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelper.submitOrResumeCertificateSigningRequest[LocalVariableDescriptor]

