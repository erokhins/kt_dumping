'View' @ [33:18] ==> public constructor View(title: String? = ...) defined in tornadofx.View[DeserializedClassConstructorDescriptor]

'fxml' @ [34:26] ==> public final fun <T : Node> fxml(location: String?, hasControllerAttribute: Boolean): ReadOnlyProperty<UIComponent, Parent> defined in net.corda.explorer.views.MainView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Parent

'fxid' @ [37:31] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, MenuButton> defined in net.corda.explorer.views.MainView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> MenuButton

'fxid' @ [38:25] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, MenuItem> defined in net.corda.explorer.views.MainView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> MenuItem

'fxid' @ [39:28] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, VBox> defined in net.corda.explorer.views.MainView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> VBox

'fxid' @ [40:40] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, BorderPane> defined in net.corda.explorer.views.MainView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> BorderPane

'observableValue' @ [43:31] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (NetworkIdentityModel) -> ObservableValue<NodeInfo?>): TrackedDelegate.ObservableValueDelegate<NetworkIdentityModel, NodeInfo?> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> NetworkIdentityModel
    <T> -> NodeInfo?

'NetworkIdentityModel' @ [43:47] ==> public constructor NetworkIdentityModel() defined in net.corda.client.jfx.model.NetworkIdentityModel[DeserializedClassConstructorDescriptor]

'objectProperty' @ [44:33] ==> public inline fun <reified M : Any, T> objectProperty(noinline objectProperty: (CordaViewModel) -> ObjectProperty<(CordaView..CordaView?)>): TrackedDelegate.ObjectPropertyDelegate<CordaViewModel, (CordaView..CordaView?)> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> CordaViewModel
    <T> -> (net.corda.explorer.model.CordaView..net.corda.explorer.model.CordaView?)

'CordaViewModel' @ [44:48] ==> public constructor CordaViewModel() defined in net.corda.explorer.model.CordaViewModel[ClassConstructorDescriptorImpl]

'observableList' @ [45:36] ==> public inline fun <reified M : Any, T> observableList(noinline observableListProperty: (CordaViewModel) -> ObservableList<CordaView>): TrackedDelegate.ObservableListDelegate<CordaViewModel, CordaView> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> CordaViewModel
    <T> -> CordaView

'CordaViewModel' @ [45:51] ==> public constructor CordaViewModel() defined in net.corda.explorer.model.CordaViewModel[ClassConstructorDescriptorImpl]

'menuItemCSS' @ [49:41] ==> private final val menuItemCSS: String defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'userButton' @ [53:9] ==> private final val userButton: MenuButton defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'textProperty' @ [53:20] ==> public final fun textProperty(): (StringProperty..StringProperty?) defined in javafx.scene.control.MenuButton[JavaMethodDescriptor]

'bind' @ [53:35] ==> public abstract fun bind(p0: (ObservableValue<out (String..String?)>..ObservableValue<out (String..String?)>?)): Unit defined in javafx.beans.property.StringProperty[JavaMethodDescriptor]

'myIdentity' @ [53:40] ==> private final val myIdentity: ObservableValue<NodeInfo?> defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'map' @ [53:51] ==> public fun <A, B> ObservableValue<out NodeInfo?>.map(function: (NodeInfo?) -> String?): ObservableValue<String?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> NodeInfo?
    <B> -> String?

