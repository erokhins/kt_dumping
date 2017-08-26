'linkedMapOf' @ [28:39] ==> @SinceKotlin @InlineOnly public inline fun <K, V> linkedMapOf(): LinkedHashMap<PsiElement, CallableDescriptor> /* = LinkedHashMap<PsiElement, CallableDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiElement
    <V> -> CallableDescriptor

'call' @ [32:13] ==> value-parameter call: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining[ValueParameterDescriptorImpl]

'call' @ [33:31] ==> value-parameter call: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining[ValueParameterDescriptorImpl]

'call' @ [33:36] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [33:41] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'processingFunctions' @ [34:17] ==> private final val processingFunctions: LinkedHashMap<PsiElement, CallableDescriptor> /* = LinkedHashMap<PsiElement, CallableDescriptor> */ defined in org.jetbrains.kotlin.codegen.InlineCycleReporter[PropertyDescriptorImpl]

'contains' @ [34:37] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out PsiElement, CallableDescriptor>.contains(key: PsiElement): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> PsiElement
    <V> -> CallableDescriptor

'callElement' @ [34:46] ==> val callElement: KtElement defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining[LocalVariableDescriptor]

'processingFunctions' @ [35:29] ==> private final val processingFunctions: LinkedHashMap<PsiElement, CallableDescriptor> /* = LinkedHashMap<PsiElement, CallableDescriptor> */ defined in org.jetbrains.kotlin.codegen.InlineCycleReporter[PropertyDescriptorImpl]

'asSequence' @ [35:49] ==> public fun <K, V> Map<out PsiElement, CallableDescriptor>.asSequence(): Sequence<Map.Entry<PsiElement, CallableDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiElement
    <V> -> CallableDescriptor

'dropWhile' @ [35:62] ==> public fun <T> Sequence<Map.Entry<PsiElement, CallableDescriptor>>.dropWhile(predicate: (Map.Entry<PsiElement, CallableDescriptor>) -> Boolean): Sequence<Map.Entry<PsiElement, CallableDescriptor>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<PsiElement, CallableDescriptor>

'it' @ [35:74] ==> value-parameter it: Map.Entry<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [35:77] ==> public abstract val key: PsiElement defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'callElement' @ [35:84] ==> val callElement: KtElement defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining[LocalVariableDescriptor]

'cycle' @ [36:17] ==> val cycle: Sequence<Map.Entry<PsiElement, CallableDescriptor>> defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining[LocalVariableDescriptor]

'forEach' @ [36:23] ==> public inline fun <T> Sequence<Map.Entry<PsiElement, CallableDescriptor>>.forEach(action: (Map.Entry<PsiElement, CallableDescriptor>) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<PsiElement, CallableDescriptor>

'diagnostics' @ [37:21] ==> private final val diagnostics: DiagnosticSink defined in org.jetbrains.kotlin.codegen.InlineCycleReporter[PropertyDescriptorImpl]

'report' @ [37:33] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'INLINE_CALL_CYCLE' @ [37:47] ==> public final val INLINE_CALL_CYCLE: (DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [37:65] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: CallableDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [37:68] ==> value-parameter it: Map.Entry<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [37:71] ==> public abstract val key: PsiElement defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [37:76] ==> value-parameter it: Map.Entry<PsiElement, CallableDescriptor> defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [37:79] ==> public abstract val value: CallableDescriptor defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'processingFunctions' @ [41:13] ==> private final val processingFunctions: LinkedHashMap<PsiElement, CallableDescriptor> /* = LinkedHashMap<PsiElement, CallableDescriptor> */ defined in org.jetbrains.kotlin.codegen.InlineCycleReporter[PropertyDescriptorImpl]

'put' @ [41:33] ==> public open fun put(key: PsiElement, value: CallableDescriptor): CallableDescriptor? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'callElement' @ [41:37] ==> val callElement: KtElement defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining[LocalVariableDescriptor]

'call' @ [41:50] ==> value-parameter call: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.enterIntoInlining[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [41:55] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'original' @ [41:75] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'call' @ [47:13] ==> value-parameter call: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.exitFromInliningOf[ValueParameterDescriptorImpl]

'call' @ [48:31] ==> value-parameter call: ResolvedCall<*>? defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.exitFromInliningOf[ValueParameterDescriptorImpl]

'call' @ [48:36] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [48:41] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'processingFunctions' @ [49:13] ==> private final val processingFunctions: LinkedHashMap<PsiElement, CallableDescriptor> /* = LinkedHashMap<PsiElement, CallableDescriptor> */ defined in org.jetbrains.kotlin.codegen.InlineCycleReporter[PropertyDescriptorImpl]

'remove' @ [49:33] ==> public open fun remove(key: PsiElement): CallableDescriptor? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'callElement' @ [49:40] ==> val callElement: KtElement defined in org.jetbrains.kotlin.codegen.InlineCycleReporter.exitFromInliningOf[LocalVariableDescriptor]

