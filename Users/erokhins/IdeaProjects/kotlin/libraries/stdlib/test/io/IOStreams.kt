'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'Test' @ [10:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTempFile' @ [11:23] ==> public fun createTempFile(prefix: String = ..., suffix: String? = ..., directory: File? = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'writer' @ [14:13] ==> var writer: Writer? defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'tmpFile' @ [14:22] ==> val tmpFile: File defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'outputStream' @ [14:30] ==> @InlineOnly public inline fun File.outputStream(): FileOutputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'writer' @ [14:45] ==> @InlineOnly public inline fun OutputStream.writer(charset: Charset = ...): OutputStreamWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'writer' @ [15:13] ==> var writer: Writer? defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'write' @ [15:20] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.Writer[JavaMethodDescriptor]

'writer' @ [17:13] ==> var writer: Writer? defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'close' @ [17:21] ==> public abstract fun close(): Unit defined in java.io.Writer[JavaMethodDescriptor]

'reader' @ [22:13] ==> var reader: BufferedReader? defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'tmpFile' @ [22:22] ==> val tmpFile: File defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'inputStream' @ [22:30] ==> @InlineOnly public inline fun File.inputStream(): FileInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'reader' @ [22:44] ==> @InlineOnly public inline fun InputStream.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'buffered' @ [22:53] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'act' @ [23:13] ==> val act: String? defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'reader' @ [23:19] ==> var reader: BufferedReader? defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'readLine' @ [23:26] ==> public open fun readLine(): (String..String?) defined in java.io.BufferedReader[JavaMethodDescriptor]

'reader' @ [25:13] ==> var reader: BufferedReader? defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'close' @ [25:21] ==> public open fun close(): Unit defined in java.io.BufferedReader[JavaMethodDescriptor]

'assertEquals' @ [27:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String?, actual: String?, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String?

'act' @ [27:39] ==> val act: String? defined in test.io.IOStreamsTest.testGetStreamOfFile[LocalVariableDescriptor]

'Test' @ [30:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ByteArray' @ [31:17] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'it' @ [31:33] ==> value-parameter it: Int defined in test.io.IOStreamsTest.testInputStreamIterator.<anonymous>[ValueParameterDescriptorImpl]

'toByte' @ [31:36] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'mutableListOf' @ [33:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Byte> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Byte

'x' @ [35:9] ==> val x: ByteArray defined in test.io.IOStreamsTest.testInputStreamIterator[LocalVariableDescriptor]

'inputStream' @ [35:11] ==> @InlineOnly public inline fun ByteArray.inputStream(): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'buffered' @ [35:25] ==> @InlineOnly public inline fun InputStream.buffered(bufferSize: Int = ...): BufferedInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [35:36] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedInputStream.use(block: (BufferedInputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedInputStream
    <R> -> Unit

'stream' @ [36:22] ==> value-parameter stream: BufferedInputStream defined in test.io.IOStreamsTest.testInputStreamIterator.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [37:17] ==> val result: MutableList<Byte> defined in test.io.IOStreamsTest.testInputStreamIterator[LocalVariableDescriptor]

'b' @ [37:27] ==> val b: Byte defined in test.io.IOStreamsTest.testInputStreamIterator.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [41:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<Byte>, actual: List<Byte>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<Byte>

'x' @ [41:22] ==> val x: ByteArray defined in test.io.IOStreamsTest.testInputStreamIterator[LocalVariableDescriptor]

'asList' @ [41:24] ==> public fun ByteArray.asList(): List<Byte> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'result' @ [41:34] ==> val result: MutableList<Byte> defined in test.io.IOStreamsTest.testInputStreamIterator[LocalVariableDescriptor]

