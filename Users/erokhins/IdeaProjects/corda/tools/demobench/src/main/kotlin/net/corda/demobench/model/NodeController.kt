'checkExists' @ [16:43] ==> public fun checkExists(path: Path, header: String): Unit defined in net.corda.demobench.model in file JVMConfig.kt[SimpleFunctionDescriptorImpl]

'Controller' @ [16:58] ==> public constructor Controller() defined in tornadofx.Controller[DeserializedClassConstructorDescriptor]

'inject' @ [23:24] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, JVMConfig> where T : Injectable defined in net.corda.demobench.model.NodeController[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> JVMConfig

'inject' @ [24:37] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, PluginController> where T : Injectable defined in net.corda.demobench.model.NodeController[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> PluginController

'baseDirFor' @ [26:33] ==> private final fun baseDirFor(time: Long): Path defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'getRuntimeMXBean' @ [26:62] ==> public open fun getRuntimeMXBean(): (RuntimeMXBean..RuntimeMXBean?) defined in java.lang.management.ManagementFactory[JavaMethodDescriptor]

'startTime' @ [26:81] ==> public final val RuntimeMXBean.startTime: Long[MyPropertyDescriptor]

'jvm' @ [27:35] ==> private final val jvm: JVMConfig defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'applicationDir' @ [27:39] ==> public final val applicationDir: Path defined in net.corda.demobench.model.JVMConfig[PropertyDescriptorImpl]

'resolve' @ [27:54] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'resolve' @ [27:71] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'jvm' @ [28:27] ==> private final val jvm: JVMConfig defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'commandFor' @ [28:31] ==> public final fun commandFor(jarPath: Path, vararg args: String): List<String> defined in net.corda.demobench.model.JVMConfig[SimpleFunctionDescriptorImpl]

'cordaPath' @ [28:42] ==> private final val cordaPath: Path defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'toTypedArray' @ [28:53] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'LinkedHashMap' @ [30:25] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> NodeConfig

'AtomicInteger' @ [31:24] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'firstPort' @ [31:38] ==> public const final val firstPort: Int defined in net.corda.demobench.model.NodeController.Companion[PropertyDescriptorImpl]

'nodes' @ [35:47] ==> private final val nodes: LinkedHashMap<String, NodeConfig> defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'values' @ [35:53] ==> public open val values: MutableCollection<NodeConfig> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'filter' @ [35:60] ==> public inline fun <T> Iterable<NodeConfig>.filter(predicate: (NodeConfig) -> Boolean): List<NodeConfig> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeConfig

'it' @ [36:10] ==> value-parameter it: NodeConfig defined in net.corda.demobench.model.NodeController.<get-activeNodes>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [36:13] ==> public final var state: NodeState defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'RUNNING' @ [36:32] ==> enum entry RUNNING defined in net.corda.demobench.model.NodeState[FakeCallableDescriptorForObject]

'it' @ [36:45] ==> value-parameter it: NodeConfig defined in net.corda.demobench.model.NodeController.<get-activeNodes>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [36:48] ==> public final var state: NodeState defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'STARTING' @ [36:67] ==> enum entry STARTING defined in net.corda.demobench.model.NodeState[FakeCallableDescriptorForObject]

'log' @ [40:9] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'info' @ [40:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'baseDir' @ [40:36] ==> private final var baseDir: Path defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'log' @ [41:9] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'info' @ [41:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'cordaPath' @ [41:31] ==> private final val cordaPath: Path defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'invoke' @ [45:9] ==> public abstract operator fun invoke(p1: Path, p2: String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'cordaPath' @ [45:15] ==> private final val cordaPath: Path defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'nodeData' @ [52:24] ==> value-parameter nodeData: NodeData defined in net.corda.demobench.model.NodeController.validate[ValueParameterDescriptorImpl]

'nearestCity' @ [52:33] ==> public final val nearestCity: SimpleObjectProperty<(WorldMapLocation..WorldMapLocation?)> defined in net.corda.demobench.model.NodeData[PropertyDescriptorImpl]

'value' @ [52:45] ==> public final var <T : (Any..Any?)> SimpleObjectProperty<(WorldMapLocation..WorldMapLocation?)>.value: (WorldMapLocation..WorldMapLocation?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'NodeConfig' @ [53:22] ==> public constructor NodeConfig(baseDir: Path, legalName: X500Name, p2pPort: Int, rpcPort: Int, webPort: Int, h2Port: Int, extraServices: List<String>, users: List<User> = ..., networkMap: NetworkMapConfig? = ...) defined in net.corda.demobench.model.NodeConfig[ClassConstructorDescriptorImpl]

'baseDir' @ [54:17] ==> private final var baseDir: Path defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'getX509Name' @ [55:17] ==> @JvmOverloads public fun getX509Name(myLegalName: String, nearestCity: String, email: String, country: String? = ...): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'nodeData' @ [56:35] ==> value-parameter nodeData: NodeData defined in net.corda.demobench.model.NodeController.validate[ValueParameterDescriptorImpl]

'legalName' @ [56:44] ==> public final val legalName: SimpleStringProperty defined in net.corda.demobench.model.NodeData[PropertyDescriptorImpl]

'value' @ [56:54] ==> public final var SimpleStringProperty.value: (String..String?)[MyPropertyDescriptor]

'trim' @ [56:60] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'location' @ [57:43] ==> val location: (WorldMapLocation..WorldMapLocation?) defined in net.corda.demobench.model.NodeController.validate[LocalVariableDescriptor]

'countryCode' @ [57:52] ==> public final val countryCode: String defined in net.corda.core.node.WorldMapLocation[DeserializedPropertyDescriptor]

'toLowerCase' @ [57:64] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'location' @ [58:35] ==> val location: (WorldMapLocation..WorldMapLocation?) defined in net.corda.demobench.model.NodeController.validate[LocalVariableDescriptor]

'description' @ [58:44] ==> public final val description: String defined in net.corda.core.node.WorldMapLocation[DeserializedPropertyDescriptor]

'location' @ [59:31] ==> val location: (WorldMapLocation..WorldMapLocation?) defined in net.corda.demobench.model.NodeController.validate[LocalVariableDescriptor]

'countryCode' @ [59:40] ==> public final val countryCode: String defined in net.corda.core.node.WorldMapLocation[DeserializedPropertyDescriptor]

'nodeData' @ [61:17] ==> value-parameter nodeData: NodeData defined in net.corda.demobench.model.NodeController.validate[ValueParameterDescriptorImpl]

'p2pPort' @ [61:26] ==> public final val p2pPort: SimpleIntegerProperty defined in net.corda.demobench.model.NodeData[PropertyDescriptorImpl]

'value' @ [61:34] ==> public final var SimpleIntegerProperty.value: (Int..Int?)[MyPropertyDescriptor]

'nodeData' @ [62:17] ==> value-parameter nodeData: NodeData defined in net.corda.demobench.model.NodeController.validate[ValueParameterDescriptorImpl]

'rpcPort' @ [62:26] ==> public final val rpcPort: SimpleIntegerProperty defined in net.corda.demobench.model.NodeData[PropertyDescriptorImpl]

'value' @ [62:34] ==> public final var SimpleIntegerProperty.value: (Int..Int?)[MyPropertyDescriptor]

'nodeData' @ [63:17] ==> value-parameter nodeData: NodeData defined in net.corda.demobench.model.NodeController.validate[ValueParameterDescriptorImpl]

'webPort' @ [63:26] ==> public final val webPort: SimpleIntegerProperty defined in net.corda.demobench.model.NodeData[PropertyDescriptorImpl]

'value' @ [63:34] ==> public final var SimpleIntegerProperty.value: (Int..Int?)[MyPropertyDescriptor]

'nodeData' @ [64:17] ==> value-parameter nodeData: NodeData defined in net.corda.demobench.model.NodeController.validate[ValueParameterDescriptorImpl]

'h2Port' @ [64:26] ==> public final val h2Port: SimpleIntegerProperty defined in net.corda.demobench.model.NodeData[PropertyDescriptorImpl]

'value' @ [64:33] ==> public final var SimpleIntegerProperty.value: (Int..Int?)[MyPropertyDescriptor]

'nodeData' @ [65:17] ==> value-parameter nodeData: NodeData defined in net.corda.demobench.model.NodeController.validate[ValueParameterDescriptorImpl]

'extraServices' @ [65:26] ==> public final val extraServices: SimpleListProperty<(String..String?)> defined in net.corda.demobench.model.NodeData[PropertyDescriptorImpl]

'value' @ [65:40] ==> public final var <E : (Any..Any?)> SimpleListProperty<(String..String?)>.value: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'nodes' @ [68:13] ==> private final val nodes: LinkedHashMap<String, NodeConfig> defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'putIfAbsent' @ [68:19] ==> public open fun putIfAbsent(p0: String, p1: NodeConfig): NodeConfig? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'config' @ [68:31] ==> val config: NodeConfig defined in net.corda.demobench.model.NodeController.validate[LocalVariableDescriptor]

'key' @ [68:38] ==> public final val key: String defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'config' @ [68:43] ==> val config: NodeConfig defined in net.corda.demobench.model.NodeController.validate[LocalVariableDescriptor]

'log' @ [69:13] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'warning' @ [69:17] ==> public open fun warning(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'config' @ [69:43] ==> val config: NodeConfig defined in net.corda.demobench.model.NodeController.validate[LocalVariableDescriptor]

'key' @ [69:50] ==> public final val key: String defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'chooseNetworkMap' @ [74:9] ==> private final fun chooseNetworkMap(config: NodeConfig): Unit defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'config' @ [74:26] ==> val config: NodeConfig defined in net.corda.demobench.model.NodeController.validate[LocalVariableDescriptor]

'config' @ [76:16] ==> val config: NodeConfig defined in net.corda.demobench.model.NodeController.validate[LocalVariableDescriptor]

'config' @ [80:9] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.dispose[ValueParameterDescriptorImpl]

'state' @ [80:16] ==> public final var state: NodeState defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'DEAD' @ [80:34] ==> enum entry DEAD defined in net.corda.demobench.model.NodeState[FakeCallableDescriptorForObject]

'config' @ [82:13] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.dispose[ValueParameterDescriptorImpl]

'networkMap' @ [82:20] ==> public final var networkMap: NetworkMapConfig? defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'log' @ [83:13] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'warning' @ [83:17] ==> public open fun warning(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'config' @ [83:55] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.dispose[ValueParameterDescriptorImpl]

'legalName' @ [83:62] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'port' @ [87:31] ==> private final val port: AtomicInteger defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'andIncrement' @ [87:36] ==> public final val AtomicInteger.andIncrement: Int[MyPropertyDescriptor]

'port' @ [89:35] ==> value-parameter port: Int defined in net.corda.demobench.model.NodeController.isPortValid[ValueParameterDescriptorImpl]

'minPort' @ [89:43] ==> public const final val minPort: Int defined in net.corda.demobench.model.NodeController.Companion[PropertyDescriptorImpl]

'port' @ [89:56] ==> value-parameter port: Int defined in net.corda.demobench.model.NodeController.isPortValid[ValueParameterDescriptorImpl]

'maxPort' @ [89:64] ==> public const final val maxPort: Int defined in net.corda.demobench.model.NodeController.Companion[PropertyDescriptorImpl]

'nodes' @ [91:34] ==> private final val nodes: LinkedHashMap<String, NodeConfig> defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'keys' @ [91:40] ==> public open val keys: MutableSet<String> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'contains' @ [91:45] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'key' @ [91:54] ==> value-parameter key: String defined in net.corda.demobench.model.NodeController.keyExists[ValueParameterDescriptorImpl]

'keyExists' @ [93:36] ==> public final fun keyExists(key: String): Boolean defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'name' @ [93:46] ==> value-parameter name: String defined in net.corda.demobench.model.NodeController.nameExists[ValueParameterDescriptorImpl]

'toKey' @ [93:51] ==> public fun String.toKey(): String defined in net.corda.demobench.model in file NetworkMapConfig.kt[SimpleFunctionDescriptorImpl]

'networkMapConfig' @ [95:36] ==> private final var networkMapConfig: NetworkMapConfig? defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'if (hasNetworkMap()) {
            config.networkMap = networkMapConfig
        } else {
            networkMapConfig = config
            log.info("Network map provided by: ${config.legalName}")
        }' @ [98:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'hasNetworkMap' @ [98:13] ==> public final fun hasNetworkMap(): Boolean defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'config' @ [99:13] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.chooseNetworkMap[ValueParameterDescriptorImpl]

'networkMap' @ [99:20] ==> public final var networkMap: NetworkMapConfig? defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'networkMapConfig' @ [99:33] ==> private final var networkMapConfig: NetworkMapConfig? defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'networkMapConfig' @ [101:13] ==> private final var networkMapConfig: NetworkMapConfig? defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'config' @ [101:32] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.chooseNetworkMap[ValueParameterDescriptorImpl]

'log' @ [102:13] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'info' @ [102:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'config' @ [102:50] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.chooseNetworkMap[ValueParameterDescriptorImpl]

'legalName' @ [102:57] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'config' @ [107:23] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.runCorda[ValueParameterDescriptorImpl]

'nodeDir' @ [107:30] ==> public final val nodeDir: Path defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'toFile' @ [107:38] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'if (nodeDir.forceDirectory()) {
            try {
                // Install any built-in plugins into the working directory.
                pluginController.populate(config)

                // Write this node's configuration file into its working directory.
                val confFile = nodeDir.resolve("node.conf")
                confFile.writeText(config.toText())

                // Execute the Corda node
                val cordaEnv = System.getenv().toMutableMap().apply {
                    jvm.setCapsuleCacheDir(this)
                }
                pty.run(command, cordaEnv, nodeDir.toString())
                log.info("Launched node: ${config.legalName}")
                return true
            } catch (e: Exception) {
                log.log(Level.SEVERE, "Failed to launch Corda: ${e.message}", e)
                return false
            }
        } else {
            return false
        }' @ [109:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'nodeDir' @ [109:13] ==> val nodeDir: (File..File?) defined in net.corda.demobench.model.NodeController.runCorda[LocalVariableDescriptor]

'forceDirectory' @ [109:21] ==> public fun File.forceDirectory(): Boolean defined in net.corda.demobench.model in file NodeConfig.kt[SimpleFunctionDescriptorImpl]

'pluginController' @ [112:17] ==> private final val pluginController: PluginController defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'populate' @ [112:34] ==> @Throws public final fun populate(config: NodeConfig): Unit defined in net.corda.demobench.plugin.PluginController[SimpleFunctionDescriptorImpl]

'config' @ [112:43] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.runCorda[ValueParameterDescriptorImpl]

'nodeDir' @ [115:32] ==> val nodeDir: (File..File?) defined in net.corda.demobench.model.NodeController.runCorda[LocalVariableDescriptor]

'resolve' @ [115:40] ==> public fun File.resolve(relative: String): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'confFile' @ [116:17] ==> val confFile: File defined in net.corda.demobench.model.NodeController.runCorda[LocalVariableDescriptor]

'writeText' @ [116:26] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'config' @ [116:36] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.runCorda[ValueParameterDescriptorImpl]

'toText' @ [116:43] ==> public final fun toText(): String defined in net.corda.demobench.model.NodeConfig[SimpleFunctionDescriptorImpl]

'getenv' @ [119:39] ==> public open fun getenv(): (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?) defined in java.lang.System[JavaMethodDescriptor]

'toMutableMap' @ [119:48] ==> @SinceKotlin public fun <K, V> Map<out (String..String?), (String..String?)>.toMutableMap(): MutableMap<(String..String?), (String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.String..kotlin.String?)

'apply' @ [119:63] ==> @InlineOnly public inline fun <T> MutableMap<(String..String?), (String..String?)>.apply(block: MutableMap<(String..String?), (String..String?)>.() -> Unit): MutableMap<(String..String?), (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableMap<(kotlin.String..kotlin.String?), (kotlin.String..kotlin.String?)>

'jvm' @ [120:21] ==> private final val jvm: JVMConfig defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'setCapsuleCacheDir' @ [120:25] ==> public final fun setCapsuleCacheDir(env: MutableMap<String, String>): MutableMap<String, String> defined in net.corda.demobench.model.JVMConfig[SimpleFunctionDescriptorImpl]

'this' @ [120:44] ==> <this> defined in net.corda.demobench.model.NodeController.runCorda.<anonymous>[ReceiverParameterDescriptorImpl]

'pty' @ [122:17] ==> value-parameter pty: R3Pty defined in net.corda.demobench.model.NodeController.runCorda[ValueParameterDescriptorImpl]

'run' @ [122:21] ==> @Throws public final fun run(args: Array<String>, envs: Map<String, String>, workingDir: String?): Unit defined in net.corda.demobench.pty.R3Pty[SimpleFunctionDescriptorImpl]

'command' @ [122:25] ==> private final val command: Array<String> defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'cordaEnv' @ [122:34] ==> val cordaEnv: MutableMap<(String..String?), (String..String?)> defined in net.corda.demobench.model.NodeController.runCorda[LocalVariableDescriptor]

'nodeDir' @ [122:44] ==> val nodeDir: (File..File?) defined in net.corda.demobench.model.NodeController.runCorda[LocalVariableDescriptor]

'toString' @ [122:52] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'log' @ [123:17] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'info' @ [123:21] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'config' @ [123:44] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.runCorda[ValueParameterDescriptorImpl]

'legalName' @ [123:51] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'log' @ [126:17] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'log' @ [126:21] ==> public open fun log(p0: (Level..Level?), p1: (String..String?), p2: (Throwable..Throwable?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'SEVERE' @ [126:31] ==> public final val SEVERE: (Level..Level?) defined in java.util.logging.Level[JavaPropertyDescriptor]

'e' @ [126:66] ==> val e: Exception /* = Exception */ defined in net.corda.demobench.model.NodeController.runCorda[LocalVariableDescriptor]

'message' @ [126:68] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [126:79] ==> val e: Exception /* = Exception */ defined in net.corda.demobench.model.NodeController.runCorda[LocalVariableDescriptor]

'baseDir' @ [135:9] ==> private final var baseDir: Path defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'baseDirFor' @ [135:19] ==> private final fun baseDirFor(time: Long): Path defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'currentTimeMillis' @ [135:37] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'log' @ [136:9] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'info' @ [136:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'baseDir' @ [136:44] ==> private final var baseDir: Path defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'networkMapConfig' @ [139:9] ==> private final var networkMapConfig: NetworkMapConfig? defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'nodes' @ [140:9] ==> private final val nodes: LinkedHashMap<String, NodeConfig> defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'clear' @ [140:15] ==> public open fun clear(): Unit defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'nodes' @ [147:13] ==> private final val nodes: LinkedHashMap<String, NodeConfig> defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'putIfAbsent' @ [147:19] ==> public open fun putIfAbsent(p0: String, p1: NodeConfig): NodeConfig? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'config' @ [147:31] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.register[ValueParameterDescriptorImpl]

'key' @ [147:38] ==> public final val key: String defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'config' @ [147:43] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.register[ValueParameterDescriptorImpl]

'updatePort' @ [151:9] ==> private final fun updatePort(config: NodeConfig): Unit defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'config' @ [151:20] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.register[ValueParameterDescriptorImpl]

'networkMapConfig' @ [153:14] ==> private final var networkMapConfig: NetworkMapConfig? defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'config' @ [153:43] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.register[ValueParameterDescriptorImpl]

'isNetworkMap' @ [153:50] ==> public final fun isNetworkMap(): Boolean defined in net.corda.demobench.model.NodeConfig[SimpleFunctionDescriptorImpl]

'networkMapConfig' @ [154:13] ==> private final var networkMapConfig: NetworkMapConfig? defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'config' @ [154:32] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.register[ValueParameterDescriptorImpl]

'Throws' @ [163:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'IOException' @ [163:13] ==> public constructor IOException() defined in java.io.IOException[JavaClassConstructorDescriptor]

'config' @ [165:25] ==> value-parameter config: InstallConfig defined in net.corda.demobench.model.NodeController.install[ValueParameterDescriptorImpl]

'installTo' @ [165:32] ==> public final fun installTo(installDir: Path): NodeConfig defined in net.corda.demobench.model.InstallConfig[SimpleFunctionDescriptorImpl]

'baseDir' @ [165:42] ==> private final var baseDir: Path defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'pluginController' @ [167:9] ==> private final val pluginController: PluginController defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'userPluginsFor' @ [167:26] ==> @Throws public final fun userPluginsFor(config: HasPlugins): Stream<Path> defined in net.corda.demobench.plugin.PluginController[SimpleFunctionDescriptorImpl]

'config' @ [167:41] ==> value-parameter config: InstallConfig defined in net.corda.demobench.model.NodeController.install[ValueParameterDescriptorImpl]

'forEach' @ [167:49] ==> public final fun forEach(p0: (((Path..Path?)) -> Unit..(((Path..Path?)) -> Unit)?)): Unit defined in java.util.stream.Stream[MyFunctionDescriptor]

'createDirectories' @ [168:35] ==> public open fun createDirectories(p0: (Path..Path?), vararg p1: (FileAttribute<*>..FileAttribute<*>?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'installed' @ [168:53] ==> val installed: NodeConfig defined in net.corda.demobench.model.NodeController.install[LocalVariableDescriptor]

'pluginDir' @ [168:63] ==> public open val pluginDir: Path defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'copy' @ [169:32] ==> public open fun copy(p0: (Path..Path?), p1: (Path..Path?), vararg p2: (CopyOption..CopyOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'it' @ [169:37] ==> value-parameter it: (Path..Path?) defined in net.corda.demobench.model.NodeController.install.<anonymous>[ValueParameterDescriptorImpl]

'pluginDir' @ [169:41] ==> val pluginDir: (Path..Path?) defined in net.corda.demobench.model.NodeController.install.<anonymous>[LocalVariableDescriptor]

'resolve' @ [169:51] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'it' @ [169:59] ==> value-parameter it: (Path..Path?) defined in net.corda.demobench.model.NodeController.install.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [169:62] ==> public final val Path.fileName: (Path..Path?)[MyPropertyDescriptor]

'toString' @ [169:71] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'log' @ [170:13] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'info' @ [170:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'plugin' @ [170:35] ==> val plugin: (Path..Path?) defined in net.corda.demobench.model.NodeController.install.<anonymous>[LocalVariableDescriptor]

'!' @ [173:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'config' @ [173:14] ==> value-parameter config: InstallConfig defined in net.corda.demobench.model.NodeController.install[ValueParameterDescriptorImpl]

'deleteBaseDir' @ [173:21] ==> public final fun deleteBaseDir(): Boolean defined in net.corda.demobench.model.InstallConfig[SimpleFunctionDescriptorImpl]

'log' @ [174:13] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.model.NodeController[DeserializedPropertyDescriptor]

'warning' @ [174:17] ==> public open fun warning(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'config' @ [174:46] ==> value-parameter config: InstallConfig defined in net.corda.demobench.model.NodeController.install[ValueParameterDescriptorImpl]

'baseDir' @ [174:53] ==> public final val baseDir: Path defined in net.corda.demobench.model.InstallConfig[PropertyDescriptorImpl]

'installed' @ [177:16] ==> val installed: NodeConfig defined in net.corda.demobench.model.NodeController.install[LocalVariableDescriptor]

'+' @ [181:24] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [181:28] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Int): Array<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Int

'config' @ [181:36] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.updatePort[ValueParameterDescriptorImpl]

'p2pPort' @ [181:43] ==> public final val p2pPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'config' @ [181:52] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.updatePort[ValueParameterDescriptorImpl]

'rpcPort' @ [181:59] ==> public final val rpcPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'config' @ [181:68] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.updatePort[ValueParameterDescriptorImpl]

'webPort' @ [181:75] ==> public final val webPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'config' @ [181:84] ==> value-parameter config: NodeConfig defined in net.corda.demobench.model.NodeController.updatePort[ValueParameterDescriptorImpl]

'h2Port' @ [181:91] ==> public final val h2Port: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'max' @ [181:99] ==> public fun <T : Comparable<Int>> Array<out Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'port' @ [182:9] ==> private final val port: AtomicInteger defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'getAndUpdate' @ [182:14] ==> public final fun getAndUpdate(p0: ((Int) -> Int..((Int) -> Int)?)): Int defined in java.util.concurrent.atomic.AtomicInteger[MyFunctionDescriptor]

'max' @ [182:34] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'nextPort' @ [182:38] ==> val nextPort: Int defined in net.corda.demobench.model.NodeController.updatePort[LocalVariableDescriptor]

'it' @ [182:48] ==> value-parameter it: Int defined in net.corda.demobench.model.NodeController.updatePort.<anonymous>[ValueParameterDescriptorImpl]

'jvm' @ [185:48] ==> private final val jvm: JVMConfig defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'dataHome' @ [185:52] ==> public final val dataHome: Path defined in net.corda.demobench.model.JVMConfig[PropertyDescriptorImpl]

'resolve' @ [185:61] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'localFor' @ [185:69] ==> private final fun localFor(time: Long): (String..String?) defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'time' @ [185:78] ==> value-parameter time: Long defined in net.corda.demobench.model.NodeController.baseDirFor[ValueParameterDescriptorImpl]

'SimpleDateFormat' @ [186:40] ==> public constructor SimpleDateFormat(p0: (String..String?)) defined in java.text.SimpleDateFormat[JavaClassConstructorDescriptor]

'format' @ [186:75] ==> public final fun format(p0: (Date..Date?)): (String..String?) defined in java.text.SimpleDateFormat[JavaMethodDescriptor]

'Date' @ [186:82] ==> public constructor Date(p0: Long) defined in java.util.Date[JavaClassConstructorDescriptor]

'time' @ [186:87] ==> value-parameter time: Long defined in net.corda.demobench.model.NodeController.localFor[ValueParameterDescriptorImpl]

