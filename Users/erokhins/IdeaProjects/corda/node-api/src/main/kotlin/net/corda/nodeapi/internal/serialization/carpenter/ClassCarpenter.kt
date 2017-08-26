'currentThread' @ [23:69] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [23:85] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'ClassLoader' @ [24:9] ==> protected/*protected and package*/ constructor ClassLoader(p0: (ClassLoader..ClassLoader?)) defined in java.lang.ClassLoader[JavaClassConstructorDescriptor]

'parentClassLoader' @ [24:21] ==> value-parameter parentClassLoader: ClassLoader = ... defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterClassLoader.<init>[ValueParameterDescriptorImpl]

'defineClass' @ [25:48] ==> protected/*protected and package*/ final fun defineClass(p0: (String..String?), p1: (ByteArray..ByteArray?), p2: Int, p3: Int): (Class<*>..Class<*>?) defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterClassLoader[JavaMethodDescriptor]

'name' @ [25:60] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterClassLoader.load[ValueParameterDescriptorImpl]

'bytes' @ [25:66] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterClassLoader.load[ValueParameterDescriptorImpl]

'bytes' @ [25:76] ==> value-parameter bytes: ByteArray defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterClassLoader.load[ValueParameterDescriptorImpl]

'size' @ [25:82] ==> public final val size: Int defined in kotlin.ByteArray[DeserializedPropertyDescriptor]

'currentThread' @ [72:47] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [72:63] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'CarpenterClassLoader' @ [79:23] ==> public constructor CarpenterClassLoader(parentClassLoader: ClassLoader = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterClassLoader[ClassConstructorDescriptorImpl]

'cl' @ [79:44] ==> value-parameter cl: ClassLoader = ... defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.<init>[ValueParameterDescriptorImpl]

'HashMap' @ [81:27] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Class<*>

'replace' @ [82:44] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'HashMap' @ [85:41] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (String..String?), out (Class<*>..Class<*>?)>..Map<out (String..String?), (Class<*>..Class<*>?)>?)) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> (java.lang.Class<*>..java.lang.Class<*>?)

'_loaded' @ [85:49] ==> private final val _loaded: HashMap<String, Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'validateSchema' @ [95:9] ==> private final fun validateSchema(schema: Schema): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'schema' @ [95:24] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[ValueParameterDescriptorImpl]

