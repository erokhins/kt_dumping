'container' @ [35:10] ==> value-parameter container: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadClassAnnotations[ValueParameterDescriptorImpl]

'classProto' @ [35:20] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'getExtension' @ [35:31] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [35:44] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl[PropertyDescriptorImpl]

'classAnnotation' @ [35:53] ==> public final val classAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'orEmpty' @ [35:70] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'map' @ [35:80] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> ClassId): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> ClassId

'container' @ [35:86] ==> value-parameter container: ProtoContainer.Class defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadClassAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [35:96] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[DeserializedPropertyDescriptor]

'getClassId' @ [35:109] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [35:120] ==> value-parameter it: ProtoBuf.Annotation defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadClassAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [35:123] ==> public final val ProtoBuf.Annotation.id: Int[MyPropertyDescriptor]

'when (proto) {
            is ProtoBuf.Constructor -> proto.getExtension(protocol.constructorAnnotation)
            is ProtoBuf.Function -> proto.getExtension(protocol.functionAnnotation)
            is ProtoBuf.Property -> proto.getExtension(protocol.propertyAnnotation)
            else -> error("Unknown message: $proto")
        }' @ [42:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<ProtoBuf.Annotation>, entry1: List<ProtoBuf.Annotation>, entry2: List<ProtoBuf.Annotation>, entry3: List<ProtoBuf.Annotation>): List<ProtoBuf.Annotation>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<Annotation>

'proto' @ [42:33] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'proto' @ [43:40] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [43:46] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Constructor[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [43:59] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl[PropertyDescriptorImpl]

'constructorAnnotation' @ [43:68] ==> public final val constructorAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'proto' @ [44:37] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [44:43] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [44:56] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl[PropertyDescriptorImpl]

'functionAnnotation' @ [44:65] ==> public final val functionAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'proto' @ [45:37] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [45:43] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [45:56] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl[PropertyDescriptorImpl]

'propertyAnnotation' @ [45:65] ==> public final val propertyAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'error' @ [46:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'proto' @ [46:46] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'orEmpty' @ [47:11] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'annotations' @ [48:16] ==> val annotations: List<ProtoBuf.Annotation> defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadCallableAnnotations[LocalVariableDescriptor]

'map' @ [48:28] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> ClassIdWithTarget): List<ClassIdWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> ClassIdWithTarget

'ClassIdWithTarget' @ [49:13] ==> public constructor ClassIdWithTarget(classId: ClassId, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.idea.decompiler.stubBuilder.ClassIdWithTarget[ClassConstructorDescriptorImpl]

'container' @ [49:31] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [49:41] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'getClassId' @ [49:54] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [49:65] ==> value-parameter it: ProtoBuf.Annotation defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadCallableAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [49:68] ==> public final val ProtoBuf.Annotation.id: Int[MyPropertyDescriptor]

'proto' @ [54:13] ==> value-parameter proto: ProtoBuf.EnumEntry defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadEnumEntryAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [54:19] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.EnumEntry[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [54:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl[PropertyDescriptorImpl]

'enumEntryAnnotation' @ [54:41] ==> public final val enumEntryAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'orEmpty' @ [54:62] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'map' @ [54:72] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> ClassId): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> ClassId

'container' @ [54:78] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadEnumEntryAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [54:88] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'getClassId' @ [54:101] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [54:112] ==> value-parameter it: ProtoBuf.Annotation defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadEnumEntryAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [54:115] ==> public final val ProtoBuf.Annotation.id: Int[MyPropertyDescriptor]

'proto' @ [63:13] ==> value-parameter proto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [63:19] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [63:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl[PropertyDescriptorImpl]

'parameterAnnotation' @ [63:41] ==> public final val parameterAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'orEmpty' @ [63:62] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'map' @ [63:72] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> ClassId): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> ClassId

'container' @ [63:78] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [63:88] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[DeserializedPropertyDescriptor]

'getClassId' @ [63:101] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [63:112] ==> value-parameter it: ProtoBuf.Annotation defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadValueParameterAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [63:115] ==> public final val ProtoBuf.Annotation.id: Int[MyPropertyDescriptor]

'emptyList' @ [69:24] ==> public fun <T> emptyList(): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassId

'proto' @ [75:13] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadTypeAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [75:19] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [75:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl[PropertyDescriptorImpl]

'typeAnnotation' @ [75:41] ==> public final val typeAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'orEmpty' @ [75:57] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'map' @ [75:67] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> ClassId): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> ClassId

'nameResolver' @ [75:73] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadTypeAnnotations[ValueParameterDescriptorImpl]

'getClassId' @ [75:86] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [75:97] ==> value-parameter it: ProtoBuf.Annotation defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadTypeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [75:100] ==> public final val ProtoBuf.Annotation.id: Int[MyPropertyDescriptor]

'proto' @ [78:9] ==> value-parameter proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadTypeParameterAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [78:15] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [78:28] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl[PropertyDescriptorImpl]

'typeParameterAnnotation' @ [78:37] ==> public final val typeParameterAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'orEmpty' @ [78:62] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'map' @ [78:72] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> ClassId): List<ClassId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> ClassId

'nameResolver' @ [78:78] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadTypeParameterAnnotations[ValueParameterDescriptorImpl]

'getClassId' @ [78:91] ==> @NotNull public abstract fun getClassId(p0: Int): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'it' @ [78:102] ==> value-parameter it: ProtoBuf.Annotation defined in org.jetbrains.kotlin.idea.decompiler.common.AnnotationLoaderForStubBuilderImpl.loadTypeParameterAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [78:105] ==> public final val ProtoBuf.Annotation.id: Int[MyPropertyDescriptor]

