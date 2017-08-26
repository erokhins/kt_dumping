'IntentionBasedInspection<KtIfExpression>' @ [29:38] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtIfExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtIfExpression

'IfThenToSafeAccessIntention' @ [29:79] ==> public constructor IfThenToSafeAccessIntention() defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention[ClassConstructorDescriptorImpl]

'element' @ [30:62] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessInspection.inspectionTarget[ValueParameterDescriptorImpl]

'ifKeyword' @ [30:70] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'if (element.shouldBeTransformed()) super.problemHighlightType(element) else ProblemHighlightType.INFORMATION' @ [33:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ProblemHighlightType, elseBranch: ProblemHighlightType): ProblemHighlightType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ProblemHighlightType

'element' @ [33:17] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessInspection.problemHighlightType[ValueParameterDescriptorImpl]

'shouldBeTransformed' @ [33:25] ==> internal fun KtIfExpression.shouldBeTransformed(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'super' @ [33:48] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessInspection[LazyClassReceiverParameterDescriptor]

'problemHighlightType' @ [33:54] ==> protected open fun problemHighlightType(element: KtIfExpression): ProblemHighlightType defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedSimpleFunctionDescriptor]

'element' @ [33:75] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessInspection.problemHighlightType[ValueParameterDescriptorImpl]

'INFORMATION' @ [33:110] ==> enum entry INFORMATION defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'SelfTargetingOffsetIndependentIntention<KtIfExpression>' @ [36:37] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtIfExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtIfExpression

'KtIfExpression' @ [37:9] ==> public constructor KtIfExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtIfExpression[JavaClassConstructorDescriptor]

'java' @ [37:31] ==> public val <T> KClass<KtIfExpression>.java: Class<KtIfExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtIfExpression

'element' @ [41:34] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.isApplicableTo[ValueParameterDescriptorImpl]

'buildSelectTransformationData' @ [41:42] ==> internal fun KtIfExpression.buildSelectTransformationData(): IfThenToSelectData? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'!' @ [42:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ifThenToSelectData' @ [42:14] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.isApplicableTo[LocalVariableDescriptor]

'receiverExpression' @ [42:33] ==> public final val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'isStable' @ [42:52] ==> public fun KtExpression.isStable(context: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'ifThenToSelectData' @ [42:61] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.isApplicableTo[LocalVariableDescriptor]

'context' @ [42:80] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'ifThenToSelectData' @ [43:13] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.isApplicableTo[LocalVariableDescriptor]

'baseClauseEvaluatesToReceiver' @ [43:32] ==> internal final fun baseClauseEvaluatesToReceiver(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[SimpleFunctionDescriptorImpl]

'text' @ [44:13] ==> public final var IfThenToSafeAccessIntention.text: String[MyPropertyDescriptor]

'if (ifThenToSelectData.condition is KtIsExpression) {
                "Replace 'if' expression with safe cast expression"
            }
            else {
                "Remove redundant 'if' expression"
            }' @ [44:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'ifThenToSelectData' @ [44:24] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.isApplicableTo[LocalVariableDescriptor]

'condition' @ [44:43] ==> public final val condition: KtOperationExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'ifThenToSelectData' @ [52:16] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.isApplicableTo[LocalVariableDescriptor]

'clausesReplaceableBySafeCall' @ [52:35] ==> private final fun IfThenToSelectData.clausesReplaceableBySafeCall(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention[SimpleFunctionDescriptorImpl]

'element' @ [58:34] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo[ValueParameterDescriptorImpl]

'buildSelectTransformationData' @ [58:42] ==> internal fun KtIfExpression.buildSelectTransformationData(): IfThenToSelectData? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [60:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [60:36] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo[ValueParameterDescriptorImpl]

'runWriteAction' @ [61:26] ==> public fun <T> runWriteAction(action: () -> KtExpression?): KtExpression? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression?

'ifThenToSelectData' @ [62:38] ==> val ifThenToSelectData: IfThenToSelectData defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo[LocalVariableDescriptor]

'replacedBaseClause' @ [62:57] ==> internal final fun replacedBaseClause(factory: KtPsiFactory): KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[SimpleFunctionDescriptorImpl]

'factory' @ [62:76] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo[LocalVariableDescriptor]

'element' @ [63:27] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo[ValueParameterDescriptorImpl]

'replaced' @ [63:35] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'replacedBaseClause' @ [63:44] ==> val replacedBaseClause: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'deparenthesize' @ [64:23] ==> @Nullable public open fun deparenthesize(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'newExpr' @ [64:38] ==> val newExpr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'editor' @ [67:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo[ValueParameterDescriptorImpl]

'resultExpr' @ [68:14] ==> val resultExpr: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo[LocalVariableDescriptor]

'inlineReceiverIfApplicableWithPrompt' @ [68:57] ==> public fun KtSafeQualifiedExpression.inlineReceiverIfApplicableWithPrompt(editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'editor' @ [68:94] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfThenToSafeAccessIntention.applyTo[ValueParameterDescriptorImpl]

'when {
        baseClause == null -> false
        negatedClause == null && baseClause.isUsedAsExpression(context) -> false
        negatedClause != null && !negatedClause.isNullExpression() -> false
        else -> baseClause.evaluatesTo(receiverExpression) || baseClause.hasFirstReceiverOf(receiverExpression) ||
                receiverExpression is KtThisExpression && hasImplicitReceiver()
    }' @ [72:78] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'baseClause' @ [73:9] ==> public final val baseClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'negatedClause' @ [74:9] ==> public final val negatedClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'baseClause' @ [74:34] ==> public final val baseClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'isUsedAsExpression' @ [74:45] ==> public fun KtExpression.isUsedAsExpression(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'context' @ [74:64] ==> public final val context: BindingContext defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'negatedClause' @ [75:9] ==> public final val negatedClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'!' @ [75:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'negatedClause' @ [75:35] ==> public final val negatedClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'isNullExpression' @ [75:49] ==> public fun KtExpression?.isNullExpression(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'baseClause' @ [76:17] ==> public final val baseClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'evaluatesTo' @ [76:28] ==> public fun KtExpression.evaluatesTo(other: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [76:40] ==> public final val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'baseClause' @ [76:63] ==> public final val baseClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'hasFirstReceiverOf' @ [76:74] ==> internal fun KtExpression.hasFirstReceiverOf(receiver: KtExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [76:93] ==> public final val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'receiverExpression' @ [77:17] ==> public final val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[PropertyDescriptorImpl]

'hasImplicitReceiver' @ [77:59] ==> internal final fun hasImplicitReceiver(): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.IfThenToSelectData[SimpleFunctionDescriptorImpl]

