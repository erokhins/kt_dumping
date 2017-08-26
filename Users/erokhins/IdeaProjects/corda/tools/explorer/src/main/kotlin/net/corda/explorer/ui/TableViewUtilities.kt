'createDoubleBinding' @ [16:54] ==> public final fun createDoubleBinding(p0: (() -> (Double..Double?)..(() -> (Double..Double?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (DoubleBinding..DoubleBinding?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]

'padding' @ [17:23] ==> public final var <S : (Any..Any?)> TableView<S>.padding: (Insets..Insets?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'border' @ [18:28] ==> public final var <S : (Any..Any?)> TableView<S>.border: (Border..Border?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'insets' @ [18:36] ==> public final val Border.insets: (Insets..Insets?)[MyPropertyDescriptor]

'width' @ [19:9] ==> public final var <S : (Any..Any?)> TableView<S>.width: Double[MyPropertyDescriptor]
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

'columns' @ [22:16] ==> public final val <S : (Any..Any?)> TableView<S>.columns: (ObservableList<(TableColumn<(S..S?), *>..TableColumn<(S..S?), *>?)>..ObservableList<(TableColumn<(S..S?), *>..TableColumn<(S..S?), *>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'widthProperty' @ [22:25] ==> public final fun widthProperty(): (ReadOnlyDoubleProperty..ReadOnlyDoubleProperty?) defined in javafx.scene.control.TableView[JavaMethodDescriptor]

'paddingProperty' @ [22:42] ==> public final fun paddingProperty(): (ObjectProperty<(Insets..Insets?)>..ObjectProperty<(Insets..Insets?)>?) defined in javafx.scene.control.TableView[JavaMethodDescriptor]

'borderProperty' @ [22:61] ==> public final fun borderProperty(): (ObjectProperty<(Border..Border?)>..ObjectProperty<(Border..Border?)>?) defined in javafx.scene.control.TableView[JavaMethodDescriptor]

'columns' @ [24:5] ==> public final val <S : (Any..Any?)> TableView<S>.columns: (ObservableList<(TableColumn<(S..S?), *>..TableColumn<(S..S?), *>?)>..ObservableList<(TableColumn<(S..S?), *>..TableColumn<(S..S?), *>?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'forEach' @ [24:13] ==> @HidesMembers public inline fun <T> Iterable<(TableColumn<(S..S?), *>..TableColumn<(S..S?), *>?)>.forEach(action: ((TableColumn<(S..S?), *>..TableColumn<(S..S?), *>?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javafx.scene.control.TableColumn<(S..S?), *>..javafx.scene.control.TableColumn<(S..S?), *>?)

'it' @ [25:9] ==> value-parameter it: (TableColumn<(S..S?), *>..TableColumn<(S..S?), *>?) defined in net.corda.explorer.ui.setColumnPrefWidthPolicy.<anonymous>[ValueParameterDescriptorImpl]

'setPrefWidthPolicy' @ [25:12] ==> private fun <S> TableColumn<(S..S?), *>.setPrefWidthPolicy(widthWithoutPaddingAndBorder: ObservableValue<Number>, getColumnWidth: (tableWidthWithoutPaddingAndBorder: Number, column: TableColumn<(S..S?), *>) -> Number): Unit defined in net.corda.explorer.ui[SimpleFunctionDescriptorImpl]
Inferred types:
    <S> -> (S..S?)

'tableWidthWithoutPaddingAndBorder' @ [25:31] ==> val tableWidthWithoutPaddingAndBorder: (DoubleBinding..DoubleBinding?) defined in net.corda.explorer.ui.setColumnPrefWidthPolicy[LocalVariableDescriptor]

'getColumnWidth' @ [25:66] ==> value-parameter getColumnWidth: (tableWidthWithoutPaddingAndBorder: Number, column: TableColumn<S, *>) -> Number defined in net.corda.explorer.ui.setColumnPrefWidthPolicy[ValueParameterDescriptorImpl]

'prefWidthProperty' @ [33:5] ==> public final fun prefWidthProperty(): (DoubleProperty..DoubleProperty?) defined in javafx.scene.control.TableColumn[JavaMethodDescriptor]

'bind' @ [33:25] ==> public abstract fun bind(p0: (ObservableValue<out (Number..Number?)>..ObservableValue<out (Number..Number?)>?)): Unit defined in javafx.beans.property.DoubleProperty[JavaMethodDescriptor]

'map' @ [33:39] ==> public final fun <T : (Any..Any?), U : (Any..Any?)> map(p0: (ObservableValue<(Number..Number?)>..ObservableValue<(Number..Number?)>?), p1: (((Number..Number?)) -> (Number..Number?)..(((Number..Number?)) -> (Number..Number?))?)): (MonadicBinding<(Number..Number?)>..MonadicBinding<(Number..Number?)>?) defined in org.fxmisc.easybind.EasyBind[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Number
    <U : (Any..Any?)> -> Number

'widthWithoutPaddingAndBorder' @ [33:43] ==> value-parameter widthWithoutPaddingAndBorder: ObservableValue<Number> defined in net.corda.explorer.ui.setPrefWidthPolicy[ValueParameterDescriptorImpl]

'invoke' @ [34:9] ==> public abstract operator fun invoke(tableWidthWithoutPaddingAndBorder: @ParameterName Number, column: @ParameterName TableColumn<S, *>): Number defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [34:24] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.ui.setPrefWidthPolicy.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [34:28] ==> <this> defined in net.corda.explorer.ui.setPrefWidthPolicy[ReceiverParameterDescriptorImpl]

'Callback' @ [38:48] ==> @FunctionalInterface public fun <P : (Any..Any?), R : (Any..Any?)> Callback(function: ((TableColumn<S, T?>..TableColumn<S, T?>?)) -> (TableCell<S, T?>..TableCell<S, T?>?)): Callback<TableColumn<S, T?>, TableCell<S, T?>> defined in javafx.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : (Any..Any?)> -> TableColumn<S, T?>
    <R : (Any..Any?)> -> TableCell<S, T?>

'TableCell<S, T?>' @ [39:14] ==> public constructor TableCell<S : (Any..Any?), T : (Any..Any?)>() defined in javafx.scene.control.TableCell[JavaClassConstructorDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S
    <T : (Any..Any?)> -> T?

'super' @ [41:13] ==> <this> defined in net.corda.explorer.ui.toTableCellFactory.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'updateItem' @ [41:19] ==> protected/*protected and package*/ open fun updateItem(p0: T?, p1: Boolean): Unit defined in javafx.scene.control.TableCell[JavaMethodDescriptor]

'value' @ [41:30] ==> value-parameter value: T? defined in net.corda.explorer.ui.toTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'empty' @ [41:37] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.toTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

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

'value' @ [42:24] ==> value-parameter value: T? defined in net.corda.explorer.ui.toTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'empty' @ [42:41] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.toTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'format' @ [45:17] ==> public abstract fun format(value: T): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'value' @ [45:24] ==> value-parameter value: T? defined in net.corda.explorer.ui.toTableCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'createObjectBinding' @ [51:54] ==> public final fun <T : (Any..Any?)> createObjectBinding(p0: (() -> (SingleRowSelection<S?>..SingleRowSelection<S?>?)..(() -> (SingleRowSelection<S?>..SingleRowSelection<S?>?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (ObjectBinding<(SingleRowSelection<S?>..SingleRowSelection<S?>?)>..ObjectBinding<(SingleRowSelection<S?>..SingleRowSelection<S?>?)>?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SingleRowSelection<S?>

'if (selectionModel.selectedItems.size == 0) {
        SingleRowSelection.None<S>()
    } else {
        SingleRowSelection.Selected(selectionModel.selectedItems[0])
    }' @ [52:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SingleRowSelection<S?>, elseBranch: SingleRowSelection<S?>): SingleRowSelection<S?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SingleRowSelection<S?>

'selectionModel' @ [52:9] ==> public final var <S : (Any..Any?)> TableView<S>.selectionModel: (TableView.TableViewSelectionModel<(S..S?)>..TableView.TableViewSelectionModel<(S..S?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'selectedItems' @ [52:24] ==> public final val <S : (Any..Any?)> TableView.TableViewSelectionModel<(S..S?)>.selectedItems: (ObservableList<(S..S?)>..ObservableList<(S..S?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (S..S?)

'size' @ [52:38] ==> public abstract val size: Int defined in javafx.collections.ObservableList[DeserializedPropertyDescriptor]

'None' @ [53:28] ==> public constructor None<out A>() defined in net.corda.explorer.ui.SingleRowSelection.None[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> S

'Selected' @ [55:28] ==> public constructor Selected<out A>(node: (S..S?)) defined in net.corda.explorer.ui.SingleRowSelection.Selected[ClassConstructorDescriptorImpl]
Inferred types:
    <out A> -> (S..S?)

'selectionModel' @ [55:37] ==> public final var <S : (Any..Any?)> TableView<S>.selectionModel: (TableView.TableViewSelectionModel<(S..S?)>..TableView.TableViewSelectionModel<(S..S?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'selectedItems' @ [55:52] ==> public final val <S : (Any..Any?)> TableView.TableViewSelectionModel<(S..S?)>.selectedItems: (ObservableList<(S..S?)>..ObservableList<(S..S?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (S..S?)

'arrayOf' @ [57:4] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (ObservableList<(S..S?)>..ObservableList<(S..S?)>?)): Array<(ObservableList<(S..S?)>..ObservableList<(S..S?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (javafx.collections.ObservableList<(S..S?)>..javafx.collections.ObservableList<(S..S?)>?)

'selectionModel' @ [57:12] ==> public final var <S : (Any..Any?)> TableView<S>.selectionModel: (TableView.TableViewSelectionModel<(S..S?)>..TableView.TableViewSelectionModel<(S..S?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S

'selectedItems' @ [57:27] ==> public final val <S : (Any..Any?)> TableView.TableViewSelectionModel<(S..S?)>.selectedItems: (ObservableList<(S..S?)>..ObservableList<(S..S?)>?)[MyPropertyDescriptor]
Inferred types:
    <S : (Any..Any?)> -> (S..S?)

'setCellFactory' @ [60:5] ==> public final fun setCellFactory(p0: (((TableColumn<(S..S?), (T..T?)>..TableColumn<(S..S?), (T..T?)>?)) -> (TableCell<(S..S?), (T..T?)>..TableCell<(S..S?), (T..T?)>?)..(((TableColumn<(S..S?), (T..T?)>..TableColumn<(S..S?), (T..T?)>?)) -> (TableCell<(S..S?), (T..T?)>..TableCell<(S..S?), (T..T?)>?))?)): Unit defined in javafx.scene.control.TableColumn[MyFunctionDescriptor]

'TableCell<S, T>' @ [61:18] ==> public constructor TableCell<S : (Any..Any?), T : (Any..Any?)>() defined in javafx.scene.control.TableCell[JavaClassConstructorDescriptor]
Inferred types:
    <S : (Any..Any?)> -> S
    <T : (Any..Any?)> -> T

'text' @ [63:17] ==> public final var <S, T> <no name provided><S, T>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <S> -> S
    <T> -> T

'super' @ [67:17] ==> <this> defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'updateItem' @ [67:23] ==> protected/*protected and package*/ open fun updateItem(p0: (T..T?), p1: Boolean): Unit defined in javafx.scene.control.TableCell[JavaMethodDescriptor]

'value' @ [67:34] ==> value-parameter value: T? defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'empty' @ [67:41] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'graphic' @ [68:17] ==> public final var <S, T> <no name provided><S, T>.graphic: (Node..Node?)[MyPropertyDescriptor]
Inferred types:
    <S> -> S
    <T> -> T

'if (value != null && !empty) {
                    toNode(value)
                } else {
                    null
                }' @ [68:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Node..Node?), elseBranch: (Node..Node?)): (Node..Node?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javafx.scene.Node..javafx.scene.Node?)

'value' @ [68:31] ==> value-parameter value: T? defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'!' @ [68:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'empty' @ [68:49] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'invoke' @ [69:21] ==> public abstract operator fun invoke(p1: T): Node defined in kotlin.Function1[FunctionInvokeDescriptor]

'value' @ [69:28] ==> value-parameter value: T? defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

