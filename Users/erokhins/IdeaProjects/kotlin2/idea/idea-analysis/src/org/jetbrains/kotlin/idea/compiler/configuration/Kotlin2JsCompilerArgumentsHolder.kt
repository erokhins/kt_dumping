'State' @ [25:1] ==> public constructor State(name: String, storages: Array<Storage> = ..., reloadable: Boolean = ..., defaultStateAsResource: Boolean = ..., additionalExportFile: String = ..., presentableName: KClass<out (State.NameGetter..State.NameGetter?)> = ...) defined in com.intellij.openapi.components.State[JavaClassConstructorDescriptor]

'KOTLIN_TO_JS_COMPILER_ARGUMENTS_SECTION' @ [25:15] ==> public const final val KOTLIN_TO_JS_COMPILER_ARGUMENTS_SECTION: String defined in org.jetbrains.kotlin.config.SettingConstants[JavaPropertyDescriptor]

'arrayOf' @ [26:19] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Storage): Array<Storage> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Storage

'Storage' @ [26:27] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'PROJECT_FILE' @ [26:60] ==> @Deprecated public const final val PROJECT_FILE: String defined in com.intellij.openapi.components.StoragePathMacros[JavaPropertyDescriptor]

'Storage' @ [27:27] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'KOTLIN_COMPILER_SETTINGS_PATH' @ [27:42] ==> public const final val KOTLIN_COMPILER_SETTINGS_PATH: String defined in org.jetbrains.kotlin.idea.compiler.configuration.BaseKotlinCompilerSettings.Companion[PropertyImportedFromObject]

'DIRECTORY_BASED' @ [27:96] ==> enum entry DIRECTORY_BASED defined in com.intellij.openapi.components.StorageScheme[FakeCallableDescriptorForObject]

'BaseKotlinCompilerSettings<K2JSCompilerArguments>' @ [28:42] ==> protected constructor BaseKotlinCompilerSettings<T : Freezable>() defined in org.jetbrains.kotlin.idea.compiler.configuration.BaseKotlinCompilerSettings[ClassConstructorDescriptorImpl]
Inferred types:
    <T : Freezable> -> K2JSCompilerArguments

'K2JSCompilerArguments' @ [29:37] ==> public constructor K2JSCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedClassConstructorDescriptor]

'validateInheritedFieldsUnchanged' @ [32:9] ==> protected final fun validateInheritedFieldsUnchanged(settings: K2JSCompilerArguments): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder[SimpleFunctionDescriptorImpl]

'settings' @ [32:42] ==> value-parameter settings: K2JSCompilerArguments defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder.validateNewSettings[ValueParameterDescriptorImpl]

'!!' @ [36:45] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Kotlin2JsCompilerArgumentsHolder?): Kotlin2JsCompilerArgumentsHolder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Kotlin2JsCompilerArgumentsHolder

'getService' @ [36:60] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(Kotlin2JsCompilerArgumentsHolder..Kotlin2JsCompilerArgumentsHolder?)>): (Kotlin2JsCompilerArgumentsHolder..Kotlin2JsCompilerArgumentsHolder?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder..org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder?)

'project' @ [36:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder.Companion.getInstance[ValueParameterDescriptorImpl]

'Kotlin2JsCompilerArgumentsHolder' @ [36:80] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JsCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'java' @ [36:120] ==> public val <T> KClass<Kotlin2JsCompilerArgumentsHolder>.java: Class<Kotlin2JsCompilerArgumentsHolder> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Kotlin2JsCompilerArgumentsHolder

