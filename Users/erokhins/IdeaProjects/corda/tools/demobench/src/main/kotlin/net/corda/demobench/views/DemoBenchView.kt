'View' @ [17:23] ==> @JvmOverloads public constructor View(title: String? = ..., icon: Node? = ...) defined in tornadofx.View[DeserializedClassConstructorDescriptor]

'fxml' @ [18:26] ==> public final fun <T : Node> fxml(location: String?, hasControllerAttribute: Boolean): ReadOnlyProperty<UIComponent, Parent> defined in net.corda.demobench.views.DemoBenchView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Node> -> Parent

'inject' @ [20:38] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, ProfileController> where T : Injectable defined in net.corda.demobench.views.DemoBenchView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> ProfileController

'inject' @ [21:35] ==> public final inline fun <reified T : Component> inject(overrideScope: Scope, params: Map<String, Any?>?): ReadOnlyProperty<Component, NodeController> where T : Injectable defined in net.corda.demobench.views.DemoBenchView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> NodeController

'fxid' @ [22:34] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, Button> defined in net.corda.demobench.views.DemoBenchView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Button

'fxid' @ [23:32] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, TabPane> defined in net.corda.demobench.views.DemoBenchView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> TabPane

'fxid' @ [24:29] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, MenuItem> defined in net.corda.demobench.views.DemoBenchView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> MenuItem

'fxid' @ [25:31] ==> public final inline fun <reified T : Any> fxid(propName: String?): ReadOnlyProperty<UIComponent, MenuItem> defined in net.corda.demobench.views.DemoBenchView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> MenuItem

