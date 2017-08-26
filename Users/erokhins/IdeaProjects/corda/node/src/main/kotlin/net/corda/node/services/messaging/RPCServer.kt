'RPCServerConfiguration' @ [56:23] ==> public constructor RPCServerConfiguration(rpcThreadPoolSize: Int, consumerPoolSize: Int, producerPoolBound: Int, reapInterval: Duration) defined in net.corda.node.services.messaging.RPCServerConfiguration[ClassConstructorDescriptorImpl]

'seconds' @ [60:34] ==> public val Int.seconds: Duration defined in net.corda.core.utilities[DeserializedPropertyDescriptor]

'RPCServerConfiguration' @ [80:64] ==> public companion object defined in net.corda.node.services.messaging.RPCServerConfiguration[FakeCallableDescriptorForObject]

'default' @ [80:87] ==> public final val default: RPCServerConfiguration defined in net.corda.node.services.messaging.RPCServerConfiguration.Companion[PropertyDescriptorImpl]

'loggerFor' @ [83:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> RPCServer

'BufferOrNone' @ [92:82] ==> private constructor BufferOrNone() defined in net.corda.node.services.messaging.RPCServer.BufferOrNone[ClassConstructorDescriptorImpl]

'BufferOrNone' @ [93:23] ==> private constructor BufferOrNone() defined in net.corda.node.services.messaging.RPCServer.BufferOrNone[ClassConstructorDescriptorImpl]

'LifeCycle' @ [98:29] ==> public constructor LifeCycle<S : Enum<RPCServer.State>>(initial: RPCServer.State) defined in net.corda.core.internal.LifeCycle[DeserializedClassConstructorDescriptor]
Inferred types:
    <S : Enum<S>> -> State

'UNSTARTED' @ [98:45] ==> enum entry UNSTARTED defined in net.corda.node.services.messaging.RPCServer.State[FakeCallableDescriptorForObject]

'createObservableSubscriptionMap' @ [102:33] ==> private final fun createObservableSubscriptionMap(): ObservableSubscriptionMap /* = Cache<RPCApi.ObservableId, ObservableSubscription> */ defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'synchronizedSetMultimap' @ [104:56] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> synchronizedSetMultimap(p0: (SetMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>..SetMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>?)): (SetMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>..SetMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>?) defined in com.google.common.collect.Multimaps[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SimpleString
    <V : (Any..Any?)> -> ObservableId

'create' @ [104:93] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> create(): (HashMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>..HashMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>?) defined in com.google.common.collect.HashMultimap[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SimpleString
    <V : (Any..Any?)> -> ObservableId

'ArrayList' @ [112:39] ==> public final fun <E> <init>(p0: Int): ArrayList<ArtemisConsumer> /* = ArrayList<ArtemisConsumer> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> ArtemisConsumer

'rpcConfiguration' @ [112:66] ==> private final val rpcConfiguration: RPCServerConfiguration defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'consumerPoolSize' @ [112:83] ==> public final val consumerPoolSize: Int defined in net.corda.node.services.messaging.RPCServerConfiguration[PropertyDescriptorImpl]

'LazyStickyPool' @ [113:42] ==> public constructor LazyStickyPool<A : Any>(size: Int, newInstance: () -> ArtemisProducer) defined in net.corda.core.internal.LazyStickyPool[DeserializedClassConstructorDescriptor]
Inferred types:
    <A : Any> -> ArtemisProducer

'rpcConfiguration' @ [113:57] ==> private final val rpcConfiguration: RPCServerConfiguration defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'producerPoolBound' @ [113:74] ==> public final val producerPoolBound: Int defined in net.corda.node.services.messaging.RPCServerConfiguration[PropertyDescriptorImpl]

'serverLocator' @ [114:30] ==> private final val serverLocator: ServerLocator defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'createSessionFactory' @ [114:44] ==> public abstract fun createSessionFactory(): (ClientSessionFactory..ClientSessionFactory?) defined in org.apache.activemq.artemis.api.core.client.ServerLocator[JavaMethodDescriptor]

'sessionFactory' @ [115:23] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.node.services.messaging.RPCServer.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'createSession' @ [115:38] ==> public abstract fun createSession(p0: (String..String?), p1: (String..String?), p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean, p6: Int): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'rpcServerUsername' @ [115:52] ==> private final val rpcServerUsername: String defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'rpcServerPassword' @ [115:71] ==> private final val rpcServerPassword: String defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'DEFAULT_ACK_BATCH_SIZE' @ [115:116] ==> public const final val DEFAULT_ACK_BATCH_SIZE: Int defined in org.apache.activemq.artemis.api.core.client.ActiveMQClient[JavaPropertyDescriptor]

'session' @ [116:9] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.RPCServer.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'start' @ [116:17] ==> public abstract fun start(): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'ArtemisProducer' @ [117:9] ==> public constructor ArtemisProducer(sessionFactory: ClientSessionFactory, session: ClientSession, producer: ClientProducer) defined in net.corda.nodeapi.ArtemisProducer[DeserializedClassConstructorDescriptor]

'sessionFactory' @ [117:25] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.node.services.messaging.RPCServer.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'session' @ [117:41] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.RPCServer.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'session' @ [117:50] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.RPCServer.sessionAndProducerPool.<anonymous>[LocalVariableDescriptor]

'createProducer' @ [117:58] ==> public abstract fun createProducer(): (ClientProducer..ClientProducer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'ConcurrentHashMap' @ [123:41] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SimpleString
    <V : (Any..Any?)> -> BufferOrNone

'ops' @ [126:30] ==> private final val ops: RPCOps defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'javaClass' @ [126:34] ==> public val <T : Any> RPCOps.javaClass: Class<RPCOps> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> RPCOps

'declaredMethods' @ [126:44] ==> public final val <T : (Any..Any?)> Class<RPCOps>.declaredMethods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> RPCOps

'groupBy' @ [126:60] ==> public inline fun <T, K> Array<out (Method..Method?)>.groupBy(keySelector: ((Method..Method?)) -> (String..String?)): Map<(String..String?), List<(Method..Method?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)
    <K> -> (kotlin.String..kotlin.String?)

'it' @ [126:70] ==> value-parameter it: (Method..Method?) defined in net.corda.node.services.messaging.RPCServer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [126:73] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'groupedMethods' @ [127:9] ==> val groupedMethods: Map<(String..String?), List<(Method..Method?)>> defined in net.corda.node.services.messaging.RPCServer.<init>[LocalVariableDescriptor]

'forEach' @ [127:24] ==> public final fun forEach(p0: ((String..String?), List<(Method..Method?)>) -> Unit): Unit defined in kotlin.collections.Map[MyFunctionDescriptor]

'methods' @ [128:17] ==> value-parameter methods: List<(Method..Method?)> defined in net.corda.node.services.messaging.RPCServer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [128:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [129:23] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'name' @ [129:90] ==> value-parameter name: (String..String?) defined in net.corda.node.services.messaging.RPCServer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'ops' @ [129:100] ==> private final val ops: RPCOps defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'javaClass' @ [129:104] ==> public val <T : Any> RPCOps.javaClass: Class<RPCOps> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> RPCOps

'name' @ [129:114] ==> public final val <T : (Any..Any?)> Class<RPCOps>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> RPCOps

'methodTable' @ [132:9] ==> private final val methodTable: Map<String, Method> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'groupedMethods' @ [132:23] ==> val groupedMethods: Map<(String..String?), List<(Method..Method?)>> defined in net.corda.node.services.messaging.RPCServer.<init>[LocalVariableDescriptor]

'mapValues' @ [132:38] ==> public inline fun <K, V, R> Map<out String, List<(Method..Method?)>>.mapValues(transform: (Map.Entry<String, List<(Method..Method?)>>) -> (Method..Method?)): Map<String, (Method..Method?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<(java.lang.reflect.Method..java.lang.reflect.Method?)>
    <R> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'it' @ [132:50] ==> value-parameter it: Map.Entry<String, List<(Method..Method?)>> defined in net.corda.node.services.messaging.RPCServer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [132:53] ==> public abstract val value: List<(Method..Method?)> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'single' @ [132:59] ==> public fun <T> List<(Method..Method?)>.single(): (Method..Method?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'RemovalListener' @ [136:34] ==> @GwtCompatible public fun <K : (Any..Any?), V : (Any..Any?)> RemovalListener(function: ((RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>..RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>?)) -> Unit): RemovalListener<RPCApi.ObservableId, ObservableSubscription> defined in com.google.common.cache[SimpleFunctionDescriptorImpl]
Inferred types:
    <K : (Any..Any?)> -> ObservableId
    <V : (Any..Any?)> -> ObservableSubscription

'log' @ [137:13] ==> public final val log: Logger defined in net.corda.node.services.messaging.RPCServer.Companion[PropertyDescriptorImpl]

'debug' @ [137:17] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'it' @ [137:66] ==> value-parameter it: (RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>..RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>?) defined in net.corda.node.services.messaging.RPCServer.createObservableSubscriptionMap.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [137:69] ==> public open val key: (RPCApi.ObservableId..RPCApi.ObservableId?) defined in com.google.common.cache.RemovalNotification[JavaPropertyDescriptor]

'it' @ [137:87] ==> value-parameter it: (RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>..RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>?) defined in net.corda.node.services.messaging.RPCServer.createObservableSubscriptionMap.<anonymous>[ValueParameterDescriptorImpl]

'cause' @ [137:90] ==> public final val <K : (Any..Any?), V : (Any..Any?)> RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>.cause: (RemovalCause..RemovalCause?)[MyPropertyDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (net.corda.nodeapi.RPCApi.ObservableId..net.corda.nodeapi.RPCApi.ObservableId?)
    <V : (Any..Any?)> -> (net.corda.node.services.messaging.ObservableSubscription..net.corda.node.services.messaging.ObservableSubscription?)

'it' @ [138:13] ==> value-parameter it: (RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>..RemovalNotification<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>?) defined in net.corda.node.services.messaging.RPCServer.createObservableSubscriptionMap.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [138:16] ==> public open val value: (ObservableSubscription..ObservableSubscription?) defined in com.google.common.cache.RemovalNotification[JavaPropertyDescriptor]

'subscription' @ [138:22] ==> public final val subscription: Subscription defined in net.corda.node.services.messaging.ObservableSubscription[PropertyDescriptorImpl]

'unsubscribe' @ [138:35] ==> public abstract fun unsubscribe(): Unit defined in rx.Subscription[JavaMethodDescriptor]

'newBuilder' @ [140:29] ==> public open fun newBuilder(): (CacheBuilder<(Any..Any?), (Any..Any?)>..CacheBuilder<(Any..Any?), (Any..Any?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]

'removalListener' @ [140:42] ==> @CheckReturnValue public open fun <K1 : (Any..Any?), V1 : (Any..Any?)> removalListener(p0: (RemovalListener<in (RPCApi.ObservableId..RPCApi.ObservableId?), in (ObservableSubscription..ObservableSubscription?)>..RemovalListener<in (RPCApi.ObservableId..RPCApi.ObservableId?), in (ObservableSubscription..ObservableSubscription?)>?)): (CacheBuilder<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>..CacheBuilder<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]
Inferred types:
    <K1 : (Any..Any?)> -> ObservableId
    <V1 : (Any..Any?)> -> ObservableSubscription

'onObservableRemove' @ [140:58] ==> val onObservableRemove: RemovalListener<RPCApi.ObservableId, ObservableSubscription> defined in net.corda.node.services.messaging.RPCServer.createObservableSubscriptionMap[LocalVariableDescriptor]

'build' @ [140:78] ==> public open fun <K1 : (RPCApi.ObservableId..RPCApi.ObservableId?), V1 : (ObservableSubscription..ObservableSubscription?)> build(): (Cache<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>..Cache<(RPCApi.ObservableId..RPCApi.ObservableId?), (ObservableSubscription..ObservableSubscription?)>?) defined in com.google.common.cache.CacheBuilder[JavaMethodDescriptor]
Inferred types:
    <K1 : (RPCApi.ObservableId..RPCApi.ObservableId?)> -> ObservableId
    <V1 : (ObservableSubscription..ObservableSubscription?)> -> ObservableSubscription

'lifeCycle' @ [145:13] ==> private final val lifeCycle: LifeCycle<RPCServer.State> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'requireState' @ [145:23] ==> public final fun requireState(requiredState: RPCServer.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'UNSTARTED' @ [145:42] ==> enum entry UNSTARTED defined in net.corda.node.services.messaging.RPCServer.State[FakeCallableDescriptorForObject]

'log' @ [146:13] ==> public final val log: Logger defined in net.corda.node.services.messaging.RPCServer.Companion[PropertyDescriptorImpl]

'info' @ [146:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'rpcConfiguration' @ [146:63] ==> private final val rpcConfiguration: RPCServerConfiguration defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'observationSendExecutor' @ [147:13] ==> private final var observationSendExecutor: ExecutorService? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'newFixedThreadPool' @ [147:49] ==> public open fun newFixedThreadPool(p0: Int, p1: (ThreadFactory..ThreadFactory?)): (ExecutorService..ExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'ThreadFactoryBuilder' @ [149:21] ==> public constructor ThreadFactoryBuilder() defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaClassConstructorDescriptor]

'setNameFormat' @ [149:44] ==> public open fun setNameFormat(p0: (String..String?)): (ThreadFactoryBuilder..ThreadFactoryBuilder?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'build' @ [149:87] ==> @CheckReturnValue public open fun build(): (ThreadFactory..ThreadFactory?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'rpcExecutor' @ [151:13] ==> private final var rpcExecutor: ScheduledExecutorService? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'newScheduledThreadPool' @ [151:37] ==> public open fun newScheduledThreadPool(p0: Int, p1: (ThreadFactory..ThreadFactory?)): (ScheduledExecutorService..ScheduledExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'rpcConfiguration' @ [152:21] ==> private final val rpcConfiguration: RPCServerConfiguration defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'rpcThreadPoolSize' @ [152:38] ==> public final val rpcThreadPoolSize: Int defined in net.corda.node.services.messaging.RPCServerConfiguration[PropertyDescriptorImpl]

'ThreadFactoryBuilder' @ [153:21] ==> public constructor ThreadFactoryBuilder() defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaClassConstructorDescriptor]

'setNameFormat' @ [153:44] ==> public open fun setNameFormat(p0: (String..String?)): (ThreadFactoryBuilder..ThreadFactoryBuilder?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'build' @ [153:88] ==> @CheckReturnValue public open fun build(): (ThreadFactory..ThreadFactory?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'reaperExecutor' @ [155:13] ==> private final var reaperExecutor: ScheduledExecutorService? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'newScheduledThreadPool' @ [155:40] ==> public open fun newScheduledThreadPool(p0: Int, p1: (ThreadFactory..ThreadFactory?)): (ScheduledExecutorService..ScheduledExecutorService?) defined in java.util.concurrent.Executors[JavaMethodDescriptor]

'ThreadFactoryBuilder' @ [157:21] ==> public constructor ThreadFactoryBuilder() defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaClassConstructorDescriptor]

'setNameFormat' @ [157:44] ==> public open fun setNameFormat(p0: (String..String?)): (ThreadFactoryBuilder..ThreadFactoryBuilder?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'build' @ [157:82] ==> @CheckReturnValue public open fun build(): (ThreadFactory..ThreadFactory?) defined in com.google.common.util.concurrent.ThreadFactoryBuilder[JavaMethodDescriptor]

'reaperScheduledFuture' @ [159:13] ==> private final var reaperScheduledFuture: ScheduledFuture<*>? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'reaperExecutor' @ [159:37] ==> private final var reaperExecutor: ScheduledExecutorService? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'scheduleAtFixedRate' @ [159:54] ==> public final fun scheduleAtFixedRate(p0: (() -> Unit..(() -> Unit)?), p1: Long, p2: Long, p3: (TimeUnit..TimeUnit?)): (ScheduledFuture<*>..ScheduledFuture<*>?) defined in java.util.concurrent.ScheduledExecutorService[MyFunctionDescriptor]

'this' @ [160:21] ==> <this> defined in net.corda.node.services.messaging.RPCServer[LazyClassReceiverParameterDescriptor]

'rpcConfiguration' @ [161:21] ==> private final val rpcConfiguration: RPCServerConfiguration defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'reapInterval' @ [161:38] ==> public final val reapInterval: Duration defined in net.corda.node.services.messaging.RPCServerConfiguration[PropertyDescriptorImpl]

'toMillis' @ [161:51] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'rpcConfiguration' @ [162:21] ==> private final val rpcConfiguration: RPCServerConfiguration defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'reapInterval' @ [162:38] ==> public final val reapInterval: Duration defined in net.corda.node.services.messaging.RPCServerConfiguration[PropertyDescriptorImpl]

'toMillis' @ [162:51] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'MILLISECONDS' @ [163:30] ==> enum entry MILLISECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'createConsumerSessions' @ [165:28] ==> private final fun createConsumerSessions(): ArrayList<ClientSession> /* = ArrayList<ClientSession> */ defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'createNotificationConsumers' @ [166:13] ==> private final fun createNotificationConsumers(): Unit defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'serverControl' @ [167:13] ==> private final var serverControl: ActiveMQServerControl? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'activeMqServerControl' @ [167:29] ==> value-parameter activeMqServerControl: ActiveMQServerControl defined in net.corda.node.services.messaging.RPCServer.start[ValueParameterDescriptorImpl]

'lifeCycle' @ [168:13] ==> private final val lifeCycle: LifeCycle<RPCServer.State> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'transition' @ [168:23] ==> public final fun transition(from: RPCServer.State, to: RPCServer.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'UNSTARTED' @ [168:40] ==> enum entry UNSTARTED defined in net.corda.node.services.messaging.RPCServer.State[FakeCallableDescriptorForObject]

'STARTED' @ [168:57] ==> enum entry STARTED defined in net.corda.node.services.messaging.RPCServer.State[FakeCallableDescriptorForObject]

'sessions' @ [171:13] ==> val sessions: ArrayList<ClientSession> /* = ArrayList<ClientSession> */ defined in net.corda.node.services.messaging.RPCServer.start[LocalVariableDescriptor]

'forEach' @ [171:22] ==> @HidesMembers public inline fun <T> Iterable<ClientSession>.forEach(action: (ClientSession) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClientSession

'it' @ [172:17] ==> value-parameter it: ClientSession defined in net.corda.node.services.messaging.RPCServer.start.<anonymous>[ValueParameterDescriptorImpl]

'start' @ [172:20] ==> public abstract fun start(): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'close' @ [175:13] ==> public final fun close(): Unit defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'exception' @ [176:19] ==> val exception: Throwable defined in net.corda.node.services.messaging.RPCServer.start[LocalVariableDescriptor]

'ArrayList' @ [181:24] ==> public final fun <E> <init>(): ArrayList<ClientSession> /* = ArrayList<ClientSession> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> ClientSession

'..' @ [182:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'rpcConfiguration' @ [182:22] ==> private final val rpcConfiguration: RPCServerConfiguration defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'consumerPoolSize' @ [182:39] ==> public final val consumerPoolSize: Int defined in net.corda.node.services.messaging.RPCServerConfiguration[PropertyDescriptorImpl]

'serverLocator' @ [183:34] ==> private final val serverLocator: ServerLocator defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'createSessionFactory' @ [183:48] ==> public abstract fun createSessionFactory(): (ClientSessionFactory..ClientSessionFactory?) defined in org.apache.activemq.artemis.api.core.client.ServerLocator[JavaMethodDescriptor]

'sessionFactory' @ [184:27] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.node.services.messaging.RPCServer.createConsumerSessions[LocalVariableDescriptor]

'createSession' @ [184:42] ==> public abstract fun createSession(p0: (String..String?), p1: (String..String?), p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean, p6: Int): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'rpcServerUsername' @ [184:56] ==> private final val rpcServerUsername: String defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'rpcServerPassword' @ [184:75] ==> private final val rpcServerPassword: String defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'DEFAULT_ACK_BATCH_SIZE' @ [184:120] ==> public const final val DEFAULT_ACK_BATCH_SIZE: Int defined in org.apache.activemq.artemis.api.core.client.ActiveMQClient[JavaPropertyDescriptor]

'session' @ [185:28] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.RPCServer.createConsumerSessions[LocalVariableDescriptor]

'createConsumer' @ [185:36] ==> public abstract fun createConsumer(p0: (String..String?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'RPCApi' @ [185:51] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_SERVER_QUEUE_NAME' @ [185:58] ==> public final val RPC_SERVER_QUEUE_NAME: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'consumer' @ [186:13] ==> val consumer: (ClientConsumer..ClientConsumer?) defined in net.corda.node.services.messaging.RPCServer.createConsumerSessions[LocalVariableDescriptor]

'setMessageHandler' @ [186:22] ==> public final fun setMessageHandler(p0: (((ClientMessage..ClientMessage?)) -> Unit..(((ClientMessage..ClientMessage?)) -> Unit)?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientConsumer[MyFunctionDescriptor]

'this@RPCServer' @ [186:40] ==> <this> defined in net.corda.node.services.messaging.RPCServer[LazyClassReceiverParameterDescriptor]

'sessionAndConsumers' @ [187:13] ==> private final val sessionAndConsumers: ArrayList<ArtemisConsumer> /* = ArrayList<ArtemisConsumer> */ defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'add' @ [187:33] ==> public open fun add(element: ArtemisConsumer): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ArtemisConsumer' @ [187:37] ==> public constructor ArtemisConsumer(sessionFactory: ClientSessionFactory, session: ClientSession, consumer: ClientConsumer) defined in net.corda.nodeapi.ArtemisConsumer[DeserializedClassConstructorDescriptor]

'sessionFactory' @ [187:53] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.node.services.messaging.RPCServer.createConsumerSessions[LocalVariableDescriptor]

'session' @ [187:69] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.RPCServer.createConsumerSessions[LocalVariableDescriptor]

'consumer' @ [187:78] ==> val consumer: (ClientConsumer..ClientConsumer?) defined in net.corda.node.services.messaging.RPCServer.createConsumerSessions[LocalVariableDescriptor]

'sessions' @ [188:13] ==> val sessions: ArrayList<ClientSession> /* = ArrayList<ClientSession> */ defined in net.corda.node.services.messaging.RPCServer.createConsumerSessions[LocalVariableDescriptor]

'add' @ [188:22] ==> public open fun add(element: ClientSession): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'session' @ [188:26] ==> val session: (ClientSession..ClientSession?) defined in net.corda.node.services.messaging.RPCServer.createConsumerSessions[LocalVariableDescriptor]

'sessions' @ [190:16] ==> val sessions: ArrayList<ClientSession> /* = ArrayList<ClientSession> */ defined in net.corda.node.services.messaging.RPCServer.createConsumerSessions[LocalVariableDescriptor]

'clientBindingRemovalConsumer' @ [194:9] ==> private final var clientBindingRemovalConsumer: ClientConsumer? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'sessionAndConsumers' @ [194:40] ==> private final val sessionAndConsumers: ArrayList<ArtemisConsumer> /* = ArrayList<ArtemisConsumer> */ defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'session' @ [194:63] ==> public final val session: ClientSession defined in net.corda.nodeapi.ArtemisConsumer[DeserializedPropertyDescriptor]

'createConsumer' @ [194:71] ==> public abstract fun createConsumer(p0: (String..String?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'RPCApi' @ [194:86] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_CLIENT_BINDING_REMOVALS' @ [194:93] ==> public final val RPC_CLIENT_BINDING_REMOVALS: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'clientBindingRemovalConsumer' @ [195:9] ==> private final var clientBindingRemovalConsumer: ClientConsumer? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'setMessageHandler' @ [195:40] ==> public final fun setMessageHandler(p0: (((ClientMessage..ClientMessage?)) -> Unit..(((ClientMessage..ClientMessage?)) -> Unit)?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientConsumer[MyFunctionDescriptor]

'this' @ [195:58] ==> <this> defined in net.corda.node.services.messaging.RPCServer[LazyClassReceiverParameterDescriptor]

'clientBindingAdditionConsumer' @ [196:9] ==> private final var clientBindingAdditionConsumer: ClientConsumer? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'sessionAndConsumers' @ [196:41] ==> private final val sessionAndConsumers: ArrayList<ArtemisConsumer> /* = ArrayList<ArtemisConsumer> */ defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'session' @ [196:64] ==> public final val session: ClientSession defined in net.corda.nodeapi.ArtemisConsumer[DeserializedPropertyDescriptor]

'createConsumer' @ [196:72] ==> public abstract fun createConsumer(p0: (String..String?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'RPCApi' @ [196:87] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RPC_CLIENT_BINDING_ADDITIONS' @ [196:94] ==> public final val RPC_CLIENT_BINDING_ADDITIONS: String defined in net.corda.nodeapi.RPCApi[DeserializedPropertyDescriptor]

'clientBindingAdditionConsumer' @ [197:9] ==> private final var clientBindingAdditionConsumer: ClientConsumer? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'setMessageHandler' @ [197:41] ==> public final fun setMessageHandler(p0: (((ClientMessage..ClientMessage?)) -> Unit..(((ClientMessage..ClientMessage?)) -> Unit)?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientConsumer[MyFunctionDescriptor]

'this' @ [197:59] ==> <this> defined in net.corda.node.services.messaging.RPCServer[LazyClassReceiverParameterDescriptor]

'reaperScheduledFuture' @ [201:9] ==> private final var reaperScheduledFuture: ScheduledFuture<*>? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'cancel' @ [201:32] ==> public abstract fun cancel(p0: Boolean): Boolean defined in java.util.concurrent.ScheduledFuture[JavaMethodDescriptor]

'rpcExecutor' @ [202:9] ==> private final var rpcExecutor: ScheduledExecutorService? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'shutdownNow' @ [202:22] ==> public abstract fun shutdownNow(): (MutableList<(Runnable..Runnable?)>..List<(Runnable..Runnable?)>?) defined in java.util.concurrent.ScheduledExecutorService[JavaMethodDescriptor]

'reaperExecutor' @ [203:9] ==> private final var reaperExecutor: ScheduledExecutorService? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'shutdownNow' @ [203:25] ==> public abstract fun shutdownNow(): (MutableList<(Runnable..Runnable?)>..List<(Runnable..Runnable?)>?) defined in java.util.concurrent.ScheduledExecutorService[JavaMethodDescriptor]

'sessionAndConsumers' @ [204:9] ==> private final val sessionAndConsumers: ArrayList<ArtemisConsumer> /* = ArrayList<ArtemisConsumer> */ defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'forEach' @ [204:29] ==> @HidesMembers public inline fun <T> Iterable<ArtemisConsumer>.forEach(action: (ArtemisConsumer) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArtemisConsumer

'it' @ [205:13] ==> value-parameter it: ArtemisConsumer defined in net.corda.node.services.messaging.RPCServer.close.<anonymous>[ValueParameterDescriptorImpl]

'sessionFactory' @ [205:16] ==> public final val sessionFactory: ClientSessionFactory defined in net.corda.nodeapi.ArtemisConsumer[DeserializedPropertyDescriptor]

'close' @ [205:31] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'observableMap' @ [207:9] ==> private final val observableMap: ObservableSubscriptionMap /* = Cache<RPCApi.ObservableId, ObservableSubscription> */ defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'invalidateAll' @ [207:23] ==> public abstract fun invalidateAll(): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'reapSubscriptions' @ [208:9] ==> private final fun reapSubscriptions(): Unit defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'sessionAndProducerPool' @ [209:9] ==> private final val sessionAndProducerPool: LazyStickyPool<ArtemisProducer> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'close' @ [209:32] ==> public final fun close(): Iterable<ArtemisProducer> defined in net.corda.core.internal.LazyStickyPool[DeserializedSimpleFunctionDescriptor]

'forEach' @ [209:40] ==> @HidesMembers public inline fun <T> Iterable<ArtemisProducer>.forEach(action: (ArtemisProducer) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArtemisProducer

'it' @ [210:13] ==> value-parameter it: ArtemisProducer defined in net.corda.node.services.messaging.RPCServer.close.<anonymous>[ValueParameterDescriptorImpl]

'sessionFactory' @ [210:16] ==> public final val sessionFactory: ClientSessionFactory defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'close' @ [210:31] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'lifeCycle' @ [212:9] ==> private final val lifeCycle: LifeCycle<RPCServer.State> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'justTransition' @ [212:19] ==> public final fun justTransition(to: RPCServer.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'FINISHED' @ [212:40] ==> enum entry FINISHED defined in net.corda.node.services.messaging.RPCServer.State[FakeCallableDescriptorForObject]

'lifeCycle' @ [216:9] ==> private final val lifeCycle: LifeCycle<RPCServer.State> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'requireState' @ [216:19] ==> public final fun requireState(requiredState: RPCServer.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'STARTED' @ [216:38] ==> enum entry STARTED defined in net.corda.node.services.messaging.RPCServer.State[FakeCallableDescriptorForObject]

'artemisMessage' @ [217:32] ==> value-parameter artemisMessage: ClientMessage defined in net.corda.node.services.messaging.RPCServer.bindingRemovalArtemisMessageHandler[ValueParameterDescriptorImpl]

'getStringProperty' @ [217:47] ==> public abstract fun getStringProperty(p0: (SimpleString..SimpleString?)): (String..String?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'HDR_NOTIFICATION_TYPE' @ [217:82] ==> public final val HDR_NOTIFICATION_TYPE: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.management.ManagementHelper[JavaPropertyDescriptor]

'require' @ [218:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notificationType' @ [218:17] ==> val notificationType: (String..String?) defined in net.corda.node.services.messaging.RPCServer.bindingRemovalArtemisMessageHandler[LocalVariableDescriptor]

'name' @ [218:74] ==> public final val name: String defined in org.apache.activemq.artemis.api.core.management.CoreNotificationType[DeserializedPropertyDescriptor]

'artemisMessage' @ [219:29] ==> value-parameter artemisMessage: ClientMessage defined in net.corda.node.services.messaging.RPCServer.bindingRemovalArtemisMessageHandler[ValueParameterDescriptorImpl]

'getStringProperty' @ [219:44] ==> public abstract fun getStringProperty(p0: (SimpleString..SimpleString?)): (String..String?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'HDR_ROUTING_NAME' @ [219:79] ==> public final val HDR_ROUTING_NAME: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.management.ManagementHelper[JavaPropertyDescriptor]

'log' @ [220:9] ==> public final val log: Logger defined in net.corda.node.services.messaging.RPCServer.Companion[PropertyDescriptorImpl]

'warn' @ [220:13] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'clientAddress' @ [220:62] ==> val clientAddress: (String..String?) defined in net.corda.node.services.messaging.RPCServer.bindingRemovalArtemisMessageHandler[LocalVariableDescriptor]

'invalidateClient' @ [221:9] ==> private final fun invalidateClient(clientAddress: SimpleString): Unit defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'SimpleString' @ [221:26] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'clientAddress' @ [221:39] ==> val clientAddress: (String..String?) defined in net.corda.node.services.messaging.RPCServer.bindingRemovalArtemisMessageHandler[LocalVariableDescriptor]

'lifeCycle' @ [225:9] ==> private final val lifeCycle: LifeCycle<RPCServer.State> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'requireState' @ [225:19] ==> public final fun requireState(requiredState: RPCServer.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'STARTED' @ [225:38] ==> enum entry STARTED defined in net.corda.node.services.messaging.RPCServer.State[FakeCallableDescriptorForObject]

'artemisMessage' @ [226:32] ==> value-parameter artemisMessage: ClientMessage defined in net.corda.node.services.messaging.RPCServer.bindingAdditionArtemisMessageHandler[ValueParameterDescriptorImpl]

'getStringProperty' @ [226:47] ==> public abstract fun getStringProperty(p0: (SimpleString..SimpleString?)): (String..String?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'HDR_NOTIFICATION_TYPE' @ [226:82] ==> public final val HDR_NOTIFICATION_TYPE: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.management.ManagementHelper[JavaPropertyDescriptor]

'require' @ [227:9] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'notificationType' @ [227:17] ==> val notificationType: (String..String?) defined in net.corda.node.services.messaging.RPCServer.bindingAdditionArtemisMessageHandler[LocalVariableDescriptor]

'name' @ [227:72] ==> public final val name: String defined in org.apache.activemq.artemis.api.core.management.CoreNotificationType[DeserializedPropertyDescriptor]

'SimpleString' @ [228:29] ==> public constructor SimpleString(p0: (String..String?)) defined in org.apache.activemq.artemis.api.core.SimpleString[JavaClassConstructorDescriptor]

'artemisMessage' @ [228:42] ==> value-parameter artemisMessage: ClientMessage defined in net.corda.node.services.messaging.RPCServer.bindingAdditionArtemisMessageHandler[ValueParameterDescriptorImpl]

'getStringProperty' @ [228:57] ==> public abstract fun getStringProperty(p0: (SimpleString..SimpleString?)): (String..String?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'HDR_ROUTING_NAME' @ [228:92] ==> public final val HDR_ROUTING_NAME: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.management.ManagementHelper[JavaPropertyDescriptor]

'log' @ [229:9] ==> public final val log: Logger defined in net.corda.node.services.messaging.RPCServer.Companion[PropertyDescriptorImpl]

'debug' @ [229:13] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'clientAddress' @ [229:57] ==> val clientAddress: SimpleString defined in net.corda.node.services.messaging.RPCServer.bindingAdditionArtemisMessageHandler[LocalVariableDescriptor]

'stopBuffering' @ [231:22] ==> private final fun stopBuffering(clientAddress: SimpleString): RPCServer.BufferOrNone.Buffer? defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'clientAddress' @ [231:36] ==> val clientAddress: SimpleString defined in net.corda.node.services.messaging.RPCServer.bindingAdditionArtemisMessageHandler[LocalVariableDescriptor]

'buffer' @ [232:9] ==> val buffer: RPCServer.BufferOrNone.Buffer? defined in net.corda.node.services.messaging.RPCServer.bindingAdditionArtemisMessageHandler[LocalVariableDescriptor]

'let' @ [232:17] ==> @InlineOnly public inline fun <T, R> RPCServer.BufferOrNone.Buffer.let(block: (RPCServer.BufferOrNone.Buffer) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Buffer
    <R> -> Unit

'drainBuffer' @ [232:23] ==> private final fun drainBuffer(buffer: RPCServer.BufferOrNone.Buffer): Unit defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'it' @ [232:35] ==> value-parameter it: RPCServer.BufferOrNone.Buffer defined in net.corda.node.services.messaging.RPCServer.bindingAdditionArtemisMessageHandler.<anonymous>[ValueParameterDescriptorImpl]

'responseMessageBuffer' @ [240:16] ==> private final val responseMessageBuffer: ConcurrentHashMap<SimpleString, RPCServer.BufferOrNone> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'put' @ [240:38] ==> public open fun put(key: SimpleString, value: RPCServer.BufferOrNone): RPCServer.BufferOrNone? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'clientAddress' @ [240:42] ==> value-parameter clientAddress: SimpleString defined in net.corda.node.services.messaging.RPCServer.stopBuffering[ValueParameterDescriptorImpl]

'None' @ [240:70] ==> public object None : RPCServer.BufferOrNone defined in net.corda.node.services.messaging.RPCServer.BufferOrNone[FakeCallableDescriptorForObject]

'buffer' @ [244:9] ==> value-parameter buffer: RPCServer.BufferOrNone.Buffer defined in net.corda.node.services.messaging.RPCServer.drainBuffer[ValueParameterDescriptorImpl]

'container' @ [244:16] ==> public final val container: MutableCollection<RPCServer.MessageAndContext> defined in net.corda.node.services.messaging.RPCServer.BufferOrNone.Buffer[PropertyDescriptorImpl]

'forEach' @ [244:26] ==> @HidesMembers public inline fun <T> Iterable<RPCServer.MessageAndContext>.forEach(action: (RPCServer.MessageAndContext) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageAndContext

'it' @ [245:13] ==> value-parameter it: RPCServer.MessageAndContext defined in net.corda.node.services.messaging.RPCServer.drainBuffer.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [245:16] ==> public final val context: ObservableContext defined in net.corda.node.services.messaging.RPCServer.MessageAndContext[PropertyDescriptorImpl]

'sendMessage' @ [245:24] ==> public final fun sendMessage(serverToClient: RPCApi.ServerToClient): Unit defined in net.corda.node.services.messaging.ObservableContext[SimpleFunctionDescriptorImpl]

'it' @ [245:36] ==> value-parameter it: RPCServer.MessageAndContext defined in net.corda.node.services.messaging.RPCServer.drainBuffer.<anonymous>[ValueParameterDescriptorImpl]

'message' @ [245:39] ==> public final val message: RPCApi.ServerToClient.RpcReply defined in net.corda.node.services.messaging.RPCServer.MessageAndContext[PropertyDescriptorImpl]

'lifeCycle' @ [252:9] ==> private final val lifeCycle: LifeCycle<RPCServer.State> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'requireState' @ [252:19] ==> public final fun requireState(requiredState: RPCServer.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'STARTED' @ [252:38] ==> enum entry STARTED defined in net.corda.node.services.messaging.RPCServer.State[FakeCallableDescriptorForObject]

'clientAddressToObservables' @ [253:29] ==> private final val clientAddressToObservables: (SetMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>..SetMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>?) defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'removeAll' @ [253:56] ==> @CanIgnoreReturnValue public abstract fun removeAll(@Nullable p0: Any?): (MutableSet<(RPCApi.ObservableId..RPCApi.ObservableId?)>..Set<(RPCApi.ObservableId..RPCApi.ObservableId?)>?) defined in com.google.common.collect.SetMultimap[JavaMethodDescriptor]

'clientAddress' @ [253:66] ==> value-parameter clientAddress: SimpleString defined in net.corda.node.services.messaging.RPCServer.invalidateClient[ValueParameterDescriptorImpl]

'observableMap' @ [254:9] ==> private final val observableMap: ObservableSubscriptionMap /* = Cache<RPCApi.ObservableId, ObservableSubscription> */ defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'invalidateAll' @ [254:23] ==> public abstract fun invalidateAll(p0: (MutableIterable<*>..Iterable<*>?)): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'observableIds' @ [254:37] ==> val observableIds: (MutableSet<(RPCApi.ObservableId..RPCApi.ObservableId?)>..Set<(RPCApi.ObservableId..RPCApi.ObservableId?)>?) defined in net.corda.node.services.messaging.RPCServer.invalidateClient[LocalVariableDescriptor]

'responseMessageBuffer' @ [255:9] ==> private final val responseMessageBuffer: ConcurrentHashMap<SimpleString, RPCServer.BufferOrNone> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'remove' @ [255:31] ==> public open fun remove(key: SimpleString): RPCServer.BufferOrNone? defined in java.util.concurrent.ConcurrentHashMap[JavaMethodDescriptor]

'clientAddress' @ [255:38] ==> value-parameter clientAddress: SimpleString defined in net.corda.node.services.messaging.RPCServer.invalidateClient[ValueParameterDescriptorImpl]

'lifeCycle' @ [259:9] ==> private final val lifeCycle: LifeCycle<RPCServer.State> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'requireState' @ [259:19] ==> public final fun requireState(requiredState: RPCServer.State): Unit defined in net.corda.core.internal.LifeCycle[DeserializedSimpleFunctionDescriptor]

'STARTED' @ [259:38] ==> enum entry STARTED defined in net.corda.node.services.messaging.RPCServer.State[FakeCallableDescriptorForObject]

'RPCApi' @ [260:30] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'fromClientMessage' @ [260:52] ==> public final fun fromClientMessage(context: SerializationContext, message: ClientMessage): RPCApi.ClientToServer defined in net.corda.nodeapi.RPCApi.ClientToServer.Companion[DeserializedSimpleFunctionDescriptor]

'RPC_SERVER_CONTEXT' @ [260:70] ==> public final var RPC_SERVER_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'artemisMessage' @ [260:90] ==> value-parameter artemisMessage: ClientMessage defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[ValueParameterDescriptorImpl]

'log' @ [261:9] ==> public final val log: Logger defined in net.corda.node.services.messaging.RPCServer.Companion[PropertyDescriptorImpl]

'debug' @ [261:13] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'clientToServer' @ [261:33] ==> val clientToServer: RPCApi.ClientToServer defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[LocalVariableDescriptor]

'when (clientToServer) {
            is RPCApi.ClientToServer.RpcRequest -> {
                val rpcContext = RpcContext(
                        currentUser = getUser(artemisMessage)
                )
                rpcExecutor!!.submit {
                    val result = invokeRpc(rpcContext, clientToServer.methodName, clientToServer.arguments)
                    sendReply(clientToServer.id, clientToServer.clientAddress, result)
                }
            }
            is RPCApi.ClientToServer.ObservablesClosed -> {
                observableMap.invalidateAll(clientToServer.ids)
            }
        }' @ [262:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'clientToServer' @ [262:15] ==> val clientToServer: RPCApi.ClientToServer defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[LocalVariableDescriptor]

'RpcContext' @ [264:34] ==> public constructor RpcContext(currentUser: User) defined in net.corda.node.services.messaging.RpcContext[ClassConstructorDescriptorImpl]

'getUser' @ [265:39] ==> private final fun getUser(message: ClientMessage): User defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'artemisMessage' @ [265:47] ==> value-parameter artemisMessage: ClientMessage defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[ValueParameterDescriptorImpl]

'rpcExecutor' @ [267:17] ==> private final var rpcExecutor: ScheduledExecutorService? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'submit' @ [267:31] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ScheduledExecutorService[MyFunctionDescriptor]

'invokeRpc' @ [268:34] ==> private final fun invokeRpc(rpcContext: RpcContext, methodName: String, arguments: List<Any?>): Try<Any> defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'rpcContext' @ [268:44] ==> val rpcContext: RpcContext defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[LocalVariableDescriptor]

'clientToServer' @ [268:56] ==> val clientToServer: RPCApi.ClientToServer defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[LocalVariableDescriptor]

'methodName' @ [268:71] ==> public final val methodName: String defined in net.corda.nodeapi.RPCApi.ClientToServer.RpcRequest[DeserializedPropertyDescriptor]

'clientToServer' @ [268:83] ==> val clientToServer: RPCApi.ClientToServer defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[LocalVariableDescriptor]

'arguments' @ [268:98] ==> public final val arguments: List<Any?> defined in net.corda.nodeapi.RPCApi.ClientToServer.RpcRequest[DeserializedPropertyDescriptor]

'sendReply' @ [269:21] ==> private final fun sendReply(requestId: RPCApi.RpcRequestId, clientAddress: SimpleString, result: Try<Any>): Unit defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'clientToServer' @ [269:31] ==> val clientToServer: RPCApi.ClientToServer defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[LocalVariableDescriptor]

'id' @ [269:46] ==> public final val id: RPCApi.RpcRequestId defined in net.corda.nodeapi.RPCApi.ClientToServer.RpcRequest[DeserializedPropertyDescriptor]

'clientToServer' @ [269:50] ==> val clientToServer: RPCApi.ClientToServer defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[LocalVariableDescriptor]

'clientAddress' @ [269:65] ==> public final val clientAddress: SimpleString defined in net.corda.nodeapi.RPCApi.ClientToServer.RpcRequest[DeserializedPropertyDescriptor]

'result' @ [269:80] ==> val result: Try<Any> defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler.<anonymous>[LocalVariableDescriptor]

'observableMap' @ [273:17] ==> private final val observableMap: ObservableSubscriptionMap /* = Cache<RPCApi.ObservableId, ObservableSubscription> */ defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'invalidateAll' @ [273:31] ==> public abstract fun invalidateAll(p0: (MutableIterable<*>..Iterable<*>?)): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'clientToServer' @ [273:45] ==> val clientToServer: RPCApi.ClientToServer defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[LocalVariableDescriptor]

'ids' @ [273:60] ==> public final val ids: List<RPCApi.ObservableId> defined in net.corda.nodeapi.RPCApi.ClientToServer.ObservablesClosed[DeserializedPropertyDescriptor]

'artemisMessage' @ [276:9] ==> value-parameter artemisMessage: ClientMessage defined in net.corda.node.services.messaging.RPCServer.clientArtemisMessageHandler[ValueParameterDescriptorImpl]

'acknowledge' @ [276:24] ==> public abstract fun acknowledge(): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'Try' @ [280:16] ==> public companion object defined in net.corda.core.utilities.Try[FakeCallableDescriptorForObject]

'on' @ [280:20] ==> @JvmStatic public final inline fun <T> on(body: () -> (Any..Any?)): Try<(Any..Any?)> defined in net.corda.core.utilities.Try.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'CURRENT_RPC_CONTEXT' @ [282:17] ==> @JvmField internal val CURRENT_RPC_CONTEXT: ThreadLocal<RpcContext> defined in net.corda.node.services.messaging in file RPCServer.kt[PropertyDescriptorImpl]

'set' @ [282:37] ==> public open fun set(p0: (RpcContext..RpcContext?)): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'rpcContext' @ [282:41] ==> value-parameter rpcContext: RpcContext defined in net.corda.node.services.messaging.RPCServer.invokeRpc[ValueParameterDescriptorImpl]

'log' @ [283:17] ==> public final val log: Logger defined in net.corda.node.services.messaging.RPCServer.Companion[PropertyDescriptorImpl]

'debug' @ [283:21] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'methodName' @ [283:39] ==> value-parameter methodName: String defined in net.corda.node.services.messaging.RPCServer.invokeRpc[ValueParameterDescriptorImpl]

'methodTable' @ [284:30] ==> private final val methodTable: Map<String, Method> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'methodName' @ [284:42] ==> value-parameter methodName: String defined in net.corda.node.services.messaging.RPCServer.invokeRpc[ValueParameterDescriptorImpl]

'RPCException' @ [285:31] ==> public constructor RPCException(msg: String) defined in net.corda.nodeapi.RPCException[DeserializedClassConstructorDescriptor]

'methodName' @ [285:78] ==> value-parameter methodName: String defined in net.corda.node.services.messaging.RPCServer.invokeRpc[ValueParameterDescriptorImpl]

'method' @ [286:17] ==> val method: Method defined in net.corda.node.services.messaging.RPCServer.invokeRpc.<anonymous>[LocalVariableDescriptor]

'invoke' @ [286:24] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'ops' @ [286:31] ==> private final val ops: RPCOps defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'arguments' @ [286:37] ==> value-parameter arguments: List<Any?> defined in net.corda.node.services.messaging.RPCServer.invokeRpc[ValueParameterDescriptorImpl]

'toTypedArray' @ [286:47] ==> public inline fun <reified T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'e' @ [288:23] ==> val e: InvocationTargetException defined in net.corda.node.services.messaging.RPCServer.invokeRpc.<anonymous>[LocalVariableDescriptor]

'cause' @ [288:25] ==> public open val cause: Throwable? defined in java.lang.reflect.InvocationTargetException[JavaPropertyDescriptor]

'RPCException' @ [288:34] ==> public constructor RPCException(msg: String) defined in net.corda.nodeapi.RPCException[DeserializedClassConstructorDescriptor]

'CURRENT_RPC_CONTEXT' @ [290:17] ==> @JvmField internal val CURRENT_RPC_CONTEXT: ThreadLocal<RpcContext> defined in net.corda.node.services.messaging in file RPCServer.kt[PropertyDescriptorImpl]

'remove' @ [290:37] ==> public open fun remove(): Unit defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'RPCApi' @ [296:21] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'RpcReply' @ [296:43] ==> public constructor RpcReply(id: RPCApi.RpcRequestId, result: Try<Any?>) defined in net.corda.nodeapi.RPCApi.ServerToClient.RpcReply[DeserializedClassConstructorDescriptor]

'requestId' @ [296:52] ==> value-parameter requestId: RPCApi.RpcRequestId defined in net.corda.node.services.messaging.RPCServer.sendReply[ValueParameterDescriptorImpl]

'result' @ [296:63] ==> value-parameter result: Try<Any> defined in net.corda.node.services.messaging.RPCServer.sendReply[ValueParameterDescriptorImpl]

'ObservableContext' @ [297:33] ==> public constructor ObservableContext(rpcRequestId: RPCApi.RpcRequestId, observableMap: ObservableSubscriptionMap /* = Cache<RPCApi.ObservableId, ObservableSubscription> */, clientAddressToObservables: SetMultimap<SimpleString, RPCApi.ObservableId>, clientAddress: SimpleString, serverControl: ActiveMQServerControl, sessionAndProducerPool: LazyStickyPool<ArtemisProducer>, observationSendExecutor: ExecutorService) defined in net.corda.node.services.messaging.ObservableContext[ClassConstructorDescriptorImpl]

'requestId' @ [298:17] ==> value-parameter requestId: RPCApi.RpcRequestId defined in net.corda.node.services.messaging.RPCServer.sendReply[ValueParameterDescriptorImpl]

'observableMap' @ [299:17] ==> private final val observableMap: ObservableSubscriptionMap /* = Cache<RPCApi.ObservableId, ObservableSubscription> */ defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'clientAddressToObservables' @ [300:17] ==> private final val clientAddressToObservables: (SetMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>..SetMultimap<(SimpleString..SimpleString?), (RPCApi.ObservableId..RPCApi.ObservableId?)>?) defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'clientAddress' @ [301:17] ==> value-parameter clientAddress: SimpleString defined in net.corda.node.services.messaging.RPCServer.sendReply[ValueParameterDescriptorImpl]

'serverControl' @ [302:17] ==> private final var serverControl: ActiveMQServerControl? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'sessionAndProducerPool' @ [303:17] ==> private final val sessionAndProducerPool: LazyStickyPool<ArtemisProducer> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'observationSendExecutor' @ [304:17] ==> private final var observationSendExecutor: ExecutorService? defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'bufferIfQueueNotBound' @ [307:24] ==> private final fun bufferIfQueueNotBound(clientAddress: SimpleString, message: RPCApi.ServerToClient.RpcReply, context: ObservableContext): Boolean defined in net.corda.node.services.messaging.RPCServer[SimpleFunctionDescriptorImpl]

'clientAddress' @ [307:46] ==> value-parameter clientAddress: SimpleString defined in net.corda.node.services.messaging.RPCServer.sendReply[ValueParameterDescriptorImpl]

'reply' @ [307:61] ==> val reply: RPCApi.ServerToClient.RpcReply defined in net.corda.node.services.messaging.RPCServer.sendReply[LocalVariableDescriptor]

'observableContext' @ [307:68] ==> val observableContext: ObservableContext defined in net.corda.node.services.messaging.RPCServer.sendReply[LocalVariableDescriptor]

'!' @ [308:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'buffered' @ [308:14] ==> val buffered: Boolean defined in net.corda.node.services.messaging.RPCServer.sendReply[LocalVariableDescriptor]

'observableContext' @ [308:24] ==> val observableContext: ObservableContext defined in net.corda.node.services.messaging.RPCServer.sendReply[LocalVariableDescriptor]

'sendMessage' @ [308:42] ==> public final fun sendMessage(serverToClient: RPCApi.ServerToClient): Unit defined in net.corda.node.services.messaging.ObservableContext[SimpleFunctionDescriptorImpl]

'reply' @ [308:54] ==> val reply: RPCApi.ServerToClient.RpcReply defined in net.corda.node.services.messaging.RPCServer.sendReply[LocalVariableDescriptor]

'responseMessageBuffer' @ [319:28] ==> private final val responseMessageBuffer: ConcurrentHashMap<SimpleString, RPCServer.BufferOrNone> defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'compute' @ [319:50] ==> public final fun compute(p0: SimpleString, p1: (SimpleString, RPCServer.BufferOrNone?) -> RPCServer.BufferOrNone?): RPCServer.BufferOrNone? defined in java.util.concurrent.ConcurrentHashMap[MyFunctionDescriptor]

'clientAddress' @ [319:58] ==> value-parameter clientAddress: SimpleString defined in net.corda.node.services.messaging.RPCServer.bufferIfQueueNotBound[ValueParameterDescriptorImpl]

'when (value) {
                null -> BufferOrNone.Buffer(ArrayList<MessageAndContext>()).apply {
                    container.add(MessageAndContext(message, context))
                }
                is BufferOrNone.Buffer -> value.apply {
                    container.add(MessageAndContext(message, context))
                }
                is BufferOrNone.None -> value
            }' @ [320:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: RPCServer.BufferOrNone?, entry1: RPCServer.BufferOrNone?, entry2: RPCServer.BufferOrNone?): RPCServer.BufferOrNone?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> BufferOrNone?

'value' @ [320:19] ==> value-parameter value: RPCServer.BufferOrNone? defined in net.corda.node.services.messaging.RPCServer.bufferIfQueueNotBound.<anonymous>[ValueParameterDescriptorImpl]

'Buffer' @ [321:38] ==> public constructor Buffer(container: MutableCollection<RPCServer.MessageAndContext>) defined in net.corda.node.services.messaging.RPCServer.BufferOrNone.Buffer[ClassConstructorDescriptorImpl]

'ArrayList' @ [321:45] ==> public final fun <E> <init>(): ArrayList<RPCServer.MessageAndContext> /* = ArrayList<RPCServer.MessageAndContext> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> MessageAndContext

'apply' @ [321:77] ==> @InlineOnly public inline fun <T> RPCServer.BufferOrNone.Buffer.apply(block: RPCServer.BufferOrNone.Buffer.() -> Unit): RPCServer.BufferOrNone.Buffer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Buffer

'container' @ [322:21] ==> public final val container: MutableCollection<RPCServer.MessageAndContext> defined in net.corda.node.services.messaging.RPCServer.BufferOrNone.Buffer[PropertyDescriptorImpl]

'add' @ [322:31] ==> public abstract fun add(element: RPCServer.MessageAndContext): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'MessageAndContext' @ [322:35] ==> public constructor MessageAndContext(message: RPCApi.ServerToClient.RpcReply, context: ObservableContext) defined in net.corda.node.services.messaging.RPCServer.MessageAndContext[ClassConstructorDescriptorImpl]

'message' @ [322:53] ==> value-parameter message: RPCApi.ServerToClient.RpcReply defined in net.corda.node.services.messaging.RPCServer.bufferIfQueueNotBound[ValueParameterDescriptorImpl]

'context' @ [322:62] ==> value-parameter context: ObservableContext defined in net.corda.node.services.messaging.RPCServer.bufferIfQueueNotBound[ValueParameterDescriptorImpl]

'value' @ [324:43] ==> value-parameter value: RPCServer.BufferOrNone? defined in net.corda.node.services.messaging.RPCServer.bufferIfQueueNotBound.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [324:49] ==> @InlineOnly public inline fun <T> RPCServer.BufferOrNone.Buffer.apply(block: RPCServer.BufferOrNone.Buffer.() -> Unit): RPCServer.BufferOrNone.Buffer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Buffer

'container' @ [325:21] ==> public final val container: MutableCollection<RPCServer.MessageAndContext> defined in net.corda.node.services.messaging.RPCServer.BufferOrNone.Buffer[PropertyDescriptorImpl]

'add' @ [325:31] ==> public abstract fun add(element: RPCServer.MessageAndContext): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'MessageAndContext' @ [325:35] ==> public constructor MessageAndContext(message: RPCApi.ServerToClient.RpcReply, context: ObservableContext) defined in net.corda.node.services.messaging.RPCServer.MessageAndContext[ClassConstructorDescriptorImpl]

'message' @ [325:53] ==> value-parameter message: RPCApi.ServerToClient.RpcReply defined in net.corda.node.services.messaging.RPCServer.bufferIfQueueNotBound[ValueParameterDescriptorImpl]

'context' @ [325:62] ==> value-parameter context: ObservableContext defined in net.corda.node.services.messaging.RPCServer.bufferIfQueueNotBound[ValueParameterDescriptorImpl]

'value' @ [327:41] ==> value-parameter value: RPCServer.BufferOrNone? defined in net.corda.node.services.messaging.RPCServer.bufferIfQueueNotBound.<anonymous>[ValueParameterDescriptorImpl]

'clientBuffer' @ [330:16] ==> val clientBuffer: RPCServer.BufferOrNone? defined in net.corda.node.services.messaging.RPCServer.bufferIfQueueNotBound[LocalVariableDescriptor]

'observableMap' @ [334:9] ==> private final val observableMap: ObservableSubscriptionMap /* = Cache<RPCApi.ObservableId, ObservableSubscription> */ defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'cleanUp' @ [334:23] ==> public abstract fun cleanUp(): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'User' @ [338:28] ==> public constructor User(username: String, password: String, permissions: Set<String>) defined in net.corda.nodeapi.User[DeserializedClassConstructorDescriptor]

'NODE_USER' @ [338:33] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[PropertyImportedFromObject]

'NODE_USER' @ [338:44] ==> public const final val NODE_USER: String defined in net.corda.nodeapi.ArtemisMessagingComponent.Companion[PropertyImportedFromObject]

'setOf' @ [338:55] ==> @InlineOnly public inline fun <T> setOf(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'message' @ [340:29] ==> value-parameter message: ClientMessage defined in net.corda.node.services.messaging.RPCServer.getUser[ValueParameterDescriptorImpl]

'getStringProperty' @ [340:37] ==> public abstract fun getStringProperty(p0: (SimpleString..SimpleString?)): (String..String?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'HDR_VALIDATED_USER' @ [340:63] ==> public final val HDR_VALIDATED_USER: (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.api.core.Message[JavaPropertyDescriptor]

'IllegalArgumentException' @ [340:92] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'userService' @ [341:23] ==> private final val userService: RPCUserService defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'getUser' @ [341:35] ==> public abstract fun getUser(username: String): User? defined in net.corda.node.services.RPCUserService[SimpleFunctionDescriptorImpl]

'validatedUser' @ [341:43] ==> val validatedUser: String defined in net.corda.node.services.messaging.RPCServer.getUser[LocalVariableDescriptor]

'if (rpcUser != null) {
            return rpcUser
        } else if (X500Name(validatedUser) == nodeLegalName) {
            return nodeUser
        } else {
            throw IllegalArgumentException("Validated user '$validatedUser' is not an RPC user nor the NODE user")
        }' @ [342:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'rpcUser' @ [342:13] ==> val rpcUser: User? defined in net.corda.node.services.messaging.RPCServer.getUser[LocalVariableDescriptor]

'rpcUser' @ [343:20] ==> val rpcUser: User? defined in net.corda.node.services.messaging.RPCServer.getUser[LocalVariableDescriptor]

'if (X500Name(validatedUser) == nodeLegalName) {
            return nodeUser
        } else {
            throw IllegalArgumentException("Validated user '$validatedUser' is not an RPC user nor the NODE user")
        }' @ [344:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'X500Name' @ [344:20] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'validatedUser' @ [344:29] ==> val validatedUser: String defined in net.corda.node.services.messaging.RPCServer.getUser[LocalVariableDescriptor]

'nodeLegalName' @ [344:47] ==> private final val nodeLegalName: X500Name defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'nodeUser' @ [345:20] ==> private final val nodeUser: User defined in net.corda.node.services.messaging.RPCServer[PropertyDescriptorImpl]

'IllegalArgumentException' @ [347:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'validatedUser' @ [347:62] ==> val validatedUser: String defined in net.corda.node.services.messaging.RPCServer.getUser[LocalVariableDescriptor]

'JvmField' @ [352:1] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'ThreadLocal' @ [353:61] ==> public constructor ThreadLocal<T : (Any..Any?)>() defined in java.lang.ThreadLocal[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> RpcContext

'CURRENT_RPC_CONTEXT' @ [359:35] ==> @JvmField internal val CURRENT_RPC_CONTEXT: ThreadLocal<RpcContext> defined in net.corda.node.services.messaging in file RPCServer.kt[PropertyDescriptorImpl]

'get' @ [359:55] ==> public open fun get(): (RpcContext..RpcContext?) defined in java.lang.ThreadLocal[JavaMethodDescriptor]

'loggerFor' @ [389:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ObservableContext

'RpcServerObservableSerializer' @ [392:61] ==> public object RpcServerObservableSerializer : Serializer<Observable<*>> defined in net.corda.node.services.messaging in file RPCServer.kt[FakeCallableDescriptorForObject]

'createContext' @ [392:91] ==> public final fun createContext(observableContext: ObservableContext): SerializationContext defined in net.corda.node.services.messaging.RpcServerObservableSerializer[SimpleFunctionDescriptorImpl]

'this' @ [392:105] ==> <this> defined in net.corda.node.services.messaging.ObservableContext[LazyClassReceiverParameterDescriptor]

'sessionAndProducerPool' @ [396:13] ==> public final val sessionAndProducerPool: LazyStickyPool<ArtemisProducer> defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'run' @ [396:36] ==> public final inline fun <R> run(stickToOrNull: Any? = ..., withInstance: (ArtemisProducer) -> Unit): Unit defined in net.corda.core.internal.LazyStickyPool[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'rpcRequestId' @ [396:40] ==> public final val rpcRequestId: RPCApi.RpcRequestId defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'it' @ [397:38] ==> value-parameter it: ArtemisProducer defined in net.corda.node.services.messaging.ObservableContext.sendMessage.<anonymous>[ValueParameterDescriptorImpl]

'session' @ [397:41] ==> public final val session: ClientSession defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'createMessage' @ [397:49] ==> public abstract fun createMessage(p0: Boolean): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'serverToClient' @ [398:17] ==> value-parameter serverToClient: RPCApi.ServerToClient defined in net.corda.node.services.messaging.ObservableContext.sendMessage[ValueParameterDescriptorImpl]

'writeToClientMessage' @ [398:32] ==> public abstract fun writeToClientMessage(context: SerializationContext, message: ClientMessage): Unit defined in net.corda.nodeapi.RPCApi.ServerToClient[DeserializedSimpleFunctionDescriptor]

'serializationContextWithObservableContext' @ [398:53] ==> private final val serializationContextWithObservableContext: SerializationContext defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'artemisMessage' @ [398:96] ==> val artemisMessage: (ClientMessage..ClientMessage?) defined in net.corda.node.services.messaging.ObservableContext.sendMessage.<anonymous>[LocalVariableDescriptor]

'it' @ [399:17] ==> value-parameter it: ArtemisProducer defined in net.corda.node.services.messaging.ObservableContext.sendMessage.<anonymous>[ValueParameterDescriptorImpl]

'producer' @ [399:20] ==> public final val producer: ClientProducer defined in net.corda.nodeapi.ArtemisProducer[DeserializedPropertyDescriptor]

'send' @ [399:29] ==> public abstract fun send(p0: (SimpleString..SimpleString?), p1: (Message..Message?)): Unit defined in org.apache.activemq.artemis.api.core.client.ClientProducer[JavaMethodDescriptor]

'clientAddress' @ [399:34] ==> public final val clientAddress: SimpleString defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'artemisMessage' @ [399:49] ==> val artemisMessage: (ClientMessage..ClientMessage?) defined in net.corda.node.services.messaging.ObservableContext.sendMessage.<anonymous>[LocalVariableDescriptor]

'log' @ [400:17] ==> public final val log: Logger defined in net.corda.node.services.messaging.ObservableContext.Companion[PropertyDescriptorImpl]

'debug' @ [400:21] ==> public abstract fun debug(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'serverToClient' @ [400:39] ==> value-parameter serverToClient: RPCApi.ServerToClient defined in net.corda.node.services.messaging.ObservableContext.sendMessage[ValueParameterDescriptorImpl]

'log' @ [403:13] ==> public final val log: Logger defined in net.corda.node.services.messaging.ObservableContext.Companion[PropertyDescriptorImpl]

'error' @ [403:17] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'serverToClient' @ [403:77] ==> value-parameter serverToClient: RPCApi.ServerToClient defined in net.corda.node.services.messaging.ObservableContext.sendMessage[ValueParameterDescriptorImpl]

'throwable' @ [403:94] ==> val throwable: Throwable defined in net.corda.node.services.messaging.ObservableContext.sendMessage[LocalVariableDescriptor]

'serverControl' @ [404:13] ==> public final val serverControl: ActiveMQServerControl defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'closeConsumerConnectionsForAddress' @ [404:27] ==> @Operation public abstract fun closeConsumerConnectionsForAddress(@Parameter p0: (String..String?)): Boolean defined in org.apache.activemq.artemis.api.core.management.ActiveMQServerControl[JavaMethodDescriptor]

'clientAddress' @ [404:62] ==> public final val clientAddress: SimpleString defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'toString' @ [404:76] ==> public open fun toString(): String defined in org.apache.activemq.artemis.api.core.SimpleString[JavaMethodDescriptor]

'Serializer<Observable<*>>' @ [409:40] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Observable<*>

'loggerFor' @ [411:23] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> RpcServerObservableSerializer

'RPC_SERVER_CONTEXT' @ [414:16] ==> public final var RPC_SERVER_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[PropertyImportedFromObject]

'withProperty' @ [414:35] ==> public abstract fun withProperty(property: Any, value: Any): SerializationContext defined in net.corda.core.serialization.SerializationContext[DeserializedSimpleFunctionDescriptor]

'RpcServerObservableSerializer' @ [414:48] ==> public object RpcServerObservableSerializer : Serializer<Observable<*>> defined in net.corda.node.services.messaging in file RPCServer.kt[FakeCallableDescriptorForObject]

'RpcObservableContextKey' @ [414:78] ==> private object RpcObservableContextKey defined in net.corda.node.services.messaging.RpcServerObservableSerializer[FakeCallableDescriptorForObject]

'observableContext' @ [414:103] ==> value-parameter observableContext: ObservableContext defined in net.corda.node.services.messaging.RpcServerObservableSerializer.createContext[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [418:15] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'RPCApi' @ [422:28] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'ObservableId' @ [422:35] ==> public constructor ObservableId(toLong: Long) defined in net.corda.nodeapi.RPCApi.ObservableId[DeserializedClassConstructorDescriptor]

'random63BitValue' @ [422:48] ==> public fun random63BitValue(): Long defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'kryo' @ [423:33] ==> value-parameter kryo: Kryo defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[ValueParameterDescriptorImpl]

'context' @ [423:38] ==> public final val Kryo.context: raw (ObjectMap<(Any..Any?), (Any..Any?)>..ObjectMap<*, *>?)[MyPropertyDescriptor]

'RpcObservableContextKey' @ [423:46] ==> private object RpcObservableContextKey defined in net.corda.node.services.messaging.RpcServerObservableSerializer[FakeCallableDescriptorForObject]

'output' @ [424:9] ==> value-parameter output: Output defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[ValueParameterDescriptorImpl]

'writeLong' @ [424:16] ==> public open fun writeLong(p0: Long, p1: Boolean): Int defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'observableId' @ [424:26] ==> val observableId: RPCApi.ObservableId defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

'toLong' @ [424:39] ==> public final val toLong: Long defined in net.corda.nodeapi.RPCApi.ObservableId[DeserializedPropertyDescriptor]

'ObservableSubscription' @ [425:42] ==> public constructor ObservableSubscription(subscription: Subscription) defined in net.corda.node.services.messaging.ObservableSubscription[ClassConstructorDescriptorImpl]

'observable' @ [428:32] ==> value-parameter observable: Observable<*> defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[ValueParameterDescriptorImpl]

'materialize' @ [428:43] ==> public final fun materialize(): (Observable<out (Notification<out (Any..Any?)>..Notification<out (Any..Any?)>?)>..Observable<out (Notification<out (Any..Any?)>..Notification<out (Any..Any?)>?)>?) defined in rx.Observable[JavaMethodDescriptor]

'subscribe' @ [428:57] ==> public final fun subscribe(p0: (Subscriber<in (Nothing..Nothing?)>..Subscriber<in (Nothing..Nothing?)>?)): (Subscription..Subscription?) defined in rx.Observable[JavaMethodDescriptor]

'Subscriber<Notification<*>>' @ [429:34] ==> protected/*protected and package*/ constructor Subscriber<T : (Any..Any?)>() defined in rx.Subscriber[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Notification<*>

'!' @ [431:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUnsubscribed' @ [431:38] ==> public final val <no name provided>.isUnsubscribed: Boolean[MyPropertyDescriptor]

'observableContext' @ [432:37] ==> val observableContext: ObservableContext defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

'observationSendExecutor' @ [432:55] ==> public final val observationSendExecutor: ExecutorService defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'submit' @ [432:79] ==> public final fun submit(p0: (() -> Unit..(() -> Unit)?)): (Future<*>..Future<*>?) defined in java.util.concurrent.ExecutorService[MyFunctionDescriptor]

'observableContext' @ [433:41] ==> val observableContext: ObservableContext defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

'sendMessage' @ [433:59] ==> public final fun sendMessage(serverToClient: RPCApi.ServerToClient): Unit defined in net.corda.node.services.messaging.ObservableContext[SimpleFunctionDescriptorImpl]

'RPCApi' @ [433:71] ==> public object RPCApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'Observation' @ [433:93] ==> public constructor Observation(id: RPCApi.ObservableId, content: Notification<*>) defined in net.corda.nodeapi.RPCApi.ServerToClient.Observation[DeserializedClassConstructorDescriptor]

'observableId' @ [433:105] ==> val observableId: RPCApi.ObservableId defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

'observation' @ [433:119] ==> value-parameter observation: Notification<*> defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write.<no name provided>.onNext[ValueParameterDescriptorImpl]

'log' @ [438:33] ==> private final val log: Logger defined in net.corda.node.services.messaging.RpcServerObservableSerializer[PropertyDescriptorImpl]

'error' @ [438:37] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'exception' @ [438:94] ==> value-parameter exception: Throwable defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write.<no name provided>.onError[ValueParameterDescriptorImpl]

'observableContext' @ [445:9] ==> val observableContext: ObservableContext defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

'clientAddressToObservables' @ [445:27] ==> public final val clientAddressToObservables: SetMultimap<SimpleString, RPCApi.ObservableId> defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'put' @ [445:54] ==> @CanIgnoreReturnValue public abstract fun put(@Nullable p0: SimpleString?, @Nullable p1: RPCApi.ObservableId?): Boolean defined in com.google.common.collect.SetMultimap[JavaMethodDescriptor]

'observableContext' @ [445:58] ==> val observableContext: ObservableContext defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

'clientAddress' @ [445:76] ==> public final val clientAddress: SimpleString defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'observableId' @ [445:91] ==> val observableId: RPCApi.ObservableId defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

'observableContext' @ [446:9] ==> val observableContext: ObservableContext defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

'observableMap' @ [446:27] ==> public final val observableMap: ObservableSubscriptionMap /* = Cache<RPCApi.ObservableId, ObservableSubscription> */ defined in net.corda.node.services.messaging.ObservableContext[PropertyDescriptorImpl]

'put' @ [446:41] ==> public abstract fun put(p0: (RPCApi.ObservableId..RPCApi.ObservableId?), p1: (ObservableSubscription..ObservableSubscription?)): Unit defined in com.google.common.cache.Cache[JavaMethodDescriptor]

'observableId' @ [446:45] ==> val observableId: RPCApi.ObservableId defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

'observableWithSubscription' @ [446:59] ==> val observableWithSubscription: ObservableSubscription defined in net.corda.node.services.messaging.RpcServerObservableSerializer.write[LocalVariableDescriptor]

