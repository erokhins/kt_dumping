'distributedCluster' @ [33:108] ==> private final val distributedCluster: <no name provided> defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[PropertyDescriptorImpl]

'NotaryService' @ [33:130] ==> public constructor NotaryService() defined in net.corda.core.node.services.NotaryService[DeserializedClassConstructorDescriptor]

'SimpleNotaryService' @ [35:20] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [35:40] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[PropertyDescriptorImpl]

'getSubType' @ [35:45] ==> public final fun getSubType(subTypeId: String): ServiceType defined in net.corda.core.node.services.ServiceType[DeserializedSimpleFunctionDescriptor]

'loggerFor' @ [36:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> BFTNonValidatingNotaryService

'log' @ [39:17] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[PropertyDescriptorImpl]

'warn' @ [39:21] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'create' @ [45:48] ==> public open fun <V : (Any..Any?)> create(): (SettableFuture<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>..SettableFuture<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>?) defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Replica

'require' @ [48:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'services' @ [48:17] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'configuration' @ [48:26] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'bftSMaRt' @ [48:40] ==> public abstract val bftSMaRt: BFTSMaRtConfiguration defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'isValid' @ [48:49] ==> public final fun isValid(): Boolean defined in net.corda.node.services.config.BFTSMaRtConfiguration[SimpleFunctionDescriptorImpl]

'client' @ [49:9] ==> private final val client: BFTSMaRt.Client defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'BFTSMaRtConfig' @ [49:18] ==> public constructor BFTSMaRtConfig(replicaAddresses: List<NetworkHostAndPort>, debug: Boolean, exposeRaces: Boolean) defined in net.corda.node.services.transactions.BFTSMaRtConfig[ClassConstructorDescriptorImpl]

'services' @ [49:33] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'configuration' @ [49:42] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'notaryClusterAddresses' @ [49:56] ==> public abstract val notaryClusterAddresses: List<NetworkHostAndPort> defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'services' @ [49:80] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'configuration' @ [49:89] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'bftSMaRt' @ [49:103] ==> public abstract val bftSMaRt: BFTSMaRtConfiguration defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'debug' @ [49:112] ==> public final val debug: Boolean defined in net.corda.node.services.config.BFTSMaRtConfiguration[PropertyDescriptorImpl]

'services' @ [49:119] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'configuration' @ [49:128] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'bftSMaRt' @ [49:142] ==> public abstract val bftSMaRt: BFTSMaRtConfiguration defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'exposeRaces' @ [49:151] ==> public final val exposeRaces: Boolean defined in net.corda.node.services.config.BFTSMaRtConfiguration[PropertyDescriptorImpl]

'use' @ [49:164] ==> @InlineOnly public inline fun <T : Closeable?, R> BFTSMaRtConfig.use(block: (BFTSMaRtConfig) -> BFTSMaRt.Client): BFTSMaRt.Client defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BFTSMaRtConfig
    <R> -> Client

'services' @ [50:29] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'configuration' @ [50:38] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'bftSMaRt' @ [50:52] ==> public abstract val bftSMaRt: BFTSMaRtConfiguration defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'replicaId' @ [50:61] ==> public final val replicaId: Int defined in net.corda.node.services.config.BFTSMaRtConfiguration[PropertyDescriptorImpl]

'it' @ [51:32] ==> value-parameter it: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>[ValueParameterDescriptorImpl]

'handle' @ [51:35] ==> public final fun handle(): BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTSMaRtConfig[SimpleFunctionDescriptorImpl]

'thread' @ [53:13] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'replicaId' @ [53:47] ==> val replicaId: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>[LocalVariableDescriptor]

'configHandle' @ [54:17] ==> val configHandle: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>[LocalVariableDescriptor]

'use' @ [54:30] ==> @InlineOnly public inline fun <T : Closeable?, R> BFTSMaRtConfig.use(block: (BFTSMaRtConfig) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BFTSMaRtConfig
    <R> -> Unit

'TimeWindowChecker' @ [55:45] ==> public constructor TimeWindowChecker(clock: Clock = ...) defined in net.corda.core.node.services.TimeWindowChecker[DeserializedClassConstructorDescriptor]

'services' @ [55:63] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'clock' @ [55:72] ==> public abstract val clock: Clock defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'Replica' @ [56:35] ==> public constructor Replica(config: BFTSMaRtConfig, replicaId: Int, createMap: () -> AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef>, services: ServiceHubInternal, timeWindowChecker: TimeWindowChecker) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica[ClassConstructorDescriptorImpl]

'it' @ [56:43] ==> value-parameter it: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'replicaId' @ [56:47] ==> val replicaId: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>[LocalVariableDescriptor]

'createMap' @ [56:60] ==> public final fun createMap(): AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef> defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[SimpleFunctionDescriptorImpl]

'services' @ [56:75] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'timeWindowChecker' @ [56:85] ==> val timeWindowChecker: TimeWindowChecker defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'replicaHolder' @ [57:21] ==> private final val replicaHolder: (SettableFuture<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>..SettableFuture<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>?) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'set' @ [57:35] ==> @CanIgnoreReturnValue public open fun set(@Nullable p0: BFTNonValidatingNotaryService.Replica?): Boolean defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'replica' @ [57:39] ==> val replica: BFTNonValidatingNotaryService.Replica defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'log' @ [58:21] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[PropertyDescriptorImpl]

'info' @ [58:25] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'replicaId' @ [58:50] ==> val replicaId: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>[LocalVariableDescriptor]

'BFTSMaRt' @ [61:13] ==> public object BFTSMaRt defined in net.corda.node.services.transactions in file BFTSMaRt.kt[FakeCallableDescriptorForObject]

'Client' @ [61:22] ==> public constructor Client(config: BFTSMaRtConfig, clientId: Int, cluster: BFTSMaRt.Cluster) defined in net.corda.node.services.transactions.BFTSMaRt.Client[ClassConstructorDescriptorImpl]

'it' @ [61:29] ==> value-parameter it: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>[ValueParameterDescriptorImpl]

'replicaId' @ [61:33] ==> val replicaId: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>.<anonymous>[LocalVariableDescriptor]

'cluster' @ [61:44] ==> value-parameter cluster: BFTSMaRt.Cluster = ... defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.<init>[ValueParameterDescriptorImpl]

'log' @ [66:9] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[PropertyDescriptorImpl]

'debug' @ [66:13] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'services' @ [66:44] ==> public open val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'configuration' @ [66:53] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'bftSMaRt' @ [66:67] ==> public abstract val bftSMaRt: BFTSMaRtConfiguration defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'replicaId' @ [66:76] ==> public final val replicaId: Int defined in net.corda.node.services.config.BFTSMaRtConfiguration[PropertyDescriptorImpl]

'replicaHolder' @ [67:9] ==> private final val replicaHolder: (SettableFuture<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>..SettableFuture<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>?) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'getOrThrow' @ [67:23] ==> public fun <V> Future<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>.getOrThrow(timeout: Duration? = ...): (BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica..net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica?)

'client' @ [70:56] ==> private final val client: BFTSMaRt.Client defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'commitTransaction' @ [70:63] ==> public final fun commitTransaction(transaction: Any, otherSide: Party): BFTSMaRt.ClusterResponse defined in net.corda.node.services.transactions.BFTSMaRt.Client[SimpleFunctionDescriptorImpl]

'tx' @ [70:81] ==> value-parameter tx: Any defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.commitTransaction[ValueParameterDescriptorImpl]

'otherSide' @ [70:85] ==> value-parameter otherSide: Party defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.commitTransaction[ValueParameterDescriptorImpl]

'ServiceFlow' @ [72:75] ==> public constructor ServiceFlow(otherSide: Party, service: BFTNonValidatingNotaryService) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow[ClassConstructorDescriptorImpl]

'otherParty' @ [72:87] ==> value-parameter otherParty: Party defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createServiceFlow[ValueParameterDescriptorImpl]

'this' @ [72:99] ==> <this> defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[LazyClassReceiverParameterDescriptor]

'FlowLogic<Void?>' @ [74:99] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Void?

'Suspendable' @ [75:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [77:23] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<FilteredTransaction> defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> FilteredTransaction

'otherSide' @ [77:52] ==> public final val otherSide: Party defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow[PropertyDescriptorImpl]

'unwrap' @ [77:63] ==> public inline fun <T, R> UntrustworthyData<FilteredTransaction>.unwrap(validator: (FilteredTransaction) -> FilteredTransaction): FilteredTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FilteredTransaction
    <R> -> FilteredTransaction

'it' @ [77:72] ==> value-parameter it: FilteredTransaction defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'commit' @ [78:30] ==> private final fun commit(stx: FilteredTransaction): List<DigitalSignature> defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow[SimpleFunctionDescriptorImpl]

'stx' @ [78:37] ==> val stx: FilteredTransaction defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow.call[LocalVariableDescriptor]

'send' @ [79:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow[DeserializedSimpleFunctionDescriptor]

'otherSide' @ [79:18] ==> public final val otherSide: Party defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow[PropertyDescriptorImpl]

'signatures' @ [79:29] ==> val signatures: List<DigitalSignature> defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow.call[LocalVariableDescriptor]

'service' @ [84:28] ==> public final val service: BFTNonValidatingNotaryService defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow[PropertyDescriptorImpl]

'commitTransaction' @ [84:36] ==> public final fun commitTransaction(tx: Any, otherSide: Party): BFTSMaRt.ClusterResponse defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[SimpleFunctionDescriptorImpl]

'stx' @ [84:54] ==> value-parameter stx: FilteredTransaction defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow.commit[ValueParameterDescriptorImpl]

'otherSide' @ [84:59] ==> public final val otherSide: Party defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow[PropertyDescriptorImpl]

'when (response) {
                is BFTSMaRt.ClusterResponse.Error -> throw NotaryException(response.error)
                is BFTSMaRt.ClusterResponse.Signatures -> {
                    log.debug("All input states of transaction ${stx.rootHash} have been committed")
                    return response.txSignatures
                }
            }' @ [85:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'response' @ [85:19] ==> val response: BFTSMaRt.ClusterResponse defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow.commit[LocalVariableDescriptor]

'NotaryException' @ [86:60] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'response' @ [86:76] ==> val response: BFTSMaRt.ClusterResponse defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow.commit[LocalVariableDescriptor]

'error' @ [86:85] ==> public final val error: NotaryError defined in net.corda.node.services.transactions.BFTSMaRt.ClusterResponse.Error[PropertyDescriptorImpl]

'log' @ [88:21] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[PropertyDescriptorImpl]

'debug' @ [88:25] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'stx' @ [88:66] ==> value-parameter stx: FilteredTransaction defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow.commit[ValueParameterDescriptorImpl]

'rootHash' @ [88:70] ==> public final val rootHash: SecureHash defined in net.corda.core.transactions.FilteredTransaction[DeserializedPropertyDescriptor]

'response' @ [89:28] ==> val response: BFTSMaRt.ClusterResponse defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.ServiceFlow.commit[LocalVariableDescriptor]

'txSignatures' @ [89:37] ==> public final val txSignatures: List<DigitalSignature> defined in net.corda.node.services.transactions.BFTSMaRt.ClusterResponse.Signatures[PropertyDescriptorImpl]

'Entity' @ [95:5] ==> public constructor Entity(name: String = ...) defined in javax.persistence.Entity[JavaClassConstructorDescriptor]

'javax.persistence.Table' @ [96:5] ==> public constructor Table(name: String = ..., catalog: String = ..., schema: String = ..., uniqueConstraints: Array<UniqueConstraint> = ..., indexes: Array<Index> = ...) defined in javax.persistence.Table[JavaClassConstructorDescriptor]

'NODE_DATABASE_PREFIX' @ [96:40] ==> public const val NODE_DATABASE_PREFIX: String defined in net.corda.node.utilities in file CordaPersistence.kt[PropertyDescriptorImpl]

'PersistentUniquenessProvider.PersistentUniqueness' @ [98:11] ==> public constructor PersistentUniqueness(id: PersistentStateRef = ..., consumingTxHash: String = ..., consumingIndex: Int = ..., party: PersistentUniquenessProvider.PersistentParty = ...) defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentUniqueness[ClassConstructorDescriptorImpl]

'id' @ [98:61] ==> value-parameter id: PersistentStateRef defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState.<init>[ValueParameterDescriptorImpl]

'consumingTxHash' @ [98:65] ==> value-parameter consumingTxHash: String defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState.<init>[ValueParameterDescriptorImpl]

'consumingIndex' @ [98:82] ==> value-parameter consumingIndex: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState.<init>[ValueParameterDescriptorImpl]

'party' @ [98:98] ==> value-parameter party: PersistentUniquenessProvider.PersistentParty defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState.<init>[ValueParameterDescriptorImpl]

'AppendOnlyPersistentMap' @ [101:13] ==> public constructor AppendOnlyPersistentMap<K, V, E, out EK>(toPersistentEntityKey: (StateRef) -> PersistentStateRef, fromPersistentEntity: (BFTNonValidatingNotaryService.PersistedCommittedState) -> Pair<StateRef, UniquenessProvider.ConsumingTx>, toPersistentEntity: (key: StateRef, value: UniquenessProvider.ConsumingTx) -> BFTNonValidatingNotaryService.PersistedCommittedState, persistentEntityClass: Class<BFTNonValidatingNotaryService.PersistedCommittedState>, cacheBound: Long = ...) defined in net.corda.node.utilities.AppendOnlyPersistentMap[ClassConstructorDescriptorImpl]
Inferred types:
    <K> -> StateRef
    <V> -> ConsumingTx
    <E> -> PersistedCommittedState
    <out EK> -> PersistentStateRef

'PersistentStateRef' @ [102:47] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [102:66] ==> value-parameter it: StateRef defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [102:69] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'toString' @ [102:76] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'it' @ [102:88] ==> value-parameter it: StateRef defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [102:91] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'it' @ [105:36] ==> value-parameter it: BFTNonValidatingNotaryService.PersistedCommittedState defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [105:39] ==> @EmbeddedId public final var id: PersistentStateRef defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState[PropertyDescriptorImpl]

'txId' @ [105:42] ==> @field:Column public final var txId: String? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'IllegalStateException' @ [105:56] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'it' @ [106:37] ==> value-parameter it: BFTNonValidatingNotaryService.PersistedCommittedState defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [106:40] ==> @EmbeddedId public final var id: PersistentStateRef defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState[PropertyDescriptorImpl]

'index' @ [106:43] ==> @field:Column public final var index: Int? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'IllegalStateException' @ [106:58] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'Pair' @ [107:25] ==> public constructor Pair<out A, out B>(first: StateRef, second: UniquenessProvider.ConsumingTx) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> StateRef
    <out B> -> ConsumingTx

'StateRef' @ [107:30] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'parse' @ [107:59] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'txId' @ [107:65] ==> var txId: String defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[LocalVariableDescriptor]

'index' @ [107:80] ==> var index: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[LocalVariableDescriptor]

'ConsumingTx' @ [108:48] ==> public constructor ConsumingTx(id: SecureHash, inputIndex: Int, requestingParty: Party) defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedClassConstructorDescriptor]

'parse' @ [109:53] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [109:59] ==> value-parameter it: BFTNonValidatingNotaryService.PersistedCommittedState defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[ValueParameterDescriptorImpl]

'consumingTxHash' @ [109:62] ==> @Column public final var consumingTxHash: String defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState[PropertyDescriptorImpl]

'it' @ [110:50] ==> value-parameter it: BFTNonValidatingNotaryService.PersistedCommittedState defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[ValueParameterDescriptorImpl]

'consumingIndex' @ [110:53] ==> @Column public final var consumingIndex: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState[PropertyDescriptorImpl]

'Party' @ [111:55] ==> public constructor Party(name: X500Name, owningKey: PublicKey) defined in net.corda.core.identity.Party[DeserializedClassConstructorDescriptor]

'X500Name' @ [112:52] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'it' @ [112:61] ==> value-parameter it: BFTNonValidatingNotaryService.PersistedCommittedState defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [112:64] ==> @Embedded public final var party: PersistentUniquenessProvider.PersistentParty defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState[PropertyDescriptorImpl]

'name' @ [112:70] ==> @Column public final var name: String defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentParty[PropertyDescriptorImpl]

'parsePublicKeyBase58' @ [113:57] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'it' @ [113:78] ==> value-parameter it: BFTNonValidatingNotaryService.PersistedCommittedState defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [113:81] ==> @Embedded public final var party: PersistentUniquenessProvider.PersistentParty defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState[PropertyDescriptorImpl]

'owningKey' @ [113:87] ==> @Column public final var owningKey: String defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentParty[PropertyDescriptorImpl]

'component1' @ [115:45] ==> public final operator fun component1(): SecureHash defined in net.corda.core.contracts.StateRef[DeserializedSimpleFunctionDescriptor]

'component2' @ [115:53] ==> public final operator fun component2(): Int defined in net.corda.core.contracts.StateRef[DeserializedSimpleFunctionDescriptor]

'component1' @ [115:73] ==> public final operator fun component1(): SecureHash defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedSimpleFunctionDescriptor]

'component2' @ [115:77] ==> public final operator fun component2(): Int defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedSimpleFunctionDescriptor]

'component3' @ [115:89] ==> public final operator fun component3(): Party defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedSimpleFunctionDescriptor]

