'KotlinQuickFixAction<KtWhenExpression>' @ [30:58] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtWhenExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtWhenExpression

'element' @ [30:97] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.<init>[ValueParameterDescriptorImpl]

'familyName' @ [33:30] ==> public final val MoveWhenElseBranchFix.familyName: String[MyPropertyDescriptor]

'element' @ [36:23] ==> protected final val element: KtWhenExpression? defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix[PropertyDescriptorImpl]

'super' @ [37:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [37:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [37:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [37:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [37:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.isAvailable[ValueParameterDescriptorImpl]

'checkWhenExpressionHasSingleElse' @ [37:70] ==> public open fun checkWhenExpressionHasSingleElse(@NotNull p0: KtWhenExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [37:103] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.isAvailable[LocalVariableDescriptor]

'element' @ [41:23] ==> protected final val element: KtWhenExpression? defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix[PropertyDescriptorImpl]

'element' @ [42:23] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'entries' @ [42:31] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'entries' @ [43:25] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'lastOrNull' @ [43:33] ==> public fun <T> List<(KtWhenEntry..KtWhenEntry?)>.lastOrNull(): KtWhenEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'entries' @ [44:25] ==> val entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>) defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'singleOrNull' @ [44:33] ==> public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.singleOrNull(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): KtWhenEntry? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [44:48] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'isElse' @ [44:51] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'editor' @ [46:28] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [46:37] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [46:48] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'elseEntry' @ [46:57] ==> val elseEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'textOffset' @ [46:67] ==> public final val KtWhenEntry.textOffset: Int[MyPropertyDescriptor]

'element' @ [48:30] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'addAfter' @ [48:38] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtWhenExpression[JavaMethodDescriptor]

'elseEntry' @ [48:47] ==> val elseEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'lastEntry' @ [48:58] ==> val lastEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'elseEntry' @ [49:9] ==> val elseEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'delete' @ [49:19] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtWhenEntry[JavaMethodDescriptor]

'forcePsiPostprocessAndRestoreElement' @ [50:53] ==> public open fun <T : (PsiElement..PsiElement?)> forcePsiPostprocessAndRestoreElement(@NotNull p0: KtWhenEntry): (KtWhenEntry..KtWhenEntry?) defined in com.intellij.codeInsight.CodeInsightUtilCore[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtWhenEntry

'insertedBranch' @ [50:90] ==> val insertedBranch: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'editor' @ [52:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [52:16] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [52:27] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'insertedWhenEntry' @ [52:40] ==> val insertedWhenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'textOffset' @ [52:58] ==> public final val KtWhenEntry.textOffset: Int[MyPropertyDescriptor]

'cursorOffset' @ [52:71] ==> val cursorOffset: Int defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [55:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [57:34] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [57:45] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [57:56] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtWhenExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtWhenExpression

'MoveWhenElseBranchFix' @ [58:20] ==> public constructor MoveWhenElseBranchFix(element: KtWhenExpression) defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix[ClassConstructorDescriptorImpl]

'whenExpression' @ [58:42] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.MoveWhenElseBranchFix.Companion.createAction[LocalVariableDescriptor]

