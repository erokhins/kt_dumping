'Controller' @ [11:24] ==> public constructor Controller() defined in tornadofx.Controller[DeserializedClassConstructorDescriptor]

'inject' @ [13:35] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, NodeController> where T : Injectable defined in net.corda.demobench.model.InstallFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> NodeController

'inject' @ [14:38] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, ServiceController> where T : Injectable defined in net.corda.demobench.model.InstallFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> ServiceController

'Throws' @ [16:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [16:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'config' @ [18:23] ==> value-parameter config: Config defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'parsePort' @ [18:30] ==> private final fun Config.parsePort(path: String): Int defined in net.corda.demobench.model.InstallFactory[SimpleFunctionDescriptorImpl]

'config' @ [19:23] ==> value-parameter config: Config defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'parsePort' @ [19:30] ==> private final fun Config.parsePort(path: String): Int defined in net.corda.demobench.model.InstallFactory[SimpleFunctionDescriptorImpl]

'config' @ [20:23] ==> value-parameter config: Config defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'parsePort' @ [20:30] ==> private final fun Config.parsePort(path: String): Int defined in net.corda.demobench.model.InstallFactory[SimpleFunctionDescriptorImpl]

'config' @ [21:22] ==> value-parameter config: Config defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'getInt' @ [21:29] ==> public abstract fun getInt(p0: (String..String?)): Int defined in com.typesafe.config.Config[JavaMethodDescriptor]

'X500Name' @ [22:24] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'config' @ [22:33] ==> value-parameter config: Config defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'getString' @ [22:40] ==> public abstract fun getString(p0: (String..String?)): (String..String?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'config' @ [23:29] ==> value-parameter config: Config defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'parseExtraServices' @ [23:36] ==> private final fun Config.parseExtraServices(path: String): List<String> defined in net.corda.demobench.model.InstallFactory[SimpleFunctionDescriptorImpl]

'createTempDirectory' @ [24:29] ==> public open fun createTempDirectory(p0: (Path..Path?), p1: (String..String?), vararg p2: (FileAttribute<*>..FileAttribute<*>?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'baseDir' @ [24:49] ==> value-parameter baseDir: Path defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'NodeConfig' @ [26:26] ==> public constructor NodeConfig(baseDir: Path, legalName: X500Name, p2pPort: Int, rpcPort: Int, webPort: Int, h2Port: Int, extraServices: List<String>, users: List<User> = ..., networkMap: NetworkMapConfig? = ...) defined in net.corda.demobench.model.NodeConfig[ClassConstructorDescriptorImpl]

'tempDir' @ [27:17] ==> val tempDir: (Path..Path?) defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'x500name' @ [28:17] ==> val x500name: X500Name defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'p2pPort' @ [29:17] ==> val p2pPort: Int defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'rpcPort' @ [30:17] ==> val rpcPort: Int defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'webPort' @ [31:17] ==> val webPort: Int defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'h2Port' @ [32:17] ==> val h2Port: Int defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'extraServices' @ [33:17] ==> val extraServices: List<String> defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'config' @ [34:17] ==> value-parameter config: Config defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'getObjectList' @ [34:24] ==> public abstract fun getObjectList(p0: (String..String?)): (MutableList<out (ConfigObject..ConfigObject?)>..List<(ConfigObject..ConfigObject?)>?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'map' @ [34:50] ==> public inline fun <T, R> Iterable<(ConfigObject..ConfigObject?)>.map(transform: ((ConfigObject..ConfigObject?)) -> User): List<User> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.typesafe.config.ConfigObject..com.typesafe.config.ConfigObject?)
    <R> -> User

'toUser' @ [34:56] ==> @Suppress public fun toUser(map: Map<String, Any>): User defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]

'it' @ [34:63] ==> value-parameter it: (ConfigObject..ConfigObject?) defined in net.corda.demobench.model.InstallFactory.toInstallConfig.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [34:66] ==> public abstract fun unwrapped(): (MutableMap<(String..String?), (Any..Any?)>..Map<(String..String?), (Any..Any?)>?) defined in com.typesafe.config.ConfigObject[JavaMethodDescriptor]

'toList' @ [34:81] ==> public fun <T> Iterable<User>.toList(): List<User> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'if (config.hasPath("networkMapService")) {
            val nmap = config.getConfig("networkMapService")
            nodeConfig.networkMap = NetworkMapConfig(X500Name(nmap.getString("legalName")), nmap.parsePort("address"))
        } else {
            log.info("Node '${nodeConfig.legalName}' is the network map")
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'config' @ [37:13] ==> value-parameter config: Config defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'hasPath' @ [37:20] ==> public abstract fun hasPath(p0: (String..String?)): Boolean defined in com.typesafe.config.Config[JavaMethodDescriptor]

'config' @ [38:24] ==> value-parameter config: Config defined in net.corda.demobench.model.InstallFactory.toInstallConfig[ValueParameterDescriptorImpl]

'getConfig' @ [38:31] ==> public abstract fun getConfig(p0: (String..String?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'nodeConfig' @ [39:13] ==> val nodeConfig: NodeConfig defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'networkMap' @ [39:24] ==> public final var networkMap: NetworkMapConfig? defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'NetworkMapConfig' @ [39:37] ==> public constructor NetworkMapConfig(legalName: X500Name, p2pPort: Int) defined in net.corda.demobench.model.NetworkMapConfig[ClassConstructorDescriptorImpl]

'X500Name' @ [39:54] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'nmap' @ [39:63] ==> val nmap: (Config..Config?) defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'getString' @ [39:68] ==> public abstract fun getString(p0: (String..String?)): (String..String?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'nmap' @ [39:93] ==> val nmap: (Config..Config?) defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'parsePort' @ [39:98] ==> private final fun Config.parsePort(path: String): Int defined in net.corda.demobench.model.InstallFactory[SimpleFunctionDescriptorImpl]

'log' @ [41:13] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.InstallFactory[DeserializedPropertyDescriptor]

'info' @ [41:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'nodeConfig' @ [41:31] ==> val nodeConfig: NodeConfig defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'legalName' @ [41:42] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'InstallConfig' @ [44:16] ==> internal constructor InstallConfig(baseDir: Path, config: NodeConfig) defined in net.corda.demobench.model.InstallConfig[ClassConstructorDescriptorImpl]

'tempDir' @ [44:30] ==> val tempDir: (Path..Path?) defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'nodeConfig' @ [44:39] ==> val nodeConfig: NodeConfig defined in net.corda.demobench.model.InstallFactory.toInstallConfig[LocalVariableDescriptor]

'this' @ [48:23] ==> <this> defined in net.corda.demobench.model.InstallFactory.parsePort[ReceiverParameterDescriptorImpl]

'getString' @ [48:28] ==> public abstract fun getString(p0: (String..String?)): (String..String?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'path' @ [48:38] ==> value-parameter path: String defined in net.corda.demobench.model.InstallFactory.parsePort[ValueParameterDescriptorImpl]

'address' @ [49:20] ==> val address: (String..String?) defined in net.corda.demobench.model.InstallFactory.parsePort[LocalVariableDescriptor]

'parseNetworkHostAndPort' @ [49:28] ==> public fun String.parseNetworkHostAndPort(): NetworkHostAndPort defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'port' @ [49:54] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'require' @ [50:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'nodeController' @ [50:17] ==> private final val nodeController: NodeController defined in net.corda.demobench.model.InstallFactory[PropertyDescriptorImpl]

'isPortValid' @ [50:32] ==> public final fun isPortValid(port: Int): Boolean defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'port' @ [50:44] ==> val port: Int defined in net.corda.demobench.model.InstallFactory.parsePort[LocalVariableDescriptor]

'port' @ [50:68] ==> val port: Int defined in net.corda.demobench.model.InstallFactory.parsePort[LocalVariableDescriptor]

'path' @ [50:80] ==> value-parameter path: String defined in net.corda.demobench.model.InstallFactory.parsePort[ValueParameterDescriptorImpl]

'port' @ [51:16] ==> val port: Int defined in net.corda.demobench.model.InstallFactory.parsePort[LocalVariableDescriptor]

'serviceController' @ [55:24] ==> private final val serviceController: ServiceController defined in net.corda.demobench.model.InstallFactory[PropertyDescriptorImpl]

'services' @ [55:42] ==> public final val services: List<String> defined in net.corda.demobench.model.ServiceController[PropertyDescriptorImpl]

'toSortedSet' @ [55:51] ==> public fun <T : Comparable<String>> Iterable<String>.toSortedSet(): SortedSet<String> /* = SortedSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'this' @ [56:16] ==> <this> defined in net.corda.demobench.model.InstallFactory.parseExtraServices[ReceiverParameterDescriptorImpl]

'getStringList' @ [56:21] ==> public abstract fun getStringList(p0: (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'path' @ [56:35] ==> value-parameter path: String defined in net.corda.demobench.model.InstallFactory.parseExtraServices[ValueParameterDescriptorImpl]

'filter' @ [57:18] ==> public inline fun <T> Iterable<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'!' @ [57:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [57:28] ==> value-parameter it: (String..String?) defined in net.corda.demobench.model.InstallFactory.parseExtraServices.<anonymous>[ValueParameterDescriptorImpl]

'isNullOrEmpty' @ [57:31] ==> @InlineOnly public inline fun CharSequence?.isNullOrEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [58:18] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> (kotlin.String..kotlin.String?)

'require' @ [59:21] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'svc' @ [59:29] ==> value-parameter svc: (String..String?) defined in net.corda.demobench.model.InstallFactory.parseExtraServices.<anonymous>[ValueParameterDescriptorImpl]

'services' @ [59:36] ==> val services: SortedSet<String> /* = SortedSet<String> */ defined in net.corda.demobench.model.InstallFactory.parseExtraServices[LocalVariableDescriptor]

'svc' @ [59:67] ==> value-parameter svc: (String..String?) defined in net.corda.demobench.model.InstallFactory.parseExtraServices.<anonymous>[ValueParameterDescriptorImpl]

'svc' @ [60:21] ==> value-parameter svc: (String..String?) defined in net.corda.demobench.model.InstallFactory.parseExtraServices.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [61:19] ==> public fun <T> Iterable<(String..String?)>.toList(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'config' @ [71:15] ==> private final val config: NodeConfig defined in net.corda.demobench.model.InstallConfig[PropertyDescriptorImpl]

'key' @ [71:22] ==> public final val key: String defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'baseDir' @ [72:36] ==> public final val baseDir: Path defined in net.corda.demobench.model.InstallConfig[PropertyDescriptorImpl]

'resolve' @ [72:44] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'baseDir' @ [74:36] ==> public final val baseDir: Path defined in net.corda.demobench.model.InstallConfig[PropertyDescriptorImpl]

'toFile' @ [74:44] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'deleteRecursively' @ [74:53] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'config' @ [75:39] ==> private final val config: NodeConfig defined in net.corda.demobench.model.InstallConfig[PropertyDescriptorImpl]

'moveTo' @ [75:46] ==> public final fun moveTo(baseDir: Path): NodeConfig defined in net.corda.demobench.model.NodeConfig[SimpleFunctionDescriptorImpl]

'installDir' @ [75:53] ==> value-parameter installDir: Path defined in net.corda.demobench.model.InstallConfig.installTo[ValueParameterDescriptorImpl]

