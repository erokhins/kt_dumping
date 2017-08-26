'FlowLogic<Unit>' @ [26:65] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Unit

'this' @ [27:62] ==> public constructor Send(otherSides: Set<Party>, tx: WireTransaction, progressTracker: ProgressTracker) defined in net.corda.core.flows.IdentitySyncFlow.Send[ClassConstructorDescriptorImpl]

'setOf' @ [27:67] ==> public fun <T> setOf(element: Party): Set<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'otherSide' @ [27:73] ==> value-parameter otherSide: Party defined in net.corda.core.flows.IdentitySyncFlow.Send.<init>[ValueParameterDescriptorImpl]

'tx' @ [27:85] ==> value-parameter tx: WireTransaction defined in net.corda.core.flows.IdentitySyncFlow.Send.<init>[ValueParameterDescriptorImpl]

'tracker' @ [27:89] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.IdentitySyncFlow.Send.Companion[SimpleFunctionDescriptorImpl]

'ProgressTracker.Step' @ [30:41] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker' @ [32:29] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[ClassConstructorDescriptorImpl]

'SYNCING_IDENTITIES' @ [32:45] ==> public object SYNCING_IDENTITIES : ProgressTracker.Step defined in net.corda.core.flows.IdentitySyncFlow.Send.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [35:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [37:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.IdentitySyncFlow.Send[PropertyDescriptorImpl]

'currentStep' @ [37:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'SYNCING_IDENTITIES' @ [37:43] ==> public object SYNCING_IDENTITIES : ProgressTracker.Step defined in net.corda.core.flows.IdentitySyncFlow.Send.Companion[FakeCallableDescriptorForObject]

'tx' @ [38:48] ==> public final val tx: WireTransaction defined in net.corda.core.flows.IdentitySyncFlow.Send[PropertyDescriptorImpl]

'inputs' @ [38:51] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'map' @ [38:58] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> TransactionState<ContractState>): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> TransactionState<ContractState>

'serviceHub' @ [38:64] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.IdentitySyncFlow.Send[PropertyDescriptorImpl]

'loadState' @ [38:75] ==> @Throws public open fun loadState(stateRef: StateRef): TransactionState<*> defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'it' @ [38:85] ==> value-parameter it: StateRef defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'requireNoNulls' @ [38:91] ==> public fun <T : Any> List<TransactionState<ContractState>?>.requireNoNulls(): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TransactionState<ContractState>

'map' @ [38:108] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> ContractState): List<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> ContractState

'it' @ [38:114] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [38:117] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'tx' @ [38:126] ==> public final val tx: WireTransaction defined in net.corda.core.flows.IdentitySyncFlow.Send[PropertyDescriptorImpl]

'outputs' @ [38:129] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'map' @ [38:137] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> ContractState): List<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> ContractState

'it' @ [38:143] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [38:146] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'states' @ [39:50] ==> val states: List<ContractState> defined in net.corda.core.flows.IdentitySyncFlow.Send.call[LocalVariableDescriptor]

'flatMap' @ [39:57] ==> public inline fun <T, R> Iterable<ContractState>.flatMap(transform: (ContractState) -> Iterable<AbstractParty>): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ContractState
    <R> -> AbstractParty

'it' @ [39:67] ==> value-parameter it: ContractState defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'participants' @ [39:70] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'toSet' @ [39:85] ==> public fun <T> Iterable<AbstractParty>.toSet(): Set<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'identities' @ [41:42] ==> val identities: Set<AbstractParty> defined in net.corda.core.flows.IdentitySyncFlow.Send.call[LocalVariableDescriptor]

'filter' @ [42:22] ==> public inline fun <T> Iterable<AbstractParty>.filter(predicate: (AbstractParty) -> Boolean): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'serviceHub' @ [42:31] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.IdentitySyncFlow.Send[PropertyDescriptorImpl]

