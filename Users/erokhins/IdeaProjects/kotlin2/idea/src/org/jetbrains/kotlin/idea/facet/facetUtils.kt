'TargetPlatformKind' @ [41:22] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'ALL_PLATFORMS' @ [41:41] ==> public final val ALL_PLATFORMS: List<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Companion[DeserializedPropertyDescriptor]

'platform' @ [42:13] ==> val platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[LocalVariableDescriptor]

'version' @ [42:22] ==> public final val version: TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformKind[DeserializedPropertyDescriptor]

'NoVersion' @ [42:55] ==> public object NoVersion : TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformVersion[FakeCallableDescriptorForObject]

'getRuntimeLibraryVersions' @ [43:13] ==> public fun getRuntimeLibraryVersions(module: Module, rootModel: ModuleRootModel?, targetPlatform: TargetPlatformKind<*>): Collection<String> defined in org.jetbrains.kotlin.idea.facet[DeserializedSimpleFunctionDescriptor]

'module' @ [43:39] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[ValueParameterDescriptorImpl]

'rootModel' @ [43:47] ==> value-parameter rootModel: ModuleRootModel? defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[ValueParameterDescriptorImpl]

'platform' @ [43:58] ==> val platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[LocalVariableDescriptor]

'isNotEmpty' @ [43:68] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'platform' @ [44:20] ==> val platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[LocalVariableDescriptor]

'rootModel' @ [48:17] ==> value-parameter rootModel: ModuleRootModel? defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[ValueParameterDescriptorImpl]

'getInstance' @ [48:48] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [48:60] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[ValueParameterDescriptorImpl]

'sdk' @ [48:70] ==> public final val ModuleRootModel.sdk: Sdk?[MyPropertyDescriptor]

'sdk' @ [49:23] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[LocalVariableDescriptor]

'sdkType' @ [49:28] ==> public final val Sdk.sdkType: SdkTypeId[MyPropertyDescriptor]

'getVersion' @ [49:50] ==> @Nullable public abstract fun getVersion(@NotNull p0: Sdk): JavaSdkVersion? defined in com.intellij.openapi.projectRoots.JavaSdk[JavaMethodDescriptor]

'sdk' @ [49:61] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[LocalVariableDescriptor]

'when {
        sdkVersion == null || sdkVersion >= JavaSdkVersion.JDK_1_8 -> TargetPlatformKind.Jvm[JvmTarget.JVM_1_8]
        else -> TargetPlatformKind.Jvm[JvmTarget.JVM_1_6]
    }' @ [50:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TargetPlatformKind<*>, entry1: TargetPlatformKind<*>): TargetPlatformKind<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TargetPlatformKind<*>

'sdkVersion' @ [51:9] ==> val sdkVersion: JavaSdkVersion? defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[LocalVariableDescriptor]

'sdkVersion' @ [51:31] ==> val sdkVersion: JavaSdkVersion? defined in org.jetbrains.kotlin.idea.facet.getDefaultTargetPlatform[LocalVariableDescriptor]

'JDK_1_8' @ [51:60] ==> enum entry JDK_1_8 defined in com.intellij.openapi.projectRoots.JavaSdkVersion[FakeCallableDescriptorForObject]

'TargetPlatformKind' @ [51:71] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Jvm' @ [51:90] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[FakeCallableDescriptorForObject]

'JvmTarget' @ [51:94] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_8' @ [51:104] ==> enum entry JVM_1_8 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'TargetPlatformKind' @ [52:17] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Jvm' @ [52:36] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[FakeCallableDescriptorForObject]

'JvmTarget' @ [52:40] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_6' @ [52:50] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'module' @ [61:19] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[ValueParameterDescriptorImpl]

'project' @ [61:26] ==> public final val Module.project: Project[MyPropertyDescriptor]

'compilerSettings' @ [63:9] ==> public final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'compilerSettings' @ [64:9] ==> public final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'KotlinCompilerSettings' @ [64:28] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings[FakeCallableDescriptorForObject]

'getInstance' @ [64:51] ==> public final fun getInstance(project: Project): KotlinCompilerSettings defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [64:63] ==> val project: Project defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[LocalVariableDescriptor]

'settings' @ [64:72] ==> public final var settings: CompilerSettings defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings[DeserializedPropertyDescriptor]

'KotlinCommonCompilerArgumentsHolder' @ [67:27] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [67:63] ==> public final fun getInstance(project: Project): KotlinCommonCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'module' @ [67:75] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[ValueParameterDescriptorImpl]

'project' @ [67:82] ==> public final val Module.project: Project[MyPropertyDescriptor]

'settings' @ [67:91] ==> public final var settings: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[DeserializedPropertyDescriptor]

'compilerArguments' @ [69:9] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'platformKind' @ [70:34] ==> value-parameter platformKind: TargetPlatformKind<*>? = ... defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[ValueParameterDescriptorImpl]

'getDefaultTargetPlatform' @ [70:50] ==> private fun getDefaultTargetPlatform(module: Module, rootModel: ModuleRootModel?): TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [70:75] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[ValueParameterDescriptorImpl]

