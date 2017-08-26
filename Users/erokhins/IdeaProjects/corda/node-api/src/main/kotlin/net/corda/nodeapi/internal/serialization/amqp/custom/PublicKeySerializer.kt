'CustomSerializer.Implements<PublicKey>' @ [12:30] ==> public constructor Implements<T>(clazz: Class<PublicKey>) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Implements[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> PublicKey

'java' @ [12:86] ==> public val <T> KClass<PublicKey>.java: Class<PublicKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PublicKey

'Schema' @ [13:43] ==> public constructor Schema(types: List<TypeNotation>) defined in net.corda.nodeapi.internal.serialization.amqp.Schema[ClassConstructorDescriptorImpl]

'listOf' @ [13:50] ==> public fun <T> listOf(element: RestrictedType): List<RestrictedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RestrictedType

'RestrictedType' @ [13:57] ==> public constructor RestrictedType(name: String, label: String?, provides: List<String>, source: String, descriptor: Descriptor, choices: List<Choice>) defined in net.corda.nodeapi.internal.serialization.amqp.RestrictedType[ClassConstructorDescriptorImpl]

'type' @ [13:72] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer[PropertyDescriptorImpl]

'toString' @ [13:77] ==> public open fun toString(): String defined in java.lang.reflect.Type[DeserializedSimpleFunctionDescriptor]

'listOf' @ [13:93] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'type' @ [13:100] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer[PropertyDescriptorImpl]

'toString' @ [13:105] ==> public open fun toString(): String defined in java.lang.reflect.Type[DeserializedSimpleFunctionDescriptor]

'!!' @ [13:118] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'primitiveTypeName' @ [13:136] ==> public final fun primitiveTypeName(type: Type): String? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'java' @ [13:171] ==> public val <T> KClass<ByteArray>.java: Class<ByteArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ByteArray

'descriptor' @ [13:180] ==> protected open val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer[PropertyDescriptorImpl]

'emptyList' @ [13:192] ==> public fun <T> emptyList(): List<Choice> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Choice

'output' @ [17:9] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer.writeDescribedObject[ValueParameterDescriptorImpl]

'writeObject' @ [17:16] ==> internal final fun writeObject(obj: Any, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'obj' @ [17:28] ==> value-parameter obj: PublicKey defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer.writeDescribedObject[ValueParameterDescriptorImpl]

'encoded' @ [17:32] ==> public final val PublicKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'data' @ [17:41] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer.writeDescribedObject[ValueParameterDescriptorImpl]

'clazz' @ [17:47] ==> protected final val clazz: Class<PublicKey> defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer[PropertyDescriptorImpl]

'input' @ [21:20] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer.readObject[ValueParameterDescriptorImpl]

'readObject' @ [21:26] ==> internal final fun readObject(obj: Any, schema: Schema, type: Type): Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'obj' @ [21:37] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer.readObject[ValueParameterDescriptorImpl]

'schema' @ [21:42] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer.readObject[ValueParameterDescriptorImpl]

'java' @ [21:67] ==> public val <T> KClass<ByteArray>.java: Class<ByteArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ByteArray

'Crypto' @ [22:16] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'decodePublicKey' @ [22:23] ==> @JvmStatic public final fun decodePublicKey(encodedKey: ByteArray): PublicKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'bits' @ [22:39] ==> val bits: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.custom.PublicKeySerializer.readObject[LocalVariableDescriptor]

