'KotlinWithGradleConfigurator' @ [33:70] ==> public constructor KotlinWithGradleConfigurator() defined in org.jetbrains.kotlin.idea.configuration.KotlinWithGradleConfigurator[ClassConstructorDescriptorImpl]

'NAME' @ [35:33] ==> private final val NAME: String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.Companion[PropertyDescriptorImpl]

'JvmPlatform' @ [37:51] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'isAndroidGradleModule' @ [41:82] ==> public open fun isAndroidGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [41:104] ==> value-parameter module: Module defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.isApplicable[ValueParameterDescriptorImpl]

'KOTLIN_ANDROID' @ [43:45] ==> private final val KOTLIN_ANDROID: String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.Companion[PropertyDescriptorImpl]

'getManipulator' @ [46:27] ==> public final fun getManipulator(file: PsiFile): GradleBuildScriptManipulator defined in org.jetbrains.kotlin.idea.configuration.KotlinWithGradleConfigurator.Companion[SimpleFunctionDescriptorImpl]

'file' @ [46:42] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[ValueParameterDescriptorImpl]

'findModuleForPsiElement' @ [47:30] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtil[JavaMethodDescriptor]

'file' @ [47:54] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[ValueParameterDescriptorImpl]

'let' @ [47:61] ==> @InlineOnly public inline fun <T, R> Module.let(block: (Module) -> Sdk?): Sdk? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <R> -> Sdk?

'getInstance' @ [47:85] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'it' @ [47:97] ==> value-parameter it: Module defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile.<anonymous>[ValueParameterDescriptorImpl]

'sdk' @ [47:101] ==> public final val ModuleRootManager.sdk: Sdk?[MyPropertyDescriptor]

'getJvmTarget' @ [48:25] ==> protected open fun getJvmTarget(sdk: Sdk?, version: String): String? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator[SimpleFunctionDescriptorImpl]

'sdk' @ [48:38] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[LocalVariableDescriptor]

'version' @ [48:43] ==> value-parameter version: String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[ValueParameterDescriptorImpl]

'if (isTopLevelProjectFile) {
            manipulator.configureProjectBuildScript(version)
        }
        else {
            manipulator.configureModuleBuildScript(
                    kotlinPluginName,
                    getStdlibArtifactName(sdk, version),
                    version,
                    jvmTarget
            )
        }' @ [50:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'isTopLevelProjectFile' @ [50:20] ==> value-parameter isTopLevelProjectFile: Boolean defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[ValueParameterDescriptorImpl]

'manipulator' @ [51:13] ==> val manipulator: GradleBuildScriptManipulator defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[LocalVariableDescriptor]

'configureProjectBuildScript' @ [51:25] ==> public abstract fun configureProjectBuildScript(version: String): Boolean defined in org.jetbrains.kotlin.idea.configuration.GradleBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'version' @ [51:53] ==> value-parameter version: String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[ValueParameterDescriptorImpl]

'manipulator' @ [54:13] ==> val manipulator: GradleBuildScriptManipulator defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[LocalVariableDescriptor]

'configureModuleBuildScript' @ [54:25] ==> public abstract fun configureModuleBuildScript(kotlinPluginName: String, stdlibArtifactName: String, version: String, jvmTarget: String?): Boolean defined in org.jetbrains.kotlin.idea.configuration.GradleBuildScriptManipulator[SimpleFunctionDescriptorImpl]

'kotlinPluginName' @ [55:21] ==> protected open val kotlinPluginName: String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator[PropertyDescriptorImpl]

'getStdlibArtifactName' @ [56:21] ==> protected open fun getStdlibArtifactName(sdk: Sdk?, version: String): String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator[SimpleFunctionDescriptorImpl]

'sdk' @ [56:43] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[LocalVariableDescriptor]

'version' @ [56:48] ==> value-parameter version: String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[ValueParameterDescriptorImpl]

'version' @ [57:21] ==> value-parameter version: String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[ValueParameterDescriptorImpl]

'jvmTarget' @ [58:21] ==> val jvmTarget: String? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.addElementsToFile[LocalVariableDescriptor]

'sdk' @ [64:13] ==> value-parameter sdk: Sdk? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.getStdlibArtifactName[ValueParameterDescriptorImpl]

'hasJreSpecificRuntime' @ [64:28] ==> public fun hasJreSpecificRuntime(version: String): Boolean defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'version' @ [64:50] ==> value-parameter version: String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.getStdlibArtifactName[ValueParameterDescriptorImpl]

'getInstance' @ [65:38] ==> public open fun getInstance(): (JavaSdk..JavaSdk?) defined in com.intellij.openapi.projectRoots.JavaSdk[JavaMethodDescriptor]

'getVersion' @ [65:52] ==> @Nullable public abstract fun getVersion(@NotNull p0: Sdk): JavaSdkVersion? defined in com.intellij.openapi.projectRoots.JavaSdk[JavaMethodDescriptor]

'sdk' @ [65:63] ==> value-parameter sdk: Sdk? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.getStdlibArtifactName[ValueParameterDescriptorImpl]

'sdkVersion' @ [66:17] ==> val sdkVersion: JavaSdkVersion? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.getStdlibArtifactName[LocalVariableDescriptor]

'sdkVersion' @ [66:39] ==> val sdkVersion: JavaSdkVersion? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.getStdlibArtifactName[LocalVariableDescriptor]

'isAtLeast' @ [66:50] ==> public open fun isAtLeast(@NotNull p0: JavaSdkVersion): Boolean defined in com.intellij.openapi.projectRoots.JavaSdkVersion[JavaMethodDescriptor]

'JDK_1_8' @ [66:75] ==> enum entry JDK_1_8 defined in com.intellij.openapi.projectRoots.JavaSdkVersion[FakeCallableDescriptorForObject]

'MAVEN_STDLIB_ID_JRE7' @ [68:24] ==> public val MAVEN_STDLIB_ID_JRE7: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'super' @ [72:16] ==> <this> defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator[LazyClassReceiverParameterDescriptor]

'getStdlibArtifactName' @ [72:22] ==> protected open fun getStdlibArtifactName(sdk: Sdk?, version: String): String defined in org.jetbrains.kotlin.idea.configuration.KotlinWithGradleConfigurator[SimpleFunctionDescriptorImpl]

'sdk' @ [72:44] ==> value-parameter sdk: Sdk? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.getStdlibArtifactName[ValueParameterDescriptorImpl]

'version' @ [72:49] ==> value-parameter version: String defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleModuleConfigurator.getStdlibArtifactName[ValueParameterDescriptorImpl]

