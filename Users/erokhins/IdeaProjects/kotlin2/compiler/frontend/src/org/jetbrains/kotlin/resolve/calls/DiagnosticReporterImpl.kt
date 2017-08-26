'HashMap' @ [33:142] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Class<out KotlinCallDiagnostic>
    <V : (Any..Any?)> -> [@kotlin.ExtensionFunctionType] Function2<KotlinCallDiagnostic, PsiElement, ParametrizedDiagnostic<*>>

'Suppress' @ [36:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'diagnosticMap' @ [37:9] ==> private final val diagnosticMap: MutableMap<Class<out KotlinCallDiagnostic>, KotlinCallDiagnostic.(PsiElement) -> ParametrizedDiagnostic<*>> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic[PropertyDescriptorImpl]

'put' @ [37:23] ==> public abstract fun put(key: Class<out KotlinCallDiagnostic>, value: KotlinCallDiagnostic.(PsiElement) -> ParametrizedDiagnostic<*>): (KotlinCallDiagnostic.(PsiElement) -> ParametrizedDiagnostic<*>)? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'klass' @ [37:27] ==> value-parameter klass: Class<C> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.checkPut[ValueParameterDescriptorImpl]

'factory' @ [37:34] ==> value-parameter factory: C.(PsiElement) -> ParametrizedDiagnostic<E>? defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.checkPut[ValueParameterDescriptorImpl]

'checkPut' @ [41:9] ==> private final fun <E : PsiElement, C : KotlinCallDiagnostic> checkPut(klass: Class<C>, factory: C.(PsiElement) -> ParametrizedDiagnostic<E>?): Unit defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : PsiElement> -> E
    <C : KotlinCallDiagnostic> -> C

'klass' @ [41:24] ==> value-parameter klass: Class<C> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put[ValueParameterDescriptorImpl]

'it' @ [42:14] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [42:25] ==> @InlineOnly public inline fun <T, R> E.let(block: (E) -> SimpleDiagnostic<(E..E?)>): SimpleDiagnostic<(E..E?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> E
    <R> -> SimpleDiagnostic<(E..E?)>

'factory0' @ [42:31] ==> value-parameter factory0: DiagnosticFactory0<E> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put[ValueParameterDescriptorImpl]

'on' @ [42:40] ==> @NotNull public open fun on(@NotNull element: E): SimpleDiagnostic<(E..E?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'it' @ [42:43] ==> value-parameter it: E defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'checkPut' @ [47:9] ==> private final fun <E : PsiElement, C : KotlinCallDiagnostic> checkPut(klass: Class<C>, factory: C.(PsiElement) -> ParametrizedDiagnostic<E>?): Unit defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : PsiElement> -> E
    <C : KotlinCallDiagnostic> -> C

'klass' @ [47:24] ==> value-parameter klass: Class<C> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put[ValueParameterDescriptorImpl]

'it' @ [48:14] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [48:25] ==> @InlineOnly public inline fun <T, R> E.let(block: (E) -> ParametrizedDiagnostic<(E..E?)>): ParametrizedDiagnostic<(E..E?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> E
    <R> -> ParametrizedDiagnostic<(E..E?)>

'factory1' @ [48:31] ==> value-parameter factory1: DiagnosticFactory1<E, A> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put[ValueParameterDescriptorImpl]

'on' @ [48:40] ==> @NotNull public open fun on(@NotNull element: E, @NotNull argument: A): ParametrizedDiagnostic<(E..E?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [48:43] ==> value-parameter it: E defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [48:47] ==> public abstract operator fun C.invoke(): A defined in kotlin.Function1[FunctionInvokeDescriptor]

'checkPut' @ [54:9] ==> private final fun <E : PsiElement, C : KotlinCallDiagnostic> checkPut(klass: Class<C>, factory: C.(PsiElement) -> ParametrizedDiagnostic<E>?): Unit defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : PsiElement> -> E
    <C : KotlinCallDiagnostic> -> C

'klass' @ [54:24] ==> value-parameter klass: Class<C> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put[ValueParameterDescriptorImpl]

'it' @ [55:14] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [55:25] ==> @InlineOnly public inline fun <T, R> E.let(block: (E) -> ParametrizedDiagnostic<(E..E?)>): ParametrizedDiagnostic<(E..E?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> E
    <R> -> ParametrizedDiagnostic<(E..E?)>

'factory2' @ [55:31] ==> value-parameter factory2: DiagnosticFactory2<E, A, B> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put[ValueParameterDescriptorImpl]

'on' @ [55:40] ==> @NotNull public open fun on(@NotNull element: E, @NotNull a: A, @NotNull b: B): ParametrizedDiagnostic<(E..E?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'it' @ [55:43] ==> value-parameter it: E defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.put.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [55:47] ==> public abstract operator fun C.invoke(): A defined in kotlin.Function1[FunctionInvokeDescriptor]

'invoke' @ [55:55] ==> public abstract operator fun C.invoke(): B defined in kotlin.Function1[FunctionInvokeDescriptor]

'put' @ [61:9] ==> private final inline fun <reified E : PsiElement, A, B, C : KotlinCallDiagnostic> put(factory2: DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>, klass: Class<TypeMismatchDiagnostic>, crossinline getA: TypeMismatchDiagnostic.() -> (KotlinType..KotlinType?), crossinline getB: TypeMismatchDiagnostic.() -> (KotlinType..KotlinType?)): Unit defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified E : PsiElement> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <A> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <B> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <C : KotlinCallDiagnostic> -> TypeMismatchDiagnostic

'TYPE_MISMATCH' @ [61:20] ==> public final val TYPE_MISMATCH: (DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'TypeMismatchDiagnostic' @ [61:35] ==> public constructor TypeMismatchDiagnostic(callArgument: KotlinCallArgument, expectedType: KotlinType, actualType: KotlinType) defined in org.jetbrains.kotlin.resolve.calls.TypeMismatchDiagnostic[ClassConstructorDescriptorImpl]

'java' @ [61:65] ==> public val <T> KClass<TypeMismatchDiagnostic>.java: Class<TypeMismatchDiagnostic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TypeMismatchDiagnostic

'TypeMismatchDiagnostic' @ [61:71] ==> public constructor TypeMismatchDiagnostic(callArgument: KotlinCallArgument, expectedType: KotlinType, actualType: KotlinType) defined in org.jetbrains.kotlin.resolve.calls.TypeMismatchDiagnostic[ClassConstructorDescriptorImpl]

'expectedType' @ [61:95] ==> public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.TypeMismatchDiagnostic[PropertyDescriptorImpl]

'TypeMismatchDiagnostic' @ [61:109] ==> public constructor TypeMismatchDiagnostic(callArgument: KotlinCallArgument, expectedType: KotlinType, actualType: KotlinType) defined in org.jetbrains.kotlin.resolve.calls.TypeMismatchDiagnostic[ClassConstructorDescriptorImpl]

'actualType' @ [61:133] ==> public final val actualType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.TypeMismatchDiagnostic[PropertyDescriptorImpl]

'diagnostic' @ [67:31] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.toDiagnostic[ValueParameterDescriptorImpl]

'javaClass' @ [67:42] ==> public val <T : Any> KotlinCallDiagnostic.javaClass: Class<KotlinCallDiagnostic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KotlinCallDiagnostic

'diagnosticMap' @ [68:23] ==> private final val diagnosticMap: MutableMap<Class<out KotlinCallDiagnostic>, KotlinCallDiagnostic.(PsiElement) -> ParametrizedDiagnostic<*>> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic[PropertyDescriptorImpl]

'diagnosticClass' @ [68:37] ==> val diagnosticClass: Class<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.toDiagnostic[LocalVariableDescriptor]

'error' @ [68:57] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'diagnosticClass' @ [68:97] ==> val diagnosticClass: Class<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.toDiagnostic[LocalVariableDescriptor]

'canonicalName' @ [68:113] ==> public final val <T : (Any..Any?)> Class<KotlinCallDiagnostic>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinCallDiagnostic

'Suppress' @ [70:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'invoke' @ [71:16] ==> public abstract operator fun invoke(p1: KotlinCallDiagnostic, p2: PsiElement): ParametrizedDiagnostic<*> defined in kotlin.Function2[FunctionInvokeDescriptor]

'diagnostic' @ [71:24] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.toDiagnostic[ValueParameterDescriptorImpl]

'element' @ [71:36] ==> value-parameter element: E defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic.toDiagnostic[ValueParameterDescriptorImpl]

'CallDiagnosticToDiagnostic' @ [79:17] ==> public object CallDiagnosticToDiagnostic defined in org.jetbrains.kotlin.resolve.calls in file DiagnosticReporterImpl.kt[FakeCallableDescriptorForObject]

'toDiagnostic' @ [79:44] ==> public final fun <E : PsiElement> toDiagnostic(element: KtElement, diagnostic: KotlinCallDiagnostic): ParametrizedDiagnostic<KtElement>? defined in org.jetbrains.kotlin.resolve.calls.CallDiagnosticToDiagnostic[SimpleFunctionDescriptorImpl]
Inferred types:
    <E : PsiElement> -> KtElement

'callArgument' @ [79:58] ==> value-parameter callArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterImpl.onCallArgument[ValueParameterDescriptorImpl]

'asElement' @ [79:89] ==> public abstract fun asElement(): KtElement defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'diagnostic' @ [79:102] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterImpl.onCallArgument[ValueParameterDescriptorImpl]

'd' @ [80:13] ==> val d: ParametrizedDiagnostic<KtElement>? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterImpl.onCallArgument[LocalVariableDescriptor]

'bindingTrace' @ [81:13] ==> private final val bindingTrace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterImpl[PropertyDescriptorImpl]

'report' @ [81:26] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'd' @ [81:33] ==> val d: ParametrizedDiagnostic<KtElement>? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterImpl.onCallArgument[LocalVariableDescriptor]

'KotlinCallDiagnostic' @ [91:5] ==> public constructor KotlinCallDiagnostic(candidateApplicability: ResolutionCandidateApplicability) defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallDiagnostic[DeserializedClassConstructorDescriptor]

'INAPPLICABLE' @ [91:59] ==> enum entry INAPPLICABLE defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'reporter' @ [92:57] ==> value-parameter reporter: DiagnosticReporter defined in org.jetbrains.kotlin.resolve.calls.TypeMismatchDiagnostic.report[ValueParameterDescriptorImpl]

'onCallArgument' @ [92:66] ==> public abstract fun onCallArgument(callArgument: KotlinCallArgument, diagnostic: KotlinCallDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.model.DiagnosticReporter[DeserializedSimpleFunctionDescriptor]

'callArgument' @ [92:81] ==> public final val callArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.TypeMismatchDiagnostic[PropertyDescriptorImpl]

'this' @ [92:95] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.TypeMismatchDiagnostic[LazyClassReceiverParameterDescriptor]

