'GradleBaseInspection' @ [38:48] ==> public constructor GradleBaseInspection() defined in org.jetbrains.plugins.gradle.codeInspection.GradleBaseInspection[JavaClassConstructorDescriptor]

'MyVisitor' @ [39:58] ==> public constructor MyVisitor(libraryIds: List<String>) defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.MyVisitor[ClassConstructorDescriptorImpl]

'listOf' @ [39:68] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'MAVEN_STDLIB_ID' @ [39:75] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'MAVEN_STDLIB_ID_JRE7' @ [39:92] ==> public val MAVEN_STDLIB_ID_JRE7: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'MAVEN_STDLIB_ID_JRE8' @ [39:114] ==> public val MAVEN_STDLIB_ID_JRE8: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'args' @ [42:32] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.buildErrorString[ValueParameterDescriptorImpl]

'args' @ [42:80] ==> value-parameter vararg args: Any defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.buildErrorString[ValueParameterDescriptorImpl]

'KotlinGradleInspectionVisitor' @ [44:82] ==> public constructor KotlinGradleInspectionVisitor() defined in org.jetbrains.kotlin.idea.inspections.gradle.KotlinGradleInspectionVisitor[ClassConstructorDescriptorImpl]

'super' @ [48:13] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder[LazyClassReceiverParameterDescriptor]

'visitClosure' @ [48:19] ==> public open fun visitClosure(@NotNull p0: GrClosableBlock): Unit defined in org.jetbrains.kotlin.idea.inspections.gradle.KotlinGradleInspectionVisitor[JavaMethodDescriptor]

'closure' @ [48:32] ==> value-parameter closure: GrClosableBlock defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder.visitClosure[ValueParameterDescriptorImpl]

'closure' @ [50:36] ==> value-parameter closure: GrClosableBlock defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder.visitClosure[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [50:44] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): GrMethodCall? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> GrMethodCall

'dependenciesCall' @ [51:17] ==> val dependenciesCall: GrMethodCall defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder.visitClosure[LocalVariableDescriptor]

'invokedExpression' @ [51:34] ==> public final val GrMethodCall.invokedExpression: GrExpression[MyPropertyDescriptor]

'text' @ [51:52] ==> public final val GrExpression.text: (String..String?)[MyPropertyDescriptor]

'dependenciesCall' @ [53:17] ==> val dependenciesCall: GrMethodCall defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder.visitClosure[LocalVariableDescriptor]

'parent' @ [53:34] ==> public final val GrMethodCall.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'findLibraryStatement' @ [55:35] ==> private final fun findLibraryStatement(closure: GrClosableBlock, libraryGroup: String, libraryIds: List<String>): GrCallExpression? defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion[SimpleFunctionDescriptorImpl]

'closure' @ [55:56] ==> value-parameter closure: GrClosableBlock defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder.visitClosure[ValueParameterDescriptorImpl]

'libraryIds' @ [55:89] ==> private final val libraryIds: List<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder[PropertyDescriptorImpl]

'getResolvedKotlinStdlibVersion' @ [56:33] ==> private final fun getResolvedKotlinStdlibVersion(file: PsiFile, libraryIds: List<String>): String? defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion[SimpleFunctionDescriptorImpl]

'closure' @ [56:64] ==> value-parameter closure: GrClosableBlock defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder.visitClosure[ValueParameterDescriptorImpl]

'containingFile' @ [56:72] ==> public final val GrClosableBlock.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'libraryIds' @ [56:88] ==> private final val libraryIds: List<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder[PropertyDescriptorImpl]

'onFound' @ [58:13] ==> protected abstract fun onFound(stdlibVersion: String, stdlibStatement: GrCallExpression): Unit defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder[SimpleFunctionDescriptorImpl]

'stdlibVersion' @ [58:21] ==> val stdlibVersion: String defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder.visitClosure[LocalVariableDescriptor]

'stdlibStatement' @ [58:36] ==> val stdlibStatement: GrCallExpression defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder.visitClosure[LocalVariableDescriptor]

'VersionFinder' @ [62:62] ==> public constructor VersionFinder(libraryIds: List<String>) defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder[ClassConstructorDescriptorImpl]

'libraryIds' @ [62:76] ==> value-parameter libraryIds: List<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.MyVisitor.<init>[ValueParameterDescriptorImpl]

'getResolvedKotlinGradleVersion' @ [64:39] ==> public fun getResolvedKotlinGradleVersion(file: PsiFile): String? defined in org.jetbrains.kotlin.idea.inspections.gradle[SimpleFunctionDescriptorImpl]

'stdlibStatement' @ [64:70] ==> value-parameter stdlibStatement: GrCallExpression defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.MyVisitor.onFound[ValueParameterDescriptorImpl]

'containingFile' @ [64:86] ==> public final val GrCallExpression.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'stdlibVersion' @ [66:17] ==> value-parameter stdlibVersion: String defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.MyVisitor.onFound[ValueParameterDescriptorImpl]

'gradlePluginVersion' @ [66:34] ==> val gradlePluginVersion: String? defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.MyVisitor.onFound[LocalVariableDescriptor]

'registerError' @ [67:17] ==> protected/*protected and package*/ open fun registerError(@NotNull p0: PsiElement, vararg p1: (Any..Any?)): Unit defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.MyVisitor[JavaMethodDescriptor]

'stdlibStatement' @ [67:31] ==> value-parameter stdlibStatement: GrCallExpression defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.MyVisitor.onFound[ValueParameterDescriptorImpl]

'gradlePluginVersion' @ [67:48] ==> val gradlePluginVersion: String? defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.MyVisitor.onFound[LocalVariableDescriptor]

'stdlibVersion' @ [67:69] ==> value-parameter stdlibVersion: String defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.MyVisitor.onFound[ValueParameterDescriptorImpl]

'listOf' @ [73:45] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'LinkedHashSet' @ [76:28] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'VersionFinder' @ [77:36] ==> public constructor VersionFinder(libraryIds: List<String>) defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.VersionFinder[ClassConstructorDescriptorImpl]

'libraryId' @ [77:50] ==> value-parameter libraryId: List<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getKotlinStdlibVersions[ValueParameterDescriptorImpl]

'element' @ [79:21] ==> value-parameter element: GroovyPsiElement defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getKotlinStdlibVersions.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [79:29] ==> public abstract fun acceptChildren(p0: (GroovyElementVisitor..GroovyElementVisitor?)): Unit defined in org.jetbrains.plugins.groovy.lang.psi.GroovyPsiElement[JavaMethodDescriptor]

'this' @ [79:44] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getKotlinStdlibVersions.<no name provided>[LazyClassReceiverParameterDescriptor]

'versions' @ [83:21] ==> val versions: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getKotlinStdlibVersions[LocalVariableDescriptor]

'stdlibVersion' @ [83:33] ==> value-parameter stdlibVersion: String defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getKotlinStdlibVersions.<no name provided>.onFound[ValueParameterDescriptorImpl]

'gradleFile' @ [86:13] ==> value-parameter gradleFile: GroovyFileBase defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getKotlinStdlibVersions[ValueParameterDescriptorImpl]

'accept' @ [86:24] ==> public abstract fun accept(p0: (GroovyElementVisitor..GroovyElementVisitor?)): Unit defined in org.jetbrains.plugins.groovy.lang.psi.GroovyFileBase[JavaMethodDescriptor]

'visitor' @ [86:31] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getKotlinStdlibVersions[LocalVariableDescriptor]

'versions' @ [87:20] ==> val versions: LinkedHashSet<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getKotlinStdlibVersions[LocalVariableDescriptor]

'closure' @ [91:41] ==> value-parameter closure: GrClosableBlock defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement[ValueParameterDescriptorImpl]

'getChildrenOfType' @ [91:49] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<GrCallExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> GrCallExpression

'applicationStatements' @ [93:31] ==> val applicationStatements: Array<GrCallExpression> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement[LocalVariableDescriptor]

'statement' @ [94:39] ==> val statement: GrCallExpression defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement[LocalVariableDescriptor]

'getChildrenOfType' @ [94:49] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<GrReferenceExpression> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> GrReferenceExpression

'firstOrNull' @ [94:92] ==> public fun <T> Array<out GrReferenceExpression>.firstOrNull(): GrReferenceExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GrReferenceExpression

