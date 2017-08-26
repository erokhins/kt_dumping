'when (originalElement) {
                                 is KtClassOrObject -> runReadAction { originalElement.toLightClassWithBuiltinMapping() }
                                 is PsiClass -> originalElement
                                 else -> null
                             }' @ [30:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiClass?, entry1: PsiClass?, entry2: PsiClass?): PsiClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiClass?

'originalElement' @ [30:36] ==> public open val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'runReadAction' @ [31:56] ==> public fun <T> runReadAction(action: () -> PsiClass?): PsiClass? defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PsiClass?

'originalElement' @ [31:72] ==> public open val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'toLightClassWithBuiltinMapping' @ [31:88] ==> public fun KtClassOrObject.toLightClassWithBuiltinMapping(): PsiClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'originalElement' @ [32:49] ==> public open val originalElement: PsiElement defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'getEmptyQuery' @ [34:53] ==> public open fun <T : (Any..Any?)> getEmptyQuery(): (Query<(PsiClass..PsiClass?)>..Query<(PsiClass..PsiClass?)>?) defined in com.intellij.util.EmptyQuery[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'search' @ [36:34] ==> @NotNull public open fun search(@NotNull p0: PsiClass, @NotNull p1: SearchScope, p2: Boolean, p3: Boolean, p4: Boolean): Query<(PsiClass..PsiClass?)> defined in com.intellij.psi.search.searches.ClassInheritorsSearch[JavaMethodDescriptor]

'psiClass' @ [37:13] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.search.declarationsSearch.searchInheritors[LocalVariableDescriptor]

'searchScope' @ [38:13] ==> public open val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'searchDeeply' @ [39:13] ==> public final val searchDeeply: Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'!' @ [45:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [45:43] ==> <this> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.isInheritable[ReceiverParameterDescriptorImpl]

'hasModifierProperty' @ [45:72] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'FINAL' @ [45:104] ==> public const final val FINAL: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