'rootModel' @ [70:83] ==> value-parameter rootModel: ModuleRootModel? defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[ValueParameterDescriptorImpl]

'compilerArguments' @ [71:9] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'targetPlatformKind' @ [71:29] ==> val targetPlatformKind: TargetPlatformKind<TargetPlatformVersion> defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[LocalVariableDescriptor]

'createCompilerArguments' @ [71:48] ==> public fun TargetPlatformKind<*>.createCompilerArguments(init: CommonCompilerArguments.() -> Unit = ...): CommonCompilerArguments defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'targetPlatformKind' @ [72:13] ==> val targetPlatformKind: TargetPlatformKind<TargetPlatformVersion> defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[LocalVariableDescriptor]

'getPlatformCompilerArgumentsByProject' @ [72:32] ==> public fun TargetPlatformKind<*>.getPlatformCompilerArgumentsByProject(project: Project): CommonCompilerArguments? defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [72:70] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[ValueParameterDescriptorImpl]

'project' @ [72:77] ==> public final val Module.project: Project[MyPropertyDescriptor]

'let' @ [72:87] ==> @InlineOnly public inline fun <T, R> CommonCompilerArguments.let(block: (CommonCompilerArguments) -> CommonCompilerArguments): CommonCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommonCompilerArguments
    <R> -> CommonCompilerArguments

'mergeBeans' @ [72:93] ==> public fun <From : Any, To : CommonCompilerArguments> mergeBeans(from: CommonCompilerArguments, to: CommonCompilerArguments): CommonCompilerArguments defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <From : Any> -> CommonCompilerArguments
    <To : From> -> CommonCompilerArguments

'it' @ [72:104] ==> value-parameter it: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [72:108] ==> <this> defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded.<anonymous>[ReceiverParameterDescriptorImpl]

'mergeBeans' @ [73:13] ==> public fun <From : Any, To : CommonCompilerArguments> mergeBeans(from: CommonCompilerArguments, to: CommonCompilerArguments): CommonCompilerArguments defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <From : Any> -> CommonCompilerArguments
    <To : From> -> CommonCompilerArguments

'commonArguments' @ [73:24] ==> val commonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[LocalVariableDescriptor]

'this' @ [73:41] ==> <this> defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded.<anonymous>[ReceiverParameterDescriptorImpl]

'languageLevel' @ [77:9] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'languageLevel' @ [78:9] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'?:' @ [78:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: LanguageVersion?, right: LanguageVersion?): LanguageVersion?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> LanguageVersion?

'if (useProjectSettings) LanguageVersion.fromVersionString(commonArguments.languageVersion) else null' @ [78:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LanguageVersion?, elseBranch: LanguageVersion?): LanguageVersion?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LanguageVersion?

'useProjectSettings' @ [78:30] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'LanguageVersion' @ [78:50] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'fromVersionString' @ [78:66] ==> @JvmStatic public final fun fromVersionString(str: String?): LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedSimpleFunctionDescriptor]

'commonArguments' @ [78:84] ==> val commonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[LocalVariableDescriptor]

'languageVersion' @ [78:100] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'getDefaultLanguageLevel' @ [79:28] ==> public fun getDefaultLanguageLevel(module: Module, explicitVersion: String? = ...): LanguageVersion defined in org.jetbrains.kotlin.idea.facet[DeserializedSimpleFunctionDescriptor]

'module' @ [79:52] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[ValueParameterDescriptorImpl]

'apiLevel' @ [82:9] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'apiLevel' @ [83:9] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'if (useProjectSettings) {
            LanguageVersion.fromVersionString(commonArguments.apiVersion) ?: languageLevel
        }
        else {
            languageLevel!!.coerceAtMost(getLibraryLanguageLevel(module, rootModel, targetPlatformKind!!))
        }' @ [83:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: LanguageVersion?, elseBranch: LanguageVersion?): LanguageVersion?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LanguageVersion?

'useProjectSettings' @ [83:24] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'LanguageVersion' @ [84:13] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'fromVersionString' @ [84:29] ==> @JvmStatic public final fun fromVersionString(str: String?): LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedSimpleFunctionDescriptor]

'commonArguments' @ [84:47] ==> val commonArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[LocalVariableDescriptor]

'apiVersion' @ [84:63] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'languageLevel' @ [84:78] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'languageLevel' @ [87:13] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'coerceAtMost' @ [87:29] ==> public fun <T : Comparable<LanguageVersion>> LanguageVersion.coerceAtMost(maximumValue: LanguageVersion): LanguageVersion defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> LanguageVersion

'getLibraryLanguageLevel' @ [87:42] ==> public fun getLibraryLanguageLevel(module: Module, rootModel: ModuleRootModel?, targetPlatform: TargetPlatformKind<*>?): LanguageVersion defined in org.jetbrains.kotlin.idea.facet[DeserializedSimpleFunctionDescriptor]

'module' @ [87:66] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[ValueParameterDescriptorImpl]