'importStylesheet' @ [28:9] ==> public fun importStylesheet(stylesheet: String): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'importStylesheet' @ [29:9] ==> public fun importStylesheet(stylesheet: String): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'configureShutdown' @ [31:9] ==> private final fun configureShutdown(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'configureProfileSaveAs' @ [33:9] ==> private final fun configureProfileSaveAs(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'configureProfileOpen' @ [34:9] ==> private final fun configureProfileOpen(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'configureAddNode' @ [36:9] ==> private final fun configureAddNode(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'primaryStage' @ [39:39] ==> public final val primaryStage: Stage defined in net.corda.demobench.views.DemoBenchView[DeserializedPropertyDescriptor]

'setOnCloseRequest' @ [39:52] ==> public final fun setOnCloseRequest(p0: (((WindowEvent..WindowEvent?)) -> Unit..(((WindowEvent..WindowEvent?)) -> Unit)?)): Unit defined in javafx.stage.Stage[MyFunctionDescriptor]

'log' @ [40:9] ==> public final val log: (Logger..Logger?) defined in net.corda.demobench.views.DemoBenchView[DeserializedPropertyDescriptor]

'info' @ [40:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'addNodeButton' @ [43:9] ==> private final val addNodeButton: Button defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'isDisable' @ [43:23] ==> public final var Button.isDisable: Boolean[MyPropertyDescriptor]

'closeAllTabs' @ [45:9] ==> private final fun closeAllTabs(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'exit' @ [46:18] ==> public open fun exit(): Unit defined in javafx.application.Platform[JavaMethodDescriptor]

'menuSaveAs' @ [49:44] ==> private final val menuSaveAs: MenuItem defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'setOnAction' @ [49:55] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.MenuItem[MyFunctionDescriptor]

'profileController' @ [51:17] ==> private final val profileController: ProfileController defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'saveProfile' @ [51:35] ==> @Throws public final fun saveProfile(): Boolean defined in net.corda.demobench.profile.ProfileController[SimpleFunctionDescriptorImpl]

'menuSaveAs' @ [52:17] ==> private final val menuSaveAs: MenuItem defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'isDisable' @ [52:28] ==> public final var MenuItem.isDisable: Boolean[MyPropertyDescriptor]

'ExceptionDialog' @ [55:13] ==> public constructor ExceptionDialog(p0: (Throwable..Throwable?)) defined in org.controlsfx.dialog.ExceptionDialog[JavaClassConstructorDescriptor]

'e' @ [55:29] ==> val e: Exception /* = Exception */ defined in net.corda.demobench.views.DemoBenchView.configureProfileSaveAs.<anonymous>[LocalVariableDescriptor]

'apply' @ [55:32] ==> @InlineOnly public inline fun <T> ExceptionDialog.apply(block: ExceptionDialog.() -> Unit): ExceptionDialog defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExceptionDialog

'initOwner' @ [55:40] ==> public final fun initOwner(p0: (Window..Window?)): Unit defined in org.controlsfx.dialog.ExceptionDialog[JavaMethodDescriptor]

'root' @ [55:50] ==> public open val root: Parent defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'scene' @ [55:55] ==> public final val Parent.scene: (Scene..Scene?)[MyPropertyDescriptor]

'window' @ [55:61] ==> public final val Scene.window: (Window..Window?)[MyPropertyDescriptor]

'showAndWait' @ [55:71] ==> public final fun showAndWait(): (Optional<(ButtonType..ButtonType?)>..Optional<(ButtonType..ButtonType?)>?) defined in org.controlsfx.dialog.ExceptionDialog[JavaMethodDescriptor]

'menuOpen' @ [59:42] ==> private final val menuOpen: MenuItem defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'setOnAction' @ [59:51] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.MenuItem[MyFunctionDescriptor]

'profileController' @ [61:27] ==> private final val profileController: ProfileController defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'openProfile' @ [61:45] ==> @Throws public final fun openProfile(): List<InstallConfig>? defined in net.corda.demobench.profile.ProfileController[SimpleFunctionDescriptorImpl]

'loadProfile' @ [62:13] ==> private final fun loadProfile(nodes: List<InstallConfig>): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'profile' @ [62:25] ==> val profile: List<InstallConfig> defined in net.corda.demobench.views.DemoBenchView.configureProfileOpen.<anonymous>[LocalVariableDescriptor]

'ExceptionDialog' @ [64:13] ==> public constructor ExceptionDialog(p0: (Throwable..Throwable?)) defined in org.controlsfx.dialog.ExceptionDialog[JavaClassConstructorDescriptor]

'e' @ [64:29] ==> val e: Exception /* = Exception */ defined in net.corda.demobench.views.DemoBenchView.configureProfileOpen.<anonymous>[LocalVariableDescriptor]

'apply' @ [64:32] ==> @InlineOnly public inline fun <T> ExceptionDialog.apply(block: ExceptionDialog.() -> Unit): ExceptionDialog defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExceptionDialog

'initOwner' @ [64:40] ==> public final fun initOwner(p0: (Window..Window?)): Unit defined in org.controlsfx.dialog.ExceptionDialog[JavaMethodDescriptor]

'root' @ [64:50] ==> public open val root: Parent defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'scene' @ [64:55] ==> public final val Parent.scene: (Scene..Scene?)[MyPropertyDescriptor]

'window' @ [64:61] ==> public final val Scene.window: (Window..Window?)[MyPropertyDescriptor]

'showAndWait' @ [64:71] ==> public final fun showAndWait(): (Optional<(ButtonType..ButtonType?)>..Optional<(ButtonType..ButtonType?)>?) defined in org.controlsfx.dialog.ExceptionDialog[JavaMethodDescriptor]

'addNodeButton' @ [69:9] ==> private final val addNodeButton: Button defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'setOnAction' @ [69:23] ==> public final fun setOnAction(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javafx.scene.control.Button[MyFunctionDescriptor]

'createNodeTabView' @ [70:31] ==> private final fun createNodeTabView(showConfig: Boolean): NodeTabView defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'nodeTabPane' @ [71:13] ==> private final val nodeTabPane: TabPane defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'selectionModel' @ [71:25] ==> public final var TabPane.selectionModel: (SingleSelectionModel<(Tab..Tab?)>..SingleSelectionModel<(Tab..Tab?)>?)[MyPropertyDescriptor]

'select' @ [71:40] ==> public open fun select(p0: (Tab..Tab?)): Unit defined in javafx.scene.control.SingleSelectionModel[JavaMethodDescriptor]

'nodeTabView' @ [71:47] ==> val nodeTabView: NodeTabView defined in net.corda.demobench.views.DemoBenchView.configureAddNode.<anonymous>[LocalVariableDescriptor]

'nodeTab' @ [71:59] ==> public final val nodeTab: CloseableTab defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'addNodeButton' @ [74:13] ==> private final val addNodeButton: Button defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'isDisable' @ [74:27] ==> public final var Button.isDisable: Boolean[MyPropertyDescriptor]

'addNodeButton' @ [76:9] ==> private final val addNodeButton: Button defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'fire' @ [76:23] ==> public open fun fire(): Unit defined in javafx.scene.control.Button[JavaMethodDescriptor]

'ArrayList' @ [79:34] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (Tab..Tab?)>..Collection<(Tab..Tab?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Tab

'nodeTabPane' @ [79:49] ==> private final val nodeTabPane: TabPane defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'tabs' @ [79:61] ==> public final val TabPane.tabs: (ObservableList<(Tab..Tab?)>..ObservableList<(Tab..Tab?)>?)[MyPropertyDescriptor]

'forEach' @ [79:67] ==> @HidesMembers public inline fun <T> Iterable<Tab>.forEach(action: (Tab) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Tab

'it' @ [80:10] ==> value-parameter it: Tab defined in net.corda.demobench.views.DemoBenchView.closeAllTabs.<anonymous>[ValueParameterDescriptorImpl]

'requestClose' @ [80:30] ==> public final fun requestClose(): Unit defined in net.corda.demobench.ui.CloseableTab[SimpleFunctionDescriptorImpl]

'find' @ [84:27] ==> public final inline fun <reified T : Component> find(params: Map<*, Any?>?, noinline op: (NodeTabView.() -> Unit)?): NodeTabView defined in net.corda.demobench.views.DemoBenchView[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component> -> NodeTabView

'mapOf' @ [84:45] ==> public fun <K, V> mapOf(pair: Pair<String, Boolean>): Map<String, Boolean> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Boolean

'to' @ [84:51] ==> public infix fun <A, B> String.to(that: Boolean): Pair<String, Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> Boolean

'showConfig' @ [84:67] ==> value-parameter showConfig: Boolean defined in net.corda.demobench.views.DemoBenchView.createNodeTabView[ValueParameterDescriptorImpl]

'nodeTabPane' @ [85:9] ==> private final val nodeTabPane: TabPane defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'tabs' @ [85:21] ==> public final val TabPane.tabs: (ObservableList<(Tab..Tab?)>..ObservableList<(Tab..Tab?)>?)[MyPropertyDescriptor]

'add' @ [85:26] ==> public abstract fun add(element: (Tab..Tab?)): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'nodeTabView' @ [85:30] ==> val nodeTabView: NodeTabView defined in net.corda.demobench.views.DemoBenchView.createNodeTabView[LocalVariableDescriptor]

'nodeTab' @ [85:42] ==> public final val nodeTab: CloseableTab defined in net.corda.demobench.views.NodeTabView[PropertyDescriptorImpl]

'nodeTabView' @ [86:16] ==> val nodeTabView: NodeTabView defined in net.corda.demobench.views.DemoBenchView.createNodeTabView[LocalVariableDescriptor]

'closeAllTabs' @ [90:9] ==> private final fun closeAllTabs(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'nodeController' @ [91:9] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'reset' @ [91:24] ==> public final fun reset(): Unit defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'nodes' @ [93:9] ==> value-parameter nodes: List<InstallConfig> defined in net.corda.demobench.views.DemoBenchView.loadProfile[ValueParameterDescriptorImpl]

'forEach' @ [93:15] ==> @HidesMembers public inline fun <T> Iterable<InstallConfig>.forEach(action: (InstallConfig) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InstallConfig

'createNodeTabView' @ [94:31] ==> private final fun createNodeTabView(showConfig: Boolean): NodeTabView defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'nodeTabView' @ [95:13] ==> val nodeTabView: NodeTabView defined in net.corda.demobench.views.DemoBenchView.loadProfile.<anonymous>[LocalVariableDescriptor]

'launch' @ [95:25] ==> public final fun launch(config: NodeConfig): Unit defined in net.corda.demobench.views.NodeTabView[SimpleFunctionDescriptorImpl]

'nodeController' @ [95:32] ==> private final val nodeController: NodeController defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'install' @ [95:47] ==> @Throws public final fun install(config: InstallConfig): NodeConfig defined in net.corda.demobench.model.NodeController[SimpleFunctionDescriptorImpl]

'it' @ [95:55] ==> value-parameter it: InstallConfig defined in net.corda.demobench.views.DemoBenchView.loadProfile.<anonymous>[ValueParameterDescriptorImpl]

'enableAddNodes' @ [98:9] ==> public final fun enableAddNodes(): Unit defined in net.corda.demobench.views.DemoBenchView[SimpleFunctionDescriptorImpl]

'menuSaveAs' @ [105:9] ==> private final val menuSaveAs: MenuItem defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'isDisable' @ [105:20] ==> public final var MenuItem.isDisable: Boolean[MyPropertyDescriptor]

'addNodeButton' @ [112:9] ==> private final val addNodeButton: Button defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'isDisable' @ [112:23] ==> public final var Button.isDisable: Boolean[MyPropertyDescriptor]

'nodeTabPane' @ [120:13] ==> private final val nodeTabPane: TabPane defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'tabs' @ [120:25] ==> public final val TabPane.tabs: (ObservableList<(Tab..Tab?)>..ObservableList<(Tab..Tab?)>?)[MyPropertyDescriptor]

'isEmpty' @ [120:30] ==> public abstract fun isEmpty(): Boolean defined in javafx.collections.ObservableList[DeserializedSimpleFunctionDescriptor]

'addNodeButton' @ [121:13] ==> private final val addNodeButton: Button defined in net.corda.demobench.views.DemoBenchView[PropertyDescriptorImpl]

'fire' @ [121:27] ==> public open fun fire(): Unit defined in javafx.scene.control.Button[JavaMethodDescriptor]

