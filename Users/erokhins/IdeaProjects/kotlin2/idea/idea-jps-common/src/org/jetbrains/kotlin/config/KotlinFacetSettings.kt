'name' @ [32:34] ==> public final val name: String defined in org.jetbrains.kotlin.config.TargetPlatformKind[PropertyDescriptorImpl]

'version' @ [32:41] ==> public final val version: Version defined in org.jetbrains.kotlin.config.TargetPlatformKind[PropertyDescriptorImpl]

'description' @ [32:49] ==> public abstract val description: String defined in org.jetbrains.kotlin.config.TargetPlatformVersion[DeserializedPropertyDescriptor]

'TargetPlatformKind<JvmTarget>' @ [34:37] ==> private constructor TargetPlatformKind<out Version : TargetPlatformVersion>(version: JvmTarget, name: String) defined in org.jetbrains.kotlin.config.TargetPlatformKind[ClassConstructorDescriptorImpl]
Inferred types:
    <out Version : TargetPlatformVersion> -> JvmTarget

'version' @ [34:67] ==> value-parameter version: JvmTarget defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm.<init>[ValueParameterDescriptorImpl]

'lazy' @ [36:34] ==> public fun <T> lazy(initializer: () -> List<TargetPlatformKind.Jvm>): Lazy<List<TargetPlatformKind.Jvm>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Jvm>

'JvmTarget' @ [36:41] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'values' @ [36:51] ==> public final fun values(): Array<JvmTarget> defined in org.jetbrains.kotlin.config.JvmTarget[SimpleFunctionDescriptorImpl]

'map' @ [36:60] ==> public inline fun <T, R> Array<out JvmTarget>.map(transform: (JvmTarget) -> TargetPlatformKind.Jvm): List<TargetPlatformKind.Jvm> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmTarget
    <R> -> Jvm

'JVM_PLATFORMS' @ [38:52] ==> public final val JVM_PLATFORMS: List<TargetPlatformKind.Jvm> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm.Companion[PropertyDescriptorImpl]

'version' @ [38:66] ==> value-parameter version: JvmTarget defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm.Companion.get[ValueParameterDescriptorImpl]

'ordinal' @ [38:74] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.config.JvmTarget[DeserializedPropertyDescriptor]

'TargetPlatformKind<TargetPlatformVersion.NoVersion>' @ [42:25] ==> private constructor TargetPlatformKind<out Version : TargetPlatformVersion>(version: TargetPlatformVersion.NoVersion, name: String) defined in org.jetbrains.kotlin.config.TargetPlatformKind[ClassConstructorDescriptorImpl]
Inferred types:
    <out Version : TargetPlatformVersion> -> NoVersion

'NoVersion' @ [42:99] ==> public object NoVersion : TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformVersion[FakeCallableDescriptorForObject]

'TargetPlatformKind<TargetPlatformVersion.NoVersion>' @ [44:21] ==> private constructor TargetPlatformKind<out Version : TargetPlatformVersion>(version: TargetPlatformVersion.NoVersion, name: String) defined in org.jetbrains.kotlin.config.TargetPlatformKind[ClassConstructorDescriptorImpl]
Inferred types:
    <out Version : TargetPlatformVersion> -> NoVersion

'NoVersion' @ [44:95] ==> public object NoVersion : TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformVersion[FakeCallableDescriptorForObject]

'lazy' @ [47:59] ==> public fun <T> lazy(initializer: () -> List<TargetPlatformKind<TargetPlatformVersion>>): Lazy<List<TargetPlatformKind<TargetPlatformVersion>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TargetPlatformKind<TargetPlatformVersion>>

'Jvm' @ [47:66] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[FakeCallableDescriptorForObject]

'JVM_PLATFORMS' @ [47:70] ==> public final val JVM_PLATFORMS: List<TargetPlatformKind.Jvm> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm.Companion[PropertyDescriptorImpl]

'JavaScript' @ [47:86] ==> public object JavaScript : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Common' @ [47:99] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Jvm' @ [49:21] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[FakeCallableDescriptorForObject]

'JvmTarget' @ [49:25] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'DEFAULT' @ [49:35] ==> @field:JvmField public final val DEFAULT: JvmTarget defined in org.jetbrains.kotlin.config.JvmTarget.Companion[DeserializedPropertyDescriptor]

'JvmStatic' @ [54:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'byCompilerArgumentsOrNull' @ [56:13] ==> public final fun byCompilerArgumentsOrNull(arguments: CommonCompilerArguments?): LanguageFeature.State? defined in org.jetbrains.kotlin.config.CoroutineSupport[SimpleFunctionDescriptorImpl]

'arguments' @ [56:39] ==> value-parameter arguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.CoroutineSupport.byCompilerArguments[ValueParameterDescriptorImpl]

'LanguageFeature' @ [56:53] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'defaultState' @ [56:80] ==> public final val defaultState: LanguageFeature.State defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'when (arguments?.coroutinesState) {
        CommonCompilerArguments.ENABLE -> LanguageFeature.State.ENABLED
        CommonCompilerArguments.WARN -> LanguageFeature.State.ENABLED_WITH_WARNING
        CommonCompilerArguments.ERROR -> LanguageFeature.State.ENABLED_WITH_ERROR
        else -> null
    }' @ [58:98] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: LanguageFeature.State?, entry1: LanguageFeature.State?, entry2: LanguageFeature.State?, entry3: LanguageFeature.State?): LanguageFeature.State?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> State?

'arguments' @ [58:104] ==> value-parameter arguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.CoroutineSupport.byCompilerArgumentsOrNull[ValueParameterDescriptorImpl]

'coroutinesState' @ [58:115] ==> @Argument public final var coroutinesState: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'CommonCompilerArguments' @ [59:9] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'ENABLE' @ [59:33] ==> public const final val ENABLE: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'LanguageFeature' @ [59:43] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED' @ [59:65] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'CommonCompilerArguments' @ [60:9] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'WARN' @ [60:33] ==> public const final val WARN: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'LanguageFeature' @ [60:41] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_WARNING' @ [60:63] ==> enum entry ENABLED_WITH_WARNING defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'CommonCompilerArguments' @ [61:9] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'ERROR' @ [61:33] ==> public const final val ERROR: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'LanguageFeature' @ [61:42] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_ERROR' @ [61:64] ==> enum entry ENABLED_WITH_ERROR defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [66:13] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'values' @ [66:35] ==> public final fun values(): Array<LanguageFeature.State> defined in org.jetbrains.kotlin.config.LanguageFeature.State[SimpleFunctionDescriptorImpl]

'find' @ [66:44] ==> @InlineOnly public inline fun <T> Array<out LanguageFeature.State>.find(predicate: (LanguageFeature.State) -> Boolean): LanguageFeature.State? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> State

'getCompilerArgument' @ [66:51] ==> public final fun getCompilerArgument(state: LanguageFeature.State): String defined in org.jetbrains.kotlin.config.CoroutineSupport[SimpleFunctionDescriptorImpl]

'it' @ [66:71] ==> value-parameter it: LanguageFeature.State defined in org.jetbrains.kotlin.config.CoroutineSupport.byCompilerArgument.<anonymous>[ValueParameterDescriptorImpl]

'equals' @ [66:75] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'argument' @ [66:82] ==> value-parameter argument: String defined in org.jetbrains.kotlin.config.CoroutineSupport.byCompilerArgument[ValueParameterDescriptorImpl]

'LanguageFeature' @ [67:16] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'defaultState' @ [67:43] ==> public final val defaultState: LanguageFeature.State defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'when (state) {
        LanguageFeature.State.ENABLED -> "enable"
        LanguageFeature.State.ENABLED_WITH_WARNING -> "warn"
        LanguageFeature.State.ENABLED_WITH_ERROR, LanguageFeature.State.DISABLED -> "error"
    }' @ [69:69] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'state' @ [69:75] ==> value-parameter state: LanguageFeature.State defined in org.jetbrains.kotlin.config.CoroutineSupport.getCompilerArgument[ValueParameterDescriptorImpl]

