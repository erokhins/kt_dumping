'getInstance' @ [45:45] ==> public open fun getInstance(p0: (Project..Project?)): (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'project' @ [45:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[ValueParameterDescriptorImpl]

'mavenManager' @ [47:24] ==> val mavenManager: (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'projects' @ [47:37] ==> public final val MavenProjectsManager.projects: (MutableList<(MavenProject..MavenProject?)>..List<(MavenProject..MavenProject?)>)[MyPropertyDescriptor]

'associateBy' @ [47:46] ==> public inline fun <T, K> Iterable<(MavenProject..MavenProject?)>.associateBy(keySelector: ((MavenProject..MavenProject?)) -> MavenId): Map<MavenId, (MavenProject..MavenProject?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.project.MavenProject..org.jetbrains.idea.maven.project.MavenProject?)
    <K> -> MavenId

'it' @ [47:60] ==> value-parameter it: (MavenProject..MavenProject?) defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules.<anonymous>[ValueParameterDescriptorImpl]

'mavenId' @ [47:63] ==> public final val MavenProject.mavenId: MavenId[MyPropertyDescriptor]

'selectedModules' @ [48:28] ==> value-parameter selectedModules: List<Module> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[ValueParameterDescriptorImpl]

'mapNotNull' @ [48:44] ==> public inline fun <T, R : Any> Iterable<Module>.mapNotNull(transform: (Module) -> MavenProject?): List<MavenProject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module
    <R : Any> -> MavenProject

'mavenManager' @ [48:57] ==> val mavenManager: (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'findProject' @ [48:70] ==> @Nullable public open fun findProject(@NotNull p0: Module): MavenProject? defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'it' @ [48:82] ==> value-parameter it: Module defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules.<anonymous>[ValueParameterDescriptorImpl]

'selectedProjects' @ [49:23] ==> val selectedProjects: List<MavenProject> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'mapTo' @ [49:40] ==> public inline fun <T, R, C : MutableCollection<in MavenId>> Iterable<MavenProject>.mapTo(destination: HashSet<MavenId>, transform: (MavenProject) -> MavenId): HashSet<MavenId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenProject
    <R> -> MavenId
    <C : MutableCollection<in R>> -> HashSet<MavenId>

'HashSet' @ [49:46] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MavenId

'it' @ [49:59] ==> value-parameter it: MavenProject defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules.<anonymous>[ValueParameterDescriptorImpl]

'mavenId' @ [49:62] ==> public final val MavenProject.mavenId: MavenId[MyPropertyDescriptor]

'HashSet' @ [51:20] ==> public constructor HashSet<E : (Any..Any?)>(p0: Int) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MavenId

'selectedProjects' @ [51:37] ==> val selectedProjects: List<MavenProject> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'size' @ [51:54] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'selectedProjects' @ [52:15] ==> val selectedProjects: List<MavenProject> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'm' @ [53:13] ==> val m: MavenProject defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'mavenId' @ [53:15] ==> public final val MavenProject.mavenId: MavenId[MyPropertyDescriptor]

'excluded' @ [53:27] ==> val excluded: HashSet<MavenId> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'm' @ [54:42] ==> val m: MavenProject defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'current' @ [55:20] ==> var current: MavenProject? defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'current' @ [56:21] ==> var current: MavenProject? defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'mavenId' @ [56:29] ==> public final val MavenProject.mavenId: MavenId[MyPropertyDescriptor]

'excluded' @ [56:40] ==> val excluded: HashSet<MavenId> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'current' @ [56:53] ==> var current: MavenProject? defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'm' @ [56:64] ==> val m: MavenProject defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'current' @ [56:69] ==> var current: MavenProject? defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'mavenId' @ [56:77] ==> public final val MavenProject.mavenId: MavenId[MyPropertyDescriptor]

'selectedIds' @ [56:88] ==> val selectedIds: HashSet<MavenId> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'excluded' @ [57:21] ==> val excluded: HashSet<MavenId> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'add' @ [57:30] ==> public open fun add(element: MavenId): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'm' @ [57:34] ==> val m: MavenProject defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'mavenId' @ [57:36] ==> public final val MavenProject.mavenId: MavenId[MyPropertyDescriptor]

'current' @ [60:17] ==> var current: MavenProject? defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'current' @ [60:27] ==> var current: MavenProject? defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'parentId' @ [60:35] ==> public final val MavenProject.parentId: MavenId?[MyPropertyDescriptor]

'let' @ [60:45] ==> @InlineOnly public inline fun <T, R> MavenId.let(block: (MavenId) -> MavenProject?): MavenProject? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenId
    <R> -> MavenProject?

'projectsById' @ [60:51] ==> val projectsById: Map<MavenId, (MavenProject..MavenProject?)> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'it' @ [60:64] ==> value-parameter it: MavenId defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules.<anonymous>[ValueParameterDescriptorImpl]

'selectedProjects' @ [65:12] ==> val selectedProjects: List<MavenProject> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'filter' @ [65:29] ==> public inline fun <T> Iterable<MavenProject>.filter(predicate: (MavenProject) -> Boolean): List<MavenProject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenProject

'it' @ [65:38] ==> value-parameter it: MavenProject defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules.<anonymous>[ValueParameterDescriptorImpl]

'mavenId' @ [65:41] ==> public final val MavenProject.mavenId: MavenId[MyPropertyDescriptor]

'excluded' @ [65:53] ==> val excluded: HashSet<MavenId> defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'mapNotNull' @ [65:64] ==> public inline fun <T, R : Any> Iterable<MavenProject>.mapNotNull(transform: (MavenProject) -> Module?): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenProject
    <R : Any> -> Module

'mavenManager' @ [65:77] ==> val mavenManager: (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules[LocalVariableDescriptor]

'findModule' @ [65:90] ==> @Nullable public open fun findModule(@NotNull p0: MavenProject): Module? defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'it' @ [65:101] ==> value-parameter it: MavenProject defined in org.jetbrains.kotlin.idea.maven.excludeMavenChildrenModules.<anonymous>[ValueParameterDescriptorImpl]

