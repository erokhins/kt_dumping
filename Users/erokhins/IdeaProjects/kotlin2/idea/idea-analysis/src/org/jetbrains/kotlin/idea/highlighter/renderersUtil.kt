'STRONG_TEMPLATE' @ [38:36] ==> private val STRONG_TEMPLATE: String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[PropertyDescriptorImpl]

'format' @ [38:52] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'o' @ [38:59] ==> value-parameter o: Any defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderStrong[ValueParameterDescriptorImpl]

'RED_TEMPLATE' @ [40:35] ==> private val RED_TEMPLATE: String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[PropertyDescriptorImpl]

'format' @ [40:48] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'o' @ [40:55] ==> value-parameter o: Any defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderError[ValueParameterDescriptorImpl]

'if (error) RED_TEMPLATE else STRONG_TEMPLATE' @ [42:53] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'error' @ [42:57] ==> value-parameter error: Boolean defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderStrong[ValueParameterDescriptorImpl]

'RED_TEMPLATE' @ [42:64] ==> private val RED_TEMPLATE: String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[PropertyDescriptorImpl]

'STRONG_TEMPLATE' @ [42:82] ==> private val STRONG_TEMPLATE: String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[PropertyDescriptorImpl]

'format' @ [42:99] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'o' @ [42:106] ==> value-parameter o: Any defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderStrong[ValueParameterDescriptorImpl]

'DescriptorRenderer' @ [44:67] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'withOptions' @ [44:86] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedSimpleFunctionDescriptor]

'uninferredTypeParameterAsName' @ [45:5] ==> public abstract var uninferredTypeParameterAsName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'modifiers' @ [46:5] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [46:17] ==> public fun <T> emptySet(): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'classifierNamePolicy' @ [47:5] ==> public abstract var classifierNamePolicy: ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'SHORT' @ [47:49] ==> public object SHORT : ClassifierNamePolicy defined in org.jetbrains.kotlin.renderer.ClassifierNamePolicy[FakeCallableDescriptorForObject]

'textFormat' @ [48:5] ==> public abstract var textFormat: RenderingFormat defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'HTML' @ [48:34] ==> enum entry HTML defined in org.jetbrains.kotlin.renderer.RenderingFormat[FakeCallableDescriptorForObject]

'SmartTypeRenderer' @ [52:24] ==> public constructor SmartTypeRenderer(baseRenderer: DescriptorRenderer) defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[DeserializedClassConstructorDescriptor]

'HTML_FOR_UNINFERRED_TYPE_PARAMS' @ [52:42] ==> private val HTML_FOR_UNINFERRED_TYPE_PARAMS: DescriptorRenderer defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[PropertyDescriptorImpl]

'HTML_FOR_UNINFERRED_TYPE_PARAMS' @ [53:30] ==> private val HTML_FOR_UNINFERRED_TYPE_PARAMS: DescriptorRenderer defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[PropertyDescriptorImpl]

'asRenderer' @ [53:62] ==> public fun DescriptorRenderer.asRenderer(): SmartDescriptorRenderer defined in org.jetbrains.kotlin.diagnostics.rendering[DeserializedSimpleFunctionDescriptor]

