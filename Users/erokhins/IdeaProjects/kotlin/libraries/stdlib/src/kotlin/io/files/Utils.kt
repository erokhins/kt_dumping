'JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[ClassConstructorDescriptorImpl]

'JvmMultifileClass' @ [2:1] ==> public constructor JvmMultifileClass() defined in kotlin.jvm.JvmMultifileClass[DeserializedClassConstructorDescriptor]

'JvmName' @ [3:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'createTempFile' @ [23:20] ==> public open fun createTempFile(p0: (String..String?), p1: (String..String?), p2: (File..File?)): (File..File?) defined in java.io.File[JavaMethodDescriptor]

'prefix' @ [23:35] ==> value-parameter prefix: String = ... defined in kotlin.io.createTempDir[ValueParameterDescriptorImpl]

'suffix' @ [23:43] ==> value-parameter suffix: String? = ... defined in kotlin.io.createTempDir[ValueParameterDescriptorImpl]

'directory' @ [23:51] ==> value-parameter directory: File? = ... defined in kotlin.io.createTempDir[ValueParameterDescriptorImpl]

'dir' @ [24:5] ==> val dir: (File..File?) defined in kotlin.io.createTempDir[LocalVariableDescriptor]

'delete' @ [24:9] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'if (dir.mkdir()) {
        return dir
    } else {
        throw IOException("Unable to create temporary directory $dir.")
    }' @ [25:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'dir' @ [25:9] ==> val dir: (File..File?) defined in kotlin.io.createTempDir[LocalVariableDescriptor]

'mkdir' @ [25:13] ==> public open fun mkdir(): Boolean defined in java.io.File[JavaMethodDescriptor]

'dir' @ [26:16] ==> val dir: (File..File?) defined in kotlin.io.createTempDir[LocalVariableDescriptor]

'IOException' @ [28:15] ==> public constructor IOException(p0: (String..String?)) defined in java.io.IOException[JavaClassConstructorDescriptor]

'dir' @ [28:66] ==> val dir: (File..File?) defined in kotlin.io.createTempDir[LocalVariableDescriptor]

'createTempFile' @ [45:17] ==> public open fun createTempFile(p0: (String..String?), p1: (String..String?), p2: (File..File?)): (File..File?) defined in java.io.File[JavaMethodDescriptor]

'prefix' @ [45:32] ==> value-parameter prefix: String = ... defined in kotlin.io.createTempFile[ValueParameterDescriptorImpl]

'suffix' @ [45:40] ==> value-parameter suffix: String? = ... defined in kotlin.io.createTempFile[ValueParameterDescriptorImpl]

'directory' @ [45:48] ==> value-parameter directory: File? = ... defined in kotlin.io.createTempFile[ValueParameterDescriptorImpl]

