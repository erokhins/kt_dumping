'resolvedCall' @ [37:35] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [37:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'collectDiagnostics' @ [38:28] ==> private final fun collectDiagnostics(reportOn: PsiElement, descriptor: CallableDescriptor): Set<Diagnostic> defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker[SimpleFunctionDescriptorImpl]

'reportOn' @ [38:47] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [38:57] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.check[LocalVariableDescriptor]

'context' @ [39:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.check[ValueParameterDescriptorImpl]

'trace' @ [39:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'report' @ [39:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [39:34] ==> val diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.check[LocalVariableDescriptor]

'resultingDescriptor' @ [42:32] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.check[LocalVariableDescriptor]

'containerSource' @ [42:87] ==> public abstract val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberDescriptor[DeserializedPropertyDescriptor]

'incompatibilityDiagnosticFor' @ [43:9] ==> private final fun incompatibilityDiagnosticFor(source: SourceElement?, reportOn: PsiElement): Diagnostic? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker[SimpleFunctionDescriptorImpl]

'containerSource' @ [43:38] ==> val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.check[LocalVariableDescriptor]

'reportOn' @ [43:55] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.check[ValueParameterDescriptorImpl]

'let' @ [43:66] ==> @InlineOnly public inline fun <T, R> Diagnostic.let(block: (Diagnostic) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Unit

'context' @ [43:70] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.check[ValueParameterDescriptorImpl]

'trace' @ [43:78] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'descriptor' @ [47:13] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.diagnosticFor[ValueParameterDescriptorImpl]

'MISSING_DEPENDENCY_CLASS' @ [48:20] ==> public final val MISSING_DEPENDENCY_CLASS: (DiagnosticFactory1<(PsiElement..PsiElement?), (FqName..FqName?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (FqName..FqName?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [48:45] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: FqName): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [48:48] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.diagnosticFor[ValueParameterDescriptorImpl]

'descriptor' @ [48:58] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.diagnosticFor[ValueParameterDescriptorImpl]

'fqNameSafe' @ [48:69] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'incompatibilityDiagnosticFor' @ [51:16] ==> private final fun incompatibilityDiagnosticFor(source: SourceElement?, reportOn: PsiElement): Diagnostic? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker[SimpleFunctionDescriptorImpl]

'descriptor' @ [51:45] ==> value-parameter descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.diagnosticFor[ValueParameterDescriptorImpl]

'source' @ [51:56] ==> public final val ClassifierDescriptor.source: SourceElement[MyPropertyDescriptor]

'reportOn' @ [51:64] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.diagnosticFor[ValueParameterDescriptorImpl]

'source' @ [55:13] ==> value-parameter source: SourceElement? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.incompatibilityDiagnosticFor[ValueParameterDescriptorImpl]

'source' @ [56:35] ==> value-parameter source: SourceElement? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.incompatibilityDiagnosticFor[ValueParameterDescriptorImpl]

'incompatibility' @ [56:42] ==> public abstract val incompatibility: IncompatibleVersionErrorData<*>? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedContainerSource[DeserializedPropertyDescriptor]

'incompatibility' @ [57:17] ==> val incompatibility: IncompatibleVersionErrorData<*>? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.incompatibilityDiagnosticFor[LocalVariableDescriptor]

'INCOMPATIBLE_CLASS' @ [58:24] ==> public final val INCOMPATIBLE_CLASS: (DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (IncompatibleVersionErrorData<*>..IncompatibleVersionErrorData<*>?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (IncompatibleVersionErrorData<*>..IncompatibleVersionErrorData<*>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [58:43] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: String, @NotNull b: IncompatibleVersionErrorData<*>): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportOn' @ [58:46] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.incompatibilityDiagnosticFor[ValueParameterDescriptorImpl]

'source' @ [58:56] ==> value-parameter source: SourceElement? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.incompatibilityDiagnosticFor[ValueParameterDescriptorImpl]

'presentableString' @ [58:63] ==> public abstract val presentableString: String defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedContainerSource[DeserializedPropertyDescriptor]

'incompatibility' @ [58:82] ==> val incompatibility: IncompatibleVersionErrorData<*>? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.incompatibilityDiagnosticFor[LocalVariableDescriptor]

'source' @ [60:17] ==> value-parameter source: SourceElement? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.incompatibilityDiagnosticFor[ValueParameterDescriptorImpl]

'isPreReleaseInvisible' @ [60:24] ==> public abstract val isPreReleaseInvisible: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedContainerSource[DeserializedPropertyDescriptor]

'PRE_RELEASE_CLASS' @ [61:24] ==> public final val PRE_RELEASE_CLASS: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [61:42] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [61:45] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.incompatibilityDiagnosticFor[ValueParameterDescriptorImpl]

'source' @ [61:55] ==> value-parameter source: SourceElement? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.incompatibilityDiagnosticFor[ValueParameterDescriptorImpl]

'presentableString' @ [61:62] ==> public abstract val presentableString: String defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedContainerSource[DeserializedPropertyDescriptor]

'newLinkedHashSetWithExpectedSize' @ [69:46] ==> public fun <E> newLinkedHashSetWithExpectedSize(expectedSize: Int): LinkedHashSet<Diagnostic> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E> -> Diagnostic

'diagnosticFor' @ [72:30] ==> private final fun diagnosticFor(descriptor: ClassifierDescriptor, reportOn: PsiElement): Diagnostic? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker[SimpleFunctionDescriptorImpl]

'classDescriptor' @ [72:44] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics.consider[ValueParameterDescriptorImpl]

'reportOn' @ [72:61] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics[ValueParameterDescriptorImpl]

'diagnostic' @ [73:17] ==> val diagnostic: Diagnostic? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics.consider[LocalVariableDescriptor]

'result' @ [74:17] ==> val result: MutableSet<Diagnostic> defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics[LocalVariableDescriptor]

'add' @ [74:24] ==> public abstract fun add(element: Diagnostic): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'diagnostic' @ [74:28] ==> val diagnostic: Diagnostic? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics.consider[LocalVariableDescriptor]

'classDescriptor' @ [77:14] ==> value-parameter classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics.consider[ValueParameterDescriptorImpl]

'containingDeclaration' @ [77:30] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'let' @ [77:74] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> Unit

'!' @ [81:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isComputingDeferredType' @ [81:18] ==> @Suppress public fun CallChecker.isComputingDeferredType(type: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers[SimpleFunctionDescriptorImpl]

'type' @ [81:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics.consider[ValueParameterDescriptorImpl]

'type' @ [82:18] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics.consider[ValueParameterDescriptorImpl]

'constructor' @ [82:23] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [82:35] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'let' @ [82:79] ==> @InlineOnly public inline fun <T, R> ClassDescriptor.let(block: (ClassDescriptor) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> Unit

'descriptor' @ [86:9] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics[ValueParameterDescriptorImpl]

'returnType' @ [86:20] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [86:32] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Unit

'descriptor' @ [87:9] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [87:20] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'value' @ [87:48] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'type' @ [87:55] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'let' @ [87:61] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> Unit

'descriptor' @ [88:9] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics[ValueParameterDescriptorImpl]

'valueParameters' @ [88:20] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEach' @ [88:36] ==> @HidesMembers public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.forEach(action: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'consider' @ [88:46] ==> local final fun consider(type: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics[SimpleFunctionDescriptorImpl]

'it' @ [88:55] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [88:58] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'result' @ [90:16] ==> val result: MutableSet<Diagnostic> defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.collectDiagnostics[LocalVariableDescriptor]

'diagnosticFor' @ [100:13] ==> private final fun diagnosticFor(descriptor: ClassifierDescriptor, reportOn: PsiElement): Diagnostic? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker[SimpleFunctionDescriptorImpl]

'targetDescriptor' @ [100:27] ==> value-parameter targetDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'element' @ [100:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'let' @ [100:55] ==> @InlineOnly public inline fun <T, R> Diagnostic.let(block: (Diagnostic) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Unit

'trace' @ [100:59] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'targetDescriptor' @ [102:36] ==> value-parameter targetDescriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'containerSource' @ [102:88] ==> public abstract val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberDescriptor[DeserializedPropertyDescriptor]

'incompatibilityDiagnosticFor' @ [103:13] ==> private final fun incompatibilityDiagnosticFor(source: SourceElement?, reportOn: PsiElement): Diagnostic? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker[SimpleFunctionDescriptorImpl]

'containerSource' @ [103:42] ==> val containerSource: DeserializedContainerSource? defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.ClassifierUsage.check[LocalVariableDescriptor]

'element' @ [103:59] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

'let' @ [103:69] ==> @InlineOnly public inline fun <T, R> Diagnostic.let(block: (Diagnostic) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic
    <R> -> Unit

'trace' @ [103:73] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.checkers.MissingDependencyClassChecker.ClassifierUsage.check[ValueParameterDescriptorImpl]

