'stateMachine' @ [21:20] ==> value-parameter stateMachine: StateMachineInfo defined in net.corda.client.jfx.model.ProgressTrackingEvent.Companion.createStreamFromStateMachineInfo[ValueParameterDescriptorImpl]

'progressTrackerStepAndUpdates' @ [21:33] ==> public final val progressTrackerStepAndUpdates: DataFeed<String, String>? defined in net.corda.core.messaging.StateMachineInfo[DeserializedPropertyDescriptor]

'let' @ [21:64] ==> @InlineOnly public inline fun <T, R> DataFeed<String, String>.let(block: (DataFeed<String, String>) -> (Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>?)): (Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataFeed<String, String>
    <R> -> (rx.Observable<(net.corda.client.jfx.model.ProgressTrackingEvent..net.corda.client.jfx.model.ProgressTrackingEvent?)>..rx.Observable<(net.corda.client.jfx.model.ProgressTrackingEvent..net.corda.client.jfx.model.ProgressTrackingEvent?)>?)

'component1' @ [21:71] ==> public final operator fun component1(): String defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [21:80] ==> public final operator fun component2(): Observable<String> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'future' @ [22:17] ==> val future: Observable<String> defined in net.corda.client.jfx.model.ProgressTrackingEvent.Companion.createStreamFromStateMachineInfo.<anonymous>[LocalVariableDescriptor]

'map' @ [22:24] ==> public final fun <R : (Any..Any?)> map(p0: (((String..String?)) -> (ProgressTrackingEvent..ProgressTrackingEvent?)..(((String..String?)) -> (ProgressTrackingEvent..ProgressTrackingEvent?))?)): (Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in rx.Observable[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.client.jfx.model.ProgressTrackingEvent..net.corda.client.jfx.model.ProgressTrackingEvent?)

'ProgressTrackingEvent' @ [22:30] ==> public constructor ProgressTrackingEvent(stateMachineId: StateMachineRunId, message: String) defined in net.corda.client.jfx.model.ProgressTrackingEvent[ClassConstructorDescriptorImpl]

'stateMachine' @ [22:52] ==> value-parameter stateMachine: StateMachineInfo defined in net.corda.client.jfx.model.ProgressTrackingEvent.Companion.createStreamFromStateMachineInfo[ValueParameterDescriptorImpl]

'id' @ [22:65] ==> public final val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineInfo[DeserializedPropertyDescriptor]

'it' @ [22:69] ==> value-parameter it: (String..String?) defined in net.corda.client.jfx.model.ProgressTrackingEvent.Companion.createStreamFromStateMachineInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startWith' @ [22:75] ==> public final fun startWith(p0: (ProgressTrackingEvent..ProgressTrackingEvent?)): (Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in rx.Observable[JavaMethodDescriptor]

'ProgressTrackingEvent' @ [22:85] ==> public constructor ProgressTrackingEvent(stateMachineId: StateMachineRunId, message: String) defined in net.corda.client.jfx.model.ProgressTrackingEvent[ClassConstructorDescriptorImpl]

'stateMachine' @ [22:107] ==> value-parameter stateMachine: StateMachineInfo defined in net.corda.client.jfx.model.ProgressTrackingEvent.Companion.createStreamFromStateMachineInfo[ValueParameterDescriptorImpl]

'id' @ [22:120] ==> public final val id: StateMachineRunId defined in net.corda.core.messaging.StateMachineInfo[DeserializedPropertyDescriptor]

'current' @ [22:124] ==> val current: String defined in net.corda.client.jfx.model.ProgressTrackingEvent.Companion.createStreamFromStateMachineInfo.<anonymous>[LocalVariableDescriptor]

'create' @ [33:61] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(StateMachineUpdate..StateMachineUpdate?)>..PublishSubject<(StateMachineUpdate..StateMachineUpdate?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StateMachineUpdate

'create' @ [34:54] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Update<ContractState>

'create' @ [35:54] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(SignedTransaction..SignedTransaction?)>..PublishSubject<(SignedTransaction..SignedTransaction?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction

'create' @ [36:72] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>..PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StateMachineTransactionMapping

'create' @ [37:58] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(ProgressTrackingEvent..ProgressTrackingEvent?)>..PublishSubject<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ProgressTrackingEvent

'create' @ [38:52] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MapChange

'stateMachineUpdatesSubject' @ [40:63] ==> private final val stateMachineUpdatesSubject: (PublishSubject<(StateMachineUpdate..StateMachineUpdate?)>..PublishSubject<(StateMachineUpdate..StateMachineUpdate?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'vaultUpdatesSubject' @ [41:65] ==> private final val vaultUpdatesSubject: (PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'transactionsSubject' @ [42:55] ==> private final val transactionsSubject: (PublishSubject<(SignedTransaction..SignedTransaction?)>..PublishSubject<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'stateMachineTransactionMappingSubject' @ [43:86] ==> private final val stateMachineTransactionMappingSubject: (PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>..PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'progressTrackingSubject' @ [44:63] ==> private final val progressTrackingSubject: (PublishSubject<(ProgressTrackingEvent..ProgressTrackingEvent?)>..PublishSubject<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'networkMapSubject' @ [45:45] ==> private final val networkMapSubject: (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'SimpleObjectProperty' @ [47:27] ==> public constructor SimpleObjectProperty<T : (Any..Any?)>() defined in javafx.beans.property.SimpleObjectProperty[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CordaRPCOps?

'CordaRPCClient' @ [54:22] ==> public constructor CordaRPCClient(hostAndPort: NetworkHostAndPort, sslConfiguration: SSLConfiguration? = ..., configuration: CordaRPCClientConfiguration = ..., initialiseSerialization: Boolean = ...) defined in net.corda.client.rpc.CordaRPCClient[DeserializedClassConstructorDescriptor]

'nodeHostAndPort' @ [55:31] ==> value-parameter nodeHostAndPort: NetworkHostAndPort defined in net.corda.client.jfx.model.NodeMonitorModel.register[ValueParameterDescriptorImpl]

'default' @ [56:61] ==> @JvmStatic public final val default: CordaRPCClientConfiguration defined in net.corda.client.rpc.CordaRPCClientConfiguration.Companion[DeserializedPropertyDescriptor]

'copy' @ [56:69] ==> public final fun copy(connectionMaxRetryInterval: Duration = ...): CordaRPCClientConfiguration defined in net.corda.client.rpc.CordaRPCClientConfiguration[DeserializedSimpleFunctionDescriptor]

'seconds' @ [57:57] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'initialiseSerialization' @ [59:43] ==> value-parameter initialiseSerialization: Boolean = ... defined in net.corda.client.jfx.model.NodeMonitorModel.register[ValueParameterDescriptorImpl]

'client' @ [61:26] ==> val client: CordaRPCClient defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'start' @ [61:33] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[DeserializedSimpleFunctionDescriptor]

'username' @ [61:39] ==> value-parameter username: String defined in net.corda.client.jfx.model.NodeMonitorModel.register[ValueParameterDescriptorImpl]

'password' @ [61:49] ==> value-parameter password: String defined in net.corda.client.jfx.model.NodeMonitorModel.register[ValueParameterDescriptorImpl]

'connection' @ [62:21] ==> val connection: CordaRPCConnection defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'proxy' @ [62:32] ==> public open val proxy: CordaRPCOps defined in net.corda.client.rpc.CordaRPCConnection[DeserializedPropertyDescriptor]

'component1' @ [64:14] ==> public final operator fun component1(): List<StateMachineInfo> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [64:29] ==> public final operator fun component2(): Observable<StateMachineUpdate> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'proxy' @ [64:52] ==> val proxy: CordaRPCOps defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'stateMachinesFeed' @ [64:58] ==> @RPCReturnsObservables public abstract fun stateMachinesFeed(): DataFeed<List<StateMachineInfo>, StateMachineUpdate> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'stateMachines' @ [67:45] ==> val stateMachines: List<StateMachineInfo> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'mapNotNull' @ [67:59] ==> public inline fun <T, R : Any> Iterable<StateMachineInfo>.mapNotNull(transform: (StateMachineInfo) -> Observable<ProgressTrackingEvent>?): List<Observable<ProgressTrackingEvent>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateMachineInfo
    <R : Any> -> Observable<ProgressTrackingEvent>

'ProgressTrackingEvent' @ [68:13] ==> public companion object defined in net.corda.client.jfx.model.ProgressTrackingEvent[FakeCallableDescriptorForObject]

'createStreamFromStateMachineInfo' @ [68:35] ==> public final fun createStreamFromStateMachineInfo(stateMachine: StateMachineInfo): Observable<ProgressTrackingEvent>? defined in net.corda.client.jfx.model.ProgressTrackingEvent.Companion[SimpleFunctionDescriptorImpl]

'stateMachine' @ [68:68] ==> value-parameter stateMachine: StateMachineInfo defined in net.corda.client.jfx.model.NodeMonitorModel.register.<anonymous>[ValueParameterDescriptorImpl]

'stateMachineUpdatesSubject' @ [70:44] ==> private final val stateMachineUpdatesSubject: (PublishSubject<(StateMachineUpdate..StateMachineUpdate?)>..PublishSubject<(StateMachineUpdate..StateMachineUpdate?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'map' @ [70:71] ==> public final fun <R : (Any..Any?)> map(p0: (((StateMachineUpdate..StateMachineUpdate?)) -> (Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)..(((StateMachineUpdate..StateMachineUpdate?)) -> (Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?))?)): (Observable<(Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)>..Observable<(Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)>?) defined in rx.subjects.PublishSubject[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (rx.Observable<net.corda.client.jfx.model.ProgressTrackingEvent>..rx.Observable<net.corda.client.jfx.model.ProgressTrackingEvent>?)

'if (stateMachineUpdate is StateMachineUpdate.Added) {
                ProgressTrackingEvent.createStreamFromStateMachineInfo(stateMachineUpdate.stateMachineInfo) ?: Observable.empty<ProgressTrackingEvent>()
            } else {
                Observable.empty<ProgressTrackingEvent>()
            }' @ [71:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?), elseBranch: (Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)): (Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (rx.Observable<net.corda.client.jfx.model.ProgressTrackingEvent>..rx.Observable<net.corda.client.jfx.model.ProgressTrackingEvent>?)

'stateMachineUpdate' @ [71:17] ==> value-parameter stateMachineUpdate: (StateMachineUpdate..StateMachineUpdate?) defined in net.corda.client.jfx.model.NodeMonitorModel.register.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [72:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Observable<ProgressTrackingEvent>?, right: (Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)): (Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (rx.Observable<net.corda.client.jfx.model.ProgressTrackingEvent>..rx.Observable<net.corda.client.jfx.model.ProgressTrackingEvent>?)

'createStreamFromStateMachineInfo' @ [72:39] ==> public final fun createStreamFromStateMachineInfo(stateMachine: StateMachineInfo): Observable<ProgressTrackingEvent>? defined in net.corda.client.jfx.model.ProgressTrackingEvent.Companion[SimpleFunctionDescriptorImpl]

'stateMachineUpdate' @ [72:72] ==> value-parameter stateMachineUpdate: (StateMachineUpdate..StateMachineUpdate?) defined in net.corda.client.jfx.model.NodeMonitorModel.register.<anonymous>[ValueParameterDescriptorImpl]

'stateMachineInfo' @ [72:91] ==> public final val stateMachineInfo: StateMachineInfo defined in net.corda.core.messaging.StateMachineUpdate.Added[DeserializedPropertyDescriptor]

'empty' @ [72:123] ==> public open fun <T : (Any..Any?)> empty(): (Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in rx.Observable[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ProgressTrackingEvent

'empty' @ [74:28] ==> public open fun <T : (Any..Any?)> empty(): (Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in rx.Observable[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ProgressTrackingEvent

'futureProgressTrackerUpdates' @ [79:9] ==> val futureProgressTrackerUpdates: (Observable<(Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)>..Observable<(Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'startWith' @ [79:38] ==> public final fun startWith(p0: (MutableIterable<(Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)>..Iterable<(Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)>?)): (Observable<(Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)>..Observable<(Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'currentProgressTrackerUpdates' @ [79:48] ==> val currentProgressTrackerUpdates: List<Observable<ProgressTrackingEvent>> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'flatMap' @ [79:79] ==> public final fun <R : (Any..Any?)> flatMap(p0: (((Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)) -> (Observable<out (ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<out (ProgressTrackingEvent..ProgressTrackingEvent?)>?)..(((Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?)) -> (Observable<out (ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<out (ProgressTrackingEvent..ProgressTrackingEvent?)>?))?)): (Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in rx.Observable[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.client.jfx.model.ProgressTrackingEvent..net.corda.client.jfx.model.ProgressTrackingEvent?)

'it' @ [79:89] ==> value-parameter it: (Observable<ProgressTrackingEvent>..Observable<ProgressTrackingEvent>?) defined in net.corda.client.jfx.model.NodeMonitorModel.register.<anonymous>[ValueParameterDescriptorImpl]

'retry' @ [79:94] ==> public final fun retry(): (Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>..Observable<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in rx.Observable[JavaMethodDescriptor]

'subscribe' @ [79:102] ==> public final fun subscribe(p0: (Observer<in (ProgressTrackingEvent..ProgressTrackingEvent?)>..Observer<in (ProgressTrackingEvent..ProgressTrackingEvent?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'progressTrackingSubject' @ [79:112] ==> private final val progressTrackingSubject: (PublishSubject<(ProgressTrackingEvent..ProgressTrackingEvent?)>..PublishSubject<(ProgressTrackingEvent..ProgressTrackingEvent?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'stateMachines' @ [82:36] ==> val stateMachines: List<StateMachineInfo> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'map' @ [82:50] ==> public inline fun <T, R> Iterable<StateMachineInfo>.map(transform: (StateMachineInfo) -> StateMachineUpdate.Added): List<StateMachineUpdate.Added> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateMachineInfo
    <R> -> Added

'Added' @ [82:75] ==> public constructor Added(stateMachineInfo: StateMachineInfo) defined in net.corda.core.messaging.StateMachineUpdate.Added[DeserializedClassConstructorDescriptor]

'it' @ [82:81] ==> value-parameter it: StateMachineInfo defined in net.corda.client.jfx.model.NodeMonitorModel.register.<anonymous>[ValueParameterDescriptorImpl]

'stateMachineUpdates' @ [83:9] ==> val stateMachineUpdates: Observable<StateMachineUpdate> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'startWith' @ [83:29] ==> public final fun startWith(p0: (MutableIterable<(StateMachineUpdate..StateMachineUpdate?)>..Iterable<(StateMachineUpdate..StateMachineUpdate?)>?)): (Observable<(StateMachineUpdate..StateMachineUpdate?)>..Observable<(StateMachineUpdate..StateMachineUpdate?)>?) defined in rx.Observable[JavaMethodDescriptor]

'currentStateMachines' @ [83:39] ==> val currentStateMachines: List<StateMachineUpdate.Added> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'subscribe' @ [83:61] ==> public final fun subscribe(p0: (Observer<in (StateMachineUpdate..StateMachineUpdate?)>..Observer<in (StateMachineUpdate..StateMachineUpdate?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'stateMachineUpdatesSubject' @ [83:71] ==> private final val stateMachineUpdatesSubject: (PublishSubject<(StateMachineUpdate..StateMachineUpdate?)>..PublishSubject<(StateMachineUpdate..StateMachineUpdate?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'component1' @ [86:14] ==> public final operator fun component1(): Vault.Page<ContractState> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [86:29] ==> public final operator fun component2(): Observable<Vault.Update<ContractState>> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'proxy' @ [86:45] ==> val proxy: CordaRPCOps defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'vaultTrackBy' @ [86:51] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultTrackBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): DataFeed<Vault.Page<ContractState>, Vault.Update<ContractState>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> ContractState

'VaultQueryCriteria' @ [86:93] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'ALL' @ [86:130] ==> enum entry ALL defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'PageSpecification' @ [87:79] ==> public constructor PageSpecification(pageNumber: Int = ..., pageSize: Int = ...) defined in net.corda.core.node.services.vault.PageSpecification[DeserializedClassConstructorDescriptor]

'DEFAULT_PAGE_NUM' @ [87:97] ==> public const val DEFAULT_PAGE_NUM: Int defined in net.corda.core.node.services.vault[DeserializedPropertyDescriptor]

'MAX_PAGE_SIZE' @ [87:115] ==> public const val MAX_PAGE_SIZE: Int defined in net.corda.core.node.services.vault[DeserializedPropertyDescriptor]

'Vault' @ [88:34] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [88:40] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'setOf' @ [88:47] ==> @InlineOnly public inline fun <T> setOf(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'vaultSnapshot' @ [88:56] ==> val vaultSnapshot: Vault.Page<ContractState> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'states' @ [88:70] ==> public final val states: List<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'toSet' @ [88:77] ==> public fun <T> Iterable<StateAndRef<ContractState>>.toSet(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'vaultUpdates' @ [89:9] ==> val vaultUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'startWith' @ [89:22] ==> public final fun startWith(p0: (Vault.Update<ContractState>..Vault.Update<ContractState>?)): (Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'initialVaultUpdate' @ [89:32] ==> val initialVaultUpdate: Vault.Update<ContractState> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'subscribe' @ [89:52] ==> public final fun subscribe(p0: (Observer<in (Vault.Update<ContractState>..Vault.Update<ContractState>?)>..Observer<in (Vault.Update<ContractState>..Vault.Update<ContractState>?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'vaultUpdatesSubject' @ [89:62] ==> private final val vaultUpdatesSubject: (PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'component1' @ [92:14] ==> public final operator fun component1(): List<SignedTransaction> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [92:28] ==> public final operator fun component2(): Observable<SignedTransaction> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'proxy' @ [92:47] ==> val proxy: CordaRPCOps defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'verifiedTransactionsFeed' @ [92:53] ==> @RPCReturnsObservables public abstract fun verifiedTransactionsFeed(): DataFeed<List<SignedTransaction>, SignedTransaction> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'newTransactions' @ [93:9] ==> val newTransactions: Observable<SignedTransaction> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'startWith' @ [93:25] ==> public final fun startWith(p0: (MutableIterable<(SignedTransaction..SignedTransaction?)>..Iterable<(SignedTransaction..SignedTransaction?)>?)): (Observable<(SignedTransaction..SignedTransaction?)>..Observable<(SignedTransaction..SignedTransaction?)>?) defined in rx.Observable[JavaMethodDescriptor]

'transactions' @ [93:35] ==> val transactions: List<SignedTransaction> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'subscribe' @ [93:49] ==> public final fun subscribe(p0: (Observer<in (SignedTransaction..SignedTransaction?)>..Observer<in (SignedTransaction..SignedTransaction?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'transactionsSubject' @ [93:59] ==> private final val transactionsSubject: (PublishSubject<(SignedTransaction..SignedTransaction?)>..PublishSubject<(SignedTransaction..SignedTransaction?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'component1' @ [96:14] ==> public final operator fun component1(): List<StateMachineTransactionMapping> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [96:28] ==> public final operator fun component2(): Observable<StateMachineTransactionMapping> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'proxy' @ [96:50] ==> val proxy: CordaRPCOps defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'stateMachineRecordedTransactionMappingFeed' @ [96:56] ==> @RPCReturnsObservables public abstract fun stateMachineRecordedTransactionMappingFeed(): DataFeed<List<StateMachineTransactionMapping>, StateMachineTransactionMapping> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'futureSmTxMappings' @ [97:9] ==> val futureSmTxMappings: Observable<StateMachineTransactionMapping> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'startWith' @ [97:28] ==> public final fun startWith(p0: (MutableIterable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>..Iterable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>?)): (Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>..Observable<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>?) defined in rx.Observable[JavaMethodDescriptor]

'smTxMappings' @ [97:38] ==> val smTxMappings: List<StateMachineTransactionMapping> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'subscribe' @ [97:52] ==> public final fun subscribe(p0: (Observer<in (StateMachineTransactionMapping..StateMachineTransactionMapping?)>..Observer<in (StateMachineTransactionMapping..StateMachineTransactionMapping?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'stateMachineTransactionMappingSubject' @ [97:62] ==> private final val stateMachineTransactionMappingSubject: (PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>..PublishSubject<(StateMachineTransactionMapping..StateMachineTransactionMapping?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'component1' @ [100:14] ==> public final operator fun component1(): List<NodeInfo> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [100:23] ==> public final operator fun component2(): Observable<NetworkMapCache.MapChange> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'proxy' @ [100:44] ==> val proxy: CordaRPCOps defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'networkMapFeed' @ [100:50] ==> @RPCReturnsObservables public abstract fun networkMapFeed(): DataFeed<List<NodeInfo>, NetworkMapCache.MapChange> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'futurePartyUpdate' @ [101:9] ==> val futurePartyUpdate: Observable<NetworkMapCache.MapChange> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'startWith' @ [101:27] ==> public final fun startWith(p0: (MutableIterable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..Iterable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?)): (Observable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..Observable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in rx.Observable[JavaMethodDescriptor]

'parties' @ [101:37] ==> val parties: List<NodeInfo> defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

'map' @ [101:45] ==> public inline fun <T, R> Iterable<NodeInfo>.map(transform: (NodeInfo) -> NetworkMapCache.MapChange.Added): List<NetworkMapCache.MapChange.Added> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo
    <R> -> Added

'Added' @ [101:61] ==> public constructor Added(node: NodeInfo) defined in net.corda.core.node.services.NetworkMapCache.MapChange.Added[DeserializedClassConstructorDescriptor]

'it' @ [101:67] ==> value-parameter it: NodeInfo defined in net.corda.client.jfx.model.NodeMonitorModel.register.<anonymous>[ValueParameterDescriptorImpl]

'subscribe' @ [101:74] ==> public final fun subscribe(p0: (Observer<in (NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..Observer<in (NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'networkMapSubject' @ [101:84] ==> private final val networkMapSubject: (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'proxyObservable' @ [103:9] ==> public final val proxyObservable: SimpleObjectProperty<CordaRPCOps?> defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'set' @ [103:25] ==> public open fun set(p0: CordaRPCOps?): Unit defined in javafx.beans.property.SimpleObjectProperty[JavaMethodDescriptor]

'proxy' @ [103:29] ==> val proxy: CordaRPCOps defined in net.corda.client.jfx.model.NodeMonitorModel.register[LocalVariableDescriptor]

