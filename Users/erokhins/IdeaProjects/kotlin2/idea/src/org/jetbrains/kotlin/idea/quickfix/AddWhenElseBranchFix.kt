'KotlinQuickFixAction<KtWhenExpression>' @ [28:57] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtWhenExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtWhenExpression

'element' @ [28:96] ==> value-parameter element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.<init>[ValueParameterDescriptorImpl]

'familyName' @ [30:30] ==> public final val AddWhenElseBranchFix.familyName: String[MyPropertyDescriptor]

'element' @ [33:23] ==> protected final val element: KtWhenExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix[PropertyDescriptorImpl]

'super' @ [34:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [34:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [34:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [34:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [34:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [34:60] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.isAvailable[LocalVariableDescriptor]

'closeBrace' @ [34:68] ==> public final val KtWhenExpression.closeBrace: PsiElement?[MyPropertyDescriptor]

'element' @ [38:23] ==> protected final val element: KtWhenExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [39:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [39:39] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.invoke[ValueParameterDescriptorImpl]

'psiFactory' @ [40:21] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.invoke[LocalVariableDescriptor]

'createWhenEntry' @ [40:32] ==> public final fun createWhenEntry(entryText: String): KtWhenEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [41:30] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.invoke[LocalVariableDescriptor]

'closeBrace' @ [41:38] ==> public final val KtWhenExpression.closeBrace: PsiElement?[MyPropertyDescriptor]

'error' @ [41:52] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'forcePsiPostprocessAndRestoreElement' @ [42:53] ==> public open fun <T : (PsiElement..PsiElement?)> forcePsiPostprocessAndRestoreElement(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.codeInsight.CodeInsightUtilCore[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [42:90] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.invoke[LocalVariableDescriptor]

'addBefore' @ [42:98] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtWhenExpression[JavaMethodDescriptor]

'entry' @ [42:108] ==> val entry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.invoke[LocalVariableDescriptor]

'whenCloseBrace' @ [42:115] ==> val whenCloseBrace: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.invoke[LocalVariableDescriptor]

'editor' @ [43:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.invoke[ValueParameterDescriptorImpl]

'caretModel' @ [43:18] ==> public final val Editor.caretModel: CaretModel[MyPropertyDescriptor]

'moveToOffset' @ [43:29] ==> public abstract fun moveToOffset(p0: Int): Unit defined in com.intellij.openapi.editor.CaretModel[JavaMethodDescriptor]

'!!' @ [43:42] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PsiElement?): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PsiElement

'insertedWhenEntry' @ [43:43] ==> val insertedWhenEntry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.invoke[LocalVariableDescriptor]

'expression' @ [43:61] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'lBrace' @ [43:94] ==> public final val KtBlockExpression.lBrace: PsiElement?[MyPropertyDescriptor]

'endOffset' @ [43:103] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [46:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [48:20] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [48:31] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [48:42] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtWhenExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtWhenExpression

'let' @ [48:88] ==> @InlineOnly public inline fun <T, R> KtWhenExpression.let(block: (KtWhenExpression) -> AddWhenElseBranchFix): AddWhenElseBranchFix defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtWhenExpression
    <R> -> AddWhenElseBranchFix

'AddWhenElseBranchFix' @ [48:94] ==> public constructor AddWhenElseBranchFix(element: KtWhenExpression) defined in org.jetbrains.kotlin.idea.quickfix.AddWhenElseBranchFix[ClassConstructorDescriptorImpl]

