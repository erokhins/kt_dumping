'subscription' @ [35:13] ==> private final var subscription: Subscription? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'unsubscribe' @ [35:27] ==> public abstract fun unsubscribe(): Unit defined in rx.Subscription[JavaMethodDescriptor]

'field' @ [37:13] ==> var field: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer.<set-progressTracker>[SyntheticFieldDescriptor]

'value' @ [37:21] ==> value-parameter value: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer.<set-progressTracker>[ValueParameterDescriptorImpl]

'!' @ [38:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'installedYet' @ [38:18] ==> private final var installedYet: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'setup' @ [39:17] ==> private final fun setup(): Unit defined in net.corda.node.utilities.ANSIProgressRenderer[SimpleFunctionDescriptorImpl]

'value' @ [43:17] ==> value-parameter value: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer.<set-progressTracker>[ValueParameterDescriptorImpl]

'prevMessagePrinted' @ [44:17] ==> private final var prevMessagePrinted: String? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'prevLinesDrawn' @ [45:17] ==> private final var prevLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'draw' @ [46:17] ==> @Synchronized private final fun draw(moveUp: Boolean, error: Throwable? = ...): Unit defined in net.corda.node.utilities.ANSIProgressRenderer[SimpleFunctionDescriptorImpl]

'subscription' @ [47:17] ==> private final var subscription: Subscription? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'value' @ [47:32] ==> value-parameter value: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer.<set-progressTracker>[ValueParameterDescriptorImpl]

'changes' @ [47:38] ==> public final val changes: Observable<ProgressTracker.Change> defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'subscribe' @ [47:46] ==> public final fun subscribe(p0: (((ProgressTracker.Change..ProgressTracker.Change?)) -> Unit..(((ProgressTracker.Change..ProgressTracker.Change?)) -> Unit)?), p1: (((Throwable..Throwable?)) -> Unit..(((Throwable..Throwable?)) -> Unit)?), p2: (() -> Unit..(() -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'draw' @ [47:58] ==> @Synchronized private final fun draw(moveUp: Boolean, error: Throwable? = ...): Unit defined in net.corda.node.utilities.ANSIProgressRenderer[SimpleFunctionDescriptorImpl]

'done' @ [47:74] ==> private final fun done(error: Throwable?): Unit defined in net.corda.node.utilities.ANSIProgressRenderer[SimpleFunctionDescriptorImpl]

'it' @ [47:79] ==> value-parameter it: (Throwable..Throwable?) defined in net.corda.node.utilities.ANSIProgressRenderer.<set-progressTracker>.<anonymous>[ValueParameterDescriptorImpl]

'done' @ [47:88] ==> private final fun done(error: Throwable?): Unit defined in net.corda.node.utilities.ANSIProgressRenderer[SimpleFunctionDescriptorImpl]

'error' @ [54:13] ==> value-parameter error: Throwable? defined in net.corda.node.utilities.ANSIProgressRenderer.done[ValueParameterDescriptorImpl]

'progressTracker' @ [54:28] ==> public final var progressTracker: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'draw' @ [55:9] ==> @Synchronized private final fun draw(moveUp: Boolean, error: Throwable? = ...): Unit defined in net.corda.node.utilities.ANSIProgressRenderer[SimpleFunctionDescriptorImpl]

'error' @ [55:20] ==> value-parameter error: Throwable? defined in net.corda.node.utilities.ANSIProgressRenderer.done[ValueParameterDescriptorImpl]

'invoke' @ [56:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'systemInstall' @ [60:21] ==> public open fun systemInstall(): Unit defined in org.fusesource.jansi.AnsiConsole[JavaMethodDescriptor]

'usingANSI' @ [65:9] ==> private final var usingANSI: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'wrapOutputStream' @ [65:33] ==> public open fun wrapOutputStream(p0: (OutputStream..OutputStream?)): (OutputStream..OutputStream?) defined in org.fusesource.jansi.AnsiConsole[JavaMethodDescriptor]

'out' @ [65:57] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'usingANSI' @ [67:13] ==> private final var usingANSI: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'getContext' @ [71:38] ==> public open fun getContext(p0: Boolean): (LoggerContext..LoggerContext?) defined in org.apache.logging.log4j.LogManager[JavaMethodDescriptor]

'manager' @ [72:35] ==> val manager: LoggerContext defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'configuration' @ [72:43] ==> public final val LoggerContext.configuration: (Configuration..Configuration?)[MyPropertyDescriptor]

'appenders' @ [72:57] ==> public final val Configuration.appenders: (MutableMap<(String..String?), (Appender..Appender?)>..Map<(String..String?), (Appender..Appender?)>?)[MyPropertyDescriptor]

'values' @ [72:67] ==> public abstract val values: MutableCollection<(Appender..Appender?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'filterIsInstance' @ [72:74] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ConsoleAppender> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ConsoleAppender

'single' @ [72:110] ==> public inline fun <T> Iterable<ConsoleAppender>.single(predicate: (ConsoleAppender) -> Boolean): ConsoleAppender defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConsoleAppender

'it' @ [72:119] ==> value-parameter it: ConsoleAppender defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [72:122] ==> public final val ConsoleAppender.name: (String..String?)[MyPropertyDescriptor]

'AbstractOutputStreamAppender<OutputStreamManager>' @ [73:46] ==> protected/*protected and package*/ constructor AbstractOutputStreamAppender<M : (OutputStreamManager..OutputStreamManager?)>(p0: (String..String?), p1: (Layout<out (Serializable..Serializable?)>..Layout<out (Serializable..Serializable?)>?), p2: (Filter..Filter?), p3: Boolean, p4: Boolean, p5: (OutputStreamManager..OutputStreamManager?)) defined in org.apache.logging.log4j.core.appender.AbstractOutputStreamAppender[JavaClassConstructorDescriptor]
Inferred types:
    <M : (OutputStreamManager..OutputStreamManager?)> -> OutputStreamManager

'consoleAppender' @ [74:21] ==> val consoleAppender: ConsoleAppender defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'name' @ [74:37] ==> public final val ConsoleAppender.name: (String..String?)[MyPropertyDescriptor]

'consoleAppender' @ [74:43] ==> val consoleAppender: ConsoleAppender defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'layout' @ [74:59] ==> public final val ConsoleAppender.layout: (Layout<out (Serializable..Serializable?)>..Layout<out (Serializable..Serializable?)>?)[MyPropertyDescriptor]

'consoleAppender' @ [74:67] ==> val consoleAppender: ConsoleAppender defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'filter' @ [74:83] ==> public final val ConsoleAppender.filter: (Filter..Filter?)[MyPropertyDescriptor]

'consoleAppender' @ [75:21] ==> val consoleAppender: ConsoleAppender defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'ignoreExceptions' @ [75:37] ==> public open fun ignoreExceptions(): Boolean defined in org.apache.logging.log4j.core.appender.ConsoleAppender[JavaMethodDescriptor]

'consoleAppender' @ [75:63] ==> val consoleAppender: ConsoleAppender defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'manager' @ [75:79] ==> public final val ConsoleAppender.manager: (OutputStreamManager..OutputStreamManager?)[MyPropertyDescriptor]

'synchronized' @ [80:21] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'ANSIProgressRenderer' @ [80:34] ==> public object ANSIProgressRenderer defined in net.corda.node.utilities in file ANSIProgressRenderer.kt[FakeCallableDescriptorForObject]

'progressTracker' @ [81:29] ==> public final var progressTracker: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'ansi' @ [82:45] ==> public open fun ansi(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'repeat' @ [83:29] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'prevLinesDrawn' @ [83:36] ==> private final var prevLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'ansi' @ [83:54] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<no name provided>.append.<anonymous>[LocalVariableDescriptor]

'eraseLine' @ [83:59] ==> public open fun eraseLine(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'cursorUp' @ [83:71] ==> public open fun cursorUp(p0: Int): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'eraseLine' @ [83:83] ==> public open fun eraseLine(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'out' @ [84:36] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'print' @ [84:40] ==> public open fun print(p0: (Any..Any?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'ansi' @ [84:46] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<no name provided>.append.<anonymous>[LocalVariableDescriptor]

'out' @ [85:36] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [85:40] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'super' @ [88:25] ==> <this> defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<no name provided>[LazyClassReceiverParameterDescriptor]

'append' @ [88:31] ==> public open fun append(p0: (LogEvent..LogEvent?)): Unit defined in org.apache.logging.log4j.core.appender.AbstractOutputStreamAppender[JavaMethodDescriptor]

'event' @ [88:38] ==> value-parameter event: LogEvent defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<no name provided>.append[ValueParameterDescriptorImpl]

'progressTracker' @ [90:29] ==> public final var progressTracker: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'draw' @ [91:29] ==> @Synchronized private final fun draw(moveUp: Boolean, error: Throwable? = ...): Unit defined in net.corda.node.utilities.ANSIProgressRenderer[SimpleFunctionDescriptorImpl]

'scrollingAppender' @ [95:13] ==> val scrollingAppender: <no name provided> defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'start' @ [95:31] ==> public open fun start(): Unit defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<no name provided>[JavaMethodDescriptor]

'manager' @ [96:13] ==> val manager: LoggerContext defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'configuration' @ [96:21] ==> public final val LoggerContext.configuration: (Configuration..Configuration?)[MyPropertyDescriptor]

'appenders' @ [96:35] ==> public final val Configuration.appenders: (MutableMap<(String..String?), (Appender..Appender?)>..Map<(String..String?), (Appender..Appender?)>?)[MyPropertyDescriptor]

'consoleAppender' @ [96:45] ==> val consoleAppender: ConsoleAppender defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'name' @ [96:61] ==> public final val ConsoleAppender.name: (String..String?)[MyPropertyDescriptor]

'scrollingAppender' @ [96:69] ==> val scrollingAppender: <no name provided> defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'manager' @ [97:33] ==> val manager: LoggerContext defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'configuration' @ [97:41] ==> public final val LoggerContext.configuration: (Configuration..Configuration?)[MyPropertyDescriptor]

'loggers' @ [97:55] ==> public final val Configuration.loggers: (MutableMap<(String..String?), (LoggerConfig..LoggerConfig?)>..Map<(String..String?), (LoggerConfig..LoggerConfig?)>?)[MyPropertyDescriptor]

'values' @ [97:63] ==> public abstract val values: MutableCollection<(LoggerConfig..LoggerConfig?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'loggerConfigs' @ [98:28] ==> val loggerConfigs: MutableCollection<(LoggerConfig..LoggerConfig?)> defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'config' @ [99:36] ==> val config: (LoggerConfig..LoggerConfig?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'appenderRefs' @ [99:43] ==> public final val LoggerConfig.appenderRefs: (MutableList<(AppenderRef..AppenderRef?)>..List<(AppenderRef..AppenderRef?)>?)[MyPropertyDescriptor]

'config' @ [100:40] ==> val config: (LoggerConfig..LoggerConfig?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'appenders' @ [100:47] ==> public final val LoggerConfig.appenders: (MutableMap<(String..String?), (Appender..Appender?)>..Map<(String..String?), (Appender..Appender?)>?)[MyPropertyDescriptor]

'filter' @ [100:57] ==> public inline fun <K, V> Map<out (String..String?), (Appender..Appender?)>.filter(predicate: (Map.Entry<(String..String?), (Appender..Appender?)>) -> Boolean): Map<(String..String?), (Appender..Appender?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (org.apache.logging.log4j.core.Appender..org.apache.logging.log4j.core.Appender?)

'it' @ [100:66] ==> value-parameter it: Map.Entry<(String..String?), (Appender..Appender?)> defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [100:69] ==> public abstract val value: (Appender..Appender?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'keys' @ [100:96] ==> public abstract val keys: Set<(String..String?)> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'consoleAppenders' @ [101:17] ==> val consoleAppenders: Set<(String..String?)> defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'forEach' @ [101:34] ==> @HidesMembers public inline fun <T> Iterable<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'config' @ [101:44] ==> val config: (LoggerConfig..LoggerConfig?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'removeAppender' @ [101:51] ==> public open fun removeAppender(p0: (String..String?)): Unit defined in org.apache.logging.log4j.core.config.LoggerConfig[JavaMethodDescriptor]

'it' @ [101:66] ==> value-parameter it: (String..String?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<anonymous>[ValueParameterDescriptorImpl]

'appenderRefs' @ [102:17] ==> val appenderRefs: (MutableList<(AppenderRef..AppenderRef?)>..List<(AppenderRef..AppenderRef?)>?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'forEach' @ [102:30] ==> @HidesMembers public inline fun <T> Iterable<(AppenderRef..AppenderRef?)>.forEach(action: ((AppenderRef..AppenderRef?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.apache.logging.log4j.core.config.AppenderRef..org.apache.logging.log4j.core.config.AppenderRef?)

'config' @ [102:40] ==> val config: (LoggerConfig..LoggerConfig?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'addAppender' @ [102:47] ==> public open fun addAppender(p0: (Appender..Appender?), p1: (Level..Level?), p2: (Filter..Filter?)): Unit defined in org.apache.logging.log4j.core.config.LoggerConfig[JavaMethodDescriptor]

'manager' @ [102:59] ==> val manager: LoggerContext defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'configuration' @ [102:67] ==> public final val LoggerContext.configuration: (Configuration..Configuration?)[MyPropertyDescriptor]

'appenders' @ [102:81] ==> public final val Configuration.appenders: (MutableMap<(String..String?), (Appender..Appender?)>..Map<(String..String?), (Appender..Appender?)>?)[MyPropertyDescriptor]

'it' @ [102:91] ==> value-parameter it: (AppenderRef..AppenderRef?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<anonymous>[ValueParameterDescriptorImpl]

'ref' @ [102:94] ==> public final val AppenderRef.ref: (String..String?)[MyPropertyDescriptor]

'it' @ [102:100] ==> value-parameter it: (AppenderRef..AppenderRef?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<anonymous>[ValueParameterDescriptorImpl]

'level' @ [102:103] ==> public final val AppenderRef.level: (Level..Level?)[MyPropertyDescriptor]

'it' @ [102:110] ==> value-parameter it: (AppenderRef..AppenderRef?) defined in net.corda.node.utilities.ANSIProgressRenderer.setup.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [102:113] ==> public final val AppenderRef.filter: (Filter..Filter?)[MyPropertyDescriptor]

'manager' @ [104:13] ==> val manager: LoggerContext defined in net.corda.node.utilities.ANSIProgressRenderer.setup[LocalVariableDescriptor]

'updateLoggers' @ [104:21] ==> public open fun updateLoggers(): Unit defined in org.apache.logging.log4j.core.LoggerContext[JavaMethodDescriptor]

'installedYet' @ [107:9] ==> private final var installedYet: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'Synchronized' @ [115:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'!' @ [116:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'usingANSI' @ [116:14] ==> private final var usingANSI: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'progressTracker' @ [117:34] ==> public final var progressTracker: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'currentStepRecursive' @ [117:51] ==> public final val currentStepRecursive: ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'label' @ [117:73] ==> public open val label: String defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedPropertyDescriptor]

'currentMessage' @ [118:17] ==> val currentMessage: String? defined in net.corda.node.utilities.ANSIProgressRenderer.draw[LocalVariableDescriptor]

'currentMessage' @ [118:43] ==> val currentMessage: String? defined in net.corda.node.utilities.ANSIProgressRenderer.draw[LocalVariableDescriptor]

'prevMessagePrinted' @ [118:61] ==> private final var prevMessagePrinted: String? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'println' @ [119:17] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'currentMessage' @ [119:25] ==> val currentMessage: String? defined in net.corda.node.utilities.ANSIProgressRenderer.draw[LocalVariableDescriptor]

'prevMessagePrinted' @ [120:17] ==> private final var prevMessagePrinted: String? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'currentMessage' @ [120:38] ==> val currentMessage: String? defined in net.corda.node.utilities.ANSIProgressRenderer.draw[LocalVariableDescriptor]

'Emoji' @ [125:9] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'renderIfSupported' @ [125:15] ==> public final inline fun <T> renderIfSupported(body: () -> Unit): Unit defined in net.corda.core.internal.Emoji[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ansi' @ [127:29] ==> public open fun ansi(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'prevLinesDrawn' @ [128:17] ==> private final var prevLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'moveUp' @ [128:39] ==> value-parameter moveUp: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer.draw[ValueParameterDescriptorImpl]

'ansi' @ [129:17] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'cursorUp' @ [129:22] ==> public open fun cursorUp(p0: Int): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'prevLinesDrawn' @ [129:31] ==> private final var prevLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'ansi' @ [132:13] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'eraseLine' @ [132:18] ==> public open fun eraseLine(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'ansi' @ [133:13] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'newline' @ [133:18] ==> public open fun newline(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'progressTracker' @ [134:22] ==> public final var progressTracker: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'+' @ [135:33] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'pt' @ [135:37] ==> val pt: ProgressTracker defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'renderLevel' @ [135:40] ==> private final fun ProgressTracker.renderLevel(ansi: Ansi, indent: Int, error: Boolean): Int defined in net.corda.node.utilities.ANSIProgressRenderer[SimpleFunctionDescriptorImpl]

'ansi' @ [135:52] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'error' @ [135:61] ==> value-parameter error: Throwable? = ... defined in net.corda.node.utilities.ANSIProgressRenderer.draw[ValueParameterDescriptorImpl]

'error' @ [137:17] ==> value-parameter error: Throwable? = ... defined in net.corda.node.utilities.ANSIProgressRenderer.draw[ValueParameterDescriptorImpl]

'ansi' @ [138:17] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'a' @ [138:22] ==> public open fun a(p0: (String..String?)): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'Emoji' @ [138:27] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'skullAndCrossbones' @ [138:33] ==> public final val skullAndCrossbones: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'error' @ [138:55] ==> value-parameter error: Throwable? = ... defined in net.corda.node.utilities.ANSIProgressRenderer.draw[ValueParameterDescriptorImpl]

'message' @ [138:61] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'ansi' @ [139:17] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'eraseLine' @ [139:22] ==> public open fun eraseLine(p0: (Ansi.Erase..Ansi.Erase?)): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'FORWARD' @ [139:43] ==> enum entry FORWARD defined in org.fusesource.jansi.Ansi.Erase[FakeCallableDescriptorForObject]

'ansi' @ [140:17] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'newline' @ [140:22] ==> public open fun newline(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'newLinesDrawn' @ [141:17] ==> var newLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'newLinesDrawn' @ [144:17] ==> var newLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'prevLinesDrawn' @ [144:33] ==> private final var prevLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'prevLinesDrawn' @ [146:36] ==> private final var prevLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'newLinesDrawn' @ [146:53] ==> var newLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'repeat' @ [147:17] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'linesToClear' @ [147:24] ==> val linesToClear: Int defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'ansi' @ [148:21] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'eraseLine' @ [148:26] ==> public open fun eraseLine(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'ansi' @ [149:21] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'newline' @ [149:26] ==> public open fun newline(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'ansi' @ [151:17] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'cursorUp' @ [151:22] ==> public open fun cursorUp(p0: Int): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'linesToClear' @ [151:31] ==> val linesToClear: Int defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'prevLinesDrawn' @ [153:13] ==> private final var prevLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer[PropertyDescriptorImpl]

'newLinesDrawn' @ [153:30] ==> var newLinesDrawn: Int defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'out' @ [156:20] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'print' @ [156:24] ==> public open fun print(p0: (Any..Any?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'ansi' @ [156:30] ==> val ansi: (Ansi..Ansi?) defined in net.corda.node.utilities.ANSIProgressRenderer.draw.<anonymous>[LocalVariableDescriptor]

'out' @ [157:20] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'flush' @ [157:24] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'with' @ [164:9] ==> @InlineOnly public inline fun <T, R> with(receiver: Ansi, block: Ansi.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Ansi
    <R> -> Nothing

'ansi' @ [164:14] ==> value-parameter ansi: Ansi defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel[ValueParameterDescriptorImpl]

'component1' @ [166:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [166:26] ==> public final operator fun component2(): ProgressTracker.Step defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'steps' @ [166:35] ==> public final val steps: Array<ProgressTracker.Step> defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'withIndex' @ [166:41] ==> public fun <T> Array<out ProgressTracker.Step>.withIndex(): Iterable<IndexedValue<ProgressTracker.Step>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Step

'step' @ [168:21] ==> val step: ProgressTracker.Step defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'UNSTARTED' @ [168:45] ==> public object UNSTARTED : ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[FakeCallableDescriptorForObject]

'indent' @ [169:21] ==> value-parameter indent: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel[ValueParameterDescriptorImpl]

'step' @ [169:35] ==> val step: ProgressTracker.Step defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'DONE' @ [169:59] ==> public object DONE : ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[FakeCallableDescriptorForObject]

'when {
                    index < stepIndex -> "${Emoji.greenTick} "
                    index == stepIndex && step == ProgressTracker.DONE -> "${Emoji.greenTick} "
                    index == stepIndex -> "${Emoji.rightArrow} "
                    error -> "${Emoji.noEntry} "
                    else -> "    "   // Not reached yet.
                }' @ [171:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'index' @ [172:21] ==> val index: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'stepIndex' @ [172:29] ==> public final var stepIndex: Int defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'Emoji' @ [172:45] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'greenTick' @ [172:51] ==> public final val greenTick: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'index' @ [173:21] ==> val index: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'stepIndex' @ [173:30] ==> public final var stepIndex: Int defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'step' @ [173:43] ==> val step: ProgressTracker.Step defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'DONE' @ [173:67] ==> public object DONE : ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[FakeCallableDescriptorForObject]

'Emoji' @ [173:78] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'greenTick' @ [173:84] ==> public final val greenTick: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'index' @ [174:21] ==> val index: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'stepIndex' @ [174:30] ==> public final var stepIndex: Int defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'Emoji' @ [174:46] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'rightArrow' @ [174:52] ==> public final val rightArrow: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'error' @ [175:21] ==> value-parameter error: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel[ValueParameterDescriptorImpl]

'Emoji' @ [175:33] ==> public object Emoji defined in net.corda.core.internal[FakeCallableDescriptorForObject]

'noEntry' @ [175:39] ==> public final val noEntry: String defined in net.corda.core.internal.Emoji[DeserializedPropertyDescriptor]

'a' @ [178:17] ==> public open fun a(p0: (String..String?)): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'repeat' @ [178:26] ==> public fun CharSequence.repeat(n: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'indent' @ [178:33] ==> value-parameter indent: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel[ValueParameterDescriptorImpl]

'a' @ [179:17] ==> public open fun a(p0: (String..String?)): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'marker' @ [179:19] ==> val marker: String defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'index' @ [181:30] ==> val index: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'stepIndex' @ [181:39] ==> public final var stepIndex: Int defined in net.corda.core.utilities.ProgressTracker[DeserializedPropertyDescriptor]

'step' @ [181:52] ==> val step: ProgressTracker.Step defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'DONE' @ [181:76] ==> public object DONE : ProgressTracker.Step defined in net.corda.core.utilities.ProgressTracker[FakeCallableDescriptorForObject]

'active' @ [182:21] ==> val active: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'bold' @ [182:29] ==> public open fun bold(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'a' @ [183:17] ==> public open fun a(p0: (String..String?)): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'step' @ [183:19] ==> val step: ProgressTracker.Step defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'label' @ [183:24] ==> public open val label: String defined in net.corda.core.utilities.ProgressTracker.Step[DeserializedPropertyDescriptor]

'active' @ [184:21] ==> val active: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'boldOff' @ [184:29] ==> public open fun boldOff(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'eraseLine' @ [186:17] ==> public open fun eraseLine(p0: (Ansi.Erase..Ansi.Erase?)): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'FORWARD' @ [186:38] ==> enum entry FORWARD defined in org.fusesource.jansi.Ansi.Erase[FakeCallableDescriptorForObject]

'newline' @ [187:17] ==> public open fun newline(): (Ansi..Ansi?) defined in org.fusesource.jansi.Ansi[JavaMethodDescriptor]

'lines' @ [188:17] ==> var lines: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'getChildProgressTracker' @ [190:29] ==> public final fun getChildProgressTracker(step: ProgressTracker.Step): ProgressTracker? defined in net.corda.core.utilities.ProgressTracker[DeserializedSimpleFunctionDescriptor]

'step' @ [190:53] ==> val step: ProgressTracker.Step defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'child' @ [191:21] ==> val child: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'lines' @ [192:21] ==> var lines: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'child' @ [192:30] ==> val child: ProgressTracker? defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

'renderLevel' @ [192:36] ==> private final fun ProgressTracker.renderLevel(ansi: Ansi, indent: Int, error: Boolean): Int defined in net.corda.node.utilities.ANSIProgressRenderer[SimpleFunctionDescriptorImpl]

'ansi' @ [192:48] ==> value-parameter ansi: Ansi defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel[ValueParameterDescriptorImpl]

'indent' @ [192:54] ==> value-parameter indent: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel[ValueParameterDescriptorImpl]

'error' @ [192:66] ==> value-parameter error: Boolean defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel[ValueParameterDescriptorImpl]

'lines' @ [194:20] ==> var lines: Int defined in net.corda.node.utilities.ANSIProgressRenderer.renderLevel.<anonymous>[LocalVariableDescriptor]

