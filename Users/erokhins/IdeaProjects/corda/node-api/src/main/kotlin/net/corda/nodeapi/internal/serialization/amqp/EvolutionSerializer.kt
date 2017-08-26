'ObjectSerializer' @ [20:60] ==> public constructor ObjectSerializer(clazz: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.ObjectSerializer[ClassConstructorDescriptorImpl]

'clazz' @ [20:77] ==> value-parameter clazz: Type defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.<init>[ValueParameterDescriptorImpl]

'factory' @ [20:84] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [23:72] ==> public fun <T> emptyList(): List<PropertySerializer> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertySerializer

'property' @ [36:17] ==> public final val property: PropertySerializer defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.OldParam[PropertyDescriptorImpl]

'readProperty' @ [36:26] ==> public abstract fun readProperty(obj: Any?, schema: Schema, input: DeserializationInput): Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[SimpleFunctionDescriptorImpl]

'paramValues' @ [36:39] ==> value-parameter paramValues: List<*> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.OldParam.readProperty[ValueParameterDescriptorImpl]

'idx' @ [36:51] ==> public final val idx: Int defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.OldParam[PropertyDescriptorImpl]

'schema' @ [36:57] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.OldParam.readProperty[ValueParameterDescriptorImpl]

'input' @ [36:65] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.OldParam.readProperty[ValueParameterDescriptorImpl]

'type' @ [51:35] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[ValueParameterDescriptorImpl]

'asClass' @ [51:40] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'!' @ [52:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isConcrete' @ [52:18] ==> public fun isConcrete(clazz: Class<*>): Boolean defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'clazz' @ [52:29] ==> val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[LocalVariableDescriptor]

'oldArgs' @ [54:34] ==> value-parameter oldArgs: Map<String?, Type> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[ValueParameterDescriptorImpl]

'map' @ [54:42] ==> public inline fun <K, V, R> Map<out String?, Type>.map(transform: (Map.Entry<String?, Type>) -> Pair<String?, Type>): List<Pair<String?, Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String?
    <V> -> Type
    <R> -> Pair<String?, Type>

'Pair' @ [54:48] ==> public constructor Pair<out A, out B>(first: String?, second: Type) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String?
    <out B> -> Type

'it' @ [54:53] ==> value-parameter it: Map.Entry<String?, Type> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [54:56] ==> public abstract val key: String? defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [54:61] ==> value-parameter it: Map.Entry<String?, Type> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [54:64] ==> public abstract val value: Type defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'MIN_VALUE' @ [56:49] ==> public const final val MIN_VALUE: Int defined in java.lang.Integer[JavaPropertyDescriptor]

'clazz' @ [58:13] ==> val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[LocalVariableDescriptor]

'kotlin' @ [58:19] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(*)

'constructors' @ [58:26] ==> public abstract val constructors: Collection<KFunction<(Any..Any?)>> defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'forEach' @ [58:39] ==> @HidesMembers public inline fun <T> Iterable<KFunction<(Any..Any?)>>.forEach(action: (KFunction<(Any..Any?)>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<(kotlin.Any..kotlin.Any?)>

'it' @ [59:31] ==> value-parameter it: KFunction<(Any..Any?)> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor.<anonymous>[ValueParameterDescriptorImpl]

'findAnnotation' @ [59:34] ==> @SinceKotlin public inline fun <reified T : Annotation> KAnnotatedElement.findAnnotation(): DeprecatedConstructorForDeserialization? defined in kotlin.reflect.full[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Annotation> -> DeprecatedConstructorForDeserialization

'version' @ [59:93] ==> public final val version: Int defined in net.corda.core.serialization.DeprecatedConstructorForDeserialization[DeserializedPropertyDescriptor]

'MIN_VALUE' @ [59:112] ==> public const final val MIN_VALUE: Int defined in java.lang.Integer[JavaPropertyDescriptor]

'oldArgumentSet' @ [60:21] ==> val oldArgumentSet: List<Pair<String?, Type>> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[LocalVariableDescriptor]

'containsAll' @ [60:36] ==> public abstract fun containsAll(elements: Collection<Pair<String?, Type>>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'it' @ [60:48] ==> value-parameter it: KFunction<(Any..Any?)> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor.<anonymous>[ValueParameterDescriptorImpl]

'parameters' @ [60:51] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'map' @ [60:62] ==> public inline fun <T, R> Iterable<KParameter>.map(transform: (KParameter) -> Pair<String?, Type>): List<Pair<String?, Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter
    <R> -> Pair<String?, Type>

'Pair' @ [60:73] ==> public constructor Pair<out A, out B>(first: String?, second: Type) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String?
    <out B> -> Type

'v' @ [60:78] ==> value-parameter v: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [60:80] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'v' @ [60:86] ==> value-parameter v: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [60:88] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'javaType' @ [60:93] ==> public val KType.javaType: Type defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'version' @ [61:25] ==> val version: Int defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor.<anonymous>[LocalVariableDescriptor]

'maxConstructorVersion' @ [61:35] ==> var maxConstructorVersion: Int defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[LocalVariableDescriptor]

'constructor' @ [62:21] ==> var constructor: KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[LocalVariableDescriptor]

'it' @ [62:35] ==> value-parameter it: KFunction<(Any..Any?)> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor.<anonymous>[ValueParameterDescriptorImpl]

'maxConstructorVersion' @ [63:21] ==> var maxConstructorVersion: Int defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[LocalVariableDescriptor]

'version' @ [63:45] ==> val version: Int defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor.<anonymous>[LocalVariableDescriptor]

'constructor' @ [69:20] ==> var constructor: KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[LocalVariableDescriptor]

'constructorForDeserialization' @ [69:35] ==> internal fun constructorForDeserialization(type: Type): KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'type' @ [69:65] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.getEvolverConstructor[ValueParameterDescriptorImpl]

'old' @ [84:34] ==> value-parameter old: CompositeType defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[ValueParameterDescriptorImpl]

'fields' @ [84:38] ==> public final val fields: List<Field> defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'map' @ [84:45] ==> public inline fun <T, R> Iterable<Field>.map(transform: (Field) -> Pair<String?, Type>): List<Pair<String?, Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field
    <R> -> Pair<String?, Type>

'it' @ [85:17] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [85:20] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'it' @ [85:39] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[ValueParameterDescriptorImpl]

'getTypeAsClass' @ [85:42] ==> public fun Field.getTypeAsClass(classloader: ClassLoader): (Class<out (Any..Any?)>..Class<out (Any..Any?)>?) defined in net.corda.nodeapi.internal.serialization.carpenter in file AMQPSchemaExtensions.kt[SimpleFunctionDescriptorImpl]

'factory' @ [85:57] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[ValueParameterDescriptorImpl]

'classloader' @ [85:65] ==> public final val classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'toMap' @ [86:15] ==> public fun <K, V> Iterable<Pair<String?, Type>>.toMap(): Map<String?, Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String?
    <V> -> Type

'getEvolverConstructor' @ [88:31] ==> internal final fun getEvolverConstructor(type: Type, oldArgs: Map<String?, Type>): KFunction<Any>? defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion[SimpleFunctionDescriptorImpl]

'new' @ [88:53] ==> value-parameter new: ObjectSerializer defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[ValueParameterDescriptorImpl]

'type' @ [88:57] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ObjectSerializer[PropertyDescriptorImpl]

'oldFieldToType' @ [88:63] ==> val oldFieldToType: Map<String?, Type> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[LocalVariableDescriptor]

'NotSerializableException' @ [89:27] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'new' @ [90:69] ==> value-parameter new: ObjectSerializer defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[ValueParameterDescriptorImpl]

'type' @ [90:73] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ObjectSerializer[PropertyDescriptorImpl]

'mutableMapOf' @ [92:27] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, EvolutionSerializer.OldParam> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> OldParam

'old' @ [94:13] ==> value-parameter old: CompositeType defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[ValueParameterDescriptorImpl]

'fields' @ [94:17] ==> public final val fields: List<Field> defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'forEach' @ [94:24] ==> @HidesMembers public inline fun <T> Iterable<Field>.forEach(action: (Field) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'it' @ [95:34] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[ValueParameterDescriptorImpl]

'getTypeAsClass' @ [95:37] ==> public fun Field.getTypeAsClass(classloader: ClassLoader): (Class<out (Any..Any?)>..Class<out (Any..Any?)>?) defined in net.corda.nodeapi.internal.serialization.carpenter in file AMQPSchemaExtensions.kt[SimpleFunctionDescriptorImpl]

'factory' @ [95:52] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[ValueParameterDescriptorImpl]

'classloader' @ [95:60] ==> public final val classloader: ClassLoader defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[PropertyDescriptorImpl]

'oldArgs' @ [96:17] ==> val oldArgs: MutableMap<String, EvolutionSerializer.OldParam> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[LocalVariableDescriptor]

'it' @ [96:25] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [96:28] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'OldParam' @ [96:36] ==> public constructor OldParam(type: Type, idx: Int, property: PropertySerializer) defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.OldParam[ClassConstructorDescriptorImpl]

'returnType' @ [97:25] ==> val returnType: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?) defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[LocalVariableDescriptor]

'idx' @ [97:37] ==> var idx: Int defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[LocalVariableDescriptor]

'make' @ [97:63] ==> public final fun make(name: String, readMethod: Method?, resolvedType: Type, factory: SerializerFactory): PropertySerializer defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion[SimpleFunctionDescriptorImpl]

'it' @ [97:68] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [97:71] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.amqp.Field[PropertyDescriptorImpl]

'returnType' @ [97:83] ==> val returnType: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?) defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[LocalVariableDescriptor]

'factory' @ [97:95] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[ValueParameterDescriptorImpl]

'constructor' @ [100:27] ==> val constructor: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[LocalVariableDescriptor]

'parameters' @ [100:39] ==> public abstract val parameters: List<KParameter> defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'map' @ [100:50] ==> public inline fun <T, R> Iterable<KParameter>.map(transform: (KParameter) -> EvolutionSerializer.OldParam?): List<EvolutionSerializer.OldParam?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KParameter
    <R> -> OldParam?

'oldArgs' @ [101:17] ==> val oldArgs: MutableMap<String, EvolutionSerializer.OldParam> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[LocalVariableDescriptor]

'it' @ [101:25] ==> value-parameter it: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [101:28] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'if (!it.type.isMarkedNullable) {
                    throw NotSerializableException(
                            "New parameter ${it.name} is mandatory, should be nullable for evolution to worK")
                } else null' @ [101:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing?, elseBranch: Nothing?): Nothing?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing?

'!' @ [101:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [101:44] ==> value-parameter it: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [101:47] ==> public abstract val type: KType defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'isMarkedNullable' @ [101:52] ==> public abstract val isMarkedNullable: Boolean defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'NotSerializableException' @ [102:27] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'it' @ [103:46] ==> value-parameter it: KParameter defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [103:49] ==> public abstract val name: String? defined in kotlin.reflect.KParameter[DeserializedPropertyDescriptor]

'EvolutionSerializer' @ [107:20] ==> public constructor EvolutionSerializer(clazz: Type, factory: SerializerFactory, readers: List<EvolutionSerializer.OldParam?>, kotlinConstructor: KFunction<Any>?) defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer[ClassConstructorDescriptorImpl]

'new' @ [107:40] ==> value-parameter new: ObjectSerializer defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[ValueParameterDescriptorImpl]

'type' @ [107:44] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.ObjectSerializer[PropertyDescriptorImpl]

'factory' @ [107:50] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[ValueParameterDescriptorImpl]

'readers' @ [107:59] ==> val readers: List<EvolutionSerializer.OldParam?> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[LocalVariableDescriptor]

'constructor' @ [107:68] ==> val constructor: KFunction<Any> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.Companion.make[LocalVariableDescriptor]

'IllegalAccessException' @ [112:15] ==> public constructor IllegalAccessException(p0: (String..String?)) defined in java.lang.IllegalAccessException[JavaClassConstructorDescriptor]

'obj' @ [125:13] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.readObject[ValueParameterDescriptorImpl]

'NotSerializableException' @ [125:36] ==> public constructor NotSerializableException(p0: (String..String?)) defined in java.io.NotSerializableException[JavaClassConstructorDescriptor]

'obj' @ [125:100] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.readObject[ValueParameterDescriptorImpl]

'construct' @ [127:16] ==> public final fun construct(properties: List<Any?>): Any defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer[SimpleFunctionDescriptorImpl]

'readers' @ [127:26] ==> public final val readers: List<EvolutionSerializer.OldParam?> defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer[PropertyDescriptorImpl]

'map' @ [127:34] ==> public inline fun <T, R> Iterable<EvolutionSerializer.OldParam?>.map(transform: (EvolutionSerializer.OldParam?) -> Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OldParam?
    <R> -> Any?

'it' @ [127:40] ==> value-parameter it: EvolutionSerializer.OldParam? defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.readObject.<anonymous>[ValueParameterDescriptorImpl]

'readProperty' @ [127:44] ==> public final fun readProperty(paramValues: List<*>, schema: Schema, input: DeserializationInput): Any? defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.OldParam[SimpleFunctionDescriptorImpl]

'obj' @ [127:57] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.readObject[ValueParameterDescriptorImpl]

'schema' @ [127:62] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.readObject[ValueParameterDescriptorImpl]

'input' @ [127:70] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.EvolutionSerializer.readObject[ValueParameterDescriptorImpl]

