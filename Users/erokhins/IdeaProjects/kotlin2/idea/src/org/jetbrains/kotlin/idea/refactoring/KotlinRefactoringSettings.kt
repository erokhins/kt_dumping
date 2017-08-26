'State' @ [25:1] ==> public constructor State(name: String, storages: Array<Storage> = ..., reloadable: Boolean = ..., defaultStateAsResource: Boolean = ..., additionalExportFile: String = ..., presentableName: KClass<out (State.NameGetter..State.NameGetter?)> = ...) defined in com.intellij.openapi.components.State[JavaClassConstructorDescriptor]

'arrayOf' @ [25:55] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Storage): Array<Storage> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Storage

'Storage' @ [25:63] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'JvmField' @ [27:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'JvmField' @ [28:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'this' @ [30:31] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSettings[LazyClassReceiverParameterDescriptor]

'copyBean' @ [32:82] ==> public open fun <T : (Any..Any?)> copyBean(@NotNull p0: KotlinRefactoringSettings, @NotNull p1: KotlinRefactoringSettings): Unit defined in com.intellij.util.xmlb.XmlSerializerUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinRefactoringSettings

'state' @ [32:91] ==> value-parameter state: KotlinRefactoringSettings defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSettings.loadState[ValueParameterDescriptorImpl]

'this' @ [32:98] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSettings[LazyClassReceiverParameterDescriptor]

'JvmStatic' @ [35:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getService' @ [37:36] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Class<(KotlinRefactoringSettings..KotlinRefactoringSettings?)>): (KotlinRefactoringSettings..KotlinRefactoringSettings?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSettings..org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSettings?)

'KotlinRefactoringSettings' @ [37:47] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringSettings[FakeCallableDescriptorForObject]

'java' @ [37:80] ==> public val <T> KClass<KotlinRefactoringSettings>.java: Class<KotlinRefactoringSettings> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinRefactoringSettings

