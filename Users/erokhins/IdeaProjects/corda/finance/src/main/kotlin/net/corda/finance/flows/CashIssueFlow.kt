'StartableByRPC' @ [27:1] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'AbstractCashFlow<AbstractCashFlow.Result>' @ [31:57] ==> public constructor AbstractCashFlow<out T>(progressTracker: ProgressTracker) defined in net.corda.finance.flows.AbstractCashFlow[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Result

'progressTracker' @ [31:99] ==> value-parameter progressTracker: ProgressTracker defined in net.corda.finance.flows.CashIssueFlow.<init>[ValueParameterDescriptorImpl]

'this' @ [34:34] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party, progressTracker: ProgressTracker) defined in net.corda.finance.flows.CashIssueFlow[ClassConstructorDescriptorImpl]

'amount' @ [34:39] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.flows.CashIssueFlow.<init>[ValueParameterDescriptorImpl]

'issuerBankPartyRef' @ [34:47] ==> value-parameter issuerBankPartyRef: OpaqueBytes defined in net.corda.finance.flows.CashIssueFlow.<init>[ValueParameterDescriptorImpl]

'notary' @ [34:67] ==> value-parameter notary: Party defined in net.corda.finance.flows.CashIssueFlow.<init>[ValueParameterDescriptorImpl]

'tracker' @ [34:75] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.AbstractCashFlow.Companion[SimpleFunctionDescriptorImpl]

'this' @ [35:42] ==> public constructor CashIssueFlow(amount: Amount<Currency>, issuerBankPartyRef: OpaqueBytes, notary: Party, progressTracker: ProgressTracker) defined in net.corda.finance.flows.CashIssueFlow[ClassConstructorDescriptorImpl]

'request' @ [35:47] ==> value-parameter request: CashIssueFlow.IssueRequest defined in net.corda.finance.flows.CashIssueFlow.<init>[ValueParameterDescriptorImpl]

'amount' @ [35:55] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashIssueFlow.IssueRequest[PropertyDescriptorImpl]

'request' @ [35:63] ==> value-parameter request: CashIssueFlow.IssueRequest defined in net.corda.finance.flows.CashIssueFlow.<init>[ValueParameterDescriptorImpl]

'issueRef' @ [35:71] ==> public final val issueRef: OpaqueBytes defined in net.corda.finance.flows.CashIssueFlow.IssueRequest[PropertyDescriptorImpl]

'request' @ [35:81] ==> value-parameter request: CashIssueFlow.IssueRequest defined in net.corda.finance.flows.CashIssueFlow.<init>[ValueParameterDescriptorImpl]

'notary' @ [35:89] ==> public final val notary: Party defined in net.corda.finance.flows.CashIssueFlow.IssueRequest[PropertyDescriptorImpl]

'tracker' @ [35:97] ==> public final fun tracker(): ProgressTracker defined in net.corda.finance.flows.AbstractCashFlow.Companion[SimpleFunctionDescriptorImpl]