'PersistedCommittedState' @ [116:25] ==> public constructor PersistedCommittedState(id: PersistentStateRef, consumingTxHash: String, consumingIndex: Int, party: PersistentUniquenessProvider.PersistentParty) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState[ClassConstructorDescriptorImpl]

'PersistentStateRef' @ [117:38] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'txHash' @ [117:57] ==> val txHash: SecureHash defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[LocalVariableDescriptor]

'toString' @ [117:64] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'index' @ [117:76] ==> val index: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[LocalVariableDescriptor]

'id' @ [118:51] ==> val id: SecureHash defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[LocalVariableDescriptor]

'toString' @ [118:54] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'inputIndex' @ [119:50] ==> val inputIndex: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[LocalVariableDescriptor]

'PersistentParty' @ [120:70] ==> public constructor PersistentParty(name: String = ..., owningKey: String = ...) defined in net.corda.node.services.transactions.PersistentUniquenessProvider.PersistentParty[ClassConstructorDescriptorImpl]

'requestingParty' @ [120:86] ==> val requestingParty: Party defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[LocalVariableDescriptor]

'name' @ [120:102] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [120:107] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'requestingParty' @ [121:41] ==> val requestingParty: Party defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.createMap.<anonymous>[LocalVariableDescriptor]

'owningKey' @ [121:57] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toBase58String' @ [121:67] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'PersistedCommittedState' @ [124:45] ==> public constructor PersistedCommittedState(id: PersistentStateRef, consumingTxHash: String, consumingIndex: Int, party: PersistentUniquenessProvider.PersistentParty) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.PersistedCommittedState[ClassConstructorDescriptorImpl]

