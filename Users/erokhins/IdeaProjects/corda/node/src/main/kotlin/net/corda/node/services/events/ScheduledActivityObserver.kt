'services' @ [16:9] ==> public final val services: ServiceHubInternal defined in net.corda.node.services.events.ScheduledActivityObserver[PropertyDescriptorImpl]

'vaultService' @ [16:18] ==> public abstract val vaultService: VaultService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'rawUpdates' @ [16:31] ==> public abstract val rawUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[DeserializedPropertyDescriptor]

'subscribe' @ [16:42] ==> public final fun subscribe(p0: (((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> Unit..(((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'component1' @ [16:55] ==> public final operator fun component1(): Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'component2' @ [16:65] ==> public final operator fun component2(): Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedSimpleFunctionDescriptor]

'consumed' @ [17:13] ==> val consumed: Set<StateAndRef<ContractState>> defined in net.corda.node.services.events.ScheduledActivityObserver.<init>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [17:22] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<ContractState>>.forEach(action: (StateAndRef<ContractState>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'services' @ [17:32] ==> public final val services: ServiceHubInternal defined in net.corda.node.services.events.ScheduledActivityObserver[PropertyDescriptorImpl]

'schedulerService' @ [17:41] ==> public abstract val schedulerService: SchedulerService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'unscheduleStateActivity' @ [17:58] ==> public abstract fun unscheduleStateActivity(ref: StateRef): Unit defined in net.corda.node.services.api.SchedulerService[SimpleFunctionDescriptorImpl]

'it' @ [17:82] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.events.ScheduledActivityObserver.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [17:85] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'produced' @ [18:13] ==> val produced: Set<StateAndRef<ContractState>> defined in net.corda.node.services.events.ScheduledActivityObserver.<init>.<anonymous>[LocalVariableDescriptor]

'forEach' @ [18:22] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<ContractState>>.forEach(action: (StateAndRef<ContractState>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'scheduleStateActivity' @ [18:32] ==> private final fun scheduleStateActivity(produced: StateAndRef<ContractState>): Unit defined in net.corda.node.services.events.ScheduledActivityObserver[SimpleFunctionDescriptorImpl]

'it' @ [18:54] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.events.ScheduledActivityObserver.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'produced' @ [23:29] ==> value-parameter produced: StateAndRef<ContractState> defined in net.corda.node.services.events.ScheduledActivityObserver.scheduleStateActivity[ValueParameterDescriptorImpl]

'state' @ [23:38] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [23:44] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'producedState' @ [24:13] ==> val producedState: ContractState defined in net.corda.node.services.events.ScheduledActivityObserver.scheduleStateActivity[LocalVariableDescriptor]

'sandbox' @ [25:31] ==> private final inline fun <T : Any> sandbox(code: () -> Instant?): Instant? defined in net.corda.node.services.events.ScheduledActivityObserver[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Instant

'producedState' @ [25:41] ==> val producedState: ContractState defined in net.corda.node.services.events.ScheduledActivityObserver.scheduleStateActivity[LocalVariableDescriptor]

'nextScheduledActivity' @ [25:55] ==> public abstract fun nextScheduledActivity(thisStateRef: StateRef, flowLogicRefFactory: FlowLogicRefFactory): ScheduledActivity? defined in net.corda.core.contracts.SchedulableState[DeserializedSimpleFunctionDescriptor]

'produced' @ [25:77] ==> value-parameter produced: StateAndRef<ContractState> defined in net.corda.node.services.events.ScheduledActivityObserver.scheduleStateActivity[ValueParameterDescriptorImpl]

'ref' @ [25:86] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'FlowLogicRefFactoryImpl' @ [25:91] ==> public object FlowLogicRefFactoryImpl : SingletonSerializeAsToken, FlowLogicRefFactory defined in net.corda.node.services.statemachine in file FlowLogicRefFactoryImpl.kt[FakeCallableDescriptorForObject]

'scheduledAt' @ [25:117] ==> public open val scheduledAt: Instant defined in net.corda.core.contracts.ScheduledActivity[DeserializedPropertyDescriptor]

'services' @ [26:13] ==> public final val services: ServiceHubInternal defined in net.corda.node.services.events.ScheduledActivityObserver[PropertyDescriptorImpl]

'schedulerService' @ [26:22] ==> public abstract val schedulerService: SchedulerService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'scheduleStateActivity' @ [26:39] ==> public abstract fun scheduleStateActivity(action: ScheduledStateRef): Unit defined in net.corda.node.services.api.SchedulerService[SimpleFunctionDescriptorImpl]

'ScheduledStateRef' @ [26:61] ==> public constructor ScheduledStateRef(ref: StateRef, scheduledAt: Instant) defined in net.corda.core.contracts.ScheduledStateRef[DeserializedClassConstructorDescriptor]

'produced' @ [26:79] ==> value-parameter produced: StateAndRef<ContractState> defined in net.corda.node.services.events.ScheduledActivityObserver.scheduleStateActivity[ValueParameterDescriptorImpl]

'ref' @ [26:88] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'scheduledAt' @ [26:93] ==> val scheduledAt: Instant defined in net.corda.node.services.events.ScheduledActivityObserver.scheduleStateActivity[LocalVariableDescriptor]

'invoke' @ [32:16] ==> public abstract operator fun invoke(): T? defined in kotlin.Function0[FunctionInvokeDescriptor]

