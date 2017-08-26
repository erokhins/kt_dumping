'transaction' @ [21:14] ==> public final val transaction: SignedTransaction defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[PropertyDescriptorImpl]

'id' @ [21:26] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'InputResolution' @ [26:66] ==> private constructor InputResolution() defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.InputResolution[ClassConstructorDescriptorImpl]

'InputResolution' @ [27:76] ==> private constructor InputResolution() defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.InputResolution[ClassConstructorDescriptorImpl]

'stateAndRef' @ [28:53] ==> public final val stateAndRef: StateAndRef<ContractState> defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.InputResolution.Resolved[PropertyDescriptorImpl]

'ref' @ [28:65] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'PartiallyResolvedTransaction' @ [36:13] ==> public constructor PartiallyResolvedTransaction(transaction: SignedTransaction, inputs: List<ObservableValue<PartiallyResolvedTransaction.InputResolution>>) defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[ClassConstructorDescriptorImpl]

'transaction' @ [37:31] ==> value-parameter transaction: SignedTransaction defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.Companion.fromSignedTransaction[ValueParameterDescriptorImpl]

'transaction' @ [38:26] ==> value-parameter transaction: SignedTransaction defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.Companion.fromSignedTransaction[ValueParameterDescriptorImpl]

'tx' @ [38:38] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'inputs' @ [38:41] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'map' @ [38:48] ==> public inline fun <T, R> Iterable<StateRef>.map(transform: (StateRef) -> (MonadicBinding<PartiallyResolvedTransaction.InputResolution>..MonadicBinding<PartiallyResolvedTransaction.InputResolution>?)): List<(MonadicBinding<PartiallyResolvedTransaction.InputResolution>..MonadicBinding<PartiallyResolvedTransaction.InputResolution>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef
    <R> -> (org.fxmisc.easybind.monadic.MonadicBinding<net.corda.client.jfx.model.PartiallyResolvedTransaction.InputResolution>..org.fxmisc.easybind.monadic.MonadicBinding<net.corda.client.jfx.model.PartiallyResolvedTransaction.InputResolution>?)

'map' @ [39:30] ==> public final fun <T : (Any..Any?), U : (Any..Any?)> map(p0: (ObservableValue<(SignedTransaction..SignedTransaction?)>..ObservableValue<(SignedTransaction..SignedTransaction?)>?), p1: (((SignedTransaction..SignedTransaction?)) -> (PartiallyResolvedTransaction.InputResolution..PartiallyResolvedTransaction.InputResolution?)..(((SignedTransaction..SignedTransaction?)) -> (PartiallyResolvedTransaction.InputResolution..PartiallyResolvedTransaction.InputResolution?))?)): (MonadicBinding<(PartiallyResolvedTransaction.InputResolution..PartiallyResolvedTransaction.InputResolution?)>..MonadicBinding<(PartiallyResolvedTransaction.InputResolution..PartiallyResolvedTransaction.InputResolution?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction
    <U : (Any..Any?)> -> InputResolution

'transactions' @ [39:34] ==> value-parameter transactions: ObservableMap<SecureHash, SignedTransaction> defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.Companion.fromSignedTransaction[ValueParameterDescriptorImpl]

'getObservableValue' @ [39:47] ==> public fun <K, V> ObservableMap<SecureHash, SignedTransaction>.getObservableValue(key: SecureHash): ObservableValue<SignedTransaction?> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> SecureHash
    <V> -> SignedTransaction

'stateRef' @ [39:66] ==> value-parameter stateRef: StateRef defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.Companion.fromSignedTransaction.<anonymous>[ValueParameterDescriptorImpl]

'txhash' @ [39:75] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'if (it == null) {
                            InputResolution.Unresolved(stateRef)
                        } else {
                            InputResolution.Resolved(it.tx.outRef(stateRef.index))
                        }' @ [40:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PartiallyResolvedTransaction.InputResolution, elseBranch: PartiallyResolvedTransaction.InputResolution): PartiallyResolvedTransaction.InputResolution[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InputResolution

'it' @ [40:29] ==> value-parameter it: (SignedTransaction..SignedTransaction?) defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.Companion.fromSignedTransaction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Unresolved' @ [41:45] ==> public constructor Unresolved(stateRef: StateRef) defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.InputResolution.Unresolved[ClassConstructorDescriptorImpl]

'stateRef' @ [41:56] ==> value-parameter stateRef: StateRef defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.Companion.fromSignedTransaction.<anonymous>[ValueParameterDescriptorImpl]

'Resolved' @ [43:45] ==> public constructor Resolved(stateAndRef: StateAndRef<ContractState>) defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.InputResolution.Resolved[ClassConstructorDescriptorImpl]

'it' @ [43:54] ==> value-parameter it: (SignedTransaction..SignedTransaction?) defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.Companion.fromSignedTransaction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tx' @ [43:57] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outRef' @ [43:60] ==> public final fun <T : ContractState> outRef(index: Int): StateAndRef<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : ContractState> -> ContractState

'stateRef' @ [43:67] ==> value-parameter stateRef: StateRef defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.Companion.fromSignedTransaction.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [43:76] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'observable' @ [55:33] ==> public inline fun <reified M : Any, T> observable(noinline observableProperty: (NodeMonitorModel) -> Observable<SignedTransaction>): TrackedDelegate.ObservableDelegate<NodeMonitorModel, SignedTransaction> defined in net.corda.client.jfx.model[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified M : Any> -> NodeMonitorModel
    <T> -> SignedTransaction

'NodeMonitorModel' @ [55:44] ==> public constructor NodeMonitorModel() defined in net.corda.client.jfx.model.NodeMonitorModel[ClassConstructorDescriptorImpl]

'transactions' @ [56:41] ==> private final val transactions: Observable<SignedTransaction> defined in net.corda.client.jfx.model.TransactionDataModel[PropertyDescriptorImpl]

'recordInSequence' @ [56:54] ==> public fun <A> Observable<SignedTransaction>.recordInSequence(): ObservableList<SignedTransaction> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> SignedTransaction

'collectedTransactions' @ [57:34] ==> private final val collectedTransactions: ObservableList<SignedTransaction> defined in net.corda.client.jfx.model.TransactionDataModel[PropertyDescriptorImpl]

'associateBy' @ [57:56] ==> public fun <K, A> ObservableList<out SignedTransaction>.associateBy(toKey: (SignedTransaction) -> SecureHash): ObservableMap<SecureHash, SignedTransaction> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <K> -> SecureHash
    <A> -> SignedTransaction

'collectedTransactions' @ [59:41] ==> private final val collectedTransactions: ObservableList<SignedTransaction> defined in net.corda.client.jfx.model.TransactionDataModel[PropertyDescriptorImpl]

'map' @ [59:63] ==> public fun <A, B> ObservableList<out SignedTransaction>.map(cached: Boolean = ..., function: (SignedTransaction) -> PartiallyResolvedTransaction): ObservableList<PartiallyResolvedTransaction> defined in net.corda.client.jfx.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> SignedTransaction
    <B> -> PartiallyResolvedTransaction

'PartiallyResolvedTransaction' @ [60:9] ==> public companion object defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[FakeCallableDescriptorForObject]

'fromSignedTransaction' @ [60:38] ==> public final fun fromSignedTransaction(transaction: SignedTransaction, transactions: ObservableMap<SecureHash, SignedTransaction>): PartiallyResolvedTransaction defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.Companion[SimpleFunctionDescriptorImpl]

'it' @ [60:60] ==> value-parameter it: SignedTransaction defined in net.corda.client.jfx.model.TransactionDataModel.partiallyResolvedTransactions.<anonymous>[ValueParameterDescriptorImpl]

'transactionMap' @ [60:64] ==> private final val transactionMap: ObservableMap<SecureHash, SignedTransaction> defined in net.corda.client.jfx.model.TransactionDataModel[PropertyDescriptorImpl]

