'getPlatform' @ [39:36] ==> @NotNull public open fun getPlatform(@NotNull file: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'containingKtFile' @ [39:48] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'getResolutionFacade' @ [42:13] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'moduleDescriptor' @ [42:35] ==> public abstract val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedPropertyDescriptor]

'builtIns' @ [42:52] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'getValue' @ [44:49] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'CommonCompilerArguments' @ [45:5] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'multiPlatform' @ [45:30] ==> @Argument public final var multiPlatform: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'annotations' @ [45:44] ==> public abstract val annotations: List<Annotation> defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'filterIsInstance' @ [45:56] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Argument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Argument

'single' @ [45:85] ==> public fun <T> List<Argument>.single(): Argument defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Argument

'value' @ [45:94] ==> public final val value: String defined in org.jetbrains.kotlin.cli.common.arguments.Argument[DeserializedPropertyDescriptor]

'KotlinFacetSettingsProvider' @ [49:25] ==> public companion object defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[FakeCallableDescriptorForObject]

'getInstance' @ [49:53] ==> public final fun getInstance(project: Project): KotlinFacetSettingsProvider defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [49:65] ==> public final val Module.project: Project[MyPropertyDescriptor]

'getInitializedSettings' @ [49:74] ==> public abstract fun getInitializedSettings(module: Module): KotlinFacetSettings defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[DeserializedSimpleFunctionDescriptor]

'this' @ [49:97] ==> <this> defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[ReceiverParameterDescriptorImpl]

'getLibraryLanguageLevel' @ [50:25] ==> public fun getLibraryLanguageLevel(module: Module, rootModel: ModuleRootModel?, targetPlatform: TargetPlatformKind<*>?): LanguageVersion defined in org.jetbrains.kotlin.idea.facet in file KotlinVersionInfoProvider.kt[SimpleFunctionDescriptorImpl]

'this' @ [50:49] ==> <this> defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[ReceiverParameterDescriptorImpl]

'facetSettings' @ [50:61] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[LocalVariableDescriptor]

'targetPlatformKind' @ [50:75] ==> public final val targetPlatformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'if (facetSettings.useProjectSettings) {
        KotlinCommonCompilerArgumentsHolder.getInstance(project).update {
            if (languageVersion == null) {
                languageVersion = languageLevel.versionString
            }
            if (apiVersion == null) {
                apiVersion = languageLevel.versionString
            }
        }
    }
    else {
        with(facetSettings) {
            if (this.languageLevel == null) {
                this.languageLevel = languageLevel
            }
            if (this.apiLevel == null) {
                this.apiLevel = languageLevel
            }
        }
    }' @ [53:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'facetSettings' @ [53:9] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[LocalVariableDescriptor]

'useProjectSettings' @ [53:23] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'getInstance' @ [54:45] ==> public final fun getInstance(project: Project): KotlinCommonCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.Companion[SimpleFunctionDescriptorImpl]

'project' @ [54:57] ==> public final val Module.project: Project[MyPropertyDescriptor]

