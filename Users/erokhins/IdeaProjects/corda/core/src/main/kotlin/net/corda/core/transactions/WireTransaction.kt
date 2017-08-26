'CordaSerializable' @ [21:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'PrivacySalt' @ [32:49] ==> public constructor PrivacySalt() defined in net.corda.core.contracts.PrivacySalt[ClassConstructorDescriptorImpl]

'CoreTransaction' @ [33:5] ==> public constructor CoreTransaction() defined in net.corda.core.transactions.CoreTransaction[ClassConstructorDescriptorImpl]

'checkBaseInvariants' @ [35:9] ==> protected open fun checkBaseInvariants(): Unit defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'timeWindow' @ [36:13] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'check' @ [36:33] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notary' @ [36:39] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'check' @ [37:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'availableComponents' @ [37:15] ==> public open val availableComponents: List<Any> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'isNotEmpty' @ [37:35] ==> @InlineOnly public inline fun <T> Collection<Any>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'merkleTree' @ [41:41] ==> public final val merkleTree: MerkleTree defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'hash' @ [41:52] ==> public abstract val hash: SecureHash defined in net.corda.core.crypto.MerkleTree[PropertyDescriptorImpl]

'commands' @ [45:27] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'flatMap' @ [45:36] ==> public inline fun <T, R> Iterable<Command<*>>.flatMap(transform: (Command<*>) -> Iterable<PublicKey>): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>
    <R> -> PublicKey

'it' @ [45:46] ==> value-parameter it: Command<*> defined in net.corda.core.transactions.WireTransaction.<get-requiredSigningKeys>.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [45:49] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'toSet' @ [45:59] ==> public fun <T> Iterable<PublicKey>.toSet(): Set<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'if (notary != null && (inputs.isNotEmpty() || timeWindow != null)) {
            commandKeys + notary.owningKey
        } else {
            commandKeys
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<PublicKey>, elseBranch: Set<PublicKey>): Set<PublicKey>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<PublicKey>

'notary' @ [47:20] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'inputs' @ [47:39] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'isNotEmpty' @ [47:46] ==> @InlineOnly public inline fun <T> Collection<StateRef>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'timeWindow' @ [47:62] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'commandKeys' @ [48:13] ==> val commandKeys: Set<PublicKey> defined in net.corda.core.transactions.WireTransaction.<get-requiredSigningKeys>[LocalVariableDescriptor]

'notary' @ [48:27] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'owningKey' @ [48:34] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[PropertyDescriptorImpl]

'commandKeys' @ [50:13] ==> val commandKeys: Set<PublicKey> defined in net.corda.core.transactions.WireTransaction.<get-requiredSigningKeys>[LocalVariableDescriptor]

