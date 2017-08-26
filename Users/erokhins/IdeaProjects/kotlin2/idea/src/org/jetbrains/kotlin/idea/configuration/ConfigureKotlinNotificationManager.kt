'emptyList' @ [29:65] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'ConfigureKotlinNotification' @ [30:34] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification[FakeCallableDescriptorForObject]

'getNotificationString' @ [30:62] ==> public final fun getNotificationString(project: Project, excludeModules: Collection<Module>): String? defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion[SimpleFunctionDescriptorImpl]

'project' @ [30:84] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager.notify[ValueParameterDescriptorImpl]

'excludeModules' @ [30:93] ==> value-parameter excludeModules: List<Module> = ... defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager.notify[ValueParameterDescriptorImpl]

'notificationString' @ [31:13] ==> val notificationString: String? defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager.notify[LocalVariableDescriptor]

'notify' @ [32:13] ==> public open fun notify(project: Project, notification: ConfigureKotlinNotification): Unit defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager[SimpleFunctionDescriptorImpl]

'project' @ [32:20] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager.notify[ValueParameterDescriptorImpl]

'ConfigureKotlinNotification' @ [32:29] ==> public constructor ConfigureKotlinNotification(project: Project, excludeModules: List<Module>, notificationString: String) defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification[ClassConstructorDescriptorImpl]