'LanguageFeature' @ [70:9] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED' @ [70:31] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [71:9] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_WARNING' @ [71:31] ==> enum entry ENABLED_WITH_WARNING defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [72:9] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_ERROR' @ [72:31] ==> enum entry ENABLED_WITH_ERROR defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [72:51] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'DISABLED' @ [72:73] ==> enum entry DISABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'CURRENT_VERSION' @ [83:19] ==> public final val CURRENT_VERSION: Int defined in org.jetbrains.kotlin.config.KotlinFacetSettings.Companion[PropertyDescriptorImpl]

'field' @ [88:13] ==> var field: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<set-compilerArguments>[SyntheticFieldDescriptor]

'value' @ [88:21] ==> value-parameter value: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<set-compilerArguments>[ValueParameterDescriptorImpl]

'unfrozen' @ [88:28] ==> public final fun unfrozen(): Freezable defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedSimpleFunctionDescriptor]

'field' @ [92:13] ==> var field: CompilerSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<set-compilerSettings>[SyntheticFieldDescriptor]

'value' @ [92:21] ==> value-parameter value: CompilerSettings? defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<set-compilerSettings>[ValueParameterDescriptorImpl]

'unfrozen' @ [92:28] ==> public final fun unfrozen(): Freezable defined in org.jetbrains.kotlin.config.CompilerSettings[DeserializedSimpleFunctionDescriptor]

'compilerArguments' @ [96:17] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[PropertyDescriptorImpl]

'languageVersion' @ [96:36] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'let' @ [96:53] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> LanguageVersion?): LanguageVersion? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LanguageVersion?

'LanguageVersion' @ [96:59] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'fromFullVersionString' @ [96:75] ==> @JvmStatic public final fun fromFullVersionString(str: String): LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [96:97] ==> value-parameter it: String defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<get-languageLevel>.<anonymous>[ValueParameterDescriptorImpl]

'compilerArguments' @ [98:13] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[PropertyDescriptorImpl]

'languageVersion' @ [98:33] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'value' @ [98:51] ==> value-parameter value: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<set-languageLevel>[ValueParameterDescriptorImpl]

'versionString' @ [98:58] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'compilerArguments' @ [102:17] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[PropertyDescriptorImpl]

'apiVersion' @ [102:36] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'let' @ [102:48] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> LanguageVersion?): LanguageVersion? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> LanguageVersion?

'LanguageVersion' @ [102:54] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'fromFullVersionString' @ [102:70] ==> @JvmStatic public final fun fromFullVersionString(str: String): LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [102:92] ==> value-parameter it: String defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<get-apiLevel>.<anonymous>[ValueParameterDescriptorImpl]

'compilerArguments' @ [104:13] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[PropertyDescriptorImpl]

'apiVersion' @ [104:33] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'value' @ [104:46] ==> value-parameter value: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<set-apiLevel>[ValueParameterDescriptorImpl]

'versionString' @ [104:53] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'compilerArguments' @ [108:17] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[PropertyDescriptorImpl]

'let' @ [108:36] ==> @InlineOnly public inline fun <T, R> CommonCompilerArguments.let(block: (CommonCompilerArguments) -> TargetPlatformKind<TargetPlatformVersion>?): TargetPlatformKind<TargetPlatformVersion>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CommonCompilerArguments
    <R> -> TargetPlatformKind<TargetPlatformVersion>?

'when (it) {
                is K2JVMCompilerArguments -> {
                    val jvmTarget = it.jvmTarget ?: JvmTarget.DEFAULT.description
                    TargetPlatformKind.Jvm.JVM_PLATFORMS.firstOrNull { it.version.description >= jvmTarget }
                }
                is K2JSCompilerArguments -> TargetPlatformKind.JavaScript
                is K2MetadataCompilerArguments -> TargetPlatformKind.Common
                else -> null
            }' @ [109:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TargetPlatformKind<TargetPlatformVersion>?, entry1: TargetPlatformKind<TargetPlatformVersion>?, entry2: TargetPlatformKind<TargetPlatformVersion>?, entry3: TargetPlatformKind<TargetPlatformVersion>?): TargetPlatformKind<TargetPlatformVersion>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TargetPlatformKind<TargetPlatformVersion>?

