'AbstractProjectComponent' @ [38:63] ==> protected/*protected and package*/ constructor AbstractProjectComponent(p0: (Project..Project?)) defined in com.intellij.openapi.components.AbstractProjectComponent[JavaClassConstructorDescriptor]

'project' @ [38:88] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.<init>[ValueParameterDescriptorImpl]

'AtomicInteger' @ [39:29] ==> public constructor AtomicInteger() defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'Volatile' @ [40:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'getNotificationsConfiguration' @ [43:36] ==> public open fun getNotificationsConfiguration(): (NotificationsConfiguration..NotificationsConfiguration?) defined in com.intellij.notification.NotificationsConfiguration[JavaMethodDescriptor]

'register' @ [43:68] ==> public open fun register(@NotNull p0: String, @NotNull p1: NotificationDisplayType, p2: Boolean): Unit defined in com.intellij.notification.NotificationsConfiguration[JavaMethodDescriptor]

'CONFIGURE_NOTIFICATION_GROUP_ID' @ [43:77] ==> public final val CONFIGURE_NOTIFICATION_GROUP_ID: String defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.Companion[PropertyDescriptorImpl]

'STICKY_BALLOON' @ [43:134] ==> enum entry STICKY_BALLOON defined in com.intellij.notification.NotificationDisplayType[FakeCallableDescriptorForObject]

'project' @ [45:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.<init>[ValueParameterDescriptorImpl]

'messageBus' @ [45:34] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [45:45] ==> @NotNull public abstract fun connect(): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'connection' @ [46:9] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.<init>[LocalVariableDescriptor]

'subscribe' @ [46:20] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(ModuleRootListener..ModuleRootListener?)>, @NotNull p1: ModuleRootListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> ModuleRootListener

'PROJECT_ROOTS' @ [46:44] ==> public final val PROJECT_ROOTS: (Topic<(ModuleRootListener..ModuleRootListener?)>..Topic<(ModuleRootListener..ModuleRootListener?)>?) defined in com.intellij.ProjectTopics[JavaPropertyDescriptor]

'notificationPostponed' @ [48:21] ==> @Volatile private final var notificationPostponed: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'!' @ [48:46] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSyncing' @ [48:47] ==> public final val isSyncing: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'getApplication' @ [49:40] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'executeOnPooledThread' @ [49:57] ==> @NotNull public final fun executeOnPooledThread(@NotNull p0: () -> Unit): Future<*> defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'getInstance' @ [50:37] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'myProject' @ [50:49] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[JavaPropertyDescriptor]

'waitForSmartMode' @ [50:60] ==> public abstract fun waitForSmartMode(): Unit defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'!' @ [51:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSyncing' @ [51:30] ==> public final val isSyncing: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'notificationPostponed' @ [52:29] ==> @Volatile private final var notificationPostponed: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'showConfigureKotlinNotificationIfNeeded' @ [53:29] ==> public fun showConfigureKotlinNotificationIfNeeded(project: Project, excludeModules: List<Module> = ...): Unit defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'myProject' @ [53:69] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[JavaPropertyDescriptor]

'collectModulesWithOutdatedRuntime' @ [54:69] ==> public fun collectModulesWithOutdatedRuntime(libraries: List<VersionedLibrary>): List<Module> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'findOutdatedKotlinLibraries' @ [54:103] ==> public fun findOutdatedKotlinLibraries(project: Project): List<VersionedLibrary> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'myProject' @ [54:131] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[JavaPropertyDescriptor]

'checkHideNonConfiguredNotifications' @ [59:17] ==> public fun checkHideNonConfiguredNotifications(project: Project): Unit defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinNotificationManager.kt[SimpleFunctionDescriptorImpl]

'project' @ [59:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.<init>[ValueParameterDescriptorImpl]

'super' @ [65:9] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[LazyClassReceiverParameterDescriptor]

'projectOpened' @ [65:15] ==> public open fun projectOpened(): Unit defined in com.intellij.openapi.components.AbstractProjectComponent[JavaMethodDescriptor]

'getInstance' @ [67:24] ==> public open fun getInstance(p0: (Project..Project?)): (StartupManager..StartupManager?) defined in com.intellij.openapi.startup.StartupManager[JavaMethodDescriptor]

'myProject' @ [67:36] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[JavaPropertyDescriptor]

'registerPostStartupActivity' @ [67:47] ==> public final fun registerPostStartupActivity(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.startup.StartupManager[MyFunctionDescriptor]

'getApplication' @ [68:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'executeOnPooledThread' @ [68:49] ==> @NotNull public final fun executeOnPooledThread(@NotNull p0: () -> Unit): Future<*> defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'getInstance' @ [69:29] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'myProject' @ [69:41] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[JavaPropertyDescriptor]

'waitForSmartMode' @ [69:52] ==> public abstract fun waitForSmartMode(): Unit defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'getModulesWithKotlinFiles' @ [71:32] ==> public fun getModulesWithKotlinFiles(project: Project): Collection<Module> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'myProject' @ [71:58] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[JavaPropertyDescriptor]

'module' @ [72:21] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.projectOpened.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getAndCacheLanguageLevelByDependencies' @ [72:28] ==> public fun Module.getAndCacheLanguageLevelByDependencies(): LanguageVersion defined in org.jetbrains.kotlin.idea.project[DeserializedSimpleFunctionDescriptor]

'findOutdatedKotlinLibraries' @ [75:33] ==> public fun findOutdatedKotlinLibraries(project: Project): List<VersionedLibrary> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'myProject' @ [75:61] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[JavaPropertyDescriptor]

'!' @ [76:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'libraries' @ [76:22] ==> val libraries: List<VersionedLibrary> defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.projectOpened.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [76:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [77:40] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [77:57] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'notifyOutdatedKotlinRuntime' @ [78:25] ==> public fun notifyOutdatedKotlinRuntime(project: Project, outdatedLibraries: Collection<VersionedLibrary>): Unit defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'myProject' @ [78:53] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[JavaPropertyDescriptor]

'libraries' @ [78:64] ==> val libraries: List<VersionedLibrary> defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.projectOpened.<anonymous>.<anonymous>[LocalVariableDescriptor]

'if (!isSyncing) {
                    val excludeModules = collectModulesWithOutdatedRuntime(libraries)
                    showConfigureKotlinNotificationIfNeeded(myProject, excludeModules)
                }
                else {
                    notificationPostponed = true
                }' @ [81:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [81:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSyncing' @ [81:22] ==> public final val isSyncing: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'collectModulesWithOutdatedRuntime' @ [82:42] ==> public fun collectModulesWithOutdatedRuntime(libraries: List<VersionedLibrary>): List<Module> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'libraries' @ [82:76] ==> val libraries: List<VersionedLibrary> defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.projectOpened.<anonymous>.<anonymous>[LocalVariableDescriptor]

'showConfigureKotlinNotificationIfNeeded' @ [83:21] ==> public fun showConfigureKotlinNotificationIfNeeded(project: Project, excludeModules: List<Module> = ...): Unit defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'myProject' @ [83:61] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[JavaPropertyDescriptor]

'excludeModules' @ [83:72] ==> val excludeModules: List<Module> defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.projectOpened.<anonymous>.<anonymous>[LocalVariableDescriptor]

'notificationPostponed' @ [86:21] ==> @Volatile private final var notificationPostponed: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'syncDepth' @ [92:36] ==> private final val syncDepth: AtomicInteger defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'get' @ [92:46] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'syncDepth' @ [95:9] ==> private final val syncDepth: AtomicInteger defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'incrementAndGet' @ [95:19] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'syncDepth' @ [99:9] ==> private final val syncDepth: AtomicInteger defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'decrementAndGet' @ [99:19] ==> public final fun decrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'project' @ [106:19] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.Companion.getInstance[ValueParameterDescriptorImpl]

'getComponent' @ [106:27] ==> public abstract fun <T : (Any..Any?)> getComponent(@NotNull p0: Class<(KotlinConfigurationCheckerComponent..KotlinConfigurationCheckerComponent?)>): (KotlinConfigurationCheckerComponent..KotlinConfigurationCheckerComponent?) defined in com.intellij.openapi.project.Project[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinConfigurationCheckerComponent

'KotlinConfigurationCheckerComponent' @ [106:40] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[FakeCallableDescriptorForObject]

'java' @ [106:83] ==> public val <T> KClass<KotlinConfigurationCheckerComponent>.java: Class<KotlinConfigurationCheckerComponent> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinConfigurationCheckerComponent

