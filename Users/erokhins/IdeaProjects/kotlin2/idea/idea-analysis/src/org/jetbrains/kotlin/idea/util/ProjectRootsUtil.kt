'listOf' @ [37:30] ==> public fun <T> listOf(vararg elements: (FileType..FileType?)): List<(FileType..FileType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.fileTypes.FileType..com.intellij.openapi.fileTypes.FileType?)

'INSTANCE' @ [37:55] ==> public final val INSTANCE: (JavaClassFileType..JavaClassFileType?) defined in com.intellij.ide.highlighter.JavaClassFileType[JavaPropertyDescriptor]

'KotlinBuiltInFileType' @ [37:65] ==> public object KotlinBuiltInFileType : FileType defined in org.jetbrains.kotlin.idea.decompiler.builtIns in file KotlinBuiltInFileType.kt[FakeCallableDescriptorForObject]

'INSTANCE' @ [37:109] ==> public final val INSTANCE: (KotlinModuleFileType..KotlinModuleFileType?) defined in org.jetbrains.kotlin.idea.KotlinModuleFileType[JavaPropertyDescriptor]

'fileType' @ [39:45] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'kotlinBinaries' @ [39:57] ==> private val kotlinBinaries: List<(FileType..FileType?)> defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[PropertyDescriptorImpl]

'file' @ [42:12] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.isInSourceContentWithoutInjected[ValueParameterDescriptorImpl]

