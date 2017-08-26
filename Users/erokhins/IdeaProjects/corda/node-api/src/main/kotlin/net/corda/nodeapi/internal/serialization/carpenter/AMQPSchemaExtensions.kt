'CarpenterSchemas' @ [8:15] ==> public companion object CarpenterSchemaConstructor defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[FakeCallableDescriptorForObject]

'newInstance' @ [8:32] ==> public final fun newInstance(): CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas.CarpenterSchemaConstructor[SimpleFunctionDescriptorImpl]

'types' @ [10:5] ==> public final val types: List<TypeNotation> defined in net.corda.nodeapi.internal.serialization.amqp.Schema[PropertyDescriptorImpl]

'filterIsInstance' @ [10:11] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CompositeType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CompositeType

'forEach' @ [10:45] ==> @HidesMembers public inline fun <T> Iterable<CompositeType>.forEach(action: (CompositeType) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompositeType

'it' @ [11:9] ==> value-parameter it: CompositeType defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema.<anonymous>[ValueParameterDescriptorImpl]

'carpenterSchema' @ [11:12] ==> public fun CompositeType.carpenterSchema(classloader: ClassLoader, carpenterSchemas: CarpenterSchemas, force: Boolean = ...): Unit defined in net.corda.nodeapi.internal.serialization.carpenter in file AMQPSchemaExtensions.kt[SimpleFunctionDescriptorImpl]

'classloader' @ [11:28] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ValueParameterDescriptorImpl]

'rtn' @ [11:60] ==> val rtn: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'rtn' @ [14:12] ==> val rtn: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'fields' @ [21:5] ==> public final val fields: List<Field> defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'forEach' @ [21:12] ==> @HidesMembers public inline fun <T> Iterable<Field>.forEach(action: (Field) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'!' @ [22:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [22:14] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.carpenter.validatePropertyTypes.<anonymous>[ValueParameterDescriptorImpl]

'validateType' @ [22:17] ==> public fun Field.validateType(classloader: ClassLoader): Boolean defined in net.corda.nodeapi.internal.serialization.carpenter[SimpleFunctionDescriptorImpl]

'classloader' @ [22:30] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.validatePropertyTypes[ValueParameterDescriptorImpl]

'UncarpentableException' @ [22:50] ==> public constructor UncarpentableException(name: String, field: String, type: String) defined in net.corda.nodeapi.internal.serialization.carpenter.UncarpentableException[ClassConstructorDescriptorImpl]

'name' @ [22:73] ==> public open val name: String defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'it' @ [22:79] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.carpenter.validatePropertyTypes.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [22:82] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'it' @ [22:88] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.carpenter.validatePropertyTypes.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [22:91] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'if (type == "*") requires[0] else type' @ [26:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'type' @ [26:36] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'requires' @ [26:49] ==> public final val requires: List<String> defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'type' @ [26:66] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'classloader' @ [43:9] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ValueParameterDescriptorImpl]

'exists' @ [43:21] ==> private fun ClassLoader.exists(clazz: String): Boolean defined in net.corda.nodeapi.internal.serialization.carpenter[SimpleFunctionDescriptorImpl]

'name' @ [43:28] ==> public open val name: String defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'validatePropertyTypes' @ [44:9] ==> private fun CompositeType.validatePropertyTypes(classloader: ClassLoader): Unit defined in net.corda.nodeapi.internal.serialization.carpenter in file AMQPSchemaExtensions.kt[SimpleFunctionDescriptorImpl]

'classloader' @ [44:31] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ValueParameterDescriptorImpl]

'!' @ [45:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'force' @ [45:14] ==> value-parameter force: Boolean = ... defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ValueParameterDescriptorImpl]

'mutableListOf' @ [48:24] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'provides' @ [52:5] ==> public open val provides: List<String> defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'forEach' @ [52:14] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'name' @ [53:13] ==> public open val name: String defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'it' @ [53:21] ==> value-parameter it: String defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema.<anonymous>[ValueParameterDescriptorImpl]

'isInterface' @ [54:13] ==> var isInterface: Boolean defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'providesList' @ [59:13] ==> val providesList: MutableList<Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'add' @ [59:26] ==> public abstract fun add(element: Class<*>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'classloader' @ [59:30] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ValueParameterDescriptorImpl]

'loadClass' @ [59:42] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'it' @ [59:52] ==> value-parameter it: String defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema.<anonymous>[ValueParameterDescriptorImpl]

'carpenterSchemas' @ [61:13] ==> value-parameter carpenterSchemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ValueParameterDescriptorImpl]

