'StateMachine' @ [22:139] ==> protected/*protected and package*/ constructor StateMachine() defined in io.atomix.copycat.server.StateMachine[JavaClassConstructorDescriptor]

'loggerFor' @ [24:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> DistributedImmutableMap<*, *, *, *>

'SNAPSHOT' @ [32:47] ==> enum entry SNAPSHOT defined in io.atomix.copycat.Command.CompactionMode[FakeCallableDescriptorForObject]

'db' @ [40:23] ==> public final val db: CordaPersistence defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'transaction' @ [40:26] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AppendOnlyPersistentMap<K, V, E, EK>): AppendOnlyPersistentMap<K, V, E, EK> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> AppendOnlyPersistentMap<K, V, E, EK>

'invoke' @ [40:40] ==> public abstract operator fun invoke(): AppendOnlyPersistentMap<K, V, E, EK> defined in kotlin.Function0[FunctionInvokeDescriptor]

'commit' @ [44:9] ==> value-parameter commit: Commit<DistributedImmutableMap.Commands.Get<K, V>> defined in net.corda.node.services.transactions.DistributedImmutableMap.get[ValueParameterDescriptorImpl]

'use' @ [44:16] ==> @SinceKotlin @InlineOnly public inline fun <T : AutoCloseable?, R> Commit<DistributedImmutableMap.Commands.Get<K, V>>.use(block: (Commit<DistributedImmutableMap.Commands.Get<K, V>>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : AutoCloseable?> -> Commit<Get<K, V>>
    <R> -> Nothing

'it' @ [45:23] ==> value-parameter it: Commit<DistributedImmutableMap.Commands.Get<K, V>> defined in net.corda.node.services.transactions.DistributedImmutableMap.get.<anonymous>[ValueParameterDescriptorImpl]

'operation' @ [45:26] ==> public abstract fun operation(): (DistributedImmutableMap.Commands.Get<K, V>..DistributedImmutableMap.Commands.Get<K, V>?) defined in io.atomix.copycat.server.Commit[JavaMethodDescriptor]

'key' @ [45:38] ==> public final val key: K defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.Get[PropertyDescriptorImpl]

'db' @ [46:20] ==> public final val db: CordaPersistence defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'transaction' @ [46:23] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> V?): V? defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> V?

'map' @ [46:37] ==> private final val map: AppendOnlyPersistentMap<K, V, E, EK> defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'key' @ [46:41] ==> val key: K defined in net.corda.node.services.transactions.DistributedImmutableMap.get.<anonymous>[LocalVariableDescriptor]

'commit' @ [56:9] ==> value-parameter commit: Commit<DistributedImmutableMap.Commands.PutAll<K, V>> defined in net.corda.node.services.transactions.DistributedImmutableMap.put[ValueParameterDescriptorImpl]

'use' @ [56:16] ==> @SinceKotlin @InlineOnly public inline fun <T : AutoCloseable?, R> Commit<DistributedImmutableMap.Commands.PutAll<K, V>>.use(block: (Commit<DistributedImmutableMap.Commands.PutAll<K, V>>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : AutoCloseable?> -> Commit<PutAll<K, V>>
    <R> -> Nothing

'LinkedHashMap' @ [57:29] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> K
    <V : (Any..Any?)> -> V

'db' @ [58:13] ==> public final val db: CordaPersistence defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'transaction' @ [58:16] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'commit' @ [59:31] ==> value-parameter commit: Commit<DistributedImmutableMap.Commands.PutAll<K, V>> defined in net.corda.node.services.transactions.DistributedImmutableMap.put[ValueParameterDescriptorImpl]

'operation' @ [59:38] ==> public abstract fun operation(): (DistributedImmutableMap.Commands.PutAll<K, V>..DistributedImmutableMap.Commands.PutAll<K, V>?) defined in io.atomix.copycat.server.Commit[JavaMethodDescriptor]

'entries' @ [59:50] ==> public final val entries: Map<K, V> defined in net.corda.node.services.transactions.DistributedImmutableMap.Commands.PutAll[PropertyDescriptorImpl]

'log' @ [60:17] ==> private final val log: Logger defined in net.corda.node.services.transactions.DistributedImmutableMap.Companion[PropertyDescriptorImpl]

'debug' @ [60:21] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'entries' @ [60:79] ==> val entries: Map<K, V> defined in net.corda.node.services.transactions.DistributedImmutableMap.put.<anonymous>.<anonymous>[LocalVariableDescriptor]

'keys' @ [60:87] ==> public abstract val keys: Set<K> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'joinToString' @ [60:92] ==> public fun <T> Iterable<K>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((K) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K

'entries' @ [61:29] ==> val entries: Map<K, V> defined in net.corda.node.services.transactions.DistributedImmutableMap.put.<anonymous>.<anonymous>[LocalVariableDescriptor]

'keys' @ [61:37] ==> public abstract val keys: Set<K> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [61:43] ==> private final val map: AppendOnlyPersistentMap<K, V, E, EK> defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'key' @ [61:47] ==> val key: K defined in net.corda.node.services.transactions.DistributedImmutableMap.put.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [61:53] ==> @InlineOnly public inline fun <T, R> V.let(block: (V) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> V
    <R> -> Unit

'conflicts' @ [61:59] ==> val conflicts: LinkedHashMap<K, V> defined in net.corda.node.services.transactions.DistributedImmutableMap.put.<anonymous>[LocalVariableDescriptor]

'key' @ [61:69] ==> val key: K defined in net.corda.node.services.transactions.DistributedImmutableMap.put.<anonymous>.<anonymous>[LocalVariableDescriptor]

'it' @ [61:76] ==> value-parameter it: V defined in net.corda.node.services.transactions.DistributedImmutableMap.put.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'conflicts' @ [62:21] ==> val conflicts: LinkedHashMap<K, V> defined in net.corda.node.services.transactions.DistributedImmutableMap.put.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [62:31] ==> public open fun isEmpty(): Boolean defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'map' @ [62:42] ==> private final val map: AppendOnlyPersistentMap<K, V, E, EK> defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'putAll' @ [62:46] ==> public final fun putAll(entries: Map<K, V>): Unit defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'entries' @ [62:53] ==> val entries: Map<K, V> defined in net.corda.node.services.transactions.DistributedImmutableMap.put.<anonymous>.<anonymous>[LocalVariableDescriptor]

'conflicts' @ [64:20] ==> val conflicts: LinkedHashMap<K, V> defined in net.corda.node.services.transactions.DistributedImmutableMap.put.<anonymous>[LocalVariableDescriptor]

'commit' @ [69:9] ==> value-parameter commit: Commit<DistributedImmutableMap.Commands.Size> defined in net.corda.node.services.transactions.DistributedImmutableMap.size[ValueParameterDescriptorImpl]

'use' @ [69:16] ==> @SinceKotlin @InlineOnly public inline fun <T : AutoCloseable?, R> Commit<DistributedImmutableMap.Commands.Size>.use(block: (Commit<DistributedImmutableMap.Commands.Size>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : AutoCloseable?> -> Commit<Size>
    <R> -> Nothing

'db' @ [70:20] ==> public final val db: CordaPersistence defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'transaction' @ [70:23] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Int): Int defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Int

'map' @ [70:37] ==> private final val map: AppendOnlyPersistentMap<K, V, E, EK> defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'size' @ [70:41] ==> public final val size: Int defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'db' @ [80:9] ==> public final val db: CordaPersistence defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'transaction' @ [80:12] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'writer' @ [81:13] ==> value-parameter writer: SnapshotWriter defined in net.corda.node.services.transactions.DistributedImmutableMap.snapshot[ValueParameterDescriptorImpl]

'writeInt' @ [81:20] ==> public open fun writeInt(p0: Int): (SnapshotWriter..SnapshotWriter?) defined in io.atomix.copycat.server.storage.snapshot.SnapshotWriter[JavaMethodDescriptor]

'map' @ [81:29] ==> private final val map: AppendOnlyPersistentMap<K, V, E, EK> defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'size' @ [81:33] ==> public final val size: Int defined in net.corda.node.utilities.AppendOnlyPersistentMap[PropertyDescriptorImpl]

'map' @ [82:13] ==> private final val map: AppendOnlyPersistentMap<K, V, E, EK> defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'allPersisted' @ [82:17] ==> public final fun allPersisted(): Sequence<Pair<K, V>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'forEach' @ [82:32] ==> public inline fun <T> Sequence<Pair<K, V>>.forEach(action: (Pair<K, V>) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<K, V>

'writer' @ [82:42] ==> value-parameter writer: SnapshotWriter defined in net.corda.node.services.transactions.DistributedImmutableMap.snapshot[ValueParameterDescriptorImpl]

'writeObject' @ [82:49] ==> public open fun writeObject(p0: (Any..Any?)): (SnapshotWriter..SnapshotWriter?) defined in io.atomix.copycat.server.storage.snapshot.SnapshotWriter[JavaMethodDescriptor]

'it' @ [82:61] ==> value-parameter it: Pair<K, V> defined in net.corda.node.services.transactions.DistributedImmutableMap.snapshot.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [82:64] ==> public final val first: K defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [82:73] ==> value-parameter it: Pair<K, V> defined in net.corda.node.services.transactions.DistributedImmutableMap.snapshot.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [82:76] ==> public final val second: V defined in kotlin.Pair[DeserializedPropertyDescriptor]

'reader' @ [88:20] ==> value-parameter reader: SnapshotReader defined in net.corda.node.services.transactions.DistributedImmutableMap.install[ValueParameterDescriptorImpl]

'readInt' @ [88:27] ==> public open fun readInt(): Int defined in io.atomix.copycat.server.storage.snapshot.SnapshotReader[JavaMethodDescriptor]

'db' @ [89:9] ==> public final val db: CordaPersistence defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'transaction' @ [89:12] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'map' @ [90:13] ==> private final val map: AppendOnlyPersistentMap<K, V, E, EK> defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'clear' @ [90:17] ==> public final fun clear(): Unit defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'..' @ [92:23] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'size' @ [92:26] ==> val size: Int defined in net.corda.node.services.transactions.DistributedImmutableMap.install[LocalVariableDescriptor]

'component1' @ [93:22] ==> public final operator fun component1(): K defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [93:27] ==> public final operator fun component2(): V defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'reader' @ [93:36] ==> value-parameter reader: SnapshotReader defined in net.corda.node.services.transactions.DistributedImmutableMap.install[ValueParameterDescriptorImpl]

'readObject' @ [93:43] ==> public open fun <T : (Any..Any?)> readObject(): (Pair<K, V>..Pair<K, V>?) defined in io.atomix.copycat.server.storage.snapshot.SnapshotReader[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Pair<K, V>

'map' @ [94:17] ==> private final val map: AppendOnlyPersistentMap<K, V, E, EK> defined in net.corda.node.services.transactions.DistributedImmutableMap[PropertyDescriptorImpl]

'key' @ [94:21] ==> val key: K defined in net.corda.node.services.transactions.DistributedImmutableMap.install.<anonymous>[LocalVariableDescriptor]

'value' @ [94:28] ==> val value: V defined in net.corda.node.services.transactions.DistributedImmutableMap.install.<anonymous>[LocalVariableDescriptor]

