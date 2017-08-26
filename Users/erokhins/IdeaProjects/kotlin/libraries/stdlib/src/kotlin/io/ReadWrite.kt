'JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'JvmName' @ [2:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'kotlin.internal.InlineOnly' @ [13:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'DEFAULT_BUFFER_SIZE' @ [14:53] ==> public const val DEFAULT_BUFFER_SIZE: Int defined in kotlin.io in file Constants.kt[PropertyDescriptorImpl]

'if (this is BufferedReader) this else BufferedReader(this, bufferSize)' @ [15:11] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BufferedReader, elseBranch: BufferedReader): BufferedReader[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BufferedReader

'this' @ [15:15] ==> <this> defined in kotlin.io.buffered[ReceiverParameterDescriptorImpl]

'this' @ [15:39] ==> <this> defined in kotlin.io.buffered[ReceiverParameterDescriptorImpl]

'BufferedReader' @ [15:49] ==> public constructor BufferedReader(p0: (Reader..Reader?), p1: Int) defined in java.io.BufferedReader[JavaClassConstructorDescriptor]

'this' @ [15:64] ==> <this> defined in kotlin.io.buffered[ReceiverParameterDescriptorImpl]

'bufferSize' @ [15:70] ==> value-parameter bufferSize: Int = ... defined in kotlin.io.buffered[ValueParameterDescriptorImpl]

'kotlin.internal.InlineOnly' @ [18:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'DEFAULT_BUFFER_SIZE' @ [19:53] ==> public const val DEFAULT_BUFFER_SIZE: Int defined in kotlin.io in file Constants.kt[PropertyDescriptorImpl]

'if (this is BufferedWriter) this else BufferedWriter(this, bufferSize)' @ [20:11] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BufferedWriter, elseBranch: BufferedWriter): BufferedWriter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BufferedWriter

'this' @ [20:15] ==> <this> defined in kotlin.io.buffered[ReceiverParameterDescriptorImpl]

'this' @ [20:39] ==> <this> defined in kotlin.io.buffered[ReceiverParameterDescriptorImpl]

'BufferedWriter' @ [20:49] ==> public constructor BufferedWriter(p0: (Writer..Writer?), p1: Int) defined in java.io.BufferedWriter[JavaClassConstructorDescriptor]

'this' @ [20:64] ==> <this> defined in kotlin.io.buffered[ReceiverParameterDescriptorImpl]

'bufferSize' @ [20:70] ==> value-parameter bufferSize: Int = ... defined in kotlin.io.buffered[ValueParameterDescriptorImpl]

'useLines' @ [28:65] ==> public inline fun <T> Reader.useLines(block: (Sequence<String>) -> Unit): Unit defined in kotlin.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'it' @ [28:76] ==> value-parameter it: Sequence<String> defined in kotlin.io.forEachLine.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [28:79] ==> public inline fun <T> Sequence<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'action' @ [28:87] ==> value-parameter action: (String) -> Unit defined in kotlin.io.forEachLine[ValueParameterDescriptorImpl]

'arrayListOf' @ [36:18] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'forEachLine' @ [37:5] ==> public fun Reader.forEachLine(action: (String) -> Unit): Unit defined in kotlin.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'result' @ [37:19] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in kotlin.io.readLines[LocalVariableDescriptor]

'add' @ [37:26] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [37:30] ==> value-parameter it: String defined in kotlin.io.readLines.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [38:12] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in kotlin.io.readLines[LocalVariableDescriptor]

'buffered' @ [47:9] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'use' @ [47:20] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> T): T defined in kotlin.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> T

'invoke' @ [47:26] ==> public abstract operator fun invoke(p1: Sequence<String>): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [47:32] ==> value-parameter it: BufferedReader defined in kotlin.io.useLines.<anonymous>[ValueParameterDescriptorImpl]

