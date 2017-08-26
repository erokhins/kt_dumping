'JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'JvmMultifileClass' @ [2:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[DeserializedClassConstructorDescriptor]

'JvmName' @ [3:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'kotlin.internal.InlineOnly' @ [14:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Charsets' @ [15:50] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [15:59] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'inputStream' @ [15:87] ==> @InlineOnly public inline fun File.inputStream(): FileInputStream defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'reader' @ [15:101] ==> @InlineOnly public inline fun InputStream.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io in file IOStreams.kt[SimpleFunctionDescriptorImpl]

'charset' @ [15:108] ==> value-parameter charset: Charset = ... defined in kotlin.io.reader[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [22:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Charsets' @ [23:58] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [23:67] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'DEFAULT_BUFFER_SIZE' @ [23:92] ==> public const val DEFAULT_BUFFER_SIZE: Int defined in kotlin.io in file Constants.kt[PropertyDescriptorImpl]

'reader' @ [23:131] ==> @InlineOnly public inline fun File.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'charset' @ [23:138] ==> value-parameter charset: Charset = ... defined in kotlin.io.bufferedReader[ValueParameterDescriptorImpl]

'buffered' @ [23:147] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'bufferSize' @ [23:156] ==> value-parameter bufferSize: Int = ... defined in kotlin.io.bufferedReader[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [28:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Charsets' @ [29:50] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [29:59] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'outputStream' @ [29:88] ==> @InlineOnly public inline fun File.outputStream(): FileOutputStream defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'writer' @ [29:103] ==> @InlineOnly public inline fun OutputStream.writer(charset: Charset = ...): OutputStreamWriter defined in kotlin.io in file IOStreams.kt[SimpleFunctionDescriptorImpl]

'charset' @ [29:110] ==> value-parameter charset: Charset = ... defined in kotlin.io.writer[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [36:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Charsets' @ [37:58] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [37:67] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'DEFAULT_BUFFER_SIZE' @ [37:92] ==> public const val DEFAULT_BUFFER_SIZE: Int defined in kotlin.io in file Constants.kt[PropertyDescriptorImpl]

'writer' @ [37:131] ==> @InlineOnly public inline fun File.writer(charset: Charset = ...): OutputStreamWriter defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'charset' @ [37:138] ==> value-parameter charset: Charset = ... defined in kotlin.io.bufferedWriter[ValueParameterDescriptorImpl]

'buffered' @ [37:147] ==> @InlineOnly public inline fun Writer.buffered(bufferSize: Int = ...): BufferedWriter defined in kotlin.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'bufferSize' @ [37:156] ==> value-parameter bufferSize: Int = ... defined in kotlin.io.bufferedWriter[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [42:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Charsets' @ [43:55] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [43:64] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'PrintWriter' @ [43:86] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'bufferedWriter' @ [43:98] ==> @InlineOnly public inline fun File.bufferedWriter(charset: Charset = ..., bufferSize: Int = ...): BufferedWriter defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'charset' @ [43:113] ==> value-parameter charset: Charset = ... defined in kotlin.io.printWriter[ValueParameterDescriptorImpl]

'FileInputStream' @ [52:42] ==> public constructor FileInputStream(p0: (File..File?)) defined in java.io.FileInputStream[JavaClassConstructorDescriptor]

'this' @ [52:58] ==> <this> defined in kotlin.io.readBytes[ReceiverParameterDescriptorImpl]

'use' @ [52:64] ==> @InlineOnly public inline fun <T : Closeable?, R> FileInputStream.use(block: (FileInputStream) -> ByteArray): ByteArray defined in kotlin.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Closeable?> -> FileInputStream
    <R> -> ByteArray

'this' @ [54:21] ==> <this> defined in kotlin.io.readBytes[ReceiverParameterDescriptorImpl]

'length' @ [54:26] ==> public open fun length(): Long defined in java.io.File[JavaMethodDescriptor]

'let' @ [54:35] ==> @InlineOnly public inline fun <T, R> Long.let(block: (Long) -> Long): Long defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Long
    <R> -> Long

'if (it > Int.MAX_VALUE) throw OutOfMemoryError("File $this is too big ($it bytes) to fit in memory.") else it' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'it' @ [55:13] ==> value-parameter it: Long defined in kotlin.io.readBytes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'MAX_VALUE' @ [55:22] ==> public const final val MAX_VALUE: Int defined in kotlin.Int.Companion[DeserializedPropertyDescriptor]

'OutOfMemoryError' @ [55:39] ==> public constructor OutOfMemoryError(p0: (String..String?)) defined in java.lang.OutOfMemoryError[JavaClassConstructorDescriptor]

'this' @ [55:63] ==> <this> defined in kotlin.io.readBytes[ReceiverParameterDescriptorImpl]

'it' @ [55:81] ==> value-parameter it: Long defined in kotlin.io.readBytes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [55:116] ==> value-parameter it: Long defined in kotlin.io.readBytes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toInt' @ [56:7] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'ByteArray' @ [57:18] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'remaining' @ [57:28] ==> var remaining: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'remaining' @ [58:12] ==> var remaining: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'input' @ [59:20] ==> value-parameter input: FileInputStream defined in kotlin.io.readBytes.<anonymous>[ValueParameterDescriptorImpl]

'read' @ [59:26] ==> public open fun read(p0: (ByteArray..ByteArray?), p1: Int, p2: Int): Int defined in java.io.FileInputStream[JavaMethodDescriptor]

'result' @ [59:31] ==> val result: ByteArray defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'offset' @ [59:39] ==> var offset: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'remaining' @ [59:47] ==> var remaining: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'read' @ [60:13] ==> val read: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'remaining' @ [61:9] ==> var remaining: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'read' @ [61:22] ==> val read: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'offset' @ [62:9] ==> var offset: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'read' @ [62:19] ==> val read: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'if (remaining == 0) result else result.copyOf(offset)' @ [64:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ByteArray, elseBranch: ByteArray): ByteArray[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ByteArray

'remaining' @ [64:9] ==> var remaining: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'result' @ [64:25] ==> val result: ByteArray defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'result' @ [64:37] ==> val result: ByteArray defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'copyOf' @ [64:44] ==> @InlineOnly public inline fun ByteArray.copyOf(newSize: Int): ByteArray defined in kotlin.collections in file _Arrays.kt[SimpleFunctionDescriptorImpl]

'offset' @ [64:51] ==> var offset: Int defined in kotlin.io.readBytes.<anonymous>[LocalVariableDescriptor]

'FileOutputStream' @ [73:54] ==> public constructor FileOutputStream(p0: (File..File?)) defined in java.io.FileOutputStream[JavaClassConstructorDescriptor]

'this' @ [73:71] ==> <this> defined in kotlin.io.writeBytes[ReceiverParameterDescriptorImpl]

'use' @ [73:77] ==> @InlineOnly public inline fun <T : Closeable?, R> FileOutputStream.use(block: (FileOutputStream) -> Unit): Unit defined in kotlin.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Closeable?> -> FileOutputStream
    <R> -> Unit

'it' @ [73:83] ==> value-parameter it: FileOutputStream defined in kotlin.io.writeBytes.<anonymous>[ValueParameterDescriptorImpl]

'write' @ [73:86] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.io.FileOutputStream[JavaMethodDescriptor]

'array' @ [73:92] ==> value-parameter array: ByteArray defined in kotlin.io.writeBytes[ValueParameterDescriptorImpl]

'FileOutputStream' @ [80:55] ==> public constructor FileOutputStream(p0: (File..File?), p1: Boolean) defined in java.io.FileOutputStream[JavaClassConstructorDescriptor]

'this' @ [80:72] ==> <this> defined in kotlin.io.appendBytes[ReceiverParameterDescriptorImpl]

'use' @ [80:84] ==> @InlineOnly public inline fun <T : Closeable?, R> FileOutputStream.use(block: (FileOutputStream) -> Unit): Unit defined in kotlin.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Closeable?> -> FileOutputStream
    <R> -> Unit

'it' @ [80:90] ==> value-parameter it: FileOutputStream defined in kotlin.io.appendBytes.<anonymous>[ValueParameterDescriptorImpl]

'write' @ [80:93] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.io.FileOutputStream[JavaMethodDescriptor]

'array' @ [80:99] ==> value-parameter array: ByteArray defined in kotlin.io.appendBytes[ValueParameterDescriptorImpl]

'Charsets' @ [90:45] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [90:54] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'readBytes' @ [90:71] ==> public fun File.readBytes(): ByteArray defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'toString' @ [90:83] ==> @InlineOnly public inline fun ByteArray.toString(charset: Charset): String defined in kotlin.collections in file ArraysJVM.kt[SimpleFunctionDescriptorImpl]

'charset' @ [90:92] ==> value-parameter charset: Charset = ... defined in kotlin.io.readText[ValueParameterDescriptorImpl]

'Charsets' @ [99:60] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [99:69] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'writeBytes' @ [99:84] ==> public fun File.writeBytes(array: ByteArray): Unit defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'text' @ [99:95] ==> value-parameter text: String defined in kotlin.io.writeText[ValueParameterDescriptorImpl]

'toByteArray' @ [99:100] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'charset' @ [99:112] ==> value-parameter charset: Charset = ... defined in kotlin.io.writeText[ValueParameterDescriptorImpl]

'Charsets' @ [107:61] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [107:70] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'appendBytes' @ [107:85] ==> public fun File.appendBytes(array: ByteArray): Unit defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'text' @ [107:97] ==> value-parameter text: String defined in kotlin.io.appendText[ValueParameterDescriptorImpl]

'toByteArray' @ [107:102] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'charset' @ [107:114] ==> value-parameter charset: Charset = ... defined in kotlin.io.appendText[ValueParameterDescriptorImpl]

'forEachBlock' @ [118:91] ==> public fun File.forEachBlock(blockSize: Int, action: (buffer: ByteArray, bytesRead: Int) -> Unit): Unit defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'DEFAULT_BLOCK_SIZE' @ [118:104] ==> internal const val DEFAULT_BLOCK_SIZE: Int defined in kotlin.io in file Constants.kt[PropertyDescriptorImpl]

'action' @ [118:124] ==> value-parameter action: (buffer: ByteArray, bytesRead: Int) -> Unit defined in kotlin.io.forEachBlock[ValueParameterDescriptorImpl]

'ByteArray' @ [130:15] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'blockSize' @ [130:25] ==> value-parameter blockSize: Int defined in kotlin.io.forEachBlock[ValueParameterDescriptorImpl]

'coerceAtLeast' @ [130:35] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges in file _Ranges.kt[SimpleFunctionDescriptorImpl]

'MINIMUM_BLOCK_SIZE' @ [130:49] ==> internal const val MINIMUM_BLOCK_SIZE: Int defined in kotlin.io in file Constants.kt[PropertyDescriptorImpl]

'FileInputStream' @ [131:15] ==> public constructor FileInputStream(p0: (File..File?)) defined in java.io.FileInputStream[JavaClassConstructorDescriptor]

'this' @ [131:31] ==> <this> defined in kotlin.io.forEachBlock[ReceiverParameterDescriptorImpl]

'fis' @ [135:24] ==> val fis: FileInputStream defined in kotlin.io.forEachBlock[LocalVariableDescriptor]

'read' @ [135:28] ==> public open fun read(p0: (ByteArray..ByteArray?)): Int defined in java.io.FileInputStream[JavaMethodDescriptor]

'arr' @ [135:33] ==> val arr: ByteArray defined in kotlin.io.forEachBlock[LocalVariableDescriptor]

'if (size <= 0) {
                break
            } else {
                action(arr, size)
            }' @ [136:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'size' @ [136:17] ==> val size: Int defined in kotlin.io.forEachBlock[LocalVariableDescriptor]

'invoke' @ [139:17] ==> public abstract operator fun invoke(buffer: @ParameterName ByteArray, bytesRead: @ParameterName Int): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'arr' @ [139:24] ==> val arr: ByteArray defined in kotlin.io.forEachBlock[LocalVariableDescriptor]

'size' @ [139:29] ==> val size: Int defined in kotlin.io.forEachBlock[LocalVariableDescriptor]

'fis' @ [143:9] ==> val fis: FileInputStream defined in kotlin.io.forEachBlock[LocalVariableDescriptor]

'close' @ [143:13] ==> public open fun close(): Unit defined in java.io.FileInputStream[JavaMethodDescriptor]

'Charsets' @ [156:48] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [156:57] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'BufferedReader' @ [158:5] ==> public constructor BufferedReader(p0: (Reader..Reader?)) defined in java.io.BufferedReader[JavaClassConstructorDescriptor]

'InputStreamReader' @ [158:20] ==> public constructor InputStreamReader(p0: (InputStream..InputStream?), p1: (Charset..Charset?)) defined in java.io.InputStreamReader[JavaClassConstructorDescriptor]

'FileInputStream' @ [158:38] ==> public constructor FileInputStream(p0: (File..File?)) defined in java.io.FileInputStream[JavaClassConstructorDescriptor]

'this' @ [158:54] ==> <this> defined in kotlin.io.forEachLine[ReceiverParameterDescriptorImpl]

'charset' @ [158:61] ==> value-parameter charset: Charset = ... defined in kotlin.io.forEachLine[ValueParameterDescriptorImpl]

'forEachLine' @ [158:71] ==> public fun Reader.forEachLine(action: (String) -> Unit): Unit defined in kotlin.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'action' @ [158:83] ==> value-parameter action: (line: String) -> Unit defined in kotlin.io.forEachLine[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [164:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'FileInputStream' @ [166:12] ==> public constructor FileInputStream(p0: (File..File?)) defined in java.io.FileInputStream[JavaClassConstructorDescriptor]

'this' @ [166:28] ==> <this> defined in kotlin.io.inputStream[ReceiverParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [172:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'FileOutputStream' @ [174:12] ==> public constructor FileOutputStream(p0: (File..File?)) defined in java.io.FileOutputStream[JavaClassConstructorDescriptor]

'this' @ [174:29] ==> <this> defined in kotlin.io.outputStream[ReceiverParameterDescriptorImpl]

'Charsets' @ [185:46] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [185:55] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'ArrayList' @ [186:18] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'forEachLine' @ [187:5] ==> public fun File.forEachLine(charset: Charset = ..., action: (line: String) -> Unit): Unit defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'charset' @ [187:17] ==> value-parameter charset: Charset = ... defined in kotlin.io.readLines[ValueParameterDescriptorImpl]

'result' @ [187:28] ==> val result: ArrayList<String> defined in kotlin.io.readLines[LocalVariableDescriptor]

'add' @ [187:35] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [187:39] ==> value-parameter it: String defined in kotlin.io.readLines.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [188:12] ==> val result: ArrayList<String> defined in kotlin.io.readLines[LocalVariableDescriptor]

'Charsets' @ [198:56] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [198:65] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'bufferedReader' @ [199:9] ==> @InlineOnly public inline fun File.bufferedReader(charset: Charset = ..., bufferSize: Int = ...): BufferedReader defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'charset' @ [199:24] ==> value-parameter charset: Charset = ... defined in kotlin.io.useLines[ValueParameterDescriptorImpl]

'use' @ [199:33] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> T): T defined in kotlin.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> T

'invoke' @ [199:39] ==> public abstract operator fun invoke(p1: Sequence<String>): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [199:45] ==> value-parameter it: BufferedReader defined in kotlin.io.useLines.<anonymous>[ValueParameterDescriptorImpl]

'lineSequence' @ [199:48] ==> public fun BufferedReader.lineSequence(): Sequence<String> defined in kotlin.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

