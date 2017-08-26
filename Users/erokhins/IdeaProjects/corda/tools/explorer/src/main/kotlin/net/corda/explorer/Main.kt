'App' @ [28:14] ==> public constructor App(primaryView: KClass<out UIComponent>? = ..., vararg stylesheet: KClass<out Stylesheet>) defined in tornadofx.App[DeserializedClassConstructorDescriptor]

'MainView' @ [28:18] ==> public constructor MainView() defined in net.corda.explorer.views.MainView[ClassConstructorDescriptorImpl]

'inject' @ [29:30] ==> public final inline fun <reified T : Component> inject(scope: Scope): ReadOnlyProperty<App, LoginView> where T : Injectable defined in net.corda.explorer.Main[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component & Injectable> -> LoginView

'observableValue' @ [30:31] ==> public inline fun <reified M : Any, T> observableValue(noinline observableValueProperty: (SettingsModel) -> ObservableValue<(Boolean..Boolean?)>): TrackedDelegate.ObservableValueDelegate<SettingsModel, (Boolean..Boolean?)> defined in net.corda.client.jfx.model[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> SettingsModel
    <T> -> (kotlin.Boolean..kotlin.Boolean?)

'SettingsModel' @ [30:47] ==> public constructor SettingsModel(path: Path = ...) defined in net.corda.explorer.model.SettingsModel[ClassConstructorDescriptorImpl]

'loggerFor' @ [33:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Main

'super' @ [38:9] ==> <this> defined in net.corda.explorer.Main[LazyClassReceiverParameterDescriptor]

'start' @ [38:15] ==> public open fun start(stage: Stage): Unit defined in tornadofx.App[DeserializedSimpleFunctionDescriptor]

'stage' @ [38:21] ==> value-parameter stage: Stage defined in net.corda.explorer.Main.start[ValueParameterDescriptorImpl]

'stage' @ [39:9] ==> value-parameter stage: Stage defined in net.corda.explorer.Main.start[ValueParameterDescriptorImpl]

'minHeight' @ [39:15] ==> public final var Stage.minHeight: Double[MyPropertyDescriptor]

'stage' @ [40:9] ==> value-parameter stage: Stage defined in net.corda.explorer.Main.start[ValueParameterDescriptorImpl]

'minWidth' @ [40:15] ==> public final var Stage.minWidth: Double[MyPropertyDescriptor]

'stage' @ [41:9] ==> value-parameter stage: Stage defined in net.corda.explorer.Main.start[ValueParameterDescriptorImpl]

'isFullScreen' @ [41:15] ==> public final var Stage.isFullScreen: Boolean[MyPropertyDescriptor]

'fullscreen' @ [41:30] ==> private final val fullscreen: ObservableValue<(Boolean..Boolean?)> defined in net.corda.explorer.Main[PropertyDescriptorImpl]

'value' @ [41:41] ==> public final val <T : (Any..Any?)> ObservableValue<(Boolean..Boolean?)>.value: (Boolean..Boolean?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'stage' @ [42:9] ==> value-parameter stage: Stage defined in net.corda.explorer.Main.start[ValueParameterDescriptorImpl]

'setOnCloseRequest' @ [42:15] ==> public final fun setOnCloseRequest(p0: (((WindowEvent..WindowEvent?)) -> Unit..(((WindowEvent..WindowEvent?)) -> Unit)?)): Unit defined in javafx.stage.Stage[MyFunctionDescriptor]

'Alert' @ [43:26] ==> public constructor Alert(@NamedArg p0: (Alert.AlertType..Alert.AlertType?), @NamedArg p1: (String..String?), vararg p2: (ButtonType..ButtonType?)) defined in javafx.scene.control.Alert[JavaClassConstructorDescriptor]

'CONFIRMATION' @ [43:48] ==> enum entry CONFIRMATION defined in javafx.scene.control.Alert.AlertType[FakeCallableDescriptorForObject]

'apply' @ [43:111] ==> @InlineOnly public inline fun <T> Alert.apply(block: Alert.() -> Unit): Alert defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Alert

'initOwner' @ [44:17] ==> public final fun initOwner(p0: (Window..Window?)): Unit defined in javafx.scene.control.Alert[JavaMethodDescriptor]

'stage' @ [44:27] ==> value-parameter stage: Stage defined in net.corda.explorer.Main.start[ValueParameterDescriptorImpl]

'scene' @ [44:33] ==> public final var Stage.scene: (Scene..Scene?)[MyPropertyDescriptor]

'window' @ [44:39] ==> public final val Scene.window: (Window..Window?)[MyPropertyDescriptor]

'showAndWait' @ [45:15] ==> public final fun showAndWait(): (Optional<(ButtonType..ButtonType?)>..Optional<(ButtonType..ButtonType?)>?) defined in javafx.scene.control.Alert[JavaMethodDescriptor]

'get' @ [45:29] ==> public open fun get(): ButtonType defined in java.util.Optional[JavaMethodDescriptor]

'button' @ [46:17] ==> val button: ButtonType defined in net.corda.explorer.Main.start.<anonymous>[LocalVariableDescriptor]

'OK' @ [46:38] ==> public final val OK: (ButtonType..ButtonType?) defined in javafx.scene.control.ButtonType[JavaPropertyDescriptor]

'it' @ [46:42] ==> value-parameter it: (WindowEvent..WindowEvent?) defined in net.corda.explorer.Main.start.<anonymous>[ValueParameterDescriptorImpl]

'consume' @ [46:45] ==> public open fun consume(): Unit defined in javafx.stage.WindowEvent[JavaMethodDescriptor]

'parameters' @ [49:24] ==> public final val Main.parameters: (Application.Parameters..Application.Parameters?)[MyPropertyDescriptor]

'named' @ [49:35] ==> public final val Application.Parameters.named: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?)[MyPropertyDescriptor]

'asInteger' @ [50:20] ==> private final fun asInteger(s: String?): Int? defined in net.corda.explorer.Main[SimpleFunctionDescriptorImpl]

'parameters' @ [50:30] ==> public final val Main.parameters: (Application.Parameters..Application.Parameters?)[MyPropertyDescriptor]

'named' @ [50:41] ==> public final val Application.Parameters.named: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?)[MyPropertyDescriptor]

'parameters' @ [51:24] ==> public final val Main.parameters: (Application.Parameters..Application.Parameters?)[MyPropertyDescriptor]

'named' @ [51:35] ==> public final val Application.Parameters.named: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?)[MyPropertyDescriptor]

'parameters' @ [52:24] ==> public final val Main.parameters: (Application.Parameters..Application.Parameters?)[MyPropertyDescriptor]

'named' @ [52:35] ==> public final val Application.Parameters.named: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?)[MyPropertyDescriptor]

