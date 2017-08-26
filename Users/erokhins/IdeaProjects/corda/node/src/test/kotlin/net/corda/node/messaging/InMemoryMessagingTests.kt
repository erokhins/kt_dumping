'Before' @ [21:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [23:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'MockNetwork' @ [23:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'After' @ [26:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'if (mockNet.nodes.isNotEmpty()) {
            mockNet.stopNodes()
        } else {
            resetTestSerialization()
        }' @ [28:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'mockNet' @ [28:13] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'nodes' @ [28:21] ==> public final val nodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork[DeserializedPropertyDescriptor]

'isNotEmpty' @ [28:27] ==> @InlineOnly public inline fun <T> Collection<MockNetwork.MockNode>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'mockNet' @ [29:13] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'stopNodes' @ [29:21] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'resetTestSerialization' @ [31:13] ==> public fun resetTestSerialization(): Unit defined in net.corda.testing[DeserializedSimpleFunctionDescriptor]

'Test' @ [35:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'TopicStringValidator' @ [37:9] ==> public object TopicStringValidator defined in net.corda.node.services.messaging[FakeCallableDescriptorForObject]

'check' @ [37:30] ==> public final fun check(tag: String): Unit defined in net.corda.node.services.messaging.TopicStringValidator[DeserializedSimpleFunctionDescriptor]

'TopicStringValidator' @ [38:9] ==> public object TopicStringValidator defined in net.corda.node.services.messaging[FakeCallableDescriptorForObject]

'check' @ [38:30] ==> public final fun check(tag: String): Unit defined in net.corda.node.services.messaging.TopicStringValidator[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [39:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'TopicStringValidator' @ [40:13] ==> public object TopicStringValidator defined in net.corda.node.services.messaging[FakeCallableDescriptorForObject]

'check' @ [40:34] ==> public final fun check(tag: String): Unit defined in net.corda.node.services.messaging.TopicStringValidator[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [42:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'TopicStringValidator' @ [43:13] ==> public object TopicStringValidator defined in net.corda.node.services.messaging[FakeCallableDescriptorForObject]

'check' @ [43:34] ==> public final fun check(tag: String): Unit defined in net.corda.node.services.messaging.TopicStringValidator[DeserializedSimpleFunctionDescriptor]

'assertFails' @ [45:9] ==> public fun assertFails(block: () -> Unit): Throwable defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'TopicStringValidator' @ [46:13] ==> public object TopicStringValidator defined in net.corda.node.services.messaging[FakeCallableDescriptorForObject]

'check' @ [46:34] ==> public final fun check(tag: String): Unit defined in net.corda.node.services.messaging.TopicStringValidator[DeserializedSimpleFunctionDescriptor]

'Test' @ [50:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [52:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'createNode' @ [52:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'ServiceInfo' @ [52:61] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [52:73] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [52:91] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'mockNet' @ [53:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'createNode' @ [53:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [53:60] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'network' @ [53:66] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [53:74] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [54:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'createNode' @ [54:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [54:60] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'network' @ [54:66] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [54:74] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'toByteArray' @ [56:35] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'with' @ [59:9] ==> @InlineOnly public inline fun <T, R> with(receiver: MockNetwork.MockNode, block: MockNetwork.MockNode.() -> MessageHandlerRegistration): MessageHandlerRegistration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode
    <R> -> MessageHandlerRegistration

'node2' @ [59:14] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'node2' @ [60:13] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'network' @ [60:19] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'addMessageHandler' @ [60:27] ==> public abstract fun addMessageHandler(topic: String = ..., sessionID: Long = ..., callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'node2' @ [61:17] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'network' @ [61:23] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'send' @ [61:31] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'msg' @ [61:36] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.messaging.InMemoryMessagingTests.basics.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'node3' @ [61:41] ==> val node3: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'network' @ [61:47] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [61:55] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'with' @ [65:9] ==> @InlineOnly public inline fun <T, R> with(receiver: MockNetwork.MockNode, block: MockNetwork.MockNode.() -> MessageHandlerRegistration): MessageHandlerRegistration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode
    <R> -> MessageHandlerRegistration

'node3' @ [65:14] ==> val node3: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'node2' @ [66:13] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'network' @ [66:19] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'addMessageHandler' @ [66:27] ==> public abstract fun addMessageHandler(topic: String = ..., sessionID: Long = ..., callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'finalDelivery' @ [67:17] ==> var finalDelivery: Message? defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'msg' @ [67:33] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.messaging.InMemoryMessagingTests.basics.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'node1' @ [72:9] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'network' @ [72:15] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'send' @ [72:23] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'node1' @ [72:28] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'network' @ [72:34] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'createMessage' @ [72:42] ==> public fun MessagingService.createMessage(topic: String, sessionID: Long = ..., data: ByteArray): Message defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]

'bits' @ [72:77] ==> val bits: ByteArray defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'node2' @ [72:84] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'network' @ [72:90] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [72:98] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [74:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'runNetwork' @ [74:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertTrue' @ [76:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'equals' @ [76:27] ==> public open fun equals(p0: (ByteArray..ByteArray?), p1: (ByteArray..ByteArray?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'finalDelivery' @ [76:34] ==> var finalDelivery: Message? defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'data' @ [76:50] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.Message[DeserializedPropertyDescriptor]

'bits' @ [76:56] ==> val bits: ByteArray defined in net.corda.node.messaging.InMemoryMessagingTests.basics[LocalVariableDescriptor]

'Test' @ [79:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [81:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'createNode' @ [81:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'ServiceInfo' @ [81:61] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [81:73] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [81:91] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'mockNet' @ [82:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'createNode' @ [82:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [82:60] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'network' @ [82:66] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [82:74] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [83:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'createNode' @ [83:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [83:60] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'network' @ [83:66] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [83:74] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'toByteArray' @ [85:35] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'listOf' @ [88:9] ==> public fun <T> listOf(vararg elements: MockNetwork.MockNode): List<MockNetwork.MockNode> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'node1' @ [88:16] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'node2' @ [88:23] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'node3' @ [88:30] ==> val node3: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'forEach' @ [88:37] ==> @HidesMembers public inline fun <T> Iterable<MockNetwork.MockNode>.forEach(action: (MockNetwork.MockNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MockNode

'it' @ [88:47] ==> value-parameter it: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast.<anonymous>[ValueParameterDescriptorImpl]

'network' @ [88:50] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'addMessageHandler' @ [88:58] ==> public abstract fun addMessageHandler(topic: String = ..., sessionID: Long = ..., callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'counter' @ [88:86] ==> var counter: Int defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'node1' @ [89:9] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'network' @ [89:15] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'send' @ [89:23] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'node2' @ [89:28] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'network' @ [89:34] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'createMessage' @ [89:42] ==> public fun MessagingService.createMessage(topic: String, sessionID: Long = ..., data: ByteArray): Message defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]

'bits' @ [89:77] ==> val bits: ByteArray defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'mockNet' @ [89:84] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'messagingNetwork' @ [89:92] ==> public final val messagingNetwork: InMemoryMessagingNetwork defined in net.corda.testing.node.MockNetwork[DeserializedPropertyDescriptor]

'everyoneOnline' @ [89:109] ==> public final val everyoneOnline: AllPossibleRecipients defined in net.corda.testing.node.InMemoryMessagingNetwork[DeserializedPropertyDescriptor]

'mockNet' @ [90:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'runNetwork' @ [90:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [91:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'counter' @ [91:25] ==> var counter: Int defined in net.corda.node.messaging.InMemoryMessagingTests.broadcast[LocalVariableDescriptor]

'Test' @ [98:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [100:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'createNode' @ [100:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'ServiceInfo' @ [100:61] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [100:73] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [100:91] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'mockNet' @ [101:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'createNode' @ [101:29] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'node1' @ [101:60] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [101:66] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [101:74] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'node1' @ [104:9] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [104:15] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'addMessageHandler' @ [104:23] ==> public abstract fun addMessageHandler(topic: String = ..., sessionID: Long = ..., callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'received' @ [105:13] ==> var received: Int defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'node2' @ [108:30] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [108:36] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'createMessage' @ [108:44] ==> public fun MessagingService.createMessage(topic: String, sessionID: Long = ..., data: ByteArray): Message defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]

'ByteArray' @ [108:84] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'node2' @ [109:28] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [109:34] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'createMessage' @ [109:42] ==> public fun MessagingService.createMessage(topic: String, sessionID: Long = ..., data: ByteArray): Message defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]

'ByteArray' @ [109:80] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'node2' @ [110:9] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [110:15] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'send' @ [110:23] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'invalidMessage' @ [110:28] ==> val invalidMessage: Message defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'node1' @ [110:44] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [110:50] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [110:58] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [111:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'runNetwork' @ [111:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [112:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'received' @ [112:25] ==> var received: Int defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'node2' @ [114:9] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [114:15] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'send' @ [114:23] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'validMessage' @ [114:28] ==> val validMessage: Message defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'node1' @ [114:42] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [114:48] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [114:56] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [115:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'runNetwork' @ [115:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [116:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'received' @ [116:25] ==> var received: Int defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'node2' @ [120:31] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [120:37] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'createMessage' @ [120:45] ==> public fun MessagingService.createMessage(topic: String, sessionID: Long = ..., data: ByteArray): Message defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]

'ByteArray' @ [120:85] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'node2' @ [121:29] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [121:35] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'createMessage' @ [121:43] ==> public fun MessagingService.createMessage(topic: String, sessionID: Long = ..., data: ByteArray): Message defined in net.corda.node.services.messaging[DeserializedSimpleFunctionDescriptor]

'ByteArray' @ [121:81] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'node2' @ [122:9] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [122:15] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'send' @ [122:23] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'invalidMessage2' @ [122:28] ==> val invalidMessage2: Message defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'node1' @ [122:45] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [122:51] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [122:59] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'node2' @ [123:9] ==> val node2: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [123:15] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'send' @ [123:23] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[DeserializedSimpleFunctionDescriptor]

'validMessage2' @ [123:28] ==> val validMessage2: Message defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'node1' @ [123:43] ==> val node1: MockNetwork.MockNode defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

'network' @ [123:49] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [123:57] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'mockNet' @ [124:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.node.messaging.InMemoryMessagingTests[PropertyDescriptorImpl]

'runNetwork' @ [124:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [125:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'received' @ [125:25] ==> var received: Int defined in net.corda.node.messaging.InMemoryMessagingTests.`skip unhandled messages`[LocalVariableDescriptor]

