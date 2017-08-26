'module' @ [42:17] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'builtIns' @ [42:24] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'ConstantValueFactory' @ [44:27] ==> public constructor ConstantValueFactory(builtins: KotlinBuiltIns) defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedClassConstructorDescriptor]

'builtIns' @ [44:48] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'resolveClass' @ [47:31] ==> private final fun resolveClass(classId: ClassId): ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'nameResolver' @ [47:44] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[ValueParameterDescriptorImpl]

'getClassId' @ [47:57] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [47:68] ==> value-parameter proto: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[ValueParameterDescriptorImpl]

'id' @ [47:74] ==> public final val ProtoBuf.Annotation.id: Int[MyPropertyDescriptor]

'emptyMap' @ [49:25] ==> public fun <K, V> emptyMap(): Map<Name, ConstantValue<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'proto' @ [50:13] ==> value-parameter proto: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[ValueParameterDescriptorImpl]

'argumentCount' @ [50:19] ==> public final val ProtoBuf.Annotation.argumentCount: Int[MyPropertyDescriptor]

'!' @ [50:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isError' @ [50:53] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'annotationClass' @ [50:61] ==> val annotationClass: ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[LocalVariableDescriptor]

'isAnnotationClass' @ [50:97] ==> public open fun isAnnotationClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'annotationClass' @ [50:115] ==> val annotationClass: ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[LocalVariableDescriptor]

'annotationClass' @ [51:31] ==> val annotationClass: ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[LocalVariableDescriptor]

'constructors' @ [51:47] ==> public final val ClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'singleOrNull' @ [51:60] ==> public fun <T> Iterable<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>.singleOrNull(): ClassConstructorDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor..org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor?)

'constructor' @ [52:17] ==> val constructor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[LocalVariableDescriptor]

'constructor' @ [53:39] ==> val constructor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[LocalVariableDescriptor]

