'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'StringReader' @ [14:24] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'Test' @ [17:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTempFile' @ [18:25] ==> public open fun createTempFile(p0: (String..String?), p1: (String..String?)): (File..File?) defined in java.io.File[JavaMethodDescriptor]

'nanoTime' @ [18:55] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'toString' @ [18:66] ==> public open fun toString(): String defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'file' @ [19:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.testAppendText[LocalVariableDescriptor]

'writeText' @ [19:14] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [20:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.testAppendText[LocalVariableDescriptor]

'appendText' @ [20:14] ==> public fun File.appendText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [21:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.testAppendText[LocalVariableDescriptor]

'appendText' @ [21:14] ==> public fun File.appendText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [23:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'file' @ [23:45] ==> val file: (File..File?) defined in test.io.ReadWriteTest.testAppendText[LocalVariableDescriptor]

'readText' @ [23:50] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [24:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [24:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'file' @ [24:57] ==> val file: (File..File?) defined in test.io.ReadWriteTest.testAppendText[LocalVariableDescriptor]

'readLines' @ [24:62] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Charsets' @ [24:72] ==> public object Charsets defined in kotlin.text[FakeCallableDescriptorForObject]

'UTF_8' @ [24:81] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'file' @ [25:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.testAppendText[LocalVariableDescriptor]

'deleteOnExit' @ [25:14] ==> public open fun deleteOnExit(): Unit defined in java.io.File[JavaMethodDescriptor]

'Test' @ [28:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ArrayList' @ [29:20] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'sample' @ [42:9] ==> public fun sample(): Reader defined in test.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'forEachLine' @ [42:18] ==> public fun Reader.forEachLine(action: (String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'list' @ [43:13] ==> val list: ArrayList<String> defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'add' @ [43:18] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [43:22] ==> value-parameter it: String defined in test.io.ReadWriteTest.reader.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [45:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [45:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [45:48] ==> val list: ArrayList<String> defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'assertEquals' @ [47:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [47:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sample' @ [47:48] ==> public fun sample(): Reader defined in test.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'readLines' @ [47:57] ==> public fun Reader.readLines(): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'sample' @ [49:9] ==> public fun sample(): Reader defined in test.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'useLines' @ [49:18] ==> public inline fun <T> Reader.useLines(block: (Sequence<String>) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [50:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [50:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [50:52] ==> value-parameter it: Sequence<String> defined in test.io.ReadWriteTest.reader.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [50:55] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'StringReader' @ [54:22] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'reader' @ [56:9] ==> var reader: StringReader defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'forEachLine' @ [56:16] ==> public fun Reader.forEachLine(action: (String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [56:30] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'assertEquals' @ [57:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [57:25] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'reader' @ [59:9] ==> var reader: StringReader defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'StringReader' @ [59:18] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'reader' @ [60:9] ==> var reader: StringReader defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'forEachLine' @ [60:16] ==> public fun Reader.forEachLine(action: (String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [60:30] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'assertEquals' @ [61:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [61:25] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'reader' @ [63:9] ==> var reader: StringReader defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'StringReader' @ [63:18] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'c' @ [64:9] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'reader' @ [65:9] ==> var reader: StringReader defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'forEachLine' @ [65:16] ==> public fun Reader.forEachLine(action: (String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [65:30] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'assertEquals' @ [66:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [66:25] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'reader' @ [68:9] ==> var reader: StringReader defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'StringReader' @ [68:18] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'c' @ [69:9] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'reader' @ [70:9] ==> var reader: StringReader defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'forEachLine' @ [70:16] ==> public fun Reader.forEachLine(action: (String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [70:30] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'assertEquals' @ [71:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [71:25] ==> var c: Int defined in test.io.ReadWriteTest.reader[LocalVariableDescriptor]

'Test' @ [74:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'createTempFile' @ [75:25] ==> public open fun createTempFile(p0: (String..String?), p1: (String..String?)): (File..File?) defined in java.io.File[JavaMethodDescriptor]

'nanoTime' @ [75:55] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'toString' @ [75:66] ==> public open fun toString(): String defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'file' @ [76:22] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'outputStream' @ [76:27] ==> @InlineOnly public inline fun File.outputStream(): FileOutputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'writer' @ [76:42] ==> @InlineOnly public inline fun OutputStream.writer(charset: Charset = ...): OutputStreamWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'buffered' @ [76:51] ==> @InlineOnly public inline fun Writer.buffered(bufferSize: Int = ...): BufferedWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'writer' @ [78:9] ==> val writer: BufferedWriter defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'write' @ [78:16] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.BufferedWriter[JavaMethodDescriptor]

'writer' @ [79:9] ==> val writer: BufferedWriter defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'newLine' @ [79:16] ==> public open fun newLine(): Unit defined in java.io.BufferedWriter[JavaMethodDescriptor]

'writer' @ [80:9] ==> val writer: BufferedWriter defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'write' @ [80:16] ==> public open fun write(p0: (String..String?)): Unit defined in java.io.BufferedWriter[JavaMethodDescriptor]

'writer' @ [81:9] ==> val writer: BufferedWriter defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'close' @ [81:16] ==> public open fun close(): Unit defined in java.io.BufferedWriter[JavaMethodDescriptor]

'file' @ [84:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'forEachBlock' @ [84:14] ==> public fun File.forEachBlock(action: (buffer: ByteArray, bytesRead: Int) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [85:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'size' @ [85:24] ==> value-parameter size: Int defined in test.io.ReadWriteTest.file.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [85:38] ==> value-parameter size: Int defined in test.io.ReadWriteTest.file.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [85:50] ==> value-parameter size: Int defined in test.io.ReadWriteTest.file.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [85:55] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [86:13] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'arr' @ [86:24] ==> value-parameter arr: ByteArray defined in test.io.ReadWriteTest.file.<anonymous>[ValueParameterDescriptorImpl]

'contains' @ [86:28] ==> public operator fun ByteArray.contains(element: Byte): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'toByte' @ [86:41] ==> public final fun toByte(): Byte defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [88:20] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'file' @ [89:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'forEachLine' @ [89:14] ==> public fun File.forEachLine(charset: Charset = ..., action: (line: String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Charsets' @ [89:26] ==> public object Charsets defined in kotlin.text[FakeCallableDescriptorForObject]

'UTF_8' @ [89:35] ==> @field:JvmField public final val UTF_8: Charset defined in kotlin.text.Charsets[DeserializedPropertyDescriptor]

'list' @ [90:13] ==> val list: ArrayList<String> defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'add' @ [90:18] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [90:22] ==> value-parameter it: String defined in test.io.ReadWriteTest.file.<anonymous>[ValueParameterDescriptorImpl]

'assertEquals' @ [92:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<String>, actual: ArrayList<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<String>

'arrayListOf' @ [92:22] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [92:53] ==> val list: ArrayList<String> defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'assertEquals' @ [94:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'arrayListOf' @ [94:22] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'file' @ [94:53] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'readLines' @ [94:58] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [96:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'useLines' @ [96:14] ==> public inline fun <T> File.useLines(charset: Charset = ..., block: (Sequence<String>) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'assertEquals' @ [97:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'arrayListOf' @ [97:26] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [97:57] ==> value-parameter it: Sequence<String> defined in test.io.ReadWriteTest.file.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [97:60] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'file' @ [100:20] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'inputStream' @ [100:25] ==> @InlineOnly public inline fun File.inputStream(): FileInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'reader' @ [100:39] ==> @InlineOnly public inline fun InputStream.reader(charset: Charset = ...): InputStreamReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'readText' @ [100:48] ==> public fun Reader.readText(): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [101:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'text' @ [101:20] ==> val text: String defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'contains' @ [101:25] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [102:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'text' @ [102:20] ==> val text: String defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'contains' @ [102:25] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'file' @ [104:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'writeText' @ [104:14] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [106:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'forEachLine' @ [106:14] ==> public fun File.forEachLine(charset: Charset = ..., action: (line: String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [106:28] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'assertEquals' @ [107:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [107:25] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'file' @ [109:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'writeText' @ [109:14] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [110:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'forEachLine' @ [110:14] ==> public fun File.forEachLine(charset: Charset = ..., action: (line: String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [110:28] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'assertEquals' @ [111:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [111:25] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'file' @ [113:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'writeText' @ [113:14] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [114:9] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'file' @ [115:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'forEachLine' @ [115:14] ==> public fun File.forEachLine(charset: Charset = ..., action: (line: String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [115:28] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'assertEquals' @ [116:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [116:25] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'file' @ [118:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'writeText' @ [118:14] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [119:9] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'file' @ [120:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'forEachLine' @ [120:14] ==> public fun File.forEachLine(charset: Charset = ..., action: (line: String) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'c' @ [120:28] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'assertEquals' @ [121:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'c' @ [121:25] ==> var c: Int defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'file' @ [123:9] ==> val file: (File..File?) defined in test.io.ReadWriteTest.file[LocalVariableDescriptor]

'deleteOnExit' @ [123:14] ==> public open fun deleteOnExit(): Unit defined in java.io.File[JavaMethodDescriptor]

'Test' @ [128:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'ArrayList' @ [129:20] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'sample' @ [130:22] ==> public fun sample(): Reader defined in test.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'buffered' @ [130:31] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'reader' @ [132:9] ==> val reader: BufferedReader defined in test.io.ReadWriteTest.testUse[LocalVariableDescriptor]

'use' @ [132:16] ==> @InlineOnly public inline fun <T : Closeable?, R> BufferedReader.use(block: (BufferedReader) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> BufferedReader
    <R> -> Unit

'it' @ [134:28] ==> value-parameter it: BufferedReader defined in test.io.ReadWriteTest.testUse.<anonymous>[ValueParameterDescriptorImpl]

'readLine' @ [134:31] ==> public open fun readLine(): (String..String?) defined in java.io.BufferedReader[JavaMethodDescriptor]

'if (line != null)
                    list.add(line)
                else
                    break' @ [135:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'line' @ [135:21] ==> val line: (String..String?) defined in test.io.ReadWriteTest.testUse.<anonymous>[LocalVariableDescriptor]

'list' @ [136:21] ==> val list: ArrayList<String> defined in test.io.ReadWriteTest.testUse[LocalVariableDescriptor]

'add' @ [136:26] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'line' @ [136:30] ==> val line: (String..String?) defined in test.io.ReadWriteTest.testUse.<anonymous>[LocalVariableDescriptor]

'assertEquals' @ [142:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: ArrayList<String>, actual: ArrayList<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> ArrayList<String>

'arrayListOf' @ [142:22] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [142:53] ==> val list: ArrayList<String> defined in test.io.ReadWriteTest.testUse[LocalVariableDescriptor]

'Test' @ [145:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Suppress' @ [146:34] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'singleton' @ [146:84] ==> public open fun <T : (Any..Any?)> singleton(p0: (T..T?)): (MutableSet<(T..T?)>..Set<(T..T?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'first' @ [146:105] ==> public fun <T> Iterable<(T..T?)>.first(): (T..T?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'platformNull' @ [147:24] ==> local final fun <T> platformNull(): (Closeable..Closeable?) defined in test.io.ReadWriteTest.testPlatformNullUse[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Closeable

'resource' @ [148:22] ==> val resource: (Closeable..Closeable?) defined in test.io.ReadWriteTest.testPlatformNullUse[LocalVariableDescriptor]

'use' @ [148:31] ==> @InlineOnly public inline fun <T : Closeable?, R> (Closeable..Closeable?).use(block: ((Closeable..Closeable?)) -> String): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.io.Closeable..java.io.Closeable?)
    <R> -> String

'assertEquals' @ [151:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'result' @ [151:28] ==> val result: String defined in test.io.ReadWriteTest.testPlatformNullUse[LocalVariableDescriptor]

'Test' @ [154:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'URL' @ [155:19] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'url' @ [156:20] ==> val url: URL defined in test.io.ReadWriteTest.testURL[LocalVariableDescriptor]

'readText' @ [156:24] ==> @InlineOnly public inline fun URL.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [157:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'text' @ [157:21] ==> val text: String defined in test.io.ReadWriteTest.testURL[LocalVariableDescriptor]

'isEmpty' @ [157:26] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'url' @ [158:21] ==> val url: URL defined in test.io.ReadWriteTest.testURL[LocalVariableDescriptor]

'readText' @ [158:25] ==> @InlineOnly public inline fun URL.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'charset' @ [158:34] ==> @InlineOnly public inline fun charset(charsetName: String): Charset defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertFalse' @ [159:9] ==> public fun assertFalse(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'text2' @ [159:21] ==> val text2: String defined in test.io.ReadWriteTest.testURL[LocalVariableDescriptor]

'isEmpty' @ [159:27] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [165:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sample' @ [168:21] ==> public fun sample(): Reader defined in test.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'useLines' @ [168:30] ==> public inline fun <T> Reader.useLines(block: (Sequence<String>) -> List<String>): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>

'it' @ [168:41] ==> value-parameter it: Sequence<String> defined in test.io.LineIteratorTest.useLines.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [168:44] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sample' @ [169:21] ==> public fun sample(): Reader defined in test.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'useLines' @ [169:30] ==> public inline fun <T> Reader.useLines(block: (Sequence<String>) -> ArrayList<String>): ArrayList<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<String>

'it' @ [169:59] ==> value-parameter it: Sequence<String> defined in test.io.LineIteratorTest.useLines.<anonymous>[ValueParameterDescriptorImpl]

'toCollection' @ [169:62] ==> public fun <T, C : MutableCollection<in String>> Sequence<String>.toCollection(destination: ArrayList<String> /* = ArrayList<String> */): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <C : MutableCollection<in T>> -> ArrayList<String>

'arrayListOf' @ [169:75] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [171:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [171:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list1' @ [171:48] ==> val list1: List<String> defined in test.io.LineIteratorTest.useLines[LocalVariableDescriptor]

'assertEquals' @ [172:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [172:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list2' @ [172:48] ==> val list2: ArrayList<String> defined in test.io.LineIteratorTest.useLines[LocalVariableDescriptor]

'Test' @ [175:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'sample' @ [176:22] ==> public fun sample(): Reader defined in test.io in file ReadWrite.kt[SimpleFunctionDescriptorImpl]

'buffered' @ [176:31] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'reader' @ [178:24] ==> val reader: BufferedReader defined in test.io.LineIteratorTest.manualClose[LocalVariableDescriptor]

'lineSequence' @ [178:31] ==> public fun BufferedReader.lineSequence(): Sequence<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toList' @ [178:46] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assertEquals' @ [179:13] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'arrayListOf' @ [179:26] ==> public fun <T> arrayListOf(vararg elements: String): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'list' @ [179:57] ==> val list: List<String> defined in test.io.LineIteratorTest.manualClose[LocalVariableDescriptor]

'reader' @ [181:13] ==> val reader: BufferedReader defined in test.io.LineIteratorTest.manualClose[LocalVariableDescriptor]

'close' @ [181:20] ==> public open fun close(): Unit defined in java.io.BufferedReader[JavaMethodDescriptor]

'Test' @ [185:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'StringReader' @ [186:22] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'buffered' @ [186:39] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [187:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'emptyList' @ [187:22] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reader' @ [187:35] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'lineSequence' @ [187:42] ==> public fun BufferedReader.lineSequence(): Sequence<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toList' @ [187:57] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reader' @ [188:9] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'close' @ [188:16] ==> public open fun close(): Unit defined in java.io.BufferedReader[JavaMethodDescriptor]

'reader' @ [190:9] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'StringReader' @ [190:18] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'buffered' @ [190:36] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [191:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [191:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reader' @ [191:35] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'lineSequence' @ [191:42] ==> public fun BufferedReader.lineSequence(): Sequence<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toList' @ [191:57] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reader' @ [192:9] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'close' @ [192:16] ==> public open fun close(): Unit defined in java.io.BufferedReader[JavaMethodDescriptor]

'reader' @ [194:9] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'StringReader' @ [194:18] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'buffered' @ [194:38] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [195:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [195:22] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reader' @ [195:35] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'lineSequence' @ [195:42] ==> public fun BufferedReader.lineSequence(): Sequence<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toList' @ [195:57] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reader' @ [196:9] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'close' @ [196:16] ==> public open fun close(): Unit defined in java.io.BufferedReader[JavaMethodDescriptor]

'reader' @ [198:9] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'StringReader' @ [198:18] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'buffered' @ [198:39] ==> @InlineOnly public inline fun Reader.buffered(bufferSize: Int = ...): BufferedReader defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [199:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: List<String>, actual: List<String>, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> List<String>

'listOf' @ [199:22] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reader' @ [199:40] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'lineSequence' @ [199:47] ==> public fun BufferedReader.lineSequence(): Sequence<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'toList' @ [199:62] ==> public fun <T> Sequence<String>.toList(): List<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'reader' @ [200:9] ==> var reader: BufferedReader defined in test.io.LineIteratorTest.boundaryConditions[LocalVariableDescriptor]

'close' @ [200:16] ==> public open fun close(): Unit defined in java.io.BufferedReader[JavaMethodDescriptor]

