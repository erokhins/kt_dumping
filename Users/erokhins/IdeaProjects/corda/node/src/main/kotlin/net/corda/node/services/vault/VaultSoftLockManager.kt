'loggerFor' @ [18:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> VaultSoftLockManager

'smm' @ [22:9] ==> value-parameter smm: StateMachineManager defined in net.corda.node.services.vault.VaultSoftLockManager.<init>[ValueParameterDescriptorImpl]

'changes' @ [22:13] ==> public final val changes: Observable<StateMachineManager.Change> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'subscribe' @ [22:21] ==> public final fun subscribe(p0: (((StateMachineManager.Change..StateMachineManager.Change?)) -> Unit..(((StateMachineManager.Change..StateMachineManager.Change?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'change' @ [23:17] ==> value-parameter change: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>[ValueParameterDescriptorImpl]

'==' @ [23:65] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'FlowStateMachineImpl' @ [23:66] ==> public companion object defined in net.corda.node.services.statemachine.FlowStateMachineImpl[FakeCallableDescriptorForObject]

'currentStateMachine' @ [23:87] ==> public final fun currentStateMachine(): FlowStateMachineImpl<*>? defined in net.corda.node.services.statemachine.FlowStateMachineImpl.Companion[SimpleFunctionDescriptorImpl]

'hasSoftLockedStates' @ [23:111] ==> internal final var hasSoftLockedStates: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'log' @ [24:17] ==> public final val log: Logger defined in net.corda.node.services.vault.VaultSoftLockManager.Companion[PropertyDescriptorImpl]

'trace' @ [24:21] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'change' @ [24:49] ==> value-parameter change: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>[ValueParameterDescriptorImpl]

'logic' @ [24:56] ==> public abstract val logic: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.Change[PropertyDescriptorImpl]

'javaClass' @ [24:62] ==> public val <T : Any> FlowLogic<Any?>.javaClass: Class<FlowLogic<Any?>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowLogic<Any?>

'change' @ [24:82] ==> value-parameter change: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>[ValueParameterDescriptorImpl]

'unregisterSoftLocks' @ [25:17] ==> private final fun unregisterSoftLocks(id: StateMachineRunId, logic: FlowLogic<*>): Unit defined in net.corda.node.services.vault.VaultSoftLockManager[SimpleFunctionDescriptorImpl]

'change' @ [25:37] ==> value-parameter change: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>[ValueParameterDescriptorImpl]

'logic' @ [25:44] ==> public abstract val logic: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.Change[PropertyDescriptorImpl]

'runId' @ [25:50] ==> public final val runId: StateMachineRunId defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'change' @ [25:57] ==> value-parameter change: (StateMachineManager.Change..StateMachineManager.Change?) defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>[ValueParameterDescriptorImpl]

'logic' @ [25:64] ==> public abstract val logic: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.Change[PropertyDescriptorImpl]

'vault' @ [41:9] ==> public final val vault: VaultService defined in net.corda.node.services.vault.VaultSoftLockManager[PropertyDescriptorImpl]

'rawUpdates' @ [41:15] ==> public abstract val rawUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'subscribe' @ [41:26] ==> public final fun subscribe(p0: (((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> Unit..(((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'component1' @ [41:39] ==> public final operator fun component1(): Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'component2' @ [41:42] ==> public final operator fun component2(): Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'component3' @ [41:52] ==> public final operator fun component3(): UUID? defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'flowId' @ [42:13] ==> val flowId: UUID? defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>[LocalVariableDescriptor]

'let' @ [42:21] ==> @InlineOnly public inline fun <T, R> UUID.let(block: (UUID) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UUID
    <R> -> Unit

'produced' @ [43:21] ==> val produced: Set<StateAndRef<ContractState>> defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [43:30] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<ContractState>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'registerSoftLocks' @ [44:21] ==> private final fun registerSoftLocks(flowId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.node.services.vault.VaultSoftLockManager[SimpleFunctionDescriptorImpl]

'flowId' @ [44:39] ==> val flowId: UUID? defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>[LocalVariableDescriptor]

'produced' @ [44:48] ==> val produced: Set<StateAndRef<ContractState>> defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>[LocalVariableDescriptor]

'map' @ [44:57] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> StateRef

'it' @ [44:63] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.vault.VaultSoftLockManager.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [44:66] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'toNonEmptySet' @ [44:73] ==> public fun <T> Collection<StateRef>.toNonEmptySet(): NonEmptySet<StateRef> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'log' @ [51:9] ==> public final val log: Logger defined in net.corda.node.services.vault.VaultSoftLockManager.Companion[PropertyDescriptorImpl]

'trace' @ [51:13] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'flowId' @ [51:54] ==> value-parameter flowId: UUID defined in net.corda.node.services.vault.VaultSoftLockManager.registerSoftLocks[ValueParameterDescriptorImpl]

'stateRefs' @ [51:73] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.VaultSoftLockManager.registerSoftLocks[ValueParameterDescriptorImpl]

'vault' @ [52:9] ==> public final val vault: VaultService defined in net.corda.node.services.vault.VaultSoftLockManager[PropertyDescriptorImpl]

'softLockReserve' @ [52:15] ==> public abstract fun softLockReserve(lockId: UUID, stateRefs: NonEmptySet<StateRef>): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'flowId' @ [52:31] ==> value-parameter flowId: UUID defined in net.corda.node.services.vault.VaultSoftLockManager.registerSoftLocks[ValueParameterDescriptorImpl]

'stateRefs' @ [52:39] ==> value-parameter stateRefs: NonEmptySet<StateRef> defined in net.corda.node.services.vault.VaultSoftLockManager.registerSoftLocks[ValueParameterDescriptorImpl]

'logic' @ [56:29] ==> value-parameter logic: FlowLogic<*> defined in net.corda.node.services.vault.VaultSoftLockManager.unregisterSoftLocks[ValueParameterDescriptorImpl]

'javaClass' @ [56:35] ==> public val <T : Any> FlowLogic<Any?>.javaClass: Class<FlowLogic<Any?>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowLogic<Any?>

'simpleName' @ [56:45] ==> public final val <T : (Any..Any?)> Class<FlowLogic<Any?>>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FlowLogic<Any?>

'log' @ [57:9] ==> public final val log: Logger defined in net.corda.node.services.vault.VaultSoftLockManager.Companion[PropertyDescriptorImpl]

'trace' @ [57:13] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'flowClassName' @ [57:51] ==> val flowClassName: (String..String?) defined in net.corda.node.services.vault.VaultSoftLockManager.unregisterSoftLocks[LocalVariableDescriptor]

'id' @ [57:80] ==> value-parameter id: StateMachineRunId defined in net.corda.node.services.vault.VaultSoftLockManager.unregisterSoftLocks[ValueParameterDescriptorImpl]

'uuid' @ [57:83] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[DeserializedPropertyDescriptor]

'vault' @ [58:9] ==> public final val vault: VaultService defined in net.corda.node.services.vault.VaultSoftLockManager[PropertyDescriptorImpl]

'softLockRelease' @ [58:15] ==> public abstract fun softLockRelease(lockId: UUID, stateRefs: NonEmptySet<StateRef>? = ...): Unit defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'id' @ [58:31] ==> value-parameter id: StateMachineRunId defined in net.corda.node.services.vault.VaultSoftLockManager.unregisterSoftLocks[ValueParameterDescriptorImpl]

'uuid' @ [58:34] ==> public final val uuid: UUID defined in net.corda.core.flows.StateMachineRunId[DeserializedPropertyDescriptor]

