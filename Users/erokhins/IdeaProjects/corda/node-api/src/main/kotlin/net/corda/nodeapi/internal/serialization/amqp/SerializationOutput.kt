'IdentityHashMap' @ [19:55] ==> public constructor IdentityHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.IdentityHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any
    <V : (Any..Any?)> -> Int

'LinkedHashSet' @ [20:68] ==> public final fun <E> <init>(): LinkedHashSet<AMQPSerializer<*>> /* = LinkedHashSet<AMQPSerializer<*>> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> AMQPSerializer<*>

'LinkedHashSet' @ [21:59] ==> public final fun <E> <init>(): LinkedHashSet<TypeNotation> /* = LinkedHashSet<TypeNotation> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> TypeNotation

'Throws' @ [28:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotSerializableException' @ [28:13] ==> public constructor NotSerializableException() defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'create' @ [31:37] ==> public open fun create(): (Data..Data?) defined in org.apache.qpid.proton.codec.Data.Factory[JavaMethodDescriptor]

'data' @ [32:13] ==> val data: (Data..Data?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize[LocalVariableDescriptor]

'withDescribed' @ [32:18] ==> public fun Data.withDescribed(descriptor: Descriptor, block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]

'Envelope' @ [32:32] ==> public companion object : DescribedTypeConstructor<Envelope> defined in net.corda.nodeapi.internal.serialization.amqp.Envelope[FakeCallableDescriptorForObject]

'DESCRIPTOR_OBJECT' @ [32:41] ==> public final val DESCRIPTOR_OBJECT: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.Envelope.Companion[PropertyDescriptorImpl]

'withList' @ [33:17] ==> public fun Data.withList(block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp[SimpleFunctionDescriptorImpl]

'writeObject' @ [35:21] ==> internal final fun writeObject(obj: Any, data: Data): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'obj' @ [35:33] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize[ValueParameterDescriptorImpl]

'this' @ [35:38] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'writeSchema' @ [37:21] ==> public open fun writeSchema(schema: Schema, data: Data): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'Schema' @ [37:33] ==> public constructor Schema(types: List<TypeNotation>) defined in net.corda.nodeapi.internal.serialization.amqp.Schema[ClassConstructorDescriptorImpl]

'schemaHistory' @ [37:40] ==> private final val schemaHistory: MutableSet<TypeNotation> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'toList' @ [37:54] ==> public fun <T> Iterable<TypeNotation>.toList(): List<TypeNotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeNotation

'this' @ [37:65] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'ByteArray' @ [40:25] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'data' @ [40:35] ==> val data: (Data..Data?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize[LocalVariableDescriptor]

'encodedSize' @ [40:40] ==> public abstract fun encodedSize(): Long defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'toInt' @ [40:54] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'wrap' @ [41:34] ==> public open fun wrap(p0: (ByteArray..ByteArray?)): (ByteBuffer..ByteBuffer?) defined in java.nio.ByteBuffer[JavaMethodDescriptor]

'bytes' @ [41:39] ==> val bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize[LocalVariableDescriptor]

'buf' @ [42:13] ==> val buf: (ByteBuffer..ByteBuffer?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize[LocalVariableDescriptor]

'put' @ [42:17] ==> public final fun put(p0: (ByteArray..ByteArray?)): (ByteBuffer..ByteBuffer?) defined in java.nio.ByteBuffer[JavaMethodDescriptor]

'AmqpHeaderV1_0' @ [42:21] ==> public val AmqpHeaderV1_0: OpaqueBytes defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[PropertyDescriptorImpl]

'bytes' @ [42:36] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'data' @ [43:13] ==> val data: (Data..Data?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize[LocalVariableDescriptor]

'encode' @ [43:18] ==> public abstract fun encode(p0: (ByteBuffer..ByteBuffer?)): Long defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'buf' @ [43:25] ==> val buf: (ByteBuffer..ByteBuffer?) defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize[LocalVariableDescriptor]

'SerializedBytes' @ [44:20] ==> public constructor SerializedBytes<T : Any>(bytes: ByteArray) defined in net.corda.core.serialization.SerializedBytes[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> T

'bytes' @ [44:36] ==> val bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.serialize[LocalVariableDescriptor]

'objectHistory' @ [46:13] ==> private final val objectHistory: MutableMap<Any, Int> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'clear' @ [46:27] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'serializerHistory' @ [47:13] ==> private final val serializerHistory: MutableSet<AMQPSerializer<*>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'clear' @ [47:31] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'schemaHistory' @ [48:13] ==> private final val schemaHistory: MutableSet<TypeNotation> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'clear' @ [48:27] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'writeObject' @ [53:9] ==> internal final fun writeObject(obj: Any, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'obj' @ [53:21] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[ValueParameterDescriptorImpl]

'data' @ [53:26] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[ValueParameterDescriptorImpl]

'obj' @ [53:32] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[ValueParameterDescriptorImpl]

'javaClass' @ [53:36] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'data' @ [57:9] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeSchema[ValueParameterDescriptorImpl]

'putObject' @ [57:14] ==> public abstract fun putObject(p0: (Any..Any?)): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'schema' @ [57:24] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeSchema[ValueParameterDescriptorImpl]

'if (obj == null) {
            data.putNull()
        } else {
            writeObject(obj, data, if (type == SerializerFactory.AnyType) obj.javaClass else type)
        }' @ [61:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'obj' @ [61:13] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObjectOrNull[ValueParameterDescriptorImpl]

'data' @ [62:13] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObjectOrNull[ValueParameterDescriptorImpl]

'putNull' @ [62:18] ==> public abstract fun putNull(): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'writeObject' @ [64:13] ==> internal final fun writeObject(obj: Any, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'obj' @ [64:25] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObjectOrNull[ValueParameterDescriptorImpl]

'data' @ [64:30] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObjectOrNull[ValueParameterDescriptorImpl]

'if (type == SerializerFactory.AnyType) obj.javaClass else type' @ [64:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'type' @ [64:40] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObjectOrNull[ValueParameterDescriptorImpl]

'SerializerFactory' @ [64:48] ==> public companion object defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'AnyType' @ [64:66] ==> public object AnyType : WildcardType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'obj' @ [64:75] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObjectOrNull[ValueParameterDescriptorImpl]

'javaClass' @ [64:79] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'type' @ [64:94] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObjectOrNull[ValueParameterDescriptorImpl]

'serializerFactory' @ [69:26] ==> internal final val serializerFactory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'get' @ [69:44] ==> @Throws public final fun get(actualClass: Class<*>?, declaredType: Type): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'obj' @ [69:48] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[ValueParameterDescriptorImpl]

'javaClass' @ [69:52] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'type' @ [69:63] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[ValueParameterDescriptorImpl]

'serializer' @ [70:13] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[LocalVariableDescriptor]

'serializerHistory' @ [70:28] ==> private final val serializerHistory: MutableSet<AMQPSerializer<*>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'serializerHistory' @ [71:13] ==> private final val serializerHistory: MutableSet<AMQPSerializer<*>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'add' @ [71:31] ==> public abstract fun add(element: AMQPSerializer<*>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'serializer' @ [71:35] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[LocalVariableDescriptor]

'serializer' @ [72:13] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[LocalVariableDescriptor]

'writeClassInfo' @ [72:24] ==> public abstract fun writeClassInfo(output: SerializationOutput): Unit defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[SimpleFunctionDescriptorImpl]

'this' @ [72:39] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[LazyClassReceiverParameterDescriptor]

'serializer' @ [74:9] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[LocalVariableDescriptor]

'writeObject' @ [74:20] ==> public abstract fun writeObject(obj: Any, data: Data, type: Type, output: SerializationOutput): Unit defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[SimpleFunctionDescriptorImpl]

'obj' @ [74:32] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[ValueParameterDescriptorImpl]

'data' @ [74:37] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[ValueParameterDescriptorImpl]

'type' @ [74:43] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeObject[ValueParameterDescriptorImpl]

'this' @ [74:49] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[LazyClassReceiverParameterDescriptor]

'schemaHistory' @ [78:16] ==> private final val schemaHistory: MutableSet<TypeNotation> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'addAll' @ [78:30] ==> public fun <T> MutableCollection<in TypeNotation>.addAll(elements: Array<out TypeNotation>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeNotation

'typeNotation' @ [78:37] ==> value-parameter vararg typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.writeTypeNotations[ValueParameterDescriptorImpl]

'type' @ [82:13] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.requireSerializer[ValueParameterDescriptorImpl]

'SerializerFactory' @ [82:21] ==> public companion object defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'AnyType' @ [82:39] ==> public object AnyType : WildcardType defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'type' @ [82:50] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.requireSerializer[ValueParameterDescriptorImpl]

'Object' @ [82:58] ==> public constructor Object() defined in java.lang.Object[JavaClassConstructorDescriptor]

'java' @ [82:72] ==> public val <T> KClass<Object>.java: Class<Object> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Object

'serializerFactory' @ [83:30] ==> internal final val serializerFactory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'get' @ [83:48] ==> @Throws public final fun get(actualClass: Class<*>?, declaredType: Type): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'type' @ [83:58] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.requireSerializer[ValueParameterDescriptorImpl]

'serializer' @ [84:17] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.requireSerializer[LocalVariableDescriptor]

'serializerHistory' @ [84:32] ==> private final val serializerHistory: MutableSet<AMQPSerializer<*>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'serializerHistory' @ [85:17] ==> private final val serializerHistory: MutableSet<AMQPSerializer<*>> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[PropertyDescriptorImpl]

'add' @ [85:35] ==> public abstract fun add(element: AMQPSerializer<*>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'serializer' @ [85:39] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.requireSerializer[LocalVariableDescriptor]

'serializer' @ [86:17] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput.requireSerializer[LocalVariableDescriptor]

'writeClassInfo' @ [86:28] ==> public abstract fun writeClassInfo(output: SerializationOutput): Unit defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[SimpleFunctionDescriptorImpl]

'this' @ [86:43] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[LazyClassReceiverParameterDescriptor]

