'Path' @ [34:1] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'rpc' @ [36:41] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'nodeIdentity' @ [36:45] ==> public abstract fun nodeIdentity(): NodeInfo defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'legalIdentity' @ [36:60] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'PortfolioApiUtils' @ [37:34] ==> public constructor PortfolioApiUtils(ownParty: Party) defined in net.corda.vega.api.PortfolioApiUtils[ClassConstructorDescriptorImpl]

'ownParty' @ [37:52] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'rpc' @ [40:28] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'vaultQueryBy' @ [40:32] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<T> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> T

'states' @ [40:50] ==> public final val states: List<StateAndRef<T>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'linearStates' @ [43:16] ==> val linearStates: List<StateAndRef<T>> defined in net.corda.vega.api.PortfolioApi.dealsWith[LocalVariableDescriptor]

'filter' @ [43:29] ==> public inline fun <T> Iterable<StateAndRef<T>>.filter(predicate: (StateAndRef<T>) -> Boolean): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'it' @ [43:38] ==> value-parameter it: StateAndRef<T> defined in net.corda.vega.api.PortfolioApi.dealsWith.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [43:41] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [43:47] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'participants' @ [43:52] ==> public abstract val participants: List<AbstractParty> defined in net.corda.finance.contracts.DealState[DeserializedPropertyDescriptor]

'any' @ [43:65] ==> public inline fun <T> Iterable<AbstractParty>.any(predicate: (AbstractParty) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [43:71] ==> value-parameter it: AbstractParty defined in net.corda.vega.api.PortfolioApi.dealsWith.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'party' @ [43:77] ==> value-parameter party: AbstractParty defined in net.corda.vega.api.PortfolioApi.dealsWith[ValueParameterDescriptorImpl]

'rpc' @ [51:26] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'partyFromKey' @ [51:30] ==> public abstract fun partyFromKey(key: PublicKey): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'parsePublicKeyBase58' @ [51:43] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'partyName' @ [51:64] ==> value-parameter partyName: String defined in net.corda.vega.api.PortfolioApi.withParty[ValueParameterDescriptorImpl]

'if (otherParty != null) {
            func(otherParty)
        } else {
            Response.status(Response.Status.NOT_FOUND).entity("Unknown party $partyName").build()
        }' @ [52:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Response, elseBranch: Response): Response[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Response

'otherParty' @ [52:20] ==> val otherParty: Party? defined in net.corda.vega.api.PortfolioApi.withParty[LocalVariableDescriptor]

'invoke' @ [53:13] ==> public abstract operator fun invoke(p1: Party): Response defined in kotlin.Function1[FunctionInvokeDescriptor]

'otherParty' @ [53:18] ==> val otherParty: Party? defined in net.corda.vega.api.PortfolioApi.withParty[LocalVariableDescriptor]

'status' @ [55:22] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'NOT_FOUND' @ [55:45] ==> enum entry NOT_FOUND defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'entity' @ [55:56] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'partyName' @ [55:79] ==> value-parameter partyName: String defined in net.corda.vega.api.PortfolioApi.withParty[ValueParameterDescriptorImpl]

'build' @ [55:91] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'getPortfolioWith' @ [64:25] ==> private final fun getPortfolioWith(party: Party): PortfolioState? defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'party' @ [64:42] ==> value-parameter party: Party defined in net.corda.vega.api.PortfolioApi.withPortfolio[ValueParameterDescriptorImpl]

'if (portfolio != null) {
            func(portfolio)
        } else {
            Response.status(Response.Status.NOT_FOUND).entity("Portfolio not yet agreed").build()
        }' @ [65:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Response, elseBranch: Response): Response[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Response

'portfolio' @ [65:20] ==> val portfolio: PortfolioState? defined in net.corda.vega.api.PortfolioApi.withPortfolio[LocalVariableDescriptor]

'invoke' @ [66:13] ==> public abstract operator fun invoke(p1: PortfolioState): Response defined in kotlin.Function1[FunctionInvokeDescriptor]

'portfolio' @ [66:18] ==> val portfolio: PortfolioState? defined in net.corda.vega.api.PortfolioApi.withPortfolio[LocalVariableDescriptor]

'status' @ [68:22] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'NOT_FOUND' @ [68:45] ==> enum entry NOT_FOUND defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'entity' @ [68:56] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'build' @ [68:91] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'dealsWith' @ [75:47] ==> private final inline fun <reified T : DealState> dealsWith(party: AbstractParty): List<StateAndRef<IRSState>> defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : DealState> -> IRSState

'party' @ [75:67] ==> value-parameter party: Party defined in net.corda.vega.api.PortfolioApi.getTradesWith[ValueParameterDescriptorImpl]

'dealsWith' @ [81:26] ==> private final inline fun <reified T : DealState> dealsWith(party: AbstractParty): List<StateAndRef<PortfolioState>> defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : DealState> -> PortfolioState

'party' @ [81:52] ==> value-parameter party: Party defined in net.corda.vega.api.PortfolioApi.getPortfolioWith[ValueParameterDescriptorImpl]

