'ReentrantReadWriteLock' @ [24:144] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'BasicReplStageHistory' @ [27:79] ==> public constructor BasicReplStageHistory<T>(lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'lock' @ [27:101] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'history' @ [29:50] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'currentGeneration' @ [29:87] ==> public final val currentGeneration: AtomicInteger defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[PropertyDescriptorImpl]

'get' @ [29:105] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'makeReplClassLoader' @ [31:43] ==> internal fun makeReplClassLoader(baseClassloader: ClassLoader?, baseClasspath: Iterable<File>): ReplClassLoader defined in org.jetbrains.kotlin.cli.common.repl[SimpleFunctionDescriptorImpl]

'baseClassloader' @ [31:63] ==> value-parameter baseClassloader: ClassLoader? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState.<init>[ValueParameterDescriptorImpl]

'baseClasspath' @ [31:80] ==> value-parameter baseClasspath: Iterable<File> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState.<init>[ValueParameterDescriptorImpl]

'lock' @ [33:46] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'read' @ [33:51] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> List<File>): List<File> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<File>

'history' @ [34:9] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'peek' @ [34:17] ==> public open fun peek(): ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'item' @ [34:25] ==> public final val item: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'classLoader' @ [34:31] ==> public final val classLoader: ClassLoader defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'listAllUrlsAsFiles' @ [34:44] ==> internal fun ClassLoader.listAllUrlsAsFiles(): List<File> defined in org.jetbrains.kotlin.cli.common.repl[SimpleFunctionDescriptorImpl]

'topClassLoader' @ [35:12] ==> public final val topClassLoader: ReplClassLoader defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'listAllUrlsAsFiles' @ [35:27] ==> internal fun ClassLoader.listAllUrlsAsFiles(): List<File> defined in org.jetbrains.kotlin.cli.common.repl[SimpleFunctionDescriptorImpl]

'ReplClassLoader' @ [40:9] ==> public constructor ReplClassLoader(@NotNull parent: ClassLoader) defined in org.jetbrains.kotlin.cli.common.repl.ReplClassLoader[JavaClassConstructorDescriptor]

'URLClassLoader' @ [40:25] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'baseClasspath' @ [40:40] ==> value-parameter baseClasspath: Iterable<File> defined in org.jetbrains.kotlin.cli.common.repl.makeReplClassLoader[ValueParameterDescriptorImpl]

'map' @ [40:54] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> (URL..URL?)): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> (java.net.URL..java.net.URL?)

'it' @ [40:60] ==> value-parameter it: File defined in org.jetbrains.kotlin.cli.common.repl.makeReplClassLoader.<anonymous>[ValueParameterDescriptorImpl]

'toURI' @ [40:63] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [40:71] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'toTypedArray' @ [40:81] ==> public inline fun <reified T> Collection<(URL..URL?)>.toTypedArray(): Array<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (java.net.URL..java.net.URL?)

'baseClassloader' @ [40:97] ==> value-parameter baseClassloader: ClassLoader? defined in org.jetbrains.kotlin.cli.common.repl.makeReplClassLoader[ValueParameterDescriptorImpl]

