'OutputStream' @ [40:33] ==> public constructor OutputStream() defined in java.io.OutputStream[JavaClassConstructorDescriptor]

'lazy' @ [42:16] ==> public fun <T> lazy(initializer: () -> (Logger..Logger?)): Lazy<(Logger..Logger?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.logging.Logger..java.util.logging.Logger?)

'getLogger' @ [42:30] ==> @CallerSensitive public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in java.util.logging.Logger[JavaMethodDescriptor]

'name' @ [42:40] ==> value-parameter name: String defined in org.jetbrains.kotlin.daemon.LogStream.<init>[ValueParameterDescriptorImpl]

'StringBuilder' @ [44:19] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'if (byte.toChar() == '\n') flush()
        else lineBuf.append(byte.toChar())' @ [47:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'byte' @ [47:13] ==> value-parameter byte: Int defined in org.jetbrains.kotlin.daemon.LogStream.write[ValueParameterDescriptorImpl]

'toChar' @ [47:18] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'flush' @ [47:36] ==> public open fun flush(): Unit defined in org.jetbrains.kotlin.daemon.LogStream[SimpleFunctionDescriptorImpl]

'lineBuf' @ [48:14] ==> public final val lineBuf: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.daemon.LogStream[PropertyDescriptorImpl]

'append' @ [48:22] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'byte' @ [48:29] ==> value-parameter byte: Int defined in org.jetbrains.kotlin.daemon.LogStream.write[ValueParameterDescriptorImpl]

'toChar' @ [48:34] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'log' @ [52:9] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.LogStream[PropertyDescriptorImpl]

'info' @ [52:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'lineBuf' @ [52:18] ==> public final val lineBuf: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.daemon.LogStream[PropertyDescriptorImpl]

'toString' @ [52:26] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'lineBuf' @ [53:9] ==> public final val lineBuf: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.daemon.LogStream[PropertyDescriptorImpl]

'setLength' @ [53:17] ==> public open fun setLength(p0: Int): Unit defined in java.lang.StringBuilder[JavaMethodDescriptor]

'SimpleDateFormat' @ [60:31] ==> public constructor SimpleDateFormat(p0: (String..String?)) defined in java.text.SimpleDateFormat[JavaClassConstructorDescriptor]

'format' @ [60:75] ==> public final fun format(p0: (Date..Date?)): (String..String?) defined in java.text.SimpleDateFormat[JavaMethodDescriptor]

'Date' @ [60:82] ==> public constructor Date() defined in java.util.Date[JavaClassConstructorDescriptor]

'component1' @ [61:14] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [61:31] ==> public final operator fun component2(): Boolean defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'?:' @ [62:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Pair<String, Boolean>?, right: Pair<String, Boolean>): Pair<String, Boolean>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Pair<String, Boolean>

'getProperty' @ [62:24] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'COMPILE_DAEMON_LOG_PATH_PROPERTY' @ [62:36] ==> public val COMPILE_DAEMON_LOG_PATH_PROPERTY: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'trimQuotes' @ [62:71] ==> public fun String.trimQuotes(): String defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'let' @ [62:85] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Pair<String, Boolean>): Pair<String, Boolean> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Pair<String, Boolean>

'Pair' @ [62:91] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'it' @ [62:96] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>.<anonymous>[ValueParameterDescriptorImpl]

