'CustomLibraryDescription' @ [60:5] ==> public constructor CustomLibraryDescription() defined in com.intellij.openapi.roots.ui.configuration.libraries.CustomLibraryDescription[JavaClassConstructorDescriptor]

'project' @ [61:48] ==> public final val project: Project? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'baseDir' @ [61:57] ==> public final val Project.baseDir: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'suitableLibraryKinds' @ [67:16] ==> private final val suitableLibraryKinds: Set<LibraryKind> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'rootModel' @ [71:23] ==> value-parameter rootModel: ModifiableRootModel defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[ValueParameterDescriptorImpl]

'orderEntries' @ [71:33] ==> @NotNull public abstract fun orderEntries(): OrderEnumerator defined in com.intellij.openapi.roots.ModifiableRootModel[JavaMethodDescriptor]

'findLibrary' @ [71:48] ==> public fun OrderEnumerator.findLibrary(predicate: (Library) -> Boolean): Library? defined in org.jetbrains.kotlin.idea.util.projectStructure in file projectStructureUtil.kt[SimpleFunctionDescriptorImpl]

'getInstance' @ [72:73] ==> public open fun getInstance(): (LibraryPresentationManager..LibraryPresentationManager?) defined in com.intellij.openapi.roots.ui.configuration.libraries.LibraryPresentationManager[JavaMethodDescriptor]

'library' @ [73:30] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration.<anonymous>[ValueParameterDescriptorImpl]

'getFiles' @ [73:38] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'CLASSES' @ [73:61] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'toList' @ [73:70] ==> public fun <T> Array<out (VirtualFile..VirtualFile?)>.toList(): List<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'libraryPresentationManager' @ [75:13] ==> val libraryPresentationManager: (LibraryPresentationManager..LibraryPresentationManager?) defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration.<anonymous>[LocalVariableDescriptor]

'isLibraryOfKind' @ [75:40] ==> public abstract fun isLibraryOfKind(@NotNull p0: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>), @NotNull p1: LibraryKind): Boolean defined in com.intellij.openapi.roots.ui.configuration.libraries.LibraryPresentationManager[JavaMethodDescriptor]

'classFiles' @ [75:56] ==> val classFiles: List<(VirtualFile..VirtualFile?)> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration.<anonymous>[LocalVariableDescriptor]

'libraryKind' @ [75:68] ==> private final val libraryKind: LibraryKind defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'library' @ [78:21] ==> val library: Library defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'modifiableModel' @ [78:29] ==> public final val Library.modifiableModel: Library.ModifiableModel[MyPropertyDescriptor]

'createConfigureKotlinNotificationCollector' @ [80:29] ==> public fun createConfigureKotlinNotificationCollector(project: Project): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration in file NotificationMessageCollector.kt[SimpleFunctionDescriptorImpl]

'module' @ [80:72] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[ValueParameterDescriptorImpl]

'project' @ [80:79] ==> public final val Module.project: Project[MyPropertyDescriptor]

'copyFileRequests' @ [81:13] ==> public final var copyFileRequests: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'performRequests' @ [81:31] ==> public final fun performRequests(relativePath: String, model: Library.ModifiableModel, collector: NotificationMessageCollector): Unit defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests[SimpleFunctionDescriptorImpl]

'module' @ [81:47] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[ValueParameterDescriptorImpl]

'getModuleDir' @ [81:54] ==> public fun Module.getModuleDir(): String defined in org.jetbrains.kotlin.idea.util.projectStructure in file projectStructureUtil.kt[SimpleFunctionDescriptorImpl]

'model' @ [81:70] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'collector' @ [81:77] ==> val collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'KotlinWithLibraryConfigurator' @ [83:30] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[FakeCallableDescriptorForObject]

'getPathFromLibraryUrls' @ [83:60] ==> public final fun getPathFromLibraryUrls(libraryFiles: Array<String>): String? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.Companion[SimpleFunctionDescriptorImpl]