'rootModel' @ [87:74] ==> value-parameter rootModel: ModuleRootModel? defined in org.jetbrains.kotlin.idea.facet.initializeIfNeeded[ValueParameterDescriptorImpl]

'targetPlatformKind' @ [87:85] ==> public final val targetPlatformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'when (this) {
        is TargetPlatformKind.Jvm -> Kotlin2JvmCompilerArgumentsHolder.getInstance(project).settings
        is TargetPlatformKind.JavaScript -> Kotlin2JsCompilerArgumentsHolder.getInstance(project).settings
        else -> null
    }' @ [93:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CommonCompilerArguments?, entry1: CommonCompilerArguments?, entry2: CommonCompilerArguments?): CommonCompilerArguments?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CommonCompilerArguments?

'this' @ [93:18] ==> <this> defined in org.jetbrains.kotlin.idea.facet.getPlatformCompilerArgumentsByProject[ReceiverParameterDescriptorImpl]

'Kotlin2JvmCompilerArgumentsHolder' @ [94:38] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [94:72] ==> public final fun getInstance(project: Project): Kotlin2JvmCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [94:84] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.facet.getPlatformCompilerArgumentsByProject[ValueParameterDescriptorImpl]

'settings' @ [94:93] ==> public final var settings: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder[DeserializedPropertyDescriptor]

'Kotlin2JsCompilerArgumentsHolder' @ [95:45] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [95:78] ==> public final fun getInstance(project: Project): Kotlin2JsCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [95:90] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.facet.getPlatformCompilerArgumentsByProject[ValueParameterDescriptorImpl]

'settings' @ [95:99] ==> public final var settings: K2JSCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder[DeserializedPropertyDescriptor]

'when (this) {
        is TargetPlatformKind.Jvm -> listOf(MAVEN_STDLIB_ID, MAVEN_STDLIB_ID_JRE7, MAVEN_STDLIB_ID_JRE8)
        is TargetPlatformKind.JavaScript -> listOf(MAVEN_JS_STDLIB_ID, MAVEN_OLD_JS_STDLIB_ID)
        is TargetPlatformKind.Common -> listOf(MAVEN_COMMON_STDLIB_ID)
    }' @ [101:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<String>, entry1: List<String>, entry2: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<String>

'this' @ [101:19] ==> <this> defined in org.jetbrains.kotlin.idea.facet.mavenLibraryIds[ReceiverParameterDescriptorImpl]

'listOf' @ [102:38] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'MAVEN_STDLIB_ID' @ [102:45] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'MAVEN_STDLIB_ID_JRE7' @ [102:62] ==> public val MAVEN_STDLIB_ID_JRE7: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'MAVEN_STDLIB_ID_JRE8' @ [102:84] ==> public val MAVEN_STDLIB_ID_JRE8: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'listOf' @ [103:45] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'MAVEN_JS_STDLIB_ID' @ [103:52] ==> public val MAVEN_JS_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'MAVEN_OLD_JS_STDLIB_ID' @ [103:72] ==> public val MAVEN_OLD_JS_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'listOf' @ [104:41] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'MAVEN_COMMON_STDLIB_ID' @ [104:48] ==> public val MAVEN_COMMON_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'lazy' @ [107:69] ==> public fun <T> lazy(initializer: () -> Map<String, TargetPlatformKind<TargetPlatformVersion>>): Lazy<Map<String, TargetPlatformKind<TargetPlatformVersion>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<String, TargetPlatformKind<TargetPlatformVersion>>

'TargetPlatformKind' @ [108:5] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'ALL_PLATFORMS' @ [108:24] ==> public final val ALL_PLATFORMS: List<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Companion[DeserializedPropertyDescriptor]

'flatMap' @ [109:14] ==> public inline fun <T, R> Iterable<TargetPlatformKind<*>>.flatMap(transform: (TargetPlatformKind<*>) -> Iterable<Pair<String, TargetPlatformKind<TargetPlatformVersion>>>): List<Pair<String, TargetPlatformKind<TargetPlatformVersion>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>
    <R> -> Pair<String, TargetPlatformKind<TargetPlatformVersion>>

'platform' @ [109:36] ==> value-parameter platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.mavenLibraryIdToPlatform.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mavenLibraryIds' @ [109:45] ==> public val TargetPlatformKind<*>.mavenLibraryIds: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'map' @ [109:61] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Pair<String, TargetPlatformKind<TargetPlatformVersion>>): List<Pair<String, TargetPlatformKind<TargetPlatformVersion>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Pair<String, TargetPlatformKind<TargetPlatformVersion>>

