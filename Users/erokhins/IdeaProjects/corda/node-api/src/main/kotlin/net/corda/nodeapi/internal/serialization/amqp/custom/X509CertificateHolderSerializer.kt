'CustomSerializer.Implements<X509CertificateHolder>' @ [12:42] ==> public constructor Implements<T>(clazz: Class<X509CertificateHolder>) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Implements[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> X509CertificateHolder

'java' @ [12:122] ==> public val <T> KClass<X509CertificateHolder>.java: Class<X509CertificateHolder> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> X509CertificateHolder

'Schema' @ [13:43] ==> public constructor Schema(types: List<TypeNotation>) defined in net.corda.nodeapi.internal.serialization.amqp.Schema[ClassConstructorDescriptorImpl]

'listOf' @ [13:50] ==> public fun <T> listOf(element: RestrictedType): List<RestrictedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RestrictedType

'RestrictedType' @ [13:57] ==> public constructor RestrictedType(name: String, label: String?, provides: List<String>, source: String, descriptor: Descriptor, choices: List<Choice>) defined in net.corda.nodeapi.internal.serialization.amqp.RestrictedType[ClassConstructorDescriptorImpl]

'type' @ [13:72] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer[PropertyDescriptorImpl]

'toString' @ [13:77] ==> public open fun toString(): String defined in java.lang.reflect.Type[DeserializedSimpleFunctionDescriptor]

'listOf' @ [13:93] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'type' @ [13:100] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer[PropertyDescriptorImpl]

'toString' @ [13:105] ==> public open fun toString(): String defined in java.lang.reflect.Type[DeserializedSimpleFunctionDescriptor]

'!!' @ [13:118] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'primitiveTypeName' @ [13:136] ==> public final fun primitiveTypeName(type: Type): String? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'java' @ [13:171] ==> public val <T> KClass<ByteArray>.java: Class<ByteArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ByteArray

'descriptor' @ [13:180] ==> protected open val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer[PropertyDescriptorImpl]

'emptyList' @ [13:192] ==> public fun <T> emptyList(): List<Choice> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Choice

'output' @ [16:9] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer.writeDescribedObject[ValueParameterDescriptorImpl]

'writeObject' @ [16:16] ==> internal final fun writeObject(obj: Any, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'obj' @ [16:28] ==> value-parameter obj: X509CertificateHolder defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer.writeDescribedObject[ValueParameterDescriptorImpl]

'encoded' @ [16:32] ==> public final val X509CertificateHolder.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'data' @ [16:41] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer.writeDescribedObject[ValueParameterDescriptorImpl]

'clazz' @ [16:47] ==> protected final val clazz: Class<X509CertificateHolder> defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer[PropertyDescriptorImpl]

'input' @ [20:20] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer.readObject[ValueParameterDescriptorImpl]

'readObject' @ [20:26] ==> internal final fun readObject(obj: Any, schema: Schema, type: Type): Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'obj' @ [20:37] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer.readObject[ValueParameterDescriptorImpl]

'schema' @ [20:42] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer.readObject[ValueParameterDescriptorImpl]

'java' @ [20:67] ==> public val <T> KClass<ByteArray>.java: Class<ByteArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ByteArray

'X509CertificateHolder' @ [21:16] ==> public constructor X509CertificateHolder(p0: (ByteArray..ByteArray?)) defined in org.bouncycastle.cert.X509CertificateHolder[JavaClassConstructorDescriptor]

'bits' @ [21:38] ==> val bits: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.custom.X509CertificateHolderSerializer.readObject[LocalVariableDescriptor]

