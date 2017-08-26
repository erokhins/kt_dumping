'CordaService' @ [28:5] ==> public constructor CordaService() defined in net.corda.core.node.services.CordaService[DeserializedClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [29:53] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'loggerFor' @ [31:23] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Service

'log' @ [51:13] ==> public final val log: Logger defined in net.corda.docs.CustomVaultQuery.Service.Companion[PropertyDescriptorImpl]

'info' @ [51:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'nativeQuery' @ [51:40] ==> val nativeQuery: String defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'services' @ [52:27] ==> public final val services: PluginServiceHub defined in net.corda.docs.CustomVaultQuery.Service[PropertyDescriptorImpl]

'jdbcSession' @ [52:36] ==> public abstract fun jdbcSession(): Connection defined in net.corda.core.node.PluginServiceHub[DeserializedSimpleFunctionDescriptor]

'session' @ [53:33] ==> val session: Connection defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'prepareStatement' @ [53:41] ==> public abstract fun prepareStatement(p0: (String..String?)): (PreparedStatement..PreparedStatement?) defined in java.sql.Connection[JavaMethodDescriptor]

'nativeQuery' @ [53:58] ==> val nativeQuery: String defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'prepStatement' @ [54:22] ==> val prepStatement: (PreparedStatement..PreparedStatement?) defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'executeQuery' @ [54:36] ==> public abstract fun executeQuery(): (ResultSet..ResultSet?) defined in java.sql.PreparedStatement[JavaMethodDescriptor]

'mutableListOf' @ [55:62] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Amount<Currency>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Amount<Currency>

'rs' @ [56:20] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'next' @ [56:23] ==> public abstract operator fun next(): Boolean defined in java.sql.ResultSet[JavaMethodDescriptor]

'rs' @ [57:35] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'getString' @ [57:38] ==> public abstract fun getString(p0: Int): (String..String?) defined in java.sql.ResultSet[JavaMethodDescriptor]

'rs' @ [58:30] ==> val rs: (ResultSet..ResultSet?) defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'getLong' @ [58:33] ==> public abstract fun getLong(p0: Int): Long defined in java.sql.ResultSet[JavaMethodDescriptor]

'log' @ [59:17] ==> public final val log: Logger defined in net.corda.docs.CustomVaultQuery.Service.Companion[PropertyDescriptorImpl]

'info' @ [59:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'currencyStr' @ [59:28] ==> val currencyStr: (String..String?) defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'amount' @ [59:43] ==> val amount: Long defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'topUpLimits' @ [60:17] ==> var topUpLimits: MutableList<Amount<Currency>> defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'add' @ [60:29] ==> public abstract fun add(element: Amount<Currency>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'Amount' @ [60:33] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'amount' @ [60:40] ==> val amount: Long defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'getInstance' @ [60:57] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'currencyStr' @ [60:69] ==> val currencyStr: (String..String?) defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'topUpLimits' @ [62:20] ==> var topUpLimits: MutableList<Amount<Currency>> defined in net.corda.docs.CustomVaultQuery.Service.rebalanceCurrencyReserves[LocalVariableDescriptor]

'CordaSerializable' @ [74:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'InitiatingFlow' @ [78:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'StartableByRPC' @ [79:5] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<List<AbstractCashFlow.Result>>' @ [83:60] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> List<Result>

'Suspendable' @ [84:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [85:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'CashException' @ [85:17] ==> public constructor CashException(message: String, cause: Throwable) defined in net.corda.finance.flows.CashException[DeserializedClassConstructorDescriptor]

'TopupRequest' @ [87:32] ==> public constructor TopupRequest(issueToParty: Party, issuerPartyRef: OpaqueBytes, notaryParty: Party) defined in net.corda.docs.TopupIssuerFlow.TopupRequest[ClassConstructorDescriptorImpl]

'issueToParty' @ [87:45] ==> public final val issueToParty: Party defined in net.corda.docs.TopupIssuerFlow.TopupIssuanceRequester[PropertyDescriptorImpl]

'issueToPartyRef' @ [87:59] ==> public final val issueToPartyRef: OpaqueBytes defined in net.corda.docs.TopupIssuerFlow.TopupIssuanceRequester[PropertyDescriptorImpl]

'notaryParty' @ [87:76] ==> public final val notaryParty: Party defined in net.corda.docs.TopupIssuerFlow.TopupIssuanceRequester[PropertyDescriptorImpl]

'sendAndReceive' @ [88:20] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<List<AbstractCashFlow.Result>> defined in net.corda.docs.TopupIssuerFlow.TopupIssuanceRequester[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> List<Result>

'issuerBankParty' @ [88:66] ==> public final val issuerBankParty: Party defined in net.corda.docs.TopupIssuerFlow.TopupIssuanceRequester[PropertyDescriptorImpl]

'topupRequest' @ [88:83] ==> val topupRequest: TopupIssuerFlow.TopupRequest defined in net.corda.docs.TopupIssuerFlow.TopupIssuanceRequester.call[LocalVariableDescriptor]

'unwrap' @ [88:97] ==> public inline fun <T, R> UntrustworthyData<List<AbstractCashFlow.Result>>.unwrap(validator: (List<AbstractCashFlow.Result>) -> List<AbstractCashFlow.Result>): List<AbstractCashFlow.Result> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Result>
    <R> -> List<Result>

'it' @ [88:106] ==> value-parameter it: List<AbstractCashFlow.Result> defined in net.corda.docs.TopupIssuerFlow.TopupIssuanceRequester.call.<anonymous>[ValueParameterDescriptorImpl]

'InitiatedBy' @ [92:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'TopupIssuanceRequester' @ [92:18] ==> public constructor TopupIssuanceRequester(issueToParty: Party, issueToPartyRef: OpaqueBytes, issuerBankParty: Party, notaryParty: Party) defined in net.corda.docs.TopupIssuerFlow.TopupIssuanceRequester[ClassConstructorDescriptorImpl]

'FlowLogic<List<SignedTransaction>>' @ [93:48] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> List<SignedTransaction>

'ProgressTracker.Step' @ [95:39] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [96:30] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [97:35] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [98:51] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [100:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'AWAITING_REQUEST' @ [100:45] ==> public object AWAITING_REQUEST : ProgressTracker.Step defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.Companion[FakeCallableDescriptorForObject]

'ISSUING' @ [100:63] ==> public object ISSUING : ProgressTracker.Step defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.Companion[FakeCallableDescriptorForObject]

'TRANSFERRING' @ [100:72] ==> public object TRANSFERRING : ProgressTracker.Step defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.Companion[FakeCallableDescriptorForObject]

'SENDING_TOP_UP_ISSUE_REQUEST' @ [100:86] ==> public object SENDING_TOP_UP_ISSUE_REQUEST : ProgressTracker.Step defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.Companion[FakeCallableDescriptorForObject]

'tracker' @ [103:57] ==> public final fun tracker(): ProgressTracker defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.Companion[SimpleFunctionDescriptorImpl]

'Suspendable' @ [106:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [107:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'CashException' @ [107:17] ==> public constructor CashException(message: String, cause: Throwable) defined in net.corda.finance.flows.CashException[DeserializedClassConstructorDescriptor]

'progressTracker' @ [109:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[PropertyDescriptorImpl]

'currentStep' @ [109:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'AWAITING_REQUEST' @ [109:43] ==> public object AWAITING_REQUEST : ProgressTracker.Step defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.Companion[FakeCallableDescriptorForObject]

'receive' @ [110:32] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<TopupIssuerFlow.TopupRequest> defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> TopupRequest

'otherParty' @ [110:54] ==> public final val otherParty: Party defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[PropertyDescriptorImpl]

'unwrap' @ [110:66] ==> public inline fun <T, R> UntrustworthyData<TopupIssuerFlow.TopupRequest>.unwrap(validator: (TopupIssuerFlow.TopupRequest) -> TopupIssuerFlow.TopupRequest): TopupIssuerFlow.TopupRequest defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TopupRequest
    <R> -> TopupRequest

'it' @ [111:17] ==> value-parameter it: TopupIssuerFlow.TopupRequest defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [114:43] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[DeserializedPropertyDescriptor]

'cordaService' @ [114:54] ==> public abstract fun <T : SerializeAsToken> cordaService(type: Class<CustomVaultQuery.Service>): CustomVaultQuery.Service defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : SerializeAsToken> -> Service

'CustomVaultQuery' @ [114:67] ==> public object CustomVaultQuery defined in net.corda.docs in file CustomVaultQuery.kt[FakeCallableDescriptorForObject]

'Service' @ [114:84] ==> private companion object defined in net.corda.docs.CustomVaultQuery.Service[FakeCallableDescriptorForObject]

'java' @ [114:99] ==> public val <T> KClass<CustomVaultQuery.Service>.java: Class<CustomVaultQuery.Service> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Service

'customVaultQueryService' @ [115:33] ==> val customVaultQueryService: CustomVaultQuery.Service defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call[LocalVariableDescriptor]

'rebalanceCurrencyReserves' @ [115:57] ==> public final fun rebalanceCurrencyReserves(): List<Amount<Currency>> defined in net.corda.docs.CustomVaultQuery.Service[SimpleFunctionDescriptorImpl]

'reserveLimits' @ [117:49] ==> val reserveLimits: List<Amount<Currency>> defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call[LocalVariableDescriptor]

'map' @ [117:63] ==> public inline fun <T, R> Iterable<Amount<Currency>>.map(transform: (Amount<Currency>) -> SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Amount<Currency>
    <R> -> SignedTransaction

'logger' @ [119:17] ==> public final val logger: Logger defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[DeserializedPropertyDescriptor]

'info' @ [119:24] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'amount' @ [119:57] ==> value-parameter amount: Amount<Currency> defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call.<anonymous>[ValueParameterDescriptorImpl]

'issueCashTo' @ [120:27] ==> @Suspendable private final fun issueCashTo(amount: Amount<Currency>, issueTo: Party, issuerPartyRef: OpaqueBytes): AbstractCashFlow.Result defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[SimpleFunctionDescriptorImpl]

'amount' @ [120:39] ==> value-parameter amount: Amount<Currency> defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call.<anonymous>[ValueParameterDescriptorImpl]

'topupRequest' @ [120:47] ==> val topupRequest: TopupIssuerFlow.TopupRequest defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call[LocalVariableDescriptor]

'issueToParty' @ [120:60] ==> public final val issueToParty: Party defined in net.corda.docs.TopupIssuerFlow.TopupRequest[PropertyDescriptorImpl]

'topupRequest' @ [120:74] ==> val topupRequest: TopupIssuerFlow.TopupRequest defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call[LocalVariableDescriptor]

'issuerPartyRef' @ [120:87] ==> public final val issuerPartyRef: OpaqueBytes defined in net.corda.docs.TopupIssuerFlow.TopupRequest[PropertyDescriptorImpl]

'progressTracker' @ [121:17] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[PropertyDescriptorImpl]

'currentStep' @ [121:33] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SENDING_TOP_UP_ISSUE_REQUEST' @ [121:47] ==> public object SENDING_TOP_UP_ISSUE_REQUEST : ProgressTracker.Step defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.Companion[FakeCallableDescriptorForObject]

'txn' @ [122:28] ==> val txn: AbstractCashFlow.Result defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call.<anonymous>[LocalVariableDescriptor]

'stx' @ [122:32] ==> public final val stx: SignedTransaction defined in net.corda.finance.flows.AbstractCashFlow.Result[DeserializedPropertyDescriptor]

'send' @ [125:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [125:18] ==> public final val otherParty: Party defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[PropertyDescriptorImpl]

'txns' @ [125:30] ==> val txns: List<SignedTransaction> defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call[LocalVariableDescriptor]

'txns' @ [126:20] ==> val txns: List<SignedTransaction> defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.call[LocalVariableDescriptor]

'Suspendable' @ [130:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'serviceHub' @ [135:31] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[DeserializedPropertyDescriptor]

'networkMapCache' @ [135:42] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [135:58] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'notaryIdentity' @ [135:73] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'progressTracker' @ [137:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[PropertyDescriptorImpl]

'currentStep' @ [137:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'ISSUING' @ [137:43] ==> public object ISSUING : ProgressTracker.Step defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.Companion[FakeCallableDescriptorForObject]

'CashIssueFlow' @ [138:33] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party) defined in net.corda.finance.flows.CashIssueFlow[DeserializedClassConstructorDescriptor]

'amount' @ [138:47] ==> value-parameter amount: Amount<Currency> defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[ValueParameterDescriptorImpl]

'issuerPartyRef' @ [138:55] ==> value-parameter issuerPartyRef: OpaqueBytes defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[ValueParameterDescriptorImpl]

'notaryParty' @ [138:71] ==> val notaryParty: Party defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[LocalVariableDescriptor]

'subFlow' @ [139:27] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<AbstractCashFlow.Result>): AbstractCashFlow.Result defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Result

'issueCashFlow' @ [139:35] ==> val issueCashFlow: CashIssueFlow defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[LocalVariableDescriptor]

'issueTo' @ [142:17] ==> value-parameter issueTo: Party defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[ValueParameterDescriptorImpl]

'serviceHub' @ [142:28] ==> public final val serviceHub: ServiceHub defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[DeserializedPropertyDescriptor]

'myInfo' @ [142:39] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [142:46] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'issueTx' @ [143:24] ==> val issueTx: AbstractCashFlow.Result defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[LocalVariableDescriptor]

'progressTracker' @ [145:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[PropertyDescriptorImpl]

'currentStep' @ [145:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'TRANSFERRING' @ [145:43] ==> public object TRANSFERRING : ProgressTracker.Step defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.Companion[FakeCallableDescriptorForObject]

'CashPaymentFlow' @ [146:32] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party, anonymous: Boolean) defined in net.corda.finance.flows.CashPaymentFlow[DeserializedClassConstructorDescriptor]

'amount' @ [146:48] ==> value-parameter amount: Amount<Currency> defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[ValueParameterDescriptorImpl]

'issueTo' @ [146:56] ==> value-parameter issueTo: Party defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[ValueParameterDescriptorImpl]

'subFlow' @ [147:26] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<AbstractCashFlow.Result>): AbstractCashFlow.Result defined in net.corda.docs.TopupIssuerFlow.TopupIssuer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Result

'moveCashFlow' @ [147:34] ==> val moveCashFlow: CashPaymentFlow defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[LocalVariableDescriptor]

'moveTx' @ [149:20] ==> val moveTx: AbstractCashFlow.Result defined in net.corda.docs.TopupIssuerFlow.TopupIssuer.issueCashTo[LocalVariableDescriptor]

