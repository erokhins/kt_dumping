'connection' @ [21:45] ==> value-parameter connection: RPCClient.RPCConnection<CordaRPCOps> defined in net.corda.client.rpc.CordaRPCConnection.<init>[ValueParameterDescriptorImpl]

'RPCClientConfiguration' @ [28:16] ==> public companion object defined in net.corda.client.rpc.internal.RPCClientConfiguration[FakeCallableDescriptorForObject]

'default' @ [28:39] ==> @JvmStatic public final val default: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientConfiguration.Companion[PropertyDescriptorImpl]

'copy' @ [28:47] ==> public final fun copy(minimumServerProtocolVersion: Int = ..., trackRpcCallSites: Boolean = ..., reapInterval: Duration = ..., observationExecutorPoolSize: Int = ..., producerPoolBound: Int = ..., cacheConcurrencyLevel: Int = ..., connectionRetryInterval: Duration = ..., connectionRetryIntervalMultiplier: Double = ..., connectionMaxRetryInterval: Duration = ..., maxReconnectAttempts: Int = ..., maxFileSize: Int = ...): RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientConfiguration[SimpleFunctionDescriptorImpl]

'connectionMaxRetryInterval' @ [29:46] ==> public final val connectionMaxRetryInterval: Duration defined in net.corda.client.rpc.CordaRPCClientConfiguration[PropertyDescriptorImpl]

'JvmStatic' @ [33:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'CordaRPCClientConfiguration' @ [34:23] ==> public constructor CordaRPCClientConfiguration(connectionMaxRetryInterval: Duration) defined in net.corda.client.rpc.CordaRPCClientConfiguration[ClassConstructorDescriptorImpl]

'default' @ [35:69] ==> @JvmStatic public final val default: RPCClientConfiguration defined in net.corda.client.rpc.internal.RPCClientConfiguration.Companion[PropertyDescriptorImpl]

'connectionMaxRetryInterval' @ [35:77] ==> public final val connectionMaxRetryInterval: Duration defined in net.corda.client.rpc.internal.RPCClientConfiguration[PropertyDescriptorImpl]

'CordaRPCClientConfiguration' @ [44:54] ==> public companion object defined in net.corda.client.rpc.CordaRPCClientConfiguration[FakeCallableDescriptorForObject]

'default' @ [44:82] ==> @JvmStatic public final val default: CordaRPCClientConfiguration defined in net.corda.client.rpc.CordaRPCClientConfiguration.Companion[PropertyDescriptorImpl]

'initialiseSerialization' @ [51:13] ==> value-parameter initialiseSerialization: Boolean = ... defined in net.corda.client.rpc.CordaRPCClient.<init>[ValueParameterDescriptorImpl]

'initialiseSerialization' @ [52:13] ==> public final fun initialiseSerialization(): Unit defined in net.corda.client.rpc.CordaRPCClient.Companion[SimpleFunctionDescriptorImpl]

'RPCClient' @ [56:29] ==> public constructor RPCClient<I : RPCOps>(transport: TransportConfiguration, rpcConfiguration: RPCClientConfiguration = ..., serializationContext: SerializationContext = ...) defined in net.corda.client.rpc.internal.RPCClient[ClassConstructorDescriptorImpl]
Inferred types:
    <I : RPCOps> -> CordaRPCOps

'tcpTransport' @ [57:13] ==> public final fun tcpTransport(direction: ConnectionDirection, hostAndPort: NetworkHostAndPort, config: SSLConfiguration?, enableSSL: Boolean = ...): TransportConfiguration defined in net.corda.nodeapi.ArtemisTcpTransport.Companion[FunctionImportedFromObject]

'Outbound' @ [57:46] ==> public constructor Outbound(expectedCommonName: X500Name? = ..., connectorFactoryClassName: String = ...) defined in net.corda.nodeapi.ConnectionDirection.Outbound[DeserializedClassConstructorDescriptor]

'hostAndPort' @ [57:58] ==> value-parameter hostAndPort: NetworkHostAndPort defined in net.corda.client.rpc.CordaRPCClient.<init>[ValueParameterDescriptorImpl]

'sslConfiguration' @ [57:71] ==> value-parameter sslConfiguration: SSLConfiguration? = ... defined in net.corda.client.rpc.CordaRPCClient.<init>[ValueParameterDescriptorImpl]

'configuration' @ [58:13] ==> value-parameter configuration: CordaRPCClientConfiguration = ... defined in net.corda.client.rpc.CordaRPCClient.<init>[ValueParameterDescriptorImpl]

'toRpcClientConfiguration' @ [58:27] ==> internal final fun toRpcClientConfiguration(): RPCClientConfiguration defined in net.corda.client.rpc.CordaRPCClientConfiguration[SimpleFunctionDescriptorImpl]

'KRYO_RPC_CLIENT_CONTEXT' @ [59:13] ==> public val KRYO_RPC_CLIENT_CONTEXT: SerializationContextImpl defined in net.corda.nodeapi.internal.serialization[DeserializedPropertyDescriptor]

'CordaRPCConnection' @ [63:16] ==> internal constructor CordaRPCConnection(connection: RPCClient.RPCConnection<CordaRPCOps>) defined in net.corda.client.rpc.CordaRPCConnection[ClassConstructorDescriptorImpl]

'rpcClient' @ [63:35] ==> private final val rpcClient: RPCClient<CordaRPCOps> defined in net.corda.client.rpc.CordaRPCClient[PropertyDescriptorImpl]

'start' @ [63:45] ==> public final fun start(rpcOpsClass: Class<CordaRPCOps>, username: String, password: String): RPCClient.RPCConnection<CordaRPCOps> defined in net.corda.client.rpc.internal.RPCClient[SimpleFunctionDescriptorImpl]

'java' @ [63:70] ==> public val <T> KClass<CordaRPCOps>.java: Class<CordaRPCOps> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaRPCOps

'username' @ [63:76] ==> value-parameter username: String defined in net.corda.client.rpc.CordaRPCClient.start[ValueParameterDescriptorImpl]

'password' @ [63:86] ==> value-parameter password: String defined in net.corda.client.rpc.CordaRPCClient.start[ValueParameterDescriptorImpl]

'start' @ [67:16] ==> public final fun start(username: String, password: String): CordaRPCConnection defined in net.corda.client.rpc.CordaRPCClient[SimpleFunctionDescriptorImpl]

'username' @ [67:22] ==> value-parameter username: String defined in net.corda.client.rpc.CordaRPCClient.use[ValueParameterDescriptorImpl]

'password' @ [67:32] ==> value-parameter password: String defined in net.corda.client.rpc.CordaRPCClient.use[ValueParameterDescriptorImpl]

'use' @ [67:42] ==> @InlineOnly public inline fun <T : Closeable?, R> CordaRPCConnection.use(block: (CordaRPCConnection) -> A): A defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> CordaRPCConnection
    <R> -> A

'block' @ [67:46] ==> value-parameter block: (CordaRPCConnection) -> A defined in net.corda.client.rpc.CordaRPCClient.use[ValueParameterDescriptorImpl]

'SerializationDefaults' @ [73:17] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'SERIALIZATION_FACTORY' @ [73:39] ==> public final var SERIALIZATION_FACTORY: SerializationFactory defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'SerializationFactoryImpl' @ [73:63] ==> public constructor SerializationFactoryImpl() defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedClassConstructorDescriptor]

