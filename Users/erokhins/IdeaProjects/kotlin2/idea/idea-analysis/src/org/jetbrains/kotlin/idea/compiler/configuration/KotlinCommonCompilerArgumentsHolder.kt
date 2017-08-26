'State' @ [28:1] ==> public constructor State(name: String, storages: Array<Storage> = ..., reloadable: Boolean = ..., defaultStateAsResource: Boolean = ..., additionalExportFile: String = ..., presentableName: KClass<out (State.NameGetter..State.NameGetter?)> = ...) defined in com.intellij.openapi.components.State[JavaClassConstructorDescriptor]

'KOTLIN_COMMON_COMPILER_ARGUMENTS_SECTION' @ [28:15] ==> public const final val KOTLIN_COMMON_COMPILER_ARGUMENTS_SECTION: String defined in org.jetbrains.kotlin.config.SettingConstants[JavaPropertyDescriptor]

'arrayOf' @ [29:19] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Storage): Array<Storage> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Storage

'Storage' @ [29:27] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'PROJECT_FILE' @ [29:60] ==> @Deprecated public const final val PROJECT_FILE: String defined in com.intellij.openapi.components.StoragePathMacros[JavaPropertyDescriptor]

'Storage' @ [30:27] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'KOTLIN_COMPILER_SETTINGS_PATH' @ [30:69] ==> public const final val KOTLIN_COMPILER_SETTINGS_PATH: String defined in org.jetbrains.kotlin.idea.compiler.configuration.BaseKotlinCompilerSettings.Companion[PropertyDescriptorImpl]

'DIRECTORY_BASED' @ [31:58] ==> enum entry DIRECTORY_BASED defined in com.intellij.openapi.components.StorageScheme[FakeCallableDescriptorForObject]

'BaseKotlinCompilerSettings<CommonCompilerArguments>' @ [32:45] ==> protected constructor BaseKotlinCompilerSettings<T : Freezable>() defined in org.jetbrains.kotlin.idea.compiler.configuration.BaseKotlinCompilerSettings[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Freezable> -> CommonCompilerArguments

'DEFAULT_LANGUAGE_VERSION' @ [34:13] ==> private final val DEFAULT_LANGUAGE_VERSION: String defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.Companion[PropertyDescriptorImpl]

'getAttribute' @ [34:41] ==> public open fun getAttribute(p0: (String..String?)): (Attribute..Attribute?) defined in org.jdom.Element[JavaMethodDescriptor]

'value' @ [34:64] ==> public final var Attribute.value: (String..String?)[MyPropertyDescriptor]

'detach' @ [35:13] ==> public open fun detach(): (Content..Content?) defined in org.jdom.Element[JavaMethodDescriptor]

'super' @ [40:16] ==> <this> defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[LazyClassReceiverParameterDescriptor]

'getState' @ [40:22] ==> public open fun getState(): Element defined in org.jetbrains.kotlin.idea.compiler.configuration.BaseKotlinCompilerSettings[SimpleFunctionDescriptorImpl]

'apply' @ [40:33] ==> @InlineOnly public inline fun <T> Element.apply(block: (Element).() -> Unit): Element defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element

'getOption' @ [42:13] ==> public fun Element.getOption(name: String): Element? defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'dropElementIfDefault' @ [42:43] ==> private final fun Element.dropElementIfDefault(): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[SimpleFunctionDescriptorImpl]

'getOption' @ [43:13] ==> public fun Element.getOption(name: String): Element? defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'dropElementIfDefault' @ [43:38] ==> private final fun Element.dropElementIfDefault(): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[SimpleFunctionDescriptorImpl]

'super' @ [48:9] ==> <this> defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[LazyClassReceiverParameterDescriptor]

'loadState' @ [48:15] ==> public open fun loadState(state: Element): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.BaseKotlinCompilerSettings[SimpleFunctionDescriptorImpl]

'state' @ [48:25] ==> value-parameter state: Element defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.loadState[ValueParameterDescriptorImpl]

'update' @ [51:9] ==> public final fun update(changer: CommonCompilerArguments.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[SimpleFunctionDescriptorImpl]

'<' @ [52:17] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'compare' @ [52:39] ==> public open fun compare(p0: (String..String?), p1: (String..String?)): Int defined in com.intellij.util.text.VersionComparatorUtil[JavaMethodDescriptor]

'languageVersion' @ [52:47] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'apiVersion' @ [52:64] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'apiVersion' @ [53:17] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'languageVersion' @ [53:30] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'CommonCompilerArguments' @ [58:37] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[FakeCallableDescriptorForObject]

'DummyImpl' @ [58:61] ==> public constructor DummyImpl() defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments.DummyImpl[DeserializedClassConstructorDescriptor]

'LanguageVersion' @ [61:48] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [61:64] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'versionString' @ [61:78] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'!!' @ [64:17] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinCommonCompilerArgumentsHolder?): KotlinCommonCompilerArgumentsHolder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinCommonCompilerArgumentsHolder

'getService' @ [64:32] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KotlinCommonCompilerArgumentsHolder..KotlinCommonCompilerArgumentsHolder?)>): (KotlinCommonCompilerArgumentsHolder..KotlinCommonCompilerArgumentsHolder?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinCommonCompilerArgumentsHolder

'project' @ [64:80] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder.Companion.getInstance[ValueParameterDescriptorImpl]

'KotlinCommonCompilerArgumentsHolder' @ [64:89] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCommonCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'java' @ [64:132] ==> public val <T> KClass<KotlinCommonCompilerArgumentsHolder>.java: Class<KotlinCommonCompilerArgumentsHolder> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCommonCompilerArgumentsHolder

