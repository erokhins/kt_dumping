'SmartEnterProcessorWithFixers.Fixer<KotlinSmartEnterHandler>' @ [28:35] ==> public constructor Fixer<P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)>() defined in com.intellij.lang.SmartEnterProcessorWithFixers.Fixer[JavaClassConstructorDescriptor]
Inferred types:
    <P : (SmartEnterProcessorWithFixers..SmartEnterProcessorWithFixers?)> -> KotlinSmartEnterHandler

'psiElement' @ [30:13] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[ValueParameterDescriptorImpl]

'psiElement' @ [32:24] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[ValueParameterDescriptorImpl]

'node' @ [32:35] ==> public final val KtCatchClause.node: ASTNode[MyPropertyDescriptor]

'findChildByType' @ [32:40] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'CATCH_KEYWORD' @ [32:65] ==> public final val CATCH_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'textRange' @ [32:82] ==> public final val ASTNode.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [32:94] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'psiElement' @ [34:29] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[ValueParameterDescriptorImpl]

'parameterList' @ [34:40] ==> public final val KtCatchClause.parameterList: KtParameterList?[MyPropertyDescriptor]

'if (parameterList == null || parameterList.node.findChildByType(KtTokens.RPAR) == null) {
            val endOffset = Math.min(psiElement.endOffset, psiElement.catchBody?.startOffset ?: Int.MAX_VALUE)
            val parameter = parameterList?.parameters?.firstOrNull()?.text ?: ""
            editor.document.replaceString(catchEnd, endOffset, "($parameter)")
            processor.registerUnresolvedError(endOffset - 1)
        }
        else if (parameterList.parameters.firstOrNull()?.text.isNullOrBlank()) {
            processor.registerUnresolvedError(parameterList.startOffset + 1)
        }' @ [35:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'parameterList' @ [35:13] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[LocalVariableDescriptor]

'parameterList' @ [35:38] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[LocalVariableDescriptor]

'node' @ [35:52] ==> public final var KtParameterList.node: ASTNode[MyPropertyDescriptor]

'findChildByType' @ [35:57] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'RPAR' @ [35:82] ==> public final val RPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'min' @ [36:34] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'psiElement' @ [36:38] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[ValueParameterDescriptorImpl]

'endOffset' @ [36:49] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'psiElement' @ [36:60] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[ValueParameterDescriptorImpl]

'catchBody' @ [36:71] ==> public final val KtCatchClause.catchBody: KtExpression?[MyPropertyDescriptor]

'startOffset' @ [36:82] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'Int' @ [36:97] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [36:101] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'parameterList' @ [37:29] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[LocalVariableDescriptor]

'parameters' @ [37:44] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [37:56] ==> public fun <T> List<(KtParameter..KtParameter?)>.firstOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'text' @ [37:71] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'editor' @ [38:13] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[ValueParameterDescriptorImpl]

'document' @ [38:20] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'replaceString' @ [38:29] ==> public abstract fun replaceString(p0: Int, p1: Int, @NotNull p2: CharSequence): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'catchEnd' @ [38:43] ==> val catchEnd: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[LocalVariableDescriptor]

'endOffset' @ [38:53] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[LocalVariableDescriptor]

'parameter' @ [38:67] ==> val parameter: String defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[LocalVariableDescriptor]

'processor' @ [39:13] ==> value-parameter processor: KotlinSmartEnterHandler defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[ValueParameterDescriptorImpl]

'registerUnresolvedError' @ [39:23] ==> public open fun registerUnresolvedError(p0: Int): Unit defined in org.jetbrains.kotlin.idea.editor.KotlinSmartEnterHandler[JavaMethodDescriptor]

'endOffset' @ [39:47] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[LocalVariableDescriptor]

'parameterList' @ [41:18] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[LocalVariableDescriptor]

'parameters' @ [41:32] ==> public final val KtParameterList.parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'firstOrNull' @ [41:43] ==> public fun <T> List<(KtParameter..KtParameter?)>.firstOrNull(): KtParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'text' @ [41:58] ==> public final val KtParameter.text: (String..String?)[MyPropertyDescriptor]

'isNullOrBlank' @ [41:63] ==> @InlineOnly public inline fun CharSequence?.isNullOrBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'processor' @ [42:13] ==> value-parameter processor: KotlinSmartEnterHandler defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[ValueParameterDescriptorImpl]

'registerUnresolvedError' @ [42:23] ==> public open fun registerUnresolvedError(p0: Int): Unit defined in org.jetbrains.kotlin.idea.editor.KotlinSmartEnterHandler[JavaMethodDescriptor]

'parameterList' @ [42:47] ==> val parameterList: KtParameterList? defined in org.jetbrains.kotlin.idea.editor.fixers.KotlinCatchParameterFixer.apply[LocalVariableDescriptor]

'startOffset' @ [42:61] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

