'VerificationRequest' @ [24:24] ==> public constructor VerificationRequest(verificationId: Long, transaction: LedgerTransaction, responseAddress: SimpleString) defined in net.corda.nodeapi.VerifierApi.VerificationRequest[ClassConstructorDescriptorImpl]

'message' @ [25:25] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationRequest.Companion.fromClientMessage[ValueParameterDescriptorImpl]

'getLongProperty' @ [25:33] ==> public abstract fun getLongProperty(p0: (String..String?)): (Long..Long?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'VERIFICATION_ID_FIELD_NAME' @ [25:49] ==> private final val VERIFICATION_ID_FIELD_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyDescriptorImpl]

'ByteArray' @ [26:25] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'message' @ [26:35] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationRequest.Companion.fromClientMessage[ValueParameterDescriptorImpl]

'bodySize' @ [26:43] ==> public final val ClientMessage.bodySize: Int[MyPropertyDescriptor]

'apply' @ [26:53] ==> @InlineOnly public inline fun <T> ByteArray.apply(block: ByteArray.() -> Unit): ByteArray defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'message' @ [26:61] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationRequest.Companion.fromClientMessage[ValueParameterDescriptorImpl]

'bodyBuffer' @ [26:69] ==> public final val ClientMessage.bodyBuffer: (ActiveMQBuffer..ActiveMQBuffer?)[MyPropertyDescriptor]

'readBytes' @ [26:80] ==> public abstract fun readBytes(p0: (ByteArray..ByteArray?)): Unit defined in org.apache.activemq.artemis.api.core.ActiveMQBuffer[JavaMethodDescriptor]

'this' @ [26:90] ==> <this> defined in net.corda.nodeapi.VerifierApi.VerificationRequest.Companion.fromClientMessage.<anonymous>[ReceiverParameterDescriptorImpl]

'deserialize' @ [26:98] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): LedgerTransaction defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LedgerTransaction

'getJMSReplyTo' @ [27:37] ==> public open fun getJMSReplyTo(p0: (Message..Message?)): (SimpleString..SimpleString?) defined in org.apache.activemq.artemis.reader.MessageUtil[JavaMethodDescriptor]

'message' @ [27:51] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationRequest.Companion.fromClientMessage[ValueParameterDescriptorImpl]

'message' @ [33:13] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationRequest.writeToClientMessage[ValueParameterDescriptorImpl]

'putLongProperty' @ [33:21] ==> public abstract fun putLongProperty(p0: (String..String?), p1: Long): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'VERIFICATION_ID_FIELD_NAME' @ [33:37] ==> private final val VERIFICATION_ID_FIELD_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyDescriptorImpl]

'verificationId' @ [33:65] ==> public final val verificationId: Long defined in net.corda.nodeapi.VerifierApi.VerificationRequest[PropertyDescriptorImpl]

'message' @ [34:13] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationRequest.writeToClientMessage[ValueParameterDescriptorImpl]

'writeBodyBufferBytes' @ [34:21] ==> public abstract fun writeBodyBufferBytes(p0: (ByteArray..ByteArray?)): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'transaction' @ [34:42] ==> public final val transaction: LedgerTransaction defined in net.corda.nodeapi.VerifierApi.VerificationRequest[PropertyDescriptorImpl]

'serialize' @ [34:54] ==> public fun <T : Any> LedgerTransaction.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<LedgerTransaction> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> LedgerTransaction

'bytes' @ [34:66] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'setJMSReplyTo' @ [35:25] ==> public open fun setJMSReplyTo(p0: (Message..Message?), p1: (SimpleString..SimpleString?)): Unit defined in org.apache.activemq.artemis.reader.MessageUtil[JavaMethodDescriptor]

'message' @ [35:39] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationRequest.writeToClientMessage[ValueParameterDescriptorImpl]

'responseAddress' @ [35:48] ==> public final val responseAddress: SimpleString defined in net.corda.nodeapi.VerifierApi.VerificationRequest[PropertyDescriptorImpl]

'VerificationResponse' @ [45:24] ==> public constructor VerificationResponse(verificationId: Long, exception: Throwable?) defined in net.corda.nodeapi.VerifierApi.VerificationResponse[ClassConstructorDescriptorImpl]

'message' @ [46:25] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationResponse.Companion.fromClientMessage[ValueParameterDescriptorImpl]

'getLongProperty' @ [46:33] ==> public abstract fun getLongProperty(p0: (String..String?)): (Long..Long?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'VERIFICATION_ID_FIELD_NAME' @ [46:49] ==> private final val VERIFICATION_ID_FIELD_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyDescriptorImpl]

'message' @ [47:25] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationResponse.Companion.fromClientMessage[ValueParameterDescriptorImpl]

'getBytesProperty' @ [47:33] ==> public abstract fun getBytesProperty(p0: (String..String?)): (ByteArray..ByteArray?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'RESULT_EXCEPTION_FIELD_NAME' @ [47:50] ==> private final val RESULT_EXCEPTION_FIELD_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyDescriptorImpl]

'deserialize' @ [47:80] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): Throwable defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Throwable

'message' @ [53:13] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationResponse.writeToClientMessage[ValueParameterDescriptorImpl]

'putLongProperty' @ [53:21] ==> public abstract fun putLongProperty(p0: (String..String?), p1: Long): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'VERIFICATION_ID_FIELD_NAME' @ [53:37] ==> private final val VERIFICATION_ID_FIELD_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyDescriptorImpl]

'verificationId' @ [53:65] ==> public final val verificationId: Long defined in net.corda.nodeapi.VerifierApi.VerificationResponse[PropertyDescriptorImpl]

'exception' @ [54:17] ==> public final val exception: Throwable? defined in net.corda.nodeapi.VerifierApi.VerificationResponse[PropertyDescriptorImpl]

'message' @ [55:17] ==> value-parameter message: ClientMessage defined in net.corda.nodeapi.VerifierApi.VerificationResponse.writeToClientMessage[ValueParameterDescriptorImpl]

'putBytesProperty' @ [55:25] ==> public abstract fun putBytesProperty(p0: (String..String?), p1: (ByteArray..ByteArray?)): (ClientMessage..ClientMessage?) defined in org.apache.activemq.artemis.api.core.client.ClientMessage[JavaMethodDescriptor]

'RESULT_EXCEPTION_FIELD_NAME' @ [55:42] ==> private final val RESULT_EXCEPTION_FIELD_NAME: String defined in net.corda.nodeapi.VerifierApi[PropertyDescriptorImpl]

'exception' @ [55:71] ==> public final val exception: Throwable? defined in net.corda.nodeapi.VerifierApi.VerificationResponse[PropertyDescriptorImpl]

'serialize' @ [55:81] ==> public fun <T : Any> Throwable.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<Throwable> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Throwable

'bytes' @ [55:93] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