'it' @ [109:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.facet.mavenLibraryIdToPlatform.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'platform' @ [109:73] ==> value-parameter platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.facet.mavenLibraryIdToPlatform.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sortedByDescending' @ [110:14] ==> public inline fun <T, R : Comparable<Int>> Iterable<Pair<String, TargetPlatformKind<TargetPlatformVersion>>>.sortedByDescending(crossinline selector: (Pair<String, TargetPlatformKind<TargetPlatformVersion>>) -> Int?): List<Pair<String, TargetPlatformKind<TargetPlatformVersion>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<String, TargetPlatformKind<TargetPlatformVersion>>
    <R : Comparable<R>> -> Int

'it' @ [110:35] ==> value-parameter it: Pair<String, TargetPlatformKind<TargetPlatformVersion>> defined in org.jetbrains.kotlin.idea.facet.mavenLibraryIdToPlatform.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [110:38] ==> public final val first: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'length' @ [110:44] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'toMap' @ [111:14] ==> public fun <K, V> Iterable<Pair<String, TargetPlatformKind<TargetPlatformVersion>>>.toMap(): Map<String, TargetPlatformKind<TargetPlatformVersion>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> TargetPlatformKind<TargetPlatformVersion>

'modelsProvider' @ [117:22] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[ValueParameterDescriptorImpl]

'getModifiableFacetModel' @ [117:37] ==> @NotNull public abstract fun getModifiableFacetModel(p0: (Module..Module?)): ModifiableFacetModel defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'this' @ [117:61] ==> <this> defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[ReceiverParameterDescriptorImpl]

'facetModel' @ [119:17] ==> val facetModel: ModifiableFacetModel defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[LocalVariableDescriptor]

'findFacet' @ [119:28] ==> @Nullable public abstract fun <F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)> findFacet(p0: (FacetTypeId<(KotlinFacet..KotlinFacet?)>..FacetTypeId<(KotlinFacet..KotlinFacet?)>?), p1: (String..String?)): KotlinFacet? defined in com.intellij.facet.ModifiableFacetModel[JavaMethodDescriptor]
Inferred types:
    <F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)> -> KotlinFacet

'KotlinFacetType' @ [119:38] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType[FakeCallableDescriptorForObject]

'TYPE_ID' @ [119:54] ==> public final val TYPE_ID: FacetTypeId<KotlinFacet> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.Companion[PropertyDescriptorImpl]

'KotlinFacetType' @ [119:63] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType[FakeCallableDescriptorForObject]

'INSTANCE' @ [119:79] ==> public final val INSTANCE: KotlinFacetType defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.Companion[PropertyDescriptorImpl]

'defaultFacetName' @ [119:88] ==> public final val KotlinFacetType.defaultFacetName: String[MyPropertyDescriptor]

'with' @ [120:20] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinFacetType, block: KotlinFacetType.() -> KotlinFacet): KotlinFacet defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacetType
    <R> -> KotlinFacet

'KotlinFacetType' @ [120:25] ==> public companion object defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType[FakeCallableDescriptorForObject]

'INSTANCE' @ [120:41] ==> public final val INSTANCE: KotlinFacetType defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.Companion[PropertyDescriptorImpl]

'createFacet' @ [120:53] ==> public open fun createFacet(module: Module, name: String, configuration: KotlinFacetConfiguration, underlyingFacet: Facet<*>?): KotlinFacet defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType[SimpleFunctionDescriptorImpl]

'this@getOrCreateFacet' @ [120:65] ==> <this> defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[ReceiverParameterDescriptorImpl]

'defaultFacetName' @ [120:88] ==> public final val KotlinFacetType.defaultFacetName: String[MyPropertyDescriptor]

'createDefaultConfiguration' @ [120:106] ==> public open fun createDefaultConfiguration(): KotlinFacetConfiguration defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType[SimpleFunctionDescriptorImpl]

'apply' @ [121:26] ==> @InlineOnly public inline fun <T> KotlinFacet.apply(block: KotlinFacet.() -> Unit): KotlinFacet defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacet

'facetModel' @ [121:34] ==> val facetModel: ModifiableFacetModel defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[LocalVariableDescriptor]

'addFacet' @ [121:45] ==> public abstract fun addFacet(p0: raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)): Unit defined in com.intellij.facet.ModifiableFacetModel[JavaMethodDescriptor]

'this' @ [121:54] ==> <this> defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet.<anonymous>[ReceiverParameterDescriptorImpl]

'facet' @ [122:5] ==> val facet: KotlinFacet defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[LocalVariableDescriptor]

'configuration' @ [122:11] ==> public final val KotlinFacet.configuration: KotlinFacetConfiguration[MyPropertyDescriptor]

'settings' @ [122:25] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'useProjectSettings' @ [122:34] ==> public final var useProjectSettings: Boolean defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'useProjectSettings' @ [122:55] ==> value-parameter useProjectSettings: Boolean defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[ValueParameterDescriptorImpl]

'commitModel' @ [123:9] ==> value-parameter commitModel: Boolean = ... defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[ValueParameterDescriptorImpl]

'runWriteAction' @ [124:9] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'facetModel' @ [125:13] ==> val facetModel: ModifiableFacetModel defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[LocalVariableDescriptor]

'commit' @ [125:24] ==> public abstract fun commit(): Unit defined in com.intellij.facet.ModifiableFacetModel[JavaMethodDescriptor]

'facet' @ [128:12] ==> val facet: KotlinFacet defined in org.jetbrains.kotlin.idea.facet.getOrCreateFacet[LocalVariableDescriptor]