'java' @ [124:76] ==> public val <T> KClass<BFTNonValidatingNotaryService.PersistedCommittedState>.java: Class<BFTNonValidatingNotaryService.PersistedCommittedState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PersistedCommittedState

'BFTSMaRt.Replica' @ [131:67] ==> public constructor Replica(config: BFTSMaRtConfig, replicaId: Int, createMap: () -> AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef>, services: ServiceHubInternal, timeWindowChecker: TimeWindowChecker) defined in net.corda.node.services.transactions.BFTSMaRt.Replica[ClassConstructorDescriptorImpl]

'config' @ [131:84] ==> value-parameter config: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.<init>[ValueParameterDescriptorImpl]

'replicaId' @ [131:92] ==> value-parameter replicaId: Int defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.<init>[ValueParameterDescriptorImpl]

'createMap' @ [131:103] ==> value-parameter createMap: () -> AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef> defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.<init>[ValueParameterDescriptorImpl]

'services' @ [131:114] ==> value-parameter services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.<init>[ValueParameterDescriptorImpl]

'timeWindowChecker' @ [131:124] ==> value-parameter timeWindowChecker: TimeWindowChecker defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.<init>[ValueParameterDescriptorImpl]

'command' @ [134:27] ==> value-parameter command: ByteArray defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.executeCommand[ValueParameterDescriptorImpl]

