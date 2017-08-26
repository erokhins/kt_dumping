'Path' @ [31:1] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'loggerFor' @ [34:26] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> InterestRateSwapAPI

'+' @ [36:66] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'deal' @ [36:86] ==> value-parameter deal: InterestRateSwap.State defined in net.corda.irs.api.InterestRateSwapAPI.generateDealLink[ValueParameterDescriptorImpl]

'common' @ [36:91] ==> public final val common: InterestRateSwap.Common defined in net.corda.irs.contract.InterestRateSwap.State[PropertyDescriptorImpl]

'tradeID' @ [36:98] ==> public final val tradeID: String defined in net.corda.irs.contract.InterestRateSwap.Common[PropertyDescriptorImpl]

'rpc' @ [39:21] ==> public final val rpc: CordaRPCOps defined in net.corda.irs.api.InterestRateSwapAPI[PropertyDescriptorImpl]

'vaultQueryBy' @ [39:25] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<InterestRateSwap.State> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [39:64] ==> public final val states: List<StateAndRef<InterestRateSwap.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'vault' @ [40:22] ==> val vault: List<StateAndRef<InterestRateSwap.State>> defined in net.corda.irs.api.InterestRateSwapAPI.getDealByRef[LocalVariableDescriptor]

'filterStatesOfType' @ [40:28] ==> public inline fun <reified T : ContractState> Iterable<StateAndRef<ContractState>>.filterStatesOfType(): List<StateAndRef<InterestRateSwap.State>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'filter' @ [40:73] ==> public inline fun <T> Iterable<StateAndRef<InterestRateSwap.State>>.filter(predicate: (StateAndRef<InterestRateSwap.State>) -> Boolean): List<StateAndRef<InterestRateSwap.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>

'it' @ [40:82] ==> value-parameter it: StateAndRef<InterestRateSwap.State> defined in net.corda.irs.api.InterestRateSwapAPI.getDealByRef.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [40:85] ==> public final val state: TransactionState<InterestRateSwap.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [40:91] ==> public final val data: InterestRateSwap.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'linearId' @ [40:96] ==> public open val linearId: UniqueIdentifier defined in net.corda.irs.contract.InterestRateSwap.State[PropertyDescriptorImpl]

'externalId' @ [40:105] ==> public final val externalId: String? defined in net.corda.core.contracts.UniqueIdentifier[DeserializedPropertyDescriptor]

'ref' @ [40:119] ==> value-parameter ref: String defined in net.corda.irs.api.InterestRateSwapAPI.getDealByRef[ValueParameterDescriptorImpl]

'if (states.isEmpty()) null else {
            val deals = states.map { it.state.data }
            return if (deals.isEmpty()) null else deals[0]
        }' @ [41:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InterestRateSwap.State?, elseBranch: InterestRateSwap.State?): InterestRateSwap.State?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> State?

'states' @ [41:20] ==> val states: List<StateAndRef<InterestRateSwap.State>> defined in net.corda.irs.api.InterestRateSwapAPI.getDealByRef[LocalVariableDescriptor]

