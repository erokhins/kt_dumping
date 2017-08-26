'LifeCycle' @ [79:29] ==> public constructor LifeCycle<S : Enum<RPCClientProxyHandler.State>>(initial: RPCClientProxyHandler.State) defined in net.corda.core.internal.LifeCycle[DeserializedClassConstructorDescriptor]
Inferred types:
    <S : Enum<S>> -> State

'UNSTARTED' @ [79:45] ==> enum entry UNSTARTED defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'loggerFor' @ [82:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> RPCClientProxyHandler

'Object' @ [84:38] ==> public constructor Object() defined in java.lang.Object[JavaClassConstructorDescriptor]

'toString' @ [84:46] ==> public open fun toString(): String defined in java.lang.Object[JavaMethodDescriptor]

'javaMethod' @ [84:55] ==> public val KFunction<*>.javaMethod: Method? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'ThreadFactoryBuilder' @ [91:52] ==> public constructor ThreadFactoryBuilder() defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaClassConstructorDescriptor]

'setNameFormat' @ [91:75] ==> public open fun setNameFormat(p0: (String..String?)): (ThreadFactoryBuilder..ThreadFactoryBuilder?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'setDaemon' @ [91:123] ==> public open fun setDaemon(p0: Boolean): (ThreadFactoryBuilder..ThreadFactoryBuilder?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'build' @ [91:139] ==> @CheckReturnValue public open fun build(): (ThreadFactory..ThreadFactory?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'LazyStickyPool' @ [92:43] ==> public constructor LazyStickyPool<A : Any>(size: Int, newInstance: () -> (ExecutorService..ExecutorService?)) defined in net.corda.core.internal.LazyStickyPool[DeserializedClassConstructorDescriptor]
Inferred types:
    <A : Any> -> (java.util.concurrent.ExecutorService..java.util.concurrent.ExecutorService?)

'rpcConfiguration' @ [92:58] ==> private final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'observationExecutorPoolSize' @ [92:75] ==> public final val observationExecutorPoolSize: Int defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'newFixedThreadPool' @ [93:19] ==> public open fun newFixedThreadPool(p0: Int, p1: (ThreadFactory..ThreadFactory?)): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'observationExecutorThreadFactory' @ [93:41] ==> private final val observationExecutorThreadFactory: (ThreadFactory..ThreadFactory?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'RpcReplyMap' @ [97:31] ==> private final fun <init>(): RpcReplyMap /* = ConcurrentHashMap<RPCApi.RpcRequestId, SettableFuture<Any?>> */ defined in net.corda.client.rpc.internal.RpcReplyMap[TypeAliasConstructorDescriptorImpl]

'if (rpcConfiguration.trackRpcCallSites) CallSiteMap() else null' @ [99:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */, elseBranch: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */): CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConcurrentHashMap<Long, Throwable?>?

'rpcConfiguration' @ [99:35] ==> private final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'trackRpcCallSites' @ [99:52] ==> public final val trackRpcCallSites: Boolean defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'CallSiteMap' @ [99:71] ==> private final fun <init>(): CallSiteMap /* = ConcurrentHashMap<Long, Throwable?> */ defined in net.corda.client.rpc.internal.CallSiteMap[TypeAliasConstructorDescriptorImpl]

'ObservableContext' @ [101:37] ==> public constructor ObservableContext(callSiteMap: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */, observableMap: RpcObservableMap /* = Cache<RPCApi.ObservableId, UnicastSubject<Notification<*>>> */, hardReferenceStore: MutableSet<Observable<*>>) defined in net.corda.client.rpc.internal.ObservableContext[ClassConstructorDescriptorImpl]

'callSiteMap' @ [102:27] ==> private final val callSiteMap: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'createRpcObservableMap' @ [103:29] ==> private final fun createRpcObservableMap(): RpcObservableMap /* = Cache<RPCApi.ObservableId, UnicastSubject<Notification<*>>> */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'synchronizedSet' @ [104:46] ==> public open fun <T : (Any..Any?)> synchronizedSet(p0: (MutableSet<(Observable<*>..Observable<*>?)>..Set<(Observable<*>..Observable<*>?)>?)): (MutableSet<(Observable<*>..Observable<*>?)>..Set<(Observable<*>..Observable<*>?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Observable<*>

'mutableSetOf' @ [104:62] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<Observable<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Observable<*>

'ThreadBox' @ [112:37] ==> public constructor ThreadBox<out T>(content: <no name provided>, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> <no name provided>

'ArrayList' @ [113:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ObservableId

'RpcClientObservableSerializer' @ [115:61] ==> public object RpcClientObservableSerializer : Serializer<Observable<*>> defined in net.corda.client.rpc.internal in file RPCClientProxyHandler.kt[FakeCallableDescriptorForObject]

'createContext' @ [115:91] ==> public final fun createContext(serializationContext: SerializationContext, observableContext: ObservableContext): SerializationContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer[SimpleFunctionDescriptorImpl]

'serializationContext' @ [115:105] ==> value-parameter serializationContext: SerializationContext defined in net.corda.client.rpc.internal.RPCClientProxyHandler.<init>[ValueParameterDescriptorImpl]

'observableContext' @ [115:127] ==> private final val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'RemovalListener' @ [118:34] ==> @GwtCompatible public fun <K : (Any..Any?), V : (Any..Any?)> RemovalListener(function: ((RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>..RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>?)) -> Unit): RemovalListener<RPCApi.ObservableId, UnicastSubject<Notification<*>>> defined in com.google.common.cache[SimpleFunctionDescriptorImpl]
Inferred types:
    <K : (Any..Any?)> -> ObservableId
    <V : (Any..Any?)> -> UnicastSubject<Notification<*>>

'callSiteMap' @ [119:31] ==> private final val callSiteMap: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'remove' @ [119:44] ==> public open fun remove(key: Long): Throwable? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'it' @ [119:51] ==> value-parameter it: (RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>..RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.createRpcObservableMap.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [119:54] ==> public open val key: (RPCApi.ObservableId..RPCApi.ObservableId?) defined in com.google.common.cache.RemovalNotification[JavaPropertyDescriptor]

'toLong' @ [119:58] ==> public final val toLong: Long defined in net.corda.nodeapi.RPCApi.ObservableId[DeserializedPropertyDescriptor]

'it' @ [120:17] ==> value-parameter it: (RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>..RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.createRpcObservableMap.<anonymous>[ValueParameterDescriptorImpl]

'cause' @ [120:20] ==> public final val <K : (Any..Any?), V : (Any..Any?)> RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>.cause: (RemovalCause..RemovalCause?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (net.corda.nodeapi.RPCApi.ObservableId..net.corda.nodeapi.RPCApi.ObservableId?)
    <V : (Any..Any?)> -> (rx.subjects.UnicastSubject<rx.Notification<*>>..rx.subjects.UnicastSubject<rx.Notification<*>>?)

'COLLECTED' @ [120:42] ==> enum entry COLLECTED defined in com.google.common.cache.RemovalCause[FakeCallableDescriptorForObject]

'log' @ [121:17] ==> public final val log: Logger defined in net.corda.client.rpc.internal.RPCClientProxyHandler.Companion[PropertyDescriptorImpl]

'warn' @ [121:21] ==> public abstract fun warn(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'listOf' @ [121:26] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'joinToString' @ [127:44] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'rpcCallSite' @ [127:63] ==> val rpcCallSite: Throwable? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.createRpcObservableMap.<anonymous>[LocalVariableDescriptor]

'observablesToReap' @ [129:13] ==> private final val observablesToReap: ThreadBox<<no name provided>> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'locked' @ [129:31] ==> public final inline fun <R> locked(body: <no name provided>.() -> Boolean): Boolean defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Boolean

'observables' @ [129:40] ==> public final var observables: ArrayList<RPCApi.ObservableId> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.observablesToReap.<no name provided>[PropertyDescriptorImpl]

'add' @ [129:52] ==> public open fun add(element: RPCApi.ObservableId): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [129:56] ==> value-parameter it: (RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>..RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.createRpcObservableMap.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [129:59] ==> public open val key: (RPCApi.ObservableId..RPCApi.ObservableId?) defined in com.google.common.cache.RemovalNotification[JavaPropertyDescriptor]

'newBuilder' @ [131:29] ==> public open fun newBuilder(): (CacheBuilder<(Any..Any?), (Any..Any?)>..CacheBuilder<(Any..Any?), (Any..Any?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]

'weakValues' @ [132:17] ==> @GwtIncompatible public open fun weakValues(): (CacheBuilder<(Any..Any?), (Any..Any?)>..CacheBuilder<(Any..Any?), (Any..Any?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]

'removalListener' @ [133:17] ==> @CheckReturnValue public open fun <K1 : (Any..Any?), V1 : (Any..Any?)> removalListener(p0: (RemovalListener<in (RPCApi.ObservableId..RPCApi.ObservableId?), in (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>..RemovalListener<in (RPCApi.ObservableId..RPCApi.ObservableId?), in (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>?)): (CacheBuilder<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>..CacheBuilder<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]
Inferred types:
    <K1 : (Any..Any?)> -> ObservableId
    <V1 : (Any..Any?)> -> UnicastSubject<Notification<*>>

'onObservableRemove' @ [133:33] ==> val onObservableRemove: RemovalListener<RPCApi.ObservableId, UnicastSubject<Notification<*>>> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.createRpcObservableMap[LocalVariableDescriptor]

'concurrencyLevel' @ [134:17] ==> public open fun concurrencyLevel(p0: Int): (CacheBuilder<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>..CacheBuilder<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]

'rpcConfiguration' @ [134:34] ==> private final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'cacheConcurrencyLevel' @ [134:51] ==> public final val cacheConcurrencyLevel: Int defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'build' @ [135:17] ==> public open fun <K1 : (RPCApi.ObservableId..RPCApi.ObservableId?), V1 : (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)> build(): (Cache<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>..Cache<(RPCApi.ObservableId..RPCApi.ObservableId?), (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]
Inferred types:
    <K1 : (RPCApi.ObservableId..RPCApi.ObservableId?)> -> ObservableId
    <V1 : (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)> -> UnicastSubject<Notification<*>>

'LazyPool' @ [144:42] ==> public constructor LazyPool<A>(clear: ((ArtemisProducer) -> Unit)? = ..., shouldReturnToPool: ((ArtemisProducer) -> Boolean)? = ..., bound: Int? = ..., newInstance: () -> ArtemisProducer) defined in net.corda.core.internal.LazyPool[DeserializedClassConstructorDescriptor]
Inferred types:
    <A> -> ArtemisProducer

'rpcConfiguration' @ [144:59] ==> private final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'producerPoolBound' @ [144:76] ==> public final val producerPoolBound: Int defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'serverLocator' @ [149:30] ==> private final val serverLocator: ServerLocator defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'createSessionFactory' @ [149:44] ==> public abstract fun createSessionFactory(): (ClientSessionFactory..ClientSessionFactory?) defined in org.apache.activemq.artemis.api.core.client.ServerLocator[JavaMethodDescriptor]

'sessionFactory' @ [150:23] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'createSession' @ [150:38] ==> public abstract fun createSession(p0: (String..String?), p1: (String..String?), p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean, p6: Int): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'rpcUsername' @ [150:52] ==> private final val rpcUsername: String defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'rpcPassword' @ [150:65] ==> private final val rpcPassword: String defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'DEFAULT_ACK_BATCH_SIZE' @ [150:104] ==> public const final val DEFAULT_ACK_BATCH_SIZE: Int defined in org.apache.activemq.artemis.api.core.client.ActiveMQClient[JavaPropertyDescriptor]

'session' @ [151:9] ==> val session: (ClientSession..ClientSession?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'start' @ [151:17] ==> public abstract fun start(): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'ArtemisProducer' @ [152:9] ==> public constructor ArtemisProducer(sessionFactory: ClientSessionFactory, session: ClientSession, producer: ClientProducer) defined in net.corda.nodeapi.ArtemisProducer[DeserializedClassConstructorDescriptor]

'sessionFactory' @ [152:25] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'session' @ [152:41] ==> val session: (ClientSession..ClientSession?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'session' @ [152:50] ==> val session: (ClientSession..ClientSession?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'createProducer' @ [152:58] ==> public abstract fun createProducer(p0: (String..String?)): (ClientProducer..ClientProducer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'RPCApi' @ [152:73] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_SERVER_QUEUE_NAME' @ [152:80] ==> public final val RPC_SERVER_QUEUE_NAME: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'lifeCycle' @ [159:9] ==> private final val lifeCycle: LifeCycle<RPCClientProxyHandler.State> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'requireState' @ [159:19] ==> public final fun requireState(requiredState: RPCClientProxyHandler.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'UNSTARTED' @ [159:38] ==> enum entry UNSTARTED defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'reaperExecutor' @ [160:9] ==> private final var reaperExecutor: ScheduledExecutorService? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'newScheduledThreadPool' @ [160:36] ==> public open fun newScheduledThreadPool(p0: Int, p1: (ThreadFactory..ThreadFactory?)): (ScheduledExecutorService..ScheduledExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'ThreadFactoryBuilder' @ [162:17] ==> public constructor ThreadFactoryBuilder() defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaClassConstructorDescriptor]

'setNameFormat' @ [162:40] ==> public open fun setNameFormat(p0: (String..String?)): (ThreadFactoryBuilder..ThreadFactoryBuilder?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'setDaemon' @ [162:78] ==> public open fun setDaemon(p0: Boolean): (ThreadFactoryBuilder..ThreadFactoryBuilder?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'build' @ [162:94] ==> @CheckReturnValue public open fun build(): (ThreadFactory..ThreadFactory?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'reaperScheduledFuture' @ [164:9] ==> private final var reaperScheduledFuture: ScheduledFuture<*>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'reaperExecutor' @ [164:33] ==> private final var reaperExecutor: ScheduledExecutorService? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'scheduleAtFixedRate' @ [164:50] ==> public final fun scheduleAtFixedRate(p0: (() -> Unit..(() -> Unit)?), p1: Long, p2: Long, p3: (TimeUnit..TimeUnit?)): (ScheduledFuture<*>..ScheduledFuture<*>?) defined in java.util.concurrent.ScheduledExecutorService[MyFunctionDescriptor]

'this' @ [165:17] ==> <this> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[LazyClassReceiverParameterDescriptor]

'rpcConfiguration' @ [166:17] ==> private final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'reapInterval' @ [166:34] ==> public final val reapInterval: Duration defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'toMillis' @ [166:47] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'rpcConfiguration' @ [167:17] ==> private final val rpcConfiguration: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'reapInterval' @ [167:34] ==> public final val reapInterval: Duration defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'toMillis' @ [167:47] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'MILLISECONDS' @ [168:26] ==> enum entry MILLISECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'sessionAndProducerPool' @ [170:9] ==> private final val sessionAndProducerPool: LazyPool<ArtemisProducer> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'run' @ [170:32] ==> public final inline fun <R> run(withInstance: (ArtemisProducer) -> Unit): Unit defined in net.corda.core.internal.LazyPool[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'it' @ [171:13] ==> value-parameter it: ArtemisProducer defined in net.corda.client.rpc.internal.RPCClientProxyHandler.start.<anonymous>[ValueParameterDescriptorImpl]

'session' @ [171:16] ==> public final val session: ClientSession defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'createTemporaryQueue' @ [171:24] ==> public abstract fun createTemporaryQueue(p0: (SimpleString..SimpleString?), p1: (RoutingType..RoutingType?), p2: (SimpleString..SimpleString?)): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'clientAddress' @ [171:45] ==> private final val clientAddress: SimpleString defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'getDefaultRoutingType' @ [171:89] ==> public open fun getDefaultRoutingType(): (RoutingType..RoutingType?) defined in org.apache.activemq.artemis.api.config.ActiveMQDefaultConfiguration[JavaMethodDescriptor]

'clientAddress' @ [171:114] ==> private final val clientAddress: SimpleString defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'serverLocator' @ [173:30] ==> private final val serverLocator: ServerLocator defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'createSessionFactory' @ [173:44] ==> public abstract fun createSessionFactory(): (ClientSessionFactory..ClientSessionFactory?) defined in org.apache.activemq.artemis.api.core.client.ServerLocator[JavaMethodDescriptor]

'sessionFactory' @ [174:23] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.start[LocalVariableDescriptor]

'createSession' @ [174:38] ==> public abstract fun createSession(p0: (String..String?), p1: (String..String?), p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean, p6: Int): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'rpcUsername' @ [174:52] ==> private final val rpcUsername: String defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'rpcPassword' @ [174:65] ==> private final val rpcPassword: String defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'DEFAULT_ACK_BATCH_SIZE' @ [174:104] ==> public const final val DEFAULT_ACK_BATCH_SIZE: Int defined in org.apache.activemq.artemis.api.core.client.ActiveMQClient[JavaPropertyDescriptor]

'session' @ [175:24] ==> val session: (ClientSession..ClientSession?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.start[LocalVariableDescriptor]

'createConsumer' @ [175:32] ==> public abstract fun createConsumer(p0: (SimpleString..SimpleString?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'clientAddress' @ [175:47] ==> private final val clientAddress: SimpleString defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'consumer' @ [176:9] ==> val consumer: (ClientConsumer..ClientConsumer?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.start[LocalVariableDescriptor]

'setMessageHandler' @ [176:18] ==> public final fun setMessageHandler(p0: (((ClientMessage..ClientMessage?)) -> Unit..(((ClientMessage..ClientMessage?)) -> Unit)?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientConsumer[MyFunctionDescriptor]

'this@RPCClientProxyHandler' @ [176:36] ==> <this> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[LazyClassReceiverParameterDescriptor]

'sessionAndConsumer' @ [177:9] ==> private final var sessionAndConsumer: ArtemisConsumer? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'ArtemisConsumer' @ [177:30] ==> public constructor ArtemisConsumer(sessionFactory: ClientSessionFactory, session: ClientSession, consumer: ClientConsumer) defined in net.corda.nodeapi.ArtemisConsumer[DeserializedClassConstructorDescriptor]

'sessionFactory' @ [177:46] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.start[LocalVariableDescriptor]

'session' @ [177:62] ==> val session: (ClientSession..ClientSession?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.start[LocalVariableDescriptor]

'consumer' @ [177:71] ==> val consumer: (ClientConsumer..ClientConsumer?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.start[LocalVariableDescriptor]

'lifeCycle' @ [178:9] ==> private final val lifeCycle: LifeCycle<RPCClientProxyHandler.State> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'transition' @ [178:19] ==> public final fun transition(from: RPCClientProxyHandler.State, to: RPCClientProxyHandler.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'UNSTARTED' @ [178:36] ==> enum entry UNSTARTED defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'SERVER_VERSION_NOT_SET' @ [178:53] ==> enum entry SERVER_VERSION_NOT_SET defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'session' @ [179:9] ==> val session: (ClientSession..ClientSession?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.start[LocalVariableDescriptor]

'start' @ [179:17] ==> public abstract fun start(): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'lifeCycle' @ [184:9] ==> private final val lifeCycle: LifeCycle<RPCClientProxyHandler.State> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'requireState' @ [184:19] ==> public final fun requireState(errorMessage: (RPCClientProxyHandler.State) -> String = ..., predicate: (RPCClientProxyHandler.State) -> Boolean): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'it' @ [184:34] ==> value-parameter it: RPCClientProxyHandler.State defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'STARTED' @ [184:46] ==> enum entry STARTED defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'it' @ [184:57] ==> value-parameter it: RPCClientProxyHandler.State defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'SERVER_VERSION_NOT_SET' @ [184:69] ==> enum entry SERVER_VERSION_NOT_SET defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'checkProtocolVersion' @ [185:9] ==> private final fun checkProtocolVersion(calledMethod: Method): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'method' @ [185:30] ==> value-parameter method: Method defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[ValueParameterDescriptorImpl]

'method' @ [186:13] ==> value-parameter method: Method defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[ValueParameterDescriptorImpl]

'toStringMethod' @ [186:23] ==> public final val toStringMethod: Method defined in net.corda.client.rpc.internal.RPCClientProxyHandler.Companion[PropertyDescriptorImpl]

'rpcOpsClass' @ [187:43] ==> private final val rpcOpsClass: Class<out RPCOps> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'sessionAndConsumer' @ [189:13] ==> private final var sessionAndConsumer: ArtemisConsumer? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'session' @ [189:34] ==> public final val session: ClientSession defined in net.corda.nodeapi.ArtemisConsumer[DeserializedPropertyDescriptor]

'isClosed' @ [189:42] ==> public final val ClientSession.isClosed: Boolean[MyPropertyDescriptor]

'RPCException' @ [190:19] ==> public constructor RPCException(msg: String) defined in net.corda.nodeapi.RPCException[DeserializedClassConstructorDescriptor]

'RPCApi' @ [192:21] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RpcRequestId' @ [192:28] ==> public constructor RpcRequestId(toLong: Long) defined in net.corda.nodeapi.RPCApi.RpcRequestId[DeserializedClassConstructorDescriptor]

'random63BitValue' @ [192:41] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'callSiteMap' @ [193:9] ==> private final val callSiteMap: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'set' @ [193:22] ==> @InlineOnly public operator inline fun <K, V> MutableMap<Long, Throwable?>.set(key: Long, value: Throwable?): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Long
    <V> -> Throwable?

'rpcId' @ [193:26] ==> val rpcId: RPCApi.RpcRequestId defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'toLong' @ [193:32] ==> public final val toLong: Long defined in net.corda.nodeapi.RPCApi.RpcRequestId[DeserializedPropertyDescriptor]

'Throwable' @ [193:40] ==> public constructor Throwable(message: String?) defined in kotlin.Throwable[DeserializedClassConstructorDescriptor]

'method' @ [193:77] ==> value-parameter method: Method defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[ValueParameterDescriptorImpl]

'name' @ [193:84] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'RPCApi' @ [195:27] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RpcRequest' @ [195:49] ==> public constructor RpcRequest(clientAddress: SimpleString, id: RPCApi.RpcRequestId, methodName: String, arguments: List<Any?>) defined in net.corda.nodeapi.RPCApi.ClientToServer.RpcRequest[DeserializedClassConstructorDescriptor]

'clientAddress' @ [195:60] ==> private final val clientAddress: SimpleString defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'rpcId' @ [195:75] ==> val rpcId: RPCApi.RpcRequestId defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'method' @ [195:82] ==> value-parameter method: Method defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[ValueParameterDescriptorImpl]

'name' @ [195:89] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'arguments' @ [195:95] ==> value-parameter arguments: Array<out Any?>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[ValueParameterDescriptorImpl]

'toList' @ [195:106] ==> public fun <T> Array<out Any?>.toList(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'emptyList' @ [195:118] ==> public fun <T> emptyList(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'create' @ [196:46] ==> public open fun <V : (Any..Any?)> create(): (SettableFuture<(Any..Any?)>..SettableFuture<(Any..Any?)>?) defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Any

'sessionAndProducerPool' @ [197:13] ==> private final val sessionAndProducerPool: LazyPool<ArtemisProducer> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'run' @ [197:36] ==> public final inline fun <R> run(withInstance: (ArtemisProducer) -> Unit): Unit defined in net.corda.core.internal.LazyPool[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'it' @ [198:31] ==> value-parameter it: ArtemisProducer defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'session' @ [198:34] ==> public final val session: ClientSession defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'createMessage' @ [198:42] ==> public abstract fun createMessage(p0: Boolean): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'request' @ [199:17] ==> val request: RPCApi.ClientToServer.RpcRequest defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'writeToClientMessage' @ [199:25] ==> public final fun writeToClientMessage(context: SerializationContext, message: ClientMessage): Unit defined in net.corda.nodeapi.RPCApi.ClientToServer.RpcRequest[DeserializedSimpleFunctionDescriptor]

'serializationContextWithObservableContext' @ [199:46] ==> private final val serializationContextWithObservableContext: SerializationContext defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'message' @ [199:89] ==> val message: (ClientMessage..ClientMessage?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke.<anonymous>[LocalVariableDescriptor]

'log' @ [201:17] ==> public final val log: Logger defined in net.corda.client.rpc.internal.RPCClientProxyHandler.Companion[PropertyDescriptorImpl]

'debug' @ [201:21] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'arguments' @ [202:43] ==> value-parameter arguments: Array<out Any?>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[ValueParameterDescriptorImpl]

'joinToString' @ [202:54] ==> public fun <T> Array<out Any?>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((Any?) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'rpcId' @ [203:30] ==> val rpcId: RPCApi.RpcRequestId defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'method' @ [203:42] ==> value-parameter method: Method defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[ValueParameterDescriptorImpl]

'name' @ [203:49] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'argumentsString' @ [203:56] ==> val argumentsString: String defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke.<anonymous>.<anonymous>[LocalVariableDescriptor]

'method' @ [203:76] ==> value-parameter method: Method defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[ValueParameterDescriptorImpl]

'returnType' @ [203:83] ==> public final val Method.returnType: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'require' @ [206:17] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'rpcReplyMap' @ [206:25] ==> private final val rpcReplyMap: RpcReplyMap /* = ConcurrentHashMap<RPCApi.RpcRequestId, SettableFuture<Any?>> */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'put' @ [206:37] ==> public open fun put(key: RPCApi.RpcRequestId, value: SettableFuture<Any?>): SettableFuture<Any?>? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'rpcId' @ [206:41] ==> val rpcId: RPCApi.RpcRequestId defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'replyFuture' @ [206:48] ==> val replyFuture: (SettableFuture<(Any..Any?)>..SettableFuture<(Any..Any?)>?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'rpcId' @ [207:67] ==> val rpcId: RPCApi.RpcRequestId defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'it' @ [209:17] ==> value-parameter it: ArtemisProducer defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'producer' @ [209:20] ==> public final val producer: ClientProducer defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'send' @ [209:29] ==> public abstract fun send(p0: (Message..Message?)): Unit defined in org.apache.activemq.artemis.api.core.client.ClientProducer[JavaMethodDescriptor]

'message' @ [209:34] ==> val message: (ClientMessage..ClientMessage?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke.<anonymous>[LocalVariableDescriptor]

'it' @ [210:17] ==> value-parameter it: ArtemisProducer defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke.<anonymous>[ValueParameterDescriptorImpl]

'session' @ [210:20] ==> public final val session: ClientSession defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'commit' @ [210:28] ==> public abstract fun commit(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'replyFuture' @ [212:20] ==> val replyFuture: (SettableFuture<(Any..Any?)>..SettableFuture<(Any..Any?)>?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'getOrThrow' @ [212:32] ==> public fun <V> Future<(Any..Any?)>.getOrThrow(timeout: Duration? = ...): (Any..Any?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (kotlin.Any..kotlin.Any?)

'e' @ [215:19] ==> val e: RuntimeException /* = RuntimeException */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'RPCException' @ [218:19] ==> public constructor RPCException(message: String?, cause: Throwable?) defined in net.corda.nodeapi.RPCException[DeserializedClassConstructorDescriptor]

'e' @ [218:32] ==> val e: Exception /* = Exception */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'message' @ [218:34] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [218:49] ==> val e: Exception /* = Exception */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'callSiteMap' @ [220:13] ==> private final val callSiteMap: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'remove' @ [220:26] ==> public open fun remove(key: Long): Throwable? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'rpcId' @ [220:33] ==> val rpcId: RPCApi.RpcRequestId defined in net.corda.client.rpc.internal.RPCClientProxyHandler.invoke[LocalVariableDescriptor]

'toLong' @ [220:39] ==> public final val toLong: Long defined in net.corda.nodeapi.RPCApi.RpcRequestId[DeserializedPropertyDescriptor]

'RPCApi' @ [226:30] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'fromClientMessage' @ [226:52] ==> public final fun fromClientMessage(context: SerializationContext, message: ClientMessage): RPCApi.ServerToClient defined in net.corda.nodeapi.RPCApi.ServerToClient.Companion[DeserializedSimpleFunctionDescriptor]

'serializationContextWithObservableContext' @ [226:70] ==> private final val serializationContextWithObservableContext: SerializationContext defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'message' @ [226:113] ==> value-parameter message: ClientMessage defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[ValueParameterDescriptorImpl]

'log' @ [227:9] ==> public final val log: Logger defined in net.corda.client.rpc.internal.RPCClientProxyHandler.Companion[PropertyDescriptorImpl]

'debug' @ [227:13] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'serverToClient' @ [227:51] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'when (serverToClient) {
            is RPCApi.ServerToClient.RpcReply -> {
                val replyFuture = rpcReplyMap.remove(serverToClient.id)
                if (replyFuture == null) {
                    log.error("RPC reply arrived to unknown RPC ID ${serverToClient.id}, this indicates an internal RPC error.")
                } else {
                    val result = serverToClient.result
                    when (result) {
                        is Try.Success -> replyFuture.set(result.value)
                        is Try.Failure -> {
                            val rpcCallSite = callSiteMap?.get(serverToClient.id.toLong)
                            if (rpcCallSite != null) addRpcCallSiteToThrowable(result.exception, rpcCallSite)
                            replyFuture.setException(result.exception)
                        }
                    }
                }
            }
            is RPCApi.ServerToClient.Observation -> {
                val observable = observableContext.observableMap.getIfPresent(serverToClient.id)
                if (observable == null) {
                    log.debug("Observation ${serverToClient.content} arrived to unknown Observable with ID ${serverToClient.id}. " +
                            "This may be due to an observation arriving before the server was " +
                            "notified of observable shutdown")
                } else {
                    // We schedule the onNext() on an executor sticky-pooled based on the Observable ID.
                    observationExecutorPool.run(serverToClient.id) { executor ->
                        executor.submit {
                            val content = serverToClient.content
                            if (content.isOnCompleted || content.isOnError) {
                                observableContext.observableMap.invalidate(serverToClient.id)
                            }
                            // Add call site information on error
                            if (content.isOnError) {
                                val rpcCallSite = callSiteMap?.get(serverToClient.id.toLong)
                                if (rpcCallSite != null) addRpcCallSiteToThrowable(content.throwable, rpcCallSite)
                            }
                            observable.onNext(content)
                        }
                    }
                }
            }
        }' @ [228:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'serverToClient' @ [228:15] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'rpcReplyMap' @ [230:35] ==> private final val rpcReplyMap: RpcReplyMap /* = ConcurrentHashMap<RPCApi.RpcRequestId, SettableFuture<Any?>> */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'remove' @ [230:47] ==> public open fun remove(key: RPCApi.RpcRequestId): SettableFuture<Any?>? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'serverToClient' @ [230:54] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'id' @ [230:69] ==> public final val id: RPCApi.RpcRequestId defined in net.corda.nodeapi.RPCApi.ServerToClient.RpcReply[DeserializedPropertyDescriptor]

'if (replyFuture == null) {
                    log.error("RPC reply arrived to unknown RPC ID ${serverToClient.id}, this indicates an internal RPC error.")
                } else {
                    val result = serverToClient.result
                    when (result) {
                        is Try.Success -> replyFuture.set(result.value)
                        is Try.Failure -> {
                            val rpcCallSite = callSiteMap?.get(serverToClient.id.toLong)
                            if (rpcCallSite != null) addRpcCallSiteToThrowable(result.exception, rpcCallSite)
                            replyFuture.setException(result.exception)
                        }
                    }
                }' @ [231:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'replyFuture' @ [231:21] ==> val replyFuture: SettableFuture<Any?>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'log' @ [232:21] ==> public final val log: Logger defined in net.corda.client.rpc.internal.RPCClientProxyHandler.Companion[PropertyDescriptorImpl]

'error' @ [232:25] ==> public abstract fun error(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'serverToClient' @ [232:70] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'id' @ [232:85] ==> public final val id: RPCApi.RpcRequestId defined in net.corda.nodeapi.RPCApi.ServerToClient.RpcReply[DeserializedPropertyDescriptor]

'serverToClient' @ [234:34] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'result' @ [234:49] ==> public final val result: Try<Any?> defined in net.corda.nodeapi.RPCApi.ServerToClient.RpcReply[DeserializedPropertyDescriptor]

'when (result) {
                        is Try.Success -> replyFuture.set(result.value)
                        is Try.Failure -> {
                            val rpcCallSite = callSiteMap?.get(serverToClient.id.toLong)
                            if (rpcCallSite != null) addRpcCallSiteToThrowable(result.exception, rpcCallSite)
                            replyFuture.setException(result.exception)
                        }
                    }' @ [235:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'result' @ [235:27] ==> val result: Try<Any?> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'replyFuture' @ [236:43] ==> val replyFuture: SettableFuture<Any?>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'set' @ [236:55] ==> @CanIgnoreReturnValue public open fun set(@Nullable p0: Any?): Boolean defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'result' @ [236:59] ==> val result: Try<Any?> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'value' @ [236:66] ==> public final val value: Any? defined in net.corda.core.utilities.Try.Success[DeserializedPropertyDescriptor]

'callSiteMap' @ [238:47] ==> private final val callSiteMap: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'get' @ [238:60] ==> public open fun get(key: Long): Throwable? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'serverToClient' @ [238:64] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'id' @ [238:79] ==> public final val id: RPCApi.RpcRequestId defined in net.corda.nodeapi.RPCApi.ServerToClient.RpcReply[DeserializedPropertyDescriptor]

'toLong' @ [238:82] ==> public final val toLong: Long defined in net.corda.nodeapi.RPCApi.RpcRequestId[DeserializedPropertyDescriptor]

'rpcCallSite' @ [239:33] ==> val rpcCallSite: Throwable? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'addRpcCallSiteToThrowable' @ [239:54] ==> private fun addRpcCallSiteToThrowable(throwable: Throwable, callSite: Throwable): Unit defined in net.corda.client.rpc.internal in file RPCClientProxyHandler.kt[SimpleFunctionDescriptorImpl]

'result' @ [239:80] ==> val result: Try<Any?> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'exception' @ [239:87] ==> public final val exception: Throwable defined in net.corda.core.utilities.Try.Failure[DeserializedPropertyDescriptor]

'rpcCallSite' @ [239:98] ==> val rpcCallSite: Throwable? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'replyFuture' @ [240:29] ==> val replyFuture: SettableFuture<Any?>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'setException' @ [240:41] ==> @CanIgnoreReturnValue public open fun setException(p0: (Throwable..Throwable?)): Boolean defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'result' @ [240:54] ==> val result: Try<Any?> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'exception' @ [240:61] ==> public final val exception: Throwable defined in net.corda.core.utilities.Try.Failure[DeserializedPropertyDescriptor]

'observableContext' @ [246:34] ==> private final val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'observableMap' @ [246:52] ==> public final val observableMap: RpcObservableMap /* = Cache<RPCApi.ObservableId, UnicastSubject<Notification<*>>> */ defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'getIfPresent' @ [246:66] ==> @Nullable public abstract fun getIfPresent(p0: (Any..Any?)): UnicastSubject<Notification<*>>? defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'serverToClient' @ [246:79] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'id' @ [246:94] ==> public final val id: RPCApi.ObservableId defined in net.corda.nodeapi.RPCApi.ServerToClient.Observation[DeserializedPropertyDescriptor]

'if (observable == null) {
                    log.debug("Observation ${serverToClient.content} arrived to unknown Observable with ID ${serverToClient.id}. " +
                            "This may be due to an observation arriving before the server was " +
                            "notified of observable shutdown")
                } else {
                    // We schedule the onNext() on an executor sticky-pooled based on the Observable ID.
                    observationExecutorPool.run(serverToClient.id) { executor ->
                        executor.submit {
                            val content = serverToClient.content
                            if (content.isOnCompleted || content.isOnError) {
                                observableContext.observableMap.invalidate(serverToClient.id)
                            }
                            // Add call site information on error
                            if (content.isOnError) {
                                val rpcCallSite = callSiteMap?.get(serverToClient.id.toLong)
                                if (rpcCallSite != null) addRpcCallSiteToThrowable(content.throwable, rpcCallSite)
                            }
                            observable.onNext(content)
                        }
                    }
                }' @ [247:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'observable' @ [247:21] ==> val observable: UnicastSubject<Notification<*>>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'log' @ [248:21] ==> public final val log: Logger defined in net.corda.client.rpc.internal.RPCClientProxyHandler.Companion[PropertyDescriptorImpl]

'debug' @ [248:25] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'+' @ [248:31] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'serverToClient' @ [248:46] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'content' @ [248:61] ==> public final val content: Notification<*> defined in net.corda.nodeapi.RPCApi.ServerToClient.Observation[DeserializedPropertyDescriptor]

'serverToClient' @ [248:110] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'id' @ [248:125] ==> public final val id: RPCApi.ObservableId defined in net.corda.nodeapi.RPCApi.ServerToClient.Observation[DeserializedPropertyDescriptor]

'observationExecutorPool' @ [253:21] ==> private final val observationExecutorPool: LazyStickyPool<(ExecutorService..ExecutorService?)> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'run' @ [253:45] ==> public final inline fun <R> run(stickToOrNull: Any? = ..., withInstance: ((ExecutorService..ExecutorService?)) -> Future<out (Any..Any?)>): Future<out (Any..Any?)> defined in net.corda.core.internal.LazyStickyPool[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Future<out (kotlin.Any..kotlin.Any?)>

'serverToClient' @ [253:49] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'id' @ [253:64] ==> public final val id: RPCApi.ObservableId defined in net.corda.nodeapi.RPCApi.ServerToClient.Observation[DeserializedPropertyDescriptor]

'executor' @ [254:25] ==> value-parameter executor: (ExecutorService..ExecutorService?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler.<anonymous>[ValueParameterDescriptorImpl]

'submit' @ [254:34] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'serverToClient' @ [255:43] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'content' @ [255:58] ==> public final val content: Notification<*> defined in net.corda.nodeapi.RPCApi.ServerToClient.Observation[DeserializedPropertyDescriptor]

'content' @ [256:33] ==> val content: Notification<*> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isOnCompleted' @ [256:41] ==> public final val <T : (Any..Any?)> Notification<out (Any..Any?)>.isOnCompleted: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'content' @ [256:58] ==> val content: Notification<*> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isOnError' @ [256:66] ==> public final val <T : (Any..Any?)> Notification<out (Any..Any?)>.isOnError: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'observableContext' @ [257:33] ==> private final val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'observableMap' @ [257:51] ==> public final val observableMap: RpcObservableMap /* = Cache<RPCApi.ObservableId, UnicastSubject<Notification<*>>> */ defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'invalidate' @ [257:65] ==> public abstract fun invalidate(p0: (Any..Any?)): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'serverToClient' @ [257:76] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'id' @ [257:91] ==> public final val id: RPCApi.ObservableId defined in net.corda.nodeapi.RPCApi.ServerToClient.Observation[DeserializedPropertyDescriptor]

'content' @ [260:33] ==> val content: Notification<*> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isOnError' @ [260:41] ==> public final val <T : (Any..Any?)> Notification<out (Any..Any?)>.isOnError: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'callSiteMap' @ [261:51] ==> private final val callSiteMap: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */ defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'get' @ [261:64] ==> public open fun get(key: Long): Throwable? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'serverToClient' @ [261:68] ==> val serverToClient: RPCApi.ServerToClient defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'id' @ [261:83] ==> public final val id: RPCApi.ObservableId defined in net.corda.nodeapi.RPCApi.ServerToClient.Observation[DeserializedPropertyDescriptor]

'toLong' @ [261:86] ==> public final val toLong: Long defined in net.corda.nodeapi.RPCApi.ObservableId[DeserializedPropertyDescriptor]

'rpcCallSite' @ [262:37] ==> val rpcCallSite: Throwable? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'addRpcCallSiteToThrowable' @ [262:58] ==> private fun addRpcCallSiteToThrowable(throwable: Throwable, callSite: Throwable): Unit defined in net.corda.client.rpc.internal in file RPCClientProxyHandler.kt[SimpleFunctionDescriptorImpl]

'content' @ [262:84] ==> val content: Notification<*> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'throwable' @ [262:92] ==> public final val <T : (Any..Any?)> Notification<out (Any..Any?)>.throwable: (Throwable..Throwable?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'rpcCallSite' @ [262:103] ==> val rpcCallSite: Throwable? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'observable' @ [264:29] ==> val observable: UnicastSubject<Notification<*>>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[LocalVariableDescriptor]

'onNext' @ [264:40] ==> public open fun onNext(p0: (Notification<*>..Notification<*>?)): Unit defined in rx.subjects.UnicastSubject[JavaMethodDescriptor]

'content' @ [264:47] ==> val content: Notification<*> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler.<anonymous>.<anonymous>[LocalVariableDescriptor]

'message' @ [270:9] ==> value-parameter message: ClientMessage defined in net.corda.client.rpc.internal.RPCClientProxyHandler.artemisMessageHandler[ValueParameterDescriptorImpl]

'acknowledge' @ [270:17] ==> public abstract fun acknowledge(): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'close' @ [278:9] ==> private final fun close(notify: Boolean = ...): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'close' @ [288:9] ==> private final fun close(notify: Boolean = ...): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'sessionAndConsumer' @ [300:9] ==> private final var sessionAndConsumer: ArtemisConsumer? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'sessionFactory' @ [300:29] ==> public final val sessionFactory: ClientSessionFactory defined in net.corda.nodeapi.ArtemisConsumer[DeserializedPropertyDescriptor]

'close' @ [300:45] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'reaperScheduledFuture' @ [301:9] ==> private final var reaperScheduledFuture: ScheduledFuture<*>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'cancel' @ [301:32] ==> public abstract fun cancel(p0: Boolean): Boolean defined in java.util.concurrent.ScheduledFuture[JavaMethodDescriptor]

'observableContext' @ [302:9] ==> private final val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'observableMap' @ [302:27] ==> public final val observableMap: RpcObservableMap /* = Cache<RPCApi.ObservableId, UnicastSubject<Notification<*>>> */ defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'invalidateAll' @ [302:41] ==> public abstract fun invalidateAll(): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'reapObservables' @ [303:9] ==> private final fun reapObservables(notify: Boolean = ...): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'notify' @ [303:25] ==> value-parameter notify: Boolean = ... defined in net.corda.client.rpc.internal.RPCClientProxyHandler.close[ValueParameterDescriptorImpl]

'reaperExecutor' @ [304:9] ==> private final var reaperExecutor: ScheduledExecutorService? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'shutdownNow' @ [304:25] ==> public abstract fun shutdownNow(): (MutableList<(Runnable..Runnable?)>..List<(Runnable..Runnable?)>?) defined in java.util.concurrent.ScheduledExecutorService[JavaMethodDescriptor]

'sessionAndProducerPool' @ [305:9] ==> private final val sessionAndProducerPool: LazyPool<ArtemisProducer> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'close' @ [305:32] ==> public final fun close(): Iterable<ArtemisProducer> defined in net.corda.core.internal.LazyPool[DeserializedSimpleFunctionDescriptor]

'forEach' @ [305:40] ==> @HidesMembers public inline fun <T> Iterable<ArtemisProducer>.forEach(action: (ArtemisProducer) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArtemisProducer

'it' @ [306:13] ==> value-parameter it: ArtemisProducer defined in net.corda.client.rpc.internal.RPCClientProxyHandler.close.<anonymous>[ValueParameterDescriptorImpl]

'sessionFactory' @ [306:16] ==> public final val sessionFactory: ClientSessionFactory defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'close' @ [306:31] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'observationExecutorPool' @ [310:36] ==> private final val observationExecutorPool: LazyStickyPool<(ExecutorService..ExecutorService?)> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'close' @ [310:60] ==> public final fun close(): Iterable<(ExecutorService..ExecutorService?)> defined in net.corda.core.internal.LazyStickyPool[DeserializedSimpleFunctionDescriptor]

'observationExecutors' @ [311:9] ==> val observationExecutors: Iterable<(ExecutorService..ExecutorService?)> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.close[LocalVariableDescriptor]

'forEach' @ [311:30] ==> @HidesMembers public inline fun <T> Iterable<(ExecutorService..ExecutorService?)>.forEach(action: ((ExecutorService..ExecutorService?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.util.concurrent.ExecutorService..java.util.concurrent.ExecutorService?)

'it' @ [311:40] ==> value-parameter it: (ExecutorService..ExecutorService?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.close.<anonymous>[ValueParameterDescriptorImpl]

'shutdownNow' @ [311:43] ==> public abstract fun shutdownNow(): (MutableList<(Runnable..Runnable?)>..List<(Runnable..Runnable?)>?) defined in java.util.concurrent.ExecutorService[JavaMethodDescriptor]

'lifeCycle' @ [312:9] ==> private final val lifeCycle: LifeCycle<RPCClientProxyHandler.State> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'justTransition' @ [312:19] ==> public final fun justTransition(to: RPCClientProxyHandler.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'FINISHED' @ [312:40] ==> enum entry FINISHED defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'serverProtocolVersion' @ [319:37] ==> private final var serverProtocolVersion: Int? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'if (serverProtocolVersion == null) {
            lifeCycle.requireState(State.SERVER_VERSION_NOT_SET)
        } else {
            lifeCycle.requireState(State.STARTED)
            val sinceVersion = calledMethod.getAnnotation(RPCSinceVersion::class.java)?.version ?: 0
            if (sinceVersion > serverProtocolVersion) {
                throw UnsupportedOperationException("Method $calledMethod was added in RPC protocol version $sinceVersion but the server is running $serverProtocolVersion")
            }
        }' @ [320:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'serverProtocolVersion' @ [320:13] ==> val serverProtocolVersion: Int? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.checkProtocolVersion[LocalVariableDescriptor]

'lifeCycle' @ [321:13] ==> private final val lifeCycle: LifeCycle<RPCClientProxyHandler.State> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'requireState' @ [321:23] ==> public final fun requireState(requiredState: RPCClientProxyHandler.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'SERVER_VERSION_NOT_SET' @ [321:42] ==> enum entry SERVER_VERSION_NOT_SET defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'lifeCycle' @ [323:13] ==> private final val lifeCycle: LifeCycle<RPCClientProxyHandler.State> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'requireState' @ [323:23] ==> public final fun requireState(requiredState: RPCClientProxyHandler.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'STARTED' @ [323:42] ==> enum entry STARTED defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'calledMethod' @ [324:32] ==> value-parameter calledMethod: Method defined in net.corda.client.rpc.internal.RPCClientProxyHandler.checkProtocolVersion[ValueParameterDescriptorImpl]

'getAnnotation' @ [324:45] ==> public open fun <T : (Annotation..Annotation?)> getAnnotation(p0: (Class<(RPCSinceVersion..RPCSinceVersion?)>..Class<(RPCSinceVersion..RPCSinceVersion?)>?)): (RPCSinceVersion..RPCSinceVersion?) defined in java.lang.reflect.Method[JavaMethodDescriptor]
Inferred types:
    <T : (Annotation..Annotation?)> -> RPCSinceVersion

'RPCSinceVersion' @ [324:59] ==> public constructor RPCSinceVersion(version: Int) defined in net.corda.nodeapi.RPCSinceVersion[DeserializedClassConstructorDescriptor]

'java' @ [324:82] ==> public val <T> KClass<RPCSinceVersion>.java: Class<RPCSinceVersion> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> RPCSinceVersion

'version' @ [324:89] ==> public final val version: Int defined in net.corda.nodeapi.RPCSinceVersion[DeserializedPropertyDescriptor]

'sinceVersion' @ [325:17] ==> val sinceVersion: Int defined in net.corda.client.rpc.internal.RPCClientProxyHandler.checkProtocolVersion[LocalVariableDescriptor]

'serverProtocolVersion' @ [325:32] ==> val serverProtocolVersion: Int? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.checkProtocolVersion[LocalVariableDescriptor]

'UnsupportedOperationException' @ [326:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'calledMethod' @ [326:62] ==> value-parameter calledMethod: Method defined in net.corda.client.rpc.internal.RPCClientProxyHandler.checkProtocolVersion[ValueParameterDescriptorImpl]

'sinceVersion' @ [326:110] ==> val sinceVersion: Int defined in net.corda.client.rpc.internal.RPCClientProxyHandler.checkProtocolVersion[LocalVariableDescriptor]

'serverProtocolVersion' @ [326:150] ==> val serverProtocolVersion: Int? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.checkProtocolVersion[LocalVariableDescriptor]

'if (serverProtocolVersion == null) {
            serverProtocolVersion = version
        } else {
            throw IllegalStateException("setServerProtocolVersion called, but the protocol version was already set!")
        }' @ [336:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'serverProtocolVersion' @ [336:13] ==> private final var serverProtocolVersion: Int? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'serverProtocolVersion' @ [337:13] ==> private final var serverProtocolVersion: Int? defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'version' @ [337:37] ==> value-parameter version: Int defined in net.corda.client.rpc.internal.RPCClientProxyHandler.setServerProtocolVersion[ValueParameterDescriptorImpl]

'IllegalStateException' @ [339:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'lifeCycle' @ [341:9] ==> private final val lifeCycle: LifeCycle<RPCClientProxyHandler.State> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'transition' @ [341:19] ==> public final fun transition(from: RPCClientProxyHandler.State, to: RPCClientProxyHandler.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'SERVER_VERSION_NOT_SET' @ [341:36] ==> enum entry SERVER_VERSION_NOT_SET defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'STARTED' @ [341:66] ==> enum entry STARTED defined in net.corda.client.rpc.internal.RPCClientProxyHandler.State[FakeCallableDescriptorForObject]

'reapObservables' @ [344:46] ==> private final fun reapObservables(notify: Boolean = ...): Unit defined in net.corda.client.rpc.internal.RPCClientProxyHandler[SimpleFunctionDescriptorImpl]

'observableContext' @ [347:9] ==> private final val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'observableMap' @ [347:27] ==> public final val observableMap: RpcObservableMap /* = Cache<RPCApi.ObservableId, UnicastSubject<Notification<*>>> */ defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'cleanUp' @ [347:41] ==> public abstract fun cleanUp(): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'!' @ [348:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'notify' @ [348:14] ==> value-parameter notify: Boolean = ... defined in net.corda.client.rpc.internal.RPCClientProxyHandler.reapObservables[ValueParameterDescriptorImpl]

'observablesToReap' @ [349:29] ==> private final val observablesToReap: ThreadBox<<no name provided>> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'locked' @ [349:47] ==> public final inline fun <R> locked(body: <no name provided>.() -> ArrayList<RPCApi.ObservableId>?): ArrayList<RPCApi.ObservableId>? defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> ArrayList<ObservableId>?

'if (observables.isNotEmpty()) {
                val temporary = observables
                observables = ArrayList()
                temporary
            } else {
                null
            }' @ [350:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ArrayList<RPCApi.ObservableId>?, elseBranch: ArrayList<RPCApi.ObservableId>?): ArrayList<RPCApi.ObservableId>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ArrayList<ObservableId>?

'observables' @ [350:17] ==> public final var observables: ArrayList<RPCApi.ObservableId> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.observablesToReap.<no name provided>[PropertyDescriptorImpl]

'isNotEmpty' @ [350:29] ==> @InlineOnly public inline fun <T> Collection<RPCApi.ObservableId>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObservableId

'observables' @ [351:33] ==> public final var observables: ArrayList<RPCApi.ObservableId> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.observablesToReap.<no name provided>[PropertyDescriptorImpl]

'observables' @ [352:17] ==> public final var observables: ArrayList<RPCApi.ObservableId> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.observablesToReap.<no name provided>[PropertyDescriptorImpl]

'ArrayList' @ [352:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ObservableId

'temporary' @ [353:17] ==> val temporary: ArrayList<RPCApi.ObservableId> defined in net.corda.client.rpc.internal.RPCClientProxyHandler.reapObservables.<anonymous>[LocalVariableDescriptor]

'observableIds' @ [358:13] ==> val observableIds: ArrayList<RPCApi.ObservableId>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.reapObservables[LocalVariableDescriptor]

'log' @ [359:13] ==> public final val log: Logger defined in net.corda.client.rpc.internal.RPCClientProxyHandler.Companion[PropertyDescriptorImpl]

'debug' @ [359:17] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'observableIds' @ [359:36] ==> val observableIds: ArrayList<RPCApi.ObservableId>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.reapObservables[LocalVariableDescriptor]

'size' @ [359:50] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'sessionAndProducerPool' @ [360:13] ==> private final val sessionAndProducerPool: LazyPool<ArtemisProducer> defined in net.corda.client.rpc.internal.RPCClientProxyHandler[PropertyDescriptorImpl]

'run' @ [360:36] ==> public final inline fun <R> run(withInstance: (ArtemisProducer) -> Unit): Unit defined in net.corda.core.internal.LazyPool[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'it' @ [361:31] ==> value-parameter it: ArtemisProducer defined in net.corda.client.rpc.internal.RPCClientProxyHandler.reapObservables.<anonymous>[ValueParameterDescriptorImpl]

'session' @ [361:34] ==> public final val session: ClientSession defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'createMessage' @ [361:42] ==> public abstract fun createMessage(p0: Boolean): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'RPCApi' @ [362:17] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'ObservablesClosed' @ [362:39] ==> public constructor ObservablesClosed(ids: List<RPCApi.ObservableId>) defined in net.corda.nodeapi.RPCApi.ClientToServer.ObservablesClosed[DeserializedClassConstructorDescriptor]

'observableIds' @ [362:57] ==> val observableIds: ArrayList<RPCApi.ObservableId>? defined in net.corda.client.rpc.internal.RPCClientProxyHandler.reapObservables[LocalVariableDescriptor]

'writeToClientMessage' @ [362:72] ==> public final fun writeToClientMessage(message: ClientMessage): Unit defined in net.corda.nodeapi.RPCApi.ClientToServer.ObservablesClosed[DeserializedSimpleFunctionDescriptor]

'message' @ [362:93] ==> val message: (ClientMessage..ClientMessage?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.reapObservables.<anonymous>[LocalVariableDescriptor]

'it' @ [363:17] ==> value-parameter it: ArtemisProducer defined in net.corda.client.rpc.internal.RPCClientProxyHandler.reapObservables.<anonymous>[ValueParameterDescriptorImpl]

'producer' @ [363:20] ==> public final val producer: ClientProducer defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'send' @ [363:29] ==> public abstract fun send(p0: (Message..Message?)): Unit defined in org.apache.activemq.artemis.api.core.client.ClientProducer[JavaMethodDescriptor]

'message' @ [363:34] ==> val message: (ClientMessage..ClientMessage?) defined in net.corda.client.rpc.internal.RPCClientProxyHandler.reapObservables.<anonymous>[LocalVariableDescriptor]

'Serializer<Observable<*>>' @ [388:40] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Observable<*>

'serializationContext' @ [392:16] ==> value-parameter serializationContext: SerializationContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.createContext[ValueParameterDescriptorImpl]

'withProperty' @ [392:37] ==> public abstract fun withProperty(property: Any, value: Any): SerializationContext defined in net.corda.core.serialization.SerializationContext[DeserializedSimpleFunctionDescriptor]

'RpcObservableContextKey' @ [392:50] ==> private object RpcObservableContextKey defined in net.corda.client.rpc.internal.RpcClientObservableSerializer[FakeCallableDescriptorForObject]

'observableContext' @ [392:75] ==> value-parameter observableContext: ObservableContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.createContext[ValueParameterDescriptorImpl]

'kryo' @ [396:33] ==> value-parameter kryo: Kryo defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[ValueParameterDescriptorImpl]

'context' @ [396:38] ==> public final val Kryo.context: raw (ObjectMap<(Any..Any?), (Any..Any?)>..ObjectMap<*, *>?)[MyPropertyDescriptor]

'RpcObservableContextKey' @ [396:46] ==> private object RpcObservableContextKey defined in net.corda.client.rpc.internal.RpcClientObservableSerializer[FakeCallableDescriptorForObject]

'RPCApi' @ [397:28] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'ObservableId' @ [397:35] ==> public constructor ObservableId(toLong: Long) defined in net.corda.nodeapi.RPCApi.ObservableId[DeserializedClassConstructorDescriptor]

'input' @ [397:48] ==> value-parameter input: Input defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[ValueParameterDescriptorImpl]

'readLong' @ [397:54] ==> public open fun readLong(p0: Boolean): Long defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'create' @ [398:41] ==> public open fun <T : (Any..Any?)> create(): (UnicastSubject<(Notification<*>..Notification<*>?)>..UnicastSubject<(Notification<*>..Notification<*>?)>?) defined in rx.subjects.UnicastSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Notification<*>

'require' @ [399:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'observableContext' @ [399:17] ==> val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'observableMap' @ [399:35] ==> public final val observableMap: RpcObservableMap /* = Cache<RPCApi.ObservableId, UnicastSubject<Notification<*>>> */ defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'getIfPresent' @ [399:49] ==> @Nullable public abstract fun getIfPresent(p0: (Any..Any?)): UnicastSubject<Notification<*>>? defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'observableId' @ [399:62] ==> val observableId: RPCApi.ObservableId defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'observableId' @ [400:61] ==> val observableId: RPCApi.ObservableId defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'getRpcCallSite' @ [402:27] ==> private final fun getRpcCallSite(kryo: Kryo, observableContext: ObservableContext): Throwable? defined in net.corda.client.rpc.internal.RpcClientObservableSerializer[SimpleFunctionDescriptorImpl]

'kryo' @ [402:42] ==> value-parameter kryo: Kryo defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[ValueParameterDescriptorImpl]

'observableContext' @ [402:48] ==> val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'observableContext' @ [403:9] ==> val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'observableMap' @ [403:27] ==> public final val observableMap: RpcObservableMap /* = Cache<RPCApi.ObservableId, UnicastSubject<Notification<*>>> */ defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'put' @ [403:41] ==> public abstract fun put(p0: (RPCApi.ObservableId..RPCApi.ObservableId?), p1: (UnicastSubject<Notification<*>>..UnicastSubject<Notification<*>>?)): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'observableId' @ [403:45] ==> val observableId: RPCApi.ObservableId defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'observable' @ [403:59] ==> val observable: (UnicastSubject<(Notification<*>..Notification<*>?)>..UnicastSubject<(Notification<*>..Notification<*>?)>?) defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'observableContext' @ [404:9] ==> val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'callSiteMap' @ [404:27] ==> public final val callSiteMap: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */ defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'put' @ [404:40] ==> public open fun put(key: Long, value: Throwable?): Throwable? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'observableId' @ [404:44] ==> val observableId: RPCApi.ObservableId defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'toLong' @ [404:57] ==> public final val toLong: Long defined in net.corda.nodeapi.RPCApi.ObservableId[DeserializedPropertyDescriptor]

'rpcCallSite' @ [404:65] ==> val rpcCallSite: Throwable? defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'observable' @ [407:16] ==> val observable: (UnicastSubject<(Notification<*>..Notification<*>?)>..UnicastSubject<(Notification<*>..Notification<*>?)>?) defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'pinInSubscriptions' @ [407:27] ==> private fun <T> Observable<(Notification<*>..Notification<*>?)>.pinInSubscriptions(hardReferenceStore: MutableSet<Observable<*>>): Observable<(Notification<*>..Notification<*>?)> defined in net.corda.client.rpc.internal[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (rx.Notification<*>..rx.Notification<*>?)

'observableContext' @ [407:46] ==> val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'hardReferenceStore' @ [407:64] ==> public final val hardReferenceStore: MutableSet<Observable<*>> defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'doOnUnsubscribe' @ [407:84] ==> public final fun doOnUnsubscribe(p0: (() -> Unit..(() -> Unit)?)): (Observable<(Notification<*>..Notification<*>?)>..Observable<(Notification<*>..Notification<*>?)>?) defined in rx.Observable[MyFunctionDescriptor]

'observableContext' @ [411:13] ==> val observableContext: ObservableContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'observableMap' @ [411:31] ==> public final val observableMap: RpcObservableMap /* = Cache<RPCApi.ObservableId, UnicastSubject<Notification<*>>> */ defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'invalidate' @ [411:45] ==> public abstract fun invalidate(p0: (Any..Any?)): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'observableId' @ [411:56] ==> val observableId: RPCApi.ObservableId defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.read[LocalVariableDescriptor]

'dematerialize' @ [412:11] ==> public final fun <T2 : (Any..Any?)> dematerialize(): (Observable<(Any..Any?)>..Observable<(Any..Any?)>?) defined in rx.Observable[JavaMethodDescriptor]
Inferred types:
    <T2 : (Any..Any?)> -> Any

'UnsupportedOperationException' @ [416:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'kryo' @ [420:40] ==> value-parameter kryo: Kryo defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.getRpcCallSite[ValueParameterDescriptorImpl]

'context' @ [420:45] ==> public final val Kryo.context: raw (ObjectMap<(Any..Any?), (Any..Any?)>..ObjectMap<*, *>?)[MyPropertyDescriptor]

'RPCApi' @ [420:53] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RpcRequestOrObservableIdKey' @ [420:60] ==> public object RpcRequestOrObservableIdKey defined in net.corda.nodeapi.RPCApi[FakeCallableDescriptorForObject]

'observableContext' @ [421:16] ==> value-parameter observableContext: ObservableContext defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.getRpcCallSite[ValueParameterDescriptorImpl]

'callSiteMap' @ [421:34] ==> public final val callSiteMap: CallSiteMap? /* = ConcurrentHashMap<Long, Throwable?>? */ defined in net.corda.client.rpc.internal.ObservableContext[PropertyDescriptorImpl]

'get' @ [421:47] ==> public open fun get(key: Long): Throwable? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'rpcRequestOrObservableId' @ [421:51] ==> val rpcRequestOrObservableId: Long defined in net.corda.client.rpc.internal.RpcClientObservableSerializer.getRpcCallSite[LocalVariableDescriptor]

'throwable' @ [426:28] ==> value-parameter throwable: Throwable defined in net.corda.client.rpc.internal.addRpcCallSiteToThrowable[ValueParameterDescriptorImpl]

'currentThrowable' @ [428:21] ==> var currentThrowable: Throwable defined in net.corda.client.rpc.internal.addRpcCallSiteToThrowable[LocalVariableDescriptor]

'cause' @ [428:38] ==> public open val cause: Throwable? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'if (cause == null) {
            currentThrowable.initCause(callSite)
            break
        } else {
            currentThrowable = cause
        }' @ [429:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'cause' @ [429:13] ==> val cause: Throwable? defined in net.corda.client.rpc.internal.addRpcCallSiteToThrowable[LocalVariableDescriptor]

'currentThrowable' @ [430:13] ==> var currentThrowable: Throwable defined in net.corda.client.rpc.internal.addRpcCallSiteToThrowable[LocalVariableDescriptor]

'initCause' @ [430:30] ==> public open fun initCause(p0: (Throwable..Throwable?)): (Throwable..Throwable?) defined in kotlin.Throwable[JavaMethodDescriptor]

'callSite' @ [430:40] ==> value-parameter callSite: Throwable defined in net.corda.client.rpc.internal.addRpcCallSiteToThrowable[ValueParameterDescriptorImpl]

'currentThrowable' @ [433:13] ==> var currentThrowable: Throwable defined in net.corda.client.rpc.internal.addRpcCallSiteToThrowable[LocalVariableDescriptor]

'cause' @ [433:32] ==> val cause: Throwable? defined in net.corda.client.rpc.internal.addRpcCallSiteToThrowable[LocalVariableDescriptor]

'AtomicInteger' @ [439:20] ==> public constructor AtomicInteger(p0: Int) defined in java.util.concurrent.atomic.AtomicInteger[JavaClassConstructorDescriptor]

'this' @ [440:12] ==> <this> defined in net.corda.client.rpc.internal.pinInSubscriptions[ReceiverParameterDescriptorImpl]

'doOnSubscribe' @ [440:17] ==> public final fun doOnSubscribe(p0: (() -> Unit..(() -> Unit)?)): (Observable<(T..T?)>..Observable<(T..T?)>?) defined in rx.Observable[MyFunctionDescriptor]

'refCount' @ [441:13] ==> val refCount: AtomicInteger defined in net.corda.client.rpc.internal.pinInSubscriptions[LocalVariableDescriptor]

'getAndIncrement' @ [441:22] ==> public final fun getAndIncrement(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'require' @ [442:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'hardReferenceStore' @ [442:21] ==> value-parameter hardReferenceStore: MutableSet<Observable<*>> defined in net.corda.client.rpc.internal.pinInSubscriptions[ValueParameterDescriptorImpl]

'add' @ [442:40] ==> public abstract fun add(element: Observable<*>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'this' @ [442:44] ==> <this> defined in net.corda.client.rpc.internal.pinInSubscriptions[ReceiverParameterDescriptorImpl]

'this' @ [442:99] ==> <this> defined in net.corda.client.rpc.internal.pinInSubscriptions[ReceiverParameterDescriptorImpl]

'doOnUnsubscribe' @ [444:7] ==> public final fun doOnUnsubscribe(p0: (() -> Unit..(() -> Unit)?)): (Observable<(T..T?)>..Observable<(T..T?)>?) defined in rx.Observable[MyFunctionDescriptor]

'refCount' @ [445:13] ==> val refCount: AtomicInteger defined in net.corda.client.rpc.internal.pinInSubscriptions[LocalVariableDescriptor]

'decrementAndGet' @ [445:22] ==> public final fun decrementAndGet(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'require' @ [446:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'hardReferenceStore' @ [446:21] ==> value-parameter hardReferenceStore: MutableSet<Observable<*>> defined in net.corda.client.rpc.internal.pinInSubscriptions[ValueParameterDescriptorImpl]

'remove' @ [446:40] ==> public abstract fun remove(element: Observable<*>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'this' @ [446:47] ==> <this> defined in net.corda.client.rpc.internal.pinInSubscriptions[ReceiverParameterDescriptorImpl]

'this' @ [446:100] ==> <this> defined in net.corda.client.rpc.internal.pinInSubscriptions[ReceiverParameterDescriptorImpl]

