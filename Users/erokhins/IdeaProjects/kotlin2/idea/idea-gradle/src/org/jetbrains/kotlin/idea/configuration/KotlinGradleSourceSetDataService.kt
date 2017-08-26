'ProjectExtensionDescriptor<GradleProjectImportHandler>' @ [50:24] ==> public constructor ProjectExtensionDescriptor<T>(name: String, extensionClass: Class<GradleProjectImportHandler>) defined in org.jetbrains.kotlin.extensions.ProjectExtensionDescriptor[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> GradleProjectImportHandler

'GradleProjectImportHandler' @ [52:13] ==> public companion object : ProjectExtensionDescriptor<GradleProjectImportHandler> defined in org.jetbrains.kotlin.idea.configuration.GradleProjectImportHandler[FakeCallableDescriptorForObject]

'java' @ [52:47] ==> public val <T> KClass<GradleProjectImportHandler>.java: Class<GradleProjectImportHandler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> GradleProjectImportHandler

'AbstractProjectDataService<GradleSourceSetData, Void>' @ [59:42] ==> public constructor AbstractProjectDataService<E : (Any..Any?), I : (Any..Any?)>() defined in com.intellij.openapi.externalSystem.service.project.manage.AbstractProjectDataService[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> GradleSourceSetData
    <I : (Any..Any?)> -> Void

'KEY' @ [60:59] ==> @NotNull public final val KEY: Key<(GradleSourceSetData..GradleSourceSetData?)> defined in org.jetbrains.plugins.gradle.model.data.GradleSourceSetData[JavaPropertyDescriptor]

'toImport' @ [68:31] ==> value-parameter toImport: Collection<DataNode<GradleSourceSetData>> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[ValueParameterDescriptorImpl]

'sourceSetNode' @ [69:33] ==> val sourceSetNode: DataNode<GradleSourceSetData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[LocalVariableDescriptor]

'data' @ [69:47] ==> public final val <T : (Any..Any?)> DataNode<GradleSourceSetData>.data: GradleSourceSetData[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> GradleSourceSetData

'modelsProvider' @ [70:29] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[ValueParameterDescriptorImpl]

'findIdeModule' @ [70:44] ==> @Nullable public abstract fun findIdeModule(@NotNull p0: ModuleData): Module? defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'sourceSetData' @ [70:58] ==> val sourceSetData: GradleSourceSetData defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[LocalVariableDescriptor]

'?:' @ [72:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: DataNode<(ModuleData..ModuleData?)>?, right: DataNode<(ModuleData..ModuleData?)>): DataNode<(ModuleData..ModuleData?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> DataNode<(com.intellij.openapi.externalSystem.model.project.ModuleData..com.intellij.openapi.externalSystem.model.project.ModuleData?)>

'findParent' @ [72:52] ==> @Nullable public open fun <T : (Any..Any?)> findParent(@NotNull p0: DataNode<*>, @NotNull p1: Key<(ModuleData..ModuleData?)>): DataNode<(ModuleData..ModuleData?)>? defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.externalSystem.model.project.ModuleData..com.intellij.openapi.externalSystem.model.project.ModuleData?)

'sourceSetNode' @ [72:63] ==> val sourceSetNode: DataNode<GradleSourceSetData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[LocalVariableDescriptor]

'MODULE' @ [72:90] ==> @NotNull public final val MODULE: Key<(ModuleData..ModuleData?)> defined in com.intellij.openapi.externalSystem.model.ProjectKeys[JavaPropertyDescriptor]

'configureFacetByGradleModule' @ [73:31] ==> private fun configureFacetByGradleModule(moduleNode: DataNode<ModuleData>, sourceSetNode: DataNode<GradleSourceSetData>?, ideModule: Module, modelsProvider: IdeModifiableModelsProvider): KotlinFacet? defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[SimpleFunctionDescriptorImpl]

'moduleNode' @ [73:60] ==> val moduleNode: DataNode<(ModuleData..ModuleData?)> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[LocalVariableDescriptor]

'sourceSetNode' @ [73:72] ==> val sourceSetNode: DataNode<GradleSourceSetData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[LocalVariableDescriptor]

'ideModule' @ [73:87] ==> val ideModule: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[LocalVariableDescriptor]

'modelsProvider' @ [73:98] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[ValueParameterDescriptorImpl]

'GradleProjectImportHandler' @ [74:13] ==> public companion object : ProjectExtensionDescriptor<GradleProjectImportHandler> defined in org.jetbrains.kotlin.idea.configuration.GradleProjectImportHandler[FakeCallableDescriptorForObject]

'getInstances' @ [74:40] ==> public final fun getInstances(project: Project): List<GradleProjectImportHandler> defined in org.jetbrains.kotlin.idea.configuration.GradleProjectImportHandler.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [74:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[ValueParameterDescriptorImpl]

'forEach' @ [74:62] ==> @HidesMembers public inline fun <T> Iterable<GradleProjectImportHandler>.forEach(action: (GradleProjectImportHandler) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GradleProjectImportHandler

'it' @ [74:72] ==> value-parameter it: GradleProjectImportHandler defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess.<anonymous>[ValueParameterDescriptorImpl]

'importBySourceSet' @ [74:75] ==> public abstract fun importBySourceSet(facet: KotlinFacet, sourceSetNode: DataNode<GradleSourceSetData>): Unit defined in org.jetbrains.kotlin.idea.configuration.GradleProjectImportHandler[SimpleFunctionDescriptorImpl]

'kotlinFacet' @ [74:93] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[LocalVariableDescriptor]

'sourceSetNode' @ [74:106] ==> val sourceSetNode: DataNode<GradleSourceSetData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleSourceSetDataService.postProcess[LocalVariableDescriptor]

'AbstractProjectDataService<ModuleData, Void>' @ [79:40] ==> public constructor AbstractProjectDataService<E : (Any..Any?), I : (Any..Any?)>() defined in com.intellij.openapi.externalSystem.service.project.manage.AbstractProjectDataService[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ModuleData
    <I : (Any..Any?)> -> Void

'MODULE' @ [80:51] ==> @NotNull public final val MODULE: Key<(ModuleData..ModuleData?)> defined in com.intellij.openapi.externalSystem.model.ProjectKeys[JavaPropertyDescriptor]

'toImport' @ [88:28] ==> value-parameter toImport: MutableCollection<DataNode<ModuleData>> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[ValueParameterDescriptorImpl]

'getChildren' @ [90:39] ==> @NotNull public open fun <T : (Any..Any?)> getChildren(@NotNull p0: DataNode<*>, @NotNull p1: Key<(GradleSourceSetData..GradleSourceSetData?)>): (MutableCollection<(DataNode<(GradleSourceSetData..GradleSourceSetData?)>..DataNode<(GradleSourceSetData..GradleSourceSetData?)>?)>..Collection<(DataNode<(GradleSourceSetData..GradleSourceSetData?)>..DataNode<(GradleSourceSetData..GradleSourceSetData?)>?)>) defined in com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.plugins.gradle.model.data.GradleSourceSetData..org.jetbrains.plugins.gradle.model.data.GradleSourceSetData?)

'moduleNode' @ [90:51] ==> val moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[LocalVariableDescriptor]

'KEY' @ [90:83] ==> @NotNull public final val KEY: Key<(GradleSourceSetData..GradleSourceSetData?)> defined in org.jetbrains.plugins.gradle.model.data.GradleSourceSetData[JavaPropertyDescriptor]

'isNotEmpty' @ [90:88] ==> @InlineOnly public inline fun <T> Collection<(DataNode<(GradleSourceSetData..GradleSourceSetData?)>..DataNode<(GradleSourceSetData..GradleSourceSetData?)>?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.externalSystem.model.DataNode<(org.jetbrains.plugins.gradle.model.data.GradleSourceSetData..org.jetbrains.plugins.gradle.model.data.GradleSourceSetData?)>..com.intellij.openapi.externalSystem.model.DataNode<(org.jetbrains.plugins.gradle.model.data.GradleSourceSetData..org.jetbrains.plugins.gradle.model.data.GradleSourceSetData?)>?)

'moduleNode' @ [92:30] ==> val moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[LocalVariableDescriptor]

'data' @ [92:41] ==> public final val <T : (Any..Any?)> DataNode<ModuleData>.data: ModuleData[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ModuleData

'modelsProvider' @ [93:29] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[ValueParameterDescriptorImpl]

'findIdeModule' @ [93:44] ==> @Nullable public abstract fun findIdeModule(@NotNull p0: ModuleData): Module? defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'moduleData' @ [93:58] ==> val moduleData: ModuleData defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[LocalVariableDescriptor]

'configureFacetByGradleModule' @ [94:31] ==> private fun configureFacetByGradleModule(moduleNode: DataNode<ModuleData>, sourceSetNode: DataNode<GradleSourceSetData>?, ideModule: Module, modelsProvider: IdeModifiableModelsProvider): KotlinFacet? defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[SimpleFunctionDescriptorImpl]

'moduleNode' @ [94:60] ==> val moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[LocalVariableDescriptor]

'ideModule' @ [94:78] ==> val ideModule: Module defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[LocalVariableDescriptor]

'modelsProvider' @ [94:89] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[ValueParameterDescriptorImpl]

'GradleProjectImportHandler' @ [95:13] ==> public companion object : ProjectExtensionDescriptor<GradleProjectImportHandler> defined in org.jetbrains.kotlin.idea.configuration.GradleProjectImportHandler[FakeCallableDescriptorForObject]

'getInstances' @ [95:40] ==> public final fun getInstances(project: Project): List<GradleProjectImportHandler> defined in org.jetbrains.kotlin.idea.configuration.GradleProjectImportHandler.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [95:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[ValueParameterDescriptorImpl]

'forEach' @ [95:62] ==> @HidesMembers public inline fun <T> Iterable<GradleProjectImportHandler>.forEach(action: (GradleProjectImportHandler) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GradleProjectImportHandler

'it' @ [95:72] ==> value-parameter it: GradleProjectImportHandler defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess.<anonymous>[ValueParameterDescriptorImpl]

'importByModule' @ [95:75] ==> public abstract fun importByModule(facet: KotlinFacet, moduleNode: DataNode<ModuleData>): Unit defined in org.jetbrains.kotlin.idea.configuration.GradleProjectImportHandler[SimpleFunctionDescriptorImpl]

'kotlinFacet' @ [95:90] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[LocalVariableDescriptor]

'moduleNode' @ [95:103] ==> val moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleProjectDataService.postProcess[LocalVariableDescriptor]

'AbstractProjectDataService<LibraryData, Void>' @ [100:40] ==> public constructor AbstractProjectDataService<E : (Any..Any?), I : (Any..Any?)>() defined in com.intellij.openapi.externalSystem.service.project.manage.AbstractProjectDataService[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LibraryData
    <I : (Any..Any?)> -> Void

'LIBRARY' @ [101:51] ==> @NotNull public final val LIBRARY: Key<(LibraryData..LibraryData?)> defined in com.intellij.openapi.externalSystem.model.ProjectKeys[JavaPropertyDescriptor]

'toImport' @ [109:13] ==> value-parameter toImport: MutableCollection<DataNode<LibraryData>> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[ValueParameterDescriptorImpl]

'isEmpty' @ [109:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'toImport' @ [110:31] ==> value-parameter toImport: MutableCollection<DataNode<LibraryData>> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[ValueParameterDescriptorImpl]

'first' @ [110:40] ==> public fun <T> Iterable<DataNode<LibraryData>>.first(): DataNode<LibraryData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataNode<LibraryData>

'parent' @ [110:48] ==> public final val <T : (Any..Any?)> DataNode<LibraryData>.parent: DataNode<*>?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LibraryData

'projectDataNode' @ [111:31] ==> val projectDataNode: DataNode<ProjectData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'children' @ [111:47] ==> public final val <T : (Any..Any?)> DataNode<ProjectData>.children: (MutableCollection<(DataNode<*>..DataNode<*>?)>..Collection<(DataNode<*>..DataNode<*>?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ProjectData

'filter' @ [111:56] ==> public inline fun <T> Iterable<(DataNode<*>..DataNode<*>?)>.filter(predicate: ((DataNode<*>..DataNode<*>?)) -> Boolean): List<(DataNode<*>..DataNode<*>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.externalSystem.model.DataNode<*>..com.intellij.openapi.externalSystem.model.DataNode<*>?)

'it' @ [111:65] ==> value-parameter it: (DataNode<*>..DataNode<*>?) defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [111:68] ==> public final val <T : (Any..Any?)> DataNode<out (Any..Any?)>.data: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'moduleDataNodes' @ [112:13] ==> val moduleDataNodes: List<DataNode<ModuleData>> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'any' @ [112:29] ==> public inline fun <T> Iterable<DataNode<ModuleData>>.any(predicate: (DataNode<ModuleData>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataNode<ModuleData>

'detectPlatformByPlugin' @ [112:35] ==> public fun detectPlatformByPlugin(moduleNode: DataNode<ModuleData>): TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[SimpleFunctionDescriptorImpl]

'it' @ [112:58] ==> value-parameter it: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [112:63] ==> @InlineOnly @SinceKotlin public inline fun <T> TargetPlatformKind<*>.takeIf(predicate: (TargetPlatformKind<*>) -> Boolean): TargetPlatformKind<*>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>

'it' @ [112:72] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toImport' @ [113:37] ==> value-parameter toImport: MutableCollection<DataNode<LibraryData>> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[ValueParameterDescriptorImpl]

'modelsProvider' @ [114:34] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[ValueParameterDescriptorImpl]

'findIdeLibrary' @ [114:49] ==> @Nullable public abstract fun findIdeLibrary(@NotNull p0: LibraryData): Library? defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'libraryDataNode' @ [114:64] ==> val libraryDataNode: DataNode<LibraryData> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'data' @ [114:80] ==> public final val <T : (Any..Any?)> DataNode<LibraryData>.data: LibraryData[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LibraryData

'modelsProvider' @ [116:39] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[ValueParameterDescriptorImpl]

'getModifiableLibraryModel' @ [116:54] ==> public abstract fun getModifiableLibraryModel(p0: (Library..Library?)): (Library.ModifiableModel..Library.ModifiableModel?) defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'ideLibrary' @ [116:80] ==> val ideLibrary: Library defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'detectLibraryKind' @ [117:17] ==> public fun detectLibraryKind(roots: Array<VirtualFile>): PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.framework[DeserializedSimpleFunctionDescriptor]

'modifiableModel' @ [117:35] ==> val modifiableModel: LibraryEx.ModifiableModelEx defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'getFiles' @ [117:51] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.impl.libraries.LibraryEx.ModifiableModelEx[JavaMethodDescriptor]

'CLASSES' @ [117:74] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'let' @ [117:85] ==> @InlineOnly public inline fun <T, R> PersistentLibraryKind<*>.let(block: (PersistentLibraryKind<*>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PersistentLibraryKind<*>
    <R> -> Unit

'modifiableModel' @ [117:91] ==> val modifiableModel: LibraryEx.ModifiableModelEx defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'kind' @ [117:107] ==> public final var LibraryEx.ModifiableModelEx.kind: (PersistentLibraryKind<*>..PersistentLibraryKind<*>?)[MyPropertyDescriptor]

'it' @ [117:114] ==> value-parameter it: PersistentLibraryKind<*> defined in org.jetbrains.kotlin.idea.configuration.KotlinGradleLibraryDataService.postProcess.<anonymous>[ValueParameterDescriptorImpl]

'projectDataNode' @ [126:12] ==> value-parameter projectDataNode: DataNode<ProjectData> defined in org.jetbrains.kotlin.idea.configuration.findOwnerModule[ValueParameterDescriptorImpl]

'children' @ [126:28] ==> public final val <T : (Any..Any?)> DataNode<ProjectData>.children: (MutableCollection<(DataNode<*>..DataNode<*>?)>..Collection<(DataNode<*>..DataNode<*>?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ProjectData

'firstOrNull' @ [126:37] ==> public inline fun <T> Iterable<(DataNode<*>..DataNode<*>?)>.firstOrNull(predicate: ((DataNode<*>..DataNode<*>?)) -> Boolean): DataNode<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.externalSystem.model.DataNode<*>..com.intellij.openapi.externalSystem.model.DataNode<*>?)

'dataNode' @ [127:13] ==> value-parameter dataNode: (DataNode<*>..DataNode<*>?) defined in org.jetbrains.kotlin.idea.configuration.findOwnerModule.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [127:22] ==> public final val <T : (Any..Any?)> DataNode<out (Any..Any?)>.data: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'dataNode' @ [128:13] ==> value-parameter dataNode: (DataNode<*>..DataNode<*>?) defined in org.jetbrains.kotlin.idea.configuration.findOwnerModule.<anonymous>[ValueParameterDescriptorImpl]

'hasDependency' @ [128:22] ==> private fun DataNode<*>.hasDependency(libraryData: LibraryData): Boolean defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[SimpleFunctionDescriptorImpl]

'libraryData' @ [128:36] ==> value-parameter libraryData: LibraryData defined in org.jetbrains.kotlin.idea.configuration.findOwnerModule[ValueParameterDescriptorImpl]

'dataNode' @ [129:34] ==> value-parameter dataNode: (DataNode<*>..DataNode<*>?) defined in org.jetbrains.kotlin.idea.configuration.findOwnerModule.<anonymous>[ValueParameterDescriptorImpl]

'children' @ [129:43] ==> public final val <T : (Any..Any?)> DataNode<out (Any..Any?)>.children: (MutableCollection<(DataNode<*>..DataNode<*>?)>..Collection<(DataNode<*>..DataNode<*>?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'filter' @ [129:52] ==> public inline fun <T> Iterable<(DataNode<*>..DataNode<*>?)>.filter(predicate: ((DataNode<*>..DataNode<*>?)) -> Boolean): List<(DataNode<*>..DataNode<*>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.externalSystem.model.DataNode<*>..com.intellij.openapi.externalSystem.model.DataNode<*>?)

'it' @ [129:61] ==> value-parameter it: (DataNode<*>..DataNode<*>?) defined in org.jetbrains.kotlin.idea.configuration.findOwnerModule.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [129:64] ==> public final val <T : (Any..Any?)> DataNode<out (Any..Any?)>.data: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'sourceSetDataNodes' @ [130:9] ==> val sourceSetDataNodes: List<(DataNode<*>..DataNode<*>?)> defined in org.jetbrains.kotlin.idea.configuration.findOwnerModule.<anonymous>[LocalVariableDescriptor]

'any' @ [130:28] ==> public inline fun <T> Iterable<(DataNode<*>..DataNode<*>?)>.any(predicate: ((DataNode<*>..DataNode<*>?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.externalSystem.model.DataNode<*>..com.intellij.openapi.externalSystem.model.DataNode<*>?)

'it' @ [130:34] ==> value-parameter it: (DataNode<*>..DataNode<*>?) defined in org.jetbrains.kotlin.idea.configuration.findOwnerModule.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasDependency' @ [130:37] ==> private fun DataNode<*>.hasDependency(libraryData: LibraryData): Boolean defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[SimpleFunctionDescriptorImpl]

'libraryData' @ [130:51] ==> value-parameter libraryData: LibraryData defined in org.jetbrains.kotlin.idea.configuration.findOwnerModule[ValueParameterDescriptorImpl]

'children' @ [135:9] ==> public final val <T : (Any..Any?)> DataNode<out (Any..Any?)>.children: (MutableCollection<(DataNode<*>..DataNode<*>?)>..Collection<(DataNode<*>..DataNode<*>?)>)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'any' @ [135:18] ==> public inline fun <T> Iterable<(DataNode<*>..DataNode<*>?)>.any(predicate: ((DataNode<*>..DataNode<*>?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.externalSystem.model.DataNode<*>..com.intellij.openapi.externalSystem.model.DataNode<*>?)

'==' @ [136:13] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.externalSystem.model.project.LibraryData[JavaMethodDescriptor]

'it' @ [136:14] ==> value-parameter it: (DataNode<*>..DataNode<*>?) defined in org.jetbrains.kotlin.idea.configuration.hasDependency.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [136:17] ==> public final val <T : (Any..Any?)> DataNode<out (Any..Any?)>.data: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'target' @ [136:50] ==> public final val LibraryDependencyData.target: LibraryData[MyPropertyDescriptor]

'libraryData' @ [136:60] ==> value-parameter libraryData: LibraryData defined in org.jetbrains.kotlin.idea.configuration.hasDependency[ValueParameterDescriptorImpl]

'when (moduleNode.platformPluginId) {
        "kotlin-platform-jvm" -> TargetPlatformKind.Jvm[JvmTarget.JVM_1_6]
        "kotlin-platform-js" -> TargetPlatformKind.JavaScript
        "kotlin-platform-common" -> TargetPlatformKind.Common
        else -> null
    }' @ [140:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TargetPlatformKind<*>?, entry1: TargetPlatformKind<*>?, entry2: TargetPlatformKind<*>?, entry3: TargetPlatformKind<*>?): TargetPlatformKind<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TargetPlatformKind<*>?

'moduleNode' @ [140:18] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.detectPlatformByPlugin[ValueParameterDescriptorImpl]

'platformPluginId' @ [140:29] ==> public var DataNode<ModuleData>.platformPluginId: String? defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleProjectResolverExtension.kt[PropertyDescriptorImpl]

'TargetPlatformKind' @ [141:34] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Jvm' @ [141:53] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind.Jvm[FakeCallableDescriptorForObject]

'JVM_1_6' @ [141:67] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JavaScript' @ [142:52] ==> public object JavaScript : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Common' @ [143:56] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'mavenLibraryIdToPlatform' @ [149:29] ==> public val mavenLibraryIdToPlatform: Map<String, TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[PropertyDescriptorImpl]

'entries' @ [149:54] ==> public abstract val entries: Set<Map.Entry<String, TargetPlatformKind<*>>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'filter' @ [149:62] ==> public inline fun <T> Iterable<Map.Entry<String, TargetPlatformKind<*>>>.filter(predicate: (Map.Entry<String, TargetPlatformKind<*>>) -> Boolean): List<Map.Entry<String, TargetPlatformKind<*>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, TargetPlatformKind<*>>

'moduleNode' @ [149:71] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.detectPlatformByLibrary[ValueParameterDescriptorImpl]

'getResolvedKotlinStdlibVersionByModuleData' @ [149:82] ==> internal fun DataNode<*>.getResolvedKotlinStdlibVersionByModuleData(libraryIds: List<String>): String? defined in org.jetbrains.kotlin.idea.inspections.gradle in file DifferentStdlibGradleVersionInspection.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [149:125] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [149:132] ==> value-parameter it: Map.Entry<String, TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.configuration.detectPlatformByLibrary.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [149:135] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'map' @ [149:151] ==> public inline fun <T, R> Iterable<Map.Entry<String, TargetPlatformKind<*>>>.map(transform: (Map.Entry<String, TargetPlatformKind<*>>) -> TargetPlatformKind<*>): List<TargetPlatformKind<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, TargetPlatformKind<*>>
    <R> -> TargetPlatformKind<*>

'it' @ [149:157] ==> value-parameter it: Map.Entry<String, TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.configuration.detectPlatformByLibrary.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [149:160] ==> public abstract val value: TargetPlatformKind<*> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'distinct' @ [149:168] ==> public fun <T> Iterable<TargetPlatformKind<*>>.distinct(): List<TargetPlatformKind<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>

'detectedPlatforms' @ [150:12] ==> val detectedPlatforms: List<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.configuration.detectPlatformByLibrary[LocalVariableDescriptor]

'singleOrNull' @ [150:30] ==> public fun <T> List<TargetPlatformKind<*>>.singleOrNull(): TargetPlatformKind<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>

'detectedPlatforms' @ [150:48] ==> val detectedPlatforms: List<TargetPlatformKind<*>> defined in org.jetbrains.kotlin.idea.configuration.detectPlatformByLibrary[LocalVariableDescriptor]

'firstOrNull' @ [150:66] ==> public inline fun <T> Iterable<TargetPlatformKind<*>>.firstOrNull(predicate: (TargetPlatformKind<*>) -> Boolean): TargetPlatformKind<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetPlatformKind<*>

'it' @ [150:80] ==> value-parameter it: TargetPlatformKind<*> defined in org.jetbrains.kotlin.idea.configuration.detectPlatformByLibrary.<anonymous>[ValueParameterDescriptorImpl]

'Common' @ [150:105] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'!' @ [159:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'moduleNode' @ [159:10] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'isResolved' @ [159:21] ==> public var DataNode<ModuleData>.isResolved: (Boolean..Boolean?) defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleProjectResolverExtension.kt[PropertyDescriptorImpl]

'!' @ [161:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'moduleNode' @ [161:10] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'hasKotlinPlugin' @ [161:21] ==> public var DataNode<ModuleData>.hasKotlinPlugin: (Boolean..Boolean?) defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleProjectResolverExtension.kt[PropertyDescriptorImpl]

'modelsProvider' @ [162:26] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'getModifiableFacetModel' @ [162:41] ==> @NotNull public abstract fun getModifiableFacetModel(p0: (Module..Module?)): ModifiableFacetModel defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'ideModule' @ [162:65] ==> value-parameter ideModule: Module defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'facetModel' @ [163:21] ==> val facetModel: ModifiableFacetModel defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'getFacetByType' @ [163:32] ==> @Nullable public abstract fun <F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)> getFacetByType(p0: (FacetTypeId<(KotlinFacet..KotlinFacet?)>..FacetTypeId<(KotlinFacet..KotlinFacet?)>?)): KotlinFacet? defined in com.intellij.facet.ModifiableFacetModel[JavaMethodDescriptor]
Inferred types:
    <F : raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)> -> (org.jetbrains.kotlin.idea.facet.KotlinFacet..org.jetbrains.kotlin.idea.facet.KotlinFacet?)

'TYPE_ID' @ [163:63] ==> public final val TYPE_ID: FacetTypeId<KotlinFacet> defined in org.jetbrains.kotlin.idea.facet.KotlinFacetType.Companion[PropertyDescriptorImpl]

'facet' @ [164:13] ==> val facet: KotlinFacet? defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'facetModel' @ [165:13] ==> val facetModel: ModifiableFacetModel defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'removeFacet' @ [165:24] ==> public abstract fun removeFacet(p0: raw (Facet<(FacetConfiguration..FacetConfiguration?)>..Facet<*>?)): Unit defined in com.intellij.facet.ModifiableFacetModel[JavaMethodDescriptor]

'facet' @ [165:36] ==> val facet: KotlinFacet? defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'moduleNode' @ [170:27] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'findAll' @ [170:38] ==> public fun <T : Any> DataNode<*>.findAll(key: Key<(BuildScriptClasspathData..BuildScriptClasspathData?)>): List<NodeWithData<(BuildScriptClasspathData..BuildScriptClasspathData?)>> defined in org.jetbrains.kotlin.idea.inspections.gradle[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (org.jetbrains.plugins.gradle.model.data.BuildScriptClasspathData..org.jetbrains.plugins.gradle.model.data.BuildScriptClasspathData?)

'KEY' @ [170:71] ==> @NotNull public final val KEY: Key<(BuildScriptClasspathData..BuildScriptClasspathData?)> defined in org.jetbrains.plugins.gradle.model.data.BuildScriptClasspathData[JavaPropertyDescriptor]

'firstOrNull' @ [170:76] ==> public fun <T> List<NodeWithData<(BuildScriptClasspathData..BuildScriptClasspathData?)>>.firstOrNull(): NodeWithData<(BuildScriptClasspathData..BuildScriptClasspathData?)>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeWithData<(org.jetbrains.plugins.gradle.model.data.BuildScriptClasspathData..org.jetbrains.plugins.gradle.model.data.BuildScriptClasspathData?)>

'data' @ [170:91] ==> public final val data: (BuildScriptClasspathData..BuildScriptClasspathData?) defined in org.jetbrains.kotlin.idea.inspections.gradle.NodeWithData[PropertyDescriptorImpl]

'let' @ [170:97] ==> @InlineOnly public inline fun <T, R> BuildScriptClasspathData.let(block: (BuildScriptClasspathData) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BuildScriptClasspathData
    <R> -> String?

'findKotlinPluginVersion' @ [170:103] ==> internal fun findKotlinPluginVersion(classpathData: BuildScriptClasspathData): String? defined in org.jetbrains.kotlin.idea.inspections.gradle in file KotlinGradleInspectionVisitor.kt[SimpleFunctionDescriptorImpl]

'detectPlatformByPlugin' @ [172:24] ==> public fun detectPlatformByPlugin(moduleNode: DataNode<ModuleData>): TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[SimpleFunctionDescriptorImpl]

'moduleNode' @ [172:47] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'detectPlatformByLibrary' @ [172:62] ==> private fun detectPlatformByLibrary(moduleNode: DataNode<ModuleData>): TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[SimpleFunctionDescriptorImpl]

'moduleNode' @ [172:86] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'CoroutineSupport' @ [174:30] ==> public object CoroutineSupport defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'byCompilerArgument' @ [174:47] ==> public final fun byCompilerArgument(argument: String): LanguageFeature.State defined in org.jetbrains.kotlin.config.CoroutineSupport[DeserializedSimpleFunctionDescriptor]

'moduleNode' @ [175:13] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'coroutines' @ [175:24] ==> public var DataNode<ModuleData>.coroutines: String? defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleProjectResolverExtension.kt[PropertyDescriptorImpl]

'findKotlinCoroutinesProperty' @ [175:38] ==> private fun findKotlinCoroutinesProperty(project: Project): String defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[SimpleFunctionDescriptorImpl]

'ideModule' @ [175:67] ==> value-parameter ideModule: Module defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'project' @ [175:77] ==> public final val Module.project: Project[MyPropertyDescriptor]

'ideModule' @ [177:23] ==> value-parameter ideModule: Module defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'getOrCreateFacet' @ [177:33] ==> public fun Module.getOrCreateFacet(modelsProvider: IdeModifiableModelsProvider, useProjectSettings: Boolean, commitModel: Boolean = ...): KotlinFacet defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'modelsProvider' @ [177:50] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'kotlinFacet' @ [178:5] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'configureFacet' @ [178:17] ==> public fun KotlinFacet.configureFacet(compilerVersion: String, coroutineSupport: LanguageFeature.State, platformKind: TargetPlatformKind<*>?, modelsProvider: IdeModifiableModelsProvider): Unit defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'compilerVersion' @ [178:32] ==> val compilerVersion: String defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'coroutinesProperty' @ [178:49] ==> val coroutinesProperty: LanguageFeature.State defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'platformKind' @ [178:69] ==> val platformKind: TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'modelsProvider' @ [178:83] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'sourceSetNode' @ [180:25] ==> value-parameter sourceSetNode: DataNode<GradleSourceSetData>? defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'data' @ [180:40] ==> public final val <T : (Any..Any?)> DataNode<GradleSourceSetData>.data: GradleSourceSetData[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> GradleSourceSetData

'id' @ [180:46] ==> public final val GradleSourceSetData.id: String[MyPropertyDescriptor]

'let' @ [180:50] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [180:56] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule.<anonymous>[ValueParameterDescriptorImpl]

'substring' @ [180:59] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [180:69] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule.<anonymous>[ValueParameterDescriptorImpl]

'lastIndexOf' @ [180:72] ==> public fun CharSequence.lastIndexOf(char: Char, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'moduleNode' @ [182:20] ==> value-parameter moduleNode: DataNode<ModuleData> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'compilerArgumentsBySourceSet' @ [182:31] ==> public var DataNode<ModuleData>.compilerArgumentsBySourceSet: CompilerArgumentsBySourceSet? /* = Map<String, ArgsInfo>? */ defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleProjectResolverExtension.kt[PropertyDescriptorImpl]

'get' @ [182:61] ==> public abstract operator fun get(key: String): ArgsInfo? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'sourceSetName' @ [182:65] ==> val sourceSetName: String defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'argsInfo' @ [183:9] ==> val argsInfo: ArgsInfo? defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'argsInfo' @ [184:40] ==> val argsInfo: ArgsInfo? defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'currentArguments' @ [184:49] ==> public abstract val currentArguments: List<String> defined in org.jetbrains.kotlin.gradle.ArgsInfo[DeserializedPropertyDescriptor]

'argsInfo' @ [185:40] ==> val argsInfo: ArgsInfo? defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'defaultArguments' @ [185:49] ==> public abstract val defaultArguments: List<String> defined in org.jetbrains.kotlin.gradle.ArgsInfo[DeserializedPropertyDescriptor]

'argsInfo' @ [186:35] ==> val argsInfo: ArgsInfo? defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'dependencyClasspath' @ [186:44] ==> public abstract val dependencyClasspath: List<String> defined in org.jetbrains.kotlin.gradle.ArgsInfo[DeserializedPropertyDescriptor]

'map' @ [186:64] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (kotlin.String..kotlin.String?)

'toSystemIndependentName' @ [186:79] ==> @Contract public open fun toSystemIndependentName(@Nullable p0: String?): (String..String?) defined in com.intellij.util.PathUtil[JavaMethodDescriptor]

'it' @ [186:103] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule.<anonymous>[ValueParameterDescriptorImpl]

'currentCompilerArguments' @ [187:13] ==> val currentCompilerArguments: List<String> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'isNotEmpty' @ [187:38] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'parseCompilerArgumentsToFacet' @ [188:13] ==> public fun parseCompilerArgumentsToFacet(arguments: List<String>, defaultArguments: List<String>, kotlinFacet: KotlinFacet, modelsProvider: IdeModifiableModelsProvider): Unit defined in org.jetbrains.kotlin.idea.facet in file facetUtils.kt[SimpleFunctionDescriptorImpl]

'currentCompilerArguments' @ [188:43] ==> val currentCompilerArguments: List<String> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'defaultCompilerArguments' @ [188:69] ==> val defaultCompilerArguments: List<String> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'kotlinFacet' @ [188:95] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'modelsProvider' @ [188:108] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[ValueParameterDescriptorImpl]

'adjustClasspath' @ [190:9] ==> private fun adjustClasspath(kotlinFacet: KotlinFacet, dependencyClasspath: List<String>): Unit defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[SimpleFunctionDescriptorImpl]

'kotlinFacet' @ [190:25] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'dependencyClasspath' @ [190:38] ==> val dependencyClasspath: List<(String..String?)> defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'kotlinFacet' @ [193:12] ==> val kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.configuration.configureFacetByGradleModule[LocalVariableDescriptor]

'dependencyClasspath' @ [197:9] ==> value-parameter dependencyClasspath: List<String> defined in org.jetbrains.kotlin.idea.configuration.adjustClasspath[ValueParameterDescriptorImpl]

'isEmpty' @ [197:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'kotlinFacet' @ [198:21] ==> value-parameter kotlinFacet: KotlinFacet defined in org.jetbrains.kotlin.idea.configuration.adjustClasspath[ValueParameterDescriptorImpl]

'configuration' @ [198:33] ==> public final val KotlinFacet.configuration: KotlinFacetConfiguration[MyPropertyDescriptor]

'settings' @ [198:47] ==> public final var settings: KotlinFacetSettings defined in org.jetbrains.kotlin.idea.facet.KotlinFacetConfiguration[PropertyDescriptorImpl]

'compilerArguments' @ [198:56] ==> public final var compilerArguments: CommonCompilerArguments? defined in org.jetbrains.kotlin.config.KotlinFacetSettings[DeserializedPropertyDescriptor]

'arguments' @ [199:25] ==> val arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.configuration.adjustClasspath[LocalVariableDescriptor]

'classpath' @ [199:35] ==> @Argument public final var classpath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'split' @ [199:46] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparator' @ [199:57] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'emptyList' @ [199:75] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'fullClasspath' @ [200:9] ==> val fullClasspath: List<String> defined in org.jetbrains.kotlin.idea.configuration.adjustClasspath[LocalVariableDescriptor]

'isEmpty' @ [200:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'fullClasspath' @ [201:24] ==> val fullClasspath: List<String> defined in org.jetbrains.kotlin.idea.configuration.adjustClasspath[LocalVariableDescriptor]

'dependencyClasspath' @ [201:40] ==> value-parameter dependencyClasspath: List<String> defined in org.jetbrains.kotlin.idea.configuration.adjustClasspath[ValueParameterDescriptorImpl]

'arguments' @ [202:5] ==> val arguments: K2JVMCompilerArguments defined in org.jetbrains.kotlin.idea.configuration.adjustClasspath[LocalVariableDescriptor]

'classpath' @ [202:15] ==> @Argument public final var classpath: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'if (newClasspath.isNotEmpty()) newClasspath.joinToString(File.pathSeparator) else null' @ [202:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'newClasspath' @ [202:31] ==> val newClasspath: List<String> defined in org.jetbrains.kotlin.idea.configuration.adjustClasspath[LocalVariableDescriptor]

'isNotEmpty' @ [202:44] ==> @InlineOnly public inline fun <T> Collection<String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'newClasspath' @ [202:58] ==> val newClasspath: List<String> defined in org.jetbrains.kotlin.idea.configuration.adjustClasspath[LocalVariableDescriptor]

'joinToString' @ [202:71] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'pathSeparator' @ [202:89] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'listOf' @ [205:35] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'gradlePropertyFiles' @ [208:30] ==> private val gradlePropertyFiles: List<String> defined in org.jetbrains.kotlin.idea.configuration in file KotlinGradleSourceSetDataService.kt[PropertyDescriptorImpl]

'project' @ [209:28] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.configuration.findKotlinCoroutinesProperty[ValueParameterDescriptorImpl]

'baseDir' @ [209:36] ==> public final val Project.baseDir: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'findChild' @ [209:44] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'propertyFileName' @ [209:54] ==> val propertyFileName: String defined in org.jetbrains.kotlin.idea.configuration.findKotlinCoroutinesProperty[LocalVariableDescriptor]

'Properties' @ [210:26] ==> public constructor Properties() defined in java.util.Properties[JavaClassConstructorDescriptor]

'properties' @ [211:9] ==> val properties: Properties defined in org.jetbrains.kotlin.idea.configuration.findKotlinCoroutinesProperty[LocalVariableDescriptor]

'load' @ [211:20] ==> public open fun load(p0: (InputStream..InputStream?)): Unit defined in java.util.Properties[JavaMethodDescriptor]

'propertyFile' @ [211:25] ==> val propertyFile: VirtualFile defined in org.jetbrains.kotlin.idea.configuration.findKotlinCoroutinesProperty[LocalVariableDescriptor]

'inputStream' @ [211:38] ==> public final val VirtualFile.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'properties' @ [212:9] ==> val properties: Properties defined in org.jetbrains.kotlin.idea.configuration.findKotlinCoroutinesProperty[LocalVariableDescriptor]

'getProperty' @ [212:20] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.util.Properties[JavaMethodDescriptor]

'let' @ [212:54] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Nothing

'it' @ [212:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.configuration.findKotlinCoroutinesProperty.<anonymous>[ValueParameterDescriptorImpl]

'CoroutineSupport' @ [215:12] ==> public object CoroutineSupport defined in org.jetbrains.kotlin.config[FakeCallableDescriptorForObject]

'getCompilerArgument' @ [215:29] ==> public final fun getCompilerArgument(state: LanguageFeature.State): String defined in org.jetbrains.kotlin.config.CoroutineSupport[DeserializedSimpleFunctionDescriptor]

'defaultState' @ [215:76] ==> public final val defaultState: LanguageFeature.State defined in org.jetbrains.kotlin.config.LanguageFeature[DeserializedPropertyDescriptor]

