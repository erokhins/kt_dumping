'ITNReporter' @ [33:31] ==> public constructor ITNReporter() defined in com.intellij.diagnostic.ITNReporter[DeserializedClassConstructorDescriptor]

'!' @ [37:64] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasUpdate' @ [37:65] ==> private final var hasUpdate: Boolean defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter[PropertyDescriptorImpl]

'KotlinInternalMode' @ [37:78] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [37:97] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'hasUpdate' @ [40:13] ==> private final var hasUpdate: Boolean defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter[PropertyDescriptorImpl]

'KotlinInternalMode' @ [41:17] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [41:36] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'super' @ [42:24] ==> <this> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter[LazyClassReceiverParameterDescriptor]

'submit' @ [42:30] ==> public open fun submit(events: Array<IdeaLoggingEvent>, additionalInfo: String?, parentComponent: Component, consumer: Consumer<SubmittedReportInfo>): Boolean defined in com.intellij.diagnostic.ITNReporter[DeserializedSimpleFunctionDescriptor]

'events' @ [42:37] ==> value-parameter events: Array<IdeaLoggingEvent> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'additionalInfo' @ [42:45] ==> value-parameter additionalInfo: String? defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'parentComponent' @ [42:61] ==> value-parameter parentComponent: Component defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'consumer' @ [42:78] ==> value-parameter consumer: Consumer<SubmittedReportInfo> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'hasLatestVersion' @ [47:13] ==> private final var hasLatestVersion: Boolean defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter[PropertyDescriptorImpl]

'super' @ [48:20] ==> <this> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter[LazyClassReceiverParameterDescriptor]

'submit' @ [48:26] ==> public open fun submit(events: Array<IdeaLoggingEvent>, additionalInfo: String?, parentComponent: Component, consumer: Consumer<SubmittedReportInfo>): Boolean defined in com.intellij.diagnostic.ITNReporter[DeserializedSimpleFunctionDescriptor]

'events' @ [48:33] ==> value-parameter events: Array<IdeaLoggingEvent> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'additionalInfo' @ [48:41] ==> value-parameter additionalInfo: String? defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'parentComponent' @ [48:57] ==> value-parameter parentComponent: Component defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'consumer' @ [48:74] ==> value-parameter consumer: Consumer<SubmittedReportInfo> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'KotlinPluginUpdater' @ [51:9] ==> public companion object defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[FakeCallableDescriptorForObject]

'getInstance' @ [51:29] ==> public final fun getInstance(): KotlinPluginUpdater defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater.Companion[SimpleFunctionDescriptorImpl]

'runUpdateCheck' @ [51:43] ==> public final fun runUpdateCheck(callback: (PluginUpdateStatus) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[SimpleFunctionDescriptorImpl]

'if (status is PluginUpdateStatus.Update) {
                hasUpdate = true

                if (KotlinInternalMode.enabled) {
                    super.submit(events, additionalInfo, parentComponent, consumer)
                }

                val rc = Messages.showDialog(parentComponent,
                                             "You're running Kotlin plugin version ${KotlinPluginUtil.getPluginVersion()}, " +
                                             "while the latest version is ${status.pluginDescriptor.version}",
                                             "Update Kotlin Plugin",
                                             arrayOf("Update", "Ignore"),
                                             0, Messages.getInformationIcon())
                if (rc == 0) {
                    KotlinPluginUpdater.getInstance().installPluginUpdate(status)
                }
            }
            else {
                hasLatestVersion = true
                super.submit(events, additionalInfo, parentComponent, consumer)
            }' @ [52:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'status' @ [52:17] ==> value-parameter status: PluginUpdateStatus defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit.<anonymous>[ValueParameterDescriptorImpl]

'hasUpdate' @ [53:17] ==> private final var hasUpdate: Boolean defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter[PropertyDescriptorImpl]

'KotlinInternalMode' @ [55:21] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [55:40] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'super' @ [56:21] ==> <this> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter[LazyClassReceiverParameterDescriptor]

'submit' @ [56:27] ==> public open fun submit(events: Array<IdeaLoggingEvent>, additionalInfo: String?, parentComponent: Component, consumer: Consumer<SubmittedReportInfo>): Boolean defined in com.intellij.diagnostic.ITNReporter[DeserializedSimpleFunctionDescriptor]

'events' @ [56:34] ==> value-parameter events: Array<IdeaLoggingEvent> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'additionalInfo' @ [56:42] ==> value-parameter additionalInfo: String? defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'parentComponent' @ [56:58] ==> value-parameter parentComponent: Component defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'consumer' @ [56:75] ==> value-parameter consumer: Consumer<SubmittedReportInfo> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'showDialog' @ [59:35] ==> public open fun showDialog(@NotNull p0: Component, p1: (String..String?), @NotNull @Nls p2: String, @NotNull p3: (Array<(String..String?)>..Array<out (String..String?)>), p4: Int, @Nullable p5: Icon?): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'parentComponent' @ [59:46] ==> value-parameter parentComponent: Component defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'+' @ [60:46] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getPluginVersion' @ [60:103] ==> @NotNull public open fun getPluginVersion(): String defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'status' @ [61:77] ==> value-parameter status: PluginUpdateStatus defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit.<anonymous>[ValueParameterDescriptorImpl]

'pluginDescriptor' @ [61:84] ==> public final val pluginDescriptor: IdeaPluginDescriptor defined in org.jetbrains.kotlin.idea.PluginUpdateStatus.Update[PropertyDescriptorImpl]

'version' @ [61:101] ==> public final val IdeaPluginDescriptor.version: (String..String?)[MyPropertyDescriptor]

'arrayOf' @ [63:46] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'getInformationIcon' @ [64:58] ==> @NotNull public open fun getInformationIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'rc' @ [65:21] ==> val rc: Int defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit.<anonymous>[LocalVariableDescriptor]

'KotlinPluginUpdater' @ [66:21] ==> public companion object defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[FakeCallableDescriptorForObject]

'getInstance' @ [66:41] ==> public final fun getInstance(): KotlinPluginUpdater defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater.Companion[SimpleFunctionDescriptorImpl]

'installPluginUpdate' @ [66:55] ==> public final fun installPluginUpdate(update: PluginUpdateStatus.Update, cancelCallback: () -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[SimpleFunctionDescriptorImpl]

'status' @ [66:75] ==> value-parameter status: PluginUpdateStatus defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit.<anonymous>[ValueParameterDescriptorImpl]

'hasLatestVersion' @ [70:17] ==> private final var hasLatestVersion: Boolean defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter[PropertyDescriptorImpl]

'super' @ [71:17] ==> <this> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter[LazyClassReceiverParameterDescriptor]

'submit' @ [71:23] ==> public open fun submit(events: Array<IdeaLoggingEvent>, additionalInfo: String?, parentComponent: Component, consumer: Consumer<SubmittedReportInfo>): Boolean defined in com.intellij.diagnostic.ITNReporter[DeserializedSimpleFunctionDescriptor]

'events' @ [71:30] ==> value-parameter events: Array<IdeaLoggingEvent> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'additionalInfo' @ [71:38] ==> value-parameter additionalInfo: String? defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'parentComponent' @ [71:54] ==> value-parameter parentComponent: Component defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

'consumer' @ [71:71] ==> value-parameter consumer: Consumer<SubmittedReportInfo> defined in org.jetbrains.kotlin.idea.reporter.KotlinReportSubmitter.submit[ValueParameterDescriptorImpl]

