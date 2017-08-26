'KotlinQuickFixAction<KtExpression>' @ [31:74] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'element' @ [31:109] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.<init>[ValueParameterDescriptorImpl]

'element' @ [32:47] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix[PropertyDescriptorImpl]

'value' @ [32:60] ==> public final val value: Boolean defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix[PropertyDescriptorImpl]

'element' @ [37:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix[PropertyDescriptorImpl]

'element' @ [38:22] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[LocalVariableDescriptor]

'parent' @ [38:30] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'KtPsiFactory' @ [39:27] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [39:40] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[LocalVariableDescriptor]

'createExpression' @ [39:49] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [39:68] ==> public final val value: Boolean defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix[PropertyDescriptorImpl]

'element' @ [40:9] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[LocalVariableDescriptor]

'replace' @ [40:17] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'replacement' @ [40:25] ==> val replacement: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[LocalVariableDescriptor]

'parent' @ [42:33] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [42:40] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBinaryExpression

'SimplifyBooleanWithConstantsIntention' @ [43:33] ==> public constructor SimplifyBooleanWithConstantsIntention() defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[ClassConstructorDescriptorImpl]

'simplifyIntention' @ [44:13] ==> val simplifyIntention: SimplifyBooleanWithConstantsIntention defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[LocalVariableDescriptor]

'isApplicableTo' @ [44:31] ==> public open fun isApplicableTo(element: KtBinaryExpression): Boolean defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'booleanExpression' @ [44:46] ==> val booleanExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[LocalVariableDescriptor]

'simplifyIntention' @ [45:13] ==> val simplifyIntention: SimplifyBooleanWithConstantsIntention defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[LocalVariableDescriptor]

'applyTo' @ [45:31] ==> public open fun applyTo(element: KtBinaryExpression, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.SimplifyBooleanWithConstantsIntention[SimpleFunctionDescriptorImpl]

'booleanExpression' @ [45:39] ==> val booleanExpression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[LocalVariableDescriptor]

'editor' @ [45:58] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.invoke[ValueParameterDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [49:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [51:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [51:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'?:' @ [52:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'diagnostic' @ [52:26] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.Companion.createAction[ValueParameterDescriptorImpl]

'b' @ [52:78] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?), B : (Any..Any?)> DiagnosticWithParameters2<out (PsiElement..PsiElement?), out (Any..Any?), out (Any..Any?)>.b: (Any..Any?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)
    <B : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'SimplifyComparisonFix' @ [53:20] ==> public constructor SimplifyComparisonFix(element: KtExpression, value: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix[ClassConstructorDescriptorImpl]

'expression' @ [53:42] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.Companion.createAction[LocalVariableDescriptor]

'value' @ [53:54] ==> val value: Boolean defined in org.jetbrains.kotlin.idea.quickfix.SimplifyComparisonFix.Companion.createAction[LocalVariableDescriptor]

