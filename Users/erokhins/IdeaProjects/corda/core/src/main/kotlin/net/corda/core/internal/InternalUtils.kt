'cause' @ [30:44] ==> public open val cause: Throwable? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'rootCause' @ [30:51] ==> public val Throwable.rootCause: Throwable defined in net.corda.core.internal in file InternalUtils.kt[PropertyDescriptorImpl]

'this' @ [30:64] ==> <this> defined in net.corda.core.internal.rootCause[ReceiverParameterDescriptorImpl]

'StringWriter' @ [31:41] ==> public constructor StringWriter() defined in java.io.StringWriter[JavaClassConstructorDescriptor]

'also' @ [31:56] ==> @InlineOnly @SinceKotlin public inline fun <T> StringWriter.also(block: (StringWriter) -> Unit): StringWriter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StringWriter

'printStackTrace' @ [31:63] ==> public open fun printStackTrace(p0: (PrintWriter..PrintWriter?)): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'PrintWriter' @ [31:79] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'it' @ [31:91] ==> value-parameter it: StringWriter defined in net.corda.core.internal.getStackTraceAsString.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [31:98] ==> public open fun toString(): String defined in java.io.StringWriter[JavaMethodDescriptor]

'between' @ [33:71] ==> public open fun between(p0: (Temporal..Temporal?), p1: (Temporal..Temporal?)): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'this' @ [33:79] ==> <this> defined in net.corda.core.internal.until[ReceiverParameterDescriptorImpl]

'endExclusive' @ [33:85] ==> value-parameter endExclusive: Temporal defined in net.corda.core.internal.until[ValueParameterDescriptorImpl]

