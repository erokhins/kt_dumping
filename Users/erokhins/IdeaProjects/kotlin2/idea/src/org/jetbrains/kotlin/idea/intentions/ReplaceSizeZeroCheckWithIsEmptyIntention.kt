'IntentionBasedInspection<KtBinaryExpression>' @ [24:51] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtBinaryExpression>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtBinaryExpression

'ReplaceSizeZeroCheckWithIsEmptyIntention' @ [24:96] ==> public constructor ReplaceSizeZeroCheckWithIsEmptyIntention() defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention[ClassConstructorDescriptorImpl]

'ReplaceSizeCheckIntention' @ [26:50] ==> public constructor ReplaceSizeCheckIntention(text: String) defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention[ClassConstructorDescriptorImpl]

'when (element.operationToken) {
            KtTokens.EQEQ -> when {
                element.right.isZero() -> element.left
                element.left.isZero() -> element.right
                else -> null
            }
            KtTokens.GT -> if (element.left.isOne()) element.right else null
            KtTokens.LT -> if (element.right.isOne()) element.left else null
            KtTokens.GTEQ -> if (element.left.isZero()) element.right else null
            KtTokens.LTEQ -> if (element.right.isZero()) element.left else null
            else -> null
        }' @ [31:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?, entry3: KtExpression?, entry4: KtExpression?, entry5: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'element' @ [31:22] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'operationToken' @ [31:30] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQEQ' @ [32:22] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when {
                element.right.isZero() -> element.left
                element.left.isZero() -> element.right
                else -> null
            }' @ [32:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'element' @ [33:17] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [33:25] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'isZero' @ [33:31] ==> public fun KtElement?.isZero(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [33:43] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [33:51] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [34:17] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [34:25] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'isZero' @ [34:30] ==> public fun KtElement?.isZero(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [34:42] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [34:50] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'GT' @ [37:22] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (element.left.isOne()) element.right else null' @ [37:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'element' @ [37:32] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [37:40] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'isOne' @ [37:45] ==> public fun KtElement?.isOne(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [37:54] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [37:62] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'LT' @ [38:22] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (element.right.isOne()) element.left else null' @ [38:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'element' @ [38:32] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [38:40] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'isOne' @ [38:46] ==> public fun KtElement?.isOne(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [38:55] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [38:63] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'GTEQ' @ [39:22] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (element.left.isZero()) element.right else null' @ [39:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'element' @ [39:34] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [39:42] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'isZero' @ [39:47] ==> public fun KtElement?.isZero(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [39:57] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [39:65] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'LTEQ' @ [40:22] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (element.right.isZero()) element.left else null' @ [40:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'element' @ [40:34] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'right' @ [40:42] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'isZero' @ [40:48] ==> public fun KtElement?.isZero(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [40:58] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeZeroCheckWithIsEmptyIntention.getTargetExpression[ValueParameterDescriptorImpl]

'left' @ [40:66] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