'module' @ [137:18] ==> public final val KotlinFacet.module: Module[MyPropertyDescriptor]

'with' @ [138:5] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinFacetSettings, block: KotlinFacetSettings.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacetSettings
    <R> -> Unit

'configuration' @ [138:10] ==> public final val KotlinFacet.configuration: KotlinFacetConfiguration[MyPropertyDescriptor]

'settings' @ [138:24] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'compilerArguments' @ [139:9] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'compilerSettings' @ [140:9] ==> public final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'initializeIfNeeded' @ [141:9] ==> public fun KotlinFacetSettings.initializeIfNeeded(module: Module, rootModel: ModuleRootModel?, platformKind: TargetPlatformKind<*>? = ...): Unit defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'module' @ [141:28] ==> val module: Module defined in org.jetbrains.kotlin.idea.facet.configureFacet[LocalVariableDescriptor]

'modelsProvider' @ [141:36] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.facet.configureFacet[ValueParameterDescriptorImpl]

'getModifiableRootModel' @ [141:51] ==> @NotNull public abstract fun getModifiableRootModel(p0: (Module..Module?)): ModifiableRootModel defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'module' @ [141:74] ==> val module: Module defined in org.jetbrains.kotlin.idea.facet.configureFacet[LocalVariableDescriptor]

'platformKind' @ [141:83] ==> value-parameter platformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.facet.configureFacet[ValueParameterDescriptorImpl]

'languageLevel' @ [142:9] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'LanguageVersion' @ [142:25] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'fromFullVersionString' @ [142:41] ==> @JvmStatic public final fun fromFullVersionString(str: String): LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedSimpleFunctionDescriptor]

'compilerVersion' @ [142:63] ==> value-parameter compilerVersion: String defined in org.jetbrains.kotlin.idea.facet.configureFacet[ValueParameterDescriptorImpl]

'LanguageVersion' @ [142:83] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [142:99] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'apiLevel' @ [144:13] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'languageLevel' @ [144:26] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'apiLevel' @ [145:13] ==> public final var apiLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'languageLevel' @ [145:24] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'this' @ [147:9] ==> <this> defined in org.jetbrains.kotlin.idea.facet.configureFacet.<anonymous>[ReceiverParameterDescriptorImpl]

'coroutineSupport' @ [147:14] ==> public final var coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'coroutineSupport' @ [147:33] ==> value-parameter coroutineSupport: LanguageFeature.State defined in org.jetbrains.kotlin.idea.facet.configureFacet[ValueParameterDescriptorImpl]

'listOf' @ [153:29] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'CommonCompilerArguments' @ [153:36] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'languageVersion' @ [153:61] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [153:77] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'CommonCompilerArguments' @ [154:36] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'apiVersion' @ [154:61] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [154:72] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'CommonCompilerArguments' @ [155:36] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'suppressWarnings' @ [155:61] ==> @GradleOption @Argument public final var suppressWarnings: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [155:78] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'CommonCompilerArguments' @ [156:36] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'coroutinesState' @ [156:61] ==> @Argument public final var coroutinesState: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [156:77] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'listOf' @ [157:36] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'CommonCompilerArguments' @ [157:43] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'pluginClasspaths' @ [157:68] ==> @Argument public final var pluginClasspaths: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [157:85] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'CommonCompilerArguments' @ [158:43] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'pluginOptions' @ [158:68] ==> @Argument public final var pluginOptions: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [158:82] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'commonUIExposedFields' @ [159:35] ==> public val commonUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'commonUIHiddenFields' @ [159:59] ==> private val commonUIHiddenFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'listOf' @ [161:42] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'K2JVMCompilerArguments' @ [161:49] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[FakeCallableDescriptorForObject]

'jvmTarget' @ [161:73] ==> @GradleOption @Argument public final var jvmTarget: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [161:83] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'K2JVMCompilerArguments' @ [162:49] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[FakeCallableDescriptorForObject]

'destination' @ [162:73] ==> @Argument public final var destination: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [162:85] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'K2JVMCompilerArguments' @ [163:49] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[FakeCallableDescriptorForObject]

'classpath' @ [163:73] ==> @Argument public final var classpath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [163:83] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'commonUIExposedFields' @ [164:26] ==> public val commonUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'jvmSpecificUIExposedFields' @ [164:50] ==> private val jvmSpecificUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'commonPrimaryFields' @ [165:32] ==> private val commonPrimaryFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'jvmSpecificUIExposedFields' @ [165:54] ==> private val jvmSpecificUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'listOf' @ [167:41] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'K2JSCompilerArguments' @ [167:48] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[FakeCallableDescriptorForObject]

'sourceMap' @ [167:71] ==> @GradleOption @Argument public final var sourceMap: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [167:81] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'K2JSCompilerArguments' @ [168:48] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[FakeCallableDescriptorForObject]

'sourceMapPrefix' @ [168:71] ==> @GradleOption @Argument public final var sourceMapPrefix: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [168:87] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'K2JSCompilerArguments' @ [169:48] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[FakeCallableDescriptorForObject]

