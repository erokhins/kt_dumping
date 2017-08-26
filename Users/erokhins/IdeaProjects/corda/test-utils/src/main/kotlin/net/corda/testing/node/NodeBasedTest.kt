'TestDependencyInjectionBase' @ [44:32] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[ClassConstructorDescriptorImpl]

'Rule' @ [45:5] ==> public constructor Rule() defined in org.junit.Rule[JavaClassConstructorDescriptor]

'JvmField' @ [46:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'TemporaryFolder' @ [47:22] ==> public constructor TemporaryFolder() defined in org.junit.rules.TemporaryFolder[JavaClassConstructorDescriptor]

'ArrayList' @ [49:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Node

'_networkMapNode' @ [52:38] ==> private final var _networkMapNode: Node? defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'startNetworkMapNode' @ [52:57] ==> public final fun startNetworkMapNode(legalName: X500Name = ..., platformVersion: Int = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., configOverrides: Map<String, Any> = ...): Node defined in net.corda.testing.node.NodeBasedTest[SimpleFunctionDescriptorImpl]

'setProperty' @ [55:16] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'DEBUG' @ [55:53] ==> public final val DEBUG: (Level..Level?) defined in org.apache.logging.log4j.Level[JavaPropertyDescriptor]

'name' @ [55:59] ==> public open fun name(): (String..String?) defined in org.apache.logging.log4j.Level[JavaMethodDescriptor]

'toLowerCase' @ [55:66] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'After' @ [62:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'newScheduledThreadPool' @ [64:42] ==> public open fun newScheduledThreadPool(p0: Int): (ScheduledExecutorService..ScheduledExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'nodes' @ [64:65] ==> private final val nodes: ArrayList<Node> defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'size' @ [64:71] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'nodes' @ [65:9] ==> private final val nodes: ArrayList<Node> defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'map' @ [65:15] ==> public inline fun <T, R> Iterable<Node>.map(transform: (Node) -> CordaFuture<Unit>): List<CordaFuture<Unit>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node
    <R> -> CordaFuture<Unit>

'shutdownExecutor' @ [65:21] ==> val shutdownExecutor: (ScheduledExecutorService..ScheduledExecutorService?) defined in net.corda.testing.node.NodeBasedTest.stopAllNodes[LocalVariableDescriptor]

'fork' @ [65:38] ==> public fun <V> Executor.fork(block: () -> Unit): CordaFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'it' @ [65:43] ==> value-parameter it: Node defined in net.corda.testing.node.NodeBasedTest.stopAllNodes.<anonymous>[ValueParameterDescriptorImpl]

'stop' @ [65:47] ==> public open fun stop(): Unit defined in net.corda.node.internal.Node[DeserializedSimpleFunctionDescriptor]

'transpose' @ [65:55] ==> public fun <V> Collection<CordaFuture<out Unit>>.transpose(): CordaFuture<List<Unit>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'getOrThrow' @ [65:67] ==> public fun <V> Future<List<Unit>>.getOrThrow(timeout: Duration? = ...): List<Unit> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<Unit>

'nodes' @ [67:34] ==> private final val nodes: ArrayList<Node> defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'flatMap' @ [67:40] ==> public inline fun <T, R> Iterable<Node>.flatMap(transform: (Node) -> Iterable<CordaFuture<Unit>?>): List<CordaFuture<Unit>?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node
    <R> -> CordaFuture<Unit>?

'listOf' @ [68:13] ==> public fun <T> listOf(vararg elements: CordaFuture<Unit>?): List<CordaFuture<Unit>?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<Unit>?

'it' @ [69:21] ==> value-parameter it: Node defined in net.corda.testing.node.NodeBasedTest.stopAllNodes.<anonymous>[ValueParameterDescriptorImpl]

'configuration' @ [69:24] ==> public open val configuration: FullNodeConfiguration defined in net.corda.node.internal.Node[DeserializedPropertyDescriptor]

'p2pAddress' @ [69:38] ==> @OldConfig public final val p2pAddress: NetworkHostAndPort defined in net.corda.node.services.config.FullNodeConfiguration[DeserializedPropertyDescriptor]

'let' @ [69:49] ==> @InlineOnly public inline fun <T, R> NetworkHostAndPort.let(block: (NetworkHostAndPort) -> CordaFuture<Unit>): CordaFuture<Unit> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort
    <R> -> CordaFuture<Unit>

'addressMustNotBeBoundFuture' @ [69:55] ==> public fun addressMustNotBeBoundFuture(executorService: ScheduledExecutorService, hostAndPort: NetworkHostAndPort): CordaFuture<Unit> defined in net.corda.testing.driver in file Driver.kt[SimpleFunctionDescriptorImpl]

'shutdownExecutor' @ [69:83] ==> val shutdownExecutor: (ScheduledExecutorService..ScheduledExecutorService?) defined in net.corda.testing.node.NodeBasedTest.stopAllNodes[LocalVariableDescriptor]

'it' @ [69:101] ==> value-parameter it: NetworkHostAndPort defined in net.corda.testing.node.NodeBasedTest.stopAllNodes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [70:21] ==> value-parameter it: Node defined in net.corda.testing.node.NodeBasedTest.stopAllNodes.<anonymous>[ValueParameterDescriptorImpl]

'configuration' @ [70:24] ==> public open val configuration: FullNodeConfiguration defined in net.corda.node.internal.Node[DeserializedPropertyDescriptor]

'rpcAddress' @ [70:38] ==> public final val rpcAddress: NetworkHostAndPort? defined in net.corda.node.services.config.FullNodeConfiguration[DeserializedPropertyDescriptor]

'let' @ [70:50] ==> @InlineOnly public inline fun <T, R> NetworkHostAndPort.let(block: (NetworkHostAndPort) -> CordaFuture<Unit>): CordaFuture<Unit> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort
    <R> -> CordaFuture<Unit>

'addressMustNotBeBoundFuture' @ [70:56] ==> public fun addressMustNotBeBoundFuture(executorService: ScheduledExecutorService, hostAndPort: NetworkHostAndPort): CordaFuture<Unit> defined in net.corda.testing.driver in file Driver.kt[SimpleFunctionDescriptorImpl]

'shutdownExecutor' @ [70:84] ==> val shutdownExecutor: (ScheduledExecutorService..ScheduledExecutorService?) defined in net.corda.testing.node.NodeBasedTest.stopAllNodes[LocalVariableDescriptor]

'it' @ [70:102] ==> value-parameter it: NetworkHostAndPort defined in net.corda.testing.node.NodeBasedTest.stopAllNodes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filterNotNull' @ [72:11] ==> public fun <T : Any> Iterable<CordaFuture<Unit>?>.filterNotNull(): List<CordaFuture<Unit>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CordaFuture<Unit>

'nodes' @ [73:9] ==> private final val nodes: ArrayList<Node> defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'clear' @ [73:15] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'_networkMapNode' @ [74:9] ==> private final var _networkMapNode: Node? defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'portNotBoundChecks' @ [75:9] ==> val portNotBoundChecks: List<CordaFuture<Unit>> defined in net.corda.testing.node.NodeBasedTest.stopAllNodes[LocalVariableDescriptor]

'transpose' @ [75:28] ==> public fun <V> Collection<CordaFuture<out Unit>>.transpose(): CordaFuture<List<Unit>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit

'getOrThrow' @ [75:40] ==> public fun <V> Future<List<Unit>>.getOrThrow(timeout: Duration? = ...): List<Unit> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<Unit>

'DUMMY_MAP' @ [82:51] ==> public val DUMMY_MAP: Party defined in net.corda.testing in file TestConstants.kt[PropertyDescriptorImpl]

'name' @ [82:61] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'emptySet' @ [84:68] ==> public fun <T> emptySet(): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'emptyList' @ [85:52] ==> public fun <T> emptyList(): List<User> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'emptyMap' @ [86:65] ==> public fun <K, V> emptyMap(): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'check' @ [87:9] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'_networkMapNode' @ [87:15] ==> private final var _networkMapNode: Node? defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'startNodeInternal' @ [88:16] ==> private final fun startNodeInternal(legalName: X500Name, platformVersion: Int, advertisedServices: Set<ServiceInfo>, rpcUsers: List<User>, configOverrides: Map<String, Any>): Node defined in net.corda.testing.node.NodeBasedTest[SimpleFunctionDescriptorImpl]

'legalName' @ [88:34] ==> value-parameter legalName: X500Name = ... defined in net.corda.testing.node.NodeBasedTest.startNetworkMapNode[ValueParameterDescriptorImpl]

'platformVersion' @ [88:45] ==> value-parameter platformVersion: Int = ... defined in net.corda.testing.node.NodeBasedTest.startNetworkMapNode[ValueParameterDescriptorImpl]

'advertisedServices' @ [88:62] ==> value-parameter advertisedServices: Set<ServiceInfo> = ... defined in net.corda.testing.node.NodeBasedTest.startNetworkMapNode[ValueParameterDescriptorImpl]

'rpcUsers' @ [88:82] ==> value-parameter rpcUsers: List<User> = ... defined in net.corda.testing.node.NodeBasedTest.startNetworkMapNode[ValueParameterDescriptorImpl]

'configOverrides' @ [88:92] ==> value-parameter configOverrides: Map<String, Any> = ... defined in net.corda.testing.node.NodeBasedTest.startNetworkMapNode[ValueParameterDescriptorImpl]

'apply' @ [88:109] ==> @InlineOnly public inline fun <T> Node.apply(block: Node.() -> Unit): Node defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node

'_networkMapNode' @ [89:13] ==> private final var _networkMapNode: Node? defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'this' @ [89:31] ==> <this> defined in net.corda.testing.node.NodeBasedTest.startNetworkMapNode.<anonymous>[ReceiverParameterDescriptorImpl]

'emptySet' @ [95:58] ==> public fun <T> emptySet(): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'emptyList' @ [96:42] ==> public fun <T> emptyList(): List<User> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'emptyMap' @ [97:55] ==> public fun <K, V> emptyMap(): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'startNodeInternal' @ [98:20] ==> private final fun startNodeInternal(legalName: X500Name, platformVersion: Int, advertisedServices: Set<ServiceInfo>, rpcUsers: List<User>, configOverrides: Map<String, Any>): Node defined in net.corda.testing.node.NodeBasedTest[SimpleFunctionDescriptorImpl]

'legalName' @ [99:17] ==> value-parameter legalName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNode[ValueParameterDescriptorImpl]

'platformVersion' @ [100:17] ==> value-parameter platformVersion: Int = ... defined in net.corda.testing.node.NodeBasedTest.startNode[ValueParameterDescriptorImpl]

'advertisedServices' @ [101:17] ==> value-parameter advertisedServices: Set<ServiceInfo> = ... defined in net.corda.testing.node.NodeBasedTest.startNode[ValueParameterDescriptorImpl]

'rpcUsers' @ [102:17] ==> value-parameter rpcUsers: List<User> = ... defined in net.corda.testing.node.NodeBasedTest.startNode[ValueParameterDescriptorImpl]

'mapOf' @ [103:17] ==> public fun <K, V> mapOf(pair: Pair<String, Map<String, String>>): Map<String, Map<String, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Map<String, String>

'to' @ [104:25] ==> public infix fun <A, B> String.to(that: Map<String, String>): Pair<String, Map<String, String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, String>

'mapOf' @ [104:48] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [105:33] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'networkMapNode' @ [105:46] ==> public final val networkMapNode: Node defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'configuration' @ [105:61] ==> public open val configuration: FullNodeConfiguration defined in net.corda.node.internal.Node[DeserializedPropertyDescriptor]

'p2pAddress' @ [105:75] ==> @OldConfig public final val p2pAddress: NetworkHostAndPort defined in net.corda.node.services.config.FullNodeConfiguration[DeserializedPropertyDescriptor]

'toString' @ [105:86] ==> public open fun toString(): String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedSimpleFunctionDescriptor]

'to' @ [106:33] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'networkMapNode' @ [106:48] ==> public final val networkMapNode: Node defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'info' @ [106:63] ==> public final lateinit var info: NodeInfo defined in net.corda.node.internal.Node[DeserializedPropertyDescriptor]

'legalIdentity' @ [106:68] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [106:82] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [106:87] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'configOverrides' @ [108:21] ==> value-parameter configOverrides: Map<String, Any> = ... defined in net.corda.testing.node.NodeBasedTest.startNode[ValueParameterDescriptorImpl]

'node' @ [110:16] ==> val node: Node defined in net.corda.testing.node.NodeBasedTest.startNode[LocalVariableDescriptor]

'networkMapRegistrationFuture' @ [110:21] ==> public final val networkMapRegistrationFuture: CordaFuture<Unit> defined in net.corda.node.internal.Node[DeserializedPropertyDescriptor]

'map' @ [110:50] ==> public fun <V, W> CordaFuture<out Unit>.map(transform: (Unit) -> Node): CordaFuture<Node> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit
    <W> -> Node

'node' @ [110:56] ==> val node: Node defined in net.corda.testing.node.NodeBasedTest.startNode[LocalVariableDescriptor]

'RaftValidatingNotaryService' @ [115:55] ==> public companion object defined in net.corda.node.services.transactions.RaftValidatingNotaryService[FakeCallableDescriptorForObject]

'type' @ [115:83] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.RaftValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'ServiceIdentityGenerator' @ [116:9] ==> public object ServiceIdentityGenerator defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'generateToDisk' @ [116:34] ==> public final fun generateToDisk(dirs: List<Path>, serviceId: String, serviceName: X500Name, threshold: Int = ...): Party defined in net.corda.node.utilities.ServiceIdentityGenerator[DeserializedSimpleFunctionDescriptor]

'until' @ [117:18] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'clusterSize' @ [117:26] ==> value-parameter clusterSize: Int defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'map' @ [117:39] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> Path): List<Path> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Path

'baseDirectory' @ [117:45] ==> protected final fun baseDirectory(legalName: X500Name): Path defined in net.corda.testing.node.NodeBasedTest[SimpleFunctionDescriptorImpl]

'notaryName' @ [117:59] ==> value-parameter notaryName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'appendToCommonName' @ [117:70] ==> public fun X500Name.appendToCommonName(commonName: String): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'it' @ [117:92] ==> value-parameter it: Int defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster.<anonymous>[ValueParameterDescriptorImpl]

'serviceType' @ [118:17] ==> value-parameter serviceType: ServiceType = ... defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'id' @ [118:29] ==> public final val id: String defined in net.corda.core.node.services.ServiceType[DeserializedPropertyDescriptor]

'notaryName' @ [119:17] ==> value-parameter notaryName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'ServiceInfo' @ [121:27] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'serviceType' @ [121:39] ==> value-parameter serviceType: ServiceType = ... defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'notaryName' @ [121:52] ==> value-parameter notaryName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'getFreeLocalPorts' @ [122:29] ==> public fun getFreeLocalPorts(hostName: String, numberToAlloc: Int): List<NetworkHostAndPort> defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'clusterSize' @ [122:60] ==> value-parameter clusterSize: Int defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'map' @ [122:73] ==> public inline fun <T, R> Iterable<NetworkHostAndPort>.map(transform: (NetworkHostAndPort) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort
    <R> -> String

'it' @ [122:79] ==> value-parameter it: NetworkHostAndPort defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [122:82] ==> public open fun toString(): String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedSimpleFunctionDescriptor]

'startNode' @ [124:32] ==> public final fun startNode(legalName: X500Name, platformVersion: Int = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., configOverrides: Map<String, Any> = ...): CordaFuture<Node> defined in net.corda.testing.node.NodeBasedTest[SimpleFunctionDescriptorImpl]

'getX509Name' @ [125:17] ==> @JvmOverloads public fun getX509Name(myLegalName: String, nearestCity: String, email: String, country: String? = ...): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'notaryName' @ [125:32] ==> value-parameter notaryName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'commonName' @ [125:43] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'setOf' @ [126:38] ==> public fun <T> setOf(element: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'serviceInfo' @ [126:44] ==> val serviceInfo: ServiceInfo defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[LocalVariableDescriptor]

'mapOf' @ [127:35] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [127:41] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'nodeAddresses' @ [127:64] ==> val nodeAddresses: List<String> defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[LocalVariableDescriptor]

'to' @ [128:21] ==> public infix fun <A, B> String.to(that: Map<String, String>): Pair<String, Map<String, String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, String>

'mapOf' @ [128:35] ==> public fun <K, V> mapOf(pair: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [128:41] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'if (clusterSize > 1) "${notaryName.commonName}0".replace(Regex("[^0-9A-Za-z]+"),"") else ""' @ [128:68] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'clusterSize' @ [128:72] ==> value-parameter clusterSize: Int defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'notaryName' @ [128:92] ==> value-parameter notaryName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'commonName' @ [128:103] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'replace' @ [128:117] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Regex' @ [128:125] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'until' @ [130:38] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'clusterSize' @ [130:46] ==> value-parameter clusterSize: Int defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'map' @ [130:59] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> CordaFuture<Node>): List<CordaFuture<Node>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> CordaFuture<Node>

'startNode' @ [131:13] ==> public final fun startNode(legalName: X500Name, platformVersion: Int = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., configOverrides: Map<String, Any> = ...): CordaFuture<Node> defined in net.corda.testing.node.NodeBasedTest[SimpleFunctionDescriptorImpl]

'getX509Name' @ [132:21] ==> @JvmOverloads public fun getX509Name(myLegalName: String, nearestCity: String, email: String, country: String? = ...): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'notaryName' @ [132:36] ==> value-parameter notaryName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'commonName' @ [132:47] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'it' @ [132:60] ==> value-parameter it: Int defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster.<anonymous>[ValueParameterDescriptorImpl]

'setOf' @ [133:42] ==> public fun <T> setOf(element: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'serviceInfo' @ [133:48] ==> val serviceInfo: ServiceInfo defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[LocalVariableDescriptor]

'mapOf' @ [134:39] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, Any>): Map<String, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [135:29] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'nodeAddresses' @ [135:52] ==> val nodeAddresses: List<String> defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[LocalVariableDescriptor]

'it' @ [135:66] ==> value-parameter it: Int defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [136:29] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'listOf' @ [136:57] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'nodeAddresses' @ [136:64] ==> val nodeAddresses: List<String> defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[LocalVariableDescriptor]

'to' @ [137:29] ==> public infix fun <A, B> String.to(that: Map<String, String>): Pair<String, Map<String, String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Map<String, String>

'mapOf' @ [137:43] ==> public fun <K, V> mapOf(pair: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [137:49] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'notaryName' @ [137:79] ==> value-parameter notaryName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[ValueParameterDescriptorImpl]

'commonName' @ [137:90] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'it' @ [137:102] ==> value-parameter it: Int defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [137:106] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Regex' @ [137:114] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'remainingNodesFutures' @ [140:16] ==> val remainingNodesFutures: List<CordaFuture<Node>> defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[LocalVariableDescriptor]

'transpose' @ [140:38] ==> public fun <V> Collection<CordaFuture<out Node>>.transpose(): CordaFuture<List<Node>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Node

'flatMap' @ [140:50] ==> public fun <V, W> CordaFuture<out List<Node>>.flatMap(transform: (List<Node>) -> CordaFuture<out List<Node>>): CordaFuture<List<Node>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<Node>
    <W> -> List<Node>

'masterNodeFuture' @ [141:13] ==> val masterNodeFuture: CordaFuture<Node> defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster[LocalVariableDescriptor]

'map' @ [141:30] ==> public fun <V, W> CordaFuture<out Node>.map(transform: (Node) -> List<Node>): CordaFuture<List<Node>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Node
    <W> -> List<Node>

'listOf' @ [141:50] ==> public fun <T> listOf(element: Node): List<Node> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Node

'masterNode' @ [141:57] ==> value-parameter masterNode: Node defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'remainingNodes' @ [141:71] ==> value-parameter remainingNodes: List<Node> defined in net.corda.testing.node.NodeBasedTest.startNotaryCluster.<anonymous>[ValueParameterDescriptorImpl]

'tempFolder' @ [145:56] ==> @Rule @JvmField public final val tempFolder: TemporaryFolder defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'root' @ [145:67] ==> public final val TemporaryFolder.root: (File..File?)[MyPropertyDescriptor]

'toPath' @ [145:72] ==> public open fun toPath(): (Path..Path?) defined in java.io.File[JavaMethodDescriptor]

'legalName' @ [145:83] ==> value-parameter legalName: X500Name defined in net.corda.testing.node.NodeBasedTest.baseDirectory[ValueParameterDescriptorImpl]

'commonName' @ [145:93] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'replace' @ [145:104] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'WHITESPACE' @ [145:112] ==> public val WHITESPACE: Regex defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'baseDirectory' @ [152:29] ==> protected final fun baseDirectory(legalName: X500Name): Path defined in net.corda.testing.node.NodeBasedTest[SimpleFunctionDescriptorImpl]

'legalName' @ [152:43] ==> value-parameter legalName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[ValueParameterDescriptorImpl]

'createDirectories' @ [152:54] ==> public fun Path.createDirectories(vararg attrs: FileAttribute<*>): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'getFreeLocalPorts' @ [153:25] ==> public fun getFreeLocalPorts(hostName: String, numberToAlloc: Int): List<NetworkHostAndPort> defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'ConfigHelper' @ [154:22] ==> public object ConfigHelper defined in net.corda.node.services.config[FakeCallableDescriptorForObject]

'loadConfig' @ [154:35] ==> public final fun loadConfig(baseDirectory: Path, configFile: Path = ..., allowMissingConfig: Boolean = ..., configOverrides: Config = ...): Config defined in net.corda.node.services.config.ConfigHelper[DeserializedSimpleFunctionDescriptor]

'baseDirectory' @ [155:33] ==> val baseDirectory: Path defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

'configOf' @ [157:35] ==> public fun configOf(vararg pairs: Pair<String, Any?>): Config defined in net.corda.node.services.config[DeserializedSimpleFunctionDescriptor]

'to' @ [158:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'legalName' @ [158:42] ==> value-parameter legalName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[ValueParameterDescriptorImpl]

'toString' @ [158:52] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'to' @ [159:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'localPort' @ [159:41] ==> val localPort: List<NetworkHostAndPort> defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

'toString' @ [159:54] ==> public open fun toString(): String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedSimpleFunctionDescriptor]

'to' @ [160:25] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'localPort' @ [160:41] ==> val localPort: List<NetworkHostAndPort> defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

'toString' @ [160:54] ==> public open fun toString(): String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedSimpleFunctionDescriptor]

'to' @ [161:25] ==> public infix fun <A, B> String.to(that: List<String>): Pair<String, List<String>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<String>

'advertisedServices' @ [161:56] ==> value-parameter advertisedServices: Set<ServiceInfo> defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[ValueParameterDescriptorImpl]

'map' @ [161:75] ==> public inline fun <T, R> Iterable<ServiceInfo>.map(transform: (ServiceInfo) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo
    <R> -> String

'it' @ [161:81] ==> value-parameter it: ServiceInfo defined in net.corda.testing.node.NodeBasedTest.startNodeInternal.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [161:84] ==> public open fun toString(): String defined in net.corda.core.node.services.ServiceInfo[DeserializedSimpleFunctionDescriptor]

'to' @ [162:25] ==> public infix fun <A, B> String.to(that: List<Map<String, Any>>): Pair<String, List<Map<String, Any>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> List<Map<String, Any>>

'rpcUsers' @ [162:39] ==> value-parameter rpcUsers: List<User> defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[ValueParameterDescriptorImpl]

'map' @ [162:48] ==> public inline fun <T, R> Iterable<User>.map(transform: (User) -> Map<String, Any>): List<Map<String, Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User
    <R> -> Map<String, Any>

'it' @ [162:54] ==> value-parameter it: User defined in net.corda.testing.node.NodeBasedTest.startNodeInternal.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [162:57] ==> public final fun toMap(): Map<String, Any> defined in net.corda.nodeapi.User[DeserializedSimpleFunctionDescriptor]

'configOverrides' @ [163:21] ==> value-parameter configOverrides: Map<String, Any> defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[ValueParameterDescriptorImpl]

'config' @ [166:28] ==> val config: Config defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

'parseAs' @ [166:35] ==> public inline fun <reified T : Any> Config.parseAs(): FullNodeConfiguration defined in net.corda.nodeapi.config[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FullNodeConfiguration

'Node' @ [167:20] ==> public constructor Node(configuration: FullNodeConfiguration, advertisedServices: Set<ServiceInfo>, versionInfo: VersionInfo, initialiseSerialization: Boolean = ...) defined in net.corda.node.internal.Node[DeserializedClassConstructorDescriptor]

'parsedConfig' @ [167:25] ==> val parsedConfig: FullNodeConfiguration defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

'parsedConfig' @ [167:39] ==> val parsedConfig: FullNodeConfiguration defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

'calculateServices' @ [167:52] ==> public final fun calculateServices(): Set<ServiceInfo> defined in net.corda.node.services.config.FullNodeConfiguration[DeserializedSimpleFunctionDescriptor]

'MOCK_VERSION_INFO' @ [167:73] ==> public val MOCK_VERSION_INFO: VersionInfo defined in net.corda.testing.node in file MockServices.kt[PropertyDescriptorImpl]

'copy' @ [167:91] ==> public final fun copy(platformVersion: Int = ..., releaseVersion: String = ..., revision: String = ..., vendor: String = ...): VersionInfo defined in net.corda.node.VersionInfo[DeserializedSimpleFunctionDescriptor]

'platformVersion' @ [167:114] ==> value-parameter platformVersion: Int defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[ValueParameterDescriptorImpl]

'node' @ [169:9] ==> val node: Node defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

'start' @ [169:14] ==> public open fun start(): Unit defined in net.corda.node.internal.Node[DeserializedSimpleFunctionDescriptor]

'nodes' @ [170:9] ==> private final val nodes: ArrayList<Node> defined in net.corda.testing.node.NodeBasedTest[PropertyDescriptorImpl]

'node' @ [170:18] ==> val node: Node defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

'thread' @ [171:9] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'legalName' @ [171:23] ==> value-parameter legalName: X500Name defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[ValueParameterDescriptorImpl]

'commonName' @ [171:33] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'node' @ [172:13] ==> val node: Node defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

'run' @ [172:18] ==> public final fun run(): Unit defined in net.corda.node.internal.Node[DeserializedSimpleFunctionDescriptor]

'node' @ [174:16] ==> val node: Node defined in net.corda.testing.node.NodeBasedTest.startNodeInternal[LocalVariableDescriptor]