'name' @ [52:13] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'substringAfterLast' @ [52:18] ==> public fun String.substringAfterLast(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'if (File.separatorChar != '/') path.replace(File.separatorChar, '/') else path' @ [59:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'!=' @ [59:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'separatorChar' @ [59:22] ==> public const final val separatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'path' @ [59:44] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'replace' @ [59:49] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text in file StringsJVM.kt[SimpleFunctionDescriptorImpl]

'separatorChar' @ [59:62] ==> public const final val separatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'path' @ [59:87] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'name' @ [65:13] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'substringBeforeLast' @ [65:18] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'toRelativeStringOrNull' @ [77:11] ==> private fun File.toRelativeStringOrNull(base: File): String? defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'base' @ [77:34] ==> value-parameter base: File defined in kotlin.io.toRelativeString[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [77:49] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'this' @ [77:118] ==> <this> defined in kotlin.io.toRelativeString[ReceiverParameterDescriptorImpl]

'base' @ [77:128] ==> value-parameter base: File defined in kotlin.io.toRelativeString[ValueParameterDescriptorImpl]

'File' @ [88:48] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'this' @ [88:53] ==> <this> defined in kotlin.io.relativeTo[ReceiverParameterDescriptorImpl]

'toRelativeString' @ [88:58] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'base' @ [88:75] ==> value-parameter base: File defined in kotlin.io.relativeTo[ValueParameterDescriptorImpl]

'toRelativeStringOrNull' @ [98:11] ==> private fun File.toRelativeStringOrNull(base: File): String? defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'base' @ [98:34] ==> value-parameter base: File defined in kotlin.io.relativeToOrSelf[ValueParameterDescriptorImpl]

'let' @ [98:41] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <R> -> File

'this' @ [98:56] ==> <this> defined in kotlin.io.relativeToOrSelf[ReceiverParameterDescriptorImpl]

'toRelativeStringOrNull' @ [108:11] ==> private fun File.toRelativeStringOrNull(base: File): String? defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'base' @ [108:34] ==> value-parameter base: File defined in kotlin.io.relativeToOrNull[ValueParameterDescriptorImpl]

'let' @ [108:41] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String
    <R> -> File

'this' @ [113:26] ==> <this> defined in kotlin.io.toRelativeStringOrNull[ReceiverParameterDescriptorImpl]

'toComponents' @ [113:31] ==> internal fun File.toComponents(): FilePathComponents defined in kotlin.io in file FilePathComponents.kt[SimpleFunctionDescriptorImpl]

'normalize' @ [113:46] ==> private fun FilePathComponents.normalize(): FilePathComponents defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'base' @ [114:26] ==> value-parameter base: File defined in kotlin.io.toRelativeStringOrNull[ValueParameterDescriptorImpl]

'toComponents' @ [114:31] ==> internal fun File.toComponents(): FilePathComponents defined in kotlin.io in file FilePathComponents.kt[SimpleFunctionDescriptorImpl]

'normalize' @ [114:46] ==> private fun FilePathComponents.normalize(): FilePathComponents defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'thisComponents' @ [115:9] ==> val thisComponents: FilePathComponents defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'root' @ [115:24] ==> public final val root: File defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'baseComponents' @ [115:32] ==> val baseComponents: FilePathComponents defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'root' @ [115:47] ==> public final val root: File defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'baseComponents' @ [119:21] ==> val baseComponents: FilePathComponents defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'size' @ [119:36] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'thisComponents' @ [120:21] ==> val thisComponents: FilePathComponents defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'size' @ [120:36] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'run' @ [122:21] ==> @InlineOnly public inline fun <T, R> File.run(block: File.() -> Int): Int defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> File
    <R> -> Int

'minOf' @ [124:28] ==> @SinceKotlin @InlineOnly public inline fun minOf(a: Int, b: Int): Int defined in kotlin.comparisons in file _Comparisons.kt[SimpleFunctionDescriptorImpl]

'thisCount' @ [124:34] ==> val thisCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'baseCount' @ [124:45] ==> val baseCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'i' @ [125:16] ==> var i: Int defined in kotlin.io.toRelativeStringOrNull.<anonymous>[LocalVariableDescriptor]

'maxSameCount' @ [125:20] ==> val maxSameCount: Int defined in kotlin.io.toRelativeStringOrNull.<anonymous>[LocalVariableDescriptor]

'thisComponents' @ [125:36] ==> val thisComponents: FilePathComponents defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'segments' @ [125:51] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'i' @ [125:60] ==> var i: Int defined in kotlin.io.toRelativeStringOrNull.<anonymous>[LocalVariableDescriptor]

'baseComponents' @ [125:66] ==> val baseComponents: FilePathComponents defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'segments' @ [125:81] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'i' @ [125:90] ==> var i: Int defined in kotlin.io.toRelativeStringOrNull.<anonymous>[LocalVariableDescriptor]

'i' @ [126:13] ==> var i: Int defined in kotlin.io.toRelativeStringOrNull.<anonymous>[LocalVariableDescriptor]

'i' @ [127:26] ==> var i: Int defined in kotlin.io.toRelativeStringOrNull.<anonymous>[LocalVariableDescriptor]

'StringBuilder' @ [131:15] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'baseCount' @ [132:15] ==> val baseCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'sameCount' @ [132:36] ==> val sameCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'baseComponents' @ [133:13] ==> val baseComponents: FilePathComponents defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'segments' @ [133:28] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'i' @ [133:37] ==> val i: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'name' @ [133:40] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'res' @ [137:9] ==> val res: StringBuilder /* = StringBuilder */ defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'append' @ [137:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'i' @ [139:13] ==> val i: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'sameCount' @ [139:18] ==> val sameCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'res' @ [140:13] ==> val res: StringBuilder /* = StringBuilder */ defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'append' @ [140:17] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'separatorChar' @ [140:29] ==> public const final val separatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'sameCount' @ [145:9] ==> val sameCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'thisCount' @ [145:21] ==> val thisCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'sameCount' @ [147:13] ==> val sameCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'baseCount' @ [147:25] ==> val baseCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'res' @ [148:13] ==> val res: StringBuilder /* = StringBuilder */ defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'append' @ [148:17] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'separatorChar' @ [148:29] ==> public const final val separatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'thisComponents' @ [150:9] ==> val thisComponents: FilePathComponents defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'segments' @ [150:24] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'drop' @ [150:33] ==> public fun <T> Iterable<File>.drop(n: Int): List<File> defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> File

'sameCount' @ [150:38] ==> val sameCount: Int defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'joinTo' @ [150:49] ==> public fun <T, A : Appendable /* = Appendable */> Iterable<File>.joinTo(buffer: StringBuilder /* = StringBuilder */, separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): StringBuilder /* = StringBuilder */ defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> File
    <A : Appendable /* = Appendable */> -> StringBuilder

'res' @ [150:56] ==> val res: StringBuilder /* = StringBuilder */ defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'separator' @ [150:66] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'res' @ [153:12] ==> val res: StringBuilder /* = StringBuilder */ defined in kotlin.io.toRelativeStringOrNull[LocalVariableDescriptor]

'toString' @ [153:16] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'DEFAULT_BUFFER_SIZE' @ [177:84] ==> public const val DEFAULT_BUFFER_SIZE: Int defined in kotlin.io in file Constants.kt[PropertyDescriptorImpl]

'!' @ [178:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'this' @ [178:10] ==> <this> defined in kotlin.io.copyTo[ReceiverParameterDescriptorImpl]

'exists' @ [178:15] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'NoSuchFileException' @ [179:15] ==> public constructor NoSuchFileException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.NoSuchFileException[ClassConstructorDescriptorImpl]

'this' @ [179:42] ==> <this> defined in kotlin.io.copyTo[ReceiverParameterDescriptorImpl]

'target' @ [182:9] ==> value-parameter target: File defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'exists' @ [182:16] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'if (!overwrite) true else !target.delete()' @ [183:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [183:31] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overwrite' @ [183:32] ==> value-parameter overwrite: Boolean = ... defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'!' @ [183:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'target' @ [183:54] ==> value-parameter target: File defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'delete' @ [183:61] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'stillExists' @ [185:13] ==> val stillExists: Boolean defined in kotlin.io.copyTo[LocalVariableDescriptor]

'FileAlreadyExistsException' @ [186:19] ==> public constructor FileAlreadyExistsException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.FileAlreadyExistsException[ClassConstructorDescriptorImpl]

'this' @ [186:53] ==> <this> defined in kotlin.io.copyTo[ReceiverParameterDescriptorImpl]

'target' @ [187:29] ==> value-parameter target: File defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'if (this.isDirectory) {
        if (!target.mkdirs())
            throw FileSystemException(file = this, other = target, reason = "Failed to create target directory.")
    } else {
        target.parentFile?.mkdirs()

        this.inputStream().use { input ->
            target.outputStream().use { output ->
                input.copyTo(output, bufferSize)
            }
        }
    }' @ [192:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'this' @ [192:9] ==> <this> defined in kotlin.io.copyTo[ReceiverParameterDescriptorImpl]

'isDirectory' @ [192:14] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'!' @ [193:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'target' @ [193:14] ==> value-parameter target: File defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'mkdirs' @ [193:21] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'FileSystemException' @ [194:19] ==> public constructor FileSystemException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.FileSystemException[ClassConstructorDescriptorImpl]

'this' @ [194:46] ==> <this> defined in kotlin.io.copyTo[ReceiverParameterDescriptorImpl]

'target' @ [194:60] ==> value-parameter target: File defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'target' @ [196:9] ==> value-parameter target: File defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'parentFile' @ [196:16] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [196:28] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'this' @ [198:9] ==> <this> defined in kotlin.io.copyTo[ReceiverParameterDescriptorImpl]

'inputStream' @ [198:14] ==> @InlineOnly public inline fun File.inputStream(): FileInputStream defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'use' @ [198:28] ==> @InlineOnly public inline fun <T : Closeable?, R> FileInputStream.use(block: (FileInputStream) -> Long): Long defined in kotlin.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Closeable?> -> FileInputStream
    <R> -> Long

'target' @ [199:13] ==> value-parameter target: File defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'outputStream' @ [199:20] ==> @InlineOnly public inline fun File.outputStream(): FileOutputStream defined in kotlin.io in file FileReadWrite.kt[SimpleFunctionDescriptorImpl]

'use' @ [199:35] ==> @InlineOnly public inline fun <T : Closeable?, R> FileOutputStream.use(block: (FileOutputStream) -> Long): Long defined in kotlin.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Closeable?> -> FileOutputStream
    <R> -> Long

'input' @ [200:17] ==> value-parameter input: FileInputStream defined in kotlin.io.copyTo.<anonymous>[ValueParameterDescriptorImpl]

'copyTo' @ [200:23] ==> public fun InputStream.copyTo(out: OutputStream, bufferSize: Int = ...): Long defined in kotlin.io in file IOStreams.kt[SimpleFunctionDescriptorImpl]

'output' @ [200:30] ==> value-parameter output: FileOutputStream defined in kotlin.io.copyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'bufferSize' @ [200:38] ==> value-parameter bufferSize: Int = ... defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'target' @ [205:12] ==> value-parameter target: File defined in kotlin.io.copyTo[ValueParameterDescriptorImpl]

'FileSystemException' @ [221:48] ==> public constructor FileSystemException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.FileSystemException[ClassConstructorDescriptorImpl]

'file' @ [221:68] ==> value-parameter file: File defined in kotlin.io.TerminateException.<init>[ValueParameterDescriptorImpl]

'exception' @ [254:66] ==> value-parameter exception: IOException defined in kotlin.io.copyRecursively.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [256:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'exists' @ [256:10] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'invoke' @ [257:16] ==> public abstract operator fun invoke(p1: File, p2: IOException): OnErrorAction defined in kotlin.Function2[FunctionInvokeDescriptor]

'this' @ [257:24] ==> <this> defined in kotlin.io.copyRecursively[ReceiverParameterDescriptorImpl]

'NoSuchFileException' @ [257:30] ==> public constructor NoSuchFileException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.NoSuchFileException[ClassConstructorDescriptorImpl]

'this' @ [257:57] ==> <this> defined in kotlin.io.copyRecursively[ReceiverParameterDescriptorImpl]

'TERMINATE' @ [258:31] ==> enum entry TERMINATE defined in kotlin.io.OnErrorAction[FakeCallableDescriptorForObject]

'walkTopDown' @ [262:21] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io in file FileTreeWalk.kt[SimpleFunctionDescriptorImpl]

'onFail' @ [262:35] ==> public final fun onFail(function: (File, IOException) -> Unit): FileTreeWalk defined in kotlin.io.FileTreeWalk[SimpleFunctionDescriptorImpl]

'invoke' @ [262:56] ==> public abstract operator fun invoke(p1: File, p2: IOException): OnErrorAction defined in kotlin.Function2[FunctionInvokeDescriptor]

'f' @ [262:64] ==> value-parameter f: File defined in kotlin.io.copyRecursively.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [262:67] ==> value-parameter e: IOException defined in kotlin.io.copyRecursively.<anonymous>[ValueParameterDescriptorImpl]

'TERMINATE' @ [262:87] ==> enum entry TERMINATE defined in kotlin.io.OnErrorAction[FakeCallableDescriptorForObject]

'TerminateException' @ [262:104] ==> public constructor TerminateException(file: File) defined in kotlin.io.TerminateException[ClassConstructorDescriptorImpl]

'f' @ [262:123] ==> value-parameter f: File defined in kotlin.io.copyRecursively.<anonymous>[ValueParameterDescriptorImpl]

'if (!src.exists()) {
                if (onError(src, NoSuchFileException(file = src, reason = "The source file doesn't exist.")) ==
                        OnErrorAction.TERMINATE)
                    return false
            } else {
                val relPath = src.toRelativeString(this)
                val dstFile = File(target, relPath)
                if (dstFile.exists() && !(src.isDirectory && dstFile.isDirectory)) {
                    val stillExists = if (!overwrite) true else {
                        if (dstFile.isDirectory)
                            !dstFile.deleteRecursively()
                        else
                            !dstFile.delete()
                    }

                    if (stillExists) {
                        if (onError(dstFile, FileAlreadyExistsException(file = src,
                                    other = dstFile,
                                    reason = "The destination file already exists.")) == OnErrorAction.TERMINATE)
                                return false

                        continue
                    }
                }

                if (src.isDirectory) {
                    dstFile.mkdirs()
                } else {
                    if (src.copyTo(dstFile, overwrite).length() != src.length()) {
                        if (onError(src, IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE)
                            return false
                    }
                }
            }' @ [263:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [263:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'src' @ [263:18] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'exists' @ [263:22] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'invoke' @ [264:21] ==> public abstract operator fun invoke(p1: File, p2: IOException): OnErrorAction defined in kotlin.Function2[FunctionInvokeDescriptor]

'src' @ [264:29] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'NoSuchFileException' @ [264:34] ==> public constructor NoSuchFileException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.NoSuchFileException[ClassConstructorDescriptorImpl]

'src' @ [264:61] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'TERMINATE' @ [265:39] ==> enum entry TERMINATE defined in kotlin.io.OnErrorAction[FakeCallableDescriptorForObject]

'src' @ [268:31] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'toRelativeString' @ [268:35] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'this' @ [268:52] ==> <this> defined in kotlin.io.copyRecursively[ReceiverParameterDescriptorImpl]

'File' @ [269:31] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'target' @ [269:36] ==> value-parameter target: File defined in kotlin.io.copyRecursively[ValueParameterDescriptorImpl]

'relPath' @ [269:44] ==> val relPath: String defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'dstFile' @ [270:21] ==> val dstFile: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'exists' @ [270:29] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'!' @ [270:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'src' @ [270:43] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'isDirectory' @ [270:47] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'dstFile' @ [270:62] ==> val dstFile: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'isDirectory' @ [270:70] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'if (!overwrite) true else {
                        if (dstFile.isDirectory)
                            !dstFile.deleteRecursively()
                        else
                            !dstFile.delete()
                    }' @ [271:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [271:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overwrite' @ [271:44] ==> value-parameter overwrite: Boolean = ... defined in kotlin.io.copyRecursively[ValueParameterDescriptorImpl]

'if (dstFile.isDirectory)
                            !dstFile.deleteRecursively()
                        else
                            !dstFile.delete()' @ [272:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'dstFile' @ [272:29] ==> val dstFile: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'isDirectory' @ [272:37] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'!' @ [273:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dstFile' @ [273:30] ==> val dstFile: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'deleteRecursively' @ [273:38] ==> public fun File.deleteRecursively(): Boolean defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'!' @ [275:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dstFile' @ [275:30] ==> val dstFile: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'delete' @ [275:38] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'stillExists' @ [278:25] ==> val stillExists: Boolean defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'invoke' @ [279:29] ==> public abstract operator fun invoke(p1: File, p2: IOException): OnErrorAction defined in kotlin.Function2[FunctionInvokeDescriptor]

'dstFile' @ [279:37] ==> val dstFile: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'FileAlreadyExistsException' @ [279:46] ==> public constructor FileAlreadyExistsException(file: File, other: File? = ..., reason: String? = ...) defined in kotlin.io.FileAlreadyExistsException[ClassConstructorDescriptorImpl]

'src' @ [279:80] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'dstFile' @ [280:45] ==> val dstFile: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'TERMINATE' @ [281:104] ==> enum entry TERMINATE defined in kotlin.io.OnErrorAction[FakeCallableDescriptorForObject]

'if (src.isDirectory) {
                    dstFile.mkdirs()
                } else {
                    if (src.copyTo(dstFile, overwrite).length() != src.length()) {
                        if (onError(src, IOException("Source file wasn't copied completely, length of destination file differs.")) == OnErrorAction.TERMINATE)
                            return false
                    }
                }' @ [288:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'src' @ [288:21] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'isDirectory' @ [288:25] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'dstFile' @ [289:21] ==> val dstFile: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'mkdirs' @ [289:29] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'src' @ [291:25] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'copyTo' @ [291:29] ==> public fun File.copyTo(target: File, overwrite: Boolean = ..., bufferSize: Int = ...): File defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'dstFile' @ [291:36] ==> val dstFile: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'overwrite' @ [291:45] ==> value-parameter overwrite: Boolean = ... defined in kotlin.io.copyRecursively[ValueParameterDescriptorImpl]

'length' @ [291:56] ==> public open fun length(): Long defined in java.io.File[JavaMethodDescriptor]

'src' @ [291:68] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'length' @ [291:72] ==> public open fun length(): Long defined in java.io.File[JavaMethodDescriptor]

'invoke' @ [292:29] ==> public abstract operator fun invoke(p1: File, p2: IOException): OnErrorAction defined in kotlin.Function2[FunctionInvokeDescriptor]

'src' @ [292:37] ==> val src: File defined in kotlin.io.copyRecursively[LocalVariableDescriptor]

'IOException' @ [292:42] ==> public constructor IOException(p0: (String..String?)) defined in java.io.IOException[JavaClassConstructorDescriptor]

'TERMINATE' @ [292:149] ==> enum entry TERMINATE defined in kotlin.io.OnErrorAction[FakeCallableDescriptorForObject]

'walkBottomUp' @ [310:48] ==> public fun File.walkBottomUp(): FileTreeWalk defined in kotlin.io in file FileTreeWalk.kt[SimpleFunctionDescriptorImpl]

'fold' @ [310:63] ==> public inline fun <T, R> Sequence<File>.fold(initial: Boolean, operation: (Boolean, File) -> Boolean): Boolean defined in kotlin.sequences[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> File
    <R> -> Boolean

'it' @ [310:88] ==> value-parameter it: File defined in kotlin.io.deleteRecursively.<anonymous>[ValueParameterDescriptorImpl]

'delete' @ [310:91] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'!' @ [310:103] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [310:104] ==> value-parameter it: File defined in kotlin.io.deleteRecursively.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [310:107] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'res' @ [310:120] ==> value-parameter res: Boolean defined in kotlin.io.deleteRecursively.<anonymous>[ValueParameterDescriptorImpl]

'toComponents' @ [320:22] ==> internal fun File.toComponents(): FilePathComponents defined in kotlin.io in file FilePathComponents.kt[SimpleFunctionDescriptorImpl]

'other' @ [321:27] ==> value-parameter other: File defined in kotlin.io.startsWith[ValueParameterDescriptorImpl]

'toComponents' @ [321:33] ==> internal fun File.toComponents(): FilePathComponents defined in kotlin.io in file FilePathComponents.kt[SimpleFunctionDescriptorImpl]

'components' @ [322:9] ==> val components: FilePathComponents defined in kotlin.io.startsWith[LocalVariableDescriptor]

'root' @ [322:20] ==> public final val root: File defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'otherComponents' @ [322:28] ==> val otherComponents: FilePathComponents defined in kotlin.io.startsWith[LocalVariableDescriptor]

'root' @ [322:44] ==> public final val root: File defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'if (components.size < otherComponents.size) false
    else components.segments.subList(0, otherComponents.size).equals(otherComponents.segments)' @ [324:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'components' @ [324:16] ==> val components: FilePathComponents defined in kotlin.io.startsWith[LocalVariableDescriptor]

'size' @ [324:27] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'otherComponents' @ [324:34] ==> val otherComponents: FilePathComponents defined in kotlin.io.startsWith[LocalVariableDescriptor]

'size' @ [324:50] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'components' @ [325:10] ==> val components: FilePathComponents defined in kotlin.io.startsWith[LocalVariableDescriptor]

'segments' @ [325:21] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'subList' @ [325:30] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<File> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'otherComponents' @ [325:41] ==> val otherComponents: FilePathComponents defined in kotlin.io.startsWith[LocalVariableDescriptor]

'size' @ [325:57] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'equals' @ [325:63] ==> public open fun equals(other: Any?): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'otherComponents' @ [325:70] ==> val otherComponents: FilePathComponents defined in kotlin.io.startsWith[LocalVariableDescriptor]

'segments' @ [325:86] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'startsWith' @ [335:54] ==> public fun File.startsWith(other: File): Boolean defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'File' @ [335:65] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'other' @ [335:70] ==> value-parameter other: String defined in kotlin.io.startsWith[ValueParameterDescriptorImpl]

'toComponents' @ [347:22] ==> internal fun File.toComponents(): FilePathComponents defined in kotlin.io in file FilePathComponents.kt[SimpleFunctionDescriptorImpl]

'other' @ [348:27] ==> value-parameter other: File defined in kotlin.io.endsWith[ValueParameterDescriptorImpl]

'toComponents' @ [348:33] ==> internal fun File.toComponents(): FilePathComponents defined in kotlin.io in file FilePathComponents.kt[SimpleFunctionDescriptorImpl]

'otherComponents' @ [349:9] ==> val otherComponents: FilePathComponents defined in kotlin.io.endsWith[LocalVariableDescriptor]

'isRooted' @ [349:25] ==> public final val isRooted: Boolean defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'this' @ [350:16] ==> <this> defined in kotlin.io.endsWith[ReceiverParameterDescriptorImpl]

'other' @ [350:24] ==> value-parameter other: File defined in kotlin.io.endsWith[ValueParameterDescriptorImpl]

'components' @ [351:17] ==> val components: FilePathComponents defined in kotlin.io.endsWith[LocalVariableDescriptor]

'size' @ [351:28] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'otherComponents' @ [351:35] ==> val otherComponents: FilePathComponents defined in kotlin.io.endsWith[LocalVariableDescriptor]

'size' @ [351:51] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'if (shift < 0) false
    else components.segments.subList(shift, components.size).equals(otherComponents.segments)' @ [352:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'shift' @ [352:16] ==> val shift: Int defined in kotlin.io.endsWith[LocalVariableDescriptor]

'components' @ [353:10] ==> val components: FilePathComponents defined in kotlin.io.endsWith[LocalVariableDescriptor]

'segments' @ [353:21] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'subList' @ [353:30] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<File> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'shift' @ [353:38] ==> val shift: Int defined in kotlin.io.endsWith[LocalVariableDescriptor]

'components' @ [353:45] ==> val components: FilePathComponents defined in kotlin.io.endsWith[LocalVariableDescriptor]

'size' @ [353:56] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'equals' @ [353:62] ==> public open fun equals(other: Any?): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'otherComponents' @ [353:69] ==> val otherComponents: FilePathComponents defined in kotlin.io.endsWith[LocalVariableDescriptor]

'segments' @ [353:85] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'endsWith' @ [364:52] ==> public fun File.endsWith(other: File): Boolean defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'File' @ [364:61] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'other' @ [364:66] ==> value-parameter other: String defined in kotlin.io.endsWith[ValueParameterDescriptorImpl]

'with' @ [373:11] ==> @InlineOnly public inline fun <T, R> with(receiver: FilePathComponents, block: FilePathComponents.() -> File): File defined in kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> FilePathComponents
    <R> -> File

'toComponents' @ [373:17] ==> internal fun File.toComponents(): FilePathComponents defined in kotlin.io in file FilePathComponents.kt[SimpleFunctionDescriptorImpl]

'root' @ [373:35] ==> public final val root: File defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'resolve' @ [373:40] ==> public fun File.resolve(relative: String): File defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'segments' @ [373:48] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'normalize' @ [373:57] ==> private fun List<File>.normalize(): List<File> defined in kotlin.io[SimpleFunctionDescriptorImpl]

'joinToString' @ [373:69] ==> public fun <T> Iterable<File>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((File) -> CharSequence)? = ...): String defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> File

'separator' @ [373:87] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'FilePathComponents' @ [376:11] ==> internal constructor FilePathComponents(root: File, segments: List<File>) defined in kotlin.io.FilePathComponents[ClassConstructorDescriptorImpl]

'root' @ [376:30] ==> public final val root: File defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'segments' @ [376:36] ==> public final val segments: List<File> defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'normalize' @ [376:45] ==> private fun List<File>.normalize(): List<File> defined in kotlin.io[SimpleFunctionDescriptorImpl]

'ArrayList' @ [379:35] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'this' @ [379:45] ==> <this> defined in kotlin.io.normalize[ReceiverParameterDescriptorImpl]

'size' @ [379:50] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'this' @ [380:18] ==> <this> defined in kotlin.io.normalize[ReceiverParameterDescriptorImpl]

'when (file.name) {
            "." -> {}
            ".." -> if (!list.isEmpty() && list.last().name != "..") list.removeAt(list.size - 1) else list.add(file)
            else -> list.add(file)
        }' @ [381:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'file' @ [381:15] ==> val file: File defined in kotlin.io.normalize[LocalVariableDescriptor]

'name' @ [381:20] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'if (!list.isEmpty() && list.last().name != "..") list.removeAt(list.size - 1) else list.add(file)' @ [383:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: {Comparable<{File & Boolean}> & Serializable}, elseBranch: {Comparable<{File & Boolean}> & Serializable}): {Comparable<{File & Boolean}> & Serializable}[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> {Comparable<{File & Boolean}> & Serializable}

'!' @ [383:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'list' @ [383:26] ==> val list: MutableList<File> defined in kotlin.io.normalize[LocalVariableDescriptor]

'isEmpty' @ [383:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'list' @ [383:44] ==> val list: MutableList<File> defined in kotlin.io.normalize[LocalVariableDescriptor]

'last' @ [383:49] ==> public fun <T> List<File>.last(): File defined in kotlin.collections[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> File

'name' @ [383:56] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'list' @ [383:70] ==> val list: MutableList<File> defined in kotlin.io.normalize[LocalVariableDescriptor]

'removeAt' @ [383:75] ==> public abstract fun removeAt(index: Int): File defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'list' @ [383:84] ==> val list: MutableList<File> defined in kotlin.io.normalize[LocalVariableDescriptor]

'size' @ [383:89] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'list' @ [383:104] ==> val list: MutableList<File> defined in kotlin.io.normalize[LocalVariableDescriptor]

'add' @ [383:109] ==> public abstract fun add(element: File): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'file' @ [383:113] ==> val file: File defined in kotlin.io.normalize[LocalVariableDescriptor]

'list' @ [384:21] ==> val list: MutableList<File> defined in kotlin.io.normalize[LocalVariableDescriptor]

'add' @ [384:26] ==> public abstract fun add(element: File): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'file' @ [384:30] ==> val file: File defined in kotlin.io.normalize[LocalVariableDescriptor]

'list' @ [387:12] ==> val list: MutableList<File> defined in kotlin.io.normalize[LocalVariableDescriptor]

'relative' @ [400:9] ==> value-parameter relative: File defined in kotlin.io.resolve[ValueParameterDescriptorImpl]

'isRooted' @ [400:18] ==> public val File.isRooted: Boolean defined in kotlin.io in file FilePathComponents.kt[PropertyDescriptorImpl]

'relative' @ [401:16] ==> value-parameter relative: File defined in kotlin.io.resolve[ValueParameterDescriptorImpl]

'this' @ [402:20] ==> <this> defined in kotlin.io.resolve[ReceiverParameterDescriptorImpl]

'toString' @ [402:25] ==> public open fun toString(): String defined in java.io.File[JavaMethodDescriptor]

'if (baseName.isEmpty() || baseName.endsWith(File.separatorChar)) File(baseName + relative) else File(baseName + File.separatorChar + relative)' @ [403:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File, elseBranch: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File

'baseName' @ [403:16] ==> val baseName: String defined in kotlin.io.resolve[LocalVariableDescriptor]

'isEmpty' @ [403:25] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'baseName' @ [403:38] ==> val baseName: String defined in kotlin.io.resolve[LocalVariableDescriptor]

'endsWith' @ [403:47] ==> public fun CharSequence.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text in file Strings.kt[SimpleFunctionDescriptorImpl]

'separatorChar' @ [403:61] ==> public const final val separatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'File' @ [403:77] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'baseName' @ [403:82] ==> val baseName: String defined in kotlin.io.resolve[LocalVariableDescriptor]

'relative' @ [403:93] ==> value-parameter relative: File defined in kotlin.io.resolve[ValueParameterDescriptorImpl]

'File' @ [403:108] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'baseName' @ [403:113] ==> val baseName: String defined in kotlin.io.resolve[LocalVariableDescriptor]

'separatorChar' @ [403:129] ==> public const final val separatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'relative' @ [403:145] ==> value-parameter relative: File defined in kotlin.io.resolve[ValueParameterDescriptorImpl]

'resolve' @ [413:51] ==> public fun File.resolve(relative: File): File defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'File' @ [413:59] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'relative' @ [413:64] ==> value-parameter relative: String defined in kotlin.io.resolve[ValueParameterDescriptorImpl]

'this' @ [423:22] ==> <this> defined in kotlin.io.resolveSibling[ReceiverParameterDescriptorImpl]

'toComponents' @ [423:27] ==> internal fun File.toComponents(): FilePathComponents defined in kotlin.io in file FilePathComponents.kt[SimpleFunctionDescriptorImpl]

'if (components.size == 0) File("..") else components.subPath(0, components.size - 1)' @ [424:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File, elseBranch: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File

'components' @ [424:29] ==> val components: FilePathComponents defined in kotlin.io.resolveSibling[LocalVariableDescriptor]

'size' @ [424:40] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'File' @ [424:51] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'components' @ [424:67] ==> val components: FilePathComponents defined in kotlin.io.resolveSibling[LocalVariableDescriptor]

'subPath' @ [424:78] ==> public final fun subPath(beginIndex: Int, endIndex: Int): File defined in kotlin.io.FilePathComponents[SimpleFunctionDescriptorImpl]

'components' @ [424:89] ==> val components: FilePathComponents defined in kotlin.io.resolveSibling[LocalVariableDescriptor]

'size' @ [424:100] ==> public final val size: Int defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'components' @ [425:12] ==> val components: FilePathComponents defined in kotlin.io.resolveSibling[LocalVariableDescriptor]

'root' @ [425:23] ==> public final val root: File defined in kotlin.io.FilePathComponents[PropertyDescriptorImpl]

'resolve' @ [425:28] ==> public fun File.resolve(relative: File): File defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'parentSubPath' @ [425:36] ==> val parentSubPath: File defined in kotlin.io.resolveSibling[LocalVariableDescriptor]

'resolve' @ [425:51] ==> public fun File.resolve(relative: File): File defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'relative' @ [425:59] ==> value-parameter relative: File defined in kotlin.io.resolveSibling[ValueParameterDescriptorImpl]

'resolveSibling' @ [435:58] ==> public fun File.resolveSibling(relative: File): File defined in kotlin.io in file Utils.kt[SimpleFunctionDescriptorImpl]

'File' @ [435:73] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'relative' @ [435:78] ==> value-parameter relative: String defined in kotlin.io.resolveSibling[ValueParameterDescriptorImpl]

