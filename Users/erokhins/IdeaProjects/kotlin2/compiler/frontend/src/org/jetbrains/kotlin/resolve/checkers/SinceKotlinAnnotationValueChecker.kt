'let' @ [31:50] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Regex): Regex defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Regex

'Regex' @ [31:66] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'number' @ [31:74] ==> value-parameter number: String defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.regex.<anonymous>[ValueParameterDescriptorImpl]

'number' @ [31:84] ==> value-parameter number: String defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.regex.<anonymous>[ValueParameterDescriptorImpl]

'number' @ [31:95] ==> value-parameter number: String defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.regex.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [40:26] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[ValueParameterDescriptorImpl]

'getSinceKotlinAnnotation' @ [40:37] ==> internal fun DeclarationDescriptor.getSinceKotlinAnnotation(): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve in file sinceKotlinUtil.kt[SimpleFunctionDescriptorImpl]

'annotation' @ [41:23] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[LocalVariableDescriptor]

'allValueArguments' @ [41:34] ==> public abstract val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'values' @ [41:52] ==> public abstract val values: Collection<ConstantValue<*>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'singleOrNull' @ [41:59] ==> public fun <T> Iterable<ConstantValue<*>>.singleOrNull(): ConstantValue<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<*>

'value' @ [41:75] ==> public open val value: Any? defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'!' @ [42:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'version' @ [42:14] ==> val version: String defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[LocalVariableDescriptor]

'matches' @ [42:22] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'regex' @ [42:30] ==> private final val regex: Regex defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker[PropertyDescriptorImpl]

'diagnosticHolder' @ [43:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[ValueParameterDescriptorImpl]

'report' @ [43:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'ILLEGAL_SINCE_KOTLIN_VALUE' @ [43:37] ==> public final val ILLEGAL_SINCE_KOTLIN_VALUE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [43:64] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'annotation' @ [43:67] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[LocalVariableDescriptor]

'source' @ [43:78] ==> public abstract val source: SourceElement defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'getPsi' @ [43:85] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source in file KotlinSourceElement.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [43:97] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[ValueParameterDescriptorImpl]

'ApiVersion' @ [47:26] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'parse' @ [47:37] ==> public final fun parse(versionString: String): ApiVersion? defined in org.jetbrains.kotlin.config.ApiVersion.Companion[DeserializedSimpleFunctionDescriptor]

'version' @ [47:43] ==> val version: String defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[LocalVariableDescriptor]

'languageVersionSettings' @ [48:25] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[ValueParameterDescriptorImpl]

'apiVersion' @ [48:49] ==> public abstract val apiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedPropertyDescriptor]

'apiVersion' @ [49:13] ==> val apiVersion: ApiVersion? defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[LocalVariableDescriptor]

'apiVersion' @ [49:35] ==> val apiVersion: ApiVersion? defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[LocalVariableDescriptor]

'specified' @ [49:48] ==> val specified: ApiVersion defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [50:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[ValueParameterDescriptorImpl]

'report' @ [50:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'NEWER_VERSION_IN_SINCE_KOTLIN' @ [50:37] ==> public final val NEWER_VERSION_IN_SINCE_KOTLIN: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [50:67] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'annotation' @ [50:70] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[LocalVariableDescriptor]

'source' @ [50:81] ==> public abstract val source: SourceElement defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'getPsi' @ [50:88] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source in file KotlinSourceElement.kt[SimpleFunctionDescriptorImpl]

'declaration' @ [50:100] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[ValueParameterDescriptorImpl]

'specified' @ [50:113] ==> val specified: ApiVersion defined in org.jetbrains.kotlin.resolve.checkers.SinceKotlinAnnotationValueChecker.check[LocalVariableDescriptor]

'versionString' @ [50:123] ==> public final val versionString: String defined in org.jetbrains.kotlin.config.ApiVersion[DeserializedPropertyDescriptor]

