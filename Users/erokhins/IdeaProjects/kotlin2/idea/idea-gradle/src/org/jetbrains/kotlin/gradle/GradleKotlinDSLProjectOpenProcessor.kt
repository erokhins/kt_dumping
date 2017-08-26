'GradleProjectOpenProcessor' @ [24:82] ==> public constructor GradleProjectOpenProcessor(@NotNull p0: GradleProjectImportBuilder) defined in org.jetbrains.plugins.gradle.service.project.wizard.GradleProjectOpenProcessor[JavaClassConstructorDescriptor]

'builder' @ [24:109] ==> value-parameter builder: GradleProjectImportBuilder defined in org.jetbrains.kotlin.gradle.GradleKotlinDSLProjectOpenProcessor.<init>[ValueParameterDescriptorImpl]

'when {
        !file.isDirectory -> file.name.endsWith(".gradle.kts")
        supportedExtensions.any { file.findChild(it) != null } -> true
        else -> super.canOpenProject(file)
    }' @ [25:63] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'!' @ [26:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [26:10] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.gradle.GradleKotlinDSLProjectOpenProcessor.canOpenProject[ValueParameterDescriptorImpl]

'isDirectory' @ [26:15] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'file' @ [26:30] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.gradle.GradleKotlinDSLProjectOpenProcessor.canOpenProject[ValueParameterDescriptorImpl]

'name' @ [26:35] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'endsWith' @ [26:40] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'supportedExtensions' @ [27:9] ==> public final val GradleKotlinDSLProjectOpenProcessor.supportedExtensions: Array<String>[MyPropertyDescriptor]

'any' @ [27:29] ==> public inline fun <T> Array<out String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'file' @ [27:35] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.gradle.GradleKotlinDSLProjectOpenProcessor.canOpenProject[ValueParameterDescriptorImpl]

'findChild' @ [27:40] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'it' @ [27:50] ==> value-parameter it: String defined in org.jetbrains.kotlin.gradle.GradleKotlinDSLProjectOpenProcessor.canOpenProject.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [28:17] ==> <this> defined in org.jetbrains.kotlin.gradle.GradleKotlinDSLProjectOpenProcessor[LazyClassReceiverParameterDescriptor]

'canOpenProject' @ [28:23] ==> public open fun canOpenProject(p0: (VirtualFile..VirtualFile?)): Boolean defined in org.jetbrains.plugins.gradle.service.project.wizard.GradleProjectOpenProcessor[JavaMethodDescriptor]

'file' @ [28:38] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.gradle.GradleKotlinDSLProjectOpenProcessor.canOpenProject[ValueParameterDescriptorImpl]

'arrayOf' @ [32:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'DEFAULT_SCRIPT_NAME' @ [32:40] ==> @NotNull @NonNls public const final val DEFAULT_SCRIPT_NAME: String defined in org.jetbrains.plugins.gradle.util.GradleConstants[JavaPropertyDescriptor]

'SETTINGS_FILE_NAME' @ [32:83] ==> @NotNull @NonNls public const final val SETTINGS_FILE_NAME: String defined in org.jetbrains.plugins.gradle.util.GradleConstants[JavaPropertyDescriptor]

