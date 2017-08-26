'ProjectExtensionDescriptor<MavenProjectImportHandler>' @ [55:24] ==> public constructor ProjectExtensionDescriptor<T>(name: String, extensionClass: Class<MavenProjectImportHandler>) defined in org.jetbrains.kotlin.extensions.ProjectExtensionDescriptor[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> MavenProjectImportHandler

'MavenProjectImportHandler' @ [57:13] ==> public companion object : ProjectExtensionDescriptor<MavenProjectImportHandler> defined in org.jetbrains.kotlin.idea.maven.MavenProjectImportHandler[FakeCallableDescriptorForObject]

'java' @ [57:46] ==> public val <T> KClass<MavenProjectImportHandler>.java: Class<MavenProjectImportHandler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MavenProjectImportHandler

'MavenImporter' @ [63:29] ==> public constructor MavenImporter(p0: (String..String?), p1: (String..String?)) defined in org.jetbrains.idea.maven.importing.MavenImporter[JavaClassConstructorDescriptor]

'KOTLIN_PLUGIN_GROUP_ID' @ [63:43] ==> public final val KOTLIN_PLUGIN_GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyDescriptorImpl]

'KOTLIN_PLUGIN_ARTIFACT_ID' @ [63:67] ==> public final val KOTLIN_PLUGIN_ARTIFACT_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyDescriptorImpl]

'changes' @ [83:13] ==> value-parameter changes: MavenProjectChanges defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.process[ValueParameterDescriptorImpl]

'plugins' @ [83:21] ==> public final var plugins: Boolean defined in org.jetbrains.idea.maven.project.MavenProjectChanges[JavaPropertyDescriptor]

'contributeSourceDirectories' @ [84:13] ==> private final fun contributeSourceDirectories(mavenProject: MavenProject, module: Module, rootModel: MavenRootModelAdapter): Unit defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[SimpleFunctionDescriptorImpl]

'mavenProject' @ [84:41] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.process[ValueParameterDescriptorImpl]

'module' @ [84:55] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.process[ValueParameterDescriptorImpl]

'rootModel' @ [84:63] ==> value-parameter rootModel: MavenRootModelAdapter defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.process[ValueParameterDescriptorImpl]

'super' @ [89:9] ==> <this> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[LazyClassReceiverParameterDescriptor]

'postProcess' @ [89:15] ==> public open fun postProcess(p0: (Module..Module?), p1: (MavenProject..MavenProject?), p2: (MavenProjectChanges..MavenProjectChanges?), p3: (IdeModifiableModelsProvider..IdeModifiableModelsProvider?)): Unit defined in org.jetbrains.idea.maven.importing.MavenImporter[JavaMethodDescriptor]

'module' @ [89:27] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'mavenProject' @ [89:35] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'changes' @ [89:49] ==> value-parameter changes: MavenProjectChanges defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'modifiableModelsProvider' @ [89:58] ==> value-parameter modifiableModelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'changes' @ [91:13] ==> value-parameter changes: MavenProjectChanges defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'dependencies' @ [91:21] ==> public final var dependencies: Boolean defined in org.jetbrains.idea.maven.project.MavenProjectChanges[JavaPropertyDescriptor]

'scheduleDownloadStdlibSources' @ [92:13] ==> private final fun scheduleDownloadStdlibSources(mavenProject: MavenProject, module: Module): Unit defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[SimpleFunctionDescriptorImpl]

'mavenProject' @ [92:43] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'module' @ [92:57] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'detectPlatformByExecutions' @ [94:37] ==> private final fun detectPlatformByExecutions(mavenProject: MavenProject): TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[SimpleFunctionDescriptorImpl]

'mavenProject' @ [94:64] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'libraryKind' @ [94:79] ==> public val TargetPlatformKind<*>.libraryKind: PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.framework in file JSLibraryType.kt[PropertyDescriptorImpl]

'targetLibraryKind' @ [95:17] ==> val targetLibraryKind: PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[LocalVariableDescriptor]

'modifiableModelsProvider' @ [96:17] ==> value-parameter modifiableModelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'getModifiableRootModel' @ [96:42] ==> @NotNull public abstract fun getModifiableRootModel(p0: (Module..Module?)): ModifiableRootModel defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'module' @ [96:65] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'orderEntries' @ [96:73] ==> @NotNull public abstract fun orderEntries(): OrderEnumerator defined in com.intellij.openapi.roots.ModifiableRootModel[JavaMethodDescriptor]

'forEachLibrary' @ [96:88] ==> public final fun forEachLibrary(@NotNull p0: ((Library..Library?)) -> Boolean): Unit defined in com.intellij.openapi.roots.OrderEnumerator[MyFunctionDescriptor]

'==' @ [97:25] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.roots.libraries.PersistentLibraryKind[DeserializedSimpleFunctionDescriptor]

