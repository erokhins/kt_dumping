'AnnotationDeserializer' @ [34:32] ==> public constructor AnnotationDeserializer(module: ModuleDescriptor, notFoundClasses: NotFoundClasses) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[ClassConstructorDescriptorImpl]

'module' @ [34:55] ==> value-parameter module: ModuleDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.<init>[ValueParameterDescriptorImpl]

'notFoundClasses' @ [34:63] ==> value-parameter notFoundClasses: NotFoundClasses defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.<init>[ValueParameterDescriptorImpl]

'container' @ [37:27] ==> value-parameter container: ProtoContainer.Class defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadClassAnnotations[ValueParameterDescriptorImpl]

'classProto' @ [37:37] ==> public final val classProto: ProtoBuf.Class defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[PropertyDescriptorImpl]

'getExtension' @ [37:48] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [37:61] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'classAnnotation' @ [37:70] ==> public final val classAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'orEmpty' @ [37:87] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'annotations' @ [38:16] ==> val annotations: List<ProtoBuf.Annotation> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadClassAnnotations[LocalVariableDescriptor]

'map' @ [38:28] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> AnnotationDescriptor): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> AnnotationDescriptor

'deserializer' @ [38:43] ==> private final val deserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'deserializeAnnotation' @ [38:56] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [38:78] ==> value-parameter proto: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadClassAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'container' @ [38:85] ==> value-parameter container: ProtoContainer.Class defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadClassAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [38:95] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class[PropertyDescriptorImpl]

'when (proto) {
            is ProtoBuf.Constructor -> proto.getExtension(protocol.constructorAnnotation)
            is ProtoBuf.Function -> proto.getExtension(protocol.functionAnnotation)
            is ProtoBuf.Property -> proto.getExtension(protocol.propertyAnnotation)
            else -> error("Unknown message: $proto")
        }' @ [46:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<ProtoBuf.Annotation>, entry1: List<ProtoBuf.Annotation>, entry2: List<ProtoBuf.Annotation>, entry3: List<ProtoBuf.Annotation>): List<ProtoBuf.Annotation>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<Annotation>

'proto' @ [46:33] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'proto' @ [47:40] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [47:46] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Constructor[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [47:59] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'constructorAnnotation' @ [47:68] ==> public final val constructorAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'proto' @ [48:37] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [48:43] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [48:56] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'functionAnnotation' @ [48:65] ==> public final val functionAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'proto' @ [49:37] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [49:43] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [49:56] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'propertyAnnotation' @ [49:65] ==> public final val propertyAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'error' @ [50:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'proto' @ [50:46] ==> value-parameter proto: MessageLite defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'orEmpty' @ [51:11] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'annotations' @ [52:16] ==> val annotations: List<ProtoBuf.Annotation> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadCallableAnnotations[LocalVariableDescriptor]

'map' @ [52:28] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> AnnotationWithTarget): List<AnnotationWithTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> AnnotationWithTarget

'AnnotationWithTarget' @ [52:43] ==> public constructor AnnotationWithTarget(annotation: AnnotationDescriptor, target: AnnotationUseSiteTarget?) defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationWithTarget[DeserializedClassConstructorDescriptor]

'deserializer' @ [52:64] ==> private final val deserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'deserializeAnnotation' @ [52:77] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [52:99] ==> value-parameter proto: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadCallableAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'container' @ [52:106] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadCallableAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [52:116] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[PropertyDescriptorImpl]

'proto' @ [59:27] ==> value-parameter proto: ProtoBuf.EnumEntry defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadEnumEntryAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [59:33] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.EnumEntry[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [59:46] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'enumEntryAnnotation' @ [59:55] ==> public final val enumEntryAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'orEmpty' @ [59:76] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'annotations' @ [60:16] ==> val annotations: List<ProtoBuf.Annotation> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadEnumEntryAnnotations[LocalVariableDescriptor]

'map' @ [60:28] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> AnnotationDescriptor): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> AnnotationDescriptor

'deserializer' @ [60:43] ==> private final val deserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'deserializeAnnotation' @ [60:56] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [60:78] ==> value-parameter proto: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadEnumEntryAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'container' @ [60:85] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadEnumEntryAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [60:95] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[PropertyDescriptorImpl]

'proto' @ [70:27] ==> value-parameter proto: ProtoBuf.ValueParameter defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [70:33] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [70:46] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'parameterAnnotation' @ [70:55] ==> public final val parameterAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'orEmpty' @ [70:76] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'annotations' @ [71:16] ==> val annotations: List<ProtoBuf.Annotation> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadValueParameterAnnotations[LocalVariableDescriptor]

'map' @ [71:28] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> AnnotationDescriptor): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> AnnotationDescriptor

