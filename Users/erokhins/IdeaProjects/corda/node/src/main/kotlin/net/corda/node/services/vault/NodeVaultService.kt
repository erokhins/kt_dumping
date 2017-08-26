'SingletonSerializeAsToken' @ [52:60] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'loggerFor' @ [55:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeVaultService

'!!' @ [59:33] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PublishSubject<Vault.Update<ContractState>>?): PublishSubject<Vault.Update<ContractState>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PublishSubject<Update<ContractState>>

'create' @ [59:48] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Update<ContractState>

'!!' @ [60:36] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PublishSubject<Vault.Update<ContractState>>?): PublishSubject<Vault.Update<ContractState>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PublishSubject<Update<ContractState>>

'create' @ [60:51] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..PublishSubject<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Update<ContractState>

'_updatesPublisher' @ [61:30] ==> public final val _updatesPublisher: PublishSubject<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'wrapWithDatabaseTransaction' @ [61:48] ==> public fun <T : Any> Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>.wrapWithDatabaseTransaction(db: CordaPersistence? = ...): Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)

'asObservable' @ [61:78] ==> public final fun asObservable(): (Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'_updatesPublisher' @ [64:80] ==> public final val _updatesPublisher: PublishSubject<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'bufferUntilDatabaseCommit' @ [64:98] ==> public fun <T : Any> Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>.bufferUntilDatabaseCommit(): Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)

'tee' @ [64:126] ==> public fun <T> Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>.tee(vararg teeTo: Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>): Observer<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)