'addDepPair' @ [61:30] ==> public final fun addDepPair(type: TypeNotation, dependant: String, dependee: String): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[SimpleFunctionDescriptorImpl]

'this' @ [61:41] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ReceiverParameterDescriptorImpl]

'name' @ [61:47] ==> public open val name: String defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'it' @ [61:53] ==> value-parameter it: String defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema.<anonymous>[ValueParameterDescriptorImpl]

'isCreatable' @ [62:13] ==> var isCreatable: Boolean defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'mutableMapOf' @ [66:40] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, Field> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Field

'fields' @ [68:5] ==> public final val fields: List<Field> defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'forEach' @ [68:12] ==> @HidesMembers public inline fun <T> Iterable<Field>.forEach(action: (Field) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'm' @ [70:13] ==> val m: MutableMap<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'it' @ [70:15] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [70:18] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'FieldFactory' @ [70:26] ==> public object FieldFactory defined in net.corda.nodeapi.internal.serialization.carpenter in file Schema.kt[FakeCallableDescriptorForObject]

'newInstance' @ [70:39] ==> public final fun newInstance(mandatory: Boolean, name: String, field: Class<out Any?>): Field defined in net.corda.nodeapi.internal.serialization.carpenter.FieldFactory[SimpleFunctionDescriptorImpl]

'it' @ [70:51] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema.<anonymous>[ValueParameterDescriptorImpl]

'mandatory' @ [70:54] ==> public final val mandatory: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'it' @ [70:65] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [70:68] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'it' @ [70:74] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema.<anonymous>[ValueParameterDescriptorImpl]

'getTypeAsClass' @ [70:77] ==> public fun Field.getTypeAsClass(classloader: ClassLoader): Class<out Any> defined in net.corda.nodeapi.internal.serialization.carpenter[SimpleFunctionDescriptorImpl]

'classloader' @ [70:92] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ValueParameterDescriptorImpl]

'carpenterSchemas' @ [72:13] ==> value-parameter carpenterSchemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ValueParameterDescriptorImpl]

'addDepPair' @ [72:30] ==> public final fun addDepPair(type: TypeNotation, dependant: String, dependee: String): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[SimpleFunctionDescriptorImpl]

'this' @ [72:41] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ReceiverParameterDescriptorImpl]

'name' @ [72:47] ==> public open val name: String defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'it' @ [72:53] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema.<anonymous>[ValueParameterDescriptorImpl]

'typeAsString' @ [72:56] ==> public fun Field.typeAsString(): String defined in net.corda.nodeapi.internal.serialization.carpenter[SimpleFunctionDescriptorImpl]

'isCreatable' @ [73:13] ==> var isCreatable: Boolean defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'isCreatable' @ [77:9] ==> var isCreatable: Boolean defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'carpenterSchemas' @ [78:9] ==> value-parameter carpenterSchemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[ValueParameterDescriptorImpl]

'carpenterSchemas' @ [78:26] ==> public final val carpenterSchemas: MutableList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'add' @ [78:43] ==> public abstract fun add(element: Schema): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'CarpenterSchemaFactory' @ [78:47] ==> public object CarpenterSchemaFactory defined in net.corda.nodeapi.internal.serialization.carpenter in file Schema.kt[FakeCallableDescriptorForObject]

