'getInstance' @ [30:42] ==> public open fun getInstance(@NotNull p0: Project): (ModuleManager..ModuleManager?) defined in com.intellij.openapi.module.ModuleManager[JavaMethodDescriptor]

'this' @ [30:54] ==> <this> defined in org.jetbrains.kotlin.idea.util.projectStructure.allModules[ReceiverParameterDescriptorImpl]

'modules' @ [30:60] ==> public final val ModuleManager.modules: (Array<(Module..Module?)>..Array<out (Module..Module?)>)[MyPropertyDescriptor]

'toList' @ [30:68] ==> public fun <T> Array<out (Module..Module?)>.toList(): List<(Module..Module?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'orderEntries' @ [32:85] ==> @NotNull public open fun orderEntries(@NotNull p0: Module): OrderEnumerator defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'this' @ [32:98] ==> <this> defined in org.jetbrains.kotlin.idea.util.projectStructure.findLibrary[ReceiverParameterDescriptorImpl]

'findLibrary' @ [32:104] ==> public fun OrderEnumerator.findLibrary(predicate: (Library) -> Boolean): Library? defined in org.jetbrains.kotlin.idea.util.projectStructure in file projectStructureUtil.kt[SimpleFunctionDescriptorImpl]

'predicate' @ [32:116] ==> value-parameter predicate: (Library) -> Boolean defined in org.jetbrains.kotlin.idea.util.projectStructure.findLibrary[ValueParameterDescriptorImpl]

'getInstance' @ [34:48] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'this' @ [34:60] ==> <this> defined in org.jetbrains.kotlin.idea.util.projectStructure.sdk[ReceiverParameterDescriptorImpl]

'sdk' @ [34:66] ==> public final val ModuleRootManager.sdk: Sdk?[MyPropertyDescriptor]

'forEachLibrary' @ [38:5] ==> public final fun forEachLibrary(@NotNull p0: ((Library..Library?)) -> Boolean): Unit defined in com.intellij.openapi.roots.OrderEnumerator[MyFunctionDescriptor]

'if (predicate(library!!)) {
            lib = library
            false
        }
        else {
            true
        }' @ [39:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'invoke' @ [39:13] ==> public abstract operator fun invoke(p1: Library): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'library' @ [39:23] ==> value-parameter library: (Library..Library?) defined in org.jetbrains.kotlin.idea.util.projectStructure.findLibrary.<anonymous>[ValueParameterDescriptorImpl]

'lib' @ [40:13] ==> var lib: Library? defined in org.jetbrains.kotlin.idea.util.projectStructure.findLibrary[LocalVariableDescriptor]

'library' @ [40:19] ==> value-parameter library: (Library..Library?) defined in org.jetbrains.kotlin.idea.util.projectStructure.findLibrary.<anonymous>[ValueParameterDescriptorImpl]

'lib' @ [48:12] ==> var lib: Library? defined in org.jetbrains.kotlin.idea.util.projectStructure.findLibrary[LocalVariableDescriptor]

'File' @ [51:37] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'moduleFilePath' @ [51:42] ==> public final val Module.moduleFilePath: String[MyPropertyDescriptor]

'parent' @ [51:58] ==> public final val File.parent: (String..String?)[MyPropertyDescriptor]

'replace' @ [51:67] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'separatorChar' @ [51:80] ==> public const final val separatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'getUrlForLibraryRoot' @ [54:27] ==> public open fun getUrlForLibraryRoot(@NotNull p0: File): (String..String?) defined in com.intellij.openapi.vfs.VfsUtil[JavaMethodDescriptor]

'oldFile' @ [54:48] ==> value-parameter oldFile: File defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot[ValueParameterDescriptorImpl]

'getUrlForLibraryRoot' @ [55:27] ==> public open fun getUrlForLibraryRoot(@NotNull p0: File): (String..String?) defined in com.intellij.openapi.vfs.VfsUtil[JavaMethodDescriptor]

'newFile' @ [55:48] ==> value-parameter newFile: File defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot[ValueParameterDescriptorImpl]

'getUrls' @ [58:21] ==> @NotNull public abstract fun getUrls(@NotNull p0: OrderRootType): (Array<(String..String?)>..Array<out (String..String?)>) defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'rootType' @ [58:29] ==> value-parameter rootType: OrderRootType defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot.replaceInRootType[ValueParameterDescriptorImpl]

'oldRoot' @ [59:17] ==> val oldRoot: (String..String?) defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot[LocalVariableDescriptor]

'url' @ [59:28] ==> val url: (String..String?) defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot.replaceInRootType[LocalVariableDescriptor]

'removeRoot' @ [60:17] ==> public abstract fun removeRoot(@NotNull p0: String, @NotNull p1: OrderRootType): Boolean defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'url' @ [60:28] ==> val url: (String..String?) defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot.replaceInRootType[LocalVariableDescriptor]

'rootType' @ [60:33] ==> value-parameter rootType: OrderRootType defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot.replaceInRootType[ValueParameterDescriptorImpl]

'addRoot' @ [61:17] ==> public abstract fun addRoot(@NonNls @NotNull p0: String, @NotNull p1: OrderRootType): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'newRoot' @ [61:25] ==> val newRoot: (String..String?) defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot[LocalVariableDescriptor]

'rootType' @ [61:34] ==> value-parameter rootType: OrderRootType defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot.replaceInRootType[ValueParameterDescriptorImpl]

'replaceInRootType' @ [66:5] ==> local final fun replaceInRootType(rootType: OrderRootType): Unit defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot[SimpleFunctionDescriptorImpl]

'CLASSES' @ [66:37] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'replaceInRootType' @ [67:5] ==> local final fun replaceInRootType(rootType: OrderRootType): Unit defined in org.jetbrains.kotlin.idea.util.projectStructure.replaceFileRoot[SimpleFunctionDescriptorImpl]

'SOURCES' @ [67:37] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

