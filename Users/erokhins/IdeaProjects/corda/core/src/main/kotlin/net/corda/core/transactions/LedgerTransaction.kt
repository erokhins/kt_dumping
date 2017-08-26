'CordaSerializable' @ [25:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'FullTransaction' @ [39:5] ==> public constructor FullTransaction() defined in net.corda.core.transactions.FullTransaction[ClassConstructorDescriptorImpl]

'checkBaseInvariants' @ [42:9] ==> protected open fun checkBaseInvariants(): Unit defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]

'timeWindow' @ [43:13] ==> public final val timeWindow: TimeWindow? defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'check' @ [43:33] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notary' @ [43:39] ==> public open val notary: Party? defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'checkNoNotaryChange' @ [44:9] ==> private final fun checkNoNotaryChange(): Unit defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]

'checkEncumbrancesValid' @ [45:9] ==> private final fun checkEncumbrancesValid(): Unit defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]

'inputs' @ [48:50] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'map' @ [48:57] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> ContractState): List<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> ContractState

'it' @ [48:63] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.LedgerTransaction.<get-inputStates>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [48:66] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [48:72] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'Suppress' @ [55:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'inputs' @ [56:65] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'index' @ [56:72] ==> value-parameter index: Int defined in net.corda.core.transactions.LedgerTransaction.inRef[ValueParameterDescriptorImpl]

'Throws' @ [63:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'TransactionVerificationException' @ [63:13] ==> private constructor TransactionVerificationException(txId: SecureHash, message: String, cause: Throwable?) defined in net.corda.core.contracts.TransactionVerificationException[ClassConstructorDescriptorImpl]

'verifyContracts' @ [64:20] ==> private final fun verifyContracts(): Unit defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]

'inputs' @ [71:26] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'map' @ [71:33] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> Contract): List<Contract> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> Contract

'it' @ [71:39] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.LedgerTransaction.verifyContracts.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [71:42] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [71:48] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'contract' @ [71:53] ==> public abstract val contract: Contract defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'outputs' @ [71:66] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'map' @ [71:74] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> Contract): List<Contract> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> Contract

'it' @ [71:80] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.transactions.LedgerTransaction.verifyContracts.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [71:83] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'contract' @ [71:88] ==> public abstract val contract: Contract defined in net.corda.core.contracts.ContractState[PropertyDescriptorImpl]

'toSet' @ [71:100] ==> public fun <T> Iterable<Contract>.toSet(): Set<Contract> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Contract

'contracts' @ [72:26] ==> val contracts: Set<Contract> defined in net.corda.core.transactions.LedgerTransaction.verifyContracts[LocalVariableDescriptor]

'contract' @ [74:17] ==> val contract: Contract defined in net.corda.core.transactions.LedgerTransaction.verifyContracts[LocalVariableDescriptor]

'verify' @ [74:26] ==> @Throws public abstract fun verify(tx: LedgerTransaction): Unit defined in net.corda.core.contracts.Contract[SimpleFunctionDescriptorImpl]

'this' @ [74:33] ==> <this> defined in net.corda.core.transactions.LedgerTransaction[LazyClassReceiverParameterDescriptor]

'ContractRejection' @ [76:56] ==> public constructor ContractRejection(txId: SecureHash, contract: Contract, cause: Throwable) defined in net.corda.core.contracts.TransactionVerificationException.ContractRejection[ClassConstructorDescriptorImpl]

'id' @ [76:74] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'contract' @ [76:78] ==> val contract: Contract defined in net.corda.core.transactions.LedgerTransaction.verifyContracts[LocalVariableDescriptor]

'e' @ [76:88] ==> val e: Throwable defined in net.corda.core.transactions.LedgerTransaction.verifyContracts[LocalVariableDescriptor]

