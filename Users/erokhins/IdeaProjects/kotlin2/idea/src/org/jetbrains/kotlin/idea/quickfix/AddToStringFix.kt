'KotlinQuickFixAction<KtExpression>' @ [29:78] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtExpression

'element' @ [29:113] ==> value-parameter element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix.<init>[ValueParameterDescriptorImpl]

'if (nullable) "Add safe '?.toString()' call" else "Add 'toString()' call"' @ [31:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'nullable' @ [31:34] ==> private final val nullable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix[PropertyDescriptorImpl]

'element' @ [34:23] ==> protected final val element: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix[PropertyDescriptorImpl]

'if (nullable) "$0?.toString()" else "$0.toString()"' @ [35:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'nullable' @ [35:27] ==> private final val nullable: Boolean defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [36:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [36:47] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix.invoke[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [36:53] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'pattern' @ [36:79] ==> val pattern: String defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix.invoke[LocalVariableDescriptor]

'element' @ [36:88] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix.invoke[LocalVariableDescriptor]

'element' @ [37:29] ==> val element: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix.invoke[LocalVariableDescriptor]

'replaced' @ [37:37] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'expressionToInsert' @ [37:46] ==> val expressionToInsert: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix.invoke[LocalVariableDescriptor]

'editor' @ [38:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [38:17] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [38:29] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'newExpression' @ [38:42] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.AddToStringFix.invoke[LocalVariableDescriptor]

'endOffset' @ [38:56] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

