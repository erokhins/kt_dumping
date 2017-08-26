'BaseTransaction' @ [12:34] ==> public constructor BaseTransaction() defined in net.corda.core.transactions.BaseTransaction[ClassConstructorDescriptorImpl]

'BaseTransaction' @ [18:34] ==> public constructor BaseTransaction() defined in net.corda.core.transactions.BaseTransaction[ClassConstructorDescriptorImpl]

'super' @ [22:9] ==> <this> defined in net.corda.core.transactions.FullTransaction[LazyClassReceiverParameterDescriptor]

'checkBaseInvariants' @ [22:15] ==> protected open fun checkBaseInvariants(): Unit defined in net.corda.core.transactions.BaseTransaction[SimpleFunctionDescriptorImpl]

'checkInputsHaveSameNotary' @ [23:9] ==> private final fun checkInputsHaveSameNotary(): Unit defined in net.corda.core.transactions.FullTransaction[SimpleFunctionDescriptorImpl]

'inputs' @ [27:13] ==> public abstract val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.FullTransaction[PropertyDescriptorImpl]

'isEmpty' @ [27:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'inputs' @ [28:29] ==> public abstract val inputs: List<StateAndRef<ContractState>> defined in net.corda.core.transactions.FullTransaction[PropertyDescriptorImpl]

'map' @ [28:36] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> Party): List<Party> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> Party

'it' @ [28:42] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.transactions.FullTransaction.checkInputsHaveSameNotary.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [28:45] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'notary' @ [28:51] ==> public final val notary: Party defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'toHashSet' @ [28:60] ==> public fun <T> Iterable<Party>.toHashSet(): HashSet<Party> /* = HashSet<Party> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'check' @ [29:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'inputNotaries' @ [29:15] ==> val inputNotaries: HashSet<Party> /* = HashSet<Party> */ defined in net.corda.core.transactions.FullTransaction.checkInputsHaveSameNotary[LocalVariableDescriptor]

'size' @ [29:29] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'check' @ [30:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'inputNotaries' @ [30:15] ==> val inputNotaries: HashSet<Party> /* = HashSet<Party> */ defined in net.corda.core.transactions.FullTransaction.checkInputsHaveSameNotary[LocalVariableDescriptor]

'single' @ [30:29] ==> public fun <T> Iterable<Party>.single(): Party defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'notary' @ [30:41] ==> public abstract val notary: Party? defined in net.corda.core.transactions.FullTransaction[PropertyDescriptorImpl]

