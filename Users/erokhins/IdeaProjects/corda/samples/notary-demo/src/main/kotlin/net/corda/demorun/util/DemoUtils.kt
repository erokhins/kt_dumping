'addNode' @ [11:5] ==> public final fun addNode(p0: (((CordformNode..CordformNode?)) -> Unit..(((CordformNode..CordformNode?)) -> Unit)?)): Unit defined in net.corda.cordform.CordformDefinition[MyFunctionDescriptor]

'cordformNode' @ [11:31] ==> value-parameter cordformNode: (CordformNode..CordformNode?) defined in net.corda.demorun.util.node.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [11:44] ==> public abstract operator fun CordformNode.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [14:41] ==> public open fun name(p0: (String..String?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'name' @ [14:46] ==> value-parameter name: X500Name defined in net.corda.demorun.util.name[ValueParameterDescriptorImpl]

'toString' @ [14:51] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'rpcUsers' @ [17:5] ==> public final var rpcUsers: (MutableList<(MutableMap<(String..String?), (Any..Any?)>..Map<(String..String?), (Any..Any?)>?)>..List<(MutableMap<(String..String?), (Any..Any?)>..Map<(String..String?), (Any..Any?)>?)>?) defined in net.corda.cordform.CordformNode[JavaPropertyDescriptor]

'users' @ [17:16] ==> value-parameter vararg users: User defined in net.corda.demorun.util.rpcUsers[ValueParameterDescriptorImpl]

'map' @ [17:22] ==> public inline fun <T, R> Array<out User>.map(transform: (User) -> Map<String, Any>): List<Map<String, Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User
    <R> -> Map<String, Any>

'it' @ [17:28] ==> value-parameter it: User defined in net.corda.demorun.util.rpcUsers.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [17:31] ==> public final fun toMap(): Map<String, Any> defined in net.corda.nodeapi.User[DeserializedSimpleFunctionDescriptor]

'advertisedServices' @ [21:5] ==> public final var advertisedServices: (MutableList<(String..String?)>..List<(String..String?)>?) defined in net.corda.cordform.CordformNode[JavaPropertyDescriptor]

'services' @ [21:26] ==> value-parameter vararg services: ServiceInfo defined in net.corda.demorun.util.advertisedServices[ValueParameterDescriptorImpl]

'map' @ [21:35] ==> public inline fun <T, R> Array<out ServiceInfo>.map(transform: (ServiceInfo) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceInfo
    <R> -> String

'it' @ [21:41] ==> value-parameter it: ServiceInfo defined in net.corda.demorun.util.advertisedServices.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [21:44] ==> public open fun toString(): String defined in net.corda.core.node.services.ServiceInfo[DeserializedSimpleFunctionDescriptor]

'notaryClusterAddresses' @ [25:5] ==> public final var notaryClusterAddresses: (MutableList<(String..String?)>..List<(String..String?)>?) defined in net.corda.cordform.CordformNode[JavaPropertyDescriptor]

'addresses' @ [25:30] ==> value-parameter vararg addresses: NetworkHostAndPort defined in net.corda.demorun.util.notaryClusterAddresses[ValueParameterDescriptorImpl]

'map' @ [25:40] ==> public inline fun <T, R> Array<out NetworkHostAndPort>.map(transform: (NetworkHostAndPort) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort
    <R> -> String

'it' @ [25:46] ==> value-parameter it: NetworkHostAndPort defined in net.corda.demorun.util.notaryClusterAddresses.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [25:49] ==> public open fun toString(): String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedSimpleFunctionDescriptor]

