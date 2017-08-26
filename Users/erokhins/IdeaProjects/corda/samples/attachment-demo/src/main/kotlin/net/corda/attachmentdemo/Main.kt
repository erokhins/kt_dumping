'listOf' @ [17:20] ==> public fun <T> listOf(element: User): List<User> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'User' @ [17:27] ==> public constructor User(username: String, password: String, permissions: Set<String>) defined in net.corda.nodeapi.User[DeserializedClassConstructorDescriptor]

'setOf' @ [17:48] ==> public fun <T> setOf(element: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'driver' @ [18:5] ==> @JvmOverloads public fun <A> driver(isDebug: Boolean = ..., driverDirectory: Path = ..., portAllocation: PortAllocation = ..., debugPortAllocation: PortAllocation = ..., systemProperties: Map<String, String> = ..., useTestClock: Boolean = ..., initialiseSerialization: Boolean = ..., networkMapStartStrategy: NetworkMapStartStrategy = ..., startNodesInProcess: Boolean = ..., dsl: DriverDSLExposedInterface.() -> Unit): Unit defined in net.corda.testing.driver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unit

'/' @ [18:46] ==> public operator fun String.div(other: String): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'startNode' @ [19:9] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'DUMMY_NOTARY' @ [19:19] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [19:32] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'setOf' @ [19:38] ==> public fun <T> setOf(element: ServiceInfo): Set<ServiceInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo

'ServiceInfo' @ [19:44] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'SimpleNotaryService' @ [19:56] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [19:76] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[DeserializedPropertyDescriptor]

'startNode' @ [20:9] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'DUMMY_BANK_A' @ [20:19] ==> public val DUMMY_BANK_A: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [20:32] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'demoUser' @ [20:49] ==> val demoUser: List<User> defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'startNode' @ [21:9] ==> public abstract fun startNode(providedName: X500Name? = ..., advertisedServices: Set<ServiceInfo> = ..., rpcUsers: List<User> = ..., verifierType: VerifierType = ..., customOverrides: Map<String, Any?> = ..., startInSameProcess: Boolean? = ...): CordaFuture<NodeHandle> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'DUMMY_BANK_B' @ [21:19] ==> public val DUMMY_BANK_B: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [21:32] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'demoUser' @ [21:49] ==> val demoUser: List<User> defined in net.corda.attachmentdemo.main[LocalVariableDescriptor]

'waitForAllNodesToFinish' @ [22:9] ==> public abstract fun waitForAllNodesToFinish(): Unit defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