'update' @ [54:66] ==> public final fun update(changer: CommonCompilerArguments.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[SimpleFunctionDescriptorImpl]

'languageVersion' @ [55:17] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'languageVersion' @ [56:17] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'languageLevel' @ [56:35] ==> val languageLevel: LanguageVersion defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[LocalVariableDescriptor]

'versionString' @ [56:49] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'apiVersion' @ [58:17] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'apiVersion' @ [59:17] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'languageLevel' @ [59:30] ==> val languageLevel: LanguageVersion defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[LocalVariableDescriptor]

'versionString' @ [59:44] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'with' @ [64:9] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinFacetSettings, block: KotlinFacetSettings.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacetSettings
    <R> -> Unit

'facetSettings' @ [64:14] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[LocalVariableDescriptor]

'this' @ [65:17] ==> <this> defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies.<anonymous>[ReceiverParameterDescriptorImpl]

'languageLevel' @ [65:22] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'this' @ [66:17] ==> <this> defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies.<anonymous>[ReceiverParameterDescriptorImpl]

'languageLevel' @ [66:22] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'languageLevel' @ [66:38] ==> val languageLevel: LanguageVersion defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[LocalVariableDescriptor]

'this' @ [68:17] ==> <this> defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies.<anonymous>[ReceiverParameterDescriptorImpl]

'apiLevel' @ [68:22] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'this' @ [69:17] ==> <this> defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies.<anonymous>[ReceiverParameterDescriptorImpl]

'apiLevel' @ [69:22] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'languageLevel' @ [69:33] ==> val languageLevel: LanguageVersion defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[LocalVariableDescriptor]

'languageLevel' @ [74:12] ==> val languageLevel: LanguageVersion defined in org.jetbrains.kotlin.idea.project.getAndCacheLanguageLevelByDependencies[LocalVariableDescriptor]

'JvmOverloads' @ [77:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'emptyMap' @ [79:89] ==> public fun <K, V> emptyMap(): Map<AnalysisFlag<*>, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AnalysisFlag<*>
    <V> -> Any?

'KotlinCommonCompilerArgumentsHolder' @ [80:21] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [80:57] ==> public final fun getInstance(project: Project): KotlinCommonCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.Companion[SimpleFunctionDescriptorImpl]

'this' @ [80:69] ==> <this> defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[ReceiverParameterDescriptorImpl]

'settings' @ [80:75] ==> public final var settings: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[PropertyDescriptorImpl]

'?:' @ [82:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: LanguageVersion?, right: LanguageVersion?): LanguageVersion?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> LanguageVersion?

'fromVersionString' @ [82:29] ==> @JvmStatic public final fun fromVersionString(str: String?): LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedSimpleFunctionDescriptor]

'arguments' @ [82:47] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[LocalVariableDescriptor]

'languageVersion' @ [82:57] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'contextModule' @ [83:16] ==> value-parameter contextModule: Module? = ... defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[ValueParameterDescriptorImpl]

'getAndCacheLanguageLevelByDependencies' @ [83:31] ==> public fun Module.getAndCacheLanguageLevelByDependencies(): LanguageVersion defined in org.jetbrains.kotlin.idea.project in file Platform.kt[SimpleFunctionDescriptorImpl]

'LATEST_STABLE' @ [84:32] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'ApiVersion' @ [85:22] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'createByLanguageVersion' @ [85:33] ==> @JvmStatic public final fun createByLanguageVersion(version: LanguageVersion): ApiVersion defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedSimpleFunctionDescriptor]

'?:' @ [85:57] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: LanguageVersion?, right: LanguageVersion): LanguageVersion[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> LanguageVersion

'fromVersionString' @ [85:73] ==> @JvmStatic public final fun fromVersionString(str: String?): LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedSimpleFunctionDescriptor]

'arguments' @ [85:91] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[LocalVariableDescriptor]

'apiVersion' @ [85:101] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'languageVersion' @ [85:116] ==> val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[LocalVariableDescriptor]

'KotlinCompilerSettings' @ [86:28] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings[FakeCallableDescriptorForObject]

'getInstance' @ [86:51] ==> public final fun getInstance(project: Project): KotlinCompilerSettings defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings.Companion[SimpleFunctionDescriptorImpl]

'this' @ [86:63] ==> <this> defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[ReceiverParameterDescriptorImpl]

'settings' @ [86:69] ==> public final var settings: CompilerSettings defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings[PropertyDescriptorImpl]

'getExtraLanguageFeatures' @ [87:33] ==> private fun getExtraLanguageFeatures(targetPlatformKind: TargetPlatformKind<*>, coroutineSupport: LanguageFeature.State, compilerSettings: CompilerSettings?, module: Module?): Map<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.idea.project in file Platform.kt[SimpleFunctionDescriptorImpl]