'_rawUpdatesPublisher' @ [64:130] ==> public final val _rawUpdatesPublisher: PublishSubject<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'ThreadBox' @ [67:25] ==> public constructor ThreadBox<out T>(content: NodeVaultService.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [67:35] ==> public constructor InnerState() defined in net.corda.node.services.vault.NodeVaultService.InnerState[ClassConstructorDescriptorImpl]

'!' @ [70:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'update' @ [70:14] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'isEmpty' @ [70:21] ==> public final fun isEmpty(): Boolean defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'update' @ [71:37] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'produced' @ [71:44] ==> public final val produced: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'map' @ [71:53] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> StateRef

'it' @ [71:59] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [71:62] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'update' @ [72:40] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'produced' @ [72:47] ==> public final val produced: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'associateBy' @ [72:56] ==> public inline fun <T, K> Iterable<StateAndRef<ContractState>>.associateBy(keySelector: (StateAndRef<ContractState>) -> StateRef): Map<StateRef, StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <K> -> StateRef

'it' @ [72:70] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [72:73] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'update' @ [73:37] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'consumed' @ [73:44] ==> public final val consumed: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'map' @ [73:53] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> StateRef

'it' @ [73:59] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [73:62] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'log' @ [74:13] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [74:17] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'consumedStateRefs' @ [74:36] ==> val consumedStateRefs: List<StateRef> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'producedStateRefs' @ [74:91] ==> val producedStateRefs: List<StateRef> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [76:27] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [76:54] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [76:64] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'producedStateRefsMap' @ [77:13] ==> val producedStateRefsMap: Map<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'forEach' @ [77:34] ==> @HidesMembers public inline fun <K, V> Map<out StateRef, StateAndRef<ContractState>>.forEach(action: (Map.Entry<StateRef, StateAndRef<ContractState>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> StateRef
    <V> -> StateAndRef<ContractState>

'VaultSchemaV1' @ [78:29] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [78:43] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateAndRef' @ [79:34] ==> value-parameter stateAndRef: Map.Entry<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [79:46] ==> public abstract val value: StateAndRef<ContractState> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'state' @ [79:52] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [79:58] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'stateAndRef' @ [80:50] ==> value-parameter stateAndRef: Map.Entry<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [80:62] ==> public abstract val value: StateAndRef<ContractState> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'state' @ [80:68] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [80:74] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'javaClass' @ [80:79] ==> public val <T : Any> ContractState.javaClass: Class<ContractState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> ContractState

'name' @ [80:89] ==> public final val <T : (Any..Any?)> Class<ContractState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContractState

'stateAndRef' @ [81:41] ==> value-parameter stateAndRef: Map.Entry<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [81:53] ==> public abstract val value: StateAndRef<ContractState> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'state' @ [81:59] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'serialize' @ [81:65] ==> public fun <T : Any> TransactionState<ContractState>.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<TransactionState<ContractState>> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TransactionState<ContractState>

'STORAGE_CONTEXT' @ [81:85] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'bytes' @ [81:102] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'Vault' @ [82:39] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'UNCONSUMED' @ [82:57] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'services' @ [83:40] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [83:49] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [83:55] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'state' @ [84:17] ==> val state: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[LocalVariableDescriptor]

'stateRef' @ [84:23] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'PersistentStateRef' @ [84:34] ==> public constructor PersistentStateRef(stateRef: StateRef) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'stateAndRef' @ [84:53] ==> value-parameter stateAndRef: Map.Entry<StateRef, StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [84:65] ==> public abstract val key: StateRef defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'session' @ [85:17] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'save' @ [85:25] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'state' @ [85:30] ==> val state: VaultSchemaV1.VaultStates defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[LocalVariableDescriptor]

'consumedStateRefs' @ [87:13] ==> val consumedStateRefs: List<StateRef> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'forEach' @ [87:31] ==> @HidesMembers public inline fun <T> Iterable<StateRef>.forEach(action: (StateRef) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'session' @ [88:29] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'get' @ [88:37] ==> public abstract operator fun <T : (Any..Any?)> get(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?), p1: (Serializable..Serializable?)): (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [88:68] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [88:82] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [88:101] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'PersistentStateRef' @ [88:107] ==> public constructor PersistentStateRef(stateRef: StateRef) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'stateRef' @ [88:126] ==> value-parameter stateRef: StateRef defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [89:17] ==> val state: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[LocalVariableDescriptor]

'run' @ [89:24] ==> @InlineOnly public inline fun <T, R> VaultSchemaV1.VaultStates.run(block: VaultSchemaV1.VaultStates.() -> (Serializable..Serializable?)): (Serializable..Serializable?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VaultStates
    <R> -> (java.io.Serializable..java.io.Serializable?)

'stateStatus' @ [90:21] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'Vault' @ [90:35] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'CONSUMED' @ [90:53] ==> enum entry CONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'consumedTime' @ [91:21] ==> @Column public final var consumedTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'services' @ [91:36] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [91:45] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [91:51] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'lockId' @ [93:25] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'lockId' @ [94:25] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'lockUpdateTime' @ [95:25] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'services' @ [95:42] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [95:51] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [95:57] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'log' @ [96:25] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [96:29] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'stateRef' @ [96:76] ==> value-parameter stateRef: StateRef defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[ValueParameterDescriptorImpl]

'session' @ [98:21] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[LocalVariableDescriptor]

'save' @ [98:29] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'state' @ [98:34] ==> val state: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.recordUpdate.<anonymous>[LocalVariableDescriptor]

'update' @ [102:16] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.recordUpdate[ValueParameterDescriptorImpl]

'mutex' @ [106:17] ==> private final val mutex: ThreadBox<NodeVaultService.InnerState> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'locked' @ [106:23] ==> public final inline fun <R> locked(body: NodeVaultService.InnerState.() -> PublishSubject<Vault.Update<ContractState>>): PublishSubject<Vault.Update<ContractState>> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> PublishSubject<Update<ContractState>>

'_rawUpdatesPublisher' @ [106:32] ==> public final val _rawUpdatesPublisher: PublishSubject<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'mutex' @ [109:17] ==> private final val mutex: ThreadBox<NodeVaultService.InnerState> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'locked' @ [109:23] ==> public final inline fun <R> locked(body: NodeVaultService.InnerState.() -> Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>): Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Observable<(net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)>

'_updatesInDbTx' @ [109:32] ==> public final val _updatesInDbTx: Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'mutex' @ [112:17] ==> private final val mutex: ThreadBox<NodeVaultService.InnerState> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'locked' @ [112:23] ==> public final inline fun <R> locked(body: NodeVaultService.InnerState.() -> PublishSubject<Vault.Update<ContractState>>): PublishSubject<Vault.Update<ContractState>> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> PublishSubject<Update<ContractState>>

'_updatesPublisher' @ [112:32] ==> public final val _updatesPublisher: PublishSubject<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'mutableListOf' @ [122:27] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'mutableListOf' @ [123:32] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<NotaryChangeWireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'txns' @ [125:20] ==> value-parameter txns: Iterable<CoreTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[ValueParameterDescriptorImpl]

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
            }' @ [126:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'tx' @ [126:19] ==> val tx: CoreTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'regularTxns' @ [128:21] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'add' @ [128:33] ==> public abstract fun add(element: WireTransaction): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'tx' @ [128:37] ==> val tx: CoreTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'notaryChangeTxns' @ [129:25] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'isNotEmpty' @ [129:42] ==> @InlineOnly public inline fun <T> Collection<NotaryChangeWireTransaction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'notifyNotaryChange' @ [130:25] ==> private final fun notifyNotaryChange(txns: Iterable<NotaryChangeWireTransaction>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'notaryChangeTxns' @ [130:44] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'toList' @ [130:61] ==> public fun <T> Iterable<NotaryChangeWireTransaction>.toList(): List<NotaryChangeWireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'notaryChangeTxns' @ [131:25] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'clear' @ [131:42] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'notaryChangeTxns' @ [135:21] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'add' @ [135:38] ==> public abstract fun add(element: NotaryChangeWireTransaction): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'tx' @ [135:42] ==> val tx: CoreTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'regularTxns' @ [136:25] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'isNotEmpty' @ [136:37] ==> @InlineOnly public inline fun <T> Collection<WireTransaction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'notifyRegular' @ [137:25] ==> private final fun notifyRegular(txns: Iterable<WireTransaction>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'regularTxns' @ [137:39] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'toList' @ [137:51] ==> public fun <T> Iterable<WireTransaction>.toList(): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'regularTxns' @ [138:25] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'clear' @ [138:37] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'regularTxns' @ [144:13] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'isNotEmpty' @ [144:25] ==> @InlineOnly public inline fun <T> Collection<WireTransaction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'notifyRegular' @ [144:39] ==> private final fun notifyRegular(txns: Iterable<WireTransaction>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'regularTxns' @ [144:53] ==> val regularTxns: MutableList<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'toList' @ [144:65] ==> public fun <T> Iterable<WireTransaction>.toList(): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'notaryChangeTxns' @ [145:13] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'isNotEmpty' @ [145:30] ==> @InlineOnly public inline fun <T> Collection<NotaryChangeWireTransaction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'notifyNotaryChange' @ [145:44] ==> private final fun notifyNotaryChange(txns: Iterable<NotaryChangeWireTransaction>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'notaryChangeTxns' @ [145:63] ==> val notaryChangeTxns: MutableList<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyAll[LocalVariableDescriptor]

'toList' @ [145:80] ==> public fun <T> Iterable<NotaryChangeWireTransaction>.toList(): List<NotaryChangeWireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction

'services' @ [149:23] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'keyManagementService' @ [149:32] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'keys' @ [149:53] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'tx' @ [151:32] ==> value-parameter tx: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[ValueParameterDescriptorImpl]

'outputs' @ [151:35] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'filter' @ [152:21] ==> public inline fun <T> Iterable<TransactionState<ContractState>>.filter(predicate: (TransactionState<ContractState>) -> Boolean): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'isRelevant' @ [152:30] ==> @VisibleForTesting internal final fun isRelevant(state: ContractState, ourKeys: Set<PublicKey>): Boolean defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'it' @ [152:41] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [152:44] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'ourKeys' @ [152:50] ==> val ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular[LocalVariableDescriptor]

'map' @ [153:21] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> StateAndRef<ContractState>

'tx' @ [153:27] ==> value-parameter tx: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[ValueParameterDescriptorImpl]

'outRef' @ [153:30] ==> public final fun <T : ContractState> outRef(state: ContractState): StateAndRef<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'it' @ [153:52] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [153:55] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'loadStates' @ [156:34] ==> private final fun loadStates(refs: Collection<StateRef>): HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'tx' @ [156:45] ==> value-parameter tx: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[ValueParameterDescriptorImpl]

'inputs' @ [156:48] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'consumedStates' @ [159:17] ==> val consumedStates: HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[LocalVariableDescriptor]

'isEmpty' @ [159:32] ==> public open fun isEmpty(): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'ourNewStates' @ [159:45] ==> val ourNewStates: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[LocalVariableDescriptor]

'isEmpty' @ [159:58] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [160:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [160:21] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'tx' @ [160:35] ==> value-parameter tx: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[ValueParameterDescriptorImpl]

'id' @ [160:38] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'Vault' @ [161:24] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'NoUpdate' @ [161:30] ==> public final val NoUpdate: Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Companion[DeserializedPropertyDescriptor]

'Vault' @ [164:20] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [164:26] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'consumedStates' @ [164:33] ==> val consumedStates: HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[LocalVariableDescriptor]

'ourNewStates' @ [164:49] ==> val ourNewStates: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.makeUpdate[LocalVariableDescriptor]

'toHashSet' @ [164:62] ==> public fun <T> Iterable<StateAndRef<ContractState>>.toHashSet(): HashSet<StateAndRef<ContractState>> /* = HashSet<StateAndRef<ContractState>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'txns' @ [167:24] ==> value-parameter txns: Iterable<WireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular[ValueParameterDescriptorImpl]

'fold' @ [167:29] ==> public inline fun <T, R> Iterable<WireTransaction>.fold(initial: Vault.Update<ContractState>, operation: (Vault.Update<ContractState>, WireTransaction) -> Vault.Update<ContractState>): Vault.Update<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction
    <R> -> Update<ContractState>

'Vault' @ [167:34] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'NoUpdate' @ [167:40] ==> public final val NoUpdate: Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Companion[DeserializedPropertyDescriptor]

'netDelta' @ [167:69] ==> value-parameter netDelta: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.<anonymous>[ValueParameterDescriptorImpl]

'makeUpdate' @ [167:80] ==> local final fun makeUpdate(tx: WireTransaction): Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular[SimpleFunctionDescriptorImpl]

'txn' @ [167:91] ==> value-parameter txn: WireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyRegular.<anonymous>[ValueParameterDescriptorImpl]

'processAndNotify' @ [168:9] ==> private final fun processAndNotify(update: Vault.Update<ContractState>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'netDelta' @ [168:26] ==> val netDelta: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyRegular[LocalVariableDescriptor]

'services' @ [172:23] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'keyManagementService' @ [172:32] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'keys' @ [172:53] ==> public abstract val keys: Set<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedPropertyDescriptor]

'tx' @ [177:23] ==> value-parameter tx: NotaryChangeWireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[ValueParameterDescriptorImpl]

'resolve' @ [177:26] ==> public final fun resolve(services: ServiceHub, sigs: List<TransactionSignature>): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedSimpleFunctionDescriptor]

'services' @ [177:34] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'emptyList' @ [177:44] ==> public fun <T> emptyList(): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'component1' @ [179:18] ==> public final operator fun component1(): List<StateAndRef<ContractState>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [179:40] ==> public final operator fun component2(): List<TransactionState<ContractState>> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'ltx' @ [179:58] ==> val ltx: NotaryChangeLedgerTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'inputs' @ [179:62] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[DeserializedPropertyDescriptor]

'zip' @ [180:21] ==> public infix fun <T, R> Iterable<StateAndRef<ContractState>>.zip(other: Iterable<TransactionState<ContractState>>): List<Pair<StateAndRef<ContractState>, TransactionState<ContractState>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> TransactionState<ContractState>

'ltx' @ [180:25] ==> val ltx: NotaryChangeLedgerTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'outputs' @ [180:29] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[DeserializedPropertyDescriptor]

'filter' @ [181:21] ==> public inline fun <T> Iterable<Pair<StateAndRef<ContractState>, TransactionState<ContractState>>>.filter(predicate: (Pair<StateAndRef<ContractState>, TransactionState<ContractState>>) -> Boolean): List<Pair<StateAndRef<ContractState>, TransactionState<ContractState>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<StateAndRef<ContractState>, TransactionState<ContractState>>

'component1' @ [182:26] ==> public final operator fun component1(): StateAndRef<ContractState> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [182:29] ==> public final operator fun component2(): TransactionState<ContractState> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'isRelevant' @ [183:25] ==> @VisibleForTesting internal final fun isRelevant(state: ContractState, ourKeys: Set<PublicKey>): Boolean defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'output' @ [183:36] ==> val output: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate.<anonymous>[LocalVariableDescriptor]

'data' @ [183:43] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'ourKeys' @ [183:49] ==> val ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange[LocalVariableDescriptor]

'unzip' @ [185:21] ==> public fun <T, R> Iterable<Pair<StateAndRef<ContractState>, TransactionState<ContractState>>>.unzip(): Pair<List<StateAndRef<ContractState>>, List<TransactionState<ContractState>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> TransactionState<ContractState>

'producedStates' @ [187:40] ==> val producedStates: List<TransactionState<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'map' @ [187:55] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> StateAndRef<ContractState>

'ltx' @ [187:61] ==> val ltx: NotaryChangeLedgerTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'outRef' @ [187:65] ==> public final fun <T : ContractState> outRef(state: ContractState): StateAndRef<ContractState> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'it' @ [187:87] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [187:90] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'consumedStateAndRefs' @ [189:17] ==> val consumedStateAndRefs: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'isEmpty' @ [189:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'producedStateAndRefs' @ [189:51] ==> val producedStateAndRefs: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'isEmpty' @ [189:72] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [190:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [190:21] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'tx' @ [190:35] ==> value-parameter tx: NotaryChangeWireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[ValueParameterDescriptorImpl]

'id' @ [190:38] ==> public open val id: SecureHash defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedPropertyDescriptor]

'Vault' @ [191:24] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'NoNotaryUpdate' @ [191:30] ==> public final val NoNotaryUpdate: Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Companion[DeserializedPropertyDescriptor]

'Vault' @ [194:20] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [194:26] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[DeserializedClassConstructorDescriptor]
Inferred types:
    <U : ContractState> -> ContractState

'consumedStateAndRefs' @ [194:33] ==> val consumedStateAndRefs: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'toHashSet' @ [194:54] ==> public fun <T> Iterable<StateAndRef<ContractState>>.toHashSet(): HashSet<StateAndRef<ContractState>> /* = HashSet<StateAndRef<ContractState>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'producedStateAndRefs' @ [194:67] ==> val producedStateAndRefs: List<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.makeUpdate[LocalVariableDescriptor]

'toHashSet' @ [194:88] ==> public fun <T> Iterable<StateAndRef<ContractState>>.toHashSet(): HashSet<StateAndRef<ContractState>> /* = HashSet<StateAndRef<ContractState>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'Vault' @ [194:107] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'NOTARY_CHANGE' @ [194:124] ==> enum entry NOTARY_CHANGE defined in net.corda.core.node.services.Vault.UpdateType[FakeCallableDescriptorForObject]

'txns' @ [197:24] ==> value-parameter txns: Iterable<NotaryChangeWireTransaction> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange[ValueParameterDescriptorImpl]

'fold' @ [197:29] ==> public inline fun <T, R> Iterable<NotaryChangeWireTransaction>.fold(initial: Vault.Update<ContractState>, operation: (Vault.Update<ContractState>, NotaryChangeWireTransaction) -> Vault.Update<ContractState>): Vault.Update<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotaryChangeWireTransaction
    <R> -> Update<ContractState>

'Vault' @ [197:34] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'NoNotaryUpdate' @ [197:40] ==> public final val NoNotaryUpdate: Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Companion[DeserializedPropertyDescriptor]

'netDelta' @ [197:75] ==> value-parameter netDelta: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.<anonymous>[ValueParameterDescriptorImpl]

'makeUpdate' @ [197:86] ==> local final fun makeUpdate(tx: NotaryChangeWireTransaction): Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange[SimpleFunctionDescriptorImpl]

'txn' @ [197:97] ==> value-parameter txn: NotaryChangeWireTransaction defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange.<anonymous>[ValueParameterDescriptorImpl]

'processAndNotify' @ [198:9] ==> private final fun processAndNotify(update: Vault.Update<ContractState>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'netDelta' @ [198:26] ==> val netDelta: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.notifyNotaryChange[LocalVariableDescriptor]

'HashSet' @ [203:22] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> StateAndRef<ContractState>

'refs' @ [204:13] ==> value-parameter refs: Collection<StateRef> defined in net.corda.node.services.vault.NodeVaultService.loadStates[ValueParameterDescriptorImpl]

'isNotEmpty' @ [204:18] ==> @InlineOnly public inline fun <T> Collection<StateRef>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'DatabaseTransactionManager' @ [205:27] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [205:54] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [205:64] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [206:35] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'criteriaBuilder' @ [206:43] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'criteriaBuilder' @ [207:33] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'createQuery' @ [207:49] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [207:61] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [207:75] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [207:94] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaQuery' @ [208:31] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'from' @ [208:45] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [208:50] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [208:64] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [208:83] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [209:35] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'equal' @ [209:51] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [209:57] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'get' @ [209:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [209:92] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [209:106] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [209:119] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [209:131] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'Vault' @ [209:138] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'UNCONSUMED' @ [209:156] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'refs' @ [210:39] ==> value-parameter refs: Collection<StateRef> defined in net.corda.node.services.vault.NodeVaultService.loadStates[ValueParameterDescriptorImpl]

'map' @ [210:44] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> PersistentStateRef

'PersistentStateRef' @ [210:50] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [210:69] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [210:72] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'bytes' @ [210:79] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'toHexString' @ [210:85] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [210:100] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [210:103] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'vaultStates' @ [211:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'get' @ [211:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [211:68] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [211:82] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateRef' @ [211:95] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'name' @ [211:104] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [212:38] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'and' @ [212:54] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKey' @ [212:58] ==> val compositeKey: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'`in`' @ [212:71] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefs' @ [212:76] ==> val persistentStateRefs: List<PersistentStateRef> defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'criteriaQuery' @ [213:13] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'where' @ [213:27] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'statusPredicate' @ [213:33] ==> val statusPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'stateRefsPredicate' @ [213:50] ==> val stateRefsPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'session' @ [214:27] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'createQuery' @ [214:35] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Query<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Query<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'criteriaQuery' @ [214:47] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaQuery<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'resultList' @ [214:62] ==> public final val <R : (Any..Any?)> Query<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.resultList: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'results' @ [215:13] ==> val results: (MutableList<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..List<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'asSequence' @ [215:21] ==> public fun <T> Iterable<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.asSequence(): Sequence<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'forEach' @ [215:34] ==> public inline fun <T> Sequence<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>.forEach(action: ((VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultStates..net.corda.node.services.vault.VaultSchemaV1.VaultStates?)

'SecureHash' @ [216:30] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [216:41] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [216:47] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [216:50] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'txId' @ [216:60] ==> @field:Column public final var txId: String? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'it' @ [217:29] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [217:32] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'index' @ [217:42] ==> @field:Column public final var index: Int? defined in net.corda.core.schemas.PersistentStateRef[DeserializedPropertyDescriptor]

'it' @ [218:29] ==> value-parameter it: (VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?) defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[ValueParameterDescriptorImpl]

'contractState' @ [218:32] ==> @Column public final var contractState: ByteArray defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'deserialize' @ [218:46] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): TransactionState<ContractState> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TransactionState<ContractState>

'STORAGE_CONTEXT' @ [218:101] ==> public final var STORAGE_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'states' @ [219:17] ==> val states: HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'add' @ [219:24] ==> public open fun add(element: StateAndRef<ContractState>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'StateAndRef' @ [219:28] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'state' @ [219:40] ==> val state: TransactionState<ContractState> defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[LocalVariableDescriptor]

'StateRef' @ [219:47] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'txHash' @ [219:56] ==> val txHash: SecureHash.SHA256 defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[LocalVariableDescriptor]

'index' @ [219:64] ==> val index: Int defined in net.corda.node.services.vault.NodeVaultService.loadStates.<anonymous>[LocalVariableDescriptor]

'states' @ [222:16] ==> val states: HashSet<StateAndRef<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.loadStates[LocalVariableDescriptor]

'!' @ [226:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'update' @ [226:14] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify[ValueParameterDescriptorImpl]

'isEmpty' @ [226:21] ==> public final fun isEmpty(): Boolean defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'recordUpdate' @ [227:13] ==> private final fun recordUpdate(update: Vault.Update<ContractState>): Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'update' @ [227:26] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify[ValueParameterDescriptorImpl]

'mutex' @ [228:13] ==> private final val mutex: ThreadBox<NodeVaultService.InnerState> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'locked' @ [228:19] ==> public final inline fun <R> locked(body: NodeVaultService.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'currentStrand' @ [230:36] ==> public open fun currentStrand(): (Strand..Strand?) defined in co.paralleluniverse.strands.Strand[JavaMethodDescriptor]

'id' @ [230:82] ==> public open val id: StateMachineRunId defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'uuid' @ [230:86] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[DeserializedPropertyDescriptor]

'if (uuid != null) update.copy(flowId = uuid) else update' @ [231:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Vault.Update<ContractState>, elseBranch: Vault.Update<ContractState>): Vault.Update<ContractState>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Update<ContractState>

'uuid' @ [231:39] ==> val uuid: UUID? defined in net.corda.node.services.vault.NodeVaultService.processAndNotify.<anonymous>[LocalVariableDescriptor]

'update' @ [231:53] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify[ValueParameterDescriptorImpl]

'copy' @ [231:60] ==> public final fun copy(consumed: Set<StateAndRef<ContractState>> = ..., produced: Set<StateAndRef<ContractState>> = ..., flowId: UUID? = ..., type: Vault.UpdateType = ...): Vault.Update<ContractState> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'uuid' @ [231:74] ==> val uuid: UUID? defined in net.corda.node.services.vault.NodeVaultService.processAndNotify.<anonymous>[LocalVariableDescriptor]

'update' @ [231:85] ==> value-parameter update: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify[ValueParameterDescriptorImpl]

'updatesPublisher' @ [232:17] ==> public final val updatesPublisher: Observer<Vault.Update<ContractState>> defined in net.corda.node.services.vault.NodeVaultService.InnerState[PropertyDescriptorImpl]

'onNext' @ [232:34] ==> public abstract fun onNext(p0: (Vault.Update<ContractState>..Vault.Update<ContractState>?)): Unit defined in rx.Observer[JavaMethodDescriptor]

'vaultUpdate' @ [232:41] ==> val vaultUpdate: Vault.Update<ContractState> defined in net.corda.node.services.vault.NodeVaultService.processAndNotify.<anonymous>[LocalVariableDescriptor]

'VaultSchemaV1' @ [238:29] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultTxnNote' @ [238:43] ==> public constructor VaultTxnNote(txId: String, note: String) defined in net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote[ClassConstructorDescriptorImpl]

'txnId' @ [238:56] ==> value-parameter txnId: SecureHash defined in net.corda.node.services.vault.NodeVaultService.addNoteToTransaction[ValueParameterDescriptorImpl]

'toString' @ [238:62] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'noteText' @ [238:74] ==> value-parameter noteText: String defined in net.corda.node.services.vault.NodeVaultService.addNoteToTransaction[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [239:9] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [239:36] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [239:46] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'save' @ [239:54] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'txnNoteEntity' @ [239:59] ==> val txnNoteEntity: VaultSchemaV1.VaultTxnNote defined in net.corda.node.services.vault.NodeVaultService.addNoteToTransaction[LocalVariableDescriptor]

'DatabaseTransactionManager' @ [243:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [243:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [243:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [244:31] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'criteriaBuilder' @ [244:39] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'criteriaBuilder' @ [245:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'createQuery' @ [245:45] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (Class<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Class<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?)): (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultTxnNote

'VaultSchemaV1' @ [245:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [245:91] ==> public val <T> KClass<VaultSchemaV1.VaultTxnNote>.java: Class<VaultSchemaV1.VaultTxnNote> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultTxnNote

'criteriaQuery' @ [246:27] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'from' @ [246:41] ==> public abstract fun <X : (Any..Any?)> from(p0: (Class<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Class<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?)): (Root<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Root<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]
Inferred types:
    <X : (Any..Any?)> -> VaultTxnNote

'VaultSchemaV1' @ [246:46] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'java' @ [246:80] ==> public val <T> KClass<VaultSchemaV1.VaultTxnNote>.java: Class<VaultSchemaV1.VaultTxnNote> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultTxnNote

'criteriaBuilder' @ [247:29] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'equal' @ [247:45] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [247:51] ==> val vaultStates: (Root<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Root<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'get' @ [247:63] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [247:86] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'txId' @ [247:114] ==> @Column public final var txId: String defined in net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote[PropertyDescriptorImpl]

'name' @ [247:119] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'txnId' @ [247:126] ==> value-parameter txnId: SecureHash defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[ValueParameterDescriptorImpl]

'toString' @ [247:132] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'criteriaQuery' @ [248:9] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'where' @ [248:23] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in javax.persistence.criteria.CriteriaQuery[JavaMethodDescriptor]

'txIdPredicate' @ [248:29] ==> val txIdPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'session' @ [249:23] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'createQuery' @ [249:31] ==> public abstract fun <T : (Any..Any?)> createQuery(p0: (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?)): (Query<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..Query<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultTxnNote

'criteriaQuery' @ [249:43] ==> val criteriaQuery: (CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..CriteriaQuery<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'resultList' @ [249:58] ==> public final val <R : (Any..Any?)> Query<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>.resultList: (MutableList<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..List<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?)[MyPropertyDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote..net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote?)

'results' @ [250:16] ==> val results: (MutableList<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>..List<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes[LocalVariableDescriptor]

'asIterable' @ [250:24] ==> @InlineOnly public inline fun <T> Iterable<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>.asIterable(): Iterable<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote..net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote?)

'map' @ [250:37] ==> public inline fun <T, R> Iterable<(VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)>.map(transform: ((VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote..net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote?)
    <R> -> String

'it' @ [250:43] ==> value-parameter it: (VaultSchemaV1.VaultTxnNote..VaultSchemaV1.VaultTxnNote?) defined in net.corda.node.services.vault.NodeVaultService.getTransactionNotes.<anonymous>[ValueParameterDescriptorImpl]

'note' @ [250:46] ==> @Column public final var note: String defined in net.corda.node.services.vault.VaultSchemaV1.VaultTxnNote[PropertyDescriptorImpl]

'Throws' @ [253:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StatesNotAvailableException' @ [253:13] ==> public constructor StatesNotAvailableException(message: String?, cause: Throwable? = ...) defined in net.corda.core.node.services.StatesNotAvailableException[DeserializedClassConstructorDescriptor]

'services' @ [255:33] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [255:42] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [255:48] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [257:27] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [257:54] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [257:64] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [258:35] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'criteriaBuilder' @ [258:43] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

'criteriaBuilder' @ [259:34] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'createCriteriaUpdate' @ [259:50] ==> public abstract fun <T : (Any..Any?)> createCriteriaUpdate(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [259:71] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [259:85] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [259:104] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaUpdate' @ [260:31] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'from' @ [260:46] ==> public abstract fun from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'VaultSchemaV1' @ [260:51] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [260:65] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [260:84] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [261:42] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'equal' @ [261:58] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [261:64] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [261:76] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [261:99] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [261:113] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [261:126] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [261:138] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'Vault' @ [261:145] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'UNCONSUMED' @ [261:163] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [262:35] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'or' @ [262:51] ==> public abstract fun or(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [262:54] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [262:66] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [262:78] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [262:92] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [262:105] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [262:112] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'isNull' @ [262:118] ==> public final val <X : (Any..Any?)> Path<(Any..Any?)>.isNull: (Predicate..Predicate?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'criteriaBuilder' @ [263:35] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'equal' @ [263:51] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [263:57] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [263:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [263:81] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [263:95] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [263:108] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [263:115] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [263:122] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'toString' @ [263:129] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'stateRefs' @ [264:39] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'map' @ [264:49] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> PersistentStateRef

'PersistentStateRef' @ [264:55] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [264:74] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockReserve.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [264:77] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'bytes' @ [264:84] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'toHexString' @ [264:90] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [264:105] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockReserve.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [264:108] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'vaultStates' @ [265:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [265:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [265:68] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [265:82] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateRef' @ [265:95] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'name' @ [265:104] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [266:38] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'and' @ [266:54] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKey' @ [266:58] ==> val compositeKey: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'`in`' @ [266:71] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefs' @ [266:76] ==> val persistentStateRefs: List<PersistentStateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'criteriaUpdate' @ [267:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'set' @ [267:28] ==> public abstract operator fun <Y : (Any..Any?), X : (String..String?)> set(p0: (Path<(String..String?)>..Path<(String..String?)>?), p1: (String..String?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String
    <X : (Y..Y?)> -> String

'vaultStates' @ [267:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [267:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [267:56] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [267:70] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [267:83] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [267:90] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [267:97] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'toString' @ [267:104] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'criteriaUpdate' @ [268:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'set' @ [268:28] ==> public abstract operator fun <Y : (Any..Any?), X : (Instant..Instant?)> set(p0: (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?), p1: (Instant..Instant?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant
    <X : (Y..Y?)> -> Instant

'vaultStates' @ [268:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [268:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant

'VaultSchemaV1' @ [268:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [268:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockUpdateTime' @ [268:84] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [268:99] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'softLockTimestamp' @ [268:106] ==> val softLockTimestamp: (Instant..Instant?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'criteriaUpdate' @ [269:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'where' @ [269:28] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'stateStatusPredication' @ [269:34] ==> val stateStatusPredication: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'lockIdPredicate' @ [269:58] ==> val lockIdPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'stateRefsPredicate' @ [269:75] ==> val stateRefsPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'session' @ [270:31] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'createQuery' @ [270:39] ==> public abstract fun createQuery(p0: raw (CriteriaUpdate<(Any..Any?)>..CriteriaUpdate<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'criteriaUpdate' @ [270:51] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'executeUpdate' @ [270:67] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

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

                // ambiguity between set
                criteriaRevertUpdate.set<Any>(vaultStatesRevert.get<String>(VaultSchemaV1.VaultStates::lockId.name), criteriaBuilder.nullLiteral(String::class.java))
                criteriaRevertUpdate.where(lockUpdateTime, lockIdPredicateRevert, stateRefsPredicateRevert)
                val revertUpdatedRows = session.createQuery(criteriaRevertUpdate).executeUpdate()
                if (revertUpdatedRows > 0) {
                    log.trace("Reverting $revertUpdatedRows partially soft locked states for $lockId")
                }
                throw StatesNotAvailableException("Attempted to reserve $stateRefs for $lockId but only $updatedRows rows available")
            }' @ [271:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'updatedRows' @ [271:17] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'updatedRows' @ [271:36] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'stateRefs' @ [271:51] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'size' @ [271:61] ==> public open val size: Int defined in net.corda.core.utilities.NonEmptySet[DeserializedPropertyDescriptor]

'log' @ [272:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [272:21] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'lockId' @ [272:60] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'stateRefs' @ [272:69] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'FlowStateMachineImpl' @ [273:17] ==> public companion object defined in net.corda.node.services.statemachine.FlowStateMachineImpl[FakeCallableDescriptorForObject]

'currentStateMachine' @ [273:38] ==> public final fun currentStateMachine(): FlowStateMachineImpl<*>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.Companion[SimpleFunctionDescriptorImpl]

'hasSoftLockedStates' @ [273:61] ==> internal final var hasSoftLockedStates: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'criteriaBuilder' @ [276:44] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'createCriteriaUpdate' @ [276:60] ==> public abstract fun <T : (Any..Any?)> createCriteriaUpdate(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [276:81] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [276:95] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [276:114] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaRevertUpdate' @ [277:41] ==> val criteriaRevertUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'from' @ [277:62] ==> public abstract fun from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'VaultSchemaV1' @ [277:67] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [277:81] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [277:100] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [278:45] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'equal' @ [278:61] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStatesRevert' @ [278:67] ==> val vaultStatesRevert: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [278:85] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [278:97] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [278:111] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [278:124] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [278:131] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [278:138] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'toString' @ [278:145] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'criteriaBuilder' @ [279:38] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'equal' @ [279:54] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStatesRevert' @ [279:60] ==> val vaultStatesRevert: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [279:78] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [279:91] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [279:105] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockUpdateTime' @ [279:118] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [279:133] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'softLockTimestamp' @ [279:140] ==> val softLockTimestamp: (Instant..Instant?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'stateRefs' @ [280:49] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'map' @ [280:59] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> PersistentStateRef

'PersistentStateRef' @ [280:65] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [280:84] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockReserve.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [280:87] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'bytes' @ [280:94] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'toHexString' @ [280:100] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [280:115] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockReserve.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [280:118] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'vaultStatesRevert' @ [281:42] ==> val vaultStatesRevert: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [281:60] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [281:84] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [281:98] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateRef' @ [281:111] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'name' @ [281:120] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [282:48] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'and' @ [282:64] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKeyRevert' @ [282:68] ==> val compositeKeyRevert: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'`in`' @ [282:87] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefsRevert' @ [282:92] ==> val persistentStateRefsRevert: List<PersistentStateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'criteriaRevertUpdate' @ [285:17] ==> val criteriaRevertUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'set' @ [285:38] ==> public abstract operator fun <Y : (Any..Any?)> set(p0: (Path<(String..String?)>..Path<(String..String?)>?), p1: (Expression<out (String..String?)>..Expression<out (String..String?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'vaultStatesRevert' @ [285:47] ==> val vaultStatesRevert: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'get' @ [285:65] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [285:77] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [285:91] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [285:104] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [285:111] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [285:118] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'nullLiteral' @ [285:134] ==> public abstract fun <T : (Any..Any?)> nullLiteral(p0: (Class<(String..String?)>..Class<(String..String?)>?)): (Expression<(String..String?)>..Expression<(String..String?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'String' @ [285:146] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [285:160] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'criteriaRevertUpdate' @ [286:17] ==> val criteriaRevertUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'where' @ [286:38] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'lockUpdateTime' @ [286:44] ==> val lockUpdateTime: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'lockIdPredicateRevert' @ [286:60] ==> val lockIdPredicateRevert: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'stateRefsPredicateRevert' @ [286:83] ==> val stateRefsPredicateRevert: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'session' @ [287:41] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'createQuery' @ [287:49] ==> public abstract fun createQuery(p0: raw (CriteriaUpdate<(Any..Any?)>..CriteriaUpdate<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'criteriaRevertUpdate' @ [287:61] ==> val criteriaRevertUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'executeUpdate' @ [287:83] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

'revertUpdatedRows' @ [288:21] ==> val revertUpdatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'log' @ [289:21] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [289:25] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'revertUpdatedRows' @ [289:43] ==> val revertUpdatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'lockId' @ [289:95] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'StatesNotAvailableException' @ [291:23] ==> public constructor StatesNotAvailableException(message: String?, cause: Throwable? = ...) defined in net.corda.core.node.services.StatesNotAvailableException[DeserializedClassConstructorDescriptor]

'stateRefs' @ [291:74] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'lockId' @ [291:89] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'updatedRows' @ [291:106] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'log' @ [294:13] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'error' @ [294:17] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'lockId' @ [294:83] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'stateRefs' @ [294:95] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[ValueParameterDescriptorImpl]

'e' @ [295:22] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'e' @ [297:17] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'cause' @ [297:19] ==> public open val cause: Throwable? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [297:64] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'cause' @ [297:66] ==> public open val cause: Throwable? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [298:19] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockReserve[LocalVariableDescriptor]

'services' @ [303:33] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'clock' @ [303:42] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [303:48] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'DatabaseTransactionManager' @ [304:23] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [304:50] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[SimpleFunctionDescriptorImpl]

'session' @ [304:60] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[PropertyDescriptorImpl]

'session' @ [305:31] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'criteriaBuilder' @ [305:39] ==> public final val Session.criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?)[MyPropertyDescriptor]

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
        }' @ [306:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'stateRefs' @ [306:13] ==> value-parameter stateRefs: NonEmptySet<StateRef>? defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'criteriaBuilder' @ [307:34] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'createCriteriaUpdate' @ [307:50] ==> public abstract fun <T : (Any..Any?)> createCriteriaUpdate(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [307:71] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [307:85] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [307:104] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaUpdate' @ [308:31] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'from' @ [308:46] ==> public abstract fun from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'VaultSchemaV1' @ [308:51] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [308:65] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [308:84] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [309:42] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'equal' @ [309:58] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [309:64] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [309:76] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [309:99] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [309:113] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [309:126] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [309:138] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'Vault' @ [309:145] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'UNCONSUMED' @ [309:163] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [310:35] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'equal' @ [310:51] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [310:57] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [310:69] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [310:81] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [310:95] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [310:108] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [310:115] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [310:122] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'toString' @ [310:129] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'criteriaUpdate' @ [311:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'set' @ [311:28] ==> public abstract operator fun <Y : (Any..Any?)> set(p0: (Path<(String..String?)>..Path<(String..String?)>?), p1: (Expression<out (String..String?)>..Expression<out (String..String?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'vaultStates' @ [311:40] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [311:52] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [311:64] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [311:78] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [311:91] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [311:98] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [311:105] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'nullLiteral' @ [311:121] ==> public abstract fun <T : (Any..Any?)> nullLiteral(p0: (Class<(String..String?)>..Class<(String..String?)>?)): (Expression<(String..String?)>..Expression<(String..String?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'String' @ [311:133] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [311:147] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'criteriaUpdate' @ [312:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'set' @ [312:28] ==> public abstract operator fun <Y : (Any..Any?), X : (Instant..Instant?)> set(p0: (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?), p1: (Instant..Instant?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant
    <X : (Y..Y?)> -> Instant

'vaultStates' @ [312:32] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [312:44] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant

'VaultSchemaV1' @ [312:57] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [312:71] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockUpdateTime' @ [312:84] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [312:99] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'softLockTimestamp' @ [312:106] ==> val softLockTimestamp: (Instant..Instant?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'criteriaUpdate' @ [313:13] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'where' @ [313:28] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'stateStatusPredication' @ [313:34] ==> val stateStatusPredication: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'lockIdPredicate' @ [313:58] ==> val lockIdPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'session' @ [314:26] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'createQuery' @ [314:34] ==> public abstract fun createQuery(p0: raw (CriteriaUpdate<(Any..Any?)>..CriteriaUpdate<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'criteriaUpdate' @ [314:46] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'executeUpdate' @ [314:62] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

'update' @ [315:17] ==> val update: Int defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'log' @ [316:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [316:21] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'update' @ [316:39] ==> val update: Int defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'lockId' @ [316:70] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'criteriaBuilder' @ [320:38] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'createCriteriaUpdate' @ [320:54] ==> public abstract fun <T : (Any..Any?)> createCriteriaUpdate(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VaultStates

'VaultSchemaV1' @ [320:75] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [320:89] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [320:108] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaUpdate' @ [321:35] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'from' @ [321:50] ==> public abstract fun from(p0: (Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Class<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?)): (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'VaultSchemaV1' @ [321:55] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [321:69] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'java' @ [321:88] ==> public val <T> KClass<VaultSchemaV1.VaultStates>.java: Class<VaultSchemaV1.VaultStates> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VaultStates

'criteriaBuilder' @ [322:46] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'equal' @ [322:62] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [322:68] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [322:80] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [322:103] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [322:117] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateStatus' @ [322:130] ==> @Column public final var stateStatus: Vault.StateStatus defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [322:142] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'Vault' @ [322:149] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'UNCONSUMED' @ [322:167] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'criteriaBuilder' @ [323:39] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'equal' @ [323:55] ==> public abstract fun equal(p0: (Expression<*>..Expression<*>?), p1: (Any..Any?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'vaultStates' @ [323:61] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [323:73] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [323:85] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [323:99] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [323:112] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [323:119] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'lockId' @ [323:126] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'toString' @ [323:133] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'stateRefs' @ [324:43] ==> value-parameter stateRefs: NonEmptySet<StateRef>? defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'map' @ [324:53] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> PersistentStateRef): List<PersistentStateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> PersistentStateRef

'PersistentStateRef' @ [324:59] ==> public constructor PersistentStateRef(txId: String? = ..., index: Int? = ...) defined in net.corda.core.schemas.PersistentStateRef[DeserializedClassConstructorDescriptor]

'it' @ [324:78] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockRelease.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [324:81] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'bytes' @ [324:88] ==> public open val bytes: ByteArray defined in net.corda.core.crypto.SecureHash[DeserializedPropertyDescriptor]

'toHexString' @ [324:94] ==> public fun ByteArray.toHexString(): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [324:109] ==> value-parameter it: StateRef defined in net.corda.node.services.vault.NodeVaultService.softLockRelease.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [324:112] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'vaultStates' @ [325:36] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [325:48] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'VaultSchemaV1' @ [325:72] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [325:86] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'stateRef' @ [325:99] ==> @field:EmbeddedId public final var stateRef: PersistentStateRef? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[DeserializedPropertyDescriptor]

'name' @ [325:108] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [326:42] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'and' @ [326:58] ==> public abstract fun and(vararg p0: (Predicate..Predicate?)): (Predicate..Predicate?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]

'compositeKey' @ [326:62] ==> val compositeKey: (Path<(Any..Any?)>..Path<(Any..Any?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'`in`' @ [326:75] ==> public abstract fun `in`(p0: (MutableCollection<*>..Collection<*>?)): (Predicate..Predicate?) defined in javax.persistence.criteria.Path[JavaMethodDescriptor]

'persistentStateRefs' @ [326:80] ==> val persistentStateRefs: List<PersistentStateRef> defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'criteriaUpdate' @ [327:17] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'set' @ [327:32] ==> public abstract operator fun <Y : (Any..Any?)> set(p0: (Path<(String..String?)>..Path<(String..String?)>?), p1: (Expression<out (String..String?)>..Expression<out (String..String?)>?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'vaultStates' @ [327:44] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [327:56] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(String..String?)>..Path<(String..String?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> String

'VaultSchemaV1' @ [327:68] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [327:82] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockId' @ [327:95] ==> @Column public final var lockId: String? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [327:102] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'criteriaBuilder' @ [327:109] ==> val criteriaBuilder: (CriteriaBuilder..CriteriaBuilder?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'nullLiteral' @ [327:125] ==> public abstract fun <T : (Any..Any?)> nullLiteral(p0: (Class<(String..String?)>..Class<(String..String?)>?)): (Expression<(String..String?)>..Expression<(String..String?)>?) defined in javax.persistence.criteria.CriteriaBuilder[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'String' @ [327:137] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [327:151] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'criteriaUpdate' @ [328:17] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'set' @ [328:32] ==> public abstract operator fun <Y : (Any..Any?), X : (Instant..Instant?)> set(p0: (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?), p1: (Instant..Instant?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant
    <X : (Y..Y?)> -> Instant

'vaultStates' @ [328:36] ==> val vaultStates: (Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..Root<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'get' @ [328:48] ==> public abstract fun <Y : (Any..Any?)> get(p0: (String..String?)): (Path<(Instant..Instant?)>..Path<(Instant..Instant?)>?) defined in javax.persistence.criteria.Root[JavaMethodDescriptor]
Inferred types:
    <Y : (Any..Any?)> -> Instant

'VaultSchemaV1' @ [328:61] ==> @CordaSerializable public object VaultSchemaV1 : MappedSchema defined in net.corda.node.services.vault in file VaultSchema.kt[FakeCallableDescriptorForObject]

'VaultStates' @ [328:75] ==> public constructor VaultStates(notary: AbstractParty, contractStateClassName: String, contractState: ByteArray, stateStatus: Vault.StateStatus, recordedTime: Instant, consumedTime: Instant? = ..., lockId: String? = ..., lockUpdateTime: Instant? = ...) defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[ClassConstructorDescriptorImpl]

'lockUpdateTime' @ [328:88] ==> @Column public final var lockUpdateTime: Instant? defined in net.corda.node.services.vault.VaultSchemaV1.VaultStates[PropertyDescriptorImpl]

'name' @ [328:103] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'softLockTimestamp' @ [328:110] ==> val softLockTimestamp: (Instant..Instant?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'criteriaUpdate' @ [329:17] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'where' @ [329:32] ==> public abstract fun where(vararg p0: (Predicate..Predicate?)): (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in javax.persistence.criteria.CriteriaUpdate[JavaMethodDescriptor]

'stateStatusPredication' @ [329:38] ==> val stateStatusPredication: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'lockIdPredicate' @ [329:62] ==> val lockIdPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'stateRefsPredicate' @ [329:79] ==> val stateRefsPredicate: (Predicate..Predicate?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'session' @ [330:35] ==> val session: Session defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'createQuery' @ [330:43] ==> public abstract fun createQuery(p0: raw (CriteriaUpdate<(Any..Any?)>..CriteriaUpdate<*>?)): raw (Query<(Any..Any?)>..Query<*>?) defined in org.hibernate.Session[JavaMethodDescriptor]

'criteriaUpdate' @ [330:55] ==> val criteriaUpdate: (CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>..CriteriaUpdate<(VaultSchemaV1.VaultStates..VaultSchemaV1.VaultStates?)>?) defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'executeUpdate' @ [330:71] ==> public abstract fun executeUpdate(): Int defined in org.hibernate.query.Query[JavaMethodDescriptor]

'updatedRows' @ [331:21] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'log' @ [332:21] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'trace' @ [332:25] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'updatedRows' @ [332:43] ==> val updatedRows: Int defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'lockId' @ [332:79] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'stateRefs' @ [332:101] ==> value-parameter stateRefs: NonEmptySet<StateRef>? defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'log' @ [335:17] ==> public final val log: Logger defined in net.corda.node.services.vault.NodeVaultService.Companion[PropertyDescriptorImpl]

'error' @ [335:21] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'lockId' @ [335:87] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'stateRefs' @ [335:99] ==> value-parameter stateRefs: NonEmptySet<StateRef>? defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[ValueParameterDescriptorImpl]

'e' @ [336:22] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'e' @ [338:23] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.vault.NodeVaultService.softLockRelease[LocalVariableDescriptor]

'Suspendable' @ [343:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [344:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StatesNotAvailableException' @ [344:13] ==> public constructor StatesNotAvailableException(message: String?, cause: Throwable? = ...) defined in net.corda.core.node.services.StatesNotAvailableException[DeserializedClassConstructorDescriptor]

'amount' @ [349:13] ==> value-parameter amount: Amount<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'quantity' @ [349:20] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'emptyList' @ [350:20] ==> public fun <T> emptyList(): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'Standard' @ [354:43] ==> public constructor Standard(attribute: Sort.Attribute) defined in net.corda.core.node.services.vault.SortAttribute.Standard[DeserializedClassConstructorDescriptor]

'STATE_REF' @ [354:78] ==> enum entry STATE_REF defined in net.corda.core.node.services.vault.Sort.CommonStateAttribute[FakeCallableDescriptorForObject]

'Sort' @ [355:22] ==> public constructor Sort(columns: Collection<Sort.SortColumn>) defined in net.corda.core.node.services.vault.Sort[DeserializedClassConstructorDescriptor]

'setOf' @ [355:27] ==> public fun <T> setOf(element: Sort.SortColumn): Set<Sort.SortColumn> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SortColumn

'SortColumn' @ [355:38] ==> public constructor SortColumn(sortAttribute: SortAttribute, direction: Sort.Direction = ...) defined in net.corda.core.node.services.vault.Sort.SortColumn[DeserializedClassConstructorDescriptor]

'sortAttribute' @ [355:49] ==> val sortAttribute: SortAttribute.Standard defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'ASC' @ [355:79] ==> enum entry ASC defined in net.corda.core.node.services.vault.Sort.Direction[FakeCallableDescriptorForObject]

'VaultQueryCriteria' @ [356:46] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'setOf' @ [357:38] ==> public fun <T> setOf(element: Class<out T>): Set<Class<out T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out T>

'contractType' @ [357:44] ==> value-parameter contractType: Class<out T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'SoftLockingCondition' @ [358:54] ==> public constructor SoftLockingCondition(type: QueryCriteria.SoftLockingType, lockIds: List<UUID> = ...) defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingCondition[DeserializedClassConstructorDescriptor]

'UNLOCKED_AND_SPECIFIED' @ [358:105] ==> enum entry UNLOCKED_AND_SPECIFIED defined in net.corda.core.node.services.vault.QueryCriteria.SoftLockingType[FakeCallableDescriptorForObject]

'listOf' @ [358:129] ==> public fun <T> listOf(element: UUID): List<UUID> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UUID

'lockId' @ [358:136] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'services' @ [359:23] ==> private final val services: ServiceHub defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'vaultQueryService' @ [359:32] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [359:50] ==> public open fun <T : ContractState> queryBy(contractType: Class<out T>, criteria: QueryCriteria, sorting: Sort): Vault.Page<T> defined in net.corda.core.node.services.VaultQueryService[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> T

'contractType' @ [359:58] ==> value-parameter contractType: Class<out T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'enrichedCriteria' @ [359:72] ==> val enrichedCriteria: QueryCriteria.VaultQueryCriteria defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'and' @ [359:89] ==> public final fun and(criteria: QueryCriteria): QueryCriteria defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedSimpleFunctionDescriptor]

'eligibleStatesQuery' @ [359:93] ==> value-parameter eligibleStatesQuery: QueryCriteria defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'sorter' @ [359:115] ==> val sorter: Sort defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'mutableListOf' @ [362:29] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'results' @ [363:23] ==> val results: Vault.Page<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'states' @ [363:31] ==> public final val states: List<StateAndRef<T>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'state' @ [364:36] ==> val state: StateAndRef<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'state' @ [364:42] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [364:48] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [364:53] ==> public abstract val amount: Amount<Issued<U>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'token' @ [364:60] ==> public final val token: Issued<U> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuedAssetToken' @ [365:17] ==> val issuedAssetToken: Issued<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'product' @ [365:34] ==> public final val product: U defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'amount' @ [365:45] ==> value-parameter amount: Amount<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'token' @ [365:52] ==> public final val token: U defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'claimedStates' @ [366:17] ==> val claimedStates: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'state' @ [366:34] ==> val state: StateAndRef<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'claimedAmount' @ [367:17] ==> var claimedAmount: Long defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'state' @ [367:34] ==> val state: StateAndRef<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'state' @ [367:40] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [367:46] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [367:51] ==> public abstract val amount: Amount<Issued<U>> defined in net.corda.core.contracts.FungibleAsset[DeserializedPropertyDescriptor]

'quantity' @ [367:58] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'claimedAmount' @ [368:21] ==> var claimedAmount: Long defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'amount' @ [368:37] ==> value-parameter amount: Amount<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'quantity' @ [368:44] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'claimedStates' @ [373:13] ==> val claimedStates: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'isEmpty' @ [373:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'claimedAmount' @ [373:40] ==> var claimedAmount: Long defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'amount' @ [373:56] ==> value-parameter amount: Amount<U> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'quantity' @ [373:63] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'emptyList' @ [374:20] ==> public fun <T> emptyList(): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'softLockReserve' @ [376:9] ==> @Throws public open fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.node.services.vault.NodeVaultService[SimpleFunctionDescriptorImpl]

'lockId' @ [376:25] ==> value-parameter lockId: UUID defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[ValueParameterDescriptorImpl]

'claimedStates' @ [376:33] ==> val claimedStates: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'map' @ [376:47] ==> public inline fun <T, R> Iterable<StateAndRef<T>>.map(transform: (StateAndRef<T>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>
    <R> -> StateRef

'it' @ [376:53] ==> value-parameter it: StateAndRef<T> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [376:56] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'toNonEmptySet' @ [376:62] ==> public fun <T> Collection<StateRef>.toNonEmptySet(): NonEmptySet<StateRef> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'claimedStates' @ [377:16] ==> val claimedStates: MutableList<StateAndRef<T>> defined in net.corda.node.services.vault.NodeVaultService.tryLockFungibleStatesForSpending[LocalVariableDescriptor]

'mutableMapOf' @ [381:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<StateRef, Class<out UpgradedContract<*, *>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> StateRef
    <V> -> Class<out UpgradedContract<*, *>>

'authorisedUpgrade' @ [383:64] ==> private final val authorisedUpgrade: MutableMap<StateRef, Class<out UpgradedContract<*, *>>> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'ref' @ [383:82] ==> value-parameter ref: StateRef defined in net.corda.node.services.vault.NodeVaultService.getAuthorisedContractUpgrade[ValueParameterDescriptorImpl]

'upgradedContractClass' @ [386:23] ==> value-parameter upgradedContractClass: Class<out UpgradedContract<*, *>> defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'newInstance' @ [386:45] ==> @CallerSensitive public open fun newInstance(): (UpgradedContract<*, *>..UpgradedContract<*, *>?) defined in java.lang.Class[JavaMethodDescriptor]

'upgrade' @ [387:13] ==> val upgrade: (UpgradedContract<*, *>..UpgradedContract<*, *>?) defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[LocalVariableDescriptor]

'legacyContract' @ [387:21] ==> public abstract val legacyContract: Class<out Contract> defined in net.corda.core.contracts.UpgradedContract[DeserializedPropertyDescriptor]

'stateAndRef' @ [387:39] ==> value-parameter stateAndRef: StateAndRef<*> defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'state' @ [387:51] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [387:57] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'contract' @ [387:62] ==> public abstract val contract: Contract defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'javaClass' @ [387:71] ==> public val <T : Any> Contract.javaClass: Class<Contract> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Contract

'IllegalArgumentException' @ [388:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'authorisedUpgrade' @ [390:9] ==> private final val authorisedUpgrade: MutableMap<StateRef, Class<out UpgradedContract<*, *>>> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'put' @ [390:27] ==> public abstract fun put(key: StateRef, value: Class<out UpgradedContract<*, *>>): Class<out UpgradedContract<*, *>>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'stateAndRef' @ [390:31] ==> value-parameter stateAndRef: StateAndRef<*> defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'ref' @ [390:43] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'upgradedContractClass' @ [390:48] ==> value-parameter upgradedContractClass: Class<out UpgradedContract<*, *>> defined in net.corda.node.services.vault.NodeVaultService.authoriseContractUpgrade[ValueParameterDescriptorImpl]

'authorisedUpgrade' @ [394:9] ==> private final val authorisedUpgrade: MutableMap<StateRef, Class<out UpgradedContract<*, *>>> defined in net.corda.node.services.vault.NodeVaultService[PropertyDescriptorImpl]

'remove' @ [394:27] ==> public abstract fun remove(key: StateRef): Class<out UpgradedContract<*, *>>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'stateAndRef' @ [394:34] ==> value-parameter stateAndRef: StateAndRef<*> defined in net.corda.node.services.vault.NodeVaultService.deauthoriseContractUpgrade[ValueParameterDescriptorImpl]

'ref' @ [394:46] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'VisibleForTesting' @ [397:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'when (state) {
        is OwnableState -> state.owner.owningKey.containsAny(ourKeys)
        is LinearState -> state.isRelevant(ourKeys)
        else -> ourKeys.intersect(state.participants.map { it.owningKey }).isNotEmpty()
    }' @ [398:78] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'state' @ [398:84] ==> value-parameter state: ContractState defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'state' @ [399:28] ==> value-parameter state: ContractState defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'owner' @ [399:34] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.OwnableState[DeserializedPropertyDescriptor]

'owningKey' @ [399:40] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'containsAny' @ [399:50] ==> public fun PublicKey.containsAny(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'ourKeys' @ [399:62] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'state' @ [400:27] ==> value-parameter state: ContractState defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'isRelevant' @ [400:33] ==> public abstract fun isRelevant(ourKeys: Set<PublicKey>): Boolean defined in net.corda.core.contracts.LinearState[DeserializedSimpleFunctionDescriptor]

'ourKeys' @ [400:44] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'ourKeys' @ [401:17] ==> value-parameter ourKeys: Set<PublicKey> defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'intersect' @ [401:25] ==> public infix fun <T> Iterable<PublicKey>.intersect(other: Iterable<PublicKey>): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'state' @ [401:35] ==> value-parameter state: ContractState defined in net.corda.node.services.vault.NodeVaultService.isRelevant[ValueParameterDescriptorImpl]

'participants' @ [401:41] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'map' @ [401:54] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [401:60] ==> value-parameter it: AbstractParty defined in net.corda.node.services.vault.NodeVaultService.isRelevant.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [401:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'isNotEmpty' @ [401:76] ==> @InlineOnly public inline fun <T> Collection<PublicKey>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

