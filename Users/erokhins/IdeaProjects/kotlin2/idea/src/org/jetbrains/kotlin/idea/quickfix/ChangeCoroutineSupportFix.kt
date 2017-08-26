'KotlinQuickFixAction<PsiElement>' @ [50:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> PsiElement

'element' @ [50:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.<init>[ValueParameterDescriptorImpl]

'coroutineSupport' @ [52:21] ==> protected final val coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix[PropertyDescriptorImpl]

'ENABLED' @ [52:63] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'coroutineSupport' @ [52:74] ==> protected final val coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix[PropertyDescriptorImpl]

'ENABLED_WITH_WARNING' @ [52:116] ==> enum entry ENABLED_WITH_WARNING defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'ChangeCoroutineSupportFix' @ [54:84] ==> private constructor ChangeCoroutineSupportFix(element: PsiElement, coroutineSupport: LanguageFeature.State) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix[ClassConstructorDescriptorImpl]

'element' @ [54:110] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.<init>[ValueParameterDescriptorImpl]

'coroutineSupport' @ [54:119] ==> value-parameter coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.<init>[ValueParameterDescriptorImpl]

'super' @ [55:37] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule[LazyClassReceiverParameterDescriptor]

'getText' @ [55:43] ==> public open fun getText(): String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix[SimpleFunctionDescriptorImpl]

'?:' @ [58:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [58:41] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'file' @ [58:65] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[ValueParameterDescriptorImpl]

'coroutineSupportEnabled' @ [60:41] ==> protected final val coroutineSupportEnabled: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule[PropertyDescriptorImpl]

'getRuntimeLibraryVersion' @ [61:42] ==> public fun getRuntimeLibraryVersion(module: Module): String? defined in org.jetbrains.kotlin.idea.facet[DeserializedSimpleFunctionDescriptor]

'module' @ [61:67] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'startsWith' @ [61:76] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isGradleModule' @ [63:34] ==> public open fun isGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [63:49] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'isMavenModule' @ [63:77] ==> public open fun isMavenModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [63:91] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'runtimeUpdateRequired' @ [64:21] ==> val runtimeUpdateRequired: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'showErrorDialog' @ [65:30] ==> public open fun showErrorDialog(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [65:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[ValueParameterDescriptorImpl]

'+' @ [66:46] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'super' @ [68:46] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule[LazyClassReceiverParameterDescriptor]

'getText' @ [68:52] ==> public open fun getText(): String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix[SimpleFunctionDescriptorImpl]

'if (KotlinPluginUtil.isGradleModule(module))
                    KotlinWithGradleConfigurator.changeCoroutineConfiguration(
                        module, CoroutineSupport.getCompilerArgument(coroutineSupport)
                    )
                else
                    changeMavenCoroutineConfiguration(module, CoroutineSupport.getCompilerArgument(coroutineSupport))' @ [72:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'isGradleModule' @ [72:52] ==> public open fun isGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [72:67] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'changeCoroutineConfiguration' @ [73:50] ==> public final fun changeCoroutineConfiguration(module: Module, coroutineOption: String): PsiElement? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithGradleConfigurator.Companion[SimpleFunctionDescriptorImpl]

'module' @ [74:25] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'getCompilerArgument' @ [74:50] ==> public final fun getCompilerArgument(state: LanguageFeature.State): String defined in org.jetbrains.kotlin.config.CoroutineSupport[DeserializedSimpleFunctionDescriptor]

'coroutineSupport' @ [74:70] ==> protected final val coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule[PropertyDescriptorImpl]

'changeMavenCoroutineConfiguration' @ [77:21] ==> private final fun changeMavenCoroutineConfiguration(module: Module, value: String): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule[SimpleFunctionDescriptorImpl]

'module' @ [77:55] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'getCompilerArgument' @ [77:80] ==> public final fun getCompilerArgument(state: LanguageFeature.State): String defined in org.jetbrains.kotlin.config.CoroutineSupport[DeserializedSimpleFunctionDescriptor]

'coroutineSupport' @ [77:100] ==> protected final val coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule[PropertyDescriptorImpl]

'element' @ [79:21] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'OpenFileDescriptor' @ [80:21] ==> public constructor OpenFileDescriptor(@NotNull p0: Project, @NotNull p1: VirtualFile, p2: Int) defined in com.intellij.openapi.fileEditor.OpenFileDescriptor[JavaClassConstructorDescriptor]

'project' @ [80:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[ValueParameterDescriptorImpl]

'element' @ [80:49] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'containingFile' @ [80:57] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [80:72] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'element' @ [80:85] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'textRange' @ [80:93] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [80:103] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'navigate' @ [80:116] ==> public open fun navigate(p0: Boolean): Unit defined in com.intellij.openapi.fileEditor.OpenFileDescriptor[JavaMethodDescriptor]

'runtimeUpdateRequired' @ [85:17] ==> val runtimeUpdateRequired: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'!' @ [85:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'askUpdateRuntime' @ [85:43] ==> public fun askUpdateRuntime(module: Module, requiredVersion: ApiVersion): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file EnableUnsupportedFeatureFix.kt[SimpleFunctionDescriptorImpl]

'module' @ [85:60] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'sinceApiVersion' @ [85:95] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'KotlinFacetSettingsProvider' @ [89:33] ==> public companion object defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[FakeCallableDescriptorForObject]

'getInstance' @ [89:61] ==> public final fun getInstance(project: Project): KotlinFacetSettingsProvider defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [89:73] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[ValueParameterDescriptorImpl]

'getInitializedSettings' @ [89:82] ==> public abstract fun getInitializedSettings(module: Module): KotlinFacetSettings defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[DeserializedSimpleFunctionDescriptor]

'module' @ [89:105] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'updateModel' @ [90:40] ==> public final fun updateModel(@NotNull p0: Module, @NotNull p1: ((ModifiableRootModel..ModifiableRootModel?)) -> Unit): Unit defined in com.intellij.openapi.roots.ModuleRootModificationUtil[SamAdapterFunctionDescriptor]

'module' @ [90:52] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'facetSettings' @ [91:17] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'coroutineSupport' @ [91:31] ==> public final var coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'coroutineSupport' @ [91:50] ==> protected final val coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule[PropertyDescriptorImpl]

'facetSettings' @ [92:17] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'apiLevel' @ [92:31] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'LanguageVersion' @ [92:42] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'KOTLIN_1_1' @ [92:58] ==> enum entry KOTLIN_1_1 defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'facetSettings' @ [93:17] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.invoke[LocalVariableDescriptor]

'languageLevel' @ [93:31] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'LanguageVersion' @ [93:47] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'KOTLIN_1_1' @ [93:63] ==> enum entry KOTLIN_1_1 defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'KotlinMavenConfigurator' @ [99:27] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'findModulePomFile' @ [99:51] ==> public final fun findModulePomFile(module: Module): PsiFile? defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[SimpleFunctionDescriptorImpl]

'module' @ [99:69] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.changeMavenCoroutineConfiguration[ValueParameterDescriptorImpl]

'?:' @ [100:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PomFile?, right: PomFile): PomFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PomFile

'forFileOrNull' @ [100:35] ==> public final fun forFileOrNull(xmlFile: XmlFile): PomFile? defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'psi' @ [100:49] ==> val psi: XmlFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.changeMavenCoroutineConfiguration.doChangeMavenCoroutineConfiguration[LocalVariableDescriptor]

'pom' @ [101:24] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.changeMavenCoroutineConfiguration.doChangeMavenCoroutineConfiguration[LocalVariableDescriptor]

'changeCoroutineConfiguration' @ [101:28] ==> public fun PomFile.changeCoroutineConfiguration(value: String): PsiElement? defined in org.jetbrains.kotlin.idea.maven in file PomFile.kt[SimpleFunctionDescriptorImpl]

'value' @ [101:57] ==> value-parameter value: String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.changeMavenCoroutineConfiguration[ValueParameterDescriptorImpl]

'doChangeMavenCoroutineConfiguration' @ [104:27] ==> local final fun doChangeMavenCoroutineConfiguration(): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.changeMavenCoroutineConfiguration[SimpleFunctionDescriptorImpl]

'element' @ [105:17] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.changeMavenCoroutineConfiguration[LocalVariableDescriptor]

'showErrorDialog' @ [106:26] ==> public open fun showErrorDialog(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'module' @ [106:42] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.changeMavenCoroutineConfiguration[ValueParameterDescriptorImpl]

'project' @ [106:49] ==> public final val Module.project: Project[MyPropertyDescriptor]

'text' @ [108:42] ==> public final val ChangeCoroutineSupportFix.InModule.text: String[MyPropertyDescriptor]

'element' @ [110:20] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule.changeMavenCoroutineConfiguration[LocalVariableDescriptor]

'ChangeCoroutineSupportFix' @ [115:85] ==> private constructor ChangeCoroutineSupportFix(element: PsiElement, coroutineSupport: LanguageFeature.State) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix[ClassConstructorDescriptorImpl]

'element' @ [115:111] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InProject.<init>[ValueParameterDescriptorImpl]

'coroutineSupport' @ [115:120] ==> value-parameter coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InProject.<init>[ValueParameterDescriptorImpl]

'super' @ [116:37] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InProject[LazyClassReceiverParameterDescriptor]

'getText' @ [116:43] ==> public open fun getText(): String defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix[SimpleFunctionDescriptorImpl]

'coroutineSupportEnabled' @ [119:17] ==> protected final val coroutineSupportEnabled: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InProject[PropertyDescriptorImpl]

'!' @ [120:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkUpdateRuntime' @ [120:22] ==> public fun checkUpdateRuntime(project: Project, requiredVersion: ApiVersion): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file EnableUnsupportedFeatureFix.kt[SimpleFunctionDescriptorImpl]

'project' @ [120:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InProject.invoke[ValueParameterDescriptorImpl]

'sinceApiVersion' @ [120:77] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'KotlinCommonCompilerArgumentsHolder' @ [123:13] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [123:49] ==> public final fun getInstance(project: Project): KotlinCommonCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [123:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InProject.invoke[ValueParameterDescriptorImpl]

'update' @ [123:70] ==> public final fun update(changer: CommonCompilerArguments.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[DeserializedSimpleFunctionDescriptor]

'coroutinesState' @ [124:17] ==> @Argument public final var coroutinesState: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'when (coroutineSupport) {
                    LanguageFeature.State.ENABLED -> CommonCompilerArguments.ENABLE
                    LanguageFeature.State.ENABLED_WITH_WARNING -> CommonCompilerArguments.WARN
                    LanguageFeature.State.ENABLED_WITH_ERROR, LanguageFeature.State.DISABLED -> CommonCompilerArguments.ERROR
                }' @ [124:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'coroutineSupport' @ [124:41] ==> protected final val coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InProject[PropertyDescriptorImpl]

'LanguageFeature' @ [125:21] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED' @ [125:43] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'ENABLE' @ [125:78] ==> public const final val ENABLE: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'LanguageFeature' @ [126:21] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_WARNING' @ [126:43] ==> enum entry ENABLED_WITH_WARNING defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'WARN' @ [126:91] ==> public const final val WARN: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'LanguageFeature' @ [127:21] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_ERROR' @ [127:43] ==> enum entry ENABLED_WITH_ERROR defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [127:63] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'DISABLED' @ [127:85] ==> enum entry DISABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'ERROR' @ [127:121] ==> public const final val ERROR: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'getInstanceEx' @ [130:34] ==> public open fun getInstanceEx(p0: (Project..Project?)): (ProjectRootManagerEx..ProjectRootManagerEx?) defined in com.intellij.openapi.roots.ex.ProjectRootManagerEx[JavaMethodDescriptor]

'project' @ [130:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InProject.invoke[ValueParameterDescriptorImpl]

'makeRootsChange' @ [130:57] ==> public final fun makeRootsChange(@NotNull p0: () -> Unit, p1: Boolean, p2: Boolean): Unit defined in com.intellij.openapi.roots.ex.ProjectRootManagerEx[MyFunctionDescriptor]

'when (coroutineSupport) {
            LanguageFeature.State.ENABLED -> "Enable coroutine support"
            LanguageFeature.State.ENABLED_WITH_WARNING -> "Enable coroutine support (with warning)"
            LanguageFeature.State.ENABLED_WITH_ERROR, LanguageFeature.State.DISABLED -> "Disable coroutine support"
        }' @ [138:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'coroutineSupport' @ [138:22] ==> protected final val coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix[PropertyDescriptorImpl]

'LanguageFeature' @ [139:13] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED' @ [139:35] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [140:13] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_WARNING' @ [140:35] ==> enum entry ENABLED_WITH_WARNING defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [141:13] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_ERROR' @ [141:35] ==> enum entry ENABLED_WITH_ERROR defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [141:55] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'DISABLED' @ [141:77] ==> enum entry DISABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'KotlinIntentionActionsFactory' @ [145:24] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'when (diagnostic.factory) {
                Errors.EXPERIMENTAL_FEATURE_ERROR -> {
                    if (Errors.EXPERIMENTAL_FEATURE_ERROR.cast(diagnostic).a.first != LanguageFeature.Coroutines) return emptyList()
                    listOf(LanguageFeature.State.ENABLED_WITH_WARNING, LanguageFeature.State.ENABLED)
                }
                Errors.EXPERIMENTAL_FEATURE_WARNING -> {
                    if (Errors.EXPERIMENTAL_FEATURE_WARNING.cast(diagnostic).a.first != LanguageFeature.Coroutines) return emptyList()
                    listOf(LanguageFeature.State.ENABLED, LanguageFeature.State.ENABLED_WITH_ERROR)
                }
                else -> return emptyList()
            }' @ [147:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<LanguageFeature.State>, entry1: List<LanguageFeature.State>, entry2: List<LanguageFeature.State>): List<LanguageFeature.State>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<State>

'diagnostic' @ [147:46] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[ValueParameterDescriptorImpl]

'factory' @ [147:57] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'EXPERIMENTAL_FEATURE_ERROR' @ [148:24] ==> public final val EXPERIMENTAL_FEATURE_ERROR: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'!=' @ [149:25] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedSimpleFunctionDescriptor]

'EXPERIMENTAL_FEATURE_ERROR' @ [149:32] ==> public final val EXPERIMENTAL_FEATURE_ERROR: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [149:59] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [149:64] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[ValueParameterDescriptorImpl]

'a' @ [149:76] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>.a: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Pair<(org.jetbrains.kotlin.config.LanguageFeature..org.jetbrains.kotlin.config.LanguageFeature?), (org.jetbrains.kotlin.config.LanguageVersionSettings..org.jetbrains.kotlin.config.LanguageVersionSettings?)>..kotlin.Pair<(org.jetbrains.kotlin.config.LanguageFeature..org.jetbrains.kotlin.config.LanguageFeature?), (org.jetbrains.kotlin.config.LanguageVersionSettings..org.jetbrains.kotlin.config.LanguageVersionSettings?)>?)

'first' @ [149:78] ==> public final val first: (LanguageFeature..LanguageFeature?) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Coroutines' @ [149:103] ==> enum entry Coroutines defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'emptyList' @ [149:122] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'listOf' @ [150:21] ==> public fun <T> listOf(vararg elements: LanguageFeature.State): List<LanguageFeature.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'ENABLED_WITH_WARNING' @ [150:50] ==> enum entry ENABLED_WITH_WARNING defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'ENABLED' @ [150:94] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'EXPERIMENTAL_FEATURE_WARNING' @ [152:24] ==> public final val EXPERIMENTAL_FEATURE_WARNING: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'!=' @ [153:25] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedSimpleFunctionDescriptor]

'EXPERIMENTAL_FEATURE_WARNING' @ [153:32] ==> public final val EXPERIMENTAL_FEATURE_WARNING: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [153:61] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [153:66] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[ValueParameterDescriptorImpl]

'a' @ [153:78] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>.a: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Pair<(org.jetbrains.kotlin.config.LanguageFeature..org.jetbrains.kotlin.config.LanguageFeature?), (org.jetbrains.kotlin.config.LanguageVersionSettings..org.jetbrains.kotlin.config.LanguageVersionSettings?)>..kotlin.Pair<(org.jetbrains.kotlin.config.LanguageFeature..org.jetbrains.kotlin.config.LanguageFeature?), (org.jetbrains.kotlin.config.LanguageVersionSettings..org.jetbrains.kotlin.config.LanguageVersionSettings?)>?)

'first' @ [153:80] ==> public final val first: (LanguageFeature..LanguageFeature?) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'Coroutines' @ [153:105] ==> enum entry Coroutines defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'emptyList' @ [153:124] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'listOf' @ [154:21] ==> public fun <T> listOf(vararg elements: LanguageFeature.State): List<LanguageFeature.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'ENABLED' @ [154:50] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'ENABLED_WITH_ERROR' @ [154:81] ==> enum entry ENABLED_WITH_ERROR defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'emptyList' @ [156:32] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'?:' @ [158:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [158:41] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'diagnostic' @ [158:65] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [158:76] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'emptyList' @ [158:98] ==> public fun <T> emptyList(): List<IntentionAction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionAction

'KotlinFacet' @ [159:33] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinFacet[FakeCallableDescriptorForObject]

'get' @ [159:45] ==> public final fun get(module: Module): KotlinFacet? defined in org.jetbrains.kotlin.idea.facet.KotlinFacet.Companion[SimpleFunctionDescriptorImpl]

'module' @ [159:49] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[LocalVariableDescriptor]

'configuration' @ [159:58] ==> public final val KotlinFacet.configuration: KotlinFacetConfiguration[MyPropertyDescriptor]

'settings' @ [159:73] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'facetSettings' @ [161:39] ==> val facetSettings: KotlinFacetSettings? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[LocalVariableDescriptor]

'facetSettings' @ [161:64] ==> val facetSettings: KotlinFacetSettings? defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[LocalVariableDescriptor]

'useProjectSettings' @ [161:78] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'!' @ [162:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGradleModule' @ [162:56] ==> public open fun isGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [162:71] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[LocalVariableDescriptor]

'!' @ [162:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isMavenModule' @ [162:100] ==> public open fun isMavenModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [162:114] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[LocalVariableDescriptor]

'if (configureInProject) ::InProject else ::InModule' @ [164:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement, LanguageFeature.State) -> ChangeCoroutineSupportFix, elseBranch: (PsiElement, LanguageFeature.State) -> ChangeCoroutineSupportFix): (PsiElement, LanguageFeature.State) -> ChangeCoroutineSupportFix[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Function2<PsiElement, State, ChangeCoroutineSupportFix>

'configureInProject' @ [164:25] ==> val configureInProject: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[LocalVariableDescriptor]

'InProject' @ [164:47] ==> public constructor InProject(element: PsiElement, coroutineSupport: LanguageFeature.State) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InProject[ClassConstructorDescriptorImpl]

'InModule' @ [164:64] ==> public constructor InModule(element: PsiElement, coroutineSupport: LanguageFeature.State) defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.InModule[ClassConstructorDescriptorImpl]

'newCoroutineSupports' @ [165:20] ==> val newCoroutineSupports: List<LanguageFeature.State> defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[LocalVariableDescriptor]

'map' @ [165:41] ==> public inline fun <T, R> Iterable<LanguageFeature.State>.map(transform: (LanguageFeature.State) -> ChangeCoroutineSupportFix): List<ChangeCoroutineSupportFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State
    <R> -> ChangeCoroutineSupportFix

'invoke' @ [165:47] ==> public abstract operator fun invoke(p1: PsiElement, p2: LanguageFeature.State): ChangeCoroutineSupportFix defined in kotlin.Function2[FunctionInvokeDescriptor]

'diagnostic' @ [165:67] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions[ValueParameterDescriptorImpl]

'psiElement' @ [165:78] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'it' @ [165:90] ==> value-parameter it: LanguageFeature.State defined in org.jetbrains.kotlin.idea.quickfix.ChangeCoroutineSupportFix.Companion.doCreateActions.<anonymous>[ValueParameterDescriptorImpl]