'Common' @ [88:32] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'byCompilerArguments' @ [89:30] ==> @JvmStatic public final fun byCompilerArguments(arguments: CommonCompilerArguments?): LanguageFeature.State defined in org.jetbrains.kotlin.config.CoroutineSupport[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [89:86] ==> public final fun getInstance(project: Project): KotlinCommonCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.Companion[SimpleFunctionDescriptorImpl]

'this' @ [89:98] ==> <this> defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[ReceiverParameterDescriptorImpl]

'settings' @ [89:104] ==> public final var settings: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[PropertyDescriptorImpl]

'compilerSettings' @ [90:13] ==> val compilerSettings: CompilerSettings defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[LocalVariableDescriptor]

'LanguageVersionSettingsImpl' @ [93:12] ==> @JvmOverloads public constructor LanguageVersionSettingsImpl(languageVersion: LanguageVersion, apiVersion: ApiVersion, analysisFlags: Map<AnalysisFlag<*>, Any?> = ..., specificFeatures: Map<LanguageFeature, LanguageFeature.State> = ...) defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedClassConstructorDescriptor]

'languageVersion' @ [93:40] ==> val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[LocalVariableDescriptor]

'apiVersion' @ [93:57] ==> val apiVersion: ApiVersion defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[LocalVariableDescriptor]

'arguments' @ [94:40] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[LocalVariableDescriptor]

'configureAnalysisFlags' @ [94:50] ==> public open fun configureAnalysisFlags(): MutableMap<AnalysisFlag<*>, Any> defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedSimpleFunctionDescriptor]

'extraAnalysisFlags' @ [94:77] ==> value-parameter extraAnalysisFlags: Map<AnalysisFlag<*>, Any?> = ... defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[ValueParameterDescriptorImpl]

'extraLanguageFeatures' @ [95:40] ==> val extraLanguageFeatures: Map<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.idea.project.getLanguageVersionSettings[LocalVariableDescriptor]

'KotlinFacetSettingsProvider' @ [100:37] ==> public companion object defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[FakeCallableDescriptorForObject]

'getInstance' @ [100:65] ==> public final fun getInstance(project: Project): KotlinFacetSettingsProvider defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [100:77] ==> public final val Module.project: Project[MyPropertyDescriptor]

'facetSettingsProvider' @ [101:13] ==> val facetSettingsProvider: KotlinFacetSettingsProvider defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'getSettings' @ [101:35] ==> public abstract fun getSettings(module: Module): KotlinFacetSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[DeserializedSimpleFunctionDescriptor]

'this' @ [101:47] ==> <this> defined in org.jetbrains.kotlin.idea.project.languageVersionSettings[ReceiverParameterDescriptorImpl]

'project' @ [101:69] ==> public final val Module.project: Project[MyPropertyDescriptor]

'getLanguageVersionSettings' @ [101:77] ==> @JvmOverloads public fun Project.getLanguageVersionSettings(contextModule: Module? = ..., extraAnalysisFlags: Map<AnalysisFlag<*>, Any?> = ...): LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project in file Platform.kt[SimpleFunctionDescriptorImpl]

'this' @ [101:104] ==> <this> defined in org.jetbrains.kotlin.idea.project.languageVersionSettings[ReceiverParameterDescriptorImpl]

'facetSettingsProvider' @ [102:29] ==> val facetSettingsProvider: KotlinFacetSettingsProvider defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'getInitializedSettings' @ [102:51] ==> public abstract fun getInitializedSettings(module: Module): KotlinFacetSettings defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[DeserializedSimpleFunctionDescriptor]

'this' @ [102:74] ==> <this> defined in org.jetbrains.kotlin.idea.project.languageVersionSettings[ReceiverParameterDescriptorImpl]

'facetSettings' @ [103:13] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'useProjectSettings' @ [103:27] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'project' @ [103:54] ==> public final val Module.project: Project[MyPropertyDescriptor]

'getLanguageVersionSettings' @ [103:62] ==> @JvmOverloads public fun Project.getLanguageVersionSettings(contextModule: Module? = ..., extraAnalysisFlags: Map<AnalysisFlag<*>, Any?> = ...): LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project in file Platform.kt[SimpleFunctionDescriptorImpl]

