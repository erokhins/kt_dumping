'RaftNotaryCordform' @ [20:33] ==> public object RaftNotaryCordform : CordformDefinition defined in net.corda.notarydemo in file RaftNotaryCordform.kt[FakeCallableDescriptorForObject]

'runNodes' @ [20:52] ==> public fun CordformDefinition.runNodes(): Unit defined in net.corda.demorun in file DemoRunner.kt[SimpleFunctionDescriptorImpl]

'until' @ [22:53] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'clusterSize' @ [22:61] ==> value-parameter clusterSize: Int defined in net.corda.notarydemo.createNotaryNames[ValueParameterDescriptorImpl]

'map' @ [22:74] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> X500Name): List<X500Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> X500Name

'DUMMY_NOTARY' @ [22:80] ==> public val DUMMY_NOTARY: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [22:93] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'appendToCommonName' @ [22:98] ==> public fun X500Name.appendToCommonName(commonName: String): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'it' @ [22:120] ==> value-parameter it: Int defined in net.corda.notarydemo.createNotaryNames.<anonymous>[ValueParameterDescriptorImpl]

'createNotaryNames' @ [24:27] ==> internal fun createNotaryNames(clusterSize: Int): List<X500Name> defined in net.corda.notarydemo in file RaftNotaryCordform.kt[SimpleFunctionDescriptorImpl]

'CordformDefinition' @ [26:29] ==> public constructor CordformDefinition(p0: (Path..Path?), p1: (X500Name..X500Name?)) defined in net.corda.cordform.CordformDefinition[JavaClassConstructorDescriptor]

'/' @ [26:48] ==> public operator fun String.div(other: String): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'notaryNames' @ [26:79] ==> private val notaryNames: List<X500Name> defined in net.corda.notarydemo in file RaftNotaryCordform.kt[PropertyDescriptorImpl]

'X500Name' @ [27:31] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'ServiceInfo' @ [28:37] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'type' @ [28:77] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.RaftValidatingNotaryService.Companion[DeserializedPropertyDescriptor]

'clusterName' @ [28:83] ==> private final val clusterName: X500Name defined in net.corda.notarydemo.RaftNotaryCordform[PropertyDescriptorImpl]

'node' @ [31:9] ==> public fun CordformDefinition.node(configure: CordformNode.() -> Unit): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [32:13] ==> public fun CordformNode.name(name: X500Name): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'ALICE' @ [32:18] ==> public val ALICE: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [32:24] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'p2pPort' @ [33:13] ==> public open fun p2pPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'rpcPort' @ [34:13] ==> public open fun rpcPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'rpcUsers' @ [35:13] ==> public fun CordformNode.rpcUsers(vararg users: User): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'notaryDemoUser' @ [35:22] ==> public val notaryDemoUser: User defined in net.corda.notarydemo in file SingleNotaryCordform.kt[PropertyDescriptorImpl]

'node' @ [37:9] ==> public fun CordformDefinition.node(configure: CordformNode.() -> Unit): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [38:13] ==> public fun CordformNode.name(name: X500Name): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'BOB' @ [38:18] ==> public val BOB: Party defined in net.corda.testing[DeserializedPropertyDescriptor]

'name' @ [38:22] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'p2pPort' @ [39:13] ==> public open fun p2pPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'rpcPort' @ [40:13] ==> public open fun rpcPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'node' @ [42:74] ==> public fun CordformDefinition.node(configure: CordformNode.() -> Unit): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [43:13] ==> public fun CordformNode.name(name: X500Name): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'notaryNames' @ [43:18] ==> private val notaryNames: List<X500Name> defined in net.corda.notarydemo in file RaftNotaryCordform.kt[PropertyDescriptorImpl]

'index' @ [43:30] ==> value-parameter index: Int defined in net.corda.notarydemo.RaftNotaryCordform.<init>.notaryNode[ValueParameterDescriptorImpl]

'advertisedServices' @ [44:13] ==> public fun CordformNode.advertisedServices(vararg services: ServiceInfo): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'advertisedService' @ [44:32] ==> private final val advertisedService: ServiceInfo defined in net.corda.notarydemo.RaftNotaryCordform[PropertyDescriptorImpl]

'invoke' @ [45:13] ==> public abstract operator fun CordformNode.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'notaryNode' @ [47:9] ==> local final fun notaryNode(index: Int, configure: CordformNode.() -> Unit): Unit defined in net.corda.notarydemo.RaftNotaryCordform.<init>[SimpleFunctionDescriptorImpl]

