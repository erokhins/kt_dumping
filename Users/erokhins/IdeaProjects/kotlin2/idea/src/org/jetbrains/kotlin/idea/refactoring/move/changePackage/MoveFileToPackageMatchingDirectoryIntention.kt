'SelfTargetingOffsetIndependentIntention<KtPackageDirective>' @ [35:53] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtPackageDirective>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtPackageDirective

'java' @ [36:35] ==> public val <T> KClass<KtPackageDirective>.java: Class<KtPackageDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPackageDirective

'element' @ [39:13] ==> value-parameter element: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'isInsideInjectedFragment' @ [39:21] ==> public val PsiElement.isInsideInjectedFragment: Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[PropertyDescriptorImpl]

'element' @ [40:13] ==> value-parameter element: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'containingKtFile' @ [40:21] ==> public final val KtPackageDirective.containingKtFile: KtFile[MyPropertyDescriptor]

'packageMatchesDirectory' @ [40:38] ==> public fun KtFile.packageMatchesDirectory(): Boolean defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'element' @ [42:29] ==> value-parameter element: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.isApplicableTo[ValueParameterDescriptorImpl]

'qualifiedName' @ [42:37] ==> public final val KtPackageDirective.qualifiedName: String[MyPropertyDescriptor]

'if (qualifiedName.isEmpty()) "source root" else "'${qualifiedName.replace('.', '/')}'"' @ [43:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'qualifiedName' @ [43:27] ==> val qualifiedName: String defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.isApplicableTo[LocalVariableDescriptor]

'isEmpty' @ [43:41] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'qualifiedName' @ [43:75] ==> val qualifiedName: String defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.isApplicableTo[LocalVariableDescriptor]

'replace' @ [43:89] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [44:9] ==> public final var MoveFileToPackageMatchingDirectoryIntention.text: String[MyPropertyDescriptor]

'dirName' @ [44:31] ==> val dirName: String defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.isApplicableTo[LocalVariableDescriptor]

'element' @ [51:20] ==> value-parameter element: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[ValueParameterDescriptorImpl]

'containingKtFile' @ [51:28] ==> public final val KtPackageDirective.containingKtFile: KtFile[MyPropertyDescriptor]

'file' @ [52:23] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'project' @ [52:28] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'getSuitableDestinationSourceRoots' @ [54:48] ==> @NotNull public open fun getSuitableDestinationSourceRoots(@NotNull p0: Project): (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.JavaProjectRootsUtil[JavaMethodDescriptor]

'project' @ [54:82] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'PackageWrapper' @ [55:30] ==> public constructor PackageWrapper(p0: (PsiManager..PsiManager?), @NotNull p1: String) defined in com.intellij.refactoring.PackageWrapper[JavaClassConstructorDescriptor]

'getInstance' @ [55:56] ==> @NotNull public open fun getInstance(@NotNull p0: Project): PsiManager defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'project' @ [55:68] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'element' @ [55:78] ==> value-parameter element: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[ValueParameterDescriptorImpl]

'qualifiedName' @ [55:86] ==> public final val KtPackageDirective.qualifiedName: String[MyPropertyDescriptor]

'element' @ [56:26] ==> value-parameter element: KtPackageDirective defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[ValueParameterDescriptorImpl]

'containingFile' @ [56:34] ==> public final val KtPackageDirective.containingFile: PsiFile[MyPropertyDescriptor]

'sourceRoots' @ [58:17] ==> val sourceRoots: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'singleOrNull' @ [58:29] ==> public fun <T> List<(VirtualFile..VirtualFile?)>.singleOrNull(): VirtualFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'chooseSourceRoot' @ [59:46] ==> public open fun chooseSourceRoot(p0: (PackageWrapper..PackageWrapper?), p1: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>?), p2: (PsiDirectory..PsiDirectory?)): (VirtualFile..VirtualFile?) defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassesOrPackagesUtil[JavaMethodDescriptor]

'packageWrapper' @ [59:63] ==> val packageWrapper: PackageWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'sourceRoots' @ [59:79] ==> val sourceRoots: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'fileToMove' @ [59:92] ==> val fileToMove: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'containingDirectory' @ [59:103] ==> public final val PsiFile.containingDirectory: (PsiDirectory..PsiDirectory?)[MyPropertyDescriptor]

'AutocreatingSingleSourceRootMoveDestination' @ [61:32] ==> public constructor AutocreatingSingleSourceRootMoveDestination(p0: (PackageWrapper..PackageWrapper?), @NotNull p1: VirtualFile) defined in com.intellij.refactoring.move.moveClassesOrPackages.AutocreatingSingleSourceRootMoveDestination[JavaClassConstructorDescriptor]

'packageWrapper' @ [61:76] ==> val packageWrapper: PackageWrapper defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'chosenRoot' @ [61:92] ==> val chosenRoot: VirtualFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'targetDirFactory' @ [62:9] ==> val targetDirFactory: AutocreatingSingleSourceRootMoveDestination defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'verify' @ [62:26] ==> @Nullable public open fun verify(p0: (PsiFile..PsiFile?)): String? defined in com.intellij.refactoring.move.moveClassesOrPackages.AutocreatingSingleSourceRootMoveDestination[JavaMethodDescriptor]

'fileToMove' @ [62:33] ==> val fileToMove: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'let' @ [62:46] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Nothing

'showMessageDialog' @ [63:22] ==> public open fun showMessageDialog(@Nullable p0: Project?, p1: (String..String?), @NotNull @Nls p2: String, @Nullable p3: Icon?): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [63:40] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'it' @ [63:49] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'getErrorTitle' @ [63:66] ==> public open fun getErrorTitle(): (String..String?) defined in com.intellij.CommonBundle[JavaMethodDescriptor]

'getErrorIcon' @ [63:92] ==> @NotNull public open fun getErrorIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'runWriteAction' @ [66:31] ==> public fun <T> runWriteAction(action: () -> (PsiDirectory..PsiDirectory?)): (PsiDirectory..PsiDirectory?) defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiDirectory..com.intellij.psi.PsiDirectory?)

