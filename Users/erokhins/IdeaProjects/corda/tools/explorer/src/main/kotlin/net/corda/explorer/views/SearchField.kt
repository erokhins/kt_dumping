'UIComponent' @ [26:122] ==> public constructor UIComponent(viewTitle: String? = ...) defined in tornadofx.UIComponent[DeserializedClassConstructorDescriptor]

'fxml' @ [27:34] ==> public final fun <T : Node> fxml(location: String?, hasControllerAttribute: Boolean): ReadOnlyProperty<UIComponent, Parent> defined in net.corda.explorer.views.SearchField[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Parent

'fxid' @ [28:30] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TextField> defined in net.corda.explorer.views.SearchField[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TextField

'fxid' @ [29:32] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Node> defined in net.corda.explorer.views.SearchField[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Node

'fxid' @ [30:35] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, ComboBox<String>> defined in net.corda.explorer.views.SearchField[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ComboBox<String>

'ChosenList' @ [33:24] ==> public constructor ChosenList<E>(chosenListObservable: ObservableValue<out ObservableList<out (T..T?)>>) defined in net.corda.client.jfx.utils.ChosenList[DeserializedClassConstructorDescriptor]
Inferred types:
    <E> -> (T..T?)

'createObjectBinding' @ [33:44] ==> public final fun <T : (Any..Any?)> createObjectBinding(p0: (() -> (FilteredList<(T..T?)>..FilteredList<(T..T?)>?)..(() -> (FilteredList<(T..T?)>..FilteredList<(T..T?)>?))?), p1: (Array<(Observable..Observable?)>..Array<out (Observable..Observable?)>?)): (ObjectBinding<(FilteredList<(T..T?)>..FilteredList<(T..T?)>?)>..ObjectBinding<(FilteredList<(T..T?)>..FilteredList<(T..T?)>?)>?) defined in javafx.beans.binding.Bindings[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FilteredList<(T..T?)>

'textField' @ [34:20] ==> private final val textField: TextField defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'text' @ [34:30] ==> public final var TextField.text: (String..String?)[MyPropertyDescriptor]

'searchCategory' @ [35:24] ==> private final val searchCategory: ComboBox<String> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'value' @ [35:39] ==> public final var <T : (Any..Any?)> ComboBox<String>.value: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'data' @ [36:9] ==> private final val data: ObservableList<T> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'filtered' @ [36:14] ==> public final fun filtered(p0: (((T..T?)) -> Boolean..(((T..T?)) -> Boolean)?)): (FilteredList<(T..T?)>..FilteredList<(T..T?)>?) defined in javafx.collections.ObservableList[MyFunctionDescriptor]

'text' @ [37:13] ==> val text: (String..String?) defined in net.corda.explorer.views.SearchField.filteredData.<anonymous>[LocalVariableDescriptor]

'isNullOrBlank' @ [37:18] ==> @InlineOnly public inline fun CharSequence?.isNullOrBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (category == ALL) {
                filterCriteria.any { it.second(data, text) }
            } else {
                filterCriteria.toMap()[category]?.invoke(data, text) ?: false
            }' @ [37:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'category' @ [37:41] ==> val category: (String..String?) defined in net.corda.explorer.views.SearchField.filteredData.<anonymous>[LocalVariableDescriptor]

'ALL' @ [37:53] ==> private final val ALL: String defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'filterCriteria' @ [38:17] ==> value-parameter vararg filterCriteria: Pair<String, (T, String) -> Boolean> defined in net.corda.explorer.views.SearchField.<init>[ValueParameterDescriptorImpl]

'any' @ [38:32] ==> public inline fun <T> Array<out Pair<String, (T, String) -> Boolean>>.any(predicate: (Pair<String, (T, String) -> Boolean>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Function2<T, String, Boolean>>

'it' @ [38:38] ==> value-parameter it: Pair<String, (T, String) -> Boolean> defined in net.corda.explorer.views.SearchField.filteredData.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [38:41] ==> public abstract operator fun invoke(p1: T, p2: String): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'data' @ [38:48] ==> value-parameter data: (T..T?) defined in net.corda.explorer.views.SearchField.filteredData.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [38:54] ==> val text: (String..String?) defined in net.corda.explorer.views.SearchField.filteredData.<anonymous>[LocalVariableDescriptor]

'filterCriteria' @ [40:17] ==> value-parameter vararg filterCriteria: Pair<String, (T, String) -> Boolean> defined in net.corda.explorer.views.SearchField.<init>[ValueParameterDescriptorImpl]

'toMap' @ [40:32] ==> public fun <K, V> Array<out Pair<String, (T, String) -> Boolean>>.toMap(): Map<String, (T, String) -> Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Function2<T, String, Boolean>

'category' @ [40:40] ==> val category: (String..String?) defined in net.corda.explorer.views.SearchField.filteredData.<anonymous>[LocalVariableDescriptor]

'invoke' @ [40:51] ==> public abstract operator fun invoke(p1: T, p2: String): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'data' @ [40:58] ==> value-parameter data: (T..T?) defined in net.corda.explorer.views.SearchField.filteredData.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [40:64] ==> val text: (String..String?) defined in net.corda.explorer.views.SearchField.filteredData.<anonymous>[LocalVariableDescriptor]

'arrayOf' @ [43:8] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Observable): Array<Observable> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Observable

'textField' @ [43:28] ==> private final val textField: TextField defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'textProperty' @ [43:38] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.TextField[JavaMethodDescriptor]

'searchCategory' @ [43:54] ==> private final val searchCategory: ComboBox<String> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'valueProperty' @ [43:69] ==> public open fun valueProperty(): (ObjectProperty<(String..String?)>..ObjectProperty<(String..String?)>?) defined in javafx.scene.control.ComboBox[JavaMethodDescriptor]

'clearButton' @ [46:9] ==> private final val clearButton: Node defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'setOnMouseClicked' @ [46:21] ==> public final fun setOnMouseClicked(p0: (((MouseEvent..MouseEvent?)) -> Unit..(((MouseEvent..MouseEvent?)) -> Unit)?)): Unit defined in javafx.scene.Node[MyFunctionDescriptor]

'event' @ [47:17] ==> value-parameter event: MouseEvent defined in net.corda.explorer.views.SearchField.<init>.<anonymous>[ValueParameterDescriptorImpl]

'button' @ [47:23] ==> public final val MouseEvent.button: (MouseButton..MouseButton?)[MyPropertyDescriptor]

'PRIMARY' @ [47:45] ==> enum entry PRIMARY defined in javafx.scene.input.MouseButton[FakeCallableDescriptorForObject]

'textField' @ [48:17] ==> private final val textField: TextField defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'clear' @ [48:27] ==> public open fun clear(): Unit defined in javafx.scene.control.TextField[JavaMethodDescriptor]

'searchCategory' @ [51:9] ==> private final val searchCategory: ComboBox<String> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'items' @ [51:24] ==> public final var <T : (Any..Any?)> ComboBox<String>.items: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'filterCriteria' @ [51:32] ==> value-parameter vararg filterCriteria: Pair<String, (T, String) -> Boolean> defined in net.corda.explorer.views.SearchField.<init>[ValueParameterDescriptorImpl]

'map' @ [51:47] ==> public inline fun <T, R> Array<out Pair<String, (T, String) -> Boolean>>.map(transform: (Pair<String, (T, String) -> Boolean>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Function2<T, String, Boolean>>
    <R> -> String

'it' @ [51:53] ==> value-parameter it: Pair<String, (T, String) -> Boolean> defined in net.corda.explorer.views.SearchField.<init>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [51:56] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'observable' @ [51:64] ==> public fun <T> List<(String..String?)>.observable(): ObservableList<(String..String?)> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'searchCategory' @ [52:9] ==> private final val searchCategory: ComboBox<String> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'items' @ [52:24] ==> public final var <T : (Any..Any?)> ComboBox<String>.items: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'add' @ [52:30] ==> public abstract fun add(index: Int, element: (String..String?)): Unit defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'ALL' @ [52:37] ==> private final val ALL: String defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'searchCategory' @ [53:9] ==> private final val searchCategory: ComboBox<String> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'value' @ [53:24] ==> public final var <T : (Any..Any?)> ComboBox<String>.value: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'ALL' @ [53:32] ==> private final val ALL: String defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'FontAwesomeIconView' @ [55:22] ==> public constructor FontAwesomeIconView(p0: (FontAwesomeIcon..FontAwesomeIcon?)) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaClassConstructorDescriptor]

'SEARCH' @ [55:58] ==> enum entry SEARCH defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'searchCategory' @ [56:9] ==> private final val searchCategory: ComboBox<String> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'buttonCell' @ [56:24] ==> public final var <T : (Any..Any?)> ComboBox<String>.buttonCell: (ListCell<(String..String?)>..ListCell<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'ListCell<String>' @ [56:46] ==> public constructor ListCell<T : (Any..Any?)>() defined in javafx.scene.control.ListCell[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'super' @ [58:17] ==> <this> defined in net.corda.explorer.views.SearchField.<init>.<no name provided>[LazyClassReceiverParameterDescriptor]

'updateItem' @ [58:23] ==> protected/*protected and package*/ open fun updateItem(p0: (String..String?), p1: Boolean): Unit defined in javafx.scene.control.ListCell[JavaMethodDescriptor]

'item' @ [58:34] ==> value-parameter item: String? defined in net.corda.explorer.views.SearchField.<init>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'empty' @ [58:40] ==> value-parameter empty: Boolean defined in net.corda.explorer.views.SearchField.<init>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'setText' @ [59:17] ==> public final fun setText(p0: (String..String?)): Unit defined in net.corda.explorer.views.SearchField.<init>.<no name provided>[JavaMethodDescriptor]

'item' @ [59:25] ==> value-parameter item: String? defined in net.corda.explorer.views.SearchField.<init>.<no name provided>.updateItem[ValueParameterDescriptorImpl]

'setGraphic' @ [60:17] ==> public final fun setGraphic(p0: (Node..Node?)): Unit defined in net.corda.explorer.views.SearchField.<init>.<no name provided>[JavaMethodDescriptor]

'search' @ [60:28] ==> val search: FontAwesomeIconView defined in net.corda.explorer.views.SearchField.<init>[LocalVariableDescriptor]

'setAlignment' @ [61:17] ==> public final fun setAlignment(p0: (Pos..Pos?)): Unit defined in net.corda.explorer.views.SearchField.<init>.<no name provided>[JavaMethodDescriptor]

'CENTER' @ [61:34] ==> enum entry CENTER defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'textField' @ [65:9] ==> private final val textField: TextField defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'paddingProperty' @ [65:19] ==> public final fun paddingProperty(): (ObjectProperty<(Insets..Insets?)>..ObjectProperty<(Insets..Insets?)>?) defined in javafx.scene.control.TextField[JavaMethodDescriptor]

'bind' @ [65:37] ==> public abstract fun bind(p0: (ObservableValue<out (Insets..Insets?)>..ObservableValue<out (Insets..Insets?)>?)): Unit defined in javafx.beans.property.ObjectProperty[JavaMethodDescriptor]

'searchCategory' @ [65:42] ==> private final val searchCategory: ComboBox<String> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'widthProperty' @ [65:57] ==> public final fun widthProperty(): (ReadOnlyDoubleProperty..ReadOnlyDoubleProperty?) defined in javafx.scene.control.ComboBox[JavaMethodDescriptor]

'map' @ [65:73] ==> public fun <A, B> ObservableValue<out (Number..Number?)>.map(function: ((Number..Number?)) -> Insets): ObservableValue<Insets> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (kotlin.Number..kotlin.Number?)
    <B> -> Insets

'Insets' @ [66:13] ==> public constructor Insets(@NamedArg p0: Double, @NamedArg p1: Double, @NamedArg p2: Double, @NamedArg p3: Double) defined in javafx.geometry.Insets[JavaClassConstructorDescriptor]

'it' @ [66:35] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.views.SearchField.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toDouble' @ [66:38] ==> public abstract fun toDouble(): Double defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'textField' @ [68:9] ==> private final val textField: TextField defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'promptTextProperty' @ [68:19] ==> public final fun promptTextProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.TextField[JavaMethodDescriptor]

'bind' @ [68:40] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'searchCategory' @ [68:45] ==> private final val searchCategory: ComboBox<String> defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'valueProperty' @ [68:60] ==> public open fun valueProperty(): (ObjectProperty<(String..String?)>..ObjectProperty<(String..String?)>?) defined in javafx.scene.control.ComboBox[JavaMethodDescriptor]

'map' @ [68:76] ==> public fun <A, B> ObservableValue<out (String..String?)>.map(function: ((String..String?)) -> String): ObservableValue<String> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (kotlin.String..kotlin.String?)
    <B> -> String

'if (it == ALL) {
                filterCriteria.map { it.first.toLowerCase() }.joinToString(", ")
            } else {
                it.toLowerCase()
            }' @ [69:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [69:32] ==> value-parameter it: (String..String?) defined in net.corda.explorer.views.SearchField.<init>.<anonymous>[ValueParameterDescriptorImpl]

'ALL' @ [69:38] ==> private final val ALL: String defined in net.corda.explorer.views.SearchField[PropertyDescriptorImpl]

'filterCriteria' @ [70:17] ==> value-parameter vararg filterCriteria: Pair<String, (T, String) -> Boolean> defined in net.corda.explorer.views.SearchField.<init>[ValueParameterDescriptorImpl]

'map' @ [70:32] ==> public inline fun <T, R> Array<out Pair<String, (T, String) -> Boolean>>.map(transform: (Pair<String, (T, String) -> Boolean>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, Function2<T, String, Boolean>>
    <R> -> String

'it' @ [70:38] ==> value-parameter it: Pair<String, (T, String) -> Boolean> defined in net.corda.explorer.views.SearchField.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [70:41] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toLowerCase' @ [70:47] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'joinToString' @ [70:63] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [72:17] ==> value-parameter it: (String..String?) defined in net.corda.explorer.views.SearchField.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toLowerCase' @ [72:20] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'category' @ [74:25] ==> val category: String defined in net.corda.explorer.views.SearchField.<init>.<anonymous>[LocalVariableDescriptor]

