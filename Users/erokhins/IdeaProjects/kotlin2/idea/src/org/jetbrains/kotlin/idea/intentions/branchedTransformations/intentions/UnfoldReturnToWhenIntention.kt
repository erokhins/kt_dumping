'SelfTargetingRangeIntention<KtReturnExpression>' @ [29:37] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtReturnExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtReturnExpression

'KtReturnExpression' @ [29:85] ==> public constructor KtReturnExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtReturnExpression[JavaClassConstructorDescriptor]

'java' @ [29:111] ==> public val <T> KClass<KtReturnExpression>.java: Class<KtReturnExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtReturnExpression

'element' @ [31:24] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'returnedExpression' @ [31:32] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [32:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkWhenExpressionHasSingleElse' @ [32:24] ==> public open fun checkWhenExpressionHasSingleElse(@NotNull p0: KtWhenExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'whenExpr' @ [32:57] ==> val whenExpr: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applicabilityRange[LocalVariableDescriptor]

'whenExpr' @ [33:13] ==> val whenExpr: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applicabilityRange[LocalVariableDescriptor]

'entries' @ [33:22] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'any' @ [33:30] ==> public inline fun <T> Iterable<(KtWhenEntry..KtWhenEntry?)>.any(predicate: ((KtWhenEntry..KtWhenEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)

'it' @ [33:36] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [33:39] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'TextRange' @ [34:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'element' @ [34:26] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'startOffset' @ [34:34] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'whenExpr' @ [34:47] ==> val whenExpr: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applicabilityRange[LocalVariableDescriptor]

'whenKeyword' @ [34:56] ==> public final val KtWhenExpression.whenKeyword: PsiElement[MyPropertyDescriptor]

'endOffset' @ [34:68] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'element' @ [38:30] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applyTo[ValueParameterDescriptorImpl]

'returnedExpression' @ [38:38] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'whenExpression' @ [39:33] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applyTo[LocalVariableDescriptor]

'copied' @ [39:48] ==> public fun <T : PsiElement> KtWhenExpression.copied(): KtWhenExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtWhenExpression

'newWhenExpression' @ [41:23] ==> val newWhenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applyTo[LocalVariableDescriptor]

'entries' @ [41:41] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'entry' @ [42:24] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applyTo[LocalVariableDescriptor]

'expression' @ [42:30] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'lastBlockStatementOrThis' @ [42:43] ==> public fun KtExpression.lastBlockStatementOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'expr' @ [43:13] ==> val expr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applyTo[LocalVariableDescriptor]

'replace' @ [43:18] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [43:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [43:39] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applyTo[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [43:48] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expr' @ [43:87] ==> val expr: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applyTo[LocalVariableDescriptor]

'element' @ [46:9] ==> value-parameter element: KtReturnExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [46:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtReturnExpression[DeserializedSimpleFunctionDescriptor]

'newWhenExpression' @ [46:25] ==> val newWhenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.UnfoldReturnToWhenIntention.applyTo[LocalVariableDescriptor]

