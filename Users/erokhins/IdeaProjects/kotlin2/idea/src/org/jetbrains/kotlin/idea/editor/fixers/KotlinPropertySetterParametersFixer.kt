'SmartEnterProcessorWithFixers.Fixer<KotlinSmartEnterHandler>' @ [29:45] ==> public constructor Fixer<P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)>() defined in com.intellij.lang.SmartEnterProcessorWithFixers.Fixer[JavaClassConstructorDescriptor]
Inferred types:
    <P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)> -> KotlinSmartEnterHandler

'psiElement' @ [31:13] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'!' @ [33:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [33:14] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'isSetter' @ [33:25] ==> public final val KtPropertyAccessor.isSetter: Boolean[MyPropertyDescriptor]

'psiElement' @ [35:25] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'parameter' @ [35:36] ==> public final val KtPropertyAccessor.parameter: KtParameter?[MyPropertyDescriptor]

'!' @ [37:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [37:14] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[LocalVariableDescriptor]

'text' @ [37:25] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'isNullOrBlank' @ [37:30] ==> @InlineOnly public inline fun CharSequence?.isNullOrBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [37:49] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'rightParenthesis' @ [37:60] ==> public final val KtPropertyAccessor.rightParenthesis: ASTNode?[MyPropertyDescriptor]

'psiElement' @ [40:13] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'namePlaceholder' @ [40:24] ==> public final val KtPropertyAccessor.namePlaceholder: PsiElement[MyPropertyDescriptor]

'endOffset' @ [40:40] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'psiElement' @ [40:53] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'endOffset' @ [40:64] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'editor' @ [42:19] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'document' @ [42:26] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'+' @ [44:31] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [44:32] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'leftParenthesis' @ [44:43] ==> private final val KtPropertyAccessor.leftParenthesis: ASTNode? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer[PropertyDescriptorImpl]

'startOffset' @ [44:60] ==> public final val ASTNode.startOffset: Int[MyPropertyDescriptor]

'if (parameter?.text.isNullOrBlank()) {
            if (psiElement.rightParenthesis == null) {
                doc.insertString(parameterOffset, "value)")
            }
            else {
                doc.insertString(parameterOffset, "value")
            }
        }
        else if (psiElement.rightParenthesis == null) {
            doc.insertString(parameterOffset + parameter!!.text.length, ")")
        }' @ [46:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parameter' @ [46:13] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[LocalVariableDescriptor]

'text' @ [46:24] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'isNullOrBlank' @ [46:29] ==> @InlineOnly public inline fun CharSequence?.isNullOrBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (psiElement.rightParenthesis == null) {
                doc.insertString(parameterOffset, "value)")
            }
            else {
                doc.insertString(parameterOffset, "value")
            }' @ [47:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'psiElement' @ [47:17] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'rightParenthesis' @ [47:28] ==> public final val KtPropertyAccessor.rightParenthesis: ASTNode?[MyPropertyDescriptor]

'doc' @ [48:17] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[LocalVariableDescriptor]

'insertString' @ [48:21] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'parameterOffset' @ [48:34] ==> val parameterOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[LocalVariableDescriptor]

'doc' @ [51:17] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[LocalVariableDescriptor]

'insertString' @ [51:21] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'parameterOffset' @ [51:34] ==> val parameterOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[LocalVariableDescriptor]

'psiElement' @ [54:18] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[ValueParameterDescriptorImpl]

'rightParenthesis' @ [54:29] ==> public final val KtPropertyAccessor.rightParenthesis: ASTNode?[MyPropertyDescriptor]

'doc' @ [55:13] ==> val doc: Document defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[LocalVariableDescriptor]

'insertString' @ [55:17] ==> public abstract fun insertString(p0: Int, @NotNull p1: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'parameterOffset' @ [55:30] ==> val parameterOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[LocalVariableDescriptor]

'parameter' @ [55:48] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinPropertySetterParametersFixer.apply[LocalVariableDescriptor]

'text' @ [55:60] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'length' @ [55:65] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'node' @ [60:17] ==> public final var KtPropertyAccessor.node: ASTNode[MyPropertyDescriptor]

'findChildByType' @ [60:22] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'LPAR' @ [60:47] ==> public final val LPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

