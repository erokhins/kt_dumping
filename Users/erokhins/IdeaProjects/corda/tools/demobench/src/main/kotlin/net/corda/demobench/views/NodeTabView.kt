'Fragment' @ [34:21] ==> @JvmOverloads public constructor Fragment(title: String? = ..., icon: Node? = ...) defined in tornadofx.Fragment[DeserializedClassConstructorDescriptor]

'stackpane' @ [35:25] ==> public fun EventTarget.stackpane(initialChildren: Iterable<Node>? = ..., op: (StackPane.() -> Unit)? = ...): StackPane defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'inject' @ [37:25] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, DemoBenchView> where T : Injectable defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> DemoBenchView

'param' @ [38:31] ==> public final inline fun <reified T> param(defaultValue: Boolean?): ReadOnlyProperty<Component, Boolean> defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Boolean

'Component' @ [40:32] ==> public constructor Component() defined in tornadofx.Component[DeserializedClassConstructorDescriptor]

'inject' @ [43:20] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, JVMConfig> where T : Injectable defined in net.corda.demobench.views.NodeTabView.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> JVMConfig

'jvm' @ [44:38] ==> public final val jvm: JVMConfig defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'dataHome' @ [44:42] ==> public final val dataHome: Path defined in net.corda.demobench.model.JVMConfig[PropertyDescriptorImpl]

'if (cordappPathsFile.exists())
                return cordappPathsFile.readAllLines().map { Paths.get(it) }.filter { it.exists() }.toMutableList()
            else
                return ArrayList()' @ [47:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'cordappPathsFile' @ [47:17] ==> public final val cordappPathsFile: Path defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'exists' @ [47:34] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'cordappPathsFile' @ [48:24] ==> public final val cordappPathsFile: Path defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'readAllLines' @ [48:41] ==> public fun Path.readAllLines(charset: Charset = ...): List<String> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'map' @ [48:56] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> (Path..Path?)): List<(Path..Path?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (java.nio.file.Path..java.nio.file.Path?)

