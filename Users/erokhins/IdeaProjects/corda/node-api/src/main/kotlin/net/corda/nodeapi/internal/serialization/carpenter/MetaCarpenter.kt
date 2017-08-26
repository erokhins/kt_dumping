'CarpenterSchemas' @ [31:20] ==> public constructor CarpenterSchemas(carpenterSchemas: MutableList<Schema>, dependencies: MutableMap<String, Pair<TypeNotation, MutableList<String>>>, dependsOn: MutableMap<String, MutableList<String>>) defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[ClassConstructorDescriptorImpl]

'mutableListOf' @ [32:21] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<Schema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Schema

'mutableMapOf' @ [33:21] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, Pair<TypeNotation, MutableList<String>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Pair<TypeNotation, MutableList<String>>

'mutableMapOf' @ [34:21] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, MutableList<String>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> MutableList<String>

'dependsOn' @ [39:9] ==> public final val dependsOn: MutableMap<String, MutableList<String>> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'computeIfAbsent' @ [39:19] ==> public final fun computeIfAbsent(p0: String, p1: (String) -> MutableList<String>): MutableList<String> defined in kotlin.collections.MutableMap[MyFunctionDescriptor]

'dependee' @ [39:35] ==> value-parameter dependee: String defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas.addDepPair[ValueParameterDescriptorImpl]

'mutableListOf' @ [39:47] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'add' @ [39:74] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'dependant' @ [39:78] ==> value-parameter dependant: String defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas.addDepPair[ValueParameterDescriptorImpl]

'dependencies' @ [40:9] ==> public final val dependencies: MutableMap<String, Pair<TypeNotation, MutableList<String>>> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'computeIfAbsent' @ [40:22] ==> public final fun computeIfAbsent(p0: String, p1: (String) -> Pair<TypeNotation, MutableList<String>>): Pair<TypeNotation, MutableList<String>> defined in kotlin.collections.MutableMap[MyFunctionDescriptor]

'dependant' @ [40:38] ==> value-parameter dependant: String defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas.addDepPair[ValueParameterDescriptorImpl]

