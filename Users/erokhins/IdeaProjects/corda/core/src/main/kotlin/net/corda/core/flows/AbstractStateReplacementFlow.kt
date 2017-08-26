'CordaSerializable' @ [29:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'Instigator' @ [54:61] ==> public companion object defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[FakeCallableDescriptorForObject]

'tracker' @ [54:72] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.Companion[SimpleFunctionDescriptorImpl]

'FlowLogic<StateAndRef<T>>' @ [54:85] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> StateAndRef<T>

'ProgressTracker.Step' @ [56:30] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker.Step' @ [57:29] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker' @ [59:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[ClassConstructorDescriptorImpl]

'SIGNING' @ [59:45] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.Companion[FakeCallableDescriptorForObject]

'NOTARY' @ [59:54] ==> public object NOTARY : ProgressTracker.Step defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [62:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [63:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StateReplacementException' @ [63:17] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[ClassConstructorDescriptorImpl]

'component1' @ [65:18] ==> public final operator fun component1(): SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.UpgradeTx[SimpleFunctionDescriptorImpl]

'component2' @ [65:23] ==> public final operator fun component2(): Iterable<PublicKey> defined in net.corda.core.flows.AbstractStateReplacementFlow.UpgradeTx[SimpleFunctionDescriptorImpl]

'component3' @ [65:40] ==> public final operator fun component3(): PublicKey defined in net.corda.core.flows.AbstractStateReplacementFlow.UpgradeTx[SimpleFunctionDescriptorImpl]

'assembleTx' @ [65:49] ==> protected abstract fun assembleTx(): AbstractStateReplacementFlow.UpgradeTx defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[SimpleFunctionDescriptorImpl]

'progressTracker' @ [67:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[PropertyDescriptorImpl]

'currentStep' @ [67:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'SIGNING' @ [67:43] ==> public object SIGNING : ProgressTracker.Step defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.Companion[FakeCallableDescriptorForObject]

'if (participantKeys.singleOrNull() == myKey) {
                getNotarySignatures(stx)
            } else {
                collectSignatures(participantKeys - myKey, stx)
            }' @ [69:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TransactionSignature>, elseBranch: List<TransactionSignature>): List<TransactionSignature>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TransactionSignature>

'participantKeys' @ [69:34] ==> val participantKeys: Iterable<PublicKey> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'singleOrNull' @ [69:50] ==> public fun <T> Iterable<PublicKey>.singleOrNull(): PublicKey? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'myKey' @ [69:68] ==> val myKey: PublicKey defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'getNotarySignatures' @ [70:17] ==> @Suspendable private final fun getNotarySignatures(stx: SignedTransaction): List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[SimpleFunctionDescriptorImpl]

'stx' @ [70:37] ==> val stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'collectSignatures' @ [72:17] ==> @Suspendable private final fun collectSignatures(participants: Iterable<PublicKey>, stx: SignedTransaction): List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[SimpleFunctionDescriptorImpl]

'participantKeys' @ [72:35] ==> val participantKeys: Iterable<PublicKey> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'myKey' @ [72:53] ==> val myKey: PublicKey defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'stx' @ [72:60] ==> val stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'stx' @ [75:27] ==> val stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'signatures' @ [75:33] ==> val signatures: List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'serviceHub' @ [76:13] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[PropertyDescriptorImpl]

'recordTransactions' @ [76:24] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'finalTx' @ [76:43] ==> val finalTx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'run' @ [78:29] ==> @InlineOnly public inline fun <T, R> AbstractStateReplacementFlow.Instigator<S, T, M>.run(block: AbstractStateReplacementFlow.Instigator<S, T, M>.() -> StateAndRef<T>): StateAndRef<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instigator<S, T, M>
    <R> -> StateAndRef<T>

'if (stx.isNotaryChangeTransaction()) {
                    stx.resolveNotaryChangeTransaction(serviceHub).outRef<T>(0)
                } else {
                    stx.tx.outRef<T>(0)
                }' @ [79:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StateAndRef<T>, elseBranch: StateAndRef<T>): StateAndRef<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StateAndRef<T>

'stx' @ [79:21] ==> val stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'isNotaryChangeTransaction' @ [79:25] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'stx' @ [80:21] ==> val stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'resolveNotaryChangeTransaction' @ [80:25] ==> public final fun resolveNotaryChangeTransaction(services: ServiceHub): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'serviceHub' @ [80:56] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[PropertyDescriptorImpl]

'outRef' @ [80:68] ==> @Suppress public final fun <T : ContractState> outRef(index: Int): StateAndRef<T> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'stx' @ [82:21] ==> val stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'tx' @ [82:25] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'outRef' @ [82:28] ==> @Suppress public final fun <T : ContractState> outRef(index: Int): StateAndRef<T> defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'newOutput' @ [86:20] ==> val newOutput: StateAndRef<T> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.call[LocalVariableDescriptor]

'Suspendable' @ [97:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'participants' @ [99:27] ==> value-parameter participants: Iterable<PublicKey> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[ValueParameterDescriptorImpl]

'map' @ [99:40] ==> public inline fun <T, R> Iterable<PublicKey>.map(transform: (PublicKey) -> Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey
    <R> -> Party

'serviceHub' @ [100:39] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[PropertyDescriptorImpl]

'networkMapCache' @ [100:50] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'getNodeByLegalIdentityKey' @ [100:66] ==> public abstract fun getNodeByLegalIdentityKey(identityKey: PublicKey): NodeInfo? defined in net.corda.core.node.services.NetworkMapCache[SimpleFunctionDescriptorImpl]

'it' @ [100:92] ==> value-parameter it: PublicKey defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures.<anonymous>[ValueParameterDescriptorImpl]

'IllegalStateException' @ [101:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'it' @ [101:67] ==> value-parameter it: PublicKey defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures.<anonymous>[ValueParameterDescriptorImpl]

'originalState' @ [101:80] ==> public final val originalState: StateAndRef<S> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[PropertyDescriptorImpl]

'participantNode' @ [102:17] ==> val participantNode: NodeInfo defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures.<anonymous>[LocalVariableDescriptor]

'legalIdentity' @ [102:33] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'parties' @ [105:41] ==> val parties: List<Party> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[LocalVariableDescriptor]

'map' @ [105:49] ==> public inline fun <T, R> Iterable<Party>.map(transform: (Party) -> TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> TransactionSignature

'getParticipantSignature' @ [105:55] ==> @Suspendable private final fun getParticipantSignature(party: Party, stx: SignedTransaction): TransactionSignature defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[SimpleFunctionDescriptorImpl]

'it' @ [105:79] ==> value-parameter it: Party defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures.<anonymous>[ValueParameterDescriptorImpl]

'stx' @ [105:83] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[ValueParameterDescriptorImpl]

'stx' @ [107:36] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[ValueParameterDescriptorImpl]

'participantSignatures' @ [107:42] ==> val participantSignatures: List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[LocalVariableDescriptor]

'participantSignatures' @ [109:33] ==> val participantSignatures: List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[LocalVariableDescriptor]

'getNotarySignatures' @ [109:57] ==> @Suspendable private final fun getNotarySignatures(stx: SignedTransaction): List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[SimpleFunctionDescriptorImpl]

'allPartySignedTx' @ [109:77] ==> val allPartySignedTx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[LocalVariableDescriptor]

'parties' @ [110:13] ==> val parties: List<Party> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[LocalVariableDescriptor]

'forEach' @ [110:21] ==> @HidesMembers public inline fun <T> Iterable<Party>.forEach(action: (Party) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'send' @ [110:31] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[SimpleFunctionDescriptorImpl]

'it' @ [110:36] ==> value-parameter it: Party defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures.<anonymous>[ValueParameterDescriptorImpl]

'allSignatures' @ [110:40] ==> val allSignatures: List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[LocalVariableDescriptor]

'allSignatures' @ [112:20] ==> val allSignatures: List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.collectSignatures[LocalVariableDescriptor]

'Suspendable' @ [115:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Proposal' @ [117:28] ==> public constructor Proposal<out M>(stateRef: StateRef, modification: M) defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[ClassConstructorDescriptorImpl]
Inferred types:
    <out M> -> M

'originalState' @ [117:37] ==> public final val originalState: StateAndRef<S> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[PropertyDescriptorImpl]

'ref' @ [117:51] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'modification' @ [117:56] ==> public final val modification: M defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[PropertyDescriptorImpl]

'subFlow' @ [118:13] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Void?

'SendTransactionFlow' @ [118:21] ==> public constructor SendTransactionFlow(otherSide: Party, stx: SignedTransaction) defined in net.corda.core.flows.SendTransactionFlow[ClassConstructorDescriptorImpl]

'party' @ [118:41] ==> value-parameter party: Party defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getParticipantSignature[ValueParameterDescriptorImpl]

'stx' @ [118:48] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getParticipantSignature[ValueParameterDescriptorImpl]

'sendAndReceive' @ [119:20] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> TransactionSignature

'party' @ [119:57] ==> value-parameter party: Party defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getParticipantSignature[ValueParameterDescriptorImpl]

'proposal' @ [119:64] ==> val proposal: AbstractStateReplacementFlow.Proposal<M> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getParticipantSignature[LocalVariableDescriptor]

'unwrap' @ [119:74] ==> @Suppress public inline fun <T, R> UntrustworthyData<TransactionSignature>.unwrap(validator: (TransactionSignature) -> TransactionSignature): TransactionSignature defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TransactionSignature
    <R> -> TransactionSignature

'check' @ [120:17] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'party' @ [120:23] ==> value-parameter party: Party defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getParticipantSignature[ValueParameterDescriptorImpl]

'owningKey' @ [120:29] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'isFulfilledBy' @ [120:39] ==> public fun PublicKey.isFulfilledBy(otherKey: PublicKey): Boolean defined in net.corda.core.crypto in file CryptoUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [120:53] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getParticipantSignature.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [120:56] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'it' @ [121:17] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getParticipantSignature.<anonymous>[ValueParameterDescriptorImpl]

'verify' @ [121:20] ==> @Throws public final fun verify(txId: SecureHash): Boolean defined in net.corda.core.crypto.TransactionSignature[SimpleFunctionDescriptorImpl]

'stx' @ [121:27] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getParticipantSignature[ValueParameterDescriptorImpl]

'id' @ [121:31] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'it' @ [122:17] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getParticipantSignature.<anonymous>[ValueParameterDescriptorImpl]

'Suspendable' @ [126:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [128:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[PropertyDescriptorImpl]

'currentStep' @ [128:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'NOTARY' @ [128:43] ==> public object NOTARY : ProgressTracker.Step defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [130:24] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<List<TransactionSignature>>): List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> List<TransactionSignature>

'Client' @ [130:43] ==> public constructor Client(stx: SignedTransaction) defined in net.corda.core.flows.NotaryFlow.Client[ClassConstructorDescriptorImpl]

'stx' @ [130:50] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getNotarySignatures[ValueParameterDescriptorImpl]

'StateReplacementException' @ [132:23] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[ClassConstructorDescriptorImpl]

'e' @ [132:84] ==> val e: NotaryException defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.getNotarySignatures[LocalVariableDescriptor]

'Acceptor' @ [140:83] ==> public companion object defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[FakeCallableDescriptorForObject]

'tracker' @ [140:92] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.Companion[SimpleFunctionDescriptorImpl]

'FlowLogic<Void?>' @ [140:105] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Void?

'ProgressTracker.Step' @ [142:32] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker.Step' @ [143:32] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker' @ [145:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[ClassConstructorDescriptorImpl]

'VERIFYING' @ [145:45] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.Companion[FakeCallableDescriptorForObject]

'APPROVING' @ [145:56] ==> public object APPROVING : ProgressTracker.Step defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [148:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [149:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StateReplacementException' @ [149:17] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[ClassConstructorDescriptorImpl]

'progressTracker' @ [151:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'currentStep' @ [151:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'VERIFYING' @ [151:43] ==> public object VERIFYING : ProgressTracker.Step defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.Companion[FakeCallableDescriptorForObject]

'subFlow' @ [153:23] ==> @Suspendable @Throws public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> SignedTransaction

'ReceiveTransactionFlow' @ [153:31] ==> @JvmOverloads public constructor ReceiveTransactionFlow(otherParty: Party, checkSufficientSignatures: Boolean = ...) defined in net.corda.core.flows.ReceiveTransactionFlow[ClassConstructorDescriptorImpl]

'otherSide' @ [153:54] ==> public final val otherSide: Party defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'checkMySignatureRequired' @ [154:13] ==> private final fun checkMySignatureRequired(stx: SignedTransaction): Unit defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[SimpleFunctionDescriptorImpl]

'stx' @ [154:38] ==> val stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.call[LocalVariableDescriptor]

'receive' @ [155:65] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<AbstractStateReplacementFlow.Proposal<T>> defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> Proposal<T>

'otherSide' @ [155:73] ==> public final val otherSide: Party defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'maybeProposal' @ [156:13] ==> val maybeProposal: UntrustworthyData<AbstractStateReplacementFlow.Proposal<T>> defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.call[LocalVariableDescriptor]

'unwrap' @ [156:27] ==> @Suppress public inline fun <T, R> UntrustworthyData<AbstractStateReplacementFlow.Proposal<T>>.unwrap(validator: (AbstractStateReplacementFlow.Proposal<T>) -> Unit): Unit defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Proposal<T>
    <R> -> Unit

'verifyProposal' @ [157:17] ==> @Throws protected abstract fun verifyProposal(stx: SignedTransaction, proposal: AbstractStateReplacementFlow.Proposal<T>): Unit defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[SimpleFunctionDescriptorImpl]

'stx' @ [157:32] ==> val stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.call[LocalVariableDescriptor]

'it' @ [157:37] ==> value-parameter it: AbstractStateReplacementFlow.Proposal<T> defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.call.<anonymous>[ValueParameterDescriptorImpl]

'approve' @ [159:13] ==> @Suspendable private final fun approve(stx: SignedTransaction): Unit defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[SimpleFunctionDescriptorImpl]

'stx' @ [159:21] ==> val stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.call[LocalVariableDescriptor]

'Suspendable' @ [163:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [165:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'currentStep' @ [165:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'APPROVING' @ [165:43] ==> public object APPROVING : ProgressTracker.Step defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.Companion[FakeCallableDescriptorForObject]

'sign' @ [167:31] ==> private final fun sign(stx: SignedTransaction): TransactionSignature defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[SimpleFunctionDescriptorImpl]

'stx' @ [167:36] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[ValueParameterDescriptorImpl]

'sendAndReceive' @ [168:34] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<List<TransactionSignature>> defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> List<TransactionSignature>

'otherSide' @ [168:77] ==> public final val otherSide: Party defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'mySignature' @ [168:88] ==> val mySignature: TransactionSignature defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[LocalVariableDescriptor]

'swapSignatures' @ [171:33] ==> val swapSignatures: UntrustworthyData<List<TransactionSignature>> defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[LocalVariableDescriptor]

'unwrap' @ [171:48] ==> @Suppress public inline fun <T, R> UntrustworthyData<List<TransactionSignature>>.unwrap(validator: (List<TransactionSignature>) -> List<TransactionSignature>): List<TransactionSignature> defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<TransactionSignature>
    <R> -> List<TransactionSignature>

'signatures' @ [172:17] ==> value-parameter signatures: List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [172:28] ==> @HidesMembers public inline fun <T> Iterable<TransactionSignature>.forEach(action: (TransactionSignature) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'it' @ [172:38] ==> value-parameter it: TransactionSignature defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'verify' @ [172:41] ==> @Throws public final fun verify(txId: SecureHash): Boolean defined in net.corda.core.crypto.TransactionSignature[SimpleFunctionDescriptorImpl]

'stx' @ [172:48] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[ValueParameterDescriptorImpl]

'id' @ [172:52] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'signatures' @ [173:17] ==> value-parameter signatures: List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve.<anonymous>[ValueParameterDescriptorImpl]

'stx' @ [176:27] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[ValueParameterDescriptorImpl]

'allSignatures' @ [176:33] ==> val allSignatures: List<TransactionSignature> defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[LocalVariableDescriptor]

'if (finalTx.isNotaryChangeTransaction()) {
                finalTx.resolveNotaryChangeTransaction(serviceHub).verifyRequiredSignatures()
            } else {
                finalTx.verifyRequiredSignatures()
            }' @ [177:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'finalTx' @ [177:17] ==> val finalTx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[LocalVariableDescriptor]

'isNotaryChangeTransaction' @ [177:25] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'finalTx' @ [178:17] ==> val finalTx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[LocalVariableDescriptor]

'resolveNotaryChangeTransaction' @ [178:25] ==> public final fun resolveNotaryChangeTransaction(services: ServiceHub): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'serviceHub' @ [178:56] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'verifyRequiredSignatures' @ [178:68] ==> @Throws public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[SimpleFunctionDescriptorImpl]

'finalTx' @ [180:17] ==> val finalTx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[LocalVariableDescriptor]

'verifyRequiredSignatures' @ [180:25] ==> @Throws public open fun verifyRequiredSignatures(): Unit defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'serviceHub' @ [182:13] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'recordTransactions' @ [182:24] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'finalTx' @ [182:43] ==> val finalTx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.approve[LocalVariableDescriptor]

'Throws' @ [190:9] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StateReplacementException' @ [190:17] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[ClassConstructorDescriptorImpl]

'serviceHub' @ [195:25] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'myInfo' @ [195:36] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'legalIdentity' @ [195:43] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'owningKey' @ [195:57] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'if (stx.isNotaryChangeTransaction()) {
                stx.resolveNotaryChangeTransaction(serviceHub).requiredSigningKeys
            } else {
                stx.tx.requiredSigningKeys
            }' @ [197:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<PublicKey>, elseBranch: Set<PublicKey>): Set<PublicKey>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<PublicKey>

'stx' @ [197:36] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.checkMySignatureRequired[ValueParameterDescriptorImpl]

'isNotaryChangeTransaction' @ [197:40] ==> public final fun isNotaryChangeTransaction(): Boolean defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'stx' @ [198:17] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.checkMySignatureRequired[ValueParameterDescriptorImpl]

'resolveNotaryChangeTransaction' @ [198:21] ==> public final fun resolveNotaryChangeTransaction(services: ServiceHub): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.SignedTransaction[SimpleFunctionDescriptorImpl]

'serviceHub' @ [198:52] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'requiredSigningKeys' @ [198:64] ==> public open val requiredSigningKeys: Set<PublicKey> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'stx' @ [200:17] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.checkMySignatureRequired[ValueParameterDescriptorImpl]

'tx' @ [200:21] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'requiredSigningKeys' @ [200:24] ==> public final val requiredSigningKeys: Set<PublicKey> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'require' @ [203:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'myKey' @ [203:21] ==> val myKey: PublicKey defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.checkMySignatureRequired[LocalVariableDescriptor]

'requiredKeys' @ [203:30] ==> val requiredKeys: Set<PublicKey> defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.checkMySignatureRequired[LocalVariableDescriptor]

'stx' @ [203:119] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.checkMySignatureRequired[ValueParameterDescriptorImpl]

'id' @ [203:123] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'serviceHub' @ [207:20] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[PropertyDescriptorImpl]

'createSignature' @ [207:31] ==> public open fun createSignature(signedTransaction: SignedTransaction): TransactionSignature defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'stx' @ [207:47] ==> value-parameter stx: SignedTransaction defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor.sign[ValueParameterDescriptorImpl]

'JvmOverloads' @ [212:38] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'FlowException' @ [213:7] ==> public constructor FlowException(message: String?, cause: Throwable?) defined in net.corda.core.flows.FlowException[ClassConstructorDescriptorImpl]

'message' @ [213:21] ==> value-parameter message: String? = ... defined in net.corda.core.flows.StateReplacementException.<init>[ValueParameterDescriptorImpl]

'cause' @ [213:30] ==> value-parameter cause: Throwable? = ... defined in net.corda.core.flows.StateReplacementException.<init>[ValueParameterDescriptorImpl]

