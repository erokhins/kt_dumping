'SerializerExtension' @ [24:95] ==> public constructor SerializerExtension() defined in org.jetbrains.kotlin.serialization.SerializerExtension[ClassConstructorDescriptorImpl]

'StringTableImpl' @ [25:32] ==> public constructor StringTableImpl() defined in org.jetbrains.kotlin.serialization.StringTableImpl[ClassConstructorDescriptorImpl]

'descriptor' @ [28:28] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeClass[ValueParameterDescriptorImpl]

'annotations' @ [28:39] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedPropertyDescriptor]

'proto' @ [29:13] ==> value-parameter proto: ProtoBuf.Class.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeClass[ValueParameterDescriptorImpl]

'addExtension' @ [29:19] ==> public final fun <Type : (Any..Any?)> addExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Class..ProtoBuf.Class?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?), p1: (ProtoBuf.Annotation..ProtoBuf.Annotation?)): (ProtoBuf.Class.Builder..ProtoBuf.Class.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Class.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Annotation

'protocol' @ [29:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'classAnnotation' @ [29:41] ==> public final val classAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'annotationSerializer' @ [29:58] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'serializeAnnotation' @ [29:79] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'annotation' @ [29:99] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeClass[LocalVariableDescriptor]

'proto' @ [34:9] ==> value-parameter proto: ProtoBuf.Package.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializePackage[ValueParameterDescriptorImpl]

'setExtension' @ [34:15] ==> public final fun <Type : (Any..Any?)> setExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Package..ProtoBuf.Package?), (Int..Int?)>?), p1: (Int..Int?)): (ProtoBuf.Package.Builder..ProtoBuf.Package.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Package.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Int

'protocol' @ [34:28] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'packageFqName' @ [34:37] ==> public final val packageFqName: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Int> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'stringTable' @ [34:52] ==> public open val stringTable: StringTableImpl defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'getPackageFqNameIndex' @ [34:64] ==> public final fun getPackageFqNameIndex(fqName: FqName): Int defined in org.jetbrains.kotlin.serialization.StringTableImpl[SimpleFunctionDescriptorImpl]

'packageFqName' @ [34:86] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializePackage[ValueParameterDescriptorImpl]

'descriptor' @ [38:28] ==> value-parameter descriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeConstructor[ValueParameterDescriptorImpl]

'annotations' @ [38:39] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ConstructorDescriptor[DeserializedPropertyDescriptor]

'proto' @ [39:13] ==> value-parameter proto: ProtoBuf.Constructor.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeConstructor[ValueParameterDescriptorImpl]

'addExtension' @ [39:19] ==> public final fun <Type : (Any..Any?)> addExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Constructor..ProtoBuf.Constructor?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?), p1: (ProtoBuf.Annotation..ProtoBuf.Annotation?)): (ProtoBuf.Constructor.Builder..ProtoBuf.Constructor.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Constructor.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Annotation

'protocol' @ [39:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'constructorAnnotation' @ [39:41] ==> public final val constructorAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'annotationSerializer' @ [39:64] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'serializeAnnotation' @ [39:85] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'annotation' @ [39:105] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeConstructor[LocalVariableDescriptor]

'descriptor' @ [44:28] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeFunction[ValueParameterDescriptorImpl]

'annotations' @ [44:39] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedPropertyDescriptor]

'proto' @ [45:13] ==> value-parameter proto: ProtoBuf.Function.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeFunction[ValueParameterDescriptorImpl]

'addExtension' @ [45:19] ==> public final fun <Type : (Any..Any?)> addExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Function..ProtoBuf.Function?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?), p1: (ProtoBuf.Annotation..ProtoBuf.Annotation?)): (ProtoBuf.Function.Builder..ProtoBuf.Function.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Function.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Annotation

'protocol' @ [45:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'functionAnnotation' @ [45:41] ==> public final val functionAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'annotationSerializer' @ [45:61] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'serializeAnnotation' @ [45:82] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'annotation' @ [45:102] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeFunction[LocalVariableDescriptor]

'descriptor' @ [50:28] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeProperty[ValueParameterDescriptorImpl]

'annotations' @ [50:39] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[DeserializedPropertyDescriptor]

'proto' @ [51:13] ==> value-parameter proto: ProtoBuf.Property.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeProperty[ValueParameterDescriptorImpl]

'addExtension' @ [51:19] ==> public final fun <Type : (Any..Any?)> addExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?), p1: (ProtoBuf.Annotation..ProtoBuf.Annotation?)): (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Annotation

'protocol' @ [51:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'propertyAnnotation' @ [51:41] ==> public final val propertyAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'annotationSerializer' @ [51:61] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'serializeAnnotation' @ [51:82] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'annotation' @ [51:102] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeProperty[LocalVariableDescriptor]

'descriptor' @ [53:35] ==> value-parameter descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeProperty[ValueParameterDescriptorImpl]

'compileTimeInitializer' @ [53:46] ==> public final val PropertyDescriptor.compileTimeInitializer: ConstantValue<*>?[MyPropertyDescriptor]

'constantInitializer' @ [54:13] ==> val constantInitializer: ConstantValue<Any?> defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeProperty[LocalVariableDescriptor]

'proto' @ [55:13] ==> value-parameter proto: ProtoBuf.Property.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeProperty[ValueParameterDescriptorImpl]

'setExtension' @ [55:19] ==> public final fun <Type : (Any..Any?)> setExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Property..ProtoBuf.Property?), (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)>?), p1: (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?)): (ProtoBuf.Property.Builder..ProtoBuf.Property.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Property.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Value

'protocol' @ [55:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'compileTimeValue' @ [55:41] ==> public final val compileTimeValue: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, ProtoBuf.Annotation.Argument.Value> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'annotationSerializer' @ [55:59] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'valueProto' @ [55:80] ==> public final fun valueProto(constant: ConstantValue<*>): ProtoBuf.Annotation.Argument.Value.Builder defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'constantInitializer' @ [55:91] ==> val constantInitializer: ConstantValue<Any?> defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeProperty[LocalVariableDescriptor]

'build' @ [55:112] ==> public open fun build(): (ProtoBuf.Annotation.Argument.Value..ProtoBuf.Annotation.Argument.Value?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Annotation.Argument.Value.Builder[JavaMethodDescriptor]

'descriptor' @ [60:28] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeEnumEntry[ValueParameterDescriptorImpl]

'annotations' @ [60:39] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedPropertyDescriptor]

'proto' @ [61:13] ==> value-parameter proto: ProtoBuf.EnumEntry.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeEnumEntry[ValueParameterDescriptorImpl]

'addExtension' @ [61:19] ==> public final fun <Type : (Any..Any?)> addExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.EnumEntry..ProtoBuf.EnumEntry?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?), p1: (ProtoBuf.Annotation..ProtoBuf.Annotation?)): (ProtoBuf.EnumEntry.Builder..ProtoBuf.EnumEntry.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.EnumEntry.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Annotation

'protocol' @ [61:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'enumEntryAnnotation' @ [61:41] ==> public final val enumEntryAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.EnumEntry, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'annotationSerializer' @ [61:62] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'serializeAnnotation' @ [61:83] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'annotation' @ [61:103] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeEnumEntry[LocalVariableDescriptor]

'descriptor' @ [66:28] ==> value-parameter descriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeValueParameter[ValueParameterDescriptorImpl]

'annotations' @ [66:39] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'proto' @ [67:13] ==> value-parameter proto: ProtoBuf.ValueParameter.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeValueParameter[ValueParameterDescriptorImpl]

'addExtension' @ [67:19] ==> public final fun <Type : (Any..Any?)> addExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.ValueParameter..ProtoBuf.ValueParameter?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?), p1: (ProtoBuf.Annotation..ProtoBuf.Annotation?)): (ProtoBuf.ValueParameter.Builder..ProtoBuf.ValueParameter.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.ValueParameter.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Annotation

'protocol' @ [67:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'parameterAnnotation' @ [67:41] ==> public final val parameterAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.ValueParameter, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'annotationSerializer' @ [67:62] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'serializeAnnotation' @ [67:83] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'annotation' @ [67:103] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeValueParameter[LocalVariableDescriptor]

'type' @ [72:28] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeType[ValueParameterDescriptorImpl]

'annotations' @ [72:33] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'proto' @ [73:13] ==> value-parameter proto: ProtoBuf.Type.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeType[ValueParameterDescriptorImpl]

'addExtension' @ [73:19] ==> public final fun <Type : (Any..Any?)> addExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.Type..ProtoBuf.Type?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?), p1: (ProtoBuf.Annotation..ProtoBuf.Annotation?)): (ProtoBuf.Type.Builder..ProtoBuf.Type.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.Type.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Annotation

'protocol' @ [73:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'typeAnnotation' @ [73:41] ==> public final val typeAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'annotationSerializer' @ [73:57] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'serializeAnnotation' @ [73:78] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'annotation' @ [73:98] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeType[LocalVariableDescriptor]

'typeParameter' @ [78:28] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeTypeParameter[ValueParameterDescriptorImpl]

'annotations' @ [78:42] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.TypeParameterDescriptor[DeserializedPropertyDescriptor]

'proto' @ [79:13] ==> value-parameter proto: ProtoBuf.TypeParameter.Builder defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeTypeParameter[ValueParameterDescriptorImpl]

'addExtension' @ [79:19] ==> public final fun <Type : (Any..Any?)> addExtension(p0: (GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>..GeneratedMessageLite.GeneratedExtension<(ProtoBuf.TypeParameter..ProtoBuf.TypeParameter?), (MutableList<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>..List<(ProtoBuf.Annotation..ProtoBuf.Annotation?)>?)>?), p1: (ProtoBuf.Annotation..ProtoBuf.Annotation?)): (ProtoBuf.TypeParameter.Builder..ProtoBuf.TypeParameter.Builder?) defined in org.jetbrains.kotlin.serialization.ProtoBuf.TypeParameter.Builder[JavaMethodDescriptor]
Inferred types:
    <Type : (Any..Any?)> -> Annotation

'protocol' @ [79:32] ==> private final val protocol: SerializerExtensionProtocol defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'typeParameterAnnotation' @ [79:41] ==> public final val typeParameterAnnotation: GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> defined in org.jetbrains.kotlin.serialization.SerializerExtensionProtocol[DeserializedPropertyDescriptor]

'annotationSerializer' @ [79:66] ==> public final val annotationSerializer: AnnotationSerializer defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase[PropertyDescriptorImpl]

'serializeAnnotation' @ [79:87] ==> public final fun serializeAnnotation(annotation: AnnotationDescriptor): ProtoBuf.Annotation defined in org.jetbrains.kotlin.serialization.AnnotationSerializer[SimpleFunctionDescriptorImpl]

'annotation' @ [79:107] ==> val annotation: AnnotationDescriptor defined in org.jetbrains.kotlin.serialization.KotlinSerializerExtensionBase.serializeTypeParameter[LocalVariableDescriptor]

