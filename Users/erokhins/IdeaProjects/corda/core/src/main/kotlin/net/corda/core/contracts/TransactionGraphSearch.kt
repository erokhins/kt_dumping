'Query' @ [28:24] ==> public constructor Query(withCommandOfType: Class<out CommandData>? = ..., followInputsOfType: Class<out ContractState>? = ...) defined in net.corda.core.contracts.TransactionGraphSearch.Query[ClassConstructorDescriptorImpl]

'query' @ [31:17] ==> public final var query: TransactionGraphSearch.Query defined in net.corda.core.contracts.TransactionGraphSearch[PropertyDescriptorImpl]

'HashSet' @ [33:30] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'ArrayList' @ [34:20] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (WireTransaction..WireTransaction?)>..Collection<(WireTransaction..WireTransaction?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> WireTransaction

'startPoints' @ [34:47] ==> public final val startPoints: List<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch[PropertyDescriptorImpl]

'ArrayList' @ [36:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> WireTransaction

'next' @ [38:16] ==> val next: ArrayList<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'isNotEmpty' @ [38:21] ==> @InlineOnly public inline fun <T> Collection<WireTransaction>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransaction

'next' @ [39:22] ==> val next: ArrayList<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'removeAt' @ [39:27] ==> public open fun removeAt(p0: Int): WireTransaction defined in java.util.ArrayList[JavaMethodDescriptor]

'next' @ [39:36] ==> val next: ArrayList<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'lastIndex' @ [39:41] ==> public val <T> List<WireTransaction>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> WireTransaction

'q' @ [41:17] ==> val q: TransactionGraphSearch.Query defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'matches' @ [41:19] ==> private final fun TransactionGraphSearch.Query.matches(tx: WireTransaction): Boolean defined in net.corda.core.contracts.TransactionGraphSearch[SimpleFunctionDescriptorImpl]

'tx' @ [41:27] ==> val tx: WireTransaction defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'results' @ [42:17] ==> val results: ArrayList<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'tx' @ [42:28] ==> val tx: WireTransaction defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'tx' @ [44:66] ==> val tx: WireTransaction defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'inputs' @ [44:69] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'filter' @ [44:76] ==> public inline fun <T> Iterable<StateRef>.filter(predicate: (StateRef) -> Boolean): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'it' @ [44:85] ==> value-parameter it: StateRef defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [44:88] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'alreadyVisited' @ [44:99] ==> val alreadyVisited: HashSet<SecureHash> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'inputsLeadingToUnvisitedTx' @ [45:73] ==> val inputsLeadingToUnvisitedTx: Iterable<StateRef> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'map' @ [45:100] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> SecureHash): List<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> SecureHash

'it' @ [45:106] ==> value-parameter it: StateRef defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [45:109] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'toHashSet' @ [45:118] ==> public fun <T> Iterable<SecureHash>.toHashSet(): HashSet<SecureHash> /* = HashSet<SecureHash> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'map' @ [45:130] ==> public inline fun <T, R> Iterable<SecureHash>.map(transform: (SecureHash) -> SignedTransaction?): List<SignedTransaction?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <R> -> SignedTransaction?

'transactions' @ [45:136] ==> public final val transactions: TransactionStorage defined in net.corda.core.contracts.TransactionGraphSearch[PropertyDescriptorImpl]

'getTransaction' @ [45:149] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.core.node.services.TransactionStorage[SimpleFunctionDescriptorImpl]

'it' @ [45:164] ==> value-parameter it: SecureHash defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'filterNotNull' @ [45:170] ==> public fun <T : Any> Iterable<SignedTransaction?>.filterNotNull(): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SignedTransaction

'associateBy' @ [45:186] ==> public inline fun <T, K> Iterable<SignedTransaction>.associateBy(keySelector: (SignedTransaction) -> SecureHash): Map<SecureHash, SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <K> -> SecureHash

'it' @ [45:200] ==> value-parameter it: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [45:203] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'inputsLeadingToUnvisitedTx' @ [46:91] ==> val inputsLeadingToUnvisitedTx: Iterable<StateRef> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'filter' @ [46:118] ==> public inline fun <T> Iterable<StateRef>.filter(predicate: (StateRef) -> Boolean): List<StateRef> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'it' @ [46:127] ==> value-parameter it: StateRef defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [46:130] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'unvisitedInputTxs' @ [46:140] ==> val unvisitedInputTxs: Map<SecureHash, SignedTransaction> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'keys' @ [46:158] ==> public abstract val keys: Set<SecureHash> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'map' @ [46:165] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> Pair<SignedTransaction, Int>): List<Pair<SignedTransaction, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> Pair<SignedTransaction, Int>

'Pair' @ [46:171] ==> public constructor Pair<out A, out B>(first: SignedTransaction, second: Int) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SignedTransaction
    <out B> -> Int

'unvisitedInputTxs' @ [46:176] ==> val unvisitedInputTxs: Map<SecureHash, SignedTransaction> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'it' @ [46:194] ==> value-parameter it: StateRef defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [46:197] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'it' @ [46:208] ==> value-parameter it: StateRef defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [46:211] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'next' @ [47:13] ==> val next: ArrayList<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'unvisitedInputTxsWithInputIndex' @ [47:22] ==> val unvisitedInputTxsWithInputIndex: Iterable<Pair<SignedTransaction, Int>> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'filter' @ [47:54] ==> public inline fun <T> Iterable<Pair<SignedTransaction, Int>>.filter(predicate: (Pair<SignedTransaction, Int>) -> Boolean): List<Pair<SignedTransaction, Int>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SignedTransaction, Int>

'q' @ [47:63] ==> val q: TransactionGraphSearch.Query defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'followInputsOfType' @ [47:65] ==> public final val followInputsOfType: Class<out ContractState>? defined in net.corda.core.contracts.TransactionGraphSearch.Query[PropertyDescriptorImpl]

'it' @ [47:95] ==> value-parameter it: Pair<SignedTransaction, Int> defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [47:98] ==> public final val first: SignedTransaction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'tx' @ [47:104] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'outputs' @ [47:107] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'it' @ [47:115] ==> value-parameter it: Pair<SignedTransaction, Int> defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [47:118] ==> public final val second: Int defined in kotlin.Pair[DeserializedPropertyDescriptor]

'data' @ [47:126] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'javaClass' @ [47:131] ==> public val <T : Any> ContractState.javaClass: Class<ContractState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> ContractState

'q' @ [47:144] ==> val q: TransactionGraphSearch.Query defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'followInputsOfType' @ [47:146] ==> public final val followInputsOfType: Class<out ContractState>? defined in net.corda.core.contracts.TransactionGraphSearch.Query[PropertyDescriptorImpl]

'map' @ [48:22] ==> public inline fun <T, R> Iterable<Pair<SignedTransaction, Int>>.map(transform: (Pair<SignedTransaction, Int>) -> SignedTransaction): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SignedTransaction, Int>
    <R> -> SignedTransaction

'it' @ [48:28] ==> value-parameter it: Pair<SignedTransaction, Int> defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [48:31] ==> public final val first: SignedTransaction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'filter' @ [48:39] ==> public inline fun <T> Iterable<SignedTransaction>.filter(predicate: (SignedTransaction) -> Boolean): List<SignedTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction

'alreadyVisited' @ [48:48] ==> val alreadyVisited: HashSet<SecureHash> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'add' @ [48:63] ==> public open fun add(element: SecureHash): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [48:67] ==> value-parameter it: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [48:70] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'map' @ [48:76] ==> public inline fun <T, R> Iterable<SignedTransaction>.map(transform: (SignedTransaction) -> WireTransaction): List<WireTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SignedTransaction
    <R> -> WireTransaction

'it' @ [48:82] ==> value-parameter it: SignedTransaction defined in net.corda.core.contracts.TransactionGraphSearch.call.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [48:85] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[PropertyDescriptorImpl]

'results' @ [51:16] ==> val results: ArrayList<WireTransaction> defined in net.corda.core.contracts.TransactionGraphSearch.call[LocalVariableDescriptor]

'withCommandOfType' @ [55:13] ==> public final val withCommandOfType: Class<out CommandData>? defined in net.corda.core.contracts.TransactionGraphSearch.Query[PropertyDescriptorImpl]

'tx' @ [56:17] ==> value-parameter tx: WireTransaction defined in net.corda.core.contracts.TransactionGraphSearch.matches[ValueParameterDescriptorImpl]

'commands' @ [56:20] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[PropertyDescriptorImpl]

'any' @ [56:29] ==> public inline fun <T> Iterable<Command<*>>.any(predicate: (Command<*>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>

'it' @ [56:35] ==> value-parameter it: Command<*> defined in net.corda.core.contracts.TransactionGraphSearch.matches.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [56:38] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'javaClass' @ [56:44] ==> public val <T : Any> CommandData.javaClass: Class<CommandData> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> CommandData

'isAssignableFrom' @ [56:54] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'withCommandOfType' @ [56:71] ==> public final val withCommandOfType: Class<out CommandData>? defined in net.corda.core.contracts.TransactionGraphSearch.Query[PropertyDescriptorImpl]

