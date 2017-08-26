'SelfTargetingOffsetIndependentIntention<KtBinaryExpression>' @ [26:58] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtBinaryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtBinaryExpression

'KtBinaryExpression' @ [27:9] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [27:35] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'text' @ [27:41] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention.<init>[ValueParameterDescriptorImpl]

'getTargetExpression' @ [30:22] ==> public abstract fun getTargetExpression(element: KtBinaryExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention[SimpleFunctionDescriptorImpl]

'element' @ [30:42] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention.applyTo[ValueParameterDescriptorImpl]

'target' @ [31:13] ==> val target: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention.applyTo[LocalVariableDescriptor]

'KtPsiFactory' @ [32:32] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [32:45] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention.applyTo[ValueParameterDescriptorImpl]

'createExpression' @ [32:54] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'target' @ [32:74] ==> val target: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention.applyTo[LocalVariableDescriptor]

'receiverExpression' @ [32:81] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'text' @ [32:100] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'getGenerateMethodSymbol' @ [32:108] ==> public abstract fun getGenerateMethodSymbol(): String defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention[SimpleFunctionDescriptorImpl]

'element' @ [33:9] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention.applyTo[ValueParameterDescriptorImpl]

'replaced' @ [33:17] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'createExpression' @ [33:26] ==> val createExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention.applyTo[LocalVariableDescriptor]

'getTargetExpression' @ [37:32] ==> public abstract fun getTargetExpression(element: KtBinaryExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention[SimpleFunctionDescriptorImpl]

'element' @ [37:52] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention.isApplicableTo[ValueParameterDescriptorImpl]

'targetExpression' @ [38:16] ==> val targetExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ReplaceSizeCheckIntention.isApplicableTo[LocalVariableDescriptor]

'isSizeOrLength' @ [38:33] ==> public fun KtElement?.isSizeOrLength(): Boolean defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

