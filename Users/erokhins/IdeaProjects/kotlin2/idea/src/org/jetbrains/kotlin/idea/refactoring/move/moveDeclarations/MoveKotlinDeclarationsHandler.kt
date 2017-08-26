'MoveHandlerDelegate' @ [48:39] ==> public constructor MoveHandlerDelegate() defined in com.intellij.refactoring.move.MoveHandlerDelegate[JavaClassConstructorDescriptor]

'if (elements.any { it.parent !is KtFile }) { e ->
                    when (e) {
                        is KtNamedDeclaration -> e.containingClassOrObject ?: e.parent
                        is KtFile -> e.parent
                        else -> null
                    }
                }
                else { e ->
                    e.containingFile?.parent
                }' @ [51:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement) -> PsiElement?, elseBranch: (PsiElement) -> PsiElement?): (PsiElement) -> PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Function1<PsiElement, PsiElement?>

'elements' @ [51:21] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.getUniqueContainer[ValueParameterDescriptorImpl]

'any' @ [51:30] ==> public inline fun <T> Array<out PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [51:36] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.getUniqueContainer.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [51:39] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (e) {
                        is KtNamedDeclaration -> e.containingClassOrObject ?: e.parent
                        is KtFile -> e.parent
                        else -> null
                    }' @ [52:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'e' @ [52:27] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.getUniqueContainer.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [53:50] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.getUniqueContainer.<anonymous>[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [53:52] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'e' @ [53:79] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.getUniqueContainer.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [53:81] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'e' @ [54:38] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.getUniqueContainer.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [54:40] ==> public final val KtFile.parent: PsiDirectory?[MyPropertyDescriptor]

'e' @ [59:21] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.getUniqueContainer.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [59:23] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'parent' @ [59:39] ==> public final val PsiFile.parent: PsiDirectory?[MyPropertyDescriptor]

'elements' @ [61:16] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.getUniqueContainer[ValueParameterDescriptorImpl]

'mapNotNullTo' @ [61:25] ==> public inline fun <T, R : Any, C : MutableCollection<in PsiElement>> Array<out PsiElement>.mapNotNullTo(destination: LinkedHashSet<PsiElement>, transform: (PsiElement) -> PsiElement?): LinkedHashSet<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R : Any> -> PsiElement
    <C : MutableCollection<in R>> -> LinkedHashSet<PsiElement>

'LinkedHashSet' @ [61:38] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'getContainer' @ [61:55] ==> val getContainer: (PsiElement) -> PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.getUniqueContainer[LocalVariableDescriptor]

'singleOrNull' @ [61:69] ==> public fun <T> Iterable<PsiElement>.singleOrNull(): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'if (this is KtClassOrObject) !isLocal else parent is KtFile' @ [64:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'this' @ [64:52] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ReceiverParameterDescriptorImpl]

'!' @ [64:77] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [64:78] ==> public final val KtClassOrObject.isLocal: Boolean[MyPropertyDescriptor]

'parent' @ [64:91] ==> public final val KtNamedDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [69:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkReadOnlyStatusRecursively' @ [69:36] ==> public open fun checkReadOnlyStatusRecursively(@NotNull p0: Project, @NotNull p1: (MutableCollection<out (PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>), p2: Boolean): Boolean defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [69:67] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'elements' @ [69:76] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'toList' @ [69:85] ==> public fun <T> Array<out PsiElement>.toList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'getUniqueContainer' @ [71:25] ==> private final fun getUniqueContainer(elements: Array<out PsiElement>): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'elements' @ [71:44] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'container' @ [72:13] ==> val container: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'showErrorHint' @ [73:35] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [74:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'editor' @ [74:30] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'MOVE_DECLARATIONS' @ [74:101] ==> private val MOVE_DECLARATIONS: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations in file MoveKotlinDeclarationsHandler.kt[PropertyDescriptorImpl]

'elements' @ [79:32] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'flatMapTo' @ [79:41] ==> public inline fun <T, R, C : MutableCollection<in KtNamedDeclaration>> Array<out PsiElement>.flatMapTo(destination: LinkedHashSet<KtNamedDeclaration>, transform: (PsiElement) -> Iterable<KtNamedDeclaration>): LinkedHashSet<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KtNamedDeclaration
    <C : MutableCollection<in R>> -> LinkedHashSet<KtNamedDeclaration>

'LinkedHashSet' @ [79:51] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedDeclaration

'when (it) {
                is KtNamedDeclaration -> listOf(it)
                is KtFile -> it.declarations.filterIsInstance<KtNamedDeclaration>()
                else -> emptyList()
            }' @ [80:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<KtNamedDeclaration>, entry1: List<KtNamedDeclaration>, entry2: List<KtNamedDeclaration>): List<KtNamedDeclaration>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<KtNamedDeclaration>

