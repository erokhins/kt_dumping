'SelfTargetingRangeIntention<KtSafeQualifiedExpression>' @ [30:37] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtSafeQualifiedExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtSafeQualifiedExpression

'KtSafeQualifiedExpression' @ [30:92] ==> public constructor KtSafeQualifiedExpression(node: ASTNode) defined in org.jetbrains.kotlin.psi.KtSafeQualifiedExpression[DeserializedClassConstructorDescriptor]

'java' @ [30:125] ==> public val <T> KClass<KtSafeQualifiedExpression>.java: Class<KtSafeQualifiedExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtSafeQualifiedExpression

'element' @ [32:13] ==> value-parameter element: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'selectorExpression' @ [32:21] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtSafeQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [33:16] ==> value-parameter element: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'operationTokenNode' @ [33:24] ==> public open val operationTokenNode: ASTNode defined in org.jetbrains.kotlin.psi.KtSafeQualifiedExpression[DeserializedPropertyDescriptor]

'textRange' @ [33:43] ==> public final val ASTNode.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'safeDeparenthesize' @ [37:34] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [37:53] ==> value-parameter element: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'receiverExpression' @ [37:61] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtSafeQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [38:24] ==> value-parameter element: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'selectorExpression' @ [38:32] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtSafeQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [40:32] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'isStable' @ [40:41] ==> public fun KtExpression.isStable(context: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'KtPsiFactory' @ [42:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [42:39] ==> value-parameter element: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'psiFactory' @ [43:28] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [43:39] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'receiver' @ [43:74] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'selector' @ [43:84] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'if (element.isUsedAsStatement(element.analyze())) null else psiFactory.createExpression("null")' @ [45:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'element' @ [45:30] ==> value-parameter element: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'isUsedAsStatement' @ [45:38] ==> public fun KtExpression.isUsedAsStatement(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [45:56] ==> value-parameter element: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'analyze' @ [45:64] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'psiFactory' @ [45:86] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'createExpression' @ [45:97] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [46:28] ==> value-parameter element: KtSafeQualifiedExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'convertToIfNotNullExpression' @ [46:36] ==> public fun KtExpression.convertToIfNotNullExpression(conditionLhs: KtExpression, thenClause: KtExpression, elseClause: KtExpression?): KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'receiver' @ [46:65] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'dotQualified' @ [46:75] ==> val dotQualified: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'elseClause' @ [46:89] ==> val elseClause: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'!' @ [48:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'receiverIsStable' @ [48:14] ==> val receiverIsStable: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'ifExpression' @ [49:35] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'then' @ [49:48] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'receiverExpression' @ [49:82] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'ifExpression' @ [50:13] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'introduceValueForCondition' @ [50:26] ==> public fun KtIfExpression.introduceValueForCondition(occurrenceInThenClause: KtExpression, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'valueToExtract' @ [50:53] ==> val valueToExtract: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[LocalVariableDescriptor]

'editor' @ [50:69] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.SafeAccessToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

