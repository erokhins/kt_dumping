'CordaView' @ [46:27] ==> public constructor CordaView(title: String? = ...) defined in net.corda.explorer.model.CordaView[ClassConstructorDescriptorImpl]

'fxml' @ [47:26] ==> public final fun <T : Node> fxml(location: String?, hasControllerAttribute: Boolean): ReadOnlyProperty<UIComponent, BorderPane> defined in net.corda.explorer.views.TransactionViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> BorderPane

'EXCHANGE' @ [48:41] ==> enum entry EXCHANGE defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'fxid' @ [50:41] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TableView<TransactionViewer.Transaction>> defined in net.corda.explorer.views.TransactionViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TableView<Transaction>

'fxid' @ [51:46] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Label> defined in net.corda.explorer.views.TransactionViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Label

'observableListReadOnly' @ [53:33] ==> public inline fun <reified M : Any, T> observableListReadOnly(noinline observableListProperty: (TransactionDataModel) -> ObservableList<out PartiallyResolvedTransaction>): TrackedDelegate.ObservableListReadOnlyDelegate<TransactionDataModel, PartiallyResolvedTransaction> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> TransactionDataModel
    <T> -> PartiallyResolvedTransaction

'TransactionDataModel' @ [53:56] ==> public constructor TransactionDataModel() defined in net.corda.client.jfx.model.TransactionDataModel[DeserializedClassConstructorDescriptor]

'observableValue' @ [54:38] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (ReportingCurrencyModel) -> ObservableValue<Pair<Currency, (Amount<Currency>) -> Amount<Currency>>>): TrackedDelegate.ObservableValueDelegate<ReportingCurrencyModel, Pair<Currency, (Amount<Currency>) -> Amount<Currency>>> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> ReportingCurrencyModel
    <T> -> Pair<Currency, Function1<Amount<Currency>, Amount<Currency>>>

'ReportingCurrencyModel' @ [54:54] ==> public constructor ReportingCurrencyModel() defined in net.corda.explorer.model.ReportingCurrencyModel[ClassConstructorDescriptorImpl]

'observableValue' @ [55:38] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (ReportingCurrencyModel) -> ObservableValue<(Currency..Currency?)>): TrackedDelegate.ObservableValueDelegate<ReportingCurrencyModel, (Currency..Currency?)> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> ReportingCurrencyModel
    <T> -> (java.util.Currency..java.util.Currency?)

'ReportingCurrencyModel' @ [55:54] ==> public constructor ReportingCurrencyModel() defined in net.corda.explorer.model.ReportingCurrencyModel[ClassConstructorDescriptorImpl]

'observableValue' @ [56:31] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (NetworkIdentityModel) -> ObservableValue<NodeInfo?>): TrackedDelegate.ObservableValueDelegate<NetworkIdentityModel, NodeInfo?> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> NetworkIdentityModel
    <T> -> NodeInfo?

'NetworkIdentityModel' @ [56:47] ==> public constructor NetworkIdentityModel() defined in net.corda.client.jfx.model.NetworkIdentityModel[DeserializedClassConstructorDescriptor]

'listOf' @ [58:28] ==> public fun <T> listOf(element: CordaWidget): List<CordaWidget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaWidget

'CordaWidget' @ [58:35] ==> public constructor CordaWidget(name: String, node: Node, icon: FontAwesomeIcon? = ...) defined in net.corda.explorer.model.CordaWidget[ClassConstructorDescriptorImpl]

'title' @ [58:47] ==> public final var title: String defined in net.corda.explorer.views.TransactionViewer[DeserializedPropertyDescriptor]

'TransactionWidget' @ [58:54] ==> public constructor TransactionWidget() defined in net.corda.explorer.views.TransactionViewer.TransactionWidget[ClassConstructorDescriptorImpl]

'icon' @ [58:75] ==> public open val icon: FontAwesomeIcon defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'observable' @ [58:82] ==> public fun <T> List<CordaWidget>.observable(): ObservableList<CordaWidget> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaWidget

