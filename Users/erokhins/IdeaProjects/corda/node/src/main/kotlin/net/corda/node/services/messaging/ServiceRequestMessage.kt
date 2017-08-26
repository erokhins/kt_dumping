'CordaSerializable' @ [11:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'onNext' @ [24:26] ==> public fun <M : Any> MessagingService.onNext(topic: String, sessionId: Long): CordaFuture<R> defined in net.corda.node.services.messaging[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : Any> -> R

'topic' @ [24:36] ==> value-parameter topic: String defined in net.corda.node.services.messaging.sendRequest[ValueParameterDescriptorImpl]

'request' @ [24:43] ==> value-parameter request: ServiceRequestMessage defined in net.corda.node.services.messaging.sendRequest[ValueParameterDescriptorImpl]

'sessionID' @ [24:51] ==> public abstract val sessionID: Long defined in net.corda.node.services.messaging.ServiceRequestMessage[PropertyDescriptorImpl]

'send' @ [25:5] ==> public fun MessagingService.send(topic: String, sessionID: Long, payload: Any, to: MessageRecipients, uuid: UUID = ...): Unit defined in net.corda.node.services.messaging in file Messaging.kt[SimpleFunctionDescriptorImpl]

'topic' @ [25:10] ==> value-parameter topic: String defined in net.corda.node.services.messaging.sendRequest[ValueParameterDescriptorImpl]

'DEFAULT_SESSION_ID' @ [25:34] ==> public final val DEFAULT_SESSION_ID: Long defined in net.corda.node.services.messaging.MessagingService.Companion[PropertyDescriptorImpl]

'request' @ [25:54] ==> value-parameter request: ServiceRequestMessage defined in net.corda.node.services.messaging.sendRequest[ValueParameterDescriptorImpl]

'target' @ [25:63] ==> value-parameter target: MessageRecipients defined in net.corda.node.services.messaging.sendRequest[ValueParameterDescriptorImpl]

'responseFuture' @ [26:12] ==> val responseFuture: CordaFuture<R> defined in net.corda.node.services.messaging.sendRequest[LocalVariableDescriptor]

