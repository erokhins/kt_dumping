'ThreadSafe' @ [16:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'systemUTC' @ [17:58] ==> public open fun systemUTC(): (Clock..Clock?) defined in java.time.Clock[JavaMethodDescriptor]

'Clock' @ [17:73] ==> protected/*protected and package*/ constructor Clock() defined in java.time.Clock[JavaClassConstructorDescriptor]

'singletonSerializationToken' @ [19:25] ==> public final fun <T : SerializeAsToken> singletonSerializationToken(toBeTokenized: Class<NodeClock>): SingletonSerializationToken defined in net.corda.core.serialization.SingletonSerializationToken.Companion[FunctionImportedFromObject]
Inferred types:
    <T : SerializeAsToken> -> NodeClock

'javaClass' @ [19:53] ==> public val <T : Any> NodeClock.javaClass: Class<NodeClock> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> NodeClock

'token' @ [21:62] ==> private final val token: SingletonSerializationToken defined in net.corda.node.serialization.NodeClock[PropertyDescriptorImpl]

'registerWithContext' @ [21:68] ==> public final fun registerWithContext(context: SerializeAsTokenContext, toBeTokenized: SerializeAsToken): SingletonSerializationToken defined in net.corda.core.serialization.SingletonSerializationToken[DeserializedSimpleFunctionDescriptor]

'context' @ [21:88] ==> value-parameter context: SerializeAsTokenContext defined in net.corda.node.serialization.NodeClock.toToken[ValueParameterDescriptorImpl]

'this' @ [21:97] ==> <this> defined in net.corda.node.serialization.NodeClock[LazyClassReceiverParameterDescriptor]

'delegateClock' @ [24:16] ==> private final val delegateClock: Clock defined in net.corda.node.serialization.NodeClock[PropertyDescriptorImpl]

'instant' @ [24:30] ==> public abstract fun instant(): (Instant..Instant?) defined in java.time.Clock[JavaMethodDescriptor]

'UnsupportedOperationException' @ [29:15] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'delegateClock' @ [33:16] ==> private final val delegateClock: Clock defined in net.corda.node.serialization.NodeClock[PropertyDescriptorImpl]

'zone' @ [33:30] ==> public final val Clock.zone: (ZoneId..ZoneId?)[MyPropertyDescriptor]

