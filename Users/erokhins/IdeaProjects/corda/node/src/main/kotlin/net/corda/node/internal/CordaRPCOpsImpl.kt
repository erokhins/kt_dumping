'component1' @ [44:14] ==> public final operator fun component1(): List<NodeInfo> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [44:24] ==> public final operator fun component2(): Observable<NetworkMapCache.MapChange> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'networkMapFeed' @ [44:35] ==> public open fun networkMapFeed(): DataFeed<List<NodeInfo>, NetworkMapCache.MapChange> defined in net.corda.node.internal.CordaRPCOpsImpl[SimpleFunctionDescriptorImpl]

'updates' @ [45:9] ==> val updates: Observable<NetworkMapCache.MapChange> defined in net.corda.node.internal.CordaRPCOpsImpl.networkMapSnapshot[LocalVariableDescriptor]

'notUsed' @ [45:17] ==> public fun <T> Observable<NetworkMapCache.MapChange>.notUsed(): Unit defined in net.corda.client.rpc[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MapChange

'snapshot' @ [46:16] ==> val snapshot: List<NodeInfo> defined in net.corda.node.internal.CordaRPCOpsImpl.networkMapSnapshot[LocalVariableDescriptor]

'database' @ [50:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [50:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> DataFeed<List<NodeInfo>, NetworkMapCache.MapChange>): DataFeed<List<NodeInfo>, NetworkMapCache.MapChange> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> DataFeed<List<NodeInfo>, MapChange>

'services' @ [51:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'networkMapCache' @ [51:22] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'track' @ [51:38] ==> public abstract fun track(): DataFeed<List<NodeInfo>, NetworkMapCache.MapChange> defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'database' @ [59:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [59:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Vault.Page<T>): Vault.Page<T> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Page<T>

'services' @ [60:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'vaultQueryService' @ [60:22] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'_queryBy' @ [60:40] ==> public abstract fun <T : ContractState> _queryBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [60:49] ==> value-parameter criteria: QueryCriteria defined in net.corda.node.internal.CordaRPCOpsImpl.vaultQueryBy[ValueParameterDescriptorImpl]

'paging' @ [60:59] ==> value-parameter paging: PageSpecification defined in net.corda.node.internal.CordaRPCOpsImpl.vaultQueryBy[ValueParameterDescriptorImpl]

'sorting' @ [60:67] ==> value-parameter sorting: Sort defined in net.corda.node.internal.CordaRPCOpsImpl.vaultQueryBy[ValueParameterDescriptorImpl]

'contractType' @ [60:76] ==> value-parameter contractType: Class<out T> defined in net.corda.node.internal.CordaRPCOpsImpl.vaultQueryBy[ValueParameterDescriptorImpl]

'RPCReturnsObservables' @ [64:5] ==> public constructor RPCReturnsObservables() defined in net.corda.core.messaging.RPCReturnsObservables[DeserializedClassConstructorDescriptor]

'database' @ [69:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [69:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> DataFeed<Vault.Page<T>, Vault.Update<T>>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> DataFeed<Page<T>, Update<T>>

'services' @ [70:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'vaultQueryService' @ [70:22] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'_trackBy' @ [70:40] ==> public abstract fun <T : ContractState> _trackBy(criteria: QueryCriteria, paging: PageSpecification, sorting: Sort, contractType: Class<out T>): DataFeed<Vault.Page<T>, Vault.Update<T>> defined in net.corda.core.node.services.VaultQueryService[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> T

'criteria' @ [70:49] ==> value-parameter criteria: QueryCriteria defined in net.corda.node.internal.CordaRPCOpsImpl.vaultTrackBy[ValueParameterDescriptorImpl]

'paging' @ [70:59] ==> value-parameter paging: PageSpecification defined in net.corda.node.internal.CordaRPCOpsImpl.vaultTrackBy[ValueParameterDescriptorImpl]

'sorting' @ [70:67] ==> value-parameter sorting: Sort defined in net.corda.node.internal.CordaRPCOpsImpl.vaultTrackBy[ValueParameterDescriptorImpl]

'contractType' @ [70:76] ==> value-parameter contractType: Class<out T> defined in net.corda.node.internal.CordaRPCOpsImpl.vaultTrackBy[ValueParameterDescriptorImpl]

'component1' @ [75:14] ==> public final operator fun component1(): List<SignedTransaction> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [75:24] ==> public final operator fun component2(): Observable<SignedTransaction> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'verifiedTransactionsFeed' @ [75:35] ==> public open fun verifiedTransactionsFeed(): DataFeed<List<SignedTransaction>, SignedTransaction> defined in net.corda.node.internal.CordaRPCOpsImpl[SimpleFunctionDescriptorImpl]

'updates' @ [76:9] ==> val updates: Observable<SignedTransaction> defined in net.corda.node.internal.CordaRPCOpsImpl.verifiedTransactionsSnapshot[LocalVariableDescriptor]

'notUsed' @ [76:17] ==> public fun <T> Observable<SignedTransaction>.notUsed(): Unit defined in net.corda.client.rpc[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'snapshot' @ [77:16] ==> val snapshot: List<SignedTransaction> defined in net.corda.node.internal.CordaRPCOpsImpl.verifiedTransactionsSnapshot[LocalVariableDescriptor]

'database' @ [81:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [81:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> DataFeed<List<SignedTransaction>, SignedTransaction>): DataFeed<List<SignedTransaction>, SignedTransaction> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> DataFeed<List<SignedTransaction>, SignedTransaction>

'services' @ [82:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'validatedTransactions' @ [82:22] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'track' @ [82:44] ==> public abstract fun track(): DataFeed<List<SignedTransaction>, SignedTransaction> defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'component1' @ [87:14] ==> public final operator fun component1(): List<StateMachineInfo> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [87:24] ==> public final operator fun component2(): Observable<StateMachineUpdate> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'stateMachinesFeed' @ [87:35] ==> public open fun stateMachinesFeed(): DataFeed<List<StateMachineInfo>, StateMachineUpdate> defined in net.corda.node.internal.CordaRPCOpsImpl[SimpleFunctionDescriptorImpl]

'updates' @ [88:9] ==> val updates: Observable<StateMachineUpdate> defined in net.corda.node.internal.CordaRPCOpsImpl.stateMachinesSnapshot[LocalVariableDescriptor]

'notUsed' @ [88:17] ==> public fun <T> Observable<StateMachineUpdate>.notUsed(): Unit defined in net.corda.client.rpc[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateMachineUpdate

'snapshot' @ [89:16] ==> val snapshot: List<StateMachineInfo> defined in net.corda.node.internal.CordaRPCOpsImpl.stateMachinesSnapshot[LocalVariableDescriptor]

'database' @ [93:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [93:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> DataFeed<List<StateMachineInfo>, (StateMachineUpdate..StateMachineUpdate?)>): DataFeed<List<StateMachineInfo>, (StateMachineUpdate..StateMachineUpdate?)> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> DataFeed<List<StateMachineInfo>, (net.corda.core.messaging.StateMachineUpdate..net.corda.core.messaging.StateMachineUpdate?)>

'component1' @ [94:18] ==> public final operator fun component1(): List<FlowStateMachineImpl<*>> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [94:36] ==> public final operator fun component2(): Observable<StateMachineManager.Change> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'smm' @ [94:47] ==> private final val smm: StateMachineManager defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'track' @ [94:51] ==> public final fun track(): DataFeed<List<FlowStateMachineImpl<*>>, StateMachineManager.Change> defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'DataFeed' @ [95:13] ==> public constructor DataFeed<out A, B>(snapshot: List<StateMachineInfo>, updates: Observable<(StateMachineUpdate..StateMachineUpdate?)>) defined in net.corda.core.messaging.DataFeed[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<StateMachineInfo>
    <B> -> (net.corda.core.messaging.StateMachineUpdate..net.corda.core.messaging.StateMachineUpdate?)

'allStateMachines' @ [96:21] ==> val allStateMachines: List<FlowStateMachineImpl<*>> defined in net.corda.node.internal.CordaRPCOpsImpl.stateMachinesFeed.<anonymous>[LocalVariableDescriptor]

'map' @ [96:38] ==> public inline fun <T, R> Iterable<FlowStateMachineImpl<*>>.map(transform: (FlowStateMachineImpl<*>) -> StateMachineInfo): List<StateMachineInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowStateMachineImpl<*>
    <R> -> StateMachineInfo

'stateMachineInfoFromFlowLogic' @ [96:44] ==> private final fun stateMachineInfoFromFlowLogic(flowLogic: FlowLogic<*>): StateMachineInfo defined in net.corda.node.internal.CordaRPCOpsImpl.Companion[SimpleFunctionDescriptorImpl]

'it' @ [96:74] ==> value-parameter it: FlowStateMachineImpl<*> defined in net.corda.node.internal.CordaRPCOpsImpl.stateMachinesFeed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'logic' @ [96:77] ==> public final val logic: FlowLogic<Any?> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'changes' @ [97:21] ==> val changes: Observable<StateMachineManager.Change> defined in net.corda.node.internal.CordaRPCOpsImpl.stateMachinesFeed.<anonymous>[LocalVariableDescriptor]

'map' @ [97:29] ==> public final fun <R : (Any..Any?)> map(p0: (((StateMachineManager.Change..StateMachineManager.Change?)) -> (StateMachineUpdate..StateMachineUpdate?)..(((StateMachineManager.Change..StateMachineManager.Change?)) -> (StateMachineUpdate..StateMachineUpdate?))?)): (Observable<(StateMachineUpdate..StateMachineUpdate?)>..Observable<(StateMachineUpdate..StateMachineUpdate?)>?) defined in rx.Observable[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.core.messaging.StateMachineUpdate..net.corda.core.messaging.StateMachineUpdate?)

'stateMachineUpdateFromStateMachineChange' @ [97:35] ==> private final fun stateMachineUpdateFromStateMachineChange(change: StateMachineManager.Change): StateMachineUpdate defined in net.corda.node.internal.CordaRPCOpsImpl.Companion[SimpleFunctionDescriptorImpl]

'it' @ [97:76] ==> value-parameter it: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.internal.CordaRPCOpsImpl.stateMachinesFeed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [103:14] ==> public final operator fun component1(): List<StateMachineTransactionMapping> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'component2' @ [103:24] ==> public final operator fun component2(): Observable<StateMachineTransactionMapping> defined in net.corda.core.messaging.DataFeed[DeserializedSimpleFunctionDescriptor]

'stateMachineRecordedTransactionMappingFeed' @ [103:35] ==> public open fun stateMachineRecordedTransactionMappingFeed(): DataFeed<List<StateMachineTransactionMapping>, StateMachineTransactionMapping> defined in net.corda.node.internal.CordaRPCOpsImpl[SimpleFunctionDescriptorImpl]

'updates' @ [104:9] ==> val updates: Observable<StateMachineTransactionMapping> defined in net.corda.node.internal.CordaRPCOpsImpl.stateMachineRecordedTransactionMappingSnapshot[LocalVariableDescriptor]

'notUsed' @ [104:17] ==> public fun <T> Observable<StateMachineTransactionMapping>.notUsed(): Unit defined in net.corda.client.rpc[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateMachineTransactionMapping

'snapshot' @ [105:16] ==> val snapshot: List<StateMachineTransactionMapping> defined in net.corda.node.internal.CordaRPCOpsImpl.stateMachineRecordedTransactionMappingSnapshot[LocalVariableDescriptor]

'database' @ [109:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [109:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> DataFeed<List<StateMachineTransactionMapping>, StateMachineTransactionMapping>): DataFeed<List<StateMachineTransactionMapping>, StateMachineTransactionMapping> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> DataFeed<List<StateMachineTransactionMapping>, StateMachineTransactionMapping>

'services' @ [110:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'stateMachineRecordedTransactionMapping' @ [110:22] ==> public abstract val stateMachineRecordedTransactionMapping: StateMachineRecordedTransactionMappingStorage defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'track' @ [110:61] ==> public abstract fun track(): DataFeed<List<StateMachineTransactionMapping>, StateMachineTransactionMapping> defined in net.corda.node.services.api.StateMachineRecordedTransactionMappingStorage[SimpleFunctionDescriptorImpl]

'services' @ [115:16] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'myInfo' @ [115:25] ==> public abstract val myInfo: NodeInfo defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'database' @ [119:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [119:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'services' @ [120:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'vaultService' @ [120:22] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'addNoteToTransaction' @ [120:35] ==> public abstract fun addNoteToTransaction(txnId: SecureHash, noteText: String): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'txnId' @ [120:56] ==> value-parameter txnId: SecureHash defined in net.corda.node.internal.CordaRPCOpsImpl.addVaultTransactionNote[ValueParameterDescriptorImpl]

'txnNote' @ [120:63] ==> value-parameter txnNote: String defined in net.corda.node.internal.CordaRPCOpsImpl.addVaultTransactionNote[ValueParameterDescriptorImpl]

'database' @ [125:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [125:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Iterable<String>): Iterable<String> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Iterable<String>

'services' @ [126:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'vaultService' @ [126:22] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'getTransactionNotes' @ [126:35] ==> public abstract fun getTransactionNotes(txnId: SecureHash): Iterable<String> defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'txnId' @ [126:55] ==> value-parameter txnId: SecureHash defined in net.corda.node.internal.CordaRPCOpsImpl.getVaultTransactionNotes[ValueParameterDescriptorImpl]

'startFlow' @ [131:28] ==> private final fun <T : Any> startFlow(logicType: Class<out FlowLogic<T>>, args: Array<out Any?>): FlowStateMachineImpl<T> defined in net.corda.node.internal.CordaRPCOpsImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'logicType' @ [131:38] ==> value-parameter logicType: Class<out FlowLogic<T>> defined in net.corda.node.internal.CordaRPCOpsImpl.startTrackedFlowDynamic[ValueParameterDescriptorImpl]

'args' @ [131:49] ==> value-parameter vararg args: Any? defined in net.corda.node.internal.CordaRPCOpsImpl.startTrackedFlowDynamic[ValueParameterDescriptorImpl]

'FlowProgressHandleImpl' @ [132:16] ==> public constructor FlowProgressHandleImpl<A>(id: StateMachineRunId, returnValue: CordaFuture<T>, progress: Observable<String>) defined in net.corda.core.messaging.FlowProgressHandleImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <A> -> T

'stateMachine' @ [133:22] ==> val stateMachine: FlowStateMachineImpl<T> defined in net.corda.node.internal.CordaRPCOpsImpl.startTrackedFlowDynamic[LocalVariableDescriptor]

'id' @ [133:35] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'stateMachine' @ [134:31] ==> val stateMachine: FlowStateMachineImpl<T> defined in net.corda.node.internal.CordaRPCOpsImpl.startTrackedFlowDynamic[LocalVariableDescriptor]

'resultFuture' @ [134:44] ==> public open val resultFuture: CordaFuture<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'stateMachine' @ [135:28] ==> val stateMachine: FlowStateMachineImpl<T> defined in net.corda.node.internal.CordaRPCOpsImpl.startTrackedFlowDynamic[LocalVariableDescriptor]

'logic' @ [135:41] ==> public final val logic: FlowLogic<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'track' @ [135:47] ==> public final fun track(): DataFeed<String, String>? defined in net.corda.core.flows.FlowLogic[DeserializedSimpleFunctionDescriptor]

'updates' @ [135:56] ==> public final val updates: Observable<String> defined in net.corda.core.messaging.DataFeed[DeserializedPropertyDescriptor]

'empty' @ [135:78] ==> public open fun <T : (Any..Any?)> empty(): (Observable<(String..String?)>..Observable<(String..String?)>?) defined in rx.Observable[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'startFlow' @ [140:28] ==> private final fun <T : Any> startFlow(logicType: Class<out FlowLogic<T>>, args: Array<out Any?>): FlowStateMachineImpl<T> defined in net.corda.node.internal.CordaRPCOpsImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'logicType' @ [140:38] ==> value-parameter logicType: Class<out FlowLogic<T>> defined in net.corda.node.internal.CordaRPCOpsImpl.startFlowDynamic[ValueParameterDescriptorImpl]

'args' @ [140:49] ==> value-parameter vararg args: Any? defined in net.corda.node.internal.CordaRPCOpsImpl.startFlowDynamic[ValueParameterDescriptorImpl]

'FlowHandleImpl' @ [141:16] ==> public constructor FlowHandleImpl<A>(id: StateMachineRunId, returnValue: CordaFuture<T>) defined in net.corda.core.messaging.FlowHandleImpl[DeserializedClassConstructorDescriptor]
Inferred types:
    <A> -> T

'stateMachine' @ [141:36] ==> val stateMachine: FlowStateMachineImpl<T> defined in net.corda.node.internal.CordaRPCOpsImpl.startFlowDynamic[LocalVariableDescriptor]

'id' @ [141:49] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'stateMachine' @ [141:67] ==> val stateMachine: FlowStateMachineImpl<T> defined in net.corda.node.internal.CordaRPCOpsImpl.startFlowDynamic[LocalVariableDescriptor]

'resultFuture' @ [141:80] ==> public open val resultFuture: CordaFuture<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'require' @ [145:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'logicType' @ [145:17] ==> value-parameter logicType: Class<out FlowLogic<T>> defined in net.corda.node.internal.CordaRPCOpsImpl.startFlow[ValueParameterDescriptorImpl]

'isAnnotationPresent' @ [145:27] ==> public open fun isAnnotationPresent(p0: (Class<out (Annotation..Annotation?)>..Class<out (Annotation..Annotation?)>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'StartableByRPC' @ [145:47] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'java' @ [145:69] ==> public val <T> KClass<StartableByRPC>.java: Class<StartableByRPC> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> StartableByRPC

'logicType' @ [145:81] ==> value-parameter logicType: Class<out FlowLogic<T>> defined in net.corda.node.internal.CordaRPCOpsImpl.startFlow[ValueParameterDescriptorImpl]

'name' @ [145:91] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<T>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<T>)

'getRpcContext' @ [146:26] ==> public fun getRpcContext(): RpcContext defined in net.corda.node.services.messaging in file RPCServer.kt[SimpleFunctionDescriptorImpl]

'rpcContext' @ [147:9] ==> val rpcContext: RpcContext defined in net.corda.node.internal.CordaRPCOpsImpl.startFlow[LocalVariableDescriptor]

'requirePermission' @ [147:20] ==> public fun RpcContext.requirePermission(permission: String): Unit defined in net.corda.node.services.messaging in file RPCServerStructures.kt[SimpleFunctionDescriptorImpl]

'startFlowPermission' @ [147:38] ==> public fun <P : FlowLogic<*>> startFlowPermission(clazz: Class<out FlowLogic<T>>): String defined in net.corda.node.services[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : FlowLogic<*>> -> Captured(out FlowLogic<T>)

'logicType' @ [147:58] ==> value-parameter logicType: Class<out FlowLogic<T>> defined in net.corda.node.internal.CordaRPCOpsImpl.startFlow[ValueParameterDescriptorImpl]

'RPC' @ [148:41] ==> public constructor RPC(username: String) defined in net.corda.core.flows.FlowInitiator.RPC[DeserializedClassConstructorDescriptor]

'rpcContext' @ [148:45] ==> val rpcContext: RpcContext defined in net.corda.node.internal.CordaRPCOpsImpl.startFlow[LocalVariableDescriptor]

'currentUser' @ [148:56] ==> public final val currentUser: User defined in net.corda.node.services.messaging.RpcContext[PropertyDescriptorImpl]

'username' @ [148:68] ==> @OldConfig public final val username: String defined in net.corda.nodeapi.User[DeserializedPropertyDescriptor]

'services' @ [149:16] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'invokeFlowAsync' @ [149:25] ==> public open fun <T : Any> invokeFlowAsync(logicType: Class<out FlowLogic<T>>, flowInitiator: FlowInitiator, vararg args: Any?): FlowStateMachineImpl<T> defined in net.corda.node.services.api.ServiceHubInternal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'logicType' @ [149:41] ==> value-parameter logicType: Class<out FlowLogic<T>> defined in net.corda.node.internal.CordaRPCOpsImpl.startFlow[ValueParameterDescriptorImpl]

'currentUser' @ [149:52] ==> val currentUser: FlowInitiator.RPC defined in net.corda.node.internal.CordaRPCOpsImpl.startFlow[LocalVariableDescriptor]

'args' @ [149:66] ==> value-parameter args: Array<out Any?> defined in net.corda.node.internal.CordaRPCOpsImpl.startFlow[ValueParameterDescriptorImpl]

'database' @ [154:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [154:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'services' @ [155:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'attachments' @ [155:22] ==> public abstract val attachments: AttachmentStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'openAttachment' @ [155:34] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[DeserializedSimpleFunctionDescriptor]

'id' @ [155:49] ==> value-parameter id: SecureHash defined in net.corda.node.internal.CordaRPCOpsImpl.attachmentExists[ValueParameterDescriptorImpl]

'database' @ [161:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [161:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> InputStream): InputStream defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> InputStream

'services' @ [162:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'attachments' @ [162:22] ==> public abstract val attachments: AttachmentStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'openAttachment' @ [162:34] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[DeserializedSimpleFunctionDescriptor]

'id' @ [162:49] ==> value-parameter id: SecureHash defined in net.corda.node.internal.CordaRPCOpsImpl.openAttachment[ValueParameterDescriptorImpl]

'open' @ [162:55] ==> public abstract fun open(): InputStream defined in net.corda.core.contracts.Attachment[DeserializedSimpleFunctionDescriptor]

'database' @ [168:16] ==> private final val database: CordaPersistence defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'transaction' @ [168:25] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SecureHash): SecureHash defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SecureHash

'services' @ [169:13] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'attachments' @ [169:22] ==> public abstract val attachments: AttachmentStorage defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'importAttachment' @ [169:34] ==> public abstract fun importAttachment(jar: InputStream): SecureHash defined in net.corda.core.node.services.AttachmentStorage[DeserializedSimpleFunctionDescriptor]

'jar' @ [169:51] ==> value-parameter jar: InputStream defined in net.corda.node.internal.CordaRPCOpsImpl.uploadAttachment[ValueParameterDescriptorImpl]

'services' @ [173:126] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'vaultService' @ [173:135] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'authoriseContractUpgrade' @ [173:148] ==> public abstract fun authoriseContractUpgrade(stateAndRef: StateAndRef<*>, upgradedContractClass: Class<out UpgradedContract<*, *>>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'state' @ [173:173] ==> value-parameter state: StateAndRef<*> defined in net.corda.node.internal.CordaRPCOpsImpl.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'upgradedContractClass' @ [173:180] ==> value-parameter upgradedContractClass: Class<out UpgradedContract<*, *>> defined in net.corda.node.internal.CordaRPCOpsImpl.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'services' @ [174:70] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'vaultService' @ [174:79] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'deauthoriseContractUpgrade' @ [174:92] ==> public abstract fun deauthoriseContractUpgrade(stateAndRef: StateAndRef<*>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'state' @ [174:119] ==> value-parameter state: StateAndRef<*> defined in net.corda.node.internal.CordaRPCOpsImpl.deauthoriseContractUpgrade[ValueParameterDescriptorImpl]

'now' @ [175:55] ==> public open fun now(p0: (Clock..Clock?)): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'services' @ [175:59] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'clock' @ [175:68] ==> public abstract val clock: Clock defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'services' @ [176:56] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'networkMapCache' @ [176:65] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'mapServiceRegistered' @ [176:81] ==> public abstract val mapServiceRegistered: CordaFuture<Void?> defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedPropertyDescriptor]

'services' @ [177:69] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'identityService' @ [177:78] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [177:94] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'party' @ [177:113] ==> value-parameter party: AbstractParty defined in net.corda.node.internal.CordaRPCOpsImpl.partyFromAnonymous[ValueParameterDescriptorImpl]

'services' @ [178:49] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'identityService' @ [178:58] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'partyFromKey' @ [178:74] ==> public abstract fun partyFromKey(key: PublicKey): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'key' @ [178:87] ==> value-parameter key: PublicKey defined in net.corda.node.internal.CordaRPCOpsImpl.partyFromKey[ValueParameterDescriptorImpl]

'services' @ [179:58] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'identityService' @ [179:67] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'partyFromX500Name' @ [179:83] ==> public abstract fun partyFromX500Name(principal: X500Name): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'x500Name' @ [179:101] ==> value-parameter x500Name: X500Name defined in net.corda.node.internal.CordaRPCOpsImpl.partyFromX500Name[ValueParameterDescriptorImpl]

'services' @ [180:84] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'identityService' @ [180:93] ==> public abstract val identityService: IdentityService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'partiesFromName' @ [180:109] ==> public abstract fun partiesFromName(query: String, exactMatch: Boolean): Set<Party> defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'query' @ [180:125] ==> value-parameter query: String defined in net.corda.node.internal.CordaRPCOpsImpl.partiesFromName[ValueParameterDescriptorImpl]

'exactMatch' @ [180:132] ==> value-parameter exactMatch: Boolean defined in net.corda.node.internal.CordaRPCOpsImpl.partiesFromName[ValueParameterDescriptorImpl]

'services' @ [181:75] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'networkMapCache' @ [181:84] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'getNodeByLegalIdentity' @ [181:100] ==> public abstract fun getNodeByLegalIdentity(party: AbstractParty): NodeInfo? defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'party' @ [181:123] ==> value-parameter party: AbstractParty defined in net.corda.node.internal.CordaRPCOpsImpl.nodeIdentityFromParty[ValueParameterDescriptorImpl]

'services' @ [183:52] ==> private final val services: ServiceHubInternal defined in net.corda.node.internal.CordaRPCOpsImpl[PropertyDescriptorImpl]

'rpcFlows' @ [183:61] ==> public abstract val rpcFlows: List<Class<out FlowLogic<*>>> defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'map' @ [183:70] ==> public inline fun <T, R> Iterable<Class<out FlowLogic<*>>>.map(transform: (Class<out FlowLogic<*>>) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out FlowLogic<*>>
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [183:76] ==> value-parameter it: Class<out FlowLogic<*>> defined in net.corda.node.internal.CordaRPCOpsImpl.registeredFlows.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [183:79] ==> public final val <T : (Any..Any?)> Class<out FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out FlowLogic<*>)

'sorted' @ [183:86] ==> public fun <T : Comparable<(String..String?)>> Iterable<(String..String?)>.sorted(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> (kotlin.String..kotlin.String?)

'StateMachineInfo' @ [187:20] ==> public constructor StateMachineInfo(id: StateMachineRunId, flowLogicClassName: String, initiator: FlowInitiator, progressTrackerStepAndUpdates: DataFeed<String, String>?) defined in net.corda.core.messaging.StateMachineInfo[DeserializedClassConstructorDescriptor]

'flowLogic' @ [187:37] ==> value-parameter flowLogic: FlowLogic<*> defined in net.corda.node.internal.CordaRPCOpsImpl.Companion.stateMachineInfoFromFlowLogic[ValueParameterDescriptorImpl]

'runId' @ [187:47] ==> public final val runId: StateMachineRunId defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'flowLogic' @ [187:54] ==> value-parameter flowLogic: FlowLogic<*> defined in net.corda.node.internal.CordaRPCOpsImpl.Companion.stateMachineInfoFromFlowLogic[ValueParameterDescriptorImpl]

'javaClass' @ [187:64] ==> public val <T : Any> FlowLogic<*>.javaClass: Class<FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowLogic<*>

'name' @ [187:74] ==> public final val <T : (Any..Any?)> Class<FlowLogic<*>>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FlowLogic<*>

'flowLogic' @ [187:80] ==> value-parameter flowLogic: FlowLogic<*> defined in net.corda.node.internal.CordaRPCOpsImpl.Companion.stateMachineInfoFromFlowLogic[ValueParameterDescriptorImpl]

'stateMachine' @ [187:90] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'flowInitiator' @ [187:103] ==> public abstract val flowInitiator: FlowInitiator defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'flowLogic' @ [187:118] ==> value-parameter flowLogic: FlowLogic<*> defined in net.corda.node.internal.CordaRPCOpsImpl.Companion.stateMachineInfoFromFlowLogic[ValueParameterDescriptorImpl]

'track' @ [187:128] ==> public final fun track(): DataFeed<String, String>? defined in net.corda.core.flows.FlowLogic[DeserializedSimpleFunctionDescriptor]

'when (change) {
                is StateMachineManager.Change.Add -> StateMachineUpdate.Added(stateMachineInfoFromFlowLogic(change.logic))
                is StateMachineManager.Change.Removed -> StateMachineUpdate.Removed(change.logic.runId, change.result)
            }' @ [191:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: StateMachineUpdate, entry1: StateMachineUpdate): StateMachineUpdate[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> StateMachineUpdate

'change' @ [191:26] ==> value-parameter change: StateMachineManager.Change defined in net.corda.node.internal.CordaRPCOpsImpl.Companion.stateMachineUpdateFromStateMachineChange[ValueParameterDescriptorImpl]

'Added' @ [192:73] ==> public constructor Added(stateMachineInfo: StateMachineInfo) defined in net.corda.core.messaging.StateMachineUpdate.Added[DeserializedClassConstructorDescriptor]

'stateMachineInfoFromFlowLogic' @ [192:79] ==> private final fun stateMachineInfoFromFlowLogic(flowLogic: FlowLogic<*>): StateMachineInfo defined in net.corda.node.internal.CordaRPCOpsImpl.Companion[SimpleFunctionDescriptorImpl]

'change' @ [192:109] ==> value-parameter change: StateMachineManager.Change defined in net.corda.node.internal.CordaRPCOpsImpl.Companion.stateMachineUpdateFromStateMachineChange[ValueParameterDescriptorImpl]

'logic' @ [192:116] ==> public abstract val logic: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.Change[PropertyDescriptorImpl]

'Removed' @ [193:77] ==> public constructor Removed(id: StateMachineRunId, result: Try<*>) defined in net.corda.core.messaging.StateMachineUpdate.Removed[DeserializedClassConstructorDescriptor]

'change' @ [193:85] ==> value-parameter change: StateMachineManager.Change defined in net.corda.node.internal.CordaRPCOpsImpl.Companion.stateMachineUpdateFromStateMachineChange[ValueParameterDescriptorImpl]

'logic' @ [193:92] ==> public abstract val logic: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.Change[PropertyDescriptorImpl]

'runId' @ [193:98] ==> public final val runId: StateMachineRunId defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'change' @ [193:105] ==> value-parameter change: StateMachineManager.Change defined in net.corda.node.internal.CordaRPCOpsImpl.Companion.stateMachineUpdateFromStateMachineChange[ValueParameterDescriptorImpl]

'result' @ [193:112] ==> public final val result: Try<*> defined in net.corda.node.services.statemachine.StateMachineManager.Change.Removed[PropertyDescriptorImpl]