'sourceMapEmbedSources' @ [169:71] ==> @GradleOption @Argument public final var sourceMapEmbedSources: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [169:93] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'K2JSCompilerArguments' @ [170:48] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[FakeCallableDescriptorForObject]

'outputPrefix' @ [170:71] ==> @Argument public final var outputPrefix: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [170:84] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'K2JSCompilerArguments' @ [171:48] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[FakeCallableDescriptorForObject]

'outputPostfix' @ [171:71] ==> @Argument public final var outputPostfix: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [171:85] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'K2JSCompilerArguments' @ [172:48] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[FakeCallableDescriptorForObject]

'moduleKind' @ [172:71] ==> @GradleOption @Argument public final var moduleKind: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [172:82] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'commonUIExposedFields' @ [173:25] ==> public val commonUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'jsSpecificUIExposedFields' @ [173:49] ==> private val jsSpecificUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'commonPrimaryFields' @ [174:31] ==> private val commonPrimaryFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'jsSpecificUIExposedFields' @ [174:53] ==> private val jsSpecificUIExposedFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'when (this) {
        is K2JVMCompilerArguments -> jvmPrimaryFields
        is K2JSCompilerArguments -> jsPrimaryFields
        else -> commonPrimaryFields
    }' @ [177:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<String>, entry1: List<String>, entry2: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<String>

'this' @ [177:19] ==> <this> defined in org.jetbrains.kotlin.idea.facet.primaryFields[ReceiverParameterDescriptorImpl]

'jvmPrimaryFields' @ [178:38] ==> private val jvmPrimaryFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'jsPrimaryFields' @ [179:37] ==> private val jsPrimaryFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'commonPrimaryFields' @ [180:17] ==> private val commonPrimaryFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'when (this) {
        is K2JVMCompilerArguments -> listOf(K2JVMCompilerArguments::noJdk.name, K2JVMCompilerArguments::jdkHome.name)
        else -> emptyList()
    }' @ [184:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<String>, entry1: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<String>

'this' @ [184:19] ==> <this> defined in org.jetbrains.kotlin.idea.facet.ignoredFields[ReceiverParameterDescriptorImpl]

'listOf' @ [185:38] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'K2JVMCompilerArguments' @ [185:45] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[FakeCallableDescriptorForObject]

'noJdk' @ [185:69] ==> @GradleOption @Argument public final var noJdk: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [185:75] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'K2JVMCompilerArguments' @ [185:81] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[FakeCallableDescriptorForObject]

'jdkHome' @ [185:105] ==> @GradleOption @Argument public final var jdkHome: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'name' @ [185:113] ==> public abstract val name: String defined in kotlin.reflect.KMutableProperty1[DeserializedPropertyDescriptor]

'emptyList' @ [186:17] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'compilerArguments' @ [190:19] ==> value-parameter compilerArguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.facet.configureJdkIfPossible[ValueParameterDescriptorImpl]

'jdkHome' @ [190:37] ==> @GradleOption @Argument public final var jdkHome: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'?:' @ [191:15] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Sdk?, right: Sdk): Sdk[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Sdk

'getInstance' @ [191:31] ==> public open fun getInstance(): (ProjectJdkTable..ProjectJdkTable?) defined in com.intellij.openapi.projectRoots.ProjectJdkTable[JavaMethodDescriptor]

'allJdks' @ [191:45] ==> public final val ProjectJdkTable.allJdks: (Array<(Sdk..Sdk?)>..Array<out (Sdk..Sdk?)>)[MyPropertyDescriptor]

'firstOrNull' @ [191:53] ==> public inline fun <T> Array<out (Sdk..Sdk?)>.firstOrNull(predicate: ((Sdk..Sdk?)) -> Boolean): Sdk? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.projectRoots.Sdk..com.intellij.openapi.projectRoots.Sdk?)

'it' @ [192:9] ==> value-parameter it: (Sdk..Sdk?) defined in org.jetbrains.kotlin.idea.facet.configureJdkIfPossible.<anonymous>[ValueParameterDescriptorImpl]

'sdkType' @ [192:12] ==> public final val Sdk.sdkType: SdkTypeId[MyPropertyDescriptor]

'==' @ [192:34] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'comparePaths' @ [192:43] ==> public open fun comparePaths(@Nullable p0: String?, @Nullable p1: String?): Int defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'it' @ [192:56] ==> value-parameter it: (Sdk..Sdk?) defined in org.jetbrains.kotlin.idea.facet.configureJdkIfPossible.<anonymous>[ValueParameterDescriptorImpl]

'homePath' @ [192:59] ==> public final val Sdk.homePath: String?[MyPropertyDescriptor]

'jdkHome' @ [192:69] ==> val jdkHome: String defined in org.jetbrains.kotlin.idea.facet.configureJdkIfPossible[LocalVariableDescriptor]

'modelsProvider' @ [194:5] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.facet.configureJdkIfPossible[ValueParameterDescriptorImpl]

