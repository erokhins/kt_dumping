'name' @ [31:36] ==> public final val RenameIdentifierFix.name: String[MyPropertyDescriptor]

'descriptor' @ [36:23] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [36:34] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [37:20] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'containingFile' @ [37:28] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'!' @ [38:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [38:38] ==> public open fun getInstance(): (FileModificationService..FileModificationService?) defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'prepareFileForWrite' @ [38:52] ==> public abstract fun prepareFileForWrite(@Nullable p0: PsiFile?): Boolean defined in com.intellij.codeInsight.FileModificationService[JavaMethodDescriptor]

'file' @ [38:72] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'getInstance' @ [39:47] ==> public open fun getInstance(@NotNull p0: Project): (FileEditorManager..FileEditorManager?) defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'project' @ [39:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[ValueParameterDescriptorImpl]

'editorManager' @ [40:26] ==> val editorManager: (FileEditorManager..FileEditorManager?) defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'getSelectedEditor' @ [40:40] ==> @Nullable public abstract fun getSelectedEditor(@NotNull p0: VirtualFile): FileEditor? defined in com.intellij.openapi.fileEditor.FileEditorManager[JavaMethodDescriptor]

'file' @ [40:58] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'virtualFile' @ [40:63] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'renameWithoutEditor' @ [40:86] ==> private final fun renameWithoutEditor(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix[SimpleFunctionDescriptorImpl]

'element' @ [40:106] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'getInstance' @ [41:39] ==> public open fun getInstance(): (DataManager..DataManager?) defined in com.intellij.ide.DataManager[JavaMethodDescriptor]

'getDataContext' @ [41:53] ==> public abstract fun getDataContext(p0: (Component..Component?)): (DataContext..DataContext?) defined in com.intellij.ide.DataManager[JavaMethodDescriptor]

'fileEditor' @ [41:68] ==> val fileEditor: FileEditor defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'component' @ [41:79] ==> public final val FileEditor.component: JComponent[MyPropertyDescriptor]

'getInstance' @ [42:51] ==> public open fun getInstance(): (RenameHandlerRegistry..RenameHandlerRegistry?) defined in com.intellij.refactoring.rename.RenameHandlerRegistry[JavaMethodDescriptor]

'getRenameHandler' @ [42:65] ==> @Nullable public open fun getRenameHandler(p0: (DataContext..DataContext?)): RenameHandler? defined in com.intellij.refactoring.rename.RenameHandlerRegistry[JavaMethodDescriptor]

'dataContext' @ [42:82] ==> val dataContext: (DataContext..DataContext?) defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'editorManager' @ [44:22] ==> val editorManager: (FileEditorManager..FileEditorManager?) defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'selectedTextEditor' @ [44:36] ==> public final val FileEditorManager.selectedTextEditor: Editor?[MyPropertyDescriptor]

'if (editor != null) {
            renameHandler?.invoke(project, editor, file, dataContext)
        }
        else {
            val elementToRename = getElementToRename(element) ?: return
            renameHandler?.invoke(project, arrayOf(elementToRename), dataContext)
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'editor' @ [45:13] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'renameHandler' @ [46:13] ==> val renameHandler: RenameHandler? defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'invoke' @ [46:28] ==> public abstract fun invoke(@NotNull p0: Project, p1: (Editor..Editor?), p2: (PsiFile..PsiFile?), p3: (DataContext..DataContext?)): Unit defined in com.intellij.refactoring.rename.RenameHandler[JavaMethodDescriptor]

'project' @ [46:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[ValueParameterDescriptorImpl]

'editor' @ [46:44] ==> val editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'file' @ [46:52] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'dataContext' @ [46:58] ==> val dataContext: (DataContext..DataContext?) defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'getElementToRename' @ [49:35] ==> protected open fun getElementToRename(element: PsiElement): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix[SimpleFunctionDescriptorImpl]

'element' @ [49:54] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'renameHandler' @ [50:13] ==> val renameHandler: RenameHandler? defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'invoke' @ [50:28] ==> public abstract fun invoke(@NotNull p0: Project, @NotNull p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>), p2: (DataContext..DataContext?)): Unit defined in com.intellij.refactoring.rename.RenameHandler[JavaMethodDescriptor]

'project' @ [50:35] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[ValueParameterDescriptorImpl]

'arrayOf' @ [50:44] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'elementToRename' @ [50:52] ==> val elementToRename: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'dataContext' @ [50:70] ==> val dataContext: (DataContext..DataContext?) defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.applyFix[LocalVariableDescriptor]

'element' @ [54:79] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.getElementToRename[ValueParameterDescriptorImpl]

'parent' @ [54:87] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getElementToRename' @ [57:31] ==> protected open fun getElementToRename(element: PsiElement): PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix[SimpleFunctionDescriptorImpl]

'element' @ [57:50] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.renameWithoutEditor[ValueParameterDescriptorImpl]

'getInstance' @ [58:42] ==> public open fun getInstance(p0: (Project..Project?)): (RefactoringFactory..RefactoringFactory?) defined in com.intellij.refactoring.RefactoringFactory[JavaMethodDescriptor]

'element' @ [58:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.renameWithoutEditor[ValueParameterDescriptorImpl]

'project' @ [58:62] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'factory' @ [59:33] ==> val factory: (RefactoringFactory..RefactoringFactory?) defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.renameWithoutEditor[LocalVariableDescriptor]

'createRename' @ [59:41] ==> public abstract fun createRename(p0: (PsiElement..PsiElement?), p1: (String..String?), p2: Boolean, p3: Boolean): (RenameRefactoring..RenameRefactoring?) defined in com.intellij.refactoring.RefactoringFactory[JavaMethodDescriptor]

'elementToRename' @ [59:54] ==> val elementToRename: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.renameWithoutEditor[LocalVariableDescriptor]

'renameRefactoring' @ [60:9] ==> val renameRefactoring: (RenameRefactoring..RenameRefactoring?) defined in org.jetbrains.kotlin.idea.quickfix.RenameIdentifierFix.renameWithoutEditor[LocalVariableDescriptor]

'run' @ [60:27] ==> public abstract fun run(): Unit defined in com.intellij.refactoring.RenameRefactoring[JavaMethodDescriptor]