'newInstance' @ [78:70] ==> public final fun newInstance(name: String, fields: Map<String, Field>, superclass: Schema? = ..., interfaces: List<Class<*>> = ..., isInterface: Boolean = ...): Schema defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory[SimpleFunctionDescriptorImpl]

'name' @ [79:24] ==> public open val name: String defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'm' @ [80:26] ==> val m: MutableMap<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'providesList' @ [81:30] ==> val providesList: MutableList<Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'isInterface' @ [82:31] ==> var isInterface: Boolean defined in net.corda.nodeapi.internal.serialization.carpenter.carpenterSchema[LocalVariableDescriptor]

'mapOf' @ [88:66] ==> public fun <K, V> mapOf(vararg pairs: Pair<Pair<String, Boolean>, Class<out {Comparable<{Long & Boolean & Byte & Char & Short & Double & Float & Int}> & java.io.Serializable}>>): Map<Pair<String, Boolean>, Class<out {Comparable<{Long & Boolean & Byte & Char & Short & Double & Float & Int}> & java.io.Serializable}>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<String, Boolean>
    <V> -> Class<out {Comparable<{Long & Boolean & Byte & Char & Short & Double & Float & Int}> & java.io.Serializable}>

'Pair' @ [89:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Int' @ [89:30] ==> public companion object defined in kotlin.Int[FakeCallableDescriptorForObject]

'javaPrimitiveType' @ [89:41] ==> public val <T : Any> KClass<Int>.javaPrimitiveType: Class<Int>? defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Int

'Pair' @ [90:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'javaObjectType' @ [90:46] ==> public val <T : Any> KClass<Integer>.javaObjectType: Class<Integer> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Integer

'Pair' @ [91:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Short' @ [91:32] ==> public companion object defined in kotlin.Short[FakeCallableDescriptorForObject]

'javaPrimitiveType' @ [91:45] ==> public val <T : Any> KClass<Short>.javaPrimitiveType: Class<Short>? defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Short

'Pair' @ [92:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Short' @ [92:33] ==> public companion object defined in kotlin.Short[FakeCallableDescriptorForObject]

'javaObjectType' @ [92:46] ==> public val <T : Any> KClass<Short>.javaObjectType: Class<Short> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Short

'Pair' @ [93:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Long' @ [93:31] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'javaPrimitiveType' @ [93:43] ==> public val <T : Any> KClass<Long>.javaPrimitiveType: Class<Long>? defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Long

'Pair' @ [94:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Long' @ [94:32] ==> public companion object defined in kotlin.Long[FakeCallableDescriptorForObject]

'javaObjectType' @ [94:44] ==> public val <T : Any> KClass<Long>.javaObjectType: Class<Long> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Long

'Pair' @ [95:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Char' @ [95:31] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'javaPrimitiveType' @ [95:43] ==> public val <T : Any> KClass<Char>.javaPrimitiveType: Class<Char>? defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Char

'Pair' @ [96:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Character' @ [96:42] ==> public constructor Character(p0: Char) defined in java.lang.Character[JavaClassConstructorDescriptor]

'java' @ [96:59] ==> public val <T> KClass<Character>.java: Class<Character> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Character

'Pair' @ [97:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Boolean' @ [97:34] ==> private constructor Boolean() defined in kotlin.Boolean[DeserializedClassConstructorDescriptor]

'javaPrimitiveType' @ [97:49] ==> public val <T : Any> KClass<Boolean>.javaPrimitiveType: Class<Boolean>? defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Boolean

'Pair' @ [98:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Boolean' @ [98:35] ==> private constructor Boolean() defined in kotlin.Boolean[DeserializedClassConstructorDescriptor]

'javaObjectType' @ [98:50] ==> public val <T : Any> KClass<Boolean>.javaObjectType: Class<Boolean> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Boolean

'Pair' @ [99:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Double' @ [99:33] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'javaPrimitiveType' @ [99:47] ==> public val <T : Any> KClass<Double>.javaPrimitiveType: Class<Double>? defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Double

'Pair' @ [100:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Double' @ [100:34] ==> public companion object defined in kotlin.Double[FakeCallableDescriptorForObject]

'javaObjectType' @ [100:48] ==> public val <T : Any> KClass<Double>.javaObjectType: Class<Double> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Double

'Pair' @ [101:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Float' @ [101:32] ==> public companion object defined in kotlin.Float[FakeCallableDescriptorForObject]

'javaPrimitiveType' @ [101:45] ==> public val <T : Any> KClass<Float>.javaPrimitiveType: Class<Float>? defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Float

'Pair' @ [102:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Float' @ [102:33] ==> public companion object defined in kotlin.Float[FakeCallableDescriptorForObject]

'javaObjectType' @ [102:46] ==> public val <T : Any> KClass<Float>.javaObjectType: Class<Float> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Float

'Pair' @ [103:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Byte' @ [103:31] ==> public companion object defined in kotlin.Byte[FakeCallableDescriptorForObject]

'javaPrimitiveType' @ [103:43] ==> public val <T : Any> KClass<Byte>.javaPrimitiveType: Class<Byte>? defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Byte

'Pair' @ [104:9] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'Byte' @ [104:32] ==> public companion object defined in kotlin.Byte[FakeCallableDescriptorForObject]

'javaObjectType' @ [104:44] ==> public val <T : Any> KClass<Byte>.javaObjectType: Class<Byte> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Byte

'typeStrToType' @ [107:58] ==> public val typeStrToType: Map<Pair<String, Boolean>, Class<out Any?>> defined in net.corda.nodeapi.internal.serialization.carpenter in file AMQPSchemaExtensions.kt[PropertyDescriptorImpl]

'Pair' @ [107:72] ==> public constructor Pair<out A, out B>(first: String, second: Boolean) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> Boolean

'type' @ [107:77] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'mandatory' @ [107:83] ==> public final val mandatory: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'when (type) {
    "string" -> String::class.java
    "*" -> classloader.loadClass(requires[0])
    else -> classloader.loadClass(type)
}' @ [107:98] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<out Any>, entry1: Class<out Any>, entry2: Class<out Any>): Class<out Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<out Any>

'type' @ [107:104] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'String' @ [108:17] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [108:31] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'classloader' @ [109:12] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.getTypeAsClass[ValueParameterDescriptorImpl]

'loadClass' @ [109:24] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'requires' @ [109:34] ==> public final val requires: List<String> defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'classloader' @ [110:13] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.getTypeAsClass[ValueParameterDescriptorImpl]

'loadClass' @ [110:25] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'type' @ [110:35] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'when (type) {
    "byte", "int", "string", "short", "long", "char", "boolean", "double", "float" -> true
    "*" -> classloader.exists(requires[0])
    else -> classloader.exists(type)
}' @ [113:56] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'type' @ [113:62] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'classloader' @ [115:12] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.validateType[ValueParameterDescriptorImpl]

'exists' @ [115:24] ==> private fun ClassLoader.exists(clazz: String): Boolean defined in net.corda.nodeapi.internal.serialization.carpenter[SimpleFunctionDescriptorImpl]

'requires' @ [115:31] ==> public final val requires: List<String> defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'classloader' @ [116:13] ==> value-parameter classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.validateType[ValueParameterDescriptorImpl]

'exists' @ [116:25] ==> private fun ClassLoader.exists(clazz: String): Boolean defined in net.corda.nodeapi.internal.serialization.carpenter[SimpleFunctionDescriptorImpl]

'type' @ [116:32] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'run' @ [119:49] ==> @InlineOnly public inline fun <T, R> ClassLoader.run(block: ClassLoader.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassLoader
    <R> -> Boolean

'this' @ [120:11] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.exists.<anonymous>[ReceiverParameterDescriptorImpl]

'loadClass' @ [120:16] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'clazz' @ [120:26] ==> value-parameter clazz: String defined in net.corda.nodeapi.internal.serialization.carpenter.exists[ValueParameterDescriptorImpl]

