'if (myElementsToMove.size == 1) {
            myProcessedElementsHeader = RefactoringBundle.message("move.single.element.elements.header",
                                                                  UsageViewUtil.getType(myElementsToMove[0]),
                                                                  newParent.virtualFile.presentableUrl).capitalize()
            myCodeReferencesText = "References in code to ${UsageViewUtil.getType(myElementsToMove[0])} ${UsageViewUtil.getLongName(myElementsToMove[0])} and its declarations"
        }
        else {
            myProcessedElementsHeader = StringUtil.capitalize(RefactoringBundle.message("move.files.elements.header", newParent.virtualFile.presentableUrl))
            myCodeReferencesText = RefactoringBundle.message("references.found.in.code")
        }' @ [35:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'myElementsToMove' @ [35:13] ==> private final val myElementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'size' @ [35:30] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'myProcessedElementsHeader' @ [36:13] ==> private final var myProcessedElementsHeader: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'message' @ [36:59] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getType' @ [37:81] ==> public open fun getType(@NotNull p0: PsiElement): (String..String?) defined in com.intellij.usageView.UsageViewUtil[JavaMethodDescriptor]

'myElementsToMove' @ [37:89] ==> private final val myElementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'newParent' @ [38:67] ==> value-parameter newParent: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor.<init>[ValueParameterDescriptorImpl]

'virtualFile' @ [38:77] ==> public final val PsiDirectory.virtualFile: VirtualFile[MyPropertyDescriptor]

'presentableUrl' @ [38:89] ==> public final val VirtualFile.presentableUrl: String[MyPropertyDescriptor]

'capitalize' @ [38:105] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'myCodeReferencesText' @ [39:13] ==> private final val myCodeReferencesText: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'getType' @ [39:75] ==> public open fun getType(@NotNull p0: PsiElement): (String..String?) defined in com.intellij.usageView.UsageViewUtil[JavaMethodDescriptor]

'myElementsToMove' @ [39:83] ==> private final val myElementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'getLongName' @ [39:121] ==> public open fun getLongName(p0: (PsiElement..PsiElement?)): (String..String?) defined in com.intellij.usageView.UsageViewUtil[JavaMethodDescriptor]

'myElementsToMove' @ [39:133] ==> private final val myElementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'myProcessedElementsHeader' @ [42:13] ==> private final var myProcessedElementsHeader: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'capitalize' @ [42:52] ==> @NotNull @Contract public open fun capitalize(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'message' @ [42:81] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'newParent' @ [42:119] ==> value-parameter newParent: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor.<init>[ValueParameterDescriptorImpl]

'virtualFile' @ [42:129] ==> public final val PsiDirectory.virtualFile: VirtualFile[MyPropertyDescriptor]

'presentableUrl' @ [42:141] ==> public final val VirtualFile.presentableUrl: String[MyPropertyDescriptor]

'myCodeReferencesText' @ [43:13] ==> private final val myCodeReferencesText: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'message' @ [43:54] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'myElementsToMove' @ [47:34] ==> private final val myElementsToMove: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'myProcessedElementsHeader' @ [49:49] ==> private final var myProcessedElementsHeader: String? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'myCodeReferencesText' @ [52:16] ==> private final val myCodeReferencesText: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor[PropertyDescriptorImpl]

'getReferencesString' @ [52:55] ==> public open fun getReferencesString(p0: Int, p1: Int): (String..String?) defined in com.intellij.usageView.UsageViewBundle[JavaMethodDescriptor]

'usagesCount' @ [52:75] ==> value-parameter usagesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor.getCodeReferencesText[ValueParameterDescriptorImpl]

'filesCount' @ [52:88] ==> value-parameter filesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor.getCodeReferencesText[ValueParameterDescriptorImpl]

'message' @ [56:34] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getOccurencesString' @ [56:86] ==> public open fun getOccurencesString(p0: Int, p1: Int): (String..String?) defined in com.intellij.usageView.UsageViewBundle[JavaMethodDescriptor]

'usagesCount' @ [56:106] ==> value-parameter usagesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor.getCommentReferencesText[ValueParameterDescriptorImpl]

'filesCount' @ [56:119] ==> value-parameter filesCount: Int defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveFilesWithDeclarationsViewDescriptor.getCommentReferencesText[ValueParameterDescriptorImpl]

