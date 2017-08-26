'CordaSerializable' @ [55:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'CordaSerializable' @ [59:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'ReplicaResponse' @ [61:52] ==> private constructor ReplicaResponse() defined in net.corda.node.services.transactions.BFTSMaRt.ReplicaResponse[ClassConstructorDescriptorImpl]

'ReplicaResponse' @ [62:67] ==> private constructor ReplicaResponse() defined in net.corda.node.services.transactions.BFTSMaRt.ReplicaResponse[ClassConstructorDescriptorImpl]

'CordaSerializable' @ [66:5] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'ClusterResponse' @ [68:52] ==> private constructor ClusterResponse() defined in net.corda.node.services.transactions.BFTSMaRt.ClusterResponse[ClassConstructorDescriptorImpl]

'ClusterResponse' @ [69:75] ==> private constructor ClusterResponse() defined in net.corda.node.services.transactions.BFTSMaRt.ClusterResponse[ClassConstructorDescriptorImpl]

'SingletonSerializeAsToken' @ [77:101] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'loggerFor' @ [79:31] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Client

'ServiceProxy' @ [83:29] ==> public constructor ServiceProxy(p0: Int, p1: (String..String?), p2: (Comparator<(ByteArray..ByteArray?)>..Comparator<(ByteArray..ByteArray?)>?), p3: (Extractor..Extractor?)) defined in bftsmart.tom.ServiceProxy[JavaClassConstructorDescriptor]

'clientId' @ [83:42] ==> private final val clientId: Int defined in net.corda.node.services.transactions.BFTSMaRt.Client[PropertyDescriptorImpl]

'config' @ [83:52] ==> value-parameter config: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTSMaRt.Client.<init>[ValueParameterDescriptorImpl]

'path' @ [83:59] ==> public final val path: Path defined in net.corda.node.services.transactions.BFTSMaRtConfig[PropertyDescriptorImpl]

'toString' @ [83:64] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'buildResponseComparator' @ [83:76] ==> private final fun buildResponseComparator(): Comparator<ByteArray> defined in net.corda.node.services.transactions.BFTSMaRt.Client[SimpleFunctionDescriptorImpl]

'buildExtractor' @ [83:103] ==> private final fun buildExtractor(): Extractor defined in net.corda.node.services.transactions.BFTSMaRt.Client[SimpleFunctionDescriptorImpl]

'proxy' @ [84:37] ==> private final val proxy: ServiceProxy defined in net.corda.node.services.transactions.BFTSMaRt.Client[PropertyDescriptorImpl]

'communicationSystem' @ [84:43] ==> public final val ServiceProxy.communicationSystem: (CommunicationSystemClientSide..CommunicationSystemClientSide?)[MyPropertyDescriptor]

'declaredField' @ [84:114] ==> public fun <T> Any.declaredField(name: String): DeclaredField<Map<Int, NettyClientServerSession>> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<Int, NettyClientServerSession>

'value' @ [84:180] ==> public final var value: Map<Int, NettyClientServerSession> defined in net.corda.core.internal.DeclaredField[DeserializedPropertyDescriptor]

'proxy' @ [87:13] ==> private final val proxy: ServiceProxy defined in net.corda.node.services.transactions.BFTSMaRt.Client[PropertyDescriptorImpl]

'close' @ [87:19] ==> public open fun close(): Unit defined in bftsmart.tom.ServiceProxy[JavaMethodDescriptor]

'sessionTable' @ [93:32] ==> private final val sessionTable: Map<Int, NettyClientServerSession> defined in net.corda.node.services.transactions.BFTSMaRt.Client[PropertyDescriptorImpl]

'entries' @ [93:45] ==> public abstract val entries: Set<Map.Entry<Int, NettyClientServerSession>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'mapNotNull' @ [93:53] ==> public inline fun <T, R : Any> Iterable<Map.Entry<Int, NettyClientServerSession>>.mapNotNull(transform: (Map.Entry<Int, NettyClientServerSession>) -> Int?): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<Int, NettyClientServerSession>
    <R : Any> -> Int

'if (it.value.channel.isActive) null else it.key' @ [93:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'it' @ [93:70] ==> value-parameter it: Map.Entry<Int, NettyClientServerSession> defined in net.corda.node.services.transactions.BFTSMaRt.Client.awaitClientConnectionToCluster.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [93:73] ==> public abstract val value: NettyClientServerSession defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'channel' @ [93:79] ==> public final val NettyClientServerSession.channel: (Channel..Channel?)[MyPropertyDescriptor]

'isActive' @ [93:87] ==> public final val Channel.isActive: Boolean[MyPropertyDescriptor]

'it' @ [93:107] ==> value-parameter it: Map.Entry<Int, NettyClientServerSession> defined in net.corda.node.services.transactions.BFTSMaRt.Client.awaitClientConnectionToCluster.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [93:110] ==> public abstract val key: Int defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'inactive' @ [94:21] ==> val inactive: List<Int> defined in net.corda.node.services.transactions.BFTSMaRt.Client.awaitClientConnectionToCluster[LocalVariableDescriptor]

'isEmpty' @ [94:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'log' @ [95:17] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTSMaRt.Client.Companion[PropertyDescriptorImpl]

'info' @ [95:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'clientId' @ [95:68] ==> private final val clientId: Int defined in net.corda.node.services.transactions.BFTSMaRt.Client[PropertyDescriptorImpl]

'inactive' @ [95:81] ==> val inactive: List<Int> defined in net.corda.node.services.transactions.BFTSMaRt.Client.awaitClientConnectionToCluster[LocalVariableDescriptor]

'sleep' @ [96:24] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'inactive' @ [96:31] ==> val inactive: List<Int> defined in net.corda.node.services.transactions.BFTSMaRt.Client.awaitClientConnectionToCluster[LocalVariableDescriptor]

'size' @ [96:40] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'toLong' @ [96:52] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'require' @ [105:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'transaction' @ [105:21] ==> value-parameter transaction: Any defined in net.corda.node.services.transactions.BFTSMaRt.Client.commitTransaction[ValueParameterDescriptorImpl]

'transaction' @ [105:59] ==> value-parameter transaction: Any defined in net.corda.node.services.transactions.BFTSMaRt.Client.commitTransaction[ValueParameterDescriptorImpl]

'transaction' @ [105:128] ==> value-parameter transaction: Any defined in net.corda.node.services.transactions.BFTSMaRt.Client.commitTransaction[ValueParameterDescriptorImpl]

'javaClass' @ [105:140] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'name' @ [105:150] ==> public final val <T : (Any..Any?)> Class<Any>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'awaitClientConnectionToCluster' @ [106:13] ==> private final fun awaitClientConnectionToCluster(): Unit defined in net.corda.node.services.transactions.BFTSMaRt.Client[SimpleFunctionDescriptorImpl]

'cluster' @ [107:13] ==> private final val cluster: BFTSMaRt.Cluster defined in net.corda.node.services.transactions.BFTSMaRt.Client[PropertyDescriptorImpl]

'waitUntilAllReplicasHaveInitialized' @ [107:21] ==> public abstract fun waitUntilAllReplicasHaveInitialized(): Unit defined in net.corda.node.services.transactions.BFTSMaRt.Cluster[SimpleFunctionDescriptorImpl]

'CommitRequest' @ [108:32] ==> public constructor CommitRequest(tx: Any, callerIdentity: Party) defined in net.corda.node.services.transactions.BFTSMaRt.CommitRequest[ClassConstructorDescriptorImpl]

'transaction' @ [108:46] ==> value-parameter transaction: Any defined in net.corda.node.services.transactions.BFTSMaRt.Client.commitTransaction[ValueParameterDescriptorImpl]

'otherSide' @ [108:59] ==> value-parameter otherSide: Party defined in net.corda.node.services.transactions.BFTSMaRt.Client.commitTransaction[ValueParameterDescriptorImpl]

'serialize' @ [108:70] ==> public fun <T : Any> BFTSMaRt.CommitRequest.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<BFTSMaRt.CommitRequest> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CommitRequest

'bytes' @ [108:82] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'proxy' @ [109:33] ==> private final val proxy: ServiceProxy defined in net.corda.node.services.transactions.BFTSMaRt.Client[PropertyDescriptorImpl]

'invokeOrdered' @ [109:39] ==> public open fun invokeOrdered(p0: (ByteArray..ByteArray?)): (ByteArray..ByteArray?) defined in bftsmart.tom.ServiceProxy[JavaMethodDescriptor]

'requestBytes' @ [109:53] ==> val requestBytes: ByteArray defined in net.corda.node.services.transactions.BFTSMaRt.Client.commitTransaction[LocalVariableDescriptor]

'responseBytes' @ [110:20] ==> val responseBytes: (ByteArray..ByteArray?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.commitTransaction[LocalVariableDescriptor]

'deserialize' @ [110:34] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): BFTSMaRt.ClusterResponse defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ClusterResponse

'Comparator' @ [115:20] ==> @FunctionalInterface public fun <T : (Any..Any?)> Comparator(function: ((ByteArray..ByteArray?), (ByteArray..ByteArray?)) -> Int): Comparator<ByteArray> defined in java.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> ByteArray

'o1' @ [116:30] ==> value-parameter o1: (ByteArray..ByteArray?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildResponseComparator.<anonymous>[ValueParameterDescriptorImpl]

'deserialize' @ [116:33] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): BFTSMaRt.ReplicaResponse defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ReplicaResponse

'o2' @ [117:30] ==> value-parameter o2: (ByteArray..ByteArray?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildResponseComparator.<anonymous>[ValueParameterDescriptorImpl]

'deserialize' @ [117:33] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): BFTSMaRt.ReplicaResponse defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ReplicaResponse

'if (reply1 is ReplicaResponse.Error && reply2 is ReplicaResponse.Error) {
                    // TODO: for now we treat all errors as equal, compare by error type as well
                    0
                } else if (reply1 is ReplicaResponse.Signature && reply2 is ReplicaResponse.Signature) 0 else -1' @ [118:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'reply1' @ [118:21] ==> val reply1: BFTSMaRt.ReplicaResponse defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildResponseComparator.<anonymous>[LocalVariableDescriptor]

'reply2' @ [118:56] ==> val reply2: BFTSMaRt.ReplicaResponse defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildResponseComparator.<anonymous>[LocalVariableDescriptor]

'if (reply1 is ReplicaResponse.Signature && reply2 is ReplicaResponse.Signature) 0 else -1' @ [121:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'reply1' @ [121:28] ==> val reply1: BFTSMaRt.ReplicaResponse defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildResponseComparator.<anonymous>[LocalVariableDescriptor]

'reply2' @ [121:67] ==> val reply2: BFTSMaRt.ReplicaResponse defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildResponseComparator.<anonymous>[LocalVariableDescriptor]

'-' @ [121:111] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Extractor' @ [127:20] ==> public fun Extractor(function: ((Array<(TOMMessage..TOMMessage?)>..Array<out (TOMMessage..TOMMessage?)>?), Int, Int) -> (TOMMessage..TOMMessage?)): Extractor defined in bftsmart.tom.util[SimpleFunctionDescriptorImpl]

'replies' @ [128:33] ==> value-parameter replies: (Array<(TOMMessage..TOMMessage?)>..Array<out (TOMMessage..TOMMessage?)>?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[ValueParameterDescriptorImpl]

'mapNotNull' @ [128:41] ==> public inline fun <T, R : Any> Array<out (TOMMessage..TOMMessage?)>.mapNotNull(transform: ((TOMMessage..TOMMessage?)) -> BFTSMaRt.ReplicaResponse?): List<BFTSMaRt.ReplicaResponse> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (bftsmart.tom.core.messages.TOMMessage..bftsmart.tom.core.messages.TOMMessage?)
    <R : Any> -> ReplicaResponse

'it' @ [128:54] ==> value-parameter it: (TOMMessage..TOMMessage?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'content' @ [128:58] ==> public final val TOMMessage.content: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'deserialize' @ [128:67] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): BFTSMaRt.ReplicaResponse defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ReplicaResponse

'responses' @ [129:32] ==> val responses: List<BFTSMaRt.ReplicaResponse> defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'filterIsInstance' @ [129:42] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<BFTSMaRt.ReplicaResponse.Signature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Signature

'responses' @ [130:32] ==> val responses: List<BFTSMaRt.ReplicaResponse> defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'filterIsInstance' @ [130:42] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<BFTSMaRt.ReplicaResponse.Error> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Error

'log' @ [132:17] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTSMaRt.Client.Companion[PropertyDescriptorImpl]

'debug' @ [132:21] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'clientId' @ [132:42] ==> private final val clientId: Int defined in net.corda.node.services.transactions.BFTSMaRt.Client[PropertyDescriptorImpl]

'accepted' @ [132:94] ==> val accepted: List<BFTSMaRt.ReplicaResponse.Signature> defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'size' @ [132:103] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'rejected' @ [132:122] ==> val rejected: List<BFTSMaRt.ReplicaResponse.Error> defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'size' @ [132:131] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (accepted.isNotEmpty()) {
                    log.debug { "Cluster response - signatures: ${accepted.map { it.txSignature }}" }
                    ClusterResponse.Signatures(accepted.map { it.txSignature })
                } else {
                    log.debug { "Cluster response - error: ${rejected.first().error}" }
                    ClusterResponse.Error(rejected.first().error)
                }' @ [136:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BFTSMaRt.ClusterResponse, elseBranch: BFTSMaRt.ClusterResponse): BFTSMaRt.ClusterResponse[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClusterResponse

'accepted' @ [136:45] ==> val accepted: List<BFTSMaRt.ReplicaResponse.Signature> defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [136:54] ==> @InlineOnly public inline fun <T> Collection<BFTSMaRt.ReplicaResponse.Signature>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature

'log' @ [137:21] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTSMaRt.Client.Companion[PropertyDescriptorImpl]

'debug' @ [137:25] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'accepted' @ [137:67] ==> val accepted: List<BFTSMaRt.ReplicaResponse.Signature> defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'map' @ [137:76] ==> public inline fun <T, R> Iterable<BFTSMaRt.ReplicaResponse.Signature>.map(transform: (BFTSMaRt.ReplicaResponse.Signature) -> DigitalSignature): List<DigitalSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature
    <R> -> DigitalSignature

'it' @ [137:82] ==> value-parameter it: BFTSMaRt.ReplicaResponse.Signature defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'txSignature' @ [137:85] ==> public final val txSignature: DigitalSignature defined in net.corda.node.services.transactions.BFTSMaRt.ReplicaResponse.Signature[PropertyDescriptorImpl]

'Signatures' @ [138:37] ==> public constructor Signatures(txSignatures: List<DigitalSignature>) defined in net.corda.node.services.transactions.BFTSMaRt.ClusterResponse.Signatures[ClassConstructorDescriptorImpl]

'accepted' @ [138:48] ==> val accepted: List<BFTSMaRt.ReplicaResponse.Signature> defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'map' @ [138:57] ==> public inline fun <T, R> Iterable<BFTSMaRt.ReplicaResponse.Signature>.map(transform: (BFTSMaRt.ReplicaResponse.Signature) -> DigitalSignature): List<DigitalSignature> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Signature
    <R> -> DigitalSignature

'it' @ [138:63] ==> value-parameter it: BFTSMaRt.ReplicaResponse.Signature defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'txSignature' @ [138:66] ==> public final val txSignature: DigitalSignature defined in net.corda.node.services.transactions.BFTSMaRt.ReplicaResponse.Signature[PropertyDescriptorImpl]

'log' @ [140:21] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTSMaRt.Client.Companion[PropertyDescriptorImpl]

'debug' @ [140:25] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'rejected' @ [140:62] ==> val rejected: List<BFTSMaRt.ReplicaResponse.Error> defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'first' @ [140:71] ==> public fun <T> List<BFTSMaRt.ReplicaResponse.Error>.first(): BFTSMaRt.ReplicaResponse.Error defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Error

'error' @ [140:79] ==> public final val error: NotaryError defined in net.corda.node.services.transactions.BFTSMaRt.ReplicaResponse.Error[PropertyDescriptorImpl]

'Error' @ [141:37] ==> public constructor Error(error: NotaryError) defined in net.corda.node.services.transactions.BFTSMaRt.ClusterResponse.Error[ClassConstructorDescriptorImpl]

'rejected' @ [141:43] ==> val rejected: List<BFTSMaRt.ReplicaResponse.Error> defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'first' @ [141:52] ==> public fun <T> List<BFTSMaRt.ReplicaResponse.Error>.first(): BFTSMaRt.ReplicaResponse.Error defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Error

'error' @ [141:60] ==> public final val error: NotaryError defined in net.corda.node.services.transactions.BFTSMaRt.ReplicaResponse.Error[PropertyDescriptorImpl]

'aggregateResponse' @ [144:38] ==> val aggregateResponse: BFTSMaRt.ClusterResponse defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'serialize' @ [144:56] ==> public fun <T : Any> BFTSMaRt.ClusterResponse.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<BFTSMaRt.ClusterResponse> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClusterResponse

'bytes' @ [144:68] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'replies' @ [146:29] ==> value-parameter replies: (Array<(TOMMessage..TOMMessage?)>..Array<out (TOMMessage..TOMMessage?)>?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[ValueParameterDescriptorImpl]

'lastReceived' @ [146:37] ==> value-parameter lastReceived: Int defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[ValueParameterDescriptorImpl]

'TOMMessage' @ [147:17] ==> public constructor TOMMessage(p0: Int, p1: Int, p2: Int, p3: (ByteArray..ByteArray?), p4: Int) defined in bftsmart.tom.core.messages.TOMMessage[JavaClassConstructorDescriptor]

'reply' @ [147:28] ==> val reply: (TOMMessage..TOMMessage?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'sender' @ [147:34] ==> public final val TOMMessage.sender: Int[MyPropertyDescriptor]

'reply' @ [147:42] ==> val reply: (TOMMessage..TOMMessage?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'session' @ [147:48] ==> public final val TOMMessage.session: Int[MyPropertyDescriptor]

'reply' @ [147:57] ==> val reply: (TOMMessage..TOMMessage?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'sequence' @ [147:63] ==> public final val TOMMessage.sequence: Int[MyPropertyDescriptor]

'messageContent' @ [147:73] ==> val messageContent: ByteArray defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'reply' @ [147:89] ==> val reply: (TOMMessage..TOMMessage?) defined in net.corda.node.services.transactions.BFTSMaRt.Client.buildExtractor.<anonymous>[LocalVariableDescriptor]

'viewID' @ [147:95] ==> public final val TOMMessage.viewID: Int[MyPropertyDescriptor]

'ServiceReplica' @ [153:102] ==> public constructor ServiceReplica(p0: Int, p1: (String..String?), p2: (Executable..Executable?), p3: (Recoverable..Recoverable?), p4: (RequestVerifier..RequestVerifier?), p5: (Replier..Replier?)) defined in bftsmart.tom.ServiceReplica[JavaClassConstructorDescriptor]

'replicaId' @ [153:117] ==> value-parameter replicaId: Int defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica.<init>[ValueParameterDescriptorImpl]

'configHome' @ [153:128] ==> value-parameter configHome: Path defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica.<init>[ValueParameterDescriptorImpl]

'toString' @ [153:139] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'owner' @ [153:151] ==> value-parameter owner: DefaultRecoverable defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica.<init>[ValueParameterDescriptorImpl]

'owner' @ [153:158] ==> value-parameter owner: DefaultRecoverable defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica.<init>[ValueParameterDescriptorImpl]

'DefaultReplier' @ [153:171] ==> public constructor DefaultReplier() defined in bftsmart.tom.server.defaultservices.DefaultReplier[JavaClassConstructorDescriptor]

'declaredField' @ [154:37] ==> public fun <T> Any.declaredField(clazz: KClass<*>, name: String): DeclaredField<TOMLayer> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TOMLayer

'declaredField' @ [155:31] ==> public fun <T> Any.declaredField(clazz: KClass<*>, name: String): DeclaredField<ServerCommunicationSystem> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ServerCommunicationSystem

'tomLayerField' @ [158:28] ==> private final val tomLayerField: DeclaredField<TOMLayer> defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica[PropertyDescriptorImpl]

'value' @ [158:42] ==> public final var value: TOMLayer defined in net.corda.core.internal.DeclaredField[DeserializedPropertyDescriptor]

'tomLayer' @ [159:13] ==> val tomLayer: TOMLayer defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica.dispose[LocalVariableDescriptor]

'shutdown' @ [159:22] ==> public open fun shutdown(): Unit defined in bftsmart.tom.core.TOMLayer[JavaMethodDescriptor]

'csField' @ [160:22] ==> private final val csField: DeclaredField<ServerCommunicationSystem> defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica[PropertyDescriptorImpl]

'value' @ [160:30] ==> public final var value: ServerCommunicationSystem defined in net.corda.core.internal.DeclaredField[DeserializedPropertyDescriptor]

'cs' @ [161:13] ==> val cs: ServerCommunicationSystem defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica.dispose[LocalVariableDescriptor]

'join' @ [161:16] ==> public final fun join(): Unit defined in bftsmart.communication.ServerCommunicationSystem[JavaMethodDescriptor]

'cs' @ [162:13] ==> val cs: ServerCommunicationSystem defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica.dispose[LocalVariableDescriptor]

'serversConn' @ [162:16] ==> public final val ServerCommunicationSystem.serversConn: (ServersCommunicationLayer..ServersCommunicationLayer?)[MyPropertyDescriptor]

'join' @ [162:28] ==> public final fun join(): Unit defined in bftsmart.communication.server.ServersCommunicationLayer[JavaMethodDescriptor]

'tomLayer' @ [163:13] ==> val tomLayer: TOMLayer defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica.dispose[LocalVariableDescriptor]

'join' @ [163:22] ==> public final fun join(): Unit defined in bftsmart.tom.core.TOMLayer[JavaMethodDescriptor]

'tomLayer' @ [164:13] ==> val tomLayer: TOMLayer defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica.dispose[LocalVariableDescriptor]

'deliveryThread' @ [164:22] ==> public final val TOMLayer.deliveryThread: (DeliveryThread..DeliveryThread?)[MyPropertyDescriptor]

'join' @ [164:37] ==> public final fun join(): Unit defined in bftsmart.tom.core.DeliveryThread[JavaMethodDescriptor]

'DefaultRecoverable' @ [179:80] ==> public constructor DefaultRecoverable() defined in bftsmart.tom.server.defaultservices.DefaultRecoverable[JavaClassConstructorDescriptor]

'loggerFor' @ [181:31] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Replica

'run' @ [184:44] ==> @InlineOnly public inline fun <T, R> BFTSMaRt.Replica.run(block: BFTSMaRt.Replica.() -> <no name provided>): <no name provided> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Replica
    <R> -> <no name provided>

'config' @ [186:37] ==> value-parameter config: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTSMaRt.Replica.<init>[ValueParameterDescriptorImpl]

'exposeRaces' @ [186:44] ==> public final val exposeRaces: Boolean defined in net.corda.node.services.transactions.BFTSMaRtConfig[PropertyDescriptorImpl]

'replicaId' @ [186:59] ==> value-parameter replicaId: Int defined in net.corda.node.services.transactions.BFTSMaRt.Replica.<init>[ValueParameterDescriptorImpl]

'maxFaultyReplicas' @ [186:71] ==> public fun maxFaultyReplicas(clusterSize: Int): Int defined in net.corda.node.services.transactions[SimpleFunctionDescriptorImpl]

'config' @ [186:89] ==> value-parameter config: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTSMaRt.Replica.<init>[ValueParameterDescriptorImpl]

'clusterSize' @ [186:96] ==> public final val clusterSize: Int defined in net.corda.node.services.transactions.BFTSMaRtConfig[PropertyDescriptorImpl]

'StandardStateManager' @ [187:22] ==> public constructor StandardStateManager() defined in bftsmart.statemanagement.strategy.StandardStateManager[JavaClassConstructorDescriptor]

'exposeStartupRace' @ [189:25] ==> val exposeStartupRace: Boolean defined in net.corda.node.services.transactions.BFTSMaRt.Replica.stateManagerOverride.<anonymous>[LocalVariableDescriptor]

'sleep' @ [189:51] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'super' @ [190:21] ==> <this> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.stateManagerOverride.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'askCurrentConsensusId' @ [190:27] ==> public open fun askCurrentConsensusId(): Unit defined in bftsmart.statemanagement.strategy.StandardStateManager[JavaMethodDescriptor]

'stateManagerOverride' @ [195:42] ==> private final val stateManagerOverride: <no name provided> defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'services' @ [197:33] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'database' @ [197:42] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'transaction' @ [197:51] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef>): AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef> defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> AppendOnlyPersistentMap<StateRef, ConsumingTx, PersistedCommittedState, PersistentStateRef>

'invoke' @ [197:65] ==> public abstract operator fun invoke(): AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef> defined in kotlin.Function0[FunctionInvokeDescriptor]

'run' @ [198:31] ==> @InlineOnly public inline fun <T, R> BFTSMaRt.Replica.run(block: BFTSMaRt.Replica.() -> BFTSMaRt.CordaServiceReplica): BFTSMaRt.CordaServiceReplica defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Replica
    <R> -> CordaServiceReplica

'config' @ [199:13] ==> value-parameter config: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTSMaRt.Replica.<init>[ValueParameterDescriptorImpl]

'waitUntilReplicaWillNotPrintStackTrace' @ [199:20] ==> public final fun waitUntilReplicaWillNotPrintStackTrace(contextReplicaId: Int): Unit defined in net.corda.node.services.transactions.BFTSMaRtConfig[SimpleFunctionDescriptorImpl]

'replicaId' @ [199:59] ==> value-parameter replicaId: Int defined in net.corda.node.services.transactions.BFTSMaRt.Replica.<init>[ValueParameterDescriptorImpl]

'Suppress' @ [200:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'CordaServiceReplica' @ [201:13] ==> public constructor CordaServiceReplica(replicaId: Int, configHome: Path, owner: DefaultRecoverable) defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica[ClassConstructorDescriptorImpl]

'replicaId' @ [201:33] ==> value-parameter replicaId: Int defined in net.corda.node.services.transactions.BFTSMaRt.Replica.<init>[ValueParameterDescriptorImpl]

'config' @ [201:44] ==> value-parameter config: BFTSMaRtConfig defined in net.corda.node.services.transactions.BFTSMaRt.Replica.<init>[ValueParameterDescriptorImpl]

'path' @ [201:51] ==> public final val path: Path defined in net.corda.node.services.transactions.BFTSMaRtConfig[PropertyDescriptorImpl]

'this' @ [201:57] ==> <this> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.replica.<anonymous>[ReceiverParameterDescriptorImpl]

'replica' @ [205:13] ==> private final val replica: BFTSMaRt.CordaServiceReplica defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'dispose' @ [205:21] ==> public final fun dispose(): Unit defined in net.corda.node.services.transactions.BFTSMaRt.CordaServiceReplica[SimpleFunctionDescriptorImpl]

'NotImplementedError' @ [209:19] ==> public constructor NotImplementedError(message: String = ...) defined in kotlin.NotImplementedError[DeserializedClassConstructorDescriptor]

'stream' @ [213:27] ==> public open fun <T : (Any..Any?)> stream(p0: (Array<(ByteArray..ByteArray?)>..Array<out (ByteArray..ByteArray?)>?)): (Stream<(ByteArray..ByteArray?)>..Stream<(ByteArray..ByteArray?)>?) defined in java.util.Arrays[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ByteArray

'command' @ [213:34] ==> value-parameter command: Array<ByteArray> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.appExecuteBatch[ValueParameterDescriptorImpl]

'map' @ [213:43] ==> public final fun <R : (Any..Any?)> map(p0: (((ByteArray..ByteArray?)) -> (ByteArray..ByteArray?)..(((ByteArray..ByteArray?)) -> (ByteArray..ByteArray?))?)): (Stream<(ByteArray..ByteArray?)>..Stream<(ByteArray..ByteArray?)>?) defined in java.util.stream.Stream[MyFunctionDescriptor]
Inferred types:
    <R : (Any..Any?)> -> ByteArray

'this' @ [213:47] ==> <this> defined in net.corda.node.services.transactions.BFTSMaRt.Replica[LazyClassReceiverParameterDescriptor]

'toTypedArray' @ [213:69] ==> public inline fun <reified T> Stream<out ByteArray?>.toTypedArray(): Array<ByteArray?> defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> ByteArray?

'log' @ [223:13] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTSMaRt.Replica.Companion[PropertyDescriptorImpl]

'debug' @ [223:17] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'txId' @ [223:72] ==> value-parameter txId: SecureHash defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[ValueParameterDescriptorImpl]

'mutableMapOf' @ [224:29] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<StateRef, UniquenessProvider.ConsumingTx> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> StateRef
    <V> -> ConsumingTx

'services' @ [225:13] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'database' @ [225:22] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'transaction' @ [225:31] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'states' @ [226:17] ==> value-parameter states: List<StateRef> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[ValueParameterDescriptorImpl]

'forEach' @ [226:24] ==> @HidesMembers public inline fun <T> Iterable<StateRef>.forEach(action: (StateRef) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'commitLog' @ [227:21] ==> private final val commitLog: AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef> defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'state' @ [227:31] ==> value-parameter state: StateRef defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [227:39] ==> @InlineOnly public inline fun <T, R> UniquenessProvider.ConsumingTx.let(block: (UniquenessProvider.ConsumingTx) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConsumingTx
    <R> -> Unit

'conflicts' @ [227:45] ==> val conflicts: MutableMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[LocalVariableDescriptor]

'state' @ [227:55] ==> value-parameter state: StateRef defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [227:64] ==> value-parameter it: UniquenessProvider.ConsumingTx defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'if (conflicts.isEmpty()) {
                    log.debug { "No conflicts detected, committing input states: ${states.joinToString()}" }
                    states.forEachIndexed { i, stateRef ->
                        val txInfo = UniquenessProvider.ConsumingTx(txId, i, callerIdentity)
                        commitLog[stateRef] = txInfo
                    }
                } else {
                    log.debug { "Conflict detected – the following inputs have already been committed: ${conflicts.keys.joinToString()}" }
                    val conflict = UniquenessProvider.Conflict(conflicts)
                    val conflictData = conflict.serialize()
                    val signedConflict = SignedData(conflictData, sign(conflictData.bytes))
                    throw NotaryException(NotaryError.Conflict(txId, signedConflict))
                }' @ [229:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'conflicts' @ [229:21] ==> val conflicts: MutableMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[LocalVariableDescriptor]

'isEmpty' @ [229:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'log' @ [230:21] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTSMaRt.Replica.Companion[PropertyDescriptorImpl]

'debug' @ [230:25] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'states' @ [230:84] ==> value-parameter states: List<StateRef> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[ValueParameterDescriptorImpl]

'joinToString' @ [230:91] ==> public fun <T> Iterable<StateRef>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((StateRef) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'states' @ [231:21] ==> value-parameter states: List<StateRef> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[ValueParameterDescriptorImpl]

'forEachIndexed' @ [231:28] ==> public inline fun <T> Iterable<StateRef>.forEachIndexed(action: (index: Int, StateRef) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'ConsumingTx' @ [232:57] ==> public constructor ConsumingTx(id: SecureHash, inputIndex: Int, requestingParty: Party) defined in net.corda.core.node.services.UniquenessProvider.ConsumingTx[DeserializedClassConstructorDescriptor]

'txId' @ [232:69] ==> value-parameter txId: SecureHash defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[ValueParameterDescriptorImpl]

'i' @ [232:75] ==> value-parameter i: Int defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'callerIdentity' @ [232:78] ==> value-parameter callerIdentity: Party defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[ValueParameterDescriptorImpl]

'commitLog' @ [233:25] ==> private final val commitLog: AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef> defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'stateRef' @ [233:35] ==> value-parameter stateRef: StateRef defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'txInfo' @ [233:47] ==> val txInfo: UniquenessProvider.ConsumingTx defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>.<anonymous>[LocalVariableDescriptor]

'log' @ [236:21] ==> private final val log: Logger defined in net.corda.node.services.transactions.BFTSMaRt.Replica.Companion[PropertyDescriptorImpl]

'debug' @ [236:25] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'conflicts' @ [236:106] ==> val conflicts: MutableMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[LocalVariableDescriptor]

'keys' @ [236:116] ==> public abstract val keys: MutableSet<StateRef> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'joinToString' @ [236:121] ==> public fun <T> Iterable<StateRef>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((StateRef) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StateRef

'Conflict' @ [237:55] ==> public constructor Conflict(stateHistory: Map<StateRef, UniquenessProvider.ConsumingTx>) defined in net.corda.core.node.services.UniquenessProvider.Conflict[DeserializedClassConstructorDescriptor]

'conflicts' @ [237:64] ==> val conflicts: MutableMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[LocalVariableDescriptor]

'conflict' @ [238:40] ==> val conflict: UniquenessProvider.Conflict defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>[LocalVariableDescriptor]

'serialize' @ [238:49] ==> public fun <T : Any> UniquenessProvider.Conflict.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<UniquenessProvider.Conflict> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Conflict

'SignedData' @ [239:42] ==> public constructor SignedData<T : Any>(raw: SerializedBytes<UniquenessProvider.Conflict>, sig: DigitalSignature.WithKey) defined in net.corda.core.crypto.SignedData[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Conflict

'conflictData' @ [239:53] ==> val conflictData: SerializedBytes<UniquenessProvider.Conflict> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>[LocalVariableDescriptor]

'sign' @ [239:67] ==> protected final fun sign(bytes: ByteArray): DigitalSignature.WithKey defined in net.corda.node.services.transactions.BFTSMaRt.Replica[SimpleFunctionDescriptorImpl]

'conflictData' @ [239:72] ==> val conflictData: SerializedBytes<UniquenessProvider.Conflict> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>[LocalVariableDescriptor]

'bytes' @ [239:85] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'NotaryException' @ [240:27] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'Conflict' @ [240:55] ==> public constructor Conflict(txId: SecureHash, conflict: SignedData<UniquenessProvider.Conflict>) defined in net.corda.core.flows.NotaryError.Conflict[DeserializedClassConstructorDescriptor]

'txId' @ [240:64] ==> value-parameter txId: SecureHash defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates[ValueParameterDescriptorImpl]

'signedConflict' @ [240:70] ==> val signedConflict: SignedData<UniquenessProvider.Conflict> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.commitInputStates.<anonymous>[LocalVariableDescriptor]

't' @ [246:17] ==> value-parameter t: TimeWindow? defined in net.corda.node.services.transactions.BFTSMaRt.Replica.validateTimeWindow[ValueParameterDescriptorImpl]

'!' @ [246:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'timeWindowChecker' @ [246:31] ==> private final val timeWindowChecker: TimeWindowChecker defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'isValid' @ [246:49] ==> public final fun isValid(timeWindow: TimeWindow): Boolean defined in net.corda.core.node.services.TimeWindowChecker[DeserializedSimpleFunctionDescriptor]

't' @ [246:57] ==> value-parameter t: TimeWindow? defined in net.corda.node.services.transactions.BFTSMaRt.Replica.validateTimeWindow[ValueParameterDescriptorImpl]

'NotaryException' @ [247:23] ==> public constructor NotaryException(error: NotaryError) defined in net.corda.core.flows.NotaryException[DeserializedClassConstructorDescriptor]

'TimeWindowInvalid' @ [247:51] ==> public object TimeWindowInvalid : NotaryError defined in net.corda.core.flows.NotaryError[FakeCallableDescriptorForObject]

'services' @ [251:20] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'database' @ [251:29] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'transaction' @ [251:38] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> DigitalSignature.WithKey): DigitalSignature.WithKey defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> WithKey

'services' @ [251:52] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'keyManagementService' @ [251:61] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'sign' @ [251:82] ==> @Suspendable public abstract fun sign(bytes: ByteArray, publicKey: PublicKey): DigitalSignature.WithKey defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'bytes' @ [251:87] ==> value-parameter bytes: ByteArray defined in net.corda.node.services.transactions.BFTSMaRt.Replica.sign[ValueParameterDescriptorImpl]

'services' @ [251:94] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'notaryIdentityKey' @ [251:103] ==> public open val notaryIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'services' @ [255:20] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'database' @ [255:29] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'transaction' @ [255:38] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> TransactionSignature): TransactionSignature defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> TransactionSignature

'services' @ [255:52] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'keyManagementService' @ [255:61] ==> public abstract val keyManagementService: KeyManagementService defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'sign' @ [255:82] ==> @Suspendable public abstract fun sign(signableData: SignableData, publicKey: PublicKey): TransactionSignature defined in net.corda.core.node.services.KeyManagementService[DeserializedSimpleFunctionDescriptor]

'signableData' @ [255:87] ==> value-parameter signableData: SignableData defined in net.corda.node.services.transactions.BFTSMaRt.Replica.sign[ValueParameterDescriptorImpl]

'services' @ [255:101] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'notaryIdentityKey' @ [255:110] ==> public open val notaryIdentityKey: PublicKey defined in net.corda.node.services.api.ServiceHubInternal[DeserializedPropertyDescriptor]

'LinkedHashMap' @ [263:21] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> StateRef
    <V : (Any..Any?)> -> ConsumingTx

'services' @ [264:13] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'database' @ [264:22] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'transaction' @ [264:31] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'commitLog' @ [265:17] ==> private final val commitLog: AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef> defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'allPersisted' @ [265:27] ==> public final fun allPersisted(): Sequence<Pair<StateRef, UniquenessProvider.ConsumingTx>> defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'forEach' @ [265:42] ==> public inline fun <T> Sequence<Pair<StateRef, UniquenessProvider.ConsumingTx>>.forEach(action: (Pair<StateRef, UniquenessProvider.ConsumingTx>) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<StateRef, ConsumingTx>

'm' @ [265:52] ==> val m: LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.getSnapshot[LocalVariableDescriptor]

'it' @ [265:54] ==> value-parameter it: Pair<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.getSnapshot.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [265:57] ==> public final val first: StateRef defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [265:66] ==> value-parameter it: Pair<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.getSnapshot.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [265:69] ==> public final val second: UniquenessProvider.ConsumingTx defined in kotlin.Pair[DeserializedPropertyDescriptor]

'm' @ [267:20] ==> val m: LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.getSnapshot[LocalVariableDescriptor]

'serialize' @ [267:22] ==> public fun <T : Any> LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx>.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx>> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LinkedHashMap<StateRef, ConsumingTx>

'bytes' @ [267:34] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'bytes' @ [271:21] ==> value-parameter bytes: ByteArray defined in net.corda.node.services.transactions.BFTSMaRt.Replica.installSnapshot[ValueParameterDescriptorImpl]

'deserialize' @ [271:27] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LinkedHashMap<StateRef, ConsumingTx>

'services' @ [272:13] ==> protected final val services: ServiceHubInternal defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'database' @ [272:22] ==> public abstract val database: CordaPersistence defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'transaction' @ [272:31] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'commitLog' @ [273:17] ==> private final val commitLog: AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef> defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'clear' @ [273:27] ==> public final fun clear(): Unit defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'commitLog' @ [274:17] ==> private final val commitLog: AppendOnlyPersistentMap<StateRef, UniquenessProvider.ConsumingTx, BFTNonValidatingNotaryService.PersistedCommittedState, PersistentStateRef> defined in net.corda.node.services.transactions.BFTSMaRt.Replica[PropertyDescriptorImpl]

'putAll' @ [274:27] ==> public final fun putAll(entries: Map<StateRef, UniquenessProvider.ConsumingTx>): Unit defined in net.corda.node.utilities.AppendOnlyPersistentMap[SimpleFunctionDescriptorImpl]

'm' @ [274:34] ==> val m: LinkedHashMap<StateRef, UniquenessProvider.ConsumingTx> defined in net.corda.node.services.transactions.BFTSMaRt.Replica.installSnapshot[LocalVariableDescriptor]