'File' @ [62:100] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [62:105] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [62:109] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'Pair' @ [62:122] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'+' @ [64:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'if (fileIsGiven) 0 else (1 shl 20)' @ [68:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'fileIsGiven' @ [68:66] ==> val fileIsGiven: Boolean defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>[LocalVariableDescriptor]

'shl' @ [68:87] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'if (fileIsGiven) 1 else 3' @ [69:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'fileIsGiven' @ [69:66] ==> val fileIsGiven: Boolean defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>[LocalVariableDescriptor]

'fileIsGiven' @ [70:61] ==> val fileIsGiven: Boolean defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>[LocalVariableDescriptor]

'if (fileIsGiven) logPath else (logPath + File.separator + "$COMPILE_DAEMON_DEFAULT_FILES_PREFIX.$logTime.%u%g.log")' @ [71:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'fileIsGiven' @ [71:66] ==> val fileIsGiven: Boolean defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>[LocalVariableDescriptor]

'logPath' @ [71:79] ==> val logPath: String defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>[LocalVariableDescriptor]

'logPath' @ [71:93] ==> val logPath: String defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>[LocalVariableDescriptor]

'separator' @ [71:108] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'COMPILE_DAEMON_DEFAULT_FILES_PREFIX' @ [71:122] ==> public val COMPILE_DAEMON_DEFAULT_FILES_PREFIX: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'logTime' @ [71:159] ==> val logTime: String defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>[LocalVariableDescriptor]

'getLogManager' @ [74:20] ==> public open fun getLogManager(): (LogManager..LogManager?) defined in java.util.logging.LogManager[JavaMethodDescriptor]

'readConfiguration' @ [74:36] ==> public open fun readConfiguration(p0: (InputStream..InputStream?)): Unit defined in java.util.logging.LogManager[JavaMethodDescriptor]

'cfg' @ [74:54] ==> val cfg: String defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.<init>[LocalVariableDescriptor]

'byteInputStream' @ [74:58] ==> @InlineOnly public inline fun String.byteInputStream(charset: Charset = ...): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'lazy' @ [77:16] ==> public fun <T> lazy(initializer: () -> (Logger..Logger?)): Lazy<(Logger..Logger?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.logging.Logger..java.util.logging.Logger?)

'getLogger' @ [77:30] ==> @CallerSensitive public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in java.util.logging.Logger[JavaMethodDescriptor]

'KotlinCompileDaemon' @ [80:10] ==> public object KotlinCompileDaemon defined in org.jetbrains.kotlin.daemon in file KotlinCompileDaemon.kt[FakeCallableDescriptorForObject]

'java' @ [80:37] ==> public val <T> KClass<KotlinCompileDaemon>.java: Class<KotlinCompileDaemon> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCompileDaemon

'classLoader' @ [80:42] ==> public final val <T : (Any..Any?)> Class<KotlinCompileDaemon>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> KotlinCompileDaemon

'findResource' @ [81:19] ==> public open fun findResource(p0: (String..String?)): (URL..URL?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'let' @ [82:19] ==> @InlineOnly public inline fun <T, R> URL.let(block: (URL) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> URL
    <R> -> Unit

'Manifest' @ [84:32] ==> public constructor Manifest(p0: (InputStream..InputStream?)) defined in java.util.jar.Manifest[JavaClassConstructorDescriptor]

'it' @ [84:41] ==> value-parameter it: URL defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.loadVersionFromResource.<anonymous>[ValueParameterDescriptorImpl]

'openStream' @ [84:44] ==> public final fun openStream(): (InputStream..InputStream?) defined in java.net.URL[JavaMethodDescriptor]

'mainAttributes' @ [84:58] ==> public final val Manifest.mainAttributes: (Attributes..Attributes?)[MyPropertyDescriptor]

'getValue' @ [84:73] ==> public open fun getValue(p0: (String..String?)): (String..String?) defined in java.util.jar.Attributes[JavaMethodDescriptor]

'JvmStatic' @ [91:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'ensureServerHostnameIsSetUp' @ [93:9] ==> public fun ensureServerHostnameIsSetUp(): Unit defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'getRuntimeMXBean' @ [95:46] ==> public open fun getRuntimeMXBean(): (RuntimeMXBean..RuntimeMXBean?) defined in java.lang.management.ManagementFactory[JavaMethodDescriptor]

'inputArguments' @ [95:65] ==> public final val RuntimeMXBean.inputArguments: (MutableList<(String..String?)>..List<(String..String?)>?)[MyPropertyDescriptor]

'log' @ [97:9] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[PropertyDescriptorImpl]

'info' @ [97:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'+' @ [97:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'loadVersionFromResource' @ [97:55] ==> private final fun loadVersionFromResource(): String? defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[SimpleFunctionDescriptorImpl]

'log' @ [98:9] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[PropertyDescriptorImpl]

'info' @ [98:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'+' @ [98:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'jvmArguments' @ [98:40] ==> val jvmArguments: (MutableList<(String..String?)>..List<(String..String?)>?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'joinToString' @ [98:53] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'log' @ [99:9] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[PropertyDescriptorImpl]

'info' @ [99:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'+' @ [99:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'args' @ [99:36] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[ValueParameterDescriptorImpl]

'joinToString' @ [99:41] ==> public fun <T> Array<out String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'setIdeaIoUseFallback' @ [101:9] ==> public fun setIdeaIoUseFallback(): Unit defined in org.jetbrains.kotlin.cli.common.environment[DeserializedSimpleFunctionDescriptor]

'CompilerId' @ [103:26] ==> public constructor CompilerId(compilerClasspath: List<String> = ..., compilerVersion: String = ...) defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedClassConstructorDescriptor]

'DaemonOptions' @ [104:29] ==> public constructor DaemonOptions(runFilesPath: String = ..., autoshutdownMemoryThreshold: Long = ..., autoshutdownIdleSeconds: Int = ..., autoshutdownUnusedSeconds: Int = ..., shutdownDelayMilliseconds: Long = ..., forceShutdownTimeoutMilliseconds: Long = ..., verbose: Boolean = ..., reportPerf: Boolean = ...) defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedClassConstructorDescriptor]

'configureDaemonJVMOptions' @ [107:36] ==> public fun configureDaemonJVMOptions(vararg additionalParams: String, inheritMemoryLimits: Boolean, inheritOtherJvmOptions: Boolean, inheritAdditionalProperties: Boolean): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'args' @ [111:32] ==> value-parameter args: Array<String> defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[ValueParameterDescriptorImpl]

'asIterable' @ [111:37] ==> public fun <T> Array<out String>.asIterable(): Iterable<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'filterExtractProps' @ [111:50] ==> public fun Iterable<String>.filterExtractProps(vararg groups: OptionsGroup, prefix: String): Iterable<String> defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [111:69] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'daemonOptions' @ [111:81] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX' @ [111:105] ==> public val COMPILE_DAEMON_CMDLINE_OPTIONS_PREFIX: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'filteredArgs' @ [113:17] ==> val filteredArgs: Iterable<String> defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'any' @ [113:30] ==> public fun <T> Iterable<String>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'log' @ [115:17] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[PropertyDescriptorImpl]

'info' @ [115:21] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'helpLine' @ [115:26] ==> val helpLine: String defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'println' @ [116:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'helpLine' @ [116:25] ==> val helpLine: String defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'IllegalArgumentException' @ [117:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [117:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'filteredArgs' @ [117:72] ==> val filteredArgs: Iterable<String> defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'joinToString' @ [117:85] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'log' @ [120:13] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[PropertyDescriptorImpl]

'info' @ [120:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'component1' @ [129:18] ==> public final operator fun component1(): Registry defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [129:28] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'findPortAndCreateRegistry' @ [129:36] ==> public fun findPortAndCreateRegistry(attempts: Int, portRangeStart: Int, portRangeEnd: Int): Pair<Registry, Int> defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'COMPILE_DAEMON_FIND_PORT_ATTEMPTS' @ [129:62] ==> public val COMPILE_DAEMON_FIND_PORT_ATTEMPTS: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'COMPILE_DAEMON_PORTS_RANGE_START' @ [129:97] ==> public val COMPILE_DAEMON_PORTS_RANGE_START: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'COMPILE_DAEMON_PORTS_RANGE_END' @ [129:131] ==> public val COMPILE_DAEMON_PORTS_RANGE_END: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'lazy' @ [132:36] ==> public fun <T> lazy(initializer: () -> K2JVMCompiler): Lazy<K2JVMCompiler> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JVMCompiler

'K2JVMCompiler' @ [132:43] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'lazy' @ [133:35] ==> public fun <T> lazy(initializer: () -> K2JSCompiler): Lazy<K2JSCompiler> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2JSCompiler

'K2JSCompiler' @ [133:42] ==> public constructor K2JSCompiler() defined in org.jetbrains.kotlin.cli.js.K2JSCompiler[JavaClassConstructorDescriptor]

'lazy' @ [134:41] ==> public fun <T> lazy(initializer: () -> K2MetadataCompiler): Lazy<K2MetadataCompiler> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K2MetadataCompiler

'K2MetadataCompiler' @ [134:48] ==> public constructor K2MetadataCompiler() defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler[DeserializedClassConstructorDescriptor]

'when (targetPlatform) {
                    CompileService.TargetPlatform.JVM -> jvm
                    CompileService.TargetPlatform.JS -> js
                    CompileService.TargetPlatform.METADATA -> metadata
                }' @ [135:99] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CLICompiler<*>, entry1: CLICompiler<*>, entry2: CLICompiler<*>): CLICompiler<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CLICompiler<*>

'targetPlatform' @ [135:105] ==> value-parameter targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main.<no name provided>.get[ValueParameterDescriptorImpl]

'CompileService' @ [136:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [136:51] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'jvm' @ [136:58] ==> private final val jvm: K2JVMCompiler defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main.<no name provided>[PropertyDescriptorImpl]

'CompileService' @ [137:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JS' @ [137:51] ==> enum entry JS defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'js' @ [137:57] ==> private final val js: K2JSCompiler defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main.<no name provided>[PropertyDescriptorImpl]

'CompileService' @ [138:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'METADATA' @ [138:51] ==> enum entry METADATA defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'metadata' @ [138:63] ==> private final val metadata: K2MetadataCompiler defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main.<no name provided>[PropertyDescriptorImpl]

'Timer' @ [142:25] ==> public constructor Timer(p0: Boolean) defined in java.util.Timer[JavaClassConstructorDescriptor]

'CompileServiceImpl' @ [143:35] ==> public constructor CompileServiceImpl(registry: Registry, compiler: CompilerSelector, compilerId: CompilerId, daemonOptions: DaemonOptions, daemonJVMOptions: DaemonJVMOptions, port: Int, timer: Timer, onShutdown: () -> Unit) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[ClassConstructorDescriptorImpl]

'registry' @ [143:65] ==> val registry: Registry defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'compilerSelector' @ [144:65] ==> val compilerSelector: <no name provided> defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'compilerId' @ [145:67] ==> val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'daemonOptions' @ [146:70] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'daemonJVMOptions' @ [147:73] ==> val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'port' @ [148:61] ==> val port: Int defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'timer' @ [149:62] ==> val timer: Timer defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'if (daemonOptions.forceShutdownTimeoutMilliseconds != COMPILE_DAEMON_TIMEOUT_INFINITE_MS) {
                                                             // running a watcher thread that ensures that if the daemon is not exited normally (may be due to RMI leftovers), it's forced to exit
                                                             timer.schedule(daemonOptions.forceShutdownTimeoutMilliseconds) {
                                                                 cancel()
                                                                 log.info("force JVM shutdown")
                                                                 System.exit(0)
                                                             }
                                                         }
                                                         else {
                                                             timer.cancel()
                                                         }' @ [151:58] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'daemonOptions' @ [151:62] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'forceShutdownTimeoutMilliseconds' @ [151:76] ==> public final var forceShutdownTimeoutMilliseconds: Long defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'COMPILE_DAEMON_TIMEOUT_INFINITE_MS' @ [151:112] ==> public val COMPILE_DAEMON_TIMEOUT_INFINITE_MS: Long defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'timer' @ [153:62] ==> val timer: Timer defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'schedule' @ [153:68] ==> @InlineOnly public inline fun Timer.schedule(delay: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'daemonOptions' @ [153:77] ==> val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'forceShutdownTimeoutMilliseconds' @ [153:91] ==> public final var forceShutdownTimeoutMilliseconds: Long defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'cancel' @ [154:66] ==> public open fun cancel(): Boolean defined in java.util.TimerTask[JavaMethodDescriptor]

'log' @ [155:66] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[PropertyDescriptorImpl]

'info' @ [155:70] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'exit' @ [156:73] ==> public open fun exit(p0: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'timer' @ [160:62] ==> val timer: Timer defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'cancel' @ [160:68] ==> public open fun cancel(): Unit defined in java.util.Timer[JavaMethodDescriptor]

'println' @ [164:13] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'COMPILE_DAEMON_IS_READY_MESSAGE' @ [164:21] ==> public val COMPILE_DAEMON_IS_READY_MESSAGE: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'log' @ [165:13] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[PropertyDescriptorImpl]

'info' @ [165:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'port' @ [165:53] ==> val port: Int defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'out' @ [169:20] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'close' @ [169:24] ==> public open fun close(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'err' @ [170:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'close' @ [170:24] ==> public open fun close(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'setErr' @ [172:20] ==> public open fun setErr(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'PrintStream' @ [172:27] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'LogStream' @ [172:39] ==> public constructor LogStream(name: String) defined in org.jetbrains.kotlin.daemon.LogStream[ClassConstructorDescriptorImpl]

'setOut' @ [173:20] ==> public open fun setOut(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'PrintStream' @ [173:27] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'LogStream' @ [173:39] ==> public constructor LogStream(name: String) defined in org.jetbrains.kotlin.daemon.LogStream[ClassConstructorDescriptorImpl]

'err' @ [176:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [176:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'+' @ [176:32] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [176:48] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'message' @ [176:50] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [177:13] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'printStackTrace' @ [177:15] ==> public open fun printStackTrace(p0: (PrintStream..PrintStream?)): Unit defined in java.lang.Exception[JavaMethodDescriptor]

'err' @ [177:38] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'log' @ [179:13] ==> public final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon[PropertyDescriptorImpl]

'log' @ [179:17] ==> public open fun log(p0: (Level..Level?), p1: (String..String?), p2: (Throwable..Throwable?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'INFO' @ [179:27] ==> public final val INFO: (Level..Level?) defined in java.util.logging.Level[JavaPropertyDescriptor]

'e' @ [179:48] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

'e' @ [181:19] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.daemon.KotlinCompileDaemon.main[LocalVariableDescriptor]

