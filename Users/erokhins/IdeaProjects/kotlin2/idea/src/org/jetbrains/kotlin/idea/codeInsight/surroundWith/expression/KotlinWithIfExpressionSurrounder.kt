'KotlinExpressionSurrounder' @ [33:65] ==> public constructor KotlinExpressionSurrounder() defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinExpressionSurrounder[JavaClassConstructorDescriptor]

'expression' @ [35:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.isApplicable[ValueParameterDescriptorImpl]

'analyze' @ [35:24] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [35:48] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'getType' @ [35:57] ==> @Nullable public abstract fun getType(@NotNull p0: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'expression' @ [35:65] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.isApplicable[ValueParameterDescriptorImpl]

'isBoolean' @ [35:78] ==> public fun KotlinType.isBoolean(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [38:23] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [38:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[ValueParameterDescriptorImpl]

'expression' @ [40:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[ValueParameterDescriptorImpl]

'replace' @ [40:28] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'factory' @ [41:25] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[LocalVariableDescriptor]

'createIf' @ [41:33] ==> public final fun createIf(condition: KtExpression, thenExpr: KtExpression, elseExpr: KtExpression? = ...): KtIfExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'expression' @ [42:33] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[ValueParameterDescriptorImpl]

'factory' @ [43:33] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[LocalVariableDescriptor]

'createBlock' @ [43:41] ==> public final fun createBlock(bodyText: String): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'if (withElse) factory.createEmptyBody() else null' @ [44:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtBlockExpression?, elseBranch: KtBlockExpression?): KtBlockExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtBlockExpression?

'withElse' @ [44:37] ==> public final val withElse: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder[PropertyDescriptorImpl]

'factory' @ [44:47] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[LocalVariableDescriptor]

'createEmptyBody' @ [44:55] ==> public final fun createEmptyBody(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'forcePsiPostprocessAndRestoreElement' @ [48:29] ==> public open fun <T : (PsiElement..PsiElement?)> forcePsiPostprocessAndRestoreElement(@NotNull p0: KtIfExpression): (KtIfExpression..KtIfExpression?) defined in com.intellij.codeInsight.CodeInsightUtilBase[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtIfExpression

'ifExpression' @ [48:66] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[LocalVariableDescriptor]

'ifExpression' @ [50:42] ==> val ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[LocalVariableDescriptor]

'then' @ [50:55] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'sure' @ [50:83] ==> public inline fun <T : Any> KtBlockExpression?.sure(message: () -> String): KtBlockExpression defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KtBlockExpression

'statements' @ [52:11] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'first' @ [52:22] ==> public fun <T> List<(KtExpression..KtExpression?)>.first(): (KtExpression..KtExpression?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'range' @ [52:30] ==> public val PsiElement.range: TextRange defined in org.jetbrains.kotlin.idea.conversion.copy in file RangeUtils.kt[PropertyDescriptorImpl]

'editor' @ [54:9] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[ValueParameterDescriptorImpl]

'document' @ [54:16] ==> public final val Editor.document: Document[MyPropertyDescriptor]

'deleteString' @ [54:25] ==> public abstract fun deleteString(p0: Int, p1: Int): Unit defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'firstStatementInThenRange' @ [54:38] ==> val firstStatementInThenRange: TextRange defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[LocalVariableDescriptor]

'startOffset' @ [54:64] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'firstStatementInThenRange' @ [54:77] ==> val firstStatementInThenRange: TextRange defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[LocalVariableDescriptor]

'endOffset' @ [54:103] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'TextRange' @ [56:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'firstStatementInThenRange' @ [56:26] ==> val firstStatementInThenRange: TextRange defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[LocalVariableDescriptor]

'startOffset' @ [56:52] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'firstStatementInThenRange' @ [56:65] ==> val firstStatementInThenRange: TextRange defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder.surroundExpression[LocalVariableDescriptor]

'startOffset' @ [56:91] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'+' @ [59:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (withElse) " else { ... }" else ""' @ [59:68] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'withElse' @ [59:72] ==> public final val withElse: Boolean defined in org.jetbrains.kotlin.idea.codeInsight.surroundWith.expression.KotlinWithIfExpressionSurrounder[PropertyDescriptorImpl]

