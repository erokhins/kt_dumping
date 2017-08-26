'replConfiguration' @ [38:25] ==> value-parameter replConfiguration: ReplConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.<init>[ValueParameterDescriptorImpl]

'AtomicInteger' @ [40:30] ==> public constructor AtomicInteger() defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'arrayListOf' @ [42:43] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'configuration' @ [44:34] ==> private final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'getList' @ [44:48] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>): (MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContentRoot

'CONTENT_ROOTS' @ [44:77] ==> public final val CONTENT_ROOTS: (CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>..CompilerConfigurationKey<(MutableList<(ContentRoot..ContentRoot?)>..List<(ContentRoot..ContentRoot?)>?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'mapNotNull' @ [44:92] ==> public inline fun <T, R : Any> Iterable<(ContentRoot..ContentRoot?)>.mapNotNull(transform: ((ContentRoot..ContentRoot?)) -> File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.config.ContentRoot..org.jetbrains.kotlin.config.ContentRoot?)
    <R : Any> -> File

'when (root) {
            is JvmModulePathRoot -> root.file // TODO: only add required modules
            is JvmClasspathRoot -> root.file
            else -> null
        }' @ [45:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: File?, entry1: File?, entry2: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> File?

'root' @ [45:15] ==> value-parameter root: (ContentRoot..ContentRoot?) defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.classpathRoots.<anonymous>[ValueParameterDescriptorImpl]

'root' @ [46:37] ==> value-parameter root: (ContentRoot..ContentRoot?) defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.classpathRoots.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [46:42] ==> public open val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmModulePathRoot[PropertyDescriptorImpl]

'root' @ [47:36] ==> value-parameter root: (ContentRoot..ContentRoot?) defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.classpathRoots.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [47:41] ==> public open val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmClasspathRoot[PropertyDescriptorImpl]

'ReplClassLoader' @ [51:31] ==> public constructor ReplClassLoader(@NotNull p0: ClassLoader) defined in org.jetbrains.kotlin.cli.common.repl.ReplClassLoader[JavaClassConstructorDescriptor]

'URLClassLoader' @ [51:47] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'classpathRoots' @ [51:62] ==> private final val classpathRoots: List<File> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'map' @ [51:77] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [51:83] ==> value-parameter it: File defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.classLoader.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [51:86] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [51:94] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [51:104] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'WITHOUT_PATHS' @ [55:55] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'hasErrors' @ [58:13] ==> private final var hasErrors: Boolean defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.messageCollector.<no name provided>[PropertyDescriptorImpl]

'messageRenderer' @ [62:23] ==> private final val messageRenderer: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.messageCollector.<no name provided>[PropertyDescriptorImpl]

'render' @ [62:39] ==> public abstract fun render(@NotNull severity: CompilerMessageSeverity, @NotNull message: String, @Nullable location: CompilerMessageLocation?): (String..String?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaMethodDescriptor]

'severity' @ [62:46] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.messageCollector.<no name provided>.report[ValueParameterDescriptorImpl]

'message' @ [62:56] ==> value-parameter message: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.messageCollector.<no name provided>.report[ValueParameterDescriptorImpl]

'location' @ [62:65] ==> value-parameter location: CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.messageCollector.<no name provided>.report[ValueParameterDescriptorImpl]

'trimEnd' @ [62:75] ==> @InlineOnly public inline fun String.trimEnd(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'with' @ [63:13] ==> @InlineOnly public inline fun <T, R> with(receiver: ReplWriter, block: ReplWriter.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplWriter
    <R> -> Unit

'replConfiguration' @ [63:19] ==> private final val replConfiguration: ReplConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'writer' @ [63:37] ==> public abstract val writer: ReplWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplConfiguration[PropertyDescriptorImpl]

'when (severity) {
                    CompilerMessageSeverity.EXCEPTION -> sendInternalErrorReport(msg)
                    CompilerMessageSeverity.ERROR -> outputCompileError(msg)
                    CompilerMessageSeverity.STRONG_WARNING -> {} // TODO consider reporting this and two below
                    CompilerMessageSeverity.WARNING -> {}
                    CompilerMessageSeverity.INFO -> {}
                    else -> {}
                }' @ [64:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'severity' @ [64:23] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.messageCollector.<no name provided>.report[ValueParameterDescriptorImpl]

'EXCEPTION' @ [65:45] ==> enum entry EXCEPTION defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'sendInternalErrorReport' @ [65:58] ==> public abstract fun sendInternalErrorReport(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'msg' @ [65:82] ==> val msg: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.messageCollector.<no name provided>.report[LocalVariableDescriptor]

'ERROR' @ [66:45] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'outputCompileError' @ [66:54] ==> public abstract fun outputCompileError(x: String): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.messages.ReplWriter[SimpleFunctionDescriptorImpl]

'msg' @ [66:73] ==> val msg: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.messageCollector.<no name provided>.report[LocalVariableDescriptor]

'STRONG_WARNING' @ [67:45] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'WARNING' @ [68:45] ==> enum entry WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'INFO' @ [69:45] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'hasErrors' @ [75:45] ==> private final var hasErrors: Boolean defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.messageCollector.<no name provided>[PropertyDescriptorImpl]

'lazy' @ [79:49] ==> public fun <T> lazy(initializer: () -> GenericReplCompiler): Lazy<GenericReplCompiler> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplCompiler

'GenericReplCompiler' @ [80:9] ==> public constructor GenericReplCompiler(disposable: Disposable, scriptDefinition: KotlinScriptDefinition, compilerConfiguration: CompilerConfiguration, messageCollector: MessageCollector) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[ClassConstructorDescriptorImpl]

'disposable' @ [80:29] ==> value-parameter disposable: Disposable defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.<init>[ValueParameterDescriptorImpl]

'REPL_LINE_AS_SCRIPT_DEFINITION' @ [80:41] ==> private final val REPL_LINE_AS_SCRIPT_DEFINITION: <no name provided> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.Companion[PropertyDescriptorImpl]

'configuration' @ [80:73] ==> private final val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'messageCollector' @ [80:88] ==> private final val messageCollector: <no name provided> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'lazy' @ [82:55] ==> public fun <T> lazy(initializer: () -> GenericReplCompilingEvaluator): Lazy<GenericReplCompilingEvaluator> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GenericReplCompilingEvaluator

'GenericReplCompilingEvaluator' @ [83:9] ==> public constructor GenericReplCompilingEvaluator(compiler: ReplCompiler, baseClasspath: Iterable<File>, baseClassloader: ClassLoader? = ..., fallbackScriptArgs: ScriptArgsWithTypes? = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[DeserializedClassConstructorDescriptor]

'scriptCompiler' @ [83:39] ==> private final val scriptCompiler: ReplCompiler defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'classpathRoots' @ [83:55] ==> private final val classpathRoots: List<File> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'classLoader' @ [83:71] ==> private final val classLoader: ReplClassLoader defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'REPEAT_ANY_PREVIOUS' @ [83:108] ==> enum entry REPEAT_ANY_PREVIOUS defined in org.jetbrains.kotlin.cli.common.repl.ReplRepeatingMode[FakeCallableDescriptorForObject]

'lazy' @ [86:30] ==> public fun <T> lazy(initializer: () -> IReplStageState<out Any?>): Lazy<IReplStageState<out Any?>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IReplStageState<out Any?>

'scriptEvaluator' @ [86:37] ==> private final val scriptEvaluator: ReplFullEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'createState' @ [86:53] ==> public abstract fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.ReplFullEvaluator[DeserializedSimpleFunctionDescriptor]

'previousIncompleteLines' @ [90:25] ==> private final val previousIncompleteLines: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'line' @ [90:51] ==> value-parameter line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.eval[ValueParameterDescriptorImpl]

'joinToString' @ [90:57] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'scriptEvaluator' @ [94:27] ==> private final val scriptEvaluator: ReplFullEvaluator defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'compileAndEval' @ [94:43] ==> public abstract fun compileAndEval(state: IReplStageState<*>, codeLine: ReplCodeLine, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplFullEvaluator[DeserializedSimpleFunctionDescriptor]

'evalState' @ [94:58] ==> private final val evalState: IReplStageState<out Any?> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'ReplCodeLine' @ [94:69] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'lineNumber' @ [94:82] ==> private final val lineNumber: AtomicInteger defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'getAndIncrement' @ [94:93] ==> public final fun getAndIncrement(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'fullText' @ [94:115] ==> val fullText: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.eval[LocalVariableDescriptor]

'executeUserCode' @ [95:61] ==> private final fun <T> executeUserCode(body: () -> T): T defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'invoke' @ [95:79] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'when {
                evalRes !is ReplEvalResult.Incomplete -> previousIncompleteLines.clear()
                allowIncompleteLines -> previousIncompleteLines.add(line)
                else -> return ReplEvalResult.Error.CompileTime("incomplete code")
            }' @ [98:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'evalRes' @ [99:17] ==> val evalRes: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.eval[LocalVariableDescriptor]

'previousIncompleteLines' @ [99:58] ==> private final val previousIncompleteLines: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'clear' @ [99:82] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'allowIncompleteLines' @ [100:17] ==> public open val allowIncompleteLines: Boolean defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'previousIncompleteLines' @ [100:41] ==> private final val previousIncompleteLines: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'add' @ [100:65] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'line' @ [100:69] ==> value-parameter line: String defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.eval[ValueParameterDescriptorImpl]

'ReplEvalResult' @ [101:32] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult[FakeCallableDescriptorForObject]

'CompileTime' @ [101:53] ==> public constructor CompileTime(message: String, location: CompilerMessageLocation? = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Error.CompileTime[DeserializedClassConstructorDescriptor]

'evalRes' @ [103:20] ==> val evalRes: ReplEvalResult defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.eval[LocalVariableDescriptor]

'PrintWriter' @ [106:26] ==> public constructor PrintWriter(p0: (OutputStream..OutputStream?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'err' @ [106:45] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'classLoader' @ [107:13] ==> private final val classLoader: ReplClassLoader defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'dumpClasses' @ [107:25] ==> public open fun dumpClasses(@NotNull p0: PrintWriter): Unit defined in org.jetbrains.kotlin.cli.common.repl.ReplClassLoader[JavaMethodDescriptor]

'writer' @ [107:37] ==> val writer: PrintWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.eval[LocalVariableDescriptor]

'writer' @ [108:13] ==> val writer: PrintWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.eval[LocalVariableDescriptor]

'flush' @ [108:20] ==> public open fun flush(): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'e' @ [109:19] ==> val e: Throwable defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.eval[LocalVariableDescriptor]

'onUserCodeExecuting' @ [115:13] ==> public open fun onUserCodeExecuting(isExecuting: Boolean): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[SimpleFunctionDescriptorImpl]

'invoke' @ [116:20] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'onUserCodeExecuting' @ [119:13] ==> public open fun onUserCodeExecuting(isExecuting: Boolean): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[SimpleFunctionDescriptorImpl]

'classLoader' @ [124:9] ==> private final val classLoader: ReplClassLoader defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter[PropertyDescriptorImpl]

'dumpClasses' @ [124:21] ==> public open fun dumpClasses(@NotNull p0: PrintWriter): Unit defined in org.jetbrains.kotlin.cli.common.repl.ReplClassLoader[JavaMethodDescriptor]

'out' @ [124:33] ==> value-parameter out: PrintWriter defined in org.jetbrains.kotlin.cli.jvm.repl.ReplInterpreter.dumpClasses[ValueParameterDescriptorImpl]

'KotlinScriptDefinition' @ [128:63] ==> public constructor KotlinScriptDefinition(template: KClass<out Any>) defined in org.jetbrains.kotlin.script.KotlinScriptDefinition[DeserializedClassConstructorDescriptor]

'Any' @ [128:86] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

