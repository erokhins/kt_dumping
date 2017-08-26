'KotlinQuickFixAction<KtConstantExpression>' @ [14:5] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtConstantExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtConstantExpression

'element' @ [14:48] ==> value-parameter element: KtConstantExpression defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.<init>[ValueParameterDescriptorImpl]

'element' @ [18:23] ==> protected final val element: KtConstantExpression? defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix[PropertyDescriptorImpl]

'element' @ [19:20] ==> val element: KtConstantExpression defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'text' @ [19:28] ==> public final val KtConstantExpression.text: (String..String?)[MyPropertyDescriptor]

'!' @ [20:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'text' @ [20:15] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'startsWith' @ [20:20] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [20:39] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'endsWith' @ [20:44] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [20:61] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'length' @ [20:66] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'text' @ [24:32] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'slice' @ [25:18] ==> public fun String.slice(indices: IntRange): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'..' @ [25:24] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'text' @ [25:27] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'length' @ [25:32] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'replace' @ [26:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [27:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [27:39] ==> val element: KtConstantExpression defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'createStringTemplate' @ [27:48] ==> public final fun createStringTemplate(content: String): KtStringTemplateExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newStringContent' @ [27:69] ==> val newStringContent: String defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'element' @ [29:9] ==> val element: KtConstantExpression defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'replace' @ [29:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtConstantExpression[DeserializedSimpleFunctionDescriptor]

'newElement' @ [29:25] ==> val newElement: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.invoke[LocalVariableDescriptor]

'text' @ [32:44] ==> public final val TooLongCharLiteralToStringFix.text: String[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [34:32] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'TOO_MANY_CHARACTERS_IN_CHARACTER_LITERAL' @ [36:34] ==> public final val TOO_MANY_CHARACTERS_IN_CHARACTER_LITERAL: (DiagnosticFactory1<(KtConstantExpression..KtConstantExpression?), (KtConstantExpression..KtConstantExpression?)>..DiagnosticFactory1<(KtConstantExpression..KtConstantExpression?), (KtConstantExpression..KtConstantExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [36:75] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(KtConstantExpression..KtConstantExpression?), (KtConstantExpression..KtConstantExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [36:80] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.Factory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [36:92] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(KtConstantExpression..KtConstantExpression?), (KtConstantExpression..KtConstantExpression?)>.psiElement: (KtConstantExpression..KtConstantExpression?)[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtConstantExpression..org.jetbrains.kotlin.psi.KtConstantExpression?)
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtConstantExpression..org.jetbrains.kotlin.psi.KtConstantExpression?)

'TooLongCharLiteralToStringFix' @ [37:20] ==> public constructor TooLongCharLiteralToStringFix(element: KtConstantExpression) defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix[ClassConstructorDescriptorImpl]

'element' @ [37:60] ==> val element: (KtConstantExpression..KtConstantExpression?) defined in org.jetbrains.kotlin.idea.quickfix.TooLongCharLiteralToStringFix.Factory.createAction[LocalVariableDescriptor]

