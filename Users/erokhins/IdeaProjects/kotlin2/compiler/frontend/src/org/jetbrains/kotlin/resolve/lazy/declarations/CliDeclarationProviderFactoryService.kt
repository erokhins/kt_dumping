'DeclarationProviderFactoryService' @ [27:91] ==> public constructor DeclarationProviderFactoryService() defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService[ClassConstructorDescriptorImpl]

'ArrayList' @ [36:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtFile

'sourceFiles' @ [37:9] ==> private final val sourceFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService[PropertyDescriptorImpl]

'filterTo' @ [37:21] ==> public inline fun <T, C : MutableCollection<in KtFile>> Iterable<KtFile>.filterTo(destination: ArrayList<KtFile>, predicate: (KtFile) -> Boolean): ArrayList<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <C : MutableCollection<in T>> -> ArrayList<KtFile>

'allFiles' @ [37:30] ==> val allFiles: ArrayList<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService.create[LocalVariableDescriptor]

'it' @ [38:25] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService.create.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [38:28] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'sure' @ [38:40] ==> public inline fun <T : Any> VirtualFile?.sure(message: () -> String): VirtualFile defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> VirtualFile

'filesScope' @ [39:13] ==> value-parameter filesScope: GlobalSearchScope defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService.create[ValueParameterDescriptorImpl]

'contains' @ [39:24] ==> public abstract fun contains(@NotNull p0: VirtualFile): Boolean defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'vFile' @ [39:33] ==> val vFile: VirtualFile defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService.create.<anonymous>[LocalVariableDescriptor]

'allFiles' @ [41:9] ==> val allFiles: ArrayList<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService.create[LocalVariableDescriptor]

'addAll' @ [41:18] ==> public open fun addAll(elements: Collection<KtFile>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'syntheticFiles' @ [41:25] ==> value-parameter syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService.create[ValueParameterDescriptorImpl]

'FileBasedDeclarationProviderFactory' @ [42:16] ==> public constructor FileBasedDeclarationProviderFactory(@NotNull storageManager: StorageManager, @NotNull files: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>)) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaClassConstructorDescriptor]

'storageManager' @ [42:52] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService.create[ValueParameterDescriptorImpl]

'allFiles' @ [42:68] ==> val allFiles: ArrayList<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.CliDeclarationProviderFactoryService.create[LocalVariableDescriptor]

