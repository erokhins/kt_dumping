'when (moduleInfo) {
                is ModuleSourceInfo -> moduleInfo.module.languageVersionSettings
                is LibraryInfo -> project.getLanguageVersionSettings(extraAnalysisFlags = getExtraAnalysisFlags(project))
                else -> project.getLanguageVersionSettings()
            }' @ [34:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LanguageVersionSettings, entry1: LanguageVersionSettings, entry2: LanguageVersionSettings): LanguageVersionSettings[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LanguageVersionSettings

'moduleInfo' @ [34:19] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getLanguageVersionSettings[ValueParameterDescriptorImpl]

'moduleInfo' @ [35:40] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getLanguageVersionSettings[ValueParameterDescriptorImpl]

'module' @ [35:51] ==> public abstract val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo[PropertyDescriptorImpl]

'languageVersionSettings' @ [35:58] ==> public val Module.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'project' @ [36:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getLanguageVersionSettings[ValueParameterDescriptorImpl]

'getLanguageVersionSettings' @ [36:43] ==> @JvmOverloads public fun Project.getLanguageVersionSettings(contextModule: Module? = ..., extraAnalysisFlags: Map<AnalysisFlag<*>, Any?> = ...): LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[SimpleFunctionDescriptorImpl]

'getExtraAnalysisFlags' @ [36:91] ==> private final fun getExtraAnalysisFlags(project: Project): Map<AnalysisFlag<*>, Any?> defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider[SimpleFunctionDescriptorImpl]

'project' @ [36:113] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getLanguageVersionSettings[ValueParameterDescriptorImpl]

'project' @ [37:25] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getLanguageVersionSettings[ValueParameterDescriptorImpl]

'getLanguageVersionSettings' @ [37:33] ==> @JvmOverloads public fun Project.getLanguageVersionSettings(contextModule: Module? = ..., extraAnalysisFlags: Map<AnalysisFlag<*>, Any?> = ...): LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[SimpleFunctionDescriptorImpl]

'mutableMapOf' @ [41:19] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<AnalysisFlag<*>, Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> AnalysisFlag<*>
    <V> -> Any

'iterator' @ [42:24] ==> public final operator fun iterator(): Iterator<(Module..Module?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [42:38] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [42:50] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[ValueParameterDescriptorImpl]

'modules' @ [42:59] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'KotlinFacetSettingsProvider' @ [43:28] ==> public companion object defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[FakeCallableDescriptorForObject]

'getInstance' @ [43:56] ==> public final fun getInstance(project: Project): KotlinFacetSettingsProvider defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [43:68] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[ValueParameterDescriptorImpl]

'getSettings' @ [43:77] ==> public abstract fun getSettings(module: Module): KotlinFacetSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[DeserializedSimpleFunctionDescriptor]

'module' @ [43:89] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[LocalVariableDescriptor]

'settings' @ [44:37] ==> val settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[LocalVariableDescriptor]

'compilerArguments' @ [44:46] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'Jsr305State' @ [46:31] ==> public companion object defined in org.jetbrains.kotlin.utils.Jsr305State[FakeCallableDescriptorForObject]

'findByDescription' @ [46:43] ==> public final fun findByDescription(description: String?): Jsr305State? defined in org.jetbrains.kotlin.utils.Jsr305State.Companion[DeserializedSimpleFunctionDescriptor]

'compilerArguments' @ [46:61] ==> val compilerArguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[LocalVariableDescriptor]

'jsr305GlobalState' @ [46:79] ==> @Argument public final var jsr305GlobalState: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'jsr305state' @ [47:17] ==> val jsr305state: Jsr305State? defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[LocalVariableDescriptor]

'jsr305state' @ [47:40] ==> val jsr305state: Jsr305State? defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[LocalVariableDescriptor]

'Jsr305State' @ [47:55] ==> public companion object defined in org.jetbrains.kotlin.utils.Jsr305State[FakeCallableDescriptorForObject]

'IGNORE' @ [47:67] ==> enum entry IGNORE defined in org.jetbrains.kotlin.utils.Jsr305State[FakeCallableDescriptorForObject]

'map' @ [48:17] ==> val map: MutableMap<AnalysisFlag<*>, Any> defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[LocalVariableDescriptor]

'put' @ [48:21] ==> public abstract fun put(key: AnalysisFlag<*>, value: Any): Any? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'AnalysisFlag' @ [48:25] ==> public companion object Flags defined in org.jetbrains.kotlin.config.AnalysisFlag[FakeCallableDescriptorForObject]

'jsr305GlobalState' @ [48:38] ==> @JvmStatic public final val jsr305GlobalState: AnalysisFlag<Jsr305State> defined in org.jetbrains.kotlin.config.AnalysisFlag.Flags[DeserializedPropertyDescriptor]

'jsr305state' @ [48:57] ==> val jsr305state: Jsr305State? defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[LocalVariableDescriptor]

'map' @ [52:16] ==> val map: MutableMap<AnalysisFlag<*>, Any> defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getExtraAnalysisFlags[LocalVariableDescriptor]

'?:' @ [56:16] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TargetPlatformVersion?, right: TargetPlatformVersion): TargetPlatformVersion[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> TargetPlatformVersion

'moduleInfo' @ [56:17] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.compiler.IDELanguageSettingsProvider.getTargetPlatform[ValueParameterDescriptorImpl]

'module' @ [56:51] ==> public abstract val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo[PropertyDescriptorImpl]

'targetPlatform' @ [56:59] ==> public val Module.targetPlatform: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.project in file Platform.kt[PropertyDescriptorImpl]

'version' @ [56:75] ==> public final val version: TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformKind[DeserializedPropertyDescriptor]

'NoVersion' @ [56:108] ==> public object NoVersion : TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformVersion[FakeCallableDescriptorForObject]

