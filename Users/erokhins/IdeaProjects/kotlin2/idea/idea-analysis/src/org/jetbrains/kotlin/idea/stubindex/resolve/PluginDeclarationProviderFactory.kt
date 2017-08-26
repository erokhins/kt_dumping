'AbstractDeclarationProviderFactory' @ [39:5] ==> public constructor AbstractDeclarationProviderFactory(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.resolve.lazy.declarations.AbstractDeclarationProviderFactory[JavaClassConstructorDescriptor]

'storageManager' @ [39:40] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.<init>[ValueParameterDescriptorImpl]

'FileBasedDeclarationProviderFactory' @ [40:55] ==> public constructor FileBasedDeclarationProviderFactory(@NotNull p0: StorageManager, @NotNull p1: (MutableCollection<(KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>)) defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaClassConstructorDescriptor]

'storageManager' @ [40:91] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'nonIndexedFiles' @ [40:107] ==> private final val nonIndexedFiles: Collection<KtFile> defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'PsiBasedClassMemberDeclarationProvider' @ [43:16] ==> public constructor PsiBasedClassMemberDeclarationProvider(storageManager: StorageManager, ownerInfo: KtClassLikeInfo) defined in org.jetbrains.kotlin.resolve.lazy.declarations.PsiBasedClassMemberDeclarationProvider[DeserializedClassConstructorDescriptor]

'storageManager' @ [43:55] ==> private final val storageManager: StorageManager defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'classLikeInfo' @ [43:71] ==> value-parameter classLikeInfo: KtClassLikeInfo defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.getClassMemberDeclarationProvider[ValueParameterDescriptorImpl]

'fileBasedDeclarationProviderFactory' @ [47:33] ==> private final val fileBasedDeclarationProviderFactory: FileBasedDeclarationProviderFactory defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'getPackageMemberDeclarationProvider' @ [47:69] ==> public open fun getPackageMemberDeclarationProvider(@NotNull p0: FqName): PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.resolve.lazy.declarations.FileBasedDeclarationProviderFactory[JavaMethodDescriptor]

'name' @ [47:105] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[ValueParameterDescriptorImpl]

'getStubBasedPackageMemberDeclarationProvider' @ [48:33] ==> private final fun getStubBasedPackageMemberDeclarationProvider(name: FqName): PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[SimpleFunctionDescriptorImpl]

'name' @ [48:78] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[ValueParameterDescriptorImpl]

'when {
            fileBasedProvider == null && stubBasedProvider == null -> null
            fileBasedProvider == null -> stubBasedProvider
            stubBasedProvider == null -> fileBasedProvider
            else -> CombinedPackageMemberDeclarationProvider(listOf(stubBasedProvider, fileBasedProvider))
        }' @ [49:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PackageMemberDeclarationProvider?, entry1: PackageMemberDeclarationProvider?, entry2: PackageMemberDeclarationProvider?, entry3: PackageMemberDeclarationProvider?): PackageMemberDeclarationProvider?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PackageMemberDeclarationProvider?

'fileBasedProvider' @ [50:13] ==> val fileBasedProvider: PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[LocalVariableDescriptor]

'stubBasedProvider' @ [50:42] ==> val stubBasedProvider: PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[LocalVariableDescriptor]

'fileBasedProvider' @ [51:13] ==> val fileBasedProvider: PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[LocalVariableDescriptor]

'stubBasedProvider' @ [51:42] ==> val stubBasedProvider: PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[LocalVariableDescriptor]

'stubBasedProvider' @ [52:13] ==> val stubBasedProvider: PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[LocalVariableDescriptor]

'fileBasedProvider' @ [52:42] ==> val fileBasedProvider: PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[LocalVariableDescriptor]

'CombinedPackageMemberDeclarationProvider' @ [53:21] ==> public constructor CombinedPackageMemberDeclarationProvider(providers: Collection<PackageMemberDeclarationProvider>) defined in org.jetbrains.kotlin.resolve.lazy.declarations.CombinedPackageMemberDeclarationProvider[DeserializedClassConstructorDescriptor]

'listOf' @ [53:62] ==> public fun <T> listOf(vararg elements: PackageMemberDeclarationProvider): List<PackageMemberDeclarationProvider> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageMemberDeclarationProvider

'stubBasedProvider' @ [53:69] ==> val stubBasedProvider: PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[LocalVariableDescriptor]

'fileBasedProvider' @ [53:88] ==> val fileBasedProvider: PackageMemberDeclarationProvider? defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.createPackageMemberDeclarationProvider[LocalVariableDescriptor]

'if (moduleInfo is ModuleSourceInfo)
            project.service<PerModulePackageCacheService>().packageExists(name, moduleInfo)
        else
            PackageIndexUtil.packageExists(name, indexedFilesScope, project)' @ [58:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'moduleInfo' @ [58:20] ==> private final val moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'project' @ [59:13] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'service' @ [59:21] ==> public inline fun <reified T : Any> Project.service(): PerModulePackageCacheService defined in com.intellij.openapi.components[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PerModulePackageCacheService

'packageExists' @ [59:61] ==> public final fun packageExists(packageFqName: FqName, moduleInfo: ModuleSourceInfo): Boolean defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'name' @ [59:75] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.packageExists[ValueParameterDescriptorImpl]

'moduleInfo' @ [59:81] ==> private final val moduleInfo: ModuleInfo defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'packageExists' @ [61:30] ==> @JvmStatic public final fun packageExists(packageFqName: FqName, searchScope: GlobalSearchScope, project: Project): Boolean defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[SimpleFunctionDescriptorImpl]

