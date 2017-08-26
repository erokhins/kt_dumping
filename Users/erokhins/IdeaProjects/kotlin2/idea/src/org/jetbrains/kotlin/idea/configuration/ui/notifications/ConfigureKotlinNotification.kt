'Notification' @ [34:39] ==> public constructor Notification(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @NotNull p3: NotificationType, @Nullable p4: NotificationListener?) defined in com.intellij.notification.Notification[JavaClassConstructorDescriptor]

'CONFIGURE_NOTIFICATION_GROUP_ID' @ [34:88] ==> public final val CONFIGURE_NOTIFICATION_GROUP_ID: String defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.Companion[PropertyDescriptorImpl]

'notificationString' @ [35:52] ==> value-parameter notificationString: String defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.<init>[ValueParameterDescriptorImpl]

'WARNING' @ [36:69] ==> enum entry WARNING defined in com.intellij.notification.NotificationType[FakeCallableDescriptorForObject]

'NotificationListener' @ [36:78] ==> public fun NotificationListener(function: (Notification, HyperlinkEvent) -> Unit): NotificationListener defined in com.intellij.notification[SamConstructorDescriptorImpl]

'event' @ [37:9] ==> value-parameter event: HyperlinkEvent defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.<init>.<anonymous>[ValueParameterDescriptorImpl]

'eventType' @ [37:15] ==> public final val HyperlinkEvent.eventType: (HyperlinkEvent.EventType..HyperlinkEvent.EventType?)[MyPropertyDescriptor]

'ACTIVATED' @ [37:53] ==> public final val ACTIVATED: (HyperlinkEvent.EventType..HyperlinkEvent.EventType?) defined in javax.swing.event.HyperlinkEvent.EventType[JavaPropertyDescriptor]

'getConfiguratorByName' @ [38:28] ==> public fun getConfiguratorByName(name: String): KotlinProjectConfigurator? defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'event' @ [38:50] ==> value-parameter event: HyperlinkEvent defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.<init>.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [38:56] ==> public final val HyperlinkEvent.description: (String..String?)[MyPropertyDescriptor]

'AssertionError' @ [38:78] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'+' @ [38:93] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'event' @ [38:113] ==> value-parameter event: HyperlinkEvent defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.<init>.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [38:119] ==> public final val HyperlinkEvent.description: (String..String?)[MyPropertyDescriptor]

'notification' @ [39:9] ==> value-parameter notification: Notification defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.<init>.<anonymous>[ValueParameterDescriptorImpl]

'expire' @ [39:22] ==> public open fun expire(): Unit defined in com.intellij.notification.Notification[JavaMethodDescriptor]

'configurator' @ [41:9] ==> val configurator: KotlinProjectConfigurator defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.<init>.<anonymous>[LocalVariableDescriptor]

'configure' @ [41:22] ==> @JvmSuppressWildcards public abstract fun configure(project: Project, excludeModules: Collection<Module>): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [41:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.<init>[ValueParameterDescriptorImpl]

'excludeModules' @ [41:41] ==> value-parameter excludeModules: List<Module> defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.<init>[ValueParameterDescriptorImpl]

'this' @ [46:13] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification[LazyClassReceiverParameterDescriptor]

'o' @ [46:22] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.equals[ValueParameterDescriptorImpl]

'o' @ [47:13] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.equals[ValueParameterDescriptorImpl]

'content' @ [49:13] ==> public final val ConfigureKotlinNotification.content: String[MyPropertyDescriptor]

'o' @ [49:24] ==> value-parameter o: Any? defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.equals[ValueParameterDescriptorImpl]

'content' @ [49:26] ==> public final val ConfigureKotlinNotification.content: String[MyPropertyDescriptor]

'content' @ [55:16] ==> public final val ConfigureKotlinNotification.content: String[MyPropertyDescriptor]

'hashCode' @ [55:24] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getCanBeConfiguredModulesWithKotlinFiles' @ [60:27] ==> public fun getCanBeConfiguredModulesWithKotlinFiles(project: Project, excludeModules: Collection<Module> = ...): Collection<Module> defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [60:68] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[ValueParameterDescriptorImpl]

'excludeModules' @ [60:77] ==> value-parameter excludeModules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[ValueParameterDescriptorImpl]

'modules' @ [62:35] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[LocalVariableDescriptor]

'size' @ [62:43] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'if (isOnlyOneModule) "'${modules.first().name}' module" else "modules"' @ [64:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isOnlyOneModule' @ [64:37] ==> val isOnlyOneModule: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[LocalVariableDescriptor]

'modules' @ [64:58] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[LocalVariableDescriptor]

'first' @ [64:66] ==> public fun <T> Iterable<Module>.first(): Module defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'name' @ [64:74] ==> public final val Module.name: String[MyPropertyDescriptor]

'getAbleToRunConfigurators' @ [65:42] ==> public fun getAbleToRunConfigurators(project: Project): Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'project' @ [65:68] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[ValueParameterDescriptorImpl]

'ableToRunConfigurators' @ [66:17] ==> val ableToRunConfigurators: Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[LocalVariableDescriptor]

'isEmpty' @ [66:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'ableToRunConfigurators' @ [67:25] ==> val ableToRunConfigurators: Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[LocalVariableDescriptor]

'joinToString' @ [67:48] ==> public fun <T> Iterable<KotlinProjectConfigurator>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KotlinProjectConfigurator) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinProjectConfigurator

'getLink' @ [68:33] ==> private final fun getLink(configurator: KotlinProjectConfigurator, isOnlyOneModule: Boolean): String defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion[SimpleFunctionDescriptorImpl]

'configurator' @ [68:41] ==> value-parameter configurator: KotlinProjectConfigurator defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString.<anonymous>[ValueParameterDescriptorImpl]

'isOnlyOneModule' @ [68:55] ==> val isOnlyOneModule: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[LocalVariableDescriptor]

'modulesString' @ [71:32] ==> val modulesString: String defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[LocalVariableDescriptor]

'project' @ [71:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[ValueParameterDescriptorImpl]

'name' @ [71:60] ==> public final val Project.name: String[MyPropertyDescriptor]

'links' @ [71:81] ==> val links: String defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getNotificationString[LocalVariableDescriptor]

'configurator' @ [75:33] ==> value-parameter configurator: KotlinProjectConfigurator defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getLink[ValueParameterDescriptorImpl]

'name' @ [75:46] ==> public abstract val name: String defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[PropertyDescriptorImpl]

'configurator' @ [75:67] ==> value-parameter configurator: KotlinProjectConfigurator defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getLink[ValueParameterDescriptorImpl]

'presentableText' @ [75:80] ==> public abstract val presentableText: String defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[PropertyDescriptorImpl]

'if(!isOnlyOneModule) "s" else ""' @ [75:106] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!' @ [75:109] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOnlyOneModule' @ [75:110] ==> value-parameter isOnlyOneModule: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion.getLink[ValueParameterDescriptorImpl]

