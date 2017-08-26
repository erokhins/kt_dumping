'IntentionBasedInspection<KtBinaryExpression>' @ [24:50] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtBinaryExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtBinaryExpression

'ReplaceSizeCheckWithIsNotEmptyIntention' @ [24:95] ==> public constructor ReplaceSizeCheckWithIsNotEmptyIntention() defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention[ClassConstructorDescriptorImpl]

'ReplaceSizeCheckIntention' @ [26:49] ==> public constructor ReplaceSizeCheckIntention(text: String) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention[ClassConstructorDescriptorImpl]

'when (element.operationToken) {
            KtTokens.EXCLEQ -> when {
                element.right.isZero() -> element.left
                element.left.isZero() -> element.right
                else -> null
            }
            KtTokens.GT -> if (element.right.isZero()) element.left else null
            KtTokens.LT -> if (element.left.isZero()) element.right else null
            KtTokens.GTEQ -> if (element.right.isOne()) element.left else null
            KtTokens.LTEQ -> if (element.left.isOne()) element.right else null
            else -> null
        }' @ [31:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?, entry3: KtExpression?, entry4: KtExpression?, entry5: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'element' @ [31:22] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'operationToken' @ [31:30] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EXCLEQ' @ [32:22] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when {
                element.right.isZero() -> element.left
                element.left.isZero() -> element.right
                else -> null
            }' @ [32:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'element' @ [33:17] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [33:25] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'isZero' @ [33:31] ==> public fun KtElement?.isZero(): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'element' @ [33:43] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [33:51] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [34:17] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [34:25] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'isZero' @ [34:30] ==> public fun KtElement?.isZero(): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'element' @ [34:42] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [34:50] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'GT' @ [37:22] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (element.right.isZero()) element.left else null' @ [37:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'element' @ [37:32] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [37:40] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'isZero' @ [37:46] ==> public fun KtElement?.isZero(): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'element' @ [37:56] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [37:64] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'LT' @ [38:22] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (element.left.isZero()) element.right else null' @ [38:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'element' @ [38:32] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [38:40] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'isZero' @ [38:45] ==> public fun KtElement?.isZero(): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'element' @ [38:55] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [38:63] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'GTEQ' @ [39:22] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (element.right.isOne()) element.left else null' @ [39:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'element' @ [39:34] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [39:42] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'isOne' @ [39:48] ==> public fun KtElement?.isOne(): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'element' @ [39:57] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [39:65] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'LTEQ' @ [40:22] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (element.left.isOne()) element.right else null' @ [40:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'element' @ [40:34] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [40:42] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'isOne' @ [40:47] ==> public fun KtElement?.isOne(): Boolean defined in org.jetbrains.kotlin.idea.intentions[SimpleFunctionDescriptorImpl]

'element' @ [40:56] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckWithIsNotEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [40:64] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

