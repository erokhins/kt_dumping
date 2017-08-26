'intersectWith' @ [32:67] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'otherScope' @ [32:81] ==> value-parameter otherScope: SearchScope defined in org.jetbrains.kotlin.idea.search.and[ValueParameterDescriptorImpl]

'union' @ [33:66] ==> @NotNull public abstract fun union(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'otherScope' @ [33:72] ==> value-parameter otherScope: SearchScope defined in org.jetbrains.kotlin.idea.search.or[ValueParameterDescriptorImpl]

'this' @ [34:78] ==> <this> defined in org.jetbrains.kotlin.idea.search.minus[ReceiverParameterDescriptorImpl]

'!' @ [34:87] ==> public operator fun GlobalSearchScope.not(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'otherScope' @ [34:88] ==> value-parameter otherScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.search.minus[ValueParameterDescriptorImpl]

'notScope' @ [35:77] ==> @NotNull public open fun notScope(@NotNull p0: GlobalSearchScope): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'this' @ [35:86] ==> <this> defined in org.jetbrains.kotlin.idea.search.not[ReceiverParameterDescriptorImpl]

'this' @ [38:9] ==> <this> defined in org.jetbrains.kotlin.idea.search.unionSafe[ReceiverParameterDescriptorImpl]

'this' @ [38:37] ==> <this> defined in org.jetbrains.kotlin.idea.search.unionSafe[ReceiverParameterDescriptorImpl]

'scope' @ [38:42] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'isEmpty' @ [38:48] ==> @InlineOnly public inline fun <T> Array<out (PsiElement..PsiElement?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'other' @ [39:16] ==> value-parameter other: SearchScope defined in org.jetbrains.kotlin.idea.search.unionSafe[ValueParameterDescriptorImpl]

'other' @ [41:9] ==> value-parameter other: SearchScope defined in org.jetbrains.kotlin.idea.search.unionSafe[ValueParameterDescriptorImpl]

'other' @ [41:38] ==> value-parameter other: SearchScope defined in org.jetbrains.kotlin.idea.search.unionSafe[ValueParameterDescriptorImpl]

'scope' @ [41:44] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'isEmpty' @ [41:50] ==> @InlineOnly public inline fun <T> Array<out (PsiElement..PsiElement?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'this' @ [42:16] ==> <this> defined in org.jetbrains.kotlin.idea.search.unionSafe[ReceiverParameterDescriptorImpl]

'this' @ [44:12] ==> <this> defined in org.jetbrains.kotlin.idea.search.unionSafe[ReceiverParameterDescriptorImpl]

'union' @ [44:17] ==> @NotNull public abstract fun union(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'other' @ [44:23] ==> value-parameter other: SearchScope defined in org.jetbrains.kotlin.idea.search.unionSafe[ValueParameterDescriptorImpl]

'allScope' @ [47:63] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'this' @ [47:72] ==> <this> defined in org.jetbrains.kotlin.idea.search.allScope[ReceiverParameterDescriptorImpl]

'projectScope' @ [49:67] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'this' @ [49:80] ==> <this> defined in org.jetbrains.kotlin.idea.search.projectScope[ReceiverParameterDescriptorImpl]

'fileScope' @ [51:64] ==> @NotNull public open fun fileScope(@NotNull p0: PsiFile): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'this' @ [51:74] ==> <this> defined in org.jetbrains.kotlin.idea.search.fileScope[ReceiverParameterDescriptorImpl]

'getScopeRestrictedByFileTypes' @ [53:69] ==> @NotNull @Contract public open fun getScopeRestrictedByFileTypes(@NotNull p0: GlobalSearchScope, @NotNull vararg p1: (FileType..FileType?)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'this' @ [53:99] ==> <this> defined in org.jetbrains.kotlin.idea.search.restrictToKotlinSources[ReceiverParameterDescriptorImpl]

'INSTANCE' @ [53:120] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'when (this) {
        is GlobalSearchScope -> restrictToKotlinSources()
        is LocalSearchScope -> {
            val ktElements = scope.filter { it.containingFile is KtFile }
            when (ktElements.size) {
                0 -> GlobalSearchScope.EMPTY_SCOPE
                scope.size -> this
                else -> LocalSearchScope(ktElements.toTypedArray())
            }
        }
        else -> this
    }' @ [56:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SearchScope, entry1: SearchScope, entry2: SearchScope): SearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SearchScope

'this' @ [56:18] ==> <this> defined in org.jetbrains.kotlin.idea.search.restrictToKotlinSources[ReceiverParameterDescriptorImpl]

'restrictToKotlinSources' @ [57:33] ==> public fun GlobalSearchScope.restrictToKotlinSources(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[SimpleFunctionDescriptorImpl]

'scope' @ [59:30] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'filter' @ [59:36] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.filter(predicate: ((PsiElement..PsiElement?)) -> Boolean): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [59:45] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.restrictToKotlinSources.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [59:48] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'when (ktElements.size) {
                0 -> GlobalSearchScope.EMPTY_SCOPE
                scope.size -> this
                else -> LocalSearchScope(ktElements.toTypedArray())
            }' @ [60:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (SearchScope..SearchScope?), entry1: (SearchScope..SearchScope?), entry2: (SearchScope..SearchScope?)): (SearchScope..SearchScope?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.psi.search.SearchScope..com.intellij.psi.search.SearchScope?)

'ktElements' @ [60:19] ==> val ktElements: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.search.restrictToKotlinSources[LocalVariableDescriptor]

'size' @ [60:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'EMPTY_SCOPE' @ [61:40] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'scope' @ [62:17] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'size' @ [62:23] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'this' @ [62:31] ==> <this> defined in org.jetbrains.kotlin.idea.search.restrictToKotlinSources[ReceiverParameterDescriptorImpl]

'LocalSearchScope' @ [63:25] ==> public constructor LocalSearchScope(@NotNull p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'ktElements' @ [63:42] ==> val ktElements: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.search.restrictToKotlinSources[LocalVariableDescriptor]

'toTypedArray' @ [63:53] ==> public inline fun <reified T> Collection<(PsiElement..PsiElement?)>.toTypedArray(): Array<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'this' @ [66:17] ==> <this> defined in org.jetbrains.kotlin.idea.search.restrictToKotlinSources[ReceiverParameterDescriptorImpl]

'excludeFileTypes' @ [70:55] ==> public fun SearchScope.excludeFileTypes(vararg fileTypes: FileType): SearchScope defined in org.jetbrains.kotlin.idea.search[SimpleFunctionDescriptorImpl]

'INSTANCE' @ [70:87] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'if (this is GlobalSearchScope) {
        val includedFileTypes = FileTypeRegistry.getInstance().registeredFileTypes.filter { it !in fileTypes }.toTypedArray()
        GlobalSearchScope.getScopeRestrictedByFileTypes(this, *includedFileTypes)
    }
    else {
        this as LocalSearchScope
        val filteredElements = scope.filter { it.containingFile.fileType !in fileTypes }
        if (filteredElements.isNotEmpty())
            LocalSearchScope(filteredElements.toTypedArray())
        else
            GlobalSearchScope.EMPTY_SCOPE
    }' @ [73:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SearchScope, elseBranch: SearchScope): SearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SearchScope

'this' @ [73:16] ==> <this> defined in org.jetbrains.kotlin.idea.search.excludeFileTypes[ReceiverParameterDescriptorImpl]

'getInstance' @ [74:50] ==> public open fun getInstance(): (FileTypeRegistry..FileTypeRegistry?) defined in com.intellij.openapi.fileTypes.FileTypeRegistry[JavaMethodDescriptor]

'registeredFileTypes' @ [74:64] ==> public final val FileTypeRegistry.registeredFileTypes: (Array<(FileType..FileType?)>..Array<out (FileType..FileType?)>)[MyPropertyDescriptor]

'filter' @ [74:84] ==> public inline fun <T> Array<out (FileType..FileType?)>.filter(predicate: ((FileType..FileType?)) -> Boolean): List<(FileType..FileType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.fileTypes.FileType..com.intellij.openapi.fileTypes.FileType?)

'it' @ [74:93] ==> value-parameter it: (FileType..FileType?) defined in org.jetbrains.kotlin.idea.search.excludeFileTypes.<anonymous>[ValueParameterDescriptorImpl]

'fileTypes' @ [74:100] ==> value-parameter vararg fileTypes: FileType defined in org.jetbrains.kotlin.idea.search.excludeFileTypes[ValueParameterDescriptorImpl]

'toTypedArray' @ [74:112] ==> public inline fun <reified T> Collection<(FileType..FileType?)>.toTypedArray(): Array<(FileType..FileType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (com.intellij.openapi.fileTypes.FileType..com.intellij.openapi.fileTypes.FileType?)

'getScopeRestrictedByFileTypes' @ [75:27] ==> @NotNull @Contract public open fun getScopeRestrictedByFileTypes(@NotNull p0: GlobalSearchScope, @NotNull vararg p1: (FileType..FileType?)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'this' @ [75:57] ==> <this> defined in org.jetbrains.kotlin.idea.search.excludeFileTypes[ReceiverParameterDescriptorImpl]

'includedFileTypes' @ [75:64] ==> val includedFileTypes: Array<(FileType..FileType?)> defined in org.jetbrains.kotlin.idea.search.excludeFileTypes[LocalVariableDescriptor]

'this' @ [78:9] ==> <this> defined in org.jetbrains.kotlin.idea.search.excludeFileTypes[ReceiverParameterDescriptorImpl]

'scope' @ [79:32] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'filter' @ [79:38] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.filter(predicate: ((PsiElement..PsiElement?)) -> Boolean): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [79:47] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.excludeFileTypes.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [79:50] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'fileType' @ [79:65] ==> public final val PsiFile.fileType: FileType[MyPropertyDescriptor]

'fileTypes' @ [79:78] ==> value-parameter vararg fileTypes: FileType defined in org.jetbrains.kotlin.idea.search.excludeFileTypes[ValueParameterDescriptorImpl]

'if (filteredElements.isNotEmpty())
            LocalSearchScope(filteredElements.toTypedArray())
        else
            GlobalSearchScope.EMPTY_SCOPE' @ [80:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (SearchScope..SearchScope?), elseBranch: (SearchScope..SearchScope?)): (SearchScope..SearchScope?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.search.SearchScope..com.intellij.psi.search.SearchScope?)

'filteredElements' @ [80:13] ==> val filteredElements: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.search.excludeFileTypes[LocalVariableDescriptor]

'isNotEmpty' @ [80:30] ==> @InlineOnly public inline fun <T> Collection<(PsiElement..PsiElement?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'LocalSearchScope' @ [81:13] ==> public constructor LocalSearchScope(@NotNull p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'filteredElements' @ [81:30] ==> val filteredElements: List<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.search.excludeFileTypes[LocalVariableDescriptor]

'toTypedArray' @ [81:47] ==> public inline fun <reified T> Collection<(PsiElement..PsiElement?)>.toTypedArray(): Array<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'EMPTY_SCOPE' @ [83:31] ==> public final val EMPTY_SCOPE: (GlobalSearchScope..GlobalSearchScope?) defined in com.intellij.psi.search.GlobalSearchScope[JavaPropertyDescriptor]

'element' @ [89:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.effectiveSearchScope[ValueParameterDescriptorImpl]

'elementToSearch' @ [89:20] ==> public final val ReferencesSearch.SearchParameters.elementToSearch: PsiElement[MyPropertyDescriptor]

'effectiveSearchScope' @ [89:44] ==> public final val ReferencesSearch.SearchParameters.effectiveSearchScope: SearchScope[MyPropertyDescriptor]

'isIgnoreAccessScope' @ [90:9] ==> public final val ReferencesSearch.SearchParameters.isIgnoreAccessScope: Boolean[MyPropertyDescriptor]

'scopeDeterminedByUser' @ [90:37] ==> public final val ReferencesSearch.SearchParameters.scopeDeterminedByUser: (SearchScope..SearchScope?)[MyPropertyDescriptor]

'getInstance' @ [91:47] ==> public open fun getInstance(@NotNull p0: Project): (PsiSearchHelper..PsiSearchHelper?) defined in com.intellij.psi.search.PsiSearchHelper.SERVICE[JavaMethodDescriptor]

'element' @ [91:59] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.effectiveSearchScope[ValueParameterDescriptorImpl]

'project' @ [91:67] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'getUseScope' @ [91:76] ==> @NotNull public abstract fun getUseScope(@NotNull p0: PsiElement): SearchScope defined in com.intellij.psi.search.PsiSearchHelper[JavaMethodDescriptor]

'element' @ [91:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.effectiveSearchScope[ValueParameterDescriptorImpl]

'scopeDeterminedByUser' @ [92:12] ==> public final val ReferencesSearch.SearchParameters.scopeDeterminedByUser: (SearchScope..SearchScope?)[MyPropertyDescriptor]

'intersectWith' @ [92:34] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'accessScope' @ [92:48] ==> val accessScope: SearchScope defined in org.jetbrains.kotlin.idea.search.effectiveSearchScope[LocalVariableDescriptor]