'deserialize' @ [134:35] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): BFTSMaRt.CommitRequest defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> CommitRequest

'request' @ [135:23] ==> val request: BFTSMaRt.CommitRequest defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.executeCommand[LocalVariableDescriptor]

'tx' @ [135:31] ==> public final val tx: Any defined in net.corda.node.services.transactions.BFTSMaRt.CommitRequest[PropertyDescriptorImpl]

'verifyAndCommitTx' @ [136:28] ==> public final fun verifyAndCommitTx(ftx: FilteredTransaction, callerIdentity: Party): BFTSMaRt.ReplicaResponse defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica[SimpleFunctionDescriptorImpl]

'ftx' @ [136:46] ==> val ftx: FilteredTransaction defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.executeCommand[LocalVariableDescriptor]

'request' @ [136:51] ==> val request: BFTSMaRt.CommitRequest defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.executeCommand[LocalVariableDescriptor]

'callerIdentity' @ [136:59] ==> public final val callerIdentity: Party defined in net.corda.node.services.transactions.BFTSMaRt.CommitRequest[PropertyDescriptorImpl]

'response' @ [137:20] ==> val response: BFTSMaRt.ReplicaResponse defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.executeCommand[LocalVariableDescriptor]

'serialize' @ [137:29] ==> public fun <T : Any> BFTSMaRt.ReplicaResponse.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<BFTSMaRt.ReplicaResponse> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ReplicaResponse

