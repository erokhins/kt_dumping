'err' @ [10:12] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [10:16] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'driverDirectory' @ [10:36] ==> public final val driverDirectory: (Path..Path?) defined in net.corda.cordform.CordformDefinition[JavaPropertyDescriptor]

'driverDirectory' @ [11:5] ==> public final val driverDirectory: (Path..Path?) defined in net.corda.cordform.CordformDefinition[JavaPropertyDescriptor]

'toFile' @ [11:21] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'deleteRecursively' @ [11:30] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'driver' @ [17:37] ==> @JvmOverloads public fun <A> driver(isDebug: Boolean = ..., driverDirectory: Path = ..., portAllocation: PortAllocation = ..., debugPortAllocation: PortAllocation = ..., systemProperties: Map<String, String> = ..., useTestClock: Boolean = ..., initialiseSerialization: Boolean = ..., networkMapStartStrategy: NetworkMapStartStrategy = ..., startNodesInProcess: Boolean = ..., dsl: DriverDSLExposedInterface.() -> Unit): Unit defined in net.corda.testing.driver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unit

'driverDirectory' @ [19:27] ==> public final val driverDirectory: (Path..Path?) defined in net.corda.cordform.CordformDefinition[JavaPropertyDescriptor]

'Nominated' @ [20:59] ==> public constructor Nominated(legalName: X500Name) defined in net.corda.testing.driver.NetworkMapStartStrategy.Nominated[DeserializedClassConstructorDescriptor]

'networkMapNodeName' @ [20:69] ==> public final val networkMapNodeName: (X500Name..X500Name?) defined in net.corda.cordform.CordformDefinition[JavaPropertyDescriptor]

'Incremental' @ [21:41] ==> public constructor Incremental(startingPort: Int) defined in net.corda.testing.driver.PortAllocation.Incremental[DeserializedClassConstructorDescriptor]

'setup' @ [23:5] ==> public abstract fun setup(p0: (CordformContext..CordformContext?)): Unit defined in net.corda.cordform.CordformDefinition[JavaMethodDescriptor]

'this' @ [23:11] ==> <this> defined in net.corda.demorun.runNodes.<anonymous>[ReceiverParameterDescriptorImpl]

'startNodes' @ [24:5] ==> public abstract fun startNodes(nodes: List<CordformNode>, startInSameProcess: Boolean? = ...): List<CordaFuture<NodeHandle>> defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

'nodeConfigurers' @ [24:16] ==> public final val nodeConfigurers: (ArrayList<(Consumer<in (CordformNode..CordformNode?)>..Consumer<in (CordformNode..CordformNode?)>?)>..ArrayList<(Consumer<in (CordformNode..CordformNode?)>..Consumer<in (CordformNode..CordformNode?)>?)>?) defined in net.corda.cordform.CordformDefinition[JavaPropertyDescriptor]

'map' @ [24:32] ==> public inline fun <T, R> Iterable<(Consumer<in (CordformNode..CordformNode?)>..Consumer<in (CordformNode..CordformNode?)>?)>.map(transform: ((Consumer<in (CordformNode..CordformNode?)>..Consumer<in (CordformNode..CordformNode?)>?)) -> CordformNode): List<CordformNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.function.Consumer<in (net.corda.cordform.CordformNode..net.corda.cordform.CordformNode?)>..java.util.function.Consumer<in (net.corda.cordform.CordformNode..net.corda.cordform.CordformNode?)>?)
    <R> -> CordformNode

'CordformNode' @ [24:52] ==> public constructor CordformNode() defined in net.corda.cordform.CordformNode[JavaClassConstructorDescriptor]

'also' @ [24:67] ==> @InlineOnly @SinceKotlin public inline fun <T> CordformNode.also(block: (CordformNode) -> Unit): CordformNode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordformNode

'configurer' @ [24:74] ==> value-parameter configurer: (Consumer<in (CordformNode..CordformNode?)>..Consumer<in (CordformNode..CordformNode?)>?) defined in net.corda.demorun.runNodes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [24:85] ==> public abstract fun accept(p0: (Any..Any?)): Unit defined in java.util.function.Consumer[JavaMethodDescriptor]

'it' @ [24:92] ==> value-parameter it: CordformNode defined in net.corda.demorun.runNodes.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'waitForAllNodesToFinish' @ [25:5] ==> public abstract fun waitForAllNodesToFinish(): Unit defined in net.corda.testing.driver.DriverDSLExposedInterface[DeserializedSimpleFunctionDescriptor]