'this' @ [103:89] ==> <this> defined in org.jetbrains.kotlin.idea.project.languageVersionSettings[ReceiverParameterDescriptorImpl]

'facetSettings' @ [104:31] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'languageLevel' @ [104:45] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'getAndCacheLanguageLevelByDependencies' @ [104:62] ==> public fun Module.getAndCacheLanguageLevelByDependencies(): LanguageVersion defined in org.jetbrains.kotlin.idea.project in file Platform.kt[SimpleFunctionDescriptorImpl]

'facetSettings' @ [105:26] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'apiLevel' @ [105:40] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'languageVersion' @ [105:52] ==> val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'getExtraLanguageFeatures' @ [107:37] ==> private fun getExtraLanguageFeatures(targetPlatformKind: TargetPlatformKind<*>, coroutineSupport: LanguageFeature.State, compilerSettings: CompilerSettings?, module: Module?): Map<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.idea.project in file Platform.kt[SimpleFunctionDescriptorImpl]

'facetSettings' @ [108:17] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'targetPlatformKind' @ [108:31] ==> public final val targetPlatformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'Common' @ [108:72] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'facetSettings' @ [109:17] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'coroutineSupport' @ [109:31] ==> public final var coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'facetSettings' @ [110:17] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'compilerSettings' @ [110:31] ==> public final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'this' @ [111:17] ==> <this> defined in org.jetbrains.kotlin.idea.project.languageVersionSettings[ReceiverParameterDescriptorImpl]

'facetSettings' @ [114:25] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'compilerArguments' @ [114:39] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'arguments' @ [115:13] ==> val arguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'facetSettings' @ [116:13] ==> val facetSettings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'compilerSettings' @ [116:27] ==> public final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'let' @ [116:45] ==> @InlineOnly public inline fun <T, R> CompilerSettings.let(block: (CompilerSettings) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerSettings
    <R> -> Unit

'parseCommandLineArguments' @ [117:17] ==> public fun <A : CommonToolArguments> parseCommandLineArguments(args: List<String>, result: CommonCompilerArguments): Unit defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A : CommonToolArguments> -> CommonCompilerArguments

'compilerSettings' @ [117:43] ==> value-parameter compilerSettings: CompilerSettings defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>.<anonymous>[ValueParameterDescriptorImpl]

'additionalArgumentsAsList' @ [117:60] ==> public val CompilerSettings.additionalArgumentsAsList: List<String> defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'arguments' @ [117:87] ==> val arguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'LanguageVersionSettingsImpl' @ [121:16] ==> @JvmOverloads public constructor LanguageVersionSettingsImpl(languageVersion: LanguageVersion, apiVersion: ApiVersion, analysisFlags: Map<AnalysisFlag<*>, Any?> = ..., specificFeatures: Map<LanguageFeature, LanguageFeature.State> = ...) defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[DeserializedClassConstructorDescriptor]

'languageVersion' @ [122:17] ==> val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'createByLanguageVersion' @ [123:28] ==> @JvmStatic public final fun createByLanguageVersion(version: LanguageVersion): ApiVersion defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedSimpleFunctionDescriptor]

'apiVersion' @ [123:52] ==> val apiVersion: LanguageVersion defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'arguments' @ [124:17] ==> val arguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'configureAnalysisFlags' @ [124:28] ==> public open fun configureAnalysisFlags(): MutableMap<AnalysisFlag<*>, Any> defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedSimpleFunctionDescriptor]

'orEmpty' @ [124:53] ==> @InlineOnly public inline fun <K, V> Map<AnalysisFlag<*>, Any>?.orEmpty(): Map<AnalysisFlag<*>, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AnalysisFlag<*>
    <V> -> Any

'extraLanguageFeatures' @ [125:17] ==> val extraLanguageFeatures: Map<LanguageFeature, LanguageFeature.State> defined in org.jetbrains.kotlin.idea.project.<get-languageVersionSettings>[LocalVariableDescriptor]

