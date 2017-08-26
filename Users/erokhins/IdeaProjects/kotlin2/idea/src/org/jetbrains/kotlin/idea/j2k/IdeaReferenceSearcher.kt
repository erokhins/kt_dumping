'search' @ [35:93] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'element' @ [35:100] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findLocalUsages[ValueParameterDescriptorImpl]

'LocalSearchScope' @ [35:109] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'scope' @ [35:126] ==> value-parameter scope: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findLocalUsages[ValueParameterDescriptorImpl]

'findAll' @ [35:134] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

'search' @ [37:75] ==> @NotNull public open fun search(@NotNull p0: PsiClass, p1: Boolean): Query<(PsiClass..PsiClass?)> defined in com.intellij.psi.search.searches.ClassInheritorsSearch[JavaMethodDescriptor]

'`class`' @ [37:82] ==> value-parameter `class`: PsiClass defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.hasInheritors[ValueParameterDescriptorImpl]

'any' @ [37:98] ==> public fun <T> Iterable<(PsiClass..PsiClass?)>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'search' @ [39:76] ==> @NotNull public open fun search(@NotNull p0: PsiMethod, p1: Boolean): Query<(PsiMethod..PsiMethod?)> defined in com.intellij.psi.search.searches.OverridingMethodsSearch[JavaMethodDescriptor]

'method' @ [39:83] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.hasOverrides[ValueParameterDescriptorImpl]

'any' @ [39:98] ==> public fun <T> Iterable<(PsiMethod..PsiMethod?)>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'ArrayList' @ [42:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FileType

'searchJava' @ [43:13] ==> value-parameter searchJava: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findUsagesForExternalCodeProcessing[ValueParameterDescriptorImpl]

'fileTypes' @ [44:13] ==> val fileTypes: ArrayList<FileType> defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findUsagesForExternalCodeProcessing[LocalVariableDescriptor]

'add' @ [44:23] ==> public open fun add(element: FileType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'!!' @ [44:27] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: LanguageFileType?): LanguageFileType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> LanguageFileType

'INSTANCE' @ [44:40] ==> @NotNull public final val INSTANCE: JavaLanguage defined in com.intellij.lang.java.JavaLanguage[JavaPropertyDescriptor]

'associatedFileType' @ [44:49] ==> public final val JavaLanguage.associatedFileType: LanguageFileType?[MyPropertyDescriptor]

'searchKotlin' @ [46:13] ==> value-parameter searchKotlin: Boolean defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findUsagesForExternalCodeProcessing[ValueParameterDescriptorImpl]

'fileTypes' @ [47:13] ==> val fileTypes: ArrayList<FileType> defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findUsagesForExternalCodeProcessing[LocalVariableDescriptor]

'add' @ [47:23] ==> public open fun add(element: FileType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'!!' @ [47:27] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: LanguageFileType?): LanguageFileType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> LanguageFileType

'INSTANCE' @ [47:42] ==> @NotNull public final val INSTANCE: KotlinLanguage defined in org.jetbrains.kotlin.idea.KotlinLanguage[JavaPropertyDescriptor]

'associatedFileType' @ [47:51] ==> public final val KotlinLanguage.associatedFileType: LanguageFileType?[MyPropertyDescriptor]

'getScopeRestrictedByFileTypes' @ [49:45] ==> @NotNull @Contract public open fun getScopeRestrictedByFileTypes(@NotNull p0: GlobalSearchScope, @NotNull vararg p1: (FileType..FileType?)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'projectScope' @ [49:93] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'element' @ [49:106] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findUsagesForExternalCodeProcessing[ValueParameterDescriptorImpl]

'project' @ [49:114] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'fileTypes' @ [49:125] ==> val fileTypes: ArrayList<FileType> defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findUsagesForExternalCodeProcessing[LocalVariableDescriptor]

'toTypedArray' @ [49:135] ==> public inline fun <reified T> Collection<FileType>.toTypedArray(): Array<FileType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> FileType

'search' @ [50:33] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'element' @ [50:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findUsagesForExternalCodeProcessing[ValueParameterDescriptorImpl]

'searchScope' @ [50:49] ==> val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.j2k.IdeaReferenceSearcher.findUsagesForExternalCodeProcessing[LocalVariableDescriptor]

'findAll' @ [50:62] ==> @NotNull public abstract fun findAll(): (MutableCollection<(PsiReference..PsiReference?)>..Collection<(PsiReference..PsiReference?)>) defined in com.intellij.util.Query[JavaMethodDescriptor]

