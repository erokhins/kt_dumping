'RunConfigurationProducer<JUnitConfiguration>' @ [41:45] ==> protected/*protected and package*/ constructor RunConfigurationProducer<T : (RunConfiguration..RunConfiguration?)>(p0: (ConfigurationType..ConfigurationType?)) defined in com.intellij.execution.actions.RunConfigurationProducer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (RunConfiguration..RunConfiguration?)> -> JUnitConfiguration

'getInstance' @ [41:113] ==> @NotNull public open fun getInstance(): JUnitConfigurationType defined in com.intellij.execution.junit.JUnitConfigurationType[JavaMethodDescriptor]

'other' @ [43:16] ==> value-parameter other: ConfigurationFromContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.shouldReplace[ValueParameterDescriptorImpl]

'isProducedBy' @ [43:22] ==> public open fun isProducedBy(p0: (Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>..Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>?)): Boolean defined in com.intellij.execution.actions.ConfigurationFromContext[JavaMethodDescriptor]

'JUnitConfigurationProducer' @ [43:35] ==> public constructor JUnitConfigurationProducer() defined in com.intellij.execution.junit.JUnitConfigurationProducer[JavaClassConstructorDescriptor]

'java' @ [43:69] ==> public val <T> KClass<JUnitConfigurationProducer>.java: Class<JUnitConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JUnitConfigurationProducer

'other' @ [43:78] ==> value-parameter other: ConfigurationFromContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.shouldReplace[ValueParameterDescriptorImpl]

'isProducedBy' @ [43:84] ==> public open fun isProducedBy(p0: (Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>..Class<out raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)>?)): Boolean defined in com.intellij.execution.actions.ConfigurationFromContext[JavaMethodDescriptor]

'PatternConfigurationProducer' @ [43:97] ==> public constructor PatternConfigurationProducer() defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaClassConstructorDescriptor]

'java' @ [43:133] ==> public val <T> KClass<PatternConfigurationProducer>.java: Class<PatternConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PatternConfigurationProducer

'getInstance' @ [48:38] ==> @NotNull public open fun <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> getInstance(p0: (Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>..Class<out (PatternConfigurationProducer..PatternConfigurationProducer?)>?)): PatternConfigurationProducer defined in com.intellij.execution.actions.RunConfigurationProducer[JavaMethodDescriptor]
Inferred types:
    <T : raw (RunConfigurationProducer<(RunConfiguration..RunConfiguration?)>..RunConfigurationProducer<*>?)> -> PatternConfigurationProducer

'PatternConfigurationProducer' @ [48:50] ==> public constructor PatternConfigurationProducer() defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaClassConstructorDescriptor]

'java' @ [48:86] ==> public val <T> KClass<PatternConfigurationProducer>.java: Class<PatternConfigurationProducer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PatternConfigurationProducer

'isMultipleElementsSelected' @ [48:92] ==> public open fun isMultipleElementsSelected(p0: (ConfigurationContext..ConfigurationContext?)): Boolean defined in com.intellij.execution.junit.PatternConfigurationProducer[JavaMethodDescriptor]

'context' @ [48:119] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'context' @ [52:20] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [52:28] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'psiElement' @ [52:38] ==> public final val <E : (PsiElement..PsiElement?)> Location<(PsiElement..PsiElement?)>.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'getTestMethodLocation' @ [53:30] ==> public final fun getTestMethodLocation(leaf: PsiElement): Location<PsiMethod>? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'leaf' @ [53:52] ==> val leaf: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[LocalVariableDescriptor]

