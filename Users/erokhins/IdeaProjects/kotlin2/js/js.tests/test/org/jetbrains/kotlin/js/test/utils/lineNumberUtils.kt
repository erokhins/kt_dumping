'TextOutputImpl' @ [23:18] ==> public constructor TextOutputImpl() defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaClassConstructorDescriptor]

'LineCollector' @ [24:25] ==> public constructor LineCollector() defined in org.jetbrains.kotlin.js.test.utils.LineCollector[ClassConstructorDescriptorImpl]

'also' @ [24:41] ==> @InlineOnly @SinceKotlin public inline fun <T> LineCollector.also(block: (LineCollector) -> Unit): LineCollector defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LineCollector

'it' @ [24:48] ==> value-parameter it: LineCollector defined in org.jetbrains.kotlin.js.test.utils.toStringWithLineNumbers.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [24:51] ==> public open fun <T : JsNode?> accept(node: JsProgram): Unit defined in org.jetbrains.kotlin.js.test.utils.LineCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsProgram

'this' @ [24:58] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.toStringWithLineNumbers[ReceiverParameterDescriptorImpl]

'LineOutputToStringVisitor' @ [25:5] ==> public constructor LineOutputToStringVisitor(output: TextOutput, lineCollector: LineCollector) defined in org.jetbrains.kotlin.js.test.utils.LineOutputToStringVisitor[ClassConstructorDescriptorImpl]

'output' @ [25:31] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.test.utils.toStringWithLineNumbers[LocalVariableDescriptor]

'lineCollector' @ [25:39] ==> val lineCollector: LineCollector defined in org.jetbrains.kotlin.js.test.utils.toStringWithLineNumbers[LocalVariableDescriptor]

'accept' @ [25:54] ==> public open fun <T : JsNode?> accept(node: (JsGlobalBlock..JsGlobalBlock?)): Unit defined in org.jetbrains.kotlin.js.test.utils.LineOutputToStringVisitor[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsGlobalBlock..org.jetbrains.kotlin.js.backend.ast.JsGlobalBlock?)

'this' @ [25:61] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.toStringWithLineNumbers[ReceiverParameterDescriptorImpl]

'globalBlock' @ [25:66] ==> public final val JsProgram.globalBlock: (JsGlobalBlock..JsGlobalBlock?)[MyPropertyDescriptor]

'output' @ [26:12] ==> val output: TextOutputImpl defined in org.jetbrains.kotlin.js.test.utils.toStringWithLineNumbers[LocalVariableDescriptor]

'toString' @ [26:19] ==> public open fun toString(): String defined in org.jetbrains.kotlin.js.util.TextOutputImpl[JavaMethodDescriptor]

