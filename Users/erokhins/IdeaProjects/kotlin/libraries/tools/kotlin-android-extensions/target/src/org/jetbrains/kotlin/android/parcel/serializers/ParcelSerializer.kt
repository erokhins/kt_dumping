'FqName' @ [39:42] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'if (type.isError) Type.getObjectType("java/lang/Object") else mapType(type)' @ [49:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'type' @ [49:24] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.mapTypeSafe[ValueParameterDescriptorImpl]

'isError' @ [49:29] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'getObjectType' @ [49:43] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'mapType' @ [49:82] ==> @NotNull public open fun mapType(@NotNull p0: KotlinType): Type defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'type' @ [49:90] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.mapTypeSafe[ValueParameterDescriptorImpl]

'asmType' @ [59:29] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'className' @ [59:37] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'strict' @ [60:28] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'!' @ [60:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [60:39] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'annotations' @ [60:44] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'hasAnnotation' @ [60:56] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'RAWVALUE_ANNOTATION_FQNAME' @ [60:70] ==> private val RAWVALUE_ANNOTATION_FQNAME: FqName defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[PropertyDescriptorImpl]

'when {
                asmType.sort == Type.ARRAY -> {
                    val elementType = type.builtIns.getArrayElementType(type)
                    val elementSerializer = get(elementType, typeMapper.mapTypeSafe(elementType), typeMapper, strict = strict())

                    wrapToNullAwareIfNeeded(type, ArrayParcelSerializer(asmType, elementSerializer))
                }

                asmType.isPrimitive() -> {
                    if (forceBoxed || type.isMarkedNullable)
                        wrapToNullAwareIfNeeded(type, BoxedPrimitiveTypeParcelSerializer.forUnboxedType(asmType))
                    else
                        PrimitiveTypeParcelSerializer.getInstance(asmType)
                }

                asmType.isString() -> NullCompliantObjectParcelSerializer(asmType,
                        Method("writeString"),
                        Method("readString"))

                className == List::class.java.canonicalName
                    || className == ArrayList::class.java.canonicalName
                    || className == LinkedList::class.java.canonicalName
                    || className == Set::class.java.canonicalName
                    || className == SortedSet::class.java.canonicalName
                    || className == NavigableSet::class.java.canonicalName
                    || className == HashSet::class.java.canonicalName
                    || className == LinkedHashSet::class.java.canonicalName
                    || className == TreeSet::class.java.canonicalName
                -> {
                    val elementType = type.arguments.single().type
                    val elementSerializer = get(
                            elementType, typeMapper.mapTypeSafe(elementType), typeMapper, forceBoxed = true, strict = strict())
                    wrapToNullAwareIfNeeded(type, ListSetParcelSerializer(asmType, elementSerializer))
                }

                className == Map::class.java.canonicalName
                    || className == SortedMap::class.java.canonicalName
                    || className == NavigableMap::class.java.canonicalName
                    || className == HashMap::class.java.canonicalName
                    || className == LinkedHashMap::class.java.canonicalName
                    || className == TreeMap::class.java.canonicalName
                    || className == ConcurrentHashMap::class.java.canonicalName
                -> {
                    val (keyType, valueType) = type.arguments.apply { assert(this.size == 2) }
                    val keySerializer = get(
                            keyType.type, typeMapper.mapTypeSafe(keyType.type), typeMapper, forceBoxed = true, strict = strict())
                    val valueSerializer = get(
                            valueType.type, typeMapper.mapTypeSafe(valueType.type), typeMapper, forceBoxed = true, strict = strict())
                    wrapToNullAwareIfNeeded(type, MapParcelSerializer(asmType, keySerializer, valueSerializer))
                }

                asmType.isBoxedPrimitive() -> wrapToNullAwareIfNeeded(type, BoxedPrimitiveTypeParcelSerializer.forBoxedType(asmType))

                asmType.isBlob() -> NullCompliantObjectParcelSerializer(asmType,
                        Method("writeBlob"),
                        Method("readBlob"))

                asmType.isSize() -> wrapToNullAwareIfNeeded(type, NullCompliantObjectParcelSerializer(asmType,
                        Method("writeSize"),
                        Method("readSize")))

                asmType.isSizeF() -> wrapToNullAwareIfNeeded(type, NullCompliantObjectParcelSerializer(asmType,
                        Method("writeSizeF"),
                        Method("readSizeF")))

                asmType.isBundle() -> NullCompliantObjectParcelSerializer(asmType,
                        Method("writeBundle"),
                        Method("readBundle"))

                type.isIBinder() -> NullCompliantObjectParcelSerializer(asmType,
                        Method("writeStrongBinder", "(Landroid/os/IBinder;)V"),
                        Method("readStrongBinder", "()Landroid/os/IBinder;"))

                type.isIInterface() -> NullCompliantObjectParcelSerializer(asmType,
                        Method("writeStrongInterface", "(Landroid/os/IInterface;)V"),
                        Method("readStrongInterface", "()Landroid/os/IInterface;"))

                asmType.isPersistableBundle() -> NullCompliantObjectParcelSerializer(asmType,
                        Method("writeBundle"),
                        Method("readBundle"))

                asmType.isSparseBooleanArray() -> NullCompliantObjectParcelSerializer(asmType,
                        Method("writeSparseBooleanArray"),
                        Method("readSparseBooleanArray"))

                asmType.isSparseIntArray() -> wrapToNullAwareIfNeeded(type, SparseArrayParcelSerializer(
                        asmType, PrimitiveTypeParcelSerializer.getInstance(Type.INT_TYPE)))

                asmType.isSparseLongArray() -> wrapToNullAwareIfNeeded(type, SparseArrayParcelSerializer(
                        asmType, PrimitiveTypeParcelSerializer.getInstance(Type.LONG_TYPE)))

                asmType.isSparseArray() -> {
                    val elementType = type.arguments.single().type
                    val elementSerializer = get(
                            elementType, typeMapper.mapTypeSafe(elementType), typeMapper, forceBoxed = true, strict = strict())
                    wrapToNullAwareIfNeeded(type, SparseArrayParcelSerializer(asmType, elementSerializer))
                }

                type.isCharSequence() -> CharSequenceParcelSerializer(asmType)

                type.isException() -> wrapToNullAwareIfNeeded(type, NullCompliantObjectParcelSerializer(asmType,
                        Method("writeException"),
                        Method("readException")))

                // Write at least a nullability byte.
                // We don't want parcel to be empty in case if all constructor parameters are objects
                type.isNamedObject() -> NullAwareParcelSerializerWrapper(ObjectParcelSerializer(asmType, type, typeMapper))

                type.isEnum() -> wrapToNullAwareIfNeeded(type, EnumParcelSerializer(asmType))

                asmType.isFileDescriptor() -> wrapToNullAwareIfNeeded(type, NullCompliantObjectParcelSerializer(asmType,
                        Method("writeRawFileDescriptor"),
                        Method("readRawFileDescriptor")))

                type.isParcelable() -> {
                    val clazz = type.constructor.declarationDescriptor as? ClassDescriptor
                    if (clazz != null && clazz.modality == Modality.FINAL) {
                        val creatorVar = clazz.staticScope.getContributedVariables(
                                Name.identifier("CREATOR"), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS).firstOrNull()

                        val creatorAsmType = when {
                            creatorVar != null -> typeMapper.mapTypeSafe(creatorVar.type)
                            clazz.isParcelize -> Type.getObjectType(asmType.internalName + "\$Creator")
                            else -> null
                        }

                        creatorAsmType?.let { EfficientParcelableParcelSerializer(asmType, creatorAsmType) }
                                ?: GenericParcelableParcelSerializer(asmType)
                    }
                    else {
                        GenericParcelableParcelSerializer(asmType)
                    }
                }

                type.isSerializable() -> NullCompliantObjectParcelSerializer(asmType,
                        Method("writeSerializable"),
                        Method("readSerializable"))

                else -> {
                    if (strict && !type.annotations.hasAnnotation(RAWVALUE_ANNOTATION_FQNAME))
                        throw IllegalArgumentException("Illegal type")
                    else
                        GenericParcelSerializer
                }
            }' @ [62:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ParcelSerializer, entry1: ParcelSerializer, entry2: ParcelSerializer, entry3: ParcelSerializer, entry4: ParcelSerializer, entry5: ParcelSerializer, entry6: ParcelSerializer, entry7: ParcelSerializer, entry8: ParcelSerializer, entry9: ParcelSerializer, entry10: ParcelSerializer, entry11: ParcelSerializer, entry12: ParcelSerializer, entry13: ParcelSerializer, entry14: ParcelSerializer, entry15: ParcelSerializer, entry16: ParcelSerializer, entry17: ParcelSerializer, entry18: ParcelSerializer, entry19: ParcelSerializer, entry20: ParcelSerializer, entry21: ParcelSerializer, entry22: ParcelSerializer, entry23: ParcelSerializer, entry24: ParcelSerializer): ParcelSerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ParcelSerializer

'asmType' @ [63:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'sort' @ [63:25] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'ARRAY' @ [63:38] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'type' @ [64:39] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'builtIns' @ [64:44] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'getArrayElementType' @ [64:53] ==> @NotNull public open fun getArrayElementType(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [64:73] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'get' @ [65:45] ==> public final fun get(type: KotlinType, asmType: Type, typeMapper: KotlinTypeMapper, forceBoxed: Boolean = ..., strict: Boolean = ...): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'elementType' @ [65:49] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'typeMapper' @ [65:62] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'mapTypeSafe' @ [65:73] ==> private final fun KotlinTypeMapper.mapTypeSafe(type: KotlinType): Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'elementType' @ [65:85] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'typeMapper' @ [65:99] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'strict' @ [65:120] ==> local final fun strict(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [67:21] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [67:45] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'ArrayParcelSerializer' @ [67:51] ==> public constructor ArrayParcelSerializer(asmType: Type, elementSerializer: ParcelSerializer) defined in org.jetbrains.kotlin.android.parcel.serializers.ArrayParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [67:73] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'elementSerializer' @ [67:82] ==> val elementSerializer: ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'asmType' @ [70:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isPrimitive' @ [70:25] ==> private final fun Type.isPrimitive(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'if (forceBoxed || type.isMarkedNullable)
                        wrapToNullAwareIfNeeded(type, BoxedPrimitiveTypeParcelSerializer.forUnboxedType(asmType))
                    else
                        PrimitiveTypeParcelSerializer.getInstance(asmType)' @ [71:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ParcelSerializer, elseBranch: ParcelSerializer): ParcelSerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ParcelSerializer

'forceBoxed' @ [71:25] ==> value-parameter forceBoxed: Boolean = ... defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'type' @ [71:39] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [71:44] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'wrapToNullAwareIfNeeded' @ [72:25] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [72:49] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'forUnboxedType' @ [72:90] ==> public final fun forUnboxedType(type: Type): BoxedPrimitiveTypeParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.BoxedPrimitiveTypeParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'asmType' @ [72:105] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'getInstance' @ [74:55] ==> public final fun getInstance(type: Type): PrimitiveTypeParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.PrimitiveTypeParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'asmType' @ [74:67] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'asmType' @ [77:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isString' @ [77:25] ==> private final fun Type.isString(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [77:39] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [77:75] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [78:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [79:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'className' @ [81:17] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'List' @ [81:30] ==> @SinceKotlin @InlineOnly public inline fun <T> List(size: Int, init: (index: Int) -> ???): List<???> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@d08ff0b

'java' @ [81:42] ==> public val <T> KClass<List<*>>.java: Class<List<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> List<*>

'canonicalName' @ [81:47] ==> public final val <T : (Any..Any?)> Class<List<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<*>

'className' @ [82:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'ArrayList' @ [82:37] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@2bd7349f

'java' @ [82:54] ==> public val <T> KClass<ArrayList<*>>.java: Class<ArrayList<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ArrayList<*>

'canonicalName' @ [82:59] ==> public final val <T : (Any..Any?)> Class<ArrayList<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ArrayList<*>

'className' @ [83:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'LinkedList' @ [83:37] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@7e980214

'java' @ [83:55] ==> public val <T> KClass<LinkedList<*>>.java: Class<LinkedList<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LinkedList<*>

'canonicalName' @ [83:60] ==> public final val <T : (Any..Any?)> Class<LinkedList<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LinkedList<*>

'className' @ [84:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'java' @ [84:48] ==> public val <T> KClass<Set<*>>.java: Class<Set<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Set<*>

'canonicalName' @ [84:53] ==> public final val <T : (Any..Any?)> Class<Set<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Set<*>

'className' @ [85:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'java' @ [85:54] ==> public val <T> KClass<SortedSet<*>>.java: Class<SortedSet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SortedSet<*>

'canonicalName' @ [85:59] ==> public final val <T : (Any..Any?)> Class<SortedSet<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SortedSet<*>

'className' @ [86:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'java' @ [86:57] ==> public val <T> KClass<NavigableSet<*>>.java: Class<NavigableSet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NavigableSet<*>

'canonicalName' @ [86:62] ==> public final val <T : (Any..Any?)> Class<NavigableSet<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NavigableSet<*>

'className' @ [87:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'HashSet' @ [87:37] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@3234622f

'java' @ [87:52] ==> public val <T> KClass<HashSet<*>>.java: Class<HashSet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> HashSet<*>

'canonicalName' @ [87:57] ==> public final val <T : (Any..Any?)> Class<HashSet<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> HashSet<*>

'className' @ [88:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'LinkedHashSet' @ [88:37] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@788e33c5

'java' @ [88:58] ==> public val <T> KClass<LinkedHashSet<*>>.java: Class<LinkedHashSet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LinkedHashSet<*>

'canonicalName' @ [88:63] ==> public final val <T : (Any..Any?)> Class<LinkedHashSet<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LinkedHashSet<*>

'className' @ [89:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'TreeSet' @ [89:37] ==> public constructor TreeSet<E : (Any..Any?)>() defined in java.util.TreeSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@6aef8387

'java' @ [89:52] ==> public val <T> KClass<TreeSet<*>>.java: Class<TreeSet<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TreeSet<*>

'canonicalName' @ [89:57] ==> public final val <T : (Any..Any?)> Class<TreeSet<*>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TreeSet<*>

'type' @ [91:39] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'arguments' @ [91:44] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'single' @ [91:54] ==> public fun <T> List<TypeProjection>.single(): TypeProjection defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [91:63] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'get' @ [92:45] ==> public final fun get(type: KotlinType, asmType: Type, typeMapper: KotlinTypeMapper, forceBoxed: Boolean = ..., strict: Boolean = ...): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'elementType' @ [93:29] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'typeMapper' @ [93:42] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'mapTypeSafe' @ [93:53] ==> private final fun KotlinTypeMapper.mapTypeSafe(type: KotlinType): Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'elementType' @ [93:65] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'typeMapper' @ [93:79] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'strict' @ [93:119] ==> local final fun strict(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [94:21] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [94:45] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'ListSetParcelSerializer' @ [94:51] ==> public constructor ListSetParcelSerializer(asmType: Type, elementSerializer: ParcelSerializer) defined in org.jetbrains.kotlin.android.parcel.serializers.ListSetParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [94:75] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'elementSerializer' @ [94:84] ==> val elementSerializer: ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'className' @ [97:17] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'java' @ [97:41] ==> public val <T> KClass<Map<*, *>>.java: Class<Map<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Map<*, *>

'canonicalName' @ [97:46] ==> public final val <T : (Any..Any?)> Class<Map<*, *>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Map<*, *>

'className' @ [98:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'java' @ [98:54] ==> public val <T> KClass<SortedMap<*, *>>.java: Class<SortedMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SortedMap<*, *>

'canonicalName' @ [98:59] ==> public final val <T : (Any..Any?)> Class<SortedMap<*, *>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SortedMap<*, *>

'className' @ [99:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'java' @ [99:57] ==> public val <T> KClass<NavigableMap<*, *>>.java: Class<NavigableMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NavigableMap<*, *>

'canonicalName' @ [99:62] ==> public final val <T : (Any..Any?)> Class<NavigableMap<*, *>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NavigableMap<*, *>

'className' @ [100:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'HashMap' @ [100:37] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@5459a46c
    <V : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@45ed91d2

'java' @ [100:52] ==> public val <T> KClass<HashMap<*, *>>.java: Class<HashMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> HashMap<*, *>

'canonicalName' @ [100:57] ==> public final val <T : (Any..Any?)> Class<HashMap<*, *>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> HashMap<*, *>

'className' @ [101:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'LinkedHashMap' @ [101:37] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@4cf482b1
    <V : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@5a11d313

'java' @ [101:58] ==> public val <T> KClass<LinkedHashMap<*, *>>.java: Class<LinkedHashMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LinkedHashMap<*, *>

'canonicalName' @ [101:63] ==> public final val <T : (Any..Any?)> Class<LinkedHashMap<*, *>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> LinkedHashMap<*, *>

'className' @ [102:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'TreeMap' @ [102:37] ==> public constructor TreeMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.TreeMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@43f276f9
    <V : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@6a381c54

'java' @ [102:52] ==> public val <T> KClass<TreeMap<*, *>>.java: Class<TreeMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TreeMap<*, *>

'canonicalName' @ [102:57] ==> public final val <T : (Any..Any?)> Class<TreeMap<*, *>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TreeMap<*, *>

'className' @ [103:24] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'ConcurrentHashMap' @ [103:37] ==> public constructor ConcurrentHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.concurrent.ConcurrentHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@2b1eaa8
    <V : (Any..Any?)> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@566c38a6

'java' @ [103:62] ==> public val <T> KClass<ConcurrentHashMap<*, *>>.java: Class<ConcurrentHashMap<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ConcurrentHashMap<*, *>

'canonicalName' @ [103:67] ==> public final val <T : (Any..Any?)> Class<ConcurrentHashMap<*, *>>.canonicalName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ConcurrentHashMap<*, *>

'component1' @ [105:26] ==> @InlineOnly public operator inline fun <T> List<TypeProjection>.component1(): TypeProjection defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'component2' @ [105:35] ==> @InlineOnly public operator inline fun <T> List<TypeProjection>.component2(): TypeProjection defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [105:48] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'arguments' @ [105:53] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'apply' @ [105:63] ==> @InlineOnly public inline fun <T> List<TypeProjection>.apply(block: List<TypeProjection>.() -> Unit): List<TypeProjection> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<TypeProjection>

'assert' @ [105:71] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'this' @ [105:78] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get.<anonymous>[ReceiverParameterDescriptorImpl]

'size' @ [105:83] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'get' @ [106:41] ==> public final fun get(type: KotlinType, asmType: Type, typeMapper: KotlinTypeMapper, forceBoxed: Boolean = ..., strict: Boolean = ...): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'keyType' @ [107:29] ==> val keyType: TypeProjection defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'type' @ [107:37] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'typeMapper' @ [107:43] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'mapTypeSafe' @ [107:54] ==> private final fun KotlinTypeMapper.mapTypeSafe(type: KotlinType): Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'keyType' @ [107:66] ==> val keyType: TypeProjection defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'type' @ [107:74] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'typeMapper' @ [107:81] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'strict' @ [107:121] ==> local final fun strict(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[SimpleFunctionDescriptorImpl]

'get' @ [108:43] ==> public final fun get(type: KotlinType, asmType: Type, typeMapper: KotlinTypeMapper, forceBoxed: Boolean = ..., strict: Boolean = ...): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'valueType' @ [109:29] ==> val valueType: TypeProjection defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'type' @ [109:39] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'typeMapper' @ [109:45] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'mapTypeSafe' @ [109:56] ==> private final fun KotlinTypeMapper.mapTypeSafe(type: KotlinType): Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'valueType' @ [109:68] ==> val valueType: TypeProjection defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'type' @ [109:78] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'typeMapper' @ [109:85] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'strict' @ [109:125] ==> local final fun strict(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [110:21] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [110:45] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'MapParcelSerializer' @ [110:51] ==> public constructor MapParcelSerializer(asmType: Type, keySerializer: ParcelSerializer, elementSerializer: ParcelSerializer) defined in org.jetbrains.kotlin.android.parcel.serializers.MapParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [110:71] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'keySerializer' @ [110:80] ==> val keySerializer: ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'valueSerializer' @ [110:95] ==> val valueSerializer: ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'asmType' @ [113:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isBoxedPrimitive' @ [113:25] ==> private final fun Type.isBoxedPrimitive(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [113:47] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [113:71] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'forBoxedType' @ [113:112] ==> public final fun forBoxedType(type: Type): BoxedPrimitiveTypeParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.BoxedPrimitiveTypeParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'asmType' @ [113:125] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'asmType' @ [115:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isBlob' @ [115:25] ==> private final fun Type.isBlob(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [115:37] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [115:73] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [116:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [117:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'asmType' @ [119:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isSize' @ [119:25] ==> private final fun Type.isSize(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [119:37] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [119:61] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [119:67] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [119:103] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [120:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [121:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'asmType' @ [123:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isSizeF' @ [123:25] ==> private final fun Type.isSizeF(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [123:38] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [123:62] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [123:68] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [123:104] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [124:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [125:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'asmType' @ [127:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isBundle' @ [127:25] ==> private final fun Type.isBundle(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [127:39] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [127:75] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [128:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [129:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'type' @ [131:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isIBinder' @ [131:22] ==> private final fun KotlinType.isIBinder(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [131:37] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [131:73] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'Method' @ [132:25] ==> public constructor Method<out T : String?>(name: String, signature: String) defined in org.jetbrains.kotlin.android.parcel.serializers.Method[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : String?> -> String

'Method' @ [133:25] ==> public constructor Method<out T : String?>(name: String, signature: String) defined in org.jetbrains.kotlin.android.parcel.serializers.Method[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : String?> -> String

'type' @ [135:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isIInterface' @ [135:22] ==> private final fun KotlinType.isIInterface(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [135:40] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [135:76] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'Method' @ [136:25] ==> public constructor Method<out T : String?>(name: String, signature: String) defined in org.jetbrains.kotlin.android.parcel.serializers.Method[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : String?> -> String

'Method' @ [137:25] ==> public constructor Method<out T : String?>(name: String, signature: String) defined in org.jetbrains.kotlin.android.parcel.serializers.Method[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : String?> -> String

'asmType' @ [139:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isPersistableBundle' @ [139:25] ==> private final fun Type.isPersistableBundle(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [139:50] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [139:86] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [140:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [141:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'asmType' @ [143:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isSparseBooleanArray' @ [143:25] ==> private final fun Type.isSparseBooleanArray(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [143:51] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [143:87] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [144:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [145:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'asmType' @ [147:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isSparseIntArray' @ [147:25] ==> private final fun Type.isSparseIntArray(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [147:47] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [147:71] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'SparseArrayParcelSerializer' @ [147:77] ==> public constructor SparseArrayParcelSerializer(asmType: Type, valueSerializer: ParcelSerializer) defined in org.jetbrains.kotlin.android.parcel.serializers.SparseArrayParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [148:25] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'getInstance' @ [148:64] ==> public final fun getInstance(type: Type): PrimitiveTypeParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.PrimitiveTypeParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'INT_TYPE' @ [148:81] ==> public final val INT_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'asmType' @ [150:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isSparseLongArray' @ [150:25] ==> private final fun Type.isSparseLongArray(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [150:48] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [150:72] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'SparseArrayParcelSerializer' @ [150:78] ==> public constructor SparseArrayParcelSerializer(asmType: Type, valueSerializer: ParcelSerializer) defined in org.jetbrains.kotlin.android.parcel.serializers.SparseArrayParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [151:25] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'getInstance' @ [151:64] ==> public final fun getInstance(type: Type): PrimitiveTypeParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.PrimitiveTypeParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'LONG_TYPE' @ [151:81] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'asmType' @ [153:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isSparseArray' @ [153:25] ==> private final fun Type.isSparseArray(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [154:39] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'arguments' @ [154:44] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'single' @ [154:54] ==> public fun <T> List<TypeProjection>.single(): TypeProjection defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'type' @ [154:63] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'get' @ [155:45] ==> public final fun get(type: KotlinType, asmType: Type, typeMapper: KotlinTypeMapper, forceBoxed: Boolean = ..., strict: Boolean = ...): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'elementType' @ [156:29] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'typeMapper' @ [156:42] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'mapTypeSafe' @ [156:53] ==> private final fun KotlinTypeMapper.mapTypeSafe(type: KotlinType): Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'elementType' @ [156:65] ==> val elementType: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'typeMapper' @ [156:79] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'strict' @ [156:119] ==> local final fun strict(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [157:21] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [157:45] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'SparseArrayParcelSerializer' @ [157:51] ==> public constructor SparseArrayParcelSerializer(asmType: Type, valueSerializer: ParcelSerializer) defined in org.jetbrains.kotlin.android.parcel.serializers.SparseArrayParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [157:79] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'elementSerializer' @ [157:88] ==> val elementSerializer: ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'type' @ [160:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isCharSequence' @ [160:22] ==> private final fun KotlinType.isCharSequence(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'CharSequenceParcelSerializer' @ [160:42] ==> public constructor CharSequenceParcelSerializer(asmType: Type) defined in org.jetbrains.kotlin.android.parcel.serializers.CharSequenceParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [160:71] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'type' @ [162:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isException' @ [162:22] ==> private final fun KotlinType.isException(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [162:39] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [162:63] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [162:69] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [162:105] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [163:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [164:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'type' @ [168:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isNamedObject' @ [168:22] ==> private final fun KotlinType.isNamedObject(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'NullAwareParcelSerializerWrapper' @ [168:41] ==> public constructor NullAwareParcelSerializerWrapper(delegate: ParcelSerializer) defined in org.jetbrains.kotlin.android.parcel.serializers.NullAwareParcelSerializerWrapper[ClassConstructorDescriptorImpl]

'ObjectParcelSerializer' @ [168:74] ==> public constructor ObjectParcelSerializer(asmType: Type, type: KotlinType, typeMapper: KotlinTypeMapper) defined in org.jetbrains.kotlin.android.parcel.serializers.ObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [168:97] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'type' @ [168:106] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'typeMapper' @ [168:112] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'type' @ [170:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isEnum' @ [170:22] ==> private final fun KotlinType.isEnum(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [170:34] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [170:58] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'EnumParcelSerializer' @ [170:64] ==> public constructor EnumParcelSerializer(asmType: Type) defined in org.jetbrains.kotlin.android.parcel.serializers.EnumParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [170:85] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'asmType' @ [172:17] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isFileDescriptor' @ [172:25] ==> private final fun Type.isFileDescriptor(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'wrapToNullAwareIfNeeded' @ [172:47] ==> private final fun wrapToNullAwareIfNeeded(type: KotlinType, serializer: ParcelSerializer): ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'type' @ [172:71] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [172:77] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [172:113] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [173:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [174:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'type' @ [176:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isParcelable' @ [176:22] ==> internal fun KotlinType.isParcelable(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'type' @ [177:33] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'constructor' @ [177:38] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [177:50] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'if (clazz != null && clazz.modality == Modality.FINAL) {
                        val creatorVar = clazz.staticScope.getContributedVariables(
                                Name.identifier("CREATOR"), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS).firstOrNull()

                        val creatorAsmType = when {
                            creatorVar != null -> typeMapper.mapTypeSafe(creatorVar.type)
                            clazz.isParcelize -> Type.getObjectType(asmType.internalName + "\$Creator")
                            else -> null
                        }

                        creatorAsmType?.let { EfficientParcelableParcelSerializer(asmType, creatorAsmType) }
                                ?: GenericParcelableParcelSerializer(asmType)
                    }
                    else {
                        GenericParcelableParcelSerializer(asmType)
                    }' @ [178:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ParcelSerializer, elseBranch: ParcelSerializer): ParcelSerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ParcelSerializer

'clazz' @ [178:25] ==> val clazz: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'clazz' @ [178:42] ==> val clazz: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'modality' @ [178:48] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'FINAL' @ [178:69] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'clazz' @ [179:42] ==> val clazz: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'staticScope' @ [179:48] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'getContributedVariables' @ [179:60] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [180:38] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'WHEN_GET_ALL_DESCRIPTORS' @ [180:78] ==> enum entry WHEN_GET_ALL_DESCRIPTORS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'firstOrNull' @ [180:104] ==> public fun <T> Iterable<PropertyDescriptor>.firstOrNull(): PropertyDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'when {
                            creatorVar != null -> typeMapper.mapTypeSafe(creatorVar.type)
                            clazz.isParcelize -> Type.getObjectType(asmType.internalName + "\$Creator")
                            else -> null
                        }' @ [182:46] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type?, entry1: Type?, entry2: Type?): Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'creatorVar' @ [183:29] ==> val creatorVar: PropertyDescriptor? defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'typeMapper' @ [183:51] ==> value-parameter typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'mapTypeSafe' @ [183:62] ==> private final fun KotlinTypeMapper.mapTypeSafe(type: KotlinType): Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'creatorVar' @ [183:74] ==> val creatorVar: PropertyDescriptor? defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'type' @ [183:85] ==> public final val PropertyDescriptor.type: KotlinType[MyPropertyDescriptor]

'clazz' @ [184:29] ==> val clazz: ClassDescriptor? defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'isParcelize' @ [184:35] ==> internal val ClassDescriptor.isParcelize: Boolean defined in org.jetbrains.kotlin.android.parcel in file ParcelableResolveExtension.kt[PropertyDescriptorImpl]

'getObjectType' @ [184:55] ==> public open fun getObjectType(p0: (String..String?)): (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'asmType' @ [184:69] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'internalName' @ [184:77] ==> public final val Type.internalName: (String..String?)[MyPropertyDescriptor]

'creatorAsmType' @ [188:25] ==> val creatorAsmType: Type? defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'let' @ [188:41] ==> @InlineOnly public inline fun <T, R> Type.let(block: (Type) -> EfficientParcelableParcelSerializer): EfficientParcelableParcelSerializer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> EfficientParcelableParcelSerializer

'EfficientParcelableParcelSerializer' @ [188:47] ==> public constructor EfficientParcelableParcelSerializer(asmType: Type, creatorAsmType: Type) defined in org.jetbrains.kotlin.android.parcel.serializers.EfficientParcelableParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [188:83] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'creatorAsmType' @ [188:92] ==> val creatorAsmType: Type? defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[LocalVariableDescriptor]

'GenericParcelableParcelSerializer' @ [189:36] ==> public constructor GenericParcelableParcelSerializer(asmType: Type) defined in org.jetbrains.kotlin.android.parcel.serializers.GenericParcelableParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [189:70] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'GenericParcelableParcelSerializer' @ [192:25] ==> public constructor GenericParcelableParcelSerializer(asmType: Type) defined in org.jetbrains.kotlin.android.parcel.serializers.GenericParcelableParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [192:59] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'type' @ [196:17] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'isSerializable' @ [196:22] ==> private final fun KotlinType.isSerializable(): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion[SimpleFunctionDescriptorImpl]

'NullCompliantObjectParcelSerializer' @ [196:42] ==> public constructor NullCompliantObjectParcelSerializer(asmType: Type, writeMethod: Method<String?>, readMethod: Method<String?>) defined in org.jetbrains.kotlin.android.parcel.serializers.NullCompliantObjectParcelSerializer[ClassConstructorDescriptorImpl]

'asmType' @ [196:78] ==> value-parameter asmType: Type defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'invoke' @ [197:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'invoke' @ [198:25] ==> public final operator fun invoke(name: String): Method<Nothing?> defined in org.jetbrains.kotlin.android.parcel.serializers.Method.Companion[SimpleFunctionDescriptorImpl]

'if (strict && !type.annotations.hasAnnotation(RAWVALUE_ANNOTATION_FQNAME))
                        throw IllegalArgumentException("Illegal type")
                    else
                        GenericParcelSerializer' @ [201:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: GenericParcelSerializer, elseBranch: GenericParcelSerializer): GenericParcelSerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> GenericParcelSerializer

'strict' @ [201:25] ==> value-parameter strict: Boolean = ... defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'!' @ [201:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [201:36] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.get[ValueParameterDescriptorImpl]

'annotations' @ [201:41] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'hasAnnotation' @ [201:53] ==> public open fun hasAnnotation(fqName: FqName): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'RAWVALUE_ANNOTATION_FQNAME' @ [201:67] ==> private val RAWVALUE_ANNOTATION_FQNAME: FqName defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[PropertyDescriptorImpl]

'IllegalArgumentException' @ [202:31] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'GenericParcelSerializer' @ [204:25] ==> internal object GenericParcelSerializer : ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializers.kt[FakeCallableDescriptorForObject]

'when {
            type.isMarkedNullable -> NullAwareParcelSerializerWrapper(serializer)
            else -> serializer
        }' @ [208:95] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ParcelSerializer, entry1: ParcelSerializer): ParcelSerializer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ParcelSerializer

'type' @ [209:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.wrapToNullAwareIfNeeded[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [209:18] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'NullAwareParcelSerializerWrapper' @ [209:38] ==> public constructor NullAwareParcelSerializerWrapper(delegate: ParcelSerializer) defined in org.jetbrains.kotlin.android.parcel.serializers.NullAwareParcelSerializerWrapper[ClassConstructorDescriptorImpl]

'serializer' @ [209:71] ==> value-parameter serializer: ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.wrapToNullAwareIfNeeded[ValueParameterDescriptorImpl]

'serializer' @ [210:21] ==> value-parameter serializer: ParcelSerializer defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.wrapToNullAwareIfNeeded[ValueParameterDescriptorImpl]

'this' @ [213:37] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isBlob[ReceiverParameterDescriptorImpl]

'sort' @ [213:42] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'ARRAY' @ [213:55] ==> public const final val ARRAY: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [213:64] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isBlob[ReceiverParameterDescriptorImpl]

'elementType' @ [213:69] ==> public final val Type.elementType: (Type..Type?)[MyPropertyDescriptor]

'BYTE_TYPE' @ [213:89] ==> public final val BYTE_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'this' @ [214:39] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isString[ReceiverParameterDescriptorImpl]

'descriptor' @ [214:44] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'this' @ [215:37] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isSize[ReceiverParameterDescriptorImpl]

'descriptor' @ [215:42] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'this' @ [216:38] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isSizeF[ReceiverParameterDescriptorImpl]

'descriptor' @ [216:43] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'this' @ [217:47] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isFileDescriptor[ReceiverParameterDescriptorImpl]

'descriptor' @ [217:52] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'this' @ [218:39] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isBundle[ReceiverParameterDescriptorImpl]

'descriptor' @ [218:44] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'this' @ [219:50] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isPersistableBundle[ReceiverParameterDescriptorImpl]

'descriptor' @ [219:55] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'this' @ [220:51] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isSparseBooleanArray[ReceiverParameterDescriptorImpl]

'descriptor' @ [220:56] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'this' @ [221:47] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isSparseIntArray[ReceiverParameterDescriptorImpl]

'descriptor' @ [221:52] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'this' @ [222:48] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isSparseLongArray[ReceiverParameterDescriptorImpl]

'descriptor' @ [222:53] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'this' @ [223:44] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isSparseArray[ReceiverParameterDescriptorImpl]

'descriptor' @ [223:49] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'matchesFqNameWithSupertypes' @ [224:51] ==> private fun KotlinType.matchesFqNameWithSupertypes(fqName: String): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'matchesFqNameWithSupertypes' @ [225:48] ==> private fun KotlinType.matchesFqNameWithSupertypes(fqName: String): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'matchesFqNameWithSupertypes' @ [226:46] ==> private fun KotlinType.matchesFqNameWithSupertypes(fqName: String): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'matchesFqNameWithSupertypes' @ [227:49] ==> private fun KotlinType.matchesFqNameWithSupertypes(fqName: String): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'matchesFqName' @ [228:51] ==> private fun KotlinType.matchesFqName(fqName: String): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'matchesFqName' @ [228:91] ==> private fun KotlinType.matchesFqName(fqName: String): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [231:35] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [231:47] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'!' @ [232:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'classDescriptor' @ [232:18] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isNamedObject[LocalVariableDescriptor]

'visibility' @ [232:34] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'isVisibleOutside' @ [232:45] ==> public fun Visibility.isVisibleOutside(): Boolean defined in org.jetbrains.kotlin.synthetic[DeserializedSimpleFunctionDescriptor]

'isAnonymousObject' @ [233:33] ==> public open fun isAnonymousObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [233:51] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isNamedObject[LocalVariableDescriptor]

'classDescriptor' @ [234:20] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isNamedObject[LocalVariableDescriptor]

'kind' @ [234:36] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'OBJECT' @ [234:54] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'==' @ [237:43] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassKind[DeserializedSimpleFunctionDescriptor]

'constructor' @ [237:44] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [237:56] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'kind' @ [237:100] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [237:118] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'when (this.sort) {
            Type.BOOLEAN, Type.CHAR, Type.BYTE, Type.SHORT, Type.INT, Type.FLOAT, Type.LONG, Type.DOUBLE -> true
            else -> false
        }' @ [239:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [239:57] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isPrimitive[ReceiverParameterDescriptorImpl]

'sort' @ [239:62] ==> public final val Type.sort: Int[MyPropertyDescriptor]

'BOOLEAN' @ [240:18] ==> public const final val BOOLEAN: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'CHAR' @ [240:32] ==> public const final val CHAR: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'BYTE' @ [240:43] ==> public const final val BYTE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'SHORT' @ [240:54] ==> public const final val SHORT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'INT' @ [240:66] ==> public const final val INT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'FLOAT' @ [240:76] ==> public const final val FLOAT: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'LONG' @ [240:88] ==> public const final val LONG: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'DOUBLE' @ [240:99] ==> public const final val DOUBLE: Int defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'when(this.descriptor) {
            "Ljava/lang/Boolean;",
            "Ljava/lang/Character;",
            "Ljava/lang/Byte;",
            "Ljava/lang/Short;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Float;",
            "Ljava/lang/Long;",
            "Ljava/lang/Double;" -> true
            else -> false
        }' @ [244:56] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [244:61] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.ParcelSerializer.Companion.isBoxedPrimitive[ReceiverParameterDescriptorImpl]

'descriptor' @ [244:66] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'matchesFqNameWithSupertypes' @ [258:42] ==> private fun KotlinType.matchesFqNameWithSupertypes(fqName: String): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'this' @ [261:12] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.matchesFqName[ReceiverParameterDescriptorImpl]

'constructor' @ [261:17] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [261:29] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameSafe' @ [261:52] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [261:64] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'fqName' @ [261:78] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.android.parcel.serializers.matchesFqName[ValueParameterDescriptorImpl]

'this' @ [265:9] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.matchesFqNameWithSupertypes[ReceiverParameterDescriptorImpl]

'matchesFqName' @ [265:14] ==> private fun KotlinType.matchesFqName(fqName: String): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [265:28] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.android.parcel.serializers.matchesFqNameWithSupertypes[ValueParameterDescriptorImpl]

'getAllSupertypes' @ [269:22] ==> @NotNull public open fun getAllSupertypes(@NotNull p0: KotlinType): (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [269:39] ==> <this> defined in org.jetbrains.kotlin.android.parcel.serializers.matchesFqNameWithSupertypes[ReceiverParameterDescriptorImpl]

'any' @ [269:45] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.any(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'it' @ [269:51] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.android.parcel.serializers.matchesFqNameWithSupertypes.<anonymous>[ValueParameterDescriptorImpl]

'matchesFqName' @ [269:54] ==> private fun KotlinType.matchesFqName(fqName: String): Boolean defined in org.jetbrains.kotlin.android.parcel.serializers in file ParcelSerializer.kt[SimpleFunctionDescriptorImpl]

'fqName' @ [269:68] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.android.parcel.serializers.matchesFqNameWithSupertypes[ValueParameterDescriptorImpl]