'it' @ [53:57] ==> value-parameter it: NodeInfo? defined in net.corda.explorer.views.MainView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'legalIdentity' @ [53:61] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'let' @ [53:76] ==> @InlineOnly public inline fun <T, R> Party.let(block: (Party) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> String

'PartyNameFormatter' @ [53:82] ==> public object PartyNameFormatter defined in net.corda.explorer.formatters in file PartyNameFormatter.kt[FakeCallableDescriptorForObject]

'short' @ [53:101] ==> public final val short: Formatter<X500Name> defined in net.corda.explorer.formatters.PartyNameFormatter[PropertyDescriptorImpl]

'format' @ [53:107] ==> public abstract fun format(value: X500Name): String defined in net.corda.explorer.formatters.Formatter[SimpleFunctionDescriptorImpl]

'it' @ [53:114] ==> value-parameter it: Party defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [53:117] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'exit' @ [54:9] ==> private final val exit: MenuItem defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'setOnAction' @ [54:14] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.MenuItem[MyFunctionDescriptor]

'root' @ [55:14] ==> public open val root: Parent defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'scene' @ [55:19] ==> public final val Parent.scene: (Scene..Scene?)[MyPropertyDescriptor]

'window' @ [55:25] ==> public final val Scene.window: (Window..Window?)[MyPropertyDescriptor]

'fireEvent' @ [55:42] ==> public final fun fireEvent(p0: (Event..Event?)): Unit defined in javafx.stage.Stage[JavaMethodDescriptor]

'WindowEvent' @ [55:52] ==> public constructor WindowEvent(@NamedArg p0: (Window..Window?), @NamedArg p1: (EventType<out (Event..Event?)>..EventType<out (Event..Event?)>?)) defined in javafx.stage.WindowEvent[JavaClassConstructorDescriptor]

'root' @ [55:64] ==> public open val root: Parent defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'scene' @ [55:69] ==> public final val Parent.scene: (Scene..Scene?)[MyPropertyDescriptor]

'window' @ [55:75] ==> public final val Scene.window: (Window..Window?)[MyPropertyDescriptor]

'WINDOW_CLOSE_REQUEST' @ [55:95] ==> public final val WINDOW_CLOSE_REQUEST: (EventType<(WindowEvent..WindowEvent?)>..EventType<(WindowEvent..WindowEvent?)>?) defined in javafx.stage.WindowEvent[JavaPropertyDescriptor]

'registeredViews' @ [58:25] ==> private final val registeredViews: ObservableList<CordaView> defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'map' @ [58:41] ==> public fun <A, B> ObservableList<out CordaView>.map(cached: Boolean = ..., function: (CordaView) -> StackPane): ObservableList<StackPane> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> CordaView
    <B> -> StackPane

'ChosenList' @ [60:31] ==> public constructor ChosenList<E>(chosenListObservable: ObservableValue<out ObservableList<out String>>) defined in net.corda.client.jfx.utils.ChosenList[DeserializedClassConstructorDescriptor]
Inferred types:
    <E> -> String

'selectedView' @ [60:42] ==> private final val selectedView: ObjectProperty<(CordaView..CordaView?)> defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'map' @ [60:55] ==> public fun <A, B> ObservableValue<out (CordaView..CordaView?)>.map(function: ((CordaView..CordaView?)) -> ObservableList<String>): ObservableValue<ObservableList<String>> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (net.corda.explorer.model.CordaView..net.corda.explorer.model.CordaView?)
    <B> -> ObservableList<String>

'if (selected == it) listOf(menuItemCSS, menuItemSelectedCSS).observable() else listOf(menuItemCSS).observable()' @ [61:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ObservableList<String>, elseBranch: ObservableList<String>): ObservableList<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ObservableList<String>

'selected' @ [61:21] ==> value-parameter selected: (CordaView..CordaView?) defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [61:33] ==> value-parameter it: CordaView defined in net.corda.explorer.views.MainView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [61:37] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'menuItemCSS' @ [61:44] ==> private final val menuItemCSS: String defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'menuItemSelectedCSS' @ [61:57] ==> private final val menuItemSelectedCSS: String defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'observable' @ [61:78] ==> public fun <T> List<String>.observable(): ObservableList<String> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'listOf' @ [61:96] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'menuItemCSS' @ [61:103] ==> private final val menuItemCSS: String defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'observable' @ [61:116] ==> public fun <T> List<String>.observable(): ObservableList<String> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'stackpane' @ [63:13] ==> public fun EventTarget.stackpane(initialChildren: Iterable<Node>? = ..., op: (StackPane.() -> Unit)? = ...): StackPane defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'button' @ [64:17] ==> public fun EventTarget.button(text: String = ..., graphic: Node? = ..., op: (Button.() -> Unit)? = ...): Button defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'it' @ [64:24] ==> value-parameter it: CordaView defined in net.corda.explorer.views.MainView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'title' @ [64:27] ==> public final var title: String defined in net.corda.explorer.model.CordaView[DeserializedPropertyDescriptor]

'graphic' @ [65:21] ==> public final var Button.graphic: (Node..Node?)[MyPropertyDescriptor]

'FontAwesomeIconView' @ [65:31] ==> public constructor FontAwesomeIconView(p0: (FontAwesomeIcon..FontAwesomeIcon?)) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaClassConstructorDescriptor]

