'RunConfigurationProducer<KotlinStandaloneScriptRunConfiguration>' @ [27:9] ==> protected/*protected and package*/ constructor RunConfigurationProducer<T : (RunConfiguration..RunConfiguration?)>(p0: (ConfigurationType..ConfigurationType?)) defined in com.intellij.execution.actions.RunConfigurationProducer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (RunConfiguration..RunConfiguration?)> -> KotlinStandaloneScriptRunConfiguration

'KotlinStandaloneScriptRunConfigurationType' @ [27:74] ==> public companion object defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationType[FakeCallableDescriptorForObject]

'instance' @ [27:117] ==> public final val instance: KotlinStandaloneScriptRunConfigurationType defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationType.Companion[PropertyDescriptorImpl]

'configuration' @ [33:9] ==> value-parameter configuration: KotlinStandaloneScriptRunConfiguration defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'setupFilePath' @ [33:23] ==> public final fun setupFilePath(filePath: String): Unit defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfiguration[SimpleFunctionDescriptorImpl]

'pathFromContext' @ [33:37] ==> public final fun pathFromContext(context: ConfigurationContext?): String? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer[SimpleFunctionDescriptorImpl]

'context' @ [33:53] ==> value-parameter context: ConfigurationContext? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'configuration' @ [34:9] ==> value-parameter configuration: KotlinStandaloneScriptRunConfiguration defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.setupConfigurationFromContext[ValueParameterDescriptorImpl]

'setGeneratedName' @ [34:23] ==> public open fun setGeneratedName(): Unit defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfiguration[JavaMethodDescriptor]

'context' @ [39:24] ==> value-parameter context: ConfigurationContext? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.pathFromContext[ValueParameterDescriptorImpl]

'location' @ [39:33] ==> public final val ConfigurationContext.location: raw (Location<(PsiElement..PsiElement?)>?..Location<*>?)[MyPropertyDescriptor]

'pathFromPsiElement' @ [40:16] ==> public final fun pathFromPsiElement(element: PsiElement): String? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.Companion[SimpleFunctionDescriptorImpl]

'location' @ [40:35] ==> val location: (Location<(PsiElement..PsiElement?)>..Location<*>) defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.pathFromContext[LocalVariableDescriptor]

'psiElement' @ [40:44] ==> public final val <E : (PsiElement..PsiElement?)> Location<(PsiElement..PsiElement?)>.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'configuration' @ [44:24] ==> value-parameter configuration: KotlinStandaloneScriptRunConfiguration? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'filePath' @ [44:39] ==> @JvmField public final var filePath: String? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfiguration[PropertyDescriptorImpl]

'filePath' @ [45:16] ==> val filePath: String? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.isConfigurationFromContext[LocalVariableDescriptor]

'filePath' @ [45:36] ==> val filePath: String? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.isConfigurationFromContext[LocalVariableDescriptor]

'pathFromContext' @ [45:48] ==> public final fun pathFromContext(context: ConfigurationContext?): String? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer[SimpleFunctionDescriptorImpl]

'context' @ [45:64] ==> value-parameter context: ConfigurationContext? defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.isConfigurationFromContext[ValueParameterDescriptorImpl]

'element' @ [50:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.Companion.pathFromPsiElement[ValueParameterDescriptorImpl]

'getParentOfType' @ [50:32] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtFile? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFile

'file' @ [51:26] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.Companion.pathFromPsiElement[LocalVariableDescriptor]

'script' @ [51:31] ==> public final val KtFile.script: KtScript?[MyPropertyDescriptor]

'script' @ [52:20] ==> val script: KtScript defined in org.jetbrains.kotlin.idea.run.script.standalone.KotlinStandaloneScriptRunConfigurationProducer.Companion.pathFromPsiElement[LocalVariableDescriptor]

'containingKtFile' @ [52:27] ==> public final val KtScript.containingKtFile: KtFile[MyPropertyDescriptor]

'virtualFile' @ [52:44] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'canonicalPath' @ [52:56] ==> public final val VirtualFile.canonicalPath: String?[MyPropertyDescriptor]