'Pair' @ [40:51] ==> public constructor Pair<out A, out B>(first: TypeNotation, second: MutableList<String>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> TypeNotation
    <out B> -> MutableList<String>

'type' @ [40:56] ==> value-parameter type: TypeNotation defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas.addDepPair[ValueParameterDescriptorImpl]

'mutableListOf' @ [40:62] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'second' @ [40:90] ==> public final val second: MutableList<String> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'add' @ [40:97] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'dependee' @ [40:101] ==> value-parameter dependee: String defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas.addDepPair[ValueParameterDescriptorImpl]

'carpenterSchemas' @ [44:17] ==> public final val carpenterSchemas: MutableList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'size' @ [44:34] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'carpenterSchemas' @ [46:21] ==> public final val carpenterSchemas: MutableList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'isEmpty' @ [46:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'carpenterSchemas' @ [47:24] ==> public final val carpenterSchemas: MutableList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'isNotEmpty' @ [47:41] ==> @InlineOnly public inline fun <T> Collection<Schema>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Schema

'ClassCarpenter' @ [59:93] ==> public constructor ClassCarpenter(cl: ClassLoader = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[ClassConstructorDescriptorImpl]

'mutableMapOf' @ [60:19] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Class<*>

'objects' @ [63:9] ==> public final val objects: MutableMap<String, Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'newObject' @ [63:17] ==> value-parameter newObject: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase.step[ValueParameterDescriptorImpl]

'name' @ [63:27] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'cc' @ [63:35] ==> public final val cc: ClassCarpenter defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'build' @ [63:38] ==> public final fun build(schema: Schema): Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'newObject' @ [63:45] ==> value-parameter newObject: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase.step[ValueParameterDescriptorImpl]

'schemas' @ [68:9] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'dependsOn' @ [68:17] ==> public final val dependsOn: MutableMap<String, MutableList<String>> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'remove' @ [68:27] ==> public abstract fun remove(key: String): MutableList<String>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'newObject' @ [68:34] ==> value-parameter newObject: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase.step[ValueParameterDescriptorImpl]

'name' @ [68:44] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'forEach' @ [68:51] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'assert' @ [69:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'newObject' @ [69:21] ==> value-parameter newObject: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase.step[ValueParameterDescriptorImpl]

'name' @ [69:31] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'schemas' @ [69:39] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'dependencies' @ [69:47] ==> public final val dependencies: MutableMap<String, Pair<TypeNotation, MutableList<String>>> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'dependent' @ [69:60] ==> value-parameter dependent: String defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase.step.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [69:73] ==> public final val second: MutableList<String> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'schemas' @ [71:13] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'dependencies' @ [71:21] ==> public final val dependencies: MutableMap<String, Pair<TypeNotation, MutableList<String>>> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'dependent' @ [71:34] ==> value-parameter dependent: String defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase.step.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [71:46] ==> public final val second: MutableList<String> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'remove' @ [71:54] ==> public abstract fun remove(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'newObject' @ [71:61] ==> value-parameter newObject: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase.step[ValueParameterDescriptorImpl]

'name' @ [71:71] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'schemas' @ [74:17] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'dependencies' @ [74:25] ==> public final val dependencies: MutableMap<String, Pair<TypeNotation, MutableList<String>>> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'dependent' @ [74:38] ==> value-parameter dependent: String defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase.step.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [74:50] ==> public final val second: MutableList<String> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'isEmpty' @ [74:58] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'schemas' @ [75:18] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'dependencies' @ [75:26] ==> public final val dependencies: MutableMap<String, Pair<TypeNotation, MutableList<String>>> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'remove' @ [75:39] ==> public abstract fun remove(key: String): Pair<TypeNotation, MutableList<String>>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'dependent' @ [75:47] ==> value-parameter dependent: String defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase.step.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [75:59] ==> public final val first: TypeNotation defined in kotlin.Pair[DeserializedPropertyDescriptor]

'carpenterSchema' @ [75:83] ==> public fun CompositeType.carpenterSchema(classloader: ClassLoader, carpenterSchemas: CarpenterSchemas, force: Boolean = ...): Unit defined in net.corda.nodeapi.internal.serialization.carpenter in file AMQPSchemaExtensions.kt[SimpleFunctionDescriptorImpl]

'cc' @ [76:39] ==> public final val cc: ClassCarpenter defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'classloader' @ [76:42] ==> public final val classloader: CarpenterClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'schemas' @ [77:44] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'cc' @ [85:21] ==> public final val cc: ClassCarpenter defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[PropertyDescriptorImpl]

'classloader' @ [85:24] ==> public final val classloader: CarpenterClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'ClassCarpenter' @ [89:43] ==> public constructor ClassCarpenter(cl: ClassLoader = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[ClassConstructorDescriptorImpl]

'MetaCarpenterBase' @ [89:63] ==> public constructor MetaCarpenterBase(schemas: CarpenterSchemas, cc: ClassCarpenter = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[ClassConstructorDescriptorImpl]

'schemas' @ [89:81] ==> value-parameter schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenter.<init>[ValueParameterDescriptorImpl]

'cc' @ [89:90] ==> value-parameter cc: ClassCarpenter = ... defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenter.<init>[ValueParameterDescriptorImpl]

'schemas' @ [91:16] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenter[PropertyDescriptorImpl]

'carpenterSchemas' @ [91:24] ==> public final val carpenterSchemas: MutableList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'isNotEmpty' @ [91:41] ==> @InlineOnly public inline fun <T> Collection<Schema>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Schema

'schemas' @ [92:29] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenter[PropertyDescriptorImpl]

'carpenterSchemas' @ [92:37] ==> public final val carpenterSchemas: MutableList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'removeAt' @ [92:54] ==> public abstract fun removeAt(index: Int): Schema defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'step' @ [93:13] ==> public final fun step(newObject: Schema): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenter[SimpleFunctionDescriptorImpl]

'newObject' @ [93:19] ==> val newObject: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenter.build[LocalVariableDescriptor]

'ClassCarpenter' @ [99:47] ==> public constructor ClassCarpenter(cl: ClassLoader = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[ClassConstructorDescriptorImpl]

'MetaCarpenterBase' @ [99:67] ==> public constructor MetaCarpenterBase(schemas: CarpenterSchemas, cc: ClassCarpenter = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.MetaCarpenterBase[ClassConstructorDescriptorImpl]

'schemas' @ [99:85] ==> value-parameter schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.TestMetaCarpenter.<init>[ValueParameterDescriptorImpl]

'cc' @ [99:94] ==> value-parameter cc: ClassCarpenter = ... defined in net.corda.nodeapi.internal.serialization.carpenter.TestMetaCarpenter.<init>[ValueParameterDescriptorImpl]

'schemas' @ [101:13] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.TestMetaCarpenter[PropertyDescriptorImpl]

'carpenterSchemas' @ [101:21] ==> public final val carpenterSchemas: MutableList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'isEmpty' @ [101:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'step' @ [102:9] ==> public final fun step(newObject: Schema): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.TestMetaCarpenter[SimpleFunctionDescriptorImpl]

'schemas' @ [102:15] ==> public final val schemas: CarpenterSchemas defined in net.corda.nodeapi.internal.serialization.carpenter.TestMetaCarpenter[PropertyDescriptorImpl]

'carpenterSchemas' @ [102:23] ==> public final val carpenterSchemas: MutableList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemas[PropertyDescriptorImpl]

'removeAt' @ [102:40] ==> public abstract fun removeAt(index: Int): Schema defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