'notary' @ [89:13] ==> public open val notary: Party? defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'inputs' @ [89:31] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'isNotEmpty' @ [89:38] ==> @InlineOnly public inline fun <T> Collection<StateAndRef<ContractState>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'outputs' @ [90:13] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'forEach' @ [90:21] ==> @HidesMembers public inline fun <T> Iterable<TransactionState<ContractState>>.forEach(action: (TransactionState<ContractState>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'it' @ [91:21] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.transactions.LedgerTransaction.checkNoNotaryChange.<anonymous>[ValueParameterDescriptorImpl]

'notary' @ [91:24] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'notary' @ [91:34] ==> public open val notary: Party? defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'NotaryChangeInWrongTransactionType' @ [92:60] ==> public constructor NotaryChangeInWrongTransactionType(txId: SecureHash, txNotary: Party, outputNotary: Party) defined in net.corda.core.contracts.TransactionVerificationException.NotaryChangeInWrongTransactionType[ClassConstructorDescriptorImpl]

'id' @ [92:95] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'notary' @ [92:99] ==> public open val notary: Party? defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'it' @ [92:107] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.transactions.LedgerTransaction.checkNoNotaryChange.<anonymous>[ValueParameterDescriptorImpl]

'notary' @ [92:110] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'inputs' @ [100:32] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'filter' @ [100:39] ==> public inline fun <T> Iterable<StateAndRef<ContractState>>.filter(predicate: (StateAndRef<ContractState>) -> Boolean): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'it' @ [100:48] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [100:51] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'encumbrance' @ [100:57] ==> public final val encumbrance: Int? defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'encumberedInputs' @ [101:9] ==> val encumberedInputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid[LocalVariableDescriptor]

'forEach' @ [101:26] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<ContractState>>.forEach(action: (StateAndRef<ContractState>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'component1' @ [101:37] ==> public final operator fun component1(): TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[SimpleFunctionDescriptorImpl]

'component2' @ [101:44] ==> public final operator fun component2(): StateRef defined in net.corda.core.contracts.StateAndRef[SimpleFunctionDescriptorImpl]

'inputs' @ [102:42] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'any' @ [102:49] ==> public inline fun <T> Iterable<StateAndRef<ContractState>>.any(predicate: (StateAndRef<ContractState>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'it' @ [103:17] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [103:20] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'txhash' @ [103:24] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'ref' @ [103:34] ==> val ref: StateRef defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid.<anonymous>[LocalVariableDescriptor]

'txhash' @ [103:38] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'it' @ [103:48] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [103:51] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'index' @ [103:55] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[PropertyDescriptorImpl]

'state' @ [103:64] ==> val state: TransactionState<ContractState> defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid.<anonymous>[LocalVariableDescriptor]

'encumbrance' @ [103:70] ==> public final val encumbrance: Int? defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'!' @ [105:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'encumbranceStateExists' @ [105:18] ==> val encumbranceStateExists: Boolean defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid.<anonymous>[LocalVariableDescriptor]

'TransactionMissingEncumbranceException' @ [106:56] ==> public constructor TransactionMissingEncumbranceException(txId: SecureHash, missing: Int, inOut: TransactionVerificationException.Direction) defined in net.corda.core.contracts.TransactionVerificationException.TransactionMissingEncumbranceException[ClassConstructorDescriptorImpl]

'id' @ [107:25] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'state' @ [108:25] ==> val state: TransactionState<ContractState> defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid.<anonymous>[LocalVariableDescriptor]

'encumbrance' @ [108:31] ==> public final val encumbrance: Int? defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'INPUT' @ [109:68] ==> enum entry INPUT defined in net.corda.core.contracts.TransactionVerificationException.Direction[FakeCallableDescriptorForObject]

'component1' @ [116:15] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [116:18] ==> public final operator fun component2(): TransactionState<ContractState> defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'outputs' @ [116:29] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'withIndex' @ [116:37] ==> public fun <T> Iterable<TransactionState<ContractState>>.withIndex(): Iterable<IndexedValue<TransactionState<ContractState>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>

'output' @ [117:36] ==> val output: TransactionState<ContractState> defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid[LocalVariableDescriptor]

'encumbrance' @ [117:43] ==> public final val encumbrance: Int? defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'encumbranceIndex' @ [118:17] ==> val encumbranceIndex: Int defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid[LocalVariableDescriptor]

'i' @ [118:37] ==> val i: Int defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid[LocalVariableDescriptor]

'encumbranceIndex' @ [118:42] ==> val encumbranceIndex: Int defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid[LocalVariableDescriptor]

'outputs' @ [118:62] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'size' @ [118:70] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'TransactionMissingEncumbranceException' @ [119:56] ==> public constructor TransactionMissingEncumbranceException(txId: SecureHash, missing: Int, inOut: TransactionVerificationException.Direction) defined in net.corda.core.contracts.TransactionVerificationException.TransactionMissingEncumbranceException[ClassConstructorDescriptorImpl]

'id' @ [120:25] ==> public open val id: SecureHash defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'encumbranceIndex' @ [121:25] ==> val encumbranceIndex: Int defined in net.corda.core.transactions.LedgerTransaction.checkEncumbrancesValid[LocalVariableDescriptor]

'OUTPUT' @ [122:68] ==> enum entry OUTPUT defined in net.corda.core.contracts.TransactionVerificationException.Direction[FakeCallableDescriptorForObject]

'inputsOfType' @ [143:22] ==> public final fun <T : ContractState> inputsOfType(clazz: Class<T>): List<T> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'ofType' @ [143:35] ==> value-parameter ofType: Class<T> defined in net.corda.core.transactions.LedgerTransaction.groupStates[ValueParameterDescriptorImpl]

'outputsOfType' @ [144:23] ==> public final fun <T : ContractState> outputsOfType(clazz: Class<T>): List<T> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'ofType' @ [144:37] ==> value-parameter ofType: Class<T> defined in net.corda.core.transactions.LedgerTransaction.groupStates[ValueParameterDescriptorImpl]

'inputs' @ [146:41] ==> val inputs: List<T> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'groupBy' @ [146:48] ==> public inline fun <T, K> Iterable<T>.groupBy(keySelector: (T) -> K): Map<K, List<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <K> -> K

'selector' @ [146:56] ==> value-parameter selector: (T) -> K defined in net.corda.core.transactions.LedgerTransaction.groupStates[ValueParameterDescriptorImpl]

'outputs' @ [147:42] ==> val outputs: List<T> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'groupBy' @ [147:50] ==> public inline fun <T, K> Iterable<T>.groupBy(keySelector: (T) -> K): Map<K, List<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <K> -> K

'selector' @ [147:58] ==> value-parameter selector: (T) -> K defined in net.corda.core.transactions.LedgerTransaction.groupStates[ValueParameterDescriptorImpl]

'ArrayList' @ [149:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> InOutGroup<T, K>

'component1' @ [151:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<K, List<T>>.component1(): K defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> List<T>

'component2' @ [151:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<K, List<T>>.component2(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> List<T>

'inGroups' @ [151:24] ==> val inGroups: Map<K, List<T>> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'entries' @ [151:33] ==> public abstract val entries: Set<Map.Entry<K, List<T>>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'result' @ [152:13] ==> val result: ArrayList<LedgerTransaction.InOutGroup<T, K>> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'add' @ [152:20] ==> public open fun add(element: LedgerTransaction.InOutGroup<T, K>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'InOutGroup' @ [152:24] ==> public constructor InOutGroup<out T : ContractState, out K : Any>(inputs: List<T>, outputs: List<T>, groupingKey: K) defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> T
    <out K : Any> -> K

'v' @ [152:35] ==> val v: List<T> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'outGroups' @ [152:38] ==> val outGroups: Map<K, List<T>> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'k' @ [152:48] ==> val k: K defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'emptyList' @ [152:54] ==> public fun <T> emptyList(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'k' @ [152:67] ==> val k: K defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'component1' @ [153:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<K, List<T>>.component1(): K defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> List<T>

'component2' @ [153:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<K, List<T>>.component2(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> K
    <V> -> List<T>

'outGroups' @ [153:24] ==> val outGroups: Map<K, List<T>> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'entries' @ [153:34] ==> public abstract val entries: Set<Map.Entry<K, List<T>>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'inGroups' @ [154:17] ==> val inGroups: Map<K, List<T>> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'k' @ [154:26] ==> val k: K defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'result' @ [155:17] ==> val result: ArrayList<LedgerTransaction.InOutGroup<T, K>> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'add' @ [155:24] ==> public open fun add(element: LedgerTransaction.InOutGroup<T, K>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'InOutGroup' @ [155:28] ==> public constructor InOutGroup<out T : ContractState, out K : Any>(inputs: List<T>, outputs: List<T>, groupingKey: K) defined in net.corda.core.transactions.LedgerTransaction.InOutGroup[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> T
    <out K : Any> -> K

'emptyList' @ [155:39] ==> public fun <T> emptyList(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'v' @ [155:52] ==> val v: List<T> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'k' @ [155:55] ==> val k: K defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'result' @ [158:16] ==> val result: ArrayList<LedgerTransaction.InOutGroup<T, K>> defined in net.corda.core.transactions.LedgerTransaction.groupStates[LocalVariableDescriptor]

'groupStates' @ [164:16] ==> public final fun <T : ContractState, K : Any> groupStates(ofType: Class<T>, selector: (T) -> K): List<LedgerTransaction.InOutGroup<T, K>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T
    <K : Any> -> K

'java' @ [164:37] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'selector' @ [164:43] ==> value-parameter noinline selector: (T) -> K defined in net.corda.core.transactions.LedgerTransaction.groupStates[ValueParameterDescriptorImpl]

'inputs' @ [185:47] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'index' @ [185:54] ==> value-parameter index: Int defined in net.corda.core.transactions.LedgerTransaction.getInput[ValueParameterDescriptorImpl]

'state' @ [185:61] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [185:67] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'inputs' @ [193:70] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'mapNotNull' @ [193:77] ==> public inline fun <T, R : Any> Iterable<StateAndRef<ContractState>>.mapNotNull(transform: (StateAndRef<ContractState>) -> T?): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R : Any> -> T

'clazz' @ [193:90] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.LedgerTransaction.inputsOfType[ValueParameterDescriptorImpl]

'castIfPossible' @ [193:96] ==> public fun <T> Class<T>.castIfPossible(obj: Any): T? defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'it' @ [193:111] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.LedgerTransaction.inputsOfType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [193:114] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [193:120] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'inputsOfType' @ [195:70] ==> public final fun <T : ContractState> inputsOfType(clazz: Class<T>): List<T> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [195:92] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Suppress' @ [204:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'inputs' @ [205:16] ==> public open val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'mapNotNull' @ [205:23] ==> public inline fun <T, R : Any> Iterable<StateAndRef<ContractState>>.mapNotNull(transform: (StateAndRef<ContractState>) -> StateAndRef<T>?): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R : Any> -> StateAndRef<T>

'if (clazz.isInstance(it.state.data)) it as StateAndRef<T> else null' @ [205:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StateAndRef<T>?, elseBranch: StateAndRef<T>?): StateAndRef<T>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StateAndRef<T>?

'clazz' @ [205:40] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.LedgerTransaction.inRefsOfType[ValueParameterDescriptorImpl]

'isInstance' @ [205:46] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [205:57] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.LedgerTransaction.inRefsOfType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [205:60] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [205:66] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'it' @ [205:73] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.LedgerTransaction.inRefsOfType.<anonymous>[ValueParameterDescriptorImpl]

'inRefsOfType' @ [208:83] ==> public final fun <T : ContractState> inRefsOfType(clazz: Class<T>): List<StateAndRef<T>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [208:105] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'inputsOfType' @ [219:16] ==> public final fun <T : ContractState> inputsOfType(clazz: Class<T>): List<T> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'clazz' @ [219:29] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.LedgerTransaction.filterInputs[ValueParameterDescriptorImpl]

'filter' @ [219:36] ==> public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'predicate' @ [219:45] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.LedgerTransaction.filterInputs[ValueParameterDescriptorImpl]

'test' @ [219:55] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [219:60] ==> value-parameter it: T defined in net.corda.core.transactions.LedgerTransaction.filterInputs.<anonymous>[ValueParameterDescriptorImpl]

'filterInputs' @ [223:16] ==> public final fun <T : ContractState> filterInputs(clazz: Class<T>, predicate: Predicate<T>): List<T> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [223:38] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [223:44] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [223:56] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [223:66] ==> value-parameter it: T defined in net.corda.core.transactions.LedgerTransaction.filterInputs.<anonymous>[ValueParameterDescriptorImpl]

'inRefsOfType' @ [235:16] ==> public final fun <T : ContractState> inRefsOfType(clazz: Class<T>): List<StateAndRef<T>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'clazz' @ [235:29] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.LedgerTransaction.filterInRefs[ValueParameterDescriptorImpl]

'filter' @ [235:36] ==> public inline fun <T> Iterable<StateAndRef<T>>.filter(predicate: (StateAndRef<T>) -> Boolean): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'predicate' @ [235:45] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.LedgerTransaction.filterInRefs[ValueParameterDescriptorImpl]

'test' @ [235:55] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [235:60] ==> value-parameter it: StateAndRef<T> defined in net.corda.core.transactions.LedgerTransaction.filterInRefs.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [235:63] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [235:69] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'filterInRefs' @ [239:16] ==> public final fun <T : ContractState> filterInRefs(clazz: Class<T>, predicate: Predicate<T>): List<StateAndRef<T>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [239:38] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [239:44] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [239:56] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [239:66] ==> value-parameter it: T defined in net.corda.core.transactions.LedgerTransaction.filterInRefs.<anonymous>[ValueParameterDescriptorImpl]

'inputsOfType' @ [252:16] ==> public final fun <T : ContractState> inputsOfType(clazz: Class<T>): List<T> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'clazz' @ [252:29] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.LedgerTransaction.findInput[ValueParameterDescriptorImpl]

'single' @ [252:36] ==> public inline fun <T> Iterable<T>.single(predicate: (T) -> Boolean): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'predicate' @ [252:45] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.LedgerTransaction.findInput[ValueParameterDescriptorImpl]

'test' @ [252:55] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [252:60] ==> value-parameter it: T defined in net.corda.core.transactions.LedgerTransaction.findInput.<anonymous>[ValueParameterDescriptorImpl]

'findInput' @ [256:16] ==> public final fun <T : ContractState> findInput(clazz: Class<T>, predicate: Predicate<T>): T defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [256:35] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [256:41] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [256:53] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [256:63] ==> value-parameter it: T defined in net.corda.core.transactions.LedgerTransaction.findInput.<anonymous>[ValueParameterDescriptorImpl]

'inRefsOfType' @ [269:16] ==> public final fun <T : ContractState> inRefsOfType(clazz: Class<T>): List<StateAndRef<T>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'clazz' @ [269:29] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.LedgerTransaction.findInRef[ValueParameterDescriptorImpl]

'single' @ [269:36] ==> public inline fun <T> Iterable<StateAndRef<T>>.single(predicate: (StateAndRef<T>) -> Boolean): StateAndRef<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'predicate' @ [269:45] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.LedgerTransaction.findInRef[ValueParameterDescriptorImpl]

'test' @ [269:55] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [269:60] ==> value-parameter it: StateAndRef<T> defined in net.corda.core.transactions.LedgerTransaction.findInRef.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [269:63] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [269:69] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'findInRef' @ [273:16] ==> public final fun <T : ContractState> findInRef(clazz: Class<T>, predicate: Predicate<T>): StateAndRef<T> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [273:35] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [273:41] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [273:53] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [273:63] ==> value-parameter it: T defined in net.corda.core.transactions.LedgerTransaction.findInRef.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [281:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Command' @ [282:64] ==> public constructor Command<T : CommandData>(value: T, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[ClassConstructorDescriptorImpl]
Inferred types:
    <T : CommandData> -> T

'commands' @ [282:72] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'index' @ [282:81] ==> value-parameter index: Int defined in net.corda.core.transactions.LedgerTransaction.getCommand[ValueParameterDescriptorImpl]

'value' @ [282:88] ==> public final val value: CommandData defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'commands' @ [282:100] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'index' @ [282:109] ==> value-parameter index: Int defined in net.corda.core.transactions.LedgerTransaction.getCommand[ValueParameterDescriptorImpl]

'signers' @ [282:116] ==> public final val signers: List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[PropertyDescriptorImpl]

'commands' @ [291:16] ==> public final val commands: List<AuthenticatedObject<CommandData>> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'mapNotNull' @ [291:25] ==> public inline fun <T, R : Any> Iterable<AuthenticatedObject<CommandData>>.mapNotNull(transform: (AuthenticatedObject<CommandData>) -> Command<T>?): List<Command<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AuthenticatedObject<CommandData>
    <R : Any> -> Command<T>

'component1' @ [291:39] ==> public final operator fun component1(): List<PublicKey> defined in net.corda.core.contracts.AuthenticatedObject[SimpleFunctionDescriptorImpl]

'component2' @ [291:48] ==> public final operator fun component2(): List<Party> defined in net.corda.core.contracts.AuthenticatedObject[SimpleFunctionDescriptorImpl]

'component3' @ [291:51] ==> public final operator fun component3(): CommandData defined in net.corda.core.contracts.AuthenticatedObject[SimpleFunctionDescriptorImpl]

'clazz' @ [291:61] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.LedgerTransaction.commandsOfType[ValueParameterDescriptorImpl]

'castIfPossible' @ [291:67] ==> public fun <T> Class<T>.castIfPossible(obj: Any): T? defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'value' @ [291:82] ==> val value: CommandData defined in net.corda.core.transactions.LedgerTransaction.commandsOfType.<anonymous>[LocalVariableDescriptor]

'let' @ [291:90] ==> @InlineOnly public inline fun <T, R> T.let(block: (T) -> Command<T>): Command<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> Command<T>

'Command' @ [291:96] ==> public constructor Command<T : CommandData>(value: T, signers: List<PublicKey>) defined in net.corda.core.contracts.Command[ClassConstructorDescriptorImpl]
Inferred types:
    <T : CommandData> -> T

'it' @ [291:104] ==> value-parameter it: T defined in net.corda.core.transactions.LedgerTransaction.commandsOfType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'signers' @ [291:108] ==> val signers: List<PublicKey> defined in net.corda.core.transactions.LedgerTransaction.commandsOfType.<anonymous>[LocalVariableDescriptor]

'commandsOfType' @ [294:79] ==> public final fun <T : CommandData> commandsOfType(clazz: Class<T>): List<Command<T>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CommandData> -> T

'java' @ [294:103] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'commandsOfType' @ [305:16] ==> public final fun <T : CommandData> commandsOfType(clazz: Class<T>): List<Command<T>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CommandData> -> T

'clazz' @ [305:31] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.LedgerTransaction.filterCommands[ValueParameterDescriptorImpl]

'filter' @ [305:38] ==> public inline fun <T> Iterable<Command<T>>.filter(predicate: (Command<T>) -> Boolean): List<Command<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<T>

'predicate' @ [305:47] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.LedgerTransaction.filterCommands[ValueParameterDescriptorImpl]

'test' @ [305:57] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [305:62] ==> value-parameter it: Command<T> defined in net.corda.core.transactions.LedgerTransaction.filterCommands.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [305:65] ==> public final val value: T defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'filterCommands' @ [309:16] ==> public final fun <T : CommandData> filterCommands(clazz: Class<T>, predicate: Predicate<T>): List<Command<T>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CommandData> -> T

'java' @ [309:40] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [309:46] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [309:58] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [309:68] ==> value-parameter it: T defined in net.corda.core.transactions.LedgerTransaction.filterCommands.<anonymous>[ValueParameterDescriptorImpl]

'commandsOfType' @ [322:16] ==> public final fun <T : CommandData> commandsOfType(clazz: Class<T>): List<Command<T>> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CommandData> -> T

'clazz' @ [322:31] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.LedgerTransaction.findCommand[ValueParameterDescriptorImpl]

'single' @ [322:38] ==> public inline fun <T> Iterable<Command<T>>.single(predicate: (Command<T>) -> Boolean): Command<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<T>

'predicate' @ [322:47] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.LedgerTransaction.findCommand[ValueParameterDescriptorImpl]

'test' @ [322:57] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [322:62] ==> value-parameter it: Command<T> defined in net.corda.core.transactions.LedgerTransaction.findCommand.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [322:65] ==> public final val value: T defined in net.corda.core.contracts.Command[PropertyDescriptorImpl]

'findCommand' @ [326:16] ==> public final fun <T : CommandData> findCommand(clazz: Class<T>, predicate: Predicate<T>): Command<T> defined in net.corda.core.transactions.LedgerTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CommandData> -> T

'java' @ [326:37] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [326:43] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [326:55] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [326:65] ==> value-parameter it: T defined in net.corda.core.transactions.LedgerTransaction.findCommand.<anonymous>[ValueParameterDescriptorImpl]

'attachments' @ [334:49] ==> public final val attachments: List<Attachment> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'index' @ [334:61] ==> value-parameter index: Int defined in net.corda.core.transactions.LedgerTransaction.getAttachment[ValueParameterDescriptorImpl]

'attachments' @ [342:53] ==> public final val attachments: List<Attachment> defined in net.corda.core.transactions.LedgerTransaction[PropertyDescriptorImpl]

'first' @ [342:65] ==> public inline fun <T> Iterable<Attachment>.first(predicate: (Attachment) -> Boolean): Attachment defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attachment

'it' @ [342:73] ==> value-parameter it: Attachment defined in net.corda.core.transactions.LedgerTransaction.getAttachment.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [342:76] ==> public abstract val id: SecureHash defined in net.corda.core.contracts.Attachment[PropertyDescriptorImpl]

'id' @ [342:82] ==> value-parameter id: SecureHash defined in net.corda.core.transactions.LedgerTransaction.getAttachment[ValueParameterDescriptorImpl]

