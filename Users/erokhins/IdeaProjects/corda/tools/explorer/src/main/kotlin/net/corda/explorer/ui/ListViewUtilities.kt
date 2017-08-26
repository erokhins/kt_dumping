'Callback' @ [9:44] ==> @FunctionalInterface public fun <P : (Any..Any?), R : (Any..Any?)> Callback(function: ((ListView<T?>..ListView<T?>?)) -> (ListCell<T?>..ListCell<T?>?)): Callback<ListView<T?>, ListCell<T?>> defined in javafx.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : (Any..Any?)> -> ListView<T?>
    <R : (Any..Any?)> -> ListCell<T?>

'ListCell<T?>' @ [10:14] ==> public constructor ListCell<T : (Any..Any?)>() defined in javafx.scene.control.ListCell[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T?

'super' @ [12:13] ==> <this> defined in net.corda.explorer.ui.toListCellFactory.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'updateItem' @ [12:19] ==> protected/*protected and package*/ open fun updateItem(p0: T?, p1: Boolean): Unit defined in javafx.scene.control.ListCell[JavaMethodDescriptor]

'value' @ [12:30] ==> value-parameter value: T? defined in net.corda.explorer.ui.toListCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'empty' @ [12:37] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.toListCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'text' @ [13:13] ==> public final var <T> <no name provided><T>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T> -> T

'if (value == null || empty) {
                ""
            } else {
                format(value)
            }' @ [13:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'value' @ [13:24] ==> value-parameter value: T? defined in net.corda.explorer.ui.toListCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'empty' @ [13:41] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.toListCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'format' @ [16:17] ==> public abstract fun format(value: T): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'value' @ [16:24] ==> value-parameter value: T? defined in net.corda.explorer.ui.toListCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'setCellFactory' @ [23:5] ==> public final fun setCellFactory(p0: (((ListView<(T..T?)>..ListView<(T..T?)>?)) -> (ListCell<(T..T?)>..ListCell<(T..T?)>?)..(((ListView<(T..T?)>..ListView<(T..T?)>?)) -> (ListCell<(T..T?)>..ListCell<(T..T?)>?))?)): Unit defined in javafx.scene.control.ListView[MyFunctionDescriptor]

'ListCell<T>' @ [24:18] ==> public constructor ListCell<T : (Any..Any?)>() defined in javafx.scene.control.ListCell[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'text' @ [26:17] ==> public final var <T> <no name provided><T>.text: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T> -> T

'super' @ [30:17] ==> <this> defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'updateItem' @ [30:23] ==> protected/*protected and package*/ open fun updateItem(p0: (T..T?), p1: Boolean): Unit defined in javafx.scene.control.ListCell[JavaMethodDescriptor]

'value' @ [30:34] ==> value-parameter value: T? defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'empty' @ [30:41] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'graphic' @ [31:17] ==> public final var <T> <no name provided><T>.graphic: (Node..Node?)[MyPropertyDescriptor]
Inferred types:
    <T> -> T

'if (value != null && !empty) {
                    toNode(value)
                } else {
                    null
                }' @ [31:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Node..Node?), elseBranch: (Node..Node?)): (Node..Node?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javafx.scene.Node..javafx.scene.Node?)

'value' @ [31:31] ==> value-parameter value: T? defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'!' @ [31:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'empty' @ [31:49] ==> value-parameter empty: Boolean defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'invoke' @ [32:21] ==> public abstract operator fun invoke(p1: T): Node defined in kotlin.Function1[FunctionInvokeDescriptor]

'value' @ [32:28] ==> value-parameter value: T? defined in net.corda.explorer.ui.setCustomCellFactory.<anonymous>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

