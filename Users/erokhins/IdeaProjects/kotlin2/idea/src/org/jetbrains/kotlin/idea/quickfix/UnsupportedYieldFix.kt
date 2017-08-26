'KotlinQuickFixAction<PsiElement>' @ [29:52] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> PsiElement

'psiElement' @ [29:85] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.<init>[ValueParameterDescriptorImpl]

'familyName' @ [31:39] ==> public final val UnsupportedYieldFix.familyName: String[MyPropertyDescriptor]

'element' @ [34:26] ==> protected final val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix[PropertyDescriptorImpl]

'psiElement' @ [36:13] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.invoke[LocalVariableDescriptor]

'?:' @ [37:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'psiElement' @ [37:33] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.invoke[LocalVariableDescriptor]

'calleeExpression' @ [37:62] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'psiElement' @ [40:13] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.invoke[LocalVariableDescriptor]

'addAfter' @ [40:24] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [40:33] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [40:46] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.invoke[LocalVariableDescriptor]

'createCallArguments' @ [40:58] ==> public final fun createCallArguments(text: String): KtValueArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'ktExpression' @ [40:85] ==> val ktExpression: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.invoke[LocalVariableDescriptor]

'psiElement' @ [43:13] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.invoke[LocalVariableDescriptor]

'node' @ [43:24] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [43:29] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'IDENTIFIER' @ [43:53] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'psiElement' @ [44:13] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.invoke[LocalVariableDescriptor]

'replace' @ [44:24] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [44:32] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [44:45] ==> val psiElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.invoke[LocalVariableDescriptor]

'createIdentifier' @ [44:57] ==> public final fun createIdentifier(name: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'KotlinSingleIntentionActionFactory' @ [48:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [50:17] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [50:28] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'text' @ [50:39] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'YIELD_IS_RESERVED' @ [52:34] ==> public final val YIELD_IS_RESERVED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [52:52] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(PsiElement..PsiElement?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [52:57] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.Companion.createAction[ValueParameterDescriptorImpl]

'a' @ [52:69] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(PsiElement..PsiElement?), (String..String?)>.a: String[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'if (message == MESSAGE_FOR_YIELD_BEFORE_LAMBDA) {
                // Identifier -> Expression -> Call (normal call) or Identifier -> Operation Reference -> Binary Expression (for infix usage)
                val grand = diagnostic.psiElement.parent.parent
                if (grand is KtBinaryExpression || grand is KtCallExpression) {
                    return UnsupportedYieldFix(grand)
                }
            }
            else {
                return UnsupportedYieldFix(diagnostic.psiElement)
            }' @ [53:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'message' @ [53:17] ==> val message: String defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.Companion.createAction[LocalVariableDescriptor]

'MESSAGE_FOR_YIELD_BEFORE_LAMBDA' @ [53:28] ==> public val MESSAGE_FOR_YIELD_BEFORE_LAMBDA: String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'diagnostic' @ [55:29] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [55:40] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'parent' @ [55:51] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [55:58] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'grand' @ [56:21] ==> val grand: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.Companion.createAction[LocalVariableDescriptor]

'grand' @ [56:52] ==> val grand: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.Companion.createAction[LocalVariableDescriptor]

'UnsupportedYieldFix' @ [57:28] ==> public constructor UnsupportedYieldFix(psiElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix[ClassConstructorDescriptorImpl]

'grand' @ [57:48] ==> val grand: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.Companion.createAction[LocalVariableDescriptor]

'UnsupportedYieldFix' @ [61:24] ==> public constructor UnsupportedYieldFix(psiElement: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix[ClassConstructorDescriptorImpl]

'diagnostic' @ [61:44] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.UnsupportedYieldFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [61:55] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

