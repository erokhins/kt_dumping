'runWriteAction' @ [39:12] ==> public fun <T> runWriteAction(action: () -> (Library..Library?)): (Library..Library?) defined in org.jetbrains.kotlin.test.testFramework[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.libraries.Library..com.intellij.openapi.roots.libraries.Library?)

'ProjectLibraryTable' @ [40:31] ==> public companion object defined in com.intellij.openapi.roots.impl.libraries.ProjectLibraryTable[FakeCallableDescriptorForObject]

'getInstance' @ [40:51] ==> @JvmStatic public final fun getInstance(project: Project): LibraryTable defined in com.intellij.openapi.roots.impl.libraries.ProjectLibraryTable.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [40:63] ==> public final val PlatformTestCase.project: (Project..Project?)[MyPropertyDescriptor]

'modifiableModel' @ [40:72] ==> public final val LibraryTable.modifiableModel: LibraryTable.ModifiableModel[MyPropertyDescriptor]

'modifiableModel' @ [42:13] ==> val modifiableModel: LibraryTable.ModifiableModel defined in org.jetbrains.kotlin.test.util.projectLibrary.<anonymous>[LocalVariableDescriptor]

'createLibrary' @ [42:29] ==> public abstract fun createLibrary(p0: (String..String?), @Nullable p1: raw (PersistentLibraryKind<(LibraryProperties<*>..LibraryProperties<*>?)>?..PersistentLibraryKind<out (LibraryProperties<*>..LibraryProperties<*>?)>?)): (Library..Library?) defined in com.intellij.openapi.roots.libraries.LibraryTable.ModifiableModel[JavaMethodDescriptor]

'libraryName' @ [42:43] ==> value-parameter libraryName: String = ... defined in org.jetbrains.kotlin.test.util.projectLibrary[ValueParameterDescriptorImpl]

'kind' @ [42:56] ==> value-parameter kind: PersistentLibraryKind<*>? = ... defined in org.jetbrains.kotlin.test.util.projectLibrary[ValueParameterDescriptorImpl]

'modifiableModel' @ [44:13] ==> val modifiableModel: LibraryTable.ModifiableModel defined in org.jetbrains.kotlin.test.util.projectLibrary.<anonymous>[LocalVariableDescriptor]

'commit' @ [44:29] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.roots.libraries.LibraryTable.ModifiableModel[JavaMethodDescriptor]

'with' @ [46:9] ==> @InlineOnly public inline fun <T, R> with(receiver: Library.ModifiableModel, block: (Library.ModifiableModel).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModifiableModel
    <R> -> Unit

'library' @ [46:15] ==> val library: (Library..Library?) defined in org.jetbrains.kotlin.test.util.projectLibrary.<anonymous>[LocalVariableDescriptor]

'modifiableModel' @ [46:23] ==> public final val Library.modifiableModel: Library.ModifiableModel[MyPropertyDescriptor]

'classesRoot' @ [47:13] ==> value-parameter classesRoot: VirtualFile? = ... defined in org.jetbrains.kotlin.test.util.projectLibrary[ValueParameterDescriptorImpl]

'let' @ [47:26] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Unit

'addRoot' @ [47:32] ==> public abstract fun addRoot(@NotNull p0: VirtualFile, @NotNull p1: OrderRootType): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'it' @ [47:40] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.test.util.projectLibrary.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'CLASSES' @ [47:58] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'sourcesRoot' @ [48:13] ==> value-parameter sourcesRoot: VirtualFile? = ... defined in org.jetbrains.kotlin.test.util.projectLibrary[ValueParameterDescriptorImpl]

'let' @ [48:26] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Unit

'addRoot' @ [48:32] ==> public abstract fun addRoot(@NotNull p0: VirtualFile, @NotNull p1: OrderRootType): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'it' @ [48:40] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.test.util.projectLibrary.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'SOURCES' @ [48:58] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'commit' @ [49:13] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'library' @ [51:9] ==> val library: (Library..Library?) defined in org.jetbrains.kotlin.test.util.projectLibrary.<anonymous>[LocalVariableDescriptor]

'!!' @ [55:26] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: VirtualFile?): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> VirtualFile

'getJarRootForLocalFile' @ [55:46] ==> @Nullable public open fun getJarRootForLocalFile(@NotNull p0: VirtualFile): VirtualFile? defined in com.intellij.openapi.vfs.StandardFileSystems[JavaMethodDescriptor]

'!!' @ [55:69] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: VirtualFile?): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> VirtualFile

'getInstance' @ [55:85] ==> public open fun getInstance(): (LocalFileSystem..LocalFileSystem?) defined in com.intellij.openapi.vfs.LocalFileSystem[JavaMethodDescriptor]

'findFileByIoFile' @ [55:99] ==> @Nullable public abstract fun findFileByIoFile(@NotNull p0: File): VirtualFile? defined in com.intellij.openapi.vfs.LocalFileSystem[JavaMethodDescriptor]

'this' @ [55:116] ==> <this> defined in org.jetbrains.kotlin.test.util.jarRoot[ReceiverParameterDescriptorImpl]

'COMPILE' @ [59:60] ==> enum entry COMPILE defined in com.intellij.openapi.roots.DependencyScope[FakeCallableDescriptorForObject]

'addDependency' @ [61:32] ==> public open fun addDependency(@NotNull p0: Module, @NotNull p1: Library, @NotNull p2: DependencyScope, p3: Boolean): Unit defined in com.intellij.openapi.roots.ModuleRootModificationUtil[JavaMethodDescriptor]

'this' @ [61:46] ==> <this> defined in org.jetbrains.kotlin.test.util.addDependency[ReceiverParameterDescriptorImpl]

'library' @ [61:52] ==> value-parameter library: Library defined in org.jetbrains.kotlin.test.util.addDependency[ValueParameterDescriptorImpl]

'dependencyScope' @ [61:61] ==> value-parameter dependencyScope: DependencyScope = ... defined in org.jetbrains.kotlin.test.util.addDependency[ValueParameterDescriptorImpl]

'exported' @ [61:78] ==> value-parameter exported: Boolean = ... defined in org.jetbrains.kotlin.test.util.addDependency[ValueParameterDescriptorImpl]