'library' @ [97:26] ==> value-parameter library: (Library..Library?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [97:48] ==> public final val LibraryEx.kind: PersistentLibraryKind<*>?[MyPropertyDescriptor]

'modifiableModelsProvider' @ [98:37] ==> value-parameter modifiableModelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'getModifiableLibraryModel' @ [98:62] ==> public abstract fun getModifiableLibraryModel(p0: (Library..Library?)): (Library.ModifiableModel..Library.ModifiableModel?) defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'library' @ [98:88] ==> value-parameter library: (Library..Library?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess.<anonymous>[ValueParameterDescriptorImpl]

'detectLibraryKind' @ [99:25] ==> public fun detectLibraryKind(roots: Array<VirtualFile>): PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.framework[DeserializedSimpleFunctionDescriptor]

'model' @ [99:43] ==> val model: LibraryEx.ModifiableModelEx defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess.<anonymous>[LocalVariableDescriptor]

'getFiles' @ [99:49] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.impl.libraries.LibraryEx.ModifiableModelEx[JavaMethodDescriptor]

'CLASSES' @ [99:72] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'let' @ [99:83] ==> @InlineOnly public inline fun <T, R> PersistentLibraryKind<out raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)>.let(block: (PersistentLibraryKind<out raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PersistentLibraryKind<out raw (com.intellij.openapi.roots.libraries.LibraryProperties<(kotlin.Any..kotlin.Any?)>..com.intellij.openapi.roots.libraries.LibraryProperties<*>?)>
    <R> -> Unit

'model' @ [99:89] ==> val model: LibraryEx.ModifiableModelEx defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess.<anonymous>[LocalVariableDescriptor]

'kind' @ [99:95] ==> public final var LibraryEx.ModifiableModelEx.kind: (PersistentLibraryKind<*>..PersistentLibraryKind<*>?)[MyPropertyDescriptor]

'it' @ [99:102] ==> value-parameter it: PersistentLibraryKind<out raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'configureFacet' @ [106:9] ==> private final fun configureFacet(mavenProject: MavenProject, modifiableModelsProvider: IdeModifiableModelsProvider, module: Module): Unit defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[SimpleFunctionDescriptorImpl]

'mavenProject' @ [106:24] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'modifiableModelsProvider' @ [106:38] ==> value-parameter modifiableModelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'module' @ [106:64] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.postProcess[ValueParameterDescriptorImpl]

'mavenProject' @ [111:25] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[ValueParameterDescriptorImpl]

'dependencyArtifactIndex' @ [111:38] ==> public final val MavenProject.dependencyArtifactIndex: (MavenArtifactIndex..MavenArtifactIndex?)[MyPropertyDescriptor]

'data' @ [111:62] ==> public final val MavenArtifactIndex.data: (MutableMap<(String..String?), (MutableMap<(String..String?), (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>?)>..Map<(String..String?), (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>?)>?)>..Map<(String..String?), (MutableMap<(String..String?), (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>?)>..Map<(String..String?), (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>?)>?)>?)[MyPropertyDescriptor]

'KOTLIN_PLUGIN_GROUP_ID' @ [111:67] ==> public final val KOTLIN_PLUGIN_GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyDescriptorImpl]

'values' @ [111:92] ==> public abstract val values: MutableCollection<(MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'flatMap' @ [111:100] ==> public inline fun <T, R> Iterable<(MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>?)>.flatMap(transform: ((MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>?)) -> Iterable<(MavenArtifact..MavenArtifact?)>): List<(MavenArtifact..MavenArtifact?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableList<(org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)>..kotlin.collections.List<(org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)>?)
    <R> -> (org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)

'it' @ [111:110] ==> value-parameter it: (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [111:113] ==> public inline fun <T> Iterable<(MavenArtifact..MavenArtifact?)>.filter(predicate: ((MavenArtifact..MavenArtifact?)) -> Boolean): List<(MavenArtifact..MavenArtifact?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)

'it' @ [111:122] ==> value-parameter it: (MavenArtifact..MavenArtifact?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isResolved' @ [111:125] ==> public final val MavenArtifact.isResolved: Boolean[MyPropertyDescriptor]

'emptyList' @ [111:143] ==> public fun <T> emptyList(): List<(MavenArtifact..MavenArtifact?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)

'ArrayList' @ [113:38] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Library

'orderEntries' @ [114:25] ==> @NotNull public open fun orderEntries(@NotNull p0: Module): OrderEnumerator defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'module' @ [114:38] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[ValueParameterDescriptorImpl]

'forEachLibrary' @ [114:46] ==> public final fun forEachLibrary(@NotNull p0: ((Library..Library?)) -> Boolean): Unit defined in com.intellij.openapi.roots.OrderEnumerator[MyFunctionDescriptor]

'library' @ [115:17] ==> value-parameter library: (Library..Library?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources.<anonymous>[ValueParameterDescriptorImpl]

'modifiableModel' @ [115:25] ==> public final val Library.modifiableModel: Library.ModifiableModel[MyPropertyDescriptor]

'getFiles' @ [115:41] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'SOURCES' @ [115:64] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'isEmpty' @ [115:73] ==> @InlineOnly public inline fun <T> Array<out (VirtualFile..VirtualFile?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'librariesWithNoSources' @ [116:17] ==> val librariesWithNoSources: ArrayList<Library> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[LocalVariableDescriptor]

'add' @ [116:40] ==> public open fun add(element: Library): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'library' @ [116:44] ==> value-parameter library: (Library..Library?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources.<anonymous>[ValueParameterDescriptorImpl]

'librariesWithNoSources' @ [120:28] ==> val librariesWithNoSources: ArrayList<Library> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[LocalVariableDescriptor]

'mapTo' @ [120:51] ==> public inline fun <T, R, C : MutableCollection<in String?>> Iterable<Library>.mapTo(destination: HashSet<String?>, transform: (Library) -> String?): HashSet<String?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library
    <R> -> String?
    <C : MutableCollection<in R>> -> HashSet<String?>

'HashSet' @ [120:57] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String?

'it' @ [120:70] ==> value-parameter it: Library defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [120:73] ==> public final val Library.name: String?[MyPropertyDescriptor]

'artifacts' @ [121:30] ==> val artifacts: List<(MavenArtifact..MavenArtifact?)> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[LocalVariableDescriptor]

'filter' @ [121:40] ==> public inline fun <T> Iterable<(MavenArtifact..MavenArtifact?)>.filter(predicate: ((MavenArtifact..MavenArtifact?)) -> Boolean): List<(MavenArtifact..MavenArtifact?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)

'it' @ [121:49] ==> value-parameter it: (MavenArtifact..MavenArtifact?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources.<anonymous>[ValueParameterDescriptorImpl]

'libraryName' @ [121:52] ==> public final val MavenArtifact.libraryName: (String..String?)[MyPropertyDescriptor]

'libraryNames' @ [121:67] ==> val libraryNames: HashSet<String?> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[LocalVariableDescriptor]

'toBeDownloaded' @ [123:13] ==> val toBeDownloaded: List<(MavenArtifact..MavenArtifact?)> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[LocalVariableDescriptor]

'isNotEmpty' @ [123:28] ==> @InlineOnly public inline fun <T> Collection<(MavenArtifact..MavenArtifact?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)

'getInstance' @ [124:34] ==> public open fun getInstance(p0: (Project..Project?)): (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [124:46] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[ValueParameterDescriptorImpl]

'project' @ [124:53] ==> public final val Module.project: Project[MyPropertyDescriptor]

'scheduleArtifactsDownloading' @ [124:62] ==> public open fun scheduleArtifactsDownloading(p0: (MutableCollection<(MavenProject..MavenProject?)>..Collection<(MavenProject..MavenProject?)>?), @Nullable p1: (MutableCollection<(MavenArtifact..MavenArtifact?)>?..Collection<(MavenArtifact..MavenArtifact?)>?), p2: Boolean, p3: Boolean, @Nullable p4: AsyncResult<(MavenArtifactDownloader.DownloadResult..MavenArtifactDownloader.DownloadResult?)>?): Unit defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'listOf' @ [124:91] ==> public fun <T> listOf(element: MavenProject): List<MavenProject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenProject

'mavenProject' @ [124:98] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[ValueParameterDescriptorImpl]

'toBeDownloaded' @ [124:113] ==> val toBeDownloaded: List<(MavenArtifact..MavenArtifact?)> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.scheduleDownloadStdlibSources[LocalVariableDescriptor]

'AsyncResult' @ [124:142] ==> public constructor AsyncResult<T : (Any..Any?)>() defined in com.intellij.openapi.util.AsyncResult[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.idea.maven.project.MavenArtifactDownloader.DownloadResult..org.jetbrains.idea.maven.project.MavenArtifactDownloader.DownloadResult?)

'when (platform) {
            is TargetPlatformKind.Jvm -> K2JVMCompilerArguments()
            is TargetPlatformKind.JavaScript -> K2JSCompilerArguments()
            is TargetPlatformKind.Common -> K2MetadataCompilerArguments()
        }' @ [131:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CommonCompilerArguments, entry1: CommonCompilerArguments, entry2: CommonCompilerArguments): CommonCompilerArguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CommonCompilerArguments

'platform' @ [131:31] ==> value-parameter platform: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'K2JVMCompilerArguments' @ [132:42] ==> public constructor K2JVMCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedClassConstructorDescriptor]

'K2JSCompilerArguments' @ [133:49] ==> public constructor K2JSCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedClassConstructorDescriptor]

'K2MetadataCompilerArguments' @ [134:45] ==> public constructor K2MetadataCompilerArguments() defined in org.jetbrains.kotlin.cli.common.arguments.K2MetadataCompilerArguments[DeserializedClassConstructorDescriptor]

'arguments' @ [137:9] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'apiVersion' @ [137:19] ==> @GradleOption @Argument public final var apiVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [137:32] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [137:47] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [137:71] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'mavenProject' @ [137:79] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'properties' @ [137:92] ==> public final val MavenProject.properties: Properties[MyPropertyDescriptor]

'toString' @ [137:134] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'arguments' @ [138:9] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'languageVersion' @ [138:19] ==> @GradleOption @Argument public final var languageVersion: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [138:37] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [138:52] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [138:81] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'mavenProject' @ [138:89] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'properties' @ [138:102] ==> public final val MavenProject.properties: Properties[MyPropertyDescriptor]

'toString' @ [138:149] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'arguments' @ [139:9] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'multiPlatform' @ [139:19] ==> @Argument public final var multiPlatform: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [139:35] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [139:50] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [139:77] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [139:83] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toBoolean' @ [139:91] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arguments' @ [140:9] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'suppressWarnings' @ [140:19] ==> @GradleOption @Argument public final var suppressWarnings: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [140:38] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [140:53] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [140:73] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [140:79] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toBoolean' @ [140:87] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'configuration' @ [142:9] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [142:24] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [142:60] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [142:66] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'let' @ [142:74] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'arguments' @ [143:13] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'coroutinesState' @ [143:23] ==> @Argument public final var coroutinesState: String? defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'it' @ [143:41] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement.<anonymous>[ValueParameterDescriptorImpl]

'when (arguments) {
            is K2JVMCompilerArguments -> {
                arguments.classpath = configuration?.getChild("classpath")?.text
                arguments.jdkHome = configuration?.getChild("jdkHome")?.text
                arguments.jvmTarget = configuration?.getChild("jvmTarget")?.text ?: mavenProject.properties["kotlin.compiler.jvmTarget"]?.toString()
            }
            is K2JSCompilerArguments -> {
                arguments.sourceMap = configuration?.getChild("sourceMap")?.text?.trim()?.toBoolean() ?: false
                arguments.sourceMapPrefix = configuration?.getChild("sourceMapPrefix")?.text?.trim() ?: ""
                arguments.sourceMapEmbedSources = configuration?.getChild("sourceMapEmbedSources")?.text?.trim() ?: "inlining"
                arguments.outputFile = configuration?.getChild("outputFile")?.text
                arguments.metaInfo = configuration?.getChild("metaInfo")?.text?.trim()?.toBoolean() ?: false
                arguments.moduleKind = configuration?.getChild("moduleKind")?.text
                arguments.main = configuration?.getChild("main")?.text
            }
        }' @ [146:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'arguments' @ [146:15] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'arguments' @ [148:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'classpath' @ [148:27] ==> @Argument public final var classpath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [148:39] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [148:54] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [148:77] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'arguments' @ [149:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'jdkHome' @ [149:27] ==> @GradleOption @Argument public final var jdkHome: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [149:37] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [149:52] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [149:73] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'arguments' @ [150:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'jvmTarget' @ [150:27] ==> @GradleOption @Argument public final var jvmTarget: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [150:39] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [150:54] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [150:77] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'mavenProject' @ [150:85] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'properties' @ [150:98] ==> public final val MavenProject.properties: Properties[MyPropertyDescriptor]

'toString' @ [150:139] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'arguments' @ [153:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'sourceMap' @ [153:27] ==> @GradleOption @Argument public final var sourceMap: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [153:39] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [153:54] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [153:77] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [153:83] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toBoolean' @ [153:91] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arguments' @ [154:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'sourceMapPrefix' @ [154:27] ==> @GradleOption @Argument public final var sourceMapPrefix: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [154:45] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [154:60] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [154:89] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [154:95] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arguments' @ [155:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'sourceMapEmbedSources' @ [155:27] ==> @GradleOption @Argument public final var sourceMapEmbedSources: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [155:51] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [155:66] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [155:101] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [155:107] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arguments' @ [156:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'outputFile' @ [156:27] ==> @GradleOption @Argument public final var outputFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [156:40] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [156:55] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [156:79] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'arguments' @ [157:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'metaInfo' @ [157:27] ==> @GradleOption @Argument public final var metaInfo: Boolean defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [157:38] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [157:53] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [157:75] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'trim' @ [157:81] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toBoolean' @ [157:89] ==> @InlineOnly public inline fun String.toBoolean(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arguments' @ [158:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'moduleKind' @ [158:27] ==> @GradleOption @Argument public final var moduleKind: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [158:40] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [158:55] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [158:79] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'arguments' @ [159:17] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'main' @ [159:27] ==> @GradleOption @Argument public final var main: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[DeserializedPropertyDescriptor]

'configuration' @ [159:34] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [159:49] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'text' @ [159:67] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'configuration' @ [163:30] ==> value-parameter configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[ValueParameterDescriptorImpl]

'getChild' @ [163:45] ==> public open fun getChild(p0: (String..String?)): (Element..Element?) defined in org.jdom.Element[JavaMethodDescriptor]

'getChildren' @ [163:63] ==> public open fun getChildren(p0: (String..String?)): (MutableList<(Element..Element?)>..List<(Element..Element?)>?) defined in org.jdom.Element[JavaMethodDescriptor]

'mapNotNull' @ [163:83] ==> public inline fun <T, R : Any> Iterable<(Element..Element?)>.mapNotNull(transform: ((Element..Element?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jdom.Element..org.jdom.Element?)
    <R : Any> -> String

'it' @ [163:96] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [163:99] ==> public final var Element.text: (String..String?)[MyPropertyDescriptor]

'orEmpty' @ [163:106] ==> @InlineOnly public inline fun <T> List<String>?.orEmpty(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'parseCommandLineArguments' @ [164:9] ==> public fun <A : CommonToolArguments> parseCommandLineArguments(args: List<String>, result: CommonCompilerArguments): Unit defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A : CommonToolArguments> -> CommonCompilerArguments

'additionalArgs' @ [164:35] ==> val additionalArgs: List<String> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'arguments' @ [164:51] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'convertArgumentsToStringList' @ [166:30] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'arguments' @ [166:59] ==> val arguments: CommonCompilerArguments defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.getCompilerArgumentsByConfigurationElement[LocalVariableDescriptor]

'listOf' @ [169:36] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'PomFile' @ [169:43] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Compile' @ [169:63] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'PomFile' @ [170:43] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestCompile' @ [170:63] ==> public final val TestCompile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'PomFile' @ [171:43] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Js' @ [171:63] ==> public final val Js: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'PomFile' @ [172:43] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestJs' @ [172:63] ==> public final val TestJs: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'PomFile' @ [173:43] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'MetaData' @ [173:63] ==> public final val MetaData: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'mavenProject' @ [176:27] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'findPlugin' @ [176:40] ==> @Nullable public open fun findPlugin(@Nullable p0: String?, @Nullable p1: String?): MavenPlugin? defined in org.jetbrains.idea.maven.project.MavenProject[JavaMethodDescriptor]

'KotlinMavenConfigurator' @ [176:51] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'GROUP_ID' @ [176:75] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'KotlinMavenConfigurator' @ [176:85] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator[FakeCallableDescriptorForObject]

'MAVEN_PLUGIN_ID' @ [176:109] ==> public final val MAVEN_PLUGIN_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'mavenPlugin' @ [177:31] ==> val mavenPlugin: MavenPlugin defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'version' @ [177:43] ==> public final val MavenPlugin.version: (String..String?)[MyPropertyDescriptor]

'LanguageVersion' @ [177:54] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageVersion[FakeCallableDescriptorForObject]

'LATEST_STABLE' @ [177:70] ==> @field:JvmField public final val LATEST_STABLE: LanguageVersion defined in org.jetbrains.kotlin.config.LanguageVersion.Companion[DeserializedPropertyDescriptor]

'versionString' @ [177:84] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.LanguageVersion[DeserializedPropertyDescriptor]

'module' @ [178:27] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'getOrCreateFacet' @ [178:34] ==> public fun Module.getOrCreateFacet(modelsProvider: IdeModifiableModelsProvider, useProjectSettings: Boolean, commitModel: Boolean = ...): KotlinFacet defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'modifiableModelsProvider' @ [178:51] ==> value-parameter modifiableModelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'detectPlatformByExecutions' @ [179:24] ==> private final fun detectPlatformByExecutions(mavenProject: MavenProject): TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[SimpleFunctionDescriptorImpl]

'mavenProject' @ [179:51] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'detectPlatformByLibraries' @ [179:68] ==> private final fun detectPlatformByLibraries(mavenProject: MavenProject): TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[SimpleFunctionDescriptorImpl]

'mavenProject' @ [179:94] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'kotlinFacet' @ [181:9] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'configureFacet' @ [181:21] ==> public fun KotlinFacet.configureFacet(compilerVersion: String, coroutineSupport: LanguageFeature.State, platformKind: TargetPlatformKind<*>?, modelsProvider: IdeModifiableModelsProvider): Unit defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'compilerVersion' @ [181:36] ==> val compilerVersion: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'LanguageFeature' @ [181:53] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'defaultState' @ [181:80] ==> public final val defaultState: LanguageFeature.State defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

'platform' @ [181:94] ==> val platform: TargetPlatformKind<TargetPlatformVersion>? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'modifiableModelsProvider' @ [181:104] ==> value-parameter modifiableModelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'kotlinFacet' @ [182:34] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'configuration' @ [182:46] ==> public final val KotlinFacet.configuration: KotlinFacetConfiguration[MyPropertyDescriptor]

'settings' @ [182:60] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'targetPlatformKind' @ [182:69] ==> public final val targetPlatformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'mavenPlugin' @ [183:29] ==> val mavenPlugin: MavenPlugin defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'configurationElement' @ [183:41] ==> public final val MavenPlugin.configurationElement: Element?[MyPropertyDescriptor]

'getCompilerArgumentsByConfigurationElement' @ [184:31] ==> private final fun getCompilerArgumentsByConfigurationElement(mavenProject: MavenProject, configuration: Element?, platform: TargetPlatformKind<*>): List<String> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[SimpleFunctionDescriptorImpl]

'mavenProject' @ [184:74] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'configuration' @ [184:88] ==> val configuration: Element? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'configuredPlatform' @ [184:103] ==> val configuredPlatform: TargetPlatformKind<TargetPlatformVersion> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'mavenPlugin' @ [185:34] ==> val mavenPlugin: MavenPlugin defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'executions' @ [185:46] ==> public final val MavenPlugin.executions: (MutableList<(MavenPlugin.Execution..MavenPlugin.Execution?)>..List<(MavenPlugin.Execution..MavenPlugin.Execution?)>?)[MyPropertyDescriptor]

'filter' @ [185:58] ==> public inline fun <T> Iterable<(MavenPlugin.Execution..MavenPlugin.Execution?)>.filter(predicate: ((MavenPlugin.Execution..MavenPlugin.Execution?)) -> Boolean): List<(MavenPlugin.Execution..MavenPlugin.Execution?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?)

'it' @ [185:67] ==> value-parameter it: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [185:70] ==> public final val MavenPlugin.Execution.goals: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'any' @ [185:76] ==> public inline fun <T> Iterable<(String..String?)>.any(predicate: ((String..String?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'it' @ [185:82] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'compilationGoals' @ [185:88] ==> private final val compilationGoals: List<String> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[PropertyDescriptorImpl]

'firstOrNull' @ [186:44] ==> public fun <T> List<(MavenPlugin.Execution..MavenPlugin.Execution?)>.firstOrNull(): MavenPlugin.Execution? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?)

'configurationElement' @ [187:44] ==> public final val MavenPlugin.Execution.configurationElement: Element?[MyPropertyDescriptor]

'let' @ [187:66] ==> @InlineOnly public inline fun <T, R> Element.let(block: (Element) -> List<String>): List<String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Element
    <R> -> List<String>

'getCompilerArgumentsByConfigurationElement' @ [187:72] ==> private final fun getCompilerArgumentsByConfigurationElement(mavenProject: MavenProject, configuration: Element?, platform: TargetPlatformKind<*>): List<String> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[SimpleFunctionDescriptorImpl]

'mavenProject' @ [187:115] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'it' @ [187:129] ==> value-parameter it: Element defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet.<anonymous>[ValueParameterDescriptorImpl]

'configuredPlatform' @ [187:133] ==> val configuredPlatform: TargetPlatformKind<TargetPlatformVersion> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'parseCompilerArgumentsToFacet' @ [188:9] ==> public fun parseCompilerArgumentsToFacet(arguments: List<String>, defaultArguments: List<String>, kotlinFacet: KotlinFacet, modelsProvider: IdeModifiableModelsProvider): Unit defined in org.jetbrains.kotlin.idea.facet[SimpleFunctionDescriptorImpl]

'sharedArguments' @ [188:39] ==> val sharedArguments: List<String> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'emptyList' @ [188:56] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'kotlinFacet' @ [188:69] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'modifiableModelsProvider' @ [188:82] ==> value-parameter modifiableModelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'executionArguments' @ [189:13] ==> val executionArguments: List<String>? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'parseCompilerArgumentsToFacet' @ [190:13] ==> public fun parseCompilerArgumentsToFacet(arguments: List<String>, defaultArguments: List<String>, kotlinFacet: KotlinFacet, modelsProvider: IdeModifiableModelsProvider): Unit defined in org.jetbrains.kotlin.idea.facet[SimpleFunctionDescriptorImpl]

'executionArguments' @ [190:43] ==> val executionArguments: List<String>? defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'emptyList' @ [190:63] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'kotlinFacet' @ [190:76] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'modifiableModelsProvider' @ [190:89] ==> value-parameter modifiableModelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'MavenProjectImportHandler' @ [192:9] ==> public companion object : ProjectExtensionDescriptor<MavenProjectImportHandler> defined in org.jetbrains.kotlin.idea.maven.MavenProjectImportHandler[FakeCallableDescriptorForObject]

'getInstances' @ [192:35] ==> public final fun getInstances(project: Project): List<MavenProjectImportHandler> defined in org.jetbrains.kotlin.idea.maven.MavenProjectImportHandler.Companion[DeserializedSimpleFunctionDescriptor]

'module' @ [192:48] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'project' @ [192:55] ==> public final val Module.project: Project[MyPropertyDescriptor]

'forEach' @ [192:64] ==> @HidesMembers public inline fun <T> Iterable<MavenProjectImportHandler>.forEach(action: (MavenProjectImportHandler) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MavenProjectImportHandler

'invoke' @ [192:74] ==> public abstract operator fun invoke(facet: KotlinFacet, mavenProject: MavenProject): Unit defined in org.jetbrains.kotlin.idea.maven.MavenProjectImportHandler[SimpleFunctionDescriptorImpl]

'kotlinFacet' @ [192:77] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[LocalVariableDescriptor]

'mavenProject' @ [192:90] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.configureFacet[ValueParameterDescriptorImpl]

'mavenProject' @ [196:16] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.detectPlatformByExecutions[ValueParameterDescriptorImpl]

'findPlugin' @ [196:29] ==> @Nullable public open fun findPlugin(@Nullable p0: String?, @Nullable p1: String?): MavenPlugin? defined in org.jetbrains.idea.maven.project.MavenProject[JavaMethodDescriptor]

'KOTLIN_PLUGIN_GROUP_ID' @ [196:40] ==> public final val KOTLIN_PLUGIN_GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyDescriptorImpl]

'KOTLIN_PLUGIN_ARTIFACT_ID' @ [196:64] ==> public final val KOTLIN_PLUGIN_ARTIFACT_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyDescriptorImpl]

'executions' @ [196:92] ==> public final val MavenPlugin.executions: (MutableList<(MavenPlugin.Execution..MavenPlugin.Execution?)>..List<(MavenPlugin.Execution..MavenPlugin.Execution?)>?)[MyPropertyDescriptor]

'flatMap' @ [196:104] ==> public inline fun <T, R> Iterable<(MavenPlugin.Execution..MavenPlugin.Execution?)>.flatMap(transform: ((MavenPlugin.Execution..MavenPlugin.Execution?)) -> Iterable<(String..String?)>): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [196:114] ==> value-parameter it: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.detectPlatformByExecutions.<anonymous>[ValueParameterDescriptorImpl]

'goals' @ [196:117] ==> public final val MavenPlugin.Execution.goals: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [196:126] ==> public inline fun <T, R : Any> Iterable<(String..String?)>.mapNotNull(transform: ((String..String?)) -> TargetPlatformKind<TargetPlatformVersion>?): List<TargetPlatformKind<TargetPlatformVersion>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R : Any> -> TargetPlatformKind<TargetPlatformVersion>

'when (goal) {
                PomFile.KotlinGoals.Compile, PomFile.KotlinGoals.TestCompile -> TargetPlatformKind.Jvm[JvmTarget.JVM_1_6]
                PomFile.KotlinGoals.Js, PomFile.KotlinGoals.TestJs -> TargetPlatformKind.JavaScript
                PomFile.KotlinGoals.MetaData -> TargetPlatformKind.Common
                else -> null
            }' @ [197:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TargetPlatformKind<TargetPlatformVersion>?, entry1: TargetPlatformKind<TargetPlatformVersion>?, entry2: TargetPlatformKind<TargetPlatformVersion>?, entry3: TargetPlatformKind<TargetPlatformVersion>?): TargetPlatformKind<TargetPlatformVersion>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TargetPlatformKind<TargetPlatformVersion>?

'goal' @ [197:19] ==> value-parameter goal: (String..String?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.detectPlatformByExecutions.<anonymous>[ValueParameterDescriptorImpl]

'PomFile' @ [198:17] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Compile' @ [198:37] ==> public final val Compile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'PomFile' @ [198:46] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestCompile' @ [198:66] ==> public final val TestCompile: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'TargetPlatformKind' @ [198:81] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Jvm' @ [198:100] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[FakeCallableDescriptorForObject]

'JvmTarget' @ [198:104] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_6' @ [198:114] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'PomFile' @ [199:17] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'Js' @ [199:37] ==> public final val Js: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'PomFile' @ [199:41] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'TestJs' @ [199:61] ==> public final val TestJs: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'TargetPlatformKind' @ [199:71] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'JavaScript' @ [199:90] ==> public object JavaScript : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'PomFile' @ [200:17] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.PomFile[FakeCallableDescriptorForObject]

'MetaData' @ [200:37] ==> public final val MetaData: String defined in org.jetbrains.kotlin.idea.maven.PomFile.KotlinGoals[PropertyDescriptorImpl]

'TargetPlatformKind' @ [200:49] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Common' @ [200:68] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'distinct' @ [203:12] ==> public fun <T> Iterable<TargetPlatformKind<TargetPlatformVersion>>.distinct(): List<TargetPlatformKind<TargetPlatformVersion>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<TargetPlatformVersion>

'singleOrNull' @ [203:24] ==> public fun <T> List<TargetPlatformKind<TargetPlatformVersion>>.singleOrNull(): TargetPlatformKind<TargetPlatformVersion>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<TargetPlatformVersion>

'TargetPlatformKind' @ [207:16] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'ALL_PLATFORMS' @ [207:35] ==> public final val ALL_PLATFORMS: List<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.config.TargetPlatformKind.Companion[DeserializedPropertyDescriptor]

'firstOrNull' @ [207:49] ==> public inline fun <T> Iterable<TargetPlatformKind<*>>.firstOrNull(predicate: (TargetPlatformKind<*>) -> Boolean): TargetPlatformKind<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>

'it' @ [208:13] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.detectPlatformByLibraries.<anonymous>[ValueParameterDescriptorImpl]

'mavenLibraryIds' @ [208:16] ==> public val TargetPlatformKind<*>.mavenLibraryIds: List<String> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'any' @ [208:32] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mavenProject' @ [208:38] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.detectPlatformByLibraries[ValueParameterDescriptorImpl]

'findDependencies' @ [208:51] ==> @NotNull public open fun findDependencies(@Nullable p0: String?, @Nullable p1: String?): (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>) defined in org.jetbrains.idea.maven.project.MavenProject[JavaMethodDescriptor]

'KOTLIN_PLUGIN_GROUP_ID' @ [208:68] ==> public final val KOTLIN_PLUGIN_GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyDescriptorImpl]

'it' @ [208:92] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.detectPlatformByLibraries.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [208:96] ==> @InlineOnly public inline fun <T> Collection<(MavenArtifact..MavenArtifact?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)

'collectSourceDirectories' @ [229:27] ==> private final fun collectSourceDirectories(mavenProject: MavenProject): List<Pair<SourceType, String>> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[SimpleFunctionDescriptorImpl]

'mavenProject' @ [229:52] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[ValueParameterDescriptorImpl]

'directories' @ [231:25] ==> val directories: List<Pair<SourceType, String>> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'map' @ [231:37] ==> public inline fun <T, R> Iterable<Pair<SourceType, String>>.map(transform: (Pair<SourceType, String>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SourceType, String>
    <R> -> String

'it' @ [231:43] ==> value-parameter it: Pair<SourceType, String> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [231:46] ==> public final val second: String defined in kotlin.Pair[DeserializedPropertyDescriptor]

'toSet' @ [231:55] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'module' @ [232:21] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[ValueParameterDescriptorImpl]

'kotlinImporterComponent' @ [232:28] ==> private val Module.kotlinImporterComponent: KotlinImporterComponent defined in org.jetbrains.kotlin.idea.maven in file KotlinMavenImporter.kt[PropertyDescriptorImpl]

'component1' @ [234:15] ==> public final operator fun component1(): SourceType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [234:21] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'directories' @ [234:29] ==> val directories: List<Pair<SourceType, String>> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'rootModel' @ [235:17] ==> value-parameter rootModel: MavenRootModelAdapter defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[ValueParameterDescriptorImpl]

'getSourceFolder' @ [235:27] ==> @Nullable public open fun getSourceFolder(p0: (File..File?)): SourceFolder? defined in org.jetbrains.idea.maven.importing.MavenRootModelAdapter[JavaMethodDescriptor]

'File' @ [235:43] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'dir' @ [235:48] ==> val dir: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'when (type) {
                    SourceType.TEST -> JavaSourceRootType.TEST_SOURCE
                    SourceType.PROD -> JavaSourceRootType.SOURCE
                }' @ [236:59] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JpsModuleSourceRootType<*>, entry1: JpsModuleSourceRootType<*>): JpsModuleSourceRootType<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JpsModuleSourceRootType<*>

'type' @ [236:65] ==> val type: SourceType defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'TEST' @ [237:32] ==> enum entry TEST defined in org.jetbrains.kotlin.idea.maven.SourceType[FakeCallableDescriptorForObject]

'TEST_SOURCE' @ [237:59] ==> public final val TEST_SOURCE: (JavaSourceRootType..JavaSourceRootType?) defined in org.jetbrains.jps.model.java.JavaSourceRootType[JavaPropertyDescriptor]

'PROD' @ [238:32] ==> enum entry PROD defined in org.jetbrains.kotlin.idea.maven.SourceType[FakeCallableDescriptorForObject]

'SOURCE' @ [238:59] ==> public final val SOURCE: (JavaSourceRootType..JavaSourceRootType?) defined in org.jetbrains.jps.model.java.JavaSourceRootType[JavaPropertyDescriptor]

'rootModel' @ [241:17] ==> value-parameter rootModel: MavenRootModelAdapter defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[ValueParameterDescriptorImpl]

'addSourceFolder' @ [241:27] ==> public open fun <P : (JpsElement..JpsElement?)> addSourceFolder(p0: (String..String?), p1: (JpsModuleSourceRootType<out (JpsElement..JpsElement?)>..JpsModuleSourceRootType<out (JpsElement..JpsElement?)>?)): Unit defined in org.jetbrains.idea.maven.importing.MavenRootModelAdapter[JavaMethodDescriptor]
Inferred types:
    <P : (JpsElement..JpsElement?)> -> (org.jetbrains.jps.model.JpsElement..org.jetbrains.jps.model.JpsElement?)

'dir' @ [241:43] ==> val dir: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'jpsType' @ [241:48] ==> val jpsType: JpsModuleSourceRootType<*> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'state' @ [245:9] ==> val state: KotlinImporterComponent defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'addedSources' @ [245:15] ==> public final val addedSources: (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent[PropertyDescriptorImpl]

'filter' @ [245:28] ==> public inline fun <T> Iterable<(String..String?)>.filter(predicate: ((String..String?)) -> Boolean): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'it' @ [245:37] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories.<anonymous>[ValueParameterDescriptorImpl]

'toBeAdded' @ [245:44] ==> val toBeAdded: Set<String> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'forEach' @ [245:56] ==> @HidesMembers public inline fun <T> Iterable<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'rootModel' @ [246:13] ==> value-parameter rootModel: MavenRootModelAdapter defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[ValueParameterDescriptorImpl]

'unregisterAll' @ [246:23] ==> public open fun unregisterAll(p0: (String..String?), p1: Boolean, p2: Boolean): Unit defined in org.jetbrains.idea.maven.importing.MavenRootModelAdapter[JavaMethodDescriptor]

'it' @ [246:37] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [247:13] ==> val state: KotlinImporterComponent defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'addedSources' @ [247:19] ==> public final val addedSources: (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent[PropertyDescriptorImpl]

'remove' @ [247:32] ==> public abstract fun remove(element: (String..String?)): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [247:39] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories.<anonymous>[ValueParameterDescriptorImpl]

'state' @ [249:9] ==> val state: KotlinImporterComponent defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'addedSources' @ [249:15] ==> public final val addedSources: (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent[PropertyDescriptorImpl]

'addAll' @ [249:28] ==> public abstract fun addAll(elements: Collection<(String..String?)>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'toBeAdded' @ [249:35] ==> val toBeAdded: Set<String> defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.contributeSourceDirectories[LocalVariableDescriptor]

'mavenProject' @ [253:13] ==> value-parameter mavenProject: MavenProject defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.collectSourceDirectories[ValueParameterDescriptorImpl]

'plugins' @ [253:26] ==> public final val MavenProject.plugins: (MutableList<(MavenPlugin..MavenPlugin?)>..List<(MavenPlugin..MavenPlugin?)>)[MyPropertyDescriptor]

'filter' @ [253:34] ==> public inline fun <T> Iterable<(MavenPlugin..MavenPlugin?)>.filter(predicate: ((MavenPlugin..MavenPlugin?)) -> Boolean): List<(MavenPlugin..MavenPlugin?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin..org.jetbrains.idea.maven.model.MavenPlugin?)

'it' @ [253:43] ==> value-parameter it: (MavenPlugin..MavenPlugin?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.collectSourceDirectories.<anonymous>[ValueParameterDescriptorImpl]

'isKotlinPlugin' @ [253:46] ==> private fun MavenPlugin.isKotlinPlugin(): Boolean defined in org.jetbrains.kotlin.idea.maven[SimpleFunctionDescriptorImpl]

'flatMap' @ [253:65] ==> public inline fun <T, R> Iterable<(MavenPlugin..MavenPlugin?)>.flatMap(transform: ((MavenPlugin..MavenPlugin?)) -> Iterable<Pair<SourceType, String>>): List<Pair<SourceType, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin..org.jetbrains.idea.maven.model.MavenPlugin?)
    <R> -> Pair<SourceType, String>

'plugin' @ [254:17] ==> value-parameter plugin: (MavenPlugin..MavenPlugin?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.collectSourceDirectories.<anonymous>[ValueParameterDescriptorImpl]

'configurationElement' @ [254:24] ==> public final val MavenPlugin.configurationElement: Element?[MyPropertyDescriptor]

'sourceDirectories' @ [254:45] ==> private fun Element?.sourceDirectories(): List<String> defined in org.jetbrains.kotlin.idea.maven[SimpleFunctionDescriptorImpl]

'map' @ [254:65] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Pair<SourceType, String>): List<Pair<SourceType, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Pair<SourceType, String>

'to' @ [254:71] ==> public infix fun <A, B> SourceType.to(that: String): Pair<SourceType, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> SourceType
    <B> -> String

'PROD' @ [254:82] ==> enum entry PROD defined in org.jetbrains.kotlin.idea.maven.SourceType[FakeCallableDescriptorForObject]

'it' @ [254:90] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.collectSourceDirectories.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'plugin' @ [255:17] ==> value-parameter plugin: (MavenPlugin..MavenPlugin?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.collectSourceDirectories.<anonymous>[ValueParameterDescriptorImpl]

'executions' @ [255:24] ==> public final val MavenPlugin.executions: (MutableList<(MavenPlugin.Execution..MavenPlugin.Execution?)>..List<(MavenPlugin.Execution..MavenPlugin.Execution?)>?)[MyPropertyDescriptor]

'flatMap' @ [255:35] ==> public inline fun <T, R> Iterable<(MavenPlugin.Execution..MavenPlugin.Execution?)>.flatMap(transform: ((MavenPlugin.Execution..MavenPlugin.Execution?)) -> Iterable<Pair<SourceType, String>>): List<Pair<SourceType, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenPlugin.Execution..org.jetbrains.idea.maven.model.MavenPlugin.Execution?)
    <R> -> Pair<SourceType, String>

'execution' @ [255:58] ==> value-parameter execution: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.collectSourceDirectories.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'configurationElement' @ [255:68] ==> public final val MavenPlugin.Execution.configurationElement: Element?[MyPropertyDescriptor]

'sourceDirectories' @ [255:89] ==> private fun Element?.sourceDirectories(): List<String> defined in org.jetbrains.kotlin.idea.maven[SimpleFunctionDescriptorImpl]

'map' @ [255:109] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Pair<SourceType, String>): List<Pair<SourceType, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Pair<SourceType, String>

'execution' @ [255:115] ==> value-parameter execution: (MavenPlugin.Execution..MavenPlugin.Execution?) defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.collectSourceDirectories.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sourceType' @ [255:125] ==> private fun MavenPlugin.Execution.sourceType(): SourceType defined in org.jetbrains.kotlin.idea.maven[SimpleFunctionDescriptorImpl]

'it' @ [255:141] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.collectSourceDirectories.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'distinct' @ [256:15] ==> public fun <T> Iterable<Pair<SourceType, String>>.distinct(): List<Pair<SourceType, String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<SourceType, String>

'groupId' @ [259:44] ==> public final val MavenPlugin.groupId: (String..String?)[MyPropertyDescriptor]

'KotlinMavenImporter' @ [259:55] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[FakeCallableDescriptorForObject]

'KOTLIN_PLUGIN_GROUP_ID' @ [259:75] ==> public final val KOTLIN_PLUGIN_GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyDescriptorImpl]

'artifactId' @ [259:101] ==> public final val MavenPlugin.artifactId: (String..String?)[MyPropertyDescriptor]

'KotlinMavenImporter' @ [259:115] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[FakeCallableDescriptorForObject]

'KOTLIN_PLUGIN_ARTIFACT_ID' @ [259:135] ==> public final val KOTLIN_PLUGIN_ARTIFACT_ID: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyDescriptorImpl]

'this' @ [260:58] ==> <this> defined in org.jetbrains.kotlin.idea.maven.sourceDirectories[ReceiverParameterDescriptorImpl]

'getChildren' @ [260:64] ==> public open fun getChildren(p0: (String..String?)): (MutableList<(Element..Element?)>..List<(Element..Element?)>?) defined in org.jdom.Element[JavaMethodDescriptor]

'KotlinMavenImporter' @ [260:76] ==> public companion object defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter[FakeCallableDescriptorForObject]

'KOTLIN_PLUGIN_SOURCE_DIRS_CONFIG' @ [260:96] ==> public final val KOTLIN_PLUGIN_SOURCE_DIRS_CONFIG: String defined in org.jetbrains.kotlin.idea.maven.KotlinMavenImporter.Companion[PropertyDescriptorImpl]

'flatMap' @ [260:131] ==> public inline fun <T, R> Iterable<(Element..Element?)>.flatMap(transform: ((Element..Element?)) -> Iterable<(Element..Element?)>): List<(Element..Element?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jdom.Element..org.jdom.Element?)
    <R> -> (org.jdom.Element..org.jdom.Element?)

'it' @ [260:141] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.idea.maven.sourceDirectories.<anonymous>[ValueParameterDescriptorImpl]

'children' @ [260:144] ==> public final val Element.children: (MutableList<(Element..Element?)>..List<(Element..Element?)>?)[MyPropertyDescriptor]

'emptyList' @ [260:156] ==> public fun <T> emptyList(): List<(Element..Element?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jdom.Element..org.jdom.Element?)

'map' @ [260:171] ==> public inline fun <T, R> Iterable<(Element..Element?)>.map(transform: ((Element..Element?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jdom.Element..org.jdom.Element?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [260:177] ==> value-parameter it: (Element..Element?) defined in org.jetbrains.kotlin.idea.maven.sourceDirectories.<anonymous>[ValueParameterDescriptorImpl]

'textTrim' @ [260:180] ==> public final val Element.textTrim: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [260:194] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'goals' @ [262:9] ==> public final val MavenPlugin.Execution.goals: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'map' @ [262:15] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> SourceType): List<SourceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> SourceType

'if (isTestGoalName(it)) SourceType.TEST else SourceType.PROD' @ [262:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SourceType, elseBranch: SourceType): SourceType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SourceType

'isTestGoalName' @ [262:25] ==> private fun isTestGoalName(goalName: String): Boolean defined in org.jetbrains.kotlin.idea.maven[SimpleFunctionDescriptorImpl]

'it' @ [262:40] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.maven.sourceType.<anonymous>[ValueParameterDescriptorImpl]

'TEST' @ [262:56] ==> enum entry TEST defined in org.jetbrains.kotlin.idea.maven.SourceType[FakeCallableDescriptorForObject]

'PROD' @ [262:77] ==> enum entry PROD defined in org.jetbrains.kotlin.idea.maven.SourceType[FakeCallableDescriptorForObject]

'distinct' @ [263:18] ==> public fun <T> Iterable<SourceType>.distinct(): List<SourceType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceType

'singleOrNull' @ [264:18] ==> public fun <T> List<SourceType>.singleOrNull(): SourceType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SourceType

'PROD' @ [264:47] ==> enum entry PROD defined in org.jetbrains.kotlin.idea.maven.SourceType[FakeCallableDescriptorForObject]

'goalName' @ [266:48] ==> value-parameter goalName: String defined in org.jetbrains.kotlin.idea.maven.isTestGoalName[ValueParameterDescriptorImpl]

'startsWith' @ [266:57] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'State' @ [272:1] ==> public constructor State(name: String, storages: Array<Storage> = ..., reloadable: Boolean = ..., defaultStateAsResource: Boolean = ..., additionalExportFile: String = ..., presentableName: KClass<out (State.NameGetter..State.NameGetter?)> = ...) defined in com.intellij.openapi.components.State[JavaClassConstructorDescriptor]

'arrayOf' @ [273:19] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Storage): Array<Storage> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Storage

'Storage' @ [274:16] ==> public constructor Storage(value: String = ..., file: String = ..., deprecated: Boolean = ..., roamingType: RoamingType = ..., storageClass: KClass<out (StateStorage..StateStorage?)> = ..., stateSplitter: KClass<out (StateSplitter..StateSplitter?)> = ..., scheme: StorageScheme = ..., id: String = ..., exclusive: Boolean = ...) defined in com.intellij.openapi.components.Storage[JavaClassConstructorDescriptor]

'MODULE_FILE' @ [274:63] ==> @NonNls @NotNull public const final val MODULE_FILE: String defined in com.intellij.openapi.components.StoragePathMacros[JavaPropertyDescriptor]

'ArrayList' @ [277:49] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'synchronizedSet' @ [279:36] ==> public open fun <T : (Any..Any?)> synchronizedSet(p0: (MutableSet<(String..String?)>..Set<(String..String?)>?)): (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String

'HashSet' @ [279:52] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'addedSources' @ [282:9] ==> public final val addedSources: (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent[PropertyDescriptorImpl]

'clear' @ [282:22] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'state' @ [283:13] ==> value-parameter state: KotlinImporterComponent.State? defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent.loadState[ValueParameterDescriptorImpl]

'addedSources' @ [284:13] ==> public final val addedSources: (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent[PropertyDescriptorImpl]

'addAll' @ [284:26] ==> public abstract fun addAll(elements: Collection<(String..String?)>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'state' @ [284:33] ==> value-parameter state: KotlinImporterComponent.State? defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent.loadState[ValueParameterDescriptorImpl]

'directories' @ [284:39] ==> public final var directories: List<String> defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent.State[PropertyDescriptorImpl]

'State' @ [289:16] ==> public constructor State(directories: List<String> = ...) defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent.State[ClassConstructorDescriptorImpl]

'addedSources' @ [289:22] ==> public final val addedSources: (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent[PropertyDescriptorImpl]

'sorted' @ [289:35] ==> public fun <T : Comparable<(String..String?)>> Iterable<(String..String?)>.sorted(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> (kotlin.String..kotlin.String?)

'getComponent' @ [294:13] ==> public abstract fun <T : (Any..Any?)> getComponent(@NotNull p0: Class<(KotlinImporterComponent..KotlinImporterComponent?)>): (KotlinImporterComponent..KotlinImporterComponent?) defined in com.intellij.openapi.module.Module[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinImporterComponent

'KotlinImporterComponent' @ [294:26] ==> public constructor KotlinImporterComponent() defined in org.jetbrains.kotlin.idea.maven.KotlinImporterComponent[ClassConstructorDescriptorImpl]

'java' @ [294:57] ==> public val <T> KClass<KotlinImporterComponent>.java: Class<KotlinImporterComponent> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinImporterComponent

'IllegalStateException' @ [294:72] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

