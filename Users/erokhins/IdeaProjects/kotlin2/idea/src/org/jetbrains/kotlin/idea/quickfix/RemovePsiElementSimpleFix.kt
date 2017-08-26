'KotlinQuickFixAction<PsiElement>' @ [27:87] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: PsiElement) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> PsiElement

'element' @ [27:120] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.<init>[ValueParameterDescriptorImpl]

'text' @ [30:30] ==> private final val text: String defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix[PropertyDescriptorImpl]

'element' @ [33:9] ==> protected final val element: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix[PropertyDescriptorImpl]

'delete' @ [33:18] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KotlinSingleIntentionActionFactory' @ [36:34] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [38:29] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveImportFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [38:40] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [38:51] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'directive' @ [39:27] ==> val directive: KtImportDirective defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveImportFactory.createAction[LocalVariableDescriptor]

'importedReference' @ [39:37] ==> public final val KtImportDirective.importedReference: KtExpression?[MyPropertyDescriptor]

'let' @ [39:56] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> String

'it' @ [39:70] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveImportFactory.createAction.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [39:73] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'RemovePsiElementSimpleFix' @ [40:20] ==> public constructor RemovePsiElementSimpleFix(element: PsiElement, text: String) defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix[ClassConstructorDescriptorImpl]

'directive' @ [40:46] ==> val directive: KtImportDirective defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveImportFactory.createAction[LocalVariableDescriptor]

'refText' @ [40:85] ==> val refText: String defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveImportFactory.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [44:34] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [46:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveSpreadFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [46:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'element' @ [47:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveSpreadFactory.createAction[LocalVariableDescriptor]

'node' @ [47:25] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [47:30] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'MUL' @ [47:54] ==> public final val MUL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'RemovePsiElementSimpleFix' @ [48:20] ==> public constructor RemovePsiElementSimpleFix(element: PsiElement, text: String) defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix[ClassConstructorDescriptorImpl]

'element' @ [48:46] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveSpreadFactory.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [52:41] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [54:27] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveTypeArgumentsFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [54:38] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [54:49] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeArgumentList? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeArgumentList

'RemovePsiElementSimpleFix' @ [55:20] ==> public constructor RemovePsiElementSimpleFix(element: PsiElement, text: String) defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix[ClassConstructorDescriptorImpl]

'element' @ [55:46] ==> val element: KtTypeArgumentList defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveTypeArgumentsFactory.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [59:36] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [61:30] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveVariableFactory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [61:41] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [61:52] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'RemovePsiElementSimpleFix' @ [62:29] ==> public constructor RemovePsiElementSimpleFix(element: PsiElement, text: String) defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix[ClassConstructorDescriptorImpl]

'expression' @ [62:55] ==> val expression: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveVariableFactory.createAction[LocalVariableDescriptor]

'expression' @ [62:87] ==> val expression: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveVariableFactory.createAction[LocalVariableDescriptor]

'name' @ [62:98] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'expression' @ [64:39] ==> val expression: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveVariableFactory.createAction[LocalVariableDescriptor]

'initializer' @ [64:50] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'if (initializer != null && initializer !is KtConstantExpression) {
                        expression.replace(initializer)
                    }
                    else {
                        expression.delete()
                    }' @ [65:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'initializer' @ [65:25] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveVariableFactory.createAction.<no name provided>.invoke[LocalVariableDescriptor]

'initializer' @ [65:48] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveVariableFactory.createAction.<no name provided>.invoke[LocalVariableDescriptor]

'expression' @ [66:25] ==> val expression: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveVariableFactory.createAction[LocalVariableDescriptor]

'replace' @ [66:36] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

'initializer' @ [66:44] ==> val initializer: KtExpression? defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveVariableFactory.createAction.<no name provided>.invoke[LocalVariableDescriptor]

'expression' @ [69:25] ==> val expression: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.RemovePsiElementSimpleFix.RemoveVariableFactory.createAction[LocalVariableDescriptor]

'delete' @ [69:36] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtProperty[JavaMethodDescriptor]