'hostname' @ [55:14] ==> val hostname: String? defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'port' @ [55:36] ==> val port: Int? defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'username' @ [55:54] ==> val username: String? defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'password' @ [55:76] ==> val password: String? defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'loginView' @ [57:17] ==> private final val loginView: LoginView defined in net.corda.explorer.Main[PropertyDescriptorImpl]

'login' @ [57:27] ==> public final fun login(host: String, port: Int, username: String, password: String): Unit defined in net.corda.explorer.views.LoginView[SimpleFunctionDescriptorImpl]

'hostname' @ [57:33] ==> val hostname: String? defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'port' @ [57:43] ==> val port: Int? defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'username' @ [57:49] ==> val username: String? defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'password' @ [57:59] ==> val password: String? defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'isLoggedIn' @ [58:17] ==> var isLoggedIn: Boolean defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'ExceptionDialog' @ [60:17] ==> public constructor ExceptionDialog(p0: (Throwable..Throwable?)) defined in org.controlsfx.dialog.ExceptionDialog[JavaClassConstructorDescriptor]

'e' @ [60:33] ==> val e: Exception /* = Exception */ defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'apply' @ [60:36] ==> @InlineOnly public inline fun <T> ExceptionDialog.apply(block: ExceptionDialog.() -> Unit): ExceptionDialog defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExceptionDialog

'initOwner' @ [60:44] ==> public final fun initOwner(p0: (Window..Window?)): Unit defined in org.controlsfx.dialog.ExceptionDialog[JavaMethodDescriptor]

'stage' @ [60:54] ==> value-parameter stage: Stage defined in net.corda.explorer.Main.start[ValueParameterDescriptorImpl]

'scene' @ [60:60] ==> public final var Stage.scene: (Scene..Scene?)[MyPropertyDescriptor]

