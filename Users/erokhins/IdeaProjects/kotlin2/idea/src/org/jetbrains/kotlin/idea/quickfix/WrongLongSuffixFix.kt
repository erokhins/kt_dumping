'KotlinQuickFixAction<KtConstantExpression>' @ [28:59] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtConstantExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtConstantExpression

'element' @ [28:102] ==> value-parameter element: KtConstantExpression defined in org.jetbrains.kotlin.idea.quickfix.WrongLongSuffixFix.<init>[ValueParameterDescriptorImpl]

'element' @ [29:29] ==> value-parameter element: KtConstantExpression defined in org.jetbrains.kotlin.idea.quickfix.WrongLongSuffixFix.<init>[ValueParameterDescriptorImpl]

'text' @ [29:37] ==> public final val KtConstantExpression.text: (String..String?)[MyPropertyDescriptor]

'trimEnd' @ [29:42] ==> public fun String.trimEnd(vararg chars: Char): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'corrected' @ [31:43] ==> private final val corrected: String defined in org.jetbrains.kotlin.idea.quickfix.WrongLongSuffixFix[PropertyDescriptorImpl]

'element' @ [35:9] ==> protected final val element: KtConstantExpression? defined in org.jetbrains.kotlin.idea.quickfix.WrongLongSuffixFix[PropertyDescriptorImpl]

'replace' @ [35:18] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtConstantExpression[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [35:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [35:39] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.WrongLongSuffixFix.invoke[ValueParameterDescriptorImpl]

'createExpression' @ [35:48] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'corrected' @ [35:65] ==> private final val corrected: String defined in org.jetbrains.kotlin.idea.quickfix.WrongLongSuffixFix[PropertyDescriptorImpl]

'KotlinSingleIntentionActionFactory' @ [38:31] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'WRONG_LONG_SUFFIX' @ [40:33] ==> public final val WRONG_LONG_SUFFIX: (DiagnosticFactory0<(KtConstantExpression..KtConstantExpression?)>..DiagnosticFactory0<(KtConstantExpression..KtConstantExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [40:51] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): SimpleDiagnostic<(KtConstantExpression..KtConstantExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'diagnostic' @ [40:56] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.WrongLongSuffixFix.Factory.createAction[ValueParameterDescriptorImpl]

'WrongLongSuffixFix' @ [41:20] ==> public constructor WrongLongSuffixFix(element: KtConstantExpression) defined in org.jetbrains.kotlin.idea.quickfix.WrongLongSuffixFix[ClassConstructorDescriptorImpl]

'casted' @ [41:39] ==> val casted: SimpleDiagnostic<(KtConstantExpression..KtConstantExpression?)> defined in org.jetbrains.kotlin.idea.quickfix.WrongLongSuffixFix.Factory.createAction[LocalVariableDescriptor]

'psiElement' @ [41:46] ==> public final val <E : (PsiElement..PsiElement?)> SimpleDiagnostic<(KtConstantExpression..KtConstantExpression?)>.psiElement: (KtConstantExpression..KtConstantExpression?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtConstantExpression..org.jetbrains.kotlin.psi.KtConstantExpression?)

