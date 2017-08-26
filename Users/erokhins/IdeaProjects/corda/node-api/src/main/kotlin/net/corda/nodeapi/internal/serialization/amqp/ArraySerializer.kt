'when (type) {
            Array<Char>::class.java -> CharArraySerializer(factory)
            else -> ArraySerializer(type, factory)
        }' @ [12:60] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ArraySerializer, entry1: ArraySerializer): ArraySerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ArraySerializer

'type' @ [12:66] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.Companion.make[ValueParameterDescriptorImpl]

'Array' @ [13:13] ==> public constructor Array<T>(size: Int, init: (Int) -> ???) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@45311f1d

'java' @ [13:32] ==> public val <T> KClass<Array<Char>>.java: Class<Array<Char>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Array<Char>

'CharArraySerializer' @ [13:40] ==> public constructor CharArraySerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer[ClassConstructorDescriptorImpl]

'factory' @ [13:60] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.Companion.make[ValueParameterDescriptorImpl]

'ArraySerializer' @ [14:21] ==> public constructor ArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[ClassConstructorDescriptorImpl]

'type' @ [14:37] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.Companion.make[ValueParameterDescriptorImpl]

'factory' @ [14:43] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.Companion.make[ValueParameterDescriptorImpl]

'if (type.componentType().isArray()) {
            val typeName = calcTypeName(type.componentType()); "$typeName[]"
        }
        else {
            val arrayType = if (type.asClass()!!.componentType.isPrimitive) "[p]" else "[]"
            "${type.componentType().typeName}$arrayType"
        }' @ [26:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'type' @ [26:13] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.calcTypeName[ValueParameterDescriptorImpl]

