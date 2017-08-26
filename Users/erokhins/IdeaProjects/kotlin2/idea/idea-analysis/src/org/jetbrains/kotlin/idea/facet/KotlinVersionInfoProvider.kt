'create' @ [29:89] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): ExtensionPointName<(KotlinVersionInfoProvider..KotlinVersionInfoProvider?)> defined in com.intellij.openapi.extensions.ExtensionPointName[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinVersionInfoProvider

'KotlinVersionInfoProvider' @ [45:12] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider[FakeCallableDescriptorForObject]

'EP_NAME' @ [45:38] ==> public final val EP_NAME: ExtensionPointName<KotlinVersionInfoProvider> defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider.Companion[PropertyDescriptorImpl]

'extensions' @ [46:21] ==> public final val <T : (Any..Any?)> ExtensionPointName<KotlinVersionInfoProvider>.extensions: (Array<(KotlinVersionInfoProvider..KotlinVersionInfoProvider?)>..Array<out (KotlinVersionInfoProvider..KotlinVersionInfoProvider?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinVersionInfoProvider

'map' @ [47:21] ==> public inline fun <T, R> Array<out (KotlinVersionInfoProvider..KotlinVersionInfoProvider?)>.map(transform: ((KotlinVersionInfoProvider..KotlinVersionInfoProvider?)) -> Collection<String>): List<Collection<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider..org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider?)
    <R> -> Collection<String>

'it' @ [47:27] ==> value-parameter it: (KotlinVersionInfoProvider..KotlinVersionInfoProvider?) defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersions.<anonymous>[ValueParameterDescriptorImpl]

'getLibraryVersions' @ [47:30] ==> public abstract fun getLibraryVersions(module: Module, targetPlatform: TargetPlatformKind<*>, rootModel: ModuleRootModel?): Collection<String> defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider[SimpleFunctionDescriptorImpl]

'module' @ [47:49] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersions[ValueParameterDescriptorImpl]

'targetPlatform' @ [47:57] ==> value-parameter targetPlatform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersions[ValueParameterDescriptorImpl]

'rootModel' @ [47:73] ==> value-parameter rootModel: ModuleRootModel? defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersions[ValueParameterDescriptorImpl]

'firstOrNull' @ [48:21] ==> public inline fun <T> Iterable<Collection<String>>.firstOrNull(predicate: (Collection<String>) -> Boolean): Collection<String>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<String>

'it' @ [48:35] ==> value-parameter it: Collection<String> defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersions.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [48:38] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'emptyList' @ [48:56] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getRuntimeLibraryVersions' @ [56:22] ==> public fun getRuntimeLibraryVersions(module: Module, rootModel: ModuleRootModel?, targetPlatform: TargetPlatformKind<*>): Collection<String> defined in org.jetbrains.kotlin.idea.facet[SimpleFunctionDescriptorImpl]

'module' @ [56:48] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.getLibraryLanguageLevel[ValueParameterDescriptorImpl]

'rootModel' @ [56:56] ==> value-parameter rootModel: ModuleRootModel? defined in org.jetbrains.kotlin.idea.facet.getLibraryLanguageLevel[ValueParameterDescriptorImpl]

'targetPlatform' @ [56:67] ==> value-parameter targetPlatform: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.facet.getLibraryLanguageLevel[ValueParameterDescriptorImpl]

'TargetPlatformKind' @ [56:85] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'DEFAULT_PLATFORM' @ [56:104] ==> public final val DEFAULT_PLATFORM: TargetPlatformKind<*> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Companion[DeserializedPropertyDescriptor]

'minWith' @ [57:14] ==> public fun <T> Iterable<String>.minWith(comparator: Comparator<in String> /* = Comparator<in String> */): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'COMPARATOR' @ [57:44] ==> public final val COMPARATOR: (Comparator<(String..String?)>..Comparator<(String..String?)>?) defined in com.intellij.util.text.VersionComparatorUtil[JavaPropertyDescriptor]

'getDefaultLanguageLevel' @ [58:12] ==> public fun getDefaultLanguageLevel(module: Module, explicitVersion: String? = ...): LanguageVersion defined in org.jetbrains.kotlin.idea.facet in file KotlinVersionInfoProvider.kt[SimpleFunctionDescriptorImpl]

'module' @ [58:36] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.getLibraryLanguageLevel[ValueParameterDescriptorImpl]

'minVersion' @ [58:44] ==> val minVersion: String? defined in org.jetbrains.kotlin.idea.facet.getLibraryLanguageLevel[LocalVariableDescriptor]

'explicitVersion' @ [65:22] ==> value-parameter explicitVersion: String? = ... defined in org.jetbrains.kotlin.idea.facet.getDefaultLanguageLevel[ValueParameterDescriptorImpl]

'KotlinVersionInfoProvider' @ [66:25] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider[FakeCallableDescriptorForObject]

'EP_NAME' @ [66:51] ==> public final val EP_NAME: ExtensionPointName<KotlinVersionInfoProvider> defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider.Companion[PropertyDescriptorImpl]

'extensions' @ [66:59] ==> public final val <T : (Any..Any?)> ExtensionPointName<KotlinVersionInfoProvider>.extensions: (Array<(KotlinVersionInfoProvider..KotlinVersionInfoProvider?)>..Array<out (KotlinVersionInfoProvider..KotlinVersionInfoProvider?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinVersionInfoProvider

'mapNotNull' @ [67:31] ==> public inline fun <T, R : Any> Array<out (KotlinVersionInfoProvider..KotlinVersionInfoProvider?)>.mapNotNull(transform: ((KotlinVersionInfoProvider..KotlinVersionInfoProvider?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider..org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider?)
    <R : Any> -> String

'it' @ [67:44] ==> value-parameter it: (KotlinVersionInfoProvider..KotlinVersionInfoProvider?) defined in org.jetbrains.kotlin.idea.facet.getDefaultLanguageLevel.<anonymous>[ValueParameterDescriptorImpl]

'getCompilerVersion' @ [67:47] ==> public abstract fun getCompilerVersion(module: Module): String? defined in org.jetbrains.kotlin.idea.facet.KotlinVersionInfoProvider[SimpleFunctionDescriptorImpl]

'module' @ [67:66] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.getDefaultLanguageLevel[ValueParameterDescriptorImpl]

'minWith' @ [68:31] ==> public fun <T> Iterable<String>.minWith(comparator: Comparator<in String> /* = Comparator<in String> */): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'COMPARATOR' @ [68:61] ==> public final val COMPARATOR: (Comparator<(String..String?)>..Comparator<(String..String?)>?) defined in com.intellij.util.text.VersionComparatorUtil[JavaPropertyDescriptor]

'LanguageVersion' @ [69:32] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [69:48] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'when {
        libVersion.startsWith("1.2") -> LanguageVersion.KOTLIN_1_2
        libVersion.startsWith("1.1") -> LanguageVersion.KOTLIN_1_1
        libVersion.startsWith("1.0") -> LanguageVersion.KOTLIN_1_0
        else -> LanguageVersion.LATEST_STABLE
    }' @ [70:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LanguageVersion, entry1: LanguageVersion, entry2: LanguageVersion, entry3: LanguageVersion): LanguageVersion[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> LanguageVersion

'libVersion' @ [71:9] ==> val libVersion: String defined in org.jetbrains.kotlin.idea.facet.getDefaultLanguageLevel[LocalVariableDescriptor]

'startsWith' @ [71:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LanguageVersion' @ [71:41] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'KOTLIN_1_2' @ [71:57] ==> enum entry KOTLIN_1_2 defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'libVersion' @ [72:9] ==> val libVersion: String defined in org.jetbrains.kotlin.idea.facet.getDefaultLanguageLevel[LocalVariableDescriptor]

'startsWith' @ [72:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LanguageVersion' @ [72:41] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'KOTLIN_1_1' @ [72:57] ==> enum entry KOTLIN_1_1 defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'libVersion' @ [73:9] ==> val libVersion: String defined in org.jetbrains.kotlin.idea.facet.getDefaultLanguageLevel[LocalVariableDescriptor]

'startsWith' @ [73:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LanguageVersion' @ [73:41] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'KOTLIN_1_0' @ [73:57] ==> enum entry KOTLIN_1_0 defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'LanguageVersion' @ [74:17] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [74:33] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'KotlinFacetSettingsProvider' @ [79:26] ==> public companion object defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[FakeCallableDescriptorForObject]

'getInstance' @ [79:54] ==> public final fun getInstance(project: Project): KotlinFacetSettingsProvider defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider.Companion[DeserializedSimpleFunctionDescriptor]

'module' @ [79:66] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersion[ValueParameterDescriptorImpl]

'project' @ [79:73] ==> public final val Module.project: Project[MyPropertyDescriptor]

'getInitializedSettings' @ [79:82] ==> public abstract fun getInitializedSettings(module: Module): KotlinFacetSettings defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[DeserializedSimpleFunctionDescriptor]

'module' @ [79:105] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersion[ValueParameterDescriptorImpl]

'targetPlatformKind' @ [79:113] ==> public final val targetPlatformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'getRuntimeLibraryVersions' @ [80:20] ==> public fun getRuntimeLibraryVersions(module: Module, rootModel: ModuleRootModel?, targetPlatform: TargetPlatformKind<*>): Collection<String> defined in org.jetbrains.kotlin.idea.facet[SimpleFunctionDescriptorImpl]

'module' @ [80:46] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersion[ValueParameterDescriptorImpl]

'targetPlatform' @ [80:60] ==> val targetPlatform: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersion[LocalVariableDescriptor]

'TargetPlatformKind' @ [80:78] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'DEFAULT_PLATFORM' @ [80:97] ==> public final val DEFAULT_PLATFORM: TargetPlatformKind<*> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Companion[DeserializedPropertyDescriptor]

'versions' @ [81:12] ==> val versions: Collection<String> defined in org.jetbrains.kotlin.idea.facet.getRuntimeLibraryVersion[LocalVariableDescriptor]

'toSet' @ [81:21] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'singleOrNull' @ [81:29] ==> public fun <T> Iterable<String>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

