'AnAction' @ [30:49] ==> public constructor AnAction() defined in com.intellij.openapi.actionSystem.AnAction[JavaClassConstructorDescriptor]

'e' @ [35:23] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[ValueParameterDescriptorImpl]

'project' @ [35:25] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'getConfigurableModules' @ [37:23] ==> public fun getConfigurableModules(project: Project): List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [37:46] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'modules' @ [38:13] ==> val modules: List<ModuleSourceRootGroup> defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'all' @ [38:21] ==> public inline fun <T> Iterable<ModuleSourceRootGroup>.all(predicate: (ModuleSourceRootGroup) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceRootGroup

'showInfoMessage' @ [39:22] ==> public open fun showInfoMessage(p0: (String..String?), @NotNull @Nls p1: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'e' @ [39:86] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[ValueParameterDescriptorImpl]

'presentation' @ [39:88] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'text' @ [39:101] ==> public final var Presentation.text: String?[MyPropertyDescriptor]

'getApplicableConfigurators' @ [43:29] ==> public abstract fun getApplicableConfigurators(project: Project): Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction[SimpleFunctionDescriptorImpl]

'project' @ [43:56] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'when {
            configurators.size == 1 -> configurators.first().configure(project, emptyList())
            configurators.isEmpty() -> Messages.showErrorDialog("There aren't configurators available", e.presentation.text!!)
            else -> {
                val configuratorsPopup = KotlinSetupEnvironmentNotificationProvider.createConfiguratorsPopup(project, configurators.toList())
                configuratorsPopup.showInBestPositionFor(e.dataContext)
            }
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'configurators' @ [46:13] ==> val configurators: Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'size' @ [46:27] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'configurators' @ [46:40] ==> val configurators: Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'first' @ [46:54] ==> public fun <T> Iterable<KotlinProjectConfigurator>.first(): KotlinProjectConfigurator defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinProjectConfigurator

'configure' @ [46:62] ==> @JvmSuppressWildcards public abstract fun configure(project: Project, excludeModules: Collection<Module>): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [46:72] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'emptyList' @ [46:81] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'configurators' @ [47:13] ==> val configurators: Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'isEmpty' @ [47:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'showErrorDialog' @ [47:49] ==> public open fun showErrorDialog(p0: (String..String?), @NotNull @Nls p1: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'e' @ [47:105] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[ValueParameterDescriptorImpl]

'presentation' @ [47:107] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'text' @ [47:120] ==> public final var Presentation.text: String?[MyPropertyDescriptor]

'KotlinSetupEnvironmentNotificationProvider' @ [49:42] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider[FakeCallableDescriptorForObject]

'createConfiguratorsPopup' @ [49:85] ==> public final fun createConfiguratorsPopup(project: Project, configurators: List<KotlinProjectConfigurator>): ListPopup defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion[SimpleFunctionDescriptorImpl]

'project' @ [49:110] ==> val project: Project defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'configurators' @ [49:119] ==> val configurators: Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'toList' @ [49:133] ==> public fun <T> Iterable<KotlinProjectConfigurator>.toList(): List<KotlinProjectConfigurator> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinProjectConfigurator

'configuratorsPopup' @ [50:17] ==> val configuratorsPopup: ListPopup defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[LocalVariableDescriptor]

'showInBestPositionFor' @ [50:36] ==> public abstract fun showInBestPositionFor(@NotNull p0: DataContext): Unit defined in com.intellij.openapi.ui.popup.ListPopup[JavaMethodDescriptor]

'e' @ [50:58] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction.actionPerformed[ValueParameterDescriptorImpl]

'dataContext' @ [50:60] ==> public final val AnActionEvent.dataContext: DataContext[MyPropertyDescriptor]

'ConfigureKotlinInProjectAction' @ [56:41] ==> public constructor ConfigureKotlinInProjectAction() defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction[ClassConstructorDescriptorImpl]

'getAbleToRunConfigurators' @ [57:65] ==> public fun getAbleToRunConfigurators(project: Project): Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [57:91] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinJsInProjectAction.getApplicableConfigurators[ValueParameterDescriptorImpl]

'filter' @ [57:100] ==> public inline fun <T> Iterable<KotlinProjectConfigurator>.filter(predicate: (KotlinProjectConfigurator) -> Boolean): List<KotlinProjectConfigurator> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinProjectConfigurator

'it' @ [58:9] ==> value-parameter it: KotlinProjectConfigurator defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinJsInProjectAction.getApplicableConfigurators.<anonymous>[ValueParameterDescriptorImpl]

'targetPlatform' @ [58:12] ==> public abstract val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[PropertyDescriptorImpl]

'JsPlatform' @ [58:30] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve[FakeCallableDescriptorForObject]

'e' @ [62:23] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinJsInProjectAction.update[ValueParameterDescriptorImpl]

'project' @ [62:25] ==> public final val AnActionEvent.project: Project?[MyPropertyDescriptor]

'!' @ [63:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isIntelliJ' @ [63:28] ==> public open fun isIntelliJ(): Boolean defined in com.intellij.util.PlatformUtils[JavaMethodDescriptor]

'project' @ [63:45] ==> val project: Project? defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinJsInProjectAction.update[LocalVariableDescriptor]

'project' @ [63:64] ==> val project: Project? defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinJsInProjectAction.update[LocalVariableDescriptor]

'allModules' @ [63:72] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[SimpleFunctionDescriptorImpl]

'all' @ [63:85] ==> public inline fun <T> Iterable<(Module..Module?)>.all(predicate: ((Module..Module?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'KotlinPluginUtil' @ [63:89] ==> public constructor KotlinPluginUtil() defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaClassConstructorDescriptor]

'e' @ [64:13] ==> value-parameter e: AnActionEvent defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinJsInProjectAction.update[ValueParameterDescriptorImpl]

'presentation' @ [64:15] ==> public final val AnActionEvent.presentation: Presentation[MyPropertyDescriptor]

'isEnabledAndVisible' @ [64:28] ==> public final var Presentation.isEnabledAndVisible: Boolean[MyPropertyDescriptor]

'ConfigureKotlinInProjectAction' @ [69:43] ==> public constructor ConfigureKotlinInProjectAction() defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinInProjectAction[ClassConstructorDescriptorImpl]

'getAbleToRunConfigurators' @ [70:65] ==> public fun getAbleToRunConfigurators(project: Project): Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [70:91] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinJavaInProjectAction.getApplicableConfigurators[ValueParameterDescriptorImpl]

'filter' @ [70:100] ==> public inline fun <T> Iterable<KotlinProjectConfigurator>.filter(predicate: (KotlinProjectConfigurator) -> Boolean): List<KotlinProjectConfigurator> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinProjectConfigurator

'it' @ [71:9] ==> value-parameter it: KotlinProjectConfigurator defined in org.jetbrains.kotlin.idea.actions.ConfigureKotlinJavaInProjectAction.getApplicableConfigurators.<anonymous>[ValueParameterDescriptorImpl]

'targetPlatform' @ [71:12] ==> public abstract val targetPlatform: TargetPlatform defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[PropertyDescriptorImpl]

