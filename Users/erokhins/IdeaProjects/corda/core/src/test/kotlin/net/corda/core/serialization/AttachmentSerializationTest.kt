'ByteArrayOutputStream' @ [34:53] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'apply' @ [34:77] ==> @InlineOnly public inline fun <T> ByteArrayOutputStream.apply(block: ByteArrayOutputStream.() -> Unit): ByteArrayOutputStream defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArrayOutputStream

'ZipOutputStream' @ [35:5] ==> public constructor ZipOutputStream(p0: (OutputStream..OutputStream?)) defined in java.util.zip.ZipOutputStream[JavaClassConstructorDescriptor]

'this' @ [35:21] ==> <this> defined in net.corda.core.serialization.createAttachmentData.<anonymous>[ReceiverParameterDescriptorImpl]

'use' @ [35:27] ==> @InlineOnly public inline fun <T : Closeable?, R> ZipOutputStream.use(block: (ZipOutputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> ZipOutputStream
    <R> -> Unit

'with' @ [36:9] ==> @InlineOnly public inline fun <T, R> with(receiver: ZipOutputStream, block: ZipOutputStream.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ZipOutputStream
    <R> -> Unit

'it' @ [36:14] ==> value-parameter it: ZipOutputStream defined in net.corda.core.serialization.createAttachmentData.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'putNextEntry' @ [37:13] ==> public open fun putNextEntry(p0: (ZipEntry..ZipEntry?)): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'ZipEntry' @ [37:26] ==> public constructor ZipEntry(p0: (String..String?)) defined in java.util.zip.ZipEntry[JavaClassConstructorDescriptor]

'write' @ [38:13] ==> public open fun write(p0: (ByteArray..ByteArray?)): Unit defined in java.util.zip.ZipOutputStream[JavaMethodDescriptor]

'content' @ [38:19] ==> value-parameter content: String defined in net.corda.core.serialization.createAttachmentData[ValueParameterDescriptorImpl]

'toByteArray' @ [38:27] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'UTF_8' @ [38:39] ==> public final val UTF_8: (Charset..Charset?) defined in java.nio.charset.StandardCharsets[JavaPropertyDescriptor]

'toByteArray' @ [41:3] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'ByteArrayOutputStream' @ [43:43] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'apply' @ [43:67] ==> @InlineOnly public inline fun <T> ByteArrayOutputStream.apply(block: ByteArrayOutputStream.() -> Unit): ByteArrayOutputStream defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArrayOutputStream

'extractFile' @ [43:75] ==> public open fun extractFile(path: String, outputTo: OutputStream): Unit defined in net.corda.core.contracts.Attachment[DeserializedSimpleFunctionDescriptor]

'this' @ [43:98] ==> <this> defined in net.corda.core.serialization.extractContent.<anonymous>[ReceiverParameterDescriptorImpl]

'toString' @ [43:106] ==> public open fun toString(p0: (String..String?)): (String..String?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'UTF_8' @ [43:115] ==> public final val UTF_8: (Charset..Charset?) defined in java.nio.charset.StandardCharsets[JavaPropertyDescriptor]

'name' @ [43:121] ==> public final fun name(): (String..String?) defined in java.nio.charset.Charset[JavaMethodDescriptor]

'database' @ [45:68] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [45:77] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> SecureHash): SecureHash defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'attachments' @ [46:5] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'importAttachment' @ [46:17] ==> public open fun importAttachment(jar: InputStream): SecureHash defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedSimpleFunctionDescriptor]

'createAttachmentData' @ [46:34] ==> private fun createAttachmentData(content: String): (ByteArray..ByteArray?) defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'content' @ [46:55] ==> value-parameter content: String defined in net.corda.core.serialization.saveAttachment[ValueParameterDescriptorImpl]

'inputStream' @ [46:64] ==> @InlineOnly public inline fun ByteArray.inputStream(): ByteArrayInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'database' @ [48:94] ==> public final lateinit var database: CordaPersistence defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'transaction' @ [48:103] ==> public final fun <T> transaction(statement: DatabaseTransaction.() -> Unit): Unit defined in net.corda.node.utilities.CordaPersistence[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'attachments' @ [49:5] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'updateAttachment' @ [49:17] ==> private fun NodeAttachmentService.updateAttachment(attachmentId: SecureHash, data: ByteArray): Unit defined in net.corda.core.serialization in file AttachmentSerializationTest.kt[SimpleFunctionDescriptorImpl]

'attachmentId' @ [49:34] ==> value-parameter attachmentId: SecureHash defined in net.corda.core.serialization.hackAttachment[ValueParameterDescriptorImpl]

'createAttachmentData' @ [49:48] ==> private fun createAttachmentData(content: String): (ByteArray..ByteArray?) defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'content' @ [49:69] ==> value-parameter content: String defined in net.corda.core.serialization.hackAttachment[ValueParameterDescriptorImpl]

'DatabaseTransactionManager' @ [56:19] ==> public companion object defined in net.corda.node.utilities.DatabaseTransactionManager[FakeCallableDescriptorForObject]

'current' @ [56:46] ==> public final fun current(): DatabaseTransaction defined in net.corda.node.utilities.DatabaseTransactionManager.Companion[DeserializedSimpleFunctionDescriptor]

'session' @ [56:56] ==> public final val session: Session defined in net.corda.node.utilities.DatabaseTransaction[DeserializedPropertyDescriptor]

'session' @ [57:22] ==> val session: Session defined in net.corda.core.serialization.updateAttachment[LocalVariableDescriptor]

'get' @ [57:30] ==> public abstract operator fun <T : (Any..Any?)> get(p0: (Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>..Class<(NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?)>?), p1: (Serializable..Serializable?)): (NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?) defined in org.hibernate.Session[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DBAttachment

'NodeAttachmentService' @ [57:70] ==> public companion object defined in net.corda.node.services.persistence.NodeAttachmentService[FakeCallableDescriptorForObject]

'DBAttachment' @ [57:92] ==> public constructor DBAttachment(attId: String, content: ByteArray) defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[DeserializedClassConstructorDescriptor]

'java' @ [57:112] ==> public val <T> KClass<NodeAttachmentService.DBAttachment>.java: Class<NodeAttachmentService.DBAttachment> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DBAttachment

'attachmentId' @ [57:118] ==> value-parameter attachmentId: SecureHash defined in net.corda.core.serialization.updateAttachment[ValueParameterDescriptorImpl]

'toString' @ [57:131] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'attachment' @ [58:5] ==> val attachment: (NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?) defined in net.corda.core.serialization.updateAttachment[LocalVariableDescriptor]

'let' @ [58:17] ==> @InlineOnly public inline fun <T, R> NodeAttachmentService.DBAttachment.let(block: (NodeAttachmentService.DBAttachment) -> (Serializable..Serializable?)): (Serializable..Serializable?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DBAttachment
    <R> -> (java.io.Serializable..java.io.Serializable?)

'attachment' @ [59:9] ==> val attachment: (NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?) defined in net.corda.core.serialization.updateAttachment[LocalVariableDescriptor]

'content' @ [59:20] ==> @field:Column @field:Lob public final var content: ByteArray defined in net.corda.node.services.persistence.NodeAttachmentService.DBAttachment[DeserializedPropertyDescriptor]

'data' @ [59:30] ==> value-parameter data: ByteArray defined in net.corda.core.serialization.updateAttachment[ValueParameterDescriptorImpl]

'session' @ [60:9] ==> val session: Session defined in net.corda.core.serialization.updateAttachment[LocalVariableDescriptor]

'save' @ [60:17] ==> public abstract fun save(p0: (Any..Any?)): (Serializable..Serializable?) defined in org.hibernate.Session[JavaMethodDescriptor]

'attachment' @ [60:22] ==> val attachment: (NodeAttachmentService.DBAttachment..NodeAttachmentService.DBAttachment?) defined in net.corda.core.serialization.updateAttachment[LocalVariableDescriptor]

'Before' @ [69:5] ==> public constructor Before() defined in org.junit.Before[JavaClassConstructorDescriptor]

'mockNet' @ [71:9] ==> private final lateinit var mockNet: MockNetwork defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'MockNetwork' @ [71:19] ==> public constructor MockNetwork(networkSendManuallyPumped: Boolean = ..., threadPerNode: Boolean = ..., servicePeerAllocationStrategy: InMemoryMessagingNetwork.ServicePeerAllocationStrategy = ..., defaultFactory: MockNetwork.Factory<*> = ..., initialiseSerialization: Boolean = ...) defined in net.corda.testing.node.MockNetwork[DeserializedClassConstructorDescriptor]

'server' @ [72:9] ==> private final lateinit var server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'mockNet' @ [72:18] ==> private final lateinit var mockNet: MockNetwork defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'createNode' @ [72:26] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'ServiceInfo' @ [72:58] ==> public constructor ServiceInfo(type: ServiceType, name: X500Name? = ...) defined in net.corda.core.node.services.ServiceInfo[DeserializedClassConstructorDescriptor]

'NetworkMapService' @ [72:70] ==> public companion object defined in net.corda.node.services.network.NetworkMapService[FakeCallableDescriptorForObject]

'type' @ [72:88] ==> public final val type: ServiceType defined in net.corda.node.services.network.NetworkMapService.Companion[DeserializedPropertyDescriptor]

'client' @ [73:9] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'mockNet' @ [73:18] ==> private final lateinit var mockNet: MockNetwork defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'createNode' @ [73:26] ==> public final fun createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'server' @ [73:37] ==> private final lateinit var server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'network' @ [73:44] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [73:52] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'client' @ [74:9] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'disableDBCloseOnStop' @ [74:16] ==> public final fun disableDBCloseOnStop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'mockNet' @ [75:9] ==> private final lateinit var mockNet: MockNetwork defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'runNetwork' @ [75:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'After' @ [78:5] ==> public constructor After() defined in org.junit.After[JavaClassConstructorDescriptor]

'mockNet' @ [80:9] ==> private final lateinit var mockNet: MockNetwork defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'stopNodes' @ [80:17] ==> public final fun stopNodes(): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'FlowLogic<Unit>' @ [83:91] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> Unit

'Suspendable' @ [84:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'sendData' @ [86:17] ==> private final val sendData: Boolean defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic[PropertyDescriptorImpl]

'subFlow' @ [87:17] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<Void?>): Void? defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Void?

'TestDataVendingFlow' @ [87:25] ==> public constructor TestDataVendingFlow(otherSide: Party) defined in net.corda.core.flows.TestDataVendingFlow[ClassConstructorDescriptorImpl]

'client' @ [87:45] ==> private final val client: Party defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic[PropertyDescriptorImpl]

'receive' @ [89:13] ==> public final inline fun <reified R : Any> receive(otherParty: Party): UntrustworthyData<String> defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> String

'client' @ [89:29] ==> private final val client: Party defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic[PropertyDescriptorImpl]

'unwrap' @ [89:37] ==> public inline fun <T, R> UntrustworthyData<String>.unwrap(validator: (String) -> Unit): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'assertEquals' @ [89:46] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'it' @ [89:71] ==> value-parameter it: String defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic.call.<anonymous>[ValueParameterDescriptorImpl]

'sendAndReceive' @ [90:13] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<String> defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> String

'client' @ [90:36] ==> private final val client: Party defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic[PropertyDescriptorImpl]

'unwrap' @ [90:52] ==> public inline fun <T, R> UntrustworthyData<String>.unwrap(validator: (String) -> Unit): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'assertEquals' @ [90:61] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'it' @ [90:86] ==> value-parameter it: String defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic.call.<anonymous>[ValueParameterDescriptorImpl]

'InitiatingFlow' @ [96:5] ==> public constructor InitiatingFlow(version: Int = ...) defined in net.corda.core.flows.InitiatingFlow[DeserializedClassConstructorDescriptor]

'FlowLogic<ClientResult>' @ [97:72] ==> public constructor FlowLogic<out T>() defined in net.corda.core.flows.FlowLogic[DeserializedClassConstructorDescriptor]
Inferred types:
    <out T> -> ClientResult

'server' @ [98:31] ==> value-parameter server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic.<init>[ValueParameterDescriptorImpl]

'info' @ [98:38] ==> public final lateinit var info: NodeInfo defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'legalIdentity' @ [98:43] ==> public final val legalIdentity: Party defined in net.corda.core.node.NodeInfo[DeserializedPropertyDescriptor]

'Suspendable' @ [100:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'sendAndReceive' @ [102:13] ==> public final inline fun <reified R : Any> sendAndReceive(otherParty: Party, payload: Any): UntrustworthyData<String> defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R : Any> -> String

'server' @ [102:36] ==> internal final val server: Party defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic[PropertyDescriptorImpl]

'unwrap' @ [102:56] ==> public inline fun <T, R> UntrustworthyData<String>.unwrap(validator: (String) -> Unit): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'assertEquals' @ [102:65] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'it' @ [102:86] ==> value-parameter it: String defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic.communicate.<anonymous>[ValueParameterDescriptorImpl]

'send' @ [103:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic[DeserializedSimpleFunctionDescriptor]

'server' @ [103:18] ==> internal final val server: Party defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic[PropertyDescriptorImpl]

'Suspendable' @ [106:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'ClientResult' @ [107:31] ==> public constructor ClientResult(attachmentContent: String) defined in net.corda.core.serialization.AttachmentSerializationTest.ClientResult[ClassConstructorDescriptorImpl]

'getAttachmentContent' @ [107:44] ==> @Suspendable internal abstract fun getAttachmentContent(): String defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic[SimpleFunctionDescriptorImpl]

'Suspendable' @ [109:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'UnsupportedOperationException' @ [114:37] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'ClientLogic' @ [117:146] ==> public constructor ClientLogic(server: MockNetwork.MockNode) defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic[ClassConstructorDescriptorImpl]

'server' @ [117:158] ==> value-parameter server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest.CustomAttachmentLogic.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [118:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'CustomAttachment' @ [120:36] ==> public constructor CustomAttachment(id: SecureHash, customContent: String) defined in net.corda.core.serialization.AttachmentSerializationTest.CustomAttachment[ClassConstructorDescriptorImpl]

'attachmentId' @ [120:53] ==> private final val attachmentId: SecureHash defined in net.corda.core.serialization.AttachmentSerializationTest.CustomAttachmentLogic[PropertyDescriptorImpl]

'customContent' @ [120:67] ==> private final val customContent: String defined in net.corda.core.serialization.AttachmentSerializationTest.CustomAttachmentLogic[PropertyDescriptorImpl]

'communicate' @ [121:13] ==> @Suspendable internal final fun communicate(): Unit defined in net.corda.core.serialization.AttachmentSerializationTest.CustomAttachmentLogic[SimpleFunctionDescriptorImpl]

'customAttachment' @ [122:20] ==> val customAttachment: AttachmentSerializationTest.CustomAttachment defined in net.corda.core.serialization.AttachmentSerializationTest.CustomAttachmentLogic.getAttachmentContent[LocalVariableDescriptor]

'customContent' @ [122:37] ==> internal final val customContent: String defined in net.corda.core.serialization.AttachmentSerializationTest.CustomAttachment[PropertyDescriptorImpl]

'ClientLogic' @ [126:109] ==> public constructor ClientLogic(server: MockNetwork.MockNode) defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic[ClassConstructorDescriptorImpl]

'server' @ [126:121] ==> value-parameter server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest.OpenAttachmentLogic.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [127:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'serviceHub' @ [129:35] ==> public final val serviceHub: ServiceHub defined in net.corda.core.serialization.AttachmentSerializationTest.OpenAttachmentLogic[DeserializedPropertyDescriptor]

'attachments' @ [129:46] ==> public abstract val attachments: AttachmentStorage defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'openAttachment' @ [129:58] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[DeserializedSimpleFunctionDescriptor]

'attachmentId' @ [129:73] ==> private final val attachmentId: SecureHash defined in net.corda.core.serialization.AttachmentSerializationTest.OpenAttachmentLogic[PropertyDescriptorImpl]

'communicate' @ [130:13] ==> @Suspendable internal final fun communicate(): Unit defined in net.corda.core.serialization.AttachmentSerializationTest.OpenAttachmentLogic[SimpleFunctionDescriptorImpl]

'localAttachment' @ [131:20] ==> val localAttachment: Attachment defined in net.corda.core.serialization.AttachmentSerializationTest.OpenAttachmentLogic.getAttachmentContent[LocalVariableDescriptor]

'extractContent' @ [131:36] ==> private fun Attachment.extractContent(): (String..String?) defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'ClientLogic' @ [135:110] ==> public constructor ClientLogic(server: MockNetwork.MockNode) defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic[ClassConstructorDescriptorImpl]

'server' @ [135:122] ==> value-parameter server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest.FetchAttachmentLogic.<init>[ValueParameterDescriptorImpl]

'Suspendable' @ [136:9] ==> public constructor Suspendable() defined in co.paralleluniverse.fibers.Suspendable[JavaClassConstructorDescriptor]

'component1' @ [138:18] ==> @InlineOnly public operator inline fun <T> List<Attachment>.component1(): Attachment defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attachment

'subFlow' @ [138:42] ==> @Suspendable public open fun <R> subFlow(subLogic: FlowLogic<FetchDataFlow.Result<Attachment>>): FetchDataFlow.Result<Attachment> defined in net.corda.core.serialization.AttachmentSerializationTest.FetchAttachmentLogic[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Result<Attachment>

'FetchAttachmentsFlow' @ [138:50] ==> public constructor FetchAttachmentsFlow(requests: Set<SecureHash>, otherSide: Party) defined in net.corda.core.internal.FetchAttachmentsFlow[DeserializedClassConstructorDescriptor]

'setOf' @ [138:71] ==> public fun <T> setOf(element: SecureHash): Set<SecureHash> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'attachmentId' @ [138:77] ==> private final val attachmentId: SecureHash defined in net.corda.core.serialization.AttachmentSerializationTest.FetchAttachmentLogic[PropertyDescriptorImpl]

'server' @ [138:92] ==> internal final val server: Party defined in net.corda.core.serialization.AttachmentSerializationTest.FetchAttachmentLogic[PropertyDescriptorImpl]

'downloaded' @ [138:101] ==> public final val downloaded: List<Attachment> defined in net.corda.core.internal.FetchDataFlow.Result[DeserializedPropertyDescriptor]

'send' @ [139:13] ==> @Suspendable public open fun send(otherParty: Party, payload: Any): Unit defined in net.corda.core.serialization.AttachmentSerializationTest.FetchAttachmentLogic[DeserializedSimpleFunctionDescriptor]

'server' @ [139:18] ==> internal final val server: Party defined in net.corda.core.serialization.AttachmentSerializationTest.FetchAttachmentLogic[PropertyDescriptorImpl]

'End' @ [139:48] ==> public object End : FetchDataFlow.Request defined in net.corda.core.internal.FetchDataFlow.Request[FakeCallableDescriptorForObject]

'communicate' @ [140:13] ==> @Suspendable internal final fun communicate(): Unit defined in net.corda.core.serialization.AttachmentSerializationTest.FetchAttachmentLogic[SimpleFunctionDescriptorImpl]

'downloadedAttachment' @ [141:20] ==> val downloadedAttachment: Attachment defined in net.corda.core.serialization.AttachmentSerializationTest.FetchAttachmentLogic.getAttachmentContent[LocalVariableDescriptor]

'extractContent' @ [141:41] ==> private fun Attachment.extractContent(): (String..String?) defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'server' @ [146:9] ==> private final lateinit var server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'internalRegisterFlowFactory' @ [146:16] ==> public final fun <F : FlowLogic<*>> internalRegisterFlowFactory(initiatingFlowClass: Class<out FlowLogic<*>>, flowFactory: InitiatedFlowFactory<AttachmentSerializationTest.ServerLogic>, initiatedFlowClass: Class<AttachmentSerializationTest.ServerLogic>, track: Boolean): Observable<AttachmentSerializationTest.ServerLogic> defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <F : FlowLogic<*>> -> ServerLogic

'ClientLogic' @ [147:17] ==> public constructor ClientLogic(server: MockNetwork.MockNode) defined in net.corda.core.serialization.AttachmentSerializationTest.ClientLogic[ClassConstructorDescriptorImpl]

'java' @ [147:36] ==> public val <T> KClass<AttachmentSerializationTest.ClientLogic>.java: Class<AttachmentSerializationTest.ClientLogic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClientLogic

'Core' @ [148:38] ==> public constructor Core<out F : FlowLogic<*>>(factory: (Party) -> AttachmentSerializationTest.ServerLogic) defined in net.corda.node.internal.InitiatedFlowFactory.Core[DeserializedClassConstructorDescriptor]
Inferred types:
    <out F : FlowLogic<*>> -> ServerLogic

'ServerLogic' @ [148:45] ==> public constructor ServerLogic(client: Party, sendData: Boolean) defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic[ClassConstructorDescriptorImpl]

'it' @ [148:57] ==> value-parameter it: Party defined in net.corda.core.serialization.AttachmentSerializationTest.launchFlow.<anonymous>[ValueParameterDescriptorImpl]

'sendData' @ [148:61] ==> value-parameter sendData: Boolean = ... defined in net.corda.core.serialization.AttachmentSerializationTest.launchFlow[ValueParameterDescriptorImpl]

'ServerLogic' @ [149:17] ==> public constructor ServerLogic(client: Party, sendData: Boolean) defined in net.corda.core.serialization.AttachmentSerializationTest.ServerLogic[ClassConstructorDescriptorImpl]

'java' @ [149:36] ==> public val <T> KClass<AttachmentSerializationTest.ServerLogic>.java: Class<AttachmentSerializationTest.ServerLogic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ServerLogic

'client' @ [151:9] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'services' @ [151:16] ==> public final val services: ServiceHubInternal defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'startFlow' @ [151:25] ==> public open fun <T> startFlow(logic: FlowLogic<AttachmentSerializationTest.ClientResult>): FlowStateMachine<AttachmentSerializationTest.ClientResult> defined in net.corda.node.services.api.ServiceHubInternal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClientResult

'clientLogic' @ [151:35] ==> value-parameter clientLogic: AttachmentSerializationTest.ClientLogic defined in net.corda.core.serialization.AttachmentSerializationTest.launchFlow[ValueParameterDescriptorImpl]

'mockNet' @ [152:9] ==> private final lateinit var mockNet: MockNetwork defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'runNetwork' @ [152:17] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'rounds' @ [152:28] ==> value-parameter rounds: Int defined in net.corda.core.serialization.AttachmentSerializationTest.launchFlow[ValueParameterDescriptorImpl]

'client' @ [156:9] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'stop' @ [156:16] ==> public open fun stop(): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'client' @ [157:9] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'mockNet' @ [157:18] ==> private final lateinit var mockNet: MockNetwork defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'createNode' @ [157:26] ==> public final fun <N : MockNetwork.MockNode> createNode(networkMapAddress: SingleMessageRecipient? = ..., forcedID: Int? = ..., nodeFactory: MockNetwork.Factory<MockNetwork.MockNode>, start: Boolean = ..., legalName: X500Name? = ..., overrideServices: Map<ServiceInfo, KeyPair>? = ..., entropyRoot: BigInteger = ..., vararg advertisedServices: ServiceInfo, configOverrides: (NodeConfiguration) -> Any? = ...): MockNetwork.MockNode defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <N : MockNetwork.MockNode> -> MockNode

'server' @ [157:37] ==> private final lateinit var server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'network' @ [157:44] ==> public final lateinit var network: MessagingService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'myAddress' @ [157:52] ==> public abstract val myAddress: SingleMessageRecipient defined in net.corda.node.services.messaging.MessagingService[DeserializedPropertyDescriptor]

'client' @ [157:63] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'id' @ [157:70] ==> public final val id: Int defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'MockNetwork.MockNode' @ [161:33] ==> public constructor MockNode(config: NodeConfiguration, mockNet: MockNetwork, networkMapAddress: SingleMessageRecipient?, advertisedServices: Set<ServiceInfo>, id: Int, overrideServices: Map<ServiceInfo, KeyPair>?, entropyRoot: BigInteger = ...) defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedClassConstructorDescriptor]

'config' @ [161:54] ==> value-parameter config: NodeConfiguration defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create[ValueParameterDescriptorImpl]

'network' @ [161:62] ==> value-parameter network: MockNetwork defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create[ValueParameterDescriptorImpl]

'networkMapAddr' @ [161:71] ==> value-parameter networkMapAddr: SingleMessageRecipient? defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create[ValueParameterDescriptorImpl]

'advertisedServices' @ [161:87] ==> value-parameter advertisedServices: Set<ServiceInfo> defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create[ValueParameterDescriptorImpl]

'id' @ [161:107] ==> value-parameter id: Int defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create[ValueParameterDescriptorImpl]

'overrideServices' @ [161:111] ==> value-parameter overrideServices: Map<ServiceInfo, KeyPair>? defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create[ValueParameterDescriptorImpl]

'entropyRoot' @ [161:129] ==> value-parameter entropyRoot: BigInteger defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create[ValueParameterDescriptorImpl]

'attachments' @ [163:25] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create.<no name provided>[DeserializedPropertyDescriptor]

'checkAttachmentsOnLoad' @ [163:37] ==> public final var checkAttachmentsOnLoad: Boolean defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedPropertyDescriptor]

'checkAttachmentsOnLoad' @ [163:62] ==> value-parameter checkAttachmentsOnLoad: Boolean = ... defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent[ValueParameterDescriptorImpl]

'super' @ [164:25] ==> <this> defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create.<no name provided>[LazyClassReceiverParameterDescriptor]

'startMessagingService' @ [164:31] ==> protected open fun startMessagingService(rpcOps: RPCOps): Unit defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedSimpleFunctionDescriptor]

'rpcOps' @ [164:53] ==> value-parameter rpcOps: RPCOps defined in net.corda.core.serialization.AttachmentSerializationTest.rebootClientAndGetAttachmentContent.<no name provided>.create.<no name provided>.startMessagingService[ValueParameterDescriptorImpl]

'client' @ [169:17] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'smm' @ [169:24] ==> public final lateinit var smm: StateMachineManager defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'allStateMachines' @ [169:28] ==> public final val allStateMachines: List<FlowLogic<*>> defined in net.corda.node.services.statemachine.StateMachineManager[DeserializedPropertyDescriptor]

'stateMachine' @ [169:48] ==> public final var stateMachine: FlowStateMachine<*> defined in net.corda.core.flows.FlowLogic[DeserializedPropertyDescriptor]

'resultFuture' @ [169:61] ==> public abstract val resultFuture: CordaFuture<out Any?> defined in net.corda.core.internal.FlowStateMachine[DeserializedPropertyDescriptor]

'apply' @ [169:74] ==> @InlineOnly public inline fun <T> CordaFuture<out Any?>.apply(block: CordaFuture<out Any?>.() -> Unit): CordaFuture<out Any?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CordaFuture<out Any?>

'mockNet' @ [169:82] ==> private final lateinit var mockNet: MockNetwork defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'runNetwork' @ [169:90] ==> @JvmOverloads public final fun runNetwork(rounds: Int = ...): Unit defined in net.corda.testing.node.MockNetwork[DeserializedSimpleFunctionDescriptor]

'getOrThrow' @ [169:105] ==> public fun <V> Future<out Any?>.getOrThrow(timeout: Duration? = ...): Any? defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> Any?

'attachmentContent' @ [169:135] ==> internal final val attachmentContent: String defined in net.corda.core.serialization.AttachmentSerializationTest.ClientResult[PropertyDescriptorImpl]

'Test' @ [172:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'SecureHash' @ [174:28] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'sha256' @ [174:39] ==> @JvmStatic public final fun sha256(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'launchFlow' @ [175:9] ==> private final fun launchFlow(clientLogic: AttachmentSerializationTest.ClientLogic, rounds: Int, sendData: Boolean = ...): Unit defined in net.corda.core.serialization.AttachmentSerializationTest[SimpleFunctionDescriptorImpl]

'CustomAttachmentLogic' @ [175:20] ==> public constructor CustomAttachmentLogic(server: MockNetwork.MockNode, attachmentId: SecureHash, customContent: String) defined in net.corda.core.serialization.AttachmentSerializationTest.CustomAttachmentLogic[ClassConstructorDescriptorImpl]

'server' @ [175:42] ==> private final lateinit var server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'attachmentId' @ [175:50] ==> val attachmentId: SecureHash.SHA256 defined in net.corda.core.serialization.AttachmentSerializationTest.`custom (and non-persisted) attachment should be saved in checkpoint`[LocalVariableDescriptor]

'assertEquals' @ [176:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'rebootClientAndGetAttachmentContent' @ [176:32] ==> private final fun rebootClientAndGetAttachmentContent(checkAttachmentsOnLoad: Boolean = ...): String defined in net.corda.core.serialization.AttachmentSerializationTest[SimpleFunctionDescriptorImpl]

'Test' @ [179:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'client' @ [181:28] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'saveAttachment' @ [181:35] ==> private fun MockNetwork.MockNode.saveAttachment(content: String): SecureHash defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'launchFlow' @ [182:9] ==> private final fun launchFlow(clientLogic: AttachmentSerializationTest.ClientLogic, rounds: Int, sendData: Boolean = ...): Unit defined in net.corda.core.serialization.AttachmentSerializationTest[SimpleFunctionDescriptorImpl]

'CustomAttachmentLogic' @ [182:20] ==> public constructor CustomAttachmentLogic(server: MockNetwork.MockNode, attachmentId: SecureHash, customContent: String) defined in net.corda.core.serialization.AttachmentSerializationTest.CustomAttachmentLogic[ClassConstructorDescriptorImpl]

'server' @ [182:42] ==> private final lateinit var server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'attachmentId' @ [182:50] ==> val attachmentId: SecureHash defined in net.corda.core.serialization.AttachmentSerializationTest.`custom attachment should be saved in checkpoint even if its data was persisted`[LocalVariableDescriptor]

'client' @ [183:9] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'hackAttachment' @ [183:16] ==> private fun MockNetwork.MockNode.hackAttachment(attachmentId: SecureHash, content: String): Unit defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'attachmentId' @ [183:31] ==> val attachmentId: SecureHash defined in net.corda.core.serialization.AttachmentSerializationTest.`custom attachment should be saved in checkpoint even if its data was persisted`[LocalVariableDescriptor]

'assertEquals' @ [184:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'rebootClientAndGetAttachmentContent' @ [184:32] ==> private final fun rebootClientAndGetAttachmentContent(checkAttachmentsOnLoad: Boolean = ...): String defined in net.corda.core.serialization.AttachmentSerializationTest[SimpleFunctionDescriptorImpl]

'Test' @ [187:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'client' @ [189:28] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'saveAttachment' @ [189:35] ==> private fun MockNetwork.MockNode.saveAttachment(content: String): SecureHash defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'client' @ [190:9] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'attachments' @ [190:16] ==> public final lateinit var attachments: NodeAttachmentService defined in net.corda.testing.node.MockNetwork.MockNode[DeserializedPropertyDescriptor]

'checkAttachmentsOnLoad' @ [190:28] ==> public final var checkAttachmentsOnLoad: Boolean defined in net.corda.node.services.persistence.NodeAttachmentService[DeserializedPropertyDescriptor]

'launchFlow' @ [191:9] ==> private final fun launchFlow(clientLogic: AttachmentSerializationTest.ClientLogic, rounds: Int, sendData: Boolean = ...): Unit defined in net.corda.core.serialization.AttachmentSerializationTest[SimpleFunctionDescriptorImpl]

'OpenAttachmentLogic' @ [191:20] ==> public constructor OpenAttachmentLogic(server: MockNetwork.MockNode, attachmentId: SecureHash) defined in net.corda.core.serialization.AttachmentSerializationTest.OpenAttachmentLogic[ClassConstructorDescriptorImpl]

'server' @ [191:40] ==> private final lateinit var server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'attachmentId' @ [191:48] ==> val attachmentId: SecureHash defined in net.corda.core.serialization.AttachmentSerializationTest.`only the hash of a regular attachment should be saved in checkpoint`[LocalVariableDescriptor]

'client' @ [192:9] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'hackAttachment' @ [192:16] ==> private fun MockNetwork.MockNode.hackAttachment(attachmentId: SecureHash, content: String): Unit defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'attachmentId' @ [192:31] ==> val attachmentId: SecureHash defined in net.corda.core.serialization.AttachmentSerializationTest.`only the hash of a regular attachment should be saved in checkpoint`[LocalVariableDescriptor]

'assertEquals' @ [193:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'rebootClientAndGetAttachmentContent' @ [193:32] ==> private final fun rebootClientAndGetAttachmentContent(checkAttachmentsOnLoad: Boolean = ...): String defined in net.corda.core.serialization.AttachmentSerializationTest[SimpleFunctionDescriptorImpl]

'Test' @ [196:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'server' @ [198:28] ==> private final lateinit var server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'saveAttachment' @ [198:35] ==> private fun MockNetwork.MockNode.saveAttachment(content: String): SecureHash defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'launchFlow' @ [199:9] ==> private final fun launchFlow(clientLogic: AttachmentSerializationTest.ClientLogic, rounds: Int, sendData: Boolean = ...): Unit defined in net.corda.core.serialization.AttachmentSerializationTest[SimpleFunctionDescriptorImpl]

'FetchAttachmentLogic' @ [199:20] ==> public constructor FetchAttachmentLogic(server: MockNetwork.MockNode, attachmentId: SecureHash) defined in net.corda.core.serialization.AttachmentSerializationTest.FetchAttachmentLogic[ClassConstructorDescriptorImpl]

'server' @ [199:41] ==> private final lateinit var server: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'attachmentId' @ [199:49] ==> val attachmentId: SecureHash defined in net.corda.core.serialization.AttachmentSerializationTest.`only the hash of a FetchAttachmentsFlow attachment should be saved in checkpoint`[LocalVariableDescriptor]

'client' @ [200:9] ==> private final lateinit var client: MockNetwork.MockNode defined in net.corda.core.serialization.AttachmentSerializationTest[PropertyDescriptorImpl]

'hackAttachment' @ [200:16] ==> private fun MockNetwork.MockNode.hackAttachment(attachmentId: SecureHash, content: String): Unit defined in net.corda.core.serialization[SimpleFunctionDescriptorImpl]

'attachmentId' @ [200:31] ==> val attachmentId: SecureHash defined in net.corda.core.serialization.AttachmentSerializationTest.`only the hash of a FetchAttachmentsFlow attachment should be saved in checkpoint`[LocalVariableDescriptor]

'assertEquals' @ [201:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'rebootClientAndGetAttachmentContent' @ [201:32] ==> private final fun rebootClientAndGetAttachmentContent(checkAttachmentsOnLoad: Boolean = ...): String defined in net.corda.core.serialization.AttachmentSerializationTest[SimpleFunctionDescriptorImpl]

