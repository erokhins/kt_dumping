'getLibraryRootsWithAbiIncompatibleVersion' @ [66:12] ==> private fun <T : BinaryVersion> getLibraryRootsWithAbiIncompatibleVersion(module: Module, supportedVersion: JvmMetadataVersion, index: ScalarIndexExtension<JvmMetadataVersion>): Collection<BinaryVersionedFile<JvmMetadataVersion>> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : BinaryVersion> -> JvmMetadataVersion

'module' @ [66:54] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleKotlinClasses[ValueParameterDescriptorImpl]

'JvmMetadataVersion' @ [66:62] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [66:81] ==> @field:JvmField public final val INSTANCE: JvmMetadataVersion defined in org.jetbrains.kotlin.load.kotlin.JvmMetadataVersion.Companion[DeserializedPropertyDescriptor]

'KotlinJvmMetadataVersionIndex' @ [66:91] ==> public object KotlinJvmMetadataVersionIndex : KotlinMetadataVersionIndexBase<KotlinJvmMetadataVersionIndex, JvmMetadataVersion> defined in org.jetbrains.kotlin.idea.versions in file KotlinJvmMetadataVersionIndex.kt[FakeCallableDescriptorForObject]

'getLibraryRootsWithAbiIncompatibleVersion' @ [70:12] ==> private fun <T : BinaryVersion> getLibraryRootsWithAbiIncompatibleVersion(module: Module, supportedVersion: JsMetadataVersion, index: ScalarIndexExtension<JsMetadataVersion>): Collection<BinaryVersionedFile<JsMetadataVersion>> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : BinaryVersion> -> JsMetadataVersion

'module' @ [70:54] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleForKotlinJs[ValueParameterDescriptorImpl]

'JsMetadataVersion' @ [70:62] ==> public companion object defined in org.jetbrains.kotlin.utils.JsMetadataVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [70:80] ==> @field:JvmField public final val INSTANCE: JsMetadataVersion defined in org.jetbrains.kotlin.utils.JsMetadataVersion.Companion[DeserializedPropertyDescriptor]

'KotlinJsMetadataVersionIndex' @ [70:90] ==> public object KotlinJsMetadataVersionIndex : KotlinMetadataVersionIndexBase<KotlinJsMetadataVersionIndex, JsMetadataVersion> defined in org.jetbrains.kotlin.idea.versions in file KotlinJsMetadataVersionIndex.kt[FakeCallableDescriptorForObject]