'getModifiableRootModel' @ [194:20] ==> @NotNull public abstract fun getModifiableRootModel(p0: (Module..Module?)): ModifiableRootModel defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'this' @ [194:43] ==> <this> defined in org.jetbrains.kotlin.idea.facet.configureJdkIfPossible[ReceiverParameterDescriptorImpl]

'sdk' @ [194:49] ==> public final var ModifiableRootModel.sdk: Sdk?[MyPropertyDescriptor]

'jdk' @ [194:55] ==> val jdk: Sdk defined in org.jetbrains.kotlin.idea.facet.configureJdkIfPossible[LocalVariableDescriptor]

'with' @ [203:5] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinFacetSettings, block: KotlinFacetSettings.() -> CommonCompilerArguments): CommonCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinFacetSettings
    <R> -> CommonCompilerArguments

'kotlinFacet' @ [203:10] ==> value-parameter kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet[ValueParameterDescriptorImpl]

'configuration' @ [203:22] ==> public final val KotlinFacet.configuration: KotlinFacetConfiguration[MyPropertyDescriptor]

'settings' @ [203:36] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'this' @ [204:33] ==> <this> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[ReceiverParameterDescriptorImpl]

'compilerArguments' @ [204:38] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'compilerArguments' @ [206:40] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'java' @ [206:65] ==> public val <T> KClass<out CommonCompilerArguments>.java: Class<out CommonCompilerArguments> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CommonCompilerArguments

'newInstance' @ [206:70] ==> @CallerSensitive public open fun newInstance(): (CommonCompilerArguments..CommonCompilerArguments?) defined in java.lang.Class[JavaMethodDescriptor]

'parseCommandLineArguments' @ [207:9] ==> public fun <A : CommonToolArguments> parseCommandLineArguments(args: List<String>, result: (CommonCompilerArguments..CommonCompilerArguments?)): Unit defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A : CommonToolArguments> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)

'defaultArguments' @ [207:35] ==> value-parameter defaultArguments: List<String> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet[ValueParameterDescriptorImpl]

'defaultCompilerArguments' @ [207:53] ==> val defaultCompilerArguments: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'defaultCompilerArguments' @ [208:9] ==> val defaultCompilerArguments: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'convertPathsToSystemIndependent' @ [208:34] ==> public fun CommonCompilerArguments.convertPathsToSystemIndependent(): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'parseCommandLineArguments' @ [210:9] ==> public fun <A : CommonToolArguments> parseCommandLineArguments(args: List<String>, result: CommonCompilerArguments): Unit defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A : CommonToolArguments> -> CommonCompilerArguments

'arguments' @ [210:35] ==> value-parameter arguments: List<String> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet[ValueParameterDescriptorImpl]

'compilerArguments' @ [210:46] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'compilerArguments' @ [212:9] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'convertPathsToSystemIndependent' @ [212:27] ==> public fun CommonCompilerArguments.convertPathsToSystemIndependent(): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'compilerArguments' @ [217:13] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'kotlinFacet' @ [218:13] ==> value-parameter kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet[ValueParameterDescriptorImpl]

'module' @ [218:25] ==> public final val KotlinFacet.module: Module[MyPropertyDescriptor]

'configureJdkIfPossible' @ [218:32] ==> private fun Module.configureJdkIfPossible(compilerArguments: K2JVMCompilerArguments, modelsProvider: IdeModifiableModelsProvider): Unit defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'compilerArguments' @ [218:55] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'modelsProvider' @ [218:74] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet[ValueParameterDescriptorImpl]

'compilerArguments' @ [221:29] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'primaryFields' @ [221:47] ==> private val CommonCompilerArguments.primaryFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'compilerArguments' @ [222:29] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'ignoredFields' @ [222:47] ==> private val CommonCompilerArguments.ignoredFields: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'property' @ [225:17] ==> value-parameter property: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.exposeAsAdditionalArgument[ValueParameterDescriptorImpl]

'name' @ [225:26] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'primaryFields' @ [225:35] ==> val primaryFields: List<String> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'property' @ [225:52] ==> value-parameter property: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.exposeAsAdditionalArgument[ValueParameterDescriptorImpl]

'get' @ [225:61] ==> public abstract fun get(receiver: CommonCompilerArguments): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'compilerArguments' @ [225:65] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'property' @ [225:87] ==> value-parameter property: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.exposeAsAdditionalArgument[ValueParameterDescriptorImpl]

'get' @ [225:96] ==> public abstract fun get(receiver: CommonCompilerArguments): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'defaultCompilerArguments' @ [225:100] ==> val defaultCompilerArguments: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'with' @ [227:41] ==> @InlineOnly public inline fun <T, R> with(receiver: (CommonCompilerArguments..CommonCompilerArguments?), block: (CommonCompilerArguments..CommonCompilerArguments?).() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)
    <R> -> String

'compilerArguments' @ [227:46] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'java' @ [227:71] ==> public val <T> KClass<out CommonCompilerArguments>.java: Class<out CommonCompilerArguments> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CommonCompilerArguments

