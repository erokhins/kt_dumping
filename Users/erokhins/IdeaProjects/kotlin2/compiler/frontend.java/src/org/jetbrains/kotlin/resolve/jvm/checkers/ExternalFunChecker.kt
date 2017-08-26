'descriptor' @ [39:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'!' @ [39:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [39:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'isExternal' @ [39:60] ==> public final val MemberDescriptor.isExternal: Boolean[MyPropertyDescriptor]

'descriptor' @ [41:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'when (descriptor) {
                is PropertyDescriptor -> "property"
                is ClassDescriptor -> "class"
                else -> "non-function declaration"
            }' @ [42:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'descriptor' @ [42:32] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [47:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'report' @ [47:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'WRONG_MODIFIER_TARGET' @ [47:44] ==> public final val WRONG_MODIFIER_TARGET: (DiagnosticFactory2<(PsiElement..PsiElement?), (KtModifierKeywordToken..KtModifierKeywordToken?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (KtModifierKeywordToken..KtModifierKeywordToken?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [47:66] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: KtModifierKeywordToken, @NotNull p2: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'declaration' @ [47:69] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'EXTERNAL_KEYWORD' @ [47:91] ==> public final val EXTERNAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'target' @ [47:109] ==> val target: String defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[LocalVariableDescriptor]

'if (DescriptorUtils.isInterface(descriptor.containingDeclaration)) {
            diagnosticHolder.report(ErrorsJvm.EXTERNAL_DECLARATION_IN_INTERFACE.on(declaration))
        }
        else if (descriptor.modality == Modality.ABSTRACT) {
            if (declaration is KtPropertyAccessor) {
                diagnosticHolder.report(ErrorsJvm.EXTERNAL_DECLARATION_CANNOT_BE_ABSTRACT.on(declaration.property))
            }
            else {
                diagnosticHolder.report(ErrorsJvm.EXTERNAL_DECLARATION_CANNOT_BE_ABSTRACT.on(declaration))
            }
        }' @ [51:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isInterface' @ [51:29] ==> public open fun isInterface(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [51:41] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'containingDeclaration' @ [51:52] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'diagnosticHolder' @ [52:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'report' @ [52:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_DECLARATION_IN_INTERFACE' @ [52:47] ==> public final val EXTERNAL_DECLARATION_IN_INTERFACE: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [52:81] ==> @NotNull public open fun on(@NotNull p0: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [52:84] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [54:18] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'modality' @ [54:29] ==> public final val FunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [54:50] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'if (declaration is KtPropertyAccessor) {
                diagnosticHolder.report(ErrorsJvm.EXTERNAL_DECLARATION_CANNOT_BE_ABSTRACT.on(declaration.property))
            }
            else {
                diagnosticHolder.report(ErrorsJvm.EXTERNAL_DECLARATION_CANNOT_BE_ABSTRACT.on(declaration))
            }' @ [55:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [55:17] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [56:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'report' @ [56:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_DECLARATION_CANNOT_BE_ABSTRACT' @ [56:51] ==> public final val EXTERNAL_DECLARATION_CANNOT_BE_ABSTRACT: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [56:91] ==> @NotNull public open fun on(@NotNull p0: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [56:94] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'property' @ [56:106] ==> public final val KtPropertyAccessor.property: KtProperty[MyPropertyDescriptor]

'diagnosticHolder' @ [59:17] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'report' @ [59:34] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_DECLARATION_CANNOT_BE_ABSTRACT' @ [59:51] ==> public final val EXTERNAL_DECLARATION_CANNOT_BE_ABSTRACT: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [59:91] ==> @NotNull public open fun on(@NotNull p0: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [59:94] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [63:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [63:53] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [63:93] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'hasBody' @ [63:105] ==> public abstract fun hasBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'diagnosticHolder' @ [64:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'report' @ [64:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_DECLARATION_CANNOT_HAVE_BODY' @ [64:47] ==> public final val EXTERNAL_DECLARATION_CANNOT_HAVE_BODY: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [64:85] ==> @NotNull public open fun on(@NotNull p0: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [64:88] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'isInline' @ [67:24] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'descriptor' @ [67:33] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [68:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

'report' @ [68:30] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXTERNAL_DECLARATION_CANNOT_BE_INLINED' @ [68:47] ==> public final val EXTERNAL_DECLARATION_CANNOT_BE_INLINED: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [68:86] ==> @NotNull public open fun on(@NotNull p0: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'declaration' @ [68:89] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.jvm.checkers.ExternalFunChecker.check[ValueParameterDescriptorImpl]

