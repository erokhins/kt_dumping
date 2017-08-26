'KotlinQuickFixAction<KtFunction>' @ [29:52] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtFunction) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtFunction

'element' @ [29:85] ==> value-parameter element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.<init>[ValueParameterDescriptorImpl]

'familyName' @ [32:30] ==> public final val RemoveFunctionBodyFix.familyName: String[MyPropertyDescriptor]

'element' @ [35:23] ==> protected final val element: KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix[PropertyDescriptorImpl]

'super' @ [36:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [36:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [36:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [36:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [36:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [36:60] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.isAvailable[LocalVariableDescriptor]

'hasBody' @ [36:68] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'element' @ [40:23] ==> protected final val element: KtFunction? defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix[PropertyDescriptorImpl]

'element' @ [41:30] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'bodyExpression' @ [41:38] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [42:27] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'equalsToken' @ [42:35] ==> public final val KtFunction.equalsToken: PsiElement?[MyPropertyDescriptor]

'if (equalsToken != null) {
            val commentSaver = CommentSaver(PsiChildRange(equalsToken.nextSibling, bodyExpression.prevSibling), true)
            element.deleteChildRange(equalsToken, bodyExpression)
            commentSaver.restore(element)
        }
        else {
            bodyExpression.delete()
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'equalsToken' @ [43:13] ==> val equalsToken: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'CommentSaver' @ [44:32] ==> public constructor CommentSaver(originalElements: PsiChildRange, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'PsiChildRange' @ [44:45] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'equalsToken' @ [44:59] ==> val equalsToken: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'nextSibling' @ [44:71] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'bodyExpression' @ [44:84] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'prevSibling' @ [44:99] ==> public final val KtExpression.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [45:13] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'deleteChildRange' @ [45:21] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtFunction[JavaMethodDescriptor]

'equalsToken' @ [45:38] ==> val equalsToken: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'bodyExpression' @ [45:51] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'commentSaver' @ [46:13] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'restore' @ [46:26] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'element' @ [46:34] ==> val element: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'bodyExpression' @ [49:13] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.invoke[LocalVariableDescriptor]

'delete' @ [49:28] ==> public abstract fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KotlinSingleIntentionActionFactory' @ [53:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [55:28] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [55:39] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [55:50] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtFunction? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtFunction

'RemoveFunctionBodyFix' @ [56:20] ==> public constructor RemoveFunctionBodyFix(element: KtFunction) defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix[ClassConstructorDescriptorImpl]

'function' @ [56:42] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.quickfix.RemoveFunctionBodyFix.Companion.createAction[LocalVariableDescriptor]

