'EditorNotifications.Provider<EditorNotificationPanel>' @ [50:47] ==> public constructor Provider<T : (JComponent..JComponent?)>() defined in com.intellij.ui.EditorNotifications.Provider[JavaClassConstructorDescriptor]
Inferred types:
    <T : (JComponent..JComponent?)> -> EditorNotificationPanel

'myProject' @ [53:9] ==> private final val myProject: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider[PropertyDescriptorImpl]

'messageBus' @ [53:19] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [53:30] ==> @NotNull public abstract fun connect(@NotNull p0: Disposable): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'myProject' @ [53:38] ==> private final val myProject: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider[PropertyDescriptorImpl]

'subscribe' @ [53:49] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(ModuleRootListener..ModuleRootListener?)>, @NotNull p1: ModuleRootListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> ModuleRootListener

'PROJECT_ROOTS' @ [53:73] ==> public final val PROJECT_ROOTS: (Topic<(ModuleRootListener..ModuleRootListener?)>..Topic<(ModuleRootListener..ModuleRootListener?)>?) defined in com.intellij.ProjectTopics[JavaPropertyDescriptor]

'ModuleRootAdapter' @ [53:97] ==> public constructor ModuleRootAdapter() defined in com.intellij.openapi.roots.ModuleRootAdapter[JavaClassConstructorDescriptor]

'notifications' @ [55:17] ==> value-parameter notifications: EditorNotifications defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.<init>[ValueParameterDescriptorImpl]

'updateAllNotifications' @ [55:31] ==> public abstract fun updateAllNotifications(): Unit defined in com.intellij.ui.EditorNotifications[JavaMethodDescriptor]

'KEY' @ [60:59] ==> private final val KEY: Key<(EditorNotificationPanel..EditorNotificationPanel?)> defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion[PropertyDescriptorImpl]

'file' @ [63:13] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[ValueParameterDescriptorImpl]

'fileType' @ [63:18] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [63:45] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'?:' @ [67:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiFile?, right: PsiFile): PsiFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiFile

'getInstance' @ [67:34] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'myProject' @ [67:46] ==> private final val myProject: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider[PropertyDescriptorImpl]

'findFile' @ [67:57] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'file' @ [67:66] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[ValueParameterDescriptorImpl]

'psiFile' @ [68:13] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[LocalVariableDescriptor]

'language' @ [68:21] ==> public final val PsiFile.language: Language[MyPropertyDescriptor]

