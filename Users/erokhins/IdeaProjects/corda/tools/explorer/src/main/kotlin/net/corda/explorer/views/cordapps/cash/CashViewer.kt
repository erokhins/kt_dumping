'CordaView' @ [44:20] ==> public constructor CordaView(title: String? = ...) defined in net.corda.explorer.model.CordaView[ClassConstructorDescriptorImpl]

'fxml' @ [46:38] ==> public final fun <T : Node> fxml(location: String?, hasControllerAttribute: Boolean): ReadOnlyProperty<UIComponent, BorderPane> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> BorderPane

'MONEY' @ [47:58] ==> enum entry MONEY defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'listOf' @ [49:28] ==> public fun <T> listOf(element: CordaWidget): List<CordaWidget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaWidget

'CordaWidget' @ [49:35] ==> public constructor CordaWidget(name: String, node: Node, icon: FontAwesomeIcon? = ...) defined in net.corda.explorer.model.CordaWidget[ClassConstructorDescriptorImpl]

'CashWidget' @ [49:59] ==> public constructor CashWidget() defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget[ClassConstructorDescriptorImpl]

'icon' @ [49:73] ==> public open val icon: FontAwesomeIcon defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'observable' @ [49:80] ==> public fun <T> List<CordaWidget>.observable(): ObservableList<CordaWidget> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaWidget

'fxid' @ [51:35] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, VBox> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> VBox

'fxid' @ [52:41] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, SplitPane> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SplitPane

'fxid' @ [53:46] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Label> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Label

'fxid' @ [54:63] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TreeTableView<CashViewer.ViewerNode>> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TreeTableView<ViewerNode>

'fxid' @ [55:87] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TreeTableColumn<CashViewer.ViewerNode, String>> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TreeTableColumn<ViewerNode, String>

'fxid' @ [56:97] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TreeTableColumn<ViewerNode, Amount<Currency>?>

'fxid' @ [57:89] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TreeTableColumn<ViewerNode, Amount<Currency>?>

'fxid' @ [59:36] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, VBox> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> VBox

'fxid' @ [60:47] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Label> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Label

'fxid' @ [61:55] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, ListView<CashViewer.StateRow>> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ListView<StateRow>

'fxid' @ [62:33] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Button> defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Button

'observableList' @ [64:31] ==> public inline fun <reified M : Any, T> observableList(noinline observableListProperty: (ContractStateModel) -> ObservableList<StateAndRef<Cash.State>>): TrackedDelegate.ObservableListDelegate<ContractStateModel, StateAndRef<Cash.State>> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> ContractStateModel
    <T> -> StateAndRef<State>

'ContractStateModel' @ [64:46] ==> public companion object defined in net.corda.client.jfx.model.ContractStateModel[FakeCallableDescriptorForObject]

'observableValue' @ [65:38] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (SettingsModel) -> ObservableValue<(Currency..Currency?)>): TrackedDelegate.ObservableValueDelegate<SettingsModel, (Currency..Currency?)> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> SettingsModel
    <T> -> (java.util.Currency..java.util.Currency?)

'SettingsModel' @ [65:54] ==> public constructor SettingsModel(path: Path = ...) defined in net.corda.explorer.model.SettingsModel[ClassConstructorDescriptorImpl]

'observableValue' @ [66:38] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (ReportingCurrencyModel) -> ObservableValue<Pair<Currency, (Amount<Currency>) -> Amount<Currency>>>): TrackedDelegate.ObservableValueDelegate<ReportingCurrencyModel, Pair<Currency, (Amount<Currency>) -> Amount<Currency>>> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> ReportingCurrencyModel
    <T> -> Pair<Currency, Function1<Amount<Currency>, Amount<Currency>>>

'ReportingCurrencyModel' @ [66:54] ==> public constructor ReportingCurrencyModel() defined in net.corda.explorer.model.ReportingCurrencyModel[ClassConstructorDescriptorImpl]

'cashViewerTable' @ [68:32] ==> private final val cashViewerTable: TreeTableView<CashViewer.ViewerNode> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'singleRowSelection' @ [68:48] ==> public fun <S> TreeTableView<CashViewer.ViewerNode>.singleRowSelection(): ObservableValue<out SingleRowSelection<CashViewer.ViewerNode>> defined in net.corda.explorer.ui[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> ViewerNode

'map' @ [68:69] ==> public fun <A, B> ObservableValue<out SingleRowSelection<CashViewer.ViewerNode>>.map(function: (SingleRowSelection<CashViewer.ViewerNode>) -> CashViewer.ViewerNode?): ObservableValue<CashViewer.ViewerNode?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> SingleRowSelection<ViewerNode>
    <B> -> ViewerNode?

'when (it) {
            is SingleRowSelection.Selected -> it.node
            else -> null
        }' @ [69:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CashViewer.ViewerNode?, entry1: CashViewer.ViewerNode?): CashViewer.ViewerNode?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ViewerNode?

'it' @ [69:15] ==> value-parameter it: SingleRowSelection<CashViewer.ViewerNode> defined in net.corda.explorer.views.cordapps.cash.CashViewer.selectedNode.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [70:47] ==> value-parameter it: SingleRowSelection<CashViewer.ViewerNode> defined in net.corda.explorer.views.cordapps.cash.CashViewer.selectedNode.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [70:50] ==> public final val node: CashViewer.ViewerNode defined in net.corda.explorer.ui.SingleRowSelection.Selected[PropertyDescriptorImpl]

'ChosenList' @ [75:24] ==> public constructor ChosenList<E>(chosenListObservable: ObservableValue<out ObservableList<out VBox>>) defined in net.corda.client.jfx.utils.ChosenList[DeserializedClassConstructorDescriptor]
Inferred types:
    <E> -> VBox

'selectedNode' @ [75:35] ==> private final val selectedNode: ObservableValue<CashViewer.ViewerNode?> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'map' @ [75:48] ==> public fun <A, B> ObservableValue<out CashViewer.ViewerNode?>.map(function: (CashViewer.ViewerNode?) -> (ObservableList<VBox>..ObservableList<VBox>?)): ObservableValue<(ObservableList<VBox>..ObservableList<VBox>?)> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> ViewerNode?
    <B> -> (javafx.collections.ObservableList<javafx.scene.layout.VBox>..javafx.collections.ObservableList<javafx.scene.layout.VBox>?)

'when (it) {
            null -> FXCollections.observableArrayList(leftPane)
            else -> FXCollections.observableArrayList(leftPane, rightPane)
        }' @ [76:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (ObservableList<VBox>..ObservableList<VBox>?), entry1: (ObservableList<VBox>..ObservableList<VBox>?)): (ObservableList<VBox>..ObservableList<VBox>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javafx.collections.ObservableList<javafx.scene.layout.VBox>..javafx.collections.ObservableList<javafx.scene.layout.VBox>?)

'it' @ [76:15] ==> value-parameter it: CashViewer.ViewerNode? defined in net.corda.explorer.views.cordapps.cash.CashViewer.view.<anonymous>[ValueParameterDescriptorImpl]

