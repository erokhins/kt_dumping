'SelfTargetingIntention<KtElement>' @ [25:31] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtElement>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtElement

'java' @ [25:82] ==> public val <T> KClass<KtElement>.java: Class<KtElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtElement

'when (this) {
        is KtBlockExpression -> this
        is KtLoopExpression -> body as? KtBlockExpression
        is KtWhenEntry -> expression as? KtBlockExpression
        else -> null
    }' @ [27:46] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtBlockExpression?, entry1: KtBlockExpression?, entry2: KtBlockExpression?, entry3: KtBlockExpression?): KtBlockExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtBlockExpression?

'this' @ [27:52] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.findChildBlock[ReceiverParameterDescriptorImpl]

'this' @ [28:33] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.findChildBlock[ReceiverParameterDescriptorImpl]

'body' @ [29:32] ==> public final val KtLoopExpression.body: KtExpression?[MyPropertyDescriptor]

'expression' @ [30:27] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'element' @ [35:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.isApplicableTo[ValueParameterDescriptorImpl]

'findChildBlock' @ [35:29] ==> private final fun KtElement.findChildBlock(): KtBlockExpression? defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention[SimpleFunctionDescriptorImpl]

'block' @ [36:31] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.isApplicableTo[LocalVariableDescriptor]

'statements' @ [36:37] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [36:48] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'block' @ [37:25] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.isApplicableTo[LocalVariableDescriptor]

'parent' @ [37:31] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (container) {
            is KtContainerNode -> {
                if (singleStatement is KtIfExpression && container.parent is KtIfExpression) return false

                val description = container.description() ?: return false
                text = "Remove braces from '$description' statement"
                return true
            }
            is KtWhenEntry -> {
                text = "Remove braces from 'when' entry"
                return singleStatement !is KtNamedDeclaration
            }
            else -> return false
        }' @ [38:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'container' @ [38:15] ==> val container: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.isApplicableTo[LocalVariableDescriptor]

'singleStatement' @ [40:21] ==> val singleStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.isApplicableTo[LocalVariableDescriptor]

'container' @ [40:58] ==> val container: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.isApplicableTo[LocalVariableDescriptor]

'parent' @ [40:68] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'container' @ [42:35] ==> val container: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.isApplicableTo[LocalVariableDescriptor]

'description' @ [42:45] ==> public fun KtContainerNode.description(): String? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'text' @ [43:17] ==> public final var RemoveBracesIntention.text: String[MyPropertyDescriptor]

'description' @ [43:46] ==> val description: String defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.isApplicableTo[LocalVariableDescriptor]

'text' @ [47:17] ==> public final var RemoveBracesIntention.text: String[MyPropertyDescriptor]

'singleStatement' @ [48:24] ==> val singleStatement: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.isApplicableTo[LocalVariableDescriptor]

'element' @ [55:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[ValueParameterDescriptorImpl]

'findChildBlock' @ [55:29] ==> private final fun KtElement.findChildBlock(): KtBlockExpression? defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention[SimpleFunctionDescriptorImpl]

'block' @ [56:25] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'statements' @ [56:31] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'single' @ [56:42] ==> public fun <T> List<(KtExpression..KtExpression?)>.single(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'block' @ [58:25] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'parent' @ [58:31] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'container' @ [59:25] ==> val container: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'parent' @ [59:35] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'handleComments' @ [60:9] ==> private final fun handleComments(construct: KtExpression, block: KtBlockExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention[SimpleFunctionDescriptorImpl]

'construct' @ [60:24] ==> val construct: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'block' @ [60:35] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'block' @ [62:26] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'replace' @ [62:32] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBlockExpression[DeserializedSimpleFunctionDescriptor]

'statement' @ [62:40] ==> val statement: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'copy' @ [62:50] ==> public abstract fun copy(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'construct' @ [64:13] ==> val construct: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'newElement' @ [65:13] ==> val newElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'parent' @ [65:24] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [65:33] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [65:42] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'block' @ [65:55] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'createNewLine' @ [65:62] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newElement' @ [65:79] ==> val newElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.applyTo[LocalVariableDescriptor]

'block' @ [70:23] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[ValueParameterDescriptorImpl]

'firstChild' @ [70:29] ==> public final val KtBlockExpression.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nextSibling' @ [70:41] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'sibling' @ [72:16] ==> var sibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[LocalVariableDescriptor]

'sibling' @ [73:17] ==> var sibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[LocalVariableDescriptor]

'KtPsiFactory' @ [75:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'construct' @ [75:47] ==> value-parameter construct: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[ValueParameterDescriptorImpl]

'construct' @ [76:21] ==> value-parameter construct: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[ValueParameterDescriptorImpl]

'prevSibling' @ [76:31] ==> public final val KtExpression.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'construct' @ [77:21] ==> value-parameter construct: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[ValueParameterDescriptorImpl]

'prevSibling' @ [77:31] ==> public final val KtExpression.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'replace' @ [77:45] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [77:53] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[LocalVariableDescriptor]

'createNewLine' @ [77:64] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'construct' @ [79:38] ==> value-parameter construct: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[ValueParameterDescriptorImpl]

'parent' @ [79:48] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [79:55] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'sibling' @ [79:65] ==> var sibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[LocalVariableDescriptor]

'construct' @ [79:74] ==> value-parameter construct: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[ValueParameterDescriptorImpl]

'prevSibling' @ [79:84] ==> public final val KtExpression.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'construct' @ [80:17] ==> value-parameter construct: KtExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[ValueParameterDescriptorImpl]

'parent' @ [80:27] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addBefore' @ [80:34] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'psiFactory' @ [80:44] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[LocalVariableDescriptor]

'createNewLine' @ [80:55] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'commentElement' @ [80:72] ==> val commentElement: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[LocalVariableDescriptor]

'sibling' @ [82:13] ==> var sibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[LocalVariableDescriptor]

'sibling' @ [82:23] ==> var sibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.handleComments[LocalVariableDescriptor]

'nextSibling' @ [82:31] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [86:65] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.allowCaretInsideElement[ValueParameterDescriptorImpl]

'element' @ [86:98] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.intentions.RemoveBracesIntention.allowCaretInsideElement[ValueParameterDescriptorImpl]

'parent' @ [86:106] ==> public final val KtBlockExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

