'SelfTargetingRangeIntention<KtBinaryExpression>' @ [30:32] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtBinaryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtBinaryExpression

'KtBinaryExpression' @ [30:80] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [30:106] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'if (element.operationToken == KtTokens.ELVIS && element.left != null && element.right != null)
            element.operationReference.textRange
        else
            null' @ [32:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextRange?, elseBranch: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextRange?

'element' @ [32:20] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'operationToken' @ [32:28] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ELVIS' @ [32:55] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [32:64] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'left' @ [32:72] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [32:88] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'right' @ [32:96] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'element' @ [33:13] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'operationReference' @ [33:21] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'textRange' @ [33:40] ==> public final val KtOperationReferenceExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'safeDeparenthesize' @ [39:30] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [39:49] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'left' @ [39:57] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'safeDeparenthesize' @ [40:31] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [40:50] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'right' @ [40:58] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'left' @ [42:28] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[LocalVariableDescriptor]

'isStable' @ [42:33] ==> public fun KtExpression.isStable(context: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [44:27] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'convertToIfNotNullExpression' @ [44:35] ==> public fun KtExpression.convertToIfNotNullExpression(conditionLhs: KtExpression, thenClause: KtExpression, elseClause: KtExpression?): KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'left' @ [44:64] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[LocalVariableDescriptor]

'left' @ [44:70] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[LocalVariableDescriptor]

'right' @ [44:76] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[LocalVariableDescriptor]

'!' @ [46:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'leftIsStable' @ [46:14] ==> val leftIsStable: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[LocalVariableDescriptor]

'ifStatement' @ [47:13] ==> val ifStatement: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[LocalVariableDescriptor]

'introduceValueForCondition' @ [47:25] ==> public fun KtIfExpression.introduceValueForCondition(occurrenceInThenClause: KtExpression, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'ifStatement' @ [47:52] ==> val ifStatement: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[LocalVariableDescriptor]

'then' @ [47:64] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'editor' @ [47:72] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.ElvisToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

