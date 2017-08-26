'getValue' @ [22:74] ==> public final operator fun getValue(thisRef: Any, property: KProperty<*>): Observable<T> defined in net.corda.client.jfx.model.TrackedDelegate.ObservableDelegate[SimpleFunctionDescriptorImpl]

'NodeMonitorModel' @ [22:85] ==> public constructor NodeMonitorModel() defined in net.corda.client.jfx.model.NodeMonitorModel[ClassConstructorDescriptorImpl]

'vaultUpdates' @ [22:103] ==> public final val vaultUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.client.jfx.model.NodeMonitorModel[PropertyDescriptorImpl]

'vaultUpdates' @ [24:71] ==> private final val vaultUpdates: Observable<Vault.Update<ContractState>> defined in net.corda.client.jfx.model.ContractStateModel[PropertyDescriptorImpl]

'map' @ [24:84] ==> public final fun <R : (Any..Any?)> map(p0: (((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> (Diff<ContractState>..Diff<ContractState>?)..(((Vault.Update<ContractState>..Vault.Update<ContractState>?)) -> (Diff<ContractState>..Diff<ContractState>?))?)): (Observable<(Diff<ContractState>..Diff<ContractState>?)>..Observable<(Diff<ContractState>..Diff<ContractState>?)>?) defined in rx.Observable[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.client.jfx.model.Diff<net.corda.core.contracts.ContractState>..net.corda.client.jfx.model.Diff<net.corda.core.contracts.ContractState>?)

'Diff' @ [25:9] ==> public constructor Diff<out T : ContractState>(added: Collection<StateAndRef<ContractState>>, removed: Collection<StateAndRef<ContractState>>) defined in net.corda.client.jfx.model.Diff[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> ContractState

'it' @ [25:14] ==> value-parameter it: (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.client.jfx.model.ContractStateModel.contractStatesDiff.<anonymous>[ValueParameterDescriptorImpl]

'produced' @ [25:17] ==> public final val produced: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'it' @ [25:27] ==> value-parameter it: (Vault.Update<ContractState>..Vault.Update<ContractState>?) defined in net.corda.client.jfx.model.ContractStateModel.contractStatesDiff.<anonymous>[ValueParameterDescriptorImpl]

'consumed' @ [25:30] ==> public final val consumed: Set<StateAndRef<ContractState>> defined in net.corda.core.node.services.Vault.Update[DeserializedPropertyDescriptor]

'contractStatesDiff' @ [27:64] ==> private final val contractStatesDiff: Observable<Diff<ContractState>> defined in net.corda.client.jfx.model.ContractStateModel[PropertyDescriptorImpl]

'map' @ [27:83] ==> public final fun <R : (Any..Any?)> map(p0: (((Diff<ContractState>..Diff<ContractState>?)) -> (Diff<Cash.State>..Diff<Cash.State>?)..(((Diff<ContractState>..Diff<ContractState>?)) -> (Diff<Cash.State>..Diff<Cash.State>?))?)): (Observable<(Diff<Cash.State>..Diff<Cash.State>?)>..Observable<(Diff<Cash.State>..Diff<Cash.State>?)>?) defined in rx.Observable[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> (net.corda.client.jfx.model.Diff<net.corda.finance.contracts.asset.Cash.State>..net.corda.client.jfx.model.Diff<net.corda.finance.contracts.asset.Cash.State>?)

'Diff' @ [28:9] ==> public constructor Diff<out T : ContractState>(added: Collection<StateAndRef<Cash.State>>, removed: Collection<StateAndRef<Cash.State>>) defined in net.corda.client.jfx.model.Diff[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : ContractState> -> State

'it' @ [28:14] ==> value-parameter it: (Diff<ContractState>..Diff<ContractState>?) defined in net.corda.client.jfx.model.ContractStateModel.cashStatesDiff.<anonymous>[ValueParameterDescriptorImpl]

'added' @ [28:17] ==> public final val added: Collection<StateAndRef<ContractState>> defined in net.corda.client.jfx.model.Diff[PropertyDescriptorImpl]

'filterCashStateAndRefs' @ [28:23] ==> private final fun Collection<StateAndRef<ContractState>>.filterCashStateAndRefs(): List<StateAndRef<Cash.State>> defined in net.corda.client.jfx.model.ContractStateModel.Companion[SimpleFunctionDescriptorImpl]

'it' @ [28:49] ==> value-parameter it: (Diff<ContractState>..Diff<ContractState>?) defined in net.corda.client.jfx.model.ContractStateModel.cashStatesDiff.<anonymous>[ValueParameterDescriptorImpl]

'removed' @ [28:52] ==> public final val removed: Collection<StateAndRef<ContractState>> defined in net.corda.client.jfx.model.Diff[PropertyDescriptorImpl]

'filterCashStateAndRefs' @ [28:60] ==> private final fun Collection<StateAndRef<ContractState>>.filterCashStateAndRefs(): List<StateAndRef<Cash.State>> defined in net.corda.client.jfx.model.ContractStateModel.Companion[SimpleFunctionDescriptorImpl]

'cashStatesDiff' @ [30:63] ==> private final val cashStatesDiff: Observable<Diff<Cash.State>> defined in net.corda.client.jfx.model.ContractStateModel[PropertyDescriptorImpl]

'fold' @ [30:78] ==> public fun <T, R> Observable<Diff<Cash.State>>.fold(accumulator: (ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?), folderFun: ((ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?), Diff<Cash.State>) -> Unit): (ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Diff<State>
    <R> -> (javafx.collections.ObservableList<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>..javafx.collections.ObservableList<(net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)>?)

'observableArrayList' @ [30:97] ==> public open fun <E : (Any..Any?)> observableArrayList(): (ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>..ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)

'list' @ [31:9] ==> value-parameter list: MutableList<StateAndRef<Cash.State>> defined in net.corda.client.jfx.model.ContractStateModel.cashStates.<anonymous>[ValueParameterDescriptorImpl]

'removeIf' @ [31:14] ==> public final fun removeIf(p0: (StateAndRef<Cash.State>) -> Boolean): Boolean defined in kotlin.collections.MutableList[MyFunctionDescriptor]

'it' @ [31:25] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.client.jfx.model.ContractStateModel.cashStates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'statesDiff' @ [31:31] ==> value-parameter statesDiff: Diff<Cash.State> defined in net.corda.client.jfx.model.ContractStateModel.cashStates.<anonymous>[ValueParameterDescriptorImpl]

'removed' @ [31:42] ==> public final val removed: Collection<StateAndRef<Cash.State>> defined in net.corda.client.jfx.model.Diff[PropertyDescriptorImpl]

'list' @ [32:9] ==> value-parameter list: MutableList<StateAndRef<Cash.State>> defined in net.corda.client.jfx.model.ContractStateModel.cashStates.<anonymous>[ValueParameterDescriptorImpl]

'addAll' @ [32:14] ==> public abstract fun addAll(elements: Collection<StateAndRef<Cash.State>>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statesDiff' @ [32:21] ==> value-parameter statesDiff: Diff<Cash.State> defined in net.corda.client.jfx.model.ContractStateModel.cashStates.<anonymous>[ValueParameterDescriptorImpl]

'added' @ [32:32] ==> public final val added: Collection<StateAndRef<Cash.State>> defined in net.corda.client.jfx.model.Diff[PropertyDescriptorImpl]

'cashStates' @ [35:16] ==> public final val cashStates: ObservableList<StateAndRef<Cash.State>> defined in net.corda.client.jfx.model.ContractStateModel[PropertyDescriptorImpl]

'map' @ [35:27] ==> public fun <A, B> ObservableList<out StateAndRef<Cash.State>>.map(cached: Boolean = ..., function: (StateAndRef<Cash.State>) -> Amount<Issued<Currency>>): ObservableList<Amount<Issued<Currency>>> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> StateAndRef<State>
    <B> -> Amount<Issued<Currency>>

'it' @ [35:33] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.client.jfx.model.ContractStateModel.cash.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [35:36] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [35:42] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [35:47] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'this' @ [39:20] ==> <this> defined in net.corda.client.jfx.model.ContractStateModel.Companion.filterCashStateAndRefs[ReceiverParameterDescriptorImpl]

'map' @ [39:25] ==> public inline fun <T, R> Iterable<StateAndRef<ContractState>>.map(transform: (StateAndRef<ContractState>) -> StateAndRef<Cash.State>?): List<StateAndRef<Cash.State>?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>
    <R> -> StateAndRef<State>?

'Suppress' @ [40:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (stateAndRef.state.data is Cash.State) {
                    // Kotlin doesn't unify here for some reason
                    stateAndRef as StateAndRef<Cash.State>
                } else {
                    null
                }' @ [41:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StateAndRef<Cash.State>?, elseBranch: StateAndRef<Cash.State>?): StateAndRef<Cash.State>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StateAndRef<State>?

'stateAndRef' @ [41:21] ==> value-parameter stateAndRef: StateAndRef<ContractState> defined in net.corda.client.jfx.model.ContractStateModel.Companion.filterCashStateAndRefs.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [41:33] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [41:39] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'stateAndRef' @ [43:21] ==> value-parameter stateAndRef: StateAndRef<ContractState> defined in net.corda.client.jfx.model.ContractStateModel.Companion.filterCashStateAndRefs.<anonymous>[ValueParameterDescriptorImpl]

'filterNotNull' @ [47:15] ==> public fun <T : Any> Iterable<StateAndRef<Cash.State>?>.filterNotNull(): List<StateAndRef<Cash.State>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> StateAndRef<State>

