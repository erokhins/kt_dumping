'Before' @ [34:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [36:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'MockNetwork' @ [36:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'After' @ [39:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [41:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'stopNodes' @ [41:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'ByteArrayOutputStream' @ [45:18] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'JarOutputStream' @ [46:18] ==> public constructor JarOutputStream(p0: (OutputStream..OutputStream?)) defined in java.util.jar.JarOutputStream[JavaClassConstructorDescriptor]

'bs' @ [46:34] ==> val bs: ByteArrayOutputStream defined in net.corda.core.flows.AttachmentTests.fakeAttachment[LocalVariableDescriptor]

'js' @ [47:9] ==> val js: JarOutputStream defined in net.corda.core.flows.AttachmentTests.fakeAttachment[LocalVariableDescriptor]

'putNextEntry' @ [47:12] ==> public open fun putNextEntry(p0: (ZipEntry..ZipEntry?)): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'ZipEntry' @ [47:25] ==> public constructor ZipEntry(p0: (String..String?)) defined in java.util.zip.ZipEntry[JavaClassConstructorDescriptor]

'js' @ [48:9] ==> val js: JarOutputStream defined in net.corda.core.flows.AttachmentTests.fakeAttachment[LocalVariableDescriptor]

'writer' @ [48:12] ==> @InlineOnly public inline fun OutputStream.writer(charset: Charset = ...): OutputStreamWriter defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'apply' @ [48:21] ==> @InlineOnly public inline fun <T> OutputStreamWriter.apply(block: OutputStreamWriter.() -> Unit): OutputStreamWriter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputStreamWriter

'append' @ [48:29] ==> public open fun append(p0: (CharSequence..CharSequence?)): (Writer..Writer?) defined in java.io.OutputStreamWriter[JavaMethodDescriptor]

'flush' @ [48:60] ==> public open fun flush(): Unit defined in java.io.OutputStreamWriter[JavaMethodDescriptor]

'js' @ [49:9] ==> val js: JarOutputStream defined in net.corda.core.flows.AttachmentTests.fakeAttachment[LocalVariableDescriptor]

'closeEntry' @ [49:12] ==> public open fun closeEntry(): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'js' @ [50:9] ==> val js: JarOutputStream defined in net.corda.core.flows.AttachmentTests.fakeAttachment[LocalVariableDescriptor]

'close' @ [50:12] ==> public open fun close(): Unit defined in java.util.jar.JarOutputStream[JavaMethodDescriptor]

'bs' @ [51:16] ==> val bs: ByteArrayOutputStream defined in net.corda.core.flows.AttachmentTests.fakeAttachment[LocalVariableDescriptor]

'toByteArray' @ [51:19] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'Test' @ [54:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [56:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'createSomeNodes' @ [56:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'nodes' @ [57:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'partyNodes' @ [57:24] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'nodes' @ [58:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'partyNodes' @ [58:24] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'n0' @ [59:9] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'registerInitiatedFlow' @ [59:12] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<AttachmentTests.FetchAttachmentsResponse>): Observable<AttachmentTests.FetchAttachmentsResponse> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> FetchAttachmentsResponse

'FetchAttachmentsResponse' @ [59:34] ==> public constructor FetchAttachmentsResponse(otherSide: Party) defined in net.corda.core.flows.AttachmentTests.FetchAttachmentsResponse[ClassConstructorDescriptorImpl]

'java' @ [59:66] ==> public val <T> KClass<AttachmentTests.FetchAttachmentsResponse>.java: Class<AttachmentTests.FetchAttachmentsResponse> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FetchAttachmentsResponse

'n1' @ [60:9] ==> val n1: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'registerInitiatedFlow' @ [60:12] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<AttachmentTests.FetchAttachmentsResponse>): Observable<AttachmentTests.FetchAttachmentsResponse> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> FetchAttachmentsResponse

'FetchAttachmentsResponse' @ [60:34] ==> public constructor FetchAttachmentsResponse(otherSide: Party) defined in net.corda.core.flows.AttachmentTests.FetchAttachmentsResponse[ClassConstructorDescriptorImpl]

'java' @ [60:66] ==> public val <T> KClass<AttachmentTests.FetchAttachmentsResponse>.java: Class<AttachmentTests.FetchAttachmentsResponse> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FetchAttachmentsResponse

'n0' @ [63:18] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'database' @ [63:21] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [63:30] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SecureHash): SecureHash defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'n0' @ [64:13] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'attachments' @ [64:16] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'importAttachment' @ [64:28] ==> public open fun importAttachment(jar: InputStream): SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'ByteArrayInputStream' @ [64:45] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'fakeAttachment' @ [64:66] ==> public final fun fakeAttachment(): ByteArray defined in net.corda.core.flows.AttachmentTests[SimpleFunctionDescriptorImpl]

'mockNet' @ [68:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'runNetwork' @ [68:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'n1' @ [69:18] ==> val n1: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'startAttachmentFlow' @ [69:21] ==> private final fun MockNetwork.MockNode.startAttachmentFlow(hashes: Set<SecureHash>, otherSide: Party): FlowStateMachine<FetchDataFlow.Result<Attachment>> defined in net.corda.core.flows.AttachmentTests[SimpleFunctionDescriptorImpl]

'setOf' @ [69:41] ==> public fun <T> setOf(element: SecureHash): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'id' @ [69:47] ==> val id: SecureHash defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'n0' @ [69:52] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'info' @ [69:55] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [69:60] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [70:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'runNetwork' @ [70:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [71:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Int, actual: Int, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Int

'f1' @ [71:25] ==> val f1: FlowStateMachine<FetchDataFlow.Result<Attachment>> defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'resultFuture' @ [71:28] ==> public abstract val resultFuture: CordaFuture<FetchDataFlow.Result<Attachment>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [71:41] ==> public fun <V> Future<FetchDataFlow.Result<Attachment>>.getOrThrow(timeout: Duration? = ...): FetchDataFlow.Result<Attachment> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result<Attachment>

'fromDisk' @ [71:54] ==> public final val fromDisk: List<Attachment> defined in net.corda.core.internal.FetchDataFlow.Result[DeserializedPropertyDescriptor]

'size' @ [71:63] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'n1' @ [74:26] ==> val n1: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'database' @ [74:29] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [74:38] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Attachment): Attachment defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attachment

'n1' @ [75:13] ==> val n1: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'attachments' @ [75:16] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'openAttachment' @ [75:28] ==> public open fun openAttachment(id: SecureHash): Attachment? defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'id' @ [75:43] ==> val id: SecureHash defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'assertEquals' @ [78:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SecureHash, actual: SecureHash, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SecureHash

'id' @ [78:22] ==> val id: SecureHash defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'attachment' @ [78:26] ==> val attachment: Attachment defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'open' @ [78:37] ==> public abstract fun open(): InputStream defined in net.corda.core.contracts.Attachment[DeserializedSimpleFunctionDescriptor]

'readBytes' @ [78:44] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'sha256' @ [78:56] ==> public fun ByteArray.sha256(): SecureHash.SHA256 defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'n0' @ [81:9] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'stop' @ [81:12] ==> public open fun stop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'n1' @ [83:58] ==> val n1: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'startAttachmentFlow' @ [83:61] ==> private final fun MockNetwork.MockNode.startAttachmentFlow(hashes: Set<SecureHash>, otherSide: Party): FlowStateMachine<FetchDataFlow.Result<Attachment>> defined in net.corda.core.flows.AttachmentTests[SimpleFunctionDescriptorImpl]

'setOf' @ [83:81] ==> public fun <T> setOf(element: SecureHash): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'id' @ [83:87] ==> val id: SecureHash defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'n0' @ [83:92] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'info' @ [83:95] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [83:100] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'resultFuture' @ [83:115] ==> public abstract val resultFuture: CordaFuture<FetchDataFlow.Result<Attachment>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [83:128] ==> public fun <V> Future<FetchDataFlow.Result<Attachment>>.getOrThrow(timeout: Duration? = ...): FetchDataFlow.Result<Attachment> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result<Attachment>

'assertEquals' @ [84:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: Attachment, actual: Attachment, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> Attachment

'attachment' @ [84:22] ==> val attachment: Attachment defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'response' @ [84:34] ==> val response: FetchDataFlow.Result<Attachment> defined in net.corda.core.flows.AttachmentTests.`download and store`[LocalVariableDescriptor]

'fromDisk' @ [84:43] ==> public final val fromDisk: List<Attachment> defined in net.corda.core.internal.FetchDataFlow.Result[DeserializedPropertyDescriptor]

'Test' @ [87:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [89:21] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'createSomeNodes' @ [89:29] ==> @JvmOverloads public final fun createSomeNodes(numPartyNodes: Int = ..., nodeFactory: MockNetwork.Factory<*> = ..., notaryKeyPair: KeyPair? = ...): MockNetwork.BasketOfNodes defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'nodes' @ [90:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'partyNodes' @ [90:24] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'nodes' @ [91:18] ==> val nodes: MockNetwork.BasketOfNodes defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'partyNodes' @ [91:24] ==> public final val partyNodes: List<MockNetwork.MockNode> defined in net.corda.testing.node.MockNetwork.BasketOfNodes[DeserializedPropertyDescriptor]

'n0' @ [92:9] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'registerInitiatedFlow' @ [92:12] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<AttachmentTests.FetchAttachmentsResponse>): Observable<AttachmentTests.FetchAttachmentsResponse> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> FetchAttachmentsResponse

'FetchAttachmentsResponse' @ [92:34] ==> public constructor FetchAttachmentsResponse(otherSide: Party) defined in net.corda.core.flows.AttachmentTests.FetchAttachmentsResponse[ClassConstructorDescriptorImpl]

'java' @ [92:66] ==> public val <T> KClass<AttachmentTests.FetchAttachmentsResponse>.java: Class<AttachmentTests.FetchAttachmentsResponse> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FetchAttachmentsResponse

'n1' @ [93:9] ==> val n1: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'registerInitiatedFlow' @ [93:12] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<AttachmentTests.FetchAttachmentsResponse>): Observable<AttachmentTests.FetchAttachmentsResponse> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> FetchAttachmentsResponse

'FetchAttachmentsResponse' @ [93:34] ==> public constructor FetchAttachmentsResponse(otherSide: Party) defined in net.corda.core.flows.AttachmentTests.FetchAttachmentsResponse[ClassConstructorDescriptorImpl]

'java' @ [93:66] ==> public val <T> KClass<AttachmentTests.FetchAttachmentsResponse>.java: Class<AttachmentTests.FetchAttachmentsResponse> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FetchAttachmentsResponse

'SecureHash' @ [96:20] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'randomSHA256' @ [96:31] ==> @JvmStatic public final fun randomSHA256(): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [97:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'runNetwork' @ [97:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'n1' @ [98:18] ==> val n1: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'startAttachmentFlow' @ [98:21] ==> private final fun MockNetwork.MockNode.startAttachmentFlow(hashes: Set<SecureHash>, otherSide: Party): FlowStateMachine<FetchDataFlow.Result<Attachment>> defined in net.corda.core.flows.AttachmentTests[SimpleFunctionDescriptorImpl]

'setOf' @ [98:41] ==> public fun <T> setOf(element: SecureHash.SHA256): Set<SecureHash.SHA256> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SHA256

'hash' @ [98:47] ==> val hash: SecureHash.SHA256 defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'n0' @ [98:54] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'info' @ [98:57] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [98:62] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [99:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'runNetwork' @ [99:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [100:17] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): FetchDataFlow.HashNotFound defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> HashNotFound

'f1' @ [100:63] ==> val f1: FlowStateMachine<FetchDataFlow.Result<Attachment>> defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'resultFuture' @ [100:66] ==> public abstract val resultFuture: CordaFuture<FetchDataFlow.Result<Attachment>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [100:79] ==> public fun <V> Future<FetchDataFlow.Result<Attachment>>.getOrThrow(timeout: Duration? = ...): FetchDataFlow.Result<Attachment> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result<Attachment>

'assertEquals' @ [101:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: SecureHash, actual: SecureHash, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> SecureHash

'hash' @ [101:22] ==> val hash: SecureHash.SHA256 defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'e' @ [101:28] ==> val e: FetchDataFlow.HashNotFound defined in net.corda.core.flows.AttachmentTests.missing[LocalVariableDescriptor]

'requested' @ [101:30] ==> public final val requested: SecureHash defined in net.corda.core.internal.FetchDataFlow.HashNotFound[DeserializedPropertyDescriptor]

'Test' @ [104:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'mockNet' @ [107:18] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'createNode' @ [107:26] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'MockNetwork.MockNode' @ [112:33] ==> public constructor MockNode(config: NodeConfiguration, mockNet: MockNetwork, networkMapAddress: SingleMessageRecipient?, advertisedServices: Set<ServiceInfo>, id: Int, overrideServices: Map<ServiceInfo, KeyPair>?, entropyRoot: BigInteger = ...) defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedClassConstructorDescriptor]

'config' @ [112:54] ==> value-parameter config: NodeConfiguration defined in net.corda.core.flows.AttachmentTests.`malicious response`.<no name provided>.create[ValueParameterDescriptorImpl]

'network' @ [112:62] ==> value-parameter network: MockNetwork defined in net.corda.core.flows.AttachmentTests.`malicious response`.<no name provided>.create[ValueParameterDescriptorImpl]

'networkMapAddr' @ [112:71] ==> value-parameter networkMapAddr: SingleMessageRecipient? defined in net.corda.core.flows.AttachmentTests.`malicious response`.<no name provided>.create[ValueParameterDescriptorImpl]

'advertisedServices' @ [112:87] ==> value-parameter advertisedServices: Set<ServiceInfo> defined in net.corda.core.flows.AttachmentTests.`malicious response`.<no name provided>.create[ValueParameterDescriptorImpl]

'id' @ [112:107] ==> value-parameter id: Int defined in net.corda.core.flows.AttachmentTests.`malicious response`.<no name provided>.create[ValueParameterDescriptorImpl]

'overrideServices' @ [112:111] ==> value-parameter overrideServices: Map<ServiceInfo, KeyPair>? defined in net.corda.core.flows.AttachmentTests.`malicious response`.<no name provided>.create[ValueParameterDescriptorImpl]

'entropyRoot' @ [112:129] ==> value-parameter entropyRoot: BigInteger defined in net.corda.core.flows.AttachmentTests.`malicious response`.<no name provided>.create[ValueParameterDescriptorImpl]

'super' @ [114:25] ==> <this> defined in net.corda.core.flows.AttachmentTests.`malicious response`.<no name provided>.create.<no name provided>[LazyClassReceiverParameterDescriptor]

'start' @ [114:31] ==> public open fun start(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'attachments' @ [115:25] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.core.flows.AttachmentTests.`malicious response`.<no name provided>.create.<no name provided>[DeserializedPropertyDescriptor]

'checkAttachmentsOnLoad' @ [115:37] ==> public final var checkAttachmentsOnLoad: Boolean defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedPropertyDescriptor]

'arrayOf' @ [119:34] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: ServiceInfo): Array<ServiceInfo> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> ServiceInfo

'ServiceInfo' @ [119:42] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [119:54] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [119:72] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'ServiceInfo' @ [119:79] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'SimpleNotaryService' @ [119:91] ==> public companion object defined in net.corda.node.services.transactions.SimpleNotaryService[FakeCallableDescriptorForObject]

'type' @ [119:111] ==> public final val type: ServiceType defined in net.corda.node.services.transactions.SimpleNotaryService.Companion[DeserializedPropertyDescriptor]

'mockNet' @ [120:18] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'createNode' @ [120:26] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'n0' @ [120:37] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'network' @ [120:40] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [120:48] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'n0' @ [122:9] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'registerInitiatedFlow' @ [122:12] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<AttachmentTests.FetchAttachmentsResponse>): Observable<AttachmentTests.FetchAttachmentsResponse> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> FetchAttachmentsResponse

'FetchAttachmentsResponse' @ [122:34] ==> public constructor FetchAttachmentsResponse(otherSide: Party) defined in net.corda.core.flows.AttachmentTests.FetchAttachmentsResponse[ClassConstructorDescriptorImpl]

'java' @ [122:66] ==> public val <T> KClass<AttachmentTests.FetchAttachmentsResponse>.java: Class<AttachmentTests.FetchAttachmentsResponse> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FetchAttachmentsResponse

'n1' @ [123:9] ==> val n1: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'registerInitiatedFlow' @ [123:12] ==> public final fun <T : FlowLogic<*>> registerInitiatedFlow(initiatedFlowClass: Class<AttachmentTests.FetchAttachmentsResponse>): Observable<AttachmentTests.FetchAttachmentsResponse> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : FlowLogic<*>> -> FetchAttachmentsResponse

'FetchAttachmentsResponse' @ [123:34] ==> public constructor FetchAttachmentsResponse(otherSide: Party) defined in net.corda.core.flows.AttachmentTests.FetchAttachmentsResponse[ClassConstructorDescriptorImpl]

'java' @ [123:66] ==> public val <T> KClass<AttachmentTests.FetchAttachmentsResponse>.java: Class<AttachmentTests.FetchAttachmentsResponse> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FetchAttachmentsResponse

'fakeAttachment' @ [125:26] ==> public final fun fakeAttachment(): ByteArray defined in net.corda.core.flows.AttachmentTests[SimpleFunctionDescriptorImpl]

'n0' @ [127:18] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'database' @ [127:21] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [127:30] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SecureHash): SecureHash defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'n0' @ [128:13] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'attachments' @ [128:16] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'importAttachment' @ [128:28] ==> public open fun importAttachment(jar: InputStream): SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'ByteArrayInputStream' @ [128:45] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'attachment' @ [128:66] ==> val attachment: ByteArray defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'toByteArray' @ [132:40] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'arraycopy' @ [133:16] ==> public open fun arraycopy(p0: (Any..Any?), p1: Int, p2: (Any..Any?), p3: Int, p4: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'corruptBytes' @ [133:26] ==> val corruptBytes: ByteArray defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'attachment' @ [133:43] ==> val attachment: ByteArray defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'corruptBytes' @ [133:58] ==> val corruptBytes: ByteArray defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'size' @ [133:71] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'NodeAttachmentService' @ [135:33] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [135:55] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[DeserializedClassConstructorDescriptor]

'id' @ [135:76] ==> val id: SecureHash defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'toString' @ [135:79] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'attachment' @ [135:101] ==> val attachment: ByteArray defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'n0' @ [136:9] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'database' @ [136:12] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [136:21] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'DatabaseTransactionManager' @ [137:13] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [137:40] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[DeserializedSimpleFunctionDescriptor]

'session' @ [137:50] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[DeserializedPropertyDescriptor]

'update' @ [137:58] ==> public abstract fun update(p0: (Any..Any?)): Unit defined in org.hibernate.Session[JavaMethodDescriptor]

'corruptAttachment' @ [137:65] ==> val corruptAttachment: NodeAttachmentService.DBAttachment defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'mockNet' @ [141:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'runNetwork' @ [141:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'n1' @ [142:18] ==> val n1: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'startAttachmentFlow' @ [142:21] ==> private final fun MockNetwork.MockNode.startAttachmentFlow(hashes: Set<SecureHash>, otherSide: Party): FlowStateMachine<FetchDataFlow.Result<Attachment>> defined in net.corda.core.flows.AttachmentTests[SimpleFunctionDescriptorImpl]

'setOf' @ [142:41] ==> public fun <T> setOf(element: SecureHash): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'id' @ [142:47] ==> val id: SecureHash defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'n0' @ [142:52] ==> val n0: MockNetwork.MockNode defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'info' @ [142:55] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [142:60] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'mockNet' @ [143:9] ==> public final lateinit var mockNet: MockNetwork defined in net.corda.core.flows.AttachmentTests[PropertyDescriptorImpl]

'runNetwork' @ [143:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'assertFailsWith' @ [144:9] ==> @InlineOnly public inline fun <reified T : Throwable> assertFailsWith(message: String? = ..., noinline block: () -> Unit): FetchDataFlow.DownloadedVsRequestedDataMismatch defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Throwable> -> DownloadedVsRequestedDataMismatch

'f1' @ [144:76] ==> val f1: FlowStateMachine<FetchDataFlow.Result<Attachment>> defined in net.corda.core.flows.AttachmentTests.`malicious response`[LocalVariableDescriptor]

'resultFuture' @ [144:79] ==> public abstract val resultFuture: CordaFuture<FetchDataFlow.Result<Attachment>> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'getOrThrow' @ [144:92] ==> public fun <V> Future<FetchDataFlow.Result<Attachment>>.getOrThrow(timeout: Duration? = ...): FetchDataFlow.Result<Attachment> defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Result<Attachment>

'services' @ [147:103] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [147:112] ==> public open fun <T> startFlow(logic: FlowLogic<FetchDataFlow.Result<Attachment>>): FlowStateMachine<FetchDataFlow.Result<Attachment>> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Result<Attachment>

'InitiatingFetchAttachmentsFlow' @ [147:122] ==> public constructor InitiatingFetchAttachmentsFlow(otherSide: Party, hashes: Set<SecureHash>) defined in net.corda.core.flows.AttachmentTests.InitiatingFetchAttachmentsFlow[ClassConstructorDescriptorImpl]

'otherSide' @ [147:153] ==> value-parameter otherSide: Party defined in net.corda.core.flows.AttachmentTests.startAttachmentFlow[ValueParameterDescriptorImpl]

'hashes' @ [147:164] ==> value-parameter hashes: Set<SecureHash> defined in net.corda.core.flows.AttachmentTests.startAttachmentFlow[ValueParameterDescriptorImpl]

'InitiatingFlow' @ [149:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<FetchDataFlow.Result<Attachment>>' @ [150:103] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Result<Attachment>

'Suspendable' @ [151:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [152:65] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<FetchDataFlow.Result<Attachment>>): FetchDataFlow.Result<Attachment> defined in net.corda.core.flows.AttachmentTests.InitiatingFetchAttachmentsFlow[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Result<Attachment>

'FetchAttachmentsFlow' @ [152:73] ==> public constructor FetchAttachmentsFlow(requests: Set<SecureHash>, otherSide: Party) defined in net.corda.core.internal.FetchAttachmentsFlow[DeserializedClassConstructorDescriptor]

'hashes' @ [152:94] ==> public final val hashes: Set<SecureHash> defined in net.corda.core.flows.AttachmentTests.InitiatingFetchAttachmentsFlow[PropertyDescriptorImpl]

'otherSide' @ [152:102] ==> public final val otherSide: Party defined in net.corda.core.flows.AttachmentTests.InitiatingFetchAttachmentsFlow[PropertyDescriptorImpl]

'InitiatedBy' @ [155:5] ==> public constructor InitiatedBy(value: KClass<out FlowLogic<*>>) defined in net.corda.core.flows.InitiatedBy[DeserializedClassConstructorDescriptor]

'InitiatingFetchAttachmentsFlow' @ [155:18] ==> public constructor InitiatingFetchAttachmentsFlow(otherSide: Party, hashes: Set<SecureHash>) defined in net.corda.core.flows.AttachmentTests.InitiatingFetchAttachmentsFlow[ClassConstructorDescriptorImpl]

'FlowLogic<Void?>' @ [156:68] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Void?

'Suspendable' @ [157:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'subFlow' @ [158:31] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.core.flows.AttachmentTests.FetchAttachmentsResponse[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'TestDataVendingFlow' @ [158:39] ==> public constructor TestDataVendingFlow(otherSide: Party) defined in net.corda.core.flows.TestDataVendingFlow[ClassConstructorDescriptorImpl]

'otherSide' @ [158:59] ==> public final val otherSide: Party defined in net.corda.core.flows.AttachmentTests.FetchAttachmentsResponse[PropertyDescriptorImpl]