'it' @ [65:51] ==> value-parameter it: CordaView defined in net.corda.explorer.views.MainView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'icon' @ [65:54] ==> public abstract val icon: FontAwesomeIcon defined in net.corda.explorer.model.CordaView[PropertyDescriptorImpl]

'apply' @ [65:60] ==> @InlineOnly public inline fun <T> FontAwesomeIconView.apply(block: FontAwesomeIconView.() -> Unit): FontAwesomeIconView defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FontAwesomeIconView

'glyphSize' @ [66:25] ==> public final var FontAwesomeIconView.glyphSize: (Number..Number?)[MyPropertyDescriptor]

'textAlignment' @ [67:25] ==> public final var FontAwesomeIconView.textAlignment: (TextAlignment..TextAlignment?)[MyPropertyDescriptor]

'CENTER' @ [67:55] ==> enum entry CENTER defined in javafx.scene.text.TextAlignment[FakeCallableDescriptorForObject]

'fillProperty' @ [68:25] ==> public final fun fillProperty(): (ObjectProperty<(Paint..Paint?)>..ObjectProperty<(Paint..Paint?)>?) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaMethodDescriptor]

'bind' @ [68:40] ==> public abstract fun bind(p0: (ObservableValue<out (Paint..Paint?)>..ObservableValue<out (Paint..Paint?)>?)): Unit defined in javafx.beans.property.ObjectProperty[JavaMethodDescriptor]