'networkMapCache' @ [42:42] ==> public abstract val networkMapCache: NetworkMapCache defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'getNodeByLegalIdentityKey' @ [42:58] ==> public abstract fun getNodeByLegalIdentityKey(identityKey: PublicKey): NodeInfo? defined in net.corda.core.node.services.NetworkMapCache[SimpleFunctionDescriptorImpl]

'it' @ [42:84] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [42:87] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[PropertyDescriptorImpl]

'toList' @ [43:22] ==> public fun <T> Iterable<AbstractParty>.toList(): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'identities' @ [44:82] ==> val identities: Set<AbstractParty> defined in net.corda.core.flows.IdentitySyncFlow.Send.call[LocalVariableDescriptor]

'map' @ [45:22] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> Pair<AbstractParty, PartyAndCertificate?>): List<Pair<AbstractParty, PartyAndCertificate?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> Pair<AbstractParty, PartyAndCertificate?>

'Pair' @ [45:28] ==> public constructor Pair<out A, out B>(first: AbstractParty, second: PartyAndCertificate?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> AbstractParty
    <out B> -> PartyAndCertificate?

'it' @ [45:33] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [45:37] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.IdentitySyncFlow.Send[PropertyDescriptorImpl]

'identityService' @ [45:48] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'certificateFromKey' @ [45:64] ==> public abstract fun certificateFromKey(owningKey: PublicKey): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'it' @ [45:83] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [45:86] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[PropertyDescriptorImpl]

'toMap' @ [45:100] ==> public fun <K, V> Iterable<Pair<AbstractParty, PartyAndCertificate?>>.toMap(): Map<AbstractParty, PartyAndCertificate?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AbstractParty
    <V> -> PartyAndCertificate?

'otherSides' @ [47:13] ==> public final val otherSides: Set<Party> defined in net.corda.core.flows.IdentitySyncFlow.Send[PropertyDescriptorImpl]

'forEach' @ [47:24] ==> @HidesMembers public inline fun <T> Iterable<Party>.forEach(action: (Party) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'sendAndReceive' @ [48:64] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<List<AbstractParty>> defined in net.corda.core.flows.IdentitySyncFlow.Send[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> List<AbstractParty>

'otherSide' @ [48:100] ==> value-parameter otherSide: Party defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'confidentialIdentities' @ [48:111] ==> val confidentialIdentities: List<AbstractParty> defined in net.corda.core.flows.IdentitySyncFlow.Send.call[LocalVariableDescriptor]

'unwrap' @ [48:135] ==> @Suppress public inline fun <T, R> UntrustworthyData<List<AbstractParty>>.unwrap(validator: (List<AbstractParty>) -> List<AbstractParty>): List<AbstractParty> defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<AbstractParty>
    <R> -> List<AbstractParty>

'require' @ [49:21] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'req' @ [49:29] ==> value-parameter req: List<AbstractParty> defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'all' @ [49:33] ==> public inline fun <T> Iterable<AbstractParty>.all(predicate: (AbstractParty) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'it' @ [49:39] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'identityCertificates' @ [49:45] ==> val identityCertificates: Map<AbstractParty, PartyAndCertificate?> defined in net.corda.core.flows.IdentitySyncFlow.Send.call[LocalVariableDescriptor]

'keys' @ [49:66] ==> public abstract val keys: Set<AbstractParty> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'otherSide' @ [49:79] ==> value-parameter otherSide: Party defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [49:151] ==> public final val tx: WireTransaction defined in net.corda.core.flows.IdentitySyncFlow.Send[PropertyDescriptorImpl]

'id' @ [49:154] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'req' @ [50:21] ==> value-parameter req: List<AbstractParty> defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'requestedIdentities' @ [52:66] ==> val requestedIdentities: List<AbstractParty> defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[LocalVariableDescriptor]

'map' @ [52:86] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PartyAndCertificate): List<PartyAndCertificate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PartyAndCertificate

'identityCertificates' @ [53:47] ==> val identityCertificates: Map<AbstractParty, PartyAndCertificate?> defined in net.corda.core.flows.IdentitySyncFlow.Send.call[LocalVariableDescriptor]

'it' @ [53:68] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (identityCertificate != null)
                        identityCertificate
                    else
                        throw IllegalStateException("Counterparty requested a confidential identity for which we do not have the certificate path: ${tx.id}")' @ [54:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PartyAndCertificate, elseBranch: PartyAndCertificate): PartyAndCertificate[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PartyAndCertificate

'identityCertificate' @ [54:25] ==> val identityCertificate: PartyAndCertificate? defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>.<anonymous>[LocalVariableDescriptor]

'identityCertificate' @ [55:25] ==> val identityCertificate: PartyAndCertificate? defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [57:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'tx' @ [57:150] ==> public final val tx: WireTransaction defined in net.corda.core.flows.IdentitySyncFlow.Send[PropertyDescriptorImpl]

'id' @ [57:153] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'send' @ [59:17] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.flows.IdentitySyncFlow.Send[SimpleFunctionDescriptorImpl]

'otherSide' @ [59:22] ==> value-parameter otherSide: Party defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[ValueParameterDescriptorImpl]

'sendIdentities' @ [59:33] ==> val sendIdentities: List<PartyAndCertificate?> defined in net.corda.core.flows.IdentitySyncFlow.Send.call.<anonymous>[LocalVariableDescriptor]

'FlowLogic<Unit>' @ [69:43] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> Unit

'ProgressTracker.Step' @ [71:43] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker.Step' @ [72:45] ==> public constructor Step(label: String) defined in net.corda.core.utilities.ProgressTracker.Step[ClassConstructorDescriptorImpl]

'ProgressTracker' @ [75:57] ==> public constructor ProgressTracker(vararg steps: ProgressTracker.Step) defined in net.corda.core.utilities.ProgressTracker[ClassConstructorDescriptorImpl]

'RECEIVING_IDENTITIES' @ [75:73] ==> public object RECEIVING_IDENTITIES : ProgressTracker.Step defined in net.corda.core.flows.IdentitySyncFlow.Receive.Companion[FakeCallableDescriptorForObject]

'RECEIVING_CERTIFICATES' @ [75:95] ==> public object RECEIVING_CERTIFICATES : ProgressTracker.Step defined in net.corda.core.flows.IdentitySyncFlow.Receive.Companion[FakeCallableDescriptorForObject]

'Suspendable' @ [77:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'progressTracker' @ [79:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.IdentitySyncFlow.Receive[PropertyDescriptorImpl]

'currentStep' @ [79:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'RECEIVING_IDENTITIES' @ [79:43] ==> public object RECEIVING_IDENTITIES : ProgressTracker.Step defined in net.corda.core.flows.IdentitySyncFlow.Receive.Companion[FakeCallableDescriptorForObject]

'receive' @ [80:33] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<List<AbstractParty>> defined in net.corda.core.flows.IdentitySyncFlow.Receive[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> List<AbstractParty>

'otherSide' @ [80:62] ==> public final val otherSide: Party defined in net.corda.core.flows.IdentitySyncFlow.Receive[PropertyDescriptorImpl]

'unwrap' @ [80:73] ==> @Suppress public inline fun <T, R> UntrustworthyData<List<AbstractParty>>.unwrap(validator: (List<AbstractParty>) -> List<AbstractParty>): List<AbstractParty> defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<AbstractParty>
    <R> -> List<AbstractParty>

'it' @ [80:82] ==> value-parameter it: List<AbstractParty> defined in net.corda.core.flows.IdentitySyncFlow.Receive.call.<anonymous>[ValueParameterDescriptorImpl]

'allIdentities' @ [81:37] ==> val allIdentities: List<AbstractParty> defined in net.corda.core.flows.IdentitySyncFlow.Receive.call[LocalVariableDescriptor]

'filter' @ [81:51] ==> public inline fun <T> Iterable<AbstractParty>.filter(predicate: (AbstractParty) -> Boolean): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty

'serviceHub' @ [81:60] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.IdentitySyncFlow.Receive[PropertyDescriptorImpl]

'identityService' @ [81:71] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'partyFromAnonymous' @ [81:87] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'it' @ [81:106] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.IdentitySyncFlow.Receive.call.<anonymous>[ValueParameterDescriptorImpl]

'progressTracker' @ [82:13] ==> public open val progressTracker: ProgressTracker defined in net.corda.core.flows.IdentitySyncFlow.Receive[PropertyDescriptorImpl]

'currentStep' @ [82:29] ==> public final var currentStep: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[PropertyDescriptorImpl]

'RECEIVING_CERTIFICATES' @ [82:43] ==> public object RECEIVING_CERTIFICATES : ProgressTracker.Step defined in net.corda.core.flows.IdentitySyncFlow.Receive.Companion[FakeCallableDescriptorForObject]

'sendAndReceive' @ [83:37] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<List<PartyAndCertificate>> defined in net.corda.core.flows.IdentitySyncFlow.Receive[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified R : Any> -> List<PartyAndCertificate>

'otherSide' @ [83:79] ==> public final val otherSide: Party defined in net.corda.core.flows.IdentitySyncFlow.Receive[PropertyDescriptorImpl]

'unknownIdentities' @ [83:90] ==> val unknownIdentities: List<AbstractParty> defined in net.corda.core.flows.IdentitySyncFlow.Receive.call[LocalVariableDescriptor]

'missingIdentities' @ [87:13] ==> val missingIdentities: UntrustworthyData<List<PartyAndCertificate>> defined in net.corda.core.flows.IdentitySyncFlow.Receive.call[LocalVariableDescriptor]

'unwrap' @ [87:31] ==> @Suppress public inline fun <T, R> UntrustworthyData<List<PartyAndCertificate>>.unwrap(validator: (List<PartyAndCertificate>) -> List<PartyAndCertificate>): List<PartyAndCertificate> defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<PartyAndCertificate>
    <R> -> List<PartyAndCertificate>

'identities' @ [88:17] ==> value-parameter identities: List<PartyAndCertificate> defined in net.corda.core.flows.IdentitySyncFlow.Receive.call.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [88:28] ==> @HidesMembers public inline fun <T> Iterable<PartyAndCertificate>.forEach(action: (PartyAndCertificate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'it' @ [88:38] ==> value-parameter it: PartyAndCertificate defined in net.corda.core.flows.IdentitySyncFlow.Receive.call.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'verify' @ [88:41] ==> public final fun verify(trustAnchor: TrustAnchor): PKIXCertPathValidatorResult defined in net.corda.core.identity.PartyAndCertificate[SimpleFunctionDescriptorImpl]

'serviceHub' @ [88:48] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.IdentitySyncFlow.Receive[PropertyDescriptorImpl]

'identityService' @ [88:59] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'trustAnchor' @ [88:75] ==> public abstract val trustAnchor: TrustAnchor defined in net.corda.core.node.services.IdentityService[PropertyDescriptorImpl]

'identities' @ [89:17] ==> value-parameter identities: List<PartyAndCertificate> defined in net.corda.core.flows.IdentitySyncFlow.Receive.call.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [90:15] ==> @HidesMembers public inline fun <T> Iterable<PartyAndCertificate>.forEach(action: (PartyAndCertificate) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PartyAndCertificate

'serviceHub' @ [92:17] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.IdentitySyncFlow.Receive[PropertyDescriptorImpl]

'identityService' @ [92:28] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'verifyAndRegisterIdentity' @ [92:44] ==> @Throws public abstract fun verifyAndRegisterIdentity(identity: PartyAndCertificate): PartyAndCertificate? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'identity' @ [92:70] ==> value-parameter identity: PartyAndCertificate defined in net.corda.core.flows.IdentitySyncFlow.Receive.call.<anonymous>[ValueParameterDescriptorImpl]

