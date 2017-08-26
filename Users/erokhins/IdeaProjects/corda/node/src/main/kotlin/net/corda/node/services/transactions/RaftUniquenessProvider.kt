'ThreadSafe' @ [47:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [48:82] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'loggerFor' @ [50:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> RaftUniquenessProvider

'AppendOnlyPersistentMap' @ [53:17] ==> public constructor AppendOnlyPersistentMap<K, V, E, out EK>(toPersistentEntityKey: (String) -> String, fromPersistentEntity: (RaftUniquenessProvider.RaftState) -> Pair<String, Any>, toPersistentEntity: (String, Any) -> RaftUniquenessProvider.RaftState, persistentEntityClass: Class<RaftUniquenessProvider.RaftState>, cacheBound: Long = ...) defined in net.corda.node.utilities.AppendOnlyPersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> Any
    <E> -> RaftState
    <out EK> -> String

'it' @ [54:51] ==> value-parameter it: String defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'Pair' @ [56:29] ==> public constructor Pair<out A, out B>(first: String, second: Any) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Any

'it' @ [56:34] ==> value-parameter it: RaftUniquenessProvider.RaftState defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [56:37] ==> @Id @Column public final var key: String defined in net.corda.node.services.transactions.RaftUniquenessProvider.RaftState[PropertyDescriptorImpl]

'it' @ [56:42] ==> value-parameter it: RaftUniquenessProvider.RaftState defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [56:45] ==> @Lob @Column public final var value: ByteArray defined in net.corda.node.services.transactions.RaftUniquenessProvider.RaftState[PropertyDescriptorImpl]

'deserialize' @ [56:51] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): Any defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Any

'SerializationDefaults' @ [56:73] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [56:95] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'RaftState' @ [59:29] ==> public constructor RaftState(key: String = ..., value: ByteArray = ...) defined in net.corda.node.services.transactions.RaftUniquenessProvider.RaftState[ClassConstructorDescriptorImpl]

'apply' @ [59:41] ==> @InlineOnly public inline fun <T> RaftUniquenessProvider.RaftState.apply(block: RaftUniquenessProvider.RaftState.() -> Unit): RaftUniquenessProvider.RaftState defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RaftState

'key' @ [60:33] ==> @Id @Column public final var key: String defined in net.corda.node.services.transactions.RaftUniquenessProvider.RaftState[PropertyDescriptorImpl]

'k' @ [60:39] ==> value-parameter k: String defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [61:33] ==> @Lob @Column public final var value: ByteArray defined in net.corda.node.services.transactions.RaftUniquenessProvider.RaftState[PropertyDescriptorImpl]

'v' @ [61:41] ==> value-parameter v: Any defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion.createMap.<anonymous>[ValueParameterDescriptorImpl]

'serialize' @ [61:43] ==> public fun <T : Any> Any.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<Any> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'SerializationDefaults' @ [61:63] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'STORAGE_CONTEXT' @ [61:85] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'bytes' @ [61:102] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'RaftState' @ [64:49] ==> public constructor RaftState(key: String = ..., value: ByteArray = ...) defined in net.corda.node.services.transactions.RaftUniquenessProvider.RaftState[ClassConstructorDescriptorImpl]

'java' @ [64:66] ==> public val <T> KClass<RaftUniquenessProvider.RaftState>.java: Class<RaftUniquenessProvider.RaftState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RaftState

'Entity' @ [68:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'javax.persistence.Table' @ [69:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'Id' @ [71:13] ==> public constructor Id() defined in javax.persistence.Id[JavaClassConstructorDescriptor]

'Column' @ [72:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'Lob' @ [75:13] ==> public constructor Lob() defined in javax.persistence.Lob[JavaClassConstructorDescriptor]

'Column' @ [76:13] ==> public constructor Column(name: String = ..., unique: Boolean = ..., nullable: Boolean = ..., insertable: Boolean = ..., updatable: Boolean = ..., columnDefinition: String = ..., table: String = ..., length: Int = ..., precision: Int = ..., scale: Int = ...) defined in javax.persistence.Column[JavaClassConstructorDescriptor]

'ByteArray' @ [77:36] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'services' @ [81:37] ==> value-parameter services: ServiceHubInternal defined in net.corda.node.services.transactions.RaftUniquenessProvider.<init>[ValueParameterDescriptorImpl]

'configuration' @ [81:46] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'baseDirectory' @ [81:60] ==> public abstract val baseDirectory: Path defined in net.corda.node.services.config.NodeConfiguration[DeserializedPropertyDescriptor]

'services' @ [83:29] ==> value-parameter services: ServiceHubInternal defined in net.corda.node.services.transactions.RaftUniquenessProvider.<init>[ValueParameterDescriptorImpl]

'configuration' @ [83:38] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'notaryNodeAddress' @ [83:52] ==> public abstract val notaryNodeAddress: NetworkHostAndPort? defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'IllegalArgumentException' @ [84:22] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'services' @ [89:36] ==> value-parameter services: ServiceHubInternal defined in net.corda.node.services.transactions.RaftUniquenessProvider.<init>[ValueParameterDescriptorImpl]

'configuration' @ [89:45] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'notaryClusterAddresses' @ [89:59] ==> public abstract val notaryClusterAddresses: List<NetworkHostAndPort> defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'services' @ [91:40] ==> value-parameter services: ServiceHubInternal defined in net.corda.node.services.transactions.RaftUniquenessProvider.<init>[ValueParameterDescriptorImpl]

'database' @ [91:49] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'services' @ [93:60] ==> value-parameter services: ServiceHubInternal defined in net.corda.node.services.transactions.RaftUniquenessProvider.<init>[ValueParameterDescriptorImpl]

'configuration' @ [93:69] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'_clientFuture' @ [102:17] ==> private final lateinit var _clientFuture: CompletableFuture<CopycatClient> defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'get' @ [102:31] ==> public open fun get(): (CopycatClient..CopycatClient?) defined in java.util.concurrent.CompletableFuture[JavaMethodDescriptor]

'log' @ [105:9] ==> private final val log: Logger defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion[PropertyDescriptorImpl]

'info' @ [105:13] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'storagePath' @ [105:61] ==> private final val storagePath: Path defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'toFile' @ [105:73] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'DistributedImmutableMap' @ [107:13] ==> public constructor DistributedImmutableMap<K : Any, V : Any, E, EK>(db: CordaPersistence, createMap: () -> AppendOnlyPersistentMap<String, Any, RaftUniquenessProvider.RaftState, String>) defined in net.corda.node.services.transactions.DistributedImmutableMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K : Any> -> String
    <V : Any> -> Any
    <E> -> RaftState
    <EK> -> String

'db' @ [107:37] ==> private final val db: CordaPersistence defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'RaftUniquenessProvider' @ [107:41] ==> public companion object defined in net.corda.node.services.transactions.RaftUniquenessProvider[FakeCallableDescriptorForObject]

'Companion' @ [107:64] ==> public companion object defined in net.corda.node.services.transactions.RaftUniquenessProvider[FakeCallableDescriptorForObject]

'Address' @ [108:23] ==> public constructor Address(p0: (String..String?), p1: Int) defined in io.atomix.catalyst.transport.Address[JavaClassConstructorDescriptor]

'myAddress' @ [108:31] ==> private final val myAddress: NetworkHostAndPort defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'host' @ [108:41] ==> public final val host: String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'myAddress' @ [108:47] ==> private final val myAddress: NetworkHostAndPort defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'port' @ [108:57] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'buildStorage' @ [109:23] ==> private final fun buildStorage(storagePath: Path): Storage? defined in net.corda.node.services.transactions.RaftUniquenessProvider[SimpleFunctionDescriptorImpl]

'storagePath' @ [109:36] ==> private final val storagePath: Path defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'buildTransport' @ [110:25] ==> private final fun buildTransport(config: SSLConfiguration): Transport? defined in net.corda.node.services.transactions.RaftUniquenessProvider[SimpleFunctionDescriptorImpl]

'transportConfiguration' @ [110:40] ==> private final val transportConfiguration: SSLConfiguration defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'Serializer' @ [111:26] ==> public constructor Serializer() defined in io.atomix.catalyst.serializer.Serializer[JavaClassConstructorDescriptor]

'apply' @ [111:39] ==> @InlineOnly public inline fun <T> Serializer.apply(block: Serializer.() -> Unit): Serializer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Serializer

'register' @ [113:13] ==> public final fun register(p0: (Class<*>..Class<*>?), p1: (((Class<*>..Class<*>?)) -> (TypeSerializer<*>..TypeSerializer<*>?)..(((Class<*>..Class<*>?)) -> (TypeSerializer<*>..TypeSerializer<*>?))?)): (Serializer..Serializer?) defined in io.atomix.catalyst.serializer.Serializer[MyFunctionDescriptor]

'DistributedImmutableMap' @ [113:22] ==> public companion object defined in net.corda.node.services.transactions.DistributedImmutableMap[FakeCallableDescriptorForObject]

'PutAll' @ [113:55] ==> public constructor PutAll<K, V>(entries: Map<Any?, Any?>) defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.PutAll[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'java' @ [113:69] ==> public val <T> KClass<DistributedImmutableMap.Commands.PutAll<*, *>>.java: Class<DistributedImmutableMap.Commands.PutAll<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PutAll<*, *>

'writeMap' @ [118:25] ==> private fun writeMap(map: Map<*, *>, buffer: BufferOutput<out BufferOutput<*>>, serializer: Serializer): Unit defined in net.corda.node.services.transactions[SimpleFunctionDescriptorImpl]

'obj' @ [118:34] ==> value-parameter obj: DistributedImmutableMap.Commands.PutAll<*, *> defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.write[ValueParameterDescriptorImpl]

'entries' @ [118:38] ==> public final val entries: Map<out Any?, Any?> defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.PutAll[PropertyDescriptorImpl]

'buffer' @ [118:47] ==> value-parameter buffer: BufferOutput<out BufferOutput<*>> defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.write[ValueParameterDescriptorImpl]

'serializer' @ [118:55] ==> value-parameter serializer: Serializer defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.write[ValueParameterDescriptorImpl]

'DistributedImmutableMap' @ [123:32] ==> public companion object defined in net.corda.node.services.transactions.DistributedImmutableMap[FakeCallableDescriptorForObject]

'PutAll' @ [123:65] ==> public constructor PutAll<K, V>(entries: Map<Any, Any>) defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.PutAll[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> Any
    <V> -> Any

'readMap' @ [123:72] ==> private fun readMap(buffer: BufferInput<out BufferInput<*>>, serializer: Serializer): LinkedHashMap<Any, Any> /* = LinkedHashMap<Any, Any> */ defined in net.corda.node.services.transactions[SimpleFunctionDescriptorImpl]

'buffer' @ [123:80] ==> value-parameter buffer: BufferInput<out BufferInput<*>> defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.read[ValueParameterDescriptorImpl]

'serializer' @ [123:88] ==> value-parameter serializer: Serializer defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.read[ValueParameterDescriptorImpl]

'register' @ [127:13] ==> public final fun register(p0: (Class<*>..Class<*>?), p1: (((Class<*>..Class<*>?)) -> (TypeSerializer<*>..TypeSerializer<*>?)..(((Class<*>..Class<*>?)) -> (TypeSerializer<*>..TypeSerializer<*>?))?)): (Serializer..Serializer?) defined in io.atomix.catalyst.serializer.Serializer[MyFunctionDescriptor]

'LinkedHashMap' @ [127:22] ==> public final fun <K, V> <init>(): LinkedHashMap<Any?, Any?> /* = LinkedHashMap<Any?, Any?> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'java' @ [127:43] ==> public val <T> KClass<LinkedHashMap<*, *>>.java: Class<LinkedHashMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LinkedHashMap<*, *>

'writeMap' @ [129:135] ==> private fun writeMap(map: Map<*, *>, buffer: BufferOutput<out BufferOutput<*>>, serializer: Serializer): Unit defined in net.corda.node.services.transactions[SimpleFunctionDescriptorImpl]

'obj' @ [129:144] ==> value-parameter obj: LinkedHashMap<*, *> /* = LinkedHashMap<*, *> */ defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.write[ValueParameterDescriptorImpl]

'buffer' @ [129:149] ==> value-parameter buffer: BufferOutput<out BufferOutput<*>> defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.write[ValueParameterDescriptorImpl]

'serializer' @ [129:157] ==> value-parameter serializer: Serializer defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.write[ValueParameterDescriptorImpl]

'readMap' @ [130:140] ==> private fun readMap(buffer: BufferInput<out BufferInput<*>>, serializer: Serializer): LinkedHashMap<Any, Any> /* = LinkedHashMap<Any, Any> */ defined in net.corda.node.services.transactions[SimpleFunctionDescriptorImpl]

'buffer' @ [130:148] ==> value-parameter buffer: BufferInput<out BufferInput<*>> defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.read[ValueParameterDescriptorImpl]

'serializer' @ [130:156] ==> value-parameter serializer: Serializer defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>.<anonymous>.<no name provided>.read[ValueParameterDescriptorImpl]

'server' @ [135:9] ==> private final lateinit var server: CopycatServer defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'builder' @ [135:32] ==> public open fun builder(p0: (Address..Address?)): (CopycatServer.Builder..CopycatServer.Builder?) defined in io.atomix.copycat.server.CopycatServer[JavaMethodDescriptor]

'address' @ [135:40] ==> val address: Address defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'withStateMachine' @ [136:18] ==> public final fun withStateMachine(p0: (() -> (StateMachine..StateMachine?)..(() -> (StateMachine..StateMachine?))?)): (CopycatServer.Builder..CopycatServer.Builder?) defined in io.atomix.copycat.server.CopycatServer.Builder[MyFunctionDescriptor]

'stateMachineFactory' @ [136:35] ==> val stateMachineFactory: () -> DistributedImmutableMap<String, Any, RaftUniquenessProvider.RaftState, String> defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'withStorage' @ [137:18] ==> public open fun withStorage(p0: (Storage..Storage?)): (CopycatServer.Builder..CopycatServer.Builder?) defined in io.atomix.copycat.server.CopycatServer.Builder[JavaMethodDescriptor]

'storage' @ [137:30] ==> val storage: Storage? defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'withServerTransport' @ [138:18] ==> public open fun withServerTransport(p0: (Transport..Transport?)): (CopycatServer.Builder..CopycatServer.Builder?) defined in io.atomix.copycat.server.CopycatServer.Builder[JavaMethodDescriptor]

'transport' @ [138:38] ==> val transport: Transport? defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'withSerializer' @ [139:18] ==> public open fun withSerializer(p0: (Serializer..Serializer?)): (CopycatServer.Builder..CopycatServer.Builder?) defined in io.atomix.copycat.server.CopycatServer.Builder[JavaMethodDescriptor]

'serializer' @ [139:33] ==> val serializer: Serializer defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'build' @ [140:18] ==> public open fun build(): (CopycatServer..CopycatServer?) defined in io.atomix.copycat.server.CopycatServer.Builder[JavaMethodDescriptor]

'if (clusterAddresses.isNotEmpty()) {
            log.info("Joining an existing Copycat cluster at $clusterAddresses")
            val cluster = clusterAddresses.map { Address(it.host, it.port) }
            server.join(cluster)
        } else {
            log.info("Bootstrapping a Copycat cluster at $address")
            server.bootstrap()
        }' @ [142:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?), elseBranch: (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?)): (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.util.concurrent.CompletableFuture<(io.atomix.copycat.server.CopycatServer..io.atomix.copycat.server.CopycatServer?)>..java.util.concurrent.CompletableFuture<(io.atomix.copycat.server.CopycatServer..io.atomix.copycat.server.CopycatServer?)>?)

'clusterAddresses' @ [142:32] ==> private final val clusterAddresses: List<NetworkHostAndPort> defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'isNotEmpty' @ [142:49] ==> @InlineOnly public inline fun <T> Collection<NetworkHostAndPort>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort

'log' @ [143:13] ==> private final val log: Logger defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion[PropertyDescriptorImpl]

'info' @ [143:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'clusterAddresses' @ [143:63] ==> private final val clusterAddresses: List<NetworkHostAndPort> defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'clusterAddresses' @ [144:27] ==> private final val clusterAddresses: List<NetworkHostAndPort> defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'map' @ [144:44] ==> public inline fun <T, R> Iterable<NetworkHostAndPort>.map(transform: (NetworkHostAndPort) -> Address): List<Address> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NetworkHostAndPort
    <R> -> Address

'Address' @ [144:50] ==> public constructor Address(p0: (String..String?), p1: Int) defined in io.atomix.catalyst.transport.Address[JavaClassConstructorDescriptor]

'it' @ [144:58] ==> value-parameter it: NetworkHostAndPort defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>[ValueParameterDescriptorImpl]

'host' @ [144:61] ==> public final val host: String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'it' @ [144:67] ==> value-parameter it: NetworkHostAndPort defined in net.corda.node.services.transactions.RaftUniquenessProvider.start.<anonymous>[ValueParameterDescriptorImpl]

'port' @ [144:70] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'server' @ [145:13] ==> private final lateinit var server: CopycatServer defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'join' @ [145:20] ==> public open fun join(p0: (MutableCollection<(Address..Address?)>..Collection<(Address..Address?)>?)): (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?) defined in io.atomix.copycat.server.CopycatServer[JavaMethodDescriptor]

'cluster' @ [145:25] ==> val cluster: List<Address> defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'log' @ [147:13] ==> private final val log: Logger defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion[PropertyDescriptorImpl]

'info' @ [147:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'address' @ [147:59] ==> val address: Address defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'server' @ [148:13] ==> private final lateinit var server: CopycatServer defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'bootstrap' @ [148:20] ==> public open fun bootstrap(): (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?) defined in io.atomix.copycat.server.CopycatServer[JavaMethodDescriptor]

'builder' @ [151:36] ==> public open fun builder(vararg p0: (Address..Address?)): (CopycatClient.Builder..CopycatClient.Builder?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]

'address' @ [151:44] ==> val address: Address defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'withTransport' @ [152:18] ==> public open fun withTransport(p0: (Transport..Transport?)): (CopycatClient.Builder..CopycatClient.Builder?) defined in io.atomix.copycat.client.CopycatClient.Builder[JavaMethodDescriptor]

'transport' @ [152:32] ==> val transport: Transport? defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'withConnectionStrategy' @ [153:18] ==> public open fun withConnectionStrategy(p0: (ConnectionStrategy..ConnectionStrategy?)): (CopycatClient.Builder..CopycatClient.Builder?) defined in io.atomix.copycat.client.CopycatClient.Builder[JavaMethodDescriptor]

'EXPONENTIAL_BACKOFF' @ [153:62] ==> enum entry EXPONENTIAL_BACKOFF defined in io.atomix.copycat.client.ConnectionStrategies[FakeCallableDescriptorForObject]

'withSerializer' @ [154:18] ==> public open fun withSerializer(p0: (Serializer..Serializer?)): (CopycatClient.Builder..CopycatClient.Builder?) defined in io.atomix.copycat.client.CopycatClient.Builder[JavaMethodDescriptor]

'serializer' @ [154:33] ==> val serializer: Serializer defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'withRecoveryStrategy' @ [155:18] ==> public open fun withRecoveryStrategy(p0: (RecoveryStrategy..RecoveryStrategy?)): (CopycatClient.Builder..CopycatClient.Builder?) defined in io.atomix.copycat.client.CopycatClient.Builder[JavaMethodDescriptor]

'RECOVER' @ [155:58] ==> enum entry RECOVER defined in io.atomix.copycat.client.RecoveryStrategies[FakeCallableDescriptorForObject]

'build' @ [156:18] ==> public open fun build(): (CopycatClient..CopycatClient?) defined in io.atomix.copycat.client.CopycatClient.Builder[JavaMethodDescriptor]

'_clientFuture' @ [157:9] ==> private final lateinit var _clientFuture: CompletableFuture<CopycatClient> defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'serverFuture' @ [157:25] ==> val serverFuture: (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?) defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'thenCompose' @ [157:38] ==> public final fun <U : (Any..Any?)> thenCompose(p0: (((CopycatServer..CopycatServer?)) -> (CompletionStage<(CopycatClient..CopycatClient?)>..CompletionStage<(CopycatClient..CopycatClient?)>?)..(((CopycatServer..CopycatServer?)) -> (CompletionStage<(CopycatClient..CopycatClient?)>..CompletionStage<(CopycatClient..CopycatClient?)>?))?)): (CompletableFuture<(CopycatClient..CopycatClient?)>..CompletableFuture<(CopycatClient..CopycatClient?)>?) defined in java.util.concurrent.CompletableFuture[MyFunctionDescriptor]
Inferred types:
    <U : (Any..Any?)> -> CopycatClient

'client' @ [157:52] ==> val client: (CopycatClient..CopycatClient?) defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'connect' @ [157:59] ==> public open fun connect(vararg p0: (Address..Address?)): (CompletableFuture<(CopycatClient..CopycatClient?)>..CompletableFuture<(CopycatClient..CopycatClient?)>?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]

'address' @ [157:67] ==> val address: Address defined in net.corda.node.services.transactions.RaftUniquenessProvider.start[LocalVariableDescriptor]

'server' @ [161:9] ==> private final lateinit var server: CopycatServer defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'shutdown' @ [161:16] ==> public open fun shutdown(): (CompletableFuture<(Void..Void?)>..CompletableFuture<(Void..Void?)>?) defined in io.atomix.copycat.server.CopycatServer[JavaMethodDescriptor]

'builder' @ [165:24] ==> public open fun builder(): (Storage.Builder..Storage.Builder?) defined in io.atomix.copycat.server.storage.Storage[JavaMethodDescriptor]

'withDirectory' @ [166:18] ==> public open fun withDirectory(p0: (File..File?)): (Storage.Builder..Storage.Builder?) defined in io.atomix.copycat.server.storage.Storage.Builder[JavaMethodDescriptor]

'storagePath' @ [166:32] ==> value-parameter storagePath: Path defined in net.corda.node.services.transactions.RaftUniquenessProvider.buildStorage[ValueParameterDescriptorImpl]

'toFile' @ [166:44] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'withStorageLevel' @ [167:18] ==> public open fun withStorageLevel(p0: (StorageLevel..StorageLevel?)): (Storage.Builder..Storage.Builder?) defined in io.atomix.copycat.server.storage.Storage.Builder[JavaMethodDescriptor]

'DISK' @ [167:48] ==> enum entry DISK defined in io.atomix.copycat.server.storage.StorageLevel[FakeCallableDescriptorForObject]

'build' @ [168:18] ==> public open fun build(): (Storage..Storage?) defined in io.atomix.copycat.server.storage.Storage.Builder[JavaMethodDescriptor]

'builder' @ [172:31] ==> public open fun builder(): (NettyTransport.Builder..NettyTransport.Builder?) defined in io.atomix.catalyst.transport.netty.NettyTransport[JavaMethodDescriptor]

'withSsl' @ [173:18] ==> public open fun withSsl(): (NettyTransport.Builder..NettyTransport.Builder?) defined in io.atomix.catalyst.transport.netty.NettyTransport.Builder[JavaMethodDescriptor]

'withSslProtocol' @ [174:18] ==> public open fun withSslProtocol(p0: (SslProtocol..SslProtocol?)): (NettyTransport.Builder..NettyTransport.Builder?) defined in io.atomix.catalyst.transport.netty.NettyTransport.Builder[JavaMethodDescriptor]

'TLSv1_2' @ [174:46] ==> enum entry TLSv1_2 defined in io.atomix.catalyst.transport.netty.SslProtocol[FakeCallableDescriptorForObject]

'withKeyStorePath' @ [175:18] ==> public open fun withKeyStorePath(p0: (String..String?)): (NettyTransport.Builder..NettyTransport.Builder?) defined in io.atomix.catalyst.transport.netty.NettyTransport.Builder[JavaMethodDescriptor]

'config' @ [175:35] ==> value-parameter config: SSLConfiguration defined in net.corda.node.services.transactions.RaftUniquenessProvider.buildTransport[ValueParameterDescriptorImpl]

'sslKeystore' @ [175:42] ==> public open val sslKeystore: Path defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'toString' @ [175:54] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'withKeyStorePassword' @ [176:18] ==> public open fun withKeyStorePassword(p0: (String..String?)): (NettyTransport.Builder..NettyTransport.Builder?) defined in io.atomix.catalyst.transport.netty.NettyTransport.Builder[JavaMethodDescriptor]

'config' @ [176:39] ==> value-parameter config: SSLConfiguration defined in net.corda.node.services.transactions.RaftUniquenessProvider.buildTransport[ValueParameterDescriptorImpl]

'keyStorePassword' @ [176:46] ==> public abstract val keyStorePassword: String defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'withTrustStorePath' @ [177:18] ==> public open fun withTrustStorePath(p0: (String..String?)): (NettyTransport.Builder..NettyTransport.Builder?) defined in io.atomix.catalyst.transport.netty.NettyTransport.Builder[JavaMethodDescriptor]

'config' @ [177:37] ==> value-parameter config: SSLConfiguration defined in net.corda.node.services.transactions.RaftUniquenessProvider.buildTransport[ValueParameterDescriptorImpl]

'trustStoreFile' @ [177:44] ==> public open val trustStoreFile: Path defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'toString' @ [177:59] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'withTrustStorePassword' @ [178:18] ==> public open fun withTrustStorePassword(p0: (String..String?)): (NettyTransport.Builder..NettyTransport.Builder?) defined in io.atomix.catalyst.transport.netty.NettyTransport.Builder[JavaMethodDescriptor]

'config' @ [178:41] ==> value-parameter config: SSLConfiguration defined in net.corda.node.services.transactions.RaftUniquenessProvider.buildTransport[ValueParameterDescriptorImpl]

'trustStorePassword' @ [178:48] ==> public abstract val trustStorePassword: String defined in net.corda.nodeapi.config.SSLConfiguration[DeserializedPropertyDescriptor]

'build' @ [179:18] ==> public open fun build(): (Transport..Transport?) defined in io.atomix.catalyst.transport.netty.NettyTransport.Builder[JavaMethodDescriptor]

'states' @ [183:23] ==> value-parameter states: List<StateRef> defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit[ValueParameterDescriptorImpl]

'mapIndexed' @ [183:30] ==> public inline fun <T, R> Iterable<StateRef>.mapIndexed(transform: (index: Int, StateRef) -> Pair<StateRef, UniquenessProvider.ConsumingTx>): List<Pair<StateRef, UniquenessProvider.ConsumingTx>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> Pair<StateRef, ConsumingTx>

'stateRef' @ [183:58] ==> value-parameter stateRef: StateRef defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit.<anonymous>[ValueParameterDescriptorImpl]

'ConsumingTx' @ [183:89] ==> public constructor ConsumingTx(id: SecureHash, inputIndex: Int, requestingParty: Party) defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedClassConstructorDescriptor]

'txId' @ [183:101] ==> value-parameter txId: SecureHash defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit[ValueParameterDescriptorImpl]

'i' @ [183:107] ==> value-parameter i: Int defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit.<anonymous>[ValueParameterDescriptorImpl]

'callerIdentity' @ [183:110] ==> value-parameter callerIdentity: Party defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit[ValueParameterDescriptorImpl]

'log' @ [185:9] ==> private final val log: Logger defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion[PropertyDescriptorImpl]

'debug' @ [185:13] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'states' @ [185:57] ==> value-parameter states: List<StateRef> defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit[ValueParameterDescriptorImpl]

'joinToString' @ [185:64] ==> public fun <T> Iterable<StateRef>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((StateRef) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'DistributedImmutableMap' @ [186:29] ==> public companion object defined in net.corda.node.services.transactions.DistributedImmutableMap[FakeCallableDescriptorForObject]

'PutAll' @ [186:62] ==> public constructor PutAll<K, V>(entries: Map<String, ByteArray>) defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.PutAll[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> String
    <V> -> ByteArray

'encode' @ [186:69] ==> private final fun encode(items: List<Pair<StateRef, UniquenessProvider.ConsumingTx>>): Map<String, ByteArray> defined in net.corda.node.services.transactions.RaftUniquenessProvider[SimpleFunctionDescriptorImpl]

'entries' @ [186:76] ==> val entries: List<Pair<StateRef, UniquenessProvider.ConsumingTx>> defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit[LocalVariableDescriptor]

'client' @ [187:25] ==> private final val client: CopycatClient defined in net.corda.node.services.transactions.RaftUniquenessProvider[PropertyDescriptorImpl]

'submit' @ [187:32] ==> public abstract fun <T : (Any..Any?)> submit(p0: (Command<(Map<String, ByteArray>..Map<String, ByteArray>?)>..Command<(Map<String, ByteArray>..Map<String, ByteArray>?)>?)): (CompletableFuture<(Map<String, ByteArray>..Map<String, ByteArray>?)>..CompletableFuture<(Map<String, ByteArray>..Map<String, ByteArray>?)>?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Map<String, ByteArray>

'commitCommand' @ [187:39] ==> val commitCommand: DistributedImmutableMap.Commands.PutAll<String, ByteArray> defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit[LocalVariableDescriptor]

'get' @ [187:54] ==> public open fun get(): (Map<String, ByteArray>..Map<String, ByteArray>?) defined in java.util.concurrent.CompletableFuture[JavaMethodDescriptor]

'conflicts' @ [189:13] ==> val conflicts: (Map<String, ByteArray>..Map<String, ByteArray>?) defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit[LocalVariableDescriptor]

'isNotEmpty' @ [189:23] ==> @InlineOnly public inline fun <K, V> Map<out String, ByteArray>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> ByteArray

'UniquenessException' @ [189:43] ==> public constructor UniquenessException(error: UniquenessProvider.Conflict) defined in net.corda.core.node.services.UniquenessException[DeserializedClassConstructorDescriptor]

'Conflict' @ [189:82] ==> public constructor Conflict(stateHistory: Map<StateRef, UniquenessProvider.ConsumingTx>) defined in net.corda.core.node.services.UniquenessProvider.Conflict[DeserializedClassConstructorDescriptor]

'decode' @ [189:91] ==> private final fun decode(items: Map<String, ByteArray>): Map<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.RaftUniquenessProvider[SimpleFunctionDescriptorImpl]

'conflicts' @ [189:98] ==> val conflicts: (Map<String, ByteArray>..Map<String, ByteArray>?) defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit[LocalVariableDescriptor]

'log' @ [190:9] ==> private final val log: Logger defined in net.corda.node.services.transactions.RaftUniquenessProvider.Companion[PropertyDescriptorImpl]

'debug' @ [190:13] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'txId' @ [190:53] ==> value-parameter txId: SecureHash defined in net.corda.node.services.transactions.RaftUniquenessProvider.commit[ValueParameterDescriptorImpl]

'txhash' @ [198:36] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'index' @ [198:44] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'items' @ [199:16] ==> value-parameter items: List<Pair<StateRef, UniquenessProvider.ConsumingTx>> defined in net.corda.node.services.transactions.RaftUniquenessProvider.encode[ValueParameterDescriptorImpl]

'map' @ [199:22] ==> public inline fun <T, R> Iterable<Pair<StateRef, UniquenessProvider.ConsumingTx>>.map(transform: (Pair<StateRef, UniquenessProvider.ConsumingTx>) -> Pair<String, ByteArray>): List<Pair<String, ByteArray>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<StateRef, ConsumingTx>
    <R> -> Pair<String, ByteArray>

'it' @ [199:28] ==> value-parameter it: Pair<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.RaftUniquenessProvider.encode.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [199:31] ==> public final val first: StateRef defined in kotlin.Pair[DeserializedPropertyDescriptor]

'encoded' @ [199:37] ==> local final fun StateRef.encoded(): String defined in net.corda.node.services.transactions.RaftUniquenessProvider.encode[SimpleFunctionDescriptorImpl]

'it' @ [199:50] ==> value-parameter it: Pair<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.RaftUniquenessProvider.encode.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [199:53] ==> public final val second: UniquenessProvider.ConsumingTx defined in kotlin.Pair[DeserializedPropertyDescriptor]

'serialize' @ [199:60] ==> public fun <T : Any> UniquenessProvider.ConsumingTx.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<UniquenessProvider.ConsumingTx> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ConsumingTx

'bytes' @ [199:72] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'toMap' @ [199:80] ==> public fun <K, V> Iterable<Pair<String, ByteArray>>.toMap(): Map<String, ByteArray> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> ByteArray

'split' @ [203:35] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [203:46] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> StateRef): StateRef defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> StateRef

'StateRef' @ [203:52] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'SecureHash' @ [203:61] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [203:72] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [203:78] ==> value-parameter it: List<String> defined in net.corda.node.services.transactions.RaftUniquenessProvider.decode.toStateRef.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [203:86] ==> value-parameter it: List<String> defined in net.corda.node.services.transactions.RaftUniquenessProvider.decode.toStateRef.<anonymous>[ValueParameterDescriptorImpl]

'toInt' @ [203:92] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'items' @ [204:16] ==> value-parameter items: Map<String, ByteArray> defined in net.corda.node.services.transactions.RaftUniquenessProvider.decode[ValueParameterDescriptorImpl]

'map' @ [204:22] ==> public inline fun <K, V, R> Map<out String, ByteArray>.map(transform: (Map.Entry<String, ByteArray>) -> Pair<StateRef, UniquenessProvider.ConsumingTx>): List<Pair<StateRef, UniquenessProvider.ConsumingTx>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> ByteArray
    <R> -> Pair<StateRef, ConsumingTx>

'it' @ [204:28] ==> value-parameter it: Map.Entry<String, ByteArray> defined in net.corda.node.services.transactions.RaftUniquenessProvider.decode.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [204:31] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'toStateRef' @ [204:35] ==> local final fun String.toStateRef(): StateRef defined in net.corda.node.services.transactions.RaftUniquenessProvider.decode[SimpleFunctionDescriptorImpl]

'it' @ [204:51] ==> value-parameter it: Map.Entry<String, ByteArray> defined in net.corda.node.services.transactions.RaftUniquenessProvider.decode.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [204:54] ==> public abstract val value: ByteArray defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'deserialize' @ [204:60] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): UniquenessProvider.ConsumingTx defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ConsumingTx

'toMap' @ [204:108] ==> public fun <K, V> Iterable<Pair<StateRef, UniquenessProvider.ConsumingTx>>.toMap(): Map<StateRef, UniquenessProvider.ConsumingTx> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> StateRef
    <V> -> ConsumingTx

'with' @ [208:107] ==> @InlineOnly public inline fun <T, R> with(receiver: Map<out Any?, Any?>, block: Map<out Any?, Any?>.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<out Any?, Any?>
    <R> -> Unit

'map' @ [208:112] ==> value-parameter map: Map<*, *> defined in net.corda.node.services.transactions.writeMap[ValueParameterDescriptorImpl]

'buffer' @ [209:5] ==> value-parameter buffer: BufferOutput<out BufferOutput<*>> defined in net.corda.node.services.transactions.writeMap[ValueParameterDescriptorImpl]

'writeInt' @ [209:12] ==> public abstract fun writeInt(p0: Int): (BufferOutput<*>..BufferOutput<*>?) defined in io.atomix.catalyst.buffer.BufferOutput[JavaMethodDescriptor]

'size' @ [209:21] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'forEach' @ [210:5] ==> @HidesMembers public inline fun <K, V> Map<out Any?, Any?>.forEach(action: (Map.Entry<Any?, Any?>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'with' @ [211:9] ==> @InlineOnly public inline fun <T, R> with(receiver: Serializer, block: Serializer.() -> BufferOutput<out (BufferOutput<*>..BufferOutput<*>?)>): BufferOutput<out (BufferOutput<*>..BufferOutput<*>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Serializer
    <R> -> BufferOutput<out (io.atomix.catalyst.buffer.BufferOutput<*>..io.atomix.catalyst.buffer.BufferOutput<*>?)>

'serializer' @ [211:14] ==> value-parameter serializer: Serializer defined in net.corda.node.services.transactions.writeMap[ValueParameterDescriptorImpl]

'writeObject' @ [212:13] ==> public open fun <T : (Any..Any?)> writeObject(p0: (Any..Any?), p1: (BufferOutput<*>..BufferOutput<*>?)): (BufferOutput<*>..BufferOutput<*>?) defined in io.atomix.catalyst.serializer.Serializer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'it' @ [212:25] ==> value-parameter it: Map.Entry<Any?, Any?> defined in net.corda.node.services.transactions.writeMap.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [212:28] ==> public abstract val key: Any? defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'buffer' @ [212:33] ==> value-parameter buffer: BufferOutput<out BufferOutput<*>> defined in net.corda.node.services.transactions.writeMap[ValueParameterDescriptorImpl]

'writeObject' @ [213:13] ==> public open fun <T : (Any..Any?)> writeObject(p0: (Any..Any?), p1: (BufferOutput<*>..BufferOutput<*>?)): (BufferOutput<*>..BufferOutput<*>?) defined in io.atomix.catalyst.serializer.Serializer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'it' @ [213:25] ==> value-parameter it: Map.Entry<Any?, Any?> defined in net.corda.node.services.transactions.writeMap.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [213:28] ==> public abstract val value: Any? defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'buffer' @ [213:35] ==> value-parameter buffer: BufferOutput<out BufferOutput<*>> defined in net.corda.node.services.transactions.writeMap[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [219:12] ==> public final fun <K, V> <init>(): LinkedHashMap<Any, Any> /* = LinkedHashMap<Any, Any> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Any
    <V> -> Any

'apply' @ [219:38] ==> @InlineOnly public inline fun <T> LinkedHashMap<Any, Any> /* = LinkedHashMap<Any, Any> */.apply(block: LinkedHashMap<Any, Any> /* = LinkedHashMap<Any, Any> */.() -> Unit): LinkedHashMap<Any, Any> /* = LinkedHashMap<Any, Any> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashMap<Any, Any>

'repeat' @ [220:9] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'buffer' @ [220:16] ==> value-parameter buffer: BufferInput<out BufferInput<*>> defined in net.corda.node.services.transactions.readMap[ValueParameterDescriptorImpl]

'readInt' @ [220:23] ==> public abstract fun readInt(): Int defined in io.atomix.catalyst.buffer.BufferInput[JavaMethodDescriptor]

'put' @ [221:13] ==> public open fun put(key: Any, value: Any): Any? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'serializer' @ [221:17] ==> value-parameter serializer: Serializer defined in net.corda.node.services.transactions.readMap[ValueParameterDescriptorImpl]

'readObject' @ [221:28] ==> public open fun <T : (Any..Any?)> readObject(p0: (BufferInput<*>..BufferInput<*>?)): (Any..Any?) defined in io.atomix.catalyst.serializer.Serializer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'buffer' @ [221:39] ==> value-parameter buffer: BufferInput<out BufferInput<*>> defined in net.corda.node.services.transactions.readMap[ValueParameterDescriptorImpl]

'serializer' @ [221:48] ==> value-parameter serializer: Serializer defined in net.corda.node.services.transactions.readMap[ValueParameterDescriptorImpl]

'readObject' @ [221:59] ==> public open fun <T : (Any..Any?)> readObject(p0: (BufferInput<*>..BufferInput<*>?)): (Any..Any?) defined in io.atomix.catalyst.serializer.Serializer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'buffer' @ [221:70] ==> value-parameter buffer: BufferInput<out BufferInput<*>> defined in net.corda.node.services.transactions.readMap[ValueParameterDescriptorImpl]

