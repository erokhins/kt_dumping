'declaredType' @ [17:31] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'make' @ [17:111] ==> public final fun make(name: String, cl: ClassLoader = ...): Type defined in net.corda.nodeapi.internal.serialization.amqp.DeserializedParameterizedType.Companion[SimpleFunctionDescriptorImpl]

'declaredType' @ [17:116] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'toString' @ [17:129] ==> public open fun toString(): String defined in java.lang.reflect.ParameterizedType[DeserializedSimpleFunctionDescriptor]

'DESCRIPTOR_DOMAIN' @ [18:37] ==> public val DESCRIPTOR_DOMAIN: String defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[PropertyDescriptorImpl]

'fingerprintForType' @ [18:57] ==> internal fun fingerprintForType(type: Type, factory: SerializerFactory): String defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[SimpleFunctionDescriptorImpl]

'type' @ [18:76] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'factory' @ [18:82] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.<init>[ValueParameterDescriptorImpl]

'mapOf' @ [21:97] ==> public fun <K, V> mapOf(vararg pairs: Pair<Class<out Collection<*>>, (List<*>) -> Collection<*>>): Map<Class<out Collection<*>>, (List<*>) -> Collection<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Class<out Collection<*>>
    <V> -> Function1<List<*>, Collection<*>>

'to' @ [22:17] ==> public infix fun <A, B> Class<Collection<*>>.to(that: (List<*>) -> Collection<*>): Pair<Class<Collection<*>>, (List<*>) -> Collection<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<Collection<*>>
    <B> -> Function1<List<*>, Collection<*>>

'java' @ [22:35] ==> public val <T> KClass<Collection<*>>.java: Class<Collection<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Collection<*>

