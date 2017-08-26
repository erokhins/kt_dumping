'listOf' @ [20:33] ==> public fun <T> listOf(element: User): List<User> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User

'defaultUser' @ [20:40] ==> public final val defaultUser: User defined in net.corda.demobench.model.NodeConfig.Companion[PropertyDescriptorImpl]

'NetworkMapConfig' @ [22:5] ==> public constructor NetworkMapConfig(legalName: X500Name, p2pPort: Int) defined in net.corda.demobench.model.NetworkMapConfig[ClassConstructorDescriptorImpl]

'legalName' @ [22:22] ==> value-parameter legalName: X500Name defined in net.corda.demobench.model.NodeConfig.<init>[ValueParameterDescriptorImpl]

'p2pPort' @ [22:33] ==> value-parameter p2pPort: Int defined in net.corda.demobench.model.NodeConfig.<init>[ValueParameterDescriptorImpl]

'defaults' @ [25:70] ==> public open fun defaults(): (ConfigRenderOptions..ConfigRenderOptions?) defined in com.typesafe.config.ConfigRenderOptions[JavaMethodDescriptor]

'setOriginComments' @ [25:81] ==> public open fun setOriginComments(p0: Boolean): (ConfigRenderOptions..ConfigRenderOptions?) defined in com.typesafe.config.ConfigRenderOptions[JavaMethodDescriptor]

'user' @ [26:27] ==> public fun user(name: String): User defined in net.corda.demobench.model in file User.kt[SimpleFunctionDescriptorImpl]

'legalName' @ [29:31] ==> value-parameter legalName: X500Name defined in net.corda.demobench.model.NodeConfig.<init>[ValueParameterDescriptorImpl]

'locationOrNull' @ [29:41] ==> public val X500Name.locationOrNull: String? defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'baseDir' @ [30:25] ==> value-parameter baseDir: Path defined in net.corda.demobench.model.NodeConfig.<init>[ValueParameterDescriptorImpl]

'resolve' @ [30:33] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'key' @ [30:41] ==> public final val key: String defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'nodeDir' @ [31:36] ==> public final val nodeDir: Path defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'resolve' @ [31:44] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'baseDir' @ [32:29] ==> value-parameter baseDir: Path defined in net.corda.demobench.model.NodeConfig.<init>[ValueParameterDescriptorImpl]

'resolve' @ [32:37] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'key' @ [32:47] ==> public final val key: String defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'STARTING' @ [34:38] ==> enum entry STARTING defined in net.corda.demobench.model.NodeState[FakeCallableDescriptorForObject]

'extraServices' @ [36:33] ==> public final val extraServices: List<String> defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'any' @ [36:47] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [37:9] ==> value-parameter it: String defined in net.corda.demobench.model.NodeConfig.isCashIssuer.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [37:12] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'networkMap' @ [40:35] ==> public final var networkMap: NetworkMapConfig? defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'empty' @ [46:48] ==> public open fun empty(): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'withValue' @ [47:14] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'valueFor' @ [47:39] ==> private fun <T> valueFor(any: String): ConfigValue? defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'legalName' @ [47:48] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'toString' @ [47:58] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'withValue' @ [48:14] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'addressValueFor' @ [48:38] ==> private fun addressValueFor(port: Int): ConfigValue? defined in net.corda.demobench.model in file NodeConfig.kt[SimpleFunctionDescriptorImpl]

'p2pPort' @ [48:54] ==> public final val p2pPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'withValue' @ [49:14] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'valueFor' @ [49:53] ==> private fun <T> valueFor(any: List<String>): ConfigValue? defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<String>

