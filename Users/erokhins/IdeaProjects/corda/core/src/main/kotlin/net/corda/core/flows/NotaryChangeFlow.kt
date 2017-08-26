'InitiatingFlow' @ [23:1] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[ClassConstructorDescriptorImpl]

'tracker' @ [27:84] ==> public final fun tracker(): ProgressTracker defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator.Companion[SimpleFunctionDescriptorImpl]

'AbstractStateReplacementFlow.Instigator<T, T, Party>' @ [28:7] ==> public constructor Instigator<out S : ContractState, out T : ContractState, out M>(originalState: StateAndRef<T>, modification: Party, progressTracker: ProgressTracker = ...) defined in net.corda.core.flows.AbstractStateReplacementFlow.Instigator[ClassConstructorDescriptorImpl]
Inferred types:
    <out S : ContractState> -> T
    <out T : ContractState> -> T
    <out M> -> Party

'originalState' @ [28:60] ==> value-parameter originalState: StateAndRef<T> defined in net.corda.core.flows.NotaryChangeFlow.<init>[ValueParameterDescriptorImpl]

'newNotary' @ [28:75] ==> value-parameter newNotary: Party defined in net.corda.core.flows.NotaryChangeFlow.<init>[ValueParameterDescriptorImpl]

'progressTracker' @ [28:86] ==> value-parameter progressTracker: ProgressTracker = ... defined in net.corda.core.flows.NotaryChangeFlow.<init>[ValueParameterDescriptorImpl]

'resolveEncumbrances' @ [31:22] ==> private/*private to this*/ final fun resolveEncumbrances(state: StateAndRef<T>): List<StateAndRef<T>> defined in net.corda.core.flows.NotaryChangeFlow[SimpleFunctionDescriptorImpl]

'originalState' @ [31:42] ==> public final val originalState: StateAndRef<T> defined in net.corda.core.flows.NotaryChangeFlow[PropertyDescriptorImpl]

'NotaryChangeWireTransaction' @ [33:18] ==> public constructor NotaryChangeWireTransaction(inputs: List<StateRef>, notary: Party, newNotary: Party) defined in net.corda.core.transactions.NotaryChangeWireTransaction[ClassConstructorDescriptorImpl]

'inputs' @ [34:17] ==> val inputs: List<StateAndRef<T>> defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'map' @ [34:24] ==> public inline fun <T, R> Iterable<StateAndRef<T>>.map(transform: (StateAndRef<T>) -> StateRef): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>
    <R> -> StateRef

'it' @ [34:30] ==> value-parameter it: StateAndRef<T> defined in net.corda.core.flows.NotaryChangeFlow.assembleTx.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [34:33] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'originalState' @ [35:17] ==> public final val originalState: StateAndRef<T> defined in net.corda.core.flows.NotaryChangeFlow[PropertyDescriptorImpl]

'state' @ [35:31] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'notary' @ [35:37] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'modification' @ [36:17] ==> public final val modification: Party defined in net.corda.core.flows.NotaryChangeFlow[PropertyDescriptorImpl]

'inputs' @ [39:31] ==> val inputs: List<StateAndRef<T>> defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'flatMap' @ [39:38] ==> public inline fun <T, R> Iterable<StateAndRef<T>>.flatMap(transform: (StateAndRef<T>) -> Iterable<AbstractParty>): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>
    <R> -> AbstractParty

'it' @ [39:48] ==> value-parameter it: StateAndRef<T> defined in net.corda.core.flows.NotaryChangeFlow.assembleTx.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [39:51] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [39:57] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'participants' @ [39:62] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'map' @ [39:77] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [39:83] ==> value-parameter it: AbstractParty defined in net.corda.core.flows.NotaryChangeFlow.assembleTx.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [39:86] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[PropertyDescriptorImpl]

'toSet' @ [39:98] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'serviceHub' @ [41:21] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.NotaryChangeFlow[PropertyDescriptorImpl]

'keyManagementService' @ [41:32] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'filterMyKeys' @ [41:53] ==> public abstract fun filterMyKeys(candidateKeys: Iterable<PublicKey>): Iterable<PublicKey> defined in net.corda.core.node.services.KeyManagementService[SimpleFunctionDescriptorImpl]

'participantKeys' @ [41:66] ==> val participantKeys: Set<PublicKey> defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'single' @ [41:83] ==> public fun <T> Iterable<PublicKey>.single(): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'SignableData' @ [42:28] ==> public constructor SignableData(txId: SecureHash, signatureMetadata: SignatureMetadata) defined in net.corda.core.crypto.SignableData[ClassConstructorDescriptorImpl]

'tx' @ [42:41] ==> val tx: NotaryChangeWireTransaction defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'id' @ [42:44] ==> public open val id: SecureHash defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'SignatureMetadata' @ [42:48] ==> public constructor SignatureMetadata(platformVersion: Int, schemeNumberID: Int) defined in net.corda.core.crypto.SignatureMetadata[ClassConstructorDescriptorImpl]

'serviceHub' @ [42:66] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.NotaryChangeFlow[PropertyDescriptorImpl]

'myInfo' @ [42:77] ==> public abstract val myInfo: NodeInfo defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'platformVersion' @ [42:84] ==> public final val platformVersion: Int defined in net.corda.core.node.NodeInfo[PropertyDescriptorImpl]

