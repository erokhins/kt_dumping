'AutomaticRenamer' @ [36:74] ==> protected/*protected and package*/ constructor AutomaticRenamer() defined in com.intellij.refactoring.rename.naming.AutomaticRenamer[JavaClassConstructorDescriptor]

'processHierarchy' @ [38:9] ==> private final fun processHierarchy(element: KtParameter, newName: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer[SimpleFunctionDescriptorImpl]

'element' @ [38:26] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.<init>[ValueParameterDescriptorImpl]

'newName' @ [38:35] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.<init>[ValueParameterDescriptorImpl]

'element' @ [42:24] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[ValueParameterDescriptorImpl]

'ownerFunction' @ [42:32] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'HierarchySearchRequest' @ [43:27] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: KtDeclarationWithBody, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> KtDeclarationWithBody

'function' @ [43:50] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[LocalVariableDescriptor]

'function' @ [43:60] ==> val function: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[LocalVariableDescriptor]

'useScope' @ [43:69] ==> public final val KtDeclarationWithBody.useScope: SearchScope[MyPropertyDescriptor]

'searchOverriders' @ [43:79] ==> public fun HierarchySearchRequest<*>.searchOverriders(): Query<PsiMethod> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'overrider' @ [44:28] ==> val overrider: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[LocalVariableDescriptor]

'namedUnwrappedElement' @ [44:38] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'!' @ [45:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callable' @ [45:18] ==> val callable: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[LocalVariableDescriptor]

'canRefactor' @ [45:27] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'when (callable) {
                        is KtCallableDeclaration -> callable.valueParameters.firstOrNull { it.name == element.name }
                        is PsiMethod -> callable.parameterList.parameters.firstOrNull { it.name == element.name }
                        else -> null
                    }' @ [47:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiNamedElement?, entry1: PsiNamedElement?, entry2: PsiNamedElement?): PsiNamedElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiNamedElement?

'callable' @ [47:27] ==> val callable: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[LocalVariableDescriptor]

'callable' @ [48:53] ==> val callable: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[LocalVariableDescriptor]

'valueParameters' @ [48:62] ==> public final val KtCallableDeclaration.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [48:78] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.firstOrNull(predicate: ((KtParameter..KtParameter?)) -> Boolean): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [48:92] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [48:95] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'element' @ [48:103] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[ValueParameterDescriptorImpl]

'name' @ [48:111] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'callable' @ [49:41] ==> val callable: PsiNamedElement defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[LocalVariableDescriptor]

'parameterList' @ [49:50] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [49:64] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [49:75] ==> public inline fun <T> Array<out (PsiParameter..PsiParameter?)>.firstOrNull(predicate: ((PsiParameter..PsiParameter?)) -> Boolean): PsiParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'it' @ [49:89] ==> value-parameter it: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [49:92] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'element' @ [49:100] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[ValueParameterDescriptorImpl]

'name' @ [49:108] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'parameter' @ [52:17] ==> val parameter: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[LocalVariableDescriptor]

'myElements' @ [53:13] ==> protected/*protected and package*/ final val myElements: (MutableList<(PsiNamedElement..PsiNamedElement?)>..List<(PsiNamedElement..PsiNamedElement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer[JavaPropertyDescriptor]

'parameter' @ [53:27] ==> val parameter: PsiNamedElement? defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[LocalVariableDescriptor]

'suggestAllNames' @ [55:9] ==> protected/*protected and package*/ open fun suggestAllNames(p0: (String..String?), p1: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer[JavaMethodDescriptor]

'element' @ [55:25] ==> value-parameter element: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[ValueParameterDescriptorImpl]

'name' @ [55:33] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'newName' @ [55:39] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer.processHierarchy[ValueParameterDescriptorImpl]

'quoteIfNeeded' @ [55:47] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'element' @ [68:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamerFactory.isApplicable[ValueParameterDescriptorImpl]

'element' @ [68:80] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamerFactory.isApplicable[ValueParameterDescriptorImpl]

'ownerFunction' @ [68:88] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'!!' @ [70:36] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'message' @ [70:54] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getInstance' @ [72:56] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'isRenameParameterInHierarchy' @ [72:70] ==> public final var JavaRefactoringSettings.isRenameParameterInHierarchy: Boolean[MyPropertyDescriptor]

'getInstance' @ [75:33] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'isRenameParameterInHierarchy' @ [75:47] ==> public final var JavaRefactoringSettings.isRenameParameterInHierarchy: Boolean[MyPropertyDescriptor]

'enabled' @ [75:78] ==> value-parameter enabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamerFactory.setEnabled[ValueParameterDescriptorImpl]

'AutomaticParameterRenamer' @ [79:16] ==> public constructor AutomaticParameterRenamer(element: KtParameter, newName: String) defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamer[ClassConstructorDescriptorImpl]

'element' @ [79:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamerFactory.createRenamer[ValueParameterDescriptorImpl]

'newName' @ [79:66] ==> value-parameter newName: String defined in org.jetbrains.kotlin.idea.refactoring.rename.AutomaticParameterRenamerFactory.createRenamer[ValueParameterDescriptorImpl]

