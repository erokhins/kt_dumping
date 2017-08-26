'AbstractStateReplacementFlow.Instigator<RevisionedState<T>, RevisionedState<T>, T>' @ [18:42] ==> public constructor Instigator<out S : ContractState, out T : ContractState, out M>(originalState: StateAndRef<RevisionedState<T>>, modification: T, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[DeserializedClassConstructorDescriptor]
Inferred types:
    <out S : ContractState> -> RevisionedState<T>
    <out T : ContractState> -> RevisionedState<T>
    <out M> -> T

'curStateRef' @ [18:125] ==> value-parameter curStateRef: StateAndRef<RevisionedState<T>> defined in net.corda.vega.flows.StateRevisionFlow.Requester.<init>[ValueParameterDescriptorImpl]

'updatedData' @ [18:138] ==> value-parameter updatedData: T defined in net.corda.vega.flows.StateRevisionFlow.Requester.<init>[ValueParameterDescriptorImpl]

'originalState' @ [20:25] ==> public final val originalState: StateAndRef<RevisionedState<T>> defined in net.corda.vega.flows.StateRevisionFlow.Requester[DeserializedPropertyDescriptor]

'state' @ [20:39] ==> public final val state: TransactionState<RevisionedState<T>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [20:45] ==> public final val data: RevisionedState<T> defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'state' @ [21:22] ==> val state: RevisionedState<T> defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'generateRevision' @ [21:28] ==> public abstract fun generateRevision(notary: Party, oldState: StateAndRef<*>, updatedValue: T): TransactionBuilder defined in net.corda.vega.contracts.RevisionedState[SimpleFunctionDescriptorImpl]

'originalState' @ [21:45] ==> public final val originalState: StateAndRef<RevisionedState<T>> defined in net.corda.vega.flows.StateRevisionFlow.Requester[DeserializedPropertyDescriptor]

'state' @ [21:59] ==> public final val state: TransactionState<RevisionedState<T>> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'notary' @ [21:65] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'originalState' @ [21:73] ==> public final val originalState: StateAndRef<RevisionedState<T>> defined in net.corda.vega.flows.StateRevisionFlow.Requester[DeserializedPropertyDescriptor]

'modification' @ [21:88] ==> public final val modification: T defined in net.corda.vega.flows.StateRevisionFlow.Requester[DeserializedPropertyDescriptor]

'tx' @ [22:13] ==> val tx: TransactionBuilder defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'setTimeWindow' @ [22:16] ==> public final fun setTimeWindow(time: Instant, timeTolerance: Duration): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [22:30] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.StateRevisionFlow.Requester[DeserializedPropertyDescriptor]

'clock' @ [22:41] ==> public abstract val clock: Clock defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'instant' @ [22:47] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'seconds' @ [22:61] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'PrivacySalt' @ [23:31] ==> public constructor PrivacySalt() defined in net.corda.core.contracts.PrivacySalt[DeserializedClassConstructorDescriptor]

'tx' @ [24:13] ==> val tx: TransactionBuilder defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'setPrivacySalt' @ [24:16] ==> public final fun setPrivacySalt(privacySalt: PrivacySalt): TransactionBuilder defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'privacySalt' @ [24:31] ==> val privacySalt: PrivacySalt defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'serviceHub' @ [26:23] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.StateRevisionFlow.Requester[DeserializedPropertyDescriptor]

'signInitialTransaction' @ [26:34] ==> public open fun signInitialTransaction(builder: TransactionBuilder): SignedTransaction defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'tx' @ [26:57] ==> val tx: TransactionBuilder defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'state' @ [27:35] ==> val state: RevisionedState<T> defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'participants' @ [27:41] ==> public abstract val participants: List<AbstractParty> defined in net.corda.vega.contracts.RevisionedState[DeserializedPropertyDescriptor]

'map' @ [27:54] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [27:60] ==> value-parameter it: AbstractParty defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [27:63] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'serviceHub' @ [29:25] ==> public final val serviceHub: ServiceHub defined in net.corda.vega.flows.StateRevisionFlow.Requester[DeserializedPropertyDescriptor]

'keyManagementService' @ [29:36] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'filterMyKeys' @ [29:57] ==> public abstract fun filterMyKeys(candidateKeys: Iterable<PublicKey>): Iterable<PublicKey> defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'participantKeys' @ [29:70] ==> val participantKeys: List<PublicKey> defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'single' @ [29:87] ==> public fun <T> Iterable<PublicKey>.single(): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'UpgradeTx' @ [30:49] ==> public constructor UpgradeTx(stx: SignedTransaction, participants: Iterable<PublicKey>, myKey: PublicKey) defined in net.corda.core.flows.AbstractStateReplacementFlow.UpgradeTx[DeserializedClassConstructorDescriptor]

'stx' @ [30:59] ==> val stx: SignedTransaction defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'participantKeys' @ [30:64] ==> val participantKeys: List<PublicKey> defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'myKey' @ [30:81] ==> val myKey: PublicKey defined in net.corda.vega.flows.StateRevisionFlow.Requester.assembleTx[LocalVariableDescriptor]

'AbstractStateReplacementFlow.Acceptor<T>' @ [34:52] ==> public constructor Acceptor<in T>(otherSide: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[DeserializedClassConstructorDescriptor]
Inferred types:
    <in T> -> T

'otherParty' @ [34:93] ==> value-parameter otherParty: Party defined in net.corda.vega.flows.StateRevisionFlow.Receiver.<init>[ValueParameterDescriptorImpl]

'stx' @ [36:30] ==> value-parameter stx: SignedTransaction defined in net.corda.vega.flows.StateRevisionFlow.Receiver.verifyProposal[ValueParameterDescriptorImpl]

'tx' @ [36:34] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'proposal' @ [37:25] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<T> defined in net.corda.vega.flows.StateRevisionFlow.Receiver.verifyProposal[ValueParameterDescriptorImpl]

'stateRef' @ [37:34] ==> public final val stateRef: StateRef defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'state' @ [38:17] ==> val state: StateRef defined in net.corda.vega.flows.StateRevisionFlow.Receiver.verifyProposal[LocalVariableDescriptor]

'proposedTx' @ [38:27] ==> val proposedTx: WireTransaction defined in net.corda.vega.flows.StateRevisionFlow.Receiver.verifyProposal[LocalVariableDescriptor]

'inputs' @ [38:38] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'StateReplacementException' @ [39:23] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[DeserializedClassConstructorDescriptor]

'state' @ [39:70] ==> val state: StateRef defined in net.corda.vega.flows.StateRevisionFlow.Receiver.verifyProposal[LocalVariableDescriptor]