'startExpression' @ [95:21] ==> val startExpression: GrReferenceExpression defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement[LocalVariableDescriptor]

'text' @ [95:37] ==> public final val GrReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'COMPILE_DEPENDENCY_STATEMENTS' @ [95:45] ==> public final val COMPILE_DEPENDENCY_STATEMENTS: List<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion[PropertyDescriptorImpl]

'libraryIds' @ [96:25] ==> value-parameter libraryIds: List<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement[ValueParameterDescriptorImpl]

'any' @ [96:36] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [96:42] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement.<anonymous>[ValueParameterDescriptorImpl]

'statement' @ [96:48] ==> val statement: GrCallExpression defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement[LocalVariableDescriptor]

'text' @ [96:58] ==> public final val GrCallExpression.text: (String..String?)[MyPropertyDescriptor]

'statement' @ [96:68] ==> val statement: GrCallExpression defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement[LocalVariableDescriptor]

'text' @ [96:78] ==> public final val GrCallExpression.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [96:83] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'libraryGroup' @ [96:92] ==> value-parameter libraryGroup: String defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement[ValueParameterDescriptorImpl]

'statement' @ [97:32] ==> val statement: GrCallExpression defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.findLibraryStatement[LocalVariableDescriptor]

'findGradleProjectStructure' @ [106:40] ==> public fun findGradleProjectStructure(file: PsiFile): DataNode<ProjectData>? defined in org.jetbrains.kotlin.idea.inspections.gradle[SimpleFunctionDescriptorImpl]

'file' @ [106:67] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getResolvedKotlinStdlibVersion[ValueParameterDescriptorImpl]