'Suspendable' @ [37:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'serviceHub' @ [39:26] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.CashIssueFlow[DeserializedPropertyDescriptor]

'myInfo' @ [39:37] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [39:44] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'progressTracker' @ [41:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.CashIssueFlow[PropertyDescriptorImpl]

'currentStep' @ [41:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'GENERATING_TX' @ [41:39] ==> public object GENERATING_TX : ProgressTracker.Step defined in net.corda.finance.flows.AbstractCashFlow.Companion[FakeCallableDescriptorForObject]

'TransactionBuilder' @ [42:23] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [42:42] ==> public final val notary: Party defined in net.corda.finance.flows.CashIssueFlow[PropertyDescriptorImpl]

'issuerCert' @ [43:22] ==> val issuerCert: PartyAndCertificate defined in net.corda.finance.flows.CashIssueFlow.call[LocalVariableDescriptor]

'party' @ [43:33] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'ref' @ [43:39] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'issuerBankPartyRef' @ [43:43] ==> public final val issuerBankPartyRef: OpaqueBytes defined in net.corda.finance.flows.CashIssueFlow[PropertyDescriptorImpl]

'Cash' @ [44:23] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[ClassConstructorDescriptorImpl]

'generateIssue' @ [44:30] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[SimpleFunctionDescriptorImpl]

'builder' @ [44:44] ==> val builder: TransactionBuilder defined in net.corda.finance.flows.CashIssueFlow.call[LocalVariableDescriptor]

'amount' @ [44:53] ==> public final val amount: Amount<Currency> defined in net.corda.finance.flows.CashIssueFlow[PropertyDescriptorImpl]

'issuedBy' @ [44:60] ==> public infix fun Amount<Currency>.issuedBy(deposit: PartyAndReference): Amount<Issued<Currency>> defined in net.corda.finance[SimpleFunctionDescriptorImpl]

'issuer' @ [44:69] ==> val issuer: PartyAndReference defined in net.corda.finance.flows.CashIssueFlow.call[LocalVariableDescriptor]

'issuerCert' @ [44:78] ==> val issuerCert: PartyAndCertificate defined in net.corda.finance.flows.CashIssueFlow.call[LocalVariableDescriptor]

'party' @ [44:89] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'notary' @ [44:96] ==> public final val notary: Party defined in net.corda.finance.flows.CashIssueFlow[PropertyDescriptorImpl]

'progressTracker' @ [45:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.CashIssueFlow[PropertyDescriptorImpl]

'currentStep' @ [45:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SIGNING_TX' @ [45:39] ==> public object SIGNING_TX : ProgressTracker.Step defined in net.corda.finance.flows.AbstractCashFlow.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [46:18] ==> public final val serviceHub: ServiceHub defined in net.corda.finance.flows.CashIssueFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [46:29] ==> public open fun signInitialTransaction(builder: TransactionBuilder, signingPubKeys: Iterable<PublicKey>): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [46:52] ==> val builder: TransactionBuilder defined in net.corda.finance.flows.CashIssueFlow.call[LocalVariableDescriptor]

'signers' @ [46:61] ==> val signers: Set<PublicKey> defined in net.corda.finance.flows.CashIssueFlow.call[LocalVariableDescriptor]

'progressTracker' @ [47:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.finance.flows.CashIssueFlow[PropertyDescriptorImpl]

'currentStep' @ [47:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'FINALISING_TX' @ [47:39] ==> public object FINALISING_TX : ProgressTracker.Step defined in net.corda.finance.flows.AbstractCashFlow.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [48:9] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.finance.flows.CashIssueFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [48:17] ==> public constructor FinalityFlow(transaction: SignedTransaction) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'tx' @ [48:30] ==> val tx: SignedTransaction defined in net.corda.finance.flows.CashIssueFlow.call[LocalVariableDescriptor]

'Result' @ [49:16] ==> public constructor Result(stx: SignedTransaction, recipient: AbstractParty?) defined in net.corda.finance.flows.AbstractCashFlow.Result[ClassConstructorDescriptorImpl]

'tx' @ [49:23] ==> val tx: SignedTransaction defined in net.corda.finance.flows.CashIssueFlow.call[LocalVariableDescriptor]

'issuerCert' @ [49:27] ==> val issuerCert: PartyAndCertificate defined in net.corda.finance.flows.CashIssueFlow.call[LocalVariableDescriptor]

'party' @ [49:38] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'CordaSerializable' @ [52:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'AbstractRequest' @ [53:98] ==> public constructor AbstractRequest(amount: Amount<Currency>) defined in net.corda.finance.flows.AbstractCashFlow.AbstractRequest[ClassConstructorDescriptorImpl]

'amount' @ [53:114] ==> value-parameter amount: Amount<Currency> defined in net.corda.finance.flows.CashIssueFlow.IssueRequest.<init>[ValueParameterDescriptorImpl]

