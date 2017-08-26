'InitiatedBy' @ [19:1] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'SellerFlow' @ [19:14] ==> public companion object defined in net.corda.traderdemo.flow.SellerFlow[FakeCallableDescriptorForObject]

'FlowLogic<Unit>' @ [20:42] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'ProgressTracker.Step' @ [22:27] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [24:53] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'STARTING_BUY' @ [24:69] ==> public object STARTING_BUY : ProgressTracker.Step defined in net.corda.traderdemo.flow.BuyerFlow[FakeCallableDescriptorForObject]

'Suspendable' @ [26:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [28:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.traderdemo.flow.BuyerFlow[PropertyDescriptorImpl]

'currentStep' @ [28:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'STARTING_BUY' @ [28:39] ==> public object STARTING_BUY : ProgressTracker.Step defined in net.corda.traderdemo.flow.BuyerFlow[FakeCallableDescriptorForObject]

'receive' @ [31:22] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<Amount<Currency>> defined in net.corda.traderdemo.flow.BuyerFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> Amount<Currency>

'otherParty' @ [31:48] ==> public final val otherParty: Party defined in net.corda.traderdemo.flow.BuyerFlow[PropertyDescriptorImpl]

'unwrap' @ [31:60] ==> public inline fun <T, R> UntrustworthyData<Amount<Currency>>.unwrap(validator: (Amount<Currency>) -> Amount<Currency>): Amount<Currency> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Amount<Currency>
    <R> -> Amount<Currency>

'it' @ [31:69] ==> value-parameter it: Amount<Currency> defined in net.corda.traderdemo.flow.BuyerFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [32:32] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.BuyerFlow[DeserializedPropertyDescriptor]

'networkMapCache' @ [32:43] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [32:59] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'TwoPartyTradeFlow' @ [33:21] ==> public object TwoPartyTradeFlow defined in net.corda.finance.flows[FakeCallableDescriptorForObject]

'Buyer' @ [33:39] ==> public constructor Buyer(otherParty: Party, notary: Party, acceptablePrice: Amount<Currency>, typeToBuy: Class<out OwnableState>) defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[DeserializedClassConstructorDescriptor]

'otherParty' @ [34:17] ==> public final val otherParty: Party defined in net.corda.traderdemo.flow.BuyerFlow[PropertyDescriptorImpl]

'notary' @ [35:17] ==> val notary: NodeInfo defined in net.corda.traderdemo.flow.BuyerFlow.call[LocalVariableDescriptor]

'notaryIdentity' @ [35:24] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'amount' @ [36:17] ==> val amount: Amount<Currency> defined in net.corda.traderdemo.flow.BuyerFlow.call[LocalVariableDescriptor]

'State' @ [37:33] ==> public constructor State(issuance: PartyAndReference, owner: AbstractParty, faceValue: Amount<Issued<Currency>>, maturityDate: Instant) defined in net.corda.finance.contracts.CommercialPaper.State[DeserializedClassConstructorDescriptor]

'java' @ [37:46] ==> public val <T> KClass<CommercialPaper.State>.java: Class<CommercialPaper.State> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> State

'subFlow' @ [40:42] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.traderdemo.flow.BuyerFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'buyer' @ [40:50] ==> val buyer: TwoPartyTradeFlow.Buyer defined in net.corda.traderdemo.flow.BuyerFlow.call[LocalVariableDescriptor]

'println' @ [42:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'+' @ [42:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'Emoji' @ [43:24] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'renderIfSupported' @ [43:30] ==> public final fun renderIfSupported(obj: Any): String defined in net.corda.core.internal.Emoji[DeserializedSimpleFunctionDescriptor]

'tradeTX' @ [43:48] ==> val tradeTX: SignedTransaction defined in net.corda.traderdemo.flow.BuyerFlow.call[LocalVariableDescriptor]

'tx' @ [43:56] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'logIssuanceAttachment' @ [45:9] ==> private final fun logIssuanceAttachment(tradeTX: SignedTransaction): Unit defined in net.corda.traderdemo.flow.BuyerFlow[SimpleFunctionDescriptorImpl]

'tradeTX' @ [45:31] ==> val tradeTX: SignedTransaction defined in net.corda.traderdemo.flow.BuyerFlow.call[LocalVariableDescriptor]

'logBalance' @ [46:9] ==> private final fun logBalance(): Unit defined in net.corda.traderdemo.flow.BuyerFlow[SimpleFunctionDescriptorImpl]

'serviceHub' @ [50:24] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.BuyerFlow[DeserializedPropertyDescriptor]

'getCashBalances' @ [50:35] ==> public fun ServiceHub.getCashBalances(): Map<Currency, Amount<Currency>> defined in net.corda.finance.contracts[DeserializedSimpleFunctionDescriptor]

'entries' @ [50:53] ==> public abstract val entries: Set<Map.Entry<Currency, Amount<Currency>>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [50:61] ==> public inline fun <T, R> Iterable<Map.Entry<Currency, Amount<Currency>>>.map(transform: (Map.Entry<Currency, Amount<Currency>>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<Currency, Amount<Currency>>
    <R> -> String

'it' @ [50:70] ==> value-parameter it: Map.Entry<Currency, Amount<Currency>> defined in net.corda.traderdemo.flow.BuyerFlow.logBalance.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [50:73] ==> public abstract val key: Currency defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'currencyCode' @ [50:77] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'it' @ [50:93] ==> value-parameter it: Map.Entry<Currency, Amount<Currency>> defined in net.corda.traderdemo.flow.BuyerFlow.logBalance.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [50:96] ==> public abstract val value: Amount<Currency> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'println' @ [51:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'balances' @ [51:39] ==> val balances: List<String> defined in net.corda.traderdemo.flow.BuyerFlow.logBalance[LocalVariableDescriptor]

'joinToString' @ [51:48] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'TransactionGraphSearch' @ [56:22] ==> public constructor TransactionGraphSearch(transactions: TransactionStorage, startPoints: List<WireTransaction>) defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedClassConstructorDescriptor]

'serviceHub' @ [56:45] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.BuyerFlow[DeserializedPropertyDescriptor]

'validatedTransactions' @ [56:56] ==> public abstract val validatedTransactions: TransactionStorage defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'listOf' @ [56:79] ==> public fun <T> listOf(element: WireTransaction): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'tradeTX' @ [56:86] ==> value-parameter tradeTX: SignedTransaction defined in net.corda.traderdemo.flow.BuyerFlow.logIssuanceAttachment[ValueParameterDescriptorImpl]

'tx' @ [56:94] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'search' @ [57:9] ==> val search: TransactionGraphSearch defined in net.corda.traderdemo.flow.BuyerFlow.logIssuanceAttachment[LocalVariableDescriptor]

'query' @ [57:16] ==> public final var query: TransactionGraphSearch.Query defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedPropertyDescriptor]

'Query' @ [57:47] ==> public constructor Query(withCommandOfType: Class<out CommandData>? = ..., followInputsOfType: Class<out ContractState>? = ...) defined in net.corda.core.contracts.TransactionGraphSearch.Query[DeserializedClassConstructorDescriptor]

'Issue' @ [57:98] ==> public constructor Issue() defined in net.corda.finance.contracts.CommercialPaper.Commands.Issue[DeserializedClassConstructorDescriptor]

'java' @ [57:111] ==> public val <T> KClass<CommercialPaper.Commands.Issue>.java: Class<CommercialPaper.Commands.Issue> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Issue

'State' @ [58:54] ==> public constructor State(issuance: PartyAndReference, owner: AbstractParty, faceValue: Amount<Issued<Currency>>, maturityDate: Instant) defined in net.corda.finance.contracts.CommercialPaper.State[DeserializedClassConstructorDescriptor]

'java' @ [58:67] ==> public val <T> KClass<CommercialPaper.State>.java: Class<CommercialPaper.State> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> State

'search' @ [59:26] ==> val search: TransactionGraphSearch defined in net.corda.traderdemo.flow.BuyerFlow.logIssuanceAttachment[LocalVariableDescriptor]

'call' @ [59:33] ==> public open fun call(): List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch[DeserializedSimpleFunctionDescriptor]

'single' @ [59:40] ==> public fun <T> List<WireTransaction>.single(): WireTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'cpIssuance' @ [63:9] ==> val cpIssuance: WireTransaction defined in net.corda.traderdemo.flow.BuyerFlow.logIssuanceAttachment[LocalVariableDescriptor]

'attachments' @ [63:20] ==> public open val attachments: List<SecureHash> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'first' @ [63:32] ==> public fun <T> List<SecureHash>.first(): SecureHash defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'let' @ [63:40] ==> @InlineOnly public inline fun <T, R> SecureHash.let(block: (SecureHash) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <R> -> Unit

'println' @ [64:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [66:110] ==> value-parameter it: SecureHash defined in net.corda.traderdemo.flow.BuyerFlow.logIssuanceAttachment.<anonymous>[ValueParameterDescriptorImpl]

'Emoji' @ [68:3] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'renderIfSupported' @ [68:9] ==> public final fun renderIfSupported(obj: Any): String defined in net.corda.core.internal.Emoji[DeserializedSimpleFunctionDescriptor]

'cpIssuance' @ [68:27] ==> val cpIssuance: WireTransaction defined in net.corda.traderdemo.flow.BuyerFlow.logIssuanceAttachment[LocalVariableDescriptor]

