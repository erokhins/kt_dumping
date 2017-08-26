'StartableByRPC' @ [18:1] ==> public constructor StartableByRPC() defined in net.corda.core.flows.StartableByRPC[DeserializedClassConstructorDescriptor]

'FlowLogic<SignedTransaction>' @ [19:123] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> SignedTransaction

'DoNothingContract' @ [25:33] ==> public object DoNothingContract : Contract defined in net.corda.notarydemo.flows.DummyIssueAndMove[FakeCallableDescriptorForObject]

'Suspendable' @ [28:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'serviceHub' @ [29:27] ==> public final val serviceHub: ServiceHub defined in net.corda.notarydemo.flows.DummyIssueAndMove[DeserializedPropertyDescriptor]

'run' @ [29:38] ==> @InlineOnly public inline fun <T, R> ServiceHub.run(block: ServiceHub.() -> SignedTransaction): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceHub
    <R> -> SignedTransaction

'Amount' @ [31:22] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Issued<Currency>) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Issued<Currency>

'Issued' @ [31:38] ==> public constructor Issued<out P : Any>(issuer: PartyAndReference, product: Currency) defined in net.corda.core.contracts.Issued[DeserializedClassConstructorDescriptor]
Inferred types:
    <out P : Any> -> Currency

'myInfo' @ [31:45] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [31:52] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'ref' @ [31:66] ==> public final fun ref(vararg bytes: Byte): PartyAndReference defined in net.corda.core.identity.Party[DeserializedSimpleFunctionDescriptor]

'GBP' @ [31:74] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'TransactionBuilder' @ [32:30] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [32:58] ==> private final val notary: Party defined in net.corda.notarydemo.flows.DummyIssueAndMove[PropertyDescriptorImpl]

'Cash' @ [33:23] ==> public constructor Cash() defined in net.corda.finance.contracts.asset.Cash[DeserializedClassConstructorDescriptor]

'generateIssue' @ [33:30] ==> public final fun generateIssue(tx: TransactionBuilder, amount: Amount<Issued<Currency>>, owner: AbstractParty, notary: Party): Set<PublicKey> defined in net.corda.finance.contracts.asset.Cash[DeserializedSimpleFunctionDescriptor]

'issueTxBuilder' @ [33:44] ==> val issueTxBuilder: TransactionBuilder defined in net.corda.notarydemo.flows.DummyIssueAndMove.call.<anonymous>[LocalVariableDescriptor]

'amount' @ [33:60] ==> val amount: Amount<Issued<Currency>> defined in net.corda.notarydemo.flows.DummyIssueAndMove.call.<anonymous>[LocalVariableDescriptor]

'serviceHub' @ [33:68] ==> public final val serviceHub: ServiceHub defined in net.corda.notarydemo.flows.DummyIssueAndMove[DeserializedPropertyDescriptor]

'myInfo' @ [33:79] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentity' @ [33:86] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'notary' @ [33:101] ==> private final val notary: Party defined in net.corda.notarydemo.flows.DummyIssueAndMove[PropertyDescriptorImpl]

'serviceHub' @ [34:23] ==> public final val serviceHub: ServiceHub defined in net.corda.notarydemo.flows.DummyIssueAndMove[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [34:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder, signingPubKeys: Iterable<PublicKey>): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'issueTxBuilder' @ [34:57] ==> val issueTxBuilder: TransactionBuilder defined in net.corda.notarydemo.flows.DummyIssueAndMove.call.<anonymous>[LocalVariableDescriptor]

'signers' @ [34:73] ==> val signers: Set<PublicKey> defined in net.corda.notarydemo.flows.DummyIssueAndMove.call.<anonymous>[LocalVariableDescriptor]

'serviceHub' @ [35:9] ==> public final val serviceHub: ServiceHub defined in net.corda.notarydemo.flows.DummyIssueAndMove[DeserializedPropertyDescriptor]

'recordTransactions' @ [35:20] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'issueTx' @ [35:39] ==> val issueTx: SignedTransaction defined in net.corda.notarydemo.flows.DummyIssueAndMove.call.<anonymous>[LocalVariableDescriptor]

'TransactionBuilder' @ [37:29] ==> public constructor TransactionBuilder(notary: Party) defined in net.corda.core.transactions.TransactionBuilder[DeserializedClassConstructorDescriptor]

'notary' @ [37:57] ==> private final val notary: Party defined in net.corda.notarydemo.flows.DummyIssueAndMove[PropertyDescriptorImpl]

'component1' @ [39:14] ==> public final operator fun component1(): TransactionBuilder defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [39:17] ==> public final operator fun component2(): List<PublicKey> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'Cash' @ [39:25] ==> public companion object defined in net.corda.finance.contracts.asset.Cash[FakeCallableDescriptorForObject]

'generateSpend' @ [39:30] ==> @JvmStatic @Suspendable public final fun generateSpend(services: ServiceHub, tx: TransactionBuilder, amount: Amount<Currency>, to: AbstractParty, onlyFromParties: Set<AbstractParty> = ...): Pair<TransactionBuilder, List<PublicKey>> defined in net.corda.finance.contracts.asset.Cash.Companion[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [39:44] ==> public final val serviceHub: ServiceHub defined in net.corda.notarydemo.flows.DummyIssueAndMove[DeserializedPropertyDescriptor]

'moveTxBuilder' @ [39:56] ==> val moveTxBuilder: TransactionBuilder defined in net.corda.notarydemo.flows.DummyIssueAndMove.call.<anonymous>[LocalVariableDescriptor]

'Amount' @ [39:71] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'amount' @ [39:78] ==> val amount: Amount<Issued<Currency>> defined in net.corda.notarydemo.flows.DummyIssueAndMove.call.<anonymous>[LocalVariableDescriptor]

'quantity' @ [39:85] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'GBP' @ [39:95] ==> @field:JvmField public val GBP: Currency defined in net.corda.finance[DeserializedPropertyDescriptor]

'counterpartyNode' @ [39:101] ==> private final val counterpartyNode: Party defined in net.corda.notarydemo.flows.DummyIssueAndMove[PropertyDescriptorImpl]

'signInitialTransaction' @ [41:9] ==> public open fun signInitialTransaction(builder: TransactionBuilder, signingPubKeys: Iterable<PublicKey>): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'moveTxBuilder' @ [41:32] ==> val moveTxBuilder: TransactionBuilder defined in net.corda.notarydemo.flows.DummyIssueAndMove.call.<anonymous>[LocalVariableDescriptor]

'keys' @ [41:47] ==> val keys: List<PublicKey> defined in net.corda.notarydemo.flows.DummyIssueAndMove.call.<anonymous>[LocalVariableDescriptor]