'it' @ [80:19] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [81:42] ==> public fun <T> listOf(element: KtNamedDeclaration): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'it' @ [81:49] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [82:30] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [82:33] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'filterIsInstance' @ [82:46] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtNamedDeclaration

'emptyList' @ [83:25] ==> public fun <T> emptyList(): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'elementsToSearch' @ [88:13] ==> val elementsToSearch: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'any' @ [88:30] ==> public inline fun <T> Iterable<KtNamedDeclaration>.any(predicate: (KtNamedDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'it' @ [88:36] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [88:65] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck.<anonymous>[ValueParameterDescriptorImpl]

'isCompanion' @ [88:68] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'getCannotRefactorMessage' @ [89:45] ==> public open fun getCannotRefactorMessage(@Nullable p0: String?): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'showErrorHint' @ [90:35] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [90:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'editor' @ [90:58] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'message' @ [90:66] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'MOVE_DECLARATIONS' @ [90:75] ==> private val MOVE_DECLARATIONS: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations in file MoveKotlinDeclarationsHandler.kt[PropertyDescriptorImpl]

'elementsToSearch' @ [94:13] ==> val elementsToSearch: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'any' @ [94:30] ==> public inline fun <T> Iterable<KtNamedDeclaration>.any(predicate: (KtNamedDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'!' @ [94:36] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [94:37] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [94:40] ==> private final fun KtNamedDeclaration.canMove(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'getCannotRefactorMessage' @ [95:45] ==> public open fun getCannotRefactorMessage(@Nullable p0: String?): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'showErrorHint' @ [96:35] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [96:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'editor' @ [96:58] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'message' @ [96:66] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'MOVE_DECLARATIONS' @ [96:75] ==> private val MOVE_DECLARATIONS: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations in file MoveKotlinDeclarationsHandler.kt[PropertyDescriptorImpl]

'elementsToSearch' @ [100:13] ==> val elementsToSearch: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'any' @ [100:30] ==> public inline fun <T> Iterable<KtNamedDeclaration>.any(predicate: (KtNamedDeclaration) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'it' @ [100:36] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck.<anonymous>[ValueParameterDescriptorImpl]

'getCannotRefactorMessage' @ [101:45] ==> public open fun getCannotRefactorMessage(@Nullable p0: String?): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'showErrorHint' @ [102:35] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [102:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'editor' @ [102:58] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'message' @ [102:66] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'MOVE_DECLARATIONS' @ [102:75] ==> private val MOVE_DECLARATIONS: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations in file MoveKotlinDeclarationsHandler.kt[PropertyDescriptorImpl]

'elements' @ [106:13] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'all' @ [106:22] ==> public inline fun <T> Array<out PsiElement>.all(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [106:28] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck.<anonymous>[ValueParameterDescriptorImpl]

'when {
                targetContainer is PsiPackage || targetContainer is PsiDirectory -> targetContainer
                container is PsiPackage || container is PsiDirectory -> container
                else -> null
            }' @ [107:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'targetContainer' @ [108:17] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'targetContainer' @ [108:50] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'targetContainer' @ [108:85] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'container' @ [109:17] ==> val container: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'container' @ [109:44] ==> val container: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'container' @ [109:73] ==> val container: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'resolveToDirectory' @ [112:69] ==> @Nullable public open fun resolveToDirectory(p0: (Project..Project?), p1: (PsiElement..PsiElement?)): PsiDirectory? defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesUtil[JavaMethodDescriptor]

'project' @ [112:88] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'initialTargetElement' @ [112:97] ==> val initialTargetElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'KotlinAwareMoveFilesOrDirectoriesDialog' @ [113:26] ==> public constructor KotlinAwareMoveFilesOrDirectoriesDialog(project: Project, callback: (KotlinAwareMoveFilesOrDirectoriesDialog?) -> Unit) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ui.KotlinAwareMoveFilesOrDirectoriesDialog[ClassConstructorDescriptorImpl]

'project' @ [113:66] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'invokeMoveFilesOrDirectoriesRefactoring' @ [114:17] ==> public fun invokeMoveFilesOrDirectoriesRefactoring(moveDialog: KotlinAwareMoveFilesOrDirectoriesDialog?, project: Project, elements: Array<out PsiElement>, initialTargetDirectory: PsiDirectory?, moveCallback: MoveCallback?): Unit defined in org.jetbrains.kotlin.idea.refactoring.move[SimpleFunctionDescriptorImpl]

'it' @ [114:57] ==> value-parameter it: KotlinAwareMoveFilesOrDirectoriesDialog? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [114:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'elements' @ [114:70] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'initialTargetDirectory' @ [114:80] ==> val initialTargetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'callback' @ [114:104] ==> value-parameter callback: MoveCallback? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'dialog' @ [116:13] ==> val dialog: KotlinAwareMoveFilesOrDirectoriesDialog defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'setData' @ [116:20] ==> public final fun setData(psiElements: Array<out PsiElement>, initialTargetDirectory: PsiDirectory?, helpID: String): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ui.KotlinAwareMoveFilesOrDirectoriesDialog[SimpleFunctionDescriptorImpl]

'elements' @ [116:28] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'initialTargetDirectory' @ [116:38] ==> val initialTargetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'dialog' @ [117:13] ==> val dialog: KotlinAwareMoveFilesOrDirectoriesDialog defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'show' @ [117:20] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ui.KotlinAwareMoveFilesOrDirectoriesDialog[JavaMethodDescriptor]

'when (container) {
            is PsiDirectory, is PsiPackage, is KtFile -> {
                val targetPackageName = MoveClassesOrPackagesImpl.getInitialTargetPackageName(targetContainer, elements)
                val targetDirectory = if (targetContainer != null) {
                    MoveClassesOrPackagesImpl.getInitialTargetDirectory(targetContainer, elements)
                }
                else null
                val searchInComments = JavaRefactoringSettings.getInstance()!!.MOVE_SEARCH_IN_COMMENTS
                val searchInText = JavaRefactoringSettings.getInstance()!!.MOVE_SEARCH_FOR_TEXT
                val targetFile = targetContainer as? KtFile
                val moveToPackage = targetContainer !is KtFile

                MoveKotlinTopLevelDeclarationsDialog(
                        project, elementsToSearch, targetPackageName, targetDirectory, targetFile, moveToPackage, searchInComments, searchInText, callback
                ).show()
            }

            is KtClassOrObject -> {
                if (elementsToSearch.size > 1) {
                    // todo: allow moving multiple classes to upper level
                    if (targetContainer !is KtClassOrObject) {
                        val message = RefactoringBundle.getCannotRefactorMessage("Moving multiple nested classes to top-level is not supported")
                        CommonRefactoringUtil.showErrorHint(project, editor, message, MOVE_DECLARATIONS, null)
                        return true
                    }
                    @Suppress("UNCHECKED_CAST")
                    MoveKotlinNestedClassesDialog(project,
                                                  elementsToSearch.filterIsInstance<KtClassOrObject>(),
                                                  container,
                                                  targetContainer,
                                                  callback).show()
                    return true
                }
                KotlinSelectNestedClassRefactoringDialog.chooseNestedClassRefactoring(elementsToSearch.first() as KtClassOrObject,
                                                                                      targetContainer)
            }

            else -> throw AssertionError("Unexpected container: ${container.getElementTextWithContext()}")
        }' @ [122:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'container' @ [122:15] ==> val container: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'getInitialTargetPackageName' @ [124:67] ==> public open fun getInitialTargetPackageName(p0: (PsiElement..PsiElement?), p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?)): (String..String?) defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassesOrPackagesImpl[JavaMethodDescriptor]

'targetContainer' @ [124:95] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'elements' @ [124:112] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'if (targetContainer != null) {
                    MoveClassesOrPackagesImpl.getInitialTargetDirectory(targetContainer, elements)
                }
                else null' @ [125:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiDirectory?, elseBranch: PsiDirectory?): PsiDirectory?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiDirectory?

'targetContainer' @ [125:43] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'getInitialTargetDirectory' @ [126:47] ==> public open fun getInitialTargetDirectory(p0: (PsiElement..PsiElement?), p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?)): (PsiDirectory..PsiDirectory?) defined in com.intellij.refactoring.move.moveClassesOrPackages.MoveClassesOrPackagesImpl[JavaMethodDescriptor]

'targetContainer' @ [126:73] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'elements' @ [126:90] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'!!' @ [129:40] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: JavaRefactoringSettings?): JavaRefactoringSettings[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> JavaRefactoringSettings

'getInstance' @ [129:64] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'MOVE_SEARCH_IN_COMMENTS' @ [129:80] ==> public final var MOVE_SEARCH_IN_COMMENTS: Boolean defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

'!!' @ [130:36] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: JavaRefactoringSettings?): JavaRefactoringSettings[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> JavaRefactoringSettings

'getInstance' @ [130:60] ==> public open fun getInstance(): (JavaRefactoringSettings..JavaRefactoringSettings?) defined in com.intellij.refactoring.JavaRefactoringSettings[JavaMethodDescriptor]

'MOVE_SEARCH_FOR_TEXT' @ [130:76] ==> public final var MOVE_SEARCH_FOR_TEXT: Boolean defined in com.intellij.refactoring.JavaRefactoringSettings[JavaPropertyDescriptor]

'targetContainer' @ [131:34] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'targetContainer' @ [132:37] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'MoveKotlinTopLevelDeclarationsDialog' @ [134:17] ==> public constructor MoveKotlinTopLevelDeclarationsDialog(@NotNull project: Project, @NotNull elementsToMove: (MutableSet<(KtNamedDeclaration..KtNamedDeclaration?)>..Set<(KtNamedDeclaration..KtNamedDeclaration?)>), @Nullable targetPackageName: String?, @Nullable targetDirectory: PsiDirectory?, @Nullable targetFile: KtFile?, moveToPackage: Boolean, searchInComments: Boolean, searchForTextOccurences: Boolean, @Nullable moveCallback: MoveCallback?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ui.MoveKotlinTopLevelDeclarationsDialog[JavaClassConstructorDescriptor]

'project' @ [135:25] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'elementsToSearch' @ [135:34] ==> val elementsToSearch: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'targetPackageName' @ [135:52] ==> val targetPackageName: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'targetDirectory' @ [135:71] ==> val targetDirectory: PsiDirectory? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'targetFile' @ [135:88] ==> val targetFile: KtFile? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'moveToPackage' @ [135:100] ==> val moveToPackage: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'searchInComments' @ [135:115] ==> val searchInComments: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'searchInText' @ [135:133] ==> val searchInText: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'callback' @ [135:147] ==> value-parameter callback: MoveCallback? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'show' @ [136:19] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ui.MoveKotlinTopLevelDeclarationsDialog[JavaMethodDescriptor]

'elementsToSearch' @ [140:21] ==> val elementsToSearch: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'size' @ [140:38] ==> public open val size: Int defined in java.util.LinkedHashSet[JavaPropertyDescriptor]

'targetContainer' @ [142:25] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'getCannotRefactorMessage' @ [143:57] ==> public open fun getCannotRefactorMessage(@Nullable p0: String?): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'showErrorHint' @ [144:47] ==> public open fun showErrorHint(@NotNull p0: Project, @Nullable p1: Editor?, @NotNull @Nls p2: String, @NotNull @Nls p3: String, @Nullable p4: String?): Unit defined in com.intellij.refactoring.util.CommonRefactoringUtil[JavaMethodDescriptor]

'project' @ [144:61] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'editor' @ [144:70] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'message' @ [144:78] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'MOVE_DECLARATIONS' @ [144:87] ==> private val MOVE_DECLARATIONS: String defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations in file MoveKotlinDeclarationsHandler.kt[PropertyDescriptorImpl]

'Suppress' @ [147:21] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'MoveKotlinNestedClassesDialog' @ [148:21] ==> public constructor MoveKotlinNestedClassesDialog(@NotNull project: Project, @NotNull elementsToMove: (MutableList<(KtClassOrObject..KtClassOrObject?)>..List<(KtClassOrObject..KtClassOrObject?)>), @NotNull originalClass: KtClassOrObject, @NotNull targetClass: KtClassOrObject, @Nullable moveCallback: MoveCallback?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ui.MoveKotlinNestedClassesDialog[JavaClassConstructorDescriptor]

'project' @ [148:51] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'elementsToSearch' @ [149:51] ==> val elementsToSearch: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'filterIsInstance' @ [149:68] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtClassOrObject> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtClassOrObject

'container' @ [150:51] ==> val container: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'targetContainer' @ [151:51] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'callback' @ [152:51] ==> value-parameter callback: MoveCallback? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'show' @ [152:61] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ui.MoveKotlinNestedClassesDialog[JavaMethodDescriptor]

'KotlinSelectNestedClassRefactoringDialog' @ [155:17] ==> public companion object defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ui.KotlinSelectNestedClassRefactoringDialog[FakeCallableDescriptorForObject]

'chooseNestedClassRefactoring' @ [155:58] ==> public final fun chooseNestedClassRefactoring(nestedClass: KtClassOrObject, targetContainer: PsiElement?): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.ui.KotlinSelectNestedClassRefactoringDialog.Companion[SimpleFunctionDescriptorImpl]

'elementsToSearch' @ [155:87] ==> val elementsToSearch: LinkedHashSet<KtNamedDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'first' @ [155:104] ==> public fun <T> Iterable<KtNamedDeclaration>.first(): KtNamedDeclaration defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'targetContainer' @ [156:87] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[ValueParameterDescriptorImpl]

'AssertionError' @ [159:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'container' @ [159:67] ==> val container: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMoveWithCheck[LocalVariableDescriptor]

'getElementTextWithContext' @ [159:77] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'!' @ [166:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [166:14] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[LazyClassReceiverParameterDescriptor]

'canMove' @ [166:20] ==> public open fun canMove(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), @Nullable p1: PsiElement?): Boolean defined in com.intellij.refactoring.move.MoveHandlerDelegate[JavaMethodDescriptor]

'elements' @ [166:28] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'targetContainer' @ [166:38] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'getUniqueContainer' @ [167:25] ==> private final fun getUniqueContainer(elements: Array<out PsiElement>): PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'elements' @ [167:44] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'container' @ [169:13] ==> val container: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[LocalVariableDescriptor]

'targetContainer' @ [169:45] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'targetContainer' @ [169:72] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'elements' @ [169:111] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'size' @ [169:120] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'elements' @ [173:16] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'all' @ [173:25] ==> public inline fun <T> Array<out PsiElement>.all(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'when {
                e is KtClass || e is KtObjectDeclaration && !e.isObjectLiteral() || e is KtNamedFunction || e is KtProperty ->
                    (editorMode || (e as KtNamedDeclaration).canMove()) && e.canRefactor()
                e is KtFile ->
                    e.declarations.any { it is KtNamedDeclaration } && e.canRefactor()
                else ->
                    false
            }' @ [174:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'e' @ [175:17] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [175:33] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [175:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'e' @ [175:62] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'isObjectLiteral' @ [175:64] ==> public final fun isObjectLiteral(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'e' @ [175:85] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [175:109] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'editorMode' @ [176:22] ==> value-parameter editorMode: Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'e' @ [176:37] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [176:62] ==> private final fun KtNamedDeclaration.canMove(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'e' @ [176:76] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'canRefactor' @ [176:78] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'e' @ [177:17] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [178:21] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'declarations' @ [178:23] ==> public final val KtFile.declarations: List<(KtDeclaration..KtDeclaration?)>[MyPropertyDescriptor]

'any' @ [178:36] ==> public inline fun <T> Iterable<(KtDeclaration..KtDeclaration?)>.any(predicate: ((KtDeclaration..KtDeclaration?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'it' @ [178:42] ==> value-parameter it: (KtDeclaration..KtDeclaration?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [178:72] ==> value-parameter e: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'canRefactor' @ [178:74] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'canMove' @ [186:16] ==> private final fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?, editorMode: Boolean): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'elements' @ [186:24] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'targetContainer' @ [186:34] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.canMove[ValueParameterDescriptorImpl]

'psiElement' @ [190:16] ==> value-parameter psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.isValidTarget[ValueParameterDescriptorImpl]

'psiElement' @ [191:20] ==> value-parameter psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.isValidTarget[ValueParameterDescriptorImpl]

'psiElement' @ [191:50] ==> value-parameter psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.isValidTarget[ValueParameterDescriptorImpl]

'getPackage' @ [191:61] ==> public fun PsiDirectory.getPackage(): PsiPackage? defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [192:19] ==> value-parameter psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.isValidTarget[ValueParameterDescriptorImpl]

'psiElement' @ [193:20] ==> value-parameter psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.isValidTarget[ValueParameterDescriptorImpl]

'!' @ [194:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [194:25] ==> value-parameter psiElement: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.isValidTarget[ValueParameterDescriptorImpl]

'hasModifier' @ [194:36] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'ANNOTATION_KEYWORD' @ [194:57] ==> public final val ANNOTATION_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'!' @ [195:23] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sources' @ [195:24] ==> value-parameter sources: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.isValidTarget[ValueParameterDescriptorImpl]

'any' @ [195:32] ==> public inline fun <T> Array<out PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [195:38] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.isValidTarget.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [195:41] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'doMoveWithCheck' @ [199:9] ==> private final fun doMoveWithCheck(project: Project, elements: Array<out PsiElement>, targetContainer: PsiElement?, callback: MoveCallback?, editor: Editor?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'project' @ [199:25] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMove[ValueParameterDescriptorImpl]

'elements' @ [199:34] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMove[ValueParameterDescriptorImpl]

'targetContainer' @ [199:44] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMove[ValueParameterDescriptorImpl]

'callback' @ [199:61] ==> value-parameter callback: MoveCallback? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.doMove[ValueParameterDescriptorImpl]

'element' @ [205:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove[ValueParameterDescriptorImpl]

'unwrapped' @ [205:38] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'let' @ [205:49] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Array<PsiElement>): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Array<PsiElement>

'arrayOf' @ [205:55] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'it' @ [205:63] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove.<anonymous>[ValueParameterDescriptorImpl]

'EMPTY_ARRAY' @ [205:83] ==> public final val EMPTY_ARRAY: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?) defined in com.intellij.psi.PsiElement[JavaPropertyDescriptor]

'dataContext' @ [206:31] ==> value-parameter dataContext: DataContext? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove[ValueParameterDescriptorImpl]

'let' @ [206:44] ==> @InlineOnly public inline fun <T, R> DataContext.let(block: (DataContext) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataContext
    <R> -> PsiElement?

'TARGET_PSI_ELEMENT' @ [206:78] ==> public final val TARGET_PSI_ELEMENT: (DataKey<(PsiElement..PsiElement?)>..DataKey<(PsiElement..PsiElement?)>?) defined in com.intellij.openapi.actionSystem.LangDataKeys[JavaPropertyDescriptor]

'getData' @ [206:97] ==> @Nullable public open fun getData(@NotNull p0: DataContext): PsiElement? defined in com.intellij.openapi.actionSystem.DataKey[JavaMethodDescriptor]

'dataContext' @ [206:105] ==> value-parameter dataContext: DataContext defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove.<anonymous>[ValueParameterDescriptorImpl]

'canMove' @ [207:16] ==> private final fun canMove(elements: Array<out PsiElement>, targetContainer: PsiElement?, editorMode: Boolean): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'elementsToMove' @ [207:24] ==> val elementsToMove: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove[LocalVariableDescriptor]

'targetContainer' @ [207:40] ==> val targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove[LocalVariableDescriptor]

'doMoveWithCheck' @ [207:66] ==> private final fun doMoveWithCheck(project: Project, elements: Array<out PsiElement>, targetContainer: PsiElement?, callback: MoveCallback?, editor: Editor?): Boolean defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler[SimpleFunctionDescriptorImpl]

'project' @ [207:82] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove[ValueParameterDescriptorImpl]

'elementsToMove' @ [207:91] ==> val elementsToMove: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove[LocalVariableDescriptor]

'targetContainer' @ [207:107] ==> val targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove[LocalVariableDescriptor]

'editor' @ [207:130] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveDeclarations.MoveKotlinDeclarationsHandler.tryToMove[ValueParameterDescriptorImpl]

