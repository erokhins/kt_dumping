'c' @ [38:63] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'storageManager' @ [38:65] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [38:80] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (Int) -> ClassDescriptor?): MemoizedFunctionToNullable<Int, ClassDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V : Any> -> ClassDescriptor

'computeClassDescriptor' @ [39:24] ==> private final fun computeClassDescriptor(fqNameIndex: Int): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'fqNameIndex' @ [39:47] ==> value-parameter fqNameIndex: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.classDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [42:72] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'storageManager' @ [42:74] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [42:89] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (Int) -> ClassifierDescriptor?): MemoizedFunctionToNullable<Int, ClassifierDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V : Any> -> ClassifierDescriptor

'computeTypeAliasDescriptor' @ [43:24] ==> private final fun computeTypeAliasDescriptor(fqNameIndex: Int): ClassifierDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'fqNameIndex' @ [43:51] ==> value-parameter fqNameIndex: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeAliasDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'if (typeParameterProtos.isEmpty()) {
            mapOf<Int, TypeParameterDescriptor>()
        }
        else {
            val result = LinkedHashMap<Int, TypeParameterDescriptor>()
            for ((index, proto) in typeParameterProtos.withIndex()) {
                result[proto.id] = DeserializedTypeParameterDescriptor(c, proto, index)
            }
            result
        }' @ [47:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<Int, TypeParameterDescriptor>, elseBranch: Map<Int, TypeParameterDescriptor>): Map<Int, TypeParameterDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<Int, TypeParameterDescriptor>

'typeParameterProtos' @ [47:13] ==> value-parameter typeParameterProtos: List<ProtoBuf.TypeParameter> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.<init>[ValueParameterDescriptorImpl]