'extraServices' @ [49:62] ==> public final val extraServices: List<String> defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'withFallback' @ [50:14] ==> public abstract fun withFallback(p0: (ConfigMergeable..ConfigMergeable?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'optional' @ [50:27] ==> private inline fun <T> optional(path: String, obj: NetworkMapConfig?, body: (Config, NetworkMapConfig) -> Config): Config defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> NetworkMapConfig

'networkMap' @ [50:57] ==> public final var networkMap: NetworkMapConfig? defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'c' @ [51:17] ==> value-parameter c: Config defined in net.corda.demobench.model.NodeConfig.toFileConfig.<anonymous>[ValueParameterDescriptorImpl]

'withValue' @ [51:19] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'addressValueFor' @ [51:40] ==> private fun addressValueFor(port: Int): ConfigValue? defined in net.corda.demobench.model in file NodeConfig.kt[SimpleFunctionDescriptorImpl]

'n' @ [51:56] ==> value-parameter n: NetworkMapConfig defined in net.corda.demobench.model.NodeConfig.toFileConfig.<anonymous>[ValueParameterDescriptorImpl]

'p2pPort' @ [51:58] ==> public final val p2pPort: Int defined in net.corda.demobench.model.NetworkMapConfig[PropertyDescriptorImpl]

'withValue' @ [52:22] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'valueFor' @ [52:45] ==> private fun <T> valueFor(any: String): ConfigValue? defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'n' @ [52:54] ==> value-parameter n: NetworkMapConfig defined in net.corda.demobench.model.NodeConfig.toFileConfig.<anonymous>[ValueParameterDescriptorImpl]

'legalName' @ [52:56] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NetworkMapConfig[PropertyDescriptorImpl]

'toString' @ [52:66] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'withValue' @ [54:14] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'addressValueFor' @ [54:38] ==> private fun addressValueFor(port: Int): ConfigValue? defined in net.corda.demobench.model in file NodeConfig.kt[SimpleFunctionDescriptorImpl]

'webPort' @ [54:54] ==> public final val webPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'withValue' @ [55:14] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'addressValueFor' @ [55:38] ==> private fun addressValueFor(port: Int): ConfigValue? defined in net.corda.demobench.model in file NodeConfig.kt[SimpleFunctionDescriptorImpl]

'rpcPort' @ [55:54] ==> public final val rpcPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'withValue' @ [56:14] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'valueFor' @ [56:36] ==> private fun <T> valueFor(any: List<Map<String, Any>>): ConfigValue? defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<Map<String, Any>>

'users' @ [56:45] ==> public final val users: List<User> defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'map' @ [56:51] ==> public inline fun <T, R> Iterable<User>.map(transform: (User) -> Map<String, Any>): List<Map<String, Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> User
    <R> -> Map<String, Any>

'User' @ [56:55] ==> public constructor User(username: String, password: String, permissions: Set<String>) defined in net.corda.nodeapi.User[DeserializedClassConstructorDescriptor]

'toMap' @ [56:61] ==> public final fun toMap(): Map<String, Any> defined in net.corda.nodeapi.User[DeserializedSimpleFunctionDescriptor]

'toList' @ [56:68] ==> public fun <T> Iterable<Map<String, Any>>.toList(): List<Map<String, Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<String, Any>

'withValue' @ [57:14] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'valueFor' @ [57:34] ==> private fun <T> valueFor(any: Int): ConfigValue? defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'h2Port' @ [57:43] ==> public final val h2Port: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'withValue' @ [58:14] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'valueFor' @ [58:40] ==> private fun <T> valueFor(any: Boolean): ConfigValue? defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'withValue' @ [59:14] ==> public abstract fun withValue(p0: (String..String?), p1: (ConfigValue..ConfigValue?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'valueFor' @ [59:42] ==> private fun <T> valueFor(any: Boolean): ConfigValue? defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'toFileConfig' @ [61:28] ==> public final fun toFileConfig(): Config defined in net.corda.demobench.model.NodeConfig[SimpleFunctionDescriptorImpl]

'root' @ [61:43] ==> public abstract fun root(): (ConfigObject..ConfigObject?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'render' @ [61:50] ==> public abstract fun render(p0: (ConfigRenderOptions..ConfigRenderOptions?)): (String..String?) defined in com.typesafe.config.ConfigObject[JavaMethodDescriptor]

'renderOptions' @ [61:57] ==> public final val renderOptions: ConfigRenderOptions defined in net.corda.demobench.model.NodeConfig.Companion[PropertyDescriptorImpl]

'NodeConfig' @ [63:33] ==> public constructor NodeConfig(baseDir: Path, legalName: X500Name, p2pPort: Int, rpcPort: Int, webPort: Int, h2Port: Int, extraServices: List<String>, users: List<User> = ..., networkMap: NetworkMapConfig? = ...) defined in net.corda.demobench.model.NodeConfig[ClassConstructorDescriptorImpl]

'baseDir' @ [64:9] ==> value-parameter baseDir: Path defined in net.corda.demobench.model.NodeConfig.moveTo[ValueParameterDescriptorImpl]

'legalName' @ [64:18] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'p2pPort' @ [64:29] ==> public final val p2pPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'rpcPort' @ [64:38] ==> public final val rpcPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'webPort' @ [64:47] ==> public final val webPort: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'h2Port' @ [64:56] ==> public final val h2Port: Int defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'extraServices' @ [64:64] ==> public final val extraServices: List<String> defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'users' @ [64:79] ==> public final val users: List<User> defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'networkMap' @ [64:86] ==> public final var networkMap: NetworkMapConfig? defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'plugins' @ [68:13] ==> value-parameter plugins: Collection<Path> defined in net.corda.demobench.model.NodeConfig.install[ValueParameterDescriptorImpl]

'isNotEmpty' @ [68:21] ==> @InlineOnly public inline fun <T> Collection<Path>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'pluginDir' @ [68:37] ==> public open val pluginDir: Path defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'toFile' @ [68:47] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'forceDirectory' @ [68:56] ==> public fun File.forceDirectory(): Boolean defined in net.corda.demobench.model in file NodeConfig.kt[SimpleFunctionDescriptorImpl]

'plugins' @ [69:13] ==> value-parameter plugins: Collection<Path> defined in net.corda.demobench.model.NodeConfig.install[ValueParameterDescriptorImpl]

'forEach' @ [69:21] ==> @HidesMembers public inline fun <T> Iterable<Path>.forEach(action: (Path) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'copy' @ [70:23] ==> public open fun copy(p0: (Path..Path?), p1: (Path..Path?), vararg p2: (CopyOption..CopyOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'it' @ [70:28] ==> value-parameter it: Path defined in net.corda.demobench.model.NodeConfig.install.<anonymous>[ValueParameterDescriptorImpl]

'pluginDir' @ [70:32] ==> public open val pluginDir: Path defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'resolve' @ [70:42] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'it' @ [70:50] ==> value-parameter it: Path defined in net.corda.demobench.model.NodeConfig.install.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [70:53] ==> public final val Path.fileName: (Path..Path?)[MyPropertyDescriptor]

'toString' @ [70:62] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'REPLACE_EXISTING' @ [70:94] ==> enum entry REPLACE_EXISTING defined in java.nio.file.StandardCopyOption[FakeCallableDescriptorForObject]

'fromAnyRef' @ [77:69] ==> public open fun fromAnyRef(p0: (Any..Any?)): (ConfigValue..ConfigValue?) defined in com.typesafe.config.ConfigValueFactory[JavaMethodDescriptor]

'any' @ [77:80] ==> value-parameter any: T defined in net.corda.demobench.model.valueFor[ValueParameterDescriptorImpl]

'valueFor' @ [79:42] ==> private fun <T> valueFor(any: String): ConfigValue? defined in net.corda.demobench.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'port' @ [79:63] ==> value-parameter port: Int defined in net.corda.demobench.model.addressValueFor[ValueParameterDescriptorImpl]

'empty' @ [82:32] ==> public open fun empty(): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'if (obj == null) config else body(config, obj).atPath(path)' @ [83:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Config, elseBranch: Config): Config[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Config

'obj' @ [83:16] ==> value-parameter obj: T? defined in net.corda.demobench.model.optional[ValueParameterDescriptorImpl]

'config' @ [83:29] ==> val config: (Config..Config?) defined in net.corda.demobench.model.optional[LocalVariableDescriptor]

'invoke' @ [83:41] ==> public abstract operator fun invoke(p1: Config, p2: T): Config defined in kotlin.Function2[FunctionInvokeDescriptor]

'config' @ [83:46] ==> val config: (Config..Config?) defined in net.corda.demobench.model.optional[LocalVariableDescriptor]

'obj' @ [83:54] ==> value-parameter obj: T? defined in net.corda.demobench.model.optional[ValueParameterDescriptorImpl]

'atPath' @ [83:59] ==> public abstract fun atPath(p0: (String..String?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'path' @ [83:66] ==> value-parameter path: String defined in net.corda.demobench.model.optional[ValueParameterDescriptorImpl]

'this' @ [86:38] ==> <this> defined in net.corda.demobench.model.forceDirectory[ReceiverParameterDescriptorImpl]

'isDirectory' @ [86:43] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'this' @ [86:58] ==> <this> defined in net.corda.demobench.model.forceDirectory[ReceiverParameterDescriptorImpl]

'mkdirs' @ [86:63] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