'project' @ [74:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.updateLibraries[ValueParameterDescriptorImpl]

'allModules' @ [74:17] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[SimpleFunctionDescriptorImpl]

'any' @ [74:30] ==> public inline fun <T> Iterable<(Module..Module?)>.any(predicate: ((Module..Module?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'isMavenModule' @ [74:63] ==> public open fun isMavenModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [74:77] ==> value-parameter module: (Module..Module?) defined in org.jetbrains.kotlin.idea.versions.updateLibraries.<anonymous>[ValueParameterDescriptorImpl]

'showMessageDialog' @ [75:18] ==> public open fun showMessageDialog(@Nullable p0: Project?, p1: (String..String?), @NotNull @Nls p2: String, @Nullable p3: Icon?): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [75:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.updateLibraries[ValueParameterDescriptorImpl]

'getErrorIcon' @ [77:45] ==> @NotNull public open fun getErrorIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [81:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.updateLibraries[ValueParameterDescriptorImpl]

'allModules' @ [81:17] ==> public fun Project.allModules(): List<(Module..Module?)> defined in org.jetbrains.kotlin.idea.util.projectStructure[SimpleFunctionDescriptorImpl]

'any' @ [81:30] ==> public inline fun <T> Iterable<(Module..Module?)>.any(predicate: ((Module..Module?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'isGradleModule' @ [81:63] ==> public open fun isGradleModule(@NotNull module: Module): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'module' @ [81:78] ==> value-parameter module: (Module..Module?) defined in org.jetbrains.kotlin.idea.versions.updateLibraries.<anonymous>[ValueParameterDescriptorImpl]

'showMessageDialog' @ [82:18] ==> public open fun showMessageDialog(@Nullable p0: Project?, p1: (String..String?), @NotNull @Nls p2: String, @Nullable p3: Icon?): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [82:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.updateLibraries[ValueParameterDescriptorImpl]

'getErrorIcon' @ [84:45] ==> @NotNull public open fun getErrorIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'getConfiguratorByName' @ [88:28] ==> public fun getConfiguratorByName(name: String): KotlinProjectConfigurator? defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'KotlinJavaModuleConfigurator' @ [88:50] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinJavaModuleConfigurator[FakeCallableDescriptorForObject]

'NAME' @ [88:79] ==> public final val NAME: String defined in org.jetbrains.kotlin.idea.configuration.KotlinJavaModuleConfigurator.Companion[PropertyDescriptorImpl]

'error' @ [89:28] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [89:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'KotlinJavaModuleConfigurator' @ [89:84] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinJavaModuleConfigurator[FakeCallableDescriptorForObject]

'NAME' @ [89:113] ==> public final val NAME: String defined in org.jetbrains.kotlin.idea.configuration.KotlinJavaModuleConfigurator.Companion[PropertyDescriptorImpl]

'getConfiguratorByName' @ [91:27] ==> public fun getConfiguratorByName(name: String): KotlinProjectConfigurator? defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'KotlinJsModuleConfigurator' @ [91:49] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinJsModuleConfigurator[FakeCallableDescriptorForObject]

'NAME' @ [91:76] ==> public const final val NAME: String defined in org.jetbrains.kotlin.idea.configuration.KotlinJsModuleConfigurator.Companion[PropertyDescriptorImpl]

'error' @ [92:27] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [92:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'KotlinJsModuleConfigurator' @ [92:83] ==> public companion object defined in org.jetbrains.kotlin.idea.configuration.KotlinJsModuleConfigurator[FakeCallableDescriptorForObject]

'NAME' @ [92:110] ==> public const final val NAME: String defined in org.jetbrains.kotlin.idea.configuration.KotlinJsModuleConfigurator.Companion[PropertyDescriptorImpl]

'createConfigureKotlinNotificationCollector' @ [94:21] ==> public fun createConfigureKotlinNotificationCollector(project: Project): NotificationMessageCollector defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'project' @ [94:64] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.updateLibraries[ValueParameterDescriptorImpl]

'getInstance' @ [95:34] ==> public open fun getInstance(@NotNull p0: Project): (ProjectRootManager..ProjectRootManager?) defined in com.intellij.openapi.roots.ProjectRootManager[JavaMethodDescriptor]

'project' @ [95:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.updateLibraries[ValueParameterDescriptorImpl]

'projectSdk' @ [95:55] ==> public final var ProjectRootManager.projectSdk: Sdk?[MyPropertyDescriptor]

'libraries' @ [98:21] ==> value-parameter libraries: Collection<Library> defined in org.jetbrains.kotlin.idea.versions.updateLibraries[ValueParameterDescriptorImpl]

'if (JavaRuntimeDetectionUtil.getJavaRuntimeVersion(library) != null)
            kJvmConfigurator.getLibraryJarDescriptors(sdk)
        else
            kJsConfigurator.getLibraryJarDescriptors(sdk)' @ [99:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<LibraryJarDescriptor>, elseBranch: List<LibraryJarDescriptor>): List<LibraryJarDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<LibraryJarDescriptor>

'!=' @ [99:41] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getJavaRuntimeVersion' @ [99:66] ==> public open fun getJavaRuntimeVersion(@NotNull p0: Library): (String..String?) defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeDetectionUtil[JavaMethodDescriptor]

'library' @ [99:88] ==> val library: Library defined in org.jetbrains.kotlin.idea.versions.updateLibraries[LocalVariableDescriptor]

'kJvmConfigurator' @ [100:13] ==> val kJvmConfigurator: KotlinJavaModuleConfigurator defined in org.jetbrains.kotlin.idea.versions.updateLibraries[LocalVariableDescriptor]

'getLibraryJarDescriptors' @ [100:30] ==> public open fun getLibraryJarDescriptors(sdk: Sdk?): List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.configuration.KotlinJavaModuleConfigurator[SimpleFunctionDescriptorImpl]

'sdk' @ [100:55] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.idea.versions.updateLibraries[LocalVariableDescriptor]

'kJsConfigurator' @ [102:13] ==> val kJsConfigurator: KotlinJsModuleConfigurator defined in org.jetbrains.kotlin.idea.versions.updateLibraries[LocalVariableDescriptor]

'getLibraryJarDescriptors' @ [102:29] ==> public open fun getLibraryJarDescriptors(sdk: Sdk?): List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.configuration.KotlinJsModuleConfigurator[SimpleFunctionDescriptorImpl]

'sdk' @ [102:54] ==> val sdk: Sdk? defined in org.jetbrains.kotlin.idea.versions.updateLibraries[LocalVariableDescriptor]

'libraryJarDescriptors' @ [104:38] ==> val libraryJarDescriptors: List<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.versions.updateLibraries[LocalVariableDescriptor]

'updateJar' @ [105:13] ==> private fun updateJar(project: Project, library: Library, libraryJarDescriptor: LibraryJarDescriptor): Unit defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [105:23] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.updateLibraries[ValueParameterDescriptorImpl]

'library' @ [105:32] ==> val library: Library defined in org.jetbrains.kotlin.idea.versions.updateLibraries[LocalVariableDescriptor]

'libraryJarDescriptor' @ [105:41] ==> val libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.versions.updateLibraries[LocalVariableDescriptor]

'collector' @ [109:5] ==> val collector: NotificationMessageCollector defined in org.jetbrains.kotlin.idea.versions.updateLibraries[LocalVariableDescriptor]

'showNotification' @ [109:15] ==> public final fun showNotification(): Unit defined in org.jetbrains.kotlin.idea.configuration.NotificationMessageCollector[SimpleFunctionDescriptorImpl]

'libraryJarDescriptor' @ [116:25] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.versions.updateJar[ValueParameterDescriptorImpl]

'findExistingJar' @ [116:46] ==> public open fun findExistingJar(library: Library): VirtualFile? defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'library' @ [116:62] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.updateJar[ValueParameterDescriptorImpl]

'fileToReplace' @ [118:9] ==> val fileToReplace: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'!' @ [118:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'libraryJarDescriptor' @ [118:35] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.versions.updateJar[ValueParameterDescriptorImpl]

'shouldExist' @ [118:56] ==> public final val shouldExist: Boolean defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'fileToReplace' @ [122:18] ==> val fileToReplace: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'url' @ [122:33] ==> public final val VirtualFile.url: String[MyPropertyDescriptor]

'libraryJarDescriptor' @ [123:25] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.versions.updateJar[ValueParameterDescriptorImpl]

'getPathInPlugin' @ [123:46] ==> public final fun getPathInPlugin(): File defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'!' @ [125:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jarPath' @ [125:10] ==> val jarPath: File defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'exists' @ [125:18] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'showRuntimeJarNotFoundDialog' @ [126:9] ==> public fun showRuntimeJarNotFoundDialog(project: Project, jarName: String): Unit defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [126:38] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.updateJar[ValueParameterDescriptorImpl]

'libraryJarDescriptor' @ [126:47] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.versions.updateJar[ValueParameterDescriptorImpl]

'jarName' @ [126:68] ==> public final val jarName: String defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'getLocalJar' @ [130:28] ==> public fun getLocalJar(kotlinRuntimeJar: VirtualFile?): VirtualFile? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'fileToReplace' @ [130:40] ==> val fileToReplace: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'replaceFile' @ [131:20] ==> internal fun replaceFile(updatedFile: File, jarFileToReplace: VirtualFile): VirtualFile? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'jarPath' @ [131:32] ==> val jarPath: File defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'jarFileToReplace' @ [131:41] ==> val jarFileToReplace: VirtualFile defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'newVFile' @ [132:9] ==> val newVFile: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'library' @ [133:21] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.updateJar[ValueParameterDescriptorImpl]

'modifiableModel' @ [133:29] ==> public final val Library.modifiableModel: Library.ModifiableModel[MyPropertyDescriptor]

'runWriteAction' @ [134:9] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'oldUrl' @ [136:21] ==> val oldUrl: String? defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'model' @ [137:21] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'removeRoot' @ [137:27] ==> public abstract fun removeRoot(@NotNull p0: String, @NotNull p1: OrderRootType): Boolean defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'oldUrl' @ [137:38] ==> val oldUrl: String? defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'libraryJarDescriptor' @ [137:46] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.versions.updateJar[ValueParameterDescriptorImpl]

'orderRootType' @ [137:67] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'!!' @ [139:31] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: VirtualFile?): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> VirtualFile

'getInstance' @ [139:45] ==> public open fun getInstance(): (JarFileSystem..JarFileSystem?) defined in com.intellij.openapi.vfs.JarFileSystem[JavaMethodDescriptor]

'getJarRootForLocalFile' @ [139:59] ==> @Nullable public open fun getJarRootForLocalFile(@NotNull p0: VirtualFile): VirtualFile? defined in com.intellij.openapi.vfs.JarFileSystem[JavaMethodDescriptor]

'newVFile' @ [139:82] ==> val newVFile: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'model' @ [140:17] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'addRoot' @ [140:23] ==> public abstract fun addRoot(@NotNull p0: VirtualFile, @NotNull p1: OrderRootType): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'newRoot' @ [140:31] ==> val newRoot: VirtualFile defined in org.jetbrains.kotlin.idea.versions.updateJar.<anonymous>[LocalVariableDescriptor]

'libraryJarDescriptor' @ [140:40] ==> value-parameter libraryJarDescriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.versions.updateJar[ValueParameterDescriptorImpl]

'orderRootType' @ [140:61] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'model' @ [143:17] ==> val model: Library.ModifiableModel defined in org.jetbrains.kotlin.idea.versions.updateJar[LocalVariableDescriptor]

'commit' @ [143:23] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'MultiMap' @ [150:21] ==> public constructor MultiMap<K : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.MultiMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Library
    <V : (Any..Any?)> -> Module

'iterator' @ [152:20] ==> public final operator fun iterator(): Iterator<(Module..Module?)> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [152:34] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'project' @ [152:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.findAllUsedLibraries[ValueParameterDescriptorImpl]

'modules' @ [152:55] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'getInstance' @ [153:51] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [153:63] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.versions.findAllUsedLibraries[LocalVariableDescriptor]

'moduleRootManager' @ [155:23] ==> val moduleRootManager: (ModuleRootManager..ModuleRootManager?) defined in org.jetbrains.kotlin.idea.versions.findAllUsedLibraries[LocalVariableDescriptor]

'orderEntries' @ [155:41] ==> public final val ModuleRootManager.orderEntries: (Array<(OrderEntry..OrderEntry?)>..Array<out (OrderEntry..OrderEntry?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [155:54] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<LibraryOrderEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> LibraryOrderEntry

'entry' @ [156:27] ==> val entry: LibraryOrderEntry defined in org.jetbrains.kotlin.idea.versions.findAllUsedLibraries[LocalVariableDescriptor]

'library' @ [156:33] ==> public final val LibraryOrderEntry.library: Library?[MyPropertyDescriptor]

'libraries' @ [158:13] ==> val libraries: MultiMap<Library, Module> defined in org.jetbrains.kotlin.idea.versions.findAllUsedLibraries[LocalVariableDescriptor]

'putValue' @ [158:23] ==> public open fun putValue(@Nullable p0: Library?, p1: (Module..Module?)): Unit defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'library' @ [158:32] ==> val library: Library defined in org.jetbrains.kotlin.idea.versions.findAllUsedLibraries[LocalVariableDescriptor]

'module' @ [158:41] ==> val module: (Module..Module?) defined in org.jetbrains.kotlin.idea.versions.findAllUsedLibraries[LocalVariableDescriptor]

'libraries' @ [162:12] ==> val libraries: MultiMap<Library, Module> defined in org.jetbrains.kotlin.idea.versions.findAllUsedLibraries[LocalVariableDescriptor]

'File' @ [168:81] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'paths' @ [168:86] ==> value-parameter paths: KotlinPaths defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.<init>.<anonymous>[ValueParameterDescriptorImpl]

'libPath' @ [168:92] ==> public final val KotlinPaths.libPath: File[MyPropertyDescriptor]

'jarName' @ [168:101] ==> value-parameter jarName: String defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.<init>[ValueParameterDescriptorImpl]

'' @ [169:16] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [169:17] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_STDLIB_JAR' @ [169:26] ==> public const final val KOTLIN_JAVA_STDLIB_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'CLASSES' @ [169:64] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'isExternalLibrary' @ [171:17] ==> public fun isExternalLibrary(library: Library): Boolean defined in org.jetbrains.kotlin.idea.framework in file KotlinLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'library' @ [171:35] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.RUNTIME_JAR.findExistingJar[ValueParameterDescriptorImpl]

'getRuntimeJar' @ [172:45] ==> @Nullable public open fun getRuntimeJar(@NotNull p0: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>)): VirtualFile? defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeDetectionUtil[JavaMethodDescriptor]

'asList' @ [172:66] ==> @SafeVarargs public open fun <T : (Any..Any?)> asList(vararg p0: (VirtualFile..VirtualFile?)): (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>?) defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VirtualFile

'library' @ [172:74] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.RUNTIME_JAR.findExistingJar[ValueParameterDescriptorImpl]

'getFiles' @ [172:82] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'CLASSES' @ [172:105] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [176:16] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [176:17] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_REFLECT_JAR' @ [176:26] ==> public const final val KOTLIN_JAVA_REFLECT_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'CLASSES' @ [176:65] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [177:23] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [177:24] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_SCRIPT_RUNTIME_JAR' @ [177:33] ==> public const final val KOTLIN_JAVA_SCRIPT_RUNTIME_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'CLASSES' @ [177:79] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [178:13] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [178:14] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_TEST_JAR' @ [178:23] ==> public const final val KOTLIN_TEST_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'CLASSES' @ [178:54] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [179:21] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [179:22] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_RUNTIME_JRE7_JAR' @ [179:31] ==> public const final val KOTLIN_JAVA_RUNTIME_JRE7_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'CLASSES' @ [179:75] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [180:21] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [180:22] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_RUNTIME_JRE8_JAR' @ [180:31] ==> public const final val KOTLIN_JAVA_RUNTIME_JRE8_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'CLASSES' @ [180:75] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [181:29] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [181:30] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_RUNTIME_JRE7_SRC_JAR' @ [181:39] ==> public const final val KOTLIN_JAVA_RUNTIME_JRE7_SRC_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'SOURCES' @ [181:87] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [182:29] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [182:30] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_RUNTIME_JRE8_SRC_JAR' @ [182:39] ==> public const final val KOTLIN_JAVA_RUNTIME_JRE8_SRC_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'SOURCES' @ [182:87] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [184:20] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [184:21] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_STDLIB_SRC_JAR' @ [184:30] ==> public const final val KOTLIN_JAVA_STDLIB_SRC_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'SOURCES' @ [184:72] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'super' @ [186:20] ==> <this> defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.RUNTIME_SRC_JAR[LazyClassReceiverParameterDescriptor]

'findExistingJar' @ [186:26] ==> public open fun findExistingJar(library: Library): VirtualFile? defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'library' @ [186:42] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.RUNTIME_SRC_JAR.findExistingJar[ValueParameterDescriptorImpl]

'LibraryUtils' @ [187:20] ==> public object LibraryUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'getJarFile' @ [187:33] ==> @JvmStatic public final fun getJarFile(classesRoots: List<VirtualFile>, jarName: String): VirtualFile? defined in org.jetbrains.kotlin.utils.LibraryUtils[DeserializedSimpleFunctionDescriptor]

'library' @ [187:44] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.RUNTIME_SRC_JAR.findExistingJar[ValueParameterDescriptorImpl]

'getFiles' @ [187:52] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'orderRootType' @ [187:61] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.RUNTIME_SRC_JAR[PropertyDescriptorImpl]

'toList' @ [187:76] ==> public fun <T> Array<out (VirtualFile..VirtualFile?)>.toList(): List<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'PathUtil' @ [187:86] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_JAVA_STDLIB_SRC_JAR_OLD' @ [187:95] ==> public const final val KOTLIN_JAVA_STDLIB_SRC_JAR_OLD: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'' @ [190:20] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [190:21] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_REFLECT_SRC_JAR' @ [190:30] ==> public const final val KOTLIN_REFLECT_SRC_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'SOURCES' @ [190:68] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [191:17] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [191:18] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'KOTLIN_TEST_SRC_JAR' @ [191:27] ==> public const final val KOTLIN_TEST_SRC_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'SOURCES' @ [191:62] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [193:18] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [193:19] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'JS_LIB_JAR_NAME' @ [193:28] ==> public const final val JS_LIB_JAR_NAME: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'CLASSES' @ [193:59] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'' @ [194:22] ==> private constructor LibraryJarDescriptor(jarName: String, orderRootType: OrderRootType, shouldExist: Boolean, getPath: (KotlinPaths) -> File = ...) defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[ClassConstructorDescriptorImpl]

'PathUtil' @ [194:23] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'JS_LIB_SRC_JAR_NAME' @ [194:32] ==> public const final val JS_LIB_SRC_JAR_NAME: String defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'SOURCES' @ [194:67] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'isExternalLibrary' @ [197:13] ==> public fun isExternalLibrary(library: Library): Boolean defined in org.jetbrains.kotlin.idea.framework in file KotlinLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'library' @ [197:31] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.findExistingJar[ValueParameterDescriptorImpl]

'LibraryUtils' @ [198:16] ==> public object LibraryUtils defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'getJarFile' @ [198:29] ==> @JvmStatic public final fun getJarFile(classesRoots: List<VirtualFile>, jarName: String): VirtualFile? defined in org.jetbrains.kotlin.utils.LibraryUtils[DeserializedSimpleFunctionDescriptor]

'asList' @ [198:47] ==> @SafeVarargs public open fun <T : (Any..Any?)> asList(vararg p0: (VirtualFile..VirtualFile?)): (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>?) defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> VirtualFile

'library' @ [198:55] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor.findExistingJar[ValueParameterDescriptorImpl]

'getFiles' @ [198:63] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'orderRootType' @ [198:72] ==> public final val orderRootType: OrderRootType defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'jarName' @ [198:89] ==> public final val jarName: String defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[PropertyDescriptorImpl]

'invoke' @ [201:29] ==> public abstract operator fun invoke(p1: KotlinPaths): File defined in kotlin.Function1[FunctionInvokeDescriptor]

'PathUtil' @ [201:37] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'kotlinPathsForIdeaPlugin' @ [201:46] ==> @JvmStatic public final val kotlinPathsForIdeaPlugin: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'bundledRuntimeBuildNumber' @ [205:12] ==> private val bundledRuntimeBuildNumber: String? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'pluginRuntimeVersion' @ [205:41] ==> public fun pluginRuntimeVersion(pluginVersion: String): String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'getPluginVersion' @ [205:79] ==> @NotNull public open fun getPluginVersion(): String defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'lazy' @ [208:51] ==> public fun <T> lazy(initializer: () -> String?): Lazy<String?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'PathUtil' @ [209:16] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'kotlinPathsForIdeaPlugin' @ [209:25] ==> @JvmStatic public final val kotlinPathsForIdeaPlugin: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'buildNumberFile' @ [209:50] ==> public final val KotlinPaths.buildNumberFile: File[MyPropertyDescriptor]

'if (file.exists()) file.readText().trim() else null' @ [210:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'file' @ [210:9] ==> val file: File defined in org.jetbrains.kotlin.idea.versions.bundledRuntimeBuildNumber.<anonymous>[LocalVariableDescriptor]

'exists' @ [210:14] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'file' @ [210:24] ==> val file: File defined in org.jetbrains.kotlin.idea.versions.bundledRuntimeBuildNumber.<anonymous>[LocalVariableDescriptor]

'readText' @ [210:29] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'trim' @ [210:40] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [213:42] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: String): Array<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> String

'-' @ [216:24] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PLUGIN_VERSIONS_SEPARATORS' @ [218:23] ==> private val PLUGIN_VERSIONS_SEPARATORS: Array<String> defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'indexOf' @ [219:43] ==> @Contract public open fun indexOf(@NotNull p0: CharSequence, @NotNull p1: CharSequence): Int defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'pluginVersion' @ [219:51] ==> value-parameter pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[ValueParameterDescriptorImpl]

'separator' @ [219:66] ==> val separator: String defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'ideaPatternIndex' @ [220:13] ==> val ideaPatternIndex: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'isDigit' @ [220:48] ==> public open fun isDigit(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'pluginVersion' @ [220:56] ==> value-parameter pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[ValueParameterDescriptorImpl]

'ideaPatternIndex' @ [220:70] ==> val ideaPatternIndex: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'placeToSplit' @ [221:13] ==> var placeToSplit: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'ideaPatternIndex' @ [221:28] ==> val ideaPatternIndex: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'placeToSplit' @ [226:9] ==> var placeToSplit: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'-' @ [226:25] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'..' @ [227:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'pluginVersion' @ [227:22] ==> value-parameter pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[ValueParameterDescriptorImpl]

'length' @ [227:36] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'pluginVersion' @ [228:22] ==> value-parameter pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[ValueParameterDescriptorImpl]

'i' @ [228:36] ==> val i: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'isLetter' @ [229:27] ==> public open fun isLetter(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'ch' @ [229:36] ==> val ch: Char defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'pluginVersion' @ [229:43] ==> value-parameter pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[ValueParameterDescriptorImpl]

'i' @ [229:57] ==> val i: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'placeToSplit' @ [230:17] ==> var placeToSplit: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'i' @ [230:32] ==> val i: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'if (placeToSplit != -1) pluginVersion.substring(0, placeToSplit) else pluginVersion' @ [236:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'placeToSplit' @ [236:16] ==> var placeToSplit: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'-' @ [236:32] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'pluginVersion' @ [236:36] ==> value-parameter pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[ValueParameterDescriptorImpl]

'substring' @ [236:50] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'placeToSplit' @ [236:63] ==> var placeToSplit: Int defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[LocalVariableDescriptor]

'pluginVersion' @ [236:82] ==> value-parameter pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.pluginRuntimeVersion[ValueParameterDescriptorImpl]

'kotlinRuntimeJar' @ [240:9] ==> value-parameter kotlinRuntimeJar: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.getLocalJar[ValueParameterDescriptorImpl]

'getInstance' @ [242:38] ==> public open fun getInstance(): (JarFileSystem..JarFileSystem?) defined in com.intellij.openapi.vfs.JarFileSystem[JavaMethodDescriptor]

'getVirtualFileForJar' @ [242:52] ==> @Nullable public open fun getVirtualFileForJar(@Nullable p0: VirtualFile?): VirtualFile? defined in com.intellij.openapi.vfs.JarFileSystem[JavaMethodDescriptor]

'kotlinRuntimeJar' @ [242:73] ==> value-parameter kotlinRuntimeJar: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.getLocalJar[ValueParameterDescriptorImpl]

'localJarFile' @ [243:9] ==> val localJarFile: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.getLocalJar[LocalVariableDescriptor]

'localJarFile' @ [244:16] ==> val localJarFile: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.getLocalJar[LocalVariableDescriptor]

'kotlinRuntimeJar' @ [246:12] ==> value-parameter kotlinRuntimeJar: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.getLocalJar[ValueParameterDescriptorImpl]

'File' @ [250:30] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'jarFileToReplace' @ [250:35] ==> value-parameter jarFileToReplace: VirtualFile defined in org.jetbrains.kotlin.idea.versions.replaceFile[ValueParameterDescriptorImpl]

'path' @ [250:52] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'filesEqual' @ [252:18] ==> public open fun filesEqual(@Nullable p0: File?, @Nullable p1: File?): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'updatedFile' @ [252:29] ==> value-parameter updatedFile: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[ValueParameterDescriptorImpl]

'jarIoFileToReplace' @ [252:42] ==> val jarIoFileToReplace: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'copy' @ [256:14] ==> public open fun copy(@NotNull p0: File, @NotNull p1: File): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'updatedFile' @ [256:19] ==> value-parameter updatedFile: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[ValueParameterDescriptorImpl]

'jarIoFileToReplace' @ [256:32] ==> val jarIoFileToReplace: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'jarIoFileToReplace' @ [257:9] ==> val jarIoFileToReplace: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'name' @ [257:28] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'updatedFile' @ [257:36] ==> value-parameter updatedFile: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[ValueParameterDescriptorImpl]

'name' @ [257:48] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'File' @ [258:23] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'jarIoFileToReplace' @ [258:28] ==> val jarIoFileToReplace: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'parent' @ [258:47] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'updatedFile' @ [258:55] ==> value-parameter updatedFile: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[ValueParameterDescriptorImpl]

'name' @ [258:67] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'!' @ [259:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'newFile' @ [259:14] ==> val newFile: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'exists' @ [259:22] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'!' @ [260:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jarIoFileToReplace' @ [260:18] ==> val jarIoFileToReplace: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'renameTo' @ [260:37] ==> public open fun renameTo(p0: (File..File?)): Boolean defined in java.io.File[JavaMethodDescriptor]

'newFile' @ [260:46] ==> val newFile: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'LOG' @ [261:17] ==> public val LOG: Logger defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'info' @ [261:21] ==> public abstract fun info(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'jarIoFileToReplace' @ [261:46] ==> val jarIoFileToReplace: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'path' @ [261:65] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'newFile' @ [261:76] ==> val newFile: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'path' @ [261:84] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'getInstance' @ [264:44] ==> public open fun getInstance(): (LocalFileSystem..LocalFileSystem?) defined in com.intellij.openapi.vfs.LocalFileSystem[JavaMethodDescriptor]

'refreshAndFindFileByIoFile' @ [264:58] ==> @Nullable public abstract fun refreshAndFindFileByIoFile(@NotNull p0: File): VirtualFile? defined in com.intellij.openapi.vfs.LocalFileSystem[JavaMethodDescriptor]

'newFile' @ [264:85] ==> val newFile: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'newVFile' @ [265:17] ==> val newVFile: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'LOG' @ [266:17] ==> public val LOG: Logger defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'info' @ [266:21] ==> public abstract fun info(@NonNls p0: (String..String?)): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'newFile' @ [266:44] ==> val newFile: File defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'path' @ [266:52] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'newVFile' @ [269:13] ==> val newVFile: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'refresh' @ [269:22] ==> public open fun refresh(p0: Boolean, p1: Boolean): Unit defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'newVFile' @ [270:20] ==> val newVFile: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.replaceFile[LocalVariableDescriptor]

'jarFileToReplace' @ [273:5] ==> value-parameter jarFileToReplace: VirtualFile defined in org.jetbrains.kotlin.idea.versions.replaceFile[ValueParameterDescriptorImpl]

'refresh' @ [273:22] ==> public open fun refresh(p0: Boolean, p1: Boolean): Unit defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'index' @ [284:14] ==> value-parameter index: ScalarIndexExtension<T> defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[ValueParameterDescriptorImpl]

'name' @ [284:20] ==> public final val <K : (Any..Any?)> ScalarIndexExtension<T>.name: ID<(T..T?), (Void..Void?)>[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> T

'setOf' @ [286:37] ==> public fun <T> setOf(element: Module): Set<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Module

'module' @ [286:43] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[ValueParameterDescriptorImpl]

'getAllDependentModules' @ [286:64] ==> @NotNull public open fun getAllDependentModules(@NotNull p0: Module): (MutableList<(Module..Module?)>..List<(Module..Module?)>) defined in com.intellij.openapi.module.ModuleUtil[JavaMethodDescriptor]

'module' @ [286:87] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[ValueParameterDescriptorImpl]

'union' @ [287:61] ==> @NotNull @Contract public open fun union(@NotNull p0: (Array<(GlobalSearchScope..GlobalSearchScope?)>..Array<out (GlobalSearchScope..GlobalSearchScope?)>)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'moduleWithAllDependencies' @ [288:13] ==> val moduleWithAllDependencies: Set<(Module..Module?)> defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'map' @ [288:39] ==> public inline fun <T, R> Iterable<(Module..Module?)>.map(transform: ((Module..Module?)) -> GlobalSearchScope): List<GlobalSearchScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)
    <R> -> GlobalSearchScope

'it' @ [288:45] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion.<anonymous>[ValueParameterDescriptorImpl]

'moduleWithLibrariesScope' @ [288:48] ==> public final val Module.moduleWithLibrariesScope: GlobalSearchScope[MyPropertyDescriptor]

'toTypedArray' @ [288:75] ==> public inline fun <reified T> Collection<GlobalSearchScope>.toTypedArray(): Array<GlobalSearchScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> GlobalSearchScope

'getInstance' @ [290:38] ==> public open fun getInstance(): (FileBasedIndex..FileBasedIndex?) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]

'getAllKeys' @ [290:52] ==> @NotNull public abstract fun <K : (Any..Any?)> getAllKeys(@NotNull p0: ID<(T..T?), *>, @NotNull p1: Project): (MutableCollection<(T..T?)>..Collection<(T..T?)>) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> T

'id' @ [290:63] ==> val id: ID<(T..T?), (Void..Void?)> defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'module' @ [290:67] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[ValueParameterDescriptorImpl]

'project' @ [290:74] ==> public final val Module.project: Project[MyPropertyDescriptor]

'allVersions' @ [291:23] ==> val allVersions: (MutableCollection<(T..T?)>..Collection<(T..T?)>) defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'filterNot' @ [291:35] ==> public inline fun <T> Iterable<(T..T?)>.filterNot(predicate: ((T..T?)) -> Boolean): List<(T..T?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'BinaryVersion' @ [291:45] ==> public companion object defined in org.jetbrains.kotlin.serialization.deserialization.BinaryVersion[FakeCallableDescriptorForObject]

'toHashSet' @ [291:74] ==> public fun <T> Iterable<(T..T?)>.toHashSet(): HashSet<(T..T?)> /* = HashSet<(T..T?)> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'hashSetOf' @ [292:20] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<BinaryVersionedFile<T>> /* = HashSet<BinaryVersionedFile<T>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<T>

'getInstance' @ [293:46] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectFileIndex..ProjectFileIndex?) defined in com.intellij.openapi.roots.ProjectFileIndex.SERVICE[JavaMethodDescriptor]

'module' @ [293:58] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[ValueParameterDescriptorImpl]

'project' @ [293:65] ==> public final val Module.project: Project[MyPropertyDescriptor]

'badVersions' @ [295:21] ==> val badVersions: HashSet<(T..T?)> /* = HashSet<(T..T?)> */ defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'getInstance' @ [296:43] ==> public open fun getInstance(): (FileBasedIndex..FileBasedIndex?) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]

'getContainingFiles' @ [296:57] ==> @NotNull public abstract fun <K : (Any..Any?), V : (Any..Any?)> getContainingFiles(@NotNull p0: ID<(T..T?), (Void..Void?)>, @NotNull p1: (T..T?), @NotNull p2: GlobalSearchScope): (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in com.intellij.util.indexing.FileBasedIndex[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (T..T?)
    <V : (Any..Any?)> -> Void

'id' @ [296:76] ==> val id: ID<(T..T?), (Void..Void?)> defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'version' @ [296:80] ==> val version: (T..T?) defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'moduleWithAllDependentLibraries' @ [296:89] ==> val moduleWithAllDependentLibraries: GlobalSearchScope defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'indexedFiles' @ [297:29] ==> val indexedFiles: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'fileIndex' @ [298:31] ==> val fileIndex: (ProjectFileIndex..ProjectFileIndex?) defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'getClassRootForFile' @ [298:41] ==> @Nullable public abstract fun getClassRootForFile(@NotNull p0: VirtualFile): VirtualFile? defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'indexedFile' @ [298:61] ==> val indexedFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'error' @ [299:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [299:27] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'id' @ [299:112] ==> val id: ID<(T..T?), (Void..Void?)> defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'indexedFile' @ [300:36] ==> val indexedFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'path' @ [300:48] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'badRoots' @ [301:13] ==> val badRoots: HashSet<BinaryVersionedFile<T>> /* = HashSet<BinaryVersionedFile<T>> */ defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'add' @ [301:22] ==> public open fun add(element: BinaryVersionedFile<T>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'BinaryVersionedFile' @ [301:26] ==> public constructor BinaryVersionedFile<out T : BinaryVersion>(file: VirtualFile, version: T, supportedVersion: T) defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : BinaryVersion> -> T

'getLocalFile' @ [301:46] ==> @NotNull public open fun getLocalFile(@NotNull p0: VirtualFile): VirtualFile defined in com.intellij.util.PathUtil[JavaMethodDescriptor]

'libraryRoot' @ [301:59] ==> val libraryRoot: VirtualFile defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'version' @ [301:73] ==> val version: (T..T?) defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'supportedVersion' @ [301:82] ==> value-parameter supportedVersion: T defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[ValueParameterDescriptorImpl]

'badRoots' @ [305:12] ==> val badRoots: HashSet<BinaryVersionedFile<T>> /* = HashSet<BinaryVersionedFile<T>> */ defined in org.jetbrains.kotlin.idea.versions.getLibraryRootsWithAbiIncompatibleVersion[LocalVariableDescriptor]

'showErrorDialog' @ [309:14] ==> public open fun showErrorDialog(@Nullable p0: Project?, @Nls p1: (String..String?), @NotNull @Nls p2: String): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [309:30] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.showRuntimeJarNotFoundDialog[ValueParameterDescriptorImpl]

'jarName' @ [310:30] ==> value-parameter jarName: String defined in org.jetbrains.kotlin.idea.versions.showRuntimeJarNotFoundDialog[ValueParameterDescriptorImpl]

'runReadAction' @ [315:12] ==> public fun <T> runReadAction(action: () -> PsiClass?): PsiClass? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass?

'project' @ [316:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.getKotlinJvmRuntimeMarkerClass[ValueParameterDescriptorImpl]

'runWithAlternativeResolveEnabled' @ [316:17] ==> public fun <T> Project.runWithAlternativeResolveEnabled(action: () -> PsiClass?): PsiClass? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass?

'getInstance' @ [317:27] ==> public open fun getInstance(p0: (Project..Project?)): (JavaPsiFacade..JavaPsiFacade?) defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'project' @ [317:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.getKotlinJvmRuntimeMarkerClass[ValueParameterDescriptorImpl]

'findClass' @ [317:48] ==> @Nullable public abstract fun findClass(@NonNls @NotNull p0: String, @NotNull p1: GlobalSearchScope): PsiClass? defined in com.intellij.psi.JavaPsiFacade[JavaMethodDescriptor]

'FQ_NAMES' @ [317:73] ==> public final val FQ_NAMES: (KotlinBuiltIns.FqNames..KotlinBuiltIns.FqNames?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaPropertyDescriptor]

'unit' @ [317:82] ==> public final val unit: (FqNameUnsafe..FqNameUnsafe?) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns.FqNames[JavaPropertyDescriptor]

'asString' @ [317:87] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'scope' @ [317:99] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.versions.getKotlinJvmRuntimeMarkerClass[ValueParameterDescriptorImpl]

'FqName' @ [322:33] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'runReadAction' @ [325:12] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'project' @ [326:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.hasKotlinJsKjsmFile[ValueParameterDescriptorImpl]

'runWithAlternativeResolveEnabled' @ [326:17] ==> public fun <T> Project.runWithAlternativeResolveEnabled(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'KotlinJavaScriptMetaFileIndex' @ [327:13] ==> public object KotlinJavaScriptMetaFileIndex : KotlinFileIndexBase<KotlinJavaScriptMetaFileIndex> defined in org.jetbrains.kotlin.idea.vfilefinder[FakeCallableDescriptorForObject]

'hasSomethingInPackage' @ [327:43] ==> public fun <T> KotlinFileIndexBase<KotlinJavaScriptMetaFileIndex>.hasSomethingInPackage(fqName: FqName, scope: GlobalSearchScope): Boolean defined in org.jetbrains.kotlin.idea.vfilefinder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJavaScriptMetaFileIndex

'KOTLIN_JS_FQ_NAME' @ [327:65] ==> private val KOTLIN_JS_FQ_NAME: FqName defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'scope' @ [327:84] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.versions.hasKotlinJsKjsmFile[ValueParameterDescriptorImpl]

'!' @ [333:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasJreSpecificRuntime' @ [333:10] ==> public fun hasJreSpecificRuntime(version: String): Boolean defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'version' @ [333:32] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.versions.getStdlibArtifactId[ValueParameterDescriptorImpl]

'MAVEN_STDLIB_ID' @ [334:16] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'sdk' @ [337:22] ==> value-parameter sdk: Sdk? defined in org.jetbrains.kotlin.idea.versions.getStdlibArtifactId[ValueParameterDescriptorImpl]

'let' @ [337:27] ==> @InlineOnly public inline fun <T, R> Sdk.let(block: (Sdk) -> JavaSdkVersion?): JavaSdkVersion? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk
    <R> -> JavaSdkVersion?

'getInstance' @ [337:41] ==> public open fun getInstance(): (JavaSdk..JavaSdk?) defined in com.intellij.openapi.projectRoots.JavaSdk[JavaMethodDescriptor]

'getVersion' @ [337:55] ==> @Nullable public abstract fun getVersion(@NotNull p0: Sdk): JavaSdkVersion? defined in com.intellij.openapi.projectRoots.JavaSdk[JavaMethodDescriptor]

'it' @ [337:66] ==> value-parameter it: Sdk defined in org.jetbrains.kotlin.idea.versions.getStdlibArtifactId.<anonymous>[ValueParameterDescriptorImpl]

'when (sdkVersion) {
        JavaSdkVersion.JDK_1_8, JavaSdkVersion.JDK_1_9 -> MAVEN_STDLIB_ID_JRE8
        JavaSdkVersion.JDK_1_7 -> MAVEN_STDLIB_ID_JRE7
        else -> MAVEN_STDLIB_ID
    }' @ [338:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'sdkVersion' @ [338:18] ==> val sdkVersion: JavaSdkVersion? defined in org.jetbrains.kotlin.idea.versions.getStdlibArtifactId[LocalVariableDescriptor]

'JDK_1_8' @ [339:24] ==> enum entry JDK_1_8 defined in com.intellij.openapi.projectRoots.JavaSdkVersion[FakeCallableDescriptorForObject]

'JDK_1_9' @ [339:48] ==> enum entry JDK_1_9 defined in com.intellij.openapi.projectRoots.JavaSdkVersion[FakeCallableDescriptorForObject]

'MAVEN_STDLIB_ID_JRE8' @ [339:59] ==> public val MAVEN_STDLIB_ID_JRE8: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'JDK_1_7' @ [340:24] ==> enum entry JDK_1_7 defined in com.intellij.openapi.projectRoots.JavaSdkVersion[FakeCallableDescriptorForObject]

'MAVEN_STDLIB_ID_JRE7' @ [340:35] ==> public val MAVEN_STDLIB_ID_JRE7: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'MAVEN_STDLIB_ID' @ [341:17] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'!' @ [346:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasJreSpecificRuntime' @ [346:10] ==> public fun hasJreSpecificRuntime(version: String): Boolean defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'version' @ [346:32] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.versions.getDefaultJvmTarget[ValueParameterDescriptorImpl]

'sdk' @ [349:22] ==> value-parameter sdk: Sdk? defined in org.jetbrains.kotlin.idea.versions.getDefaultJvmTarget[ValueParameterDescriptorImpl]

'let' @ [349:27] ==> @InlineOnly public inline fun <T, R> Sdk.let(block: (Sdk) -> JavaSdkVersion?): JavaSdkVersion? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Sdk
    <R> -> JavaSdkVersion?

'getInstance' @ [349:41] ==> public open fun getInstance(): (JavaSdk..JavaSdk?) defined in com.intellij.openapi.projectRoots.JavaSdk[JavaMethodDescriptor]

'getVersion' @ [349:55] ==> @Nullable public abstract fun getVersion(@NotNull p0: Sdk): JavaSdkVersion? defined in com.intellij.openapi.projectRoots.JavaSdk[JavaMethodDescriptor]

'it' @ [349:66] ==> value-parameter it: Sdk defined in org.jetbrains.kotlin.idea.versions.getDefaultJvmTarget.<anonymous>[ValueParameterDescriptorImpl]

'sdkVersion' @ [350:9] ==> val sdkVersion: JavaSdkVersion? defined in org.jetbrains.kotlin.idea.versions.getDefaultJvmTarget[LocalVariableDescriptor]

'sdkVersion' @ [350:31] ==> val sdkVersion: JavaSdkVersion? defined in org.jetbrains.kotlin.idea.versions.getDefaultJvmTarget[LocalVariableDescriptor]

'isAtLeast' @ [350:42] ==> public open fun isAtLeast(@NotNull p0: JavaSdkVersion): Boolean defined in com.intellij.openapi.projectRoots.JavaSdkVersion[JavaMethodDescriptor]

'JDK_1_8' @ [350:67] ==> enum entry JDK_1_8 defined in com.intellij.openapi.projectRoots.JavaSdkVersion[FakeCallableDescriptorForObject]

'JvmTarget' @ [351:16] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_8' @ [351:26] ==> enum entry JVM_1_8 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'>=' @ [357:9] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'compare' @ [357:31] ==> public open fun compare(p0: (String..String?), p1: (String..String?)): Int defined in com.intellij.util.text.VersionComparatorUtil[JavaMethodDescriptor]

'version' @ [357:39] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.versions.hasJreSpecificRuntime[ValueParameterDescriptorImpl]

'isSnapshot' @ [358:9] ==> public fun isSnapshot(version: String): Boolean defined in org.jetbrains.kotlin.idea.configuration in file ConfigureKotlinInProjectUtils.kt[SimpleFunctionDescriptorImpl]

'version' @ [358:20] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.versions.hasJreSpecificRuntime[ValueParameterDescriptorImpl]

'version' @ [359:9] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.versions.hasJreSpecificRuntime[ValueParameterDescriptorImpl]

'getInstance' @ [367:18] ==> @NotNull public open fun getInstance(@NotNull @NonNls p0: String): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