'this@button' @ [68:45] ==> <this> defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'textFillProperty' @ [68:57] ==> public final fun textFillProperty(): (ObjectProperty<(Paint..Paint?)>..ObjectProperty<(Paint..Paint?)>?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'bindContent' @ [70:30] ==> public open fun <E : (Any..Any?)> bindContent(p0: (MutableList<(String..String?)>..List<(String..String?)>?), p1: (ObservableList<out (String..String?)>..ObservableList<out (String..String?)>?)): Unit defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'styleClass' @ [70:42] ==> public final val Button.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'buttonStyle' @ [70:54] ==> val buttonStyle: ChosenList<String> defined in net.corda.explorer.views.MainView.<init>.<anonymous>[LocalVariableDescriptor]

'setOnMouseClicked' @ [71:21] ==> public final fun setOnMouseClicked(p0: (((MouseEvent..MouseEvent?)) -> Unit..(((MouseEvent..MouseEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'e' @ [72:29] ==> value-parameter e: (MouseEvent..MouseEvent?) defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'button' @ [72:31] ==> public final val MouseEvent.button: (MouseButton..MouseButton?)[MyPropertyDescriptor]

'PRIMARY' @ [72:53] ==> enum entry PRIMARY defined in javafx.scene.input.MouseButton[FakeCallableDescriptorForObject]

'selectedView' @ [73:29] ==> private final val selectedView: ObjectProperty<(CordaView..CordaView?)> defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'value' @ [73:42] ==> public final var <T : (Any..Any?)> ObjectProperty<(CordaView..CordaView?)>.value: (CordaView..CordaView?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.explorer.model.CordaView..net.corda.explorer.model.CordaView?)

'it' @ [73:50] ==> value-parameter it: CordaView defined in net.corda.explorer.views.MainView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'widthProperty' @ [77:45] ==> public final fun widthProperty(): (ReadOnlyDoubleProperty..ReadOnlyDoubleProperty?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'map' @ [77:61] ==> public fun <A, B> ObservableValue<out (Number..Number?)>.map(function: ((Number..Number?)) -> Boolean): ObservableValue<Boolean> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (kotlin.Number..kotlin.Number?)
    <B> -> Boolean

'it' @ [77:68] ==> value-parameter it: (Number..Number?) defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toDouble' @ [77:71] ==> public abstract fun toDouble(): Double defined in kotlin.Number[DeserializedSimpleFunctionDescriptor]

'contentDisplayProperty' @ [78:21] ==> public final fun contentDisplayProperty(): (ObjectProperty<(ContentDisplay..ContentDisplay?)>..ObjectProperty<(ContentDisplay..ContentDisplay?)>?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'bind' @ [78:46] ==> public abstract fun bind(p0: (ObservableValue<out (ContentDisplay..ContentDisplay?)>..ObservableValue<out (ContentDisplay..ContentDisplay?)>?)): Unit defined in javafx.beans.property.ObjectProperty[JavaMethodDescriptor]

'smallIconProperty' @ [78:51] ==> val smallIconProperty: ObservableValue<Boolean> defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [78:69] ==> public fun <A, B> ObservableValue<out Boolean>.map(function: (Boolean) -> ContentDisplay): ObservableValue<ContentDisplay> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Boolean
    <B> -> ContentDisplay

'if (it) ContentDisplay.TOP else ContentDisplay.LEFT' @ [78:75] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ContentDisplay, elseBranch: ContentDisplay): ContentDisplay[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ContentDisplay

'it' @ [78:79] ==> value-parameter it: Boolean defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'TOP' @ [78:98] ==> enum entry TOP defined in javafx.scene.control.ContentDisplay[FakeCallableDescriptorForObject]

'LEFT' @ [78:122] ==> enum entry LEFT defined in javafx.scene.control.ContentDisplay[FakeCallableDescriptorForObject]

'textAlignmentProperty' @ [79:21] ==> public final fun textAlignmentProperty(): (ObjectProperty<(TextAlignment..TextAlignment?)>..ObjectProperty<(TextAlignment..TextAlignment?)>?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'bind' @ [79:45] ==> public abstract fun bind(p0: (ObservableValue<out (TextAlignment..TextAlignment?)>..ObservableValue<out (TextAlignment..TextAlignment?)>?)): Unit defined in javafx.beans.property.ObjectProperty[JavaMethodDescriptor]

'smallIconProperty' @ [79:50] ==> val smallIconProperty: ObservableValue<Boolean> defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [79:68] ==> public fun <A, B> ObservableValue<out Boolean>.map(function: (Boolean) -> TextAlignment): ObservableValue<TextAlignment> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Boolean
    <B> -> TextAlignment

'if (it) TextAlignment.CENTER else TextAlignment.LEFT' @ [79:74] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextAlignment, elseBranch: TextAlignment): TextAlignment[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextAlignment

'it' @ [79:78] ==> value-parameter it: Boolean defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'CENTER' @ [79:96] ==> enum entry CENTER defined in javafx.scene.text.TextAlignment[FakeCallableDescriptorForObject]

'LEFT' @ [79:122] ==> enum entry LEFT defined in javafx.scene.text.TextAlignment[FakeCallableDescriptorForObject]

'alignmentProperty' @ [80:21] ==> public final fun alignmentProperty(): (ObjectProperty<(Pos..Pos?)>..ObjectProperty<(Pos..Pos?)>?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'bind' @ [80:41] ==> public abstract fun bind(p0: (ObservableValue<out (Pos..Pos?)>..ObservableValue<out (Pos..Pos?)>?)): Unit defined in javafx.beans.property.ObjectProperty[JavaMethodDescriptor]

'smallIconProperty' @ [80:46] ==> val smallIconProperty: ObservableValue<Boolean> defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [80:64] ==> public fun <A, B> ObservableValue<out Boolean>.map(function: (Boolean) -> Pos): ObservableValue<Pos> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Boolean
    <B> -> Pos

'if (it) Pos.CENTER else Pos.CENTER_LEFT' @ [80:70] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pos, elseBranch: Pos): Pos[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pos

'it' @ [80:74] ==> value-parameter it: Boolean defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'CENTER' @ [80:82] ==> enum entry CENTER defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'CENTER_LEFT' @ [80:98] ==> enum entry CENTER_LEFT defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'fontProperty' @ [81:21] ==> public final fun fontProperty(): (ObjectProperty<(Font..Font?)>..ObjectProperty<(Font..Font?)>?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'bind' @ [81:36] ==> public abstract fun bind(p0: (ObservableValue<out (Font..Font?)>..ObservableValue<out (Font..Font?)>?)): Unit defined in javafx.beans.property.ObjectProperty[JavaMethodDescriptor]

'smallIconProperty' @ [81:41] ==> val smallIconProperty: ObservableValue<Boolean> defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'map' @ [81:59] ==> public fun <A, B> ObservableValue<out Boolean>.map(function: (Boolean) -> (Font..Font?)): ObservableValue<(Font..Font?)> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Boolean
    <B> -> (javafx.scene.text.Font..javafx.scene.text.Font?)

'if (it) Font.font(10.0) else Font.font(12.0)' @ [81:65] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Font..Font?), elseBranch: (Font..Font?)): (Font..Font?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javafx.scene.text.Font..javafx.scene.text.Font?)

'it' @ [81:69] ==> value-parameter it: Boolean defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'font' @ [81:78] ==> public open fun font(p0: Double): (Font..Font?) defined in javafx.scene.text.Font[JavaMethodDescriptor]

'font' @ [81:99] ==> public open fun font(p0: Double): (Font..Font?) defined in javafx.scene.text.Font[JavaMethodDescriptor]

'wrapTextProperty' @ [82:21] ==> public final fun wrapTextProperty(): (BooleanProperty..BooleanProperty?) defined in javafx.scene.control.Button[JavaMethodDescriptor]

'bind' @ [82:40] ==> public abstract fun bind(p0: (ObservableValue<out (Boolean..Boolean?)>..ObservableValue<out (Boolean..Boolean?)>?)): Unit defined in javafx.beans.property.BooleanProperty[JavaMethodDescriptor]

'smallIconProperty' @ [82:45] ==> val smallIconProperty: ObservableValue<Boolean> defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'add' @ [85:17] ==> public fun EventTarget.add(node: Node): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'FontAwesomeIconView' @ [85:21] ==> public constructor FontAwesomeIconView(p0: (FontAwesomeIcon..FontAwesomeIcon?)) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaClassConstructorDescriptor]

'CARET_LEFT' @ [85:57] ==> enum entry CARET_LEFT defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'apply' @ [85:69] ==> @InlineOnly public inline fun <T> FontAwesomeIconView.apply(block: FontAwesomeIconView.() -> Unit): FontAwesomeIconView defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FontAwesomeIconView

'setAlignment' @ [86:31] ==> public open fun setAlignment(p0: (Node..Node?), p1: (Pos..Pos?)): Unit defined in javafx.scene.layout.StackPane[JavaMethodDescriptor]

'this' @ [86:44] ==> <this> defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'CENTER_RIGHT' @ [86:54] ==> enum entry CENTER_RIGHT defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'setMargin' @ [87:31] ==> public open fun setMargin(p0: (Node..Node?), p1: (Insets..Insets?)): Unit defined in javafx.scene.layout.StackPane[JavaMethodDescriptor]

'this' @ [87:41] ==> <this> defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'Insets' @ [87:47] ==> public constructor Insets(@NamedArg p0: Double, @NamedArg p1: Double, @NamedArg p2: Double, @NamedArg p3: Double) defined in javafx.geometry.Insets[JavaClassConstructorDescriptor]

'-' @ [87:59] ==> public final operator fun unaryMinus(): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'styleClass' @ [88:21] ==> public final val FontAwesomeIconView.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'add' @ [88:32] ==> public abstract fun add(element: (String..String?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'menuItemArrowCSS' @ [88:36] ==> private final val menuItemArrowCSS: String defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'visibleProperty' @ [89:21] ==> public final fun visibleProperty(): (BooleanProperty..BooleanProperty?) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaMethodDescriptor]

'bind' @ [89:39] ==> public abstract fun bind(p0: (ObservableValue<out (Boolean..Boolean?)>..ObservableValue<out (Boolean..Boolean?)>?)): Unit defined in javafx.beans.property.BooleanProperty[JavaMethodDescriptor]

'selectedView' @ [89:44] ==> private final val selectedView: ObjectProperty<(CordaView..CordaView?)> defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'map' @ [89:57] ==> public fun <A, B> ObservableValue<out (CordaView..CordaView?)>.map(function: ((CordaView..CordaView?)) -> Boolean): ObservableValue<Boolean> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (net.corda.explorer.model.CordaView..net.corda.explorer.model.CordaView?)
    <B> -> Boolean

'selected' @ [89:75] ==> value-parameter selected: (CordaView..CordaView?) defined in net.corda.explorer.views.MainView.<init>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [89:87] ==> value-parameter it: CordaView defined in net.corda.explorer.views.MainView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'bindContent' @ [93:18] ==> public open fun <E : (Any..Any?)> bindContent(p0: (MutableList<(Node..Node?)>..List<(Node..Node?)>?), p1: (ObservableList<out (Node..Node?)>..ObservableList<out (Node..Node?)>?)): Unit defined in javafx.beans.binding.Bindings[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Node

'sidebar' @ [93:30] ==> private final val sidebar: VBox defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'children' @ [93:38] ==> public final val VBox.children: (ObservableList<(Node..Node?)>..ObservableList<(Node..Node?)>?)[MyPropertyDescriptor]

'menuItems' @ [93:48] ==> val menuItems: ObservableList<StackPane> defined in net.corda.explorer.views.MainView.<init>[LocalVariableDescriptor]

'selectionBorderPane' @ [95:9] ==> private final val selectionBorderPane: BorderPane defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'centerProperty' @ [95:29] ==> public final fun centerProperty(): (ObjectProperty<(Node..Node?)>..ObjectProperty<(Node..Node?)>?) defined in javafx.scene.layout.BorderPane[JavaMethodDescriptor]

'bind' @ [95:46] ==> public abstract fun bind(p0: (ObservableValue<out (Node..Node?)>..ObservableValue<out (Node..Node?)>?)): Unit defined in javafx.beans.property.ObjectProperty[JavaMethodDescriptor]

'selectedView' @ [95:51] ==> private final val selectedView: ObjectProperty<(CordaView..CordaView?)> defined in net.corda.explorer.views.MainView[PropertyDescriptorImpl]

'map' @ [95:64] ==> public fun <A, B> ObservableValue<out (CordaView..CordaView?)>.map(function: ((CordaView..CordaView?)) -> Parent?): ObservableValue<Parent?> defined in net.corda.client.jfx.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> (net.corda.explorer.model.CordaView..net.corda.explorer.model.CordaView?)
    <B> -> Parent?

'it' @ [95:70] ==> value-parameter it: (CordaView..CordaView?) defined in net.corda.explorer.views.MainView.<init>.<anonymous>[ValueParameterDescriptorImpl]

'root' @ [95:74] ==> public abstract val root: Parent defined in net.corda.explorer.model.CordaView[DeserializedPropertyDescriptor]

