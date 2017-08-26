'ThreadSafe' @ [44:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [45:75] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'loggerFor' @ [47:22] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> InMemoryNetworkMapCache

'registeredNodes' @ [50:53] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'map' @ [50:69] ==> public inline fun <K, V, R> Map<out PublicKey, NodeInfo>.map(transform: (Map.Entry<PublicKey, NodeInfo>) -> NodeInfo): List<NodeInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PublicKey
    <V> -> NodeInfo
    <R> -> NodeInfo

'it' @ [50:75] ==> value-parameter it: Map.Entry<PublicKey, NodeInfo> defined in net.corda.node.services.network.InMemoryNetworkMapCache.<get-partyNodes>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [50:78] ==> public abstract val value: NodeInfo defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'getNodesWithService' @ [51:58] ==> public open fun getNodesWithService(serviceType: ServiceType): List<NodeInfo> defined in net.corda.node.services.network.InMemoryNetworkMapCache[DeserializedSimpleFunctionDescriptor]

'type' @ [51:96] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'create' @ [52:43] ==> public open fun <T : (Any..Any?)> create(): (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in rx.subjects.PublishSubject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MapChange

'_changed' @ [54:51] ==> private final val _changed: (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'wrapWithDatabaseTransaction' @ [54:60] ==> public fun <T : Any> Observable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>.wrapWithDatabaseTransaction(db: CordaPersistence? = ...): Observable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.node.services.NetworkMapCache.MapChange..net.corda.core.node.services.NetworkMapCache.MapChange?)

'_changed' @ [55:65] ==> private final val _changed: (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'bufferUntilDatabaseCommit' @ [55:74] ==> public fun <T : Any> Observer<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>.bufferUntilDatabaseCommit(): Observer<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.node.services.NetworkMapCache.MapChange..net.corda.core.node.services.NetworkMapCache.MapChange?)

'openFuture' @ [57:39] ==> public fun <V> openFuture(): OpenFuture<Void?> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Void?

'_registrationFuture' @ [58:67] ==> private final val _registrationFuture: OpenFuture<Void?> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'synchronizedMap' @ [61:82] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> synchronizedMap(p0: (MutableMap<(PublicKey..PublicKey?), (NodeInfo..NodeInfo?)>..Map<(PublicKey..PublicKey?), (NodeInfo..NodeInfo?)>?)): (MutableMap<(PublicKey..PublicKey?), (NodeInfo..NodeInfo?)>..Map<(PublicKey..PublicKey?), (NodeInfo..NodeInfo?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (java.security.PublicKey..java.security.PublicKey?)
    <V : (Any..Any?)> -> (net.corda.core.node.NodeInfo..net.corda.core.node.NodeInfo?)

'HashMap' @ [61:98] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (java.security.PublicKey..java.security.PublicKey?)
    <V : (Any..Any?)> -> (net.corda.core.node.NodeInfo..net.corda.core.node.NodeInfo?)

'registeredNodes' @ [64:20] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'party' @ [64:36] ==> value-parameter party: Party defined in net.corda.node.services.network.InMemoryNetworkMapCache.getPartyInfo[ValueParameterDescriptorImpl]

'owningKey' @ [64:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'node' @ [65:13] ==> val node: NodeInfo? defined in net.corda.node.services.network.InMemoryNetworkMapCache.getPartyInfo[LocalVariableDescriptor]

'Node' @ [66:30] ==> public constructor Node(node: NodeInfo) defined in net.corda.core.node.services.PartyInfo.Node[DeserializedClassConstructorDescriptor]

'node' @ [66:35] ==> val node: NodeInfo? defined in net.corda.node.services.network.InMemoryNetworkMapCache.getPartyInfo[LocalVariableDescriptor]

'component1' @ [68:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PublicKey, NodeInfo>.component1(): PublicKey defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PublicKey
    <V> -> NodeInfo

'component2' @ [68:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PublicKey, NodeInfo>.component2(): NodeInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PublicKey
    <V> -> NodeInfo

'registeredNodes' @ [68:28] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'value' @ [69:29] ==> val value: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCache.getPartyInfo[LocalVariableDescriptor]

'advertisedServices' @ [69:35] ==> public final val advertisedServices: List<ServiceEntry> defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'service' @ [70:21] ==> val service: ServiceEntry defined in net.corda.node.services.network.InMemoryNetworkMapCache.getPartyInfo[LocalVariableDescriptor]

'identity' @ [70:29] ==> public final val identity: PartyAndCertificate defined in net.corda.core.node.ServiceEntry[DeserializedPropertyDescriptor]

'party' @ [70:38] ==> public final val party: Party defined in net.corda.core.identity.PartyAndCertificate[DeserializedPropertyDescriptor]

'party' @ [70:47] ==> value-parameter party: Party defined in net.corda.node.services.network.InMemoryNetworkMapCache.getPartyInfo[ValueParameterDescriptorImpl]

'Service' @ [71:38] ==> public constructor Service(service: ServiceEntry) defined in net.corda.core.node.services.PartyInfo.Service[DeserializedClassConstructorDescriptor]

'service' @ [71:46] ==> val service: ServiceEntry defined in net.corda.node.services.network.InMemoryNetworkMapCache.getPartyInfo[LocalVariableDescriptor]

'registeredNodes' @ [78:81] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'identityKey' @ [78:97] ==> value-parameter identityKey: PublicKey defined in net.corda.node.services.network.InMemoryNetworkMapCache.getNodeByLegalIdentityKey[ValueParameterDescriptorImpl]

'if (serviceHub != null) {
            serviceHub.identityService.partyFromAnonymous(party)
        } else {
            party
        }' @ [80:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: AbstractParty?, elseBranch: AbstractParty?): AbstractParty?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AbstractParty?

'serviceHub' @ [80:34] ==> private final val serviceHub: ServiceHub? defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'serviceHub' @ [81:13] ==> private final val serviceHub: ServiceHub? defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'identityService' @ [81:24] ==> public abstract val identityService: IdentityService defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'partyFromAnonymous' @ [81:40] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'party' @ [81:59] ==> value-parameter party: AbstractParty defined in net.corda.node.services.network.InMemoryNetworkMapCache.getNodeByLegalIdentity[ValueParameterDescriptorImpl]

'party' @ [83:13] ==> value-parameter party: AbstractParty defined in net.corda.node.services.network.InMemoryNetworkMapCache.getNodeByLegalIdentity[ValueParameterDescriptorImpl]

'wellKnownParty' @ [86:16] ==> val wellKnownParty: AbstractParty? defined in net.corda.node.services.network.InMemoryNetworkMapCache.getNodeByLegalIdentity[LocalVariableDescriptor]

'let' @ [86:32] ==> @InlineOnly public inline fun <T, R> AbstractParty.let(block: (AbstractParty) -> NodeInfo?): NodeInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> NodeInfo?

'getNodeByLegalIdentityKey' @ [87:13] ==> public open fun getNodeByLegalIdentityKey(identityKey: PublicKey): NodeInfo? defined in net.corda.node.services.network.InMemoryNetworkMapCache[SimpleFunctionDescriptorImpl]

'it' @ [87:39] ==> value-parameter it: AbstractParty defined in net.corda.node.services.network.InMemoryNetworkMapCache.getNodeByLegalIdentity.<anonymous>[ValueParameterDescriptorImpl]

'owningKey' @ [87:42] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AbstractParty[DeserializedPropertyDescriptor]

'synchronized' @ [92:9] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Nothing

'_changed' @ [92:22] ==> private final val _changed: (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'DataFeed' @ [93:20] ==> public constructor DataFeed<out A, B>(snapshot: List<NodeInfo>, updates: Observable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>) defined in net.corda.core.messaging.DataFeed[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> List<NodeInfo>
    <B> -> (net.corda.core.node.services.NetworkMapCache.MapChange..net.corda.core.node.services.NetworkMapCache.MapChange?)

'partyNodes' @ [93:29] ==> public open val partyNodes: List<NodeInfo> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'_changed' @ [93:41] ==> private final val _changed: (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'bufferUntilSubscribed' @ [93:50] ==> public fun <T> Observable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>.bufferUntilSubscribed(): Observable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.core.node.services.NetworkMapCache.MapChange..net.corda.core.node.services.NetworkMapCache.MapChange?)

'wrapWithDatabaseTransaction' @ [93:74] ==> public fun <T : Any> Observable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>.wrapWithDatabaseTransaction(db: CordaPersistence? = ...): Observable<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)> defined in net.corda.node.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> (net.corda.core.node.services.NetworkMapCache.MapChange..net.corda.core.node.services.NetworkMapCache.MapChange?)

'subscribe' @ [99:13] ==> value-parameter subscribe: Boolean defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'!' @ [99:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'registeredForPush' @ [99:27] ==> private final var registeredForPush: Boolean defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'network' @ [101:13] ==> value-parameter network: MessagingService defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'addMessageHandler' @ [101:21] ==> public abstract fun addMessageHandler(topic: String = ..., sessionID: Long = ..., callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'PUSH_TOPIC' @ [101:57] ==> public final val PUSH_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'message' @ [103:31] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [103:39] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'deserialize' @ [103:44] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): NetworkMapService.Update defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Update

'network' @ [104:38] ==> value-parameter network: MessagingService defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'createMessage' @ [104:46] ==> public fun MessagingService.createMessage(topic: String, sessionID: Long = ..., data: ByteArray): Message defined in net.corda.node.services.messaging in file Messaging.kt[SimpleFunctionDescriptorImpl]

'PUSH_ACK_TOPIC' @ [104:78] ==> public final val PUSH_ACK_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'UpdateAcknowledge' @ [105:54] ==> public constructor UpdateAcknowledge(mapVersion: Int, replyTo: MessageRecipients) defined in net.corda.node.services.network.NetworkMapService.UpdateAcknowledge[ClassConstructorDescriptorImpl]

'req' @ [105:72] ==> val req: NetworkMapService.Update defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService.<anonymous>[LocalVariableDescriptor]

'mapVersion' @ [105:76] ==> public final val mapVersion: Int defined in net.corda.node.services.network.NetworkMapService.Update[PropertyDescriptorImpl]

'network' @ [105:88] ==> value-parameter network: MessagingService defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'myAddress' @ [105:96] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[PropertyDescriptorImpl]

'serialize' @ [105:107] ==> public fun <T : Any> NetworkMapService.UpdateAcknowledge.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<NetworkMapService.UpdateAcknowledge> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> UpdateAcknowledge

'bytes' @ [105:119] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'network' @ [106:21] ==> value-parameter network: MessagingService defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'send' @ [106:29] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'ackMessage' @ [106:34] ==> val ackMessage: Message defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService.<anonymous>[LocalVariableDescriptor]

'req' @ [106:46] ==> val req: NetworkMapService.Update defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService.<anonymous>[LocalVariableDescriptor]

'replyTo' @ [106:50] ==> public final val replyTo: MessageRecipients defined in net.corda.node.services.network.NetworkMapService.Update[PropertyDescriptorImpl]

'processUpdatePush' @ [107:21] ==> public final fun processUpdatePush(req: NetworkMapService.Update): Unit defined in net.corda.node.services.network.InMemoryNetworkMapCache[SimpleFunctionDescriptorImpl]

'req' @ [107:39] ==> val req: NetworkMapService.Update defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService.<anonymous>[LocalVariableDescriptor]

'logger' @ [109:21] ==> public final val logger: Logger defined in net.corda.node.services.network.InMemoryNetworkMapCache.Companion[PropertyDescriptorImpl]

'warn' @ [109:28] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [109:86] ==> val e: NodeMapError defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService.<anonymous>[LocalVariableDescriptor]

'javaClass' @ [109:88] ==> public val <T : Any> NodeMapError.javaClass: Class<NodeMapError> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> NodeMapError

'name' @ [109:98] ==> public final val <T : (Any..Any?)> Class<NodeMapError>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeMapError

'logger' @ [111:21] ==> public final val logger: Logger defined in net.corda.node.services.network.InMemoryNetworkMapCache.Companion[PropertyDescriptorImpl]

'error' @ [111:28] ==> public abstract fun error(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'e' @ [111:90] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService.<anonymous>[LocalVariableDescriptor]

'registeredForPush' @ [114:13] ==> private final var registeredForPush: Boolean defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'NetworkMapService' @ [118:19] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'FetchMapRequest' @ [118:37] ==> public constructor FetchMapRequest(subscribe: Boolean, ifChangedSinceVersion: Int?, replyTo: SingleMessageRecipient, sessionID: Long = ...) defined in net.corda.node.services.network.NetworkMapService.FetchMapRequest[ClassConstructorDescriptorImpl]

'subscribe' @ [118:53] ==> value-parameter subscribe: Boolean defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'ifChangedSinceVer' @ [118:64] ==> value-parameter ifChangedSinceVer: Int? defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'network' @ [118:83] ==> value-parameter network: MessagingService defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'myAddress' @ [118:91] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[PropertyDescriptorImpl]

'network' @ [119:22] ==> value-parameter network: MessagingService defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'sendRequest' @ [119:30] ==> public fun <R : Any> MessagingService.sendRequest(topic: String, request: ServiceRequestMessage, target: MessageRecipients): CordaFuture<NetworkMapService.FetchMapResponse> defined in net.corda.node.services.messaging[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Any> -> FetchMapResponse

'FETCH_TOPIC' @ [119:78] ==> public final val FETCH_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'req' @ [119:91] ==> val req: NetworkMapService.FetchMapRequest defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[LocalVariableDescriptor]

'networkMapAddress' @ [119:96] ==> value-parameter networkMapAddress: SingleMessageRecipient defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[ValueParameterDescriptorImpl]

'map' @ [119:115] ==> public fun <V, W> CordaFuture<out NetworkMapService.FetchMapResponse>.map(transform: (NetworkMapService.FetchMapResponse) -> Unit): CordaFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> FetchMapResponse
    <W> -> Unit

'component1' @ [119:122] ==> public final operator fun component1(): List<NodeRegistration>? defined in net.corda.node.services.network.NetworkMapService.FetchMapResponse[SimpleFunctionDescriptorImpl]

'nodes' @ [121:13] ==> val nodes: List<NodeRegistration>? defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService.<anonymous>[LocalVariableDescriptor]

'forEach' @ [121:20] ==> @HidesMembers public inline fun <T> Iterable<NodeRegistration>.forEach(action: (NodeRegistration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeRegistration

'processRegistration' @ [121:30] ==> private final fun processRegistration(reg: NodeRegistration): Unit defined in net.corda.node.services.network.InMemoryNetworkMapCache[SimpleFunctionDescriptorImpl]

'it' @ [121:50] ==> value-parameter it: NodeRegistration defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Unit' @ [122:13] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'_registrationFuture' @ [124:9] ==> private final val _registrationFuture: OpenFuture<Void?> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'captureLater' @ [124:29] ==> public open fun captureLater(f: CordaFuture<out Void?>): Unit defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'future' @ [124:42] ==> val future: CordaFuture<Unit> defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[LocalVariableDescriptor]

'map' @ [124:49] ==> public fun <V, W> CordaFuture<out Unit>.map(transform: (Unit) -> Nothing?): CordaFuture<Nothing?> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit
    <W> -> Nothing?

'future' @ [126:16] ==> val future: CordaFuture<Unit> defined in net.corda.node.services.network.InMemoryNetworkMapCache.addMapService[LocalVariableDescriptor]

'synchronized' @ [130:9] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'_changed' @ [130:22] ==> private final val _changed: (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'registeredNodes' @ [131:32] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'put' @ [131:48] ==> public abstract fun put(key: PublicKey, value: NodeInfo): NodeInfo? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'node' @ [131:52] ==> value-parameter node: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCache.addNode[ValueParameterDescriptorImpl]

'legalIdentity' @ [131:57] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [131:71] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'node' @ [131:82] ==> value-parameter node: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCache.addNode[ValueParameterDescriptorImpl]

'if (previousNode == null) {
                changePublisher.onNext(MapChange.Added(node))
            } else if (previousNode != node) {
                changePublisher.onNext(MapChange.Modified(node, previousNode))
            }' @ [132:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'previousNode' @ [132:17] ==> val previousNode: NodeInfo? defined in net.corda.node.services.network.InMemoryNetworkMapCache.addNode.<anonymous>[LocalVariableDescriptor]

'changePublisher' @ [133:17] ==> private final val changePublisher: Observer<NetworkMapCache.MapChange> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'onNext' @ [133:33] ==> public abstract fun onNext(p0: (NetworkMapCache.MapChange..NetworkMapCache.MapChange?)): Unit defined in rx.Observer[JavaMethodDescriptor]

'Added' @ [133:50] ==> public constructor Added(node: NodeInfo) defined in net.corda.core.node.services.NetworkMapCache.MapChange.Added[DeserializedClassConstructorDescriptor]

'node' @ [133:56] ==> value-parameter node: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCache.addNode[ValueParameterDescriptorImpl]

'previousNode' @ [134:24] ==> val previousNode: NodeInfo? defined in net.corda.node.services.network.InMemoryNetworkMapCache.addNode.<anonymous>[LocalVariableDescriptor]

'node' @ [134:40] ==> value-parameter node: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCache.addNode[ValueParameterDescriptorImpl]

'changePublisher' @ [135:17] ==> private final val changePublisher: Observer<NetworkMapCache.MapChange> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'onNext' @ [135:33] ==> public abstract fun onNext(p0: (NetworkMapCache.MapChange..NetworkMapCache.MapChange?)): Unit defined in rx.Observer[JavaMethodDescriptor]

'Modified' @ [135:50] ==> public constructor Modified(node: NodeInfo, previousNode: NodeInfo) defined in net.corda.core.node.services.NetworkMapCache.MapChange.Modified[DeserializedClassConstructorDescriptor]

'node' @ [135:59] ==> value-parameter node: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCache.addNode[ValueParameterDescriptorImpl]

'previousNode' @ [135:65] ==> val previousNode: NodeInfo? defined in net.corda.node.services.network.InMemoryNetworkMapCache.addNode.<anonymous>[LocalVariableDescriptor]

'synchronized' @ [141:9] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'_changed' @ [141:22] ==> private final val _changed: (PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>..PublishSubject<(NetworkMapCache.MapChange..NetworkMapCache.MapChange?)>?) defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'registeredNodes' @ [142:13] ==> protected final var registeredNodes: MutableMap<PublicKey, NodeInfo> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'remove' @ [142:29] ==> public abstract fun remove(key: PublicKey): NodeInfo? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'node' @ [142:36] ==> value-parameter node: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCache.removeNode[ValueParameterDescriptorImpl]

'legalIdentity' @ [142:41] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'owningKey' @ [142:55] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'changePublisher' @ [143:13] ==> private final val changePublisher: Observer<NetworkMapCache.MapChange> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'onNext' @ [143:29] ==> public abstract fun onNext(p0: (NetworkMapCache.MapChange..NetworkMapCache.MapChange?)): Unit defined in rx.Observer[JavaMethodDescriptor]

'Removed' @ [143:46] ==> public constructor Removed(node: NodeInfo) defined in net.corda.core.node.services.NetworkMapCache.MapChange.Removed[DeserializedClassConstructorDescriptor]

'node' @ [143:54] ==> value-parameter node: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCache.removeNode[ValueParameterDescriptorImpl]

'NetworkMapService' @ [153:19] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'SubscribeRequest' @ [153:37] ==> public constructor SubscribeRequest(subscribe: Boolean, replyTo: SingleMessageRecipient, sessionID: Long = ...) defined in net.corda.node.services.network.NetworkMapService.SubscribeRequest[ClassConstructorDescriptorImpl]

'network' @ [153:61] ==> value-parameter network: MessagingService defined in net.corda.node.services.network.InMemoryNetworkMapCache.deregisterForUpdates[ValueParameterDescriptorImpl]

'myAddress' @ [153:69] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[PropertyDescriptorImpl]

'network' @ [155:23] ==> value-parameter network: MessagingService defined in net.corda.node.services.network.InMemoryNetworkMapCache.deregisterForUpdates[ValueParameterDescriptorImpl]

'getAddressOfParty' @ [155:31] ==> public abstract fun getAddressOfParty(partyInfo: PartyInfo): MessageRecipients defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'Node' @ [155:59] ==> public constructor Node(node: NodeInfo) defined in net.corda.core.node.services.PartyInfo.Node[DeserializedClassConstructorDescriptor]

'service' @ [155:64] ==> value-parameter service: NodeInfo defined in net.corda.node.services.network.InMemoryNetworkMapCache.deregisterForUpdates[ValueParameterDescriptorImpl]

'network' @ [156:22] ==> value-parameter network: MessagingService defined in net.corda.node.services.network.InMemoryNetworkMapCache.deregisterForUpdates[ValueParameterDescriptorImpl]

'sendRequest' @ [156:30] ==> public fun <R : Any> MessagingService.sendRequest(topic: String, request: ServiceRequestMessage, target: MessageRecipients): CordaFuture<NetworkMapService.SubscribeResponse> defined in net.corda.node.services.messaging[SimpleFunctionDescriptorImpl]
Inferred types:
    <R : Any> -> SubscribeResponse

'SUBSCRIPTION_TOPIC' @ [156:79] ==> public final val SUBSCRIPTION_TOPIC: String defined in net.corda.node.services.network.NetworkMapService.Companion[PropertyDescriptorImpl]

'req' @ [156:99] ==> val req: NetworkMapService.SubscribeRequest defined in net.corda.node.services.network.InMemoryNetworkMapCache.deregisterForUpdates[LocalVariableDescriptor]

'address' @ [156:104] ==> val address: MessageRecipients defined in net.corda.node.services.network.InMemoryNetworkMapCache.deregisterForUpdates[LocalVariableDescriptor]

'map' @ [156:113] ==> public fun <V, W> CordaFuture<out NetworkMapService.SubscribeResponse>.map(transform: (NetworkMapService.SubscribeResponse) -> Unit): CordaFuture<Unit> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> SubscribeResponse
    <W> -> Unit

'if (it.confirmed) Unit else throw NetworkCacheError.DeregistrationFailed()' @ [157:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'it' @ [157:17] ==> value-parameter it: NetworkMapService.SubscribeResponse defined in net.corda.node.services.network.InMemoryNetworkMapCache.deregisterForUpdates.<anonymous>[ValueParameterDescriptorImpl]

'confirmed' @ [157:20] ==> public final val confirmed: Boolean defined in net.corda.node.services.network.NetworkMapService.SubscribeResponse[PropertyDescriptorImpl]

'Unit' @ [157:31] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'DeregistrationFailed' @ [157:65] ==> public constructor DeregistrationFailed() defined in net.corda.node.services.api.NetworkCacheError.DeregistrationFailed[ClassConstructorDescriptorImpl]

'_registrationFuture' @ [159:9] ==> private final val _registrationFuture: OpenFuture<Void?> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'captureLater' @ [159:29] ==> public open fun captureLater(f: CordaFuture<out Void?>): Unit defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'future' @ [159:42] ==> val future: CordaFuture<Unit> defined in net.corda.node.services.network.InMemoryNetworkMapCache.deregisterForUpdates[LocalVariableDescriptor]

'map' @ [159:49] ==> public fun <V, W> CordaFuture<out Unit>.map(transform: (Unit) -> Nothing?): CordaFuture<Nothing?> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Unit
    <W> -> Nothing?

'future' @ [160:16] ==> val future: CordaFuture<Unit> defined in net.corda.node.services.network.InMemoryNetworkMapCache.deregisterForUpdates[LocalVariableDescriptor]

'req' @ [165:23] ==> value-parameter req: NetworkMapService.Update defined in net.corda.node.services.network.InMemoryNetworkMapCache.processUpdatePush[ValueParameterDescriptorImpl]

'wireReg' @ [165:27] ==> public final val wireReg: WireNodeRegistration defined in net.corda.node.services.network.NetworkMapService.Update[PropertyDescriptorImpl]

'verified' @ [165:35] ==> public final fun verified(): NodeRegistration defined in net.corda.node.services.network.WireNodeRegistration[DeserializedSimpleFunctionDescriptor]

'processRegistration' @ [166:13] ==> private final fun processRegistration(reg: NodeRegistration): Unit defined in net.corda.node.services.network.InMemoryNetworkMapCache[SimpleFunctionDescriptorImpl]

'reg' @ [166:33] ==> val reg: NodeRegistration defined in net.corda.node.services.network.InMemoryNetworkMapCache.processUpdatePush[LocalVariableDescriptor]

'InvalidSignature' @ [168:32] ==> public constructor InvalidSignature() defined in net.corda.node.services.network.NodeMapError.InvalidSignature[ClassConstructorDescriptorImpl]

'when (reg.type) {
            AddOrRemove.ADD -> addNode(reg.node)
            AddOrRemove.REMOVE -> removeNode(reg.node)
        }' @ [175:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'reg' @ [175:15] ==> value-parameter reg: NodeRegistration defined in net.corda.node.services.network.InMemoryNetworkMapCache.processRegistration[ValueParameterDescriptorImpl]

'type' @ [175:19] ==> public final val type: AddOrRemove defined in net.corda.node.services.network.NodeRegistration[PropertyDescriptorImpl]

'ADD' @ [176:25] ==> enum entry ADD defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'addNode' @ [176:32] ==> public open fun addNode(node: NodeInfo): Unit defined in net.corda.node.services.network.InMemoryNetworkMapCache[SimpleFunctionDescriptorImpl]

'reg' @ [176:40] ==> value-parameter reg: NodeRegistration defined in net.corda.node.services.network.InMemoryNetworkMapCache.processRegistration[ValueParameterDescriptorImpl]

'node' @ [176:44] ==> public final val node: NodeInfo defined in net.corda.node.services.network.NodeRegistration[PropertyDescriptorImpl]

'REMOVE' @ [177:25] ==> enum entry REMOVE defined in net.corda.node.utilities.AddOrRemove[FakeCallableDescriptorForObject]

'removeNode' @ [177:35] ==> public open fun removeNode(node: NodeInfo): Unit defined in net.corda.node.services.network.InMemoryNetworkMapCache[SimpleFunctionDescriptorImpl]

'reg' @ [177:46] ==> value-parameter reg: NodeRegistration defined in net.corda.node.services.network.InMemoryNetworkMapCache.processRegistration[ValueParameterDescriptorImpl]

'node' @ [177:50] ==> public final val node: NodeInfo defined in net.corda.node.services.network.NodeRegistration[PropertyDescriptorImpl]

'VisibleForTesting' @ [181:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'_registrationFuture' @ [183:9] ==> private final val _registrationFuture: OpenFuture<Void?> defined in net.corda.node.services.network.InMemoryNetworkMapCache[PropertyDescriptorImpl]

'set' @ [183:29] ==> public abstract fun set(value: Void?): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

