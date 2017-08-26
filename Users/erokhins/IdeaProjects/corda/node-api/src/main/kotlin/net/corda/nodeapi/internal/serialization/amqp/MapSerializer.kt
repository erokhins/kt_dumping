'declaredType' @ [17:31] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'make' @ [17:111] ==> public final fun make(name: String, cl: ClassLoader = ...): Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializedParameterizedType.Companion[SimpleFunctionDescriptorImpl]

'declaredType' @ [17:116] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'toString' @ [17:129] ==> public open fun toString(): String defined in java.lang.reflect.ParameterizedType[DeserializedSimpleFunctionDescriptor]

'DESCRIPTOR_DOMAIN' @ [18:37] ==> public val DESCRIPTOR_DOMAIN: String defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[PropertyDescriptorImpl]

'fingerprintForType' @ [18:57] ==> internal fun fingerprintForType(type: Type, factory: SerializerFactory): String defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[SimpleFunctionDescriptorImpl]

'type' @ [18:76] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'factory' @ [18:82] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.<init>[ValueParameterDescriptorImpl]

'mapOf' @ [21:86] ==> public fun <K, V> mapOf(vararg pairs: Pair<Class<out Any?>, (Map<*, *>) -> Map<*, *>>): Map<Class<out Any?>, (Map<*, *>) -> Map<*, *>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<out Any?>
    <V> -> Function1<Map<*, *>, Map<*, *>>

'to' @ [23:17] ==> public infix fun <A, B> Class<Map<*, *>>.to(that: (Map<*, *>) -> Map<*, *>): Pair<Class<Map<*, *>>, (Map<*, *>) -> Map<*, *>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<Map<*, *>>
    <B> -> Function1<Map<*, *>, Map<*, *>>

'java' @ [23:28] ==> public val <T> KClass<Map<*, *>>.java: Class<Map<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Map<*, *>

'unmodifiableMap' @ [23:57] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> unmodifiableMap(p0: (MutableMap<out Any?, out Any?>..Map<out Any?, Any?>?)): (MutableMap<Any?, Any?>..Map<Any?, Any?>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any?
    <V : (Any..Any?)> -> Any?

'map' @ [23:73] ==> value-parameter map: Map<*, *> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [24:17] ==> public infix fun <A, B> Class<SortedMap<*, *>>.to(that: (Map<*, *>) -> Map<*, *>): Pair<Class<SortedMap<*, *>>, (Map<*, *>) -> Map<*, *>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<SortedMap<*, *>>
    <B> -> Function1<Map<*, *>, Map<*, *>>

'java' @ [24:34] ==> public val <T> KClass<SortedMap<*, *>>.java: Class<SortedMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SortedMap<*, *>

'unmodifiableSortedMap' @ [24:63] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> unmodifiableSortedMap(p0: (SortedMap<Any?, out Any?>..SortedMap<Any?, out Any?>?)): (SortedMap<Any?, Any?>..SortedMap<Any?, Any?>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any?
    <V : (Any..Any?)> -> Any?

'TreeMap' @ [24:85] ==> public constructor TreeMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out Any?, out Any?>..Map<out Any?, Any?>?)) defined in java.util.TreeMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any?
    <V : (Any..Any?)> -> Any?

'map' @ [24:93] ==> value-parameter map: Map<*, *> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [25:17] ==> public infix fun <A, B> Class<NavigableMap<*, *>>.to(that: (Map<*, *>) -> Map<*, *>): Pair<Class<NavigableMap<*, *>>, (Map<*, *>) -> Map<*, *>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<NavigableMap<*, *>>
    <B> -> Function1<Map<*, *>, Map<*, *>>

'java' @ [25:37] ==> public val <T> KClass<NavigableMap<*, *>>.java: Class<NavigableMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NavigableMap<*, *>