'notaryNodePort' @ [48:13] ==> public open fun notaryNodePort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'p2pPort' @ [49:13] ==> public open fun p2pPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'rpcPort' @ [50:13] ==> public open fun rpcPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'NetworkHostAndPort' @ [52:30] ==> public constructor NetworkHostAndPort(host: String, port: Int) defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedClassConstructorDescriptor]

'notaryNode' @ [53:9] ==> local final fun notaryNode(index: Int, configure: CordformNode.() -> Unit): Unit defined in net.corda.notarydemo.RaftNotaryCordform.<init>[SimpleFunctionDescriptorImpl]

'notaryNodePort' @ [54:13] ==> public open fun notaryNodePort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'p2pPort' @ [55:13] ==> public open fun p2pPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'rpcPort' @ [56:13] ==> public open fun rpcPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'notaryClusterAddresses' @ [57:13] ==> public fun CordformNode.notaryClusterAddresses(vararg addresses: NetworkHostAndPort): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'clusterAddress' @ [57:36] ==> val clusterAddress: NetworkHostAndPort defined in net.corda.notarydemo.RaftNotaryCordform.<init>[LocalVariableDescriptor]

'notaryNode' @ [59:9] ==> local final fun notaryNode(index: Int, configure: CordformNode.() -> Unit): Unit defined in net.corda.notarydemo.RaftNotaryCordform.<init>[SimpleFunctionDescriptorImpl]

'notaryNodePort' @ [60:13] ==> public open fun notaryNodePort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'p2pPort' @ [61:13] ==> public open fun p2pPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'rpcPort' @ [62:13] ==> public open fun rpcPort(p0: (Int..Int?)): Unit defined in net.corda.cordform.CordformNode[JavaMethodDescriptor]

'notaryClusterAddresses' @ [63:13] ==> public fun CordformNode.notaryClusterAddresses(vararg addresses: NetworkHostAndPort): Unit defined in net.corda.demorun.util in file DemoUtils.kt[SimpleFunctionDescriptorImpl]

'clusterAddress' @ [63:36] ==> val clusterAddress: NetworkHostAndPort defined in net.corda.notarydemo.RaftNotaryCordform.<init>[LocalVariableDescriptor]

'ServiceIdentityGenerator' @ [68:9] ==> public object ServiceIdentityGenerator defined in net.corda.node.utilities[FakeCallableDescriptorForObject]

'generateToDisk' @ [68:34] ==> public final fun generateToDisk(dirs: List<Path>, serviceId: String, serviceName: X500Name, threshold: Int = ...): Party defined in net.corda.node.utilities.ServiceIdentityGenerator[DeserializedSimpleFunctionDescriptor]

'notaryNames' @ [68:49] ==> private val notaryNames: List<X500Name> defined in net.corda.notarydemo in file RaftNotaryCordform.kt[PropertyDescriptorImpl]

'map' @ [68:61] ==> public inline fun <T, R> Iterable<X500Name>.map(transform: (X500Name) -> (Path..Path?)): List<(Path..Path?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X500Name
    <R> -> (java.nio.file.Path..java.nio.file.Path?)

'context' @ [68:67] ==> value-parameter context: CordformContext defined in net.corda.notarydemo.RaftNotaryCordform.setup[ValueParameterDescriptorImpl]

'baseDirectory' @ [68:75] ==> public abstract fun baseDirectory(p0: (X500Name..X500Name?)): (Path..Path?) defined in net.corda.cordform.CordformContext[JavaMethodDescriptor]

'it' @ [68:89] ==> value-parameter it: X500Name defined in net.corda.notarydemo.RaftNotaryCordform.setup.<anonymous>[ValueParameterDescriptorImpl]

'advertisedService' @ [68:96] ==> private final val advertisedService: ServiceInfo defined in net.corda.notarydemo.RaftNotaryCordform[PropertyDescriptorImpl]

'type' @ [68:114] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'id' @ [68:119] ==> public final val id: String defined in net.corda.core.node.services.ServiceType[DeserializedPropertyDescriptor]

'clusterName' @ [68:123] ==> private final val clusterName: X500Name defined in net.corda.notarydemo.RaftNotaryCordform[PropertyDescriptorImpl]

