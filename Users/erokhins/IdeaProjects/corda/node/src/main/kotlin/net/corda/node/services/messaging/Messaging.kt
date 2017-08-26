'ThreadSafe' @ [28:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'DEFAULT_SESSION_ID' @ [51:65] ==> public final val DEFAULT_SESSION_ID: Long defined in net.corda.node.services.messaging.MessagingService.Companion[PropertyDescriptorImpl]

'randomUUID' @ [97:86] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'MessagingService' @ [122:69] ==> public companion object defined in net.corda.node.services.messaging.MessagingService[FakeCallableDescriptorForObject]

'DEFAULT_SESSION_ID' @ [122:86] ==> public final val DEFAULT_SESSION_ID: Long defined in net.corda.node.services.messaging.MessagingService.Companion[PropertyDescriptorImpl]

'createMessage' @ [123:11] ==> public abstract fun createMessage(topicSession: TopicSession, data: ByteArray, uuid: UUID = ...): Message defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'TopicSession' @ [123:25] ==> public constructor TopicSession(topic: String, sessionID: Long = ...) defined in net.corda.node.services.messaging.TopicSession[ClassConstructorDescriptorImpl]

'topic' @ [123:38] ==> value-parameter topic: String defined in net.corda.node.services.messaging.createMessage[ValueParameterDescriptorImpl]

'sessionID' @ [123:45] ==> value-parameter sessionID: Long = ... defined in net.corda.node.services.messaging.createMessage[ValueParameterDescriptorImpl]

'data' @ [123:57] ==> value-parameter data: ByteArray defined in net.corda.node.services.messaging.createMessage[ValueParameterDescriptorImpl]

'runOnNextMessage' @ [137:11] ==> public inline fun MessagingService.runOnNextMessage(topicSession: TopicSession, crossinline callback: (ReceivedMessage) -> Unit): Unit defined in net.corda.node.services.messaging in file Messaging.kt[SimpleFunctionDescriptorImpl]

'TopicSession' @ [137:28] ==> public constructor TopicSession(topic: String, sessionID: Long = ...) defined in net.corda.node.services.messaging.TopicSession[ClassConstructorDescriptorImpl]

'topic' @ [137:41] ==> value-parameter topic: String defined in net.corda.node.services.messaging.runOnNextMessage[ValueParameterDescriptorImpl]

'sessionID' @ [137:48] ==> value-parameter sessionID: Long defined in net.corda.node.services.messaging.runOnNextMessage[ValueParameterDescriptorImpl]

'callback' @ [137:60] ==> value-parameter callback: (ReceivedMessage) -> Unit defined in net.corda.node.services.messaging.runOnNextMessage[ValueParameterDescriptorImpl]

'AtomicBoolean' @ [147:20] ==> public constructor AtomicBoolean() defined in java.util.concurrent.atomic.AtomicBoolean[JavaClassConstructorDescriptor]

'addMessageHandler' @ [148:5] ==> public abstract fun addMessageHandler(topicSession: TopicSession, callback: (ReceivedMessage, MessageHandlerRegistration) -> Unit): MessageHandlerRegistration defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'topicSession' @ [148:23] ==> value-parameter topicSession: TopicSession defined in net.corda.node.services.messaging.runOnNextMessage[ValueParameterDescriptorImpl]

'removeMessageHandler' @ [149:9] ==> public abstract fun removeMessageHandler(registration: MessageHandlerRegistration): Unit defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'reg' @ [149:30] ==> value-parameter reg: MessageHandlerRegistration defined in net.corda.node.services.messaging.runOnNextMessage.<anonymous>[ValueParameterDescriptorImpl]

'check' @ [150:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [150:15] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'consumed' @ [150:16] ==> val consumed: AtomicBoolean defined in net.corda.node.services.messaging.runOnNextMessage[LocalVariableDescriptor]

'getAndSet' @ [150:25] ==> public final fun getAndSet(p0: Boolean): Boolean defined in java.util.concurrent.atomic.AtomicBoolean[JavaMethodDescriptor]

'check' @ [151:9] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'msg' @ [151:15] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.runOnNextMessage.<anonymous>[ValueParameterDescriptorImpl]

'topicSession' @ [151:19] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'topicSession' @ [151:35] ==> value-parameter topicSession: TopicSession defined in net.corda.node.services.messaging.runOnNextMessage[ValueParameterDescriptorImpl]

'msg' @ [151:78] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.runOnNextMessage.<anonymous>[ValueParameterDescriptorImpl]

'topicSession' @ [151:82] ==> public abstract val topicSession: TopicSession defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'topicSession' @ [151:100] ==> value-parameter topicSession: TopicSession defined in net.corda.node.services.messaging.runOnNextMessage[ValueParameterDescriptorImpl]

'invoke' @ [152:9] ==> public abstract operator fun invoke(p1: ReceivedMessage): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'msg' @ [152:18] ==> value-parameter msg: ReceivedMessage defined in net.corda.node.services.messaging.runOnNextMessage.<anonymous>[ValueParameterDescriptorImpl]

'openFuture' @ [161:25] ==> public fun <V> openFuture(): OpenFuture<M> defined in net.corda.core.internal.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <V> -> M

'runOnNextMessage' @ [162:5] ==> public fun MessagingService.runOnNextMessage(topic: String, sessionID: Long, callback: (ReceivedMessage) -> Unit): Unit defined in net.corda.node.services.messaging in file Messaging.kt[SimpleFunctionDescriptorImpl]

'topic' @ [162:22] ==> value-parameter topic: String defined in net.corda.node.services.messaging.onNext[ValueParameterDescriptorImpl]

'sessionId' @ [162:29] ==> value-parameter sessionId: Long defined in net.corda.node.services.messaging.onNext[ValueParameterDescriptorImpl]

'messageFuture' @ [163:9] ==> val messageFuture: OpenFuture<M> defined in net.corda.node.services.messaging.onNext[LocalVariableDescriptor]

'capture' @ [163:23] ==> public open fun capture(block: () -> M): Boolean defined in net.corda.core.internal.concurrent.OpenFuture[DeserializedSimpleFunctionDescriptor]

'Suppress' @ [164:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'message' @ [165:13] ==> value-parameter message: ReceivedMessage defined in net.corda.node.services.messaging.onNext.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [165:21] ==> public abstract val data: ByteArray defined in net.corda.node.services.messaging.ReceivedMessage[PropertyDescriptorImpl]

'deserialize' @ [165:26] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): Any defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> Any

'messageFuture' @ [168:12] ==> val messageFuture: OpenFuture<M> defined in net.corda.node.services.messaging.onNext[LocalVariableDescriptor]

'randomUUID' @ [171:114] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'send' @ [172:11] ==> public fun MessagingService.send(topicSession: TopicSession, payload: Any, to: MessageRecipients, uuid: UUID = ..., retryId: Long? = ...): Unit defined in net.corda.node.services.messaging in file Messaging.kt[SimpleFunctionDescriptorImpl]

'TopicSession' @ [172:16] ==> public constructor TopicSession(topic: String, sessionID: Long = ...) defined in net.corda.node.services.messaging.TopicSession[ClassConstructorDescriptorImpl]

'topic' @ [172:29] ==> value-parameter topic: String defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'sessionID' @ [172:36] ==> value-parameter sessionID: Long defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'payload' @ [172:48] ==> value-parameter payload: Any defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'to' @ [172:57] ==> value-parameter to: MessageRecipients defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'uuid' @ [172:61] ==> value-parameter uuid: UUID = ... defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'randomUUID' @ [174:110] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'send' @ [175:11] ==> public abstract fun send(message: Message, target: MessageRecipients, retryId: Long? = ...): Unit defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'createMessage' @ [175:16] ==> public abstract fun createMessage(topicSession: TopicSession, data: ByteArray, uuid: UUID = ...): Message defined in net.corda.node.services.messaging.MessagingService[SimpleFunctionDescriptorImpl]

'topicSession' @ [175:30] ==> value-parameter topicSession: TopicSession defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'payload' @ [175:44] ==> value-parameter payload: Any defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'serialize' @ [175:52] ==> public fun <T : Any> Any.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<Any> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'bytes' @ [175:64] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'uuid' @ [175:71] ==> value-parameter uuid: UUID = ... defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'to' @ [175:78] ==> value-parameter to: MessageRecipients defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'retryId' @ [175:82] ==> value-parameter retryId: Long? = ... defined in net.corda.node.services.messaging.send[ValueParameterDescriptorImpl]

'CordaSerializable' @ [200:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'MessagingService' @ [201:66] ==> public companion object defined in net.corda.node.services.messaging.MessagingService[FakeCallableDescriptorForObject]

'DEFAULT_SESSION_ID' @ [201:83] ==> public final val DEFAULT_SESSION_ID: Long defined in net.corda.node.services.messaging.MessagingService.Companion[PropertyDescriptorImpl]

'topic' @ [202:21] ==> public final val topic: String defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'isBlank' @ [202:27] ==> public fun CharSequence.isBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sessionID' @ [202:40] ==> public final val sessionID: Long defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'DEFAULT_SESSION_ID' @ [202:70] ==> public final val DEFAULT_SESSION_ID: Long defined in net.corda.node.services.messaging.MessagingService.Companion[PropertyDescriptorImpl]

'topic' @ [203:41] ==> public final val topic: String defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'sessionID' @ [203:48] ==> public final val sessionID: Long defined in net.corda.node.services.messaging.TopicSession[PropertyDescriptorImpl]

'toPattern' @ [235:41] ==> @InlineOnly public inline fun String.toPattern(flags: Int = ...): Pattern defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'require' @ [237:30] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'regex' @ [237:38] ==> private final val regex: Pattern defined in net.corda.node.services.messaging.TopicStringValidator[PropertyDescriptorImpl]

'matcher' @ [237:44] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'tag' @ [237:52] ==> value-parameter tag: String defined in net.corda.node.services.messaging.TopicStringValidator.check[ValueParameterDescriptorImpl]

'matches' @ [237:57] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