'it' @ [109:19] ==> value-parameter it: CommonCompilerArguments defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<get-targetPlatformKind>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [111:37] ==> value-parameter it: CommonCompilerArguments defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<get-targetPlatformKind>.<anonymous>[ValueParameterDescriptorImpl]

'jvmTarget' @ [111:40] ==> @GradleOption @Argument public final var jvmTarget: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'JvmTarget' @ [111:53] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'DEFAULT' @ [111:63] ==> @field:JvmField public final val DEFAULT: JvmTarget defined in org.jetbrains.kotlin.config.JvmTarget.Companion[DeserializedPropertyDescriptor]

'description' @ [111:71] ==> public open val description: String defined in org.jetbrains.kotlin.config.JvmTarget[DeserializedPropertyDescriptor]

'TargetPlatformKind' @ [112:21] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'JVM_PLATFORMS' @ [112:44] ==> public final val JVM_PLATFORMS: List<TargetPlatformKind.Jvm> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm.Companion[PropertyDescriptorImpl]

'firstOrNull' @ [112:58] ==> public inline fun <T> Iterable<TargetPlatformKind.Jvm>.firstOrNull(predicate: (TargetPlatformKind.Jvm) -> Boolean): TargetPlatformKind.Jvm? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Jvm

'it' @ [112:72] ==> value-parameter it: TargetPlatformKind.Jvm defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<get-targetPlatformKind>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [112:75] ==> public final val version: JvmTarget defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[PropertyDescriptorImpl]

'description' @ [112:83] ==> public open val description: String defined in org.jetbrains.kotlin.config.JvmTarget[DeserializedPropertyDescriptor]

'jvmTarget' @ [112:98] ==> val jvmTarget: String defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<get-targetPlatformKind>.<anonymous>[LocalVariableDescriptor]

'TargetPlatformKind' @ [114:45] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'JavaScript' @ [114:64] ==> public object JavaScript : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'TargetPlatformKind' @ [115:51] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Common' @ [115:70] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'languageLevel' @ [122:35] ==> public final var languageLevel: LanguageVersion? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[PropertyDescriptorImpl]

'LanguageFeature' @ [122:59] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'defaultState' @ [122:86] ==> public final val defaultState: LanguageFeature.State defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'languageVersion' @ [123:17] ==> val languageVersion: LanguageVersion defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<get-coroutineSupport>[LocalVariableDescriptor]

'LanguageFeature' @ [123:35] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'sinceVersion' @ [123:62] ==> public final val sinceVersion: LanguageVersion? defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'LanguageFeature' @ [123:85] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'DISABLED' @ [123:107] ==> enum entry DISABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'CoroutineSupport' @ [124:20] ==> public object CoroutineSupport defined in org.jetbrains.kotlin.config in file KotlinFacetSettings.kt[FakeCallableDescriptorForObject]

'byCompilerArguments' @ [124:37] ==> @JvmStatic public final fun byCompilerArguments(arguments: CommonCompilerArguments?): LanguageFeature.State defined in org.jetbrains.kotlin.config.CoroutineSupport[SimpleFunctionDescriptorImpl]

'compilerArguments' @ [124:57] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[PropertyDescriptorImpl]

'compilerArguments' @ [127:13] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[PropertyDescriptorImpl]