'isEmpty' @ [41:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'states' @ [42:25] ==> val states: List<StateAndRef<InterestRateSwap.State>> defined in net.corda.irs.api.InterestRateSwapAPI.getDealByRef[LocalVariableDescriptor]

'map' @ [42:32] ==> public inline fun <T, R> Iterable<StateAndRef<InterestRateSwap.State>>.map(transform: (StateAndRef<InterestRateSwap.State>) -> InterestRateSwap.State): List<InterestRateSwap.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> State

'it' @ [42:38] ==> value-parameter it: StateAndRef<InterestRateSwap.State> defined in net.corda.irs.api.InterestRateSwapAPI.getDealByRef.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [42:41] ==> public final val state: TransactionState<InterestRateSwap.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [42:47] ==> public final val data: InterestRateSwap.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'if (deals.isEmpty()) null else deals[0]' @ [43:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InterestRateSwap.State?, elseBranch: InterestRateSwap.State?): InterestRateSwap.State?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> State?

'deals' @ [43:24] ==> val deals: List<InterestRateSwap.State> defined in net.corda.irs.api.InterestRateSwapAPI.getDealByRef[LocalVariableDescriptor]

'isEmpty' @ [43:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'deals' @ [43:51] ==> val deals: List<InterestRateSwap.State> defined in net.corda.irs.api.InterestRateSwapAPI.getDealByRef[LocalVariableDescriptor]

'rpc' @ [48:21] ==> public final val rpc: CordaRPCOps defined in net.corda.irs.api.InterestRateSwapAPI[PropertyDescriptorImpl]

'vaultQueryBy' @ [48:25] ==> public inline fun <reified T : ContractState> CordaRPCOps.vaultQueryBy(criteria: QueryCriteria = ..., paging: PageSpecification = ..., sorting: Sort = ...): Vault.Page<InterestRateSwap.State> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [48:64] ==> public final val states: List<StateAndRef<InterestRateSwap.State>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'vault' @ [49:22] ==> val vault: List<StateAndRef<InterestRateSwap.State>> defined in net.corda.irs.api.InterestRateSwapAPI.getAllDeals[LocalVariableDescriptor]

'filterStatesOfType' @ [49:28] ==> public inline fun <reified T : ContractState> Iterable<StateAndRef<ContractState>>.filterStatesOfType(): List<StateAndRef<InterestRateSwap.State>> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> State

'states' @ [50:21] ==> val states: List<StateAndRef<InterestRateSwap.State>> defined in net.corda.irs.api.InterestRateSwapAPI.getAllDeals[LocalVariableDescriptor]

'map' @ [50:28] ==> public inline fun <T, R> Iterable<StateAndRef<InterestRateSwap.State>>.map(transform: (StateAndRef<InterestRateSwap.State>) -> InterestRateSwap.State): List<InterestRateSwap.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<State>
    <R> -> State

'it' @ [50:34] ==> value-parameter it: StateAndRef<InterestRateSwap.State> defined in net.corda.irs.api.InterestRateSwapAPI.getAllDeals.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [50:37] ==> public final val state: TransactionState<InterestRateSwap.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [50:43] ==> public final val data: InterestRateSwap.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'toTypedArray' @ [50:50] ==> public inline fun <reified T> Collection<InterestRateSwap.State>.toTypedArray(): Array<InterestRateSwap.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> State

'swaps' @ [51:16] ==> val swaps: Array<InterestRateSwap.State> defined in net.corda.irs.api.InterestRateSwapAPI.getAllDeals[LocalVariableDescriptor]

'GET' @ [54:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [55:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [56:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [56:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'getAllDeals' @ [57:55] ==> private final fun getAllDeals(): Array<InterestRateSwap.State> defined in net.corda.irs.api.InterestRateSwapAPI[SimpleFunctionDescriptorImpl]

'POST' @ [59:5] ==> public constructor POST() defined in javax.ws.rs.POST[JavaClassConstructorDescriptor]

'Path' @ [60:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Consumes' @ [61:5] ==> public constructor Consumes(vararg value: String = ...) defined in javax.ws.rs.Consumes[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [61:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'rpc' @ [64:13] ==> public final val rpc: CordaRPCOps defined in net.corda.irs.api.InterestRateSwapAPI[PropertyDescriptorImpl]

'startFlow' @ [64:17] ==> public inline fun <T : Any, A, reified R : FlowLogic<SignedTransaction>> CordaRPCOps.startFlow(flowConstructor: (InterestRateSwap.State) -> AutoOfferFlow.Requester, arg0: InterestRateSwap.State): FlowHandle<SignedTransaction> defined in net.corda.core.messaging[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction
    <A> -> State
    <reified R : FlowLogic<T>> -> Requester

'AutoOfferFlow' @ [64:27] ==> public object AutoOfferFlow defined in net.corda.irs.flows in file AutoOfferFlow.kt[FakeCallableDescriptorForObject]

'newDeal' @ [64:53] ==> value-parameter newDeal: InterestRateSwap.State defined in net.corda.irs.api.InterestRateSwapAPI.storeDeal[ValueParameterDescriptorImpl]

'returnValue' @ [64:62] ==> public abstract val returnValue: CordaFuture<SignedTransaction> defined in net.corda.core.messaging.FlowHandle[DeserializedPropertyDescriptor]

'getOrThrow' @ [64:74] ==> public fun <V> Future<SignedTransaction>.getOrThrow(timeout: Duration? = ...): SignedTransaction defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SignedTransaction

'created' @ [65:22] ==> public open fun created(p0: (URI..URI?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'create' @ [65:34] ==> public open fun create(p0: (String..String?)): (URI..URI?) defined in java.net.URI[JavaMethodDescriptor]

'generateDealLink' @ [65:41] ==> private final fun generateDealLink(deal: InterestRateSwap.State): String defined in net.corda.irs.api.InterestRateSwapAPI[SimpleFunctionDescriptorImpl]

'newDeal' @ [65:58] ==> value-parameter newDeal: InterestRateSwap.State defined in net.corda.irs.api.InterestRateSwapAPI.storeDeal[ValueParameterDescriptorImpl]

'build' @ [65:69] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'logger' @ [67:13] ==> private final val logger: Logger defined in net.corda.irs.api.InterestRateSwapAPI[PropertyDescriptorImpl]

'info' @ [67:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'ex' @ [67:57] ==> val ex: Throwable defined in net.corda.irs.api.InterestRateSwapAPI.storeDeal[LocalVariableDescriptor]

'status' @ [68:22] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'INTERNAL_SERVER_ERROR' @ [68:45] ==> enum entry INTERNAL_SERVER_ERROR defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'entity' @ [68:68] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'ex' @ [68:75] ==> val ex: Throwable defined in net.corda.irs.api.InterestRateSwapAPI.storeDeal[LocalVariableDescriptor]

'toString' @ [68:78] ==> public open fun toString(): String defined in kotlin.Throwable[DeserializedSimpleFunctionDescriptor]

'build' @ [68:90] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'GET' @ [72:5] ==> public constructor GET() defined in javax.ws.rs.GET[JavaClassConstructorDescriptor]

'Path' @ [73:5] ==> public constructor Path(value: String) defined in javax.ws.rs.Path[JavaClassConstructorDescriptor]

'Produces' @ [74:5] ==> public constructor Produces(vararg value: String = ...) defined in javax.ws.rs.Produces[JavaClassConstructorDescriptor]

'APPLICATION_JSON' @ [74:25] ==> public const final val APPLICATION_JSON: String defined in javax.ws.rs.core.MediaType[JavaPropertyDescriptor]

'PathParam' @ [75:19] ==> public constructor PathParam(value: String) defined in javax.ws.rs.PathParam[JavaClassConstructorDescriptor]

'getDealByRef' @ [76:20] ==> private final fun getDealByRef(ref: String): InterestRateSwap.State? defined in net.corda.irs.api.InterestRateSwapAPI[SimpleFunctionDescriptorImpl]

'ref' @ [76:33] ==> value-parameter @PathParam ref: String defined in net.corda.irs.api.InterestRateSwapAPI.fetchDeal[ValueParameterDescriptorImpl]

'if (deal == null) {
            return Response.status(Response.Status.NOT_FOUND).build()
        } else {
            return Response.ok().entity(deal).build()
        }' @ [77:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'deal' @ [77:13] ==> val deal: InterestRateSwap.State? defined in net.corda.irs.api.InterestRateSwapAPI.fetchDeal[LocalVariableDescriptor]

'status' @ [78:29] ==> public open fun status(p0: (Response.Status..Response.Status?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'NOT_FOUND' @ [78:52] ==> enum entry NOT_FOUND defined in javax.ws.rs.core.Response.Status[FakeCallableDescriptorForObject]

'build' @ [78:63] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'ok' @ [80:29] ==> public open fun ok(): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response[JavaMethodDescriptor]

'entity' @ [80:34] ==> public abstract fun entity(p0: (Any..Any?)): (Response.ResponseBuilder..Response.ResponseBuilder?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

'deal' @ [80:41] ==> val deal: InterestRateSwap.State? defined in net.corda.irs.api.InterestRateSwapAPI.fetchDeal[LocalVariableDescriptor]

'build' @ [80:47] ==> public abstract fun build(): (Response..Response?) defined in javax.ws.rs.core.Response.ResponseBuilder[JavaMethodDescriptor]

