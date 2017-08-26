'StartableByRPC' @ [25:1] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'emptySet' @ [31:44] ==> public fun <T> emptySet(): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'AbstractCashFlow<AbstractCashFlow.Result>' @ [31:58] ==> public constructor AbstractCashFlow<out T>(progressTracker: ProgressTracker) defined in net.corda.finance.flows.AbstractCashFlow[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Result

'progressTracker' @ [31:100] ==> value-parameter progressTracker: ProgressTracker defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'this' @ [33:63] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party, anonymous: Boolean, progressTracker: ProgressTracker, issuerConstraint: Set<Party> = ...) defined in net.corda.finance.flows.CashPaymentFlow[ClassConstructorDescriptorImpl]

'amount' @ [33:68] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'recipient' @ [33:76] ==> value-parameter recipient: Party defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'tracker' @ [33:93] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.AbstractCashFlow.Companion[SimpleFunctionDescriptorImpl]

'this' @ [35:83] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party, anonymous: Boolean, progressTracker: ProgressTracker, issuerConstraint: Set<Party> = ...) defined in net.corda.finance.flows.CashPaymentFlow[ClassConstructorDescriptorImpl]

'amount' @ [35:88] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'recipient' @ [35:96] ==> value-parameter recipient: Party defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'anonymous' @ [35:107] ==> value-parameter anonymous: Boolean defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'tracker' @ [35:118] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.AbstractCashFlow.Companion[SimpleFunctionDescriptorImpl]

'this' @ [36:44] ==> public constructor CashPaymentFlow(amount: Amount<Currency>, recipient: Party, anonymous: Boolean, progressTracker: ProgressTracker, issuerConstraint: Set<Party> = ...) defined in net.corda.finance.flows.CashPaymentFlow[ClassConstructorDescriptorImpl]

'request' @ [36:49] ==> value-parameter request: CashPaymentFlow.PaymentRequest defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'amount' @ [36:57] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[PropertyDescriptorImpl]

'request' @ [36:65] ==> value-parameter request: CashPaymentFlow.PaymentRequest defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'recipient' @ [36:73] ==> public final val recipient: Party defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[PropertyDescriptorImpl]

'request' @ [36:84] ==> value-parameter request: CashPaymentFlow.PaymentRequest defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'anonymous' @ [36:92] ==> public final val anonymous: Boolean defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[PropertyDescriptorImpl]

'tracker' @ [36:103] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.AbstractCashFlow.Companion[SimpleFunctionDescriptorImpl]

'request' @ [36:114] ==> value-parameter request: CashPaymentFlow.PaymentRequest defined in net.corda.finance.flows.CashPaymentFlow.<init>[ValueParameterDescriptorImpl]

'issuerConstraint' @ [36:122] ==> public final val issuerConstraint: Set<Party> defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest[PropertyDescriptorImpl]