'isInSourceContent' @ [42:42] ==> public abstract fun isInSourceContent(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.FileIndex[JavaMethodDescriptor]

'file' @ [42:60] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.isInSourceContentWithoutInjected[ValueParameterDescriptorImpl]

'getInstance' @ [45:84] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [45:96] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.util.getSourceRoot[ValueParameterDescriptorImpl]

'fileIndex' @ [45:105] ==> public final val ProjectRootManager.fileIndex: ProjectFileIndex[MyPropertyDescriptor]

'getSourceRootForFile' @ [45:115] ==> @Nullable public abstract fun getSourceRootForFile(@NotNull p0: VirtualFile): VirtualFile? defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'this' @ [45:136] ==> <this> defined in org.jetbrains.kotlin.idea.util.getSourceRoot[ReceiverParameterDescriptorImpl]

'virtualFile' @ [48:13] ==> public final val PsiFileSystemItem.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'getSourceRoot' @ [48:26] ==> public fun VirtualFile.getSourceRoot(project: Project): VirtualFile? defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [48:40] ==> public final val PsiFileSystemItem.project: Project[MyPropertyDescriptor]

'JvmStatic' @ [51:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getInstance' @ [54:87] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectFileIndex..ProjectFileIndex?) defined in com.intellij.openapi.roots.ProjectFileIndex.SERVICE[JavaMethodDescriptor]

'project' @ [54:99] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'includeProjectSource' @ [57:13] ==> value-parameter includeProjectSource: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'fileIndex' @ [57:37] ==> value-parameter fileIndex: ProjectFileIndex = ... defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isInSourceContentWithoutInjected' @ [57:47] ==> public fun FileIndex.isInSourceContentWithoutInjected(file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[SimpleFunctionDescriptorImpl]

'file' @ [57:80] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'!' @ [59:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'includeLibraryClasses' @ [59:14] ==> value-parameter includeLibraryClasses: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'!' @ [59:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'includeLibrarySource' @ [59:40] ==> value-parameter includeLibrarySource: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'file' @ [62:36] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'fileType' @ [62:41] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [62:69] ==> public final val INSTANCE: (ArchiveFileType..ArchiveFileType?) defined in com.intellij.ide.highlighter.ArchiveFileType[JavaPropertyDescriptor]

'file' @ [62:81] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isDirectory' @ [62:86] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'file' @ [63:24] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isKotlinBinary' @ [63:29] ==> public fun VirtualFile.isKotlinBinary(): Boolean defined in org.jetbrains.kotlin.idea.util in file ProjectRootsUtil.kt[SimpleFunctionDescriptorImpl]

'if (includeScriptDependencies) ScriptDependenciesManager.getInstance(project) else null' @ [65:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScriptDependenciesManager?, elseBranch: ScriptDependenciesManager?): ScriptDependenciesManager?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScriptDependenciesManager?

'includeScriptDependencies' @ [65:46] ==> value-parameter includeScriptDependencies: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'getInstance' @ [65:99] ==> @JvmStatic public final fun getInstance(project: Project): ScriptDependenciesManager defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager.Companion[SimpleFunctionDescriptorImpl]

'project' @ [65:111] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'includeLibraryClasses' @ [67:13] ==> value-parameter includeLibraryClasses: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isBinary' @ [67:39] ==> val isBinary: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[LocalVariableDescriptor]

'canContainClassFiles' @ [67:51] ==> val canContainClassFiles: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[LocalVariableDescriptor]

'fileIndex' @ [68:17] ==> value-parameter fileIndex: ProjectFileIndex = ... defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isInLibraryClasses' @ [68:27] ==> public abstract fun isInLibraryClasses(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [68:46] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'scriptConfigurationManager' @ [69:17] ==> val scriptConfigurationManager: ScriptDependenciesManager? defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[LocalVariableDescriptor]

'getAllScriptsClasspathScope' @ [69:45] ==> public final fun getAllScriptsClasspathScope(): NonClasspathDirectoriesScope defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'contains' @ [69:76] ==> public open fun contains(@NotNull p0: VirtualFile): Boolean defined in com.intellij.psi.search.NonClasspathDirectoriesScope[JavaMethodDescriptor]

'file' @ [69:85] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'includeLibrarySource' @ [71:13] ==> value-parameter includeLibrarySource: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'!' @ [71:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isBinary' @ [71:38] ==> val isBinary: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[LocalVariableDescriptor]

'fileIndex' @ [72:17] ==> value-parameter fileIndex: ProjectFileIndex = ... defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isInLibrarySource' @ [72:27] ==> public abstract fun isInLibrarySource(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [72:45] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'scriptConfigurationManager' @ [73:17] ==> val scriptConfigurationManager: ScriptDependenciesManager? defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[LocalVariableDescriptor]

'getAllLibrarySourcesScope' @ [73:45] ==> public final fun getAllLibrarySourcesScope(): NonClasspathDirectoriesScope defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesManager[SimpleFunctionDescriptorImpl]

'contains' @ [73:74] ==> public open fun contains(@NotNull p0: VirtualFile): Boolean defined in com.intellij.psi.search.NonClasspathDirectoriesScope[JavaMethodDescriptor]

'file' @ [73:83] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'includeLibraryClasses' @ [76:14] ==> value-parameter includeLibraryClasses: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'fileIndex' @ [76:39] ==> value-parameter fileIndex: ProjectFileIndex = ... defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isInLibraryClasses' @ [76:49] ==> public abstract fun isInLibraryClasses(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [76:68] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'includeLibrarySource' @ [77:14] ==> value-parameter includeLibrarySource: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'fileIndex' @ [77:38] ==> value-parameter fileIndex: ProjectFileIndex = ... defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isInLibrarySource' @ [77:48] ==> public abstract fun isInLibrarySource(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'file' @ [77:66] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isJsProjectRef' @ [80:31] ==> value-parameter isJsProjectRef: Ref<Boolean?>? = ... defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'get' @ [80:47] ==> public final fun get(): Boolean? defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'isJsProject' @ [80:74] ==> @JvmStatic public final fun isJsProject(project: Project): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.JsProjectDetector[SimpleFunctionDescriptorImpl]

'project' @ [80:86] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'isJsProjectRef' @ [81:13] ==> value-parameter isJsProjectRef: Ref<Boolean?>? = ... defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'set' @ [81:29] ==> public final fun set(@Nullable p0: Boolean?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'isJsProject' @ [81:33] ==> val isJsProject: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[LocalVariableDescriptor]

'isJsProject' @ [82:20] ==> val isJsProject: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[LocalVariableDescriptor]

'JvmStatic' @ [88:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'runReadAction' @ [95:16] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Boolean

'when (element) {
                                  is PsiDirectory -> element.virtualFile
                                  else -> element.containingFile?.virtualFile
                              }' @ [96:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VirtualFile?, entry1: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VirtualFile?

'element' @ [96:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'element' @ [97:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'virtualFile' @ [97:62] ==> public final val PsiDirectory.virtualFile: VirtualFile[MyPropertyDescriptor]

'element' @ [98:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'containingFile' @ [98:51] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [98:67] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'element' @ [101:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'project' @ [101:35] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'isInContent' @ [102:34] ==> @JvmStatic public final fun isInContent(project: Project, file: VirtualFile, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean, fileIndex: ProjectFileIndex = ..., isJsProjectRef: Ref<Boolean?>? = ...): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'project' @ [102:46] ==> val project: Project defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent.<anonymous>[LocalVariableDescriptor]

'virtualFile' @ [102:55] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent.<anonymous>[LocalVariableDescriptor]

'includeProjectSource' @ [102:68] ==> value-parameter includeProjectSource: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'includeLibrarySource' @ [102:90] ==> value-parameter includeLibrarySource: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'includeLibraryClasses' @ [102:112] ==> value-parameter includeLibraryClasses: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'includeScriptDependencies' @ [102:135] ==> value-parameter includeScriptDependencies: Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInContent[ValueParameterDescriptorImpl]

'JvmStatic' @ [106:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'isInContent' @ [107:16] ==> @JvmStatic public final fun isInContent(element: PsiElement, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'element' @ [107:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInProjectSource[ValueParameterDescriptorImpl]

'JvmStatic' @ [110:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'isInContent' @ [111:16] ==> @JvmStatic public final fun isInContent(project: Project, file: VirtualFile, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean, fileIndex: ProjectFileIndex = ..., isJsProjectRef: Ref<Boolean?>? = ...): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'project' @ [111:28] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isProjectSourceFile[ValueParameterDescriptorImpl]

'file' @ [111:37] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isProjectSourceFile[ValueParameterDescriptorImpl]

'JvmStatic' @ [114:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'isInContent' @ [115:16] ==> @JvmStatic public final fun isInContent(element: PsiElement, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'element' @ [115:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInProjectOrLibSource[ValueParameterDescriptorImpl]

'JvmStatic' @ [118:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'isInContent' @ [119:16] ==> @JvmStatic public final fun isInContent(element: PsiElement, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'element' @ [119:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInProjectOrLibraryContent[ValueParameterDescriptorImpl]

'JvmStatic' @ [122:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'isInContent' @ [123:16] ==> @JvmStatic public final fun isInContent(element: PsiElement, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'element' @ [123:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isInProjectOrLibraryClassFile[ValueParameterDescriptorImpl]

'JvmStatic' @ [126:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'isInContent' @ [127:16] ==> @JvmStatic public final fun isInContent(project: Project, file: VirtualFile, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean, fileIndex: ProjectFileIndex = ..., isJsProjectRef: Ref<Boolean?>? = ...): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'project' @ [127:28] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isLibraryClassFile[ValueParameterDescriptorImpl]

'file' @ [127:37] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isLibraryClassFile[ValueParameterDescriptorImpl]

'JvmStatic' @ [130:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'isInContent' @ [131:16] ==> @JvmStatic public final fun isInContent(project: Project, file: VirtualFile, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean, fileIndex: ProjectFileIndex = ..., isJsProjectRef: Ref<Boolean?>? = ...): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'project' @ [131:28] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isLibrarySourceFile[ValueParameterDescriptorImpl]

'file' @ [131:37] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isLibrarySourceFile[ValueParameterDescriptorImpl]

'JvmStatic' @ [134:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'isInContent' @ [135:16] ==> @JvmStatic public final fun isInContent(project: Project, file: VirtualFile, includeProjectSource: Boolean, includeLibrarySource: Boolean, includeLibraryClasses: Boolean, includeScriptDependencies: Boolean, fileIndex: ProjectFileIndex = ..., isJsProjectRef: Ref<Boolean?>? = ...): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[SimpleFunctionDescriptorImpl]

'project' @ [135:28] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isLibraryFile[ValueParameterDescriptorImpl]

'file' @ [135:37] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil.isLibraryFile[ValueParameterDescriptorImpl]

