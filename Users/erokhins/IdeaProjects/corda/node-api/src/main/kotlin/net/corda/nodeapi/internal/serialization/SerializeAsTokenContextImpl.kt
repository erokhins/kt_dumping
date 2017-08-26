'java' @ [9:62] ==> public val <T> KClass<SerializeAsTokenContext>.java: Class<SerializeAsTokenContext> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SerializeAsTokenContext

'this' @ [11:114] ==> <this> defined in net.corda.nodeapi.internal.serialization.withTokenContext[ReceiverParameterDescriptorImpl]

'withProperty' @ [11:119] ==> public abstract fun withProperty(property: Any, value: Any): SerializationContext defined in net.corda.core.serialization.SerializationContext[DeserializedSimpleFunctionDescriptor]

'serializationContextKey' @ [11:132] ==> public val serializationContextKey: Class<SerializeAsTokenContext> defined in net.corda.nodeapi.internal.serialization in file SerializeAsTokenContextImpl.kt[PropertyDescriptorImpl]

'serializationContext' @ [11:157] ==> value-parameter serializationContext: SerializeAsTokenContext defined in net.corda.nodeapi.internal.serialization.withTokenContext[ValueParameterDescriptorImpl]

'this' @ [23:138] ==> public constructor SerializeAsTokenContextImpl(serviceHub: ServiceHub, init: SerializeAsTokenContext.() -> Unit) defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl[ClassConstructorDescriptorImpl]

'serviceHub' @ [23:143] ==> value-parameter serviceHub: ServiceHub defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.<init>[ValueParameterDescriptorImpl]

'serializationFactory' @ [24:9] ==> value-parameter serializationFactory: SerializationFactory defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.<init>[ValueParameterDescriptorImpl]

'serialize' @ [24:30] ==> public abstract fun <T : Any> serialize(obj: Any, context: SerializationContext): SerializedBytes<Any> defined in net.corda.core.serialization.SerializationFactory[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Any

'toBeTokenized' @ [24:40] ==> value-parameter toBeTokenized: Any defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.<init>[ValueParameterDescriptorImpl]

'context' @ [24:55] ==> value-parameter context: SerializationContext defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.<init>[ValueParameterDescriptorImpl]

'withTokenContext' @ [24:63] ==> public fun SerializationContext.withTokenContext(serializationContext: SerializeAsTokenContext): SerializationContext defined in net.corda.nodeapi.internal.serialization in file SerializeAsTokenContextImpl.kt[SimpleFunctionDescriptorImpl]

'this' @ [24:80] ==> <this> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.<init>.<anonymous>[ReceiverParameterDescriptorImpl]

'mutableMapOf' @ [27:40] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, SerializeAsToken> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> SerializeAsToken

'invoke' @ [40:9] ==> public abstract operator fun invoke(p1: SerializeAsTokenContext): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [40:14] ==> <this> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl[LazyClassReceiverParameterDescriptor]

'readOnly' @ [41:9] ==> private final var readOnly: Boolean defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl[PropertyDescriptorImpl]

'toBeTokenized' @ [45:25] ==> value-parameter toBeTokenized: SerializeAsToken defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.putSingleton[ValueParameterDescriptorImpl]

'javaClass' @ [45:39] ==> public val <T : Any> SerializeAsToken.javaClass: Class<SerializeAsToken> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SerializeAsToken

'name' @ [45:49] ==> public final val <T : (Any..Any?)> Class<SerializeAsToken>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SerializeAsToken

'className' @ [46:13] ==> val className: (String..String?) defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.putSingleton[LocalVariableDescriptor]

'classNameToSingleton' @ [46:27] ==> private final val classNameToSingleton: MutableMap<String, SerializeAsToken> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl[PropertyDescriptorImpl]

'readOnly' @ [48:17] ==> private final var readOnly: Boolean defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl[PropertyDescriptorImpl]

'UnsupportedOperationException' @ [49:23] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'className' @ [49:99] ==> val className: (String..String?) defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.putSingleton[LocalVariableDescriptor]

'classNameToSingleton' @ [51:13] ==> private final val classNameToSingleton: MutableMap<String, SerializeAsToken> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl[PropertyDescriptorImpl]

'className' @ [51:34] ==> val className: (String..String?) defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.putSingleton[LocalVariableDescriptor]

'toBeTokenized' @ [51:47] ==> value-parameter toBeTokenized: SerializeAsToken defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.putSingleton[ValueParameterDescriptorImpl]

'classNameToSingleton' @ [55:52] ==> private final val classNameToSingleton: MutableMap<String, SerializeAsToken> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl[PropertyDescriptorImpl]

'className' @ [55:73] ==> value-parameter className: String defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.getSingleton[ValueParameterDescriptorImpl]

'IllegalStateException' @ [55:93] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'className' @ [55:154] ==> value-parameter className: String defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl.getSingleton[ValueParameterDescriptorImpl]

'this' @ [55:176] ==> <this> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenContextImpl[LazyClassReceiverParameterDescriptor]