'model' @ [83:83] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'getUrls' @ [83:89] ==> @NotNull public abstract fun getUrls(@NotNull p0: OrderRootType): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'CLASSES' @ [83:111] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'copyToPath' @ [84:17] ==> val copyToPath: String? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'if (copyFileRequests?.isEmpty() != false) DO_NOT_COPY else COPY' @ [85:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinWithLibraryConfigurator.FileState, elseBranch: KotlinWithLibraryConfigurator.FileState): KotlinWithLibraryConfigurator.FileState[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FileState

'copyFileRequests' @ [85:36] ==> public final var copyFileRequests: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'isEmpty' @ [85:54] ==> public final fun isEmpty(): Boolean defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests[SimpleFunctionDescriptorImpl]

'DO_NOT_COPY' @ [85:74] ==> enum entry DO_NOT_COPY defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.FileState[FakeCallableDescriptorForObject]

'COPY' @ [85:91] ==> enum entry COPY defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator.FileState[FakeCallableDescriptorForObject]

'configurator' @ [88:42] ==> private final val configurator: KotlinWithLibraryConfigurator defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'getLibraryJarDescriptors' @ [88:55] ==> public abstract fun getLibraryJarDescriptors(sdk: Sdk?): List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'rootModel' @ [88:80] ==> value-parameter rootModel: ModifiableRootModel defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[ValueParameterDescriptorImpl]

'sdk' @ [88:90] ==> public final var ModifiableRootModel.sdk: Sdk?[MyPropertyDescriptor]

'descriptorsWithSdk' @ [89:39] ==> val descriptorsWithSdk: List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'model' @ [90:25] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'getFiles' @ [90:31] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'jarDescriptor' @ [90:40] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'orderRootType' @ [90:54] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'any' @ [90:69] ==> public inline fun <T> Array<out (VirtualFile..VirtualFile?)>.any(predicate: ((VirtualFile..VirtualFile?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'it' @ [90:75] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [90:78] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'jarDescriptor' @ [90:86] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'jarName' @ [90:100] ==> public final val jarName: String defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'configurator' @ [93:21] ==> private final val configurator: KotlinWithLibraryConfigurator defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'configureLibraryJar' @ [93:34] ==> public final fun configureLibraryJar(library: Library.ModifiableModel, jarState: KotlinWithLibraryConfigurator.FileState, dirToCopyJarTo: String, libraryJarDescriptor: LibraryJarDescriptor, collector: NotificationMessageCollector): Unit defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'model' @ [93:54] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'jarState' @ [93:61] ==> val jarState: KotlinWithLibraryConfigurator.FileState defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'copyToPath' @ [93:71] ==> val copyToPath: String? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'jarDescriptor' @ [93:83] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'collector' @ [93:98] ==> val collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'configureKotlinSettings' @ [97:13] ==> protected open fun configureKotlinSettings(project: Project, sdk: Sdk?): Unit defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[SimpleFunctionDescriptorImpl]

'module' @ [97:37] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[ValueParameterDescriptorImpl]

'project' @ [97:44] ==> public final val Module.project: Project[MyPropertyDescriptor]

'rootModel' @ [97:53] ==> value-parameter rootModel: ModifiableRootModel defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[ValueParameterDescriptorImpl]

'sdk' @ [97:63] ==> public final var ModifiableRootModel.sdk: Sdk?[MyPropertyDescriptor]

'collector' @ [99:13] ==> val collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'showNotification' @ [99:23] ==> public final fun showNotification(): Unit defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'model' @ [102:13] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.finishLibConfiguration[LocalVariableDescriptor]

'commit' @ [102:19] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'arrayListOf' @ [110:41] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest> /* = ArrayList<CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CopyFileRequest

'copyFilesRequests' @ [112:25] ==> private final val copyFilesRequests: ArrayList<CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest> /* = ArrayList<CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest> */ defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests[PropertyDescriptorImpl]

'isEmpty' @ [112:43] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'copyFilesRequests' @ [115:29] ==> private final val copyFilesRequests: ArrayList<CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest> /* = ArrayList<CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest> */ defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests[PropertyDescriptorImpl]

'if (FileUtil.isAbsolute(request.toDir))
                    request.toDir
                else
                    File(relativePath, request.toDir).path' @ [116:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'isAbsolute' @ [116:52] ==> public open fun isAbsolute(@NotNull p0: String): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'request' @ [116:63] ==> val request: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[LocalVariableDescriptor]

'toDir' @ [116:71] ==> public final val toDir: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest[PropertyDescriptorImpl]

'request' @ [117:21] ==> val request: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[LocalVariableDescriptor]

'toDir' @ [117:29] ==> public final val toDir: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest[PropertyDescriptorImpl]

'File' @ [119:21] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'relativePath' @ [119:26] ==> value-parameter relativePath: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[ValueParameterDescriptorImpl]

'request' @ [119:40] ==> val request: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[LocalVariableDescriptor]

'toDir' @ [119:48] ==> public final val toDir: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest[PropertyDescriptorImpl]

'path' @ [119:55] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'configurator' @ [121:34] ==> private final val configurator: KotlinWithLibraryConfigurator defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests[PropertyDescriptorImpl]

'copyFileToDir' @ [121:47] ==> @Contract public final fun copyFileToDir(file: File?, toDir: String, collector: NotificationMessageCollector): File? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'request' @ [121:61] ==> val request: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[LocalVariableDescriptor]

'file' @ [121:69] ==> public final val file: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest[PropertyDescriptorImpl]

'destinationPath' @ [121:75] ==> val destinationPath: (String..String?) defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[LocalVariableDescriptor]

'collector' @ [121:92] ==> value-parameter collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[ValueParameterDescriptorImpl]

'request' @ [123:21] ==> val request: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[LocalVariableDescriptor]

'replaceInLib' @ [123:29] ==> public final val replaceInLib: Boolean defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest[PropertyDescriptorImpl]

'resultFile' @ [123:45] ==> val resultFile: File? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[LocalVariableDescriptor]

'model' @ [124:21] ==> value-parameter model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[ValueParameterDescriptorImpl]

'replaceFileRoot' @ [124:27] ==> public fun Library.ModifiableModel.replaceFileRoot(oldFile: File, newFile: File): Unit defined in org.jetbrains.kotlin.idea.util.projectStructure in file projectStructureUtil.kt[SimpleFunctionDescriptorImpl]

'request' @ [124:43] ==> val request: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[LocalVariableDescriptor]

'file' @ [124:51] ==> public final val file: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest[PropertyDescriptorImpl]

'resultFile' @ [124:57] ==> val resultFile: File? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.performRequests[LocalVariableDescriptor]

'copyFilesRequests' @ [130:13] ==> private final val copyFilesRequests: ArrayList<CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest> /* = ArrayList<CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest> */ defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests[PropertyDescriptorImpl]

'add' @ [130:31] ==> public open fun add(element: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'CopyFileRequest' @ [130:35] ==> public constructor CopyFileRequest(toDir: String, file: File, replaceInLib: Boolean) defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.CopyFileRequest[ClassConstructorDescriptorImpl]

'copyIntoPath' @ [130:51] ==> value-parameter copyIntoPath: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.addCopyWithReplaceRequest[ValueParameterDescriptorImpl]

'file' @ [130:65] ==> value-parameter file: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests.addCopyWithReplaceRequest[ValueParameterDescriptorImpl]

'configurator' @ [137:28] ==> private final val configurator: KotlinWithLibraryConfigurator defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'copyFileRequests' @ [139:9] ==> public final var copyFileRequests: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'DeferredCopyFileRequests' @ [139:28] ==> public constructor DeferredCopyFileRequests(configurator: KotlinWithLibraryConfigurator) defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests[ClassConstructorDescriptorImpl]

'configurator' @ [139:53] ==> val configurator: KotlinWithLibraryConfigurator defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'if (projectBaseDir == null)
            DEFAULT_LIB_DIR_NAME
        else
            FileUIUtils.createRelativePath(null, projectBaseDir, DEFAULT_LIB_DIR_NAME)' @ [141:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'projectBaseDir' @ [141:40] ==> private final val projectBaseDir: VirtualFile? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'DEFAULT_LIB_DIR_NAME' @ [142:13] ==> private final val DEFAULT_LIB_DIR_NAME: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.Companion[PropertyDescriptorImpl]

'createRelativePath' @ [144:25] ==> @NotNull public open fun createRelativePath(@Nullable project: Project?, @Nullable contextDirectory: VirtualFile?, relativePath: (String..String?)): String defined in org.jetbrains.kotlin.idea.framework.ui.FileUIUtils[JavaMethodDescriptor]

'projectBaseDir' @ [144:50] ==> private final val projectBaseDir: VirtualFile? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'DEFAULT_LIB_DIR_NAME' @ [144:66] ==> private final val DEFAULT_LIB_DIR_NAME: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.Companion[PropertyDescriptorImpl]

'configurator' @ [146:30] ==> val configurator: KotlinWithLibraryConfigurator defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'getLibraryJarDescriptors' @ [146:43] ==> public abstract fun getLibraryJarDescriptors(sdk: Sdk?): List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'File' @ [148:35] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'defaultPathToJarFile' @ [148:40] ==> val defaultPathToJarFile: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'jarDescriptors' @ [148:62] ==> val jarDescriptors: List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'first' @ [148:77] ==> public fun <T> List<LibraryJarDescriptor>.first(): LibraryJarDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibraryJarDescriptor

'jarName' @ [148:85] ==> public final val jarName: String defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'mutableListOf' @ [149:28] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'mutableListOf' @ [150:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'if (projectBaseDir != null && stdJarInDefaultPath.exists()) {
            libraryFiles.add(stdJarInDefaultPath)
            for (jarDescriptor in jarDescriptors) {
                var destination = File(defaultPathToJarFile, jarDescriptor.jarName)
                if (!destination.exists()) {
                    copyFileRequests!!.addCopyWithReplaceRequest(jarDescriptor.getPathInPlugin(), defaultPathToJarFile)
                    destination = jarDescriptor.getPathInPlugin()
                }
                if (jarDescriptor.orderRootType == OrderRootType.SOURCES) {
                    librarySourceFiles.add(destination)
                }
                else {
                    libraryFiles.add(destination)
                }
            }
        }
        else {
            val dialog = CreateLibraryDialog(defaultPathToJarFile, dialogTitle, modulesSeparatorCaption)
            dialog.show()

            if (!dialog.isOK) return null

            val copyIntoPath = dialog.copyIntoPath
            if (copyIntoPath != null) {
                for (libraryJarDescriptor in configurator.getLibraryJarDescriptors(null)) {
                    copyFileRequests!!.addCopyWithReplaceRequest(libraryJarDescriptor.getPathInPlugin(), copyIntoPath)
                }
            }

            for (jarDescriptor in jarDescriptors) {
                if (jarDescriptor.orderRootType == OrderRootType.SOURCES) {
                    librarySourceFiles.add(jarDescriptor.getPathInPlugin())
                }
                else {
                    libraryFiles.add(jarDescriptor.getPathInPlugin())
                }
            }
        }' @ [151:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'projectBaseDir' @ [151:13] ==> private final val projectBaseDir: VirtualFile? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'stdJarInDefaultPath' @ [151:39] ==> val stdJarInDefaultPath: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'exists' @ [151:59] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'libraryFiles' @ [152:13] ==> val libraryFiles: MutableList<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'add' @ [152:26] ==> public abstract fun add(element: File): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'stdJarInDefaultPath' @ [152:30] ==> val stdJarInDefaultPath: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'jarDescriptors' @ [153:35] ==> val jarDescriptors: List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'File' @ [154:35] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'defaultPathToJarFile' @ [154:40] ==> val defaultPathToJarFile: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'jarDescriptor' @ [154:62] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'jarName' @ [154:76] ==> public final val jarName: String defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'!' @ [155:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'destination' @ [155:22] ==> var destination: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'exists' @ [155:34] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'copyFileRequests' @ [156:21] ==> public final var copyFileRequests: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'addCopyWithReplaceRequest' @ [156:40] ==> public final fun addCopyWithReplaceRequest(file: File, copyIntoPath: String): Unit defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests[SimpleFunctionDescriptorImpl]

'jarDescriptor' @ [156:66] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'getPathInPlugin' @ [156:80] ==> public final fun getPathInPlugin(): File defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'defaultPathToJarFile' @ [156:99] ==> val defaultPathToJarFile: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'destination' @ [157:21] ==> var destination: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'jarDescriptor' @ [157:35] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'getPathInPlugin' @ [157:49] ==> public final fun getPathInPlugin(): File defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'if (jarDescriptor.orderRootType == OrderRootType.SOURCES) {
                    librarySourceFiles.add(destination)
                }
                else {
                    libraryFiles.add(destination)
                }' @ [159:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'jarDescriptor' @ [159:21] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'orderRootType' @ [159:35] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'SOURCES' @ [159:66] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'librarySourceFiles' @ [160:21] ==> val librarySourceFiles: MutableList<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'add' @ [160:40] ==> public abstract fun add(element: File): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'destination' @ [160:44] ==> var destination: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'libraryFiles' @ [163:21] ==> val libraryFiles: MutableList<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'add' @ [163:34] ==> public abstract fun add(element: File): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'destination' @ [163:38] ==> var destination: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'CreateLibraryDialog' @ [168:26] ==> public constructor CreateLibraryDialog(@NotNull defaultPath: String, @NotNull title: String, @NotNull libraryCaption: String) defined in org.jetbrains.kotlin.idea.framework.ui.CreateLibraryDialog[JavaClassConstructorDescriptor]

'defaultPathToJarFile' @ [168:46] ==> val defaultPathToJarFile: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'dialogTitle' @ [168:68] ==> private final val dialogTitle: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'modulesSeparatorCaption' @ [168:81] ==> private final val modulesSeparatorCaption: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'dialog' @ [169:13] ==> val dialog: CreateLibraryDialog defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'show' @ [169:20] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.framework.ui.CreateLibraryDialog[JavaMethodDescriptor]

'!' @ [171:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dialog' @ [171:18] ==> val dialog: CreateLibraryDialog defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'isOK' @ [171:25] ==> public final val CreateLibraryDialog.isOK: Boolean[MyPropertyDescriptor]

'dialog' @ [173:32] ==> val dialog: CreateLibraryDialog defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'copyIntoPath' @ [173:39] ==> public final val CreateLibraryDialog.copyIntoPath: String?[MyPropertyDescriptor]

'copyIntoPath' @ [174:17] ==> val copyIntoPath: String? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'configurator' @ [175:46] ==> val configurator: KotlinWithLibraryConfigurator defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'getLibraryJarDescriptors' @ [175:59] ==> public abstract fun getLibraryJarDescriptors(sdk: Sdk?): List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'copyFileRequests' @ [176:21] ==> public final var copyFileRequests: CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'addCopyWithReplaceRequest' @ [176:40] ==> public final fun addCopyWithReplaceRequest(file: File, copyIntoPath: String): Unit defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.DeferredCopyFileRequests[SimpleFunctionDescriptorImpl]

'libraryJarDescriptor' @ [176:66] ==> val libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'getPathInPlugin' @ [176:87] ==> public final fun getPathInPlugin(): File defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'copyIntoPath' @ [176:106] ==> val copyIntoPath: String? defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'jarDescriptors' @ [180:35] ==> val jarDescriptors: List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'if (jarDescriptor.orderRootType == OrderRootType.SOURCES) {
                    librarySourceFiles.add(jarDescriptor.getPathInPlugin())
                }
                else {
                    libraryFiles.add(jarDescriptor.getPathInPlugin())
                }' @ [181:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'jarDescriptor' @ [181:21] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'orderRootType' @ [181:35] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'SOURCES' @ [181:66] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'librarySourceFiles' @ [182:21] ==> val librarySourceFiles: MutableList<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'add' @ [182:40] ==> public abstract fun add(element: File): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'jarDescriptor' @ [182:44] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'getPathInPlugin' @ [182:58] ==> public final fun getPathInPlugin(): File defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'libraryFiles' @ [185:21] ==> val libraryFiles: MutableList<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'add' @ [185:34] ==> public abstract fun add(element: File): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'jarDescriptor' @ [185:38] ==> val jarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'getPathInPlugin' @ [185:52] ==> public final fun getPathInPlugin(): File defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'createConfiguration' @ [190:16] ==> protected final fun createConfiguration(libraryFiles: List<File>, librarySourceFiles: List<File>): NewLibraryConfiguration defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[SimpleFunctionDescriptorImpl]

'libraryFiles' @ [190:36] ==> val libraryFiles: MutableList<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'librarySourceFiles' @ [190:50] ==> val librarySourceFiles: MutableList<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createNewLibrary[LocalVariableDescriptor]

'getConfiguratorByName' @ [194:17] ==> public fun getConfiguratorByName(name: String): KotlinProjectConfigurator? defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'configuratorName' @ [194:39] ==> private final val configuratorName: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'error' @ [195:20] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'configuratorName' @ [195:52] ==> private final val configuratorName: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'createConfigurationFromPluginPaths' @ [199:16] ==> public final fun createConfigurationFromPluginPaths(): NewLibraryConfiguration defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[SimpleFunctionDescriptorImpl]

'createConfiguration' @ [203:13] ==> protected final fun createConfiguration(libraryFiles: List<File>, librarySourceFiles: List<File>): NewLibraryConfiguration defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[SimpleFunctionDescriptorImpl]

'collectPathsInPlugin' @ [203:33] ==> private final fun collectPathsInPlugin(rootType: OrderRootType): List<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[SimpleFunctionDescriptorImpl]

'CLASSES' @ [203:68] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'collectPathsInPlugin' @ [204:33] ==> private final fun collectPathsInPlugin(rootType: OrderRootType): List<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[SimpleFunctionDescriptorImpl]

'SOURCES' @ [204:68] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'configurator' @ [207:16] ==> private final val configurator: KotlinWithLibraryConfigurator defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'getLibraryJarDescriptors' @ [207:29] ==> public abstract fun getLibraryJarDescriptors(sdk: Sdk?): List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[SimpleFunctionDescriptorImpl]

'filter' @ [208:18] ==> public inline fun <T> Iterable<LibraryJarDescriptor>.filter(predicate: (LibraryJarDescriptor) -> Boolean): List<LibraryJarDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibraryJarDescriptor

'it' @ [208:27] ==> value-parameter it: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.collectPathsInPlugin.<anonymous>[ValueParameterDescriptorImpl]

'orderRootType' @ [208:30] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'rootType' @ [208:47] ==> value-parameter rootType: OrderRootType defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.collectPathsInPlugin[ValueParameterDescriptorImpl]

'map' @ [209:18] ==> public inline fun <T, R> Iterable<LibraryJarDescriptor>.map(transform: (LibraryJarDescriptor) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibraryJarDescriptor
    <R> -> File

'it' @ [209:24] ==> value-parameter it: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.collectPathsInPlugin.<anonymous>[ValueParameterDescriptorImpl]

'getPathInPlugin' @ [209:27] ==> public final fun getPathInPlugin(): File defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'NewLibraryConfiguration' @ [213:25] ==> protected/*protected and package*/ constructor NewLibraryConfiguration<P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)>(@NotNull p0: String, @Nullable p1: LibraryType<(DummyLibraryProperties..DummyLibraryProperties?)>?, @Nullable p2: DummyLibraryProperties?) defined in com.intellij.openapi.roots.libraries.NewLibraryConfiguration[JavaClassConstructorDescriptor]
Inferred types:
    <P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)> -> (com.intellij.openapi.roots.libraries.DummyLibraryProperties..com.intellij.openapi.roots.libraries.DummyLibraryProperties?)

'libraryName' @ [213:49] ==> private final val libraryName: String defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'configurator' @ [213:62] ==> private final val configurator: KotlinWithLibraryConfigurator defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig[PropertyDescriptorImpl]

'libraryType' @ [213:75] ==> public open val libraryType: LibraryType<DummyLibraryProperties>? defined in org.jetbrains.kotlin.idea.configuration.KotlinWithLibraryConfigurator[PropertyDescriptorImpl]

'INSTANCE' @ [213:111] ==> public final val INSTANCE: (DummyLibraryProperties..DummyLibraryProperties?) defined in com.intellij.openapi.roots.libraries.DummyLibraryProperties[JavaPropertyDescriptor]

'libraryFiles' @ [215:37] ==> value-parameter libraryFiles: List<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createConfiguration[ValueParameterDescriptorImpl]

'editor' @ [216:21] ==> value-parameter editor: LibraryEditor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createConfiguration.<no name provided>.addRoots[ValueParameterDescriptorImpl]

'addRoot' @ [216:28] ==> public abstract fun addRoot(p0: (String..String?), p1: (OrderRootType..OrderRootType?)): Unit defined in com.intellij.openapi.roots.ui.configuration.libraryEditor.LibraryEditor[JavaMethodDescriptor]

'getUrlForLibraryRoot' @ [216:44] ==> public open fun getUrlForLibraryRoot(@NotNull p0: File): (String..String?) defined in com.intellij.openapi.vfs.VfsUtil[JavaMethodDescriptor]

'libraryFile' @ [216:65] ==> val libraryFile: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createConfiguration.<no name provided>.addRoots[LocalVariableDescriptor]

'CLASSES' @ [216:93] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'librarySourceFiles' @ [218:40] ==> value-parameter librarySourceFiles: List<File> defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createConfiguration[ValueParameterDescriptorImpl]

'editor' @ [219:21] ==> value-parameter editor: LibraryEditor defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createConfiguration.<no name provided>.addRoots[ValueParameterDescriptorImpl]

'addRoot' @ [219:28] ==> public abstract fun addRoot(p0: (String..String?), p1: (OrderRootType..OrderRootType?)): Unit defined in com.intellij.openapi.roots.ui.configuration.libraryEditor.LibraryEditor[JavaMethodDescriptor]

'getUrlForLibraryRoot' @ [219:44] ==> public open fun getUrlForLibraryRoot(@NotNull p0: File): (String..String?) defined in com.intellij.openapi.vfs.VfsUtil[JavaMethodDescriptor]

'librarySrcFile' @ [219:65] ==> val librarySrcFile: File defined in org.jetbrains.kotlin.idea.framework.CustomLibraryDescriptorWithDeferredConfig.createConfiguration.<no name provided>.addRoots[LocalVariableDescriptor]

'SOURCES' @ [219:96] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