'unmodifiableCollection' @ [22:65] ==> public open fun <T : (Any..Any?)> unmodifiableCollection(p0: (MutableCollection<out Any?>..Collection<Any?>?)): (MutableCollection<Any?>..Collection<Any?>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any?

'list' @ [22:88] ==> value-parameter list: List<*> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'List' @ [23:17] ==> @SinceKotlin @InlineOnly public inline fun <T> List(size: Int, init: (index: Int) -> ???): List<???> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@6c3f7963

'java' @ [23:29] ==> public val <T> KClass<List<*>>.java: Class<List<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> List<*>

'unmodifiableList' @ [23:59] ==> public open fun <T : (Any..Any?)> unmodifiableList(p0: (MutableList<out Any?>..List<Any?>?)): (MutableList<Any?>..List<Any?>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any?

'list' @ [23:76] ==> value-parameter list: List<*> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [24:17] ==> public infix fun <A, B> Class<Set<*>>.to(that: (List<*>) -> Collection<*>): Pair<Class<Set<*>>, (List<*>) -> Collection<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<Set<*>>
    <B> -> Function1<List<*>, Collection<*>>

'java' @ [24:28] ==> public val <T> KClass<Set<*>>.java: Class<Set<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Set<*>

'unmodifiableSet' @ [24:58] ==> public open fun <T : (Any..Any?)> unmodifiableSet(p0: (MutableSet<out Any?>..Set<Any?>?)): (MutableSet<Any?>..Set<Any?>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any?

'LinkedHashSet' @ [24:74] ==> public final fun <E> <init>(p0: (MutableCollection<out Any?>..Collection<Any?>?)): LinkedHashSet<Any?> /* = LinkedHashSet<Any?> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Any?

'list' @ [24:88] ==> value-parameter list: List<*> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [25:17] ==> public infix fun <A, B> Class<SortedSet<*>>.to(that: (List<*>) -> Collection<*>): Pair<Class<SortedSet<*>>, (List<*>) -> Collection<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<SortedSet<*>>
    <B> -> Function1<List<*>, Collection<*>>

'java' @ [25:34] ==> public val <T> KClass<SortedSet<*>>.java: Class<SortedSet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SortedSet<*>

'unmodifiableSortedSet' @ [25:64] ==> public open fun <T : (Any..Any?)> unmodifiableSortedSet(p0: (SortedSet<Any?>..SortedSet<Any?>?)): (SortedSet<Any?>..SortedSet<Any?>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any?

'TreeSet' @ [25:86] ==> public constructor TreeSet<E : (Any..Any?)>(p0: (MutableCollection<out Any?>..Collection<Any?>?)) defined in java.util.TreeSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Any?

'list' @ [25:94] ==> value-parameter list: List<*> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'to' @ [26:17] ==> public infix fun <A, B> Class<NavigableSet<*>>.to(that: (List<*>) -> Collection<*>): Pair<Class<NavigableSet<*>>, (List<*>) -> Collection<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> Class<NavigableSet<*>>
    <B> -> Function1<List<*>, Collection<*>>

'java' @ [26:37] ==> public val <T> KClass<NavigableSet<*>>.java: Class<NavigableSet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NavigableSet<*>

'unmodifiableNavigableSet' @ [26:67] ==> public open fun <T : (Any..Any?)> unmodifiableNavigableSet(p0: (NavigableSet<Any?>..NavigableSet<Any?>?)): (NavigableSet<Any?>..NavigableSet<Any?>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any?

'TreeSet' @ [26:92] ==> public constructor TreeSet<E : (Any..Any?)>(p0: (MutableCollection<out Any?>..Collection<Any?>?)) defined in java.util.TreeSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Any?

'list' @ [26:100] ==> value-parameter list: List<*> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'NonEmptySet' @ [27:17] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'java' @ [27:36] ==> public val <T> KClass<NonEmptySet<*>>.java: Class<NonEmptySet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NonEmptySet<*>

'NonEmptySet' @ [27:54] ==> public companion object defined in net.corda.core.utilities.NonEmptySet[FakeCallableDescriptorForObject]

'copyOf' @ [27:66] ==> @JvmStatic public final fun <T> copyOf(elements: Collection<Any?>): NonEmptySet<Any?> defined in net.corda.core.utilities.NonEmptySet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'list' @ [27:73] ==> value-parameter list: List<*> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion.supportedTypes.<anonymous>[ValueParameterDescriptorImpl]

'supportedTypes' @ [31:20] ==> private final val supportedTypes: Map<Class<out Collection<*>>, (List<*>) -> Collection<*>> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion[PropertyDescriptorImpl]

'clazz' @ [31:35] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion.findConcreteType[ValueParameterDescriptorImpl]

'NotSerializableException' @ [31:51] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'clazz' @ [31:106] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion.findConcreteType[ValueParameterDescriptorImpl]

'findConcreteType' @ [35:63] ==> private final fun findConcreteType(clazz: Class<*>): (List<*>) -> Collection<*> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.Companion[SimpleFunctionDescriptorImpl]

'declaredType' @ [35:80] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'rawType' @ [35:93] ==> public final val ParameterizedType.rawType: (Type..Type?)[MyPropertyDescriptor]

'RestrictedType' @ [37:46] ==> public constructor RestrictedType(name: String, label: String?, provides: List<String>, source: String, descriptor: Descriptor, choices: List<Choice>) defined in net.corda.nodeapi.internal.serialization.amqp.RestrictedType[ClassConstructorDescriptorImpl]

'nameForType' @ [37:79] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'declaredType' @ [37:91] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'emptyList' @ [37:112] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'Descriptor' @ [37:133] ==> public constructor Descriptor(name: String?, code: UnsignedLong? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[ClassConstructorDescriptorImpl]

'typeDescriptor' @ [37:144] ==> public open val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'emptyList' @ [37:167] ==> public fun <T> emptyList(): List<Choice> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Choice

'output' @ [40:13] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.writeClassInfo[ValueParameterDescriptorImpl]

'writeTypeNotations' @ [40:20] ==> internal open fun writeTypeNotations(vararg typeNotation: TypeNotation): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'typeNotation' @ [40:39] ==> private final val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'output' @ [41:13] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.writeClassInfo[ValueParameterDescriptorImpl]

'requireSerializer' @ [41:20] ==> internal open fun requireSerializer(type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'declaredType' @ [41:38] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'actualTypeArguments' @ [41:51] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'data' @ [47:9] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.writeObject[ValueParameterDescriptorImpl]

'withDescribed' @ [47:14] ==> public fun Data.withDescribed(descriptor: Descriptor, block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'typeNotation' @ [47:28] ==> private final val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'descriptor' @ [47:41] ==> public abstract val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.TypeNotation[PropertyDescriptorImpl]

'withList' @ [48:13] ==> public fun Data.withList(block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'obj' @ [49:31] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.writeObject[ValueParameterDescriptorImpl]

'output' @ [50:21] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.writeObject[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [50:28] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'entry' @ [50:46] ==> val entry: Any? defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.writeObject.<anonymous>.<anonymous>[LocalVariableDescriptor]

'this' @ [50:53] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.writeObject.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'declaredType' @ [50:59] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'actualTypeArguments' @ [50:72] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

'invoke' @ [58:16] ==> public abstract operator fun invoke(p1: List<*>): Collection<*> defined in kotlin.Function1[FunctionInvokeDescriptor]

'obj' @ [58:33] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.readObject[ValueParameterDescriptorImpl]

'map' @ [58:49] ==> public inline fun <T, R> Iterable<Any?>.map(transform: (Any?) -> Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <R> -> Any?

'input' @ [58:55] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.readObject[ValueParameterDescriptorImpl]

'readObjectOrNull' @ [58:61] ==> internal final fun readObjectOrNull(obj: Any?, schema: Schema, type: Type): Any? defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'it' @ [58:78] ==> value-parameter it: Any? defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.readObject.<anonymous>[ValueParameterDescriptorImpl]

'schema' @ [58:82] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer.readObject[ValueParameterDescriptorImpl]

'declaredType' @ [58:90] ==> public final val declaredType: ParameterizedType defined in net.corda.nodeapi.internal.serialization.amqp.CollectionSerializer[PropertyDescriptorImpl]

'actualTypeArguments' @ [58:103] ==> public final val ParameterizedType.actualTypeArguments: (Array<(Type..Type?)>..Array<out (Type..Type?)>?)[MyPropertyDescriptor]

