'StartableByRPC' @ [24:1] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [29:81] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'this' @ [30:101] ==> public constructor CommercialPaperIssueFlow(amount: Amount<Currency>, issueRef: OpaqueBytes, recipient: Party, notary: Party, progressTracker: ProgressTracker) defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[ClassConstructorDescriptorImpl]

'amount' @ [30:106] ==> value-parameter amount: Amount<Currency> defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.<init>[ValueParameterDescriptorImpl]

'issueRef' @ [30:114] ==> value-parameter issueRef: OpaqueBytes defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.<init>[ValueParameterDescriptorImpl]

'recipient' @ [30:124] ==> value-parameter recipient: Party defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.<init>[ValueParameterDescriptorImpl]

'notary' @ [30:135] ==> value-parameter notary: Party defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.<init>[ValueParameterDescriptorImpl]

'tracker' @ [30:143] ==> public final fun tracker(): ProgressTracker defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.Companion[SimpleFunctionDescriptorImpl]

'SecureHash' @ [33:31] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [33:42] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'ProgressTracker.Step' @ [34:26] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [35:25] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'ISSUING' @ [35:41] ==> public object ISSUING : ProgressTracker.Step defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [38:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [40:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[PropertyDescriptorImpl]

'currentStep' @ [40:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'ISSUING' @ [40:39] ==> public object ISSUING : ProgressTracker.Step defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [42:18] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[DeserializedPropertyDescriptor]

'myInfo' @ [42:29] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [42:36] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'run' @ [43:43] ==> @InlineOnly public inline fun <T, R> CommercialPaperIssueFlow.run(block: CommercialPaperIssueFlow.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommercialPaperIssueFlow
    <R> -> SignedTransaction

'CommercialPaper' @ [44:22] ==> public constructor CommercialPaper() defined in net.corda.finance.contracts.CommercialPaper[DeserializedClassConstructorDescriptor]

'generateIssue' @ [44:40] ==> public final fun generateIssue(issuance: PartyAndReference, faceValue: Amount<Issued<Currency>>, maturityDate: Instant, notary: Party): TransactionBuilder defined in net.corda.finance.contracts.CommercialPaper[DeserializedSimpleFunctionDescriptor]

'me' @ [44:54] ==> val me: Party defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call[LocalVariableDescriptor]

'ref' @ [44:57] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'issueRef' @ [44:61] ==> public final val issueRef: OpaqueBytes defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[PropertyDescriptorImpl]

'amount' @ [44:72] ==> public final val amount: Amount<Currency> defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[PropertyDescriptorImpl]

'me' @ [44:91] ==> val me: Party defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call[LocalVariableDescriptor]

'ref' @ [44:94] ==> public open fun ref(bytes: OpaqueBytes): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'issueRef' @ [44:98] ==> public final val issueRef: OpaqueBytes defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[PropertyDescriptorImpl]

'+' @ [45:21] ==> public open fun plus(p0: (TemporalAmount..TemporalAmount?)): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'now' @ [45:29] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'days' @ [45:40] ==> public val Int.days: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'notary' @ [45:46] ==> public final val notary: Party defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[PropertyDescriptorImpl]

'tx' @ [50:13] ==> val tx: TransactionBuilder defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call.<anonymous>[LocalVariableDescriptor]

'addAttachment' @ [50:16] ==> public final fun addAttachment(attachmentId: SecureHash): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [50:30] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[DeserializedPropertyDescriptor]

'attachments' @ [50:41] ==> public abstract val attachments: AttachmentStorage defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'openAttachment' @ [50:53] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[DeserializedSimpleFunctionDescriptor]

'PROSPECTUS_HASH' @ [50:68] ==> public final val PROSPECTUS_HASH: SecureHash.SHA256 defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.Companion[PropertyDescriptorImpl]

'id' @ [50:87] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.Attachment[DeserializedPropertyDescriptor]

'tx' @ [53:13] ==> val tx: TransactionBuilder defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call.<anonymous>[LocalVariableDescriptor]

'setTimeWindow' @ [53:16] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'now' @ [53:38] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'seconds' @ [53:48] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'serviceHub' @ [56:23] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [56:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'tx' @ [56:57] ==> val tx: TransactionBuilder defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call.<anonymous>[LocalVariableDescriptor]

'subFlow' @ [58:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [58:21] ==> public constructor FinalityFlow(transaction: SignedTransaction) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [58:34] ==> val stx: SignedTransaction defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call.<anonymous>[LocalVariableDescriptor]

'single' @ [58:40] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'run' @ [62:39] ==> @InlineOnly public inline fun <T, R> CommercialPaperIssueFlow.run(block: CommercialPaperIssueFlow.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommercialPaperIssueFlow
    <R> -> SignedTransaction

'TransactionBuilder' @ [63:27] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [63:46] ==> public final val notary: Party defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[PropertyDescriptorImpl]

'CommercialPaper' @ [64:13] ==> public constructor CommercialPaper() defined in net.corda.finance.contracts.CommercialPaper[DeserializedClassConstructorDescriptor]

'generateMove' @ [64:31] ==> public final fun generateMove(tx: TransactionBuilder, paper: StateAndRef<CommercialPaper.State>, newOwner: AbstractParty): Unit defined in net.corda.finance.contracts.CommercialPaper[DeserializedSimpleFunctionDescriptor]

'builder' @ [64:44] ==> val builder: TransactionBuilder defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call.<anonymous>[LocalVariableDescriptor]

'issuance' @ [64:53] ==> val issuance: SignedTransaction defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call[LocalVariableDescriptor]

'tx' @ [64:62] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [64:65] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<CommercialPaper.State> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> State

'recipient' @ [64:76] ==> public final val recipient: Party defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[PropertyDescriptorImpl]

'serviceHub' @ [65:23] ==> public final val serviceHub: ServiceHub defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [65:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'builder' @ [65:57] ==> val builder: TransactionBuilder defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call.<anonymous>[LocalVariableDescriptor]

'subFlow' @ [66:13] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<List<SignedTransaction>>): List<SignedTransaction> defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<SignedTransaction>

'FinalityFlow' @ [66:21] ==> public constructor FinalityFlow(transaction: SignedTransaction) defined in net.corda.core.flows.FinalityFlow[DeserializedClassConstructorDescriptor]

'stx' @ [66:34] ==> val stx: SignedTransaction defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call.<anonymous>[LocalVariableDescriptor]

'single' @ [66:40] ==> public fun <T> List<SignedTransaction>.single(): SignedTransaction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'move' @ [69:16] ==> val move: SignedTransaction defined in net.corda.traderdemo.flow.CommercialPaperIssueFlow.call[LocalVariableDescriptor]

