'checkNotarySetIfInputsPresent' @ [25:9] ==> private final fun checkNotarySetIfInputsPresent(): Unit defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]

'checkNoDuplicateInputs' @ [26:9] ==> private final fun checkNoDuplicateInputs(): Unit defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]

'notary' @ [30:13] ==> public abstract val notary: Party? defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'check' @ [31:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'inputs' @ [31:19] ==> public abstract val inputs: List<*> defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'isEmpty' @ [31:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'inputs' @ [36:26] ==> public abstract val inputs: List<*> defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'groupBy' @ [36:33] ==> public inline fun <T, K> Iterable<Any?>.groupBy(keySelector: (Any?) -> Any?): Map<Any?, List<Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <K> -> Any?

'it' @ [36:43] ==> value-parameter it: Any? defined in net.corda.core.transactions.BaseTransaction.checkNoDuplicateInputs.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [36:48] ==> public inline fun <K, V> Map<out Any?, List<Any?>>.filter(predicate: (Map.Entry<Any?, List<Any?>>) -> Boolean): Map<Any?, List<Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> List<Any?>

'it' @ [36:57] ==> value-parameter it: Map.Entry<Any?, List<Any?>> defined in net.corda.core.transactions.BaseTransaction.checkNoDuplicateInputs.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [36:60] ==> public abstract val value: List<Any?> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'size' @ [36:66] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'keys' @ [36:77] ==> public abstract val keys: Set<Any?> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'check' @ [37:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'duplicates' @ [37:15] ==> val duplicates: Set<Any?> defined in net.corda.core.transactions.BaseTransaction.checkNoDuplicateInputs[LocalVariableDescriptor]

'isEmpty' @ [37:26] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [43:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'StateAndRef' @ [44:66] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<T>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> T

'outputs' @ [44:78] ==> public abstract val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'index' @ [44:86] ==> value-parameter index: Int defined in net.corda.core.transactions.BaseTransaction.outRef[ValueParameterDescriptorImpl]

'StateRef' @ [44:117] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[ClassConstructorDescriptorImpl]

'id' @ [44:126] ==> public abstract val id: SecureHash defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'index' @ [44:130] ==> value-parameter index: Int defined in net.corda.core.transactions.BaseTransaction.outRef[ValueParameterDescriptorImpl]

'outRef' @ [49:76] ==> @Suppress public final fun <T : ContractState> outRef(index: Int): StateAndRef<T> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'outputStates' @ [49:83] ==> public final val outputStates: List<ContractState> defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'indexOfOrThrow' @ [49:96] ==> public fun <T> List<ContractState>.indexOfOrThrow(item: ContractState): Int defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ContractState

'state' @ [49:111] ==> value-parameter state: ContractState defined in net.corda.core.transactions.BaseTransaction.outRef[ValueParameterDescriptorImpl]

'outputs' @ [54:51] ==> public abstract val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'map' @ [54:59] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.map(transform: (TransactionState<ContractState>) -> ContractState): List<ContractState> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> ContractState

'it' @ [54:65] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.transactions.BaseTransaction.<get-outputStates>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [54:68] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'outputs' @ [61:48] ==> public abstract val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'index' @ [61:56] ==> value-parameter index: Int defined in net.corda.core.transactions.BaseTransaction.getOutput[ValueParameterDescriptorImpl]

'data' @ [61:63] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'outputs' @ [69:71] ==> public abstract val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'mapNotNull' @ [69:79] ==> public inline fun <T, R : Any> Iterable<TransactionState<ContractState>>.mapNotNull(transform: (TransactionState<ContractState>) -> T?): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R : Any> -> T

'clazz' @ [69:92] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.BaseTransaction.outputsOfType[ValueParameterDescriptorImpl]

'castIfPossible' @ [69:98] ==> public fun <T> Class<T>.castIfPossible(obj: Any): T? defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'it' @ [69:113] ==> value-parameter it: TransactionState<ContractState> defined in net.corda.core.transactions.BaseTransaction.outputsOfType.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [69:116] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'outputsOfType' @ [71:71] ==> public final fun <T : ContractState> outputsOfType(clazz: Class<T>): List<T> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [71:94] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'outputsOfType' @ [82:16] ==> public final fun <T : ContractState> outputsOfType(clazz: Class<T>): List<T> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'clazz' @ [82:30] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.BaseTransaction.filterOutputs[ValueParameterDescriptorImpl]

'filter' @ [82:37] ==> public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'predicate' @ [82:46] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.BaseTransaction.filterOutputs[ValueParameterDescriptorImpl]

'test' @ [82:56] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [82:61] ==> value-parameter it: T defined in net.corda.core.transactions.BaseTransaction.filterOutputs.<anonymous>[ValueParameterDescriptorImpl]

'filterOutputs' @ [86:16] ==> public final fun <T : ContractState> filterOutputs(clazz: Class<T>, predicate: Predicate<T>): List<T> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [86:39] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [86:45] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [86:57] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [86:67] ==> value-parameter it: T defined in net.corda.core.transactions.BaseTransaction.filterOutputs.<anonymous>[ValueParameterDescriptorImpl]

'outputsOfType' @ [99:16] ==> public final fun <T : ContractState> outputsOfType(clazz: Class<T>): List<T> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'clazz' @ [99:30] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.BaseTransaction.findOutput[ValueParameterDescriptorImpl]

'single' @ [99:37] ==> public inline fun <T> Iterable<T>.single(predicate: (T) -> Boolean): T defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'predicate' @ [99:46] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.BaseTransaction.findOutput[ValueParameterDescriptorImpl]

'test' @ [99:56] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [99:61] ==> value-parameter it: T defined in net.corda.core.transactions.BaseTransaction.findOutput.<anonymous>[ValueParameterDescriptorImpl]

'findOutput' @ [103:16] ==> public final fun <T : ContractState> findOutput(clazz: Class<T>, predicate: Predicate<T>): T defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [103:36] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [103:42] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [103:54] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [103:64] ==> value-parameter it: T defined in net.corda.core.transactions.BaseTransaction.findOutput.<anonymous>[ValueParameterDescriptorImpl]

'outputs' @ [113:16] ==> public abstract val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'mapIndexedNotNull' @ [113:24] ==> public inline fun <T, R : Any> Iterable<TransactionState<ContractState>>.mapIndexedNotNull(transform: (index: Int, TransactionState<ContractState>) -> StateAndRef<T>?): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R : Any> -> StateAndRef<T>

'Suppress' @ [114:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'clazz' @ [115:13] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.BaseTransaction.outRefsOfType[ValueParameterDescriptorImpl]

'castIfPossible' @ [115:19] ==> public fun <T> Class<T>.castIfPossible(obj: Any): T? defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'state' @ [115:34] ==> value-parameter state: TransactionState<ContractState> defined in net.corda.core.transactions.BaseTransaction.outRefsOfType.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [115:40] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'let' @ [115:47] ==> @InlineOnly public inline fun <T, R> T.let(block: (T) -> StateAndRef<T>): StateAndRef<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> StateAndRef<T>

'StateAndRef' @ [115:53] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<T>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> T

'state' @ [115:65] ==> value-parameter state: TransactionState<ContractState> defined in net.corda.core.transactions.BaseTransaction.outRefsOfType.<anonymous>[ValueParameterDescriptorImpl]

'StateRef' @ [115:95] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[ClassConstructorDescriptorImpl]

'id' @ [115:104] ==> public abstract val id: SecureHash defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

'index' @ [115:108] ==> value-parameter index: Int defined in net.corda.core.transactions.BaseTransaction.outRefsOfType.<anonymous>[ValueParameterDescriptorImpl]

'outRefsOfType' @ [119:84] ==> public final fun <T : ContractState> outRefsOfType(clazz: Class<T>): List<StateAndRef<T>> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [119:107] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'outRefsOfType' @ [130:16] ==> public final fun <T : ContractState> outRefsOfType(clazz: Class<T>): List<StateAndRef<T>> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'clazz' @ [130:30] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.BaseTransaction.filterOutRefs[ValueParameterDescriptorImpl]

'filter' @ [130:37] ==> public inline fun <T> Iterable<StateAndRef<T>>.filter(predicate: (StateAndRef<T>) -> Boolean): List<StateAndRef<T>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'predicate' @ [130:46] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.BaseTransaction.filterOutRefs[ValueParameterDescriptorImpl]

'test' @ [130:56] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [130:61] ==> value-parameter it: StateAndRef<T> defined in net.corda.core.transactions.BaseTransaction.filterOutRefs.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [130:64] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [130:70] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'filterOutRefs' @ [134:16] ==> public final fun <T : ContractState> filterOutRefs(clazz: Class<T>, predicate: Predicate<T>): List<StateAndRef<T>> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [134:39] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [134:45] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [134:57] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [134:67] ==> value-parameter it: T defined in net.corda.core.transactions.BaseTransaction.filterOutRefs.<anonymous>[ValueParameterDescriptorImpl]

'outRefsOfType' @ [147:16] ==> public final fun <T : ContractState> outRefsOfType(clazz: Class<T>): List<StateAndRef<T>> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'clazz' @ [147:30] ==> value-parameter clazz: Class<T> defined in net.corda.core.transactions.BaseTransaction.findOutRef[ValueParameterDescriptorImpl]

'single' @ [147:37] ==> public inline fun <T> Iterable<StateAndRef<T>>.single(predicate: (StateAndRef<T>) -> Boolean): StateAndRef<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<T>

'predicate' @ [147:46] ==> value-parameter predicate: Predicate<T> defined in net.corda.core.transactions.BaseTransaction.findOutRef[ValueParameterDescriptorImpl]

'test' @ [147:56] ==> public abstract fun test(p0: T): Boolean defined in java.util.function.Predicate[JavaMethodDescriptor]

'it' @ [147:61] ==> value-parameter it: StateAndRef<T> defined in net.corda.core.transactions.BaseTransaction.findOutRef.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [147:64] ==> public final val state: TransactionState<T> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [147:70] ==> public final val data: T defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'findOutRef' @ [151:16] ==> public final fun <T : ContractState> findOutRef(clazz: Class<T>, predicate: Predicate<T>): StateAndRef<T> defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : ContractState> -> T

'java' @ [151:36] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Predicate' @ [151:42] ==> @FunctionalInterface public fun <T : (Any..Any?)> Predicate(function: (T) -> Boolean): Predicate<T> defined in java.util.function[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [151:54] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [151:64] ==> value-parameter it: T defined in net.corda.core.transactions.BaseTransaction.findOutRef.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [154:42] ==> public val <T : Any> BaseTransaction.javaClass: Class<BaseTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> BaseTransaction

'simpleName' @ [154:52] ==> public final val <T : (Any..Any?)> Class<BaseTransaction>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> BaseTransaction

'id' @ [154:68] ==> public abstract val id: SecureHash defined in net.corda.core.transactions.BaseTransaction[PropertyDescriptorImpl]

