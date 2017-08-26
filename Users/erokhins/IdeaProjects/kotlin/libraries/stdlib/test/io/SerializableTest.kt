'kotlin.jvm.JvmVersion' @ [1:1] ==> public constructor JvmVersion(minimum: Int = ..., maximum: Int = ...) defined in kotlin.jvm.JvmVersion[DeserializedClassConstructorDescriptor]

'name' @ [9:31] ==> public final val name: String defined in test.io.Serial[PropertyDescriptorImpl]

'ObjectSingleton' @ [16:38] ==> private object ObjectSingleton : Serializable defined in test.io in file SerializableTest.kt[FakeCallableDescriptorForObject]

'INSTANCE' @ [20:38] ==> public final val INSTANCE: OldSchoolSingleton defined in test.io.OldSchoolSingleton.Companion[PropertyDescriptorImpl]

'OldSchoolSingleton' @ [23:24] ==> private constructor OldSchoolSingleton() defined in test.io.OldSchoolSingleton[ClassConstructorDescriptorImpl]

'Test' @ [29:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'Triple' @ [30:21] ==> public constructor Triple<out A, out B, out C>(first: String, second: Int, third: Serial) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Int
    <out C> -> Serial

'Serial' @ [30:40] ==> public constructor Serial(name: String) defined in test.io.Serial[ClassConstructorDescriptorImpl]

'tuple' @ [31:20] ==> val tuple: Triple<String, Int, Serial> defined in test.io.SerializableTest.testClosure[LocalVariableDescriptor]

'toString' @ [31:26] ==> public open fun toString(): String defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'serializeAndDeserialize' @ [32:28] ==> public fun <T> serializeAndDeserialize(value: () -> String): () -> String defined in test.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Function0<String>

'fn' @ [32:52] ==> val fn: () -> String defined in test.io.SerializableTest.testClosure[LocalVariableDescriptor]

'assertEquals' @ [34:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'invoke' @ [34:22] ==> public abstract operator fun invoke(): String defined in kotlin.Function0[FunctionInvokeDescriptor]

'invoke' @ [34:28] ==> public abstract operator fun invoke(): String defined in kotlin.Function0[FunctionInvokeDescriptor]

'Test' @ [37:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'x' @ [39:32] ==> value-parameter x: Int defined in test.io.SerializableTest.testComplexClosure.<anonymous>[ValueParameterDescriptorImpl]

'y' @ [39:36] ==> val y: Int defined in test.io.SerializableTest.testComplexClosure[LocalVariableDescriptor]

'toString' @ [39:39] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'invoke' @ [40:42] ==> public abstract operator fun invoke(p1: Int): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [40:46] ==> <this> defined in test.io.SerializableTest.testComplexClosure.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [40:53] ==> value-parameter it: Int defined in test.io.SerializableTest.testComplexClosure.<anonymous>[ValueParameterDescriptorImpl]

'serializeAndDeserialize' @ [41:28] ==> public fun <T> serializeAndDeserialize(value: Int.(Int) -> String): Int.(Int) -> String defined in test.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> [@kotlin.ExtensionFunctionType] Function2<Int, Int, String>

'fn2' @ [41:52] ==> val fn2: Int.(Int) -> String defined in test.io.SerializableTest.testComplexClosure[LocalVariableDescriptor]

'assertEquals' @ [43:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: String, actual: String, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> String

'invoke' @ [43:24] ==> public abstract operator fun Int.invoke(p2: Int): String defined in kotlin.Function2[FunctionInvokeDescriptor]

'invoke' @ [43:35] ==> public abstract operator fun Int.invoke(p2: Int): String defined in kotlin.Function2[FunctionInvokeDescriptor]

'Test' @ [46:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'DataType' @ [47:20] ==> public constructor DataType(name: String, value: Int, percent: Double) defined in test.io.DataType[ClassConstructorDescriptorImpl]

'serializeAndDeserialize' @ [48:28] ==> public fun <T> serializeAndDeserialize(value: DataType): DataType defined in test.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> DataType

'data' @ [48:52] ==> val data: DataType defined in test.io.SerializableTest.testDataClass[LocalVariableDescriptor]

'assertEquals' @ [50:9] ==> public fun <@OnlyInputTypes T> assertEquals(expected: DataType, actual: DataType, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> DataType

'data' @ [50:22] ==> val data: DataType defined in test.io.SerializableTest.testDataClass[LocalVariableDescriptor]

'deserialized' @ [50:28] ==> val deserialized: DataType defined in test.io.SerializableTest.testDataClass[LocalVariableDescriptor]

'Test' @ [53:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'assertTrue' @ [54:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'INSTANCE' @ [54:34] ==> enum entry INSTANCE defined in test.io.EnumSingleton[FakeCallableDescriptorForObject]

'serializeAndDeserialize' @ [54:47] ==> public fun <T> serializeAndDeserialize(value: EnumSingleton): EnumSingleton defined in test.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> EnumSingleton

'INSTANCE' @ [54:85] ==> enum entry INSTANCE defined in test.io.EnumSingleton[FakeCallableDescriptorForObject]

'assertTrue' @ [55:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'OldSchoolSingleton' @ [55:20] ==> public companion object defined in test.io.OldSchoolSingleton[FakeCallableDescriptorForObject]

'INSTANCE' @ [55:39] ==> public final val INSTANCE: OldSchoolSingleton defined in test.io.OldSchoolSingleton.Companion[PropertyDescriptorImpl]

'serializeAndDeserialize' @ [55:52] ==> public fun <T> serializeAndDeserialize(value: OldSchoolSingleton): OldSchoolSingleton defined in test.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> OldSchoolSingleton

'OldSchoolSingleton' @ [55:76] ==> public companion object defined in test.io.OldSchoolSingleton[FakeCallableDescriptorForObject]

'INSTANCE' @ [55:95] ==> public final val INSTANCE: OldSchoolSingleton defined in test.io.OldSchoolSingleton.Companion[PropertyDescriptorImpl]

'assertTrue' @ [56:9] ==> public fun assertTrue(actual: Boolean, message: String? = ...): Unit defined in kotlin.test[DeserializedSimpleFunctionDescriptor]

'ObjectSingleton' @ [56:20] ==> private object ObjectSingleton : Serializable defined in test.io in file SerializableTest.kt[FakeCallableDescriptorForObject]

'serializeAndDeserialize' @ [56:40] ==> public fun <T> serializeAndDeserialize(value: ObjectSingleton): ObjectSingleton defined in test.io[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ObjectSingleton

'ObjectSingleton' @ [56:64] ==> private object ObjectSingleton : Serializable defined in test.io in file SerializableTest.kt[FakeCallableDescriptorForObject]

'ByteArrayOutputStream' @ [61:24] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'ObjectOutputStream' @ [62:30] ==> public constructor ObjectOutputStream(p0: (OutputStream..OutputStream?)) defined in java.io.ObjectOutputStream[JavaClassConstructorDescriptor]

'outputStream' @ [62:49] ==> val outputStream: ByteArrayOutputStream defined in test.io.serializeAndDeserialize[LocalVariableDescriptor]

'objectOutputStream' @ [64:5] ==> val objectOutputStream: ObjectOutputStream defined in test.io.serializeAndDeserialize[LocalVariableDescriptor]

'writeObject' @ [64:24] ==> public final fun writeObject(p0: (Any..Any?)): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'value' @ [64:36] ==> value-parameter value: T defined in test.io.serializeAndDeserialize[ValueParameterDescriptorImpl]

'objectOutputStream' @ [65:5] ==> val objectOutputStream: ObjectOutputStream defined in test.io.serializeAndDeserialize[LocalVariableDescriptor]

'close' @ [65:24] ==> public open fun close(): Unit defined in java.io.ObjectOutputStream[JavaMethodDescriptor]

'outputStream' @ [66:5] ==> val outputStream: ByteArrayOutputStream defined in test.io.serializeAndDeserialize[LocalVariableDescriptor]

'close' @ [66:18] ==> public open fun close(): Unit defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'ByteArrayInputStream' @ [68:23] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'outputStream' @ [68:44] ==> val outputStream: ByteArrayOutputStream defined in test.io.serializeAndDeserialize[LocalVariableDescriptor]

'toByteArray' @ [68:57] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'ObjectInputStream' @ [69:29] ==> public constructor ObjectInputStream(p0: (InputStream..InputStream?)) defined in java.io.ObjectInputStream[JavaClassConstructorDescriptor]

'inputStream' @ [69:47] ==> val inputStream: ByteArrayInputStream defined in test.io.serializeAndDeserialize[LocalVariableDescriptor]

'Suppress' @ [70:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'inputObjectStream' @ [71:12] ==> val inputObjectStream: ObjectInputStream defined in test.io.serializeAndDeserialize[LocalVariableDescriptor]

'readObject' @ [71:30] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

'value' @ [74:52] ==> value-parameter value: String defined in test.io.hexToBytes[ValueParameterDescriptorImpl]

'split' @ [74:58] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [74:69] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> Byte): List<Byte> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Byte

'parseInt' @ [74:83] ==> public open fun parseInt(p0: (String..String?), p1: Int): Int defined in java.lang.Integer[JavaMethodDescriptor]

'it' @ [74:92] ==> value-parameter it: String defined in test.io.hexToBytes.<anonymous>[ValueParameterDescriptorImpl]

'toByte' @ [74:100] ==> public open fun toByte(): Byte defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'toByteArray' @ [74:111] ==> public fun Collection<Byte>.toByteArray(): ByteArray defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'hexToBytes' @ [76:52] ==> private fun hexToBytes(value: String): ByteArray defined in test.io in file SerializableTest.kt[SimpleFunctionDescriptorImpl]

'value' @ [76:63] ==> value-parameter value: String defined in test.io.deserializeFromHex[ValueParameterDescriptorImpl]

'let' @ [76:70] ==> @InlineOnly public inline fun <T, R> ByteArray.let(block: (ByteArray) -> T): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray
    <R> -> T

'ByteArrayInputStream' @ [77:23] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'it' @ [77:44] ==> value-parameter it: ByteArray defined in test.io.deserializeFromHex.<anonymous>[ValueParameterDescriptorImpl]

'ObjectInputStream' @ [78:29] ==> public constructor ObjectInputStream(p0: (InputStream..InputStream?)) defined in java.io.ObjectInputStream[JavaClassConstructorDescriptor]

'inputStream' @ [78:47] ==> val inputStream: ByteArrayInputStream defined in test.io.deserializeFromHex.<anonymous>[LocalVariableDescriptor]

'Suppress' @ [79:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'inputObjectStream' @ [80:5] ==> val inputObjectStream: ObjectInputStream defined in test.io.deserializeFromHex.<anonymous>[LocalVariableDescriptor]

'readObject' @ [80:23] ==> public final fun readObject(): (Any..Any?) defined in java.io.ObjectInputStream[JavaMethodDescriptor]

