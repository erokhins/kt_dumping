'DumbAwareAction' @ [31:38] ==> protected/*protected and package*/ constructor DumbAwareAction() defined in com.intellij.openapi.project.DumbAwareAction[JavaClassConstructorDescriptor]

'e' @ [33:23] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesAction.actionPerformed[ValueParameterDescriptorImpl]

'project' @ [33:25] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'ConfigurePluginUpdatesDialog' @ [34:9] ==> public constructor ConfigurePluginUpdatesDialog(project: Project) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[ClassConstructorDescriptorImpl]

'project' @ [34:38] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesAction.actionPerformed[LocalVariableDescriptor]

'show' @ [34:47] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[JavaMethodDescriptor]

'DialogWrapper' @ [38:56] ==> protected/*protected and package*/ constructor DialogWrapper(@Nullable p0: Project?, p1: Boolean) defined in com.intellij.openapi.ui.DialogWrapper[JavaClassConstructorDescriptor]

'project' @ [38:70] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.<init>[ValueParameterDescriptorImpl]

'ConfigurePluginUpdatesForm' @ [39:24] ==> public constructor ConfigurePluginUpdatesForm() defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaClassConstructorDescriptor]

'title' @ [44:9] ==> public final var ConfigurePluginUpdatesDialog.title: (String..String?)[MyPropertyDescriptor]

