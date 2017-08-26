'FlowLogic<List<SignedTransaction>>' @ [39:69] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> List<SignedTransaction>

'extraRecipients' @ [40:47] ==> public final val extraRecipients: Set<Party> defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'map' @ [40:63] ==> public inline fun <T, R> Iterable<Party>.map(transform: (Party) -> FinalityFlow.Participant): List<FinalityFlow.Participant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> Participant

'Participant' @ [40:75] ==> public constructor Participant(participant: AbstractParty, wellKnown: Party?) defined in net.corda.core.flows.FinalityFlow.Participant[ClassConstructorDescriptorImpl]

'it' @ [40:87] ==> value-parameter it: Party defined in net.corda.core.flows.FinalityFlow.extraParticipants.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [40:91] ==> value-parameter it: Party defined in net.corda.core.flows.FinalityFlow.extraParticipants.<anonymous>[ValueParameterDescriptorImpl]

'toSet' @ [40:97] ==> public fun <T> Iterable<FinalityFlow.Participant>.toSet(): Set<FinalityFlow.Participant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Participant

'this' @ [41:82] ==> public constructor FinalityFlow(transactions: Iterable<SignedTransaction>, extraRecipients: Set<Party>, progressTracker: ProgressTracker) defined in net.corda.core.flows.FinalityFlow[ClassConstructorDescriptorImpl]

