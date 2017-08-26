'CustomSerializer.Implements<X500Name>' @ [12:29] ==> public constructor Implements<T>(clazz: Class<X500Name>) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Implements[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> X500Name

'java' @ [12:83] ==> public val <T> KClass<X500Name>.java: Class<X500Name> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> X500Name

'Schema' @ [13:43] ==> public constructor Schema(types: List<TypeNotation>) defined in net.corda.nodeapi.internal.serialization.amqp.Schema[ClassConstructorDescriptorImpl]

'listOf' @ [13:50] ==> public fun <T> listOf(element: RestrictedType): List<RestrictedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RestrictedType

'RestrictedType' @ [13:57] ==> public constructor RestrictedType(name: String, label: String?, provides: List<String>, source: String, descriptor: Descriptor, choices: List<Choice>) defined in net.corda.nodeapi.internal.serialization.amqp.RestrictedType[ClassConstructorDescriptorImpl]

'type' @ [13:72] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer[PropertyDescriptorImpl]

'toString' @ [13:77] ==> public open fun toString(): String defined in java.lang.reflect.Type[DeserializedSimpleFunctionDescriptor]

'listOf' @ [13:93] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'type' @ [13:100] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer[PropertyDescriptorImpl]

'toString' @ [13:105] ==> public open fun toString(): String defined in java.lang.reflect.Type[DeserializedSimpleFunctionDescriptor]

'SerializerFactory' @ [13:118] ==> public companion object defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'primitiveTypeName' @ [13:136] ==> public final fun primitiveTypeName(type: Type): String? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'java' @ [13:171] ==> public val <T> KClass<ByteArray>.java: Class<ByteArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ByteArray

'descriptor' @ [13:180] ==> protected open val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer[PropertyDescriptorImpl]

'emptyList' @ [13:192] ==> public fun <T> emptyList(): List<Choice> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Choice

'output' @ [16:9] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer.writeDescribedObject[ValueParameterDescriptorImpl]

'writeObject' @ [16:16] ==> internal final fun writeObject(obj: Any, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'obj' @ [16:28] ==> value-parameter obj: X500Name defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer.writeDescribedObject[ValueParameterDescriptorImpl]

'encoded' @ [16:32] ==> public final val X500Name.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'data' @ [16:41] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer.writeDescribedObject[ValueParameterDescriptorImpl]

'clazz' @ [16:47] ==> protected final val clazz: Class<X500Name> defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer[PropertyDescriptorImpl]

'input' @ [20:22] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer.readObject[ValueParameterDescriptorImpl]

'readObject' @ [20:28] ==> internal final fun readObject(obj: Any, schema: Schema, type: Type): Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'obj' @ [20:39] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer.readObject[ValueParameterDescriptorImpl]

'schema' @ [20:44] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer.readObject[ValueParameterDescriptorImpl]

'java' @ [20:69] ==> public val <T> KClass<ByteArray>.java: Class<ByteArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ByteArray

'getInstance' @ [21:25] ==> public open fun getInstance(p0: (Any..Any?)): (X500Name..X500Name?) defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'ASN1InputStream' @ [21:37] ==> public constructor ASN1InputStream(p0: (ByteArray..ByteArray?)) defined in org.bouncycastle.asn1.ASN1InputStream[JavaClassConstructorDescriptor]

'binary' @ [21:53] ==> val binary: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.custom.X500NameSerializer.readObject[LocalVariableDescriptor]

'readObject' @ [21:61] ==> public open fun readObject(): (ASN1Primitive..ASN1Primitive?) defined in org.bouncycastle.asn1.ASN1InputStream[JavaMethodDescriptor]

