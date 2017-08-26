'State' @ [24:1] ==> public constructor State(name: String, storages: Array<Storage> = ..., reloadable: Boolean = ..., defaultStateAsResource: Boolean = ..., additionalExportFile: String = ..., presentableName: KClass<out (State.NameGetter..State.NameGetter?)> = ...) defined in com.intellij.openapi.components.State[JavaClassConstructorDescriptor]

'KOTLIN_COMPILER_SETTINGS_SECTION' @ [24:15] ==> public const final val KOTLIN_COMPILER_SETTINGS_SECTION: String defined in org.jetbrains.kotlin.config.SettingConstants[JavaPropertyDescriptor]

'arrayOf' @ [25:19] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Storage): Array<Storage> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Storage

'Storage' @ [25:27] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'PROJECT_FILE' @ [25:60] ==> @Deprecated public const final val PROJECT_FILE: String defined in com.intellij.openapi.components.StoragePathMacros[JavaPropertyDescriptor]

'Storage' @ [26:27] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'BaseKotlinCompilerSettings' @ [26:42] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.BaseKotlinCompilerSettings[FakeCallableDescriptorForObject]

'KOTLIN_COMPILER_SETTINGS_PATH' @ [26:69] ==> public const final val KOTLIN_COMPILER_SETTINGS_PATH: String defined in org.jetbrains.kotlin.idea.compiler.configuration.BaseKotlinCompilerSettings.Companion[PropertyDescriptorImpl]

'DIRECTORY_BASED' @ [26:123] ==> enum entry DIRECTORY_BASED defined in com.intellij.openapi.components.StorageScheme[FakeCallableDescriptorForObject]

'BaseKotlinCompilerSettings<CompilerSettings>' @ [27:32] ==> protected constructor BaseKotlinCompilerSettings<T : Freezable>() defined in org.jetbrains.kotlin.idea.compiler.configuration.BaseKotlinCompilerSettings[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Freezable> -> CompilerSettings

'CompilerSettings' @ [28:37] ==> public constructor CompilerSettings() defined in org.jetbrains.kotlin.config.CompilerSettings[DeserializedClassConstructorDescriptor]

'!!' @ [33:45] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KotlinCompilerSettings?): KotlinCompilerSettings[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KotlinCompilerSettings

'getService' @ [33:60] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(KotlinCompilerSettings..KotlinCompilerSettings?)>): (KotlinCompilerSettings..KotlinCompilerSettings?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinCompilerSettings

'project' @ [33:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings.Companion.getInstance[ValueParameterDescriptorImpl]

'KotlinCompilerSettings' @ [33:80] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerSettings[FakeCallableDescriptorForObject]

'java' @ [33:110] ==> public val <T> KClass<KotlinCompilerSettings>.java: Class<KotlinCompilerSettings> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCompilerSettings

