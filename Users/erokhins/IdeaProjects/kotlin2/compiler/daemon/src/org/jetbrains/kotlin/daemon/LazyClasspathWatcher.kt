'DEFAULT_CLASSPATH_WATCH_PERIOD_MS' @ [44:52] ==> public val DEFAULT_CLASSPATH_WATCH_PERIOD_MS: Long defined in org.jetbrains.kotlin.daemon in file LazyClasspathWatcher.kt[PropertyDescriptorImpl]

'DEFAULT_CLASSPATH_DIGEST_WATCH_PERIOD_MS' @ [45:58] ==> public val DEFAULT_CLASSPATH_DIGEST_WATCH_PERIOD_MS: Long defined in org.jetbrains.kotlin.daemon in file LazyClasspathWatcher.kt[PropertyDescriptorImpl]

'Semaphore' @ [49:31] ==> public constructor Semaphore(p0: Int) defined in java.util.concurrent.Semaphore[JavaClassConstructorDescriptor]

'AtomicBoolean' @ [51:37] ==> public constructor AtomicBoolean(p0: Boolean) defined in java.util.concurrent.atomic.AtomicBoolean[JavaClassConstructorDescriptor]

'AtomicLong' @ [52:30] ==> public constructor AtomicLong(p0: Long) defined in java.util.concurrent.atomic.AtomicLong[JavaClassConstructorDescriptor]

'AtomicLong' @ [53:36] ==> public constructor AtomicLong(p0: Long) defined in java.util.concurrent.atomic.AtomicLong[JavaClassConstructorDescriptor]

'lazy' @ [54:24] ==> public fun <T> lazy(initializer: () -> (Logger..Logger?)): Lazy<(Logger..Logger?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.logging.Logger..java.util.logging.Logger?)

'getLogger' @ [54:38] ==> @CallerSensitive public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in java.util.logging.Logger[JavaMethodDescriptor]

