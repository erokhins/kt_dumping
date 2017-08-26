'SelfTargetingIntention<KtWhenExpression>' @ [30:39] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtWhenExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtWhenExpression

'KtWhenExpression' @ [30:80] ==> public constructor KtWhenExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtWhenExpression[JavaClassConstructorDescriptor]

'java' @ [30:104] ==> public val <T> KClass<KtWhenExpression>.java: Class<KtWhenExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtWhenExpression

'element' @ [32:13] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.isApplicableTo[ValueParameterDescriptorImpl]

'subjectExpression' @ [32:21] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [33:22] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.isApplicableTo[ValueParameterDescriptorImpl]

'openBrace' @ [33:30] ==> public final val KtWhenExpression.openBrace: PsiElement?[MyPropertyDescriptor]

'caretOffset' @ [34:16] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.isApplicableTo[ValueParameterDescriptorImpl]

'lBrace' @ [34:31] ==> val lBrace: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.isApplicableTo[LocalVariableDescriptor]

'startOffset' @ [34:38] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [38:23] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo[ValueParameterDescriptorImpl]

'subjectExpression' @ [38:31] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'CommentSaver' @ [40:28] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'element' @ [40:41] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [42:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [42:43] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo[ValueParameterDescriptorImpl]

'buildExpression' @ [42:52] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [43:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [45:27] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo[ValueParameterDescriptorImpl]

'entries' @ [45:35] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'entry' @ [46:40] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'expression' @ [46:46] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'if (entry.isElse) {
                    appendFixedText("else")
                }
                else {
                    appendExpressions(entry.conditions.map { it.toExpression(subject) }, separator = "||")
                }' @ [48:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BuilderByPattern<KtExpression>, elseBranch: BuilderByPattern<KtExpression>): BuilderByPattern<KtExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BuilderByPattern<KtExpression>

'entry' @ [48:21] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'isElse' @ [48:27] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'appendFixedText' @ [49:21] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpressions' @ [52:21] ==> public final fun appendExpressions(expressions: Iterable<KtExpression?>, separator: String = ...): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'entry' @ [52:39] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'conditions' @ [52:45] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'map' @ [52:56] ==> public inline fun <T, R> Array<out (KtWhenCondition..KtWhenCondition?)>.map(transform: ((KtWhenCondition..KtWhenCondition?)) -> KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)
    <R> -> KtExpression

'it' @ [52:62] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toExpression' @ [52:65] ==> public fun KtWhenCondition.toExpression(subject: KtExpression?): KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'subject' @ [52:78] ==> val subject: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo[LocalVariableDescriptor]

'appendFixedText' @ [54:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [56:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'branchExpression' @ [56:34] ==> val branchExpression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [57:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [60:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [63:22] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [63:30] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtWhenExpression[DeserializedSimpleFunctionDescriptor]

'whenExpression' @ [63:38] ==> val whenExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo[LocalVariableDescriptor]

'commentSaver' @ [64:9] ==> val commentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo[LocalVariableDescriptor]

'restore' @ [64:22] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'result' @ [64:30] ==> val result: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.EliminateWhenSubjectIntention.applyTo[LocalVariableDescriptor]

