'TestClassGradleConfigurationProducer' @ [32:52] ==> public constructor TestClassGradleConfigurationProducer() defined in org.jetbrains.plugins.gradle.execution.test.runner.TestClassGradleConfigurationProducer[JavaClassConstructorDescriptor]

'context' @ [37:31] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [37:39] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'context' @ [38:22] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'module' @ [38:30] ==> public final val ConfigurationContext.module: (Module..Module?)[MyPropertyDescriptor]

'getInstance' @ [40:38] ==> @NotNull public open fun <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> getInstance(p0: (Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>..Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>?)): PatternConfigurationProducer defined in com.intellij.execution.actions.RunConfigurationProducer[JavaMethodDescriptor]
Inferred types:
    <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> -> PatternConfigurationProducer

'PatternConfigurationProducer' @ [40:50] ==> public constructor PatternConfigurationProducer() defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaClassConstructorDescriptor]

'java' @ [40:86] ==> public val <T> KClass<PatternConfigurationProducer>.java: Class<PatternConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PatternConfigurationProducer

'isMultipleElementsSelected' @ [40:92] ==> public open fun isMultipleElementsSelected(p0: (ConfigurationContext..ConfigurationContext?)): Boolean defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaMethodDescriptor]

'context' @ [40:119] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'context' @ [43:20] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [43:28] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'psiElement' @ [43:38] ==> public final val <E : (PsiElement..PsiElement?)> Location<(PsiElement..PsiElement?)>.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'KotlinJUnitRunConfigurationProducer' @ [44:25] ==> public companion object defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer[FakeCallableDescriptorForObject]

