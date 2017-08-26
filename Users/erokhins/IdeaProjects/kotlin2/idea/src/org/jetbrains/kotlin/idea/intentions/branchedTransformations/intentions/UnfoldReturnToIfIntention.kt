'SelfTargetingRangeIntention<KtReturnExpression>' @ [32:35] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtReturnExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtReturnExpression

'KtReturnExpression' @ [32:83] ==> public constructor KtReturnExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtReturnExpression[JavaClassConstructorDescriptor]

'java' @ [32:109] ==> public val <T> KClass<KtReturnExpression>.java: Class<KtReturnExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtReturnExpression

'element' @ [34:28] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applicabilityRange[ValueParameterDescriptorImpl]

'returnedExpression' @ [34:36] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'TextRange' @ [35:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [35:26] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applicabilityRange[ValueParameterDescriptorImpl]

'startOffset' @ [35:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'ifExpression' @ [35:47] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applicabilityRange[LocalVariableDescriptor]

'ifKeyword' @ [35:60] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'endOffset' @ [35:70] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [39:28] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[ValueParameterDescriptorImpl]

'returnedExpression' @ [39:36] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [40:31] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

'copied' @ [40:44] ==> public fun <T : PsiElement> KtIfExpression.copied(): KtIfExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtIfExpression

'newIfExpression' @ [41:24] ==> val newIfExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

'then' @ [41:40] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'lastBlockStatementOrThis' @ [41:47] ==> public fun KtExpression.lastBlockStatementOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'newIfExpression' @ [42:24] ==> val newIfExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

'`else`' @ [42:40] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'lastBlockStatementOrThis' @ [42:49] ==> public fun KtExpression.lastBlockStatementOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [44:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [44:39] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[ValueParameterDescriptorImpl]

'thenExpr' @ [45:9] ==> val thenExpr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

'replace' @ [45:18] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'psiFactory' @ [45:26] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [45:37] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'thenExpr' @ [45:76] ==> val thenExpr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

'elseExpr' @ [46:9] ==> val elseExpr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

'replace' @ [46:18] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'psiFactory' @ [46:26] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

'createExpressionByPattern' @ [46:37] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'elseExpr' @ [46:76] ==> val elseExpr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

'element' @ [48:9] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [48:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'newIfExpression' @ [48:25] ==> val newIfExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToIfIntention.applyTo[LocalVariableDescriptor]

