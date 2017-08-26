'configureTestSSL' @ [16:63] ==> @JvmOverloads public fun configureTestSSL(legalName: X500Name = ...): SSLConfiguration defined in net.corda.testing in file CoreTestUtils.kt[SimpleFunctionDescriptorImpl]

'DEFAULT_MQ_LEGAL_NAME' @ [16:80] ==> public final val DEFAULT_MQ_LEGAL_NAME: X500Name defined in net.corda.testing.messaging.SimpleMQClient.Companion[PropertyDescriptorImpl]

'ArtemisMessagingComponent' @ [16:106] ==> public constructor ArtemisMessagingComponent() defined in net.corda.nodeapi.ArtemisMessagingComponent[DeserializedClassConstructorDescriptor]

'X500Name' @ [18:37] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'ArtemisTcpTransport' @ [25:28] ==> public companion object defined in net.corda.nodeapi.ArtemisTcpTransport[FakeCallableDescriptorForObject]

'tcpTransport' @ [25:48] ==> public final fun tcpTransport(direction: ConnectionDirection, hostAndPort: NetworkHostAndPort, config: SSLConfiguration?, enableSSL: Boolean = ...): TransportConfiguration defined in net.corda.nodeapi.ArtemisTcpTransport.Companion[DeserializedSimpleFunctionDescriptor]

'Outbound' @ [25:81] ==> public constructor Outbound(expectedCommonName: X500Name? = ..., connectorFactoryClassName: String = ...) defined in net.corda.nodeapi.ConnectionDirection.Outbound[DeserializedClassConstructorDescriptor]

'target' @ [25:93] ==> public final val target: NetworkHostAndPort defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'config' @ [25:101] ==> public open val config: SSLConfiguration? defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'enableSSL' @ [25:121] ==> value-parameter enableSSL: Boolean = ... defined in net.corda.testing.messaging.SimpleMQClient.start[ValueParameterDescriptorImpl]

'createServerLocatorWithoutHA' @ [26:38] ==> public open fun createServerLocatorWithoutHA(vararg p0: (TransportConfiguration..TransportConfiguration?)): (ServerLocator..ServerLocator?) defined in org.apache.activemq.artemis.api.core.client.ActiveMQClient[JavaMethodDescriptor]

'tcpTransport' @ [26:67] ==> val tcpTransport: TransportConfiguration defined in net.corda.testing.messaging.SimpleMQClient.start[LocalVariableDescriptor]

'apply' @ [26:81] ==> @InlineOnly public inline fun <T> (ServerLocator..ServerLocator?).apply(block: (ServerLocator..ServerLocator?).() -> Unit): (ServerLocator..ServerLocator?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.apache.activemq.artemis.api.core.client.ServerLocator..org.apache.activemq.artemis.api.core.client.ServerLocator?)

'isBlockOnNonDurableSend' @ [27:13] ==> public final var ServerLocator.isBlockOnNonDurableSend: Boolean[MyPropertyDescriptor]

'threadPoolMaxSize' @ [28:13] ==> public final var ServerLocator.threadPoolMaxSize: Int[MyPropertyDescriptor]

'sessionFactory' @ [30:9] ==> public final lateinit var sessionFactory: ClientSessionFactory defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'locator' @ [30:26] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.testing.messaging.SimpleMQClient.start[LocalVariableDescriptor]

'createSessionFactory' @ [30:34] ==> public abstract fun createSessionFactory(): (ClientSessionFactory..ClientSessionFactory?) defined in org.apache.activemq.artemis.api.core.client.ServerLocator[JavaMethodDescriptor]

'session' @ [31:9] ==> public final lateinit var session: ClientSession defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'sessionFactory' @ [31:19] ==> public final lateinit var sessionFactory: ClientSessionFactory defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'createSession' @ [31:34] ==> public abstract fun createSession(p0: (String..String?), p1: (String..String?), p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean, p6: Int): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

'username' @ [31:48] ==> value-parameter username: String? = ... defined in net.corda.testing.messaging.SimpleMQClient.start[ValueParameterDescriptorImpl]

'password' @ [31:58] ==> value-parameter password: String? = ... defined in net.corda.testing.messaging.SimpleMQClient.start[ValueParameterDescriptorImpl]

'locator' @ [31:87] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.testing.messaging.SimpleMQClient.start[LocalVariableDescriptor]

'isPreAcknowledge' @ [31:95] ==> public final var ServerLocator.isPreAcknowledge: Boolean[MyPropertyDescriptor]

'locator' @ [31:113] ==> val locator: (ServerLocator..ServerLocator?) defined in net.corda.testing.messaging.SimpleMQClient.start[LocalVariableDescriptor]

'ackBatchSize' @ [31:121] ==> public final var ServerLocator.ackBatchSize: Int[MyPropertyDescriptor]

'session' @ [32:9] ==> public final lateinit var session: ClientSession defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'start' @ [32:17] ==> public abstract fun start(): (ClientSession..ClientSession?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'producer' @ [33:9] ==> public final lateinit var producer: ClientProducer defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'session' @ [33:20] ==> public final lateinit var session: ClientSession defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'createProducer' @ [33:28] ==> public abstract fun createProducer(): (ClientProducer..ClientProducer?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'session' @ [36:42] ==> public final lateinit var session: ClientSession defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'createMessage' @ [36:50] ==> public abstract fun createMessage(p0: Boolean): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientSession[JavaMethodDescriptor]

'sessionFactory' @ [40:13] ==> public final lateinit var sessionFactory: ClientSessionFactory defined in net.corda.testing.messaging.SimpleMQClient[PropertyDescriptorImpl]

'close' @ [40:28] ==> public abstract fun close(): Unit defined in org.apache.activemq.artemis.api.core.client.ClientSessionFactory[JavaMethodDescriptor]

