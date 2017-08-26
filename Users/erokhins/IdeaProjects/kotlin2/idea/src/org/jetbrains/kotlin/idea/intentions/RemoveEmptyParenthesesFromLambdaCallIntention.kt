'IntentionBasedInspection<KtValueArgumentList>' @ [28:56] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtValueArgumentList>>, problemText: String? = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtValueArgumentList

'RemoveEmptyParenthesesFromLambdaCallIntention' @ [29:9] ==> public constructor RemoveEmptyParenthesesFromLambdaCallIntention() defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyParenthesesFromLambdaCallIntention[ClassConstructorDescriptorImpl]

'LIKE_UNUSED_SYMBOL' @ [31:34] ==> enum entry LIKE_UNUSED_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'SelfTargetingRangeIntention<KtValueArgumentList>' @ [34:55] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtValueArgumentList>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtValueArgumentList

'KtValueArgumentList' @ [35:9] ==> public constructor KtValueArgumentList(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaClassConstructorDescriptor]

'java' @ [35:36] ==> public val <T> KClass<KtValueArgumentList>.java: Class<KtValueArgumentList> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtValueArgumentList

'element' @ [38:13] ==> value-parameter element: KtValueArgumentList defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyParenthesesFromLambdaCallIntention.applicabilityRange[ValueParameterDescriptorImpl]

'arguments' @ [38:21] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [38:31] ==> @InlineOnly public inline fun <T> Collection<(KtValueArgument..KtValueArgument?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'element' @ [39:22] ==> value-parameter element: KtValueArgumentList defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyParenthesesFromLambdaCallIntention.applicabilityRange[ValueParameterDescriptorImpl]

'parent' @ [39:30] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent.lambdaArguments.count() == 1) element.range else null' @ [40:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextRange?, elseBranch: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextRange?

'parent' @ [40:20] ==> val parent: KtCallExpression defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyParenthesesFromLambdaCallIntention.applicabilityRange[LocalVariableDescriptor]

'lambdaArguments' @ [40:27] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'count' @ [40:43] ==> @InlineOnly public inline fun <T> Collection<(KtLambdaArgument..KtLambdaArgument?)>.count(): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'element' @ [40:57] ==> value-parameter element: KtValueArgumentList defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyParenthesesFromLambdaCallIntention.applicabilityRange[ValueParameterDescriptorImpl]

'range' @ [40:65] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.conversion.copy in file RangeUtils.kt[PropertyDescriptorImpl]

'element' @ [44:9] ==> value-parameter element: KtValueArgumentList defined in org.jetbrains.kotlin.idea.intentions.RemoveEmptyParenthesesFromLambdaCallIntention.applyTo[ValueParameterDescriptorImpl]

'delete' @ [44:17] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

