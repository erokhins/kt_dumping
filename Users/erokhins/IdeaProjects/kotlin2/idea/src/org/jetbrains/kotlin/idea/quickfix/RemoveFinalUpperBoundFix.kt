'KotlinQuickFixAction<KtTypeReference>' @ [28:70] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtTypeReference) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtTypeReference

'typeReference' @ [28:108] ==> value-parameter typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.RemoveFinalUpperBoundFix.<init>[ValueParameterDescriptorImpl]

'typeReference' @ [30:9] ==> public final val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.quickfix.RemoveFinalUpperBoundFix[PropertyDescriptorImpl]

'getStrictParentOfType' @ [30:23] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtTypeParameter? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameter

'extendsBound' @ [30:65] ==> public final var KtTypeParameter.extendsBound: KtTypeReference?[MyPropertyDescriptor]

'text' @ [35:36] ==> public final val RemoveFinalUpperBoundFix.text: String[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [37:32] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'RemoveFinalUpperBoundFix' @ [38:61] ==> public constructor RemoveFinalUpperBoundFix(typeReference: KtTypeReference) defined in org.jetbrains.kotlin.idea.quickfix.RemoveFinalUpperBoundFix[ClassConstructorDescriptorImpl]

'FINAL_UPPER_BOUND' @ [38:93] ==> public final val FINAL_UPPER_BOUND: (DiagnosticFactory1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [38:111] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [38:116] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemoveFinalUpperBoundFix.Factory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [38:128] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>.psiElement: KtTypeReference[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

