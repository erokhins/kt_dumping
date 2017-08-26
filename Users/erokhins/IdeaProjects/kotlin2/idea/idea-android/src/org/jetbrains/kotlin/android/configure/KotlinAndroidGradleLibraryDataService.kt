'AbstractProjectDataService<JavaModuleModel, Void>' @ [33:47] ==> public constructor AbstractProjectDataService<E : (Any..Any?), I : (Any..Any?)>() defined in com.intellij.openapi.externalSystem.service.project.manage.AbstractProjectDataService[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JavaModuleModel
    <I : (Any..Any?)> -> Void

'JAVA_MODULE_MODEL' @ [34:58] ==> @NotNull public final val JAVA_MODULE_MODEL: Key<(JavaModuleModel..JavaModuleModel?)> defined in com.android.tools.idea.gradle.project.sync.idea.data.service.AndroidProjectKeys[JavaPropertyDescriptor]

'toImport' @ [42:26] ==> value-parameter toImport: MutableCollection<DataNode<JavaModuleModel>> defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[ValueParameterDescriptorImpl]

'detectPlatformByPlugin' @ [43:37] ==> public fun detectPlatformByPlugin(moduleNode: DataNode<ModuleData>): TargetPlatformKind<*>? defined in org.jetbrains.kotlin.idea.configuration[SimpleFunctionDescriptorImpl]

'dataNode' @ [43:60] ==> val dataNode: DataNode<JavaModuleModel> defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'parent' @ [43:69] ==> public final val <T : (Any..Any?)> DataNode<JavaModuleModel>.parent: DataNode<*>?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaModuleModel

'libraryKind' @ [43:102] ==> public val TargetPlatformKind<*>.libraryKind: PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.framework in file JSLibraryType.kt[PropertyDescriptorImpl]

'targetLibraryKind' @ [44:17] ==> val targetLibraryKind: PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'dataNode' @ [45:29] ==> val dataNode: DataNode<JavaModuleModel> defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'data' @ [45:38] ==> public final val <T : (Any..Any?)> DataNode<JavaModuleModel>.data: JavaModuleModel[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaModuleModel

'jarLibraryDependencies' @ [45:43] ==> public final val JavaModuleModel.jarLibraryDependencies: (MutableCollection<(JarLibraryDependency..JarLibraryDependency?)>..Collection<(JarLibraryDependency..JarLibraryDependency?)>)[MyPropertyDescriptor]

'modelsProvider' @ [46:35] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[ValueParameterDescriptorImpl]

'getLibraryByName' @ [46:50] ==> @Nullable public abstract fun getLibraryByName(p0: (String..String?)): Library? defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'dep' @ [46:67] ==> val dep: (JarLibraryDependency..JarLibraryDependency?) defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'name' @ [46:71] ==> public final val JarLibraryDependency.name: String[MyPropertyDescriptor]

'library' @ [47:25] ==> val library: LibraryEx defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'kind' @ [47:33] ==> public final val LibraryEx.kind: PersistentLibraryKind<*>?[MyPropertyDescriptor]

'modelsProvider' @ [48:37] ==> value-parameter modelsProvider: IdeModifiableModelsProvider defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[ValueParameterDescriptorImpl]

'getModifiableLibraryModel' @ [48:52] ==> public abstract fun getModifiableLibraryModel(p0: (Library..Library?)): (Library.ModifiableModel..Library.ModifiableModel?) defined in com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider[JavaMethodDescriptor]

'library' @ [48:78] ==> val library: LibraryEx defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'detectLibraryKind' @ [49:25] ==> public fun detectLibraryKind(roots: Array<VirtualFile>): PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.framework[DeserializedSimpleFunctionDescriptor]

'model' @ [49:43] ==> val model: LibraryEx.ModifiableModelEx defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'getFiles' @ [49:49] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.impl.libraries.LibraryEx.ModifiableModelEx[JavaMethodDescriptor]

'CLASSES' @ [49:72] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'let' @ [49:83] ==> @InlineOnly public inline fun <T, R> PersistentLibraryKind<out raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)>.let(block: (PersistentLibraryKind<out raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PersistentLibraryKind<out raw (com.intellij.openapi.roots.libraries.LibraryProperties<(kotlin.Any..kotlin.Any?)>..com.intellij.openapi.roots.libraries.LibraryProperties<*>?)>
    <R> -> Unit

'model' @ [49:89] ==> val model: LibraryEx.ModifiableModelEx defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess[LocalVariableDescriptor]

'kind' @ [49:95] ==> public final var LibraryEx.ModifiableModelEx.kind: (PersistentLibraryKind<*>..PersistentLibraryKind<*>?)[MyPropertyDescriptor]

'it' @ [49:102] ==> value-parameter it: PersistentLibraryKind<out raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)> defined in org.jetbrains.kotlin.android.configure.KotlinAndroidGradleLibraryDataService.postProcess.<anonymous>[ValueParameterDescriptorImpl]