'lineSequence' @ [47:35] ==> public fun BufferedReader.lineSequence(): Sequence<String> defined in kotlin.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'kotlin.internal.InlineOnly' @ [50:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'StringReader' @ [51:51] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'this' @ [51:64] ==> <this> defined in kotlin.io.reader[ReceiverParameterDescriptorImpl]

'LinesSequence' @ [64:62] ==> public constructor LinesSequence(reader: BufferedReader) defined in kotlin.io.LinesSequence[ClassConstructorDescriptorImpl]

'this' @ [64:76] ==> <this> defined in kotlin.io.lineSequence[ReceiverParameterDescriptorImpl]

'constrainOnce' @ [64:82] ==> public fun <T> Sequence<String>.constrainOnce(): Sequence<String> defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String

'nextValue' @ [73:21] ==> private final var nextValue: String? defined in kotlin.io.LinesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'!' @ [73:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'done' @ [73:43] ==> private final var done: Boolean defined in kotlin.io.LinesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextValue' @ [74:21] ==> private final var nextValue: String? defined in kotlin.io.LinesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'reader' @ [74:33] ==> private final val reader: BufferedReader defined in kotlin.io.LinesSequence[PropertyDescriptorImpl]

'readLine' @ [74:40] ==> public open fun readLine(): (String..String?) defined in java.io.BufferedReader[JavaMethodDescriptor]

'nextValue' @ [75:25] ==> private final var nextValue: String? defined in kotlin.io.LinesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'done' @ [75:44] ==> private final var done: Boolean defined in kotlin.io.LinesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextValue' @ [77:24] ==> private final var nextValue: String? defined in kotlin.io.LinesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'!' @ [81:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasNext' @ [81:22] ==> public open fun hasNext(): Boolean defined in kotlin.io.LinesSequence.iterator.<no name provided>[SimpleFunctionDescriptorImpl]

'NoSuchElementException' @ [82:27] ==> public constructor NoSuchElementException() defined in java.util.NoSuchElementException[JavaClassConstructorDescriptor]

'nextValue' @ [84:30] ==> private final var nextValue: String? defined in kotlin.io.LinesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'nextValue' @ [85:17] ==> private final var nextValue: String? defined in kotlin.io.LinesSequence.iterator.<no name provided>[PropertyDescriptorImpl]

'answer' @ [86:24] ==> val answer: String? defined in kotlin.io.LinesSequence.iterator.<no name provided>.next[LocalVariableDescriptor]

'StringWriter' @ [100:18] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'copyTo' @ [101:5] ==> public fun Reader.copyTo(out: Writer, bufferSize: Int = ...): Long defined in kotlin.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'buffer' @ [101:12] ==> val buffer: StringWriter defined in kotlin.io.readText[LocalVariableDescriptor]

'buffer' @ [102:12] ==> val buffer: StringWriter defined in kotlin.io.readText[LocalVariableDescriptor]

'toString' @ [102:19] ==> public open fun toString(): String defined in java.io.StringWriter[JavaMethodDescriptor]

'DEFAULT_BUFFER_SIZE' @ [114:57] ==> public const val DEFAULT_BUFFER_SIZE: Int defined in kotlin.io in file Constants.kt[PropertyDescriptorImpl]

'CharArray' @ [116:18] ==> public constructor CharArray(size: Int) defined in kotlin.CharArray[DeserializedClassConstructorDescriptor]

'bufferSize' @ [116:28] ==> value-parameter bufferSize: Int = ... defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'read' @ [117:17] ==> public open fun read(p0: (CharArray..CharArray?)): Int defined in java.io.Reader[JavaMethodDescriptor]

'buffer' @ [117:22] ==> val buffer: CharArray defined in kotlin.io.copyTo[LocalVariableDescriptor]

'chars' @ [118:12] ==> var chars: Int defined in kotlin.io.copyTo[LocalVariableDescriptor]

'out' @ [119:9] ==> value-parameter out: Writer defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'write' @ [119:13] ==> public abstract fun write(p0: (CharArray..CharArray?), p1: Int, p2: Int): Unit defined in java.io.Writer[JavaMethodDescriptor]

'buffer' @ [119:19] ==> val buffer: CharArray defined in kotlin.io.copyTo[LocalVariableDescriptor]

'chars' @ [119:30] ==> var chars: Int defined in kotlin.io.copyTo[LocalVariableDescriptor]

'charsCopied' @ [120:9] ==> var charsCopied: Long defined in kotlin.io.copyTo[LocalVariableDescriptor]

'chars' @ [120:24] ==> var chars: Int defined in kotlin.io.copyTo[LocalVariableDescriptor]

'chars' @ [121:9] ==> var chars: Int defined in kotlin.io.copyTo[LocalVariableDescriptor]

'read' @ [121:17] ==> public open fun read(p0: (CharArray..CharArray?)): Int defined in java.io.Reader[JavaMethodDescriptor]

'buffer' @ [121:22] ==> val buffer: CharArray defined in kotlin.io.copyTo[LocalVariableDescriptor]

'charsCopied' @ [123:12] ==> var charsCopied: Long defined in kotlin.io.copyTo[LocalVariableDescriptor]

'kotlin.internal.InlineOnly' @ [134:1] ==> public constructor InlineOnly() defined in kotlin.internal.InlineOnly[ClassConstructorDescriptorImpl]

'Charsets' @ [135:51] ==> public object Charsets defined in kotlin.text in file Charsets.kt[FakeCallableDescriptorForObject]

'UTF_8' @ [135:60] ==> @JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[PropertyDescriptorImpl]

'readBytes' @ [135:77] ==> public fun URL.readBytes(): ByteArray defined in kotlin.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'toString' @ [135:89] ==> @InlineOnly public inline fun ByteArray.toString(charset: Charset): String defined in kotlin.collections in file ArraysJVM.kt[SimpleFunctionDescriptorImpl]

'charset' @ [135:98] ==> value-parameter charset: Charset = ... defined in kotlin.io.readText[ValueParameterDescriptorImpl]

'openStream' @ [144:41] ==> public final fun openStream(): (InputStream..InputStream?) defined in java.net.URL[JavaMethodDescriptor]

'use' @ [144:54] ==> @InlineOnly public inline fun <T : Closeable?, R> (InputStream..InputStream?).use(block: ((InputStream..InputStream?)) -> ByteArray): ByteArray defined in kotlin.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Closeable?> -> (java.io.InputStream..java.io.InputStream?)
    <R> -> ByteArray

'it' @ [144:60] ==> value-parameter it: (InputStream..InputStream?) defined in kotlin.io.readBytes.<anonymous>[ValueParameterDescriptorImpl]

'readBytes' @ [144:63] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io in file IOStreams.kt[SimpleFunctionDescriptorImpl]

