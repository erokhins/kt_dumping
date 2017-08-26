'GutterIconRenderer' @ [23:75] ==> public constructor GutterIconRenderer() defined in com.intellij.openapi.editor.markup.GutterIconRenderer[JavaClassConstructorDescriptor]

'when (severity) {
        Severity.ERROR -> "Error:"
        Severity.WARNING -> "Warning:"
        Severity.INFO -> "Info:"
    }' @ [24:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'severity' @ [24:53] ==> value-parameter severity: Severity defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer.msgType[ValueParameterDescriptorImpl]

'ERROR' @ [25:18] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'WARNING' @ [26:18] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'INFO' @ [27:18] ==> enum entry INFO defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'messages' @ [31:28] ==> private final val messages: List<SeverityDetails> defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer[PropertyDescriptorImpl]

'map' @ [31:37] ==> public inline fun <T, R> Iterable<SeverityDetails>.map(transform: (SeverityDetails) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SeverityDetails
    <R> -> String

'msgType' @ [31:49] ==> private final fun msgType(severity: Severity): String defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer[SimpleFunctionDescriptorImpl]

'it' @ [31:57] ==> value-parameter it: SeverityDetails defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer.getTooltipText.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [31:60] ==> public final val severity: Severity defined in org.jetbrains.kotlin.console.SeverityDetails[PropertyDescriptorImpl]

'it' @ [31:77] ==> value-parameter it: SeverityDetails defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer.getTooltipText.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [31:80] ==> public final val description: String defined in org.jetbrains.kotlin.console.SeverityDetails[PropertyDescriptorImpl]

'htmlTooltips' @ [32:25] ==> val htmlTooltips: List<String> defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer.getTooltipText[LocalVariableDescriptor]

'joinToString' @ [32:38] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ReplIcons' @ [35:30] ==> public object ReplIcons defined in org.jetbrains.kotlin.console.gutter in file ReplIcons.kt[FakeCallableDescriptorForObject]

'COMPILER_ERROR' @ [35:40] ==> public final val COMPILER_ERROR: Icon defined in org.jetbrains.kotlin.console.gutter.ReplIcons[PropertyDescriptorImpl]

'identityHashCode' @ [36:38] ==> public open fun identityHashCode(p0: (Any..Any?)): Int defined in java.lang.System[JavaMethodDescriptor]

'this' @ [36:55] ==> <this> defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer[LazyClassReceiverParameterDescriptor]

'this' @ [37:40] ==> <this> defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer[LazyClassReceiverParameterDescriptor]

'other' @ [37:49] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.console.gutter.ConsoleErrorRenderer.equals[ValueParameterDescriptorImpl]

