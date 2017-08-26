'User' @ [42:24] ==> public constructor User(username: String, password: String, permissions: Set<String>) defined in net.corda.nodeapi.User[DeserializedClassConstructorDescriptor]

'setOf' @ [42:60] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'startFlowPermission' @ [43:13] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> CashPaymentFlow

'User' @ [45:27] ==> public constructor User(username: String, password: String, permissions: Set<String>) defined in net.corda.nodeapi.User[DeserializedClassConstructorDescriptor]

'setOf' @ [45:65] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'startFlowPermission' @ [46:13] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> CashIssueAndPaymentFlow

'startFlowPermission' @ [47:13] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> CashPaymentFlow

'startFlowPermission' @ [48:13] ==> public inline fun <reified P : FlowLogic<*>> startFlowPermission(): String defined in net.corda.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified P : FlowLogic<*>> -> CashExitFlow

'ArrayList' @ [57:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CordaRPCConnection

'HashMap' @ [58:27] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Currency
    <V : (Any..Any?)> -> CordaRPCOps

'ArrayList' @ [59:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<Party, CordaRPCOps>

'startDemoNodes' @ [62:9] ==> private final fun startDemoNodes(): Unit defined in net.corda.explorer.ExplorerSimulation[SimpleFunctionDescriptorImpl]

'println' @ [66:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'RPCConnections' @ [67:9] ==> private final val RPCConnections: ArrayList<CordaRPCConnection> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'forEach' @ [67:24] ==> @HidesMembers public inline fun <T> Iterable<CordaRPCConnection>.forEach(action: (CordaRPCConnection) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaRPCConnection

'it' @ [67:34] ==> value-parameter it: CordaRPCConnection defined in net.corda.explorer.ExplorerSimulation.onEnd.<anonymous>[ValueParameterDescriptorImpl]

'close' @ [67:37] ==> public open fun close(): Unit defined in net.corda.client.rpc.CordaRPCConnection[DeserializedSimpleFunctionDescriptor]

'Incremental' @ [71:45] ==> public constructor Incremental(startingPort: Int) defined in net.corda.testing.driver.PortAllocation.Incremental[DeserializedClassConstructorDescriptor]

'driver' @ [72:9] ==> @JvmOverloads public fun <A> driver(isDebug: Boolean = ..., driverDirectory: Path = ..., portAllocation: PortAllocation = ..., debugPortAllocation: PortAllocation = ..., systemProperties: Map<String, String> = ..., useTestClock: Boolean = ..., initialiseSerialization: Boolean = ..., networkMapStartStrategy: NetworkMapStartStrategy = ..., startNodesInProcess: Boolean = ..., dsl: DriverDSLExposedInterface.() -> Unit): Unit defined in net.corda.testing.driver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unit

'portAllocation' @ [72:33] ==> val portAllocation: PortAllocation.Incremental defined in net.corda.explorer.ExplorerSimulation.startDemoNodes[LocalVariableDescriptor]

'startNode' @ [74:26] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [74:36] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [74:49] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'setOf' @ [74:76] ==> public fun <T> setOf(element: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'ServiceInfo' @ [74:82] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'type' @ [74:114] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[DeserializedPropertyDescriptor]

'mapOf' @ [75:39] ==> public fun <K, V> mapOf(pair: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [75:45] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'startNode' @ [76:25] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'ALICE' @ [76:35] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [76:41] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'arrayListOf' @ [76:58] ==> public fun <T> arrayListOf(vararg elements: User): ArrayList<User> /* = ArrayList<User> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'user' @ [76:70] ==> private final val user: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'setOf' @ [77:42] ==> public fun <T> setOf(element: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'ServiceInfo' @ [77:48] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'corda' @ [77:72] ==> public final val corda: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[DeserializedPropertyDescriptor]

'getSubType' @ [77:78] ==> public final fun getSubType(subTypeId: String): ServiceType defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'mapOf' @ [78:39] ==> public fun <K, V> mapOf(pair: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [78:45] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'startNode' @ [79:23] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'BOB' @ [79:33] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [79:37] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'arrayListOf' @ [79:54] ==> public fun <T> arrayListOf(vararg elements: User): ArrayList<User> /* = ArrayList<User> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'user' @ [79:66] ==> private final val user: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'setOf' @ [80:42] ==> public fun <T> setOf(element: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'ServiceInfo' @ [80:48] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'corda' @ [80:72] ==> public final val corda: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[DeserializedPropertyDescriptor]

'getSubType' @ [80:78] ==> public final fun getSubType(subTypeId: String): ServiceType defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'mapOf' @ [81:39] ==> public fun <K, V> mapOf(pair: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [81:45] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'X500Name' @ [82:30] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'X500Name' @ [83:31] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'startNode' @ [84:29] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'ukBankName' @ [84:39] ==> val ukBankName: X500Name defined in net.corda.explorer.ExplorerSimulation.startDemoNodes.<anonymous>[LocalVariableDescriptor]

'arrayListOf' @ [84:62] ==> public fun <T> arrayListOf(vararg elements: User): ArrayList<User> /* = ArrayList<User> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'manager' @ [84:74] ==> private final val manager: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'setOf' @ [85:42] ==> public fun <T> setOf(element: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'ServiceInfo' @ [85:48] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'corda' @ [85:72] ==> public final val corda: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[DeserializedPropertyDescriptor]

'getSubType' @ [85:78] ==> public final fun getSubType(subTypeId: String): ServiceType defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'mapOf' @ [86:39] ==> public fun <K, V> mapOf(pair: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [86:45] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'startNode' @ [87:29] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'usaBankName' @ [87:39] ==> val usaBankName: X500Name defined in net.corda.explorer.ExplorerSimulation.startDemoNodes.<anonymous>[LocalVariableDescriptor]

'arrayListOf' @ [87:63] ==> public fun <T> arrayListOf(vararg elements: User): ArrayList<User> /* = ArrayList<User> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'manager' @ [87:75] ==> private final val manager: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'setOf' @ [88:42] ==> public fun <T> setOf(element: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'ServiceInfo' @ [88:48] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'corda' @ [88:72] ==> public final val corda: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[DeserializedPropertyDescriptor]

'getSubType' @ [88:78] ==> public final fun getSubType(subTypeId: String): ServiceType defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'mapOf' @ [89:39] ==> public fun <K, V> mapOf(pair: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [89:45] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'notaryNode' @ [91:13] ==> private final lateinit var notaryNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'notary' @ [91:26] ==> val notary: CordaFuture<NodeHandle> defined in net.corda.explorer.ExplorerSimulation.startDemoNodes.<anonymous>[LocalVariableDescriptor]

'get' @ [91:33] ==> public abstract fun get(): (NodeHandle..NodeHandle?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'aliceNode' @ [92:13] ==> private final lateinit var aliceNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'alice' @ [92:25] ==> val alice: CordaFuture<NodeHandle> defined in net.corda.explorer.ExplorerSimulation.startDemoNodes.<anonymous>[LocalVariableDescriptor]

'get' @ [92:31] ==> public abstract fun get(): (NodeHandle..NodeHandle?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'bobNode' @ [93:13] ==> private final lateinit var bobNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'bob' @ [93:23] ==> val bob: CordaFuture<NodeHandle> defined in net.corda.explorer.ExplorerSimulation.startDemoNodes.<anonymous>[LocalVariableDescriptor]

'get' @ [93:27] ==> public abstract fun get(): (NodeHandle..NodeHandle?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'issuerNodeGBP' @ [94:13] ==> private final lateinit var issuerNodeGBP: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'issuerGBP' @ [94:29] ==> val issuerGBP: CordaFuture<NodeHandle> defined in net.corda.explorer.ExplorerSimulation.startDemoNodes.<anonymous>[LocalVariableDescriptor]

'get' @ [94:39] ==> public abstract fun get(): (NodeHandle..NodeHandle?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'issuerNodeUSD' @ [95:13] ==> private final lateinit var issuerNodeUSD: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'issuerUSD' @ [95:29] ==> val issuerUSD: CordaFuture<NodeHandle> defined in net.corda.explorer.ExplorerSimulation.startDemoNodes.<anonymous>[LocalVariableDescriptor]

'get' @ [95:39] ==> public abstract fun get(): (NodeHandle..NodeHandle?) defined in net.corda.core.concurrent.CordaFuture[JavaMethodDescriptor]

'arrayOf' @ [97:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: NodeHandle): Array<NodeHandle> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> NodeHandle

'notaryNode' @ [97:21] ==> private final lateinit var notaryNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'aliceNode' @ [97:33] ==> private final lateinit var aliceNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'bobNode' @ [97:44] ==> private final lateinit var bobNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'issuerNodeGBP' @ [97:53] ==> private final lateinit var issuerNodeGBP: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'issuerNodeUSD' @ [97:68] ==> private final lateinit var issuerNodeUSD: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'forEach' @ [97:83] ==> public inline fun <T> Array<out NodeHandle>.forEach(action: (NodeHandle) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeHandle

'println' @ [98:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [98:28] ==> value-parameter it: NodeHandle defined in net.corda.explorer.ExplorerSimulation.startDemoNodes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nodeInfo' @ [98:31] ==> public abstract val nodeInfo: NodeInfo defined in net.corda.testing.driver.NodeHandle[DeserializedPropertyDescriptor]

'legalIdentity' @ [98:40] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'it' @ [98:68] ==> value-parameter it: NodeHandle defined in net.corda.explorer.ExplorerSimulation.startDemoNodes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'configuration' @ [98:71] ==> public abstract val configuration: FullNodeConfiguration defined in net.corda.testing.driver.NodeHandle[DeserializedPropertyDescriptor]

'rpcAddress' @ [98:85] ==> public final val rpcAddress: NetworkHostAndPort? defined in net.corda.node.services.config.FullNodeConfiguration[DeserializedPropertyDescriptor]

'when {
                options.has("S") -> startNormalSimulation()
                options.has("F") -> startErrorFlowsSimulation()
            }' @ [101:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'options' @ [102:17] ==> public final val options: OptionSet defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'has' @ [102:25] ==> public open fun has(p0: (String..String?)): Boolean defined in joptsimple.OptionSet[JavaMethodDescriptor]

'startNormalSimulation' @ [102:37] ==> private final fun startNormalSimulation(): Unit defined in net.corda.explorer.ExplorerSimulation[SimpleFunctionDescriptorImpl]

'options' @ [103:17] ==> public final val options: OptionSet defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'has' @ [103:25] ==> public open fun has(p0: (String..String?)): Boolean defined in joptsimple.OptionSet[JavaMethodDescriptor]

'startErrorFlowsSimulation' @ [103:37] ==> private final fun startErrorFlowsSimulation(): Unit defined in net.corda.explorer.ExplorerSimulation[SimpleFunctionDescriptorImpl]

'waitForAllNodesToFinish' @ [106:13] ==> public abstract fun waitForAllNodesToFinish(): Unit defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'aliceNode' @ [112:27] ==> private final lateinit var aliceNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'rpcClientToNode' @ [112:37] ==> public final fun rpcClientToNode(): CordaRPCClient defined in net.corda.testing.driver.NodeHandle[DeserializedSimpleFunctionDescriptor]

'aliceClient' @ [113:31] ==> val aliceClient: CordaRPCClient defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'start' @ [113:43] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'user' @ [113:49] ==> private final val user: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'username' @ [113:54] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'user' @ [113:64] ==> private final val user: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'password' @ [113:69] ==> public final val password: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'aliceConnection' @ [114:24] ==> val aliceConnection: CordaRPCConnection defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'proxy' @ [114:40] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'bobNode' @ [116:25] ==> private final lateinit var bobNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'rpcClientToNode' @ [116:33] ==> public final fun rpcClientToNode(): CordaRPCClient defined in net.corda.testing.driver.NodeHandle[DeserializedSimpleFunctionDescriptor]

'bobClient' @ [117:29] ==> val bobClient: CordaRPCClient defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'start' @ [117:39] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'user' @ [117:45] ==> private final val user: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'username' @ [117:50] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'user' @ [117:60] ==> private final val user: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'password' @ [117:65] ==> public final val password: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'bobConnection' @ [118:22] ==> val bobConnection: CordaRPCConnection defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'proxy' @ [118:36] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'issuerNodeGBP' @ [120:31] ==> private final lateinit var issuerNodeGBP: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'rpcClientToNode' @ [120:45] ==> public final fun rpcClientToNode(): CordaRPCClient defined in net.corda.testing.driver.NodeHandle[DeserializedSimpleFunctionDescriptor]

'issuerClientGBP' @ [121:35] ==> val issuerClientGBP: CordaRPCClient defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'start' @ [121:51] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'manager' @ [121:57] ==> private final val manager: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'username' @ [121:65] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'manager' @ [121:75] ==> private final val manager: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'password' @ [121:83] ==> public final val password: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'issuerGBPConnection' @ [122:28] ==> val issuerGBPConnection: CordaRPCConnection defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'proxy' @ [122:48] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'issuerNodeUSD' @ [124:31] ==> private final lateinit var issuerNodeUSD: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'rpcClientToNode' @ [124:45] ==> public final fun rpcClientToNode(): CordaRPCClient defined in net.corda.testing.driver.NodeHandle[DeserializedSimpleFunctionDescriptor]

'issuerClientUSD' @ [125:34] ==> val issuerClientUSD: CordaRPCClient defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'start' @ [125:50] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'manager' @ [125:56] ==> private final val manager: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'username' @ [125:64] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'manager' @ [125:74] ==> private final val manager: User defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'password' @ [125:82] ==> public final val password: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'issuerUSDConnection' @ [126:28] ==> val issuerUSDConnection: CordaRPCConnection defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'proxy' @ [126:48] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'RPCConnections' @ [128:9] ==> private final val RPCConnections: ArrayList<CordaRPCConnection> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'addAll' @ [128:24] ==> public open fun addAll(elements: Collection<CordaRPCConnection>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'listOf' @ [128:31] ==> public fun <T> listOf(vararg elements: CordaRPCConnection): List<CordaRPCConnection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaRPCConnection

'aliceConnection' @ [128:38] ==> val aliceConnection: CordaRPCConnection defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'bobConnection' @ [128:55] ==> val bobConnection: CordaRPCConnection defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'issuerGBPConnection' @ [128:70] ==> val issuerGBPConnection: CordaRPCConnection defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'issuerUSDConnection' @ [128:91] ==> val issuerUSDConnection: CordaRPCConnection defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'issuers' @ [129:9] ==> private final val issuers: HashMap<Currency, CordaRPCOps> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'putAll' @ [129:17] ==> public open fun putAll(from: Map<out Currency, CordaRPCOps>): Unit defined in java.util.HashMap[JavaMethodDescriptor]

'mapOf' @ [129:24] ==> public fun <K, V> mapOf(vararg pairs: Pair<Currency, CordaRPCOps>): Map<Currency, CordaRPCOps> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Currency
    <V> -> CordaRPCOps

'USD' @ [129:30] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerRPCUSD' @ [129:37] ==> val issuerRPCUSD: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'GBP' @ [129:51] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'issuerRPCGBP' @ [129:58] ==> val issuerRPCGBP: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'parties' @ [131:9] ==> private final val parties: ArrayList<Pair<Party, CordaRPCOps>> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'addAll' @ [131:17] ==> public open fun addAll(elements: Collection<Pair<Party, CordaRPCOps>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'listOf' @ [131:24] ==> public fun <T> listOf(vararg elements: Pair<Party, CordaRPCOps>): List<Pair<Party, CordaRPCOps>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Party, CordaRPCOps>

'aliceNode' @ [131:31] ==> private final lateinit var aliceNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'nodeInfo' @ [131:41] ==> public abstract val nodeInfo: NodeInfo defined in net.corda.testing.driver.NodeHandle[DeserializedPropertyDescriptor]

'legalIdentity' @ [131:50] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'aliceRPC' @ [131:67] ==> val aliceRPC: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'bobNode' @ [132:17] ==> private final lateinit var bobNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'nodeInfo' @ [132:25] ==> public abstract val nodeInfo: NodeInfo defined in net.corda.testing.driver.NodeHandle[DeserializedPropertyDescriptor]

'legalIdentity' @ [132:34] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'bobRPC' @ [132:51] ==> val bobRPC: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'issuerNodeGBP' @ [133:17] ==> private final lateinit var issuerNodeGBP: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'nodeInfo' @ [133:31] ==> public abstract val nodeInfo: NodeInfo defined in net.corda.testing.driver.NodeHandle[DeserializedPropertyDescriptor]

'legalIdentity' @ [133:40] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'issuerRPCGBP' @ [133:57] ==> val issuerRPCGBP: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'issuerNodeUSD' @ [134:17] ==> private final lateinit var issuerNodeUSD: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'nodeInfo' @ [134:31] ==> public abstract val nodeInfo: NodeInfo defined in net.corda.testing.driver.NodeHandle[DeserializedPropertyDescriptor]

'legalIdentity' @ [134:40] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'issuerRPCUSD' @ [134:57] ==> val issuerRPCUSD: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.setUpRPC[LocalVariableDescriptor]

'seq' @ [140:26] ==> value-parameter seq: Int defined in net.corda.explorer.ExplorerSimulation.startSimulation.log[ValueParameterDescriptorImpl]

'name' @ [140:32] ==> value-parameter name: String defined in net.corda.explorer.ExplorerSimulation.startSimulation.log[ValueParameterDescriptorImpl]

'id' @ [140:38] ==> public abstract val id: StateMachineRunId defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'returnValue' @ [141:13] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'thenMatch' @ [141:25] ==> public fun <V, W, X> CordaFuture<out AbstractCashFlow.Result>.thenMatch(success: (AbstractCashFlow.Result) -> Unit, failure: (Throwable) -> Unit): Unit defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result
    <W> -> Unit
    <X> -> Unit

'component1' @ [141:38] ==> public final operator fun component1(): SignedTransaction defined in net.corda.finance.flows.AbstractCashFlow.Result[DeserializedSimpleFunctionDescriptor]

'Main' @ [142:17] ==> public companion object defined in net.corda.explorer.Main[FakeCallableDescriptorForObject]

'log' @ [142:22] ==> public final val log: Logger defined in net.corda.explorer.Main.Companion[PropertyDescriptorImpl]

'info' @ [142:26] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'out' @ [142:33] ==> val out: String defined in net.corda.explorer.ExplorerSimulation.startSimulation.log[LocalVariableDescriptor]

'stx' @ [142:39] ==> val stx: SignedTransaction defined in net.corda.explorer.ExplorerSimulation.startSimulation.log.<anonymous>[LocalVariableDescriptor]

'id' @ [142:43] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'stx' @ [142:50] ==> val stx: SignedTransaction defined in net.corda.explorer.ExplorerSimulation.startSimulation.log.<anonymous>[LocalVariableDescriptor]

'tx' @ [142:54] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [142:57] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'first' @ [142:65] ==> public fun <T> List<TransactionState<ContractState>>.first(): TransactionState<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'data' @ [142:73] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [142:93] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'Main' @ [144:17] ==> public companion object defined in net.corda.explorer.Main[FakeCallableDescriptorForObject]

'log' @ [144:22] ==> public final val log: Logger defined in net.corda.explorer.Main.Companion[PropertyDescriptorImpl]

'info' @ [144:26] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'out' @ [144:33] ==> val out: String defined in net.corda.explorer.ExplorerSimulation.startSimulation.log[LocalVariableDescriptor]

'it' @ [144:39] ==> value-parameter it: Throwable defined in net.corda.explorer.ExplorerSimulation.startSimulation.log.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [144:42] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'..' @ [148:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'maxIterations' @ [148:22] ==> value-parameter maxIterations: Int defined in net.corda.explorer.ExplorerSimulation.startSimulation[ValueParameterDescriptorImpl]

'sleep' @ [149:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'eventGenerator' @ [151:13] ==> value-parameter eventGenerator: EventGenerator defined in net.corda.explorer.ExplorerSimulation.startSimulation[ValueParameterDescriptorImpl]

'issuerGenerator' @ [151:28] ==> public open val issuerGenerator: Generator<AbstractCashFlow.AbstractRequest> defined in net.corda.client.mock.EventGenerator[DeserializedPropertyDescriptor]

'map' @ [151:44] ==> public final fun <B> map(function: (AbstractCashFlow.AbstractRequest) -> Unit?): Generator<Unit?> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> Unit?

'when (request) {
                    is IssueAndPaymentRequest -> issuers[request.amount.token]?.let {
                        println("${Instant.now()} [$i] ISSUING ${request.amount} with ref ${request.issueRef} to ${request.recipient}")
                        it.startFlow(::CashIssueAndPaymentFlow, request).log(i, "${request.amount.token}Issuer")
                    }
                    is ExitRequest -> issuers[request.amount.token]?.let {
                        println("${Instant.now()} [$i] EXITING ${request.amount} with ref ${request.issueRef}")
                        it.startFlow(::CashExitFlow, request).log(i, "${request.amount.token}Exit")
                    }
                    else -> throw IllegalArgumentException("Unsupported command: $request")
                }' @ [152:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?, entry2: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'request' @ [152:23] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'issuers' @ [153:50] ==> private final val issuers: HashMap<Currency, CordaRPCOps> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'request' @ [153:58] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [153:66] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'token' @ [153:73] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'let' @ [153:81] ==> @InlineOnly public inline fun <T, R> CordaRPCOps.let(block: (CordaRPCOps) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaRPCOps
    <R> -> Unit

'println' @ [154:25] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'now' @ [154:44] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'i' @ [154:53] ==> val i: Int defined in net.corda.explorer.ExplorerSimulation.startSimulation[LocalVariableDescriptor]

'request' @ [154:66] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [154:74] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'request' @ [154:93] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'issueRef' @ [154:101] ==> public final val issueRef: OpaqueBytes defined in net.corda.finance.flows.CashIssueAndPaymentFlow.IssueAndPaymentRequest[DeserializedPropertyDescriptor]

'request' @ [154:116] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'recipient' @ [154:124] ==> public final val recipient: Party defined in net.corda.finance.flows.CashIssueAndPaymentFlow.IssueAndPaymentRequest[DeserializedPropertyDescriptor]

'it' @ [155:25] ==> value-parameter it: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startFlow' @ [155:28] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashIssueAndPaymentFlow.IssueAndPaymentRequest) -> CashIssueAndPaymentFlow, arg0: CashIssueAndPaymentFlow.IssueAndPaymentRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> IssueAndPaymentRequest
    <reified R : FlowLogic<T>> -> CashIssueAndPaymentFlow

'CashIssueAndPaymentFlow' @ [155:40] ==> public constructor CashIssueAndPaymentFlow(request: CashIssueAndPaymentFlow.IssueAndPaymentRequest) defined in net.corda.finance.flows.CashIssueAndPaymentFlow[DeserializedClassConstructorDescriptor]

'request' @ [155:65] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [155:74] ==> local final fun FlowHandle<AbstractCashFlow.Result>.log(seq: Int, name: String): Unit defined in net.corda.explorer.ExplorerSimulation.startSimulation[SimpleFunctionDescriptorImpl]

'i' @ [155:78] ==> val i: Int defined in net.corda.explorer.ExplorerSimulation.startSimulation[LocalVariableDescriptor]

'request' @ [155:84] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [155:92] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'token' @ [155:99] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuers' @ [157:39] ==> private final val issuers: HashMap<Currency, CordaRPCOps> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'request' @ [157:47] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [157:55] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'token' @ [157:62] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'let' @ [157:70] ==> @InlineOnly public inline fun <T, R> CordaRPCOps.let(block: (CordaRPCOps) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaRPCOps
    <R> -> Unit

'println' @ [158:25] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'now' @ [158:44] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'i' @ [158:53] ==> val i: Int defined in net.corda.explorer.ExplorerSimulation.startSimulation[LocalVariableDescriptor]

'request' @ [158:66] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [158:74] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'request' @ [158:93] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'issueRef' @ [158:101] ==> public final val issueRef: OpaqueBytes defined in net.corda.finance.flows.CashExitFlow.ExitRequest[DeserializedPropertyDescriptor]

'it' @ [159:25] ==> value-parameter it: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startFlow' @ [159:28] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashExitFlow.ExitRequest) -> CashExitFlow, arg0: CashExitFlow.ExitRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> ExitRequest
    <reified R : FlowLogic<T>> -> CashExitFlow

'CashExitFlow' @ [159:40] ==> public constructor CashExitFlow(request: CashExitFlow.ExitRequest) defined in net.corda.finance.flows.CashExitFlow[DeserializedClassConstructorDescriptor]

'request' @ [159:54] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [159:63] ==> local final fun FlowHandle<AbstractCashFlow.Result>.log(seq: Int, name: String): Unit defined in net.corda.explorer.ExplorerSimulation.startSimulation[SimpleFunctionDescriptorImpl]

'i' @ [159:67] ==> val i: Int defined in net.corda.explorer.ExplorerSimulation.startSimulation[LocalVariableDescriptor]

'request' @ [159:73] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [159:81] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[DeserializedPropertyDescriptor]

'token' @ [159:88] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [161:35] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'request' @ [161:83] ==> value-parameter request: AbstractCashFlow.AbstractRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [163:15] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<Unit?> defined in kotlin.Function1[FunctionInvokeDescriptor]

'SplittableRandom' @ [163:24] ==> public constructor SplittableRandom() defined in java.util.SplittableRandom[JavaClassConstructorDescriptor]

'eventGenerator' @ [165:13] ==> value-parameter eventGenerator: EventGenerator defined in net.corda.explorer.ExplorerSimulation.startSimulation[ValueParameterDescriptorImpl]

'moveCashGenerator' @ [165:28] ==> public open val moveCashGenerator: Generator<CashPaymentFlow.PaymentRequest> defined in net.corda.client.mock.EventGenerator[DeserializedPropertyDescriptor]

'combine' @ [165:46] ==> public final fun <B, R> combine(other1: Generator<Pair<Party, CordaRPCOps>>, function: (CashPaymentFlow.PaymentRequest, Pair<Party, CordaRPCOps>) -> Unit): Generator<Unit> defined in net.corda.client.mock.Generator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <B> -> Pair<Party, CordaRPCOps>
    <R> -> Unit

'pickOne' @ [165:64] ==> public fun <A> Generator.Companion.pickOne(list: List<Pair<Party, CordaRPCOps>>): Generator<Pair<Party, CordaRPCOps>> defined in net.corda.client.mock[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Pair<Party, CordaRPCOps>

'parties' @ [165:72] ==> private final val parties: ArrayList<Pair<Party, CordaRPCOps>> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'component1' @ [165:94] ==> public final operator fun component1(): Party defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [165:101] ==> public final operator fun component2(): CordaRPCOps defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'println' @ [166:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'now' @ [166:36] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'i' @ [166:45] ==> val i: Int defined in net.corda.explorer.ExplorerSimulation.startSimulation[LocalVariableDescriptor]

'request' @ [166:58] ==> value-parameter request: CashPaymentFlow.PaymentRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [166:66] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedPropertyDescriptor]

'party' @ [166:80] ==> val party: Party defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[LocalVariableDescriptor]

'request' @ [166:91] ==> value-parameter request: CashPaymentFlow.PaymentRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'recipient' @ [166:99] ==> public final val recipient: Party defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[DeserializedPropertyDescriptor]

'rpc' @ [167:17] ==> val rpc: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[LocalVariableDescriptor]

'startFlow' @ [167:21] ==> public inline fun <T : Any, A, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (CashPaymentFlow.PaymentRequest) -> CashPaymentFlow, arg0: CashPaymentFlow.PaymentRequest): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> PaymentRequest
    <reified R : FlowLogic<T>> -> CashPaymentFlow

'CashPaymentFlow' @ [167:33] ==> public constructor CashPaymentFlow(request: CashPaymentFlow.PaymentRequest) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'request' @ [167:50] ==> value-parameter request: CashPaymentFlow.PaymentRequest defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [167:59] ==> local final fun FlowHandle<AbstractCashFlow.Result>.log(seq: Int, name: String): Unit defined in net.corda.explorer.ExplorerSimulation.startSimulation[SimpleFunctionDescriptorImpl]

'i' @ [167:63] ==> val i: Int defined in net.corda.explorer.ExplorerSimulation.startSimulation[LocalVariableDescriptor]

'party' @ [167:66] ==> val party: Party defined in net.corda.explorer.ExplorerSimulation.startSimulation.<anonymous>[LocalVariableDescriptor]

'name' @ [167:72] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [167:77] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'invoke' @ [168:15] ==> public abstract operator fun invoke(p1: SplittableRandom): Try<Unit> defined in kotlin.Function1[FunctionInvokeDescriptor]

'SplittableRandom' @ [168:24] ==> public constructor SplittableRandom() defined in java.util.SplittableRandom[JavaClassConstructorDescriptor]

'println' @ [170:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [174:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'setUpRPC' @ [175:9] ==> private final fun setUpRPC(): Unit defined in net.corda.explorer.ExplorerSimulation[SimpleFunctionDescriptorImpl]

'EventGenerator' @ [176:30] ==> public constructor EventGenerator(parties: List<Party>, currencies: List<Currency>, notary: Party) defined in net.corda.client.mock.EventGenerator[DeserializedClassConstructorDescriptor]

'parties' @ [177:27] ==> private final val parties: ArrayList<Pair<Party, CordaRPCOps>> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'map' @ [177:35] ==> public inline fun <T, R> Iterable<Pair<Party, CordaRPCOps>>.map(transform: (Pair<Party, CordaRPCOps>) -> Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Party, CordaRPCOps>
    <R> -> Party

'it' @ [177:41] ==> value-parameter it: Pair<Party, CordaRPCOps> defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [177:44] ==> public final val first: Party defined in kotlin.Pair[DeserializedPropertyDescriptor]

'notaryNode' @ [178:26] ==> private final lateinit var notaryNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'nodeInfo' @ [178:37] ==> public abstract val nodeInfo: NodeInfo defined in net.corda.testing.driver.NodeHandle[DeserializedPropertyDescriptor]

'notaryIdentity' @ [178:46] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'listOf' @ [179:30] ==> public fun <T> listOf(vararg elements: Currency): List<Currency> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Currency

'GBP' @ [179:37] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'USD' @ [179:42] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'eventGenerator' @ [184:9] ==> val eventGenerator: EventGenerator defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation[LocalVariableDescriptor]

'parties' @ [184:24] ==> public final val parties: List<Party> defined in net.corda.client.mock.EventGenerator[DeserializedPropertyDescriptor]

'forEach' @ [184:32] ==> @HidesMembers public inline fun <T> Iterable<Party>.forEach(action: (Party) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'..' @ [185:25] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'component1' @ [186:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Currency, CordaRPCOps>.component1(): Currency defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Currency
    <V> -> CordaRPCOps

'component2' @ [186:33] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Currency, CordaRPCOps>.component2(): CordaRPCOps defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Currency
    <V> -> CordaRPCOps

'issuers' @ [186:44] ==> private final val issuers: HashMap<Currency, CordaRPCOps> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'Amount' @ [187:34] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'currency' @ [187:52] ==> val currency: Currency defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation.<anonymous>[LocalVariableDescriptor]

'issuer' @ [188:21] ==> val issuer: CordaRPCOps defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation.<anonymous>[LocalVariableDescriptor]

'startFlow' @ [188:28] ==> public inline fun <T : Any, A, B, C, D, E, reified R : FlowLogic<AbstractCashFlow.Result>> CordaRPCOps.startFlow(flowConstructor: (Amount<Currency>, OpaqueBytes, Party, Boolean, Party) -> CashIssueAndPaymentFlow, arg0: Amount<Currency>, arg1: OpaqueBytes, arg2: Party, arg3: Boolean, arg4: Party): FlowHandle<AbstractCashFlow.Result> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Result
    <A> -> Amount<Currency>
    <B> -> OpaqueBytes
    <C> -> Party
    <D> -> Boolean
    <E> -> Party
    <reified R : FlowLogic<T>> -> CashIssueAndPaymentFlow

'CashIssueAndPaymentFlow' @ [188:40] ==> public constructor CashIssueAndPaymentFlow(amount: Amount<Currency>, issueRef: OpaqueBytes, recipient: Party, anonymous: Boolean, notary: Party) defined in net.corda.finance.flows.CashIssueAndPaymentFlow[DeserializedClassConstructorDescriptor]

'amount' @ [188:65] ==> val amount: Amount<Currency> defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation.<anonymous>[LocalVariableDescriptor]

'OpaqueBytes' @ [188:73] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'ByteArray' @ [188:85] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'ref' @ [188:100] ==> val ref: Int defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation.<anonymous>[LocalVariableDescriptor]

'toByte' @ [188:104] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [188:118] ==> value-parameter it: Party defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation.<anonymous>[ValueParameterDescriptorImpl]

'anonymous' @ [188:122] ==> val anonymous: Boolean defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation[LocalVariableDescriptor]

'notaryNode' @ [188:133] ==> private final lateinit var notaryNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'nodeInfo' @ [188:144] ==> public abstract val nodeInfo: NodeInfo defined in net.corda.testing.driver.NodeHandle[DeserializedPropertyDescriptor]

'notaryIdentity' @ [188:153] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'returnValue' @ [188:169] ==> public abstract val returnValue: CordaFuture<AbstractCashFlow.Result> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [188:181] ==> public fun <V> Future<AbstractCashFlow.Result>.getOrThrow(timeout: Duration? = ...): AbstractCashFlow.Result defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result

'startSimulation' @ [192:9] ==> private final fun startSimulation(eventGenerator: EventGenerator, maxIterations: Int): Unit defined in net.corda.explorer.ExplorerSimulation[SimpleFunctionDescriptorImpl]

'eventGenerator' @ [192:25] ==> val eventGenerator: EventGenerator defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation[LocalVariableDescriptor]

'maxIterations' @ [192:41] ==> val maxIterations: Int defined in net.corda.explorer.ExplorerSimulation.startNormalSimulation[LocalVariableDescriptor]

'onEnd' @ [193:9] ==> private final fun onEnd(): Unit defined in net.corda.explorer.ExplorerSimulation[SimpleFunctionDescriptorImpl]

'println' @ [197:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'setUpRPC' @ [198:9] ==> private final fun setUpRPC(): Unit defined in net.corda.explorer.ExplorerSimulation[SimpleFunctionDescriptorImpl]

'ErrorFlowsEventGenerator' @ [199:30] ==> public constructor ErrorFlowsEventGenerator(parties: List<Party>, currencies: List<Currency>, notary: Party) defined in net.corda.client.mock.ErrorFlowsEventGenerator[DeserializedClassConstructorDescriptor]

'parties' @ [200:27] ==> private final val parties: ArrayList<Pair<Party, CordaRPCOps>> defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'map' @ [200:35] ==> public inline fun <T, R> Iterable<Pair<Party, CordaRPCOps>>.map(transform: (Pair<Party, CordaRPCOps>) -> Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Party, CordaRPCOps>
    <R> -> Party

'it' @ [200:41] ==> value-parameter it: Pair<Party, CordaRPCOps> defined in net.corda.explorer.ExplorerSimulation.startErrorFlowsSimulation.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [200:44] ==> public final val first: Party defined in kotlin.Pair[DeserializedPropertyDescriptor]

'notaryNode' @ [201:26] ==> private final lateinit var notaryNode: NodeHandle defined in net.corda.explorer.ExplorerSimulation[PropertyDescriptorImpl]

'nodeInfo' @ [201:37] ==> public abstract val nodeInfo: NodeInfo defined in net.corda.testing.driver.NodeHandle[DeserializedPropertyDescriptor]

'notaryIdentity' @ [201:46] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'listOf' @ [202:30] ==> public fun <T> listOf(vararg elements: Currency): List<Currency> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Currency

'GBP' @ [202:37] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'USD' @ [202:42] ==> @field:JvmField public val USD: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'startSimulation' @ [205:9] ==> private final fun startSimulation(eventGenerator: EventGenerator, maxIterations: Int): Unit defined in net.corda.explorer.ExplorerSimulation[SimpleFunctionDescriptorImpl]

'eventGenerator' @ [205:25] ==> val eventGenerator: ErrorFlowsEventGenerator defined in net.corda.explorer.ExplorerSimulation.startErrorFlowsSimulation[LocalVariableDescriptor]

'maxIterations' @ [205:41] ==> val maxIterations: Int defined in net.corda.explorer.ExplorerSimulation.startErrorFlowsSimulation[LocalVariableDescriptor]

'onEnd' @ [206:9] ==> private final fun onEnd(): Unit defined in net.corda.explorer.ExplorerSimulation[SimpleFunctionDescriptorImpl]