'?:' @ [107:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'getInstance' @ [107:45] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'file' @ [107:57] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getResolvedKotlinStdlibVersion[ValueParameterDescriptorImpl]

'project' @ [107:62] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'fileIndex' @ [107:71] ==> public final val ProjectRootManager.fileIndex: ProjectFileIndex[MyPropertyDescriptor]

'getModuleForFile' @ [107:81] ==> @Nullable public abstract fun getModuleForFile(@NotNull p0: VirtualFile): Module? defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [107:98] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getResolvedKotlinStdlibVersion[ValueParameterDescriptorImpl]

'virtualFile' @ [107:103] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'projectStructureNode' @ [109:32] ==> val projectStructureNode: DataNode<ProjectData> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getResolvedKotlinStdlibVersion[LocalVariableDescriptor]

'findAll' @ [109:53] ==> public fun <T : Any> DataNode<*>.findAll(key: Key<(ModuleData..ModuleData?)>): List<NodeWithData<(ModuleData..ModuleData?)>> defined in org.jetbrains.kotlin.idea.inspections.gradle[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (com.intellij.openapi.externalSystem.model.project.ModuleData..com.intellij.openapi.externalSystem.model.project.ModuleData?)

'MODULE' @ [109:73] ==> @NotNull public final val MODULE: Key<(ModuleData..ModuleData?)> defined in com.intellij.openapi.externalSystem.model.ProjectKeys[JavaPropertyDescriptor]

'filter' @ [109:81] ==> public inline fun <T> Iterable<NodeWithData<(ModuleData..ModuleData?)>>.filter(predicate: (NodeWithData<(ModuleData..ModuleData?)>) -> Boolean): List<NodeWithData<(ModuleData..ModuleData?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeWithData<(com.intellij.openapi.externalSystem.model.project.ModuleData..com.intellij.openapi.externalSystem.model.project.ModuleData?)>

'it' @ [109:90] ==> value-parameter it: NodeWithData<(ModuleData..ModuleData?)> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getResolvedKotlinStdlibVersion.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [109:93] ==> public final val data: (ModuleData..ModuleData?) defined in org.jetbrains.kotlin.idea.inspections.gradle.NodeWithData[PropertyDescriptorImpl]

'internalName' @ [109:98] ==> public final var ModuleData.internalName: String[MyPropertyDescriptor]

'module' @ [109:114] ==> val module: Module defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getResolvedKotlinStdlibVersion[LocalVariableDescriptor]

'name' @ [109:121] ==> public final val Module.name: String[MyPropertyDescriptor]

'moduleData' @ [110:17] ==> val moduleData: NodeWithData<(ModuleData..ModuleData?)> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getResolvedKotlinStdlibVersion[LocalVariableDescriptor]

'node' @ [110:28] ==> public final val node: DataNode<*> defined in org.jetbrains.kotlin.idea.inspections.gradle.NodeWithData[PropertyDescriptorImpl]

'getResolvedKotlinStdlibVersionByModuleData' @ [110:33] ==> internal fun DataNode<*>.getResolvedKotlinStdlibVersionByModuleData(libraryIds: List<String>): String? defined in org.jetbrains.kotlin.idea.inspections.gradle[SimpleFunctionDescriptorImpl]

'libraryIds' @ [110:76] ==> value-parameter libraryIds: List<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getResolvedKotlinStdlibVersion[ValueParameterDescriptorImpl]

'let' @ [110:89] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Nothing

'it' @ [110:102] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.inspections.gradle.DifferentStdlibGradleVersionInspection.Companion.getResolvedKotlinStdlibVersion.<anonymous>[ValueParameterDescriptorImpl]

'KotlinPlatformGradleDetector' @ [119:12] ==> public companion object defined in org.jetbrains.kotlin.idea.inspections.gradle.KotlinPlatformGradleDetector[FakeCallableDescriptorForObject]

'EP_NAME' @ [119:41] ==> public final val EP_NAME: ExtensionPointName<KotlinPlatformGradleDetector> defined in org.jetbrains.kotlin.idea.inspections.gradle.KotlinPlatformGradleDetector.Companion[PropertyDescriptorImpl]

'extensions' @ [119:49] ==> public final val <T : (Any..Any?)> ExtensionPointName<KotlinPlatformGradleDetector>.extensions: (Array<(KotlinPlatformGradleDetector..KotlinPlatformGradleDetector?)>..Array<out (KotlinPlatformGradleDetector..KotlinPlatformGradleDetector?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinPlatformGradleDetector

'asSequence' @ [119:60] ==> public fun <T> Array<out (KotlinPlatformGradleDetector..KotlinPlatformGradleDetector?)>.asSequence(): Sequence<(KotlinPlatformGradleDetector..KotlinPlatformGradleDetector?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.inspections.gradle.KotlinPlatformGradleDetector..org.jetbrains.kotlin.idea.inspections.gradle.KotlinPlatformGradleDetector?)

'mapNotNull' @ [120:14] ==> public fun <T, R : Any> Sequence<(KotlinPlatformGradleDetector..KotlinPlatformGradleDetector?)>.mapNotNull(transform: ((KotlinPlatformGradleDetector..KotlinPlatformGradleDetector?)) -> String?): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.idea.inspections.gradle.KotlinPlatformGradleDetector..org.jetbrains.kotlin.idea.inspections.gradle.KotlinPlatformGradleDetector?)
    <R : Any> -> String

'it' @ [120:27] ==> value-parameter it: (KotlinPlatformGradleDetector..KotlinPlatformGradleDetector?) defined in org.jetbrains.kotlin.idea.inspections.gradle.getResolvedKotlinStdlibVersionByModuleData.<anonymous>[ValueParameterDescriptorImpl]

'getResolvedKotlinStdlibVersionByModuleData' @ [120:30] ==> public abstract fun getResolvedKotlinStdlibVersionByModuleData(moduleData: DataNode<*>, libraryIds: List<String>): String? defined in org.jetbrains.kotlin.idea.inspections.gradle.KotlinPlatformGradleDetector[SimpleFunctionDescriptorImpl]

'this' @ [120:73] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.gradle.getResolvedKotlinStdlibVersionByModuleData[ReceiverParameterDescriptorImpl]

'libraryIds' @ [120:79] ==> value-parameter libraryIds: List<String> defined in org.jetbrains.kotlin.idea.inspections.gradle.getResolvedKotlinStdlibVersionByModuleData[ValueParameterDescriptorImpl]

'firstOrNull' @ [121:14] ==> public fun <T> Sequence<String>.firstOrNull(): String? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

