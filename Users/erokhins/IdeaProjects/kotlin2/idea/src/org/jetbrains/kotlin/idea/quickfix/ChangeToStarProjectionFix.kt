'KotlinQuickFixAction<KtTypeElement>' @ [26:59] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtTypeElement) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtTypeElement

'element' @ [26:95] ==> value-parameter element: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.<init>[ValueParameterDescriptorImpl]

'element' @ [29:30] ==> protected final val element: KtTypeElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix[PropertyDescriptorImpl]

'let' @ [29:39] ==> @InlineOnly public inline fun <T, R> KtTypeElement.let(block: (KtTypeElement) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeElement
    <R> -> String

'it' @ [29:74] ==> value-parameter it: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.getText.<anonymous>[ValueParameterDescriptorImpl]

'typeArgumentsAsTypes' @ [29:77] ==> public final val KtTypeElement.typeArgumentsAsTypes: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)[MyPropertyDescriptor]

'joinToString' @ [29:98] ==> public fun <T> Iterable<(KtTypeReference..KtTypeReference?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((KtTypeReference..KtTypeReference?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)

'element' @ [32:23] ==> protected final val element: KtTypeElement? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [33:20] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [33:33] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.invoke[ValueParameterDescriptorImpl]

'createStar' @ [33:39] ==> public final fun createStar(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [34:9] ==> val element: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.invoke[LocalVariableDescriptor]

'typeArgumentsAsTypes' @ [34:17] ==> public final val KtTypeElement.typeArgumentsAsTypes: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)[MyPropertyDescriptor]

'forEach' @ [34:38] ==> @HidesMembers public inline fun <T> Iterable<(KtTypeReference..KtTypeReference?)>.forEach(action: ((KtTypeReference..KtTypeReference?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)

'it' @ [34:48] ==> value-parameter it: (KtTypeReference..KtTypeReference?) defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.invoke.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [34:52] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeReference[JavaMethodDescriptor]

'star' @ [34:60] ==> val star: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [37:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [39:33] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [39:44] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [39:55] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtBinaryExpressionWithTypeRHS? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBinaryExpressionWithTypeRHS

'right' @ [39:114] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

'diagnostic' @ [40:36] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [40:47] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [40:58] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeReference? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeReference

'typeReference' @ [41:31] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.Companion.createAction[LocalVariableDescriptor]

'typeElement' @ [41:46] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'typeElement' @ [42:17] ==> val typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.Companion.createAction[LocalVariableDescriptor]

'typeElement' @ [43:17] ==> val typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.Companion.createAction[LocalVariableDescriptor]

'typeArgumentsAsTypes' @ [43:29] ==> public final val KtTypeElement.typeArgumentsAsTypes: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [43:50] ==> @InlineOnly public inline fun <T> Collection<(KtTypeReference..KtTypeReference?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)

'ChangeToStarProjectionFix' @ [44:24] ==> public constructor ChangeToStarProjectionFix(element: KtTypeElement) defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix[ClassConstructorDescriptorImpl]

'typeElement' @ [44:50] ==> val typeElement: KtTypeElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeToStarProjectionFix.Companion.createAction[LocalVariableDescriptor]