'listOf' @ [41:87] ==> public fun <T> listOf(element: SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'transaction' @ [41:94] ==> value-parameter transaction: SignedTransaction defined in net.corda.core.flows.FinalityFlow.<init>[ValueParameterDescriptorImpl]

'extraParticipants' @ [41:108] ==> value-parameter extraParticipants: Set<Party> defined in net.corda.core.flows.FinalityFlow.<init>[ValueParameterDescriptorImpl]

'tracker' @ [41:127] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.FinalityFlow.Companion[SimpleFunctionDescriptorImpl]

'this' @ [42:51] ==> public constructor FinalityFlow(transactions: Iterable<SignedTransaction>, extraRecipients: Set<Party>, progressTracker: ProgressTracker) defined in net.corda.core.flows.FinalityFlow[ClassConstructorDescriptorImpl]

'listOf' @ [42:56] ==> public fun <T> listOf(element: SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'transaction' @ [42:63] ==> value-parameter transaction: SignedTransaction defined in net.corda.core.flows.FinalityFlow.<init>[ValueParameterDescriptorImpl]

'emptySet' @ [42:77] ==> public fun <T> emptySet(): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'tracker' @ [42:89] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.FinalityFlow.Companion[SimpleFunctionDescriptorImpl]

'this' @ [43:85] ==> public constructor FinalityFlow(transactions: Iterable<SignedTransaction>, extraRecipients: Set<Party>, progressTracker: ProgressTracker) defined in net.corda.core.flows.FinalityFlow[ClassConstructorDescriptorImpl]

'listOf' @ [43:90] ==> public fun <T> listOf(element: SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'transaction' @ [43:97] ==> value-parameter transaction: SignedTransaction defined in net.corda.core.flows.FinalityFlow.<init>[ValueParameterDescriptorImpl]

'emptySet' @ [43:111] ==> public fun <T> emptySet(): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'progressTracker' @ [43:123] ==> value-parameter progressTracker: ProgressTracker defined in net.corda.core.flows.FinalityFlow.<init>[ValueParameterDescriptorImpl]

'ProgressTracker.Step' @ [46:29] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'NotaryFlow' @ [47:51] ==> public object NotaryFlow defined in net.corda.core.flows in file NotaryFlow.kt[FakeCallableDescriptorForObject]

'tracker' @ [47:69] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.NotaryFlow.Client.Companion[SimpleFunctionDescriptorImpl]

'ProgressTracker.Step' @ [50:31] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker' @ [53:25] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[ClassConstructorDescriptorImpl]

'NOTARISING' @ [53:41] ==> public object NOTARISING : ProgressTracker.Step defined in net.corda.core.flows.FinalityFlow.Companion[FakeCallableDescriptorForObject]

'BROADCASTING' @ [53:53] ==> public object BROADCASTING : ProgressTracker.Step defined in net.corda.core.flows.FinalityFlow.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [57:17] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'myInfo' @ [57:28] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'legalIdentity' @ [57:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'Suspendable' @ [59:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [60:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotaryException' @ [60:13] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[ClassConstructorDescriptorImpl]

'progressTracker' @ [67:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'currentStep' @ [67:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'NOTARISING' @ [67:39] ==> public object NOTARISING : ProgressTracker.Step defined in net.corda.core.flows.FinalityFlow.Companion[FakeCallableDescriptorForObject]

'resolveDependenciesOf' @ [68:78] ==> private final fun resolveDependenciesOf(signedTransactions: Iterable<SignedTransaction>): List<Pair<SignedTransaction, LedgerTransaction>> defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]

'transactions' @ [68:100] ==> public final val transactions: Iterable<SignedTransaction> defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'map' @ [69:18] ==> public inline fun <T, R> Iterable<Pair<SignedTransaction, LedgerTransaction>>.map(transform: (Pair<SignedTransaction, LedgerTransaction>) -> Pair<SignedTransaction, Set<FinalityFlow.Participant>>): List<Pair<SignedTransaction, Set<FinalityFlow.Participant>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SignedTransaction, LedgerTransaction>
    <R> -> Pair<SignedTransaction, Set<Participant>>

'component1' @ [69:25] ==> public final operator fun component1(): SignedTransaction defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [69:30] ==> public final operator fun component2(): LedgerTransaction defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'Pair' @ [69:38] ==> public constructor Pair<out A, out B>(first: SignedTransaction, second: Set<FinalityFlow.Participant>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SignedTransaction
    <out B> -> Set<Participant>

'notariseAndRecord' @ [69:43] ==> @Suspendable private final fun notariseAndRecord(stx: SignedTransaction): SignedTransaction defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]

'stx' @ [69:61] ==> val stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.call.<anonymous>[LocalVariableDescriptor]

'lookupParties' @ [69:67] ==> protected open fun lookupParties(ltx: LedgerTransaction): Set<FinalityFlow.Participant> defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]

'ltx' @ [69:81] ==> val ltx: LedgerTransaction defined in net.corda.core.flows.FinalityFlow.call.<anonymous>[LocalVariableDescriptor]

'progressTracker' @ [72:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'currentStep' @ [72:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'BROADCASTING' @ [72:39] ==> public object BROADCASTING : ProgressTracker.Step defined in net.corda.core.flows.FinalityFlow.Companion[FakeCallableDescriptorForObject]

'component1' @ [73:15] ==> public final operator fun component1(): SignedTransaction defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [73:20] ==> public final operator fun component2(): Set<FinalityFlow.Participant> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'notarisedTxns' @ [73:32] ==> val notarisedTxns: List<Pair<SignedTransaction, Set<FinalityFlow.Participant>>> defined in net.corda.core.flows.FinalityFlow.call[LocalVariableDescriptor]

'broadcastTransaction' @ [74:13] ==> @Suspendable protected open fun broadcastTransaction(stx: SignedTransaction, participants: Iterable<FinalityFlow.Participant>): Unit defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]

'stx' @ [74:34] ==> val stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.call[LocalVariableDescriptor]

'parties' @ [74:40] ==> val parties: Set<FinalityFlow.Participant> defined in net.corda.core.flows.FinalityFlow.call[LocalVariableDescriptor]

'extraParticipants' @ [74:50] ==> public final val extraParticipants: Set<FinalityFlow.Participant> defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'filter' @ [74:69] ==> public inline fun <T> Iterable<FinalityFlow.Participant>.filter(predicate: (FinalityFlow.Participant) -> Boolean): List<FinalityFlow.Participant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Participant

'it' @ [74:78] ==> value-parameter it: FinalityFlow.Participant defined in net.corda.core.flows.FinalityFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'wellKnown' @ [74:81] ==> public final val wellKnown: Party? defined in net.corda.core.flows.FinalityFlow.Participant[PropertyDescriptorImpl]

'me' @ [74:94] ==> protected open val me: Party defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'notarisedTxns' @ [76:16] ==> val notarisedTxns: List<Pair<SignedTransaction, Set<FinalityFlow.Participant>>> defined in net.corda.core.flows.FinalityFlow.call[LocalVariableDescriptor]

'map' @ [76:30] ==> public inline fun <T, R> Iterable<Pair<SignedTransaction, Set<FinalityFlow.Participant>>>.map(transform: (Pair<SignedTransaction, Set<FinalityFlow.Participant>>) -> SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SignedTransaction, Set<Participant>>
    <R> -> SignedTransaction

'it' @ [76:36] ==> value-parameter it: Pair<SignedTransaction, Set<FinalityFlow.Participant>> defined in net.corda.core.flows.FinalityFlow.call.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [76:39] ==> public final val first: SignedTransaction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Suspendable' @ [87:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'participants' @ [89:37] ==> value-parameter participants: Iterable<FinalityFlow.Participant> defined in net.corda.core.flows.FinalityFlow.broadcastTransaction[ValueParameterDescriptorImpl]

'map' @ [89:50] ==> public inline fun <T, R> Iterable<FinalityFlow.Participant>.map(transform: (FinalityFlow.Participant) -> Party?): List<Party?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Participant
    <R> -> Party?

'it' @ [89:56] ==> value-parameter it: FinalityFlow.Participant defined in net.corda.core.flows.FinalityFlow.broadcastTransaction.<anonymous>[ValueParameterDescriptorImpl]

'wellKnown' @ [89:59] ==> public final val wellKnown: Party? defined in net.corda.core.flows.FinalityFlow.Participant[PropertyDescriptorImpl]

'filterNotNull' @ [89:71] ==> public fun <T : Any> Iterable<Party?>.filterNotNull(): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Party

'wellKnownParticipants' @ [90:13] ==> val wellKnownParticipants: List<Party> defined in net.corda.core.flows.FinalityFlow.broadcastTransaction[LocalVariableDescriptor]

'isNotEmpty' @ [90:35] ==> @InlineOnly public inline fun <T> Collection<Party>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'subFlow' @ [91:13] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<Unit>): Unit defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Unit

'BroadcastTransactionFlow' @ [91:21] ==> public constructor BroadcastTransactionFlow(notarisedTransaction: SignedTransaction, participants: NonEmptySet<Party>) defined in net.corda.core.flows.BroadcastTransactionFlow[ClassConstructorDescriptorImpl]

'stx' @ [91:46] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.broadcastTransaction[ValueParameterDescriptorImpl]

'wellKnownParticipants' @ [91:51] ==> val wellKnownParticipants: List<Party> defined in net.corda.core.flows.FinalityFlow.broadcastTransaction[LocalVariableDescriptor]

'toNonEmptySet' @ [91:73] ==> public fun <T> Collection<Party>.toNonEmptySet(): NonEmptySet<Party> defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Party

'Suspendable' @ [95:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'if (needsNotarySignature(stx)) {
            val notarySignatures = subFlow(NotaryFlow.Client(stx))
            stx + notarySignatures
        } else {
            stx
        }' @ [97:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SignedTransaction, elseBranch: SignedTransaction): SignedTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SignedTransaction

'needsNotarySignature' @ [97:29] ==> private final fun needsNotarySignature(stx: SignedTransaction): Boolean defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]

'stx' @ [97:50] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.notariseAndRecord[ValueParameterDescriptorImpl]

'subFlow' @ [98:36] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<List<TransactionSignature>>): List<TransactionSignature> defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> List<TransactionSignature>

'Client' @ [98:55] ==> public constructor Client(stx: SignedTransaction) defined in net.corda.core.flows.NotaryFlow.Client[ClassConstructorDescriptorImpl]

'stx' @ [98:62] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.notariseAndRecord[ValueParameterDescriptorImpl]

'stx' @ [99:13] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.notariseAndRecord[ValueParameterDescriptorImpl]

'notarySignatures' @ [99:19] ==> val notarySignatures: List<TransactionSignature> defined in net.corda.core.flows.FinalityFlow.notariseAndRecord[LocalVariableDescriptor]

'stx' @ [101:13] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.notariseAndRecord[ValueParameterDescriptorImpl]

'serviceHub' @ [103:9] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'recordTransactions' @ [103:20] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'notarised' @ [103:39] ==> val notarised: SignedTransaction defined in net.corda.core.flows.FinalityFlow.notariseAndRecord[LocalVariableDescriptor]

'notarised' @ [104:16] ==> val notarised: SignedTransaction defined in net.corda.core.flows.FinalityFlow.notariseAndRecord[LocalVariableDescriptor]

'stx' @ [108:19] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.needsNotarySignature[ValueParameterDescriptorImpl]

'tx' @ [108:23] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'wtx' @ [109:33] ==> val wtx: WireTransaction defined in net.corda.core.flows.FinalityFlow.needsNotarySignature[LocalVariableDescriptor]

'inputs' @ [109:37] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'isNotEmpty' @ [109:44] ==> @InlineOnly public inline fun <T> Collection<StateRef>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'wtx' @ [109:60] ==> val wtx: WireTransaction defined in net.corda.core.flows.FinalityFlow.needsNotarySignature[LocalVariableDescriptor]

'timeWindow' @ [109:64] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'needsNotarisation' @ [110:16] ==> val needsNotarisation: Boolean defined in net.corda.core.flows.FinalityFlow.needsNotarySignature[LocalVariableDescriptor]

'hasNoNotarySignature' @ [110:37] ==> private final fun hasNoNotarySignature(stx: SignedTransaction): Boolean defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]

'stx' @ [110:58] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.needsNotarySignature[ValueParameterDescriptorImpl]

'stx' @ [115:25] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.hasNoNotarySignature[ValueParameterDescriptorImpl]

'tx' @ [115:29] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'notary' @ [115:32] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'owningKey' @ [115:40] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'stx' @ [116:23] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.hasNoNotarySignature[ValueParameterDescriptorImpl]

'sigs' @ [116:27] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'map' @ [116:32] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'it' @ [116:38] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.FinalityFlow.hasNoNotarySignature.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [116:41] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'toSet' @ [116:46] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'!' @ [117:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'notaryKey' @ [117:18] ==> val notaryKey: PublicKey? defined in net.corda.core.flows.FinalityFlow.hasNoNotarySignature[LocalVariableDescriptor]

'isFulfilledBy' @ [117:29] ==> public fun PublicKey.isFulfilledBy(otherKeys: Iterable<PublicKey>): Boolean defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'signers' @ [117:43] ==> val signers: Set<PublicKey> defined in net.corda.core.flows.FinalityFlow.hasNoNotarySignature[LocalVariableDescriptor]

'extractParticipants' @ [127:16] ==> protected final fun extractParticipants(ltx: LedgerTransaction): List<AbstractParty> defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]

'ltx' @ [127:36] ==> value-parameter ltx: LedgerTransaction defined in net.corda.core.flows.FinalityFlow.lookupParties[ValueParameterDescriptorImpl]

'map' @ [128:18] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> FinalityFlow.Participant): List<FinalityFlow.Participant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> Participant

'this' @ [128:22] ==> <this> defined in net.corda.core.flows.FinalityFlow[LazyClassReceiverParameterDescriptor]

'partyFromAnonymous' @ [128:28] ==> protected final fun partyFromAnonymous(anon: AbstractParty): FinalityFlow.Participant defined in net.corda.core.flows.FinalityFlow[SimpleFunctionDescriptorImpl]

'toSet' @ [129:18] ==> public fun <T> Iterable<FinalityFlow.Participant>.toSet(): Set<FinalityFlow.Participant> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Participant

'ltx' @ [137:16] ==> value-parameter ltx: LedgerTransaction defined in net.corda.core.flows.FinalityFlow.extractParticipants[ValueParameterDescriptorImpl]

'outputStates' @ [137:20] ==> public final val outputStates: List<ContractState> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'flatMap' @ [137:33] ==> public inline fun <T, R> Iterable<ContractState>.flatMap(transform: (ContractState) -> Iterable<AbstractParty>): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ContractState
    <R> -> AbstractParty

'it' @ [137:43] ==> value-parameter it: ContractState defined in net.corda.core.flows.FinalityFlow.extractParticipants.<anonymous>[ValueParameterDescriptorImpl]

'participants' @ [137:46] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'ltx' @ [137:63] ==> value-parameter ltx: LedgerTransaction defined in net.corda.core.flows.FinalityFlow.extractParticipants[ValueParameterDescriptorImpl]

'inputStates' @ [137:67] ==> public final val inputStates: List<ContractState> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'flatMap' @ [137:79] ==> public inline fun <T, R> Iterable<ContractState>.flatMap(transform: (ContractState) -> Iterable<AbstractParty>): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ContractState
    <R> -> AbstractParty

'it' @ [137:89] ==> value-parameter it: ContractState defined in net.corda.core.flows.FinalityFlow.extractParticipants.<anonymous>[ValueParameterDescriptorImpl]

'participants' @ [137:92] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'Participant' @ [144:16] ==> public constructor Participant(participant: AbstractParty, wellKnown: Party?) defined in net.corda.core.flows.FinalityFlow.Participant[ClassConstructorDescriptorImpl]

'anon' @ [144:28] ==> value-parameter anon: AbstractParty defined in net.corda.core.flows.FinalityFlow.partyFromAnonymous[ValueParameterDescriptorImpl]

'serviceHub' @ [144:34] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'identityService' @ [144:45] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'partyFromAnonymous' @ [144:61] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'anon' @ [144:80] ==> value-parameter anon: AbstractParty defined in net.corda.core.flows.FinalityFlow.partyFromAnonymous[ValueParameterDescriptorImpl]

'ResolveTransactionsFlow' @ [149:22] ==> public companion object defined in net.corda.core.internal.ResolveTransactionsFlow[FakeCallableDescriptorForObject]

'topologicalSort' @ [149:46] ==> @JvmStatic public final fun topologicalSort(transactions: Collection<SignedTransaction>): List<SignedTransaction> defined in net.corda.core.internal.ResolveTransactionsFlow.Companion[SimpleFunctionDescriptorImpl]

'signedTransactions' @ [149:62] ==> value-parameter signedTransactions: Iterable<SignedTransaction> defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf[ValueParameterDescriptorImpl]

'toList' @ [149:81] ==> public fun <T> Iterable<SignedTransaction>.toList(): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'serviceHub' @ [152:54] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.FinalityFlow[PropertyDescriptorImpl]

'sorted' @ [153:28] ==> val sorted: List<SignedTransaction> defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf[LocalVariableDescriptor]

'associateBy' @ [153:35] ==> public inline fun <T, K> Iterable<SignedTransaction>.associateBy(keySelector: (SignedTransaction) -> SecureHash): Map<SecureHash, SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <K> -> SecureHash

'it' @ [153:49] ==> value-parameter it: SignedTransaction defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<no name provided>.hashToTx.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [153:52] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'hashToTx' @ [155:66] ==> public final val hashToTx: Map<SecureHash, SignedTransaction> defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<no name provided>[PropertyDescriptorImpl]

'stateRef' @ [155:75] ==> value-parameter stateRef: StateRef defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<no name provided>.loadState[ValueParameterDescriptorImpl]

'txhash' @ [155:84] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'let' @ [155:93] ==> @InlineOnly public inline fun <T, R> SignedTransaction.let(block: (SignedTransaction) -> TransactionState<ContractState>): TransactionState<ContractState> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> TransactionState<ContractState>

'it' @ [155:99] ==> value-parameter it: SignedTransaction defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<no name provided>.loadState.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [155:102] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'outputs' @ [155:105] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'stateRef' @ [155:113] ==> value-parameter stateRef: StateRef defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<no name provided>.loadState[ValueParameterDescriptorImpl]

'index' @ [155:122] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'provided' @ [156:24] ==> val provided: TransactionState<ContractState>? defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<no name provided>.loadState[LocalVariableDescriptor]

'super' @ [156:36] ==> <this> defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<no name provided>[LazyClassReceiverParameterDescriptor]

'loadState' @ [156:42] ==> @Throws public open fun loadState(stateRef: StateRef): TransactionState<*> defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'stateRef' @ [156:52] ==> value-parameter stateRef: StateRef defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<no name provided>.loadState[ValueParameterDescriptorImpl]

'sorted' @ [160:16] ==> val sorted: List<SignedTransaction> defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf[LocalVariableDescriptor]

'map' @ [160:23] ==> public inline fun <T, R> Iterable<SignedTransaction>.map(transform: (SignedTransaction) -> Pair<SignedTransaction, LedgerTransaction>): List<Pair<SignedTransaction, LedgerTransaction>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> Pair<SignedTransaction, LedgerTransaction>

'stx' @ [161:26] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [161:30] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'notary' @ [161:33] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'if (notary != null) stx.verifySignaturesExcept(notary.owningKey) else stx.verifyRequiredSignatures()' @ [163:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'notary' @ [163:17] ==> val notary: Party? defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<anonymous>[LocalVariableDescriptor]

'stx' @ [163:33] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<anonymous>[ValueParameterDescriptorImpl]

'verifySignaturesExcept' @ [163:37] ==> @Throws public open fun verifySignaturesExcept(vararg allowedToBeMissing: PublicKey): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'notary' @ [163:60] ==> val notary: Party? defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<anonymous>[LocalVariableDescriptor]

'owningKey' @ [163:67] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'stx' @ [163:83] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<anonymous>[ValueParameterDescriptorImpl]

'verifyRequiredSignatures' @ [163:87] ==> @Throws public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'stx' @ [164:23] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<anonymous>[ValueParameterDescriptorImpl]

'toLedgerTransaction' @ [164:27] ==> @JvmOverloads @Throws public final fun toLedgerTransaction(services: ServiceHub, checkSufficientSignatures: Boolean = ...): LedgerTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'augmentedLookup' @ [164:47] ==> val augmentedLookup: <no name provided> defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf[LocalVariableDescriptor]

'ltx' @ [165:13] ==> val ltx: LedgerTransaction defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<anonymous>[LocalVariableDescriptor]

'verify' @ [165:17] ==> @Throws public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]

'stx' @ [166:13] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<anonymous>[ValueParameterDescriptorImpl]

'ltx' @ [166:20] ==> val ltx: LedgerTransaction defined in net.corda.core.flows.FinalityFlow.resolveDependenciesOf.<anonymous>[LocalVariableDescriptor]

