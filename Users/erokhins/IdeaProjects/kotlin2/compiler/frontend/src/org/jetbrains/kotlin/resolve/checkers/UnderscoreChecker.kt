'JvmOverloads' @ [32:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'identifier' @ [39:13] ==> value-parameter identifier: PsiElement? defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'identifier' @ [39:35] ==> value-parameter identifier: PsiElement? defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'text' @ [39:46] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'isEmpty' @ [39:51] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'allowSingleUnderscore' @ [40:39] ==> value-parameter allowSingleUnderscore: Boolean = ... defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'identifier' @ [40:64] ==> value-parameter identifier: PsiElement? defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'text' @ [40:75] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'if (!isValidSingleUnderscore && identifier.text.all { it == '_' }) {
            diagnosticHolder.report(Errors.UNDERSCORE_IS_RESERVED.on(identifier))
        }
        else if (isValidSingleUnderscore && !languageVersionSettings.supportsFeature(LanguageFeature.SingleUnderscoreForParameterName)) {
            diagnosticHolder.report(Errors.UNSUPPORTED_FEATURE.on(identifier, LanguageFeature.SingleUnderscoreForParameterName to languageVersionSettings))
        }' @ [41:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [41:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isValidSingleUnderscore' @ [41:14] ==> val isValidSingleUnderscore: Boolean defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[LocalVariableDescriptor]

'identifier' @ [41:41] ==> value-parameter identifier: PsiElement? defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'text' @ [41:52] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'all' @ [41:57] ==> public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [41:63] ==> value-parameter it: Char defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier.<anonymous>[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [42:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'report' @ [42:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'UNDERSCORE_IS_RESERVED' @ [42:44] ==> public final val UNDERSCORE_IS_RESERVED: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [42:67] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'identifier' @ [42:70] ==> value-parameter identifier: PsiElement? defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'isValidSingleUnderscore' @ [44:18] ==> val isValidSingleUnderscore: Boolean defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[LocalVariableDescriptor]

'!' @ [44:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [44:46] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'supportsFeature' @ [44:70] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [44:86] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'SingleUnderscoreForParameterName' @ [44:102] ==> enum entry SingleUnderscoreForParameterName defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'diagnosticHolder' @ [45:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'report' @ [45:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'UNSUPPORTED_FEATURE' @ [45:44] ==> public final val UNSUPPORTED_FEATURE: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [45:64] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'identifier' @ [45:67] ==> value-parameter identifier: PsiElement? defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'LanguageFeature' @ [45:79] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'SingleUnderscoreForParameterName' @ [45:95] ==> enum entry SingleUnderscoreForParameterName defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'languageVersionSettings' @ [45:131] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkIdentifier[ValueParameterDescriptorImpl]

'JvmOverloads' @ [49:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'checkIdentifier' @ [56:9] ==> @JvmOverloads public final fun checkIdentifier(identifier: PsiElement?, diagnosticHolder: DiagnosticSink, languageVersionSettings: LanguageVersionSettings, allowSingleUnderscore: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [56:25] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkNamed[ValueParameterDescriptorImpl]

'nameIdentifier' @ [56:37] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'diagnosticHolder' @ [56:53] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkNamed[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [56:71] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkNamed[ValueParameterDescriptorImpl]

'allowSingleUnderscore' @ [56:96] ==> value-parameter allowSingleUnderscore: Boolean = ... defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.checkNamed[ValueParameterDescriptorImpl]

'declaration' @ [66:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [66:42] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [67:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [68:31] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'valueParameters' @ [68:43] ==> public final val KtCallableDeclaration.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'checkNamed' @ [69:17] ==> @JvmOverloads public final fun checkNamed(declaration: KtNamedDeclaration, diagnosticHolder: DiagnosticSink, languageVersionSettings: LanguageVersionSettings, allowSingleUnderscore: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker[SimpleFunctionDescriptorImpl]

'parameter' @ [70:25] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [70:36] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [70:54] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [71:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [75:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [76:35] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'typeParameters' @ [76:47] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'checkNamed' @ [77:17] ==> @JvmOverloads public final fun checkNamed(declaration: KtNamedDeclaration, diagnosticHolder: DiagnosticSink, languageVersionSettings: LanguageVersionSettings, allowSingleUnderscore: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker[SimpleFunctionDescriptorImpl]

'typeParameter' @ [77:28] ==> val typeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [77:43] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [77:61] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [80:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'checkNamed' @ [81:9] ==> @JvmOverloads public final fun checkNamed(declaration: KtNamedDeclaration, diagnosticHolder: DiagnosticSink, languageVersionSettings: LanguageVersionSettings, allowSingleUnderscore: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [81:20] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [81:33] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [81:51] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.UnderscoreChecker.check[ValueParameterDescriptorImpl]