'get' @ [48:68] ==> public open fun get(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'it' @ [48:72] ==> value-parameter it: String defined in net.corda.demobench.views.NodeTabView.Companion.loadDefaultCordappPaths.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [48:78] ==> public inline fun <T> Iterable<(Path..Path?)>.filter(predicate: ((Path..Path?)) -> Boolean): List<(Path..Path?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.nio.file.Path..java.nio.file.Path?)

'it' @ [48:87] ==> value-parameter it: (Path..Path?) defined in net.corda.demobench.views.NodeTabView.Companion.loadDefaultCordappPaths.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [48:90] ==> public fun Path.exists(vararg options: LinkOption): Boolean defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'toMutableList' @ [48:101] ==> public fun <T> Collection<Path>.toMutableList(): MutableList<Path> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'ArrayList' @ [50:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Path

'loadDefaultCordappPaths' @ [54:32] ==> public final fun loadDefaultCordappPaths(): MutableList<Path> defined in net.corda.demobench.views.NodeTabView.Companion[SimpleFunctionDescriptorImpl]

'observable' @ [54:58] ==> public fun <T> List<Path>.observable(): ObservableList<Path> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'cordapps' @ [58:13] ==> private final val cordapps: ObservableList<Path> defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'addListener' @ [58:22] ==> public abstract fun addListener(p0: (InvalidationListener..InvalidationListener?)): Unit defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'InvalidationListener' @ [58:34] ==> @FunctionalInterface public fun InvalidationListener(function: ((Observable..Observable?)) -> Unit): InvalidationListener defined in javafx.beans[SimpleFunctionDescriptorImpl]

'log' @ [59:17] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.views.NodeTabView.Companion[DeserializedPropertyDescriptor]

'info' @ [59:21] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'cordappPathsFile' @ [59:53] ==> public final val cordappPathsFile: Path defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'cordappPathsFile' @ [60:17] ==> public final val cordappPathsFile: Path defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'writeLines' @ [60:34] ==> public fun Path.writeLines(lines: Iterable<CharSequence>, charset: Charset = ..., vararg options: OpenOption): Path defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'cordapps' @ [60:45] ==> private final val cordapps: ObservableList<Path> defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'map' @ [60:54] ==> public inline fun <T, R> Iterable<(Path..Path?)>.map(transform: ((Path..Path?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.nio.file.Path..java.nio.file.Path?)
    <R> -> String

'it' @ [60:60] ==> value-parameter it: (Path..Path?) defined in net.corda.demobench.views.NodeTabView.Companion.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toAbsolutePath' @ [60:63] ==> public abstract fun toAbsolutePath(): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'toString' @ [60:80] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'inject' @ [65:35] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, NodeController> where T : Injectable defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> NodeController

'inject' @ [66:38] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, ServiceController> where T : Injectable defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> ServiceController

'FileChooser' @ [67:27] ==> public constructor FileChooser() defined in javafx.stage.FileChooser[JavaClassConstructorDescriptor]

'NodeDataModel' @ [69:25] ==> public constructor NodeDataModel() defined in net.corda.demobench.model.NodeDataModel[ClassConstructorDescriptorImpl]

'if (nodeController.hasNetworkMap()) serviceController.services else serviceController.notaries' @ [70:51] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'nodeController' @ [70:55] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'hasNetworkMap' @ [70:70] ==> public final fun hasNetworkMap(): Boolean defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'serviceController' @ [70:87] ==> private final val serviceController: ServiceController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'services' @ [70:105] ==> public final val services: List<String> defined in net.corda.demobench.model.ServiceController[PropertyDescriptorImpl]

'serviceController' @ [70:119] ==> private final val serviceController: ServiceController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'notaries' @ [70:137] ==> public final val notaries: List<String> defined in net.corda.demobench.model.ServiceController[PropertyDescriptorImpl]

'find' @ [72:36] ==> public final inline fun <reified T : Component> find(params: Map<*, Any?>?, noinline op: (NodeTerminalView.() -> Unit)?): NodeTerminalView defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component> -> NodeTerminalView

'stackpane' @ [73:34] ==> public fun EventTarget.stackpane(initialChildren: Iterable<Node>? = ..., op: (StackPane.() -> Unit)? = ...): StackPane defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'isVisible' @ [74:9] ==> public final var StackPane.isVisible: Boolean[MyPropertyDescriptor]

'showConfig' @ [74:21] ==> private final val showConfig: Boolean defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'styleClass' @ [75:9] ==> public final val StackPane.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'form' @ [77:9] ==> public fun EventTarget.form(op: (Form.() -> Unit)? = ...): Form defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'fieldset' @ [78:13] ==> public fun EventTarget.fieldset(text: String? = ..., icon: Node? = ..., labelPosition: Orientation? = ..., wrapWidth: Double? = ..., op: (Fieldset.() -> Unit)? = ...): Fieldset defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'isFillWidth' @ [79:17] ==> public final var Fieldset.isFillWidth: Boolean[MyPropertyDescriptor]

'field' @ [81:17] ==> public fun EventTarget.field(text: String? = ..., orientation: Orientation = ..., forceLabelIndent: Boolean = ..., op: (Pane.() -> Unit)? = ...): Field defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'nodeNameField' @ [81:39] ==> private final fun Pane.nodeNameField(): TextField defined in net.corda.demobench.views.NodeTabView[SimpleFunctionDescriptorImpl]

'field' @ [82:17] ==> public fun EventTarget.field(text: String? = ..., orientation: Orientation = ..., forceLabelIndent: Boolean = ..., op: (Pane.() -> Unit)? = ...): Field defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'nearestCityField' @ [82:41] ==> private final fun Pane.nearestCityField(): ComboBox<WorldMapLocation> defined in net.corda.demobench.views.NodeTabView[SimpleFunctionDescriptorImpl]

'hbox' @ [85:13] ==> public fun EventTarget.hbox(spacing: Number? = ..., children: Iterable<Node>? = ..., op: (HBox.() -> Unit)? = ...): HBox defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'styleClass' @ [86:17] ==> public final val HBox.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'addAll' @ [86:28] ==> public abstract fun addAll(vararg p0: (String..String?)): Boolean defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'vboxConstraints' @ [87:17] ==> public fun <T : Node> HBox.vboxConstraints(op: VBoxConstraint.() -> Unit): HBox defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> HBox

'vGrow' @ [87:35] ==> public final var vGrow: Priority? defined in tornadofx.VBoxConstraint[DeserializedPropertyDescriptor]

'ALWAYS' @ [87:52] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'fieldset' @ [89:17] ==> public fun EventTarget.fieldset(text: String? = ..., icon: Node? = ..., labelPosition: Orientation? = ..., wrapWidth: Double? = ..., op: (Fieldset.() -> Unit)? = ...): Fieldset defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'hboxConstraints' @ [90:21] ==> public fun <T : Node> Fieldset.hboxConstraints(op: HBoxConstraint.() -> Unit): Fieldset defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Fieldset

'hGrow' @ [90:39] ==> public final var hGrow: Priority? defined in tornadofx.HBoxConstraint[DeserializedPropertyDescriptor]

'ALWAYS' @ [90:56] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'styleClass' @ [91:21] ==> public final val Fieldset.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'addAll' @ [91:32] ==> public abstract fun addAll(vararg p0: (String..String?)): Boolean defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'listview' @ [93:21] ==> public fun <T> EventTarget.listview(values: ObservableList<Path>? = ..., op: (ListView<Path>.() -> Unit)? = ...): ListView<Path> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'cordapps' @ [93:30] ==> private final val cordapps: ObservableList<Path> defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'vboxConstraints' @ [94:25] ==> public fun <T : Node> ListView<Path>.vboxConstraints(op: VBoxConstraint.() -> Unit): ListView<Path> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> ListView<Path>

'vGrow' @ [94:43] ==> public final var vGrow: Priority? defined in tornadofx.VBoxConstraint[DeserializedPropertyDescriptor]

'ALWAYS' @ [94:60] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'setOnKeyPressed' @ [95:25] ==> public final fun setOnKeyPressed(p0: (((KeyEvent..KeyEvent?)) -> Unit..(((KeyEvent..KeyEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.ListView[MyFunctionDescriptor]

'key' @ [96:34] ==> value-parameter key: (KeyEvent..KeyEvent?) defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'code' @ [96:38] ==> public final val KeyEvent.code: (KeyCode..KeyCode?)[MyPropertyDescriptor]

'DELETE' @ [96:54] ==> enum entry DELETE defined in javafx.scene.input.KeyCode[FakeCallableDescriptorForObject]

'!' @ [96:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'selectionModel' @ [96:66] ==> public final var <T : (Any..Any?)> ListView<Path>.selectionModel: (MultipleSelectionModel<(Path..Path?)>..MultipleSelectionModel<(Path..Path?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Path

'isEmpty' @ [96:81] ==> public final val <T : (Any..Any?)> MultipleSelectionModel<(Path..Path?)>.isEmpty: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.nio.file.Path..java.nio.file.Path?)

'cordapps' @ [97:33] ==> private final val cordapps: ObservableList<Path> defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'remove' @ [97:42] ==> public abstract fun remove(element: (Path..Path?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'selectionModel' @ [97:49] ==> public final var <T : (Any..Any?)> ListView<Path>.selectionModel: (MultipleSelectionModel<(Path..Path?)>..MultipleSelectionModel<(Path..Path?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Path

'selectedItem' @ [97:64] ==> public final var <T : (Any..Any?)> MultipleSelectionModel<(Path..Path?)>.selectedItem: (Path..Path?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.nio.file.Path..java.nio.file.Path?)

'key' @ [99:29] ==> value-parameter key: (KeyEvent..KeyEvent?) defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'consume' @ [99:33] ==> public open fun consume(): Unit defined in javafx.scene.input.KeyEvent[JavaMethodDescriptor]

'cellCache' @ [101:25] ==> public final fun <T> ListView<Path>.cellCache(cachedGraphicProvider: (Path) -> Node): Unit defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'hbox' @ [102:29] ==> public fun EventTarget.hbox(spacing: Number? = ..., children: Iterable<Node>? = ..., op: (HBox.() -> Unit)? = ...): HBox defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'label' @ [103:33] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'item' @ [103:39] ==> value-parameter item: Path defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fileName' @ [103:44] ==> public final val Path.fileName: (Path..Path?)[MyPropertyDescriptor]

'toString' @ [103:53] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'pane' @ [104:33] ==> public fun EventTarget.pane(op: (Pane.() -> Unit)? = ...): Pane defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'hboxConstraints' @ [105:37] ==> public fun <T : Node> Pane.hboxConstraints(op: HBoxConstraint.() -> Unit): Pane defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Pane

'hgrow' @ [105:55] ==> public var Node.hgrow: Priority? defined in tornadofx[DeserializedPropertyDescriptor]

'ALWAYS' @ [105:72] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'FontAwesomeIconView' @ [107:46] ==> public constructor FontAwesomeIconView(p0: (FontAwesomeIcon..FontAwesomeIcon?)) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaClassConstructorDescriptor]

'MINUS_CIRCLE' @ [107:82] ==> enum entry MINUS_CIRCLE defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'delete' @ [108:33] ==> val delete: FontAwesomeIconView defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setOnMouseClicked' @ [108:40] ==> public final fun setOnMouseClicked(p0: (((MouseEvent..MouseEvent?)) -> Unit..(((MouseEvent..MouseEvent?)) -> Unit)?)): Unit defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[MyFunctionDescriptor]

'cordapps' @ [109:37] ==> private final val cordapps: ObservableList<Path> defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'remove' @ [109:46] ==> public abstract fun remove(element: (Path..Path?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'selectionModel' @ [109:53] ==> public final var <T : (Any..Any?)> ListView<Path>.selectionModel: (MultipleSelectionModel<(Path..Path?)>..MultipleSelectionModel<(Path..Path?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Path

'selectedItem' @ [109:68] ==> public final var <T : (Any..Any?)> MultipleSelectionModel<(Path..Path?)>.selectedItem: (Path..Path?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.nio.file.Path..java.nio.file.Path?)

'delete' @ [111:33] ==> val delete: FontAwesomeIconView defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'style' @ [111:40] ==> public final var FontAwesomeIconView.style: (String..String?)[MyPropertyDescriptor]

'addChildIfPossible' @ [112:33] ==> public fun EventTarget.addChildIfPossible(node: Node, index: Int? = ...): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'delete' @ [112:52] ==> val delete: FontAwesomeIconView defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fieldset' @ [118:17] ==> public fun EventTarget.fieldset(text: String? = ..., icon: Node? = ..., labelPosition: Orientation? = ..., wrapWidth: Double? = ..., op: (Fieldset.() -> Unit)? = ...): Fieldset defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'styleClass' @ [119:21] ==> public final val Fieldset.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'addAll' @ [119:32] ==> public abstract fun addAll(vararg p0: (String..String?)): Boolean defined in javafx.collections.ObservableList[JavaMethodDescriptor]

'CheckListView' @ [121:40] ==> public constructor CheckListView<T : (Any..Any?)>(p0: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)) defined in org.controlsfx.control.CheckListView[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'availableServices' @ [121:54] ==> private final val availableServices: List<String> defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'observable' @ [121:72] ==> public fun <T> List<String>.observable(): ObservableList<String> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'apply' @ [121:86] ==> @InlineOnly public inline fun <T> CheckListView<String>.apply(block: CheckListView<String>.() -> Unit): CheckListView<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CheckListView<String>

'vboxConstraints' @ [122:25] ==> public fun <T : Node> CheckListView<String>.vboxConstraints(op: VBoxConstraint.() -> Unit): CheckListView<String> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> CheckListView<String>

'vGrow' @ [122:43] ==> public final var vGrow: Priority? defined in tornadofx.VBoxConstraint[DeserializedPropertyDescriptor]

'ALWAYS' @ [122:60] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'model' @ [123:25] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'item' @ [123:31] ==> public final var item: (NodeData..NodeData?) defined in net.corda.demobench.model.NodeDataModel[DeserializedPropertyDescriptor]

'extraServices' @ [123:36] ==> public final val extraServices: SimpleListProperty<String> defined in net.corda.demobench.model.NodeData[PropertyDescriptorImpl]

'set' @ [123:50] ==> public open fun set(p0: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)): Unit defined in javafx.beans.property.SimpleListProperty[JavaMethodDescriptor]

'checkModel' @ [123:54] ==> public final var <T : (Any..Any?)> CheckListView<String>.checkModel: (IndexedCheckModel<(String..String?)>..IndexedCheckModel<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'checkedItems' @ [123:65] ==> public final val <T : (Any..Any?)> IndexedCheckModel<(String..String?)>.checkedItems: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'!' @ [124:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nodeController' @ [124:30] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'hasNetworkMap' @ [124:45] ==> public final fun hasNetworkMap(): Boolean defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'checkModel' @ [125:29] ==> public final var <T : (Any..Any?)> CheckListView<String>.checkModel: (IndexedCheckModel<(String..String?)>..IndexedCheckModel<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'check' @ [125:40] ==> public abstract fun check(p0: Int): Unit defined in org.controlsfx.control.IndexedCheckModel[JavaMethodDescriptor]

'add' @ [128:21] ==> public final fun EventTarget.add(child: Node): Unit defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]

'servicesList' @ [128:25] ==> val servicesList: CheckListView<String> defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'hbox' @ [132:13] ==> public fun EventTarget.hbox(spacing: Number? = ..., children: Iterable<Node>? = ..., op: (HBox.() -> Unit)? = ...): HBox defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'button' @ [133:17] ==> public fun EventTarget.button(text: String = ..., graphic: Node? = ..., op: (Button.() -> Unit)? = ...): Button defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'setOnAction' @ [134:21] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'chooser' @ [135:36] ==> private final val chooser: FileChooser defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'showOpenDialog' @ [135:44] ==> public open fun showOpenDialog(p0: (Window..Window?)): (File..File?) defined in javafx.stage.FileChooser[JavaMethodDescriptor]

'toPath' @ [135:88] ==> public open fun toPath(): (Path..Path?) defined in java.io.File[JavaMethodDescriptor]

'!' @ [136:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'cordapps' @ [136:30] ==> private final val cordapps: ObservableList<Path> defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'contains' @ [136:39] ==> public abstract fun contains(element: (Path..Path?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'app' @ [136:48] ==> val app: (Path..Path?) defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'cordapps' @ [137:29] ==> private final val cordapps: ObservableList<Path> defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'add' @ [137:38] ==> public abstract fun add(element: (Path..Path?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'app' @ [137:42] ==> val app: (Path..Path?) defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'get' @ [141:44] ==> public open fun get(): (FontAwesomeIconFactory..FontAwesomeIconFactory?) defined in de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory[JavaMethodDescriptor]

'setIcon' @ [141:50] ==> public open fun setIcon(p0: (Labeled..Labeled?), p1: (GlyphIcons..GlyphIcons?)): Unit defined in de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory[JavaMethodDescriptor]

'this' @ [141:58] ==> <this> defined in net.corda.demobench.views.NodeTabView.nodeConfigView.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'PLUS' @ [141:80] ==> enum entry PLUS defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'pane' @ [145:17] ==> public fun EventTarget.pane(op: (Pane.() -> Unit)? = ...): Pane defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'hboxConstraints' @ [146:21] ==> public fun <T : Node> Pane.hboxConstraints(op: HBoxConstraint.() -> Unit): Pane defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Pane

'hGrow' @ [146:39] ==> public final var hGrow: Priority? defined in tornadofx.HBoxConstraint[DeserializedPropertyDescriptor]

'ALWAYS' @ [146:56] ==> enum entry ALWAYS defined in javafx.scene.layout.Priority[FakeCallableDescriptorForObject]

'button' @ [149:17] ==> public fun EventTarget.button(text: String = ..., graphic: Node? = ..., op: (Button.() -> Unit)? = ...): Button defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'styleClass' @ [150:21] ==> public final val Button.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]

'setOnAction' @ [151:21] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'model' @ [152:29] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'validate' @ [152:35] ==> public final fun validate(focusFirstError: Boolean, decorateErrors: Boolean, vararg fields: ObservableValue<*>): Boolean defined in net.corda.demobench.model.NodeDataModel[DeserializedSimpleFunctionDescriptor]

'launch' @ [153:29] ==> public final fun launch(): Unit defined in net.corda.demobench.views.NodeTabView[SimpleFunctionDescriptorImpl]

'main' @ [154:29] ==> private final val main: DemoBenchView defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'enableAddNodes' @ [154:34] ==> public final fun enableAddNodes(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'main' @ [155:29] ==> private final val main: DemoBenchView defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'enableSaveProfile' @ [155:34] ==> public final fun enableSaveProfile(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'graphic' @ [158:21] ==> public final var Button.graphic: (Node..Node?)[MyPropertyDescriptor]

'FontAwesomeIconView' @ [158:31] ==> public constructor FontAwesomeIconView(p0: (FontAwesomeIcon..FontAwesomeIcon?)) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaClassConstructorDescriptor]

'PLAY_CIRCLE' @ [158:67] ==> enum entry PLAY_CIRCLE defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'apply' @ [158:80] ==> @InlineOnly public inline fun <T> FontAwesomeIconView.apply(block: FontAwesomeIconView.() -> Unit): FontAwesomeIconView defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FontAwesomeIconView

'style' @ [158:88] ==> public final var FontAwesomeIconView.style: (String..String?)[MyPropertyDescriptor]

'CloseableTab' @ [164:19] ==> public constructor CloseableTab(text: String, content: Node) defined in net.corda.demobench.ui.CloseableTab[ClassConstructorDescriptorImpl]

'root' @ [164:44] ==> public open val root: StackPane defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'nodeTab' @ [168:9] ==> public final val nodeTab: CloseableTab defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'setOnCloseRequest' @ [168:17] ==> public final fun setOnCloseRequest(p0: (((Event..Event?)) -> Unit..(((Event..Event?)) -> Unit)?)): Unit defined in net.corda.demobench.ui.CloseableTab[MyFunctionDescriptor]

'nodeTerminalView' @ [169:13] ==> private final val nodeTerminalView: NodeTerminalView defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'destroy' @ [169:30] ==> public final fun destroy(): Unit defined in net.corda.demobench.views.NodeTerminalView[SimpleFunctionDescriptorImpl]

'nodeTab' @ [171:9] ==> public final val nodeTab: CloseableTab defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'graphic' @ [171:17] ==> public final var CloseableTab.graphic: (Node..Node?)[MyPropertyDescriptor]

'FontAwesomeIconView' @ [171:27] ==> public constructor FontAwesomeIconView(p0: (FontAwesomeIcon..FontAwesomeIcon?)) defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView[JavaClassConstructorDescriptor]

'BANK' @ [171:63] ==> enum entry BANK defined in de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon[FakeCallableDescriptorForObject]

'root' @ [173:9] ==> public open val root: StackPane defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'add' @ [173:14] ==> public final fun EventTarget.add(child: Node): Unit defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]

'nodeConfigView' @ [173:18] ==> private final val nodeConfigView: StackPane defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'root' @ [174:9] ==> public open val root: StackPane defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'add' @ [174:14] ==> public final fun EventTarget.add(uiComponent: UIComponent): Unit defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]

'nodeTerminalView' @ [174:18] ==> private final val nodeTerminalView: NodeTerminalView defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'model' @ [176:9] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'p2pPort' @ [176:15] ==> public final val p2pPort: SimpleIntegerProperty defined in net.corda.demobench.model.NodeDataModel[PropertyDescriptorImpl]

'value' @ [176:23] ==> public final var SimpleIntegerProperty.value: (Int..Int?)[MyPropertyDescriptor]

'nodeController' @ [176:31] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'nextPort' @ [176:46] ==> public final val nextPort: Int defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'model' @ [177:9] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'rpcPort' @ [177:15] ==> public final val rpcPort: SimpleIntegerProperty defined in net.corda.demobench.model.NodeDataModel[PropertyDescriptorImpl]

'value' @ [177:23] ==> public final var SimpleIntegerProperty.value: (Int..Int?)[MyPropertyDescriptor]

'nodeController' @ [177:31] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'nextPort' @ [177:46] ==> public final val nextPort: Int defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'model' @ [178:9] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'webPort' @ [178:15] ==> public final val webPort: SimpleIntegerProperty defined in net.corda.demobench.model.NodeDataModel[PropertyDescriptorImpl]

'value' @ [178:23] ==> public final var SimpleIntegerProperty.value: (Int..Int?)[MyPropertyDescriptor]

'nodeController' @ [178:31] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'nextPort' @ [178:46] ==> public final val nextPort: Int defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'model' @ [179:9] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'h2Port' @ [179:15] ==> public final val h2Port: SimpleIntegerProperty defined in net.corda.demobench.model.NodeDataModel[PropertyDescriptorImpl]

'value' @ [179:22] ==> public final var SimpleIntegerProperty.value: (Int..Int?)[MyPropertyDescriptor]

'nodeController' @ [179:30] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'nextPort' @ [179:45] ==> public final val nextPort: Int defined in net.corda.demobench.model.NodeController[PropertyDescriptorImpl]

'SuggestedDetails' @ [181:24] ==> public object SuggestedDetails defined in net.corda.demobench.model in file NodeData.kt[FakeCallableDescriptorForObject]

'nextBank' @ [181:41] ==> public final val nextBank: Pair<String, String> defined in net.corda.demobench.model.SuggestedDetails[PropertyDescriptorImpl]

'model' @ [182:9] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'legalName' @ [182:15] ==> public final val legalName: SimpleStringProperty defined in net.corda.demobench.model.NodeDataModel[PropertyDescriptorImpl]

'value' @ [182:25] ==> public final var SimpleStringProperty.value: (String..String?)[MyPropertyDescriptor]

'defaults' @ [182:33] ==> val defaults: Pair<String, String> defined in net.corda.demobench.views.NodeTabView.<init>[LocalVariableDescriptor]

'first' @ [182:42] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'model' @ [183:9] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'nearestCity' @ [183:15] ==> public final val nearestCity: SimpleObjectProperty<WorldMapLocation> defined in net.corda.demobench.model.NodeDataModel[PropertyDescriptorImpl]

'value' @ [183:27] ==> public final var <T : (Any..Any?)> SimpleObjectProperty<WorldMapLocation>.value: (WorldMapLocation..WorldMapLocation?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WorldMapLocation

'CityDatabase' @ [183:35] ==> public object CityDatabase defined in net.corda.core.node[FakeCallableDescriptorForObject]

'defaults' @ [183:48] ==> val defaults: Pair<String, String> defined in net.corda.demobench.views.NodeTabView.<init>[LocalVariableDescriptor]

'second' @ [183:57] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'chooser' @ [185:9] ==> private final val chooser: FileChooser defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'title' @ [185:17] ==> public final var FileChooser.title: (String..String?)[MyPropertyDescriptor]

'chooser' @ [186:9] ==> private final val chooser: FileChooser defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'initialDirectory' @ [186:17] ==> public final var FileChooser.initialDirectory: (File..File?)[MyPropertyDescriptor]

'jvm' @ [186:36] ==> public final val jvm: JVMConfig defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'dataHome' @ [186:40] ==> public final val dataHome: Path defined in net.corda.demobench.model.JVMConfig[PropertyDescriptorImpl]

'toFile' @ [186:49] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'chooser' @ [187:9] ==> private final val chooser: FileChooser defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'extensionFilters' @ [187:17] ==> public final val FileChooser.extensionFilters: (ObservableList<(FileChooser.ExtensionFilter..FileChooser.ExtensionFilter?)>..ObservableList<(FileChooser.ExtensionFilter..FileChooser.ExtensionFilter?)>?)[MyPropertyDescriptor]

'add' @ [187:34] ==> public abstract fun add(element: (FileChooser.ExtensionFilter..FileChooser.ExtensionFilter?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'ExtensionFilter' @ [187:50] ==> public constructor ExtensionFilter(p0: (String..String?), vararg p1: (String..String?)) defined in javafx.stage.FileChooser.ExtensionFilter[JavaClassConstructorDescriptor]

'model' @ [189:9] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'validate' @ [189:15] ==> public final fun validate(focusFirstError: Boolean, decorateErrors: Boolean, vararg fields: ObservableValue<*>): Boolean defined in net.corda.demobench.model.NodeDataModel[DeserializedSimpleFunctionDescriptor]

'textfield' @ [192:40] ==> public fun EventTarget.textfield(property: ObservableValue<String>, op: (TextField.() -> Unit)? = ...): TextField defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'model' @ [192:50] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'legalName' @ [192:56] ==> public final val legalName: SimpleStringProperty defined in net.corda.demobench.model.NodeDataModel[PropertyDescriptorImpl]

'minWidth' @ [193:9] ==> public final var TextField.minWidth: Double[MyPropertyDescriptor]

'textWidth' @ [193:20] ==> public const final val textWidth: Double defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'validator' @ [194:9] ==> public fun TextInputControl.validator(trigger: ValidationTrigger = ..., validator: ValidationContext.(String?) -> ValidationMessage?): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'if (it == null) {
                error("Node name is required")
            } else if (nodeController.nameExists(normaliseLegalName(it))) {
                error("Node with this name already exists")
            } else {
                try {
                    validateLegalName(normaliseLegalName(it))
                    null
                } catch (e: IllegalArgumentException) {
                    error(e.message)
                }
            }' @ [195:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ValidationMessage?, elseBranch: ValidationMessage?): ValidationMessage?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ValidationMessage?

'it' @ [195:17] ==> value-parameter it: String? defined in net.corda.demobench.views.NodeTabView.nodeNameField.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'error' @ [196:17] ==> public final fun error(message: String? = ...): ValidationMessage defined in tornadofx.ValidationContext[DeserializedSimpleFunctionDescriptor]

'if (nodeController.nameExists(normaliseLegalName(it))) {
                error("Node with this name already exists")
            } else {
                try {
                    validateLegalName(normaliseLegalName(it))
                    null
                } catch (e: IllegalArgumentException) {
                    error(e.message)
                }
            }' @ [197:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ValidationMessage?, elseBranch: ValidationMessage?): ValidationMessage?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ValidationMessage?

'nodeController' @ [197:24] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'nameExists' @ [197:39] ==> public final fun nameExists(name: String): Boolean defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'normaliseLegalName' @ [197:50] ==> public fun normaliseLegalName(legalName: String): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [197:69] ==> value-parameter it: String? defined in net.corda.demobench.views.NodeTabView.nodeNameField.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'error' @ [198:17] ==> public final fun error(message: String? = ...): ValidationMessage defined in tornadofx.ValidationContext[DeserializedSimpleFunctionDescriptor]

'validateLegalName' @ [201:21] ==> public fun validateLegalName(normalizedLegalName: String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'normaliseLegalName' @ [201:39] ==> public fun normaliseLegalName(legalName: String): String defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [201:58] ==> value-parameter it: String? defined in net.corda.demobench.views.NodeTabView.nodeNameField.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'error' @ [204:21] ==> public final fun error(message: String? = ...): ValidationMessage defined in tornadofx.ValidationContext[DeserializedSimpleFunctionDescriptor]

'e' @ [204:27] ==> val e: IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.demobench.views.NodeTabView.nodeNameField.<anonymous>.<anonymous>[LocalVariableDescriptor]

'message' @ [204:29] ==> public open val message: String? defined in java.lang.IllegalArgumentException[DeserializedPropertyDescriptor]

'runAsync' @ [210:25] ==> public final fun <T> runAsync(status: TaskStatus?, func: FXTask<*>.() -> Map<String, Image>): Task<Map<String, Image>> defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<String, Image>

'CityDatabase' @ [211:9] ==> public object CityDatabase defined in net.corda.core.node[FakeCallableDescriptorForObject]

'cityMap' @ [211:22] ==> public final val cityMap: HashMap<String, WorldMapLocation> defined in net.corda.core.node.CityDatabase[DeserializedPropertyDescriptor]

'values' @ [211:30] ==> public open val values: MutableCollection<WorldMapLocation> defined in java.util.HashMap[JavaPropertyDescriptor]

'map' @ [211:37] ==> public inline fun <T, R> Iterable<WorldMapLocation>.map(transform: (WorldMapLocation) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WorldMapLocation
    <R> -> String

'it' @ [211:43] ==> value-parameter it: WorldMapLocation defined in net.corda.demobench.views.NodeTabView.flags.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'countryCode' @ [211:46] ==> public final val countryCode: String defined in net.corda.core.node.WorldMapLocation[DeserializedPropertyDescriptor]

'toSet' @ [211:60] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'map' @ [211:68] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Pair<String, Image>): List<Pair<String, Image>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Pair<String, Image>

'it' @ [211:74] ==> value-parameter it: String defined in net.corda.demobench.views.NodeTabView.flags.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Image' @ [211:80] ==> public constructor Image(@NamedArg p0: (String..String?)) defined in javafx.scene.image.Image[JavaClassConstructorDescriptor]

'resources' @ [211:86] ==> public final val resources: ResourceLookup defined in net.corda.demobench.views.NodeTabView[DeserializedPropertyDescriptor]

'it' @ [211:125] ==> value-parameter it: String defined in net.corda.demobench.views.NodeTabView.flags.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toMap' @ [211:137] ==> public fun <K, V> Iterable<Pair<String, Image>>.toMap(): Map<String, Image> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Image

'combobox' @ [215:16] ==> public fun <T> EventTarget.combobox(property: Property<(WorldMapLocation..WorldMapLocation?)>? = ..., values: List<(WorldMapLocation..WorldMapLocation?)>? = ..., op: (ComboBox<(WorldMapLocation..WorldMapLocation?)>.() -> Unit)? = ...): ComboBox<(WorldMapLocation..WorldMapLocation?)> defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'model' @ [215:25] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'nearestCity' @ [215:31] ==> public final val nearestCity: SimpleObjectProperty<WorldMapLocation> defined in net.corda.demobench.model.NodeDataModel[PropertyDescriptorImpl]

'CityDatabase' @ [215:44] ==> public object CityDatabase defined in net.corda.core.node[FakeCallableDescriptorForObject]

'cityMap' @ [215:57] ==> public final val cityMap: HashMap<String, WorldMapLocation> defined in net.corda.core.node.CityDatabase[DeserializedPropertyDescriptor]

'values' @ [215:65] ==> public open val values: MutableCollection<WorldMapLocation> defined in java.util.HashMap[JavaPropertyDescriptor]

'toList' @ [215:72] ==> public fun <T> Iterable<WorldMapLocation>.toList(): List<WorldMapLocation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WorldMapLocation

'sortedBy' @ [215:81] ==> public inline fun <T, R : Comparable<String>> Iterable<WorldMapLocation>.sortedBy(crossinline selector: (WorldMapLocation) -> String?): List<WorldMapLocation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WorldMapLocation
    <R : Comparable<R>> -> String

'it' @ [215:92] ==> value-parameter it: WorldMapLocation defined in net.corda.demobench.views.NodeTabView.nearestCityField.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [215:95] ==> public final val description: String defined in net.corda.core.node.WorldMapLocation[DeserializedPropertyDescriptor]

'minWidth' @ [216:13] ==> public final var <T : (Any..Any?)> ComboBox<(WorldMapLocation..WorldMapLocation?)>.minWidth: Double[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'textWidth' @ [216:24] ==> public const final val textWidth: Double defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'styleClass' @ [217:13] ==> public final val <T : (Any..Any?)> ComboBox<(WorldMapLocation..WorldMapLocation?)>.styleClass: (ObservableList<(String..String?)>..ObservableList<(String..String?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'cellFormat' @ [218:13] ==> public final fun <T> ComboBox<(WorldMapLocation..WorldMapLocation?)>.cellFormat(formatButtonCell: Boolean, formatter: ListCell<(WorldMapLocation..WorldMapLocation?)>.((WorldMapLocation..WorldMapLocation?)) -> Unit): Unit defined in net.corda.demobench.views.NodeTabView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'graphic' @ [219:17] ==> public final var <T : (Any..Any?)> ListCell<(WorldMapLocation..WorldMapLocation?)>.graphic: (Node..Node?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'hbox' @ [219:27] ==> public fun EventTarget.hbox(spacing: Number? = ..., children: Iterable<Node>? = ..., op: (HBox.() -> Unit)? = ...): HBox defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'imageview' @ [220:21] ==> public fun EventTarget.imageview(url: String? = ..., lazyload: Boolean = ..., op: (ImageView.() -> Unit)? = ...): ImageView defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'image' @ [221:25] ==> public final var ImageView.image: (Image..Image?)[MyPropertyDescriptor]

'flags' @ [221:33] ==> private final val flags: Task<Map<String, Image>> defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'get' @ [221:39] ==> public open fun get(): (Map<String, Image>..Map<String, Image>?) defined in javafx.concurrent.Task[JavaMethodDescriptor]

'it' @ [221:45] ==> value-parameter it: (WorldMapLocation..WorldMapLocation?) defined in net.corda.demobench.views.NodeTabView.nearestCityField.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'countryCode' @ [221:48] ==> public final val countryCode: String defined in net.corda.core.node.WorldMapLocation[DeserializedPropertyDescriptor]

'label' @ [223:21] ==> public fun EventTarget.label(text: String = ..., op: (Label.() -> Unit)? = ...): Label defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'it' @ [223:27] ==> value-parameter it: (WorldMapLocation..WorldMapLocation?) defined in net.corda.demobench.views.NodeTabView.nearestCityField.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [223:30] ==> public final val description: String defined in net.corda.core.node.WorldMapLocation[DeserializedPropertyDescriptor]

'alignment' @ [224:21] ==> public final var HBox.alignment: (Pos..Pos?)[MyPropertyDescriptor]

'CENTER_LEFT' @ [224:37] ==> enum entry CENTER_LEFT defined in javafx.geometry.Pos[FakeCallableDescriptorForObject]

'validator' @ [228:13] ==> public inline fun <reified T> ComboBox<(WorldMapLocation..WorldMapLocation?)>.validator(trigger: ValidationTrigger = ..., noinline validator: ValidationContext.(WorldMapLocation?) -> ValidationMessage?): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'if (it == null) error("Please select a city") else null' @ [229:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ValidationMessage?, elseBranch: ValidationMessage?): ValidationMessage?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ValidationMessage?

'it' @ [229:21] ==> value-parameter it: WorldMapLocation? defined in net.corda.demobench.views.NodeTabView.nearestCityField.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'error' @ [229:33] ==> public final fun error(message: String? = ...): ValidationMessage defined in tornadofx.ValidationContext[DeserializedSimpleFunctionDescriptor]

'converter' @ [232:13] ==> public final var <T : (Any..Any?)> ComboBox<(WorldMapLocation..WorldMapLocation?)>.converter: (StringConverter<(WorldMapLocation..WorldMapLocation?)>..StringConverter<(WorldMapLocation..WorldMapLocation?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'StringConverter<WorldMapLocation>' @ [232:34] ==> public constructor StringConverter<T : (Any..Any?)>() defined in javafx.util.StringConverter[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WorldMapLocation

'loc' @ [233:65] ==> value-parameter loc: WorldMapLocation? defined in net.corda.demobench.views.NodeTabView.nearestCityField.<anonymous>.<no name provided>.toString[ValueParameterDescriptorImpl]

'description' @ [233:70] ==> public final val description: String defined in net.corda.core.node.WorldMapLocation[DeserializedPropertyDescriptor]

'CityDatabase' @ [234:78] ==> public object CityDatabase defined in net.corda.core.node[FakeCallableDescriptorForObject]

'string' @ [234:91] ==> value-parameter string: String defined in net.corda.demobench.views.NodeTabView.nearestCityField.<anonymous>.<no name provided>.fromString[ValueParameterDescriptorImpl]

'value' @ [237:13] ==> public final var <T : (Any..Any?)> ComboBox<(WorldMapLocation..WorldMapLocation?)>.value: (WorldMapLocation..WorldMapLocation?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'CityDatabase' @ [237:21] ==> public object CityDatabase defined in net.corda.core.node[FakeCallableDescriptorForObject]

'isEditable' @ [239:13] ==> public final var <T : (Any..Any?)> ComboBox<(WorldMapLocation..WorldMapLocation?)>.isEditable: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'makeAutocompletable' @ [240:13] ==> public fun <T> ComboBox<(WorldMapLocation..WorldMapLocation?)>.makeAutocompletable(autoCompleteFilter: ((String) -> List<(WorldMapLocation..WorldMapLocation?)>)? = ...): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.node.WorldMapLocation..net.corda.core.node.WorldMapLocation?)

'model' @ [248:9] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'commit' @ [248:15] ==> public final fun commit(vararg fields: ObservableValue<*>, successFn: (() -> Unit)?): Boolean defined in net.corda.demobench.model.NodeDataModel[DeserializedSimpleFunctionDescriptor]

'nodeController' @ [249:22] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'validate' @ [249:37] ==> public final fun validate(nodeData: NodeData): NodeConfig? defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'model' @ [249:46] ==> private final val model: NodeDataModel defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'item' @ [249:52] ==> public final var item: (NodeData..NodeData?) defined in net.corda.demobench.model.NodeDataModel[DeserializedPropertyDescriptor]

'config' @ [250:13] ==> val config: NodeConfig? defined in net.corda.demobench.views.NodeTabView.launch[LocalVariableDescriptor]

'nodeConfigView' @ [251:13] ==> private final val nodeConfigView: StackPane defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'isVisible' @ [251:28] ==> public final var StackPane.isVisible: Boolean[MyPropertyDescriptor]

'config' @ [252:13] ==> val config: NodeConfig? defined in net.corda.demobench.views.NodeTabView.launch[LocalVariableDescriptor]

'install' @ [252:20] ==> public final fun install(plugins: Collection<Path>): Unit defined in net.corda.demobench.model.NodeConfig[SimpleFunctionDescriptorImpl]

'cordapps' @ [252:28] ==> private final val cordapps: ObservableList<Path> defined in net.corda.demobench.views.NodeTabView.Companion[PropertyDescriptorImpl]

'launchNode' @ [253:13] ==> private final fun launchNode(config: NodeConfig): Unit defined in net.corda.demobench.views.NodeTabView[SimpleFunctionDescriptorImpl]

'config' @ [253:24] ==> val config: NodeConfig? defined in net.corda.demobench.views.NodeTabView.launch[LocalVariableDescriptor]

'nodeController' @ [261:9] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'register' @ [261:24] ==> public final fun register(config: NodeConfig): Boolean defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'config' @ [261:33] ==> value-parameter config: NodeConfig defined in net.corda.demobench.views.NodeTabView.launch[ValueParameterDescriptorImpl]

'launchNode' @ [262:9] ==> private final fun launchNode(config: NodeConfig): Unit defined in net.corda.demobench.views.NodeTabView[SimpleFunctionDescriptorImpl]

'config' @ [262:20] ==> value-parameter config: NodeConfig defined in net.corda.demobench.views.NodeTabView.launch[ValueParameterDescriptorImpl]

'CityDatabase' @ [266:27] ==> public object CityDatabase defined in net.corda.core.node[FakeCallableDescriptorForObject]

'cityMap' @ [266:40] ==> public final val cityMap: HashMap<String, WorldMapLocation> defined in net.corda.core.node.CityDatabase[DeserializedPropertyDescriptor]

'config' @ [266:48] ==> value-parameter config: NodeConfig defined in net.corda.demobench.views.NodeTabView.launchNode[ValueParameterDescriptorImpl]

'nearestCity' @ [266:55] ==> public final val nearestCity: String defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'countryCode' @ [266:69] ==> public final val countryCode: String defined in net.corda.core.node.WorldMapLocation[DeserializedPropertyDescriptor]

'countryCode' @ [267:13] ==> val countryCode: String? defined in net.corda.demobench.views.NodeTabView.launchNode[LocalVariableDescriptor]

'nodeTab' @ [268:13] ==> public final val nodeTab: CloseableTab defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'graphic' @ [268:21] ==> public final var CloseableTab.graphic: (Node..Node?)[MyPropertyDescriptor]

'ImageView' @ [268:31] ==> public constructor ImageView(p0: (Image..Image?)) defined in javafx.scene.image.ImageView[JavaClassConstructorDescriptor]

'flags' @ [268:41] ==> private final val flags: Task<Map<String, Image>> defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'get' @ [268:47] ==> public open fun get(): (Map<String, Image>..Map<String, Image>?) defined in javafx.concurrent.Task[JavaMethodDescriptor]

'countryCode' @ [268:53] ==> val countryCode: String? defined in net.corda.demobench.views.NodeTabView.launchNode[LocalVariableDescriptor]

'apply' @ [268:67] ==> @InlineOnly public inline fun <T> ImageView.apply(block: ImageView.() -> Unit): ImageView defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ImageView

'fitWidth' @ [268:75] ==> public final var ImageView.fitWidth: Double[MyPropertyDescriptor]

'isPreserveRatio' @ [268:92] ==> public final var ImageView.isPreserveRatio: Boolean[MyPropertyDescriptor]

'nodeTab' @ [270:9] ==> public final val nodeTab: CloseableTab defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'text' @ [270:17] ==> public final var CloseableTab.text: (String..String?)[MyPropertyDescriptor]

'config' @ [270:24] ==> value-parameter config: NodeConfig defined in net.corda.demobench.views.NodeTabView.launchNode[ValueParameterDescriptorImpl]

'legalName' @ [270:31] ==> public final val legalName: X500Name defined in net.corda.demobench.model.NodeConfig[PropertyDescriptorImpl]

'commonName' @ [270:41] ==> public val X500Name.commonName: String defined in net.corda.core.crypto[DeserializedPropertyDescriptor]

'nodeTerminalView' @ [271:9] ==> private final val nodeTerminalView: NodeTerminalView defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'open' @ [271:26] ==> public final fun open(config: NodeConfig, onExit: (Int) -> Unit): Unit defined in net.corda.demobench.views.NodeTerminalView[SimpleFunctionDescriptorImpl]

'config' @ [271:31] ==> value-parameter config: NodeConfig defined in net.corda.demobench.views.NodeTabView.launchNode[ValueParameterDescriptorImpl]

'runLater' @ [272:22] ==> public final fun runLater(p0: (() -> Unit..(() -> Unit)?)): Unit defined in javafx.application.Platform[SamAdapterFunctionDescriptor]

'if (exitCode == 0) {
                    nodeTab.requestClose()
                } else {
                    // The node did not shut down cleanly. Keep the
                    // terminal open but ensure that it is disabled.
                    nodeTerminalView.shutdown()
                }' @ [273:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'exitCode' @ [273:21] ==> value-parameter exitCode: Int defined in net.corda.demobench.views.NodeTabView.launchNode.<anonymous>[ValueParameterDescriptorImpl]

'nodeTab' @ [274:21] ==> public final val nodeTab: CloseableTab defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'requestClose' @ [274:29] ==> public final fun requestClose(): Unit defined in net.corda.demobench.ui.CloseableTab[SimpleFunctionDescriptorImpl]

'nodeTerminalView' @ [278:21] ==> private final val nodeTerminalView: NodeTerminalView defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'shutdown' @ [278:38] ==> public final fun shutdown(): Unit defined in net.corda.demobench.views.NodeTerminalView[SimpleFunctionDescriptorImpl]

'nodeController' @ [280:17] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'dispose' @ [280:32] ==> public final fun dispose(config: NodeConfig): Unit defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'config' @ [280:40] ==> value-parameter config: NodeConfig defined in net.corda.demobench.views.NodeTabView.launchNode[ValueParameterDescriptorImpl]

'main' @ [281:17] ==> private final val main: DemoBenchView defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'forceAtLeastOneTab' @ [281:22] ==> public final fun forceAtLeastOneTab(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'nodeTab' @ [285:9] ==> public final val nodeTab: CloseableTab defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'setOnSelectionChanged' @ [285:17] ==> public final fun setOnSelectionChanged(p0: (((Event..Event?)) -> Unit..(((Event..Event?)) -> Unit)?)): Unit defined in net.corda.demobench.ui.CloseableTab[MyFunctionDescriptor]

'nodeTab' @ [286:17] ==> public final val nodeTab: CloseableTab defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'isSelected' @ [286:25] ==> public final val CloseableTab.isSelected: Boolean[MyPropertyDescriptor]

'nodeTerminalView' @ [287:17] ==> private final val nodeTerminalView: NodeTerminalView defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'takeFocus' @ [287:34] ==> public final fun takeFocus(): Unit defined in net.corda.demobench.views.NodeTerminalView[SimpleFunctionDescriptorImpl]

