'FlowLogic<Unit>' @ [19:57] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [20:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [22:19] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<SignedTransaction>): SignedTransaction defined in net.corda.node.services.NotifyTransactionHandler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> SignedTransaction

'ReceiveTransactionFlow' @ [22:27] ==> @JvmOverloads public constructor ReceiveTransactionFlow(otherParty: Party, checkSufficientSignatures: Boolean = ...) defined in net.corda.core.flows.ReceiveTransactionFlow[DeserializedClassConstructorDescriptor]

'otherParty' @ [22:50] ==> public final val otherParty: Party defined in net.corda.node.services.NotifyTransactionHandler[PropertyDescriptorImpl]

'serviceHub' @ [23:9] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.NotifyTransactionHandler[DeserializedPropertyDescriptor]

'recordTransactions' @ [23:20] ==> public open fun recordTransactions(first: SignedTransaction, vararg remaining: SignedTransaction): Unit defined in net.corda.core.node.ServiceHub[DeserializedSimpleFunctionDescriptor]

'stx' @ [23:39] ==> val stx: SignedTransaction defined in net.corda.node.services.NotifyTransactionHandler.call[LocalVariableDescriptor]

'AbstractStateReplacementFlow.Acceptor<Party>' @ [27:47] ==> public constructor Acceptor<in T>(otherSide: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[DeserializedClassConstructorDescriptor]
Inferred types:
    <in T> -> Party

'otherSide' @ [27:92] ==> value-parameter otherSide: Party defined in net.corda.node.services.NotaryChangeHandler.<init>[ValueParameterDescriptorImpl]

'proposal' @ [36:21] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<Party> defined in net.corda.node.services.NotaryChangeHandler.verifyProposal[ValueParameterDescriptorImpl]

'stateRef' @ [36:30] ==> public final val stateRef: StateRef defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'stx' @ [37:26] ==> value-parameter stx: SignedTransaction defined in net.corda.node.services.NotaryChangeHandler.verifyProposal[ValueParameterDescriptorImpl]

'resolveNotaryChangeTransaction' @ [37:30] ==> public final fun resolveNotaryChangeTransaction(services: ServiceHub): NotaryChangeLedgerTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [37:61] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.NotaryChangeHandler[DeserializedPropertyDescriptor]

'proposal' @ [38:25] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<Party> defined in net.corda.node.services.NotaryChangeHandler.verifyProposal[ValueParameterDescriptorImpl]

'modification' @ [38:34] ==> public final val modification: Party defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'state' @ [40:13] ==> val state: StateRef defined in net.corda.node.services.NotaryChangeHandler.verifyProposal[LocalVariableDescriptor]

'proposedTx' @ [40:23] ==> val proposedTx: NotaryChangeLedgerTransaction defined in net.corda.node.services.NotaryChangeHandler.verifyProposal[LocalVariableDescriptor]

'inputs' @ [40:34] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[DeserializedPropertyDescriptor]

'map' @ [40:41] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> StateRef

'it' @ [40:47] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.node.services.NotaryChangeHandler.verifyProposal.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [40:50] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'StateReplacementException' @ [41:19] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[DeserializedClassConstructorDescriptor]

'state' @ [41:66] ==> val state: StateRef defined in net.corda.node.services.NotaryChangeHandler.verifyProposal[LocalVariableDescriptor]

'serviceHub' @ [45:24] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.NotaryChangeHandler[DeserializedPropertyDescriptor]

'networkMapCache' @ [45:35] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'notaryNodes' @ [45:51] ==> public open val notaryNodes: List<NodeInfo> defined in net.corda.core.node.services.NetworkMapCache[DeserializedPropertyDescriptor]

'any' @ [45:63] ==> public inline fun <T> Iterable<NodeInfo>.any(predicate: (NodeInfo) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeInfo

'it' @ [45:69] ==> value-parameter it: NodeInfo defined in net.corda.node.services.NotaryChangeHandler.verifyProposal.<anonymous>[ValueParameterDescriptorImpl]

'notaryIdentity' @ [45:72] ==> public final val notaryIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'newNotary' @ [45:90] ==> val newNotary: Party defined in net.corda.node.services.NotaryChangeHandler.verifyProposal[LocalVariableDescriptor]

'!' @ [46:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNotary' @ [46:14] ==> val isNotary: Boolean defined in net.corda.node.services.NotaryChangeHandler.verifyProposal[LocalVariableDescriptor]

'StateReplacementException' @ [47:19] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[DeserializedClassConstructorDescriptor]

'newNotary' @ [47:65] ==> val newNotary: Party defined in net.corda.node.services.NotaryChangeHandler.verifyProposal[LocalVariableDescriptor]

'AbstractStateReplacementFlow.Acceptor<Class<out UpgradedContract<ContractState, *>>>' @ [52:50] ==> public constructor Acceptor<in T>(otherSide: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.AbstractStateReplacementFlow.Acceptor[DeserializedClassConstructorDescriptor]
Inferred types:
    <in T> -> Class<out UpgradedContract<ContractState, *>>

'otherSide' @ [52:135] ==> value-parameter otherSide: Party defined in net.corda.node.services.ContractUpgradeHandler.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [53:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [54:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StateReplacementException' @ [54:13] ==> @JvmOverloads public constructor StateReplacementException(message: String? = ..., cause: Throwable? = ...) defined in net.corda.core.flows.StateReplacementException[DeserializedClassConstructorDescriptor]

'serviceHub' @ [58:22] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.ContractUpgradeHandler[DeserializedPropertyDescriptor]

'validatedTransactions' @ [58:33] ==> public abstract val validatedTransactions: TransactionStorage defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getTransaction' @ [58:55] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.core.node.services.TransactionStorage[DeserializedSimpleFunctionDescriptor]

'proposal' @ [58:70] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<Class<out UpgradedContract<ContractState, *>>> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[ValueParameterDescriptorImpl]

'stateRef' @ [58:79] ==> public final val stateRef: StateRef defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'txhash' @ [58:88] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'requireNotNull' @ [59:9] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: SignedTransaction?, lazyMessage: () -> Any): SignedTransaction defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'ourSTX' @ [59:24] ==> val ourSTX: SignedTransaction? defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'ourSTX' @ [60:30] ==> val ourSTX: SignedTransaction? defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'tx' @ [60:39] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [60:42] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'proposal' @ [60:64] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<Class<out UpgradedContract<ContractState, *>>> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[ValueParameterDescriptorImpl]

'stateRef' @ [60:73] ==> public final val stateRef: StateRef defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'index' @ [60:82] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'serviceHub' @ [61:33] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.ContractUpgradeHandler[DeserializedPropertyDescriptor]

'vaultService' @ [61:44] ==> public abstract val vaultService: VaultService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'getAuthorisedContractUpgrade' @ [61:57] ==> public abstract fun getAuthorisedContractUpgrade(ref: StateRef): Class<out UpgradedContract<*, *>>? defined in net.corda.core.node.services.VaultService[DeserializedSimpleFunctionDescriptor]

'oldStateAndRef' @ [61:86] ==> val oldStateAndRef: StateAndRef<ContractState> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'ref' @ [61:101] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'IllegalStateException' @ [62:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'oldStateAndRef' @ [62:101] ==> val oldStateAndRef: StateAndRef<ContractState> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'ref' @ [62:116] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'stx' @ [63:26] ==> value-parameter stx: SignedTransaction defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[ValueParameterDescriptorImpl]

'tx' @ [63:30] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'ContractUpgradeFlow' @ [64:26] ==> public companion object defined in net.corda.core.flows.ContractUpgradeFlow[FakeCallableDescriptorForObject]

'assembleBareTx' @ [64:46] ==> public final fun <OldState : ContractState, NewState : ContractState> assembleBareTx(stateRef: StateAndRef<ContractState>, upgradedContractClass: Class<out UpgradedContract<ContractState, ContractState>>, privacySalt: PrivacySalt): TransactionBuilder defined in net.corda.core.flows.ContractUpgradeFlow.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <OldState : ContractState> -> ContractState
    <NewState : ContractState> -> ContractState

'oldStateAndRef' @ [64:61] ==> val oldStateAndRef: StateAndRef<ContractState> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'proposal' @ [64:77] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<Class<out UpgradedContract<ContractState, *>>> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[ValueParameterDescriptorImpl]

'modification' @ [64:86] ==> public final val modification: Class<out UpgradedContract<ContractState, *>> defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'proposedTx' @ [64:100] ==> val proposedTx: WireTransaction defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'privacySalt' @ [64:111] ==> public open val privacySalt: PrivacySalt defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'toWireTransaction' @ [64:124] ==> public final fun toWireTransaction(): WireTransaction defined in net.corda.core.transactions.TransactionBuilder[DeserializedSimpleFunctionDescriptor]

'requireThat' @ [65:9] ==> public inline fun <R> requireThat(body: Requirements.() -> Unit): Unit defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'using' @ [66:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'otherSide' @ [66:64] ==> public final val otherSide: Party defined in net.corda.node.services.ContractUpgradeHandler[DeserializedPropertyDescriptor]

'oldStateAndRef' @ [66:77] ==> val oldStateAndRef: StateAndRef<ContractState> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'state' @ [66:92] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [66:98] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'participants' @ [66:103] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'using' @ [67:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'proposal' @ [67:37] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<Class<out UpgradedContract<ContractState, *>>> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[ValueParameterDescriptorImpl]

'modification' @ [67:46] ==> public final val modification: Class<out UpgradedContract<ContractState, *>> defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'javaClass' @ [67:59] ==> public val <T : Any> Class<out UpgradedContract<ContractState, *>>.javaClass: Class<Class<out UpgradedContract<ContractState, *>>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Class<out UpgradedContract<ContractState, *>>

'proposal' @ [67:104] ==> value-parameter proposal: AbstractStateReplacementFlow.Proposal<Class<out UpgradedContract<ContractState, *>>> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[ValueParameterDescriptorImpl]

'modification' @ [67:113] ==> public final val modification: Class<out UpgradedContract<ContractState, *>> defined in net.corda.core.flows.AbstractStateReplacementFlow.Proposal[DeserializedPropertyDescriptor]

'authorisedUpgrade' @ [67:129] ==> val authorisedUpgrade: Class<out UpgradedContract<*, *>> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'using' @ [68:13] ==> public final infix inline fun String.using(expr: Boolean): Unit defined in net.corda.core.contracts.Requirements[DeserializedSimpleFunctionDescriptor]

'proposedTx' @ [68:79] ==> val proposedTx: WireTransaction defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'expectedTx' @ [68:93] ==> val expectedTx: WireTransaction defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'ContractUpgradeFlow' @ [70:9] ==> public companion object defined in net.corda.core.flows.ContractUpgradeFlow[FakeCallableDescriptorForObject]

'verify' @ [70:29] ==> @JvmStatic public final fun verify(input: ContractState, output: ContractState, commandData: Command<UpgradeCommand>): Unit defined in net.corda.core.flows.ContractUpgradeFlow.Companion[DeserializedSimpleFunctionDescriptor]

'oldStateAndRef' @ [71:17] ==> val oldStateAndRef: StateAndRef<ContractState> defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'state' @ [71:32] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [71:38] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'expectedTx' @ [72:17] ==> val expectedTx: WireTransaction defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'outRef' @ [72:28] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'state' @ [72:53] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [72:59] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'expectedTx' @ [73:17] ==> val expectedTx: WireTransaction defined in net.corda.node.services.ContractUpgradeHandler.verifyProposal[LocalVariableDescriptor]

'toLedgerTransaction' @ [73:28] ==> public final fun toLedgerTransaction(services: ServicesForResolution): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [73:48] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.ContractUpgradeHandler[DeserializedPropertyDescriptor]

'commandsOfType' @ [73:60] ==> public final inline fun <reified T : CommandData> commandsOfType(): List<Command<UpgradeCommand>> defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : CommandData> -> UpgradeCommand

'single' @ [73:93] ==> public fun <T> List<Command<UpgradeCommand>>.single(): Command<UpgradeCommand> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<UpgradeCommand>

'FlowLogic<Unit>' @ [77:85] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'this' @ [78:37] ==> public constructor TransactionKeyHandler(otherSide: Party, revocationEnabled: Boolean) defined in net.corda.node.services.TransactionKeyHandler[ClassConstructorDescriptorImpl]

'otherSide' @ [78:42] ==> value-parameter otherSide: Party defined in net.corda.node.services.TransactionKeyHandler.<init>[ValueParameterDescriptorImpl]

'ProgressTracker.Step' @ [80:30] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedClassConstructorDescriptor]

'ProgressTracker' @ [83:53] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[DeserializedClassConstructorDescriptor]

'SENDING_KEY' @ [83:69] ==> public object SENDING_KEY : ProgressTracker.Step defined in net.corda.node.services.TransactionKeyHandler.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [85:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [88:9] ==> public open val progressTracker: ProgressTracker defined in net.corda.node.services.TransactionKeyHandler[PropertyDescriptorImpl]

'currentStep' @ [88:25] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'SENDING_KEY' @ [88:39] ==> public object SENDING_KEY : ProgressTracker.Step defined in net.corda.node.services.TransactionKeyHandler.Companion[FakeCallableDescriptorForObject]

'serviceHub' @ [89:38] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.TransactionKeyHandler[DeserializedPropertyDescriptor]

'keyManagementService' @ [89:49] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'freshKeyAndCert' @ [89:70] ==> @Suspendable public abstract fun freshKeyAndCert(identity: PartyAndCertificate, revocationEnabled: Boolean): PartyAndCertificate defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [89:86] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.TransactionKeyHandler[DeserializedPropertyDescriptor]

'myInfo' @ [89:97] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'legalIdentityAndCert' @ [89:104] ==> public final val legalIdentityAndCert: PartyAndCertificate defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'revocationEnabled' @ [89:126] ==> val revocationEnabled: Boolean defined in net.corda.node.services.TransactionKeyHandler.call[LocalVariableDescriptor]

'sendAndReceive' @ [90:9] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<PartyAndCertificate> defined in net.corda.node.services.TransactionKeyHandler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> PartyAndCertificate

'otherSide' @ [90:45] ==> public final val otherSide: Party defined in net.corda.node.services.TransactionKeyHandler[PropertyDescriptorImpl]

'legalIdentityAnonymous' @ [90:56] ==> val legalIdentityAnonymous: PartyAndCertificate defined in net.corda.node.services.TransactionKeyHandler.call[LocalVariableDescriptor]

'unwrap' @ [90:80] ==> public inline fun <T, R> UntrustworthyData<PartyAndCertificate>.unwrap(validator: (PartyAndCertificate) -> PartyAndCertificate): PartyAndCertificate defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate
    <R> -> PartyAndCertificate

'TransactionKeyFlow' @ [91:13] ==> public companion object defined in net.corda.core.flows.TransactionKeyFlow[FakeCallableDescriptorForObject]

'validateAndRegisterIdentity' @ [91:32] ==> public final fun validateAndRegisterIdentity(identityService: IdentityService, otherSide: Party, anonymousOtherSide: PartyAndCertificate): PartyAndCertificate defined in net.corda.core.flows.TransactionKeyFlow.Companion[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [91:60] ==> public final val serviceHub: ServiceHub defined in net.corda.node.services.TransactionKeyHandler[DeserializedPropertyDescriptor]

'identityService' @ [91:71] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'otherSide' @ [91:88] ==> public final val otherSide: Party defined in net.corda.node.services.TransactionKeyHandler[PropertyDescriptorImpl]

'confidentialIdentity' @ [91:99] ==> value-parameter confidentialIdentity: PartyAndCertificate defined in net.corda.node.services.TransactionKeyHandler.call.<anonymous>[ValueParameterDescriptorImpl]

