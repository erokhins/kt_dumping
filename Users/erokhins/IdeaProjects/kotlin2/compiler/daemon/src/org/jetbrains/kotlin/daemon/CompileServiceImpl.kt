'toSeconds' @ [77:41] ==> public open fun toSeconds(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'nanoTime' @ [77:58] ==> public open fun nanoTime(): Long defined in java.lang.System[JavaMethodDescriptor]

'arrayListOf' @ [88:41] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'onCompilationFinished' @ [91:9] ==> private final val onCompilationFinished: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.daemon.EventManagerImpl[PropertyDescriptorImpl]

'add' @ [91:31] ==> public open fun add(element: () -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'f' @ [91:35] ==> value-parameter f: () -> Unit defined in org.jetbrains.kotlin.daemon.EventManagerImpl.onCompilationFinished[ValueParameterDescriptorImpl]

'onCompilationFinished' @ [95:9] ==> private final val onCompilationFinished: ArrayList<() -> Unit> /* = ArrayList<() -> Unit> */ defined in org.jetbrains.kotlin.daemon.EventManagerImpl[PropertyDescriptorImpl]

'forEach' @ [95:31] ==> @HidesMembers public inline fun <T> Iterable<() -> Unit>.forEach(action: (() -> Unit) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'invoke' @ [95:41] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'getValue' @ [110:24] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'getLogger' @ [110:38] ==> @CallerSensitive public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in java.util.logging.Logger[JavaMethodDescriptor]

'setProperty' @ [113:16] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_COMPILER_ENVIRONMENT_KEEPALIVE_PROPERTY' @ [113:28] ==> public val KOTLIN_COMPILER_ENVIRONMENT_KEEPALIVE_PROPERTY: String defined in org.jetbrains.kotlin.cli.common[DeserializedPropertyDescriptor]

'aliveFlagPath' @ [118:38] ==> public final val aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[PropertyDescriptorImpl]

'let' @ [118:53] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'File' @ [118:59] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [118:64] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy.<get-isAlive>.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [118:68] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'disposable' @ [120:13] ==> private final var disposable: Disposable? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[PropertyDescriptorImpl]

'let' @ [120:25] ==> @InlineOnly public inline fun <T, R> Disposable.let(block: (Disposable) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Disposable
    <R> -> Unit

'dispose' @ [121:26] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'it' @ [121:34] ==> value-parameter it: Disposable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy.dispose.<anonymous>[ValueParameterDescriptorImpl]

'disposable' @ [122:17] ==> private final var disposable: Disposable? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[PropertyDescriptorImpl]

'AtomicInteger' @ [127:39] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'LazyClasspathWatcher' @ [129:36] ==> public constructor LazyClasspathWatcher(classpath: Iterable<String>, checkPeriod: Long = ..., digestCheckPeriod: Long = ...) defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[ClassConstructorDescriptorImpl]

'compilerId' @ [129:57] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'compilerClasspath' @ [129:68] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'ReentrantReadWriteLock' @ [138:28] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'hashMapOf' @ [139:76] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> /* = HashMap<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> ClientOrSessionProxy<Any>

'AtomicInteger' @ [140:41] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'lock' @ [142:75] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'write' @ [142:80] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Int): Int defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'getValidId' @ [143:25] ==> internal inline fun getValidId(counter: AtomicInteger, check: (Int) -> Boolean): Int defined in org.jetbrains.kotlin.daemon in file KotlinRemoteReplService.kt[SimpleFunctionDescriptorImpl]

'sessionsIdCounter' @ [143:36] ==> private final val sessionsIdCounter: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'it' @ [144:17] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.leaseSession.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'NO_SESSION' @ [144:38] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'!' @ [144:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sessions' @ [144:53] ==> private final val sessions: MutableMap<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'containsKey' @ [144:62] ==> public abstract fun containsKey(key: Int): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'it' @ [144:74] ==> value-parameter it: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.leaseSession.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sessions' @ [146:13] ==> private final val sessions: MutableMap<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'put' @ [146:22] ==> public abstract fun put(key: Int, value: CompileServiceImpl.ClientOrSessionProxy<Any>): CompileServiceImpl.ClientOrSessionProxy<Any>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'newId' @ [146:26] ==> val newId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.leaseSession.<anonymous>[LocalVariableDescriptor]

'session' @ [146:33] ==> value-parameter session: CompileServiceImpl.ClientOrSessionProxy<T> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.leaseSession[ValueParameterDescriptorImpl]

'newId' @ [147:13] ==> val newId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.leaseSession.<anonymous>[LocalVariableDescriptor]

'lock' @ [150:34] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'read' @ [150:39] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Boolean): Boolean defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'sessions' @ [150:46] ==> private final val sessions: MutableMap<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'isEmpty' @ [150:55] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'lock' @ [152:44] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'read' @ [152:49] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> CompileServiceImpl.ClientOrSessionProxy<Any>?): CompileServiceImpl.ClientOrSessionProxy<Any>? defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClientOrSessionProxy<Any>?

'sessions' @ [152:56] ==> private final val sessions: MutableMap<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'sessionId' @ [152:65] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.get[ValueParameterDescriptorImpl]

'lock' @ [154:47] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'write' @ [154:52] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Boolean): Boolean defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'sessions' @ [155:13] ==> private final val sessions: MutableMap<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'remove' @ [155:22] ==> public abstract fun remove(key: Int): CompileServiceImpl.ClientOrSessionProxy<Any>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'sessionId' @ [155:29] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.remove[ValueParameterDescriptorImpl]

'apply' @ [155:41] ==> @InlineOnly public inline fun <T> CompileServiceImpl.ClientOrSessionProxy<Any>.apply(block: CompileServiceImpl.ClientOrSessionProxy<Any>.() -> Unit): CompileServiceImpl.ClientOrSessionProxy<Any> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClientOrSessionProxy<Any>

'dispose' @ [155:49] ==> public final fun dispose(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[SimpleFunctionDescriptorImpl]

'lock' @ [160:13] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'read' @ [160:18] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'sessions' @ [161:32] ==> private final val sessions: MutableMap<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'filterValues' @ [161:41] ==> public inline fun <K, V> Map<out Int, CompileServiceImpl.ClientOrSessionProxy<Any>>.filterValues(predicate: (CompileServiceImpl.ClientOrSessionProxy<Any>) -> Boolean): Map<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> ClientOrSessionProxy<Any>

'!' @ [161:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [161:57] ==> value-parameter it: CompileServiceImpl.ClientOrSessionProxy<Any> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.cleanDead.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isAlive' @ [161:60] ==> public final val isAlive: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[PropertyDescriptorImpl]

'toRemove' @ [162:21] ==> val toRemove: Map<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.cleanDead.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [162:30] ==> @InlineOnly public inline fun <K, V> Map<out Int, CompileServiceImpl.ClientOrSessionProxy<Any>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> ClientOrSessionProxy<Any>

'anyDead' @ [163:21] ==> var anyDead: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.cleanDead[LocalVariableDescriptor]

'lock' @ [164:21] ==> private final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'write' @ [164:26] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'toRemove' @ [165:25] ==> val toRemove: Map<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.cleanDead.<anonymous>[LocalVariableDescriptor]

'forEach' @ [165:34] ==> @HidesMembers public inline fun <K, V> Map<out Int, CompileServiceImpl.ClientOrSessionProxy<Any>>.forEach(action: (Map.Entry<Int, CompileServiceImpl.ClientOrSessionProxy<Any>>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> ClientOrSessionProxy<Any>

'sessions' @ [165:44] ==> private final val sessions: MutableMap<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[PropertyDescriptorImpl]

'remove' @ [165:53] ==> public abstract fun remove(key: Int): CompileServiceImpl.ClientOrSessionProxy<Any>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'it' @ [165:60] ==> value-parameter it: Map.Entry<Int, CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.cleanDead.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [165:63] ==> public abstract val key: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'dispose' @ [165:69] ==> public final fun dispose(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[SimpleFunctionDescriptorImpl]

'anyDead' @ [169:20] ==> var anyDead: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer.cleanDead[LocalVariableDescriptor]

'ReentrantReadWriteLock' @ [176:35] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'hashSetOf' @ [177:76] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<CompileServiceImpl.ClientOrSessionProxy<Any>> /* = HashSet<CompileServiceImpl.ClientOrSessionProxy<Any>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClientOrSessionProxy<Any>

'SessionsContainer' @ [179:24] ==> public constructor SessionsContainer() defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[ClassConstructorDescriptorImpl]

'AtomicBoolean' @ [181:37] ==> public constructor AtomicBoolean(p0: Boolean) defined in java.util.concurrent.atomic.AtomicBoolean[JavaClassConstructorDescriptor]

'AtomicInteger' @ [183:21] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'ordinal' @ [183:51] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[DeserializedPropertyDescriptor]

'clientProxies' @ [185:44] ==> private final val clientProxies: MutableSet<CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'size' @ [185:58] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'clientsLock' @ [188:13] ==> private final val clientsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'write' @ [188:25] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Boolean): Boolean defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'clientProxies' @ [189:17] ==> private final val clientProxies: MutableSet<CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'add' @ [189:31] ==> public abstract fun add(element: CompileServiceImpl.ClientOrSessionProxy<Any>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'ClientOrSessionProxy' @ [189:35] ==> public constructor ClientOrSessionProxy<out T : Any>(aliveFlagPath: String?, data: Any? = ..., disposable: Disposable? = ...) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> Any

'aliveFlagPath' @ [189:56] ==> value-parameter aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>.addClient[ValueParameterDescriptorImpl]

'clientsLock' @ [193:51] ==> private final val clientsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'read' @ [193:63] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> List<String>): List<String> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>

'clientProxies' @ [194:13] ==> private final val clientProxies: MutableSet<CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'mapNotNull' @ [194:27] ==> public inline fun <T, R : Any> Iterable<CompileServiceImpl.ClientOrSessionProxy<Any>>.mapNotNull(transform: (CompileServiceImpl.ClientOrSessionProxy<Any>) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClientOrSessionProxy<Any>
    <R : Any> -> String

'it' @ [194:40] ==> value-parameter it: CompileServiceImpl.ClientOrSessionProxy<Any> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>.getClientsFlagPaths.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'aliveFlagPath' @ [194:43] ==> public final val aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[PropertyDescriptorImpl]

'clientProxies' @ [197:43] ==> private final val clientProxies: MutableSet<CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'cleanMatching' @ [197:57] ==> private final inline fun <T> Iterable<CompileServiceImpl.ClientOrSessionProxy<Any>>.cleanMatching(lock: ReentrantReadWriteLock, crossinline pred: (CompileServiceImpl.ClientOrSessionProxy<Any>) -> Boolean, crossinline clean: (CompileServiceImpl.ClientOrSessionProxy<Any>) -> Unit): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ClientOrSessionProxy<Any>

'clientsLock' @ [197:71] ==> private final val clientsLock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'!' @ [197:86] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [197:87] ==> value-parameter it: CompileServiceImpl.ClientOrSessionProxy<Any> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>.cleanDeadClients.<anonymous>[ValueParameterDescriptorImpl]

'isAlive' @ [197:90] ==> public final val isAlive: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[PropertyDescriptorImpl]

'clientProxies' @ [197:107] ==> private final val clientProxies: MutableSet<CompileServiceImpl.ClientOrSessionProxy<Any>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'remove' @ [197:121] ==> public abstract fun remove(element: CompileServiceImpl.ClientOrSessionProxy<Any>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [197:128] ==> value-parameter it: CompileServiceImpl.ClientOrSessionProxy<Any> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>.cleanDeadClients.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [197:133] ==> value-parameter it: CompileServiceImpl.ClientOrSessionProxy<Any> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>.cleanDeadClients.<anonymous>[ValueParameterDescriptorImpl]

'dispose' @ [197:136] ==> public final fun dispose(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[SimpleFunctionDescriptorImpl]

'Aliveness.values()[this]' @ [202:17] ==> public final operator fun get(index: Int): CompileServiceImpl.Aliveness defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'values' @ [202:27] ==> public final fun values(): Array<CompileServiceImpl.Aliveness> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[SimpleFunctionDescriptorImpl]

'this' @ [202:36] ==> <this> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.toAlivenessName[ReceiverParameterDescriptorImpl]

'name' @ [202:42] ==> public final val name: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[DeserializedPropertyDescriptor]

'this' @ [205:27] ==> <this> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.toAlivenessName[ReceiverParameterDescriptorImpl]

'lock' @ [210:9] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.cleanMatching[ValueParameterDescriptorImpl]

'read' @ [210:14] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'filter' @ [211:28] ==> public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'pred' @ [211:35] ==> value-parameter crossinline pred: (T) -> Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.cleanMatching[ValueParameterDescriptorImpl]

'toRemove' @ [212:17] ==> val toRemove: List<T> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.cleanMatching.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [212:26] ==> @InlineOnly public inline fun <T> Collection<T>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'anyDead' @ [213:17] ==> var anyDead: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.cleanMatching[LocalVariableDescriptor]

'lock' @ [214:17] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.cleanMatching[ValueParameterDescriptorImpl]

'write' @ [214:22] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'toRemove' @ [215:21] ==> val toRemove: List<T> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.cleanMatching.<anonymous>[LocalVariableDescriptor]

'forEach' @ [215:30] ==> @HidesMembers public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'clean' @ [215:38] ==> value-parameter crossinline clean: (T) -> Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.cleanMatching[ValueParameterDescriptorImpl]

'anyDead' @ [219:16] ==> var anyDead: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.cleanMatching[LocalVariableDescriptor]

'Volatile' @ [222:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'nowSeconds' @ [222:46] ==> public fun nowSeconds(): Long defined in org.jetbrains.kotlin.daemon in file CompileServiceImpl.kt[SimpleFunctionDescriptorImpl]

'if (rwlock.isWriteLocked || rwlock.readLockCount - rwlock.readHoldCount > 0) nowSeconds() else _lastUsedSeconds' @ [223:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'rwlock' @ [223:43] ==> private final val rwlock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'isWriteLocked' @ [223:50] ==> public final val ReentrantReadWriteLock.isWriteLocked: Boolean[MyPropertyDescriptor]

'rwlock' @ [223:67] ==> private final val rwlock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'readLockCount' @ [223:74] ==> public final val ReentrantReadWriteLock.readLockCount: Int[MyPropertyDescriptor]

'rwlock' @ [223:90] ==> private final val rwlock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'readHoldCount' @ [223:97] ==> public final val ReentrantReadWriteLock.readHoldCount: Int[MyPropertyDescriptor]

'nowSeconds' @ [223:116] ==> public fun nowSeconds(): Long defined in org.jetbrains.kotlin.daemon in file CompileServiceImpl.kt[SimpleFunctionDescriptorImpl]

'_lastUsedSeconds' @ [223:134] ==> @Volatile private final var _lastUsedSeconds: Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'ReentrantReadWriteLock' @ [225:26] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'File' @ [230:26] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'daemonOptions' @ [230:31] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'runFilesPathOrDefault' @ [230:45] ==> public val DaemonOptions.runFilesPathOrDefault: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'runFileDir' @ [231:9] ==> val runFileDir: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.<init>[LocalVariableDescriptor]

'mkdirs' @ [231:20] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'runFile' @ [232:9] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'File' @ [232:19] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'runFileDir' @ [232:24] ==> val runFileDir: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.<init>[LocalVariableDescriptor]

'makeRunFilenameString' @ [233:24] ==> public fun makeRunFilenameString(timestamp: String, digest: String, port: String, escapeSequence: String = ...): String defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'format' @ [233:85] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [233:101] ==> public open fun getInstance(p0: (TimeZone..TimeZone?)): (Calendar..Calendar?) defined in java.util.Calendar[JavaMethodDescriptor]

'getTimeZone' @ [233:122] ==> public open fun getTimeZone(p0: (String..String?)): (TimeZone..TimeZone?) defined in java.util.TimeZone[JavaMethodDescriptor]

'compilerId' @ [234:55] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'compilerClasspath' @ [234:66] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'map' @ [234:84] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (kotlin.String..kotlin.String?)

'File' @ [234:90] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [234:95] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.<init>.<anonymous>[ValueParameterDescriptorImpl]

'absolutePath' @ [234:99] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'distinctStringsDigest' @ [234:114] ==> public fun Iterable<String>.distinctStringsDigest(): ByteArray defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'toHexString' @ [234:138] ==> public fun ByteArray.toHexString(): String defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'port' @ [235:53] ==> public final val port: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'toString' @ [235:58] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'!' @ [237:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'runFile' @ [237:18] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'createNewFile' @ [237:26] ==> public open fun createNewFile(): Boolean defined in java.io.File[JavaMethodDescriptor]

'Exception' @ [237:49] ==> public final fun <init>(p0: (String..String?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'IllegalStateException' @ [239:19] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'runFile' @ [239:71] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'absolutePath' @ [239:79] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'e' @ [239:96] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.<init>[LocalVariableDescriptor]

'runFile' @ [241:9] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'deleteOnExit' @ [241:17] ==> public open fun deleteOnExit(): Unit defined in java.io.File[JavaMethodDescriptor]

'ifAlive' @ [246:71] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<String>): CompileService.CallResult<String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> String

'Dying' @ [246:104] ==> enum entry Dying defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'CompileService' @ [247:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [247:35] ==> public constructor Good<out R>(result: String) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> String

'port' @ [247:64] ==> public final val port: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'ifAlive' @ [250:81] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<DaemonOptions>): CompileService.CallResult<DaemonOptions> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> DaemonOptions

'CompileService' @ [251:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [251:35] ==> public constructor Good<out R>(result: DaemonOptions) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> DaemonOptions

'daemonOptions' @ [251:40] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'ifAlive' @ [254:87] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<DaemonJVMOptions>): CompileService.CallResult<DaemonJVMOptions> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> DaemonJVMOptions

'log' @ [255:9] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [255:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'daemonJVMOptions' @ [255:41] ==> public final val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'CompileService' @ [257:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [257:35] ==> public constructor Good<out R>(result: DaemonJVMOptions) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> DaemonJVMOptions

'daemonJVMOptions' @ [257:40] ==> public final val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'ifAlive' @ [260:95] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Nothing>): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Nothing

'Alive' @ [260:128] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'state' @ [261:9] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'addClient' @ [261:15] ==> public final fun addClient(aliveFlagPath: String?): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[SimpleFunctionDescriptorImpl]

'aliveFlagPath' @ [261:25] ==> value-parameter aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.registerClient[ValueParameterDescriptorImpl]

'log' @ [262:9] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [262:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'aliveFlagPath' @ [262:52] ==> value-parameter aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.registerClient[ValueParameterDescriptorImpl]

'CompileService' @ [263:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Ok' @ [263:35] ==> public constructor Ok() defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Ok[DeserializedClassConstructorDescriptor]

'ifAlive' @ [266:74] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<List<String>>): CompileService.CallResult<List<String>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> List<String>

'CompileService' @ [267:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [267:35] ==> public constructor Good<out R>(result: List<String>) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> List<String>

'state' @ [267:40] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'getClientsFlagPaths' @ [267:46] ==> public final fun getClientsFlagPaths(): List<String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[SimpleFunctionDescriptorImpl]

'ifAlive' @ [271:96] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'Alive' @ [271:129] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'CompileService' @ [272:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [272:35] ==> public constructor Good<out R>(result: Int) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> Int

'state' @ [273:17] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'sessions' @ [273:23] ==> public final val sessions: CompileServiceImpl.SessionsContainer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'leaseSession' @ [273:32] ==> public final fun <T : Any> leaseSession(session: CompileServiceImpl.ClientOrSessionProxy<Any>): Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> Any

'ClientOrSessionProxy' @ [273:45] ==> public constructor ClientOrSessionProxy<out T : Any>(aliveFlagPath: String?, data: Any? = ..., disposable: Disposable? = ...) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> Any

'aliveFlagPath' @ [273:71] ==> value-parameter aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseCompileSession[ValueParameterDescriptorImpl]

'apply' @ [273:87] ==> @InlineOnly public inline fun <T> Int.apply(block: Int.() -> Unit): Int defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'log' @ [274:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [274:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'this' @ [274:53] ==> <this> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseCompileSession.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'aliveFlagPath' @ [274:80] ==> value-parameter aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseCompileSession[ValueParameterDescriptorImpl]

'ifAlive' @ [279:58] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Nothing>): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Nothing

'LastSession' @ [279:91] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'state' @ [280:9] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'sessions' @ [280:15] ==> public final val sessions: CompileServiceImpl.SessionsContainer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'remove' @ [280:24] ==> public final fun remove(sessionId: Int): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[SimpleFunctionDescriptorImpl]

'sessionId' @ [280:31] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.releaseCompileSession[ValueParameterDescriptorImpl]

'log' @ [281:9] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [281:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'sessionId' @ [281:43] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.releaseCompileSession[ValueParameterDescriptorImpl]

'rwlock' @ [282:9] ==> private final val rwlock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'write' @ [282:16] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'clearJarCache' @ [283:13] ==> public open fun clearJarCache(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'state' @ [285:13] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'sessions' @ [285:19] ==> public final val sessions: CompileServiceImpl.SessionsContainer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'isEmpty' @ [285:28] ==> public final fun isEmpty(): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[SimpleFunctionDescriptorImpl]

'timer' @ [288:9] ==> public final val timer: Timer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'schedule' @ [288:15] ==> @InlineOnly public inline fun Timer.schedule(delay: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'periodicAndAfterSessionCheck' @ [289:13] ==> private final fun periodicAndAfterSessionCheck(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'CompileService' @ [291:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Ok' @ [291:35] ==> public constructor Ok() defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Ok[DeserializedClassConstructorDescriptor]

'compilerId' @ [295:14] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'compilerVersion' @ [295:25] ==> public final var compilerVersion: String defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'isEmpty' @ [295:41] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compilerId' @ [295:54] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'compilerVersion' @ [295:65] ==> public final var compilerVersion: String defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'expectedCompilerId' @ [295:84] ==> value-parameter expectedCompilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkCompilerId[ValueParameterDescriptorImpl]

'compilerVersion' @ [295:103] ==> public final var compilerVersion: String defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'compilerId' @ [296:14] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'compilerClasspath' @ [296:25] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'all' @ [296:43] ==> public inline fun <T> Iterable<String>.all(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'expectedCompilerId' @ [296:49] ==> value-parameter expectedCompilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkCompilerId[ValueParameterDescriptorImpl]

'compilerClasspath' @ [296:68] ==> public final var compilerClasspath: List<String> defined in org.jetbrains.kotlin.daemon.common.CompilerId[DeserializedPropertyDescriptor]

'contains' @ [296:86] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [296:95] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkCompilerId.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [297:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classpathWatcher' @ [297:14] ==> private final val classpathWatcher: LazyClasspathWatcher defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'isChanged' @ [297:31] ==> public final val isChanged: Boolean defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'ifAlive' @ [300:13] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Long>): CompileService.CallResult<Long> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Long

'CompileService' @ [300:23] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [300:49] ==> public constructor Good<out R>(result: Long) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> Long

'usedMemory' @ [300:54] ==> public inline fun usedMemory(withGC: Boolean): Long defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'ifAliveExclusive' @ [302:67] ==> private final inline fun <R> ifAliveExclusive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Nothing>): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Nothing

'LastSession' @ [302:109] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'shutdownWithDelay' @ [303:9] ==> private final fun shutdownWithDelay(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'CompileService' @ [304:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Ok' @ [304:35] ==> public constructor Ok() defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Ok[DeserializedClassConstructorDescriptor]

'ifAlive' @ [307:92] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Boolean>): CompileService.CallResult<Boolean> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Boolean

'LastSession' @ [307:125] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'when {
            graceful -> gracefulShutdown(true)
            else -> {
                shutdownWithDelay()
                true
            }
        }' @ [308:19] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'graceful' @ [309:13] ==> value-parameter graceful: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.scheduleShutdown[ValueParameterDescriptorImpl]

'gracefulShutdown' @ [309:25] ==> private final fun gracefulShutdown(onAnotherThread: Boolean): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'shutdownWithDelay' @ [311:17] ==> private final fun shutdownWithDelay(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'CompileService' @ [315:9] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [315:35] ==> public constructor Good<out R>(result: Boolean) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> Boolean

'res' @ [315:40] ==> val res: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.scheduleShutdown.<anonymous>[LocalVariableDescriptor]

'doCompile' @ [327:13] ==> private final fun doCompile(sessionId: Int, args: Array<out String>, compilerMessagesStreamProxy: RemoteOutputStream, serviceOutputStreamProxy: RemoteOutputStream, operationsTracer: RemoteOperationsTracer?, body: (PrintStream, EventManager, Profiler) -> ExitCode): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'sessionId' @ [327:23] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'args' @ [327:34] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'compilerOutputStream' @ [327:40] ==> value-parameter compilerOutputStream: RemoteOutputStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'serviceOutputStream' @ [327:62] ==> value-parameter serviceOutputStream: RemoteOutputStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'operationsTracer' @ [327:83] ==> value-parameter operationsTracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'when (outputFormat) {
                    CompileService.OutputFormat.PLAIN -> compiler[targetPlatform].exec(printStream, *args)
                    CompileService.OutputFormat.XML -> compiler[targetPlatform].execAndOutputXml(printStream, createCompileServices(servicesFacade, eventManager, profiler), *args)
                }' @ [328:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ExitCode, entry1: ExitCode): ExitCode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ExitCode

'outputFormat' @ [328:23] ==> value-parameter outputFormat: CompileService.OutputFormat defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'CompileService' @ [329:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'PLAIN' @ [329:49] ==> enum entry PLAIN defined in org.jetbrains.kotlin.daemon.common.CompileService.OutputFormat[FakeCallableDescriptorForObject]

'compiler' @ [329:58] ==> public final val compiler: CompilerSelector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'targetPlatform' @ [329:67] ==> value-parameter targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'exec' @ [329:83] ==> public final fun exec(errStream: PrintStream, vararg args: String): ExitCode defined in org.jetbrains.kotlin.cli.common.CLICompiler[DeserializedSimpleFunctionDescriptor]

'printStream' @ [329:88] ==> value-parameter printStream: PrintStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile.<anonymous>[ValueParameterDescriptorImpl]

'args' @ [329:102] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'CompileService' @ [330:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'XML' @ [330:49] ==> enum entry XML defined in org.jetbrains.kotlin.daemon.common.CompileService.OutputFormat[FakeCallableDescriptorForObject]

'compiler' @ [330:56] ==> public final val compiler: CompilerSelector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'targetPlatform' @ [330:65] ==> value-parameter targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'execAndOutputXml' @ [330:81] ==> @NotNull public open fun execAndOutputXml(@NotNull p0: PrintStream, @NotNull p1: Services, @NotNull vararg p2: (String..String?)): ExitCode defined in org.jetbrains.kotlin.cli.common.CLICompiler[JavaMethodDescriptor]

'printStream' @ [330:98] ==> value-parameter printStream: PrintStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile.<anonymous>[ValueParameterDescriptorImpl]

'createCompileServices' @ [330:111] ==> private final fun createCompileServices(facade: CompilerCallbackServicesFacade, eventManager: EventManager, rpcProfiler: Profiler): Services defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'servicesFacade' @ [330:133] ==> value-parameter servicesFacade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'eventManager' @ [330:149] ==> value-parameter eventManager: EventManager defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile.<anonymous>[ValueParameterDescriptorImpl]

'profiler' @ [330:163] ==> value-parameter profiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile.<anonymous>[ValueParameterDescriptorImpl]

'args' @ [330:175] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteCompile[ValueParameterDescriptorImpl]

'doCompile' @ [343:13] ==> private final fun doCompile(sessionId: Int, args: Array<out String>, compilerMessagesStreamProxy: RemoteOutputStream, serviceOutputStreamProxy: RemoteOutputStream, operationsTracer: RemoteOperationsTracer?, body: (PrintStream, EventManager, Profiler) -> ExitCode): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'sessionId' @ [343:23] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile[ValueParameterDescriptorImpl]

'args' @ [343:34] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile[ValueParameterDescriptorImpl]

'compilerOutputStream' @ [343:40] ==> value-parameter compilerOutputStream: RemoteOutputStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile[ValueParameterDescriptorImpl]

'serviceOutputStream' @ [343:62] ==> value-parameter serviceOutputStream: RemoteOutputStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile[ValueParameterDescriptorImpl]

'operationsTracer' @ [343:83] ==> value-parameter operationsTracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile[ValueParameterDescriptorImpl]

'when (compilerOutputFormat) {
                    CompileService.OutputFormat.PLAIN -> throw NotImplementedError("Only XML output is supported in remote incremental compilation")
                    CompileService.OutputFormat.XML -> compiler[targetPlatform].execAndOutputXml(printStream, createCompileServices(servicesFacade, eventManager, profiler), *args)
                }' @ [344:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ExitCode, entry1: ExitCode): ExitCode[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ExitCode

'compilerOutputFormat' @ [344:23] ==> value-parameter compilerOutputFormat: CompileService.OutputFormat defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile[ValueParameterDescriptorImpl]

'CompileService' @ [345:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'PLAIN' @ [345:49] ==> enum entry PLAIN defined in org.jetbrains.kotlin.daemon.common.CompileService.OutputFormat[FakeCallableDescriptorForObject]

'NotImplementedError' @ [345:64] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'CompileService' @ [346:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'XML' @ [346:49] ==> enum entry XML defined in org.jetbrains.kotlin.daemon.common.CompileService.OutputFormat[FakeCallableDescriptorForObject]

'compiler' @ [346:56] ==> public final val compiler: CompilerSelector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'targetPlatform' @ [346:65] ==> value-parameter targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile[ValueParameterDescriptorImpl]

'execAndOutputXml' @ [346:81] ==> @NotNull public open fun execAndOutputXml(@NotNull p0: PrintStream, @NotNull p1: Services, @NotNull vararg p2: (String..String?)): ExitCode defined in org.jetbrains.kotlin.cli.common.CLICompiler[JavaMethodDescriptor]

'printStream' @ [346:98] ==> value-parameter printStream: PrintStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile.<anonymous>[ValueParameterDescriptorImpl]

'createCompileServices' @ [346:111] ==> private final fun createCompileServices(facade: CompilerCallbackServicesFacade, eventManager: EventManager, rpcProfiler: Profiler): Services defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'servicesFacade' @ [346:133] ==> value-parameter servicesFacade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile[ValueParameterDescriptorImpl]

'eventManager' @ [346:149] ==> value-parameter eventManager: EventManager defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile.<anonymous>[ValueParameterDescriptorImpl]

'profiler' @ [346:163] ==> value-parameter profiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile.<anonymous>[ValueParameterDescriptorImpl]

'args' @ [346:175] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteIncrementalCompile[ValueParameterDescriptorImpl]

'ifAlive' @ [356:41] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'CompileServicesFacadeMessageCollector' @ [357:32] ==> public constructor CompileServicesFacadeMessageCollector(servicesFacade: CompilerServicesFacadeBase, compilationOptions: CompilationOptions) defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[ClassConstructorDescriptorImpl]

'servicesFacade' @ [357:70] ==> value-parameter servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'compilationOptions' @ [357:86] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'DaemonMessageReporter' @ [358:30] ==> internal fun DaemonMessageReporter(servicesFacade: CompilerServicesFacadeBase, compilationOptions: CompilationOptions): DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.report in file DaemonMessageReporter.kt[SimpleFunctionDescriptorImpl]

'servicesFacade' @ [358:52] ==> value-parameter servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'compilationOptions' @ [358:68] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'compilationOptions' @ [359:30] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'targetPlatform' @ [359:49] ==> public final val targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedPropertyDescriptor]

'log' @ [360:9] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [360:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'+' @ [360:18] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'compilerArguments' @ [360:55] ==> value-parameter compilerArguments: Array<out String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'joinToString' @ [360:73] ==> public fun <T> Array<out String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Suppress' @ [362:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (targetPlatform) {
            CompileService.TargetPlatform.JVM -> K2JVMCompiler()
            CompileService.TargetPlatform.JS -> K2JSCompiler()
            CompileService.TargetPlatform.METADATA -> K2MetadataCompiler()
        }' @ [363:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CLICompiler<out (CommonCompilerArguments..CommonCompilerArguments?)>, entry1: CLICompiler<out (CommonCompilerArguments..CommonCompilerArguments?)>, entry2: CLICompiler<out (CommonCompilerArguments..CommonCompilerArguments?)>): CLICompiler<out (CommonCompilerArguments..CommonCompilerArguments?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CLICompiler<out (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)>

'targetPlatform' @ [363:30] ==> val targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'CompileService' @ [364:13] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JVM' @ [364:43] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'K2JVMCompiler' @ [364:50] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'CompileService' @ [365:13] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'JS' @ [365:43] ==> enum entry JS defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'K2JSCompiler' @ [365:49] ==> public constructor K2JSCompiler() defined in org.jetbrains.kotlin.cli.js.K2JSCompiler[JavaClassConstructorDescriptor]

'CompileService' @ [366:13] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'METADATA' @ [366:43] ==> enum entry METADATA defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'K2MetadataCompiler' @ [366:55] ==> public constructor K2MetadataCompiler() defined in org.jetbrains.kotlin.cli.metadata.K2MetadataCompiler[DeserializedClassConstructorDescriptor]

'compiler' @ [369:30] ==> val compiler: CLICompiler<CommonCompilerArguments> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'createArguments' @ [369:39] ==> public abstract fun createArguments(): (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.cli.common.CLICompiler[DeserializedSimpleFunctionDescriptor]

'parseCommandLineArguments' @ [370:9] ==> public fun <A : CommonToolArguments> parseCommandLineArguments(args: List<String>, result: (CommonCompilerArguments..CommonCompilerArguments?)): Unit defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A : CommonToolArguments> -> (org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments..org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments?)

'compilerArguments' @ [370:35] ==> value-parameter compilerArguments: Array<out String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'asList' @ [370:53] ==> public fun <T> Array<out String>.asList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'k2PlatformArgs' @ [370:63] ==> val k2PlatformArgs: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'validateArguments' @ [371:34] ==> public fun validateArguments(errors: ArgumentParseErrors): String? defined in org.jetbrains.kotlin.cli.common.arguments[DeserializedSimpleFunctionDescriptor]

'k2PlatformArgs' @ [371:52] ==> val k2PlatformArgs: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'errors' @ [371:67] ==> public final var errors: ArgumentParseErrors defined in org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments[DeserializedPropertyDescriptor]

'if (argumentParseError != null) {
            messageCollector.report(CompilerMessageSeverity.ERROR, argumentParseError)
            CompileService.CallResult.Good(ExitCode.COMPILATION_ERROR.code)
        }
        else when (compilationOptions.compilerMode) {
            CompilerMode.JPS_COMPILER -> {
                val jpsServicesFacade = servicesFacade as JpsCompilerServicesFacade

                withIC(enabled = servicesFacade.hasIncrementalCaches()) {
                    doCompile(sessionId, daemonReporter, tracer = null) { eventManger, profiler ->
                        val services = createCompileServices(jpsServicesFacade, eventManger, profiler)
                        compiler.exec(messageCollector, services, k2PlatformArgs)
                    }
                }
            }
            CompilerMode.NON_INCREMENTAL_COMPILER -> {
                doCompile(sessionId, daemonReporter, tracer = null) { _, _ ->
                    compiler.exec(messageCollector, Services.EMPTY, k2PlatformArgs)
                }
            }
            CompilerMode.INCREMENTAL_COMPILER -> {
                if (targetPlatform != CompileService.TargetPlatform.JVM) {
                    throw IllegalStateException("Incremental compilation is not supported for target platform: $targetPlatform")
                }

                val k2jvmArgs = k2PlatformArgs as K2JVMCompilerArguments
                val gradleIncrementalArgs = compilationOptions as IncrementalCompilationOptions
                val gradleIncrementalServicesFacade = servicesFacade as IncrementalCompilerServicesFacade

                withIC {
                    doCompile(sessionId, daemonReporter, tracer = null) { _, _ ->
                        execIncrementalCompiler(k2jvmArgs, gradleIncrementalArgs, gradleIncrementalServicesFacade, compilationResults!!,
                                                messageCollector, daemonReporter)
                    }
                }

            }
            else -> throw IllegalStateException("Unknown compilation mode ${compilationOptions.compilerMode}")
        }' @ [372:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompileService.CallResult<Int>, elseBranch: CompileService.CallResult<Int>): CompileService.CallResult<Int>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallResult<Int>

'argumentParseError' @ [372:13] ==> val argumentParseError: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'messageCollector' @ [373:13] ==> val messageCollector: CompileServicesFacadeMessageCollector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'report' @ [373:30] ==> public open fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation?): Unit defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[SimpleFunctionDescriptorImpl]

'ERROR' @ [373:61] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'argumentParseError' @ [373:68] ==> val argumentParseError: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'Good' @ [374:39] ==> public constructor Good<out R>(result: Int) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> Int

'code' @ [374:71] ==> public final val ExitCode.code: Int[MyPropertyDescriptor]

'when (compilationOptions.compilerMode) {
            CompilerMode.JPS_COMPILER -> {
                val jpsServicesFacade = servicesFacade as JpsCompilerServicesFacade

                withIC(enabled = servicesFacade.hasIncrementalCaches()) {
                    doCompile(sessionId, daemonReporter, tracer = null) { eventManger, profiler ->
                        val services = createCompileServices(jpsServicesFacade, eventManger, profiler)
                        compiler.exec(messageCollector, services, k2PlatformArgs)
                    }
                }
            }
            CompilerMode.NON_INCREMENTAL_COMPILER -> {
                doCompile(sessionId, daemonReporter, tracer = null) { _, _ ->
                    compiler.exec(messageCollector, Services.EMPTY, k2PlatformArgs)
                }
            }
            CompilerMode.INCREMENTAL_COMPILER -> {
                if (targetPlatform != CompileService.TargetPlatform.JVM) {
                    throw IllegalStateException("Incremental compilation is not supported for target platform: $targetPlatform")
                }

                val k2jvmArgs = k2PlatformArgs as K2JVMCompilerArguments
                val gradleIncrementalArgs = compilationOptions as IncrementalCompilationOptions
                val gradleIncrementalServicesFacade = servicesFacade as IncrementalCompilerServicesFacade

                withIC {
                    doCompile(sessionId, daemonReporter, tracer = null) { _, _ ->
                        execIncrementalCompiler(k2jvmArgs, gradleIncrementalArgs, gradleIncrementalServicesFacade, compilationResults!!,
                                                messageCollector, daemonReporter)
                    }
                }

            }
            else -> throw IllegalStateException("Unknown compilation mode ${compilationOptions.compilerMode}")
        }' @ [376:14] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CompileService.CallResult<Int>, entry1: CompileService.CallResult<Int>, entry2: CompileService.CallResult<Int>, entry3: CompileService.CallResult<Int>): CompileService.CallResult<Int>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallResult<Int>

'compilationOptions' @ [376:20] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'compilerMode' @ [376:39] ==> public final val compilerMode: CompilerMode defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedPropertyDescriptor]

'JPS_COMPILER' @ [377:26] ==> enum entry JPS_COMPILER defined in org.jetbrains.kotlin.daemon.common.CompilerMode[FakeCallableDescriptorForObject]

'servicesFacade' @ [378:41] ==> value-parameter servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'withIC' @ [380:17] ==> public inline fun <R> withIC(enabled: Boolean = ..., fn: () -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> CallResult<Int>

'servicesFacade' @ [380:34] ==> value-parameter servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'hasIncrementalCaches' @ [380:49] ==> public abstract fun hasIncrementalCaches(): Boolean defined in org.jetbrains.kotlin.daemon.common.JpsCompilerServicesFacade[DeserializedSimpleFunctionDescriptor]

'doCompile' @ [381:21] ==> private final fun doCompile(sessionId: Int, daemonMessageReporter: DaemonMessageReporter, tracer: RemoteOperationsTracer?, body: (EventManager, Profiler) -> ExitCode): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'sessionId' @ [381:31] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'daemonReporter' @ [381:42] ==> val daemonReporter: DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'createCompileServices' @ [382:40] ==> private final fun createCompileServices(facade: CompilerCallbackServicesFacade, eventManager: EventManager, rpcProfiler: Profiler): Services defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'jpsServicesFacade' @ [382:62] ==> val jpsServicesFacade: JpsCompilerServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'eventManger' @ [382:81] ==> value-parameter eventManger: EventManager defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'profiler' @ [382:94] ==> value-parameter profiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'compiler' @ [383:25] ==> val compiler: CLICompiler<CommonCompilerArguments> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'exec' @ [383:34] ==> public final fun exec(messageCollector: MessageCollector, services: Services, arguments: (CommonCompilerArguments..CommonCompilerArguments?)): ExitCode defined in org.jetbrains.kotlin.cli.common.CLICompiler[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [383:39] ==> val messageCollector: CompileServicesFacadeMessageCollector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'services' @ [383:57] ==> val services: Services defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'k2PlatformArgs' @ [383:67] ==> val k2PlatformArgs: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'NON_INCREMENTAL_COMPILER' @ [387:26] ==> enum entry NON_INCREMENTAL_COMPILER defined in org.jetbrains.kotlin.daemon.common.CompilerMode[FakeCallableDescriptorForObject]

'doCompile' @ [388:17] ==> private final fun doCompile(sessionId: Int, daemonMessageReporter: DaemonMessageReporter, tracer: RemoteOperationsTracer?, body: (EventManager, Profiler) -> ExitCode): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'sessionId' @ [388:27] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'daemonReporter' @ [388:38] ==> val daemonReporter: DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'compiler' @ [389:21] ==> val compiler: CLICompiler<CommonCompilerArguments> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'exec' @ [389:30] ==> public final fun exec(messageCollector: MessageCollector, services: Services, arguments: (CommonCompilerArguments..CommonCompilerArguments?)): ExitCode defined in org.jetbrains.kotlin.cli.common.CLICompiler[DeserializedSimpleFunctionDescriptor]

'messageCollector' @ [389:35] ==> val messageCollector: CompileServicesFacadeMessageCollector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'EMPTY' @ [389:62] ==> @field:JvmField public final val EMPTY: Services defined in org.jetbrains.kotlin.config.Services.Companion[DeserializedPropertyDescriptor]

'k2PlatformArgs' @ [389:69] ==> val k2PlatformArgs: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'INCREMENTAL_COMPILER' @ [392:26] ==> enum entry INCREMENTAL_COMPILER defined in org.jetbrains.kotlin.daemon.common.CompilerMode[FakeCallableDescriptorForObject]

'targetPlatform' @ [393:21] ==> val targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'JVM' @ [393:69] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'IllegalStateException' @ [394:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'targetPlatform' @ [394:113] ==> val targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'k2PlatformArgs' @ [397:33] ==> val k2PlatformArgs: (CommonCompilerArguments..CommonCompilerArguments?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'compilationOptions' @ [398:45] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'servicesFacade' @ [399:55] ==> value-parameter servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'withIC' @ [401:17] ==> public inline fun <R> withIC(enabled: Boolean = ..., fn: () -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> CallResult<Int>

'doCompile' @ [402:21] ==> private final fun doCompile(sessionId: Int, daemonMessageReporter: DaemonMessageReporter, tracer: RemoteOperationsTracer?, body: (EventManager, Profiler) -> ExitCode): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'sessionId' @ [402:31] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'daemonReporter' @ [402:42] ==> val daemonReporter: DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'execIncrementalCompiler' @ [403:25] ==> private final fun execIncrementalCompiler(k2jvmArgs: K2JVMCompilerArguments, incrementalCompilationOptions: IncrementalCompilationOptions, servicesFacade: IncrementalCompilerServicesFacade, compilationResults: CompilationResults, compilerMessageCollector: MessageCollector, daemonMessageReporter: DaemonMessageReporter): ExitCode defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'k2jvmArgs' @ [403:49] ==> val k2jvmArgs: K2JVMCompilerArguments defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'gradleIncrementalArgs' @ [403:60] ==> val gradleIncrementalArgs: IncrementalCompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'gradleIncrementalServicesFacade' @ [403:83] ==> val gradleIncrementalServicesFacade: IncrementalCompilerServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'compilationResults' @ [403:116] ==> value-parameter compilationResults: CompilationResults? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'messageCollector' @ [404:49] ==> val messageCollector: CompileServicesFacadeMessageCollector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'daemonReporter' @ [404:67] ==> val daemonReporter: DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile.<anonymous>[LocalVariableDescriptor]

'IllegalStateException' @ [409:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'compilationOptions' @ [409:77] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.compile[ValueParameterDescriptorImpl]

'compilerMode' @ [409:96] ==> public final val compilerMode: CompilerMode defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedPropertyDescriptor]

'RemoteICReporter' @ [421:24] ==> public constructor RemoteICReporter(servicesFacade: CompilerServicesFacadeBase, compilationResults: CompilationResults, compilationOptions: CompilationOptions) defined in org.jetbrains.kotlin.daemon.report.RemoteICReporter[ClassConstructorDescriptorImpl]

'servicesFacade' @ [421:41] ==> value-parameter servicesFacade: IncrementalCompilerServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'compilationResults' @ [421:57] ==> value-parameter compilationResults: CompilationResults defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'incrementalCompilationOptions' @ [421:77] ==> value-parameter incrementalCompilationOptions: IncrementalCompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'if (servicesFacade.hasAnnotationsFileUpdater()) RemoteAnnotationsFileUpdater(servicesFacade) else null' @ [422:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: RemoteAnnotationsFileUpdater?, elseBranch: RemoteAnnotationsFileUpdater?): RemoteAnnotationsFileUpdater?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RemoteAnnotationsFileUpdater?

'servicesFacade' @ [422:41] ==> value-parameter servicesFacade: IncrementalCompilerServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'hasAnnotationsFileUpdater' @ [422:56] ==> public abstract fun hasAnnotationsFileUpdater(): Boolean defined in org.jetbrains.kotlin.daemon.common.IncrementalCompilerServicesFacade[DeserializedSimpleFunctionDescriptor]

'RemoteAnnotationsFileUpdater' @ [422:85] ==> public constructor RemoteAnnotationsFileUpdater(servicesFacade: IncrementalCompilerServicesFacade) defined in org.jetbrains.kotlin.daemon.incremental.RemoteAnnotationsFileUpdater[ClassConstructorDescriptorImpl]

'servicesFacade' @ [422:114] ==> value-parameter servicesFacade: IncrementalCompilerServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'k2jvmArgs' @ [424:26] ==> value-parameter k2jvmArgs: K2JVMCompilerArguments defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'buildFile' @ [424:36] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'let' @ [424:47] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [424:53] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'assert' @ [425:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'moduleFile' @ [425:16] ==> val moduleFile: File? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'exists' @ [425:28] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'k2jvmArgs' @ [425:74] ==> value-parameter k2jvmArgs: K2JVMCompilerArguments defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'buildFile' @ [425:84] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'run' @ [428:28] ==> @InlineOnly public inline fun <T, R> CompileServiceImpl.run(block: CompileServiceImpl.() -> ModuleScriptData): ModuleScriptData defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompileServiceImpl
    <R> -> ModuleScriptData

'ByteArrayOutputStream' @ [429:28] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'PrintStream' @ [430:31] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'bytesOut' @ [430:43] ==> val bytesOut: ByteArrayOutputStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>[LocalVariableDescriptor]

'PrintingMessageCollector' @ [431:22] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'printStream' @ [431:47] ==> val printStream: PrintStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>[LocalVariableDescriptor]

'PLAIN_FULL_PATHS' @ [431:76] ==> public final val PLAIN_FULL_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'parseModuleScript' @ [432:48] ==> @NotNull public open fun parseModuleScript(@NotNull p0: String, @NotNull p1: MessageCollector): ModuleScriptData defined in org.jetbrains.kotlin.cli.common.modules.ModuleXmlParser[JavaMethodDescriptor]

'k2jvmArgs' @ [432:66] ==> value-parameter k2jvmArgs: K2JVMCompilerArguments defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'buildFile' @ [432:76] ==> @Argument public final var buildFile: String? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'mc' @ [432:89] ==> val mc: PrintingMessageCollector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>[LocalVariableDescriptor]

'mc' @ [433:17] ==> val mc: PrintingMessageCollector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>[LocalVariableDescriptor]

'hasErrors' @ [433:20] ==> public open fun hasErrors(): Boolean defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaMethodDescriptor]

'daemonMessageReporter' @ [434:17] ==> value-parameter daemonMessageReporter: DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'report' @ [434:39] ==> public abstract fun report(severity: ReportSeverity, message: String): Unit defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporter[SimpleFunctionDescriptorImpl]

'ERROR' @ [434:61] ==> enum entry ERROR defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'bytesOut' @ [434:68] ==> val bytesOut: ByteArrayOutputStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>[LocalVariableDescriptor]

'toString' @ [434:77] ==> public open fun toString(p0: (String..String?)): (String..String?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'parsedModule' @ [436:13] ==> val parsedModule: ModuleScriptData defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>[LocalVariableDescriptor]

'parsedModule' @ [439:31] ==> val parsedModule: ModuleScriptData defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'modules' @ [439:44] ==> public final val ModuleScriptData.modules: (MutableList<(Module..Module?)>..List<(Module..Module?)>)[MyPropertyDescriptor]

'flatMapTo' @ [439:52] ==> public inline fun <T, R, C : MutableCollection<in JvmSourceRoot>> Iterable<(Module..Module?)>.flatMapTo(destination: HashSet<JvmSourceRoot>, transform: ((Module..Module?)) -> Iterable<JvmSourceRoot>): HashSet<JvmSourceRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)
    <R> -> JvmSourceRoot
    <C : MutableCollection<in R>> -> HashSet<JvmSourceRoot>

'HashSet' @ [439:62] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JvmSourceRoot

'it' @ [440:13] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>[ValueParameterDescriptorImpl]

'getJavaSourceRoots' @ [440:16] ==> public abstract fun getJavaSourceRoots(): List<JavaRootPath> defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'map' @ [440:37] ==> public inline fun <T, R> Iterable<JavaRootPath>.map(transform: (JavaRootPath) -> JvmSourceRoot): List<JvmSourceRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRootPath
    <R> -> JvmSourceRoot

'JvmSourceRoot' @ [440:43] ==> public constructor JvmSourceRoot(file: File, packagePrefix: String? = ...) defined in org.jetbrains.kotlin.build.JvmSourceRoot[DeserializedClassConstructorDescriptor]

'File' @ [440:57] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [440:62] ==> value-parameter it: JavaRootPath defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [440:65] ==> public final val path: String defined in org.jetbrains.kotlin.modules.JavaRootPath[DeserializedPropertyDescriptor]

'it' @ [440:72] ==> value-parameter it: JavaRootPath defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'packagePrefix' @ [440:75] ==> public final val packagePrefix: String? defined in org.jetbrains.kotlin.modules.JavaRootPath[DeserializedPropertyDescriptor]

'parsedModule' @ [443:30] ==> val parsedModule: ModuleScriptData defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'modules' @ [443:43] ==> public final val ModuleScriptData.modules: (MutableList<(Module..Module?)>..List<(Module..Module?)>)[MyPropertyDescriptor]

'flatMap' @ [443:51] ==> public inline fun <T, R> Iterable<(Module..Module?)>.flatMap(transform: ((Module..Module?)) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)
    <R> -> File

'it' @ [443:61] ==> value-parameter it: (Module..Module?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler.<anonymous>[ValueParameterDescriptorImpl]

'getSourceFiles' @ [443:64] ==> public abstract fun getSourceFiles(): List<String> defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'map' @ [443:81] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [443:87] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'k2jvmArgs' @ [444:9] ==> value-parameter k2jvmArgs: K2JVMCompilerArguments defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'friendPaths' @ [444:19] ==> public final var friendPaths: Array<String>? defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[DeserializedPropertyDescriptor]

'parsedModule' @ [444:33] ==> val parsedModule: ModuleScriptData defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'modules' @ [444:46] ==> public final val ModuleScriptData.modules: (MutableList<(Module..Module?)>..List<(Module..Module?)>)[MyPropertyDescriptor]

'flatMap' @ [444:54] ==> public inline fun <T, R> Iterable<(Module..Module?)>.flatMap(transform: ((Module..Module?)) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.modules.Module..org.jetbrains.kotlin.modules.Module?)
    <R> -> String

'getFriendPaths' @ [444:70] ==> public abstract fun getFriendPaths(): List<String> defined in org.jetbrains.kotlin.modules.Module[DeserializedSimpleFunctionDescriptor]

'toTypedArray' @ [444:86] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'if (incrementalCompilationOptions.areFileChangesKnown) {
            ChangedFiles.Known(incrementalCompilationOptions.modifiedFiles!!, incrementalCompilationOptions.deletedFiles!!)
        }
        else {
            ChangedFiles.Unknown()
        }' @ [446:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ChangedFiles, elseBranch: ChangedFiles): ChangedFiles[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ChangedFiles

'incrementalCompilationOptions' @ [446:32] ==> value-parameter incrementalCompilationOptions: IncrementalCompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'areFileChangesKnown' @ [446:62] ==> public final val areFileChangesKnown: Boolean defined in org.jetbrains.kotlin.daemon.common.IncrementalCompilationOptions[DeserializedPropertyDescriptor]

'Known' @ [447:26] ==> public constructor Known(modified: List<File>, removed: List<File>) defined in org.jetbrains.kotlin.incremental.ChangedFiles.Known[DeserializedClassConstructorDescriptor]

'incrementalCompilationOptions' @ [447:32] ==> value-parameter incrementalCompilationOptions: IncrementalCompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'modifiedFiles' @ [447:62] ==> public final val modifiedFiles: List<File>? defined in org.jetbrains.kotlin.daemon.common.IncrementalCompilationOptions[DeserializedPropertyDescriptor]

'incrementalCompilationOptions' @ [447:79] ==> value-parameter incrementalCompilationOptions: IncrementalCompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'deletedFiles' @ [447:109] ==> public final val deletedFiles: List<File>? defined in org.jetbrains.kotlin.daemon.common.IncrementalCompilationOptions[DeserializedPropertyDescriptor]

'Unknown' @ [450:26] ==> public constructor Unknown() defined in org.jetbrains.kotlin.incremental.ChangedFiles.Unknown[DeserializedClassConstructorDescriptor]

'RemoteArtifactChangesProvider' @ [453:31] ==> public constructor RemoteArtifactChangesProvider(servicesFacade: IncrementalCompilerServicesFacade) defined in org.jetbrains.kotlin.daemon.incremental.RemoteArtifactChangesProvider[ClassConstructorDescriptorImpl]

'servicesFacade' @ [453:61] ==> value-parameter servicesFacade: IncrementalCompilerServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'RemoteChangesRegistry' @ [454:31] ==> public constructor RemoteChangesRegistry(servicesFacade: IncrementalCompilerServicesFacade) defined in org.jetbrains.kotlin.daemon.incremental.RemoteChangesRegistry[ClassConstructorDescriptorImpl]

'servicesFacade' @ [454:53] ==> value-parameter servicesFacade: IncrementalCompilerServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'incrementalCompilationOptions' @ [456:26] ==> value-parameter incrementalCompilationOptions: IncrementalCompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'workingDir' @ [456:56] ==> public final val workingDir: File defined in org.jetbrains.kotlin.daemon.common.IncrementalCompilationOptions[DeserializedPropertyDescriptor]

'commonCacheVersions' @ [457:24] ==> public fun commonCacheVersions(cachesDir: File): List<CacheVersion> defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'workingDir' @ [457:44] ==> val workingDir: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'customCacheVersion' @ [458:24] ==> public fun customCacheVersion(version: Int, fileName: String, dataRoot: File, forceEnable: Boolean = ...): CacheVersion defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'incrementalCompilationOptions' @ [458:43] ==> value-parameter incrementalCompilationOptions: IncrementalCompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'customCacheVersion' @ [458:73] ==> public final val customCacheVersion: Int defined in org.jetbrains.kotlin.daemon.common.IncrementalCompilationOptions[DeserializedPropertyDescriptor]

'incrementalCompilationOptions' @ [458:93] ==> value-parameter incrementalCompilationOptions: IncrementalCompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'customCacheVersionFileName' @ [458:123] ==> public final val customCacheVersionFileName: String defined in org.jetbrains.kotlin.daemon.common.IncrementalCompilationOptions[DeserializedPropertyDescriptor]

'workingDir' @ [458:151] ==> val workingDir: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'IncrementalJvmCompilerRunner' @ [460:16] ==> public constructor IncrementalJvmCompilerRunner(workingDir: File, javaSourceRoots: Set<JvmSourceRoot>, cacheVersions: List<CacheVersion>, reporter: ICReporter, kaptAnnotationsFileUpdater: AnnotationFileUpdater? = ..., artifactChangesProvider: ArtifactChangesProvider? = ..., changesRegistry: ChangesRegistry? = ...) defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[DeserializedClassConstructorDescriptor]

'workingDir' @ [460:45] ==> val workingDir: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'javaSourceRoots' @ [460:57] ==> val javaSourceRoots: HashSet<JvmSourceRoot> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'versions' @ [460:74] ==> val versions: List<CacheVersion> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'reporter' @ [460:84] ==> val reporter: RemoteICReporter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'annotationFileUpdater' @ [460:94] ==> val annotationFileUpdater: RemoteAnnotationsFileUpdater? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'artifactChanges' @ [461:45] ==> val artifactChanges: RemoteArtifactChangesProvider defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'changesRegistry' @ [461:62] ==> val changesRegistry: RemoteChangesRegistry defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'compile' @ [462:18] ==> public final fun compile(allKotlinSources: List<File>, args: K2JVMCompilerArguments, messageCollector: MessageCollector, getChangedFiles: (IncrementalCachesManager) -> ChangedFiles): ExitCode defined in org.jetbrains.kotlin.incremental.IncrementalJvmCompilerRunner[DeserializedSimpleFunctionDescriptor]

'allKotlinFiles' @ [462:26] ==> val allKotlinFiles: List<File> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'k2jvmArgs' @ [462:42] ==> value-parameter k2jvmArgs: K2JVMCompilerArguments defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'compilerMessageCollector' @ [462:53] ==> value-parameter compilerMessageCollector: MessageCollector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[ValueParameterDescriptorImpl]

'changedFiles' @ [462:81] ==> val changedFiles: ChangedFiles defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.execIncrementalCompiler[LocalVariableDescriptor]

'ifAlive' @ [478:41] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'Alive' @ [478:74] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'if (targetPlatform != CompileService.TargetPlatform.JVM)
            CompileService.CallResult.Error("Sorry, only JVM target platform is supported now")
        else {
            val disposable = Disposer.newDisposable()
            val compilerMessagesStream = PrintStream(BufferedOutputStream(RemoteOutputStreamClient(compilerMessagesOutputStream, DummyProfiler()), REMOTE_STREAM_BUFFER_SIZE))
            val messageCollector = KeepFirstErrorMessageCollector(compilerMessagesStream)
            val repl = KotlinJvmReplService(disposable, port, templateClasspath, templateClassName,
                                            messageCollector, operationsTracer)
            val sessionId = state.sessions.leaseSession(ClientOrSessionProxy(aliveFlagPath, repl, disposable))

            CompileService.CallResult.Good(sessionId)
        }' @ [479:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompileService.CallResult<Int>, elseBranch: CompileService.CallResult<Int>): CompileService.CallResult<Int>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallResult<Int>

'targetPlatform' @ [479:13] ==> value-parameter targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'JVM' @ [479:61] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'Error' @ [480:39] ==> public constructor Error(message: String) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Error[DeserializedClassConstructorDescriptor]

'newDisposable' @ [482:39] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'PrintStream' @ [483:42] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'BufferedOutputStream' @ [483:54] ==> public constructor BufferedOutputStream(p0: (OutputStream..OutputStream?), p1: Int) defined in java.io.BufferedOutputStream[JavaClassConstructorDescriptor]

'RemoteOutputStreamClient' @ [483:75] ==> public constructor RemoteOutputStreamClient(remote: RemoteOutputStream, profiler: Profiler = ...) defined in org.jetbrains.kotlin.daemon.RemoteOutputStreamClient[ClassConstructorDescriptorImpl]

'compilerMessagesOutputStream' @ [483:100] ==> value-parameter compilerMessagesOutputStream: RemoteOutputStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'DummyProfiler' @ [483:130] ==> public constructor DummyProfiler() defined in org.jetbrains.kotlin.daemon.common.DummyProfiler[DeserializedClassConstructorDescriptor]

'REMOTE_STREAM_BUFFER_SIZE' @ [483:148] ==> public const val REMOTE_STREAM_BUFFER_SIZE: Int defined in org.jetbrains.kotlin.daemon in file CompileServiceImpl.kt[PropertyDescriptorImpl]

'KeepFirstErrorMessageCollector' @ [484:36] ==> public constructor KeepFirstErrorMessageCollector(compilerMessagesStream: PrintStream) defined in org.jetbrains.kotlin.daemon.KeepFirstErrorMessageCollector[ClassConstructorDescriptorImpl]

'compilerMessagesStream' @ [484:67] ==> val compilerMessagesStream: PrintStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'KotlinJvmReplService' @ [485:24] ==> public constructor KotlinJvmReplService(disposable: Disposable, portForServers: Int, templateClasspath: List<File>, templateClassName: String, messageCollector: MessageCollector, operationsTracer: RemoteOperationsTracer?) defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[ClassConstructorDescriptorImpl]

'disposable' @ [485:45] ==> val disposable: Disposable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'port' @ [485:57] ==> public final val port: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'templateClasspath' @ [485:63] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'templateClassName' @ [485:82] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'messageCollector' @ [486:45] ==> val messageCollector: KeepFirstErrorMessageCollector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'operationsTracer' @ [486:63] ==> value-parameter operationsTracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'state' @ [487:29] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'sessions' @ [487:35] ==> public final val sessions: CompileServiceImpl.SessionsContainer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'leaseSession' @ [487:44] ==> public final fun <T : Any> leaseSession(session: CompileServiceImpl.ClientOrSessionProxy<KotlinJvmReplService>): Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> KotlinJvmReplService

'ClientOrSessionProxy' @ [487:57] ==> public constructor ClientOrSessionProxy<out T : Any>(aliveFlagPath: String?, data: KotlinJvmReplService? = ..., disposable: Disposable? = ...) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> KotlinJvmReplService

'aliveFlagPath' @ [487:78] ==> value-parameter aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'repl' @ [487:93] ==> val repl: KotlinJvmReplService defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'disposable' @ [487:99] ==> val disposable: Disposable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'Good' @ [489:39] ==> public constructor Good<out R>(result: Int) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> Int

'sessionId' @ [489:44] ==> val sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'releaseCompileSession' @ [494:91] ==> public open fun releaseCompileSession(sessionId: Int): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'sessionId' @ [494:113] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.releaseReplSession[ValueParameterDescriptorImpl]

'ifAlive' @ [497:13] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<ReplCheckResult>): CompileService.CallResult<ReplCheckResult> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCheckResult

'Alive' @ [497:46] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'withValidRepl' @ [498:17] ==> @JvmName private final inline fun <R> withValidRepl(sessionId: Int, body: KotlinJvmReplService.() -> CompileService.CallResult<ReplCheckResult>): CompileService.CallResult<ReplCheckResult> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCheckResult

'sessionId' @ [498:31] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteReplLineCheck[ValueParameterDescriptorImpl]

'CompileService' @ [499:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [499:47] ==> public constructor Good<out R>(result: ReplCheckResult) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> ReplCheckResult

'check' @ [499:52] ==> @Deprecated public final fun check(codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'codeLine' @ [499:58] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteReplLineCheck[ValueParameterDescriptorImpl]

'ifAlive' @ [504:13] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<ReplCompileResult>): CompileService.CallResult<ReplCompileResult> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCompileResult

'Alive' @ [504:46] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'withValidRepl' @ [505:17] ==> @JvmName private final inline fun <R> withValidRepl(sessionId: Int, body: KotlinJvmReplService.() -> CompileService.CallResult<ReplCompileResult>): CompileService.CallResult<ReplCompileResult> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCompileResult

'sessionId' @ [505:31] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteReplLineCompile[ValueParameterDescriptorImpl]

'CompileService' @ [506:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [506:47] ==> public constructor Good<out R>(result: ReplCompileResult) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> ReplCompileResult

'compile' @ [506:52] ==> @Deprecated public final fun compile(codeLine: ReplCodeLine, verifyHistory: List<ReplCodeLine>?): ReplCompileResult defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'codeLine' @ [506:60] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteReplLineCompile[ValueParameterDescriptorImpl]

'history' @ [506:70] ==> value-parameter history: List<ReplCodeLine>? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.remoteReplLineCompile[ValueParameterDescriptorImpl]

'ifAlive' @ [515:13] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Nothing>): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Nothing

'Alive' @ [515:46] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'CompileService' @ [516:17] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Error' @ [516:43] ==> public constructor Error(message: String) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Error[DeserializedClassConstructorDescriptor]

'ifAlive' @ [525:41] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'Alive' @ [525:74] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'if (compilationOptions.targetPlatform != CompileService.TargetPlatform.JVM)
            CompileService.CallResult.Error("Sorry, only JVM target platform is supported now")
        else {
            val disposable = Disposer.newDisposable()
            val messageCollector = CompileServicesFacadeMessageCollector(servicesFacade, compilationOptions)
            val repl = KotlinJvmReplService(disposable, port, templateClasspath, templateClassName,
                                            messageCollector, null)
            val sessionId = state.sessions.leaseSession(ClientOrSessionProxy(aliveFlagPath, repl, disposable))

            CompileService.CallResult.Good(sessionId)
        }' @ [526:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompileService.CallResult<Int>, elseBranch: CompileService.CallResult<Int>): CompileService.CallResult<Int>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallResult<Int>

'compilationOptions' @ [526:13] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'targetPlatform' @ [526:32] ==> public final val targetPlatform: CompileService.TargetPlatform defined in org.jetbrains.kotlin.daemon.common.CompilationOptions[DeserializedPropertyDescriptor]

'JVM' @ [526:80] ==> enum entry JVM defined in org.jetbrains.kotlin.daemon.common.CompileService.TargetPlatform[FakeCallableDescriptorForObject]

'Error' @ [527:39] ==> public constructor Error(message: String) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Error[DeserializedClassConstructorDescriptor]

'newDisposable' @ [529:39] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'CompileServicesFacadeMessageCollector' @ [530:36] ==> public constructor CompileServicesFacadeMessageCollector(servicesFacade: CompilerServicesFacadeBase, compilationOptions: CompilationOptions) defined in org.jetbrains.kotlin.daemon.report.CompileServicesFacadeMessageCollector[ClassConstructorDescriptorImpl]

'servicesFacade' @ [530:74] ==> value-parameter servicesFacade: CompilerServicesFacadeBase defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'compilationOptions' @ [530:90] ==> value-parameter compilationOptions: CompilationOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'KotlinJvmReplService' @ [531:24] ==> public constructor KotlinJvmReplService(disposable: Disposable, portForServers: Int, templateClasspath: List<File>, templateClassName: String, messageCollector: MessageCollector, operationsTracer: RemoteOperationsTracer?) defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[ClassConstructorDescriptorImpl]

'disposable' @ [531:45] ==> val disposable: Disposable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'port' @ [531:57] ==> public final val port: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'templateClasspath' @ [531:63] ==> value-parameter templateClasspath: List<File> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'templateClassName' @ [531:82] ==> value-parameter templateClassName: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'messageCollector' @ [532:45] ==> val messageCollector: CompileServicesFacadeMessageCollector defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'state' @ [533:29] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'sessions' @ [533:35] ==> public final val sessions: CompileServiceImpl.SessionsContainer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'leaseSession' @ [533:44] ==> public final fun <T : Any> leaseSession(session: CompileServiceImpl.ClientOrSessionProxy<KotlinJvmReplService>): Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> KotlinJvmReplService

'ClientOrSessionProxy' @ [533:57] ==> public constructor ClientOrSessionProxy<out T : Any>(aliveFlagPath: String?, data: KotlinJvmReplService? = ..., disposable: Disposable? = ...) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : Any> -> KotlinJvmReplService

'aliveFlagPath' @ [533:78] ==> value-parameter aliveFlagPath: String? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession[ValueParameterDescriptorImpl]

'repl' @ [533:93] ==> val repl: KotlinJvmReplService defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'disposable' @ [533:99] ==> val disposable: Disposable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'Good' @ [535:39] ==> public constructor Good<out R>(result: Int) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> Int

'sessionId' @ [535:44] ==> val sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.leaseReplSession.<anonymous>[LocalVariableDescriptor]

'ifAlive' @ [540:13] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<RemoteReplStateFacadeServer>): CompileService.CallResult<RemoteReplStateFacadeServer> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> RemoteReplStateFacadeServer

'Alive' @ [540:46] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'withValidRepl' @ [541:17] ==> @JvmName private final inline fun <R> withValidRepl(sessionId: Int, body: KotlinJvmReplService.() -> CompileService.CallResult<RemoteReplStateFacadeServer>): CompileService.CallResult<RemoteReplStateFacadeServer> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> RemoteReplStateFacadeServer

'sessionId' @ [541:31] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.replCreateState[ValueParameterDescriptorImpl]

'CompileService' @ [542:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [542:47] ==> public constructor Good<out R>(result: RemoteReplStateFacadeServer) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> RemoteReplStateFacadeServer

'createRemoteState' @ [542:52] ==> public final fun createRemoteState(port: Int = ...): RemoteReplStateFacadeServer defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'port' @ [542:70] ==> public final val port: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'ifAlive' @ [547:13] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<ReplCheckResult>): CompileService.CallResult<ReplCheckResult> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCheckResult

'Alive' @ [547:46] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'withValidRepl' @ [548:17] ==> @JvmName private final inline fun <R> withValidRepl(sessionId: Int, body: KotlinJvmReplService.() -> CompileService.CallResult<ReplCheckResult>): CompileService.CallResult<ReplCheckResult> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCheckResult

'sessionId' @ [548:31] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.replCheck[ValueParameterDescriptorImpl]

'withValidReplState' @ [549:21] ==> public final fun <R> withValidReplState(stateId: Int, body: (IReplStageState<*>) -> ReplCheckResult): CompileService.CallResult<ReplCheckResult> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCheckResult

'replStateId' @ [549:40] ==> value-parameter replStateId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.replCheck[ValueParameterDescriptorImpl]

'check' @ [550:25] ==> public open fun check(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'state' @ [550:31] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.replCheck.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'codeLine' @ [550:38] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.replCheck[ValueParameterDescriptorImpl]

'ifAlive' @ [556:13] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<ReplCompileResult>): CompileService.CallResult<ReplCompileResult> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCompileResult

'Alive' @ [556:46] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'withValidRepl' @ [557:17] ==> @JvmName private final inline fun <R> withValidRepl(sessionId: Int, body: KotlinJvmReplService.() -> CompileService.CallResult<ReplCompileResult>): CompileService.CallResult<ReplCompileResult> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCompileResult

'sessionId' @ [557:31] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.replCompile[ValueParameterDescriptorImpl]

'withValidReplState' @ [558:21] ==> public final fun <R> withValidReplState(stateId: Int, body: (IReplStageState<*>) -> ReplCompileResult): CompileService.CallResult<ReplCompileResult> defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ReplCompileResult

'replStateId' @ [558:40] ==> value-parameter replStateId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.replCompile[ValueParameterDescriptorImpl]

'compile' @ [559:25] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.daemon.KotlinJvmReplService[SimpleFunctionDescriptorImpl]

'state' @ [559:33] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.replCompile.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'codeLine' @ [559:40] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.replCompile[ValueParameterDescriptorImpl]

'unexportObject' @ [584:33] ==> public open fun unexportObject(p0: (Remote..Remote?), p1: Boolean): Boolean defined in java.rmi.server.UnicastRemoteObject[JavaMethodDescriptor]

'this' @ [584:48] ==> <this> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[LazyClassReceiverParameterDescriptor]

'exportObject' @ [590:40] ==> public open fun exportObject(p0: (Remote..Remote?), p1: Int, p2: (RMIClientSocketFactory..RMIClientSocketFactory?), p3: (RMIServerSocketFactory..RMIServerSocketFactory?)): (Remote..Remote?) defined in java.rmi.server.UnicastRemoteObject[JavaMethodDescriptor]

'this' @ [590:53] ==> <this> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[LazyClassReceiverParameterDescriptor]

'port' @ [590:59] ==> public final val port: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'clientLoopbackSocketFactory' @ [590:90] ==> public final val clientLoopbackSocketFactory: LoopbackNetworkInterface.ClientLoopbackSocketFactory defined in org.jetbrains.kotlin.daemon.common.LoopbackNetworkInterface[DeserializedPropertyDescriptor]

'serverLoopbackSocketFactory' @ [590:144] ==> public final val serverLoopbackSocketFactory: LoopbackNetworkInterface.ServerLoopbackSocketFactory defined in org.jetbrains.kotlin.daemon.common.LoopbackNetworkInterface[DeserializedPropertyDescriptor]

'registry' @ [591:9] ==> public final val registry: Registry defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'rebind' @ [591:18] ==> public abstract fun rebind(p0: (String..String?), p1: (Remote..Remote?)): Unit defined in java.rmi.registry.Registry[JavaMethodDescriptor]

'COMPILER_SERVICE_RMI_NAME' @ [591:26] ==> public val COMPILER_SERVICE_RMI_NAME: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'stub' @ [591:53] ==> val stub: CompileService defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.<init>[LocalVariableDescriptor]

'timer' @ [593:9] ==> public final val timer: Timer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'schedule' @ [593:15] ==> @InlineOnly public inline fun Timer.schedule(delay: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'exceptionLoggingTimerThread' @ [594:13] ==> private final inline fun exceptionLoggingTimerThread(body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'initiateElections' @ [594:43] ==> private final fun initiateElections(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'timer' @ [596:9] ==> public final val timer: Timer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'schedule' @ [596:15] ==> @InlineOnly public inline fun Timer.schedule(delay: Long, period: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'DAEMON_PERIODIC_CHECK_INTERVAL_MS' @ [596:32] ==> public val DAEMON_PERIODIC_CHECK_INTERVAL_MS: Long defined in org.jetbrains.kotlin.daemon in file KotlinCompileDaemon.kt[PropertyDescriptorImpl]

'DAEMON_PERIODIC_CHECK_INTERVAL_MS' @ [596:76] ==> public val DAEMON_PERIODIC_CHECK_INTERVAL_MS: Long defined in org.jetbrains.kotlin.daemon in file KotlinCompileDaemon.kt[PropertyDescriptorImpl]

'exceptionLoggingTimerThread' @ [597:13] ==> private final inline fun exceptionLoggingTimerThread(body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'periodicAndAfterSessionCheck' @ [597:43] ==> private final fun periodicAndAfterSessionCheck(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'timer' @ [599:9] ==> public final val timer: Timer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'schedule' @ [599:15] ==> @InlineOnly public inline fun Timer.schedule(delay: Long, period: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'DAEMON_PERIODIC_SELDOM_CHECK_INTERVAL_MS' @ [599:32] ==> public val DAEMON_PERIODIC_SELDOM_CHECK_INTERVAL_MS: Long defined in org.jetbrains.kotlin.daemon in file KotlinCompileDaemon.kt[PropertyDescriptorImpl]

'DAEMON_PERIODIC_SELDOM_CHECK_INTERVAL_MS' @ [599:89] ==> public val DAEMON_PERIODIC_SELDOM_CHECK_INTERVAL_MS: Long defined in org.jetbrains.kotlin.daemon in file KotlinCompileDaemon.kt[PropertyDescriptorImpl]

'exceptionLoggingTimerThread' @ [600:13] ==> private final inline fun exceptionLoggingTimerThread(body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'periodicSeldomCheck' @ [600:43] ==> private final fun periodicSeldomCheck(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'invoke' @ [606:13] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'err' @ [609:20] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [609:24] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'+' @ [609:32] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'e' @ [609:64] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.exceptionLoggingTimerThread[LocalVariableDescriptor]

'message' @ [609:66] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'e' @ [610:13] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.exceptionLoggingTimerThread[LocalVariableDescriptor]

'printStackTrace' @ [610:15] ==> public open fun printStackTrace(p0: (PrintStream..PrintStream?)): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'err' @ [610:38] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'log' @ [611:13] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'log' @ [611:17] ==> public open fun log(p0: (Level..Level?), p1: (String..String?), p2: (Throwable..Throwable?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'SEVERE' @ [611:27] ==> public final val SEVERE: (Level..Level?) defined in java.util.logging.Level[JavaPropertyDescriptor]

'e' @ [611:64] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.exceptionLoggingTimerThread[LocalVariableDescriptor]

'state' @ [617:13] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'delayedShutdownQueued' @ [617:19] ==> public final val delayedShutdownQueued: AtomicBoolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'get' @ [617:41] ==> public final fun get(): Boolean defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'state' @ [619:23] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'sessions' @ [619:29] ==> public final val sessions: CompileServiceImpl.SessionsContainer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'cleanDead' @ [619:38] ==> public final fun cleanDead(): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[SimpleFunctionDescriptorImpl]

'state' @ [619:53] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'cleanDeadClients' @ [619:59] ==> public final fun cleanDeadClients(): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[SimpleFunctionDescriptorImpl]

'ifAliveUnit' @ [621:9] ==> private final inline fun ifAliveUnit(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'LastSession' @ [621:46] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'when {
                // check if in graceful shutdown state and all sessions are closed
                state.alive.get() == Aliveness.LastSession.ordinal && state.sessions.isEmpty() -> {
                    log.info("All sessions finished")
                    shutdownWithDelay()
                    return
                }
                state.aliveClientsCount == 0 -> {
                    log.info("No more clients left")
                    shutdownWithDelay()
                    return
                }
                // discovery file removed - shutdown
                !runFile.exists() -> {
                    log.info("Run file removed")
                    shutdownWithDelay()
                    return
                }
            }' @ [622:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'state' @ [624:17] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'alive' @ [624:23] ==> public final var alive: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'get' @ [624:29] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'ordinal' @ [624:60] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[DeserializedPropertyDescriptor]

'state' @ [624:71] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'sessions' @ [624:77] ==> public final val sessions: CompileServiceImpl.SessionsContainer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'isEmpty' @ [624:86] ==> public final fun isEmpty(): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[SimpleFunctionDescriptorImpl]

'log' @ [625:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [625:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'shutdownWithDelay' @ [626:21] ==> private final fun shutdownWithDelay(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'state' @ [629:17] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'aliveClientsCount' @ [629:23] ==> public final val aliveClientsCount: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'log' @ [630:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [630:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'shutdownWithDelay' @ [631:21] ==> private final fun shutdownWithDelay(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'!' @ [635:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'runFile' @ [635:18] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'exists' @ [635:26] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'log' @ [636:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [636:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'shutdownWithDelay' @ [637:21] ==> private final fun shutdownWithDelay(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'ifAliveUnit' @ [643:9] ==> private final inline fun ifAliveUnit(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'Alive' @ [643:46] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'when {
                daemonOptions.autoshutdownUnusedSeconds != COMPILE_DAEMON_TIMEOUT_INFINITE_S && compilationsCounter.get() == 0 && nowSeconds() - lastUsedSeconds > daemonOptions.autoshutdownUnusedSeconds -> {
                    log.info("Unused timeout exceeded ${daemonOptions.autoshutdownUnusedSeconds}s")
                    gracefulShutdown(false)
                }
                daemonOptions.autoshutdownIdleSeconds != COMPILE_DAEMON_TIMEOUT_INFINITE_S && nowSeconds() - lastUsedSeconds > daemonOptions.autoshutdownIdleSeconds -> {
                    log.info("Idle timeout exceeded ${daemonOptions.autoshutdownIdleSeconds}s")
                    gracefulShutdown(false)
                }
                anyDead -> {
                    clearJarCache()
                }
            }' @ [644:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'daemonOptions' @ [645:17] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownUnusedSeconds' @ [645:31] ==> public final var autoshutdownUnusedSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'COMPILE_DAEMON_TIMEOUT_INFINITE_S' @ [645:60] ==> public val COMPILE_DAEMON_TIMEOUT_INFINITE_S: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'compilationsCounter' @ [645:97] ==> private final val compilationsCounter: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'get' @ [645:117] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'nowSeconds' @ [645:131] ==> public fun nowSeconds(): Long defined in org.jetbrains.kotlin.daemon in file CompileServiceImpl.kt[SimpleFunctionDescriptorImpl]

'lastUsedSeconds' @ [645:146] ==> public final val lastUsedSeconds: Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'daemonOptions' @ [645:164] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownUnusedSeconds' @ [645:178] ==> public final var autoshutdownUnusedSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'log' @ [646:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [646:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'daemonOptions' @ [646:57] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownUnusedSeconds' @ [646:71] ==> public final var autoshutdownUnusedSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'gracefulShutdown' @ [647:21] ==> private final fun gracefulShutdown(onAnotherThread: Boolean): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'daemonOptions' @ [649:17] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownIdleSeconds' @ [649:31] ==> public final var autoshutdownIdleSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'COMPILE_DAEMON_TIMEOUT_INFINITE_S' @ [649:58] ==> public val COMPILE_DAEMON_TIMEOUT_INFINITE_S: Int defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'nowSeconds' @ [649:95] ==> public fun nowSeconds(): Long defined in org.jetbrains.kotlin.daemon in file CompileServiceImpl.kt[SimpleFunctionDescriptorImpl]

'lastUsedSeconds' @ [649:110] ==> public final val lastUsedSeconds: Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'daemonOptions' @ [649:128] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownIdleSeconds' @ [649:142] ==> public final var autoshutdownIdleSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'log' @ [650:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [650:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'daemonOptions' @ [650:55] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownIdleSeconds' @ [650:69] ==> public final var autoshutdownIdleSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'gracefulShutdown' @ [651:21] ==> private final fun gracefulShutdown(onAnotherThread: Boolean): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'anyDead' @ [653:17] ==> val anyDead: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.periodicAndAfterSessionCheck[LocalVariableDescriptor]

'clearJarCache' @ [654:21] ==> public open fun clearJarCache(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'ifAliveUnit' @ [661:9] ==> private final inline fun ifAliveUnit(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'Alive' @ [661:46] ==> enum entry Alive defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'classpathWatcher' @ [664:17] ==> private final val classpathWatcher: LazyClasspathWatcher defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'isChanged' @ [664:34] ==> public final val isChanged: Boolean defined in org.jetbrains.kotlin.daemon.LazyClasspathWatcher[PropertyDescriptorImpl]

'log' @ [665:17] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [665:21] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'gracefulShutdown' @ [666:17] ==> private final fun gracefulShutdown(onAnotherThread: Boolean): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'ifAliveUnit' @ [675:9] ==> private final inline fun ifAliveUnit(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'log' @ [677:13] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [677:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'walkDaemons' @ [678:33] ==> public fun walkDaemons(registryDir: File, compilerId: CompilerId, fileToCompareTimestamp: File, filter: (File, Int) -> Boolean = ..., report: (DaemonReportCategory, String) -> Unit = ...): Sequence<DaemonWithMetadata> defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'File' @ [678:45] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'daemonOptions' @ [678:50] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'runFilesPathOrDefault' @ [678:64] ==> public val DaemonOptions.runFilesPathOrDefault: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'compilerId' @ [678:88] ==> public final val compilerId: CompilerId defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'runFile' @ [678:100] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'p' @ [678:128] ==> value-parameter p: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'port' @ [678:133] ==> public final val port: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'log' @ [678:162] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [678:166] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'msg' @ [678:171] ==> value-parameter msg: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [678:179] ==> public fun <T> Sequence<DaemonWithMetadata>.toList(): List<DaemonWithMetadata> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata

'compareByDescending' @ [679:30] ==> @InlineOnly public inline fun <T, K> compareByDescending(comparator: Comparator<in DaemonJVMOptions> /* = Comparator<in DaemonJVMOptions> */, crossinline selector: (DaemonWithMetadata) -> DaemonJVMOptions): Comparator<DaemonWithMetadata> /* = Comparator<DaemonWithMetadata> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata
    <K> -> DaemonJVMOptions

'DaemonJVMOptionsMemoryComparator' @ [679:88] ==> public constructor DaemonJVMOptionsMemoryComparator() defined in org.jetbrains.kotlin.daemon.common.DaemonJVMOptionsMemoryComparator[DeserializedClassConstructorDescriptor]

'it' @ [679:126] ==> value-parameter it: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'jvmOptions' @ [679:129] ==> public final val jvmOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'thenBy' @ [680:22] ==> @InlineOnly public inline fun <T, K> Comparator<DaemonWithMetadata> /* = Comparator<DaemonWithMetadata> */.thenBy(comparator: Comparator<in File> /* = Comparator<in File> */, crossinline selector: (DaemonWithMetadata) -> File): Comparator<DaemonWithMetadata> /* = Comparator<DaemonWithMetadata> */ defined in kotlin.comparisons[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata
    <K> -> File

'FileAgeComparator' @ [680:29] ==> public constructor FileAgeComparator() defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator[DeserializedClassConstructorDescriptor]

'it' @ [680:52] ==> value-parameter it: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [680:55] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'aliveWithOpts' @ [681:13] ==> val aliveWithOpts: List<DaemonWithMetadata> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>[LocalVariableDescriptor]

'maxWith' @ [681:27] ==> public fun <T> Iterable<DaemonWithMetadata>.maxWith(comparator: Comparator<in DaemonWithMetadata> /* = Comparator<in DaemonWithMetadata> */): DaemonWithMetadata? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata

'comparator' @ [681:35] ==> val comparator: Comparator<DaemonWithMetadata> /* = Comparator<DaemonWithMetadata> */ defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>[LocalVariableDescriptor]

'let' @ [681:48] ==> @InlineOnly public inline fun <T, R> DaemonWithMetadata.let(block: (DaemonWithMetadata) -> Any): Any defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata
    <R> -> Any

'bestDaemonWithMetadata' @ [682:35] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'jvmOptions' @ [682:58] ==> public final val jvmOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'if (fattestOpts memorywiseFitsInto daemonJVMOptions && FileAgeComparator().compare(bestDaemonWithMetadata.runFile, runFile) < 0 ) {
                    // all others are smaller that me, take overs' clients and shut them down
                    log.info("$LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE lower prio, taking clients from them and schedule them to shutdown: my runfile: ${runFile.name} (${runFile.lastModified()}) vs best other runfile: ${bestDaemonWithMetadata.runFile.name} (${bestDaemonWithMetadata.runFile.lastModified()})")
                    aliveWithOpts.forEach { (daemon, runFile, _) ->
                        try {
                            daemon.getClients().takeIf { it.isGood }?.let {
                                it.get().forEach { clientAliveFile -> registerClient(clientAliveFile) }
                            }
                            daemon.scheduleShutdown(true)
                        }
                        catch (e: Throwable) {
                            log.info("Cannot connect to a daemon, assuming dying ('${runFile.canonicalPath}'): ${e.message}")
                        }
                    }
                }
                // TODO: seems that the second part of condition is incorrect, reconsider:
                // the comment by @tsvtkv from review:
                //    Algorithm in plain english:
                //    (1) If the best daemon fits into me and the best daemon is younger than me, then I take over all other daemons clients.
                //    (2) If I fit into the best daemon and the best daemon is older than me, then I give my clients to that daemon.
                //
                //    For example:
                //
                //    daemon A starts with params: maxMem=100, codeCache=50
                //    daemon B starts with params: maxMem=200, codeCache=50
                //    daemon C starts with params: maxMem=150, codeCache=100
                //    A performs election: (1) is false because neither B nor C does not fit into A, (2) is false because both B and C are younger than A.
                //    B performs election: (1) is false because neither A nor C does not fit into B, (2) is false because B does not fit into neither A nor C.
                //    C performs election: (1) is false because B is better than A and B does not fit into C, (2) is false C does not fit into neither A nor B.
                //    Result: all daemons are alive and well.
                else if (daemonJVMOptions memorywiseFitsInto fattestOpts && FileAgeComparator().compare(bestDaemonWithMetadata.runFile, runFile) > 0) {
                    // there is at least one bigger, handover my clients to it and shutdown
                    log.info("$LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE higher prio, handover clients to it and schedule shutdown: my runfile: ${runFile.name} (${runFile.lastModified()}) vs best other runfile: ${bestDaemonWithMetadata.runFile.name} (${bestDaemonWithMetadata.runFile.lastModified()})")
                    getClients().takeIf { it.isGood }?.let {
                        it.get().forEach { bestDaemonWithMetadata.daemon.registerClient(it) }
                    }
                    scheduleShutdown(true)
                }
                else {
                    // undecided, do nothing
                    log.info("$LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE equal prio, continue: ${runFile.name} (${runFile.lastModified()}) vs best other runfile: ${bestDaemonWithMetadata.runFile.name} (${bestDaemonWithMetadata.runFile.lastModified()})")
                    // TODO: implement some behaviour here, e.g.:
                    //   - shutdown/takeover smaller daemon
                    //   - run (or better persuade client to run) a bigger daemon (in fact may be even simple shutdown will do, because of client's daemon choosing logic)
                }' @ [683:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'fattestOpts' @ [683:21] ==> val fattestOpts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[LocalVariableDescriptor]

'daemonJVMOptions' @ [683:52] ==> public final val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'FileAgeComparator' @ [683:72] ==> public constructor FileAgeComparator() defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator[DeserializedClassConstructorDescriptor]

'compare' @ [683:92] ==> public open fun compare(left: File, right: File): Int defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator[DeserializedSimpleFunctionDescriptor]

'bestDaemonWithMetadata' @ [683:100] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [683:123] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'runFile' @ [683:132] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'log' @ [685:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [685:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE' @ [685:32] ==> public const val LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'runFile' @ [685:153] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'name' @ [685:161] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'runFile' @ [685:170] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'lastModified' @ [685:178] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'bestDaemonWithMetadata' @ [685:220] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [685:243] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'name' @ [685:251] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'bestDaemonWithMetadata' @ [685:260] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [685:283] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'lastModified' @ [685:291] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'aliveWithOpts' @ [686:21] ==> val aliveWithOpts: List<DaemonWithMetadata> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>[LocalVariableDescriptor]

'forEach' @ [686:35] ==> @HidesMembers public inline fun <T> Iterable<DaemonWithMetadata>.forEach(action: (DaemonWithMetadata) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DaemonWithMetadata

'component1' @ [686:46] ==> public final operator fun component1(): CompileService defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedSimpleFunctionDescriptor]

'component2' @ [686:54] ==> public final operator fun component2(): File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedSimpleFunctionDescriptor]

'component3' @ [686:63] ==> public final operator fun component3(): DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedSimpleFunctionDescriptor]

'daemon' @ [688:29] ==> val daemon: CompileService defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getClients' @ [688:36] ==> public abstract fun getClients(): CompileService.CallResult<List<String>> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'takeIf' @ [688:49] ==> @InlineOnly @SinceKotlin public inline fun <T> CompileService.CallResult<List<String>>.takeIf(predicate: (CompileService.CallResult<List<String>>) -> Boolean): CompileService.CallResult<List<String>>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<List<String>>

'it' @ [688:58] ==> value-parameter it: CompileService.CallResult<List<String>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isGood' @ [688:61] ==> public final val isGood: Boolean defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedPropertyDescriptor]

'let' @ [688:71] ==> @InlineOnly public inline fun <T, R> CompileService.CallResult<List<String>>.let(block: (CompileService.CallResult<List<String>>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<List<String>>
    <R> -> Unit

'it' @ [689:33] ==> value-parameter it: CompileService.CallResult<List<String>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [689:36] ==> public abstract fun get(): List<String> defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'forEach' @ [689:42] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'registerClient' @ [689:71] ==> public open fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'clientAliveFile' @ [689:86] ==> value-parameter clientAliveFile: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'daemon' @ [691:29] ==> val daemon: CompileService defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'scheduleShutdown' @ [691:36] ==> public abstract fun scheduleShutdown(graceful: Boolean): CompileService.CallResult<Boolean> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'log' @ [694:29] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [694:33] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'runFile' @ [694:86] ==> val runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'canonicalPath' @ [694:94] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'e' @ [694:114] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'message' @ [694:116] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'if (daemonJVMOptions memorywiseFitsInto fattestOpts && FileAgeComparator().compare(bestDaemonWithMetadata.runFile, runFile) > 0) {
                    // there is at least one bigger, handover my clients to it and shutdown
                    log.info("$LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE higher prio, handover clients to it and schedule shutdown: my runfile: ${runFile.name} (${runFile.lastModified()}) vs best other runfile: ${bestDaemonWithMetadata.runFile.name} (${bestDaemonWithMetadata.runFile.lastModified()})")
                    getClients().takeIf { it.isGood }?.let {
                        it.get().forEach { bestDaemonWithMetadata.daemon.registerClient(it) }
                    }
                    scheduleShutdown(true)
                }
                else {
                    // undecided, do nothing
                    log.info("$LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE equal prio, continue: ${runFile.name} (${runFile.lastModified()}) vs best other runfile: ${bestDaemonWithMetadata.runFile.name} (${bestDaemonWithMetadata.runFile.lastModified()})")
                    // TODO: implement some behaviour here, e.g.:
                    //   - shutdown/takeover smaller daemon
                    //   - run (or better persuade client to run) a bigger daemon (in fact may be even simple shutdown will do, because of client's daemon choosing logic)
                }' @ [713:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'daemonJVMOptions' @ [713:26] ==> public final val daemonJVMOptions: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'fattestOpts' @ [713:62] ==> val fattestOpts: DaemonJVMOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[LocalVariableDescriptor]

'FileAgeComparator' @ [713:77] ==> public constructor FileAgeComparator() defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator[DeserializedClassConstructorDescriptor]

'compare' @ [713:97] ==> public open fun compare(left: File, right: File): Int defined in org.jetbrains.kotlin.daemon.common.FileAgeComparator[DeserializedSimpleFunctionDescriptor]

'bestDaemonWithMetadata' @ [713:105] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [713:128] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'runFile' @ [713:137] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'log' @ [715:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [715:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE' @ [715:32] ==> public const val LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'runFile' @ [715:144] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'name' @ [715:152] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'runFile' @ [715:161] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'lastModified' @ [715:169] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'bestDaemonWithMetadata' @ [715:211] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [715:234] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'name' @ [715:242] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'bestDaemonWithMetadata' @ [715:251] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [715:274] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'lastModified' @ [715:282] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'getClients' @ [716:21] ==> public open fun getClients(): CompileService.CallResult<List<String>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'takeIf' @ [716:34] ==> @InlineOnly @SinceKotlin public inline fun <T> CompileService.CallResult<List<String>>.takeIf(predicate: (CompileService.CallResult<List<String>>) -> Boolean): CompileService.CallResult<List<String>>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<List<String>>

'it' @ [716:43] ==> value-parameter it: CompileService.CallResult<List<String>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isGood' @ [716:46] ==> public final val isGood: Boolean defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedPropertyDescriptor]

'let' @ [716:56] ==> @InlineOnly public inline fun <T, R> CompileService.CallResult<List<String>>.let(block: (CompileService.CallResult<List<String>>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<List<String>>
    <R> -> Unit

'it' @ [717:25] ==> value-parameter it: CompileService.CallResult<List<String>> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [717:28] ==> public abstract fun get(): List<String> defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult[DeserializedSimpleFunctionDescriptor]

'forEach' @ [717:34] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'bestDaemonWithMetadata' @ [717:44] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'daemon' @ [717:67] ==> public final val daemon: CompileService defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'registerClient' @ [717:74] ==> public abstract fun registerClient(aliveFlagPath: String?): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.common.CompileService[DeserializedSimpleFunctionDescriptor]

'it' @ [717:89] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scheduleShutdown' @ [719:21] ==> public open fun scheduleShutdown(graceful: Boolean): CompileService.CallResult<Boolean> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'log' @ [723:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [723:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE' @ [723:32] ==> public const val LOG_PREFIX_ASSUMING_OTHER_DAEMONS_HAVE: String defined in org.jetbrains.kotlin.daemon.common[DeserializedPropertyDescriptor]

'runFile' @ [723:95] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'name' @ [723:103] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'runFile' @ [723:112] ==> private final var runFile: File defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'lastModified' @ [723:120] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'bestDaemonWithMetadata' @ [723:162] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [723:185] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'name' @ [723:193] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'bestDaemonWithMetadata' @ [723:202] ==> value-parameter bestDaemonWithMetadata: DaemonWithMetadata defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.initiateElections.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'runFile' @ [723:225] ==> public final val runFile: File defined in org.jetbrains.kotlin.daemon.common.DaemonWithMetadata[DeserializedPropertyDescriptor]

'lastModified' @ [723:233] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'log' @ [733:9] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [733:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'this' @ [734:25] ==> <this> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.shutdownNow.mb[ReceiverParameterDescriptorImpl]

'*' @ [734:33] ==> public final operator fun times(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'with' @ [735:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (Runtime..Runtime?), block: (Runtime..Runtime?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.Runtime..java.lang.Runtime?)
    <R> -> Unit

'getRuntime' @ [735:23] ==> public open fun getRuntime(): (Runtime..Runtime?) defined in java.lang.Runtime[JavaMethodDescriptor]

'log' @ [736:13] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [736:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'totalMemory' @ [736:46] ==> public open fun totalMemory(): Long defined in java.lang.Runtime[JavaMethodDescriptor]

'mb' @ [736:60] ==> local final fun Long.mb(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.shutdownNow[SimpleFunctionDescriptorImpl]

'freeMemory' @ [736:77] ==> public open fun freeMemory(): Long defined in java.lang.Runtime[JavaMethodDescriptor]

'mb' @ [736:90] ==> local final fun Long.mb(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.shutdownNow[SimpleFunctionDescriptorImpl]

'maxMemory' @ [736:106] ==> public open fun maxMemory(): Long defined in java.lang.Runtime[JavaMethodDescriptor]

'mb' @ [736:118] ==> local final fun Long.mb(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.shutdownNow[SimpleFunctionDescriptorImpl]

'state' @ [738:9] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'alive' @ [738:15] ==> public final var alive: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'set' @ [738:21] ==> public final fun set(p0: Int): Unit defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'ordinal' @ [738:41] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[DeserializedPropertyDescriptor]

'unexportObject' @ [740:29] ==> public open fun unexportObject(p0: (Remote..Remote?), p1: Boolean): Boolean defined in java.rmi.server.UnicastRemoteObject[JavaMethodDescriptor]

'this' @ [740:44] ==> <this> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[LazyClassReceiverParameterDescriptor]

'log' @ [741:9] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [741:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'invoke' @ [742:9] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'log' @ [743:9] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'handlers' @ [743:13] ==> public final val Logger.handlers: (Array<(Handler..Handler?)>..Array<out (Handler..Handler?)>?)[MyPropertyDescriptor]

'forEach' @ [743:22] ==> public inline fun <T> Array<out (Handler..Handler?)>.forEach(action: ((Handler..Handler?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.logging.Handler..java.util.logging.Handler?)

'it' @ [743:32] ==> value-parameter it: (Handler..Handler?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.shutdownNow.<anonymous>[ValueParameterDescriptorImpl]

'flush' @ [743:35] ==> public abstract fun flush(): Unit defined in java.util.logging.Handler[JavaMethodDescriptor]

'state' @ [747:9] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'delayedShutdownQueued' @ [747:15] ==> public final val delayedShutdownQueued: AtomicBoolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'set' @ [747:37] ==> public final fun set(p0: Boolean): Unit defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'compilationsCounter' @ [748:40] ==> private final val compilationsCounter: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'get' @ [748:60] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'log' @ [749:9] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [749:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'daemonOptions' @ [749:41] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'shutdownDelayMilliseconds' @ [749:55] ==> public final var shutdownDelayMilliseconds: Long defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'timer' @ [750:9] ==> public final val timer: Timer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'schedule' @ [750:15] ==> @InlineOnly public inline fun Timer.schedule(delay: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'daemonOptions' @ [750:24] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'shutdownDelayMilliseconds' @ [750:38] ==> public final var shutdownDelayMilliseconds: Long defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'state' @ [751:13] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'delayedShutdownQueued' @ [751:19] ==> public final val delayedShutdownQueued: AtomicBoolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'set' @ [751:41] ==> public final fun set(p0: Boolean): Unit defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'if (currentCompilationsCount == compilationsCounter.get()) {
                ifAliveExclusiveUnit(minAliveness = Aliveness.LastSession) {
                    log.fine("Execute delayed shutdown")
                    shutdownNow()
                }
            }
            else {
                log.info("Cancel delayed shutdown due to new client")
            }' @ [752:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'currentCompilationsCount' @ [752:17] ==> val currentCompilationsCount: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.shutdownWithDelay[LocalVariableDescriptor]

'compilationsCounter' @ [752:45] ==> private final val compilationsCounter: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'get' @ [752:65] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'ifAliveExclusiveUnit' @ [753:17] ==> private final inline fun ifAliveExclusiveUnit(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'LastSession' @ [753:63] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'log' @ [754:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'fine' @ [754:25] ==> public open fun fine(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'shutdownNow' @ [755:21] ==> private final fun shutdownNow(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'log' @ [759:17] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [759:21] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'when {
            state.sessions.isEmpty() -> shutdownWithDelay()
            else -> {
                daemonOptions.autoshutdownIdleSeconds = TimeUnit.MILLISECONDS.toSeconds(daemonOptions.forceShutdownTimeoutMilliseconds).toInt()
                daemonOptions.autoshutdownUnusedSeconds = daemonOptions.autoshutdownIdleSeconds
                log.info("Some sessions are active, waiting for them to finish")
                log.info("Unused/idle timeouts are set to ${daemonOptions.autoshutdownUnusedSeconds}/${daemonOptions.autoshutdownIdleSeconds}s")
            }
        }' @ [766:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'state' @ [767:13] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'sessions' @ [767:19] ==> public final val sessions: CompileServiceImpl.SessionsContainer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'isEmpty' @ [767:28] ==> public final fun isEmpty(): Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.SessionsContainer[SimpleFunctionDescriptorImpl]

'shutdownWithDelay' @ [767:41] ==> private final fun shutdownWithDelay(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'daemonOptions' @ [769:17] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownIdleSeconds' @ [769:31] ==> public final var autoshutdownIdleSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'toSeconds' @ [769:79] ==> public open fun toSeconds(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'daemonOptions' @ [769:89] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'forceShutdownTimeoutMilliseconds' @ [769:103] ==> public final var forceShutdownTimeoutMilliseconds: Long defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'toInt' @ [769:137] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'daemonOptions' @ [770:17] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownUnusedSeconds' @ [770:31] ==> public final var autoshutdownUnusedSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'daemonOptions' @ [770:59] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownIdleSeconds' @ [770:73] ==> public final var autoshutdownIdleSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'log' @ [771:17] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [771:21] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'log' @ [772:17] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [772:21] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'daemonOptions' @ [772:61] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownUnusedSeconds' @ [772:75] ==> public final var autoshutdownUnusedSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'daemonOptions' @ [772:104] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'autoshutdownIdleSeconds' @ [772:118] ==> public final var autoshutdownIdleSeconds: Int defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'!' @ [776:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'state' @ [776:14] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'alive' @ [776:20] ==> public final var alive: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'compareAndSet' @ [776:26] ==> public final fun compareAndSet(p0: Int, p1: Int): Boolean defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'ordinal' @ [776:56] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[DeserializedPropertyDescriptor]

'ordinal' @ [776:87] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[DeserializedPropertyDescriptor]

'log' @ [777:13] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [777:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'state' @ [777:62] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'alive' @ [777:68] ==> public final var alive: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'get' @ [777:74] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'toAlivenessName' @ [777:80] ==> private final fun Int.toAlivenessName(): String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'log' @ [780:9] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [780:13] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'if (!onAnotherThread) {
            shutdownIfIdle()
        }
        else {
            timer.schedule(1) {
                ifAliveExclusiveUnit(minAliveness = Aliveness.LastSession) {
                    shutdownIfIdle()
                }
            }
        }' @ [782:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [782:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'onAnotherThread' @ [782:14] ==> value-parameter onAnotherThread: Boolean defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.gracefulShutdown[ValueParameterDescriptorImpl]

'shutdownIfIdle' @ [783:13] ==> local final fun shutdownIfIdle(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.gracefulShutdown[SimpleFunctionDescriptorImpl]

'timer' @ [786:13] ==> public final val timer: Timer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'schedule' @ [786:19] ==> @InlineOnly public inline fun Timer.schedule(delay: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'ifAliveExclusiveUnit' @ [787:17] ==> private final inline fun ifAliveExclusiveUnit(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> Unit): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'LastSession' @ [787:63] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'shutdownIfIdle' @ [788:21] ==> local final fun shutdownIfIdle(): Unit defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.gracefulShutdown[SimpleFunctionDescriptorImpl]

'ifAlive' @ [802:13] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'withValidClientOrSessionProxy' @ [803:17] ==> private final inline fun <R> withValidClientOrSessionProxy(sessionId: Int, body: (CompileServiceImpl.ClientOrSessionProxy<Any>?) -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'sessionId' @ [803:47] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'operationsTracer' @ [804:21] ==> value-parameter operationsTracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'before' @ [804:39] ==> public abstract fun before(id: String): Unit defined in org.jetbrains.kotlin.daemon.common.RemoteOperationsTracer[DeserializedSimpleFunctionDescriptor]

'if (daemonOptions.reportPerf) WallAndThreadTotalProfiler() else DummyProfiler()' @ [805:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Profiler, elseBranch: Profiler): Profiler[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Profiler

'daemonOptions' @ [805:43] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'reportPerf' @ [805:57] ==> public final var reportPerf: Boolean defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'WallAndThreadTotalProfiler' @ [805:69] ==> public constructor WallAndThreadTotalProfiler() defined in org.jetbrains.kotlin.daemon.common.WallAndThreadTotalProfiler[DeserializedClassConstructorDescriptor]

'DummyProfiler' @ [805:103] ==> public constructor DummyProfiler() defined in org.jetbrains.kotlin.daemon.common.DummyProfiler[DeserializedClassConstructorDescriptor]

'EventManagerImpl' @ [806:39] ==> public constructor EventManagerImpl() defined in org.jetbrains.kotlin.daemon.EventManagerImpl[ClassConstructorDescriptorImpl]

'PrintStream' @ [807:50] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'BufferedOutputStream' @ [807:62] ==> public constructor BufferedOutputStream(p0: (OutputStream..OutputStream?), p1: Int) defined in java.io.BufferedOutputStream[JavaClassConstructorDescriptor]

'RemoteOutputStreamClient' @ [807:83] ==> public constructor RemoteOutputStreamClient(remote: RemoteOutputStream, profiler: Profiler = ...) defined in org.jetbrains.kotlin.daemon.RemoteOutputStreamClient[ClassConstructorDescriptorImpl]

'compilerMessagesStreamProxy' @ [807:108] ==> value-parameter compilerMessagesStreamProxy: RemoteOutputStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'rpcProfiler' @ [807:137] ==> val rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'REMOTE_STREAM_BUFFER_SIZE' @ [807:151] ==> public const val REMOTE_STREAM_BUFFER_SIZE: Int defined in org.jetbrains.kotlin.daemon in file CompileServiceImpl.kt[PropertyDescriptorImpl]

'PrintStream' @ [808:47] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'BufferedOutputStream' @ [808:59] ==> public constructor BufferedOutputStream(p0: (OutputStream..OutputStream?), p1: Int) defined in java.io.BufferedOutputStream[JavaClassConstructorDescriptor]

'RemoteOutputStreamClient' @ [808:80] ==> public constructor RemoteOutputStreamClient(remote: RemoteOutputStream, profiler: Profiler = ...) defined in org.jetbrains.kotlin.daemon.RemoteOutputStreamClient[ClassConstructorDescriptorImpl]

'serviceOutputStreamProxy' @ [808:105] ==> value-parameter serviceOutputStreamProxy: RemoteOutputStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'rpcProfiler' @ [808:131] ==> val rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'REMOTE_STREAM_BUFFER_SIZE' @ [808:145] ==> public const val REMOTE_STREAM_BUFFER_SIZE: Int defined in org.jetbrains.kotlin.daemon in file CompileServiceImpl.kt[PropertyDescriptorImpl]

'DaemonMessageReporterPrintStreamAdapter' @ [810:54] ==> public constructor DaemonMessageReporterPrintStreamAdapter(out: PrintStream) defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporterPrintStreamAdapter[ClassConstructorDescriptorImpl]

'serviceOutputStream' @ [810:94] ==> val serviceOutputStream: PrintStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'args' @ [811:29] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'none' @ [811:34] ==> public fun <T> Array<out String>.none(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'IllegalArgumentException' @ [812:35] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'log' @ [813:25] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [813:29] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'+' @ [813:34] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'args' @ [813:71] ==> value-parameter args: Array<out String> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'joinToString' @ [813:76] ==> public fun <T> Array<out String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'checkedCompile' @ [814:40] ==> private final fun <R> checkedCompile(daemonMessageReporter: DaemonMessageReporter, rpcProfiler: Profiler, body: () -> Int): Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'compileServiceReporter' @ [814:55] ==> val compileServiceReporter: DaemonMessageReporterPrintStreamAdapter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rpcProfiler' @ [814:79] ==> val rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'invoke' @ [815:29] ==> public abstract operator fun invoke(p1: PrintStream, p2: EventManager, p3: Profiler): ExitCode defined in kotlin.Function3[FunctionInvokeDescriptor]

'compilerMessagesStream' @ [815:34] ==> val compilerMessagesStream: PrintStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'eventManger' @ [815:58] ==> val eventManger: EventManagerImpl defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rpcProfiler' @ [815:71] ==> val rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'code' @ [815:84] ==> public final val ExitCode.code: Int[MyPropertyDescriptor]

'CompileService' @ [817:25] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [817:51] ==> public constructor Good<out R>(result: Int) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> Int

'exitCode' @ [817:56] ==> val exitCode: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'serviceOutputStream' @ [820:25] ==> val serviceOutputStream: PrintStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'flush' @ [820:45] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'compilerMessagesStream' @ [821:25] ==> val compilerMessagesStream: PrintStream defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'flush' @ [821:48] ==> public open fun flush(): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'eventManger' @ [822:25] ==> val eventManger: EventManagerImpl defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fireCompilationFinished' @ [822:37] ==> public final fun fireCompilationFinished(): Unit defined in org.jetbrains.kotlin.daemon.EventManagerImpl[SimpleFunctionDescriptorImpl]

'operationsTracer' @ [823:25] ==> value-parameter operationsTracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'after' @ [823:43] ==> public abstract fun after(id: String): Unit defined in org.jetbrains.kotlin.daemon.common.RemoteOperationsTracer[DeserializedSimpleFunctionDescriptor]

'ifAlive' @ [832:13] ==> private final inline fun <R> ifAlive(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'withValidClientOrSessionProxy' @ [833:17] ==> private final inline fun <R> withValidClientOrSessionProxy(sessionId: Int, body: (CompileServiceImpl.ClientOrSessionProxy<Any>?) -> CompileService.CallResult<Int>): CompileService.CallResult<Int> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'sessionId' @ [833:47] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'tracer' @ [834:21] ==> value-parameter tracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'before' @ [834:29] ==> public abstract fun before(id: String): Unit defined in org.jetbrains.kotlin.daemon.common.RemoteOperationsTracer[DeserializedSimpleFunctionDescriptor]

'if (daemonOptions.reportPerf) WallAndThreadTotalProfiler() else DummyProfiler()' @ [835:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Profiler, elseBranch: Profiler): Profiler[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Profiler

'daemonOptions' @ [835:43] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'reportPerf' @ [835:57] ==> public final var reportPerf: Boolean defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'WallAndThreadTotalProfiler' @ [835:69] ==> public constructor WallAndThreadTotalProfiler() defined in org.jetbrains.kotlin.daemon.common.WallAndThreadTotalProfiler[DeserializedClassConstructorDescriptor]

'DummyProfiler' @ [835:103] ==> public constructor DummyProfiler() defined in org.jetbrains.kotlin.daemon.common.DummyProfiler[DeserializedClassConstructorDescriptor]

'EventManagerImpl' @ [836:39] ==> public constructor EventManagerImpl() defined in org.jetbrains.kotlin.daemon.EventManagerImpl[ClassConstructorDescriptorImpl]

'checkedCompile' @ [838:40] ==> private final fun <R> checkedCompile(daemonMessageReporter: DaemonMessageReporter, rpcProfiler: Profiler, body: () -> Int): Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Int

'daemonMessageReporter' @ [838:55] ==> value-parameter daemonMessageReporter: DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'rpcProfiler' @ [838:78] ==> val rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'invoke' @ [839:29] ==> public abstract operator fun invoke(p1: EventManager, p2: Profiler): ExitCode defined in kotlin.Function2[FunctionInvokeDescriptor]

'eventManger' @ [839:34] ==> val eventManger: EventManagerImpl defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'rpcProfiler' @ [839:47] ==> val rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'code' @ [839:60] ==> public final val ExitCode.code: Int[MyPropertyDescriptor]

'CompileService' @ [841:25] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [841:51] ==> public constructor Good<out R>(result: Int) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> Int

'exitCode' @ [841:56] ==> val exitCode: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'eventManger' @ [844:25] ==> val eventManger: EventManagerImpl defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fireCompilationFinished' @ [844:37] ==> public final fun fireCompilationFinished(): Unit defined in org.jetbrains.kotlin.daemon.EventManagerImpl[SimpleFunctionDescriptorImpl]

'tracer' @ [845:25] ==> value-parameter tracer: RemoteOperationsTracer? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.doCompile[ValueParameterDescriptorImpl]

'after' @ [845:33] ==> public abstract fun after(id: String): Unit defined in org.jetbrains.kotlin.daemon.common.RemoteOperationsTracer[DeserializedSimpleFunctionDescriptor]

'Services' @ [851:23] ==> public companion object defined in org.jetbrains.kotlin.config.Services[FakeCallableDescriptorForObject]

'Builder' @ [851:32] ==> public constructor Builder() defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedClassConstructorDescriptor]

'facade' @ [852:13] ==> value-parameter facade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[ValueParameterDescriptorImpl]

'hasIncrementalCaches' @ [852:20] ==> public abstract fun hasIncrementalCaches(): Boolean defined in org.jetbrains.kotlin.daemon.common.CompilerCallbackServicesFacade[DeserializedSimpleFunctionDescriptor]

'facade' @ [852:46] ==> value-parameter facade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[ValueParameterDescriptorImpl]

'hasLookupTracker' @ [852:53] ==> public abstract fun hasLookupTracker(): Boolean defined in org.jetbrains.kotlin.daemon.common.CompilerCallbackServicesFacade[DeserializedSimpleFunctionDescriptor]

'builder' @ [853:13] ==> val builder: Services.Builder defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[LocalVariableDescriptor]

'register' @ [853:21] ==> public final fun <T : Any> register(interfaceClass: Class<IncrementalCompilationComponents>, implementation: IncrementalCompilationComponents): Services.Builder defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IncrementalCompilationComponents

'java' @ [853:70] ==> public val <T> KClass<IncrementalCompilationComponents>.java: Class<IncrementalCompilationComponents> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IncrementalCompilationComponents

'RemoteIncrementalCompilationComponentsClient' @ [853:76] ==> public constructor RemoteIncrementalCompilationComponentsClient(facade: CompilerCallbackServicesFacade, eventManager: EventManager, profiler: Profiler = ...) defined in org.jetbrains.kotlin.daemon.RemoteIncrementalCompilationComponentsClient[ClassConstructorDescriptorImpl]

'facade' @ [853:121] ==> value-parameter facade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[ValueParameterDescriptorImpl]

'eventManager' @ [853:129] ==> value-parameter eventManager: EventManager defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[ValueParameterDescriptorImpl]

'rpcProfiler' @ [853:143] ==> value-parameter rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[ValueParameterDescriptorImpl]

'facade' @ [855:13] ==> value-parameter facade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[ValueParameterDescriptorImpl]

'hasCompilationCanceledStatus' @ [855:20] ==> public abstract fun hasCompilationCanceledStatus(): Boolean defined in org.jetbrains.kotlin.daemon.common.CompilerCallbackServicesFacade[DeserializedSimpleFunctionDescriptor]

'builder' @ [856:13] ==> val builder: Services.Builder defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[LocalVariableDescriptor]

'register' @ [856:21] ==> public final fun <T : Any> register(interfaceClass: Class<CompilationCanceledStatus>, implementation: CompilationCanceledStatus): Services.Builder defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CompilationCanceledStatus

'java' @ [856:63] ==> public val <T> KClass<CompilationCanceledStatus>.java: Class<CompilationCanceledStatus> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompilationCanceledStatus

'RemoteCompilationCanceledStatusClient' @ [856:69] ==> public constructor RemoteCompilationCanceledStatusClient(facade: CompilerCallbackServicesFacade, profiler: Profiler = ...) defined in org.jetbrains.kotlin.daemon.RemoteCompilationCanceledStatusClient[ClassConstructorDescriptorImpl]

'facade' @ [856:107] ==> value-parameter facade: CompilerCallbackServicesFacade defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[ValueParameterDescriptorImpl]

'rpcProfiler' @ [856:115] ==> value-parameter rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[ValueParameterDescriptorImpl]

'builder' @ [858:16] ==> val builder: Services.Builder defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.createCompileServices[LocalVariableDescriptor]

'build' @ [858:24] ==> public final fun build(): Services defined in org.jetbrains.kotlin.config.Services.Builder[DeserializedSimpleFunctionDescriptor]

'if (daemonOptions.reportPerf) WallAndThreadAndMemoryTotalProfiler(withGC = false) else DummyProfiler()' @ [864:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Profiler, elseBranch: Profiler): Profiler[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Profiler

'daemonOptions' @ [864:32] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'reportPerf' @ [864:46] ==> public final var reportPerf: Boolean defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'WallAndThreadAndMemoryTotalProfiler' @ [864:58] ==> public constructor WallAndThreadAndMemoryTotalProfiler(withGC: Boolean) defined in org.jetbrains.kotlin.daemon.common.WallAndThreadAndMemoryTotalProfiler[DeserializedClassConstructorDescriptor]

'DummyProfiler' @ [864:115] ==> public constructor DummyProfiler() defined in org.jetbrains.kotlin.daemon.common.DummyProfiler[DeserializedClassConstructorDescriptor]

'profiler' @ [866:23] ==> val profiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'withMeasure' @ [866:32] ==> public abstract fun <R> withMeasure(obj: Any?, body: () -> R): R defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> R

'body' @ [866:50] ==> value-parameter body: () -> R defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[ValueParameterDescriptorImpl]

'if (daemonOptions.reportPerf) usedMemory(withGC = false) else 0L' @ [868:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long, elseBranch: Long): Long[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long

'daemonOptions' @ [868:30] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'reportPerf' @ [868:44] ==> public final var reportPerf: Boolean defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'usedMemory' @ [868:56] ==> public inline fun usedMemory(withGC: Boolean): Long defined in org.jetbrains.kotlin.daemon.common[DeserializedSimpleFunctionDescriptor]

'log' @ [870:13] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [870:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'+' @ [870:22] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'res' @ [870:44] ==> val res: R defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'toString' @ [870:48] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'daemonOptions' @ [872:17] ==> public final val daemonOptions: DaemonOptions defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'reportPerf' @ [872:31] ==> public final var reportPerf: Boolean defined in org.jetbrains.kotlin.daemon.common.DaemonOptions[DeserializedPropertyDescriptor]

'toMillis' @ [873:54] ==> public open fun toMillis(p0: Long): Long defined in java.util.concurrent.TimeUnit[JavaMethodDescriptor]

'this' @ [873:63] ==> <this> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile.ms[ReceiverParameterDescriptorImpl]

'this' @ [874:33] ==> <this> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile.kb[ReceiverParameterDescriptorImpl]

'profiler' @ [875:26] ==> val profiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'getTotalCounters' @ [875:35] ==> public abstract fun getTotalCounters(): PerfCounters defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]

'rpcProfiler' @ [876:27] ==> value-parameter rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[ValueParameterDescriptorImpl]

'getTotalCounters' @ [876:39] ==> public abstract fun getTotalCounters(): PerfCounters defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]

'pc' @ [878:45] ==> val pc: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'time' @ [878:48] ==> public abstract val time: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'ms' @ [878:53] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[SimpleFunctionDescriptorImpl]

'pc' @ [878:78] ==> val pc: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'threadUserTime' @ [878:81] ==> public abstract val threadUserTime: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'ms' @ [878:96] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[SimpleFunctionDescriptorImpl]

'pc' @ [878:113] ==> val pc: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'threadTime' @ [878:116] ==> public abstract val threadTime: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'pc' @ [878:129] ==> val pc: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'threadUserTime' @ [878:132] ==> public abstract val threadUserTime: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'ms' @ [878:148] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[SimpleFunctionDescriptorImpl]

'rpc' @ [878:165] ==> val rpc: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'count' @ [878:169] ==> public abstract val count: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'rpc' @ [878:185] ==> val rpc: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'time' @ [878:189] ==> public abstract val time: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'ms' @ [878:194] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[SimpleFunctionDescriptorImpl]

'rpc' @ [878:213] ==> val rpc: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'threadTime' @ [878:217] ==> public abstract val threadTime: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'ms' @ [878:228] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[SimpleFunctionDescriptorImpl]

'endMem' @ [878:248] ==> val endMem: Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'kb' @ [878:255] ==> local final fun Long.kb(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[SimpleFunctionDescriptorImpl]

'format' @ [878:273] ==> @InlineOnly public inline fun String.format(vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pc' @ [878:280] ==> val pc: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'memory' @ [878:283] ==> public abstract val memory: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'kb' @ [878:290] ==> local final fun Long.kb(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[SimpleFunctionDescriptorImpl]

'let' @ [878:302] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'daemonMessageReporter' @ [879:21] ==> value-parameter daemonMessageReporter: DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[ValueParameterDescriptorImpl]

'report' @ [879:43] ==> public abstract fun report(severity: ReportSeverity, message: String): Unit defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporter[SimpleFunctionDescriptorImpl]

'INFO' @ [879:65] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'it' @ [879:71] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [880:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [880:25] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'it' @ [880:30] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [884:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Any?, PerfCounters>.component1(): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> PerfCounters

'component2' @ [884:28] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Any?, PerfCounters>.component2(): PerfCounters defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> PerfCounters

'rpcProfiler' @ [884:41] ==> value-parameter rpcProfiler: Profiler defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[ValueParameterDescriptorImpl]

'getCounters' @ [884:53] ==> public abstract fun getCounters(): Map<Any?, PerfCounters> defined in org.jetbrains.kotlin.daemon.common.Profiler[DeserializedSimpleFunctionDescriptor]

'obj' @ [885:36] ==> val obj: Any? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'counters' @ [885:43] ==> val counters: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'count' @ [885:52] ==> public abstract val count: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'counters' @ [885:68] ==> val counters: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'time' @ [885:77] ==> public abstract val time: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'ms' @ [885:82] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[SimpleFunctionDescriptorImpl]

'counters' @ [885:101] ==> val counters: PerfCounters defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'threadTime' @ [885:110] ==> public abstract val threadTime: Long defined in org.jetbrains.kotlin.daemon.common.PerfCounters[DeserializedPropertyDescriptor]

'ms' @ [885:121] ==> local final fun Long.ms(): Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[SimpleFunctionDescriptorImpl]

'let' @ [885:131] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'daemonMessageReporter' @ [886:25] ==> value-parameter daemonMessageReporter: DaemonMessageReporter defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[ValueParameterDescriptorImpl]

'report' @ [886:47] ==> public abstract fun report(severity: ReportSeverity, message: String): Unit defined in org.jetbrains.kotlin.daemon.report.DaemonMessageReporter[SimpleFunctionDescriptorImpl]

'INFO' @ [886:69] ==> enum entry INFO defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'it' @ [886:75] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [887:25] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [887:29] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'it' @ [887:34] ==> value-parameter it: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile.<anonymous>[ValueParameterDescriptorImpl]

'res' @ [891:20] ==> val res: R defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'log' @ [895:13] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [895:17] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'e' @ [895:31] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'e' @ [896:19] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.checkedCompile[LocalVariableDescriptor]

'clearFileAccessorCache' @ [901:20] ==> public open fun clearFileAccessorCache(): Unit defined in com.intellij.openapi.vfs.impl.ZipHandler[JavaMethodDescriptor]

'KotlinCoreEnvironment' @ [902:10] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'applicationEnvironment' @ [902:32] ==> public final val applicationEnvironment: JavaCoreApplicationEnvironment? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedPropertyDescriptor]

'jarFileSystem' @ [902:56] ==> public final val JavaCoreApplicationEnvironment.jarFileSystem: VirtualFileSystem[MyPropertyDescriptor]

'clearHandlersCache' @ [902:94] ==> public open fun clearHandlersCache(): Unit defined in com.intellij.openapi.vfs.impl.jar.CoreJarFileSystem[JavaMethodDescriptor]

'LastSession' @ [905:71] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'rwlock' @ [905:158] ==> private final val rwlock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'read' @ [905:165] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> CompileService.CallResult<R>): CompileService.CallResult<R> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<R>

'ifAliveChecksImpl' @ [906:9] ==> private final inline fun <R> ifAliveChecksImpl(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<R>): CompileService.CallResult<R> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'minAliveness' @ [906:27] ==> value-parameter minAliveness: CompileServiceImpl.Aliveness = ... defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAlive[ValueParameterDescriptorImpl]

'body' @ [906:41] ==> value-parameter body: () -> CompileService.CallResult<R> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAlive[ValueParameterDescriptorImpl]

'LastSession' @ [909:72] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'rwlock' @ [909:111] ==> private final val rwlock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'read' @ [909:118] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.read(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ifAliveChecksImpl' @ [910:9] ==> private final inline fun <R> ifAliveChecksImpl(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Nothing>): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Nothing

'minAliveness' @ [910:27] ==> value-parameter minAliveness: CompileServiceImpl.Aliveness = ... defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveUnit[ValueParameterDescriptorImpl]

'invoke' @ [911:13] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'CompileService' @ [912:13] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Ok' @ [912:39] ==> public constructor Ok() defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Ok[DeserializedClassConstructorDescriptor]

'LastSession' @ [916:80] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'rwlock' @ [916:167] ==> private final val rwlock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'write' @ [916:174] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> CompileService.CallResult<R>): CompileService.CallResult<R> defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallResult<R>

'ifAliveChecksImpl' @ [917:9] ==> private final inline fun <R> ifAliveChecksImpl(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<R>): CompileService.CallResult<R> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'minAliveness' @ [917:27] ==> value-parameter minAliveness: CompileServiceImpl.Aliveness = ... defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveExclusive[ValueParameterDescriptorImpl]

'body' @ [917:41] ==> value-parameter body: () -> CompileService.CallResult<R> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveExclusive[ValueParameterDescriptorImpl]

'LastSession' @ [920:81] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'rwlock' @ [920:120] ==> private final val rwlock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'write' @ [920:127] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'ifAliveChecksImpl' @ [921:9] ==> private final inline fun <R> ifAliveChecksImpl(minAliveness: CompileServiceImpl.Aliveness = ..., body: () -> CompileService.CallResult<Nothing>): CompileService.CallResult<Nothing> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Nothing

'minAliveness' @ [921:27] ==> value-parameter minAliveness: CompileServiceImpl.Aliveness = ... defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveExclusiveUnit[ValueParameterDescriptorImpl]

'invoke' @ [922:13] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'CompileService' @ [923:13] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Ok' @ [923:39] ==> public constructor Ok() defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Ok[DeserializedClassConstructorDescriptor]

'LastSession' @ [927:81] ==> enum entry LastSession defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[FakeCallableDescriptorForObject]

'state' @ [928:24] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'alive' @ [928:30] ==> public final var alive: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'get' @ [928:36] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'when {
            curState < minAliveness.ordinal -> {
                log.info("Cannot perform operation, requested state: ${minAliveness.name} > actual: ${curState.toAlivenessName()}")
                CompileService.CallResult.Dying()
            }
            else -> {
                try {
                    body()
                }
                catch (e: Throwable) {
                    log.log(Level.SEVERE, "Exception", e)
                    CompileService.CallResult.Error(e.message ?: "unknown")
                }
            }
        }' @ [929:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CompileService.CallResult<R>, entry1: CompileService.CallResult<R>): CompileService.CallResult<R>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallResult<R>

'curState' @ [930:13] ==> val curState: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveChecksImpl[LocalVariableDescriptor]

'minAliveness' @ [930:24] ==> value-parameter minAliveness: CompileServiceImpl.Aliveness = ... defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveChecksImpl[ValueParameterDescriptorImpl]

'ordinal' @ [930:37] ==> public final val ordinal: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[DeserializedPropertyDescriptor]

'log' @ [931:17] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'info' @ [931:21] ==> public open fun info(p0: (String..String?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'minAliveness' @ [931:72] ==> value-parameter minAliveness: CompileServiceImpl.Aliveness = ... defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveChecksImpl[ValueParameterDescriptorImpl]

'name' @ [931:85] ==> public final val name: String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.Aliveness[DeserializedPropertyDescriptor]

'curState' @ [931:103] ==> val curState: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveChecksImpl[LocalVariableDescriptor]

'toAlivenessName' @ [931:112] ==> private final fun Int.toAlivenessName(): String defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]

'Dying' @ [932:43] ==> public constructor Dying() defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Dying[DeserializedClassConstructorDescriptor]

'invoke' @ [936:21] ==> public abstract operator fun invoke(): CompileService.CallResult<R> defined in kotlin.Function0[FunctionInvokeDescriptor]

'log' @ [939:21] ==> private final val log: (Logger..Logger?) defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'log' @ [939:25] ==> public open fun log(p0: (Level..Level?), p1: (String..String?), p2: (Throwable..Throwable?)): Unit defined in java.util.logging.Logger[JavaMethodDescriptor]

'SEVERE' @ [939:35] ==> public final val SEVERE: (Level..Level?) defined in java.util.logging.Level[JavaPropertyDescriptor]

'e' @ [939:56] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveChecksImpl[LocalVariableDescriptor]

'CompileService' @ [940:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Error' @ [940:47] ==> public constructor Error(message: String) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Error[DeserializedClassConstructorDescriptor]

'e' @ [940:53] ==> val e: Throwable defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ifAliveChecksImpl[LocalVariableDescriptor]

'message' @ [940:55] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'if (sessionId == CompileService.NO_SESSION) null
                else state.sessions[sessionId] ?: return CompileService.CallResult.Error("Unknown or invalid session $sessionId")' @ [950:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompileServiceImpl.ClientOrSessionProxy<Any>?, elseBranch: CompileServiceImpl.ClientOrSessionProxy<Any>?): CompileServiceImpl.ClientOrSessionProxy<Any>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClientOrSessionProxy<Any>?

'sessionId' @ [950:21] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidClientOrSessionProxy[ValueParameterDescriptorImpl]

'NO_SESSION' @ [950:49] ==> public final val NO_SESSION: Int defined in org.jetbrains.kotlin.daemon.common.CompileService.Companion[DeserializedPropertyDescriptor]

'state' @ [951:22] ==> private final val state: <no name provided> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'sessions' @ [951:28] ==> public final val sessions: CompileServiceImpl.SessionsContainer defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.state.<no name provided>[PropertyDescriptorImpl]

'sessionId' @ [951:37] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidClientOrSessionProxy[ValueParameterDescriptorImpl]

'CompileService' @ [951:58] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Error' @ [951:84] ==> public constructor Error(message: String) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Error[DeserializedClassConstructorDescriptor]

'sessionId' @ [951:119] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidClientOrSessionProxy[ValueParameterDescriptorImpl]

'compilationsCounter' @ [953:13] ==> private final val compilationsCounter: AtomicInteger defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'incrementAndGet' @ [953:33] ==> public final fun incrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'invoke' @ [954:20] ==> public abstract operator fun invoke(p1: CompileServiceImpl.ClientOrSessionProxy<Any>?): CompileService.CallResult<R> defined in kotlin.Function1[FunctionInvokeDescriptor]

'session' @ [954:25] ==> val session: CompileServiceImpl.ClientOrSessionProxy<Any>? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidClientOrSessionProxy[LocalVariableDescriptor]

'_lastUsedSeconds' @ [957:13] ==> @Volatile private final var _lastUsedSeconds: Long defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[PropertyDescriptorImpl]

'nowSeconds' @ [957:32] ==> public fun nowSeconds(): Long defined in org.jetbrains.kotlin.daemon in file CompileServiceImpl.kt[SimpleFunctionDescriptorImpl]

'withValidClientOrSessionProxy' @ [962:13] ==> private final inline fun <R> withValidClientOrSessionProxy(sessionId: Int, body: (CompileServiceImpl.ClientOrSessionProxy<Any>?) -> CompileService.CallResult<R>): CompileService.CallResult<R> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'sessionId' @ [962:43] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidRepl[ValueParameterDescriptorImpl]

'?:' @ [963:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CompileService.CallResult<R>?, right: CompileService.CallResult<R>): CompileService.CallResult<R>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CallResult<R>

'session' @ [963:18] ==> value-parameter session: CompileServiceImpl.ClientOrSessionProxy<Any>? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidRepl.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [963:27] ==> public final val data: Any? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[PropertyDescriptorImpl]

'let' @ [963:60] ==> @InlineOnly public inline fun <T, R> KotlinJvmReplService.let(block: (KotlinJvmReplService) -> CompileService.CallResult.Good<R>): CompileService.CallResult.Good<R> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinJvmReplService
    <R> -> Good<R>

'CompileService' @ [964:21] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.CompileService[FakeCallableDescriptorForObject]

'Good' @ [964:47] ==> public constructor Good<out R>(result: R) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Good[DeserializedClassConstructorDescriptor]
Inferred types:
    <out R> -> R

'it' @ [964:52] ==> value-parameter it: KotlinJvmReplService defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidRepl.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [964:55] ==> public abstract operator fun KotlinJvmReplService.invoke(): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'Error' @ [965:48] ==> public constructor Error(message: String) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Error[DeserializedClassConstructorDescriptor]

'sessionId' @ [965:75] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidRepl[ValueParameterDescriptorImpl]

'JvmName' @ [968:5] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'withValidClientOrSessionProxy' @ [970:13] ==> private final inline fun <R> withValidClientOrSessionProxy(sessionId: Int, body: (CompileServiceImpl.ClientOrSessionProxy<Any>?) -> CompileService.CallResult<R>): CompileService.CallResult<R> defined in org.jetbrains.kotlin.daemon.CompileServiceImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> R

'sessionId' @ [970:43] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidRepl[ValueParameterDescriptorImpl]

'?:' @ [971:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: CompileService.CallResult<R>?, right: CompileService.CallResult<R>): CompileService.CallResult<R>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> CallResult<R>

'session' @ [971:18] ==> value-parameter session: CompileServiceImpl.ClientOrSessionProxy<Any>? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidRepl.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [971:27] ==> public final val data: Any? defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.ClientOrSessionProxy[PropertyDescriptorImpl]

'invoke' @ [971:60] ==> public abstract operator fun KotlinJvmReplService.invoke(): CompileService.CallResult<R> defined in kotlin.Function1[FunctionInvokeDescriptor]

'Error' @ [971:96] ==> public constructor Error(message: String) defined in org.jetbrains.kotlin.daemon.common.CompileService.CallResult.Error[DeserializedClassConstructorDescriptor]

'sessionId' @ [971:123] ==> value-parameter sessionId: Int defined in org.jetbrains.kotlin.daemon.CompileServiceImpl.withValidRepl[ValueParameterDescriptorImpl]

