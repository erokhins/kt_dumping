'CordaSerializable' @ [31:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [41:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'GENERAL' @ [51:47] ==> enum entry GENERAL defined in net.corda.core.node.services.Vault.UpdateType[FakeCallableDescriptorForObject]

'consumed' @ [54:65] ==> public final val consumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'any' @ [54:74] ==> public inline fun <T> Iterable<StateAndRef<U>>.any(predicate: (StateAndRef<U>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'it' @ [54:80] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.containsType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [54:83] ==> public final val state: TransactionState<U> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [54:89] ==> public final val data: U defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'produced' @ [54:104] ==> public final val produced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'any' @ [54:113] ==> public inline fun <T> Iterable<StateAndRef<U>>.any(predicate: (StateAndRef<U>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'it' @ [54:119] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.containsType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [54:122] ==> public final val state: TransactionState<U> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [54:128] ==> public final val data: U defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'when (status) {
                    StateStatus.UNCONSUMED -> produced.any { clazz.isAssignableFrom(it.state.data.javaClass) }
                    StateStatus.CONSUMED -> consumed.any { clazz.isAssignableFrom(it.state.data.javaClass) }
                    else -> consumed.any { clazz.isAssignableFrom(it.state.data.javaClass) }
                            || produced.any { clazz.isAssignableFrom(it.state.data.javaClass) }
                }' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'status' @ [58:23] ==> value-parameter status: Vault.StateStatus defined in net.corda.core.node.services.Vault.Update.containsType[ValueParameterDescriptorImpl]

'UNCONSUMED' @ [59:33] ==> enum entry UNCONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'produced' @ [59:47] ==> public final val produced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'any' @ [59:56] ==> public inline fun <T> Iterable<StateAndRef<U>>.any(predicate: (StateAndRef<U>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'clazz' @ [59:62] ==> value-parameter clazz: Class<T> defined in net.corda.core.node.services.Vault.Update.containsType[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [59:68] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [59:85] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.containsType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [59:88] ==> public final val state: TransactionState<U> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [59:94] ==> public final val data: U defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'javaClass' @ [59:99] ==> public val <T : Any> U.javaClass: Class<U> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> U

'CONSUMED' @ [60:33] ==> enum entry CONSUMED defined in net.corda.core.node.services.Vault.StateStatus[FakeCallableDescriptorForObject]

'consumed' @ [60:45] ==> public final val consumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'any' @ [60:54] ==> public inline fun <T> Iterable<StateAndRef<U>>.any(predicate: (StateAndRef<U>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'clazz' @ [60:60] ==> value-parameter clazz: Class<T> defined in net.corda.core.node.services.Vault.Update.containsType[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [60:66] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [60:83] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.containsType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [60:86] ==> public final val state: TransactionState<U> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [60:92] ==> public final val data: U defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'javaClass' @ [60:97] ==> public val <T : Any> U.javaClass: Class<U> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> U

'consumed' @ [61:29] ==> public final val consumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'any' @ [61:38] ==> public inline fun <T> Iterable<StateAndRef<U>>.any(predicate: (StateAndRef<U>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'clazz' @ [61:44] ==> value-parameter clazz: Class<T> defined in net.corda.core.node.services.Vault.Update.containsType[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [61:50] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [61:67] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.containsType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [61:70] ==> public final val state: TransactionState<U> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [61:76] ==> public final val data: U defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'javaClass' @ [61:81] ==> public val <T : Any> U.javaClass: Class<U> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> U

'produced' @ [62:32] ==> public final val produced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'any' @ [62:41] ==> public inline fun <T> Iterable<StateAndRef<U>>.any(predicate: (StateAndRef<U>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'clazz' @ [62:47] ==> value-parameter clazz: Class<T> defined in net.corda.core.node.services.Vault.Update.containsType[ValueParameterDescriptorImpl]

'isAssignableFrom' @ [62:53] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'it' @ [62:70] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.containsType.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [62:73] ==> public final val state: TransactionState<U> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'data' @ [62:79] ==> public final val data: U defined in net.corda.core.contracts.TransactionState[PropertyDescriptorImpl]

'javaClass' @ [62:84] ==> public val <T : Any> U.javaClass: Class<U> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> U

'consumed' @ [65:25] ==> public final val consumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'isEmpty' @ [65:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'produced' @ [65:47] ==> public final val produced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'isEmpty' @ [65:56] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'require' @ [74:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rhs' @ [74:21] ==> value-parameter rhs: Vault.Update<U> defined in net.corda.core.node.services.Vault.Update.plus[ValueParameterDescriptorImpl]

'type' @ [74:25] ==> public final val type: Vault.UpdateType defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'type' @ [74:33] ==> public final val type: Vault.UpdateType defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'consumed' @ [75:36] ==> public final val consumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'rhs' @ [75:48] ==> value-parameter rhs: Vault.Update<U> defined in net.corda.core.node.services.Vault.Update.plus[ValueParameterDescriptorImpl]

'consumed' @ [75:52] ==> public final val consumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'produced' @ [75:63] ==> public final val produced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'produced' @ [77:36] ==> public final val produced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'filter' @ [77:45] ==> public inline fun <T> Iterable<StateAndRef<U>>.filter(predicate: (StateAndRef<U>) -> Boolean): List<StateAndRef<U>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'it' @ [77:54] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.plus.<anonymous>[ValueParameterDescriptorImpl]

'rhs' @ [77:61] ==> value-parameter rhs: Vault.Update<U> defined in net.corda.core.node.services.Vault.Update.plus[ValueParameterDescriptorImpl]

'consumed' @ [77:65] ==> public final val consumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'toSet' @ [77:76] ==> public fun <T> Iterable<StateAndRef<U>>.toSet(): Set<StateAndRef<U>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'rhs' @ [77:86] ==> value-parameter rhs: Vault.Update<U> defined in net.corda.core.node.services.Vault.Update.plus[ValueParameterDescriptorImpl]

'produced' @ [77:90] ==> public final val produced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'copy' @ [78:20] ==> public final fun copy(consumed: Set<StateAndRef<U>> = ..., produced: Set<StateAndRef<U>> = ..., flowId: UUID? = ..., type: Vault.UpdateType = ...): Vault.Update<U> defined in net.corda.core.node.services.Vault.Update[SimpleFunctionDescriptorImpl]

'combinedConsumed' @ [78:36] ==> val combinedConsumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update.plus[LocalVariableDescriptor]

'combinedProduced' @ [78:65] ==> val combinedProduced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update.plus[LocalVariableDescriptor]

'StringBuilder' @ [82:22] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'sb' @ [83:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in net.corda.core.node.services.Vault.Update.toString[LocalVariableDescriptor]

'appendln' @ [83:16] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'consumed' @ [83:28] ==> public final val consumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'size' @ [83:37] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'produced' @ [83:55] ==> public final val produced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'size' @ [83:64] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'sb' @ [84:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in net.corda.core.node.services.Vault.Update.toString[LocalVariableDescriptor]

'appendln' @ [84:16] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sb' @ [85:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in net.corda.core.node.services.Vault.Update.toString[LocalVariableDescriptor]

'appendln' @ [85:16] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'consumed' @ [86:13] ==> public final val consumed: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'forEach' @ [86:22] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<U>>.forEach(action: (StateAndRef<U>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'sb' @ [87:17] ==> val sb: StringBuilder /* = StringBuilder */ defined in net.corda.core.node.services.Vault.Update.toString[LocalVariableDescriptor]

'appendln' @ [87:20] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [87:32] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.toString.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [87:35] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'it' @ [87:43] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.toString.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [87:46] ==> public final val state: TransactionState<U> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'sb' @ [89:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in net.corda.core.node.services.Vault.Update.toString[LocalVariableDescriptor]

'appendln' @ [89:16] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sb' @ [90:13] ==> val sb: StringBuilder /* = StringBuilder */ defined in net.corda.core.node.services.Vault.Update.toString[LocalVariableDescriptor]

'appendln' @ [90:16] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'produced' @ [91:13] ==> public final val produced: Set<StateAndRef<U>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'forEach' @ [91:22] ==> @HidesMembers public inline fun <T> Iterable<StateAndRef<U>>.forEach(action: (StateAndRef<U>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<U>

'sb' @ [92:17] ==> val sb: StringBuilder /* = StringBuilder */ defined in net.corda.core.node.services.Vault.Update.toString[LocalVariableDescriptor]

'appendln' @ [92:20] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [92:32] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.toString.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [92:35] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'it' @ [92:43] ==> value-parameter it: StateAndRef<U> defined in net.corda.core.node.services.Vault.Update.toString.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [92:46] ==> public final val state: TransactionState<U> defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'sb' @ [94:20] ==> val sb: StringBuilder /* = StringBuilder */ defined in net.corda.core.node.services.Vault.Update.toString[LocalVariableDescriptor]

'toString' @ [94:23] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'Update' @ [99:24] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[ClassConstructorDescriptorImpl]
Inferred types:
    <U : ContractState> -> ContractState

'emptySet' @ [99:31] ==> public fun <T> emptySet(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'emptySet' @ [99:43] ==> public fun <T> emptySet(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'Vault' @ [99:62] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'GENERAL' @ [99:79] ==> enum entry GENERAL defined in net.corda.core.node.services.Vault.UpdateType[FakeCallableDescriptorForObject]

'Vault' @ [100:30] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'Update' @ [100:36] ==> public constructor Update<U : ContractState>(consumed: Set<StateAndRef<ContractState>>, produced: Set<StateAndRef<ContractState>>, flowId: UUID? = ..., type: Vault.UpdateType = ...) defined in net.corda.core.node.services.Vault.Update[ClassConstructorDescriptorImpl]
Inferred types:
    <U : ContractState> -> ContractState

'emptySet' @ [100:43] ==> public fun <T> emptySet(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'emptySet' @ [100:55] ==> public fun <T> emptySet(): Set<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'Vault' @ [100:75] ==> public companion object defined in net.corda.core.node.services.Vault[FakeCallableDescriptorForObject]

'NOTARY_CHANGE' @ [100:92] ==> enum entry NOTARY_CHANGE defined in net.corda.core.node.services.Vault.UpdateType[FakeCallableDescriptorForObject]

'CordaSerializable' @ [103:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [108:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [126:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [133:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'notifyAll' @ [185:39] ==> public abstract fun notifyAll(txns: Iterable<CoreTransaction>): Unit defined in net.corda.core.node.services.VaultService[SimpleFunctionDescriptorImpl]

'listOf' @ [185:49] ==> public fun <T> listOf(element: CoreTransaction): List<CoreTransaction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CoreTransaction

'tx' @ [185:56] ==> value-parameter tx: CoreTransaction defined in net.corda.core.node.services.VaultService.notify[ValueParameterDescriptorImpl]

'updates' @ [191:16] ==> public abstract val updates: Observable<Vault.Update<ContractState>> defined in net.corda.core.node.services.VaultService[PropertyDescriptorImpl]

'filter' @ [191:24] ==> public final fun filter(p0: (((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> (Boolean..Boolean?)..(((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> (Boolean..Boolean?))?)): (Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>..Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>?) defined in rx.Observable[MyFunctionDescriptor]

'it' @ [191:33] ==> value-parameter it: (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.core.node.services.VaultService.whenConsumed.<anonymous>[ValueParameterDescriptorImpl]

'consumed' @ [191:36] ==> public final val consumed: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[PropertyDescriptorImpl]

'any' @ [191:45] ==> public inline fun <T> Iterable<StateAndRef<ContractState>>.any(predicate: (StateAndRef<ContractState>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'it' @ [191:51] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.core.node.services.VaultService.whenConsumed.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [191:54] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[PropertyDescriptorImpl]

'ref' @ [191:61] ==> value-parameter ref: StateRef defined in net.corda.core.node.services.VaultService.whenConsumed[ValueParameterDescriptorImpl]

'toFuture' @ [191:69] ==> public fun <T> Observable<(Vault.Update<ContractState>..Vault.Update<ContractState>?)>.toFuture(): CordaFuture<(Vault.Update<ContractState>..Vault.Update<ContractState>?)> defined in net.corda.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>..net.corda.core.node.services.Vault.Update<net.corda.core.contracts.ContractState>?)

'Throws' @ [241:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StatesNotAvailableException' @ [241:13] ==> public constructor StatesNotAvailableException(message: String?, cause: Throwable? = ...) defined in net.corda.core.node.services.StatesNotAvailableException[ClassConstructorDescriptorImpl]

'Suspendable' @ [268:5] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'Throws' @ [269:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'StatesNotAvailableException' @ [269:13] ==> public constructor StatesNotAvailableException(message: String?, cause: Throwable? = ...) defined in net.corda.core.node.services.StatesNotAvailableException[ClassConstructorDescriptorImpl]

'FlowException' @ [278:107] ==> public constructor FlowException(message: String?, cause: Throwable?) defined in net.corda.core.flows.FlowException[ClassConstructorDescriptorImpl]

'message' @ [278:121] ==> value-parameter message: String? defined in net.corda.core.node.services.StatesNotAvailableException.<init>[ValueParameterDescriptorImpl]

'cause' @ [278:130] ==> value-parameter cause: Throwable? = ... defined in net.corda.core.node.services.StatesNotAvailableException.<init>[ValueParameterDescriptorImpl]

'message' @ [279:53] ==> public open val message: String? defined in net.corda.core.node.services.StatesNotAvailableException[PropertyDescriptorImpl]

