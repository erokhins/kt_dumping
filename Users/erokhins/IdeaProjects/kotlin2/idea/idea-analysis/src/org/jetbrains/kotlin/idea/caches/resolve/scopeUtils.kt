'file' @ [28:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope[ValueParameterDescriptorImpl]

'file' @ [30:9] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope[ValueParameterDescriptorImpl]

'getContextContainingFile' @ [30:14] ==> public final fun getContextContainingFile(): KtFile? defined in org.jetbrains.kotlin.psi.KtCodeFragment[DeserializedSimpleFunctionDescriptor]

'resolveScope' @ [30:42] ==> public final val KtFile.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'let' @ [30:56] ==> @InlineOnly public inline fun <T, R> GlobalSearchScope.let(block: (GlobalSearchScope) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GlobalSearchScope
    <R> -> Nothing

'when (file.getModuleInfo()) {
                is SourceForBinaryModuleInfo -> KotlinSourceFilterScope.libraryClassFiles(it, file.project)
                else -> KotlinSourceFilterScope.sourceAndClassFiles(it, file.project)
            }' @ [31:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: GlobalSearchScope, entry1: GlobalSearchScope): GlobalSearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> GlobalSearchScope

'file' @ [31:26] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope[ValueParameterDescriptorImpl]

'getModuleInfo' @ [31:31] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'libraryClassFiles' @ [32:73] ==> @JvmStatic public final fun libraryClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[SimpleFunctionDescriptorImpl]

'it' @ [32:91] ==> value-parameter it: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [32:95] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope[ValueParameterDescriptorImpl]

'project' @ [32:100] ==> public final val KtCodeFragment.project: Project[MyPropertyDescriptor]

'sourceAndClassFiles' @ [33:49] ==> @JvmStatic public final fun sourceAndClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[SimpleFunctionDescriptorImpl]

'it' @ [33:69] ==> value-parameter it: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [33:73] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope[ValueParameterDescriptorImpl]

'project' @ [33:78] ==> public final val KtCodeFragment.project: Project[MyPropertyDescriptor]

'when (file.getModuleInfo()) {
        is ModuleSourceInfo -> KotlinSourceFilterScope.projectSourceAndClassFiles(file.resolveScope, file.project)
        is ScriptModuleInfo -> file.getModuleInfo().dependencies().map { it.contentScope() }.let {  GlobalSearchScope.union(it.toTypedArray()) }
        else -> GlobalSearchScope.EMPTY_SCOPE
    }' @ [38:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: GlobalSearchScope, entry1: GlobalSearchScope, entry2: GlobalSearchScope): GlobalSearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> GlobalSearchScope

'file' @ [38:18] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope[ValueParameterDescriptorImpl]

'getModuleInfo' @ [38:23] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'projectSourceAndClassFiles' @ [39:56] ==> @JvmStatic public final fun projectSourceAndClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[SimpleFunctionDescriptorImpl]

'file' @ [39:83] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope[ValueParameterDescriptorImpl]

'resolveScope' @ [39:88] ==> public final val KtFile.resolveScope: GlobalSearchScope[MyPropertyDescriptor]

'file' @ [39:102] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope[ValueParameterDescriptorImpl]

'project' @ [39:107] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'file' @ [40:32] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope[ValueParameterDescriptorImpl]

'getModuleInfo' @ [40:37] ==> public fun PsiElement.getModuleInfo(): IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'dependencies' @ [40:53] ==> public abstract fun dependencies(): List<IdeaModuleInfo> defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'map' @ [40:68] ==> public inline fun <T, R> Iterable<IdeaModuleInfo>.map(transform: (IdeaModuleInfo) -> GlobalSearchScope): List<GlobalSearchScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdeaModuleInfo
    <R> -> GlobalSearchScope

'it' @ [40:74] ==> value-parameter it: IdeaModuleInfo defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope.<anonymous>[ValueParameterDescriptorImpl]

'contentScope' @ [40:77] ==> public abstract fun contentScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.IdeaModuleInfo[SimpleFunctionDescriptorImpl]

'let' @ [40:94] ==> @InlineOnly public inline fun <T, R> List<GlobalSearchScope>.let(block: (List<GlobalSearchScope>) -> GlobalSearchScope): GlobalSearchScope defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<GlobalSearchScope>
    <R> -> GlobalSearchScope

'union' @ [40:119] ==> @NotNull @Contract public open fun union(@NotNull p0: (Array<(GlobalSearchScope..GlobalSearchScope?)>..Array<out (GlobalSearchScope..GlobalSearchScope?)>)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'it' @ [40:125] ==> value-parameter it: List<GlobalSearchScope> defined in org.jetbrains.kotlin.idea.caches.resolve.getResolveScope.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [40:128] ==> public inline fun <reified T> Collection<GlobalSearchScope>.toTypedArray(): Array<GlobalSearchScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> GlobalSearchScope

'EMPTY_SCOPE' @ [41:35] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

