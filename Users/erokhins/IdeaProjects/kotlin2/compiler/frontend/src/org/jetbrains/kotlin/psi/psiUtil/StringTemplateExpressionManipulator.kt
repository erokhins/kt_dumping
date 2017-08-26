'AbstractElementManipulator<KtStringTemplateExpression>' @ [25:44] ==> public constructor AbstractElementManipulator<T : (PsiElement..PsiElement?)>() defined in com.intellij.psi.AbstractElementManipulator[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtStringTemplateExpression

'element' @ [27:20] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[ValueParameterDescriptorImpl]

'node' @ [27:28] ==> public final val KtStringTemplateExpression.node: ASTNode[MyPropertyDescriptor]

'if (node.firstChildNode.textLength == 1) StringUtil.escapeStringCharacters(newContent) else newContent' @ [28:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'node' @ [28:27] ==> val node: ASTNode defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[LocalVariableDescriptor]

'firstChildNode' @ [28:32] ==> public final val ASTNode.firstChildNode: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'textLength' @ [28:47] ==> public final val ASTNode.textLength: Int[MyPropertyDescriptor]

'escapeStringCharacters' @ [28:75] ==> @NotNull @Contract public open fun escapeStringCharacters(@NotNull p0: String): String defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'newContent' @ [28:98] ==> value-parameter newContent: String defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[ValueParameterDescriptorImpl]

'newContent' @ [28:115] ==> value-parameter newContent: String defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[ValueParameterDescriptorImpl]

'node' @ [29:23] ==> val node: ASTNode defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[LocalVariableDescriptor]

'text' @ [29:28] ==> public final val ASTNode.text: String[MyPropertyDescriptor]

'oldText' @ [30:23] ==> val oldText: String defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[LocalVariableDescriptor]

'substring' @ [30:31] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'range' @ [30:44] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[ValueParameterDescriptorImpl]

'startOffset' @ [30:50] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'content' @ [30:65] ==> val content: String defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[LocalVariableDescriptor]

'oldText' @ [30:75] ==> val oldText: String defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[LocalVariableDescriptor]

'substring' @ [30:83] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'range' @ [30:93] ==> value-parameter range: TextRange defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[ValueParameterDescriptorImpl]

'endOffset' @ [30:99] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'KtPsiFactory' @ [31:26] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[ClassConstructorDescriptorImpl]

'element' @ [31:39] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[ValueParameterDescriptorImpl]

'project' @ [31:47] ==> public final val KtStringTemplateExpression.project: Project[MyPropertyDescriptor]

'createExpression' @ [31:56] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'newText' @ [31:73] ==> val newText: String defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[LocalVariableDescriptor]

'node' @ [32:9] ==> val node: ASTNode defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[LocalVariableDescriptor]

'replaceAllChildrenToChildrenOf' @ [32:14] ==> public abstract fun replaceAllChildrenToChildrenOf(p0: (ASTNode..ASTNode?)): Unit defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'expression' @ [32:45] ==> val expression: KtExpression defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[LocalVariableDescriptor]

'node' @ [32:56] ==> public final val KtExpression.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'node' @ [33:16] ==> val node: ASTNode defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.handleContentChange[LocalVariableDescriptor]

'getPsi' @ [33:21] ==> public abstract fun <T : (PsiElement..PsiElement?)> getPsi(@NotNull p0: Class<(KtStringTemplateExpression..KtStringTemplateExpression?)>): (KtStringTemplateExpression..KtStringTemplateExpression?) defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtStringTemplateExpression

'KtStringTemplateExpression' @ [33:28] ==> public constructor KtStringTemplateExpression(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtStringTemplateExpression[JavaClassConstructorDescriptor]

'java' @ [33:62] ==> public val <T> KClass<KtStringTemplateExpression>.java: Class<KtStringTemplateExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtStringTemplateExpression

'element' @ [37:16] ==> value-parameter element: KtStringTemplateExpression defined in org.jetbrains.kotlin.psi.psiUtil.StringTemplateExpressionManipulator.getRangeInElement[ValueParameterDescriptorImpl]

'getContentRange' @ [37:24] ==> public fun KtStringTemplateExpression.getContentRange(): TextRange defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