'bytes' @ [137:41] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'ftx' @ [142:26] ==> value-parameter ftx: FilteredTransaction defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[ValueParameterDescriptorImpl]

'rootHash' @ [142:30] ==> public final val rootHash: SecureHash defined in net.corda.core.transactions.FilteredTransaction[DeserializedPropertyDescriptor]

'ftx' @ [143:30] ==> value-parameter ftx: FilteredTransaction defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[ValueParameterDescriptorImpl]

'filteredLeaves' @ [143:34] ==> public final val filteredLeaves: FilteredLeaves defined in net.corda.core.transactions.FilteredTransaction[DeserializedPropertyDescriptor]

'inputs' @ [143:49] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.FilteredLeaves[DeserializedPropertyDescriptor]

'validateTimeWindow' @ [145:17] ==> protected final fun validateTimeWindow(t: TimeWindow?): Unit defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica[SimpleFunctionDescriptorImpl]

'ftx' @ [145:36] ==> value-parameter ftx: FilteredTransaction defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[ValueParameterDescriptorImpl]

'filteredLeaves' @ [145:40] ==> public final val filteredLeaves: FilteredLeaves defined in net.corda.core.transactions.FilteredTransaction[DeserializedPropertyDescriptor]

'timeWindow' @ [145:55] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.FilteredLeaves[DeserializedPropertyDescriptor]