'INSTANCE' @ [68:49] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'?:' @ [72:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [72:37] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'psiFile' @ [72:61] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[LocalVariableDescriptor]

'!' @ [73:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [73:32] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [73:44] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[LocalVariableDescriptor]

'fileIndex' @ [73:52] ==> public final val ModuleRootManager.fileIndex: ModuleFileIndex[MyPropertyDescriptor]

'isInSourceContent' @ [73:62] ==> public abstract fun isInSourceContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ModuleFileIndex[JavaMethodDescriptor]

'file' @ [73:80] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[ValueParameterDescriptorImpl]

'==' @ [77:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.projectRoots.Sdk[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [77:31] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [77:43] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[LocalVariableDescriptor]

'sdk' @ [77:51] ==> public final val ModuleRootManager.sdk: Sdk?[MyPropertyDescriptor]

'createSetupSdkPanel' @ [78:20] ==> private final fun createSetupSdkPanel(project: Project, file: PsiFile): EditorNotificationPanel defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion[SimpleFunctionDescriptorImpl]

'myProject' @ [78:40] ==> private final val myProject: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider[PropertyDescriptorImpl]

'psiFile' @ [78:51] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[LocalVariableDescriptor]

'!' @ [81:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinConfigurationCheckerComponent' @ [81:14] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[FakeCallableDescriptorForObject]

'getInstance' @ [81:50] ==> public final fun getInstance(project: Project): KotlinConfigurationCheckerComponent defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent.Companion[SimpleFunctionDescriptorImpl]

'module' @ [81:62] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[LocalVariableDescriptor]

'project' @ [81:69] ==> public final val Module.project: Project[MyPropertyDescriptor]

'isSyncing' @ [81:78] ==> public final val isSyncing: Boolean defined in org.jetbrains.kotlin.idea.configuration.ui.KotlinConfigurationCheckerComponent[PropertyDescriptorImpl]

'!' @ [82:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAnyKotlinRuntimeInScope' @ [82:14] ==> public fun hasAnyKotlinRuntimeInScope(module: Module): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [82:41] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[LocalVariableDescriptor]

'UnsupportedAbiVersionNotificationPanelProvider' @ [83:13] ==> public companion object defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[FakeCallableDescriptorForObject]

'collectBadRoots' @ [83:60] ==> public final fun collectBadRoots(module: Module): Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion[SimpleFunctionDescriptorImpl]

'module' @ [83:76] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[LocalVariableDescriptor]

'isEmpty' @ [83:84] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'createKotlinNotConfiguredPanel' @ [84:20] ==> private final fun createKotlinNotConfiguredPanel(module: Module): EditorNotificationPanel defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion[SimpleFunctionDescriptorImpl]

'module' @ [84:51] ==> val module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.createNotificationPanel[LocalVariableDescriptor]

'create' @ [91:31] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(EditorNotificationPanel..EditorNotificationPanel?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> EditorNotificationPanel

'EditorNotificationPanel' @ [94:20] ==> public constructor EditorNotificationPanel() defined in com.intellij.ui.EditorNotificationPanel[JavaClassConstructorDescriptor]

'apply' @ [94:46] ==> @InlineOnly public inline fun <T> EditorNotificationPanel.apply(block: EditorNotificationPanel.() -> Unit): EditorNotificationPanel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EditorNotificationPanel

'setText' @ [95:17] ==> public open fun setText(p0: (String..String?)): Unit defined in com.intellij.ui.EditorNotificationPanel[JavaMethodDescriptor]

'message' @ [95:39] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.openapi.project.ProjectBundle[JavaMethodDescriptor]

'createActionLabel' @ [96:17] ==> public final fun createActionLabel(p0: (String..String?), p1: (() -> Unit..(() -> Unit)?)): (HyperlinkLabel..HyperlinkLabel?) defined in com.intellij.ui.EditorNotificationPanel[MyFunctionDescriptor]

'message' @ [96:49] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.openapi.project.ProjectBundle[JavaMethodDescriptor]

'?:' @ [97:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Sdk?, right: Sdk): Sdk[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Sdk

'getInstance' @ [97:44] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectSettingsService..ProjectSettingsService?) defined in com.intellij.openapi.roots.ui.configuration.ProjectSettingsService[JavaMethodDescriptor]

'project' @ [97:56] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createSetupSdkPanel[ValueParameterDescriptorImpl]

'chooseAndSetSdk' @ [97:65] ==> public open fun chooseAndSetSdk(): (Sdk..Sdk?) defined in com.intellij.openapi.roots.ui.configuration.ProjectSettingsService[JavaMethodDescriptor]

'runWriteAction' @ [99:21] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'findModuleForPsiElement' @ [100:53] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'file' @ [100:77] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createSetupSdkPanel[ValueParameterDescriptorImpl]

'module' @ [101:29] ==> val module: Module? defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createSetupSdkPanel.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'setSdkInherited' @ [102:56] ==> public open fun setSdkInherited(@NotNull p0: Module): Unit defined in com.intellij.openapi.roots.ModuleRootModificationUtil[JavaMethodDescriptor]

'module' @ [102:72] ==> val module: Module? defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createSetupSdkPanel.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'EditorNotificationPanel' @ [110:20] ==> public constructor EditorNotificationPanel() defined in com.intellij.ui.EditorNotificationPanel[JavaClassConstructorDescriptor]

'apply' @ [110:46] ==> @InlineOnly public inline fun <T> EditorNotificationPanel.apply(block: EditorNotificationPanel.() -> Unit): EditorNotificationPanel defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EditorNotificationPanel

'setText' @ [111:17] ==> public open fun setText(p0: (String..String?)): Unit defined in com.intellij.ui.EditorNotificationPanel[JavaMethodDescriptor]

'getAbleToRunConfigurators' @ [112:37] ==> public fun getAbleToRunConfigurators(module: Module): Collection<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'module' @ [112:63] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel[ValueParameterDescriptorImpl]

'toList' @ [112:71] ==> public fun <T> Iterable<KotlinProjectConfigurator>.toList(): List<KotlinProjectConfigurator> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinProjectConfigurator

'!' @ [113:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configurators' @ [113:22] ==> val configurators: List<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [113:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'createComponentActionLabel' @ [114:21] ==> public fun EditorNotificationPanel.createComponentActionLabel(labelText: String, callback: (HyperlinkLabel) -> Unit): Unit defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'configurators' @ [115:50] ==> val configurators: List<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel.<anonymous>[LocalVariableDescriptor]

'singleOrNull' @ [115:64] ==> public fun <T> List<KotlinProjectConfigurator>.singleOrNull(): KotlinProjectConfigurator? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinProjectConfigurator

'if (singleConfigurator != null) {
                            singleConfigurator.apply(module.project)
                        }
                        else {
                            val configuratorsPopup = createConfiguratorsPopup(module.project, configurators)
                            configuratorsPopup.showUnderneathOf(label)
                        }' @ [116:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'singleConfigurator' @ [116:29] ==> val singleConfigurator: KotlinProjectConfigurator? defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel.<anonymous>.<anonymous>[LocalVariableDescriptor]

'singleConfigurator' @ [117:29] ==> val singleConfigurator: KotlinProjectConfigurator? defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel.<anonymous>.<anonymous>[LocalVariableDescriptor]

'apply' @ [117:48] ==> private final fun KotlinProjectConfigurator.apply(project: Project): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion[SimpleFunctionDescriptorImpl]

'module' @ [117:54] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel[ValueParameterDescriptorImpl]

'project' @ [117:61] ==> public final val Module.project: Project[MyPropertyDescriptor]

'createConfiguratorsPopup' @ [120:54] ==> public final fun createConfiguratorsPopup(project: Project, configurators: List<KotlinProjectConfigurator>): ListPopup defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion[SimpleFunctionDescriptorImpl]

'module' @ [120:79] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel[ValueParameterDescriptorImpl]

'project' @ [120:86] ==> public final val Module.project: Project[MyPropertyDescriptor]

'configurators' @ [120:95] ==> val configurators: List<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel.<anonymous>[LocalVariableDescriptor]

'configuratorsPopup' @ [121:29] ==> val configuratorsPopup: ListPopup defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel.<anonymous>.<anonymous>[LocalVariableDescriptor]

'showUnderneathOf' @ [121:48] ==> public abstract fun showUnderneathOf(@NotNull p0: Component): Unit defined in com.intellij.openapi.ui.popup.ListPopup[JavaMethodDescriptor]

'label' @ [121:65] ==> value-parameter label: HyperlinkLabel defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createKotlinNotConfiguredPanel.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'configure' @ [129:13] ==> @JvmSuppressWildcards public abstract fun configure(project: Project, excludeModules: Collection<Module>): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[SimpleFunctionDescriptorImpl]

'project' @ [129:23] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.apply[ValueParameterDescriptorImpl]

'emptyList' @ [129:32] ==> public fun <T> emptyList(): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'getInstance' @ [130:33] ==> public open fun getInstance(p0: (Project..Project?)): (EditorNotifications..EditorNotifications?) defined in com.intellij.ui.EditorNotifications[JavaMethodDescriptor]

'project' @ [130:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.apply[ValueParameterDescriptorImpl]

'updateAllNotifications' @ [130:54] ==> public abstract fun updateAllNotifications(): Unit defined in com.intellij.ui.EditorNotifications[JavaMethodDescriptor]

'checkHideNonConfiguredNotifications' @ [131:13] ==> public fun checkHideNonConfiguredNotifications(project: Project): Unit defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinNotificationManager.kt[SimpleFunctionDescriptorImpl]

'project' @ [131:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.apply[ValueParameterDescriptorImpl]

'BaseListPopupStep<KotlinProjectConfigurator>' @ [135:33] ==> public constructor BaseListPopupStep<T : (Any..Any?)>(@Nullable p0: String?, p1: (MutableList<out (KotlinProjectConfigurator..KotlinProjectConfigurator?)>..List<(KotlinProjectConfigurator..KotlinProjectConfigurator?)>?)) defined in com.intellij.openapi.ui.popup.util.BaseListPopupStep[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinProjectConfigurator

'configurators' @ [135:101] ==> value-parameter configurators: List<KotlinProjectConfigurator> defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createConfiguratorsPopup[ValueParameterDescriptorImpl]

'value' @ [136:78] ==> value-parameter value: KotlinProjectConfigurator? defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createConfiguratorsPopup.<no name provided>.getTextFor[ValueParameterDescriptorImpl]

'presentableText' @ [136:85] ==> public abstract val presentableText: String defined in org.jetbrains.kotlin.idea.configuration.KotlinProjectConfigurator[PropertyDescriptorImpl]

'doFinalStep' @ [139:28] ==> public final fun doFinalStep(p0: (() -> Unit..(() -> Unit)?)): raw (PopupStep<(Any..Any?)>..PopupStep<*>?) defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createConfiguratorsPopup.<no name provided>[MyFunctionDescriptor]

'selectedValue' @ [140:25] ==> value-parameter selectedValue: KotlinProjectConfigurator? defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createConfiguratorsPopup.<no name provided>.onChosen[ValueParameterDescriptorImpl]

'apply' @ [140:40] ==> private final fun KotlinProjectConfigurator.apply(project: Project): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion[SimpleFunctionDescriptorImpl]

'project' @ [140:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createConfiguratorsPopup[ValueParameterDescriptorImpl]

'getInstance' @ [144:35] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopup' @ [144:49] ==> @NotNull public abstract fun createListPopup(@NotNull p0: raw (ListPopupStep<(Any..Any?)>..ListPopupStep<*>)): ListPopup defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'step' @ [144:65] ==> val step: <no name provided> defined in org.jetbrains.kotlin.idea.configuration.KotlinSetupEnvironmentNotificationProvider.Companion.createConfiguratorsPopup[LocalVariableDescriptor]

