'KotlinQuickFixAction<KtLambdaExpression>' @ [28:56] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtLambdaExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtLambdaExpression

'element' @ [28:97] ==> value-parameter element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.quickfix.AddRunToLambdaFix.<init>[ValueParameterDescriptorImpl]

'text' @ [30:36] ==> public final val AddRunToLambdaFix.text: String[MyPropertyDescriptor]

'element' @ [33:23] ==> protected final val element: KtLambdaExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddRunToLambdaFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [34:23] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [34:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddRunToLambdaFix.invoke[ValueParameterDescriptorImpl]

'element' @ [35:9] ==> val element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.quickfix.AddRunToLambdaFix.invoke[LocalVariableDescriptor]

'replace' @ [35:17] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtLambdaExpression[JavaMethodDescriptor]

'factory' @ [35:25] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.AddRunToLambdaFix.invoke[LocalVariableDescriptor]

'createExpression' @ [35:33] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [35:57] ==> val element: KtLambdaExpression defined in org.jetbrains.kotlin.idea.quickfix.AddRunToLambdaFix.invoke[LocalVariableDescriptor]

'text' @ [35:65] ==> public final val KtLambdaExpression.text: String[MyPropertyDescriptor]

'KotlinIntentionActionsFactory' @ [38:32] ==> public constructor KotlinIntentionActionsFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinIntentionActionsFactory[DeserializedClassConstructorDescriptor]

'UNUSED_LAMBDA_EXPRESSION' @ [40:33] ==> public final val UNUSED_LAMBDA_EXPRESSION: (DiagnosticFactory0<(KtLambdaExpression..KtLambdaExpression?)>..DiagnosticFactory0<(KtLambdaExpression..KtLambdaExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [40:58] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): SimpleDiagnostic<(KtLambdaExpression..KtLambdaExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'diagnostic' @ [40:63] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddRunToLambdaFix.Factory.doCreateActions[ValueParameterDescriptorImpl]

'listOf' @ [41:20] ==> public fun <T> listOf(element: AddRunToLambdaFix): List<AddRunToLambdaFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AddRunToLambdaFix

'AddRunToLambdaFix' @ [41:27] ==> public constructor AddRunToLambdaFix(element: KtLambdaExpression) defined in org.jetbrains.kotlin.idea.quickfix.AddRunToLambdaFix[ClassConstructorDescriptorImpl]

'casted' @ [41:45] ==> val casted: SimpleDiagnostic<(KtLambdaExpression..KtLambdaExpression?)> defined in org.jetbrains.kotlin.idea.quickfix.AddRunToLambdaFix.Factory.doCreateActions[LocalVariableDescriptor]

'psiElement' @ [41:52] ==> public final val <E : (PsiElement..PsiElement?)> SimpleDiagnostic<(KtLambdaExpression..KtLambdaExpression?)>.psiElement: (KtLambdaExpression..KtLambdaExpression?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtLambdaExpression..org.jetbrains.kotlin.psi.KtLambdaExpression?)

