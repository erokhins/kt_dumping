'CordaSerializable' @ [21:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'context' @ [48:64] ==> value-parameter context: SerializeAsTokenContext defined in net.corda.core.serialization.SingletonSerializationToken.fromToken[ValueParameterDescriptorImpl]

'getSingleton' @ [48:72] ==> public abstract fun getSingleton(className: String): SerializeAsToken defined in net.corda.core.serialization.SerializeAsTokenContext[SimpleFunctionDescriptorImpl]

'className' @ [48:85] ==> private final val className: String defined in net.corda.core.serialization.SingletonSerializationToken[PropertyDescriptorImpl]

'also' @ [50:98] ==> @InlineOnly @SinceKotlin public inline fun <T> SingletonSerializationToken.also(block: (SingletonSerializationToken) -> Unit): SingletonSerializationToken defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SingletonSerializationToken

'context' @ [50:105] ==> value-parameter context: SerializeAsTokenContext defined in net.corda.core.serialization.SingletonSerializationToken.registerWithContext[ValueParameterDescriptorImpl]

'putSingleton' @ [50:113] ==> public abstract fun putSingleton(toBeTokenized: SerializeAsToken): Unit defined in net.corda.core.serialization.SerializeAsTokenContext[SimpleFunctionDescriptorImpl]

'toBeTokenized' @ [50:126] ==> value-parameter toBeTokenized: SerializeAsToken defined in net.corda.core.serialization.SingletonSerializationToken.registerWithContext[ValueParameterDescriptorImpl]

'SingletonSerializationToken' @ [53:91] ==> private constructor SingletonSerializationToken(className: String) defined in net.corda.core.serialization.SingletonSerializationToken[ClassConstructorDescriptorImpl]

'toBeTokenized' @ [53:119] ==> value-parameter toBeTokenized: Class<T> defined in net.corda.core.serialization.SingletonSerializationToken.Companion.singletonSerializationToken[ValueParameterDescriptorImpl]

'name' @ [53:133] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'singletonSerializationToken' @ [62:25] ==> public final fun <T : SerializeAsToken> singletonSerializationToken(toBeTokenized: Class<SingletonSerializeAsToken>): SingletonSerializationToken defined in net.corda.core.serialization.SingletonSerializationToken.Companion[FunctionImportedFromObject]
Inferred types:
    <T : SerializeAsToken> -> SingletonSerializeAsToken

'javaClass' @ [62:53] ==> public val <T : Any> SingletonSerializeAsToken.javaClass: Class<SingletonSerializeAsToken> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> SingletonSerializeAsToken

'token' @ [64:62] ==> private final val token: SingletonSerializationToken defined in net.corda.core.serialization.SingletonSerializeAsToken[PropertyDescriptorImpl]

'registerWithContext' @ [64:68] ==> public final fun registerWithContext(context: SerializeAsTokenContext, toBeTokenized: SerializeAsToken): SingletonSerializationToken defined in net.corda.core.serialization.SingletonSerializationToken[SimpleFunctionDescriptorImpl]

'context' @ [64:88] ==> value-parameter context: SerializeAsTokenContext defined in net.corda.core.serialization.SingletonSerializeAsToken.toToken[ValueParameterDescriptorImpl]

'this' @ [64:97] ==> <this> defined in net.corda.core.serialization.SingletonSerializeAsToken[LazyClassReceiverParameterDescriptor]

