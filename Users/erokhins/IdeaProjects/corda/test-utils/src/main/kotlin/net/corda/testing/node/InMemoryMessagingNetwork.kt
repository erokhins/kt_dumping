'ThreadSafe' @ [45:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'InMemoryMessagingNetwork' @ [48:76] ==> public companion object defined in net.corda.testing.node.InMemoryMessagingNetwork[FakeCallableDescriptorForObject]

'Random' @ [48:131] ==> public constructor Random(random: SplittableRandom = ...) defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.Random[ClassConstructorDescriptorImpl]

'ReusableLatch' @ [49:55] ==> public constructor ReusableLatch() defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [50:5] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'getLogger' @ [53:41] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'MESSAGES_LOG_NAME' @ [53:51] ==> public final val MESSAGES_LOG_NAME: String defined in net.corda.testing.node.InMemoryMessagingNetwork.Companion[PropertyDescriptorImpl]

'HashMap' @ [57:37] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PeerHandle
    <V : (Any..Any?)> -> InMemoryMessaging

'CordaSerializable' @ [59:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'message' @ [61:38] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'topicSession' @ [61:46] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'sender' @ [61:67] ==> public final val sender: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'recipients' @ [61:80] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'LinkedBlockingQueue' @ [66:36] ==> public constructor LinkedBlockingQueue<E : (Any..Any?)>() defined in java.util.concurrent.LinkedBlockingQueue[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MessageTransfer

'create' @ [67:48] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>..PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageTransfer

'Suppress' @ [68:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'_sentMessages' @ [71:17] ==> private final val _sentMessages: (PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>..PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>?) defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'HashMap' @ [78:40] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PeerHandle
    <V : (Any..Any?)> -> LinkedBlockingQueue<MessageTransfer>

'create' @ [79:52] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>..PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageTransfer

'HashMap' @ [82:41] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ServiceHandle
    <V : (Any..Any?)> -> LinkedHashSet<PeerHandle>

'HashMap' @ [84:32] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> X500Name
    <V : (Any..Any?)> -> PeerHandle

'Suppress' @ [86:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'_receivedMessages' @ [89:17] ==> private final val _receivedMessages: (PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>..PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>?) defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'Synchronized' @ [91:44] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'handleEndpointMap' @ [91:66] ==> private final val handleEndpointMap: HashMap<InMemoryMessagingNetwork.PeerHandle, InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'values' @ [91:84] ==> public open val values: MutableCollection<InMemoryMessagingNetwork.InMemoryMessaging> defined in java.util.HashMap[JavaPropertyDescriptor]

'toList' @ [91:91] ==> public fun <T> Iterable<InMemoryMessagingNetwork.InMemoryMessaging>.toList(): List<InMemoryMessagingNetwork.InMemoryMessaging> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InMemoryMessaging

'handleEndpointMap' @ [92:58] ==> private final val handleEndpointMap: HashMap<InMemoryMessagingNetwork.PeerHandle, InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'get' @ [92:76] ==> public open fun get(key: InMemoryMessagingNetwork.PeerHandle): InMemoryMessagingNetwork.InMemoryMessaging? defined in java.util.HashMap[JavaMethodDescriptor]

'peer' @ [92:80] ==> value-parameter peer: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.endpoint[ValueParameterDescriptorImpl]

'Synchronized' @ [105:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'check' @ [110:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'counter' @ [110:15] ==> private final var counter: Int defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'createNodeWithID' @ [111:23] ==> public final fun createNodeWithID(manuallyPumped: Boolean, id: Int, executor: AffinityExecutor, advertisedServices: List<ServiceEntry>, description: X500Name = ..., database: CordaPersistence): MessagingServiceBuilder<InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'manuallyPumped' @ [111:40] ==> value-parameter manuallyPumped: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.createNode[ValueParameterDescriptorImpl]

'counter' @ [111:56] ==> private final var counter: Int defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'executor' @ [111:65] ==> value-parameter executor: AffinityExecutor defined in net.corda.testing.node.InMemoryMessagingNetwork.createNode[ValueParameterDescriptorImpl]

'advertisedServices' @ [111:75] ==> value-parameter advertisedServices: List<ServiceEntry> defined in net.corda.testing.node.InMemoryMessagingNetwork.createNode[ValueParameterDescriptorImpl]

'database' @ [111:106] ==> value-parameter database: CordaPersistence defined in net.corda.testing.node.InMemoryMessagingNetwork.createNode[ValueParameterDescriptorImpl]

'counter' @ [112:9] ==> private final var counter: Int defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'builder' @ [113:18] ==> val builder: InMemoryMessagingNetwork.Builder defined in net.corda.testing.node.InMemoryMessagingNetwork.createNode[LocalVariableDescriptor]

'id' @ [113:26] ==> public final val id: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder[PropertyDescriptorImpl]

'Pair' @ [114:16] ==> public constructor Pair<out A, out B>(first: InMemoryMessagingNetwork.PeerHandle, second: InMemoryMessagingNetwork.Builder) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> PeerHandle
    <out B> -> Builder

'id' @ [114:21] ==> val id: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.createNode[LocalVariableDescriptor]

'builder' @ [114:25] ==> val builder: InMemoryMessagingNetwork.Builder defined in net.corda.testing.node.InMemoryMessagingNetwork.createNode[LocalVariableDescriptor]

'getX509Name' @ [130:37] ==> @JvmOverloads public fun getX509Name(myLegalName: String, nearestCity: String, email: String, country: String? = ...): X500Name defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'id' @ [130:66] ==> value-parameter id: Int defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[ValueParameterDescriptorImpl]

'PeerHandle' @ [133:26] ==> public constructor PeerHandle(id: Int, description: X500Name) defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle[ClassConstructorDescriptorImpl]

'id' @ [133:37] ==> value-parameter id: Int defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[ValueParameterDescriptorImpl]

'description' @ [133:41] ==> value-parameter description: X500Name = ... defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[ValueParameterDescriptorImpl]

'peersMapping' @ [134:9] ==> private final val peersMapping: HashMap<X500Name, InMemoryMessagingNetwork.PeerHandle> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'peerHandle' @ [134:22] ==> val peerHandle: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[LocalVariableDescriptor]

'description' @ [134:33] ==> public final val description: X500Name defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle[PropertyDescriptorImpl]

'peerHandle' @ [134:48] ==> val peerHandle: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[LocalVariableDescriptor]

'Builder' @ [135:16] ==> public constructor Builder(manuallyPumped: Boolean, id: InMemoryMessagingNetwork.PeerHandle, serviceHandles: List<InMemoryMessagingNetwork.ServiceHandle>, executor: AffinityExecutor, database: CordaPersistence) defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder[ClassConstructorDescriptorImpl]

'manuallyPumped' @ [135:24] ==> value-parameter manuallyPumped: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[ValueParameterDescriptorImpl]

'peerHandle' @ [135:40] ==> val peerHandle: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[LocalVariableDescriptor]

'advertisedServices' @ [135:52] ==> value-parameter advertisedServices: List<ServiceEntry> defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[ValueParameterDescriptorImpl]

'map' @ [135:71] ==> public inline fun <T, R> Iterable<ServiceEntry>.map(transform: (ServiceEntry) -> InMemoryMessagingNetwork.ServiceHandle): List<InMemoryMessagingNetwork.ServiceHandle> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceEntry
    <R> -> ServiceHandle

'ServiceHandle' @ [135:77] ==> public constructor ServiceHandle(service: ServiceEntry) defined in net.corda.testing.node.InMemoryMessagingNetwork.ServiceHandle[ClassConstructorDescriptorImpl]

'executor' @ [135:93] ==> value-parameter executor: AffinityExecutor defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[ValueParameterDescriptorImpl]

'database' @ [135:114] ==> value-parameter database: CordaPersistence defined in net.corda.testing.node.InMemoryMessagingNetwork.createNodeWithID[ValueParameterDescriptorImpl]

'Volatile' @ [143:5] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'Timer' @ [144:25] ==> public constructor Timer() defined in java.util.Timer[JavaClassConstructorDescriptor]

'Synchronized' @ [146:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'messagesInFlight' @ [148:9] ==> private final val messagesInFlight: ReusableLatch defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'countUp' @ [148:26] ==> public open fun countUp(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'messageSendQueue' @ [149:9] ==> private final val messageSendQueue: LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'MessageTransfer' @ [149:29] ==> public constructor MessageTransfer(sender: InMemoryMessagingNetwork.PeerHandle, message: Message, recipients: MessageRecipients) defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[ClassConstructorDescriptorImpl]

'from' @ [149:45] ==> value-parameter from: InMemoryMessagingNetwork.InMemoryMessaging defined in net.corda.testing.node.InMemoryMessagingNetwork.msgSend[ValueParameterDescriptorImpl]

'myAddress' @ [149:50] ==> public open val myAddress: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'message' @ [149:61] ==> value-parameter message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.msgSend[ValueParameterDescriptorImpl]

'recipients' @ [149:70] ==> value-parameter recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.msgSend[ValueParameterDescriptorImpl]

'Synchronized' @ [152:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'handleEndpointMap' @ [154:9] ==> private final val handleEndpointMap: HashMap<InMemoryMessagingNetwork.PeerHandle, InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'remove' @ [154:27] ==> public open fun remove(key: InMemoryMessagingNetwork.PeerHandle): InMemoryMessagingNetwork.InMemoryMessaging? defined in java.util.HashMap[JavaMethodDescriptor]

'peerHandle' @ [154:34] ==> value-parameter peerHandle: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.netNodeHasShutdown[ValueParameterDescriptorImpl]

'Synchronized' @ [157:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'messageReceiveQueues' @ [158:65] ==> private final val messageReceiveQueues: HashMap<InMemoryMessagingNetwork.PeerHandle, LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'getOrPut' @ [158:86] ==> public inline fun <K, V> MutableMap<InMemoryMessagingNetwork.PeerHandle, LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>>.getOrPut(key: InMemoryMessagingNetwork.PeerHandle, defaultValue: () -> LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>): LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PeerHandle
    <V> -> LinkedBlockingQueue<MessageTransfer>

'recipients' @ [158:95] ==> value-parameter recipients: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.getQueueForPeerHandle[ValueParameterDescriptorImpl]

'LinkedBlockingQueue' @ [158:109] ==> public constructor LinkedBlockingQueue<E : (Any..Any?)>() defined in java.util.concurrent.LinkedBlockingQueue[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MessageTransfer

'Synchronized' @ [160:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'serviceToPeersMapping' @ [162:16] ==> private final val serviceToPeersMapping: HashMap<InMemoryMessagingNetwork.ServiceHandle, LinkedHashSet<InMemoryMessagingNetwork.PeerHandle>> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'recipients' @ [162:38] ==> value-parameter recipients: InMemoryMessagingNetwork.ServiceHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.getQueuesForServiceHandle[ValueParameterDescriptorImpl]

'map' @ [162:52] ==> public inline fun <T, R> Iterable<InMemoryMessagingNetwork.PeerHandle>.map(transform: (InMemoryMessagingNetwork.PeerHandle) -> LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>): List<LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PeerHandle
    <R> -> LinkedBlockingQueue<MessageTransfer>

'messageReceiveQueues' @ [163:13] ==> private final val messageReceiveQueues: HashMap<InMemoryMessagingNetwork.PeerHandle, LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'getOrPut' @ [163:34] ==> public inline fun <K, V> MutableMap<InMemoryMessagingNetwork.PeerHandle, LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>>.getOrPut(key: InMemoryMessagingNetwork.PeerHandle, defaultValue: () -> LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>): LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PeerHandle
    <V> -> LinkedBlockingQueue<MessageTransfer>

'it' @ [163:43] ==> value-parameter it: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.getQueuesForServiceHandle.<anonymous>[ValueParameterDescriptorImpl]

'LinkedBlockingQueue' @ [163:49] ==> public constructor LinkedBlockingQueue<E : (Any..Any?)>() defined in java.util.concurrent.LinkedBlockingQueue[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MessageTransfer

'synchronized' @ [171:21] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> List<InMemoryMessagingNetwork.InMemoryMessaging>): List<InMemoryMessagingNetwork.InMemoryMessaging> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<InMemoryMessaging>

'this' @ [171:34] ==> <this> defined in net.corda.testing.node.InMemoryMessagingNetwork[LazyClassReceiverParameterDescriptor]

'counter' @ [172:13] ==> private final var counter: Int defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'-' @ [172:23] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'handleEndpointMap' @ [173:13] ==> private final val handleEndpointMap: HashMap<InMemoryMessagingNetwork.PeerHandle, InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'values' @ [173:31] ==> public open val values: MutableCollection<InMemoryMessagingNetwork.InMemoryMessaging> defined in java.util.HashMap[JavaPropertyDescriptor]

'toList' @ [173:38] ==> public fun <T> Iterable<InMemoryMessagingNetwork.InMemoryMessaging>.toList(): List<InMemoryMessagingNetwork.InMemoryMessaging> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InMemoryMessaging

'nodes' @ [176:22] ==> val nodes: List<InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork.stop[LocalVariableDescriptor]

'node' @ [177:13] ==> val node: InMemoryMessagingNetwork.InMemoryMessaging defined in net.corda.testing.node.InMemoryMessagingNetwork.stop[LocalVariableDescriptor]

'stop' @ [177:18] ==> public open fun stop(): Unit defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[SimpleFunctionDescriptorImpl]

'handleEndpointMap' @ [179:9] ==> private final val handleEndpointMap: HashMap<InMemoryMessagingNetwork.PeerHandle, InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'clear' @ [179:27] ==> public open fun clear(): Unit defined in java.util.HashMap[JavaMethodDescriptor]

'messageReceiveQueues' @ [180:9] ==> private final val messageReceiveQueues: HashMap<InMemoryMessagingNetwork.PeerHandle, LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'clear' @ [180:30] ==> public open fun clear(): Unit defined in java.util.HashMap[JavaMethodDescriptor]

'synchronized' @ [190:13] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Nothing

'this@InMemoryMessagingNetwork' @ [190:26] ==> <this> defined in net.corda.testing.node.InMemoryMessagingNetwork[LazyClassReceiverParameterDescriptor]

'InMemoryMessaging' @ [191:28] ==> public constructor InMemoryMessaging(manuallyPumped: Boolean, peerHandle: InMemoryMessagingNetwork.PeerHandle, executor: AffinityExecutor, database: CordaPersistence) defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[ClassConstructorDescriptorImpl]

'manuallyPumped' @ [191:46] ==> public final val manuallyPumped: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder[PropertyDescriptorImpl]

'id' @ [191:62] ==> public final val id: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder[PropertyDescriptorImpl]

'executor' @ [191:66] ==> public final val executor: AffinityExecutor defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder[PropertyDescriptorImpl]

'database' @ [191:76] ==> public final val database: CordaPersistence defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder[PropertyDescriptorImpl]

'handleEndpointMap' @ [192:17] ==> private final val handleEndpointMap: HashMap<InMemoryMessagingNetwork.PeerHandle, InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'id' @ [192:35] ==> public final val id: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder[PropertyDescriptorImpl]

'node' @ [192:41] ==> val node: InMemoryMessagingNetwork.InMemoryMessaging defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder.start.<anonymous>[LocalVariableDescriptor]

'serviceHandles' @ [193:17] ==> public final val serviceHandles: List<InMemoryMessagingNetwork.ServiceHandle> defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder[PropertyDescriptorImpl]

'forEach' @ [193:32] ==> @HidesMembers public inline fun <T> Iterable<InMemoryMessagingNetwork.ServiceHandle>.forEach(action: (InMemoryMessagingNetwork.ServiceHandle) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServiceHandle

'serviceToPeersMapping' @ [194:21] ==> private final val serviceToPeersMapping: HashMap<InMemoryMessagingNetwork.ServiceHandle, LinkedHashSet<InMemoryMessagingNetwork.PeerHandle>> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'getOrPut' @ [194:43] ==> public inline fun <K, V> MutableMap<InMemoryMessagingNetwork.ServiceHandle, LinkedHashSet<InMemoryMessagingNetwork.PeerHandle>>.getOrPut(key: InMemoryMessagingNetwork.ServiceHandle, defaultValue: () -> LinkedHashSet<InMemoryMessagingNetwork.PeerHandle>): LinkedHashSet<InMemoryMessagingNetwork.PeerHandle> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ServiceHandle
    <V> -> LinkedHashSet<PeerHandle>

'it' @ [194:52] ==> value-parameter it: InMemoryMessagingNetwork.ServiceHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder.start.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [194:58] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PeerHandle

'add' @ [194:88] ==> public open fun add(element: InMemoryMessagingNetwork.PeerHandle): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'id' @ [194:92] ==> public final val id: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder[PropertyDescriptorImpl]

'Unit' @ [195:21] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'immediateFuture' @ [197:32] ==> public open fun <V : (Any..Any?)> immediateFuture(@Nullable p0: InMemoryMessagingNetwork.InMemoryMessaging?): (ListenableFuture<(InMemoryMessagingNetwork.InMemoryMessaging..InMemoryMessagingNetwork.InMemoryMessaging?)>..ListenableFuture<(InMemoryMessagingNetwork.InMemoryMessaging..InMemoryMessagingNetwork.InMemoryMessaging?)>?) defined in com.google.common.util.concurrent.Futures[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> (net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging..net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging?)

'node' @ [197:48] ==> val node: InMemoryMessagingNetwork.InMemoryMessaging defined in net.corda.testing.node.InMemoryMessagingNetwork.Builder.start.<anonymous>[LocalVariableDescriptor]

'CordaSerializable' @ [202:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'description' @ [204:35] ==> public final val description: X500Name defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle[PropertyDescriptorImpl]

'toString' @ [204:47] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'other' @ [205:44] ==> value-parameter other: Any? defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle.equals[ValueParameterDescriptorImpl]

'other' @ [205:67] ==> value-parameter other: Any? defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle.equals[ValueParameterDescriptorImpl]

'id' @ [205:73] ==> public final val id: Int defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle[PropertyDescriptorImpl]

'id' @ [205:79] ==> public final val id: Int defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle[PropertyDescriptorImpl]

'id' @ [206:35] ==> public final val id: Int defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle[PropertyDescriptorImpl]

'hashCode' @ [206:38] ==> public open fun hashCode(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'CordaSerializable' @ [209:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'service' @ [211:45] ==> public final val service: ServiceEntry defined in net.corda.testing.node.InMemoryMessagingNetwork.ServiceHandle[PropertyDescriptorImpl]

'SplittableRandom' @ [219:53] ==> public constructor SplittableRandom() defined in java.util.SplittableRandom[JavaClassConstructorDescriptor]

'ServicePeerAllocationStrategy' @ [219:75] ==> private constructor ServicePeerAllocationStrategy() defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy[ClassConstructorDescriptorImpl]

'pickFrom' @ [221:24] ==> value-parameter pickFrom: List<A> defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.Random.pickNext[ValueParameterDescriptorImpl]

'random' @ [221:33] ==> public final val random: SplittableRandom defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.Random[PropertyDescriptorImpl]

'nextInt' @ [221:40] ==> public open fun nextInt(p0: Int): Int defined in java.util.SplittableRandom[JavaMethodDescriptor]

'pickFrom' @ [221:48] ==> value-parameter pickFrom: List<A> defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.Random.pickNext[ValueParameterDescriptorImpl]

'size' @ [221:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ServicePeerAllocationStrategy' @ [225:28] ==> private constructor ServicePeerAllocationStrategy() defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy[ClassConstructorDescriptorImpl]

'HashMap' @ [226:33] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ServiceHandle
    <V : (Any..Any?)> -> Int

'previousPicks' @ [228:33] ==> public final val previousPicks: HashMap<InMemoryMessagingNetwork.ServiceHandle, Int> defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin[PropertyDescriptorImpl]

'compute' @ [228:47] ==> public final fun compute(p0: InMemoryMessagingNetwork.ServiceHandle, p1: (InMemoryMessagingNetwork.ServiceHandle, Int?) -> Int?): Int? defined in java.util.HashMap[MyFunctionDescriptor]

'service' @ [228:55] ==> value-parameter service: InMemoryMessagingNetwork.ServiceHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin.pickNext[ValueParameterDescriptorImpl]

'%' @ [229:21] ==> @SinceKotlin public final operator fun rem(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'previous' @ [229:22] ==> value-parameter previous: Int? defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin.pickNext.<anonymous>[ValueParameterDescriptorImpl]

'plus' @ [229:32] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'pickFrom' @ [229:48] ==> value-parameter pickFrom: List<A> defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin.pickNext[ValueParameterDescriptorImpl]

'size' @ [229:57] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'pickFrom' @ [231:24] ==> value-parameter pickFrom: List<A> defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin.pickNext[ValueParameterDescriptorImpl]

'nextIndex' @ [231:33] ==> val nextIndex: Int defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy.RoundRobin.pickNext[LocalVariableDescriptor]

'?:' @ [238:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: InMemoryMessagingNetwork.MessageTransfer?, right: InMemoryMessagingNetwork.MessageTransfer): InMemoryMessagingNetwork.MessageTransfer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> MessageTransfer

'if (block) messageSendQueue.take() else messageSendQueue.poll()' @ [238:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?), elseBranch: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)): (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer..net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer?)

'block' @ [238:29] ==> value-parameter block: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[ValueParameterDescriptorImpl]

'messageSendQueue' @ [238:36] ==> private final val messageSendQueue: LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'take' @ [238:53] ==> public open fun take(): (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?) defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'messageSendQueue' @ [238:65] ==> private final val messageSendQueue: LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'poll' @ [238:82] ==> public open fun poll(): (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?) defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'log' @ [240:9] ==> private final val log: (Logger..Logger?) defined in net.corda.testing.node.InMemoryMessagingNetwork.Companion[PropertyDescriptorImpl]

'trace' @ [240:13] ==> public inline fun Logger.trace(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'transfer' @ [240:21] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'toString' @ [240:30] ==> public open fun toString(): String defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[SimpleFunctionDescriptorImpl]

'latencyCalculator' @ [241:20] ==> @Volatile public final var latencyCalculator: InMemoryMessagingNetwork.LatencyCalculator? defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'if (calc != null && transfer.recipients is SingleMessageRecipient) {
            val messageSent = SettableFuture.create<Unit>()
            // Inject some artificial latency.
            timer.schedule(calc.between(transfer.sender, transfer.recipients).toMillis()) {
                pumpSendInternal(transfer)
                messageSent.set(Unit)
            }
            if (block) {
                messageSent.getOrThrow()
            }
        } else {
            pumpSendInternal(transfer)
        }' @ [242:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'calc' @ [242:13] ==> val calc: InMemoryMessagingNetwork.LatencyCalculator? defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'transfer' @ [242:29] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'recipients' @ [242:38] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'create' @ [243:46] ==> public open fun <V : (Any..Any?)> create(): (SettableFuture<(Unit..Unit?)>..SettableFuture<(Unit..Unit?)>?) defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]
Inferred types:
    <V : (Any..Any?)> -> Unit

'timer' @ [245:13] ==> private final val timer: Timer defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'schedule' @ [245:19] ==> @InlineOnly public inline fun Timer.schedule(delay: Long, crossinline action: TimerTask.() -> Unit): TimerTask defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'calc' @ [245:28] ==> val calc: InMemoryMessagingNetwork.LatencyCalculator? defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'between' @ [245:33] ==> public abstract fun between(sender: SingleMessageRecipient, receiver: SingleMessageRecipient): Duration defined in net.corda.testing.node.InMemoryMessagingNetwork.LatencyCalculator[SimpleFunctionDescriptorImpl]

'transfer' @ [245:41] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'sender' @ [245:50] ==> public final val sender: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'transfer' @ [245:58] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'recipients' @ [245:67] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'toMillis' @ [245:79] ==> public open fun toMillis(): Long defined in java.time.Duration[JavaMethodDescriptor]

'pumpSendInternal' @ [246:17] ==> public final fun pumpSendInternal(transfer: InMemoryMessagingNetwork.MessageTransfer): Unit defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'transfer' @ [246:34] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'messageSent' @ [247:17] ==> val messageSent: (SettableFuture<(Unit..Unit?)>..SettableFuture<(Unit..Unit?)>?) defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'set' @ [247:29] ==> @CanIgnoreReturnValue public open fun set(@Nullable p0: Unit?): Boolean defined in com.google.common.util.concurrent.SettableFuture[JavaMethodDescriptor]

'Unit' @ [247:33] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'block' @ [249:17] ==> value-parameter block: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[ValueParameterDescriptorImpl]

'messageSent' @ [250:17] ==> val messageSent: (SettableFuture<(Unit..Unit?)>..SettableFuture<(Unit..Unit?)>?) defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'getOrThrow' @ [250:29] ==> public fun <V> Future<(Unit..Unit?)>.getOrThrow(timeout: Duration? = ...): (Unit..Unit?) defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> (kotlin.Unit..kotlin.Unit?)

'pumpSendInternal' @ [253:13] ==> public final fun pumpSendInternal(transfer: InMemoryMessagingNetwork.MessageTransfer): Unit defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'transfer' @ [253:30] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'transfer' @ [256:16] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSend[LocalVariableDescriptor]

'when (transfer.recipients) {
            is PeerHandle -> getQueueForPeerHandle(transfer.recipients).add(transfer)
            is ServiceHandle -> {
                val queues = getQueuesForServiceHandle(transfer.recipients)
                val queue = servicePeerAllocationStrategy.pickNext(transfer.recipients, queues)
                queue.add(transfer)
            }
            is AllPossibleRecipients -> {
                // This means all possible recipients _that the network knows about at the time_, not literally everyone
                // who joins into the indefinite future.
                for (handle in handleEndpointMap.keys)
                    getQueueForPeerHandle(handle).add(transfer)
            }
            else -> throw IllegalArgumentException("Unknown type of recipient handle")
        }' @ [260:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'transfer' @ [260:15] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[ValueParameterDescriptorImpl]

'recipients' @ [260:24] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'getQueueForPeerHandle' @ [261:30] ==> @Synchronized private final fun getQueueForPeerHandle(recipients: InMemoryMessagingNetwork.PeerHandle): LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'transfer' @ [261:52] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[ValueParameterDescriptorImpl]

'recipients' @ [261:61] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'add' @ [261:73] ==> public open fun add(element: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)): Boolean defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'transfer' @ [261:77] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[ValueParameterDescriptorImpl]

'getQueuesForServiceHandle' @ [263:30] ==> @Synchronized private final fun getQueuesForServiceHandle(recipients: InMemoryMessagingNetwork.ServiceHandle): List<LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>> defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'transfer' @ [263:56] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[ValueParameterDescriptorImpl]

'recipients' @ [263:65] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'servicePeerAllocationStrategy' @ [264:29] ==> public final val servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'pickNext' @ [264:59] ==> public abstract fun <A> pickNext(service: InMemoryMessagingNetwork.ServiceHandle, pickFrom: List<LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>>): LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.ServicePeerAllocationStrategy[SimpleFunctionDescriptorImpl]
Inferred types:
    <A> -> LinkedBlockingQueue<MessageTransfer>

'transfer' @ [264:68] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[ValueParameterDescriptorImpl]

'recipients' @ [264:77] ==> public final val recipients: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'queues' @ [264:89] ==> val queues: List<LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>> defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[LocalVariableDescriptor]

'queue' @ [265:17] ==> val queue: LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[LocalVariableDescriptor]

'add' @ [265:23] ==> public open fun add(element: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)): Boolean defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'transfer' @ [265:27] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[ValueParameterDescriptorImpl]

'handleEndpointMap' @ [270:32] ==> private final val handleEndpointMap: HashMap<InMemoryMessagingNetwork.PeerHandle, InMemoryMessagingNetwork.InMemoryMessaging> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'keys' @ [270:50] ==> public open val keys: MutableSet<InMemoryMessagingNetwork.PeerHandle> defined in java.util.HashMap[JavaPropertyDescriptor]

'getQueueForPeerHandle' @ [271:21] ==> @Synchronized private final fun getQueueForPeerHandle(recipients: InMemoryMessagingNetwork.PeerHandle): LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'handle' @ [271:43] ==> val handle: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[LocalVariableDescriptor]

'add' @ [271:51] ==> public open fun add(element: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)): Boolean defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'transfer' @ [271:55] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [273:27] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'_sentMessages' @ [275:9] ==> private final val _sentMessages: (PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>..PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>?) defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'onNext' @ [275:23] ==> public open fun onNext(p0: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)): Unit defined in rx.subjects.PublishSubject[JavaMethodDescriptor]

'transfer' @ [275:30] ==> value-parameter transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.pumpSendInternal[ValueParameterDescriptorImpl]

'CordaSerializable' @ [278:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'now' @ [282:87] ==> public open fun now(): (Instant..Instant?) defined in java.time.Instant[JavaMethodDescriptor]

'topicSession' @ [283:37] ==> public open val topicSession: TopicSession defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessage[PropertyDescriptorImpl]

'String' @ [283:52] ==> @InlineOnly public inline fun String(bytes: ByteArray): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'data' @ [283:59] ==> public open val data: ByteArray defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessage[PropertyDescriptorImpl]

'CordaSerializable' @ [286:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'ThreadSafe' @ [301:5] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [305:77] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'Volatile' @ [309:9] ==> public constructor Volatile() defined in kotlin.jvm.Volatile[DeserializedClassConstructorDescriptor]

'ArrayList' @ [313:50] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Handler

'LinkedHashSet' @ [314:37] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MessageTransfer

'ThreadBox' @ [317:29] ==> public constructor ThreadBox<out T>(content: InMemoryMessagingNetwork.InMemoryMessaging.InnerState, lock: ReentrantLock = ...) defined in net.corda.core.internal.ThreadBox[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> InnerState

'InnerState' @ [317:39] ==> public constructor InnerState() defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.InnerState[ClassConstructorDescriptorImpl]

'synchronizedSet' @ [318:71] ==> public open fun <T : (Any..Any?)> synchronizedSet(p0: (MutableSet<(UUID..UUID?)>..Set<(UUID..UUID?)>?)): (MutableSet<(UUID..UUID?)>..Set<(UUID..UUID?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.util.UUID..java.util.UUID?)

'HashSet' @ [318:87] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UUID

'peerHandle' @ [320:52] ==> private final val peerHandle: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'if (manuallyPumped) null else
            thread(isDaemon = true, name = "In-memory message dispatcher") {
                while (!Thread.currentThread().isInterrupted) {
                    try {
                        pumpReceiveInternal(true)
                    } catch(e: InterruptedException) {
                        break
                    }
                }
            }' @ [322:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Thread?, elseBranch: Thread?): Thread?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Thread?

'manuallyPumped' @ [322:44] ==> private final val manuallyPumped: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'thread' @ [323:13] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'!' @ [324:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'currentThread' @ [324:32] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'isInterrupted' @ [324:48] ==> public final val Thread.isInterrupted: Boolean[MyPropertyDescriptor]

'pumpReceiveInternal' @ [326:25] ==> private final fun pumpReceiveInternal(block: Boolean): InMemoryMessagingNetwork.MessageTransfer? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[SimpleFunctionDescriptorImpl]

'when (partyInfo) {
                is PartyInfo.Node -> peersMapping[partyInfo.party.name] ?: throw IllegalArgumentException("No MockNode for party ${partyInfo.party.name}")
                is PartyInfo.Service -> ServiceHandle(partyInfo.service)
            }' @ [334:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MessageRecipients, entry1: MessageRecipients): MessageRecipients[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MessageRecipients

'partyInfo' @ [334:26] ==> value-parameter partyInfo: PartyInfo defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getAddressOfParty[ValueParameterDescriptorImpl]

'peersMapping' @ [335:38] ==> private final val peersMapping: HashMap<X500Name, InMemoryMessagingNetwork.PeerHandle> defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'partyInfo' @ [335:51] ==> value-parameter partyInfo: PartyInfo defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getAddressOfParty[ValueParameterDescriptorImpl]

'party' @ [335:61] ==> public abstract val party: PartyAndCertificate defined in net.corda.core.node.services.PartyInfo[DeserializedPropertyDescriptor]

'name' @ [335:67] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'IllegalArgumentException' @ [335:82] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'partyInfo' @ [335:132] ==> value-parameter partyInfo: PartyInfo defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getAddressOfParty[ValueParameterDescriptorImpl]

'party' @ [335:142] ==> public abstract val party: PartyAndCertificate defined in net.corda.core.node.services.PartyInfo[DeserializedPropertyDescriptor]

'name' @ [335:148] ==> public final val name: X500Name defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'ServiceHandle' @ [336:41] ==> public constructor ServiceHandle(service: ServiceEntry) defined in net.corda.testing.node.InMemoryMessagingNetwork.ServiceHandle[ClassConstructorDescriptorImpl]

'partyInfo' @ [336:55] ==> value-parameter partyInfo: PartyInfo defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getAddressOfParty[ValueParameterDescriptorImpl]

'service' @ [336:65] ==> public final val service: ServiceEntry defined in net.corda.core.node.services.PartyInfo.Service[DeserializedPropertyDescriptor]

'addMessageHandler' @ [341:19] ==> public open fun addMessageHandler(topicSession: TopicSession, callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[SimpleFunctionDescriptorImpl]

'TopicSession' @ [341:37] ==> public constructor TopicSession(topic: String, sessionID: Long = ...) defined in net.corda.node.services.messaging.TopicSession[DeserializedClassConstructorDescriptor]

'topic' @ [341:50] ==> value-parameter topic: String defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler[ValueParameterDescriptorImpl]

'sessionID' @ [341:57] ==> value-parameter sessionID: Long defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler[ValueParameterDescriptorImpl]

'callback' @ [341:69] ==> value-parameter callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler[ValueParameterDescriptorImpl]

'check' @ [344:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'running' @ [344:19] ==> @Volatile private final var running: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'component1' @ [345:18] ==> public final operator fun component1(): InMemoryMessagingNetwork.InMemoryMessaging.Handler defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [345:27] ==> public final operator fun component2(): ArrayList<InMemoryMessagingNetwork.MessageTransfer> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'state' @ [345:40] ==> private final val state: ThreadBox<InMemoryMessagingNetwork.InMemoryMessaging.InnerState> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'locked' @ [345:46] ==> public final inline fun <R> locked(body: InMemoryMessagingNetwork.InMemoryMessaging.InnerState.() -> Pair<InMemoryMessagingNetwork.InMemoryMessaging.Handler, ArrayList<InMemoryMessagingNetwork.MessageTransfer>>): Pair<InMemoryMessagingNetwork.InMemoryMessaging.Handler, ArrayList<InMemoryMessagingNetwork.MessageTransfer>> defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Pair<Handler, ArrayList<MessageTransfer>>

'Handler' @ [346:31] ==> public constructor Handler(topicSession: TopicSession, callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit) defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.Handler[ClassConstructorDescriptorImpl]

'topicSession' @ [346:39] ==> value-parameter topicSession: TopicSession defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler[ValueParameterDescriptorImpl]

'callback' @ [346:53] ==> value-parameter callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler[ValueParameterDescriptorImpl]

'apply' @ [346:63] ==> @InlineOnly public inline fun <T> InMemoryMessagingNetwork.InMemoryMessaging.Handler.apply(block: InMemoryMessagingNetwork.InMemoryMessaging.Handler.() -> Unit): InMemoryMessagingNetwork.InMemoryMessaging.Handler defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Handler

'handlers' @ [346:71] ==> public final val handlers: MutableList<InMemoryMessagingNetwork.InMemoryMessaging.Handler> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.InnerState[PropertyDescriptorImpl]

'add' @ [346:80] ==> public abstract fun add(element: InMemoryMessagingNetwork.InMemoryMessaging.Handler): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'this' @ [346:84] ==> <this> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ArrayList' @ [347:31] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MessageTransfer

'database' @ [348:17] ==> private final val database: CordaPersistence defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'transaction' @ [348:26] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'pending' @ [349:21] ==> val pending: ArrayList<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'addAll' @ [349:29] ==> public open fun addAll(elements: Collection<InMemoryMessagingNetwork.MessageTransfer>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'pendingRedelivery' @ [349:36] ==> public final val pendingRedelivery: LinkedHashSet<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.InnerState[PropertyDescriptorImpl]

'pendingRedelivery' @ [350:21] ==> public final val pendingRedelivery: LinkedHashSet<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.InnerState[PropertyDescriptorImpl]

'clear' @ [350:39] ==> public open fun clear(): Unit defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'Pair' @ [352:17] ==> public constructor Pair<out A, out B>(first: InMemoryMessagingNetwork.InMemoryMessaging.Handler, second: ArrayList<InMemoryMessagingNetwork.MessageTransfer>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Handler
    <out B> -> ArrayList<MessageTransfer>

'handler' @ [352:22] ==> val handler: InMemoryMessagingNetwork.InMemoryMessaging.Handler defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'pending' @ [352:31] ==> val pending: ArrayList<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'transfers' @ [355:13] ==> val transfers: ArrayList<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler[LocalVariableDescriptor]

'forEach' @ [355:23] ==> @HidesMembers public inline fun <T> Iterable<InMemoryMessagingNetwork.MessageTransfer>.forEach(action: (InMemoryMessagingNetwork.MessageTransfer) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MessageTransfer

'pumpSendInternal' @ [355:33] ==> public final fun pumpSendInternal(transfer: InMemoryMessagingNetwork.MessageTransfer): Unit defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'it' @ [355:50] ==> value-parameter it: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler.<anonymous>[ValueParameterDescriptorImpl]

'handler' @ [356:20] ==> val handler: InMemoryMessagingNetwork.InMemoryMessaging.Handler defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.addMessageHandler[LocalVariableDescriptor]

'check' @ [360:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'running' @ [360:19] ==> @Volatile private final var running: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'state' @ [361:13] ==> private final val state: ThreadBox<InMemoryMessagingNetwork.InMemoryMessaging.InnerState> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'locked' @ [361:19] ==> public final inline fun <R> locked(body: InMemoryMessagingNetwork.InMemoryMessaging.InnerState.() -> Unit): Unit defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'check' @ [361:28] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'handlers' @ [361:34] ==> public final val handlers: MutableList<InMemoryMessagingNetwork.InMemoryMessaging.Handler> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.InnerState[PropertyDescriptorImpl]

'remove' @ [361:43] ==> public abstract fun remove(element: InMemoryMessagingNetwork.InMemoryMessaging.Handler): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'registration' @ [361:50] ==> value-parameter registration: MessageHandlerRegistration defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.removeMessageHandler[ValueParameterDescriptorImpl]

'check' @ [365:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'running' @ [365:19] ==> @Volatile private final var running: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'msgSend' @ [366:13] ==> @Synchronized private final fun msgSend(from: InMemoryMessagingNetwork.InMemoryMessaging, message: Message, recipients: MessageRecipients): Unit defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'this' @ [366:21] ==> <this> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[LazyClassReceiverParameterDescriptor]

'message' @ [366:27] ==> value-parameter message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.send[ValueParameterDescriptorImpl]

'target' @ [366:36] ==> value-parameter target: MessageRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.send[ValueParameterDescriptorImpl]

'!' @ [367:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sendManuallyPumped' @ [367:18] ==> public final val sendManuallyPumped: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'pumpSend' @ [368:17] ==> public final fun pumpSend(block: Boolean): InMemoryMessagingNetwork.MessageTransfer? defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'backgroundThread' @ [373:17] ==> private final val backgroundThread: Thread? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'backgroundThread' @ [374:17] ==> private final val backgroundThread: Thread? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'interrupt' @ [374:34] ==> public open fun interrupt(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'backgroundThread' @ [375:17] ==> private final val backgroundThread: Thread? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'join' @ [375:34] ==> public final fun join(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'running' @ [377:13] ==> @Volatile private final var running: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'netNodeHasShutdown' @ [378:13] ==> @Synchronized private final fun netNodeHasShutdown(peerHandle: InMemoryMessagingNetwork.PeerHandle): Unit defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'peerHandle' @ [378:32] ==> private final val peerHandle: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'InMemoryMessage' @ [385:20] ==> public constructor InMemoryMessage(topicSession: TopicSession, data: ByteArray, uniqueMessageId: UUID, debugTimestamp: Instant = ...) defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessage[ClassConstructorDescriptorImpl]

'topicSession' @ [385:36] ==> value-parameter topicSession: TopicSession defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.createMessage[ValueParameterDescriptorImpl]

'data' @ [385:50] ==> value-parameter data: ByteArray defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.createMessage[ValueParameterDescriptorImpl]

'uuid' @ [385:56] ==> value-parameter uuid: UUID defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.createMessage[ValueParameterDescriptorImpl]

'check' @ [396:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'manuallyPumped' @ [396:19] ==> private final val manuallyPumped: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'check' @ [397:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'running' @ [397:19] ==> @Volatile private final var running: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'executor' @ [398:13] ==> private final val executor: AffinityExecutor defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'flush' @ [398:22] ==> public abstract fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor[DeserializedSimpleFunctionDescriptor]

'pumpReceiveInternal' @ [400:24] ==> private final fun pumpReceiveInternal(block: Boolean): InMemoryMessagingNetwork.MessageTransfer? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[SimpleFunctionDescriptorImpl]

'block' @ [400:44] ==> value-parameter block: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceive[ValueParameterDescriptorImpl]

'executor' @ [402:17] ==> private final val executor: AffinityExecutor defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'flush' @ [402:26] ==> public abstract fun flush(): Unit defined in net.corda.node.utilities.AffinityExecutor[DeserializedSimpleFunctionDescriptor]

'deliverTo' @ [415:20] ==> var deliverTo: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[LocalVariableDescriptor]

'?:' @ [416:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: InMemoryMessagingNetwork.MessageTransfer?, right: InMemoryMessagingNetwork.MessageTransfer): InMemoryMessagingNetwork.MessageTransfer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> MessageTransfer

'if (block) q.take() else q.poll()' @ [416:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?), elseBranch: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)): (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer..net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer?)

'block' @ [416:37] ==> value-parameter block: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[ValueParameterDescriptorImpl]

'q' @ [416:44] ==> value-parameter q: LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[ValueParameterDescriptorImpl]

'take' @ [416:46] ==> public open fun take(): (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?) defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'q' @ [416:58] ==> value-parameter q: LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[ValueParameterDescriptorImpl]

'poll' @ [416:60] ==> public open fun poll(): (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?) defined in java.util.concurrent.LinkedBlockingQueue[JavaMethodDescriptor]

'deliverTo' @ [417:17] ==> var deliverTo: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[LocalVariableDescriptor]

'state' @ [417:29] ==> private final val state: ThreadBox<InMemoryMessagingNetwork.InMemoryMessaging.InnerState> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'locked' @ [417:35] ==> public final inline fun <R> locked(body: InMemoryMessagingNetwork.InMemoryMessaging.InnerState.() -> List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>?): List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>? defined in net.corda.core.internal.ThreadBox[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> List<Handler>?

'handlers' @ [418:44] ==> public final val handlers: MutableList<InMemoryMessagingNetwork.InMemoryMessaging.Handler> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.InnerState[PropertyDescriptorImpl]

'filter' @ [418:53] ==> public inline fun <T> Iterable<InMemoryMessagingNetwork.InMemoryMessaging.Handler>.filter(predicate: (InMemoryMessagingNetwork.InMemoryMessaging.Handler) -> Boolean): List<InMemoryMessagingNetwork.InMemoryMessaging.Handler> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Handler

'it' @ [418:62] ==> value-parameter it: InMemoryMessagingNetwork.InMemoryMessaging.Handler defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'topicSession' @ [418:65] ==> public final val topicSession: TopicSession defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.Handler[PropertyDescriptorImpl]

'isBlank' @ [418:78] ==> public final fun isBlank(): Boolean defined in net.corda.node.services.messaging.TopicSession[DeserializedSimpleFunctionDescriptor]

'transfer' @ [418:91] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[LocalVariableDescriptor]

'message' @ [418:100] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'topicSession' @ [418:108] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'it' @ [418:124] ==> value-parameter it: InMemoryMessagingNetwork.InMemoryMessaging.Handler defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'topicSession' @ [418:127] ==> public final val topicSession: TopicSession defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.Handler[PropertyDescriptorImpl]

'if (matchingHandlers.isEmpty()) {
                        // Got no handlers for this message yet. Keep the message around and attempt redelivery after a new
                        // handler has been registered. The purpose of this path is to make unit tests that have multi-threading
                        // reliable, as a sender may attempt to send a message to a receiver that hasn't finished setting
                        // up a handler for yet. Most unit tests don't run threaded, but we want to test true parallelism at
                        // least sometimes.
                        log.warn("Message to ${transfer.message.topicSession} could not be delivered")
                        database.transaction {
                            pendingRedelivery.add(transfer)
                        }
                        null
                    } else {
                        matchingHandlers
                    }' @ [419:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>?, elseBranch: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>?): List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Handler>?

'matchingHandlers' @ [419:25] ==> val matchingHandlers: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [419:42] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [425:25] ==> private final val log: (Logger..Logger?) defined in net.corda.testing.node.InMemoryMessagingNetwork.Companion[PropertyDescriptorImpl]

'warn' @ [425:29] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'transfer' @ [425:48] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[LocalVariableDescriptor]

'message' @ [425:57] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'topicSession' @ [425:65] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'database' @ [426:25] ==> private final val database: CordaPersistence defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'transaction' @ [426:34] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Boolean): Boolean defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'pendingRedelivery' @ [427:29] ==> public final val pendingRedelivery: LinkedHashSet<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.InnerState[PropertyDescriptorImpl]

'add' @ [427:47] ==> public open fun add(element: InMemoryMessagingNetwork.MessageTransfer): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'transfer' @ [427:51] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[LocalVariableDescriptor]

'matchingHandlers' @ [431:25] ==> val matchingHandlers: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue.<anonymous>[LocalVariableDescriptor]

'deliverTo' @ [434:21] ==> var deliverTo: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[LocalVariableDescriptor]

'Pair' @ [435:28] ==> public constructor Pair<out A, out B>(first: InMemoryMessagingNetwork.MessageTransfer, second: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> MessageTransfer
    <out B> -> List<Handler>

'transfer' @ [435:33] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[LocalVariableDescriptor]

'deliverTo' @ [435:43] ==> var deliverTo: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.getNextQueue[LocalVariableDescriptor]

'getQueueForPeerHandle' @ [442:21] ==> @Synchronized private final fun getQueueForPeerHandle(recipients: InMemoryMessagingNetwork.PeerHandle): LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork[SimpleFunctionDescriptorImpl]

'peerHandle' @ [442:43] ==> private final val peerHandle: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'getNextQueue' @ [443:24] ==> private final fun getNextQueue(q: LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer>, block: Boolean): Pair<InMemoryMessagingNetwork.MessageTransfer, List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>>? defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[SimpleFunctionDescriptorImpl]

'q' @ [443:37] ==> val q: LinkedBlockingQueue<InMemoryMessagingNetwork.MessageTransfer> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[LocalVariableDescriptor]

'block' @ [443:40] ==> value-parameter block: Boolean defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[ValueParameterDescriptorImpl]

'component1' @ [444:18] ==> public final operator fun component1(): InMemoryMessagingNetwork.MessageTransfer defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [444:28] ==> public final operator fun component2(): List<InMemoryMessagingNetwork.InMemoryMessaging.Handler> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'next' @ [444:41] ==> val next: Pair<InMemoryMessagingNetwork.MessageTransfer, List<InMemoryMessagingNetwork.InMemoryMessaging.Handler>> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[LocalVariableDescriptor]

'if (transfer.message.uniqueMessageId !in processedMessages) {
                executor.execute {
                    database.transaction {
                        for (handler in deliverTo) {
                            try {
                                handler.callback(transfer.toReceivedMessage(), handler)
                            } catch(e: Exception) {
                                log.error("Caught exception in handler for $this/${handler.topicSession}", e)
                            }
                        }
                        _receivedMessages.onNext(transfer)
                        processedMessages += transfer.message.uniqueMessageId
                        messagesInFlight.countDown()
                    }
                }
            } else {
                log.info("Drop duplicate message ${transfer.message.uniqueMessageId}")
            }' @ [446:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'transfer' @ [446:17] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[LocalVariableDescriptor]

'message' @ [446:26] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'uniqueMessageId' @ [446:34] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'processedMessages' @ [446:54] ==> private final val processedMessages: MutableSet<UUID> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'executor' @ [447:17] ==> private final val executor: AffinityExecutor defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'execute' @ [447:26] ==> public final fun execute(p0: (() -> Unit..(() -> Unit)?)): Unit defined in net.corda.node.utilities.AffinityExecutor[MyFunctionDescriptor]

'database' @ [448:21] ==> private final val database: CordaPersistence defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'transaction' @ [448:30] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'deliverTo' @ [449:41] ==> val deliverTo: List<InMemoryMessagingNetwork.InMemoryMessaging.Handler> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[LocalVariableDescriptor]

'handler' @ [451:33] ==> val handler: InMemoryMessagingNetwork.InMemoryMessaging.Handler defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal.<anonymous>.<anonymous>[LocalVariableDescriptor]

'invoke' @ [451:41] ==> public abstract operator fun invoke(p1: ReceivedMessage, p2: MessageHandlerRegistration): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'transfer' @ [451:50] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[LocalVariableDescriptor]

'toReceivedMessage' @ [451:59] ==> private final fun InMemoryMessagingNetwork.MessageTransfer.toReceivedMessage(): ReceivedMessage defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[SimpleFunctionDescriptorImpl]

'handler' @ [451:80] ==> val handler: InMemoryMessagingNetwork.InMemoryMessaging.Handler defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal.<anonymous>.<anonymous>[LocalVariableDescriptor]

'log' @ [453:33] ==> private final val log: (Logger..Logger?) defined in net.corda.testing.node.InMemoryMessagingNetwork.Companion[PropertyDescriptorImpl]

'error' @ [453:37] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'this' @ [453:77] ==> <this> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'handler' @ [453:84] ==> val handler: InMemoryMessagingNetwork.InMemoryMessaging.Handler defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal.<anonymous>.<anonymous>[LocalVariableDescriptor]

'topicSession' @ [453:92] ==> public final val topicSession: TopicSession defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.Handler[PropertyDescriptorImpl]

'e' @ [453:108] ==> val e: Exception /* = Exception */ defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal.<anonymous>.<anonymous>[LocalVariableDescriptor]

'_receivedMessages' @ [456:25] ==> private final val _receivedMessages: (PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>..PublishSubject<(InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)>?) defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'onNext' @ [456:43] ==> public open fun onNext(p0: (InMemoryMessagingNetwork.MessageTransfer..InMemoryMessagingNetwork.MessageTransfer?)): Unit defined in rx.subjects.PublishSubject[JavaMethodDescriptor]

'transfer' @ [456:50] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[LocalVariableDescriptor]

'processedMessages' @ [457:25] ==> private final val processedMessages: MutableSet<UUID> defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging[PropertyDescriptorImpl]

'transfer' @ [457:46] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[LocalVariableDescriptor]

'message' @ [457:55] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'uniqueMessageId' @ [457:63] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'messagesInFlight' @ [458:25] ==> private final val messagesInFlight: ReusableLatch defined in net.corda.testing.node.InMemoryMessagingNetwork[PropertyDescriptorImpl]

'countDown' @ [458:42] ==> public open fun countDown(): Unit defined in org.apache.activemq.artemis.utils.ReusableLatch[JavaMethodDescriptor]

'log' @ [462:17] ==> private final val log: (Logger..Logger?) defined in net.corda.testing.node.InMemoryMessagingNetwork.Companion[PropertyDescriptorImpl]

'info' @ [462:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'transfer' @ [462:52] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[LocalVariableDescriptor]

'message' @ [462:61] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'uniqueMessageId' @ [462:69] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'transfer' @ [464:20] ==> val transfer: InMemoryMessagingNetwork.MessageTransfer defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryMessaging.pumpReceiveInternal[LocalVariableDescriptor]

'InMemoryReceivedMessage' @ [467:76] ==> public constructor InMemoryReceivedMessage(topicSession: TopicSession, data: ByteArray, platformVersion: Int, uniqueMessageId: UUID, debugTimestamp: Instant, peer: X500Name) defined in net.corda.testing.node.InMemoryMessagingNetwork.InMemoryReceivedMessage[ClassConstructorDescriptorImpl]

'message' @ [468:17] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'topicSession' @ [468:25] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'message' @ [469:17] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'data' @ [469:25] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'copyOf' @ [469:30] ==> @InlineOnly public inline fun ByteArray.copyOf(): ByteArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'message' @ [471:17] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'uniqueMessageId' @ [471:25] ==> public abstract val uniqueMessageId: UUID defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'message' @ [472:17] ==> public final val message: Message defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'debugTimestamp' @ [472:25] ==> public abstract val debugTimestamp: Instant defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'sender' @ [473:17] ==> public final val sender: InMemoryMessagingNetwork.PeerHandle defined in net.corda.testing.node.InMemoryMessagingNetwork.MessageTransfer[PropertyDescriptorImpl]

'description' @ [473:24] ==> public final val description: X500Name defined in net.corda.testing.node.InMemoryMessagingNetwork.PeerHandle[PropertyDescriptorImpl]

