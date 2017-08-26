'listOf' @ [27:9] ==> public fun <T> listOf(vararg elements: (DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?)): List<(DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory1<(org.jetbrains.kotlin.psi.KtFunction..org.jetbrains.kotlin.psi.KtFunction?), (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory1<(org.jetbrains.kotlin.psi.KtFunction..org.jetbrains.kotlin.psi.KtFunction?), (org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor..org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor?)>?)

'NON_ABSTRACT_FUNCTION_WITH_NO_BODY' @ [27:23] ==> public final val NON_ABSTRACT_FUNCTION_WITH_NO_BODY: (DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'NON_MEMBER_FUNCTION_NO_BODY' @ [27:66] ==> public final val NON_MEMBER_FUNCTION_NO_BODY: (DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>..DiagnosticFactory1<(KtFunction..KtFunction?), (SimpleFunctionDescriptor..SimpleFunctionDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'listOf' @ [30:9] ==> public fun <T> listOf(vararg elements: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?)): List<(DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory0<(org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory0<(org.jetbrains.kotlin.psi.KtProperty..org.jetbrains.kotlin.psi.KtProperty?)>?)

'MUST_BE_INITIALIZED' @ [30:23] ==> public final val MUST_BE_INITIALIZED: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'MUST_BE_INITIALIZED_OR_BE_ABSTRACT' @ [30:51] ==> public final val MUST_BE_INITIALIZED_OR_BE_ABSTRACT: (DiagnosticFactory0<(KtProperty..KtProperty?)>..DiagnosticFactory0<(KtProperty..KtProperty?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'diagnosticsToSuppress' @ [37:37] ==> value-parameter diagnosticsToSuppress: List<DiagnosticFactory<out Diagnostic>> defined in org.jetbrains.kotlin.resolve.diagnostics.SuppressDiagnosticsByAnnotations.<init>[ValueParameterDescriptorImpl]

'map' @ [37:59] ==> public inline fun <T, R> Iterable<DiagnosticFactory<out Diagnostic>>.map(transform: (DiagnosticFactory<out Diagnostic>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DiagnosticFactory<out Diagnostic>
    <R> -> String

'it' @ [37:65] ==> value-parameter it: DiagnosticFactory<out Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.SuppressDiagnosticsByAnnotations.stringsToSuppress.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [37:68] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out Diagnostic>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> Captured(out Diagnostic)

'toLowerCase' @ [37:73] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'annotationFqNames' @ [38:35] ==> value-parameter vararg annotationFqNames: FqName defined in org.jetbrains.kotlin.resolve.diagnostics.SuppressDiagnosticsByAnnotations.<init>[ValueParameterDescriptorImpl]

'toSet' @ [38:53] ==> public fun <T> Array<out FqName>.toSet(): Set<FqName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName

'if (annotationDescriptor.fqName in expectedFqNames) stringsToSuppress else emptyList()' @ [41:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'annotationDescriptor' @ [41:20] ==> value-parameter annotationDescriptor: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.diagnostics.SuppressDiagnosticsByAnnotations.get[ValueParameterDescriptorImpl]

'fqName' @ [41:41] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'expectedFqNames' @ [41:51] ==> private final val expectedFqNames: Set<FqName> defined in org.jetbrains.kotlin.resolve.diagnostics.SuppressDiagnosticsByAnnotations[PropertyDescriptorImpl]

'stringsToSuppress' @ [41:68] ==> private final val stringsToSuppress: List<String> defined in org.jetbrains.kotlin.resolve.diagnostics.SuppressDiagnosticsByAnnotations[PropertyDescriptorImpl]

'emptyList' @ [41:91] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