'project' @ [32:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager.notify[ValueParameterDescriptorImpl]

'excludeModules' @ [32:66] ==> value-parameter excludeModules: List<Module> = ... defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager.notify[ValueParameterDescriptorImpl]

'notificationString' @ [32:82] ==> val notificationString: String? defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager.notify[LocalVariableDescriptor]

'getNotificationsManager' @ [37:37] ==> public open fun getNotificationsManager(): (NotificationsManager..NotificationsManager?) defined in com.intellij.notification.NotificationsManager[JavaMethodDescriptor]

'getNotificationsOfType' @ [37:63] ==> @NotNull public abstract fun <T : (Notification..Notification?)> getNotificationsOfType(@NotNull p0: Class<(ConfigureKotlinNotification..ConfigureKotlinNotification?)>, @Nullable p1: Project?): (Array<(ConfigureKotlinNotification..ConfigureKotlinNotification?)>..Array<out (ConfigureKotlinNotification..ConfigureKotlinNotification?)>) defined in com.intellij.notification.NotificationsManager[JavaMethodDescriptor]
Inferred types:
    <T : (Notification..Notification?)> -> (org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification..org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification?)

'ConfigureKotlinNotification' @ [37:86] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification[FakeCallableDescriptorForObject]

'java' @ [37:121] ==> public val <T> KClass<ConfigureKotlinNotification>.java: Class<ConfigureKotlinNotification> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ConfigureKotlinNotification

'project' @ [37:127] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager.getVisibleNotifications[ValueParameterDescriptorImpl]

'expireOldNotifications' @ [41:9] ==> public open fun expireOldNotifications(project: Project, notificationClass: KClass<out ConfigureKotlinNotification>, notification: ConfigureKotlinNotification?): Boolean defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager[SimpleFunctionDescriptorImpl]

'project' @ [41:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager.expireOldNotifications[ValueParameterDescriptorImpl]

'ConfigureKotlinNotification' @ [41:41] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification[FakeCallableDescriptorForObject]

'!' @ [47:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expireOldNotifications' @ [47:14] ==> public open fun expireOldNotifications(project: Project, notificationClass: KClass<out T>, notification: T? = ...): Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager[SimpleFunctionDescriptorImpl]

'project' @ [47:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.notify[ValueParameterDescriptorImpl]

'notification' @ [47:46] ==> value-parameter notification: T defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.notify[ValueParameterDescriptorImpl]

'notification' @ [47:67] ==> value-parameter notification: T defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.notify[ValueParameterDescriptorImpl]

'notification' @ [48:13] ==> value-parameter notification: T defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.notify[ValueParameterDescriptorImpl]

'notify' @ [48:26] ==> public open fun notify(@Nullable p0: Project?): Unit defined in com.intellij.notification.Notification[JavaMethodDescriptor]

'project' @ [48:33] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.notify[ValueParameterDescriptorImpl]

'getNotificationsManager' @ [53:57] ==> public open fun getNotificationsManager(): (NotificationsManager..NotificationsManager?) defined in com.intellij.notification.NotificationsManager[JavaMethodDescriptor]

'notificationsManager' @ [56:29] ==> val notificationsManager: (NotificationsManager..NotificationsManager?) defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.expireOldNotifications[LocalVariableDescriptor]

'getNotificationsOfType' @ [56:50] ==> @NotNull public abstract fun <T : (Notification..Notification?)> getNotificationsOfType(@NotNull p0: Class<out T>, @Nullable p1: Project?): Array<out (T..T?)> defined in com.intellij.notification.NotificationsManager[JavaMethodDescriptor]
Inferred types:
    <T : (Notification..Notification?)> -> Captured(out T)

'notificationClass' @ [56:73] ==> value-parameter notificationClass: KClass<out T> defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.expireOldNotifications[ValueParameterDescriptorImpl]

'java' @ [56:91] ==> public val <T> KClass<out T>.java: Class<out T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out T)

'project' @ [56:97] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.expireOldNotifications[ValueParameterDescriptorImpl]

'notifications' @ [57:33] ==> val notifications: Array<out (T..T?)> defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.expireOldNotifications[LocalVariableDescriptor]

'if (oldNotification == notification) {
                isNotificationExists = true
            }
            else {
                oldNotification?.expire()
            }' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'oldNotification' @ [58:17] ==> val oldNotification: (T..T?) defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.expireOldNotifications[LocalVariableDescriptor]

'notification' @ [58:36] ==> value-parameter notification: T? = ... defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.expireOldNotifications[ValueParameterDescriptorImpl]

'isNotificationExists' @ [59:17] ==> var isNotificationExists: Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.expireOldNotifications[LocalVariableDescriptor]

'oldNotification' @ [62:17] ==> val oldNotification: (T..T?) defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.expireOldNotifications[LocalVariableDescriptor]

'expire' @ [62:34] ==> public open fun expire(): Unit defined in com.intellij.notification.Notification[JavaMethodDescriptor]

'isNotificationExists' @ [65:16] ==> var isNotificationExists: Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinSingleNotificationManager.expireOldNotifications[LocalVariableDescriptor]

'ConfigureKotlinNotificationManager' @ [71:9] ==> public object ConfigureKotlinNotificationManager : KotlinSingleNotificationManager<ConfigureKotlinNotification> defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinNotificationManager.kt[FakeCallableDescriptorForObject]

'getVisibleNotifications' @ [71:44] ==> public final fun getVisibleNotifications(project: Project): Array<out ConfigureKotlinNotification> defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager[SimpleFunctionDescriptorImpl]

'project' @ [71:68] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.checkHideNonConfiguredNotifications[ValueParameterDescriptorImpl]

'isNotEmpty' @ [71:77] ==> @InlineOnly public inline fun <T> Array<out ConfigureKotlinNotification>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConfigureKotlinNotification

'getApplication' @ [72:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'executeOnPooledThread' @ [72:45] ==> @NotNull public final fun executeOnPooledThread(@NotNull p0: () -> Unit): Future<*> defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'getInstance' @ [73:25] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'project' @ [73:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.checkHideNonConfiguredNotifications[ValueParameterDescriptorImpl]

'waitForSmartMode' @ [73:46] ==> public abstract fun waitForSmartMode(): Unit defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'getConfigurableModulesWithKotlinFiles' @ [74:17] ==> public fun getConfigurableModulesWithKotlinFiles(project: Project): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [74:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.checkHideNonConfiguredNotifications[ValueParameterDescriptorImpl]

'all' @ [74:64] ==> public inline fun <T> Iterable<ModuleSourceRootGroup>.all(predicate: (ModuleSourceRootGroup) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup

'isModuleConfigured' @ [74:70] ==> public fun isModuleConfigured(moduleSourceRootGroup: ModuleSourceRootGroup): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'getApplication' @ [75:36] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [75:53] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'ConfigureKotlinNotificationManager' @ [76:21] ==> public object ConfigureKotlinNotificationManager : KotlinSingleNotificationManager<ConfigureKotlinNotification> defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinNotificationManager.kt[FakeCallableDescriptorForObject]

'expireOldNotifications' @ [76:56] ==> public final fun expireOldNotifications(project: Project): Unit defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager[SimpleFunctionDescriptorImpl]

'project' @ [76:79] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.checkHideNonConfiguredNotifications[ValueParameterDescriptorImpl]