'deserializer' @ [71:43] ==> private final val deserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'deserializeAnnotation' @ [71:56] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'proto' @ [71:78] ==> value-parameter proto: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadValueParameterAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'container' @ [71:85] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadValueParameterAnnotations[ValueParameterDescriptorImpl]

'nameResolver' @ [71:95] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[PropertyDescriptorImpl]

'emptyList' @ [78:37] ==> public fun <T> emptyList(): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationDescriptor

'proto' @ [81:16] ==> value-parameter proto: ProtoBuf.Type defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadTypeAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [81:22] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [81:35] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'typeAnnotation' @ [81:44] ==> public final val typeAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'orEmpty' @ [81:60] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'map' @ [81:70] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> AnnotationDescriptor): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> AnnotationDescriptor

'deserializer' @ [81:76] ==> private final val deserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'deserializeAnnotation' @ [81:89] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [81:111] ==> value-parameter it: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadTypeAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [81:115] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadTypeAnnotations[ValueParameterDescriptorImpl]

'proto' @ [85:16] ==> value-parameter proto: ProtoBuf.TypeParameter defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadTypeParameterAnnotations[ValueParameterDescriptorImpl]

'getExtension' @ [85:22] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?)>?)): (List<ProtoBuf.Annotation>..List<ProtoBuf.Annotation>?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> List<Annotation>

'protocol' @ [85:35] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'typeParameterAnnotation' @ [85:44] ==> public final val typeParameterAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'orEmpty' @ [85:69] ==> @InlineOnly public inline fun <T> List<ProtoBuf.Annotation>?.orEmpty(): List<ProtoBuf.Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

'map' @ [85:79] ==> public inline fun <T, R> Iterable<ProtoBuf.Annotation>.map(transform: (ProtoBuf.Annotation) -> AnnotationDescriptor): List<AnnotationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> AnnotationDescriptor

'deserializer' @ [85:85] ==> private final val deserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'deserializeAnnotation' @ [85:98] ==> public final fun deserializeAnnotation(proto: ProtoBuf.Annotation, nameResolver: NameResolver): AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [85:120] ==> value-parameter it: ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadTypeParameterAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'nameResolver' @ [85:124] ==> value-parameter nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadTypeParameterAnnotations[ValueParameterDescriptorImpl]

'!' @ [93:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'proto' @ [93:14] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadPropertyConstant[ValueParameterDescriptorImpl]

'hasExtension' @ [93:20] ==> public final fun <Type : (Any..Any?)> hasExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>?)): Boolean defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Value

'protocol' @ [93:33] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'compileTimeValue' @ [93:42] ==> public final val compileTimeValue: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'proto' @ [94:21] ==> value-parameter proto: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadPropertyConstant[ValueParameterDescriptorImpl]

'getExtension' @ [94:27] ==> public final fun <Type : (Any..Any?)> getExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>?)): (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Value

'protocol' @ [94:40] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'compileTimeValue' @ [94:49] ==> public final val compileTimeValue: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[PropertyDescriptorImpl]

'deserializer' @ [95:16] ==> private final val deserializer: AnnotationDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl[PropertyDescriptorImpl]

'resolveValue' @ [95:29] ==> public final fun resolveValue(expectedType: KotlinType, value: ProtoBuf.Annotation.Argument.Value, nameResolver: NameResolver): ConstantValue<*> defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationDeserializer[SimpleFunctionDescriptorImpl]

'expectedType' @ [95:42] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadPropertyConstant[ValueParameterDescriptorImpl]

'value' @ [95:56] ==> val value: (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?) defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadPropertyConstant[LocalVariableDescriptor]

'container' @ [95:63] ==> value-parameter container: ProtoContainer defined in org.jetbrains.kotlin.serialization.deserialization.AnnotationAndConstantLoaderImpl.loadPropertyConstant[ValueParameterDescriptorImpl]

'nameResolver' @ [95:73] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.ProtoContainer[PropertyDescriptorImpl]

