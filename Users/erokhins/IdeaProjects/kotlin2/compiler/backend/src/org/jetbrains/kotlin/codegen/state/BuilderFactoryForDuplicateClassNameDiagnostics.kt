'ClassNameCollectionClassBuilderFactory' @ [30:5] ==> public constructor ClassNameCollectionClassBuilderFactory(delegate: ClassBuilderFactory) defined in org.jetbrains.kotlin.codegen.ClassNameCollectionClassBuilderFactory[ClassConstructorDescriptorImpl]

'builderFactory' @ [30:44] ==> value-parameter builderFactory: ClassBuilderFactory defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.<init>[ValueParameterDescriptorImpl]

'hashMapOf' @ [32:29] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, JvmDeclarationOrigin> /* = HashMap<String, JvmDeclarationOrigin> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JvmDeclarationOrigin

'className' @ [35:23] ==> private final val className: HashMap<String, JvmDeclarationOrigin> /* = HashMap<String, JvmDeclarationOrigin> */ defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics[PropertyDescriptorImpl]

'getOrPut' @ [35:33] ==> public inline fun <K, V> MutableMap<String, JvmDeclarationOrigin>.getOrPut(key: String, defaultValue: () -> JvmDeclarationOrigin): JvmDeclarationOrigin defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JvmDeclarationOrigin

'internalName' @ [35:42] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.handleClashingNames[ValueParameterDescriptorImpl]

'origin' @ [35:58] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.handleClashingNames[ValueParameterDescriptorImpl]

'origin' @ [37:13] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.handleClashingNames[ValueParameterDescriptorImpl]

'element' @ [37:20] ==> public final val element: PsiElement? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'another' @ [37:31] ==> val another: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.handleClashingNames[LocalVariableDescriptor]

'element' @ [37:39] ==> public final val element: PsiElement? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'reportError' @ [38:13] ==> private final fun reportError(internalName: String, vararg another: JvmDeclarationOrigin): Unit defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics[SimpleFunctionDescriptorImpl]

'internalName' @ [38:25] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.handleClashingNames[ValueParameterDescriptorImpl]

'origin' @ [38:39] ==> value-parameter origin: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.handleClashingNames[ValueParameterDescriptorImpl]

'another' @ [38:47] ==> val another: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.handleClashingNames[LocalVariableDescriptor]

'another' @ [43:26] ==> value-parameter vararg another: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.reportError[ValueParameterDescriptorImpl]

'mapNotNull' @ [43:34] ==> public inline fun <T, R : Any> Array<out JvmDeclarationOrigin>.mapNotNull(transform: (JvmDeclarationOrigin) -> DeclarationDescriptor?): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDeclarationOrigin
    <R : Any> -> DeclarationDescriptor

'it' @ [43:47] ==> value-parameter it: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.reportError.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [43:50] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'joinToString' @ [44:17] ==> public fun <T> Iterable<DeclarationDescriptor>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((DeclarationDescriptor) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'DescriptorRenderer' @ [44:32] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'ONLY_NAMES_WITH_SHORT_TYPES' @ [44:51] ==> @field:JvmField public final val ONLY_NAMES_WITH_SHORT_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [44:79] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [44:86] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.reportError.<anonymous>[ValueParameterDescriptorImpl]

'another' @ [46:9] ==> value-parameter vararg another: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.reportError[ValueParameterDescriptorImpl]

'mapNotNull' @ [46:17] ==> public inline fun <T, R : Any> Array<out JvmDeclarationOrigin>.mapNotNull(transform: (JvmDeclarationOrigin) -> PsiElement?): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDeclarationOrigin
    <R : Any> -> PsiElement

'it' @ [46:30] ==> value-parameter it: JvmDeclarationOrigin defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.reportError.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [46:33] ==> public final val element: PsiElement? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'forEach' @ [46:43] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'diagnostics' @ [47:13] ==> private final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics[PropertyDescriptorImpl]

'report' @ [47:25] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'DUPLICATE_CLASS_NAMES' @ [47:42] ==> public final val DUPLICATE_CLASS_NAMES: (DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ErrorsJvm[JavaPropertyDescriptor]

'on' @ [47:64] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: String, @NotNull p2: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'it' @ [47:67] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.reportError.<anonymous>[ValueParameterDescriptorImpl]

'internalName' @ [47:71] ==> value-parameter internalName: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.reportError[ValueParameterDescriptorImpl]

'fromString' @ [47:85] ==> val fromString: String defined in org.jetbrains.kotlin.codegen.state.BuilderFactoryForDuplicateClassNameDiagnostics.reportError[LocalVariableDescriptor]

