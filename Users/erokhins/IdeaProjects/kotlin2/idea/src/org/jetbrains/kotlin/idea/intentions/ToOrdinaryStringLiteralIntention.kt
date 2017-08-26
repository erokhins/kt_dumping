'SelfTargetingOffsetIndependentIntention<KtStringTemplateExpression>' @ [26:42] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtStringTemplateExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtStringTemplateExpression

'KtStringTemplateExpression' @ [27:9] ==> public constructor KtStringTemplateExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[JavaClassConstructorDescriptor]

'java' @ [27:43] ==> public val <T> KClass<KtStringTemplateExpression>.java: Class<KtStringTemplateExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtStringTemplateExpression

'element' @ [31:16] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.isApplicableTo[ValueParameterDescriptorImpl]

'text' @ [31:24] ==> public final val KtStringTemplateExpression.text: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [31:29] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'buildString' @ [35:20] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [36:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'element' @ [38:27] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo[ValueParameterDescriptorImpl]

'entries' @ [38:35] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'if (entry is KtLiteralStringTemplateEntry) {
                    var text = entry.text
                    text = text.replace("\\", "\\\\")
                    text = text.replace("\"", "\\\"")
                    text = StringUtil.convertLineSeparators(text, "\\n")
                    append(text)
                }
                else {
                    append(entry.text)
                }' @ [39:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (StringBuilder..StringBuilder?), elseBranch: (StringBuilder..StringBuilder?)): (StringBuilder..StringBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.lang.StringBuilder..java.lang.StringBuilder?)

'entry' @ [39:21] ==> val entry: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'entry' @ [40:32] ==> val entry: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'text' @ [40:38] ==> public final val KtLiteralStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'text' @ [41:21] ==> var text: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'text' @ [41:28] ==> var text: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'replace' @ [41:33] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [42:21] ==> var text: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'text' @ [42:28] ==> var text: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'replace' @ [42:33] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'text' @ [43:21] ==> var text: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'convertLineSeparators' @ [43:39] ==> @NotNull @Contract public open fun convertLineSeparators(@NotNull p0: String, @NotNull p1: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'text' @ [43:61] ==> var text: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'append' @ [44:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'text' @ [44:28] ==> var text: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'append' @ [47:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'entry' @ [47:28] ==> val entry: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'text' @ [47:34] ==> public final val KtStringTemplateEntry.text: (String..String?)[MyPropertyDescriptor]

'append' @ [51:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'element' @ [53:9] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [53:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [53:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [53:38] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo[ValueParameterDescriptorImpl]

'createExpression' @ [53:47] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'text' @ [53:64] ==> val text: String defined in org.jetbrains.kotlin.idea.intentions.ToOrdinaryStringLiteralIntention.applyTo[LocalVariableDescriptor]

