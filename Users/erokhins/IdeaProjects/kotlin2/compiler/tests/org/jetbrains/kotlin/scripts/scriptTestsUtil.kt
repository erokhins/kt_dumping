'ByteArrayOutputStream' @ [39:21] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'out' @ [40:26] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'setOut' @ [41:12] ==> public open fun setOut(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'PrintStream' @ [41:19] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'outStream' @ [41:31] ==> val outStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.scripts.captureOut[LocalVariableDescriptor]

'invoke' @ [43:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'out' @ [46:16] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [46:20] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'setOut' @ [47:16] ==> public open fun setOut(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'prevOut' @ [47:23] ==> val prevOut: (PrintStream..PrintStream?) defined in org.jetbrains.kotlin.scripts.captureOut[LocalVariableDescriptor]

'outStream' @ [49:12] ==> val outStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.scripts.captureOut[LocalVariableDescriptor]

'toString' @ [49:22] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'split' @ [53:9] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [53:26] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'String' @ [53:30] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'filter' @ [53:44] ==> public inline fun <T> Iterable<String>.filter(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [53:51] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'assertEquals' @ [56:16] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'expected' @ [56:29] ==> value-parameter expected: String defined in org.jetbrains.kotlin.scripts.assertEqualsTrimmed[ValueParameterDescriptorImpl]

'linesSplitTrim' @ [56:38] ==> private fun String.linesSplitTrim(): List<String> defined in org.jetbrains.kotlin.scripts[SimpleFunctionDescriptorImpl]

'actual' @ [56:56] ==> value-parameter actual: String defined in org.jetbrains.kotlin.scripts.assertEqualsTrimmed[ValueParameterDescriptorImpl]

'linesSplitTrim' @ [56:63] ==> private fun String.linesSplitTrim(): List<String> defined in org.jetbrains.kotlin.scripts[SimpleFunctionDescriptorImpl]