'window' @ [60:66] ==> public final val Scene.window: (Window..Window?)[MyPropertyDescriptor]

'showAndWait' @ [60:76] ==> public final fun showAndWait(): (Optional<(ButtonType..ButtonType?)>..Optional<(ButtonType..ButtonType?)>?) defined in org.controlsfx.dialog.ExceptionDialog[JavaMethodDescriptor]

'!' @ [64:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLoggedIn' @ [64:14] ==> var isLoggedIn: Boolean defined in net.corda.explorer.Main.start[LocalVariableDescriptor]

'stage' @ [65:13] ==> value-parameter stage: Stage defined in net.corda.explorer.Main.start[ValueParameterDescriptorImpl]

'hide' @ [65:19] ==> public open fun hide(): Unit defined in javafx.stage.Stage[JavaMethodDescriptor]

'loginView' @ [66:13] ==> private final val loginView: LoginView defined in net.corda.explorer.Main[PropertyDescriptorImpl]

'login' @ [66:23] ==> public final fun login(): Unit defined in net.corda.explorer.views.LoginView[SimpleFunctionDescriptorImpl]

'stage' @ [67:13] ==> value-parameter stage: Stage defined in net.corda.explorer.Main.start[ValueParameterDescriptorImpl]

'show' @ [67:19] ==> public final fun show(): Unit defined in javafx.stage.Stage[JavaMethodDescriptor]

's' @ [73:20] ==> value-parameter s: String? defined in net.corda.explorer.Main.asInteger[ValueParameterDescriptorImpl]

'toInt' @ [73:23] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'setDefaultUncaughtExceptionHandler' @ [81:16] ==> public final fun setDefaultUncaughtExceptionHandler(p0: (((Thread..Thread?), (Throwable..Throwable?)) -> Unit..(((Thread..Thread?), (Throwable..Throwable?)) -> Unit)?)): Unit defined in java.lang.Thread[SamAdapterFunctionDescriptor]

'throwable' @ [82:13] ==> value-parameter throwable: (Throwable..Throwable?) defined in net.corda.explorer.Main.<init>.<anonymous>[ValueParameterDescriptorImpl]

'printStackTrace' @ [82:23] ==> public open fun printStackTrace(): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'runInFxApplicationThread' @ [84:13] ==> public fun runInFxApplicationThread(block: () -> Unit): Unit defined in net.corda.explorer.views[SimpleFunctionDescriptorImpl]

'ExceptionDialog' @ [86:17] ==> public constructor ExceptionDialog(p0: (Throwable..Throwable?)) defined in org.controlsfx.dialog.ExceptionDialog[JavaClassConstructorDescriptor]

'throwable' @ [86:33] ==> value-parameter throwable: (Throwable..Throwable?) defined in net.corda.explorer.Main.<init>.<anonymous>[ValueParameterDescriptorImpl]

'showAndWait' @ [86:44] ==> public final fun showAndWait(): (Optional<(ButtonType..ButtonType?)>..Optional<(ButtonType..ButtonType?)>?) defined in org.controlsfx.dialog.ExceptionDialog[JavaMethodDescriptor]

'exit' @ [87:24] ==> public open fun exit(p0: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'loadFontsAndStyles' @ [91:9] ==> private final fun loadFontsAndStyles(): Unit defined in net.corda.explorer.Main[SimpleFunctionDescriptorImpl]

'Image' @ [93:25] ==> public constructor Image(@NamedArg p0: (InputStream..InputStream?)) defined in javafx.scene.image.Image[JavaClassConstructorDescriptor]

'javaClass' @ [93:31] ==> public val <T : Any> Main.javaClass: Class<Main> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Main

'getResourceAsStream' @ [93:41] ==> public open fun getResourceAsStream(p0: (String..String?)): (InputStream..InputStream?) defined in java.lang.Class[JavaMethodDescriptor]

'IS_OS_MAC_OSX' @ [94:25] ==> public const final val IS_OS_MAC_OSX: Boolean defined in org.apache.commons.lang.SystemUtils[JavaPropertyDescriptor]

'getApplication' @ [95:25] ==> public open fun getApplication(): (Application..Application?) defined in com.apple.eawt.Application[JavaMethodDescriptor]

'dockIconImage' @ [95:42] ==> public final var Application.dockIconImage: (Image..Image?)[MyPropertyDescriptor]

'fromFXImage' @ [95:71] ==> public open fun fromFXImage(p0: (Image..Image?), p1: (BufferedImage..BufferedImage?)): (BufferedImage..BufferedImage?) defined in javafx.embed.swing.SwingFXUtils[JavaMethodDescriptor]

'cordaLogo' @ [95:83] ==> val cordaLogo: Image defined in net.corda.explorer.Main.<init>[LocalVariableDescriptor]

'addStageIcon' @ [97:9] ==> public fun addStageIcon(icon: Image, scope: Scope = ...): Unit defined in tornadofx[DeserializedSimpleFunctionDescriptor]

'cordaLogo' @ [97:22] ==> val cordaLogo: Image defined in net.corda.explorer.Main.<init>[LocalVariableDescriptor]

'Models' @ [99:9] ==> public object Models defined in net.corda.client.jfx.model[FakeCallableDescriptorForObject]

'get' @ [99:16] ==> public final inline fun <reified M : Any> get(origin: KClass<*>): CordaViewModel defined in net.corda.client.jfx.model.Models[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified M : Any> -> CordaViewModel

'Main' @ [99:36] ==> public companion object defined in net.corda.explorer.Main[FakeCallableDescriptorForObject]

'apply' @ [99:49] ==> @InlineOnly public inline fun <T> CordaViewModel.apply(block: CordaViewModel.() -> Unit): CordaViewModel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaViewModel

'registerView' @ [102:13] ==> public final inline fun <reified T : CordaView> registerView(): Unit defined in net.corda.explorer.model.CordaViewModel[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : CordaView> -> Dashboard

'registerView' @ [103:13] ==> public final inline fun <reified T : CordaView> registerView(): Unit defined in net.corda.explorer.model.CordaViewModel[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : CordaView> -> TransactionViewer

'registerView' @ [105:13] ==> public final inline fun <reified T : CordaView> registerView(): Unit defined in net.corda.explorer.model.CordaViewModel[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : CordaView> -> CashViewer

'registerView' @ [107:13] ==> public final inline fun <reified T : CordaView> registerView(): Unit defined in net.corda.explorer.model.CordaViewModel[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : CordaView> -> Network

'registerView' @ [108:13] ==> public final inline fun <reified T : CordaView> registerView(): Unit defined in net.corda.explorer.model.CordaViewModel[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : CordaView> -> Settings

'selectedView' @ [110:13] ==> public final val selectedView: SimpleObjectProperty<CordaView> defined in net.corda.explorer.model.CordaViewModel[PropertyDescriptorImpl]

'set' @ [110:26] ==> public open fun set(p0: (CordaView..CordaView?)): Unit defined in javafx.beans.property.SimpleObjectProperty[JavaMethodDescriptor]

'find' @ [110:30] ==> public inline fun <reified T : Component> find(scope: Scope = ..., vararg params: Pair<String, Any>): Dashboard defined in tornadofx[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Component> -> Dashboard

'loadAll' @ [115:27] ==> public open fun loadAll(): Unit defined in jfxtras.resources.JFXtrasFontRoboto[JavaMethodDescriptor]

'get' @ [116:32] ==> public open fun get(): (FontAwesomeIconFactory..FontAwesomeIconFactory?) defined in de.jensd.fx.glyphs.fontawesome.utils.FontAwesomeIconFactory[JavaMethodDescriptor]

'OptionParser' @ [128:18] ==> public constructor OptionParser(p0: (String..String?)) defined in joptsimple.OptionParser[JavaClassConstructorDescriptor]

'parser' @ [129:19] ==> val parser: OptionParser defined in net.corda.explorer.main[LocalVariableDescriptor]

'parse' @ [129:26] ==> public open fun parse(vararg p0: (String..String?)): (OptionSet..OptionSet?) defined in joptsimple.OptionParser[JavaMethodDescriptor]

'args' @ [129:33] ==> value-parameter args: Array<String> defined in net.corda.explorer.main[ValueParameterDescriptorImpl]

'ExplorerSimulation' @ [130:5] ==> public constructor ExplorerSimulation(options: OptionSet) defined in net.corda.explorer.ExplorerSimulation[ClassConstructorDescriptorImpl]

'options' @ [130:24] ==> val options: (OptionSet..OptionSet?) defined in net.corda.explorer.main[LocalVariableDescriptor]