'name' @ [61:44] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.packageExists[ValueParameterDescriptorImpl]

'indexedFilesScope' @ [61:50] ==> private final val indexedFilesScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'project' @ [61:69] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'!' @ [65:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'packageExists' @ [65:14] ==> private final fun packageExists(name: FqName): Boolean defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[SimpleFunctionDescriptorImpl]

'name' @ [65:28] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.getStubBasedPackageMemberDeclarationProvider[ValueParameterDescriptorImpl]

'StubBasedPackageMemberDeclarationProvider' @ [67:16] ==> public constructor StubBasedPackageMemberDeclarationProvider(fqName: FqName, project: Project, searchScope: GlobalSearchScope) defined in org.jetbrains.kotlin.idea.stubindex.resolve.StubBasedPackageMemberDeclarationProvider[ClassConstructorDescriptorImpl]

'name' @ [67:58] ==> value-parameter name: FqName defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.getStubBasedPackageMemberDeclarationProvider[ValueParameterDescriptorImpl]

'project' @ [67:64] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'indexedFilesScope' @ [67:73] ==> private final val indexedFilesScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'file' @ [71:29] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[ValueParameterDescriptorImpl]

'packageFqName' @ [71:34] ==> public final val KtFile.packageFqName: FqName[MyPropertyDescriptor]

'SubpackagesIndexService' @ [72:32] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService[FakeCallableDescriptorForObject]

'getInstance' @ [72:56] ==> public final fun getInstance(project: Project): SubpackagesIndexService.SubpackagesIndex defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.Companion[SimpleFunctionDescriptorImpl]

'project' @ [72:68] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'IllegalStateException' @ [73:15] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [73:37] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'file' @ [73:78] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[ValueParameterDescriptorImpl]

'name' @ [73:83] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'packageFqName' @ [73:103] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[LocalVariableDescriptor]

'file' @ [74:46] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[ValueParameterDescriptorImpl]

'virtualFile' @ [74:51] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'file' @ [74:78] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[ValueParameterDescriptorImpl]

'nonIndexedFiles' @ [74:86] ==> private final val nonIndexedFiles: Collection<KtFile> defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'PackageIndexUtil' @ [75:54] ==> public object PackageIndexUtil defined in org.jetbrains.kotlin.idea.stubindex in file PackageIndexUtil.kt[FakeCallableDescriptorForObject]

'packageExists' @ [75:71] ==> @JvmStatic public final fun packageExists(packageFqName: FqName, searchScope: GlobalSearchScope, project: Project): Boolean defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[SimpleFunctionDescriptorImpl]

'packageFqName' @ [75:85] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[LocalVariableDescriptor]

'indexedFilesScope' @ [75:100] ==> private final val indexedFilesScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'project' @ [75:119] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'indexedFilesScope' @ [75:133] ==> private final val indexedFilesScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'subpackagesIndex' @ [76:58] ==> val subpackagesIndex: SubpackagesIndexService.SubpackagesIndex defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[LocalVariableDescriptor]

'packageExists' @ [76:75] ==> public final fun packageExists(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.stubindex.SubpackagesIndexService.SubpackagesIndex[SimpleFunctionDescriptorImpl]

'packageFqName' @ [76:89] ==> val packageFqName: FqName defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[LocalVariableDescriptor]

'subpackagesIndex' @ [76:110] ==> val subpackagesIndex: SubpackagesIndexService.SubpackagesIndex defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[LocalVariableDescriptor]

'file' @ [77:51] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.diagnoseMissingPackageFragment[ValueParameterDescriptorImpl]

'manager' @ [77:56] ==> public final val KtFile.manager: (PsiManager..PsiManager?)[MyPropertyDescriptor]

'modificationTracker' @ [77:64] ==> public final val PsiManager.modificationTracker: PsiModificationTracker[MyPropertyDescriptor]

'outOfCodeBlockModificationCount' @ [77:84] ==> public final val PsiModificationTracker.outOfCodeBlockModificationCount: Long[MyPropertyDescriptor]

'debugInfo' @ [81:39] ==> private final fun debugInfo(): String defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[SimpleFunctionDescriptorImpl]

'debugInfo' @ [84:66] ==> private final fun debugInfo(): String defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[SimpleFunctionDescriptorImpl]

'onCreationDebugInfo' @ [84:93] ==> private final val onCreationDebugInfo: String defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'nonIndexedFiles' @ [88:13] ==> private final val nonIndexedFiles: Collection<KtFile> defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'isEmpty' @ [88:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'buildString' @ [90:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'nonIndexedFiles' @ [91:13] ==> private final val nonIndexedFiles: Collection<KtFile> defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory[PropertyDescriptorImpl]

'forEach' @ [91:29] ==> @HidesMembers public inline fun <T> Iterable<KtFile>.forEach(action: (KtFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'append' @ [92:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [92:24] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.debugInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [92:27] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'append' @ [93:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [93:39] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.debugInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isPhysical' @ [93:42] ==> public final val KtFile.isPhysical: Boolean[MyPropertyDescriptor]

'append' @ [94:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'it' @ [94:37] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.stubindex.resolve.PluginDeclarationProviderFactory.debugInfo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'modificationStamp' @ [94:40] ==> public final val KtFile.modificationStamp: Long[MyPropertyDescriptor]

'appendln' @ [95:17] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

