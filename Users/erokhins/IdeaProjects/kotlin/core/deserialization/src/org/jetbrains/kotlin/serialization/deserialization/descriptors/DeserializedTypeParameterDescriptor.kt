'AbstractLazyTypeParameterDescriptor' @ [34:5] ==> public constructor AbstractLazyTypeParameterDescriptor(@NotNull storageManager: StorageManager, @NotNull containingDeclaration: DeclarationDescriptor, @NotNull name: Name, @NotNull variance: Variance, isReified: Boolean, index: Int, @NotNull source: SourceElement, @NotNull supertypeLoopChecker: SupertypeLoopChecker) defined in org.jetbrains.kotlin.descriptors.impl.AbstractLazyTypeParameterDescriptor[JavaClassConstructorDescriptor]

'c' @ [35:9] ==> value-parameter c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [35:11] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [35:27] ==> value-parameter c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [35:29] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [35:52] ==> value-parameter c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'nameResolver' @ [35:54] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getName' @ [35:67] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'proto' @ [35:75] ==> value-parameter proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'name' @ [35:81] ==> public final val ProtoBuf.TypeParameter.name: Int[MyPropertyDescriptor]

'Deserialization' @ [36:9] ==> public object Deserialization defined in org.jetbrains.kotlin.serialization.deserialization in file protoEnumMapping.kt[FakeCallableDescriptorForObject]

'variance' @ [36:25] ==> @JvmStatic public final fun variance(variance: ProtoBuf.TypeParameter.Variance): Variance defined in org.jetbrains.kotlin.serialization.deserialization.Deserialization[SimpleFunctionDescriptorImpl]

'proto' @ [36:34] ==> value-parameter proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'variance' @ [36:40] ==> public final val ProtoBuf.TypeParameter.variance: (ProtoBuf.TypeParameter.Variance..ProtoBuf.TypeParameter.Variance?)[MyPropertyDescriptor]

'proto' @ [36:51] ==> value-parameter proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'reified' @ [36:57] ==> public final val ProtoBuf.TypeParameter.reified: Boolean[MyPropertyDescriptor]

'index' @ [36:66] ==> value-parameter index: Int defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.<init>[ValueParameterDescriptorImpl]

'NO_SOURCE' @ [36:87] ==> public final val NO_SOURCE: (SourceElement..SourceElement?) defined in org.jetbrains.kotlin.descriptors.SourceElement[JavaPropertyDescriptor]

'EMPTY' @ [36:119] ==> public object EMPTY : SupertypeLoopChecker defined in org.jetbrains.kotlin.descriptors.SupertypeLoopChecker[FakeCallableDescriptorForObject]

'DeserializedAnnotations' @ [38:32] ==> public constructor DeserializedAnnotations(storageManager: StorageManager, compute: () -> List<AnnotationDescriptor>) defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedAnnotations[ClassConstructorDescriptorImpl]

'c' @ [38:56] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[PropertyDescriptorImpl]

'storageManager' @ [38:58] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'c' @ [39:9] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[PropertyDescriptorImpl]

'components' @ [39:11] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'annotationAndConstantLoader' @ [39:22] ==> public final val annotationAndConstantLoader: AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<*>, AnnotationWithTarget> defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'loadTypeParameterAnnotations' @ [39:50] ==> public abstract fun loadTypeParameterAnnotations(proto: ProtoBuf.TypeParameter, nameResolver: NameResolver): List<AnnotationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoader[SimpleFunctionDescriptorImpl]

'proto' @ [39:79] ==> private final val proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[PropertyDescriptorImpl]

'c' @ [39:86] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[PropertyDescriptorImpl]

'nameResolver' @ [39:88] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'toList' @ [39:102] ==> public fun <T> Iterable<AnnotationDescriptor>.toList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'proto' @ [43:27] ==> private final val proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[PropertyDescriptorImpl]

'upperBounds' @ [43:33] ==> public fun ProtoBuf.TypeParameter.upperBounds(typeTable: TypeTable): List<ProtoBuf.Type> defined in org.jetbrains.kotlin.serialization.deserialization[SimpleFunctionDescriptorImpl]

'c' @ [43:45] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[PropertyDescriptorImpl]

'typeTable' @ [43:47] ==> public final val typeTable: TypeTable defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'upperBounds' @ [44:13] ==> val upperBounds: List<ProtoBuf.Type> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.resolveUpperBounds[LocalVariableDescriptor]

'isEmpty' @ [44:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listOf' @ [45:20] ==> public fun <T> listOf(element: SimpleType): List<SimpleType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleType

'this' @ [45:27] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[LazyClassReceiverParameterDescriptor]

'builtIns' @ [45:32] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[PropertyDescriptorImpl]

'defaultBound' @ [45:41] ==> public final val KotlinBuiltIns.defaultBound: SimpleType[MyPropertyDescriptor]

'upperBounds' @ [47:16] ==> val upperBounds: List<ProtoBuf.Type> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.resolveUpperBounds[LocalVariableDescriptor]

'map' @ [47:28] ==> public inline fun <T, R> Iterable<ProtoBuf.Type>.map(transform: (ProtoBuf.Type) -> KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> KotlinType

'c' @ [48:13] ==> private final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[PropertyDescriptorImpl]

'typeDeserializer' @ [48:15] ==> public final val typeDeserializer: TypeDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'type' @ [48:32] ==> public final fun type(proto: ProtoBuf.Type, additionalAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.TypeDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [48:37] ==> value-parameter it: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor.resolveUpperBounds.<anonymous>[ValueParameterDescriptorImpl]

'Annotations' @ [48:41] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [48:53] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'IllegalStateException' @ [52:69] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'this' @ [53:90] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedTypeParameterDescriptor[LazyClassReceiverParameterDescriptor]

