'libraryType' @ [52:61] ==> public open val libraryType: LibraryType<DummyLibraryProperties>? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[PropertyDescriptorImpl]

'kind' @ [52:74] ==> public final val <P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)> LibraryType<DummyLibraryProperties>.kind: PersistentLibraryKind<(DummyLibraryProperties..DummyLibraryProperties?)>[MyPropertyDescriptor]
Inferred types:
    <P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)> -> DummyLibraryProperties

'moduleSourceRootGroup' @ [55:22] ==> value-parameter moduleSourceRootGroup: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getStatus[ValueParameterDescriptorImpl]

'baseModule' @ [55:44] ==> public final val baseModule: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootGroup[PropertyDescriptorImpl]

'!' @ [56:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isApplicable' @ [56:14] ==> protected open fun isApplicable(module: Module): Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [56:27] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getStatus[LocalVariableDescriptor]

'NON_APPLICABLE' @ [57:42] ==> enum entry NON_APPLICABLE defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'isConfigured' @ [59:13] ==> public abstract fun isConfigured(module: Module): Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [59:26] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getStatus[LocalVariableDescriptor]

'CONFIGURED' @ [60:42] ==> enum entry CONFIGURED defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'CAN_BE_CONFIGURED' @ [62:38] ==> enum entry CAN_BE_CONFIGURED defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'JvmSuppressWildcards' @ [67:5] ==> public constructor JvmSuppressWildcards(suppress: Boolean = ...) defined in kotlin.jvm.JvmSuppressWildcards[DeserializedClassConstructorDescriptor]

'getDefaultPathToJarFile' @ [69:32] ==> public open fun getDefaultPathToJarFile(project: Project): String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [69:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[ValueParameterDescriptorImpl]

'needToChooseJarPath' @ [70:34] ==> protected final fun needToChooseJarPath(project: Project): Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [70:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[ValueParameterDescriptorImpl]

'if (!ApplicationManager.getApplication().isUnitTestMode)
            getCanBeConfiguredModules(project, this)
        else
            Arrays.asList(*ModuleManager.getInstance(project).modules)' @ [72:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (List<Module>..List<Module>?), elseBranch: (List<Module>..List<Module>?)): (List<Module>..List<Module>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.List<com.intellij.openapi.module.Module>..kotlin.collections.List<com.intellij.openapi.module.Module>?)

'!' @ [72:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [72:60] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [72:77] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'getCanBeConfiguredModules' @ [73:13] ==> public fun getCanBeConfiguredModules(project: Project, configurator: KotlinProjectConfigurator): List<Module> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [73:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[ValueParameterDescriptorImpl]

'this' @ [73:48] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[LazyClassReceiverParameterDescriptor]

'asList' @ [75:20] ==> @SafeVarargs public open fun <T : (Any..Any?)> asList(vararg p0: (Module..Module?)): (MutableList<(Module..Module?)>..List<(Module..Module?)>?) defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Module

'getInstance' @ [75:42] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [75:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[ValueParameterDescriptorImpl]

'modules' @ [75:63] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'nonConfiguredModules' @ [76:9] ==> var nonConfiguredModules: (List<Module>..List<Module>?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'excludeModules' @ [76:33] ==> value-parameter excludeModules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[ValueParameterDescriptorImpl]

'nonConfiguredModules' @ [78:34] ==> var nonConfiguredModules: (List<Module>..List<Module>?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'nonConfiguredModules' @ [81:13] ==> var nonConfiguredModules: (List<Module>..List<Module>?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'size' @ [81:34] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'showPathToJarPanel' @ [81:46] ==> val showPathToJarPanel: Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'CreateLibraryDialogWithModules' @ [82:26] ==> public constructor CreateLibraryDialogWithModules(@NotNull project: Project, @NotNull configurator: KotlinProjectConfigurator, @NotNull defaultPath: String, showPathPanel: Boolean, @NotNull title: String, @NotNull libraryCaption: String, @NotNull excludeModules: (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>)) defined in org.jetbrains.kotlin.idea.framework.ui.CreateLibraryDialogWithModules[JavaClassConstructorDescriptor]

'project' @ [83:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[ValueParameterDescriptorImpl]

'this' @ [83:30] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[LazyClassReceiverParameterDescriptor]

'defaultPathToJar' @ [83:36] ==> val defaultPathToJar: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'showPathToJarPanel' @ [83:54] ==> val showPathToJarPanel: Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'dialogTitle' @ [84:21] ==> protected abstract val dialogTitle: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[PropertyDescriptorImpl]

'libraryCaption' @ [85:21] ==> protected abstract val libraryCaption: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[PropertyDescriptorImpl]

'excludeModules' @ [86:21] ==> value-parameter excludeModules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[ValueParameterDescriptorImpl]

'if (!ApplicationManager.getApplication().isUnitTestMode) {
                dialog.show()
                if (!dialog.isOK) return
            }
            else {
                dialog.close(0)
            }' @ [88:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [88:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [88:37] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [88:54] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'dialog' @ [89:17] ==> val dialog: CreateLibraryDialogWithModules defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'show' @ [89:24] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.framework.ui.CreateLibraryDialogWithModules[JavaMethodDescriptor]

'!' @ [90:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dialog' @ [90:22] ==> val dialog: CreateLibraryDialogWithModules defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'isOK' @ [90:29] ==> public final val CreateLibraryDialogWithModules.isOK: Boolean[MyPropertyDescriptor]

'dialog' @ [93:17] ==> val dialog: CreateLibraryDialogWithModules defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'close' @ [93:24] ==> public final fun close(p0: Int): Unit defined in org.jetbrains.kotlin.idea.framework.ui.CreateLibraryDialogWithModules[JavaMethodDescriptor]

'modulesToConfigure' @ [96:13] ==> var modulesToConfigure: (List<Module>..List<Module>?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'dialog' @ [96:34] ==> val dialog: CreateLibraryDialogWithModules defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'modulesToConfigure' @ [96:41] ==> public final val CreateLibraryDialogWithModules.modulesToConfigure: (MutableList<(Module..Module?)>..List<(Module..Module?)>?)[MyPropertyDescriptor]

'copyLibraryIntoPath' @ [97:13] ==> var copyLibraryIntoPath: String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'dialog' @ [97:35] ==> val dialog: CreateLibraryDialogWithModules defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'copyIntoPath' @ [97:42] ==> public final val CreateLibraryDialogWithModules.copyIntoPath: String?[MyPropertyDescriptor]

'createConfigureKotlinNotificationCollector' @ [100:25] ==> public fun createConfigureKotlinNotificationCollector(project: Project): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [100:68] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[ValueParameterDescriptorImpl]

'modulesToConfigure' @ [101:24] ==> var modulesToConfigure: (List<Module>..List<Module>?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'configureModuleWithLibrary' @ [102:13] ==> protected final fun configureModuleWithLibrary(module: Module, defaultPath: String, pathFromDialog: String?, collector: NotificationMessageCollector): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [102:40] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'defaultPathToJar' @ [102:48] ==> val defaultPathToJar: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'copyLibraryIntoPath' @ [102:66] ==> var copyLibraryIntoPath: String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'collector' @ [102:87] ==> val collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'configureKotlinSettings' @ [105:9] ==> protected open fun configureKotlinSettings(modules: List<Module>): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'modulesToConfigure' @ [105:33] ==> var modulesToConfigure: (List<Module>..List<Module>?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'collector' @ [107:9] ==> val collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configure[LocalVariableDescriptor]

'showNotification' @ [107:19] ==> public final fun showNotification(): Unit defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'Suppress' @ [110:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'getDefaultPathToJarFile' @ [112:32] ==> public open fun getDefaultPathToJarFile(project: Project): String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [112:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureSilently[ValueParameterDescriptorImpl]

'createConfigureKotlinNotificationCollector' @ [113:25] ==> public fun createConfigureKotlinNotificationCollector(project: Project): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [113:68] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureSilently[ValueParameterDescriptorImpl]

'iterator' @ [114:24] ==> public final operator fun iterator(): Iterator<(Module..Module?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [114:38] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [114:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureSilently[ValueParameterDescriptorImpl]

'modules' @ [114:59] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'configureModuleWithLibrary' @ [115:13] ==> protected final fun configureModuleWithLibrary(module: Module, defaultPath: String, pathFromDialog: String?, collector: NotificationMessageCollector): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [115:40] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureSilently[LocalVariableDescriptor]

'defaultPathToJar' @ [115:48] ==> val defaultPathToJar: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureSilently[LocalVariableDescriptor]

'collector' @ [115:72] ==> val collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureSilently[LocalVariableDescriptor]

'getPathToCopyFileTo' @ [125:28] ==> private final fun getPathToCopyFileTo(project: Project, jarType: OrderRootType, defaultDir: String, pathFromDialog: String?): String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [125:48] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'project' @ [125:55] ==> public final val Module.project: Project[MyPropertyDescriptor]

'CLASSES' @ [125:78] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'defaultPath' @ [125:87] ==> value-parameter defaultPath: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'pathFromDialog' @ [125:100] ==> value-parameter pathFromDialog: String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'getPathToCopyFileTo' @ [126:28] ==> private final fun getPathToCopyFileTo(project: Project, jarType: OrderRootType, defaultDir: String, pathFromDialog: String?): String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [126:48] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'project' @ [126:55] ==> public final val Module.project: Project[MyPropertyDescriptor]

'SOURCES' @ [126:78] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'defaultPath' @ [126:87] ==> value-parameter defaultPath: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'pathFromDialog' @ [126:100] ==> value-parameter pathFromDialog: String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'configureModuleWithLibrary' @ [127:9] ==> public final fun configureModuleWithLibrary(module: Module, classesPath: String, sourcesPath: String, collector: NotificationMessageCollector, forceJarState: KotlinWithLibraryConfigurator.FileState? = ..., useBundled: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [127:36] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'classesPath' @ [127:44] ==> val classesPath: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'sourcesPath' @ [127:57] ==> val sourcesPath: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'collector' @ [127:70] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'pathFromDialog' @ [127:94] ==> value-parameter pathFromDialog: String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'module' @ [138:23] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'project' @ [138:30] ==> public final val Module.project: Project[MyPropertyDescriptor]

'findAndFixBrokenKotlinLibrary' @ [140:23] ==> protected open fun findAndFixBrokenKotlinLibrary(module: Module, collector: NotificationMessageCollector): Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [140:53] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'collector' @ [140:61] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'getKotlinLibrary' @ [141:26] ==> public final fun getKotlinLibrary(module: Module): Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [141:43] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'getKotlinLibrary' @ [142:26] ==> public final fun getKotlinLibrary(project: Project): Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [142:43] ==> val project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'createNewLibrary' @ [143:26] ==> public final fun createNewLibrary(project: Project, collector: NotificationMessageCollector): Library defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [143:43] ==> val project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'collector' @ [143:52] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'getInstance' @ [145:37] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [145:49] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'sdk' @ [145:57] ==> public final val ModuleRootManager.sdk: Sdk?[MyPropertyDescriptor]

'library' @ [146:21] ==> val library: Library defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'modifiableModel' @ [146:29] ==> public final val Library.modifiableModel: Library.ModifiableModel[MyPropertyDescriptor]

'getLibraryJarDescriptors' @ [148:28] ==> public abstract fun getLibraryJarDescriptors(sdk: Sdk?): List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'sdk' @ [148:53] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'if (descriptor.orderRootType == OrderRootType.SOURCES)
                sourcesPath
            else
                classesPath' @ [149:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'descriptor' @ [149:36] ==> val descriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'orderRootType' @ [149:47] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'SOURCES' @ [149:78] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'sourcesPath' @ [150:17] ==> value-parameter sourcesPath: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'classesPath' @ [152:17] ==> value-parameter classesPath: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'forceJarState' @ [154:32] ==> value-parameter forceJarState: KotlinWithLibraryConfigurator.FileState? = ... defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'getJarState' @ [154:49] ==> protected final fun getJarState(project: Project, targetFile: File, jarType: OrderRootType, useBundled: Boolean): KotlinWithLibraryConfigurator.FileState defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [154:61] ==> val project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'File' @ [155:61] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dirToCopyJar' @ [155:66] ==> val dirToCopyJar: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'descriptor' @ [155:80] ==> val descriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'jarName' @ [155:91] ==> public final val jarName: String defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'descriptor' @ [156:61] ==> val descriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'orderRootType' @ [156:72] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'useBundled' @ [156:87] ==> value-parameter useBundled: Boolean = ... defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'configureLibraryJar' @ [158:13] ==> public final fun configureLibraryJar(library: Library.ModifiableModel, jarState: KotlinWithLibraryConfigurator.FileState, dirToCopyJarTo: String, libraryJarDescriptor: LibraryJarDescriptor, collector: NotificationMessageCollector): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'model' @ [158:33] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'runtimeState' @ [158:40] ==> val runtimeState: KotlinWithLibraryConfigurator.FileState defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'dirToCopyJar' @ [158:54] ==> val dirToCopyJar: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'descriptor' @ [158:68] ==> val descriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'collector' @ [158:80] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'getApplication' @ [160:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runWriteAction' @ [160:45] ==> public final fun runWriteAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'model' @ [160:62] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'commit' @ [160:68] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'addLibraryToModuleIfNeeded' @ [162:9] ==> public final fun addLibraryToModuleIfNeeded(module: Module, library: Library, collector: NotificationMessageCollector): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [162:36] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'library' @ [162:44] ==> val library: Library defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[LocalVariableDescriptor]

'collector' @ [162:53] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureModuleWithLibrary[ValueParameterDescriptorImpl]

'if (jarState == KotlinWithLibraryConfigurator.FileState.DO_NOT_COPY)
            libraryJarDescriptor.getPathInPlugin()
        else
            File(dirToCopyJarTo, libraryJarDescriptor.jarName)' @ [172:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File, elseBranch: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File

'jarState' @ [172:27] ==> value-parameter jarState: KotlinWithLibraryConfigurator.FileState defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'KotlinWithLibraryConfigurator' @ [172:39] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[FakeCallableDescriptorForObject]

'DO_NOT_COPY' @ [172:79] ==> enum entry DO_NOT_COPY defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.FileState[FakeCallableDescriptorForObject]

'libraryJarDescriptor' @ [173:13] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'getPathInPlugin' @ [173:34] ==> public final fun getPathInPlugin(): File defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'File' @ [175:13] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dirToCopyJarTo' @ [175:18] ==> value-parameter dirToCopyJarTo: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'libraryJarDescriptor' @ [175:34] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'jarName' @ [175:55] ==> public final val jarName: String defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'jarState' @ [177:13] ==> value-parameter jarState: KotlinWithLibraryConfigurator.FileState defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'KotlinWithLibraryConfigurator' @ [177:25] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[FakeCallableDescriptorForObject]

'COPY' @ [177:65] ==> enum entry COPY defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.FileState[FakeCallableDescriptorForObject]

'copyFileToDir' @ [178:13] ==> @Contract public final fun copyFileToDir(file: File?, toDir: String, collector: NotificationMessageCollector): File? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'libraryJarDescriptor' @ [178:27] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'getPathInPlugin' @ [178:48] ==> public final fun getPathInPlugin(): File defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'dirToCopyJarTo' @ [178:67] ==> value-parameter dirToCopyJarTo: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'collector' @ [178:83] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'getInstance' @ [181:40] ==> public open fun getInstance(): (LocalFileSystem..LocalFileSystem?) defined in com.intellij.openapi.vfs.LocalFileSystem[JavaMethodDescriptor]

'findFileByIoFile' @ [181:54] ==> @Nullable public abstract fun findFileByIoFile(@NotNull p0: File): VirtualFile? defined in com.intellij.openapi.vfs.LocalFileSystem[JavaMethodDescriptor]

'jarFile' @ [181:71] ==> val jarFile: File defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[LocalVariableDescriptor]

'jarVFile' @ [182:13] ==> val jarVFile: VirtualFile? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[LocalVariableDescriptor]

'collector' @ [183:13] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'addMessage' @ [183:23] ==> public final fun addMessage(message: String): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'+' @ [183:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'jarFile' @ [183:67] ==> val jarFile: File defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[LocalVariableDescriptor]

'getInstance' @ [186:37] ==> public open fun getInstance(): (JarFileSystem..JarFileSystem?) defined in com.intellij.openapi.vfs.JarFileSystem[JavaMethodDescriptor]

'getJarRootForLocalFile' @ [186:51] ==> @Nullable public open fun getJarRootForLocalFile(@NotNull p0: VirtualFile): VirtualFile? defined in com.intellij.openapi.vfs.JarFileSystem[JavaMethodDescriptor]

'jarVFile' @ [186:74] ==> val jarVFile: VirtualFile? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[LocalVariableDescriptor]

'jarRoot' @ [187:13] ==> val jarRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[LocalVariableDescriptor]

'collector' @ [188:13] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'addMessage' @ [188:23] ==> public final fun addMessage(message: String): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'jarVFile' @ [188:73] ==> val jarVFile: VirtualFile? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[LocalVariableDescriptor]

'jarRoot' @ [192:13] ==> val jarRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[LocalVariableDescriptor]

'library' @ [192:25] ==> value-parameter library: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'getFiles' @ [192:33] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'libraryJarDescriptor' @ [192:42] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'orderRootType' @ [192:63] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'library' @ [193:13] ==> value-parameter library: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'addRoot' @ [193:21] ==> public abstract fun addRoot(@NotNull p0: VirtualFile, @NotNull p1: OrderRootType): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'jarRoot' @ [193:29] ==> val jarRoot: VirtualFile? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[LocalVariableDescriptor]

'libraryJarDescriptor' @ [193:38] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'orderRootType' @ [193:59] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'collector' @ [195:13] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[ValueParameterDescriptorImpl]

'addMessage' @ [195:23] ==> public final fun addMessage(message: String): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'jarFile' @ [195:42] ==> val jarFile: File defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.configureLibraryJar[LocalVariableDescriptor]

'?:' @ [200:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Library?, right: Library?): Library?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Library?

'getInstance' @ [200:39] ==> public open fun getInstance(): (LibraryTablesRegistrar..LibraryTablesRegistrar?) defined in com.intellij.openapi.roots.libraries.LibraryTablesRegistrar[JavaMethodDescriptor]

'getLibraryTable' @ [200:53] ==> @NotNull public abstract fun getLibraryTable(@NotNull p0: Project): LibraryTable defined in com.intellij.openapi.roots.libraries.LibraryTablesRegistrar[JavaMethodDescriptor]

'project' @ [200:69] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getKotlinLibrary[ValueParameterDescriptorImpl]

'libraries' @ [200:78] ==> public final val LibraryTable.libraries: (Array<(Library..Library?)>..Array<out (Library..Library?)>)[MyPropertyDescriptor]

'firstOrNull' @ [200:88] ==> public inline fun <T> Array<out (Library..Library?)>.firstOrNull(predicate: ((Library..Library?)) -> Boolean): Library? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.libraries.Library..com.intellij.openapi.roots.libraries.Library?)

'this' @ [200:100] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[LazyClassReceiverParameterDescriptor]

'getInstance' @ [201:39] ==> public open fun getInstance(): (LibraryTablesRegistrar..LibraryTablesRegistrar?) defined in com.intellij.openapi.roots.libraries.LibraryTablesRegistrar[JavaMethodDescriptor]

'libraryTable' @ [201:53] ==> public final val LibraryTablesRegistrar.libraryTable: LibraryTable[MyPropertyDescriptor]

'libraries' @ [201:66] ==> public final val LibraryTable.libraries: (Array<(Library..Library?)>..Array<out (Library..Library?)>)[MyPropertyDescriptor]

'firstOrNull' @ [201:76] ==> public inline fun <T> Array<out (Library..Library?)>.firstOrNull(predicate: ((Library..Library?)) -> Boolean): Library? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.libraries.Library..com.intellij.openapi.roots.libraries.Library?)

'this' @ [201:88] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[LazyClassReceiverParameterDescriptor]

'Contract' @ [204:5] ==> public constructor Contract(value: String = ..., pure: Boolean = ...) defined in org.jetbrains.annotations.Contract[JavaClassConstructorDescriptor]

'file' @ [206:13] ==> value-parameter file: File? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.copyFileToDir[ValueParameterDescriptorImpl]

'copyWithOverwriteDialog' @ [208:32] ==> @Nullable public open fun copyWithOverwriteDialog(@NotNull messagesTitle: String, @NotNull destinationFolder: String, @NotNull file: File): File? defined in org.jetbrains.kotlin.idea.framework.ui.FileUIUtils[JavaMethodDescriptor]

'messageForOverrideDialog' @ [208:56] ==> protected abstract val messageForOverrideDialog: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[PropertyDescriptorImpl]

'toDir' @ [208:82] ==> value-parameter toDir: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.copyFileToDir[ValueParameterDescriptorImpl]

'file' @ [208:89] ==> value-parameter file: File? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.copyFileToDir[ValueParameterDescriptorImpl]

'copy' @ [209:13] ==> val copy: File? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.copyFileToDir[LocalVariableDescriptor]

'collector' @ [210:13] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.copyFileToDir[ValueParameterDescriptorImpl]

'addMessage' @ [210:23] ==> public final fun addMessage(message: String): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'file' @ [210:34] ==> value-parameter file: File? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.copyFileToDir[ValueParameterDescriptorImpl]

'name' @ [210:39] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'toDir' @ [210:66] ==> value-parameter toDir: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.copyFileToDir[ValueParameterDescriptorImpl]

'copy' @ [212:16] ==> val copy: File? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.copyFileToDir[LocalVariableDescriptor]

'getPathFromLibrary' @ [216:16] ==> public final fun getPathFromLibrary(library: Library?, type: OrderRootType): String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion[SimpleFunctionDescriptorImpl]

'getKotlinLibrary' @ [216:35] ==> public final fun getKotlinLibrary(project: Project): Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [216:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getPathFromLibrary[ValueParameterDescriptorImpl]

'type' @ [216:62] ==> value-parameter type: OrderRootType defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getPathFromLibrary[ValueParameterDescriptorImpl]

'getDependencyScope' @ [220:39] ==> private final fun getDependencyScope(module: Module): DependencyScope defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion[SimpleFunctionDescriptorImpl]

'module' @ [220:58] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'getKotlinLibrary' @ [221:29] ==> public final fun getKotlinLibrary(module: Module): Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'module' @ [221:46] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'if (kotlinLibrary == null) {
            ModuleRootModificationUtil.addDependency(module, library, expectedDependencyScope, false)
            collector.addMessage(library.name + " library was added to module " + module.name)
        }
        else {
            val libraryEntry = findLibraryOrderEntry(ModuleRootManager.getInstance(module).orderEntries, kotlinLibrary)
            if (libraryEntry != null) {
                val libraryDependencyScope = libraryEntry.scope
                if (expectedDependencyScope != libraryDependencyScope) {
                    libraryEntry.scope = expectedDependencyScope

                    collector.addMessage(
                            kotlinLibrary.name + " library scope has changed from " + libraryDependencyScope +
                            " to " + expectedDependencyScope + " for module " + module.name)
                }
            }
        }' @ [222:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'kotlinLibrary' @ [222:13] ==> val kotlinLibrary: Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'addDependency' @ [223:40] ==> public open fun addDependency(@NotNull p0: Module, @NotNull p1: Library, @NotNull p2: DependencyScope, p3: Boolean): Unit defined in com.intellij.openapi.roots.ModuleRootModificationUtil[JavaMethodDescriptor]

'module' @ [223:54] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'library' @ [223:62] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'expectedDependencyScope' @ [223:71] ==> val expectedDependencyScope: DependencyScope defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'collector' @ [224:13] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'addMessage' @ [224:23] ==> public final fun addMessage(message: String): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'library' @ [224:34] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'name' @ [224:42] ==> public final val Library.name: String?[MyPropertyDescriptor]

'module' @ [224:83] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'name' @ [224:90] ==> public final val Module.name: String[MyPropertyDescriptor]

'findLibraryOrderEntry' @ [227:32] ==> private final fun findLibraryOrderEntry(orderEntries: Array<OrderEntry>, library: Library): LibraryOrderEntry? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion[SimpleFunctionDescriptorImpl]

'getInstance' @ [227:72] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [227:84] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'orderEntries' @ [227:92] ==> public final val ModuleRootManager.orderEntries: (Array<(OrderEntry..OrderEntry?)>..Array<out (OrderEntry..OrderEntry?)>)[MyPropertyDescriptor]

'kotlinLibrary' @ [227:106] ==> val kotlinLibrary: Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'libraryEntry' @ [228:17] ==> val libraryEntry: LibraryOrderEntry? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'libraryEntry' @ [229:46] ==> val libraryEntry: LibraryOrderEntry? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'scope' @ [229:59] ==> public final var LibraryOrderEntry.scope: DependencyScope[MyPropertyDescriptor]

'expectedDependencyScope' @ [230:21] ==> val expectedDependencyScope: DependencyScope defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'libraryDependencyScope' @ [230:48] ==> val libraryDependencyScope: DependencyScope defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'libraryEntry' @ [231:21] ==> val libraryEntry: LibraryOrderEntry? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'scope' @ [231:34] ==> public final var LibraryOrderEntry.scope: DependencyScope[MyPropertyDescriptor]

'expectedDependencyScope' @ [231:42] ==> val expectedDependencyScope: DependencyScope defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'collector' @ [233:21] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'addMessage' @ [233:31] ==> public final fun addMessage(message: String): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'kotlinLibrary' @ [234:29] ==> val kotlinLibrary: Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'name' @ [234:43] ==> public final val Library.name: String?[MyPropertyDescriptor]

'libraryDependencyScope' @ [234:87] ==> val libraryDependencyScope: DependencyScope defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'expectedDependencyScope' @ [235:38] ==> val expectedDependencyScope: DependencyScope defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[LocalVariableDescriptor]

'module' @ [235:81] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.addLibraryToModuleIfNeeded[ValueParameterDescriptorImpl]

'name' @ [235:88] ==> public final val Module.name: String[MyPropertyDescriptor]

'getInstance' @ [245:44] ==> public open fun getInstance(): (LibraryTablesRegistrar..LibraryTablesRegistrar?) defined in com.intellij.openapi.roots.libraries.LibraryTablesRegistrar[JavaMethodDescriptor]

'getLibraryTable' @ [245:58] ==> @NotNull public abstract fun getLibraryTable(@NotNull p0: Project): LibraryTable defined in com.intellij.openapi.roots.libraries.LibraryTablesRegistrar[JavaMethodDescriptor]

'project' @ [245:74] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.createNewLibrary[ValueParameterDescriptorImpl]

'runWriteAction' @ [246:23] ==> public fun <T> runWriteAction(action: () -> (Library..Library?)): (Library..Library?) defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.libraries.Library..com.intellij.openapi.roots.libraries.Library?)

'table' @ [247:13] ==> val table: LibraryTable defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.createNewLibrary[LocalVariableDescriptor]

'modifiableModel' @ [247:19] ==> public final val LibraryTable.modifiableModel: LibraryTable.ModifiableModel[MyPropertyDescriptor]

'run' @ [247:35] ==> @InlineOnly public inline fun <T, R> LibraryTable.ModifiableModel.run(block: (LibraryTable.ModifiableModel).() -> (Library..Library?)): (Library..Library?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModifiableModel
    <R> -> (com.intellij.openapi.roots.libraries.Library..com.intellij.openapi.roots.libraries.Library?)

'createLibrary' @ [248:31] ==> public abstract fun createLibrary(p0: (String..String?), @Nullable p1: raw (PersistentLibraryKind<(LibraryProperties<*>..LibraryProperties<*>?)>?..PersistentLibraryKind<out (LibraryProperties<*>..LibraryProperties<*>?)>?)): (Library..Library?) defined in com.intellij.openapi.roots.libraries.LibraryTable.ModifiableModel[JavaMethodDescriptor]

'libraryName' @ [248:45] ==> protected abstract val libraryName: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[PropertyDescriptorImpl]

'libraryKind' @ [248:58] ==> protected final val libraryKind: PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[PropertyDescriptorImpl]

'commit' @ [249:17] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.roots.libraries.LibraryTable.ModifiableModel[JavaMethodDescriptor]

'library' @ [250:17] ==> val library: (Library..Library?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.createNewLibrary.<anonymous>.<anonymous>[LocalVariableDescriptor]

'collector' @ [254:9] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.createNewLibrary[ValueParameterDescriptorImpl]

'addMessage' @ [254:19] ==> public final fun addMessage(message: String): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'library' @ [254:30] ==> val library: (Library..Library?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.createNewLibrary[LocalVariableDescriptor]

'name' @ [254:38] ==> public final val Library.name: String?[MyPropertyDescriptor]

'library' @ [255:16] ==> val library: (Library..Library?) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.createNewLibrary[LocalVariableDescriptor]

'getKotlinLibrary' @ [259:23] ==> public final fun getKotlinLibrary(project: Project): Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [259:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.isProjectLibraryPresent[ValueParameterDescriptorImpl]

'library' @ [260:16] ==> val library: Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.isProjectLibraryPresent[LocalVariableDescriptor]

'library' @ [260:35] ==> val library: Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.isProjectLibraryPresent[LocalVariableDescriptor]

'getUrls' @ [260:43] ==> @NotNull public abstract fun getUrls(@NotNull p0: OrderRootType): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'CLASSES' @ [260:65] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'size' @ [260:74] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'findKotlinRuntimeLibrary' @ [266:16] ==> public fun findKotlinRuntimeLibrary(module: Module, predicate: (Library) -> Boolean = ...): Library? defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'module' @ [266:41] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getKotlinLibrary[ValueParameterDescriptorImpl]

'this' @ [266:49] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[LazyClassReceiverParameterDescriptor]

'library' @ [269:53] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.isKotlinLibrary[ValueParameterDescriptorImpl]

'name' @ [269:61] ==> public final val Library.name: String?[MyPropertyDescriptor]

'libraryName' @ [269:69] ==> protected abstract val libraryName: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[PropertyDescriptorImpl]

'invoke' @ [269:84] ==> public abstract operator fun invoke(p1: Library): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'library' @ [269:99] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.isKotlinLibrary[ValueParameterDescriptorImpl]

'getDefaultPathToJarFile' @ [272:27] ==> public open fun getDefaultPathToJarFile(project: Project): String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [272:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.needToChooseJarPath[ValueParameterDescriptorImpl]

'!' @ [273:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isProjectLibraryPresent' @ [273:17] ==> private final fun isProjectLibraryPresent(project: Project): Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [273:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.needToChooseJarPath[ValueParameterDescriptorImpl]

'!' @ [274:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'File' @ [274:17] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'defaultPath' @ [274:22] ==> val defaultPath: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.needToChooseJarPath[LocalVariableDescriptor]

'getLibraryJarDescriptors' @ [274:35] ==> public abstract fun getLibraryJarDescriptors(sdk: Sdk?): List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'first' @ [274:66] ==> public fun <T> List<LibraryJarDescriptor>.first(): LibraryJarDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibraryJarDescriptor

'jarName' @ [274:74] ==> public final val jarName: String defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'exists' @ [274:83] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'createRelativePath' @ [278:28] ==> @NotNull public open fun createRelativePath(@Nullable project: Project?, @Nullable contextDirectory: VirtualFile?, relativePath: (String..String?)): String defined in org.jetbrains.kotlin.idea.framework.ui.FileUIUtils[JavaMethodDescriptor]

'project' @ [278:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getDefaultPathToJarFile[ValueParameterDescriptorImpl]

'project' @ [278:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getDefaultPathToJarFile[ValueParameterDescriptorImpl]

'baseDir' @ [278:64] ==> public final val Project.baseDir: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'DEFAULT_LIBRARY_DIR' @ [278:73] ==> public final val DEFAULT_LIBRARY_DIR: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion[PropertyDescriptorImpl]

'when {
        targetFile.exists() -> FileState.EXISTS
        getPathFromLibrary(project, jarType) != null -> FileState.COPY
        useBundled -> FileState.DO_NOT_COPY
        else -> FileState.COPY
    }' @ [292:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinWithLibraryConfigurator.FileState, entry1: KotlinWithLibraryConfigurator.FileState, entry2: KotlinWithLibraryConfigurator.FileState, entry3: KotlinWithLibraryConfigurator.FileState): KotlinWithLibraryConfigurator.FileState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FileState

'targetFile' @ [293:9] ==> value-parameter targetFile: File defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getJarState[ValueParameterDescriptorImpl]

'exists' @ [293:20] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'EXISTS' @ [293:42] ==> enum entry EXISTS defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.FileState[FakeCallableDescriptorForObject]

'getPathFromLibrary' @ [294:9] ==> protected final fun getPathFromLibrary(project: Project, type: OrderRootType): String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [294:28] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getJarState[ValueParameterDescriptorImpl]

'jarType' @ [294:37] ==> value-parameter jarType: OrderRootType defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getJarState[ValueParameterDescriptorImpl]

'COPY' @ [294:67] ==> enum entry COPY defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.FileState[FakeCallableDescriptorForObject]

'useBundled' @ [295:9] ==> value-parameter useBundled: Boolean defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getJarState[ValueParameterDescriptorImpl]

'DO_NOT_COPY' @ [295:33] ==> enum entry DO_NOT_COPY defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.FileState[FakeCallableDescriptorForObject]

'COPY' @ [296:27] ==> enum entry COPY defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.FileState[FakeCallableDescriptorForObject]

'pathFromDialog' @ [305:13] ==> value-parameter pathFromDialog: String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getPathToCopyFileTo[ValueParameterDescriptorImpl]

'pathFromDialog' @ [306:20] ==> value-parameter pathFromDialog: String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getPathToCopyFileTo[ValueParameterDescriptorImpl]

'getPathFromLibrary' @ [308:31] ==> protected final fun getPathFromLibrary(project: Project, type: OrderRootType): String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [308:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getPathToCopyFileTo[ValueParameterDescriptorImpl]

'jarType' @ [308:59] ==> value-parameter jarType: OrderRootType defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getPathToCopyFileTo[ValueParameterDescriptorImpl]

'pathFromLibrary' @ [309:13] ==> val pathFromLibrary: String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getPathToCopyFileTo[LocalVariableDescriptor]

'pathFromLibrary' @ [310:20] ==> val pathFromLibrary: String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getPathToCopyFileTo[LocalVariableDescriptor]

'defaultDir' @ [312:16] ==> value-parameter defaultDir: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.getPathToCopyFileTo[ValueParameterDescriptorImpl]

'!' @ [323:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAndroidGradleModule' @ [323:34] ==> public open fun isAndroidGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [323:56] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.isApplicable[ValueParameterDescriptorImpl]

'!' @ [324:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isMavenModule' @ [324:34] ==> public open fun isMavenModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [324:48] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.isApplicable[ValueParameterDescriptorImpl]

'!' @ [325:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGradleModule' @ [325:34] ==> public open fun isGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [325:49] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.isApplicable[ValueParameterDescriptorImpl]

'library' @ [332:17] ==> value-parameter library: Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibrary[ValueParameterDescriptorImpl]

'library' @ [334:32] ==> value-parameter library: Library? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibrary[ValueParameterDescriptorImpl]

'getUrls' @ [334:40] ==> @NotNull public abstract fun getUrls(@NotNull p0: OrderRootType): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'type' @ [334:48] ==> value-parameter type: OrderRootType defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibrary[ValueParameterDescriptorImpl]

'getPathFromLibraryUrls' @ [335:20] ==> public final fun getPathFromLibraryUrls(libraryFiles: Array<String>): String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion[SimpleFunctionDescriptorImpl]

'libraryFiles' @ [335:43] ==> val libraryFiles: (Array<(String..String?)>..Array<out (String..String?)>) defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibrary[LocalVariableDescriptor]

'libraryFiles' @ [339:17] ==> value-parameter libraryFiles: Array<String> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibraryUrls[ValueParameterDescriptorImpl]

'size' @ [339:30] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'urlToPath' @ [341:46] ==> @NotNull public open fun urlToPath(@Nullable p0: String?): String defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'libraryFiles' @ [341:56] ==> value-parameter libraryFiles: Array<String> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibraryUrls[ValueParameterDescriptorImpl]

'?:' @ [342:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'getParentDir' @ [342:37] ==> @Nullable public open fun getParentDir(@Nullable p0: String?): String? defined in com.intellij.openapi.vfs.VfsUtil[JavaMethodDescriptor]

'getParentDir' @ [342:58] ==> @Nullable public open fun getParentDir(@Nullable p0: String?): String? defined in com.intellij.openapi.vfs.VfsUtil[JavaMethodDescriptor]

'pathToJarInLib' @ [342:71] ==> val pathToJarInLib: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibraryUrls[LocalVariableDescriptor]

'File' @ [344:33] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'parentDir' @ [344:38] ==> val parentDir: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibraryUrls[LocalVariableDescriptor]

'!' @ [345:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parentDirFile' @ [345:18] ==> val parentDirFile: File defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibraryUrls[LocalVariableDescriptor]

'exists' @ [345:32] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'!' @ [345:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parentDirFile' @ [345:45] ==> val parentDirFile: File defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibraryUrls[LocalVariableDescriptor]

'mkdirs' @ [345:59] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'parentDir' @ [348:20] ==> val parentDir: String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getPathFromLibraryUrls[LocalVariableDescriptor]

'orderEntries' @ [352:32] ==> value-parameter orderEntries: Array<OrderEntry> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.findLibraryOrderEntry[ValueParameterDescriptorImpl]

'orderEntry' @ [353:21] ==> val orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.findLibraryOrderEntry[LocalVariableDescriptor]

'library' @ [353:56] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.findLibraryOrderEntry[ValueParameterDescriptorImpl]

'orderEntry' @ [353:67] ==> val orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.findLibraryOrderEntry[LocalVariableDescriptor]

'library' @ [353:78] ==> public final val LibraryOrderEntry.library: Library?[MyPropertyDescriptor]

'orderEntry' @ [354:28] ==> val orderEntry: OrderEntry defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.findLibraryOrderEntry[LocalVariableDescriptor]

'hasKotlinFilesOnlyInTests' @ [362:17] ==> public fun hasKotlinFilesOnlyInTests(module: Module): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [362:43] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion.getDependencyScope[ValueParameterDescriptorImpl]

'TEST' @ [363:40] ==> enum entry TEST defined in com.intellij.openapi.roots.DependencyScope[FakeCallableDescriptorForObject]

'COMPILE' @ [365:36] ==> enum entry COMPILE defined in com.intellij.openapi.roots.DependencyScope[FakeCallableDescriptorForObject]