'commitInputStates' @ [146:17] ==> protected final fun commitInputStates(states: List<StateRef>, txId: SecureHash, callerIdentity: Party): Unit defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica[SimpleFunctionDescriptorImpl]

'inputs' @ [146:35] ==> val inputs: List<StateRef> defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[LocalVariableDescriptor]

'id' @ [146:43] ==> val id: SecureHash defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[LocalVariableDescriptor]

'callerIdentity' @ [146:47] ==> value-parameter callerIdentity: Party defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[ValueParameterDescriptorImpl]

'log' @ [148:17] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[PropertyDescriptorImpl]

'debug' @ [148:21] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'id' @ [148:70] ==> val id: SecureHash defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[LocalVariableDescriptor]

'SignableData' @ [149:36] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[DeserializedClassConstructorDescriptor]

'id' @ [149:49] ==> val id: SecureHash defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[LocalVariableDescriptor]

'SignatureMetadata' @ [149:53] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[DeserializedClassConstructorDescriptor]

'services' @ [149:71] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica[PropertyDescriptorImpl]

'myInfo' @ [149:80] ==> public abstract val myInfo: NodeInfo defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'platformVersion' @ [149:87] ==> public final val platformVersion: Int defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'findSignatureScheme' @ [149:111] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'services' @ [149:131] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica[PropertyDescriptorImpl]