'targetDirFactory' @ [67:13] ==> val targetDirFactory: AutocreatingSingleSourceRootMoveDestination defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'getTargetDirectory' @ [67:30] ==> public open fun getTargetDirectory(p0: (PsiFile..PsiFile?)): (PsiDirectory..PsiDirectory?) defined in com.intellij.refactoring.move.moveClassesOrPackages.AutocreatingSingleSourceRootMoveDestination[JavaMethodDescriptor]

'fileToMove' @ [67:49] ==> val fileToMove: PsiFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'checkCanCreateFile' @ [70:32] ==> public open fun checkCanCreateFile(p0: (PsiDirectory..PsiDirectory?), p1: (String..String?)): (String..String?) defined in com.intellij.refactoring.util.RefactoringMessageUtil[JavaMethodDescriptor]

'targetDirectory' @ [70:51] ==> val targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'file' @ [70:68] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'name' @ [70:73] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'let' @ [70:80] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Nothing

'showMessageDialog' @ [71:22] ==> public open fun showMessageDialog(@Nullable p0: Project?, p1: (String..String?), @NotNull @Nls p2: String, @Nullable p3: Icon?): Unit defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [71:40] ==> val project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'it' @ [71:49] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'getErrorTitle' @ [71:66] ==> public open fun getErrorTitle(): (String..String?) defined in com.intellij.CommonBundle[JavaMethodDescriptor]

'getErrorIcon' @ [71:92] ==> @NotNull public open fun getErrorIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'runWriteAction' @ [75:9] ==> public fun <T> runWriteAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'doMoveFile' @ [76:40] ==> public open fun doMoveFile(@NotNull p0: PsiFile, @NotNull p1: PsiDirectory): Unit defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesUtil[JavaMethodDescriptor]

'file' @ [76:51] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

'targetDirectory' @ [76:57] ==> val targetDirectory: PsiDirectory defined in org.jetbrains.kotlin.idea.refactoring.move.changePackage.MoveFileToPackageMatchingDirectoryIntention.applyTo[LocalVariableDescriptor]

