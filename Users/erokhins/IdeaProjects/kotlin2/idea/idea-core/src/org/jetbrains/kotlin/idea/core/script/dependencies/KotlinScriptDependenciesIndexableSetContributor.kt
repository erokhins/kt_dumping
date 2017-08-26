'IndexableSetContributor' @ [24:57] ==> public constructor IndexableSetContributor() defined in com.intellij.util.indexing.IndexableSetContributor[JavaClassConstructorDescriptor]

'ScriptDependenciesManager' @ [27:23] ==> public companion object defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[FakeCallableDescriptorForObject]

'getInstance' @ [27:49] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'project' @ [27:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptDependenciesIndexableSetContributor.getAdditionalProjectRootsToIndex[ValueParameterDescriptorImpl]

'manager' @ [28:17] ==> val manager: ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptDependenciesIndexableSetContributor.getAdditionalProjectRootsToIndex[LocalVariableDescriptor]

'getAllScriptsClasspath' @ [28:25] ==> public final fun getAllScriptsClasspath(): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'manager' @ [28:52] ==> val manager: ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptDependenciesIndexableSetContributor.getAdditionalProjectRootsToIndex[LocalVariableDescriptor]

'getAllLibrarySources' @ [28:60] ==> public final fun getAllLibrarySources(): List<VirtualFile> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'filterTo' @ [28:84] ==> public inline fun <T, C : MutableCollection<in VirtualFile>> Iterable<VirtualFile>.filterTo(destination: LinkedHashSet<VirtualFile> /* = LinkedHashSet<VirtualFile> */, predicate: (VirtualFile) -> Boolean): LinkedHashSet<VirtualFile> /* = LinkedHashSet<VirtualFile> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <C : MutableCollection<in T>> -> LinkedHashSet<VirtualFile>

'LinkedHashSet' @ [28:93] ==> public final fun <E> <init>(): LinkedHashSet<VirtualFile> /* = LinkedHashSet<VirtualFile> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> VirtualFile

'it' @ [28:112] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.dependencies.KotlinScriptDependenciesIndexableSetContributor.getAdditionalProjectRootsToIndex.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [28:115] ==> public final val VirtualFile.isValid: Boolean[MyPropertyDescriptor]

'emptySet' @ [31:66] ==> public fun <T> emptySet(): Set<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

