'KotlinQuickFixAction<KtCallableDeclaration>' @ [28:63] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtCallableDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtCallableDeclaration

'element' @ [28:107] ==> value-parameter element: KtCallableDeclaration defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.<init>[ValueParameterDescriptorImpl]

'text' @ [30:36] ==> public final val RenameToUnderscoreFix.text: String[MyPropertyDescriptor]

'element' @ [33:9] ==> protected final val element: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix[PropertyDescriptorImpl]

'nameIdentifier' @ [33:18] ==> public final val KtCallableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'replace' @ [33:34] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'KtPsiFactory' @ [33:42] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [33:55] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.invoke[ValueParameterDescriptorImpl]

'createIdentifier' @ [33:64] ==> public final fun createIdentifier(name: String): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'KotlinSingleIntentionActionFactory' @ [36:32] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'when (diagnostic.factory) {
                Errors.UNUSED_ANONYMOUS_PARAMETER -> {
                    val parameter = diagnostic.psiElement as? KtParameter
                    val owner = parameter?.parent?.parent

                    if (owner is KtFunctionLiteral || (owner is KtNamedFunction && owner.name == null))
                        parameter
                    else
                        null
                }
                Errors.UNUSED_VARIABLE, Errors.UNUSED_DESTRUCTURED_PARAMETER_ENTRY ->
                    diagnostic.psiElement as? KtDestructuringDeclarationEntry
                else -> null
            }' @ [38:55] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtCallableDeclaration?, entry1: KtCallableDeclaration?, entry2: KtCallableDeclaration?): KtCallableDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtCallableDeclaration?

'diagnostic' @ [38:61] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[ValueParameterDescriptorImpl]

'factory' @ [38:72] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'UNUSED_ANONYMOUS_PARAMETER' @ [39:24] ==> public final val UNUSED_ANONYMOUS_PARAMETER: (DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtParameter..KtParameter?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnostic' @ [40:37] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [40:48] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'parameter' @ [41:33] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[LocalVariableDescriptor]

'parent' @ [41:44] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [41:52] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (owner is KtFunctionLiteral || (owner is KtNamedFunction && owner.name == null))
                        parameter
                    else
                        null' @ [43:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtParameter?, elseBranch: KtParameter?): KtParameter?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtParameter?

'owner' @ [43:25] ==> val owner: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[LocalVariableDescriptor]

'owner' @ [43:56] ==> val owner: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[LocalVariableDescriptor]

'owner' @ [43:84] ==> val owner: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[LocalVariableDescriptor]

'name' @ [43:90] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'parameter' @ [44:25] ==> val parameter: KtParameter? defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[LocalVariableDescriptor]

'UNUSED_VARIABLE' @ [48:24] ==> public final val UNUSED_VARIABLE: (DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtNamedDeclaration..KtNamedDeclaration?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'UNUSED_DESTRUCTURED_PARAMETER_ENTRY' @ [48:48] ==> public final val UNUSED_DESTRUCTURED_PARAMETER_ENTRY: (DiagnosticFactory1<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (VariableDescriptor..VariableDescriptor?)>..DiagnosticFactory1<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (VariableDescriptor..VariableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnostic' @ [49:21] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [49:32] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'declaration' @ [53:17] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[LocalVariableDescriptor]

'nameIdentifier' @ [53:30] ==> public final val KtCallableDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'!' @ [54:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'declaration' @ [54:18] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[LocalVariableDescriptor]

'languageVersionSettings' @ [54:30] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'supportsFeature' @ [54:54] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'SingleUnderscoreForParameterName' @ [54:86] ==> enum entry SingleUnderscoreForParameterName defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'RenameToUnderscoreFix' @ [58:20] ==> public constructor RenameToUnderscoreFix(element: KtCallableDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix[ClassConstructorDescriptorImpl]

'declaration' @ [58:42] ==> val declaration: KtCallableDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.RenameToUnderscoreFix.Factory.createAction[LocalVariableDescriptor]

