'ThreadSafe' @ [12:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'SingletonSerializeAsToken' @ [13:72] ==> public constructor SingletonSerializeAsToken() defined in net.corda.core.serialization.SingletonSerializeAsToken[DeserializedClassConstructorDescriptor]

'services' @ [15:43] ==> public final val services: ServiceHubInternal defined in net.corda.node.services.api.AbstractNodeService[PropertyDescriptorImpl]

'networkService' @ [15:52] ==> public abstract val networkService: MessagingService defined in net.corda.node.services.api.ServiceHubInternal[PropertyDescriptorImpl]

'network' @ [30:16] ==> public final val network: MessagingService defined in net.corda.node.services.api.AbstractNodeService[PropertyDescriptorImpl]

'addMessageHandler' @ [30:24] ==> public abstract fun addMessageHandler(topic: String = ..., sessionID: Long = ..., callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'topic' @ [30:42] ==> value-parameter topic: String defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler[ValueParameterDescriptorImpl]

'DEFAULT_SESSION_ID' @ [30:66] ==> public final val DEFAULT_SESSION_ID: Long defined in net.corda.node.services.messaging.MessagingService.Companion[PropertyDescriptorImpl]

'message' @ [32:31] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [32:39] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'deserialize' @ [32:44] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): Q defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Q

'invoke' @ [33:32] ==> public abstract operator fun invoke(p1: Q): R defined in kotlin.Function1[FunctionInvokeDescriptor]

'request' @ [33:40] ==> val request: Q defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'response' @ [35:21] ==> val response: R defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'javaClass' @ [35:30] ==> public val <T : Any> R.javaClass: Class<R> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> R

'javaClass' @ [35:48] ==> public val <T : Any> Unit.javaClass: Class<Unit> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Unit

'network' @ [36:31] ==> public final val network: MessagingService defined in net.corda.node.services.api.AbstractNodeService[PropertyDescriptorImpl]

'createMessage' @ [36:39] ==> public fun MessagingService.createMessage(topic: String, sessionID: Long = ..., data: ByteArray): Message defined in net.corda.node.services.messaging in file Messaging.kt[SimpleFunctionDescriptorImpl]

'topic' @ [36:53] ==> value-parameter topic: String defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler[ValueParameterDescriptorImpl]

'request' @ [36:60] ==> val request: Q defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'sessionID' @ [36:68] ==> public abstract val sessionID: Long defined in net.corda.node.services.messaging.ServiceRequestMessage[PropertyDescriptorImpl]

'response' @ [36:79] ==> val response: R defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'serialize' @ [36:88] ==> public fun <T : Any> R.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<R> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> R

'bytes' @ [36:100] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'network' @ [37:21] ==> public final val network: MessagingService defined in net.corda.node.services.api.AbstractNodeService[PropertyDescriptorImpl]

'send' @ [37:29] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'msg' @ [37:34] ==> val msg: Message defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'request' @ [37:39] ==> val request: Q defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'replyTo' @ [37:47] ==> public abstract val replyTo: SingleMessageRecipient defined in net.corda.node.services.messaging.ServiceRequestMessage[PropertyDescriptorImpl]

'invoke' @ [40:17] ==> public abstract operator fun invoke(p1: Message, p2: Exception /* = Exception */): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'message' @ [40:35] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[ValueParameterDescriptorImpl]

'e' @ [40:44] ==> val e: Exception /* = Exception */ defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[LocalVariableDescriptor]

'addMessageHandler' @ [56:16] ==> protected final inline fun <reified Q : ServiceRequestMessage, reified R : Any> addMessageHandler(topic: String, crossinline handler: (Q) -> R, crossinline exceptionConsumer: (Message, Exception /* = Exception */) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.api.AbstractNodeService[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified Q : ServiceRequestMessage> -> Q
    <reified R : Any> -> R

'topic' @ [56:34] ==> value-parameter topic: String defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler[ValueParameterDescriptorImpl]

'handler' @ [56:41] ==> value-parameter crossinline handler: (Q) -> R defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler[ValueParameterDescriptorImpl]

'exception' @ [56:94] ==> value-parameter exception: Exception /* = Exception */ defined in net.corda.node.services.api.AbstractNodeService.addMessageHandler.<anonymous>[ValueParameterDescriptorImpl]

