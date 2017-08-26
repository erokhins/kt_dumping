'State' @ [25:1] ==> public constructor State(name: String, storages: Array<Storage> = ..., reloadable: Boolean = ..., defaultStateAsResource: Boolean = ..., additionalExportFile: String = ..., presentableName: KClass<out (State.NameGetter..State.NameGetter?)> = ...) defined in com.intellij.openapi.components.State[JavaClassConstructorDescriptor]

'arrayOf' @ [27:20] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Storage): Array<Storage> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Storage

'Storage' @ [28:17] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'WORKSPACE_FILE' @ [28:50] ==> @NonNls @NotNull public const final val WORKSPACE_FILE: String defined in com.intellij.openapi.components.StoragePathMacros[JavaPropertyDescriptor]

'this' @ [35:16] ==> <this> defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerWorkspaceSettings[LazyClassReceiverParameterDescriptor]

'copyBean' @ [39:27] ==> public open fun <T : (Any..Any?)> copyBean(@NotNull p0: KotlinCompilerWorkspaceSettings, @NotNull p1: KotlinCompilerWorkspaceSettings): Unit defined in com.intellij.util.xmlb.XmlSerializerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinCompilerWorkspaceSettings

'state' @ [39:36] ==> value-parameter state: KotlinCompilerWorkspaceSettings? defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerWorkspaceSettings.loadState[ValueParameterDescriptorImpl]

'this' @ [39:45] ==> <this> defined in org.jetbrains.kotlin.idea.compiler.configuration.KotlinCompilerWorkspaceSettings[LazyClassReceiverParameterDescriptor]

