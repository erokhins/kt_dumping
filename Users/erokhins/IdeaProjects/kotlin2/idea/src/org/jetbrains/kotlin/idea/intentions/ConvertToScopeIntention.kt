'SelfTargetingIntention<TExpression>' @ [27:5] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<TExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> TExpression

'elementType' @ [27:41] ==> value-parameter elementType: Class<TExpression> defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.<init>[ValueParameterDescriptorImpl]

'text' @ [27:54] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.<init>[ValueParameterDescriptorImpl]

'listOf' @ [29:45] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getLeftMostReceiverExpression' @ [35:83] ==> public fun KtDotQualifiedExpression.getLeftMostReceiverExpression(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'text' @ [35:115] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'receiverExpressionText' @ [38:13] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.isApplicableWithGivenReceiverText[ValueParameterDescriptorImpl]

'expression' @ [38:39] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.isApplicableWithGivenReceiverText[ValueParameterDescriptorImpl]

'getReceiverExpressionText' @ [38:50] ==> protected final fun KtDotQualifiedExpression.getReceiverExpressionText(): String? defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'expression' @ [39:30] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.isApplicableWithGivenReceiverText[ValueParameterDescriptorImpl]

'callExpression' @ [39:41] ==> public val KtQualifiedExpression.callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[PropertyDescriptorImpl]

