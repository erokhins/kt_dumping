'RepositoryDescription' @ [47:27] ==> public constructor RepositoryDescription(id: String, name: String, url: String, bintrayUrl: String?, isSnapshot: Boolean) defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[ClassConstructorDescriptorImpl]

'RepositoryDescription' @ [54:22] ==> public constructor RepositoryDescription(id: String, name: String, url: String, bintrayUrl: String?, isSnapshot: Boolean) defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[ClassConstructorDescriptorImpl]

'RepositoryDescription' @ [61:25] ==> public constructor RepositoryDescription(id: String, name: String, url: String, bintrayUrl: String?, isSnapshot: Boolean) defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[ClassConstructorDescriptorImpl]

'RepositoryDescription' @ [68:25] ==> public constructor RepositoryDescription(id: String, name: String, url: String, bintrayUrl: String?, isSnapshot: Boolean) defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[ClassConstructorDescriptorImpl]

'repositoriesBlockText' @ [82:9] ==> value-parameter repositoriesBlockText: String defined in org.jetbrains.kotlin.idea.configuration.isRepositoryConfigured[ValueParameterDescriptorImpl]

'contains' @ [82:31] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'MAVEN_CENTRAL' @ [82:40] ==> public val MAVEN_CENTRAL: String defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[PropertyDescriptorImpl]

'repositoriesBlockText' @ [82:58] ==> value-parameter repositoriesBlockText: String defined in org.jetbrains.kotlin.idea.configuration.isRepositoryConfigured[ValueParameterDescriptorImpl]

'contains' @ [82:80] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JCENTER' @ [82:89] ==> public val JCENTER: String defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[PropertyDescriptorImpl]

'when (this) {
    DependencyScope.COMPILE -> "compile"
    // TODO: We should add testCompile or androidTestCompile
    DependencyScope.TEST -> if (isAndroidModule) "compile" else "testCompile"
    DependencyScope.RUNTIME -> "runtime"
    DependencyScope.PROVIDED -> "compile"
    else -> "compile"
}' @ [84:70] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'this' @ [84:76] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.toGradleCompileScope[ReceiverParameterDescriptorImpl]

'COMPILE' @ [85:21] ==> enum entry COMPILE defined in com.intellij.openapi.roots.DependencyScope[FakeCallableDescriptorForObject]

'TEST' @ [87:21] ==> enum entry TEST defined in com.intellij.openapi.roots.DependencyScope[FakeCallableDescriptorForObject]

'if (isAndroidModule) "compile" else "testCompile"' @ [87:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isAndroidModule' @ [87:33] ==> value-parameter isAndroidModule: Boolean defined in org.jetbrains.kotlin.idea.configuration.toGradleCompileScope[ValueParameterDescriptorImpl]

'RUNTIME' @ [88:21] ==> enum entry RUNTIME defined in com.intellij.openapi.roots.DependencyScope[FakeCallableDescriptorForObject]

'PROVIDED' @ [89:21] ==> enum entry PROVIDED defined in com.intellij.openapi.roots.DependencyScope[FakeCallableDescriptorForObject]

'url' @ [93:73] ==> public final val url: String defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'url' @ [95:77] ==> public final val url: String defined in org.jetbrains.kotlin.idea.configuration.RepositoryDescription[PropertyDescriptorImpl]

'when {
    isSnapshot(version) -> SNAPSHOT_REPOSITORY
    useEapRepository(2, version) -> EAP_12_REPOSITORY
    useEapRepository(1, version) -> EAP_11_REPOSITORY
    isEap(version) -> EAP_REPOSITORY
    else -> null
}' @ [97:72] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: RepositoryDescription?, entry1: RepositoryDescription?, entry2: RepositoryDescription?, entry3: RepositoryDescription?, entry4: RepositoryDescription?): RepositoryDescription?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> RepositoryDescription?

'isSnapshot' @ [98:5] ==> public fun isSnapshot(version: String): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'version' @ [98:16] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.getRepositoryForVersion[ValueParameterDescriptorImpl]

'SNAPSHOT_REPOSITORY' @ [98:28] ==> public val SNAPSHOT_REPOSITORY: RepositoryDescription defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[PropertyDescriptorImpl]

'useEapRepository' @ [99:5] ==> public fun useEapRepository(minorKotlinVersion: Int, version: String): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'version' @ [99:25] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.getRepositoryForVersion[ValueParameterDescriptorImpl]

'EAP_12_REPOSITORY' @ [99:37] ==> public val EAP_12_REPOSITORY: RepositoryDescription defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[PropertyDescriptorImpl]

