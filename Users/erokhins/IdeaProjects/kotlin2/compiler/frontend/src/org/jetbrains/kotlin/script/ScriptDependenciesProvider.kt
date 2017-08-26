'getScriptDependencies' @ [27:48] ==> public abstract fun getScriptDependencies(file: VirtualFile): ScriptDependencies? defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider[SimpleFunctionDescriptorImpl]

'file' @ [27:70] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider.getScriptDependencies[ValueParameterDescriptorImpl]

'virtualFile' @ [27:75] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'getService' @ [31:32] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(ScriptDependenciesProvider..ScriptDependenciesProvider?)>): (ScriptDependenciesProvider..ScriptDependenciesProvider?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.script.ScriptDependenciesProvider..org.jetbrains.kotlin.script.ScriptDependenciesProvider?)

'project' @ [31:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider.Companion.getInstance[ValueParameterDescriptorImpl]

'ScriptDependenciesProvider' @ [31:52] ==> public companion object defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider[FakeCallableDescriptorForObject]

'java' @ [31:86] ==> public val <T> KClass<ScriptDependenciesProvider>.java: Class<ScriptDependenciesProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptDependenciesProvider

'ScriptDependenciesProvider' @ [36:9] ==> public companion object defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider[FakeCallableDescriptorForObject]

'getInstance' @ [36:36] ==> public final fun getInstance(project: Project): ScriptDependenciesProvider defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider.Companion[SimpleFunctionDescriptorImpl]

'project' @ [36:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.script.getScriptExternalDependencies[ValueParameterDescriptorImpl]

'getScriptDependencies' @ [36:57] ==> public abstract fun getScriptDependencies(file: VirtualFile): ScriptDependencies? defined in org.jetbrains.kotlin.script.ScriptDependenciesProvider[SimpleFunctionDescriptorImpl]

'file' @ [36:79] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.script.getScriptExternalDependencies[ValueParameterDescriptorImpl]

