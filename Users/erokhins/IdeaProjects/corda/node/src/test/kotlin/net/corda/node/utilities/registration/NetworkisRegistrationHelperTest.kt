'Rule' @ [26:5] ==> public constructor Rule() defined in org.junit.Rule[JavaClassConstructorDescriptor]

'JvmField' @ [27:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'TemporaryFolder' @ [28:22] ==> public constructor TemporaryFolder() defined in org.junit.rules.TemporaryFolder[JavaClassConstructorDescriptor]

'Test' @ [30:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'SecureHash' @ [32:18] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [32:29] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'toString' @ [32:44] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedSimpleFunctionDescriptor]

'listOf' @ [34:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [37:18] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> X500Name): List<X500Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> X500Name

'getTestX509Name' @ [37:24] ==> public fun getTestX509Name(commonName: String): X500Name defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'it' @ [37:40] ==> value-parameter it: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore.<anonymous>[ValueParameterDescriptorImpl]

'identities' @ [38:21] ==> val identities: List<X500Name> defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'stream' @ [38:32] ==> public open fun stream(): Stream<X500Name> defined in kotlin.collections.List[JavaMethodDescriptor]

'map' @ [38:41] ==> public final fun <R : (Any..Any?)> map(p0: (((X500Name..X500Name?)) -> (X509CertificateHolder..X509CertificateHolder?)..(((X500Name..X500Name?)) -> (X509CertificateHolder..X509CertificateHolder?))?)): (Stream<(X509CertificateHolder..X509CertificateHolder?)>..Stream<(X509CertificateHolder..X509CertificateHolder?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> X509CertificateHolder

'X509Utilities' @ [38:47] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'createSelfSignedCACertificate' @ [38:61] ==> @JvmStatic public final fun createSelfSignedCACertificate(subject: X500Name, keyPair: KeyPair, validityWindow: Pair<Duration, Duration> = ...): X509CertificateHolder defined in net.corda.node.utilities.X509Utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [38:91] ==> value-parameter it: (X500Name..X500Name?) defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore.<anonymous>[ValueParameterDescriptorImpl]

'Crypto' @ [38:95] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'generateKeyPair' @ [38:102] ==> @JvmStatic @JvmOverloads public final fun generateKeyPair(signatureScheme: SignatureScheme = ...): KeyPair defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'X509Utilities' @ [38:118] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'DEFAULT_TLS_SIGNATURE_SCHEME' @ [38:132] ==> public final val DEFAULT_TLS_SIGNATURE_SCHEME: SignatureScheme defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'map' @ [39:18] ==> public final fun <R : (Any..Any?)> map(p0: (((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?)..(((X509CertificateHolder..X509CertificateHolder?)) -> (X509Certificate..X509Certificate?))?)): (Stream<(X509Certificate..X509Certificate?)>..Stream<(X509Certificate..X509Certificate?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> X509Certificate

'it' @ [39:24] ==> value-parameter it: (X509CertificateHolder..X509CertificateHolder?) defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore.<anonymous>[ValueParameterDescriptorImpl]

'cert' @ [39:27] ==> public val X509CertificateHolder.cert: X509Certificate defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'toTypedArray' @ [39:34] ==> public inline fun <reified T> Stream<out (X509Certificate..X509Certificate?)>.toTypedArray(): Array<(X509Certificate..X509Certificate?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.security.cert.X509Certificate..java.security.cert.X509Certificate?)

'mock' @ [41:55] ==> public inline fun <reified T : Any> mock(stubbing: KStubbing<NetworkRegistrationService>.(NetworkRegistrationService) -> Unit): NetworkRegistrationService defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NetworkRegistrationService

'on' @ [42:13] ==> public final fun <R> on(methodCall: NetworkRegistrationService.() -> String): OngoingStubbing<String> defined in com.nhaarman.mockito_kotlin.KStubbing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> String

'submitRequest' @ [42:18] ==> public abstract fun submitRequest(request: PKCS10CertificationRequest): String defined in net.corda.node.utilities.registration.NetworkRegistrationService[DeserializedSimpleFunctionDescriptor]

'any' @ [42:32] ==> public inline fun <reified T : Any> any(): PKCS10CertificationRequest defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PKCS10CertificationRequest

'then' @ [42:41] ==> public final fun then(p0: (((InvocationOnMock..InvocationOnMock?)) -> (Any..Any?)..(((InvocationOnMock..InvocationOnMock?)) -> (Any..Any?))?)): (OngoingStubbing<(String..String?)>..OngoingStubbing<(String..String?)>?) defined in org.mockito.stubbing.OngoingStubbing[MyFunctionDescriptor]

'id' @ [42:48] ==> val id: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'on' @ [43:13] ==> public final fun <R> on(methodCall: NetworkRegistrationService.() -> Array<Certificate>?): OngoingStubbing<Array<Certificate>?> defined in com.nhaarman.mockito_kotlin.KStubbing[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Array<Certificate>?

'retrieveCertificates' @ [43:18] ==> public abstract fun retrieveCertificates(requestId: String): Array<Certificate>? defined in net.corda.node.utilities.registration.NetworkRegistrationService[DeserializedSimpleFunctionDescriptor]

'eq' @ [43:39] ==> public fun <T> eq(value: String): String defined in com.nhaarman.mockito_kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'id' @ [43:42] ==> val id: String defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'then' @ [43:49] ==> public final fun then(p0: (((InvocationOnMock..InvocationOnMock?)) -> (Any..Any?)..(((InvocationOnMock..InvocationOnMock?)) -> (Any..Any?))?)): (OngoingStubbing<Array<Certificate>?>..OngoingStubbing<Array<Certificate>?>?) defined in org.mockito.stubbing.OngoingStubbing[MyFunctionDescriptor]

'certs' @ [43:56] ==> val certs: Array<(X509Certificate..X509Certificate?)> defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'testNodeConfiguration' @ [46:22] ==> public fun testNodeConfiguration(baseDirectory: Path, myLegalName: X500Name): NodeConfiguration defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'tempFolder' @ [47:33] ==> @Rule @JvmField public final val tempFolder: TemporaryFolder defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest[PropertyDescriptorImpl]

'root' @ [47:44] ==> public final val TemporaryFolder.root: (File..File?)[MyPropertyDescriptor]

'toPath' @ [47:49] ==> public open fun toPath(): (Path..Path?) defined in java.io.File[JavaMethodDescriptor]

'ALICE' @ [48:31] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [48:37] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'assertFalse' @ [50:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'config' @ [50:21] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'nodeKeystore' @ [50:28] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'exists' @ [50:41] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [51:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'config' @ [51:21] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'sslKeystore' @ [51:28] ==> public open val sslKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'exists' @ [51:40] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [52:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'config' @ [52:21] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'trustStoreFile' @ [52:28] ==> public open val trustStoreFile: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'exists' @ [52:43] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'NetworkRegistrationHelper' @ [54:9] ==> public constructor NetworkRegistrationHelper(config: NodeConfiguration, certService: NetworkRegistrationService) defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[DeserializedClassConstructorDescriptor]

'config' @ [54:35] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'certService' @ [54:43] ==> val certService: NetworkRegistrationService defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'buildKeystore' @ [54:56] ==> public final fun buildKeystore(): Unit defined in net.corda.node.utilities.registration.NetworkRegistrationHelper[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [56:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'config' @ [56:20] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'nodeKeystore' @ [56:27] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'exists' @ [56:40] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [57:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'config' @ [57:20] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'sslKeystore' @ [57:27] ==> public open val sslKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'exists' @ [57:39] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [58:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'config' @ [58:20] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'trustStoreFile' @ [58:27] ==> public open val trustStoreFile: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'exists' @ [58:42] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'loadKeyStore' @ [60:28] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'config' @ [60:41] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'nodeKeystore' @ [60:48] ==> public open val nodeKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [60:62] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'keyStorePassword' @ [60:69] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'loadKeyStore' @ [61:27] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'config' @ [61:40] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'sslKeystore' @ [61:47] ==> public open val sslKeystore: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [61:60] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'keyStorePassword' @ [61:67] ==> public abstract val keyStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'loadKeyStore' @ [62:26] ==> public fun loadKeyStore(keyStoreFilePath: Path, storePassword: String): KeyStore defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'config' @ [62:39] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'trustStoreFile' @ [62:46] ==> public open val trustStoreFile: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'config' @ [62:62] ==> val config: NodeConfiguration defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'trustStorePassword' @ [62:69] ==> public abstract val trustStorePassword: String defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'nodeKeystore' @ [64:9] ==> val nodeKeystore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'run' @ [64:22] ==> @InlineOnly public inline fun <T, R> KeyStore.run(block: KeyStore.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyStore
    <R> -> Unit

'assertTrue' @ [65:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [65:24] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [65:38] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_CA' @ [65:52] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertFalse' @ [66:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [66:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [66:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_INTERMEDIATE_CA' @ [66:53] ==> public final val CORDA_INTERMEDIATE_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertFalse' @ [67:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [67:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [67:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [67:53] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertFalse' @ [68:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [68:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [68:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [68:53] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'getCertificateChain' @ [69:36] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [69:56] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_CA' @ [69:70] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertEquals' @ [70:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'certificateChain' @ [70:29] ==> val certificateChain: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore.<anonymous>[LocalVariableDescriptor]

'size' @ [70:46] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'assertEquals' @ [71:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [71:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'certificateChain' @ [71:95] ==> val certificateChain: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore.<anonymous>[LocalVariableDescriptor]

'map' @ [71:112] ==> public inline fun <T, R> Array<out (Certificate..Certificate?)>.map(transform: ((Certificate..Certificate?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)
    <R> -> String

'it' @ [71:118] ==> value-parameter it: (Certificate..Certificate?) defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toX509CertHolder' @ [71:121] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'subject' @ [71:140] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'commonName' @ [71:148] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'sslKeystore' @ [74:9] ==> val sslKeystore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'run' @ [74:21] ==> @InlineOnly public inline fun <T, R> KeyStore.run(block: KeyStore.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyStore
    <R> -> Unit

'assertFalse' @ [75:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [75:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [75:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_CA' @ [75:53] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertFalse' @ [76:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [76:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [76:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_INTERMEDIATE_CA' @ [76:53] ==> public final val CORDA_INTERMEDIATE_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertFalse' @ [77:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [77:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [77:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [77:53] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertTrue' @ [78:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [78:24] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [78:38] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [78:52] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'getCertificateChain' @ [79:36] ==> public final fun getCertificateChain(p0: (String..String?)): (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [79:56] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_TLS' @ [79:70] ==> public final val CORDA_CLIENT_TLS: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertEquals' @ [80:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'certificateChain' @ [80:29] ==> val certificateChain: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore.<anonymous>[LocalVariableDescriptor]

'size' @ [80:46] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'assertEquals' @ [81:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [81:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'certificateChain' @ [81:114] ==> val certificateChain: (Array<(Certificate..Certificate?)>..Array<out (Certificate..Certificate?)>?) defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore.<anonymous>[LocalVariableDescriptor]

'map' @ [81:131] ==> public inline fun <T, R> Array<out (Certificate..Certificate?)>.map(transform: ((Certificate..Certificate?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.security.cert.Certificate..java.security.cert.Certificate?)
    <R> -> String

'it' @ [81:137] ==> value-parameter it: (Certificate..Certificate?) defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toX509CertHolder' @ [81:140] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'subject' @ [81:159] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'commonName' @ [81:167] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'trustStore' @ [84:9] ==> val trustStore: KeyStore defined in net.corda.node.utilities.registration.NetworkRegistrationHelperTest.buildKeyStore[LocalVariableDescriptor]

'run' @ [84:20] ==> @InlineOnly public inline fun <T, R> KeyStore.run(block: KeyStore.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KeyStore
    <R> -> Unit

'assertFalse' @ [85:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [85:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [85:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_CLIENT_CA' @ [85:53] ==> public final val CORDA_CLIENT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertFalse' @ [86:13] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [86:25] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [86:39] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_INTERMEDIATE_CA' @ [86:53] ==> public final val CORDA_INTERMEDIATE_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

'assertTrue' @ [87:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'containsAlias' @ [87:24] ==> public final fun containsAlias(p0: (String..String?)): Boolean defined in java.security.KeyStore[JavaMethodDescriptor]

'X509Utilities' @ [87:38] ==> public object X509Utilities defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'CORDA_ROOT_CA' @ [87:52] ==> public final val CORDA_ROOT_CA: String defined in net.corda.node.utilities.X509Utilities[DeserializedPropertyDescriptor]

