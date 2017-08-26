'KotlinQuickFixAction<KtValVarKeywordOwner>' @ [32:98] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtValVarKeywordOwner) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtValVarKeywordOwner

'element' @ [32:141] ==> value-parameter element: KtValVarKeywordOwner defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.<init>[ValueParameterDescriptorImpl]

'if (makeVar) "Make variable mutable" else "Make variable immutable"' @ [34:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'makeVar' @ [34:34] ==> private final val makeVar: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[PropertyDescriptorImpl]

'text' @ [36:44] ==> public final val ChangeVariableMutabilityFix.text: String[MyPropertyDescriptor]

'element' @ [39:23] ==> protected final val element: KtValVarKeywordOwner? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[PropertyDescriptorImpl]

'element' @ [40:24] ==> val element: KtValVarKeywordOwner defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.isAvailable[LocalVariableDescriptor]

'valOrVarKeyword' @ [40:32] ==> public final val KtValVarKeywordOwner.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'node' @ [40:49] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [40:55] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'!=' @ [41:16] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'valOrVar' @ [41:17] ==> val valOrVar: IElementType defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.isAvailable[LocalVariableDescriptor]

'VAR_KEYWORD' @ [41:38] ==> public final val VAR_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'makeVar' @ [41:54] ==> private final val makeVar: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[PropertyDescriptorImpl]

'element' @ [45:23] ==> protected final val element: KtValVarKeywordOwner? defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[PropertyDescriptorImpl]

'KtPsiFactory' @ [46:23] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [46:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.invoke[ValueParameterDescriptorImpl]

'if (makeVar) factory.createVarKeyword() else factory.createValKeyword()' @ [47:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'makeVar' @ [47:30] ==> private final val makeVar: Boolean defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[PropertyDescriptorImpl]

'factory' @ [47:39] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.invoke[LocalVariableDescriptor]

'createVarKeyword' @ [47:47] ==> public final fun createVarKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'factory' @ [47:71] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.invoke[LocalVariableDescriptor]

'createValKeyword' @ [47:79] ==> public final fun createValKeyword(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'element' @ [48:9] ==> val element: KtValVarKeywordOwner defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.invoke[LocalVariableDescriptor]

'valOrVarKeyword' @ [48:17] ==> public final val KtValVarKeywordOwner.valOrVarKeyword: PsiElement?[MyPropertyDescriptor]

'replace' @ [48:35] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newKeyword' @ [48:43] ==> val newKeyword: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [52:83] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [54:32] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.VAL_WITH_SETTER_FACTORY.<no name provided>.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [54:43] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'ChangeVariableMutabilityFix' @ [55:24] ==> public constructor ChangeVariableMutabilityFix(element: KtValVarKeywordOwner, makeVar: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[ClassConstructorDescriptorImpl]

'accessor' @ [55:52] ==> val accessor: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.VAL_WITH_SETTER_FACTORY.<no name provided>.createAction[LocalVariableDescriptor]

'property' @ [55:61] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [59:102] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'factory' @ [61:42] ==> public final val factory: DiagnosticFactory1<*, DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.ReassignmentActionFactory[PropertyDescriptorImpl]

'cast' @ [61:50] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<out (PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [61:55] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.ReassignmentActionFactory.createAction[ValueParameterDescriptorImpl]

'a' @ [61:67] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<out (PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>.a: DeclarationDescriptor[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?))
    <A : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'DescriptorToSourceUtils' @ [62:35] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [62:59] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [62:83] ==> val propertyDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.ReassignmentActionFactory.createAction[LocalVariableDescriptor]

'ChangeVariableMutabilityFix' @ [63:24] ==> public constructor ChangeVariableMutabilityFix(element: KtValVarKeywordOwner, makeVar: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[ClassConstructorDescriptorImpl]

'declaration' @ [63:52] ==> val declaration: KtValVarKeywordOwner defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.ReassignmentActionFactory.createAction[LocalVariableDescriptor]

'ReassignmentActionFactory' @ [67:40] ==> public constructor ReassignmentActionFactory(factory: DiagnosticFactory1<*, DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.ReassignmentActionFactory[ClassConstructorDescriptorImpl]

'VAL_REASSIGNMENT' @ [67:73] ==> public final val VAL_REASSIGNMENT: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'ReassignmentActionFactory' @ [69:51] ==> public constructor ReassignmentActionFactory(factory: DiagnosticFactory1<*, DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.ReassignmentActionFactory[ClassConstructorDescriptorImpl]

'CAPTURED_VAL_INITIALIZATION' @ [69:84] ==> public final val CAPTURED_VAL_INITIALIZATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'ReassignmentActionFactory' @ [71:58] ==> public constructor ReassignmentActionFactory(factory: DiagnosticFactory1<*, DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.ReassignmentActionFactory[ClassConstructorDescriptorImpl]

'CAPTURED_MEMBER_VAL_INITIALIZATION' @ [71:91] ==> public final val CAPTURED_MEMBER_VAL_INITIALIZATION: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [73:89] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [75:31] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.VAR_OVERRIDDEN_BY_VAL_FACTORY.<no name provided>.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [75:42] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'when (element) {
                    is KtProperty, is KtParameter -> ChangeVariableMutabilityFix(element as KtValVarKeywordOwner, true)
                    else -> null
                }' @ [76:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IntentionAction?, entry1: IntentionAction?): IntentionAction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IntentionAction?

'element' @ [76:30] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.VAR_OVERRIDDEN_BY_VAL_FACTORY.<no name provided>.createAction[LocalVariableDescriptor]

'ChangeVariableMutabilityFix' @ [77:54] ==> public constructor ChangeVariableMutabilityFix(element: KtValVarKeywordOwner, makeVar: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[ClassConstructorDescriptorImpl]

'element' @ [77:82] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.VAR_OVERRIDDEN_BY_VAL_FACTORY.<no name provided>.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [83:92] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [85:31] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.VAR_ANNOTATION_PARAMETER_FACTORY.<no name provided>.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [85:42] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'ChangeVariableMutabilityFix' @ [86:24] ==> public constructor ChangeVariableMutabilityFix(element: KtValVarKeywordOwner, makeVar: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[ClassConstructorDescriptorImpl]

'element' @ [86:52] ==> val element: KtParameter defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.VAR_ANNOTATION_PARAMETER_FACTORY.<no name provided>.createAction[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [90:44] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'INAPPLICABLE_LATEINIT_MODIFIER' @ [92:46] ==> public final val INAPPLICABLE_LATEINIT_MODIFIER: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'cast' @ [92:77] ==> @NotNull public open fun cast(@NotNull p0: Diagnostic): DiagnosticWithParameters1<(PsiElement..PsiElement?), (String..String?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnostic' @ [92:82] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.LATEINIT_VAL_FACTORY.<no name provided>.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [92:94] ==> public final val <E : (PsiElement..PsiElement?), A : (Any..Any?)> DiagnosticWithParameters1<(PsiElement..PsiElement?), (String..String?)>.psiElement: PsiElement[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <A : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'lateinitElement' @ [93:32] ==> val lateinitElement: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.LATEINIT_VAL_FACTORY.<no name provided>.createAction[LocalVariableDescriptor]

'getStrictParentOfType' @ [93:48] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'property' @ [94:21] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.LATEINIT_VAL_FACTORY.<no name provided>.createAction[LocalVariableDescriptor]

'valOrVarKeyword' @ [94:30] ==> public final val KtProperty.valOrVarKeyword: PsiElement[MyPropertyDescriptor]

'text' @ [94:46] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'ChangeVariableMutabilityFix' @ [95:24] ==> public constructor ChangeVariableMutabilityFix(element: KtValVarKeywordOwner, makeVar: Boolean) defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix[ClassConstructorDescriptorImpl]

'property' @ [95:52] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.quickfix.ChangeVariableMutabilityFix.Companion.LATEINIT_VAL_FACTORY.<no name provided>.createAction[LocalVariableDescriptor]