'getTestClass' @ [44:61] ==> public final fun getTestClass(leaf: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'leaf' @ [44:74] ==> val leaf: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'sourceElement' @ [45:9] ==> value-parameter sourceElement: Ref<PsiElement> defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'set' @ [45:23] ==> public final fun set(@Nullable p0: PsiElement?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'testClass' @ [45:27] ==> val testClass: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'!' @ [47:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExternalSystemAwareModule' @ [47:36] ==> @Contract public open fun isExternalSystemAwareModule(@NotNull p0: ProjectSystemId, @Nullable p1: Module?): Boolean defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]

'SYSTEM_ID' @ [47:80] ==> @NotNull @NonNls public final val SYSTEM_ID: ProjectSystemId defined in org.jetbrains.plugins.gradle.util.GradleConstants[JavaPropertyDescriptor]

'module' @ [47:91] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'resolveProjectPath' @ [49:27] ==> @Nullable protected/*protected and package*/ open fun resolveProjectPath(@NotNull p0: Module): String? defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer[JavaMethodDescriptor]

'module' @ [49:46] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'getTasksToRun' @ [51:26] ==> @NotNull public open fun getTasksToRun(@NotNull p0: Module): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.plugins.gradle.execution.test.runner.TestClassGradleConfigurationProducer[JavaMethodDescriptor]

'module' @ [51:40] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'tasksToRun' @ [52:13] ==> val tasksToRun: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'isEmpty' @ [52:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'configuration' @ [54:9] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'settings' @ [54:23] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'externalProjectPath' @ [54:32] ==> public final var ExternalSystemTaskExecutionSettings.externalProjectPath: (String..String?)[MyPropertyDescriptor]

'projectPath' @ [54:54] ==> val projectPath: String defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [55:9] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'settings' @ [55:23] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'taskNames' @ [55:32] ==> public final var ExternalSystemTaskExecutionSettings.taskNames: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'tasksToRun' @ [55:44] ==> val tasksToRun: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [56:9] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'settings' @ [56:23] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'scriptParameters' @ [56:32] ==> public final var ExternalSystemTaskExecutionSettings.scriptParameters: (String..String?)[MyPropertyDescriptor]

'String' @ [56:51] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'format' @ [56:58] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'testClass' @ [56:79] ==> val testClass: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'qualifiedName' @ [56:89] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'configuration' @ [57:9] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'name' @ [57:23] ==> public final var ExternalSystemRunConfiguration.name: (String..String?)[MyPropertyDescriptor]

'testClass' @ [57:30] ==> val testClass: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'name' @ [57:40] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'getInstance' @ [59:46] ==> public open fun getInstance(): (JavaRunConfigurationExtensionManager..JavaRunConfigurationExtensionManager?) defined in com.intellij.execution.JavaRunConfigurationExtensionManager[JavaMethodDescriptor]

'extendCreatedConfiguration' @ [59:60] ==> public open fun extendCreatedConfiguration(@NotNull p0: RunConfigurationBase, @NotNull p1: raw (Location<(PsiElement..PsiElement?)>..Location<*>)): Unit defined in com.intellij.execution.JavaRunConfigurationExtensionManager[JavaMethodDescriptor]

'configuration' @ [59:87] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'contextLocation' @ [59:102] ==> val contextLocation: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'context' @ [64:20] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [64:28] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'psiElement' @ [64:38] ==> public final val <E : (PsiElement..PsiElement?)> Location<(PsiElement..PsiElement?)>.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'context' @ [65:13] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'module' @ [65:21] ==> public final val ConfigurationContext.module: (Module..Module?)[MyPropertyDescriptor]

'getInstance' @ [67:38] ==> @NotNull public open fun <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> getInstance(p0: (Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>..Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>?)): PatternConfigurationProducer defined in com.intellij.execution.actions.RunConfigurationProducer[JavaMethodDescriptor]
Inferred types:
    <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> -> PatternConfigurationProducer

'PatternConfigurationProducer' @ [67:50] ==> public constructor PatternConfigurationProducer() defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaClassConstructorDescriptor]

'java' @ [67:86] ==> public val <T> KClass<PatternConfigurationProducer>.java: Class<PatternConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PatternConfigurationProducer

'isMultipleElementsSelected' @ [67:92] ==> public open fun isMultipleElementsSelected(p0: (ConfigurationContext..ConfigurationContext?)): Boolean defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaMethodDescriptor]

'context' @ [67:119] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'KotlinJUnitRunConfigurationProducer' @ [71:30] ==> public companion object defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer[FakeCallableDescriptorForObject]

'getTestMethodLocation' @ [71:66] ==> public final fun getTestMethodLocation(leaf: PsiElement): Location<PsiMethod>? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'leaf' @ [71:88] ==> val leaf: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'methodLocation' @ [72:13] ==> val methodLocation: Location<PsiMethod>? defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'KotlinJUnitRunConfigurationProducer' @ [74:25] ==> public companion object defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer[FakeCallableDescriptorForObject]

'getTestClass' @ [74:61] ==> public final fun getTestClass(leaf: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'leaf' @ [74:74] ==> val leaf: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'testClass' @ [75:13] ==> val testClass: PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'testClass' @ [75:34] ==> val testClass: PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'qualifiedName' @ [75:44] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'resolveProjectPath' @ [78:27] ==> @Nullable protected/*protected and package*/ open fun resolveProjectPath(@NotNull p0: Module): String? defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer[JavaMethodDescriptor]

'context' @ [78:46] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'module' @ [78:54] ==> public final val ConfigurationContext.module: (Module..Module?)[MyPropertyDescriptor]

'projectPath' @ [79:13] ==> val projectPath: String defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [79:28] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'settings' @ [79:42] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'externalProjectPath' @ [79:51] ==> public final var ExternalSystemTaskExecutionSettings.externalProjectPath: (String..String?)[MyPropertyDescriptor]

'!' @ [82:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [82:14] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'settings' @ [82:28] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'taskNames' @ [82:37] ==> public final var ExternalSystemTaskExecutionSettings.taskNames: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'containsAll' @ [82:47] ==> public abstract fun containsAll(elements: Collection<(String..String?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'getTasksToRun' @ [82:59] ==> @NotNull public open fun getTasksToRun(@NotNull p0: Module): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.plugins.gradle.execution.test.runner.TestClassGradleConfigurationProducer[JavaMethodDescriptor]

'context' @ [82:73] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'module' @ [82:81] ==> public final val ConfigurationContext.module: (Module..Module?)[MyPropertyDescriptor]

'configuration' @ [84:32] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'settings' @ [84:46] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'scriptParameters' @ [84:55] ==> public final var ExternalSystemTaskExecutionSettings.scriptParameters: (String..String?)[MyPropertyDescriptor]

'scriptParameters' @ [85:17] ==> val scriptParameters: String defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'indexOf' @ [85:34] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'i' @ [86:13] ==> val i: Int defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'-' @ [86:18] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'scriptParameters' @ [88:19] ==> val scriptParameters: String defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'substringAfter' @ [88:36] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [88:63] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'str' @ [89:16] ==> val str: String defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'startsWith' @ [89:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'testClass' @ [89:31] ==> val testClass: PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'qualifiedName' @ [89:41] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'!' @ [89:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'str' @ [89:66] ==> val str: String defined in org.jetbrains.kotlin.idea.run.KotlinTestClassGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'contains' @ [89:70] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'TestMethodGradleConfigurationProducer' @ [94:7] ==> public constructor TestMethodGradleConfigurationProducer() defined in org.jetbrains.plugins.gradle.execution.test.runner.TestMethodGradleConfigurationProducer[JavaClassConstructorDescriptor]

'context' @ [99:31] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [99:39] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'context' @ [100:13] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'module' @ [100:21] ==> public final val ConfigurationContext.module: (Module..Module?)[MyPropertyDescriptor]

'getInstance' @ [102:38] ==> @NotNull public open fun <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> getInstance(p0: (Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>..Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>?)): PatternConfigurationProducer defined in com.intellij.execution.actions.RunConfigurationProducer[JavaMethodDescriptor]
Inferred types:
    <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> -> PatternConfigurationProducer

'PatternConfigurationProducer' @ [102:50] ==> public constructor PatternConfigurationProducer() defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaClassConstructorDescriptor]

'java' @ [102:86] ==> public val <T> KClass<PatternConfigurationProducer>.java: Class<PatternConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PatternConfigurationProducer

'isMultipleElementsSelected' @ [102:92] ==> public open fun isMultipleElementsSelected(p0: (ConfigurationContext..ConfigurationContext?)): Boolean defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaMethodDescriptor]

'context' @ [102:119] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'KotlinJUnitRunConfigurationProducer' @ [106:30] ==> public companion object defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer[FakeCallableDescriptorForObject]

'getTestMethodLocation' @ [106:66] ==> public final fun getTestMethodLocation(leaf: PsiElement): Location<PsiMethod>? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'contextLocation' @ [106:88] ==> val contextLocation: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'psiElement' @ [106:104] ==> public final val <E : (PsiElement..PsiElement?)> Location<(PsiElement..PsiElement?)>.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'methodLocation' @ [107:25] ==> val methodLocation: Location<PsiMethod> defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'psiElement' @ [107:40] ==> public final val <E : (PsiElement..PsiElement?)> Location<PsiMethod>.psiElement: PsiMethod[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiMethod

'sourceElement' @ [108:9] ==> value-parameter sourceElement: Ref<PsiElement> defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'set' @ [108:23] ==> public final fun set(@Nullable p0: PsiElement?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'psiMethod' @ [108:27] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'psiMethod' @ [110:31] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'containingClass' @ [110:41] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'!' @ [113:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'applyTestMethodConfiguration' @ [113:14] ==> private final fun applyTestMethodConfiguration(configuration: ExternalSystemRunConfiguration, context: ConfigurationContext, psiMethod: PsiMethod, vararg containingClasses: PsiClass): Boolean defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer[SimpleFunctionDescriptorImpl]

'configuration' @ [113:43] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'context' @ [113:58] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'psiMethod' @ [113:67] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'containingClass' @ [113:78] ==> val containingClass: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'getInstance' @ [115:46] ==> public open fun getInstance(): (JavaRunConfigurationExtensionManager..JavaRunConfigurationExtensionManager?) defined in com.intellij.execution.JavaRunConfigurationExtensionManager[JavaMethodDescriptor]

'extendCreatedConfiguration' @ [115:60] ==> public open fun extendCreatedConfiguration(@NotNull p0: RunConfigurationBase, @NotNull p1: raw (Location<(PsiElement..PsiElement?)>..Location<*>)): Unit defined in com.intellij.execution.JavaRunConfigurationExtensionManager[JavaMethodDescriptor]

'configuration' @ [115:87] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[ValueParameterDescriptorImpl]

'contextLocation' @ [115:102] ==> val contextLocation: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doSetupConfigurationFromContext[LocalVariableDescriptor]

'getInstance' @ [120:38] ==> @NotNull public open fun <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> getInstance(p0: (Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>..Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>?)): PatternConfigurationProducer defined in com.intellij.execution.actions.RunConfigurationProducer[JavaMethodDescriptor]
Inferred types:
    <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> -> PatternConfigurationProducer

'PatternConfigurationProducer' @ [120:50] ==> public constructor PatternConfigurationProducer() defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaClassConstructorDescriptor]

'java' @ [120:86] ==> public val <T> KClass<PatternConfigurationProducer>.java: Class<PatternConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PatternConfigurationProducer

'isMultipleElementsSelected' @ [120:92] ==> public open fun isMultipleElementsSelected(p0: (ConfigurationContext..ConfigurationContext?)): Boolean defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaMethodDescriptor]

'context' @ [120:119] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'context' @ [124:31] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [124:39] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'context' @ [125:22] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'module' @ [125:30] ==> public final val ConfigurationContext.module: (Module..Module?)[MyPropertyDescriptor]

'KotlinJUnitRunConfigurationProducer' @ [127:30] ==> public companion object defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer[FakeCallableDescriptorForObject]

'getTestMethodLocation' @ [127:66] ==> public final fun getTestMethodLocation(leaf: PsiElement): Location<PsiMethod>? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'contextLocation' @ [127:88] ==> val contextLocation: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'psiElement' @ [127:104] ==> public final val <E : (PsiElement..PsiElement?)> Location<(PsiElement..PsiElement?)>.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'methodLocation' @ [128:25] ==> val methodLocation: Location<PsiMethod> defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'psiElement' @ [128:40] ==> public final val <E : (PsiElement..PsiElement?)> Location<PsiMethod>.psiElement: PsiMethod[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiMethod

'psiMethod' @ [130:31] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'containingClass' @ [130:41] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'resolveProjectPath' @ [133:27] ==> @Nullable protected/*protected and package*/ open fun resolveProjectPath(@NotNull p0: Module): String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer[JavaMethodDescriptor]

'module' @ [133:46] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'projectPath' @ [135:13] ==> val projectPath: String defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [135:28] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'settings' @ [135:42] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'externalProjectPath' @ [135:51] ==> public final var ExternalSystemTaskExecutionSettings.externalProjectPath: (String..String?)[MyPropertyDescriptor]

'!' @ [138:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'configuration' @ [138:14] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'settings' @ [138:28] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'taskNames' @ [138:37] ==> public final var ExternalSystemTaskExecutionSettings.taskNames: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'containsAll' @ [138:47] ==> public abstract fun containsAll(elements: Collection<(String..String?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'getTasksToRun' @ [138:59] ==> @NotNull public open fun getTasksToRun(@NotNull p0: Module): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.plugins.gradle.execution.test.runner.TestMethodGradleConfigurationProducer[JavaMethodDescriptor]

'module' @ [138:73] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [140:32] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[ValueParameterDescriptorImpl]

'settings' @ [140:46] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'scriptParameters' @ [140:55] ==> public final var ExternalSystemTaskExecutionSettings.scriptParameters: (String..String?)[MyPropertyDescriptor]

'createTestFilter' @ [141:26] ==> private final fun createTestFilter(aClass: PsiClass, psiMethod: PsiMethod): String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'containingClass' @ [141:43] ==> val containingClass: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'psiMethod' @ [141:60] ==> val psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'scriptParameters' @ [142:16] ==> val scriptParameters: String defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'contains' @ [142:33] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'testFilter' @ [142:42] ==> val testFilter: String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.doIsConfigurationFromContext[LocalVariableDescriptor]

'context' @ [149:22] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'module' @ [149:30] ==> public final val ConfigurationContext.module: (Module..Module?)[MyPropertyDescriptor]

'!' @ [151:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExternalSystemAwareModule' @ [151:36] ==> @Contract public open fun isExternalSystemAwareModule(@NotNull p0: ProjectSystemId, @Nullable p1: Module?): Boolean defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]

'SYSTEM_ID' @ [151:80] ==> @NotNull @NonNls public final val SYSTEM_ID: ProjectSystemId defined in org.jetbrains.plugins.gradle.util.GradleConstants[JavaPropertyDescriptor]

'module' @ [151:91] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[LocalVariableDescriptor]

'resolveProjectPath' @ [153:27] ==> @Nullable protected/*protected and package*/ open fun resolveProjectPath(@NotNull p0: Module): String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer[JavaMethodDescriptor]

'module' @ [153:46] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[LocalVariableDescriptor]

'getTasksToRun' @ [155:26] ==> @NotNull public open fun getTasksToRun(@NotNull p0: Module): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.plugins.gradle.execution.test.runner.TestMethodGradleConfigurationProducer[JavaMethodDescriptor]

'module' @ [155:40] ==> val module: Module defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[LocalVariableDescriptor]

'tasksToRun' @ [156:13] ==> val tasksToRun: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[LocalVariableDescriptor]

'isEmpty' @ [156:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'configuration' @ [158:9] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'settings' @ [158:23] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'externalProjectPath' @ [158:32] ==> public final var ExternalSystemTaskExecutionSettings.externalProjectPath: (String..String?)[MyPropertyDescriptor]

'projectPath' @ [158:54] ==> val projectPath: String defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[LocalVariableDescriptor]

'configuration' @ [159:9] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'settings' @ [159:23] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'taskNames' @ [159:32] ==> public final var ExternalSystemTaskExecutionSettings.taskNames: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'tasksToRun' @ [159:44] ==> val tasksToRun: (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[LocalVariableDescriptor]

'containingClasses' @ [161:22] ==> value-parameter vararg containingClasses: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'joinToString' @ [161:40] ==> public fun <T> Array<out PsiClass>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((PsiClass) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'createTestFilter' @ [161:69] ==> private final fun createTestFilter(aClass: PsiClass, psiMethod: PsiMethod): String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'aClass' @ [161:86] ==> value-parameter aClass: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration.<anonymous>[ValueParameterDescriptorImpl]

'psiMethod' @ [161:94] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'configuration' @ [163:9] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'settings' @ [163:23] ==> public final val ExternalSystemRunConfiguration.settings: ExternalSystemTaskExecutionSettings[MyPropertyDescriptor]

'scriptParameters' @ [163:32] ==> public final var ExternalSystemTaskExecutionSettings.scriptParameters: (String..String?)[MyPropertyDescriptor]

'params' @ [163:51] ==> val params: String defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[LocalVariableDescriptor]

'trim' @ [163:58] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'configuration' @ [164:9] ==> value-parameter configuration: ExternalSystemRunConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'name' @ [164:23] ==> public final var ExternalSystemRunConfiguration.name: (String..String?)[MyPropertyDescriptor]

'+' @ [164:30] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (containingClasses.size == 1) containingClasses[0].name + "." else ""' @ [164:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'containingClasses' @ [164:35] ==> value-parameter vararg containingClasses: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'size' @ [164:53] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'containingClasses' @ [164:64] ==> value-parameter vararg containingClasses: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'name' @ [164:85] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'psiMethod' @ [164:107] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.applyTestMethodConfiguration[ValueParameterDescriptorImpl]

'name' @ [164:117] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'createTestFilter' @ [171:20] ==> public final fun createTestFilter(aClass: String?, method: String?): String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'aClass' @ [171:37] ==> value-parameter aClass: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion.createTestFilter[ValueParameterDescriptorImpl]

'qualifiedName' @ [171:44] ==> public final val PsiClass.qualifiedName: String?[MyPropertyDescriptor]

'psiMethod' @ [171:59] ==> value-parameter psiMethod: PsiMethod defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion.createTestFilter[ValueParameterDescriptorImpl]

'name' @ [171:69] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'aClass' @ [175:17] ==> value-parameter aClass: String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion.createTestFilter[ValueParameterDescriptorImpl]

'aClass' @ [176:37] ==> value-parameter aClass: String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion.createTestFilter[ValueParameterDescriptorImpl]

'if (method == null) "" else '.' + method' @ [176:46] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'method' @ [176:50] ==> value-parameter method: String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion.createTestFilter[ValueParameterDescriptorImpl]

'+' @ [176:74] ==> @InlineOnly public operator inline fun Char.plus(other: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'method' @ [176:80] ==> value-parameter method: String? defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion.createTestFilter[ValueParameterDescriptorImpl]

'testFilterPattern' @ [177:32] ==> val testFilterPattern: String defined in org.jetbrains.kotlin.idea.run.KotlinTestMethodGradleConfigurationProducer.Companion.createTestFilter[LocalVariableDescriptor]