'dividedBy' @ [35:54] ==> public open fun dividedBy(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'divider' @ [35:64] ==> value-parameter divider: Long defined in net.corda.core.internal.div[ValueParameterDescriptorImpl]

'multipliedBy' @ [36:61] ==> public open fun multipliedBy(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'multiplicand' @ [36:74] ==> value-parameter multiplicand: Long defined in net.corda.core.internal.times[ValueParameterDescriptorImpl]

'resolve' @ [42:46] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'other' @ [42:54] ==> value-parameter other: String defined in net.corda.core.internal.div[ValueParameterDescriptorImpl]

'/' @ [43:48] ==> public operator fun Path.div(other: String): Path defined in net.corda.core.internal in file InternalUtils.kt[SimpleFunctionDescriptorImpl]

'get' @ [43:54] ==> public open fun get(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'this' @ [43:58] ==> <this> defined in net.corda.core.internal.div[ReceiverParameterDescriptorImpl]

'other' @ [43:66] ==> value-parameter other: String defined in net.corda.core.internal.div[ValueParameterDescriptorImpl]

'iterator' @ [50:20] ==> public abstract operator fun iterator(): Iterator<T> defined in kotlin.collections.Iterable[DeserializedSimpleFunctionDescriptor]

'iterator' @ [51:20] ==> val iterator: Iterator<T> defined in net.corda.core.internal.noneOrSingle[LocalVariableDescriptor]

'invoke' @ [52:13] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'single' @ [52:23] ==> val single: T defined in net.corda.core.internal.noneOrSingle[LocalVariableDescriptor]

'iterator' @ [53:20] ==> val iterator: Iterator<T> defined in net.corda.core.internal.noneOrSingle[LocalVariableDescriptor]

'hasNext' @ [53:29] ==> public abstract operator fun hasNext(): Boolean defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'invoke' @ [54:21] ==> public abstract operator fun invoke(p1: T): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'iterator' @ [54:31] ==> val iterator: Iterator<T> defined in net.corda.core.internal.noneOrSingle[LocalVariableDescriptor]

'next' @ [54:40] ==> public abstract operator fun next(): T defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'IllegalArgumentException' @ [54:55] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'single' @ [56:20] ==> val single: T defined in net.corda.core.internal.noneOrSingle[LocalVariableDescriptor]

'when (size) {
        0 -> null
        1 -> this[0]
        else -> throw IllegalArgumentException("List has more than one element.")
    }' @ [66:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: T?, entry1: T?, entry2: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> T?

'size' @ [66:18] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'this' @ [68:14] ==> <this> defined in net.corda.core.internal.noneOrSingle[ReceiverParameterDescriptorImpl]

'IllegalArgumentException' @ [69:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'when (size) {
        0 -> null
        1 -> this[0]
        else -> this[(Math.random() * size).toInt()]
    }' @ [75:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: T?, entry1: T?, entry2: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> T?

'size' @ [75:18] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'this' @ [77:14] ==> <this> defined in net.corda.core.internal.randomOrNull[ReceiverParameterDescriptorImpl]

'this' @ [78:17] ==> <this> defined in net.corda.core.internal.randomOrNull[ReceiverParameterDescriptorImpl]

'*' @ [78:23] ==> public final operator fun times(other: Int): Double defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'random' @ [78:28] ==> public open fun random(): Double defined in java.lang.Math[JavaMethodDescriptor]

'size' @ [78:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'toInt' @ [78:45] ==> public open fun toInt(): Int defined in kotlin.Double[DeserializedSimpleFunctionDescriptor]

'indexOf' @ [84:13] ==> public abstract fun indexOf(element: T): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'item' @ [84:21] ==> value-parameter item: T defined in net.corda.core.internal.indexOfOrThrow[ValueParameterDescriptorImpl]

'require' @ [85:5] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'i' @ [85:13] ==> val i: Int defined in net.corda.core.internal.indexOfOrThrow[LocalVariableDescriptor]

'-' @ [85:18] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'i' @ [86:12] ==> val i: Int defined in net.corda.core.internal.indexOfOrThrow[LocalVariableDescriptor]

'createDirectory' @ [89:72] ==> public open fun createDirectory(p0: (Path..Path?), vararg p1: (FileAttribute<*>..FileAttribute<*>?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [89:88] ==> <this> defined in net.corda.core.internal.createDirectory[ReceiverParameterDescriptorImpl]

'attrs' @ [89:95] ==> value-parameter vararg attrs: FileAttribute<*> defined in net.corda.core.internal.createDirectory[ValueParameterDescriptorImpl]

'createDirectories' @ [90:74] ==> public open fun createDirectories(p0: (Path..Path?), vararg p1: (FileAttribute<*>..FileAttribute<*>?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [90:92] ==> <this> defined in net.corda.core.internal.createDirectories[ReceiverParameterDescriptorImpl]

'attrs' @ [90:99] ==> value-parameter vararg attrs: FileAttribute<*> defined in net.corda.core.internal.createDirectories[ValueParameterDescriptorImpl]

'exists' @ [91:62] ==> public open fun exists(p0: (Path..Path?), vararg p1: (LinkOption..LinkOption?)): Boolean defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [91:69] ==> <this> defined in net.corda.core.internal.exists[ReceiverParameterDescriptorImpl]

'options' @ [91:76] ==> value-parameter vararg options: LinkOption defined in net.corda.core.internal.exists[ValueParameterDescriptorImpl]

'require' @ [93:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'targetDir' @ [93:13] ==> value-parameter targetDir: Path defined in net.corda.core.internal.copyToDirectory[ValueParameterDescriptorImpl]

'isDirectory' @ [93:23] ==> public fun Path.isDirectory(vararg options: LinkOption): Boolean defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]

'targetDir' @ [93:42] ==> value-parameter targetDir: Path defined in net.corda.core.internal.copyToDirectory[ValueParameterDescriptorImpl]

'targetDir' @ [94:22] ==> value-parameter targetDir: Path defined in net.corda.core.internal.copyToDirectory[ValueParameterDescriptorImpl]

'resolve' @ [94:32] ==> public abstract fun resolve(p0: (Path..Path?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'fileName' @ [94:40] ==> public final val Path.fileName: (Path..Path?)[MyPropertyDescriptor]

'copy' @ [95:11] ==> public open fun copy(p0: (Path..Path?), p1: (Path..Path?), vararg p2: (CopyOption..CopyOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [95:16] ==> <this> defined in net.corda.core.internal.copyToDirectory[ReceiverParameterDescriptorImpl]

'targetFile' @ [95:22] ==> val targetFile: (Path..Path?) defined in net.corda.core.internal.copyToDirectory[LocalVariableDescriptor]

'options' @ [95:35] ==> value-parameter vararg options: CopyOption defined in net.corda.core.internal.copyToDirectory[ValueParameterDescriptorImpl]

'targetFile' @ [96:12] ==> val targetFile: (Path..Path?) defined in net.corda.core.internal.copyToDirectory[LocalVariableDescriptor]

'move' @ [98:73] ==> public open fun move(p0: (Path..Path?), p1: (Path..Path?), vararg p2: (CopyOption..CopyOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [98:78] ==> <this> defined in net.corda.core.internal.moveTo[ReceiverParameterDescriptorImpl]

'target' @ [98:84] ==> value-parameter target: Path defined in net.corda.core.internal.moveTo[ValueParameterDescriptorImpl]

'options' @ [98:93] ==> value-parameter vararg options: CopyOption defined in net.corda.core.internal.moveTo[ValueParameterDescriptorImpl]

'isRegularFile' @ [99:69] ==> public open fun isRegularFile(p0: (Path..Path?), vararg p1: (LinkOption..LinkOption?)): Boolean defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [99:83] ==> <this> defined in net.corda.core.internal.isRegularFile[ReceiverParameterDescriptorImpl]

'options' @ [99:90] ==> value-parameter vararg options: LinkOption defined in net.corda.core.internal.isRegularFile[ValueParameterDescriptorImpl]

'isDirectory' @ [100:67] ==> public open fun isDirectory(p0: (Path..Path?), vararg p1: (LinkOption..LinkOption?)): Boolean defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [100:79] ==> <this> defined in net.corda.core.internal.isDirectory[ReceiverParameterDescriptorImpl]

'options' @ [100:86] ==> value-parameter vararg options: LinkOption defined in net.corda.core.internal.isDirectory[ValueParameterDescriptorImpl]

'size' @ [101:42] ==> public open fun size(p0: (Path..Path?)): Long defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [101:47] ==> <this> defined in net.corda.core.internal.size[ReceiverParameterDescriptorImpl]

'list' @ [102:65] ==> public open fun list(p0: (Path..Path?)): (Stream<(Path..Path?)>..Stream<(Path..Path?)>?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [102:70] ==> <this> defined in net.corda.core.internal.list[ReceiverParameterDescriptorImpl]

'use' @ [102:76] ==> @SinceKotlin @InlineOnly public inline fun <T : AutoCloseable?, R> (Stream<(Path..Path?)>..Stream<(Path..Path?)>?).use(block: ((Stream<(Path..Path?)>..Stream<(Path..Path?)>?)) -> R): R defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : AutoCloseable?> -> (java.util.stream.Stream<(java.nio.file.Path..java.nio.file.Path?)>..java.util.stream.Stream<(java.nio.file.Path..java.nio.file.Path?)>?)
    <R> -> R

'block' @ [102:80] ==> value-parameter block: (Stream<Path>) -> R defined in net.corda.core.internal.list[ValueParameterDescriptorImpl]

'deleteIfExists' @ [103:44] ==> public open fun deleteIfExists(p0: (Path..Path?)): Boolean defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [103:59] ==> <this> defined in net.corda.core.internal.deleteIfExists[ReceiverParameterDescriptorImpl]

'readAllBytes' @ [104:39] ==> public open fun readAllBytes(p0: (Path..Path?)): (ByteArray..ByteArray?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [104:52] ==> <this> defined in net.corda.core.internal.readAll[ReceiverParameterDescriptorImpl]

'newInputStream' @ [105:92] ==> public open fun newInputStream(p0: (Path..Path?), vararg p1: (OpenOption..OpenOption?)): (InputStream..InputStream?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [105:107] ==> <this> defined in net.corda.core.internal.read[ReceiverParameterDescriptorImpl]

'options' @ [105:114] ==> value-parameter vararg options: OpenOption defined in net.corda.core.internal.read[ValueParameterDescriptorImpl]

'use' @ [105:123] ==> @InlineOnly public inline fun <T : Closeable?, R> (InputStream..InputStream?).use(block: ((InputStream..InputStream?)) -> R): R defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.io.InputStream..java.io.InputStream?)
    <R> -> R

'block' @ [105:127] ==> value-parameter block: (InputStream) -> R defined in net.corda.core.internal.read[ValueParameterDescriptorImpl]

'emptyArray' @ [106:81] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<OpenOption> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> OpenOption

'createDirs' @ [107:9] ==> value-parameter createDirs: Boolean = ... defined in net.corda.core.internal.write[ValueParameterDescriptorImpl]

'normalize' @ [108:9] ==> public abstract fun normalize(): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'parent' @ [108:21] ==> public final val Path.parent: (Path..Path?)[MyPropertyDescriptor]

'createDirectories' @ [108:29] ==> public fun Path.createDirectories(vararg attrs: FileAttribute<*>): Path defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]

'newOutputStream' @ [110:11] ==> public open fun newOutputStream(p0: (Path..Path?), vararg p1: (OpenOption..OpenOption?)): (OutputStream..OutputStream?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [110:27] ==> <this> defined in net.corda.core.internal.write[ReceiverParameterDescriptorImpl]

'options' @ [110:34] ==> value-parameter vararg options: OpenOption = ... defined in net.corda.core.internal.write[ValueParameterDescriptorImpl]

'use' @ [110:43] ==> @InlineOnly public inline fun <T : Closeable?, R> (OutputStream..OutputStream?).use(block: ((OutputStream..OutputStream?)) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.io.OutputStream..java.io.OutputStream?)
    <R> -> Unit

'block' @ [110:47] ==> value-parameter block: (OutputStream) -> Unit defined in net.corda.core.internal.write[ValueParameterDescriptorImpl]

'UTF_8' @ [113:50] ==> public final val UTF_8: (Charset..Charset?) defined in java.nio.charset.StandardCharsets[JavaPropertyDescriptor]

'lines' @ [113:98] ==> public open fun lines(p0: (Path..Path?), p1: (Charset..Charset?)): (Stream<(String..String?)>..Stream<(String..String?)>?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [113:104] ==> <this> defined in net.corda.core.internal.readLines[ReceiverParameterDescriptorImpl]

'charset' @ [113:110] ==> value-parameter charset: Charset = ... defined in net.corda.core.internal.readLines[ValueParameterDescriptorImpl]

'use' @ [113:119] ==> @SinceKotlin @InlineOnly public inline fun <T : AutoCloseable?, R> (Stream<(String..String?)>..Stream<(String..String?)>?).use(block: ((Stream<(String..String?)>..Stream<(String..String?)>?)) -> R): R defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : AutoCloseable?> -> (java.util.stream.Stream<(kotlin.String..kotlin.String?)>..java.util.stream.Stream<(kotlin.String..kotlin.String?)>?)
    <R> -> R

'block' @ [113:123] ==> value-parameter block: (Stream<String>) -> R defined in net.corda.core.internal.readLines[ValueParameterDescriptorImpl]

'UTF_8' @ [114:42] ==> public final val UTF_8: (Charset..Charset?) defined in java.nio.charset.StandardCharsets[JavaPropertyDescriptor]

'readAllLines' @ [114:71] ==> public open fun readAllLines(p0: (Path..Path?), p1: (Charset..Charset?)): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [114:84] ==> <this> defined in net.corda.core.internal.readAllLines[ReceiverParameterDescriptorImpl]

'charset' @ [114:90] ==> value-parameter charset: Charset = ... defined in net.corda.core.internal.readAllLines[ValueParameterDescriptorImpl]

'UTF_8' @ [115:71] ==> public final val UTF_8: (Charset..Charset?) defined in java.nio.charset.StandardCharsets[JavaPropertyDescriptor]

'write' @ [115:120] ==> public open fun write(p0: (Path..Path?), p1: (MutableIterable<(CharSequence..CharSequence?)>..Iterable<(CharSequence..CharSequence?)>?), p2: (Charset..Charset?), vararg p3: (OpenOption..OpenOption?)): (Path..Path?) defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [115:126] ==> <this> defined in net.corda.core.internal.writeLines[ReceiverParameterDescriptorImpl]

'lines' @ [115:132] ==> value-parameter lines: Iterable<CharSequence> defined in net.corda.core.internal.writeLines[ValueParameterDescriptorImpl]

'charset' @ [115:139] ==> value-parameter charset: Charset = ... defined in net.corda.core.internal.writeLines[ValueParameterDescriptorImpl]

'options' @ [115:149] ==> value-parameter vararg options: OpenOption defined in net.corda.core.internal.writeLines[ValueParameterDescriptorImpl]

'copy' @ [117:80] ==> public open fun copy(p0: (InputStream..InputStream?), p1: (Path..Path?), vararg p2: (CopyOption..CopyOption?)): Long defined in java.nio.file.Files[JavaMethodDescriptor]

'this' @ [117:85] ==> <this> defined in net.corda.core.internal.copyTo[ReceiverParameterDescriptorImpl]

'target' @ [117:91] ==> value-parameter target: Path defined in net.corda.core.internal.copyTo[ValueParameterDescriptorImpl]

'options' @ [117:100] ==> value-parameter vararg options: CopyOption defined in net.corda.core.internal.copyTo[ValueParameterDescriptorImpl]

'if (length <= maxWidth) this else take(maxWidth - 1) + "…"' @ [119:48] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'length' @ [119:52] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'maxWidth' @ [119:62] ==> value-parameter maxWidth: Int defined in net.corda.core.internal.abbreviate[ValueParameterDescriptorImpl]

'this' @ [119:72] ==> <this> defined in net.corda.core.internal.abbreviate[ReceiverParameterDescriptorImpl]

'take' @ [119:82] ==> public fun String.take(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'maxWidth' @ [119:87] ==> value-parameter maxWidth: Int defined in net.corda.core.internal.abbreviate[ValueParameterDescriptorImpl]

'fold' @ [122:46] ==> public inline fun <T, R> Iterable<BigDecimal>.fold(initial: (BigDecimal..BigDecimal?), operation: ((BigDecimal..BigDecimal?), BigDecimal) -> (BigDecimal..BigDecimal?)): (BigDecimal..BigDecimal?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BigDecimal
    <R> -> (java.math.BigDecimal..java.math.BigDecimal?)

'ZERO' @ [122:62] ==> public final val ZERO: (BigDecimal..BigDecimal?) defined in java.math.BigDecimal[JavaPropertyDescriptor]

'a' @ [122:78] ==> value-parameter a: (BigDecimal..BigDecimal?) defined in net.corda.core.internal.sum.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [122:82] ==> value-parameter b: BigDecimal defined in net.corda.core.internal.sum.<anonymous>[ValueParameterDescriptorImpl]

'create' @ [129:34] ==> public open fun <T : (Any..Any?)> create(): (UnicastSubject<(T..T?)>..UnicastSubject<(T..T?)>?) defined in rx.subjects.UnicastSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'subscribe' @ [130:24] ==> public final fun subscribe(p0: (Observer<in (T..T?)>..Observer<in (T..T?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'subject' @ [130:34] ==> val subject: (UnicastSubject<(T..T?)>..UnicastSubject<(T..T?)>?) defined in net.corda.core.internal.bufferUntilSubscribed[LocalVariableDescriptor]

'subject' @ [131:12] ==> val subject: (UnicastSubject<(T..T?)>..UnicastSubject<(T..T?)>?) defined in net.corda.core.internal.bufferUntilSubscribed[LocalVariableDescriptor]

'doOnUnsubscribe' @ [131:20] ==> public final fun doOnUnsubscribe(p0: (() -> Unit..(() -> Unit)?)): (Observable<(T..T?)>..Observable<(T..T?)>?) defined in rx.subjects.UnicastSubject[MyFunctionDescriptor]

'subscription' @ [131:38] ==> val subscription: (Subscription..Subscription?) defined in net.corda.core.internal.bufferUntilSubscribed[LocalVariableDescriptor]

'unsubscribe' @ [131:51] ==> public abstract fun unsubscribe(): Unit defined in rx.Subscription[JavaMethodDescriptor]

'create' @ [136:34] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(T..T?)>..PublishSubject<(T..T?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'subject' @ [137:5] ==> val subject: (PublishSubject<(T..T?)>..PublishSubject<(T..T?)>?) defined in net.corda.core.internal.tee[LocalVariableDescriptor]

'subscribe' @ [137:13] ==> public final fun subscribe(p0: (Observer<in (T..T?)>..Observer<in (T..T?)>?)): (Subscription..Subscription?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]

'this' @ [137:23] ==> <this> defined in net.corda.core.internal.tee[ReceiverParameterDescriptorImpl]

'teeTo' @ [138:5] ==> value-parameter vararg teeTo: Observer<T> defined in net.corda.core.internal.tee[ValueParameterDescriptorImpl]

'forEach' @ [138:11] ==> public inline fun <T> Array<out Observer<T>>.forEach(action: (Observer<T>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Observer<T>

'subject' @ [138:21] ==> val subject: (PublishSubject<(T..T?)>..PublishSubject<(T..T?)>?) defined in net.corda.core.internal.tee[LocalVariableDescriptor]

'subscribe' @ [138:29] ==> public final fun subscribe(p0: (Observer<in (T..T?)>..Observer<in (T..T?)>?)): (Subscription..Subscription?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]

'it' @ [138:39] ==> value-parameter it: Observer<T> defined in net.corda.core.internal.tee.<anonymous>[ValueParameterDescriptorImpl]

'subject' @ [139:12] ==> val subject: (PublishSubject<(T..T?)>..PublishSubject<(T..T?)>?) defined in net.corda.core.internal.tee[LocalVariableDescriptor]

'nanoTime' @ [144:24] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'invoke' @ [145:5] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'nanoTime' @ [146:22] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'ofNanos' @ [147:21] ==> public open fun ofNanos(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'end' @ [147:29] ==> val end: Long defined in net.corda.core.internal.elapsedTime[LocalVariableDescriptor]

'start' @ [147:35] ==> val start: Long defined in net.corda.core.internal.elapsedTime[LocalVariableDescriptor]

'logElapsedTime' @ [151:66] ==> public fun <T> logElapsedTime(label: String, logger: Logger? = ..., body: () -> T): T defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'label' @ [151:81] ==> value-parameter label: String defined in net.corda.core.internal.logElapsedTime[ValueParameterDescriptorImpl]

'this' @ [151:88] ==> <this> defined in net.corda.core.internal.logElapsedTime[ReceiverParameterDescriptorImpl]

'body' @ [151:94] ==> value-parameter body: () -> T defined in net.corda.core.internal.logElapsedTime[ValueParameterDescriptorImpl]

'nanoTime' @ [157:22] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'invoke' @ [159:16] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'ofNanos' @ [161:32] ==> public open fun ofNanos(p0: Long): (Duration..Duration?) defined in java.time.Duration[JavaMethodDescriptor]

'-' @ [161:40] ==> public final operator fun minus(other: Long): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'nanoTime' @ [161:47] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'now' @ [161:60] ==> val now: Long defined in net.corda.core.internal.logElapsedTime[LocalVariableDescriptor]

'toMillis' @ [161:65] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'if (logger != null)
            logger.info("$label took $elapsed msec")
        else
            println("$label took $elapsed msec")' @ [162:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'logger' @ [162:13] ==> value-parameter logger: Logger? = ... defined in net.corda.core.internal.logElapsedTime[ValueParameterDescriptorImpl]

'logger' @ [163:13] ==> value-parameter logger: Logger? = ... defined in net.corda.core.internal.logElapsedTime[ValueParameterDescriptorImpl]

'info' @ [163:20] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'label' @ [163:27] ==> value-parameter label: String defined in net.corda.core.internal.logElapsedTime[ValueParameterDescriptorImpl]

'elapsed' @ [163:39] ==> val elapsed: Long defined in net.corda.core.internal.logElapsedTime[LocalVariableDescriptor]

'println' @ [165:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'label' @ [165:23] ==> value-parameter label: String defined in net.corda.core.internal.logElapsedTime[ValueParameterDescriptorImpl]

'elapsed' @ [165:35] ==> val elapsed: Long defined in net.corda.core.internal.logElapsedTime[LocalVariableDescriptor]

'X509CertificateHolder' @ [169:57] ==> public constructor X509CertificateHolder(p0: (ByteArray..ByteArray?)) defined in org.bouncycastle.cert.X509CertificateHolder[JavaClassConstructorDescriptor]

'encoded' @ [169:79] ==> public final val Certificate.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'X509CertificateHolder' @ [170:58] ==> public constructor X509CertificateHolder(p0: (ByteArray..ByteArray?)) defined in org.bouncycastle.cert.X509CertificateHolder[JavaClassConstructorDescriptor]

'encoded' @ [170:80] ==> public final val Certificate.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'toByteArray' @ [174:17] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'InputStreamAndHash' @ [175:12] ==> public constructor InputStreamAndHash(inputStream: InputStream, sha256: SecureHash.SHA256) defined in net.corda.core.internal.InputStreamAndHash[ClassConstructorDescriptorImpl]

'ByteArrayInputStream' @ [175:31] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'bytes' @ [175:52] ==> val bytes: (ByteArray..ByteArray?) defined in net.corda.core.internal.toInputStreamAndHash[LocalVariableDescriptor]

'bytes' @ [175:60] ==> val bytes: (ByteArray..ByteArray?) defined in net.corda.core.internal.toInputStreamAndHash[LocalVariableDescriptor]

'sha256' @ [175:66] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto in file SecureHash.kt[SimpleFunctionDescriptorImpl]

'require' @ [186:13] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'numOfExpectedBytes' @ [186:21] ==> value-parameter numOfExpectedBytes: Int defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip[ValueParameterDescriptorImpl]

'ByteArrayOutputStream' @ [187:24] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'ZipOutputStream' @ [188:13] ==> public constructor ZipOutputStream(p0: (OutputStream..OutputStream?)) defined in java.util.zip.ZipOutputStream[JavaClassConstructorDescriptor]

'baos' @ [188:29] ==> val baos: ByteArrayOutputStream defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip[LocalVariableDescriptor]

'use' @ [188:35] ==> @InlineOnly public inline fun <T : Closeable?, R> ZipOutputStream.use(block: (ZipOutputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> ZipOutputStream
    <R> -> Unit

'ByteArray' @ [190:29] ==> public constructor ByteArray(size: Int, init: (Int) -> Byte) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'arraySize' @ [190:39] ==> val arraySize: Int defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip.<anonymous>[LocalVariableDescriptor]

'content' @ [190:52] ==> value-parameter content: Byte defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip[ValueParameterDescriptorImpl]

'/' @ [191:25] ==> public final operator fun div(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'numOfExpectedBytes' @ [191:26] ==> value-parameter numOfExpectedBytes: Int defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip[ValueParameterDescriptorImpl]

'arraySize' @ [191:52] ==> val arraySize: Int defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip.<anonymous>[LocalVariableDescriptor]

'zos' @ [192:17] ==> value-parameter zos: ZipOutputStream defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip.<anonymous>[ValueParameterDescriptorImpl]

'setLevel' @ [192:21] ==> public open fun setLevel(p0: Int): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'NO_COMPRESSION' @ [192:39] ==> public const final val NO_COMPRESSION: Int defined in java.util.zip.Deflater[JavaPropertyDescriptor]

'zos' @ [193:17] ==> value-parameter zos: ZipOutputStream defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip.<anonymous>[ValueParameterDescriptorImpl]

'putNextEntry' @ [193:21] ==> public open fun putNextEntry(p0: (ZipEntry..ZipEntry?)): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'ZipEntry' @ [193:34] ==> public constructor ZipEntry(p0: (String..String?)) defined in java.util.zip.ZipEntry[JavaClassConstructorDescriptor]

'until' @ [194:27] ==> public infix fun Int.until(to: Int): IntRange defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'n' @ [194:35] ==> val n: Int defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip.<anonymous>[LocalVariableDescriptor]

'zos' @ [195:21] ==> value-parameter zos: ZipOutputStream defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip.<anonymous>[ValueParameterDescriptorImpl]

'write' @ [195:25] ==> public open fun write(p0: (ByteArray..ByteArray?), p1: Int, p2: Int): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'bytes' @ [195:31] ==> val bytes: ByteArray defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip.<anonymous>[LocalVariableDescriptor]

'arraySize' @ [195:41] ==> val arraySize: Int defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip.<anonymous>[LocalVariableDescriptor]

'zos' @ [197:17] ==> value-parameter zos: ZipOutputStream defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip.<anonymous>[ValueParameterDescriptorImpl]

'closeEntry' @ [197:21] ==> public open fun closeEntry(): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'baos' @ [199:20] ==> val baos: ByteArrayOutputStream defined in net.corda.core.internal.InputStreamAndHash.Companion.createInMemoryTestZip[LocalVariableDescriptor]

'toInputStreamAndHash' @ [199:25] ==> public fun ByteArrayOutputStream.toInputStreamAndHash(): InputStreamAndHash defined in net.corda.core.internal in file InternalUtils.kt[SimpleFunctionDescriptorImpl]

'this@toJavaIterator' @ [206:34] ==> <this> defined in net.corda.core.internal.toJavaIterator[ReceiverParameterDescriptorImpl]

'nextInt' @ [206:54] ==> public abstract fun nextInt(): Int defined in kotlin.collections.IntIterator[DeserializedSimpleFunctionDescriptor]

'this@toJavaIterator' @ [207:34] ==> <this> defined in net.corda.core.internal.toJavaIterator[ReceiverParameterDescriptorImpl]

'hasNext' @ [207:54] ==> public abstract fun hasNext(): Boolean defined in kotlin.collections.IntIterator[DeserializedSimpleFunctionDescriptor]

'UnsupportedOperationException' @ [208:39] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'spliterator' @ [213:36] ==> public open fun spliterator(p0: (PrimitiveIterator.OfInt..PrimitiveIterator.OfInt?), p1: Long, p2: Int): (Spliterator.OfInt..Spliterator.OfInt?) defined in java.util.Spliterators[JavaMethodDescriptor]

'iterator' @ [214:13] ==> public open fun iterator(): IntIterator defined in kotlin.ranges.IntProgression[DeserializedSimpleFunctionDescriptor]

'toJavaIterator' @ [214:24] ==> public fun IntIterator.toJavaIterator(): PrimitiveIterator.OfInt defined in net.corda.core.internal in file InternalUtils.kt[SimpleFunctionDescriptorImpl]

'+' @ [215:14] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'/' @ [215:18] ==> public final operator fun div(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'last' @ [215:19] ==> public final val last: Int defined in kotlin.ranges.IntProgression[DeserializedPropertyDescriptor]

'first' @ [215:26] ==> public final val first: Int defined in kotlin.ranges.IntProgression[DeserializedPropertyDescriptor]

'step' @ [215:35] ==> public final val step: Int defined in kotlin.ranges.IntProgression[DeserializedPropertyDescriptor]

'toLong' @ [215:41] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SUBSIZED' @ [216:13] ==> public const final val SUBSIZED: Int defined in java.util.Spliterator[JavaPropertyDescriptor]

'IMMUTABLE' @ [216:25] ==> public const final val IMMUTABLE: Int defined in java.util.Spliterator[JavaPropertyDescriptor]

'NONNULL' @ [216:38] ==> public const final val NONNULL: Int defined in java.util.Spliterator[JavaPropertyDescriptor]

'SIZED' @ [216:49] ==> public const final val SIZED: Int defined in java.util.Spliterator[JavaPropertyDescriptor]

'ORDERED' @ [216:58] ==> public const final val ORDERED: Int defined in java.util.Spliterator[JavaPropertyDescriptor]

'SORTED' @ [216:69] ==> public const final val SORTED: Int defined in java.util.Spliterator[JavaPropertyDescriptor]

'DISTINCT' @ [216:79] ==> public const final val DISTINCT: Int defined in java.util.Spliterator[JavaPropertyDescriptor]

'if (step > 0) spliterator else object : Spliterator.OfInt by spliterator {
        override fun getComparator() = Comparator.reverseOrder<Int>()
    }' @ [218:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Spliterator.OfInt, elseBranch: Spliterator.OfInt): Spliterator.OfInt[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> OfInt

'step' @ [218:16] ==> public final val step: Int defined in kotlin.ranges.IntProgression[DeserializedPropertyDescriptor]

'spliterator' @ [218:26] ==> val spliterator: (Spliterator.OfInt..Spliterator.OfInt?) defined in net.corda.core.internal.toSpliterator[LocalVariableDescriptor]

'spliterator' @ [218:73] ==> val spliterator: (Spliterator.OfInt..Spliterator.OfInt?) defined in net.corda.core.internal.toSpliterator[LocalVariableDescriptor]

'reverseOrder' @ [219:51] ==> public open fun <T : (Comparable<(Int..Int?)>..Comparable<(Int..Int?)>?)> reverseOrder(): (Comparator<(Int..Int?)>..Comparator<(Int..Int?)>?) defined in java.util.Comparator[JavaMethodDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> Int

'intStream' @ [223:81] ==> public open fun intStream(p0: (Spliterator.OfInt..Spliterator.OfInt?), p1: Boolean): (IntStream..IntStream?) defined in java.util.stream.StreamSupport[JavaMethodDescriptor]

'toSpliterator' @ [223:91] ==> private fun IntProgression.toSpliterator(): Spliterator.OfInt defined in net.corda.core.internal in file InternalUtils.kt[SimpleFunctionDescriptorImpl]

'parallel' @ [223:108] ==> value-parameter parallel: Boolean = ... defined in net.corda.core.internal.stream[ValueParameterDescriptorImpl]

'Suppress' @ [225:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'toArray' @ [226:55] ==> public final fun <A : (Any..Any?)> toArray(p0: ((Int) -> (Array<(T..T?)>..Array<out (T..T?)>?)..((Int) -> (Array<(T..T?)>..Array<out (T..T?)>?))?)): (Array<(T..T?)>..Array<out (T..T?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]
Inferred types:
    <A : (Any..Any?)> -> T

'arrayOfNulls' @ [226:73] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<T?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> T

'size' @ [226:89] ==> value-parameter size: Int defined in net.corda.core.internal.toTypedArray.<anonymous>[ValueParameterDescriptorImpl]

'if (isInstance(obj)) cast(obj) else null' @ [228:49] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'isInstance' @ [228:53] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'obj' @ [228:64] ==> value-parameter obj: Any defined in net.corda.core.internal.castIfPossible[ValueParameterDescriptorImpl]

'cast' @ [228:70] ==> public open fun cast(p0: (Any..Any?)): (T..T?) defined in java.lang.Class[JavaMethodDescriptor]

'obj' @ [228:75] ==> value-parameter obj: Any defined in net.corda.core.internal.castIfPossible[ValueParameterDescriptorImpl]

'DeclaredField' @ [231:64] ==> public constructor DeclaredField<T>(clazz: Class<*>, name: String, receiver: Any?) defined in net.corda.core.internal.DeclaredField[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'this' @ [231:78] ==> <this> defined in net.corda.core.internal.staticField[ReceiverParameterDescriptorImpl]

'name' @ [231:84] ==> value-parameter name: String defined in net.corda.core.internal.staticField[ValueParameterDescriptorImpl]

'DeclaredField' @ [233:65] ==> public constructor DeclaredField<T>(clazz: Class<*>, name: String, receiver: Any?) defined in net.corda.core.internal.DeclaredField[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'java' @ [233:79] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'name' @ [233:85] ==> value-parameter name: String defined in net.corda.core.internal.staticField[ValueParameterDescriptorImpl]

'DeclaredField' @ [235:61] ==> public constructor DeclaredField<T>(clazz: Class<*>, name: String, receiver: Any?) defined in net.corda.core.internal.DeclaredField[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'javaClass' @ [235:75] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'name' @ [235:86] ==> value-parameter name: String defined in net.corda.core.internal.declaredField[ValueParameterDescriptorImpl]

'this' @ [235:92] ==> <this> defined in net.corda.core.internal.declaredField[ReceiverParameterDescriptorImpl]

'DeclaredField' @ [240:79] ==> public constructor DeclaredField<T>(clazz: Class<*>, name: String, receiver: Any?) defined in net.corda.core.internal.DeclaredField[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'clazz' @ [240:93] ==> value-parameter clazz: KClass<*> defined in net.corda.core.internal.declaredField[ValueParameterDescriptorImpl]

'java' @ [240:99] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'name' @ [240:105] ==> value-parameter name: String defined in net.corda.core.internal.declaredField[ValueParameterDescriptorImpl]

'this' @ [240:111] ==> <this> defined in net.corda.core.internal.declaredField[ReceiverParameterDescriptorImpl]

'clazz' @ [247:29] ==> value-parameter clazz: Class<*> defined in net.corda.core.internal.DeclaredField.<init>[ValueParameterDescriptorImpl]

'getDeclaredField' @ [247:35] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'name' @ [247:52] ==> value-parameter name: String defined in net.corda.core.internal.DeclaredField.<init>[ValueParameterDescriptorImpl]

'apply' @ [247:58] ==> @InlineOnly public inline fun <T> (Field..Field?).apply(block: (Field..Field?).() -> Unit): (Field..Field?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'isAccessible' @ [247:66] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'Suppress' @ [249:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'javaField' @ [250:17] ==> private final val javaField: (Field..Field?) defined in net.corda.core.internal.DeclaredField[PropertyDescriptorImpl]

'get' @ [250:27] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'receiver' @ [250:31] ==> private final val receiver: Any? defined in net.corda.core.internal.DeclaredField[PropertyDescriptorImpl]

'javaField' @ [251:22] ==> private final val javaField: (Field..Field?) defined in net.corda.core.internal.DeclaredField[PropertyDescriptorImpl]

'set' @ [251:32] ==> @CallerSensitive public open operator fun set(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in java.lang.reflect.Field[JavaMethodDescriptor]

'receiver' @ [251:36] ==> private final val receiver: Any? defined in net.corda.core.internal.DeclaredField[PropertyDescriptorImpl]

'value' @ [251:46] ==> value-parameter value: T defined in net.corda.core.internal.DeclaredField.<set-value>[ValueParameterDescriptorImpl]

'Target' @ [255:1] ==> public constructor Target(vararg allowedTargets: AnnotationTarget) defined in kotlin.annotation.Target[DeserializedClassConstructorDescriptor]

'CLASS' @ [255:26] ==> enum entry CLASS defined in kotlin.annotation.AnnotationTarget[FakeCallableDescriptorForObject]

'PROPERTY' @ [256:26] ==> enum entry PROPERTY defined in kotlin.annotation.AnnotationTarget[FakeCallableDescriptorForObject]

'CONSTRUCTOR' @ [257:26] ==> enum entry CONSTRUCTOR defined in kotlin.annotation.AnnotationTarget[FakeCallableDescriptorForObject]

'FUNCTION' @ [258:26] ==> enum entry FUNCTION defined in kotlin.annotation.AnnotationTarget[FakeCallableDescriptorForObject]

'TYPEALIAS' @ [259:26] ==> @SinceKotlin enum entry TYPEALIAS defined in kotlin.annotation.AnnotationTarget[FakeCallableDescriptorForObject]

'Retention' @ [260:1] ==> public constructor Retention(value: AnnotationRetention = ...) defined in kotlin.annotation.Retention[DeserializedClassConstructorDescriptor]

'SOURCE' @ [260:32] ==> enum entry SOURCE defined in kotlin.annotation.AnnotationRetention[FakeCallableDescriptorForObject]

'MustBeDocumented' @ [261:1] ==> public constructor MustBeDocumented() defined in kotlin.annotation.MustBeDocumented[DeserializedClassConstructorDescriptor]