'unmodifiableNavigableMap' @ [25:66] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> unmodifiableNavigableMap(p0: (NavigableMap<Any?, out Any?>..NavigableMap<Any?, out Any?>?)): (NavigableMap<Any?, Any?>..NavigableMap<Any?, Any?>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any?
    <V : (Any..Any?)> -> Any?

'TreeMap' @ [25:91] ==> public constructor TreeMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out Any?, out Any?>..Map<out Any?, Any?>?)) defined in java.util.TreeMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any?
    <V : (Any..Any?)> -> Any?

'map' @ [25:99] ==> value-parameter map: Map<*, *> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [27:17] ==> public final fun <K, V> <init>(): LinkedHashMap<???, ???> /* = LinkedHashMap<???, ???> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@1cd85f70
    <V> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@20dd059a

'java' @ [27:38] ==> public val <T> KClass<LinkedHashMap<*, *>>.java: Class<LinkedHashMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LinkedHashMap<*, *>

'LinkedHashMap' @ [27:55] ==> public final fun <K, V> <init>(p0: (MutableMap<out Any?, out Any?>..Map<out Any?, Any?>?)): LinkedHashMap<Any?, Any?> /* = LinkedHashMap<Any?, Any?> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'map' @ [27:69] ==> value-parameter map: Map<*, *> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'TreeMap' @ [28:17] ==> public constructor TreeMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.TreeMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@6d03e225
    <V : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@60df63af

'java' @ [28:32] ==> public val <T> KClass<TreeMap<*, *>>.java: Class<TreeMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TreeMap<*, *>

'TreeMap' @ [28:49] ==> public constructor TreeMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out Any?, out Any?>..Map<out Any?, Any?>?)) defined in java.util.TreeMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Any?
    <V : (Any..Any?)> -> Any?

'map' @ [28:57] ==> value-parameter map: Map<*, *> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'supportedTypes' @ [31:20] ==> private final val supportedTypes: Map<Class<out Any?>, (Map<*, *>) -> Map<*, *>> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.Companion[PropertyDescriptorImpl]

'clazz' @ [31:35] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.Companion.findConcreteType[ValueParameterDescriptorImpl]

'NotSerializableException' @ [31:51] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'clazz' @ [31:99] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.Companion.findConcreteType[ValueParameterDescriptorImpl]

'findConcreteType' @ [35:61] ==> private final fun findConcreteType(clazz: Class<*>): (Map<*, *>) -> Map<*, *> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.Companion[SimpleFunctionDescriptorImpl]

'declaredType' @ [35:78] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'rawType' @ [35:91] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'RestrictedType' @ [37:46] ==> public constructor RestrictedType(name: String, label: String?, provides: List<String>, source: String, descriptor: Descriptor, choices: List<Choice>) defined in net.corda.nodeapi.internal.serialization.amqp.RestrictedType[ClassConstructorDescriptorImpl]

'nameForType' @ [37:79] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'declaredType' @ [37:91] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'emptyList' @ [37:112] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Descriptor' @ [37:132] ==> public constructor Descriptor(name: String?, code: UnsignedLong? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[ClassConstructorDescriptorImpl]

'typeDescriptor' @ [37:143] ==> public open val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'emptyList' @ [37:166] ==> public fun <T> emptyList(): List<Choice> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Choice

'output' @ [40:13] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeClassInfo[ValueParameterDescriptorImpl]

'writeTypeNotations' @ [40:20] ==> internal open fun writeTypeNotations(vararg typeNotation: TypeNotation): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'typeNotation' @ [40:39] ==> private final val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'output' @ [41:13] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeClassInfo[ValueParameterDescriptorImpl]

'requireSerializer' @ [41:20] ==> internal open fun requireSerializer(type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'declaredType' @ [41:38] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'actualTypeArguments' @ [41:51] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'output' @ [42:13] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeClassInfo[ValueParameterDescriptorImpl]

'requireSerializer' @ [42:20] ==> internal open fun requireSerializer(type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'declaredType' @ [42:38] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'actualTypeArguments' @ [42:51] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'obj' @ [47:9] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'javaClass' @ [47:13] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'checkNotUnsupportedHashMap' @ [47:23] ==> internal fun Class<*>.checkNotUnsupportedHashMap(): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file MapSerializer.kt[SimpleFunctionDescriptorImpl]

'data' @ [49:9] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'withDescribed' @ [49:14] ==> public fun Data.withDescribed(descriptor: Descriptor, block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'typeNotation' @ [49:28] ==> private final val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'descriptor' @ [49:41] ==> public abstract val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.TypeNotation[PropertyDescriptorImpl]

'data' @ [51:13] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'putMap' @ [51:18] ==> public abstract fun putMap(): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'data' @ [52:13] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'enter' @ [52:18] ==> public abstract fun enter(): Boolean defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'component1' @ [53:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Any?, Any?>.component1(): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'component2' @ [53:24] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Any?, Any?>.component2(): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'obj' @ [53:34] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'output' @ [54:17] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [54:24] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'key' @ [54:42] ==> val key: Any? defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject.<anonymous>[LocalVariableDescriptor]

'data' @ [54:47] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'declaredType' @ [54:53] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'actualTypeArguments' @ [54:66] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'output' @ [55:17] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [55:24] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'value' @ [55:42] ==> val value: Any? defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject.<anonymous>[LocalVariableDescriptor]

'data' @ [55:49] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'declaredType' @ [55:55] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'actualTypeArguments' @ [55:68] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'data' @ [57:13] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.writeObject[ValueParameterDescriptorImpl]

'exit' @ [57:18] ==> public abstract fun exit(): Boolean defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'obj' @ [63:52] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readObject[ValueParameterDescriptorImpl]

'map' @ [63:70] ==> public inline fun <K, V, R> Map<out Any?, Any?>.map(transform: (Map.Entry<Any?, Any?>) -> Pair<Any?, Any?>): List<Pair<Any?, Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Any?
    <R> -> Pair<Any?, Any?>

'readEntry' @ [63:76] ==> private final fun readEntry(schema: Schema, input: DeserializationInput, entry: Map.Entry<Any?, Any?>): Pair<Any?, Any?> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[SimpleFunctionDescriptorImpl]

'schema' @ [63:86] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readObject[ValueParameterDescriptorImpl]

'input' @ [63:94] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readObject[ValueParameterDescriptorImpl]

'it' @ [63:101] ==> value-parameter it: Map.Entry<Any?, Any?> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readObject.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [64:16] ==> public abstract operator fun invoke(p1: Map<*, *>): Map<*, *> defined in kotlin.Function1[FunctionInvokeDescriptor]

'entries' @ [64:32] ==> val entries: Iterable<Pair<Any?, Any?>> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readObject[LocalVariableDescriptor]

'toMap' @ [64:40] ==> public fun <K, V> Iterable<Pair<Any?, Any?>>.toMap(): Map<Any?, Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Any?
    <V> -> Any?

'input' @ [68:13] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readEntry[ValueParameterDescriptorImpl]

'readObjectOrNull' @ [68:19] ==> internal final fun readObjectOrNull(obj: Any?, schema: Schema, type: Type): Any? defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'entry' @ [68:36] ==> value-parameter entry: Map.Entry<Any?, Any?> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readEntry[ValueParameterDescriptorImpl]

'key' @ [68:42] ==> public abstract val key: Any? defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'schema' @ [68:47] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readEntry[ValueParameterDescriptorImpl]

'declaredType' @ [68:55] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'actualTypeArguments' @ [68:68] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'input' @ [69:21] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readEntry[ValueParameterDescriptorImpl]

'readObjectOrNull' @ [69:27] ==> internal final fun readObjectOrNull(obj: Any?, schema: Schema, type: Type): Any? defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'entry' @ [69:44] ==> value-parameter entry: Map.Entry<Any?, Any?> defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readEntry[ValueParameterDescriptorImpl]

'value' @ [69:50] ==> public abstract val value: Any? defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'schema' @ [69:57] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer.readEntry[ValueParameterDescriptorImpl]

'declaredType' @ [69:65] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.MapSerializer[PropertyDescriptorImpl]

'actualTypeArguments' @ [69:78] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'if (HashMap::class.java.isAssignableFrom(this) && !LinkedHashMap::class.java.isAssignableFrom(this)) {
        throw IllegalArgumentException(
                "Map type $this is unstable under iteration. Suggested fix: use java.util.LinkedHashMap instead.")
    }
    else if (WeakHashMap::class.java.isAssignableFrom(this)) {
        throw IllegalArgumentException ("Weak references with map types not supported. Suggested fix: "
                                        + "use java.util.LinkedHashMap instead.")
    }
    else if (Dictionary::class.java.isAssignableFrom(this)) {
        throw IllegalArgumentException (
                "Unable to serialise deprecated type $this. Suggested fix: prefer java.util.map implementations")
    }' @ [73:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'HashMap' @ [73:9] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@3e22931b
    <V : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@769ba090

'java' @ [73:24] ==> public val <T> KClass<HashMap<*, *>>.java: Class<HashMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> HashMap<*, *>

'isAssignableFrom' @ [73:29] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'this' @ [73:46] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.checkNotUnsupportedHashMap[ReceiverParameterDescriptorImpl]

'!' @ [73:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'LinkedHashMap' @ [73:56] ==> public final fun <K, V> <init>(): LinkedHashMap<???, ???> /* = LinkedHashMap<???, ???> */ defined in kotlin.collections.LinkedHashMap[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <K> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@4fb66ac
    <V> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@1fa2af87

'java' @ [73:77] ==> public val <T> KClass<LinkedHashMap<*, *>>.java: Class<LinkedHashMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LinkedHashMap<*, *>

'isAssignableFrom' @ [73:82] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'this' @ [73:99] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.checkNotUnsupportedHashMap[ReceiverParameterDescriptorImpl]

'IllegalArgumentException' @ [74:15] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'this' @ [75:28] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.checkNotUnsupportedHashMap[ReceiverParameterDescriptorImpl]

'if (WeakHashMap::class.java.isAssignableFrom(this)) {
        throw IllegalArgumentException ("Weak references with map types not supported. Suggested fix: "
                                        + "use java.util.LinkedHashMap instead.")
    }
    else if (Dictionary::class.java.isAssignableFrom(this)) {
        throw IllegalArgumentException (
                "Unable to serialise deprecated type $this. Suggested fix: prefer java.util.map implementations")
    }' @ [77:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'WeakHashMap' @ [77:14] ==> public constructor WeakHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.WeakHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@35b25d23
    <V : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@1e06f425

'java' @ [77:33] ==> public val <T> KClass<WeakHashMap<*, *>>.java: Class<WeakHashMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> WeakHashMap<*, *>

'isAssignableFrom' @ [77:38] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'this' @ [77:55] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.checkNotUnsupportedHashMap[ReceiverParameterDescriptorImpl]

'IllegalArgumentException' @ [78:15] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'+' @ [78:41] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'Dictionary' @ [81:14] ==> public constructor Dictionary<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.Dictionary[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@41972f4f
    <V : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@4b437e6d

'java' @ [81:32] ==> public val <T> KClass<Dictionary<*, *>>.java: Class<Dictionary<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Dictionary<*, *>

'isAssignableFrom' @ [81:37] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'this' @ [81:54] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.checkNotUnsupportedHashMap[ReceiverParameterDescriptorImpl]

'IllegalArgumentException' @ [82:15] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'this' @ [83:55] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.checkNotUnsupportedHashMap[ReceiverParameterDescriptorImpl]

