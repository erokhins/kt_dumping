'COMPILE_DAEMON_DEFAULT_FILES_PREFIX' @ [32:11] ==> public val COMPILE_DAEMON_DEFAULT_FILES_PREFIX: String defined in org.jetbrains.kotlin.daemon.common in file DaemonParams.kt[PropertyDescriptorImpl]

'escapeSequence' @ [32:47] ==> value-parameter escapeSequence: String = ... defined in org.jetbrains.kotlin.daemon.common.makeRunFilenameString[ValueParameterDescriptorImpl]

'timestamp' @ [32:63] ==> value-parameter timestamp: String defined in org.jetbrains.kotlin.daemon.common.makeRunFilenameString[ValueParameterDescriptorImpl]

'escapeSequence' @ [32:73] ==> value-parameter escapeSequence: String = ... defined in org.jetbrains.kotlin.daemon.common.makeRunFilenameString[ValueParameterDescriptorImpl]

'digest' @ [32:89] ==> value-parameter digest: String defined in org.jetbrains.kotlin.daemon.common.makeRunFilenameString[ValueParameterDescriptorImpl]

'escapeSequence' @ [32:96] ==> value-parameter escapeSequence: String = ... defined in org.jetbrains.kotlin.daemon.common.makeRunFilenameString[ValueParameterDescriptorImpl]

'port' @ [32:112] ==> value-parameter port: String defined in org.jetbrains.kotlin.daemon.common.makeRunFilenameString[ValueParameterDescriptorImpl]

'escapeSequence' @ [32:117] ==> value-parameter escapeSequence: String = ... defined in org.jetbrains.kotlin.daemon.common.makeRunFilenameString[ValueParameterDescriptorImpl]

'makeRunFilenameString' @ [36:17] ==> public fun makeRunFilenameString(timestamp: String, digest: String, port: String, escapeSequence: String = ...): String defined in org.jetbrains.kotlin.daemon.common in file ClientUtils.kt[SimpleFunctionDescriptorImpl]

'digest' @ [36:80] ==> value-parameter digest: String defined in org.jetbrains.kotlin.daemon.common.makePortFromRunFilenameExtractor[ValueParameterDescriptorImpl]

'toRegex' @ [36:128] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'regex' @ [37:14] ==> val regex: Regex defined in org.jetbrains.kotlin.daemon.common.makePortFromRunFilenameExtractor[LocalVariableDescriptor]

'find' @ [37:20] ==> public final fun find(input: CharSequence, startIndex: Int = ...): MatchResult? defined in kotlin.text.Regex[DeserializedSimpleFunctionDescriptor]

'it' @ [37:25] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.makePortFromRunFilenameExtractor.<anonymous>[ValueParameterDescriptorImpl]

'groups' @ [38:16] ==> public abstract val groups: MatchGroupCollection defined in kotlin.text.MatchResult[DeserializedPropertyDescriptor]

'get' @ [38:24] ==> public abstract operator fun get(index: Int): MatchGroup? defined in kotlin.text.MatchGroupCollection[DeserializedSimpleFunctionDescriptor]

'value' @ [39:16] ==> public final val value: String defined in kotlin.text.MatchGroup[DeserializedPropertyDescriptor]

'toInt' @ [39:23] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [57:27] ==> value-parameter compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.common.walkDaemons[ValueParameterDescriptorImpl]

'compilerClasspath' @ [57:38] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[PropertyDescriptorImpl]

'map' @ [57:56] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (kotlin.String..kotlin.String?)

'File' @ [57:62] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [57:67] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [57:71] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'distinctStringsDigest' @ [57:86] ==> public fun Iterable<String>.distinctStringsDigest(): ByteArray defined in org.jetbrains.kotlin.daemon.common[SimpleFunctionDescriptorImpl]

'toHexString' @ [57:110] ==> public fun ByteArray.toHexString(): String defined in org.jetbrains.kotlin.daemon.common in file DaemonParams.kt[SimpleFunctionDescriptorImpl]

'makePortFromRunFilenameExtractor' @ [58:25] ==> public fun makePortFromRunFilenameExtractor(digest: String): (String) -> Int? defined in org.jetbrains.kotlin.daemon.common[SimpleFunctionDescriptorImpl]

'classPathDigest' @ [58:58] ==> val classPathDigest: String defined in org.jetbrains.kotlin.daemon.common.walkDaemons[LocalVariableDescriptor]

'registryDir' @ [59:12] ==> value-parameter registryDir: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons[ValueParameterDescriptorImpl]