'require' @ [83:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'portfolios' @ [83:17] ==> val portfolios: List<StateAndRef<PortfolioState>> defined in net.corda.vega.api.PortfolioApi.getPortfolioWith[LocalVariableDescriptor]

'size' @ [83:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'portfolios' @ [84:16] ==> val portfolios: List<StateAndRef<PortfolioState>> defined in net.corda.vega.api.PortfolioApi.getPortfolioWith[LocalVariableDescriptor]

'firstOrNull' @ [84:27] ==> public fun <T> List<StateAndRef<PortfolioState>>.firstOrNull(): StateAndRef<PortfolioState>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<PortfolioState>

'state' @ [84:42] ==> public final val state: TransactionState<PortfolioState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [84:49] ==> public final val data: PortfolioState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'dealsWith' @ [93:26] ==> private final inline fun <reified T : DealState> dealsWith(party: AbstractParty): List<StateAndRef<PortfolioState>> defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : DealState> -> PortfolioState

'party' @ [93:52] ==> value-parameter party: Party defined in net.corda.vega.api.PortfolioApi.getPortfolioStateAndRefWith[ValueParameterDescriptorImpl]

'require' @ [95:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'portfolios' @ [95:17] ==> val portfolios: List<StateAndRef<PortfolioState>> defined in net.corda.vega.api.PortfolioApi.getPortfolioStateAndRefWith[LocalVariableDescriptor]

'size' @ [95:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'portfolios' @ [96:16] ==> val portfolios: List<StateAndRef<PortfolioState>> defined in net.corda.vega.api.PortfolioApi.getPortfolioStateAndRefWith[LocalVariableDescriptor]

'first' @ [96:27] ==> public fun <T> List<StateAndRef<PortfolioState>>.first(): StateAndRef<PortfolioState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<PortfolioState>

'GET' @ [104:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [105:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [106:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [106:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'mapOf' @ [108:16] ==> public fun <K, V> mapOf(pair: Pair<String, (LocalDate..LocalDate?)>): Map<String, (LocalDate..LocalDate?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> (java.time.LocalDate..java.time.LocalDate?)

'to' @ [109:17] ==> public infix fun <A, B> String.to(that: (LocalDate..LocalDate?)): Pair<String, (LocalDate..LocalDate?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (java.time.LocalDate..java.time.LocalDate?)

'ofInstant' @ [109:50] ==> public open fun ofInstant(p0: (Instant..Instant?), p1: (ZoneId..ZoneId?)): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'rpc' @ [109:60] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'currentNodeTime' @ [109:64] ==> public abstract fun currentNodeTime(): Instant defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'systemDefault' @ [109:90] ==> public open fun systemDefault(): (ZoneId..ZoneId?) defined in java.time.ZoneId[JavaMethodDescriptor]

'toLocalDate' @ [109:107] ==> public open fun toLocalDate(): (LocalDate..LocalDate?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'GET' @ [117:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [118:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [119:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [119:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'PathParam' @ [120:24] ==> public constructor PathParam(value: String) defined in javax.ws.rs.PathParam[JavaClassConstructorDescriptor]

'withParty' @ [121:16] ==> private final fun withParty(partyName: String, func: (Party) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'partyName' @ [121:26] ==> value-parameter @PathParam partyName: String defined in net.corda.vega.api.PortfolioApi.getPartyTrades[ValueParameterDescriptorImpl]

'dealsWith' @ [122:26] ==> private final inline fun <reified T : DealState> dealsWith(party: AbstractParty): List<StateAndRef<IRSState>> defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : DealState> -> IRSState

'it' @ [122:46] ==> value-parameter it: Party defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[ValueParameterDescriptorImpl]

'dealsWith' @ [127:17] ==> private final inline fun <reified T : DealState> dealsWith(party: AbstractParty): List<StateAndRef<PortfolioState>> defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : DealState> -> PortfolioState

'it' @ [127:43] ==> value-parameter it: Party defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [127:47] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<PortfolioState>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<PortfolioState>

'latestPortfolioStateRef' @ [128:17] ==> val latestPortfolioStateRef: StateAndRef<PortfolioState> defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'dealsWith' @ [128:43] ==> private final inline fun <reified T : DealState> dealsWith(party: AbstractParty): List<StateAndRef<PortfolioState>> defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : DealState> -> PortfolioState

'it' @ [128:69] ==> value-parameter it: Party defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [128:73] ==> public fun <T> List<StateAndRef<PortfolioState>>.last(): StateAndRef<PortfolioState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<PortfolioState>

'latestPortfolioStateData' @ [129:17] ==> var latestPortfolioStateData: PortfolioState? defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'latestPortfolioStateRef' @ [129:44] ==> val latestPortfolioStateRef: StateAndRef<PortfolioState> defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'state' @ [129:68] ==> public final val state: TransactionState<PortfolioState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [129:74] ==> public final val data: PortfolioState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'PVs' @ [130:17] ==> var PVs: Map<String, MultiCurrencyAmount>? defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'latestPortfolioStateData' @ [130:23] ==> var latestPortfolioStateData: PortfolioState? defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'valuation' @ [130:48] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'presentValues' @ [130:59] ==> public final val presentValues: Map<String, MultiCurrencyAmount> defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'IMs' @ [131:17] ==> var IMs: Map<String, InitialMarginTriple>? defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'latestPortfolioStateData' @ [131:23] ==> var latestPortfolioStateData: PortfolioState? defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'valuation' @ [131:48] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'imContributionMap' @ [131:59] ==> public final val imContributionMap: Map<String, InitialMarginTriple>? defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'states' @ [134:25] ==> val states: List<StateAndRef<IRSState>> defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'map' @ [134:32] ==> public inline fun <T, R> Iterable<StateAndRef<IRSState>>.map(transform: (StateAndRef<IRSState>) -> SwapData): List<SwapData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IRSState>
    <R> -> SwapData

'it' @ [134:38] ==> value-parameter it: StateAndRef<IRSState> defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [134:41] ==> public final val state: TransactionState<IRSState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [134:47] ==> public final val data: IRSState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'swap' @ [134:52] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'ok' @ [135:22] ==> public open fun ok(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'entity' @ [135:27] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'swaps' @ [135:34] ==> val swaps: List<SwapData> defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'map' @ [135:40] ==> public inline fun <T, R> Iterable<SwapData>.map(transform: (SwapData) -> SwapDataView): List<SwapDataView> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SwapData
    <R> -> SwapDataView

'it' @ [136:17] ==> value-parameter it: SwapData defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toView' @ [136:20] ==> public fun SwapData.toView(viewingParty: Party, portfolio: Portfolio? = ..., presentValue: MultiCurrencyAmount? = ..., IM: InitialMarginTriple? = ...): SwapDataView defined in net.corda.vega.api in file SwapDataView.kt[SimpleFunctionDescriptorImpl]

'ownParty' @ [136:27] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'latestPortfolioStateData' @ [137:25] ==> var latestPortfolioStateData: PortfolioState? defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'portfolio' @ [137:51] ==> public final val portfolio: List<StateRef> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'toStateAndRef' @ [137:62] ==> public inline fun <reified T : ContractState> List<StateRef>.toStateAndRef(rpc: CordaRPCOps): List<StateAndRef<IRSState>> defined in net.corda.vega.portfolio[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> IRSState

'rpc' @ [137:86] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'toPortfolio' @ [137:92] ==> public fun List<StateAndRef<IRSState>>.toPortfolio(): Portfolio defined in net.corda.vega.portfolio[SimpleFunctionDescriptorImpl]

'PVs' @ [138:25] ==> var PVs: Map<String, MultiCurrencyAmount>? defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'get' @ [138:30] ==> public abstract operator fun get(key: String): MultiCurrencyAmount? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'it' @ [138:34] ==> value-parameter it: SwapData defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [138:37] ==> public final val id: Pair<String, String> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [138:40] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'empty' @ [138:71] ==> public open fun empty(): (MultiCurrencyAmount..MultiCurrencyAmount?) defined in com.opengamma.strata.basics.currency.MultiCurrencyAmount[JavaMethodDescriptor]

'IMs' @ [139:25] ==> var IMs: Map<String, InitialMarginTriple>? defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>[LocalVariableDescriptor]

'get' @ [139:30] ==> public abstract operator fun get(key: String): InitialMarginTriple? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'it' @ [139:34] ==> value-parameter it: SwapData defined in net.corda.vega.api.PortfolioApi.getPartyTrades.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [139:37] ==> public final val id: Pair<String, String> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [139:40] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'InitialMarginTriple' @ [139:51] ==> public companion object defined in net.corda.vega.analytics.InitialMarginTriple[FakeCallableDescriptorForObject]

'zero' @ [139:71] ==> public final fun zero(): InitialMarginTriple defined in net.corda.vega.analytics.InitialMarginTriple.Companion[SimpleFunctionDescriptorImpl]

'build' @ [141:16] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'GET' @ [148:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [149:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [150:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [150:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'PathParam' @ [151:23] ==> public constructor PathParam(value: String) defined in javax.ws.rs.PathParam[JavaClassConstructorDescriptor]

'PathParam' @ [151:62] ==> public constructor PathParam(value: String) defined in javax.ws.rs.PathParam[JavaClassConstructorDescriptor]

'withParty' @ [152:16] ==> private final fun withParty(partyName: String, func: (Party) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'partyName' @ [152:26] ==> value-parameter @PathParam partyName: String defined in net.corda.vega.api.PortfolioApi.getPartyTrade[ValueParameterDescriptorImpl]

'dealsWith' @ [153:26] ==> private final inline fun <reified T : DealState> dealsWith(party: AbstractParty): List<StateAndRef<IRSState>> defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : DealState> -> IRSState

'it' @ [153:46] ==> value-parameter it: Party defined in net.corda.vega.api.PortfolioApi.getPartyTrade.<anonymous>[ValueParameterDescriptorImpl]

'states' @ [154:30] ==> val states: List<StateAndRef<IRSState>> defined in net.corda.vega.api.PortfolioApi.getPartyTrade.<anonymous>[LocalVariableDescriptor]

'first' @ [154:37] ==> public inline fun <T> Iterable<StateAndRef<IRSState>>.first(predicate: (StateAndRef<IRSState>) -> Boolean): StateAndRef<IRSState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<IRSState>

'it' @ [154:45] ==> value-parameter it: StateAndRef<IRSState> defined in net.corda.vega.api.PortfolioApi.getPartyTrade.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [154:48] ==> public final val state: TransactionState<IRSState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [154:54] ==> public final val data: IRSState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'swap' @ [154:59] ==> public final val swap: SwapData defined in net.corda.vega.contracts.IRSState[PropertyDescriptorImpl]

'id' @ [154:64] ==> public final val id: Pair<String, String> defined in net.corda.vega.contracts.SwapData[PropertyDescriptorImpl]

'second' @ [154:67] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'tradeId' @ [154:77] ==> value-parameter @PathParam tradeId: String defined in net.corda.vega.api.PortfolioApi.getPartyTrade[ValueParameterDescriptorImpl]

'state' @ [154:87] ==> public final val state: TransactionState<IRSState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [154:93] ==> public final val data: IRSState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'ok' @ [155:22] ==> public open fun ok(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'entity' @ [155:27] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'portfolioUtils' @ [155:34] ==> private final val portfolioUtils: PortfolioApiUtils defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'createTradeView' @ [155:49] ==> public final fun createTradeView(rpc: CordaRPCOps, state: IRSState): PortfolioApiUtils.TradeView defined in net.corda.vega.api.PortfolioApiUtils[SimpleFunctionDescriptorImpl]

'rpc' @ [155:65] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'tradeState' @ [155:70] ==> val tradeState: IRSState defined in net.corda.vega.api.PortfolioApi.getPartyTrade.<anonymous>[LocalVariableDescriptor]

'build' @ [155:83] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'PUT' @ [162:5] ==> public constructor PUT() defined in javax.ws.rs.PUT[JavaClassConstructorDescriptor]

'Consumes' @ [163:5] ==> public constructor Consumes(vararg value: String = ...) defined in javax.ws.rs.Consumes[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [163:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'Path' @ [164:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'PathParam' @ [165:39] ==> public constructor PathParam(value: String) defined in javax.ws.rs.PathParam[JavaClassConstructorDescriptor]

'withParty' @ [166:16] ==> private final fun withParty(partyName: String, func: (Party) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'partyName' @ [166:26] ==> value-parameter @PathParam partyName: String defined in net.corda.vega.api.PortfolioApi.addTrade[ValueParameterDescriptorImpl]

'if (swap.buySell.isBuy) ownParty else it' @ [167:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Party, elseBranch: Party): Party[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Party

'swap' @ [167:29] ==> value-parameter swap: SwapDataModel defined in net.corda.vega.api.PortfolioApi.addTrade[ValueParameterDescriptorImpl]

'buySell' @ [167:34] ==> public final val buySell: BuySell defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

'isBuy' @ [167:42] ==> public final val BuySell.isBuy: Boolean[MyPropertyDescriptor]

'ownParty' @ [167:49] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'it' @ [167:63] ==> value-parameter it: Party defined in net.corda.vega.api.PortfolioApi.addTrade.<anonymous>[ValueParameterDescriptorImpl]

'if (swap.buySell.isSell) ownParty else it' @ [168:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Party, elseBranch: Party): Party[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Party

'swap' @ [168:30] ==> value-parameter swap: SwapDataModel defined in net.corda.vega.api.PortfolioApi.addTrade[ValueParameterDescriptorImpl]

'buySell' @ [168:35] ==> public final val buySell: BuySell defined in net.corda.vega.api.SwapDataModel[PropertyDescriptorImpl]

'isSell' @ [168:43] ==> public final val BuySell.isSell: Boolean[MyPropertyDescriptor]

'ownParty' @ [168:51] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'it' @ [168:65] ==> value-parameter it: Party defined in net.corda.vega.api.PortfolioApi.addTrade.<anonymous>[ValueParameterDescriptorImpl]

'rpc' @ [169:13] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'startFlow' @ [169:17] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<SignedTransaction>> CordaRPCOps.startFlow(flowConstructor: (SwapData, Party) -> IRSTradeFlow.Requester, arg0: SwapData, arg1: Party): FlowHandle<SignedTransaction> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction
    <A> -> SwapData
    <B> -> Party
    <reified R : FlowLogic<T>> -> Requester

'IRSTradeFlow' @ [169:27] ==> public object IRSTradeFlow defined in net.corda.vega.flows in file IRSTradeFlow.kt[FakeCallableDescriptorForObject]

'swap' @ [169:52] ==> value-parameter swap: SwapDataModel defined in net.corda.vega.api.PortfolioApi.addTrade[ValueParameterDescriptorImpl]

'toData' @ [169:57] ==> public final fun toData(buyer: Party, seller: Party): SwapData defined in net.corda.vega.api.SwapDataModel[SimpleFunctionDescriptorImpl]

'buyer' @ [169:64] ==> val buyer: Party defined in net.corda.vega.api.PortfolioApi.addTrade.<anonymous>[LocalVariableDescriptor]

'seller' @ [169:71] ==> val seller: Party defined in net.corda.vega.api.PortfolioApi.addTrade.<anonymous>[LocalVariableDescriptor]

'it' @ [169:80] ==> value-parameter it: Party defined in net.corda.vega.api.PortfolioApi.addTrade.<anonymous>[ValueParameterDescriptorImpl]

'returnValue' @ [169:84] ==> public abstract val returnValue: CordaFuture<SignedTransaction> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [169:96] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'accepted' @ [170:22] ==> public open fun accepted(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'entity' @ [170:33] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'build' @ [170:46] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'GET' @ [179:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [180:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [181:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [181:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'PathParam' @ [182:37] ==> public constructor PathParam(value: String) defined in javax.ws.rs.PathParam[JavaClassConstructorDescriptor]

'withParty' @ [183:16] ==> private final fun withParty(partyName: String, func: (Party) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'partyName' @ [183:26] ==> value-parameter @PathParam partyName: String defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioValuations[ValueParameterDescriptorImpl]

'withPortfolio' @ [184:13] ==> private final fun withPortfolio(party: Party, func: (PortfolioState) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'otherParty' @ [184:27] ==> value-parameter otherParty: Party defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioValuations.<anonymous>[ValueParameterDescriptorImpl]

'portfolioState' @ [185:33] ==> value-parameter portfolioState: PortfolioState defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioValuations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'portfolio' @ [185:48] ==> public final val portfolio: List<StateRef> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'toStateAndRef' @ [185:58] ==> public inline fun <reified T : ContractState> List<StateRef>.toStateAndRef(rpc: CordaRPCOps): List<StateAndRef<IRSState>> defined in net.corda.vega.portfolio[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> IRSState

'rpc' @ [185:82] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'toPortfolio' @ [185:87] ==> public fun List<StateAndRef<IRSState>>.toPortfolio(): Portfolio defined in net.corda.vega.portfolio[SimpleFunctionDescriptorImpl]

'ok' @ [186:26] ==> public open fun ok(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'entity' @ [186:31] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'portfolioUtils' @ [186:38] ==> private final val portfolioUtils: PortfolioApiUtils defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'createValuations' @ [186:53] ==> public final fun createValuations(state: PortfolioState, portfolio: Portfolio): PortfolioApiUtils.ValuationsView defined in net.corda.vega.api.PortfolioApiUtils[SimpleFunctionDescriptorImpl]

'portfolioState' @ [186:70] ==> value-parameter portfolioState: PortfolioState defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioValuations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'portfolio' @ [186:86] ==> val portfolio: Portfolio defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioValuations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'build' @ [186:98] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'GET' @ [196:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [197:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [198:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [198:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'PathParam' @ [199:29] ==> public constructor PathParam(value: String) defined in javax.ws.rs.PathParam[JavaClassConstructorDescriptor]

'withParty' @ [200:16] ==> private final fun withParty(partyName: String, func: (Party) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'partyName' @ [200:26] ==> value-parameter @PathParam partyName: String defined in net.corda.vega.api.PortfolioApi.getPortfolioSummary[ValueParameterDescriptorImpl]

'getTradesWith' @ [201:26] ==> private final fun getTradesWith(party: Party): List<StateAndRef<IRSState>> defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'party' @ [201:40] ==> value-parameter party: Party defined in net.corda.vega.api.PortfolioApi.getPortfolioSummary.<anonymous>[ValueParameterDescriptorImpl]

'Portfolio' @ [202:29] ==> public constructor Portfolio(tradeStateAndRefs: List<StateAndRef<IRSState>>, valuationDate: LocalDate? = ...) defined in net.corda.vega.portfolio.Portfolio[ClassConstructorDescriptorImpl]

'trades' @ [202:39] ==> val trades: List<StateAndRef<IRSState>> defined in net.corda.vega.api.PortfolioApi.getPortfolioSummary.<anonymous>[LocalVariableDescriptor]

'mapOf' @ [203:27] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, {Number & Comparable<{Double & Int}>}>): Map<String, {Number & Comparable<{Double & Int}>}> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> {Number & Comparable<{Double & Int}>}

'to' @ [204:21] ==> public infix fun <A, B> String.to(that: Int): Pair<String, Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Int

'portfolio' @ [204:33] ==> val portfolio: Portfolio defined in net.corda.vega.api.PortfolioApi.getPortfolioSummary.<anonymous>[LocalVariableDescriptor]

'trades' @ [204:43] ==> public final val trades: List<IRSState> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'size' @ [204:50] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'to' @ [205:21] ==> public infix fun <A, B> String.to(that: Double): Pair<String, Double> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Double

'portfolio' @ [205:35] ==> val portfolio: Portfolio defined in net.corda.vega.api.PortfolioApi.getPortfolioSummary.<anonymous>[LocalVariableDescriptor]

'getNotionalForParty' @ [205:45] ==> public final fun getNotionalForParty(party: Party): BigDecimal defined in net.corda.vega.portfolio.Portfolio[SimpleFunctionDescriptorImpl]

'ownParty' @ [205:65] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'toDouble' @ [205:75] ==> public open fun toDouble(): Double defined in java.math.BigDecimal[JavaMethodDescriptor]

'ok' @ [207:22] ==> public open fun ok(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'entity' @ [207:27] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'summary' @ [207:34] ==> val summary: Map<String, {Number & Comparable<{Double & Int}>}> defined in net.corda.vega.api.PortfolioApi.getPortfolioSummary.<anonymous>[LocalVariableDescriptor]

'build' @ [207:43] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'GET' @ [222:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [223:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [224:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [224:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'PathParam' @ [225:44] ==> public constructor PathParam(value: String) defined in javax.ws.rs.PathParam[JavaClassConstructorDescriptor]

'withParty' @ [226:16] ==> private final fun withParty(partyName: String, func: (Party) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'partyName' @ [226:26] ==> value-parameter @PathParam partyName: String defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated[ValueParameterDescriptorImpl]

'withPortfolio' @ [227:13] ==> private final fun withPortfolio(party: Party, func: (PortfolioState) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'party' @ [227:27] ==> value-parameter party: Party defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>[ValueParameterDescriptorImpl]

'if (state.valuation != null) {
                    val isValuer = state.valuer == ownParty
                    val rawMtm = state.valuation.presentValues.map {
                        it.value.amounts.first().amount
                    }.reduce { a, b -> a + b }
                    val notional = if (isValuer) state.valuation.notional else -state.valuation.notional
                    val mtm = if (isValuer) rawMtm else -rawMtm
                    // TODO: Stop using localdate.now
                    val history = AggregatedHistoryView(state.valuation.trades, notional.toDouble(), LocalDate.now(), state.valuation.margin.first, mtm)
                    Response.ok().entity(history).build()
                } else {
                    Response.status(Response.Status.NOT_FOUND).entity("Portfolio not yet valued").build()
                }' @ [228:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Response, elseBranch: Response): Response[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Response

'state' @ [228:21] ==> value-parameter state: PortfolioState defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valuation' @ [228:27] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'state' @ [229:36] ==> value-parameter state: PortfolioState defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valuer' @ [229:42] ==> public final val valuer: AbstractParty defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'ownParty' @ [229:52] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'state' @ [230:34] ==> value-parameter state: PortfolioState defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valuation' @ [230:40] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'presentValues' @ [230:50] ==> public final val presentValues: Map<String, MultiCurrencyAmount> defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'map' @ [230:64] ==> public inline fun <K, V, R> Map<out String, MultiCurrencyAmount>.map(transform: (Map.Entry<String, MultiCurrencyAmount>) -> Double): List<Double> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MultiCurrencyAmount
    <R> -> Double

'it' @ [231:25] ==> value-parameter it: Map.Entry<String, MultiCurrencyAmount> defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [231:28] ==> public abstract val value: MultiCurrencyAmount defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'amounts' @ [231:34] ==> public final val MultiCurrencyAmount.amounts: (ImmutableSortedSet<(CurrencyAmount..CurrencyAmount?)>..ImmutableSortedSet<(CurrencyAmount..CurrencyAmount?)>?)[MyPropertyDescriptor]

'first' @ [231:42] ==> public open fun first(): (CurrencyAmount..CurrencyAmount?) defined in com.google.common.collect.ImmutableSortedSet[JavaMethodDescriptor]

'amount' @ [231:50] ==> public final val CurrencyAmount.amount: Double[MyPropertyDescriptor]

'reduce' @ [232:23] ==> public inline fun <S, T : Double> Iterable<Double>.reduce(operation: (Double, Double) -> Double): Double defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Double
    <T : S> -> Double

'a' @ [232:40] ==> value-parameter a: Double defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [232:44] ==> value-parameter b: Double defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (isValuer) state.valuation.notional else -state.valuation.notional' @ [233:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BigDecimal, elseBranch: BigDecimal): BigDecimal[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BigDecimal

'isValuer' @ [233:40] ==> val isValuer: Boolean defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'state' @ [233:50] ==> value-parameter state: PortfolioState defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valuation' @ [233:56] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'notional' @ [233:66] ==> public final val notional: BigDecimal defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'-' @ [233:80] ==> @InlineOnly public operator inline fun BigDecimal.unaryMinus(): BigDecimal defined in kotlin[DeserializedSimpleFunctionDescriptor]

'state' @ [233:81] ==> value-parameter state: PortfolioState defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valuation' @ [233:87] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'notional' @ [233:97] ==> public final val notional: BigDecimal defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'if (isValuer) rawMtm else -rawMtm' @ [234:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Double, elseBranch: Double): Double[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Double

'isValuer' @ [234:35] ==> val isValuer: Boolean defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rawMtm' @ [234:45] ==> val rawMtm: Double defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'-' @ [234:57] ==> public final operator fun unaryMinus(): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'rawMtm' @ [234:58] ==> val rawMtm: Double defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'AggregatedHistoryView' @ [236:35] ==> public constructor AggregatedHistoryView(activeTrades: Int, notional: Double, date: LocalDate, IM: Double, MTM: Double) defined in net.corda.vega.api.PortfolioApi.AggregatedHistoryView[ClassConstructorDescriptorImpl]

'state' @ [236:57] ==> value-parameter state: PortfolioState defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valuation' @ [236:63] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'trades' @ [236:73] ==> public final val trades: Int defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'notional' @ [236:81] ==> val notional: BigDecimal defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toDouble' @ [236:90] ==> public open fun toDouble(): Double defined in java.math.BigDecimal[JavaMethodDescriptor]

'now' @ [236:112] ==> public open fun now(): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'state' @ [236:119] ==> value-parameter state: PortfolioState defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'valuation' @ [236:125] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'margin' @ [236:135] ==> public final val margin: InitialMarginTriple defined in net.corda.vega.contracts.PortfolioValuation[PropertyDescriptorImpl]

'first' @ [236:142] ==> public final val first: Double defined in net.corda.vega.analytics.InitialMarginTriple[PropertyDescriptorImpl]

'mtm' @ [236:149] ==> val mtm: Double defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ok' @ [237:30] ==> public open fun ok(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'entity' @ [237:35] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'history' @ [237:42] ==> val history: PortfolioApi.AggregatedHistoryView defined in net.corda.vega.api.PortfolioApi.getPartyPortfolioHistoryAggregated.<anonymous>.<anonymous>[LocalVariableDescriptor]

'build' @ [237:51] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'status' @ [239:30] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'NOT_FOUND' @ [239:53] ==> enum entry NOT_FOUND defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'entity' @ [239:64] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'build' @ [239:99] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'GET' @ [251:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [252:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [253:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [253:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'rpc' @ [255:23] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'networkMapSnapshot' @ [255:27] ==> public abstract fun networkMapSnapshot(): List<NodeInfo> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'parties' @ [256:30] ==> val parties: List<NodeInfo> defined in net.corda.vega.api.PortfolioApi.getWhoAmI[LocalVariableDescriptor]

'filterNot' @ [256:38] ==> public inline fun <T> Iterable<NodeInfo>.filterNot(predicate: (NodeInfo) -> Boolean): List<NodeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [257:13] ==> value-parameter it: NodeInfo defined in net.corda.vega.api.PortfolioApi.getWhoAmI.<anonymous>[ValueParameterDescriptorImpl]

'advertisedServices' @ [257:16] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'any' @ [257:35] ==> public inline fun <T> Iterable<ServiceEntry>.any(predicate: (ServiceEntry) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry

'it' @ [257:41] ==> value-parameter it: ServiceEntry defined in net.corda.vega.api.PortfolioApi.getWhoAmI.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [257:44] ==> public final val info: ServiceInfo defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'type' @ [257:49] ==> public final val type: ServiceType defined in net.corda.core.node.services.ServiceInfo[DeserializedPropertyDescriptor]

'setOf' @ [257:57] ==> public fun <T> setOf(vararg elements: ServiceType): Set<ServiceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceType

'ServiceType' @ [257:63] ==> public companion object defined in net.corda.core.node.services.ServiceType[FakeCallableDescriptorForObject]

'networkMap' @ [257:75] ==> public final val networkMap: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[DeserializedPropertyDescriptor]

'ServiceType' @ [257:87] ==> public companion object defined in net.corda.core.node.services.ServiceType[FakeCallableDescriptorForObject]

'notary' @ [257:99] ==> public final val notary: ServiceType defined in net.corda.core.node.services.ServiceType.Companion[DeserializedPropertyDescriptor]

'it' @ [258:24] ==> value-parameter it: NodeInfo defined in net.corda.vega.api.PortfolioApi.getWhoAmI.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [258:27] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ownParty' @ [258:44] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'AvailableParties' @ [261:16] ==> public constructor AvailableParties(self: PortfolioApi.ApiParty, counterparties: List<PortfolioApi.ApiParty>) defined in net.corda.vega.api.PortfolioApi.AvailableParties[ClassConstructorDescriptorImpl]

'ApiParty' @ [262:24] ==> public constructor ApiParty(id: String, text: X500Name) defined in net.corda.vega.api.PortfolioApi.ApiParty[ClassConstructorDescriptorImpl]

'ownParty' @ [262:33] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'owningKey' @ [262:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toBase58String' @ [262:52] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'ownParty' @ [262:70] ==> private final val ownParty: Party defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'name' @ [262:79] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'counterParties' @ [263:34] ==> val counterParties: List<NodeInfo> defined in net.corda.vega.api.PortfolioApi.getWhoAmI[LocalVariableDescriptor]

'map' @ [263:49] ==> public inline fun <T, R> Iterable<NodeInfo>.map(transform: (NodeInfo) -> PortfolioApi.ApiParty): List<PortfolioApi.ApiParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo
    <R> -> ApiParty

'ApiParty' @ [263:55] ==> public constructor ApiParty(id: String, text: X500Name) defined in net.corda.vega.api.PortfolioApi.ApiParty[ClassConstructorDescriptorImpl]

'it' @ [263:64] ==> value-parameter it: NodeInfo defined in net.corda.vega.api.PortfolioApi.getWhoAmI.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [263:67] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [263:81] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toBase58String' @ [263:91] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'it' @ [263:109] ==> value-parameter it: NodeInfo defined in net.corda.vega.api.PortfolioApi.getWhoAmI.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [263:112] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [263:126] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'POST' @ [272:5] ==> public constructor POST() defined in javax.ws.rs.POST[JavaClassConstructorDescriptor]

'Path' @ [273:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [274:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [274:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'ValuationCreationParams' @ [275:70] ==> public constructor ValuationCreationParams(valuationDate: LocalDate) defined in net.corda.vega.api.PortfolioApi.ValuationCreationParams[ClassConstructorDescriptorImpl]

'of' @ [275:104] ==> public open fun of(p0: Int, p1: Int, p2: Int): (LocalDate..LocalDate?) defined in java.time.LocalDate[JavaMethodDescriptor]

'PathParam' @ [275:121] ==> public constructor PathParam(value: String) defined in javax.ws.rs.PathParam[JavaClassConstructorDescriptor]

'withParty' @ [276:16] ==> private final fun withParty(partyName: String, func: (Party) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'partyName' @ [276:26] ==> value-parameter @PathParam partyName: String defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations[ValueParameterDescriptorImpl]

'getPortfolioWith' @ [277:32] ==> private final fun getPortfolioWith(party: Party): PortfolioState? defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'otherParty' @ [277:49] ==> value-parameter otherParty: Party defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations.<anonymous>[ValueParameterDescriptorImpl]

'if (existingSwap == null) {
                rpc.startFlow(SimmFlow::Requester, otherParty, params.valuationDate)
            } else {
                rpc.startFlow(SimmRevaluation::Initiator, getPortfolioStateAndRefWith(otherParty).ref, params.valuationDate)
            }' @ [278:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FlowHandle<out Any>, elseBranch: FlowHandle<out Any>): FlowHandle<out Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FlowHandle<out Any>

'existingSwap' @ [278:34] ==> val existingSwap: PortfolioState? defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations.<anonymous>[LocalVariableDescriptor]

'rpc' @ [279:17] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'startFlow' @ [279:21] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<RevisionedState<PortfolioState.Update>>> CordaRPCOps.startFlow(flowConstructor: (Party, LocalDate) -> SimmFlow.Requester, arg0: Party, arg1: LocalDate): FlowHandle<RevisionedState<PortfolioState.Update>> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> RevisionedState<Update>
    <A> -> Party
    <B> -> LocalDate
    <reified R : FlowLogic<T>> -> Requester

'SimmFlow' @ [279:31] ==> public object SimmFlow defined in net.corda.vega.flows in file SimmFlow.kt[FakeCallableDescriptorForObject]

'otherParty' @ [279:52] ==> value-parameter otherParty: Party defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations.<anonymous>[ValueParameterDescriptorImpl]

'params' @ [279:64] ==> value-parameter params: PortfolioApi.ValuationCreationParams = ... defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations[ValueParameterDescriptorImpl]

'valuationDate' @ [279:71] ==> public final val valuationDate: LocalDate defined in net.corda.vega.api.PortfolioApi.ValuationCreationParams[PropertyDescriptorImpl]

'rpc' @ [281:17] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'startFlow' @ [281:21] ==> public inline fun <T : Any, A, B, reified R : FlowLogic<Unit>> CordaRPCOps.startFlow(flowConstructor: (StateRef, LocalDate) -> SimmRevaluation.Initiator, arg0: StateRef, arg1: LocalDate): FlowHandle<Unit> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Unit
    <A> -> StateRef
    <B> -> LocalDate
    <reified R : FlowLogic<T>> -> Initiator

'SimmRevaluation' @ [281:31] ==> public object SimmRevaluation defined in net.corda.vega.flows in file SimmRevaluation.kt[FakeCallableDescriptorForObject]

'getPortfolioStateAndRefWith' @ [281:59] ==> private final fun getPortfolioStateAndRefWith(party: Party): StateAndRef<PortfolioState> defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'otherParty' @ [281:87] ==> value-parameter otherParty: Party defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [281:99] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'params' @ [281:104] ==> value-parameter params: PortfolioApi.ValuationCreationParams = ... defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations[ValueParameterDescriptorImpl]

'valuationDate' @ [281:111] ==> public final val valuationDate: LocalDate defined in net.corda.vega.api.PortfolioApi.ValuationCreationParams[PropertyDescriptorImpl]

'flowHandle' @ [283:13] ==> val flowHandle: FlowHandle<out Any> defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations.<anonymous>[LocalVariableDescriptor]

'returnValue' @ [283:24] ==> public abstract val returnValue: CordaFuture<out Any> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [283:36] ==> public fun <V> Future<out Any>.getOrThrow(timeout: Duration? = ...): Any defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any

'withPortfolio' @ [285:13] ==> private final fun withPortfolio(party: Party, func: (PortfolioState) -> Response): Response defined in net.corda.vega.api.PortfolioApi[SimpleFunctionDescriptorImpl]

'otherParty' @ [285:27] ==> value-parameter otherParty: Party defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations.<anonymous>[ValueParameterDescriptorImpl]

'portfolioState' @ [286:33] ==> value-parameter portfolioState: PortfolioState defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'portfolio' @ [286:48] ==> public final val portfolio: List<StateRef> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'toStateAndRef' @ [286:58] ==> public inline fun <reified T : ContractState> List<StateRef>.toStateAndRef(rpc: CordaRPCOps): List<StateAndRef<IRSState>> defined in net.corda.vega.portfolio[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : ContractState> -> IRSState

'rpc' @ [286:82] ==> public final val rpc: CordaRPCOps defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'toPortfolio' @ [286:87] ==> public fun List<StateAndRef<IRSState>>.toPortfolio(): Portfolio defined in net.corda.vega.portfolio[SimpleFunctionDescriptorImpl]

'ok' @ [287:26] ==> public open fun ok(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'entity' @ [287:31] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'portfolioUtils' @ [287:38] ==> private final val portfolioUtils: PortfolioApiUtils defined in net.corda.vega.api.PortfolioApi[PropertyDescriptorImpl]

'createValuations' @ [287:53] ==> public final fun createValuations(state: PortfolioState, portfolio: Portfolio): PortfolioApiUtils.ValuationsView defined in net.corda.vega.api.PortfolioApiUtils[SimpleFunctionDescriptorImpl]

'portfolioState' @ [287:70] ==> value-parameter portfolioState: PortfolioState defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'portfolio' @ [287:86] ==> val portfolio: Portfolio defined in net.corda.vega.api.PortfolioApi.startPortfolioCalculations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'build' @ [287:98] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

