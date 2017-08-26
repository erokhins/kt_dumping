'ResolveScopeProvider' @ [27:42] ==> public constructor ResolveScopeProvider() defined in com.intellij.psi.ResolveScopeProvider[JavaClassConstructorDescriptor]

'getScriptDefinition' @ [33:32] ==> public fun getScriptDefinition(file: VirtualFile, project: Project): KotlinScriptDefinition? defined in org.jetbrains.kotlin.script[DeserializedSimpleFunctionDescriptor]

'file' @ [33:52] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider.getResolveScope[ValueParameterDescriptorImpl]

'project' @ [33:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider.getResolveScope[ValueParameterDescriptorImpl]

'when {
            scriptDefinition == null -> null
            // This is a workaround for completion in scripts and REPL to provide module dependencies
            scriptDefinition.template == Any::class -> null
            scriptDefinition is KotlinScriptDefinitionFromAnnotatedTemplate -> // TODO: should include the file itself
                if (scriptDefinition.environment?.containsKey(USE_NULL_RESOLVE_SCOPE) ?: false) {
                    null
                }
                else {
                    ScriptDependenciesManager.getInstance(project).getAllScriptsClasspathScope()
                }
            else -> null
        }' @ [35:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: GlobalSearchScope?, entry1: GlobalSearchScope?, entry2: GlobalSearchScope?, entry3: GlobalSearchScope?): GlobalSearchScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> GlobalSearchScope?

'scriptDefinition' @ [36:13] ==> val scriptDefinition: KotlinScriptDefinition? defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider.getResolveScope[LocalVariableDescriptor]

'scriptDefinition' @ [38:13] ==> val scriptDefinition: KotlinScriptDefinition? defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider.getResolveScope[LocalVariableDescriptor]

'template' @ [38:30] ==> public final val template: KClass<out Any> defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedPropertyDescriptor]

'Any' @ [38:42] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'scriptDefinition' @ [39:13] ==> val scriptDefinition: KotlinScriptDefinition? defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider.getResolveScope[LocalVariableDescriptor]

'if (scriptDefinition.environment?.containsKey(USE_NULL_RESOLVE_SCOPE) ?: false) {
                    null
                }
                else {
                    ScriptDependenciesManager.getInstance(project).getAllScriptsClasspathScope()
                }' @ [40:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: NonClasspathDirectoriesScope?, elseBranch: NonClasspathDirectoriesScope?): NonClasspathDirectoriesScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> NonClasspathDirectoriesScope?

'scriptDefinition' @ [40:21] ==> val scriptDefinition: KotlinScriptDefinition? defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider.getResolveScope[LocalVariableDescriptor]

'environment' @ [40:38] ==> public final val environment: Map<String, Any?>? defined in org.jetbrains.kotlin.script.KotlinScriptDefinitionFromAnnotatedTemplate[DeserializedPropertyDescriptor]

'containsKey' @ [40:51] ==> public abstract fun containsKey(key: String): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'USE_NULL_RESOLVE_SCOPE' @ [40:63] ==> public final val USE_NULL_RESOLVE_SCOPE: String defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider.Companion[PropertyDescriptorImpl]

'ScriptDependenciesManager' @ [44:21] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'getInstance' @ [44:47] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'project' @ [44:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptResolveScopeProvider.getResolveScope[ValueParameterDescriptorImpl]

'getAllScriptsClasspathScope' @ [44:68] ==> public final fun getAllScriptsClasspathScope(): NonClasspathDirectoriesScope defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