'ArrayList' @ [98:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Schema

'hierarchy' @ [99:9] ==> val hierarchy: ArrayList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[LocalVariableDescriptor]

'schema' @ [99:22] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[ValueParameterDescriptorImpl]

'schema' @ [100:22] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[ValueParameterDescriptorImpl]

'superclass' @ [100:29] ==> public final val superclass: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'cursor' @ [101:16] ==> var cursor: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[LocalVariableDescriptor]

'cursor' @ [101:34] ==> var cursor: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[LocalVariableDescriptor]

'name' @ [101:41] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'_loaded' @ [101:50] ==> private final val _loaded: HashMap<String, Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'hierarchy' @ [102:13] ==> val hierarchy: ArrayList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[LocalVariableDescriptor]

'cursor' @ [102:26] ==> var cursor: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[LocalVariableDescriptor]

'cursor' @ [103:13] ==> var cursor: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[LocalVariableDescriptor]

'cursor' @ [103:22] ==> var cursor: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[LocalVariableDescriptor]

'superclass' @ [103:29] ==> public final val superclass: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'hierarchy' @ [106:9] ==> val hierarchy: ArrayList<Schema> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[LocalVariableDescriptor]

'reversed' @ [106:19] ==> public fun <T> Iterable<Schema>.reversed(): List<Schema> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Schema

'forEach' @ [106:30] ==> @HidesMembers public inline fun <T> Iterable<Schema>.forEach(action: (Schema) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Schema

'when (it) {
                is InterfaceSchema -> generateInterface(it)
                is ClassSchema -> generateClass(it)
            }' @ [107:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Class<*>, entry1: Class<*>): Class<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Class<*>

'it' @ [107:19] ==> value-parameter it: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build.<anonymous>[ValueParameterDescriptorImpl]

'generateInterface' @ [108:39] ==> private final fun generateInterface(interfaceSchema: Schema): Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'it' @ [108:57] ==> value-parameter it: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build.<anonymous>[ValueParameterDescriptorImpl]

'generateClass' @ [109:35] ==> private final fun generateClass(classSchema: Schema): Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'it' @ [109:49] ==> value-parameter it: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [113:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'schema' @ [113:17] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[ValueParameterDescriptorImpl]

'name' @ [113:24] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'_loaded' @ [113:32] ==> private final val _loaded: HashMap<String, Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'_loaded' @ [115:16] ==> private final val _loaded: HashMap<String, Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'schema' @ [115:24] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.build[ValueParameterDescriptorImpl]

'name' @ [115:31] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'generate' @ [119:16] ==> private final fun generate(schema: Schema, generator: (ClassWriter, Schema) -> Unit): Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'interfaceSchema' @ [119:25] ==> value-parameter interfaceSchema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateInterface[ValueParameterDescriptorImpl]

'schema' @ [120:30] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateInterface.<anonymous>[ValueParameterDescriptorImpl]

'interfaces' @ [120:37] ==> public final val interfaces: List<Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'map' @ [120:48] ==> public inline fun <T, R> Iterable<Class<*>>.map(transform: (Class<*>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>
    <R> -> String

'it' @ [120:54] ==> value-parameter it: Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateInterface.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [120:57] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'jvm' @ [120:62] ==> private final val String.jvm: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'toTypedArray' @ [120:68] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'with' @ [122:13] ==> @InlineOnly public inline fun <T, R> with(receiver: ClassWriter, block: ClassWriter.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassWriter
    <R> -> Unit

'cw' @ [122:18] ==> value-parameter cw: ClassWriter defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateInterface.<anonymous>[ValueParameterDescriptorImpl]

'visit' @ [123:17] ==> public final fun visit(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)): Unit defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'V1_8' @ [123:23] ==> public const final val V1_8: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_PUBLIC' @ [123:29] ==> public const final val ACC_PUBLIC: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_ABSTRACT' @ [123:42] ==> public const final val ACC_ABSTRACT: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_INTERFACE' @ [123:57] ==> public const final val ACC_INTERFACE: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'schema' @ [123:72] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateInterface.<anonymous>[ValueParameterDescriptorImpl]

'jvmName' @ [123:79] ==> public final val jvmName: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'interfaces' @ [123:114] ==> val interfaces: Array<String> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateInterface.<anonymous>[LocalVariableDescriptor]

'visitAnnotation' @ [124:17] ==> public final fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'getDescriptor' @ [124:38] ==> public open fun getDescriptor(p0: raw (Class<(Any..Any?)>..Class<*>?)): (String..String?) defined in org.objectweb.asm.Type[JavaMethodDescriptor]

'CordaSerializable' @ [124:52] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'java' @ [124:77] ==> public val <T> KClass<CordaSerializable>.java: Class<CordaSerializable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaSerializable

'visitEnd' @ [124:90] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'generateAbstractGetters' @ [126:17] ==> private final fun ClassWriter.generateAbstractGetters(schema: Schema): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'schema' @ [126:41] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateInterface.<anonymous>[ValueParameterDescriptorImpl]

'visitEnd' @ [128:17] ==> public final fun visitEnd(): Unit defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'generate' @ [134:16] ==> private final fun generate(schema: Schema, generator: (ClassWriter, Schema) -> Unit): Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'classSchema' @ [134:25] ==> value-parameter classSchema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass[ValueParameterDescriptorImpl]

'schema' @ [135:29] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'superclass' @ [135:36] ==> public final val superclass: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'jvmName' @ [135:48] ==> public final val jvmName: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'schema' @ [136:30] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'interfaces' @ [136:37] ==> public final val interfaces: List<Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'map' @ [136:48] ==> public inline fun <T, R> Iterable<Class<*>>.map(transform: (Class<*>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>
    <R> -> String

'it' @ [136:54] ==> value-parameter it: Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [136:57] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'jvm' @ [136:62] ==> private final val String.jvm: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'toMutableList' @ [136:68] ==> public fun <T> Collection<String>.toMutableList(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'!in' @ [138:17] ==> public abstract fun contains(element: Class<*>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'java' @ [138:42] ==> public val <T> KClass<SimpleFieldAccess>.java: Class<SimpleFieldAccess> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SimpleFieldAccess

'schema' @ [138:51] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'interfaces' @ [138:58] ==> public final val interfaces: List<Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'interfaces' @ [138:70] ==> val interfaces: MutableList<String> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[LocalVariableDescriptor]

'add' @ [138:81] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'java' @ [138:110] ==> public val <T> KClass<SimpleFieldAccess>.java: Class<SimpleFieldAccess> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SimpleFieldAccess

'name' @ [138:115] ==> public final val <T : (Any..Any?)> Class<SimpleFieldAccess>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SimpleFieldAccess

'jvm' @ [138:120] ==> private final val String.jvm: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'with' @ [140:13] ==> @InlineOnly public inline fun <T, R> with(receiver: ClassWriter, block: ClassWriter.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassWriter
    <R> -> Unit

'cw' @ [140:18] ==> value-parameter cw: ClassWriter defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'visit' @ [141:17] ==> public final fun visit(p0: Int, p1: Int, p2: (String..String?), p3: (String..String?), p4: (String..String?), p5: (Array<(String..String?)>..Array<out (String..String?)>?)): Unit defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'V1_8' @ [141:23] ==> public const final val V1_8: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_PUBLIC' @ [141:29] ==> public const final val ACC_PUBLIC: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_SUPER' @ [141:42] ==> public const final val ACC_SUPER: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'schema' @ [141:53] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'jvmName' @ [141:60] ==> public final val jvmName: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'superName' @ [141:75] ==> val superName: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[LocalVariableDescriptor]

'interfaces' @ [141:86] ==> val interfaces: MutableList<String> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [141:97] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'visitAnnotation' @ [142:17] ==> public final fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'getDescriptor' @ [142:38] ==> public open fun getDescriptor(p0: raw (Class<(Any..Any?)>..Class<*>?)): (String..String?) defined in org.objectweb.asm.Type[JavaMethodDescriptor]

'CordaSerializable' @ [142:52] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[DeserializedClassConstructorDescriptor]

'java' @ [142:77] ==> public val <T> KClass<CordaSerializable>.java: Class<CordaSerializable> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CordaSerializable

'visitEnd' @ [142:90] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'generateFields' @ [144:17] ==> private final fun ClassWriter.generateFields(schema: Schema): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'schema' @ [144:32] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'generateConstructor' @ [145:17] ==> private final fun ClassWriter.generateConstructor(schema: Schema): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'schema' @ [145:37] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'generateGetters' @ [146:17] ==> private final fun ClassWriter.generateGetters(schema: Schema): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'schema' @ [146:33] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'schema' @ [147:21] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'superclass' @ [147:28] ==> public final val superclass: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'generateGetMethod' @ [148:21] ==> private final fun ClassWriter.generateGetMethod(): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'generateToString' @ [149:17] ==> private final fun ClassWriter.generateToString(schema: Schema): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'schema' @ [149:34] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateClass.<anonymous>[ValueParameterDescriptorImpl]

'visitEnd' @ [151:17] ==> public final fun visitEnd(): Unit defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'ClassWriter' @ [158:18] ==> public constructor ClassWriter(p0: Int) defined in org.objectweb.asm.ClassWriter[JavaClassConstructorDescriptor]

'or' @ [158:30] ==> public final infix fun or(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'COMPUTE_FRAMES' @ [158:42] ==> public const final val COMPUTE_FRAMES: Int defined in org.objectweb.asm.ClassWriter[JavaPropertyDescriptor]

'COMPUTE_MAXS' @ [158:72] ==> public const final val COMPUTE_MAXS: Int defined in org.objectweb.asm.ClassWriter[JavaPropertyDescriptor]

'invoke' @ [160:9] ==> public abstract operator fun invoke(p1: ClassWriter, p2: Schema): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'cw' @ [160:19] ==> val cw: ClassWriter defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generate[LocalVariableDescriptor]

'schema' @ [160:23] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generate[ValueParameterDescriptorImpl]

'classloader' @ [162:21] ==> public final val classloader: CarpenterClassLoader defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'load' @ [162:33] ==> public final fun load(name: String, bytes: ByteArray): (Class<*>..Class<*>?) defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterClassLoader[SimpleFunctionDescriptorImpl]

'schema' @ [162:38] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generate[ValueParameterDescriptorImpl]

'name' @ [162:45] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'cw' @ [162:51] ==> val cw: ClassWriter defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generate[LocalVariableDescriptor]

'toByteArray' @ [162:54] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'_loaded' @ [163:9] ==> private final val _loaded: HashMap<String, Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'schema' @ [163:17] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generate[ValueParameterDescriptorImpl]

'name' @ [163:24] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'clazz' @ [163:32] ==> val clazz: (Class<*>..Class<*>?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generate[LocalVariableDescriptor]

'clazz' @ [164:16] ==> val clazz: (Class<*>..Class<*>?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generate[LocalVariableDescriptor]

'schema' @ [168:9] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateFields[ValueParameterDescriptorImpl]

'fields' @ [168:16] ==> public final val fields: LinkedHashMap<(String..String?), (Field..Field?)> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'forEach' @ [168:23] ==> @HidesMembers public inline fun <K, V> Map<out (String..String?), (Field..Field?)>.forEach(action: (Map.Entry<(String..String?), (Field..Field?)>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (net.corda.nodeapi.internal.serialization.carpenter.Field..net.corda.nodeapi.internal.serialization.carpenter.Field?)

'it' @ [168:33] ==> value-parameter it: Map.Entry<(String..String?), (Field..Field?)> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateFields.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [168:36] ==> public abstract val value: (Field..Field?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'generateField' @ [168:42] ==> public final fun generateField(cw: ClassWriter): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.Field[SimpleFunctionDescriptorImpl]

'this' @ [168:56] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateFields[ReceiverParameterDescriptorImpl]

'with' @ [173:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (MethodVisitor..MethodVisitor?), block: (MethodVisitor..MethodVisitor?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.objectweb.asm.MethodVisitor..org.objectweb.asm.MethodVisitor?)
    <R> -> Unit

'visitMethod' @ [173:14] ==> public final fun visitMethod(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)): (MethodVisitor..MethodVisitor?) defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'ACC_PUBLIC' @ [173:26] ==> public const final val ACC_PUBLIC: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitCode' @ [174:13] ==> public open fun visitCode(): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitLdcInsn' @ [176:13] ==> public open fun visitLdcInsn(p0: (Any..Any?)): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'schema' @ [176:26] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString[ValueParameterDescriptorImpl]

'name' @ [176:33] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'split' @ [176:38] ==> public fun CharSequence.split(vararg delimiters: Char, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'last' @ [176:49] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'visitMethodInsn' @ [177:13] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKESTATIC' @ [177:29] ==> public const final val INVOKESTATIC: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'toStringHelper' @ [177:122] ==> val toStringHelper: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString[LocalVariableDescriptor]

'component1' @ [179:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Field>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Field

'component2' @ [179:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, Field>.component2(): Field defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Field

'schema' @ [179:35] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString[ValueParameterDescriptorImpl]

'fieldsIncludingSuperclasses' @ [179:42] ==> public final fun fieldsIncludingSuperclasses(): Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[SimpleFunctionDescriptorImpl]

'entries' @ [179:72] ==> public abstract val entries: Set<Map.Entry<String, Field>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'visitLdcInsn' @ [180:17] ==> public open fun visitLdcInsn(p0: (Any..Any?)): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'name' @ [180:30] ==> val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString.<anonymous>[LocalVariableDescriptor]

'visitVarInsn' @ [181:17] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [181:30] ==> public const final val ALOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitFieldInsn' @ [182:17] ==> public open fun visitFieldInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?)): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'GETFIELD' @ [182:32] ==> public const final val GETFIELD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'schema' @ [182:42] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString[ValueParameterDescriptorImpl]

'jvmName' @ [182:49] ==> public final val jvmName: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'name' @ [182:58] ==> val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString.<anonymous>[LocalVariableDescriptor]

'schema' @ [182:64] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString[ValueParameterDescriptorImpl]

'descriptorsIncludingSuperclasses' @ [182:71] ==> public final fun descriptorsIncludingSuperclasses(): Map<String, String> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[SimpleFunctionDescriptorImpl]

'name' @ [182:106] ==> val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString.<anonymous>[LocalVariableDescriptor]

'visitMethodInsn' @ [183:17] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKEVIRTUAL' @ [183:33] ==> public const final val INVOKEVIRTUAL: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'toStringHelper' @ [183:48] ==> val toStringHelper: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString[LocalVariableDescriptor]

'field' @ [183:93] ==> val field: Field defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString.<anonymous>[LocalVariableDescriptor]

'type' @ [183:99] ==> public final val type: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'toStringHelper' @ [183:107] ==> val toStringHelper: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString[LocalVariableDescriptor]

'visitMethodInsn' @ [186:13] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKEVIRTUAL' @ [186:29] ==> public const final val INVOKEVIRTUAL: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'toStringHelper' @ [186:44] ==> val toStringHelper: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateToString[LocalVariableDescriptor]

'visitInsn' @ [187:13] ==> public open fun visitInsn(p0: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ARETURN' @ [187:23] ==> public const final val ARETURN: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMaxs' @ [188:13] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitEnd' @ [189:13] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ClassCarpenter' @ [194:26] ==> public companion object defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[FakeCallableDescriptorForObject]

'java' @ [194:48] ==> public val <T> KClass<ClassCarpenter>.java: Class<ClassCarpenter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassCarpenter

'name' @ [194:53] ==> public final val <T : (Any..Any?)> Class<ClassCarpenter>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClassCarpenter

'jvm' @ [194:58] ==> private final val String.jvm: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'with' @ [195:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (MethodVisitor..MethodVisitor?), block: (MethodVisitor..MethodVisitor?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.objectweb.asm.MethodVisitor..org.objectweb.asm.MethodVisitor?)
    <R> -> Unit

'visitMethod' @ [195:14] ==> public final fun visitMethod(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)): (MethodVisitor..MethodVisitor?) defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'ACC_PUBLIC' @ [195:26] ==> public const final val ACC_PUBLIC: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitCode' @ [196:13] ==> public open fun visitCode(): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitVarInsn' @ [197:13] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [197:26] ==> public const final val ALOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitVarInsn' @ [198:13] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [198:26] ==> public const final val ALOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMethodInsn' @ [202:13] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKESTATIC' @ [202:29] ==> public const final val INVOKESTATIC: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ourJvmName' @ [202:43] ==> val ourJvmName: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetMethod[LocalVariableDescriptor]

'visitInsn' @ [203:13] ==> public open fun visitInsn(p0: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ARETURN' @ [203:23] ==> public const final val ARETURN: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMaxs' @ [204:13] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitEnd' @ [205:13] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'component1' @ [210:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (Field..Field?)>.component1(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (net.corda.nodeapi.internal.serialization.carpenter.Field..net.corda.nodeapi.internal.serialization.carpenter.Field?)

'component2' @ [210:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (Field..Field?)>.component2(): (Field..Field?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (net.corda.nodeapi.internal.serialization.carpenter.Field..net.corda.nodeapi.internal.serialization.carpenter.Field?)

'schema' @ [210:30] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetters[ValueParameterDescriptorImpl]

'fields' @ [210:37] ==> public final val fields: LinkedHashMap<(String..String?), (Field..Field?)> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'with' @ [211:13] ==> @InlineOnly public inline fun <T, R> with(receiver: (MethodVisitor..MethodVisitor?), block: (MethodVisitor..MethodVisitor?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.objectweb.asm.MethodVisitor..org.objectweb.asm.MethodVisitor?)
    <R> -> Unit

'visitMethod' @ [211:18] ==> public final fun visitMethod(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)): (MethodVisitor..MethodVisitor?) defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'ACC_PUBLIC' @ [211:30] ==> public const final val ACC_PUBLIC: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'+' @ [211:42] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [211:50] ==> val name: (String..String?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetters[LocalVariableDescriptor]

'capitalize' @ [211:55] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'+' @ [211:69] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'type' @ [211:76] ==> val type: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetters[LocalVariableDescriptor]

'descriptor' @ [211:81] ==> public final val descriptor: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'type' @ [212:17] ==> val type: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetters[LocalVariableDescriptor]

'addNullabilityAnnotation' @ [212:22] ==> public final fun addNullabilityAnnotation(mv: MethodVisitor): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.Field[SimpleFunctionDescriptorImpl]

'this' @ [212:47] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetters.<anonymous>[ReceiverParameterDescriptorImpl]

'visitCode' @ [213:17] ==> public open fun visitCode(): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitVarInsn' @ [214:17] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [214:30] ==> public const final val ALOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitFieldInsn' @ [215:17] ==> public open fun visitFieldInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?)): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'GETFIELD' @ [215:32] ==> public const final val GETFIELD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'schema' @ [215:42] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetters[ValueParameterDescriptorImpl]

'jvmName' @ [215:49] ==> public final val jvmName: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'name' @ [215:58] ==> val name: (String..String?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetters[LocalVariableDescriptor]

'type' @ [215:64] ==> val type: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetters[LocalVariableDescriptor]

'descriptor' @ [215:69] ==> public final val descriptor: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'when (type.field) {
                    java.lang.Boolean.TYPE, Integer.TYPE, java.lang.Short.TYPE, java.lang.Byte.TYPE,
                            java.lang.Character.TYPE -> visitInsn(IRETURN)
                    java.lang.Long.TYPE -> visitInsn(LRETURN)
                    java.lang.Double.TYPE -> visitInsn(DRETURN)
                    java.lang.Float.TYPE -> visitInsn(FRETURN)
                    else -> visitInsn(ARETURN)
                }' @ [216:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'type' @ [216:23] ==> val type: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateGetters[LocalVariableDescriptor]

'field' @ [216:28] ==> public final val field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'TYPE' @ [217:39] ==> public final val TYPE: (Class<(Boolean..Boolean?)>..Class<(Boolean..Boolean?)>?) defined in java.lang.Boolean[JavaPropertyDescriptor]

'TYPE' @ [217:53] ==> public final val TYPE: (Class<(Int..Int?)>..Class<(Int..Int?)>?) defined in java.lang.Integer[JavaPropertyDescriptor]

'TYPE' @ [217:75] ==> public final val TYPE: (Class<(Short..Short?)>..Class<(Short..Short?)>?) defined in java.lang.Short[JavaPropertyDescriptor]

'TYPE' @ [217:96] ==> public final val TYPE: (Class<(Byte..Byte?)>..Class<(Byte..Byte?)>?) defined in java.lang.Byte[JavaPropertyDescriptor]

'TYPE' @ [218:49] ==> public final val TYPE: (Class<(Char..Char?)>..Class<(Char..Char?)>?) defined in java.lang.Character[JavaPropertyDescriptor]

'visitInsn' @ [218:57] ==> public open fun visitInsn(p0: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'IRETURN' @ [218:67] ==> public const final val IRETURN: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'TYPE' @ [219:36] ==> public final val TYPE: (Class<(Long..Long?)>..Class<(Long..Long?)>?) defined in java.lang.Long[JavaPropertyDescriptor]

'visitInsn' @ [219:44] ==> public open fun visitInsn(p0: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'LRETURN' @ [219:54] ==> public const final val LRETURN: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'TYPE' @ [220:38] ==> public final val TYPE: (Class<(Double..Double?)>..Class<(Double..Double?)>?) defined in java.lang.Double[JavaPropertyDescriptor]

'visitInsn' @ [220:46] ==> public open fun visitInsn(p0: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'DRETURN' @ [220:56] ==> public const final val DRETURN: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'TYPE' @ [221:37] ==> public final val TYPE: (Class<(Float..Float?)>..Class<(Float..Float?)>?) defined in java.lang.Float[JavaPropertyDescriptor]

'visitInsn' @ [221:45] ==> public open fun visitInsn(p0: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'FRETURN' @ [221:55] ==> public const final val FRETURN: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitInsn' @ [222:29] ==> public open fun visitInsn(p0: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ARETURN' @ [222:39] ==> public const final val ARETURN: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMaxs' @ [224:17] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitEnd' @ [225:17] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'component1' @ [231:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (Field..Field?)>.component1(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (net.corda.nodeapi.internal.serialization.carpenter.Field..net.corda.nodeapi.internal.serialization.carpenter.Field?)

'component2' @ [231:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (Field..Field?)>.component2(): (Field..Field?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (net.corda.nodeapi.internal.serialization.carpenter.Field..net.corda.nodeapi.internal.serialization.carpenter.Field?)

'schema' @ [231:31] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateAbstractGetters[ValueParameterDescriptorImpl]

'fields' @ [231:38] ==> public final val fields: LinkedHashMap<(String..String?), (Field..Field?)> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'ACC_ABSTRACT' @ [232:27] ==> public const final val ACC_ABSTRACT: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_PUBLIC' @ [232:42] ==> public const final val ACC_PUBLIC: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'with' @ [233:13] ==> @InlineOnly public inline fun <T, R> with(receiver: (MethodVisitor..MethodVisitor?), block: (MethodVisitor..MethodVisitor?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.objectweb.asm.MethodVisitor..org.objectweb.asm.MethodVisitor?)
    <R> -> Unit

'visitMethod' @ [233:18] ==> public final fun visitMethod(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)): (MethodVisitor..MethodVisitor?) defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'opcodes' @ [233:30] ==> val opcodes: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateAbstractGetters[LocalVariableDescriptor]

'+' @ [233:39] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [233:47] ==> val name: (String..String?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateAbstractGetters[LocalVariableDescriptor]

'capitalize' @ [233:52] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'field' @ [233:71] ==> val field: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateAbstractGetters[LocalVariableDescriptor]

'descriptor' @ [233:77] ==> public final val descriptor: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'visitEnd' @ [235:17] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'with' @ [241:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (MethodVisitor..MethodVisitor?), block: (MethodVisitor..MethodVisitor?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.objectweb.asm.MethodVisitor..org.objectweb.asm.MethodVisitor?)
    <R> -> Unit

'visitMethod' @ [241:14] ==> public final fun visitMethod(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Array<(String..String?)>..Array<out (String..String?)>?)): (MethodVisitor..MethodVisitor?) defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'ACC_PUBLIC' @ [242:17] ==> public const final val ACC_PUBLIC: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'+' @ [244:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'schema' @ [244:23] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor[ValueParameterDescriptorImpl]

'descriptorsIncludingSuperclasses' @ [244:30] ==> public final fun descriptorsIncludingSuperclasses(): Map<String, String> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[SimpleFunctionDescriptorImpl]

'values' @ [244:65] ==> public abstract val values: Collection<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'joinToString' @ [244:72] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'schema' @ [249:13] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor[ValueParameterDescriptorImpl]

'fields' @ [249:20] ==> public final val fields: LinkedHashMap<(String..String?), (Field..Field?)> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'values' @ [249:27] ==> public open val values: MutableCollection<(Field..Field?)> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'forEach' @ [249:34] ==> @HidesMembers public inline fun <T> Iterable<(Field..Field?)>.forEach(action: ((Field..Field?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (net.corda.nodeapi.internal.serialization.carpenter.Field..net.corda.nodeapi.internal.serialization.carpenter.Field?)

'it' @ [249:44] ==> value-parameter it: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'visitParameter' @ [249:47] ==> public final fun visitParameter(mv: MethodVisitor, idx: Int): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.Field[SimpleFunctionDescriptorImpl]

'this' @ [249:62] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[ReceiverParameterDescriptorImpl]

'idx' @ [249:68] ==> var idx: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'visitCode' @ [251:13] ==> public open fun visitCode(): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'schema' @ [254:36] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor[ValueParameterDescriptorImpl]

'superclass' @ [254:43] ==> public final val superclass: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'fieldsIncludingSuperclasses' @ [254:55] ==> public final fun fieldsIncludingSuperclasses(): Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[SimpleFunctionDescriptorImpl]

'emptyMap' @ [254:88] ==> public fun <K, V> emptyMap(): Map<String, Field> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Field

'visitVarInsn' @ [255:13] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [255:26] ==> public const final val ALOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'schema' @ [256:22] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor[ValueParameterDescriptorImpl]

'superclass' @ [256:29] ==> public final val superclass: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'if (sc == null) {
                visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false)
            } else {
                var slot = 1
                superclassFields.values.forEach { slot += load(slot, it) }
                val superDesc = sc.descriptorsIncludingSuperclasses().values.joinToString("")
                visitMethodInsn(INVOKESPECIAL, sc.name.jvm, "<init>", "($superDesc)V", false)
            }' @ [257:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'sc' @ [257:17] ==> val sc: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'visitMethodInsn' @ [258:17] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKESPECIAL' @ [258:33] ==> public const final val INVOKESPECIAL: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'superclassFields' @ [261:17] ==> val superclassFields: Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'values' @ [261:34] ==> public abstract val values: Collection<Field> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'forEach' @ [261:41] ==> @HidesMembers public inline fun <T> Iterable<Field>.forEach(action: (Field) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'slot' @ [261:51] ==> var slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'load' @ [261:59] ==> private final fun MethodVisitor.load(slot: Int, type: Field): Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'slot' @ [261:64] ==> var slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'it' @ [261:70] ==> value-parameter it: Field defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'sc' @ [262:33] ==> val sc: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'descriptorsIncludingSuperclasses' @ [262:36] ==> public final fun descriptorsIncludingSuperclasses(): Map<String, String> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[SimpleFunctionDescriptorImpl]

'values' @ [262:71] ==> public abstract val values: Collection<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'joinToString' @ [262:78] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'visitMethodInsn' @ [263:17] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKESPECIAL' @ [263:33] ==> public const final val INVOKESPECIAL: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'sc' @ [263:48] ==> val sc: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'name' @ [263:51] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'jvm' @ [263:56] ==> private final val String.jvm: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'superDesc' @ [263:74] ==> val superDesc: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'+' @ [267:24] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'superclassFields' @ [267:28] ==> val superclassFields: Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'size' @ [267:45] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'component1' @ [268:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (Field..Field?)>.component1(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (net.corda.nodeapi.internal.serialization.carpenter.Field..net.corda.nodeapi.internal.serialization.carpenter.Field?)

'component2' @ [268:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(String..String?), (Field..Field?)>.component2(): (Field..Field?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (net.corda.nodeapi.internal.serialization.carpenter.Field..net.corda.nodeapi.internal.serialization.carpenter.Field?)

'schema' @ [268:35] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor[ValueParameterDescriptorImpl]

'fields' @ [268:42] ==> public final val fields: LinkedHashMap<(String..String?), (Field..Field?)> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'entries' @ [268:49] ==> public open val entries: MutableSet<MutableMap.MutableEntry<(String..String?), (Field..Field?)>> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'field' @ [269:17] ==> val field: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'nullTest' @ [269:23] ==> public abstract fun nullTest(mv: MethodVisitor, slot: Int): Unit defined in net.corda.nodeapi.internal.serialization.carpenter.Field[SimpleFunctionDescriptorImpl]

'this' @ [269:32] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[ReceiverParameterDescriptorImpl]

'slot' @ [269:38] ==> var slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'visitVarInsn' @ [271:17] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [271:30] ==> public const final val ALOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'slot' @ [272:17] ==> var slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'load' @ [272:25] ==> private final fun MethodVisitor.load(slot: Int, type: Field): Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[SimpleFunctionDescriptorImpl]

'slot' @ [272:30] ==> var slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'field' @ [272:36] ==> val field: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'visitFieldInsn' @ [273:17] ==> public open fun visitFieldInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?)): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'PUTFIELD' @ [273:32] ==> public const final val PUTFIELD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'schema' @ [273:42] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor[ValueParameterDescriptorImpl]

'jvmName' @ [273:49] ==> public final val jvmName: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'name' @ [273:58] ==> val name: (String..String?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'field' @ [273:64] ==> val field: (Field..Field?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.generateConstructor.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [273:70] ==> public final val descriptor: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'visitInsn' @ [275:13] ==> public open fun visitInsn(p0: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'RETURN' @ [275:23] ==> public const final val RETURN: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitMaxs' @ [276:13] ==> public open fun visitMaxs(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'visitEnd' @ [277:13] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'when (type.field) {
            java.lang.Boolean.TYPE, Integer.TYPE, java.lang.Short.TYPE, java.lang.Byte.TYPE,
                    java.lang.Character.TYPE -> visitVarInsn(ILOAD, slot)
            java.lang.Long.TYPE -> visitVarInsn(LLOAD, slot)
            java.lang.Double.TYPE -> visitVarInsn(DLOAD, slot)
            java.lang.Float.TYPE -> visitVarInsn(FLOAD, slot)
            else -> visitVarInsn(ALOAD, slot)
        }' @ [282:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'type' @ [282:15] ==> value-parameter type: Field defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.load[ValueParameterDescriptorImpl]

'field' @ [282:20] ==> public final val field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'TYPE' @ [283:31] ==> public final val TYPE: (Class<(Boolean..Boolean?)>..Class<(Boolean..Boolean?)>?) defined in java.lang.Boolean[JavaPropertyDescriptor]

'TYPE' @ [283:45] ==> public final val TYPE: (Class<(Int..Int?)>..Class<(Int..Int?)>?) defined in java.lang.Integer[JavaPropertyDescriptor]

'TYPE' @ [283:67] ==> public final val TYPE: (Class<(Short..Short?)>..Class<(Short..Short?)>?) defined in java.lang.Short[JavaPropertyDescriptor]

'TYPE' @ [283:88] ==> public final val TYPE: (Class<(Byte..Byte?)>..Class<(Byte..Byte?)>?) defined in java.lang.Byte[JavaPropertyDescriptor]

'TYPE' @ [284:41] ==> public final val TYPE: (Class<(Char..Char?)>..Class<(Char..Char?)>?) defined in java.lang.Character[JavaPropertyDescriptor]

'visitVarInsn' @ [284:49] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ILOAD' @ [284:62] ==> public const final val ILOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'slot' @ [284:69] ==> value-parameter slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.load[ValueParameterDescriptorImpl]

'TYPE' @ [285:28] ==> public final val TYPE: (Class<(Long..Long?)>..Class<(Long..Long?)>?) defined in java.lang.Long[JavaPropertyDescriptor]

'visitVarInsn' @ [285:36] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'LLOAD' @ [285:49] ==> public const final val LLOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'slot' @ [285:56] ==> value-parameter slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.load[ValueParameterDescriptorImpl]

'TYPE' @ [286:30] ==> public final val TYPE: (Class<(Double..Double?)>..Class<(Double..Double?)>?) defined in java.lang.Double[JavaPropertyDescriptor]

'visitVarInsn' @ [286:38] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'DLOAD' @ [286:51] ==> public const final val DLOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'slot' @ [286:58] ==> value-parameter slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.load[ValueParameterDescriptorImpl]

'TYPE' @ [287:29] ==> public final val TYPE: (Class<(Float..Float?)>..Class<(Float..Float?)>?) defined in java.lang.Float[JavaPropertyDescriptor]

'visitVarInsn' @ [287:37] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'FLOAD' @ [287:50] ==> public const final val FLOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'slot' @ [287:57] ==> value-parameter slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.load[ValueParameterDescriptorImpl]

'visitVarInsn' @ [288:21] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [288:34] ==> public const final val ALOAD: Int defined in org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'slot' @ [288:41] ==> value-parameter slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.load[ValueParameterDescriptorImpl]

'when (type.field) {
            java.lang.Long.TYPE, java.lang.Double.TYPE -> 2
            else -> 1
        }' @ [290:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'type' @ [290:22] ==> value-parameter type: Field defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.load[ValueParameterDescriptorImpl]

'field' @ [290:27] ==> public final val field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'TYPE' @ [291:28] ==> public final val TYPE: (Class<(Long..Long?)>..Class<(Long..Long?)>?) defined in java.lang.Long[JavaPropertyDescriptor]

'TYPE' @ [291:51] ==> public final val TYPE: (Class<(Double..Double?)>..Class<(Double..Double?)>?) defined in java.lang.Double[JavaPropertyDescriptor]

'schema' @ [297:13] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[ValueParameterDescriptorImpl]

'name' @ [297:20] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'_loaded' @ [297:28] ==> private final val _loaded: HashMap<String, Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter[PropertyDescriptorImpl]

'DuplicateNameException' @ [297:43] ==> public constructor DuplicateNameException() defined in net.corda.nodeapi.internal.serialization.carpenter.DuplicateNameException[ClassConstructorDescriptorImpl]

'n' @ [298:37] ==> value-parameter n: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.isJavaName[ValueParameterDescriptorImpl]

'isNotBlank' @ [298:39] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isJavaIdentifierStart' @ [298:55] ==> public open fun isJavaIdentifierStart(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'n' @ [298:77] ==> value-parameter n: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.isJavaName[ValueParameterDescriptorImpl]

'first' @ [298:79] ==> public fun CharSequence.first(): Char defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'n' @ [298:91] ==> value-parameter n: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.isJavaName[ValueParameterDescriptorImpl]

'all' @ [298:93] ==> public inline fun CharSequence.all(predicate: (Char) -> Boolean): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'isJavaIdentifierPart' @ [298:99] ==> public open fun isJavaIdentifierPart(p0: Char): Boolean defined in java.lang.Character[JavaMethodDescriptor]

'require' @ [299:9] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isJavaName' @ [299:17] ==> local final fun isJavaName(n: String): Boolean defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[SimpleFunctionDescriptorImpl]

'schema' @ [299:28] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[ValueParameterDescriptorImpl]

'name' @ [299:35] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'split' @ [299:40] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'last' @ [299:51] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'schema' @ [299:88] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[ValueParameterDescriptorImpl]

'name' @ [299:95] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'schema' @ [300:9] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[ValueParameterDescriptorImpl]

'fields' @ [300:16] ==> public final val fields: LinkedHashMap<(String..String?), (Field..Field?)> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'keys' @ [300:23] ==> public open val keys: MutableSet<(String..String?)> defined in java.util.LinkedHashMap[JavaPropertyDescriptor]

'forEach' @ [300:28] ==> @HidesMembers public inline fun <T> Iterable<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'require' @ [300:38] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isJavaName' @ [300:46] ==> local final fun isJavaName(n: String): Boolean defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[SimpleFunctionDescriptorImpl]

'it' @ [300:57] ==> value-parameter it: (String..String?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [300:89] ==> value-parameter it: (String..String?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.<anonymous>[ValueParameterDescriptorImpl]

'schema' @ [304:25] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[ValueParameterDescriptorImpl]

'fieldsIncludingSuperclasses' @ [304:32] ==> public final fun fieldsIncludingSuperclasses(): Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[SimpleFunctionDescriptorImpl]

'schema' @ [305:21] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[ValueParameterDescriptorImpl]

'interfaces' @ [305:28] ==> public final val interfaces: List<Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'itf' @ [306:13] ==> val itf: Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[LocalVariableDescriptor]

'methods' @ [306:17] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.methods: (Array<(Method..Method?)>..Array<out (Method..Method?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'forEach' @ [306:25] ==> public inline fun <T> Array<out (Method..Method?)>.forEach(action: ((Method..Method?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Method..java.lang.reflect.Method?)

'when {
                    it.name.startsWith("get") -> it.name.substring(3).decapitalize()
                    else -> throw InterfaceMismatchException(
                            "Requested interfaces must consist only of methods that start "
                                    + "with 'get': ${itf.name}.${it.name}")
                }' @ [307:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'it' @ [308:21] ==> value-parameter it: (Method..Method?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [308:24] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [308:29] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [308:50] ==> value-parameter it: (Method..Method?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [308:53] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'substring' @ [308:58] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'decapitalize' @ [308:71] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'InterfaceMismatchException' @ [309:35] ==> public constructor InterfaceMismatchException(msg: String) defined in net.corda.nodeapi.internal.serialization.carpenter.InterfaceMismatchException[ClassConstructorDescriptorImpl]

'+' @ [310:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'itf' @ [311:54] ==> val itf: Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[LocalVariableDescriptor]

'name' @ [311:58] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'it' @ [311:66] ==> value-parameter it: (Method..Method?) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [311:69] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'fieldNameFromItf' @ [317:21] ==> val fieldNameFromItf: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [317:38] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'in' @ [317:51] ==> public abstract fun contains(element: Class<*>): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'java' @ [317:76] ==> public val <T> KClass<SimpleFieldAccess>.java: Class<SimpleFieldAccess> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SimpleFieldAccess

'schema' @ [317:84] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[ValueParameterDescriptorImpl]

'interfaces' @ [317:91] ==> public final val interfaces: List<Class<*>> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'and' @ [319:21] ==> public final infix fun and(other: Boolean): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'schema' @ [319:22] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[ValueParameterDescriptorImpl]

'fieldNameFromItf' @ [319:50] ==> val fieldNameFromItf: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.<anonymous>[LocalVariableDescriptor]

'allFields' @ [319:71] ==> val allFields: Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[LocalVariableDescriptor]

'InterfaceMismatchException' @ [320:27] ==> public constructor InterfaceMismatchException(msg: String) defined in net.corda.nodeapi.internal.serialization.carpenter.InterfaceMismatchException[ClassConstructorDescriptorImpl]

'+' @ [321:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'itf' @ [321:42] ==> val itf: Class<*> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema[LocalVariableDescriptor]

'name' @ [321:46] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'fieldNameFromItf' @ [321:76] ==> val fieldNameFromItf: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.validateSchema.<anonymous>[LocalVariableDescriptor]

'JvmStatic' @ [328:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'Suppress' @ [328:20] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'obj' @ [329:54] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.Companion.getField[ValueParameterDescriptorImpl]

'javaClass' @ [329:58] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'getMethod' @ [329:68] ==> @CallerSensitive public open fun getMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'+' @ [329:78] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'name' @ [329:86] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.Companion.getField[ValueParameterDescriptorImpl]

'capitalize' @ [329:91] ==> public fun String.capitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invoke' @ [329:105] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'obj' @ [329:112] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.carpenter.ClassCarpenter.Companion.getField[ValueParameterDescriptorImpl]