'Crypto' @ [42:101] ==> public object Crypto defined in net.corda.core.crypto in file Crypto.kt[FakeCallableDescriptorForObject]

'findSignatureScheme' @ [42:108] ==> @JvmStatic public final fun findSignatureScheme(key: PublicKey): SignatureScheme defined in net.corda.core.crypto.Crypto[SimpleFunctionDescriptorImpl]

'myKey' @ [42:128] ==> val myKey: PublicKey defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'schemeNumberID' @ [42:135] ==> public final val schemeNumberID: Int defined in net.corda.core.crypto.SignatureScheme[PropertyDescriptorImpl]

'serviceHub' @ [43:27] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.NotaryChangeFlow[PropertyDescriptorImpl]

'keyManagementService' @ [43:38] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.core.node.ServiceHub[PropertyDescriptorImpl]

'sign' @ [43:59] ==> @Suspendable public abstract fun sign(signableData: SignableData, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.services.KeyManagementService[SimpleFunctionDescriptorImpl]

'signableData' @ [43:64] ==> val signableData: SignableData defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'myKey' @ [43:78] ==> val myKey: PublicKey defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'SignedTransaction' @ [44:19] ==> public constructor SignedTransaction(ctx: CoreTransaction, sigs: List<TransactionSignature>) defined in net.corda.core.transactions.SignedTransaction[ClassConstructorDescriptorImpl]

'tx' @ [44:37] ==> val tx: NotaryChangeWireTransaction defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'listOf' @ [44:41] ==> public fun <T> listOf(element: TransactionSignature): List<TransactionSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature

'mySignature' @ [44:48] ==> val mySignature: TransactionSignature defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'UpgradeTx' @ [46:45] ==> public constructor UpgradeTx(stx: SignedTransaction, participants: Iterable<PublicKey>, myKey: PublicKey) defined in net.corda.core.flows.AbstractStateReplacementFlow.UpgradeTx[ClassConstructorDescriptorImpl]

'stx' @ [46:55] ==> val stx: SignedTransaction defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'participantKeys' @ [46:60] ==> val participantKeys: Set<PublicKey> defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'myKey' @ [46:77] ==> val myKey: PublicKey defined in net.corda.core.flows.NotaryChangeFlow.assembleTx[LocalVariableDescriptor]

'mutableListOf' @ [51:22] ==> public fun <T> mutableListOf(vararg elements: StateAndRef<T>): MutableList<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'state' @ [51:36] ==> value-parameter state: StateAndRef<T> defined in net.corda.core.flows.NotaryChangeFlow.resolveEncumbrances[ValueParameterDescriptorImpl]

'states' @ [52:16] ==> val states: MutableList<StateAndRef<T>> defined in net.corda.core.flows.NotaryChangeFlow.resolveEncumbrances[LocalVariableDescriptor]

'last' @ [52:23] ==> public fun <T> List<StateAndRef<T>>.last(): StateAndRef<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'state' @ [52:30] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'encumbrance' @ [52:36] ==> public final val encumbrance: Int? defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'StateRef' @ [53:39] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[ClassConstructorDescriptorImpl]

'states' @ [53:48] ==> val states: MutableList<StateAndRef<T>> defined in net.corda.core.flows.NotaryChangeFlow.resolveEncumbrances[LocalVariableDescriptor]

'last' @ [53:55] ==> public fun <T> List<StateAndRef<T>>.last(): StateAndRef<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'ref' @ [53:62] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'txhash' @ [53:66] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'states' @ [53:74] ==> val states: MutableList<StateAndRef<T>> defined in net.corda.core.flows.NotaryChangeFlow.resolveEncumbrances[LocalVariableDescriptor]

'last' @ [53:81] ==> public fun <T> List<StateAndRef<T>>.last(): StateAndRef<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'state' @ [53:88] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'encumbrance' @ [53:94] ==> public final val encumbrance: Int? defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'serviceHub' @ [54:36] ==> public final val serviceHub: ServiceHub defined in net.corda.core.flows.NotaryChangeFlow[PropertyDescriptorImpl]

'toStateAndRef' @ [54:47] ==> @Throws public open fun <T : ContractState> toStateAndRef(stateRef: StateRef): StateAndRef<T> defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'encumbranceStateRef' @ [54:64] ==> val encumbranceStateRef: StateRef defined in net.corda.core.flows.NotaryChangeFlow.resolveEncumbrances[LocalVariableDescriptor]

'states' @ [55:13] ==> val states: MutableList<StateAndRef<T>> defined in net.corda.core.flows.NotaryChangeFlow.resolveEncumbrances[LocalVariableDescriptor]

'add' @ [55:20] ==> public abstract fun add(element: StateAndRef<T>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'encumbranceState' @ [55:24] ==> val encumbranceState: StateAndRef<T> defined in net.corda.core.flows.NotaryChangeFlow.resolveEncumbrances[LocalVariableDescriptor]

'states' @ [57:16] ==> val states: MutableList<StateAndRef<T>> defined in net.corda.core.flows.NotaryChangeFlow.resolveEncumbrances[LocalVariableDescriptor]