'useEapRepository' @ [100:5] ==> public fun useEapRepository(minorKotlinVersion: Int, version: String): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'version' @ [100:25] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.getRepositoryForVersion[ValueParameterDescriptorImpl]

'EAP_11_REPOSITORY' @ [100:37] ==> public val EAP_11_REPOSITORY: RepositoryDescription defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[PropertyDescriptorImpl]

'isEap' @ [101:5] ==> public fun isEap(version: String): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'version' @ [101:11] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.getRepositoryForVersion[ValueParameterDescriptorImpl]

'EAP_REPOSITORY' @ [101:23] ==> public val EAP_REPOSITORY: RepositoryDescription defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[PropertyDescriptorImpl]

'allConfigurators' @ [106:12] ==> public fun allConfigurators(): (Array<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>..Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>) defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'any' @ [106:31] ==> public inline fun <T> Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>.any(predicate: ((KotlinProjectConfigurator..KotlinProjectConfigurator?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator..org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator?)

'it' @ [107:9] ==> value-parameter it: (KotlinProjectConfigurator..KotlinProjectConfigurator?) defined in org.jetbrains.kotlin.idea.configuration.isModuleConfigured.<anonymous>[ValueParameterDescriptorImpl]

'getStatus' @ [107:12] ==> public abstract fun getStatus(moduleSourceRootGroup: ModuleSourceRootGroup): ConfigureKotlinStatus defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'moduleSourceRootGroup' @ [107:22] ==> value-parameter moduleSourceRootGroup: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.isModuleConfigured[ValueParameterDescriptorImpl]

'CONFIGURED' @ [107:70] ==> enum entry CONFIGURED defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'project' @ [112:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getModulesWithKotlinFiles[ValueParameterDescriptorImpl]

'isDisposed' @ [112:17] ==> public final val Project.isDisposed: Boolean[MyPropertyDescriptor]

'emptyList' @ [113:16] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'!' @ [116:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [116:10] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'containsFileOfType' @ [116:40] ==> public open fun containsFileOfType(@NotNull p0: FileType, @NotNull p1: GlobalSearchScope): Boolean defined in com.intellij.psi.search.FileTypeIndex[JavaMethodDescriptor]

'INSTANCE' @ [116:75] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'projectScope' @ [116:103] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [116:116] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getModulesWithKotlinFiles[ValueParameterDescriptorImpl]

'emptyList' @ [117:16] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'project' @ [120:12] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getModulesWithKotlinFiles[ValueParameterDescriptorImpl]

'allModules' @ [120:20] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[SimpleFunctionDescriptorImpl]

'filter' @ [121:14] ==> public inline fun <T> Iterable<(Module..Module?)>.filter(predicate: ((Module..Module?)) -> Boolean): List<(Module..Module?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'runReadAction' @ [122:17] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'containsFileOfType' @ [123:35] ==> public open fun containsFileOfType(@NotNull p0: FileType, @NotNull p1: GlobalSearchScope): Boolean defined in com.intellij.psi.search.FileTypeIndex[JavaMethodDescriptor]

'INSTANCE' @ [123:69] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'module' @ [123:79] ==> value-parameter module: (Module..Module?) defined in org.jetbrains.kotlin.idea.configuration.getModulesWithKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'getModuleScope' @ [123:86] ==> @NotNull public abstract fun getModuleScope(p0: Boolean): GlobalSearchScope defined in com.intellij.openapi.module.Module[JavaMethodDescriptor]

'getModulesWithKotlinFiles' @ [129:19] ==> public fun getModulesWithKotlinFiles(project: Project): Collection<Module> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [129:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getConfigurableModulesWithKotlinFiles[ValueParameterDescriptorImpl]

'modules' @ [130:9] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.getConfigurableModulesWithKotlinFiles[LocalVariableDescriptor]

'isEmpty' @ [130:17] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [130:35] ==> public fun <T> emptyList(): List<ModuleSourceRootGroup> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup

'ModuleSourceRootMap' @ [132:12] ==> public constructor ModuleSourceRootMap(project: Project) defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[ClassConstructorDescriptorImpl]

'project' @ [132:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getConfigurableModulesWithKotlinFiles[ValueParameterDescriptorImpl]

'groupByBaseModules' @ [132:41] ==> public final fun groupByBaseModules(modules: Collection<Module>): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[SimpleFunctionDescriptorImpl]

'modules' @ [132:60] ==> val modules: Collection<Module> defined in org.jetbrains.kotlin.idea.configuration.getConfigurableModulesWithKotlinFiles[LocalVariableDescriptor]

'ModuleSourceRootMap' @ [136:23] ==> public constructor ModuleSourceRootMap(project: Project) defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[ClassConstructorDescriptorImpl]

'module' @ [136:43] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'project' @ [136:50] ==> public final val Module.project: Project[MyPropertyDescriptor]

'toModuleGroup' @ [136:59] ==> public final fun toModuleGroup(module: Module): ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[SimpleFunctionDescriptorImpl]

'module' @ [136:73] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'isModuleConfigured' @ [137:9] ==> public fun isModuleConfigured(moduleSourceRootGroup: ModuleSourceRootGroup): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'moduleGroup' @ [137:28] ==> val moduleGroup: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[LocalVariableDescriptor]

'ConfigureKotlinNotificationManager' @ [139:5] ==> public object ConfigureKotlinNotificationManager : KotlinSingleNotificationManager<ConfigureKotlinNotification> defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinNotificationManager.kt[FakeCallableDescriptorForObject]

'notify' @ [139:40] ==> public final fun notify(project: Project, excludeModules: List<Module> = ...): Unit defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager[SimpleFunctionDescriptorImpl]

'module' @ [139:47] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'project' @ [139:54] ==> public final val Module.project: Project[MyPropertyDescriptor]

'emptyList' @ [142:94] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'getInstance' @ [143:42] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'project' @ [143:54] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'runReadActionInSmartMode' @ [143:63] ==> public open fun <T : (Any..Any?)> runReadActionInSmartMode(@NotNull p0: Computable<(String..String?)>): (String..String?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'Computable' @ [143:88] ==> public fun <T : (Any..Any?)> Computable(function: () -> String?): Computable<String?> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> String?

'getConfigurableModulesWithKotlinFiles' @ [144:23] ==> public fun getConfigurableModulesWithKotlinFiles(project: Project): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [144:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'exclude' @ [144:70] ==> public fun List<ModuleSourceRootGroup>.exclude(excludeModules: Collection<Module>): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'excludeModules' @ [144:78] ==> value-parameter excludeModules: List<Module> = ... defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'if (modules.all(::isModuleConfigured))
            null
        else
            ConfigureKotlinNotification.getNotificationString(project, excludeModules)' @ [145:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'modules' @ [145:13] ==> val modules: List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded.<anonymous>[LocalVariableDescriptor]

'all' @ [145:21] ==> public inline fun <T> Iterable<ModuleSourceRootGroup>.all(predicate: (ModuleSourceRootGroup) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup

'ConfigureKotlinNotification' @ [148:13] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification[FakeCallableDescriptorForObject]

'getNotificationString' @ [148:41] ==> public final fun getNotificationString(project: Project, excludeModules: Collection<Module>): String? defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification.Companion[SimpleFunctionDescriptorImpl]

'project' @ [148:63] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'excludeModules' @ [148:72] ==> value-parameter excludeModules: List<Module> = ... defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'notificationString' @ [151:9] ==> val notificationString: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[LocalVariableDescriptor]

'getApplication' @ [152:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [152:45] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'ConfigureKotlinNotificationManager' @ [153:13] ==> public object ConfigureKotlinNotificationManager : KotlinSingleNotificationManager<ConfigureKotlinNotification> defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinNotificationManager.kt[FakeCallableDescriptorForObject]

'notify' @ [153:48] ==> public open fun notify(project: Project, notification: ConfigureKotlinNotification): Unit defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinNotificationManager[SimpleFunctionDescriptorImpl]

'project' @ [153:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'ConfigureKotlinNotification' @ [153:64] ==> public constructor ConfigureKotlinNotification(project: Project, excludeModules: List<Module>, notificationString: String) defined in org.jetbrains.kotlin.idea.configuration.ui.notifications.ConfigureKotlinNotification[ClassConstructorDescriptorImpl]

'project' @ [153:92] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'excludeModules' @ [153:101] ==> value-parameter excludeModules: List<Module> = ... defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[ValueParameterDescriptorImpl]

'notificationString' @ [153:117] ==> val notificationString: (String..String?) defined in org.jetbrains.kotlin.idea.configuration.showConfigureKotlinNotificationIfNeeded[LocalVariableDescriptor]

'getConfigurableModules' @ [159:19] ==> public fun getConfigurableModules(project: Project): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [159:42] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getAbleToRunConfigurators[ValueParameterDescriptorImpl]

'allConfigurators' @ [161:12] ==> public fun allConfigurators(): (Array<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>..Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>) defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'filter' @ [161:31] ==> public inline fun <T> Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>.filter(predicate: ((KotlinProjectConfigurator..KotlinProjectConfigurator?)) -> Boolean): List<(KotlinProjectConfigurator..KotlinProjectConfigurator?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator..org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator?)

'modules' @ [162:9] ==> val modules: List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration.getAbleToRunConfigurators[LocalVariableDescriptor]

'any' @ [162:17] ==> public inline fun <T> Iterable<ModuleSourceRootGroup>.any(predicate: (ModuleSourceRootGroup) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup

'configurator' @ [162:23] ==> value-parameter configurator: (KotlinProjectConfigurator..KotlinProjectConfigurator?) defined in org.jetbrains.kotlin.idea.configuration.getAbleToRunConfigurators.<anonymous>[ValueParameterDescriptorImpl]

'getStatus' @ [162:36] ==> public abstract fun getStatus(moduleSourceRootGroup: ModuleSourceRootGroup): ConfigureKotlinStatus defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'it' @ [162:46] ==> value-parameter it: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.getAbleToRunConfigurators.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'CAN_BE_CONFIGURED' @ [162:75] ==> enum entry CAN_BE_CONFIGURED defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'getConfigurableModulesWithKotlinFiles' @ [167:12] ==> public fun getConfigurableModulesWithKotlinFiles(project: Project): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [167:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getConfigurableModules[ValueParameterDescriptorImpl]

'ifEmpty' @ [167:59] ==> public inline fun <T, C : Collection<ModuleSourceRootGroup>> List<ModuleSourceRootGroup>.ifEmpty(body: () -> List<ModuleSourceRootGroup>): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup
    <C : Collection<T>> -> List<ModuleSourceRootGroup>

'ModuleSourceRootMap' @ [168:9] ==> public constructor ModuleSourceRootMap(project: Project) defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[ClassConstructorDescriptorImpl]

'project' @ [168:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getConfigurableModules[ValueParameterDescriptorImpl]

'groupByBaseModules' @ [168:38] ==> public final fun groupByBaseModules(modules: Collection<Module>): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[SimpleFunctionDescriptorImpl]

'project' @ [168:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getConfigurableModules[ValueParameterDescriptorImpl]

'allModules' @ [168:65] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[SimpleFunctionDescriptorImpl]

'ModuleSourceRootMap' @ [173:23] ==> public constructor ModuleSourceRootMap(project: Project) defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[ClassConstructorDescriptorImpl]

'module' @ [173:43] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.getAbleToRunConfigurators[ValueParameterDescriptorImpl]

'project' @ [173:50] ==> public final val Module.project: Project[MyPropertyDescriptor]

'toModuleGroup' @ [173:59] ==> public final fun toModuleGroup(module: Module): ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[SimpleFunctionDescriptorImpl]

'module' @ [173:73] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.getAbleToRunConfigurators[ValueParameterDescriptorImpl]

'allConfigurators' @ [174:12] ==> public fun allConfigurators(): (Array<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>..Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>) defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'filter' @ [174:31] ==> public inline fun <T> Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>.filter(predicate: ((KotlinProjectConfigurator..KotlinProjectConfigurator?)) -> Boolean): List<(KotlinProjectConfigurator..KotlinProjectConfigurator?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator..org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator?)

'it' @ [175:9] ==> value-parameter it: (KotlinProjectConfigurator..KotlinProjectConfigurator?) defined in org.jetbrains.kotlin.idea.configuration.getAbleToRunConfigurators.<anonymous>[ValueParameterDescriptorImpl]

'getStatus' @ [175:12] ==> public abstract fun getStatus(moduleSourceRootGroup: ModuleSourceRootGroup): ConfigureKotlinStatus defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'moduleGroup' @ [175:22] ==> val moduleGroup: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.getAbleToRunConfigurators[LocalVariableDescriptor]

'CAN_BE_CONFIGURED' @ [175:60] ==> enum entry CAN_BE_CONFIGURED defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'allConfigurators' @ [180:12] ==> public fun allConfigurators(): (Array<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>..Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>) defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [180:31] ==> public inline fun <T> Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>.firstOrNull(predicate: ((KotlinProjectConfigurator..KotlinProjectConfigurator?)) -> Boolean): KotlinProjectConfigurator? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator..org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator?)

'it' @ [180:45] ==> value-parameter it: (KotlinProjectConfigurator..KotlinProjectConfigurator?) defined in org.jetbrains.kotlin.idea.configuration.getConfiguratorByName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [180:48] ==> public abstract val name: String defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[PropertyDescriptorImpl]

'name' @ [180:56] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.configuration.getConfiguratorByName[ValueParameterDescriptorImpl]

'getExtensions' @ [183:37] ==> @NotNull public open fun <T : (Any..Any?)> getExtensions(@NotNull p0: ExtensionPointName<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>): (Array<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>..Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>) defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinProjectConfigurator

'KotlinProjectConfigurator' @ [183:51] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[FakeCallableDescriptorForObject]

'EP_NAME' @ [183:77] ==> public final val EP_NAME: ExtensionPointName<(KotlinProjectConfigurator..KotlinProjectConfigurator?)> defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator.Companion[PropertyDescriptorImpl]

'ModuleSourceRootMap' @ [186:12] ==> public constructor ModuleSourceRootMap(project: Project) defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[ClassConstructorDescriptorImpl]

'project' @ [186:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModules[ValueParameterDescriptorImpl]

'groupByBaseModules' @ [186:41] ==> public final fun groupByBaseModules(modules: Collection<Module>): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootMap[SimpleFunctionDescriptorImpl]

'project' @ [186:60] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModules[ValueParameterDescriptorImpl]

'allModules' @ [186:68] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[SimpleFunctionDescriptorImpl]

'filter' @ [187:14] ==> public inline fun <T> Iterable<ModuleSourceRootGroup>.filter(predicate: (ModuleSourceRootGroup) -> Boolean): List<ModuleSourceRootGroup> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup

'configurator' @ [187:23] ==> value-parameter configurator: KotlinProjectConfigurator defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModules[ValueParameterDescriptorImpl]

'canConfigure' @ [187:36] ==> private fun KotlinProjectConfigurator.canConfigure(moduleSourceRootGroup: ModuleSourceRootGroup): Boolean defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'it' @ [187:49] ==> value-parameter it: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModules.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [188:14] ==> public inline fun <T, R> Iterable<ModuleSourceRootGroup>.map(transform: (ModuleSourceRootGroup) -> Module): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup
    <R> -> Module

'it' @ [188:20] ==> value-parameter it: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModules.<anonymous>[ValueParameterDescriptorImpl]

'baseModule' @ [188:23] ==> public final val baseModule: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootGroup[PropertyDescriptorImpl]

'getStatus' @ [192:9] ==> public abstract fun getStatus(moduleSourceRootGroup: ModuleSourceRootGroup): ConfigureKotlinStatus defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'moduleSourceRootGroup' @ [192:19] ==> value-parameter moduleSourceRootGroup: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.canConfigure[ValueParameterDescriptorImpl]

'CAN_BE_CONFIGURED' @ [192:67] ==> enum entry CAN_BE_CONFIGURED defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'allConfigurators' @ [193:10] ==> public fun allConfigurators(): (Array<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>..Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>) defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'toList' @ [193:29] ==> public fun <T> Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>.toList(): List<(KotlinProjectConfigurator..KotlinProjectConfigurator?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator..org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator?)

'this' @ [193:40] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.canConfigure[ReceiverParameterDescriptorImpl]

'none' @ [193:46] ==> public inline fun <T> Iterable<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>.none(predicate: ((KotlinProjectConfigurator..KotlinProjectConfigurator?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator..org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator?)

'it' @ [193:53] ==> value-parameter it: (KotlinProjectConfigurator..KotlinProjectConfigurator?) defined in org.jetbrains.kotlin.idea.configuration.canConfigure.<anonymous>[ValueParameterDescriptorImpl]

'getStatus' @ [193:56] ==> public abstract fun getStatus(moduleSourceRootGroup: ModuleSourceRootGroup): ConfigureKotlinStatus defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'moduleSourceRootGroup' @ [193:66] ==> value-parameter moduleSourceRootGroup: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.canConfigure[ValueParameterDescriptorImpl]

'CONFIGURED' @ [193:114] ==> enum entry CONFIGURED defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'getConfigurableModulesWithKotlinFiles' @ [196:19] ==> public fun getConfigurableModulesWithKotlinFiles(project: Project): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [196:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles[ValueParameterDescriptorImpl]

'modules' @ [197:12] ==> val modules: List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles[LocalVariableDescriptor]

'filter' @ [197:20] ==> public inline fun <T> Iterable<ModuleSourceRootGroup>.filter(predicate: (ModuleSourceRootGroup) -> Boolean): List<ModuleSourceRootGroup> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup

'configurator' @ [197:29] ==> value-parameter configurator: KotlinProjectConfigurator defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles[ValueParameterDescriptorImpl]

'getStatus' @ [197:42] ==> public abstract fun getStatus(moduleSourceRootGroup: ModuleSourceRootGroup): ConfigureKotlinStatus defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'it' @ [197:52] ==> value-parameter it: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'CAN_BE_CONFIGURED' @ [197:81] ==> enum entry CAN_BE_CONFIGURED defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'map' @ [197:101] ==> public inline fun <T, R> Iterable<ModuleSourceRootGroup>.map(transform: (ModuleSourceRootGroup) -> Module): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup
    <R> -> Module

'it' @ [197:107] ==> value-parameter it: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'baseModule' @ [197:110] ==> public final val baseModule: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootGroup[PropertyDescriptorImpl]

'emptyList' @ [200:101] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'getConfigurableModulesWithKotlinFiles' @ [201:34] ==> public fun getConfigurableModulesWithKotlinFiles(project: Project): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [201:72] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles[ValueParameterDescriptorImpl]

'exclude' @ [201:81] ==> public fun List<ModuleSourceRootGroup>.exclude(excludeModules: Collection<Module>): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'excludeModules' @ [201:89] ==> value-parameter excludeModules: Collection<Module> = ... defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles[ValueParameterDescriptorImpl]

'allConfigurators' @ [202:25] ==> public fun allConfigurators(): (Array<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>..Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>) defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'modulesWithKotlinFiles' @ [203:12] ==> val modulesWithKotlinFiles: List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles[LocalVariableDescriptor]

'filter' @ [203:35] ==> public inline fun <T> Iterable<ModuleSourceRootGroup>.filter(predicate: (ModuleSourceRootGroup) -> Boolean): List<ModuleSourceRootGroup> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup

'configurators' @ [204:9] ==> val configurators: (Array<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>..Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>) defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles[LocalVariableDescriptor]

'any' @ [204:23] ==> public inline fun <T> Array<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>.any(predicate: ((KotlinProjectConfigurator..KotlinProjectConfigurator?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator..org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator?)

'it' @ [204:29] ==> value-parameter it: (KotlinProjectConfigurator..KotlinProjectConfigurator?) defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getStatus' @ [204:32] ==> public abstract fun getStatus(moduleSourceRootGroup: ModuleSourceRootGroup): ConfigureKotlinStatus defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'moduleSourceRootGroup' @ [204:42] ==> value-parameter moduleSourceRootGroup: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'CAN_BE_CONFIGURED' @ [204:90] ==> enum entry CAN_BE_CONFIGURED defined in org.jetbrains.kotlin.idea.configuration.ConfigureKotlinStatus[FakeCallableDescriptorForObject]

'map' @ [205:7] ==> public inline fun <T, R> Iterable<ModuleSourceRootGroup>.map(transform: (ModuleSourceRootGroup) -> Module): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup
    <R> -> Module

'it' @ [205:13] ==> value-parameter it: ModuleSourceRootGroup defined in org.jetbrains.kotlin.idea.configuration.getCanBeConfiguredModulesWithKotlinFiles.<anonymous>[ValueParameterDescriptorImpl]

'baseModule' @ [205:16] ==> public final val baseModule: Module defined in org.jetbrains.kotlin.idea.configuration.ModuleSourceRootGroup[PropertyDescriptorImpl]

'module' @ [209:17] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasAnyKotlinRuntimeInScope[ValueParameterDescriptorImpl]

'getModuleWithDependenciesAndLibrariesScope' @ [209:24] ==> @NotNull public abstract fun getModuleWithDependenciesAndLibrariesScope(p0: Boolean): GlobalSearchScope defined in com.intellij.openapi.module.Module[JavaMethodDescriptor]

'hasKotlinFilesOnlyInTests' @ [209:67] ==> public fun hasKotlinFilesOnlyInTests(module: Module): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [209:93] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasAnyKotlinRuntimeInScope[ValueParameterDescriptorImpl]

'runReadAction' @ [210:12] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'getKotlinJvmRuntimeMarkerClass' @ [211:9] ==> public fun getKotlinJvmRuntimeMarkerClass(project: Project, scope: GlobalSearchScope): PsiClass? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'module' @ [211:40] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasAnyKotlinRuntimeInScope[ValueParameterDescriptorImpl]

'project' @ [211:47] ==> public final val Module.project: Project[MyPropertyDescriptor]

'scope' @ [211:56] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.configuration.hasAnyKotlinRuntimeInScope[LocalVariableDescriptor]

'hasKotlinJsKjsmFile' @ [212:9] ==> public fun hasKotlinJsKjsmFile(project: Project, scope: GlobalSearchScope): Boolean defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'module' @ [212:29] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasAnyKotlinRuntimeInScope[ValueParameterDescriptorImpl]

'project' @ [212:36] ==> public final val Module.project: Project[MyPropertyDescriptor]

'LibraryKindSearchScope' @ [212:45] ==> public constructor LibraryKindSearchScope(module: Module, baseScope: GlobalSearchScope, libraryKind: PersistentLibraryKind<*>) defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope[ClassConstructorDescriptorImpl]

'module' @ [212:68] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasAnyKotlinRuntimeInScope[ValueParameterDescriptorImpl]

'scope' @ [212:76] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.configuration.hasAnyKotlinRuntimeInScope[LocalVariableDescriptor]

'JSLibraryKind' @ [212:83] ==> public object JSLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework[FakeCallableDescriptorForObject]

'hasKotlinCommonRuntimeInScope' @ [213:9] ==> public fun hasKotlinCommonRuntimeInScope(scope: GlobalSearchScope): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [213:39] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.configuration.hasAnyKotlinRuntimeInScope[LocalVariableDescriptor]

'runReadAction' @ [218:12] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'module' @ [219:21] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinJvmRuntimeInScope[ValueParameterDescriptorImpl]

'getModuleWithDependenciesAndLibrariesScope' @ [219:28] ==> @NotNull public abstract fun getModuleWithDependenciesAndLibrariesScope(p0: Boolean): GlobalSearchScope defined in com.intellij.openapi.module.Module[JavaMethodDescriptor]

'hasKotlinFilesOnlyInTests' @ [219:71] ==> public fun hasKotlinFilesOnlyInTests(module: Module): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [219:97] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinJvmRuntimeInScope[ValueParameterDescriptorImpl]

'getKotlinJvmRuntimeMarkerClass' @ [220:9] ==> public fun getKotlinJvmRuntimeMarkerClass(project: Project, scope: GlobalSearchScope): PsiClass? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'module' @ [220:40] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinJvmRuntimeInScope[ValueParameterDescriptorImpl]

'project' @ [220:47] ==> public final val Module.project: Project[MyPropertyDescriptor]

'scope' @ [220:56] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.configuration.hasKotlinJvmRuntimeInScope.<anonymous>[LocalVariableDescriptor]

'runReadAction' @ [225:12] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'module' @ [226:21] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinJsRuntimeInScope[ValueParameterDescriptorImpl]

'getModuleWithDependenciesAndLibrariesScope' @ [226:28] ==> @NotNull public abstract fun getModuleWithDependenciesAndLibrariesScope(p0: Boolean): GlobalSearchScope defined in com.intellij.openapi.module.Module[JavaMethodDescriptor]

'hasKotlinFilesOnlyInTests' @ [226:71] ==> public fun hasKotlinFilesOnlyInTests(module: Module): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [226:97] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinJsRuntimeInScope[ValueParameterDescriptorImpl]

'hasKotlinJsKjsmFile' @ [227:9] ==> public fun hasKotlinJsKjsmFile(project: Project, scope: GlobalSearchScope): Boolean defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'module' @ [227:29] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinJsRuntimeInScope[ValueParameterDescriptorImpl]

'project' @ [227:36] ==> public final val Module.project: Project[MyPropertyDescriptor]

'LibraryKindSearchScope' @ [227:45] ==> public constructor LibraryKindSearchScope(module: Module, baseScope: GlobalSearchScope, libraryKind: PersistentLibraryKind<*>) defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope[ClassConstructorDescriptorImpl]

'module' @ [227:68] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinJsRuntimeInScope[ValueParameterDescriptorImpl]

'scope' @ [227:76] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.configuration.hasKotlinJsRuntimeInScope.<anonymous>[LocalVariableDescriptor]

'JSLibraryKind' @ [227:83] ==> public object JSLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework[FakeCallableDescriptorForObject]

'IDEVirtualFileFinder' @ [232:12] ==> public constructor IDEVirtualFileFinder(scope: GlobalSearchScope) defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[DeserializedClassConstructorDescriptor]

'scope' @ [232:33] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.configuration.hasKotlinCommonRuntimeInScope[ValueParameterDescriptorImpl]

'hasMetadataPackage' @ [232:40] ==> public open fun hasMetadataPackage(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.vfilefinder.IDEVirtualFileFinder[DeserializedSimpleFunctionDescriptor]

'BUILT_INS_PACKAGE_FQ_NAME' @ [232:74] ==> public final val BUILT_INS_PACKAGE_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'!' @ [236:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasKotlinFilesInSources' @ [236:13] ==> public fun hasKotlinFilesInSources(module: Module): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [236:37] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinFilesOnlyInTests[ValueParameterDescriptorImpl]

'containsFileOfType' @ [236:62] ==> public open fun containsFileOfType(@NotNull p0: FileType, @NotNull p1: GlobalSearchScope): Boolean defined in com.intellij.psi.search.FileTypeIndex[JavaMethodDescriptor]

'INSTANCE' @ [236:96] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'module' @ [236:106] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinFilesOnlyInTests[ValueParameterDescriptorImpl]

'getModuleScope' @ [236:113] ==> @NotNull public abstract fun getModuleScope(p0: Boolean): GlobalSearchScope defined in com.intellij.openapi.module.Module[JavaMethodDescriptor]

'containsFileOfType' @ [240:26] ==> public open fun containsFileOfType(@NotNull p0: FileType, @NotNull p1: GlobalSearchScope): Boolean defined in com.intellij.psi.search.FileTypeIndex[JavaMethodDescriptor]

'INSTANCE' @ [240:60] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'module' @ [240:70] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.hasKotlinFilesInSources[ValueParameterDescriptorImpl]

'getModuleScope' @ [240:77] ==> @NotNull public abstract fun getModuleScope(p0: Boolean): GlobalSearchScope defined in com.intellij.openapi.module.Module[JavaMethodDescriptor]

'version' @ [244:12] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.isSnapshot[ValueParameterDescriptorImpl]

'contains' @ [244:20] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'version' @ [248:12] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.isEap[ValueParameterDescriptorImpl]

'contains' @ [248:20] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'version' @ [248:38] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.isEap[ValueParameterDescriptorImpl]

'contains' @ [248:46] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Regex' @ [252:12] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'minorKotlinVersion' @ [252:24] ==> value-parameter minorKotlinVersion: Int defined in org.jetbrains.kotlin.idea.configuration.useEapRepository[ValueParameterDescriptorImpl]

'matches' @ [252:76] ==> public final infix fun matches(input: CharSequence): Boolean defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'version' @ [252:84] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.useEapRepository[ValueParameterDescriptorImpl]

'!' @ [253:12] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'version' @ [253:13] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.configuration.useEapRepository[ValueParameterDescriptorImpl]

'startsWith' @ [253:21] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'minorKotlinVersion' @ [253:36] ==> value-parameter minorKotlinVersion: Int defined in org.jetbrains.kotlin.idea.configuration.useEapRepository[ValueParameterDescriptorImpl]

'DelegatingGlobalSearchScope' @ [259:5] ==> public constructor DelegatingGlobalSearchScope(@NotNull p0: GlobalSearchScope) defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaClassConstructorDescriptor]

'baseScope' @ [259:33] ==> value-parameter baseScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope.<init>[ValueParameterDescriptorImpl]

'!' @ [261:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [261:14] ==> <this> defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope[LazyClassReceiverParameterDescriptor]

'contains' @ [261:20] ==> public open fun contains(@NotNull p0: VirtualFile): Boolean defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaMethodDescriptor]

'file' @ [261:29] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope.contains[ValueParameterDescriptorImpl]

'getInstance' @ [262:44] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [262:56] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope[PropertyDescriptorImpl]

'fileIndex' @ [262:64] ==> public final val ModuleRootManager.fileIndex: ModuleFileIndex[MyPropertyDescriptor]

'getOrderEntryForFile' @ [262:74] ==> @Nullable public abstract fun getOrderEntryForFile(@NotNull p0: VirtualFile): OrderEntry? defined in com.intellij.openapi.roots.ModuleFileIndex[JavaMethodDescriptor]

'file' @ [262:95] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope.contains[ValueParameterDescriptorImpl]

'orderEntry' @ [263:13] ==> val orderEntry: OrderEntry? defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope.contains[LocalVariableDescriptor]

'==' @ [264:20] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.roots.libraries.PersistentLibraryKind[DeserializedSimpleFunctionDescriptor]

'orderEntry' @ [264:21] ==> val orderEntry: OrderEntry? defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope.contains[LocalVariableDescriptor]

'library' @ [264:32] ==> public final val LibraryOrderEntry.library: Library?[MyPropertyDescriptor]

'kind' @ [264:54] ==> public final val LibraryEx.kind: PersistentLibraryKind<*>?[MyPropertyDescriptor]

'libraryKind' @ [264:62] ==> public final val libraryKind: PersistentLibraryKind<*> defined in org.jetbrains.kotlin.idea.configuration.LibraryKindSearchScope[PropertyDescriptorImpl]

