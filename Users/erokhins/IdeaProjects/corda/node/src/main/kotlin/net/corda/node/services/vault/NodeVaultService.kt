'SingletonSerializeAsToken' @ [50:60] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'loggerFor' @ [53:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeVaultService

'!!' @ [57:33] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?): PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PublishSubject<(net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)>

'create' @ [57:48] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Update<ContractState>

'!!' @ [58:36] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?): PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PublishSubject<(net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)>

'create' @ [58:51] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Update<ContractState>

'_updatesPublisher' @ [59:30] ==> public final val _updatesPublisher: PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'wrapWithDatabaseTransaction' @ [59:48] ==> public fun <T : Any> Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>.wrapWithDatabaseTransaction(db: CordaPersistence? = ...): Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)

'asObservable' @ [59:78] ==> public final fun asObservable(): (Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'_updatesPublisher' @ [62:80] ==> public final val _updatesPublisher: PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'bufferUntilDatabaseCommit' @ [62:98] ==> public fun <T : Any> Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>.bufferUntilDatabaseCommit(): Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)

'tee' @ [62:126] ==> public fun <T> Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>.tee(vararg teeTo: Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>): Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)

'_rawUpdatesPublisher' @ [62:130] ==> public final val _rawUpdatesPublisher: PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'ThreadBox' @ [65:25] ==> public constructor ThreadBox<out T>(content: NodeVaultService.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [65:35] ==> public constructor InnerState() defined in net.corda.node.services.vault.NodeVaultService.InnerState[ClassConstructorDescriptorImpl]

'!' @ [68:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'update' @ [68:14] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'isEmpty' @ [68:21] ==> public final fun isEmpty(): Boolean defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'update' @ [69:37] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'produced' @ [69:44] ==> public final val produced: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'map' @ [69:53] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> StateRef

'it' @ [69:59] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [69:62] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'update' @ [70:40] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'produced' @ [70:47] ==> public final val produced: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'associateBy' @ [70:56] ==> public inline fun <T, K> Iterable<StateAndRef<ContractState>>.associateBy(keySelector: (StateAndRef<ContractState>) -> StateRef): Map<StateRef, StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <K> -> StateRef

'it' @ [70:70] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [70:73] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'update' @ [71:37] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'consumed' @ [71:44] ==> public final val consumed: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'map' @ [71:53] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> StateRef

'it' @ [71:59] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [71:62] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'log' @ [72:13] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [72:17] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'consumedStateRefs' @ [72:36] ==> val consumedStateRefs: List<StateRef> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'producedStateRefs' @ [72:91] ==> val producedStateRefs: List<StateRef> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [74:27] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [74:54] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [74:64] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'producedStateRefsMap' @ [75:13] ==> val producedStateRefsMap: Map<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'forEach' @ [75:34] ==> @HidesMembers public inline fun <K, V> Map<out StateRef, StateAndRef<ContractState>>.forEach(action: (Map.Entry<StateRef, StateAndRef<ContractState>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> StateRef
    <V> -> StateAndRef<ContractState>

'VaultSchemaV1' @ [76:29] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [76:43] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateAndRef' @ [77:34] ==> value-parameter stateAndRef: Map.Entry<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [77:46] ==> public abstract val value: StateAndRef<ContractState> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'state' @ [77:52] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [77:58] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'stateAndRef' @ [78:50] ==> value-parameter stateAndRef: Map.Entry<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [78:62] ==> public abstract val value: StateAndRef<ContractState> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'state' @ [78:68] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [78:74] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'javaClass' @ [78:79] ==> public val <T : Any> ContractState.javaClass: Class<ContractState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> ContractState

'name' @ [78:89] ==> public final val <T : (Any..Any?)> Class<ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContractState

'stateAndRef' @ [79:41] ==> value-parameter stateAndRef: Map.Entry<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [79:53] ==> public abstract val value: StateAndRef<ContractState> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'state' @ [79:59] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'serialize' @ [79:65] ==> public fun <T : Any> TransactionState<ContractState>.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<TransactionState<ContractState>> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TransactionState<ContractState>

'STORAGE_CONTEXT' @ [79:85] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'bytes' @ [79:102] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'UNCONSUMED' @ [80:57] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'services' @ [81:40] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [81:49] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [81:55] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'state' @ [82:17] ==> val state: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [82:23] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'PersistentStateRef' @ [82:34] ==> public constructor PersistentStateRef(stateRef: StateRef) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'stateAndRef' @ [82:53] ==> value-parameter stateAndRef: Map.Entry<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [82:65] ==> public abstract val key: StateRef defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'session' @ [83:17] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'save' @ [83:25] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'state' @ [83:30] ==> val state: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[LocalVariableDescriptor]

'consumedStateRefs' @ [85:13] ==> val consumedStateRefs: List<StateRef> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'forEach' @ [85:31] ==> @HidesMembers public inline fun <T> Iterable<StateRef>.forEach(action: (StateRef) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'session' @ [86:29] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'get' @ [86:37] ==> public abstract operator fun <T : (Any..Any?)> get(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?), p1: (Serializable..Serializable?)): (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [86:68] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [86:82] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [86:101] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'PersistentStateRef' @ [86:107] ==> public constructor PersistentStateRef(stateRef: StateRef) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'stateRef' @ [86:126] ==> value-parameter stateRef: StateRef defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [87:17] ==> val state: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[LocalVariableDescriptor]

'run' @ [87:24] ==> @InlineOnly public inline fun <T, R> VaultSchemaV1.VaultStates.run(block: VaultSchemaV1.VaultStates.() -> (Serializable..Serializable?)): (Serializable..Serializable?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VaultStates
    <R> -> (java.io.Serializable..java.io.Serializable?)

'stateStatus' @ [88:21] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'Vault' @ [88:35] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'CONSUMED' @ [88:53] ==> enum entry CONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'consumedTime' @ [89:21] ==> @Column public final var consumedTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'services' @ [89:36] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [89:45] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [89:51] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'lockId' @ [91:25] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'lockId' @ [92:25] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'lockUpdateTime' @ [93:25] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'services' @ [93:42] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [93:51] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [93:57] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'log' @ [94:25] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [94:29] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'stateRef' @ [94:76] ==> value-parameter stateRef: StateRef defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'session' @ [96:21] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'save' @ [96:29] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'state' @ [96:34] ==> val state: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[LocalVariableDescriptor]

'update' @ [100:16] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'mutex' @ [104:17] ==> private final val mutex: ThreadBox<NodeVaultService.InnerState> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'locked' @ [104:23] ==> public final inline fun <R> locked(body: NodeVaultService.InnerState.() -> PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>): PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> PublishSubject<(net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)>

'_rawUpdatesPublisher' @ [104:32] ==> public final val _rawUpdatesPublisher: PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'mutex' @ [107:17] ==> private final val mutex: ThreadBox<NodeVaultService.InnerState> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'locked' @ [107:23] ==> public final inline fun <R> locked(body: NodeVaultService.InnerState.() -> Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>): Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Observable<(net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)>

'_updatesInDbTx' @ [107:32] ==> public final val _updatesInDbTx: Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'mutex' @ [110:17] ==> private final val mutex: ThreadBox<NodeVaultService.InnerState> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'locked' @ [110:23] ==> public final inline fun <R> locked(body: NodeVaultService.InnerState.() -> PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>): PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> PublishSubject<(net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)>

'_updatesPublisher' @ [110:32] ==> public final val _updatesPublisher: PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'mutableListOf' @ [120:27] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'mutableListOf' @ [121:32] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<NotaryChangeWireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'txns' @ [123:20] ==> value-parameter txns: Iterable<CoreTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[ValueParameterDescriptorImpl]

'when (tx) {
                is WireTransaction -> {
                    regularTxns.add(tx)
                    if (notaryChangeTxns.isNotEmpty()) {
                        notifyNotaryChange(notaryChangeTxns.toList())
                        notaryChangeTxns.clear()
                    }
                }
                is NotaryChangeWireTransaction -> {
                    notaryChangeTxns.add(tx)
                    if (regularTxns.isNotEmpty()) {
                        notifyRegular(regularTxns.toList())
                        regularTxns.clear()
                    }
                }
            }' @ [124:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'tx' @ [124:19] ==> val tx: CoreTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'regularTxns' @ [126:21] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'add' @ [126:33] ==> public abstract fun add(element: WireTransaction): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'tx' @ [126:37] ==> val tx: CoreTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'notaryChangeTxns' @ [127:25] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'isNotEmpty' @ [127:42] ==> @InlineOnly public inline fun <T> Collection<NotaryChangeWireTransaction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'notifyNotaryChange' @ [128:25] ==> private final fun notifyNotaryChange(txns: Iterable<NotaryChangeWireTransaction>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'notaryChangeTxns' @ [128:44] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'toList' @ [128:61] ==> public fun <T> Iterable<NotaryChangeWireTransaction>.toList(): List<NotaryChangeWireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'notaryChangeTxns' @ [129:25] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'clear' @ [129:42] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'notaryChangeTxns' @ [133:21] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'add' @ [133:38] ==> public abstract fun add(element: NotaryChangeWireTransaction): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'tx' @ [133:42] ==> val tx: CoreTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'regularTxns' @ [134:25] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'isNotEmpty' @ [134:37] ==> @InlineOnly public inline fun <T> Collection<WireTransaction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'notifyRegular' @ [135:25] ==> private final fun notifyRegular(txns: Iterable<WireTransaction>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'regularTxns' @ [135:39] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'toList' @ [135:51] ==> public fun <T> Iterable<WireTransaction>.toList(): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'regularTxns' @ [136:25] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'clear' @ [136:37] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'regularTxns' @ [142:13] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'isNotEmpty' @ [142:25] ==> @InlineOnly public inline fun <T> Collection<WireTransaction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'notifyRegular' @ [142:39] ==> private final fun notifyRegular(txns: Iterable<WireTransaction>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'regularTxns' @ [142:53] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'toList' @ [142:65] ==> public fun <T> Iterable<WireTransaction>.toList(): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'notaryChangeTxns' @ [143:13] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'isNotEmpty' @ [143:30] ==> @InlineOnly public inline fun <T> Collection<NotaryChangeWireTransaction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'notifyNotaryChange' @ [143:44] ==> private final fun notifyNotaryChange(txns: Iterable<NotaryChangeWireTransaction>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'notaryChangeTxns' @ [143:63] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'toList' @ [143:80] ==> public fun <T> Iterable<NotaryChangeWireTransaction>.toList(): List<NotaryChangeWireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'services' @ [147:23] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'keyManagementService' @ [147:32] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'keys' @ [147:53] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'tx' @ [149:32] ==> value-parameter tx: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[ValueParameterDescriptorImpl]

'outputs' @ [149:35] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'filter' @ [150:21] ==> public inline fun <T> Iterable<TransactionState<ContractState>>.filter(predicate: (TransactionState<ContractState>) -> Boolean): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'isRelevant' @ [150:30] ==> @VisibleForTesting internal final fun isRelevant(state: ContractState, ourKeys: Set<PublicKey>): Boolean defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'it' @ [150:41] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [150:44] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'ourKeys' @ [150:50] ==> val ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular[LocalVariableDescriptor]

'map' @ [151:21] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> StateAndRef<ContractState>

'tx' @ [151:27] ==> value-parameter tx: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[ValueParameterDescriptorImpl]

'outRef' @ [151:30] ==> public final fun <T : ContractState> outRef(state: ContractState): StateAndRef<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'it' @ [151:52] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [151:55] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'loadStates' @ [154:34] ==> private final fun loadStates(refs: Collection<StateRef>): HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'tx' @ [154:45] ==> value-parameter tx: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[ValueParameterDescriptorImpl]

'inputs' @ [154:48] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'consumedStates' @ [157:17] ==> val consumedStates: HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[LocalVariableDescriptor]

'isEmpty' @ [157:32] ==> public open fun isEmpty(): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'ourNewStates' @ [157:45] ==> val ourNewStates: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[LocalVariableDescriptor]

'isEmpty' @ [157:58] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [158:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [158:21] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'tx' @ [158:35] ==> value-parameter tx: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[ValueParameterDescriptorImpl]

'id' @ [158:38] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'Vault' @ [159:24] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'NoUpdate' @ [159:30] ==> public final val NoUpdate: Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Companion[DeserializedPropertyDescriptor]

'Vault' @ [162:20] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [162:26] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'consumedStates' @ [162:33] ==> val consumedStates: HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[LocalVariableDescriptor]

'ourNewStates' @ [162:49] ==> val ourNewStates: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[LocalVariableDescriptor]

'toHashSet' @ [162:62] ==> public fun <T> Iterable<StateAndRef<ContractState>>.toHashSet(): HashSet<StateAndRef<ContractState>> /* = HashSet<StateAndRef<ContractState>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'txns' @ [165:24] ==> value-parameter txns: Iterable<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular[ValueParameterDescriptorImpl]

'fold' @ [165:29] ==> public inline fun <T, R> Iterable<WireTransaction>.fold(initial: Vault.Update<ContractState>, operation: (acc: Vault.Update<ContractState>, WireTransaction) -> Vault.Update<ContractState>): Vault.Update<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction
    <R> -> Update<ContractState>

'NoUpdate' @ [165:40] ==> public final val NoUpdate: Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Companion[DeserializedPropertyDescriptor]

'netDelta' @ [165:69] ==> value-parameter netDelta: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.<anonymous>[ValueParameterDescriptorImpl]

'makeUpdate' @ [165:80] ==> local final fun makeUpdate(tx: WireTransaction): Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular[SimpleFunctionDescriptorImpl]

'txn' @ [165:91] ==> value-parameter txn: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.<anonymous>[ValueParameterDescriptorImpl]

'processAndNotify' @ [166:9] ==> private final fun processAndNotify(update: Vault.Update<ContractState>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'netDelta' @ [166:26] ==> val netDelta: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular[LocalVariableDescriptor]

'services' @ [170:23] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'keyManagementService' @ [170:32] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'keys' @ [170:53] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'tx' @ [175:23] ==> value-parameter tx: NotaryChangeWireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[ValueParameterDescriptorImpl]

'resolve' @ [175:26] ==> public final fun resolve(services: ServiceHub, sigs: List<TransactionSignature>): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [175:34] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'emptyList' @ [175:44] ==> public fun <T> emptyList(): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'component1' @ [177:18] ==> public final operator fun component1(): List<StateAndRef<ContractState>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [177:40] ==> public final operator fun component2(): List<TransactionState<ContractState>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'ltx' @ [177:58] ==> val ltx: NotaryChangeLedgerTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'inputs' @ [177:62] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[DeserializedPropertyDescriptor]

'zip' @ [178:21] ==> public infix fun <T, R> Iterable<StateAndRef<ContractState>>.zip(other: Iterable<TransactionState<ContractState>>): List<Pair<StateAndRef<ContractState>, TransactionState<ContractState>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> TransactionState<ContractState>

'ltx' @ [178:25] ==> val ltx: NotaryChangeLedgerTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'outputs' @ [178:29] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[DeserializedPropertyDescriptor]

'filter' @ [179:21] ==> public inline fun <T> Iterable<Pair<StateAndRef<ContractState>, TransactionState<ContractState>>>.filter(predicate: (Pair<StateAndRef<ContractState>, TransactionState<ContractState>>) -> Boolean): List<Pair<StateAndRef<ContractState>, TransactionState<ContractState>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<StateAndRef<ContractState>, TransactionState<ContractState>>

'component1' @ [180:26] ==> public final operator fun component1(): StateAndRef<ContractState> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [180:29] ==> public final operator fun component2(): TransactionState<ContractState> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'isRelevant' @ [181:25] ==> @VisibleForTesting internal final fun isRelevant(state: ContractState, ourKeys: Set<PublicKey>): Boolean defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'output' @ [181:36] ==> val output: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate.<anonymous>[LocalVariableDescriptor]

'data' @ [181:43] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'ourKeys' @ [181:49] ==> val ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange[LocalVariableDescriptor]

'unzip' @ [183:21] ==> public fun <T, R> Iterable<Pair<StateAndRef<ContractState>, TransactionState<ContractState>>>.unzip(): Pair<List<StateAndRef<ContractState>>, List<TransactionState<ContractState>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> TransactionState<ContractState>

'producedStates' @ [185:40] ==> val producedStates: List<TransactionState<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'map' @ [185:55] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> StateAndRef<ContractState>

'ltx' @ [185:61] ==> val ltx: NotaryChangeLedgerTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'outRef' @ [185:65] ==> public final fun <T : ContractState> outRef(state: ContractState): StateAndRef<ContractState> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'it' @ [185:87] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [185:90] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'consumedStateAndRefs' @ [187:17] ==> val consumedStateAndRefs: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'isEmpty' @ [187:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'producedStateAndRefs' @ [187:51] ==> val producedStateAndRefs: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'isEmpty' @ [187:72] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [188:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [188:21] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'tx' @ [188:35] ==> value-parameter tx: NotaryChangeWireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[ValueParameterDescriptorImpl]

'id' @ [188:38] ==> public open val id: SecureHash defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedPropertyDescriptor]

'Vault' @ [189:24] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'NoNotaryUpdate' @ [189:30] ==> public final val NoNotaryUpdate: Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Companion[DeserializedPropertyDescriptor]

'Vault' @ [192:20] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [192:26] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'consumedStateAndRefs' @ [192:33] ==> val consumedStateAndRefs: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'toHashSet' @ [192:54] ==> public fun <T> Iterable<StateAndRef<ContractState>>.toHashSet(): HashSet<StateAndRef<ContractState>> /* = HashSet<StateAndRef<ContractState>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'producedStateAndRefs' @ [192:67] ==> val producedStateAndRefs: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'toHashSet' @ [192:88] ==> public fun <T> Iterable<StateAndRef<ContractState>>.toHashSet(): HashSet<StateAndRef<ContractState>> /* = HashSet<StateAndRef<ContractState>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'NOTARY_CHANGE' @ [192:124] ==> enum entry NOTARY_CHANGE defined in net.corda.core.node.services.Vault.UpdateType[FakeCallableDescriptorForObject]

'txns' @ [195:24] ==> value-parameter txns: Iterable<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange[ValueParameterDescriptorImpl]

'fold' @ [195:29] ==> public inline fun <T, R> Iterable<NotaryChangeWireTransaction>.fold(initial: Vault.Update<ContractState>, operation: (acc: Vault.Update<ContractState>, NotaryChangeWireTransaction) -> Vault.Update<ContractState>): Vault.Update<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction
    <R> -> Update<ContractState>

'NoNotaryUpdate' @ [195:40] ==> public final val NoNotaryUpdate: Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Companion[DeserializedPropertyDescriptor]

'netDelta' @ [195:75] ==> value-parameter netDelta: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.<anonymous>[ValueParameterDescriptorImpl]

'makeUpdate' @ [195:86] ==> local final fun makeUpdate(tx: NotaryChangeWireTransaction): Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange[SimpleFunctionDescriptorImpl]

'txn' @ [195:97] ==> value-parameter txn: NotaryChangeWireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.<anonymous>[ValueParameterDescriptorImpl]

'processAndNotify' @ [196:9] ==> private final fun processAndNotify(update: Vault.Update<ContractState>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'netDelta' @ [196:26] ==> val netDelta: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange[LocalVariableDescriptor]

'HashSet' @ [201:22] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> StateAndRef<ContractState>

'refs' @ [202:13] ==> value-parameter refs: Collection<StateRef> defined in net.corda.node.services.vault.NodeVaultService.loadStates[ValueParameterDescriptorImpl]

'isNotEmpty' @ [202:18] ==> @InlineOnly public inline fun <T> Collection<StateRef>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'DatabaseTransactionManager' @ [203:27] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [203:54] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [203:64] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [204:35] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'criteriaBuilder' @ [204:43] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'criteriaBuilder' @ [205:33] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'createQuery' @ [205:49] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'VaultSchemaV1' @ [205:61] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [205:75] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [205:94] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [206:31] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'from' @ [206:45] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'VaultSchemaV1' @ [206:50] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [206:64] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [206:83] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [207:35] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'equal' @ [207:51] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [207:57] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'get' @ [207:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Vault.StateStatus..Vault.StateStatus?)>..Path<(Vault.StateStatus..Vault.StateStatus?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> StateStatus

'VaultSchemaV1' @ [207:92] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [207:106] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [207:119] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [207:131] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'UNCONSUMED' @ [207:156] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'refs' @ [208:39] ==> value-parameter refs: Collection<StateRef> defined in net.corda.node.services.vault.NodeVaultService.loadStates[ValueParameterDescriptorImpl]

'map' @ [208:44] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> PersistentStateRef

'PersistentStateRef' @ [208:50] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [208:69] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [208:72] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'bytes' @ [208:79] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'toHexString' @ [208:85] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [208:100] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [208:103] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'vaultStates' @ [209:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'get' @ [209:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'VaultSchemaV1' @ [209:68] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [209:82] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateRef' @ [209:95] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'name' @ [209:104] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [210:38] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'and' @ [210:54] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKey' @ [210:58] ==> val compositeKey: (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'`in`' @ [210:71] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefs' @ [210:76] ==> val persistentStateRefs: List<PersistentStateRef> defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'criteriaQuery' @ [211:13] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'where' @ [211:27] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'statusPredicate' @ [211:33] ==> val statusPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'stateRefsPredicate' @ [211:50] ==> val stateRefsPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'session' @ [212:27] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'createQuery' @ [212:35] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Query<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Query<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'criteriaQuery' @ [212:47] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'resultList' @ [212:62] ==> public final val <R : (Any..Any?)> Query<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'results' @ [213:13] ==> val results: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'asSequence' @ [213:21] ==> public fun <T> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.asSequence(): Sequence<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'forEach' @ [213:34] ==> public inline fun <T> Sequence<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.forEach(action: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'SecureHash' @ [214:30] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [214:41] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [214:47] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [214:50] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'txId' @ [214:60] ==> @field:Column public final var txId: String? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'it' @ [215:29] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [215:32] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'index' @ [215:42] ==> @field:Column public final var index: Int? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'it' @ [216:29] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'contractState' @ [216:32] ==> @Column public final var contractState: ByteArray defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'deserialize' @ [216:46] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): TransactionState<ContractState> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TransactionState<ContractState>

'STORAGE_CONTEXT' @ [216:101] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'states' @ [217:17] ==> val states: HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'add' @ [217:24] ==> public open fun add(element: StateAndRef<ContractState>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'StateAndRef' @ [217:28] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'state' @ [217:40] ==> val state: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[LocalVariableDescriptor]

'StateRef' @ [217:47] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'txHash' @ [217:56] ==> val txHash: SecureHash.SHA256 defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[LocalVariableDescriptor]

'index' @ [217:64] ==> val index: Int defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[LocalVariableDescriptor]

'states' @ [220:16] ==> val states: HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'!' @ [224:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'update' @ [224:14] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify[ValueParameterDescriptorImpl]

'isEmpty' @ [224:21] ==> public final fun isEmpty(): Boolean defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'recordUpdate' @ [225:13] ==> private final fun recordUpdate(update: Vault.Update<ContractState>): Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'update' @ [225:26] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify[ValueParameterDescriptorImpl]

'mutex' @ [226:13] ==> private final val mutex: ThreadBox<NodeVaultService.InnerState> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'locked' @ [226:19] ==> public final inline fun <R> locked(body: NodeVaultService.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'currentStrand' @ [228:36] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'id' @ [228:82] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'uuid' @ [228:86] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[DeserializedPropertyDescriptor]

'if (uuid != null) update.copy(flowId = uuid) else update' @ [229:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Vault.Update<ContractState>, elseBranch: Vault.Update<ContractState>): Vault.Update<ContractState>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Update<ContractState>

'uuid' @ [229:39] ==> val uuid: UUID? defined in net.corda.node.services.vault.NodeVaultService.processAndNotify.<anonymous>[LocalVariableDescriptor]

'update' @ [229:53] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify[ValueParameterDescriptorImpl]

'copy' @ [229:60] ==> public final fun copy(consumed: Set<StateAndRef<ContractState>> = ..., produced: Set<StateAndRef<ContractState>> = ..., flowId: UUID? = ..., type: Vault.UpdateType = ...): Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'uuid' @ [229:74] ==> val uuid: UUID? defined in net.corda.node.services.vault.NodeVaultService.processAndNotify.<anonymous>[LocalVariableDescriptor]

'update' @ [229:85] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify[ValueParameterDescriptorImpl]

'updatesPublisher' @ [230:17] ==> public final val updatesPublisher: Observer<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'onNext' @ [230:34] ==> public abstract fun onNext(p0: (Vault.Update<ContractState>..Vault.Update<ContractState>?)): Unit defined in rx.Observer[JavaMethodDescriptor]

'vaultUpdate' @ [230:41] ==> val vaultUpdate: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify.<anonymous>[LocalVariableDescriptor]

'VaultSchemaV1' @ [236:29] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultTxnNote' @ [236:43] ==> public constructor VaultTxnNote(txId: String, note: String) defined in net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote[ClassConstructorDescriptorImpl]

'txnId' @ [236:56] ==> value-parameter txnId: SecureHash defined in net.corda.node.services.vault.NodeVaultService.addNoteToTransaction[ValueParameterDescriptorImpl]

'toString' @ [236:62] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'noteText' @ [236:74] ==> value-parameter noteText: String defined in net.corda.node.services.vault.NodeVaultService.addNoteToTransaction[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [237:9] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [237:36] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [237:46] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'save' @ [237:54] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'txnNoteEntity' @ [237:59] ==> val txnNoteEntity: VaultSchemaV1.VaultTxnNote defined in net.corda.node.services.vault.NodeVaultService.addNoteToTransaction[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [241:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [241:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [241:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [242:31] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'criteriaBuilder' @ [242:39] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'criteriaBuilder' @ [243:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'createQuery' @ [243:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Class<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote..net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote?)

'VaultSchemaV1' @ [243:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [243:91] ==> public val <T> KClass<VaultSchemaV1.VaultTxnNote>.java: Class<VaultSchemaV1.VaultTxnNote> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultTxnNote

'criteriaQuery' @ [244:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'from' @ [244:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Class<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?)): (Root<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Root<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote..net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote?)

'VaultSchemaV1' @ [244:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [244:80] ==> public val <T> KClass<VaultSchemaV1.VaultTxnNote>.java: Class<VaultSchemaV1.VaultTxnNote> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultTxnNote

'criteriaBuilder' @ [245:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'equal' @ [245:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [245:51] ==> val vaultStates: (Root<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Root<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'get' @ [245:63] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Vault.StateStatus..Vault.StateStatus?)>..Path<(Vault.StateStatus..Vault.StateStatus?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> StateStatus

'VaultSchemaV1' @ [245:86] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'txId' @ [245:114] ==> @Column public final var txId: String defined in net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote[PropertyDescriptorImpl]

'name' @ [245:119] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'txnId' @ [245:126] ==> value-parameter txnId: SecureHash defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[ValueParameterDescriptorImpl]

'toString' @ [245:132] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'criteriaQuery' @ [246:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'where' @ [246:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'txIdPredicate' @ [246:29] ==> val txIdPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'session' @ [247:23] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'createQuery' @ [247:31] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?)): (Query<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Query<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote..net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote?)

'criteriaQuery' @ [247:43] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'resultList' @ [247:58] ==> public final val <R : (Any..Any?)> Query<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>.resultList: (MutableList<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..List<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote..net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote?)

'results' @ [248:16] ==> val results: (MutableList<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..List<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'asIterable' @ [248:24] ==> @InlineOnly public inline fun <T> Iterable<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>.asIterable(): Iterable<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote..net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote?)

'map' @ [248:37] ==> public inline fun <T, R> Iterable<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>.map(transform: ((VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote..net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote?)
    <R> -> String

'it' @ [248:43] ==> value-parameter it: (VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes.<anonymous>[ValueParameterDescriptorImpl]

'note' @ [248:46] ==> @Column public final var note: String defined in net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote[PropertyDescriptorImpl]

'Throws' @ [251:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StatesNotAvailableException' @ [251:13] ==> public constructor StatesNotAvailableException(message: String?, cause: Throwable? = ...) defined in net.corda.core.node.services.StatesNotAvailableException[DeserializedClassConstructorDescriptor]

'services' @ [253:33] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [253:42] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [253:48] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [255:27] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [255:54] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [255:64] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [256:35] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'criteriaBuilder' @ [256:43] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'criteriaBuilder' @ [257:34] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'createCriteriaUpdate' @ [257:50] ==> public abstract fun <T : (Any..Any?)> createCriteriaUpdate(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'VaultSchemaV1' @ [257:71] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [257:85] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [257:104] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaUpdate' @ [258:31] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'from' @ [258:46] ==> public abstract fun from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'VaultSchemaV1' @ [258:51] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [258:65] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [258:84] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [259:42] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'equal' @ [259:58] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [259:64] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [259:76] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Vault.StateStatus..Vault.StateStatus?)>..Path<(Vault.StateStatus..Vault.StateStatus?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> StateStatus

'VaultSchemaV1' @ [259:99] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [259:113] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [259:126] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [259:138] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'UNCONSUMED' @ [259:163] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [260:35] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'or' @ [260:51] ==> public abstract fun or(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [260:54] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [260:66] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [260:78] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [260:92] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [260:105] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [260:112] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'isNull' @ [260:118] ==> public final val <X : (Any..Any?)> Path<(String..String?)>.isNull: (Predicate..Predicate?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'criteriaBuilder' @ [261:35] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'equal' @ [261:51] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [261:57] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [261:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [261:81] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [261:95] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [261:108] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [261:115] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [261:122] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'toString' @ [261:129] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'stateRefs' @ [262:39] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'map' @ [262:49] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> PersistentStateRef

'PersistentStateRef' @ [262:55] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [262:74] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockReserve.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [262:77] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'bytes' @ [262:84] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'toHexString' @ [262:90] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [262:105] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockReserve.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [262:108] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'vaultStates' @ [263:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [263:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'VaultSchemaV1' @ [263:68] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [263:82] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateRef' @ [263:95] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'name' @ [263:104] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [264:38] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'and' @ [264:54] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKey' @ [264:58] ==> val compositeKey: (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'`in`' @ [264:71] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefs' @ [264:76] ==> val persistentStateRefs: List<PersistentStateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'criteriaUpdate' @ [265:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'set' @ [265:28] ==> public abstract operator fun <Y : (Any..Any?), X : (String..String?)> set(p0: (Path<(String..String?)>..Path<(String..String?)>?), p1: (String..String?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.String..kotlin.String?)
    <X : (Y..Y?)> -> (kotlin.String..kotlin.String?)

'vaultStates' @ [265:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [265:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [265:56] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [265:70] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [265:83] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [265:90] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [265:97] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'toString' @ [265:104] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'criteriaUpdate' @ [266:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'set' @ [266:28] ==> public abstract operator fun <Y : (Any..Any?), X : (Instant..Instant?)> set(p0: (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?), p1: (Instant..Instant?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (java.time.Instant..java.time.Instant?)
    <X : (Y..Y?)> -> (java.time.Instant..java.time.Instant?)

'vaultStates' @ [266:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [266:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant

'VaultSchemaV1' @ [266:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [266:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockUpdateTime' @ [266:84] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [266:99] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'softLockTimestamp' @ [266:106] ==> val softLockTimestamp: (Instant..Instant?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'criteriaUpdate' @ [267:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'where' @ [267:28] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'stateStatusPredication' @ [267:34] ==> val stateStatusPredication: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'lockIdPredicate' @ [267:58] ==> val lockIdPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'stateRefsPredicate' @ [267:75] ==> val stateRefsPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'session' @ [268:31] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'createQuery' @ [268:39] ==> public abstract fun createQuery(p0: raw (CriteriaUpdate<(Any..Any?)>..CriteriaUpdate<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'criteriaUpdate' @ [268:51] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'executeUpdate' @ [268:67] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

'if (updatedRows > 0 && updatedRows == stateRefs.size) {
                log.trace("Reserving soft lock states for $lockId: $stateRefs")
                FlowStateMachineImpl.currentStateMachine()?.hasSoftLockedStates = true
            } else {
                // revert partial soft locks
                val criteriaRevertUpdate = criteriaBuilder.createCriteriaUpdate(VaultSchemaV1.VaultStates::class.java)
                val vaultStatesRevert = criteriaRevertUpdate.from(VaultSchemaV1.VaultStates::class.java)
                val lockIdPredicateRevert = criteriaBuilder.equal(vaultStatesRevert.get<String>(VaultSchemaV1.VaultStates::lockId.name), lockId.toString())
                val lockUpdateTime = criteriaBuilder.equal(vaultStatesRevert.get<Instant>(VaultSchemaV1.VaultStates::lockUpdateTime.name), softLockTimestamp)
                val persistentStateRefsRevert = stateRefs.map { PersistentStateRef(it.txhash.bytes.toHexString(), it.index) }
                val compositeKeyRevert = vaultStatesRevert.get<PersistentStateRef>(VaultSchemaV1.VaultStates::stateRef.name)
                val stateRefsPredicateRevert = criteriaBuilder.and(compositeKeyRevert.`in`(persistentStateRefsRevert))
                criteriaRevertUpdate.set(vaultStatesRevert.get<String>(VaultSchemaV1.VaultStates::lockId.name), criteriaBuilder.nullLiteral(String::class.java))
                criteriaRevertUpdate.where(lockUpdateTime, lockIdPredicateRevert, stateRefsPredicateRevert)
                val revertUpdatedRows = session.createQuery(criteriaRevertUpdate).executeUpdate()
                if (revertUpdatedRows > 0) {
                    log.trace("Reverting $revertUpdatedRows partially soft locked states for $lockId")
                }
                throw StatesNotAvailableException("Attempted to reserve $stateRefs for $lockId but only $updatedRows rows available")
            }' @ [269:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'updatedRows' @ [269:17] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'updatedRows' @ [269:36] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'stateRefs' @ [269:51] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'size' @ [269:61] ==> public open val size: Int defined in net.corda.core.utilities.NonEmptySet[DeserializedPropertyDescriptor]

'log' @ [270:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [270:21] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'lockId' @ [270:60] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'stateRefs' @ [270:69] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'FlowStateMachineImpl' @ [271:17] ==> public companion object defined in net.corda.node.services.statemachine.FlowStateMachineImpl[FakeCallableDescriptorForObject]

'currentStateMachine' @ [271:38] ==> public final fun currentStateMachine(): FlowStateMachineImpl<*>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.Companion[SimpleFunctionDescriptorImpl]

'hasSoftLockedStates' @ [271:61] ==> internal final var hasSoftLockedStates: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'criteriaBuilder' @ [274:44] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'createCriteriaUpdate' @ [274:60] ==> public abstract fun <T : (Any..Any?)> createCriteriaUpdate(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'VaultSchemaV1' @ [274:81] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [274:95] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [274:114] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaRevertUpdate' @ [275:41] ==> val criteriaRevertUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'from' @ [275:62] ==> public abstract fun from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'VaultSchemaV1' @ [275:67] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [275:81] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [275:100] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [276:45] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'equal' @ [276:61] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStatesRevert' @ [276:67] ==> val vaultStatesRevert: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [276:85] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [276:97] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [276:111] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [276:124] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [276:131] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [276:138] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'toString' @ [276:145] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'criteriaBuilder' @ [277:38] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'equal' @ [277:54] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStatesRevert' @ [277:60] ==> val vaultStatesRevert: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [277:78] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant

'VaultSchemaV1' @ [277:91] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [277:105] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockUpdateTime' @ [277:118] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [277:133] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'softLockTimestamp' @ [277:140] ==> val softLockTimestamp: (Instant..Instant?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'stateRefs' @ [278:49] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'map' @ [278:59] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> PersistentStateRef

'PersistentStateRef' @ [278:65] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [278:84] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockReserve.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [278:87] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'bytes' @ [278:94] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'toHexString' @ [278:100] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [278:115] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockReserve.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [278:118] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'vaultStatesRevert' @ [279:42] ==> val vaultStatesRevert: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [279:60] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'VaultSchemaV1' @ [279:84] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [279:98] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateRef' @ [279:111] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'name' @ [279:120] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [280:48] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'and' @ [280:64] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKeyRevert' @ [280:68] ==> val compositeKeyRevert: (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'`in`' @ [280:87] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefsRevert' @ [280:92] ==> val persistentStateRefsRevert: List<PersistentStateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'criteriaRevertUpdate' @ [281:17] ==> val criteriaRevertUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'set' @ [281:38] ==> public abstract operator fun <Y : (Any..Any?)> set(p0: (Path<(String..String?)>..Path<(String..String?)>?), p1: (Expression<out (String..String?)>..Expression<out (String..String?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'vaultStatesRevert' @ [281:42] ==> val vaultStatesRevert: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [281:60] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [281:72] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [281:86] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [281:99] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [281:106] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [281:113] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'nullLiteral' @ [281:129] ==> public abstract fun <T : (Any..Any?)> nullLiteral(p0: (Class<(String..String?)>..Class<(String..String?)>?)): (Expression<(String..String?)>..Expression<(String..String?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'String' @ [281:141] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [281:155] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'criteriaRevertUpdate' @ [282:17] ==> val criteriaRevertUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'where' @ [282:38] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'lockUpdateTime' @ [282:44] ==> val lockUpdateTime: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'lockIdPredicateRevert' @ [282:60] ==> val lockIdPredicateRevert: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'stateRefsPredicateRevert' @ [282:83] ==> val stateRefsPredicateRevert: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'session' @ [283:41] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'createQuery' @ [283:49] ==> public abstract fun createQuery(p0: raw (CriteriaUpdate<(Any..Any?)>..CriteriaUpdate<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'criteriaRevertUpdate' @ [283:61] ==> val criteriaRevertUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'executeUpdate' @ [283:83] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

'revertUpdatedRows' @ [284:21] ==> val revertUpdatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'log' @ [285:21] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [285:25] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'revertUpdatedRows' @ [285:43] ==> val revertUpdatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'lockId' @ [285:95] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'StatesNotAvailableException' @ [287:23] ==> public constructor StatesNotAvailableException(message: String?, cause: Throwable? = ...) defined in net.corda.core.node.services.StatesNotAvailableException[DeserializedClassConstructorDescriptor]

'stateRefs' @ [287:74] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'lockId' @ [287:89] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'updatedRows' @ [287:106] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'log' @ [290:13] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'error' @ [290:17] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'lockId' @ [290:83] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'stateRefs' @ [290:95] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'e' @ [291:22] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'e' @ [293:17] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'cause' @ [293:19] ==> public open val cause: Throwable? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [293:64] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'cause' @ [293:66] ==> public open val cause: Throwable? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [294:19] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'services' @ [299:33] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [299:42] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [299:48] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [300:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [300:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [300:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [301:31] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'criteriaBuilder' @ [301:39] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'if (stateRefs == null) {
            val criteriaUpdate = criteriaBuilder.createCriteriaUpdate(VaultSchemaV1.VaultStates::class.java)
            val vaultStates = criteriaUpdate.from(VaultSchemaV1.VaultStates::class.java)
            val stateStatusPredication = criteriaBuilder.equal(vaultStates.get<Vault.StateStatus>(VaultSchemaV1.VaultStates::stateStatus.name), Vault.StateStatus.UNCONSUMED)
            val lockIdPredicate = criteriaBuilder.equal(vaultStates.get<String>(VaultSchemaV1.VaultStates::lockId.name), lockId.toString())
            criteriaUpdate.set<String>(vaultStates.get<String>(VaultSchemaV1.VaultStates::lockId.name), criteriaBuilder.nullLiteral(String::class.java))
            criteriaUpdate.set(vaultStates.get<Instant>(VaultSchemaV1.VaultStates::lockUpdateTime.name), softLockTimestamp)
            criteriaUpdate.where(stateStatusPredication, lockIdPredicate)
            val update = session.createQuery(criteriaUpdate).executeUpdate()
            if (update > 0) {
                log.trace("Releasing $update soft locked states for $lockId")
            }
        } else {
            try {
                val criteriaUpdate = criteriaBuilder.createCriteriaUpdate(VaultSchemaV1.VaultStates::class.java)
                val vaultStates = criteriaUpdate.from(VaultSchemaV1.VaultStates::class.java)
                val stateStatusPredication = criteriaBuilder.equal(vaultStates.get<Vault.StateStatus>(VaultSchemaV1.VaultStates::stateStatus.name), Vault.StateStatus.UNCONSUMED)
                val lockIdPredicate = criteriaBuilder.equal(vaultStates.get<String>(VaultSchemaV1.VaultStates::lockId.name), lockId.toString())
                val persistentStateRefs = stateRefs.map { PersistentStateRef(it.txhash.bytes.toHexString(), it.index) }
                val compositeKey = vaultStates.get<PersistentStateRef>(VaultSchemaV1.VaultStates::stateRef.name)
                val stateRefsPredicate = criteriaBuilder.and(compositeKey.`in`(persistentStateRefs))
                criteriaUpdate.set<String>(vaultStates.get<String>(VaultSchemaV1.VaultStates::lockId.name), criteriaBuilder.nullLiteral(String::class.java))
                criteriaUpdate.set(vaultStates.get<Instant>(VaultSchemaV1.VaultStates::lockUpdateTime.name), softLockTimestamp)
                criteriaUpdate.where(stateStatusPredication, lockIdPredicate, stateRefsPredicate)
                val updatedRows = session.createQuery(criteriaUpdate).executeUpdate()
                if (updatedRows > 0) {
                    log.trace("Releasing $updatedRows soft locked states for $lockId and stateRefs $stateRefs")
                }
            } catch (e: Exception) {
                log.error("""soft lock update error attempting to release states for $lockId and $stateRefs")
                    $e.
                """)
                throw e
            }
        }' @ [302:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'stateRefs' @ [302:13] ==> value-parameter stateRefs: NonEmptySet<StateRef>? defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'criteriaBuilder' @ [303:34] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'createCriteriaUpdate' @ [303:50] ==> public abstract fun <T : (Any..Any?)> createCriteriaUpdate(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'VaultSchemaV1' @ [303:71] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [303:85] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [303:104] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaUpdate' @ [304:31] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'from' @ [304:46] ==> public abstract fun from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'VaultSchemaV1' @ [304:51] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [304:65] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [304:84] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [305:42] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'equal' @ [305:58] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [305:64] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [305:76] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Vault.StateStatus..Vault.StateStatus?)>..Path<(Vault.StateStatus..Vault.StateStatus?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> StateStatus

'VaultSchemaV1' @ [305:99] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [305:113] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [305:126] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [305:138] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'UNCONSUMED' @ [305:163] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [306:35] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'equal' @ [306:51] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [306:57] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [306:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [306:81] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [306:95] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [306:108] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [306:115] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [306:122] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'toString' @ [306:129] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'criteriaUpdate' @ [307:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'set' @ [307:28] ==> public abstract operator fun <Y : (Any..Any?)> set(p0: (Path<(String..String?)>..Path<(String..String?)>?), p1: (Expression<out (String..String?)>..Expression<out (String..String?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'vaultStates' @ [307:40] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [307:52] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [307:64] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [307:78] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [307:91] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [307:98] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [307:105] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'nullLiteral' @ [307:121] ==> public abstract fun <T : (Any..Any?)> nullLiteral(p0: (Class<(String..String?)>..Class<(String..String?)>?)): (Expression<(String..String?)>..Expression<(String..String?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'String' @ [307:133] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [307:147] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'criteriaUpdate' @ [308:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'set' @ [308:28] ==> public abstract operator fun <Y : (Any..Any?), X : (Instant..Instant?)> set(p0: (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?), p1: (Instant..Instant?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (java.time.Instant..java.time.Instant?)
    <X : (Y..Y?)> -> (java.time.Instant..java.time.Instant?)

'vaultStates' @ [308:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [308:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant

'VaultSchemaV1' @ [308:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [308:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockUpdateTime' @ [308:84] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [308:99] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'softLockTimestamp' @ [308:106] ==> val softLockTimestamp: (Instant..Instant?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'criteriaUpdate' @ [309:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'where' @ [309:28] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'stateStatusPredication' @ [309:34] ==> val stateStatusPredication: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'lockIdPredicate' @ [309:58] ==> val lockIdPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'session' @ [310:26] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'createQuery' @ [310:34] ==> public abstract fun createQuery(p0: raw (CriteriaUpdate<(Any..Any?)>..CriteriaUpdate<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'criteriaUpdate' @ [310:46] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'executeUpdate' @ [310:62] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

'update' @ [311:17] ==> val update: Int defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'log' @ [312:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [312:21] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'update' @ [312:39] ==> val update: Int defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'lockId' @ [312:70] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'criteriaBuilder' @ [316:38] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'createCriteriaUpdate' @ [316:54] ==> public abstract fun <T : (Any..Any?)> createCriteriaUpdate(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'VaultSchemaV1' @ [316:75] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [316:89] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [316:108] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaUpdate' @ [317:35] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'from' @ [317:50] ==> public abstract fun from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'VaultSchemaV1' @ [317:55] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [317:69] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [317:88] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [318:46] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'equal' @ [318:62] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [318:68] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [318:80] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Vault.StateStatus..Vault.StateStatus?)>..Path<(Vault.StateStatus..Vault.StateStatus?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> StateStatus

'VaultSchemaV1' @ [318:103] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [318:117] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [318:130] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [318:142] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'UNCONSUMED' @ [318:167] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [319:39] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'equal' @ [319:55] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [319:61] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [319:73] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [319:85] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [319:99] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [319:112] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [319:119] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [319:126] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'toString' @ [319:133] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'stateRefs' @ [320:43] ==> value-parameter stateRefs: NonEmptySet<StateRef>? defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'map' @ [320:53] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> PersistentStateRef

'PersistentStateRef' @ [320:59] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [320:78] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockRelease.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [320:81] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'bytes' @ [320:88] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'toHexString' @ [320:94] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [320:109] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockRelease.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [320:112] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'vaultStates' @ [321:36] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [321:48] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> PersistentStateRef

'VaultSchemaV1' @ [321:72] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [321:86] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateRef' @ [321:99] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'name' @ [321:108] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [322:42] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'and' @ [322:58] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKey' @ [322:62] ==> val compositeKey: (Path<(PersistentStateRef..PersistentStateRef?)>..Path<(PersistentStateRef..PersistentStateRef?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'`in`' @ [322:75] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefs' @ [322:80] ==> val persistentStateRefs: List<PersistentStateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'criteriaUpdate' @ [323:17] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'set' @ [323:32] ==> public abstract operator fun <Y : (Any..Any?)> set(p0: (Path<(String..String?)>..Path<(String..String?)>?), p1: (Expression<out (String..String?)>..Expression<out (String..String?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'vaultStates' @ [323:44] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [323:56] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [323:68] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [323:82] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [323:95] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [323:102] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [323:109] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'nullLiteral' @ [323:125] ==> public abstract fun <T : (Any..Any?)> nullLiteral(p0: (Class<(String..String?)>..Class<(String..String?)>?)): (Expression<(String..String?)>..Expression<(String..String?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'String' @ [323:137] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [323:151] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'criteriaUpdate' @ [324:17] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'set' @ [324:32] ==> public abstract operator fun <Y : (Any..Any?), X : (Instant..Instant?)> set(p0: (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?), p1: (Instant..Instant?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (java.time.Instant..java.time.Instant?)
    <X : (Y..Y?)> -> (java.time.Instant..java.time.Instant?)

'vaultStates' @ [324:36] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [324:48] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant

'VaultSchemaV1' @ [324:61] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [324:75] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockUpdateTime' @ [324:88] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [324:103] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'softLockTimestamp' @ [324:110] ==> val softLockTimestamp: (Instant..Instant?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'criteriaUpdate' @ [325:17] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'where' @ [325:32] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'stateStatusPredication' @ [325:38] ==> val stateStatusPredication: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'lockIdPredicate' @ [325:62] ==> val lockIdPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'stateRefsPredicate' @ [325:79] ==> val stateRefsPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'session' @ [326:35] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'createQuery' @ [326:43] ==> public abstract fun createQuery(p0: raw (CriteriaUpdate<(Any..Any?)>..CriteriaUpdate<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'criteriaUpdate' @ [326:55] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'executeUpdate' @ [326:71] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

'updatedRows' @ [327:21] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'log' @ [328:21] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [328:25] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'updatedRows' @ [328:43] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'lockId' @ [328:79] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'stateRefs' @ [328:101] ==> value-parameter stateRefs: NonEmptySet<StateRef>? defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'log' @ [331:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'error' @ [331:21] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'lockId' @ [331:87] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'stateRefs' @ [331:99] ==> value-parameter stateRefs: NonEmptySet<StateRef>? defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'e' @ [332:22] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'e' @ [334:23] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'Suspendable' @ [339:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [340:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StatesNotAvailableException' @ [340:13] ==> public constructor StatesNotAvailableException(message: String?, cause: Throwable? = ...) defined in net.corda.core.node.services.StatesNotAvailableException[DeserializedClassConstructorDescriptor]

'amount' @ [345:13] ==> value-parameter amount: Amount<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'quantity' @ [345:20] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'emptyList' @ [346:20] ==> public fun <T> emptyList(): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'Standard' @ [350:43] ==> public constructor Standard(attribute: Sort.Attribute) defined in net.corda.core.node.services.vault.SortAttribute.Standard[DeserializedClassConstructorDescriptor]

'STATE_REF' @ [350:78] ==> enum entry STATE_REF defined in net.corda.core.node.services.vault.Sort.CommonStateAttribute[FakeCallableDescriptorForObject]

'Sort' @ [351:22] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[DeserializedClassConstructorDescriptor]

'setOf' @ [351:27] ==> public fun <T> setOf(element: Sort.SortColumn): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'SortColumn' @ [351:38] ==> public constructor SortColumn(sortAttribute: SortAttribute, direction: Sort.Direction = ...) defined in net.corda.core.node.services.vault.Sort.SortColumn[DeserializedClassConstructorDescriptor]

'sortAttribute' @ [351:49] ==> val sortAttribute: SortAttribute.Standard defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'ASC' @ [351:79] ==> enum entry ASC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'VaultQueryCriteria' @ [352:46] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'setOf' @ [353:38] ==> public fun <T> setOf(element: Class<out T>): Set<Class<out T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out T>

'contractType' @ [353:44] ==> value-parameter contractType: Class<out T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'SoftLockingCondition' @ [354:54] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'UNLOCKED_AND_SPECIFIED' @ [354:105] ==> enum entry UNLOCKED_AND_SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'listOf' @ [354:129] ==> public fun <T> listOf(element: UUID): List<UUID> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UUID

'lockId' @ [354:136] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'services' @ [355:23] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'vaultQueryService' @ [355:32] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [355:50] ==> public open fun <T : ContractState> queryBy(contractType: Class<out T>, criteria: QueryCriteria, sorting: Sort): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> T

'contractType' @ [355:58] ==> value-parameter contractType: Class<out T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'enrichedCriteria' @ [355:72] ==> val enrichedCriteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'and' @ [355:89] ==> public final fun and(criteria: QueryCriteria): QueryCriteria defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedSimpleFunctionDescriptor]

'eligibleStatesQuery' @ [355:93] ==> value-parameter eligibleStatesQuery: QueryCriteria defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'sorter' @ [355:115] ==> val sorter: Sort defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'mutableListOf' @ [358:29] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'results' @ [359:23] ==> val results: Vault.Page<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'states' @ [359:31] ==> public final val states: List<StateAndRef<T>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'state' @ [360:36] ==> val state: StateAndRef<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'state' @ [360:42] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [360:48] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [360:53] ==> public abstract val amount: Amount<Issued<U>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [360:60] ==> public final val token: Issued<U> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuedAssetToken' @ [361:17] ==> val issuedAssetToken: Issued<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'product' @ [361:34] ==> public final val product: U defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'amount' @ [361:45] ==> value-parameter amount: Amount<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'token' @ [361:52] ==> public final val token: U defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'claimedStates' @ [362:17] ==> val claimedStates: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'state' @ [362:34] ==> val state: StateAndRef<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'claimedAmount' @ [363:17] ==> var claimedAmount: Long defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'state' @ [363:34] ==> val state: StateAndRef<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'state' @ [363:40] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [363:46] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [363:51] ==> public abstract val amount: Amount<Issued<U>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'quantity' @ [363:58] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'claimedAmount' @ [364:21] ==> var claimedAmount: Long defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'amount' @ [364:37] ==> value-parameter amount: Amount<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'quantity' @ [364:44] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'claimedStates' @ [369:13] ==> val claimedStates: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'isEmpty' @ [369:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'claimedAmount' @ [369:40] ==> var claimedAmount: Long defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'amount' @ [369:56] ==> value-parameter amount: Amount<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'quantity' @ [369:63] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'emptyList' @ [370:20] ==> public fun <T> emptyList(): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'softLockReserve' @ [372:9] ==> @Throws public open fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'lockId' @ [372:25] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'claimedStates' @ [372:33] ==> val claimedStates: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'map' @ [372:47] ==> public inline fun <T, R> Iterable<StateAndRef<T>>.map(transform: (StateAndRef<T>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>
    <R> -> StateRef

'it' @ [372:53] ==> value-parameter it: StateAndRef<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [372:56] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'toNonEmptySet' @ [372:62] ==> public fun <T> Collection<StateRef>.toNonEmptySet(): NonEmptySet<StateRef> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'claimedStates' @ [373:16] ==> val claimedStates: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'mutableMapOf' @ [377:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<StateRef, Class<out UpgradedContract<*, *>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> StateRef
    <V> -> Class<out UpgradedContract<*, *>>

'authorisedUpgrade' @ [379:64] ==> private final val authorisedUpgrade: MutableMap<StateRef, Class<out UpgradedContract<*, *>>> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'ref' @ [379:82] ==> value-parameter ref: StateRef defined in net.corda.node.services.vault.NodeVaultService.getAuthorisedContractUpgrade[ValueParameterDescriptorImpl]

'upgradedContractClass' @ [382:23] ==> value-parameter upgradedContractClass: Class<out UpgradedContract<*, *>> defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'newInstance' @ [382:45] ==> @CallerSensitive public open fun newInstance(): (UpgradedContract<*, *>..UpgradedContract<*, *>?) defined in java.lang.Class[JavaMethodDescriptor]

'upgrade' @ [383:13] ==> val upgrade: (UpgradedContract<*, *>..UpgradedContract<*, *>?) defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[LocalVariableDescriptor]

'legacyContract' @ [383:21] ==> public abstract val legacyContract: Class<out Contract> defined in net.corda.core.contracts.UpgradedContract[DeserializedPropertyDescriptor]

'stateAndRef' @ [383:39] ==> value-parameter stateAndRef: StateAndRef<*> defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'state' @ [383:51] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [383:57] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'contract' @ [383:62] ==> public abstract val contract: Contract defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'javaClass' @ [383:71] ==> public val <T : Any> Contract.javaClass: Class<Contract> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Contract

'IllegalArgumentException' @ [384:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'authorisedUpgrade' @ [386:9] ==> private final val authorisedUpgrade: MutableMap<StateRef, Class<out UpgradedContract<*, *>>> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'put' @ [386:27] ==> public abstract fun put(key: StateRef, value: Class<out UpgradedContract<*, *>>): Class<out UpgradedContract<*, *>>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'stateAndRef' @ [386:31] ==> value-parameter stateAndRef: StateAndRef<*> defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'ref' @ [386:43] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'upgradedContractClass' @ [386:48] ==> value-parameter upgradedContractClass: Class<out UpgradedContract<*, *>> defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'authorisedUpgrade' @ [390:9] ==> private final val authorisedUpgrade: MutableMap<StateRef, Class<out UpgradedContract<*, *>>> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'remove' @ [390:27] ==> public abstract fun remove(key: StateRef): Class<out UpgradedContract<*, *>>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'stateAndRef' @ [390:34] ==> value-parameter stateAndRef: StateAndRef<*> defined in net.corda.node.services.vault.NodeVaultService.deauthoriseContractUpgrade[ValueParameterDescriptorImpl]

'ref' @ [390:46] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'VisibleForTesting' @ [393:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'when (state) {
        is OwnableState -> state.owner.owningKey.containsAny(ourKeys)
        is LinearState -> state.isRelevant(ourKeys)
        else -> ourKeys.intersect(state.participants.map { it.owningKey }).isNotEmpty()
    }' @ [394:78] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'state' @ [394:84] ==> value-parameter state: ContractState defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'state' @ [395:28] ==> value-parameter state: ContractState defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'owner' @ [395:34] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.OwnableState[DeserializedPropertyDescriptor]

'owningKey' @ [395:40] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'containsAny' @ [395:50] ==> public fun PublicKey.containsAny(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'ourKeys' @ [395:62] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'state' @ [396:27] ==> value-parameter state: ContractState defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'isRelevant' @ [396:33] ==> public abstract fun isRelevant(ourKeys: Set<PublicKey>): Boolean defined in net.corda.core.contracts.LinearState[DeserializedSimpleFunctionDescriptor]

'ourKeys' @ [396:44] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'ourKeys' @ [397:17] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'intersect' @ [397:25] ==> public infix fun <T> Iterable<PublicKey>.intersect(other: Iterable<PublicKey>): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'state' @ [397:35] ==> value-parameter state: ContractState defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'participants' @ [397:41] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'map' @ [397:54] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [397:60] ==> value-parameter it: AbstractParty defined in net.corda.node.services.vault.NodeVaultService.isRelevant.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [397:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'isNotEmpty' @ [397:76] ==> @InlineOnly public inline fun <T> Collection<PublicKey>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