'getTestClass' @ [54:25] ==> public final fun getTestClass(leaf: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'leaf' @ [54:38] ==> val leaf: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [55:26] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'testObject' @ [55:40] ==> public final val JUnitConfiguration.testObject: (TestObject..TestObject?)[MyPropertyDescriptor]

'!' @ [57:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'testObject' @ [57:14] ==> val testObject: (TestObject..TestObject?) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[LocalVariableDescriptor]

'isConfiguredByElement' @ [57:25] ==> public abstract fun isConfiguredByElement(p0: (JUnitConfiguration..JUnitConfiguration?), p1: (PsiClass..PsiClass?), p2: (PsiMethod..PsiMethod?), p3: (PsiPackage..PsiPackage?), p4: (PsiDirectory..PsiDirectory?)): Boolean defined in com.intellij.execution.junit.TestObject[JavaMethodDescriptor]

'configuration' @ [57:47] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'testClass' @ [57:62] ==> val testClass: PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[LocalVariableDescriptor]

'methodLocation' @ [57:73] ==> val methodLocation: Location<PsiMethod>? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[LocalVariableDescriptor]

'psiElement' @ [57:89] ==> public final val <E : (PsiElement..PsiElement?)> Location<PsiMethod>.psiElement: PsiMethod[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiMethod

'settingsMatchTemplate' @ [61:16] ==> private final fun settingsMatchTemplate(configuration: JUnitConfiguration, context: ConfigurationContext): Boolean defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer[SimpleFunctionDescriptorImpl]

'configuration' @ [61:38] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'context' @ [61:53] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'context' @ [66:39] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[ValueParameterDescriptorImpl]

'getOriginalConfiguration' @ [66:47] ==> @Nullable public open fun getOriginalConfiguration(@Nullable p0: ConfigurationType?): RunConfiguration? defined in com.intellij.execution.actions.ConfigurationContext[JavaMethodDescriptor]

'getInstance' @ [66:95] ==> @NotNull public open fun getInstance(): JUnitConfigurationType defined in com.intellij.execution.junit.JUnitConfigurationType[JavaMethodDescriptor]

'predefinedConfiguration' @ [68:29] ==> val predefinedConfiguration: RunConfiguration? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[LocalVariableDescriptor]

'vmParameters' @ [68:96] ==> public final var CommonJavaRunConfigurationParameters.vmParameters: (String..String?)[MyPropertyDescriptor]

'vmParameters' @ [69:13] ==> val vmParameters: String? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[LocalVariableDescriptor]

'configuration' @ [69:37] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[ValueParameterDescriptorImpl]

'vmParameters' @ [69:51] ==> public final var JUnitConfiguration.vmParameters: (String..String?)[MyPropertyDescriptor]

'vmParameters' @ [69:67] ==> val vmParameters: String? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[LocalVariableDescriptor]

'RunManager' @ [71:24] ==> public companion object defined in com.intellij.execution.RunManager[FakeCallableDescriptorForObject]

'getInstance' @ [71:35] ==> @JvmStatic public final fun getInstance(project: Project): RunManager defined in com.intellij.execution.RunManager.Companion[DeserializedSimpleFunctionDescriptor]

'configuration' @ [71:47] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[ValueParameterDescriptorImpl]

'project' @ [71:61] ==> public final val JUnitConfiguration.project: Project[MyPropertyDescriptor]

'getConfigurationTemplate' @ [71:70] ==> public abstract fun getConfigurationTemplate(factory: ConfigurationFactory): RunnerAndConfigurationSettings defined in com.intellij.execution.RunManager[DeserializedSimpleFunctionDescriptor]

'configurationFactory' @ [71:95] ==> public final val KotlinJUnitRunConfigurationProducer.configurationFactory: (ConfigurationFactory..ConfigurationFactory?)[MyPropertyDescriptor]

'template' @ [72:33] ==> val template: RunnerAndConfigurationSettings defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[LocalVariableDescriptor]

'configuration' @ [72:42] ==> public final val RunnerAndConfigurationSettings.configuration: RunConfiguration[MyPropertyDescriptor]

'configurationModule' @ [72:88] ==> public final val <ConfigurationModule : (RunConfigurationModule..RunConfigurationModule?)> ModuleBasedConfiguration<out (RunConfigurationModule..RunConfigurationModule?)>.configurationModule: (RunConfigurationModule..RunConfigurationModule?)[MyPropertyDescriptor]
Inferred types:
    <ConfigurationModule : (RunConfigurationModule..RunConfigurationModule?)> -> (com.intellij.execution.configurations.RunConfigurationModule..com.intellij.execution.configurations.RunConfigurationModule?)

'module' @ [72:108] ==> public final var RunConfigurationModule.module: Module?[MyPropertyDescriptor]

'configuration' @ [73:35] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[ValueParameterDescriptorImpl]

'configurationModule' @ [73:49] ==> public final val JUnitConfiguration.configurationModule: (JavaRunConfigurationModule..JavaRunConfigurationModule?)[MyPropertyDescriptor]

'module' @ [73:69] ==> public final var JavaRunConfigurationModule.module: Module?[MyPropertyDescriptor]

'configurationModule' @ [74:16] ==> val configurationModule: Module? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[LocalVariableDescriptor]

'context' @ [74:39] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[ValueParameterDescriptorImpl]

'location' @ [74:47] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'module' @ [74:57] ==> public final val <E : (PsiElement..PsiElement?)> Location<(PsiElement..PsiElement?)>.module: Module?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'configurationModule' @ [74:67] ==> val configurationModule: Module? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[LocalVariableDescriptor]

'predefinedModule' @ [74:90] ==> val predefinedModule: Module? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.settingsMatchTemplate[LocalVariableDescriptor]

'getInstance' @ [80:25] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'context' @ [80:37] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'project' @ [80:45] ==> public final val ConfigurationContext.project: (Project..Project?)[MyPropertyDescriptor]

'isDumb' @ [80:54] ==> public final val DumbService.isDumb: Boolean[MyPropertyDescriptor]

'context' @ [82:24] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [82:32] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'location' @ [83:20] ==> val location: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'psiElement' @ [83:29] ==> public final val <E : (PsiElement..PsiElement?)> Location<(PsiElement..PsiElement?)>.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'!' @ [85:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ProjectRootsUtil' @ [85:14] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isInProjectOrLibSource' @ [85:31] ==> @JvmStatic public final fun isInProjectOrLibSource(element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'leaf' @ [85:54] ==> val leaf: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'leaf' @ [89:13] ==> val leaf: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'containingFile' @ [89:18] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'leaf' @ [93:22] ==> val leaf: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'containingFile' @ [93:27] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'!=' @ [95:13] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.TargetPlatform[DeserializedSimpleFunctionDescriptor]

'getPlatform' @ [95:36] ==> @NotNull public open fun getPlatform(@NotNull p0: KtFile): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'ktFile' @ [95:48] ==> val ktFile: KtFile defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'JvmPlatform' @ [95:59] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'getTestMethodLocation' @ [99:30] ==> public final fun getTestMethodLocation(leaf: PsiElement): Location<PsiMethod>? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'leaf' @ [99:52] ==> val leaf: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'methodLocation' @ [100:13] ==> val methodLocation: Location<PsiMethod>? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [101:34] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'configurationModule' @ [101:48] ==> public final val JUnitConfiguration.configurationModule: (JavaRunConfigurationModule..JavaRunConfigurationModule?)[MyPropertyDescriptor]

'module' @ [101:68] ==> public final var JavaRunConfigurationModule.module: Module?[MyPropertyDescriptor]

'configuration' @ [102:13] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'beMethodConfiguration' @ [102:27] ==> public open fun beMethodConfiguration(p0: (Location<(PsiMethod..PsiMethod?)>..Location<(PsiMethod..PsiMethod?)>?)): Unit defined in com.intellij.execution.junit.JUnitConfiguration[JavaMethodDescriptor]

'methodLocation' @ [102:49] ==> val methodLocation: Location<PsiMethod>? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [103:13] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'restoreOriginalModule' @ [103:27] ==> public open fun restoreOriginalModule(p0: (Module..Module?)): Unit defined in com.intellij.execution.junit.JUnitConfiguration[JavaMethodDescriptor]

'originalModule' @ [103:49] ==> val originalModule: Module? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'getInstance' @ [104:50] ==> public open fun getInstance(): (JavaRunConfigurationExtensionManager..JavaRunConfigurationExtensionManager?) defined in com.intellij.execution.JavaRunConfigurationExtensionManager[JavaMethodDescriptor]

'extendCreatedConfiguration' @ [104:64] ==> public open fun extendCreatedConfiguration(@NotNull p0: RunConfigurationBase, @NotNull p1: raw (Location<(PsiElement..PsiElement?)>..Location<*>)): Unit defined in com.intellij.execution.JavaRunConfigurationExtensionManager[JavaMethodDescriptor]

'configuration' @ [104:91] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [104:106] ==> val location: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'getTestClass' @ [108:25] ==> public final fun getTestClass(leaf: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'leaf' @ [108:38] ==> val leaf: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'testClass' @ [109:13] ==> val testClass: PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [110:34] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'configurationModule' @ [110:48] ==> public final val JUnitConfiguration.configurationModule: (JavaRunConfigurationModule..JavaRunConfigurationModule?)[MyPropertyDescriptor]

'module' @ [110:68] ==> public final var JavaRunConfigurationModule.module: Module?[MyPropertyDescriptor]

'configuration' @ [111:13] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'beClassConfiguration' @ [111:27] ==> public open fun beClassConfiguration(p0: (PsiClass..PsiClass?)): Unit defined in com.intellij.execution.junit.JUnitConfiguration[JavaMethodDescriptor]

'testClass' @ [111:48] ==> val testClass: PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'configuration' @ [112:13] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'restoreOriginalModule' @ [112:27] ==> public open fun restoreOriginalModule(p0: (Module..Module?)): Unit defined in com.intellij.execution.junit.JUnitConfiguration[JavaMethodDescriptor]

'originalModule' @ [112:49] ==> val originalModule: Module? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'getInstance' @ [113:50] ==> public open fun getInstance(): (JavaRunConfigurationExtensionManager..JavaRunConfigurationExtensionManager?) defined in com.intellij.execution.JavaRunConfigurationExtensionManager[JavaMethodDescriptor]

'extendCreatedConfiguration' @ [113:64] ==> public open fun extendCreatedConfiguration(@NotNull p0: RunConfigurationBase, @NotNull p1: raw (Location<(PsiElement..PsiElement?)>..Location<*>)): Unit defined in com.intellij.execution.JavaRunConfigurationExtensionManager[JavaMethodDescriptor]

'configuration' @ [113:91] ==> value-parameter configuration: JUnitConfiguration defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'location' @ [113:106] ==> val location: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.setupConfigurationFromContext[LocalVariableDescriptor]

'fromContext' @ [121:20] ==> value-parameter fromContext: ConfigurationFromContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun[ValueParameterDescriptorImpl]

'sourceElement' @ [121:32] ==> public final val ConfigurationFromContext.sourceElement: PsiElement[MyPropertyDescriptor]

'getTestClass' @ [122:9] ==> public final fun getTestClass(leaf: PsiElement): PsiClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'leaf' @ [122:22] ==> val leaf: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun[LocalVariableDescriptor]

'let' @ [122:29] ==> @InlineOnly public inline fun <T, R> PsiClass.let(block: (PsiClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass
    <R> -> Nothing

'ConfigurationFromContext' @ [123:50] ==> public constructor ConfigurationFromContext() defined in com.intellij.execution.actions.ConfigurationFromContext[JavaClassConstructorDescriptor]

'fromContext' @ [124:59] ==> value-parameter fromContext: ConfigurationFromContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun[ValueParameterDescriptorImpl]

'configurationSettings' @ [124:71] ==> public final var ConfigurationFromContext.configurationSettings: RunnerAndConfigurationSettings[MyPropertyDescriptor]

'fromContext' @ [127:21] ==> value-parameter fromContext: ConfigurationFromContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun[ValueParameterDescriptorImpl]

'configurationSettings' @ [127:33] ==> public final var ConfigurationFromContext.configurationSettings: RunnerAndConfigurationSettings[MyPropertyDescriptor]

'configurationSettings' @ [127:57] ==> value-parameter configurationSettings: RunnerAndConfigurationSettings defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun.<anonymous>.<no name provided>.setConfigurationSettings[ValueParameterDescriptorImpl]

'testClass' @ [130:51] ==> value-parameter testClass: PsiClass defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun.<anonymous>[ValueParameterDescriptorImpl]

'AbstractTestClassConfigurationProducer' @ [133:29] ==> protected/*protected and package*/ constructor AbstractTestClassConfigurationProducer(p0: (ConfigurationType..ConfigurationType?)) defined in com.intellij.execution.junit.AbstractTestClassConfigurationProducer[JavaClassConstructorDescriptor]

'getInstance' @ [133:91] ==> @NotNull public open fun getInstance(): JUnitConfigurationType defined in com.intellij.execution.junit.JUnitConfigurationType[JavaMethodDescriptor]

'onFirstRun' @ [134:22] ==> public open fun onFirstRun(@NotNull p0: ConfigurationFromContext, @NotNull p1: ConfigurationContext, @NotNull p2: Runnable): Unit defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun.<anonymous>.<no name provided>[JavaMethodDescriptor]

'fromContextSubstitute' @ [134:33] ==> val fromContextSubstitute: <no name provided> defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun.<anonymous>[LocalVariableDescriptor]

'context' @ [134:56] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun[ValueParameterDescriptorImpl]

'performRunnable' @ [134:65] ==> value-parameter performRunnable: Runnable defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun[ValueParameterDescriptorImpl]

'super' @ [137:9] ==> <this> defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer[LazyClassReceiverParameterDescriptor]

'onFirstRun' @ [137:15] ==> public open fun onFirstRun(@NotNull p0: ConfigurationFromContext, @NotNull p1: ConfigurationContext, @NotNull p2: Runnable): Unit defined in com.intellij.execution.actions.RunConfigurationProducer[JavaMethodDescriptor]

'fromContext' @ [137:26] ==> value-parameter fromContext: ConfigurationFromContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun[ValueParameterDescriptorImpl]

'context' @ [137:39] ==> value-parameter context: ConfigurationContext defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun[ValueParameterDescriptorImpl]

'performRunnable' @ [137:48] ==> value-parameter performRunnable: Runnable defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.onFirstRun[ValueParameterDescriptorImpl]

'leaf' @ [142:34] ==> value-parameter leaf: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestClass[ValueParameterDescriptorImpl]

'containingFile' @ [142:39] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'leaf' @ [143:27] ==> value-parameter leaf: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestClass[ValueParameterDescriptorImpl]

'getParentOfType' @ [143:32] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'!' @ [144:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ktClass' @ [144:18] ==> var ktClass: KtClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestClass[LocalVariableDescriptor]

'isJUnitTestClass' @ [144:26] ==> private final fun KtClass?.isJUnitTestClass(): Boolean defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'ktClass' @ [145:17] ==> var ktClass: KtClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestClass[LocalVariableDescriptor]

'getTestClassInFile' @ [145:27] ==> private final fun getTestClassInFile(ktFile: KtFile): KtClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'containingFile' @ [145:46] ==> val containingFile: KtFile defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestClass[LocalVariableDescriptor]

'ktClass' @ [147:20] ==> var ktClass: KtClass? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestClass[LocalVariableDescriptor]

'toLightClass' @ [147:29] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'leaf' @ [151:28] ==> value-parameter leaf: PsiElement defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation[ValueParameterDescriptorImpl]

'getParentOfType' @ [151:33] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtNamedFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtNamedFunction

'getParentOfType' @ [152:37] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtTypeParameterListOwner..KtTypeParameterListOwner?)>..Class<out (KtTypeParameterListOwner..KtTypeParameterListOwner?)>?)): KtTypeParameterListOwner? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtTypeParameterListOwner

'function' @ [152:53] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation[LocalVariableDescriptor]

'java' @ [152:81] ==> public val <T> KClass<KtFunction>.java: Class<KtFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtFunction

'java' @ [152:102] ==> public val <T> KClass<KtClass>.java: Class<KtClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClass

'owner' @ [154:17] ==> val owner: KtTypeParameterListOwner? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation[LocalVariableDescriptor]

'owner' @ [155:32] ==> val owner: KtTypeParameterListOwner? defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation[LocalVariableDescriptor]

'toLightClass' @ [155:38] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'delegate' @ [156:30] ==> val delegate: KtLightClass defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation[LocalVariableDescriptor]

'methods' @ [156:39] ==> public final val KtLightClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'firstOrNull' @ [156:47] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.firstOrNull(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [156:63] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation.<anonymous>[ValueParameterDescriptorImpl]

'navigationElement' @ [156:66] ==> public final val PsiMethod.navigationElement: PsiElement[MyPropertyDescriptor]

'function' @ [156:87] ==> val function: KtNamedFunction defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation[LocalVariableDescriptor]

'fromPsiElement' @ [157:50] ==> public open fun <T : (PsiElement..PsiElement?)> fromPsiElement(p0: (PsiMethod..PsiMethod?)): (Location<(PsiMethod..PsiMethod?)>..Location<(PsiMethod..PsiMethod?)>?) defined in com.intellij.execution.PsiLocation[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiMethod

'method' @ [157:65] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation[LocalVariableDescriptor]

'isTestMethod' @ [158:31] ==> public open fun isTestMethod(p0: (Location<out (PsiMethod..PsiMethod?)>..Location<out (PsiMethod..PsiMethod?)>?), p1: Boolean): Boolean defined in com.intellij.execution.junit.JUnitUtil[JavaMethodDescriptor]

'methodLocation' @ [158:44] ==> val methodLocation: (Location<(PsiMethod..PsiMethod?)>..Location<(PsiMethod..PsiMethod?)>?) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation[LocalVariableDescriptor]

'methodLocation' @ [159:28] ==> val methodLocation: (Location<(PsiMethod..PsiMethod?)>..Location<(PsiMethod..PsiMethod?)>?) defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestMethodLocation[LocalVariableDescriptor]

'this' @ [166:17] ==> <this> defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.isJUnitTestClass[ReceiverParameterDescriptorImpl]

'toLightClass' @ [166:23] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [166:39] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> Boolean

'isTestClass' @ [166:55] ==> public open fun isTestClass(@NotNull p0: PsiClass, p1: Boolean, p2: Boolean): Boolean defined in com.intellij.execution.junit.JUnitUtil[JavaMethodDescriptor]

'it' @ [166:67] ==> value-parameter it: KtLightClass defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.isJUnitTestClass.<anonymous>[ValueParameterDescriptorImpl]

'ktFile' @ [169:17] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestClassInFile[ValueParameterDescriptorImpl]

'declarations' @ [169:24] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'filterIsInstance' @ [169:37] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClass

'singleOrNull' @ [169:65] ==> public inline fun <T> Iterable<KtClass>.singleOrNull(predicate: (KtClass) -> Boolean): KtClass? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtClass

'it' @ [169:80] ==> value-parameter it: KtClass defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion.getTestClassInFile.<anonymous>[ValueParameterDescriptorImpl]

'isJUnitTestClass' @ [169:83] ==> private final fun KtClass?.isJUnitTestClass(): Boolean defined in org.jetbrains.kotlin.idea.run.KotlinJUnitRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