'newInstance' @ [227:76] ==> @CallerSensitive public open fun newInstance(): (CommonCompilerArguments..CommonCompilerArguments?) defined in java.lang.Class[JavaMethodDescriptor]

'copyFieldsSatisfying' @ [228:13] ==> public fun <From : Any, To : Any> copyFieldsSatisfying(from: CommonCompilerArguments, to: (CommonCompilerArguments..CommonCompilerArguments?), predicate: (KProperty1<CommonCompilerArguments, Any?>) -> Boolean): (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <From : Any> -> CommonCompilerArguments
    <To : Any> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)

'compilerArguments' @ [228:34] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'this' @ [228:53] ==> <this> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'exposeAsAdditionalArgument' @ [228:61] ==> local final fun exposeAsAdditionalArgument(property: KProperty1<CommonCompilerArguments, Any?>): Boolean defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[SimpleFunctionDescriptorImpl]

'it' @ [228:88] ==> value-parameter it: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [228:95] ==> value-parameter it: KProperty1<CommonCompilerArguments, Any?> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [228:98] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'ignoredFields' @ [228:107] ==> val ignoredFields: List<String> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'convertArgumentsToStringList' @ [229:27] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'this' @ [229:56] ==> <this> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'joinToString' @ [229:62] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'if (StringUtil.containsWhitespaces(it) || it.startsWith('"')) {
                    StringUtil.wrapWithDoubleQuote(StringUtil.escapeQuotes(it))
                } else it' @ [230:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CharSequence, elseBranch: CharSequence): CharSequence[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CharSequence

'containsWhitespaces' @ [230:32] ==> @Contract public open fun containsWhitespaces(@Nullable p0: CharSequence?): Boolean defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'it' @ [230:52] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [230:59] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [230:62] ==> public fun CharSequence.startsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'wrapWithDoubleQuote' @ [231:32] ==> @NotNull @Contract public open fun wrapWithDoubleQuote(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'escapeQuotes' @ [231:63] ==> @NotNull @Contract public open fun escapeQuotes(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'it' @ [231:76] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [232:24] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'compilerSettings' @ [235:9] ==> public final var compilerSettings: CompilerSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'additionalArguments' @ [235:27] ==> public final var additionalArguments: String defined in org.jetbrains.kotlin.config.CompilerSettings[DeserializedPropertyDescriptor]

'if (additionalArgumentsString.isNotEmpty()) additionalArgumentsString else CompilerSettings.DEFAULT_ADDITIONAL_ARGUMENTS' @ [236:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'additionalArgumentsString' @ [236:21] ==> val additionalArgumentsString: String defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [236:47] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'additionalArgumentsString' @ [236:61] ==> val additionalArgumentsString: String defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'CompilerSettings' @ [236:92] ==> public companion object defined in org.jetbrains.kotlin.config.CompilerSettings[FakeCallableDescriptorForObject]

'DEFAULT_ADDITIONAL_ARGUMENTS' @ [236:109] ==> public final val DEFAULT_ADDITIONAL_ARGUMENTS: String defined in org.jetbrains.kotlin.config.CompilerSettings.Companion[DeserializedPropertyDescriptor]

'with' @ [238:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (CommonCompilerArguments..CommonCompilerArguments?), block: (CommonCompilerArguments..CommonCompilerArguments?).() -> CommonCompilerArguments): CommonCompilerArguments defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)
    <R> -> CommonCompilerArguments

'compilerArguments' @ [238:14] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'java' @ [238:39] ==> public val <T> KClass<out CommonCompilerArguments>.java: Class<out CommonCompilerArguments> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CommonCompilerArguments

'newInstance' @ [238:44] ==> @CallerSensitive public open fun newInstance(): (CommonCompilerArguments..CommonCompilerArguments?) defined in java.lang.Class[JavaMethodDescriptor]

'copyFieldsSatisfying' @ [239:13] ==> public fun <From : Any, To : Any> copyFieldsSatisfying(from: (CommonCompilerArguments..CommonCompilerArguments?), to: CommonCompilerArguments, predicate: (KProperty1<(CommonCompilerArguments..CommonCompilerArguments?), Any?>) -> Boolean): CommonCompilerArguments defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <From : Any> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)
    <To : Any> -> CommonCompilerArguments

'this' @ [239:34] ==> <this> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'compilerArguments' @ [239:40] ==> val compilerArguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

'exposeAsAdditionalArgument' @ [239:61] ==> local final fun exposeAsAdditionalArgument(property: KProperty1<CommonCompilerArguments, Any?>): Boolean defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[SimpleFunctionDescriptorImpl]

'it' @ [239:88] ==> value-parameter it: KProperty1<(CommonCompilerArguments..CommonCompilerArguments?), Any?> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [239:95] ==> value-parameter it: KProperty1<(CommonCompilerArguments..CommonCompilerArguments?), Any?> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [239:98] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'ignoredFields' @ [239:106] ==> val ignoredFields: List<String> defined in org.jetbrains.kotlin.idea.facet.parseCompilerArgumentsToFacet.<anonymous>[LocalVariableDescriptor]

