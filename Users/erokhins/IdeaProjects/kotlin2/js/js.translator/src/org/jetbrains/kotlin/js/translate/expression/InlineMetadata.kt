'JvmStatic' @ [28:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JsStringLiteral' @ [30:23] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'getFunctionTag' @ [30:45] ==> @NotNull public open fun getFunctionTag(@NotNull functionDescriptor: CallableDescriptor, @NotNull config: JsConfig): String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'descriptor' @ [30:60] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.compose[ValueParameterDescriptorImpl]

'config' @ [30:72] ==> value-parameter config: JsConfig defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.compose[ValueParameterDescriptorImpl]

'InlineMetadata' @ [31:20] ==> public constructor InlineMetadata(tag: JsStringLiteral, function: JsFunction) defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[ClassConstructorDescriptorImpl]

'tag' @ [31:35] ==> val tag: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.compose[LocalVariableDescriptor]

'function' @ [31:40] ==> value-parameter function: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.compose[ValueParameterDescriptorImpl]

'JvmStatic' @ [34:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (expression) {
                    is JsInvocation -> decomposeCreateFunctionCall(expression)
                    else -> null
                }' @ [36:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: InlineMetadata?, entry1: InlineMetadata?): InlineMetadata?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> InlineMetadata?

'expression' @ [36:23] ==> value-parameter expression: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decompose[ValueParameterDescriptorImpl]

'decomposeCreateFunctionCall' @ [37:40] ==> private final fun decomposeCreateFunctionCall(call: JsInvocation): InlineMetadata? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [37:68] ==> value-parameter expression: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decompose[ValueParameterDescriptorImpl]

'call' @ [42:29] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[ValueParameterDescriptorImpl]

'qualifier' @ [42:34] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'qualifier' @ [43:17] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[LocalVariableDescriptor]

'qualifier' @ [43:44] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[LocalVariableDescriptor]

'ident' @ [43:54] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'DEFINE_INLINE_FUNCTION' @ [43:69] ==> public const final val DEFINE_INLINE_FUNCTION: String defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaPropertyDescriptor]

'call' @ [45:29] ==> value-parameter call: JsInvocation defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[ValueParameterDescriptorImpl]

'arguments' @ [45:34] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'arguments' @ [46:17] ==> val arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>) defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[LocalVariableDescriptor]

'size' @ [46:27] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'METADATA_PROPERTIES_COUNT' @ [46:35] ==> private val METADATA_PROPERTIES_COUNT: Int defined in org.jetbrains.kotlin.js.translate.expression in file InlineMetadata.kt[PropertyDescriptorImpl]

'arguments' @ [48:23] ==> val arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>) defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[LocalVariableDescriptor]

'arguments' @ [49:28] ==> val arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>) defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[LocalVariableDescriptor]

'tag' @ [50:17] ==> val tag: JsStringLiteral? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[LocalVariableDescriptor]

'function' @ [50:32] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[LocalVariableDescriptor]

'InlineMetadata' @ [52:20] ==> public constructor InlineMetadata(tag: JsStringLiteral, function: JsFunction) defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[ClassConstructorDescriptorImpl]

'tag' @ [52:35] ==> val tag: JsStringLiteral? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[LocalVariableDescriptor]

'function' @ [52:40] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion.decomposeCreateFunctionCall[LocalVariableDescriptor]

'listOf' @ [58:34] ==> public fun <T> listOf(vararg elements: JsLiteral): List<JsLiteral> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsLiteral

'tag' @ [58:41] ==> public final val tag: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[PropertyDescriptorImpl]

'function' @ [58:46] ==> public final val function: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[PropertyDescriptorImpl]

'JsInvocation' @ [59:20] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'createInlineFunction' @ [59:39] ==> @NotNull public open fun createInlineFunction(): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'propertiesList' @ [59:63] ==> val propertiesList: List<JsLiteral> defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.<get-functionWithMetadata>[LocalVariableDescriptor]