'form' @ [45:9] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'updateCheckProgressIcon' @ [45:14] ==> public final var updateCheckProgressIcon: (AsyncProcessIcon..AsyncProcessIcon?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'suspend' @ [45:38] ==> public open fun suspend(): Unit defined in com.intellij.util.ui.AsyncProcessIcon[JavaMethodDescriptor]

'form' @ [46:9] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'updateCheckProgressIcon' @ [46:14] ==> public final var updateCheckProgressIcon: (AsyncProcessIcon..AsyncProcessIcon?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'setPaintPassiveIcon' @ [46:38] ==> public open fun setPaintPassiveIcon(p0: Boolean): Unit defined in com.intellij.util.ui.AsyncProcessIcon[JavaMethodDescriptor]

'form' @ [48:9] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'checkForUpdatesNowButton' @ [48:14] ==> public final var checkForUpdatesNowButton: (JButton..JButton?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'addActionListener' @ [48:39] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javax.swing.JButton[MyFunctionDescriptor]

'saveSettings' @ [49:13] ==> private final fun saveSettings(): Unit defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[SimpleFunctionDescriptorImpl]

'form' @ [50:13] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'updateCheckProgressIcon' @ [50:18] ==> public final var updateCheckProgressIcon: (AsyncProcessIcon..AsyncProcessIcon?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'resume' @ [50:42] ==> public open fun resume(): Unit defined in com.intellij.util.ui.AsyncProcessIcon[JavaMethodDescriptor]

'resetUpdateStatus' @ [51:13] ==> private final fun resetUpdateStatus(): Unit defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[SimpleFunctionDescriptorImpl]

'KotlinPluginUpdater' @ [52:13] ==> public companion object defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[FakeCallableDescriptorForObject]

'getInstance' @ [52:33] ==> public final fun getInstance(): KotlinPluginUpdater defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater.Companion[SimpleFunctionDescriptorImpl]

'runUpdateCheck' @ [52:47] ==> public final fun runUpdateCheck(callback: (PluginUpdateStatus) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[SimpleFunctionDescriptorImpl]

'form' @ [53:17] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'updateCheckProgressIcon' @ [53:22] ==> public final var updateCheckProgressIcon: (AsyncProcessIcon..AsyncProcessIcon?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'suspend' @ [53:46] ==> public open fun suspend(): Unit defined in com.intellij.util.ui.AsyncProcessIcon[JavaMethodDescriptor]

'when (pluginUpdateStatus) {
                    PluginUpdateStatus.LatestVersionInstalled ->
                        form.updateStatusLabel.text = "You have the latest version of the plugin (${KotlinPluginUtil.getPluginVersion()}) installed."

                    is PluginUpdateStatus.Update -> {
                        update = pluginUpdateStatus
                        form.installButton.isVisible = true
                        form.updateStatusLabel.text = "A new version ${pluginUpdateStatus.pluginDescriptor.version} is available"
                    }

                    is PluginUpdateStatus.CheckFailed ->
                        form.updateStatusLabel.text = "Update check failed: ${pluginUpdateStatus.message}"
                }' @ [54:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'pluginUpdateStatus' @ [54:23] ==> value-parameter pluginUpdateStatus: PluginUpdateStatus defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'PluginUpdateStatus' @ [55:21] ==> public companion object defined in org.jetbrains.kotlin.idea.PluginUpdateStatus[FakeCallableDescriptorForObject]

'LatestVersionInstalled' @ [55:40] ==> public object LatestVersionInstalled : PluginUpdateStatus defined in org.jetbrains.kotlin.idea.PluginUpdateStatus[FakeCallableDescriptorForObject]

'form' @ [56:25] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'updateStatusLabel' @ [56:30] ==> public final var updateStatusLabel: (JLabel..JLabel?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'text' @ [56:48] ==> public final var JLabel.text: (String..String?)[MyPropertyDescriptor]

'getPluginVersion' @ [56:118] ==> @NotNull public open fun getPluginVersion(): String defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'update' @ [59:25] ==> private final var update: PluginUpdateStatus.Update? defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'pluginUpdateStatus' @ [59:34] ==> value-parameter pluginUpdateStatus: PluginUpdateStatus defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'form' @ [60:25] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'installButton' @ [60:30] ==> public final var installButton: (JButton..JButton?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'isVisible' @ [60:44] ==> public final var JButton.isVisible: Boolean[MyPropertyDescriptor]

'form' @ [61:25] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'updateStatusLabel' @ [61:30] ==> public final var updateStatusLabel: (JLabel..JLabel?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'text' @ [61:48] ==> public final var JLabel.text: (String..String?)[MyPropertyDescriptor]

'pluginUpdateStatus' @ [61:72] ==> value-parameter pluginUpdateStatus: PluginUpdateStatus defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'pluginDescriptor' @ [61:91] ==> public final val pluginDescriptor: IdeaPluginDescriptor defined in org.jetbrains.kotlin.idea.PluginUpdateStatus.Update[PropertyDescriptorImpl]

'version' @ [61:108] ==> public final val IdeaPluginDescriptor.version: (String..String?)[MyPropertyDescriptor]

'form' @ [65:25] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'updateStatusLabel' @ [65:30] ==> public final var updateStatusLabel: (JLabel..JLabel?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'text' @ [65:48] ==> public final var JLabel.text: (String..String?)[MyPropertyDescriptor]

'pluginUpdateStatus' @ [65:79] ==> value-parameter pluginUpdateStatus: PluginUpdateStatus defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [65:98] ==> public final val message: String defined in org.jetbrains.kotlin.idea.PluginUpdateStatus.CheckFailed[PropertyDescriptorImpl]

'form' @ [72:9] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'installButton' @ [72:14] ==> public final var installButton: (JButton..JButton?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'isVisible' @ [72:28] ==> public final var JButton.isVisible: Boolean[MyPropertyDescriptor]

'form' @ [73:9] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'installButton' @ [73:14] ==> public final var installButton: (JButton..JButton?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'addActionListener' @ [73:28] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javax.swing.JButton[MyFunctionDescriptor]

'update' @ [74:13] ==> private final var update: PluginUpdateStatus.Update? defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'let' @ [74:21] ==> @InlineOnly public inline fun <T, R> PluginUpdateStatus.Update.let(block: (PluginUpdateStatus.Update) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Update
    <R> -> Unit

'close' @ [75:17] ==> public final fun close(p0: Int): Unit defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[JavaMethodDescriptor]

'OK_EXIT_CODE' @ [75:23] ==> public const final val OK_EXIT_CODE: Int defined in com.intellij.openapi.ui.DialogWrapper[JavaPropertyDescriptor]

'KotlinPluginUpdater' @ [76:17] ==> public companion object defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[FakeCallableDescriptorForObject]

'getInstance' @ [76:37] ==> public final fun getInstance(): KotlinPluginUpdater defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater.Companion[SimpleFunctionDescriptorImpl]

'installPluginUpdate' @ [76:51] ==> public final fun installPluginUpdate(update: PluginUpdateStatus.Update, cancelCallback: () -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[SimpleFunctionDescriptorImpl]

'it' @ [76:71] ==> value-parameter it: PluginUpdateStatus.Update defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'form' @ [80:9] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'channelCombo' @ [80:14] ==> public final var channelCombo: raw (JComboBox<(Any..Any?)>..JComboBox<*>?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'addActionListener' @ [80:27] ==> public final fun addActionListener(p0: (((ActionEvent..ActionEvent?)) -> Unit..(((ActionEvent..ActionEvent?)) -> Unit)?)): Unit defined in javax.swing.JComboBox[MyFunctionDescriptor]

'resetUpdateStatus' @ [81:13] ==> private final fun resetUpdateStatus(): Unit defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[SimpleFunctionDescriptorImpl]

'if (hasChannel) uiIndex else null' @ [84:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'hasChannel' @ [84:50] ==> public final val hasChannel: Boolean defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[PropertyDescriptorImpl]

'uiIndex' @ [84:62] ==> public final val uiIndex: Int defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[PropertyDescriptorImpl]

'initialSelectedChannel' @ [85:9] ==> private final val initialSelectedChannel: Int defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'EAP_1_2' @ [85:34] ==> enum entry EAP_1_2 defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[FakeCallableDescriptorForObject]

'indexIfAvailable' @ [85:42] ==> local final fun ConfigurePluginUpdatesDialog.EAPChannels.indexIfAvailable(): Int? defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.<init>[SimpleFunctionDescriptorImpl]

'EAP_1_1' @ [86:34] ==> enum entry EAP_1_1 defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[FakeCallableDescriptorForObject]

'indexIfAvailable' @ [86:42] ==> local final fun ConfigurePluginUpdatesDialog.EAPChannels.indexIfAvailable(): Int? defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.<init>[SimpleFunctionDescriptorImpl]

'form' @ [88:9] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'channelCombo' @ [88:14] ==> public final var channelCombo: raw (JComboBox<(Any..Any?)>..JComboBox<*>?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'selectedIndex' @ [88:27] ==> public final var <E : (Any..Any?)> JComboBox<(Any..Any?)>.selectedIndex: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'initialSelectedChannel' @ [88:43] ==> private final val initialSelectedChannel: Int defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'init' @ [89:9] ==> protected/*protected and package*/ open fun init(): Unit defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[JavaMethodDescriptor]

'form' @ [93:9] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'updateStatusLabel' @ [93:14] ==> public final var updateStatusLabel: (JLabel..JLabel?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'text' @ [93:32] ==> public final var JLabel.text: (String..String?)[MyPropertyDescriptor]

'form' @ [94:9] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'installButton' @ [94:14] ==> public final var installButton: (JButton..JButton?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'isVisible' @ [94:28] ==> public final var JButton.isVisible: Boolean[MyPropertyDescriptor]

'form' @ [97:52] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'mainPanel' @ [97:57] ==> public final var mainPanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'saveSelectedChannel' @ [100:9] ==> private final fun saveSelectedChannel(channel: Int): Unit defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[SimpleFunctionDescriptorImpl]

'form' @ [100:29] ==> private final val form: ConfigurePluginUpdatesForm defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'channelCombo' @ [100:34] ==> public final var channelCombo: raw (JComboBox<(Any..Any?)>..JComboBox<*>?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesForm[JavaPropertyDescriptor]

'selectedIndex' @ [100:47] ==> public final var <E : (Any..Any?)> JComboBox<(Any..Any?)>.selectedIndex: Int[MyPropertyDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'getInstance' @ [104:36] ==> public open fun getInstance(): (UpdateSettings..UpdateSettings?) defined in com.intellij.openapi.updateSettings.impl.UpdateSettings[JavaMethodDescriptor]

'storedPluginHosts' @ [104:50] ==> public final val UpdateSettings.storedPluginHosts: (MutableList<(String..String?)>..List<(String..String?)>)[MyPropertyDescriptor]

'hosts' @ [105:9] ==> val hosts: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.saveSelectedChannel[LocalVariableDescriptor]

'removeIf' @ [105:15] ==> public final fun removeIf(p0: ((String..String?)) -> Boolean): Boolean defined in kotlin.collections.MutableList[MyFunctionDescriptor]

'it' @ [105:26] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.saveSelectedChannel.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [105:29] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [105:85] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.saveSelectedChannel.<anonymous>[ValueParameterDescriptorImpl]

'endsWith' @ [105:88] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'when (channel) {
            EAP_1_1.uiIndex -> hosts.add(EAP_1_1.url)
            EAP_1_2.uiIndex -> hosts.add(EAP_1_2.url)
        }' @ [106:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'channel' @ [106:15] ==> value-parameter channel: Int defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.saveSelectedChannel[ValueParameterDescriptorImpl]

'EAP_1_1' @ [107:13] ==> enum entry EAP_1_1 defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[FakeCallableDescriptorForObject]

'uiIndex' @ [107:21] ==> public final val uiIndex: Int defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[PropertyDescriptorImpl]

'hosts' @ [107:32] ==> val hosts: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.saveSelectedChannel[LocalVariableDescriptor]

'add' @ [107:38] ==> public abstract fun add(element: (String..String?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'EAP_1_1' @ [107:42] ==> enum entry EAP_1_1 defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[FakeCallableDescriptorForObject]

'url' @ [107:50] ==> public final val url: String defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[PropertyDescriptorImpl]

'EAP_1_2' @ [108:13] ==> enum entry EAP_1_2 defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[FakeCallableDescriptorForObject]

'uiIndex' @ [108:21] ==> public final val uiIndex: Int defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[PropertyDescriptorImpl]

'hosts' @ [108:32] ==> val hosts: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.saveSelectedChannel[LocalVariableDescriptor]

'add' @ [108:38] ==> public abstract fun add(element: (String..String?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'EAP_1_2' @ [108:42] ==> enum entry EAP_1_2 defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[FakeCallableDescriptorForObject]

'url' @ [108:50] ==> public final val url: String defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[PropertyDescriptorImpl]

'saveSettings' @ [113:9] ==> private final fun saveSettings(): Unit defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[SimpleFunctionDescriptorImpl]

'super' @ [114:9] ==> <this> defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[LazyClassReceiverParameterDescriptor]

'doOKAction' @ [114:15] ==> protected/*protected and package*/ open fun doOKAction(): Unit defined in com.intellij.openapi.ui.DialogWrapper[JavaMethodDescriptor]

'saveSelectedChannel' @ [118:9] ==> private final fun saveSelectedChannel(channel: Int): Unit defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[SimpleFunctionDescriptorImpl]

'initialSelectedChannel' @ [118:29] ==> private final val initialSelectedChannel: Int defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[PropertyDescriptorImpl]

'super' @ [119:9] ==> <this> defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog[LazyClassReceiverParameterDescriptor]

'doCancelAction' @ [119:15] ==> public open fun doCancelAction(): Unit defined in com.intellij.openapi.ui.DialogWrapper[JavaMethodDescriptor]

'' @ [123:16] ==> private constructor EAPChannels(url: String, uiIndex: Int) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[ClassConstructorDescriptorImpl]

'' @ [124:16] ==> private constructor EAPChannels(url: String, uiIndex: Int) defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[ClassConstructorDescriptorImpl]

'url' @ [126:41] ==> public final val url: String defined in org.jetbrains.kotlin.idea.actions.ConfigurePluginUpdatesDialog.EAPChannels[PropertyDescriptorImpl]

'getInstance' @ [126:63] ==> public open fun getInstance(): (UpdateSettings..UpdateSettings?) defined in com.intellij.openapi.updateSettings.impl.UpdateSettings[JavaMethodDescriptor]

'pluginHosts' @ [126:77] ==> public final val UpdateSettings.pluginHosts: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