'valueParameters' @ [53:51] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'associateBy' @ [53:67] ==> public inline fun <T, K> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.associateBy(keySelector: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Name): Map<Name, (ValueParameterDescriptor..ValueParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <K> -> Name

'it' @ [53:81] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [53:84] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'arguments' @ [54:17] ==> var arguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[LocalVariableDescriptor]

'proto' @ [54:29] ==> value-parameter proto: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[ValueParameterDescriptorImpl]

'argumentList' @ [54:35] ==> public final val ProtoBuf.Annotation.argumentList: (MutableList<(ProtoBuf.Annotation.Argument..ProtoBuf.Annotation.Argument?)>..List<(ProtoBuf.Annotation.Argument..ProtoBuf.Annotation.Argument?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [54:48] ==> public inline fun <T, R : Any> Iterable<(ProtoBuf.Annotation.Argument..ProtoBuf.Annotation.Argument?)>.mapNotNull(transform: ((ProtoBuf.Annotation.Argument..ProtoBuf.Annotation.Argument?)) -> Pair<Name, ConstantValue<*>>?): List<Pair<Name, ConstantValue<*>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument?)
    <R : Any> -> Pair<Name, ConstantValue<*>>

'resolveArgument' @ [54:61] ==> private final fun resolveArgument(proto: ProtoBuf.Annotation.Argument, parameterByName: Map<Name, ValueParameterDescriptor>, nameResolver: NameResolver): Pair<Name, ConstantValue<*>>? defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [54:77] ==> value-parameter it: (ProtoBuf.Annotation.Argument..ProtoBuf.Annotation.Argument?) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'parameterByName' @ [54:81] ==> val parameterByName: Map<Name, (ValueParameterDescriptor..ValueParameterDescriptor?)> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[LocalVariableDescriptor]

'nameResolver' @ [54:98] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[ValueParameterDescriptorImpl]

'toMap' @ [54:114] ==> public fun <K, V> Iterable<Pair<Name, ConstantValue<*>>>.toMap(): Map<Name, ConstantValue<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> ConstantValue<*>

'AnnotationDescriptorImpl' @ [58:16] ==> public constructor AnnotationDescriptorImpl(@NotNull p0: KotlinType, @NotNull p1: (MutableMap<(Name..Name?), (ConstantValue<*>..ConstantValue<*>?)>..Map<(Name..Name?), (ConstantValue<*>..ConstantValue<*>?)>), @NotNull p2: SourceElement) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptorImpl[JavaClassConstructorDescriptor]

'annotationClass' @ [58:41] ==> val annotationClass: ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[LocalVariableDescriptor]

'defaultType' @ [58:57] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'arguments' @ [58:70] ==> var arguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.deserializeAnnotation[LocalVariableDescriptor]

'NO_SOURCE' @ [58:95] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'parameterByName' @ [66:25] ==> value-parameter parameterByName: Map<Name, ValueParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArgument[ValueParameterDescriptorImpl]

'nameResolver' @ [66:41] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArgument[ValueParameterDescriptorImpl]

'getName' @ [66:54] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [66:62] ==> value-parameter proto: ProtoBuf.Annotation.Argument defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArgument[ValueParameterDescriptorImpl]

'nameId' @ [66:68] ==> public final val ProtoBuf.Annotation.Argument.nameId: Int[MyPropertyDescriptor]

'Pair' @ [67:16] ==> public constructor Pair<out A, out B>(first: Name, second: ConstantValue<Any?>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Name
    <out B> -> ConstantValue<Any?>

'nameResolver' @ [67:21] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArgument[ValueParameterDescriptorImpl]

'getName' @ [67:34] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [67:42] ==> value-parameter proto: ProtoBuf.Annotation.Argument defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArgument[ValueParameterDescriptorImpl]

'nameId' @ [67:48] ==> public final val ProtoBuf.Annotation.Argument.nameId: Int[MyPropertyDescriptor]

'resolveValue' @ [67:57] ==> public final fun resolveValue(expectedType: KotlinType, value: ProtoBuf.Annotation.Argument.Value, nameResolver: NameResolver): ConstantValue<*> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'parameter' @ [67:70] ==> val parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArgument[LocalVariableDescriptor]

'type' @ [67:80] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'proto' @ [67:86] ==> value-parameter proto: ProtoBuf.Annotation.Argument defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArgument[ValueParameterDescriptorImpl]

'value' @ [67:92] ==> public final val ProtoBuf.Annotation.Argument.value: (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)[MyPropertyDescriptor]

'nameResolver' @ [67:99] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArgument[ValueParameterDescriptorImpl]

'when (value.type) {
            Type.BYTE -> factory.createByteValue(value.intValue.toByte())
            Type.CHAR -> factory.createCharValue(value.intValue.toChar())
            Type.SHORT -> factory.createShortValue(value.intValue.toShort())
            Type.INT -> factory.createIntValue(value.intValue.toInt())
            Type.LONG -> factory.createLongValue(value.intValue)
            Type.FLOAT -> factory.createFloatValue(value.floatValue)
            Type.DOUBLE -> factory.createDoubleValue(value.doubleValue)
            Type.BOOLEAN -> factory.createBooleanValue(value.intValue != 0L)
            Type.STRING -> {
                factory.createStringValue(nameResolver.getString(value.stringValue))
            }
            Type.CLASS -> {
                // TODO: support class literals
                error("Class literal annotation arguments are not supported yet (${nameResolver.getClassId(value.classId)})")
            }
            Type.ENUM -> {
                resolveEnumValue(nameResolver.getClassId(value.classId), nameResolver.getName(value.enumValueId))
            }
            Type.ANNOTATION -> {
                AnnotationValue(deserializeAnnotation(value.annotation, nameResolver))
            }
            Type.ARRAY -> {
                val expectedIsArray = KotlinBuiltIns.isArray(expectedType) || KotlinBuiltIns.isPrimitiveArray(expectedType)
                val arrayElements = value.arrayElementList

                val actualArrayType =
                        if (arrayElements.isNotEmpty()) {
                            val actualElementType = resolveArrayElementType(arrayElements.first(), nameResolver)
                            builtIns.getPrimitiveArrayKotlinTypeByPrimitiveKotlinType(actualElementType) ?:
                            builtIns.getArrayType(Variance.INVARIANT, actualElementType)
                        }
                        else {
                            // In the case of empty array, no element has the element type, so we fall back to the expected type, if any.
                            // This is not very accurate when annotation class has been changed without recompiling clients,
                            // but should not in fact matter because the value is empty anyway
                            if (expectedIsArray) expectedType else builtIns.getArrayType(Variance.INVARIANT, builtIns.anyType)
                        }

                val expectedElementType = builtIns.getArrayElementType(if (expectedIsArray) expectedType else actualArrayType)

                factory.createArrayValue(
                        arrayElements.map {
                            resolveValue(expectedElementType, it, nameResolver)
                        },
                        actualArrayType
                )
            }
            else -> error("Unsupported annotation argument type: ${value.type} (expected $expectedType)")
        }' @ [75:40] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ConstantValue<*>, entry1: ConstantValue<*>, entry2: ConstantValue<*>, entry3: ConstantValue<*>, entry4: ConstantValue<*>, entry5: ConstantValue<*>, entry6: ConstantValue<*>, entry7: ConstantValue<*>, entry8: ConstantValue<*>, entry9: ConstantValue<*>, entry10: ConstantValue<*>, entry11: ConstantValue<*>, entry12: ConstantValue<*>, entry13: ConstantValue<*>): ConstantValue<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ConstantValue<*>

'value' @ [75:46] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'type' @ [75:52] ==> public final val ProtoBuf.Annotation.Argument.Value.type: (ProtoBuf.Annotation.Argument.Value.Type..ProtoBuf.Annotation.Argument.Value.Type?)[MyPropertyDescriptor]

'BYTE' @ [76:18] ==> enum entry BYTE defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'factory' @ [76:26] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createByteValue' @ [76:34] ==> public final fun createByteValue(value: Byte): ByteValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [76:50] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'intValue' @ [76:56] ==> public final val ProtoBuf.Annotation.Argument.Value.intValue: Long[MyPropertyDescriptor]

'toByte' @ [76:65] ==> public open fun toByte(): Byte defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'CHAR' @ [77:18] ==> enum entry CHAR defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'factory' @ [77:26] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createCharValue' @ [77:34] ==> public final fun createCharValue(value: Char): CharValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [77:50] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'intValue' @ [77:56] ==> public final val ProtoBuf.Annotation.Argument.Value.intValue: Long[MyPropertyDescriptor]

'toChar' @ [77:65] ==> public open fun toChar(): Char defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'SHORT' @ [78:18] ==> enum entry SHORT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'factory' @ [78:27] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createShortValue' @ [78:35] ==> public final fun createShortValue(value: Short): ShortValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [78:52] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'intValue' @ [78:58] ==> public final val ProtoBuf.Annotation.Argument.Value.intValue: Long[MyPropertyDescriptor]

'toShort' @ [78:67] ==> public open fun toShort(): Short defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'INT' @ [79:18] ==> enum entry INT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'factory' @ [79:25] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createIntValue' @ [79:33] ==> public final fun createIntValue(value: Int): IntValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [79:48] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'intValue' @ [79:54] ==> public final val ProtoBuf.Annotation.Argument.Value.intValue: Long[MyPropertyDescriptor]

'toInt' @ [79:63] ==> public open fun toInt(): Int defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'LONG' @ [80:18] ==> enum entry LONG defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'factory' @ [80:26] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createLongValue' @ [80:34] ==> public final fun createLongValue(value: Long): LongValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [80:50] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'intValue' @ [80:56] ==> public final val ProtoBuf.Annotation.Argument.Value.intValue: Long[MyPropertyDescriptor]

'FLOAT' @ [81:18] ==> enum entry FLOAT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'factory' @ [81:27] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createFloatValue' @ [81:35] ==> public final fun createFloatValue(value: Float): FloatValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [81:52] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'floatValue' @ [81:58] ==> public final val ProtoBuf.Annotation.Argument.Value.floatValue: Float[MyPropertyDescriptor]

'DOUBLE' @ [82:18] ==> enum entry DOUBLE defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'factory' @ [82:28] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createDoubleValue' @ [82:36] ==> public final fun createDoubleValue(value: Double): DoubleValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [82:54] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'doubleValue' @ [82:60] ==> public final val ProtoBuf.Annotation.Argument.Value.doubleValue: Double[MyPropertyDescriptor]

'BOOLEAN' @ [83:18] ==> enum entry BOOLEAN defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'factory' @ [83:29] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createBooleanValue' @ [83:37] ==> public final fun createBooleanValue(value: Boolean): BooleanValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'value' @ [83:56] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'intValue' @ [83:62] ==> public final val ProtoBuf.Annotation.Argument.Value.intValue: Long[MyPropertyDescriptor]

'STRING' @ [84:18] ==> enum entry STRING defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'factory' @ [85:17] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createStringValue' @ [85:25] ==> public final fun createStringValue(value: String): StringValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'nameResolver' @ [85:43] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'getString' @ [85:56] ==> @NotNull public abstract fun getString(index: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'value' @ [85:66] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'stringValue' @ [85:72] ==> public final val ProtoBuf.Annotation.Argument.Value.stringValue: Int[MyPropertyDescriptor]

'CLASS' @ [87:18] ==> enum entry CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'error' @ [89:17] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'nameResolver' @ [89:84] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'getClassId' @ [89:97] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'value' @ [89:108] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'classId' @ [89:114] ==> public final val ProtoBuf.Annotation.Argument.Value.classId: Int[MyPropertyDescriptor]

'ENUM' @ [91:18] ==> enum entry ENUM defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'resolveEnumValue' @ [92:17] ==> private final fun resolveEnumValue(enumClassId: ClassId, enumEntryName: Name): ConstantValue<*> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'nameResolver' @ [92:34] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'getClassId' @ [92:47] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'value' @ [92:58] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'classId' @ [92:64] ==> public final val ProtoBuf.Annotation.Argument.Value.classId: Int[MyPropertyDescriptor]

'nameResolver' @ [92:74] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'getName' @ [92:87] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'value' @ [92:95] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'enumValueId' @ [92:101] ==> public final val ProtoBuf.Annotation.Argument.Value.enumValueId: Int[MyPropertyDescriptor]

'ANNOTATION' @ [94:18] ==> enum entry ANNOTATION defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'AnnotationValue' @ [95:17] ==> public constructor AnnotationValue(value: AnnotationDescriptor) defined in org.jetbrains.kotlin.resolve.constants.AnnotationValue[DeserializedClassConstructorDescriptor]

'deserializeAnnotation' @ [95:33] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'value' @ [95:55] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'annotation' @ [95:61] ==> public final val ProtoBuf.Annotation.Argument.Value.annotation: (ProtoBuf.Annotation..ProtoBuf.Annotation?)[MyPropertyDescriptor]

'nameResolver' @ [95:73] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'ARRAY' @ [97:18] ==> enum entry ARRAY defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'isArray' @ [98:54] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [98:62] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'isPrimitiveArray' @ [98:94] ==> public open fun isPrimitiveArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'expectedType' @ [98:111] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'value' @ [99:37] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'arrayElementList' @ [99:43] ==> public final val ProtoBuf.Annotation.Argument.Value.arrayElementList: (MutableList<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>..List<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>?)[MyPropertyDescriptor]

'if (arrayElements.isNotEmpty()) {
                            val actualElementType = resolveArrayElementType(arrayElements.first(), nameResolver)
                            builtIns.getPrimitiveArrayKotlinTypeByPrimitiveKotlinType(actualElementType) ?:
                            builtIns.getArrayType(Variance.INVARIANT, actualElementType)
                        }
                        else {
                            // In the case of empty array, no element has the element type, so we fall back to the expected type, if any.
                            // This is not very accurate when annotation class has been changed without recompiling clients,
                            // but should not in fact matter because the value is empty anyway
                            if (expectedIsArray) expectedType else builtIns.getArrayType(Variance.INVARIANT, builtIns.anyType)
                        }' @ [102:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'arrayElements' @ [102:29] ==> val arrayElements: (MutableList<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>..List<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>?) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'isNotEmpty' @ [102:43] ==> @InlineOnly public inline fun <T> Collection<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value?)

'resolveArrayElementType' @ [103:53] ==> private final fun resolveArrayElementType(value: ProtoBuf.Annotation.Argument.Value, nameResolver: NameResolver): SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'arrayElements' @ [103:77] ==> val arrayElements: (MutableList<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>..List<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>?) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'first' @ [103:91] ==> public fun <T> List<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>.first(): (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value?)

'nameResolver' @ [103:100] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'builtIns' @ [104:29] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'getPrimitiveArrayKotlinTypeByPrimitiveKotlinType' @ [104:38] ==> @Nullable public open fun getPrimitiveArrayKotlinTypeByPrimitiveKotlinType(@NotNull p0: KotlinType): SimpleType? defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'actualElementType' @ [104:87] ==> val actualElementType: SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'builtIns' @ [105:29] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'getArrayType' @ [105:38] ==> @NotNull public open fun getArrayType(@NotNull p0: Variance, @NotNull p1: KotlinType): SimpleType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'INVARIANT' @ [105:60] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'actualElementType' @ [105:71] ==> val actualElementType: SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'if (expectedIsArray) expectedType else builtIns.getArrayType(Variance.INVARIANT, builtIns.anyType)' @ [111:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'expectedIsArray' @ [111:33] ==> val expectedIsArray: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'expectedType' @ [111:50] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'builtIns' @ [111:68] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'getArrayType' @ [111:77] ==> @NotNull public open fun getArrayType(@NotNull p0: Variance, @NotNull p1: KotlinType): SimpleType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'INVARIANT' @ [111:99] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'builtIns' @ [111:110] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'anyType' @ [111:119] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'builtIns' @ [114:43] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'getArrayElementType' @ [114:52] ==> @NotNull public open fun getArrayElementType(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'if (expectedIsArray) expectedType else actualArrayType' @ [114:72] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'expectedIsArray' @ [114:76] ==> val expectedIsArray: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'expectedType' @ [114:93] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'actualArrayType' @ [114:111] ==> val actualArrayType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'factory' @ [116:17] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createArrayValue' @ [116:25] ==> public final fun createArrayValue(value: List<ConstantValue<*>>, type: KotlinType): ArrayValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'arrayElements' @ [117:25] ==> val arrayElements: (MutableList<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>..List<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>?) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'map' @ [117:39] ==> public inline fun <T, R> Iterable<(ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>.map(transform: ((ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)) -> ConstantValue<Any?>): List<ConstantValue<Any?>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value..org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value?)
    <R> -> ConstantValue<Any?>

'resolveValue' @ [118:29] ==> public final fun resolveValue(expectedType: KotlinType, value: ProtoBuf.Annotation.Argument.Value, nameResolver: NameResolver): ConstantValue<*> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'expectedElementType' @ [118:42] ==> val expectedElementType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'it' @ [118:63] ==> value-parameter it: (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [118:67] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'actualArrayType' @ [120:25] ==> val actualArrayType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'error' @ [123:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'value' @ [123:68] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'type' @ [123:74] ==> public final val ProtoBuf.Annotation.Argument.Value.type: (ProtoBuf.Annotation.Argument.Value.Type..ProtoBuf.Annotation.Argument.Value.Type?)[MyPropertyDescriptor]

'expectedType' @ [123:91] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'if (result.type.isSubtypeOf(expectedType)) {
            result
        }
        else {
            // This means that an annotation class has been changed incompatibly without recompiling clients
            factory.createErrorValue("Unexpected argument value")
        }' @ [126:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ConstantValue<*>, elseBranch: ConstantValue<*>): ConstantValue<*>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConstantValue<*>

'result' @ [126:20] ==> val result: ConstantValue<*> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'type' @ [126:27] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'isSubtypeOf' @ [126:32] ==> public fun KotlinType.isSubtypeOf(superType: KotlinType): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [126:44] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[ValueParameterDescriptorImpl]

'result' @ [127:13] ==> val result: ConstantValue<*> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveValue[LocalVariableDescriptor]

'factory' @ [131:13] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createErrorValue' @ [131:21] ==> public final fun createErrorValue(message: String): ErrorValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'resolveClass' @ [137:25] ==> private final fun resolveClass(classId: ClassId): ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'enumClassId' @ [137:38] ==> value-parameter enumClassId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveEnumValue[ValueParameterDescriptorImpl]

'enumClass' @ [138:13] ==> val enumClass: ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveEnumValue[LocalVariableDescriptor]

'kind' @ [138:23] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [138:41] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'enumClass' @ [139:29] ==> val enumClass: ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveEnumValue[LocalVariableDescriptor]

'unsubstitutedInnerClassesScope' @ [139:39] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'getContributedClassifier' @ [139:70] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'enumEntryName' @ [139:95] ==> value-parameter enumEntryName: Name defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveEnumValue[ValueParameterDescriptorImpl]

'FROM_DESERIALIZATION' @ [139:127] ==> enum entry FROM_DESERIALIZATION defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'enumEntry' @ [140:17] ==> val enumEntry: ClassifierDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveEnumValue[LocalVariableDescriptor]

'factory' @ [141:24] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createEnumValue' @ [141:32] ==> public final fun createEnumValue(enumEntryClass: ClassDescriptor): EnumValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'enumEntry' @ [141:48] ==> val enumEntry: ClassifierDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveEnumValue[LocalVariableDescriptor]

'factory' @ [144:16] ==> private final val factory: ConstantValueFactory defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'createErrorValue' @ [144:24] ==> public final fun createErrorValue(message: String): ErrorValue defined in org.jetbrains.kotlin.resolve.constants.ConstantValueFactory[DeserializedSimpleFunctionDescriptor]

'enumClassId' @ [144:66] ==> value-parameter enumClassId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveEnumValue[ValueParameterDescriptorImpl]

'enumEntryName' @ [144:79] ==> value-parameter enumEntryName: Name defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveEnumValue[ValueParameterDescriptorImpl]

'with' @ [148:13] ==> @InlineOnly public inline fun <T, R> with(receiver: KotlinBuiltIns, block: KotlinBuiltIns.() -> SimpleType): SimpleType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinBuiltIns
    <R> -> SimpleType

'builtIns' @ [148:18] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'when (value.type) {
                    Type.BYTE -> byteType
                    Type.CHAR -> charType
                    Type.SHORT -> shortType
                    Type.INT -> intType
                    Type.LONG -> longType
                    Type.FLOAT -> floatType
                    Type.DOUBLE -> doubleType
                    Type.BOOLEAN -> booleanType
                    Type.STRING -> stringType
                    Type.CLASS -> error("Arrays of class literals are not supported yet") // TODO: support arrays of class literals
                    Type.ENUM -> resolveClass(nameResolver.getClassId(value.classId)).defaultType
                    Type.ANNOTATION -> resolveClass(nameResolver.getClassId(value.annotation.id)).defaultType
                    Type.ARRAY -> error("Array of arrays is impossible")
                    else -> error("Unknown type: ${value.type}")
                }' @ [149:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SimpleType, entry1: SimpleType, entry2: SimpleType, entry3: SimpleType, entry4: SimpleType, entry5: SimpleType, entry6: SimpleType, entry7: SimpleType, entry8: SimpleType, entry9: SimpleType, entry10: SimpleType, entry11: SimpleType, entry12: SimpleType, entry13: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SimpleType

'value' @ [149:23] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArrayElementType[ValueParameterDescriptorImpl]

'type' @ [149:29] ==> public final val ProtoBuf.Annotation.Argument.Value.type: (ProtoBuf.Annotation.Argument.Value.Type..ProtoBuf.Annotation.Argument.Value.Type?)[MyPropertyDescriptor]

'BYTE' @ [150:26] ==> enum entry BYTE defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'byteType' @ [150:34] ==> public final val KotlinBuiltIns.byteType: SimpleType[MyPropertyDescriptor]

'CHAR' @ [151:26] ==> enum entry CHAR defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'charType' @ [151:34] ==> public final val KotlinBuiltIns.charType: SimpleType[MyPropertyDescriptor]

'SHORT' @ [152:26] ==> enum entry SHORT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'shortType' @ [152:35] ==> public final val KotlinBuiltIns.shortType: SimpleType[MyPropertyDescriptor]

'INT' @ [153:26] ==> enum entry INT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'intType' @ [153:33] ==> public final val KotlinBuiltIns.intType: SimpleType[MyPropertyDescriptor]

'LONG' @ [154:26] ==> enum entry LONG defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'longType' @ [154:34] ==> public final val KotlinBuiltIns.longType: SimpleType[MyPropertyDescriptor]

'FLOAT' @ [155:26] ==> enum entry FLOAT defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'floatType' @ [155:35] ==> public final val KotlinBuiltIns.floatType: SimpleType[MyPropertyDescriptor]

'DOUBLE' @ [156:26] ==> enum entry DOUBLE defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'doubleType' @ [156:36] ==> public final val KotlinBuiltIns.doubleType: SimpleType[MyPropertyDescriptor]

'BOOLEAN' @ [157:26] ==> enum entry BOOLEAN defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'booleanType' @ [157:37] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'STRING' @ [158:26] ==> enum entry STRING defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'stringType' @ [158:36] ==> public final val KotlinBuiltIns.stringType: SimpleType[MyPropertyDescriptor]

'CLASS' @ [159:26] ==> enum entry CLASS defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'error' @ [159:35] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'ENUM' @ [160:26] ==> enum entry ENUM defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'resolveClass' @ [160:34] ==> private final fun resolveClass(classId: ClassId): ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'nameResolver' @ [160:47] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArrayElementType[ValueParameterDescriptorImpl]

'getClassId' @ [160:60] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'value' @ [160:71] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArrayElementType[ValueParameterDescriptorImpl]

'classId' @ [160:77] ==> public final val ProtoBuf.Annotation.Argument.Value.classId: Int[MyPropertyDescriptor]

'defaultType' @ [160:87] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'ANNOTATION' @ [161:26] ==> enum entry ANNOTATION defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'resolveClass' @ [161:40] ==> private final fun resolveClass(classId: ClassId): ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'nameResolver' @ [161:53] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArrayElementType[ValueParameterDescriptorImpl]

'getClassId' @ [161:66] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'value' @ [161:77] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArrayElementType[ValueParameterDescriptorImpl]

'annotation' @ [161:83] ==> public final val ProtoBuf.Annotation.Argument.Value.annotation: (ProtoBuf.Annotation..ProtoBuf.Annotation?)[MyPropertyDescriptor]

'id' @ [161:94] ==> public final val ProtoBuf.Annotation.id: Int[MyPropertyDescriptor]

'defaultType' @ [161:99] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'ARRAY' @ [162:26] ==> enum entry ARRAY defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Type[FakeCallableDescriptorForObject]

'error' @ [162:35] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'error' @ [163:29] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'value' @ [163:52] ==> value-parameter value: ProtoBuf.Annotation.Argument.Value defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveArrayElementType[ValueParameterDescriptorImpl]

'type' @ [163:58] ==> public final val ProtoBuf.Annotation.Argument.Value.type: (ProtoBuf.Annotation.Argument.Value.Type..ProtoBuf.Annotation.Argument.Value.Type?)[MyPropertyDescriptor]

'module' @ [168:16] ==> private final val module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

'findNonGenericClassAcrossDependencies' @ [168:23] ==> public fun ModuleDescriptor.findNonGenericClassAcrossDependencies(classId: ClassId, notFoundClasses: NotFoundClasses): ClassDescriptor defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'classId' @ [168:61] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer.resolveClass[ValueParameterDescriptorImpl]

'notFoundClasses' @ [168:70] ==> private final val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[PropertyDescriptorImpl]

