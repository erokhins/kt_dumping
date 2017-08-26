'TestDependencyInjectionBase' @ [26:38] ==> public constructor TestDependencyInjectionBase() defined in net.corda.testing.TestDependencyInjectionBase[DeserializedClassConstructorDescriptor]

'mutableListOf' @ [31:60] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<CordaPersistence> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaPersistence

'Before' @ [33:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'LogHelper' @ [35:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [35:19] ==> public final fun setLevel(vararg loggerNames: String): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'LogHelper' @ [36:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'setLevel' @ [36:19] ==> public final fun setLevel(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'NetworkMapService' @ [36:28] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'cluster' @ [37:9] ==> public final lateinit var cluster: List<DistributedImmutableMapTests.Member> defined in net.corda.node.services.transactions.DistributedImmutableMapTests[PropertyDescriptorImpl]

'setUpCluster' @ [37:19] ==> private final fun setUpCluster(nodeCount: Int = ...): List<DistributedImmutableMapTests.Member> defined in net.corda.node.services.transactions.DistributedImmutableMapTests[SimpleFunctionDescriptorImpl]

'After' @ [40:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'LogHelper' @ [42:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'reset' @ [42:19] ==> public final fun reset(vararg names: String): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'LogHelper' @ [43:9] ==> public object LogHelper defined in net.corda.testing[FakeCallableDescriptorForObject]

'reset' @ [43:19] ==> public final fun reset(vararg classes: KClass<*>): Unit defined in net.corda.testing.LogHelper[DeserializedSimpleFunctionDescriptor]

'NetworkMapService' @ [43:25] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'cluster' @ [44:9] ==> public final lateinit var cluster: List<DistributedImmutableMapTests.Member> defined in net.corda.node.services.transactions.DistributedImmutableMapTests[PropertyDescriptorImpl]

'forEach' @ [44:17] ==> @HidesMembers public inline fun <T> Iterable<DistributedImmutableMapTests.Member>.forEach(action: (DistributedImmutableMapTests.Member) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member

'it' @ [45:13] ==> value-parameter it: DistributedImmutableMapTests.Member defined in net.corda.node.services.transactions.DistributedImmutableMapTests.tearDown.<anonymous>[ValueParameterDescriptorImpl]

'client' @ [45:16] ==> public final val client: CopycatClient defined in net.corda.node.services.transactions.DistributedImmutableMapTests.Member[PropertyDescriptorImpl]

'close' @ [45:23] ==> public abstract fun close(): (CompletableFuture<(Void..Void?)>..CompletableFuture<(Void..Void?)>?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]

'it' @ [46:13] ==> value-parameter it: DistributedImmutableMapTests.Member defined in net.corda.node.services.transactions.DistributedImmutableMapTests.tearDown.<anonymous>[ValueParameterDescriptorImpl]

'server' @ [46:16] ==> public final val server: CopycatServer defined in net.corda.node.services.transactions.DistributedImmutableMapTests.Member[PropertyDescriptorImpl]

'shutdown' @ [46:23] ==> public open fun shutdown(): (CompletableFuture<(Void..Void?)>..CompletableFuture<(Void..Void?)>?) defined in io.atomix.copycat.server.CopycatServer[JavaMethodDescriptor]

'databases' @ [48:9] ==> private final val databases: MutableList<CordaPersistence> defined in net.corda.node.services.transactions.DistributedImmutableMapTests[PropertyDescriptorImpl]

'forEach' @ [48:19] ==> @HidesMembers public inline fun <T> Iterable<CordaPersistence>.forEach(action: (CordaPersistence) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaPersistence

'it' @ [48:29] ==> value-parameter it: CordaPersistence defined in net.corda.node.services.transactions.DistributedImmutableMapTests.tearDown.<anonymous>[ValueParameterDescriptorImpl]

'close' @ [48:32] ==> public open fun close(): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]

'Test' @ [51:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'cluster' @ [53:22] ==> public final lateinit var cluster: List<DistributedImmutableMapTests.Member> defined in net.corda.node.services.transactions.DistributedImmutableMapTests[PropertyDescriptorImpl]

'last' @ [53:30] ==> public fun <T> List<DistributedImmutableMapTests.Member>.last(): DistributedImmutableMapTests.Member defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member

'client' @ [53:37] ==> public final val client: CopycatClient defined in net.corda.node.services.transactions.DistributedImmutableMapTests.Member[PropertyDescriptorImpl]

'mapOf' @ [55:23] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [55:29] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [55:49] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'client' @ [57:24] ==> val client: CopycatClient defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`stores entries correctly`[LocalVariableDescriptor]

'submit' @ [57:31] ==> public abstract fun <T : (Any..Any?)> submit(p0: (Command<(Map<String, String>..Map<String, String>?)>..Command<(Map<String, String>..Map<String, String>?)>?)): (CompletableFuture<(Map<String, String>..Map<String, String>?)>..CompletableFuture<(Map<String, String>..Map<String, String>?)>?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Map<String, String>

'DistributedImmutableMap' @ [57:38] ==> public companion object defined in net.corda.node.services.transactions.DistributedImmutableMap[FakeCallableDescriptorForObject]

'PutAll' @ [57:71] ==> public constructor PutAll<K, V>(entries: Map<String, String>) defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.PutAll[DeserializedClassConstructorDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'entries' @ [57:78] ==> val entries: Map<String, String> defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`stores entries correctly`[LocalVariableDescriptor]

'getOrThrow' @ [57:88] ==> public fun <V> Future<(Map<String, String>..Map<String, String>?)>.getOrThrow(timeout: Duration? = ...): (Map<String, String>..Map<String, String>?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (kotlin.collections.Map<kotlin.String, kotlin.String>..kotlin.collections.Map<kotlin.String, kotlin.String>?)

'assertTrue' @ [58:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'conflict' @ [58:22] ==> val conflict: (Map<String, String>..Map<String, String>?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`stores entries correctly`[LocalVariableDescriptor]

'isEmpty' @ [58:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'client' @ [60:22] ==> val client: CopycatClient defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`stores entries correctly`[LocalVariableDescriptor]

'submit' @ [60:29] ==> public abstract fun <T : (Any..Any?)> submit(p0: (Query<(String..String?)>..Query<(String..String?)>?)): (CompletableFuture<(String..String?)>..CompletableFuture<(String..String?)>?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'DistributedImmutableMap' @ [60:36] ==> public companion object defined in net.corda.node.services.transactions.DistributedImmutableMap[FakeCallableDescriptorForObject]

'Get' @ [60:69] ==> public constructor Get<out K, V>(key: String) defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.Get[DeserializedClassConstructorDescriptor]
Inferred types:
    <out K> -> String
    <V> -> String

'client' @ [61:22] ==> val client: CopycatClient defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`stores entries correctly`[LocalVariableDescriptor]

'submit' @ [61:29] ==> public abstract fun <T : (Any..Any?)> submit(p0: (Query<(String..String?)>..Query<(String..String?)>?)): (CompletableFuture<(String..String?)>..CompletableFuture<(String..String?)>?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'DistributedImmutableMap' @ [61:36] ==> public companion object defined in net.corda.node.services.transactions.DistributedImmutableMap[FakeCallableDescriptorForObject]

'Get' @ [61:69] ==> public constructor Get<out K, V>(key: String) defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.Get[DeserializedClassConstructorDescriptor]
Inferred types:
    <out K> -> String
    <V> -> String

'assertEquals' @ [63:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (String..String?), actual: (String..String?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.String..kotlin.String?)

'value1' @ [63:22] ==> val value1: (CompletableFuture<(String..String?)>..CompletableFuture<(String..String?)>?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`stores entries correctly`[LocalVariableDescriptor]

'getOrThrow' @ [63:29] ==> public fun <V> Future<(String..String?)>.getOrThrow(timeout: Duration? = ...): (String..String?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (kotlin.String..kotlin.String?)

'assertEquals' @ [64:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: (String..String?), actual: (String..String?), message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (kotlin.String..kotlin.String?)

'value2' @ [64:22] ==> val value2: (CompletableFuture<(String..String?)>..CompletableFuture<(String..String?)>?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`stores entries correctly`[LocalVariableDescriptor]

'getOrThrow' @ [64:29] ==> public fun <V> Future<(String..String?)>.getOrThrow(timeout: Duration? = ...): (String..String?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (kotlin.String..kotlin.String?)

'Test' @ [67:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'cluster' @ [69:22] ==> public final lateinit var cluster: List<DistributedImmutableMapTests.Member> defined in net.corda.node.services.transactions.DistributedImmutableMapTests[PropertyDescriptorImpl]

'last' @ [69:30] ==> public fun <T> List<DistributedImmutableMapTests.Member>.last(): DistributedImmutableMapTests.Member defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Member

'client' @ [69:37] ==> public final val client: CopycatClient defined in net.corda.node.services.transactions.DistributedImmutableMapTests.Member[PropertyDescriptorImpl]

'mapOf' @ [71:23] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'to' @ [71:29] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'to' @ [71:49] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'client' @ [73:24] ==> val client: CopycatClient defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`returns conflict for duplicate entries`[LocalVariableDescriptor]

'submit' @ [73:31] ==> public abstract fun <T : (Any..Any?)> submit(p0: (Command<(Map<String, String>..Map<String, String>?)>..Command<(Map<String, String>..Map<String, String>?)>?)): (CompletableFuture<(Map<String, String>..Map<String, String>?)>..CompletableFuture<(Map<String, String>..Map<String, String>?)>?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Map<String, String>

'DistributedImmutableMap' @ [73:38] ==> public companion object defined in net.corda.node.services.transactions.DistributedImmutableMap[FakeCallableDescriptorForObject]

'PutAll' @ [73:71] ==> public constructor PutAll<K, V>(entries: Map<String, String>) defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.PutAll[DeserializedClassConstructorDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'entries' @ [73:78] ==> val entries: Map<String, String> defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`returns conflict for duplicate entries`[LocalVariableDescriptor]

'getOrThrow' @ [73:88] ==> public fun <V> Future<(Map<String, String>..Map<String, String>?)>.getOrThrow(timeout: Duration? = ...): (Map<String, String>..Map<String, String>?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (kotlin.collections.Map<kotlin.String, kotlin.String>..kotlin.collections.Map<kotlin.String, kotlin.String>?)

'assertTrue' @ [74:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'conflict' @ [74:22] ==> var conflict: (Map<String, String>..Map<String, String>?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`returns conflict for duplicate entries`[LocalVariableDescriptor]

'isEmpty' @ [74:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'conflict' @ [75:9] ==> var conflict: (Map<String, String>..Map<String, String>?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`returns conflict for duplicate entries`[LocalVariableDescriptor]

'client' @ [75:20] ==> val client: CopycatClient defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`returns conflict for duplicate entries`[LocalVariableDescriptor]

'submit' @ [75:27] ==> public abstract fun <T : (Any..Any?)> submit(p0: (Command<(Map<String, String>..Map<String, String>?)>..Command<(Map<String, String>..Map<String, String>?)>?)): (CompletableFuture<(Map<String, String>..Map<String, String>?)>..CompletableFuture<(Map<String, String>..Map<String, String>?)>?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Map<String, String>

'DistributedImmutableMap' @ [75:34] ==> public companion object defined in net.corda.node.services.transactions.DistributedImmutableMap[FakeCallableDescriptorForObject]

'PutAll' @ [75:67] ==> public constructor PutAll<K, V>(entries: Map<String, String>) defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.PutAll[DeserializedClassConstructorDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'entries' @ [75:74] ==> val entries: Map<String, String> defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`returns conflict for duplicate entries`[LocalVariableDescriptor]

'getOrThrow' @ [75:84] ==> public fun <V> Future<(Map<String, String>..Map<String, String>?)>.getOrThrow(timeout: Duration? = ...): (Map<String, String>..Map<String, String>?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (kotlin.collections.Map<kotlin.String, kotlin.String>..kotlin.collections.Map<kotlin.String, kotlin.String>?)

'assertTrue' @ [76:9] ==> public fun assertTrue(message: String? = ..., block: () -> Boolean): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'conflict' @ [76:22] ==> var conflict: (Map<String, String>..Map<String, String>?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`returns conflict for duplicate entries`[LocalVariableDescriptor]

'entries' @ [76:34] ==> val entries: Map<String, String> defined in net.corda.node.services.transactions.DistributedImmutableMapTests.`returns conflict for duplicate entries`[LocalVariableDescriptor]

'freeLocalHostAndPort' @ [80:30] ==> public fun freeLocalHostAndPort(): NetworkHostAndPort defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'mutableListOf' @ [81:23] ==> public fun <T> mutableListOf(vararg elements: CompletableFuture<DistributedImmutableMapTests.Member>): MutableList<CompletableFuture<DistributedImmutableMapTests.Member>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompletableFuture<Member>

'createReplica' @ [81:37] ==> private final fun createReplica(myAddress: NetworkHostAndPort, clusterAddress: NetworkHostAndPort? = ...): CompletableFuture<DistributedImmutableMapTests.Member> defined in net.corda.node.services.transactions.DistributedImmutableMapTests[SimpleFunctionDescriptorImpl]

'clusterAddress' @ [81:51] ==> val clusterAddress: NetworkHostAndPort defined in net.corda.node.services.transactions.DistributedImmutableMapTests.setUpCluster[LocalVariableDescriptor]

'..' @ [82:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'nodeCount' @ [82:22] ==> value-parameter nodeCount: Int = ... defined in net.corda.node.services.transactions.DistributedImmutableMapTests.setUpCluster[ValueParameterDescriptorImpl]

'cluster' @ [82:33] ==> val cluster: MutableList<CompletableFuture<DistributedImmutableMapTests.Member>> defined in net.corda.node.services.transactions.DistributedImmutableMapTests.setUpCluster[LocalVariableDescriptor]

'add' @ [82:41] ==> public abstract fun add(element: CompletableFuture<DistributedImmutableMapTests.Member>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'createReplica' @ [82:45] ==> private final fun createReplica(myAddress: NetworkHostAndPort, clusterAddress: NetworkHostAndPort? = ...): CompletableFuture<DistributedImmutableMapTests.Member> defined in net.corda.node.services.transactions.DistributedImmutableMapTests[SimpleFunctionDescriptorImpl]

'freeLocalHostAndPort' @ [82:59] ==> public fun freeLocalHostAndPort(): NetworkHostAndPort defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'clusterAddress' @ [82:83] ==> val clusterAddress: NetworkHostAndPort defined in net.corda.node.services.transactions.DistributedImmutableMapTests.setUpCluster[LocalVariableDescriptor]

'cluster' @ [83:16] ==> val cluster: MutableList<CompletableFuture<DistributedImmutableMapTests.Member>> defined in net.corda.node.services.transactions.DistributedImmutableMapTests.setUpCluster[LocalVariableDescriptor]

'map' @ [83:24] ==> public inline fun <T, R> Iterable<CompletableFuture<DistributedImmutableMapTests.Member>>.map(transform: (CompletableFuture<DistributedImmutableMapTests.Member>) -> (DistributedImmutableMapTests.Member..DistributedImmutableMapTests.Member?)): List<(DistributedImmutableMapTests.Member..DistributedImmutableMapTests.Member?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompletableFuture<Member>
    <R> -> (net.corda.node.services.transactions.DistributedImmutableMapTests.Member..net.corda.node.services.transactions.DistributedImmutableMapTests.Member?)

'it' @ [83:30] ==> value-parameter it: CompletableFuture<DistributedImmutableMapTests.Member> defined in net.corda.node.services.transactions.DistributedImmutableMapTests.setUpCluster.<anonymous>[ValueParameterDescriptorImpl]

'getOrThrow' @ [83:33] ==> public fun <V> Future<(DistributedImmutableMapTests.Member..DistributedImmutableMapTests.Member?)>.getOrThrow(timeout: Duration? = ...): (DistributedImmutableMapTests.Member..DistributedImmutableMapTests.Member?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (net.corda.node.services.transactions.DistributedImmutableMapTests.Member..net.corda.node.services.transactions.DistributedImmutableMapTests.Member?)

'builder' @ [87:31] ==> public open fun builder(): (Storage.Builder..Storage.Builder?) defined in io.atomix.copycat.server.storage.Storage[JavaMethodDescriptor]

'withStorageLevel' @ [87:41] ==> public open fun withStorageLevel(p0: (StorageLevel..StorageLevel?)): (Storage.Builder..Storage.Builder?) defined in io.atomix.copycat.server.storage.Storage.Builder[JavaMethodDescriptor]

'MEMORY' @ [87:71] ==> enum entry MEMORY defined in io.atomix.copycat.server.storage.StorageLevel[FakeCallableDescriptorForObject]

'build' @ [87:79] ==> public open fun build(): (Storage..Storage?) defined in io.atomix.copycat.server.storage.Storage.Builder[JavaMethodDescriptor]

'Address' @ [88:23] ==> public constructor Address(p0: (String..String?), p1: Int) defined in io.atomix.catalyst.transport.Address[JavaClassConstructorDescriptor]

'myAddress' @ [88:31] ==> value-parameter myAddress: NetworkHostAndPort defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[ValueParameterDescriptorImpl]

'host' @ [88:41] ==> public final val host: String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'myAddress' @ [88:47] ==> value-parameter myAddress: NetworkHostAndPort defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[ValueParameterDescriptorImpl]

'port' @ [88:57] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'configureDatabase' @ [89:24] ==> public fun configureDatabase(dataSourceProperties: Properties, databaseProperties: Properties?, createSchemaService: () -> SchemaService = ..., createIdentityService: () -> IdentityService): CordaPersistence defined in net.corda.node.utilities[DeserializedSimpleFunctionDescriptor]

'makeTestDataSourceProperties' @ [89:42] ==> public fun makeTestDataSourceProperties(nodeName: String = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'makeTestDatabaseProperties' @ [89:74] ==> public fun makeTestDatabaseProperties(key: String? = ..., value: String? = ...): Properties defined in net.corda.testing.node[DeserializedSimpleFunctionDescriptor]

'myAddress' @ [89:134] ==> value-parameter myAddress: NetworkHostAndPort defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[ValueParameterDescriptorImpl]

'port' @ [89:144] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'databases' @ [90:9] ==> private final val databases: MutableList<CordaPersistence> defined in net.corda.node.services.transactions.DistributedImmutableMapTests[PropertyDescriptorImpl]

'add' @ [90:19] ==> public abstract fun add(element: CordaPersistence): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'database' @ [90:23] ==> val database: CordaPersistence defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'DistributedImmutableMap' @ [91:37] ==> public constructor DistributedImmutableMap<K : Any, V : Any, E, EK>(db: CordaPersistence, createMap: () -> AppendOnlyPersistentMap<String, Any, RaftUniquenessProvider.RaftState, String>) defined in net.corda.node.services.transactions.DistributedImmutableMap[DeserializedClassConstructorDescriptor]
Inferred types:
    <K : Any> -> String
    <V : Any> -> Any
    <E> -> RaftState
    <EK> -> String

'database' @ [91:61] ==> val database: CordaPersistence defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'RaftUniquenessProvider' @ [91:71] ==> public companion object defined in net.corda.node.services.transactions.RaftUniquenessProvider[FakeCallableDescriptorForObject]

'Companion' @ [91:94] ==> public companion object defined in net.corda.node.services.transactions.RaftUniquenessProvider[FakeCallableDescriptorForObject]

'builder' @ [93:36] ==> public open fun builder(p0: (Address..Address?)): (CopycatServer.Builder..CopycatServer.Builder?) defined in io.atomix.copycat.server.CopycatServer[JavaMethodDescriptor]

'address' @ [93:44] ==> val address: Address defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'withStateMachine' @ [94:18] ==> public final fun withStateMachine(p0: (() -> (StateMachine..StateMachine?)..(() -> (StateMachine..StateMachine?))?)): (CopycatServer.Builder..CopycatServer.Builder?) defined in io.atomix.copycat.server.CopycatServer.Builder[MyFunctionDescriptor]

'stateMachineFactory' @ [94:35] ==> val stateMachineFactory: () -> DistributedImmutableMap<String, Any, RaftUniquenessProvider.RaftState, String> defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'withStorage' @ [95:18] ==> public open fun withStorage(p0: (Storage..Storage?)): (CopycatServer.Builder..CopycatServer.Builder?) defined in io.atomix.copycat.server.CopycatServer.Builder[JavaMethodDescriptor]

'storage' @ [95:30] ==> val storage: (Storage..Storage?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'build' @ [96:18] ==> public open fun build(): (CopycatServer..CopycatServer?) defined in io.atomix.copycat.server.CopycatServer.Builder[JavaMethodDescriptor]

'if (clusterAddress != null) {
            val cluster = Address(clusterAddress.host, clusterAddress.port)
            server.join(cluster)
        } else {
            server.bootstrap()
        }' @ [98:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?), elseBranch: (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?)): (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.util.concurrent.CompletableFuture<(io.atomix.copycat.server.CopycatServer..io.atomix.copycat.server.CopycatServer?)>..java.util.concurrent.CompletableFuture<(io.atomix.copycat.server.CopycatServer..io.atomix.copycat.server.CopycatServer?)>?)

'clusterAddress' @ [98:36] ==> value-parameter clusterAddress: NetworkHostAndPort? = ... defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[ValueParameterDescriptorImpl]

'Address' @ [99:27] ==> public constructor Address(p0: (String..String?), p1: Int) defined in io.atomix.catalyst.transport.Address[JavaClassConstructorDescriptor]

'clusterAddress' @ [99:35] ==> value-parameter clusterAddress: NetworkHostAndPort? = ... defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[ValueParameterDescriptorImpl]

'host' @ [99:50] ==> public final val host: String defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'clusterAddress' @ [99:56] ==> value-parameter clusterAddress: NetworkHostAndPort? = ... defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[ValueParameterDescriptorImpl]

'port' @ [99:71] ==> public final val port: Int defined in net.corda.core.utilities.NetworkHostAndPort[DeserializedPropertyDescriptor]

'server' @ [100:13] ==> val server: (CopycatServer..CopycatServer?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'join' @ [100:20] ==> public open fun join(vararg p0: (Address..Address?)): (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?) defined in io.atomix.copycat.server.CopycatServer[JavaMethodDescriptor]

'cluster' @ [100:25] ==> val cluster: Address defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'server' @ [102:13] ==> val server: (CopycatServer..CopycatServer?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'bootstrap' @ [102:20] ==> public open fun bootstrap(): (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?) defined in io.atomix.copycat.server.CopycatServer[JavaMethodDescriptor]

'builder' @ [105:36] ==> public open fun builder(vararg p0: (Address..Address?)): (CopycatClient.Builder..CopycatClient.Builder?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]

'address' @ [105:44] ==> val address: Address defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'withConnectionStrategy' @ [106:18] ==> public open fun withConnectionStrategy(p0: (ConnectionStrategy..ConnectionStrategy?)): (CopycatClient.Builder..CopycatClient.Builder?) defined in io.atomix.copycat.client.CopycatClient.Builder[JavaMethodDescriptor]

'EXPONENTIAL_BACKOFF' @ [106:62] ==> enum entry EXPONENTIAL_BACKOFF defined in io.atomix.copycat.client.ConnectionStrategies[FakeCallableDescriptorForObject]

'build' @ [107:18] ==> public open fun build(): (CopycatClient..CopycatClient?) defined in io.atomix.copycat.client.CopycatClient.Builder[JavaMethodDescriptor]

'serverInitFuture' @ [108:16] ==> val serverInitFuture: (CompletableFuture<(CopycatServer..CopycatServer?)>..CompletableFuture<(CopycatServer..CopycatServer?)>?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'thenCompose' @ [108:33] ==> public final fun <U : (Any..Any?)> thenCompose(p0: (((CopycatServer..CopycatServer?)) -> (CompletionStage<(CopycatClient..CopycatClient?)>..CompletionStage<(CopycatClient..CopycatClient?)>?)..(((CopycatServer..CopycatServer?)) -> (CompletionStage<(CopycatClient..CopycatClient?)>..CompletionStage<(CopycatClient..CopycatClient?)>?))?)): (CompletableFuture<(CopycatClient..CopycatClient?)>..CompletableFuture<(CopycatClient..CopycatClient?)>?) defined in java.util.concurrent.CompletableFuture[MyFunctionDescriptor]
Inferred types:
    <U : (Any..Any?)> -> CopycatClient

'client' @ [108:47] ==> val client: (CopycatClient..CopycatClient?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'connect' @ [108:54] ==> public open fun connect(vararg p0: (Address..Address?)): (CompletableFuture<(CopycatClient..CopycatClient?)>..CompletableFuture<(CopycatClient..CopycatClient?)>?) defined in io.atomix.copycat.client.CopycatClient[JavaMethodDescriptor]

'address' @ [108:62] ==> val address: Address defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

'thenApply' @ [108:73] ==> public final fun <U : (Any..Any?)> thenApply(p0: (((CopycatClient..CopycatClient?)) -> (DistributedImmutableMapTests.Member..DistributedImmutableMapTests.Member?)..(((CopycatClient..CopycatClient?)) -> (DistributedImmutableMapTests.Member..DistributedImmutableMapTests.Member?))?)): (CompletableFuture<(DistributedImmutableMapTests.Member..DistributedImmutableMapTests.Member?)>..CompletableFuture<(DistributedImmutableMapTests.Member..DistributedImmutableMapTests.Member?)>?) defined in java.util.concurrent.CompletableFuture[MyFunctionDescriptor]
Inferred types:
    <U : (Any..Any?)> -> Member

'Member' @ [108:85] ==> public constructor Member(client: CopycatClient, server: CopycatServer) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.Member[ClassConstructorDescriptorImpl]

'it' @ [108:92] ==> value-parameter it: (CopycatClient..CopycatClient?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica.<anonymous>[ValueParameterDescriptorImpl]

'server' @ [108:96] ==> val server: (CopycatServer..CopycatServer?) defined in net.corda.node.services.transactions.DistributedImmutableMapTests.createReplica[LocalVariableDescriptor]

