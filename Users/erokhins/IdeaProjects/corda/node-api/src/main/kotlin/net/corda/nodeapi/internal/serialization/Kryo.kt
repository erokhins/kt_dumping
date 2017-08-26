'Serializer<SerializedBytes<Any>>' @ [90:36] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SerializedBytes<Any>

'output' @ [92:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.SerializedBytesSerializer.write[ValueParameterDescriptorImpl]

'writeVarInt' @ [92:16] ==> public open fun writeVarInt(p0: Int, p1: Boolean): Int defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'obj' @ [92:28] ==> value-parameter obj: SerializedBytes<Any> defined in net.corda.nodeapi.internal.serialization.SerializedBytesSerializer.write[ValueParameterDescriptorImpl]

'bytes' @ [92:32] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'size' @ [92:38] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'output' @ [93:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.SerializedBytesSerializer.write[ValueParameterDescriptorImpl]

'writeBytes' @ [93:16] ==> public open fun writeBytes(p0: (ByteArray..ByteArray?)): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'obj' @ [93:27] ==> value-parameter obj: SerializedBytes<Any> defined in net.corda.nodeapi.internal.serialization.SerializedBytesSerializer.write[ValueParameterDescriptorImpl]

'bytes' @ [93:31] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'SerializedBytes' @ [97:16] ==> public constructor SerializedBytes<T : Any>(bytes: ByteArray) defined in net.corda.core.serialization.SerializedBytes[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> Any

'input' @ [97:32] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.SerializedBytesSerializer.read[ValueParameterDescriptorImpl]

'readBytes' @ [97:38] ==> public open fun readBytes(p0: Int): (ByteArray..ByteArray?) defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'input' @ [97:48] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.SerializedBytesSerializer.read[ValueParameterDescriptorImpl]

'readVarInt' @ [97:54] ==> public open fun readVarInt(p0: Boolean): Int defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'Serializer<T>' @ [105:65] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'klass' @ [106:17] ==> public final val klass: KClass<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'memberProperties' @ [106:23] ==> @SinceKotlin public val <T : Any> KClass<T>.memberProperties: Collection<KProperty1<T, *>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'sortedBy' @ [106:40] ==> public inline fun <T, R : Comparable<String>> Iterable<KProperty1<T, *>>.sortedBy(crossinline selector: (KProperty1<T, *>) -> String?): List<KProperty1<T, *>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<T, *>
    <R : Comparable<R>> -> String

'it' @ [106:51] ==> value-parameter it: KProperty1<T, *> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.props.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [106:54] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'props' @ [107:23] ==> public final val props: List<KProperty1<T, *>> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'associateBy' @ [107:29] ==> public inline fun <T, K> Iterable<KProperty1<T, *>>.associateBy(keySelector: (KProperty1<T, *>) -> String): Map<String, KProperty1<T, *>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<T, *>
    <K> -> String

'it' @ [107:43] ==> value-parameter it: KProperty1<T, *> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.propsByName.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [107:46] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'klass' @ [108:23] ==> public final val klass: KClass<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'primaryConstructor' @ [108:29] ==> @SinceKotlin public val <T : Any> KClass<T>.primaryConstructor: KFunction<T>? defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'assert' @ [112:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'props' @ [112:16] ==> public final val props: List<KProperty1<T, *>> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'none' @ [112:22] ==> public inline fun <T> Iterable<KProperty1<T, *>>.none(predicate: (KProperty1<T, *>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<T, *>

'it' @ [112:29] ==> value-parameter it: KProperty1<T, *> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.<init>.<anonymous>[ValueParameterDescriptorImpl]

'params' @ [117:16] ==> value-parameter params: List<KParameter> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.hashParameters[ValueParameterDescriptorImpl]

'map' @ [117:23] ==> public inline fun <T, R> Iterable<KParameter>.map(transform: (KParameter) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter
    <R> -> String

'+' @ [118:13] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [118:14] ==> value-parameter it: KParameter defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.hashParameters.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [118:17] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'it' @ [118:31] ==> value-parameter it: KParameter defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.hashParameters.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [118:34] ==> public abstract val index: Int defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'toString' @ [118:40] ==> public open fun toString(): String defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [118:53] ==> value-parameter it: KParameter defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.hashParameters.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [118:56] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'javaType' @ [118:61] ==> public val KType.javaType: Type defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'typeName' @ [118:70] ==> public final val Type.typeName: (String..String?)[MyPropertyDescriptor]

'hashCode' @ [119:11] ==> public open fun hashCode(): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'output' @ [123:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeVarInt' @ [123:16] ==> public open fun writeVarInt(p0: Int, p1: Boolean): Int defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'constructor' @ [123:28] ==> public final val constructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'parameters' @ [123:40] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'size' @ [123:51] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'output' @ [124:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeInt' @ [124:16] ==> public open fun writeInt(p0: Int): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'hashParameters' @ [124:25] ==> private final fun hashParameters(params: List<KParameter>): Int defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[SimpleFunctionDescriptorImpl]

'constructor' @ [124:40] ==> public final val constructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'parameters' @ [124:52] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'constructor' @ [125:23] ==> public final val constructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'parameters' @ [125:35] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'propsByName' @ [126:29] ==> public final val propsByName: Map<String, KProperty1<T, *>> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'param' @ [126:41] ==> val param: KParameter defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'name' @ [126:47] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'kProperty' @ [127:13] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'isAccessible' @ [127:23] ==> public var KCallable<*>.isAccessible: Boolean defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'when (param.type.javaType.typeName) {
                "int" -> output.writeVarInt(kProperty.get(obj) as Int, true)
                "long" -> output.writeVarLong(kProperty.get(obj) as Long, true)
                "short" -> output.writeShort(kProperty.get(obj) as Int)
                "char" -> output.writeChar(kProperty.get(obj) as Char)
                "byte" -> output.writeByte(kProperty.get(obj) as Byte)
                "double" -> output.writeDouble(kProperty.get(obj) as Double)
                "float" -> output.writeFloat(kProperty.get(obj) as Float)
                "boolean" -> output.writeBoolean(kProperty.get(obj) as Boolean)
                else -> try {
                    kryo.writeClassAndObject(output, kProperty.get(obj))
                } catch (e: Exception) {
                    throw IllegalStateException("Failed to serialize ${param.name} in ${klass.qualifiedName}", e)
                }
            }' @ [128:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any, entry4: Any, entry5: Any, entry6: Any, entry7: Any, entry8: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'param' @ [128:19] ==> val param: KParameter defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'type' @ [128:25] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'javaType' @ [128:30] ==> public val KType.javaType: Type defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'typeName' @ [128:39] ==> public final val Type.typeName: (String..String?)[MyPropertyDescriptor]

'output' @ [129:26] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeVarInt' @ [129:33] ==> public open fun writeVarInt(p0: Int, p1: Boolean): Int defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'kProperty' @ [129:45] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'get' @ [129:55] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'obj' @ [129:59] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'output' @ [130:27] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeVarLong' @ [130:34] ==> public open fun writeVarLong(p0: Long, p1: Boolean): Int defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'kProperty' @ [130:47] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'get' @ [130:57] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'obj' @ [130:61] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'output' @ [131:28] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeShort' @ [131:35] ==> public open fun writeShort(p0: Int): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'kProperty' @ [131:46] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'get' @ [131:56] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'obj' @ [131:60] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'output' @ [132:27] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeChar' @ [132:34] ==> public open fun writeChar(p0: Char): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'kProperty' @ [132:44] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'get' @ [132:54] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'obj' @ [132:58] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'output' @ [133:27] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeByte' @ [133:34] ==> public open fun writeByte(p0: Byte): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'kProperty' @ [133:44] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'get' @ [133:54] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'obj' @ [133:58] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'output' @ [134:29] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeDouble' @ [134:36] ==> public open fun writeDouble(p0: Double): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'kProperty' @ [134:48] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'get' @ [134:58] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'obj' @ [134:62] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'output' @ [135:28] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeFloat' @ [135:35] ==> public open fun writeFloat(p0: Float): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'kProperty' @ [135:46] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'get' @ [135:56] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'obj' @ [135:60] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'output' @ [136:30] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeBoolean' @ [136:37] ==> public open fun writeBoolean(p0: Boolean): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'kProperty' @ [136:50] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'get' @ [136:60] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'obj' @ [136:64] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'kryo' @ [138:21] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [138:26] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [138:46] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'kProperty' @ [138:54] ==> val kProperty: KProperty1<T, Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'get' @ [138:64] ==> public abstract fun get(receiver: T): Any? defined in kotlin.reflect.KProperty1[DeserializedSimpleFunctionDescriptor]

'obj' @ [138:68] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[ValueParameterDescriptorImpl]

'IllegalStateException' @ [140:27] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'param' @ [140:72] ==> val param: KParameter defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'name' @ [140:78] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'klass' @ [140:89] ==> public final val klass: KClass<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'qualifiedName' @ [140:95] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'e' @ [140:112] ==> val e: Exception /* = Exception */ defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.write[LocalVariableDescriptor]

'assert' @ [147:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'type' @ [147:16] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'kotlin' @ [147:21] ==> public val <T : Any> Class<T>.kotlin: KClass<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'klass' @ [147:31] ==> public final val klass: KClass<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'input' @ [148:25] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readVarInt' @ [148:31] ==> public open fun readVarInt(p0: Boolean): Int defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'input' @ [149:29] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readInt' @ [149:35] ==> public open fun readInt(): Int defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'numFields' @ [153:13] ==> val numFields: Int defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[LocalVariableDescriptor]

'constructor' @ [153:26] ==> public final val constructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'parameters' @ [153:38] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'size' @ [153:49] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'KryoException' @ [154:19] ==> public constructor KryoException(p0: (String..String?)) defined in com.esotericsoftware.kryo.KryoException[JavaClassConstructorDescriptor]

'+' @ [154:33] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'klass' @ [155:28] ==> public final val klass: KClass<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'qualifiedName' @ [155:34] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'numFields' @ [155:51] ==> val numFields: Int defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[LocalVariableDescriptor]

'constructor' @ [155:66] ==> public final val constructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'parameters' @ [155:78] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'size' @ [155:89] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'fieldTypeHash' @ [156:13] ==> val fieldTypeHash: Int defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[LocalVariableDescriptor]

'hashParameters' @ [156:30] ==> private final fun hashParameters(params: List<KParameter>): Int defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[SimpleFunctionDescriptorImpl]

'constructor' @ [156:45] ==> public final val constructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'parameters' @ [156:57] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'KryoException' @ [157:19] ==> public constructor KryoException(p0: (String..String?)) defined in com.esotericsoftware.kryo.KryoException[JavaClassConstructorDescriptor]

'klass' @ [157:78] ==> public final val klass: KClass<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'qualifiedName' @ [157:84] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'arrayOfNulls' @ [159:20] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<Any?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any?

'numFields' @ [159:39] ==> val numFields: Int defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[LocalVariableDescriptor]

'constructor' @ [161:23] ==> public final val constructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'parameters' @ [161:35] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'args' @ [162:13] ==> val args: Array<Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[LocalVariableDescriptor]

'cursor' @ [162:18] ==> var cursor: Int defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[LocalVariableDescriptor]

'when (param.type.javaType.typeName) {
                "int" -> input.readVarInt(true)
                "long" -> input.readVarLong(true)
                "short" -> input.readShort()
                "char" -> input.readChar()
                "byte" -> input.readByte()
                "double" -> input.readDouble()
                "float" -> input.readFloat()
                "boolean" -> input.readBoolean()
                else -> kryo.readClassAndObject(input)
            }' @ [162:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Any..Any?), entry1: (Any..Any?), entry2: (Any..Any?), entry3: (Any..Any?), entry4: (Any..Any?), entry5: (Any..Any?), entry6: (Any..Any?), entry7: (Any..Any?), entry8: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'param' @ [162:36] ==> val param: KParameter defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[LocalVariableDescriptor]

'type' @ [162:42] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'javaType' @ [162:47] ==> public val KType.javaType: Type defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'typeName' @ [162:56] ==> public final val Type.typeName: (String..String?)[MyPropertyDescriptor]

'input' @ [163:26] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readVarInt' @ [163:32] ==> public open fun readVarInt(p0: Boolean): Int defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'input' @ [164:27] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readVarLong' @ [164:33] ==> public open fun readVarLong(p0: Boolean): Long defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'input' @ [165:28] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readShort' @ [165:34] ==> public open fun readShort(): Short defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'input' @ [166:27] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readChar' @ [166:33] ==> public open fun readChar(): Char defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'input' @ [167:27] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readByte' @ [167:33] ==> public open fun readByte(): Byte defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'input' @ [168:29] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readDouble' @ [168:35] ==> public open fun readDouble(): Double defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'input' @ [169:28] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readFloat' @ [169:34] ==> public open fun readFloat(): Float defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'input' @ [170:30] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readBoolean' @ [170:36] ==> public open fun readBoolean(): Boolean defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'kryo' @ [171:25] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [171:30] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [171:49] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[ValueParameterDescriptorImpl]

'constructor' @ [176:13] ==> public final val constructor: KFunction<T> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer[PropertyDescriptorImpl]

'call' @ [176:25] ==> public abstract fun call(vararg args: Any?): T defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'args' @ [176:31] ==> val args: Array<Any?> defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[LocalVariableDescriptor]

'e' @ [178:19] ==> val e: InvocationTargetException defined in net.corda.nodeapi.internal.serialization.ImmutableClassSerializer.read[LocalVariableDescriptor]

'cause' @ [178:21] ==> public open val cause: Throwable? defined in java.lang.reflect.InvocationTargetException[JavaPropertyDescriptor]

'Serializer<InputStream>' @ [185:32] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> InputStream

'ByteArray' @ [187:22] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'stream' @ [189:37] ==> value-parameter stream: InputStream defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.write[ValueParameterDescriptorImpl]

'read' @ [189:44] ==> public open fun read(p0: (ByteArray..ByteArray?)): Int defined in java.io.InputStream[JavaMethodDescriptor]

'buffer' @ [189:49] ==> val buffer: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.write[LocalVariableDescriptor]

'if (numberOfBytesRead != -1) {
                output.writeInt(numberOfBytesRead, true)
                output.writeBytes(buffer, 0, numberOfBytesRead)
            } else {
                output.writeInt(0)
                break
            }' @ [190:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'numberOfBytesRead' @ [190:17] ==> val numberOfBytesRead: Int defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.write[LocalVariableDescriptor]

'-' @ [190:38] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'output' @ [191:17] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.write[ValueParameterDescriptorImpl]

'writeInt' @ [191:24] ==> public open fun writeInt(p0: Int, p1: Boolean): Int defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'numberOfBytesRead' @ [191:33] ==> val numberOfBytesRead: Int defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.write[LocalVariableDescriptor]

'output' @ [192:17] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.write[ValueParameterDescriptorImpl]

'writeBytes' @ [192:24] ==> public open fun writeBytes(p0: (ByteArray..ByteArray?), p1: Int, p2: Int): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'buffer' @ [192:35] ==> val buffer: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.write[LocalVariableDescriptor]

'numberOfBytesRead' @ [192:46] ==> val numberOfBytesRead: Int defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.write[LocalVariableDescriptor]

'output' @ [194:17] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.write[ValueParameterDescriptorImpl]

'writeInt' @ [194:24] ==> public open fun writeInt(p0: Int): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'ArrayList' @ [201:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ByteArray

'input' @ [203:25] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[ValueParameterDescriptorImpl]

'readBytesWithLength' @ [203:31] ==> public fun Input.readBytesWithLength(): ByteArray defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'if (chunk.isEmpty()) {
                break
            } else {
                chunks.add(chunk)
            }' @ [204:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'chunk' @ [204:17] ==> val chunk: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'isEmpty' @ [204:23] ==> @InlineOnly public inline fun ByteArray.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'chunks' @ [207:17] ==> val chunks: ArrayList<ByteArray> defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'add' @ [207:24] ==> public open fun add(element: ByteArray): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'chunk' @ [207:28] ==> val chunk: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'ByteArray' @ [210:25] ==> public constructor ByteArray(size: Int) defined in kotlin.ByteArray[DeserializedClassConstructorDescriptor]

'chunks' @ [210:35] ==> val chunks: ArrayList<ByteArray> defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'sumBy' @ [210:42] ==> public inline fun <T> Iterable<ByteArray>.sumBy(selector: (ByteArray) -> Int): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ByteArray

'it' @ [210:50] ==> value-parameter it: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [210:53] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'chunks' @ [212:23] ==> val chunks: ArrayList<ByteArray> defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'arraycopy' @ [213:20] ==> public open fun arraycopy(p0: (Any..Any?), p1: Int, p2: (Any..Any?), p3: Int, p4: Int): Unit defined in java.lang.System[JavaMethodDescriptor]

'chunk' @ [213:30] ==> val chunk: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'flattened' @ [213:40] ==> val flattened: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'offset' @ [213:51] ==> var offset: Int defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'chunk' @ [213:59] ==> val chunk: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'size' @ [213:65] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'offset' @ [214:13] ==> var offset: Int defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'chunk' @ [214:23] ==> val chunk: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'size' @ [214:29] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'ByteArrayInputStream' @ [216:16] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'flattened' @ [216:37] ==> val flattened: ByteArray defined in net.corda.nodeapi.internal.serialization.InputStreamSerializer.read[LocalVariableDescriptor]

'this' @ [222:15] ==> <this> defined in net.corda.nodeapi.internal.serialization.useClassLoader[ReceiverParameterDescriptorImpl]

'classLoader' @ [222:20] ==> public final var Kryo.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'getSystemClassLoader' @ [222:47] ==> @CallerSensitive public open fun getSystemClassLoader(): (ClassLoader..ClassLoader?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'this' @ [223:5] ==> <this> defined in net.corda.nodeapi.internal.serialization.useClassLoader[ReceiverParameterDescriptorImpl]

'classLoader' @ [223:10] ==> public final var Kryo.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'cl' @ [223:24] ==> value-parameter cl: ClassLoader defined in net.corda.nodeapi.internal.serialization.useClassLoader[ValueParameterDescriptorImpl]

'invoke' @ [225:16] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'this' @ [227:9] ==> <this> defined in net.corda.nodeapi.internal.serialization.useClassLoader[ReceiverParameterDescriptorImpl]

'classLoader' @ [227:14] ==> public final var Kryo.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'tmp' @ [227:28] ==> val tmp: (ClassLoader..ClassLoader?) defined in net.corda.nodeapi.internal.serialization.useClassLoader[LocalVariableDescriptor]

'this' @ [232:5] ==> <this> defined in net.corda.nodeapi.internal.serialization.writeBytesWithLength[ReceiverParameterDescriptorImpl]

'writeInt' @ [232:10] ==> public open fun writeInt(p0: Int, p1: Boolean): Int defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'byteArray' @ [232:19] ==> value-parameter byteArray: ByteArray defined in net.corda.nodeapi.internal.serialization.writeBytesWithLength[ValueParameterDescriptorImpl]

'size' @ [232:29] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'this' @ [233:5] ==> <this> defined in net.corda.nodeapi.internal.serialization.writeBytesWithLength[ReceiverParameterDescriptorImpl]

'writeBytes' @ [233:10] ==> public open fun writeBytes(p0: (ByteArray..ByteArray?)): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'byteArray' @ [233:21] ==> value-parameter byteArray: ByteArray defined in net.corda.nodeapi.internal.serialization.writeBytesWithLength[ValueParameterDescriptorImpl]

'this' @ [237:16] ==> <this> defined in net.corda.nodeapi.internal.serialization.readBytesWithLength[ReceiverParameterDescriptorImpl]

'readInt' @ [237:21] ==> public open fun readInt(p0: Boolean): Int defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'this' @ [238:12] ==> <this> defined in net.corda.nodeapi.internal.serialization.readBytesWithLength[ReceiverParameterDescriptorImpl]

'readBytes' @ [238:17] ==> public open fun readBytes(p0: Int): (ByteArray..ByteArray?) defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'size' @ [238:27] ==> val size: Int defined in net.corda.nodeapi.internal.serialization.readBytesWithLength[LocalVariableDescriptor]

'ThreadSafe' @ [242:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<WireTransaction>' @ [243:36] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WireTransaction

'VisibleForTesting' @ [244:5] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[DeserializedClassConstructorDescriptor]

'kryo' @ [248:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [248:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [248:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [248:42] ==> value-parameter obj: WireTransaction defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'inputs' @ [248:46] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'kryo' @ [249:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [249:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [249:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [249:42] ==> value-parameter obj: WireTransaction defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'attachments' @ [249:46] ==> public open val attachments: List<SecureHash> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'kryo' @ [250:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [250:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [250:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [250:42] ==> value-parameter obj: WireTransaction defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'outputs' @ [250:46] ==> public open val outputs: List<TransactionState<ContractState>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'kryo' @ [251:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [251:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [251:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [251:42] ==> value-parameter obj: WireTransaction defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'commands' @ [251:46] ==> public open val commands: List<Command<*>> defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'kryo' @ [252:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [252:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [252:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [252:42] ==> value-parameter obj: WireTransaction defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'notary' @ [252:46] ==> public open val notary: Party? defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'kryo' @ [253:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [253:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [253:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [253:42] ==> value-parameter obj: WireTransaction defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'timeWindow' @ [253:46] ==> public open val timeWindow: TimeWindow? defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'kryo' @ [254:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [254:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [254:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [254:42] ==> value-parameter obj: WireTransaction defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.write[ValueParameterDescriptorImpl]

'privacySalt' @ [254:46] ==> public open val privacySalt: PrivacySalt defined in net.corda.core.transactions.WireTransaction[DeserializedPropertyDescriptor]

'kryo' @ [258:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader[ValueParameterDescriptorImpl]

'context' @ [258:14] ==> public final val Kryo.context: raw (ObjectMap<(Any..Any?), (Any..Any?)>..ObjectMap<*, *>?)[MyPropertyDescriptor]

'attachmentsClassLoaderEnabled' @ [258:22] ==> @VisibleForTesting internal final val attachmentsClassLoaderEnabled: String defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer[PropertyDescriptorImpl]

'kryo' @ [259:36] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader[ValueParameterDescriptorImpl]

'serializationContext' @ [259:41] ==> public fun Kryo.serializationContext(): SerializeAsTokenContext? defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'ArrayList' @ [260:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SecureHash

'ArrayList' @ [261:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Attachment

'attachmentHashes' @ [262:9] ==> value-parameter attachmentHashes: List<SecureHash> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader[ValueParameterDescriptorImpl]

'forEach' @ [262:26] ==> @HidesMembers public inline fun <T> Iterable<SecureHash>.forEach(action: (SecureHash) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'serializationContext' @ [263:13] ==> val serializationContext: SerializeAsTokenContext defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader[LocalVariableDescriptor]

'serviceHub' @ [263:34] ==> public abstract val serviceHub: ServiceHub defined in net.corda.core.serialization.SerializeAsTokenContext[DeserializedPropertyDescriptor]

'attachments' @ [263:45] ==> public abstract val attachments: AttachmentStorage defined in net.corda.core.node.ServiceHub[DeserializedPropertyDescriptor]

'openAttachment' @ [263:57] ==> public abstract fun openAttachment(id: SecureHash): Attachment? defined in net.corda.core.node.services.AttachmentStorage[DeserializedSimpleFunctionDescriptor]

'id' @ [263:72] ==> value-parameter id: SecureHash defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [263:77] ==> @InlineOnly public inline fun <T, R> Attachment.let(block: (Attachment) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Attachment
    <R> -> Unit

'attachments' @ [263:83] ==> val attachments: ArrayList<Attachment> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader[LocalVariableDescriptor]

'it' @ [263:98] ==> value-parameter it: Attachment defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'run' @ [263:106] ==> @InlineOnly public inline fun <T, R> WireTransactionSerializer.run(block: WireTransactionSerializer.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WireTransactionSerializer
    <R> -> Unit

'missing' @ [263:112] ==> val missing: ArrayList<SecureHash> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader[LocalVariableDescriptor]

'id' @ [263:123] ==> value-parameter id: SecureHash defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader.<anonymous>[ValueParameterDescriptorImpl]

'missing' @ [265:9] ==> val missing: ArrayList<SecureHash> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader[LocalVariableDescriptor]

'isNotEmpty' @ [265:17] ==> @InlineOnly public inline fun <T> Collection<SecureHash>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SecureHash

'MissingAttachmentsException' @ [265:39] ==> public constructor MissingAttachmentsException(ids: List<SecureHash>) defined in net.corda.core.serialization.MissingAttachmentsException[DeserializedClassConstructorDescriptor]

'missing' @ [265:67] ==> val missing: ArrayList<SecureHash> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader[LocalVariableDescriptor]

'AttachmentsClassLoader' @ [266:16] ==> public constructor AttachmentsClassLoader(attachments: List<Attachment>, parent: ClassLoader = ...) defined in net.corda.core.serialization.AttachmentsClassLoader[DeserializedClassConstructorDescriptor]

'attachments' @ [266:39] ==> val attachments: ArrayList<Attachment> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.attachmentsClassLoader[LocalVariableDescriptor]

'Suppress' @ [269:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'kryo' @ [271:22] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [271:27] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [271:46] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [272:32] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [272:37] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [272:56] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [276:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'useClassLoader' @ [276:14] ==> public inline fun <T> Kryo.useClassLoader(cl: ClassLoader, body: () -> Nothing): Nothing defined in net.corda.nodeapi.internal.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Nothing

'attachmentsClassLoader' @ [276:29] ==> private final fun attachmentsClassLoader(kryo: Kryo, attachmentHashes: List<SecureHash>): ClassLoader? defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer[SimpleFunctionDescriptorImpl]

'kryo' @ [276:52] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'attachmentHashes' @ [276:58] ==> val attachmentHashes: List<SecureHash> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[LocalVariableDescriptor]

'javaClass' @ [276:79] ==> public val <T : Any> WireTransactionSerializer.javaClass: Class<WireTransactionSerializer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> WireTransactionSerializer

'classLoader' @ [276:89] ==> public final val <T : (Any..Any?)> Class<WireTransactionSerializer>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> WireTransactionSerializer

'kryo' @ [277:27] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [277:32] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [277:51] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [278:28] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [278:33] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [278:52] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [279:26] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [279:31] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [279:50] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [280:30] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [280:35] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [280:54] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [281:31] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [281:36] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [281:55] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[ValueParameterDescriptorImpl]

'WireTransaction' @ [282:20] ==> public constructor WireTransaction(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.WireTransaction[DeserializedClassConstructorDescriptor]

'inputs' @ [282:36] ==> val inputs: List<StateRef> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[LocalVariableDescriptor]

'attachmentHashes' @ [282:44] ==> val attachmentHashes: List<SecureHash> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read[LocalVariableDescriptor]

'outputs' @ [282:62] ==> val outputs: List<TransactionState<ContractState>> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read.<anonymous>[LocalVariableDescriptor]

'commands' @ [282:71] ==> val commands: List<Command<*>> defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read.<anonymous>[LocalVariableDescriptor]

'notary' @ [282:81] ==> val notary: Party? defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read.<anonymous>[LocalVariableDescriptor]

'timeWindow' @ [282:89] ==> val timeWindow: TimeWindow? defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read.<anonymous>[LocalVariableDescriptor]

'privacySalt' @ [282:101] ==> val privacySalt: PrivacySalt defined in net.corda.nodeapi.internal.serialization.WireTransactionSerializer.read.<anonymous>[LocalVariableDescriptor]

'ThreadSafe' @ [287:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<NotaryChangeWireTransaction>' @ [288:48] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NotaryChangeWireTransaction

'kryo' @ [290:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [290:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [290:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [290:42] ==> value-parameter obj: NotaryChangeWireTransaction defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.write[ValueParameterDescriptorImpl]

'inputs' @ [290:46] ==> public open val inputs: List<StateRef> defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedPropertyDescriptor]

'kryo' @ [291:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [291:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [291:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [291:42] ==> value-parameter obj: NotaryChangeWireTransaction defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.write[ValueParameterDescriptorImpl]

'notary' @ [291:46] ==> public open val notary: Party defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedPropertyDescriptor]

'kryo' @ [292:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [292:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [292:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [292:42] ==> value-parameter obj: NotaryChangeWireTransaction defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.write[ValueParameterDescriptorImpl]

'newNotary' @ [292:46] ==> public final val newNotary: Party defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedPropertyDescriptor]

'Suppress' @ [295:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'kryo' @ [297:22] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [297:27] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [297:46] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [298:22] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [298:27] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [298:46] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [299:25] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [299:30] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [299:49] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.read[ValueParameterDescriptorImpl]

'NotaryChangeWireTransaction' @ [301:16] ==> public constructor NotaryChangeWireTransaction(inputs: List<StateRef>, notary: Party, newNotary: Party) defined in net.corda.core.transactions.NotaryChangeWireTransaction[DeserializedClassConstructorDescriptor]

'inputs' @ [301:44] ==> val inputs: List<StateRef> defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.read[LocalVariableDescriptor]

'notary' @ [301:52] ==> val notary: Party defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.read[LocalVariableDescriptor]

'newNotary' @ [301:60] ==> val newNotary: Party defined in net.corda.nodeapi.internal.serialization.NotaryChangeWireTransactionSerializer.read[LocalVariableDescriptor]

'ThreadSafe' @ [305:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<SignedTransaction>' @ [306:38] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SignedTransaction

'kryo' @ [308:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [308:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [308:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [308:42] ==> value-parameter obj: SignedTransaction defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.write[ValueParameterDescriptorImpl]

'txBits' @ [308:46] ==> public final val txBits: SerializedBytes<CoreTransaction> defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'kryo' @ [309:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [309:14] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [309:34] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [309:42] ==> value-parameter obj: SignedTransaction defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.write[ValueParameterDescriptorImpl]

'sigs' @ [309:46] ==> public open val sigs: List<TransactionSignature> defined in net.corda.core.transactions.SignedTransaction[DeserializedPropertyDescriptor]

'Suppress' @ [312:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'SignedTransaction' @ [314:16] ==> public constructor SignedTransaction(txBits: SerializedBytes<CoreTransaction>, sigs: List<TransactionSignature>) defined in net.corda.core.transactions.SignedTransaction[DeserializedClassConstructorDescriptor]

'kryo' @ [315:17] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [315:22] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [315:41] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [316:17] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.read[ValueParameterDescriptorImpl]

'readClassAndObject' @ [316:22] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [316:41] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.SignedTransactionSerializer.read[ValueParameterDescriptorImpl]

'ThreadSafe' @ [322:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<EdDSAPrivateKey>' @ [323:38] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> EdDSAPrivateKey

'check' @ [325:9] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'obj' @ [325:15] ==> value-parameter obj: EdDSAPrivateKey defined in net.corda.nodeapi.internal.serialization.Ed25519PrivateKeySerializer.write[ValueParameterDescriptorImpl]

'params' @ [325:19] ==> public final val EdDSAPrivateKey.params: (EdDSAParameterSpec..EdDSAParameterSpec?)[MyPropertyDescriptor]

'Crypto' @ [325:29] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'EDDSA_ED25519_SHA512' @ [325:36] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'algSpec' @ [325:57] ==> public final val algSpec: AlgorithmParameterSpec? defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'output' @ [326:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.Ed25519PrivateKeySerializer.write[ValueParameterDescriptorImpl]

'writeBytesWithLength' @ [326:16] ==> public fun Output.writeBytesWithLength(byteArray: ByteArray): Unit defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'obj' @ [326:37] ==> value-parameter obj: EdDSAPrivateKey defined in net.corda.nodeapi.internal.serialization.Ed25519PrivateKeySerializer.write[ValueParameterDescriptorImpl]

'seed' @ [326:41] ==> public final val EdDSAPrivateKey.seed: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'input' @ [330:20] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.Ed25519PrivateKeySerializer.read[ValueParameterDescriptorImpl]

'readBytesWithLength' @ [330:26] ==> public fun Input.readBytesWithLength(): ByteArray defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'EdDSAPrivateKey' @ [331:16] ==> public constructor EdDSAPrivateKey(p0: (EdDSAPrivateKeySpec..EdDSAPrivateKeySpec?)) defined in net.i2p.crypto.eddsa.EdDSAPrivateKey[JavaClassConstructorDescriptor]

'EdDSAPrivateKeySpec' @ [331:32] ==> public constructor EdDSAPrivateKeySpec(p0: (ByteArray..ByteArray?), p1: (EdDSAParameterSpec..EdDSAParameterSpec?)) defined in net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec[JavaClassConstructorDescriptor]

'seed' @ [331:52] ==> val seed: ByteArray defined in net.corda.nodeapi.internal.serialization.Ed25519PrivateKeySerializer.read[LocalVariableDescriptor]

'Crypto' @ [331:58] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'EDDSA_ED25519_SHA512' @ [331:65] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'algSpec' @ [331:86] ==> public final val algSpec: AlgorithmParameterSpec? defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'ThreadSafe' @ [336:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<EdDSAPublicKey>' @ [337:37] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> EdDSAPublicKey

'check' @ [339:9] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'obj' @ [339:15] ==> value-parameter obj: EdDSAPublicKey defined in net.corda.nodeapi.internal.serialization.Ed25519PublicKeySerializer.write[ValueParameterDescriptorImpl]

'params' @ [339:19] ==> public final val EdDSAPublicKey.params: (EdDSAParameterSpec..EdDSAParameterSpec?)[MyPropertyDescriptor]

'Crypto' @ [339:29] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'EDDSA_ED25519_SHA512' @ [339:36] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'algSpec' @ [339:57] ==> public final val algSpec: AlgorithmParameterSpec? defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'output' @ [340:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.Ed25519PublicKeySerializer.write[ValueParameterDescriptorImpl]

'writeBytesWithLength' @ [340:16] ==> public fun Output.writeBytesWithLength(byteArray: ByteArray): Unit defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'obj' @ [340:37] ==> value-parameter obj: EdDSAPublicKey defined in net.corda.nodeapi.internal.serialization.Ed25519PublicKeySerializer.write[ValueParameterDescriptorImpl]

'abyte' @ [340:41] ==> public final val EdDSAPublicKey.abyte: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'input' @ [344:17] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.Ed25519PublicKeySerializer.read[ValueParameterDescriptorImpl]

'readBytesWithLength' @ [344:23] ==> public fun Input.readBytesWithLength(): ByteArray defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'EdDSAPublicKey' @ [345:16] ==> public constructor EdDSAPublicKey(p0: (EdDSAPublicKeySpec..EdDSAPublicKeySpec?)) defined in net.i2p.crypto.eddsa.EdDSAPublicKey[JavaClassConstructorDescriptor]

'EdDSAPublicKeySpec' @ [345:31] ==> public constructor EdDSAPublicKeySpec(p0: (ByteArray..ByteArray?), p1: (EdDSAParameterSpec..EdDSAParameterSpec?)) defined in net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec[JavaClassConstructorDescriptor]

'A' @ [345:50] ==> val A: ByteArray defined in net.corda.nodeapi.internal.serialization.Ed25519PublicKeySerializer.read[LocalVariableDescriptor]

'Crypto' @ [345:53] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'EDDSA_ED25519_SHA512' @ [345:60] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'algSpec' @ [345:81] ==> public final val algSpec: AlgorithmParameterSpec? defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'ThreadSafe' @ [350:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<ECPublicKeyImpl>' @ [351:36] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ECPublicKeyImpl

'output' @ [353:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ECPublicKeyImplSerializer.write[ValueParameterDescriptorImpl]

'writeBytesWithLength' @ [353:16] ==> public fun Output.writeBytesWithLength(byteArray: ByteArray): Unit defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'obj' @ [353:37] ==> value-parameter obj: ECPublicKeyImpl defined in net.corda.nodeapi.internal.serialization.ECPublicKeyImplSerializer.write[ValueParameterDescriptorImpl]

'encoded' @ [353:41] ==> public final val ECPublicKeyImpl.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'input' @ [357:17] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ECPublicKeyImplSerializer.read[ValueParameterDescriptorImpl]

'readBytesWithLength' @ [357:23] ==> public fun Input.readBytesWithLength(): ByteArray defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'DerValue' @ [358:19] ==> public constructor DerValue(p0: (ByteArray..ByteArray?)) defined in sun.security.util.DerValue[JavaClassConstructorDescriptor]

'A' @ [358:28] ==> val A: ByteArray defined in net.corda.nodeapi.internal.serialization.ECPublicKeyImplSerializer.read[LocalVariableDescriptor]

'parse' @ [359:32] ==> public open fun parse(p0: (DerValue..DerValue?)): (PublicKey..PublicKey?) defined in sun.security.ec.ECPublicKeyImpl[JavaMethodDescriptor]

'der' @ [359:38] ==> val der: DerValue defined in net.corda.nodeapi.internal.serialization.ECPublicKeyImplSerializer.read[LocalVariableDescriptor]

'ThreadSafe' @ [364:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<CompositeKey>' @ [365:33] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompositeKey

'output' @ [367:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.write[ValueParameterDescriptorImpl]

'writeInt' @ [367:16] ==> public open fun writeInt(p0: Int): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'obj' @ [367:25] ==> value-parameter obj: CompositeKey defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.write[ValueParameterDescriptorImpl]

'threshold' @ [367:29] ==> public final val threshold: Int defined in net.corda.core.crypto.composite.CompositeKey[DeserializedPropertyDescriptor]

'output' @ [368:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.write[ValueParameterDescriptorImpl]

'writeInt' @ [368:16] ==> public open fun writeInt(p0: Int): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'obj' @ [368:25] ==> value-parameter obj: CompositeKey defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.write[ValueParameterDescriptorImpl]

'children' @ [368:29] ==> public final val children: List<CompositeKey.NodeAndWeight> defined in net.corda.core.crypto.composite.CompositeKey[DeserializedPropertyDescriptor]

'size' @ [368:38] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'obj' @ [369:9] ==> value-parameter obj: CompositeKey defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.write[ValueParameterDescriptorImpl]

'children' @ [369:13] ==> public final val children: List<CompositeKey.NodeAndWeight> defined in net.corda.core.crypto.composite.CompositeKey[DeserializedPropertyDescriptor]

'forEach' @ [369:22] ==> @HidesMembers public inline fun <T> Iterable<CompositeKey.NodeAndWeight>.forEach(action: (CompositeKey.NodeAndWeight) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeAndWeight

'kryo' @ [369:32] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.write[ValueParameterDescriptorImpl]

'writeClassAndObject' @ [369:37] ==> public open fun writeClassAndObject(p0: (Output..Output?), p1: (Any..Any?)): Unit defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'output' @ [369:57] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.write[ValueParameterDescriptorImpl]

'it' @ [369:65] ==> value-parameter it: CompositeKey.NodeAndWeight defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.write.<anonymous>[ValueParameterDescriptorImpl]

'input' @ [373:25] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.read[ValueParameterDescriptorImpl]

'readInt' @ [373:31] ==> public open fun readInt(): Int defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'readListOfLength' @ [374:24] ==> public inline fun <reified T> readListOfLength(kryo: Kryo, input: Input, minLen: Int = ..., expectedLen: Int? = ...): List<CompositeKey.NodeAndWeight> defined in net.corda.nodeapi.internal.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T> -> NodeAndWeight

'kryo' @ [374:69] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.read[ValueParameterDescriptorImpl]

'input' @ [374:75] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.read[ValueParameterDescriptorImpl]

'CompositeKey' @ [375:23] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'Builder' @ [375:36] ==> public constructor Builder() defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedClassConstructorDescriptor]

'children' @ [376:9] ==> val children: List<CompositeKey.NodeAndWeight> defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.read[LocalVariableDescriptor]

'forEach' @ [376:18] ==> @HidesMembers public inline fun <T> Iterable<CompositeKey.NodeAndWeight>.forEach(action: (CompositeKey.NodeAndWeight) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NodeAndWeight

'builder' @ [376:28] ==> val builder: CompositeKey.Builder defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.read[LocalVariableDescriptor]

'addKey' @ [376:36] ==> public final fun addKey(key: PublicKey, weight: Int = ...): CompositeKey.Builder defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'it' @ [376:43] ==> value-parameter it: CompositeKey.NodeAndWeight defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.read.<anonymous>[ValueParameterDescriptorImpl]

'node' @ [376:46] ==> public final val node: PublicKey defined in net.corda.core.crypto.composite.CompositeKey.NodeAndWeight[DeserializedPropertyDescriptor]

'it' @ [376:52] ==> value-parameter it: CompositeKey.NodeAndWeight defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.read.<anonymous>[ValueParameterDescriptorImpl]

'weight' @ [376:55] ==> public final val weight: Int defined in net.corda.core.crypto.composite.CompositeKey.NodeAndWeight[DeserializedPropertyDescriptor]

'builder' @ [377:16] ==> val builder: CompositeKey.Builder defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.read[LocalVariableDescriptor]

'build' @ [377:24] ==> public final fun build(threshold: Int? = ...): PublicKey defined in net.corda.core.crypto.composite.CompositeKey.Builder[DeserializedSimpleFunctionDescriptor]

'threshold' @ [377:30] ==> val threshold: Int defined in net.corda.nodeapi.internal.serialization.CompositeKeySerializer.read[LocalVariableDescriptor]

'ThreadSafe' @ [381:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<PrivateKey>' @ [382:31] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PrivateKey

'output' @ [384:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.PrivateKeySerializer.write[ValueParameterDescriptorImpl]

'writeBytesWithLength' @ [384:16] ==> public fun Output.writeBytesWithLength(byteArray: ByteArray): Unit defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'obj' @ [384:37] ==> value-parameter obj: PrivateKey defined in net.corda.nodeapi.internal.serialization.PrivateKeySerializer.write[ValueParameterDescriptorImpl]

'encoded' @ [384:41] ==> public final val PrivateKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'input' @ [388:17] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.PrivateKeySerializer.read[ValueParameterDescriptorImpl]

'readBytesWithLength' @ [388:23] ==> public fun Input.readBytesWithLength(): ByteArray defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'Crypto' @ [389:16] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'decodePrivateKey' @ [389:23] ==> @JvmStatic public final fun decodePrivateKey(encodedKey: ByteArray): PrivateKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'A' @ [389:40] ==> val A: ByteArray defined in net.corda.nodeapi.internal.serialization.PrivateKeySerializer.read[LocalVariableDescriptor]

'ThreadSafe' @ [394:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<PublicKey>' @ [395:30] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PublicKey

'output' @ [398:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.PublicKeySerializer.write[ValueParameterDescriptorImpl]

'writeBytesWithLength' @ [398:16] ==> public fun Output.writeBytesWithLength(byteArray: ByteArray): Unit defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'obj' @ [398:37] ==> value-parameter obj: PublicKey defined in net.corda.nodeapi.internal.serialization.PublicKeySerializer.write[ValueParameterDescriptorImpl]

'encoded' @ [398:41] ==> public final val PublicKey.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'input' @ [402:17] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.PublicKeySerializer.read[ValueParameterDescriptorImpl]

'readBytesWithLength' @ [402:23] ==> public fun Input.readBytesWithLength(): ByteArray defined in net.corda.nodeapi.internal.serialization in file Kryo.kt[SimpleFunctionDescriptorImpl]

'Crypto' @ [403:16] ==> public object Crypto defined in net.corda.core.crypto[FakeCallableDescriptorForObject]

'decodePublicKey' @ [403:23] ==> @JvmStatic public final fun decodePublicKey(encodedKey: ByteArray): PublicKey defined in net.corda.core.crypto.Crypto[DeserializedSimpleFunctionDescriptor]

'A' @ [403:39] ==> val A: ByteArray defined in net.corda.nodeapi.internal.serialization.PublicKeySerializer.read[LocalVariableDescriptor]

'input' @ [413:21] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.readListOfLength[ValueParameterDescriptorImpl]

'readInt' @ [413:27] ==> public open fun readInt(): Int defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'elemCount' @ [414:9] ==> val elemCount: Int defined in net.corda.nodeapi.internal.serialization.readListOfLength[LocalVariableDescriptor]

'minLen' @ [414:21] ==> value-parameter minLen: Int = ... defined in net.corda.nodeapi.internal.serialization.readListOfLength[ValueParameterDescriptorImpl]

'KryoException' @ [414:35] ==> public constructor KryoException(p0: (String..String?)) defined in com.esotericsoftware.kryo.KryoException[JavaClassConstructorDescriptor]

'minLen' @ [414:115] ==> value-parameter minLen: Int = ... defined in net.corda.nodeapi.internal.serialization.readListOfLength[ValueParameterDescriptorImpl]

'elemCount' @ [414:129] ==> val elemCount: Int defined in net.corda.nodeapi.internal.serialization.readListOfLength[LocalVariableDescriptor]

'expectedLen' @ [415:9] ==> value-parameter expectedLen: Int? = ... defined in net.corda.nodeapi.internal.serialization.readListOfLength[ValueParameterDescriptorImpl]

'elemCount' @ [415:32] ==> val elemCount: Int defined in net.corda.nodeapi.internal.serialization.readListOfLength[LocalVariableDescriptor]

'expectedLen' @ [415:45] ==> value-parameter expectedLen: Int? = ... defined in net.corda.nodeapi.internal.serialization.readListOfLength[ValueParameterDescriptorImpl]

'KryoException' @ [416:15] ==> public constructor KryoException(p0: (String..String?)) defined in com.esotericsoftware.kryo.KryoException[JavaClassConstructorDescriptor]

'expectedLen' @ [416:73] ==> value-parameter expectedLen: Int? = ... defined in net.corda.nodeapi.internal.serialization.readListOfLength[ValueParameterDescriptorImpl]

'elemCount' @ [416:92] ==> val elemCount: Int defined in net.corda.nodeapi.internal.serialization.readListOfLength[LocalVariableDescriptor]

'..' @ [417:17] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'elemCount' @ [417:20] ==> val elemCount: Int defined in net.corda.nodeapi.internal.serialization.readListOfLength[LocalVariableDescriptor]

'map' @ [417:31] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> T

'kryo' @ [417:37] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.readListOfLength[ValueParameterDescriptorImpl]

'readClassAndObject' @ [417:42] ==> public open fun readClassAndObject(p0: (Input..Input?)): (Any..Any?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'input' @ [417:61] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.readListOfLength[ValueParameterDescriptorImpl]

'list' @ [418:12] ==> val list: List<T> defined in net.corda.nodeapi.internal.serialization.readListOfLength[LocalVariableDescriptor]

'Kryo' @ [425:54] ==> public constructor Kryo(p0: (ClassResolver..ClassResolver?), p1: (ReferenceResolver..ReferenceResolver?)) defined in com.esotericsoftware.kryo.Kryo[JavaClassConstructorDescriptor]

'classResolver' @ [425:59] ==> value-parameter classResolver: ClassResolver defined in net.corda.nodeapi.internal.serialization.CordaKryo.<init>[ValueParameterDescriptorImpl]

'MapReferenceResolver' @ [425:74] ==> public constructor MapReferenceResolver() defined in com.esotericsoftware.kryo.util.MapReferenceResolver[JavaClassConstructorDescriptor]

'classResolver' @ [427:10] ==> public final val CordaKryo.classResolver: (ClassResolver..ClassResolver?)[MyPropertyDescriptor]

'disableWhitelist' @ [427:49] ==> public final fun disableWhitelist(): Unit defined in net.corda.nodeapi.internal.serialization.CordaClassResolver[SimpleFunctionDescriptorImpl]

'super' @ [429:20] ==> <this> defined in net.corda.nodeapi.internal.serialization.CordaKryo[LazyClassReceiverParameterDescriptor]

'register' @ [429:26] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'type' @ [429:35] ==> value-parameter type: Class<*>? defined in net.corda.nodeapi.internal.serialization.CordaKryo.register[ValueParameterDescriptorImpl]

'classResolver' @ [431:14] ==> public final val CordaKryo.classResolver: (ClassResolver..ClassResolver?)[MyPropertyDescriptor]

'enableWhitelist' @ [431:53] ==> public final fun enableWhitelist(): Unit defined in net.corda.nodeapi.internal.serialization.CordaClassResolver[SimpleFunctionDescriptorImpl]

'classResolver' @ [436:10] ==> public final val CordaKryo.classResolver: (ClassResolver..ClassResolver?)[MyPropertyDescriptor]

'disableWhitelist' @ [436:49] ==> public final fun disableWhitelist(): Unit defined in net.corda.nodeapi.internal.serialization.CordaClassResolver[SimpleFunctionDescriptorImpl]

'super' @ [438:20] ==> <this> defined in net.corda.nodeapi.internal.serialization.CordaKryo[LazyClassReceiverParameterDescriptor]

'register' @ [438:26] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: Int): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'type' @ [438:35] ==> value-parameter type: Class<*>? defined in net.corda.nodeapi.internal.serialization.CordaKryo.register[ValueParameterDescriptorImpl]

'id' @ [438:41] ==> value-parameter id: Int defined in net.corda.nodeapi.internal.serialization.CordaKryo.register[ValueParameterDescriptorImpl]

'classResolver' @ [440:14] ==> public final val CordaKryo.classResolver: (ClassResolver..ClassResolver?)[MyPropertyDescriptor]

'enableWhitelist' @ [440:53] ==> public final fun enableWhitelist(): Unit defined in net.corda.nodeapi.internal.serialization.CordaClassResolver[SimpleFunctionDescriptorImpl]

'classResolver' @ [445:10] ==> public final val CordaKryo.classResolver: (ClassResolver..ClassResolver?)[MyPropertyDescriptor]

'disableWhitelist' @ [445:49] ==> public final fun disableWhitelist(): Unit defined in net.corda.nodeapi.internal.serialization.CordaClassResolver[SimpleFunctionDescriptorImpl]

'super' @ [447:20] ==> <this> defined in net.corda.nodeapi.internal.serialization.CordaKryo[LazyClassReceiverParameterDescriptor]

'register' @ [447:26] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'type' @ [447:35] ==> value-parameter type: Class<*>? defined in net.corda.nodeapi.internal.serialization.CordaKryo.register[ValueParameterDescriptorImpl]

'serializer' @ [447:41] ==> value-parameter serializer: Serializer<*>? defined in net.corda.nodeapi.internal.serialization.CordaKryo.register[ValueParameterDescriptorImpl]

'classResolver' @ [449:14] ==> public final val CordaKryo.classResolver: (ClassResolver..ClassResolver?)[MyPropertyDescriptor]

'enableWhitelist' @ [449:53] ==> public final fun enableWhitelist(): Unit defined in net.corda.nodeapi.internal.serialization.CordaClassResolver[SimpleFunctionDescriptorImpl]

'classResolver' @ [454:10] ==> public final val CordaKryo.classResolver: (ClassResolver..ClassResolver?)[MyPropertyDescriptor]

'disableWhitelist' @ [454:49] ==> public final fun disableWhitelist(): Unit defined in net.corda.nodeapi.internal.serialization.CordaClassResolver[SimpleFunctionDescriptorImpl]

'super' @ [456:20] ==> <this> defined in net.corda.nodeapi.internal.serialization.CordaKryo[LazyClassReceiverParameterDescriptor]

'register' @ [456:26] ==> public open fun register(p0: (Registration..Registration?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'registration' @ [456:35] ==> value-parameter registration: Registration? defined in net.corda.nodeapi.internal.serialization.CordaKryo.register[ValueParameterDescriptorImpl]

'classResolver' @ [458:14] ==> public final val CordaKryo.classResolver: (ClassResolver..ClassResolver?)[MyPropertyDescriptor]

'enableWhitelist' @ [458:53] ==> public final fun enableWhitelist(): Unit defined in net.corda.nodeapi.internal.serialization.CordaClassResolver[SimpleFunctionDescriptorImpl]

'register' @ [467:12] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'type' @ [468:13] ==> value-parameter type: KClass<T> defined in net.corda.nodeapi.internal.serialization.register[ValueParameterDescriptorImpl]

'java' @ [468:18] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Serializer<T>' @ [469:22] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'invoke' @ [470:83] ==> public abstract operator fun invoke(p1: Kryo, p2: Input): T defined in kotlin.Function2[FunctionInvokeDescriptor]

'kryo' @ [470:88] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.register.<no name provided>.read[ValueParameterDescriptorImpl]

'input' @ [470:94] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.register.<no name provided>.read[ValueParameterDescriptorImpl]

'invoke' @ [471:74] ==> public abstract operator fun invoke(p1: Kryo, p2: Output, p3: T): Unit defined in kotlin.Function3[FunctionInvokeDescriptor]

'kryo' @ [471:80] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.register.<no name provided>.write[ValueParameterDescriptorImpl]

'output' @ [471:86] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.register.<no name provided>.write[ValueParameterDescriptorImpl]

'obj' @ [471:94] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.register.<no name provided>.write[ValueParameterDescriptorImpl]

'register' @ [482:5] ==> public open fun register(p0: raw (Class<(Any..Any?)>..Class<*>?), p1: raw (Serializer<(Any..Any?)>..Serializer<*>?)): (Registration..Registration?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [482:23] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'NoReferencesSerializer' @ [482:29] ==> public constructor NoReferencesSerializer<T>(baseSerializer: Serializer<(Any..Any?)>) defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'getSerializer' @ [482:52] ==> public open fun getSerializer(p0: raw (Class<(Any..Any?)>..Class<*>?)): raw (Serializer<(Any..Any?)>..Serializer<*>?) defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'java' @ [482:75] ==> public val <T> KClass<T>.java: Class<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'Serializer<T>' @ [485:70] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'kryo' @ [488:16] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer.read[ValueParameterDescriptorImpl]

'withoutReferences' @ [488:21] ==> public fun <T> Kryo.withoutReferences(block: () -> (T..T?)): (T..T?) defined in net.corda.nodeapi.internal.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (T..T?)

'baseSerializer' @ [488:41] ==> public final val baseSerializer: Serializer<T> defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer[PropertyDescriptorImpl]

'read' @ [488:56] ==> public abstract fun read(p0: (Kryo..Kryo?), p1: (Input..Input?), p2: (Class<(T..T?)>..Class<(T..T?)>?)): (T..T?) defined in com.esotericsoftware.kryo.Serializer[JavaMethodDescriptor]

'kryo' @ [488:61] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer.read[ValueParameterDescriptorImpl]

'input' @ [488:67] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer.read[ValueParameterDescriptorImpl]

'type' @ [488:74] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer.read[ValueParameterDescriptorImpl]

'kryo' @ [492:9] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer.write[ValueParameterDescriptorImpl]

'withoutReferences' @ [492:14] ==> public fun <T> Kryo.withoutReferences(block: () -> Unit): Unit defined in net.corda.nodeapi.internal.serialization[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'baseSerializer' @ [492:34] ==> public final val baseSerializer: Serializer<T> defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer[PropertyDescriptorImpl]

'write' @ [492:49] ==> public abstract fun write(p0: (Kryo..Kryo?), p1: (Output..Output?), p2: (T..T?)): Unit defined in com.esotericsoftware.kryo.Serializer[JavaMethodDescriptor]

'kryo' @ [492:55] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer.write[ValueParameterDescriptorImpl]

'output' @ [492:61] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer.write[ValueParameterDescriptorImpl]

'obj' @ [492:69] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.NoReferencesSerializer.write[ValueParameterDescriptorImpl]

'setReferences' @ [497:25] ==> public open fun setReferences(p0: Boolean): Boolean defined in com.esotericsoftware.kryo.Kryo[JavaMethodDescriptor]

'invoke' @ [499:16] ==> public abstract operator fun invoke(): T defined in kotlin.Function0[FunctionInvokeDescriptor]

'references' @ [501:9] ==> public final var Kryo.references: Boolean[MyPropertyDescriptor]

'previousValue' @ [501:22] ==> val previousValue: Boolean defined in net.corda.nodeapi.internal.serialization.withoutReferences[LocalVariableDescriptor]

'ThreadSafe' @ [506:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<Logger>' @ [507:27] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Logger

'output' @ [509:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.LoggerSerializer.write[ValueParameterDescriptorImpl]

'writeString' @ [509:16] ==> public open fun writeString(p0: (String..String?)): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'obj' @ [509:28] ==> value-parameter obj: Logger defined in net.corda.nodeapi.internal.serialization.LoggerSerializer.write[ValueParameterDescriptorImpl]

'name' @ [509:32] ==> public final val Logger.name: (String..String?)[MyPropertyDescriptor]

'getLogger' @ [513:30] ==> public open fun getLogger(p0: (String..String?)): (Logger..Logger?) defined in org.slf4j.LoggerFactory[JavaMethodDescriptor]

'input' @ [513:40] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.LoggerSerializer.read[ValueParameterDescriptorImpl]

'readString' @ [513:46] ==> public open fun readString(): (String..String?) defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'Serializer<Class<*>>' @ [517:26] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Class<*>

'input' @ [519:25] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ClassSerializer.read[ValueParameterDescriptorImpl]

'readString' @ [519:31] ==> public open fun readString(): (String..String?) defined in com.esotericsoftware.kryo.io.Input[JavaMethodDescriptor]

'forName' @ [520:22] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'className' @ [520:30] ==> val className: (String..String?) defined in net.corda.nodeapi.internal.serialization.ClassSerializer.read[LocalVariableDescriptor]

'output' @ [524:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ClassSerializer.write[ValueParameterDescriptorImpl]

'writeString' @ [524:16] ==> public open fun writeString(p0: (String..String?)): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'clazz' @ [524:28] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.ClassSerializer.write[ValueParameterDescriptorImpl]

'name' @ [524:34] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'ThreadSafe' @ [531:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<X500Name>' @ [532:29] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X500Name

'getInstance' @ [534:25] ==> public open fun getInstance(p0: (Any..Any?)): (X500Name..X500Name?) defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'ASN1InputStream' @ [534:37] ==> public constructor ASN1InputStream(p0: (ByteArray..ByteArray?)) defined in org.bouncycastle.asn1.ASN1InputStream[JavaClassConstructorDescriptor]

'input' @ [534:53] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.X500NameSerializer.read[ValueParameterDescriptorImpl]

'readBytes' @ [534:59] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'readObject' @ [534:72] ==> public open fun readObject(): (ASN1Primitive..ASN1Primitive?) defined in org.bouncycastle.asn1.ASN1InputStream[JavaMethodDescriptor]

'output' @ [538:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.X500NameSerializer.write[ValueParameterDescriptorImpl]

'writeBytes' @ [538:16] ==> public open fun writeBytes(p0: (ByteArray..ByteArray?)): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'obj' @ [538:27] ==> value-parameter obj: X500Name defined in net.corda.nodeapi.internal.serialization.X500NameSerializer.write[ValueParameterDescriptorImpl]

'encoded' @ [538:31] ==> public final val X500Name.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'ThreadSafe' @ [545:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<CertPath>' @ [546:29] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CertPath

'getInstance' @ [547:58] ==> public final fun getInstance(p0: (String..String?)): (CertificateFactory..CertificateFactory?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'factory' @ [549:16] ==> public final val factory: CertificateFactory defined in net.corda.nodeapi.internal.serialization.CertPathSerializer[PropertyDescriptorImpl]

'generateCertPath' @ [549:24] ==> public final fun generateCertPath(p0: (InputStream..InputStream?)): (CertPath..CertPath?) defined in java.security.cert.CertificateFactory[JavaMethodDescriptor]

'input' @ [549:41] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.CertPathSerializer.read[ValueParameterDescriptorImpl]

'output' @ [553:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.CertPathSerializer.write[ValueParameterDescriptorImpl]

'writeBytes' @ [553:16] ==> public open fun writeBytes(p0: (ByteArray..ByteArray?)): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'obj' @ [553:27] ==> value-parameter obj: CertPath defined in net.corda.nodeapi.internal.serialization.CertPathSerializer.write[ValueParameterDescriptorImpl]

'encoded' @ [553:31] ==> public final val CertPath.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'ThreadSafe' @ [560:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<X509CertificateHolder>' @ [561:36] ==> public constructor Serializer<T : (Any..Any?)>() defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X509CertificateHolder

'X509CertificateHolder' @ [563:16] ==> public constructor X509CertificateHolder(p0: (ByteArray..ByteArray?)) defined in org.bouncycastle.cert.X509CertificateHolder[JavaClassConstructorDescriptor]

'input' @ [563:38] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.X509CertificateSerializer.read[ValueParameterDescriptorImpl]

'readBytes' @ [563:44] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'output' @ [567:9] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.X509CertificateSerializer.write[ValueParameterDescriptorImpl]

'writeBytes' @ [567:16] ==> public open fun writeBytes(p0: (ByteArray..ByteArray?)): Unit defined in com.esotericsoftware.kryo.io.Output[JavaMethodDescriptor]

'obj' @ [567:27] ==> value-parameter obj: X509CertificateHolder defined in net.corda.nodeapi.internal.serialization.X509CertificateSerializer.write[ValueParameterDescriptorImpl]

'encoded' @ [567:31] ==> public final val X509CertificateHolder.encoded: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'context' @ [571:61] ==> public final val Kryo.context: raw (ObjectMap<(Any..Any?), (Any..Any?)>..ObjectMap<*, *>?)[MyPropertyDescriptor]

'get' @ [571:69] ==> public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in com.esotericsoftware.kryo.util.ObjectMap[JavaMethodDescriptor]

'serializationContextKey' @ [571:73] ==> public val serializationContextKey: Class<SerializeAsTokenContext> defined in net.corda.nodeapi.internal.serialization in file SerializeAsTokenContextImpl.kt[PropertyDescriptorImpl]

'ThreadSafe' @ [580:1] ==> public constructor ThreadSafe() defined in javax.annotation.concurrent.ThreadSafe[JavaClassConstructorDescriptor]

'Serializer<Throwable>' @ [581:60] ==> public constructor Serializer<T : (Any..Any?)>(p0: Boolean, p1: Boolean) defined in com.esotericsoftware.kryo.Serializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Throwable

'Throwable' @ [584:39] ==> public constructor Throwable() defined in kotlin.Throwable[DeserializedClassConstructorDescriptor]

'java' @ [584:56] ==> public val <T> KClass<Throwable>.java: Class<Throwable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Throwable

'getDeclaredField' @ [584:61] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'let' @ [586:37] ==> @InlineOnly public inline fun <T, R> ThrowableSerializer.Companion.let(block: (ThrowableSerializer.Companion) -> (Any..Any?)): (Any..Any?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Companion
    <R> -> (kotlin.Any..kotlin.Any?)

'Throwable' @ [587:33] ==> public constructor Throwable() defined in kotlin.Throwable[DeserializedClassConstructorDescriptor]

'java' @ [587:50] ==> public val <T> KClass<Throwable>.java: Class<Throwable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Throwable

'getDeclaredField' @ [587:55] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'sentinelField' @ [588:13] ==> val sentinelField: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.Companion.sentinelValue.<anonymous>[LocalVariableDescriptor]

'isAccessible' @ [588:27] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'sentinelField' @ [589:13] ==> val sentinelField: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.Companion.sentinelValue.<anonymous>[LocalVariableDescriptor]

'get' @ [589:27] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'suppressedField' @ [593:13] ==> private final val suppressedField: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.Companion[PropertyDescriptorImpl]

'isAccessible' @ [593:29] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'Suppress' @ [597:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'makeSerializer' @ [598:79] ==> public open fun makeSerializer(p0: (Kryo..Kryo?), p1: (Class<out raw (Serializer<(Any..Any?)>..Serializer<*>?)>..Class<out raw (Serializer<(Any..Any?)>..Serializer<*>?)>?), p2: (Class<*>..Class<*>?)): raw (Serializer<(Any..Any?)>..Serializer<*>?) defined in com.esotericsoftware.kryo.factories.ReflectionSerializerFactory[JavaMethodDescriptor]

'kryo' @ [598:94] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.<init>[ValueParameterDescriptorImpl]

'java' @ [598:123] ==> public val <T> KClass<FieldSerializer<*>>.java: Class<FieldSerializer<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FieldSerializer<*>

'type' @ [598:129] ==> value-parameter type: Class<T> defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.<init>[ValueParameterDescriptorImpl]

'delegate' @ [601:9] ==> @Suppress private final val delegate: Serializer<Throwable> defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer[PropertyDescriptorImpl]

'write' @ [601:18] ==> public abstract fun write(p0: (Kryo..Kryo?), p1: (Output..Output?), p2: (Throwable..Throwable?)): Unit defined in com.esotericsoftware.kryo.Serializer[JavaMethodDescriptor]

'kryo' @ [601:24] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.write[ValueParameterDescriptorImpl]

'output' @ [601:30] ==> value-parameter output: Output defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.write[ValueParameterDescriptorImpl]

'throwable' @ [601:38] ==> value-parameter throwable: Throwable defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.write[ValueParameterDescriptorImpl]

'delegate' @ [605:29] ==> @Suppress private final val delegate: Serializer<Throwable> defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer[PropertyDescriptorImpl]

'read' @ [605:38] ==> public abstract fun read(p0: (Kryo..Kryo?), p1: (Input..Input?), p2: (Class<(Throwable..Throwable?)>..Class<(Throwable..Throwable?)>?)): (Throwable..Throwable?) defined in com.esotericsoftware.kryo.Serializer[JavaMethodDescriptor]

'kryo' @ [605:43] ==> value-parameter kryo: Kryo defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.read[ValueParameterDescriptorImpl]

'input' @ [605:49] ==> value-parameter input: Input defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.read[ValueParameterDescriptorImpl]

'type' @ [605:56] ==> value-parameter type: Class<Throwable> defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.read[ValueParameterDescriptorImpl]

'throwableRead' @ [606:12] ==> val throwableRead: (Throwable..Throwable?) defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.read[LocalVariableDescriptor]

'suppressed' @ [606:26] ==> public final val Throwable.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'isEmpty' @ [606:37] ==> @InlineOnly public inline fun <T> Array<out (Throwable..Throwable?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Throwable..kotlin.Throwable?)

'throwableRead' @ [607:13] ==> val throwableRead: (Throwable..Throwable?) defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.read[LocalVariableDescriptor]

'setSuppressedToSentinel' @ [607:27] ==> private final fun Throwable.setSuppressedToSentinel(): Unit defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer[SimpleFunctionDescriptorImpl]

'throwableRead' @ [609:16] ==> val throwableRead: (Throwable..Throwable?) defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.read[LocalVariableDescriptor]

'suppressedField' @ [612:55] ==> private final val suppressedField: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.Companion[PropertyDescriptorImpl]

'set' @ [612:71] ==> @CallerSensitive public open operator fun set(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in java.lang.reflect.Field[JavaMethodDescriptor]

'this' @ [612:75] ==> <this> defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.setSuppressedToSentinel[ReceiverParameterDescriptorImpl]

'sentinelValue' @ [612:81] ==> private final val sentinelValue: (Any..Any?) defined in net.corda.nodeapi.internal.serialization.ThrowableSerializer.Companion[PropertyDescriptorImpl]

