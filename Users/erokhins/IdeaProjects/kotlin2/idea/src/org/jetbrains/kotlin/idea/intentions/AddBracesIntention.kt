'SelfTargetingIntention<KtElement>' @ [25:28] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtElement>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtElement

'java' @ [25:79] ==> public val <T> KClass<KtElement>.java: Class<KtElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtElement

'element' @ [27:26] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'getTargetExpression' @ [27:34] ==> private final fun KtElement.getTargetExpression(caretLocation: Int): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention[SimpleFunctionDescriptorImpl]

'caretOffset' @ [27:54] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'expression' @ [28:13] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.isApplicableTo[LocalVariableDescriptor]

'expression' @ [30:22] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.isApplicableTo[LocalVariableDescriptor]

'parent' @ [30:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtContainerNode -> {
                val description = parent.description()!!
                text = "Add braces to '$description' statement"
                true
            }
            is KtWhenEntry -> {
                text = "Add braces to 'when' entry"
                true
            }
            else -> {
                false
            }
        }' @ [31:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [31:22] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.isApplicableTo[LocalVariableDescriptor]

'parent' @ [33:35] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.isApplicableTo[LocalVariableDescriptor]

'description' @ [33:42] ==> public fun KtContainerNode.description(): String? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'text' @ [34:17] ==> public final var AddBracesIntention.text: String[MyPropertyDescriptor]

'description' @ [34:41] ==> val description: String defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.isApplicableTo[LocalVariableDescriptor]

'text' @ [38:17] ==> public final var AddBracesIntention.text: String[MyPropertyDescriptor]

'editor' @ [48:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [48:35] ==> public constructor IllegalArgumentException(p0: (String..String?)) defined in java.lang.IllegalArgumentException[JavaClassConstructorDescriptor]

'element' @ [49:26] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[ValueParameterDescriptorImpl]

'getTargetExpression' @ [49:34] ==> private final fun KtElement.getTargetExpression(caretLocation: Int): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention[SimpleFunctionDescriptorImpl]

'editor' @ [49:54] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[ValueParameterDescriptorImpl]

'caretModel' @ [49:61] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'offset' @ [49:72] ==> public final val CaretModel.offset: Int[MyPropertyDescriptor]

'element' @ [51:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[ValueParameterDescriptorImpl]

'nextSibling' @ [51:21] ==> public final val KtElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'text' @ [51:34] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'element' @ [52:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[ValueParameterDescriptorImpl]

'nextSibling' @ [52:21] ==> public final val KtElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'delete' @ [52:35] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [55:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [55:39] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[ValueParameterDescriptorImpl]

'expression' @ [56:9] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[LocalVariableDescriptor]

'replace' @ [56:20] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'psiFactory' @ [56:28] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[LocalVariableDescriptor]

'createSingleStatementBlock' @ [56:39] ==> public final fun createSingleStatementBlock(statement: KtExpression): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expression' @ [56:66] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[LocalVariableDescriptor]

'element' @ [58:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [59:14] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.applyTo[ValueParameterDescriptorImpl]

'body' @ [59:22] ==> public final val KtDoWhileExpression.body: KtExpression?[MyPropertyDescriptor]

'parent' @ [59:29] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nextSibling' @ [59:36] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'delete' @ [59:68] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiWhiteSpace[JavaMethodDescriptor]

'when (this) {
            is KtIfExpression -> {
                val thenExpr = then ?: return null
                val elseExpr = `else`
                if (elseExpr != null && caretLocation >= elseKeyword!!.startOffset) {
                    elseExpr
                }
                else {
                    thenExpr
                }
            }

            is KtLoopExpression -> body
            is KtWhenEntry -> expression
            else -> null
        }' @ [64:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?, entry3: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'this' @ [64:22] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.getTargetExpression[ReceiverParameterDescriptorImpl]

'then' @ [66:32] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'`else`' @ [67:32] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'if (elseExpr != null && caretLocation >= elseKeyword!!.startOffset) {
                    elseExpr
                }
                else {
                    thenExpr
                }' @ [68:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'elseExpr' @ [68:21] ==> val elseExpr: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.getTargetExpression[LocalVariableDescriptor]

'caretLocation' @ [68:41] ==> value-parameter caretLocation: Int defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.getTargetExpression[ValueParameterDescriptorImpl]

'elseKeyword' @ [68:58] ==> public final val KtIfExpression.elseKeyword: PsiElement?[MyPropertyDescriptor]

'startOffset' @ [68:72] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'elseExpr' @ [69:21] ==> val elseExpr: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.getTargetExpression[LocalVariableDescriptor]

'thenExpr' @ [72:21] ==> val thenExpr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.AddBracesIntention.getTargetExpression[LocalVariableDescriptor]

'body' @ [76:36] ==> public final val KtLoopExpression.body: KtExpression?[MyPropertyDescriptor]

'expression' @ [77:31] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

