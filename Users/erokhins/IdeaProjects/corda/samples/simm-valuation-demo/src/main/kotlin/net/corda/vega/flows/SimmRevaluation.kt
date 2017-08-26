'StartableByRPC' @ [18:5] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'SchedulableFlow' @ [19:5] ==> public constructor SchedulableFlow() defined in net.corda.core.flows.SchedulableFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [20:80] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [21:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'serviceHub' @ [23:31] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmRevaluation.Initiator[DeserializedPropertyDescriptor]

'vaultQueryService' @ [23:42] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [23:60] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<PortfolioState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> PortfolioState

'VaultQueryCriteria' @ [23:84] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'listOf' @ [23:115] ==> public fun <T> listOf(element: StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'curStateRef' @ [23:122] ==> public final val curStateRef: StateRef defined in net.corda.vega.flows.SimmRevaluation.Initiator[PropertyDescriptorImpl]

'states' @ [23:137] ==> public final val states: List<StateAndRef<PortfolioState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'single' @ [23:144] ==> public fun <T> List<StateAndRef<PortfolioState>>.single(): StateAndRef<PortfolioState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<PortfolioState>

'stateAndRef' @ [24:28] ==> val stateAndRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmRevaluation.Initiator.call[LocalVariableDescriptor]

'state' @ [24:40] ==> public final val state: TransactionState<PortfolioState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [24:46] ==> public final val data: PortfolioState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'serviceHub' @ [25:30] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmRevaluation.Initiator[DeserializedPropertyDescriptor]

'myInfo' @ [25:41] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [25:48] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'myIdentity' @ [26:17] ==> val myIdentity: Party defined in net.corda.vega.flows.SimmRevaluation.Initiator.call[LocalVariableDescriptor]

'curState' @ [26:31] ==> val curState: PortfolioState defined in net.corda.vega.flows.SimmRevaluation.Initiator.call[LocalVariableDescriptor]

'participants' @ [26:40] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'serviceHub' @ [27:34] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmRevaluation.Initiator[DeserializedPropertyDescriptor]

'identityService' @ [27:45] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [27:61] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'curState' @ [27:80] ==> val curState: PortfolioState defined in net.corda.vega.flows.SimmRevaluation.Initiator.call[LocalVariableDescriptor]

'participants' @ [27:89] ==> public open val participants: List<AbstractParty> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'require' @ [28:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [28:25] ==> val otherParty: Party? defined in net.corda.vega.flows.SimmRevaluation.Initiator.call[LocalVariableDescriptor]

'subFlow' @ [29:17] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<RevisionedState<PortfolioState.Update>>): RevisionedState<PortfolioState.Update> defined in net.corda.vega.flows.SimmRevaluation.Initiator[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> RevisionedState<Update>

'Requester' @ [29:34] ==> public constructor Requester(otherParty: Party, valuationDate: LocalDate, existing: StateAndRef<PortfolioState>?) defined in net.corda.vega.flows.SimmFlow.Requester[ClassConstructorDescriptorImpl]

'otherParty' @ [29:44] ==> val otherParty: Party? defined in net.corda.vega.flows.SimmRevaluation.Initiator.call[LocalVariableDescriptor]

'valuationDate' @ [29:58] ==> public final val valuationDate: LocalDate defined in net.corda.vega.flows.SimmRevaluation.Initiator[PropertyDescriptorImpl]

'stateAndRef' @ [29:73] ==> val stateAndRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmRevaluation.Initiator.call[LocalVariableDescriptor]

