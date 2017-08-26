'CustomLibraryDescriptorWithDeferredConfig' @ [31:9] ==> public constructor CustomLibraryDescriptorWithDeferredConfig(project: Project?, configuratorName: String, libraryName: String, dialogTitle: String, modulesSeparatorCaption: String, libraryKind: LibraryKind, suitableLibraryKinds: Set<LibraryKind>) defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[ClassConstructorDescriptorImpl]

'project' @ [31:51] ==> value-parameter project: Project? defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.<init>[ValueParameterDescriptorImpl]

'KotlinJavaModuleConfigurator' @ [32:51] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinJavaModuleConfigurator[FakeCallableDescriptorForObject]

'NAME' @ [32:80] ==> public final val NAME: String defined in org.jetbrains.kotlin.idea.configuration.KotlinJavaModuleConfigurator.Companion[PropertyDescriptorImpl]

'LIBRARY_NAME' @ [33:51] ==> public final val LIBRARY_NAME: String defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.Companion[PropertyDescriptorImpl]

'DIALOG_TITLE' @ [34:51] ==> public final val DIALOG_TITLE: String defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.Companion[PropertyDescriptorImpl]

'LIBRARY_CAPTION' @ [35:51] ==> public final val LIBRARY_CAPTION: String defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.Companion[PropertyDescriptorImpl]

'KOTLIN_JAVA_RUNTIME_KIND' @ [36:51] ==> public final val KOTLIN_JAVA_RUNTIME_KIND: (LibraryKind..LibraryKind?) defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.Companion[PropertyDescriptorImpl]

'SUITABLE_LIBRARY_KINDS' @ [37:51] ==> public final val SUITABLE_LIBRARY_KINDS: Set<LibraryKind> defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.Companion[PropertyDescriptorImpl]

'getDefaultJvmTarget' @ [40:32] ==> public fun getDefaultJvmTarget(sdk: Sdk?, version: String): JvmTarget? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'sdk' @ [40:52] ==> value-parameter sdk: Sdk? defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.configureKotlinSettings[ValueParameterDescriptorImpl]

'bundledRuntimeVersion' @ [40:57] ==> public fun bundledRuntimeVersion(): String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'defaultJvmTarget' @ [41:13] ==> val defaultJvmTarget: JvmTarget? defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.configureKotlinSettings[LocalVariableDescriptor]

'Kotlin2JvmCompilerArgumentsHolder' @ [42:13] ==> public companion object defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder[FakeCallableDescriptorForObject]

'getInstance' @ [42:47] ==> public final fun getInstance(project: Project): Kotlin2JvmCompilerArgumentsHolder defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [42:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.configureKotlinSettings[ValueParameterDescriptorImpl]

'update' @ [42:68] ==> public final fun update(changer: K2JVMCompilerArguments.() -> Unit): Unit defined in org.jetbrains.kotlin.idea.compiler.configuration.Kotlin2JvmCompilerArgumentsHolder[DeserializedSimpleFunctionDescriptor]

'jvmTarget' @ [43:17] ==> @GradleOption @Argument public final var jvmTarget: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'defaultJvmTarget' @ [43:29] ==> val defaultJvmTarget: JvmTarget? defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.configureKotlinSettings[LocalVariableDescriptor]

'description' @ [43:46] ==> public open val description: String defined in org.jetbrains.kotlin.config.JvmTarget[DeserializedPropertyDescriptor]

'create' @ [49:52] ==> public open fun create(@NotNull @NonNls p0: String): (LibraryKind..LibraryKind?) defined in com.intellij.openapi.roots.libraries.LibraryKind[JavaMethodDescriptor]

'setOf' @ [55:56] ==> public fun <T> setOf(element: (LibraryKind..LibraryKind?)): Set<(LibraryKind..LibraryKind?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.libraries.LibraryKind..com.intellij.openapi.roots.libraries.LibraryKind?)

'KOTLIN_JAVA_RUNTIME_KIND' @ [55:62] ==> public final val KOTLIN_JAVA_RUNTIME_KIND: (LibraryKind..LibraryKind?) defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeLibraryDescription.Companion[PropertyDescriptorImpl]

