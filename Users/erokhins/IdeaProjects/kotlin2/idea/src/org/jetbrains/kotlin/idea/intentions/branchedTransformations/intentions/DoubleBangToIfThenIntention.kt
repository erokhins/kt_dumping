'SelfTargetingRangeIntention<KtPostfixExpression>' @ [42:37] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtPostfixExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtPostfixExpression

'KtPostfixExpression' @ [42:86] ==> public constructor KtPostfixExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtPostfixExpression[JavaClassConstructorDescriptor]

'java' @ [42:113] ==> public val <T> KClass<KtPostfixExpression>.java: Class<KtPostfixExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPostfixExpression

'if (element.operationToken == KtTokens.EXCLEXCL && element.baseExpression != null)
            element.operationReference.textRange
        else
            null' @ [44:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextRange?, elseBranch: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextRange?

'element' @ [44:20] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'operationToken' @ [44:28] ==> public final val KtPostfixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'EXCLEXCL' @ [44:55] ==> public final val EXCLEXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [44:67] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'baseExpression' @ [44:75] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'element' @ [45:13] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'operationReference' @ [45:21] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'textRange' @ [45:40] ==> public final val KtSimpleNameExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'editor' @ [51:13] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [51:35] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'safeDeparenthesize' @ [53:30] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression, p1: Boolean): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [53:49] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'baseExpression' @ [53:57] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'formatForUseInExceptionArgument' @ [54:30] ==> private final fun formatForUseInExceptionArgument(expressionText: String): String defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention[SimpleFunctionDescriptorImpl]

'base' @ [54:62] ==> val base: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'text' @ [54:67] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'KtPsiFactory' @ [56:32] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [56:45] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'createExpression' @ [56:54] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [58:27] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'isUsedAsStatement' @ [58:35] ==> public fun KtExpression.isUsedAsStatement(context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.bindingContextUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [58:53] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'analyze' @ [58:61] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'base' @ [59:24] ==> val base: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'isStable' @ [59:29] ==> public fun KtExpression.isStable(context: BindingContext = ...): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'if (isStatement)
            element.convertToIfNullExpression(base, defaultException)
        else
            element.convertToIfNotNullExpression(base, base, defaultException)' @ [61:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtIfExpression, elseBranch: KtIfExpression): KtIfExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtIfExpression

'isStatement' @ [61:31] ==> val isStatement: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'element' @ [62:13] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'convertToIfNullExpression' @ [62:21] ==> public fun KtExpression.convertToIfNullExpression(conditionLhs: KtExpression, thenClause: KtExpression): KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'base' @ [62:47] ==> val base: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'defaultException' @ [62:53] ==> val defaultException: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'element' @ [64:13] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'convertToIfNotNullExpression' @ [64:21] ==> public fun KtExpression.convertToIfNotNullExpression(conditionLhs: KtExpression, thenClause: KtExpression, elseClause: KtExpression?): KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'base' @ [64:50] ==> val base: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'base' @ [64:56] ==> val base: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'defaultException' @ [64:62] ==> val defaultException: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'!!' @ [67:17] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: KtExpression?): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> KtExpression

'if (isStatement) ifStatement.then else ifStatement.`else`' @ [67:19] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'isStatement' @ [67:23] ==> val isStatement: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'ifStatement' @ [67:36] ==> val ifStatement: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'then' @ [67:48] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'ifStatement' @ [67:58] ==> val ifStatement: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'`else`' @ [67:70] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'thrownExpression' @ [67:100] ==> public final val KtThrowExpression.thrownExpression: KtExpression?[MyPropertyDescriptor]

'escapeJava' @ [69:23] ==> public open fun escapeJava(p0: (String..String?)): (String..String?) defined in org.apache.commons.lang.StringEscapeUtils[JavaMethodDescriptor]

'expressionText' @ [69:48] ==> val expressionText: String defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'message' @ [70:61] ==> val message: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'ChooseStringExpression' @ [73:41] ==> public constructor ChooseStringExpression(suggestions: Collection<String>, default: String = ..., advertisementText: String? = ...) defined in org.jetbrains.kotlin.idea.intentions.ChooseStringExpression[ClassConstructorDescriptorImpl]