'Suspendable' @ [38:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [40:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'currentStep' @ [40:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'GENERATING_ID' @ [40:39] ==> public object GENERATING_ID : ProgressTracker.Step defined in net.corda.finance.flows.AbstractCashFlow.Companion[FakeCallableDescriptorForObject]

'if (anonymous) {
            subFlow(TransactionKeyFlow(recipient))
        } else {
            emptyMap<Party, AnonymousParty>()
        }' @ [41:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<Party, AnonymousParty>, elseBranch: Map<Party, AnonymousParty>): Map<Party, AnonymousParty>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<Party, AnonymousParty>

'anonymous' @ [41:32] ==> public final val anonymous: Boolean defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'subFlow' @ [42:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */>): LinkedHashMap<Party, AnonymousParty> /* = LinkedHashMap<Party, AnonymousParty> */ defined in net.corda.finance.flows.CashPaymentFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> LinkedHashMap<Party, AnonymousParty>

'TransactionKeyFlow' @ [42:21] ==> public constructor TransactionKeyFlow(otherSide: Party) defined in net.corda.core.flows.TransactionKeyFlow[DeserializedClassConstructorDescriptor]

'recipient' @ [42:40] ==> public final val recipient: Party defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'emptyMap' @ [44:13] ==> public fun <K, V> emptyMap(): Map<Party, AnonymousParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Party
    <V> -> AnonymousParty

'txIdentities' @ [46:34] ==> val txIdentities: Map<Party, AnonymousParty> defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'recipient' @ [46:47] ==> public final val recipient: Party defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'recipient' @ [46:61] ==> public final val recipient: Party defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'progressTracker' @ [47:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'currentStep' @ [47:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'GENERATING_TX' @ [47:39] ==> public object GENERATING_TX : ProgressTracker.Step defined in net.corda.finance.flows.AbstractCashFlow.Companion[FakeCallableDescriptorForObject]

'TransactionBuilder' @ [48:23] ==> public constructor TransactionBuilder(notary: Party? = ..., lockId: UUID = ..., inputs: MutableList<StateRef> = ..., attachments: MutableList<SecureHash> = ..., outputs: MutableList<TransactionState<ContractState>> = ..., commands: MutableList<Command<*>> = ..., window: TimeWindow? = ..., privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'component1' @ [50:14] ==> public final operator fun component1(): TransactionBuilder defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [50:23] ==> public final operator fun component2(): List<PublicKey> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'Cash' @ [51:13] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [51:18] ==> @JvmStatic @Throws @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[SimpleFunctionDescriptorImpl]

'serviceHub' @ [51:32] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.CashPaymentFlow[DeserializedPropertyDescriptor]

'builder' @ [52:21] ==> val builder: TransactionBuilder defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'amount' @ [53:21] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'anonymousRecipient' @ [54:21] ==> val anonymousRecipient: AbstractParty defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'issuerConstraint' @ [55:21] ==> public final val issuerConstraint: Set<Party> defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'CashException' @ [57:19] ==> public constructor CashException(message: String, cause: Throwable) defined in net.corda.finance.flows.CashException[ClassConstructorDescriptorImpl]

'e' @ [57:65] ==> val e: InsufficientBalanceException defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'message' @ [57:67] ==> public open val message: String? defined in net.corda.core.contracts.InsufficientBalanceException[DeserializedPropertyDescriptor]

'e' @ [57:78] ==> val e: InsufficientBalanceException defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'progressTracker' @ [60:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'currentStep' @ [60:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SIGNING_TX' @ [60:39] ==> public object SIGNING_TX : ProgressTracker.Step defined in net.corda.finance.flows.AbstractCashFlow.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [61:18] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.CashPaymentFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [61:29] ==> public open fun signInitialTransaction(builder: TransactionBuilder, signingPubKeys: Iterable<PublicKey>): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'spendTX' @ [61:52] ==> val spendTX: TransactionBuilder defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'keysForSigning' @ [61:61] ==> val keysForSigning: List<PublicKey> defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'progressTracker' @ [63:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'currentStep' @ [63:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'FINALISING_TX' @ [63:39] ==> public object FINALISING_TX : ProgressTracker.Step defined in net.corda.finance.flows.AbstractCashFlow.Companion[FakeCallableDescriptorForObject]

'finaliseTx' @ [64:9] ==> @Suspendable protected final fun finaliseTx(participants: Set<Party>, tx: SignedTransaction, message: String): Unit defined in net.corda.finance.flows.CashPaymentFlow[SimpleFunctionDescriptorImpl]

'setOf' @ [64:20] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'recipient' @ [64:26] ==> public final val recipient: Party defined in net.corda.finance.flows.CashPaymentFlow[PropertyDescriptorImpl]

'tx' @ [64:38] ==> val tx: SignedTransaction defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'Result' @ [65:16] ==> public constructor Result(stx: SignedTransaction, recipient: AbstractParty?) defined in net.corda.finance.flows.AbstractCashFlow.Result[ClassConstructorDescriptorImpl]

'tx' @ [65:23] ==> val tx: SignedTransaction defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'anonymousRecipient' @ [65:27] ==> val anonymousRecipient: AbstractParty defined in net.corda.finance.flows.CashPaymentFlow.call[LocalVariableDescriptor]

'CordaSerializable' @ [68:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'emptySet' @ [69:133] ==> public fun <T> emptySet(): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'AbstractRequest' @ [69:147] ==> public constructor AbstractRequest(amount: Amount<Currency>) defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[ClassConstructorDescriptorImpl]

'amount' @ [69:163] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.flows.CashPaymentFlow.PaymentRequest.<init>[ValueParameterDescriptorImpl]

