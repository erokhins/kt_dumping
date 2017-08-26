'CordaSerializable' @ [39:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'InitiatingFlow' @ [49:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'StartableByRPC' @ [50:5] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<RevisionedState<PortfolioState.Update>>' @ [54:11] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> RevisionedState<Update>

'this' @ [55:68] ==> public constructor Requester(otherParty: Party, valuationDate: LocalDate, existing: StateAndRef<PortfolioState>?) defined in net.corda.vega.flows.SimmFlow.Requester[ClassConstructorDescriptorImpl]

'otherParty' @ [55:73] ==> value-parameter otherParty: Party defined in net.corda.vega.flows.SimmFlow.Requester.<init>[ValueParameterDescriptorImpl]

'valuationDate' @ [55:85] ==> value-parameter valuationDate: LocalDate defined in net.corda.vega.flows.SimmFlow.Requester.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [60:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [62:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'debug' @ [62:20] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'serviceHub' @ [62:43] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'myInfo' @ [62:54] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [62:61] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'otherParty' @ [62:90] ==> public final val otherParty: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'require' @ [63:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [63:21] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'networkMapCache' @ [63:32] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [63:48] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'isNotEmpty' @ [63:60] ==> @InlineOnly public inline fun <T> Collection<NodeInfo>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'notary' @ [64:13] ==> public final lateinit var notary: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'serviceHub' @ [64:22] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'networkMapCache' @ [64:33] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [64:49] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'first' @ [64:61] ==> public fun <T> List<NodeInfo>.first(): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'notaryIdentity' @ [64:69] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'myIdentity' @ [65:13] ==> public final lateinit var myIdentity: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'serviceHub' @ [65:26] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'myInfo' @ [65:37] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [65:44] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'LinearStateQueryCriteria' @ [67:28] ==> @JvmOverloads public constructor LinearStateQueryCriteria(participants: List<AbstractParty>? = ..., uuid: List<UUID>? = ..., externalId: List<String>? = ..., status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.LinearStateQueryCriteria[DeserializedClassConstructorDescriptor]

'listOf' @ [67:68] ==> public fun <T> listOf(element: Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'otherParty' @ [67:75] ==> public final val otherParty: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'serviceHub' @ [68:26] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'vaultQueryService' @ [68:37] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [68:55] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<IRSState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> IRSState

'criteria' @ [68:73] ==> val criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.vega.flows.SimmFlow.Requester.call[LocalVariableDescriptor]

'states' @ [68:83] ==> public final val states: List<StateAndRef<IRSState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'Portfolio' @ [70:29] ==> public constructor Portfolio(tradeStateAndRefs: List<StateAndRef<IRSState>>, valuationDate: LocalDate? = ...) defined in net.corda.vega.portfolio.Portfolio[ClassConstructorDescriptorImpl]

'trades' @ [70:39] ==> val trades: List<StateAndRef<IRSState>> defined in net.corda.vega.flows.SimmFlow.Requester.call[LocalVariableDescriptor]

'valuationDate' @ [70:47] ==> public final val valuationDate: LocalDate defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'if (existing == null) {
                agreePortfolio(portfolio)
            } else {
                updatePortfolio(portfolio, existing)
            }' @ [71:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'existing' @ [71:17] ==> public final val existing: StateAndRef<PortfolioState>? defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'agreePortfolio' @ [72:17] ==> @Suspendable private final fun agreePortfolio(portfolio: Portfolio): Unit defined in net.corda.vega.flows.SimmFlow.Requester[SimpleFunctionDescriptorImpl]

'portfolio' @ [72:32] ==> val portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Requester.call[LocalVariableDescriptor]

'updatePortfolio' @ [74:17] ==> @Suspendable private final fun updatePortfolio(portfolio: Portfolio, stateAndRef: StateAndRef<PortfolioState>): Unit defined in net.corda.vega.flows.SimmFlow.Requester[SimpleFunctionDescriptorImpl]

'portfolio' @ [74:33] ==> val portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Requester.call[LocalVariableDescriptor]

'existing' @ [74:44] ==> public final val existing: StateAndRef<PortfolioState>? defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'serviceHub' @ [76:37] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'vaultQueryService' @ [76:48] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [76:66] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<PortfolioState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> PortfolioState

'criteria' @ [76:90] ==> val criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.vega.flows.SimmFlow.Requester.call[LocalVariableDescriptor]

'states' @ [76:100] ==> public final val states: List<StateAndRef<PortfolioState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'first' @ [76:107] ==> public fun <T> List<StateAndRef<PortfolioState>>.first(): StateAndRef<PortfolioState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<PortfolioState>

'updateValuation' @ [78:25] ==> @Suspendable private final fun updateValuation(stateRef: StateAndRef<PortfolioState>): RevisionedState<PortfolioState.Update> defined in net.corda.vega.flows.SimmFlow.Requester[SimpleFunctionDescriptorImpl]

'portfolioStateRef' @ [78:41] ==> val portfolioStateRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmFlow.Requester.call[LocalVariableDescriptor]

'logger' @ [79:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'info' @ [79:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'state' @ [80:20] ==> val state: RevisionedState<PortfolioState.Update> defined in net.corda.vega.flows.SimmFlow.Requester.call[LocalVariableDescriptor]

'Suspendable' @ [83:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [85:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'info' @ [85:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'Pair' @ [86:27] ==> public constructor Pair<out A, out B>(first: Party, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Party
    <out B> -> Party

'myIdentity' @ [86:32] ==> public final lateinit var myIdentity: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'otherParty' @ [86:44] ==> public final val otherParty: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'PortfolioState' @ [87:34] ==> public constructor PortfolioState(portfolio: List<StateRef>, contract: PortfolioSwap, _parties: Pair<AbstractParty, AbstractParty>, valuationDate: LocalDate, valuation: PortfolioValuation? = ..., linearId: UniqueIdentifier = ...) defined in net.corda.vega.contracts.PortfolioState[ClassConstructorDescriptorImpl]

'portfolio' @ [87:49] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Requester.agreePortfolio[ValueParameterDescriptorImpl]

'refs' @ [87:59] ==> public final val refs: List<StateRef> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'PortfolioSwap' @ [87:65] ==> public constructor PortfolioSwap(blank: Void? = ...) defined in net.corda.vega.contracts.PortfolioSwap[ClassConstructorDescriptorImpl]

'parties' @ [87:82] ==> val parties: Pair<Party, Party> defined in net.corda.vega.flows.SimmFlow.Requester.agreePortfolio[LocalVariableDescriptor]

'valuationDate' @ [87:91] ==> public final val valuationDate: LocalDate defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'send' @ [89:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [89:18] ==> public final val otherParty: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'OfferMessage' @ [89:30] ==> public constructor OfferMessage(notary: Party, dealBeingOffered: PortfolioState, stateRef: StateRef?, valuationDate: LocalDate) defined in net.corda.vega.flows.SimmFlow.OfferMessage[ClassConstructorDescriptorImpl]

'notary' @ [89:43] ==> public final lateinit var notary: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'portfolioState' @ [89:51] ==> val portfolioState: PortfolioState defined in net.corda.vega.flows.SimmFlow.Requester.agreePortfolio[LocalVariableDescriptor]

'existing' @ [89:67] ==> public final val existing: StateAndRef<PortfolioState>? defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'ref' @ [89:77] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'valuationDate' @ [89:82] ==> public final val valuationDate: LocalDate defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'logger' @ [90:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'info' @ [90:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'subFlow' @ [91:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'Acceptor' @ [91:38] ==> public constructor Acceptor(otherParty: Party, progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Acceptor[DeserializedClassConstructorDescriptor]

'otherParty' @ [91:47] ==> public final val otherParty: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'Suspendable' @ [94:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'sendAndReceive' @ [97:13] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<SimmFlow.Ack> defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Ack

'otherParty' @ [97:33] ==> public final val otherParty: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'OfferMessage' @ [97:45] ==> public constructor OfferMessage(notary: Party, dealBeingOffered: PortfolioState, stateRef: StateRef?, valuationDate: LocalDate) defined in net.corda.vega.flows.SimmFlow.OfferMessage[ClassConstructorDescriptorImpl]

'notary' @ [97:58] ==> public final lateinit var notary: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'stateAndRef' @ [97:66] ==> value-parameter stateAndRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmFlow.Requester.updatePortfolio[ValueParameterDescriptorImpl]

'state' @ [97:78] ==> public final val state: TransactionState<PortfolioState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [97:84] ==> public final val data: PortfolioState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'existing' @ [97:90] ==> public final val existing: StateAndRef<PortfolioState>? defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'ref' @ [97:100] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'valuationDate' @ [97:105] ==> public final val valuationDate: LocalDate defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'logger' @ [98:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'info' @ [98:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'Update' @ [99:41] ==> public constructor Update(portfolio: List<StateRef>? = ..., valuation: PortfolioValuation? = ...) defined in net.corda.vega.contracts.PortfolioState.Update[ClassConstructorDescriptorImpl]

'portfolio' @ [99:60] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Requester.updatePortfolio[ValueParameterDescriptorImpl]

'refs' @ [99:70] ==> public final val refs: List<StateRef> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'subFlow' @ [100:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<StateAndRef<RevisionedState<PortfolioState.Update>>>): StateAndRef<RevisionedState<PortfolioState.Update>> defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StateAndRef<RevisionedState<Update>>

'Requester' @ [100:39] ==> public constructor Requester<T>(curStateRef: StateAndRef<RevisionedState<PortfolioState.Update>>, updatedData: PortfolioState.Update) defined in net.corda.vega.flows.StateRevisionFlow.Requester[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Update

'stateAndRef' @ [100:49] ==> value-parameter stateAndRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmFlow.Requester.updatePortfolio[ValueParameterDescriptorImpl]

'update' @ [100:62] ==> val update: PortfolioState.Update defined in net.corda.vega.flows.SimmFlow.Requester.updatePortfolio[LocalVariableDescriptor]

'Suspendable' @ [103:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [105:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'info' @ [105:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'stateRef' @ [106:25] ==> value-parameter stateRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmFlow.Requester.updateValuation[ValueParameterDescriptorImpl]

'state' @ [106:34] ==> public final val state: TransactionState<PortfolioState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [106:40] ==> public final val data: PortfolioState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'serviceHub' @ [107:29] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'vaultQueryService' @ [107:40] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [107:58] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<IRSState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> IRSState

'VaultQueryCriteria' @ [107:76] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'state' @ [107:107] ==> val state: PortfolioState defined in net.corda.vega.flows.SimmFlow.Requester.updateValuation[LocalVariableDescriptor]

'portfolio' @ [107:113] ==> public final val portfolio: List<StateRef> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'states' @ [107:125] ==> public final val states: List<StateAndRef<IRSState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'toPortfolio' @ [107:132] ==> public fun List<StateAndRef<IRSState>>.toPortfolio(): Portfolio defined in net.corda.vega.portfolio in file Portfolio.kt[SimpleFunctionDescriptorImpl]

'serviceHub' @ [109:26] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'identityService' @ [109:37] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [109:53] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'state' @ [109:72] ==> val state: PortfolioState defined in net.corda.vega.flows.SimmFlow.Requester.updateValuation[LocalVariableDescriptor]

'valuer' @ [109:78] ==> public final val valuer: AbstractParty defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'require' @ [110:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'valuer' @ [110:21] ==> val valuer: Party? defined in net.corda.vega.flows.SimmFlow.Requester.updateValuation[LocalVariableDescriptor]

'agreeValuation' @ [111:29] ==> @Suspendable private final fun agreeValuation(portfolio: Portfolio, asOf: LocalDate, valuer: Party): PortfolioValuation defined in net.corda.vega.flows.SimmFlow.Requester[SimpleFunctionDescriptorImpl]

'portfolio' @ [111:44] ==> val portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Requester.updateValuation[LocalVariableDescriptor]

'valuationDate' @ [111:55] ==> public final val valuationDate: LocalDate defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'valuer' @ [111:70] ==> val valuer: Party? defined in net.corda.vega.flows.SimmFlow.Requester.updateValuation[LocalVariableDescriptor]

'Update' @ [112:41] ==> public constructor Update(portfolio: List<StateRef>? = ..., valuation: PortfolioValuation? = ...) defined in net.corda.vega.contracts.PortfolioState.Update[ClassConstructorDescriptorImpl]

'valuation' @ [112:60] ==> val valuation: PortfolioValuation defined in net.corda.vega.flows.SimmFlow.Requester.updateValuation[LocalVariableDescriptor]

'subFlow' @ [113:20] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<StateAndRef<RevisionedState<PortfolioState.Update>>>): StateAndRef<RevisionedState<PortfolioState.Update>> defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> StateAndRef<RevisionedState<Update>>

'Requester' @ [113:46] ==> public constructor Requester<T>(curStateRef: StateAndRef<RevisionedState<PortfolioState.Update>>, updatedData: PortfolioState.Update) defined in net.corda.vega.flows.StateRevisionFlow.Requester[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Update

'stateRef' @ [113:56] ==> value-parameter stateRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmFlow.Requester.updateValuation[ValueParameterDescriptorImpl]

'update' @ [113:66] ==> val update: PortfolioState.Update defined in net.corda.vega.flows.SimmFlow.Requester.updateValuation[LocalVariableDescriptor]

'state' @ [113:75] ==> public final val state: TransactionState<RevisionedState<PortfolioState.Update>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [113:81] ==> public final val data: RevisionedState<PortfolioState.Update> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'Suspendable' @ [116:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'OGSIMMAnalyticsEngine' @ [120:35] ==> public constructor OGSIMMAnalyticsEngine() defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[ClassConstructorDescriptorImpl]

'standard' @ [122:47] ==> public open fun standard(): (ReferenceData..ReferenceData?) defined in com.opengamma.strata.basics.ReferenceData[JavaMethodDescriptor]

'analyticsEngine' @ [123:30] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'curveGroup' @ [123:46] ==> public open fun curveGroup(): CurveGroupDefinition defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'analyticsEngine' @ [124:30] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'marketData' @ [124:46] ==> public open fun marketData(asOf: LocalDate): MarketData defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'asOf' @ [124:57] ==> value-parameter asOf: LocalDate defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[ValueParameterDescriptorImpl]

'DEFAULT' @ [126:55] ==> public final val DEFAULT: (DiscountingSwapProductPricer..DiscountingSwapProductPricer?) defined in com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer[JavaPropertyDescriptor]

'portfolio' @ [127:28] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[ValueParameterDescriptorImpl]

'swaps' @ [127:38] ==> public final val swaps: List<SwapData> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'map' @ [127:44] ==> public inline fun <T, R> Iterable<SwapData>.map(transform: (SwapData) -> (ResolvedSwapTrade..ResolvedSwapTrade?)): List<(ResolvedSwapTrade..ResolvedSwapTrade?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SwapData
    <R> -> (com.opengamma.strata.product.swap.ResolvedSwapTrade..com.opengamma.strata.product.swap.ResolvedSwapTrade?)

'it' @ [127:56] ==> value-parameter it: SwapData defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'toFixedLeg' @ [127:59] ==> public final fun toFixedLeg(): SwapTrade defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'resolve' @ [127:72] ==> public open fun resolve(p0: (ReferenceData..ReferenceData?)): (ResolvedSwapTrade..ResolvedSwapTrade?) defined in com.opengamma.strata.product.swap.SwapTrade[JavaMethodDescriptor]

'referenceData' @ [127:80] ==> val referenceData: (ReferenceData..ReferenceData?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'of' @ [128:46] ==> public open fun of(p0: Double, p1: Double, p2: Int, p3: (CalibrationMeasures..CalibrationMeasures?)): (CurveCalibrator..CurveCalibrator?) defined in com.opengamma.strata.pricer.curve.CurveCalibrator[JavaMethodDescriptor]

'PAR_SPREAD' @ [128:86] ==> public final val PAR_SPREAD: (CalibrationMeasures..CalibrationMeasures?) defined in com.opengamma.strata.pricer.curve.CalibrationMeasures[JavaPropertyDescriptor]

'calibrator' @ [130:33] ==> val calibrator: (CurveCalibrator..CurveCalibrator?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'calibrate' @ [130:44] ==> public open fun calibrate(p0: (CurveGroupDefinition..CurveGroupDefinition?), p1: (MarketData..MarketData?), p2: (ReferenceData..ReferenceData?)): (ImmutableRatesProvider..ImmutableRatesProvider?) defined in com.opengamma.strata.pricer.curve.CurveCalibrator[JavaMethodDescriptor]

'curveGroup' @ [130:54] ==> val curveGroup: CurveGroupDefinition defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'marketData' @ [130:66] ==> val marketData: MarketData defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'standard' @ [130:92] ==> public open fun standard(): (ReferenceData..ReferenceData?) defined in com.opengamma.strata.basics.ReferenceData[JavaMethodDescriptor]

'of' @ [131:59] ==> public open fun of(p0: (MarketData..MarketData?)): (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in com.opengamma.strata.data.MarketDataFxRateProvider[JavaMethodDescriptor]

'marketData' @ [131:62] ==> val marketData: MarketData defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'combined' @ [132:64] ==> public open fun combined(p0: (FxRateProvider..FxRateProvider?), vararg p1: (ImmutableRatesProvider..ImmutableRatesProvider?)): (ImmutableRatesProvider..ImmutableRatesProvider?) defined in com.opengamma.strata.pricer.rate.ImmutableRatesProvider[JavaMethodDescriptor]

'fxRateProvider' @ [132:73] ==> val fxRateProvider: (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'ratesProvider' @ [132:89] ==> val ratesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'OGTrades' @ [134:23] ==> val OGTrades: List<(ResolvedSwapTrade..ResolvedSwapTrade?)> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'map' @ [134:32] ==> public inline fun <T, R> Iterable<(ResolvedSwapTrade..ResolvedSwapTrade?)>.map(transform: ((ResolvedSwapTrade..ResolvedSwapTrade?)) -> Pair<(String..String?), MultiCurrencyAmount>): List<Pair<(String..String?), MultiCurrencyAmount>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.product.swap.ResolvedSwapTrade..com.opengamma.strata.product.swap.ResolvedSwapTrade?)
    <R> -> Pair<(kotlin.String..kotlin.String?), MultiCurrencyAmount>

'it' @ [134:38] ==> value-parameter it: (ResolvedSwapTrade..ResolvedSwapTrade?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [134:41] ==> public final val ResolvedSwapTrade.info: (TradeInfo..TradeInfo?)[MyPropertyDescriptor]

'id' @ [134:46] ==> public final val TradeInfo.id: (Optional<(StandardId..StandardId?)>..Optional<(StandardId..StandardId?)>?)[MyPropertyDescriptor]

'get' @ [134:49] ==> public open fun get(): StandardId defined in java.util.Optional[JavaMethodDescriptor]

'value' @ [134:55] ==> public final val StandardId.value: (String..String?)[MyPropertyDescriptor]

'pricer' @ [134:64] ==> val pricer: (DiscountingSwapProductPricer..DiscountingSwapProductPricer?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'presentValue' @ [134:71] ==> public open fun presentValue(p0: (ResolvedSwap..ResolvedSwap?), p1: (RatesProvider..RatesProvider?)): (MultiCurrencyAmount..MultiCurrencyAmount?) defined in com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer[JavaMethodDescriptor]

'it' @ [134:84] ==> value-parameter it: (ResolvedSwapTrade..ResolvedSwapTrade?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'product' @ [134:87] ==> public final val ResolvedSwapTrade.product: (ResolvedSwap..ResolvedSwap?)[MyPropertyDescriptor]

'combinedRatesProvider' @ [134:96] ==> val combinedRatesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'toCordaCompatible' @ [134:119] ==> public fun MultiCurrencyAmount.toCordaCompatible(): MultiCurrencyAmount defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'toMap' @ [134:141] ==> public fun <K, V> Iterable<Pair<(String..String?), MultiCurrencyAmount>>.toMap(): Map<(String..String?), MultiCurrencyAmount> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> MultiCurrencyAmount

'analyticsEngine' @ [136:33] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'sensitivities' @ [136:49] ==> public open fun sensitivities(trades: List<ResolvedSwapTrade>, pricer: DiscountingSwapProductPricer, combinedRatesProvider: ImmutableRatesProvider): Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'OGTrades' @ [136:63] ==> val OGTrades: List<(ResolvedSwapTrade..ResolvedSwapTrade?)> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'pricer' @ [136:73] ==> val pricer: (DiscountingSwapProductPricer..DiscountingSwapProductPricer?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'ratesProvider' @ [136:81] ==> val ratesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'PortfolioNormalizer' @ [137:30] ==> public constructor PortfolioNormalizer(eur: Currency?, combinedRatesProvider: ImmutableRatesProvider?) defined in net.corda.vega.analytics.PortfolioNormalizer[ClassConstructorDescriptorImpl]

'EUR' @ [137:59] ==> public final val EUR: (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaPropertyDescriptor]

'combinedRatesProvider' @ [137:64] ==> val combinedRatesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'RwamBimmNotProductClassesCalculator' @ [138:35] ==> public constructor RwamBimmNotProductClassesCalculator(fxRateProvider: MarketDataFxRateProvider?, eur: Currency?, instance: Any) defined in net.corda.vega.analytics.RwamBimmNotProductClassesCalculator[ClassConstructorDescriptorImpl]

'fxRateProvider' @ [138:71] ==> val fxRateProvider: (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'EUR' @ [138:96] ==> public final val EUR: (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaPropertyDescriptor]

'INSTANCE' @ [138:119] ==> public object INSTANCE defined in net.corda.vega.analytics.IsdaConfiguration[FakeCallableDescriptorForObject]

'BimmAnalysisUtils' @ [139:26] ==> @Suppress public object BimmAnalysisUtils defined in net.corda.vega.analytics in file OGStub.kt[FakeCallableDescriptorForObject]

'computeMargin' @ [139:44] ==> public final fun computeMargin(combinedRatesProvider: ImmutableRatesProvider?, normalizer: PortfolioNormalizer, calculatorTotal: RwamBimmNotProductClassesCalculator, first: CurrencyParameterSensitivities, second: MultiCurrencyAmount): Triple<Double, Double, Double> defined in net.corda.vega.analytics.BimmAnalysisUtils[SimpleFunctionDescriptorImpl]

'combinedRatesProvider' @ [139:58] ==> val combinedRatesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'normalizer' @ [139:81] ==> val normalizer: PortfolioNormalizer defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'calculatorTotal' @ [139:93] ==> val calculatorTotal: RwamBimmNotProductClassesCalculator defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'sensitivities' @ [139:110] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'first' @ [139:124] ==> public final val first: CurrencyParameterSensitivities defined in kotlin.Pair[DeserializedPropertyDescriptor]

'sensitivities' @ [139:131] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'second' @ [139:145] ==> public final val second: MultiCurrencyAmount defined in kotlin.Pair[DeserializedPropertyDescriptor]

'analyticsEngine' @ [140:29] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'calculateSensitivitiesBatch' @ [140:45] ==> public open fun calculateSensitivitiesBatch(trades: List<ResolvedSwapTrade>, pricer: DiscountingSwapProductPricer, ratesProvider: ImmutableRatesProvider): Map<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'OGTrades' @ [140:73] ==> val OGTrades: List<(ResolvedSwapTrade..ResolvedSwapTrade?)> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'pricer' @ [140:83] ==> val pricer: (DiscountingSwapProductPricer..DiscountingSwapProductPricer?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'ratesProvider' @ [140:91] ==> val ratesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'fxRateProvider' @ [142:35] ==> val fxRateProvider: (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'marketData' @ [142:50] ==> public final val MarketDataFxRateProvider.marketData: (MarketData..MarketData?)[MyPropertyDescriptor]

'toCordaCompatible' @ [142:61] ==> public fun MarketData.toCordaCompatible(): CordaMarketData defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'InitialMarginTriple' @ [143:31] ==> public constructor InitialMarginTriple(first: Double, second: Double, third: Double) defined in net.corda.vega.analytics.InitialMarginTriple[ClassConstructorDescriptorImpl]

'margin' @ [143:51] ==> val margin: Triple<Double, Double, Double> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'first' @ [143:58] ==> public final val first: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'margin' @ [143:65] ==> val margin: Triple<Double, Double, Double> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'second' @ [143:72] ==> public final val second: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'margin' @ [143:80] ==> val margin: Triple<Double, Double, Double> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'third' @ [143:87] ==> public final val third: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [143:94] ==> public fun InitialMarginTriple.toCordaCompatible(): InitialMarginTriple defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'analyticsEngine' @ [144:27] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'calculateMarginBatch' @ [144:43] ==> public open fun calculateMarginBatch(tradeSensitivitiesMap: Map<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount>, combinedRatesProvider: ImmutableRatesProvider, fxRateProvider: MarketDataFxRateProvider, portfolioMargin: InitialMarginTriple): Map<ResolvedSwapTrade, InitialMarginTriple> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'sensBatch' @ [144:64] ==> val sensBatch: Map<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'combinedRatesProvider' @ [144:75] ==> val combinedRatesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'fxRateProvider' @ [144:98] ==> val fxRateProvider: (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'cordaMargin' @ [144:114] ==> val cordaMargin: InitialMarginTriple defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'imBatch' @ [145:30] ==> val imBatch: Map<ResolvedSwapTrade, InitialMarginTriple> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'map' @ [145:38] ==> public inline fun <K, V, R> Map<out ResolvedSwapTrade, InitialMarginTriple>.map(transform: (Map.Entry<ResolvedSwapTrade, InitialMarginTriple>) -> Pair<(String..String?), InitialMarginTriple>): List<Pair<(String..String?), InitialMarginTriple>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ResolvedSwapTrade
    <V> -> InitialMarginTriple
    <R> -> Pair<(kotlin.String..kotlin.String?), InitialMarginTriple>

'it' @ [145:44] ==> value-parameter it: Map.Entry<ResolvedSwapTrade, InitialMarginTriple> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [145:47] ==> public abstract val key: ResolvedSwapTrade defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'info' @ [145:51] ==> public final val ResolvedSwapTrade.info: (TradeInfo..TradeInfo?)[MyPropertyDescriptor]

'id' @ [145:56] ==> public final val TradeInfo.id: (Optional<(StandardId..StandardId?)>..Optional<(StandardId..StandardId?)>?)[MyPropertyDescriptor]

'get' @ [145:59] ==> public open fun get(): StandardId defined in java.util.Optional[JavaMethodDescriptor]

'value' @ [145:65] ==> public final val StandardId.value: (String..String?)[MyPropertyDescriptor]

'it' @ [145:74] ==> value-parameter it: Map.Entry<ResolvedSwapTrade, InitialMarginTriple> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [145:77] ==> public abstract val value: InitialMarginTriple defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [145:83] ==> public fun InitialMarginTriple.toCordaCompatible(): InitialMarginTriple defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'toMap' @ [145:105] ==> public fun <K, V> Iterable<Pair<(String..String?), InitialMarginTriple>>.toMap(): Map<(String..String?), InitialMarginTriple> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> InitialMarginTriple

'require' @ [147:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'agree' @ [147:21] ==> @Suspendable private final inline fun <reified T : Any> agree(data: CordaMarketData): Boolean defined in net.corda.vega.flows.SimmFlow.Requester[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> CordaMarketData

'cordaMarketData' @ [147:27] ==> val cordaMarketData: CordaMarketData defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'require' @ [148:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'agree' @ [148:21] ==> @Suspendable private final inline fun <reified T : Any> agree(data: CurrencyParameterSensitivities): Boolean defined in net.corda.vega.flows.SimmFlow.Requester[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> CurrencyParameterSensitivities

'sensitivities' @ [148:27] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'first' @ [148:41] ==> public final val first: CurrencyParameterSensitivities defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [148:47] ==> public fun CurrencyParameterSensitivities.toCordaCompatible(): CurrencyParameterSensitivities defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'require' @ [149:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'agree' @ [149:21] ==> @Suspendable private final inline fun <reified T : Any> agree(data: MultiCurrencyAmount): Boolean defined in net.corda.vega.flows.SimmFlow.Requester[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> MultiCurrencyAmount

'sensitivities' @ [149:27] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'second' @ [149:41] ==> public final val second: MultiCurrencyAmount defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [149:48] ==> public fun MultiCurrencyAmount.toCordaCompatible(): MultiCurrencyAmount defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'require' @ [150:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'agree' @ [150:21] ==> @Suspendable private final inline fun <reified T : Any> agree(data: InitialMarginTriple): Boolean defined in net.corda.vega.flows.SimmFlow.Requester[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> InitialMarginTriple

'cordaMargin' @ [150:27] ==> val cordaMargin: InitialMarginTriple defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'PortfolioValuation' @ [152:20] ==> public constructor PortfolioValuation(trades: Int, notional: BigDecimal, marketData: CordaMarketData, totalSensivities: CurrencyParameterSensitivities, currencySensitivies: MultiCurrencyAmount, margin: InitialMarginTriple, imContributionMap: Map<String, InitialMarginTriple>?, presentValues: Map<String, MultiCurrencyAmount>) defined in net.corda.vega.contracts.PortfolioValuation[ClassConstructorDescriptorImpl]

'portfolio' @ [153:21] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[ValueParameterDescriptorImpl]

'trades' @ [153:31] ==> public final val trades: List<IRSState> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'size' @ [153:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'portfolio' @ [154:21] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[ValueParameterDescriptorImpl]

'getNotionalForParty' @ [154:31] ==> public final fun getNotionalForParty(party: Party): BigDecimal defined in net.corda.vega.portfolio.Portfolio[SimpleFunctionDescriptorImpl]

'valuer' @ [154:51] ==> value-parameter valuer: Party defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[ValueParameterDescriptorImpl]

'cordaMarketData' @ [155:21] ==> val cordaMarketData: CordaMarketData defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'sensitivities' @ [156:21] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'first' @ [156:35] ==> public final val first: CurrencyParameterSensitivities defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [156:41] ==> public fun CurrencyParameterSensitivities.toCordaCompatible(): CurrencyParameterSensitivities defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'sensitivities' @ [157:21] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'second' @ [157:35] ==> public final val second: MultiCurrencyAmount defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [157:42] ==> public fun MultiCurrencyAmount.toCordaCompatible(): MultiCurrencyAmount defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'cordaMargin' @ [158:21] ==> val cordaMargin: InitialMarginTriple defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'cordaIMMap' @ [159:21] ==> val cordaIMMap: Map<(String..String?), InitialMarginTriple> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'PVs' @ [160:21] ==> val PVs: Map<(String..String?), MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Requester.agreeValuation[LocalVariableDescriptor]

'Suspendable' @ [166:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'receive' @ [168:25] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<T> defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> T

'otherParty' @ [168:36] ==> public final val otherParty: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'unwrap' @ [168:48] ==> public inline fun <T, R> UntrustworthyData<T>.unwrap(validator: (T) -> Boolean): Boolean defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> Boolean

'logger' @ [169:17] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'trace' @ [169:24] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'it' @ [169:46] ==> value-parameter it: T defined in net.corda.vega.flows.SimmFlow.Requester.agree.<anonymous>[ValueParameterDescriptorImpl]

'logger' @ [170:17] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'trace' @ [170:24] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'data' @ [170:46] ==> value-parameter data: T defined in net.corda.vega.flows.SimmFlow.Requester.agree[ValueParameterDescriptorImpl]

'if (it is InitialMarginTriple && data is InitialMarginTriple) {
                    compareIMTriples(it, data)
                } else {
                    it == data
                }' @ [171:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'it' @ [171:21] ==> value-parameter it: T defined in net.corda.vega.flows.SimmFlow.Requester.agree.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [171:50] ==> value-parameter data: T defined in net.corda.vega.flows.SimmFlow.Requester.agree[ValueParameterDescriptorImpl]

'compareIMTriples' @ [172:21] ==> public fun compareIMTriples(a: InitialMarginTriple, b: InitialMarginTriple): Boolean defined in net.corda.vega.analytics in file OGUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [172:38] ==> value-parameter it: T defined in net.corda.vega.flows.SimmFlow.Requester.agree.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [172:42] ==> value-parameter data: T defined in net.corda.vega.flows.SimmFlow.Requester.agree[ValueParameterDescriptorImpl]

'it' @ [174:21] ==> value-parameter it: T defined in net.corda.vega.flows.SimmFlow.Requester.agree.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [174:27] ==> value-parameter data: T defined in net.corda.vega.flows.SimmFlow.Requester.agree[ValueParameterDescriptorImpl]

'logger' @ [177:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedPropertyDescriptor]

'trace' @ [177:20] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'valid' @ [177:37] ==> val valid: Boolean defined in net.corda.vega.flows.SimmFlow.Requester.agree[LocalVariableDescriptor]

'send' @ [178:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.vega.flows.SimmFlow.Requester[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [178:18] ==> public final val otherParty: Party defined in net.corda.vega.flows.SimmFlow.Requester[PropertyDescriptorImpl]

'valid' @ [178:30] ==> val valid: Boolean defined in net.corda.vega.flows.SimmFlow.Requester.agree[LocalVariableDescriptor]

'valid' @ [179:20] ==> val valid: Boolean defined in net.corda.vega.flows.SimmFlow.Requester.agree[LocalVariableDescriptor]

'InitiatedBy' @ [186:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'FlowLogic<Unit>' @ [187:47] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [191:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'ownParty' @ [193:13] ==> public final lateinit var ownParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'serviceHub' @ [193:24] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'myInfo' @ [193:35] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [193:42] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'LinearStateQueryCriteria' @ [195:28] ==> @JvmOverloads public constructor LinearStateQueryCriteria(participants: List<AbstractParty>? = ..., uuid: List<UUID>? = ..., externalId: List<String>? = ..., status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.LinearStateQueryCriteria[DeserializedClassConstructorDescriptor]

'listOf' @ [195:68] ==> public fun <T> listOf(element: Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'replyToParty' @ [195:75] ==> public final val replyToParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'serviceHub' @ [196:26] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'vaultQueryService' @ [196:37] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [196:55] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<IRSState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> IRSState

'criteria' @ [196:73] ==> val criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.vega.flows.SimmFlow.Receiver.call[LocalVariableDescriptor]

'states' @ [196:83] ==> public final val states: List<StateAndRef<IRSState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'Portfolio' @ [197:29] ==> public constructor Portfolio(tradeStateAndRefs: List<StateAndRef<IRSState>>, valuationDate: LocalDate? = ...) defined in net.corda.vega.portfolio.Portfolio[ClassConstructorDescriptorImpl]

'trades' @ [197:39] ==> val trades: List<StateAndRef<IRSState>> defined in net.corda.vega.flows.SimmFlow.Receiver.call[LocalVariableDescriptor]

'logger' @ [198:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'info' @ [198:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'offer' @ [199:13] ==> public final lateinit var offer: SimmFlow.OfferMessage defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'receive' @ [199:21] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<SimmFlow.OfferMessage> defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> OfferMessage

'replyToParty' @ [199:43] ==> public final val replyToParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'unwrap' @ [199:57] ==> public inline fun <T, R> UntrustworthyData<SimmFlow.OfferMessage>.unwrap(validator: (SimmFlow.OfferMessage) -> SimmFlow.OfferMessage): SimmFlow.OfferMessage defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OfferMessage
    <R> -> OfferMessage

'it' @ [199:66] ==> value-parameter it: SimmFlow.OfferMessage defined in net.corda.vega.flows.SimmFlow.Receiver.call.<anonymous>[ValueParameterDescriptorImpl]

'if (offer.stateRef == null) {
                agreePortfolio(portfolio)
            } else {
                updatePortfolio(portfolio)
            }' @ [200:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'offer' @ [200:17] ==> public final lateinit var offer: SimmFlow.OfferMessage defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'stateRef' @ [200:23] ==> public final val stateRef: StateRef? defined in net.corda.vega.flows.SimmFlow.OfferMessage[PropertyDescriptorImpl]

'agreePortfolio' @ [201:17] ==> @Suspendable private final fun agreePortfolio(portfolio: Portfolio): SignedTransaction defined in net.corda.vega.flows.SimmFlow.Receiver[SimpleFunctionDescriptorImpl]

'portfolio' @ [201:32] ==> val portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Receiver.call[LocalVariableDescriptor]

'updatePortfolio' @ [203:17] ==> @Suspendable private final fun updatePortfolio(portfolio: Portfolio): Unit defined in net.corda.vega.flows.SimmFlow.Receiver[SimpleFunctionDescriptorImpl]

'portfolio' @ [203:33] ==> val portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Receiver.call[LocalVariableDescriptor]

'serviceHub' @ [205:37] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'vaultQueryService' @ [205:48] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [205:66] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<PortfolioState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> PortfolioState

'criteria' @ [205:90] ==> val criteria: QueryCriteria.LinearStateQueryCriteria defined in net.corda.vega.flows.SimmFlow.Receiver.call[LocalVariableDescriptor]

'states' @ [205:100] ==> public final val states: List<StateAndRef<PortfolioState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'first' @ [205:107] ==> public fun <T> List<StateAndRef<PortfolioState>>.first(): StateAndRef<PortfolioState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<PortfolioState>

'updateValuation' @ [206:13] ==> @Suspendable private final fun updateValuation(stateRef: StateAndRef<PortfolioState>): Unit defined in net.corda.vega.flows.SimmFlow.Receiver[SimpleFunctionDescriptorImpl]

'portfolioStateRef' @ [206:29] ==> val portfolioStateRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmFlow.Receiver.call[LocalVariableDescriptor]

'Suspendable' @ [209:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'send' @ [211:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedSimpleFunctionDescriptor]

'replyToParty' @ [211:18] ==> public final val replyToParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'data' @ [211:32] ==> value-parameter data: Any defined in net.corda.vega.flows.SimmFlow.Receiver.agree[ValueParameterDescriptorImpl]

'receive' @ [212:20] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<Boolean> defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Boolean

'replyToParty' @ [212:37] ==> public final val replyToParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'unwrap' @ [212:51] ==> public inline fun <T, R> UntrustworthyData<Boolean>.unwrap(validator: (Boolean) -> Boolean): Boolean defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean
    <R> -> Boolean

'it' @ [212:60] ==> value-parameter it: Boolean defined in net.corda.vega.flows.SimmFlow.Receiver.agree.<anonymous>[ValueParameterDescriptorImpl]

'Suspendable' @ [237:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'OGSIMMAnalyticsEngine' @ [241:35] ==> public constructor OGSIMMAnalyticsEngine() defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[ClassConstructorDescriptorImpl]

'standard' @ [243:47] ==> public open fun standard(): (ReferenceData..ReferenceData?) defined in com.opengamma.strata.basics.ReferenceData[JavaMethodDescriptor]

'analyticsEngine' @ [244:30] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'curveGroup' @ [244:46] ==> public open fun curveGroup(): CurveGroupDefinition defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'analyticsEngine' @ [245:30] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'marketData' @ [245:46] ==> public open fun marketData(asOf: LocalDate): MarketData defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'asOf' @ [245:57] ==> value-parameter asOf: LocalDate defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[ValueParameterDescriptorImpl]

'DEFAULT' @ [247:55] ==> public final val DEFAULT: (DiscountingSwapProductPricer..DiscountingSwapProductPricer?) defined in com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer[JavaPropertyDescriptor]

'portfolio' @ [248:28] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[ValueParameterDescriptorImpl]

'swaps' @ [248:38] ==> public final val swaps: List<SwapData> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'map' @ [248:44] ==> public inline fun <T, R> Iterable<SwapData>.map(transform: (SwapData) -> (ResolvedSwapTrade..ResolvedSwapTrade?)): List<(ResolvedSwapTrade..ResolvedSwapTrade?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SwapData
    <R> -> (com.opengamma.strata.product.swap.ResolvedSwapTrade..com.opengamma.strata.product.swap.ResolvedSwapTrade?)

'it' @ [248:56] ==> value-parameter it: SwapData defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'toFixedLeg' @ [248:59] ==> public final fun toFixedLeg(): SwapTrade defined in net.corda.vega.contracts.SwapData[SimpleFunctionDescriptorImpl]

'resolve' @ [248:72] ==> public open fun resolve(p0: (ReferenceData..ReferenceData?)): (ResolvedSwapTrade..ResolvedSwapTrade?) defined in com.opengamma.strata.product.swap.SwapTrade[JavaMethodDescriptor]

'referenceData' @ [248:80] ==> val referenceData: (ReferenceData..ReferenceData?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'of' @ [249:46] ==> public open fun of(p0: Double, p1: Double, p2: Int, p3: (CalibrationMeasures..CalibrationMeasures?)): (CurveCalibrator..CurveCalibrator?) defined in com.opengamma.strata.pricer.curve.CurveCalibrator[JavaMethodDescriptor]

'PAR_SPREAD' @ [249:86] ==> public final val PAR_SPREAD: (CalibrationMeasures..CalibrationMeasures?) defined in com.opengamma.strata.pricer.curve.CalibrationMeasures[JavaPropertyDescriptor]

'calibrator' @ [251:33] ==> val calibrator: (CurveCalibrator..CurveCalibrator?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'calibrate' @ [251:44] ==> public open fun calibrate(p0: (CurveGroupDefinition..CurveGroupDefinition?), p1: (MarketData..MarketData?), p2: (ReferenceData..ReferenceData?)): (ImmutableRatesProvider..ImmutableRatesProvider?) defined in com.opengamma.strata.pricer.curve.CurveCalibrator[JavaMethodDescriptor]

'curveGroup' @ [251:54] ==> val curveGroup: CurveGroupDefinition defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'marketData' @ [251:66] ==> val marketData: MarketData defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'standard' @ [251:92] ==> public open fun standard(): (ReferenceData..ReferenceData?) defined in com.opengamma.strata.basics.ReferenceData[JavaMethodDescriptor]

'of' @ [252:59] ==> public open fun of(p0: (MarketData..MarketData?)): (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in com.opengamma.strata.data.MarketDataFxRateProvider[JavaMethodDescriptor]

'marketData' @ [252:62] ==> val marketData: MarketData defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'combined' @ [253:64] ==> public open fun combined(p0: (FxRateProvider..FxRateProvider?), vararg p1: (ImmutableRatesProvider..ImmutableRatesProvider?)): (ImmutableRatesProvider..ImmutableRatesProvider?) defined in com.opengamma.strata.pricer.rate.ImmutableRatesProvider[JavaMethodDescriptor]

'fxRateProvider' @ [253:73] ==> val fxRateProvider: (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'ratesProvider' @ [253:89] ==> val ratesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'OGTrades' @ [255:23] ==> val OGTrades: List<(ResolvedSwapTrade..ResolvedSwapTrade?)> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'map' @ [255:32] ==> public inline fun <T, R> Iterable<(ResolvedSwapTrade..ResolvedSwapTrade?)>.map(transform: ((ResolvedSwapTrade..ResolvedSwapTrade?)) -> Pair<(String..String?), MultiCurrencyAmount>): List<Pair<(String..String?), MultiCurrencyAmount>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.opengamma.strata.product.swap.ResolvedSwapTrade..com.opengamma.strata.product.swap.ResolvedSwapTrade?)
    <R> -> Pair<(kotlin.String..kotlin.String?), MultiCurrencyAmount>

'it' @ [255:38] ==> value-parameter it: (ResolvedSwapTrade..ResolvedSwapTrade?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'info' @ [255:41] ==> public final val ResolvedSwapTrade.info: (TradeInfo..TradeInfo?)[MyPropertyDescriptor]

'id' @ [255:46] ==> public final val TradeInfo.id: (Optional<(StandardId..StandardId?)>..Optional<(StandardId..StandardId?)>?)[MyPropertyDescriptor]

'get' @ [255:49] ==> public open fun get(): StandardId defined in java.util.Optional[JavaMethodDescriptor]

'value' @ [255:55] ==> public final val StandardId.value: (String..String?)[MyPropertyDescriptor]

'pricer' @ [255:64] ==> val pricer: (DiscountingSwapProductPricer..DiscountingSwapProductPricer?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'presentValue' @ [255:71] ==> public open fun presentValue(p0: (ResolvedSwap..ResolvedSwap?), p1: (RatesProvider..RatesProvider?)): (MultiCurrencyAmount..MultiCurrencyAmount?) defined in com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer[JavaMethodDescriptor]

'it' @ [255:84] ==> value-parameter it: (ResolvedSwapTrade..ResolvedSwapTrade?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'product' @ [255:87] ==> public final val ResolvedSwapTrade.product: (ResolvedSwap..ResolvedSwap?)[MyPropertyDescriptor]

'combinedRatesProvider' @ [255:96] ==> val combinedRatesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'toCordaCompatible' @ [255:119] ==> public fun MultiCurrencyAmount.toCordaCompatible(): MultiCurrencyAmount defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'toMap' @ [255:141] ==> public fun <K, V> Iterable<Pair<(String..String?), MultiCurrencyAmount>>.toMap(): Map<(String..String?), MultiCurrencyAmount> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> MultiCurrencyAmount

'analyticsEngine' @ [257:33] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'sensitivities' @ [257:49] ==> public open fun sensitivities(trades: List<ResolvedSwapTrade>, pricer: DiscountingSwapProductPricer, combinedRatesProvider: ImmutableRatesProvider): Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'OGTrades' @ [257:63] ==> val OGTrades: List<(ResolvedSwapTrade..ResolvedSwapTrade?)> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'pricer' @ [257:73] ==> val pricer: (DiscountingSwapProductPricer..DiscountingSwapProductPricer?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'ratesProvider' @ [257:81] ==> val ratesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'PortfolioNormalizer' @ [258:30] ==> public constructor PortfolioNormalizer(eur: Currency?, combinedRatesProvider: ImmutableRatesProvider?) defined in net.corda.vega.analytics.PortfolioNormalizer[ClassConstructorDescriptorImpl]

'EUR' @ [258:59] ==> public final val EUR: (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaPropertyDescriptor]

'combinedRatesProvider' @ [258:64] ==> val combinedRatesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'RwamBimmNotProductClassesCalculator' @ [259:35] ==> public constructor RwamBimmNotProductClassesCalculator(fxRateProvider: MarketDataFxRateProvider?, eur: Currency?, instance: Any) defined in net.corda.vega.analytics.RwamBimmNotProductClassesCalculator[ClassConstructorDescriptorImpl]

'fxRateProvider' @ [259:71] ==> val fxRateProvider: (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'EUR' @ [259:96] ==> public final val EUR: (Currency..Currency?) defined in com.opengamma.strata.basics.currency.Currency[JavaPropertyDescriptor]

'INSTANCE' @ [259:119] ==> public object INSTANCE defined in net.corda.vega.analytics.IsdaConfiguration[FakeCallableDescriptorForObject]

'BimmAnalysisUtils' @ [260:26] ==> @Suppress public object BimmAnalysisUtils defined in net.corda.vega.analytics in file OGStub.kt[FakeCallableDescriptorForObject]

'computeMargin' @ [260:44] ==> public final fun computeMargin(combinedRatesProvider: ImmutableRatesProvider?, normalizer: PortfolioNormalizer, calculatorTotal: RwamBimmNotProductClassesCalculator, first: CurrencyParameterSensitivities, second: MultiCurrencyAmount): Triple<Double, Double, Double> defined in net.corda.vega.analytics.BimmAnalysisUtils[SimpleFunctionDescriptorImpl]

'combinedRatesProvider' @ [260:58] ==> val combinedRatesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'normalizer' @ [260:81] ==> val normalizer: PortfolioNormalizer defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'calculatorTotal' @ [260:93] ==> val calculatorTotal: RwamBimmNotProductClassesCalculator defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'sensitivities' @ [260:110] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'first' @ [260:124] ==> public final val first: CurrencyParameterSensitivities defined in kotlin.Pair[DeserializedPropertyDescriptor]

'sensitivities' @ [260:131] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'second' @ [260:145] ==> public final val second: MultiCurrencyAmount defined in kotlin.Pair[DeserializedPropertyDescriptor]

'analyticsEngine' @ [261:29] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'calculateSensitivitiesBatch' @ [261:45] ==> public open fun calculateSensitivitiesBatch(trades: List<ResolvedSwapTrade>, pricer: DiscountingSwapProductPricer, ratesProvider: ImmutableRatesProvider): Map<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'OGTrades' @ [261:73] ==> val OGTrades: List<(ResolvedSwapTrade..ResolvedSwapTrade?)> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'pricer' @ [261:83] ==> val pricer: (DiscountingSwapProductPricer..DiscountingSwapProductPricer?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'ratesProvider' @ [261:91] ==> val ratesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'InitialMarginTriple' @ [263:31] ==> public constructor InitialMarginTriple(first: Double, second: Double, third: Double) defined in net.corda.vega.analytics.InitialMarginTriple[ClassConstructorDescriptorImpl]

'margin' @ [263:51] ==> val margin: Triple<Double, Double, Double> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'first' @ [263:58] ==> public final val first: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'margin' @ [263:65] ==> val margin: Triple<Double, Double, Double> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'second' @ [263:72] ==> public final val second: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'margin' @ [263:80] ==> val margin: Triple<Double, Double, Double> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'third' @ [263:87] ==> public final val third: Double defined in kotlin.Triple[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [263:94] ==> public fun InitialMarginTriple.toCordaCompatible(): InitialMarginTriple defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'analyticsEngine' @ [264:27] ==> val analyticsEngine: OGSIMMAnalyticsEngine defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'calculateMarginBatch' @ [264:43] ==> public open fun calculateMarginBatch(tradeSensitivitiesMap: Map<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount>, combinedRatesProvider: ImmutableRatesProvider, fxRateProvider: MarketDataFxRateProvider, portfolioMargin: InitialMarginTriple): Map<ResolvedSwapTrade, InitialMarginTriple> defined in net.corda.vega.analytics.OGSIMMAnalyticsEngine[SimpleFunctionDescriptorImpl]

'sensBatch' @ [264:64] ==> val sensBatch: Map<ResolvedSwapTrade, AnalyticsEngine.CurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'combinedRatesProvider' @ [264:75] ==> val combinedRatesProvider: (ImmutableRatesProvider..ImmutableRatesProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'fxRateProvider' @ [264:98] ==> val fxRateProvider: (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'cordaMargin' @ [264:114] ==> val cordaMargin: InitialMarginTriple defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'fxRateProvider' @ [265:35] ==> val fxRateProvider: (MarketDataFxRateProvider..MarketDataFxRateProvider?) defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'marketData' @ [265:50] ==> public final val MarketDataFxRateProvider.marketData: (MarketData..MarketData?)[MyPropertyDescriptor]

'toCordaCompatible' @ [265:61] ==> public fun MarketData.toCordaCompatible(): CordaMarketData defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'imBatch' @ [266:30] ==> val imBatch: Map<ResolvedSwapTrade, InitialMarginTriple> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'map' @ [266:38] ==> public inline fun <K, V, R> Map<out ResolvedSwapTrade, InitialMarginTriple>.map(transform: (Map.Entry<ResolvedSwapTrade, InitialMarginTriple>) -> Pair<(String..String?), InitialMarginTriple>): List<Pair<(String..String?), InitialMarginTriple>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ResolvedSwapTrade
    <V> -> InitialMarginTriple
    <R> -> Pair<(kotlin.String..kotlin.String?), InitialMarginTriple>

'it' @ [266:44] ==> value-parameter it: Map.Entry<ResolvedSwapTrade, InitialMarginTriple> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [266:47] ==> public abstract val key: ResolvedSwapTrade defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'info' @ [266:51] ==> public final val ResolvedSwapTrade.info: (TradeInfo..TradeInfo?)[MyPropertyDescriptor]

'id' @ [266:56] ==> public final val TradeInfo.id: (Optional<(StandardId..StandardId?)>..Optional<(StandardId..StandardId?)>?)[MyPropertyDescriptor]

'get' @ [266:59] ==> public open fun get(): StandardId defined in java.util.Optional[JavaMethodDescriptor]

'value' @ [266:65] ==> public final val StandardId.value: (String..String?)[MyPropertyDescriptor]

'it' @ [266:74] ==> value-parameter it: Map.Entry<ResolvedSwapTrade, InitialMarginTriple> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [266:77] ==> public abstract val value: InitialMarginTriple defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [266:83] ==> public fun InitialMarginTriple.toCordaCompatible(): InitialMarginTriple defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'toMap' @ [266:105] ==> public fun <K, V> Iterable<Pair<(String..String?), InitialMarginTriple>>.toMap(): Map<(String..String?), InitialMarginTriple> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> InitialMarginTriple

'require' @ [269:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'agree' @ [269:21] ==> @Suspendable private final fun agree(data: Any): Boolean defined in net.corda.vega.flows.SimmFlow.Receiver[SimpleFunctionDescriptorImpl]

'cordaMarketData' @ [269:27] ==> val cordaMarketData: CordaMarketData defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'require' @ [270:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'agree' @ [270:21] ==> @Suspendable private final fun agree(data: Any): Boolean defined in net.corda.vega.flows.SimmFlow.Receiver[SimpleFunctionDescriptorImpl]

'sensitivities' @ [270:27] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'first' @ [270:41] ==> public final val first: CurrencyParameterSensitivities defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [270:47] ==> public fun CurrencyParameterSensitivities.toCordaCompatible(): CurrencyParameterSensitivities defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'require' @ [271:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'agree' @ [271:21] ==> @Suspendable private final fun agree(data: Any): Boolean defined in net.corda.vega.flows.SimmFlow.Receiver[SimpleFunctionDescriptorImpl]

'sensitivities' @ [271:27] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'second' @ [271:41] ==> public final val second: MultiCurrencyAmount defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [271:48] ==> public fun MultiCurrencyAmount.toCordaCompatible(): MultiCurrencyAmount defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'require' @ [272:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'agree' @ [272:21] ==> @Suspendable private final fun agree(data: Any): Boolean defined in net.corda.vega.flows.SimmFlow.Receiver[SimpleFunctionDescriptorImpl]

'cordaMargin' @ [272:27] ==> val cordaMargin: InitialMarginTriple defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'PortfolioValuation' @ [274:20] ==> public constructor PortfolioValuation(trades: Int, notional: BigDecimal, marketData: CordaMarketData, totalSensivities: CurrencyParameterSensitivities, currencySensitivies: MultiCurrencyAmount, margin: InitialMarginTriple, imContributionMap: Map<String, InitialMarginTriple>?, presentValues: Map<String, MultiCurrencyAmount>) defined in net.corda.vega.contracts.PortfolioValuation[ClassConstructorDescriptorImpl]

'portfolio' @ [275:21] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[ValueParameterDescriptorImpl]

'trades' @ [275:31] ==> public final val trades: List<IRSState> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'size' @ [275:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'portfolio' @ [276:21] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[ValueParameterDescriptorImpl]

'getNotionalForParty' @ [276:31] ==> public final fun getNotionalForParty(party: Party): BigDecimal defined in net.corda.vega.portfolio.Portfolio[SimpleFunctionDescriptorImpl]

'valuer' @ [276:51] ==> value-parameter valuer: Party defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[ValueParameterDescriptorImpl]

'cordaMarketData' @ [277:21] ==> val cordaMarketData: CordaMarketData defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'sensitivities' @ [278:21] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'first' @ [278:35] ==> public final val first: CurrencyParameterSensitivities defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [278:41] ==> public fun CurrencyParameterSensitivities.toCordaCompatible(): CurrencyParameterSensitivities defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'sensitivities' @ [279:21] ==> val sensitivities: Pair<CurrencyParameterSensitivities, MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'second' @ [279:35] ==> public final val second: MultiCurrencyAmount defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toCordaCompatible' @ [279:42] ==> public fun MultiCurrencyAmount.toCordaCompatible(): MultiCurrencyAmount defined in net.corda.vega.flows in file OpenGammaCordaUtils.kt[SimpleFunctionDescriptorImpl]

'cordaMargin' @ [280:21] ==> val cordaMargin: InitialMarginTriple defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'cordaIMMap' @ [281:21] ==> val cordaIMMap: Map<(String..String?), InitialMarginTriple> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'PVs' @ [282:21] ==> val PVs: Map<(String..String?), MultiCurrencyAmount> defined in net.corda.vega.flows.SimmFlow.Receiver.agreeValuation[LocalVariableDescriptor]

'Suspendable' @ [287:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [289:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'info' @ [289:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'require' @ [290:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'offer' @ [290:21] ==> public final lateinit var offer: SimmFlow.OfferMessage defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'dealBeingOffered' @ [290:27] ==> public final val dealBeingOffered: PortfolioState defined in net.corda.vega.flows.SimmFlow.OfferMessage[PropertyDescriptorImpl]

'portfolio' @ [290:44] ==> public final val portfolio: List<StateRef> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'portfolio' @ [290:57] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Receiver.agreePortfolio[ValueParameterDescriptorImpl]

'refs' @ [290:67] ==> public final val refs: List<StateRef> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'TwoPartyDealFlow' @ [292:26] ==> public object TwoPartyDealFlow defined in net.corda.finance.flows[FakeCallableDescriptorForObject]

'Instigator' @ [292:43] ==> public constructor Instigator(otherParty: Party, payload: TwoPartyDealFlow.AutoOffer, myKey: PublicKey, progressTracker: ProgressTracker = ...) defined in net.corda.finance.flows.TwoPartyDealFlow.Instigator[DeserializedClassConstructorDescriptor]

'replyToParty' @ [293:21] ==> public final val replyToParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'AutoOffer' @ [294:38] ==> public constructor AutoOffer(notary: Party, dealBeingOffered: DealState) defined in net.corda.finance.flows.TwoPartyDealFlow.AutoOffer[DeserializedClassConstructorDescriptor]

'offer' @ [294:48] ==> public final lateinit var offer: SimmFlow.OfferMessage defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'notary' @ [294:54] ==> public final val notary: Party defined in net.corda.vega.flows.SimmFlow.OfferMessage[PropertyDescriptorImpl]

'offer' @ [294:62] ==> public final lateinit var offer: SimmFlow.OfferMessage defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'dealBeingOffered' @ [294:68] ==> public final val dealBeingOffered: PortfolioState defined in net.corda.vega.flows.SimmFlow.OfferMessage[PropertyDescriptorImpl]

'serviceHub' @ [295:21] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'legalIdentityKey' @ [295:32] ==> public open val legalIdentityKey: PublicKey defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'logger' @ [296:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'info' @ [296:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'replyToParty' @ [296:68] ==> public final val replyToParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'name' @ [296:81] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'subFlow' @ [297:20] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'seller' @ [297:28] ==> val seller: TwoPartyDealFlow.Instigator defined in net.corda.vega.flows.SimmFlow.Receiver.agreePortfolio[LocalVariableDescriptor]

'Suspendable' @ [300:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'logger' @ [302:13] ==> public final val logger: Logger defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'info' @ [302:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'send' @ [303:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedSimpleFunctionDescriptor]

'replyToParty' @ [303:18] ==> public final val replyToParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'Ack' @ [303:32] ==> @CordaSerializable private object Ack defined in net.corda.vega.flows.SimmFlow[FakeCallableDescriptorForObject]

'subFlow' @ [304:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'StateRevisionFlow.Receiver<PortfolioState.Update>' @ [304:30] ==> public constructor Receiver<in T>(otherParty: Party) defined in net.corda.vega.flows.StateRevisionFlow.Receiver[ClassConstructorDescriptorImpl]
Inferred types:
    <in T> -> Update

'replyToParty' @ [304:80] ==> public final val replyToParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'super' @ [306:21] ==> <this> defined in net.corda.vega.flows.SimmFlow.Receiver.updatePortfolio.<no name provided>[LazyClassReceiverParameterDescriptor]

'verifyProposal' @ [306:27] ==> protected open fun verifyProposal(stx: SignedTransaction, proposal: AbstractStateReplacementFlow.Proposal<PortfolioState.Update>): Unit defined in net.corda.vega.flows.StateRevisionFlow.Receiver[SimpleFunctionDescriptorImpl]

'stx' @ [306:42] ==> value-parameter stx: SignedTransaction defined in net.corda.vega.flows.SimmFlow.Receiver.updatePortfolio.<no name provided>.verifyProposal[ValueParameterDescriptorImpl]

'proposal' @ [306:47] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<PortfolioState.Update> defined in net.corda.vega.flows.SimmFlow.Receiver.updatePortfolio.<no name provided>.verifyProposal[ValueParameterDescriptorImpl]

'proposal' @ [307:25] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<PortfolioState.Update> defined in net.corda.vega.flows.SimmFlow.Receiver.updatePortfolio.<no name provided>.verifyProposal[ValueParameterDescriptorImpl]

'modification' @ [307:34] ==> public final val modification: PortfolioState.Update defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'portfolio' @ [307:47] ==> public final val portfolio: List<StateRef>? defined in net.corda.vega.contracts.PortfolioState.Update[PropertyDescriptorImpl]

'portfolio' @ [307:60] ==> value-parameter portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Receiver.updatePortfolio[ValueParameterDescriptorImpl]

'refs' @ [307:70] ==> public final val refs: List<StateRef> defined in net.corda.vega.portfolio.Portfolio[PropertyDescriptorImpl]

'StateReplacementException' @ [307:82] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[DeserializedClassConstructorDescriptor]

'Suspendable' @ [312:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'serviceHub' @ [314:29] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'vaultQueryService' @ [314:40] ==> public abstract val vaultQueryService: VaultQueryService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'queryBy' @ [314:58] ==> public inline fun <reified T : ContractState> VaultQueryService.queryBy(criteria: QueryCriteria): Vault.Page<IRSState> defined in net.corda.core.node.services[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : ContractState> -> IRSState

'VaultQueryCriteria' @ [314:76] ==> @JvmOverloads public constructor VaultQueryCriteria(status: Vault.StateStatus = ..., contractStateTypes: Set<Class<out ContractState>>? = ..., stateRefs: List<StateRef>? = ..., notary: List<AbstractParty>? = ..., softLockingCondition: QueryCriteria.SoftLockingCondition? = ..., timeCondition: QueryCriteria.TimeCondition? = ...) defined in net.corda.core.node.services.vault.QueryCriteria.VaultQueryCriteria[DeserializedClassConstructorDescriptor]

'stateRef' @ [314:107] ==> value-parameter stateRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation[ValueParameterDescriptorImpl]

'state' @ [314:116] ==> public final val state: TransactionState<PortfolioState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [314:122] ==> public final val data: PortfolioState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'portfolio' @ [314:127] ==> public final val portfolio: List<StateRef> defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'states' @ [314:139] ==> public final val states: List<StateAndRef<IRSState>> defined in net.corda.core.node.services.Vault.Page[DeserializedPropertyDescriptor]

'toPortfolio' @ [314:146] ==> public fun List<StateAndRef<IRSState>>.toPortfolio(): Portfolio defined in net.corda.vega.portfolio in file Portfolio.kt[SimpleFunctionDescriptorImpl]

'serviceHub' @ [315:26] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedPropertyDescriptor]

'identityService' @ [315:37] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [315:53] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'stateRef' @ [315:72] ==> value-parameter stateRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation[ValueParameterDescriptorImpl]

'state' @ [315:81] ==> public final val state: TransactionState<PortfolioState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [315:87] ==> public final val data: PortfolioState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'valuer' @ [315:92] ==> public final val valuer: AbstractParty defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'IllegalStateException' @ [315:109] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'stateRef' @ [315:155] ==> value-parameter stateRef: StateAndRef<PortfolioState> defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation[ValueParameterDescriptorImpl]

'state' @ [315:164] ==> public final val state: TransactionState<PortfolioState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [315:170] ==> public final val data: PortfolioState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'valuer' @ [315:175] ==> public final val valuer: AbstractParty defined in net.corda.vega.contracts.PortfolioState[PropertyDescriptorImpl]

'agreeValuation' @ [316:29] ==> @Suspendable private final fun agreeValuation(portfolio: Portfolio, asOf: LocalDate, valuer: Party): PortfolioValuation defined in net.corda.vega.flows.SimmFlow.Receiver[SimpleFunctionDescriptorImpl]

'portfolio' @ [316:44] ==> val portfolio: Portfolio defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation[LocalVariableDescriptor]

'offer' @ [316:55] ==> public final lateinit var offer: SimmFlow.OfferMessage defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'valuationDate' @ [316:61] ==> public final val valuationDate: LocalDate defined in net.corda.vega.flows.SimmFlow.OfferMessage[PropertyDescriptorImpl]

'valuer' @ [316:76] ==> val valuer: Party defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation[LocalVariableDescriptor]

'subFlow' @ [317:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.vega.flows.SimmFlow.Receiver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'StateRevisionFlow.Receiver<PortfolioState.Update>' @ [317:30] ==> public constructor Receiver<in T>(otherParty: Party) defined in net.corda.vega.flows.StateRevisionFlow.Receiver[ClassConstructorDescriptorImpl]
Inferred types:
    <in T> -> Update

'replyToParty' @ [317:80] ==> public final val replyToParty: Party defined in net.corda.vega.flows.SimmFlow.Receiver[PropertyDescriptorImpl]

'super' @ [319:21] ==> <this> defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation.<no name provided>[LazyClassReceiverParameterDescriptor]

'verifyProposal' @ [319:27] ==> protected open fun verifyProposal(stx: SignedTransaction, proposal: AbstractStateReplacementFlow.Proposal<PortfolioState.Update>): Unit defined in net.corda.vega.flows.StateRevisionFlow.Receiver[SimpleFunctionDescriptorImpl]

'stx' @ [319:42] ==> value-parameter stx: SignedTransaction defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation.<no name provided>.verifyProposal[ValueParameterDescriptorImpl]

'proposal' @ [319:47] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<PortfolioState.Update> defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation.<no name provided>.verifyProposal[ValueParameterDescriptorImpl]

'proposal' @ [320:25] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<PortfolioState.Update> defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation.<no name provided>.verifyProposal[ValueParameterDescriptorImpl]

'modification' @ [320:34] ==> public final val modification: PortfolioState.Update defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'valuation' @ [320:47] ==> public final val valuation: PortfolioValuation? defined in net.corda.vega.contracts.PortfolioState.Update[PropertyDescriptorImpl]

'valuation' @ [320:60] ==> val valuation: PortfolioValuation defined in net.corda.vega.flows.SimmFlow.Receiver.updateValuation[LocalVariableDescriptor]

'StateReplacementException' @ [320:77] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [326:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

