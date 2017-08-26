'CoreTransaction' @ [20:5] ==> public constructor CoreTransaction() defined in net.corda.core.transactions.CoreTransaction[ClassConstructorDescriptorImpl]

'emptyList' @ [26:17] ==> public fun <T> emptyList(): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'check' @ [29:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'inputs' @ [29:15] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'isNotEmpty' @ [29:22] ==> @InlineOnly public inline fun <T> Collection<StateRef>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'check' @ [30:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notary' @ [30:15] ==> public open val notary: Party defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'newNotary' @ [30:25] ==> public final val newNotary: Party defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'newNotary' @ [30:85] ==> public final val newNotary: Party defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'getValue' @ [37:36] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'serializedHash' @ [37:43] ==> public fun <T : Any> serializedHash(x: List<Any>): SecureHash defined in net.corda.core.transactions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> List<Any>

'inputs' @ [37:58] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'notary' @ [37:67] ==> public open val notary: Party defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'newNotary' @ [37:76] ==> public final val newNotary: Party defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'inputs' @ [40:30] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'map' @ [40:37] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> StateAndRef<ContractState>

'services' @ [41:13] ==> value-parameter services: ServiceHub defined in net.corda.core.transactions.NotaryChangeWireTransaction.resolve[ValueParameterDescriptorImpl]

'loadState' @ [41:22] ==> @Throws public open fun loadState(stateRef: StateRef): TransactionState<*> defined in net.corda.core.node.ServiceHub[SimpleFunctionDescriptorImpl]

'ref' @ [41:32] ==> value-parameter ref: StateRef defined in net.corda.core.transactions.NotaryChangeWireTransaction.resolve.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [41:37] ==> @InlineOnly public inline fun <T, R> TransactionState<*>.let(block: (TransactionState<*>) -> StateAndRef<ContractState>): StateAndRef<ContractState> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<*>
    <R> -> StateAndRef<ContractState>

'StateAndRef' @ [41:43] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> ContractState

'it' @ [41:55] ==> value-parameter it: TransactionState<*> defined in net.corda.core.transactions.NotaryChangeWireTransaction.resolve.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [41:59] ==> value-parameter ref: StateRef defined in net.corda.core.transactions.NotaryChangeWireTransaction.resolve.<anonymous>[ValueParameterDescriptorImpl]

'NotaryChangeLedgerTransaction' @ [43:16] ==> public constructor NotaryChangeLedgerTransaction(inputs: List<StateAndRef<ContractState>>, notary: Party, newNotary: Party, id: SecureHash, sigs: List<TransactionSignature>) defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[ClassConstructorDescriptorImpl]

'resolvedInputs' @ [43:46] ==> val resolvedInputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeWireTransaction.resolve[LocalVariableDescriptor]

'notary' @ [43:62] ==> public open val notary: Party defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'newNotary' @ [43:70] ==> public final val newNotary: Party defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'id' @ [43:81] ==> public open val id: SecureHash defined in net.corda.core.transactions.NotaryChangeWireTransaction[PropertyDescriptorImpl]

'sigs' @ [43:85] ==> value-parameter sigs: List<TransactionSignature> defined in net.corda.core.transactions.NotaryChangeWireTransaction.resolve[ValueParameterDescriptorImpl]

'FullTransaction' @ [58:5] ==> public constructor FullTransaction() defined in net.corda.core.transactions.FullTransaction[ClassConstructorDescriptorImpl]

'checkEncumbrances' @ [60:9] ==> private final fun checkEncumbrances(): Unit defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[SimpleFunctionDescriptorImpl]

'inputs' @ [65:17] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'mapIndexed' @ [65:24] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.mapIndexed(transform: (index: Int, StateAndRef<ContractState>) -> TransactionState<ContractState>): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> TransactionState<ContractState>

'component1' @ [65:43] ==> public final operator fun component1(): TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[SimpleFunctionDescriptorImpl]

'if (state.encumbrance != null) {
                state.copy(notary = newNotary, encumbrance = pos + 1)
            } else state.copy(notary = newNotary)' @ [66:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TransactionState<ContractState>, elseBranch: TransactionState<ContractState>): TransactionState<ContractState>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TransactionState<ContractState>

'state' @ [66:17] ==> val state: TransactionState<ContractState> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.<get-outputs>.<anonymous>[LocalVariableDescriptor]

'encumbrance' @ [66:23] ==> public final val encumbrance: Int? defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'state' @ [67:17] ==> val state: TransactionState<ContractState> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.<get-outputs>.<anonymous>[LocalVariableDescriptor]

'copy' @ [67:23] ==> public final fun copy(data: ContractState = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<ContractState> defined in net.corda.core.contracts.TransactionState[SimpleFunctionDescriptorImpl]

'newNotary' @ [67:37] ==> public final val newNotary: Party defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'pos' @ [67:62] ==> value-parameter pos: Int defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.<get-outputs>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [68:20] ==> val state: TransactionState<ContractState> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.<get-outputs>.<anonymous>[LocalVariableDescriptor]

'copy' @ [68:26] ==> public final fun copy(data: ContractState = ..., notary: Party = ..., encumbrance: Int? = ...): TransactionState<ContractState> defined in net.corda.core.contracts.TransactionState[SimpleFunctionDescriptorImpl]

'newNotary' @ [68:40] ==> public final val newNotary: Party defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'inputs' @ [72:17] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'flatMap' @ [72:24] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.flatMap(transform: (StateAndRef<ContractState>) -> Iterable<AbstractParty>): List<AbstractParty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> AbstractParty

'it' @ [72:34] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.<get-requiredSigningKeys>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [72:37] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [72:43] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'participants' @ [72:48] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'map' @ [72:63] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> PublicKey

'it' @ [72:69] ==> value-parameter it: AbstractParty defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.<get-requiredSigningKeys>.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [72:72] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[PropertyDescriptorImpl]

'toSet' @ [72:84] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'notary' @ [72:94] ==> public open val notary: Party defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'owningKey' @ [72:101] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'keys' @ [75:16] ==> value-parameter keys: Set<PublicKey> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.getKeyDescriptions[ValueParameterDescriptorImpl]

'map' @ [75:21] ==> public inline fun <T, R> Iterable<PublicKey>.map(transform: (PublicKey) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey
    <R> -> String

'it' @ [75:27] ==> value-parameter it: PublicKey defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.getKeyDescriptions.<anonymous>[ValueParameterDescriptorImpl]

'toBase58String' @ [75:30] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto in file EncodingUtils.kt[SimpleFunctionDescriptorImpl]

'inputs' @ [83:9] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'forEachIndexed' @ [83:16] ==> public inline fun <T> Iterable<StateAndRef<ContractState>>.forEachIndexed(action: (index: Int, StateAndRef<ContractState>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'component1' @ [83:37] ==> public final operator fun component1(): TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[SimpleFunctionDescriptorImpl]

'component2' @ [83:44] ==> public final operator fun component2(): StateRef defined in net.corda.core.contracts.StateAndRef[SimpleFunctionDescriptorImpl]

'state' @ [84:13] ==> val state: TransactionState<ContractState> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.checkEncumbrances.<anonymous>[LocalVariableDescriptor]

'encumbrance' @ [84:19] ==> public final val encumbrance: Int? defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'let' @ [84:32] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Unit

'i' @ [85:33] ==> value-parameter i: Int defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.checkEncumbrances.<anonymous>[ValueParameterDescriptorImpl]

'inputs' @ [86:49] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'nextIndex' @ [86:56] ==> val nextIndex: Int defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.checkEncumbrances.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ref' @ [86:67] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'txhash' @ [86:71] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'ref' @ [86:81] ==> val ref: StateRef defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.checkEncumbrances.<anonymous>[LocalVariableDescriptor]

'txhash' @ [86:85] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'inputs' @ [86:97] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'nextIndex' @ [86:104] ==> val nextIndex: Int defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.checkEncumbrances.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ref' @ [86:115] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'index' @ [86:119] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'it' @ [86:128] ==> value-parameter it: Int defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.checkEncumbrances.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nextIndex' @ [87:21] ==> val nextIndex: Int defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.checkEncumbrances.<anonymous>.<anonymous>[LocalVariableDescriptor]

'inputs' @ [87:34] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'size' @ [87:41] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'!' @ [87:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nextStateIsEncumbrance' @ [87:50] ==> local final fun nextStateIsEncumbrance(): Boolean defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.checkEncumbrances.<anonymous>.<anonymous>[SimpleFunctionDescriptorImpl]

'TransactionMissingEncumbranceException' @ [88:60] ==> public constructor TransactionMissingEncumbranceException(txId: SecureHash, missing: Int, inOut: TransactionVerificationException.Direction) defined in net.corda.core.contracts.TransactionVerificationException.TransactionMissingEncumbranceException[ClassConstructorDescriptorImpl]

'id' @ [89:29] ==> public open val id: SecureHash defined in net.corda.core.transactions.NotaryChangeLedgerTransaction[PropertyDescriptorImpl]

'it' @ [90:29] ==> value-parameter it: Int defined in net.corda.core.transactions.NotaryChangeLedgerTransaction.checkEncumbrances.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'INPUT' @ [91:72] ==> enum entry INPUT defined in net.corda.core.contracts.TransactionVerificationException.Direction[FakeCallableDescriptorForObject]

