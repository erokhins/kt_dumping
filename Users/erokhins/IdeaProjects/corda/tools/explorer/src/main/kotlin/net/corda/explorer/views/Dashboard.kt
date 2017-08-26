'CordaView' @ [19:19] ==> public constructor CordaView(title: String? = ...) defined in net.corda.explorer.model.CordaView[ClassConstructorDescriptorImpl]

'fxml' @ [20:34] ==> public final fun <T : Node> fxml(location: String?, hasControllerAttribute: Boolean): ReadOnlyProperty<UIComponent, Parent> defined in net.corda.explorer.views.Dashboard[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Parent

'DASHBOARD' @ [21:41] ==> enum entry DASHBOARD defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'fxid' @ [22:39] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TilePane> defined in net.corda.explorer.views.Dashboard[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TilePane

'fxid' @ [23:41] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TitledPane> defined in net.corda.explorer.views.Dashboard[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TitledPane

'writableValue' @ [25:33] ==> public inline fun <reified M : Any, T> writableValue(noinline writableValueProperty: (CordaViewModel) -> WritableValue<(CordaView..CordaView?)>): TrackedDelegate.WritableValueDelegate<CordaViewModel, (CordaView..CordaView?)> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> CordaViewModel
    <T> -> (net.corda.explorer.model.CordaView..net.corda.explorer.model.CordaView?)

'CordaViewModel' @ [25:47] ==> public constructor CordaViewModel() defined in net.corda.explorer.model.CordaViewModel[ClassConstructorDescriptorImpl]

'observableList' @ [26:36] ==> public inline fun <reified M : Any, T> observableList(noinline observableListProperty: (CordaViewModel) -> ObservableList<CordaView>): TrackedDelegate.ObservableListDelegate<CordaViewModel, CordaView> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> CordaViewModel
    <T> -> CordaView

'CordaViewModel' @ [26:51] ==> public constructor CordaViewModel() defined in net.corda.explorer.model.CordaViewModel[ClassConstructorDescriptorImpl]

'registeredViews' @ [28:31] ==> private final val registeredViews: ObservableList<CordaView> defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'map' @ [28:47] ==> public fun <A, B> ObservableList<out CordaView>.map(cached: Boolean = ..., function: (CordaView) -> ObservableList<Node>): ObservableList<ObservableList<Node>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> CordaView
    <B> -> ObservableList<Node>

'getWidget' @ [28:53] ==> private final fun getWidget(view: CordaView): ObservableList<Node> defined in net.corda.explorer.views.Dashboard[SimpleFunctionDescriptorImpl]

'it' @ [28:63] ==> value-parameter it: CordaView defined in net.corda.explorer.views.Dashboard.widgetPanes.<anonymous>[ValueParameterDescriptorImpl]

'concatenate' @ [28:69] ==> public fun <A> ObservableList<ObservableList<Node>>.concatenate(): ObservableList<Node> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Node

'bindContent' @ [31:18] ==> public open fun <E : (Any..Any?)> bindContent(p0: (MutableList<(Node..Node?)>..List<(Node..Node?)>?), p1: (ObservableList<out (Node..Node?)>..ObservableList<out (Node..Node?)>?)): Unit defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Node

'tilePane' @ [31:30] ==> private final val tilePane: TilePane defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'children' @ [31:39] ==> public final val TilePane.children: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'widgetPanes' @ [31:49] ==> private final val widgetPanes: ObservableList<Node> defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'tilePane' @ [33:9] ==> private final val tilePane: TilePane defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'widthProperty' @ [33:18] ==> public final fun widthProperty(): (ReadOnlyDoubleProperty..ReadOnlyDoubleProperty?) defined in javafx.scene.layout.TilePane[JavaMethodDescriptor]

'addListener' @ [33:34] ==> public final fun addListener(p0: (((Observable..Observable?)) -> Unit..(((Observable..Observable?)) -> Unit)?)): Unit defined in javafx.beans.property.ReadOnlyDoubleProperty[MyFunctionDescriptor]

'/' @ [35:33] ==> public final operator fun div(other: Int): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'tilePane' @ [35:34] ==> private final val tilePane: TilePane defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'width' @ [35:43] ==> public final var TilePane.width: Double[MyPropertyDescriptor]

'prefWidth' @ [35:57] ==> val prefWidth: Int defined in net.corda.explorer.views.Dashboard.<init>.<anonymous>[LocalVariableDescriptor]

'toInt' @ [35:68] ==> public open fun toInt(): Int defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'tilePane' @ [36:13] ==> private final val tilePane: TilePane defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'children' @ [36:22] ==> public final val TilePane.children: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'forEach' @ [36:31] ==> @HidesMembers public inline fun <T> Iterable<(Node..Node?)>.forEach(action: ((Node..Node?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javafx.scene.Node..javafx.scene.Node?)

'it' @ [36:42] ==> value-parameter it: (Node..Node?) defined in net.corda.explorer.views.Dashboard.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'prefWidth' @ [36:62] ==> public final var TitledPane.prefWidth: Double[MyPropertyDescriptor]

'/' @ [36:74] ==> public final operator fun div(other: Int): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'tilePane' @ [36:75] ==> private final val tilePane: TilePane defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'width' @ [36:84] ==> public final var TilePane.width: Double[MyPropertyDescriptor]

'columns' @ [36:98] ==> val columns: Int defined in net.corda.explorer.views.Dashboard.<init>.<anonymous>[LocalVariableDescriptor]

'view' @ [41:16] ==> value-parameter view: CordaView defined in net.corda.explorer.views.Dashboard.getWidget[ValueParameterDescriptorImpl]

'widgets' @ [41:21] ==> public open val widgets: ObservableList<CordaWidget> defined in net.corda.explorer.model.CordaView[PropertyDescriptorImpl]

'map' @ [41:29] ==> public fun <A, B> ObservableList<out CordaWidget>.map(cached: Boolean = ..., function: (CordaWidget) -> Node): ObservableList<Node> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> CordaWidget
    <B> -> Node

'TitledPane' @ [42:13] ==> public constructor TitledPane(p0: (String..String?), p1: (Node..Node?)) defined in javafx.scene.control.TitledPane[JavaClassConstructorDescriptor]

'it' @ [42:24] ==> value-parameter it: CordaWidget defined in net.corda.explorer.views.Dashboard.getWidget.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [42:27] ==> public final val name: String defined in net.corda.explorer.model.CordaWidget[PropertyDescriptorImpl]

'it' @ [42:33] ==> value-parameter it: CordaWidget defined in net.corda.explorer.views.Dashboard.getWidget.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [42:36] ==> public final val node: Node defined in net.corda.explorer.model.CordaWidget[PropertyDescriptorImpl]

'apply' @ [42:42] ==> @InlineOnly public inline fun <T> TitledPane.apply(block: TitledPane.() -> Unit): TitledPane defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TitledPane

'styleClass' @ [43:17] ==> public final val TitledPane.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'addAll' @ [43:28] ==> public abstract fun addAll(elements: Collection<(String..String?)>): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'template' @ [43:35] ==> private final val template: TitledPane defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'styleClass' @ [43:44] ==> public final val TitledPane.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'collapsibleProperty' @ [44:17] ==> public final fun collapsibleProperty(): (BooleanProperty..BooleanProperty?) defined in javafx.scene.control.TitledPane[JavaMethodDescriptor]

'bind' @ [44:39] ==> public abstract fun bind(p0: (ObservableValue<out (Boolean..Boolean?)>..ObservableValue<out (Boolean..Boolean?)>?)): Unit defined in javafx.beans.property.BooleanProperty[JavaMethodDescriptor]

'template' @ [44:44] ==> private final val template: TitledPane defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'collapsibleProperty' @ [44:53] ==> public final fun collapsibleProperty(): (BooleanProperty..BooleanProperty?) defined in javafx.scene.control.TitledPane[JavaMethodDescriptor]

'setOnMouseClicked' @ [45:17] ==> public final fun setOnMouseClicked(p0: (((MouseEvent..MouseEvent?)) -> Unit..(((MouseEvent..MouseEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.TitledPane[MyFunctionDescriptor]

'it' @ [46:25] ==> value-parameter it: (MouseEvent..MouseEvent?) defined in net.corda.explorer.views.Dashboard.getWidget.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'button' @ [46:28] ==> public final val MouseEvent.button: (MouseButton..MouseButton?)[MyPropertyDescriptor]

'PRIMARY' @ [46:50] ==> enum entry PRIMARY defined in javafx.scene.input.MouseButton[FakeCallableDescriptorForObject]

'selectedView' @ [47:25] ==> private final val selectedView: WritableValue<(CordaView..CordaView?)> defined in net.corda.explorer.views.Dashboard[PropertyDescriptorImpl]

'value' @ [47:38] ==> public final var <T : (Any..Any?)> WritableValue<(CordaView..CordaView?)>.value: (CordaView..CordaView?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.explorer.model.CordaView..net.corda.explorer.model.CordaView?)

'view' @ [47:46] ==> value-parameter view: CordaView defined in net.corda.explorer.views.Dashboard.getWidget[ValueParameterDescriptorImpl]

'it' @ [50:17] ==> value-parameter it: CordaWidget defined in net.corda.explorer.views.Dashboard.getWidget.<anonymous>[ValueParameterDescriptorImpl]

'icon' @ [50:20] ==> public final val icon: FontAwesomeIcon? defined in net.corda.explorer.model.CordaWidget[PropertyDescriptorImpl]

'let' @ [50:26] ==> @InlineOnly public inline fun <T, R> FontAwesomeIcon.let(block: (FontAwesomeIcon) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FontAwesomeIcon
    <R> -> Unit

'graphic' @ [50:32] ==> public final var TitledPane.graphic: (Node..Node?)[MyPropertyDescriptor]

'FontAwesomeIconView' @ [50:42] ==> public constructor FontAwesomeIconView(p0: (FontAwesomeIcon..FontAwesomeIcon?)) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaClassConstructorDescriptor]

'it' @ [50:62] ==> value-parameter it: FontAwesomeIcon defined in net.corda.explorer.views.Dashboard.getWidget.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [50:66] ==> @InlineOnly public inline fun <T> FontAwesomeIconView.apply(block: FontAwesomeIconView.() -> Unit): FontAwesomeIconView defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FontAwesomeIconView

'glyphSize' @ [50:74] ==> public final var FontAwesomeIconView.glyphSize: (Number..Number?)[MyPropertyDescriptor]