'observableArrayList' @ [77:35] ==> public open fun <E : (Any..Any?)> observableArrayList(vararg p0: (VBox..VBox?)): (ObservableList<(VBox..VBox?)>..ObservableList<(VBox..VBox?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> VBox

'leftPane' @ [77:55] ==> private final val leftPane: VBox defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'observableArrayList' @ [78:35] ==> public open fun <E : (Any..Any?)> observableArrayList(vararg p0: (VBox..VBox?)): (ObservableList<(VBox..VBox?)>..ObservableList<(VBox..VBox?)>?) defined in javafx.collections.FXCollections[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> VBox

'leftPane' @ [78:55] ==> private final val leftPane: VBox defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'rightPane' @ [78:65] ==> private final val rightPane: VBox defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'ViewerNode' @ [89:77] ==> private constructor ViewerNode(equivAmount: ObservableValue<out Amount<Currency>>, states: ObservableList<StateAndRef<Cash.State>>) defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode[ClassConstructorDescriptorImpl]

'sumEquivAmount' @ [89:88] ==> value-parameter sumEquivAmount: ObservableValue<out Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.IssuerNode.<init>[ValueParameterDescriptorImpl]

'states' @ [89:104] ==> value-parameter states: ObservableList<StateAndRef<Cash.State>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.IssuerNode.<init>[ValueParameterDescriptorImpl]

'ViewerNode' @ [93:79] ==> private constructor ViewerNode(equivAmount: ObservableValue<out Amount<Currency>>, states: ObservableList<StateAndRef<Cash.State>>) defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode[ClassConstructorDescriptorImpl]

'equivAmount' @ [93:90] ==> value-parameter equivAmount: ObservableValue<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.CurrencyNode.<init>[ValueParameterDescriptorImpl]

'states' @ [93:103] ==> value-parameter states: ObservableList<StateAndRef<Cash.State>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.CurrencyNode.<init>[ValueParameterDescriptorImpl]

'UIComponent' @ [104:59] ==> public constructor UIComponent(viewTitle: String? = ...) defined in tornadofx.UIComponent[DeserializedClassConstructorDescriptor]

'fxml' @ [105:38] ==> public final fun <T : Node> fxml(location: String?, hasControllerAttribute: Boolean): ReadOnlyProperty<UIComponent, Parent> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Parent

'fxid' @ [107:34] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Label> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Label

'fxid' @ [108:41] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Label> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Label

'fxid' @ [109:40] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Label> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Label

'fxid' @ [110:44] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Label> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Label

'fxid' @ [111:40] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Label> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Label

'fxid' @ [112:39] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Label> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Label

'reportingExchange' @ [114:66] ==> private final val reportingExchange: ObservableValue<Pair<Currency, (Amount<Currency>) -> Amount<Currency>>> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'map' @ [114:84] ==> public fun <A, B> ObservableValue<out Pair<Currency, (Amount<Currency>) -> Amount<Currency>>>.map(function: (Pair<Currency, (Amount<Currency>) -> Amount<Currency>>) -> Amount<Currency>): ObservableValue<Amount<Currency>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Pair<Currency, Function1<Amount<Currency>, Amount<Currency>>>
    <B> -> Amount<Currency>

'it' @ [115:13] ==> value-parameter it: Pair<Currency, (Amount<Currency>) -> Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.equivAmount.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [115:16] ==> public abstract operator fun invoke(p1: Amount<Currency>): Amount<Currency> defined in kotlin.Function1[FunctionInvokeDescriptor]

'stateRow' @ [115:23] ==> public final val stateRow: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'stateAndRef' @ [115:32] ==> public final val stateAndRef: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[PropertyDescriptorImpl]

'state' @ [115:44] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [115:50] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [115:55] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'withoutIssuer' @ [115:62] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'stateRow' @ [119:34] ==> public final val stateRow: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'stateAndRef' @ [119:43] ==> public final val stateAndRef: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[PropertyDescriptorImpl]

'state' @ [119:55] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [119:61] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [119:66] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'withoutIssuer' @ [119:73] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'AmountFormatter' @ [120:35] ==> public object AmountFormatter defined in net.corda.explorer.formatters in file AmountFormatter.kt[FakeCallableDescriptorForObject]

'boring' @ [120:51] ==> public final val boring: Formatter<Amount<Currency>> defined in net.corda.explorer.formatters.AmountFormatter[PropertyDescriptorImpl]

'AmountFormatter' @ [121:34] ==> public object AmountFormatter defined in net.corda.explorer.formatters in file AmountFormatter.kt[FakeCallableDescriptorForObject]

'boring' @ [121:50] ==> public final val boring: Formatter<Amount<Currency>> defined in net.corda.explorer.formatters.AmountFormatter[PropertyDescriptorImpl]

'stateRow' @ [122:49] ==> public final val stateRow: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'stateAndRef' @ [122:58] ==> public final val stateAndRef: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[PropertyDescriptorImpl]

'resolveIssuer' @ [122:70] ==> public fun StateAndRef<Cash.State>.resolveIssuer(): ObservableValue<Party?> defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]

'value' @ [122:86] ==> public final val <T : (Any..Any?)> ObservableValue<Party?>.value: Party?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Party?

'stateRow' @ [122:95] ==> public final val stateRow: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'stateAndRef' @ [122:104] ==> public final val stateAndRef: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[PropertyDescriptorImpl]

'state' @ [122:116] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [122:122] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [122:127] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [122:134] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [122:140] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [122:147] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'stateIdValueLabel' @ [124:13] ==> public final val stateIdValueLabel: Label defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'apply' @ [124:31] ==> @InlineOnly public inline fun <T> Label.apply(block: Label.() -> Unit): Label defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'text' @ [125:17] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'stateRow' @ [125:24] ==> public final val stateRow: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'stateAndRef' @ [125:33] ==> public final val stateAndRef: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[PropertyDescriptorImpl]

'ref' @ [125:45] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'toString' @ [125:49] ==> public open fun toString(): String defined in net.corda.core.contracts.StateRef[DeserializedSimpleFunctionDescriptor]

'substring' @ [125:60] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'stateRow' @ [125:86] ==> public final val stateRow: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'stateAndRef' @ [125:95] ==> public final val stateAndRef: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[PropertyDescriptorImpl]

'ref' @ [125:107] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'index' @ [125:111] ==> public final val index: Int defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'graphic' @ [126:17] ==> public final var Label.graphic: (Node..Node?)[MyPropertyDescriptor]

'identicon' @ [126:27] ==> public fun identicon(secureHash: SecureHash, size: Double): ImageView defined in net.corda.explorer.identicon in file IdenticonRenderer.kt[SimpleFunctionDescriptorImpl]

'stateRow' @ [126:37] ==> public final val stateRow: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'stateAndRef' @ [126:46] ==> public final val stateAndRef: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[PropertyDescriptorImpl]

'ref' @ [126:58] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [126:62] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'tooltip' @ [127:17] ==> public final var Label.tooltip: (Tooltip..Tooltip?)[MyPropertyDescriptor]

'identiconToolTip' @ [127:27] ==> public fun identiconToolTip(secureHash: SecureHash, description: String? = ...): Tooltip defined in net.corda.explorer.identicon in file IdenticonRenderer.kt[SimpleFunctionDescriptorImpl]

'stateRow' @ [127:44] ==> public final val stateRow: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'stateAndRef' @ [127:53] ==> public final val stateAndRef: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[PropertyDescriptorImpl]

'ref' @ [127:65] ==> public final val ref: StateRef defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'txhash' @ [127:69] ==> public final val txhash: SecureHash defined in net.corda.core.contracts.StateRef[DeserializedPropertyDescriptor]

'equivLabel' @ [129:13] ==> public final val equivLabel: Label defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'textProperty' @ [129:24] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.Label[JavaMethodDescriptor]

'bind' @ [129:39] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'equivAmount' @ [129:44] ==> public final val equivAmount: ObservableValue<out Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'map' @ [129:56] ==> public fun <A, B> ObservableValue<out Amount<Currency>>.map(function: (Amount<Currency>) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Amount<Currency>
    <B> -> String

'it' @ [129:62] ==> value-parameter it: Amount<Currency> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.<init>.<anonymous>[ValueParameterDescriptorImpl]

'token' @ [129:65] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'currencyCode' @ [129:71] ==> public final val Currency.currencyCode: (String..String?)[MyPropertyDescriptor]

'toString' @ [129:84] ==> public open fun toString(): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'issuerValueLabel' @ [131:13] ==> public final val issuerValueLabel: Label defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'textProperty' @ [131:30] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.Label[JavaMethodDescriptor]

'bind' @ [131:45] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'SimpleStringProperty' @ [131:50] ==> public constructor SimpleStringProperty(p0: (String..String?)) defined in javafx.beans.property.SimpleStringProperty[JavaClassConstructorDescriptor]

'resolvedIssuer' @ [131:71] ==> val resolvedIssuer: AbstractParty defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.<init>[LocalVariableDescriptor]

'nameOrNull' @ [131:86] ==> public abstract fun nameOrNull(): X500Name? defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'let' @ [131:100] ==> @InlineOnly public inline fun <T, R> X500Name.let(block: (X500Name) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X500Name
    <R> -> String

'PartyNameFormatter' @ [132:17] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'short' @ [132:36] ==> public final val short: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'format' @ [132:42] ==> public abstract fun format(value: X500Name): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [132:49] ==> value-parameter it: X500Name defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.<init>.<anonymous>[ValueParameterDescriptorImpl]

'issuerValueLabel' @ [134:13] ==> public final val issuerValueLabel: Label defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'apply' @ [134:30] ==> @InlineOnly public inline fun <T> Label.apply(block: Label.() -> Unit): Label defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Label

'tooltip' @ [134:38] ==> public fun Node.tooltip(text: String? = ..., graphic: Node? = ..., op: (Tooltip.() -> Unit)? = ...): Tooltip defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'resolvedIssuer' @ [134:46] ==> val resolvedIssuer: AbstractParty defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.<init>[LocalVariableDescriptor]

'nameOrNull' @ [134:61] ==> public abstract fun nameOrNull(): X500Name? defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'let' @ [134:75] ==> @InlineOnly public inline fun <T, R> X500Name.let(block: (X500Name) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X500Name
    <R> -> String

'PartyNameFormatter' @ [134:81] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'full' @ [134:100] ==> public final val full: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'format' @ [134:105] ==> public abstract fun format(value: X500Name): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [134:112] ==> value-parameter it: X500Name defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'originatedValueLabel' @ [135:13] ==> public final val originatedValueLabel: Label defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'text' @ [135:34] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'stateRow' @ [135:41] ==> public final val stateRow: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'originated' @ [135:50] ==> public final val originated: LocalDateTime defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[PropertyDescriptorImpl]

'toString' @ [135:61] ==> public open fun toString(): String defined in java.time.LocalDateTime[JavaMethodDescriptor]

'amountValueLabel' @ [136:13] ==> public final val amountValueLabel: Label defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'text' @ [136:30] ==> public final var Label.text: (String..String?)[MyPropertyDescriptor]

'amountFormatter' @ [136:37] ==> val amountFormatter: Formatter<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.<init>[LocalVariableDescriptor]

'format' @ [136:53] ==> public abstract fun format(value: Amount<Currency>): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'amountNoIssuer' @ [136:60] ==> val amountNoIssuer: Amount<Currency> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.<init>[LocalVariableDescriptor]

'equivValueLabel' @ [137:13] ==> public final val equivValueLabel: Label defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'textProperty' @ [137:29] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.Label[JavaMethodDescriptor]

'bind' @ [137:44] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'equivAmount' @ [137:49] ==> public final val equivAmount: ObservableValue<out Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'map' @ [137:61] ==> public fun <A, B> ObservableValue<out Amount<Currency>>.map(function: (Amount<Currency>) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Amount<Currency>
    <B> -> String

'equivFormatter' @ [137:67] ==> val equivFormatter: Formatter<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.<init>[LocalVariableDescriptor]

'format' @ [137:82] ==> public abstract fun format(value: Amount<Currency>): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [137:89] ==> value-parameter it: Amount<Currency> defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic.<init>.<anonymous>[ValueParameterDescriptorImpl]

'bindContent' @ [143:18] ==> public open fun <E : (Any..Any?)> bindContent(p0: (MutableList<(Node..Node?)>..List<(Node..Node?)>?), p1: (ObservableList<out (Node..Node?)>..ObservableList<out (Node..Node?)>?)): Unit defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Node

'splitPane' @ [143:30] ==> private final val splitPane: SplitPane defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'items' @ [143:40] ==> public final val SplitPane.items: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'view' @ [143:47] ==> private final val view: ChosenList<VBox> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'SearchField' @ [149:27] ==> public constructor SearchField<T>(data: ObservableList<StateAndRef<Cash.State>>, vararg filterCriteria: Pair<String, (StateAndRef<Cash.State>, String) -> Boolean>) defined in net.corda.explorer.views.SearchField[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> StateAndRef<State>

'cashStates' @ [149:39] ==> private final val cashStates: ObservableList<StateAndRef<Cash.State>> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'to' @ [150:17] ==> public infix fun <A, B> String.to(that: (StateAndRef<Cash.State>, String) -> Boolean): Pair<String, (StateAndRef<Cash.State>, String) -> Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function2<StateAndRef<State>, String, Boolean>

'state' @ [150:48] ==> value-parameter state: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [150:54] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [150:60] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [150:65] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [150:72] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [150:78] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'toString' @ [150:86] ==> public open fun toString(): String defined in java.util.Currency[JavaMethodDescriptor]

'contains' @ [150:97] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [150:106] ==> value-parameter text: String defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [151:17] ==> public infix fun <A, B> String.to(that: (StateAndRef<Cash.State>, String) -> Boolean): Pair<String, (StateAndRef<Cash.State>, String) -> Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Function2<StateAndRef<State>, String, Boolean>

'state' @ [151:46] ==> value-parameter state: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'resolveIssuer' @ [151:52] ==> public fun StateAndRef<Cash.State>.resolveIssuer(): ObservableValue<Party?> defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]

'value' @ [151:68] ==> public final val <T : (Any..Any?)> ObservableValue<Party?>.value: Party?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Party?

'name' @ [151:75] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'commonName' @ [151:81] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'contains' @ [151:93] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [151:102] ==> value-parameter text: String defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'root' @ [153:9] ==> public open val root: BorderPane defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'top' @ [153:14] ==> public final var BorderPane.top: (Node..Node?)[MyPropertyDescriptor]

'hbox' @ [153:20] ==> public fun EventTarget.hbox(spacing: Double? = ..., children: Iterable<Node>? = ..., op: (HBox.() -> Unit)? = ...): HBox defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'button' @ [154:13] ==> public fun EventTarget.button(text: String = ..., graphic: Node? = ..., op: (Button.() -> Unit)? = ...): Button defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'FontAwesomeIconView' @ [154:39] ==> public constructor FontAwesomeIconView(p0: (FontAwesomeIcon..FontAwesomeIcon?)) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaClassConstructorDescriptor]

'PLUS' @ [154:75] ==> enum entry PLUS defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'setOnMouseClicked' @ [155:17] ==> public final fun setOnMouseClicked(p0: (((MouseEvent..MouseEvent?)) -> Unit..(((MouseEvent..MouseEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'it' @ [156:25] ==> value-parameter it: (MouseEvent..MouseEvent?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'button' @ [156:28] ==> public final val MouseEvent.button: (MouseButton..MouseButton?)[MyPropertyDescriptor]

'PRIMARY' @ [156:50] ==> enum entry PRIMARY defined in javafx.scene.input.MouseButton[FakeCallableDescriptorForObject]

'find' @ [157:25] ==> public final inline fun <reified T : Component> find(vararg params: Pair<String, Any>): NewTransaction defined in net.corda.explorer.views.cordapps.cash.CashViewer[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component> -> NewTransaction

'show' @ [157:48] ==> public final fun show(window: Window): Unit defined in net.corda.explorer.views.cordapps.cash.NewTransaction[SimpleFunctionDescriptorImpl]

'this@CashViewer' @ [157:53] ==> <this> defined in net.corda.explorer.views.cordapps.cash.CashViewer[LazyClassReceiverParameterDescriptor]

'root' @ [157:69] ==> public open val root: BorderPane defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'scene' @ [157:74] ==> public final val BorderPane.scene: (Scene..Scene?)[MyPropertyDescriptor]

'window' @ [157:80] ==> public final val Scene.window: (Window..Window?)[MyPropertyDescriptor]

'setHgrow' @ [161:18] ==> public open fun setHgrow(p0: (Node..Node?), p1: (Priority..Priority?)): Unit defined in javafx.scene.layout.HBox[JavaMethodDescriptor]

'searchField' @ [161:27] ==> val searchField: SearchField<StateAndRef<Cash.State>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>[LocalVariableDescriptor]

'root' @ [161:39] ==> public open val root: Parent defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'ALWAYS' @ [161:54] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'add' @ [162:13] ==> public fun EventTarget.add(node: Node): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'searchField' @ [162:17] ==> val searchField: SearchField<StateAndRef<Cash.State>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>[LocalVariableDescriptor]

'root' @ [162:29] ==> public open val root: Parent defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'AggregatedList' @ [172:17] ==> public constructor AggregatedList<A, E : Any, K : Any>(list: ObservableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>, toKey: ((StateAndRef<Cash.State>..StateAndRef<Cash.State>?)) -> AbstractParty, assemble: (AbstractParty, ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>) -> TreeItem<out CashViewer.ViewerNode.IssuerNode>) defined in net.corda.client.jfx.utils.AggregatedList[DeserializedClassConstructorDescriptor]
Inferred types:
    <A> -> TreeItem<out IssuerNode>
    <E : Any> -> (net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)
    <K : Any> -> AbstractParty

'searchField' @ [172:32] ==> val searchField: SearchField<StateAndRef<Cash.State>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>[LocalVariableDescriptor]

'filteredData' @ [172:44] ==> public final val filteredData: ChosenList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'it' @ [172:60] ==> value-parameter it: (StateAndRef<Cash.State>..StateAndRef<Cash.State>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [172:63] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [172:69] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [172:74] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [172:81] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'issuer' @ [172:87] ==> public final val issuer: PartyAndReference defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'party' @ [172:94] ==> public final val party: AbstractParty defined in net.corda.core.contracts.PartyAndReference[DeserializedPropertyDescriptor]

'AggregatedList' @ [177:41] ==> public constructor AggregatedList<A, E : Any, K : Any>(list: ObservableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>, toKey: ((StateAndRef<Cash.State>..StateAndRef<Cash.State>?)) -> Currency, assemble: (Currency, ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>) -> TreeItem<CashViewer.ViewerNode.CurrencyNode>) defined in net.corda.client.jfx.utils.AggregatedList[DeserializedClassConstructorDescriptor]
Inferred types:
    <A> -> TreeItem<CurrencyNode>
    <E : Any> -> (net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)
    <K : Any> -> Currency

'memberStates' @ [177:56] ==> value-parameter memberStates: ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [177:72] ==> value-parameter it: (StateAndRef<Cash.State>..StateAndRef<Cash.State>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [177:75] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [177:81] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [177:86] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'token' @ [177:93] ==> public final val token: Issued<Currency> defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'product' @ [177:99] ==> public final val product: Currency defined in net.corda.core.contracts.Issued[DeserializedPropertyDescriptor]

'memberStates' @ [181:39] ==> value-parameter memberStates: ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [181:52] ==> public fun <A, B> ObservableList<out (StateAndRef<Cash.State>..StateAndRef<Cash.State>?)>.map(cached: Boolean = ..., function: ((StateAndRef<Cash.State>..StateAndRef<Cash.State>?)) -> Amount<Currency>): ObservableList<Amount<Currency>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>..net.corda.core.contracts.StateAndRef<net.corda.finance.contracts.asset.Cash.State>?)
    <B> -> Amount<Currency>

'it' @ [181:58] ==> value-parameter it: (StateAndRef<Cash.State>..StateAndRef<Cash.State>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [181:61] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [181:67] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [181:72] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'withoutIssuer' @ [181:79] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'amounts' @ [182:41] ==> val amounts: ObservableList<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'foldObservable' @ [182:49] ==> public fun <A, B> ObservableList<out Amount<Currency>>.foldObservable(initial: Amount<Currency>, folderFunction: (Amount<Currency>, Amount<Currency>) -> Amount<Currency>): ObservableValue<Amount<Currency>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Amount<Currency>
    <B> -> Amount<Currency>

'Amount' @ [182:64] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: Currency) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Currency

'currency' @ [182:74] ==> value-parameter currency: Currency defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Amount' @ [182:85] ==> public companion object defined in net.corda.core.contracts.Amount[FakeCallableDescriptorForObject]

'combine' @ [187:55] ==> public final fun <A : (Any..Any?), B : (Any..Any?), R : (Any..Any?)> combine(p0: (ObservableValue<(Amount<Currency>..Amount<Currency>?)>..ObservableValue<(Amount<Currency>..Amount<Currency>?)>?), p1: (ObservableValue<(Pair<Currency, (Amount<Currency>) -> Amount<Currency>>..Pair<Currency, (Amount<Currency>) -> Amount<Currency>>?)>..ObservableValue<(Pair<Currency, (Amount<Currency>) -> Amount<Currency>>..Pair<Currency, (Amount<Currency>) -> Amount<Currency>>?)>?), p2: (((Amount<Currency>..Amount<Currency>?), (Pair<Currency, (Amount<Currency>) -> Amount<Currency>>..Pair<Currency, (Amount<Currency>) -> Amount<Currency>>?)) -> (Amount<Currency>..Amount<Currency>?)..(((Amount<Currency>..Amount<Currency>?), (Pair<Currency, (Amount<Currency>) -> Amount<Currency>>..Pair<Currency, (Amount<Currency>) -> Amount<Currency>>?)) -> (Amount<Currency>..Amount<Currency>?))?)): (MonadicBinding<(Amount<Currency>..Amount<Currency>?)>..MonadicBinding<(Amount<Currency>..Amount<Currency>?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <A : (Any..Any?)> -> Amount<Currency>
    <B : (Any..Any?)> -> Pair<Currency, Function1<Amount<Currency>, Amount<Currency>>>
    <R : (Any..Any?)> -> Amount<Currency>

'sumAmount' @ [187:63] ==> val sumAmount: ObservableValue<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'reportingExchange' @ [187:74] ==> private final val reportingExchange: ObservableValue<Pair<Currency, (Amount<Currency>) -> Amount<Currency>>> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'exchange' @ [188:29] ==> value-parameter exchange: (Pair<Currency, (Amount<Currency>) -> Amount<Currency>>..Pair<Currency, (Amount<Currency>) -> Amount<Currency>>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [188:38] ==> public abstract operator fun invoke(p1: Amount<Currency>): Amount<Currency> defined in kotlin.Function1[FunctionInvokeDescriptor]

'sum' @ [188:45] ==> value-parameter sum: (Amount<Currency>..Amount<Currency>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'TreeItem' @ [193:25] ==> public constructor TreeItem<T : (Any..Any?)>(p0: (CashViewer.ViewerNode.CurrencyNode..CashViewer.ViewerNode.CurrencyNode?)) defined in javafx.scene.control.TreeItem[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CurrencyNode

'CurrencyNode' @ [193:45] ==> public constructor CurrencyNode(amount: ObservableValue<Amount<Currency>>, equivAmount: ObservableValue<Amount<Currency>>, states: ObservableList<StateAndRef<Cash.State>>) defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.CurrencyNode[ClassConstructorDescriptorImpl]

'sumAmount' @ [193:58] ==> val sumAmount: ObservableValue<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'equivSumAmount' @ [193:69] ==> val equivSumAmount: (MonadicBinding<(Amount<Currency>..Amount<Currency>?)>..MonadicBinding<(Amount<Currency>..Amount<Currency>?)>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'memberStates' @ [193:85] ==> value-parameter memberStates: ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'currencyNodes' @ [200:40] ==> val currencyNodes: AggregatedList<TreeItem<CashViewer.ViewerNode.CurrencyNode>, (StateAndRef<Cash.State>..StateAndRef<Cash.State>?), Currency> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'map' @ [200:54] ==> public fun <A, B> ObservableList<out (TreeItem<CashViewer.ViewerNode.CurrencyNode>..TreeItem<CashViewer.ViewerNode.CurrencyNode>?)>.map(cached: Boolean = ..., function: ((TreeItem<CashViewer.ViewerNode.CurrencyNode>..TreeItem<CashViewer.ViewerNode.CurrencyNode>?)) -> ObservableValue<out Amount<Currency>>): ObservableList<ObservableValue<out Amount<Currency>>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (javafx.scene.control.TreeItem<net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.CurrencyNode>..javafx.scene.control.TreeItem<net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.CurrencyNode>?)
    <B> -> ObservableValue<out Amount<Currency>>

'it' @ [200:60] ==> value-parameter it: (TreeItem<CashViewer.ViewerNode.CurrencyNode>..TreeItem<CashViewer.ViewerNode.CurrencyNode>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [200:63] ==> public final var <T : (Any..Any?)> TreeItem<CashViewer.ViewerNode.CurrencyNode>.value: (CashViewer.ViewerNode.CurrencyNode..CashViewer.ViewerNode.CurrencyNode?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CurrencyNode

'equivAmount' @ [200:69] ==> public final val equivAmount: ObservableValue<out Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.CurrencyNode[PropertyDescriptorImpl]

'flatten' @ [200:83] ==> public fun <A> ObservableList<out ObservableValue<out Amount<Currency>>>.flatten(): ObservableList<Amount<Currency>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Amount<Currency>

'reportingCurrency' @ [201:42] ==> private final val reportingCurrency: ObservableValue<(Currency..Currency?)> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'bind' @ [201:60] ==> public fun <A, B> ObservableValue<out (Currency..Currency?)>.bind(function: ((Currency..Currency?)) -> ObservableValue<Amount<(Currency..Currency?)>>): ObservableValue<Amount<(Currency..Currency?)>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (java.util.Currency..java.util.Currency?)
    <B> -> Amount<(java.util.Currency..java.util.Currency?)>

'equivAmounts' @ [202:25] ==> val equivAmounts: ObservableList<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'foldObservable' @ [202:38] ==> public fun <A, B> ObservableList<out Amount<Currency>>.foldObservable(initial: Amount<(Currency..Currency?)>, folderFunction: (Amount<(Currency..Currency?)>, Amount<Currency>) -> Amount<(Currency..Currency?)>): ObservableValue<Amount<(Currency..Currency?)>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Amount<Currency>
    <B> -> Amount<(java.util.Currency..java.util.Currency?)>

'Amount' @ [202:53] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: (Currency..Currency?)) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> (java.util.Currency..java.util.Currency?)

'currency' @ [202:63] ==> value-parameter currency: (Currency..Currency?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Amount' @ [202:74] ==> public companion object defined in net.corda.core.contracts.Amount[FakeCallableDescriptorForObject]

'TreeItem' @ [208:36] ==> public constructor TreeItem<T : (Any..Any?)>(p0: (CashViewer.ViewerNode.IssuerNode..CashViewer.ViewerNode.IssuerNode?)) defined in javafx.scene.control.TreeItem[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IssuerNode

'IssuerNode' @ [208:56] ==> public constructor IssuerNode(issuer: AbstractParty, sumEquivAmount: ObservableValue<out Amount<Currency>>, states: ObservableList<StateAndRef<Cash.State>>) defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.IssuerNode[ClassConstructorDescriptorImpl]

'issuer' @ [208:67] ==> value-parameter issuer: AbstractParty defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'resolveIssuer' @ [208:74] ==> public fun AbstractParty.resolveIssuer(): ObservableValue<Party?> defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]

'value' @ [208:90] ==> public final val <T : (Any..Any?)> ObservableValue<Party?>.value: Party?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Party?

'issuer' @ [208:99] ==> value-parameter issuer: AbstractParty defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'equivSumAmount' @ [208:107] ==> val equivSumAmount: ObservableValue<Amount<(Currency..Currency?)>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'memberStates' @ [208:123] ==> value-parameter memberStates: ObservableList<(StateAndRef<Cash.State>..StateAndRef<Cash.State>?)> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'treeItem' @ [215:21] ==> val treeItem: TreeItem<CashViewer.ViewerNode.IssuerNode> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'isExpanded' @ [215:30] ==> public final var <T : (Any..Any?)> TreeItem<CashViewer.ViewerNode.IssuerNode>.isExpanded: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IssuerNode

'treeItem' @ [216:79] ==> val treeItem: TreeItem<CashViewer.ViewerNode.IssuerNode> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'children' @ [216:88] ==> public final val <T : (Any..Any?)> TreeItem<CashViewer.ViewerNode.IssuerNode>.children: (ObservableList<(TreeItem<(CashViewer.ViewerNode.IssuerNode..CashViewer.ViewerNode.IssuerNode?)>..TreeItem<(CashViewer.ViewerNode.IssuerNode..CashViewer.ViewerNode.IssuerNode?)>?)>..ObservableList<(TreeItem<(CashViewer.ViewerNode.IssuerNode..CashViewer.ViewerNode.IssuerNode?)>..TreeItem<(CashViewer.ViewerNode.IssuerNode..CashViewer.ViewerNode.IssuerNode?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> IssuerNode

'bindContent' @ [217:30] ==> public open fun <E : (Any..Any?)> bindContent(p0: (MutableList<(TreeItem<out CashViewer.ViewerNode>..TreeItem<out CashViewer.ViewerNode>?)>..List<(TreeItem<out CashViewer.ViewerNode>..TreeItem<out CashViewer.ViewerNode>?)>?), p1: (ObservableList<out (TreeItem<out CashViewer.ViewerNode>..TreeItem<out CashViewer.ViewerNode>?)>..ObservableList<out (TreeItem<out CashViewer.ViewerNode>..TreeItem<out CashViewer.ViewerNode>?)>?)): Unit defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TreeItem<out ViewerNode>

'children' @ [217:42] ==> val children: List<TreeItem<out CashViewer.ViewerNode.IssuerNode>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'currencyNodes' @ [217:52] ==> val currencyNodes: AggregatedList<TreeItem<CashViewer.ViewerNode.CurrencyNode>, (StateAndRef<Cash.State>..StateAndRef<Cash.State>?), Currency> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'treeItem' @ [218:21] ==> val treeItem: TreeItem<CashViewer.ViewerNode.IssuerNode> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'cashViewerTable' @ [221:9] ==> private final val cashViewerTable: TreeTableView<CashViewer.ViewerNode> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'apply' @ [221:25] ==> @InlineOnly public inline fun <T> TreeTableView<CashViewer.ViewerNode>.apply(block: TreeTableView<CashViewer.ViewerNode>.() -> Unit): TreeTableView<CashViewer.ViewerNode> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeTableView<ViewerNode>

'root' @ [222:13] ==> public final var <S : (Any..Any?)> TreeTableView<CashViewer.ViewerNode>.root: (TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>..TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ViewerNode

'TreeItem' @ [222:20] ==> public constructor TreeItem<T : (Any..Any?)>() defined in javafx.scene.control.TreeItem[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode..net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode?)

'root' @ [223:60] ==> public final var <S : (Any..Any?)> TreeTableView<CashViewer.ViewerNode>.root: (TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>..TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ViewerNode

'children' @ [223:65] ==> public final val <T : (Any..Any?)> TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>.children: (ObservableList<(TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>..TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>?)>..ObservableList<(TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>..TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode..net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode?)

'bindContent' @ [224:22] ==> public open fun <E : (Any..Any?)> bindContent(p0: (MutableList<(TreeItem<out CashViewer.ViewerNode>..TreeItem<out CashViewer.ViewerNode>?)>..List<(TreeItem<out CashViewer.ViewerNode>..TreeItem<out CashViewer.ViewerNode>?)>?), p1: (ObservableList<out (TreeItem<out CashViewer.ViewerNode>..TreeItem<out CashViewer.ViewerNode>?)>..ObservableList<out (TreeItem<out CashViewer.ViewerNode>..TreeItem<out CashViewer.ViewerNode>?)>?)): Unit defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TreeItem<out ViewerNode>

'children' @ [224:34] ==> val children: List<TreeItem<out CashViewer.ViewerNode>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'cashViewerIssueNodes' @ [224:44] ==> val cashViewerIssueNodes: ObservableList<TreeItem<out CashViewer.ViewerNode.IssuerNode>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>[LocalVariableDescriptor]

'root' @ [225:13] ==> public final var <S : (Any..Any?)> TreeTableView<CashViewer.ViewerNode>.root: (TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>..TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ViewerNode

'isExpanded' @ [225:18] ==> public final var <T : (Any..Any?)> TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>.isExpanded: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode..net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode?)

'isShowRoot' @ [226:13] ==> public final var <S : (Any..Any?)> TreeTableView<CashViewer.ViewerNode>.isShowRoot: Boolean[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ViewerNode

'setColumnPrefWidthPolicy' @ [228:13] ==> public fun <S> TreeTableView<CashViewer.ViewerNode>.setColumnPrefWidthPolicy(getColumnWidth: (tableWidthWithoutPaddingAndBorder: Number, column: TreeTableColumn<CashViewer.ViewerNode, *>) -> Number): Unit defined in net.corda.explorer.ui[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> ViewerNode

'floor' @ [229:22] ==> public open fun floor(p0: Double): Double defined in java.lang.Math[JavaMethodDescriptor]

'tableWidthWithoutPaddingAndBorder' @ [229:28] ==> value-parameter tableWidthWithoutPaddingAndBorder: Number defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toDouble' @ [229:62] ==> public abstract fun toDouble(): Double defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'columns' @ [229:75] ==> public final val <S : (Any..Any?)> TreeTableView<CashViewer.ViewerNode>.columns: (ObservableList<(TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), *>..TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), *>?)>..ObservableList<(TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), *>..TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), *>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ViewerNode

'size' @ [229:83] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'toInt' @ [229:89] ==> public open fun toInt(): Int defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'AmountFormatter' @ [232:35] ==> public object AmountFormatter defined in net.corda.explorer.formatters in file AmountFormatter.kt[FakeCallableDescriptorForObject]

'boring' @ [232:51] ==> public final val boring: Formatter<Amount<Currency>> defined in net.corda.explorer.formatters.AmountFormatter[PropertyDescriptorImpl]

'toTreeTableCellFactory' @ [232:58] ==> public fun <S, T> Formatter<Amount<Currency>>.toTreeTableCellFactory(): Callback<TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>, TreeTableCell<CashViewer.ViewerNode, Amount<Currency>?>> defined in net.corda.explorer.ui[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> ViewerNode
    <T> -> Amount<Currency>

'cashViewerTableIssuerCurrency' @ [234:9] ==> private final val cashViewerTableIssuerCurrency: TreeTableColumn<CashViewer.ViewerNode, String> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'setCellValueFactory' @ [234:39] ==> public final fun setCellValueFactory(p0: (((TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), (String..String?)>..TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), (String..String?)>?)) -> (ObservableValue<(String..String?)>..ObservableValue<(String..String?)>?)..(((TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), (String..String?)>..TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), (String..String?)>?)) -> (ObservableValue<(String..String?)>..ObservableValue<(String..String?)>?))?)): Unit defined in javafx.scene.control.TreeTableColumn[MyFunctionDescriptor]

'it' @ [235:24] ==> value-parameter it: (TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), (String..String?)>..TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), (String..String?)>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [235:27] ==> public final val <S : (Any..Any?), T : (Any..Any?)> TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), (String..String?)>.value: (TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>..TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode..net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode?)
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'value' @ [235:33] ==> public final var <T : (Any..Any?)> TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>.value: (CashViewer.ViewerNode..CashViewer.ViewerNode?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode..net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode?)

'when (node) {
            // TODO: Anonymous should probably be italicised or similar
                is ViewerNode.IssuerNode -> SimpleStringProperty(node.issuer.nameOrNull()?.let { PartyNameFormatter.short.format(it) } ?: "Anonymous")
                is ViewerNode.CurrencyNode -> node.amount.map { it.token.toString() }
            }' @ [236:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (ObservableValue<(String..String?)>..ObservableValue<(String..String?)>?), entry1: (ObservableValue<(String..String?)>..ObservableValue<(String..String?)>?)): (ObservableValue<(String..String?)>..ObservableValue<(String..String?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javafx.beans.value.ObservableValue<(kotlin.String..kotlin.String?)>..javafx.beans.value.ObservableValue<(kotlin.String..kotlin.String?)>?)

'node' @ [236:19] ==> val node: (CashViewer.ViewerNode..CashViewer.ViewerNode?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'SimpleStringProperty' @ [238:45] ==> public constructor SimpleStringProperty(p0: (String..String?)) defined in javafx.beans.property.SimpleStringProperty[JavaClassConstructorDescriptor]

'node' @ [238:66] ==> val node: (CashViewer.ViewerNode..CashViewer.ViewerNode?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'issuer' @ [238:71] ==> public final val issuer: AbstractParty defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.IssuerNode[PropertyDescriptorImpl]

'nameOrNull' @ [238:78] ==> public abstract fun nameOrNull(): X500Name? defined in net.corda.core.identity.AbstractParty[DeserializedSimpleFunctionDescriptor]

'let' @ [238:92] ==> @InlineOnly public inline fun <T, R> X500Name.let(block: (X500Name) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X500Name
    <R> -> String

'PartyNameFormatter' @ [238:98] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'short' @ [238:117] ==> public final val short: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'format' @ [238:123] ==> public abstract fun format(value: X500Name): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [238:130] ==> value-parameter it: X500Name defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [239:47] ==> val node: (CashViewer.ViewerNode..CashViewer.ViewerNode?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'amount' @ [239:52] ==> public final val amount: ObservableValue<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.CurrencyNode[PropertyDescriptorImpl]

'map' @ [239:59] ==> public fun <A, B> ObservableValue<out Amount<Currency>>.map(function: (Amount<Currency>) -> (String..String?)): ObservableValue<(String..String?)> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Amount<Currency>
    <B> -> (kotlin.String..kotlin.String?)

'it' @ [239:65] ==> value-parameter it: Amount<Currency> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'token' @ [239:68] ==> public final val token: Currency defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'toString' @ [239:74] ==> public open fun toString(): String defined in java.util.Currency[JavaMethodDescriptor]

'cashViewerTableLocalCurrency' @ [242:9] ==> private final val cashViewerTableLocalCurrency: TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'apply' @ [242:38] ==> @InlineOnly public inline fun <T> TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>.apply(block: TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>.() -> Unit): TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeTableColumn<ViewerNode, Amount<Currency>?>

'setCellValueFactory' @ [243:13] ==> public final fun setCellValueFactory(p0: (((TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?)) -> (ObservableValue<Amount<Currency>?>..ObservableValue<Amount<Currency>?>?)..(((TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?)) -> (ObservableValue<Amount<Currency>?>..ObservableValue<Amount<Currency>?>?))?)): Unit defined in javafx.scene.control.TreeTableColumn[MyFunctionDescriptor]

'it' @ [244:28] ==> value-parameter it: (TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [244:31] ==> public final val <S : (Any..Any?), T : (Any..Any?)> TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>.value: (TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>..TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode..net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode?)
    <T : (Any..Any?)> -> Amount<Currency>?

'value' @ [244:37] ==> public final var <T : (Any..Any?)> TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>.value: (CashViewer.ViewerNode..CashViewer.ViewerNode?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode..net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode?)

'when (node) {
                    is ViewerNode.IssuerNode -> null.lift()
                    is ViewerNode.CurrencyNode -> node.amount.map { it }
                }' @ [245:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (ObservableValue<Amount<Currency>?>..ObservableValue<Amount<Currency>?>?), entry1: (ObservableValue<Amount<Currency>?>..ObservableValue<Amount<Currency>?>?)): (ObservableValue<Amount<Currency>?>..ObservableValue<Amount<Currency>?>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (javafx.beans.value.ObservableValue<net.corda.core.contracts.Amount<java.util.Currency>?>..javafx.beans.value.ObservableValue<net.corda.core.contracts.Amount<java.util.Currency>?>?)

'node' @ [245:23] ==> val node: (CashViewer.ViewerNode..CashViewer.ViewerNode?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'lift' @ [246:54] ==> public fun <A> Amount<Currency>?.lift(): ObservableValue<Amount<Currency>?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Amount<Currency>?

'node' @ [247:51] ==> val node: (CashViewer.ViewerNode..CashViewer.ViewerNode?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'amount' @ [247:56] ==> public final val amount: ObservableValue<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode.CurrencyNode[PropertyDescriptorImpl]

'map' @ [247:63] ==> public fun <A, B> ObservableValue<out Amount<Currency>>.map(function: (Amount<Currency>) -> Amount<Currency>?): ObservableValue<Amount<Currency>?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Amount<Currency>
    <B> -> Amount<Currency>?

'it' @ [247:69] ==> value-parameter it: Amount<Currency> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'cellFactory' @ [250:13] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>.cellFactory: (Callback<(TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?), (TreeTableCell<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableCell<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?)>..Callback<(TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?), (TreeTableCell<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableCell<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ViewerNode
    <T : (Any..Any?)> -> Amount<Currency>?

'currencyCellFactory' @ [250:27] ==> val currencyCellFactory: Callback<TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>, TreeTableCell<CashViewer.ViewerNode, Amount<Currency>?>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>[LocalVariableDescriptor]

'isSortable' @ [254:13] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>.isSortable: Boolean[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ViewerNode
    <T : (Any..Any?)> -> Amount<Currency>?

'cashViewerTableEquiv' @ [257:9] ==> private final val cashViewerTableEquiv: TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'apply' @ [257:30] ==> @InlineOnly public inline fun <T> TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>.apply(block: TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>.() -> Unit): TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeTableColumn<ViewerNode, Amount<Currency>?>

'setCellValueFactory' @ [258:13] ==> public final fun setCellValueFactory(p0: (((TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?)) -> (ObservableValue<Amount<Currency>?>..ObservableValue<Amount<Currency>?>?)..(((TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?)) -> (ObservableValue<Amount<Currency>?>..ObservableValue<Amount<Currency>?>?))?)): Unit defined in javafx.scene.control.TreeTableColumn[MyFunctionDescriptor]

'it' @ [259:17] ==> value-parameter it: (TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [259:20] ==> public final val <S : (Any..Any?), T : (Any..Any?)> TreeTableColumn.CellDataFeatures<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>.value: (TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>..TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode..net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode?)
    <T : (Any..Any?)> -> Amount<Currency>?

'value' @ [259:26] ==> public final var <T : (Any..Any?)> TreeItem<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>.value: (CashViewer.ViewerNode..CashViewer.ViewerNode?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode..net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode?)

'equivAmount' @ [259:32] ==> public final val equivAmount: ObservableValue<out Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode[PropertyDescriptorImpl]

'map' @ [259:44] ==> public fun <A, B> ObservableValue<out Amount<Currency>>.map(function: (Amount<Currency>) -> Amount<Currency>?): ObservableValue<Amount<Currency>?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Amount<Currency>
    <B> -> Amount<Currency>?

'it' @ [259:50] ==> value-parameter it: Amount<Currency> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'cellFactory' @ [261:13] ==> public final var <S : (Any..Any?), T : (Any..Any?)> TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>.cellFactory: (Callback<(TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?), (TreeTableCell<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableCell<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?)>..Callback<(TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableColumn<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?), (TreeTableCell<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>..TreeTableCell<(CashViewer.ViewerNode..CashViewer.ViewerNode?), Amount<Currency>?>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ViewerNode
    <T : (Any..Any?)> -> Amount<Currency>?

'currencyCellFactory' @ [261:27] ==> val currencyCellFactory: Callback<TreeTableColumn<CashViewer.ViewerNode, Amount<Currency>?>, TreeTableCell<CashViewer.ViewerNode, Amount<Currency>?>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>[LocalVariableDescriptor]

'textProperty' @ [262:13] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.TreeTableColumn[JavaMethodDescriptor]

'bind' @ [262:28] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'reportingCurrency' @ [262:33] ==> private final val reportingCurrency: ObservableValue<(Currency..Currency?)> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'map' @ [262:51] ==> public fun <A, B> ObservableValue<out (Currency..Currency?)>.map(function: ((Currency..Currency?)) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (java.util.Currency..java.util.Currency?)
    <B> -> String

'it' @ [262:59] ==> value-parameter it: (Currency..Currency?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'totalPositionsLabel' @ [266:9] ==> private final val totalPositionsLabel: Label defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'textProperty' @ [266:29] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.Label[JavaMethodDescriptor]

'bind' @ [266:44] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'cashStatesList' @ [266:49] ==> private final val cashStatesList: ListView<CashViewer.StateRow> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'itemsProperty' @ [266:64] ==> public final fun itemsProperty(): (ObjectProperty<(ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?)>..ObjectProperty<(ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?)>?) defined in javafx.scene.control.ListView[JavaMethodDescriptor]

'map' @ [266:80] ==> public fun <A, B> ObservableValue<out (ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?)>.map(function: ((ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?)) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (javafx.collections.ObservableList<(net.corda.explorer.views.cordapps.cash.CashViewer.StateRow..net.corda.explorer.views.cordapps.cash.CashViewer.StateRow?)>..javafx.collections.ObservableList<(net.corda.explorer.views.cordapps.cash.CashViewer.StateRow..net.corda.explorer.views.cordapps.cash.CashViewer.StateRow?)>?)
    <B> -> String

'if (it.size == 1) "" else "s"' @ [267:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [267:30] ==> value-parameter it: (ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [267:33] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'it' @ [268:22] ==> value-parameter it: (ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [268:25] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'plural' @ [268:40] ==> val plural: String defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'cashStatesList' @ [271:9] ==> private final val cashStatesList: ListView<CashViewer.StateRow> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'apply' @ [271:24] ==> @InlineOnly public inline fun <T> ListView<CashViewer.StateRow>.apply(block: ListView<CashViewer.StateRow>.() -> Unit): ListView<CashViewer.StateRow> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ListView<StateRow>

'itemsProperty' @ [273:13] ==> public final fun itemsProperty(): (ObjectProperty<(ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?)>..ObjectProperty<(ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?)>?) defined in javafx.scene.control.ListView[JavaMethodDescriptor]

'bind' @ [273:29] ==> public abstract fun bind(p0: (ObservableValue<out (ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?)>..ObservableValue<out (ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>..ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>?)>?)): Unit defined in javafx.beans.property.ObjectProperty[JavaMethodDescriptor]

'selectedNode' @ [273:34] ==> private final val selectedNode: ObservableValue<CashViewer.ViewerNode?> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'map' @ [273:47] ==> public fun <A, B> ObservableValue<out CashViewer.ViewerNode?>.map(function: (CashViewer.ViewerNode?) -> ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>): ObservableValue<ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> ViewerNode?
    <B> -> ObservableList<(net.corda.explorer.views.cordapps.cash.CashViewer.StateRow..net.corda.explorer.views.cordapps.cash.CashViewer.StateRow?)>

'it' @ [273:53] ==> value-parameter it: CashViewer.ViewerNode? defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'states' @ [273:57] ==> public final val states: ObservableList<StateAndRef<Cash.State>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.ViewerNode[PropertyDescriptorImpl]

'map' @ [273:65] ==> public fun <A, B> ObservableList<out StateAndRef<Cash.State>>.map(cached: Boolean = ..., function: (StateAndRef<Cash.State>) -> (CashViewer.StateRow..CashViewer.StateRow?)): ObservableList<(CashViewer.StateRow..CashViewer.StateRow?)> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> StateAndRef<State>
    <B> -> (net.corda.explorer.views.cordapps.cash.CashViewer.StateRow..net.corda.explorer.views.cordapps.cash.CashViewer.StateRow?)

'StateRow' @ [273:71] ==> public constructor StateRow(originated: LocalDateTime, stateAndRef: StateAndRef<Cash.State>) defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRow[ClassConstructorDescriptorImpl]

'now' @ [273:94] ==> public open fun now(): (LocalDateTime..LocalDateTime?) defined in java.time.LocalDateTime[JavaMethodDescriptor]

'it' @ [273:101] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ObservableListWrapper' @ [273:110] ==> public constructor ObservableListWrapper<E : (Any..Any?)>(p0: (MutableList<(CashViewer.StateRow..CashViewer.StateRow?)>..List<(CashViewer.StateRow..CashViewer.StateRow?)>?)) defined in com.sun.javafx.collections.ObservableListWrapper[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> StateRow

'emptyList' @ [273:132] ==> public fun <T> emptyList(): List<CashViewer.StateRow> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRow

'setCustomCellFactory' @ [274:13] ==> public fun <T> ListView<CashViewer.StateRow>.setCustomCellFactory(toNode: (CashViewer.StateRow) -> Node): Unit defined in net.corda.explorer.ui[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> StateRow

'StateRowGraphic' @ [274:36] ==> public constructor StateRowGraphic(stateRow: CashViewer.StateRow) defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[ClassConstructorDescriptorImpl]

'it' @ [274:52] ==> value-parameter it: CashViewer.StateRow defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'root' @ [274:56] ==> public open val root: Parent defined in net.corda.explorer.views.cordapps.cash.CashViewer.StateRowGraphic[PropertyDescriptorImpl]

'totalMatchingLabel' @ [278:9] ==> private final val totalMatchingLabel: Label defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'textProperty' @ [278:28] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.Label[JavaMethodDescriptor]

'bind' @ [278:43] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'size' @ [278:57] ==> public open fun <E : (Any..Any?)> size(p0: (ObservableList<(TreeItem<out CashViewer.ViewerNode.IssuerNode>..TreeItem<out CashViewer.ViewerNode.IssuerNode>?)>..ObservableList<(TreeItem<out CashViewer.ViewerNode.IssuerNode>..TreeItem<out CashViewer.ViewerNode.IssuerNode>?)>?)): (IntegerBinding..IntegerBinding?) defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TreeItem<out IssuerNode>

'cashViewerIssueNodes' @ [278:62] ==> val cashViewerIssueNodes: ObservableList<TreeItem<out CashViewer.ViewerNode.IssuerNode>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>[LocalVariableDescriptor]

'map' @ [278:84] ==> public fun <A, B> ObservableValue<out (Number..Number?)>.map(function: ((Number..Number?)) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (kotlin.Number..kotlin.Number?)
    <B> -> String

'if (it == 1) "" else "s"' @ [279:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [279:30] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [280:21] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'plural' @ [280:40] ==> val plural: String defined in net.corda.explorer.views.cordapps.cash.CashViewer.<init>.<anonymous>[LocalVariableDescriptor]

'toggleButton' @ [283:9] ==> private final val toggleButton: Button defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'setOnAction' @ [283:22] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'cashViewerTable' @ [284:13] ==> private final val cashViewerTable: TreeTableView<CashViewer.ViewerNode> defined in net.corda.explorer.views.cordapps.cash.CashViewer[PropertyDescriptorImpl]

'selectionModel' @ [284:29] ==> public final var <S : (Any..Any?)> TreeTableView<CashViewer.ViewerNode>.selectionModel: (TreeTableView.TreeTableViewSelectionModel<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>..TreeTableView.TreeTableViewSelectionModel<(CashViewer.ViewerNode..CashViewer.ViewerNode?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> ViewerNode

'clearSelection' @ [284:44] ==> public open fun clearSelection(): Unit defined in javafx.scene.control.TreeTableView.TreeTableViewSelectionModel[JavaMethodDescriptor]

'VBox' @ [288:32] ==> public constructor VBox() defined in javafx.scene.layout.VBox[JavaClassConstructorDescriptor]

'observableValue' @ [290:42] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (SettingsModel) -> ObservableValue<(Currency..Currency?)>): TrackedDelegate.ObservableValueDelegate<SettingsModel, (Currency..Currency?)> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> SettingsModel
    <T> -> (java.util.Currency..java.util.Currency?)

'SettingsModel' @ [290:58] ==> public constructor SettingsModel(path: Path = ...) defined in net.corda.explorer.model.SettingsModel[ClassConstructorDescriptorImpl]

'observableList' @ [291:35] ==> public inline fun <reified M : Any, T> observableList(noinline observableListProperty: (ContractStateModel) -> ObservableList<StateAndRef<Cash.State>>): TrackedDelegate.ObservableListDelegate<ContractStateModel, StateAndRef<Cash.State>> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> ContractStateModel
    <T> -> StateAndRef<State>

'ContractStateModel' @ [291:50] ==> public companion object defined in net.corda.client.jfx.model.ContractStateModel[FakeCallableDescriptorForObject]

'observableValue' @ [292:68] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (ExchangeRateModel) -> ObservableValue<ExchangeRate>): TrackedDelegate.ObservableValueDelegate<ExchangeRateModel, ExchangeRate> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> ExchangeRateModel
    <T> -> ExchangeRate

'ExchangeRateModel' @ [292:84] ==> public constructor ExchangeRateModel() defined in net.corda.client.jfx.model.ExchangeRateModel[DeserializedClassConstructorDescriptor]

'AmountBindings' @ [293:33] ==> public object AmountBindings defined in net.corda.client.jfx.utils[FakeCallableDescriptorForObject]

'sumAmountExchange' @ [293:48] ==> public final fun sumAmountExchange(amounts: ObservableList<Amount<Currency>>, currency: ObservableValue<Currency>, exchangeRate: ObservableValue<ExchangeRate>): ObservableValue<Amount<Currency>> defined in net.corda.client.jfx.utils.AmountBindings[DeserializedSimpleFunctionDescriptor]

'cashStates' @ [294:17] ==> private final val cashStates: ObservableList<StateAndRef<Cash.State>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget[PropertyDescriptorImpl]

'map' @ [294:28] ==> public fun <A, B> ObservableList<out StateAndRef<Cash.State>>.map(cached: Boolean = ..., function: (StateAndRef<Cash.State>) -> Amount<Currency>): ObservableList<Amount<Currency>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> StateAndRef<State>
    <B> -> Amount<Currency>

'it' @ [294:34] ==> value-parameter it: StateAndRef<Cash.State> defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget.sumAmount.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [294:37] ==> public final val state: TransactionState<Cash.State> defined in net.corda.core.contracts.StateAndRef[DeserializedPropertyDescriptor]

'data' @ [294:43] ==> public final val data: Cash.State defined in net.corda.core.contracts.TransactionState[DeserializedPropertyDescriptor]

'amount' @ [294:48] ==> public open val amount: Amount<Issued<Currency>> defined in net.corda.finance.contracts.asset.Cash.State[DeserializedPropertyDescriptor]

'withoutIssuer' @ [294:55] ==> public fun <T : Any> Amount<Issued<Currency>>.withoutIssuer(): Amount<Currency> defined in net.corda.core.contracts[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Currency

'reportingCurrency' @ [295:17] ==> private final val reportingCurrency: ObservableValue<(Currency..Currency?)> defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget[PropertyDescriptorImpl]

'exchangeRate' @ [296:17] ==> private final val exchangeRate: ObservableValue<ExchangeRate> defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget[PropertyDescriptorImpl]

'padding' @ [299:13] ==> public final var CashViewer.CashWidget.padding: (Insets..Insets?)[MyPropertyDescriptor]

'Insets' @ [299:23] ==> public constructor Insets(@NamedArg p0: Double, @NamedArg p1: Double, @NamedArg p2: Double, @NamedArg p3: Double) defined in javafx.geometry.Insets[JavaClassConstructorDescriptor]

'NumberAxis' @ [300:25] ==> public constructor NumberAxis() defined in javafx.scene.chart.NumberAxis[JavaClassConstructorDescriptor]

'apply' @ [300:38] ==> @InlineOnly public inline fun <T> NumberAxis.apply(block: NumberAxis.() -> Unit): NumberAxis defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NumberAxis

'isMinorTickVisible' @ [302:17] ==> public final var NumberAxis.isMinorTickVisible: Boolean[MyPropertyDescriptor]

'isForceZeroInRange' @ [303:17] ==> public final var NumberAxis.isForceZeroInRange: Boolean[MyPropertyDescriptor]

'tickLabelFormatter' @ [304:17] ==> public final var NumberAxis.tickLabelFormatter: (StringConverter<(Number..Number?)>..StringConverter<(Number..Number?)>?)[MyPropertyDescriptor]

'stringConverter' @ [304:38] ==> public fun <T> stringConverter(fromStringFunction: ((String?) -> (Number..Number?))? = ..., toStringFunction: ((Number..Number?)) -> String): StringConverter<(Number..Number?)> defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Number..kotlin.Number?)

'ofEpochMilli' @ [305:29] ==> public open fun ofEpochMilli(p0: Long): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'it' @ [305:42] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toLong' @ [305:45] ==> public abstract fun toLong(): Long defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'atZone' @ [305:55] ==> public open fun atZone(p0: (ZoneId..ZoneId?)): (ZonedDateTime..ZonedDateTime?) defined in java.time.Instant[JavaMethodDescriptor]

'getDefault' @ [305:71] ==> public open fun getDefault(): (TimeZone..TimeZone?) defined in java.util.TimeZone[JavaMethodDescriptor]

'toZoneId' @ [305:84] ==> public open fun toZoneId(): (ZoneId..ZoneId?) defined in java.util.TimeZone[JavaMethodDescriptor]

'toLocalTime' @ [305:96] ==> public open fun toLocalTime(): (LocalTime..LocalTime?) defined in java.time.ZonedDateTime[JavaMethodDescriptor]

'toString' @ [305:110] ==> public open fun toString(): String defined in java.time.LocalTime[JavaMethodDescriptor]

'NumberAxis' @ [308:25] ==> public constructor NumberAxis() defined in javafx.scene.chart.NumberAxis[JavaClassConstructorDescriptor]

'apply' @ [308:38] ==> @InlineOnly public inline fun <T> NumberAxis.apply(block: NumberAxis.() -> Unit): NumberAxis defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NumberAxis

'isAutoRanging' @ [309:17] ==> public final var NumberAxis.isAutoRanging: Boolean[MyPropertyDescriptor]

'isMinorTickVisible' @ [310:17] ==> public final var NumberAxis.isMinorTickVisible: Boolean[MyPropertyDescriptor]

'isForceZeroInRange' @ [311:17] ==> public final var NumberAxis.isForceZeroInRange: Boolean[MyPropertyDescriptor]

'tickLabelFormatter' @ [312:17] ==> public final var NumberAxis.tickLabelFormatter: (StringConverter<(Number..Number?)>..StringConverter<(Number..Number?)>?)[MyPropertyDescriptor]

'stringConverter' @ [312:38] ==> public fun <T> stringConverter(fromStringFunction: ((String?) -> (Number..Number?))? = ..., toStringFunction: ((Number..Number?)) -> String): StringConverter<(Number..Number?)> defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Number..kotlin.Number?)

'it' @ [312:56] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toStringWithSuffix' @ [312:59] ==> public fun Number.toStringWithSuffix(precision: Int = ...): String defined in net.corda.explorer.views in file GuiUtilities.kt[SimpleFunctionDescriptorImpl]

'linechart' @ [314:13] ==> public fun <X, Y> EventTarget.linechart(title: String? = ..., x: Axis<(Number..Number?)>, y: Axis<(Number..Number?)>, op: (LineChart<(Number..Number?), (Number..Number?)>.() -> Unit)? = ...): LineChart<(Number..Number?), (Number..Number?)> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <X> -> (kotlin.Number..kotlin.Number?)
    <Y> -> (kotlin.Number..kotlin.Number?)

'xAxis' @ [314:29] ==> val xAxis: NumberAxis defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget.<init>[LocalVariableDescriptor]

'yAxis' @ [314:36] ==> val yAxis: NumberAxis defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget.<init>[LocalVariableDescriptor]

'series' @ [315:17] ==> public fun <X, Y, ChartType : XYChart<(Number..Number?), (Number..Number?)>> LineChart<(Number..Number?), (Number..Number?)>.series(name: String, elements: ObservableList<XYChart.Data<(Number..Number?), (Number..Number?)>>? = ..., op: (XYChart.Series<(Number..Number?), (Number..Number?)>.() -> Unit)? = ...): XYChart.Series<(Number..Number?), (Number..Number?)> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <X> -> (kotlin.Number..kotlin.Number?)
    <Y> -> (kotlin.Number..kotlin.Number?)
    <ChartType : XYChart<X, Y>> -> LineChart<(kotlin.Number..kotlin.Number?), (kotlin.Number..kotlin.Number?)>

'sumAmount' @ [316:21] ==> private final val sumAmount: ObservableValue<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget[PropertyDescriptorImpl]

'addListener' @ [316:31] ==> public final fun addListener(p0: (((ObservableValue<out (Amount<Currency>..Amount<Currency>?)>..ObservableValue<out (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?), (Amount<Currency>..Amount<Currency>?)) -> Unit..(((ObservableValue<out (Amount<Currency>..Amount<Currency>?)>..ObservableValue<out (Amount<Currency>..Amount<Currency>?)>?), (Amount<Currency>..Amount<Currency>?), (Amount<Currency>..Amount<Currency>?)) -> Unit)?)): Unit defined in javafx.beans.value.ObservableValue[MyFunctionDescriptor]

'data' @ [317:45] ==> public final var <X : (Any..Any?), Y : (Any..Any?)> XYChart.Series<(Number..Number?), (Number..Number?)>.data: (ObservableList<(XYChart.Data<(Number..Number?), (Number..Number?)>..XYChart.Data<(Number..Number?), (Number..Number?)>?)>..ObservableList<(XYChart.Data<(Number..Number?), (Number..Number?)>..XYChart.Data<(Number..Number?), (Number..Number?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)
    <Y : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)

'last' @ [317:50] ==> public fun <A> ObservableList<(XYChart.Data<(Number..Number?), (Number..Number?)>..XYChart.Data<(Number..Number?), (Number..Number?)>?)>.last(): ObservableValue<XYChart.Data<(Number..Number?), (Number..Number?)>?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (javafx.scene.chart.XYChart.Data<(kotlin.Number..kotlin.Number?), (kotlin.Number..kotlin.Number?)>..javafx.scene.chart.XYChart.Data<(kotlin.Number..kotlin.Number?), (kotlin.Number..kotlin.Number?)>?)

'value' @ [317:57] ==> public final val <T : (Any..Any?)> ObservableValue<XYChart.Data<(Number..Number?), (Number..Number?)>?>.value: XYChart.Data<(Number..Number?), (Number..Number?)>?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Data<(kotlin.Number..kotlin.Number?), (kotlin.Number..kotlin.Number?)>?

'xValue' @ [317:64] ==> public final var <X : (Any..Any?), Y : (Any..Any?)> XYChart.Data<(Number..Number?), (Number..Number?)>.xValue: (Number..Number?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)
    <Y : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)

'lastTimeStamp' @ [318:29] ==> val lastTimeStamp: Number? defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'-' @ [318:54] ==> public final operator fun minus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'currentTimeMillis' @ [318:61] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'lastTimeStamp' @ [318:83] ==> val lastTimeStamp: Number? defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toLong' @ [318:97] ==> public abstract fun toLong(): Long defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'seconds' @ [318:110] ==> public val Number.seconds: Duration defined in tornadofx[DeserializedPropertyDescriptor]

'toMillis' @ [318:118] ==> public open fun toMillis(): Double defined in javafx.util.Duration[JavaMethodDescriptor]

'data' @ [319:29] ==> public fun <X, Y> XYChart.Series<(Number..Number?), (Number..Number?)>.data(x: (Number..Number?), y: (Number..Number?), extra: Any? = ..., op: (XYChart.Data<(Number..Number?), (Number..Number?)>.() -> Unit)? = ...): XYChart.Data<(Number..Number?), (Number..Number?)> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <X> -> (kotlin.Number..kotlin.Number?)
    <Y> -> (kotlin.Number..kotlin.Number?)

'currentTimeMillis' @ [319:41] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'sumAmount' @ [319:62] ==> private final val sumAmount: ObservableValue<Amount<Currency>> defined in net.corda.explorer.views.cordapps.cash.CashViewer.CashWidget[PropertyDescriptorImpl]

'value' @ [319:72] ==> public final val <T : (Any..Any?)> ObservableValue<Amount<Currency>>.value: (Amount<Currency>..Amount<Currency>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Amount<Currency>

'quantity' @ [319:78] ==> public final val quantity: Long defined in net.corda.core.contracts.Amount[DeserializedPropertyDescriptor]

'runInFxApplicationThread' @ [320:29] ==> public fun runInFxApplicationThread(block: () -> Unit): Unit defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]

'data' @ [322:37] ==> public final var <X : (Any..Any?), Y : (Any..Any?)> XYChart.Series<(Number..Number?), (Number..Number?)>.data: (ObservableList<(XYChart.Data<(Number..Number?), (Number..Number?)>..XYChart.Data<(Number..Number?), (Number..Number?)>?)>..ObservableList<(XYChart.Data<(Number..Number?), (Number..Number?)>..XYChart.Data<(Number..Number?), (Number..Number?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)
    <Y : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)

'size' @ [322:42] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'data' @ [322:54] ==> public final var <X : (Any..Any?), Y : (Any..Any?)> XYChart.Series<(Number..Number?), (Number..Number?)>.data: (ObservableList<(XYChart.Data<(Number..Number?), (Number..Number?)>..XYChart.Data<(Number..Number?), (Number..Number?)>?)>..ObservableList<(XYChart.Data<(Number..Number?), (Number..Number?)>..XYChart.Data<(Number..Number?), (Number..Number?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)
    <Y : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)

'remove' @ [322:59] ==> public abstract fun remove(p0: Int, p1: Int): Unit defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'createSymbols' @ [327:17] ==> public final var <X : (Any..Any?), Y : (Any..Any?)> LineChart<(Number..Number?), (Number..Number?)>.createSymbols: Boolean[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)
    <Y : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)

'animated' @ [328:17] ==> public final var <X : (Any..Any?), Y : (Any..Any?)> LineChart<(Number..Number?), (Number..Number?)>.animated: Boolean[MyPropertyDescriptor]
Inferred types:
    <X : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)
    <Y : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)