'coroutinesState' @ [127:33] ==> @Argument public final var coroutinesState: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'when (value) {
                LanguageFeature.State.ENABLED -> CommonCompilerArguments.ENABLE
                LanguageFeature.State.ENABLED_WITH_WARNING -> CommonCompilerArguments.WARN
                LanguageFeature.State.ENABLED_WITH_ERROR, LanguageFeature.State.DISABLED -> CommonCompilerArguments.ERROR
            }' @ [127:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'value' @ [127:57] ==> value-parameter value: LanguageFeature.State defined in org.jetbrains.kotlin.config.KotlinFacetSettings.<set-coroutineSupport>[ValueParameterDescriptorImpl]

'LanguageFeature' @ [128:17] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED' @ [128:39] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'CommonCompilerArguments' @ [128:50] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'ENABLE' @ [128:74] ==> public const final val ENABLE: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'LanguageFeature' @ [129:17] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_WARNING' @ [129:39] ==> enum entry ENABLED_WITH_WARNING defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'CommonCompilerArguments' @ [129:63] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'WARN' @ [129:87] ==> public const final val WARN: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'LanguageFeature' @ [130:17] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_ERROR' @ [130:39] ==> enum entry ENABLED_WITH_ERROR defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [130:59] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'DISABLED' @ [130:81] ==> enum entry DISABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'CommonCompilerArguments' @ [130:93] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'ERROR' @ [130:117] ==> public const final val ERROR: String defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.Companion[DeserializedPropertyDescriptor]

'when (this) {
        is TargetPlatformKind.Jvm -> K2JVMCompilerArguments()
        is TargetPlatformKind.JavaScript -> K2JSCompilerArguments()
        is TargetPlatformKind.Common -> K2MetadataCompilerArguments()
    }' @ [136:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CommonCompilerArguments, entry1: CommonCompilerArguments, entry2: CommonCompilerArguments): CommonCompilerArguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CommonCompilerArguments

'this' @ [136:27] ==> <this> defined in org.jetbrains.kotlin.config.createCompilerArguments[ReceiverParameterDescriptorImpl]

'K2JVMCompilerArguments' @ [137:38] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'K2JSCompilerArguments' @ [138:45] ==> public constructor K2JSCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedClassConstructorDescriptor]

'K2MetadataCompilerArguments' @ [139:41] ==> public constructor K2MetadataCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments[DeserializedClassConstructorDescriptor]

'arguments' @ [142:5] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.config.createCompilerArguments[LocalVariableDescriptor]

'invoke' @ [142:15] ==> public abstract operator fun CommonCompilerArguments.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'arguments' @ [144:9] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.config.createCompilerArguments[LocalVariableDescriptor]

'arguments' @ [145:9] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.config.createCompilerArguments[LocalVariableDescriptor]

'jvmTarget' @ [145:19] ==> @GradleOption @Argument public final var jvmTarget: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'this@createCompilerArguments' @ [145:31] ==> <this> defined in org.jetbrains.kotlin.config.createCompilerArguments[ReceiverParameterDescriptorImpl]

'version' @ [145:60] ==> public final val version: TargetPlatformVersion defined in org.jetbrains.kotlin.config.TargetPlatformKind[PropertyDescriptorImpl]

'description' @ [145:68] ==> public abstract val description: String defined in org.jetbrains.kotlin.config.TargetPlatformVersion[DeserializedPropertyDescriptor]

'arguments' @ [148:12] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.config.createCompilerArguments[LocalVariableDescriptor]

'!!' @ [156:45] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinFacetSettingsProvider?): KotlinFacetSettingsProvider[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinFacetSettingsProvider

'getService' @ [156:60] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KotlinFacetSettingsProvider..KotlinFacetSettingsProvider?)>): (KotlinFacetSettingsProvider..KotlinFacetSettingsProvider?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinFacetSettingsProvider

'project' @ [156:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider.Companion.getInstance[ValueParameterDescriptorImpl]

'KotlinFacetSettingsProvider' @ [156:80] ==> public companion object defined in org.jetbrains.kotlin.config.KotlinFacetSettingsProvider[FakeCallableDescriptorForObject]

'java' @ [156:115] ==> public val <T> KClass<KotlinFacetSettingsProvider>.java: Class<KotlinFacetSettingsProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinFacetSettingsProvider

