'emptyList' @ [16:42] ==> public fun <T> emptyList(): List<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'LinkedHashMap' @ [19:13] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (String..String?), out (String..String?)>..Map<out (String..String?), (String..String?)>?)) defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> String

'this' @ [19:27] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema.descriptors[ReceiverParameterDescriptorImpl]

'mapValues' @ [19:32] ==> public inline fun <K, V, R> Map<out String, Field>.mapValues(transform: (Map.Entry<String, Field>) -> String): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Field
    <R> -> String

'it' @ [19:44] ==> value-parameter it: Map.Entry<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema.descriptors.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [19:47] ==> public abstract val value: Field defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'descriptor' @ [19:53] ==> public final val descriptor: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'LinkedHashMap' @ [23:18] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (String..String?), out (Field..Field?)>..Map<out (String..String?), (Field..Field?)>?)) defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Field

'fields' @ [23:32] ==> value-parameter fields: Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema.<init>[ValueParameterDescriptorImpl]

'mapValues' @ [23:39] ==> public inline fun <K, V, R> Map<out String, Field>.mapValues(transform: (Map.Entry<String, Field>) -> Field): Map<String, Field> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Field
    <R> -> Field

'it' @ [23:51] ==> value-parameter it: Map.Entry<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema.fields.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [23:54] ==> public abstract val value: Field defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'copy' @ [23:60] ==> public abstract fun copy(name: String, field: Class<out Any?>): Field defined in net.corda.nodeapi.internal.serialization.carpenter.Field[SimpleFunctionDescriptorImpl]

'it' @ [23:65] ==> value-parameter it: Map.Entry<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema.fields.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [23:68] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [23:73] ==> value-parameter it: Map.Entry<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema.fields.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [23:76] ==> public abstract val value: Field defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'field' @ [23:82] ==> public final val field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'+' @ [26:13] ==> public operator fun <K, V> Map<out String, Field>.plus(map: Map<out String, Field>): Map<String, Field> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Field

'superclass' @ [26:14] ==> public final val superclass: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'fieldsIncludingSuperclasses' @ [26:26] ==> public final fun fieldsIncludingSuperclasses(): Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[SimpleFunctionDescriptorImpl]

'emptyMap' @ [26:59] ==> public fun <K, V> emptyMap(): Map<String, Field> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Field

'LinkedHashMap' @ [26:73] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>(p0: (MutableMap<out (String..String?), out (Field..Field?)>..Map<out (String..String?), (Field..Field?)>?)) defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> Field

'fields' @ [26:87] ==> public final val fields: LinkedHashMap<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'+' @ [29:13] ==> public operator fun <K, V> Map<out String, String>.plus(map: Map<out String, String>): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'superclass' @ [29:14] ==> public final val superclass: Schema? defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'descriptorsIncludingSuperclasses' @ [29:26] ==> public final fun descriptorsIncludingSuperclasses(): Map<String, String> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[SimpleFunctionDescriptorImpl]

'emptyMap' @ [29:64] ==> public fun <K, V> emptyMap(): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'fields' @ [29:78] ==> public final val fields: LinkedHashMap<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'descriptors' @ [29:85] ==> private final fun Map<String, Field>.descriptors(): LinkedHashMap<String, String> defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[SimpleFunctionDescriptorImpl]

'name' @ [32:17] ==> public final val name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[PropertyDescriptorImpl]

'replace' @ [32:22] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [39:38] ==> public fun <T> emptyList(): List<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'Schema' @ [40:5] ==> public constructor Schema(name: String, fields: Map<String, Field>, superclass: Schema? = ..., interfaces: List<Class<*>> = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[ClassConstructorDescriptorImpl]

'name' @ [40:12] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.ClassSchema.<init>[ValueParameterDescriptorImpl]

'fields' @ [40:18] ==> value-parameter fields: Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.ClassSchema.<init>[ValueParameterDescriptorImpl]

'superclass' @ [40:26] ==> value-parameter superclass: Schema? = ... defined in net.corda.nodeapi.internal.serialization.carpenter.ClassSchema.<init>[ValueParameterDescriptorImpl]

'interfaces' @ [40:38] ==> value-parameter interfaces: List<Class<*>> = ... defined in net.corda.nodeapi.internal.serialization.carpenter.ClassSchema.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [46:38] ==> public fun <T> emptyList(): List<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'Schema' @ [47:5] ==> public constructor Schema(name: String, fields: Map<String, Field>, superclass: Schema? = ..., interfaces: List<Class<*>> = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.Schema[ClassConstructorDescriptorImpl]

'name' @ [47:12] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.InterfaceSchema.<init>[ValueParameterDescriptorImpl]

'fields' @ [47:18] ==> value-parameter fields: Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.InterfaceSchema.<init>[ValueParameterDescriptorImpl]

'superclass' @ [47:26] ==> value-parameter superclass: Schema? = ... defined in net.corda.nodeapi.internal.serialization.carpenter.InterfaceSchema.<init>[ValueParameterDescriptorImpl]

'interfaces' @ [47:38] ==> value-parameter interfaces: List<Class<*>> = ... defined in net.corda.nodeapi.internal.serialization.carpenter.InterfaceSchema.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [54:42] ==> public fun <T> emptyList(): List<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'if (isInterface) InterfaceSchema (name, fields, superclass, interfaces)
            else ClassSchema (name, fields, superclass, interfaces)' @ [57:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Schema, elseBranch: Schema): Schema[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Schema

'isInterface' @ [57:17] ==> value-parameter isInterface: Boolean = ... defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory.newInstance[ValueParameterDescriptorImpl]

'InterfaceSchema' @ [57:30] ==> public constructor InterfaceSchema(name: String, fields: Map<String, Field>, superclass: Schema? = ..., interfaces: List<Class<*>> = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.InterfaceSchema[ClassConstructorDescriptorImpl]

'name' @ [57:47] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory.newInstance[ValueParameterDescriptorImpl]

'fields' @ [57:53] ==> value-parameter fields: Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory.newInstance[ValueParameterDescriptorImpl]

'superclass' @ [57:61] ==> value-parameter superclass: Schema? = ... defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory.newInstance[ValueParameterDescriptorImpl]

'interfaces' @ [57:73] ==> value-parameter interfaces: List<Class<*>> = ... defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory.newInstance[ValueParameterDescriptorImpl]

'ClassSchema' @ [58:18] ==> public constructor ClassSchema(name: String, fields: Map<String, Field>, superclass: Schema? = ..., interfaces: List<Class<*>> = ...) defined in net.corda.nodeapi.internal.serialization.carpenter.ClassSchema[ClassConstructorDescriptorImpl]

'name' @ [58:31] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory.newInstance[ValueParameterDescriptorImpl]

'fields' @ [58:37] ==> value-parameter fields: Map<String, Field> defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory.newInstance[ValueParameterDescriptorImpl]

'superclass' @ [58:45] ==> value-parameter superclass: Schema? = ... defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory.newInstance[ValueParameterDescriptorImpl]

'interfaces' @ [58:57] ==> value-parameter interfaces: List<Class<*>> = ... defined in net.corda.nodeapi.internal.serialization.carpenter.CarpenterSchemaFactory.newInstance[ValueParameterDescriptorImpl]

'unsetName' @ [66:24] ==> public const final val unsetName: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field.Companion[PropertyDescriptorImpl]

'getDescriptor' @ [70:22] ==> public open fun getDescriptor(p0: raw (Class<(Any..Any?)>..Class<*>?)): (String..String?) defined in org.objectweb.asm.Type[JavaMethodDescriptor]

'this' @ [70:36] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[LazyClassReceiverParameterDescriptor]

'field' @ [70:41] ==> public final val field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'if (this.field.isPrimitive) this.descriptor else "Ljava/lang/Object;"' @ [73:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'this' @ [73:21] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[LazyClassReceiverParameterDescriptor]

'field' @ [73:26] ==> public final val field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'isPrimitive' @ [73:32] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'this' @ [73:45] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[LazyClassReceiverParameterDescriptor]

'descriptor' @ [73:50] ==> public final val descriptor: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'cw' @ [76:28] ==> value-parameter cw: ClassWriter defined in net.corda.nodeapi.internal.serialization.carpenter.Field.generateField[ValueParameterDescriptorImpl]

'visitField' @ [76:31] ==> public final fun visitField(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: (Any..Any?)): (FieldVisitor..FieldVisitor?) defined in org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

'ACC_PROTECTED' @ [76:42] ==> public const final val ACC_PROTECTED: Int defined in jdk.internal.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'ACC_FINAL' @ [76:58] ==> public const final val ACC_FINAL: Int defined in jdk.internal.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'name' @ [76:69] ==> public final var name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'descriptor' @ [76:75] ==> public final val descriptor: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'fieldVisitor' @ [77:9] ==> val fieldVisitor: (FieldVisitor..FieldVisitor?) defined in net.corda.nodeapi.internal.serialization.carpenter.Field.generateField[LocalVariableDescriptor]

'visitAnnotation' @ [77:22] ==> public open fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.objectweb.asm.FieldVisitor[JavaMethodDescriptor]

'nullabilityAnnotation' @ [77:38] ==> public abstract val nullabilityAnnotation: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'visitEnd' @ [77:67] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'fieldVisitor' @ [78:9] ==> val fieldVisitor: (FieldVisitor..FieldVisitor?) defined in net.corda.nodeapi.internal.serialization.carpenter.Field.generateField[LocalVariableDescriptor]

'visitEnd' @ [78:22] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.FieldVisitor[JavaMethodDescriptor]

'mv' @ [82:9] ==> value-parameter mv: MethodVisitor defined in net.corda.nodeapi.internal.serialization.carpenter.Field.addNullabilityAnnotation[ValueParameterDescriptorImpl]

'visitAnnotation' @ [82:12] ==> public open fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'nullabilityAnnotation' @ [82:28] ==> public abstract val nullabilityAnnotation: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'visitEnd' @ [82:57] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'with' @ [86:9] ==> @InlineOnly public inline fun <T, R> with(receiver: MethodVisitor, block: MethodVisitor.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodVisitor
    <R> -> Unit

'mv' @ [86:14] ==> value-parameter mv: MethodVisitor defined in net.corda.nodeapi.internal.serialization.carpenter.Field.visitParameter[ValueParameterDescriptorImpl]

'visitParameter' @ [87:13] ==> public open fun visitParameter(p0: (String..String?), p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'name' @ [87:28] ==> public final var name: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'!' @ [88:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'field' @ [88:18] ==> public final val field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'isPrimitive' @ [88:24] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'visitParameterAnnotation' @ [89:17] ==> public open fun visitParameterAnnotation(p0: Int, p1: (String..String?), p2: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'idx' @ [89:42] ==> value-parameter idx: Int defined in net.corda.nodeapi.internal.serialization.carpenter.Field.visitParameter[ValueParameterDescriptorImpl]

'nullabilityAnnotation' @ [89:47] ==> public abstract val nullabilityAnnotation: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field[PropertyDescriptorImpl]

'visitEnd' @ [89:76] ==> public open fun visitEnd(): Unit defined in org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'Field' @ [98:50] ==> public constructor Field(field: Class<out Any?>) defined in net.corda.nodeapi.internal.serialization.carpenter.Field[ClassConstructorDescriptorImpl]

'field' @ [98:56] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField.<init>[ValueParameterDescriptorImpl]

'this' @ [101:57] ==> public constructor NonNullableField(field: Class<out Any?>) defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField[ClassConstructorDescriptorImpl]

'field' @ [101:62] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField.<init>[ValueParameterDescriptorImpl]

'this' @ [102:9] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField[LazyClassReceiverParameterDescriptor]

'name' @ [102:14] ==> public final var name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField[PropertyDescriptorImpl]

'name' @ [102:21] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField.<init>[ValueParameterDescriptorImpl]

'NonNullableField' @ [105:63] ==> public constructor NonNullableField(name: String, field: Class<out Any?>) defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField[ClassConstructorDescriptorImpl]

'name' @ [105:80] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField.copy[ValueParameterDescriptorImpl]

'field' @ [105:86] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField.copy[ValueParameterDescriptorImpl]

'assert' @ [108:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'name' @ [108:16] ==> public final var name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField[PropertyDescriptorImpl]

'unsetName' @ [108:24] ==> public const final val unsetName: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field.Companion[PropertyDescriptorImpl]

'!' @ [110:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'field' @ [110:14] ==> public final val field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField[PropertyDescriptorImpl]

'isPrimitive' @ [110:20] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'with' @ [111:13] ==> @InlineOnly public inline fun <T, R> with(receiver: MethodVisitor, block: MethodVisitor.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MethodVisitor
    <R> -> Unit

'mv' @ [111:18] ==> value-parameter mv: MethodVisitor defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField.nullTest[ValueParameterDescriptorImpl]

'visitVarInsn' @ [112:17] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [112:30] ==> public const final val ALOAD: Int defined in jdk.internal.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitVarInsn' @ [113:17] ==> public open fun visitVarInsn(p0: Int, p1: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'ALOAD' @ [113:30] ==> public const final val ALOAD: Int defined in jdk.internal.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'slot' @ [113:37] ==> value-parameter slot: Int defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField.nullTest[ValueParameterDescriptorImpl]

'visitLdcInsn' @ [114:17] ==> public open fun visitLdcInsn(p0: (Any..Any?)): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'name' @ [114:40] ==> public final var name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField[PropertyDescriptorImpl]

'visitMethodInsn' @ [115:17] ==> public open fun visitMethodInsn(p0: Int, p1: (String..String?), p2: (String..String?), p3: (String..String?), p4: Boolean): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'INVOKESTATIC' @ [115:33] ==> public const final val INVOKESTATIC: Int defined in jdk.internal.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'visitInsn' @ [119:17] ==> public open fun visitInsn(p0: Int): Unit defined in org.objectweb.asm.MethodVisitor[JavaMethodDescriptor]

'POP' @ [119:27] ==> public const final val POP: Int defined in jdk.internal.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'Field' @ [125:47] ==> public constructor Field(field: Class<out Any?>) defined in net.corda.nodeapi.internal.serialization.carpenter.Field[ClassConstructorDescriptorImpl]

'field' @ [125:53] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField.<init>[ValueParameterDescriptorImpl]

'this' @ [128:57] ==> public constructor NullableField(field: Class<out Any?>) defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField[ClassConstructorDescriptorImpl]

'field' @ [128:62] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField.<init>[ValueParameterDescriptorImpl]

'field' @ [129:13] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField.<init>[ValueParameterDescriptorImpl]

'isPrimitive' @ [129:19] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'NullablePrimitiveException' @ [130:19] ==> public constructor NullablePrimitiveException(msg: String) defined in net.corda.nodeapi.internal.serialization.carpenter.NullablePrimitiveException[ClassConstructorDescriptorImpl]

'name' @ [131:29] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField.<init>[ValueParameterDescriptorImpl]

'getDescriptor' @ [131:59] ==> public open fun getDescriptor(p0: raw (Class<(Any..Any?)>..Class<*>?)): (String..String?) defined in org.objectweb.asm.Type[JavaMethodDescriptor]

'field' @ [131:73] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField.<init>[ValueParameterDescriptorImpl]

'this' @ [134:9] ==> <this> defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField[LazyClassReceiverParameterDescriptor]

'name' @ [134:14] ==> public final var name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField[PropertyDescriptorImpl]

'name' @ [134:21] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField.<init>[ValueParameterDescriptorImpl]

'NullableField' @ [137:63] ==> public constructor NullableField(name: String, field: Class<out Any?>) defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField[ClassConstructorDescriptorImpl]

'name' @ [137:77] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField.copy[ValueParameterDescriptorImpl]

'field' @ [137:83] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField.copy[ValueParameterDescriptorImpl]

'assert' @ [140:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'name' @ [140:16] ==> public final var name: String defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField[PropertyDescriptorImpl]

'unsetName' @ [140:24] ==> public const final val unsetName: String defined in net.corda.nodeapi.internal.serialization.carpenter.Field.Companion[PropertyDescriptorImpl]

'if (mandatory) NonNullableField (name, field) else NullableField (name, field)' @ [146:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Field, elseBranch: Field): Field[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Field

'mandatory' @ [146:17] ==> value-parameter mandatory: Boolean defined in net.corda.nodeapi.internal.serialization.carpenter.FieldFactory.newInstance[ValueParameterDescriptorImpl]

'NonNullableField' @ [146:28] ==> public constructor NonNullableField(name: String, field: Class<out Any?>) defined in net.corda.nodeapi.internal.serialization.carpenter.NonNullableField[ClassConstructorDescriptorImpl]

'name' @ [146:46] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.FieldFactory.newInstance[ValueParameterDescriptorImpl]

'field' @ [146:52] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.FieldFactory.newInstance[ValueParameterDescriptorImpl]

'NullableField' @ [146:64] ==> public constructor NullableField(name: String, field: Class<out Any?>) defined in net.corda.nodeapi.internal.serialization.carpenter.NullableField[ClassConstructorDescriptorImpl]

'name' @ [146:79] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.carpenter.FieldFactory.newInstance[ValueParameterDescriptorImpl]

'field' @ [146:85] ==> value-parameter field: Class<out Any?> defined in net.corda.nodeapi.internal.serialization.carpenter.FieldFactory.newInstance[ValueParameterDescriptorImpl]