'walk' @ [59:24] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'map' @ [60:14] ==> public fun <T, R> Sequence<File>.map(transform: (File) -> Pair<File, Int?>): Sequence<Pair<File, Int?>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Pair<File, Int?>

'Pair' @ [60:20] ==> public constructor Pair<out A, out B>(first: File, second: Int?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> File
    <out B> -> Int?

'it' @ [60:25] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [60:29] ==> public abstract operator fun invoke(p1: String): Int? defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [60:43] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [60:46] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'filter' @ [61:14] ==> public fun <T> Sequence<Pair<File, Int?>>.filter(predicate: (Pair<File, Int?>) -> Boolean): Sequence<Pair<File, Int?>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<File, Int?>

'component1' @ [61:24] ==> public final operator fun component1(): File defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [61:30] ==> public final operator fun component2(): Int? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'port' @ [61:39] ==> val port: Int? defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'invoke' @ [61:55] ==> public abstract operator fun invoke(p1: File, p2: Int): Boolean defined in kotlin.Function2[FunctionInvokeDescriptor]

'file' @ [61:62] ==> val file: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'port' @ [61:68] ==> val port: Int? defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'mapNotNull' @ [62:14] ==> public fun <T, R : Any> Sequence<Pair<File, Int?>>.mapNotNull(transform: (Pair<File, Int?>) -> DaemonWithMetadata?): Sequence<DaemonWithMetadata> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<File, Int?>
    <R : Any> -> DaemonWithMetadata

'component1' @ [62:28] ==> public final operator fun component1(): File defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [62:34] ==> public final operator fun component2(): Int? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'assert' @ [63:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'port' @ [63:24] ==> val port: Int? defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'..' @ [63:34] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'MAX_PORT_NUMBER' @ [63:38] ==> internal val MAX_PORT_NUMBER: Int defined in org.jetbrains.kotlin.daemon.common in file ClientUtils.kt[PropertyDescriptorImpl]

'fileToCompareTimestamp' @ [64:35] ==> value-parameter fileToCompareTimestamp: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons[ValueParameterDescriptorImpl]

'lastModified' @ [64:58] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'file' @ [64:75] ==> val file: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'lastModified' @ [64:80] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'invoke' @ [65:17] ==> public abstract operator fun invoke(p1: DaemonReportCategory, p2: String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'DEBUG' @ [65:45] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'port' @ [65:75] ==> val port: Int? defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'relativeAge' @ [65:82] ==> val relativeAge: Long defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'tryConnectToDaemon' @ [66:30] ==> private inline fun tryConnectToDaemon(port: Int, report: (DaemonReportCategory, String) -> Unit): CompileService? defined in org.jetbrains.kotlin.daemon.common[SimpleFunctionDescriptorImpl]

'port' @ [66:49] ==> val port: Int? defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'report' @ [66:55] ==> value-parameter report: (DaemonReportCategory, String) -> Unit = ... defined in org.jetbrains.kotlin.daemon.common.walkDaemons[ValueParameterDescriptorImpl]

'daemon' @ [68:21] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'if (relativeAge - ORPHANED_RUN_FILE_AGE_THRESHOLD_MS <= 0) {
                        report(DaemonReportCategory.DEBUG, "found fresh run file '${file.absolutePath}' ($relativeAge ms old), but no daemon, ignoring it")
                    }
                    else {
                        report(DaemonReportCategory.DEBUG, "found seemingly orphaned run file '${file.absolutePath}' ($relativeAge ms old), deleting it")
                        if (!file.delete()) {
                            report(DaemonReportCategory.INFO, "WARNING: unable to delete seemingly orphaned file '${file.absolutePath}', cleanup recommended")
                        }
                    }' @ [69:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'relativeAge' @ [69:25] ==> val relativeAge: Long defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'ORPHANED_RUN_FILE_AGE_THRESHOLD_MS' @ [69:39] ==> private const val ORPHANED_RUN_FILE_AGE_THRESHOLD_MS: Long defined in org.jetbrains.kotlin.daemon.common in file ClientUtils.kt[PropertyDescriptorImpl]

'invoke' @ [70:25] ==> public abstract operator fun invoke(p1: DaemonReportCategory, p2: String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'DEBUG' @ [70:53] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'file' @ [70:85] ==> val file: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'absolutePath' @ [70:90] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'relativeAge' @ [70:107] ==> val relativeAge: Long defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'invoke' @ [73:25] ==> public abstract operator fun invoke(p1: DaemonReportCategory, p2: String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'DEBUG' @ [73:53] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'file' @ [73:98] ==> val file: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'absolutePath' @ [73:103] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'relativeAge' @ [73:120] ==> val relativeAge: Long defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'!' @ [74:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [74:30] ==> val file: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'delete' @ [74:35] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'invoke' @ [75:29] ==> public abstract operator fun invoke(p1: DaemonReportCategory, p2: String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'INFO' @ [75:57] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'file' @ [75:117] ==> val file: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'absolutePath' @ [75:122] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'daemon' @ [80:21] ==> val daemon: CompileService? defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'let' @ [80:29] ==> @InlineOnly public inline fun <T, R> CompileService.let(block: (CompileService) -> DaemonWithMetadata): DaemonWithMetadata defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompileService
    <R> -> DaemonWithMetadata

'DaemonWithMetadata' @ [80:35] ==> public constructor DaemonWithMetadata(daemon: CompileService, runFile: File, jvmOptions: DaemonJVMOptions) defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[ClassConstructorDescriptorImpl]

'it' @ [80:54] ==> value-parameter it: CompileService defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [80:58] ==> val file: File defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'it' @ [80:64] ==> value-parameter it: CompileService defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getDaemonJVMOptions' @ [80:67] ==> @Throws public abstract fun getDaemonJVMOptions(): CompileService.CallResult<DaemonJVMOptions> defined in org.jetbrains.kotlin.daemon.common.CompileService[SimpleFunctionDescriptorImpl]

'get' @ [80:89] ==> public abstract fun get(): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[SimpleFunctionDescriptorImpl]

'invoke' @ [83:21] ==> public abstract operator fun invoke(p1: DaemonReportCategory, p2: String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'INFO' @ [83:49] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'e' @ [83:129] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.daemon.common.walkDaemons.<anonymous>[LocalVariableDescriptor]

'message' @ [83:131] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'getRegistry' @ [92:37] ==> public open fun getRegistry(p0: (String..String?), p1: Int, p2: (RMIClientSocketFactory..RMIClientSocketFactory?)): (Registry..Registry?) defined in java.rmi.registry.LocateRegistry[JavaMethodDescriptor]

'LoopbackNetworkInterface' @ [92:49] ==> public object LoopbackNetworkInterface defined in org.jetbrains.kotlin.daemon.common in file NetworkUtils.kt[FakeCallableDescriptorForObject]

'loopbackInetAddressName' @ [92:74] ==> public final val loopbackInetAddressName: String defined in org.jetbrains.kotlin.daemon.common.LoopbackNetworkInterface[PropertyDescriptorImpl]

'port' @ [92:99] ==> value-parameter port: Int defined in org.jetbrains.kotlin.daemon.common.tryConnectToDaemon[ValueParameterDescriptorImpl]

'LoopbackNetworkInterface' @ [92:105] ==> public object LoopbackNetworkInterface defined in org.jetbrains.kotlin.daemon.common in file NetworkUtils.kt[FakeCallableDescriptorForObject]

'clientLoopbackSocketFactory' @ [92:130] ==> public final val clientLoopbackSocketFactory: LoopbackNetworkInterface.ClientLoopbackSocketFactory defined in org.jetbrains.kotlin.daemon.common.LoopbackNetworkInterface[PropertyDescriptorImpl]

'lookup' @ [93:19] ==> public abstract fun lookup(p0: (String..String?)): (Remote..Remote?) defined in java.rmi.registry.Registry[JavaMethodDescriptor]

'COMPILER_SERVICE_RMI_NAME' @ [93:26] ==> public val COMPILER_SERVICE_RMI_NAME: String defined in org.jetbrains.kotlin.daemon.common in file DaemonParams.kt[PropertyDescriptorImpl]

'when (daemon) {
            null -> report(DaemonReportCategory.EXCEPTION, "daemon not found")
            is CompileService -> return daemon
            else -> report(DaemonReportCategory.EXCEPTION, "Unable to cast compiler service, actual class received: ${daemon::class.java.name}")
        }' @ [94:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'daemon' @ [94:15] ==> val daemon: Remote? defined in org.jetbrains.kotlin.daemon.common.tryConnectToDaemon[LocalVariableDescriptor]

'invoke' @ [95:21] ==> public abstract operator fun invoke(p1: DaemonReportCategory, p2: String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'EXCEPTION' @ [95:49] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'daemon' @ [96:41] ==> val daemon: Remote? defined in org.jetbrains.kotlin.daemon.common.tryConnectToDaemon[LocalVariableDescriptor]

'invoke' @ [97:21] ==> public abstract operator fun invoke(p1: DaemonReportCategory, p2: String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'EXCEPTION' @ [97:49] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'daemon' @ [97:119] ==> val daemon: Remote? defined in org.jetbrains.kotlin.daemon.common.tryConnectToDaemon[LocalVariableDescriptor]

'java' @ [97:133] ==> public val <T> KClass<out Remote>.java: Class<out Remote> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Remote

'name' @ [97:138] ==> public final val <T : (Any..Any?)> Class<out Remote>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Remote

'invoke' @ [101:9] ==> public abstract operator fun invoke(p1: DaemonReportCategory, p2: String): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'EXCEPTION' @ [101:37] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'+' @ [101:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [101:82] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.common.tryConnectToDaemon[LocalVariableDescriptor]

'cause' @ [101:84] ==> public open val cause: Throwable? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'message' @ [101:91] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'e' @ [101:102] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.common.tryConnectToDaemon[LocalVariableDescriptor]

'message' @ [101:104] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'createTempFile' @ [109:25] ==> public open fun createTempFile(p0: (String..String?), p1: (String..String?), p2: (File..File?)): (File..File?) defined in java.io.File[JavaMethodDescriptor]

'keyword' @ [109:50] ==> value-parameter keyword: String = ... defined in org.jetbrains.kotlin.daemon.common.makeAutodeletingFlagFile[ValueParameterDescriptorImpl]

'filter' @ [109:58] ==> public inline fun String.filter(predicate: (Char) -> Boolean): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'validFlagFileKeywordChars' @ [109:67] ==> private const val validFlagFileKeywordChars: String defined in org.jetbrains.kotlin.daemon.common in file ClientUtils.kt[PropertyDescriptorImpl]

'contains' @ [109:93] ==> public operator fun CharSequence.contains(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [109:102] ==> value-parameter it: Char defined in org.jetbrains.kotlin.daemon.common.makeAutodeletingFlagFile.<anonymous>[ValueParameterDescriptorImpl]

'toLowerCase' @ [109:105] ==> @InlineOnly public inline fun Char.toLowerCase(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'baseDir' @ [109:141] ==> value-parameter baseDir: File? = ... defined in org.jetbrains.kotlin.daemon.common.makeAutodeletingFlagFile[ValueParameterDescriptorImpl]

'takeIf' @ [109:150] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [109:159] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.common.makeAutodeletingFlagFile.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [109:162] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'it' @ [109:177] ==> value-parameter it: File defined in org.jetbrains.kotlin.daemon.common.makeAutodeletingFlagFile.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [109:180] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'flagFile' @ [110:5] ==> val flagFile: (File..File?) defined in org.jetbrains.kotlin.daemon.common.makeAutodeletingFlagFile[LocalVariableDescriptor]

'deleteOnExit' @ [110:14] ==> public open fun deleteOnExit(): Unit defined in java.io.File[JavaMethodDescriptor]

'flagFile' @ [111:12] ==> val flagFile: (File..File?) defined in org.jetbrains.kotlin.daemon.common.makeAutodeletingFlagFile[LocalVariableDescriptor]

'left' @ [117:22] ==> value-parameter left: File defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[ValueParameterDescriptorImpl]

'lastModified' @ [117:27] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'right' @ [118:23] ==> value-parameter right: File defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[ValueParameterDescriptorImpl]

'lastModified' @ [118:29] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'when {
            leftTS == 0L || rightTS == 0L -> 0 // cannot read any file timestamp, => undecidable
            leftTS > rightTS -> -1
            leftTS < rightTS -> 1
            else -> compareValues(left.canonicalPath, right.canonicalPath)
        }' @ [119:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'leftTS' @ [120:13] ==> val leftTS: Long defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[LocalVariableDescriptor]

'rightTS' @ [120:29] ==> val rightTS: Long defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[LocalVariableDescriptor]

'leftTS' @ [121:13] ==> val leftTS: Long defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[LocalVariableDescriptor]

'rightTS' @ [121:22] ==> val rightTS: Long defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[LocalVariableDescriptor]

'-' @ [121:33] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'leftTS' @ [122:13] ==> val leftTS: Long defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[LocalVariableDescriptor]

'rightTS' @ [122:22] ==> val rightTS: Long defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[LocalVariableDescriptor]

'compareValues' @ [123:21] ==> public fun <T : Comparable<*>> compareValues(a: String?, b: String?): Int defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<*>> -> String

'left' @ [123:35] ==> value-parameter left: File defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[ValueParameterDescriptorImpl]

'canonicalPath' @ [123:40] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'right' @ [123:55] ==> value-parameter right: File defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator.compare[ValueParameterDescriptorImpl]

'canonicalPath' @ [123:61] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