'fileIdsLock' @ [58:9] ==> private final val fileIdsLock: Semaphore defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'acquire' @ [58:21] ==> public open fun acquire(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'thread' @ [59:9] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'fileIds' @ [61:17] ==> private final var fileIds: List<LazyClasspathWatcher.FileId>? defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'classpath' @ [61:27] ==> value-parameter classpath: Iterable<String> defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<init>[ValueParameterDescriptorImpl]

'map' @ [62:26] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'asSequence' @ [63:26] ==> public fun <T> Iterable<File>.asSequence(): Sequence<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'flatMap' @ [64:26] ==> public fun <T, R> Sequence<File>.flatMap(transform: (File) -> Sequence<File>): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> File

'it' @ [64:36] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'walk' @ [64:39] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'filter' @ [64:46] ==> public fun <T> Sequence<File>.filter(predicate: (File) -> Boolean): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'map' @ [65:26] ==> public fun <T, R> Sequence<File>.map(transform: (File) -> LazyClasspathWatcher.FileId): Sequence<LazyClasspathWatcher.FileId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> FileId

'FileId' @ [65:32] ==> public constructor FileId(file: File, lastModified: Long, digest: ByteArray) defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.FileId[ClassConstructorDescriptorImpl]

'it' @ [65:39] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [65:43] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'lastModified' @ [65:46] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'it' @ [65:62] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'md5Digest' @ [65:65] ==> public fun File.md5Digest(): ByteArray defined in org.jetbrains.kotlin.daemon in file LazyClasspathWatcher.kt[SimpleFunctionDescriptorImpl]

'toList' @ [66:26] ==> public fun <T> Sequence<LazyClasspathWatcher.FileId>.toList(): List<LazyClasspathWatcher.FileId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileId

'toMillis' @ [67:50] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'nanoTime' @ [67:66] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'lastUpdate' @ [68:17] ==> private final val lastUpdate: AtomicLong defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'set' @ [68:28] ==> public final fun set(p0: Long): Unit defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'nowMs' @ [68:32] ==> val nowMs: Long defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<init>.<anonymous>[LocalVariableDescriptor]

'lastDigestUpdate' @ [69:17] ==> private final val lastDigestUpdate: AtomicLong defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'set' @ [69:34] ==> public final fun set(p0: Long): Unit defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'nowMs' @ [69:38] ==> val nowMs: Long defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<init>.<anonymous>[LocalVariableDescriptor]

'log' @ [72:17] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'log' @ [72:21] ==> public open fun log(p0: (Level..Level?), p1: (String..String?), p2: (Throwable..Throwable?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'WARNING' @ [72:31] ==> public final val WARNING: (Level..Level?) defined in java.util.logging.Level[JavaPropertyDescriptor]

'e' @ [72:70] ==> val e: IOException defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<init>.<anonymous>[LocalVariableDescriptor]

'fileIdsLock' @ [76:17] ==> private final val fileIdsLock: Semaphore defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'release' @ [76:29] ==> public open fun release(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'lastChangedStatus' @ [82:13] ==> private final val lastChangedStatus: AtomicBoolean defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'get' @ [82:31] ==> public final fun get(): Boolean defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'toMillis' @ [83:42] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'nanoTime' @ [83:58] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'nowMs' @ [84:13] ==> val nowMs: Long defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>[LocalVariableDescriptor]

'lastUpdate' @ [84:21] ==> private final val lastUpdate: AtomicLong defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'get' @ [84:32] ==> public final fun get(): Long defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'checkPeriod' @ [84:40] ==> public final val checkPeriod: Long defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'nowMs' @ [86:27] ==> val nowMs: Long defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>[LocalVariableDescriptor]

'lastDigestUpdate' @ [86:35] ==> private final val lastDigestUpdate: AtomicLong defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'get' @ [86:52] ==> public final fun get(): Long defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'digestCheckPeriod' @ [86:60] ==> public final val digestCheckPeriod: Long defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'fileIdsLock' @ [88:9] ==> private final val fileIdsLock: Semaphore defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'acquire' @ [88:21] ==> public open fun acquire(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'fileIdsLock' @ [89:9] ==> private final val fileIdsLock: Semaphore defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'release' @ [89:21] ==> public open fun release(): Unit defined in java.util.concurrent.Semaphore[JavaMethodDescriptor]

'fileIds' @ [91:13] ==> private final var fileIds: List<LazyClasspathWatcher.FileId>? defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'find' @ [91:22] ==> @InlineOnly public inline fun <T> Iterable<LazyClasspathWatcher.FileId>.find(predicate: (LazyClasspathWatcher.FileId) -> Boolean): LazyClasspathWatcher.FileId? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileId

'if (!it.file.exists()) {
                        log.info("cp changed: ${it.file} doesn't exist any more")
                        true
                    }
                    // if last modified changed or if enforced by param - checking the digest
                    else if ((it.file.lastModified() != it.lastModified || checkDigest) && !Arrays.equals(it.digest, it.file.md5Digest())) {
                        log.info("cp changed: ${it.file} digests differ")
                        true
                    }
                    else false' @ [93:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [93:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [93:26] ==> value-parameter it: LazyClasspathWatcher.FileId defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [93:29] ==> public final val file: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.FileId[PropertyDescriptorImpl]

'exists' @ [93:34] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'log' @ [94:25] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'info' @ [94:29] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'it' @ [94:49] ==> value-parameter it: LazyClasspathWatcher.FileId defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [94:52] ==> public final val file: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.FileId[PropertyDescriptorImpl]

'if ((it.file.lastModified() != it.lastModified || checkDigest) && !Arrays.equals(it.digest, it.file.md5Digest())) {
                        log.info("cp changed: ${it.file} digests differ")
                        true
                    }
                    else false' @ [98:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'it' @ [98:31] ==> value-parameter it: LazyClasspathWatcher.FileId defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [98:34] ==> public final val file: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.FileId[PropertyDescriptorImpl]

'lastModified' @ [98:39] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'it' @ [98:57] ==> value-parameter it: LazyClasspathWatcher.FileId defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>.<anonymous>[ValueParameterDescriptorImpl]

'lastModified' @ [98:60] ==> public final val lastModified: Long defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.FileId[PropertyDescriptorImpl]

'checkDigest' @ [98:76] ==> val checkDigest: Boolean defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>[LocalVariableDescriptor]

'!' @ [98:92] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equals' @ [98:100] ==> public open fun equals(p0: (ByteArray..ByteArray?), p1: (ByteArray..ByteArray?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'it' @ [98:107] ==> value-parameter it: LazyClasspathWatcher.FileId defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>.<anonymous>[ValueParameterDescriptorImpl]

'digest' @ [98:110] ==> public final val digest: ByteArray defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.FileId[PropertyDescriptorImpl]

'it' @ [98:118] ==> value-parameter it: LazyClasspathWatcher.FileId defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [98:121] ==> public final val file: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.FileId[PropertyDescriptorImpl]

'md5Digest' @ [98:126] ==> public fun File.md5Digest(): ByteArray defined in org.jetbrains.kotlin.daemon in file LazyClasspathWatcher.kt[SimpleFunctionDescriptorImpl]

'log' @ [99:25] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'info' @ [99:29] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'it' @ [99:49] ==> value-parameter it: LazyClasspathWatcher.FileId defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [99:52] ==> public final val file: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.FileId[PropertyDescriptorImpl]

'log' @ [105:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'log' @ [105:25] ==> public open fun log(p0: (Level..Level?), p1: (String..String?), p2: (Throwable..Throwable?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'INFO' @ [105:35] ==> public final val INFO: (Level..Level?) defined in java.util.logging.Level[JavaPropertyDescriptor]

'it' @ [105:56] ==> value-parameter it: LazyClasspathWatcher.FileId defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [105:59] ==> public final val file: File defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.FileId[PropertyDescriptorImpl]

'e' @ [105:95] ==> val e: IOException defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>.<anonymous>[LocalVariableDescriptor]

'lastUpdate' @ [109:9] ==> private final val lastUpdate: AtomicLong defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'set' @ [109:20] ==> public final fun set(p0: Long): Unit defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'toMillis' @ [109:45] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'nanoTime' @ [109:61] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'checkDigest' @ [110:13] ==> val checkDigest: Boolean defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>[LocalVariableDescriptor]

'lastDigestUpdate' @ [110:26] ==> private final val lastDigestUpdate: AtomicLong defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'set' @ [110:43] ==> public final fun set(p0: Long): Unit defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'lastUpdate' @ [110:47] ==> private final val lastUpdate: AtomicLong defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'get' @ [110:58] ==> public final fun get(): Long defined in java.util.concurrent.atomic.AtomicLong[JavaMethodDescriptor]

'changed' @ [112:16] ==> val changed: Boolean defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher.<get-isChanged>[LocalVariableDescriptor]

'file' @ [117:44] ==> value-parameter file: File defined in org.jetbrains.kotlin.daemon.isClasspathFile[ValueParameterDescriptorImpl]

'isFile' @ [117:49] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'listOf' @ [117:59] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'contains' @ [117:82] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'file' @ [117:91] ==> value-parameter file: File defined in org.jetbrains.kotlin.daemon.isClasspathFile[ValueParameterDescriptorImpl]

'extension' @ [117:96] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'toLowerCase' @ [117:106] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [120:28] ==> public open fun getInstance(p0: (String..String?)): (MessageDigest..MessageDigest?) defined in java.security.MessageDigest[JavaMethodDescriptor]

'CLASSPATH_FILE_ID_DIGEST' @ [120:40] ==> public val CLASSPATH_FILE_ID_DIGEST: String defined in org.jetbrains.kotlin.daemon in file LazyClasspathWatcher.kt[PropertyDescriptorImpl]

'DigestInputStream' @ [121:5] ==> public constructor DigestInputStream(p0: (InputStream..InputStream?), p1: (MessageDigest..MessageDigest?)) defined in java.security.DigestInputStream[JavaClassConstructorDescriptor]

'inputStream' @ [121:23] ==> @InlineOnly public inline fun File.inputStream(): FileInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'md' @ [121:38] ==> val md: (MessageDigest..MessageDigest?) defined in org.jetbrains.kotlin.daemon.md5Digest[LocalVariableDescriptor]

'use' @ [121:42] ==> @InlineOnly public inline fun <T : Closeable?, R> DigestInputStream.use(block: (DigestInputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> DigestInputStream
    <R> -> Unit

'ByteArray' @ [122:19] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'it' @ [123:16] ==> value-parameter it: DigestInputStream defined in org.jetbrains.kotlin.daemon.md5Digest.<anonymous>[ValueParameterDescriptorImpl]

'read' @ [123:19] ==> public open fun read(p0: (ByteArray..ByteArray?)): Int defined in java.security.DigestInputStream[JavaMethodDescriptor]

'buf' @ [123:24] ==> val buf: ByteArray defined in org.jetbrains.kotlin.daemon.md5Digest.<anonymous>[LocalVariableDescriptor]

'-' @ [123:32] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [124:9] ==> value-parameter it: DigestInputStream defined in org.jetbrains.kotlin.daemon.md5Digest.<anonymous>[ValueParameterDescriptorImpl]

'close' @ [124:12] ==> public open fun close(): Unit defined in java.security.DigestInputStream[JavaMethodDescriptor]

'md' @ [126:12] ==> val md: (MessageDigest..MessageDigest?) defined in org.jetbrains.kotlin.daemon.md5Digest[LocalVariableDescriptor]

'digest' @ [126:15] ==> public open fun digest(): (ByteArray..ByteArray?) defined in java.security.MessageDigest[JavaMethodDescriptor]