'isEmpty' @ [47:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'mapOf' @ [48:13] ==> @InlineOnly public inline fun <K, V> mapOf(): Map<Int, TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Int
    <V> -> TypeParameterDescriptor

'LinkedHashMap' @ [51:26] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Int
    <V : (Any..Any?)> -> TypeParameterDescriptor

'component1' @ [52:19] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [52:26] ==> public final operator fun component2(): ProtoBuf.TypeParameter defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'typeParameterProtos' @ [52:36] ==> value-parameter typeParameterProtos: List<ProtoBuf.TypeParameter> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.<init>[ValueParameterDescriptorImpl]

'withIndex' @ [52:56] ==> public fun <T> Iterable<ProtoBuf.TypeParameter>.withIndex(): Iterable<IndexedValue<ProtoBuf.TypeParameter>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter

'result' @ [53:17] ==> val result: LinkedHashMap<Int, TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeParameterDescriptors[LocalVariableDescriptor]

'proto' @ [53:24] ==> val proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeParameterDescriptors[LocalVariableDescriptor]

'id' @ [53:30] ==> public final val ProtoBuf.TypeParameter.id: Int[MyPropertyDescriptor]

'DeserializedTypeParameterDescriptor' @ [53:36] ==> public constructor DeserializedTypeParameterDescriptor(c: DeserializationContext, proto: ProtoBuf.TypeParameter, index: Int) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[ClassConstructorDescriptorImpl]

'c' @ [53:72] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'proto' @ [53:75] ==> val proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeParameterDescriptors[LocalVariableDescriptor]

'index' @ [53:82] ==> val index: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeParameterDescriptors[LocalVariableDescriptor]

'result' @ [55:13] ==> val result: LinkedHashMap<Int, TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeParameterDescriptors[LocalVariableDescriptor]

'typeParameterDescriptors' @ [59:21] ==> private final val typeParameterDescriptors: Map<Int, TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'values' @ [59:46] ==> public abstract val values: Collection<TypeParameterDescriptor> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'toList' @ [59:53] ==> public fun <T> Iterable<TypeParameterDescriptor>.toList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'Annotations' @ [62:73] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [62:85] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'proto' @ [63:13] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[ValueParameterDescriptorImpl]

'hasFlexibleTypeCapabilitiesId' @ [63:19] ==> public open fun hasFlexibleTypeCapabilitiesId(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'c' @ [64:22] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [64:24] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getString' @ [64:37] ==> @NotNull public abstract fun getString(index: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [64:47] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[ValueParameterDescriptorImpl]

'flexibleTypeCapabilitiesId' @ [64:53] ==> public final val ProtoBuf.Type.flexibleTypeCapabilitiesId: Int[MyPropertyDescriptor]

'simpleType' @ [65:30] ==> public final fun simpleType(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [65:41] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[ValueParameterDescriptorImpl]

'additionalAnnotations' @ [65:48] ==> value-parameter additionalAnnotations: Annotations = ... defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[ValueParameterDescriptorImpl]

'simpleType' @ [66:30] ==> public final fun simpleType(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [66:41] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[ValueParameterDescriptorImpl]

'flexibleUpperBound' @ [66:47] ==> public fun ProtoBuf.Type.flexibleUpperBound(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [66:66] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'typeTable' @ [66:68] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'additionalAnnotations' @ [66:82] ==> value-parameter additionalAnnotations: Annotations = ... defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[ValueParameterDescriptorImpl]

'c' @ [67:20] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'components' @ [67:22] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'flexibleTypeDeserializer' @ [67:33] ==> public final val flexibleTypeDeserializer: FlexibleTypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'create' @ [67:58] ==> public abstract fun create(proto: ProtoBuf.Type, flexibleId: String, lowerBound: SimpleType, upperBound: SimpleType): KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.FlexibleTypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [67:65] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[ValueParameterDescriptorImpl]

'id' @ [67:72] ==> val id: String defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[LocalVariableDescriptor]

'lowerBound' @ [67:76] ==> val lowerBound: SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[LocalVariableDescriptor]

'upperBound' @ [67:88] ==> val upperBound: SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[LocalVariableDescriptor]

'simpleType' @ [70:16] ==> public final fun simpleType(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [70:27] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[ValueParameterDescriptorImpl]

'additionalAnnotations' @ [70:34] ==> value-parameter additionalAnnotations: Annotations = ... defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.type[ValueParameterDescriptorImpl]

'Annotations' @ [73:79] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [73:91] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'when {
            proto.hasClassName() -> computeLocalClassifierReplacementType(proto.className)
            proto.hasTypeAliasName() -> computeLocalClassifierReplacementType(proto.typeAliasName)
            else -> null
        }' @ [74:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SimpleType?, entry1: SimpleType?, entry2: SimpleType?): SimpleType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SimpleType?

'proto' @ [75:13] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'hasClassName' @ [75:19] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'computeLocalClassifierReplacementType' @ [75:37] ==> private final fun computeLocalClassifierReplacementType(className: Int): SimpleType? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [75:75] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'className' @ [75:81] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

'proto' @ [76:13] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'hasTypeAliasName' @ [76:19] ==> public open fun hasTypeAliasName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'computeLocalClassifierReplacementType' @ [76:41] ==> private final fun computeLocalClassifierReplacementType(className: Int): SimpleType? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [76:79] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'typeAliasName' @ [76:85] ==> public final val ProtoBuf.Type.typeAliasName: Int[MyPropertyDescriptor]

'localClassifierType' @ [80:13] ==> val localClassifierType: SimpleType? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'localClassifierType' @ [80:49] ==> val localClassifierType: SimpleType? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'typeConstructor' @ [82:27] ==> private final fun typeConstructor(proto: ProtoBuf.Type): TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [82:43] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'isError' @ [83:24] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'constructor' @ [83:32] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'declarationDescriptor' @ [83:44] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'createErrorTypeWithCustomConstructor' @ [84:31] ==> @NotNull public open fun createErrorTypeWithCustomConstructor(@NotNull p0: String, @NotNull p1: TypeConstructor): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'constructor' @ [84:68] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'toString' @ [84:80] ==> public open fun toString(): String defined in org.jetbrains.kotlin.types.TypeConstructor[DeserializedSimpleFunctionDescriptor]

'constructor' @ [84:92] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'DeserializedAnnotationsWithPossibleTargets' @ [87:27] ==> public constructor DeserializedAnnotationsWithPossibleTargets(storageManager: StorageManager, compute: () -> List<AnnotationWithTarget>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotationsWithPossibleTargets[ClassConstructorDescriptorImpl]

'c' @ [87:70] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'storageManager' @ [87:72] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [88:13] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'components' @ [88:15] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'annotationAndConstantLoader' @ [88:26] ==> public final val annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'loadTypeAnnotations' @ [88:54] ==> public abstract fun loadTypeAnnotations(proto: ProtoBuf.Type, nameResolver: NameResolver): List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'proto' @ [88:74] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'c' @ [88:81] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [88:83] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'map' @ [89:22] ==> public inline fun <T, R> Iterable<AnnotationDescriptor>.map(transform: (AnnotationDescriptor) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor
    <R> -> AnnotationWithTarget

'AnnotationWithTarget' @ [89:28] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedClassConstructorDescriptor]

'it' @ [89:49] ==> value-parameter it: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'plus' @ [90:22] ==> public operator fun <T> Collection<AnnotationWithTarget>.plus(elements: Iterable<AnnotationWithTarget>): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'additionalAnnotations' @ [90:27] ==> value-parameter additionalAnnotations: Annotations = ... defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'getAllAnnotations' @ [90:49] ==> public abstract fun getAllAnnotations(): List<AnnotationWithTarget> defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'toList' @ [91:22] ==> public fun <T> Iterable<AnnotationWithTarget>.toList(): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationWithTarget

'argumentList' @ [95:17] ==> public final val ProtoBuf.Type.argumentList: (MutableList<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>..List<(ProtoBuf.Type.Argument..ProtoBuf.Type.Argument?)>?)[MyPropertyDescriptor]

'outerType' @ [95:32] ==> public fun ProtoBuf.Type.outerType(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [95:42] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'typeTable' @ [95:44] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'collectAllArguments' @ [95:56] ==> local final fun ProtoBuf.Type.collectAllArguments(): List<ProtoBuf.Type.Argument> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[SimpleFunctionDescriptorImpl]

'orEmpty' @ [95:78] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Type.Argument>?.orEmpty(): List<ProtoBuf.Type.Argument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Argument

'proto' @ [97:25] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'collectAllArguments' @ [97:31] ==> local final fun ProtoBuf.Type.collectAllArguments(): List<ProtoBuf.Type.Argument> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[SimpleFunctionDescriptorImpl]

'mapIndexed' @ [97:53] ==> public inline fun <T, R> Iterable<ProtoBuf.Type.Argument>.mapIndexed(transform: (index: Int, ProtoBuf.Type.Argument) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Argument
    <R> -> TypeProjection

'typeArgument' @ [98:13] ==> private final fun typeArgument(parameter: TypeParameterDescriptor?, typeArgumentProto: ProtoBuf.Type.Argument): TypeProjection defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'constructor' @ [98:26] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'parameters' @ [98:38] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'getOrNull' @ [98:49] ==> public fun <T> List<(TypeParameterDescriptor..TypeParameterDescriptor?)>.getOrNull(index: Int): TypeParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'index' @ [98:59] ==> value-parameter index: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType.<anonymous>[ValueParameterDescriptorImpl]

'proto' @ [98:67] ==> value-parameter proto: ProtoBuf.Type.Argument defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [99:11] ==> public fun <T> Iterable<TypeProjection>.toList(): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'if (Flags.SUSPEND_TYPE.get(proto.flags)) {
            createSuspendFunctionType(annotations, constructor, arguments, proto.nullable)
        }
        else {
            KotlinTypeFactory.simpleType(annotations, constructor, arguments, proto.nullable)
        }' @ [101:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'SUSPEND_TYPE' @ [101:36] ==> public final val SUSPEND_TYPE: (Flags.BooleanFlagField..Flags.BooleanFlagField?) defined in org.jetbrains.kotlin.serialization.Flags[JavaPropertyDescriptor]

'get' @ [101:49] ==> @Override @NotNull public open fun get(flags: Int): Boolean defined in org.jetbrains.kotlin.serialization.Flags.BooleanFlagField[JavaMethodDescriptor]

'proto' @ [101:53] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'flags' @ [101:59] ==> public final val ProtoBuf.Type.flags: Int[MyPropertyDescriptor]

'createSuspendFunctionType' @ [102:13] ==> private final fun createSuspendFunctionType(annotations: Annotations, functionTypeConstructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'annotations' @ [102:39] ==> val annotations: DeserializedAnnotationsWithPossibleTargets defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'constructor' @ [102:52] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'arguments' @ [102:65] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'proto' @ [102:76] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'nullable' @ [102:82] ==> public final val ProtoBuf.Type.nullable: Boolean[MyPropertyDescriptor]

'KotlinTypeFactory' @ [105:13] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [105:31] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'annotations' @ [105:42] ==> val annotations: DeserializedAnnotationsWithPossibleTargets defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'constructor' @ [105:55] ==> val constructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'arguments' @ [105:68] ==> val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'proto' @ [105:79] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'nullable' @ [105:85] ==> public final val ProtoBuf.Type.nullable: Boolean[MyPropertyDescriptor]

'proto' @ [108:36] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'abbreviatedType' @ [108:42] ==> public fun ProtoBuf.Type.abbreviatedType(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [108:58] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'typeTable' @ [108:60] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'simpleType' @ [108:81] ==> val simpleType: SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'simpleType' @ [109:16] ==> val simpleType: SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'withAbbreviation' @ [109:27] ==> public fun SimpleType.withAbbreviation(abbreviatedType: SimpleType): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'simpleType' @ [109:44] ==> public final fun simpleType(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'abbreviatedTypeProto' @ [109:55] ==> val abbreviatedTypeProto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[LocalVariableDescriptor]

'additionalAnnotations' @ [109:77] ==> value-parameter additionalAnnotations: Annotations = ... defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.simpleType[ValueParameterDescriptorImpl]

'c' @ [114:27] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [114:29] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getClassId' @ [114:42] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'classIdIndex' @ [114:53] ==> value-parameter classIdIndex: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.notFoundClass[ValueParameterDescriptorImpl]

'generateSequence' @ [115:39] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ProtoBuf.Type?, nextFunction: (ProtoBuf.Type) -> ProtoBuf.Type?): Sequence<ProtoBuf.Type> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Type

'proto' @ [115:56] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'it' @ [115:65] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.notFoundClass.<anonymous>[ValueParameterDescriptorImpl]

'outerType' @ [115:68] ==> public fun ProtoBuf.Type.outerType(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [115:78] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'typeTable' @ [115:80] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'map' @ [115:93] ==> public fun <T, R> Sequence<ProtoBuf.Type>.map(transform: (ProtoBuf.Type) -> Int): Sequence<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Int

'it' @ [115:99] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.notFoundClass.<anonymous>[ValueParameterDescriptorImpl]

'argumentCount' @ [115:102] ==> public final val ProtoBuf.Type.argumentCount: Int[MyPropertyDescriptor]

'toMutableList' @ [115:118] ==> public fun <T> Sequence<Int>.toMutableList(): MutableList<Int> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'generateSequence' @ [116:37] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ClassId?, nextFunction: (ClassId) -> ClassId?): Sequence<ClassId> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassId

'classId' @ [116:54] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.notFoundClass[LocalVariableDescriptor]

'count' @ [116:89] ==> public fun <T> Sequence<ClassId>.count(): Int defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'typeParametersCount' @ [117:20] ==> val typeParametersCount: MutableList<Int> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.notFoundClass[LocalVariableDescriptor]

'size' @ [117:40] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'classNestingLevel' @ [117:47] ==> val classNestingLevel: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.notFoundClass[LocalVariableDescriptor]

'typeParametersCount' @ [118:17] ==> val typeParametersCount: MutableList<Int> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.notFoundClass[LocalVariableDescriptor]

'add' @ [118:37] ==> public abstract fun add(element: Int): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'c' @ [120:20] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'components' @ [120:22] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'notFoundClasses' @ [120:33] ==> public final val notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'getClass' @ [120:49] ==> public final fun getClass(classId: ClassId, typeParametersCount: List<Int>): ClassDescriptor defined in org.jetbrains.kotlin.descriptors.NotFoundClasses[DeserializedSimpleFunctionDescriptor]

'classId' @ [120:58] ==> val classId: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.notFoundClass[LocalVariableDescriptor]

'typeParametersCount' @ [120:67] ==> val typeParametersCount: MutableList<Int> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.notFoundClass[LocalVariableDescriptor]

'when {
            proto.hasClassName() -> (classDescriptors(proto.className) ?: notFoundClass(proto.className)).typeConstructor
            proto.hasTypeParameter() ->
                typeParameterTypeConstructor(proto.typeParameter)
                ?: ErrorUtils.createErrorTypeConstructor("Unknown type parameter ${proto.typeParameter}")
            proto.hasTypeParameterName() -> {
                val container = c.containingDeclaration
                val name = c.nameResolver.getString(proto.typeParameterName)
                val parameter = ownTypeParameters.find { it.name.asString() == name }
                parameter?.typeConstructor ?: ErrorUtils.createErrorTypeConstructor("Deserialized type parameter $name in $container")
            }
            proto.hasTypeAliasName() -> (typeAliasDescriptors(proto.typeAliasName) ?: notFoundClass(proto.typeAliasName)).typeConstructor
            else -> ErrorUtils.createErrorTypeConstructor("Unknown type")
        }' @ [123:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeConstructor, entry1: TypeConstructor, entry2: TypeConstructor, entry3: TypeConstructor, entry4: TypeConstructor): TypeConstructor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeConstructor

'proto' @ [124:13] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'hasClassName' @ [124:19] ==> public open fun hasClassName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'invoke' @ [124:38] ==> public abstract operator fun invoke(p1: Int): ClassDescriptor? defined in kotlin.Function1[FunctionInvokeDescriptor]

'proto' @ [124:55] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'className' @ [124:61] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

'notFoundClass' @ [124:75] ==> local final fun notFoundClass(classIdIndex: Int): ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[SimpleFunctionDescriptorImpl]

'proto' @ [124:89] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'className' @ [124:95] ==> public final val ProtoBuf.Type.className: Int[MyPropertyDescriptor]

'typeConstructor' @ [124:107] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'proto' @ [125:13] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'hasTypeParameter' @ [125:19] ==> public open fun hasTypeParameter(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'typeParameterTypeConstructor' @ [126:17] ==> private final fun typeParameterTypeConstructor(typeParameterId: Int): TypeConstructor? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [126:46] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'typeParameter' @ [126:52] ==> public final val ProtoBuf.Type.typeParameter: Int[MyPropertyDescriptor]

'createErrorTypeConstructor' @ [127:31] ==> @NotNull public open fun createErrorTypeConstructor(@NotNull p0: String): TypeConstructor defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'proto' @ [127:84] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'typeParameter' @ [127:90] ==> public final val ProtoBuf.Type.typeParameter: Int[MyPropertyDescriptor]

'proto' @ [128:13] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'hasTypeParameterName' @ [128:19] ==> public open fun hasTypeParameterName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'c' @ [129:33] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'containingDeclaration' @ [129:35] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [130:28] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [130:30] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getString' @ [130:43] ==> @NotNull public abstract fun getString(index: Int): String defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [130:53] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'typeParameterName' @ [130:59] ==> public final val ProtoBuf.Type.typeParameterName: Int[MyPropertyDescriptor]

'ownTypeParameters' @ [131:33] ==> public final val ownTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'find' @ [131:51] ==> @InlineOnly public inline fun <T> Iterable<TypeParameterDescriptor>.find(predicate: (TypeParameterDescriptor) -> Boolean): TypeParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'it' @ [131:58] ==> value-parameter it: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [131:61] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [131:66] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [131:80] ==> val name: String defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[LocalVariableDescriptor]

'parameter' @ [132:17] ==> val parameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[LocalVariableDescriptor]

'typeConstructor' @ [132:28] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'createErrorTypeConstructor' @ [132:58] ==> @NotNull public open fun createErrorTypeConstructor(@NotNull p0: String): TypeConstructor defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'name' @ [132:115] ==> val name: String defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[LocalVariableDescriptor]

'container' @ [132:124] ==> val container: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[LocalVariableDescriptor]

'proto' @ [134:13] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'hasTypeAliasName' @ [134:19] ==> public open fun hasTypeAliasName(): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]

'invoke' @ [134:42] ==> public abstract operator fun invoke(p1: Int): ClassifierDescriptor? defined in kotlin.Function1[FunctionInvokeDescriptor]

'proto' @ [134:63] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'typeAliasName' @ [134:69] ==> public final val ProtoBuf.Type.typeAliasName: Int[MyPropertyDescriptor]

'notFoundClass' @ [134:87] ==> local final fun notFoundClass(classIdIndex: Int): ClassDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[SimpleFunctionDescriptorImpl]

'proto' @ [134:101] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeConstructor[ValueParameterDescriptorImpl]

'typeAliasName' @ [134:107] ==> public final val ProtoBuf.Type.typeAliasName: Int[MyPropertyDescriptor]

'typeConstructor' @ [134:123] ==> public final val ClassifierDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'createErrorTypeConstructor' @ [135:32] ==> @NotNull public open fun createErrorTypeConstructor(@NotNull p0: String): TypeConstructor defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'when (functionTypeConstructor.parameters.size - arguments.size) {
            0 -> {
                val functionType = KotlinTypeFactory.simpleType(annotations, functionTypeConstructor, arguments, nullable)
                functionType.takeIf { it.isFunctionType }?.let(::transformRuntimeFunctionTypeToSuspendFunction)
            }
            // This case for types written by eap compiler 1.1
            1 -> {
                val arity = arguments.size - 1
                if (arity >= 0) {
                    KotlinTypeFactory.simpleType(annotations, functionTypeConstructor.builtIns.getSuspendFunction(arity).typeConstructor, arguments, nullable)
                }
                else {
                    null
                }
            }
            else -> null
        }' @ [145:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SimpleType?, entry1: SimpleType?, entry2: SimpleType?): SimpleType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SimpleType?

'functionTypeConstructor' @ [145:28] ==> value-parameter functionTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'parameters' @ [145:52] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [145:63] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'arguments' @ [145:70] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'size' @ [145:80] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'KotlinTypeFactory' @ [147:36] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [147:54] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'annotations' @ [147:65] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'functionTypeConstructor' @ [147:78] ==> value-parameter functionTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'arguments' @ [147:103] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'nullable' @ [147:114] ==> value-parameter nullable: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'functionType' @ [148:17] ==> val functionType: SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[LocalVariableDescriptor]

'takeIf' @ [148:30] ==> @InlineOnly @SinceKotlin public inline fun <T> SimpleType.takeIf(predicate: (SimpleType) -> Boolean): SimpleType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'it' @ [148:39] ==> value-parameter it: SimpleType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType.<anonymous>[ValueParameterDescriptorImpl]

'isFunctionType' @ [148:42] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'let' @ [148:60] ==> @InlineOnly public inline fun <T, R> SimpleType.let(block: (SimpleType) -> SimpleType?): SimpleType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType
    <R> -> SimpleType?

'arguments' @ [152:29] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'size' @ [152:39] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'if (arity >= 0) {
                    KotlinTypeFactory.simpleType(annotations, functionTypeConstructor.builtIns.getSuspendFunction(arity).typeConstructor, arguments, nullable)
                }
                else {
                    null
                }' @ [153:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType?, elseBranch: SimpleType?): SimpleType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType?

'arity' @ [153:21] ==> val arity: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[LocalVariableDescriptor]

'KotlinTypeFactory' @ [154:21] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [154:39] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'annotations' @ [154:50] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'functionTypeConstructor' @ [154:63] ==> value-parameter functionTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'builtIns' @ [154:87] ==> public final val TypeConstructor.builtIns: KotlinBuiltIns[MyPropertyDescriptor]

'getSuspendFunction' @ [154:96] ==> @NotNull public open fun getSuspendFunction(p0: Int): ClassDescriptor defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'arity' @ [154:115] ==> val arity: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[LocalVariableDescriptor]

'typeConstructor' @ [154:122] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'arguments' @ [154:139] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'nullable' @ [154:150] ==> value-parameter nullable: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'result' @ [162:16] ==> val result: SimpleType? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[LocalVariableDescriptor]

'createErrorTypeWithArguments' @ [162:37] ==> @NotNull public open fun createErrorTypeWithArguments(@NotNull p0: String, @NotNull p1: (MutableList<(TypeProjection..TypeProjection?)>..List<(TypeProjection..TypeProjection?)>)): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'functionTypeConstructor' @ [162:119] ==> value-parameter functionTypeConstructor: TypeConstructor defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'arguments' @ [162:145] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.createSuspendFunctionType[ValueParameterDescriptorImpl]

'typeParameterDescriptors' @ [166:13] ==> private final val typeParameterDescriptors: Map<Int, TypeParameterDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'get' @ [166:38] ==> public abstract operator fun get(key: Int): TypeParameterDescriptor? defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'typeParameterId' @ [166:42] ==> value-parameter typeParameterId: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeParameterTypeConstructor[ValueParameterDescriptorImpl]

'typeConstructor' @ [166:60] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parent' @ [167:13] ==> private final val parent: TypeDeserializer? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'typeParameterTypeConstructor' @ [167:21] ==> private final fun typeParameterTypeConstructor(typeParameterId: Int): TypeConstructor? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'typeParameterId' @ [167:50] ==> value-parameter typeParameterId: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeParameterTypeConstructor[ValueParameterDescriptorImpl]

'c' @ [170:18] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [170:20] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getClassId' @ [170:33] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'fqNameIndex' @ [170:44] ==> value-parameter fqNameIndex: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.computeClassDescriptor[ValueParameterDescriptorImpl]

'id' @ [171:13] ==> val id: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.computeClassDescriptor[LocalVariableDescriptor]

'isLocal' @ [171:16] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'c' @ [173:20] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'components' @ [173:22] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'deserializeClass' @ [173:33] ==> public final fun deserializeClass(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[SimpleFunctionDescriptorImpl]

'id' @ [173:50] ==> val id: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.computeClassDescriptor[LocalVariableDescriptor]

'c' @ [175:16] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'components' @ [175:18] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'moduleDescriptor' @ [175:29] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'findClassAcrossModuleDependencies' @ [175:46] ==> public fun ModuleDescriptor.findClassAcrossModuleDependencies(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'id' @ [175:80] ==> val id: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.computeClassDescriptor[LocalVariableDescriptor]

'c' @ [179:13] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [179:15] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getClassId' @ [179:28] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'className' @ [179:39] ==> value-parameter className: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.computeLocalClassifierReplacementType[ValueParameterDescriptorImpl]

'isLocal' @ [179:50] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'c' @ [180:20] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'components' @ [180:22] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'localClassifierTypeSettings' @ [180:33] ==> public final val localClassifierTypeSettings: LocalClassifierTypeSettings defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'replacementTypeForLocalClassifiers' @ [180:61] ==> public abstract val replacementTypeForLocalClassifiers: SimpleType? defined in org.jetbrains.kotlin.serialization.deserialization.LocalClassifierTypeSettings[PropertyDescriptorImpl]

'c' @ [186:18] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'nameResolver' @ [186:20] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getClassId' @ [186:33] ==> @NotNull public abstract fun getClassId(index: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'fqNameIndex' @ [186:44] ==> value-parameter fqNameIndex: Int defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.computeTypeAliasDescriptor[ValueParameterDescriptorImpl]

'if (id.isLocal) {
            // TODO: support deserialization of local type aliases (see KT-13692)
            return null
        }
        else {
            c.components.moduleDescriptor.findTypeAliasAcrossModuleDependencies(id)
        }' @ [187:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassifierDescriptor?, elseBranch: ClassifierDescriptor?): ClassifierDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassifierDescriptor?

'id' @ [187:20] ==> val id: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.computeTypeAliasDescriptor[LocalVariableDescriptor]

'isLocal' @ [187:23] ==> public final val ClassId.isLocal: Boolean[MyPropertyDescriptor]

'c' @ [192:13] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'components' @ [192:15] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'moduleDescriptor' @ [192:26] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'findTypeAliasAcrossModuleDependencies' @ [192:43] ==> public fun ModuleDescriptor.findTypeAliasAcrossModuleDependencies(classId: ClassId): TypeAliasDescriptor? defined in org.jetbrains.kotlin.descriptors[DeserializedSimpleFunctionDescriptor]

'id' @ [192:81] ==> val id: ClassId defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.computeTypeAliasDescriptor[LocalVariableDescriptor]

'typeArgumentProto' @ [197:13] ==> value-parameter typeArgumentProto: ProtoBuf.Type.Argument defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeArgument[ValueParameterDescriptorImpl]

'projection' @ [197:31] ==> public final val ProtoBuf.Type.Argument.projection: (ProtoBuf.Type.Argument.Projection..ProtoBuf.Type.Argument.Projection?)[MyPropertyDescriptor]

'STAR' @ [197:79] ==> enum entry STAR defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Argument.Projection[FakeCallableDescriptorForObject]

'if (parameter == null)
                TypeBasedStarProjectionImpl(c.components.moduleDescriptor.builtIns.nullableAnyType)
            else
                StarProjectionImpl(parameter)' @ [198:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection, elseBranch: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection

'parameter' @ [198:24] ==> value-parameter parameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeArgument[ValueParameterDescriptorImpl]

'TypeBasedStarProjectionImpl' @ [199:17] ==> public constructor TypeBasedStarProjectionImpl(_type: KotlinType) defined in org.jetbrains.kotlin.types.TypeBasedStarProjectionImpl[DeserializedClassConstructorDescriptor]

'c' @ [199:45] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'components' @ [199:47] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'moduleDescriptor' @ [199:58] ==> public final val moduleDescriptor: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'builtIns' @ [199:75] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.descriptors.ModuleDescriptor[DeserializedPropertyDescriptor]

'nullableAnyType' @ [199:84] ==> public final val KotlinBuiltIns.nullableAnyType: SimpleType[MyPropertyDescriptor]

'StarProjectionImpl' @ [201:17] ==> public constructor StarProjectionImpl(typeParameter: TypeParameterDescriptor) defined in org.jetbrains.kotlin.types.StarProjectionImpl[DeserializedClassConstructorDescriptor]

'parameter' @ [201:36] ==> value-parameter parameter: TypeParameterDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeArgument[ValueParameterDescriptorImpl]

'Deserialization' @ [204:24] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'variance' @ [204:40] ==> @JvmStatic public final fun variance(variance: ProtoBuf.Type.Argument.Projection): Variance defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'typeArgumentProto' @ [204:49] ==> value-parameter typeArgumentProto: ProtoBuf.Type.Argument defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeArgument[ValueParameterDescriptorImpl]

'projection' @ [204:67] ==> public final val ProtoBuf.Type.Argument.projection: (ProtoBuf.Type.Argument.Projection..ProtoBuf.Type.Argument.Projection?)[MyPropertyDescriptor]

'typeArgumentProto' @ [205:20] ==> value-parameter typeArgumentProto: ProtoBuf.Type.Argument defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeArgument[ValueParameterDescriptorImpl]

'type' @ [205:38] ==> public fun ProtoBuf.Type.Argument.type(typeTable: TypeTable): ProtoBuf.Type? defined in org.jetbrains.kotlin.serialization.deserialization in file protoTypeTableUtil.kt[SimpleFunctionDescriptorImpl]

'c' @ [205:43] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'typeTable' @ [205:45] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'TypeProjectionImpl' @ [206:24] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'createErrorType' @ [206:54] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'TypeProjectionImpl' @ [208:16] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'variance' @ [208:35] ==> val variance: Variance defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeArgument[LocalVariableDescriptor]

'type' @ [208:45] ==> public final fun type(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'type' @ [208:50] ==> val type: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer.typeArgument[LocalVariableDescriptor]

'debugName' @ [211:31] ==> private final val debugName: String defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'if (parent == null) "" else ". Child of ${parent.debugName}"' @ [211:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'parent' @ [211:48] ==> private final val parent: TypeDeserializer? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'parent' @ [211:86] ==> private final val parent: TypeDeserializer? defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

'debugName' @ [211:93] ==> private final val debugName: String defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[PropertyDescriptorImpl]

