'JpsProjectExtensionSerializer' @ [29:51] ==> public constructor JpsProjectExtensionSerializer(@Nullable p0: String?, @NotNull p1: String) defined in org.jetbrains.jps.model.serialization.JpsProjectExtensionSerializer[JavaClassConstructorDescriptor]

'KOTLIN_COMPILER_SETTINGS_FILE' @ [29:81] ==> public const final val KOTLIN_COMPILER_SETTINGS_FILE: String defined in org.jetbrains.kotlin.config.SettingConstants[JavaPropertyDescriptor]

'KOTLIN_COMPILER_SETTINGS_SECTION' @ [30:81] ==> public const final val KOTLIN_COMPILER_SETTINGS_SECTION: String defined in org.jetbrains.kotlin.config.SettingConstants[JavaPropertyDescriptor]

'deserialize' @ [33:38] ==> @NotNull public open fun <T : (Any..Any?)> deserialize(@NotNull p0: Element, @NotNull p1: Class<(CompilerSettings..CompilerSettings?)>): CompilerSettings defined in com.intellij.util.xmlb.XmlSerializer[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompilerSettings

'componentTag' @ [33:50] ==> value-parameter componentTag: Element defined in org.jetbrains.kotlin.jps.model.KotlinCompilerSettingsSerializer.loadExtension[ValueParameterDescriptorImpl]

'CompilerSettings' @ [33:64] ==> public companion object defined in org.jetbrains.kotlin.config.CompilerSettings[FakeCallableDescriptorForObject]

'java' @ [33:88] ==> public val <T> KClass<CompilerSettings>.java: Class<CompilerSettings> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompilerSettings

'JpsKotlinCompilerSettings' @ [34:9] ==> public companion object defined in org.jetbrains.kotlin.jps.JpsKotlinCompilerSettings[FakeCallableDescriptorForObject]

'setCompilerSettings' @ [34:35] ==> public final fun setCompilerSettings(project: JpsProject, compilerSettings: CompilerSettings): Unit defined in org.jetbrains.kotlin.jps.JpsKotlinCompilerSettings.Companion[SimpleFunctionDescriptorImpl]

'project' @ [34:55] ==> value-parameter project: JpsProject defined in org.jetbrains.kotlin.jps.model.KotlinCompilerSettingsSerializer.loadExtension[ValueParameterDescriptorImpl]

'settings' @ [34:64] ==> val settings: CompilerSettings defined in org.jetbrains.kotlin.jps.model.KotlinCompilerSettingsSerializer.loadExtension[LocalVariableDescriptor]