'apply' @ [73:90] ==> @InlineOnly public inline fun <T> SerializationFactoryImpl.apply(block: SerializationFactoryImpl.() -> Unit): SerializationFactoryImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SerializationFactoryImpl

'registerScheme' @ [74:21] ==> public final fun registerScheme(scheme: SerializationScheme): Unit defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedSimpleFunctionDescriptor]

'KryoClientSerializationScheme' @ [74:36] ==> public constructor KryoClientSerializationScheme() defined in net.corda.client.rpc.serialization.KryoClientSerializationScheme[ClassConstructorDescriptorImpl]

'registerScheme' @ [75:21] ==> public final fun registerScheme(scheme: SerializationScheme): Unit defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedSimpleFunctionDescriptor]

'AMQPClientSerializationScheme' @ [75:36] ==> public constructor AMQPClientSerializationScheme() defined in net.corda.nodeapi.internal.serialization.AMQPClientSerializationScheme[DeserializedClassConstructorDescriptor]

'SerializationDefaults' @ [77:17] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'P2P_CONTEXT' @ [77:39] ==> public final var P2P_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'KRYO_P2P_CONTEXT' @ [77:53] ==> public val KRYO_P2P_CONTEXT: SerializationContextImpl defined in net.corda.nodeapi.internal.serialization[DeserializedPropertyDescriptor]

'SerializationDefaults' @ [78:17] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'RPC_CLIENT_CONTEXT' @ [78:39] ==> public final var RPC_CLIENT_CONTEXT: SerializationContext defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'KRYO_RPC_CLIENT_CONTEXT' @ [78:60] ==> public val KRYO_RPC_CLIENT_CONTEXT: SerializationContextImpl defined in net.corda.nodeapi.internal.serialization[DeserializedPropertyDescriptor]

'check' @ [81:17] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'SerializationDefaults' @ [81:23] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'SERIALIZATION_FACTORY' @ [81:45] ==> public final var SERIALIZATION_FACTORY: SerializationFactory defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'check' @ [82:17] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'SerializationDefaults' @ [82:24] ==> public object SerializationDefaults defined in net.corda.core.serialization[FakeCallableDescriptorForObject]

'SERIALIZATION_FACTORY' @ [82:46] ==> public final var SERIALIZATION_FACTORY: SerializationFactory defined in net.corda.core.serialization.SerializationDefaults[DeserializedPropertyDescriptor]

'alreadyRegisteredSchemes' @ [82:97] ==> public final val alreadyRegisteredSchemes: Collection<SerializationScheme> defined in net.corda.nodeapi.internal.serialization.SerializationFactoryImpl[DeserializedPropertyDescriptor]

'any' @ [82:122] ==> public inline fun <T> Iterable<SerializationScheme>.any(predicate: (SerializationScheme) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SerializationScheme

'it' @ [82:128] ==> value-parameter it: SerializationScheme defined in net.corda.client.rpc.CordaRPCClient.Companion.initialiseSerialization.<anonymous>[ValueParameterDescriptorImpl]

