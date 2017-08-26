'SelfTargetingRangeIntention<KtIfExpression>' @ [25:33] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtIfExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtIfExpression

'KtIfExpression' @ [26:9] ==> public constructor KtIfExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtIfExpression[JavaClassConstructorDescriptor]

'java' @ [26:31] ==> public val <T> KClass<KtIfExpression>.java: Class<KtIfExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtIfExpression

'if (BranchedFoldingUtils.canFoldToReturn(element)) element.ifKeyword.textRange else null' @ [31:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextRange?, elseBranch: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextRange?

'BranchedFoldingUtils' @ [31:20] ==> public object BranchedFoldingUtils defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file BranchedFoldingUtils.kt[FakeCallableDescriptorForObject]

'canFoldToReturn' @ [31:41] ==> public final fun canFoldToReturn(expression: KtExpression?): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.BranchedFoldingUtils[SimpleFunctionDescriptorImpl]

'element' @ [31:57] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.FoldIfToReturnIntention.applicabilityRange[ValueParameterDescriptorImpl]

'element' @ [31:67] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.FoldIfToReturnIntention.applicabilityRange[ValueParameterDescriptorImpl]

'ifKeyword' @ [31:75] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'textRange' @ [31:85] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'BranchedFoldingUtils' @ [35:9] ==> public object BranchedFoldingUtils defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file BranchedFoldingUtils.kt[FakeCallableDescriptorForObject]

'foldToReturn' @ [35:30] ==> public final fun foldToReturn(expression: KtExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.BranchedFoldingUtils[SimpleFunctionDescriptorImpl]

'element' @ [35:43] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.FoldIfToReturnIntention.applyTo[ValueParameterDescriptorImpl]

