'ThreadSafe' @ [74:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'ReusableLatch' @ [79:73] ==> public constructor ReusableLatch() defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaClassConstructorDescriptor]

'FiberExecutorScheduler' @ [81:34] ==> public constructor FiberExecutorScheduler(p0: (String..String?), p1: (Executor..Executor?)) defined in co.paralleluniverse.fibers.FiberExecutorScheduler[JavaClassConstructorDescriptor]

'executor' @ [81:82] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'loggerFor' @ [84:30] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> StateMachineManager

'TopicSession' @ [85:37] ==> public constructor TopicSession(topic: String, sessionID: Long = ...) defined in net.corda.node.services.messaging.TopicSession[ClassConstructorDescriptorImpl]

'setDefaultUncaughtExceptionHandler' @ [88:19] ==> public final fun setDefaultUncaughtExceptionHandler(p0: (((Strand..Strand?), (Throwable..Throwable?)) -> Unit..(((Strand..Strand?), (Throwable..Throwable?)) -> Unit)?)): Unit defined in co.paralleluniverse.fibers.Fiber[SamAdapterFunctionDescriptor]

'fiber' @ [89:18] ==> value-parameter fiber: (Strand..Strand?) defined in net.corda.node.services.statemachine.StateMachineManager.Companion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'logger' @ [89:52] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'warn' @ [89:59] ==> public abstract fun warn(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'throwable' @ [89:94] ==> value-parameter throwable: (Throwable..Throwable?) defined in net.corda.node.services.statemachine.StateMachineManager.Companion.<init>.<anonymous>[ValueParameterDescriptorImpl]

'Change' @ [97:60] ==> private constructor Change() defined in net.corda.node.services.statemachine.StateMachineManager.Change[ClassConstructorDescriptorImpl]

'Change' @ [98:84] ==> private constructor Change() defined in net.corda.node.services.statemachine.StateMachineManager.Change[ClassConstructorDescriptorImpl]

'LinkedHashMap' @ [105:29] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FlowStateMachineImpl<*>
    <V : (Any..Any?)> -> Checkpoint

'!!' @ [106:32] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: PublishSubject<(StateMachineManager.Change..StateMachineManager.Change?)>?): PublishSubject<(StateMachineManager.Change..StateMachineManager.Change?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> PublishSubject<(net.corda.node.services.statemachine.StateMachineManager.Change..net.corda.node.services.statemachine.StateMachineManager.Change?)>

'create' @ [106:47] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(StateMachineManager.Change..StateMachineManager.Change?)>..PublishSubject<(StateMachineManager.Change..StateMachineManager.Change?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Change

'!!' @ [107:44] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: HashMultimap<(SecureHash..SecureHash?), (FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>?): HashMultimap<(SecureHash..SecureHash?), (FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> HashMultimap<(net.corda.core.crypto.SecureHash..net.corda.core.crypto.SecureHash?), (net.corda.node.services.statemachine.FlowStateMachineImpl<*>..net.corda.node.services.statemachine.FlowStateMachineImpl<*>?)>

'create' @ [107:57] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (HashMultimap<(SecureHash..SecureHash?), (FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>..HashMultimap<(SecureHash..SecureHash?), (FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SecureHash
    <V : (Any..Any?)> -> FlowStateMachineImpl<*>

'changesPublisher' @ [110:13] ==> public final val changesPublisher: PublishSubject<(StateMachineManager.Change..StateMachineManager.Change?)> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'bufferUntilDatabaseCommit' @ [110:30] ==> public fun <T : Any> Observer<(StateMachineManager.Change..StateMachineManager.Change?)>.bufferUntilDatabaseCommit(): Observer<(StateMachineManager.Change..StateMachineManager.Change?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.node.services.statemachine.StateMachineManager.Change..net.corda.node.services.statemachine.StateMachineManager.Change?)

'onNext' @ [110:58] ==> public abstract fun onNext(p0: (StateMachineManager.Change..StateMachineManager.Change?)): Unit defined in rx.Observer[JavaMethodDescriptor]

'change' @ [110:65] ==> value-parameter change: StateMachineManager.Change defined in net.corda.node.services.statemachine.StateMachineManager.InnerState.notifyChangeObservers[ValueParameterDescriptorImpl]

'FiberScheduler' @ [114:29] ==> public constructor FiberScheduler() defined in net.corda.node.services.statemachine.StateMachineManager.FiberScheduler[ClassConstructorDescriptorImpl]

'ThreadBox' @ [115:25] ==> public constructor ThreadBox<out T>(content: StateMachineManager.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [115:35] ==> public constructor InnerState() defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[ClassConstructorDescriptorImpl]

'if (serviceHub.configuration.devMode) Executors.newSingleThreadExecutor() else null' @ [117:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExecutorService?, elseBranch: ExecutorService?): ExecutorService?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExecutorService?

'serviceHub' @ [117:47] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'configuration' @ [117:58] ==> public abstract val configuration: NodeConfiguration defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'devMode' @ [117:72] ==> public abstract val devMode: Boolean defined in net.corda.node.services.config.NodeConfiguration[PropertyDescriptorImpl]

'newSingleThreadExecutor' @ [117:91] ==> public open fun newSingleThreadExecutor(): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'Volatile' @ [119:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'Volatile' @ [122:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'ReusableLatch' @ [124:30] ==> public constructor ReusableLatch() defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaClassConstructorDescriptor]

'serviceHub' @ [127:27] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'monitoringService' @ [127:38] ==> public abstract val monitoringService: MonitoringService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'metrics' @ [127:56] ==> public final val metrics: MetricRegistry defined in net.corda.node.services.api.MonitoringService[PropertyDescriptorImpl]

'metrics' @ [130:9] ==> private final val metrics: MetricRegistry defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'register' @ [130:17] ==> public open fun <T : (Metric..Metric?)> register(p0: (String..String?), p1: (Gauge<Int>..Gauge<Int>?)): (Gauge<Int>..Gauge<Int>?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]
Inferred types:
    <T : (Metric..Metric?)> -> (com.codahale.metrics.Gauge<kotlin.Int>..com.codahale.metrics.Gauge<kotlin.Int>?)

'Gauge' @ [130:44] ==> public fun <T : (Any..Any?)> Gauge(function: () -> (Int..Int?)): Gauge<Int> defined in com.codahale.metrics[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Int

'mutex' @ [130:57] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'content' @ [130:63] ==> public final val content: StateMachineManager.InnerState defined in net.corda.core.internal.ThreadBox[DeserializedPropertyDescriptor]

'stateMachines' @ [130:71] ==> public final val stateMachines: LinkedHashMap<FlowStateMachineImpl<*>, Checkpoint> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'size' @ [130:85] ==> public open val size: Int defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'metrics' @ [133:38] ==> private final val metrics: MetricRegistry defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'meter' @ [133:46] ==> public open fun meter(p0: (String..String?)): (Meter..Meter?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]

'metrics' @ [134:37] ==> private final val metrics: MetricRegistry defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'counter' @ [134:45] ==> public open fun counter(p0: (String..String?)): (Counter..Counter?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]

'metrics' @ [135:38] ==> private final val metrics: MetricRegistry defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'counter' @ [135:46] ==> public open fun counter(p0: (String..String?)): (Counter..Counter?) defined in com.codahale.metrics.MetricRegistry[JavaMethodDescriptor]

'ConcurrentHashMap' @ [137:32] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Long
    <V : (Any..Any?)> -> FlowSession

'ConcurrentHashMap' @ [138:42] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Long
    <V : (Any..Any?)> -> Party

'ArrayList' @ [140:40] ==> public final fun <E> <init>(): ArrayList<Any> /* = ArrayList<Any> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Any

'getValue' @ [142:41] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'SerializeAsTokenContextImpl' @ [143:9] ==> public constructor SerializeAsTokenContextImpl(toBeTokenized: Any, serializationFactory: SerializationFactory, context: SerializationContext, serviceHub: ServiceHub) defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl[DeserializedClassConstructorDescriptor]

'tokenizableServices' @ [143:37] ==> internal final val tokenizableServices: ArrayList<Any> /* = ArrayList<Any> */ defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'SERIALIZATION_FACTORY' @ [143:58] ==> public final var SERIALIZATION_FACTORY: SerializationFactory defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'CHECKPOINT_CONTEXT' @ [143:81] ==> public final var CHECKPOINT_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'serviceHub' @ [143:101] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'tokenizableServices' @ [146:53] ==> internal final val tokenizableServices: ArrayList<Any> /* = ArrayList<Any> */ defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'filter' @ [146:73] ==> public inline fun <T> Iterable<Any>.filter(predicate: (Any) -> Boolean): List<Any> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any

'predicate' @ [146:80] ==> value-parameter predicate: (Any) -> Boolean defined in net.corda.node.services.statemachine.StateMachineManager.findServices[ValueParameterDescriptorImpl]

'Suppress' @ [150:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'mutex' @ [151:16] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [151:22] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> List<Pair<P, CordaFuture<T>>>): List<Pair<P, CordaFuture<T>>> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<Pair<P, CordaFuture<T>>>

'stateMachines' @ [152:13] ==> public final val stateMachines: LinkedHashMap<FlowStateMachineImpl<*>, Checkpoint> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'keys' @ [152:27] ==> public open val keys: MutableSet<FlowStateMachineImpl<*>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'mapNotNull' @ [152:32] ==> public inline fun <T, R : Any> Iterable<FlowStateMachineImpl<*>>.mapNotNull(transform: (FlowStateMachineImpl<*>) -> Pair<P, CordaFuture<T>>?): List<Pair<P, CordaFuture<T>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowStateMachineImpl<*>
    <R : Any> -> Pair<P, CordaFuture<T>>

'flowClass' @ [153:17] ==> value-parameter flowClass: Class<P> defined in net.corda.node.services.statemachine.StateMachineManager.findStateMachines[ValueParameterDescriptorImpl]

'castIfPossible' @ [153:27] ==> public fun <T> Class<P>.castIfPossible(obj: Any): P? defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> P

'it' @ [153:42] ==> value-parameter it: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.findStateMachines.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'logic' @ [153:45] ==> public final val logic: FlowLogic<Any?> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'let' @ [153:53] ==> @InlineOnly public inline fun <T, R> P.let(block: (P) -> Pair<P, CordaFuture<T>>): Pair<P, CordaFuture<T>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> P
    <R> -> Pair<P, CordaFuture<T>>

'it' @ [153:59] ==> value-parameter it: P defined in net.corda.node.services.statemachine.StateMachineManager.findStateMachines.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [153:66] ==> value-parameter it: P defined in net.corda.node.services.statemachine.StateMachineManager.findStateMachines.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stateMachine' @ [153:69] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'resultFuture' @ [153:110] ==> public open val resultFuture: CordaFuture<T> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'mutex' @ [159:17] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [159:23] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> List<FlowLogic<Any?>>): List<FlowLogic<Any?>> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<FlowLogic<Any?>>

'stateMachines' @ [159:32] ==> public final val stateMachines: LinkedHashMap<FlowStateMachineImpl<*>, Checkpoint> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'keys' @ [159:46] ==> public open val keys: MutableSet<FlowStateMachineImpl<*>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'map' @ [159:51] ==> public inline fun <T, R> Iterable<FlowStateMachineImpl<*>>.map(transform: (FlowStateMachineImpl<*>) -> FlowLogic<Any?>): List<FlowLogic<Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowStateMachineImpl<*>
    <R> -> FlowLogic<Any?>

'it' @ [159:57] ==> value-parameter it: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.<get-allStateMachines>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'logic' @ [159:60] ==> public final val logic: FlowLogic<Any?> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'mutex' @ [167:39] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'content' @ [167:45] ==> public final val content: StateMachineManager.InnerState defined in net.corda.core.internal.ThreadBox[DeserializedPropertyDescriptor]

'changesPublisher' @ [167:53] ==> public final val changesPublisher: PublishSubject<(StateMachineManager.Change..StateMachineManager.Change?)> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'wrapWithDatabaseTransaction' @ [167:70] ==> public fun <T : Any> Observable<(StateMachineManager.Change..StateMachineManager.Change?)>.wrapWithDatabaseTransaction(db: CordaPersistence? = ...): Observable<(StateMachineManager.Change..StateMachineManager.Change?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.node.services.statemachine.StateMachineManager.Change..net.corda.node.services.statemachine.StateMachineManager.Change?)

'checkQuasarJavaAgentPresence' @ [170:9] ==> private final fun checkQuasarJavaAgentPresence(): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'restoreFibersFromCheckpoints' @ [171:9] ==> private final fun restoreFibersFromCheckpoints(): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'listenToLedgerTransactions' @ [172:9] ==> private final fun listenToLedgerTransactions(): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'serviceHub' @ [173:9] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'networkMapCache' @ [173:20] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'mapServiceRegistered' @ [173:36] ==> public abstract val mapServiceRegistered: CordaFuture<Void?> defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedPropertyDescriptor]

'then' @ [173:57] ==> public abstract fun <W> then(callback: (CordaFuture<Void?>) -> Unit): Unit defined in net.corda.core.concurrent.CordaFuture[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <W> -> Unit

'executor' @ [173:64] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'execute' @ [173:73] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor[MyFunctionDescriptor]

'this' @ [173:81] ==> <this> defined in net.corda.node.services.statemachine.StateMachineManager[LazyClassReceiverParameterDescriptor]

'resumeRestoredFibers' @ [173:87] ==> private final fun resumeRestoredFibers(): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'check' @ [177:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isJavaAgentActive' @ [177:33] ==> public open fun isJavaAgentActive(): Boolean defined in co.paralleluniverse.fibers.instrument.SuspendableHelper[JavaMethodDescriptor]

'trimMargin' @ [179:121] ==> public fun String.trimMargin(marginPrefix: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'serviceHub' @ [185:9] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'validatedTransactions' @ [185:20] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'updates' @ [185:42] ==> public abstract val updates: Observable<SignedTransaction> defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedPropertyDescriptor]

'subscribe' @ [185:50] ==> public final fun subscribe(p0: (((SignedTransaction..SignedTransaction?)) -> Unit..(((SignedTransaction..SignedTransaction?)) -> Unit)?)): (Subscription..Subscription?) defined in rx.Observable[MyFunctionDescriptor]

'stx' @ [186:24] ==> value-parameter stx: (SignedTransaction..SignedTransaction?) defined in net.corda.node.services.statemachine.StateMachineManager.listenToLedgerTransactions.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [186:28] ==> public open val id: SecureHash defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'mutex' @ [187:56] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [187:62] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> (MutableSet<(FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>..Set<(FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>?)): (MutableSet<(FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>..Set<(FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>?) defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> (kotlin.collections.MutableSet<(net.corda.node.services.statemachine.FlowStateMachineImpl<*>..net.corda.node.services.statemachine.FlowStateMachineImpl<*>?)>..kotlin.collections.Set<(net.corda.node.services.statemachine.FlowStateMachineImpl<*>..net.corda.node.services.statemachine.FlowStateMachineImpl<*>?)>?)

'fibersWaitingForLedgerCommit' @ [187:71] ==> public final val fibersWaitingForLedgerCommit: HashMultimap<(SecureHash..SecureHash?), (FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'removeAll' @ [187:100] ==> @CanIgnoreReturnValue public open fun removeAll(@Nullable p0: Any?): (MutableSet<(FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>..Set<(FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]

'hash' @ [187:110] ==> val hash: SecureHash defined in net.corda.node.services.statemachine.StateMachineManager.listenToLedgerTransactions.<anonymous>[LocalVariableDescriptor]

'fibers' @ [188:17] ==> val fibers: Set<FlowStateMachineImpl<*>> defined in net.corda.node.services.statemachine.StateMachineManager.listenToLedgerTransactions.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [188:24] ==> @InlineOnly public inline fun <T> Collection<FlowStateMachineImpl<*>>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowStateMachineImpl<*>

'executor' @ [189:17] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'executeASAP' @ [189:26] ==> public open fun executeASAP(runnable: () -> Unit): Unit defined in net.corda.node.utilities.AffinityExecutor[SimpleFunctionDescriptorImpl]

'fibers' @ [190:35] ==> val fibers: Set<FlowStateMachineImpl<*>> defined in net.corda.node.services.statemachine.StateMachineManager.listenToLedgerTransactions.<anonymous>[LocalVariableDescriptor]

'fiber' @ [191:25] ==> val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.listenToLedgerTransactions.<anonymous>.<anonymous>[LocalVariableDescriptor]

'logger' @ [191:31] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [191:38] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'hash' @ [191:60] ==> val hash: SecureHash defined in net.corda.node.services.statemachine.StateMachineManager.listenToLedgerTransactions.<anonymous>[LocalVariableDescriptor]

'fiber' @ [192:25] ==> val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.listenToLedgerTransactions.<anonymous>.<anonymous>[LocalVariableDescriptor]

'waitingForResponse' @ [192:31] ==> internal final var waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'resumeFiber' @ [193:25] ==> private final fun resumeFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [193:37] ==> val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.listenToLedgerTransactions.<anonymous>.<anonymous>[LocalVariableDescriptor]

'liveFibers' @ [201:9] ==> private final val liveFibers: ReusableLatch defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'countDown' @ [201:20] ==> public open fun countDown(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'liveFibers' @ [205:9] ==> private final val liveFibers: ReusableLatch defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'countUp' @ [205:20] ==> public open fun countUp(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'require' @ [215:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'allowedUnsuspendedFiberCount' @ [215:17] ==> value-parameter allowedUnsuspendedFiberCount: Int = ... defined in net.corda.node.services.statemachine.StateMachineManager.stop[ValueParameterDescriptorImpl]

'mutex' @ [216:9] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [216:15] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'stopping' @ [217:17] ==> @Volatile private final var stopping: Boolean defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'IllegalStateException' @ [217:33] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'stopping' @ [218:13] ==> @Volatile private final var stopping: Boolean defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'liveFibers' @ [221:9] ==> private final val liveFibers: ReusableLatch defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'countDown' @ [221:20] ==> public open fun countDown(p0: Int): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'allowedUnsuspendedFiberCount' @ [221:30] ==> value-parameter allowedUnsuspendedFiberCount: Int = ... defined in net.corda.node.services.statemachine.StateMachineManager.stop[ValueParameterDescriptorImpl]

'liveFibers' @ [222:9] ==> private final val liveFibers: ReusableLatch defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'await' @ [222:20] ==> public open fun await(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'checkpointCheckerThread' @ [223:9] ==> private final val checkpointCheckerThread: ExecutorService? defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'let' @ [223:34] ==> @InlineOnly public inline fun <T, R> ExecutorService.let(block: (ExecutorService) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExecutorService
    <R> -> Boolean

'shutdownAndAwaitTermination' @ [223:54] ==> @Beta @CanIgnoreReturnValue @GwtIncompatible public open fun shutdownAndAwaitTermination(p0: (ExecutorService..ExecutorService?), p1: Long, p2: (TimeUnit..TimeUnit?)): Boolean defined in com.google.common.util.concurrent.MoreExecutors[JavaMethodDescriptor]

'it' @ [223:82] ==> value-parameter it: ExecutorService defined in net.corda.node.services.statemachine.StateMachineManager.stop.<anonymous>[ValueParameterDescriptorImpl]

'SECONDS' @ [223:89] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'check' @ [224:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [224:15] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'unrestorableCheckpoints' @ [224:16] ==> @Volatile private final var unrestorableCheckpoints: Boolean defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'mutex' @ [232:16] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [232:22] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> DataFeed<List<FlowStateMachineImpl<*>>, (StateMachineManager.Change..StateMachineManager.Change?)>): DataFeed<List<FlowStateMachineImpl<*>>, (StateMachineManager.Change..StateMachineManager.Change?)> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> DataFeed<List<FlowStateMachineImpl<*>>, (net.corda.node.services.statemachine.StateMachineManager.Change..net.corda.node.services.statemachine.StateMachineManager.Change?)>

'DataFeed' @ [233:13] ==> public constructor DataFeed<out A, B>(snapshot: List<FlowStateMachineImpl<*>>, updates: Observable<(StateMachineManager.Change..StateMachineManager.Change?)>) defined in net.corda.core.messaging.DataFeed[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<FlowStateMachineImpl<*>>
    <B> -> (net.corda.node.services.statemachine.StateMachineManager.Change..net.corda.node.services.statemachine.StateMachineManager.Change?)

'stateMachines' @ [233:22] ==> public final val stateMachines: LinkedHashMap<FlowStateMachineImpl<*>, Checkpoint> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'keys' @ [233:36] ==> public open val keys: MutableSet<FlowStateMachineImpl<*>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'toList' @ [233:41] ==> public fun <T> Iterable<FlowStateMachineImpl<*>>.toList(): List<FlowStateMachineImpl<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowStateMachineImpl<*>

'changesPublisher' @ [233:51] ==> public final val changesPublisher: PublishSubject<(StateMachineManager.Change..StateMachineManager.Change?)> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'bufferUntilSubscribed' @ [233:68] ==> public fun <T> Observable<(StateMachineManager.Change..StateMachineManager.Change?)>.bufferUntilSubscribed(): Observable<(StateMachineManager.Change..StateMachineManager.Change?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.node.services.statemachine.StateMachineManager.Change..net.corda.node.services.statemachine.StateMachineManager.Change?)

'wrapWithDatabaseTransaction' @ [233:92] ==> public fun <T : Any> Observable<(StateMachineManager.Change..StateMachineManager.Change?)>.wrapWithDatabaseTransaction(db: CordaPersistence? = ...): Observable<(StateMachineManager.Change..StateMachineManager.Change?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.node.services.statemachine.StateMachineManager.Change..net.corda.node.services.statemachine.StateMachineManager.Change?)

'mutex' @ [238:9] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [238:15] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'checkpointStorage' @ [239:13] ==> public final val checkpointStorage: CheckpointStorage defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'forEach' @ [239:31] ==> public abstract fun forEach(block: (Checkpoint) -> Boolean): Unit defined in net.corda.node.services.api.CheckpointStorage[SimpleFunctionDescriptorImpl]

'!' @ [241:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'stateMachines' @ [241:22] ==> public final val stateMachines: LinkedHashMap<FlowStateMachineImpl<*>, Checkpoint> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'containsValue' @ [241:36] ==> public open fun containsValue(value: Checkpoint): Boolean defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'checkpoint' @ [241:50] ==> value-parameter checkpoint: Checkpoint defined in net.corda.node.services.statemachine.StateMachineManager.restoreFibersFromCheckpoints.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'deserializeFiber' @ [242:21] ==> private final fun deserializeFiber(checkpoint: Checkpoint, logger: Logger): FlowStateMachineImpl<*>? defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'checkpoint' @ [242:38] ==> value-parameter checkpoint: Checkpoint defined in net.corda.node.services.statemachine.StateMachineManager.restoreFibersFromCheckpoints.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'logger' @ [242:50] ==> private final val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'let' @ [242:59] ==> @InlineOnly public inline fun <T, R> FlowStateMachineImpl<*>.let(block: (FlowStateMachineImpl<*>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowStateMachineImpl<*>
    <R> -> Unit

'initFiber' @ [243:25] ==> private final fun initFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'it' @ [243:35] ==> value-parameter it: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.restoreFibersFromCheckpoints.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'stateMachines' @ [244:25] ==> public final val stateMachines: LinkedHashMap<FlowStateMachineImpl<*>, Checkpoint> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'it' @ [244:39] ==> value-parameter it: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.restoreFibersFromCheckpoints.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'checkpoint' @ [244:45] ==> value-parameter checkpoint: Checkpoint defined in net.corda.node.services.statemachine.StateMachineManager.restoreFibersFromCheckpoints.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mutex' @ [253:9] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [253:15] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'started' @ [254:13] ==> public final var started: Boolean defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'stateMachines' @ [255:13] ==> public final val stateMachines: LinkedHashMap<FlowStateMachineImpl<*>, Checkpoint> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'keys' @ [255:27] ==> public open val keys: MutableSet<FlowStateMachineImpl<*>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'forEach' @ [255:32] ==> @HidesMembers public inline fun <T> Iterable<FlowStateMachineImpl<*>>.forEach(action: (FlowStateMachineImpl<*>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowStateMachineImpl<*>

'resumeRestoredFiber' @ [255:42] ==> private final fun resumeRestoredFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'it' @ [255:62] ==> value-parameter it: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFibers.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'serviceHub' @ [257:9] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'networkService' @ [257:20] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'addMessageHandler' @ [257:35] ==> public abstract fun addMessageHandler(topicSession: TopicSession, callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'sessionTopic' @ [257:53] ==> internal final val sessionTopic: TopicSession defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'executor' @ [258:13] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'checkOnThread' @ [258:22] ==> public open fun checkOnThread(): Unit defined in net.corda.node.utilities.AffinityExecutor[SimpleFunctionDescriptorImpl]

'onSessionMessage' @ [259:13] ==> private final fun onSessionMessage(message: ReceivedMessage): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'message' @ [259:30] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFibers.<anonymous>[ValueParameterDescriptorImpl]

'fiber' @ [264:9] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[ValueParameterDescriptorImpl]

'openSessions' @ [264:15] ==> internal final val openSessions: HashMap<Pair<FlowLogic<*>, Party>, FlowSession> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'values' @ [264:28] ==> public open val values: MutableCollection<FlowSession> defined in java.util.HashMap[JavaPropertyDescriptor]

'forEach' @ [264:35] ==> @HidesMembers public inline fun <T> Iterable<FlowSession>.forEach(action: (FlowSession) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowSession

'openSessions' @ [264:45] ==> private final val openSessions: ConcurrentHashMap<Long, FlowSession> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'it' @ [264:58] ==> value-parameter it: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber.<anonymous>[ValueParameterDescriptorImpl]

'ourSessionId' @ [264:61] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'it' @ [264:77] ==> value-parameter it: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber.<anonymous>[ValueParameterDescriptorImpl]

'fiber' @ [265:34] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[ValueParameterDescriptorImpl]

'waitingForResponse' @ [265:40] ==> internal final var waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'if (waitingForResponse != null) {
            if (waitingForResponse is WaitForLedgerCommit) {
                val stx = database.transaction {
                    serviceHub.validatedTransactions.getTransaction(waitingForResponse.hash)
                }
                if (stx != null) {
                    fiber.logger.info("Resuming fiber as tx ${waitingForResponse.hash} has committed")
                    fiber.waitingForResponse = null
                    resumeFiber(fiber)
                } else {
                    fiber.logger.info("Restored, pending on ledger commit of ${waitingForResponse.hash}")
                    mutex.locked { fibersWaitingForLedgerCommit.put(waitingForResponse.hash, fiber) }
                }
            } else {
                fiber.logger.info("Restored, pending on receive")
            }
        } else {
            resumeFiber(fiber)
        }' @ [266:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'waitingForResponse' @ [266:13] ==> val waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[LocalVariableDescriptor]

'if (waitingForResponse is WaitForLedgerCommit) {
                val stx = database.transaction {
                    serviceHub.validatedTransactions.getTransaction(waitingForResponse.hash)
                }
                if (stx != null) {
                    fiber.logger.info("Resuming fiber as tx ${waitingForResponse.hash} has committed")
                    fiber.waitingForResponse = null
                    resumeFiber(fiber)
                } else {
                    fiber.logger.info("Restored, pending on ledger commit of ${waitingForResponse.hash}")
                    mutex.locked { fibersWaitingForLedgerCommit.put(waitingForResponse.hash, fiber) }
                }
            } else {
                fiber.logger.info("Restored, pending on receive")
            }' @ [267:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'waitingForResponse' @ [267:17] ==> val waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[LocalVariableDescriptor]

'database' @ [268:27] ==> public final val database: CordaPersistence defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'transaction' @ [268:36] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SignedTransaction?

'serviceHub' @ [269:21] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'validatedTransactions' @ [269:32] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'getTransaction' @ [269:54] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'waitingForResponse' @ [269:69] ==> val waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[LocalVariableDescriptor]

'hash' @ [269:88] ==> public final val hash: SecureHash defined in net.corda.node.services.statemachine.WaitForLedgerCommit[PropertyDescriptorImpl]

'if (stx != null) {
                    fiber.logger.info("Resuming fiber as tx ${waitingForResponse.hash} has committed")
                    fiber.waitingForResponse = null
                    resumeFiber(fiber)
                } else {
                    fiber.logger.info("Restored, pending on ledger commit of ${waitingForResponse.hash}")
                    mutex.locked { fibersWaitingForLedgerCommit.put(waitingForResponse.hash, fiber) }
                }' @ [271:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'stx' @ [271:21] ==> val stx: SignedTransaction? defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[LocalVariableDescriptor]

'fiber' @ [272:21] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[ValueParameterDescriptorImpl]

'logger' @ [272:27] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'info' @ [272:34] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'waitingForResponse' @ [272:63] ==> val waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[LocalVariableDescriptor]

'hash' @ [272:82] ==> public final val hash: SecureHash defined in net.corda.node.services.statemachine.WaitForLedgerCommit[PropertyDescriptorImpl]

'fiber' @ [273:21] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[ValueParameterDescriptorImpl]

'waitingForResponse' @ [273:27] ==> internal final var waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'resumeFiber' @ [274:21] ==> private final fun resumeFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [274:33] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[ValueParameterDescriptorImpl]

'fiber' @ [276:21] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[ValueParameterDescriptorImpl]

'logger' @ [276:27] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'info' @ [276:34] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'waitingForResponse' @ [276:80] ==> val waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[LocalVariableDescriptor]

'hash' @ [276:99] ==> public final val hash: SecureHash defined in net.corda.node.services.statemachine.WaitForLedgerCommit[PropertyDescriptorImpl]

'mutex' @ [277:21] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [277:27] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> Boolean): Boolean defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'fibersWaitingForLedgerCommit' @ [277:36] ==> public final val fibersWaitingForLedgerCommit: HashMultimap<(SecureHash..SecureHash?), (FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'put' @ [277:65] ==> @CanIgnoreReturnValue public open fun put(@Nullable p0: SecureHash?, @Nullable p1: FlowStateMachineImpl<*>?): Boolean defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]

'waitingForResponse' @ [277:69] ==> val waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[LocalVariableDescriptor]

'hash' @ [277:88] ==> public final val hash: SecureHash defined in net.corda.node.services.statemachine.WaitForLedgerCommit[PropertyDescriptorImpl]

'fiber' @ [277:94] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[ValueParameterDescriptorImpl]

'fiber' @ [280:17] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[ValueParameterDescriptorImpl]

'logger' @ [280:23] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'info' @ [280:30] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'resumeFiber' @ [283:13] ==> private final fun resumeFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [283:25] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeRestoredFiber[ValueParameterDescriptorImpl]

'message' @ [288:30] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[ValueParameterDescriptorImpl]

'data' @ [288:38] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'deserialize' @ [288:43] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SessionMessage defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> SessionMessage

'serviceHub' @ [289:22] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'networkMapCache' @ [289:33] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'getNodeByLegalName' @ [289:49] ==> public open fun getNodeByLegalName(principal: X500Name): NodeInfo? defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'message' @ [289:68] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[ValueParameterDescriptorImpl]

'peer' @ [289:76] ==> public abstract val peer: X500Name defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'legalIdentity' @ [289:83] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'if (sender != null) {
            when (sessionMessage) {
                is ExistingSessionMessage -> onExistingSessionMessage(sessionMessage, sender)
                is SessionInit -> onSessionInit(sessionMessage, message, sender)
            }
        } else {
            logger.error("Unknown peer ${message.peer} in $sessionMessage")
        }' @ [290:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'sender' @ [290:13] ==> val sender: Party? defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[LocalVariableDescriptor]

'when (sessionMessage) {
                is ExistingSessionMessage -> onExistingSessionMessage(sessionMessage, sender)
                is SessionInit -> onSessionInit(sessionMessage, message, sender)
            }' @ [291:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'sessionMessage' @ [291:19] ==> val sessionMessage: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[LocalVariableDescriptor]

'onExistingSessionMessage' @ [292:46] ==> private final fun onExistingSessionMessage(message: ExistingSessionMessage, sender: Party): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'sessionMessage' @ [292:71] ==> val sessionMessage: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[LocalVariableDescriptor]

'sender' @ [292:87] ==> val sender: Party? defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[LocalVariableDescriptor]

'onSessionInit' @ [293:35] ==> private final fun onSessionInit(sessionInit: SessionInit, receivedMessage: ReceivedMessage, sender: Party): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'sessionMessage' @ [293:49] ==> val sessionMessage: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[LocalVariableDescriptor]

'message' @ [293:65] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[ValueParameterDescriptorImpl]

'sender' @ [293:74] ==> val sender: Party? defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[LocalVariableDescriptor]

'logger' @ [296:13] ==> private final val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'error' @ [296:20] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'message' @ [296:42] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[ValueParameterDescriptorImpl]

'peer' @ [296:50] ==> public abstract val peer: X500Name defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'sessionMessage' @ [296:60] ==> val sessionMessage: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onSessionMessage[LocalVariableDescriptor]

'openSessions' @ [301:23] ==> private final val openSessions: ConcurrentHashMap<Long, FlowSession> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'message' @ [301:36] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'recipientSessionId' @ [301:44] ==> public abstract val recipientSessionId: Long defined in net.corda.node.services.statemachine.ExistingSessionMessage[PropertyDescriptorImpl]

'if (session != null) {
            session.fiber.logger.trace { "Received $message on $session from $sender" }
            if (session.retryable) {
                if (message is SessionConfirm && session.state is FlowSessionState.Initiated) {
                    session.fiber.logger.trace { "Ignoring duplicate confirmation for session ${session.ourSessionId} – session is idempotent" }
                    return
                }
                if (message !is SessionConfirm) {
                    serviceHub.networkService.cancelRedelivery(session.ourSessionId)
                }
            }
            if (message is SessionEnd) {
                openSessions.remove(message.recipientSessionId)
            }
            session.receivedMessages += ReceivedSessionMessage(sender, message)
            if (resumeOnMessage(message, session)) {
                // It's important that we reset here and not after the fiber's resumed, in case we receive another message
                // before then.
                session.fiber.waitingForResponse = null
                updateCheckpoint(session.fiber)
                session.fiber.logger.trace { "Resuming due to $message" }
                resumeFiber(session.fiber)
            }
        } else {
            val peerParty = recentlyClosedSessions.remove(message.recipientSessionId)
            if (peerParty != null) {
                if (message is SessionConfirm) {
                    logger.trace { "Received session confirmation but associated fiber has already terminated, so sending session end" }
                    sendSessionMessage(peerParty, NormalSessionEnd(message.initiatedSessionId))
                } else {
                    logger.trace { "Ignoring session end message for already closed session: $message" }
                }
            } else {
                logger.warn("Received a session message for unknown session: $message, from $sender")
            }
        }' @ [302:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'session' @ [302:13] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'session' @ [303:13] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'fiber' @ [303:21] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'logger' @ [303:27] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [303:34] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'message' @ [303:53] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'session' @ [303:65] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'sender' @ [303:79] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'session' @ [304:17] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'retryable' @ [304:25] ==> public final val retryable: Boolean defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'message' @ [305:21] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'session' @ [305:50] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'state' @ [305:58] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'session' @ [306:21] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'fiber' @ [306:29] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'logger' @ [306:35] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [306:42] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'session' @ [306:97] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'ourSessionId' @ [306:105] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'message' @ [309:21] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'serviceHub' @ [310:21] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'networkService' @ [310:32] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'cancelRedelivery' @ [310:47] ==> public abstract fun cancelRedelivery(retryId: Long): Unit defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'session' @ [310:64] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'ourSessionId' @ [310:72] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'message' @ [313:17] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'openSessions' @ [314:17] ==> private final val openSessions: ConcurrentHashMap<Long, FlowSession> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'remove' @ [314:30] ==> public open fun remove(key: Long): FlowSession? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'message' @ [314:37] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'recipientSessionId' @ [314:45] ==> public abstract val recipientSessionId: Long defined in net.corda.node.services.statemachine.ExistingSessionMessage[PropertyDescriptorImpl]

'session' @ [316:13] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'receivedMessages' @ [316:21] ==> public final val receivedMessages: ConcurrentLinkedQueue<ReceivedSessionMessage<*>> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'ReceivedSessionMessage' @ [316:41] ==> public constructor ReceivedSessionMessage<out M : ExistingSessionMessage>(sender: Party, message: ExistingSessionMessage) defined in net.corda.node.services.statemachine.ReceivedSessionMessage[ClassConstructorDescriptorImpl]
Inferred types:
    <out M : ExistingSessionMessage> -> ExistingSessionMessage

'sender' @ [316:64] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'message' @ [316:72] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'resumeOnMessage' @ [317:17] ==> private final fun resumeOnMessage(message: ExistingSessionMessage, session: FlowSession): Boolean defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'message' @ [317:33] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'session' @ [317:42] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'session' @ [320:17] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'fiber' @ [320:25] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'waitingForResponse' @ [320:31] ==> internal final var waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'updateCheckpoint' @ [321:17] ==> private final fun updateCheckpoint(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'session' @ [321:34] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'fiber' @ [321:42] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'session' @ [322:17] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'fiber' @ [322:25] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'logger' @ [322:31] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [322:38] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'message' @ [322:64] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'resumeFiber' @ [323:17] ==> private final fun resumeFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'session' @ [323:29] ==> val session: FlowSession? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'fiber' @ [323:37] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'recentlyClosedSessions' @ [326:29] ==> private final val recentlyClosedSessions: ConcurrentHashMap<Long, Party> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'remove' @ [326:52] ==> public open fun remove(key: Long): Party? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'message' @ [326:59] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'recipientSessionId' @ [326:67] ==> public abstract val recipientSessionId: Long defined in net.corda.node.services.statemachine.ExistingSessionMessage[PropertyDescriptorImpl]

'if (peerParty != null) {
                if (message is SessionConfirm) {
                    logger.trace { "Received session confirmation but associated fiber has already terminated, so sending session end" }
                    sendSessionMessage(peerParty, NormalSessionEnd(message.initiatedSessionId))
                } else {
                    logger.trace { "Ignoring session end message for already closed session: $message" }
                }
            } else {
                logger.warn("Received a session message for unknown session: $message, from $sender")
            }' @ [327:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'peerParty' @ [327:17] ==> val peerParty: Party? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'if (message is SessionConfirm) {
                    logger.trace { "Received session confirmation but associated fiber has already terminated, so sending session end" }
                    sendSessionMessage(peerParty, NormalSessionEnd(message.initiatedSessionId))
                } else {
                    logger.trace { "Ignoring session end message for already closed session: $message" }
                }' @ [328:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'message' @ [328:21] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'logger' @ [329:21] ==> private final val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'trace' @ [329:28] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'sendSessionMessage' @ [330:21] ==> private final fun sendSessionMessage(party: Party, message: SessionMessage, fiber: FlowStateMachineImpl<*>? = ..., retryId: Long? = ...): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'peerParty' @ [330:40] ==> val peerParty: Party? defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[LocalVariableDescriptor]

'NormalSessionEnd' @ [330:51] ==> public constructor NormalSessionEnd(recipientSessionId: Long) defined in net.corda.node.services.statemachine.NormalSessionEnd[ClassConstructorDescriptorImpl]

'message' @ [330:68] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'initiatedSessionId' @ [330:76] ==> public final val initiatedSessionId: Long defined in net.corda.node.services.statemachine.SessionConfirm[PropertyDescriptorImpl]

'logger' @ [332:21] ==> private final val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'trace' @ [332:28] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'message' @ [332:95] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'logger' @ [335:17] ==> private final val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'warn' @ [335:24] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'message' @ [335:79] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'sender' @ [335:94] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onExistingSessionMessage[ValueParameterDescriptorImpl]

'session' @ [343:34] ==> value-parameter session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.resumeOnMessage[ValueParameterDescriptorImpl]

'fiber' @ [343:42] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'waitingForResponse' @ [343:48] ==> internal final var waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'waitingForResponse' @ [344:17] ==> val waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.StateMachineManager.resumeOnMessage[LocalVariableDescriptor]

'session' @ [344:60] ==> public abstract val session: FlowSession defined in net.corda.node.services.statemachine.ReceiveRequest[PropertyDescriptorImpl]

'session' @ [344:72] ==> value-parameter session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.resumeOnMessage[ValueParameterDescriptorImpl]

'waitingForResponse' @ [345:17] ==> val waitingForResponse: WaitingRequest? defined in net.corda.node.services.statemachine.StateMachineManager.resumeOnMessage[LocalVariableDescriptor]

'message' @ [345:62] ==> value-parameter message: ExistingSessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.resumeOnMessage[ValueParameterDescriptorImpl]

'logger' @ [349:9] ==> private final val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'trace' @ [349:16] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'sessionInit' @ [349:35] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'sender' @ [349:53] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'sessionInit' @ [350:31] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'initiatorSessionId' @ [350:43] ==> public final val initiatorSessionId: Long defined in net.corda.node.services.statemachine.SessionInit[PropertyDescriptorImpl]

'sendSessionMessage' @ [352:50] ==> private final fun sendSessionMessage(party: Party, message: SessionMessage, fiber: FlowStateMachineImpl<*>? = ..., retryId: Long? = ...): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'sender' @ [352:69] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'SessionReject' @ [352:77] ==> public constructor SessionReject(initiatorSessionId: Long, errorMessage: String) defined in net.corda.node.services.statemachine.SessionReject[ClassConstructorDescriptorImpl]

'senderSessionId' @ [352:91] ==> val senderSessionId: Long defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'message' @ [352:108] ==> value-parameter message: String defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit.sendSessionReject[ValueParameterDescriptorImpl]

'component1' @ [354:14] ==> public final operator fun component1(): FlowSession defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [354:23] ==> public final operator fun component2(): InitiatedFlowFactory<*> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'getInitiatedFlowFactory' @ [355:40] ==> private final fun getInitiatedFlowFactory(sessionInit: SessionInit): InitiatedFlowFactory<*> defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'sessionInit' @ [355:64] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'initiatedFlowFactory' @ [356:24] ==> val initiatedFlowFactory: InitiatedFlowFactory<*> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'createFlow' @ [356:45] ==> public final fun createFlow(otherParty: Party): FlowLogic<*> defined in net.corda.node.internal.InitiatedFlowFactory[SimpleFunctionDescriptorImpl]

'sender' @ [356:56] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'when (initiatedFlowFactory) {
                is InitiatedFlowFactory.Core -> receivedMessage.platformVersion  // The flow version for the core flows is the platform version
                is InitiatedFlowFactory.CorDapp -> sessionInit.flowVersion
            }' @ [357:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'initiatedFlowFactory' @ [357:43] ==> val initiatedFlowFactory: InitiatedFlowFactory<*> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'receivedMessage' @ [358:49] ==> value-parameter receivedMessage: ReceivedMessage defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'platformVersion' @ [358:65] ==> public abstract val platformVersion: Int defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'sessionInit' @ [359:52] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'flowVersion' @ [359:64] ==> public final val flowVersion: Int defined in net.corda.node.services.statemachine.SessionInit[PropertyDescriptorImpl]

'FlowSession' @ [361:27] ==> public constructor FlowSession(flow: FlowLogic<*>, ourSessionId: Long, initiatingParty: Party?, state: FlowSessionState, retryable: Boolean = ...) defined in net.corda.node.services.statemachine.FlowSession[ClassConstructorDescriptorImpl]

'flow' @ [362:21] ==> val flow: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'random63BitValue' @ [363:21] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'sender' @ [364:21] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'Initiated' @ [365:38] ==> public constructor Initiated(peerParty: Party, peerSessionId: Long, context: FlowContext) defined in net.corda.node.services.statemachine.FlowSessionState.Initiated[ClassConstructorDescriptorImpl]

'sender' @ [365:48] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'senderSessionId' @ [365:56] ==> val senderSessionId: Long defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'FlowContext' @ [365:73] ==> public constructor FlowContext(flowVersion: Int, appName: String) defined in net.corda.core.flows.FlowContext[DeserializedClassConstructorDescriptor]

'senderFlowVersion' @ [365:85] ==> val senderFlowVersion: Int defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'sessionInit' @ [365:104] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'appName' @ [365:116] ==> public final val appName: String defined in net.corda.node.services.statemachine.SessionInit[PropertyDescriptorImpl]

'sessionInit' @ [366:17] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'firstPayload' @ [366:29] ==> public final val firstPayload: Any? defined in net.corda.node.services.statemachine.SessionInit[PropertyDescriptorImpl]

'session' @ [367:17] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'receivedMessages' @ [367:25] ==> public final val receivedMessages: ConcurrentLinkedQueue<ReceivedSessionMessage<*>> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'ReceivedSessionMessage' @ [367:45] ==> public constructor ReceivedSessionMessage<out M : ExistingSessionMessage>(sender: Party, message: SessionData) defined in net.corda.node.services.statemachine.ReceivedSessionMessage[ClassConstructorDescriptorImpl]
Inferred types:
    <out M : ExistingSessionMessage> -> SessionData

'sender' @ [367:68] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'SessionData' @ [367:76] ==> public constructor SessionData(recipientSessionId: Long, payload: Any) defined in net.corda.node.services.statemachine.SessionData[ClassConstructorDescriptorImpl]

'session' @ [367:88] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'ourSessionId' @ [367:96] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'sessionInit' @ [367:110] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'firstPayload' @ [367:122] ==> public final val firstPayload: Any? defined in net.corda.node.services.statemachine.SessionInit[PropertyDescriptorImpl]

'openSessions' @ [369:13] ==> private final val openSessions: ConcurrentHashMap<Long, FlowSession> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'session' @ [369:26] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'ourSessionId' @ [369:34] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'session' @ [369:50] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'createFiber' @ [370:25] ==> private final fun <T> createFiber(logic: FlowLogic<Any?>, flowInitiator: FlowInitiator): FlowStateMachineImpl<Any?> defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'flow' @ [370:37] ==> val flow: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'Peer' @ [370:57] ==> public constructor Peer(party: Party) defined in net.corda.core.flows.FlowInitiator.Peer[DeserializedClassConstructorDescriptor]

'sender' @ [370:62] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'fiber' @ [371:13] ==> val fiber: FlowStateMachineImpl<Any?> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'openSessions' @ [371:19] ==> internal final val openSessions: HashMap<Pair<FlowLogic<*>, Party>, FlowSession> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'Pair' @ [371:32] ==> public constructor Pair<out A, out B>(first: FlowLogic<*>, second: Party) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> FlowLogic<*>
    <out B> -> Party

'flow' @ [371:37] ==> val flow: FlowLogic<*> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'sender' @ [371:43] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'session' @ [371:54] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'updateCheckpoint' @ [372:13] ==> private final fun updateCheckpoint(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [372:30] ==> val fiber: FlowStateMachineImpl<Any?> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'session' @ [373:13] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'initiatedFlowFactory' @ [373:24] ==> val initiatedFlowFactory: InitiatedFlowFactory<*> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'logger' @ [375:13] ==> private final val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'warn' @ [375:20] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [375:28] ==> val e: SessionRejectException defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'logMessage' @ [375:30] ==> public final val logMessage: String defined in net.corda.node.services.statemachine.SessionRejectException[PropertyDescriptorImpl]

'sessionInit' @ [375:44] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'sendSessionReject' @ [376:13] ==> local final fun sendSessionReject(message: String): Unit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[SimpleFunctionDescriptorImpl]

'e' @ [376:31] ==> val e: SessionRejectException defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'rejectMessage' @ [376:33] ==> public final val rejectMessage: String defined in net.corda.node.services.statemachine.SessionRejectException[PropertyDescriptorImpl]

'logger' @ [379:13] ==> private final val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'warn' @ [379:20] ==> public abstract fun warn(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'sessionInit' @ [379:60] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'e' @ [379:74] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'sendSessionReject' @ [380:13] ==> local final fun sendSessionReject(message: String): Unit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[SimpleFunctionDescriptorImpl]

'component1' @ [384:14] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [384:30] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (initiatedFlowFactory) {
            // The flow version for the core flows is the platform version
            is InitiatedFlowFactory.Core -> serviceHub.myInfo.platformVersion to "corda"
            is InitiatedFlowFactory.CorDapp -> initiatedFlowFactory.flowVersion to initiatedFlowFactory.appName
        }' @ [384:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<Int, String>, entry1: Pair<Int, String>): Pair<Int, String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<Int, String>

'initiatedFlowFactory' @ [384:47] ==> val initiatedFlowFactory: InitiatedFlowFactory<*> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'serviceHub' @ [386:45] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'myInfo' @ [386:56] ==> public abstract val myInfo: NodeInfo defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'platformVersion' @ [386:63] ==> public final val platformVersion: Int defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'initiatedFlowFactory' @ [387:48] ==> val initiatedFlowFactory: InitiatedFlowFactory<*> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'flowVersion' @ [387:69] ==> public final val flowVersion: Int defined in net.corda.node.internal.InitiatedFlowFactory.CorDapp[PropertyDescriptorImpl]

'initiatedFlowFactory' @ [387:84] ==> val initiatedFlowFactory: InitiatedFlowFactory<*> defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'appName' @ [387:105] ==> public final val appName: String defined in net.corda.node.internal.InitiatedFlowFactory.CorDapp[PropertyDescriptorImpl]

'sendSessionMessage' @ [390:9] ==> private final fun sendSessionMessage(party: Party, message: SessionMessage, fiber: FlowStateMachineImpl<*>? = ..., retryId: Long? = ...): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'sender' @ [390:28] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'SessionConfirm' @ [390:36] ==> public constructor SessionConfirm(initiatorSessionId: Long, initiatedSessionId: Long, flowVersion: Int, appName: String) defined in net.corda.node.services.statemachine.SessionConfirm[ClassConstructorDescriptorImpl]

'senderSessionId' @ [390:51] ==> val senderSessionId: Long defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'session' @ [390:68] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'ourSessionId' @ [390:76] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'ourFlowVersion' @ [390:90] ==> val ourFlowVersion: Int defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'appName' @ [390:106] ==> val appName: String defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'session' @ [390:116] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'fiber' @ [390:124] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'session' @ [391:9] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'fiber' @ [391:17] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'logger' @ [391:23] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'debug' @ [391:30] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'sender' @ [391:53] ==> value-parameter sender: Party defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'sessionInit' @ [391:68] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'initiatingFlowClass' @ [391:80] ==> public final val initiatingFlowClass: String defined in net.corda.node.services.statemachine.SessionInit[PropertyDescriptorImpl]

'session' @ [392:9] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'fiber' @ [392:17] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'logger' @ [392:23] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [392:30] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'sessionInit' @ [392:55] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[ValueParameterDescriptorImpl]

'session' @ [392:71] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'resumeFiber' @ [393:9] ==> private final fun resumeFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'session' @ [393:21] ==> val session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.onSessionInit[LocalVariableDescriptor]

'fiber' @ [393:29] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'forName' @ [398:19] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'sessionInit' @ [398:27] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.getInitiatedFlowFactory[ValueParameterDescriptorImpl]

'initiatingFlowClass' @ [398:39] ==> public final val initiatingFlowClass: String defined in net.corda.node.services.statemachine.SessionInit[PropertyDescriptorImpl]

'asSubclass' @ [398:60] ==> public open fun <U : (Any..Any?)> asSubclass(p0: (Class<(FlowLogic<*>..FlowLogic<*>?)>..Class<(FlowLogic<*>..FlowLogic<*>?)>?)): (Class<out (FlowLogic<*>..FlowLogic<*>?)>..Class<out (FlowLogic<*>..FlowLogic<*>?)>?) defined in java.lang.Class[JavaMethodDescriptor]
Inferred types:
    <U : (Any..Any?)> -> (net.corda.core.flows.FlowLogic<*>..net.corda.core.flows.FlowLogic<*>?)

'FlowLogic' @ [398:71] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@6f0e8f55

'java' @ [398:88] ==> public val <T> KClass<FlowLogic<*>>.java: Class<FlowLogic<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FlowLogic<*>

'SessionRejectException' @ [400:19] ==> public constructor SessionRejectException(message: String) defined in net.corda.node.services.statemachine.SessionRejectException[ClassConstructorDescriptorImpl]

'sessionInit' @ [400:56] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.getInitiatedFlowFactory[ValueParameterDescriptorImpl]

'initiatingFlowClass' @ [400:68] ==> public final val initiatingFlowClass: String defined in net.corda.node.services.statemachine.SessionInit[PropertyDescriptorImpl]

'SessionRejectException' @ [402:19] ==> public constructor SessionRejectException(message: String) defined in net.corda.node.services.statemachine.SessionRejectException[ClassConstructorDescriptorImpl]

'sessionInit' @ [402:45] ==> value-parameter sessionInit: SessionInit defined in net.corda.node.services.statemachine.StateMachineManager.getInitiatedFlowFactory[ValueParameterDescriptorImpl]

'initiatingFlowClass' @ [402:57] ==> public final val initiatingFlowClass: String defined in net.corda.node.services.statemachine.SessionInit[PropertyDescriptorImpl]

'serviceHub' @ [404:16] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'getFlowFactory' @ [404:27] ==> public abstract fun getFlowFactory(initiatingFlowClass: Class<out FlowLogic<*>>): InitiatedFlowFactory<*>? defined in net.corda.node.services.api.ServiceHubInternal[SimpleFunctionDescriptorImpl]

'initiatingFlowClass' @ [404:42] ==> val initiatingFlowClass: (Class<out (FlowLogic<*>..FlowLogic<*>?)>..Class<out (FlowLogic<*>..FlowLogic<*>?)>?) defined in net.corda.node.services.statemachine.StateMachineManager.getInitiatedFlowFactory[LocalVariableDescriptor]

'SessionRejectException' @ [405:23] ==> public constructor SessionRejectException(message: String) defined in net.corda.node.services.statemachine.SessionRejectException[ClassConstructorDescriptorImpl]

'initiatingFlowClass' @ [405:48] ==> val initiatingFlowClass: (Class<out (FlowLogic<*>..FlowLogic<*>?)>..Class<out (FlowLogic<*>..FlowLogic<*>?)>?) defined in net.corda.node.services.statemachine.StateMachineManager.getInitiatedFlowFactory[LocalVariableDescriptor]

'fiber' @ [409:16] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.serializeFiber[ValueParameterDescriptorImpl]

'serialize' @ [409:22] ==> public fun <T : Any> FlowStateMachineImpl<*>.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<FlowStateMachineImpl<*>> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> FlowStateMachineImpl<*>

'CHECKPOINT_CONTEXT' @ [409:42] ==> public final var CHECKPOINT_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'withTokenContext' @ [409:61] ==> public fun SerializationContext.withTokenContext(serializationContext: SerializeAsTokenContext): SerializationContext defined in net.corda.nodeapi.internal.serialization[DeserializedSimpleFunctionDescriptor]

'serializationContext' @ [409:78] ==> private final val serializationContext: SerializeAsTokenContextImpl defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'checkpoint' @ [414:13] ==> value-parameter checkpoint: Checkpoint defined in net.corda.node.services.statemachine.StateMachineManager.deserializeFiber[ValueParameterDescriptorImpl]

'serializedFiber' @ [414:24] ==> public final val serializedFiber: SerializedBytes<FlowStateMachineImpl<*>> defined in net.corda.node.services.api.Checkpoint[PropertyDescriptorImpl]

'deserialize' @ [414:40] ==> public inline fun <reified T : Any> SerializedBytes<FlowStateMachineImpl<*>>.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): FlowStateMachineImpl<*> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FlowStateMachineImpl<*>

'CHECKPOINT_CONTEXT' @ [414:62] ==> public final var CHECKPOINT_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'withTokenContext' @ [414:81] ==> public fun SerializationContext.withTokenContext(serializationContext: SerializeAsTokenContext): SerializationContext defined in net.corda.nodeapi.internal.serialization[DeserializedSimpleFunctionDescriptor]

'serializationContext' @ [414:98] ==> private final val serializationContext: SerializeAsTokenContextImpl defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'apply' @ [414:121] ==> @InlineOnly public inline fun <T> FlowStateMachineImpl<*>.apply(block: FlowStateMachineImpl<*>.() -> Unit): FlowStateMachineImpl<*> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowStateMachineImpl<*>

'fromCheckpoint' @ [415:17] ==> @Transient internal final var fromCheckpoint: Boolean defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'logger' @ [418:13] ==> value-parameter logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.deserializeFiber[ValueParameterDescriptorImpl]

'error' @ [418:20] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

't' @ [418:66] ==> val t: Throwable defined in net.corda.node.services.statemachine.StateMachineManager.deserializeFiber[LocalVariableDescriptor]

'StateMachineRunId' @ [424:18] ==> public companion object defined in net.corda.core.flows.StateMachineRunId[FakeCallableDescriptorForObject]

'createRandom' @ [424:36] ==> public final fun createRandom(): StateMachineRunId defined in net.corda.core.flows.StateMachineRunId.Companion[DeserializedSimpleFunctionDescriptor]

'FlowStateMachineImpl' @ [425:16] ==> public constructor FlowStateMachineImpl<R>(id: StateMachineRunId, logic: FlowLogic<T>, scheduler: FiberScheduler, flowInitiator: FlowInitiator) defined in net.corda.node.services.statemachine.FlowStateMachineImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <R> -> T

'id' @ [425:37] ==> val id: StateMachineRunId defined in net.corda.node.services.statemachine.StateMachineManager.createFiber[LocalVariableDescriptor]

'logic' @ [425:41] ==> value-parameter logic: FlowLogic<T> defined in net.corda.node.services.statemachine.StateMachineManager.createFiber[ValueParameterDescriptorImpl]

'scheduler' @ [425:48] ==> private final val scheduler: StateMachineManager.FiberScheduler defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'flowInitiator' @ [425:59] ==> value-parameter flowInitiator: FlowInitiator defined in net.corda.node.services.statemachine.StateMachineManager.createFiber[ValueParameterDescriptorImpl]

'apply' @ [425:74] ==> @InlineOnly public inline fun <T> FlowStateMachineImpl<T>.apply(block: FlowStateMachineImpl<T>.() -> Unit): FlowStateMachineImpl<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowStateMachineImpl<T>

'initFiber' @ [425:82] ==> private final fun initFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'this' @ [425:92] ==> <this> defined in net.corda.node.services.statemachine.StateMachineManager.createFiber.<anonymous>[ReceiverParameterDescriptorImpl]

'fiber' @ [429:9] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'database' @ [429:15] ==> @Transient internal final lateinit var database: CordaPersistence defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'database' @ [429:26] ==> public final val database: CordaPersistence defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'fiber' @ [430:9] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'serviceHub' @ [430:15] ==> @Transient public open lateinit var serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'serviceHub' @ [430:28] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'fiber' @ [431:9] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'actionOnSuspend' @ [431:15] ==> @Transient internal final lateinit var actionOnSuspend: (FlowIORequest) -> Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'updateCheckpoint' @ [432:13] ==> private final fun updateCheckpoint(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [432:30] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'fiber' @ [435:13] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'commitTransaction' @ [435:19] ==> internal final fun commitTransaction(): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'processIORequest' @ [436:13] ==> private final fun processIORequest(ioRequest: FlowIORequest): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'ioRequest' @ [436:30] ==> value-parameter ioRequest: FlowIORequest defined in net.corda.node.services.statemachine.StateMachineManager.initFiber.<anonymous>[ValueParameterDescriptorImpl]

'decrementLiveFibers' @ [437:13] ==> private final fun decrementLiveFibers(): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [439:9] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'actionOnEnd' @ [439:15] ==> @Transient internal final lateinit var actionOnEnd: (Try<Nothing>, Boolean) -> Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'mutex' @ [441:17] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [441:23] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'stateMachines' @ [442:21] ==> public final val stateMachines: LinkedHashMap<FlowStateMachineImpl<*>, Checkpoint> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'remove' @ [442:35] ==> public open fun remove(key: FlowStateMachineImpl<*>): Checkpoint? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'fiber' @ [442:42] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'let' @ [442:50] ==> @InlineOnly public inline fun <T, R> Checkpoint.let(block: (Checkpoint) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Checkpoint
    <R> -> Unit

'checkpointStorage' @ [442:56] ==> public final val checkpointStorage: CheckpointStorage defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'removeCheckpoint' @ [442:74] ==> public abstract fun removeCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.api.CheckpointStorage[SimpleFunctionDescriptorImpl]

'it' @ [442:91] ==> value-parameter it: Checkpoint defined in net.corda.node.services.statemachine.StateMachineManager.initFiber.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'notifyChangeObservers' @ [443:21] ==> public final fun notifyChangeObservers(change: StateMachineManager.Change): Unit defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[SimpleFunctionDescriptorImpl]

'Removed' @ [443:50] ==> public constructor Removed(logic: FlowLogic<*>, result: Try<*>) defined in net.corda.node.services.statemachine.StateMachineManager.Change.Removed[ClassConstructorDescriptorImpl]

'fiber' @ [443:58] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'logic' @ [443:64] ==> public final val logic: FlowLogic<Any?> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'result' @ [443:71] ==> value-parameter result: Try<Any?> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber.<anonymous>[ValueParameterDescriptorImpl]

'endAllFiberSessions' @ [445:17] ==> private final fun endAllFiberSessions(fiber: FlowStateMachineImpl<*>, result: Try<*>, propagated: Boolean): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [445:37] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'result' @ [445:44] ==> value-parameter result: Try<Any?> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber.<anonymous>[ValueParameterDescriptorImpl]

'propagated' @ [445:52] ==> value-parameter propagated: Boolean defined in net.corda.node.services.statemachine.StateMachineManager.initFiber.<anonymous>[ValueParameterDescriptorImpl]

'fiber' @ [447:17] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'commitTransaction' @ [447:23] ==> internal final fun commitTransaction(): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'decrementLiveFibers' @ [448:17] ==> private final fun decrementLiveFibers(): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'totalFinishedFlows' @ [449:17] ==> private final val totalFinishedFlows: (Counter..Counter?) defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'inc' @ [449:36] ==> public open fun inc(): Unit defined in com.codahale.metrics.Counter[JavaMethodDescriptor]

'unfinishedFibers' @ [450:17] ==> private final val unfinishedFibers: ReusableLatch defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'countDown' @ [450:34] ==> public open fun countDown(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'mutex' @ [453:9] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [453:15] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'totalStartedFlows' @ [454:13] ==> private final val totalStartedFlows: (Counter..Counter?) defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'inc' @ [454:31] ==> public open fun inc(): Unit defined in com.codahale.metrics.Counter[JavaMethodDescriptor]

'unfinishedFibers' @ [455:13] ==> private final val unfinishedFibers: ReusableLatch defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'countUp' @ [455:30] ==> public open fun countUp(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'notifyChangeObservers' @ [456:13] ==> public final fun notifyChangeObservers(change: StateMachineManager.Change): Unit defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[SimpleFunctionDescriptorImpl]

'Add' @ [456:42] ==> public constructor Add(logic: FlowLogic<*>) defined in net.corda.node.services.statemachine.StateMachineManager.Change.Add[ClassConstructorDescriptorImpl]

'fiber' @ [456:46] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.initFiber[ValueParameterDescriptorImpl]

'logic' @ [456:52] ==> public final val logic: FlowLogic<Any?> defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'openSessions' @ [461:9] ==> private final val openSessions: ConcurrentHashMap<Long, FlowSession> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'values' @ [461:22] ==> public open val values: MutableCollection<FlowSession> defined in java.util.concurrent.ConcurrentHashMap[JavaPropertyDescriptor]

'removeIf' @ [461:29] ==> public final fun removeIf(p0: (FlowSession) -> Boolean): Boolean defined in kotlin.collections.MutableCollection[MyFunctionDescriptor]

'if (session.fiber == fiber) {
                session.endSession((result as? Try.Failure)?.exception, propagated)
                true
            } else {
                false
            }' @ [462:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'session' @ [462:17] ==> value-parameter session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.endAllFiberSessions.<anonymous>[ValueParameterDescriptorImpl]

'fiber' @ [462:25] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'fiber' @ [462:34] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.endAllFiberSessions[ValueParameterDescriptorImpl]

'session' @ [463:17] ==> value-parameter session: FlowSession defined in net.corda.node.services.statemachine.StateMachineManager.endAllFiberSessions.<anonymous>[ValueParameterDescriptorImpl]

'endSession' @ [463:25] ==> private final fun FlowSession.endSession(exception: Throwable?, propagated: Boolean): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'result' @ [463:37] ==> value-parameter result: Try<*> defined in net.corda.node.services.statemachine.StateMachineManager.endAllFiberSessions[ValueParameterDescriptorImpl]

'exception' @ [463:62] ==> public final val exception: Throwable defined in net.corda.core.utilities.Try.Failure[DeserializedPropertyDescriptor]

'propagated' @ [463:73] ==> value-parameter propagated: Boolean defined in net.corda.node.services.statemachine.StateMachineManager.endAllFiberSessions[ValueParameterDescriptorImpl]

'state' @ [472:30] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'if (exception == null) {
            NormalSessionEnd(initiatedState.peerSessionId)
        } else {
            val errorResponse = if (exception is FlowException && (!propagated || initiatingParty != null)) {
                // Only propagate this FlowException if our local flow threw it or it was propagated to us and we only
                // pass it down invocation chain to the flow that initiated us, not to flows we've started sessions with.
                exception
            } else {
                null
            }
            ErrorSessionEnd(initiatedState.peerSessionId, errorResponse)
        }' @ [473:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SessionEnd, elseBranch: SessionEnd): SessionEnd[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SessionEnd

'exception' @ [473:30] ==> value-parameter exception: Throwable? defined in net.corda.node.services.statemachine.StateMachineManager.endSession[ValueParameterDescriptorImpl]

'NormalSessionEnd' @ [474:13] ==> public constructor NormalSessionEnd(recipientSessionId: Long) defined in net.corda.node.services.statemachine.NormalSessionEnd[ClassConstructorDescriptorImpl]

'initiatedState' @ [474:30] ==> val initiatedState: FlowSessionState.Initiated defined in net.corda.node.services.statemachine.StateMachineManager.endSession[LocalVariableDescriptor]

'peerSessionId' @ [474:45] ==> public final val peerSessionId: Long defined in net.corda.node.services.statemachine.FlowSessionState.Initiated[PropertyDescriptorImpl]

'if (exception is FlowException && (!propagated || initiatingParty != null)) {
                // Only propagate this FlowException if our local flow threw it or it was propagated to us and we only
                // pass it down invocation chain to the flow that initiated us, not to flows we've started sessions with.
                exception
            } else {
                null
            }' @ [476:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FlowException?, elseBranch: FlowException?): FlowException?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FlowException?

'exception' @ [476:37] ==> value-parameter exception: Throwable? defined in net.corda.node.services.statemachine.StateMachineManager.endSession[ValueParameterDescriptorImpl]

'!' @ [476:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'propagated' @ [476:69] ==> value-parameter propagated: Boolean defined in net.corda.node.services.statemachine.StateMachineManager.endSession[ValueParameterDescriptorImpl]

'initiatingParty' @ [476:83] ==> public final val initiatingParty: Party? defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'exception' @ [479:17] ==> value-parameter exception: Throwable? defined in net.corda.node.services.statemachine.StateMachineManager.endSession[ValueParameterDescriptorImpl]

'ErrorSessionEnd' @ [483:13] ==> public constructor ErrorSessionEnd(recipientSessionId: Long, errorResponse: FlowException?) defined in net.corda.node.services.statemachine.ErrorSessionEnd[ClassConstructorDescriptorImpl]

'initiatedState' @ [483:29] ==> val initiatedState: FlowSessionState.Initiated defined in net.corda.node.services.statemachine.StateMachineManager.endSession[LocalVariableDescriptor]

'peerSessionId' @ [483:44] ==> public final val peerSessionId: Long defined in net.corda.node.services.statemachine.FlowSessionState.Initiated[PropertyDescriptorImpl]

'errorResponse' @ [483:59] ==> val errorResponse: FlowException? defined in net.corda.node.services.statemachine.StateMachineManager.endSession[LocalVariableDescriptor]

'sendSessionMessage' @ [485:9] ==> private final fun sendSessionMessage(party: Party, message: SessionMessage, fiber: FlowStateMachineImpl<*>? = ..., retryId: Long? = ...): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'initiatedState' @ [485:28] ==> val initiatedState: FlowSessionState.Initiated defined in net.corda.node.services.statemachine.StateMachineManager.endSession[LocalVariableDescriptor]

'peerParty' @ [485:43] ==> public final val peerParty: Party defined in net.corda.node.services.statemachine.FlowSessionState.Initiated[PropertyDescriptorImpl]

'sessionEnd' @ [485:54] ==> val sessionEnd: SessionEnd defined in net.corda.node.services.statemachine.StateMachineManager.endSession[LocalVariableDescriptor]

'fiber' @ [485:66] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'recentlyClosedSessions' @ [486:9] ==> private final val recentlyClosedSessions: ConcurrentHashMap<Long, Party> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'ourSessionId' @ [486:32] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'initiatedState' @ [486:48] ==> val initiatedState: FlowSessionState.Initiated defined in net.corda.node.services.statemachine.StateMachineManager.endSession[LocalVariableDescriptor]

'peerParty' @ [486:63] ==> public final val peerParty: Party defined in net.corda.node.services.statemachine.FlowSessionState.Initiated[PropertyDescriptorImpl]

'executor' @ [498:9] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'checkOnThread' @ [498:18] ==> public open fun checkOnThread(): Unit defined in net.corda.node.utilities.AffinityExecutor[SimpleFunctionDescriptorImpl]

'database' @ [499:21] ==> public final val database: CordaPersistence defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'transaction' @ [499:30] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> FlowStateMachineImpl<T>): FlowStateMachineImpl<T> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> FlowStateMachineImpl<T>

'createFiber' @ [500:25] ==> private final fun <T> createFiber(logic: FlowLogic<T>, flowInitiator: FlowInitiator): FlowStateMachineImpl<T> defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> T

'logic' @ [500:37] ==> value-parameter logic: FlowLogic<T> defined in net.corda.node.services.statemachine.StateMachineManager.add[ValueParameterDescriptorImpl]

'flowInitiator' @ [500:44] ==> value-parameter flowInitiator: FlowInitiator defined in net.corda.node.services.statemachine.StateMachineManager.add[ValueParameterDescriptorImpl]

'updateCheckpoint' @ [501:13] ==> private final fun updateCheckpoint(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [501:30] ==> val fiber: FlowStateMachineImpl<T> defined in net.corda.node.services.statemachine.StateMachineManager.add.<anonymous>[LocalVariableDescriptor]

'fiber' @ [502:13] ==> val fiber: FlowStateMachineImpl<T> defined in net.corda.node.services.statemachine.StateMachineManager.add.<anonymous>[LocalVariableDescriptor]

'mutex' @ [505:9] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [505:15] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'started' @ [506:17] ==> public final var started: Boolean defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'resumeFiber' @ [507:17] ==> private final fun resumeFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [507:29] ==> val fiber: FlowStateMachineImpl<T> defined in net.corda.node.services.statemachine.StateMachineManager.add[LocalVariableDescriptor]

'fiber' @ [510:16] ==> val fiber: FlowStateMachineImpl<T> defined in net.corda.node.services.statemachine.StateMachineManager.add[LocalVariableDescriptor]

'check' @ [514:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'fiber' @ [514:15] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.updateCheckpoint[ValueParameterDescriptorImpl]

'state' @ [514:21] ==> public final val <R> FlowStateMachineImpl<out Any?>.state: (Strand.State..Strand.State?)[MyPropertyDescriptor]
Inferred types:
    <R> -> Captured(*)

'RUNNING' @ [514:43] ==> enum entry RUNNING defined in co.paralleluniverse.strands.Strand.State[FakeCallableDescriptorForObject]

'Checkpoint' @ [515:29] ==> public constructor Checkpoint(serializedFiber: SerializedBytes<FlowStateMachineImpl<*>>) defined in net.corda.node.services.api.Checkpoint[ClassConstructorDescriptorImpl]

'serializeFiber' @ [515:40] ==> private final fun serializeFiber(fiber: FlowStateMachineImpl<*>): SerializedBytes<FlowStateMachineImpl<*>> defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'fiber' @ [515:55] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.updateCheckpoint[ValueParameterDescriptorImpl]

'mutex' @ [516:34] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [516:40] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> Checkpoint?): Checkpoint? defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Checkpoint?

'stateMachines' @ [516:49] ==> public final val stateMachines: LinkedHashMap<FlowStateMachineImpl<*>, Checkpoint> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'put' @ [516:63] ==> public open fun put(key: FlowStateMachineImpl<*>, value: Checkpoint): Checkpoint? defined in java.util.LinkedHashMap[JavaMethodDescriptor]

'fiber' @ [516:67] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.updateCheckpoint[ValueParameterDescriptorImpl]

'newCheckpoint' @ [516:74] ==> val newCheckpoint: Checkpoint defined in net.corda.node.services.statemachine.StateMachineManager.updateCheckpoint[LocalVariableDescriptor]

'previousCheckpoint' @ [517:13] ==> val previousCheckpoint: Checkpoint? defined in net.corda.node.services.statemachine.StateMachineManager.updateCheckpoint[LocalVariableDescriptor]

'checkpointStorage' @ [518:13] ==> public final val checkpointStorage: CheckpointStorage defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'removeCheckpoint' @ [518:31] ==> public abstract fun removeCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.api.CheckpointStorage[SimpleFunctionDescriptorImpl]

'previousCheckpoint' @ [518:48] ==> val previousCheckpoint: Checkpoint? defined in net.corda.node.services.statemachine.StateMachineManager.updateCheckpoint[LocalVariableDescriptor]

'checkpointStorage' @ [520:9] ==> public final val checkpointStorage: CheckpointStorage defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'addCheckpoint' @ [520:27] ==> public abstract fun addCheckpoint(checkpoint: Checkpoint): Unit defined in net.corda.node.services.api.CheckpointStorage[SimpleFunctionDescriptorImpl]

'newCheckpoint' @ [520:41] ==> val newCheckpoint: Checkpoint defined in net.corda.node.services.statemachine.StateMachineManager.updateCheckpoint[LocalVariableDescriptor]

'checkpointingMeter' @ [521:9] ==> private final val checkpointingMeter: (Meter..Meter?) defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'mark' @ [521:28] ==> public open fun mark(): Unit defined in com.codahale.metrics.Meter[JavaMethodDescriptor]

'checkpointCheckerThread' @ [523:9] ==> private final val checkpointCheckerThread: ExecutorService? defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'execute' @ [523:34] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'deserializeFiber' @ [526:17] ==> private final fun deserializeFiber(checkpoint: Checkpoint, logger: Logger): FlowStateMachineImpl<*>? defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'newCheckpoint' @ [526:34] ==> val newCheckpoint: Checkpoint defined in net.corda.node.services.statemachine.StateMachineManager.updateCheckpoint[LocalVariableDescriptor]

'fiber' @ [526:49] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.updateCheckpoint[ValueParameterDescriptorImpl]

'logger' @ [526:55] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'unrestorableCheckpoints' @ [527:17] ==> @Volatile private final var unrestorableCheckpoints: Boolean defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'incrementLiveFibers' @ [534:9] ==> private final fun incrementLiveFibers(): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'if (!stopping) {
            executor.executeASAP {
                fiber.resume(scheduler)
            }
        } else {
            fiber.logger.trace("Not resuming as SMM is stopping.")
            decrementLiveFibers()
        }' @ [535:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [535:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'stopping' @ [535:14] ==> @Volatile private final var stopping: Boolean defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'executor' @ [536:13] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'executeASAP' @ [536:22] ==> public open fun executeASAP(runnable: () -> Unit): Unit defined in net.corda.node.utilities.AffinityExecutor[SimpleFunctionDescriptorImpl]

'fiber' @ [537:17] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeFiber[ValueParameterDescriptorImpl]

'resume' @ [537:23] ==> internal final fun resume(scheduler: FiberScheduler): Unit defined in net.corda.node.services.statemachine.FlowStateMachineImpl[SimpleFunctionDescriptorImpl]

'scheduler' @ [537:30] ==> private final val scheduler: StateMachineManager.FiberScheduler defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'fiber' @ [540:13] ==> value-parameter fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.StateMachineManager.resumeFiber[ValueParameterDescriptorImpl]

'logger' @ [540:19] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'trace' @ [540:26] ==> public abstract fun trace(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'decrementLiveFibers' @ [541:13] ==> private final fun decrementLiveFibers(): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'executor' @ [546:9] ==> public final val executor: AffinityExecutor defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'checkOnThread' @ [546:18] ==> public open fun checkOnThread(): Unit defined in net.corda.node.utilities.AffinityExecutor[SimpleFunctionDescriptorImpl]

'when (ioRequest) {
            is SendRequest -> processSendRequest(ioRequest)
            is WaitForLedgerCommit -> processWaitForCommitRequest(ioRequest)
        }' @ [547:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'ioRequest' @ [547:15] ==> value-parameter ioRequest: FlowIORequest defined in net.corda.node.services.statemachine.StateMachineManager.processIORequest[ValueParameterDescriptorImpl]

'processSendRequest' @ [548:31] ==> private final fun processSendRequest(ioRequest: SendRequest): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'ioRequest' @ [548:50] ==> value-parameter ioRequest: FlowIORequest defined in net.corda.node.services.statemachine.StateMachineManager.processIORequest[ValueParameterDescriptorImpl]

'processWaitForCommitRequest' @ [549:39] ==> private final fun processWaitForCommitRequest(ioRequest: WaitForLedgerCommit): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'ioRequest' @ [549:67] ==> value-parameter ioRequest: FlowIORequest defined in net.corda.node.services.statemachine.StateMachineManager.processIORequest[ValueParameterDescriptorImpl]

'if (ioRequest.message is SessionInit) {
            with(ioRequest.session) {
                openSessions[ourSessionId] = this
                if (retryable) ourSessionId else null
            }
        } else null' @ [554:23] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long?, elseBranch: Long?): Long?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long?

'ioRequest' @ [554:27] ==> value-parameter ioRequest: SendRequest defined in net.corda.node.services.statemachine.StateMachineManager.processSendRequest[ValueParameterDescriptorImpl]

'message' @ [554:37] ==> public abstract val message: SessionMessage defined in net.corda.node.services.statemachine.SendRequest[PropertyDescriptorImpl]

'with' @ [555:13] ==> @InlineOnly public inline fun <T, R> with(receiver: FlowSession, block: FlowSession.() -> Long?): Long? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowSession
    <R> -> Long?

'ioRequest' @ [555:18] ==> value-parameter ioRequest: SendRequest defined in net.corda.node.services.statemachine.StateMachineManager.processSendRequest[ValueParameterDescriptorImpl]

'session' @ [555:28] ==> public abstract val session: FlowSession defined in net.corda.node.services.statemachine.SendRequest[PropertyDescriptorImpl]

'openSessions' @ [556:17] ==> private final val openSessions: ConcurrentHashMap<Long, FlowSession> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'ourSessionId' @ [556:30] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'this' @ [556:46] ==> <this> defined in net.corda.node.services.statemachine.StateMachineManager.processSendRequest.<anonymous>[ReceiverParameterDescriptorImpl]

'if (retryable) ourSessionId else null' @ [557:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Long?, elseBranch: Long?): Long?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Long?

'retryable' @ [557:21] ==> public final val retryable: Boolean defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'ourSessionId' @ [557:32] ==> public final val ourSessionId: Long defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'sendSessionMessage' @ [560:9] ==> private final fun sendSessionMessage(party: Party, message: SessionMessage, fiber: FlowStateMachineImpl<*>? = ..., retryId: Long? = ...): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'ioRequest' @ [560:28] ==> value-parameter ioRequest: SendRequest defined in net.corda.node.services.statemachine.StateMachineManager.processSendRequest[ValueParameterDescriptorImpl]

'session' @ [560:38] ==> public abstract val session: FlowSession defined in net.corda.node.services.statemachine.SendRequest[PropertyDescriptorImpl]

'state' @ [560:46] ==> public final var state: FlowSessionState defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'sendToParty' @ [560:52] ==> public abstract val sendToParty: Party defined in net.corda.node.services.statemachine.FlowSessionState[PropertyDescriptorImpl]

'ioRequest' @ [560:65] ==> value-parameter ioRequest: SendRequest defined in net.corda.node.services.statemachine.StateMachineManager.processSendRequest[ValueParameterDescriptorImpl]

'message' @ [560:75] ==> public abstract val message: SessionMessage defined in net.corda.node.services.statemachine.SendRequest[PropertyDescriptorImpl]

'ioRequest' @ [560:84] ==> value-parameter ioRequest: SendRequest defined in net.corda.node.services.statemachine.StateMachineManager.processSendRequest[ValueParameterDescriptorImpl]

'session' @ [560:94] ==> public abstract val session: FlowSession defined in net.corda.node.services.statemachine.SendRequest[PropertyDescriptorImpl]

'fiber' @ [560:102] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'retryId' @ [560:109] ==> val retryId: Long? defined in net.corda.node.services.statemachine.StateMachineManager.processSendRequest[LocalVariableDescriptor]

'ioRequest' @ [561:13] ==> value-parameter ioRequest: SendRequest defined in net.corda.node.services.statemachine.StateMachineManager.processSendRequest[ValueParameterDescriptorImpl]

'resumeFiber' @ [563:13] ==> private final fun resumeFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'ioRequest' @ [563:25] ==> value-parameter ioRequest: SendRequest defined in net.corda.node.services.statemachine.StateMachineManager.processSendRequest[ValueParameterDescriptorImpl]

'session' @ [563:35] ==> public abstract val session: FlowSession defined in net.corda.node.services.statemachine.SendRequest[PropertyDescriptorImpl]

'fiber' @ [563:43] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.FlowSession[PropertyDescriptorImpl]

'database' @ [569:19] ==> public final val database: CordaPersistence defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'transaction' @ [569:28] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SignedTransaction?): SignedTransaction? defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> SignedTransaction?

'serviceHub' @ [570:13] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'validatedTransactions' @ [570:24] ==> public abstract val validatedTransactions: WritableTransactionStorage defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'getTransaction' @ [570:46] ==> public abstract fun getTransaction(id: SecureHash): SignedTransaction? defined in net.corda.node.services.api.WritableTransactionStorage[DeserializedSimpleFunctionDescriptor]

'ioRequest' @ [570:61] ==> value-parameter ioRequest: WaitForLedgerCommit defined in net.corda.node.services.statemachine.StateMachineManager.processWaitForCommitRequest[ValueParameterDescriptorImpl]

'hash' @ [570:71] ==> public final val hash: SecureHash defined in net.corda.node.services.statemachine.WaitForLedgerCommit[PropertyDescriptorImpl]

'if (stx != null) {
            resumeFiber(ioRequest.fiber)
        } else {
            // No, then register to wait.
            //
            // We assume this code runs on the server thread, which is the only place transactions are committed
            // currently. When we liberalise our threading somewhat, handing of wait requests will need to be
            // reworked to make the wait atomic in another way. Otherwise there is a race between checking the
            // database and updating the waiting list.
            mutex.locked {
                fibersWaitingForLedgerCommit[ioRequest.hash] += ioRequest.fiber
            }
        }' @ [572:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'stx' @ [572:13] ==> val stx: SignedTransaction? defined in net.corda.node.services.statemachine.StateMachineManager.processWaitForCommitRequest[LocalVariableDescriptor]

'resumeFiber' @ [573:13] ==> private final fun resumeFiber(fiber: FlowStateMachineImpl<*>): Unit defined in net.corda.node.services.statemachine.StateMachineManager[SimpleFunctionDescriptorImpl]

'ioRequest' @ [573:25] ==> value-parameter ioRequest: WaitForLedgerCommit defined in net.corda.node.services.statemachine.StateMachineManager.processWaitForCommitRequest[ValueParameterDescriptorImpl]

'fiber' @ [573:35] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.WaitForLedgerCommit[PropertyDescriptorImpl]

'mutex' @ [581:13] ==> private final val mutex: ThreadBox<StateMachineManager.InnerState> defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'locked' @ [581:19] ==> public final inline fun <R> locked(body: StateMachineManager.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'fibersWaitingForLedgerCommit' @ [582:17] ==> public final val fibersWaitingForLedgerCommit: HashMultimap<(SecureHash..SecureHash?), (FlowStateMachineImpl<*>..FlowStateMachineImpl<*>?)> defined in net.corda.node.services.statemachine.StateMachineManager.InnerState[PropertyDescriptorImpl]

'ioRequest' @ [582:46] ==> value-parameter ioRequest: WaitForLedgerCommit defined in net.corda.node.services.statemachine.StateMachineManager.processWaitForCommitRequest[ValueParameterDescriptorImpl]

'hash' @ [582:56] ==> public final val hash: SecureHash defined in net.corda.node.services.statemachine.WaitForLedgerCommit[PropertyDescriptorImpl]

'ioRequest' @ [582:65] ==> value-parameter ioRequest: WaitForLedgerCommit defined in net.corda.node.services.statemachine.StateMachineManager.processWaitForCommitRequest[ValueParameterDescriptorImpl]

'fiber' @ [582:75] ==> public final val fiber: FlowStateMachineImpl<*> defined in net.corda.node.services.statemachine.WaitForLedgerCommit[PropertyDescriptorImpl]

'serviceHub' @ [588:25] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'networkMapCache' @ [588:36] ==> public abstract val networkMapCache: NetworkMapCacheInternal defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'getPartyInfo' @ [588:52] ==> public abstract fun getPartyInfo(party: Party): PartyInfo? defined in net.corda.node.services.api.NetworkMapCacheInternal[DeserializedSimpleFunctionDescriptor]

'party' @ [588:65] ==> value-parameter party: Party defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [589:26] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'party' @ [589:76] ==> value-parameter party: Party defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'serviceHub' @ [590:23] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'networkService' @ [590:34] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'getAddressOfParty' @ [590:49] ==> public abstract fun getAddressOfParty(partyInfo: PartyInfo): MessageRecipients defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'partyInfo' @ [590:67] ==> val partyInfo: PartyInfo defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[LocalVariableDescriptor]

'fiber' @ [591:22] ==> value-parameter fiber: FlowStateMachineImpl<*>? = ... defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'logger' @ [591:29] ==> public open val logger: Logger defined in net.corda.node.services.statemachine.FlowStateMachineImpl[PropertyDescriptorImpl]

'logger' @ [591:39] ==> private final val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'logger' @ [592:9] ==> val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[LocalVariableDescriptor]

'trace' @ [592:16] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'+' @ [592:24] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'message' @ [592:34] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'party' @ [592:52] ==> value-parameter party: Party defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'address' @ [592:61] ==> val address: MessageRecipients defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[LocalVariableDescriptor]

'if (retryId != null) " with retry $retryId" else ""' @ [592:72] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'retryId' @ [592:76] ==> value-parameter retryId: Long? = ... defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'retryId' @ [592:107] ==> value-parameter retryId: Long? = ... defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'message' @ [595:13] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'serialize' @ [595:21] ==> public fun <T : Any> SessionMessage.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<SessionMessage> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SessionMessage

'message' @ [597:17] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'message' @ [597:48] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'errorResponse' @ [597:56] ==> public final val errorResponse: FlowException? defined in net.corda.node.services.statemachine.ErrorSessionEnd[PropertyDescriptorImpl]

'e' @ [597:85] ==> val e: KryoException defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[LocalVariableDescriptor]

'logger' @ [598:13] ==> val logger: Logger defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[LocalVariableDescriptor]

'warn' @ [598:20] ==> public abstract fun warn(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'+' @ [598:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'message' @ [598:41] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'errorResponse' @ [598:49] ==> public final val errorResponse: FlowException? defined in net.corda.node.services.statemachine.ErrorSessionEnd[PropertyDescriptorImpl]

'javaClass' @ [598:63] ==> public val <T : Any> FlowException.javaClass: Class<FlowException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowException

'name' @ [598:73] ==> public final val <T : (Any..Any?)> Class<FlowException>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FlowException

'e' @ [599:119] ==> val e: KryoException defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[LocalVariableDescriptor]

'message' @ [601:29] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'errorResponse' @ [601:37] ==> public final val errorResponse: FlowException? defined in net.corda.node.services.statemachine.ErrorSessionEnd[PropertyDescriptorImpl]

'let' @ [601:51] ==> @InlineOnly public inline fun <T, R> FlowException.let(block: (FlowException) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FlowException
    <R> -> String?

'if (it.javaClass != FlowException::class.java) it.toString() else it.message' @ [601:57] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'it' @ [601:61] ==> value-parameter it: FlowException defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [601:64] ==> public val <T : Any> FlowException.javaClass: Class<FlowException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> FlowException

'FlowException' @ [601:77] ==> public constructor FlowException() defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

'java' @ [601:98] ==> public val <T> KClass<FlowException>.java: Class<FlowException> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FlowException

'it' @ [601:104] ==> value-parameter it: FlowException defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [601:107] ==> public open fun toString(): String defined in net.corda.core.flows.FlowException[DeserializedSimpleFunctionDescriptor]

'it' @ [601:123] ==> value-parameter it: FlowException defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [601:126] ==> public open val message: String? defined in net.corda.core.flows.FlowException[DeserializedPropertyDescriptor]

'message' @ [602:13] ==> value-parameter message: SessionMessage defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'copy' @ [602:21] ==> public final fun copy(recipientSessionId: Long = ..., errorResponse: FlowException? = ...): ErrorSessionEnd defined in net.corda.node.services.statemachine.ErrorSessionEnd[SimpleFunctionDescriptorImpl]

'FlowException' @ [602:42] ==> public constructor FlowException(message: String?) defined in net.corda.core.flows.FlowException[DeserializedClassConstructorDescriptor]

'exMessage' @ [602:56] ==> val exMessage: String? defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[LocalVariableDescriptor]

'serialize' @ [602:68] ==> public fun <T : Any> ErrorSessionEnd.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<ErrorSessionEnd> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ErrorSessionEnd

'serviceHub' @ [605:9] ==> public final val serviceHub: ServiceHubInternal defined in net.corda.node.services.statemachine.StateMachineManager[PropertyDescriptorImpl]

'networkService' @ [605:20] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'apply' @ [605:35] ==> @InlineOnly public inline fun <T> MessagingService.apply(block: MessagingService.() -> Unit): MessagingService defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessagingService

'send' @ [606:13] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'createMessage' @ [606:18] ==> public abstract fun createMessage(topicSession: TopicSession, data: ByteArray, uuid: UUID = ...): Message defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'sessionTopic' @ [606:32] ==> internal final val sessionTopic: TopicSession defined in net.corda.node.services.statemachine.StateMachineManager.Companion[PropertyDescriptorImpl]

'serialized' @ [606:46] ==> val serialized: SerializedBytes<out SessionMessage> defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[LocalVariableDescriptor]

'bytes' @ [606:57] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'address' @ [606:65] ==> val address: MessageRecipients defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[LocalVariableDescriptor]

'retryId' @ [606:84] ==> value-parameter retryId: Long? = ... defined in net.corda.node.services.statemachine.StateMachineManager.sendSessionMessage[ValueParameterDescriptorImpl]

'Exception' @ [611:83] ==> public final fun <init>(): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'this' @ [612:36] ==> public constructor SessionRejectException(rejectMessage: String, logMessage: String) defined in net.corda.node.services.statemachine.SessionRejectException[ClassConstructorDescriptorImpl]

'message' @ [612:41] ==> value-parameter message: String defined in net.corda.node.services.statemachine.SessionRejectException.<init>[ValueParameterDescriptorImpl]

'message' @ [612:50] ==> value-parameter message: String defined in net.corda.node.services.statemachine.SessionRejectException.<init>[ValueParameterDescriptorImpl]

