'emptyList' @ [17:75] ==> public fun <T> emptyList(): List<CustomSerializer<out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CustomSerializer<out Any>

'data' @ [33:9] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.writeObject[ValueParameterDescriptorImpl]

'withDescribed' @ [33:14] ==> public fun Data.withDescribed(descriptor: Descriptor, block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [33:28] ==> protected abstract val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[PropertyDescriptorImpl]

'Suppress' @ [34:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'writeDescribedObject' @ [35:13] ==> public abstract fun writeDescribedObject(obj: T, data: Data, type: Type, output: SerializationOutput): Unit defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[SimpleFunctionDescriptorImpl]

'obj' @ [35:34] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.writeObject[ValueParameterDescriptorImpl]

'data' @ [35:44] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.writeObject[ValueParameterDescriptorImpl]

'type' @ [35:50] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.writeObject[ValueParameterDescriptorImpl]

'output' @ [35:56] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.writeObject[ValueParameterDescriptorImpl]

'CustomSerializer<T>' @ [47:113] ==> public constructor CustomSerializer<T>() defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'Schema' @ [49:47] ==> public constructor Schema(types: List<TypeNotation>) defined in net.corda.nodeapi.internal.serialization.amqp.Schema[ClassConstructorDescriptorImpl]

'emptyList' @ [49:54] ==> public fun <T> emptyList(): List<TypeNotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeNotation

'clazz' @ [51:66] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass.isSerializerFor[ValueParameterDescriptorImpl]

'this' @ [51:75] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[LazyClassReceiverParameterDescriptor]

'clazz' @ [51:80] ==> protected final val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'clazz' @ [52:41] ==> protected final val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'DESCRIPTOR_DOMAIN' @ [53:49] ==> public val DESCRIPTOR_DOMAIN: String defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[PropertyDescriptorImpl]

'fingerprintForDescriptors' @ [53:69] ==> internal fun fingerprintForDescriptors(vararg typeDescriptors: String): String defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[SimpleFunctionDescriptorImpl]

'superClassSerializer' @ [53:95] ==> protected final val superClassSerializer: CustomSerializer<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'typeDescriptor' @ [53:116] ==> public abstract val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[PropertyDescriptorImpl]

'nameForType' @ [53:132] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[FunctionImportedFromObject]

'clazz' @ [53:144] ==> protected final val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'RestrictedType' @ [54:50] ==> public constructor RestrictedType(name: String, label: String?, provides: List<String>, source: String, descriptor: Descriptor, choices: List<Choice>) defined in net.corda.nodeapi.internal.serialization.amqp.RestrictedType[ClassConstructorDescriptorImpl]

'nameForType' @ [54:83] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'clazz' @ [54:95] ==> protected final val clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'emptyList' @ [54:109] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'nameForType' @ [54:140] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'superClassSerializer' @ [54:152] ==> protected final val superClassSerializer: CustomSerializer<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'type' @ [54:173] ==> public abstract val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[PropertyDescriptorImpl]

'Descriptor' @ [54:180] ==> public constructor Descriptor(name: String?, code: UnsignedLong? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[ClassConstructorDescriptorImpl]

'typeDescriptor' @ [54:191] ==> public open val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'emptyList' @ [54:214] ==> public fun <T> emptyList(): List<Choice> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Choice

'output' @ [56:13] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass.writeClassInfo[ValueParameterDescriptorImpl]

'writeTypeNotations' @ [56:20] ==> internal open fun writeTypeNotations(vararg typeNotation: TypeNotation): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'typeNotation' @ [56:39] ==> private final val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'Descriptor' @ [59:47] ==> public constructor Descriptor(name: String?, code: UnsignedLong? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[ClassConstructorDescriptorImpl]

'typeDescriptor' @ [59:58] ==> public open val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'superClassSerializer' @ [62:13] ==> protected final val superClassSerializer: CustomSerializer<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'writeDescribedObject' @ [62:34] ==> public abstract fun writeDescribedObject(obj: T, data: Data, type: Type, output: SerializationOutput): Unit defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[SimpleFunctionDescriptorImpl]

'obj' @ [62:55] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass.writeDescribedObject[ValueParameterDescriptorImpl]

'data' @ [62:60] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass.writeDescribedObject[ValueParameterDescriptorImpl]

'type' @ [62:66] ==> value-parameter type: Type defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass.writeDescribedObject[ValueParameterDescriptorImpl]

'output' @ [62:72] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass.writeDescribedObject[ValueParameterDescriptorImpl]

'superClassSerializer' @ [66:20] ==> protected final val superClassSerializer: CustomSerializer<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass[PropertyDescriptorImpl]

'readObject' @ [66:41] ==> public abstract fun readObject(obj: Any, schema: Schema, input: DeserializationInput): T defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[SimpleFunctionDescriptorImpl]

'obj' @ [66:52] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass.readObject[ValueParameterDescriptorImpl]

'schema' @ [66:57] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass.readObject[ValueParameterDescriptorImpl]

'input' @ [66:65] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.SubClass.readObject[ValueParameterDescriptorImpl]

'CustomSerializer<T>' @ [74:116] ==> public constructor CustomSerializer<T>() defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'clazz' @ [75:41] ==> protected final val clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[PropertyDescriptorImpl]

'DESCRIPTOR_DOMAIN' @ [76:49] ==> public val DESCRIPTOR_DOMAIN: String defined in net.corda.nodeapi.internal.serialization.amqp in file Schema.kt[PropertyDescriptorImpl]

'nameForType' @ [76:69] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[FunctionImportedFromObject]

'clazz' @ [76:81] ==> protected final val clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[PropertyDescriptorImpl]

'Descriptor' @ [78:47] ==> public constructor Descriptor(name: String?, code: UnsignedLong? = ...) defined in net.corda.nodeapi.internal.serialization.amqp.Descriptor[ClassConstructorDescriptorImpl]

'typeDescriptor' @ [78:58] ==> public open val typeDescriptor: String defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[PropertyDescriptorImpl]

'if (withInheritance) this.clazz.isAssignableFrom(clazz) else this.clazz == clazz' @ [79:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'withInheritance' @ [79:70] ==> protected final val withInheritance: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[PropertyDescriptorImpl]

'this' @ [79:87] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[LazyClassReceiverParameterDescriptor]

'clazz' @ [79:92] ==> protected final val clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[PropertyDescriptorImpl]

'isAssignableFrom' @ [79:98] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'clazz' @ [79:115] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp.isSerializerFor[ValueParameterDescriptorImpl]

'this' @ [79:127] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[LazyClassReceiverParameterDescriptor]

'clazz' @ [79:132] ==> protected final val clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[PropertyDescriptorImpl]

'clazz' @ [79:141] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp.isSerializerFor[ValueParameterDescriptorImpl]

'CustomSerializerImp<T>' @ [85:45] ==> public constructor CustomSerializerImp<T>(clazz: Class<T>, withInheritance: Boolean) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'clazz' @ [85:68] ==> value-parameter clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Is.<init>[ValueParameterDescriptorImpl]

'CustomSerializerImp<T>' @ [90:53] ==> public constructor CustomSerializerImp<T>(clazz: Class<T>, withInheritance: Boolean) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'clazz' @ [90:76] ==> value-parameter clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Implements.<init>[ValueParameterDescriptorImpl]

'CustomSerializerImp<T>' @ [102:67] ==> public constructor CustomSerializerImp<T>(clazz: Class<T>, withInheritance: Boolean) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'clazz' @ [102:90] ==> value-parameter clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.<init>[ValueParameterDescriptorImpl]

'withInheritance' @ [102:97] ==> value-parameter withInheritance: Boolean = ... defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.<init>[ValueParameterDescriptorImpl]

'if (withInheritance) this.clazz.isAssignableFrom(clazz) else this.clazz == clazz' @ [103:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'withInheritance' @ [103:70] ==> protected final val withInheritance: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'this' @ [103:87] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[LazyClassReceiverParameterDescriptor]

'clazz' @ [103:92] ==> protected final val clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'isAssignableFrom' @ [103:98] ==> public open fun isAssignableFrom(p0: (Class<*>..Class<*>?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'clazz' @ [103:115] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.isSerializerFor[ValueParameterDescriptorImpl]

'this' @ [103:127] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[LazyClassReceiverParameterDescriptor]

'clazz' @ [103:132] ==> protected final val clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'clazz' @ [103:141] ==> value-parameter clazz: Class<*> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.isSerializerFor[ValueParameterDescriptorImpl]

'getValue' @ [105:58] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'ObjectSerializer' @ [105:65] ==> public constructor ObjectSerializer(clazz: Type, factory: SerializerFactory) defined in net.corda.nodeapi.internal.serialization.amqp.ObjectSerializer[ClassConstructorDescriptorImpl]

'proxyClass' @ [105:82] ==> protected final val proxyClass: Class<P> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'factory' @ [105:94] ==> protected final val factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'getValue' @ [107:56] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'mutableSetOf' @ [108:33] ==> public fun <T> mutableSetOf(vararg elements: TypeNotation): MutableSet<TypeNotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeNotation

'CompositeType' @ [108:60] ==> public constructor CompositeType(name: String, label: String?, provides: List<String>, descriptor: Descriptor, fields: List<Field>) defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[ClassConstructorDescriptorImpl]

'nameForType' @ [108:74] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[FunctionImportedFromObject]

'type' @ [108:86] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'emptyList' @ [108:99] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'descriptor' @ [108:112] ==> protected open val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'proxySerializer' @ [108:125] ==> private final val proxySerializer: ObjectSerializer defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'typeNotation' @ [108:141] ==> internal open val typeNotation: TypeNotation defined in net.corda.nodeapi.internal.serialization.amqp.ObjectSerializer[PropertyDescriptorImpl]

'fields' @ [108:172] ==> public final val fields: List<Field> defined in net.corda.nodeapi.internal.serialization.amqp.CompositeType[PropertyDescriptorImpl]

'additionalSerializers' @ [109:32] ==> public open val additionalSerializers: Iterable<CustomSerializer<out Any>> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'typeNotations' @ [110:17] ==> val typeNotations: MutableSet<TypeNotation> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.schemaForDocumentation.<anonymous>[LocalVariableDescriptor]

'addAll' @ [110:31] ==> public abstract fun addAll(elements: Collection<TypeNotation>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'additional' @ [110:38] ==> val additional: CustomSerializer<out Any> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.schemaForDocumentation.<anonymous>[LocalVariableDescriptor]

'schemaForDocumentation' @ [110:49] ==> public abstract val schemaForDocumentation: Schema defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer[PropertyDescriptorImpl]

'types' @ [110:72] ==> public final val types: List<TypeNotation> defined in net.corda.nodeapi.internal.serialization.amqp.Schema[PropertyDescriptorImpl]

'Schema' @ [112:13] ==> public constructor Schema(types: List<TypeNotation>) defined in net.corda.nodeapi.internal.serialization.amqp.Schema[ClassConstructorDescriptorImpl]

'typeNotations' @ [112:20] ==> val typeNotations: MutableSet<TypeNotation> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.schemaForDocumentation.<anonymous>[LocalVariableDescriptor]

'toList' @ [112:34] ==> public fun <T> Iterable<TypeNotation>.toList(): List<TypeNotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeNotation

'toProxy' @ [123:25] ==> protected abstract fun toProxy(obj: T): P defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[SimpleFunctionDescriptorImpl]

'obj' @ [123:33] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.writeDescribedObject[ValueParameterDescriptorImpl]

'data' @ [124:13] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.writeDescribedObject[ValueParameterDescriptorImpl]

'withList' @ [124:18] ==> public fun Data.withList(block: Data.() -> Unit): Unit defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'proxySerializer' @ [125:34] ==> private final val proxySerializer: ObjectSerializer defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'propertySerializers' @ [125:50] ==> internal open val propertySerializers: Collection<PropertySerializer> defined in net.corda.nodeapi.internal.serialization.amqp.ObjectSerializer[PropertyDescriptorImpl]

'property' @ [126:21] ==> val property: PropertySerializer defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.writeDescribedObject.<anonymous>[LocalVariableDescriptor]

'writeProperty' @ [126:30] ==> public abstract fun writeProperty(obj: Any?, data: Data, output: SerializationOutput): Unit defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[SimpleFunctionDescriptorImpl]

'proxy' @ [126:44] ==> val proxy: P defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.writeDescribedObject[LocalVariableDescriptor]

'this' @ [126:51] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.writeDescribedObject.<anonymous>[ReceiverParameterDescriptorImpl]

'output' @ [126:57] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.writeDescribedObject[ValueParameterDescriptorImpl]

'Suppress' @ [132:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'proxySerializer' @ [133:25] ==> private final val proxySerializer: ObjectSerializer defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[PropertyDescriptorImpl]

'readObject' @ [133:41] ==> public open fun readObject(obj: Any, schema: Schema, input: DeserializationInput): Any defined in net.corda.nodeapi.internal.serialization.amqp.ObjectSerializer[SimpleFunctionDescriptorImpl]

'obj' @ [133:52] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.readObject[ValueParameterDescriptorImpl]

'schema' @ [133:57] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.readObject[ValueParameterDescriptorImpl]

'input' @ [133:65] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.readObject[ValueParameterDescriptorImpl]

'fromProxy' @ [134:20] ==> protected abstract fun fromProxy(proxy: P): T defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy[SimpleFunctionDescriptorImpl]

'proxy' @ [134:30] ==> val proxy: P defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.Proxy.readObject[LocalVariableDescriptor]

'clazz' @ [150:67] ==> value-parameter clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.<init>[ValueParameterDescriptorImpl]

'getConstructor' @ [150:73] ==> @CallerSensitive public open fun getConstructor(vararg p0: (Class<*>..Class<*>?)): (Constructor<(T..T?)>..Constructor<(T..T?)>?) defined in java.lang.Class[JavaMethodDescriptor]

'String' @ [150:88] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [150:102] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'let' @ [150:108] ==> @InlineOnly public inline fun <T, R> (Constructor<(T..T?)>..Constructor<(T..T?)>?).let(block: ((Constructor<(T..T?)>..Constructor<(T..T?)>?)) -> (String) -> (T..T?)): (String) -> (T..T?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Constructor<(T..T?)>..java.lang.reflect.Constructor<(T..T?)>?)
    <R> -> Function1<String, (T..T?)>

'`constructor`' @ [152:48] ==> value-parameter constructor: (Constructor<(T..T?)>..Constructor<(T..T?)>?) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.<init>.<anonymous>[ValueParameterDescriptorImpl]

'newInstance' @ [152:62] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (T..T?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'string' @ [152:74] ==> value-parameter string: String defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.<init>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'obj' @ [154:78] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.<init>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [154:82] ==> public fun Any?.toString(): String defined in kotlin[DeserializedSimpleFunctionDescriptor]

'CustomSerializerImp<T>' @ [155:11] ==> public constructor CustomSerializerImp<T>(clazz: Class<T>, withInheritance: Boolean) defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.CustomSerializerImp[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> T

'clazz' @ [155:34] ==> value-parameter clazz: Class<T> defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.<init>[ValueParameterDescriptorImpl]

'withInheritance' @ [155:41] ==> value-parameter withInheritance: Boolean = ... defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.<init>[ValueParameterDescriptorImpl]

'Schema' @ [157:47] ==> public constructor Schema(types: List<TypeNotation>) defined in net.corda.nodeapi.internal.serialization.amqp.Schema[ClassConstructorDescriptorImpl]

'listOf' @ [158:17] ==> public fun <T> listOf(element: RestrictedType): List<RestrictedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RestrictedType

'RestrictedType' @ [158:24] ==> public constructor RestrictedType(name: String, label: String?, provides: List<String>, source: String, descriptor: Descriptor, choices: List<Choice>) defined in net.corda.nodeapi.internal.serialization.amqp.RestrictedType[ClassConstructorDescriptorImpl]

'nameForType' @ [158:39] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[FunctionImportedFromObject]

'type' @ [158:51] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString[PropertyDescriptorImpl]

'listOf' @ [158:62] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'nameForType' @ [158:69] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[FunctionImportedFromObject]

'type' @ [158:81] ==> public open val type: Type defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString[PropertyDescriptorImpl]

'!!' @ [159:25] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'primitiveTypeName' @ [159:43] ==> public final fun primitiveTypeName(type: Type): String? defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'String' @ [159:61] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [159:75] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'descriptor' @ [160:25] ==> protected open val descriptor: Descriptor defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString[PropertyDescriptorImpl]

'emptyList' @ [160:37] ==> public fun <T> emptyList(): List<Choice> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Choice

'data' @ [163:13] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.writeDescribedObject[ValueParameterDescriptorImpl]

'putObject' @ [163:18] ==> public abstract fun putObject(p0: (Any..Any?)): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'invoke' @ [163:28] ==> public abstract operator fun invoke(p1: T): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'obj' @ [163:36] ==> value-parameter obj: T defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.writeDescribedObject[ValueParameterDescriptorImpl]

'input' @ [167:25] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.readObject[ValueParameterDescriptorImpl]

'readObject' @ [167:31] ==> internal final fun readObject(obj: Any, schema: Schema, type: Type): Any defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'obj' @ [167:42] ==> value-parameter obj: Any defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.readObject[ValueParameterDescriptorImpl]

'schema' @ [167:47] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.readObject[ValueParameterDescriptorImpl]

'String' @ [167:55] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'java' @ [167:69] ==> public val <T> KClass<String>.java: Class<String> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> String

'invoke' @ [168:20] ==> public abstract operator fun invoke(p1: String): T defined in kotlin.Function1[FunctionInvokeDescriptor]

'proxy' @ [168:26] ==> val proxy: String defined in net.corda.nodeapi.internal.serialization.amqp.CustomSerializer.ToString.readObject[LocalVariableDescriptor]

