'config' @ [32:48] ==> public final val config: Config defined in net.corda.verifier.VerifierConfiguration[PropertyDescriptorImpl]

'config' @ [33:46] ==> public final val config: Config defined in net.corda.verifier.VerifierConfiguration[PropertyDescriptorImpl]

'config' @ [34:48] ==> public final val config: Config defined in net.corda.verifier.VerifierConfiguration[PropertyDescriptorImpl]

'loggerFor' @ [39:27] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Verifier

'parseResources' @ [42:47] ==> public open fun parseResources(p0: (String..String?), p1: (ConfigParseOptions..ConfigParseOptions?)): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'defaults' @ [42:108] ==> public open fun defaults(): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'setAllowMissing' @ [42:119] ==> public open fun setAllowMissing(p0: Boolean): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'parseFile' @ [43:46] ==> public open fun parseFile(p0: (File..File?), p1: (ConfigParseOptions..ConfigParseOptions?)): (Config..Config?) defined in com.typesafe.config.ConfigFactory[JavaMethodDescriptor]

'configPath' @ [43:56] ==> value-parameter configPath: Path defined in net.corda.verifier.Verifier.Companion.loadConfiguration[ValueParameterDescriptorImpl]

'toFile' @ [43:67] ==> public abstract fun toFile(): (File..File?) defined in java.nio.file.Path[JavaMethodDescriptor]

'defaults' @ [43:96] ==> public open fun defaults(): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'setAllowMissing' @ [43:107] ==> public open fun setAllowMissing(p0: Boolean): (ConfigParseOptions..ConfigParseOptions?) defined in com.typesafe.config.ConfigParseOptions[JavaMethodDescriptor]

'customConfig' @ [44:34] ==> val customConfig: (Config..Config?) defined in net.corda.verifier.Verifier.Companion.loadConfiguration[LocalVariableDescriptor]

'withFallback' @ [44:47] ==> public abstract fun withFallback(p0: (ConfigMergeable..ConfigMergeable?)): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'defaultConfig' @ [44:60] ==> val defaultConfig: (Config..Config?) defined in net.corda.verifier.Verifier.Companion.loadConfiguration[LocalVariableDescriptor]

'resolve' @ [44:75] ==> public abstract fun resolve(): (Config..Config?) defined in com.typesafe.config.Config[JavaMethodDescriptor]

'VerifierConfiguration' @ [45:20] ==> public constructor VerifierConfiguration(baseDirectory: Path, config: Config) defined in net.corda.verifier.VerifierConfiguration[ClassConstructorDescriptorImpl]

'baseDirectory' @ [45:42] ==> value-parameter baseDirectory: Path defined in net.corda.verifier.Verifier.Companion.loadConfiguration[ValueParameterDescriptorImpl]

'resolvedConfig' @ [45:57] ==> val resolvedConfig: (Config..Config?) defined in net.corda.verifier.Verifier.Companion.loadConfiguration[LocalVariableDescriptor]

'JvmStatic' @ [48:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'require' @ [50:13] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'args' @ [50:21] ==> value-parameter args: Array<String> defined in net.corda.verifier.Verifier.Companion.main[ValueParameterDescriptorImpl]

'isNotEmpty' @ [50:26] ==> @InlineOnly public inline fun <T> Array<out String>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'get' @ [51:39] ==> public open fun get(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.Paths[JavaMethodDescriptor]

'args' @ [51:43] ==> value-parameter args: Array<String> defined in net.corda.verifier.Verifier.Companion.main[ValueParameterDescriptorImpl]

'loadConfiguration' @ [52:34] ==> public final fun loadConfiguration(baseDirectory: Path, configPath: Path): VerifierConfiguration defined in net.corda.verifier.Verifier.Companion[SimpleFunctionDescriptorImpl]

'baseDirectory' @ [52:52] ==> val baseDirectory: (Path..Path?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'baseDirectory' @ [52:67] ==> val baseDirectory: (Path..Path?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'createServerLocatorWithHA' @ [53:42] ==> public open fun createServerLocatorWithHA(vararg p0: (TransportConfiguration..TransportConfiguration?)): (ServerLocator..ServerLocator?) defined in org.apache.activemq.artemis.api.core.client.ActiveMQClient[JavaMethodDescriptor]

'tcpTransport' @ [54:21] ==> public final fun tcpTransport(direction: ConnectionDirection, hostAndPort: NetworkHostAndPort, config: SSLConfiguration?, enableSSL: Boolean = ...): TransportConfiguration defined in net.corda.nodeapi.ArtemisTcpTransport.Companion[FunctionImportedFromObject]

'Outbound' @ [54:54] ==> public constructor Outbound(expectedCommonName: X500Name? = ..., connectorFactoryClassName: String = ...) defined in net.corda.nodeapi.ConnectionDirection.Outbound[DeserializedClassConstructorDescriptor]

'verifierConfig' @ [54:66] ==> val verifierConfig: VerifierConfiguration defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'nodeHostAndPort' @ [54:81] ==> public final val nodeHostAndPort: NetworkHostAndPort defined in net.corda.verifier.VerifierConfiguration[PropertyDescriptorImpl]

'verifierConfig' @ [54:98] ==> val verifierConfig: VerifierConfiguration defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'locator' @ [56:34] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'createSessionFactory' @ [56:42] ==> public abstract fun createSessionFactory(): (ClientSessionFactory..ClientSessionFactory?) defined in org.apache.activemq.artemis.api.core.client.ServerLocator[JavaMethodDescriptor]

'sessionFactory' @ [57:27] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'createSession' @ [57:42] ==> public abstract fun createSession(p0: (String..String?), p1: (String..String?), p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean, p6: Int): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'VerifierApi' @ [58:21] ==> public object VerifierApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'VERIFIER_USERNAME' @ [58:33] ==> public final val VERIFIER_USERNAME: String defined in net.corda.nodeapi.VerifierApi[DeserializedPropertyDescriptor]

'VerifierApi' @ [58:52] ==> public object VerifierApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'VERIFIER_USERNAME' @ [58:64] ==> public final val VERIFIER_USERNAME: String defined in net.corda.nodeapi.VerifierApi[DeserializedPropertyDescriptor]

'locator' @ [58:102] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'isPreAcknowledge' @ [58:110] ==> public final var ServerLocator.isPreAcknowledge: Boolean[MyPropertyDescriptor]

'locator' @ [58:128] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'ackBatchSize' @ [58:136] ==> public final var ServerLocator.ackBatchSize: Int[MyPropertyDescriptor]

'addShutdownHook' @ [60:13] ==> public fun addShutdownHook(block: () -> Unit): ShutdownHook defined in net.corda.nodeapi.internal[DeserializedSimpleFunctionDescriptor]

'log' @ [61:17] ==> private final val log: Logger defined in net.corda.verifier.Verifier.Companion[PropertyDescriptorImpl]

'info' @ [61:21] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'session' @ [62:17] ==> val session: (ClientSession..ClientSession?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'close' @ [62:25] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'sessionFactory' @ [63:17] ==> val sessionFactory: (ClientSessionFactory..ClientSessionFactory?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'close' @ [63:32] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'initialiseSerialization' @ [65:13] ==> private final fun initialiseSerialization(): Unit defined in net.corda.verifier.Verifier.Companion[SimpleFunctionDescriptorImpl]

'session' @ [66:28] ==> val session: (ClientSession..ClientSession?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'createConsumer' @ [66:36] ==> public abstract fun createConsumer(p0: (String..String?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'VERIFICATION_REQUESTS_QUEUE_NAME' @ [66:51] ==> public final val VERIFICATION_REQUESTS_QUEUE_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyImportedFromObject]

'session' @ [67:33] ==> val session: (ClientSession..ClientSession?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'createProducer' @ [67:41] ==> public abstract fun createProducer(): (ClientProducer..ClientProducer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'consumer' @ [68:13] ==> val consumer: (ClientConsumer..ClientConsumer?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'setMessageHandler' @ [68:22] ==> public final fun setMessageHandler(p0: (((ClientMessage..ClientMessage?)) -> Unit..(((ClientMessage..ClientMessage?)) -> Unit)?)): (ClientConsumer..ClientConsumer?) defined in org.apache.activemq.artemis.api.core.client.ClientConsumer[MyFunctionDescriptor]

'VerifierApi' @ [69:31] ==> public object VerifierApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'fromClientMessage' @ [69:63] ==> public final fun fromClientMessage(message: ClientMessage): VerifierApi.VerificationRequest defined in net.corda.nodeapi.VerifierApi.VerificationRequest.Companion[DeserializedSimpleFunctionDescriptor]

'it' @ [69:81] ==> value-parameter it: (ClientMessage..ClientMessage?) defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [70:17] ==> private final val log: Logger defined in net.corda.verifier.Verifier.Companion[PropertyDescriptorImpl]

'debug' @ [70:21] ==> public inline fun Logger.debug(msg: () -> String): Unit defined in net.corda.core.utilities[DeserializedSimpleFunctionDescriptor]

'request' @ [70:70] ==> val request: VerifierApi.VerificationRequest defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

'verificationId' @ [70:78] ==> public final val verificationId: Long defined in net.corda.nodeapi.VerifierApi.VerificationRequest[DeserializedPropertyDescriptor]

'request' @ [72:21] ==> val request: VerifierApi.VerificationRequest defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

'transaction' @ [72:29] ==> public final val transaction: LedgerTransaction defined in net.corda.nodeapi.VerifierApi.VerificationRequest[DeserializedPropertyDescriptor]

'verify' @ [72:41] ==> public final fun verify(): Unit defined in net.corda.core.transactions.LedgerTransaction[DeserializedSimpleFunctionDescriptor]

'log' @ [75:21] ==> private final val log: Logger defined in net.corda.verifier.Verifier.Companion[PropertyDescriptorImpl]

'debug' @ [75:25] ==> public abstract fun debug(p0: (String..String?), p1: (Throwable..Throwable?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

't' @ [75:68] ==> val t: Throwable defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

't' @ [76:21] ==> val t: Throwable defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

'session' @ [78:29] ==> val session: (ClientSession..ClientSession?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'createMessage' @ [78:37] ==> public abstract fun createMessage(p0: Boolean): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'VerifierApi' @ [79:32] ==> public object VerifierApi defined in net.corda.nodeapi[FakeCallableDescriptorForObject]

'VerificationResponse' @ [79:44] ==> public constructor VerificationResponse(verificationId: Long, exception: Throwable?) defined in net.corda.nodeapi.VerifierApi.VerificationResponse[DeserializedClassConstructorDescriptor]

'request' @ [79:65] ==> val request: VerifierApi.VerificationRequest defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

'verificationId' @ [79:73] ==> public final val verificationId: Long defined in net.corda.nodeapi.VerifierApi.VerificationRequest[DeserializedPropertyDescriptor]

'error' @ [79:89] ==> val error: Throwable? defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

'response' @ [80:17] ==> val response: VerifierApi.VerificationResponse defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

'writeToClientMessage' @ [80:26] ==> public final fun writeToClientMessage(message: ClientMessage): Unit defined in net.corda.nodeapi.VerifierApi.VerificationResponse[DeserializedSimpleFunctionDescriptor]

'reply' @ [80:47] ==> val reply: (ClientMessage..ClientMessage?) defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

'replyProducer' @ [81:17] ==> val replyProducer: (ClientProducer..ClientProducer?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'send' @ [81:31] ==> public abstract fun send(p0: (SimpleString..SimpleString?), p1: (Message..Message?)): Unit defined in org.apache.activemq.artemis.api.core.client.ClientProducer[JavaMethodDescriptor]

'request' @ [81:36] ==> val request: VerifierApi.VerificationRequest defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

'responseAddress' @ [81:44] ==> public final val responseAddress: SimpleString defined in net.corda.nodeapi.VerifierApi.VerificationRequest[DeserializedPropertyDescriptor]

'reply' @ [81:61] ==> val reply: (ClientMessage..ClientMessage?) defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[LocalVariableDescriptor]

'it' @ [82:17] ==> value-parameter it: (ClientMessage..ClientMessage?) defined in net.corda.verifier.Verifier.Companion.main.<anonymous>[ValueParameterDescriptorImpl]

'acknowledge' @ [82:20] ==> public abstract fun acknowledge(): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'session' @ [84:13] ==> val session: (ClientSession..ClientSession?) defined in net.corda.verifier.Verifier.Companion.main[LocalVariableDescriptor]

'start' @ [84:21] ==> public abstract fun start(): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'log' @ [85:13] ==> private final val log: Logger defined in net.corda.verifier.Verifier.Companion[PropertyDescriptorImpl]

'info' @ [85:17] ==> public abstract fun info(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'sleep' @ [86:20] ==> public open fun sleep(p0: Long): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'Long' @ [86:26] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'MAX_VALUE' @ [86:31] ==> public const final val MAX_VALUE: Long defined in kotlin.Long.Companion[DeserializedPropertyDescriptor]

'SerializationDefaults' @ [90:13] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'SERIALIZATION_FACTORY' @ [90:35] ==> public final var SERIALIZATION_FACTORY: SerializationFactory defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'SerializationFactoryImpl' @ [90:59] ==> public constructor SerializationFactoryImpl() defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedClassConstructorDescriptor]

'apply' @ [90:86] ==> @InlineOnly public inline fun <T> SerializationFactoryImpl.apply(block: SerializationFactoryImpl.() -> Unit): SerializationFactoryImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SerializationFactoryImpl

'registerScheme' @ [91:17] ==> public final fun registerScheme(scheme: SerializationScheme): Unit defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedSimpleFunctionDescriptor]

'KryoVerifierSerializationScheme' @ [91:32] ==> public constructor KryoVerifierSerializationScheme() defined in net.corda.verifier.Verifier.KryoVerifierSerializationScheme[ClassConstructorDescriptorImpl]

'SerializationDefaults' @ [93:13] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'P2P_CONTEXT' @ [93:35] ==> public final var P2P_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'KRYO_P2P_CONTEXT' @ [93:49] ==> public val KRYO_P2P_CONTEXT: SerializationContextImpl defined in net.corda.nodeapi.internal.serialization[DeserializedPropertyDescriptor]

'AbstractKryoSerializationScheme' @ [97:45] ==> public constructor AbstractKryoSerializationScheme() defined in net.corda.nodeapi.internal.serialization.AbstractKryoSerializationScheme[DeserializedClassConstructorDescriptor]

'byteSequence' @ [99:20] ==> value-parameter byteSequence: ByteSequence defined in net.corda.verifier.Verifier.KryoVerifierSerializationScheme.canDeserializeVersion[ValueParameterDescriptorImpl]

'KryoHeaderV0_1' @ [99:36] ==> public val KryoHeaderV0_1: OpaqueBytes defined in net.corda.nodeapi.internal.serialization[DeserializedPropertyDescriptor]

'target' @ [99:54] ==> value-parameter target: SerializationContext.UseCase defined in net.corda.verifier.Verifier.KryoVerifierSerializationScheme.canDeserializeVersion[ValueParameterDescriptorImpl]

'P2P' @ [99:93] ==> enum entry P2P defined in net.corda.core.serialization.SerializationContext.UseCase[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [102:79] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [103:79] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

