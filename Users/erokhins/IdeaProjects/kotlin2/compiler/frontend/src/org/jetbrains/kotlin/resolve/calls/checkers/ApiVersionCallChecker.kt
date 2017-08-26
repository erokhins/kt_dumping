'check' @ [30:9] ==> private final fun check(targetDescriptor: CallableDescriptor, context: CallCheckerContext, element: PsiElement): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [30:15] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [30:28] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'context' @ [30:49] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'reportOn' @ [30:58] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'targetDescriptor' @ [35:13] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'targetDescriptor' @ [37:26] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'checkSinceKotlinVersionAccessibility' @ [37:43] ==> internal fun DeclarationDescriptor.checkSinceKotlinVersionAccessibility(languageVersionSettings: LanguageVersionSettings, actionIfInaccessible: ((ApiVersion) -> Unit)? = ...): Boolean defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]

'context' @ [37:80] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [37:88] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'context' @ [38:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [38:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'report' @ [38:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'API_NOT_AVAILABLE' @ [39:21] ==> public final val API_NOT_AVAILABLE: (DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [39:39] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: String, @NotNull b: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'element' @ [39:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'version' @ [39:51] ==> value-parameter version: ApiVersion defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'versionString' @ [39:59] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.ApiVersion[DeserializedPropertyDescriptor]

'context' @ [39:74] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [39:82] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'apiVersion' @ [39:106] ==> public abstract val apiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedPropertyDescriptor]

'versionString' @ [39:117] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.ApiVersion[DeserializedPropertyDescriptor]

'accessible' @ [43:13] ==> val accessible: Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[LocalVariableDescriptor]

'targetDescriptor' @ [43:27] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'DeprecatedCallChecker' @ [43:69] ==> public object DeprecatedCallChecker : CallChecker defined in org.jetbrains.kotlin.resolve.calls.checkers in file DeprecatedCallChecker.kt[FakeCallableDescriptorForObject]

'shouldCheckPropertyGetter' @ [43:91] ==> internal final fun shouldCheckPropertyGetter(expression: PsiElement): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.DeprecatedCallChecker[SimpleFunctionDescriptorImpl]

'element' @ [43:117] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'targetDescriptor' @ [44:13] ==> value-parameter targetDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'getter' @ [44:30] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'let' @ [44:38] ==> @InlineOnly public inline fun <T, R> PropertyGetterDescriptor.let(block: (PropertyGetterDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyGetterDescriptor
    <R> -> Unit

'check' @ [44:44] ==> private final fun check(targetDescriptor: CallableDescriptor, context: CallCheckerContext, element: PsiElement): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker[SimpleFunctionDescriptorImpl]

'it' @ [44:50] ==> value-parameter it: PropertyGetterDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [44:54] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

'element' @ [44:63] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.ApiVersionCallChecker.check[ValueParameterDescriptorImpl]