'componentType' @ [26:18] ==> internal fun Type.componentType(): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'isArray' @ [26:34] ==> internal fun Type.isArray(): Boolean defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'calcTypeName' @ [27:28] ==> private final fun calcTypeName(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[SimpleFunctionDescriptorImpl]

'type' @ [27:41] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.calcTypeName[ValueParameterDescriptorImpl]

'componentType' @ [27:46] ==> internal fun Type.componentType(): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'typeName' @ [27:66] ==> val typeName: String defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.calcTypeName[LocalVariableDescriptor]

'if (type.asClass()!!.componentType.isPrimitive) "[p]" else "[]"' @ [30:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'type' @ [30:33] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.calcTypeName[ValueParameterDescriptorImpl]

'asClass' @ [30:38] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'componentType' @ [30:50] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.componentType: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'isPrimitive' @ [30:64] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'type' @ [31:16] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.calcTypeName[ValueParameterDescriptorImpl]

'componentType' @ [31:21] ==> internal fun Type.componentType(): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'typeName' @ [31:37] ==> public final val Type.typeName: (String..String?)[MyPropertyDescriptor]

'arrayType' @ [31:47] ==> val arrayType: String defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.calcTypeName[LocalVariableDescriptor]

'getValue' @ [34:36] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'DESCRIPTOR_DOMAIN' @ [34:45] ==> public val DESCRIPTOR_DOMAIN: String defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[PropertyDescriptorImpl]

'fingerprintForType' @ [34:65] ==> internal fun fingerprintForType(type: Type, factory: SerializerFactory): String defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[SimpleFunctionDescriptorImpl]

'type' @ [34:84] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'factory' @ [34:90] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.<init>[ValueParameterDescriptorImpl]

'getValue' @ [35:39] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'type' @ [35:46] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'componentType' @ [35:51] ==> internal fun Type.componentType(): Type defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'getValue' @ [36:35] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'calcTypeName' @ [36:42] ==> private final fun calcTypeName(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[SimpleFunctionDescriptorImpl]

'type' @ [36:55] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'getValue' @ [38:48] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'RestrictedType' @ [39:9] ==> public constructor RestrictedType(name: String, label: String?, provides: List<String>, source: String, descriptor: Descriptor, choices: List<Choice>) defined in net.corda.nodeapi.internal.serialization.amqp.RestrictedType[ClassConstructorDescriptorImpl]

'typeName' @ [39:24] ==> internal open val typeName: String defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'emptyList' @ [39:40] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Descriptor' @ [39:61] ==> public constructor Descriptor(name: String?, code: UnsignedLong? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[ClassConstructorDescriptorImpl]

'typeDescriptor' @ [39:72] ==> public open val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'emptyList' @ [39:95] ==> public fun <T> emptyList(): List<Choice> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Choice

'output' @ [43:13] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.writeClassInfo[ValueParameterDescriptorImpl]

'writeTypeNotations' @ [43:20] ==> internal open fun writeTypeNotations(vararg typeNotation: TypeNotation): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'typeNotation' @ [43:39] ==> internal final val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'output' @ [44:13] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.writeClassInfo[ValueParameterDescriptorImpl]

'requireSerializer' @ [44:20] ==> internal open fun requireSerializer(type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'elementType' @ [44:38] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'data' @ [50:9] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.writeObject[ValueParameterDescriptorImpl]

'withDescribed' @ [50:14] ==> public fun Data.withDescribed(descriptor: Descriptor, block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'typeNotation' @ [50:28] ==> internal final val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'descriptor' @ [50:41] ==> public abstract val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.TypeNotation[PropertyDescriptorImpl]

'withList' @ [51:13] ==> public fun Data.withList(block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'obj' @ [52:31] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.writeObject[ValueParameterDescriptorImpl]

'output' @ [53:21] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [53:28] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'entry' @ [53:46] ==> val entry: Any? defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.writeObject.<anonymous>.<anonymous>[LocalVariableDescriptor]

'this' @ [53:53] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.writeObject.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'elementType' @ [53:59] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'if (obj is List<*>) {
            return obj.map { input.readObjectOrNull(it, schema, elementType) }.toArrayOfType(elementType)
        } else throw NotSerializableException("Expected a List but found $obj")' @ [60:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'obj' @ [60:13] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.readObject[ValueParameterDescriptorImpl]

'obj' @ [61:20] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.readObject[ValueParameterDescriptorImpl]

'map' @ [61:24] ==> public inline fun <T, R> Iterable<Any?>.map(transform: (Any?) -> Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <R> -> Any?

'input' @ [61:30] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.readObject[ValueParameterDescriptorImpl]

'readObjectOrNull' @ [61:36] ==> internal final fun readObjectOrNull(obj: Any?, schema: Schema, type: Type): Any? defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'it' @ [61:53] ==> value-parameter it: Any? defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.readObject.<anonymous>[ValueParameterDescriptorImpl]

'schema' @ [61:57] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.readObject[ValueParameterDescriptorImpl]

'elementType' @ [61:65] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'toArrayOfType' @ [61:80] ==> public open fun <T> List<Any?>.toArrayOfType(type: Type): Any defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'elementType' @ [61:94] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[PropertyDescriptorImpl]

'NotSerializableException' @ [62:22] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'obj' @ [62:75] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.readObject[ValueParameterDescriptorImpl]

'type' @ [66:27] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.toArrayOfType[ValueParameterDescriptorImpl]

'asClass' @ [66:32] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'NotSerializableException' @ [66:51] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'type' @ [66:108] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.toArrayOfType[ValueParameterDescriptorImpl]

'this' @ [67:20] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.toArrayOfType[ReceiverParameterDescriptorImpl]

'newInstance' @ [68:40] ==> public open fun newInstance(p0: (Class<*>..Class<*>?), p1: Int): (Any..Any?) defined in java.lang.reflect.Array[JavaMethodDescriptor]

'elementType' @ [68:52] ==> val elementType: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.toArrayOfType[LocalVariableDescriptor]

'this' @ [68:65] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.toArrayOfType[ReceiverParameterDescriptorImpl]

'size' @ [68:70] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'apply' @ [68:76] ==> @InlineOnly public inline fun <T> (Any..Any?).apply(block: (Any..Any?).() -> Unit): (Any..Any?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'..' @ [69:14] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [69:17] ==> public val <T> List<T>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'forEach' @ [69:28] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'set' @ [69:62] ==> public open fun set(p0: (Any..Any?), p1: Int, p2: (Any..Any?)): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'this' @ [69:66] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.toArrayOfType.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [69:72] ==> value-parameter it: Int defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.toArrayOfType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'list' @ [69:76] ==> val list: List<T> defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.toArrayOfType[LocalVariableDescriptor]

'it' @ [69:81] ==> value-parameter it: Int defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer.toArrayOfType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ArraySerializer' @ [76:57] ==> public constructor ArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[ClassConstructorDescriptorImpl]

'Array' @ [76:73] ==> public constructor Array<T>(size: Int, init: (Int) -> ???) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@3da4ada3

'java' @ [76:92] ==> public val <T> KClass<Array<Char>>.java: Class<Array<Char>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Array<Char>

'factory' @ [76:98] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.<init>[ValueParameterDescriptorImpl]

'type' @ [78:27] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.toArrayOfType[ValueParameterDescriptorImpl]

'asClass' @ [78:32] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'NotSerializableException' @ [78:51] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'type' @ [78:108] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.toArrayOfType[ValueParameterDescriptorImpl]

'this' @ [79:20] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.toArrayOfType[ReceiverParameterDescriptorImpl]

'newInstance' @ [80:40] ==> public open fun newInstance(p0: (Class<*>..Class<*>?), p1: Int): (Any..Any?) defined in java.lang.reflect.Array[JavaMethodDescriptor]

'elementType' @ [80:52] ==> val elementType: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.toArrayOfType[LocalVariableDescriptor]

'this' @ [80:65] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.toArrayOfType[ReceiverParameterDescriptorImpl]

'size' @ [80:70] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'apply' @ [80:76] ==> @InlineOnly public inline fun <T> (Any..Any?).apply(block: (Any..Any?).() -> Unit): (Any..Any?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'..' @ [81:14] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [81:17] ==> public val <T> List<T>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'forEach' @ [81:28] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'set' @ [81:62] ==> public open fun set(p0: (Any..Any?), p1: Int, p2: (Any..Any?)): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'this' @ [81:66] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.toArrayOfType.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [81:72] ==> value-parameter it: Int defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.toArrayOfType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'list' @ [81:77] ==> val list: List<T> defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.toArrayOfType[LocalVariableDescriptor]

'it' @ [81:82] ==> value-parameter it: Int defined in net.corda.nodeapi.internal.serialization.amqp.CharArraySerializer.toArrayOfType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toChar' @ [81:94] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'ArraySerializer' @ [87:78] ==> public constructor ArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.ArraySerializer[ClassConstructorDescriptorImpl]

'type' @ [87:94] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.<init>[ValueParameterDescriptorImpl]

'factory' @ [87:100] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.<init>[ValueParameterDescriptorImpl]

'mapOf' @ [91:80] ==> public fun <K, V> mapOf(vararg pairs: Pair<Type, (SerializerFactory) -> PrimArraySerializer>): Map<Type, (SerializerFactory) -> PrimArraySerializer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Type
    <V> -> Function1<SerializerFactory, PrimArraySerializer>

'to' @ [92:17] ==> public infix fun <A, B> Class<IntArray>.to(that: (SerializerFactory) -> PrimArraySerializer): Pair<Class<IntArray>, (SerializerFactory) -> PrimArraySerializer> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<IntArray>
    <B> -> Function1<SerializerFactory, PrimArraySerializer>

'java' @ [92:33] ==> public val <T> KClass<IntArray>.java: Class<IntArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntArray

'PrimIntArraySerializer' @ [92:48] ==> public constructor PrimIntArraySerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimIntArraySerializer[ClassConstructorDescriptorImpl]

'f' @ [92:71] ==> value-parameter f: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion.primTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [93:17] ==> public infix fun <A, B> Class<CharArray>.to(that: (SerializerFactory) -> PrimArraySerializer): Pair<Class<CharArray>, (SerializerFactory) -> PrimArraySerializer> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<CharArray>
    <B> -> Function1<SerializerFactory, PrimArraySerializer>

'java' @ [93:34] ==> public val <T> KClass<CharArray>.java: Class<CharArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CharArray

'PrimCharArraySerializer' @ [93:49] ==> public constructor PrimCharArraySerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer[ClassConstructorDescriptorImpl]

'f' @ [93:73] ==> value-parameter f: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion.primTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [94:17] ==> public infix fun <A, B> Class<BooleanArray>.to(that: (SerializerFactory) -> PrimArraySerializer): Pair<Class<BooleanArray>, (SerializerFactory) -> PrimArraySerializer> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<BooleanArray>
    <B> -> Function1<SerializerFactory, PrimArraySerializer>

'java' @ [94:37] ==> public val <T> KClass<BooleanArray>.java: Class<BooleanArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BooleanArray

'PrimBooleanArraySerializer' @ [94:52] ==> public constructor PrimBooleanArraySerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimBooleanArraySerializer[ClassConstructorDescriptorImpl]

'f' @ [94:79] ==> value-parameter f: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion.primTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [95:17] ==> public infix fun <A, B> Class<FloatArray>.to(that: (SerializerFactory) -> PrimArraySerializer): Pair<Class<FloatArray>, (SerializerFactory) -> PrimArraySerializer> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<FloatArray>
    <B> -> Function1<SerializerFactory, PrimArraySerializer>

'java' @ [95:35] ==> public val <T> KClass<FloatArray>.java: Class<FloatArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FloatArray

'PrimFloatArraySerializer' @ [95:50] ==> public constructor PrimFloatArraySerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimFloatArraySerializer[ClassConstructorDescriptorImpl]

'f' @ [95:75] ==> value-parameter f: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion.primTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [96:17] ==> public infix fun <A, B> Class<ShortArray>.to(that: (SerializerFactory) -> PrimArraySerializer): Pair<Class<ShortArray>, (SerializerFactory) -> PrimArraySerializer> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<ShortArray>
    <B> -> Function1<SerializerFactory, PrimArraySerializer>

'java' @ [96:35] ==> public val <T> KClass<ShortArray>.java: Class<ShortArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ShortArray

'PrimShortArraySerializer' @ [96:50] ==> public constructor PrimShortArraySerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimShortArraySerializer[ClassConstructorDescriptorImpl]

'f' @ [96:75] ==> value-parameter f: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion.primTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [97:17] ==> public infix fun <A, B> Class<DoubleArray>.to(that: (SerializerFactory) -> PrimArraySerializer): Pair<Class<DoubleArray>, (SerializerFactory) -> PrimArraySerializer> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<DoubleArray>
    <B> -> Function1<SerializerFactory, PrimArraySerializer>

'java' @ [97:36] ==> public val <T> KClass<DoubleArray>.java: Class<DoubleArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DoubleArray

'PrimDoubleArraySerializer' @ [97:51] ==> public constructor PrimDoubleArraySerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimDoubleArraySerializer[ClassConstructorDescriptorImpl]

'f' @ [97:77] ==> value-parameter f: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion.primTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [98:17] ==> public infix fun <A, B> Class<LongArray>.to(that: (SerializerFactory) -> PrimArraySerializer): Pair<Class<LongArray>, (SerializerFactory) -> PrimArraySerializer> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<LongArray>
    <B> -> Function1<SerializerFactory, PrimArraySerializer>

'java' @ [98:34] ==> public val <T> KClass<LongArray>.java: Class<LongArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LongArray

'PrimLongArraySerializer' @ [98:49] ==> public constructor PrimLongArraySerializer(factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimLongArraySerializer[ClassConstructorDescriptorImpl]

'f' @ [98:73] ==> value-parameter f: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion.primTypes.<anonymous>[ValueParameterDescriptorImpl]

'primTypes' @ [102:60] ==> public final val primTypes: Map<Type, (SerializerFactory) -> PrimArraySerializer> defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion[PropertyDescriptorImpl]

'type' @ [102:70] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion.make[ValueParameterDescriptorImpl]

'factory' @ [102:78] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.Companion.make[ValueParameterDescriptorImpl]

'data' @ [106:9] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer.localWriteObject[ValueParameterDescriptorImpl]

'withDescribed' @ [106:14] ==> public fun Data.withDescribed(descriptor: Descriptor, block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'typeNotation' @ [106:28] ==> internal final val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer[PropertyDescriptorImpl]

'descriptor' @ [106:41] ==> public abstract val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.TypeNotation[PropertyDescriptorImpl]

'withList' @ [106:55] ==> public fun Data.withList(block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'invoke' @ [106:66] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'PrimArraySerializer' @ [111:9] ==> public constructor PrimArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer[ClassConstructorDescriptorImpl]

'java' @ [111:45] ==> public val <T> KClass<IntArray>.java: Class<IntArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> IntArray

'factory' @ [111:51] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimIntArraySerializer.<init>[ValueParameterDescriptorImpl]

'localWriteObject' @ [113:9] ==> public final fun localWriteObject(data: Data, func: () -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp.PrimIntArraySerializer[SimpleFunctionDescriptorImpl]

'data' @ [113:26] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimIntArraySerializer.writeObject[ValueParameterDescriptorImpl]

'obj' @ [113:35] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.PrimIntArraySerializer.writeObject[ValueParameterDescriptorImpl]

'forEach' @ [113:52] ==> public inline fun IntArray.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'output' @ [113:62] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.PrimIntArraySerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [113:69] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'it' @ [113:87] ==> value-parameter it: Int defined in net.corda.nodeapi.internal.serialization.amqp.PrimIntArraySerializer.writeObject.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [113:91] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimIntArraySerializer.writeObject[ValueParameterDescriptorImpl]

'elementType' @ [113:97] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimIntArraySerializer[PropertyDescriptorImpl]

'PrimArraySerializer' @ [118:9] ==> public constructor PrimArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer[ClassConstructorDescriptorImpl]

'java' @ [118:46] ==> public val <T> KClass<CharArray>.java: Class<CharArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CharArray

'factory' @ [118:52] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.<init>[ValueParameterDescriptorImpl]

'localWriteObject' @ [120:9] ==> public final fun localWriteObject(data: Data, func: () -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer[SimpleFunctionDescriptorImpl]

'data' @ [120:26] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.writeObject[ValueParameterDescriptorImpl]

'obj' @ [120:35] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.writeObject[ValueParameterDescriptorImpl]

'forEach' @ [120:53] ==> public inline fun CharArray.forEach(action: (Char) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'output' @ [120:63] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [120:70] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'it' @ [120:88] ==> value-parameter it: Char defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.writeObject.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [120:92] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.writeObject[ValueParameterDescriptorImpl]

'elementType' @ [120:98] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer[PropertyDescriptorImpl]

'type' @ [124:27] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType[ValueParameterDescriptorImpl]

'asClass' @ [124:32] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'NotSerializableException' @ [124:51] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'type' @ [124:108] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType[ValueParameterDescriptorImpl]

'this' @ [125:20] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType[ReceiverParameterDescriptorImpl]

'newInstance' @ [126:40] ==> public open fun newInstance(p0: (Class<*>..Class<*>?), p1: Int): (Any..Any?) defined in java.lang.reflect.Array[JavaMethodDescriptor]

'elementType' @ [126:52] ==> val elementType: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType[LocalVariableDescriptor]

'this' @ [126:65] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType[ReceiverParameterDescriptorImpl]

'size' @ [126:70] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'apply' @ [126:76] ==> @InlineOnly public inline fun <T> (Any..Any?).apply(block: (Any..Any?).() -> Unit): (Any..Any?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'this' @ [127:25] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType.<anonymous>[ReceiverParameterDescriptorImpl]

'..' @ [128:14] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lastIndex' @ [128:17] ==> public val <T> List<T>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> T

'forEach' @ [128:28] ==> @HidesMembers public inline fun <T> Iterable<Int>.forEach(action: (Int) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'set' @ [128:62] ==> public open fun set(p0: (Any..Any?), p1: Int, p2: (Any..Any?)): Unit defined in java.lang.reflect.Array[JavaMethodDescriptor]

'array' @ [128:66] ==> val array: (Any..Any?) defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType.<anonymous>[LocalVariableDescriptor]

'it' @ [128:73] ==> value-parameter it: Int defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'list' @ [128:78] ==> val list: List<T> defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType[LocalVariableDescriptor]

'it' @ [128:83] ==> value-parameter it: Int defined in net.corda.nodeapi.internal.serialization.amqp.PrimCharArraySerializer.toArrayOfType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toChar' @ [128:95] ==> public open fun toChar(): Char defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'PrimArraySerializer' @ [134:9] ==> public constructor PrimArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer[ClassConstructorDescriptorImpl]

'java' @ [134:49] ==> public val <T> KClass<BooleanArray>.java: Class<BooleanArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BooleanArray

'factory' @ [134:55] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimBooleanArraySerializer.<init>[ValueParameterDescriptorImpl]

'localWriteObject' @ [136:9] ==> public final fun localWriteObject(data: Data, func: () -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp.PrimBooleanArraySerializer[SimpleFunctionDescriptorImpl]

'data' @ [136:26] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimBooleanArraySerializer.writeObject[ValueParameterDescriptorImpl]

'obj' @ [136:35] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.PrimBooleanArraySerializer.writeObject[ValueParameterDescriptorImpl]

'forEach' @ [136:56] ==> public inline fun BooleanArray.forEach(action: (Boolean) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'output' @ [136:66] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.PrimBooleanArraySerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [136:73] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'it' @ [136:91] ==> value-parameter it: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.PrimBooleanArraySerializer.writeObject.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [136:95] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimBooleanArraySerializer.writeObject[ValueParameterDescriptorImpl]

'elementType' @ [136:101] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimBooleanArraySerializer[PropertyDescriptorImpl]

'PrimArraySerializer' @ [141:9] ==> public constructor PrimArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer[ClassConstructorDescriptorImpl]

'java' @ [141:48] ==> public val <T> KClass<DoubleArray>.java: Class<DoubleArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DoubleArray

'factory' @ [141:54] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimDoubleArraySerializer.<init>[ValueParameterDescriptorImpl]

'localWriteObject' @ [143:9] ==> public final fun localWriteObject(data: Data, func: () -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp.PrimDoubleArraySerializer[SimpleFunctionDescriptorImpl]

'data' @ [143:26] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimDoubleArraySerializer.writeObject[ValueParameterDescriptorImpl]

'obj' @ [143:35] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.PrimDoubleArraySerializer.writeObject[ValueParameterDescriptorImpl]

'forEach' @ [143:55] ==> public inline fun DoubleArray.forEach(action: (Double) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'output' @ [143:65] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.PrimDoubleArraySerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [143:72] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'it' @ [143:90] ==> value-parameter it: Double defined in net.corda.nodeapi.internal.serialization.amqp.PrimDoubleArraySerializer.writeObject.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [143:94] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimDoubleArraySerializer.writeObject[ValueParameterDescriptorImpl]

'elementType' @ [143:100] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimDoubleArraySerializer[PropertyDescriptorImpl]

'PrimArraySerializer' @ [148:9] ==> public constructor PrimArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer[ClassConstructorDescriptorImpl]

'java' @ [148:47] ==> public val <T> KClass<FloatArray>.java: Class<FloatArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FloatArray

'factory' @ [148:53] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimFloatArraySerializer.<init>[ValueParameterDescriptorImpl]

'localWriteObject' @ [150:9] ==> public final fun localWriteObject(data: Data, func: () -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp.PrimFloatArraySerializer[SimpleFunctionDescriptorImpl]

'data' @ [150:26] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimFloatArraySerializer.writeObject[ValueParameterDescriptorImpl]

'obj' @ [150:35] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.PrimFloatArraySerializer.writeObject[ValueParameterDescriptorImpl]

'forEach' @ [150:54] ==> public inline fun FloatArray.forEach(action: (Float) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'output' @ [150:64] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.PrimFloatArraySerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [150:71] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'it' @ [150:89] ==> value-parameter it: Float defined in net.corda.nodeapi.internal.serialization.amqp.PrimFloatArraySerializer.writeObject.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [150:93] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimFloatArraySerializer.writeObject[ValueParameterDescriptorImpl]

'elementType' @ [150:99] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimFloatArraySerializer[PropertyDescriptorImpl]

'PrimArraySerializer' @ [155:9] ==> public constructor PrimArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer[ClassConstructorDescriptorImpl]

'java' @ [155:47] ==> public val <T> KClass<ShortArray>.java: Class<ShortArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ShortArray

'factory' @ [155:53] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimShortArraySerializer.<init>[ValueParameterDescriptorImpl]

'localWriteObject' @ [157:9] ==> public final fun localWriteObject(data: Data, func: () -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp.PrimShortArraySerializer[SimpleFunctionDescriptorImpl]

'data' @ [157:26] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimShortArraySerializer.writeObject[ValueParameterDescriptorImpl]

'obj' @ [157:35] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.PrimShortArraySerializer.writeObject[ValueParameterDescriptorImpl]

'forEach' @ [157:54] ==> public inline fun ShortArray.forEach(action: (Short) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'output' @ [157:64] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.PrimShortArraySerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [157:71] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'it' @ [157:89] ==> value-parameter it: Short defined in net.corda.nodeapi.internal.serialization.amqp.PrimShortArraySerializer.writeObject.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [157:93] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimShortArraySerializer.writeObject[ValueParameterDescriptorImpl]

'elementType' @ [157:99] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimShortArraySerializer[PropertyDescriptorImpl]

'PrimArraySerializer' @ [162:9] ==> public constructor PrimArraySerializer(type: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.PrimArraySerializer[ClassConstructorDescriptorImpl]

'java' @ [162:46] ==> public val <T> KClass<LongArray>.java: Class<LongArray> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LongArray

'factory' @ [162:52] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PrimLongArraySerializer.<init>[ValueParameterDescriptorImpl]

'localWriteObject' @ [164:9] ==> public final fun localWriteObject(data: Data, func: () -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp.PrimLongArraySerializer[SimpleFunctionDescriptorImpl]

'data' @ [164:26] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimLongArraySerializer.writeObject[ValueParameterDescriptorImpl]

'obj' @ [164:35] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.PrimLongArraySerializer.writeObject[ValueParameterDescriptorImpl]

'forEach' @ [164:53] ==> public inline fun LongArray.forEach(action: (Long) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'output' @ [164:63] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.PrimLongArraySerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [164:70] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'it' @ [164:88] ==> value-parameter it: Long defined in net.corda.nodeapi.internal.serialization.amqp.PrimLongArraySerializer.writeObject.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'data' @ [164:92] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PrimLongArraySerializer.writeObject[ValueParameterDescriptorImpl]

'elementType' @ [164:98] ==> internal final val elementType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PrimLongArraySerializer[PropertyDescriptorImpl]

