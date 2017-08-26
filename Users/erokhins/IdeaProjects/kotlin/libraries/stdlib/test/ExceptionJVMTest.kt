'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Test' @ [14:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertPrintStackTrace' @ [15:9] ==> public final fun assertPrintStackTrace(t: Throwable): Unit defined in test.exceptions.ExceptionJVMTest[SimpleFunctionDescriptorImpl]

'RuntimeException' @ [15:31] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'assertPrintStackTraceStream' @ [16:9] ==> public final fun assertPrintStackTraceStream(t: Throwable): Unit defined in test.exceptions.ExceptionJVMTest[SimpleFunctionDescriptorImpl]

'RuntimeException' @ [16:37] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'Test' @ [19:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertPrintStackTrace' @ [20:9] ==> public final fun assertPrintStackTrace(t: Throwable): Unit defined in test.exceptions.ExceptionJVMTest[SimpleFunctionDescriptorImpl]

'Error' @ [20:31] ==> public final fun <init>(p0: (String..String?)): Error /* = Error */ defined in kotlin.Error[TypeAliasConstructorDescriptorImpl]

'assertPrintStackTraceStream' @ [21:9] ==> public final fun assertPrintStackTraceStream(t: Throwable): Unit defined in test.exceptions.ExceptionJVMTest[SimpleFunctionDescriptorImpl]

'Error' @ [21:37] ==> public final fun <init>(p0: (String..String?)): Error /* = Error */ defined in kotlin.Error[TypeAliasConstructorDescriptorImpl]

'StringWriter' @ [26:22] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'PrintWriter' @ [27:22] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'buffer' @ [27:34] ==> val buffer: StringWriter defined in test.exceptions.ExceptionJVMTest.assertPrintStackTrace[LocalVariableDescriptor]

't' @ [28:9] ==> value-parameter t: Throwable defined in test.exceptions.ExceptionJVMTest.assertPrintStackTrace[ValueParameterDescriptorImpl]

'printStackTrace' @ [28:11] ==> public open fun printStackTrace(p0: (PrintWriter..PrintWriter?)): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'writer' @ [28:27] ==> val writer: PrintWriter defined in test.exceptions.ExceptionJVMTest.assertPrintStackTrace[LocalVariableDescriptor]

'comparePrintedThrowableResult' @ [29:9] ==> private final fun comparePrintedThrowableResult(throwable: Throwable, printedThrowable: CharSequence): Unit defined in test.exceptions.ExceptionJVMTest[SimpleFunctionDescriptorImpl]

't' @ [29:39] ==> value-parameter t: Throwable defined in test.exceptions.ExceptionJVMTest.assertPrintStackTrace[ValueParameterDescriptorImpl]

'buffer' @ [29:42] ==> val buffer: StringWriter defined in test.exceptions.ExceptionJVMTest.assertPrintStackTrace[LocalVariableDescriptor]

'buffer' @ [29:49] ==> public final val StringWriter.buffer: (StringBuffer..StringBuffer?)[MyPropertyDescriptor]

'ByteArrayOutputStream' @ [33:26] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'PrintStream' @ [35:9] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'byteBuffer' @ [35:21] ==> val byteBuffer: ByteArrayOutputStream defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[LocalVariableDescriptor]

'use' @ [35:33] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintStream.use(block: (PrintStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintStream
    <R> -> Unit

't' @ [36:13] ==> value-parameter t: Throwable defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[ValueParameterDescriptorImpl]

'printStackTrace' @ [36:15] ==> public open fun printStackTrace(p0: (PrintStream..PrintStream?)): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'it' @ [36:31] ==> value-parameter it: PrintStream defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream.<anonymous>[ValueParameterDescriptorImpl]

'PrintStream' @ [39:22] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'byteBuffer' @ [39:34] ==> val byteBuffer: ByteArrayOutputStream defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[LocalVariableDescriptor]

'stream' @ [40:9] ==> val stream: PrintStream defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[LocalVariableDescriptor]

'use' @ [40:16] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintStream.use(block: (PrintStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintStream
    <R> -> Unit

't' @ [41:13] ==> value-parameter t: Throwable defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[ValueParameterDescriptorImpl]

'printStackTrace' @ [41:15] ==> public open fun printStackTrace(p0: (PrintStream..PrintStream?)): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'stream' @ [41:31] ==> val stream: PrintStream defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[LocalVariableDescriptor]

'assertNotNull' @ [44:21] ==> public fun <T : Any> assertNotNull(actual: ByteArray?, message: String? = ...): ByteArray defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ByteArray

'byteBuffer' @ [44:35] ==> val byteBuffer: ByteArrayOutputStream defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[LocalVariableDescriptor]

'toByteArray' @ [44:46] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'bytes' @ [45:23] ==> val bytes: ByteArray defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[LocalVariableDescriptor]

'toString' @ [45:29] ==> @InlineOnly public inline fun ByteArray.toString(charset: Charset): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'defaultCharset' @ [45:46] ==> public open fun defaultCharset(): (Charset..Charset?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'comparePrintedThrowableResult' @ [46:9] ==> private final fun comparePrintedThrowableResult(throwable: Throwable, printedThrowable: CharSequence): Unit defined in test.exceptions.ExceptionJVMTest[SimpleFunctionDescriptorImpl]

't' @ [46:39] ==> value-parameter t: Throwable defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[ValueParameterDescriptorImpl]

'content' @ [46:42] ==> val content: String defined in test.exceptions.ExceptionJVMTest.assertPrintStackTraceStream[LocalVariableDescriptor]

'throwable' @ [50:26] ==> value-parameter throwable: Throwable defined in test.exceptions.ExceptionJVMTest.comparePrintedThrowableResult[ValueParameterDescriptorImpl]

'stackTrace' @ [50:36] ==> public final var Throwable.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'printedThrowable' @ [51:21] ==> value-parameter printedThrowable: CharSequence defined in test.exceptions.ExceptionJVMTest.comparePrintedThrowableResult[ValueParameterDescriptorImpl]

'lines' @ [51:38] ==> public fun CharSequence.lines(): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [52:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'throwable' @ [52:22] ==> value-parameter throwable: Throwable defined in test.exceptions.ExceptionJVMTest.comparePrintedThrowableResult[ValueParameterDescriptorImpl]

'toString' @ [52:32] ==> public open fun toString(): String defined in kotlin.Throwable[DeserializedSimpleFunctionDescriptor]

'lines' @ [52:44] ==> val lines: List<String> defined in test.exceptions.ExceptionJVMTest.comparePrintedThrowableResult[LocalVariableDescriptor]

'stackTrace' @ [53:9] ==> val stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in test.exceptions.ExceptionJVMTest.comparePrintedThrowableResult[LocalVariableDescriptor]

'forEachIndexed' @ [53:20] ==> public inline fun <T> Array<out (StackTraceElement..StackTraceElement?)>.forEachIndexed(action: (index: Int, (StackTraceElement..StackTraceElement?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.StackTraceElement..java.lang.StackTraceElement?)

'assertTrue' @ [54:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'lines' @ [54:24] ==> val lines: List<String> defined in test.exceptions.ExceptionJVMTest.comparePrintedThrowableResult[LocalVariableDescriptor]

'any' @ [54:30] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'frame' @ [54:36] ==> value-parameter frame: (StackTraceElement..StackTraceElement?) defined in test.exceptions.ExceptionJVMTest.comparePrintedThrowableResult.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [54:42] ==> public open fun toString(): String defined in java.lang.StackTraceElement[JavaMethodDescriptor]

'it' @ [54:56] ==> value-parameter it: String defined in test.exceptions.ExceptionJVMTest.comparePrintedThrowableResult.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [54:79] ==> value-parameter index: Int defined in test.exceptions.ExceptionJVMTest.comparePrintedThrowableResult.<anonymous>[ValueParameterDescriptorImpl]

'Test' @ [58:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'RuntimeException' @ [59:25] ==> public final fun <init>(p0: (String..String?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'exception' @ [60:26] ==> val exception: RuntimeException /* = RuntimeException */ defined in test.exceptions.ExceptionJVMTest.changeStackTrace[LocalVariableDescriptor]

'stackTrace' @ [60:36] ==> public final var RuntimeException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'stackTrace' @ [61:9] ==> var stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in test.exceptions.ExceptionJVMTest.changeStackTrace[LocalVariableDescriptor]

'stackTrace' @ [61:22] ==> var stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in test.exceptions.ExceptionJVMTest.changeStackTrace[LocalVariableDescriptor]

'dropLast' @ [61:33] ==> public fun <T> Array<out (StackTraceElement..StackTraceElement?)>.dropLast(n: Int): List<(StackTraceElement..StackTraceElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.StackTraceElement..java.lang.StackTraceElement?)

'toTypedArray' @ [61:45] ==> public inline fun <reified T> Collection<(StackTraceElement..StackTraceElement?)>.toTypedArray(): Array<(StackTraceElement..StackTraceElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.lang.StackTraceElement..java.lang.StackTraceElement?)

'exception' @ [62:9] ==> val exception: RuntimeException /* = RuntimeException */ defined in test.exceptions.ExceptionJVMTest.changeStackTrace[LocalVariableDescriptor]

'stackTrace' @ [62:19] ==> public final var RuntimeException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'stackTrace' @ [62:32] ==> var stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in test.exceptions.ExceptionJVMTest.changeStackTrace[LocalVariableDescriptor]

'assertArrayNotSameButEquals' @ [63:9] ==> public fun <T> assertArrayNotSameButEquals(expected: Array<out (StackTraceElement..StackTraceElement?)>, actual: Array<out (StackTraceElement..StackTraceElement?)>, message: String = ...): Unit defined in test.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (java.lang.StackTraceElement..java.lang.StackTraceElement?)

'stackTrace' @ [63:37] ==> var stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?) defined in test.exceptions.ExceptionJVMTest.changeStackTrace[LocalVariableDescriptor]

'exception' @ [63:49] ==> val exception: RuntimeException /* = RuntimeException */ defined in test.exceptions.ExceptionJVMTest.changeStackTrace[LocalVariableDescriptor]

'stackTrace' @ [63:59] ==> public final var RuntimeException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