'txIdToScroll' @ [82:9] ==> public final var txIdToScroll: SecureHash? defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'let' @ [82:23] ==> @InlineOnly public inline fun <T, R> SecureHash.let(block: (SecureHash) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash
    <R> -> Unit

'scrollPosition' @ [83:13] ==> private final var scrollPosition: Int defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'transactionViewTable' @ [83:30] ==> private final val transactionViewTable: TableView<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'items' @ [83:51] ==> public final var <S : (Any..Any?)> TableView<TransactionViewer.Transaction>.items: (ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>..ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction

'indexOfFirst' @ [83:57] ==> public inline fun <T> List<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>.indexOfFirst(predicate: ((TransactionViewer.Transaction..TransactionViewer.Transaction?)) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.explorer.views.TransactionViewer.Transaction..net.corda.explorer.views.TransactionViewer.Transaction?)

'it' @ [83:72] ==> value-parameter it: (TransactionViewer.Transaction..TransactionViewer.Transaction?) defined in net.corda.explorer.views.TransactionViewer.onDock.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [83:75] ==> public final val id: SecureHash defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'txIdToScroll' @ [83:81] ==> public final var txIdToScroll: SecureHash? defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'scrollPosition' @ [84:17] ==> private final var scrollPosition: Int defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'expander' @ [85:17] ==> private final lateinit var expander: ExpanderColumn<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'toggleExpanded' @ [85:26] ==> public final fun toggleExpanded(index: Int): Unit defined in tornadofx.ExpanderColumn[DeserializedSimpleFunctionDescriptor]

'scrollPosition' @ [85:41] ==> private final var scrollPosition: Int defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'transactionViewTable' @ [86:26] ==> private final val transactionViewTable: TableView<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'items' @ [86:47] ==> public final var <S : (Any..Any?)> TableView<TransactionViewer.Transaction>.items: (ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>..ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction

'scrollPosition' @ [86:53] ==> private final var scrollPosition: Int defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'transactionViewTable' @ [87:17] ==> private final val transactionViewTable: TableView<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'scrollTo' @ [87:38] ==> public open fun scrollTo(p0: (TransactionViewer.Transaction..TransactionViewer.Transaction?)): Unit defined in javafx.scene.control.TableView[JavaMethodDescriptor]

'tx' @ [87:47] ==> val tx: (TransactionViewer.Transaction..TransactionViewer.Transaction?) defined in net.corda.explorer.views.TransactionViewer.onDock.<anonymous>[LocalVariableDescriptor]

'scrollPosition' @ [93:13] ==> private final var scrollPosition: Int defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'expander' @ [94:30] ==> private final lateinit var expander: ExpanderColumn<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'getExpandedProperty' @ [94:39] ==> public final fun getExpandedProperty(item: TransactionViewer.Transaction): BooleanProperty defined in tornadofx.ExpanderColumn[DeserializedSimpleFunctionDescriptor]

'transactionViewTable' @ [94:59] ==> private final val transactionViewTable: TableView<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'items' @ [94:80] ==> public final var <S : (Any..Any?)> TableView<TransactionViewer.Transaction>.items: (ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>..ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction

'scrollPosition' @ [94:86] ==> private final var scrollPosition: Int defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'isExpanded' @ [95:17] ==> val isExpanded: BooleanProperty defined in net.corda.explorer.views.TransactionViewer.onUndock[LocalVariableDescriptor]

'value' @ [95:28] ==> public final var BooleanProperty.value: (Boolean..Boolean?)[MyPropertyDescriptor]

'expander' @ [95:35] ==> private final lateinit var expander: ExpanderColumn<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'toggleExpanded' @ [95:44] ==> public final fun toggleExpanded(index: Int): Unit defined in tornadofx.ExpanderColumn[DeserializedSimpleFunctionDescriptor]

'scrollPosition' @ [95:59] ==> private final var scrollPosition: Int defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'scrollPosition' @ [96:13] ==> private final var scrollPosition: Int defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'txIdToScroll' @ [98:9] ==> public final var txIdToScroll: SecureHash? defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'transactions' @ [105:28] ==> private final val transactions: ObservableList<out PartiallyResolvedTransaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'map' @ [105:41] ==> public fun <A, B> ObservableList<out PartiallyResolvedTransaction>.map(cached: Boolean = ..., function: (PartiallyResolvedTransaction) -> TransactionViewer.Transaction): ObservableList<TransactionViewer.Transaction> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> PartiallyResolvedTransaction
    <B> -> Transaction

'it' @ [106:28] ==> value-parameter it: PartiallyResolvedTransaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'inputs' @ [106:31] ==> public final val inputs: List<ObservableValue<PartiallyResolvedTransaction.InputResolution>> defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[DeserializedPropertyDescriptor]

'sequence' @ [106:38] ==> public fun <A> Collection<ObservableValue<out PartiallyResolvedTransaction.InputResolution>>.sequence(): ObservableList<PartiallyResolvedTransaction.InputResolution> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> InputResolution

'map' @ [107:22] ==> public fun <A, B> ObservableList<out PartiallyResolvedTransaction.InputResolution>.map(cached: Boolean = ..., function: (PartiallyResolvedTransaction.InputResolution) -> PartiallyResolvedTransaction.InputResolution.Resolved?): ObservableList<PartiallyResolvedTransaction.InputResolution.Resolved?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> InputResolution
    <B> -> Resolved?

'it' @ [107:28] ==> value-parameter it: PartiallyResolvedTransaction.InputResolution defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filterNotNull' @ [108:22] ==> public fun <A> ObservableList<out PartiallyResolvedTransaction.InputResolution.Resolved?>.filterNotNull(): ObservableList<PartiallyResolvedTransaction.InputResolution.Resolved> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Resolved

'map' @ [109:22] ==> public fun <A, B> ObservableList<out PartiallyResolvedTransaction.InputResolution.Resolved>.map(cached: Boolean = ..., function: (PartiallyResolvedTransaction.InputResolution.Resolved) -> StateAndRef<ContractState>): ObservableList<StateAndRef<ContractState>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Resolved
    <B> -> StateAndRef<ContractState>

'it' @ [109:28] ==> value-parameter it: PartiallyResolvedTransaction.InputResolution.Resolved defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stateAndRef' @ [109:31] ==> public final val stateAndRef: StateAndRef<ContractState> defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.InputResolution.Resolved[DeserializedPropertyDescriptor]

'it' @ [110:30] ==> value-parameter it: PartiallyResolvedTransaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'inputs' @ [110:33] ==> public final val inputs: List<ObservableValue<PartiallyResolvedTransaction.InputResolution>> defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[DeserializedPropertyDescriptor]

'sequence' @ [110:40] ==> public fun <A> Collection<ObservableValue<out PartiallyResolvedTransaction.InputResolution>>.sequence(): ObservableList<PartiallyResolvedTransaction.InputResolution> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> InputResolution

'map' @ [111:22] ==> public fun <A, B> ObservableList<out PartiallyResolvedTransaction.InputResolution>.map(cached: Boolean = ..., function: (PartiallyResolvedTransaction.InputResolution) -> PartiallyResolvedTransaction.InputResolution.Unresolved?): ObservableList<PartiallyResolvedTransaction.InputResolution.Unresolved?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> InputResolution
    <B> -> Unresolved?

'it' @ [111:28] ==> value-parameter it: PartiallyResolvedTransaction.InputResolution defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filterNotNull' @ [112:22] ==> public fun <A> ObservableList<out PartiallyResolvedTransaction.InputResolution.Unresolved?>.filterNotNull(): ObservableList<PartiallyResolvedTransaction.InputResolution.Unresolved> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unresolved

'map' @ [113:22] ==> public fun <A, B> ObservableList<out PartiallyResolvedTransaction.InputResolution.Unresolved>.map(cached: Boolean = ..., function: (PartiallyResolvedTransaction.InputResolution.Unresolved) -> StateRef): ObservableList<StateRef> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Unresolved
    <B> -> StateRef

'it' @ [113:28] ==> value-parameter it: PartiallyResolvedTransaction.InputResolution.Unresolved defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [113:31] ==> public open val stateRef: StateRef defined in net.corda.client.jfx.model.PartiallyResolvedTransaction.InputResolution.Unresolved[DeserializedPropertyDescriptor]

'it' @ [114:27] ==> value-parameter it: PartiallyResolvedTransaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'transaction' @ [114:30] ==> public final val transaction: SignedTransaction defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[DeserializedPropertyDescriptor]

'tx' @ [114:42] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputs' @ [114:45] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'mapIndexed' @ [115:22] ==> public inline fun <T, R> Iterable<TransactionState<ContractState>>.mapIndexed(transform: (index: Int, TransactionState<ContractState>) -> StateAndRef<ContractState>): List<StateAndRef<ContractState>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionState<ContractState>
    <R> -> StateAndRef<ContractState>

'StateRef' @ [116:40] ==> public constructor StateRef(txhash: SecureHash, index: Int) defined in net.corda.core.contracts.StateRef[DeserializedClassConstructorDescriptor]

'it' @ [116:49] ==> value-parameter it: PartiallyResolvedTransaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [116:52] ==> public final val id: SecureHash defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[DeserializedPropertyDescriptor]

'index' @ [116:56] ==> value-parameter index: Int defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'StateAndRef' @ [117:25] ==> public constructor StateAndRef<out T : ContractState>(state: TransactionState<ContractState>, ref: StateRef) defined in net.corda.core.contracts.StateAndRef[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T : ContractState> -> ContractState

'transactionState' @ [117:37] ==> value-parameter transactionState: TransactionState<ContractState> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stateRef' @ [117:55] ==> val stateRef: StateRef defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'observable' @ [118:23] ==> public fun <T> List<StateAndRef<ContractState>>.observable(): ObservableList<StateAndRef<ContractState>> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'Transaction' @ [119:13] ==> public constructor Transaction(tx: PartiallyResolvedTransaction, id: SecureHash, inputs: TransactionViewer.Inputs, outputs: ObservableList<StateAndRef<ContractState>>, inputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, outputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, commandTypes: List<Class<CommandData>>, totalValueEquiv: ObservableValue<AmountDiff<Currency>>) defined in net.corda.explorer.views.TransactionViewer.Transaction[ClassConstructorDescriptorImpl]

'it' @ [120:26] ==> value-parameter it: PartiallyResolvedTransaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [121:26] ==> value-parameter it: PartiallyResolvedTransaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [121:29] ==> public final val id: SecureHash defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[DeserializedPropertyDescriptor]

'Inputs' @ [122:30] ==> public constructor Inputs(resolved: ObservableList<StateAndRef<ContractState>>, unresolved: ObservableList<StateRef>) defined in net.corda.explorer.views.TransactionViewer.Inputs[ClassConstructorDescriptorImpl]

'resolved' @ [122:37] ==> val resolved: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'unresolved' @ [122:47] ==> val unresolved: ObservableList<StateRef> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'outputs' @ [123:31] ==> val outputs: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'resolved' @ [124:36] ==> val resolved: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'getParties' @ [124:45] ==> private final fun ObservableList<StateAndRef<ContractState>>.getParties(): ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'outputs' @ [125:37] ==> val outputs: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'getParties' @ [125:45] ==> private final fun ObservableList<StateAndRef<ContractState>>.getParties(): ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'it' @ [126:36] ==> value-parameter it: PartiallyResolvedTransaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'transaction' @ [126:39] ==> public final val transaction: SignedTransaction defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[DeserializedPropertyDescriptor]

'tx' @ [126:51] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'commands' @ [126:54] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'map' @ [126:63] ==> public inline fun <T, R> Iterable<Command<*>>.map(transform: (Command<*>) -> Class<CommandData>): List<Class<CommandData>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Command<*>
    <R> -> Class<CommandData>

'it' @ [126:69] ==> value-parameter it: Command<*> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [126:72] ==> public final val value: CommandData defined in net.corda.core.contracts.Command[DeserializedPropertyDescriptor]

'javaClass' @ [126:78] ==> public val <T : Any> CommandData.javaClass: Class<CommandData> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> CommandData

'calculateTotalEquiv' @ [127:41] ==> private fun calculateTotalEquiv(identity: NodeInfo?, reportingCurrencyExchange: Pair<Currency, (Amount<Currency>) -> Amount<Currency>>, inputs: List<ContractState>, outputs: List<ContractState>): AmountDiff<Currency> defined in net.corda.explorer.views in file TransactionViewer.kt[SimpleFunctionDescriptorImpl]

'lift' @ [127:61] ==> public fun <A, B, C, D, R> ((NodeInfo?, Pair<Currency, (Amount<Currency>) -> Amount<Currency>>, ObservableList<ContractState>, outputs: List<ContractState>) -> AmountDiff<Currency>).lift(arg0: ObservableValue<NodeInfo?>, arg1: ObservableValue<Pair<Currency, (Amount<Currency>) -> Amount<Currency>>>, arg2: ObservableValue<ObservableList<ContractState>>, arg3: ObservableValue<@ParameterName List<ContractState>>): ObservableValue<AmountDiff<Currency>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeInfo?
    <B> -> Pair<Currency, Function1<Amount<Currency>, Amount<Currency>>>
    <C> -> ObservableList<ContractState>
    <D> -> [@kotlin.ParameterName] List<ContractState>
    <R> -> AmountDiff<Currency>

'myIdentity' @ [127:66] ==> private final val myIdentity: ObservableValue<NodeInfo?> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'reportingExchange' @ [128:29] ==> private final val reportingExchange: ObservableValue<Pair<Currency, (Amount<Currency>) -> Amount<Currency>>> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'resolved' @ [129:29] ==> val resolved: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'map' @ [129:38] ==> public fun <A, B> ObservableList<out StateAndRef<ContractState>>.map(cached: Boolean = ..., function: (StateAndRef<ContractState>) -> ContractState): ObservableList<ContractState> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> StateAndRef<ContractState>
    <B> -> ContractState

'it' @ [129:44] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [129:47] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [129:53] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'lift' @ [129:60] ==> public fun <A> ObservableList<ContractState>.lift(): ObservableValue<ObservableList<ContractState>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> ObservableList<ContractState>

'it' @ [130:29] ==> value-parameter it: PartiallyResolvedTransaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'transaction' @ [130:32] ==> public final val transaction: SignedTransaction defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[DeserializedPropertyDescriptor]

'tx' @ [130:44] ==> public final val tx: WireTransaction defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'outputStates' @ [130:47] ==> public final val outputStates: List<ContractState> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'lift' @ [130:60] ==> public fun <A> @ParameterName List<ContractState>.lift(): ObservableValue<@ParameterName List<ContractState>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> [@kotlin.ParameterName] List<ContractState>

'SearchField' @ [134:27] ==> public constructor SearchField<T>(data: ObservableList<TransactionViewer.Transaction>, vararg filterCriteria: Pair<String, (TransactionViewer.Transaction, String) -> Boolean>) defined in net.corda.explorer.views.SearchField[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> Transaction

'transactions' @ [134:39] ==> val transactions: ObservableList<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer.<init>[LocalVariableDescriptor]

'to' @ [135:17] ==> public infix fun <A, B> String.to(that: (TransactionViewer.Transaction, String) -> Boolean): Pair<String, (TransactionViewer.Transaction, String) -> Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function2<Transaction, String, Boolean>

'tx' @ [135:51] ==> value-parameter tx: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [135:54] ==> public final val id: SecureHash defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'contains' @ [135:59] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [135:68] ==> value-parameter s: String defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [136:17] ==> public infix fun <A, B> String.to(that: (TransactionViewer.Transaction, String) -> Boolean): Pair<String, (TransactionViewer.Transaction, String) -> Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function2<Transaction, String, Boolean>

'tx' @ [136:39] ==> value-parameter tx: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'inputs' @ [136:42] ==> public final val inputs: TransactionViewer.Inputs defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'resolved' @ [136:49] ==> public final val resolved: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.Inputs[PropertyDescriptorImpl]

'any' @ [136:58] ==> public inline fun <T> Iterable<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>.any(predicate: ((StateAndRef<ContractState>..StateAndRef<ContractState>?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>..net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>?)

'it' @ [136:64] ==> value-parameter it: (StateAndRef<ContractState>..StateAndRef<ContractState>?) defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [136:67] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [136:73] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'contract' @ [136:78] ==> public abstract val contract: Contract defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'javaClass' @ [136:87] ==> public val <T : Any> Contract.javaClass: Class<Contract> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Contract

'simpleName' @ [136:97] ==> public final val <T : (Any..Any?)> Class<Contract>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Contract

'contains' @ [136:108] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [136:117] ==> value-parameter s: String defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [137:17] ==> public infix fun <A, B> String.to(that: (TransactionViewer.Transaction, String) -> Boolean): Pair<String, (TransactionViewer.Transaction, String) -> Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function2<Transaction, String, Boolean>

'tx' @ [137:40] ==> value-parameter tx: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'outputs' @ [137:43] ==> public final val outputs: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'any' @ [137:51] ==> public inline fun <T> Iterable<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>.any(predicate: ((StateAndRef<ContractState>..StateAndRef<ContractState>?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>..net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>?)

'it' @ [137:57] ==> value-parameter it: (StateAndRef<ContractState>..StateAndRef<ContractState>?) defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [137:60] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [137:66] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'contract' @ [137:71] ==> public abstract val contract: Contract defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'javaClass' @ [137:80] ==> public val <T : Any> Contract.javaClass: Class<Contract> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Contract

'simpleName' @ [137:90] ==> public final val <T : (Any..Any?)> Class<Contract>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Contract

'contains' @ [137:101] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [137:110] ==> value-parameter s: String defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [138:17] ==> public infix fun <A, B> String.to(that: (TransactionViewer.Transaction, String) -> Boolean): Pair<String, (TransactionViewer.Transaction, String) -> Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function2<Transaction, String, Boolean>

'tx' @ [138:45] ==> value-parameter tx: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'inputParties' @ [138:48] ==> public final val inputParties: ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'any' @ [138:61] ==> public inline fun <T> Iterable<(List<ObservableValue<NodeInfo?>>..List<ObservableValue<NodeInfo?>>?)>.any(predicate: ((List<ObservableValue<NodeInfo?>>..List<ObservableValue<NodeInfo?>>?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.List<javafx.beans.value.ObservableValue<net.corda.core.node.NodeInfo?>>..kotlin.collections.List<javafx.beans.value.ObservableValue<net.corda.core.node.NodeInfo?>>?)

'it' @ [138:67] ==> value-parameter it: (List<ObservableValue<NodeInfo?>>..List<ObservableValue<NodeInfo?>>?) defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [138:70] ==> public inline fun <T> Iterable<ObservableValue<NodeInfo?>>.any(predicate: (ObservableValue<NodeInfo?>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObservableValue<NodeInfo?>

'it' @ [138:76] ==> value-parameter it: ObservableValue<NodeInfo?> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [138:79] ==> public final val <T : (Any..Any?)> ObservableValue<NodeInfo?>.value: NodeInfo?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeInfo?

'legalIdentity' @ [138:86] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [138:101] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'commonName' @ [138:107] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'contains' @ [138:119] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [138:128] ==> value-parameter s: String defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [139:17] ==> public infix fun <A, B> String.to(that: (TransactionViewer.Transaction, String) -> Boolean): Pair<String, (TransactionViewer.Transaction, String) -> Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function2<Transaction, String, Boolean>

'tx' @ [139:46] ==> value-parameter tx: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'outputParties' @ [139:49] ==> public final val outputParties: ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'any' @ [139:63] ==> public inline fun <T> Iterable<(List<ObservableValue<NodeInfo?>>..List<ObservableValue<NodeInfo?>>?)>.any(predicate: ((List<ObservableValue<NodeInfo?>>..List<ObservableValue<NodeInfo?>>?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.List<javafx.beans.value.ObservableValue<net.corda.core.node.NodeInfo?>>..kotlin.collections.List<javafx.beans.value.ObservableValue<net.corda.core.node.NodeInfo?>>?)

'it' @ [139:69] ==> value-parameter it: (List<ObservableValue<NodeInfo?>>..List<ObservableValue<NodeInfo?>>?) defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [139:72] ==> public inline fun <T> Iterable<ObservableValue<NodeInfo?>>.any(predicate: (ObservableValue<NodeInfo?>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObservableValue<NodeInfo?>

'it' @ [139:78] ==> value-parameter it: ObservableValue<NodeInfo?> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [139:81] ==> public final val <T : (Any..Any?)> ObservableValue<NodeInfo?>.value: NodeInfo?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeInfo?

'legalIdentity' @ [139:88] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'name' @ [139:103] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'commonName' @ [139:109] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'contains' @ [139:121] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [139:130] ==> value-parameter s: String defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [140:17] ==> public infix fun <A, B> String.to(that: (TransactionViewer.Transaction, String) -> Boolean): Pair<String, (TransactionViewer.Transaction, String) -> Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function2<Transaction, String, Boolean>

'tx' @ [140:46] ==> value-parameter tx: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'commandTypes' @ [140:49] ==> public final val commandTypes: List<Class<CommandData>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'any' @ [140:62] ==> public inline fun <T> Iterable<Class<CommandData>>.any(predicate: (Class<CommandData>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<CommandData>

'it' @ [140:68] ==> value-parameter it: Class<CommandData> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [140:71] ==> public final val <T : (Any..Any?)> Class<CommandData>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CommandData

'contains' @ [140:82] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

's' @ [140:91] ==> value-parameter s: String defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'root' @ [142:9] ==> public open val root: BorderPane defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'top' @ [142:14] ==> public final var BorderPane.top: (Node..Node?)[MyPropertyDescriptor]

'searchField' @ [142:20] ==> val searchField: SearchField<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer.<init>[LocalVariableDescriptor]

'root' @ [142:32] ==> public open val root: Parent defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'transactionViewTable' @ [144:9] ==> private final val transactionViewTable: TableView<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'apply' @ [144:30] ==> @InlineOnly public inline fun <T> TableView<TransactionViewer.Transaction>.apply(block: TableView<TransactionViewer.Transaction>.() -> Unit): TableView<TransactionViewer.Transaction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TableView<Transaction>

'items' @ [145:13] ==> public final var <S : (Any..Any?)> TableView<TransactionViewer.Transaction>.items: (ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>..ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction

'searchField' @ [145:21] ==> val searchField: SearchField<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer.<init>[LocalVariableDescriptor]

'filteredData' @ [145:33] ==> public final val filteredData: ChosenList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'Transaction' @ [146:25] ==> public constructor Transaction(tx: PartiallyResolvedTransaction, id: SecureHash, inputs: TransactionViewer.Inputs, outputs: ObservableList<StateAndRef<ContractState>>, inputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, outputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, commandTypes: List<Class<CommandData>>, totalValueEquiv: ObservableValue<AmountDiff<Currency>>) defined in net.corda.explorer.views.TransactionViewer.Transaction[ClassConstructorDescriptorImpl]

'id' @ [146:38] ==> public final val id: SecureHash defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'column' @ [147:13] ==> public inline fun <reified S, T> TableView<TransactionViewer.Transaction>.column(title: String, prop: KProperty1<TransactionViewer.Transaction, SecureHash>, noinline op: (TableColumn<TransactionViewer.Transaction, SecureHash>.() -> Unit)? = ...): TableColumn<TransactionViewer.Transaction, SecureHash> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S> -> Transaction
    <T> -> SecureHash

'value' @ [147:38] ==> val value: KProperty1<TransactionViewer.Transaction, SecureHash> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'minWidth' @ [148:17] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TableColumn<TransactionViewer.Transaction, SecureHash>.minWidth: Double[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction
    <T : (Any..Any?)> -> SecureHash

'maxWidth' @ [149:17] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TableColumn<TransactionViewer.Transaction, SecureHash>.maxWidth: Double[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction
    <T : (Any..Any?)> -> SecureHash

'setCustomCellFactory' @ [150:15] ==> public fun <S, T> TableColumn<TransactionViewer.Transaction, SecureHash>.setCustomCellFactory(toNode: (SecureHash) -> Node): Unit defined in net.corda.explorer.ui[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> Transaction
    <T> -> SecureHash

'label' @ [151:17] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'it' @ [151:25] ==> value-parameter it: SecureHash defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'graphic' @ [152:21] ==> public final var Label.graphic: (Node..Node?)[MyPropertyDescriptor]

'identicon' @ [152:31] ==> public fun identicon(secureHash: SecureHash, size: Double): ImageView defined in net.corda.explorer.identicon in file IdenticonRenderer.kt[SimpleFunctionDescriptorImpl]

'it' @ [152:41] ==> value-parameter it: SecureHash defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tooltip' @ [153:21] ==> public final var Label.tooltip: (Tooltip..Tooltip?)[MyPropertyDescriptor]

'identiconToolTip' @ [153:31] ==> public fun identiconToolTip(secureHash: SecureHash, description: String? = ...): Tooltip defined in net.corda.explorer.identicon in file IdenticonRenderer.kt[SimpleFunctionDescriptorImpl]

'it' @ [153:48] ==> value-parameter it: SecureHash defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Transaction' @ [156:26] ==> public constructor Transaction(tx: PartiallyResolvedTransaction, id: SecureHash, inputs: TransactionViewer.Inputs, outputs: ObservableList<StateAndRef<ContractState>>, inputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, outputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, commandTypes: List<Class<CommandData>>, totalValueEquiv: ObservableValue<AmountDiff<Currency>>) defined in net.corda.explorer.views.TransactionViewer.Transaction[ClassConstructorDescriptorImpl]

'inputs' @ [156:39] ==> public final val inputs: TransactionViewer.Inputs defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'column' @ [157:13] ==> public inline fun <reified S, T> TableView<TransactionViewer.Transaction>.column(title: String, prop: KProperty1<TransactionViewer.Transaction, TransactionViewer.Inputs>, noinline op: (TableColumn<TransactionViewer.Transaction, TransactionViewer.Inputs>.() -> Unit)? = ...): TableColumn<TransactionViewer.Transaction, TransactionViewer.Inputs> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S> -> Transaction
    <T> -> Inputs

'value1' @ [157:29] ==> val value1: KProperty1<TransactionViewer.Transaction, TransactionViewer.Inputs> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'cellFormat' @ [157:37] ==> public fun <S, T> TableColumn<TransactionViewer.Transaction, TransactionViewer.Inputs>.cellFormat(formatter: TableCell<TransactionViewer.Transaction, TransactionViewer.Inputs>.(TransactionViewer.Inputs) -> Unit): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Transaction
    <T> -> Inputs

'text' @ [158:17] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TableCell<TransactionViewer.Transaction, TransactionViewer.Inputs>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction
    <T : (Any..Any?)> -> Inputs

'it' @ [158:24] ==> value-parameter it: TransactionViewer.Inputs defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolved' @ [158:27] ==> public final val resolved: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.Inputs[PropertyDescriptorImpl]

'toText' @ [158:36] ==> private final fun ObservableList<StateAndRef<ContractState>>.toText(): String defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'!' @ [159:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [159:22] ==> value-parameter it: TransactionViewer.Inputs defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'unresolved' @ [159:25] ==> public final val unresolved: ObservableList<StateRef> defined in net.corda.explorer.views.TransactionViewer.Inputs[PropertyDescriptorImpl]

'isEmpty' @ [159:36] ==> public abstract fun isEmpty(): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'!' @ [160:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'text' @ [160:26] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TableCell<TransactionViewer.Transaction, TransactionViewer.Inputs>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction
    <T : (Any..Any?)> -> Inputs

'isBlank' @ [160:31] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [161:25] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TableCell<TransactionViewer.Transaction, TransactionViewer.Inputs>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction
    <T : (Any..Any?)> -> Inputs

'text' @ [163:21] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TableCell<TransactionViewer.Transaction, TransactionViewer.Inputs>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction
    <T : (Any..Any?)> -> Inputs

'it' @ [163:43] ==> value-parameter it: TransactionViewer.Inputs defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'unresolved' @ [163:46] ==> public final val unresolved: ObservableList<StateRef> defined in net.corda.explorer.views.TransactionViewer.Inputs[PropertyDescriptorImpl]

'size' @ [163:57] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'Transaction' @ [166:26] ==> public constructor Transaction(tx: PartiallyResolvedTransaction, id: SecureHash, inputs: TransactionViewer.Inputs, outputs: ObservableList<StateAndRef<ContractState>>, inputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, outputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, commandTypes: List<Class<CommandData>>, totalValueEquiv: ObservableValue<AmountDiff<Currency>>) defined in net.corda.explorer.views.TransactionViewer.Transaction[ClassConstructorDescriptorImpl]

'outputs' @ [166:39] ==> public final val outputs: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'column' @ [167:13] ==> public inline fun <reified S, T> TableView<TransactionViewer.Transaction>.column(title: String, prop: KProperty1<TransactionViewer.Transaction, ObservableList<StateAndRef<ContractState>>>, noinline op: (TableColumn<TransactionViewer.Transaction, ObservableList<StateAndRef<ContractState>>>.() -> Unit)? = ...): TableColumn<TransactionViewer.Transaction, ObservableList<StateAndRef<ContractState>>> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S> -> Transaction
    <T> -> ObservableList<StateAndRef<ContractState>>

'value2' @ [167:30] ==> val value2: KProperty1<TransactionViewer.Transaction, ObservableList<StateAndRef<ContractState>>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'cellFormat' @ [167:38] ==> public fun <S, T> TableColumn<TransactionViewer.Transaction, ObservableList<StateAndRef<ContractState>>>.cellFormat(formatter: TableCell<TransactionViewer.Transaction, ObservableList<StateAndRef<ContractState>>>.(ObservableList<StateAndRef<ContractState>>) -> Unit): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Transaction
    <T> -> ObservableList<StateAndRef<ContractState>>

'text' @ [167:51] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TableCell<TransactionViewer.Transaction, ObservableList<StateAndRef<ContractState>>>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction
    <T : (Any..Any?)> -> ObservableList<StateAndRef<ContractState>>

'it' @ [167:58] ==> value-parameter it: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toText' @ [167:61] ==> private final fun ObservableList<StateAndRef<ContractState>>.toText(): String defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'Transaction' @ [168:26] ==> public constructor Transaction(tx: PartiallyResolvedTransaction, id: SecureHash, inputs: TransactionViewer.Inputs, outputs: ObservableList<StateAndRef<ContractState>>, inputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, outputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, commandTypes: List<Class<CommandData>>, totalValueEquiv: ObservableValue<AmountDiff<Currency>>) defined in net.corda.explorer.views.TransactionViewer.Transaction[ClassConstructorDescriptorImpl]

'inputParties' @ [168:39] ==> public final val inputParties: ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'column' @ [169:13] ==> public inline fun <reified S, T> TableView<TransactionViewer.Transaction>.column(title: String, prop: KProperty1<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>>, noinline op: (TableColumn<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>>.() -> Unit)? = ...): TableColumn<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S> -> Transaction
    <T> -> ObservableList<List<ObservableValue<NodeInfo?>>>

'value4' @ [169:35] ==> val value4: KProperty1<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'setCustomCellFactory' @ [169:43] ==> public fun <S, T> TableColumn<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>>.setCustomCellFactory(toNode: (ObservableList<List<ObservableValue<NodeInfo?>>>) -> Node): Unit defined in net.corda.explorer.ui[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> Transaction
    <T> -> ObservableList<List<ObservableValue<NodeInfo?>>>

'label' @ [170:17] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'text' @ [171:21] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'it' @ [171:28] ==> value-parameter it: ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'formatJoinPartyNames' @ [171:31] ==> private final fun ObservableList<List<ObservableValue<NodeInfo?>>>.formatJoinPartyNames(separator: String = ..., formatter: Formatter<X500Name>): String defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'PartyNameFormatter' @ [171:64] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'short' @ [171:83] ==> public final val short: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'tooltip' @ [172:21] ==> public fun Node.tooltip(text: String? = ..., graphic: Node? = ..., op: (Tooltip.() -> Unit)? = ...): Tooltip defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'text' @ [173:25] ==> public final var Tooltip.text: (String..String?)[MyPropertyDescriptor]

'it' @ [173:32] ==> value-parameter it: ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'formatJoinPartyNames' @ [173:35] ==> private final fun ObservableList<List<ObservableValue<NodeInfo?>>>.formatJoinPartyNames(separator: String = ..., formatter: Formatter<X500Name>): String defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'PartyNameFormatter' @ [173:62] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'full' @ [173:81] ==> public final val full: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'Transaction' @ [177:26] ==> public constructor Transaction(tx: PartiallyResolvedTransaction, id: SecureHash, inputs: TransactionViewer.Inputs, outputs: ObservableList<StateAndRef<ContractState>>, inputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, outputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, commandTypes: List<Class<CommandData>>, totalValueEquiv: ObservableValue<AmountDiff<Currency>>) defined in net.corda.explorer.views.TransactionViewer.Transaction[ClassConstructorDescriptorImpl]

'outputParties' @ [177:39] ==> public final val outputParties: ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'column' @ [178:13] ==> public inline fun <reified S, T> TableView<TransactionViewer.Transaction>.column(title: String, prop: KProperty1<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>>, noinline op: (TableColumn<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>>.() -> Unit)? = ...): TableColumn<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S> -> Transaction
    <T> -> ObservableList<List<ObservableValue<NodeInfo?>>>

'value3' @ [178:36] ==> val value3: KProperty1<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'setCustomCellFactory' @ [178:44] ==> public fun <S, T> TableColumn<TransactionViewer.Transaction, ObservableList<List<ObservableValue<NodeInfo?>>>>.setCustomCellFactory(toNode: (ObservableList<List<ObservableValue<NodeInfo?>>>) -> Node): Unit defined in net.corda.explorer.ui[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> Transaction
    <T> -> ObservableList<List<ObservableValue<NodeInfo?>>>

'label' @ [179:17] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'text' @ [180:21] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'it' @ [180:28] ==> value-parameter it: ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'formatJoinPartyNames' @ [180:31] ==> private final fun ObservableList<List<ObservableValue<NodeInfo?>>>.formatJoinPartyNames(separator: String = ..., formatter: Formatter<X500Name>): String defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'PartyNameFormatter' @ [180:64] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'short' @ [180:83] ==> public final val short: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'tooltip' @ [181:21] ==> public fun Node.tooltip(text: String? = ..., graphic: Node? = ..., op: (Tooltip.() -> Unit)? = ...): Tooltip defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'text' @ [182:25] ==> public final var Tooltip.text: (String..String?)[MyPropertyDescriptor]

'it' @ [182:32] ==> value-parameter it: ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'formatJoinPartyNames' @ [182:35] ==> private final fun ObservableList<List<ObservableValue<NodeInfo?>>>.formatJoinPartyNames(separator: String = ..., formatter: Formatter<X500Name>): String defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'PartyNameFormatter' @ [182:62] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'full' @ [182:81] ==> public final val full: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'Transaction' @ [186:26] ==> public constructor Transaction(tx: PartiallyResolvedTransaction, id: SecureHash, inputs: TransactionViewer.Inputs, outputs: ObservableList<StateAndRef<ContractState>>, inputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, outputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, commandTypes: List<Class<CommandData>>, totalValueEquiv: ObservableValue<AmountDiff<Currency>>) defined in net.corda.explorer.views.TransactionViewer.Transaction[ClassConstructorDescriptorImpl]

'commandTypes' @ [186:39] ==> public final val commandTypes: List<Class<CommandData>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'column' @ [187:13] ==> public inline fun <reified S, T> TableView<TransactionViewer.Transaction>.column(title: String, prop: KProperty1<TransactionViewer.Transaction, List<Class<CommandData>>>, noinline op: (TableColumn<TransactionViewer.Transaction, List<Class<CommandData>>>.() -> Unit)? = ...): TableColumn<TransactionViewer.Transaction, List<Class<CommandData>>> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S> -> Transaction
    <T> -> List<Class<CommandData>>

'value6' @ [187:36] ==> val value6: KProperty1<TransactionViewer.Transaction, List<Class<CommandData>>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'cellFormat' @ [187:44] ==> public fun <S, T> TableColumn<TransactionViewer.Transaction, List<Class<CommandData>>>.cellFormat(formatter: TableCell<TransactionViewer.Transaction, List<Class<CommandData>>>.(List<Class<CommandData>>) -> Unit): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Transaction
    <T> -> List<Class<CommandData>>

'text' @ [187:57] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TableCell<TransactionViewer.Transaction, List<Class<CommandData>>>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction
    <T : (Any..Any?)> -> List<Class<CommandData>>

'it' @ [187:64] ==> value-parameter it: List<Class<CommandData>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [187:67] ==> public inline fun <T, R> Iterable<Class<CommandData>>.map(transform: (Class<CommandData>) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<CommandData>
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [187:73] ==> value-parameter it: Class<CommandData> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [187:76] ==> public final val <T : (Any..Any?)> Class<CommandData>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CommandData

'joinToString' @ [187:89] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'Transaction' @ [188:26] ==> public constructor Transaction(tx: PartiallyResolvedTransaction, id: SecureHash, inputs: TransactionViewer.Inputs, outputs: ObservableList<StateAndRef<ContractState>>, inputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, outputParties: ObservableList<List<ObservableValue<NodeInfo?>>>, commandTypes: List<Class<CommandData>>, totalValueEquiv: ObservableValue<AmountDiff<Currency>>) defined in net.corda.explorer.views.TransactionViewer.Transaction[ClassConstructorDescriptorImpl]

'totalValueEquiv' @ [188:39] ==> public final val totalValueEquiv: ObservableValue<AmountDiff<Currency>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'column' @ [189:13] ==> @JvmName public inline fun <reified S, T> TableView<TransactionViewer.Transaction>.column(title: String, prop: KProperty1<TransactionViewer.Transaction, ObservableValue<AmountDiff<Currency>>>, noinline op: (TableColumn<TransactionViewer.Transaction, AmountDiff<Currency>>.() -> Unit)? = ...): TableColumn<TransactionViewer.Transaction, AmountDiff<Currency>> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified S> -> Transaction
    <T> -> AmountDiff<Currency>

'value5' @ [189:35] ==> val value5: KProperty1<TransactionViewer.Transaction, ObservableValue<AmountDiff<Currency>>> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[LocalVariableDescriptor]

'cellFormat' @ [189:43] ==> public fun <S, T> TableColumn<TransactionViewer.Transaction, AmountDiff<Currency>>.cellFormat(formatter: TableCell<TransactionViewer.Transaction, AmountDiff<Currency>>.(AmountDiff<Currency>) -> Unit): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Transaction
    <T> -> AmountDiff<Currency>

'text' @ [190:17] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TableCell<TransactionViewer.Transaction, AmountDiff<Currency>>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction
    <T : (Any..Any?)> -> AmountDiff<Currency>

'it' @ [190:27] ==> value-parameter it: AmountDiff<Currency> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'positivity' @ [190:30] ==> public final val positivity: Positivity defined in net.corda.explorer.AmountDiff[PropertyDescriptorImpl]

'sign' @ [190:41] ==> public val Positivity.sign: String defined in net.corda.explorer in file AmountDiff.kt[PropertyDescriptorImpl]

'AmountFormatter' @ [190:48] ==> public object AmountFormatter defined in net.corda.explorer.formatters in file AmountFormatter.kt[FakeCallableDescriptorForObject]

'boring' @ [190:64] ==> public final val boring: Formatter<Amount<Currency>> defined in net.corda.explorer.formatters.AmountFormatter[PropertyDescriptorImpl]

'format' @ [190:71] ==> public abstract fun format(value: Amount<Currency>): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [190:78] ==> value-parameter it: AmountDiff<Currency> defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [190:81] ==> public final val amount: Amount<Currency> defined in net.corda.explorer.AmountDiff[PropertyDescriptorImpl]

'titleProperty' @ [191:17] ==> public final val titleProperty: SimpleStringProperty defined in net.corda.explorer.views.TransactionViewer[DeserializedPropertyDescriptor]

'bind' @ [191:31] ==> public open fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.SimpleStringProperty[JavaMethodDescriptor]

'reportingCurrency' @ [191:36] ==> private final val reportingCurrency: ObservableValue<(Currency..Currency?)> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'map' @ [191:54] ==> public fun <A, B> ObservableValue<out (Currency..Currency?)>.map(function: ((Currency..Currency?)) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (java.util.Currency..java.util.Currency?)
    <B> -> String

'it' @ [191:75] ==> value-parameter it: (Currency..Currency?) defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expander' @ [194:13] ==> private final lateinit var expander: ExpanderColumn<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'rowExpander' @ [194:24] ==> public fun <S> TableView<TransactionViewer.Transaction>.rowExpander(expandOnDoubleClick: Boolean = ..., expandedNodeCallback: RowExpanderPane.(TransactionViewer.Transaction) -> Unit): ExpanderColumn<TransactionViewer.Transaction> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <S> -> Transaction

'add' @ [195:17] ==> public fun EventTarget.add(node: Node): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'ContractStatesView' @ [195:21] ==> public constructor ContractStatesView(transaction: TransactionViewer.Transaction) defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[ClassConstructorDescriptorImpl]

'it' @ [195:40] ==> value-parameter it: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'root' @ [195:44] ==> public open val root: Parent defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[PropertyDescriptorImpl]

'prefHeight' @ [196:17] ==> public final var RowExpanderPane.prefHeight: Double[MyPropertyDescriptor]

'apply' @ [197:15] ==> @InlineOnly public inline fun <T> ExpanderColumn<TransactionViewer.Transaction>.apply(block: ExpanderColumn<TransactionViewer.Transaction>.() -> Unit): ExpanderColumn<TransactionViewer.Transaction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExpanderColumn<Transaction>

'minWidth' @ [200:17] ==> public final var <S> ExpanderColumn<TransactionViewer.Transaction>.minWidth: Double[MyPropertyDescriptor]
Inferred types:
    <S> -> Transaction

'maxWidth' @ [201:17] ==> public final var <S> ExpanderColumn<TransactionViewer.Transaction>.maxWidth: Double[MyPropertyDescriptor]
Inferred types:
    <S> -> Transaction

'matchingTransactionsLabel' @ [204:9] ==> private final val matchingTransactionsLabel: Label defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'textProperty' @ [204:35] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.Label[JavaMethodDescriptor]

'bind' @ [204:50] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'size' @ [204:64] ==> public open fun <E : (Any..Any?)> size(p0: (ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>..ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>?)): (IntegerBinding..IntegerBinding?) defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Transaction

'transactionViewTable' @ [204:69] ==> private final val transactionViewTable: TableView<TransactionViewer.Transaction> defined in net.corda.explorer.views.TransactionViewer[PropertyDescriptorImpl]

'items' @ [204:90] ==> public final var <S : (Any..Any?)> TableView<TransactionViewer.Transaction>.items: (ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>..ObservableList<(TransactionViewer.Transaction..TransactionViewer.Transaction?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> Transaction

'map' @ [204:97] ==> public fun <A, B> ObservableValue<out (Number..Number?)>.map(function: ((Number..Number?)) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (kotlin.Number..kotlin.Number?)
    <B> -> String

'it' @ [205:15] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'if (it == 1) "" else "s"' @ [205:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [205:44] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.views.TransactionViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'flatten' @ [210:16] ==> public fun <T> Iterable<Iterable<ObservableValue<NodeInfo?>>>.flatten(): List<ObservableValue<NodeInfo?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObservableValue<NodeInfo?>

'map' @ [210:26] ==> public inline fun <T, R> Iterable<ObservableValue<NodeInfo?>>.map(transform: (ObservableValue<NodeInfo?>) -> String?): List<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObservableValue<NodeInfo?>
    <R> -> String?

'it' @ [211:13] ==> value-parameter it: ObservableValue<NodeInfo?> defined in net.corda.explorer.views.TransactionViewer.formatJoinPartyNames.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [211:16] ==> public final val <T : (Any..Any?)> ObservableValue<NodeInfo?>.value: NodeInfo?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeInfo?

'legalIdentity' @ [211:23] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'let' @ [211:38] ==> @InlineOnly public inline fun <T, R> Party.let(block: (Party) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> String

'formatter' @ [211:44] ==> value-parameter formatter: Formatter<X500Name> defined in net.corda.explorer.views.TransactionViewer.formatJoinPartyNames[ValueParameterDescriptorImpl]

'format' @ [211:54] ==> public abstract fun format(value: X500Name): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [211:61] ==> value-parameter it: Party defined in net.corda.explorer.views.TransactionViewer.formatJoinPartyNames.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [211:64] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'filterNotNull' @ [212:11] ==> public fun <T : Any> Iterable<String?>.filterNotNull(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'toSet' @ [212:27] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'joinToString' @ [212:35] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'separator' @ [212:48] ==> value-parameter separator: String = ... defined in net.corda.explorer.views.TransactionViewer.formatJoinPartyNames[ValueParameterDescriptorImpl]

'map' @ [215:75] ==> public fun <A, B> ObservableList<out StateAndRef<ContractState>>.map(cached: Boolean = ..., function: (StateAndRef<ContractState>) -> List<ObservableValue<NodeInfo?>>): ObservableList<List<ObservableValue<NodeInfo?>>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> StateAndRef<ContractState>
    <B> -> List<ObservableValue<NodeInfo?>>

'it' @ [215:81] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.getParties.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [215:84] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [215:90] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'participants' @ [215:95] ==> public abstract val participants: List<AbstractParty> defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'map' @ [215:108] ==> public inline fun <T, R> Iterable<AbstractParty>.map(transform: (AbstractParty) -> ObservableValue<NodeInfo?>): List<ObservableValue<NodeInfo?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> ObservableValue<NodeInfo?>

'getModel' @ [215:114] ==> public inline fun <reified M : Any> UIComponent.getModel(): NetworkIdentityModel defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified M : Any> -> NetworkIdentityModel

'lookup' @ [215:147] ==> public final fun lookup(publicKey: PublicKey): ObservableValue<NodeInfo?> defined in net.corda.client.jfx.model.NetworkIdentityModel[DeserializedSimpleFunctionDescriptor]

'it' @ [215:154] ==> value-parameter it: AbstractParty defined in net.corda.explorer.views.TransactionViewer.getParties.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [215:157] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'map' @ [216:71] ==> public fun <A, B> ObservableList<out StateAndRef<ContractState>>.map(cached: Boolean = ..., function: (StateAndRef<ContractState>) -> (String..String?)): ObservableList<(String..String?)> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> StateAndRef<ContractState>
    <B> -> (kotlin.String..kotlin.String?)

'it' @ [216:77] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.toText.<anonymous>[ValueParameterDescriptorImpl]

'contract' @ [216:80] ==> private final fun StateAndRef<ContractState>.contract(): Contract defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'javaClass' @ [216:91] ==> public val <T : Any> Contract.javaClass: Class<Contract> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Contract

'simpleName' @ [216:101] ==> public final val <T : (Any..Any?)> Class<Contract>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Contract

'groupBy' @ [216:114] ==> public inline fun <T, K> Iterable<(String..String?)>.groupBy(keySelector: ((String..String?)) -> (String..String?)): Map<(String..String?), List<(String..String?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <K> -> (kotlin.String..kotlin.String?)

'it' @ [216:124] ==> value-parameter it: (String..String?) defined in net.corda.explorer.views.TransactionViewer.toText.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [216:129] ==> public inline fun <K, V, R> Map<out (String..String?), List<(String..String?)>>.map(transform: (Map.Entry<(String..String?), List<(String..String?)>>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> List<(kotlin.String..kotlin.String?)>
    <R> -> String

'it' @ [216:138] ==> value-parameter it: Map.Entry<(String..String?), List<(String..String?)>> defined in net.corda.explorer.views.TransactionViewer.toText.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [216:141] ==> public abstract val key: (String..String?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [216:149] ==> value-parameter it: Map.Entry<(String..String?), List<(String..String?)>> defined in net.corda.explorer.views.TransactionViewer.toText.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [216:152] ==> public abstract val value: List<(String..String?)> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'size' @ [216:158] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'joinToString' @ [216:168] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'BorderPane' @ [218:39] ==> public constructor BorderPane() defined in javafx.scene.layout.BorderPane[JavaClassConstructorDescriptor]

'observableListReadOnly' @ [219:54] ==> public inline fun <reified M : Any, T> observableListReadOnly(noinline observableListProperty: (TransactionDataModel) -> ObservableList<out PartiallyResolvedTransaction>): TrackedDelegate.ObservableListReadOnlyDelegate<TransactionDataModel, PartiallyResolvedTransaction> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> TransactionDataModel
    <T> -> PartiallyResolvedTransaction

'TransactionDataModel' @ [219:77] ==> public constructor TransactionDataModel() defined in net.corda.client.jfx.model.TransactionDataModel[DeserializedClassConstructorDescriptor]

'right' @ [224:13] ==> public fun BorderPane.right(op: BorderPane.() -> Unit): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'label' @ [225:17] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'SecureHash' @ [226:32] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [226:43] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'graphic' @ [227:21] ==> public final var Label.graphic: (Node..Node?)[MyPropertyDescriptor]

'identicon' @ [227:31] ==> public fun identicon(secureHash: SecureHash, size: Double): ImageView defined in net.corda.explorer.identicon in file IdenticonRenderer.kt[SimpleFunctionDescriptorImpl]

'hash' @ [227:41] ==> val hash: SecureHash.SHA256 defined in net.corda.explorer.views.TransactionViewer.TransactionWidget.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'textProperty' @ [228:21] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.Label[JavaMethodDescriptor]

'bind' @ [228:36] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'size' @ [228:50] ==> public open fun <E : (Any..Any?)> size(p0: (ObservableList<out (PartiallyResolvedTransaction..PartiallyResolvedTransaction?)>..ObservableList<out (PartiallyResolvedTransaction..PartiallyResolvedTransaction?)>?)): (IntegerBinding..IntegerBinding?) defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PartiallyResolvedTransaction

'partiallyResolvedTransactions' @ [228:55] ==> private final val partiallyResolvedTransactions: ObservableList<out PartiallyResolvedTransaction> defined in net.corda.explorer.views.TransactionViewer.TransactionWidget[PropertyDescriptorImpl]

'map' @ [228:86] ==> public fun <A, B> ObservableValue<out (Number..Number?)>.map(function: ((Number..Number?)) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (kotlin.Number..kotlin.Number?)
    <B> -> String

'Number' @ [228:90] ==> public constructor Number() defined in kotlin.Number[DeserializedClassConstructorDescriptor]

'setAlignment' @ [229:32] ==> public open fun setAlignment(p0: (Node..Node?), p1: (Pos..Pos?)): Unit defined in javafx.scene.layout.BorderPane[JavaMethodDescriptor]

'this' @ [229:45] ==> <this> defined in net.corda.explorer.views.TransactionViewer.TransactionWidget.<init>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'BOTTOM_RIGHT' @ [229:55] ==> enum entry BOTTOM_RIGHT defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'Fragment' @ [235:72] ==> public constructor Fragment(title: String? = ...) defined in tornadofx.Fragment[DeserializedClassConstructorDescriptor]

'fxml' @ [236:30] ==> public final fun <T : Node> fxml(location: String?, hasControllerAttribute: Boolean): ReadOnlyProperty<UIComponent, Parent> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Parent

'fxid' @ [237:31] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, ListView<StateAndRef<ContractState>>> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ListView<StateAndRef<ContractState>>

'fxid' @ [238:32] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, ListView<StateAndRef<ContractState>>> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ListView<StateAndRef<ContractState>>

'fxid' @ [239:35] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, VBox> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> VBox

'fxid' @ [240:34] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TitledPane> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TitledPane

'fxid' @ [241:35] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TitledPane> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TitledPane

'fxid' @ [242:39] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TitledPane> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TitledPane

'transaction' @ [245:33] ==> value-parameter transaction: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>[ValueParameterDescriptorImpl]

'tx' @ [245:45] ==> public final val tx: PartiallyResolvedTransaction defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'transaction' @ [245:48] ==> public final val transaction: SignedTransaction defined in net.corda.client.jfx.model.PartiallyResolvedTransaction[DeserializedPropertyDescriptor]

'sigs' @ [245:60] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'map' @ [245:65] ==> public inline fun <T, R> Iterable<TransactionSignature>.map(transform: (TransactionSignature) -> PublicKey): List<PublicKey> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TransactionSignature
    <R> -> PublicKey

'it' @ [245:71] ==> value-parameter it: TransactionSignature defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'by' @ [245:74] ==> public final val by: PublicKey defined in net.corda.core.crypto.TransactionSignature[DeserializedPropertyDescriptor]

'inputPane' @ [247:13] ==> private final val inputPane: TitledPane defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[PropertyDescriptorImpl]

'text' @ [247:23] ==> public final var TitledPane.text: (String..String?)[MyPropertyDescriptor]

'transaction' @ [247:40] ==> value-parameter transaction: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>[ValueParameterDescriptorImpl]

'inputs' @ [247:52] ==> public final val inputs: TransactionViewer.Inputs defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'resolved' @ [247:59] ==> public final val resolved: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.Inputs[PropertyDescriptorImpl]

'count' @ [247:68] ==> @InlineOnly public inline fun <T> Collection<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>..net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>?)

'outputPane' @ [248:13] ==> private final val outputPane: TitledPane defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[PropertyDescriptorImpl]

'text' @ [248:24] ==> public final var TitledPane.text: (String..String?)[MyPropertyDescriptor]

'transaction' @ [248:42] ==> value-parameter transaction: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>[ValueParameterDescriptorImpl]

'outputs' @ [248:54] ==> public final val outputs: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'count' @ [248:62] ==> @InlineOnly public inline fun <T> Collection<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>..net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>?)

'signaturesPane' @ [249:13] ==> private final val signaturesPane: TitledPane defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[PropertyDescriptorImpl]

'text' @ [249:28] ==> public final var TitledPane.text: (String..String?)[MyPropertyDescriptor]

'signatureData' @ [249:50] ==> val signatureData: List<PublicKey> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>[LocalVariableDescriptor]

'count' @ [249:64] ==> @InlineOnly public inline fun <T> Collection<PublicKey>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey

'inputs' @ [251:13] ==> private final val inputs: ListView<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[PropertyDescriptorImpl]

'cellCache' @ [251:20] ==> public final fun <T> ListView<StateAndRef<ContractState>>.cellCache(cachedGraphicProvider: (StateAndRef<ContractState>) -> Node): Unit defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'getCell' @ [251:32] ==> private final fun getCell(contractState: StateAndRef<ContractState>): Node defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[SimpleFunctionDescriptorImpl]

'it' @ [251:40] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'outputs' @ [252:13] ==> private final val outputs: ListView<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[PropertyDescriptorImpl]

'cellCache' @ [252:21] ==> public final fun <T> ListView<StateAndRef<ContractState>>.cellCache(cachedGraphicProvider: (StateAndRef<ContractState>) -> Node): Unit defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateAndRef<ContractState>

'getCell' @ [252:33] ==> private final fun getCell(contractState: StateAndRef<ContractState>): Node defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[SimpleFunctionDescriptorImpl]

'it' @ [252:41] ==> value-parameter it: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'inputs' @ [254:13] ==> private final val inputs: ListView<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[PropertyDescriptorImpl]

'items' @ [254:20] ==> public final var <T : (Any..Any?)> ListView<StateAndRef<ContractState>>.items: (ObservableList<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>..ObservableList<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StateAndRef<ContractState>

'transaction' @ [254:28] ==> value-parameter transaction: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>[ValueParameterDescriptorImpl]

'inputs' @ [254:40] ==> public final val inputs: TransactionViewer.Inputs defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'resolved' @ [254:47] ==> public final val resolved: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.Inputs[PropertyDescriptorImpl]

'outputs' @ [255:13] ==> private final val outputs: ListView<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[PropertyDescriptorImpl]

'items' @ [255:21] ==> public final var <T : (Any..Any?)> ListView<StateAndRef<ContractState>>.items: (ObservableList<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>..ObservableList<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> StateAndRef<ContractState>

'transaction' @ [255:29] ==> value-parameter transaction: TransactionViewer.Transaction defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>[ValueParameterDescriptorImpl]

'outputs' @ [255:41] ==> public final val outputs: ObservableList<StateAndRef<ContractState>> defined in net.corda.explorer.views.TransactionViewer.Transaction[PropertyDescriptorImpl]

'observable' @ [255:49] ==> public fun <T> List<(StateAndRef<ContractState>..StateAndRef<ContractState>?)>.observable(): ObservableList<(StateAndRef<ContractState>..StateAndRef<ContractState>?)> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>..net.corda.core.contracts.StateAndRef<net.corda.core.contracts.ContractState>?)

'signatures' @ [257:13] ==> private final val signatures: VBox defined in net.corda.explorer.views.TransactionViewer.ContractStatesView[PropertyDescriptorImpl]

'children' @ [257:24] ==> public final val VBox.children: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'addAll' @ [257:33] ==> public abstract fun addAll(elements: Collection<(Node..Node?)>): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'signatureData' @ [257:40] ==> val signatureData: List<PublicKey> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>[LocalVariableDescriptor]

'map' @ [257:54] ==> public inline fun <T, R> Iterable<PublicKey>.map(transform: (PublicKey) -> TextField): List<TextField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PublicKey
    <R> -> TextField

'getModel' @ [258:32] ==> public inline fun <reified M : Any> UIComponent.getModel(): NetworkIdentityModel defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified M : Any> -> NetworkIdentityModel

'lookup' @ [258:65] ==> public final fun lookup(publicKey: PublicKey): ObservableValue<NodeInfo?> defined in net.corda.client.jfx.model.NetworkIdentityModel[DeserializedSimpleFunctionDescriptor]

'signature' @ [258:72] ==> value-parameter signature: PublicKey defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'copyableLabel' @ [259:17] ==> public fun EventTarget.copyableLabel(value: ObservableValue<String>? = ..., op: (TextField.() -> Unit)? = ...): TextField defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]

'nodeInfo' @ [259:31] ==> val nodeInfo: ObservableValue<NodeInfo?> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>.<anonymous>[LocalVariableDescriptor]

'map' @ [259:40] ==> public fun <A, B> ObservableValue<out NodeInfo?>.map(function: (NodeInfo?) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeInfo?
    <B> -> String

'signature' @ [259:49] ==> value-parameter signature: PublicKey defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toStringShort' @ [259:59] ==> public fun PublicKey.toStringShort(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'it' @ [259:79] ==> value-parameter it: NodeInfo? defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [259:83] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'let' @ [259:98] ==> @InlineOnly public inline fun <T, R> Party.let(block: (Party) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> String

'PartyNameFormatter' @ [259:104] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'short' @ [259:123] ==> public final val short: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'format' @ [259:129] ==> public abstract fun format(value: X500Name): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [259:136] ==> value-parameter it: Party defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [259:139] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'invoke' @ [264:20] ==> public abstract operator fun invoke(): GridPane defined in kotlin.Function0[FunctionInvokeDescriptor]

'gridpane' @ [265:17] ==> public fun EventTarget.gridpane(op: (GridPane.() -> Unit)? = ...): GridPane defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'padding' @ [266:21] ==> public final var GridPane.padding: (Insets..Insets?)[MyPropertyDescriptor]

'Insets' @ [266:31] ==> public constructor Insets(@NamedArg p0: Double, @NamedArg p1: Double, @NamedArg p2: Double, @NamedArg p3: Double) defined in javafx.geometry.Insets[JavaClassConstructorDescriptor]

'vgap' @ [267:21] ==> public final var GridPane.vgap: Double[MyPropertyDescriptor]

'hgap' @ [268:21] ==> public final var GridPane.hgap: Double[MyPropertyDescriptor]

'row' @ [269:21] ==> public fun GridPane.row(title: String? = ..., op: (Pane.() -> Unit)? = ...): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'label' @ [270:25] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'contractState' @ [270:34] ==> value-parameter contractState: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell[ValueParameterDescriptorImpl]

'contract' @ [270:48] ==> private final fun StateAndRef<ContractState>.contract(): Contract defined in net.corda.explorer.views.TransactionViewer[SimpleFunctionDescriptorImpl]

'javaClass' @ [270:59] ==> public val <T : Any> Contract.javaClass: Class<Contract> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Contract

'simpleName' @ [270:69] ==> public final val <T : (Any..Any?)> Class<Contract>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Contract

'contractState' @ [270:84] ==> value-parameter contractState: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell[ValueParameterDescriptorImpl]

'ref' @ [270:98] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'toString' @ [270:102] ==> public open fun toString(): String defined in net.corda.core.contracts.StateRef[DeserializedSimpleFunctionDescriptor]

'substring' @ [270:113] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'contractState' @ [270:137] ==> value-parameter contractState: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell[ValueParameterDescriptorImpl]

'ref' @ [270:151] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'index' @ [270:155] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'graphic' @ [271:29] ==> public final var Label.graphic: (Node..Node?)[MyPropertyDescriptor]

'identicon' @ [271:39] ==> public fun identicon(secureHash: SecureHash, size: Double): ImageView defined in net.corda.explorer.identicon in file IdenticonRenderer.kt[SimpleFunctionDescriptorImpl]

'contractState' @ [271:49] ==> value-parameter contractState: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell[ValueParameterDescriptorImpl]

'ref' @ [271:63] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [271:67] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'tooltip' @ [272:29] ==> public final var Label.tooltip: (Tooltip..Tooltip?)[MyPropertyDescriptor]

'identiconToolTip' @ [272:39] ==> public fun identiconToolTip(secureHash: SecureHash, description: String? = ...): Tooltip defined in net.corda.explorer.identicon in file IdenticonRenderer.kt[SimpleFunctionDescriptorImpl]

'contractState' @ [272:56] ==> value-parameter contractState: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell[ValueParameterDescriptorImpl]

'ref' @ [272:70] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [272:74] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'gridpaneConstraints' @ [273:29] ==> public fun <T : Node> Label.gridpaneConstraints(op: GridPaneConstraint.() -> Unit): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Label

'columnSpan' @ [273:51] ==> public final var columnSpan: Int? defined in tornadofx.GridPaneConstraint[DeserializedPropertyDescriptor]

'contractState' @ [276:32] ==> value-parameter contractState: StateAndRef<ContractState> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell[ValueParameterDescriptorImpl]

'state' @ [276:46] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [276:52] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'when (data) {
                        is Cash.State -> {
                            row {
                                label("Amount :") { gridpaneConstraints { hAlignment = HPos.RIGHT } }
                                label(AmountFormatter.boring.format(data.amount.withoutIssuer()))
                            }
                            row {
                                label("Issuer :") { gridpaneConstraints { hAlignment = HPos.RIGHT } }
                                val anonymousIssuer: AbstractParty = data.amount.token.issuer.party
                                val issuer: AbstractParty = anonymousIssuer.resolveIssuer().value ?: anonymousIssuer
                                // TODO: Anonymous should probably be italicised or similar
                                label(issuer.nameOrNull()?.let { PartyNameFormatter.short.format(it) } ?: "Anonymous") {
                                    tooltip(anonymousIssuer.owningKey.toBase58String())
                                }
                            }
                            row {
                                label("Owner :") { gridpaneConstraints { hAlignment = HPos.RIGHT } }
                                val owner = data.owner
                                val nodeInfo = getModel<NetworkIdentityModel>().lookup(owner.owningKey)
                                label(nodeInfo.map { it?.legalIdentity?.let { PartyNameFormatter.short.format(it.name) } ?: "???" }) {
                                    tooltip(data.owner.owningKey.toBase58String())
                                }
                            }
                        }
                    // TODO : Generic view using reflection?
                        else -> label {}
                    }' @ [277:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'data' @ [277:27] ==> val data: ContractState defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>[LocalVariableDescriptor]

'row' @ [279:29] ==> public fun GridPane.row(title: String? = ..., op: (Pane.() -> Unit)? = ...): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'label' @ [280:33] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'gridpaneConstraints' @ [280:53] ==> public fun <T : Node> Label.gridpaneConstraints(op: GridPaneConstraint.() -> Unit): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Label

'hAlignment' @ [280:75] ==> public final var hAlignment: HPos? defined in tornadofx.GridPaneConstraint[DeserializedPropertyDescriptor]

'RIGHT' @ [280:93] ==> enum entry RIGHT defined in javafx.geometry.HPos[FakeCallableDescriptorForObject]

'label' @ [281:33] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'AmountFormatter' @ [281:39] ==> public object AmountFormatter defined in net.corda.explorer.formatters in file AmountFormatter.kt[FakeCallableDescriptorForObject]

'boring' @ [281:55] ==> public final val boring: Formatter<Amount<Currency>> defined in net.corda.explorer.formatters.AmountFormatter[PropertyDescriptorImpl]

'format' @ [281:62] ==> public abstract fun format(value: Amount<Currency>): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'data' @ [281:69] ==> val data: ContractState defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [281:74] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'withoutIssuer' @ [281:81] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'row' @ [283:29] ==> public fun GridPane.row(title: String? = ..., op: (Pane.() -> Unit)? = ...): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'label' @ [284:33] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'gridpaneConstraints' @ [284:53] ==> public fun <T : Node> Label.gridpaneConstraints(op: GridPaneConstraint.() -> Unit): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Label

'hAlignment' @ [284:75] ==> public final var hAlignment: HPos? defined in tornadofx.GridPaneConstraint[DeserializedPropertyDescriptor]

'RIGHT' @ [284:93] ==> enum entry RIGHT defined in javafx.geometry.HPos[FakeCallableDescriptorForObject]

'data' @ [285:70] ==> val data: ContractState defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [285:75] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [285:82] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [285:88] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [285:95] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'anonymousIssuer' @ [286:61] ==> val anonymousIssuer: AbstractParty defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolveIssuer' @ [286:77] ==> public fun AbstractParty.resolveIssuer(): ObservableValue<Party?> defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]

'value' @ [286:93] ==> public final val <T : (Any..Any?)> ObservableValue<Party?>.value: Party?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Party?

'anonymousIssuer' @ [286:102] ==> val anonymousIssuer: AbstractParty defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'label' @ [288:33] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'issuer' @ [288:39] ==> val issuer: AbstractParty defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'nameOrNull' @ [288:46] ==> public abstract fun nameOrNull(): X500Name? defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'let' @ [288:60] ==> @InlineOnly public inline fun <T, R> X500Name.let(block: (X500Name) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X500Name
    <R> -> String

'PartyNameFormatter' @ [288:66] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'short' @ [288:85] ==> public final val short: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'format' @ [288:91] ==> public abstract fun format(value: X500Name): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [288:98] ==> value-parameter it: X500Name defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tooltip' @ [289:37] ==> public fun Node.tooltip(text: String? = ..., graphic: Node? = ..., op: (Tooltip.() -> Unit)? = ...): Tooltip defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'anonymousIssuer' @ [289:45] ==> val anonymousIssuer: AbstractParty defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owningKey' @ [289:61] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [289:71] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'row' @ [292:29] ==> public fun GridPane.row(title: String? = ..., op: (Pane.() -> Unit)? = ...): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'label' @ [293:33] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'gridpaneConstraints' @ [293:52] ==> public fun <T : Node> Label.gridpaneConstraints(op: GridPaneConstraint.() -> Unit): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Label

'hAlignment' @ [293:74] ==> public final var hAlignment: HPos? defined in tornadofx.GridPaneConstraint[DeserializedPropertyDescriptor]

'RIGHT' @ [293:92] ==> enum entry RIGHT defined in javafx.geometry.HPos[FakeCallableDescriptorForObject]

'data' @ [294:45] ==> val data: ContractState defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [294:50] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'getModel' @ [295:48] ==> public inline fun <reified M : Any> UIComponent.getModel(): NetworkIdentityModel defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified M : Any> -> NetworkIdentityModel

'lookup' @ [295:81] ==> public final fun lookup(publicKey: PublicKey): ObservableValue<NodeInfo?> defined in net.corda.client.jfx.model.NetworkIdentityModel[DeserializedSimpleFunctionDescriptor]

'owner' @ [295:88] ==> val owner: AbstractParty defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owningKey' @ [295:94] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'label' @ [296:33] ==> public inline fun <reified T> EventTarget.label(observable: ObservableValue<String>, noinline op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'nodeInfo' @ [296:39] ==> val nodeInfo: ObservableValue<NodeInfo?> defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [296:48] ==> public fun <A, B> ObservableValue<out NodeInfo?>.map(function: (NodeInfo?) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeInfo?
    <B> -> String

'it' @ [296:54] ==> value-parameter it: NodeInfo? defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [296:58] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'let' @ [296:73] ==> @InlineOnly public inline fun <T, R> Party.let(block: (Party) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> String

'PartyNameFormatter' @ [296:79] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'short' @ [296:98] ==> public final val short: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'format' @ [296:104] ==> public abstract fun format(value: X500Name): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [296:111] ==> value-parameter it: Party defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [296:114] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'tooltip' @ [297:37] ==> public fun Node.tooltip(text: String? = ..., graphic: Node? = ..., op: (Tooltip.() -> Unit)? = ...): Tooltip defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'data' @ [297:45] ==> val data: ContractState defined in net.corda.explorer.views.TransactionViewer.ContractStatesView.getCell.<anonymous>.<anonymous>[LocalVariableDescriptor]

'owner' @ [297:50] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'owningKey' @ [297:56] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'toBase58String' @ [297:66] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'label' @ [302:33] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'this' @ [309:57] ==> <this> defined in net.corda.explorer.views.TransactionViewer.contract[ReceiverParameterDescriptorImpl]

'state' @ [309:62] ==> public final val state: TransactionState<ContractState> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [309:68] ==> public final val data: ContractState defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'contract' @ [309:73] ==> public abstract val contract: Contract defined in net.corda.core.contracts.ContractState[DeserializedPropertyDescriptor]

'component1' @ [319:10] ==> public final operator fun component1(): Currency defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [319:29] ==> public final operator fun component2(): (Amount<Currency>) -> Amount<Currency> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'reportingCurrencyExchange' @ [319:41] ==> value-parameter reportingCurrencyExchange: Pair<Currency, (Amount<Currency>) -> Amount<Currency>> defined in net.corda.explorer.views.calculateTotalEquiv[ValueParameterDescriptorImpl]

'identity' @ [320:25] ==> value-parameter identity: NodeInfo? defined in net.corda.explorer.views.calculateTotalEquiv[ValueParameterDescriptorImpl]

'legalIdentity' @ [320:35] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'this' @ [321:37] ==> <this> defined in net.corda.explorer.views.calculateTotalEquiv.sum[ReceiverParameterDescriptorImpl]

'map' @ [321:42] ==> public inline fun <T, R> Iterable<ContractState>.map(transform: (ContractState) -> Cash.State?): List<Cash.State?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ContractState
    <R> -> State?

'it' @ [321:48] ==> value-parameter it: ContractState defined in net.corda.explorer.views.calculateTotalEquiv.sum.<anonymous>[ValueParameterDescriptorImpl]

'filterNotNull' @ [322:14] ==> public fun <T : Any> Iterable<Cash.State?>.filterNotNull(): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> State

'filter' @ [323:14] ==> public inline fun <T> Iterable<Cash.State>.filter(predicate: (Cash.State) -> Boolean): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'legalIdentity' @ [323:23] ==> val legalIdentity: Party? defined in net.corda.explorer.views.calculateTotalEquiv[LocalVariableDescriptor]

'it' @ [323:40] ==> value-parameter it: Cash.State defined in net.corda.explorer.views.calculateTotalEquiv.sum.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [323:43] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'map' @ [324:14] ==> public inline fun <T, R> Iterable<Cash.State>.map(transform: (Cash.State) -> Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Long

'invoke' @ [324:20] ==> public abstract operator fun invoke(p1: Amount<Currency>): Amount<Currency> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [324:29] ==> value-parameter it: Cash.State defined in net.corda.explorer.views.calculateTotalEquiv.sum.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [324:32] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'withoutIssuer' @ [324:39] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [324:56] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'sum' @ [325:14] ==> @JvmName public fun Iterable<Long>.sum(): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'if (inputs.isEmpty()) outputs.map { it as? Cash.State }
            .filterNotNull()
            .filter { legalIdentity == it.amount.token.issuer.party && legalIdentity != it.owner }
            .map { exchange(it.amount.withoutIssuer()).quantity }
            .sum() else 0' @ [328:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'inputs' @ [328:28] ==> value-parameter inputs: List<ContractState> defined in net.corda.explorer.views.calculateTotalEquiv[ValueParameterDescriptorImpl]

'isEmpty' @ [328:35] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'outputs' @ [328:46] ==> value-parameter outputs: List<ContractState> defined in net.corda.explorer.views.calculateTotalEquiv[ValueParameterDescriptorImpl]

'map' @ [328:54] ==> public inline fun <T, R> Iterable<ContractState>.map(transform: (ContractState) -> Cash.State?): List<Cash.State?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ContractState
    <R> -> State?

'it' @ [328:60] ==> value-parameter it: ContractState defined in net.corda.explorer.views.calculateTotalEquiv.<anonymous>[ValueParameterDescriptorImpl]

'filterNotNull' @ [329:14] ==> public fun <T : Any> Iterable<Cash.State?>.filterNotNull(): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> State

'filter' @ [330:14] ==> public inline fun <T> Iterable<Cash.State>.filter(predicate: (Cash.State) -> Boolean): List<Cash.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'legalIdentity' @ [330:23] ==> val legalIdentity: Party? defined in net.corda.explorer.views.calculateTotalEquiv[LocalVariableDescriptor]

'it' @ [330:40] ==> value-parameter it: Cash.State defined in net.corda.explorer.views.calculateTotalEquiv.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [330:43] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [330:50] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [330:56] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [330:63] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'legalIdentity' @ [330:72] ==> val legalIdentity: Party? defined in net.corda.explorer.views.calculateTotalEquiv[LocalVariableDescriptor]

'it' @ [330:89] ==> value-parameter it: Cash.State defined in net.corda.explorer.views.calculateTotalEquiv.<anonymous>[ValueParameterDescriptorImpl]

'owner' @ [330:92] ==> public open val owner: AbstractParty defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'map' @ [331:14] ==> public inline fun <T, R> Iterable<Cash.State>.map(transform: (Cash.State) -> Long): List<Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> Long

'invoke' @ [331:20] ==> public abstract operator fun invoke(p1: Amount<Currency>): Amount<Currency> defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [331:29] ==> value-parameter it: Cash.State defined in net.corda.explorer.views.calculateTotalEquiv.<anonymous>[ValueParameterDescriptorImpl]

'amount' @ [331:32] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'withoutIssuer' @ [331:39] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'quantity' @ [331:56] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'sum' @ [332:14] ==> @JvmName public fun Iterable<Long>.sum(): Long defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'AmountDiff' @ [334:12] ==> public companion object defined in net.corda.explorer.AmountDiff[FakeCallableDescriptorForObject]

'fromLong' @ [334:23] ==> public final fun <T : Any> fromLong(quantity: Long, token: Currency): AmountDiff<Currency> defined in net.corda.explorer.AmountDiff.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Currency

'outputs' @ [334:32] ==> value-parameter outputs: List<ContractState> defined in net.corda.explorer.views.calculateTotalEquiv[ValueParameterDescriptorImpl]

'sum' @ [334:40] ==> local final fun List<ContractState>.sum(): Long defined in net.corda.explorer.views.calculateTotalEquiv[SimpleFunctionDescriptorImpl]

'inputs' @ [334:48] ==> value-parameter inputs: List<ContractState> defined in net.corda.explorer.views.calculateTotalEquiv[ValueParameterDescriptorImpl]

'sum' @ [334:55] ==> local final fun List<ContractState>.sum(): Long defined in net.corda.explorer.views.calculateTotalEquiv[SimpleFunctionDescriptorImpl]

'issuedAmount' @ [334:63] ==> val issuedAmount: Long defined in net.corda.explorer.views.calculateTotalEquiv[LocalVariableDescriptor]

'reportingCurrency' @ [334:77] ==> val reportingCurrency: Currency defined in net.corda.explorer.views.calculateTotalEquiv[LocalVariableDescriptor]