'notaryIdentityKey' @ [149:140] ==> public open val notaryIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'schemeNumberID' @ [149:159] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'sign' @ [150:27] ==> protected final fun sign(signableData: SignableData): TransactionSignature defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica[SimpleFunctionDescriptorImpl]

'signableData' @ [150:32] ==> val signableData: SignableData defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[LocalVariableDescriptor]

'BFTSMaRt' @ [151:17] ==> public object BFTSMaRt defined in net.corda.node.services.transactions in file BFTSMaRt.kt[FakeCallableDescriptorForObject]

'Signature' @ [151:42] ==> public constructor Signature(txSignature: DigitalSignature) defined in net.corda.node.services.transactions.BFTSMaRt.ReplicaResponse.Signature[ClassConstructorDescriptorImpl]

'sig' @ [151:52] ==> val sig: TransactionSignature defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[LocalVariableDescriptor]

'log' @ [153:17] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Companion[PropertyDescriptorImpl]

'debug' @ [153:21] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'e' @ [153:62] ==> val e: NotaryException defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[LocalVariableDescriptor]

'error' @ [153:64] ==> public final val error: NotaryError defined in net.corda.core.flows.NotaryException[DeserializedPropertyDescriptor]

'BFTSMaRt' @ [154:17] ==> public object BFTSMaRt defined in net.corda.node.services.transactions in file BFTSMaRt.kt[FakeCallableDescriptorForObject]

'Error' @ [154:42] ==> public constructor Error(error: NotaryError) defined in net.corda.node.services.transactions.BFTSMaRt.ReplicaResponse.Error[ClassConstructorDescriptorImpl]

'e' @ [154:48] ==> val e: NotaryException defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica.verifyAndCommitTx[LocalVariableDescriptor]

'error' @ [154:50] ==> public final val error: NotaryError defined in net.corda.core.flows.NotaryException[DeserializedPropertyDescriptor]

'replicaHolder' @ [164:9] ==> private final val replicaHolder: (SettableFuture<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>..SettableFuture<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>?) defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'getOrThrow' @ [164:23] ==> public fun <V> Future<(BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?)>.getOrThrow(timeout: Duration? = ...): (BFTNonValidatingNotaryService.Replica..BFTNonValidatingNotaryService.Replica?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica..net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica?)

'dispose' @ [164:36] ==> public final fun dispose(): Unit defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService.Replica[SimpleFunctionDescriptorImpl]

'client' @ [165:9] ==> private final val client: BFTSMaRt.Client defined in net.corda.node.services.transactions.BFTNonValidatingNotaryService[PropertyDescriptorImpl]

'dispose' @ [165:16] ==> public final fun dispose(): Unit defined in net.corda.node.services.transactions.BFTSMaRt.Client[SimpleFunctionDescriptorImpl]

