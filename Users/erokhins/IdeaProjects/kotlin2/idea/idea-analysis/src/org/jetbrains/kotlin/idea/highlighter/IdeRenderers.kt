'JvmField' @ [30:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [30:42] ==> public fun <O> Renderer(block: (Collection<ResolvedCall<*>>) -> String): DiagnosticParameterRenderer<Collection<ResolvedCall<*>>> defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> Collection<ResolvedCall<*>>

'calls' @ [32:27] ==> value-parameter calls: Collection<ResolvedCall<*>> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_AMBIGUOUS_CALLS.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [33:18] ==> public inline fun <T, R> Iterable<ResolvedCall<*>>.map(transform: (ResolvedCall<*>) -> (CallableDescriptor..CallableDescriptor?)): List<(CallableDescriptor..CallableDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<*>
    <R> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'it' @ [33:24] ==> value-parameter it: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_AMBIGUOUS_CALLS.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [33:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'sortedWith' @ [34:18] ==> public fun <T> Iterable<(CallableDescriptor..CallableDescriptor?)>.sortedWith(comparator: Comparator<in (CallableDescriptor..CallableDescriptor?)> /* = Comparator<in (CallableDescriptor..CallableDescriptor?)> */): List<(CallableDescriptor..CallableDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'INSTANCE' @ [34:46] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

'RenderingContext' @ [35:23] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'Impl' @ [35:40] ==> public constructor Impl(objectsToRender: Collection<Any?>) defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl[DeserializedClassConstructorDescriptor]

'descriptors' @ [35:45] ==> val descriptors: List<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_AMBIGUOUS_CALLS.<anonymous>[LocalVariableDescriptor]

'descriptors' @ [36:9] ==> val descriptors: List<(CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_AMBIGUOUS_CALLS.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [36:21] ==> public fun <T> Iterable<(CallableDescriptor..CallableDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((CallableDescriptor..CallableDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'HTML' @ [36:47] ==> @JvmField public final val HTML: SmartDescriptorRenderer defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers[PropertyDescriptorImpl]

'render' @ [36:52] ==> public open fun render(obj: DeclarationDescriptor, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartDescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [36:59] ==> value-parameter it: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_AMBIGUOUS_CALLS.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [36:63] ==> val context: RenderingContext.Impl defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_AMBIGUOUS_CALLS.<anonymous>[LocalVariableDescriptor]

'JvmField' @ [39:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'SmartTypeRenderer' @ [39:38] ==> public constructor SmartTypeRenderer(baseRenderer: DescriptorRenderer) defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[DeserializedClassConstructorDescriptor]

'HTML' @ [39:75] ==> @field:JvmField public final val HTML: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'withOptions' @ [39:80] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'parameterNamesInFunctionalTypes' @ [39:94] ==> public abstract var parameterNamesInFunctionalTypes: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'JvmField' @ [41:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [41:48] ==> public fun <O> Renderer(block: (Collection<ResolvedCall<*>>) -> String): DiagnosticParameterRenderer<Collection<ResolvedCall<*>>> defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> Collection<ResolvedCall<*>>

'RenderingContext' @ [43:23] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'Impl' @ [43:40] ==> public constructor Impl(objectsToRender: Collection<Any?>) defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Impl[DeserializedClassConstructorDescriptor]

'calls' @ [43:45] ==> value-parameter calls: Collection<ResolvedCall<*>> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_NONE_APPLICABLE_CALLS.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [43:51] ==> public inline fun <T, R> Iterable<ResolvedCall<*>>.map(transform: (ResolvedCall<*>) -> (CallableDescriptor..CallableDescriptor?)): List<(CallableDescriptor..CallableDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<*>
    <R> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'it' @ [43:57] ==> value-parameter it: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_NONE_APPLICABLE_CALLS.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [43:60] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'compareBy' @ [44:26] ==> @InlineOnly public inline fun <T, K> compareBy(comparator: Comparator<in (CallableDescriptor..CallableDescriptor?)> /* = Comparator<in (CallableDescriptor..CallableDescriptor?)> */, crossinline selector: (ResolvedCall<*>) -> (CallableDescriptor..CallableDescriptor?)): Comparator<ResolvedCall<*>> /* = Comparator<ResolvedCall<*>> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<*>
    <K> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'INSTANCE' @ [44:53] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

'c' @ [44:87] ==> value-parameter c: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_NONE_APPLICABLE_CALLS.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [44:89] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'calls' @ [45:9] ==> value-parameter calls: Collection<ResolvedCall<*>> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_NONE_APPLICABLE_CALLS.<anonymous>[ValueParameterDescriptorImpl]

'sortedWith' @ [46:18] ==> public fun <T> Iterable<ResolvedCall<*>>.sortedWith(comparator: Comparator<in ResolvedCall<*>> /* = Comparator<in ResolvedCall<*>> */): List<ResolvedCall<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<*>

'comparator' @ [46:29] ==> val comparator: Comparator<ResolvedCall<*>> /* = Comparator<ResolvedCall<*>> */ defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_NONE_APPLICABLE_CALLS.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [47:18] ==> public fun <T> Iterable<ResolvedCall<*>>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((ResolvedCall<*>) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<*>

'renderResolvedCall' @ [47:44] ==> public fun renderResolvedCall(resolvedCall: ResolvedCall<*>, context: RenderingContext): String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [47:63] ==> value-parameter it: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_NONE_APPLICABLE_CALLS.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [47:67] ==> val context: RenderingContext.Impl defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_NONE_APPLICABLE_CALLS.<anonymous>[LocalVariableDescriptor]

'JvmField' @ [50:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [50:76] ==> public fun <O> Renderer(block: (InferenceErrorData) -> String): DiagnosticParameterRenderer<InferenceErrorData> defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> InferenceErrorData

'Renderers' @ [51:9] ==> public object Renderers defined in org.jetbrains.kotlin.diagnostics.rendering[FakeCallableDescriptorForObject]

'renderConflictingSubstitutionsInferenceError' @ [51:19] ==> @JvmStatic public final fun renderConflictingSubstitutionsInferenceError(inferenceErrorData: InferenceErrorData, result: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[DeserializedSimpleFunctionDescriptor]

'it' @ [51:64] ==> value-parameter it: InferenceErrorData defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_TYPE_INFERENCE_CONFLICTING_SUBSTITUTIONS_RENDERER.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [51:97] ==> public open fun create(): (HtmlTabledDescriptorRenderer..HtmlTabledDescriptorRenderer?) defined in org.jetbrains.kotlin.idea.highlighter.HtmlTabledDescriptorRenderer[JavaMethodDescriptor]

'toString' @ [51:107] ==> public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'JvmField' @ [54:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [54:77] ==> public fun <O> Renderer(block: (InferenceErrorData) -> String): DiagnosticParameterRenderer<InferenceErrorData> defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> InferenceErrorData

'Renderers' @ [55:9] ==> public object Renderers defined in org.jetbrains.kotlin.diagnostics.rendering[FakeCallableDescriptorForObject]

'renderParameterConstraintError' @ [55:19] ==> @JvmStatic public final fun renderParameterConstraintError(inferenceErrorData: InferenceErrorData, renderer: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[DeserializedSimpleFunctionDescriptor]

'it' @ [55:50] ==> value-parameter it: InferenceErrorData defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_TYPE_INFERENCE_PARAMETER_CONSTRAINT_ERROR_RENDERER.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [55:83] ==> public open fun create(): (HtmlTabledDescriptorRenderer..HtmlTabledDescriptorRenderer?) defined in org.jetbrains.kotlin.idea.highlighter.HtmlTabledDescriptorRenderer[JavaMethodDescriptor]

'toString' @ [55:93] ==> public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'JvmField' @ [58:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [58:79] ==> public fun <O> Renderer(block: (InferenceErrorData) -> String): DiagnosticParameterRenderer<InferenceErrorData> defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> InferenceErrorData

'Renderers' @ [59:9] ==> public object Renderers defined in org.jetbrains.kotlin.diagnostics.rendering[FakeCallableDescriptorForObject]

'renderNoInformationForParameterError' @ [59:19] ==> @JvmStatic public final fun renderNoInformationForParameterError(inferenceErrorData: InferenceErrorData, result: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[DeserializedSimpleFunctionDescriptor]

'it' @ [59:56] ==> value-parameter it: InferenceErrorData defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_TYPE_INFERENCE_NO_INFORMATION_FOR_PARAMETER_RENDERER.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [59:89] ==> public open fun create(): (HtmlTabledDescriptorRenderer..HtmlTabledDescriptorRenderer?) defined in org.jetbrains.kotlin.idea.highlighter.HtmlTabledDescriptorRenderer[JavaMethodDescriptor]

'toString' @ [59:99] ==> public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'JvmField' @ [62:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [62:71] ==> public fun <O> Renderer(block: (InferenceErrorData) -> String): DiagnosticParameterRenderer<InferenceErrorData> defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> InferenceErrorData

'Renderers' @ [63:9] ==> public object Renderers defined in org.jetbrains.kotlin.diagnostics.rendering[FakeCallableDescriptorForObject]

'renderUpperBoundViolatedInferenceError' @ [63:19] ==> @JvmStatic public final fun renderUpperBoundViolatedInferenceError(inferenceErrorData: InferenceErrorData, result: TabledDescriptorRenderer): TabledDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[DeserializedSimpleFunctionDescriptor]

'it' @ [63:58] ==> value-parameter it: InferenceErrorData defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_TYPE_INFERENCE_UPPER_BOUND_VIOLATED_RENDERER.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [63:91] ==> public open fun create(): (HtmlTabledDescriptorRenderer..HtmlTabledDescriptorRenderer?) defined in org.jetbrains.kotlin.idea.highlighter.HtmlTabledDescriptorRenderer[JavaMethodDescriptor]

'toString' @ [63:101] ==> public open fun toString(): String defined in org.jetbrains.kotlin.diagnostics.rendering.TabledDescriptorRenderer[JavaMethodDescriptor]

'JvmField' @ [66:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'ContextDependentRenderer' @ [66:45] ==> public fun <O> ContextDependentRenderer(block: (CallableMemberDescriptor, RenderingContext) -> String): DiagnosticParameterRenderer<CallableMemberDescriptor> defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> CallableMemberDescriptor

'HTML_RENDER_TYPE' @ [68:9] ==> @JvmField public final val HTML_RENDER_TYPE: SmartTypeRenderer defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers[PropertyDescriptorImpl]

'render' @ [68:26] ==> public open fun render(obj: KotlinType, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[DeserializedSimpleFunctionDescriptor]

'member' @ [68:33] ==> value-parameter member: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_RENDER_RETURN_TYPE.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [68:40] ==> public final val CallableMemberDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'context' @ [68:54] ==> value-parameter context: RenderingContext defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_RENDER_RETURN_TYPE.<anonymous>[ValueParameterDescriptorImpl]

'JvmField' @ [71:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'Renderer' @ [71:60] ==> public fun <O> Renderer(block: (ConflictingJvmDeclarationsData) -> String): DiagnosticParameterRenderer<ConflictingJvmDeclarationsData> defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> ConflictingJvmDeclarationsData

'data' @ [74:27] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_CONFLICTING_JVM_DECLARATIONS_DATA.<anonymous>[ValueParameterDescriptorImpl]

'signatureOrigins' @ [74:32] ==> public final val signatureOrigins: Collection<JvmDeclarationOrigin> defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ConflictingJvmDeclarationsData[DeserializedPropertyDescriptor]

'mapNotNull' @ [75:18] ==> public inline fun <T, R : Any> Iterable<JvmDeclarationOrigin>.mapNotNull(transform: (JvmDeclarationOrigin) -> DeclarationDescriptor?): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmDeclarationOrigin
    <R : Any> -> DeclarationDescriptor

'it' @ [75:31] ==> value-parameter it: JvmDeclarationOrigin defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_CONFLICTING_JVM_DECLARATIONS_DATA.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [75:34] ==> public final val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.JvmDeclarationOrigin[DeserializedPropertyDescriptor]

'sortedWith' @ [76:18] ==> public fun <T> Iterable<DeclarationDescriptor>.sortedWith(comparator: Comparator<in DeclarationDescriptor> /* = Comparator<in DeclarationDescriptor> */): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'INSTANCE' @ [76:46] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

'RenderingContext' @ [77:23] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'of' @ [77:40] ==> @JvmStatic public final fun of(vararg objectsToRender: Any?): RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion[DeserializedSimpleFunctionDescriptor]

'descriptors' @ [77:43] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_CONFLICTING_JVM_DECLARATIONS_DATA.<anonymous>[LocalVariableDescriptor]

'descriptors' @ [78:25] ==> val descriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_CONFLICTING_JVM_DECLARATIONS_DATA.<anonymous>[LocalVariableDescriptor]

'joinToString' @ [78:37] ==> public fun <T> Iterable<DeclarationDescriptor>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((DeclarationDescriptor) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'+' @ [78:56] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'HTML' @ [78:65] ==> @JvmField public final val HTML: SmartDescriptorRenderer defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers[PropertyDescriptorImpl]

'render' @ [78:70] ==> public open fun render(obj: DeclarationDescriptor, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartDescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [78:77] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_CONFLICTING_JVM_DECLARATIONS_DATA.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [78:81] ==> val context: RenderingContext defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_CONFLICTING_JVM_DECLARATIONS_DATA.<anonymous>[LocalVariableDescriptor]

'data' @ [80:74] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_CONFLICTING_JVM_DECLARATIONS_DATA.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [80:79] ==> public final val signature: RawSignature defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ConflictingJvmDeclarationsData[DeserializedPropertyDescriptor]

'name' @ [80:89] ==> public final val name: String defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedPropertyDescriptor]

'data' @ [80:96] ==> value-parameter data: ConflictingJvmDeclarationsData defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_CONFLICTING_JVM_DECLARATIONS_DATA.<anonymous>[ValueParameterDescriptorImpl]

'signature' @ [80:101] ==> public final val signature: RawSignature defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.ConflictingJvmDeclarationsData[DeserializedPropertyDescriptor]

'desc' @ [80:111] ==> public final val desc: String defined in org.jetbrains.kotlin.resolve.jvm.diagnostics.RawSignature[DeserializedPropertyDescriptor]

'conflicts' @ [80:139] ==> val conflicts: String defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_CONFLICTING_JVM_DECLARATIONS_DATA.<anonymous>[LocalVariableDescriptor]

'JvmField' @ [83:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'ContextDependentRenderer' @ [83:36] ==> public fun <O> ContextDependentRenderer(block: (Throwable, RenderingContext) -> String): DiagnosticParameterRenderer<Throwable> defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <O> -> Throwable

'Renderers' @ [85:9] ==> public object Renderers defined in org.jetbrains.kotlin.diagnostics.rendering[FakeCallableDescriptorForObject]

'THROWABLE' @ [85:19] ==> @field:JvmField public final val THROWABLE: DiagnosticParameterRenderer<Throwable> defined in org.jetbrains.kotlin.diagnostics.rendering.Renderers[DeserializedPropertyDescriptor]

'render' @ [85:29] ==> public abstract fun render(obj: Throwable, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticParameterRenderer[DeserializedSimpleFunctionDescriptor]

'throwable' @ [85:36] ==> value-parameter throwable: Throwable defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_THROWABLE.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [85:47] ==> value-parameter context: RenderingContext defined in org.jetbrains.kotlin.idea.highlighter.IdeRenderers.HTML_THROWABLE.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [85:56] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JvmField' @ [88:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'DescriptorRenderer' @ [88:26] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'HTML' @ [88:45] ==> @field:JvmField public final val HTML: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'asRenderer' @ [88:50] ==> public fun DescriptorRenderer.asRenderer(): SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]

