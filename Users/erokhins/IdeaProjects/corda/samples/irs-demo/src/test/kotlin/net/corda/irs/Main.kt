'driver' @ [18:5] ==> @JvmOverloads public fun <A> driver(isDebug: Boolean = ..., driverDirectory: Path = ..., portAllocation: PortAllocation = ..., debugPortAllocation: PortAllocation = ..., systemProperties: Map<String, String> = ..., useTestClock: Boolean = ..., initialiseSerialization: Boolean = ..., networkMapStartStrategy: NetworkMapStartStrategy = ..., startNodesInProcess: Boolean = ..., dsl: DriverDSLExposedInterface.() -> Unit): Unit defined in net.corda.testing.driver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unit

'component1' @ [19:14] ==> @InlineOnly public operator inline fun <T> List<NodeHandle>.component1(): NodeHandle defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeHandle

'component2' @ [19:26] ==> @InlineOnly public operator inline fun <T> List<NodeHandle>.component2(): NodeHandle defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeHandle

'component3' @ [19:33] ==> @InlineOnly public operator inline fun <T> List<NodeHandle>.component3(): NodeHandle defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeHandle

'listOf' @ [19:42] ==> public fun <T> listOf(vararg elements: CordaFuture<NodeHandle>): List<CordaFuture<NodeHandle>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<NodeHandle>

'startNode' @ [20:17] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [20:27] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [20:40] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'setOf' @ [20:46] ==> public fun <T> setOf(vararg elements: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'ServiceInfo' @ [20:52] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'SimpleNotaryService' @ [20:64] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [20:84] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[DeserializedPropertyDescriptor]

'ServiceInfo' @ [20:91] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NodeInterestRates' @ [20:103] ==> public object NodeInterestRates defined in net.corda.irs.api[FakeCallableDescriptorForObject]

'type' @ [20:128] ==> @field:JvmField public final val type: ServiceType defined in net.corda.irs.api.NodeInterestRates.Oracle.Companion[DeserializedPropertyDescriptor]

'startNode' @ [21:17] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'DUMMY_BANK_A' @ [21:27] ==> public val DUMMY_BANK_A: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [21:40] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'startNode' @ [22:17] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'DUMMY_BANK_B' @ [22:27] ==> public val DUMMY_BANK_B: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [22:40] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'transpose' @ [23:11] ==> public fun <V> Collection<CordaFuture<out NodeHandle>>.transpose(): CordaFuture<List<NodeHandle>> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> NodeHandle

'getOrThrow' @ [23:23] ==> public fun <V> Future<List<NodeHandle>>.getOrThrow(timeout: Duration? = ...): List<NodeHandle> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> List<NodeHandle>

'startWebserver' @ [25:9] ==> public abstract fun startWebserver(handle: NodeHandle): CordaFuture<WebserverHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'controller' @ [25:24] ==> val controller: NodeHandle defined in net.corda.irs.main.<anonymous>[LocalVariableDescriptor]

'startWebserver' @ [26:9] ==> public abstract fun startWebserver(handle: NodeHandle): CordaFuture<WebserverHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'nodeA' @ [26:24] ==> val nodeA: NodeHandle defined in net.corda.irs.main.<anonymous>[LocalVariableDescriptor]

'startWebserver' @ [27:9] ==> public abstract fun startWebserver(handle: NodeHandle): CordaFuture<WebserverHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'nodeB' @ [27:24] ==> val nodeB: NodeHandle defined in net.corda.irs.main.<anonymous>[LocalVariableDescriptor]

'waitForAllNodesToFinish' @ [29:9] ==> public abstract fun waitForAllNodesToFinish(): Unit defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

