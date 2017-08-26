'FlowException' @ [45:70] ==> public constructor FlowException(message: String?) defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

'givenPrice' @ [45:106] ==> value-parameter givenPrice: Amount<Currency> defined in net.corda.finance.flows.TwoPartyTradeFlow.UnacceptablePriceException.<init>[ValueParameterDescriptorImpl]

'FlowException' @ [47:88] ==> public constructor FlowException() defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

'expectedTypeName' @ [48:89] ==> public final val expectedTypeName: String defined in net.corda.finance.flows.TwoPartyTradeFlow.AssetMismatchException[PropertyDescriptorImpl]

'typeName' @ [48:110] ==> public final val typeName: String defined in net.corda.finance.flows.TwoPartyTradeFlow.AssetMismatchException[PropertyDescriptorImpl]

'CordaSerializable' @ [52:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'Seller' @ [63:71] ==> public companion object defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[FakeCallableDescriptorForObject]

'tracker' @ [63:78] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.Companion[SimpleFunctionDescriptorImpl]

'FlowLogic<SignedTransaction>' @ [63:91] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'ProgressTracker.Step' @ [66:40] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [68:44] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'SignTransactionFlow' @ [69:55] ==> public companion object defined in net.corda.core.flows.SignTransactionFlow[FakeCallableDescriptorForObject]

'tracker' @ [69:75] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.SignTransactionFlow.Companion[DeserializedSimpleFunctionDescriptor]

'ProgressTracker' @ [73:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'AWAITING_PROPOSAL' @ [73:45] ==> public object AWAITING_PROPOSAL : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.Companion[FakeCallableDescriptorForObject]

'VERIFYING_AND_SIGNING' @ [73:64] ==> public object VERIFYING_AND_SIGNING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [77:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [79:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'currentStep' @ [79:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'AWAITING_PROPOSAL' @ [79:43] ==> public object AWAITING_PROPOSAL : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.Companion[FakeCallableDescriptorForObject]

'SellerTradeInfo' @ [81:25] ==> public constructor SellerTradeInfo(price: Amount<Currency>, sellerOwner: AbstractParty) defined in net.corda.finance.flows.TwoPartyTradeFlow.SellerTradeInfo[ClassConstructorDescriptorImpl]

'price' @ [81:41] ==> public final val price: Amount<Currency> defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'me' @ [81:48] ==> public final val me: AbstractParty defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'subFlow' @ [85:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'SendStateAndRefFlow' @ [85:21] ==> public constructor SendStateAndRefFlow(otherSide: Party, stateAndRefs: List<StateAndRef<*>>) defined in net.corda.core.flows.SendStateAndRefFlow[DeserializedClassConstructorDescriptor]

'otherParty' @ [85:41] ==> public final val otherParty: Party defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'listOf' @ [85:53] ==> public fun <T> listOf(element: StateAndRef<OwnableState>): List<StateAndRef<OwnableState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<OwnableState>

'assetToSell' @ [85:60] ==> public final val assetToSell: StateAndRef<OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'send' @ [86:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[DeserializedSimpleFunctionDescriptor]

'otherParty' @ [86:18] ==> public final val otherParty: Party defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'hello' @ [86:30] ==> val hello: TwoPartyTradeFlow.SellerTradeInfo defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.call[LocalVariableDescriptor]

'progressTracker' @ [88:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'currentStep' @ [88:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'VERIFYING_AND_SIGNING' @ [88:43] ==> public object VERIFYING_AND_SIGNING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.Companion[FakeCallableDescriptorForObject]

'SignTransactionFlow' @ [90:48] ==> public constructor SignTransactionFlow(otherParty: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.SignTransactionFlow[DeserializedClassConstructorDescriptor]

'otherParty' @ [90:68] ==> public final val otherParty: Party defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'childProgressTracker' @ [90:102] ==> public open fun childProgressTracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.Companion.VERIFYING_AND_SIGNING[SimpleFunctionDescriptorImpl]

'stx' @ [92:25] ==> value-parameter stx: SignedTransaction defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.call.<no name provided>.checkTransaction[ValueParameterDescriptorImpl]

'tx' @ [92:29] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputStates' @ [92:32] ==> public final val outputStates: List<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'sumCashBy' @ [92:45] ==> public fun Iterable<ContractState>.sumCashBy(owner: AbstractParty): Amount<Issued<Currency>> defined in net.corda.finance.utils in file StateSummingUtilities.kt[SimpleFunctionDescriptorImpl]

'me' @ [92:55] ==> public final val me: AbstractParty defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'withoutIssuer' @ [92:59] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'price' @ [92:78] ==> public final val price: Amount<Currency> defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[PropertyDescriptorImpl]

'FlowException' @ [93:31] ==> public constructor FlowException(message: String?) defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

'subFlow' @ [96:20] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'signTransactionFlow' @ [96:28] ==> val signTransactionFlow: <no name provided> defined in net.corda.finance.flows.TwoPartyTradeFlow.Seller.call[LocalVariableDescriptor]

'FlowLogic<SignedTransaction>' @ [117:64] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'ProgressTracker.Step' @ [119:28] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [121:28] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [122:26] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker.Step' @ [123:40] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'CollectSignaturesFlow' @ [124:51] ==> public companion object defined in net.corda.core.flows.CollectSignaturesFlow[FakeCallableDescriptorForObject]

'tracker' @ [124:73] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.CollectSignaturesFlow.Companion[DeserializedSimpleFunctionDescriptor]

'ProgressTracker.Step' @ [127:28] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [132:40] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'RECEIVING' @ [132:56] ==> public object RECEIVING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'VERIFYING' @ [132:67] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'SIGNING' @ [132:78] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'COLLECTING_SIGNATURES' @ [132:87] ==> public object COLLECTING_SIGNATURES : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'RECORDING' @ [132:110] ==> public object RECORDING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'Suspendable' @ [136:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [139:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'currentStep' @ [139:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'RECEIVING' @ [139:43] ==> public object RECEIVING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'component1' @ [140:18] ==> public final operator fun component1(): StateAndRef<OwnableState> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [140:32] ==> public final operator fun component2(): TwoPartyTradeFlow.SellerTradeInfo defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'receiveAndValidateTradeRequest' @ [140:48] ==> @Suspendable private final fun receiveAndValidateTradeRequest(): Pair<StateAndRef<OwnableState>, TwoPartyTradeFlow.SellerTradeInfo> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[SimpleFunctionDescriptorImpl]

'progressTracker' @ [143:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'currentStep' @ [143:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SIGNING' @ [143:43] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'component1' @ [144:18] ==> public final operator fun component1(): TransactionBuilder defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [144:23] ==> public final operator fun component2(): List<PublicKey> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'assembleSharedTX' @ [144:45] ==> @Suspendable private final fun assembleSharedTX(assetForSale: StateAndRef<OwnableState>, tradeRequest: TwoPartyTradeFlow.SellerTradeInfo): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[SimpleFunctionDescriptorImpl]

'assetForSale' @ [144:62] ==> val assetForSale: StateAndRef<OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.call[LocalVariableDescriptor]

'tradeRequest' @ [144:76] ==> val tradeRequest: TwoPartyTradeFlow.SellerTradeInfo defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.call[LocalVariableDescriptor]

'serviceHub' @ [146:32] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [146:43] ==> public open fun signInitialTransaction(builder: TransactionBuilder, signingPubKeys: Iterable<PublicKey>): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'ptx' @ [146:66] ==> val ptx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.call[LocalVariableDescriptor]

'cashSigningPubKeys' @ [146:71] ==> val cashSigningPubKeys: List<PublicKey> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.call[LocalVariableDescriptor]

'progressTracker' @ [150:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'currentStep' @ [150:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'COLLECTING_SIGNATURES' @ [150:43] ==> public object COLLECTING_SIGNATURES : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'subFlow' @ [151:33] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'CollectSignaturesFlow' @ [151:41] ==> @JvmOverloads public constructor CollectSignaturesFlow(partiallySignedTx: SignedTransaction, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.CollectSignaturesFlow[DeserializedClassConstructorDescriptor]

'partSignedTx' @ [151:63] ==> val partSignedTx: SignedTransaction defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.call[LocalVariableDescriptor]

'childProgressTracker' @ [151:99] ==> public open fun childProgressTracker(): ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.COLLECTING_SIGNATURES[SimpleFunctionDescriptorImpl]

'progressTracker' @ [153:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'currentStep' @ [153:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'RECORDING' @ [153:43] ==> public object RECORDING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'subFlow' @ [154:20] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [154:28] ==> public constructor FinalityFlow(transaction: SignedTransaction) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'twiceSignedTx' @ [154:41] ==> val twiceSignedTx: SignedTransaction defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.call[LocalVariableDescriptor]

'single' @ [154:57] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'Suspendable' @ [157:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [159:32] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<@JvmSuppressWildcards List<StateAndRef<OwnableState>>>): @JvmSuppressWildcards List<StateAndRef<OwnableState>> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> [@kotlin.jvm.JvmSuppressWildcards] List<StateAndRef<OwnableState>>

'ReceiveStateAndRefFlow' @ [159:40] ==> public constructor ReceiveStateAndRefFlow<out T : ContractState>(otherParty: Party) defined in net.corda.core.flows.ReceiveStateAndRefFlow[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> OwnableState

'otherParty' @ [159:77] ==> public final val otherParty: Party defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'single' @ [159:90] ==> public fun <T> List<StateAndRef<OwnableState>>.single(): StateAndRef<OwnableState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<OwnableState>

'assetForSale' @ [160:20] ==> val assetForSale: StateAndRef<OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.receiveAndValidateTradeRequest[LocalVariableDescriptor]

'receive' @ [160:36] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<TwoPartyTradeFlow.SellerTradeInfo> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> SellerTradeInfo

'otherParty' @ [160:61] ==> public final val otherParty: Party defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'unwrap' @ [160:73] ==> public inline fun <T, R> UntrustworthyData<TwoPartyTradeFlow.SellerTradeInfo>.unwrap(validator: (TwoPartyTradeFlow.SellerTradeInfo) -> TwoPartyTradeFlow.SellerTradeInfo): TwoPartyTradeFlow.SellerTradeInfo defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SellerTradeInfo
    <R> -> SellerTradeInfo

'progressTracker' @ [161:17] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'currentStep' @ [161:33] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'VERIFYING' @ [161:47] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[FakeCallableDescriptorForObject]

'assetForSale' @ [162:29] ==> val assetForSale: StateAndRef<OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.receiveAndValidateTradeRequest[LocalVariableDescriptor]

'state' @ [162:42] ==> public final val state: TransactionState<OwnableState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [162:48] ==> public final val data: OwnableState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'asset' @ [163:37] ==> val asset: OwnableState defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.receiveAndValidateTradeRequest.<anonymous>[LocalVariableDescriptor]

'javaClass' @ [163:43] ==> public val <T : Any> OwnableState.javaClass: Class<OwnableState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> OwnableState

'name' @ [163:53] ==> public final val <T : (Any..Any?)> Class<OwnableState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> OwnableState

'it' @ [164:21] ==> value-parameter it: TwoPartyTradeFlow.SellerTradeInfo defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.receiveAndValidateTradeRequest.<anonymous>[ValueParameterDescriptorImpl]

'price' @ [164:24] ==> public final val price: Amount<Currency> defined in net.corda.finance.flows.TwoPartyTradeFlow.SellerTradeInfo[PropertyDescriptorImpl]

'acceptablePrice' @ [164:32] ==> public final val acceptablePrice: Amount<Currency> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'UnacceptablePriceException' @ [165:27] ==> public constructor UnacceptablePriceException(givenPrice: Amount<Currency>) defined in net.corda.finance.flows.TwoPartyTradeFlow.UnacceptablePriceException[ClassConstructorDescriptorImpl]

'it' @ [165:54] ==> value-parameter it: TwoPartyTradeFlow.SellerTradeInfo defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.receiveAndValidateTradeRequest.<anonymous>[ValueParameterDescriptorImpl]

'price' @ [165:57] ==> public final val price: Amount<Currency> defined in net.corda.finance.flows.TwoPartyTradeFlow.SellerTradeInfo[PropertyDescriptorImpl]

'!' @ [166:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeToBuy' @ [166:22] ==> public final val typeToBuy: Class<out OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'isInstance' @ [166:32] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'asset' @ [166:43] ==> val asset: OwnableState defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.receiveAndValidateTradeRequest.<anonymous>[LocalVariableDescriptor]

'AssetMismatchException' @ [167:27] ==> public constructor AssetMismatchException(expectedTypeName: String, typeName: String) defined in net.corda.finance.flows.TwoPartyTradeFlow.AssetMismatchException[ClassConstructorDescriptorImpl]

'typeToBuy' @ [167:50] ==> public final val typeToBuy: Class<out OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'name' @ [167:60] ==> public final val <T : (Any..Any?)> Class<out OwnableState>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out OwnableState)

'assetTypeName' @ [167:66] ==> val assetTypeName: (String..String?) defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.receiveAndValidateTradeRequest.<anonymous>[LocalVariableDescriptor]

'it' @ [168:17] ==> value-parameter it: TwoPartyTradeFlow.SellerTradeInfo defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.receiveAndValidateTradeRequest.<anonymous>[ValueParameterDescriptorImpl]

'Suspendable' @ [173:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'TransactionBuilder' @ [175:23] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [175:42] ==> public final val notary: Party defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[PropertyDescriptorImpl]

'component1' @ [178:18] ==> public final operator fun component1(): TransactionBuilder defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [178:22] ==> public final operator fun component2(): List<PublicKey> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'Cash' @ [178:44] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [178:49] ==> @JvmStatic @Throws @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[SimpleFunctionDescriptorImpl]

'serviceHub' @ [178:63] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[DeserializedPropertyDescriptor]

'ptx' @ [178:75] ==> val ptx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'tradeRequest' @ [178:80] ==> value-parameter tradeRequest: TwoPartyTradeFlow.SellerTradeInfo defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[ValueParameterDescriptorImpl]

'price' @ [178:93] ==> public final val price: Amount<Currency> defined in net.corda.finance.flows.TwoPartyTradeFlow.SellerTradeInfo[PropertyDescriptorImpl]

'tradeRequest' @ [178:100] ==> value-parameter tradeRequest: TwoPartyTradeFlow.SellerTradeInfo defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[ValueParameterDescriptorImpl]

'sellerOwner' @ [178:113] ==> public final val sellerOwner: AbstractParty defined in net.corda.finance.flows.TwoPartyTradeFlow.SellerTradeInfo[PropertyDescriptorImpl]

'tx' @ [181:13] ==> val tx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'addInputState' @ [181:16] ==> public open fun addInputState(stateAndRef: StateAndRef<*>): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'assetForSale' @ [181:30] ==> value-parameter assetForSale: StateAndRef<OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[ValueParameterDescriptorImpl]

'serviceHub' @ [187:28] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[DeserializedPropertyDescriptor]

'keyManagementService' @ [187:39] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'freshKey' @ [187:60] ==> @Suspendable public abstract fun freshKey(): PublicKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'component1' @ [188:18] ==> public final operator fun component1(): CommandData defined in net.corda.core.contracts.CommandAndState[DeserializedSimpleFunctionDescriptor]

'component2' @ [188:27] ==> public final operator fun component2(): OwnableState defined in net.corda.core.contracts.CommandAndState[DeserializedSimpleFunctionDescriptor]

'assetForSale' @ [188:36] ==> value-parameter assetForSale: StateAndRef<OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[ValueParameterDescriptorImpl]

'state' @ [188:49] ==> public final val state: TransactionState<OwnableState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [188:55] ==> public final val data: OwnableState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'withNewOwner' @ [188:60] ==> public abstract fun withNewOwner(newOwner: AbstractParty): CommandAndState defined in net.corda.core.contracts.OwnableState[DeserializedSimpleFunctionDescriptor]

'AnonymousParty' @ [188:73] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'freshKey' @ [188:88] ==> val freshKey: PublicKey defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'tx' @ [189:13] ==> val tx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'addOutputState' @ [189:16] ==> @JvmOverloads public final fun addOutputState(state: ContractState, notary: Party, encumbrance: Int? = ...): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'state' @ [189:31] ==> val state: OwnableState defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'assetForSale' @ [189:38] ==> value-parameter assetForSale: StateAndRef<OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[ValueParameterDescriptorImpl]

'state' @ [189:51] ==> public final val state: TransactionState<OwnableState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [189:57] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'tx' @ [190:13] ==> val tx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'addCommand' @ [190:16] ==> public final fun addCommand(data: CommandData, vararg keys: PublicKey): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'command' @ [190:27] ==> val command: CommandData defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'assetForSale' @ [190:36] ==> value-parameter assetForSale: StateAndRef<OwnableState> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[ValueParameterDescriptorImpl]

'state' @ [190:49] ==> public final val state: TransactionState<OwnableState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [190:55] ==> public final val data: OwnableState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'owner' @ [190:60] ==> public abstract val owner: AbstractParty defined in net.corda.core.contracts.OwnableState[DeserializedPropertyDescriptor]

'owningKey' @ [190:66] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'serviceHub' @ [194:31] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer[DeserializedPropertyDescriptor]

'clock' @ [194:42] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [194:48] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'tx' @ [195:13] ==> val tx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'setTimeWindow' @ [195:16] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'currentTime' @ [195:30] ==> val currentTime: (Instant..Instant?) defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'seconds' @ [195:46] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'Pair' @ [196:20] ==> public constructor Pair<out A, out B>(first: TransactionBuilder, second: List<PublicKey>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> TransactionBuilder
    <out B> -> List<PublicKey>

'tx' @ [196:25] ==> val tx: TransactionBuilder defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

'cashSigningPubKeys' @ [196:29] ==> val cashSigningPubKeys: List<PublicKey> defined in net.corda.finance.flows.TwoPartyTradeFlow.Buyer.assembleSharedTX[LocalVariableDescriptor]

