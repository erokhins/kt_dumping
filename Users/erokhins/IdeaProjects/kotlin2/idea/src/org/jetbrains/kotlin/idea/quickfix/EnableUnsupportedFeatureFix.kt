'KotlinQuickFixAction<PsiElement>' @ [56:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> PsiElement

'element' @ [56:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.<init>[ValueParameterDescriptorImpl]

'EnableUnsupportedFeatureFix' @ [57:94] ==> private constructor EnableUnsupportedFeatureFix(element: PsiElement, feature: LanguageFeature, apiVersionOnly: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix[ClassConstructorDescriptorImpl]

'element' @ [57:122] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.<init>[ValueParameterDescriptorImpl]

'feature' @ [57:131] ==> value-parameter feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.<init>[ValueParameterDescriptorImpl]

'apiVersionOnly' @ [57:140] ==> value-parameter apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.<init>[ValueParameterDescriptorImpl]

'+' @ [58:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (apiVersionOnly) "API version" else "language version"' @ [58:61] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'apiVersionOnly' @ [58:65] ==> protected final val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'if (apiVersionOnly)
            "Set module API version to ${feature.sinceApiVersion.versionString}"
        else
            "Set module language version to ${feature.sinceVersion!!.description}"' @ [60:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'apiVersionOnly' @ [60:38] ==> protected final val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'feature' @ [61:42] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceApiVersion' @ [61:50] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'versionString' @ [61:66] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.ApiVersion[DeserializedPropertyDescriptor]

'feature' @ [63:47] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceVersion' @ [63:55] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'description' @ [63:70] ==> public open val description: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'?:' @ [66:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [66:41] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'file' @ [66:65] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[ValueParameterDescriptorImpl]

'feature' @ [67:33] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceVersion' @ [67:41] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'getRuntimeLibraryVersion' @ [69:41] ==> public fun getRuntimeLibraryVersion(module: Module): String? defined in org.jetbrains.kotlin.idea.facet[DeserializedSimpleFunctionDescriptor]

'module' @ [69:66] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'let' @ [69:75] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> ApiVersion?): ApiVersion? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> ApiVersion?

'ApiVersion' @ [69:81] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'parse' @ [69:92] ==> public final fun parse(versionString: String): ApiVersion? defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [69:98] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [69:105] ==> @InlineOnly public inline fun <T, R> ApiVersion.let(block: (ApiVersion) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ApiVersion
    <R> -> Boolean

'runtimeVersion' @ [70:16] ==> value-parameter runtimeVersion: ApiVersion defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke.<anonymous>[ValueParameterDescriptorImpl]

'feature' @ [70:33] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceApiVersion' @ [70:41] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'KotlinFacetSettingsProvider' @ [73:33] ==> public companion object defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[FakeCallableDescriptorForObject]

'getInstance' @ [73:61] ==> public final fun getInstance(project: Project): KotlinFacetSettingsProvider defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [73:73] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[ValueParameterDescriptorImpl]

'getInitializedSettings' @ [73:82] ==> public abstract fun getInitializedSettings(module: Module): KotlinFacetSettings defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[DeserializedSimpleFunctionDescriptor]

'module' @ [73:105] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'facetSettings' @ [74:34] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'apiLevel' @ [74:48] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'let' @ [74:58] ==> @InlineOnly public inline fun <T, R> LanguageVersion.let(block: (LanguageVersion) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LanguageVersion
    <R> -> String?

'if (ApiVersion.createByLanguageVersion(apiLevel) < feature.sinceApiVersion)
                    feature.sinceApiVersion.versionString
                else
                    null' @ [75:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'ApiVersion' @ [75:21] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'createByLanguageVersion' @ [75:32] ==> @JvmStatic public final fun createByLanguageVersion(version: LanguageVersion): ApiVersion defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedSimpleFunctionDescriptor]

'apiLevel' @ [75:56] ==> value-parameter apiLevel: LanguageVersion defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke.<anonymous>[ValueParameterDescriptorImpl]

'feature' @ [75:68] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceApiVersion' @ [75:76] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'feature' @ [76:21] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceApiVersion' @ [76:29] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'versionString' @ [76:45] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.ApiVersion[DeserializedPropertyDescriptor]

'isGradleModule' @ [81:34] ==> public open fun isGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [81:49] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'isMavenModule' @ [81:77] ==> public open fun isMavenModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [81:91] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'runtimeUpdateRequired' @ [82:21] ==> val runtimeUpdateRequired: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'showErrorDialog' @ [83:30] ==> public open fun showErrorDialog(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [83:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[ValueParameterDescriptorImpl]

'+' @ [84:46] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'feature' @ [84:88] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceApiVersion' @ [84:96] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'if (KotlinPluginUtil.isGradleModule(module)) {
                    updateGradleLanguageVersion(module, file, targetApiLevel)
                }
                else {
                    updateMavenLanguageVersion(module, targetApiLevel)
                }' @ [90:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'isGradleModule' @ [90:52] ==> public open fun isGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [90:67] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'updateGradleLanguageVersion' @ [91:21] ==> private final fun updateGradleLanguageVersion(module: Module, file: KtFile, targetApiLevel: String?): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[SimpleFunctionDescriptorImpl]

'module' @ [91:49] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'file' @ [91:57] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[ValueParameterDescriptorImpl]

'targetApiLevel' @ [91:63] ==> val targetApiLevel: String? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'updateMavenLanguageVersion' @ [94:21] ==> private final fun updateMavenLanguageVersion(module: Module, targetApiLevel: String?): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[SimpleFunctionDescriptorImpl]

'module' @ [94:48] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'targetApiLevel' @ [94:56] ==> val targetApiLevel: String? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'element' @ [96:17] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'let' @ [96:26] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'OpenFileDescriptor' @ [97:21] ==> public constructor OpenFileDescriptor(@NotNull p0: Project, @NotNull p1: VirtualFile, p2: Int) defined in com.intellij.openapi.fileEditor.OpenFileDescriptor[JavaClassConstructorDescriptor]

'module' @ [97:40] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'project' @ [97:47] ==> public final val Module.project: Project[MyPropertyDescriptor]

'it' @ [97:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [97:59] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [97:74] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'it' @ [97:87] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [97:90] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'startOffset' @ [97:100] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'navigate' @ [97:113] ==> public open fun navigate(p0: Boolean): Unit defined in com.intellij.openapi.fileEditor.OpenFileDescriptor[JavaMethodDescriptor]

'runtimeUpdateRequired' @ [102:17] ==> val runtimeUpdateRequired: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'!' @ [102:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'askUpdateRuntime' @ [102:43] ==> public fun askUpdateRuntime(module: Module, requiredVersion: ApiVersion): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file EnableUnsupportedFeatureFix.kt[SimpleFunctionDescriptorImpl]

'module' @ [102:60] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'feature' @ [102:68] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceApiVersion' @ [102:76] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'updateModel' @ [106:40] ==> public final fun updateModel(@NotNull p0: Module, @NotNull p1: ((ModifiableRootModel..ModifiableRootModel?)) -> Unit): Unit defined in com.intellij.openapi.roots.ModuleRootModificationUtil[SamAdapterFunctionDescriptor]

'module' @ [106:52] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'with' @ [107:17] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinFacetSettings, block: KotlinFacetSettings.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacetSettings
    <R> -> Unit

'facetSettings' @ [107:22] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'!' @ [108:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'apiVersionOnly' @ [108:26] ==> protected final val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'languageLevel' @ [109:25] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'targetVersion' @ [109:41] ==> val targetVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'targetApiLevel' @ [111:25] ==> val targetApiLevel: String? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'apiLevel' @ [112:25] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'LanguageVersion' @ [112:36] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'fromVersionString' @ [112:52] ==> @JvmStatic public final fun fromVersionString(str: String?): LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedSimpleFunctionDescriptor]

'targetApiLevel' @ [112:70] ==> val targetApiLevel: String? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.invoke[LocalVariableDescriptor]

'getInstance' @ [119:46] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [119:58] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateGradleLanguageVersion[ValueParameterDescriptorImpl]

'fileIndex' @ [119:66] ==> public final val ModuleRootManager.fileIndex: ModuleFileIndex[MyPropertyDescriptor]

'isInTestSourceContent' @ [119:76] ==> public abstract fun isInTestSourceContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ModuleFileIndex[JavaMethodDescriptor]

'file' @ [119:98] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateGradleLanguageVersion[ValueParameterDescriptorImpl]

'virtualFile' @ [119:103] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'KotlinWithGradleConfigurator' @ [120:20] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinWithGradleConfigurator[FakeCallableDescriptorForObject]

'changeLanguageVersion' @ [120:49] ==> public final fun changeLanguageVersion(module: Module, languageVersion: String?, apiVersion: String? = ..., forTests: Boolean): PsiElement? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithGradleConfigurator.Companion[SimpleFunctionDescriptorImpl]

'module' @ [120:71] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateGradleLanguageVersion[ValueParameterDescriptorImpl]

'if (apiVersionOnly) null else feature.sinceVersion!!.versionString' @ [121:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'apiVersionOnly' @ [121:21] ==> protected final val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'feature' @ [121:47] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceVersion' @ [121:55] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'versionString' @ [121:70] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'targetApiLevel' @ [122:17] ==> value-parameter targetApiLevel: String? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateGradleLanguageVersion[ValueParameterDescriptorImpl]

'forTests' @ [122:33] ==> val forTests: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateGradleLanguageVersion[LocalVariableDescriptor]

'KotlinMavenConfigurator' @ [127:27] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'findModulePomFile' @ [127:51] ==> public final fun findModulePomFile(module: Module): PsiFile? defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[SimpleFunctionDescriptorImpl]

'module' @ [127:69] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateMavenLanguageVersion[ValueParameterDescriptorImpl]

'?:' @ [128:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PomFile?, right: PomFile): PomFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PomFile

'forFileOrNull' @ [128:35] ==> public final fun forFileOrNull(xmlFile: XmlFile): PomFile? defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'psi' @ [128:49] ==> val psi: XmlFile defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateMavenLanguageVersion.doUpdateMavenLanguageVersion[LocalVariableDescriptor]

'pom' @ [129:24] ==> val pom: PomFile defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateMavenLanguageVersion.doUpdateMavenLanguageVersion[LocalVariableDescriptor]

'changeLanguageVersion' @ [129:28] ==> public fun PomFile.changeLanguageVersion(languageVersion: String?, apiVersion: String?): PsiElement? defined in org.jetbrains.kotlin.idea.maven in file PomFile.kt[SimpleFunctionDescriptorImpl]

'if (apiVersionOnly) null else feature.sinceVersion!!.versionString' @ [130:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'apiVersionOnly' @ [130:29] ==> protected final val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'feature' @ [130:55] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[PropertyDescriptorImpl]

'sinceVersion' @ [130:63] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'versionString' @ [130:78] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'targetApiLevel' @ [131:25] ==> value-parameter targetApiLevel: String? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateMavenLanguageVersion[ValueParameterDescriptorImpl]

'doUpdateMavenLanguageVersion' @ [134:27] ==> local final fun doUpdateMavenLanguageVersion(): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateMavenLanguageVersion[SimpleFunctionDescriptorImpl]

'element' @ [135:17] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateMavenLanguageVersion[LocalVariableDescriptor]

'showErrorDialog' @ [136:26] ==> public open fun showErrorDialog(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'module' @ [136:42] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateMavenLanguageVersion[ValueParameterDescriptorImpl]

'project' @ [136:49] ==> public final val Module.project: Project[MyPropertyDescriptor]

'text' @ [138:42] ==> public final val EnableUnsupportedFeatureFix.InModule.text: String[MyPropertyDescriptor]

'element' @ [140:20] ==> val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule.updateMavenLanguageVersion[LocalVariableDescriptor]

'EnableUnsupportedFeatureFix' @ [145:15] ==> private constructor EnableUnsupportedFeatureFix(element: PsiElement, feature: LanguageFeature, apiVersionOnly: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix[ClassConstructorDescriptorImpl]

'element' @ [145:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject.<init>[ValueParameterDescriptorImpl]

'feature' @ [145:52] ==> value-parameter feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject.<init>[ValueParameterDescriptorImpl]

'apiVersionOnly' @ [145:61] ==> value-parameter apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject.<init>[ValueParameterDescriptorImpl]

'+' @ [147:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (apiVersionOnly) "API version" else "language version"' @ [147:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'apiVersionOnly' @ [147:66] ==> protected final val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[PropertyDescriptorImpl]

'if (apiVersionOnly)
            "Set project API version to ${feature.sinceApiVersion.versionString}"
        else
            "Set project language version to ${feature.sinceVersion!!.versionString}"' @ [149:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'apiVersionOnly' @ [149:38] ==> protected final val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[PropertyDescriptorImpl]

'feature' @ [150:43] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[PropertyDescriptorImpl]

'sinceApiVersion' @ [150:51] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'versionString' @ [150:67] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.ApiVersion[DeserializedPropertyDescriptor]

'feature' @ [152:48] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[PropertyDescriptorImpl]

'sinceVersion' @ [152:56] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'versionString' @ [152:71] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'feature' @ [155:33] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[PropertyDescriptorImpl]

'sinceVersion' @ [155:41] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'KotlinCommonCompilerArgumentsHolder' @ [157:13] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [157:49] ==> public final fun getInstance(project: Project): KotlinCommonCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [157:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject.invoke[ValueParameterDescriptorImpl]

'update' @ [157:70] ==> public final fun update(changer: CommonCompilerArguments.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[DeserializedSimpleFunctionDescriptor]

'ApiVersion' @ [158:40] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'parse' @ [158:51] ==> public final fun parse(versionString: String): ApiVersion? defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedSimpleFunctionDescriptor]

'apiVersion' @ [158:57] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'parsedApiVersion' @ [159:21] ==> val parsedApiVersion: ApiVersion? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject.invoke.<anonymous>[LocalVariableDescriptor]

'feature' @ [159:49] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[PropertyDescriptorImpl]

'sinceApiVersion' @ [159:57] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'parsedApiVersion' @ [159:75] ==> val parsedApiVersion: ApiVersion? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject.invoke.<anonymous>[LocalVariableDescriptor]

'!' @ [160:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkUpdateRuntime' @ [160:26] ==> public fun checkUpdateRuntime(project: Project, requiredVersion: ApiVersion): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file EnableUnsupportedFeatureFix.kt[SimpleFunctionDescriptorImpl]

'project' @ [160:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject.invoke[ValueParameterDescriptorImpl]

'feature' @ [160:54] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[PropertyDescriptorImpl]

'sinceApiVersion' @ [160:62] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'apiVersion' @ [161:21] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'feature' @ [161:34] ==> protected final val feature: LanguageFeature defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[PropertyDescriptorImpl]

'sinceApiVersion' @ [161:42] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'versionString' @ [161:58] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.ApiVersion[DeserializedPropertyDescriptor]

'!' @ [164:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'apiVersionOnly' @ [164:22] ==> protected final val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[PropertyDescriptorImpl]

'languageVersion' @ [165:21] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'targetVersion' @ [165:39] ==> val targetVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject.invoke[LocalVariableDescriptor]

'versionString' @ [165:53] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'getInstanceEx' @ [168:34] ==> public open fun getInstanceEx(p0: (Project..Project?)): (ProjectRootManagerEx..ProjectRootManagerEx?) defined in com.intellij.openapi.roots.ex.ProjectRootManagerEx[JavaMethodDescriptor]

'project' @ [168:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject.invoke[ValueParameterDescriptorImpl]

'makeRootsChange' @ [168:57] ==> public final fun makeRootsChange(@NotNull p0: () -> Unit, p1: Boolean, p2: Boolean): Unit defined in com.intellij.openapi.roots.ex.ProjectRootManagerEx[MyFunctionDescriptor]

'KotlinSingleIntentionActionFactory' @ [172:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'component1' @ [174:18] ==> public final operator fun component1(): (LanguageFeature..LanguageFeature?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [174:27] ==> public final operator fun component2(): (LanguageVersionSettings..LanguageVersionSettings?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'UNSUPPORTED_FEATURE' @ [174:61] ==> public final val UNSUPPORTED_FEATURE: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [174:81] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [174:86] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[ValueParameterDescriptorImpl]

'a' @ [174:98] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>.a: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Pair<(org.jetbrains.kotlin.config.LanguageFeature..org.jetbrains.kotlin.config.LanguageFeature?), (org.jetbrains.kotlin.config.LanguageVersionSettings..org.jetbrains.kotlin.config.LanguageVersionSettings?)>..kotlin.Pair<(org.jetbrains.kotlin.config.LanguageFeature..org.jetbrains.kotlin.config.LanguageFeature?), (org.jetbrains.kotlin.config.LanguageVersionSettings..org.jetbrains.kotlin.config.LanguageVersionSettings?)>?)

'feature' @ [176:32] ==> val feature: (LanguageFeature..LanguageFeature?) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'sinceVersion' @ [176:40] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'sinceVersion' @ [177:34] ==> val sinceVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'languageFeatureSettings' @ [177:50] ==> val languageFeatureSettings: (LanguageVersionSettings..LanguageVersionSettings?) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'languageVersion' @ [177:74] ==> public abstract val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedPropertyDescriptor]

'feature' @ [178:34] ==> val feature: (LanguageFeature..LanguageFeature?) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'sinceApiVersion' @ [178:42] ==> public final val sinceApiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'languageFeatureSettings' @ [178:60] ==> val languageFeatureSettings: (LanguageVersionSettings..LanguageVersionSettings?) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'apiVersion' @ [178:84] ==> public abstract val apiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedPropertyDescriptor]

'!' @ [180:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sinceVersion' @ [180:18] ==> val sinceVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'isStable' @ [180:31] ==> public final val isStable: Boolean defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'!' @ [180:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'KotlinInternalMode' @ [180:44] ==> public companion object Instance defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode[FakeCallableDescriptorForObject]

'enabled' @ [180:63] ==> public final var enabled: Boolean defined in org.jetbrains.kotlin.idea.actions.internal.KotlinInternalMode.Instance[DeserializedPropertyDescriptor]

'?:' @ [184:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForPsiElement' @ [184:41] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'diagnostic' @ [184:65] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [184:76] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'!' @ [185:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isGradleModule' @ [185:35] ==> public open fun isGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [185:50] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'!' @ [185:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isMavenModule' @ [185:79] ==> public open fun isMavenModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [185:93] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'KotlinFacet' @ [186:37] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinFacet[FakeCallableDescriptorForObject]

'get' @ [186:49] ==> public final fun get(module: Module): KotlinFacet? defined in org.jetbrains.kotlin.idea.facet.KotlinFacet.Companion[SimpleFunctionDescriptorImpl]

'module' @ [186:53] ==> val module: Module defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'configuration' @ [186:62] ==> public final val KotlinFacet.configuration: KotlinFacetConfiguration[MyPropertyDescriptor]

'settings' @ [186:77] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'facetSettings' @ [187:21] ==> val facetSettings: KotlinFacetSettings? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'facetSettings' @ [187:46] ==> val facetSettings: KotlinFacetSettings? defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'useProjectSettings' @ [187:60] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'InProject' @ [187:87] ==> public constructor InProject(element: PsiElement, feature: LanguageFeature, apiVersionOnly: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InProject[ClassConstructorDescriptorImpl]

'diagnostic' @ [187:97] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [187:108] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'feature' @ [187:120] ==> val feature: (LanguageFeature..LanguageFeature?) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'apiVersionOnly' @ [187:129] ==> val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'InModule' @ [189:20] ==> public constructor InModule(element: PsiElement, feature: LanguageFeature, apiVersionOnly: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.InModule[ClassConstructorDescriptorImpl]

'diagnostic' @ [189:29] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [189:40] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'feature' @ [189:52] ==> val feature: (LanguageFeature..LanguageFeature?) defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'apiVersionOnly' @ [189:61] ==> val apiVersionOnly: Boolean defined in org.jetbrains.kotlin.idea.quickfix.EnableUnsupportedFeatureFix.Companion.createAction[LocalVariableDescriptor]

'project' @ [195:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime[ValueParameterDescriptorImpl]

'allModules' @ [195:46] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure in file projectStructureUtil.kt[SimpleFunctionDescriptorImpl]

'filter' @ [195:59] ==> public inline fun <T> Iterable<(Module..Module?)>.filter(predicate: ((Module..Module?)) -> Boolean): List<(Module..Module?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'getRuntimeLibraryVersion' @ [196:42] ==> public fun getRuntimeLibraryVersion(module: Module): String? defined in org.jetbrains.kotlin.idea.facet[DeserializedSimpleFunctionDescriptor]

'module' @ [196:67] ==> value-parameter module: (Module..Module?) defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [196:76] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> ApiVersion?): ApiVersion? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> ApiVersion?

'ApiVersion' @ [197:13] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'parse' @ [197:24] ==> public final fun parse(versionString: String): ApiVersion? defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedSimpleFunctionDescriptor]

'version' @ [197:30] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'substringBefore' @ [197:38] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'parsedModuleRuntimeVersion' @ [199:9] ==> val parsedModuleRuntimeVersion: ApiVersion? defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime.<anonymous>[LocalVariableDescriptor]

'parsedModuleRuntimeVersion' @ [199:47] ==> val parsedModuleRuntimeVersion: ApiVersion? defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime.<anonymous>[LocalVariableDescriptor]

'requiredVersion' @ [199:76] ==> value-parameter requiredVersion: ApiVersion defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime[ValueParameterDescriptorImpl]

'modulesWithOutdatedRuntime' @ [201:9] ==> val modulesWithOutdatedRuntime: List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime[LocalVariableDescriptor]

'isNotEmpty' @ [201:36] ==> @InlineOnly public inline fun <T> Collection<(Module..Module?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'!' @ [202:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'askUpdateRuntime' @ [202:14] ==> public fun askUpdateRuntime(project: Project, requiredVersion: ApiVersion, librariesToUpdate: List<Library>): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file EnableUnsupportedFeatureFix.kt[SimpleFunctionDescriptorImpl]

'project' @ [202:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime[ValueParameterDescriptorImpl]

'requiredVersion' @ [202:40] ==> value-parameter requiredVersion: ApiVersion defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime[ValueParameterDescriptorImpl]

'modulesWithOutdatedRuntime' @ [203:31] ==> val modulesWithOutdatedRuntime: List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime[LocalVariableDescriptor]

'mapNotNull' @ [203:58] ==> public inline fun <T, R : Any> Iterable<(Module..Module?)>.mapNotNull(transform: ((Module..Module?)) -> Library?): List<Library> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)
    <R : Any> -> Library

'findKotlinRuntimeLibrary' @ [203:71] ==> public fun findKotlinRuntimeLibrary(module: Module, predicate: (Library) -> Boolean = ...): Library? defined in org.jetbrains.kotlin.idea.versions in file OutdatedKotlinRuntimeChecker.kt[SimpleFunctionDescriptorImpl]

'it' @ [203:96] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.quickfix.checkUpdateRuntime.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [209:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getApplication' @ [209:29] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [209:46] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'showOkCancelDialog' @ [210:27] ==> @Messages.OkCancelResult public open fun showOkCancelDialog(p0: (Project..Project?), p1: (String..String?), @Nls p2: (String..String?), p3: (Icon..Icon?)): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [210:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.askUpdateRuntime[ValueParameterDescriptorImpl]

'+' @ [211:46] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'requiredVersion' @ [211:87] ==> value-parameter requiredVersion: ApiVersion defined in org.jetbrains.kotlin.idea.quickfix.askUpdateRuntime[ValueParameterDescriptorImpl]

'getQuestionIcon' @ [214:55] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'rc' @ [215:13] ==> val rc: Int defined in org.jetbrains.kotlin.idea.quickfix.askUpdateRuntime[LocalVariableDescriptor]

'OK' @ [215:28] ==> public const final val OK: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'updateLibraries' @ [218:5] ==> public fun updateLibraries(project: Project, libraries: Collection<Library>): Unit defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [218:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.askUpdateRuntime[ValueParameterDescriptorImpl]

'librariesToUpdate' @ [218:30] ==> value-parameter librariesToUpdate: List<Library> defined in org.jetbrains.kotlin.idea.quickfix.askUpdateRuntime[ValueParameterDescriptorImpl]

'findKotlinRuntimeLibrary' @ [223:19] ==> public fun findKotlinRuntimeLibrary(module: Module, predicate: (Library) -> Boolean = ...): Library? defined in org.jetbrains.kotlin.idea.versions in file OutdatedKotlinRuntimeChecker.kt[SimpleFunctionDescriptorImpl]

'module' @ [223:44] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.quickfix.askUpdateRuntime[ValueParameterDescriptorImpl]

'askUpdateRuntime' @ [224:12] ==> public fun askUpdateRuntime(project: Project, requiredVersion: ApiVersion, librariesToUpdate: List<Library>): Boolean defined in org.jetbrains.kotlin.idea.quickfix in file EnableUnsupportedFeatureFix.kt[SimpleFunctionDescriptorImpl]

'module' @ [224:29] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.quickfix.askUpdateRuntime[ValueParameterDescriptorImpl]

'project' @ [224:36] ==> public final val Module.project: Project[MyPropertyDescriptor]

'requiredVersion' @ [224:45] ==> value-parameter requiredVersion: ApiVersion defined in org.jetbrains.kotlin.idea.quickfix.askUpdateRuntime[ValueParameterDescriptorImpl]

'listOf' @ [224:62] ==> public fun <T> listOf(element: Library): List<Library> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library

'library' @ [224:69] ==> val library: Library defined in org.jetbrains.kotlin.idea.quickfix.askUpdateRuntime[LocalVariableDescriptor]

