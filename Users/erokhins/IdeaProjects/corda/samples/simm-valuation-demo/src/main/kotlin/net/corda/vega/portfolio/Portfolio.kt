'lazy' @ [22:35] ==> public fun <T> lazy(initializer: () -> List<IRSState>): Lazy<List<IRSState>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<IRSState>

'tradeStateAndRefs' @ [22:42] ==> private final val tradeStateAndRefs: List<StateAndRef<IRSState>> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'map' @ [22:60] ==> public inline fun <T, R> Iterable<StateAndRef<IRSState>>.map(transform: (StateAndRef<IRSState>) -> IRSState): List<IRSState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IRSState>
    <R> -> IRSState

'it' @ [22:66] ==> value-parameter it: StateAndRef<IRSState> defined in net.corda.vega.portfolio.Portfolio.trades.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [22:69] ==> public final val state: TransactionState<IRSState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [22:75] ==> public final val data: IRSState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'lazy' @ [23:34] ==> public fun <T> lazy(initializer: () -> List<SwapData>): Lazy<List<SwapData>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<SwapData>

'trades' @ [23:41] ==> public final val trades: List<IRSState> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'map' @ [23:48] ==> public inline fun <T, R> Iterable<IRSState>.map(transform: (IRSState) -> SwapData): List<SwapData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IRSState
    <R> -> SwapData

'it' @ [23:54] ==> value-parameter it: IRSState defined in net.corda.vega.portfolio.Portfolio.swaps.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'swap' @ [23:57] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'lazy' @ [24:33] ==> public fun <T> lazy(initializer: () -> List<StateRef>): Lazy<List<StateRef>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<StateRef>

'tradeStateAndRefs' @ [24:40] ==> private final val tradeStateAndRefs: List<StateAndRef<IRSState>> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'map' @ [24:58] ==> public inline fun <T, R> Iterable<StateAndRef<IRSState>>.map(transform: (StateAndRef<IRSState>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IRSState>
    <R> -> StateRef

'it' @ [24:64] ==> value-parameter it: StateAndRef<IRSState> defined in net.corda.vega.portfolio.Portfolio.refs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [24:67] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'trades' @ [26:57] ==> public final val trades: List<IRSState> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'map' @ [26:64] ==> public inline fun <T, R> Iterable<IRSState>.map(transform: (IRSState) -> BigDecimal): List<BigDecimal> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IRSState
    <R> -> BigDecimal

'it' @ [26:70] ==> value-parameter it: IRSState defined in net.corda.vega.portfolio.Portfolio.getNotionalForParty.<anonymous>[ValueParameterDescriptorImpl]

'swap' @ [26:73] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'getLegForParty' @ [26:78] ==> public final fun getLegForParty(party: AbstractParty): Leg defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'party' @ [26:93] ==> value-parameter party: Party defined in net.corda.vega.portfolio.Portfolio.getNotionalForParty[ValueParameterDescriptorImpl]

'notional' @ [26:100] ==> public abstract val notional: BigDecimal defined in net.corda.vega.contracts.Leg[PropertyDescriptorImpl]

'sum' @ [26:111] ==> public fun Iterable<BigDecimal>.sum(): BigDecimal defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'copy' @ [29:16] ==> public final fun copy(tradeStateAndRefs: List<StateAndRef<IRSState>> = ..., valuationDate: LocalDate? = ...): Portfolio defined in net.corda.vega.portfolio.Portfolio[SimpleFunctionDescriptorImpl]

'curTrades' @ [29:41] ==> value-parameter curTrades: List<StateAndRef<IRSState>> defined in net.corda.vega.portfolio.Portfolio.update[ValueParameterDescriptorImpl]

'Portfolio' @ [34:12] ==> public constructor Portfolio(tradeStateAndRefs: List<StateAndRef<IRSState>>, valuationDate: LocalDate? = ...) defined in net.corda.vega.portfolio.Portfolio[ClassConstructorDescriptorImpl]

'this' @ [34:22] ==> <this> defined in net.corda.vega.portfolio.toPortfolio[ReceiverParameterDescriptorImpl]

'rpc' @ [38:12] ==> value-parameter rpc: CordaRPCOps defined in net.corda.vega.portfolio.toStateAndRef[ValueParameterDescriptorImpl]

'vaultQueryBy' @ [38:16] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<T> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> T

'VaultQueryCriteria' @ [38:46] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'this' @ [38:77] ==> <this> defined in net.corda.vega.portfolio.toStateAndRef[ReceiverParameterDescriptorImpl]

'states' @ [38:84] ==> public final val states: List<StateAndRef<T>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

