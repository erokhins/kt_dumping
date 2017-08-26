'ArrayList' @ [26:51] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Any

'bytes' @ [33:26] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[ValueParameterDescriptorImpl]

'toInt' @ [33:35] ==> public open fun toInt(): Int defined in kotlin.Byte[DeserializedSimpleFunctionDescriptor]

'check' @ [34:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'eighth' @ [34:19] ==> val eighth: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[LocalVariableDescriptor]

'valueOf' @ [36:38] ==> public open fun valueOf(p0: Byte): (UnsignedByte..UnsignedByte?) defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'bytes' @ [36:46] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[ValueParameterDescriptorImpl]

'toInt' @ [36:56] ==> public open fun toInt(): Int defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'check' @ [37:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'ninth' @ [37:19] ==> val ninth: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[LocalVariableDescriptor]

'valueOf' @ [39:43] ==> public open fun valueOf(p0: Byte): (UnsignedByte..UnsignedByte?) defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'bytes' @ [39:51] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[ValueParameterDescriptorImpl]

'toInt' @ [39:62] ==> public open fun toInt(): Int defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'check' @ [40:13] ==> @InlineOnly public inline fun check(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'eighteenth' @ [40:19] ==> val eighteenth: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[LocalVariableDescriptor]

'eighteenth' @ [40:41] ==> val eighteenth: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[LocalVariableDescriptor]

'if (eighteenth == 0xc0) {
                // Next byte is size
                UnsignedByte.valueOf(bytes[19]).toInt() - 3 // Minus three as PEEK_SIZE assumes 4 byte unsigned integer.
            } else {
                // Next 4 bytes is size
                UnsignedByte.valueOf(bytes[19]).toInt().shl(24) + UnsignedByte.valueOf(bytes[20]).toInt().shl(16) + UnsignedByte.valueOf(bytes[21]).toInt().shl(8) + UnsignedByte.valueOf(bytes[22]).toInt()
            }' @ [41:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'eighteenth' @ [41:28] ==> val eighteenth: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[LocalVariableDescriptor]

'-' @ [43:17] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [43:30] ==> public open fun valueOf(p0: Byte): (UnsignedByte..UnsignedByte?) defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'bytes' @ [43:38] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[ValueParameterDescriptorImpl]

'toInt' @ [43:49] ==> public open fun toInt(): Int defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'+' @ [46:17] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [46:30] ==> public open fun valueOf(p0: Byte): (UnsignedByte..UnsignedByte?) defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'bytes' @ [46:38] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[ValueParameterDescriptorImpl]

'toInt' @ [46:49] ==> public open fun toInt(): Int defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'shl' @ [46:57] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [46:80] ==> public open fun valueOf(p0: Byte): (UnsignedByte..UnsignedByte?) defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'bytes' @ [46:88] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[ValueParameterDescriptorImpl]

'toInt' @ [46:99] ==> public open fun toInt(): Int defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'shl' @ [46:107] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [46:130] ==> public open fun valueOf(p0: Byte): (UnsignedByte..UnsignedByte?) defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'bytes' @ [46:138] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[ValueParameterDescriptorImpl]

'toInt' @ [46:149] ==> public open fun toInt(): Int defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'shl' @ [46:157] ==> public final infix fun shl(bitCount: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'valueOf' @ [46:179] ==> public open fun valueOf(p0: Byte): (UnsignedByte..UnsignedByte?) defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'bytes' @ [46:187] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[ValueParameterDescriptorImpl]

'toInt' @ [46:198] ==> public open fun toInt(): Int defined in org.apache.qpid.proton.amqp.UnsignedByte[JavaMethodDescriptor]

'size' @ [48:20] ==> val size: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion.peekSize[LocalVariableDescriptor]

'BYTES_NEEDED_TO_PEEK' @ [48:27] ==> public final val BYTES_NEEDED_TO_PEEK: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.Companion[PropertyDescriptorImpl]

'Throws' @ [52:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotSerializableException' @ [52:13] ==> public constructor NotSerializableException() defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'deserialize' @ [54:13] ==> @Throws public final fun <T : Any> deserialize(bytes: ByteSequence, clazz: Class<T>): T defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'bytes' @ [54:25] ==> value-parameter bytes: SerializedBytes<T> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserialize[ValueParameterDescriptorImpl]

'java' @ [54:41] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Throws' @ [57:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotSerializableException' @ [57:13] ==> public constructor NotSerializableException() defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'deserializeAndReturnEnvelope' @ [59:13] ==> @Throws internal final fun <T : Any> deserializeAndReturnEnvelope(bytes: SerializedBytes<T>, clazz: Class<T>): ObjectAndEnvelope<T> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'bytes' @ [59:42] ==> value-parameter bytes: SerializedBytes<T> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserializeAndReturnEnvelope[ValueParameterDescriptorImpl]

'java' @ [59:58] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Throws' @ [62:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotSerializableException' @ [62:13] ==> public constructor NotSerializableException() defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'AmqpHeaderV1_0' @ [65:26] ==> public val AmqpHeaderV1_0: OpaqueBytes defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[PropertyDescriptorImpl]

'size' @ [65:41] ==> public open val size: Int defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'bytes' @ [66:13] ==> value-parameter bytes: ByteSequence defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[ValueParameterDescriptorImpl]

'take' @ [66:19] ==> public final fun take(n: Int): ByteSequence defined in net.corda.core.utilities.ByteSequence[DeserializedSimpleFunctionDescriptor]

'headerSize' @ [66:24] ==> val headerSize: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[LocalVariableDescriptor]

'AmqpHeaderV1_0' @ [66:39] ==> public val AmqpHeaderV1_0: OpaqueBytes defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[PropertyDescriptorImpl]

'NotSerializableException' @ [67:19] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'create' @ [70:33] ==> public open fun create(): (Data..Data?) defined in org.apache.qpid.proton.codec.Data.Factory[JavaMethodDescriptor]

'data' @ [71:20] ==> val data: (Data..Data?) defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[LocalVariableDescriptor]

'decode' @ [71:25] ==> public abstract fun decode(p0: (ByteBuffer..ByteBuffer?)): Long defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'wrap' @ [71:43] ==> public open fun wrap(p0: (ByteArray..ByteArray?), p1: Int, p2: Int): (ByteBuffer..ByteBuffer?) defined in java.nio.ByteBuffer[JavaMethodDescriptor]

'bytes' @ [71:48] ==> value-parameter bytes: ByteSequence defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[ValueParameterDescriptorImpl]

'bytes' @ [71:54] ==> public abstract val bytes: ByteArray defined in net.corda.core.utilities.ByteSequence[DeserializedPropertyDescriptor]

'bytes' @ [71:61] ==> value-parameter bytes: ByteSequence defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[ValueParameterDescriptorImpl]

'offset' @ [71:67] ==> public abstract val offset: Int defined in net.corda.core.utilities.ByteSequence[DeserializedPropertyDescriptor]

'headerSize' @ [71:76] ==> val headerSize: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[LocalVariableDescriptor]

'bytes' @ [71:88] ==> value-parameter bytes: ByteSequence defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[ValueParameterDescriptorImpl]

'size' @ [71:94] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[DeserializedPropertyDescriptor]

'headerSize' @ [71:101] ==> val headerSize: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[LocalVariableDescriptor]

'size' @ [72:13] ==> val size: Long defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[LocalVariableDescriptor]

'toInt' @ [72:18] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'bytes' @ [72:29] ==> value-parameter bytes: ByteSequence defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[ValueParameterDescriptorImpl]

'size' @ [72:35] ==> public abstract val size: Int defined in net.corda.core.utilities.ByteSequence[DeserializedPropertyDescriptor]

'headerSize' @ [72:42] ==> val headerSize: Int defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[LocalVariableDescriptor]

'NotSerializableException' @ [73:19] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'Envelope' @ [76:16] ==> public companion object : DescribedTypeConstructor<Envelope> defined in net.corda.nodeapi.internal.serialization.amqp.Envelope[FakeCallableDescriptorForObject]

'get' @ [76:25] ==> public final fun get(data: Data): Envelope defined in net.corda.nodeapi.internal.serialization.amqp.Envelope.Companion[SimpleFunctionDescriptorImpl]

'data' @ [76:29] ==> val data: (Data..Data?) defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.getEnvelope[LocalVariableDescriptor]

'Throws' @ [79:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotSerializableException' @ [79:13] ==> public constructor NotSerializableException() defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'invoke' @ [82:20] ==> public abstract operator fun invoke(): R defined in kotlin.Function0[FunctionInvokeDescriptor]

'nse' @ [84:19] ==> val nse: NotSerializableException defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.des[LocalVariableDescriptor]

'NotSerializableException' @ [86:19] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

't' @ [86:69] ==> val t: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.des[LocalVariableDescriptor]

'message' @ [86:71] ==> public open val message: String? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

't' @ [86:82] ==> val t: Throwable defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.des[LocalVariableDescriptor]

'getStackTraceAsString' @ [86:84] ==> public fun Throwable.getStackTraceAsString(): String defined in net.corda.core.internal[DeserializedSimpleFunctionDescriptor]

'objectHistory' @ [88:13] ==> private final val objectHistory: MutableList<Any> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[PropertyDescriptorImpl]

'clear' @ [88:27] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'Throws' @ [97:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotSerializableException' @ [97:13] ==> public constructor NotSerializableException() defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'des' @ [99:16] ==> @Throws private final fun <R> des(generator: () -> (T..T?)): (T..T?) defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> (T..T?)

'getEnvelope' @ [100:28] ==> @Throws private final fun getEnvelope(bytes: ByteSequence): Envelope defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'bytes' @ [100:40] ==> value-parameter bytes: ByteSequence defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserialize[ValueParameterDescriptorImpl]

'clazz' @ [101:13] ==> value-parameter clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserialize[ValueParameterDescriptorImpl]

'cast' @ [101:19] ==> public open fun cast(p0: (Any..Any?)): (T..T?) defined in java.lang.Class[JavaMethodDescriptor]

'readObjectOrNull' @ [101:24] ==> internal final fun readObjectOrNull(obj: Any?, schema: Schema, type: Type): Any? defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'envelope' @ [101:41] ==> val envelope: Envelope defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserialize.<anonymous>[LocalVariableDescriptor]

'obj' @ [101:50] ==> public final val obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.Envelope[PropertyDescriptorImpl]

'envelope' @ [101:55] ==> val envelope: Envelope defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserialize.<anonymous>[LocalVariableDescriptor]

'schema' @ [101:64] ==> public final val schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.Envelope[PropertyDescriptorImpl]

'clazz' @ [101:72] ==> value-parameter clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserialize[ValueParameterDescriptorImpl]

'Throws' @ [105:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'NotSerializableException' @ [105:13] ==> public constructor NotSerializableException() defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'des' @ [107:16] ==> @Throws private final fun <R> des(generator: () -> ObjectAndEnvelope<(T..T?)>): ObjectAndEnvelope<(T..T?)> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> ObjectAndEnvelope<(T..T?)>

'getEnvelope' @ [108:28] ==> @Throws private final fun getEnvelope(bytes: ByteSequence): Envelope defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'bytes' @ [108:40] ==> value-parameter bytes: SerializedBytes<T> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserializeAndReturnEnvelope[ValueParameterDescriptorImpl]

'ObjectAndEnvelope' @ [110:13] ==> public constructor ObjectAndEnvelope<out T>(obj: (T..T?), envelope: Envelope) defined in net.corda.nodeapi.internal.serialization.amqp.ObjectAndEnvelope[ClassConstructorDescriptorImpl]
Inferred types:
    <out T> -> (T..T?)

'clazz' @ [110:31] ==> value-parameter clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserializeAndReturnEnvelope[ValueParameterDescriptorImpl]

'cast' @ [110:37] ==> public open fun cast(p0: (Any..Any?)): (T..T?) defined in java.lang.Class[JavaMethodDescriptor]

'readObjectOrNull' @ [110:42] ==> internal final fun readObjectOrNull(obj: Any?, schema: Schema, type: Type): Any? defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'envelope' @ [110:59] ==> val envelope: Envelope defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserializeAndReturnEnvelope.<anonymous>[LocalVariableDescriptor]

'obj' @ [110:68] ==> public final val obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.Envelope[PropertyDescriptorImpl]

'envelope' @ [110:73] ==> val envelope: Envelope defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserializeAndReturnEnvelope.<anonymous>[LocalVariableDescriptor]

'schema' @ [110:82] ==> public final val schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.Envelope[PropertyDescriptorImpl]

'clazz' @ [110:90] ==> value-parameter clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserializeAndReturnEnvelope[ValueParameterDescriptorImpl]

'envelope' @ [110:99] ==> val envelope: Envelope defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.deserializeAndReturnEnvelope.<anonymous>[LocalVariableDescriptor]

'if (obj == null) null else readObject(obj, schema, type)' @ [115:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'obj' @ [115:20] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObjectOrNull[ValueParameterDescriptorImpl]

'readObject' @ [115:43] ==> internal final fun readObject(obj: Any, schema: Schema, type: Type): Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'obj' @ [115:54] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObjectOrNull[ValueParameterDescriptorImpl]

'schema' @ [115:59] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObjectOrNull[ValueParameterDescriptorImpl]

'type' @ [115:67] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObjectOrNull[ValueParameterDescriptorImpl]

'if (obj is DescribedType) {
            // Look up serializer in factory by descriptor
            val serializer = serializerFactory.get(obj.descriptor, schema)
            if (serializer.type != type && with(serializer.type) { !isSubClassOf(type) && !materiallyEquivalentTo(type) })
                throw NotSerializableException("Described type with descriptor ${obj.descriptor} was " +
                        "expected to be of type $type but was ${serializer.type}")
            return serializer.readObject(obj.described, schema, this)
        } else if (obj is Binary) {
            return obj.array
        } else {
            return obj
        }' @ [119:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'obj' @ [119:13] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'serializerFactory' @ [121:30] ==> internal final val serializerFactory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[PropertyDescriptorImpl]

'get' @ [121:48] ==> @Throws public final fun get(typeDescriptor: Any, schema: Schema): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'obj' @ [121:52] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'descriptor' @ [121:56] ==> public final val DescribedType.descriptor: (Any..Any?)[MyPropertyDescriptor]

'schema' @ [121:68] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'serializer' @ [122:17] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[LocalVariableDescriptor]

'type' @ [122:28] ==> public abstract val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[PropertyDescriptorImpl]

'type' @ [122:36] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'with' @ [122:44] ==> @InlineOnly public inline fun <T, R> with(receiver: Type, block: Type.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Boolean

'serializer' @ [122:49] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[LocalVariableDescriptor]

'type' @ [122:60] ==> public abstract val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[PropertyDescriptorImpl]

'!' @ [122:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSubClassOf' @ [122:69] ==> internal fun Type.isSubClassOf(type: Type): Boolean defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'type' @ [122:82] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'!' @ [122:91] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'materiallyEquivalentTo' @ [122:92] ==> private final fun Type.materiallyEquivalentTo(that: Type): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'type' @ [122:115] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'NotSerializableException' @ [123:23] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'+' @ [123:48] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'obj' @ [123:82] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'descriptor' @ [123:86] ==> public final val DescribedType.descriptor: (Any..Any?)[MyPropertyDescriptor]

'type' @ [124:50] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'serializer' @ [124:65] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[LocalVariableDescriptor]

'type' @ [124:76] ==> public abstract val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[PropertyDescriptorImpl]

'serializer' @ [125:20] ==> val serializer: AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[LocalVariableDescriptor]

'readObject' @ [125:31] ==> public abstract fun readObject(obj: Any, schema: Schema, input: DeserializationInput): Any defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[SimpleFunctionDescriptorImpl]

'obj' @ [125:42] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'described' @ [125:46] ==> public final val DescribedType.described: (Any..Any?)[MyPropertyDescriptor]

'schema' @ [125:57] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'this' @ [125:65] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[LazyClassReceiverParameterDescriptor]

'if (obj is Binary) {
            return obj.array
        } else {
            return obj
        }' @ [126:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'obj' @ [126:20] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'obj' @ [127:20] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'array' @ [127:24] ==> public final val Binary.array: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'obj' @ [129:20] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.readObject[ValueParameterDescriptorImpl]

'asClass' @ [139:9] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'that' @ [139:22] ==> value-parameter that: Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.materiallyEquivalentTo[ValueParameterDescriptorImpl]

'asClass' @ [139:27] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'that' @ [139:40] ==> value-parameter that: Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput.materiallyEquivalentTo[ValueParameterDescriptorImpl]