'StringBuilder' @ [54:25] ==> public final fun <init>(p0: (String..String?)): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'stringBuilder' @ [57:43] ==> val stringBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'append' @ [57:57] ==> public open fun append(p0: (Any..Any?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'any' @ [57:64] ==> value-parameter any: Any defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.append[ValueParameterDescriptorImpl]

'parameter' @ [60:33] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.renderParameter[ValueParameterDescriptorImpl]

'varargElementType' @ [60:43] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'varargElementType' @ [61:29] ==> val varargElementType: KotlinType? defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.renderParameter[LocalVariableDescriptor]

'parameter' @ [61:50] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.renderParameter[ValueParameterDescriptorImpl]

'type' @ [61:60] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'+' @ [63:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (varargElementType != null) "<b>vararg</b> " else ""' @ [63:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'varargElementType' @ [63:22] ==> val varargElementType: KotlinType? defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.renderParameter[LocalVariableDescriptor]

'typeRenderer' @ [64:17] ==> val typeRenderer: SmartTypeRenderer defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'render' @ [64:30] ==> public open fun render(obj: KotlinType, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[DeserializedSimpleFunctionDescriptor]

'parameterType' @ [64:37] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.renderParameter[LocalVariableDescriptor]

'context' @ [64:52] ==> value-parameter context: RenderingContext defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'if (parameter.hasDefaultValue()) " = ..." else ""' @ [65:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'parameter' @ [65:21] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.renderParameter[ValueParameterDescriptorImpl]

'hasDefaultValue' @ [65:31] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [66:13] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'hasTypeMismatchErrorOnParameter' @ [66:26] ==> public fun <D : CallableDescriptor> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.hasTypeMismatchErrorOnParameter(parameter: ValueParameterDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'parameter' @ [66:58] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.renderParameter[ValueParameterDescriptorImpl]

'renderError' @ [67:20] ==> public fun renderError(o: Any): String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[SimpleFunctionDescriptorImpl]

'renderedParameter' @ [67:32] ==> val renderedParameter: String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.renderParameter[LocalVariableDescriptor]

'renderedParameter' @ [69:16] ==> val renderedParameter: String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.renderParameter[LocalVariableDescriptor]

'resolvedCall' @ [73:40] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'typeArguments' @ [73:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'parametersToArgumentsMap' @ [75:32] ==> val parametersToArgumentsMap: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution[LocalVariableDescriptor]

'this' @ [75:57] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution.isInferred[ReceiverParameterDescriptorImpl]

'typeArgument' @ [76:17] ==> val typeArgument: KotlinType? defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution.isInferred[LocalVariableDescriptor]

'!' @ [77:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUninferredParameter' @ [77:32] ==> public open fun isUninferredParameter(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'typeArgument' @ [77:54] ==> val typeArgument: KotlinType? defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution.isInferred[LocalVariableDescriptor]

'resolvedCall' @ [80:30] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [80:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'typeParameters' @ [80:63] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'component1' @ [81:14] ==> public final operator fun component1(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [81:38] ==> public final operator fun component2(): List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'typeParameters' @ [81:67] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution[LocalVariableDescriptor]

'partition' @ [81:82] ==> public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.partition(predicate: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Boolean): Pair<List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, List<(TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'append' @ [83:9] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'indent' @ [83:23] ==> val indent: String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'!' @ [84:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'notInferredTypeParameters' @ [84:14] ==> val notInferredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution[LocalVariableDescriptor]

'isEmpty' @ [84:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'append' @ [85:13] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'notInferredTypeParameters' @ [85:20] ==> val notInferredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution[LocalVariableDescriptor]

'joinToString' @ [85:46] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((TypeParameterDescriptor..TypeParameterDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'renderError' @ [85:78] ==> public fun renderError(o: Any): String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[SimpleFunctionDescriptorImpl]

'typeParameter' @ [85:90] ==> value-parameter typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [85:104] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'append' @ [86:13] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'!' @ [87:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inferredTypeParameters' @ [87:18] ==> val inferredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution[LocalVariableDescriptor]

'isEmpty' @ [87:41] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'append' @ [88:17] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [92:46] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'typeArguments' @ [92:59] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'!' @ [93:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inferredTypeParameters' @ [93:14] ==> val inferredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution[LocalVariableDescriptor]

'isEmpty' @ [93:37] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'append' @ [94:13] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'inferredTypeParameters' @ [94:20] ==> val inferredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution[LocalVariableDescriptor]

'joinToString' @ [94:43] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((TypeParameterDescriptor..TypeParameterDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'typeParameter' @ [95:20] ==> value-parameter typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [95:34] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'typeRenderer' @ [95:44] ==> val typeRenderer: SmartTypeRenderer defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'render' @ [95:57] ==> public open fun render(obj: KotlinType, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[DeserializedSimpleFunctionDescriptor]

'typeParameterToTypeArgumentMap' @ [95:64] ==> val typeParameterToTypeArgumentMap: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution[LocalVariableDescriptor]

'typeParameter' @ [95:95] ==> value-parameter typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall.appendTypeParametersSubstitution.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [95:113] ==> value-parameter context: RenderingContext defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'resolvedCall' @ [100:31] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [100:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resultingDescriptor' @ [101:29] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'extensionReceiverParameter' @ [101:49] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'receiverParameter' @ [102:9] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'append' @ [103:9] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'typeRenderer' @ [103:16] ==> val typeRenderer: SmartTypeRenderer defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'render' @ [103:29] ==> public open fun render(obj: KotlinType, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartTypeRenderer[DeserializedSimpleFunctionDescriptor]

'receiverParameter' @ [103:36] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'type' @ [103:54] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'context' @ [103:60] ==> value-parameter context: RenderingContext defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'append' @ [103:70] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [105:5] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'htmlEscaper' @ [105:25] ==> public open fun htmlEscaper(): (Escaper..Escaper?) defined in com.google.common.html.HtmlEscapers[JavaMethodDescriptor]

'escape' @ [105:39] ==> public abstract fun escape(p0: (String..String?)): (String..String?) defined in com.google.common.escape.Escaper[JavaMethodDescriptor]

'resultingDescriptor' @ [105:46] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'name' @ [105:66] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [105:71] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'append' @ [105:84] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [106:5] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'resultingDescriptor' @ [106:12] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'valueParameters' @ [106:32] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'joinToString' @ [106:48] ==> public fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((ValueParameterDescriptor..ValueParameterDescriptor?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'append' @ [107:5] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'if (resolvedCall.hasUnmappedArguments()) renderError(")") else ")"' @ [107:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'resolvedCall' @ [107:16] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'hasUnmappedArguments' @ [107:29] ==> public fun <D : CallableDescriptor> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.hasUnmappedArguments(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'renderError' @ [107:53] ==> public fun renderError(o: Any): String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil in file renderersUtil.kt[SimpleFunctionDescriptorImpl]

'if (!resolvedCall.candidateDescriptor.typeParameters.isEmpty()) {
        appendTypeParametersSubstitution()
        append("<i> for </i><br/>$indent")
        // candidate descriptor is not in context of the rest of the message
        append(descriptorRenderer.render(resolvedCall.candidateDescriptor, RenderingContext.of(resolvedCall.candidateDescriptor)))
    }
    else {
        append(" <i>defined in</i> ")
        val containingDeclaration = resultingDescriptor.containingDeclaration
        val fqName = DescriptorUtils.getFqName(containingDeclaration)
        append(if (fqName.isRoot) "root package" else fqName.asString())
    }' @ [109:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: StringBuilder /* = StringBuilder */, elseBranch: StringBuilder /* = StringBuilder */): StringBuilder /* = StringBuilder */[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> StringBuilder

'!' @ [109:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [109:10] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [109:23] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'typeParameters' @ [109:43] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [109:58] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'appendTypeParametersSubstitution' @ [110:9] ==> local final fun appendTypeParametersSubstitution(): Unit defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'append' @ [111:9] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'indent' @ [111:35] ==> val indent: String defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'append' @ [113:9] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'descriptorRenderer' @ [113:16] ==> val descriptorRenderer: SmartDescriptorRenderer defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'render' @ [113:35] ==> public open fun render(obj: DeclarationDescriptor, renderingContext: RenderingContext): String defined in org.jetbrains.kotlin.diagnostics.rendering.SmartDescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [113:42] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [113:55] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'RenderingContext' @ [113:76] ==> public companion object defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext[FakeCallableDescriptorForObject]

'of' @ [113:93] ==> @JvmStatic public final fun of(vararg objectsToRender: Any?): RenderingContext defined in org.jetbrains.kotlin.diagnostics.rendering.RenderingContext.Companion[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [113:96] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [113:109] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'append' @ [116:9] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'resultingDescriptor' @ [117:37] ==> val resultingDescriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'containingDeclaration' @ [117:57] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'getFqName' @ [118:38] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'containingDeclaration' @ [118:48] ==> val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'append' @ [119:9] ==> local final fun append(any: Any): StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[SimpleFunctionDescriptorImpl]

'if (fqName.isRoot) "root package" else fqName.asString()' @ [119:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'fqName' @ [119:20] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'isRoot' @ [119:27] ==> public final val FqNameUnsafe.isRoot: Boolean[MyPropertyDescriptor]

'fqName' @ [119:55] ==> val fqName: FqNameUnsafe defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'asString' @ [119:62] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'stringBuilder' @ [121:12] ==> val stringBuilder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.highlighter.renderersUtil.renderResolvedCall[LocalVariableDescriptor]

'toString' @ [121:26] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

