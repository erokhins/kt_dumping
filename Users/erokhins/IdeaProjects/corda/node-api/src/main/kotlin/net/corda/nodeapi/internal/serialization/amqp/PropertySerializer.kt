'generateType' @ [18:24] ==> private final fun generateType(): String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[SimpleFunctionDescriptorImpl]

'generateRequires' @ [19:34] ==> private final fun generateRequires(): List<String> defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[SimpleFunctionDescriptorImpl]

'generateDefault' @ [20:28] ==> private final fun generateDefault(): String? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[SimpleFunctionDescriptorImpl]

'generateMandatory' @ [21:30] ==> private final fun generateMandatory(): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[SimpleFunctionDescriptorImpl]

'resolvedType' @ [23:46] ==> public final val resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'asClass' @ [23:59] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'isInterface' @ [23:70] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isInterface: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'resolvedType' @ [24:49] ==> public final val resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'asClass' @ [24:62] ==> internal fun Type.asClass(): Class<*>? defined in net.corda.nodeapi.internal.serialization.amqp in file SerializationHelper.kt[SimpleFunctionDescriptorImpl]

'isPrimitive' @ [24:73] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.isPrimitive: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'if (isInterface || resolvedType == Any::class.java) "*" else SerializerFactory.nameForType(resolvedType)' @ [27:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isInterface' @ [27:20] ==> private final val isInterface: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'resolvedType' @ [27:35] ==> public final val resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'Any' @ [27:51] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [27:62] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'nameForType' @ [27:95] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'resolvedType' @ [27:107] ==> public final val resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'if (isInterface) listOf(SerializerFactory.nameForType(resolvedType)) else emptyList()' @ [31:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'isInterface' @ [31:20] ==> private final val isInterface: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'listOf' @ [31:33] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'nameForType' @ [31:58] ==> public final fun nameForType(type: Type): String defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'resolvedType' @ [31:70] ==> public final val resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'emptyList' @ [31:90] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'if (isJVMPrimitive) {
            return when (resolvedType) {
                java.lang.Boolean.TYPE -> "false"
                java.lang.Character.TYPE -> "&#0"
                else -> "0"
            }
        } else {
            return null
        }' @ [35:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'isJVMPrimitive' @ [35:13] ==> private final val isJVMPrimitive: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'when (resolvedType) {
                java.lang.Boolean.TYPE -> "false"
                java.lang.Character.TYPE -> "&#0"
                else -> "0"
            }' @ [36:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String?, entry1: String?, entry2: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String?

'resolvedType' @ [36:26] ==> public final val resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'TYPE' @ [37:35] ==> public final val TYPE: (Class<(Boolean..Boolean?)>..Class<(Boolean..Boolean?)>?) defined in java.lang.Boolean[JavaPropertyDescriptor]

'TYPE' @ [38:37] ==> public final val TYPE: (Class<(Char..Char?)>..Class<(Char..Char?)>?) defined in java.lang.Character[JavaPropertyDescriptor]

'isJVMPrimitive' @ [47:16] ==> private final val isJVMPrimitive: Boolean defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'!' @ [47:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'readMethod' @ [47:36] ==> public final val readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[PropertyDescriptorImpl]

'returnsNullable' @ [47:48] ==> private final fun Method.returnsNullable(): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[SimpleFunctionDescriptorImpl]

'this' @ [51:32] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.returnsNullable[ReceiverParameterDescriptorImpl]

'declaringClass' @ [51:37] ==> public final val Method.declaringClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'kotlin' @ [51:52] ==> public val <T : Any> Class<out (Any..Any?)>.kotlin: KClass<out (Any..Any?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(*)

'memberProperties' @ [51:59] ==> @SinceKotlin public val <T : Any> KClass<out (Any..Any?)>.memberProperties: Collection<KProperty1<out (Any..Any?), Any?>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(out (kotlin.Any..kotlin.Any?))

'firstOrNull' @ [51:76] ==> public inline fun <T> Iterable<KProperty1<out (Any..Any?), Any?>>.firstOrNull(predicate: (KProperty1<out (Any..Any?), Any?>) -> Boolean): KProperty1<out (Any..Any?), Any?>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<out (kotlin.Any..kotlin.Any?), Any?>

'it' @ [51:90] ==> value-parameter it: KProperty1<out (Any..Any?), Any?> defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.returnsNullable.<anonymous>[ValueParameterDescriptorImpl]

'javaGetter' @ [51:93] ==> public val KProperty<*>.javaGetter: Method? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'this' @ [51:107] ==> <this> defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.returnsNullable[ReceiverParameterDescriptorImpl]

'returnType' @ [51:115] ==> public abstract val returnType: KType defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'toString' @ [51:127] ==> public open fun toString(): String defined in kotlin.reflect.KType[DeserializedSimpleFunctionDescriptor]

'returnTypeString' @ [52:16] ==> val returnTypeString: String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.returnsNullable[LocalVariableDescriptor]

'endsWith' @ [52:33] ==> public fun CharSequence.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'returnTypeString' @ [52:50] ==> val returnTypeString: String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.returnsNullable[LocalVariableDescriptor]

'endsWith' @ [52:67] ==> public fun CharSequence.endsWith(char: Char, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'readMethod' @ [57:13] ==> value-parameter readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'isAccessible' @ [57:25] ==> public final var Method.isAccessible: Boolean[MyPropertyDescriptor]

'if (SerializerFactory.isPrimitive(resolvedType)) {
                return when(resolvedType) {
                    Char::class.java, Character::class.java -> AMQPCharPropertySerializer(name, readMethod)
                    else -> AMQPPrimitivePropertySerializer(name, readMethod, resolvedType)
                }
            } else {
                return DescribedTypePropertySerializer(name, readMethod, resolvedType) { factory.get(null, resolvedType) }
            }' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'SerializerFactory' @ [58:17] ==> public companion object defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[FakeCallableDescriptorForObject]

'isPrimitive' @ [58:35] ==> public final fun isPrimitive(type: Type): Boolean defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory.Companion[SimpleFunctionDescriptorImpl]

'resolvedType' @ [58:47] ==> value-parameter resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'when(resolvedType) {
                    Char::class.java, Character::class.java -> AMQPCharPropertySerializer(name, readMethod)
                    else -> AMQPPrimitivePropertySerializer(name, readMethod, resolvedType)
                }' @ [59:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PropertySerializer, entry1: PropertySerializer): PropertySerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PropertySerializer

'resolvedType' @ [59:29] ==> value-parameter resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'Char' @ [60:21] ==> public companion object defined in kotlin.Char[FakeCallableDescriptorForObject]

'java' @ [60:33] ==> public val <T> KClass<Char>.java: Class<Char> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Char

'Character' @ [60:39] ==> public constructor Character(p0: Char) defined in java.lang.Character[JavaClassConstructorDescriptor]

'java' @ [60:56] ==> public val <T> KClass<Character>.java: Class<Character> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Character

'AMQPCharPropertySerializer' @ [60:64] ==> public constructor AMQPCharPropertySerializer(name: String, readMethod: Method?) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer[ClassConstructorDescriptorImpl]

'name' @ [60:91] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'readMethod' @ [60:97] ==> value-parameter readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'AMQPPrimitivePropertySerializer' @ [61:29] ==> public constructor AMQPPrimitivePropertySerializer(name: String, readMethod: Method?, resolvedType: Type) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer[ClassConstructorDescriptorImpl]

'name' @ [61:61] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'readMethod' @ [61:67] ==> value-parameter readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'resolvedType' @ [61:79] ==> value-parameter resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'DescribedTypePropertySerializer' @ [64:24] ==> public constructor DescribedTypePropertySerializer(name: String, readMethod: Method?, resolvedType: Type, lazyTypeSerializer: () -> AMQPSerializer<*>) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer[ClassConstructorDescriptorImpl]

'name' @ [64:56] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'readMethod' @ [64:62] ==> value-parameter readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'resolvedType' @ [64:74] ==> value-parameter resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'factory' @ [64:90] ==> value-parameter factory: SerializerFactory defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'get' @ [64:98] ==> @Throws public final fun get(actualClass: Class<*>?, declaredType: Type): AMQPSerializer<Any> defined in net.corda.nodeapi.internal.serialization.amqp.SerializerFactory[SimpleFunctionDescriptorImpl]

'resolvedType' @ [64:108] ==> value-parameter resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.Companion.make[ValueParameterDescriptorImpl]

'PropertySerializer' @ [75:72] ==> private constructor PropertySerializer(name: String, readMethod: Method?, resolvedType: Type) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[ClassConstructorDescriptorImpl]

'name' @ [75:91] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.<init>[ValueParameterDescriptorImpl]

'readMethod' @ [75:97] ==> value-parameter readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.<init>[ValueParameterDescriptorImpl]

'resolvedType' @ [75:109] ==> value-parameter resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.<init>[ValueParameterDescriptorImpl]

'getValue' @ [77:58] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'invoke' @ [77:65] ==> public abstract operator fun invoke(): AMQPSerializer<*> defined in kotlin.Function0[FunctionInvokeDescriptor]

'resolvedType' @ [80:17] ==> public final val resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer[PropertyDescriptorImpl]

'Any' @ [80:33] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [80:44] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'typeSerializer' @ [81:17] ==> private final val typeSerializer: AMQPSerializer<*> defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer[PropertyDescriptorImpl]

'writeClassInfo' @ [81:32] ==> public abstract fun writeClassInfo(output: SerializationOutput): Unit defined in net.corda.nodeapi.internal.serialization.amqp.AMQPSerializer[SimpleFunctionDescriptorImpl]

'output' @ [81:47] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.writeClassInfo[ValueParameterDescriptorImpl]

'input' @ [86:20] ==> value-parameter input: DeserializationInput defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.readProperty[ValueParameterDescriptorImpl]

'readObjectOrNull' @ [86:26] ==> internal final fun readObjectOrNull(obj: Any?, schema: Schema, type: Type): Any? defined in net.corda.nodeapi.internal.serialization.amqp.DeserializationInput[SimpleFunctionDescriptorImpl]

'obj' @ [86:43] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.readProperty[ValueParameterDescriptorImpl]

'schema' @ [86:48] ==> value-parameter schema: Schema defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.readProperty[ValueParameterDescriptorImpl]

'resolvedType' @ [86:56] ==> public final val resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer[PropertyDescriptorImpl]

'output' @ [90:13] ==> value-parameter output: SerializationOutput defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.writeProperty[ValueParameterDescriptorImpl]

'writeObjectOrNull' @ [90:20] ==> internal final fun writeObjectOrNull(obj: Any?, data: Data, type: Type): Unit defined in net.corda.nodeapi.internal.serialization.amqp.SerializationOutput[SimpleFunctionDescriptorImpl]

'readMethod' @ [90:38] ==> public final val readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer[PropertyDescriptorImpl]

'invoke' @ [90:51] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'obj' @ [90:58] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.writeProperty[ValueParameterDescriptorImpl]

'data' @ [90:64] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer.writeProperty[ValueParameterDescriptorImpl]

'resolvedType' @ [90:70] ==> public final val resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.DescribedTypePropertySerializer[PropertyDescriptorImpl]

'PropertySerializer' @ [97:100] ==> private constructor PropertySerializer(name: String, readMethod: Method?, resolvedType: Type) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[ClassConstructorDescriptorImpl]

'name' @ [97:119] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.<init>[ValueParameterDescriptorImpl]

'readMethod' @ [97:125] ==> value-parameter readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.<init>[ValueParameterDescriptorImpl]

'resolvedType' @ [97:137] ==> value-parameter resolvedType: Type defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.<init>[ValueParameterDescriptorImpl]

'if (obj is Binary) obj.array else obj' @ [101:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'obj' @ [101:24] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.readProperty[ValueParameterDescriptorImpl]

'obj' @ [101:39] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.readProperty[ValueParameterDescriptorImpl]

'array' @ [101:43] ==> public final val Binary.array: (ByteArray..ByteArray?)[MyPropertyDescriptor]

'obj' @ [101:54] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.readProperty[ValueParameterDescriptorImpl]

'readMethod' @ [105:25] ==> public final val readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer[PropertyDescriptorImpl]

'invoke' @ [105:38] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'obj' @ [105:45] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.writeProperty[ValueParameterDescriptorImpl]

'if (value is ByteArray) {
                data.putObject(Binary(value))
            } else {
                data.putObject(value)
            }' @ [106:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [106:17] ==> val value: (Any..Any?) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.writeProperty[LocalVariableDescriptor]

'data' @ [107:17] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.writeProperty[ValueParameterDescriptorImpl]

'putObject' @ [107:22] ==> public abstract fun putObject(p0: (Any..Any?)): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'Binary' @ [107:32] ==> public constructor Binary(p0: (ByteArray..ByteArray?)) defined in org.apache.qpid.proton.amqp.Binary[JavaClassConstructorDescriptor]

'value' @ [107:39] ==> val value: (Any..Any?) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.writeProperty[LocalVariableDescriptor]

'data' @ [109:17] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.writeProperty[ValueParameterDescriptorImpl]

'putObject' @ [109:22] ==> public abstract fun putObject(p0: (Any..Any?)): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'value' @ [109:32] ==> val value: (Any..Any?) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPPrimitivePropertySerializer.writeProperty[LocalVariableDescriptor]

'PropertySerializer' @ [120:13] ==> private constructor PropertySerializer(name: String, readMethod: Method?, resolvedType: Type) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer[ClassConstructorDescriptorImpl]

'name' @ [120:32] ==> value-parameter name: String defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer.<init>[ValueParameterDescriptorImpl]

'readMethod' @ [120:38] ==> value-parameter readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer.<init>[ValueParameterDescriptorImpl]

'Character' @ [120:50] ==> public constructor Character(p0: Char) defined in java.lang.Character[JavaClassConstructorDescriptor]

'java' @ [120:67] ==> public val <T> KClass<Character>.java: Class<Character> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Character

'if(obj == null) null else (obj as Short).toChar()' @ [124:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Char?, elseBranch: Char?): Char?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Char?

'obj' @ [124:23] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer.readProperty[ValueParameterDescriptorImpl]

'obj' @ [124:47] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer.readProperty[ValueParameterDescriptorImpl]

'toChar' @ [124:61] ==> public open fun toChar(): Char defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'readMethod' @ [128:25] ==> public final val readMethod: Method? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer[PropertyDescriptorImpl]

'invoke' @ [128:38] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'obj' @ [128:45] ==> value-parameter obj: Any? defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer.writeProperty[ValueParameterDescriptorImpl]

'if (input != null) data.putShort((input as Char).toShort()) else data.putNull()' @ [129:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'input' @ [129:17] ==> val input: (Any..Any?) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer.writeProperty[LocalVariableDescriptor]

'data' @ [129:32] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer.writeProperty[ValueParameterDescriptorImpl]

'putShort' @ [129:37] ==> public abstract fun putShort(p0: Short): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

'input' @ [129:47] ==> val input: (Any..Any?) defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer.writeProperty[LocalVariableDescriptor]

'toShort' @ [129:62] ==> public final fun toShort(): Short defined in kotlin.Char[DeserializedSimpleFunctionDescriptor]

'data' @ [129:78] ==> value-parameter data: Data defined in net.corda.nodeapi.internal.serialization.amqp.PropertySerializer.AMQPCharPropertySerializer.writeProperty[ValueParameterDescriptorImpl]

'putNull' @ [129:83] ==> public abstract fun putNull(): Unit defined in org.apache.qpid.proton.codec.Data[JavaMethodDescriptor]

