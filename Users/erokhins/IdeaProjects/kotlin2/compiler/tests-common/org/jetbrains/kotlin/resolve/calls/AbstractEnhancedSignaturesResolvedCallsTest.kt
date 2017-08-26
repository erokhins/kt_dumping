'AbstractResolvedCallsTest' @ [24:62] ==> public constructor AbstractResolvedCallsTest() defined in org.jetbrains.kotlin.resolve.calls.AbstractResolvedCallsTest[ClassConstructorDescriptorImpl]

'createEnvironmentWithJdk' @ [26:63] ==> @NotNull protected/*protected and package*/ open fun createEnvironmentWithJdk(@NotNull configurationKind: ConfigurationKind, @NotNull jdkKind: TestJdkKind): KotlinCoreEnvironment defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest[JavaMethodDescriptor]

'ALL' @ [26:106] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [26:123] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'text' @ [29:21] ==> value-parameter text: String defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput[ValueParameterDescriptorImpl]

'lines' @ [29:26] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'run' @ [30:27] ==> @InlineOnly public inline fun <T, R> AbstractEnhancedSignaturesResolvedCallsTest.run(block: AbstractEnhancedSignaturesResolvedCallsTest.() -> List<Int>): List<Int> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractEnhancedSignaturesResolvedCallsTest
    <R> -> List<Int>

'lines' @ [32:13] ==> val lines: List<String> defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput[LocalVariableDescriptor]

'map' @ [32:19] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Int

'offset' @ [32:25] ==> var offset: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>[LocalVariableDescriptor]

'apply' @ [32:32] ==> @InlineOnly public inline fun <T> Int.apply(block: Int.() -> Unit): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'offset' @ [32:40] ==> var offset: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>[LocalVariableDescriptor]

'it' @ [32:50] ==> value-parameter it: String defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'length' @ [32:53] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'lineOffsets' @ [35:17] ==> val lineOffsets: List<Int> defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput[LocalVariableDescriptor]

'binarySearch' @ [35:29] ==> public fun <T : Comparable<Int>> List<Int?>.binarySearch(element: Int?, fromIndex: Int = ..., toIndex: Int = ...): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'caret' @ [35:42] ==> value-parameter caret: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.lineIndexAt[ValueParameterDescriptorImpl]

'let' @ [35:49] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Int): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Int

'if (result < 0) result.inv() - 1 else result' @ [36:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'result' @ [36:25] ==> value-parameter result: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.lineIndexAt.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [36:37] ==> value-parameter result: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.lineIndexAt.<anonymous>[ValueParameterDescriptorImpl]

'inv' @ [36:44] ==> public final fun inv(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'result' @ [36:59] ==> value-parameter result: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.lineIndexAt.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCallsAt' @ [39:27] ==> value-parameter resolvedCallsAt: List<Pair<Int, ResolvedCall<*>?>> defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput[ValueParameterDescriptorImpl]

'groupBy' @ [39:43] ==> public inline fun <T, K, V> Iterable<Pair<Int, ResolvedCall<*>?>>.groupBy(keySelector: (Pair<Int, ResolvedCall<*>?>) -> Int, valueTransform: (Pair<Int, ResolvedCall<*>?>) -> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?): Map<Int, List<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Int, ResolvedCall<*>?>
    <K> -> Int
    <V> -> ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?

'component1' @ [39:55] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'lineIndexAt' @ [39:65] ==> local final fun lineIndexAt(caret: Int): Int defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput[SimpleFunctionDescriptorImpl]

'caret' @ [39:77] ==> val caret: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>[LocalVariableDescriptor]

'component1' @ [39:90] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [39:93] ==> public final operator fun component2(): ResolvedCall<*>? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [39:110] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>[LocalVariableDescriptor]

'buildString' @ [41:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'lines' @ [42:13] ==> val lines: List<String> defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput[LocalVariableDescriptor]

'forEachIndexed' @ [42:19] ==> public inline fun <T> Iterable<String>.forEachIndexed(action: (index: Int, String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'appendln' @ [43:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'line' @ [43:26] ==> value-parameter line: String defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'callsByLine' @ [44:17] ==> val callsByLine: Map<Int, List<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?>> defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput[LocalVariableDescriptor]

'lineIndex' @ [44:29] ==> value-parameter lineIndex: Int defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [44:41] ==> @InlineOnly public inline fun <T, R> List<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?>.let(block: (List<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?>
    <R> -> Unit

'line' @ [45:34] ==> value-parameter line: String defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'takeWhile' @ [45:39] ==> public inline fun String.takeWhile(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Char' @ [45:49] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'calls' @ [46:21] ==> value-parameter calls: List<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?> defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [46:27] ==> @HidesMembers public inline fun <T> Iterable<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?>.forEach(action: (ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>?) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>?

'appendln' @ [47:25] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indent' @ [47:36] ==> val indent: String defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [47:47] ==> value-parameter resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>? defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'status' @ [47:61] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'appendln' @ [48:25] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indent' @ [48:36] ==> val indent: String defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [48:60] ==> value-parameter resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>? defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'run' @ [48:74] ==> @InlineOnly public inline fun <T, R> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.run(block: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>
    <R> -> String

'resultingDescriptor' @ [48:80] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'original' @ [48:102] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'getText' @ [48:111] ==> internal fun DeclarationDescriptor.getText(): String defined in org.jetbrains.kotlin.resolve.calls in file AbstractResolvedCallsTest.kt[SimpleFunctionDescriptorImpl]

'appendln' @ [49:25] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indent' @ [49:36] ==> val indent: String defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [49:60] ==> value-parameter resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>? defined in org.jetbrains.kotlin.resolve.calls.AbstractEnhancedSignaturesResolvedCallsTest.renderOutput.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'run' @ [49:74] ==> @InlineOnly public inline fun <T, R> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.run(block: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.() -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>
    <R> -> String

'resultingDescriptor' @ [49:80] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getText' @ [49:102] ==> internal fun DeclarationDescriptor.getText(): String defined in org.jetbrains.kotlin.resolve.calls in file AbstractResolvedCallsTest.kt[SimpleFunctionDescriptorImpl]

