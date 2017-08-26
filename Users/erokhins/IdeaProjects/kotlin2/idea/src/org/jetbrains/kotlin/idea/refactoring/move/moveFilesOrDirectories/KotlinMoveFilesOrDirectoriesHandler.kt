'MoveFilesOrDirectoriesHandler' @ [31:45] ==> public constructor MoveFilesOrDirectoriesHandler() defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesHandler[JavaClassConstructorDescriptor]

'elements' @ [33:16] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements[ValueParameterDescriptorImpl]

'map' @ [33:25] ==> public inline fun <T, R> Array<out PsiElement>.map(transform: (PsiElement) -> (PsiElement..PsiElement?)): List<(PsiElement..PsiElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'when {
                it is PsiFile || it is PsiDirectory -> it
                it is PsiClass && it.containingClass == null -> it.containingFile
                it is KtClassOrObject && it.parent is KtFile -> it.parent
                else -> return null
            }' @ [34:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (PsiElement..PsiElement?), entry1: (PsiElement..PsiElement?), entry2: (PsiElement..PsiElement?), entry3: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [35:17] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [35:34] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [35:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [36:17] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [36:35] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [36:38] ==> public final val PsiClass.containingClass: PsiClass?[MyPropertyDescriptor]

'it' @ [36:65] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [36:68] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'it' @ [37:17] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [37:42] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [37:45] ==> public final val KtClassOrObject.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'it' @ [37:65] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustElements.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [37:68] ==> public final val KtClassOrObject.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'toTypedArray' @ [40:11] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'adjustElements' @ [44:32] ==> private final fun adjustElements(elements: Array<out PsiElement>): Array<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler[SimpleFunctionDescriptorImpl]

'elements' @ [44:47] ==> value-parameter elements: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.canMove[ValueParameterDescriptorImpl]

'adjustedElements' @ [45:13] ==> val adjustedElements: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.canMove[LocalVariableDescriptor]

'none' @ [45:30] ==> public inline fun <T> Array<out PsiElement>.none(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [45:37] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.canMove.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [47:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler[LazyClassReceiverParameterDescriptor]

'canMove' @ [47:22] ==> public open fun canMove(p0: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>?), p1: PsiElement?): Boolean defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesHandler[JavaMethodDescriptor]

'adjustedElements' @ [47:30] ==> val adjustedElements: Array<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.canMove[LocalVariableDescriptor]

'targetContainer' @ [47:48] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.canMove[ValueParameterDescriptorImpl]

'adjustElements' @ [51:16] ==> private final fun adjustElements(elements: Array<out PsiElement>): Array<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler[SimpleFunctionDescriptorImpl]

'sourceElements' @ [51:31] ==> value-parameter sourceElements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.adjustForMove[ValueParameterDescriptorImpl]

'!' @ [55:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetContainer' @ [55:15] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove[ValueParameterDescriptorImpl]

'targetContainer' @ [55:42] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove[ValueParameterDescriptorImpl]

'targetContainer' @ [55:77] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove[ValueParameterDescriptorImpl]

'moveFilesOrDirectories' @ [57:9] ==> public fun moveFilesOrDirectories(project: Project, elements: Array<PsiElement>, targetElement: PsiElement?, moveCallback: MoveCallback? = ...): Unit defined in org.jetbrains.kotlin.idea.refactoring.move in file moveFilesUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [58:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove[ValueParameterDescriptorImpl]

'adjustForMove' @ [59:17] ==> public open fun adjustForMove(project: Project, sourceElements: Array<out PsiElement>, targetElement: PsiElement?): Array<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler[SimpleFunctionDescriptorImpl]

'project' @ [59:31] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove[ValueParameterDescriptorImpl]

'elements' @ [59:40] ==> value-parameter elements: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove[ValueParameterDescriptorImpl]

'targetContainer' @ [59:50] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove[ValueParameterDescriptorImpl]

'targetContainer' @ [60:17] ==> value-parameter targetContainer: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove[ValueParameterDescriptorImpl]

'callback' @ [61:17] ==> value-parameter callback: MoveCallback? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove[ValueParameterDescriptorImpl]

'let' @ [61:27] ==> @InlineOnly public inline fun <T, R> MoveCallback.let(block: (MoveCallback) -> MoveCallback): MoveCallback defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MoveCallback
    <R> -> MoveCallback

'MoveCallback' @ [61:33] ==> public fun MoveCallback(function: () -> Unit): MoveCallback defined in com.intellij.refactoring.move[SamConstructorDescriptorImpl]

'it' @ [61:48] ==> value-parameter it: MoveCallback defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.doMove.<anonymous>[ValueParameterDescriptorImpl]

'refactoringCompleted' @ [61:51] ==> public abstract fun refactoringCompleted(): Unit defined in com.intellij.refactoring.move.MoveCallback[JavaMethodDescriptor]

'element' @ [66:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.tryToMove[ValueParameterDescriptorImpl]

'doMove' @ [67:13] ==> public open fun doMove(project: Project, elements: Array<out PsiElement>, targetContainer: PsiElement?, callback: MoveCallback?): Unit defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler[SimpleFunctionDescriptorImpl]

'project' @ [67:20] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.tryToMove[ValueParameterDescriptorImpl]

'element' @ [67:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.tryToMove[ValueParameterDescriptorImpl]

'files' @ [67:37] ==> public final val files: Collection<KtFile> defined in org.jetbrains.kotlin.asJava.classes.KtLightClassForFacade[DeserializedPropertyDescriptor]

'toTypedArray' @ [67:43] ==> public inline fun <reified T> Collection<KtFile>.toTypedArray(): Array<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtFile

'dataContext' @ [67:59] ==> value-parameter dataContext: DataContext? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.tryToMove[ValueParameterDescriptorImpl]

'getData' @ [67:72] ==> @Nullable public open fun <T : (Any..Any?)> getData(@NotNull p0: DataKey<(PsiElement..PsiElement?)>): PsiElement? defined in com.intellij.openapi.actionSystem.DataContext[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'TARGET_PSI_ELEMENT' @ [67:93] ==> public final val TARGET_PSI_ELEMENT: (DataKey<(PsiElement..PsiElement?)>..DataKey<(PsiElement..PsiElement?)>?) defined in com.intellij.openapi.actionSystem.LangDataKeys[JavaPropertyDescriptor]

'super' @ [71:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler[LazyClassReceiverParameterDescriptor]

'tryToMove' @ [71:22] ==> public open fun tryToMove(p0: (PsiElement..PsiElement?), p1: (Project..Project?), p2: (DataContext..DataContext?), p3: PsiReference?, p4: (Editor..Editor?)): Boolean defined in com.intellij.refactoring.move.moveFilesOrDirectories.MoveFilesOrDirectoriesHandler[JavaMethodDescriptor]

'element' @ [71:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.tryToMove[ValueParameterDescriptorImpl]

'project' @ [71:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.tryToMove[ValueParameterDescriptorImpl]

'dataContext' @ [71:50] ==> value-parameter dataContext: DataContext? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.tryToMove[ValueParameterDescriptorImpl]

'reference' @ [71:63] ==> value-parameter reference: PsiReference? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.tryToMove[ValueParameterDescriptorImpl]

'editor' @ [71:74] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.refactoring.move.moveFilesOrDirectories.KotlinMoveFilesOrDirectoriesHandler.tryToMove[ValueParameterDescriptorImpl]