'!' @ [40:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [40:14] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.isApplicableWithGivenReceiverText[LocalVariableDescriptor]

'isApplicable' @ [40:29] ==> private final fun KtCallExpression.isApplicable(): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'expression' @ [41:34] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.isApplicableWithGivenReceiverText[ValueParameterDescriptorImpl]

'receiverExpression' @ [41:45] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'receiverExpression' @ [42:16] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.isApplicableWithGivenReceiverText[LocalVariableDescriptor]

'isApplicableWithGivenReceiverText' @ [43:16] ==> protected final fun isApplicableWithGivenReceiverText(expression: KtDotQualifiedExpression, receiverExpressionText: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'receiverExpression' @ [43:50] ==> val receiverExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.isApplicableWithGivenReceiverText[LocalVariableDescriptor]

'receiverExpressionText' @ [43:70] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.isApplicableWithGivenReceiverText[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [47:23] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [47:36] ==> value-parameter expression: TExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'createScopeExpression' @ [48:36] ==> protected abstract fun createScopeExpression(factory: KtPsiFactory, element: TExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'factory' @ [48:58] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'expression' @ [48:67] ==> value-parameter expression: TExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'findCallExpressionFrom' @ [49:30] ==> protected abstract fun findCallExpressionFrom(scopeExpression: KtExpression): KtCallExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'scopeBlockExpression' @ [49:53] ==> val scopeBlockExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'callExpression' @ [50:31] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'getFirstLambdaArgumentBody' @ [50:46] ==> private final fun KtCallExpression.getFirstLambdaArgumentBody(): KtBlockExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'expression' @ [51:22] ==> value-parameter expression: TExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'parent' @ [51:33] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'findLastExpressionToMove' @ [52:36] ==> private final fun findLastExpressionToMove(receiverExpressionText: String, expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'receiverExpressionText' @ [52:61] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'expression' @ [52:85] ==> value-parameter expression: TExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'if (expression is KtProperty) expression
                else findFirstExpressionToMove(receiverExpressionText, expression)' @ [54:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'expression' @ [54:21] ==> value-parameter expression: TExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'expression' @ [54:47] ==> value-parameter expression: TExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'findFirstExpressionToMove' @ [55:22] ==> private final fun findFirstExpressionToMove(receiverExpressionText: String, expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'receiverExpressionText' @ [55:48] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'expression' @ [55:72] ==> value-parameter expression: TExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'if (expression is KtProperty) expression.nextSibling else firstTargetExpression' @ [56:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (PsiElement..PsiElement?), elseBranch: (PsiElement..PsiElement?)): (PsiElement..PsiElement?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'expression' @ [56:41] ==> value-parameter expression: TExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'expression' @ [56:67] ==> value-parameter expression: TExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[ValueParameterDescriptorImpl]

'nextSibling' @ [56:78] ==> public final val KtProperty.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'firstTargetExpression' @ [56:95] ==> val firstTargetExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'blockExpression' @ [57:9] ==> val blockExpression: KtBlockExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'moveRangeInto' @ [57:25] ==> private final fun KtBlockExpression.moveRangeInto(firstElement: PsiElement, lastElement: PsiElement): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'firstExpressionToMove' @ [57:39] ==> val firstExpressionToMove: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'lastExpressionToMove' @ [57:62] ==> val lastExpressionToMove: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'parent' @ [59:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'addBefore' @ [59:16] ==> public abstract fun addBefore(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'scopeBlockExpression' @ [59:26] ==> val scopeBlockExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'firstTargetExpression' @ [59:48] ==> val firstTargetExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'parent' @ [60:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'deleteChildRange' @ [60:16] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'firstTargetExpression' @ [60:33] ==> val firstTargetExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'lastExpressionToMove' @ [60:56] ==> val lastExpressionToMove: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.applyWithGivenReceiverText[LocalVariableDescriptor]

'if (forward) getNextSiblingIgnoringWhitespaceAndComments(false)
                else getPrevSiblingIgnoringWhitespaceAndComments(false)' @ [65:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'forward' @ [65:21] ==> value-parameter forward: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.getDotQualifiedSiblingIfAny[ValueParameterDescriptorImpl]

'getNextSiblingIgnoringWhitespaceAndComments' @ [65:30] ==> public fun PsiElement.getNextSiblingIgnoringWhitespaceAndComments(withItself: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'getPrevSiblingIgnoringWhitespaceAndComments' @ [66:22] ==> public fun PsiElement.getPrevSiblingIgnoringWhitespaceAndComments(withItself: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'sibling' @ [67:16] ==> val sibling: PsiElement? defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.getDotQualifiedSiblingIfAny[LocalVariableDescriptor]

'lambdaArguments' @ [71:13] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [71:29] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.firstOrNull(): KtLambdaArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'getLambdaExpression' @ [71:44] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'bodyExpression' @ [71:67] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'addRange' @ [76:9] ==> public open fun addRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'firstElement' @ [76:18] ==> value-parameter firstElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.moveRangeInto[ValueParameterDescriptorImpl]

'lastElement' @ [76:32] ==> value-parameter lastElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.moveRangeInto[ValueParameterDescriptorImpl]

'children' @ [77:9] ==> public final val KtBlockExpression.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [77:18] ==> public fun <R> Array<*>.filterIsInstance(klass: Class<KtDotQualifiedExpression>): List<KtDotQualifiedExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> KtDotQualifiedExpression

'KtDotQualifiedExpression' @ [77:35] ==> public companion object defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[FakeCallableDescriptorForObject]

'java' @ [77:67] ==> public val <T> KClass<KtDotQualifiedExpression>.java: Class<KtDotQualifiedExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDotQualifiedExpression

'forEach' @ [78:18] ==> @HidesMembers public inline fun <T> Iterable<KtDotQualifiedExpression>.forEach(action: (KtDotQualifiedExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDotQualifiedExpression

'it' @ [78:28] ==> value-parameter it: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.moveRangeInto.<anonymous>[ValueParameterDescriptorImpl]

'deleteFirstReceiver' @ [78:31] ==> public fun KtDotQualifiedExpression.deleteFirstReceiver(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'lambdaArguments' @ [81:51] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [81:67] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'valueArguments' @ [81:80] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'all' @ [81:95] ==> public inline fun <T> Iterable<(KtValueArgument..KtValueArgument?)>.all(predicate: ((KtValueArgument..KtValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'it' @ [81:101] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.isApplicable.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [81:104] ==> public final val KtValueArgument.text: (String..String?)[MyPropertyDescriptor]

'BLACKLIST_RECEIVER_NAME' @ [81:113] ==> protected final val BLACKLIST_RECEIVER_NAME: List<String> defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[PropertyDescriptorImpl]

'findBoundaryExpression' @ [84:13] ==> private final fun findBoundaryExpression(receiverExpressionText: String, expression: KtExpression, forward: Boolean): KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'receiverExpressionText' @ [84:36] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findFirstExpressionToMove[ValueParameterDescriptorImpl]

'expression' @ [84:60] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findFirstExpressionToMove[ValueParameterDescriptorImpl]

'findBoundaryExpression' @ [87:13] ==> private final fun findBoundaryExpression(receiverExpressionText: String, expression: KtExpression, forward: Boolean): KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'receiverExpressionText' @ [87:36] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findLastExpressionToMove[ValueParameterDescriptorImpl]

'expression' @ [87:60] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findLastExpressionToMove[ValueParameterDescriptorImpl]

'expression' @ [90:46] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findBoundaryExpression[ValueParameterDescriptorImpl]

'targetExpression' @ [92:39] ==> var targetExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findBoundaryExpression[LocalVariableDescriptor]

'getDotQualifiedSiblingIfAny' @ [92:56] ==> protected final fun KtExpression.getDotQualifiedSiblingIfAny(forward: Boolean): KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'forward' @ [92:84] ==> value-parameter forward: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findBoundaryExpression[ValueParameterDescriptorImpl]

'dotQualifiedSibling' @ [93:17] ==> val dotQualifiedSibling: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findBoundaryExpression[LocalVariableDescriptor]

'!' @ [93:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isApplicableWithGivenReceiverText' @ [93:49] ==> protected final fun isApplicableWithGivenReceiverText(expression: KtDotQualifiedExpression, receiverExpressionText: String): Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention[SimpleFunctionDescriptorImpl]

'dotQualifiedSibling' @ [93:83] ==> val dotQualifiedSibling: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findBoundaryExpression[LocalVariableDescriptor]

'receiverExpressionText' @ [93:104] ==> value-parameter receiverExpressionText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findBoundaryExpression[ValueParameterDescriptorImpl]

'targetExpression' @ [94:24] ==> var targetExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findBoundaryExpression[LocalVariableDescriptor]

'targetExpression' @ [96:13] ==> var targetExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findBoundaryExpression[LocalVariableDescriptor]

'dotQualifiedSibling' @ [96:32] ==> val dotQualifiedSibling: KtDotQualifiedExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertToScopeIntention.findBoundaryExpression[LocalVariableDescriptor]

