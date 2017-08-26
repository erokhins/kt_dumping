'Serializer<T>' @ [15:58] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'kryo' @ [17:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [17:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [17:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [17:42] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.write[ValueParameterDescriptorImpl]

'toToken' @ [17:46] ==> public abstract fun toToken(context: SerializeAsTokenContext): SerializationToken defined in net.corda.core.serialization.SerializeAsToken[DeserializedSimpleFunctionDescriptor]

'kryo' @ [17:54] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.write[ValueParameterDescriptorImpl]

'serializationContext' @ [17:59] ==> public fun Kryo.serializationContext(): SerializeAsTokenContext? defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'KryoException' @ [17:91] ==> public constructor KryoException(p0: (String..String?)) defined in com.esotericsoftware.kryo.KryoException[JavaClassConstructorDescriptor]

'simpleName' @ [17:151] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'obj' @ [17:177] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.write[ValueParameterDescriptorImpl]

'javaClass' @ [17:181] ==> public val <T : Any> T.javaClass: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'name' @ [17:191] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'?:' @ [21:21] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: SerializationToken?, right: SerializationToken): SerializationToken[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> SerializationToken

'kryo' @ [21:22] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [21:27] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [21:46] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[ValueParameterDescriptorImpl]

'KryoException' @ [21:86] ==> public constructor KryoException(p0: (String..String?)) defined in com.esotericsoftware.kryo.KryoException[JavaClassConstructorDescriptor]

'type' @ [21:138] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[ValueParameterDescriptorImpl]

'name' @ [21:143] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'token' @ [22:25] ==> val token: SerializationToken defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[LocalVariableDescriptor]

'fromToken' @ [22:31] ==> public abstract fun fromToken(context: SerializeAsTokenContext): Any defined in net.corda.core.serialization.SerializationToken[DeserializedSimpleFunctionDescriptor]

'kryo' @ [22:41] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[ValueParameterDescriptorImpl]

'serializationContext' @ [22:46] ==> public fun Kryo.serializationContext(): SerializeAsTokenContext? defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'KryoException' @ [22:78] ==> public constructor KryoException(p0: (String..String?)) defined in com.esotericsoftware.kryo.KryoException[JavaClassConstructorDescriptor]

'simpleName' @ [22:149] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'type' @ [22:175] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[ValueParameterDescriptorImpl]

'name' @ [22:180] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'type' @ [23:16] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[ValueParameterDescriptorImpl]

'castIfPossible' @ [23:21] ==> public fun <T> Class<T>.castIfPossible(obj: Any): T? defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'fromToken' @ [23:36] ==> val fromToken: Any defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[LocalVariableDescriptor]

'KryoException' @ [23:56] ==> public constructor KryoException(p0: (String..String?)) defined in com.esotericsoftware.kryo.KryoException[JavaClassConstructorDescriptor]

'token' @ [23:84] ==> val token: SerializationToken defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[LocalVariableDescriptor]

'type' @ [23:133] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.SerializeAsTokenSerializer.read[ValueParameterDescriptorImpl]

'name' @ [23:138] ==> public final val <T : (Any..Any?)> Class<T>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