'Throws' @ [61:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'AttachmentResolutionException' @ [61:13] ==> public constructor AttachmentResolutionException(hash: SecureHash) defined in net.corda.core.contracts.AttachmentResolutionException[ClassConstructorDescriptorImpl]

'TransactionResolutionException' @ [61:51] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'toLedgerTransaction' @ [63:16] ==> @Throws public final fun toLedgerTransaction(resolveIdentity: (PublicKey) -> Party?, resolveAttachment: (SecureHash) -> Attachment?, resolveStateRef: (StateRef) -> TransactionState<*>?): LedgerTransaction defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'services' @ [64:37] ==> value-parameter services: ServicesForResolution defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction[ValueParameterDescriptorImpl]

'identityService' @ [64:46] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServicesForResolution[PropertyDescriptorImpl]

'partyFromKey' @ [64:62] ==> public abstract fun partyFromKey(key: PublicKey): Party? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'it' @ [64:75] ==> value-parameter it: PublicKey defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'services' @ [65:39] ==> value-parameter services: ServicesForResolution defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction[ValueParameterDescriptorImpl]

'attachments' @ [65:48] ==> public abstract val attachments: AttachmentStorage defined in net.corda.core.node.ServicesForResolution[PropertyDescriptorImpl]

'openAttachment' @ [65:60] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[SimpleFunctionDescriptorImpl]

'it' @ [65:75] ==> value-parameter it: SecureHash defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'services' @ [66:37] ==> value-parameter services: ServicesForResolution defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction[ValueParameterDescriptorImpl]

'loadState' @ [66:46] ==> @Throws public abstract fun loadState(stateRef: StateRef): TransactionState<*> defined in net.corda.core.node.ServicesForResolution[SimpleFunctionDescriptorImpl]

'it' @ [66:56] ==> value-parameter it: StateRef defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'Throws' @ [77:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'AttachmentResolutionException' @ [77:13] ==> public constructor AttachmentResolutionException(hash: SecureHash) defined in net.corda.core.contracts.AttachmentResolutionException[ClassConstructorDescriptorImpl]

'TransactionResolutionException' @ [77:51] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'commands' @ [84:33] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'map' @ [84:42] ==> public inline fun <T, R> Iterable<Command<*>>.map(transform: (Command<*>) -> AuthenticatedObject<CommandData>): List<AuthenticatedObject<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>
    <R> -> AuthenticatedObject<CommandData>

'it' @ [85:27] ==> value-parameter it: Command<*> defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [85:30] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'mapNotNull' @ [85:38] ==> public inline fun <T, R : Any> Iterable<PublicKey>.mapNotNull(transform: (PublicKey) -> Party?): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey
    <R : Any> -> Party

'invoke' @ [85:57] ==> public abstract operator fun invoke(p1: PublicKey): Party? defined in kotlin.Function1[FunctionInvokeDescriptor]

'pk' @ [85:73] ==> value-parameter pk: PublicKey defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'AuthenticatedObject' @ [86:13] ==> public constructor AuthenticatedObject<out T : Any>(signers: List<PublicKey>, signingParties: List<Party>, value: CommandData) defined in net.corda.core.contracts.AuthenticatedObject[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> CommandData

'it' @ [86:33] ==> value-parameter it: Command<*> defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [86:36] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'parties' @ [86:45] ==> val parties: List<Party> defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[LocalVariableDescriptor]

'it' @ [86:54] ==> value-parameter it: Command<*> defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [86:57] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'attachments' @ [89:27] ==> public open val attachments: List<SecureHash> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'map' @ [89:39] ==> public inline fun <T, R> Iterable<SecureHash>.map(transform: (SecureHash) -> Attachment): List<Attachment> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <R> -> Attachment

'invoke' @ [89:45] ==> public abstract operator fun invoke(p1: SecureHash): Attachment? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [89:63] ==> value-parameter it: SecureHash defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'AttachmentResolutionException' @ [89:76] ==> public constructor AttachmentResolutionException(hash: SecureHash) defined in net.corda.core.contracts.AttachmentResolutionException[ClassConstructorDescriptorImpl]

'it' @ [89:106] ==> value-parameter it: SecureHash defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'inputs' @ [90:30] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'map' @ [90:37] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> StateAndRef<ContractState>

'invoke' @ [91:13] ==> public abstract operator fun invoke(p1: StateRef): TransactionState<*>? defined in kotlin.Function1[FunctionInvokeDescriptor]

'ref' @ [91:29] ==> value-parameter ref: StateRef defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [91:35] ==> @InlineOnly public inline fun <T, R> TransactionState<ContractState>.let(block: (TransactionState<ContractState>) -> StateAndRef<ContractState>): StateAndRef<ContractState> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> StateAndRef<ContractState>

'StateAndRef' @ [91:41] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> ContractState

'it' @ [91:53] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [91:57] ==> value-parameter ref: StateRef defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'TransactionResolutionException' @ [91:73] ==> public constructor TransactionResolutionException(hash: SecureHash) defined in net.corda.core.contracts.TransactionResolutionException[ClassConstructorDescriptorImpl]

'ref' @ [91:104] ==> value-parameter ref: StateRef defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [91:108] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'LedgerTransaction' @ [93:16] ==> public constructor LedgerTransaction(inputs: List<StateAndRef<ContractState>>, outputs: List<TransactionState<ContractState>>, commands: List<AuthenticatedObject<CommandData>>, attachments: List<Attachment>, id: SecureHash, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt) defined in net.corda.core.transactions.LedgerTransaction[ClassConstructorDescriptorImpl]

'resolvedInputs' @ [93:34] ==> val resolvedInputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction[LocalVariableDescriptor]

'outputs' @ [93:50] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'authenticatedArgs' @ [93:59] ==> val authenticatedArgs: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction[LocalVariableDescriptor]

'attachments' @ [93:78] ==> val attachments: List<Attachment> defined in net.corda.core.transactions.WireTransaction.toLedgerTransaction[LocalVariableDescriptor]

'id' @ [93:91] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'notary' @ [93:95] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'timeWindow' @ [93:103] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'privacySalt' @ [93:115] ==> public open val privacySalt: PrivacySalt defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'FilteredTransaction' @ [100:16] ==> public companion object defined in net.corda.core.transactions.FilteredTransaction[FakeCallableDescriptorForObject]

'buildMerkleTransaction' @ [100:36] ==> @JvmStatic public final fun buildMerkleTransaction(wtx: WireTransaction, filtering: Predicate<Any>): FilteredTransaction defined in net.corda.core.transactions.FilteredTransaction.Companion[SimpleFunctionDescriptorImpl]

'this' @ [100:59] ==> <this> defined in net.corda.core.transactions.WireTransaction[LazyClassReceiverParameterDescriptor]

'filtering' @ [100:65] ==> value-parameter filtering: Predicate<Any> defined in net.corda.core.transactions.WireTransaction.buildFilteredTransaction[ValueParameterDescriptorImpl]

'lazy' @ [106:35] ==> public fun <T> lazy(initializer: () -> MerkleTree): Lazy<MerkleTree> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MerkleTree

'MerkleTree' @ [106:42] ==> public companion object defined in net.corda.core.crypto.MerkleTree[FakeCallableDescriptorForObject]

'getMerkleTree' @ [106:53] ==> @Throws public final fun getMerkleTree(allLeavesHashes: List<SecureHash>): MerkleTree defined in net.corda.core.crypto.MerkleTree.Companion[SimpleFunctionDescriptorImpl]

'availableComponentHashes' @ [106:67] ==> public open val availableComponentHashes: List<SecureHash> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'mutableListOf' @ [115:47] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'indexOffsets' @ [116:23] ==> private final fun indexOffsets(): List<Int> defined in net.corda.core.transactions.WireTransaction[SimpleFunctionDescriptorImpl]

'if (elem == null || !filtering.test(elem)) {
                null
            } else {
                nonces.add(computeNonce(privacySalt, index))
                elem
            }' @ [118:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'elem' @ [118:24] ==> value-parameter elem: Any? defined in net.corda.core.transactions.WireTransaction.filterWithFun.notNullFalseAndNoncesUpdate[ValueParameterDescriptorImpl]

'!' @ [118:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'filtering' @ [118:41] ==> value-parameter filtering: Predicate<Any> defined in net.corda.core.transactions.WireTransaction.filterWithFun[ValueParameterDescriptorImpl]

'test' @ [118:51] ==> public abstract fun test(p0: Any): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'elem' @ [118:56] ==> value-parameter elem: Any? defined in net.corda.core.transactions.WireTransaction.filterWithFun.notNullFalseAndNoncesUpdate[ValueParameterDescriptorImpl]

'nonces' @ [121:17] ==> val nonces: MutableList<SecureHash> defined in net.corda.core.transactions.WireTransaction.filterWithFun[LocalVariableDescriptor]

'add' @ [121:24] ==> public abstract fun add(element: SecureHash): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'computeNonce' @ [121:28] ==> public fun computeNonce(privacySalt: PrivacySalt, index: Int): SecureHash.SHA256 defined in net.corda.core.transactions[SimpleFunctionDescriptorImpl]

'privacySalt' @ [121:41] ==> public open val privacySalt: PrivacySalt defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'index' @ [121:54] ==> value-parameter index: Int defined in net.corda.core.transactions.WireTransaction.filterWithFun.notNullFalseAndNoncesUpdate[ValueParameterDescriptorImpl]

'elem' @ [122:17] ==> value-parameter elem: Any? defined in net.corda.core.transactions.WireTransaction.filterWithFun.notNullFalseAndNoncesUpdate[ValueParameterDescriptorImpl]

'if (filtering.test(t)) {
                nonces.add(computeNonce(privacySalt, index))
                true
            } else {
                false
            }' @ [127:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'filtering' @ [127:24] ==> value-parameter filtering: Predicate<Any> defined in net.corda.core.transactions.WireTransaction.filterWithFun[ValueParameterDescriptorImpl]

'test' @ [127:34] ==> public abstract fun test(p0: Any): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

't' @ [127:39] ==> value-parameter t: T defined in net.corda.core.transactions.WireTransaction.filterWithFun.filterAndNoncesUpdate[ValueParameterDescriptorImpl]

'nonces' @ [128:17] ==> val nonces: MutableList<SecureHash> defined in net.corda.core.transactions.WireTransaction.filterWithFun[LocalVariableDescriptor]

'add' @ [128:24] ==> public abstract fun add(element: SecureHash): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'computeNonce' @ [128:28] ==> public fun computeNonce(privacySalt: PrivacySalt, index: Int): SecureHash.SHA256 defined in net.corda.core.transactions[SimpleFunctionDescriptorImpl]

'privacySalt' @ [128:41] ==> public open val privacySalt: PrivacySalt defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'index' @ [128:54] ==> value-parameter index: Int defined in net.corda.core.transactions.WireTransaction.filterWithFun.filterAndNoncesUpdate[ValueParameterDescriptorImpl]

'FilteredLeaves' @ [138:16] ==> public constructor FilteredLeaves(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, nonces: List<SecureHash>) defined in net.corda.core.transactions.FilteredLeaves[ClassConstructorDescriptorImpl]

'inputs' @ [139:17] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'filterIndexed' @ [139:24] ==> public inline fun <T> Iterable<StateRef>.filterIndexed(predicate: (index: Int, StateRef) -> Boolean): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'filterAndNoncesUpdate' @ [139:53] ==> local final fun <T : Any> filterAndNoncesUpdate(t: StateRef, index: Int): Boolean defined in net.corda.core.transactions.WireTransaction.filterWithFun[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> StateRef

'it' @ [139:75] ==> value-parameter it: StateRef defined in net.corda.core.transactions.WireTransaction.filterWithFun.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [139:79] ==> value-parameter index: Int defined in net.corda.core.transactions.WireTransaction.filterWithFun.<anonymous>[ValueParameterDescriptorImpl]

'attachments' @ [140:17] ==> public open val attachments: List<SecureHash> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'filterIndexed' @ [140:29] ==> public inline fun <T> Iterable<SecureHash>.filterIndexed(predicate: (index: Int, SecureHash) -> Boolean): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'filterAndNoncesUpdate' @ [140:58] ==> local final fun <T : Any> filterAndNoncesUpdate(t: SecureHash, index: Int): Boolean defined in net.corda.core.transactions.WireTransaction.filterWithFun[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> SecureHash

'it' @ [140:80] ==> value-parameter it: SecureHash defined in net.corda.core.transactions.WireTransaction.filterWithFun.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [140:84] ==> value-parameter index: Int defined in net.corda.core.transactions.WireTransaction.filterWithFun.<anonymous>[ValueParameterDescriptorImpl]

'offsets' @ [140:92] ==> val offsets: List<Int> defined in net.corda.core.transactions.WireTransaction.filterWithFun[LocalVariableDescriptor]

'outputs' @ [141:17] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'filterIndexed' @ [141:25] ==> public inline fun <T> Iterable<TransactionState<ContractState>>.filterIndexed(predicate: (index: Int, TransactionState<ContractState>) -> Boolean): List<TransactionState<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'filterAndNoncesUpdate' @ [141:54] ==> local final fun <T : Any> filterAndNoncesUpdate(t: TransactionState<ContractState>, index: Int): Boolean defined in net.corda.core.transactions.WireTransaction.filterWithFun[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> TransactionState<ContractState>

'it' @ [141:76] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.transactions.WireTransaction.filterWithFun.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [141:80] ==> value-parameter index: Int defined in net.corda.core.transactions.WireTransaction.filterWithFun.<anonymous>[ValueParameterDescriptorImpl]

'offsets' @ [141:88] ==> val offsets: List<Int> defined in net.corda.core.transactions.WireTransaction.filterWithFun[LocalVariableDescriptor]

'commands' @ [142:17] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'filterIndexed' @ [142:26] ==> public inline fun <T> Iterable<Command<*>>.filterIndexed(predicate: (index: Int, Command<*>) -> Boolean): List<Command<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>

'filterAndNoncesUpdate' @ [142:55] ==> local final fun <T : Any> filterAndNoncesUpdate(t: Command<out CommandData>, index: Int): Boolean defined in net.corda.core.transactions.WireTransaction.filterWithFun[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Command<out CommandData>

'it' @ [142:77] ==> value-parameter it: Command<*> defined in net.corda.core.transactions.WireTransaction.filterWithFun.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [142:81] ==> value-parameter index: Int defined in net.corda.core.transactions.WireTransaction.filterWithFun.<anonymous>[ValueParameterDescriptorImpl]

'offsets' @ [142:89] ==> val offsets: List<Int> defined in net.corda.core.transactions.WireTransaction.filterWithFun[LocalVariableDescriptor]

'notNullFalseAndNoncesUpdate' @ [143:17] ==> local final fun notNullFalseAndNoncesUpdate(elem: Any?, index: Int): Any? defined in net.corda.core.transactions.WireTransaction.filterWithFun[SimpleFunctionDescriptorImpl]

'notary' @ [143:45] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'offsets' @ [143:53] ==> val offsets: List<Int> defined in net.corda.core.transactions.WireTransaction.filterWithFun[LocalVariableDescriptor]

'notNullFalseAndNoncesUpdate' @ [144:17] ==> local final fun notNullFalseAndNoncesUpdate(elem: Any?, index: Int): Any? defined in net.corda.core.transactions.WireTransaction.filterWithFun[SimpleFunctionDescriptorImpl]

'timeWindow' @ [144:45] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'offsets' @ [144:57] ==> val offsets: List<Int> defined in net.corda.core.transactions.WireTransaction.filterWithFun[LocalVariableDescriptor]

'nonces' @ [145:17] ==> val nonces: MutableList<SecureHash> defined in net.corda.core.transactions.WireTransaction.filterWithFun[LocalVariableDescriptor]

'mutableListOf' @ [154:23] ==> public fun <T> mutableListOf(vararg elements: Int): MutableList<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'inputs' @ [154:37] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'size' @ [154:44] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'inputs' @ [154:50] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'size' @ [154:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'attachments' @ [154:64] ==> public open val attachments: List<SecureHash> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'size' @ [154:76] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'offsets' @ [155:9] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'add' @ [155:17] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'offsets' @ [155:21] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'last' @ [155:29] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'outputs' @ [155:38] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'size' @ [155:46] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'offsets' @ [156:9] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'add' @ [156:17] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'offsets' @ [156:21] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'last' @ [156:29] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'commands' @ [156:38] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'size' @ [156:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (notary != null) {
            offsets.add(offsets.last() + 1)
        } else {
            offsets.add(offsets.last())
        }' @ [157:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'notary' @ [157:13] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'offsets' @ [158:13] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'add' @ [158:21] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'offsets' @ [158:25] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'last' @ [158:33] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'offsets' @ [160:13] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'add' @ [160:21] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'offsets' @ [160:25] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'last' @ [160:33] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'if (timeWindow != null) {
            offsets.add(offsets.last() + 1)
        } else {
            offsets.add(offsets.last())
        }' @ [162:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'timeWindow' @ [162:13] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'offsets' @ [163:13] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'add' @ [163:21] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'offsets' @ [163:25] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'last' @ [163:33] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'offsets' @ [165:13] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'add' @ [165:21] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'offsets' @ [165:25] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'last' @ [165:33] ==> public fun <T> List<Int>.last(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'offsets' @ [168:16] ==> val offsets: MutableList<Int> defined in net.corda.core.transactions.WireTransaction.indexOffsets[LocalVariableDescriptor]

'require' @ [178:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'commands' @ [178:17] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'any' @ [178:26] ==> public inline fun <T> Iterable<Command<*>>.any(predicate: (Command<*>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>

'it' @ [178:32] ==> value-parameter it: Command<*> defined in net.corda.core.transactions.WireTransaction.checkSignature.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [178:35] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'any' @ [178:43] ==> public inline fun <T> Iterable<PublicKey>.any(predicate: (PublicKey) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'sig' @ [178:49] ==> value-parameter sig: TransactionSignature defined in net.corda.core.transactions.WireTransaction.checkSignature[ValueParameterDescriptorImpl]

'by' @ [178:53] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[PropertyDescriptorImpl]

'it' @ [178:59] ==> value-parameter it: PublicKey defined in net.corda.core.transactions.WireTransaction.checkSignature.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'keys' @ [178:62] ==> public val PublicKey.keys: Set<PublicKey> defined in net.corda.core.crypto in file CryptoUtils.kt[PropertyDescriptorImpl]

'sig' @ [179:9] ==> value-parameter sig: TransactionSignature defined in net.corda.core.transactions.WireTransaction.checkSignature[ValueParameterDescriptorImpl]

'verify' @ [179:13] ==> @Throws public final fun verify(txId: SecureHash): Boolean defined in net.corda.core.crypto.TransactionSignature[SimpleFunctionDescriptorImpl]

'id' @ [179:20] ==> public open val id: SecureHash defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'StringBuilder' @ [183:19] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'buf' @ [184:9] ==> val buf: StringBuilder /* = StringBuilder */ defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'appendln' @ [184:13] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'inputs' @ [185:23] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'buf' @ [185:31] ==> val buf: StringBuilder /* = StringBuilder */ defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'appendln' @ [185:35] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Emoji' @ [185:47] ==> public object Emoji defined in net.corda.core.internal in file Emoji.kt[FakeCallableDescriptorForObject]

'rightArrow' @ [185:53] ==> public final val rightArrow: String defined in net.corda.core.internal.Emoji[PropertyDescriptorImpl]

'input' @ [185:77] ==> val input: StateRef defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'component1' @ [186:15] ==> public final operator fun component1(): ContractState defined in net.corda.core.contracts.TransactionState[SimpleFunctionDescriptorImpl]

'outputs' @ [186:24] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'buf' @ [186:33] ==> val buf: StringBuilder /* = StringBuilder */ defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'appendln' @ [186:37] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Emoji' @ [186:49] ==> public object Emoji defined in net.corda.core.internal in file Emoji.kt[FakeCallableDescriptorForObject]

'leftArrow' @ [186:55] ==> public final val leftArrow: String defined in net.corda.core.internal.Emoji[PropertyDescriptorImpl]

'data' @ [186:78] ==> val data: ContractState defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'commands' @ [187:25] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'buf' @ [187:35] ==> val buf: StringBuilder /* = StringBuilder */ defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'appendln' @ [187:39] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Emoji' @ [187:51] ==> public object Emoji defined in net.corda.core.internal in file Emoji.kt[FakeCallableDescriptorForObject]

'diamond' @ [187:57] ==> public final val diamond: String defined in net.corda.core.internal.Emoji[PropertyDescriptorImpl]

'command' @ [187:78] ==> val command: Command<*> defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'attachments' @ [188:28] ==> public open val attachments: List<SecureHash> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'buf' @ [188:41] ==> val buf: StringBuilder /* = StringBuilder */ defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'appendln' @ [188:45] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Emoji' @ [188:57] ==> public object Emoji defined in net.corda.core.internal in file Emoji.kt[FakeCallableDescriptorForObject]

'paperclip' @ [188:63] ==> public final val paperclip: String defined in net.corda.core.internal.Emoji[PropertyDescriptorImpl]

'attachment' @ [188:86] ==> val attachment: SecureHash defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'buf' @ [189:16] ==> val buf: StringBuilder /* = StringBuilder */ defined in net.corda.core.transactions.WireTransaction.toString[LocalVariableDescriptor]

'toString' @ [189:20] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

