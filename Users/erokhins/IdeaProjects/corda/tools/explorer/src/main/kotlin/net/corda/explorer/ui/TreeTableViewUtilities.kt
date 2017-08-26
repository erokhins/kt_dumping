'createDoubleBinding' @ [16:54] ==> public final fun createDoubleBinding(p0: (() -> (Double..Double?)..(() -> (Double..Double?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (DoubleBinding..DoubleBinding?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]

'padding' @ [17:23] ==> public final var <S : (Any..Any?)> TreeTableView<S>.padding: (Insets..Insets?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'border' @ [18:28] ==> public final var <S : (Any..Any?)> TreeTableView<S>.border: (Border..Border?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'insets' @ [18:36] ==> public final val Border.insets: (Insets..Insets?)[MyPropertyDescriptor]

'width' @ [19:9] ==> public final var <S : (Any..Any?)> TreeTableView<S>.width: Double[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'if (padding != null) padding.left + padding.right else 0.0' @ [20:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Double, elseBranch: Double): Double[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Double

'padding' @ [20:22] ==> val padding: (Insets..Insets?) defined in net.corda.explorer.ui.setColumnPrefWidthPolicy.<anonymous>[LocalVariableDescriptor]

'padding' @ [20:39] ==> val padding: (Insets..Insets?) defined in net.corda.explorer.ui.setColumnPrefWidthPolicy.<anonymous>[LocalVariableDescriptor]

'left' @ [20:47] ==> public final val Insets.left: Double[MyPropertyDescriptor]

'padding' @ [20:54] ==> val padding: (Insets..Insets?) defined in net.corda.explorer.ui.setColumnPrefWidthPolicy.<anonymous>[LocalVariableDescriptor]

'right' @ [20:62] ==> public final val Insets.right: Double[MyPropertyDescriptor]

'if (borderInsets != null) borderInsets.left + borderInsets.right else 0.0' @ [21:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Double, elseBranch: Double): Double[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Double

'borderInsets' @ [21:22] ==> val borderInsets: Insets? defined in net.corda.explorer.ui.setColumnPrefWidthPolicy.<anonymous>[LocalVariableDescriptor]

'borderInsets' @ [21:44] ==> val borderInsets: Insets? defined in net.corda.explorer.ui.setColumnPrefWidthPolicy.<anonymous>[LocalVariableDescriptor]

'left' @ [21:57] ==> public final val Insets.left: Double[MyPropertyDescriptor]

'borderInsets' @ [21:64] ==> val borderInsets: Insets? defined in net.corda.explorer.ui.setColumnPrefWidthPolicy.<anonymous>[LocalVariableDescriptor]

'right' @ [21:77] ==> public final val Insets.right: Double[MyPropertyDescriptor]

'arrayOf' @ [22:8] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (Observable..Observable?)): Array<(Observable..Observable?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (javafx.beans.Observable..javafx.beans.Observable?)

'columns' @ [22:16] ==> public final val <S : (Any..Any?)> TreeTableView<S>.columns: (ObservableList<(TreeTableColumn<(S..S?), *>..TreeTableColumn<(S..S?), *>?)>..ObservableList<(TreeTableColumn<(S..S?), *>..TreeTableColumn<(S..S?), *>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'widthProperty' @ [22:25] ==> public final fun widthProperty(): (ReadOnlyDoubleProperty..ReadOnlyDoubleProperty?) defined in javafx.scene.control.TreeTableView[JavaMethodDescriptor]

'paddingProperty' @ [22:42] ==> public final fun paddingProperty(): (ObjectProperty<(Insets..Insets?)>..ObjectProperty<(Insets..Insets?)>?) defined in javafx.scene.control.TreeTableView[JavaMethodDescriptor]

'borderProperty' @ [22:61] ==> public final fun borderProperty(): (ObjectProperty<(Border..Border?)>..ObjectProperty<(Border..Border?)>?) defined in javafx.scene.control.TreeTableView[JavaMethodDescriptor]

'columns' @ [24:5] ==> public final val <S : (Any..Any?)> TreeTableView<S>.columns: (ObservableList<(TreeTableColumn<(S..S?), *>..TreeTableColumn<(S..S?), *>?)>..ObservableList<(TreeTableColumn<(S..S?), *>..TreeTableColumn<(S..S?), *>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'forEach' @ [24:13] ==> @HidesMembers public inline fun <T> Iterable<(TreeTableColumn<(S..S?), *>..TreeTableColumn<(S..S?), *>?)>.forEach(action: ((TreeTableColumn<(S..S?), *>..TreeTableColumn<(S..S?), *>?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javafx.scene.control.TreeTableColumn<(S..S?), *>..javafx.scene.control.TreeTableColumn<(S..S?), *>?)

'it' @ [25:9] ==> value-parameter it: (TreeTableColumn<(S..S?), *>..TreeTableColumn<(S..S?), *>?) defined in net.corda.explorer.ui.setColumnPrefWidthPolicy.<anonymous>[ValueParameterDescriptorImpl]

'setPrefWidthPolicy' @ [25:12] ==> private fun <S> TreeTableColumn<S, *>.setPrefWidthPolicy(widthWithoutPaddingAndBorder: ObservableValue<Number>, getColumnWidth: (tableWidthWithoutPaddingAndBorder: Number, column: TreeTableColumn<S, *>) -> Number): Unit defined in net.corda.explorer.ui[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> S

'tableWidthWithoutPaddingAndBorder' @ [25:31] ==> val tableWidthWithoutPaddingAndBorder: (DoubleBinding..DoubleBinding?) defined in net.corda.explorer.ui.setColumnPrefWidthPolicy[LocalVariableDescriptor]

'getColumnWidth' @ [25:66] ==> value-parameter getColumnWidth: (tableWidthWithoutPaddingAndBorder: Number, column: TreeTableColumn<S, *>) -> Number defined in net.corda.explorer.ui.setColumnPrefWidthPolicy[ValueParameterDescriptorImpl]

'prefWidthProperty' @ [33:5] ==> public final fun prefWidthProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.TreeTableColumn[JavaMethodDescriptor]

'bind' @ [33:25] ==> public abstract fun bind(p0: (ObservableValue<out (Number..Number?)>..ObservableValue<out (Number..Number?)>?)): Unit defined in javafx.beans.property.DoubleProperty[JavaMethodDescriptor]

'map' @ [33:39] ==> public final fun <T : (Any..Any?), U : (Any..Any?)> map(p0: (ObservableValue<(Number..Number?)>..ObservableValue<(Number..Number?)>?), p1: (((Number..Number?)) -> (Number..Number?)..(((Number..Number?)) -> (Number..Number?))?)): (MonadicBinding<(Number..Number?)>..MonadicBinding<(Number..Number?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)
    <U : (Any..Any?)> -> (kotlin.Number..kotlin.Number?)

'widthWithoutPaddingAndBorder' @ [33:43] ==> value-parameter widthWithoutPaddingAndBorder: ObservableValue<Number> defined in net.corda.explorer.ui.setPrefWidthPolicy[ValueParameterDescriptorImpl]

'invoke' @ [34:9] ==> public abstract operator fun invoke(tableWidthWithoutPaddingAndBorder: @ParameterName Number, column: @ParameterName TreeTableColumn<S, *>): Number defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [34:24] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.ui.setPrefWidthPolicy.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [34:28] ==> <this> defined in net.corda.explorer.ui.setPrefWidthPolicy[ReceiverParameterDescriptorImpl]

'Callback' @ [38:52] ==> @FunctionalInterface public fun <P : (Any..Any?), R : (Any..Any?)> Callback(function: ((TreeTableColumn<S, T?>..TreeTableColumn<S, T?>?)) -> (TreeTableCell<S, T?>..TreeTableCell<S, T?>?)): Callback<TreeTableColumn<S, T?>, TreeTableCell<S, T?>> defined in javafx.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : (Any..Any?)> -> TreeTableColumn<S, T?>
    <R : (Any..Any?)> -> TreeTableCell<S, T?>

'TreeTableCell<S, T?>' @ [39:14] ==> public constructor TreeTableCell<S : (Any..Any?), T : (Any..Any?)>() defined in javafx.scene.control.TreeTableCell[JavaClassConstructorDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S
    <T : (Any..Any?)> -> T?

'super' @ [41:13] ==> <this> defined in net.corda.explorer.ui.toTreeTableCellFactory.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'updateItem' @ [41:19] ==> protected/*protected and package*/ open fun updateItem(p0: T?, p1: Boolean): Unit defined in javafx.scene.control.TreeTableCell[JavaMethodDescriptor]

'value' @ [41:30] ==> value-parameter value: T? defined in net.corda.explorer.ui.toTreeTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'empty' @ [41:37] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.toTreeTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'text' @ [42:13] ==> public final var <S, T> <no name provided><S, T>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <S> -> S
    <T> -> T

'if (value == null || empty) {
                ""
            } else {
                format(value)
            }' @ [42:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'value' @ [42:24] ==> value-parameter value: T? defined in net.corda.explorer.ui.toTreeTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'empty' @ [42:41] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.toTreeTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'format' @ [45:17] ==> public abstract fun format(value: T): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'value' @ [45:24] ==> value-parameter value: T? defined in net.corda.explorer.ui.toTreeTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'createObjectBinding' @ [52:18] ==> public final fun <T : (Any..Any?)> createObjectBinding(p0: (() -> (SingleRowSelection<(S..S?)>..SingleRowSelection<(S..S?)>?)..(() -> (SingleRowSelection<(S..S?)>..SingleRowSelection<(S..S?)>?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (ObjectBinding<(SingleRowSelection<(S..S?)>..SingleRowSelection<(S..S?)>?)>..ObjectBinding<(SingleRowSelection<(S..S?)>..SingleRowSelection<(S..S?)>?)>?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.explorer.ui.SingleRowSelection<(S..S?)>..net.corda.explorer.ui.SingleRowSelection<(S..S?)>?)

'if (selectionModel.selectedItems.size == 0) {
                SingleRowSelection.None<S>()
            } else {
                SingleRowSelection.Selected(selectionModel.selectedItems[0].value)
            }' @ [53:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SingleRowSelection<(S..S?)>, elseBranch: SingleRowSelection<(S..S?)>): SingleRowSelection<(S..S?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SingleRowSelection<(S..S?)>

'selectionModel' @ [53:17] ==> public final var <S : (Any..Any?)> TreeTableView<S>.selectionModel: (TreeTableView.TreeTableViewSelectionModel<(S..S?)>..TreeTableView.TreeTableViewSelectionModel<(S..S?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'selectedItems' @ [53:32] ==> public final val <S : (Any..Any?)> TreeTableView.TreeTableViewSelectionModel<(S..S?)>.selectedItems: (ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>..ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (S..S?)

'size' @ [53:46] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'None' @ [54:36] ==> public constructor None<out A>() defined in net.corda.explorer.ui.SingleRowSelection.None[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> S

'Selected' @ [56:36] ==> public constructor Selected<out A>(node: (S..S?)) defined in net.corda.explorer.ui.SingleRowSelection.Selected[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> (S..S?)

'selectionModel' @ [56:45] ==> public final var <S : (Any..Any?)> TreeTableView<S>.selectionModel: (TreeTableView.TreeTableViewSelectionModel<(S..S?)>..TreeTableView.TreeTableViewSelectionModel<(S..S?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'selectedItems' @ [56:60] ==> public final val <S : (Any..Any?)> TreeTableView.TreeTableViewSelectionModel<(S..S?)>.selectedItems: (ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>..ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (S..S?)

'value' @ [56:77] ==> public final var <T : (Any..Any?)> TreeItem<(S..S?)>.value: (S..S?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (S..S?)

'arrayOf' @ [58:12] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>..ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>?)): Array<(ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>..ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (javafx.collections.ObservableList<(javafx.scene.control.TreeItem<(S..S?)>..javafx.scene.control.TreeItem<(S..S?)>?)>..javafx.collections.ObservableList<(javafx.scene.control.TreeItem<(S..S?)>..javafx.scene.control.TreeItem<(S..S?)>?)>?)

'selectionModel' @ [58:20] ==> public final var <S : (Any..Any?)> TreeTableView<S>.selectionModel: (TreeTableView.TreeTableViewSelectionModel<(S..S?)>..TreeTableView.TreeTableViewSelectionModel<(S..S?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'selectedItems' @ [58:35] ==> public final val <S : (Any..Any?)> TreeTableView.TreeTableViewSelectionModel<(S..S?)>.selectedItems: (ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>..ObservableList<(TreeItem<(S..S?)>..TreeItem<(S..S?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (S..S?)

