'JvmStatic' @ [40:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'!!' @ [47:20] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: DeclarationProviderFactoryService?): DeclarationProviderFactoryService[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> DeclarationProviderFactoryService

'getService' @ [47:35] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(DeclarationProviderFactoryService..DeclarationProviderFactoryService?)>): (DeclarationProviderFactoryService..DeclarationProviderFactoryService?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService..org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService?)

'project' @ [47:46] ==> value-parameter project: Project defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.createDeclarationProviderFactory[ValueParameterDescriptorImpl]

'DeclarationProviderFactoryService' @ [47:55] ==> public companion object defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService[FakeCallableDescriptorForObject]

'java' @ [47:96] ==> public val <T> KClass<DeclarationProviderFactoryService>.java: Class<DeclarationProviderFactoryService> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DeclarationProviderFactoryService

'create' @ [48:22] ==> public abstract fun create(project: Project, storageManager: StorageManager, syntheticFiles: Collection<KtFile>, filesScope: GlobalSearchScope, moduleInfo: ModuleInfo): DeclarationProviderFactory defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService[SimpleFunctionDescriptorImpl]

'project' @ [48:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.createDeclarationProviderFactory[ValueParameterDescriptorImpl]

'storageManager' @ [48:38] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.createDeclarationProviderFactory[ValueParameterDescriptorImpl]

'syntheticFiles' @ [48:54] ==> value-parameter syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.createDeclarationProviderFactory[ValueParameterDescriptorImpl]

'filteringScope' @ [48:70] ==> private final fun filteringScope(syntheticFiles: Collection<KtFile>, baseScope: GlobalSearchScope): GlobalSearchScope defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion[SimpleFunctionDescriptorImpl]

'syntheticFiles' @ [48:85] ==> value-parameter syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.createDeclarationProviderFactory[ValueParameterDescriptorImpl]

'filesScope' @ [48:101] ==> value-parameter filesScope: GlobalSearchScope defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.createDeclarationProviderFactory[ValueParameterDescriptorImpl]

'moduleInfo' @ [48:114] ==> value-parameter moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.createDeclarationProviderFactory[ValueParameterDescriptorImpl]

'syntheticFiles' @ [52:17] ==> value-parameter syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.filteringScope[ValueParameterDescriptorImpl]

'isEmpty' @ [52:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'baseScope' @ [53:24] ==> value-parameter baseScope: GlobalSearchScope defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.filteringScope[ValueParameterDescriptorImpl]

'SyntheticFilesFilteringScope' @ [55:20] ==> public constructor SyntheticFilesFilteringScope(syntheticFiles: Collection<KtFile>, baseScope: GlobalSearchScope) defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.SyntheticFilesFilteringScope[ClassConstructorDescriptorImpl]

'syntheticFiles' @ [55:49] ==> value-parameter syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.filteringScope[ValueParameterDescriptorImpl]

'baseScope' @ [55:65] ==> value-parameter baseScope: GlobalSearchScope defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.Companion.filteringScope[ValueParameterDescriptorImpl]

'DelegatingGlobalSearchScope' @ [61:11] ==> public constructor DelegatingGlobalSearchScope(@NotNull p0: GlobalSearchScope) defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaClassConstructorDescriptor]

'baseScope' @ [61:39] ==> value-parameter baseScope: GlobalSearchScope defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.SyntheticFilesFilteringScope.<init>[ValueParameterDescriptorImpl]

'syntheticFiles' @ [63:33] ==> value-parameter syntheticFiles: Collection<KtFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.SyntheticFilesFilteringScope.<init>[ValueParameterDescriptorImpl]

'mapNotNullTo' @ [63:48] ==> public inline fun <T, R : Any, C : MutableCollection<in VirtualFile>> Iterable<KtFile>.mapNotNullTo(destination: HashSet<VirtualFile>, transform: (KtFile) -> VirtualFile?): HashSet<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile
    <R : Any> -> VirtualFile
    <C : MutableCollection<in R>> -> HashSet<VirtualFile>

'HashSet' @ [63:61] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> VirtualFile

'it' @ [63:87] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.SyntheticFilesFilteringScope.originals.<anonymous>[ValueParameterDescriptorImpl]

'originalFile' @ [63:90] ==> public final var KtFile.originalFile: PsiFile[MyPropertyDescriptor]

'virtualFile' @ [63:103] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'super' @ [65:52] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.SyntheticFilesFilteringScope[LazyClassReceiverParameterDescriptor]

'contains' @ [65:58] ==> public open fun contains(@NotNull p0: VirtualFile): Boolean defined in com.intellij.psi.search.DelegatingGlobalSearchScope[JavaMethodDescriptor]

'file' @ [65:67] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.SyntheticFilesFilteringScope.contains[ValueParameterDescriptorImpl]

'file' @ [65:76] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.SyntheticFilesFilteringScope.contains[ValueParameterDescriptorImpl]

'originals' @ [65:85] ==> private final val originals: HashSet<VirtualFile> defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.SyntheticFilesFilteringScope[PropertyDescriptorImpl]

'myBaseScope' @ [67:66] ==> protected/*protected and package*/ final val myBaseScope: (GlobalSearchScope..GlobalSearchScope?) defined in org.jetbrains.kotlin.resolve.lazy.declarations.DeclarationProviderFactoryService.SyntheticFilesFilteringScope[JavaPropertyDescriptor]