'?:' @ [130:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TargetPlatformKind<*>?, right: TargetPlatformKind<*>?): TargetPlatformKind<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> TargetPlatformKind<*>?

'getInstance' @ [130:41] ==> public final fun getInstance(project: Project): KotlinFacetSettingsProvider defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [130:53] ==> public final val Module.project: Project[MyPropertyDescriptor]

'getSettings' @ [130:62] ==> public abstract fun getSettings(module: Module): KotlinFacetSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[DeserializedSimpleFunctionDescriptor]

'this' @ [130:74] ==> <this> defined in org.jetbrains.kotlin.idea.project.targetPlatform[ReceiverParameterDescriptorImpl]

'targetPlatformKind' @ [130:81] ==> public final val targetPlatformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'project' @ [130:103] ==> public final val Module.project: Project[MyPropertyDescriptor]

'targetPlatform' @ [130:111] ==> public val Project.targetPlatform: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'?:' @ [134:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'getInstance' @ [134:59] ==> public final fun getInstance(project: Project): Kotlin2JvmCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder.Companion[SimpleFunctionDescriptorImpl]

'this' @ [134:71] ==> <this> defined in org.jetbrains.kotlin.idea.project.targetPlatform[ReceiverParameterDescriptorImpl]

'settings' @ [134:77] ==> public final var settings: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder[PropertyDescriptorImpl]

'jvmTarget' @ [134:86] ==> @GradleOption @Argument public final var jvmTarget: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'?:' @ [135:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JvmTarget?, right: JvmTarget): JvmTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JvmTarget

'fromString' @ [135:33] ==> @JvmStatic public final fun fromString(string: String): JvmTarget? defined in org.jetbrains.kotlin.config.JvmTarget.Companion[DeserializedSimpleFunctionDescriptor]

'jvmTarget' @ [135:44] ==> val jvmTarget: String defined in org.jetbrains.kotlin.idea.project.<get-targetPlatform>[LocalVariableDescriptor]

'TargetPlatformKind' @ [136:16] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Jvm' @ [136:35] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[FakeCallableDescriptorForObject]

'version' @ [136:39] ==> val version: JvmTarget defined in org.jetbrains.kotlin.idea.project.<get-targetPlatform>[LocalVariableDescriptor]

'targetPlatform' @ [140:13] ==> public val Module.targetPlatform: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'Common' @ [140:50] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'getInstance' @ [141:34] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'this' @ [141:46] ==> <this> defined in org.jetbrains.kotlin.idea.project.implementsCommonModule[ReceiverParameterDescriptorImpl]

'dependencies' @ [141:52] ==> public final val ModuleRootManager.dependencies: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'any' @ [141:65] ==> public inline fun <T> Array<out (Module..Module?)>.any(predicate: ((Module..Module?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'it' @ [141:71] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.project.<get-implementsCommonModule>.<anonymous>[ValueParameterDescriptorImpl]

'targetPlatform' @ [141:74] ==> public val Module.targetPlatform: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'Common' @ [141:111] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'mutableMapOf' @ [149:12] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<LanguageFeature, LanguageFeature.State> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LanguageFeature
    <V> -> State

'apply' @ [149:67] ==> @InlineOnly public inline fun <T> MutableMap<LanguageFeature, LanguageFeature.State>.apply(block: MutableMap<LanguageFeature, LanguageFeature.State>.() -> Unit): MutableMap<LanguageFeature, LanguageFeature.State> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableMap<LanguageFeature, State>

'put' @ [150:9] ==> public abstract fun put(key: LanguageFeature, value: LanguageFeature.State): LanguageFeature.State? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'Coroutines' @ [150:29] ==> enum entry Coroutines defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'coroutineSupport' @ [150:41] ==> value-parameter coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.project.getExtraLanguageFeatures[ValueParameterDescriptorImpl]

'targetPlatformKind' @ [151:13] ==> value-parameter targetPlatformKind: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.project.getExtraLanguageFeatures[ValueParameterDescriptorImpl]

'Common' @ [151:54] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'compilerSettings' @ [153:13] ==> value-parameter compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.idea.project.getExtraLanguageFeatures[ValueParameterDescriptorImpl]

'additionalArguments' @ [153:31] ==> public final var additionalArguments: String defined in org.jetbrains.kotlin.config.CompilerSettings[DeserializedPropertyDescriptor]

'contains' @ [153:52] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'multiPlatformProjectsArg' @ [153:61] ==> private val multiPlatformProjectsArg: String defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'module' @ [154:14] ==> value-parameter module: Module? defined in org.jetbrains.kotlin.idea.project.getExtraLanguageFeatures[ValueParameterDescriptorImpl]

'module' @ [154:32] ==> value-parameter module: Module? defined in org.jetbrains.kotlin.idea.project.getExtraLanguageFeatures[ValueParameterDescriptorImpl]

'implementsCommonModule' @ [154:39] ==> private val Module.implementsCommonModule: Boolean defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'put' @ [155:13] ==> public abstract fun put(key: LanguageFeature, value: LanguageFeature.State): LanguageFeature.State? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'MultiPlatformProjects' @ [155:33] ==> enum entry MultiPlatformProjects defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED' @ [155:78] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'==' @ [162:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[DeserializedSimpleFunctionDescriptor]

'getService' @ [162:28] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(ProjectFileIndex..ProjectFileIndex?)>): (ProjectFileIndex..ProjectFileIndex?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.roots.ProjectFileIndex..com.intellij.openapi.roots.ProjectFileIndex?)

'containingKtFile' @ [162:39] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'project' @ [162:56] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'java' @ [162:89] ==> public val <T> KClass<ProjectFileIndex>.java: Class<ProjectFileIndex> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ProjectFileIndex

'LanguageVersionSettingsImpl' @ [163:20] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl[FakeCallableDescriptorForObject]

'DEFAULT' @ [163:48] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'?:' @ [165:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: LanguageVersionSettings?, right: LanguageVersionSettings): LanguageVersionSettings[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> LanguageVersionSettings

'findModuleForPsiElement' @ [165:31] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'this' @ [165:55] ==> <this> defined in org.jetbrains.kotlin.idea.project.languageVersionSettings[ReceiverParameterDescriptorImpl]

'languageVersionSettings' @ [165:62] ==> public val Module.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'DEFAULT' @ [165:117] ==> @field:JvmField public final val DEFAULT: LanguageVersionSettingsImpl defined in org.jetbrains.kotlin.config.LanguageVersionSettingsImpl.Companion[DeserializedPropertyDescriptor]

'==' @ [170:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[DeserializedSimpleFunctionDescriptor]

'getService' @ [170:28] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(ProjectFileIndex..ProjectFileIndex?)>): (ProjectFileIndex..ProjectFileIndex?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.roots.ProjectFileIndex..com.intellij.openapi.roots.ProjectFileIndex?)

'containingKtFile' @ [170:39] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'project' @ [170:56] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'java' @ [170:89] ==> public val <T> KClass<ProjectFileIndex>.java: Class<ProjectFileIndex> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ProjectFileIndex

'JvmTarget' @ [171:20] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'DEFAULT' @ [171:30] ==> @field:JvmField public final val DEFAULT: JvmTarget defined in org.jetbrains.kotlin.config.JvmTarget.Companion[DeserializedPropertyDescriptor]

'?:' @ [173:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JvmTarget?, right: JvmTarget): JvmTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JvmTarget

'findModuleForPsiElement' @ [173:31] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'this' @ [173:55] ==> <this> defined in org.jetbrains.kotlin.idea.project.jvmTarget[ReceiverParameterDescriptorImpl]

'targetPlatform' @ [173:62] ==> public val Module.targetPlatform: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'version' @ [173:78] ==> public final val version: TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformKind[DeserializedPropertyDescriptor]

'DEFAULT' @ [173:113] ==> @field:JvmField public final val DEFAULT: JvmTarget defined in org.jetbrains.kotlin.config.JvmTarget.Companion[DeserializedPropertyDescriptor]