'listOf' @ [73:64] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'nullPtrExceptionText' @ [73:71] ==> val nullPtrExceptionText: String defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'kotlinNullPtrExceptionText' @ [73:93] ==> val kotlinNullPtrExceptionText: String defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'element' @ [74:23] ==> value-parameter element: KtPostfixExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'project' @ [74:31] ==> public final val KtPostfixExpression.project: Project[MyPropertyDescriptor]

'TemplateBuilderImpl' @ [75:23] ==> public constructor TemplateBuilderImpl(@NotNull p0: PsiElement) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaClassConstructorDescriptor]

'thrownExpression' @ [75:43] ==> val thrownExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'builder' @ [76:9] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'replaceElement' @ [76:17] ==> public open fun replaceElement(@NotNull p0: PsiElement, p1: (Expression..Expression?)): Unit defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'thrownExpression' @ [76:32] ==> val thrownExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'exceptionLookupExpression' @ [76:50] ==> val exceptionLookupExpression: ChooseStringExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'getInstance' @ [78:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [78:40] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'commitAllDocuments' @ [78:49] ==> public abstract fun commitAllDocuments(): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'getInstance' @ [79:28] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'project' @ [79:40] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'doPostponedOperationsAndUnblockDocument' @ [79:49] ==> public abstract fun doPostponedOperationsAndUnblockDocument(@NotNull p0: Document): Unit defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'editor' @ [79:89] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'document' @ [79:96] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'editor' @ [80:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'caretModel' @ [80:16] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [80:27] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'thrownExpression' @ [80:40] ==> val thrownExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'node' @ [80:57] ==> public final val KtExpression.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'startOffset' @ [80:64] ==> public final val ASTNode.startOffset: Int[MyPropertyDescriptor]

'getInstance' @ [82:25] ==> public open fun getInstance(p0: (Project..Project?)): (TemplateManager..TemplateManager?) defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'project' @ [82:37] ==> val project: Project defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'startTemplate' @ [82:46] ==> public abstract fun startTemplate(@NotNull p0: Editor, @NotNull p1: Template, p2: (TemplateEditingListener..TemplateEditingListener?)): Unit defined in com.intellij.codeInsight.template.TemplateManager[JavaMethodDescriptor]

'editor' @ [82:60] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'builder' @ [82:68] ==> val builder: TemplateBuilderImpl defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'buildInlineTemplate' @ [82:76] ==> public open fun buildInlineTemplate(): (Template..Template?) defined in com.intellij.codeInsight.template.TemplateBuilderImpl[JavaMethodDescriptor]

'TemplateEditingAdapter' @ [82:107] ==> public constructor TemplateEditingAdapter() defined in com.intellij.codeInsight.template.TemplateEditingAdapter[JavaClassConstructorDescriptor]

'!' @ [84:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStable' @ [84:22] ==> val isStable: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'!' @ [84:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isStatement' @ [84:35] ==> val isStatement: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'ifStatement' @ [85:21] ==> val ifStatement: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'introduceValueForCondition' @ [85:33] ==> public fun KtIfExpression.introduceValueForCondition(occurrenceInThenClause: KtExpression, editor: Editor?): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'ifStatement' @ [85:60] ==> val ifStatement: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[LocalVariableDescriptor]

'then' @ [85:72] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'editor' @ [85:80] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.applyTo[ValueParameterDescriptorImpl]

'expressionText' @ [92:21] ==> value-parameter expressionText: String defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.formatForUseInExceptionArgument[ValueParameterDescriptorImpl]

'split' @ [92:36] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (lines.size > 1)
            lines.first().trim() + " ..."
        else
            expressionText.trim()' @ [93:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'lines' @ [93:20] ==> val lines: List<String> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.formatForUseInExceptionArgument[LocalVariableDescriptor]

'size' @ [93:26] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'lines' @ [94:13] ==> val lines: List<String> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.formatForUseInExceptionArgument[LocalVariableDescriptor]

'first' @ [94:19] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'trim' @ [94:27] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expressionText' @ [96:13] ==> value-parameter expressionText: String defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.DoubleBangToIfThenIntention.formatForUseInExceptionArgument[ValueParameterDescriptorImpl]

'trim' @ [96:28] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

